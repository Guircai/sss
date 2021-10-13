var vue = new Vue({
    el:'#app',
    data:{
        userList:[]
    },
    methods:{
        findAll:function (){
            axios.get("/user/findAll").then((response)=>{
                this.userList = response.data;
            })
        },
        findOne:function (){
            axios.get("/user/findOne"+id).then((response)=>{
                this.user = response.data;
            })
        }
    },
    created:function (){
        this.findAll();
    }
})