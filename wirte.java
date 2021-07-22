package appinventor.ai_oyoungsun1030.last4;

import android.os.Bundle;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Canvas;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.FirebaseDB;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.errors.PermissionException;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.RetValManager;
import com.google.appinventor.components.runtime.util.RuntimeErrorAlert;
import com.google.youngandroid.runtime;
import gnu.expr.ModuleBody;
import gnu.expr.ModuleInfo;
import gnu.expr.ModuleMethod;
import gnu.kawa.functions.Apply;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.lists.Consumer;
import gnu.lists.FString;
import gnu.lists.LList;
import gnu.lists.PairWithPosition;
import gnu.lists.VoidConsumer;
import gnu.mapping.CallContext;
import gnu.mapping.Environment;
import gnu.mapping.Procedure;
import gnu.mapping.PropertySet;
import gnu.mapping.SimpleSymbol;
import gnu.mapping.Symbol;
import gnu.mapping.Values;
import gnu.math.IntNum;
import kawa.lang.Promise;
import kawa.lib.lists;
import kawa.lib.misc;
import kawa.lib.strings;
import kawa.standard.Scheme;

public class wirte
  extends Form
  implements Runnable
{
  static final SimpleSymbol Lit0 = (SimpleSymbol)new SimpleSymbol("wirte").readResolve();
  static final SimpleSymbol Lit1;
  static final SimpleSymbol Lit10;
  static final FString Lit100;
  static final PairWithPosition Lit101;
  static final SimpleSymbol Lit102;
  static final FString Lit103;
  static final SimpleSymbol Lit104;
  static final IntNum Lit105;
  static final IntNum Lit106;
  static final FString Lit107;
  static final PairWithPosition Lit108;
  static final SimpleSymbol Lit109;
  static final SimpleSymbol Lit11;
  static final FString Lit110;
  static final SimpleSymbol Lit111;
  static final SimpleSymbol Lit112;
  static final SimpleSymbol Lit113;
  static final SimpleSymbol Lit114;
  static final FString Lit115;
  static final FString Lit116;
  static final SimpleSymbol Lit117;
  static final FString Lit118;
  static final FString Lit119;
  static final SimpleSymbol Lit12;
  static final FString Lit120;
  static final SimpleSymbol Lit121;
  static final SimpleSymbol Lit122;
  static final SimpleSymbol Lit123;
  static final SimpleSymbol Lit124;
  static final SimpleSymbol Lit125;
  static final SimpleSymbol Lit126;
  static final SimpleSymbol Lit127;
  static final SimpleSymbol Lit128;
  static final SimpleSymbol Lit129;
  static final SimpleSymbol Lit13;
  static final SimpleSymbol Lit130;
  static final SimpleSymbol Lit131;
  static final SimpleSymbol Lit132;
  static final SimpleSymbol Lit133;
  static final SimpleSymbol Lit134;
  static final SimpleSymbol Lit135;
  static final SimpleSymbol Lit136 = (SimpleSymbol)new SimpleSymbol("list").readResolve();
  static final SimpleSymbol Lit14;
  static final SimpleSymbol Lit15;
  static final SimpleSymbol Lit16;
  static final SimpleSymbol Lit17;
  static final SimpleSymbol Lit18;
  static final SimpleSymbol Lit19;
  static final SimpleSymbol Lit2;
  static final IntNum Lit20;
  static final SimpleSymbol Lit21;
  static final SimpleSymbol Lit22;
  static final SimpleSymbol Lit23;
  static final SimpleSymbol Lit24;
  static final SimpleSymbol Lit25;
  static final FString Lit26;
  static final SimpleSymbol Lit27;
  static final IntNum Lit28;
  static final SimpleSymbol Lit29;
  static final SimpleSymbol Lit3;
  static final IntNum Lit30;
  static final SimpleSymbol Lit31;
  static final IntNum Lit32;
  static final FString Lit33;
  static final FString Lit34;
  static final SimpleSymbol Lit35;
  static final IntNum Lit36;
  static final SimpleSymbol Lit37;
  static final IntNum Lit38;
  static final FString Lit39;
  static final SimpleSymbol Lit4;
  static final FString Lit40;
  static final SimpleSymbol Lit41;
  static final SimpleSymbol Lit42;
  static final FString Lit43;
  static final FString Lit44;
  static final SimpleSymbol Lit45;
  static final FString Lit46;
  static final FString Lit47;
  static final SimpleSymbol Lit48;
  static final FString Lit49;
  static final IntNum Lit5;
  static final FString Lit50;
  static final SimpleSymbol Lit51;
  static final FString Lit52;
  static final FString Lit53;
  static final SimpleSymbol Lit54;
  static final FString Lit55;
  static final FString Lit56;
  static final SimpleSymbol Lit57;
  static final IntNum Lit58;
  static final FString Lit59;
  static final PairWithPosition Lit6;
  static final SimpleSymbol Lit60;
  static final SimpleSymbol Lit61;
  static final PairWithPosition Lit62;
  static final SimpleSymbol Lit63;
  static final PairWithPosition Lit64;
  static final PairWithPosition Lit65;
  static final PairWithPosition Lit66;
  static final PairWithPosition Lit67;
  static final PairWithPosition Lit68;
  static final SimpleSymbol Lit69;
  static final PairWithPosition Lit7;
  static final SimpleSymbol Lit70;
  static final PairWithPosition Lit71;
  static final PairWithPosition Lit72;
  static final SimpleSymbol Lit73;
  static final SimpleSymbol Lit74;
  static final FString Lit75;
  static final SimpleSymbol Lit76;
  static final SimpleSymbol Lit77;
  static final IntNum Lit78;
  static final SimpleSymbol Lit79;
  static final SimpleSymbol Lit8;
  static final IntNum Lit80;
  static final FString Lit81;
  static final FString Lit82;
  static final SimpleSymbol Lit83;
  static final IntNum Lit84;
  static final IntNum Lit85;
  static final FString Lit86;
  static final PairWithPosition Lit87;
  static final SimpleSymbol Lit88;
  static final FString Lit89;
  static final SimpleSymbol Lit9;
  static final SimpleSymbol Lit90;
  static final IntNum Lit91;
  static final IntNum Lit92;
  static final FString Lit93;
  static final PairWithPosition Lit94;
  static final SimpleSymbol Lit95;
  static final FString Lit96;
  static final SimpleSymbol Lit97;
  static final IntNum Lit98;
  static final IntNum Lit99;
  static final ModuleMethod lambda$Fn1;
  static final ModuleMethod lambda$Fn10;
  static final ModuleMethod lambda$Fn11;
  static final ModuleMethod lambda$Fn12;
  static final ModuleMethod lambda$Fn13;
  static final ModuleMethod lambda$Fn14;
  static final ModuleMethod lambda$Fn15;
  static final ModuleMethod lambda$Fn16;
  static final ModuleMethod lambda$Fn17;
  static final ModuleMethod lambda$Fn18;
  static final ModuleMethod lambda$Fn19;
  static final ModuleMethod lambda$Fn2;
  static final ModuleMethod lambda$Fn20;
  static final ModuleMethod lambda$Fn21;
  static final ModuleMethod lambda$Fn22;
  static final ModuleMethod lambda$Fn23;
  static final ModuleMethod lambda$Fn24;
  static final ModuleMethod lambda$Fn25;
  static final ModuleMethod lambda$Fn26;
  static final ModuleMethod lambda$Fn27;
  static final ModuleMethod lambda$Fn28;
  static final ModuleMethod lambda$Fn29;
  static final ModuleMethod lambda$Fn3;
  static final ModuleMethod lambda$Fn30;
  static final ModuleMethod lambda$Fn31;
  static final ModuleMethod lambda$Fn32;
  static final ModuleMethod lambda$Fn33;
  static final ModuleMethod lambda$Fn34;
  static final ModuleMethod lambda$Fn35;
  static final ModuleMethod lambda$Fn36;
  static final ModuleMethod lambda$Fn37;
  static final ModuleMethod lambda$Fn38;
  static final ModuleMethod lambda$Fn39;
  static final ModuleMethod lambda$Fn4;
  static final ModuleMethod lambda$Fn5;
  static final ModuleMethod lambda$Fn6;
  static final ModuleMethod lambda$Fn7;
  static final ModuleMethod lambda$Fn8;
  static final ModuleMethod lambda$Fn9;
  public static wirte wirte;
  public Boolean $Stdebug$Mnform$St;
  public final ModuleMethod $define;
  public HorizontalArrangement HorizontalArrangement1;
  public final ModuleMethod add$Mnto$Mncomponents;
  public final ModuleMethod add$Mnto$Mnevents;
  public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
  public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
  public final ModuleMethod android$Mnlog$Mnform;
  public final ModuleMethod any$TextBox$GotFocus;
  public Button chat;
  public final ModuleMethod chat$Click;
  public LList components$Mnto$Mncreate;
  public final ModuleMethod dispatchEvent;
  public final ModuleMethod dispatchGenericEvent;
  public LList events$Mnto$Mnregister;
  public LList form$Mndo$Mnafter$Mncreation;
  public Environment form$Mnenvironment;
  public Symbol form$Mnname$Mnsymbol;
  public final ModuleMethod get$Mnsimple$Mnname;
  public Environment global$Mnvar$Mnenvironment;
  public LList global$Mnvars$Mnto$Mncreate;
  public Button home;
  public final ModuleMethod home$Click;
  public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
  public final ModuleMethod lookup$Mnhandler;
  public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
  public Button my;
  public final ModuleMethod my$Click;
  public final ModuleMethod onCreate;
  public TextBox posi;
  public final ModuleMethod process$Mnexception;
  public Button search;
  public final ModuleMethod search$Click;
  public final ModuleMethod send$Mnerror;
  public Button write;
  public final ModuleMethod write$Click;
  public TextBox 媛�寃�;
  public TextBox 湲고븳;
  public TextBox �궡�슜;
  public VerticalArrangement �닔吏곷같移�1;
  public Notifier �븣由�1;
  public TextBox �젣紐�;
  public Canvas 罹붾쾭�뒪1;
  public FirebaseDB �뙆�씠�뼱踰좎씠�뒪DB1;
  public FirebaseDB �뙆�씠�뼱踰좎씠�뒪DB2;
  
  static
  {
    Lit135 = (SimpleSymbol)new SimpleSymbol("any").readResolve();
    Lit134 = (SimpleSymbol)new SimpleSymbol("lookup-handler").readResolve();
    Lit133 = (SimpleSymbol)new SimpleSymbol("dispatchGenericEvent").readResolve();
    Lit132 = (SimpleSymbol)new SimpleSymbol("dispatchEvent").readResolve();
    Lit131 = (SimpleSymbol)new SimpleSymbol("send-error").readResolve();
    Lit130 = (SimpleSymbol)new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    Lit129 = (SimpleSymbol)new SimpleSymbol("add-to-global-vars").readResolve();
    Lit128 = (SimpleSymbol)new SimpleSymbol("add-to-components").readResolve();
    Lit127 = (SimpleSymbol)new SimpleSymbol("add-to-events").readResolve();
    Lit126 = (SimpleSymbol)new SimpleSymbol("add-to-global-var-environment").readResolve();
    Lit125 = (SimpleSymbol)new SimpleSymbol("is-bound-in-form-environment").readResolve();
    Lit124 = (SimpleSymbol)new SimpleSymbol("lookup-in-form-environment").readResolve();
    Lit123 = (SimpleSymbol)new SimpleSymbol("add-to-form-environment").readResolve();
    Lit122 = (SimpleSymbol)new SimpleSymbol("android-log-form").readResolve();
    Lit121 = (SimpleSymbol)new SimpleSymbol("get-simple-name").readResolve();
    Lit120 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit119 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit118 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit117 = (SimpleSymbol)new SimpleSymbol("�뙆�씠�뼱踰좎씠�뒪DB2").readResolve();
    Lit116 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit115 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit114 = (SimpleSymbol)new SimpleSymbol("FirebaseURL").readResolve();
    Lit113 = (SimpleSymbol)new SimpleSymbol("FirebaseToken").readResolve();
    Lit112 = (SimpleSymbol)new SimpleSymbol("DeveloperBucket").readResolve();
    Lit111 = (SimpleSymbol)new SimpleSymbol("DefaultURL").readResolve();
    Lit110 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit109 = (SimpleSymbol)new SimpleSymbol("my$Click").readResolve();
    Object localObject = (SimpleSymbol)new SimpleSymbol("text").readResolve();
    Lit16 = (SimpleSymbol)localObject;
    Lit108 = PairWithPosition.make(localObject, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 655542), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 655536);
    Lit107 = new FString("com.google.appinventor.components.runtime.Button");
    Lit106 = IntNum.make(64516);
    localObject = new int[2];
    localObject[0] = 42075;
    Lit105 = IntNum.make((int[])localObject);
    Lit104 = (SimpleSymbol)new SimpleSymbol("my").readResolve();
    Lit103 = new FString("com.google.appinventor.components.runtime.Button");
    Lit102 = (SimpleSymbol)new SimpleSymbol("chat$Click").readResolve();
    Lit101 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 602292), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 602286);
    Lit100 = new FString("com.google.appinventor.components.runtime.Button");
    Lit99 = IntNum.make(64516);
    localObject = new int[2];
    localObject[0] = 42075;
    Lit98 = IntNum.make((int[])localObject);
    Lit97 = (SimpleSymbol)new SimpleSymbol("chat").readResolve();
    Lit96 = new FString("com.google.appinventor.components.runtime.Button");
    Lit95 = (SimpleSymbol)new SimpleSymbol("search$Click").readResolve();
    Lit94 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 549045), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 549039);
    Lit93 = new FString("com.google.appinventor.components.runtime.Button");
    Lit92 = IntNum.make(64516);
    localObject = new int[2];
    localObject[0] = 42075;
    Lit91 = IntNum.make((int[])localObject);
    Lit90 = (SimpleSymbol)new SimpleSymbol("search").readResolve();
    Lit89 = new FString("com.google.appinventor.components.runtime.Button");
    Lit88 = (SimpleSymbol)new SimpleSymbol("home$Click").readResolve();
    Lit87 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 495796), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 495790);
    Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    Lit85 = IntNum.make(64516);
    localObject = new int[2];
    localObject[0] = 42075;
    Lit84 = IntNum.make((int[])localObject);
    Lit83 = (SimpleSymbol)new SimpleSymbol("home").readResolve();
    Lit82 = new FString("com.google.appinventor.components.runtime.Button");
    Lit81 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    localObject = new int[2];
    localObject[0] = 55927;
    Lit80 = IntNum.make((int[])localObject);
    Lit79 = (SimpleSymbol)new SimpleSymbol("AlignVertical").readResolve();
    Lit78 = IntNum.make(3);
    Lit77 = (SimpleSymbol)new SimpleSymbol("AlignHorizontal").readResolve();
    Lit76 = (SimpleSymbol)new SimpleSymbol("HorizontalArrangement1").readResolve();
    Lit75 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit74 = (SimpleSymbol)new SimpleSymbol("Click").readResolve();
    Lit73 = (SimpleSymbol)new SimpleSymbol("write$Click").readResolve();
    Lit72 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 390171), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 390165);
    Lit71 = PairWithPosition.make(Lit16, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389989);
    Lit70 = (SimpleSymbol)new SimpleSymbol("ShowAlert").readResolve();
    Lit69 = (SimpleSymbol)new SimpleSymbol("�븣由�1").readResolve();
    Lit68 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389852), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389846);
    Lit67 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389739), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389733);
    Lit66 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389627), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389621);
    Lit65 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389514), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389508);
    Lit64 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit135, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389399), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389393);
    Lit63 = (SimpleSymbol)new SimpleSymbol("StoreValue").readResolve();
    Lit62 = PairWithPosition.make(Lit16, PairWithPosition.make(Lit16, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389269), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 389263);
    Lit61 = (SimpleSymbol)new SimpleSymbol("ProjectBucket").readResolve();
    Lit60 = (SimpleSymbol)new SimpleSymbol("�뙆�씠�뼱踰좎씠�뒪DB1").readResolve();
    Lit59 = new FString("com.google.appinventor.components.runtime.Button");
    localObject = new int[2];
    localObject[0] = 42075;
    Lit58 = IntNum.make((int[])localObject);
    Lit57 = (SimpleSymbol)new SimpleSymbol("write").readResolve();
    Lit56 = new FString("com.google.appinventor.components.runtime.Button");
    Lit55 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit54 = (SimpleSymbol)new SimpleSymbol("posi").readResolve();
    Lit53 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit52 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit51 = (SimpleSymbol)new SimpleSymbol("湲고븳").readResolve();
    Lit50 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit49 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit48 = (SimpleSymbol)new SimpleSymbol("媛�寃�").readResolve();
    Lit47 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit46 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit45 = (SimpleSymbol)new SimpleSymbol("�궡�슜").readResolve();
    Lit44 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit43 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit42 = (SimpleSymbol)new SimpleSymbol("Hint").readResolve();
    Lit41 = (SimpleSymbol)new SimpleSymbol("�젣紐�").readResolve();
    Lit40 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit39 = new FString("com.google.appinventor.components.runtime.Canvas");
    Lit38 = IntNum.make(50);
    Lit37 = (SimpleSymbol)new SimpleSymbol("BackgroundImage").readResolve();
    Lit36 = IntNum.make(16777215);
    Lit35 = (SimpleSymbol)new SimpleSymbol("罹붾쾭�뒪1").readResolve();
    Lit34 = new FString("com.google.appinventor.components.runtime.Canvas");
    Lit33 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit32 = IntNum.make(-2);
    Lit31 = (SimpleSymbol)new SimpleSymbol("Width").readResolve();
    Lit30 = IntNum.make(64456);
    Lit29 = (SimpleSymbol)new SimpleSymbol("Height").readResolve();
    Lit28 = IntNum.make(16777215);
    Lit27 = (SimpleSymbol)new SimpleSymbol("�닔吏곷같移�1").readResolve();
    Lit26 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit25 = (SimpleSymbol)new SimpleSymbol("Title").readResolve();
    Lit24 = (SimpleSymbol)new SimpleSymbol("Sizing").readResolve();
    Lit23 = (SimpleSymbol)new SimpleSymbol("boolean").readResolve();
    Lit22 = (SimpleSymbol)new SimpleSymbol("ShowListsAsJson").readResolve();
    Lit21 = (SimpleSymbol)new SimpleSymbol("number").readResolve();
    localObject = new int[2];
    localObject[0] = -264464;
    Lit20 = IntNum.make((int[])localObject);
    Lit19 = (SimpleSymbol)new SimpleSymbol("BackgroundColor").readResolve();
    Lit18 = (SimpleSymbol)new SimpleSymbol("AppName").readResolve();
    Lit17 = (SimpleSymbol)new SimpleSymbol("any$TextBox$GotFocus").readResolve();
    Lit15 = (SimpleSymbol)new SimpleSymbol("Text").readResolve();
    Lit14 = (SimpleSymbol)new SimpleSymbol("com.google.appinventor.components.runtime.TextBox").readResolve();
    Lit13 = (SimpleSymbol)new SimpleSymbol("$component").readResolve();
    Lit12 = (SimpleSymbol)new SimpleSymbol("g$query_type").readResolve();
    Lit11 = (SimpleSymbol)new SimpleSymbol("g$date").readResolve();
    Lit10 = (SimpleSymbol)new SimpleSymbol("g$price").readResolve();
    Lit9 = (SimpleSymbol)new SimpleSymbol("g$title").readResolve();
    Lit8 = (SimpleSymbol)new SimpleSymbol("g$content").readResolve();
    Lit7 = PairWithPosition.make(Lit136, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 37027), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 37021);
    Lit6 = PairWithPosition.make(Lit136, PairWithPosition.make(Lit21, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 37027), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/wirte.yail", 37021);
    Lit5 = IntNum.make(2);
    Lit4 = (SimpleSymbol)new SimpleSymbol("g$id").readResolve();
    Lit3 = (SimpleSymbol)new SimpleSymbol("g$firebasedata").readResolve();
    Lit2 = (SimpleSymbol)new SimpleSymbol("*the-null-value*").readResolve();
    Lit1 = (SimpleSymbol)new SimpleSymbol("getMessage").readResolve();
  }
  
  public wirte()
  {
    ModuleInfo.register(this);
    wirte.frame localframe = new wirte.frame();
    $main = this;
    get$Mnsimple$Mnname = new ModuleMethod(localframe, 1, Lit121, 4097);
    onCreate = new ModuleMethod(localframe, 2, "onCreate", 4097);
    android$Mnlog$Mnform = new ModuleMethod(localframe, 3, Lit122, 4097);
    add$Mnto$Mnform$Mnenvironment = new ModuleMethod(localframe, 4, Lit123, 8194);
    lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 5, Lit124, 8193);
    is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 7, Lit125, 4097);
    add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(localframe, 8, Lit126, 8194);
    add$Mnto$Mnevents = new ModuleMethod(localframe, 9, Lit127, 8194);
    add$Mnto$Mncomponents = new ModuleMethod(localframe, 10, Lit128, 16388);
    add$Mnto$Mnglobal$Mnvars = new ModuleMethod(localframe, 11, Lit129, 8194);
    add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(localframe, 12, Lit130, 4097);
    send$Mnerror = new ModuleMethod(localframe, 13, Lit131, 4097);
    process$Mnexception = new ModuleMethod(localframe, 14, "process-exception", 4097);
    dispatchEvent = new ModuleMethod(localframe, 15, Lit132, 16388);
    dispatchGenericEvent = new ModuleMethod(localframe, 16, Lit133, 16388);
    lookup$Mnhandler = new ModuleMethod(localframe, 17, Lit134, 8194);
    ModuleMethod localModuleMethod = new ModuleMethod(localframe, 18, null, 0);
    localModuleMethod.setProperty("source-location", "/tmp/runtime4163479401509002272.scm:622");
    lambda$Fn1 = localModuleMethod;
    $define = new ModuleMethod(localframe, 19, "$define", 0);
    lambda$Fn2 = new ModuleMethod(localframe, 20, null, 0);
    lambda$Fn3 = new ModuleMethod(localframe, 21, null, 0);
    lambda$Fn4 = new ModuleMethod(localframe, 22, null, 0);
    lambda$Fn5 = new ModuleMethod(localframe, 23, null, 0);
    lambda$Fn6 = new ModuleMethod(localframe, 24, null, 0);
    lambda$Fn7 = new ModuleMethod(localframe, 25, null, 0);
    lambda$Fn8 = new ModuleMethod(localframe, 26, null, 0);
    any$TextBox$GotFocus = new ModuleMethod(localframe, 27, Lit17, 8194);
    lambda$Fn9 = new ModuleMethod(localframe, 28, null, 0);
    lambda$Fn10 = new ModuleMethod(localframe, 29, null, 0);
    lambda$Fn11 = new ModuleMethod(localframe, 30, null, 0);
    lambda$Fn12 = new ModuleMethod(localframe, 31, null, 0);
    lambda$Fn13 = new ModuleMethod(localframe, 32, null, 0);
    lambda$Fn14 = new ModuleMethod(localframe, 33, null, 0);
    lambda$Fn15 = new ModuleMethod(localframe, 34, null, 0);
    lambda$Fn16 = new ModuleMethod(localframe, 35, null, 0);
    lambda$Fn17 = new ModuleMethod(localframe, 36, null, 0);
    lambda$Fn18 = new ModuleMethod(localframe, 37, null, 0);
    lambda$Fn19 = new ModuleMethod(localframe, 38, null, 0);
    lambda$Fn20 = new ModuleMethod(localframe, 39, null, 0);
    lambda$Fn21 = new ModuleMethod(localframe, 40, null, 0);
    lambda$Fn22 = new ModuleMethod(localframe, 41, null, 0);
    lambda$Fn23 = new ModuleMethod(localframe, 42, null, 0);
    lambda$Fn24 = new ModuleMethod(localframe, 43, null, 0);
    lambda$Fn25 = new ModuleMethod(localframe, 44, null, 0);
    write$Click = new ModuleMethod(localframe, 45, Lit73, 0);
    lambda$Fn26 = new ModuleMethod(localframe, 46, null, 0);
    lambda$Fn27 = new ModuleMethod(localframe, 47, null, 0);
    lambda$Fn28 = new ModuleMethod(localframe, 48, null, 0);
    lambda$Fn29 = new ModuleMethod(localframe, 49, null, 0);
    home$Click = new ModuleMethod(localframe, 50, Lit88, 0);
    lambda$Fn30 = new ModuleMethod(localframe, 51, null, 0);
    lambda$Fn31 = new ModuleMethod(localframe, 52, null, 0);
    search$Click = new ModuleMethod(localframe, 53, Lit95, 0);
    lambda$Fn32 = new ModuleMethod(localframe, 54, null, 0);
    lambda$Fn33 = new ModuleMethod(localframe, 55, null, 0);
    chat$Click = new ModuleMethod(localframe, 56, Lit102, 0);
    lambda$Fn34 = new ModuleMethod(localframe, 57, null, 0);
    lambda$Fn35 = new ModuleMethod(localframe, 58, null, 0);
    my$Click = new ModuleMethod(localframe, 59, Lit109, 0);
    lambda$Fn36 = new ModuleMethod(localframe, 60, null, 0);
    lambda$Fn37 = new ModuleMethod(localframe, 61, null, 0);
    lambda$Fn38 = new ModuleMethod(localframe, 62, null, 0);
    lambda$Fn39 = new ModuleMethod(localframe, 63, null, 0);
  }
  
  static Object lambda10()
  {
    runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "helpplz", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.FALSE, Lit23);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "Fixed", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "wirte", Lit16);
  }
  
  static Object lambda11()
  {
    runtime.setAndCoerceProperty$Ex(Lit27, Lit19, Lit28, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit27, Lit29, Lit30, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit27, Lit31, Lit32, Lit21);
  }
  
  static Object lambda12()
  {
    runtime.setAndCoerceProperty$Ex(Lit27, Lit19, Lit28, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit27, Lit29, Lit30, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit27, Lit31, Lit32, Lit21);
  }
  
  static Object lambda13()
  {
    runtime.setAndCoerceProperty$Ex(Lit35, Lit19, Lit36, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit35, Lit37, "ongsimi.png", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit35, Lit29, Lit38, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit35, Lit31, Lit38, Lit21);
  }
  
  static Object lambda14()
  {
    runtime.setAndCoerceProperty$Ex(Lit35, Lit19, Lit36, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit35, Lit37, "ongsimi.png", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit35, Lit29, Lit38, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit35, Lit31, Lit38, Lit21);
  }
  
  static Object lambda15()
  {
    return runtime.setAndCoerceProperty$Ex(Lit41, Lit42, "title", Lit16);
  }
  
  static Object lambda16()
  {
    return runtime.setAndCoerceProperty$Ex(Lit41, Lit42, "title", Lit16);
  }
  
  static Object lambda17()
  {
    return runtime.setAndCoerceProperty$Ex(Lit45, Lit42, "content", Lit16);
  }
  
  static Object lambda18()
  {
    return runtime.setAndCoerceProperty$Ex(Lit45, Lit42, "content", Lit16);
  }
  
  static Object lambda19()
  {
    return runtime.setAndCoerceProperty$Ex(Lit48, Lit42, "price", Lit16);
  }
  
  /* Error */
  public static SimpleSymbol lambda1symbolAppend$V(Object[] paramArrayOfObject)
  {
    
  }
  
  static Object lambda2()
  {
    return null;
  }
  
  static Object lambda20()
  {
    return runtime.setAndCoerceProperty$Ex(Lit48, Lit42, "price", Lit16);
  }
  
  static Object lambda21()
  {
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit42, "date", Lit16);
  }
  
  static Object lambda22()
  {
    return runtime.setAndCoerceProperty$Ex(Lit51, Lit42, "date", Lit16);
  }
  
  static Object lambda23()
  {
    return runtime.setAndCoerceProperty$Ex(Lit54, Lit42, "posi", Lit16);
  }
  
  static Object lambda24()
  {
    return runtime.setAndCoerceProperty$Ex(Lit54, Lit42, "posi", Lit16);
  }
  
  static Object lambda25()
  {
    runtime.setAndCoerceProperty$Ex(Lit57, Lit19, Lit58, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit57, Lit15, "湲��벐湲�", Lit16);
  }
  
  static Object lambda26()
  {
    runtime.setAndCoerceProperty$Ex(Lit57, Lit19, Lit58, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit57, Lit15, "湲��벐湲�", Lit16);
  }
  
  static Object lambda27()
  {
    runtime.setAndCoerceProperty$Ex(Lit76, Lit77, Lit78, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit76, Lit79, Lit78, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit76, Lit19, Lit80, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit76, Lit31, Lit32, Lit21);
  }
  
  static Object lambda28()
  {
    runtime.setAndCoerceProperty$Ex(Lit76, Lit77, Lit78, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit76, Lit79, Lit78, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit76, Lit19, Lit80, Lit21);
    return runtime.setAndCoerceProperty$Ex(Lit76, Lit31, Lit32, Lit21);
  }
  
  static Object lambda29()
  {
    runtime.setAndCoerceProperty$Ex(Lit83, Lit19, Lit84, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit83, Lit15, "�솃  ", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit83, Lit31, Lit85, Lit21);
  }
  
  static Object lambda3()
  {
    return runtime.callYailPrimitive(runtime.make$Mnyail$Mndictionary, LList.Empty, LList.Empty, "make a dictionary");
  }
  
  static Object lambda30()
  {
    runtime.setAndCoerceProperty$Ex(Lit83, Lit19, Lit84, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit83, Lit15, "�솃  ", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit83, Lit31, Lit85, Lit21);
  }
  
  static Object lambda31()
  {
    runtime.setAndCoerceProperty$Ex(Lit90, Lit19, Lit91, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit90, Lit15, "寃��깋", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit90, Lit31, Lit92, Lit21);
  }
  
  static Object lambda32()
  {
    runtime.setAndCoerceProperty$Ex(Lit90, Lit19, Lit91, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit90, Lit15, "寃��깋", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit90, Lit31, Lit92, Lit21);
  }
  
  static Object lambda33()
  {
    runtime.setAndCoerceProperty$Ex(Lit97, Lit19, Lit98, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit97, Lit15, "梨꾪똿", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit97, Lit31, Lit99, Lit21);
  }
  
  static Object lambda34()
  {
    runtime.setAndCoerceProperty$Ex(Lit97, Lit19, Lit98, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit97, Lit15, "梨꾪똿", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit97, Lit31, Lit99, Lit21);
  }
  
  static Object lambda35()
  {
    runtime.setAndCoerceProperty$Ex(Lit104, Lit19, Lit105, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit104, Lit15, "mypage", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit104, Lit31, Lit106, Lit21);
  }
  
  static Object lambda36()
  {
    runtime.setAndCoerceProperty$Ex(Lit104, Lit19, Lit105, Lit21);
    runtime.setAndCoerceProperty$Ex(Lit104, Lit15, "mypage", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit104, Lit31, Lit106, Lit21);
  }
  
  static Object lambda37()
  {
    runtime.setAndCoerceProperty$Ex(Lit60, Lit111, "https://dazzling-fire-7140.firebaseio.com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit60, Lit112, "oyoungsun1030@gmail:com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit60, Lit113, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit60, Lit114, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit60, Lit61, "last_2", Lit16);
  }
  
  static Object lambda38()
  {
    runtime.setAndCoerceProperty$Ex(Lit60, Lit111, "https://dazzling-fire-7140.firebaseio.com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit60, Lit112, "oyoungsun1030@gmail:com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit60, Lit113, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit60, Lit114, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit60, Lit61, "last_2", Lit16);
  }
  
  static Object lambda39()
  {
    runtime.setAndCoerceProperty$Ex(Lit117, Lit111, "https://dazzling-fire-7140.firebaseio.com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit117, Lit112, "oyoungsun1030@gmail:com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit117, Lit113, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit117, Lit114, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit117, Lit61, "king", Lit16);
  }
  
  static Object lambda4()
  {
    return runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), Lit5), Lit7, "select list item");
  }
  
  static Object lambda40()
  {
    runtime.setAndCoerceProperty$Ex(Lit117, Lit111, "https://dazzling-fire-7140.firebaseio.com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit117, Lit112, "oyoungsun1030@gmail:com/", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit117, Lit113, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit16);
    runtime.setAndCoerceProperty$Ex(Lit117, Lit114, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit16);
    return runtime.setAndCoerceProperty$Ex(Lit117, Lit61, "king", Lit16);
  }
  
  static String lambda5()
  {
    return "";
  }
  
  static String lambda6()
  {
    return "";
  }
  
  static String lambda7()
  {
    return "";
  }
  
  static String lambda8()
  {
    return "";
  }
  
  static String lambda9()
  {
    return "";
  }
  
  /* Error */
  public void $define()
  {
    
  }
  
  public void addToComponents(Object paramObject1, Object paramObject2, Object paramObject3, Object paramObject4)
  {
    components$Mnto$Mncreate = lists.cons(LList.list4(paramObject1, paramObject2, paramObject3, paramObject4), components$Mnto$Mncreate);
  }
  
  public void addToEvents(Object paramObject1, Object paramObject2)
  {
    events$Mnto$Mnregister = lists.cons(lists.cons(paramObject1, paramObject2), events$Mnto$Mnregister);
  }
  
  public void addToFormDoAfterCreation(Object paramObject)
  {
    form$Mndo$Mnafter$Mncreation = lists.cons(paramObject, form$Mndo$Mnafter$Mncreation);
  }
  
  public void addToFormEnvironment(Symbol paramSymbol, Object paramObject)
  {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, form$Mnenvironment, paramObject }));
    form$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVarEnvironment(Symbol paramSymbol, Object paramObject)
  {
    androidLogForm(Format.formatToString(0, new Object[] { "Adding ~A to env ~A with value ~A", paramSymbol, global$Mnvar$Mnenvironment, paramObject }));
    global$Mnvar$Mnenvironment.put(paramSymbol, paramObject);
  }
  
  public void addToGlobalVars(Object paramObject1, Object paramObject2)
  {
    global$Mnvars$Mnto$Mncreate = lists.cons(LList.list2(paramObject1, paramObject2), global$Mnvars$Mnto$Mncreate);
  }
  
  public void androidLogForm(Object paramObject) {}
  
  public Object any$TextBox$GotFocus(Object paramObject1, Object paramObject2)
  {
    Object localObject = runtime.sanitizeComponentData(paramObject1);
    runtime.sanitizeComponentData(paramObject2);
    runtime.setThisForm();
    paramObject1 = localObject;
    if ((localObject instanceof Package)) {
      paramObject1 = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit13), " is not bound in the current context" }), "Unbound Variable");
    }
    return runtime.setAndCoercePropertyAndCheck$Ex(paramObject1, Lit14, Lit15, "", Lit16);
  }
  
  public Object chat$Click()
  {
    runtime.setThisForm();
    return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("chat", runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit101, "open another screen with start value");
  }
  
  public boolean dispatchEvent(Component paramComponent, String paramString1, String paramString2, Object[] paramArrayOfObject)
  {
    SimpleSymbol localSimpleSymbol = misc.string$To$Symbol(paramString1);
    if (isBoundInFormEnvironment(localSimpleSymbol))
    {
      if (lookupInFormEnvironment(localSimpleSymbol) == paramComponent)
      {
        paramString1 = lookupHandler(paramString1, paramString2);
        try
        {
          Scheme.apply.apply2(paramString1, LList.makeList(paramArrayOfObject, 0));
          return true;
        }
        catch (PermissionException paramString1)
        {
          paramString1.printStackTrace();
          int i;
          if (this == paramComponent)
          {
            i = 1;
            if (i == 0) {
              break label89;
            }
            if (!IsEqual.apply(paramString2, "PermissionNeeded")) {
              break label94;
            }
            processException(paramString1);
          }
          for (;;)
          {
            return false;
            i = 0;
            break;
            if (i != 0) {
              break label76;
            }
            PermissionDenied(paramComponent, paramString2, paramString1.getPermissionNeeded());
          }
        }
        catch (Throwable paramComponent)
        {
          label76:
          label89:
          label94:
          androidLogForm(paramComponent.getMessage());
          paramComponent.printStackTrace();
          processException(paramComponent);
          return false;
        }
      }
      return false;
    }
    EventDispatcher.unregisterEventForDelegation(this, paramString1, paramString2);
    return false;
  }
  
  public void dispatchGenericEvent(Component paramComponent, String paramString, boolean paramBoolean, Object[] paramArrayOfObject)
  {
    int i = 1;
    Object localObject = lookupInFormEnvironment(misc.string$To$Symbol(strings.stringAppend(new Object[] { "any$", getSimpleName(paramComponent), "$", paramString })));
    if (localObject != Boolean.FALSE) {
      try
      {
        Apply localApply = Scheme.apply;
        if (paramBoolean) {}
        for (Boolean localBoolean = Boolean.TRUE;; localBoolean = Boolean.FALSE)
        {
          localApply.apply2(localObject, lists.cons(paramComponent, lists.cons(localBoolean, LList.makeList(paramArrayOfObject, 0))));
          return;
        }
        label137:
        label142:
        return;
      }
      catch (PermissionException paramArrayOfObject)
      {
        paramArrayOfObject.printStackTrace();
        if (this == paramComponent)
        {
          if (i == 0) {
            break label137;
          }
          if (!IsEqual.apply(paramString, "PermissionNeeded")) {
            break label142;
          }
        }
        while (i != 0)
        {
          processException(paramArrayOfObject);
          return;
          i = 0;
          break;
        }
        PermissionDenied(paramComponent, paramString, paramArrayOfObject.getPermissionNeeded());
        return;
      }
      catch (Throwable paramComponent)
      {
        androidLogForm(paramComponent.getMessage());
        paramComponent.printStackTrace();
        processException(paramComponent);
      }
    }
  }
  
  public String getSimpleName(Object paramObject)
  {
    return paramObject.getClass().getSimpleName();
  }
  
  public Object home$Click()
  {
    runtime.setThisForm();
    return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("main", runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit87, "open another screen with start value");
  }
  
  public boolean isBoundInFormEnvironment(Symbol paramSymbol)
  {
    return form$Mnenvironment.isBound(paramSymbol);
  }
  
  public Object lookupHandler(Object paramObject1, Object paramObject2)
  {
    Object localObject = null;
    if (paramObject1 == null)
    {
      paramObject1 = null;
      if (paramObject2 != null) {
        break label35;
      }
    }
    label35:
    for (paramObject2 = localObject;; paramObject2 = paramObject2.toString())
    {
      return lookupInFormEnvironment(misc.string$To$Symbol(EventDispatcher.makeFullEventName((String)paramObject1, (String)paramObject2)));
      paramObject1 = paramObject1.toString();
      break;
    }
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol)
  {
    return lookupInFormEnvironment(paramSymbol, Boolean.FALSE);
  }
  
  public Object lookupInFormEnvironment(Symbol paramSymbol, Object paramObject)
  {
    int i;
    if (form$Mnenvironment == null)
    {
      i = 1;
      i = i + 1 & 0x1;
      if (i == 0) {
        break label46;
      }
      if (!form$Mnenvironment.isBound(paramSymbol)) {}
    }
    for (;;)
    {
      paramObject = form$Mnenvironment.get(paramSymbol);
      label46:
      do
      {
        return paramObject;
        i = 0;
        break;
      } while (i == 0);
    }
  }
  
  public Object my$Click()
  {
    runtime.setThisForm();
    return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("mypage", runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit108, "open another screen with start value");
  }
  
  public void onCreate(Bundle paramBundle)
  {
    AppInventorCompatActivity.setClassicModeFromYail(true);
    super.onCreate(paramBundle);
  }
  
  public void processException(Object paramObject)
  {
    Object localObject = Scheme.applyToArgs.apply1(GetNamedPart.getNamedPart.apply2(paramObject, Lit1));
    if (localObject == null)
    {
      localObject = null;
      if (!(paramObject instanceof YailRuntimeError)) {
        break label56;
      }
    }
    label56:
    for (paramObject = ((YailRuntimeError)paramObject).getErrorType();; paramObject = "Runtime Error")
    {
      RuntimeErrorAlert.alert(this, (String)localObject, (String)paramObject, "End Application");
      return;
      localObject = localObject.toString();
      break;
    }
  }
  
  public void run()
  {
    CallContext localCallContext = CallContext.getInstance();
    Consumer localConsumer = consumer;
    consumer = VoidConsumer.instance;
    try
    {
      run(localCallContext);
      localThrowable1 = null;
    }
    catch (Throwable localThrowable2)
    {
      Throwable localThrowable1;
      for (;;) {}
    }
    ModuleBody.runCleanup(localCallContext, localThrowable1, localConsumer);
  }
  
  public final void run(CallContext paramCallContext)
  {
    Consumer localConsumer = consumer;
    runtime.$instance.run();
    $Stdebug$Mnform$St = Boolean.FALSE;
    form$Mnenvironment = Environment.make(misc.symbol$To$String(Lit0));
    paramCallContext = strings.stringAppend(new Object[] { misc.symbol$To$String(Lit0), "-global-vars" });
    if (paramCallContext == null)
    {
      paramCallContext = null;
      global$Mnvar$Mnenvironment = Environment.make(paramCallContext);
      wirte = null;
      form$Mnname$Mnsymbol = Lit0;
      events$Mnto$Mnregister = LList.Empty;
      components$Mnto$Mncreate = LList.Empty;
      global$Mnvars$Mnto$Mncreate = LList.Empty;
      form$Mndo$Mnafter$Mncreation = LList.Empty;
      runtime.$instance.run();
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1188;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callYailPrimitive(runtime.make$Mnyail$Mndictionary, LList.Empty, LList.Empty, "make a dictionary")), localConsumer);
      label151:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1201;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit4, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), Lit5), Lit6, "select list item")), localConsumer);
      label203:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1214;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit8, ""), localConsumer);
      label225:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1227;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit9, ""), localConsumer);
      label247:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1240;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit10, ""), localConsumer);
      label269:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1253;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit11, ""), localConsumer);
      label291:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1266;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit12, ""), localConsumer);
      label313:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1279;
      }
      Values.writeValues(runtime.addToCurrentFormEnvironment(Lit17, any$TextBox$GotFocus), localConsumer);
      label336:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1293;
      }
      runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "helpplz", Lit16);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit19, Lit20, Lit21);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit22, Boolean.FALSE, Lit23);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit24, "Fixed", Lit16);
      Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit25, "wirte", Lit16), localConsumer);
      label428:
      �닔吏곷같移�1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1310;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit26, Lit27, lambda$Fn10), localConsumer);
      label461:
      罹붾쾭�뒪1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1329;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit34, Lit35, lambda$Fn12), localConsumer);
      label494:
      �젣紐� = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1348;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit40, Lit41, lambda$Fn14), localConsumer);
      label527:
      �궡�슜 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1367;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit44, Lit45, lambda$Fn16), localConsumer);
      label560:
      媛�寃� = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1386;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit47, Lit48, lambda$Fn18), localConsumer);
      label593:
      湲고븳 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1405;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit50, Lit51, lambda$Fn20), localConsumer);
      label626:
      posi = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1424;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit53, Lit54, lambda$Fn22), localConsumer);
      label659:
      write = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1443;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit27, Lit56, Lit57, lambda$Fn24), localConsumer);
      label692:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1462;
      }
      runtime.addToCurrentFormEnvironment(Lit73, write$Click);
      label712:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1476;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "write", "Click");
      label736:
      HorizontalArrangement1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1489;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit75, Lit76, lambda$Fn26), localConsumer);
      label769:
      home = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1508;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit82, Lit83, lambda$Fn28), localConsumer);
      label802:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1527;
      }
      runtime.addToCurrentFormEnvironment(Lit88, home$Click);
      label822:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1541;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "home", "Click");
      label846:
      search = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1554;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit89, Lit90, lambda$Fn30), localConsumer);
      label879:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1573;
      }
      runtime.addToCurrentFormEnvironment(Lit95, search$Click);
      label899:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1587;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "search", "Click");
      label923:
      chat = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1600;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit96, Lit97, lambda$Fn32), localConsumer);
      label956:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1619;
      }
      runtime.addToCurrentFormEnvironment(Lit102, chat$Click);
      label976:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1633;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "chat", "Click");
      label1000:
      my = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1646;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit76, Lit103, Lit104, lambda$Fn34), localConsumer);
      label1033:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1665;
      }
      runtime.addToCurrentFormEnvironment(Lit109, my$Click);
      label1053:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1679;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "my", "Click");
      label1077:
      �뙆�씠�뼱踰좎씠�뒪DB1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1692;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit110, Lit60, lambda$Fn36), localConsumer);
      label1110:
      �뙆�씠�뼱踰좎씠�뒪DB2 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1711;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit116, Lit117, lambda$Fn38), localConsumer);
      label1143:
      �븣由�1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1730;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit119, Lit69, Boolean.FALSE), localConsumer);
    }
    for (;;)
    {
      runtime.initRuntime();
      return;
      paramCallContext = paramCallContext.toString();
      break;
      label1188:
      addToGlobalVars(Lit3, lambda$Fn2);
      break label151;
      label1201:
      addToGlobalVars(Lit4, lambda$Fn3);
      break label203;
      label1214:
      addToGlobalVars(Lit8, lambda$Fn4);
      break label225;
      label1227:
      addToGlobalVars(Lit9, lambda$Fn5);
      break label247;
      label1240:
      addToGlobalVars(Lit10, lambda$Fn6);
      break label269;
      label1253:
      addToGlobalVars(Lit11, lambda$Fn7);
      break label291;
      label1266:
      addToGlobalVars(Lit12, lambda$Fn8);
      break label313;
      label1279:
      addToFormEnvironment(Lit17, any$TextBox$GotFocus);
      break label336;
      label1293:
      addToFormDoAfterCreation(new Promise(lambda$Fn9));
      break label428;
      label1310:
      addToComponents(Lit0, Lit33, Lit27, lambda$Fn11);
      break label461;
      label1329:
      addToComponents(Lit27, Lit39, Lit35, lambda$Fn13);
      break label494;
      label1348:
      addToComponents(Lit27, Lit43, Lit41, lambda$Fn15);
      break label527;
      label1367:
      addToComponents(Lit27, Lit46, Lit45, lambda$Fn17);
      break label560;
      label1386:
      addToComponents(Lit27, Lit49, Lit48, lambda$Fn19);
      break label593;
      label1405:
      addToComponents(Lit27, Lit52, Lit51, lambda$Fn21);
      break label626;
      label1424:
      addToComponents(Lit27, Lit55, Lit54, lambda$Fn23);
      break label659;
      label1443:
      addToComponents(Lit27, Lit59, Lit57, lambda$Fn25);
      break label692;
      label1462:
      addToFormEnvironment(Lit73, write$Click);
      break label712;
      label1476:
      addToEvents(Lit57, Lit74);
      break label736;
      label1489:
      addToComponents(Lit0, Lit81, Lit76, lambda$Fn27);
      break label769;
      label1508:
      addToComponents(Lit76, Lit86, Lit83, lambda$Fn29);
      break label802;
      label1527:
      addToFormEnvironment(Lit88, home$Click);
      break label822;
      label1541:
      addToEvents(Lit83, Lit74);
      break label846;
      label1554:
      addToComponents(Lit76, Lit93, Lit90, lambda$Fn31);
      break label879;
      label1573:
      addToFormEnvironment(Lit95, search$Click);
      break label899;
      label1587:
      addToEvents(Lit90, Lit74);
      break label923;
      label1600:
      addToComponents(Lit76, Lit100, Lit97, lambda$Fn33);
      break label956;
      label1619:
      addToFormEnvironment(Lit102, chat$Click);
      break label976;
      label1633:
      addToEvents(Lit97, Lit74);
      break label1000;
      label1646:
      addToComponents(Lit76, Lit107, Lit104, lambda$Fn35);
      break label1033;
      label1665:
      addToFormEnvironment(Lit109, my$Click);
      break label1053;
      label1679:
      addToEvents(Lit104, Lit74);
      break label1077;
      label1692:
      addToComponents(Lit0, Lit115, Lit60, lambda$Fn37);
      break label1110;
      label1711:
      addToComponents(Lit0, Lit118, Lit117, lambda$Fn39);
      break label1143;
      label1730:
      addToComponents(Lit0, Lit120, Lit69, Boolean.FALSE);
    }
  }
  
  public Object search$Click()
  {
    runtime.setThisForm();
    return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("wirte", runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit94, "open another screen with start value");
  }
  
  public void sendError(Object paramObject)
  {
    if (paramObject == null) {}
    for (paramObject = null;; paramObject = paramObject.toString())
    {
      RetValManager.sendError((String)paramObject);
      return;
    }
  }
  
  public Object write$Click()
  {
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit60, Lit61, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("Text_Data/", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit4, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit62, "join"), Lit16);
    runtime.callComponentMethod(Lit60, Lit63, LList.list2("posi", runtime.get$Mnproperty.apply2(Lit54, Lit15)), Lit64);
    runtime.callComponentMethod(Lit60, Lit63, LList.list2("content", runtime.get$Mnproperty.apply2(Lit45, Lit15)), Lit65);
    runtime.callComponentMethod(Lit60, Lit63, LList.list2("price", runtime.get$Mnproperty.apply2(Lit48, Lit15)), Lit66);
    runtime.callComponentMethod(Lit60, Lit63, LList.list2("date", runtime.get$Mnproperty.apply2(Lit51, Lit15)), Lit67);
    runtime.callComponentMethod(Lit60, Lit63, LList.list2("title", runtime.get$Mnproperty.apply2(Lit41, Lit15)), Lit68);
    runtime.callComponentMethod(Lit69, Lit70, LList.list1("湲��벐湲곌� �셿猷뚮릺�뿀�뒿�땲�떎."), Lit71);
    return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("main", runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit72, "open another screen with start value");
  }
}
