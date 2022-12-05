import java.awt.*;
import java.awt.event.*;
import java.applet.*;
public class colour extends Applet implements ActionListener,ItemListener
{
    Button[] colors;
    Checkbox fg,bg;
    TextArea text;
    CheckboxGroup cbg;
    Panel bpl,cpl,ppl;
    String colour;
    public void init()
    {
        bpl=new Panel();
        bpl.setLayout(new GridLayout(3,3));
        colors=new Button[9];
        colors[0]=new Button("RED");
        colors[1]=new Button("GREEN");
        colors[2]=new Button("BLUE");
        colors[3]=new Button("SKYBLU");
        colors[4]=new Button("ORANGE");
        colors[5]=new Button("WHITE");
        colors[6]=new Button("BLACK");
        colors[7]=new Button("YELLOW");
        colors[8]=new Button("PINK");
        for(int i=0;i<9;i++)
        {
            colors[i].addActionListener(this);
            bpl.add(colors[i]);
        }
        cpl=new Panel();
        cpl.setLayout(new FlowLayout());
        cbg=new CheckboxGroup();
        fg=new Checkbox("ForeGround",cbg,true);
        bg=new Checkbox("BackGround",cbg,true);
        fg.addItemListener(this);
        bg.addItemListener(this);
        cpl.add(fg);
        cpl.add(bg);
        text=new TextArea(10,40);
        text.setFont(new Font("Garamond",Font.BOLD,20));
        ppl=new Panel();
        ppl.setLayout(new BorderLayout());
        ppl.add(text,BorderLayout.NORTH);
        ppl.add(cpl,BorderLayout.CENTER);
        ppl.add(bpl,BorderLayout.WEST);
        add(ppl);
    }
    public void itemStateChanged(ItemEvent ie)
    {
    }
    public void actionPerformed(ActionEvent ae)
    {
        colour=ae.getActionCommand();
        if(fg.getState()==true)
            text.setBackground(getColour());
        if(bg.getState()==true)
            setBackground(getColour());
    }
    public Color getColour()
    {
        Color mycolor=null;
        if(colour.equals("RED"))
            mycolor=Color.red;
        if(colour.equals("GREEN"))
            mycolor=Color.green;
        if(colour.equals("BLUE"))
            mycolor=Color.blue;
        if(colour.equals("SKYBLU"))
            mycolor=Color.cyan;
        if(colour.equals("ORANGE"))
            mycolor=Color.orange;
        if(colour.equals("WHITE"))
            mycolor=Color.white;
        if(colour.equals("BLACK"))
            mycolor=Color.black;
        if(colour.equals("YELLOW"))
            mycolor=Color.yellow;
        if(colour.equals("PINK"))
            mycolor=Color.pink;
        return mycolor;
    }
}