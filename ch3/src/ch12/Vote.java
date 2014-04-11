package ch12;

import java.io.*;

class Student{
	private String name;
	private int voteNum;
	private int id;
	Student(String name,int id)
	{
		this.setName(name);
		this.setId(id);
		this.setVoteNum(0);
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setVoteNum(int voteNum)
	{
		this.voteNum=voteNum;
	}
	public String getName()
	{
		return this.name;
	}
	public int getId()
	{
		return this.id;
	}
	public int getVoteNum()
	{
		return this.voteNum;
	}
}

class InputData{
	private BufferedReader buf=null;
	InputData()
	{
		this.buf=new BufferedReader(new InputStreamReader(System.in));  //�ַ���
	}
	public String getString(String info)
	{
		String temp=null;
		System.out.print(info);
		try
		{
			temp=this.buf.readLine();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		return temp;
	}
	public int getInt(String info,String err)
	{
		int temp=0;
		String str=null;
		boolean flag=true;
		while(flag)
		{
			str=this.getString(info);
			if(str.matches("^[0-4]{1}$"))
			{
				temp=Integer.parseInt(str);
				flag=false;
			}
			else
			{
				System.out.println(err);
			}
		}
		return temp;		
	}
	
}
class Operate{
	public static void show()
	{
		System.out.println();
	}
}

public class Vote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student [] stdArray=new Student[4];
		stdArray[0]=new Student("����",1);
		stdArray[1]=new Student("����",2);
		stdArray[2]=new Student("����",3);
		stdArray[3]=new Student("����",4);
		for(int i=0;i<stdArray.length;i++)
		{
			StringBuffer buf=new StringBuffer();
			buf.append(stdArray[i].getId());
			buf.append("��");
			buf.append(stdArray[i].getName());
			buf.append("��");
			buf.append(stdArray[i].getVoteNum());
			buf.append("Ʊ��");
			System.out.println(buf);
		}
		int temp=0;
		InputData inputData=new InputData();
		while(true)
		{
			temp=inputData.getInt("������೤��ѡ�˴��ţ�����0��������", "��ѡƱ��Ч����������ȷ�ĺ�ѡ�˴��ţ�");
			if(temp==0)
			{
				for(int i=0;i<stdArray.length;i++)
				{
					StringBuffer buf=new StringBuffer();
					buf.append(stdArray[i].getId());
					buf.append("��");
					buf.append(stdArray[i].getName());
					buf.append("��");
					buf.append(stdArray[i].getVoteNum());
					buf.append("Ʊ��");
					System.out.println(buf);
				}
				int maxVote=0;
				int maxId=0;
				String maxName=null;
				for(int j=0;j<stdArray.length;j++)
				{
					if(maxVote<stdArray[j].getVoteNum())
					{
						maxVote=stdArray[j].getVoteNum();
						maxId=stdArray[j].getId();
						maxName=stdArray[j].getName();
					}
				}
				System.out.println("���ͶƱ���"+maxName+maxVote+"Ʊ��ѡ��");
				System.exit(1);
			}
			else
			{
				int voteNum=stdArray[temp-1].getVoteNum();
				stdArray[temp-1].setVoteNum(++voteNum);
			}
		}
	}

}
