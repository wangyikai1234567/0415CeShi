package wangyikai.bwie.com.a0415ceshi.bean;

import java.util.List;

/**
 * date: 2017/4/15.
 * author: 王艺凯 (lenovo )
 * function:
 */

public class Bean {

    /**
     * status : 10000
     * data : [{"id":"214","brand_id":"148","title":"(三诺)三诺安稳血糖试纸 ","apply":"血糖试纸","buy_price":"52.00","old_price":"52.00","size":"50条/瓶","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/7c3313ed7b238be9.png","cate_id":"2","baike":"血糖试纸","sale_num":"2","cart_num":0},{"id":"70","brand_id":"55","title":"(运佳黄浦制药) 炉甘石洗剂","apply":"本品用于急性瘙痒性皮肤病，如湿疹和痱子。","buy_price":"7.50","old_price":"7.50","size":"100ml/瓶","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/0337dcaacd724a17.png","cate_id":"54","baike":"皮肤瘙痒症,痱子,湿疹,","sale_num":"3","cart_num":0},{"id":"153","brand_id":"105","title":"(华润三九) 999皮炎平（复方醋酸地塞米松乳膏）","apply":"用于局限性搔痒症、神经性皮炎、接触性皮炎、脂溢性皮炎以及慢性湿疹。","buy_price":"18.00","old_price":"18.00","size":"30g","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/dd405c4815cf70b7.jpg","cate_id":"54,56","baike":"瘙痒症，神经性皮炎，皮炎，接触性皮炎，脂溢性皮炎，慢性湿疹","sale_num":"0","cart_num":"1"},{"id":"156","brand_id":"108","title":"(滇虹药业) 皮康王（复方酮康唑乳膏）","apply":"本品主要用于皮肤浅表真菌感染，如手癣、足癣、体癣、股癣等。","buy_price":"10.30","old_price":"10.30","size":"10g","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/e1d0626e405f738d.jpg","cate_id":"23","baike":"足癣，真菌性甲沟炎，体癣，手足癣，股癣，真菌性皮肤病，手癣","sale_num":"1","cart_num":0},{"id":"164","brand_id":"114","title":"(曼秀雷敦) 复方薄荷脑软膏","apply":"\u200b用于由伤风感冒所致的鼻塞、昆虫叮咬、皮肤皲裂、轻度烧烫伤、擦伤、晒伤及皮肤瘙痒等。","buy_price":"16.00","old_price":"16.00","size":"10g","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/4a4630a59c21952e.jpg","cate_id":"54","baike":"伤风，感冒，晒伤，鼻塞，皮肤皲裂，烫伤","sale_num":"2","cart_num":0},{"id":"131","brand_id":"53","title":"(同仁堂) 当归苦参丸","apply":"凉血，祛湿。用于血燥湿热引起：头面生疮，粉刺疙瘩，湿疹刺痒，酒糟鼻赤。","buy_price":"15.48","old_price":"15.48","size":"6g*6瓶/盒","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/6a9e068cf64742af.jpeg","cate_id":"48","baike":"酒糟鼻，痤疮，湿疹","sale_num":"0","cart_num":0},{"id":"165","brand_id":"115","title":"(达仁堂) 京万红软膏","apply":"活血解毒，消肿止痛，去腐生肌。用于轻度水、火烫伤，疮疡肿痛，创面溃烂。","buy_price":"18.60","old_price":"18.60","size":"20g","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/b30d722b0e776688.jpg","cate_id":"49","baike":"肛周湿疹，烫伤，痔疮，肛裂","sale_num":"0","cart_num":0},{"id":"162","brand_id":"111","title":"(成天药业) 足光散","apply":"清热燥湿，杀虫敛汗。用于湿热下注所致的角化型手足癣及臭汗症。","buy_price":"10.00","old_price":"10.00","size":"40g*3包","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/65b4e7493ea55dbd.jpg","cate_id":"48","baike":"湿热，足癣，臭汗，湿热下注，手足癣，臭汗症","sale_num":"0","cart_num":0},{"id":"154","brand_id":"106","title":"(美克)联苯苄唑乳膏","apply":"用于手皮肤真菌、酵母菌、霉菌、和其他皮肤菌和糠秕孢子菌引起的皮肤真菌病，以及微小棒状杆菌引起的感染。如：脚癣、手癣、体癣、股癣、花斑癣、表皮念珠菌病。","buy_price":"17.20","old_price":"17.20","size":"10g/支","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/ddb435a258dbd8d6.jpg","cate_id":"23","baike":"手癣，体癣，股癣，花斑癣，阴道炎，足癣","sale_num":"1","cart_num":0},{"id":"177","brand_id":"121","title":"(梁介福药业) 斧标正红花油","apply":"\u200b温经散寒，活血止痛。用于风湿骨痛，筋骨酸痛，扭伤瘀肿，跌打损伤，蚊虫叮咬。","buy_price":"16.80","old_price":"16.80","size":"22ml","thumb":"https://ohdrjnjvc.qnssl.com/attached/drugs/f9b51dab26cae8d4.jpg","cate_id":"49","baike":"蚊子叮咬，风湿性疾病，运动创伤，韧带损伤","sale_num":"0","cart_num":0}]
     * count : 155
     */

    private int status;
    private String count;
    private List<DataBean> data;

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getCount() {
        return count;
    }

    public void setCount(String count) {
        this.count = count;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {
        /**
         * id : 214
         * brand_id : 148
         * title : (三诺)三诺安稳血糖试纸
         * apply : 血糖试纸
         * buy_price : 52.00
         * old_price : 52.00
         * size : 50条/瓶
         * thumb : https://ohdrjnjvc.qnssl.com/attached/drugs/7c3313ed7b238be9.png
         * cate_id : 2
         * baike : 血糖试纸
         * sale_num : 2
         * cart_num : 0
         */

        private String id;
        private String brand_id;
        private String title;
        private String apply;
        private String buy_price;
        private String old_price;
        private String size;
        private String thumb;
        private String cate_id;
        private String baike;
        private String sale_num;
        private int cart_num;

        public String getId() {
            return id;
        }

        public void setId(String id) {
            this.id = id;
        }

        public String getBrand_id() {
            return brand_id;
        }

        public void setBrand_id(String brand_id) {
            this.brand_id = brand_id;
        }

        public String getTitle() {
            return title;
        }

        public void setTitle(String title) {
            this.title = title;
        }

        public String getApply() {
            return apply;
        }

        public void setApply(String apply) {
            this.apply = apply;
        }

        public String getBuy_price() {
            return buy_price;
        }

        public void setBuy_price(String buy_price) {
            this.buy_price = buy_price;
        }

        public String getOld_price() {
            return old_price;
        }

        public void setOld_price(String old_price) {
            this.old_price = old_price;
        }

        public String getSize() {
            return size;
        }

        public void setSize(String size) {
            this.size = size;
        }

        public String getThumb() {
            return thumb;
        }

        public void setThumb(String thumb) {
            this.thumb = thumb;
        }

        public String getCate_id() {
            return cate_id;
        }

        public void setCate_id(String cate_id) {
            this.cate_id = cate_id;
        }

        public String getBaike() {
            return baike;
        }

        public void setBaike(String baike) {
            this.baike = baike;
        }

        public String getSale_num() {
            return sale_num;
        }

        public void setSale_num(String sale_num) {
            this.sale_num = sale_num;
        }

        public int getCart_num() {
            return cart_num;
        }

        public void setCart_num(int cart_num) {
            this.cart_num = cart_num;
        }
    }
}
