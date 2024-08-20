import axios from "axios"

export const instance = axios.create({
    baseURL: "http://localhost:8080/api/v1",
    withCredentials: true
})

export const api = axios.create({
    baseURL: "http://localhost:8080/auth",
    withCredentials: true
})