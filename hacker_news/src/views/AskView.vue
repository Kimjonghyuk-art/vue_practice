<template>
  <div>
    <div v-for="ask in this.$store.state.ask" :key="ask">{{ ask }}</div>
  </div>
</template>

<script>
export default {

  created() {
    this.$store.dispatch('FETCH_ASK');
  }
}
</script>

<style>

</style>