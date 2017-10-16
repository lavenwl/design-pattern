package j2ee_pattern.composite_entity;

/**
 * @Description:
 * @Author: laven
 * @Date: 2017/10/16 下午5:03
 */
public class CompositeEntity {
    private  CoarseGrainedObject cgo = new CoarseGrainedObject();

    public void setData(String data1, String data2){
        cgo.setData(data1, data2);
    }

    public String[] getData(){
        return cgo.getData();
    }
}
