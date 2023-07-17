package ssafy.project.jobterview.domain;

import lombok.*;
import org.hibernate.annotations.ColumnDefault;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
public class Room extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "room_id")
    private Long roomId;

    @OneToMany(mappedBy = "room")
    private List<RoomChat> roomChatList = new ArrayList<>();

    @Column(name = "in_meeting", nullable = false)
    @ColumnDefault("false")
    private boolean inMeeting;

    @Column(name = "now_member", nullable = false)
    @ColumnDefault("1")
    private int nowMember;

    @Column(name = "max_member", nullable = false)
    @ColumnDefault("1")
    private int maxMember;

    @Column(name = "room_name")
    private String roomName;
}
