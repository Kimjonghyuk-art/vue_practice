import { createApp } from "vue";
import App from "./App.vue";
import { createRouter, createWebHistory } from "vue-router";
import MainHome from "@/pages/MainHome";
import MainLogin from "@/pages/MainLogin";

const routes = [
  { path: "/", component: MainHome },
  { path: "/login", component: MainLogin },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});
createApp(App).use(router).mount("#app");
