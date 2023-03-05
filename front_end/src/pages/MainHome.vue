<template>
<div class="home">
  <div class="album py-5 bg-light">
    <div class="container">

      <div class="row row-cols-1 row-cols-sm-2 row-cols-md-3 g-3">
        <div class="col" v-for="(item,idx) in state.items" :key="idx">
          <card-item :item="item"></card-item>
        </div>
     
     
      </div>
    </div>
  </div>
</div>

</template>

<script>
import CardItem from '@/components/CardItem.vue'
import axios from "axios";
import { reactive } from 'vue';
export default {
  components: { CardItem },
  name : "MainHome",
  setup() {
    const state = reactive({
      items: []
    })
    
    axios.get("/api/items").then(result =>{
      state.items = result.data;
    });
    return {state}
  }
}
</script>

<style scoped>

</style>