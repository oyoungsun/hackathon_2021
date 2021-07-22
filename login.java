package appinventor.ai_oyoungsun1030.last4;

import android.os.Bundle;
import com.google.appinventor.components.runtime.AppInventorCompatActivity;
import com.google.appinventor.components.runtime.Button;
import com.google.appinventor.components.runtime.Clock;
import com.google.appinventor.components.runtime.Component;
import com.google.appinventor.components.runtime.EventDispatcher;
import com.google.appinventor.components.runtime.FirebaseDB;
import com.google.appinventor.components.runtime.Form;
import com.google.appinventor.components.runtime.HandlesEventDispatching;
import com.google.appinventor.components.runtime.Image;
import com.google.appinventor.components.runtime.Label;
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
import gnu.kawa.functions.DivideOp;
import gnu.kawa.functions.Format;
import gnu.kawa.functions.GetNamedPart;
import gnu.kawa.functions.IsEqual;
import gnu.kawa.functions.MultiplyOp;
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

public class login
  extends Form
  implements Runnable
{
  static final SimpleSymbol Lit0 = (SimpleSymbol)new SimpleSymbol("login").readResolve();
  static final SimpleSymbol Lit1;
  static final IntNum Lit10;
  static final SimpleSymbol Lit100;
  static final SimpleSymbol Lit101;
  static final IntNum Lit102;
  static final FString Lit103;
  static final FString Lit104;
  static final SimpleSymbol Lit105;
  static final FString Lit106;
  static final FString Lit107;
  static final SimpleSymbol Lit108;
  static final FString Lit109;
  static final PairWithPosition Lit11;
  static final FString Lit110;
  static final SimpleSymbol Lit111;
  static final IntNum Lit112;
  static final IntNum Lit113;
  static final FString Lit114;
  static final PairWithPosition Lit115;
  static final SimpleSymbol Lit116;
  static final PairWithPosition Lit117;
  static final SimpleSymbol Lit118;
  static final FString Lit119;
  static final PairWithPosition Lit12;
  static final SimpleSymbol Lit120;
  static final IntNum Lit121;
  static final IntNum Lit122;
  static final FString Lit123;
  static final SimpleSymbol Lit124;
  static final FString Lit125;
  static final SimpleSymbol Lit126;
  static final IntNum Lit127;
  static final FString Lit128;
  static final SimpleSymbol Lit129;
  static final SimpleSymbol Lit13;
  static final FString Lit130;
  static final SimpleSymbol Lit131;
  static final SimpleSymbol Lit132;
  static final SimpleSymbol Lit133;
  static final SimpleSymbol Lit134;
  static final SimpleSymbol Lit135;
  static final FString Lit136;
  static final FString Lit137;
  static final SimpleSymbol Lit138;
  static final FString Lit139;
  static final PairWithPosition Lit14;
  static final FString Lit140;
  static final FString Lit141;
  static final SimpleSymbol Lit142;
  static final PairWithPosition Lit143;
  static final SimpleSymbol Lit144;
  static final SimpleSymbol Lit145;
  static final PairWithPosition Lit146;
  static final PairWithPosition Lit147;
  static final PairWithPosition Lit148;
  static final PairWithPosition Lit149;
  static final PairWithPosition Lit15;
  static final PairWithPosition Lit150;
  static final PairWithPosition Lit151;
  static final SimpleSymbol Lit152;
  static final SimpleSymbol Lit153;
  static final FString Lit154;
  static final FString Lit155;
  static final SimpleSymbol Lit156;
  static final SimpleSymbol Lit157;
  static final SimpleSymbol Lit158;
  static final SimpleSymbol Lit159;
  static final SimpleSymbol Lit16;
  static final SimpleSymbol Lit160;
  static final SimpleSymbol Lit161;
  static final SimpleSymbol Lit162;
  static final SimpleSymbol Lit163;
  static final SimpleSymbol Lit164;
  static final SimpleSymbol Lit165;
  static final SimpleSymbol Lit166;
  static final SimpleSymbol Lit167;
  static final SimpleSymbol Lit168;
  static final SimpleSymbol Lit169;
  static final IntNum Lit17;
  static final SimpleSymbol Lit170 = (SimpleSymbol)new SimpleSymbol("any").readResolve();
  static final SimpleSymbol Lit18;
  static final SimpleSymbol Lit19;
  static final SimpleSymbol Lit2;
  static final SimpleSymbol Lit20;
  static final PairWithPosition Lit21;
  static final IntNum Lit22;
  static final PairWithPosition Lit23;
  static final PairWithPosition Lit24;
  static final PairWithPosition Lit25;
  static final SimpleSymbol Lit26;
  static final SimpleSymbol Lit27;
  static final SimpleSymbol Lit28;
  static final SimpleSymbol Lit29;
  static final SimpleSymbol Lit3;
  static final IntNum Lit30;
  static final SimpleSymbol Lit31;
  static final SimpleSymbol Lit32;
  static final SimpleSymbol Lit33;
  static final SimpleSymbol Lit34;
  static final SimpleSymbol Lit35;
  static final SimpleSymbol Lit36;
  static final FString Lit37;
  static final SimpleSymbol Lit38;
  static final IntNum Lit39;
  static final SimpleSymbol Lit4;
  static final SimpleSymbol Lit40;
  static final IntNum Lit41;
  static final SimpleSymbol Lit42;
  static final IntNum Lit43;
  static final SimpleSymbol Lit44;
  static final FString Lit45;
  static final FString Lit46;
  static final SimpleSymbol Lit47;
  static final SimpleSymbol Lit48;
  static final IntNum Lit49;
  static final SimpleSymbol Lit5;
  static final SimpleSymbol Lit50;
  static final FString Lit51;
  static final FString Lit52;
  static final SimpleSymbol Lit53;
  static final SimpleSymbol Lit54;
  static final FString Lit55;
  static final FString Lit56;
  static final SimpleSymbol Lit57;
  static final FString Lit58;
  static final FString Lit59;
  static final SimpleSymbol Lit6;
  static final SimpleSymbol Lit60;
  static final FString Lit61;
  static final FString Lit62;
  static final SimpleSymbol Lit63;
  static final FString Lit64;
  static final FString Lit65;
  static final SimpleSymbol Lit66;
  static final FString Lit67;
  static final FString Lit68;
  static final SimpleSymbol Lit69;
  static final SimpleSymbol Lit7;
  static final FString Lit70;
  static final FString Lit71;
  static final SimpleSymbol Lit72;
  static final IntNum Lit73;
  static final FString Lit74;
  static final SimpleSymbol Lit75;
  static final SimpleSymbol Lit76;
  static final PairWithPosition Lit77;
  static final SimpleSymbol Lit78;
  static final PairWithPosition Lit79;
  static final SimpleSymbol Lit8;
  static final PairWithPosition Lit80;
  static final PairWithPosition Lit81;
  static final PairWithPosition Lit82;
  static final PairWithPosition Lit83;
  static final SimpleSymbol Lit84;
  static final SimpleSymbol Lit85;
  static final FString Lit86;
  static final SimpleSymbol Lit87;
  static final IntNum Lit88;
  static final FString Lit89;
  static final IntNum Lit9;
  static final SimpleSymbol Lit90;
  static final FString Lit91;
  static final IntNum Lit92;
  static final FString Lit93;
  static final FString Lit94;
  static final SimpleSymbol Lit95;
  static final SimpleSymbol Lit96;
  static final IntNum Lit97;
  static final FString Lit98;
  static final FString Lit99;
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
  static final ModuleMethod lambda$Fn40;
  static final ModuleMethod lambda$Fn41;
  static final ModuleMethod lambda$Fn42;
  static final ModuleMethod lambda$Fn43;
  static final ModuleMethod lambda$Fn44;
  static final ModuleMethod lambda$Fn45;
  static final ModuleMethod lambda$Fn46;
  static final ModuleMethod lambda$Fn47;
  static final ModuleMethod lambda$Fn48;
  static final ModuleMethod lambda$Fn49;
  static final ModuleMethod lambda$Fn5;
  static final ModuleMethod lambda$Fn50;
  static final ModuleMethod lambda$Fn51;
  static final ModuleMethod lambda$Fn52;
  static final ModuleMethod lambda$Fn6;
  static final ModuleMethod lambda$Fn7;
  static final ModuleMethod lambda$Fn8;
  static final ModuleMethod lambda$Fn9;
  public static login login;
  public Boolean $Stdebug$Mnform$St;
  public final ModuleMethod $define;
  public final ModuleMethod add$Mnto$Mncomponents;
  public final ModuleMethod add$Mnto$Mnevents;
  public final ModuleMethod add$Mnto$Mnform$Mndo$Mnafter$Mncreation;
  public final ModuleMethod add$Mnto$Mnform$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvar$Mnenvironment;
  public final ModuleMethod add$Mnto$Mnglobal$Mnvars;
  public Notifier alarm;
  public final ModuleMethod android$Mnlog$Mnform;
  public Button button_cancel_signup;
  public final ModuleMethod button_cancel_signup$Click;
  public Button button_login;
  public final ModuleMethod button_login$Click;
  public Button button_request_signup;
  public final ModuleMethod button_request_signup$Click;
  public Button button_signup;
  public final ModuleMethod button_signup$Click;
  public Clock clock;
  public LList components$Mnto$Mncreate;
  public final ModuleMethod dispatchEvent;
  public final ModuleMethod dispatchGenericEvent;
  public LList events$Mnto$Mnregister;
  public Button exit;
  public final ModuleMethod exit$Click;
  public FirebaseDB firebase_DB1;
  public FirebaseDB firebase_DB2;
  public final ModuleMethod firebase_DB2$GotValue;
  public LList form$Mndo$Mnafter$Mncreation;
  public Environment form$Mnenvironment;
  public Symbol form$Mnname$Mnsymbol;
  public final ModuleMethod get$Mnsimple$Mnname;
  public Environment global$Mnvar$Mnenvironment;
  public LList global$Mnvars$Mnto$Mncreate;
  public Image image;
  public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
  public Label label1;
  public Label label2;
  public final ModuleMethod login$Initialize;
  public final ModuleMethod lookup$Mnhandler;
  public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
  public final ModuleMethod onCreate;
  public final ModuleMethod process$Mnexception;
  public final ModuleMethod send$Mnerror;
  public TextBox textbox_login_password;
  public TextBox textbox_login_username;
  public TextBox textbox_signup_age;
  public TextBox textbox_signup_name;
  public TextBox textbox_signup_password;
  public TextBox textbox_signup_sex;
  public TextBox textbox_signup_unit;
  public TextBox textbox_signup_username;
  public VerticalArrangement vertical_login;
  public VerticalArrangement vertical_signup;
  
  static
  {
    Lit169 = (SimpleSymbol)new SimpleSymbol("lookup-handler").readResolve();
    Lit168 = (SimpleSymbol)new SimpleSymbol("dispatchGenericEvent").readResolve();
    Lit167 = (SimpleSymbol)new SimpleSymbol("dispatchEvent").readResolve();
    Lit166 = (SimpleSymbol)new SimpleSymbol("send-error").readResolve();
    Lit165 = (SimpleSymbol)new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    Lit164 = (SimpleSymbol)new SimpleSymbol("add-to-global-vars").readResolve();
    Lit163 = (SimpleSymbol)new SimpleSymbol("add-to-components").readResolve();
    Lit162 = (SimpleSymbol)new SimpleSymbol("add-to-events").readResolve();
    Lit161 = (SimpleSymbol)new SimpleSymbol("add-to-global-var-environment").readResolve();
    Lit160 = (SimpleSymbol)new SimpleSymbol("is-bound-in-form-environment").readResolve();
    Lit159 = (SimpleSymbol)new SimpleSymbol("lookup-in-form-environment").readResolve();
    Lit158 = (SimpleSymbol)new SimpleSymbol("add-to-form-environment").readResolve();
    Lit157 = (SimpleSymbol)new SimpleSymbol("android-log-form").readResolve();
    Lit156 = (SimpleSymbol)new SimpleSymbol("get-simple-name").readResolve();
    Lit155 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit154 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit153 = (SimpleSymbol)new SimpleSymbol("GotValue").readResolve();
    Lit152 = (SimpleSymbol)new SimpleSymbol("firebase_DB2$GotValue").readResolve();
    Object localObject = (SimpleSymbol)new SimpleSymbol("text").readResolve();
    Lit28 = (SimpleSymbol)localObject;
    Lit151 = PairWithPosition.make(localObject, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979881);
    Lit150 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979746), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979740);
    Lit149 = PairWithPosition.make(Lit170, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979717), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979712);
    Lit148 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979394);
    Lit147 = PairWithPosition.make(Lit170, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979303), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979298);
    Lit146 = PairWithPosition.make(Lit28, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979153);
    Lit145 = (SimpleSymbol)new SimpleSymbol("ShowAlert").readResolve();
    Lit144 = (SimpleSymbol)new SimpleSymbol("alarm").readResolve();
    Lit143 = PairWithPosition.make(Lit170, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979050), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 979045);
    Lit142 = (SimpleSymbol)new SimpleSymbol("$value").readResolve();
    Lit141 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit140 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit139 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit138 = (SimpleSymbol)new SimpleSymbol("clock").readResolve();
    Lit137 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit136 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit135 = (SimpleSymbol)new SimpleSymbol("FirebaseURL").readResolve();
    Lit134 = (SimpleSymbol)new SimpleSymbol("FirebaseToken").readResolve();
    Lit133 = (SimpleSymbol)new SimpleSymbol("DeveloperBucket").readResolve();
    Lit132 = (SimpleSymbol)new SimpleSymbol("DefaultURL").readResolve();
    Lit131 = (SimpleSymbol)new SimpleSymbol("firebase_DB1").readResolve();
    Lit130 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit129 = (SimpleSymbol)new SimpleSymbol("exit$Click").readResolve();
    Lit128 = new FString("com.google.appinventor.components.runtime.Button");
    localObject = new int[2];
    localObject[0] = 42075;
    Lit127 = IntNum.make((int[])localObject);
    Lit126 = (SimpleSymbol)new SimpleSymbol("exit").readResolve();
    Lit125 = new FString("com.google.appinventor.components.runtime.Button");
    Lit124 = (SimpleSymbol)new SimpleSymbol("button_signup$Click").readResolve();
    Lit123 = new FString("com.google.appinventor.components.runtime.Button");
    Lit122 = IntNum.make(64486);
    localObject = new int[2];
    localObject[0] = 55927;
    Lit121 = IntNum.make((int[])localObject);
    Lit120 = (SimpleSymbol)new SimpleSymbol("button_signup").readResolve();
    Lit119 = new FString("com.google.appinventor.components.runtime.Button");
    Lit118 = (SimpleSymbol)new SimpleSymbol("button_login$Click").readResolve();
    Lit117 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 729426), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 729420);
    Lit116 = (SimpleSymbol)new SimpleSymbol("GetValue").readResolve();
    Lit115 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 729270), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 729264);
    Lit114 = new FString("com.google.appinventor.components.runtime.Button");
    Lit113 = IntNum.make(64486);
    localObject = new int[2];
    localObject[0] = 55927;
    Lit112 = IntNum.make((int[])localObject);
    Lit111 = (SimpleSymbol)new SimpleSymbol("button_login").readResolve();
    Lit110 = new FString("com.google.appinventor.components.runtime.Button");
    Lit109 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit108 = (SimpleSymbol)new SimpleSymbol("textbox_login_password").readResolve();
    Lit107 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit106 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit105 = (SimpleSymbol)new SimpleSymbol("textbox_login_username").readResolve();
    Lit104 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit103 = new FString("com.google.appinventor.components.runtime.Label");
    Lit102 = IntNum.make(25);
    Lit101 = (SimpleSymbol)new SimpleSymbol("FontBold").readResolve();
    Lit100 = (SimpleSymbol)new SimpleSymbol("label1").readResolve();
    Lit99 = new FString("com.google.appinventor.components.runtime.Label");
    Lit98 = new FString("com.google.appinventor.components.runtime.Image");
    Lit97 = IntNum.make(120);
    Lit96 = (SimpleSymbol)new SimpleSymbol("Picture").readResolve();
    Lit95 = (SimpleSymbol)new SimpleSymbol("image").readResolve();
    Lit94 = new FString("com.google.appinventor.components.runtime.Image");
    Lit93 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    localObject = new int[2];
    localObject[0] = -264464;
    Lit92 = IntNum.make((int[])localObject);
    Lit91 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit90 = (SimpleSymbol)new SimpleSymbol("button_cancel_signup$Click").readResolve();
    Lit89 = new FString("com.google.appinventor.components.runtime.Button");
    Lit88 = IntNum.make(64486);
    Lit87 = (SimpleSymbol)new SimpleSymbol("button_cancel_signup").readResolve();
    Lit86 = new FString("com.google.appinventor.components.runtime.Button");
    Lit85 = (SimpleSymbol)new SimpleSymbol("Click").readResolve();
    Lit84 = (SimpleSymbol)new SimpleSymbol("button_request_signup$Click").readResolve();
    Lit83 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422786), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422780);
    Lit82 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422654), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422648);
    Lit81 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422524), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422518);
    Lit80 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422392), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422386);
    Lit79 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit170, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422262), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422256);
    Lit78 = (SimpleSymbol)new SimpleSymbol("StoreValue").readResolve();
    Lit77 = PairWithPosition.make(Lit28, PairWithPosition.make(Lit28, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422071), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 422065);
    Lit76 = (SimpleSymbol)new SimpleSymbol("ProjectBucket").readResolve();
    Lit75 = (SimpleSymbol)new SimpleSymbol("firebase_DB2").readResolve();
    Lit74 = new FString("com.google.appinventor.components.runtime.Button");
    Lit73 = IntNum.make(64486);
    Lit72 = (SimpleSymbol)new SimpleSymbol("button_request_signup").readResolve();
    Lit71 = new FString("com.google.appinventor.components.runtime.Button");
    Lit70 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit69 = (SimpleSymbol)new SimpleSymbol("textbox_signup_sex").readResolve();
    Lit68 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit67 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit66 = (SimpleSymbol)new SimpleSymbol("textbox_signup_unit").readResolve();
    Lit65 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit64 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit63 = (SimpleSymbol)new SimpleSymbol("textbox_signup_age").readResolve();
    Lit62 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit61 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit60 = (SimpleSymbol)new SimpleSymbol("textbox_signup_name").readResolve();
    Lit59 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit58 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit57 = (SimpleSymbol)new SimpleSymbol("textbox_signup_password").readResolve();
    Lit56 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit55 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit54 = (SimpleSymbol)new SimpleSymbol("Hint").readResolve();
    Lit53 = (SimpleSymbol)new SimpleSymbol("textbox_signup_username").readResolve();
    Lit52 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit51 = new FString("com.google.appinventor.components.runtime.Label");
    Lit50 = (SimpleSymbol)new SimpleSymbol("Text").readResolve();
    Lit49 = IntNum.make(15);
    Lit48 = (SimpleSymbol)new SimpleSymbol("FontSize").readResolve();
    Lit47 = (SimpleSymbol)new SimpleSymbol("label2").readResolve();
    Lit46 = new FString("com.google.appinventor.components.runtime.Label");
    Lit45 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit44 = (SimpleSymbol)new SimpleSymbol("Width").readResolve();
    Lit43 = IntNum.make(-2);
    Lit42 = (SimpleSymbol)new SimpleSymbol("Height").readResolve();
    Lit41 = IntNum.make(2);
    Lit40 = (SimpleSymbol)new SimpleSymbol("AlignVertical").readResolve();
    Lit39 = IntNum.make(3);
    Lit38 = (SimpleSymbol)new SimpleSymbol("AlignHorizontal").readResolve();
    Lit37 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit36 = (SimpleSymbol)new SimpleSymbol("Initialize").readResolve();
    Lit35 = (SimpleSymbol)new SimpleSymbol("login$Initialize").readResolve();
    Lit34 = (SimpleSymbol)new SimpleSymbol("Title").readResolve();
    Lit33 = (SimpleSymbol)new SimpleSymbol("Sizing").readResolve();
    Lit32 = (SimpleSymbol)new SimpleSymbol("ShowListsAsJson").readResolve();
    Lit31 = (SimpleSymbol)new SimpleSymbol("number").readResolve();
    localObject = new int[2];
    localObject[0] = -264464;
    Lit30 = IntNum.make((int[])localObject);
    Lit29 = (SimpleSymbol)new SimpleSymbol("BackgroundColor").readResolve();
    Lit27 = (SimpleSymbol)new SimpleSymbol("AppName").readResolve();
    Lit26 = (SimpleSymbol)new SimpleSymbol("g$room_user_list").readResolve();
    Lit25 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49351), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49343);
    Lit24 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49322), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49314);
    Lit23 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49351), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49343);
    Lit22 = IntNum.make(1000);
    Lit21 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49322), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 49314);
    Lit20 = (SimpleSymbol)new SimpleSymbol("$y").readResolve();
    Lit19 = (SimpleSymbol)new SimpleSymbol("$x").readResolve();
    Lit18 = (SimpleSymbol)new SimpleSymbol("p$make_room_key").readResolve();
    Lit17 = IntNum.make(0);
    Lit16 = (SimpleSymbol)new SimpleSymbol("g$room_key").readResolve();
    Lit15 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 41046), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 41038);
    Lit14 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 41046), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 41038);
    Lit13 = (SimpleSymbol)new SimpleSymbol("g$�쑀��2").readResolve();
    Lit12 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 36950), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 36942);
    Lit11 = PairWithPosition.make(Lit31, PairWithPosition.make(Lit31, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 36950), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/login.yail", 36942);
    Lit10 = IntNum.make(999);
    Lit9 = IntNum.make(100);
    Lit8 = (SimpleSymbol)new SimpleSymbol("g$�쑀��1").readResolve();
    Lit7 = (SimpleSymbol)new SimpleSymbol("vertical_signup").readResolve();
    Lit6 = (SimpleSymbol)new SimpleSymbol("boolean").readResolve();
    Lit5 = (SimpleSymbol)new SimpleSymbol("Visible").readResolve();
    Lit4 = (SimpleSymbol)new SimpleSymbol("vertical_login").readResolve();
    Lit3 = (SimpleSymbol)new SimpleSymbol("p$clear_all_pages").readResolve();
    Lit2 = (SimpleSymbol)new SimpleSymbol("*the-null-value*").readResolve();
    Lit1 = (SimpleSymbol)new SimpleSymbol("getMessage").readResolve();
  }
  
  public login()
  {
    ModuleInfo.register(this);
    login.frame localframe = new login.frame();
    $main = this;
    get$Mnsimple$Mnname = new ModuleMethod(localframe, 1, Lit156, 4097);
    onCreate = new ModuleMethod(localframe, 2, "onCreate", 4097);
    android$Mnlog$Mnform = new ModuleMethod(localframe, 3, Lit157, 4097);
    add$Mnto$Mnform$Mnenvironment = new ModuleMethod(localframe, 4, Lit158, 8194);
    lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 5, Lit159, 8193);
    is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 7, Lit160, 4097);
    add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(localframe, 8, Lit161, 8194);
    add$Mnto$Mnevents = new ModuleMethod(localframe, 9, Lit162, 8194);
    add$Mnto$Mncomponents = new ModuleMethod(localframe, 10, Lit163, 16388);
    add$Mnto$Mnglobal$Mnvars = new ModuleMethod(localframe, 11, Lit164, 8194);
    add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(localframe, 12, Lit165, 4097);
    send$Mnerror = new ModuleMethod(localframe, 13, Lit166, 4097);
    process$Mnexception = new ModuleMethod(localframe, 14, "process-exception", 4097);
    dispatchEvent = new ModuleMethod(localframe, 15, Lit167, 16388);
    dispatchGenericEvent = new ModuleMethod(localframe, 16, Lit168, 16388);
    lookup$Mnhandler = new ModuleMethod(localframe, 17, Lit169, 8194);
    ModuleMethod localModuleMethod = new ModuleMethod(localframe, 18, null, 0);
    localModuleMethod.setProperty("source-location", "/tmp/runtime4163479401509002272.scm:622");
    lambda$Fn1 = localModuleMethod;
    $define = new ModuleMethod(localframe, 19, "$define", 0);
    lambda$Fn2 = new ModuleMethod(localframe, 20, null, 0);
    lambda$Fn4 = new ModuleMethod(localframe, 21, null, 0);
    lambda$Fn3 = new ModuleMethod(localframe, 22, null, 0);
    lambda$Fn5 = new ModuleMethod(localframe, 23, null, 0);
    lambda$Fn6 = new ModuleMethod(localframe, 24, null, 0);
    lambda$Fn7 = new ModuleMethod(localframe, 25, null, 0);
    lambda$Fn8 = new ModuleMethod(localframe, 26, null, 8194);
    lambda$Fn10 = new ModuleMethod(localframe, 27, null, 8194);
    lambda$Fn9 = new ModuleMethod(localframe, 28, null, 0);
    lambda$Fn11 = new ModuleMethod(localframe, 29, null, 0);
    lambda$Fn12 = new ModuleMethod(localframe, 30, null, 0);
    login$Initialize = new ModuleMethod(localframe, 31, Lit35, 0);
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
    lambda$Fn26 = new ModuleMethod(localframe, 45, null, 0);
    lambda$Fn27 = new ModuleMethod(localframe, 46, null, 0);
    lambda$Fn28 = new ModuleMethod(localframe, 47, null, 0);
    lambda$Fn29 = new ModuleMethod(localframe, 48, null, 0);
    lambda$Fn30 = new ModuleMethod(localframe, 49, null, 0);
    button_request_signup$Click = new ModuleMethod(localframe, 50, Lit84, 0);
    lambda$Fn31 = new ModuleMethod(localframe, 51, null, 0);
    lambda$Fn32 = new ModuleMethod(localframe, 52, null, 0);
    button_cancel_signup$Click = new ModuleMethod(localframe, 53, Lit90, 0);
    lambda$Fn33 = new ModuleMethod(localframe, 54, null, 0);
    lambda$Fn34 = new ModuleMethod(localframe, 55, null, 0);
    lambda$Fn35 = new ModuleMethod(localframe, 56, null, 0);
    lambda$Fn36 = new ModuleMethod(localframe, 57, null, 0);
    lambda$Fn37 = new ModuleMethod(localframe, 58, null, 0);
    lambda$Fn38 = new ModuleMethod(localframe, 59, null, 0);
    lambda$Fn39 = new ModuleMethod(localframe, 60, null, 0);
    lambda$Fn40 = new ModuleMethod(localframe, 61, null, 0);
    lambda$Fn41 = new ModuleMethod(localframe, 62, null, 0);
    lambda$Fn42 = new ModuleMethod(localframe, 63, null, 0);
    lambda$Fn43 = new ModuleMethod(localframe, 64, null, 0);
    lambda$Fn44 = new ModuleMethod(localframe, 65, null, 0);
    button_login$Click = new ModuleMethod(localframe, 66, Lit118, 0);
    lambda$Fn45 = new ModuleMethod(localframe, 67, null, 0);
    lambda$Fn46 = new ModuleMethod(localframe, 68, null, 0);
    button_signup$Click = new ModuleMethod(localframe, 69, Lit124, 0);
    lambda$Fn47 = new ModuleMethod(localframe, 70, null, 0);
    lambda$Fn48 = new ModuleMethod(localframe, 71, null, 0);
    exit$Click = new ModuleMethod(localframe, 72, Lit129, 0);
    lambda$Fn49 = new ModuleMethod(localframe, 73, null, 0);
    lambda$Fn50 = new ModuleMethod(localframe, 74, null, 0);
    lambda$Fn51 = new ModuleMethod(localframe, 75, null, 0);
    lambda$Fn52 = new ModuleMethod(localframe, 76, null, 0);
    firebase_DB2$GotValue = new ModuleMethod(localframe, 77, Lit152, 8194);
  }
  
  static Procedure lambda10()
  {
    return lambda$Fn10;
  }
  
  static Object lambda11(Object paramObject1, Object paramObject2)
  {
    DivideOp localDivideOp = DivideOp.modulo;
    MultiplyOp localMultiplyOp = MultiplyOp.$St;
    Object localObject = paramObject1;
    if ((paramObject1 instanceof Package)) {
      localObject = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit19), " is not bound in the current context" }), "Unbound Variable");
    }
    paramObject1 = paramObject2;
    if ((paramObject2 instanceof Package)) {
      paramObject1 = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit20), " is not bound in the current context" }), "Unbound Variable");
    }
    return runtime.callYailPrimitive(localDivideOp, LList.list2(runtime.callYailPrimitive(localMultiplyOp, LList.list2(localObject, paramObject1), Lit24, "*"), Lit22), Lit25, "modulo");
  }
  
  static Object lambda12()
  {
    return runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list");
  }
  
  static Object lambda13()
  {
    runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "chat", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Lit30, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit32, Boolean.FALSE, Lit6);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "Fixed", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "login", Lit28);
  }
  
  static Object lambda14()
  {
    runtime.setAndCoerceProperty$Ex(Lit7, Lit38, Lit39, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit7, Lit40, Lit41, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit7, Lit42, Lit43, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit7, Lit5, Boolean.FALSE, Lit6);
    return runtime.setAndCoerceProperty$Ex(Lit7, Lit44, Lit43, Lit31);
  }
  
  static Object lambda15()
  {
    runtime.setAndCoerceProperty$Ex(Lit7, Lit38, Lit39, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit7, Lit40, Lit41, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit7, Lit42, Lit43, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit7, Lit5, Boolean.FALSE, Lit6);
    return runtime.setAndCoerceProperty$Ex(Lit7, Lit44, Lit43, Lit31);
  }
  
  static Object lambda16()
  {
    runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit50, "ONSIMI TALK �쉶�썝媛��엯 �븯湲�", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit5, Boolean.FALSE, Lit6);
  }
  
  static Object lambda17()
  {
    runtime.setAndCoerceProperty$Ex(Lit47, Lit48, Lit49, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit47, Lit50, "ONSIMI TALK �쉶�썝媛��엯 �븯湲�", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit47, Lit5, Boolean.FALSE, Lit6);
  }
  
  static Object lambda18()
  {
    return runtime.setAndCoerceProperty$Ex(Lit53, Lit54, "username", Lit28);
  }
  
  static Object lambda19()
  {
    return runtime.setAndCoerceProperty$Ex(Lit53, Lit54, "username", Lit28);
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
    return runtime.setAndCoerceProperty$Ex(Lit57, Lit54, "password", Lit28);
  }
  
  static Object lambda21()
  {
    return runtime.setAndCoerceProperty$Ex(Lit57, Lit54, "password", Lit28);
  }
  
  static Object lambda22()
  {
    return runtime.setAndCoerceProperty$Ex(Lit60, Lit54, "name", Lit28);
  }
  
  static Object lambda23()
  {
    return runtime.setAndCoerceProperty$Ex(Lit60, Lit54, "name", Lit28);
  }
  
  static Object lambda24()
  {
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit54, "age", Lit28);
  }
  
  static Object lambda25()
  {
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit54, "age", Lit28);
  }
  
  static Object lambda26()
  {
    return runtime.setAndCoerceProperty$Ex(Lit66, Lit54, "unit", Lit28);
  }
  
  static Object lambda27()
  {
    return runtime.setAndCoerceProperty$Ex(Lit66, Lit54, "unit", Lit28);
  }
  
  static Object lambda28()
  {
    return runtime.setAndCoerceProperty$Ex(Lit69, Lit54, "sex", Lit28);
  }
  
  static Object lambda29()
  {
    return runtime.setAndCoerceProperty$Ex(Lit69, Lit54, "sex", Lit28);
  }
  
  static Object lambda3()
  {
    runtime.setAndCoerceProperty$Ex(Lit4, Lit5, Boolean.FALSE, Lit6);
    return runtime.setAndCoerceProperty$Ex(Lit7, Lit5, Boolean.FALSE, Lit6);
  }
  
  static Object lambda30()
  {
    runtime.setAndCoerceProperty$Ex(Lit72, Lit50, "媛��엯 �떊泥��븯湲�", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit72, Lit44, Lit73, Lit31);
  }
  
  static Object lambda31()
  {
    runtime.setAndCoerceProperty$Ex(Lit72, Lit50, "媛��엯 �떊泥��븯湲�", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit72, Lit44, Lit73, Lit31);
  }
  
  static Object lambda32()
  {
    runtime.setAndCoerceProperty$Ex(Lit87, Lit50, "媛��엯 痍⑥냼�븯湲�", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit87, Lit44, Lit88, Lit31);
  }
  
  static Object lambda33()
  {
    runtime.setAndCoerceProperty$Ex(Lit87, Lit50, "媛��엯 痍⑥냼�븯湲�", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit87, Lit44, Lit88, Lit31);
  }
  
  static Object lambda34()
  {
    runtime.setAndCoerceProperty$Ex(Lit4, Lit38, Lit39, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit4, Lit40, Lit41, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit4, Lit29, Lit92, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit4, Lit42, Lit43, Lit31);
    return runtime.setAndCoerceProperty$Ex(Lit4, Lit44, Lit43, Lit31);
  }
  
  static Object lambda35()
  {
    runtime.setAndCoerceProperty$Ex(Lit4, Lit38, Lit39, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit4, Lit40, Lit41, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit4, Lit29, Lit92, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit4, Lit42, Lit43, Lit31);
    return runtime.setAndCoerceProperty$Ex(Lit4, Lit44, Lit43, Lit31);
  }
  
  static Object lambda36()
  {
    runtime.setAndCoerceProperty$Ex(Lit95, Lit42, Lit9, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit95, Lit96, "ongsimi.png", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit95, Lit44, Lit97, Lit31);
  }
  
  static Object lambda37()
  {
    runtime.setAndCoerceProperty$Ex(Lit95, Lit42, Lit9, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit95, Lit96, "ongsimi.png", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit95, Lit44, Lit97, Lit31);
  }
  
  static Object lambda38()
  {
    runtime.setAndCoerceProperty$Ex(Lit100, Lit101, Boolean.TRUE, Lit6);
    runtime.setAndCoerceProperty$Ex(Lit100, Lit48, Lit102, Lit31);
    return runtime.setAndCoerceProperty$Ex(Lit100, Lit50, "ONGSIMI TALK", Lit28);
  }
  
  static Object lambda39()
  {
    runtime.setAndCoerceProperty$Ex(Lit100, Lit101, Boolean.TRUE, Lit6);
    runtime.setAndCoerceProperty$Ex(Lit100, Lit48, Lit102, Lit31);
    return runtime.setAndCoerceProperty$Ex(Lit100, Lit50, "ONGSIMI TALK", Lit28);
  }
  
  static Procedure lambda4()
  {
    return lambda$Fn4;
  }
  
  static Object lambda40()
  {
    return runtime.setAndCoerceProperty$Ex(Lit105, Lit54, "�궗�슜�옄紐�", Lit28);
  }
  
  static Object lambda41()
  {
    return runtime.setAndCoerceProperty$Ex(Lit105, Lit54, "�궗�슜�옄紐�", Lit28);
  }
  
  static Object lambda42()
  {
    return runtime.setAndCoerceProperty$Ex(Lit108, Lit54, "鍮꾨�踰덊샇", Lit28);
  }
  
  static Object lambda43()
  {
    return runtime.setAndCoerceProperty$Ex(Lit108, Lit54, "鍮꾨�踰덊샇", Lit28);
  }
  
  static Object lambda44()
  {
    runtime.setAndCoerceProperty$Ex(Lit111, Lit29, Lit112, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit111, Lit50, "濡쒓렇�씤", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit111, Lit44, Lit113, Lit31);
  }
  
  static Object lambda45()
  {
    runtime.setAndCoerceProperty$Ex(Lit111, Lit29, Lit112, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit111, Lit50, "濡쒓렇�씤", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit111, Lit44, Lit113, Lit31);
  }
  
  static Object lambda46()
  {
    runtime.setAndCoerceProperty$Ex(Lit120, Lit29, Lit121, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit120, Lit50, "�쉶�썝媛��엯", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit120, Lit44, Lit122, Lit31);
  }
  
  static Object lambda47()
  {
    runtime.setAndCoerceProperty$Ex(Lit120, Lit29, Lit121, Lit31);
    runtime.setAndCoerceProperty$Ex(Lit120, Lit50, "�쉶�썝媛��엯", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit120, Lit44, Lit122, Lit31);
  }
  
  static Object lambda48()
  {
    runtime.setAndCoerceProperty$Ex(Lit126, Lit29, Lit127, Lit31);
    return runtime.setAndCoerceProperty$Ex(Lit126, Lit50, "醫낅즺", Lit28);
  }
  
  static Object lambda49()
  {
    runtime.setAndCoerceProperty$Ex(Lit126, Lit29, Lit127, Lit31);
    return runtime.setAndCoerceProperty$Ex(Lit126, Lit50, "醫낅즺", Lit28);
  }
  
  static Object lambda5()
  {
    runtime.setAndCoerceProperty$Ex(Lit4, Lit5, Boolean.FALSE, Lit6);
    return runtime.setAndCoerceProperty$Ex(Lit7, Lit5, Boolean.FALSE, Lit6);
  }
  
  static Object lambda50()
  {
    runtime.setAndCoerceProperty$Ex(Lit131, Lit132, "https://dazzling-fire-7140.firebaseio.com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit131, Lit133, "oyoungsun1030@gmail:com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit131, Lit134, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit131, Lit135, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit131, Lit76, "last_2", Lit28);
  }
  
  static Object lambda51()
  {
    runtime.setAndCoerceProperty$Ex(Lit131, Lit132, "https://dazzling-fire-7140.firebaseio.com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit131, Lit133, "oyoungsun1030@gmail:com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit131, Lit134, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit131, Lit135, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit131, Lit76, "last_2", Lit28);
  }
  
  static Object lambda52()
  {
    runtime.setAndCoerceProperty$Ex(Lit75, Lit132, "https://dazzling-fire-7140.firebaseio.com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit133, "oyoungsun1030@gmail:com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit134, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit135, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit75, Lit76, "last_2", Lit28);
  }
  
  static Object lambda53()
  {
    runtime.setAndCoerceProperty$Ex(Lit75, Lit132, "https://dazzling-fire-7140.firebaseio.com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit133, "oyoungsun1030@gmail:com/", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit134, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit28);
    runtime.setAndCoerceProperty$Ex(Lit75, Lit135, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit28);
    return runtime.setAndCoerceProperty$Ex(Lit75, Lit76, "last_2", Lit28);
  }
  
  static Object lambda6()
  {
    return runtime.callYailPrimitive(runtime.random$Mninteger, LList.list2(Lit9, Lit10), Lit12, "random integer");
  }
  
  static Object lambda7()
  {
    return runtime.callYailPrimitive(runtime.random$Mninteger, LList.list2(Lit9, Lit10), Lit15, "random integer");
  }
  
  static IntNum lambda8()
  {
    return Lit17;
  }
  
  static Object lambda9(Object paramObject1, Object paramObject2)
  {
    DivideOp localDivideOp = DivideOp.modulo;
    MultiplyOp localMultiplyOp = MultiplyOp.$St;
    Object localObject = paramObject1;
    if ((paramObject1 instanceof Package)) {
      localObject = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit19), " is not bound in the current context" }), "Unbound Variable");
    }
    paramObject1 = paramObject2;
    if ((paramObject2 instanceof Package)) {
      paramObject1 = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit20), " is not bound in the current context" }), "Unbound Variable");
    }
    return runtime.callYailPrimitive(localDivideOp, LList.list2(runtime.callYailPrimitive(localMultiplyOp, LList.list2(localObject, paramObject1), Lit21, "*"), Lit22), Lit23, "modulo");
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
  
  public Object button_cancel_signup$Click()
  {
    runtime.setThisForm();
    Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
    return runtime.setAndCoerceProperty$Ex(Lit4, Lit5, Boolean.TRUE, Lit6);
  }
  
  public Object button_login$Click()
  {
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit75, Lit76, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("User_Data/", runtime.get$Mnproperty.apply2(Lit105, Lit50)), Lit115, "join"), Lit28);
    return runtime.callComponentMethod(Lit75, Lit116, LList.list2(runtime.get$Mnproperty.apply2(Lit105, Lit50), "no username"), Lit117);
  }
  
  public Object button_request_signup$Click()
  {
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit75, Lit76, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("User_Data/", runtime.get$Mnproperty.apply2(Lit53, Lit50)), Lit77, "join"), Lit28);
    runtime.callComponentMethod(Lit75, Lit78, LList.list2(runtime.get$Mnproperty.apply2(Lit53, Lit50), runtime.get$Mnproperty.apply2(Lit57, Lit50)), Lit79);
    runtime.callComponentMethod(Lit75, Lit78, LList.list2("age", runtime.get$Mnproperty.apply2(Lit63, Lit50)), Lit80);
    runtime.callComponentMethod(Lit75, Lit78, LList.list2("name", runtime.get$Mnproperty.apply2(Lit60, Lit50)), Lit81);
    runtime.callComponentMethod(Lit75, Lit78, LList.list2("sex", runtime.get$Mnproperty.apply2(Lit69, Lit50)), Lit82);
    runtime.callComponentMethod(Lit75, Lit78, LList.list2("unit", runtime.get$Mnproperty.apply2(Lit66, Lit50)), Lit83);
    Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
    return runtime.setAndCoerceProperty$Ex(Lit4, Lit5, Boolean.TRUE, Lit6);
  }
  
  public Object button_signup$Click()
  {
    runtime.setThisForm();
    Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
    return runtime.setAndCoerceProperty$Ex(Lit7, Lit5, Boolean.TRUE, Lit6);
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
  
  public Object exit$Click()
  {
    runtime.setThisForm();
    return runtime.callYailPrimitive(runtime.close$Mnapplication, LList.Empty, LList.Empty, "close application");
  }
  
  public Object firebase_DB2$GotValue(Object paramObject1, Object paramObject2)
  {
    runtime.sanitizeComponentData(paramObject1);
    paramObject1 = runtime.sanitizeComponentData(paramObject2);
    runtime.setThisForm();
    ModuleMethod localModuleMethod = runtime.yail$Mnequal$Qu;
    if ((paramObject1 instanceof Package)) {}
    for (paramObject2 = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit142), " is not bound in the current context" }), "Unbound Variable"); runtime.callYailPrimitive(localModuleMethod, LList.list2(paramObject2, "no username"), Lit143, "=") != Boolean.FALSE; paramObject2 = paramObject1) {
      return runtime.callComponentMethod(Lit144, Lit145, LList.list1("Unsubscribed users"), Lit146);
    }
    localModuleMethod = runtime.yail$Mnequal$Qu;
    paramObject2 = paramObject1;
    if ((paramObject1 instanceof Package)) {
      paramObject2 = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit142), " is not bound in the current context" }), "Unbound Variable");
    }
    if (runtime.callYailPrimitive(localModuleMethod, LList.list2(paramObject2, runtime.get$Mnproperty.apply2(Lit108, Lit50)), Lit147, "=") != Boolean.FALSE)
    {
      runtime.callComponentMethod(Lit144, Lit145, LList.list1("log in"), Lit148);
      Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
      runtime.addGlobalVarToCurrentFormEnvironment(Lit8, Scheme.applyToArgs.apply3(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit18, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.lookupGlobalVarInCurrentFormEnvironment(Lit13, runtime.$Stthe$Mnnull$Mnvalue$St)));
      return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("main", runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit8, runtime.$Stthe$Mnnull$Mnvalue$St), runtime.get$Mnproperty.apply2(Lit105, Lit50)), Lit149, "make a list")), Lit150, "open another screen with start value");
    }
    return runtime.callComponentMethod(Lit144, Lit145, LList.list1("wrong password"), Lit151);
  }
  
  public String getSimpleName(Object paramObject)
  {
    return paramObject.getClass().getSimpleName();
  }
  
  public boolean isBoundInFormEnvironment(Symbol paramSymbol)
  {
    return form$Mnenvironment.isBound(paramSymbol);
  }
  
  public Object login$Initialize()
  {
    runtime.setThisForm();
    Scheme.applyToArgs.apply1(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St));
    return runtime.setAndCoerceProperty$Ex(Lit4, Lit5, Boolean.TRUE, Lit6);
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
      login = null;
      form$Mnname$Mnsymbol = Lit0;
      events$Mnto$Mnregister = LList.Empty;
      components$Mnto$Mncreate = LList.Empty;
      global$Mnvars$Mnto$Mncreate = LList.Empty;
      form$Mndo$Mnafter$Mncreation = LList.Empty;
      runtime.$instance.run();
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1435;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, lambda$Fn2), localConsumer);
      label139:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1448;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit8, runtime.callYailPrimitive(runtime.random$Mninteger, LList.list2(Lit9, Lit10), Lit11, "random integer")), localConsumer);
      label179:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1461;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit13, runtime.callYailPrimitive(runtime.random$Mninteger, LList.list2(Lit9, Lit10), Lit14, "random integer")), localConsumer);
      label219:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1474;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit16, Lit17), localConsumer);
      label241:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1487;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit18, lambda$Fn8), localConsumer);
      label263:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1500;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit26, runtime.callYailPrimitive(runtime.make$Mnyail$Mnlist, LList.Empty, LList.Empty, "make a list")), localConsumer);
      label297:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1513;
      }
      runtime.setAndCoerceProperty$Ex(Lit0, Lit27, "chat", Lit28);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit29, Lit30, Lit31);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit32, Boolean.FALSE, Lit6);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit33, "Fixed", Lit28);
      Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit34, "login", Lit28), localConsumer);
      label389:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1530;
      }
      runtime.addToCurrentFormEnvironment(Lit35, login$Initialize);
      label409:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1544;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "login", "Initialize");
      label433:
      vertical_signup = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1557;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit37, Lit7, lambda$Fn13), localConsumer);
      label466:
      label2 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1576;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit46, Lit47, lambda$Fn15), localConsumer);
      label499:
      textbox_signup_username = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1595;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit52, Lit53, lambda$Fn17), localConsumer);
      label532:
      textbox_signup_password = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1614;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit56, Lit57, lambda$Fn19), localConsumer);
      label565:
      textbox_signup_name = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1633;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit59, Lit60, lambda$Fn21), localConsumer);
      label598:
      textbox_signup_age = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1652;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit62, Lit63, lambda$Fn23), localConsumer);
      label631:
      textbox_signup_unit = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1671;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit65, Lit66, lambda$Fn25), localConsumer);
      label664:
      textbox_signup_sex = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1690;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit68, Lit69, lambda$Fn27), localConsumer);
      label697:
      button_request_signup = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1709;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit71, Lit72, lambda$Fn29), localConsumer);
      label730:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1728;
      }
      runtime.addToCurrentFormEnvironment(Lit84, button_request_signup$Click);
      label750:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1742;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "button_request_signup", "Click");
      label774:
      button_cancel_signup = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1755;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit7, Lit86, Lit87, lambda$Fn31), localConsumer);
      label807:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1774;
      }
      runtime.addToCurrentFormEnvironment(Lit90, button_cancel_signup$Click);
      label827:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1788;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "button_cancel_signup", "Click");
      label851:
      vertical_login = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1801;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit91, Lit4, lambda$Fn33), localConsumer);
      label884:
      image = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1820;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit4, Lit94, Lit95, lambda$Fn35), localConsumer);
      label917:
      label1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1839;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit4, Lit99, Lit100, lambda$Fn37), localConsumer);
      label950:
      textbox_login_username = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1858;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit4, Lit104, Lit105, lambda$Fn39), localConsumer);
      label983:
      textbox_login_password = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1877;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit4, Lit107, Lit108, lambda$Fn41), localConsumer);
      label1016:
      button_login = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1896;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit4, Lit110, Lit111, lambda$Fn43), localConsumer);
      label1049:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1915;
      }
      runtime.addToCurrentFormEnvironment(Lit118, button_login$Click);
      label1069:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1929;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "button_login", "Click");
      label1093:
      button_signup = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1942;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit4, Lit119, Lit120, lambda$Fn45), localConsumer);
      label1126:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1961;
      }
      runtime.addToCurrentFormEnvironment(Lit124, button_signup$Click);
      label1146:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1975;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "button_signup", "Click");
      label1170:
      exit = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1988;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit4, Lit125, Lit126, lambda$Fn47), localConsumer);
      label1203:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2007;
      }
      runtime.addToCurrentFormEnvironment(Lit129, exit$Click);
      label1223:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2021;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "exit", "Click");
      label1247:
      firebase_DB1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2034;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit130, Lit131, lambda$Fn49), localConsumer);
      label1280:
      clock = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2053;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit137, Lit138, Boolean.FALSE), localConsumer);
      label1313:
      firebase_DB2 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2072;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit140, Lit75, lambda$Fn51), localConsumer);
      label1346:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2091;
      }
      runtime.addToCurrentFormEnvironment(Lit152, firebase_DB2$GotValue);
      label1366:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2105;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "firebase_DB2", "GotValue");
      label1390:
      alarm = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label2118;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit154, Lit144, Boolean.FALSE), localConsumer);
    }
    for (;;)
    {
      runtime.initRuntime();
      return;
      paramCallContext = paramCallContext.toString();
      break;
      label1435:
      addToGlobalVars(Lit3, lambda$Fn3);
      break label139;
      label1448:
      addToGlobalVars(Lit8, lambda$Fn5);
      break label179;
      label1461:
      addToGlobalVars(Lit13, lambda$Fn6);
      break label219;
      label1474:
      addToGlobalVars(Lit16, lambda$Fn7);
      break label241;
      label1487:
      addToGlobalVars(Lit18, lambda$Fn9);
      break label263;
      label1500:
      addToGlobalVars(Lit26, lambda$Fn11);
      break label297;
      label1513:
      addToFormDoAfterCreation(new Promise(lambda$Fn12));
      break label389;
      label1530:
      addToFormEnvironment(Lit35, login$Initialize);
      break label409;
      label1544:
      addToEvents(Lit0, Lit36);
      break label433;
      label1557:
      addToComponents(Lit0, Lit45, Lit7, lambda$Fn14);
      break label466;
      label1576:
      addToComponents(Lit7, Lit51, Lit47, lambda$Fn16);
      break label499;
      label1595:
      addToComponents(Lit7, Lit55, Lit53, lambda$Fn18);
      break label532;
      label1614:
      addToComponents(Lit7, Lit58, Lit57, lambda$Fn20);
      break label565;
      label1633:
      addToComponents(Lit7, Lit61, Lit60, lambda$Fn22);
      break label598;
      label1652:
      addToComponents(Lit7, Lit64, Lit63, lambda$Fn24);
      break label631;
      label1671:
      addToComponents(Lit7, Lit67, Lit66, lambda$Fn26);
      break label664;
      label1690:
      addToComponents(Lit7, Lit70, Lit69, lambda$Fn28);
      break label697;
      label1709:
      addToComponents(Lit7, Lit74, Lit72, lambda$Fn30);
      break label730;
      label1728:
      addToFormEnvironment(Lit84, button_request_signup$Click);
      break label750;
      label1742:
      addToEvents(Lit72, Lit85);
      break label774;
      label1755:
      addToComponents(Lit7, Lit89, Lit87, lambda$Fn32);
      break label807;
      label1774:
      addToFormEnvironment(Lit90, button_cancel_signup$Click);
      break label827;
      label1788:
      addToEvents(Lit87, Lit85);
      break label851;
      label1801:
      addToComponents(Lit0, Lit93, Lit4, lambda$Fn34);
      break label884;
      label1820:
      addToComponents(Lit4, Lit98, Lit95, lambda$Fn36);
      break label917;
      label1839:
      addToComponents(Lit4, Lit103, Lit100, lambda$Fn38);
      break label950;
      label1858:
      addToComponents(Lit4, Lit106, Lit105, lambda$Fn40);
      break label983;
      label1877:
      addToComponents(Lit4, Lit109, Lit108, lambda$Fn42);
      break label1016;
      label1896:
      addToComponents(Lit4, Lit114, Lit111, lambda$Fn44);
      break label1049;
      label1915:
      addToFormEnvironment(Lit118, button_login$Click);
      break label1069;
      label1929:
      addToEvents(Lit111, Lit85);
      break label1093;
      label1942:
      addToComponents(Lit4, Lit123, Lit120, lambda$Fn46);
      break label1126;
      label1961:
      addToFormEnvironment(Lit124, button_signup$Click);
      break label1146;
      label1975:
      addToEvents(Lit120, Lit85);
      break label1170;
      label1988:
      addToComponents(Lit4, Lit128, Lit126, lambda$Fn48);
      break label1203;
      label2007:
      addToFormEnvironment(Lit129, exit$Click);
      break label1223;
      label2021:
      addToEvents(Lit126, Lit85);
      break label1247;
      label2034:
      addToComponents(Lit0, Lit136, Lit131, lambda$Fn50);
      break label1280;
      label2053:
      addToComponents(Lit0, Lit139, Lit138, Boolean.FALSE);
      break label1313;
      label2072:
      addToComponents(Lit0, Lit141, Lit75, lambda$Fn52);
      break label1346;
      label2091:
      addToFormEnvironment(Lit152, firebase_DB2$GotValue);
      break label1366;
      label2105:
      addToEvents(Lit75, Lit153);
      break label1390;
      label2118:
      addToComponents(Lit0, Lit155, Lit144, Boolean.FALSE);
    }
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
}