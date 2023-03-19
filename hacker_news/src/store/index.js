import Vuex from 'vuex';

import mutations from './mutations.js';
import actions from './actions.js';
export const store = new Vuex.Store({
  state: {
    news: [],
    jobs: [],
    ask : [],

  },
  mutations: mutations,
  actions: actions
})