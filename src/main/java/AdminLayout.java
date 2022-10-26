public class AdminLayout implements Layout {
    public String render(){
        return "layout admin";
    }

    public String updateRender(String str){
        return "layout admin " + str;
    }
}
