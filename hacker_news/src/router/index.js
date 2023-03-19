
import {createWebHistory, createRouter} from 'vue-router';
import NewsView from '../views/NewsView.vue';
import AskView from '../views/AskView.vue';
import JobsView from '../views/JobsView.vue';


const routes = [
  {
    path: '/news',
    component : NewsView
  },
  {
    path: '/ask',
    component : AskView
  },
  {
    path: '/jobs',
    component : JobsView
  }
]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router