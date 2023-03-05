import MainHome from "@/pages/MainHome";
import MainLogin from "@/pages/MainLogin";
import { createRouter, createWebHistory } from "vue-router";
const routes = [
  { path: "/", component: MainHome },
  { path: "/login", component: MainLogin },
];

const router = createRouter({
  history: createWebHistory(),
  routes,
});

export default router;
