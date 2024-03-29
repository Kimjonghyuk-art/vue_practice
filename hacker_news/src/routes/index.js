
import {createWebHistory, createRouter} from 'vue-router';
import NewsView from '../views/NewsView.vue';
import AskView from '../views/AskView.vue';
import JobsView from '../views/JobsView.vue';
import ItemView from '../components/ItemView.vue';
import UserView from '../components/UserView.vue';


const routes = [
  {
    path: '/',
    redirect: '/news',
  },
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
  },
  {
    path: '/user',
    component : UserView
  },
  {
    path: '/item',
    component : ItemView
  },

]

const router = createRouter({
  history: createWebHistory(),
  routes
})

export default router