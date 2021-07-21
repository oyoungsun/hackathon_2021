package org.appinventor;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.FirebaseDB;
import java.util.ArrayList;
import java.util.List;
class Screen1 extends Form implements HandlesEventDispatching {
  private HorizontalArrangement searchBar;
  private TextBox textbox2;
  private Image image1;
  private VerticalScrollArrangement VerticalScrollArrangement1;
  private HorizontalArrangement HorizontalArrangement3;
  private Image Image1;
  private VerticalArrangement VerticalArrangement1;
  private Label Label1;
  private Label Label5;
  private HorizontalArrangement HorizontalArrangement4;
  private Image Image5;
  private VerticalArrangement VerticalArrangement2;
  private Label Label6;
  private Label Label7;
  private HorizontalArrangement HorizontalArrangement5;
  private Image Image2;
  private VerticalArrangement VerticalArrangement3;
  private Label Label2;
  private Label Label8;
  private HorizontalArrangement HorizontalArrangement6;
  private Image Image3;
  private VerticalArrangement VerticalArrangement4;
  private Label Label3;
  private Label Label9;
  private HorizontalArrangement HorizontalArrangement7;
  private Image Image4;
  private VerticalArrangement VerticalArrangement5;
  private Label Label4;
  private TextBox textbox1;
  private HorizontalArrangement HorizontalArrangement1;
  private Button home;
  private Button search;
  private Button chat;
  private Button my;
  private FirebaseDB FirebaseDB1;
  private ArrayList<Object> list;
  protected void $define() {
    this.AboutScreen("MAIN");
    this.AlignHorizontal(3);
    this.AlignVertical(2);
    this.AppName("ONGSIME");
    this.BackgroundColor(0xFFF2F2F2);
    this.Icon("icon_HowRU.png");
    this.Title("Main");
    searchBar = new HorizontalArrangement(this);
    searchBar.Width(LENGTH_FILL_PARENT);
    searchBar.Visible(false);
    textbox2 = new TextBox(searchBar);
    textbox2.BackgroundColor(0xFFCCCCCC);
    textbox2.Width(-1080);
    textbox2.Hint("텍스트박스1 의 힌트");
    textbox2.Text("키워드 입력");
    image1 = new Image(searchBar);
    image1.Height(LENGTH_FILL_PARENT);
    image1.Width(-1010);
    VerticalScrollArrangement1 = new VerticalScrollArrangement(this);
    VerticalScrollArrangement1.Height(-1070);
    VerticalScrollArrangement1.Width(LENGTH_FILL_PARENT);
    HorizontalArrangement3 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement3.Height(-1015);
    HorizontalArrangement3.Width(LENGTH_FILL_PARENT);
    Image1 = new Image(HorizontalArrangement3);
    Image1.Height(-1015);
    Image1.Width(-1015);
    VerticalArrangement1 = new VerticalArrangement(HorizontalArrangement3);
    VerticalArrangement1.Height(LENGTH_FILL_PARENT);
    VerticalArrangement1.Width(LENGTH_FILL_PARENT);
    Label1 = new Label(VerticalArrangement1);
    Label1.Text("TEST1");
    Label5 = new Label(VerticalArrangement1);
    Label5.Text("Text for Label5");
    HorizontalArrangement4 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement4.Height(-1015);
    HorizontalArrangement4.Width(LENGTH_FILL_PARENT);
    Image5 = new Image(HorizontalArrangement4);
    Image5.Height(-1015);
    Image5.Width(-1015);
    VerticalArrangement2 = new VerticalArrangement(HorizontalArrangement4);
    VerticalArrangement2.Height(LENGTH_FILL_PARENT);
    VerticalArrangement2.Width(LENGTH_FILL_PARENT);
    Label6 = new Label(VerticalArrangement2);
    Label6.Text("TEST1");
    Label7 = new Label(VerticalArrangement2);
    Label7.Text("Text for Label5");
    HorizontalArrangement5 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement5.Height(-1015);
    HorizontalArrangement5.Width(LENGTH_FILL_PARENT);
    Image2 = new Image(HorizontalArrangement5);
    Image2.Height(-1015);
    Image2.Width(-1015);
    VerticalArrangement3 = new VerticalArrangement(HorizontalArrangement5);
    VerticalArrangement3.Height(LENGTH_FILL_PARENT);
    VerticalArrangement3.Width(LENGTH_FILL_PARENT);
    Label2 = new Label(VerticalArrangement3);
    Label2.Text("TEST1");
    Label8 = new Label(VerticalArrangement3);
    Label8.Text("Text for Label5");
    HorizontalArrangement6 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement6.Height(-1015);
    HorizontalArrangement6.Width(LENGTH_FILL_PARENT);
    Image3 = new Image(HorizontalArrangement6);
    Image3.Height(-1015);
    Image3.Width(-1015);
    VerticalArrangement4 = new VerticalArrangement(HorizontalArrangement6);
    VerticalArrangement4.Height(-1015);
    VerticalArrangement4.Width(LENGTH_FILL_PARENT);
    Label3 = new Label(VerticalArrangement4);
    Label3.Text("TEST1");
    Label9 = new Label(VerticalArrangement4);
    Label9.Text("Text for Label5");
    HorizontalArrangement7 = new HorizontalArrangement(VerticalScrollArrangement1);
    HorizontalArrangement7.Height(-1015);
    HorizontalArrangement7.Width(LENGTH_FILL_PARENT);
    Image4 = new Image(HorizontalArrangement7);
    Image4.Height(-1015);
    Image4.Width(-1015);
    VerticalArrangement5 = new VerticalArrangement(HorizontalArrangement7);
    VerticalArrangement5.Height(LENGTH_FILL_PARENT);
    VerticalArrangement5.Width(LENGTH_FILL_PARENT);
    Label4 = new Label(VerticalArrangement5);
    Label4.Text("TEST1");
    textbox1 = new TextBox(VerticalArrangement5);
    textbox1.BackgroundColor(0xFFCCCCCC);
    textbox1.Width(-1080);
    textbox1.Hint("텍스트박스1 의 힌트");
    textbox1.Text("키워드 입력");
    HorizontalArrangement1 = new HorizontalArrangement(this);
    HorizontalArrangement1.AlignHorizontal(3);
    HorizontalArrangement1.AlignVertical(3);
    HorizontalArrangement1.Width(LENGTH_FILL_PARENT);
    home = new Button(HorizontalArrangement1);
    home.Width(-1020);
    home.Text("홈  ");
    search = new Button(HorizontalArrangement1);
    search.Width(-1020);
    search.Text("검색");
    chat = new Button(HorizontalArrangement1);
    chat.Width(-1020);
    chat.Text("채팅");
    my = new Button(HorizontalArrangement1);
    my.Width(-1020);
    my.Text("마이페이지");
    FirebaseDB1 = new FirebaseDB(this);
    FirebaseDB1.ProjectBucket(SMCAI_HowRUApp_S);
    list = ;
    EventDispatcher.registerEventForDelegation(this, "ClickEvent", "Click" );
    EventDispatcher.registerEventForDelegation(this, "InitializeEvent", "Initialize" );
  }
  public boolean dispatchEvent(Component component, String componentName, String eventName, Object[] params){
    if( component.equals(chat) && eventName.equals("Click") ){
      chatClick();
      return true;
    }
    if( component.equals(home) && eventName.equals("Click") ){
      homeClick();
      return true;
    }
    if( component.equals(search) && eventName.equals("Click") ){
      searchClick();
      return true;
    }
    if( component.equals(my) && eventName.equals("Click") ){
      myClick();
      return true;
    }
    if( component.equals(this) && eventName.equals("Initialize") ){
      thisInitialize();
      return true;
    }
    return false;
  }
  public void chatClick(){
  }
  public void homeClick(){
    home.Visible(true);
    search.Visible(0);
    home_text();
    true
  }
  public void searchClick(){
    home.Visible(true);
    search.Visible(true);
    search_text();
  }
  public void myClick(){
  }
  public void thisInitialize(){
    Label1.Text(String.valueOf(((List)list).get(0 - 1)));
    Label6.Text(String.valueOf(((List)list).get(1 - 1)));
    Label2.Text(String.valueOf(((List)list).get(2 - 1)));
    Label3.Text(String.valueOf(((List)list).get(3 - 1)));
    Label4.Text(String.valueOf(((List)list).get(4 - 1)));
  }
  public void home_text(){
  }
  public void search_text(){
  }
}