/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/**
 *
 * @author hermas
 */
public class VectorQuantization extends javax.swing.JFrame {

    /**
     * Creates new form VectorQuantization
     */
    public VectorQuantization() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("filePath");

        jLabel2.setText("#Vector");

        jLabel3.setText("row");

        jLabel4.setText("col");

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jButton1.setText("compress");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("decompress");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 103, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(jTextField4)
                    .addComponent(jTextField2)
                    .addComponent(jTextField1)
                    .addComponent(jTextField3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        filepath=jTextField1.getText();
        num=Integer.parseInt(jTextField2.getText());
        row=Integer.parseInt(jTextField3.getText());
        col=Integer.parseInt(jTextField4.getText());
        compress();
        jTextField1.setText("i finish compress");
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        try {
            decompress();
            jTextField2.setText("i finsh decompress");
            // TODO add your handling code here:
        } catch (IOException ex) {
            Logger.getLogger(VectorQuantization.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VectorQuantization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VectorQuantization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VectorQuantization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VectorQuantization.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VectorQuantization().setVisible(true);
            }
        });
    }
    public  void writeImage(int[][] pixels,String outputFilePath) throws IOException
	 {
	     File fileout=new File(outputFilePath);
	     BufferedImage image2=new BufferedImage(imagecol,imagerow,BufferedImage.TYPE_INT_RGB );
	     for(int x=0;x<imagecol ;x++)
	     {
	    	 for(int y=0;y<imagerow;y++)
	         {
	    		 image2.setRGB(x,y,(pixels[y][x]<<16)|(pixels[y][x]<<8)|(pixels[y][x]));
	         }
	      }
	   ImageIO.write(image2, "jpg", fileout);

	   
	 }
    public void compress()
	{
		intialization();
		while(true)
		{
			ArrayList<Node> t=new ArrayList<>();
			leafNode(root, t);
			if(t.size()>=num)
				break;
			for(int i=0;i<t.size();i++)
			{
				double [][]res=average(t.get(i).me);
				double [][][] v=splite(res);
				spliteNode(t.get(i), v);
			}
			nearestVector();
		}
		//////////////////////////////////////////////////////
		//bydrb hena
		ArrayList<Node> t=new ArrayList<>();
		leafNode(root, t);
		while(true){
			int counter=0;
			double [][][]newcodebook=new double[num][row][col];
			for(int i=0;i<num;i++)
			{
				newcodebook[i]=average(t.get(i).me);
				if(equal(t.get(i).codebook,newcodebook[i]))
					counter++;
			}if(counter>=num)
				break;
			else
				change(newcodebook);
		
		}
		codebook=new double[num][row][col];
		for(int i=0;i<t.size();i++)
			codebook[i]=t.get(i).codebook;
		int y=0;
		compressedImg=new int[imagerow/row][imagecol/col];
		for(int i=0;i<imagerow/row;i++)
		{
			for(int k=0;k<imagecol/col;k++)
			{
				double [][]use=image.get(y);
				int index=-1,error=1000000;
				for(int m=0;m<num;m++)
				{
					double[][]curr=codebook[m];
					int currerror=0;
					for(int l=0;l<row;l++)
					{
						for(int n=0;n<col;n++)
						{
							currerror+=(Math.abs(curr[l][n]-use[l][n]));
						}
					}
					if(error>currerror)
					{
						error=currerror;
						index=m;
					}
				}
				y++;
				compressedImg[i][k]=index;
			}
		}
		callprint();
				
	}
	public void callprint()
	{
		System.out.println("show");
	}
	public boolean search(ArrayList<Node> in,double [][]out)
	{
		for(int i=0;i<in.size();i++)
		{
			Node temp=in.get(i);
			for(int j=0;j<temp.me.size();j++)
			{
				if(equal(out,temp.me.get(j)))
					return true;
			}
		}
			
		return false;
		
	}
	public void change(double [][][]newcodebook)
	{
		ArrayList<Node>arr=new ArrayList<>();
		leafNode(root, arr);
		for(int i=0;i<arr.size();i++)
		{
			arr.get(i).codebook=newcodebook[i];
		}
		nearestVector();	
	}
	public boolean equal(double [][]n,double [][]m)
	{
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(n[i][j]!=m[i][j])
					return false;
			}
		}
		return true;
	}
	public void intialization()
	{
		double [][]p=readImage();
		//double [][]p={{1,2,7,9,4,11},{3,4,6,6,12,12},{4,9,15,14,9,9},{10,10,20,18,8,8},{4,3,17,16,1,4},{4,5,18,18,5,6}};
		divide(p);
		root=new Node();
		root.me=image;
	}
	public void nearestVector()
	{
		ArrayList<Node> code=new ArrayList<>();
		leafNode(root,code);
		for(int i=0;i<code.size();i++)
		{
			code.get(i).me=new ArrayList<>();
		}
		for(int i=0;i<image.size();i++)
		{
			double [][]use=image.get(i);
			int index=-1;double error=1000000;
			for(int j=0;j<code.size();j++)
			{
				double[][]curr=code.get(j).codebook;
				double currerror=0;
				for(int k=0;k<row;k++)
				{
					for(int m=0;m<col;m++)
					{
						currerror+=(Math.abs(curr[k][m]-use[k][m]));
	
					}
				}
				if(error>currerror)
				{
					error=currerror;
					index=j;
				}
			}
			if(index==-1)
				System.out.println("ERROR");
			Node to=code.get(index);
			to.me.add(use);
		}
		
	}

	public void leafNode(Node curr,ArrayList<Node> vec)
	{
		if(curr==null)
			return;
		if(curr.left==null)
		{
			vec.add(curr);
		}
		leafNode(curr.left, vec);
		leafNode(curr.right, vec);
	}
	public void spliteNode(Node core,double [][][]fi)
	{
		Node left =new Node();
		left.codebook=fi[0];
		Node right =new Node();
		right.codebook=fi[1];
		core.left=left;
		core.right=right;
	}
	
	public double[][][]splite(double [][]code)
	{
		double[][][] res=new double[2][row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if((int)code[i][j]==code[i][j])
				{
					res[0][i][j]=(int) (code[i][j]-1);
					res[1][i][j]=(int) (code[i][j]+1);
				}
				else
				{
					res[0][i][j]=(int) (code[i][j]);
					res[1][i][j]=(int) (code[i][j])+1;
				}
				
			}
		}
		return res;
	}
	public double [][]average(ArrayList<double [][]> pixels)
	{
		double res[][]=new double[row][col];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				res[i][j]=0;
				for(int k=0;k<pixels.size();k++)
				{
					double [][]temp=pixels.get(k);
					res[i][j]+=temp[i][j];
				}
				res[i][j]/=pixels.size();
				NumberFormat formatter = new DecimalFormat("#0.0");     
				res[i][j]=Double.parseDouble(formatter.format(res[i][j]));
			}
		}
		return res;
	}
	public void divide(double pixels[][])
	{
		for(int m=0;m<imagerow/row;m++)
		{
			for(int k=0;k<imagecol/col;k++)
			{
				double data[][]=new double [row][col];
				for(int i=0;i<row;i++)
				{
					for(int j=0;j<col;j++)
					{
						data[i][j]=pixels[i+m*row][j+k*col];
					}
				}
				image.add(data);
			}
		}
	}
	 public  double[][] readImage()
	 {
	     File file=new File(filepath);
         BufferedImage image=null;
         try {
	            image=ImageIO.read(file); 
	            
         }catch (IOException e){
	            e.printStackTrace();
	        }

	          imagecol=image.getWidth();
	          imagerow=image.getHeight();
	          double[][] pixels=new double[imagerow][imagecol];

	        for(int x=0;x<imagecol;x++)
	        {
	            for(int y=0;y<imagerow;y++)
	            {
	                int rgb=image.getRGB(x, y);
	                int alpha=(rgb >> 24) & 0xff;
	                int r = (rgb >> 16) & 0xff;
	                int g = (rgb >> 8) & 0xff;
	                int b = (rgb >> 0) & 0xff;

	                pixels[y][x]=r;
	            }
	        }

	        return pixels;
	    }
	 public void decompress() throws IOException
	 {
		 int Imag2D [][]=new int [imagerow][imagecol];
		 for(int i=0;i<imagerow/row;i++)
		 {
			 for(int j=0;j<imagecol/col;j++)
			 {
				 int index=compressedImg[i][j];
				 double me[][]=codebook[index];
				 for(int k=0;k<row;k++)
				 {
					 for(int m=0;m<col;m++)
					 {
						 Imag2D[k+k*i][m+m*j]=(int) me[k][m];
					 }
				 }
			 }
		 }
		 System.out.println("i am finished decompress");
		 writeImage(Imag2D,"mai.jpg");
		
	 }
    	String filepath;
	ArrayList<double [][]> image=new ArrayList<double[][]>();
	int row,col,num;
	int imagerow,imagecol;
	Node root;
	double[][][] codebook;
	int compressedImg[][];

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
