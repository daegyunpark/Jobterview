import {apiTest} from "./apiTest";
async function join(member,success,fail){
    await apiTest.post(`/member/join`,member
    ).then(success).catch(fail);
}

export {join};