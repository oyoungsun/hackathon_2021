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
import com.google.appinventor.components.runtime.HorizontalArrangement;
import com.google.appinventor.components.runtime.Label;
import com.google.appinventor.components.runtime.Notifier;
import com.google.appinventor.components.runtime.TextBox;
import com.google.appinventor.components.runtime.VerticalArrangement;
import com.google.appinventor.components.runtime.VerticalScrollArrangement;
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
import gnu.lists.Pair;
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

public class chat
  extends Form
  implements Runnable
{
  static final SimpleSymbol Lit0 = (SimpleSymbol)new SimpleSymbol("chat").readResolve();
  static final SimpleSymbol Lit1;
  static final PairWithPosition Lit10;
  static final FString Lit100;
  static final FString Lit101;
  static final SimpleSymbol Lit102;
  static final FString Lit103;
  static final SimpleSymbol Lit104;
  static final PairWithPosition Lit105;
  static final SimpleSymbol Lit106;
  static final SimpleSymbol Lit107;
  static final SimpleSymbol Lit108;
  static final SimpleSymbol Lit109;
  static final SimpleSymbol Lit11;
  static final SimpleSymbol Lit110;
  static final SimpleSymbol Lit111;
  static final SimpleSymbol Lit112;
  static final SimpleSymbol Lit113;
  static final SimpleSymbol Lit114;
  static final SimpleSymbol Lit115;
  static final SimpleSymbol Lit116;
  static final SimpleSymbol Lit117;
  static final SimpleSymbol Lit118;
  static final SimpleSymbol Lit119;
  static final SimpleSymbol Lit12;
  static final SimpleSymbol Lit120;
  static final SimpleSymbol Lit121;
  static final SimpleSymbol Lit122;
  static final SimpleSymbol Lit123 = (SimpleSymbol)new SimpleSymbol("list").readResolve();
  static final SimpleSymbol Lit13;
  static final IntNum Lit14;
  static final SimpleSymbol Lit15;
  static final SimpleSymbol Lit16;
  static final SimpleSymbol Lit17;
  static final SimpleSymbol Lit18;
  static final SimpleSymbol Lit19;
  static final SimpleSymbol Lit2;
  static final SimpleSymbol Lit20;
  static final SimpleSymbol Lit21;
  static final PairWithPosition Lit22;
  static final SimpleSymbol Lit23;
  static final SimpleSymbol Lit24;
  static final PairWithPosition Lit25;
  static final PairWithPosition Lit26;
  static final SimpleSymbol Lit27;
  static final SimpleSymbol Lit28;
  static final FString Lit29;
  static final SimpleSymbol Lit3;
  static final SimpleSymbol Lit30;
  static final SimpleSymbol Lit31;
  static final IntNum Lit32;
  static final SimpleSymbol Lit33;
  static final IntNum Lit34;
  static final SimpleSymbol Lit35;
  static final IntNum Lit36;
  static final FString Lit37;
  static final FString Lit38;
  static final FString Lit39;
  static final IntNum Lit4;
  static final FString Lit40;
  static final SimpleSymbol Lit41;
  static final IntNum Lit42;
  static final FString Lit43;
  static final FString Lit44;
  static final SimpleSymbol Lit45;
  static final SimpleSymbol Lit46;
  static final IntNum Lit47;
  static final FString Lit48;
  static final FString Lit49;
  static final PairWithPosition Lit5;
  static final SimpleSymbol Lit50;
  static final IntNum Lit51;
  static final FString Lit52;
  static final SimpleSymbol Lit53;
  static final SimpleSymbol Lit54;
  static final FString Lit55;
  static final SimpleSymbol Lit56;
  static final IntNum Lit57;
  static final IntNum Lit58;
  static final FString Lit59;
  static final PairWithPosition Lit6;
  static final PairWithPosition Lit60;
  static final SimpleSymbol Lit61;
  static final FString Lit62;
  static final SimpleSymbol Lit63;
  static final IntNum Lit64;
  static final FString Lit65;
  static final FString Lit66;
  static final SimpleSymbol Lit67;
  static final FString Lit68;
  static final FString Lit69;
  static final SimpleSymbol Lit7;
  static final SimpleSymbol Lit70;
  static final IntNum Lit71;
  static final FString Lit72;
  static final FString Lit73;
  static final SimpleSymbol Lit74;
  static final FString Lit75;
  static final FString Lit76;
  static final SimpleSymbol Lit77;
  static final IntNum Lit78;
  static final FString Lit79;
  static final IntNum Lit8;
  static final SimpleSymbol Lit80;
  static final SimpleSymbol Lit81;
  static final SimpleSymbol Lit82;
  static final PairWithPosition Lit83;
  static final PairWithPosition Lit84;
  static final SimpleSymbol Lit85;
  static final FString Lit86;
  static final SimpleSymbol Lit87;
  static final SimpleSymbol Lit88;
  static final SimpleSymbol Lit89;
  static final PairWithPosition Lit9;
  static final SimpleSymbol Lit90;
  static final SimpleSymbol Lit91;
  static final FString Lit92;
  static final FString Lit93;
  static final FString Lit94;
  static final PairWithPosition Lit95;
  static final SimpleSymbol Lit96;
  static final SimpleSymbol Lit97;
  static final SimpleSymbol Lit98;
  static final FString Lit99;
  public static chat chat;
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
  static final ModuleMethod lambda$Fn4;
  static final ModuleMethod lambda$Fn5;
  static final ModuleMethod lambda$Fn6;
  static final ModuleMethod lambda$Fn7;
  static final ModuleMethod lambda$Fn8;
  static final ModuleMethod lambda$Fn9;
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
  public Button button_chat_exit;
  public final ModuleMethod button_chat_exit$Click;
  public Button button_search;
  public final ModuleMethod button_search$Click;
  public Button button_send;
  public final ModuleMethod button_send$Click;
  public final ModuleMethod chat$Initialize;
  public Label chat_num;
  public Clock clock;
  public final ModuleMethod clock$Timer;
  public LList components$Mnto$Mncreate;
  public final ModuleMethod dispatchEvent;
  public final ModuleMethod dispatchGenericEvent;
  public LList events$Mnto$Mnregister;
  public FirebaseDB firebase_DB1;
  public FirebaseDB firebase_DB2;
  public final ModuleMethod firebase_DB2$GotValue;
  public LList form$Mndo$Mnafter$Mncreation;
  public Environment form$Mnenvironment;
  public Symbol form$Mnname$Mnsymbol;
  public final ModuleMethod get$Mnsimple$Mnname;
  public Environment global$Mnvar$Mnenvironment;
  public LList global$Mnvars$Mnto$Mncreate;
  public HorizontalArrangement horizon1_layout;
  public HorizontalArrangement horizon_layout;
  public final ModuleMethod is$Mnbound$Mnin$Mnform$Mnenvironment;
  public Label label_content_chat;
  public final ModuleMethod lookup$Mnhandler;
  public final ModuleMethod lookup$Mnin$Mnform$Mnenvironment;
  public final ModuleMethod onCreate;
  public final ModuleMethod process$Mnexception;
  public TextBox room_num;
  public final ModuleMethod send$Mnerror;
  public TextBox textbox_message;
  public VerticalArrangement vertical_layout;
  public VerticalScrollArrangement vertical_scroll;
  
  static
  {
    Lit122 = (SimpleSymbol)new SimpleSymbol("any").readResolve();
    Lit121 = (SimpleSymbol)new SimpleSymbol("lookup-handler").readResolve();
    Lit120 = (SimpleSymbol)new SimpleSymbol("dispatchGenericEvent").readResolve();
    Lit119 = (SimpleSymbol)new SimpleSymbol("dispatchEvent").readResolve();
    Lit118 = (SimpleSymbol)new SimpleSymbol("send-error").readResolve();
    Lit117 = (SimpleSymbol)new SimpleSymbol("add-to-form-do-after-creation").readResolve();
    Lit116 = (SimpleSymbol)new SimpleSymbol("add-to-global-vars").readResolve();
    Lit115 = (SimpleSymbol)new SimpleSymbol("add-to-components").readResolve();
    Lit114 = (SimpleSymbol)new SimpleSymbol("add-to-events").readResolve();
    Lit113 = (SimpleSymbol)new SimpleSymbol("add-to-global-var-environment").readResolve();
    Lit112 = (SimpleSymbol)new SimpleSymbol("is-bound-in-form-environment").readResolve();
    Lit111 = (SimpleSymbol)new SimpleSymbol("lookup-in-form-environment").readResolve();
    Lit110 = (SimpleSymbol)new SimpleSymbol("add-to-form-environment").readResolve();
    Lit109 = (SimpleSymbol)new SimpleSymbol("android-log-form").readResolve();
    Lit108 = (SimpleSymbol)new SimpleSymbol("get-simple-name").readResolve();
    Lit107 = (SimpleSymbol)new SimpleSymbol("Timer").readResolve();
    Lit106 = (SimpleSymbol)new SimpleSymbol("clock$Timer").readResolve();
    Object localObject = (SimpleSymbol)new SimpleSymbol("text").readResolve();
    Lit12 = (SimpleSymbol)localObject;
    Lit105 = PairWithPosition.make(localObject, PairWithPosition.make(Lit122, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 708781), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 708775);
    Lit104 = (SimpleSymbol)new SimpleSymbol("GetValue").readResolve();
    Lit103 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit102 = (SimpleSymbol)new SimpleSymbol("clock").readResolve();
    Lit101 = new FString("com.google.appinventor.components.runtime.Clock");
    Lit100 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit99 = new FString("com.google.appinventor.components.runtime.Notifier");
    Lit98 = (SimpleSymbol)new SimpleSymbol("GotValue").readResolve();
    Lit97 = (SimpleSymbol)new SimpleSymbol("firebase_DB2$GotValue").readResolve();
    Lit96 = (SimpleSymbol)new SimpleSymbol("$value").readResolve();
    Lit95 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 659608), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 659602);
    Lit94 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit93 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit92 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit91 = (SimpleSymbol)new SimpleSymbol("FirebaseURL").readResolve();
    Lit90 = (SimpleSymbol)new SimpleSymbol("FirebaseToken").readResolve();
    Lit89 = (SimpleSymbol)new SimpleSymbol("DeveloperBucket").readResolve();
    Lit88 = (SimpleSymbol)new SimpleSymbol("DefaultURL").readResolve();
    Lit87 = (SimpleSymbol)new SimpleSymbol("firebase_DB1").readResolve();
    Lit86 = new FString("com.google.appinventor.components.runtime.FirebaseDB");
    Lit85 = (SimpleSymbol)new SimpleSymbol("button_send$Click").readResolve();
    Lit84 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit122, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 528760), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 528754);
    Lit83 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 528737), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 528732), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 528727), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 528722), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 528716);
    Lit82 = (SimpleSymbol)new SimpleSymbol("StoreValue").readResolve();
    Lit81 = (SimpleSymbol)new SimpleSymbol("ProjectBucket").readResolve();
    Lit80 = (SimpleSymbol)new SimpleSymbol("firebase_DB2").readResolve();
    Lit79 = new FString("com.google.appinventor.components.runtime.Button");
    localObject = new int[2];
    localObject[0] = 42075;
    Lit78 = IntNum.make((int[])localObject);
    Lit77 = (SimpleSymbol)new SimpleSymbol("button_send").readResolve();
    Lit76 = new FString("com.google.appinventor.components.runtime.Button");
    Lit75 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit74 = (SimpleSymbol)new SimpleSymbol("textbox_message").readResolve();
    Lit73 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit72 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    localObject = new int[2];
    localObject[0] = 55927;
    Lit71 = IntNum.make((int[])localObject);
    Lit70 = (SimpleSymbol)new SimpleSymbol("horizon_layout").readResolve();
    Lit69 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit68 = new FString("com.google.appinventor.components.runtime.Label");
    Lit67 = (SimpleSymbol)new SimpleSymbol("label_content_chat").readResolve();
    Lit66 = new FString("com.google.appinventor.components.runtime.Label");
    Lit65 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    localObject = new int[2];
    localObject[0] = 55927;
    Lit64 = IntNum.make((int[])localObject);
    Lit63 = (SimpleSymbol)new SimpleSymbol("vertical_scroll").readResolve();
    Lit62 = new FString("com.google.appinventor.components.runtime.VerticalScrollArrangement");
    Lit61 = (SimpleSymbol)new SimpleSymbol("button_chat_exit$Click").readResolve();
    Lit60 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit122, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 327860), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 327854);
    Lit59 = new FString("com.google.appinventor.components.runtime.Button");
    Lit58 = IntNum.make(64496);
    localObject = new int[2];
    localObject[0] = 42075;
    Lit57 = IntNum.make((int[])localObject);
    Lit56 = (SimpleSymbol)new SimpleSymbol("button_chat_exit").readResolve();
    Lit55 = new FString("com.google.appinventor.components.runtime.Button");
    Lit54 = (SimpleSymbol)new SimpleSymbol("Click").readResolve();
    Lit53 = (SimpleSymbol)new SimpleSymbol("button_search$Click").readResolve();
    Lit52 = new FString("com.google.appinventor.components.runtime.Button");
    localObject = new int[2];
    localObject[0] = 42075;
    Lit51 = IntNum.make((int[])localObject);
    Lit50 = (SimpleSymbol)new SimpleSymbol("button_search").readResolve();
    Lit49 = new FString("com.google.appinventor.components.runtime.Button");
    Lit48 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit47 = IntNum.make(64506);
    Lit46 = (SimpleSymbol)new SimpleSymbol("Hint").readResolve();
    Lit45 = (SimpleSymbol)new SimpleSymbol("room_num").readResolve();
    Lit44 = new FString("com.google.appinventor.components.runtime.TextBox");
    Lit43 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    localObject = new int[2];
    localObject[0] = 55927;
    Lit42 = IntNum.make((int[])localObject);
    Lit41 = (SimpleSymbol)new SimpleSymbol("horizon1_layout").readResolve();
    Lit40 = new FString("com.google.appinventor.components.runtime.HorizontalArrangement");
    Lit39 = new FString("com.google.appinventor.components.runtime.Label");
    Lit38 = new FString("com.google.appinventor.components.runtime.Label");
    Lit37 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit36 = IntNum.make(-2);
    Lit35 = (SimpleSymbol)new SimpleSymbol("Width").readResolve();
    Lit34 = IntNum.make(64446);
    Lit33 = (SimpleSymbol)new SimpleSymbol("Height").readResolve();
    localObject = new int[2];
    localObject[0] = 42075;
    Lit32 = IntNum.make((int[])localObject);
    Lit31 = (SimpleSymbol)new SimpleSymbol("AlignHorizontal").readResolve();
    Lit30 = (SimpleSymbol)new SimpleSymbol("vertical_layout").readResolve();
    Lit29 = new FString("com.google.appinventor.components.runtime.VerticalArrangement");
    Lit28 = (SimpleSymbol)new SimpleSymbol("Initialize").readResolve();
    Lit27 = (SimpleSymbol)new SimpleSymbol("chat$Initialize").readResolve();
    Lit26 = PairWithPosition.make(Lit12, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 82284);
    Lit25 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 82267), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 82261);
    Lit24 = (SimpleSymbol)new SimpleSymbol("ShowAlert").readResolve();
    Lit23 = (SimpleSymbol)new SimpleSymbol("alarm").readResolve();
    Lit22 = PairWithPosition.make(Lit12, PairWithPosition.make(Lit12, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 82076), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 82070);
    Lit21 = (SimpleSymbol)new SimpleSymbol("Text").readResolve();
    Lit20 = (SimpleSymbol)new SimpleSymbol("chat_num").readResolve();
    Lit19 = (SimpleSymbol)new SimpleSymbol("Title").readResolve();
    Lit18 = (SimpleSymbol)new SimpleSymbol("Sizing").readResolve();
    Lit17 = (SimpleSymbol)new SimpleSymbol("boolean").readResolve();
    Lit16 = (SimpleSymbol)new SimpleSymbol("ShowListsAsJson").readResolve();
    Lit15 = (SimpleSymbol)new SimpleSymbol("number").readResolve();
    localObject = new int[2];
    localObject[0] = 55927;
    Lit14 = IntNum.make((int[])localObject);
    Lit13 = (SimpleSymbol)new SimpleSymbol("BackgroundColor").readResolve();
    Lit11 = (SimpleSymbol)new SimpleSymbol("AppName").readResolve();
    Lit10 = PairWithPosition.make(Lit123, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 37033), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 37027);
    Lit9 = PairWithPosition.make(Lit123, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 37033), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 37027);
    Lit8 = IntNum.make(2);
    Lit7 = (SimpleSymbol)new SimpleSymbol("g$username").readResolve();
    Lit6 = PairWithPosition.make(Lit123, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 32937), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 32931);
    Lit5 = PairWithPosition.make(Lit123, PairWithPosition.make(Lit15, LList.Empty, "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 32937), "/tmp/1626949342094_0.6321003926490107-0/youngandroidproject/../src/appinventor/ai_oyoungsun1030/last4/chat.yail", 32931);
    Lit4 = IntNum.make(1);
    Lit3 = (SimpleSymbol)new SimpleSymbol("g$room_key").readResolve();
    Lit2 = (SimpleSymbol)new SimpleSymbol("*the-null-value*").readResolve();
    Lit1 = (SimpleSymbol)new SimpleSymbol("getMessage").readResolve();
  }
  
  public chat()
  {
    ModuleInfo.register(this);
    chat.frame localframe = new chat.frame();
    $main = this;
    get$Mnsimple$Mnname = new ModuleMethod(localframe, 1, Lit108, 4097);
    onCreate = new ModuleMethod(localframe, 2, "onCreate", 4097);
    android$Mnlog$Mnform = new ModuleMethod(localframe, 3, Lit109, 4097);
    add$Mnto$Mnform$Mnenvironment = new ModuleMethod(localframe, 4, Lit110, 8194);
    lookup$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 5, Lit111, 8193);
    is$Mnbound$Mnin$Mnform$Mnenvironment = new ModuleMethod(localframe, 7, Lit112, 4097);
    add$Mnto$Mnglobal$Mnvar$Mnenvironment = new ModuleMethod(localframe, 8, Lit113, 8194);
    add$Mnto$Mnevents = new ModuleMethod(localframe, 9, Lit114, 8194);
    add$Mnto$Mncomponents = new ModuleMethod(localframe, 10, Lit115, 16388);
    add$Mnto$Mnglobal$Mnvars = new ModuleMethod(localframe, 11, Lit116, 8194);
    add$Mnto$Mnform$Mndo$Mnafter$Mncreation = new ModuleMethod(localframe, 12, Lit117, 4097);
    send$Mnerror = new ModuleMethod(localframe, 13, Lit118, 4097);
    process$Mnexception = new ModuleMethod(localframe, 14, "process-exception", 4097);
    dispatchEvent = new ModuleMethod(localframe, 15, Lit119, 16388);
    dispatchGenericEvent = new ModuleMethod(localframe, 16, Lit120, 16388);
    lookup$Mnhandler = new ModuleMethod(localframe, 17, Lit121, 8194);
    ModuleMethod localModuleMethod = new ModuleMethod(localframe, 18, null, 0);
    localModuleMethod.setProperty("source-location", "/tmp/runtime4163479401509002272.scm:622");
    lambda$Fn1 = localModuleMethod;
    $define = new ModuleMethod(localframe, 19, "$define", 0);
    lambda$Fn2 = new ModuleMethod(localframe, 20, null, 0);
    lambda$Fn3 = new ModuleMethod(localframe, 21, null, 0);
    lambda$Fn4 = new ModuleMethod(localframe, 22, null, 0);
    chat$Initialize = new ModuleMethod(localframe, 23, Lit27, 0);
    lambda$Fn5 = new ModuleMethod(localframe, 24, null, 0);
    lambda$Fn6 = new ModuleMethod(localframe, 25, null, 0);
    lambda$Fn7 = new ModuleMethod(localframe, 26, null, 0);
    lambda$Fn8 = new ModuleMethod(localframe, 27, null, 0);
    lambda$Fn9 = new ModuleMethod(localframe, 28, null, 0);
    lambda$Fn10 = new ModuleMethod(localframe, 29, null, 0);
    lambda$Fn11 = new ModuleMethod(localframe, 30, null, 0);
    lambda$Fn12 = new ModuleMethod(localframe, 31, null, 0);
    lambda$Fn13 = new ModuleMethod(localframe, 32, null, 0);
    lambda$Fn14 = new ModuleMethod(localframe, 33, null, 0);
    button_search$Click = new ModuleMethod(localframe, 34, Lit53, 0);
    lambda$Fn15 = new ModuleMethod(localframe, 35, null, 0);
    lambda$Fn16 = new ModuleMethod(localframe, 36, null, 0);
    button_chat_exit$Click = new ModuleMethod(localframe, 37, Lit61, 0);
    lambda$Fn17 = new ModuleMethod(localframe, 38, null, 0);
    lambda$Fn18 = new ModuleMethod(localframe, 39, null, 0);
    lambda$Fn19 = new ModuleMethod(localframe, 40, null, 0);
    lambda$Fn20 = new ModuleMethod(localframe, 41, null, 0);
    lambda$Fn21 = new ModuleMethod(localframe, 42, null, 0);
    lambda$Fn22 = new ModuleMethod(localframe, 43, null, 0);
    lambda$Fn23 = new ModuleMethod(localframe, 44, null, 0);
    lambda$Fn24 = new ModuleMethod(localframe, 45, null, 0);
    lambda$Fn25 = new ModuleMethod(localframe, 46, null, 0);
    lambda$Fn26 = new ModuleMethod(localframe, 47, null, 0);
    button_send$Click = new ModuleMethod(localframe, 48, Lit85, 0);
    lambda$Fn27 = new ModuleMethod(localframe, 49, null, 0);
    lambda$Fn28 = new ModuleMethod(localframe, 50, null, 0);
    lambda$Fn29 = new ModuleMethod(localframe, 51, null, 0);
    lambda$Fn30 = new ModuleMethod(localframe, 52, null, 0);
    firebase_DB2$GotValue = new ModuleMethod(localframe, 53, Lit97, 8194);
    clock$Timer = new ModuleMethod(localframe, 54, Lit106, 0);
  }
  
  static Object lambda10()
  {
    return runtime.setAndCoerceProperty$Ex(Lit41, Lit13, Lit42, Lit15);
  }
  
  static Object lambda11()
  {
    return runtime.setAndCoerceProperty$Ex(Lit41, Lit13, Lit42, Lit15);
  }
  
  static Object lambda12()
  {
    runtime.setAndCoerceProperty$Ex(Lit45, Lit46, "諛⑸쾲�샇 �엯�젰", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit45, Lit35, Lit47, Lit15);
  }
  
  static Object lambda13()
  {
    runtime.setAndCoerceProperty$Ex(Lit45, Lit46, "諛⑸쾲�샇 �엯�젰", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit45, Lit35, Lit47, Lit15);
  }
  
  static Object lambda14()
  {
    runtime.setAndCoerceProperty$Ex(Lit50, Lit13, Lit51, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit50, Lit21, "梨꾪똿諛� 李얘린", Lit12);
  }
  
  static Object lambda15()
  {
    runtime.setAndCoerceProperty$Ex(Lit50, Lit13, Lit51, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit50, Lit21, "梨꾪똿諛� 李얘린", Lit12);
  }
  
  static Object lambda16()
  {
    runtime.setAndCoerceProperty$Ex(Lit56, Lit13, Lit57, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit56, Lit21, "梨꾪똿諛� �굹媛�湲�", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit35, Lit58, Lit15);
  }
  
  static Object lambda17()
  {
    runtime.setAndCoerceProperty$Ex(Lit56, Lit13, Lit57, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit56, Lit21, "梨꾪똿諛� �굹媛�湲�", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit56, Lit35, Lit58, Lit15);
  }
  
  static Object lambda18()
  {
    runtime.setAndCoerceProperty$Ex(Lit63, Lit13, Lit64, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit63, Lit33, Lit36, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit35, Lit36, Lit15);
  }
  
  static Object lambda19()
  {
    runtime.setAndCoerceProperty$Ex(Lit63, Lit13, Lit64, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit63, Lit33, Lit36, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit63, Lit35, Lit36, Lit15);
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
    return runtime.setAndCoerceProperty$Ex(Lit67, Lit21, "梨꾪똿諛⑹뿉 �엯�옣�븯�뀲�뒿�땲�떎.", Lit12);
  }
  
  static Object lambda21()
  {
    return runtime.setAndCoerceProperty$Ex(Lit67, Lit21, "梨꾪똿諛⑹뿉 �엯�옣�븯�뀲�뒿�땲�떎.", Lit12);
  }
  
  static Object lambda22()
  {
    runtime.setAndCoerceProperty$Ex(Lit70, Lit13, Lit71, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit70, Lit35, Lit36, Lit15);
  }
  
  static Object lambda23()
  {
    runtime.setAndCoerceProperty$Ex(Lit70, Lit13, Lit71, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit70, Lit35, Lit36, Lit15);
  }
  
  static Object lambda24()
  {
    runtime.setAndCoerceProperty$Ex(Lit74, Lit33, Lit36, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit74, Lit46, "�뀓�뒪�듃諛뺤뒪1 �쓽 �엺�듃", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit35, Lit36, Lit15);
  }
  
  static Object lambda25()
  {
    runtime.setAndCoerceProperty$Ex(Lit74, Lit33, Lit36, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit74, Lit46, "�뀓�뒪�듃諛뺤뒪1 �쓽 �엺�듃", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit35, Lit36, Lit15);
  }
  
  static Object lambda26()
  {
    runtime.setAndCoerceProperty$Ex(Lit77, Lit13, Lit78, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit77, Lit21, "send", Lit12);
  }
  
  static Object lambda27()
  {
    runtime.setAndCoerceProperty$Ex(Lit77, Lit13, Lit78, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit77, Lit21, "send", Lit12);
  }
  
  static Object lambda28()
  {
    runtime.setAndCoerceProperty$Ex(Lit87, Lit88, "https://dazzling-fire-7140.firebaseio.com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit89, "oyoungsun1030@gmail:com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit90, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit91, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit87, Lit81, "last_2", Lit12);
  }
  
  static Object lambda29()
  {
    runtime.setAndCoerceProperty$Ex(Lit87, Lit88, "https://dazzling-fire-7140.firebaseio.com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit89, "oyoungsun1030@gmail:com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit90, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit87, Lit91, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit87, Lit81, "last_2", Lit12);
  }
  
  static Object lambda3()
  {
    return runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), Lit4), Lit6, "select list item");
  }
  
  static Object lambda30()
  {
    runtime.setAndCoerceProperty$Ex(Lit80, Lit88, "https://dazzling-fire-7140.firebaseio.com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit89, "oyoungsun1030@gmail:com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit90, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit91, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit80, Lit81, "last_2", Lit12);
  }
  
  static Object lambda31()
  {
    runtime.setAndCoerceProperty$Ex(Lit80, Lit88, "https://dazzling-fire-7140.firebaseio.com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit89, "oyoungsun1030@gmail:com/", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit90, "cp6tTv1iSUJOt4LwxjVoMy7MPkI20ddaCOCXlyj3", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit80, Lit91, "https://ongsimver1-default-rtdb.firebaseio.com/", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit80, Lit81, "last_2", Lit12);
  }
  
  static Object lambda4()
  {
    return runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), Lit8), Lit10, "select list item");
  }
  
  static Object lambda5()
  {
    runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "chat_check2", Lit12);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit17);
    runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "Fixed", Lit12);
    return runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "chat", Lit12);
  }
  
  static Object lambda6()
  {
    runtime.setAndCoerceProperty$Ex(Lit30, Lit31, Lit8, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit30, Lit13, Lit32, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit30, Lit33, Lit34, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit30, Lit35, Lit36, Lit15);
  }
  
  static Object lambda7()
  {
    runtime.setAndCoerceProperty$Ex(Lit30, Lit31, Lit8, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit30, Lit13, Lit32, Lit15);
    runtime.setAndCoerceProperty$Ex(Lit30, Lit33, Lit34, Lit15);
    return runtime.setAndCoerceProperty$Ex(Lit30, Lit35, Lit36, Lit15);
  }
  
  static Object lambda8()
  {
    return runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "梨꾪똿諛� 踰덊샇:", Lit12);
  }
  
  static Object lambda9()
  {
    return runtime.setAndCoerceProperty$Ex(Lit20, Lit21, "梨꾪똿諛� 踰덊샇:", Lit12);
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
  
  public Object button_chat_exit$Click()
  {
    runtime.setThisForm();
    return runtime.callYailPrimitive(runtime.open$Mnanother$Mnscreen$Mnwith$Mnstart$Mnvalue, LList.list2("main", runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value")), Lit60, "open another screen with start value");
  }
  
  public Object button_search$Click()
  {
    runtime.setThisForm();
    return runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.get$Mnproperty.apply2(Lit45, Lit21));
  }
  
  public Object button_send$Click()
  {
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit80, Lit81, "chat", Lit12);
    SimpleSymbol localSimpleSymbol1 = Lit80;
    SimpleSymbol localSimpleSymbol2 = Lit82;
    Object localObject = runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St);
    ModuleMethod localModuleMethod = strings.string$Mnappend;
    Pair localPair = LList.list1(runtime.get$Mnproperty.apply2(Lit67, Lit21));
    LList.chain4(localPair, "\n", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit7, runtime.$Stthe$Mnnull$Mnvalue$St), ": ", runtime.get$Mnproperty.apply2(Lit74, Lit21));
    runtime.callComponentMethod(localSimpleSymbol1, localSimpleSymbol2, LList.list2(localObject, runtime.callYailPrimitive(localModuleMethod, localPair, Lit83, "join")), Lit84);
    return runtime.setAndCoerceProperty$Ex(Lit74, Lit21, "", Lit12);
  }
  
  public Object chat$Initialize()
  {
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit20, Lit21, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("諛� 踰덊샇: ", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit22, "join"), Lit12);
    return runtime.callComponentMethod(Lit23, Lit24, LList.list1(runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("諛� 踰덊샇: ", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit25, "join")), Lit26);
  }
  
  public Object clock$Timer()
  {
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit80, Lit81, "chat", Lit12);
    return runtime.callComponentMethod(Lit80, Lit104, LList.list2(runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St), ""), Lit105);
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
  
  public Object firebase_DB2$GotValue(Object paramObject1, Object paramObject2)
  {
    runtime.sanitizeComponentData(paramObject1);
    paramObject2 = runtime.sanitizeComponentData(paramObject2);
    runtime.setThisForm();
    runtime.setAndCoerceProperty$Ex(Lit80, Lit81, runtime.callYailPrimitive(strings.string$Mnappend, LList.list2("chat", runtime.lookupGlobalVarInCurrentFormEnvironment(Lit3, runtime.$Stthe$Mnnull$Mnvalue$St)), Lit95, "join"), Lit12);
    SimpleSymbol localSimpleSymbol1 = Lit67;
    SimpleSymbol localSimpleSymbol2 = Lit21;
    paramObject1 = paramObject2;
    if ((paramObject2 instanceof Package)) {
      paramObject1 = runtime.signalRuntimeError(strings.stringAppend(new Object[] { "The variable ", runtime.getDisplayRepresentation(Lit96), " is not bound in the current context" }), "Unbound Variable");
    }
    return runtime.setAndCoerceProperty$Ex(localSimpleSymbol1, localSimpleSymbol2, paramObject1, Lit12);
  }
  
  public String getSimpleName(Object paramObject)
  {
    return paramObject.getClass().getSimpleName();
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
      chat = null;
      form$Mnname$Mnsymbol = Lit0;
      events$Mnto$Mnregister = LList.Empty;
      components$Mnto$Mncreate = LList.Empty;
      global$Mnvars$Mnto$Mncreate = LList.Empty;
      form$Mndo$Mnafter$Mncreation = LList.Empty;
      runtime.$instance.run();
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1084;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit3, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), Lit4), Lit5, "select list item")), localConsumer);
      label169:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1097;
      }
      Values.writeValues(runtime.addGlobalVarToCurrentFormEnvironment(Lit7, runtime.callYailPrimitive(runtime.yail$Mnlist$Mnget$Mnitem, LList.list2(runtime.callYailPrimitive(runtime.get$Mnstart$Mnvalue, LList.Empty, LList.Empty, "get start value"), Lit8), Lit9, "select list item")), localConsumer);
      label221:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1110;
      }
      runtime.setAndCoerceProperty$Ex(Lit0, Lit11, "chat_check2", Lit12);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit13, Lit14, Lit15);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit16, Boolean.FALSE, Lit17);
      runtime.setAndCoerceProperty$Ex(Lit0, Lit18, "Fixed", Lit12);
      Values.writeValues(runtime.setAndCoerceProperty$Ex(Lit0, Lit19, "chat", Lit12), localConsumer);
      label313:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1127;
      }
      runtime.addToCurrentFormEnvironment(Lit27, chat$Initialize);
      label333:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1141;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "chat", "Initialize");
      label357:
      vertical_layout = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1154;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit29, Lit30, lambda$Fn5), localConsumer);
      label390:
      chat_num = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1173;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit30, Lit38, Lit20, lambda$Fn7), localConsumer);
      label423:
      horizon1_layout = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1192;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit30, Lit40, Lit41, lambda$Fn9), localConsumer);
      label456:
      room_num = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1211;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit44, Lit45, lambda$Fn11), localConsumer);
      label489:
      button_search = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1230;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit49, Lit50, lambda$Fn13), localConsumer);
      label522:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1249;
      }
      runtime.addToCurrentFormEnvironment(Lit53, button_search$Click);
      label542:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1263;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "button_search", "Click");
      label566:
      button_chat_exit = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1276;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit41, Lit55, Lit56, lambda$Fn15), localConsumer);
      label599:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1295;
      }
      runtime.addToCurrentFormEnvironment(Lit61, button_chat_exit$Click);
      label619:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1309;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "button_chat_exit", "Click");
      label643:
      vertical_scroll = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1322;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit30, Lit62, Lit63, lambda$Fn17), localConsumer);
      label676:
      label_content_chat = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1341;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit63, Lit66, Lit67, lambda$Fn19), localConsumer);
      label709:
      horizon_layout = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1360;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit30, Lit69, Lit70, lambda$Fn21), localConsumer);
      label742:
      textbox_message = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1379;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit73, Lit74, lambda$Fn23), localConsumer);
      label775:
      button_send = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1398;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit70, Lit76, Lit77, lambda$Fn25), localConsumer);
      label808:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1417;
      }
      runtime.addToCurrentFormEnvironment(Lit85, button_send$Click);
      label828:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1431;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "button_send", "Click");
      label852:
      firebase_DB1 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1444;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit86, Lit87, lambda$Fn27), localConsumer);
      label885:
      firebase_DB2 = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1463;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit93, Lit80, lambda$Fn29), localConsumer);
      label918:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1482;
      }
      runtime.addToCurrentFormEnvironment(Lit97, firebase_DB2$GotValue);
      label938:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1496;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "firebase_DB2", "GotValue");
      label962:
      alarm = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1509;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit99, Lit23, Boolean.FALSE), localConsumer);
      label995:
      clock = null;
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1528;
      }
      Values.writeValues(runtime.addComponentWithinRepl(Lit0, Lit101, Lit102, Boolean.FALSE), localConsumer);
      label1028:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1547;
      }
      runtime.addToCurrentFormEnvironment(Lit106, clock$Timer);
      label1048:
      if (runtime.$Stthis$Mnis$Mnthe$Mnrepl$St == Boolean.FALSE) {
        break label1561;
      }
      EventDispatcher.registerEventForDelegation((HandlesEventDispatching)runtime.$Stthis$Mnform$St, "clock", "Timer");
    }
    for (;;)
    {
      runtime.initRuntime();
      return;
      paramCallContext = paramCallContext.toString();
      break;
      label1084:
      addToGlobalVars(Lit3, lambda$Fn2);
      break label169;
      label1097:
      addToGlobalVars(Lit7, lambda$Fn3);
      break label221;
      label1110:
      addToFormDoAfterCreation(new Promise(lambda$Fn4));
      break label313;
      label1127:
      addToFormEnvironment(Lit27, chat$Initialize);
      break label333;
      label1141:
      addToEvents(Lit0, Lit28);
      break label357;
      label1154:
      addToComponents(Lit0, Lit37, Lit30, lambda$Fn6);
      break label390;
      label1173:
      addToComponents(Lit30, Lit39, Lit20, lambda$Fn8);
      break label423;
      label1192:
      addToComponents(Lit30, Lit43, Lit41, lambda$Fn10);
      break label456;
      label1211:
      addToComponents(Lit41, Lit48, Lit45, lambda$Fn12);
      break label489;
      label1230:
      addToComponents(Lit41, Lit52, Lit50, lambda$Fn14);
      break label522;
      label1249:
      addToFormEnvironment(Lit53, button_search$Click);
      break label542;
      label1263:
      addToEvents(Lit50, Lit54);
      break label566;
      label1276:
      addToComponents(Lit41, Lit59, Lit56, lambda$Fn16);
      break label599;
      label1295:
      addToFormEnvironment(Lit61, button_chat_exit$Click);
      break label619;
      label1309:
      addToEvents(Lit56, Lit54);
      break label643;
      label1322:
      addToComponents(Lit30, Lit65, Lit63, lambda$Fn18);
      break label676;
      label1341:
      addToComponents(Lit63, Lit68, Lit67, lambda$Fn20);
      break label709;
      label1360:
      addToComponents(Lit30, Lit72, Lit70, lambda$Fn22);
      break label742;
      label1379:
      addToComponents(Lit70, Lit75, Lit74, lambda$Fn24);
      break label775;
      label1398:
      addToComponents(Lit70, Lit79, Lit77, lambda$Fn26);
      break label808;
      label1417:
      addToFormEnvironment(Lit85, button_send$Click);
      break label828;
      label1431:
      addToEvents(Lit77, Lit54);
      break label852;
      label1444:
      addToComponents(Lit0, Lit92, Lit87, lambda$Fn28);
      break label885;
      label1463:
      addToComponents(Lit0, Lit94, Lit80, lambda$Fn30);
      break label918;
      label1482:
      addToFormEnvironment(Lit97, firebase_DB2$GotValue);
      break label938;
      label1496:
      addToEvents(Lit80, Lit98);
      break label962;
      label1509:
      addToComponents(Lit0, Lit100, Lit23, Boolean.FALSE);
      break label995;
      label1528:
      addToComponents(Lit0, Lit103, Lit102, Boolean.FALSE);
      break label1028;
      label1547:
      addToFormEnvironment(Lit106, clock$Timer);
      break label1048;
      label1561:
      addToEvents(Lit102, Lit107);
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

