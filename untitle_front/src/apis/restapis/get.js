import { api, instance } from "../utils/instance";

export const get = async () => {
    let response = null;
    try {
        response = await instance.get("/rest")
    } catch (e) {
        console.error(e);
    }
    return response;
}

export async function getAll() {
    let response = null;
    try {
        response = await api.get("/user");
    } catch (e) {
        // response = e.response;
        console.error(e);
    }
    return response;
}