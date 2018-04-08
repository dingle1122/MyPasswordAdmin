package cn.lzyike.test;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class TestInput {

	public static void main(String[] args) {
		System.out.println("开始。。。");
		run();
		System.out.println("结束。。。");
	}
	
	public static void run() {
		int number=0;
		List<String> questions=new ArrayList<String>();
		questions.add("如果半夜里听到有人敲门，你会认为那是坏消息，或有麻烦发生了吗？");
		questions.add("你随身带着安全别针或一条绳子，以防万一衣服或别的东西裂开了吗?");
		questions.add("你跟人打过赌吗？");
		questions.add("你曾梦想过赢了彩券或继承一笔大遗产吗？");
		questions.add("出门的时候，你经常带着一把伞吗？");
		questions.add("你把收入的大部分用来买保险吗？");
		questions.add("度假时，你曾经没预定旅馆就出门了吗？");
		questions.add("你觉得大部分的人都很诚实吗？");
		questions.add("度假时，把家门钥匙托朋友或邻居保管，你会将贵重物品事先锁起来吗？");
		questions.add("对于新的计划，你总是非常热衷吗？");
		questions.add("当朋友表示一定奉还时，你会答应借钱给他吗？");
		questions.add("大家计划去野餐或烤肉时，如果下雨，你仍会照原定计划准备吗？");
		questions.add("在一般情况下，你信任别人吗？");
		questions.add("如果有重要的约会，你会提早出门，以防塞车、抛锚或别的状况发生吗？");
		questions.add("如果医生叫你做一次身体检查，你会怀疑自己可能有病吗？");
		questions.add("每天早晨起床时，你会期待又是美好一天的开始吗？");
		questions.add("收到意外的来函或包裹时，你会特别开心吗？");
		questions.add("你会随心所欲地花钱，等花完以后再发愁吗？");
		questions.add("上飞机前，你会买旅行保险吗？");
		questions.add("你对未来的十二个月充满希望吗？");
		
		if(isStart("心理测试小程序,测试中请输入YIKE","YIKE")) {
			int i=1;
			for(String q:questions) {
				number+=showInput(i+++"、"+q)==1? 0:1;
			}
			String info="";
			if(number<8) {
				info="分数为0--7:你是个标准的悲观主义者，看人生总是看到不好的那一面。身为悲观者，" +
					"唯一的好处是，你从来不往好处想，所以你也就很少失望过。然而，以悲观的态度面对人生，却有太多的不利；" +
					"你随时会担心失败，因此宁愿不去尝试新的事物，尤其当遇到困难时，你的悲观会让你觉得人生更灰暗、更无法接受。" +
					"悲观会使人产生沮丧、困惑、恐惧、气愤和挫折的心理。解决这种状况的唯一办法，" +
					"是以积极的态度来面对每一件事或每一个人，即使你偶尔仍会感到失望，但逐渐地，你会对人生增加信心，胜过原来消极态度带给你的影响。";
			}else if(number<15){
				info="分数为8--14:你对人生的态度比较正常。不过，你仍然可以再进一步，" +
					"只要你学会怎样以积极和乐观的态度来应付人生中无法避免的起伏情况。";
			}else if(number<21) {
				info="分数为15--20:你是个标准的乐观主义者。你看人生总是看到好的那一面，" +
				 	"将失望和困难摆到旁边去。乐观，使人更活的有劲，不过，要记住，有时候过分乐观，也会造成你对事情掉以轻心，结果反而误事。";
			}else {
				info="系统计分异常";
			}
			info="答题完成，你的分数是"+number+"\n"+info;
			System.out.println(info);
			showInput(info);
		}
	}
	
	public static boolean isStart(String info,String val) {
		String value=JOptionPane.showInputDialog(info);
		return val.equals(value);
	}
	
	public static int showInput(String info) {
		return JOptionPane.showConfirmDialog(null, info, "yike.cn",JOptionPane.OK_OPTION);
	}
}
