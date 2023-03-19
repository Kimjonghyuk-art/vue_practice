import { fetchNewsList,fetchAskList,fetchJobsList } from '../api/index.js';
export default {
  FETCH_NEWS(context) {
    fetchNewsList()
    .then(function(response) {
      context.commit('SET_NEWS',response.data);
    })
    .catch()
  },
  FETCH_JOBS(context) {
    fetchJobsList()
    .then(function(response) {
      context.commit('SET_JOBS',response.data);
    })
    .catch()
  },
  FETCH_ASK(context) {
    fetchAskList()
    .then(function(response) {
      context.commit('SET_ASK',response.data);
    })
  }
}