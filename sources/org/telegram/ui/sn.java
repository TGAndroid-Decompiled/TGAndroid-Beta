package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorMatrix;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.content.FileProvider;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.Collection;
import j$.util.Comparator$CC;
import j$.util.Objects;
import j$.util.stream.Collectors;
import java.io.File;
import java.net.URLDecoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotForumHelper;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatMessageSharedResources;
import org.telegram.messenger.ChatMessagesMetadataController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.DocumentObject;
import org.telegram.messenger.FileLoader;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.FlagSecureReason;
import org.telegram.messenger.HashtagSearchController;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.LanguageDetector;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagePreviewParams;
import org.telegram.messenger.MessageSuggestionParams;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.RichMessageLayout;
import org.telegram.messenger.SendMessageChatArguments;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.SvgHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.VideoEditedInfo;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.ActionBarLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
public class sn extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, xx, mc0, org.telegram.ui.Components.ck, org.telegram.ui.Components.zg, ng.b, org.telegram.ui.Components.w50, ne.d {
    public static int Vc = 22;
    public static float Wc = 1.4f;
    public static int Xc = 10;
    public static Pattern Yc;
    public static Pattern Zc;
    public static Pattern f41441ad;
    public static final int[] f41442bd = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean f41443cd = false;
    public static final Rect dd = new Rect();
    public em A0;
    public rk A1;
    public org.telegram.ui.Components.p40 A2;
    public TLRPC.User A3;
    public final SparseArray A4;
    public int A5;
    public final SparseArray[] A6;
    public int A7;
    public boolean A8;
    public boolean A9;
    public int Aa;
    public kf Ab;
    public boolean Ac;
    public mk B0;
    public dk B1;
    public org.telegram.ui.Cells.t1 B2;
    public TLRPC.Chat B3;
    public final ArrayList B4;
    public MessageObject B5;
    public final SparseArray B6;
    public boolean B7;
    public long B8;
    public ValueAnimator B9;
    public int Ba;
    public int Bb;
    public kn Bc;
    public boolean C0;
    public ei.h1 C1;
    public int C2;
    public ah.i1 C3;
    public int C4;
    public boolean C5;
    public final SparseArray C6;
    public kf C7;
    public long C8;
    public ValueAnimator C9;
    public kf Ca;
    public org.telegram.ui.ActionBar.c2 Cb;
    public dn Cc;
    public org.telegram.ui.Components.w90 D0;
    public int D1;
    public int D2;
    public boolean D3;
    public boolean D4;
    public boolean D5;
    public final HashMap D6;
    public String D7;
    public boolean D8;
    public boolean D9;
    public boolean Da;
    public int Db;
    public ai.q7 Dc;
    public final re.b E;
    public TextView E0;
    public boolean E1;
    public org.telegram.ui.Components.p40 E2;
    public boolean E3;
    public boolean E4;
    public boolean E5;
    public final SparseArray E6;
    public boolean E7;
    public String E8;
    public float E9;
    public boolean Ea;
    public int Eb;
    public boolean Ec;
    public final bh.f F;
    public lk F0;
    public org.telegram.ui.Components.k40 F1;
    public org.telegram.ui.Components.p40 F2;
    public String F3;
    public int F4;
    public boolean F5;
    public final a0.h F6;
    public boolean F7;
    public jk F8;
    public float F9;
    public long Fa;
    public boolean Fb;
    public boolean Fc;
    public final int G;
    public RadialProgressView G0;
    public org.telegram.ui.ActionBar.c2 G1;
    public org.telegram.ui.Components.p40 G2;
    public String G3;
    public final ArrayList G4;
    public int G5;
    public final ArrayList G6;
    public int G7;
    public org.telegram.ui.Cells.t1 G8;
    public int G9;
    public int Ga;
    public int Gb;
    public float Gc;
    public final gh.d H;
    public final int H0;
    public ei.x3 H1;
    public org.telegram.ui.Components.zp H2;
    public int H3;
    public final HashMap H4;
    public int H5;
    public final SparseArray H6;
    public int H7;
    public n4 H8;
    public int H9;
    public int Ha;
    public boolean Hb;
    public float Hc;
    public final gh.d I;
    public int I0;
    public ei.x3 I1;
    public View I2;
    public int I3;
    public MessageObject I4;
    public TLRPC.PhotoSize I5;
    public final a0.h I6;
    public int I7;
    public TextureView I8;
    public float I9;
    public pk Ia;
    public int Ib;
    public final ne.b Ic;
    public final bh.b J;
    public int J0;
    public ei.x3 J1;
    public dl J2;
    public int J3;
    public int J4;
    public TLRPC.PhotoSize J5;
    public final a0.h J6;
    public int J7;
    public boolean J8;
    public float J9;
    public qk Ja;
    public int Jb;
    public final ne.b Jc;
    public final bh.b K;
    public int K0;
    public ei.x3 K1;
    public ei.g6 K2;
    public UndoView K3;
    public int K4;
    public TLObject K5;
    public final int[] K6;
    public int K7;
    public final kf K8;
    public float K9;
    public boolean Ka;
    public int Kb;
    public final ne.b Kc;
    public final gh.e L;
    public int L0;
    public ei.x3 L1;
    public org.telegram.ui.Components.tg0 L2;
    public cl L3;
    public final ArrayList L4;
    public int L5;
    public final int[] L6;
    public int L7;
    public final gh.b L8;
    public float L9;
    public float La;
    public CharacterStyle Lb;
    public final ne.b Lc;
    public final bh.b M;
    public Drawable M0;
    public ei.x3 M1;
    public boolean M2;
    public org.telegram.ui.Components.oc M3;
    public int M4;
    public int M5;
    public final int[] M6;
    public boolean M7;
    public final bh.b M8;
    public float M9;
    public int Ma;
    public String Mb;
    public final ne.b Mc;
    public org.telegram.ui.ActionBar.c2 N;
    public Drawable N0;
    public ql N1;
    public final org.telegram.ui.Components.u9[] N2;
    public boolean N3;
    public int N4;
    public boolean N5;
    public final int[] N6;
    public int N7;
    public Bitmap N8;
    public TLRPC.Document N9;
    public int Na;
    public pf.c Nb;
    public final ne.b Nc;
    public boolean O;
    public Drawable O0;
    public float O1;
    public final rn[] O2;
    public int O3;
    public kf O4;
    public TLRPC.PhotoSize O5;
    public final boolean[] O6;
    public int O7;
    public BitmapShader O8;
    public boolean O9;
    public ChatMessageSharedResources Oa;
    public boolean Ob;
    public final ne.b Oc;
    public FrameLayout P;
    public boolean P0;
    public TL_stories.TL_premium_boostsStatus P1;
    public final org.telegram.ui.ActionBar.n5[] P2;
    public boolean P3;
    public boolean P4;
    public TLRPC.PhotoSize P5;
    public final boolean[] P6;
    public int P7;
    public Paint P8;
    public boolean P9;
    public ValueAnimator Pa;
    public ke Pb;
    public final j6.l Pc;
    public ei.g6 Q;
    public int Q0;
    public ChannelBoostsController.CanApplyBoost Q1;
    public final hn[] Q2;
    public FlagSecureReason Q3;
    public boolean Q4;
    public TLObject Q5;
    public final boolean[] Q6;
    public boolean Q7;
    public Matrix Q8;
    public long Q9;
    public float Qa;
    public boolean Qb;
    public rh.c Qc;
    public jk R;
    public final Set R0;
    public boolean R1;
    public NumberTextView R2;
    public boolean R3;
    public boolean R4;
    public int R5;
    public boolean R6;
    public boolean R7;
    public Paint R8;
    public int R9;
    public bl Ra;
    public boolean Rb;
    public zf.b0 Rc;
    public ih.f S;
    public final Set S0;
    public ke S1;
    public int S2;
    public MessageObject S3;
    public int S4;
    public TLRPC.WebPage S5;
    public boolean S6;
    public boolean S7;
    public final Paint S8;
    public int S9;
    public final ll Sa;
    public final RectF Sb;
    public final ArrayList Sc;
    public View T;
    public AnimatorSet T0;
    public ImageView T1;
    public final AnimatorSet[] T2;
    public int T3;
    public ArrayList T4;
    public ArrayList T5;
    public boolean T6;
    public int T7;
    public float T8;
    public int T9;
    public final sl Ta;
    public org.telegram.ui.ActionBar.c2 Tb;
    public final ArrayList Tc;
    public FrameLayout U;
    public boolean U0;
    public yj U1;
    public boolean U2;
    public MessageObject U3;
    public int U4;
    public String U5;
    public boolean U6;
    public boolean U7;
    public boolean U8;
    public int U9;
    public ArrayList Ua;
    public long Ub;
    public final Rect Uc;
    public FrameLayout V;
    public ei.x3 V0;
    public ci.a3 V1;
    public ImageView V2;
    public MessageObject V3;
    public HashMap V4;
    public j9.u V5;
    public int V6;
    public MessageObject V7;
    public View V8;
    public boolean V9;
    public final bi Va;
    public final kg Vb;
    public final ih.m W;
    public ei.x3 W0;
    public org.telegram.ui.ActionBar.p0 W1;
    public RadialProgressView W2;
    public ah.x W3;
    public final SparseArray W4;
    public TLRPC.ChatInvite W5;
    public int W6;
    public MessageObject W7;
    public float W8;
    public boolean W9;
    public final gi Wa;
    public int Wb;
    public kh.f X;
    public ei.x3 X0;
    public TextView X1;
    public ImageView X2;
    public ai.u1 X3;
    public int X4;
    public ke X5;
    public long X6;
    public int X7;
    public float X8;
    public boolean X9;
    public final zi Xa;
    public boolean Xb;
    public gk Y;
    public org.telegram.ui.Components.ah Y0;
    public boolean Y1;
    public AnimatorSet Y2;
    public hg.n1 Y3;
    public final int[] Y4;
    public final LongSparseIntArray Y5;
    public boolean Y6;
    public boolean Y7;
    public Integer Y8;
    public org.telegram.ui.Components.qi Y9;
    public final en Ya;
    public Pattern Yb;
    public hk Z;
    public boolean Z0;
    public TextView Z1;
    public FrameLayout Z2;
    public ih.e Z3;
    public int Z4;
    public boolean Z5;
    public long Z6;
    public boolean Z7;
    public int Z8;
    public float Z9;
    public final kf Za;
    public MessageObject Zb;
    public int f41444a;
    public ah.x f41445a0;
    public kk f41446a1;
    public TextView a2;
    public ok f41447a3;
    public int f41448a4;
    public boolean f41449a5;
    public boolean f41450a6;
    public final ArrayList f41451a7;
    public long f41452a8;
    public boolean f41453a9;
    public float f41454aa;
    public final kf f41455ab;
    public df f41456ac;
    public boolean f41457b;
    public int f41458b0;
    public kh.c f41459b1;
    public sk f41460b2;
    public TextView f41461b3;
    public TL_account.TL_businessChatLink f41462b4;
    public int f41463b5;
    public long f41464b6;
    public final Paint f41465b7;
    public String f41466b8;
    public AnimatorSet f41467b9;
    public np f41468ba;
    public boolean f41469bb;
    public ArrayList f41470bc;
    public boolean f41471c;
    public org.telegram.ui.ActionBar.s0 f41472c0;
    public FrameLayout f41473c1;
    public TextView f41474c2;
    public TextView f41475c3;
    public String f41476c4;
    public int f41477c5;
    public boolean f41478c6;
    public final Paint f41479c7;
    public Integer f41480c8;
    public org.telegram.ui.ActionBar.m1 f41481c9;
    public Animator f41482ca;
    public boolean f41483cb;
    public final BotForumHelper.BotDraftAnimationsPool f41484cc;
    public boolean d;
    public wr f41485d0;
    public LinearLayout f41486d1;
    public org.telegram.ui.Components.v31 f41487d2;
    public jk f41488d3;
    public int f41489d4;
    public boolean f41490d5;
    public boolean f41491d6;
    public final ColorMatrix f41492d7;
    public byte[] f41493d8;
    public boolean f41494d9;
    public boolean f41495da;
    public long db;
    public final ih.a f41496dc;
    public TLRPC.Chat e;
    public org.telegram.ui.ActionBar.x f41497e0;
    public org.telegram.ui.Components.ro f41498e1;
    public ig.e f41499e2;
    public ImageView f41500e3;
    public int f41501e4;
    public boolean f41502e5;
    public boolean f41503e6;
    public final m.e3 e7;
    public int f41504e8;
    public org.telegram.ui.ActionBar.e1[] f41505e9;
    public boolean f41506ea;
    public NotificationCenter.ObserversGroup f41507eb;
    public boolean f41508ec;
    public TLRPC.User f41509f;
    public org.telegram.ui.ActionBar.s0 f41510f0;
    public li f41511f1;
    public org.telegram.ui.Components.w90 f41512f2;
    public ImageView f41513f3;
    public boolean f41514f4;
    public AnimatorSet f41515f5;
    public long f41516f6;
    public final org.telegram.ui.ActionBar.j5 f7;
    public int f41517f8;
    public org.telegram.ui.ActionBar.e1 f41518f9;
    public sn f41519fa;
    public boolean f41520fb;
    public boolean fc;
    public org.telegram.ui.ActionBar.s0 f41521g0;
    public ig.a2 f41522g1;
    public ImageView f41523g2;
    public org.telegram.ui.Components.o6 f41524g3;
    public String f41525g4;
    public final SparseIntArray f41526g5;
    public Long f41527g6;
    public long f41528g7;
    public ke f41529g8;
    public final ek f41530g9;
    public float f41531ga;
    public int f41532gb;
    public boolean f41533gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.u0 f41534h0;
    public ig.z f41535h1;
    public gi.n f41536h2;
    public org.telegram.ui.Components.o6 f41537h3;
    public byte[] f41538h4;
    public final SparseIntArray f41539h5;
    public int f41540h6;
    public int f41541h7;
    public String f41542h8;
    public fm f41543h9;
    public AnimatorSet ha;
    public int f41544hb;
    public long hc;
    public org.telegram.ui.ActionBar.x f41545i0;
    public ih.k f41546i1;
    public TextView f41547i2;
    public org.telegram.ui.Components.o6 f41548i3;
    public String f41549i4;
    public boolean f41550i5;
    public final SparseArray[] f41551i6;
    public int f41552i7;
    public ChatObject.Call f41553i8;
    public nk f41554i9;
    public final ok ia;
    public boolean f41555ib;
    public boolean f41556ic;
    public org.telegram.ui.ActionBar.u0 f41557j0;
    public km f41558j1;
    public ak f41559j2;
    public xj f41560j3;
    public MessageObject f41561j4;
    public boolean f41562j5;
    public final SparseArray[] f41563j6;
    public final Matrix f41564j7;
    public boolean f41565j8;
    public int f41566j9;
    public vh.i f41567ja;
    public boolean f41568jb;
    public boolean f41569jc;
    public org.telegram.ui.ActionBar.u0 f41570k0;
    public org.telegram.ui.Components.no f41571k1;
    public FrameLayout f41572k2;
    public vj f41573k3;
    public MessageObject f41574k4;
    public boolean f41575k5;
    public final SparseArray[] f41576k6;
    public LinearGradient f41577k7;
    public boolean f41578k8;
    public int f41579k9;
    public ah.f0 f41580ka;
    public a0.h f41581kb;
    public boolean f41582kc;
    public org.telegram.ui.ActionBar.s0 f41583l0;
    public final ArrayList l1;
    public ak f41584l2;
    public org.telegram.ui.Cells.v0 f41585l3;
    public boolean l4;
    public boolean f41586l5;
    public boolean f41587l6;
    public int f41588l7;
    public TLRPC.ChatFull f41589l8;
    public int f41590l9;
    public a41 f41591la;
    public a0.h f41592lb;
    public boolean f41593lc;
    public org.telegram.ui.ActionBar.u0 m0;
    public hj f41594m1;
    public FrameLayout f41595m2;
    public int f41596m3;
    public ArrayList f41597m4;
    public boolean f41598m5;
    public int f41599m6;
    public int f41600m7;
    public TLRPC.UserFull f41601m8;
    public boolean f41602m9;
    public boolean f41603ma;
    public long f41604mb;
    public b9 f41605mc;
    public boolean f41606n;
    public org.telegram.ui.ActionBar.x f41607n0;
    public org.telegram.ui.Components.o6 f41608n1;
    public TextView f41609n2;
    public org.telegram.ui.Components.q60 f41610n3;
    public MessageObject f41611n4;
    public boolean f41612n5;
    public int f41613n6;
    public final Paint f41614n7;
    public org.telegram.ui.Cells.g6 f41615n8;
    public boolean f41616n9;
    public org.telegram.ui.Components.up f41617na;
    public wk f41618nb;
    public int f41619nc;
    public boolean f41620o0;
    public fh f41621o1;
    public org.telegram.ui.Components.z00 f41622o2;
    public View f41623o3;
    public TLRPC.TL_forumTopic f41624o4;
    public MessageObject f41625o5;
    public int f41626o6;
    public final Matrix f41627o7;
    public t01 f41628o8;
    public lm f41629o9;
    public qn f41630oa;
    public boolean ob;
    public ValueAnimator oc;
    public RadialProgressView f41631p0;
    public org.telegram.ui.Components.kz0 f41632p1;
    public org.telegram.ui.Components.vx0 f41633p2;
    public boolean f41634p3;
    public long f41635p4;
    public MessageObject p5;
    public int f41636p6;
    public LinearGradient f41637p7;
    public final a0.h f41638p8;
    public View p9;
    public sn f41639pa;
    public boolean f41640pb;
    public ni f41641pc;
    public org.telegram.ui.ActionBar.s0 f41642q0;
    public org.telegram.ui.ActionBar.s0 f41643q1;
    public org.telegram.ui.Components.p40 f41644q2;
    public boolean f41645q3;
    public int f41646q4;
    public MessageObject.GroupedMessages f41647q5;
    public int q6;
    public boolean f41648q7;
    public String f41649q8;
    public boolean f41650q9;
    public qn f41651qa;
    public boolean f41652qb;
    public boolean f41653qc;
    public long f41654r;
    public org.telegram.ui.ActionBar.s0 f41655r0;
    public org.telegram.ui.ActionBar.s0 f41656r1;
    public org.telegram.ui.Components.p40 f41657r2;
    public boolean f41658r3;
    public TLRPC.Chat f41659r4;
    public MessagePreviewParams f41660r5;
    public int f41661r6;
    public boolean f41662r7;
    public long f41663r8;
    public boolean f41664r9;
    public xh.d f41665ra;
    public boolean f41666rb;
    public int f41667rc;
    public final HashMap f41668s;
    public org.telegram.ui.ActionBar.s0 f41669s0;
    public org.telegram.ui.ActionBar.s0 f41670s1;
    public aj f41671s2;
    public AnimatorSet f41672s3;
    public boolean f41673s4;
    public MessageSuggestionParams f41674s5;
    public int f41675s6;
    public int f41676s7;
    public String f41677s8;
    public boolean f41678s9;
    public final ChatMessagesMetadataController f41679sa;
    public ArrayList f41680sb;
    public int f41681sc;
    public org.telegram.ui.ActionBar.s0 f41682t0;
    public org.telegram.ui.ActionBar.s0 f41683t1;
    public boolean f41684t2;
    public ValueAnimator f41685t3;
    public boolean f41686t4;
    public MessageObject f41687t5;
    public final ArrayList f41688t6;
    public boolean f41689t7;
    public boolean f41690t8;
    public jl f41691t9;
    public TLRPC.TL_channels_sendAsPeers f41692ta;
    public ValueAnimator f41693tb;
    public int f41694tc;
    public ClippingImageView f41695u0;
    public org.telegram.ui.Components.xo f41696u1;
    public org.telegram.ui.Components.p40 f41697u2;
    public float f41698u3;
    public boolean f41699u4;
    public MessageObject.GroupedMessages f41700u5;
    public boolean f41701u6;
    public boolean f41702u7;
    public boolean f41703u8;
    public boolean f41704u9;
    public TL_account.resolvedBusinessChatLinks ua;
    public boolean f41705ub;
    public int f41706uc;
    public final ij v;
    public org.telegram.ui.Components.x11 f41707v0;
    public kh.h f41708v1;
    public boolean f41709v2;
    public boolean f41710v3;
    public boolean f41711v4;
    public MessageObject.GroupedMessages f41712v5;
    public int f41713v6;
    public int f41714v7;
    public String f41715v8;
    public float f41716v9;
    public boolean f41717va;
    public Boolean f41718vb;
    public int f41719vc;
    public bj f41720w;
    public ih.g f41721w0;
    public boolean f41722w1;
    public org.telegram.ui.Components.p40 f41723w2;
    public boolean f41724w3;
    public int f41725w4;
    public MessageObject f41726w5;
    public int f41727w6;
    public boolean f41728w7;
    public String f41729w8;
    public zj w9;
    public boolean f41730wa;
    public boolean f41731wb;
    public boolean f41732wc;
    public bj f41733x;
    public nj f41734x0;
    public int f41735x1;
    public org.telegram.ui.Components.p40 f41736x2;
    public boolean f41737x3;
    public int f41738x4;
    public in f41739x5;
    public int f41740x6;
    public boolean f41741x7;
    public MessageObject f41742x8;
    public org.telegram.ui.Cells.t1 f41743x9;
    public float f41744xa;
    public boolean f41745xb;
    public long f41746xc;
    public final re.b f41747y;
    public pj f41748y0;
    public int f41749y1;
    public org.telegram.ui.Components.p40 f41750y2;
    public boolean y3;
    public int f41751y4;
    public boolean f41752y5;
    public boolean f41753y6;
    public boolean f41754y7;
    public MessageObject f41755y8;
    public org.telegram.ui.Components.x00 f41756y9;
    public final gg f41757ya;
    public int f41758yb;
    public TLRPC.TL_messages_discussionMessage yc;
    public qj f41759z0;
    public org.telegram.ui.Components.oc f41760z1;
    public org.telegram.ui.Components.p40 f41761z2;
    public boolean f41762z3;
    public qh f41763z4;
    public MessageObject f41764z5;
    public final ArrayList f41765z6;
    public int f41766z7;
    public int f41767z8;
    public boolean f41768z9;
    public final xk f41769za;
    public HashMap f41770zb;
    public TLRPC.messages_Messages zc;

    public sn(Bundle bundle) {
        super(bundle);
        this.f41444a = 0;
        this.f41471c = false;
        this.d = false;
        this.f41668s = new HashMap();
        this.v = new ij(this, new kf(this, 17));
        re.b bVar = new re.b();
        this.f41747y = bVar;
        re.b bVar2 = new re.b();
        this.E = bVar2;
        this.W = new ih.m();
        this.H0 = org.telegram.ui.ActionBar.k6.Sh;
        this.Q0 = -1;
        this.R0 = Collections.newSetFromMap(new WeakHashMap());
        this.S0 = Collections.newSetFromMap(new WeakHashMap());
        this.l1 = new ArrayList();
        this.N2 = new org.telegram.ui.Components.u9[2];
        this.O2 = new rn[2];
        this.P2 = new org.telegram.ui.ActionBar.n5[2];
        this.Q2 = new hn[2];
        this.T2 = new AnimatorSet[2];
        this.U2 = false;
        this.f41596m3 = 500;
        this.f41462b4 = null;
        this.f41501e4 = -1;
        this.l4 = true;
        this.A4 = new SparseArray();
        this.B4 = new ArrayList();
        this.G4 = new ArrayList();
        this.H4 = new HashMap();
        this.J4 = -1;
        this.K4 = 0;
        this.L4 = new ArrayList(10);
        this.T4 = new ArrayList();
        this.V4 = new HashMap();
        this.W4 = new SparseArray();
        this.Y4 = new int[1];
        this.f41526g5 = new SparseIntArray();
        this.f41539h5 = new SparseIntArray();
        this.f41586l5 = true;
        this.f41612n5 = true;
        this.C5 = true;
        this.F5 = true;
        this.Y5 = new LongSparseIntArray();
        this.f41540h6 = 1;
        this.f41551i6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41563j6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41576k6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41688t6 = new ArrayList();
        this.f41701u6 = true;
        this.f41727w6 = Integer.MIN_VALUE;
        this.f41765z6 = new ArrayList();
        this.A6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.B6 = new SparseArray();
        this.C6 = new SparseArray();
        this.D6 = new HashMap();
        this.E6 = new SparseArray();
        this.F6 = new a0.h();
        this.G6 = new ArrayList();
        this.H6 = new SparseArray();
        this.I6 = new a0.h();
        this.J6 = new a0.h();
        this.K6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.L6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.M6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.N6 = new int[2];
        this.O6 = new boolean[2];
        this.P6 = new boolean[2];
        this.Q6 = new boolean[]{true, true};
        this.S6 = true;
        this.T6 = true;
        this.W6 = 0;
        this.f41451a7 = new ArrayList();
        this.f41465b7 = new Paint(1);
        this.f41479c7 = new Paint(1);
        this.f41492d7 = new ColorMatrix();
        this.e7 = new m.e3();
        this.f7 = new org.telegram.ui.ActionBar.j5(0, false, false, new wj(this, 0));
        this.f41564j7 = new Matrix();
        Paint paint = new Paint(1);
        this.f41614n7 = paint;
        this.f41627o7 = new Matrix();
        this.f41766z7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.J7 = Integer.MAX_VALUE;
        this.K7 = -1;
        this.S7 = true;
        this.X7 = Integer.MAX_VALUE;
        this.f41504e8 = -1;
        this.f41517f8 = -10000;
        this.f41638p8 = new a0.h();
        this.K8 = new kf(this, 21);
        gh.b bVar3 = new gh.b();
        this.L8 = bVar3;
        bh.b bVar4 = new bh.b(bVar3);
        this.M8 = bVar4;
        this.S8 = new Paint(1);
        this.T8 = 0.0f;
        this.W8 = 1.0f;
        this.X8 = 0.0f;
        this.f41494d9 = true;
        this.f41530g9 = new ek(this);
        this.f41768z9 = true;
        this.ia = new ok(this, 0);
        this.f41679sa = new ChatMessagesMetadataController(this);
        this.f41757ya = new gg(this, 0);
        this.f41769za = new xk(this);
        this.Ba = -1;
        this.Sa = new ll(this);
        this.Ta = new sl(this);
        this.Va = new bi(this);
        this.Wa = new gi(this);
        this.Xa = new zi(this);
        this.Ya = new en(this);
        this.Za = new kf(this, 27);
        this.f41455ab = new kf(this, 29);
        this.f41652qb = false;
        this.Sb = new RectF();
        this.Vb = new kg(this, 2);
        this.f41484cc = new BotForumHelper.BotDraftAnimationsPool();
        this.f41496dc = new Object();
        this.f41653qc = false;
        org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
        this.Ic = new ne.b(0, this, zrVar, 320L, false);
        this.Jc = new ne.b(1, this, zrVar, 520L, false);
        this.Kc = new ne.b(2, this, zrVar, 520L, false);
        this.Lc = new ne.b(3, this, zrVar, 320L, false);
        this.Mc = new ne.b(4, this, zrVar, 320L, false);
        this.Nc = new ne.b(5, this, zrVar, 320L, false);
        this.Oc = new ne.b(6, this, zrVar, 320L, false);
        kg kgVar = new kg(this, 7);
        ?? obj = new Object();
        obj.f14334b = new float[32];
        obj.f14333a = 1;
        obj.d = new ne.l(obj, me.a.f16916a, 240L);
        obj.f14335c = kgVar;
        this.Pc = obj;
        this.Sc = new ArrayList();
        this.Tc = new ArrayList();
        this.Uc = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.F = fVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            gh.d dVar = new gh.d(obj2);
            this.I = dVar;
            dVar.v = new kg(this, 9);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f11078f = obj2;
            bh.b bVar5 = new bh.b(dVar);
            this.K = bVar5;
            bVar5.f4367i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(obj2);
                this.H = dVar2;
                dVar2.v = new kg(this, 9);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f11078f = obj2;
                bh.b bVar6 = new bh.b(dVar2);
                this.J = bVar6;
                bVar6.f4367i = LiteMode.isEnabled(262144);
            } else {
                this.H = null;
                this.J = bVar5;
            }
        } else {
            this.F = null;
            this.G = 0;
            this.H = null;
            this.I = null;
            this.J = new bh.b(obj2);
            this.K = new bh.b(obj2);
        }
        bh.b bVar7 = new bh.b(obj2);
        this.M = bVar7;
        bVar7.e = bVar;
        this.J.e = bVar;
        this.K.e = bVar;
        bVar4.e = new re.b();
        bVar7.d = bVar2;
        this.J.d = bVar2;
        this.K.d = bVar2;
        bVar4.d = bVar2;
    }

    public static void A0(sn snVar, long j10, boolean z10) {
        if (!snVar.T4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
            edit.putInt("pin_" + snVar.f41516f6, ((Integer) snVar.T4.get(0)).intValue()).commit();
            snVar.T4.clear();
            snVar.V4.clear();
            snVar.X4 = 0;
            snVar.f41463b5 = 0;
            snVar.f41477c5 = 0;
            snVar.Fc(0, true);
        }
        if (ChatObject.isMonoForum(snVar.e) && ChatObject.canManageMonoForum(snVar.currentAccount, snVar.e)) {
            if (j10 != 0) {
                snVar.getMessagesStorage().removeTopic(-snVar.e.f20344id, j10);
                snVar.getMessagesController().deleteSavedDialog(j10, snVar.getMessagesController().getInputPeer(-snVar.e.f20344id));
                snVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(snVar.e.f20344id, j10);
            }
        } else {
            snVar.getMessagesController().deleteDialog(snVar.f41516f6, 1, z10);
            snVar.getMessagesStorage().removeAllTopics(snVar.f41516f6);
            snVar.getMessagesController().getTopicsController().reloadTopics(-snVar.f41516f6);
        }
        snVar.Y5.put(j10, 0);
        org.telegram.ui.Components.v31 v31Var = snVar.f41487d2;
        if (v31Var != null) {
            v31Var.setAllTopicsHidden(false);
        }
        if (j10 == snVar.f41635p4) {
            snVar.B7(false, null);
            snVar.A0.O(false);
        }
    }

    public static void A1(sn snVar, ag.a aVar, Runnable runnable) {
        if (!snVar.isFinished) {
            if (ag.a.m(ai.ha.x(snVar.currentAccount, aVar.f631a).p()).f632b < aVar.f632b) {
                ag.b bVar = aVar.f631a;
                if (bVar == ag.b.f633a) {
                    new ai.dd(snVar.getParentActivity(), snVar.getResourceProvider(), aVar.a(), 13, og.d.h(snVar.currentAccount, snVar.a()), null, snVar.a()).show();
                    return;
                } else if (bVar == ag.b.f634b) {
                    new fi.f(snVar.getParentActivity(), snVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void B0(sn snVar, MessageObject messageObject, Long l4, Runnable runnable) {
        ai.ha.y(snVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void C0(sn snVar) {
        org.telegram.ui.Components.q40.h.a();
        snVar.showDialog(new yh.o1(snVar.getParentActivity(), snVar.currentAccount, snVar.a(), null, null));
    }

    public static void C1(sn snVar) {
        SparseArray[] sparseArrayArr = snVar.f41551i6;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) snVar.A6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            snVar.f41563j6[i10].clear();
            snVar.f41576k6[i10].clear();
        }
        if (snVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(snVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && message.attachPath != null && (pathToAttach == null || !pathToAttach.exists())) {
                pathToAttach = new File(messageObject.messageOwner.attachPath);
            }
            if (pathToAttach != null && pathToAttach.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!messageObject.isVideo() && !messageObject.isRoundVideo()) {
                    intent.setType(messageObject.getMimeType());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(snVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                snVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        snVar.h9();
        snVar.Fc(0, true);
        snVar.dd(false);
        snVar.Sc();
    }

    public static void D0(org.telegram.ui.sn r19, org.telegram.ui.ik r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.D0(org.telegram.ui.sn, org.telegram.ui.ik, boolean[]):void");
    }

    public static void E0(sn snVar, TLRPC.Document document) {
        snVar.H4.put(document, 0);
        SendMessagesHelper.getInstance(snVar.currentAccount).sendSticker(document, null, snVar.f41516f6, null, null, null, snVar.f41739x5, null, true, 0, 0, false, null, snVar.H8(), 0L, snVar.S8(), snVar.f41674s5);
    }

    public static org.telegram.ui.lu0 E1(org.telegram.ui.sn r14, org.telegram.messenger.MessageObject r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.E1(org.telegram.ui.sn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.lu0");
    }

    public static void F0(sn snVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(snVar.currentAccount).getInputUser(user.f20491id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(snVar, tL_attachMenuBot, user, 1), 66);
    }

    public static TLRPC.TL_message F7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20365id = message.f20365id;
        tL_message.from_id = message.from_id;
        tL_message.from_boosts_applied = message.from_boosts_applied;
        tL_message.peer_id = message.peer_id;
        tL_message.saved_peer_id = message.saved_peer_id;
        tL_message.date = message.date;
        tL_message.expire_date = message.expire_date;
        tL_message.action = message.action;
        tL_message.message = message.message;
        tL_message.flags = message.flags;
        tL_message.flags2 = message.flags2;
        tL_message.mentioned = message.mentioned;
        tL_message.media_unread = message.media_unread;
        tL_message.out = message.out;
        tL_message.unread = message.unread;
        tL_message.entities = message.entities;
        tL_message.via_bot_name = message.via_bot_name;
        tL_message.reply_markup = message.reply_markup;
        tL_message.views = message.views;
        tL_message.forwards = message.forwards;
        tL_message.replies = message.replies;
        tL_message.edit_date = message.edit_date;
        tL_message.silent = message.silent;
        tL_message.post = message.post;
        tL_message.from_scheduled = message.from_scheduled;
        tL_message.legacy = message.legacy;
        tL_message.edit_hide = message.edit_hide;
        tL_message.pinned = message.pinned;
        tL_message.fwd_from = message.fwd_from;
        tL_message.via_bot_id = message.via_bot_id;
        tL_message.via_business_bot_id = message.via_business_bot_id;
        tL_message.reply_to = message.reply_to;
        tL_message.post_author = message.post_author;
        tL_message.grouped_id = message.grouped_id;
        tL_message.reactions = message.reactions;
        tL_message.restriction_reason = message.restriction_reason;
        tL_message.ttl_period = message.ttl_period;
        tL_message.quick_reply_shortcut_id = message.quick_reply_shortcut_id;
        tL_message.effect = message.effect;
        tL_message.noforwards = message.noforwards;
        tL_message.invert_media = message.invert_media;
        tL_message.offline = message.offline;
        tL_message.factcheck = message.factcheck;
        tL_message.send_state = message.send_state;
        tL_message.fwd_msg_id = message.fwd_msg_id;
        tL_message.params = message.params;
        tL_message.random_id = message.random_id;
        tL_message.local_id = message.local_id;
        tL_message.dialog_id = message.dialog_id;
        tL_message.ttl = message.ttl;
        tL_message.destroyTime = message.destroyTime;
        tL_message.destroyTimeMillis = message.destroyTimeMillis;
        tL_message.layer = message.layer;
        tL_message.seq_in = message.seq_in;
        tL_message.seq_out = message.seq_out;
        tL_message.with_my_score = message.with_my_score;
        tL_message.replyMessage = message.replyMessage;
        tL_message.reqId = message.reqId;
        tL_message.realId = message.realId;
        tL_message.stickerVerified = message.stickerVerified;
        tL_message.isThreadMessage = message.isThreadMessage;
        tL_message.voiceTranscription = message.voiceTranscription;
        tL_message.voiceTranscriptionOpen = message.voiceTranscriptionOpen;
        tL_message.voiceTranscriptionRated = message.voiceTranscriptionRated;
        tL_message.voiceTranscriptionFinal = message.voiceTranscriptionFinal;
        tL_message.voiceTranscriptionForce = message.voiceTranscriptionForce;
        tL_message.voiceTranscriptionId = message.voiceTranscriptionId;
        tL_message.premiumEffectWasPlayed = message.premiumEffectWasPlayed;
        tL_message.originalLanguage = message.originalLanguage;
        tL_message.translatedToLanguage = message.translatedToLanguage;
        tL_message.translatedText = message.translatedText;
        tL_message.replyStory = message.replyStory;
        tL_message.quick_reply_shortcut = message.quick_reply_shortcut;
        return tL_message;
    }

    public static void G0(sn snVar, TLRPC.ReactionCount reactionCount) {
        snVar.D7(true);
        org.telegram.ui.Components.io0.c(snVar.getParentActivity(), snVar.currentAccount, reactionCount.reaction, snVar.f41651qa);
    }

    public static CharSequence G8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.d41.k(messageObject)) {
            return messageObject.getVoiceTranscription();
        }
        CharSequence charSequence = messageObject.caption;
        if (charSequence != null) {
            return charSequence;
        }
        if (groupedMessages == null) {
            return null;
        }
        int size = groupedMessages.messages.size();
        CharSequence charSequence2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            MessageObject messageObject2 = groupedMessages.messages.get(i10);
            CharSequence charSequence3 = messageObject2.caption;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = messageObject2.getId();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void H0(sn snVar, long j10, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(snVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.z01.c(snVar.getParentActivity(), snVar.currentAccount, -j10, snVar.getUserConfig().getCurrentUser(), null, z10, z11, snVar.getResourceProvider());
    }

    public static void I1(sn snVar) {
        int i10;
        if (snVar.a() == snVar.getUserConfig().getClientUserId() && snVar.getUserConfig().isPremium() && snVar.f41618nb == null) {
            wk wkVar = new wk(snVar, snVar, snVar.getParentActivity(), snVar.currentAccount, snVar.f41651qa);
            snVar.f41618nb = wkVar;
            wkVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            snVar.f41618nb.setDelegate(new yk(snVar));
            snVar.f41618nb.setTop(true);
            int i11 = 0;
            snVar.f41618nb.setClipChildren(false);
            snVar.f41618nb.setClipToPadding(false);
            snVar.f41618nb.setVisibility(0);
            wk wkVar2 = snVar.f41618nb;
            if (wkVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            wkVar2.setHint(LocaleController.getString(i10));
            snVar.f41558j1.addView(snVar.f41618nb, w7.z5.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            snVar.f41618nb.p(null, null, true);
            snVar.f41618nb.setTranslationY(-AndroidUtilities.dp(12.0f));
            snVar.f41618nb.setScaleY(0.4f);
            snVar.f41618nb.setScaleX(0.4f);
            snVar.f41618nb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.zr.h).start();
            snVar.Sc();
            wk wkVar3 = snVar.f41618nb;
            float f7 = snVar.I9;
            rk rkVar = snVar.A1;
            if (rkVar != null) {
                i11 = rkVar.getCurrentHeight();
            }
            wkVar3.setTranslationY(f7 + i11);
        }
    }

    public static SpannableStringBuilder I8(MessageObject messageObject, boolean z10, long j10) {
        TLRPC.Chat chat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long fromChatId = messageObject.getFromChatId();
            if (j10 != fromChatId) {
                int i10 = (fromChatId > 0L ? 1 : (fromChatId == 0L ? 0 : -1));
                if (i10 > 0) {
                    TLRPC.User user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user.first_name, user.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i10 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
                    spannableStringBuilder.append((CharSequence) chat.title).append((CharSequence) ":\n");
                }
            }
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            spannableStringBuilder.append((CharSequence) restrictionReason);
            return spannableStringBuilder;
        }
        CharSequence charSequence = messageObject.caption;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(messageObject.messageText);
        return spannableStringBuilder;
    }

    public static void J0(sn snVar, String str) {
        if (snVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(snVar.currentAccount).getInviteText(1));
            snVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void K0(sn snVar) {
        long j10;
        ArrayList arrayList = snVar.f41688t6;
        arrayList.add(Integer.valueOf(snVar.f41540h6));
        if (snVar.f41489d4 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(snVar.currentAccount);
            String str = snVar.G3;
            int i10 = snVar.classGuid;
            int i11 = snVar.f41448a4;
            int i12 = snVar.f41540h6;
            snVar.f41540h6 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (snVar.I7 != 0) {
            MessagesController messagesController = snVar.getMessagesController();
            long j11 = snVar.f41516f6;
            long j12 = snVar.X6;
            int i13 = snVar.I7;
            int i14 = snVar.classGuid;
            int i15 = snVar.f41489d4;
            long j13 = snVar.f41635p4;
            int i16 = snVar.f41751y4;
            int i17 = snVar.f41540h6;
            snVar.f41540h6 = i17 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j13, i16, i17, snVar.f41686t4);
        } else if (snVar.G7 != 0 && (!snVar.K9() || snVar.G7 == snVar.X7 || snVar.f41686t4)) {
            int i18 = snVar.f41714v7;
            if (i18 != 0) {
                snVar.X6 = i18;
                MessagesController messagesController2 = snVar.getMessagesController();
                long j14 = snVar.X6;
                boolean z10 = snVar.f41689t7;
                int i19 = snVar.f41676s7;
                int i20 = snVar.G7;
                int i21 = snVar.classGuid;
                int i22 = snVar.f41489d4;
                long j15 = snVar.f41635p4;
                int i23 = snVar.f41751y4;
                int i24 = snVar.f41540h6;
                snVar.f41540h6 = i24 + 1;
                messagesController2.loadMessages(j14, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j15, i23, i24, snVar.f41686t4);
            } else {
                MessagesController messagesController3 = snVar.getMessagesController();
                long j16 = snVar.f41516f6;
                long j17 = snVar.X6;
                boolean z11 = snVar.f41689t7;
                int i25 = snVar.f41676s7;
                int i26 = snVar.G7;
                int i27 = snVar.classGuid;
                int i28 = snVar.f41489d4;
                long j18 = snVar.f41635p4;
                int i29 = snVar.f41751y4;
                int i30 = snVar.f41540h6;
                snVar.f41540h6 = i30 + 1;
                messagesController3.loadMessages(j16, j17, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j18, i29, i30, snVar.f41686t4);
            }
        } else if (snVar.f41702u7) {
            snVar.f41540h6++;
        } else {
            MessagesController messagesController4 = snVar.getMessagesController();
            long j19 = snVar.f41516f6;
            long j20 = snVar.X6;
            boolean z12 = snVar.f41689t7;
            int i31 = snVar.f41676s7;
            int i32 = snVar.G7;
            int i33 = snVar.classGuid;
            int i34 = snVar.f41489d4;
            long j21 = snVar.f41635p4;
            int i35 = snVar.f41751y4;
            int i36 = snVar.f41540h6;
            snVar.f41540h6 = i36 + 1;
            messagesController4.loadMessages(j19, j20, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j21, i35, i36, snVar.f41686t4);
        }
        int i37 = snVar.f41489d4;
        if (i37 == 0 || (i37 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId())) {
            if (snVar.K9() && !snVar.f41686t4) {
                return;
            }
            arrayList.add(Integer.valueOf(snVar.f41540h6));
            MessagesController messagesController5 = snVar.getMessagesController();
            long j22 = snVar.f41516f6;
            long j23 = snVar.X6;
            int i38 = snVar.classGuid;
            if (snVar.f41489d4 == 3) {
                j10 = 0;
            } else {
                j10 = snVar.f41635p4;
            }
            long j24 = j10;
            int i39 = snVar.f41751y4;
            int i40 = snVar.f41540h6;
            snVar.f41540h6 = i40 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j24, i39, i40, snVar.f41686t4);
        }
    }

    public static java.util.ArrayList K7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.K7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void L0(sn snVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        MessagesController.getNotificationsSettings(snVar.currentAccount).edit().putLong("dialog_join_requested_time_" + snVar.f41516f6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(snVar.e) && !snVar.e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.z80.f33173s;
            org.telegram.ui.Components.z80.x(context, snVar, org.telegram.ui.Components.vc.a0(snVar), z10);
        }
        snVar.Bb(false, true);
    }

    public static void M0(sn snVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, p6 p6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f20365id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(snVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            snVar.getMessagesController().getStoriesController().f5406k.d(hVar, new eh(3, hVar, p6Var), snVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static FrameLayout M7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.g6 g6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        ai.wd wdVar = new ai.wd(context, 13);
        int i11 = 3;
        wdVar.setMaxLines(3);
        wdVar.setGravity(3);
        wdVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.W(wdVar, org.telegram.ui.ActionBar.k6.E8, g6Var);
        wdVar.setTextSize(1, i10);
        wdVar.setMaxWidth(AndroidUtilities.dp(170.0f));
        wdVar.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(wdVar, w7.z5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void N0(sn snVar) {
        snVar.J7(false);
        if (!snVar.fragmentBeginToShow) {
            nj njVar = snVar.f41734x0;
            njVar.W1 = false;
            njVar.X1 = 0;
            njVar.setEmptyView(snVar.f41473c1);
            nj njVar2 = snVar.f41734x0;
            njVar2.W1 = true;
            njVar2.X1 = 1;
            return;
        }
        snVar.f41734x0.setEmptyView(snVar.f41473c1);
    }

    public static void O0(sn snVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        snVar.Sb(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void P0(sn snVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = snVar.U1.getAdapter().f11974w0;
        int i10 = snVar.currentAccount;
        TLRPC.User user2 = snVar.f41509f;
        if (user2 != null) {
            j10 = user2.f20491id;
        } else {
            j10 = snVar.e.f20344id;
        }
        gi.t4 b10 = gi.t4.b(i10, j10, user.f20491id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, snVar.S8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(snVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(snVar.currentAccount);
            MessagesController.showCantOpenAlert(snVar, restrictionReason);
            return;
        }
        gi.d3 d3Var = new gi.d3(snVar.getParentActivity(), snVar.getResourceProvider());
        d3Var.x(false);
        d3Var.B0 = true;
        d3Var.f11171l0 = snVar.getParentActivity();
        d3Var.t(snVar, b10);
        d3Var.show();
    }

    public static a3.i0 P4(sn snVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = snVar.getMessagesController().createDeleteShowOnceTask(snVar.f41516f6, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                snVar.Ac(arrayList, true);
            }
            return new a3.i0(snVar, createDeleteShowOnceTask, messageObject, 16);
        }
        return null;
    }

    public static void Q0(sn snVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(snVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, snVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(snVar.currentAccount).editMessage(messageObject, null, false, snVar, null, i10, i11);
        }
    }

    public static void R0(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(snVar.currentAccount).loadAttachMenuBots(false, true);
            snVar.ba(user.f20491id, snVar.f41729w8, false);
        }
    }

    public static void R3(sn snVar) {
        org.telegram.ui.ActionBar.x xVar;
        if (!snVar.f41652qb && (xVar = snVar.f41545i0) != null) {
            xVar.a();
            org.telegram.ui.ActionBar.u0 u0Var = xVar.f21950m;
            u0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (snVar.f41489d4 == 0) {
                u0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            u0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            u0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            u0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = snVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f29448a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.q11(obj, 0), 0, spannableStringBuilder4.length(), 33);
                u0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f29448a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.q11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                u0Var.g(56, spannableStringBuilder5);
            }
            u0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (snVar.h == null) {
                u0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            u0Var.g(54, LocaleController.getString(R.string.Regular));
            snVar.f41652qb = true;
        }
    }

    public static boolean T0(org.telegram.ui.sn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.T0(org.telegram.ui.sn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static MessageObject T1(sn snVar) {
        View view = snVar.p9;
        if (view instanceof org.telegram.ui.Cells.t1) {
            return ((org.telegram.ui.Cells.t1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) view).getMessageObject();
        }
        return null;
    }

    public static void U(sn snVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = snVar.getParentActivity();
        int i12 = snVar.currentAccount;
        long j10 = snVar.f41516f6;
        qn qnVar = snVar.f41651qa;
        int i13 = org.telegram.ui.Components.ro.L;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.g6) qnVar, false);
        h3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21255h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(80.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i14, qnVar));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i14);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(imageView, K, O, null, qnVar);
        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(textView, i15, qnVar);
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.W(textView2, i15, qnVar);
        textView2.setTextSize(1, 14.0f);
        if (j10 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i12).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (premiumFeaturesBlocked) {
            i11 = R.string.PremiumMessageTextLocked;
        } else {
            i11 = R.string.PremiumMessageText;
        }
        org.telegram.messenger.tl.r(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            sg.p0 p0Var = new sg.p0(parentActivity, qnVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.d3(h3Var, 1));
            p0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(p0Var, w7.z5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        h3Var.setCustomView(linearLayout);
        h3Var.show();
    }

    public static void U0(sn snVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(snVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (snVar.i() != null) {
                tLObject2 = snVar.i();
            } else {
                tLObject2 = snVar.e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = snVar.f41509f;
                if (user2 != null && user2.bot && user.f20491id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.tl.q(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.vc.a0(snVar), null);
                } else if (user2 != null && user2.bot && user.f20491id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.tl.q(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.vc.a0(snVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.tl.q(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.vc.a0(snVar), null);
                } else {
                    TLRPC.Chat chat = snVar.e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.tl.q(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.vc.a0(snVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = snVar.e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.tl.q(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.vc.a0(snVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                snVar.ba(user.f20491id, snVar.f41729w8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.v6 v6Var = new org.telegram.ui.Components.v6(snVar.getParentActivity());
                v6Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.ia, false));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.L5, v6Var, null);
                v6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.V = v6Var;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(snVar, user, atomicBoolean, tL_attachMenuBot, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(snVar.getParentActivity(), 5, snVar.getResourceProvider());
                    z1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
                    z1Var.setMultiline(true);
                    z1Var.e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
                    if (LocaleController.isRTL) {
                        dp = AndroidUtilities.dp(16.0f);
                    } else {
                        dp = AndroidUtilities.dp(8.0f);
                    }
                    if (LocaleController.isRTL) {
                        dp2 = AndroidUtilities.dp(8.0f);
                    } else {
                        dp2 = AndroidUtilities.dp(16.0f);
                    }
                    z1Var.setPadding(dp, 0, dp2, 0);
                    z1Var.setOnClickListener(new org.telegram.ui.ActionBar.s1(13, z1Var, atomicBoolean));
                    c2Var.G = 6;
                    alertDialog$Builder.o(z1Var);
                }
                alertDialog$Builder.p();
            } else {
                gi1.a(snVar.getParentActivity(), new y(snVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void U4(sn snVar, org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int i11;
        ne.b bVar = snVar.Kc;
        if (snVar.Y != null && !bVar.f17447f && t1Var.getMessageObject() != null) {
            km kmVar = snVar.f41558j1;
            RectF rectF = AndroidUtilities.rectTmp;
            ih.k.c(t1Var, kmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            th.a aVar = t1Var.f23314a6;
            if (aVar != null && t1Var.f23499n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((snVar.f41558j1.getMeasuredHeight() - snVar.f41734x0.getPaddingBottom()) + snVar.Gc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = t1Var.getMessageObject();
                if (snVar.Qc == null) {
                    snVar.Qc = new rh.c(snVar.getParentActivity(), snVar.resourceProvider, snVar);
                    int indexOfChild = snVar.f41558j1.indexOfChild(snVar.f41734x0);
                    if (indexOfChild >= 0) {
                        snVar.f41558j1.addView(snVar.Qc, indexOfChild + 1, w7.z5.g());
                    } else {
                        snVar.f41558j1.addView(snVar.Qc, w7.z5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (t1Var.e3()) {
                        i11 = org.telegram.ui.ActionBar.k6.f21372nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.f21466sb;
                    }
                    snVar.Q0 = i11;
                } else {
                    if (t1Var.e3()) {
                        i10 = org.telegram.ui.ActionBar.k6.f21392od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21374nd;
                    }
                    snVar.Q0 = i10;
                }
                snVar.Qc.setColor(snVar.getThemedColor(snVar.Q0));
                snVar.Qc.setCellToWatch(t1Var);
                snVar.Qc.f46167b.f46163a.a(false, false);
                snVar.Qc.setAnimatedVisibility(bVar.e);
                snVar.Qc.f46167b.setOnClickListener(new hg.r0(new kg(snVar, 0), 19));
                rh.c cVar = snVar.Qc;
                cVar.f46172s = new kg(snVar, 1);
                org.telegram.ui.Cells.c6 c6Var = cVar.f46166a;
                c6Var.setOnKeyListener(new lg(snVar, 0));
                c6Var.setOnEditorActionListener(new ka(snVar, 1));
                snVar.Y.Y4 = c6Var;
                AndroidUtilities.runOnUIThread(new h4(snVar, measuredHeight, c6Var, 3), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void V(sn snVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (snVar.f41758yb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            snVar.S5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                snVar.S5 = null;
                MessagePreviewParams messagePreviewParams = snVar.f41660r5;
                if (messagePreviewParams != null) {
                    int i11 = snVar.currentAccount;
                    CharSequence fieldText = snVar.Y.getFieldText();
                    MessageObject messageObject3 = snVar.f41764z5;
                    if (messageObject3 == snVar.f41561j4) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, snVar.f41739x5, snVar.B5);
                }
                snVar.m8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                snVar.U5 = str;
            }
            if (snVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = snVar.f41660r5;
            if (messagePreviewParams2 != null) {
                int i12 = snVar.currentAccount;
                CharSequence fieldText2 = snVar.Y.getFieldText();
                MessageObject messageObject4 = snVar.f41764z5;
                if (messageObject4 == snVar.f41561j4) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, snVar.f41739x5, snVar.B5);
            }
            snVar.Kb(true, snVar.S5, false);
            return;
        }
        snVar.S5 = null;
        snVar.m8();
    }

    public static void V0(sn snVar, long j10, long j11, Long l4) {
        int i10;
        String str;
        if (snVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = snVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(snVar.e)) {
            i10 = R.string.RemoveMessageFeeMessageChannel;
        } else {
            i10 = R.string.RemoveMessageFeeMessage;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(j10)));
        if (l4.longValue() > 0) {
            str = LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l4.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.d5.h0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new bh(snVar, j10, j11, l4, 0), snVar.resourceProvider, true);
    }

    public static sn V9(int i10, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i10);
        return new sn(bundle);
    }

    public static boolean W(sn snVar) {
        MessageObject messageObject = snVar.Zb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(snVar.getParentActivity()), snVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void W0(sn snVar, org.telegram.ui.Components.h80 h80Var) {
        if (snVar.Zb == null) {
            return;
        }
        h80Var.u();
        snVar.O9(snVar.Zb, false, true);
        pf.d.q(snVar.getParentActivity(), Uri.parse(snVar.Zb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(snVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void W1(sn snVar, float f7) {
        View view = snVar.p9;
        if (view instanceof org.telegram.ui.Cells.t1) {
            ((org.telegram.ui.Cells.t1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setWalletSlidingOffset(f7);
        }
    }

    public static sn W9(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new sn(bundle);
    }

    public static void X(sn snVar, long j10, long j11) {
        ai.ha.y(snVar.currentAccount, false).C(j10, j11, new ai.q5(snVar, j10, j11, 1));
    }

    public static void X0(sn snVar, Object[] objArr, org.telegram.ui.Components.sy0 sy0Var, boolean z10, TLRPC.StickerSet stickerSet) {
        int i10;
        if (objArr.length > 2) {
            Object obj = objArr[2];
            if (obj instanceof TLRPC.Document) {
                TLRPC.Document document = (TLRPC.Document) obj;
                if (objArr.length > 3) {
                    Object obj2 = objArr[3];
                    if (obj2 instanceof String) {
                        document.localThumbPath = (String) obj2;
                    }
                }
                org.telegram.ui.Components.vc vcVar = new org.telegram.ui.Components.vc(sy0Var.container, snVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.oc q6 = vcVar.q(document, LocaleController.formatString(i10, stickerSet.title));
                q6.f29203j = 2750;
                q6.k(true);
            }
        }
    }

    public static void X1(sn snVar) {
        long j10;
        np npVar = snVar.f41468ba;
        if (npVar != null) {
            if (snVar.f41686t4) {
                if (npVar.H != null) {
                    if (snVar.getParentLayout() != null) {
                        org.telegram.ui.Components.m9.a(snVar, snVar.getParentLayout().getFragmentStack().indexOf(snVar), snVar.e, snVar.f41509f, snVar.f41624o4, snVar.f41516f6, snVar.Ha, snVar.Ga);
                    }
                    TLRPC.Chat chat = snVar.e;
                    TLRPC.TL_forumTopic tL_forumTopic = snVar.f41468ba.H;
                    long j11 = snVar.f41516f6;
                    int i10 = snVar.Ga;
                    int i11 = snVar.Ha;
                    if (snVar.getParentLayout() != null) {
                        org.telegram.ui.Components.m9.a(snVar, snVar.getParentLayout().getFragmentStack().indexOf(snVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", snVar.f41468ba.f39927a);
                    bundle.putInt("dialog_filter_id", snVar.f41468ba.f39929b);
                    bundle.putBoolean("pulled", true);
                    sn g10 = og.d.g(snVar, -snVar.f41516f6, snVar.f41468ba.H, 0, bundle);
                    g10.f41495da = true;
                    f41443cd = true;
                    snVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = npVar.G;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f20344id;
            }
            if (j10 != 0) {
                snVar.y6();
                np npVar2 = snVar.f41468ba;
                TLRPC.Chat chat3 = npVar2.G;
                long j13 = npVar2.Z;
                int i12 = npVar2.f39927a;
                int i13 = npVar2.f39929b;
                if (snVar.getParentLayout() != null) {
                    org.telegram.ui.Components.m9.a(snVar, snVar.getParentLayout().getFragmentStack().indexOf(snVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = snVar.f41468ba.G;
                if (chat4 != null) {
                    j12 = chat4.f20344id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", snVar.f41468ba.f39927a);
                bundle2.putInt("dialog_filter_id", snVar.f41468ba.f39929b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(snVar.currentAccount).edit().remove("diditem" + snVar.f41468ba.Z).apply();
                sn snVar2 = new sn(bundle2);
                ArrayList arrayList = snVar.f41680sb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = snVar.f41680sb;
                    snVar2.f41680sb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                snVar2.f41495da = true;
                f41443cd = true;
                snVar.presentFragment(snVar2, true);
            }
        }
    }

    public static void Y(sn snVar, long j10, long j11) {
        BotForumHelper.getInstance(snVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        snVar.f41456ac = null;
    }

    public static void Y0(sn snVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            snVar.f41732wc = true;
            snVar.f41734x0.g1();
            Bundle bundle = new Bundle();
            final long dialogId = ((MessageObject) arrayList.get(0)).getDialogId();
            bundle.putLong("chat_id", -dialogId);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("historyPreloaded", z10);
            sn snVar2 = new sn(bundle);
            snVar2.vb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                snVar2.X7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = snVar2.f41561j4.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                snVar2.f41561j4.messageOwner.reactions = tL_messageReactions;
            }
            ai.db dbVar = new ai.db(snVar, new boolean[]{false}, i11, snVar2, 16);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f20365id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = snVar2.getClassGuid();
                NotificationCenter.getInstance(snVar.currentAccount).addObserver(new pi(snVar, classGuid, dbVar, snVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        sn snVar3 = sn.this;
                        MessagesController messagesController = snVar3.getMessagesController();
                        TLRPC.messages_Messages messages_messages2 = messages_messages;
                        int size2 = messages_messages2.messages.size();
                        int i19 = i10;
                        if (i19 > 0) {
                            i17 = i19;
                        } else {
                            i17 = i16;
                        }
                        if (i19 > 0) {
                            i18 = 3;
                        } else {
                            i18 = 2;
                        }
                        int i20 = i18;
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((MessageObject) i2.o1.i(1, arrayList)).getId(), 1, false, 0, true, snVar3.f41686t4, null);
                    }
                });
                return;
            }
            dbVar.run();
            return;
        }
        snVar.f41719vc = 0;
        snVar.f41732wc = false;
        snVar.f41734x0.g1();
        if (messageObject2 != null) {
            snVar.la(messageObject2);
        } else if (snVar.getParentActivity() != null) {
            org.telegram.ui.Components.vc.a0(snVar).t(LocaleController.getString(R.string.ChannelPostDeleted), snVar.f41651qa).j();
        }
    }

    public static void Z(sn snVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(snVar.currentAccount).sendSticker(tL_document, str, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, null, snVar.f41739x5, null, z10, i10, 0, false, obj, snVar.H8(), 0L, snVar.S8(), snVar.f41674s5);
    }

    public static void Z0(sn snVar, ArrayList arrayList, long j10, org.telegram.ui.Components.bn0 bn0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(snVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new je(snVar, j10, 3), 400L);
            bn0Var.dismiss();
        }
    }

    public static void a0(sn snVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new bf(snVar, i10, 6));
        } else {
            snVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a1(sn snVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ai.nd.k1(snVar.getParentActivity(), snVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, snVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            snVar.presentFragment(new ho0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void b0(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, of ofVar) {
        String str4;
        org.telegram.ui.Components.o41 o41Var;
        if (snVar.p5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = snVar.getParentActivity();
            int i11 = iArr[0];
            kf kfVar = new kf(snVar, 14);
            String[] strArr = org.telegram.ui.Components.x41.X;
            if (parentActivity == null) {
                o41Var = null;
            } else {
                org.telegram.ui.Components.o41 o41Var2 = new org.telegram.ui.Components.o41(parentActivity, str, str4, inputPeer, i11, richMessage, kfVar);
                o41Var2.Q(z10);
                o41Var2.S = snVar;
                o41Var2.T = ofVar;
                if (snVar.getParentActivity() != null) {
                    snVar.showDialog(o41Var2);
                }
                o41Var = o41Var2;
            }
            o41Var.setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i12 - 1).apply();
                snVar.Xc(true);
            }
        }
    }

    public static void b1(sn snVar, String str) {
        Uri parse = Uri.parse(str);
        x50.b(snVar.getParentActivity(), snVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void c0(long j10, sn snVar) {
        if (ai.ha.y(snVar.currentAccount, false).p().amount < j10) {
            new ai.dd(snVar.getParentActivity(), snVar.getResourceProvider(), j10, 13, DialogObject.getShortName(snVar.a()), new kg(snVar, 6), snVar.a()).show();
        } else {
            new ai.ed(snVar.getParentActivity(), snVar.resourceProvider).show();
        }
    }

    public static void c1(sn snVar, int i10) {
        int i11;
        RectF rectF;
        gh.d dVar = snVar.H;
        gh.d dVar2 = snVar.I;
        ArrayList arrayList = snVar.Tc;
        bh.f fVar = snVar.F;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            if (w7.j6.a(i10, 4)) {
                snVar.u9();
            }
            if (w7.j6.a(i10, 2)) {
                ArrayList arrayList2 = snVar.Sc;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, snVar.f41558j1.getMeasuredWidth(), snVar.f41734x0.getY() + snVar.f41734x0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.e(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.e(i11, AndroidUtilities.dp(8.0f), arrayList2);
                    }
                } else {
                    i11 = 0;
                }
                int a2 = zf.f0.a(arrayList2, i11, arrayList);
                int measuredWidth = snVar.f41558j1.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.r.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(snVar.f41734x0.getY(), rectF2.top);
                    rectF2.right = w7.r.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(snVar.f41734x0.getY() + snVar.f41734x0.getMeasuredHeight(), rectF2.bottom);
                }
                fVar.g(a2, arrayList);
            }
            km kmVar = snVar.f41558j1;
            Objects.requireNonNull(kmVar);
            if (fVar.e(new xf(kmVar, 0), snVar.f41558j1.getWidth(), snVar.f41558j1.getHeight())) {
                if (dVar != null) {
                    dVar.f();
                }
                if (dVar2 != null) {
                    dVar2.f();
                }
                org.telegram.ui.ActionBar.k kVar = snVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                snVar.s9();
            }
        }
    }

    public static void c2(sn snVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            messageObject = t1Var.getMessageObject();
            t1Var.f23395g1 = f7;
            t1Var.f23410h1 = f10;
            org.telegram.ui.Components.jb0 jb0Var = t1Var.Kc;
            float f11 = t1Var.f23410h1;
            jb0Var.h = t1Var.getTranslationX() + f7;
            jb0Var.f27661i = f11;
            jb0Var.f27664l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int J8 = snVar.J8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && J8 >= 2 && J8 != 20 && J8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        snVar.A6(messageObject, z10, true);
                        snVar.kc();
                        snVar.dd(false);
                    }
                }
            }
        }
    }

    public static void d0(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        String str4;
        if (snVar.p5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = snVar.p5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.x41.S(snVar.getParentActivity(), snVar, inputPeer, iArr[0], snVar.p5.summarized, str, str4, charSequence, z10, ofVar, new kf(snVar, 20)).setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i11 - 1).apply();
                snVar.Xc(true);
            }
        }
    }

    public static void d1(sn snVar) {
        if (AndroidUtilities.addToClipboard(snVar.Zb.sponsoredInfo)) {
            org.telegram.messenger.tl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(snVar.getParentActivity()), snVar.resourceProvider));
        }
    }

    public static void d2(sn snVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = snVar.G6;
        SparseArray[] sparseArrayArr = snVar.f41551i6;
        if (!snVar.f41469bb && (i11 = i10 - snVar.A0.J) >= 0 && i11 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            if (sparseArrayArr[0].get(messageObject.getId(), null) == null && sparseArrayArr[1].get(messageObject.getId(), null) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i12), (MessageObject) sparseArrayArr[0].valueAt(i12));
            }
            for (int i13 = 0; i13 < sparseArrayArr[1].size(); i13++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i13), (MessageObject) sparseArrayArr[1].valueAt(i13));
            }
            org.telegram.ui.Components.lm0 lm0Var = snVar.f41734x0;
            si siVar = new si(snVar, z10, sparseArray);
            if (!lm0Var.f28373b2) {
                lm0Var.f28391k2 = new int[2];
                new HashSet();
                lm0Var.n1(lm0Var, true);
                lm0Var.f28381f2 = siVar;
                lm0Var.f28373b2 = true;
                lm0Var.f28379e2 = i10;
                lm0Var.f28377d2 = i10;
            }
        }
    }

    public static void e0(sn snVar, long j10, long j11, Long l4, Boolean bool) {
        boolean z10 = false;
        ai.ha y3 = ai.ha.y(snVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.i0(j10, j11, z10, true);
    }

    public static void e1(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(snVar.currentAccount).loadAttachMenuBots(false, true);
            snVar.ba(user.f20491id, snVar.f41729w8, false);
        }
    }

    public static boolean e2(sn snVar, View view, RectF rectF) {
        RectF rectF2 = snVar.Sb;
        if (rectF != null && snVar.f41734x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void e4(sn snVar, org.telegram.ui.Cells.g0 g0Var) {
        String charSequence;
        if (MessagesController.getInstance(snVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = g0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new e7(snVar, g0Var, text, 3), new a1(g0Var, 14));
            return;
        }
        g0Var.setClickable(false);
    }

    public static void f0(sn snVar) {
        if (snVar.Zb == null) {
            return;
        }
        w21[] w21VarArr = {w21.T(snVar.getParentActivity(), snVar, true, snVar.resourceProvider, new org.telegram.ui.ActionBar.m3(11, snVar, w21VarArr))};
    }

    public static void f1(sn snVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (snVar.getParentActivity() != null) {
            TLRPC.Chat chat = snVar.e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !snVar.e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (snVar.h == null && (userFull = snVar.f41601m8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41651qa);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new pe(snVar, 21));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                snVar.showDialog(alertDialog$Builder.f20679a);
            } else if (!snVar.T4.isEmpty()) {
                MessagesController.getNotificationsSettings(snVar.currentAccount).edit().putInt("pin_" + snVar.f41516f6, ((Integer) snVar.T4.get(0)).intValue()).commit();
                snVar.Fc(0, true);
            }
        }
    }

    public static void f4(sn snVar) {
        if (snVar.U3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = snVar.f41489d4;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f20365id = 0;
        MessageObject messageObject = new MessageObject(snVar.currentAccount, tL_message, false, false);
        snVar.U3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void g0(sn snVar) {
        MessagesController messagesController = snVar.getMessagesController();
        long j10 = snVar.f41516f6;
        long j11 = snVar.X6;
        int i10 = snVar.classGuid;
        int i11 = snVar.f41489d4;
        long j12 = snVar.f41635p4;
        int i12 = snVar.f41751y4;
        int i13 = snVar.f41540h6;
        snVar.f41540h6 = i13 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j12, i12, i13, snVar.f41686t4);
    }

    public static void g1(sn snVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        snVar.f41674s5 = null;
        int i10 = snVar.Bb;
        if (i10 == 2) {
            snVar.f41739x5 = null;
            snVar.f41764z5 = null;
            MessagePreviewParams messagePreviewParams = snVar.f41660r5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, snVar.f41516f6, null);
            }
            snVar.m8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = snVar.f41660r5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = snVar.f41660r5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = snVar.f41660r5.forwardMessages.messages.get(i11);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41651qa);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.K0 = true;
                if (j11 > 0) {
                    TLRPC.User user = snVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", snVar.f41660r5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = snVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", snVar.f41660r5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                c2Var.T = AndroidUtilities.replaceTags(formatString);
                c2Var.R = LocaleController.formatPluralString("messages", snVar.f41660r5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new pe(snVar, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new pe(snVar, 7));
                snVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, snVar.getResourceProvider());
                }
            }
        } else if (i10 == 4) {
            snVar.S5 = null;
            MessagePreviewParams messagePreviewParams3 = snVar.f41660r5;
            if (messagePreviewParams3 != null) {
                int i12 = snVar.currentAccount;
                MessageObject messageObject4 = snVar.f41764z5;
                if (messageObject4 == snVar.f41561j4) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, snVar.f41739x5, snVar.B5);
            }
            gk gkVar = snVar.Y;
            gkVar.X2 = null;
            gkVar.Y2 = false;
            snVar.l8();
            snVar.m8();
        } else {
            if (ChatObject.isForum(snVar.e) && !snVar.f41686t4 && (messageObject = snVar.f41764z5) != null) {
                long topicId = MessageObject.getTopicId(snVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    snVar.getMediaDataController().cleanDraft(snVar.f41516f6, topicId, false);
                }
            }
            snVar.Fb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void g4(sn snVar) {
        if (snVar.V3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f20365id = 0;
        MessageObject messageObject = new MessageObject(snVar.currentAccount, tL_message, false, false);
        snVar.V3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void h0(sn snVar) {
        if (AndroidUtilities.addToClipboard(snVar.Zb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.tl.p(R.string.TextCopied, new org.telegram.ui.Components.vc(org.telegram.ui.Components.jb.a(snVar.getParentActivity()), snVar.resourceProvider));
        }
    }

    public static void h1(sn snVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = snVar.getMessagesController().getInputPeer(snVar.f41516f6);
                tL_messages_getHistory.offset_date = snVar.I7 + 86400;
                tL_messages_getHistory.limit = 1;
                snVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new vc(2, snVar, tLObject));
                return;
            }
            snVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void i0(sn snVar, TLRPC.Document document) {
        snVar.H4.put(document, 0);
        SendMessagesHelper.getInstance(snVar.currentAccount).sendSticker(document, null, snVar.f41516f6, null, null, null, snVar.f41739x5, null, true, 0, 0, false, null, snVar.H8(), 0L, snVar.S8(), snVar.f41674s5);
    }

    public static void i1(sn snVar, int i10) {
        if (snVar.fragmentView != null) {
            org.telegram.ui.Cells.z t82 = snVar.t8(i10, false);
            if (t82 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) t82;
                ah.j1 j1Var = t1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = t1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (j1Var.K || randomUnreadReaction.big)) {
                    ah.d1.d(snVar, null, t82, null, 0.0f, 0.0f, ah.i1.d(randomUnreadReaction.reaction), snVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    ah.d1.f();
                }
                j1Var.K = false;
                MessageObject messageObject = t1Var.f23660y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (t82 instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) t82;
                ah.j1 j1Var2 = v0Var.E0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = v0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (j1Var2.K || randomUnreadReaction2.big)) {
                    ah.d1.d(snVar, null, t82, null, 0.0f, 0.0f, ah.i1.d(randomUnreadReaction2.reaction), snVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    ah.d1.f();
                }
                j1Var2.K = false;
                MessageObject messageObject2 = v0Var.P0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void j0(sn snVar) {
        if (snVar.Y1) {
            snVar.getMessagesController().addDialogToFolder(snVar.f41516f6, 0, 0, 0L);
            snVar.T7();
            snVar.K3.j(23, snVar.f41516f6, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + snVar.f41516f6, false);
            edit.putBoolean("dialog_bar_block" + snVar.f41516f6, false);
            edit.putBoolean("dialog_bar_report" + snVar.f41516f6, false);
            edit.commit();
            snVar.Xc(false);
            snVar.getNotificationsController().clearDialogNotificationsSettings(snVar.f41516f6, snVar.d());
        } else if (snVar.X1.getTag() != null && ((Integer) snVar.X1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = snVar.f41589l8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < snVar.f41589l8.participants.participants.size(); i10++) {
                    hVar.k(null, snVar.f41589l8.participants.participants.get(i10).user_id);
                }
                long j10 = snVar.f41589l8.f20345id;
                org.telegram.ui.Components.v70 v70Var = new org.telegram.ui.Components.v70(snVar.getParentActivity(), snVar.currentAccount, hVar, snVar.f41589l8.f20345id, snVar, snVar.f41651qa);
                v70Var.f31357l0 = new pe(snVar, 22);
                v70Var.show();
            }
        } else if (snVar.X1.getTag() != null) {
            snVar.xb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", snVar.f41509f.f20491id);
            bundle.putBoolean("addContact", true);
            hs hsVar = new hs(bundle);
            hsVar.O = new pe(snVar, 23);
            snVar.presentFragment(hsVar);
        }
    }

    public static void j1(sn snVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ah ahVar;
        String str;
        SparseArray[] sparseArrayArr = snVar.f41551i6;
        if (snVar.getParentActivity() != null && snVar.Z9 == 0.0f) {
            if (snVar.f41489d4 == 3) {
                Bundle bundle = new Bundle();
                long N8 = snVar.N8();
                if (N8 >= 0) {
                    bundle.putLong("user_id", N8);
                } else {
                    bundle.putLong("chat_id", -N8);
                }
                snVar.presentFragment(new sn(bundle));
                return;
            }
            boolean z12 = false;
            if (snVar.F9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                snVar.Bb(true, true);
                byte[] bArr = snVar.f41538h4;
                String str2 = snVar.f41549i4;
                xe xeVar = new xe(snVar, 1);
                int i11 = r21.f40991w;
                int currentAccount = snVar.getCurrentAccount();
                Activity parentActivity = snVar.getParentActivity();
                long a2 = snVar.a();
                if (parentActivity != null) {
                    r21.N(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.vc.a0(snVar), snVar.getResourceProvider(), bArr, str2, xeVar);
                }
            } else if (snVar.f41489d4 == 2) {
                snVar.finishFragment();
                fm fmVar = snVar.f41543h9;
                if (snVar.B0.getTag() == null) {
                    z12 = true;
                }
                fmVar.J(true, z12);
            } else {
                TLRPC.User user = snVar.f41509f;
                if (user != null && user.f20491id == 489000) {
                    snVar.hc(true);
                } else if (user != null && snVar.f41606n) {
                    if (user.bot) {
                        String str3 = snVar.f41649q8;
                        snVar.f41649q8 = null;
                        snVar.getMessagesController().unblockPeer(snVar.f41509f.f20491id, new re(snVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41651qa);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pe(snVar, 8));
                    c2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    snVar.showDialog(c2Var);
                } else if (UserObject.isReplyUser(user)) {
                    snVar.hc(true);
                } else {
                    TLRPC.User user2 = snVar.f41509f;
                    if (user2 != null && user2.bot && (str = snVar.f41649q8) != null) {
                        if (str.length() != 0) {
                            snVar.getMessagesController().sendBotStart(snVar.f41509f, snVar.f41649q8);
                        } else {
                            snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", snVar.f41516f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        snVar.f41649q8 = null;
                        snVar.oc(false);
                        return;
                    }
                    if (ChatObject.isChannel(snVar.e)) {
                        TLRPC.Chat chat = snVar.e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (snVar.e.join_request) {
                                    snVar.Bb(true, true);
                                    MessagesController.getInstance(snVar.currentAccount).addUserToChat(snVar.e.f20344id, UserConfig.getInstance(snVar.currentAccount).getCurrentUser(), 0, null, null, true, new ke(snVar, 14), new m4.w0(13, snVar, context));
                                    return;
                                }
                                ke keVar = snVar.X5;
                                if (keVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(keVar);
                                    snVar.X5 = null;
                                }
                                snVar.Bb(true, true);
                                snVar.getMessagesController().addUserToChat(snVar.e.f20344id, snVar.getUserConfig().getCurrentUser(), 0, null, snVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.p0 p0Var = snVar.W1;
                                if (p0Var != null && (ahVar = snVar.Y0) != null && ahVar.d(p0Var) && snVar.Z1.getVisibility() != 8 && snVar.Z1.getTag(R.id.object_tag) != null) {
                                    MessagesController.getNotificationsSettings(snVar.currentAccount).edit().putInt("dialog_bar_vis3" + snVar.f41516f6, 3).commit();
                                    snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(snVar.f41516f6));
                                    return;
                                }
                                return;
                            }
                            snVar.hc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = snVar.f41589l8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = snVar.e;
                    TLRPC.User user3 = snVar.f41509f;
                    if (snVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.d5.r(snVar, false, chat2, user3, z11, true, false, z10, new pe(snVar, 9));
                }
            }
        }
    }

    public static void j2(sn snVar) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (snVar.L1 != null) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var2 = null;
        for (int childCount = snVar.f41734x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = snVar.f41734x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (primaryMessageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                t1Var2 = t1Var;
            }
        }
        snVar.Ab(t1Var2);
    }

    public static void k0(sn snVar, String str) {
        if (MessagesController.getInstance(snVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            pf.d.l(snVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.d5.n0(snVar.getParentActivity(), snVar.f41651qa, str, true, new eg(snVar, str, 0));
        }
    }

    public static void k1(sn snVar) {
        snVar.f41617na = null;
        snVar.f41734x0.setOnInterceptTouchListener(null);
        snVar.pb(snVar.f41558j1, true);
        ChatThemeController.getInstance(snVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void l0(sn snVar) {
        if (snVar.f41560j3.getAlpha() != 0.0f && !snVar.actionBar.s() && !snVar.F9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(snVar.f41560j3.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            snVar.L9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void l1(org.telegram.ui.sn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.t1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.l1(org.telegram.ui.sn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1, int, int):void");
    }

    public static void m0(org.telegram.ui.sn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.m0(org.telegram.ui.sn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void m1(sn snVar, int i10) {
        org.telegram.ui.ActionBar.h5 h5Var = snVar.parentLayout;
        if (h5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 backgroundFragment = h5Var.getBackgroundFragment();
        if (backgroundFragment instanceof sn) {
            sn snVar2 = (sn) backgroundFragment;
            if (snVar2.a() == snVar.f41516f6) {
                snVar.finishFragment();
                snVar2.j(i10, 0, true, 0, true, 0);
                return;
            }
        }
        snVar.presentFragment(V9(i10, snVar.f41516f6));
    }

    public static void n0(sn snVar) {
        org.telegram.ui.Cells.t1 t1Var;
        ql qlVar;
        int i10;
        if (!snVar.f41508ec && snVar.R3 && snVar.f41734x0.G && snVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = snVar.f41734x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = snVar.f41734x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var.getMessageObject() != null && t1Var.getMessageObject().messageOwner != null && t1Var.getMessageObject().messageOwner.video_processing_pending) {
                            if (t1Var.getCurrentPosition() != null) {
                                if (t1Var.getMessageObject() != null && (t1Var.getCurrentPosition().flags & 8) != 0) {
                                    int i11 = t1Var.getCurrentPosition().flags;
                                    if (t1Var.getMessageObject().isOutOwner()) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    if ((i11 & i10) == 0) {
                                        continue;
                                    }
                                }
                            }
                            t1Var.getLocationInWindow(iArr);
                            float timeY = t1Var.getTimeY() + iArr[1];
                            if (timeY >= AndroidUtilities.dp(240.0f) && timeY <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    t1Var = null;
                    break;
                }
            }
            if (t1Var != null) {
                snVar.f41508ec = true;
                ql qlVar2 = new ql(snVar, snVar.getParentActivity());
                qlVar2.p(true);
                qlVar2.K = Layout.Alignment.ALIGN_CENTER;
                qlVar2.d = 3500L;
                qlVar2.T = true;
                qlVar2.e = true;
                qlVar2.h = AndroidUtilities.dp(150.0f);
                qlVar2.q(8.0f);
                snVar.N1 = qlVar2;
                qlVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                snVar.f41558j1.addView(snVar.N1, w7.z5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                t1Var.getLocationInWindow(iArr);
                snVar.O1 = t1Var.getTimeY() + iArr[1];
                snVar.N1.setTranslationY(((-qlVar.getTop()) - AndroidUtilities.dp(120.0f)) + snVar.O1);
                snVar.N1.m(0.0f, (t1Var.f23530pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + t1Var.f23559rb);
                snVar.N1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ke(snVar, 2));
            AndroidUtilities.runOnUIThread(new ke(snVar, 2), 2000L);
        }
    }

    public static void n1(org.telegram.ui.sn r19, final org.telegram.ui.w21[] r20, final org.telegram.ui.Components.h80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.n1(org.telegram.ui.sn, org.telegram.ui.w21[], org.telegram.ui.Components.h80):void");
    }

    public static void n8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i10 = 6;
        if (z10) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_quote, 6, LocaleController.getString(R.string.Quote));
            i10 = 7;
        }
        if (z13) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, i10, LocaleController.getString(R.string.Spoiler));
            i10++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f29448a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.q11(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f29448a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.q11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i11 += 2;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_underline, i12, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_link, i11, LocaleController.getString(R.string.CreateLink));
            i11++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_date, i11, LocaleController.getString(R.string.FormattedDate));
            i11++;
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, i11, LocaleController.getString(R.string.Regular));
    }

    public static void o0(sn snVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.r61[] r61VarArr;
        if (snVar.R5 != 0) {
            snVar.getConnectionsManager().cancelRequest(snVar.R5, true);
            snVar.R5 = 0;
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = AndroidUtilities.WEB_URL.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (r61VarArr = (org.telegram.ui.Components.r61[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.r61.class)) != null && r61VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.r61 r61Var : r61VarArr) {
                    arrayList.add(r61Var.getURL());
                }
            }
            if (arrayList != null && snVar.T5 != null && arrayList.size() == snVar.T5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) snVar.T5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            snVar.T5 = arrayList;
        } catch (Exception e) {
            FileLog.e(e);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new kf(snVar, 19));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new kf(snVar, 18));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (snVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new te(snVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = snVar.S5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = snVar.f41758yb + 1;
            snVar.f41758yb = i11;
            dg dgVar = new dg(snVar, i11, getwebpagepreview, 0);
            if (snVar.f41770zb == null) {
                snVar.f41770zb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) snVar.f41770zb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                dgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            p6 p6Var = new p6(snVar, getwebpagepreview, dgVar, 1);
            if (snVar.R5 != 0) {
                snVar.getConnectionsManager().cancelRequest(snVar.R5, true);
            }
            snVar.R5 = snVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new ai.r5(10, snVar, p6Var));
            snVar.getConnectionsManager().bindRequestToGuid(snVar.R5, snVar.classGuid);
        }
    }

    public static void o1(sn snVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(snVar.currentAccount).getInputUser(user.f20491id);
                    ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new vc(3, snVar, user));
                }
            }
        }
    }

    public static org.telegram.ui.Components.vo p0(sn snVar, Context context) {
        org.telegram.ui.Components.xo xoVar = new org.telegram.ui.Components.xo(context, snVar.currentAccount, snVar.f41534h0.getPopupLayout().getSwipeBack(), false, new kj(snVar), snVar.getResourceProvider());
        snVar.f41696u1 = xoVar;
        xoVar.e(snVar.f41516f6, snVar.d(), null);
        return snVar.f41696u1.f32668f;
    }

    public static void p1(sn snVar, int i10) {
        if (snVar.f41489d4 == 7) {
            Object E = snVar.Y3.E(i10);
            if (i10 == 0) {
                snVar.Y3.getClass();
            }
            if (E instanceof MessageObject) {
                snVar.ka((MessageObject) E);
            }
        } else if (snVar.C3 != null) {
            if (i10 >= 0 && i10 < snVar.getMediaDataController().searchResultMessages.size()) {
                snVar.D3 = false;
                snVar.rb(false, true, false);
                snVar.getMediaDataController().setSearchedPosition(i10);
                snVar.Mc(snVar.getMediaDataController().getMask(), snVar.getMediaDataController().getSearchPosition(), snVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new se(snVar, snVar.getMediaDataController().searchResultMessages.get(i10), 5));
            }
        } else {
            snVar.getMediaDataController().jumpToSearchedMessage(snVar.classGuid, i10);
            snVar.Rb(false);
        }
    }

    public static void q0(sn snVar) {
        if (MessagesController.getInstance(snVar.currentAccount).isDialogMuted(snVar.f41516f6, snVar.d())) {
            snVar.Wc(true);
            AndroidUtilities.runOnUIThread(new ke(snVar, 7), 150L);
            snVar.f41534h0.M(null, null);
            if (snVar.getParentActivity() != null) {
                org.telegram.ui.Components.vc.z(snVar, 4, 0, snVar.f41651qa).j();
                return;
            }
            return;
        }
        View view = snVar.f41643q1.f21829j;
        if (view instanceof org.telegram.ui.ActionBar.e1) {
            ((org.telegram.ui.ActionBar.e1) view).b();
        }
    }

    public static void r0(sn snVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(snVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f20460id;
        long clientUserId = snVar.getUserConfig().getClientUserId();
        long j11 = snVar.f41516f6;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void r1(long j10, sn snVar) {
        if (ai.ha.y(snVar.currentAccount, false).p().amount < j10) {
            new ai.dd(snVar.getParentActivity(), snVar.getResourceProvider(), j10, 13, DialogObject.getShortName(snVar.a()), new kg(snVar, 6), snVar.a()).show();
        } else {
            new ai.ed(snVar.getParentActivity(), snVar.resourceProvider).show();
        }
    }

    public static void s0(sn snVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f20385id = snVar.getMessagesController().getInputUser(snVar.f41509f);
            snVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new ne(snVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(snVar.getUserConfig().getCurrentUser(), snVar.f41516f6, messageObject, snVar.f41561j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = snVar.H8();
        SendMessagesHelper.getInstance(snVar.currentAccount).sendMessage(of2);
        if (snVar.f41489d4 == 0) {
            snVar.T9(false);
        }
        snVar.j9(false);
    }

    public static void s1(sn snVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != snVar.d()) {
            snVar.f41604mb = SystemClock.uptimeMillis();
            snVar.B7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                snVar.Wa(snVar.d());
            } else if (snVar.d() == 0) {
                snVar.Wa(l4.longValue());
            } else {
                snVar.f41766z7 = -1;
            }
            snVar.getConnectionsManager().cancelRequestsForGuid(snVar.classGuid);
            snVar.getMessagesStorage().cancelTasksForGuid(snVar.classGuid);
            snVar.classGuid = ConnectionsManager.generateClassGuid();
            snVar.Ta();
            snVar.f41660r5 = null;
            snVar.G7 = 0;
            snVar.f41728w7 = false;
            snVar.f41741x7 = true;
            snVar.f41688t6.clear();
            snVar.f41635p4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = snVar.getMessagesController().getTopicsController().findTopic(-snVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                snVar.f41725w4 = i12;
                snVar.f41738x4 = findTopic.read_outbox_max_id;
                snVar.f41751y4 = Math.max(1, i12);
                snVar.getMessagesController().getTopicsController().getTopicRepliesCount(snVar.f41516f6, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                snVar.f41624o4 = null;
                snVar.f41597m4 = null;
                snVar.f41561j4 = null;
                snVar.f41764z5 = null;
                snVar.f41725w4 = 0;
                snVar.f41738x4 = 0;
                snVar.f41751y4 = 0;
                snVar.f41635p4 = 0L;
                snVar.f41646q4 = 0;
                snVar.f41659r4 = null;
                snVar.f41686t4 = false;
                snVar.f41673s4 = false;
            }
            snVar.v8();
            snVar.Uc(true);
            snVar.f41594m1.n(true);
            snVar.f41594m1.b();
            snVar.f41487d2.setCurrentTopic(l4.longValue());
            snVar.Xc(true);
            snVar.oc(true);
            snVar.getMessagesController().setForumLastTopicId(-snVar.a(), snVar.d());
            snVar.l9(true);
            snVar.j9(true);
            gk gkVar = snVar.Y;
            if (gkVar != null) {
                gkVar.j0(false);
                snVar.Y.D1(true);
            }
            snVar.D6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            snVar.f41735x1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            snVar.f41749y1 = i11;
            snVar.Ic(false);
            snVar.Hc(false);
            snVar.Yc();
            kn knVar = snVar.Bc;
            if (knVar != null && snVar.actionBar.f21069n0) {
                knVar.p(null);
            }
        }
    }

    public static Integer s8(ArrayList arrayList, int i10, int[] iArr) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Integer num = (Integer) arrayList.get(0);
        if (i10 >= num.intValue()) {
            iArr[0] = 0;
            return num;
        }
        int size = arrayList.size();
        int i11 = size - 1;
        Integer num2 = (Integer) arrayList.get(i11);
        if (i10 <= num2.intValue()) {
            iArr[0] = i11;
            return num2;
        }
        int i12 = 0;
        int i13 = 0;
        while (i12 < size) {
            i13 = (i12 + size) / 2;
            Integer num3 = (Integer) arrayList.get(i13);
            if (num3.intValue() == i10) {
                iArr[0] = i13;
                return num3;
            } else if (i10 < num3.intValue()) {
                if (i13 > 0) {
                    int i14 = i13 - 1;
                    Integer num4 = (Integer) arrayList.get(i14);
                    if (i10 > num4.intValue()) {
                        iArr[0] = i14;
                        return num4;
                    }
                }
                i12 = i13 + 1;
            } else if (i13 > 0 && i10 < ((Integer) arrayList.get(i13 - 1)).intValue()) {
                iArr[0] = i13;
                return num3;
            } else {
                size = i13;
            }
        }
        iArr[0] = i13;
        return (Integer) arrayList.get(i13);
    }

    public static void t0(sn snVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        String str3;
        if (snVar.p5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = snVar.p5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.x41.S(snVar.getParentActivity(), snVar, inputPeer, iArr[0], snVar.p5.summarized, strArr[0], str3, charSequence, z10, ofVar, new kg(snVar, 13)).setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i11 - 1).apply();
                snVar.Xc(true);
            }
        }
    }

    public static void u0(sn snVar) {
        int i10;
        TLRPC.ChatFull chatFull = snVar.f41589l8;
        if (chatFull != null && !snVar.C5) {
            TLRPC.Chat chat = snVar.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && snVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = snVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && snVar.visibleDialog == null && snVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = snVar.getParentActivity();
                    pe peVar = new pe(snVar, 15);
                    pe peVar2 = new pe(snVar, 16);
                    Pattern pattern = org.telegram.ui.Components.d5.f25562a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ci.n1(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                    c2Var.V = frameLayout;
                    c2Var.Q0 = 0.3974359f;
                    c2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    c2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), peVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), peVar2);
                    snVar.showDialog(c2Var);
                }
            }
        }
    }

    public static void u1(sn snVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(snVar.currentAccount).getInputUser(user.f20491id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(snVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void v0(sn snVar, String str) {
        if (MessagesController.getInstance(snVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            snVar.getParentActivity();
            pf.d.m(str);
            return;
        }
        org.telegram.ui.Components.d5.n0(snVar.getParentActivity(), snVar.f41651qa, str, false, new eg(snVar, str, 1));
    }

    public static void v1(sn snVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        sg.m1 m1Var = new sg.m1(snVar, snVar.currentAccount, user, null, null, snVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            m1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(snVar.getParentActivity());
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(160.0f), 4, u9Var, false);
        u9Var.setImageDrawable(n5Var);
        u9Var.addOnAttachStateChangeListener(new j5(n5Var, 1));
        n5Var.j(j10, false);
        m1Var.E0 = true;
        m1Var.B0 = u9Var;
        snVar.showDialog(m1Var);
    }

    public static void w0(sn snVar) {
        if (snVar.f41489d4 == 0 && snVar.getMessagesController().freezeUntilDate > snVar.getConnectionsManager().getCurrentTime() && !b.a(snVar.currentAccount, snVar.f41509f)) {
            b.c(snVar.getParentActivity(), snVar.currentAccount, snVar.getResourceProvider());
        }
    }

    public static void w1(sn snVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j10;
        int[] iArr3 = snVar.M6;
        int[] iArr4 = snVar.L6;
        boolean[] zArr = snVar.Q6;
        int[] iArr5 = snVar.K6;
        int[] iArr6 = snVar.N6;
        boolean[] zArr2 = snVar.P6;
        ArrayList arrayList = snVar.f41688t6;
        if ((i10 - i11) - i12 <= i13 && !snVar.S6) {
            boolean[] zArr3 = snVar.O6;
            if (!zArr3[0]) {
                snVar.S6 = true;
                arrayList.add(Integer.valueOf(snVar.f41540h6));
                if (snVar.D6.size() != 0) {
                    MessagesController messagesController = snVar.getMessagesController();
                    j10 = 0;
                    long j11 = snVar.f41516f6;
                    c10 = 0;
                    long j12 = snVar.X6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = snVar.classGuid;
                    int i17 = snVar.f41489d4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = snVar.f41635p4;
                    int i18 = snVar.f41751y4;
                    int i19 = snVar.f41540h6;
                    snVar.f41540h6 = i19 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j13, i18, i19, snVar.f41686t4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = snVar.getMessagesController();
                    long j14 = snVar.f41516f6;
                    long j15 = snVar.X6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = snVar.classGuid;
                    int i22 = snVar.f41489d4;
                    long j16 = snVar.f41635p4;
                    int i23 = snVar.f41751y4;
                    int i24 = snVar.f41540h6;
                    snVar.f41540h6 = i24 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j16, i23, i24, snVar.f41686t4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j10 = 0;
                if (snVar.X6 != 0 && !zArr3[1]) {
                    snVar.S6 = true;
                    arrayList.add(Integer.valueOf(snVar.f41540h6));
                    MessagesController messagesController3 = snVar.getMessagesController();
                    long j17 = snVar.X6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = snVar.classGuid;
                    int i28 = snVar.f41489d4;
                    long j18 = snVar.f41635p4;
                    int i29 = snVar.f41751y4;
                    int i30 = snVar.f41540h6;
                    snVar.f41540h6 = i30 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j18, i29, i30, snVar.f41686t4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !snVar.U7 && i11 <= 10) {
            if (snVar.X6 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(snVar.f41540h6));
                MessagesController messagesController4 = snVar.getMessagesController();
                long j19 = snVar.X6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = snVar.classGuid;
                int i34 = snVar.f41489d4;
                long j20 = snVar.f41635p4;
                int i35 = snVar.f41751y4;
                int i36 = snVar.f41540h6;
                snVar.f41540h6 = i36 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j20, i35, i36, snVar.f41686t4);
                snVar.U7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(snVar.f41540h6));
                MessagesController messagesController5 = snVar.getMessagesController();
                long j21 = snVar.f41516f6;
                long j22 = snVar.X6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = snVar.classGuid;
                int i40 = snVar.f41489d4;
                long j23 = snVar.f41635p4;
                int i41 = snVar.f41751y4;
                int i42 = snVar.f41540h6;
                snVar.f41540h6 = i42 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j23, i41, i42, snVar.f41686t4);
                snVar.U7 = true;
            }
        }
    }

    public static void x0(sn snVar) {
        if (!snVar.h7(snVar.Y.getSendButton())) {
            if (snVar.getMediaController().isPlayingMessage(snVar.p5)) {
                snVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = snVar.getMessagesController().getInputPeer(snVar.f41516f6);
            if (snVar.f41647q5 != null) {
                for (int i10 = 0; i10 < snVar.f41647q5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f20460id.add(Integer.valueOf(snVar.f41647q5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f20460id.add(Integer.valueOf(snVar.p5.getId()));
            }
            ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new vc(5, snVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void x1(sn snVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, of ofVar) {
        if (snVar.p5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            org.telegram.ui.Components.x41.S(snVar.getParentActivity(), snVar, inputPeer, iArr[0], snVar.p5.summarized, "und", str, charSequence, z10, ofVar, new kf(snVar, 16)).setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i11 - 1).apply();
                snVar.Xc(true);
            }
        }
    }

    public static void y0(sn snVar, View view, int i10) {
        org.telegram.ui.Components.y5 y5Var;
        TLRPC.User user;
        char c10;
        jk jkVar;
        jk jkVar2;
        if (i10 != 0) {
            hg.j1 adapter = snVar.U1.getAdapter();
            if (adapter.f11974w0 != null && !adapter.f11956h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = snVar.U1.getAdapter().J(i11);
            int i12 = snVar.U1.getAdapter().X;
            int i13 = snVar.U1.getAdapter().Y;
            if (snVar.U1.getAdapter().F != null && i11 == 1) {
                snVar.Y.M0(i12, i13, snVar.U1.getAdapter().F + "@" + ChatObject.getPublicUsername(snVar.e) + " ", false);
            } else if (snVar.U1.getAdapter().F != null && i11 == 0) {
                snVar.Y.M0(i12, i13, a1.g.s(new StringBuilder(), snVar.U1.getAdapter().F, " "), false);
            } else if (J instanceof ig.y1) {
                if (!snVar.getUserConfig().isPremium()) {
                    snVar.showDialog(new sg.y0(snVar, snVar.getParentActivity(), snVar.currentAccount, true, 31, false, null));
                    return;
                }
                ig.y1 y1Var = (ig.y1) J;
                org.telegram.ui.Components.d5.Z(snVar.currentAccount, Math.max(1, y1Var.a()), snVar.f41516f6, new org.telegram.ui.ActionBar.m3(8, snVar, y1Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (snVar.f41489d4 != 0 || !snVar.h7(view)) {
                        if (view instanceof org.telegram.ui.Cells.c8) {
                            sendAnimationData = ((org.telegram.ui.Cells.c8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.d5.Z(snVar.currentAccount, 1, snVar.a(), new ai.f3(snVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), snVar.U1.getAdapter().L(i11), sendAnimationData, 2));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (snVar.f41762z3 && (jkVar2 = snVar.f41488d3) != null && jkVar2.getVisibility() == 0) {
                        snVar.db(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        snVar.Y.M0(i12, i13, a1.g.p("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (snVar.f41762z3 && (jkVar = snVar.f41488d3) != null && jkVar.getVisibility() == 0) {
                        snVar.db(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        snVar.Y.M0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(si.o0.u(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.s61("" + user2.f20491id, 3, null), 0, spannableString.length(), 33);
                        snVar.Y.M0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof hg.g1) {
                    if (snVar.U1.getAdapter().J != null && snVar.f41489d4 != 1) {
                        hg.g1 g1Var = (hg.g1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(g1Var.f11896a, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = snVar.H8();
                        of2.ephemeralReceiverBotId = g1Var.f11897b;
                        of2.monoForumPeer = snVar.S8();
                        of2.suggestionParams = snVar.f41674s5;
                        snVar.getSendMessagesHelper().sendMessage(of2);
                        snVar.Y.setFieldText("");
                        snVar.j9(false);
                    }
                } else if (J instanceof String) {
                    if (snVar.U1.getAdapter().J != null) {
                        if (snVar.f41489d4 == 1) {
                            org.telegram.ui.Components.d5.L(snVar.getParentActivity(), snVar.f41516f6, new m4.w0(12, snVar, (String) J), snVar.f41651qa);
                            return;
                        } else if (!snVar.h7(view)) {
                            org.telegram.ui.Components.d5.Z(snVar.currentAccount, 1, snVar.f41516f6, new org.telegram.ui.ActionBar.m3(9, snVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    snVar.Y.M0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (snVar.Y.getFieldText() != null) {
                        if (snVar.f41489d4 == 1 || !snVar.h7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (snVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41651qa);
                                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    snVar.showDialog(alertDialog$Builder.f20679a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(snVar.U1.getAdapter().R);
                                snVar.Ua = arrayList;
                                PhotoViewer.u1().M2(null, snVar, snVar.f41651qa);
                                PhotoViewer.u1().i2(arrayList, snVar.U1.getAdapter().M(i11), 3, false, snVar.Va, snVar);
                                return;
                            }
                            org.telegram.ui.Components.d5.Z(snVar.currentAccount, 1, snVar.a(), new org.telegram.ui.ActionBar.m3(10, snVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    h0 h0Var = new h0(24, snVar, (TLRPC.TL_inlineBotWebView) J);
                    if (snVar.f41731wb) {
                        h0Var.run();
                    } else {
                        gi1.a(snVar.getParentActivity(), new org.telegram.ui.ActionBar.m3(12, snVar, h0Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    yj yjVar = snVar.U1;
                    if (yjVar != null && (user = yjVar.getAdapter().f11974w0) != null) {
                        snVar.Y.setFieldText("");
                        long j10 = snVar.f41516f6;
                        if (j10 == user.f20491id) {
                            snVar.f41663r8 = j10;
                            snVar.getMessagesController().sendBotStart(snVar.f41509f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f20491id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", snVar.f41516f6);
                        if (snVar.getMessagesController().checkCanOpenChat(bundle, snVar)) {
                            snVar.presentFragment(new sn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    gk gkVar = snVar.Y;
                    gkVar.R();
                    gkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            snVar.Y.M0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = snVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                FileLog.e((Throwable) e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.p5.f(snVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                y5Var = new org.telegram.ui.Components.y5(f7, fontMetricsInt);
                            } else {
                                y5Var = new org.telegram.ui.Components.y5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(y5Var, 0, spannableString2.length(), 33);
                            snVar.Y.M0(i12, i13, spannableString2, false);
                            snVar.U1.o(false);
                        }
                    }
                    snVar.Y.M0(i12, i13, str, true);
                    snVar.U1.o(false);
                }
            }
        }
    }

    public static void y1(sn snVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = snVar.f41764z5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = snVar.Bb;
            if (i10 == 5) {
                int i11 = snVar.currentAccount;
                long j10 = snVar.f41516f6;
                MessageSuggestionParams messageSuggestionParams = snVar.f41674s5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new ai.h1(context, i11, j10, messageSuggestionParams, snVar, snVar.getResourceProvider(), 0, new xe(snVar, 4)).show();
            } else if (i10 == 1 && (messageObject = snVar.B5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = snVar.f41674s5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    snVar.Zb(messageSuggestionParams2);
                } else if (snVar.B5.canEditMedia() && snVar.A5 == 0) {
                    if (snVar.V1 == null) {
                        snVar.H7();
                    }
                    snVar.V1.P1(snVar.B5, -1);
                    snVar.ca();
                } else {
                    snVar.j(snVar.B5.getId(), 0, true, 0, true, 0);
                }
            } else if (snVar.f41660r5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(snVar.f41516f6) && !snVar.f41660r5.hasSecretMessages && snVar.f41489d4 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        snVar.ha(0);
                        return;
                    }
                    MessageObject messageObject3 = snVar.f41764z5;
                    if (messageObject3 != null) {
                        snVar.j(messageObject3.getId(), 0, true, 0, true, 0);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    snVar.ha(1);
                } else if (i10 == 4) {
                    snVar.ha(2);
                }
            }
        }
    }

    public static void z0(sn snVar, org.telegram.ui.Cells.t1 t1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.h80 I = org.telegram.ui.Components.h80.I(snVar, t1Var);
        org.telegram.ui.Components.bn0 bn0Var = new org.telegram.ui.Components.bn0(snVar.getParentActivity(), snVar.f41651qa);
        I.f26924p = new qe(bn0Var, 0);
        if (z10 && snVar.getMessagesController().config.walletAvailable.get()) {
            I.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney), new re(snVar, str, 11), false);
        }
        I.c(R.drawable.msg_copy, LocaleController.getString(R.string.WalletCopyAddress), new ue(snVar, bn0Var, str, 1), false);
        if (z10) {
            I.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new re(snVar, str, 12), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = snVar.currentAccount;
                long j10 = user.f20491id;
                h0 h0Var = new h0(27, snVar, userArr);
                TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(j10);
                boolean z12 = userOrChat instanceof TLRPC.User;
                if ((userOrChat instanceof TLRPC.Chat) && ChatObject.isChannelAndNotMegaGroup((TLRPC.Chat) userOrChat)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z12) {
                    i10 = R.string.ViewProfile;
                } else if (z11) {
                    i10 = R.string.ViewChannelProfile;
                } else {
                    i10 = R.string.ViewGroupProfile;
                }
                I.n(userOrChat, LocaleController.getString(i10), h0Var);
            } else {
                I.p(13, -1, LocaleController.getString(R.string.WalletAddressNoLinkedAccount));
            }
        }
        bn0Var.e(I);
        bn0Var.f(t1Var, characterStyle, null, false);
        snVar.showDialog(bn0Var);
    }

    public static void z1(sn snVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        sn snVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        ih.a aVar = snVar.f41496dc;
        if (num.intValue() != snVar.d()) {
            snVar.Ac = false;
            df dfVar = snVar.f41456ac;
            if (dfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dfVar);
                snVar.f41456ac.run();
                snVar.f41456ac = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.v31 v31Var = snVar.f41487d2;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(v31Var.f31298b).getTopicsController().getTopics(-v31Var.f31300c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f20396id == intValue) {
                        break;
                    }
                }
            }
            tL_forumTopic = null;
            if (tL_forumTopic == null) {
                message = null;
            } else {
                message = tL_forumTopic.topicStartMessage;
            }
            if (message == null && tL_forumTopic != null && (findTopic = snVar.getMessagesController().getTopicsController().findTopic(-snVar.a(), tL_forumTopic.f20396id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                snVar.f41604mb = SystemClock.uptimeMillis();
                snVar.B7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    snVar.Wa(snVar.d());
                } else if (snVar.d() == 0) {
                    snVar.Wa(num.intValue());
                } else {
                    snVar.f41766z7 = -1;
                }
                snVar.getConnectionsManager().cancelRequestsForGuid(snVar.classGuid);
                snVar.getMessagesStorage().cancelTasksForGuid(snVar.classGuid);
                snVar.classGuid = ConnectionsManager.generateClassGuid();
                snVar.Ta();
                snVar.f41660r5 = null;
                snVar.G7 = 0;
                snVar.f41728w7 = false;
                snVar.f41741x7 = true;
                snVar.f41688t6.clear();
                snVar.f41471c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(snVar.getCurrentAccount(), message, false, false));
                    snVar2 = snVar;
                    snVar2.vb(arrayList, snVar.e, tL_forumTopic2.f20396id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    snVar2 = snVar;
                    snVar2.f41624o4 = null;
                    snVar2.f41597m4 = null;
                    snVar2.f41561j4 = null;
                    snVar2.f41764z5 = null;
                    snVar2.f41725w4 = 0;
                    snVar2.f41738x4 = 0;
                    snVar2.f41751y4 = 0;
                    snVar2.f41635p4 = 0L;
                    snVar2.f41646q4 = 0;
                    snVar2.f41659r4 = null;
                    snVar2.f41686t4 = false;
                    snVar2.f41673s4 = false;
                }
                em emVar = snVar2.A0;
                if (emVar != null) {
                    if (emVar.I >= 0 && !emVar.N()) {
                        em emVar2 = snVar2.A0;
                        emVar2.u(emVar2.I);
                    } else {
                        em emVar3 = snVar2.A0;
                        if (emVar3.I < 0 && emVar3.N()) {
                            snVar2.A0.o(0);
                        }
                    }
                    snVar2.A0.T();
                }
                snVar2.v8();
                snVar2.Uc(true);
                snVar2.f41594m1.n(true);
                if (tL_forumTopic2 != null) {
                    snVar2.ad();
                } else {
                    snVar2.f41594m1.b();
                }
                snVar2.f41487d2.setCurrentTopic(snVar2.d());
                snVar2.Xc(true);
                snVar2.oc(true);
                snVar2.getMessagesController().setForumLastTopicId(-snVar2.a(), snVar2.d());
                snVar2.Ia();
                snVar2.k9(true);
                snVar2.j9(true);
                snVar2.D6(true, true);
                if (snVar2.Y != null) {
                    if (!UserObject.isBotForum(snVar2.f41509f)) {
                        snVar2.Y.j0(false);
                    }
                    snVar2.Y.D1(true);
                }
                if (tL_forumTopic2 != null) {
                    snVar2.getMessagesController().getTopicsController().getTopicRepliesCount(snVar2.f41516f6, tL_forumTopic2.f20396id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                snVar2.f41735x1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                snVar2.f41749y1 = i11;
                snVar2.Ic(false);
                snVar2.Hc(false);
                snVar2.Yc();
                kn knVar = snVar2.Bc;
                if (knVar != null && snVar2.actionBar.f21069n0) {
                    knVar.p(null);
                }
                if (UserObject.isBotForum(snVar2.f41509f)) {
                    snVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(snVar2.f41516f6, num.intValue()), true);
                }
            }
        }
    }

    public static boolean z9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    @Override
    public final org.telegram.ui.Components.nw0 A() {
        return this.f41558j1;
    }

    public final void A6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.A6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void A7(boolean z10) {
        boolean z11;
        this.G6.clear();
        this.D6.clear();
        this.E6.clear();
        this.f41688t6.clear();
        this.J6.b();
        this.f41699u4 = false;
        em emVar = this.A0;
        if (emVar != null) {
            if (emVar.f36949w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Vb(z11);
        }
        nj njVar = this.f41734x0;
        if (njVar != null) {
            njVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.A6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.L6;
            int[] iArr2 = this.K6;
            if (encryptedChat == null) {
                iArr2[i10] = Integer.MAX_VALUE;
                iArr[i10] = Integer.MIN_VALUE;
            } else {
                iArr2[i10] = Integer.MIN_VALUE;
                iArr[i10] = Integer.MAX_VALUE;
            }
            this.M6[i10] = Integer.MIN_VALUE;
            this.N6[i10] = 0;
            this.O6[i10] = false;
            this.P6[i10] = false;
            this.Q6[i10] = true;
        }
        if (z10) {
            this.S7 = true;
            this.T6 = true;
            this.S6 = true;
            this.U7 = false;
        }
        this.f41562j5 = false;
        this.G7 = 0;
        this.F7 = false;
        this.W6 = 0;
        this.V7 = null;
        this.P7 = 0;
        this.Q7 = false;
        this.M7 = false;
        em emVar2 = this.A0;
        if (emVar2 != null && !emVar2.N) {
            emVar2.O(false);
        }
    }

    public final TLRPC.ChatFull A8() {
        return this.f41589l8;
    }

    public final boolean A9() {
        if (!ChatObject.isForum(this.e) || this.f41686t4) {
            if (ChatObject.isMonoForum(this.e) && d() == 0 && !this.f41514f4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Aa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Aa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Ab(org.telegram.ui.Cells.t1 t1Var) {
        if (getParentActivity() != null && t1Var != null && t1Var.ob != null && t1Var.getPrimaryMessageObject() != null && t1Var.getPrimaryMessageObject().messageOwner != null && t1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.f41568jb) {
                this.f41568jb = true;
                if (this.L1 != null) {
                    return;
                }
                ei.x3 x3Var = new ei.x3(getParentActivity(), 3);
                x3Var.p(true);
                x3Var.K = Layout.Alignment.ALIGN_NORMAL;
                x3Var.d = -1L;
                x3Var.T = true;
                x3Var.e = true;
                x3Var.i(true);
                x3Var.q(8.0f);
                this.L1 = x3Var;
                x3Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                ei.x3 x3Var2 = this.L1;
                x3Var2.h = ei.x3.a(x3Var2.getText(), this.L1.getTextPaint());
                this.f41558j1.addView(this.L1, w7.z5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f41558j1.post(new h0(23, this, t1Var));
            }
        }
    }

    public final void Ac(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.e)) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f41444a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new ng.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new kg(this, 15)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new kg(this, 16)));
        }
        if (this.f41509f == null) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new u0("", 1)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.c2(this)));
        }
        return arrayList;
    }

    public final void B6() {
        this.f41674s5 = null;
        if (this.f41635p4 == 0 || this.f41686t4) {
            if (this.f41686t4) {
                this.f41764z5 = this.f41561j4;
            } else {
                this.f41764z5 = null;
            }
            this.f41739x5 = null;
            gk gkVar = this.Y;
            if (gkVar != null) {
                gkVar.i1(null, null, null);
            }
        }
        j9(false);
        if (this.f41489d4 == 0) {
            getMediaDataController().cleanDraft(this.f41516f6, this.f41635p4, true);
        }
    }

    public final void B7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.L6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.T6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.v0.n(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.P7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.Q6[0] = false;
            this.R6 = false;
            em emVar = this.A0;
            if (emVar != null && emVar.F < 0) {
                emVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f41713v6 = i12;
            this.f41740x6 = dialog2.unread_mentions_count;
            if (this.f41727w6 != i12) {
                kh.h hVar = this.f41708v1;
                if (hVar != null) {
                    hVar.c(1, i12, this.Z5);
                }
                this.f41727w6 = this.f41713v6;
                Cc();
            }
            int i13 = this.f41740x6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f41740x6 = i14;
                if (i14 <= 0) {
                    this.f41740x6 = 0;
                    this.f41753y6 = true;
                    Qb(false);
                } else {
                    kh.h hVar2 = this.f41708v1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Qb(true);
                }
            }
            d7(false);
            return;
        }
        this.G6.clear();
        this.f41688t6.clear();
        this.D6.clear();
        this.E6.clear();
        this.J6.b();
        this.f41699u4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.A6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.K6;
            if (encryptedChat == null) {
                iArr2[i15] = Integer.MAX_VALUE;
                iArr[i15] = Integer.MIN_VALUE;
            } else {
                iArr2[i15] = Integer.MIN_VALUE;
                iArr[i15] = Integer.MAX_VALUE;
            }
            this.M6[i15] = Integer.MIN_VALUE;
            this.N6[i15] = 0;
            this.f41551i6[i15].clear();
            this.f41563j6[i15].clear();
            this.f41576k6[i15].clear();
        }
        h9();
        Fc(0, true);
        if (this.f41742x8 != null) {
            this.f41742x8 = null;
            gk gkVar = this.Y;
            if (gkVar != null) {
                gkVar.W0(null, true, false);
            }
        }
        if (this.P != null) {
            Vb(false);
            J7(false);
            this.f41734x0.setEmptyView(this.f41473c1);
        }
        em emVar2 = this.A0;
        if (emVar2 != null) {
            emVar2.O(false);
        }
        if (this.h == null && (user = this.f41509f) != null && user.bot && this.f41649q8 == null) {
            this.f41649q8 = "";
            oc(false);
        }
    }

    public final TLRPC.UserFull B8() {
        return this.f41601m8;
    }

    public final boolean B9() {
        return UserObject.isBotForum(this.f41509f);
    }

    public final void Ba(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        org.telegram.ui.Components.p11 p11Var;
        String hostAuthority;
        boolean z11;
        boolean z12 = false;
        try {
            hostAuthority = AndroidUtilities.getHostAuthority(str);
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (this.h != null) {
            if (getMessagesController().secretWebpagePreview == 1) {
            }
            if (z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i10 == 0) {
                    pf.d.p(getParentActivity(), Uri.parse(str), true, true, P9(t1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f41663r8 == 0) {
                        z12 = true;
                    }
                    pf.d.p(parentActivity, parse, z12, true, P9(t1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f41663r8 == 0) {
                        z12 = true;
                    }
                    pf.d.p(parentActivity2, parse2, z12, true, P9(t1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.d5.q0(this, str, true, true, false, false, P9(t1Var, characterStyle), null, this.f41651qa);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.r61) && (p11Var = ((org.telegram.ui.Components.r61) characterStyle).f30078a) != null && (p11Var.f29448a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.d5.q0(this, str, true, true, true, z12, P9(t1Var, characterStyle), null, this.f41651qa);
            }
        }
        if (getMessagesController().authDomains.contains(hostAuthority)) {
            SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
            if (i10 != 0 && i10 != 2) {
                z11 = false;
                sendMessagesHelper.requestUrlAuth(str, this, z11);
                return;
            }
            z11 = true;
            sendMessagesHelper.requestUrlAuth(str, this, z11);
            return;
        }
        if (z10) {
        }
        if (i10 == 0) {
        }
        if (characterStyle instanceof org.telegram.ui.Components.r61) {
            z12 = true;
        }
        org.telegram.ui.Components.d5.q0(this, str, true, true, true, z12, P9(t1Var, characterStyle), null, this.f41651qa);
    }

    public final void Bb(boolean z10, boolean z11) {
        int i10;
        float f7;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Object obj;
        if (!z10 || this.G0.getTag() == null) {
            if (!z10 && this.G0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.T0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.T0 = null;
            }
            RadialProgressView radialProgressView = this.G0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f16 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.T0 = animatorSet2;
                if (z10) {
                    this.G0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.T0;
                    mk mkVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mkVar, property, 0.1f);
                    mk mkVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mkVar2, property2, 0.1f);
                    mk mkVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(mkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
                    this.T0.setStartDelay(200L);
                } else {
                    if (this.C0) {
                        obj = this.D0;
                    } else {
                        obj = this.B0;
                    }
                    RadialProgressView radialProgressView2 = this.G0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.G0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.G0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.T0.addListener(new ah.p0(29, this, z10));
                this.T0.setDuration(150L);
                this.T0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.G0;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            radialProgressView5.setVisibility(i10);
            RadialProgressView radialProgressView6 = this.G0;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.1f;
            }
            radialProgressView6.setScaleX(f7);
            RadialProgressView radialProgressView7 = this.G0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView7.setScaleY(f10);
            this.G0.setAlpha(1.0f);
            mk mkVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            mkVar4.setVisibility(i11);
            org.telegram.ui.Components.w90 w90Var = this.D0;
            if (!z10 && this.C0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            w90Var.setVisibility(i12);
            mk mkVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            mkVar5.setScaleX(f11);
            org.telegram.ui.Components.w90 w90Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            w90Var2.setScaleX(f12);
            mk mkVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            mkVar6.setScaleY(f13);
            org.telegram.ui.Components.w90 w90Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            w90Var3.setScaleY(f16);
            mk mkVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            mkVar7.setAlpha(f14);
            org.telegram.ui.Components.w90 w90Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            w90Var4.setAlpha(f15);
        }
    }

    public final void Bc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Bc():void");
    }

    public final void C6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41651qa);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(c2Var);
    }

    public final void C7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.f41551i6[i10].clear();
            this.f41563j6[i10].clear();
            this.f41576k6[i10].clear();
        }
        h9();
        Fc(0, true);
        dd(z10);
        Sc();
    }

    public final ArrayList C8() {
        em emVar = this.A0;
        if (emVar != null) {
            return emVar.P;
        }
        return null;
    }

    public boolean C9() {
        if (this.f41558j1.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ca(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Ca(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void Cb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new gf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21422q7, getResourceProvider());
        }
    }

    public final void Cc() {
        boolean z10;
        boolean z11;
        if (this.f41708v1 == null) {
            return;
        }
        if (this.f41678s9 && !g9() && !this.Y.t0() && !this.f41469bb && (!this.E3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f41464b6 != 0 && SystemClock.elapsedRealtime() >= this.f41464b6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f41722w1 = false;
        } else {
            this.N7 = 0;
            this.f41713v6 = 0;
            z11 = true;
        }
        this.f41708v1.e(1, z10, z11);
    }

    @Override
    public final boolean D() {
        return false;
    }

    public final void D6(boolean z10, boolean z11) {
        long j10;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        in inVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        in inVar2;
        String str;
        int findQuoteStart;
        in inVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j12;
        org.telegram.ui.Components.p11 p11Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.y5 y5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        Long l10;
        if (this.Y != null) {
            int i10 = this.f41489d4;
            char c10 = '\b';
            if (i10 == 0 || i10 == 8 || (i10 == 3 && getUserConfig().getClientUserId() == N8())) {
                long j14 = 0;
                if (this.f41489d4 == 8) {
                    if (ChatObject.isMonoForum(this.e)) {
                        if (this.f41635p4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.p11 p11Var2 = null;
                if (A9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.f41516f6);
                    if (oneThreadDraft != null) {
                        l10 = (Long) oneThreadDraft.first;
                        draft = (TLRPC.DraftMessage) oneThreadDraft.second;
                    } else {
                        draft = null;
                        l10 = null;
                    }
                    l4 = l10;
                } else {
                    MediaDataController mediaDataController = getMediaDataController();
                    long j15 = this.f41516f6;
                    if (this.f41489d4 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.f41635p4;
                    }
                    draft = mediaDataController.getDraft(j15, j10);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                gk gkVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                gkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.f41516f6, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j16 = this.f41516f6;
                    if (l4 != null) {
                        j13 = l4.longValue();
                    } else {
                        j13 = this.f41635p4;
                    }
                    message = mediaDataController2.getDraftMessage(j16, j13);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.f41489d4 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.f41619nc >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        j9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.f41619nc = draftMessage3.date;
                    gk gkVar2 = this.Y;
                    gkVar2.X2 = null;
                    gkVar2.Y2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i11 = 0;
                        while (i11 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i11);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
                            long j17 = j14;
                            if (z12 || (messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                draftMessage2 = draftMessage3;
                                if (z12) {
                                    j12 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j12 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                p11Var = null;
                                org.telegram.ui.Components.s61 s61Var = new org.telegram.ui.Components.s61(a1.g.o(j12, ""), 3, null);
                                int i12 = messageEntity.offset;
                                valueOf.setSpan(s61Var, i12, messageEntity.length + i12, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f29448a |= 4;
                                    org.telegram.ui.Components.q11 q11Var = new org.telegram.ui.Components.q11(obj, 0);
                                    int i13 = messageEntity.offset;
                                    MediaDataController.addStyleToText(q11Var, i13, messageEntity.length + i13, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f29448a |= 1;
                                        org.telegram.ui.Components.q11 q11Var2 = new org.telegram.ui.Components.q11(obj2, 0);
                                        int i14 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q11Var2, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f29448a |= 2;
                                        org.telegram.ui.Components.q11 q11Var3 = new org.telegram.ui.Components.q11(obj3, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q11Var3, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f29448a |= 8;
                                        org.telegram.ui.Components.q11 q11Var4 = new org.telegram.ui.Components.q11(obj4, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q11Var4, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f29448a |= 16;
                                        org.telegram.ui.Components.q11 q11Var5 = new org.telegram.ui.Components.q11(obj5, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q11Var5, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.r61 r61Var = new org.telegram.ui.Components.r61(messageEntity.url, p11Var2);
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(r61Var, i18, messageEntity.length + i18, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f29448a |= 256;
                                        org.telegram.ui.Components.q11 q11Var6 = new org.telegram.ui.Components.q11(obj6, 0);
                                        int i19 = messageEntity.offset;
                                        MediaDataController.addStyleToText(q11Var6, i19, messageEntity.length + i19, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i20 = messageEntity.offset;
                                        org.telegram.ui.Components.sj0.c(valueOf, i20, messageEntity.length + i20, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e) {
                                            FileLog.e((Throwable) e, false);
                                            fontMetricsInt = p11Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i21 = messageEntity.offset;
                                        valueOf.setSpan(y5Var, i21, messageEntity.length + i21, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        p11Var = p11Var2;
                                    }
                                    p11Var = p11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                p11Var = null;
                            }
                            i11++;
                            p11Var2 = p11Var;
                            c10 = c11;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        inVar = p11Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        inVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.Y.c1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Y.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new ke(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f41674s5 = of2;
                        Jb(of2);
                    }
                    messageObject = this.f41764z5;
                    if (messageObject != null || this.f41561j4 == messageObject) {
                        if (message == null && ((messageObject2 = this.f41561j4) == null || messageObject2.getId() != message.f20365id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f41764z5 = messageObject3;
                            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
                            if (inputReplyTo2 != null) {
                                int i22 = inputReplyTo2.flags;
                                if ((i22 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i23 = -1;
                                    if (arrayList != null) {
                                        int i24 = inputReplyTo2.quote_offset;
                                        if (arrayList.isEmpty()) {
                                            inVar3 = inVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            ?? obj7 = new Object();
                                            obj7.f38332a = messageObject3;
                                            obj7.f38333b = -1;
                                            obj7.f38334c = -1;
                                            obj7.d = -1;
                                            obj7.f38341m = true;
                                            obj7.e(i24, arrayList);
                                            inVar3 = obj7;
                                        }
                                        this.f41739x5 = inVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i22 & 16) != 0) {
                                            i23 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message3 = messageObject3.messageOwner;
                                        if (message3 == null || (str = message3.message) == null || str3 == null || (findQuoteStart = MessageObject.findQuoteStart(str, str3, i23)) < 0) {
                                            inVar2 = inVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            inVar2 = new in(messageObject3, findQuoteStart, str3.length() + findQuoteStart);
                                        }
                                        this.f41739x5 = inVar2;
                                    }
                                }
                            }
                            Y6(false);
                            in inVar4 = this.f41739x5;
                            if (inVar4 != null) {
                                Ib(this.f41764z5, inVar4);
                            } else {
                                Hb(this.f41764z5);
                            }
                            oc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j11 && this.e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20344id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f41764z5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Hb(messageObject4);
                            oc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j11 = 0;
                inVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f41674s5 = of22;
                    Jb(of22);
                }
                messageObject = this.f41764z5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l4 == null) {
                }
            }
        }
    }

    public final void D7(boolean z10) {
        this.f41494d9 = z10;
        org.telegram.ui.ActionBar.m1 m1Var = this.f41481c9;
        if (m1Var != null) {
            m1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.oc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.oc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.oc = ofFloat;
            ofFloat.addUpdateListener(new me(this, 0));
            this.oc.setDuration(150L);
            this.oc.start();
        }
    }

    public final MessageObject.GroupedMessages D8(long j10) {
        return (MessageObject.GroupedMessages) this.J6.f(j10);
    }

    public final boolean D9() {
        if (this.e != null) {
            return getMessagesController().isChatNoForwards(this.e);
        }
        return getMessagesController().isUserNoForwards(this.f41601m8);
    }

    public final void Da(java.util.ArrayList r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Da(java.util.ArrayList, boolean):void");
    }

    public final void Db() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.e)) {
                    d60 d60Var = new d60(a());
                    d60Var.f36030l0 = this;
                    presentFragment(d60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.e)) {
                bd bdVar = new bd(a());
                bdVar.f36030l0 = this;
                presentFragment(bdVar);
                return;
            } else {
                return;
            }
        }
        this.f41617na = new org.telegram.ui.Components.up(this, this.f41651qa);
        this.f41734x0.setOnInterceptTouchListener(new m4.v0(27));
        pb(this.f41558j1, false);
        showDialog(this.f41617na, new oe(this, 1));
    }

    public final void Dc() {
        kh.h hVar = this.f41708v1;
        ij ijVar = this.v;
        if (hVar != null) {
            this.f41708v1.setTranslationY((((-ijVar.d()) - this.S.getInputBubbleHeight()) - b9(org.telegram.ui.Components.r31.f30058c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f41632p1 != null) {
            this.f41632p1.setTranslationY((-ijVar.d()) - AndroidUtilities.dp(16.0f));
        }
    }

    public final int E6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f41734x0.getHeight();
        int i11 = 0;
        long j10 = 0;
        while (true) {
            View V0 = this.f41734x0.V0(i10);
            if (V0 == null) {
                break;
            }
            if (V0 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) V0;
                messageObject = t1Var.getMessageObject();
                additionalPaddingHeight = t1Var.getAdditionalPaddingHeight();
            } else if (V0 instanceof org.telegram.ui.Cells.v0) {
                messageObject = ((org.telegram.ui.Cells.v0) V0).getMessageObject();
                additionalPaddingHeight = 0;
            } else {
                continue;
            }
            if (messageObject != null) {
                long groupId = messageObject.getGroupId();
                boolean isOut = messageObject.isOut();
                if (j10 != 0 && j10 != groupId) {
                    break;
                }
                height = Math.min(height, V0.getTop());
                i11 = Math.max(i11, V0.getBottom() - additionalPaddingHeight);
                if (isOut) {
                    if (groupId == 0) {
                        break;
                    }
                    j10 = groupId;
                }
                i10++;
            } else {
                continue;
            }
        }
        return Math.max(0, i11 - height);
    }

    public final long E7(MessageObject messageObject) {
        if (this.f41489d4 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.e) && !this.f41686t4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f20396id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.e));
        }
        return this.f41635p4;
    }

    public final float E8() {
        sn snVar = this.f41639pa;
        if (snVar == null) {
            snVar = this;
        }
        dk dkVar = snVar.B1;
        if (dkVar == null) {
            return 0.0f;
        }
        return dkVar.f25064b;
    }

    public final boolean E9() {
        int i10 = this.f41489d4;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void Ea(int i10) {
        boolean z10;
        int i11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11 = false;
        if (i10 == 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i12 >= 24) {
                        intent.putExtra("output", FileProvider.d(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.f41542h8 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e) {
                FileLog.e(e);
                return;
            }
        }
        try {
            if (i10 == 1) {
                Activity parentActivity = getParentActivity();
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (ChatObject.isChannel(this.e) && (tL_chatBannedRights = this.e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                up0 up0Var = new up0(0, z10, true, this);
                if (this.f41489d4 == 9) {
                    up0Var.G = 1;
                    up0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        up0Var.G = 10;
                        up0Var.H = true;
                    } else {
                        MessageObject messageObject = this.B5;
                        if (messageObject != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (messageObject == null) {
                            z11 = true;
                        }
                        up0Var.G = i11;
                        up0Var.H = z11;
                    }
                }
                up0Var.V = new kl(this);
                presentFragment(up0Var);
            } else if (i10 == 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File generateVideoPath = AndroidUtilities.generateVideoPath();
                    if (generateVideoPath != null) {
                        if (i13 >= 24) {
                            intent2.putExtra("output", FileProvider.d(getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
                            intent2.addFlags(2);
                            intent2.addFlags(1);
                        } else {
                            intent2.putExtra("output", Uri.fromFile(generateVideoPath));
                        }
                        intent2.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                        this.f41542h8 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Eb(boolean z10, MessageObject messageObject, MessageObject messageObject2, ArrayList arrayList, TLRPC.WebPage webPage, in inVar, boolean z11) {
        Fb(z10, messageObject, messageObject2, arrayList, webPage, true, 0, inVar, z11, 0L, null, true);
    }

    public final void Ec(boolean z10) {
        boolean z11;
        Object[] objArr;
        Object[] objArr2;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        Integer num;
        boolean z17;
        float f7;
        float f10;
        float f11;
        int i10;
        float f12;
        float f13;
        float f14;
        int i11;
        float f15;
        float f16;
        float f17;
        int i12;
        Integer num2;
        Integer num3;
        Integer num4;
        float f18;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        if ((!K9() || this.f41686t4) && this.X2 != null) {
            if (!this.f41450a6) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.T4.size() > 1 && !this.U2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.X2.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.W2.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.V2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr == null && !this.Ob && !this.U2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.Ob && !this.U2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.Ob && !this.U2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (objArr2 == objArr && z12 == z16 && z13 == z14) {
                z17 = false;
            } else {
                AnimatorSet animatorSet = this.Y2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.Y2 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.X2.setVisibility(0);
                    } else if (z14) {
                        this.V2.setVisibility(0);
                    }
                    if (z16) {
                        this.W2.setVisibility(0);
                        this.W2.setAlpha(0.0f);
                        this.W2.setScaleX(0.4f);
                        this.W2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.Y2 = animatorSet2;
                    ImageView imageView = this.X2;
                    Property property = View.ALPHA;
                    if (z15) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f18);
                    ImageView imageView2 = this.X2;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f19);
                    ImageView imageView3 = this.X2;
                    Property property3 = View.SCALE_Y;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    z17 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f20);
                    ImageView imageView4 = this.V2;
                    if (z14) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f21);
                    ImageView imageView5 = this.V2;
                    if (z14) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f22);
                    ImageView imageView6 = this.V2;
                    if (z14) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f23);
                    RadialProgressView radialProgressView = this.W2;
                    if (!z16) {
                        f24 = 0.0f;
                    } else {
                        f24 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f24);
                    RadialProgressView radialProgressView2 = this.W2;
                    if (!z16) {
                        f25 = 0.4f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f25);
                    RadialProgressView radialProgressView3 = this.W2;
                    if (!z16) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f26));
                    this.Y2.setInterpolator(org.telegram.ui.Components.zr.h);
                    this.Y2.setDuration(360L);
                    this.Y2.addListener(new rl(this, z14, z15, z16));
                    this.Y2.start();
                } else {
                    num = 1;
                    z17 = false;
                    ImageView imageView7 = this.V2;
                    if (z14) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView7.setAlpha(f7);
                    ImageView imageView8 = this.V2;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    imageView8.setScaleX(f10);
                    ImageView imageView9 = this.V2;
                    if (z14) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView9.setScaleY(f11);
                    ImageView imageView10 = this.V2;
                    if (z14) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.X2;
                    if (z15) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    imageView11.setAlpha(f12);
                    ImageView imageView12 = this.X2;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    imageView12.setScaleX(f13);
                    ImageView imageView13 = this.X2;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView13.setScaleY(f14);
                    ImageView imageView14 = this.X2;
                    if (z15) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.W2;
                    if (z16) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f15);
                    RadialProgressView radialProgressView5 = this.W2;
                    if (z16) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f16);
                    RadialProgressView radialProgressView6 = this.W2;
                    if (z16) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f17);
                    RadialProgressView radialProgressView7 = this.W2;
                    if (z16) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.V2;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.X2;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.W2;
                if (z16) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.L2 != null) {
                if (K9() && !this.f41686t4) {
                    boolean z18 = z17;
                    this.L2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.L2.c((this.T4.size() - 1) - Collections.binarySearch(this.T4, Integer.valueOf(this.X4), Comparator$CC.reverseOrder()), this.T4.size(), z11);
            }
        }
    }

    @Override
    public final boolean F() {
        return this.f41703u8;
    }

    public final float F6(boolean z10) {
        float f7;
        float f10;
        float f11;
        gk gkVar = this.Y;
        float f12 = 0.0f;
        if (gkVar != null) {
            if (z10) {
                f7 = gkVar.f24142o5;
            } else {
                f7 = gkVar.f24136n5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        ne.b bVar = this.Kc;
        j6.l lVar = this.Pc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f14333a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f14333a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f17447f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f14334b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.e;
            f11 = f13;
        }
        if (!this.f41469bb && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f11) * f10, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f12);
        }
        return AndroidUtilities.lerp(dp, max, f11) * f10;
    }

    public final int F8(MessageObject messageObject, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.f41743x9 == null) {
            this.f41743x9 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount, true, this.Oa, this.f41651qa);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f41743x9;
        if (this.e == null && !UserObject.isUserSelf(this.f41509f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        t1Var.N7 = z11;
        org.telegram.ui.Cells.t1 t1Var2 = this.f41743x9;
        int i10 = this.f41489d4;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        t1Var2.P7 = z12;
        if (i10 == 3 && this.f41469bb) {
            z13 = true;
        } else {
            z13 = false;
        }
        t1Var2.Q7 = z13;
        TLRPC.User user = this.f41509f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        t1Var2.R7 = z14;
        if (ChatObject.isChannel(this.e) && this.e.megagroup) {
            z15 = true;
        }
        t1Var2.S7 = z15;
        this.f41743x9.E8 = y9();
        this.f41743x9.F8 = H9();
        this.f41743x9.G8 = G9();
        return this.f41743x9.f1(messageObject, (MessageObject.GroupedMessages) this.J6.f(messageObject.getGroupId()), z10);
    }

    public final boolean F9() {
        return !TextUtils.isEmpty(this.f41525g4);
    }

    public final void Fa(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Fa(int):void");
    }

    public final void Fb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.in r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Fb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.in, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void Fc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Fc(int, boolean):void");
    }

    public final boolean G6() {
        if (!E9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f41686t4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                kk kkVar = this.f41446a1;
                if (kkVar == null || kkVar.getVisibility() != 0) {
                    if (!K9() || this.f41686t4) {
                        return true;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void G7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.G7():void");
    }

    public final boolean G9() {
        org.telegram.ui.Components.v31 v31Var = this.f41487d2;
        if (v31Var != null && v31Var.Q && v31Var.f31296a.f17447f) {
            return true;
        }
        return false;
    }

    public final boolean Ga(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f41663r8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f41509f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f41663r8 == this.f41516f6) {
                this.f41663r8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f41663r8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((o2Var instanceof sn) && ((sn) o2Var).f41516f6 == this.f41663r8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f41663r8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f41663r8));
                } else if (DialogObject.isUserDialog(this.f41663r8)) {
                    bundle.putLong("user_id", this.f41663r8);
                } else {
                    bundle.putLong("chat_id", -this.f41663r8);
                }
                y6();
                presentFragment(new sn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Gb(ArrayList arrayList) {
        Eb(true, null, null, arrayList, null, null, false);
    }

    public final void Gc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f41686t4 && !this.V4.isEmpty() && this.T4.size() == 1 && ((Integer) this.T4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.V4.get(this.T4.get(0));
        } else {
            messageObject = null;
        }
        this.f41574k4 = messageObject;
        if (this.f41686t4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f41624o4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.e, this.f41574k4.messageOwner.from_id)) {
            this.f41574k4 = null;
        }
    }

    @Override
    public final void H(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            rh.c cVar = this.Qc;
            if (cVar != null) {
                this.f41558j1.removeView(cVar);
                this.Qc = null;
            }
            gk gkVar = this.Y;
            if (gkVar != null) {
                gkVar.F0();
            }
        }
    }

    public final boolean H6() {
        if (this.h == null) {
            kk kkVar = this.f41446a1;
            if (kkVar == null || kkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H7() {
        if (getParentActivity() != null && getParentActivity() != null && this.V1 == null) {
            ci.a3 a3Var = new ci.a3(this, getParentActivity(), this, this.f41651qa, 2);
            this.V1 = a3Var;
            a3Var.Z = a();
            ci.a3 a3Var2 = this.V1;
            a3Var2.f30155i0 = true;
            a3Var2.f30138c2 = new il(this);
        }
    }

    public final SendMessageChatArguments H8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.f41489d4 == 9) {
            builder.setWelcomeMessageChatId(this.Fa);
        }
        if (this.f41489d4 == 5) {
            builder.setQuickReplyShortcut(this.f41476c4, M8());
        }
        return builder.build();
    }

    public final boolean H9() {
        if (this.f41487d2 == null) {
            if (this.f41514f4 || !ChatObject.isMonoForum(this.e)) {
                if (!ChatObject.isForum(this.e) || !ChatObject.areTabsEnabled(this.e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final void Ha(MessageObject messageObject, int i10) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f20365id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(messageObject.messageOwner.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        MessageObject messageObject2 = new MessageObject(this.currentAccount, tL_message, false, false);
        messageObject2.type = 10;
        messageObject2.contentType = 1;
        messageObject2.isDateObject = true;
        messageObject2.stableId = Y8(messageObject.dateKeyInt);
        this.A0.P.add(i10, messageObject2);
    }

    public final void Hb(MessageObject messageObject) {
        Eb(true, messageObject, null, null, null, null, false);
    }

    public final void Hc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f41749y1 > 0 && ((i10 = this.f41489d4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41708v1.e(4, z11, z10);
        this.f41708v1.c(4, this.f41749y1, z10);
    }

    @Override
    public final long I() {
        return this.X6;
    }

    public final boolean I6(MessageObject messageObject) {
        if (this.f41489d4 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20344id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.f41489d4 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void I7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        kg kgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.f41551i6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f41509f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f41589l8;
        long j10 = this.X6;
        int d = (int) d();
        int i10 = this.f41489d4;
        kg kgVar2 = new kg(this, 4);
        if (z10) {
            kgVar = new kg(this, 5);
        } else {
            kgVar = null;
        }
        kg kgVar3 = kgVar;
        org.telegram.ui.Components.d5.y(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.f41551i6, groupedMessages, d, i10, null, kgVar2, kgVar3, this.f41651qa);
    }

    public final boolean I9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f41471c && !this.d && this.f41509f == null && this.f41734x0 != null && SharedConfig.animationsEnabled()) {
            if (this.f41718vb == null) {
                this.f41718vb = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f41718vb.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f41734x0.getChildCount(); i12++) {
                    i11 += this.f41734x0.getChildAt(i12).getHeight();
                    int top = this.f41734x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.E9) {
                    O6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.O6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.G6;
                if ((!z12 || ((this.X6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.S6 && f10 > this.E9 && (!arrayList.isEmpty() ? i11 != 0 : this.f41705ub)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f41473c1) == null || frameLayout.getVisibility() != 0 || this.f41473c1.getChildCount() <= 0) {
                    if (!z10 && this.Z6 == 0) {
                        O6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.f41495da && this.fragmentBeginToShow) {
                        if (z10 && this.Z6 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable l4 = this.f41651qa.l();
                        km kmVar = this.f41558j1;
                        if (kmVar != null) {
                            l4 = kmVar.getBackgroundImage();
                        }
                        if (l4 instanceof org.telegram.ui.Components.wc0) {
                            org.telegram.ui.Components.wc0 wc0Var = (org.telegram.ui.Components.wc0) l4;
                            if (wc0Var.N != z11) {
                                if (!z11) {
                                    wc0Var.c();
                                }
                                float f11 = 1.0f;
                                if (!z11 && wc0Var.N) {
                                    wc0Var.h = 1.0f - ((wc0Var.h - (((int) (f7 / 0.125f)) * 0.125f)) / 0.125f);
                                    wc0Var.d = true;
                                }
                                wc0Var.N = z11;
                                if (z11) {
                                    f11 = 1.5f;
                                }
                                wc0Var.M = f11;
                                wc0Var.y();
                            } else if (z11) {
                                wc0Var.y();
                            }
                        }
                    }
                    if (z10 || (this.Z6 != 0 && System.currentTimeMillis() - this.Z6 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Ia() {
        int i10;
        this.T4.clear();
        this.V4.clear();
        this.X4 = 0;
        this.f41463b5 = 0;
        this.f41477c5 = 0;
        Fc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.f41589l8;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.f41490d5 = true;
        Gc();
    }

    public final void Ib(MessageObject messageObject, in inVar) {
        Eb(true, messageObject, null, null, null, inVar, false);
    }

    public final void Ic(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f41735x1 > 0 && ((i10 = this.f41489d4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41708v1.e(3, z11, z10);
        this.f41708v1.c(3, this.f41735x1, z10);
    }

    @Override
    public final boolean J(ey eyVar) {
        return false;
    }

    public final void J6(boolean z10) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.User user2;
        boolean z11;
        final boolean z12;
        float f7;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        float f16;
        int i11;
        TLRPC.EncryptedChat encryptedChat = this.h;
        boolean z13 = true;
        int i12 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.f41489d4 != 0 || this.f41635p4 != 0 || (chatFull = this.f41589l8) == null || chatFull.ttl_period == 0)) || ((user = this.f41509f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f41601m8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.s0 s0Var = this.f41472c0;
            if (s0Var != null) {
                s0Var.e(8);
            }
            hj hjVar = this.f41594m1;
            if (hjVar != null) {
                hjVar.f28630a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.s0 s0Var2 = this.f41472c0;
            if (s0Var2 != null) {
                s0Var2.e(0);
            }
            hj hjVar2 = this.f41594m1;
            if (hjVar2 != null) {
                hjVar2.f28630a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.s0 s0Var3 = this.f41669s0;
        if (s0Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s0Var3.e(i11);
        }
        hj hjVar3 = this.f41594m1;
        if (hjVar3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f41509f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hjVar3.setCommunityItemVisible(z11);
            final hj hjVar4 = this.f41594m1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = hjVar4.E;
            ImageView imageView2 = hjVar4.f28662y;
            if (imageView2 != null && imageView != null) {
                hjVar4.f28645l0 = z12;
                float f17 = 1.1f;
                float f18 = 1.0f;
                if (!z10) {
                    int i13 = 4;
                    if (z12) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView2.setVisibility(i10);
                    if (z12) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView2.setAlpha(f13);
                    if (z12) {
                        f14 = 1.1f;
                    } else {
                        f14 = 0.0f;
                    }
                    imageView2.setScaleX(f14);
                    if (!z12) {
                        f17 = 0.0f;
                    }
                    imageView2.setScaleY(f17);
                    if (z12) {
                        i13 = 0;
                    }
                    imageView.setVisibility(i13);
                    if (z12) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    imageView.setAlpha(f15);
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    imageView.setScaleX(f16);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    imageView.setScaleY(f18);
                } else {
                    if (z12) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (z12) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f7);
                    if (z12) {
                        f10 = 1.1f;
                    } else {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                    if (!z12) {
                        f17 = 0.0f;
                    }
                    scaleX.scaleY(f17).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    mo moVar = hjVar4;
                                    if (!z14) {
                                        moVar.f28662y.setVisibility(4);
                                        return;
                                    } else {
                                        moVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    mo moVar2 = hjVar4;
                                    if (!z15) {
                                        moVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        moVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                    ViewPropertyAnimator animate2 = imageView.animate();
                    if (z12) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator alpha2 = animate2.alpha(f11);
                    if (z12) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    scaleX2.scaleY(f18).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    mo moVar = hjVar4;
                                    if (!z14) {
                                        moVar.f28662y.setVisibility(4);
                                        return;
                                    } else {
                                        moVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    mo moVar2 = hjVar4;
                                    if (!z15) {
                                        moVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        moVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f41594m1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f41601m8;
                if (userFull2 != null) {
                    this.f41594m1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f41589l8;
                    if (chatFull3 != null) {
                        this.f41594m1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f41655r0 != null && (chatFull2 = this.f41589l8) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.s0 s0Var4 = this.f41655r0;
            if (z13) {
                i12 = 0;
            }
            s0Var4.e(i12);
        }
        q();
    }

    public final void J7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f41473c1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f41473c1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f41473c1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.f41558j1.addView(this.f41473c1, 3, w7.z5.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f41473c1.setTranslationX(W8() / 2.0f);
            int i10 = 1;
            if (this.A0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f41609n2 = textView;
                textView.setText(LocaleController.getString(R.string.NoFilteredMessages));
                this.f41609n2.setTextSize(1, 14.0f);
                this.f41609n2.setGravity(17);
                org.telegram.ui.ActionBar.r6.W(this.f41609n2, org.telegram.ui.ActionBar.k6.f21278ic, getResourceProvider());
                this.f41609n2.setBackground(new org.telegram.ui.ActionBar.x5(this.f41609n2, this.f41558j1, AndroidUtilities.dp(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f41609n2.setTypeface(AndroidUtilities.bold());
                this.f41609n2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(3.0f));
                this.f41473c1.addView(this.f41609n2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (E9()) {
                ig.a2 a2Var = new ig.a2(getParentActivity(), this.f41489d4, this.f41635p4, this.f41476c4, getResourceProvider());
                this.f41522g1 = a2Var;
                int dp = AndroidUtilities.dp(24.0f);
                ig.a2 a2Var2 = this.f41522g1;
                km kmVar = this.f41558j1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.k6.f21119a;
                a2Var.setBackground(new org.telegram.ui.ActionBar.x5(a2Var2, kmVar, dp, themedPaint));
                this.f41473c1.addView(this.f41522g1, w7.z5.e(-2, -2, 17));
                this.f41546i1.d(this.f41522g1, this.f41558j1, new m4.v0(26), false);
            } else if (this.f41489d4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f41462b4;
                org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.k6.f21278ic;
                org.telegram.ui.ActionBar.k6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.k6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.filled_chatlink_large);
                linearLayout.addView(imageView, w7.z5.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.W(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(AndroidUtilities.dp(208.0f));
                org.telegram.messenger.v0.m(R.string.BusinessLinksIntro, textView2);
                linearLayout.addView(textView2, w7.z5.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.W(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(AndroidUtilities.dp(208.0f));
                String str = tL_businessChatLink.link;
                ig.y[] yVarArr = ig.y.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                textView3.setText(str);
                textView3.setBackground(org.telegram.ui.ActionBar.k6.a0(503316480, 503316480, 5, 5));
                textView3.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                textView3.setOnClickListener(new ai.p(20, tL_businessChatLink, this));
                linearLayout.addView(textView3, w7.z5.t(-2, -2, 49, 17, 0, 17, 17));
                this.f41535h1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.x5(this.f41535h1, this.f41558j1, AndroidUtilities.dp(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f41473c1.addView(this.f41535h1, w7.z5.e(-2, -2, 17));
            } else if ((this.N9 != null && this.f41509f != null && !this.f41606n) || (this.f41601m8 != null && a() != getUserConfig().getClientUserId() && ((this.f41601m8.contact_require_premium && !getUserConfig().isPremium()) || this.f41601m8.send_paid_messages_stars > ai.ha.y(this.currentAccount, false).p().amount))) {
                this.f41498e1 = new ji(this, getParentActivity(), this.currentAccount, this.N9, this.f41651qa);
                uc();
                this.f41498e1.setListener(new pe(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f41486d1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f41486d1.setGravity(17);
                this.f41486d1.addView(this.f41498e1, w7.z5.e(-2, -2, 17));
                this.f41473c1.addView(this.f41486d1, w7.z5.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f41601m8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f41498e1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f41498e1.setSticker(this.f41601m8.business_intro.sticker);
                }
                tc();
            } else if (this.h == null) {
                String str2 = null;
                Paint paint = null;
                str2 = null;
                if (this.f41686t4 && this.f41489d4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    km kmVar2 = this.f41558j1;
                    qn qnVar = this.f41651qa;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int dp2 = AndroidUtilities.dp(18.0f);
                    if (qnVar != null) {
                        paint = qnVar.d("paintChatActionBackground");
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.k6.U0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.k6.f21119a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.x5(linearLayout3, kmVar2, dp2, paint));
                    linearLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(parentActivity2);
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.tl.k(15.0f, 1, textView4);
                    int i14 = org.telegram.ui.ActionBar.k6.f21278ic;
                    org.telegram.ui.ActionBar.r6.W(textView4, i14, qnVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(AndroidUtilities.dp(210.0f));
                    textView4.setText(LocaleController.getString(R.string.AlmostDone));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.W(textView5, i14, qnVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(AndroidUtilities.dp(160.0f));
                    textView5.setText(LocaleController.getString(R.string.TopicEmptyViewDescription));
                    linearLayout3.addView(u9Var, w7.z5.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, w7.z5.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, w7.z5.q(-2, -2, 1));
                    TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker("🥳");
                    if (emojiAnimatedSticker != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(emojiAnimatedSticker.thumbs, org.telegram.ui.ActionBar.k6.f21166c7, 0.2f);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        u9Var.i(ImageLocation.getForDocument(emojiAnimatedSticker), null, "tgs", svgThumb, null);
                    }
                    this.f41473c1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!K9() && this.f41489d4 == 0 && (((user2 = this.f41509f) != null && user2.self) || ((chat = this.e) != null && chat.creator && !ChatObject.isChannelAndNotMegaGroup(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    km kmVar3 = this.f41558j1;
                    if (this.e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.no noVar = new org.telegram.ui.Components.no(parentActivity3, kmVar3, i10, this.f41651qa);
                    this.f41571k1 = noVar;
                    this.f41473c1.addView(noVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.e != null) {
                        this.f41571k1.setStatusText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupEmptyTitle1)));
                    }
                } else {
                    if (K9() && this.f41489d4 == 0) {
                        str2 = this.f41673s4 ? LocaleController.getString(R.string.NoComments) : LocaleController.getString(R.string.NoReplies);
                    } else if (this.f41489d4 == 1) {
                        str2 = LocaleController.getString(R.string.NoScheduledMessages);
                    } else {
                        TLRPC.User user3 = this.f41509f;
                        if (user3 != null) {
                            long j10 = user3.f20491id;
                            if (j10 != 777000 && j10 != 429000 && j10 != 4244000 && MessagesController.isSupportUser(user3)) {
                                str2 = LocaleController.getString(R.string.GotAQuestion);
                            }
                        }
                        if (this.f41489d4 != 8 && ((user = this.f41509f) == null || user.self || user.deleted || this.f41606n)) {
                            str2 = LocaleController.getString(R.string.NoMessages);
                        }
                    }
                    if (str2 == null) {
                        this.f41498e1 = new ki(this, getParentActivity(), this.currentAccount, this.N9, this.f41651qa);
                        uc();
                        this.f41498e1.setListener(new pe(this, 5));
                        TLRPC.UserFull userFull2 = this.f41601m8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f41498e1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f41498e1.setSticker(this.f41601m8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f41486d1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f41486d1.setGravity(17);
                        this.f41486d1.addView(this.f41498e1, w7.z5.e(-2, -2, 17));
                        this.f41473c1.addView(this.f41486d1, w7.z5.e(-1, -2, 17));
                        tc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f41609n2 = textView6;
                    textView6.setText(str2);
                    this.f41609n2.setTextSize(1, 14.0f);
                    this.f41609n2.setGravity(17);
                    org.telegram.ui.ActionBar.r6.W(this.f41609n2, org.telegram.ui.ActionBar.k6.f21278ic, getResourceProvider());
                    this.f41609n2.setBackground(new org.telegram.ui.ActionBar.x5(this.f41609n2, this.f41558j1, AndroidUtilities.dp(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f41609n2.setTypeface(AndroidUtilities.bold());
                    this.f41609n2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(3.0f));
                    this.f41473c1.addView(this.f41609n2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.f41571k1 = new org.telegram.ui.Components.no(getParentActivity(), this.f41558j1, 0, this.f41651qa);
                if (this.h.admin_id == getUserConfig().getClientUserId()) {
                    this.f41571k1.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleOutgoing, UserObject.getFirstName(this.f41509f)));
                } else {
                    this.f41571k1.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleIncoming, UserObject.getFirstName(this.f41509f)));
                }
                this.f41473c1.addView(this.f41571k1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final int J8(MessageObject messageObject) {
        String str;
        String str2;
        if (messageObject == null) {
            return -1;
        }
        boolean z10 = false;
        boolean z11 = true;
        if (this.h == null) {
            if (messageObject.isEditing()) {
                return -1;
            }
            if (messageObject.getId() <= 0 && messageObject.isOut()) {
                if (!messageObject.isSendError()) {
                    return -1;
                }
                if (messageObject.isMediaEmpty()) {
                    return 20;
                }
                return 0;
            } else if (messageObject.isAnimatedEmoji()) {
                return 2;
            } else {
                int i10 = messageObject.type;
                if (i10 == 6) {
                    return -1;
                }
                if (i10 != 10 && i10 != 31 && i10 != 11 && i10 != 21 && i10 != 30 && !messageObject.isWallpaperAction()) {
                    if (messageObject.isVoice()) {
                        return 2;
                    }
                    if (!messageObject.isSticker() && !messageObject.isAnimatedSticker()) {
                        if (!messageObject.isRoundVideo() && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                            if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath) && new File(messageObject.messageOwner.attachPath).exists()) {
                                z10 = true;
                            }
                            if (z10 || !messageObject.mediaExists()) {
                                z11 = z10;
                            }
                            if (z11) {
                                if (messageObject.getDocument() != null && !messageObject.isMusic() && (str2 = messageObject.getDocument().mime_type) != null) {
                                    if (messageObject.getDocumentName().toLowerCase().endsWith("attheme")) {
                                        return 10;
                                    }
                                    if (str2.endsWith("/xml")) {
                                        return 5;
                                    }
                                    if ((!messageObject.isNewGif() && str2.endsWith("/mp4")) || str2.endsWith("/png") || str2.endsWith("/jpg") || str2.endsWith("/jpeg")) {
                                        return 6;
                                    }
                                }
                                return 4;
                            }
                        } else if (messageObject.type == 12) {
                            return 8;
                        } else {
                            if (messageObject.isMediaEmpty()) {
                                return 3;
                            }
                        }
                        return 2;
                    }
                    TLRPC.InputStickerSet inputStickerSet = messageObject.getInputStickerSet();
                    if (inputStickerSet instanceof TLRPC.TL_inputStickerSetID) {
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f20364id)) {
                            return 7;
                        }
                        return 9;
                    } else if ((inputStickerSet instanceof TLRPC.TL_inputStickerSetShortName) && !getMediaDataController().isStickerPackInstalled(inputStickerSet.short_name)) {
                        return 7;
                    } else {
                        return 9;
                    }
                } else if (messageObject.getId() == 0) {
                    return -1;
                } else {
                    return 1;
                }
            }
        } else if (messageObject.isSending()) {
            return -1;
        } else {
            if (messageObject.isAnimatedEmoji()) {
                return 2;
            }
            if (messageObject.type == 6) {
                return -1;
            }
            if (messageObject.isSendError()) {
                if (messageObject.isMediaEmpty()) {
                    return 20;
                }
                return 0;
            }
            int i11 = messageObject.type;
            if (i11 != 10 && i11 != 11) {
                if (messageObject.isVoice()) {
                    return 2;
                }
                if (!messageObject.isAnimatedEmoji() && (messageObject.isSticker() || messageObject.isAnimatedSticker())) {
                    TLRPC.InputStickerSet inputStickerSet2 = messageObject.getInputStickerSet();
                    if ((inputStickerSet2 instanceof TLRPC.TL_inputStickerSetShortName) && !getMediaDataController().isStickerPackInstalled(inputStickerSet2.short_name)) {
                        return 7;
                    }
                } else if (!messageObject.isRoundVideo() && ((messageObject.messageOwner.media instanceof TLRPC.TL_messageMediaPhoto) || messageObject.getDocument() != null || messageObject.isMusic() || messageObject.isVideo())) {
                    if (!TextUtils.isEmpty(messageObject.messageOwner.attachPath) && new File(messageObject.messageOwner.attachPath).exists()) {
                        z10 = true;
                    }
                    if (z10 || !FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).exists()) {
                        z11 = z10;
                    }
                    if (z11) {
                        if (messageObject.getDocument() != null && (str = messageObject.getDocument().mime_type) != null && str.endsWith("text/xml")) {
                            return 5;
                        }
                        if (messageObject.messageOwner.ttl <= 0) {
                            return 4;
                        }
                    }
                } else if (messageObject.type == 12) {
                    return 8;
                } else {
                    if (messageObject.isMediaEmpty()) {
                        return 3;
                    }
                }
                return 2;
            } else if (messageObject.getId() == 0 || messageObject.isSending()) {
                return -1;
            } else {
                return 1;
            }
        }
    }

    public final boolean J9() {
        if (getUserConfig().getClientUserId() == a() && !getMessagesController().getSavedMessagesController().unsupported && getUserConfig().isPremium()) {
            return true;
        }
        return false;
    }

    public final void Ja(MessageObject messageObject) {
        if (messageObject == this.Zb) {
            this.Zb = null;
            Xc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.f41516f6);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Jb(MessageSuggestionParams messageSuggestionParams) {
        Fb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Jc(boolean z10) {
        String string;
        if (this.f41489d4 != 3 && !UserObject.isBotForum(this.f41509f)) {
            hj hjVar = this.f41594m1;
            if (hjVar != null && this.f41635p4 != 0) {
                if (this.f41686t4) {
                    Zc();
                } else if (this.f41673s4) {
                    MessageObject messageObject = this.f41561j4;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f41594m1.setTitle(LocaleController.formatPluralString("Comments", this.f41561j4.getRepliesCount(), new Object[0]));
                    } else {
                        this.f41594m1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.f41561j4;
                    if (messageObject2 != null) {
                        hjVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f41611n4 != null) {
                if (this.f41561j4.getRepliesCount() == 0) {
                    if (this.f41673s4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f41611n4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final void K6() {
        if (this.f41469bb) {
            return;
        }
        if (F9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int K8() {
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        int i10 = 0;
        if (h5Var == null || h5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(i10);
                if (o2Var != this && (o2Var instanceof sn) && ((sn) o2Var).f41516f6 == this.f41516f6) {
                    break;
                }
                i10++;
            } else {
                i10 = indexOf;
                break;
            }
        }
        return i10 - indexOf;
    }

    public final boolean K9() {
        if (this.f41561j4 != null) {
            return true;
        }
        return false;
    }

    public final void Ka(MessageObject messageObject) {
        ArrayList arrayList = this.G6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            em emVar = this.A0;
            if (emVar != null && !emVar.N) {
                emVar.u(emVar.J + indexOf);
            }
        }
    }

    public final void Kb(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        Eb(z10, null, null, null, webPage, null, z11);
    }

    public final void Kc(MessageObject messageObject, int i10) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.C6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i10);
        if (arrayList == null) {
            return;
        }
        if (messageObject == null) {
            messageObject2 = new MessageObject(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            messageObject2 = null;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            MessageObject messageObject3 = (MessageObject) this.A6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                em emVar = this.A0;
                if (emVar != null) {
                    emVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    public final void L6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.L6():void");
    }

    public final boolean L7(android.view.View r96, boolean r97, boolean r98, float r99, float r100, boolean r101, boolean r102, boolean r103) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.L7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final int L8() {
        return Math.max(this.f41463b5, this.f41477c5);
    }

    public final void L9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.G6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.O6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() != this.X6) {
                            i13 = 0;
                        }
                        j(id2, 0, false, i13, true, 0);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.f41516f6)) {
                int N0 = this.f41759z0.N0();
                int L0 = this.f41759z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        em emVar = this.A0;
                        int i14 = emVar.J;
                        if (L0 >= i14 && L0 < emVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
                            if (message.date < i10) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (x()) {
                                i12 ^= 1;
                            }
                            i11 = i12 ^ 1;
                        } else {
                            L0++;
                        }
                    } else {
                        i11 = -1;
                        break;
                    }
                }
                this.f41554i9.e(i11);
                org.telegram.ui.ActionBar.c2 c2Var = this.Cb;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                Ec(false);
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f41651qa);
                this.Cb = c2Var2;
                c2Var2.setOnCancelListener(this.f41757ya);
                this.Cb.r(1000L);
                int i15 = this.f41540h6;
                this.f41579k9 = i15;
                this.f41602m9 = false;
                this.f41688t6.add(Integer.valueOf(i15));
                this.f41590l9 = 0;
                this.f41616n9 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.f41516f6;
                long j11 = this.X6;
                int i16 = this.classGuid;
                int i17 = this.f41489d4;
                long j12 = this.f41635p4;
                int i18 = this.f41751y4;
                int i19 = this.f41540h6;
                this.f41540h6 = i19 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j12, i18, i19, this.f41686t4);
                this.f41560j3.setAlpha(0.0f);
                this.f41560j3.setTag(null);
                this.f41698u3 = 0.0f;
                sc();
                this.f41573k3.setTag(null);
            }
        }
    }

    public final void La(MessageObject messageObject) {
        ArrayList arrayList = this.G6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            em emVar = this.A0;
            if (emVar != null && !emVar.N) {
                emVar.P(emVar.J + indexOf, true);
            }
        }
    }

    public final void Lb(boolean z10) {
        if (this.f41560j3 != null && !E9()) {
            if (this.f41560j3.getTag() == null) {
                AnimatorSet animatorSet = this.f41672s3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f41560j3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f41672s3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f41672s3.playTogether(ObjectAnimator.ofFloat(this.f41560j3, View.ALPHA, 1.0f));
                this.f41672s3.addListener(new oi(this, 5));
                this.f41672s3.start();
            }
            if (!z10) {
                w9();
                this.f41596m3 = 1000;
            }
        }
    }

    public final void Lc(boolean z10) {
        gk gkVar = this.Y;
        if (gkVar != null) {
            gkVar.L1(z10);
        }
    }

    public final void M6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.Kc.e) * (1.0f - this.Ic.e) * ((float[]) this.Pc.f14334b)[i10];
            view.setAlpha(f7);
            if (z10) {
                if (f7 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                if (view.getVisibility() != i11) {
                    view.setVisibility(i11);
                }
            }
        }
    }

    public final int M8() {
        if (this.f41489d4 == 5) {
            return (int) this.f41635p4;
        }
        return 0;
    }

    public final void M9() {
        this.P4 = true;
        if (this.f41753y6) {
            getMessagesStorage().getUnreadMention(this.f41516f6, d(), new rg(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.f41516f6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f41686t4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f41635p4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f41740x6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new vc(4, this, messagesStorage));
    }

    public final void Ma() {
        if (this.f41466b8 == null && this.f41480c8 == null && this.f41493d8 == null) {
            ke keVar = this.f41529g8;
            if (keVar != null) {
                AndroidUtilities.cancelRunOnUIThread(keVar);
                this.f41529g8 = null;
            }
            this.X7 = Integer.MAX_VALUE;
            this.Z7 = false;
            this.f41452a8 = 0L;
            this.f41466b8 = null;
            this.f41480c8 = null;
            this.f41493d8 = null;
        }
    }

    public final void Mb(boolean z10) {
        if (this.f41573k3 != null && !E9()) {
            if (this.f41573k3.getTag() == null) {
                ValueAnimator valueAnimator = this.f41685t3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f41573k3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41698u3, 1.0f);
                this.f41685t3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f41685t3.addUpdateListener(new me(this, 2));
                this.f41685t3.addListener(new oi(this, 7));
                this.f41685t3.start();
            }
            if (!z10) {
                w9();
                this.f41596m3 = 1000;
            }
        }
    }

    public final void Mc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        kh.h hVar = this.f41708v1;
        boolean z12 = false;
        if (hVar != null) {
            int i14 = 2;
            if (this.f41483cb) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f594c = z10;
            androidx.biometric.e eVar = hVar.e[6];
            if (eVar != null) {
                ((jh.b) eVar.f2822b).b(z10, true);
            }
            kh.h hVar2 = this.f41708v1;
            if (this.f41483cb) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f594c = z11;
            androidx.biometric.e eVar2 = hVar2.e[5];
            if (eVar2 != null) {
                ((jh.b) eVar2.f2822b).b(z11, true);
            }
        }
        this.I3 = i12;
        this.J3 = i11;
        Nc();
        org.telegram.ui.Components.o6 o6Var = this.f41537h3;
        if (o6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            o6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f41537h3.animate();
            if (i12 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
        }
    }

    public final boolean N6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.f41589l8);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            sg.j0.G1(this, this.P1, this.Q1, this.f41516f6, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void N7() {
        if (this.h == null && this.J2 == null && getParentActivity() != null) {
            dl dlVar = new dl(this, getParentActivity());
            this.J2 = dlVar;
            dlVar.setTag(1);
            this.Y0.addView(this.J2, w7.z5.n(-1, 48));
            this.Y0.h(1, this.J2);
            this.Y0.g(this.J2);
            this.J2.setOnClickListener(new ve(this, 17));
            this.J2.setEnabled(!isInPreviewMode());
            this.J2.setBackground(org.telegram.ui.ActionBar.k6.M0(false));
            org.telegram.ui.Components.tg0 tg0Var = new org.telegram.ui.Components.tg0(getParentActivity(), this.f41651qa);
            this.L2 = tg0Var;
            this.J2.addView(tg0Var, w7.z5.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.J2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.R2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.R2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21226fe));
            this.R2.setTypeface(AndroidUtilities.bold());
            this.J2.addView(this.R2, w7.z5.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i10 = 0; i10 < 2; i10++) {
                rn rnVar = new rn(this, getParentActivity());
                rn[] rnVarArr = this.O2;
                rnVarArr[i10] = rnVar;
                rnVar.setTextSize(14);
                org.telegram.ui.ActionBar.r6.Z(rnVarArr[i10], org.telegram.ui.ActionBar.k6.f21226fe, getResourceProvider());
                rnVarArr[i10].setTypeface(AndroidUtilities.bold());
                this.J2.addView(rnVarArr[i10], w7.z5.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                el elVar = new el(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.n5[] n5VarArr = this.P2;
                n5VarArr[i10] = elVar;
                elVar.setTextSize(14);
                org.telegram.ui.ActionBar.r6.Z(n5VarArr[i10], org.telegram.ui.ActionBar.k6.f21245ge, getResourceProvider());
                this.J2.addView(n5VarArr[i10], w7.z5.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                hn hnVar = new hn(this, getParentActivity());
                hn[] hnVarArr = this.Q2;
                hnVarArr[i10] = hnVar;
                this.J2.addView(hnVar, w7.z5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                fl flVar = new fl(getParentActivity());
                flVar.I = new wh.g();
                flVar.H = new Path();
                flVar.J = new float[8];
                org.telegram.ui.Components.u9[] u9VarArr = this.N2;
                u9VarArr[i10] = flVar;
                flVar.setBlurAllowed(true);
                u9VarArr[i10].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.J2.addView(u9VarArr[i10], w7.z5.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i10 == 1) {
                    rnVarArr[i10].setVisibility(4);
                    hnVarArr[i10].setVisibility(4);
                    n5VarArr[i10].setVisibility(4);
                    u9VarArr[i10].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.X2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.X2;
            int i11 = org.telegram.ui.ActionBar.k6.f21190de;
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView2, i11, resourceProvider, mode);
            ImageView imageView3 = this.X2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.X2.setContentDescription(LocaleController.getString(R.string.AccPinnedMessagesList));
            this.X2.setVisibility(4);
            this.X2.setAlpha(0.0f);
            this.X2.setScaleX(0.4f);
            this.X2.setScaleY(0.4f);
            ImageView imageView4 = this.X2;
            int i12 = org.telegram.ui.ActionBar.k6.f21555x7;
            org.telegram.ui.ActionBar.r6.S(imageView4, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i12) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.r6.h(i12, 25), getResourceProvider());
            this.J2.addView(this.X2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.X2.setOnClickListener(new ve(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.V2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            org.telegram.ui.ActionBar.r6.t(this.V2, i11, getResourceProvider(), mode);
            this.V2.setScaleType(scaleType);
            this.V2.setVisibility(8);
            this.V2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f41651qa);
            this.W2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.W2.setSize(AndroidUtilities.dp(16.0f));
            this.W2.setStrokeWidth(2.0f);
            this.W2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21208ee));
            this.J2.addView(this.W2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.S(this.V2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i12) & 436207615, 1, AndroidUtilities.dp(14.0f)), null, org.telegram.ui.ActionBar.r6.h(i12, 25), getResourceProvider());
            this.J2.addView(this.V2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.V2.setOnClickListener(new ve(this, 19));
            Ec(false);
        }
    }

    public final long N8() {
        if (this.f41489d4 == 3) {
            return this.f41635p4;
        }
        return 0L;
    }

    public final void N9(boolean z10) {
        TLRPC.Chat chat;
        if (this.f41692ta == null && (chat = this.e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.f41516f6);
            this.f41692ta = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.N1(false, z10);
            }
        }
    }

    public final void Na(boolean z10) {
        MessageObject messageObject = this.V7;
        if (messageObject != null) {
            if (z10) {
                boolean[] zArr = this.Q6;
                zArr[1] = true;
                zArr[0] = true;
                this.T7 = 0;
                this.W6 = 0;
            }
            this.P7 = 0;
            this.Q7 = false;
            Ka(messageObject);
            this.V7 = null;
        }
    }

    public final boolean Nb() {
        gk gkVar = this.Y;
        if (gkVar != null && gkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f41644q2 == null) {
                    if (!this.f41612n5) {
                        gk gkVar2 = this.Y;
                        if (gkVar2 != null) {
                            gkVar2.R();
                            MediaDataController.getInstance(gkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.bg bgVar = gkVar2.U0;
                            bgVar.L(false, false);
                            bgVar.Q(false, false);
                            bgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        km kmVar = this.f41558j1;
                        int indexOfChild = kmVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            gk gkVar3 = this.Y;
                            gkVar3.R();
                            MediaDataController.getInstance(gkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.bg bgVar2 = gkVar3.U0;
                            bgVar2.L(false, false);
                            bgVar2.Q(false, false);
                            bgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.I2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            kmVar.addView(this.I2, i10, w7.z5.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(9, getParentActivity(), this.f41651qa, false);
                            this.f41644q2 = p40Var;
                            p40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            kmVar.addView(this.f41644q2, i10, w7.z5.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.p40 p40Var2 = this.f41644q2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(p40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.I2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new oi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f41644q2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Nc() {
        org.telegram.ui.Components.o6 o6Var = this.f41524g3;
        if (o6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.I3;
            if (i10 < 0) {
                o6Var.c("", z10, true);
            } else if (i10 == 0) {
                o6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.D3) {
                o6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.f41489d4 != 7 && !this.Mc.f17447f) {
                o6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.J3 + 1), Integer.valueOf(this.I3)), z10, true);
            } else {
                o6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void O6(boolean z10) {
        if (this.Z6 == 0) {
            if (z10 && !this.f41451a7.isEmpty()) {
                this.Z6 = System.currentTimeMillis();
            } else {
                this.Z6 = 1L;
            }
            I9();
            nj njVar = this.f41734x0;
            if (njVar != null) {
                njVar.invalidate();
            }
        }
    }

    public final void O7() {
        int i10;
        int i11;
        if (this.f41488d3 == null && getParentActivity() != null) {
            jk jkVar = new jk(this, getParentActivity(), 1);
            this.f41488d3 = jkVar;
            jkVar.setClickable(false);
            this.f41488d3.setWillNotDraw(false);
            this.Pc.h(4, false, false);
            this.f41488d3.setClipToPadding(false);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), true, true, true);
            this.f41524g3 = o6Var;
            org.telegram.ui.Components.zr zrVar = org.telegram.ui.Components.zr.h;
            o6Var.b(0.25f, 280L, zrVar);
            this.f41524g3.setTextSize(AndroidUtilities.dp(15.0f));
            this.f41524g3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.a0(this.f41524g3, org.telegram.ui.ActionBar.k6.f21579ye, getResourceProvider());
            this.f41524g3.setGravity(3);
            this.f41488d3.addView(this.f41524g3, w7.z5.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.U.addView(this.f41488d3, w7.z5.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(getParentActivity(), true, false, true);
            this.f41537h3 = o6Var2;
            o6Var2.b(0.0f, 420L, zrVar);
            this.f41537h3.setScaleProperty(0.7f);
            this.f41537h3.setTextSize(AndroidUtilities.dp(15.0f));
            this.f41537h3.setGravity(5);
            this.f41537h3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.a0(this.f41537h3, org.telegram.ui.ActionBar.k6.f21387o6, getResourceProvider());
            org.telegram.ui.Components.o6 o6Var3 = this.f41537h3;
            if (this.Mc.f17447f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            o6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.o6 o6Var4 = this.f41537h3;
            o6Var4.f29157n = false;
            o6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.f41537h3.setOnClickListener(new ve(this, 2));
            this.f41537h3.setAlpha(0.5f);
            this.f41537h3.setClickable(false);
            this.f41488d3.addView(this.f41537h3, w7.z5.e(-2, -1, 117));
            org.telegram.ui.Components.o6 o6Var5 = new org.telegram.ui.Components.o6(getParentActivity(), true, true, true);
            this.f41548i3 = o6Var5;
            o6Var5.setGravity(17);
            this.f41548i3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.r6.a0(this.f41548i3, org.telegram.ui.ActionBar.k6.Ae, getResourceProvider());
            this.f41548i3.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.o6 o6Var6 = this.f41548i3;
            int i12 = org.telegram.ui.ActionBar.k6.f21184d6;
            int themedColor = getThemedColor(i12);
            int themedColor2 = getThemedColor(i12);
            int i13 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.ActionBar.r6.S(o6Var6, org.telegram.ui.ActionBar.k6.h0(themedColor, org.telegram.ui.ActionBar.k6.v(themedColor2, getThemedColor(i13))), org.telegram.ui.ActionBar.r6.O(i12), org.telegram.ui.ActionBar.r6.q(i12, i13), getResourceProvider());
            org.telegram.ui.Components.o6 o6Var7 = this.f41548i3;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            o6Var7.setText(LocaleController.getString(i11));
            this.f41548i3.setOnClickListener(new ve(this, 3));
            this.f41548i3.setVisibility(8);
            this.f41548i3.setAlpha(0.0f);
            this.f41488d3.addView(this.f41548i3, w7.z5.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.e.megagroup) && this.f41489d4 != 7 && !ChatObject.isMonoForum(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f41513f3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f41513f3.setImageResource(R.drawable.msg_usersearch);
                org.telegram.ui.ActionBar.r6.t(this.f41513f3, org.telegram.ui.ActionBar.k6.f21562xe, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f41513f3;
                int i14 = org.telegram.ui.ActionBar.k6.f21591z8;
                org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i14), getResourceProvider());
                this.f41488d3.addView(this.f41513f3, w7.z5.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f41513f3.setOnClickListener(new ve(this, 4));
                this.f41513f3.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.f41489d4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f41500e3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f41500e3.setImageResource(R.drawable.msg_calendar);
                org.telegram.ui.ActionBar.r6.t(this.f41500e3, org.telegram.ui.ActionBar.k6.f21562xe, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f41500e3;
                int i15 = org.telegram.ui.ActionBar.k6.f21591z8;
                org.telegram.ui.ActionBar.r6.S(imageView4, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i15), 1, -1), null, org.telegram.ui.ActionBar.r6.O(i15), getResourceProvider());
                this.f41488d3.addView(this.f41500e3, w7.z5.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f41500e3.setOnClickListener(new ve(this, 5));
                this.f41500e3.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int O8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f41734x0.getMeasuredHeight() - this.Na) - this.E9) - this.v.e()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void O9(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Oa(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        a0.h hVar;
        ArrayList arrayList2;
        em emVar;
        int i11;
        int i12;
        ArrayList arrayList3;
        HashMap hashMap;
        int i13;
        int i14;
        int i15;
        boolean z12;
        MessageObject.GroupedMessages groupedMessages;
        int indexOf;
        ArrayList<TLRPC.PhotoSize> arrayList4;
        TL_stories.StoryItem storyItem;
        TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage;
        TLRPC.WebPage webPage;
        TL_stories.StoryItem storyItem2;
        RichMessageLayout richMessageLayout;
        TLRPC.Message message;
        ArrayList arrayList5 = arrayList;
        int i16 = 0;
        a0.h hVar2 = null;
        while (true) {
            int size = arrayList5.size();
            hVar = this.J6;
            arrayList2 = this.G6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.V4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.V4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.A6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f41509f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f41509f.f20491id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Xa();
                this.f41496dc.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.f41484cc.bind(messageObject2.messageOwner.f20365id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f20365id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.V4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.V4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.X4) {
                    Fc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.B6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.f41489d4 == 1))) {
                if (z10) {
                    arrayList5.remove(i16);
                    i16--;
                }
                x6(messageObject, messageObject2);
                if (messageObject2.richCheckboxEcho && messageObject.type == 36 && (richMessageLayout = messageObject2.richLayout) != null && (message = messageObject.messageOwner) != null) {
                    messageObject.richLayout = richMessageLayout;
                    message.rich_message = messageObject2.messageOwner.rich_message;
                    messageObject2.richCheckboxEcho = false;
                }
                if (messageObject.type >= 0) {
                    MessageObject messageObject3 = messageObject2.replyMessageObject;
                    if (messageObject3 != null) {
                        messageObject.replyMessageObject = messageObject3;
                        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                        if (messageAction instanceof TLRPC.TL_messageActionGameScore) {
                            storyItem = null;
                            messageObject.generateGameMessageText(null);
                        } else {
                            storyItem = null;
                            if (messageAction instanceof TLRPC.TL_messageActionPaymentSent) {
                                messageObject.generatePaymentSentMessageText(null, false);
                            } else if (messageAction instanceof TLRPC.TL_messageActionPaymentSentMe) {
                                messageObject.generatePaymentSentMessageText(null, true);
                            } else if (messageAction instanceof TLRPC.TL_messageActionSuggestedPostApproval) {
                                messageObject.generateSuggestionApprovalMessageText();
                            }
                        }
                    } else {
                        storyItem = null;
                    }
                    if (messageObject2.isWebpage() && messageObject.isWebpage() && (webPage = (tL_messageMediaWebPage = (TLRPC.TL_messageMediaWebPage) MessageObject.getMedia(messageObject2.messageOwner)).webpage) != null && "telegram_story".equals(webPage.type)) {
                        int i17 = 0;
                        while (true) {
                            if (i17 < tL_messageMediaWebPage.webpage.attributes.size()) {
                                TLRPC.WebPageAttribute webPageAttribute = tL_messageMediaWebPage.webpage.attributes.get(i17);
                                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                                    storyItem2 = ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem;
                                    break;
                                }
                                i17++;
                            } else {
                                storyItem2 = storyItem;
                                break;
                            }
                        }
                        if (storyItem2 != null) {
                            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage2 = (TLRPC.TL_messageMediaWebPage) MessageObject.getMedia(messageObject.messageOwner);
                            int i18 = 0;
                            while (true) {
                                if (i18 >= tL_messageMediaWebPage2.webpage.attributes.size()) {
                                    break;
                                }
                                TLRPC.WebPageAttribute webPageAttribute2 = tL_messageMediaWebPage2.webpage.attributes.get(i18);
                                if (webPageAttribute2 instanceof TLRPC.TL_webPageAttributeStory) {
                                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute2;
                                    if (!(tL_webPageAttributeStory.storyItem instanceof TL_stories.TL_storyItem)) {
                                        tL_webPageAttributeStory.storyItem = storyItem2;
                                    }
                                } else {
                                    i18++;
                                }
                            }
                        }
                    }
                    if (!messageObject2.isEditing()) {
                        if (messageObject2.getFileName().equals(messageObject.getFileName())) {
                            messageObject.messageOwner.attachPath = messageObject2.messageOwner.attachPath;
                            messageObject.attachPathExists = messageObject2.attachPathExists;
                            messageObject.mediaExists = messageObject2.mediaExists;
                        } else {
                            messageObject.checkMediaExistance();
                        }
                    }
                    sparseArrayArr[i10].put(messageObject2.getId(), messageObject);
                } else {
                    sparseArrayArr[i10].remove(messageObject2.getId());
                }
                int indexOf2 = arrayList2.indexOf(messageObject2);
                if (indexOf2 >= 0) {
                    String str = messageObject2.dateKey;
                    HashMap hashMap2 = this.D6;
                    ArrayList arrayList6 = (ArrayList) hashMap2.get(str);
                    if (arrayList6 != null) {
                        i12 = arrayList6.indexOf(messageObject2);
                    } else {
                        i12 = -1;
                    }
                    if (messageObject2.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId())) != null && (indexOf = groupedMessages.messages.indexOf(messageObject2)) >= 0) {
                        if (messageObject2.getGroupId() != messageObject.getGroupId()) {
                            i11 = i16;
                            hVar.k(groupedMessages, messageObject.getGroupId());
                        } else {
                            i11 = i16;
                        }
                        if (messageObject.isMusic() || messageObject.isDocument() || ((arrayList4 = messageObject.photoThumbs) != null && !arrayList4.isEmpty())) {
                            arrayList3 = arrayList6;
                            hashMap = hashMap2;
                            i13 = i12;
                            groupedMessages.messages.set(indexOf, messageObject);
                            MessageObject.GroupedMessagePosition remove = groupedMessages.positions.remove(messageObject2);
                            groupedMessages.positionsArray.l(messageObject2.getId());
                            if (remove != null) {
                                groupedMessages.positions.put(messageObject, remove);
                                groupedMessages.positionsArray.k(remove, messageObject.getId());
                            }
                            if (hVar2 == null) {
                                hVar2 = new a0.h();
                            }
                            hVar2.k(groupedMessages, groupedMessages.groupId);
                        } else {
                            if (hVar2 == null) {
                                hVar2 = new a0.h();
                            }
                            hVar2.k(groupedMessages, groupedMessages.groupId);
                            if (indexOf > 0 && indexOf < groupedMessages.messages.size() - 1) {
                                MessageObject.GroupedMessages groupedMessages2 = new MessageObject.GroupedMessages();
                                groupedMessages2.reversed = this.f41483cb;
                                arrayList3 = arrayList6;
                                groupedMessages2.groupId = Utilities.random.nextLong();
                                ArrayList<MessageObject> arrayList7 = groupedMessages2.messages;
                                ArrayList<MessageObject> arrayList8 = groupedMessages.messages;
                                int i19 = indexOf + 1;
                                arrayList7.addAll(arrayList8.subList(i19, arrayList8.size()));
                                int i20 = 0;
                                while (i20 < groupedMessages2.messages.size()) {
                                    groupedMessages2.messages.get(i20).localGroupId = groupedMessages2.groupId;
                                    groupedMessages.messages.remove(i19);
                                    i20++;
                                    hashMap2 = hashMap2;
                                    i12 = i12;
                                }
                                hashMap = hashMap2;
                                i13 = i12;
                                hVar2.k(groupedMessages2, groupedMessages2.groupId);
                                hVar.k(groupedMessages2, groupedMessages2.groupId);
                            } else {
                                arrayList3 = arrayList6;
                                hashMap = hashMap2;
                                i13 = i12;
                            }
                            groupedMessages.messages.remove(indexOf);
                        }
                    } else {
                        i11 = i16;
                        arrayList3 = arrayList6;
                        hashMap = hashMap2;
                        i13 = i12;
                    }
                    if (this.f41489d4 == 3) {
                        messageObject.isSaved = true;
                    }
                    if (messageObject.type >= 0) {
                        boolean z13 = messageObject.reactionsChanged;
                        if (messageObject2.isBotPendingDraft && !messageObject.isBotPendingDraft) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        messageObject.reactionsChanged = z13 | z12;
                        messageObject.copyStableParams(messageObject2);
                        arrayList2.set(indexOf2, messageObject);
                        em emVar2 = this.A0;
                        if (emVar2 != null && !emVar2.N) {
                            emVar2.Q(emVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        em emVar3 = this.A0;
                        if (emVar3 != null && !emVar3.N) {
                            emVar3.u(emVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.h hVar3 = this.F6;
                        if (((MessageObject) hVar3.f(id4)) != null) {
                            hVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            em emVar4 = this.A0;
                            int i22 = emVar4.E;
                            int i23 = emVar4.F;
                            int i24 = emVar4.H;
                            int i25 = emVar4.G;
                            if (!emVar4.N) {
                                emVar4.u(emVar4.J + indexOf2);
                                if (arrayList2.isEmpty()) {
                                    if (i22 >= 0) {
                                        i15 = 0;
                                        this.A0.u(0);
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i23 >= 0) {
                                        this.A0.u(i15);
                                    }
                                    if (i24 >= 0) {
                                        this.A0.u(i15);
                                    }
                                    if (i25 >= 0) {
                                        this.A0.u(i15);
                                    }
                                }
                            }
                        }
                        if (i21 >= 0) {
                            arrayList9.remove(i21);
                            if (arrayList9.isEmpty()) {
                                hashMap.remove(messageObject2.dateKey);
                                this.E6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                em emVar5 = this.A0;
                                int i26 = emVar5.E;
                                int i27 = emVar5.F;
                                int i28 = emVar5.H;
                                int i29 = emVar5.G;
                                if (!emVar5.N) {
                                    emVar5.u(emVar5.J + indexOf2);
                                    if (arrayList2.isEmpty()) {
                                        if (i26 >= 0) {
                                            i14 = 0;
                                            this.A0.u(0);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i27 >= 0) {
                                            this.A0.u(i14);
                                        }
                                        if (i28 >= 0) {
                                            this.A0.u(i14);
                                        }
                                        if (i29 >= 0) {
                                            this.A0.u(i14);
                                        }
                                        Kc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Kc(messageObject, messageObject2.getId());
                i16 = i11;
            }
            i16++;
            arrayList5 = arrayList;
        }
        if (hVar2 != null) {
            for (int i30 = 0; i30 < hVar2.m(); i30++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar2.n(i30);
                if (groupedMessages3.messages.isEmpty()) {
                    hVar.l(groupedMessages3.groupId);
                } else {
                    groupedMessages3.calculate();
                    int indexOf3 = arrayList2.indexOf((MessageObject) i2.o1.i(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (emVar = this.A0) != null) {
                        emVar.q(indexOf3 + emVar.J, groupedMessages3.messages.size());
                        pj pjVar = this.f41748y0;
                        if (pjVar != null) {
                            pjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        Gc();
    }

    public final void Ob() {
        TLRPC.ChatFull chatFull = this.f41589l8;
        if (chatFull != null && !this.C5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new ke(this, 17), 1000L);
            }
        }
    }

    public final void Oc() {
        P7();
        String str = this.G3;
        if (str != null) {
            this.f41633p2.e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.X3.setEmptyView(this.f41633p2);
            return;
        }
        this.X3.setEmptyView(null);
        this.f41633p2.setVisibility(8);
    }

    public final void P6(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        MessageObject messageObject2 = this.B5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f41660r5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.S5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.S5 = null;
                gk gkVar = this.Y;
                if (gkVar != null) {
                    gkVar.X2 = null;
                    gkVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f41660r5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = gkVar.getFieldText();
                    MessageObject messageObject3 = this.f41764z5;
                    if (messageObject3 == this.f41561j4) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f41739x5, this.B5);
                }
                l8();
                m8();
            }
        }
    }

    public final void P7() {
        if (this.f41633p2 == null && this.F1 == null) {
            org.telegram.ui.Components.z00 z00Var = new org.telegram.ui.Components.z00(getParentActivity(), this.f41651qa);
            this.f41622o2 = z00Var;
            z00Var.setViewType(7);
            org.telegram.ui.Components.vx0 vx0Var = new org.telegram.ui.Components.vx0(getParentActivity(), this.f41622o2, 1, null);
            this.f41633p2 = vx0Var;
            vx0Var.setClickable(true);
            this.f41633p2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f41633p2.setVisibility(8);
            this.f41633p2.addView(this.f41622o2, 0);
            this.f41633p2.e(true, false);
            this.W3.addView(this.f41633p2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.k40 k40Var = new org.telegram.ui.Components.k40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.F1 = k40Var;
            k40Var.setOnHashtagClickListener(new xe(this, 2));
            this.F1.setOnScrollListener(new j3(this, 5));
            this.F1.setVisibility(8);
            this.W3.addView(this.F1, -1, -1);
            u7();
            s7();
        }
    }

    public final int P8(MessageObject messageObject) {
        return O8(F8(messageObject, !TextUtils.isEmpty(this.f41466b8))) - Ya(messageObject);
    }

    public final qi P9(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle) {
        pf.c cVar = this.Nb;
        if (cVar != null) {
            cVar.a(true);
            this.Nb = null;
        }
        if (characterStyle != null && t1Var != null && t1Var.getMessageObject() != null) {
            qi qiVar = new qi(this, t1Var.getMessageObject().getId(), characterStyle, t1Var, 0);
            this.Nb = qiVar;
            return qiVar;
        }
        this.Nb = null;
        return null;
    }

    public final void Pa() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.G7 = 0;
        this.f41728w7 = false;
        this.f41741x7 = true;
        this.f41688t6.clear();
    }

    public final void Pb(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.oc G = org.telegram.ui.Components.vc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f29203j = max;
        G.v = new bf(this, i10, 3);
        G.k(true);
        this.S3 = messageObject;
        this.T3 = i10;
    }

    public final void Pc() {
        boolean z10;
        if (this.f41708v1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.E3 && !this.D3) || (this.f41489d4 == 7 && this.f41448a4 == 2 && !this.G6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41708v1.e(6, z10, true);
        this.f41708v1.e(5, z10, true);
        if (z10) {
            this.f41708v1.e(1, false, true);
        }
        if (!z10) {
            this.N7 = 0;
        }
        this.f41558j1.invalidate();
    }

    public final void Q6() {
        MessageObject editingMessageObject;
        int abs;
        gk gkVar = this.Y;
        if (gkVar != null && (editingMessageObject = gkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f41509f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.n5 n5Var = ((org.telegram.ui.Components.yo[]) this.f41445a0.f900b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        n5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new kg(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.ve veVar = this.Y.F1;
                if (veVar != null) {
                    veVar.setVisibility(8);
                }
                n5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView Q7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.K8);
        if (this.F8 == null) {
            jk jkVar = new jk(this, getParentActivity(), 2);
            this.F8 = jkVar;
            jkVar.setOutlineProvider(new hl(this));
            this.F8.setClipToOutline(true);
            this.F8.setWillNotDraw(false);
            n4 n4Var = new n4(getParentActivity());
            this.H8 = n4Var;
            n4Var.setBackgroundColor(0);
            if (z10) {
                this.F8.addView(this.H8, w7.z5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.I8 = textureView;
            textureView.setOpaque(false);
            this.H8.addView(this.I8, w7.z5.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.F8.getParent();
        if (viewGroup != null && viewGroup != this.f41558j1) {
            viewGroup.removeView(this.F8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.f41558j1.addView(this.F8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(H9()), AndroidUtilities.roundPlayingMessageSize(H9())));
        }
        this.F8.setTag(null);
        this.H8.setDrawingReady(false);
        return this.I8;
    }

    public final int Q8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f41734x0.getMeasuredHeight() - view.getBottom()) - this.f41734x0.getPaddingBottom()) + "} chatHeight=" + this.f41734x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f41734x0.getPaddingBottom());
        return (this.f41734x0.getMeasuredHeight() - view.getBottom()) - this.f41734x0.getPaddingBottom();
    }

    public final void Q9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.f41516f6, messageObject);
        }
    }

    public final void Qa() {
        this.Lb = null;
        this.Jb = 0;
        this.Kb = -1;
        this.Mb = null;
        this.Nb = null;
        this.f41708v1.d(false);
    }

    public final void Qb(boolean z10) {
        boolean z11;
        kh.h hVar = this.f41708v1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.N7 = 0;
            }
        }
    }

    public final void Qc(String str) {
        if (this.f41489d4 == 7 && !TextUtils.equals(this.G3, str)) {
            P7();
            Rb(true);
            this.G3 = str;
            this.F3 = str;
            U6(false);
            A7(true);
            this.Z6 = 0L;
            this.f41728w7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.f41448a4);
            this.Y3.l();
            this.X3.requestLayout();
            if (this.X3.getLayoutManager() != null) {
                this.X3.getLayoutManager().n0(0);
            }
            Oc();
            this.f41633p2.e(true, true);
            v8();
        }
    }

    public final void R6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.f41553i8;
        if (call != null && (((str = this.f41677s8) != null || this.f41690t8) && this.Z5)) {
            org.telegram.ui.Components.voip.d2.l(this.e, str, this.f41578k8, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f41677s8 = null;
            this.f41690t8 = false;
            return;
        }
        if (this.f41677s8 != null && z10 && (chatFull = this.f41589l8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.v0.p(R.string.LinkHashExpired, org.telegram.ui.Components.vc.a0(this), R.raw.linkbroken, 36);
            this.f41677s8 = null;
        }
        this.f41565j8 = !this.Z5;
    }

    public final void R7() {
        if (this.f41558j1 != null && this.W1 == null && getParentActivity() != null) {
            this.W1 = new org.telegram.ui.ActionBar.p0(this, getParentActivity(), 1);
            t9();
            this.W1.setClickable(true);
            this.Y0.addView(this.W1, w7.z5.n(-1, 44));
            this.Y0.h(2, this.W1);
            this.Y0.g(this.W1);
            TextView textView = new TextView(getParentActivity());
            this.Z1 = textView;
            int i10 = org.telegram.ui.ActionBar.k6.f21422q7;
            org.telegram.ui.ActionBar.r6.W(textView, i10, getResourceProvider());
            TextView textView2 = this.Z1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            org.telegram.ui.ActionBar.r6.S(textView2, org.telegram.ui.ActionBar.k6.X(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2), null, org.telegram.ui.ActionBar.r6.h(i10, 25), getResourceProvider());
            this.Z1.setTag(Integer.valueOf(i10));
            this.Z1.setTextSize(1, 14.0f);
            this.Z1.setTypeface(AndroidUtilities.bold());
            this.Z1.setSingleLine(true);
            this.Z1.setMaxLines(1);
            this.Z1.setGravity(17);
            this.W1.addView(this.Z1, w7.z5.e(-1, -1, 51));
            this.Z1.setOnClickListener(new ve(this, 13));
            org.telegram.ui.Components.w90 w90Var = new org.telegram.ui.Components.w90(getParentActivity(), this.f41651qa);
            this.f41512f2 = w90Var;
            org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21245ge, getResourceProvider());
            this.f41512f2.setTextSize(1, 13.3f);
            this.f41512f2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.r6.I(this.f41512f2, org.telegram.ui.ActionBar.k6.il, getResourceProvider());
            this.f41512f2.setGravity(17);
            this.f41512f2.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.Y0.addView(this.f41512f2, w7.z5.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.Y0.h(8, this.f41512f2);
            this.Y0.g(this.f41512f2);
            TextView textView3 = new TextView(getParentActivity());
            this.X1 = textView3;
            int i11 = org.telegram.ui.ActionBar.k6.he;
            org.telegram.ui.ActionBar.r6.W(textView3, i11, getResourceProvider());
            this.X1.setVisibility(8);
            this.X1.setTextSize(1, 14.0f);
            this.X1.setTypeface(AndroidUtilities.bold());
            this.X1.setSingleLine(true);
            this.X1.setMaxLines(1);
            this.X1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.X1.setGravity(17);
            TextView textView4 = this.X1;
            int themedColor = getThemedColor(i11) & 436207615;
            int dp3 = AndroidUtilities.dp(4.0f);
            org.telegram.ui.ActionBar.r6.S(textView4, org.telegram.ui.ActionBar.k6.X(AndroidUtilities.dp(18.0f), themedColor, dp3, dp3, dp3, dp3), null, org.telegram.ui.ActionBar.r6.h(i11, 25), getResourceProvider());
            this.W1.addView(this.X1, w7.z5.e(-1, -1, 51));
            this.X1.setOnClickListener(new ve(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.a2 = textView5;
            org.telegram.ui.ActionBar.r6.W(textView5, i11, getResourceProvider());
            this.a2.setVisibility(8);
            this.a2.setTextSize(1, 14.0f);
            this.a2.setTypeface(AndroidUtilities.bold());
            this.a2.setSingleLine(true);
            this.a2.setMaxLines(1);
            this.a2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.a2.setGravity(17);
            this.a2.setText(LocaleController.getString(R.string.RestartTopic));
            org.telegram.ui.ActionBar.r6.S(this.a2, org.telegram.ui.ActionBar.k6.g0(getThemedColor(i11) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.r6.h(i11, 25), getResourceProvider());
            this.Y0.addView(this.a2, w7.z5.n(-1, 48));
            this.Y0.h(4, this.a2);
            this.Y0.g(this.a2);
            this.a2.setOnClickListener(new ve(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f41523g2 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.f41523g2.setContentDescription(LocaleController.getString(R.string.Close));
            ImageView imageView2 = this.f41523g2;
            int i12 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.ActionBar.r6.S(imageView2, org.telegram.ui.ActionBar.k6.N(getThemedColor(i12), 0, 0), null, org.telegram.ui.ActionBar.r6.O(i12), getResourceProvider());
            org.telegram.ui.ActionBar.r6.t(this.f41523g2, org.telegram.ui.ActionBar.k6.f21190de, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f41523g2.setScaleType(ImageView.ScaleType.CENTER);
            this.W1.addView(this.f41523g2, w7.z5.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f41523g2.setOnClickListener(new ve(this, 16));
        }
    }

    public final kn R8() {
        if (this.Bc == null) {
            this.Bc = new kn(this);
        }
        return this.Bc;
    }

    public final boolean R9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.c6 c6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.c6 animation;
        boolean z10;
        org.telegram.ui.Cells.t1 messageCell;
        boolean z11;
        if (this.f41734x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.p40 p40Var = this.F2;
            ArrayList<MessageObject> arrayList = null;
            if (p40Var != null && p40Var.getTag() != null && (messageCell = this.F2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                c6Var = photoImage2.getAnimation();
                if (c6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f41734x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.J8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                c6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f41734x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f41734x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject2 = t1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = t1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f41734x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f41734x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.J8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f41734x0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    c6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                c6Var = animation;
                            }
                        }
                    }
                    i10++;
                }
            }
            if (messageObject != null && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                m9(true);
                if (messageObject.isRoundVideo()) {
                    boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                    MediaController mediaController = MediaController.getInstance();
                    if (playMessage) {
                        arrayList = U7(messageObject, false);
                    }
                    mediaController.setVoiceMessagesPlaylist(arrayList, false);
                    return playMessage;
                }
                SharedConfig.setNoSoundHintShowed(true);
                messageObject.audioProgress = c6Var.n();
                messageObject.audioProgressMs = c6Var.o();
                c6Var.stop();
                if (PhotoViewer.N1(messageObject)) {
                    PhotoViewer.f33543b9.R0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ra(org.telegram.ui.Cells.t1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Ra(org.telegram.ui.Cells.t1):void");
    }

    public final void Rb(boolean z10) {
        int i10;
        if (this.W3 != null) {
            ne.b bVar = this.Mc;
            if (bVar.f17447f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.f41489d4 == 7) {
                    s4.b0 b0Var = (s4.b0) this.X3.getLayoutManager();
                    Object E = this.Y3.E((b0Var.N0() + b0Var.L0()) / 2);
                    Object E2 = this.Y3.E(b0Var.L0());
                    Object E3 = this.Y3.E(b0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f41759z0.L0();
                        int N0 = this.f41759z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f20365id;
                        int i12 = ((MessageObject) E2).messageOwner.f20365id;
                        int i13 = ((MessageObject) E3).messageOwner.f20365id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f20365id == i12) {
                                int i16 = this.A0.J + i15;
                                if (L0 <= i16 && N0 >= i16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f20365id == i13) {
                                int i17 = this.A0.J + i15;
                                if (L0 <= i17 && N0 >= i17) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f20365id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.f41759z0.h1(this.A0.J + i14, (this.f41734x0.getHeight() - F8((MessageObject) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.o6 o6Var = this.f41537h3;
                if (o6Var != null) {
                    if (bVar.f17447f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    o6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                ei.x3 x3Var = this.J1;
                if (x3Var != null && x3Var.V) {
                    x3Var.e(true);
                }
                ql qlVar = this.N1;
                if (qlVar != null && qlVar.V) {
                    qlVar.e(true);
                }
                gk gkVar = this.Y;
                if (gkVar != null) {
                    gkVar.i0();
                }
                Nc();
            }
        }
    }

    public final void Rc() {
        gk gkVar;
        if (this.R != null) {
            this.E0.setBackground(null);
            this.E0.setOnClickListener(null);
            boolean z10 = true;
            if (this.f41489d4 == 3 && N8() == 2666000) {
                this.E0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.R.setVisibility(0);
                this.U1.setVisibility(8);
                this.U1.setTag(null);
                zc();
                org.telegram.ui.Components.kz0 kz0Var = this.f41632p1;
                if (kz0Var != null) {
                    kz0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.e)) {
                    TLRPC.Chat chat2 = this.e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.e.megagroup)) {
                        TLRPC.Chat chat3 = this.e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.k6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                this.N0 = mutate;
                                this.K0 = getThemedColor(i10);
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.wq wqVar = new org.telegram.ui.Components.wq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                wqVar.e = dp;
                                wqVar.f32325f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                wqVar.h = dp3;
                                wqVar.f32326n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.v0.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.k10(i10, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(wqVar, 1), 0, 1, 33);
                                TextView textView = this.E0;
                                int i11 = org.telegram.ui.ActionBar.k6.f21273i6;
                                org.telegram.ui.ActionBar.r6.S(textView, org.telegram.ui.ActionBar.k6.h0(0, org.telegram.ui.ActionBar.k6.x0(null, i11, false)), null, org.telegram.ui.ActionBar.r6.O(i11), null);
                                this.E0.setText(spannableStringBuilder);
                                this.E0.setOnClickListener(new ve(this, 0));
                            } else {
                                this.E0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.E0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.E0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.e.banned_rights.until_date)));
                        }
                        this.R.setVisibility(0);
                        this.U1.setVisibility(8);
                        this.U1.setTag(null);
                        zc();
                        org.telegram.ui.Components.kz0 kz0Var2 = this.f41632p1;
                        if (kz0Var2 != null) {
                            kz0Var2.f();
                        }
                    }
                }
                J7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.f41571k1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a1.g.s(new StringBuilder("<b>"), this.f41509f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.f41516f6, this.f41635p4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.R.setVisibility(4);
                            if (!this.inPreviewMode && !this.f41469bb && this.f41489d4 != 3) {
                                this.Y.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    Z6();
                    J6(false);
                } else {
                    this.R.setVisibility(4);
                    if (this.f41632p1 != null && (gkVar = this.Y) != null && gkVar.h0()) {
                        this.f41632p1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.R.setVisibility(4);
            }
            if (z10) {
                this.Y.j0(false);
                if (getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    public final void S6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.K1 == null && ChatObject.isMegagroup(this.e) && (chatFull = getMessagesController().getChatFull(this.e.f20344id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            kk kkVar = this.f41446a1;
            if (kkVar == null || kkVar.getVisibility() != 0) {
                org.telegram.ui.Components.q40 q40Var = org.telegram.ui.Components.q40.f29794n;
                if (q40Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f20350id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        q40Var.b();
                        ei.x3 x3Var = new ei.x3(getParentActivity(), 3);
                        this.K1 = x3Var;
                        x3Var.i(true);
                        this.K1.p(true);
                        ei.x3 x3Var2 = this.K1;
                        x3Var2.K = Layout.Alignment.ALIGN_CENTER;
                        x3Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(j10, this.K1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.K1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        ei.x3 x3Var3 = this.K1;
                        x3Var3.h = ei.x3.a(x3Var3.getText(), this.K1.getTextPaint());
                        ei.x3 x3Var4 = this.K1;
                        x3Var4.d = -1L;
                        x3Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new kg(this, 28), 300L);
                    }
                }
            }
        }
    }

    public final void S7() {
        int i10;
        if (this.f41487d2 == null && getParentActivity() != null) {
            if (this.J2 == null) {
                N7();
            }
            org.telegram.ui.Components.v31 v31Var = new org.telegram.ui.Components.v31(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.f41487d2 = v31Var;
            v31Var.O = new ke(this, 5);
            eh.e o10 = fh.c.o(this.f41651qa);
            bh.b bVar = this.J;
            v31Var.setSideMenuBackgroundDrawable(bVar.c(v31Var, o10, false));
            org.telegram.ui.Components.v31 v31Var2 = this.f41487d2;
            v31Var2.setTopMenuBackgroundDrawable(bVar.c(v31Var2, fh.c.o(this.f41651qa), false));
            this.f41487d2.setCurrentTopic(d());
            this.f41487d2.setOnNewTopicSelected(new ke(this, 6));
            this.f41487d2.setOnTopicSelected(new we(this, 0));
            this.f41487d2.setOnDialogSelected(new we(this, 1));
            int indexOfChild = this.f41558j1.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.f41558j1.addView(this.f41487d2, i10, w7.z5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.f41487d2.p();
            yj yjVar = this.U1;
            if (yjVar != null) {
                yjVar.bringToFront();
            }
        }
    }

    public final long S8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.e) || !ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
            return 0L;
        }
        long j10 = this.f41635p4;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.B5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f41764z5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j10;
    }

    public final void S9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var == null) {
            return;
        }
        long j10 = messageObject.messageOwner.action.channel_id;
        if (h5Var.getFragmentStack().size() > 0) {
            o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            o2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.h5 h5Var2 = this.parentLayout;
        if (indexOf > 0 && !(o2Var instanceof sn) && !(o2Var instanceof ProfileActivity) && this.e.creator) {
            int size = h5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) h5Var2.getFragmentStack().get(indexOf);
                if (o2Var2 instanceof sn) {
                    ((ActionBarLayout) h5Var2).c(indexOf, new sn(si.o0.e(j10, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) h5Var2).c(indexOf, new ProfileActivity(si.o0.e(j10, "chat_id"), null));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ko) {
                    ((ActionBarLayout) h5Var2).c(indexOf, new ko(si.o0.e(j10, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof jr) {
                    if (((jr) o2Var2).f38628e1 == 0) {
                        Bundle arguments = o2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) h5Var2).c(indexOf, new jr(arguments));
                    }
                    o2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(this, o2Var, messageObject, h5Var2, 9));
        }
        AndroidUtilities.runOnUIThread(new je(this, j10, 1), 1000L);
    }

    public final void Sa() {
        org.telegram.ui.Components.wc0 i10;
        qn qnVar = this.f41651qa;
        if (qnVar != null) {
            Drawable l4 = qnVar.l();
            if (this.fragmentView != null) {
                l4 = this.f41558j1.getBackgroundImage();
            }
            if (l4 instanceof vn) {
                l4 = ((vn) l4).c(true);
            }
            if (l4 instanceof org.telegram.ui.Components.wc0) {
                ((org.telegram.ui.Components.wc0) l4).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.j5) && (i10 = ((org.telegram.ui.ActionBar.j5) themedDrawable).i()) != null) {
                i10.w(false);
            }
        }
    }

    public final void Sb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41651qa);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            c2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.r4(this, tL_game, messageObject, str, j10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(c2Var);
            return;
        }
        String publicUsername = UserObject.getPublicUsername(user);
        if (!AndroidUtilities.isTablet()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (user == null || TextUtils.isEmpty(publicUsername)) {
                        str2 = "";
                    } else {
                        str2 = publicUsername;
                    }
                    presentFragment(new ji1(str, str2, tL_game.title, tL_game.short_name, messageObject));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (user != null && publicUsername != null) {
            str3 = publicUsername;
        }
        ji1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Sc() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i12 = (a() > getUserConfig().getClientUserId() ? 1 : (a() == getUserConfig().getClientUserId() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f41551i6;
        if (i12 == 0) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i13 = 0; i13 < sparseArrayArr.length; i13++) {
                for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i13].valueAt(i14);
                    if (messageObject.hasValidGroupId()) {
                        MessageObject.GroupedMessages c92 = c9(messageObject);
                        if (c92 != null) {
                            groupedMessagePosition = c92.getPosition(messageObject);
                        } else {
                            groupedMessagePosition = null;
                        }
                        if (groupedMessagePosition != null) {
                            if (!groupedMessagePosition.last) {
                            }
                        }
                    }
                    arrayList.add(messageObject);
                }
            }
            wk wkVar = this.f41618nb;
            if (wkVar != null) {
                wkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f41618nb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                wk wkVar2 = this.f41618nb;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                wkVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new ke(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.fl0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.u0 k10 = this.actionBar.i(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.ak0 ak0Var = k10.f21903x;
                if (ak0Var != null && k10.f21904y != i10) {
                    k10.f21904y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(ak0Var, i10);
                }
            }
        }
        if (this.f41580ka != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i15));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i16));
            }
            this.f41580ka.setSelectedMessages(arrayList2);
        }
    }

    public final void T6() {
        ArrayList arrayList;
        int i10;
        if (this.f41483cb) {
            int i11 = -1;
            int i12 = 0;
            long j10 = 0;
            while (true) {
                arrayList = this.G6;
                if (i12 >= arrayList.size()) {
                    break;
                }
                long groupIdForUse = ((MessageObject) arrayList.get(i12)).getGroupIdForUse();
                if (j10 != groupIdForUse) {
                    if (i11 >= 0 && j10 != 0 && (i10 = i12 - i11) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < i10; i13++) {
                            arrayList2.add((MessageObject) arrayList.remove(i11));
                        }
                        Collections.sort(arrayList2, new org.telegram.ui.ActionBar.l4(10));
                        arrayList.addAll(i11, arrayList2);
                    }
                    i11 = i12;
                    j10 = groupIdForUse;
                }
                i12++;
            }
            if (i11 >= 0 && j10 != 0 && arrayList.size() - i11 > 1) {
                int size = arrayList.size() - i11;
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList3.add((MessageObject) arrayList.remove(i11));
                }
                arrayList.addAll(i11, arrayList3);
            }
        }
    }

    public final void T7() {
        if (this.K3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f41651qa);
            this.K3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.f41558j1.addView(this.K3, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int T8() {
        return this.f41558j1.getBackgroundSizeY();
    }

    public final void T9(boolean z10) {
        int i10;
        if (this.f41734x0 != null) {
            ArrayList arrayList = this.G6;
            if (!arrayList.isEmpty() && !this.Ia.f43687n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f41759z0.h1(i10, 0);
                this.f41734x0.B0();
            }
        }
    }

    public final void Ta() {
        boolean z10;
        MessageObject messageObject;
        CharSequence charSequence;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        kk kkVar;
        gk gkVar = this.Y;
        if (gkVar != null && gkVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f41575k5 && gkVar != null && (kkVar = this.f41446a1) != null && kkVar.getVisibility() != 0) {
            messageObject = this.f41764z5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.Y2;
        } else {
            z10 = true;
            messageObject = null;
            charSequence = null;
        }
        if (this.f41752y5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        MediaDataController mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            z11 = false;
        } else {
            z11 = true;
        }
        ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z11, false);
        long E7 = E7(messageObject);
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.f41516f6, E7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j11 = this.f41516f6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f41752y5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        in inVar = this.f41739x5;
        MessageSuggestionParams messageSuggestionParams = this.f41674s5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        gk gkVar2 = this.Y;
        if (gkVar2 != null) {
            j10 = gkVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.saveDraft(j11, E7, charSequence2, entities, message, inVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void Tb(boolean z10) {
        if (z10) {
            if (this.Pb == null) {
                ke keVar = new ke(this, 11);
                this.Pb = keVar;
                AndroidUtilities.runOnUIThread(keVar, 100L);
                return;
            }
            return;
        }
        ke keVar2 = this.Pb;
        if (keVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(keVar2);
        }
        this.Pb = null;
        this.Ob = false;
        Ec(true);
    }

    public final void Tc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        org.telegram.ui.Wallet.k3 k3Var;
        if (this.fragmentView != null && !this.C5) {
            int childCount = this.f41734x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f41734x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        MessageObject messageObject = v0Var.getMessageObject();
                        if (this.X7 != Integer.MAX_VALUE && messageObject != null && messageObject.getId() == this.X7 && v0Var.L()) {
                            org.telegram.ui.Wallet.m3 m3Var = v0Var.I0;
                            if (!m3Var.f34818h0 && (m3Var.f34813e0 == 0 || (k3Var = m3Var.f34812d0) == null || k3Var.c())) {
                                m3Var.e();
                                org.telegram.ui.Wallet.k3 k3Var2 = m3Var.f34812d0;
                                k3Var2.getClass();
                                k3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.k3 k3Var3 = m3Var.f34812d0;
                                k3Var3.f24685b = -1L;
                                k3Var3.f24686c = -1L;
                                m3Var.f34813e0 = SystemClock.elapsedRealtime();
                                m3Var.f34815f0 = false;
                                m3Var.f34806a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject2 = t1Var.getMessageObject();
                        if (this.F8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                            ImageReceiver photoImage = t1Var.getPhotoImage();
                            this.F8.setTranslationX(t1Var.getX() + photoImage.getImageX());
                            this.F8.setTranslationY((this.f41734x0.getY() + (photoImage.getImageY() + (t1Var.getY() + t1Var.getPaddingTop()))) - this.F8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F8.getLayoutParams();
                            if (messageObject2.isRoundVideo()) {
                                this.F8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(H9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(H9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(H9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.H8.setResizeMode(0);
                                    this.F8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(H9())) / AndroidUtilities.roundPlayingMessageSize(H9());
                                float imageWidth = t1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(H9());
                                if (this.F8.getScaleX() != imageWidth) {
                                    this.F8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.F8.setPivotX(0.0f);
                                this.F8.setPivotY(0.0f);
                                this.F8.setScaleX(imageWidth);
                                this.F8.setScaleY(imageWidth);
                                this.I8.setScaleX(roundPlayingMessageSize2);
                                this.I8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.F8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.H8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.F8.setLayoutParams(layoutParams);
                                }
                                this.I8.setScaleX(1.0f);
                                this.I8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.F8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.F8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.y3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.F8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(H9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.y3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                j(playingMessageObject.getId(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.J8) {
                        this.f41734x0.invalidate();
                    }
                }
            }
        }
    }

    public final void U6(boolean z10) {
        hg.n1 n1Var;
        if (this.f41448a4 == 2 && (n1Var = this.Y3) != null) {
            String str = this.G3;
            ei.bc bcVar = n1Var.E;
            if (!TextUtils.equals(n1Var.f12024x, str)) {
                String trim = str.trim();
                String str2 = null;
                if (trim.charAt(0) != '$' && trim.charAt(0) != '#') {
                    trim = null;
                } else {
                    int indexOf = trim.indexOf(64);
                    if (indexOf >= 0) {
                        String substring = trim.substring(0, indexOf);
                        str2 = trim.substring(indexOf + 1);
                        trim = substring;
                    }
                }
                AndroidUtilities.cancelRunOnUIThread(bcVar);
                ci.t6 t6Var = n1Var.f12025y;
                if (t6Var != null && t6Var.I != 0) {
                    ConnectionsManager.getInstance(t6Var.f6190c).cancelRequest(t6Var.I, true);
                    t6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    n1Var.f12024x = str;
                    n1Var.f12025y = new ci.t6(n1Var.f12021r, str2, trim);
                    if (z10) {
                        bcVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(bcVar, 1000L);
                    }
                }
                ci.t6 t6Var2 = n1Var.f12025y;
                if (t6Var2 != null && t6Var2.J > 0) {
                    n1Var.l();
                }
            }
        }
    }

    public final ArrayList U7(MessageObject messageObject, boolean z10) {
        ArrayList k10 = org.telegram.messenger.v0.k(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.G6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.X6 || messageObject.getDialogId() == this.X6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    k10.add(messageObject2);
                }
            }
        }
        return k10;
    }

    public final float U8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.f41558j1.getBackgroundTranslationY()) - ((1.0f - this.J9) * this.E9);
    }

    public final boolean U9() {
        gk gkVar = this.Y;
        boolean z10 = gkVar.f24200z2;
        if (z10) {
            gkVar.p1();
            this.P3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Ua() {
        org.telegram.ui.Cells.t1 t1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f41734x0.getChildCount(); i11++) {
            View childAt = this.f41734x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                int min = Math.min(t1Var2.getBottom(), this.f41734x0.getHeight()) - Math.max(0, t1Var2.getTop());
                if (min > i10) {
                    t1Var = t1Var2;
                    i10 = min;
                }
            }
        }
        if (t1Var != null) {
            qj qjVar = this.f41759z0;
            this.f41734x0.getClass();
            qjVar.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) this.E9), false);
        }
    }

    public final void Ub(boolean z10) {
        float f7;
        int i10;
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupNotifyPeriod * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                if (z10) {
                    f7 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupUpload;
                } else {
                    f7 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupDownload;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.i61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this);
                    int i12 = R.raw.speed_limit;
                    if (z10) {
                        i10 = R.string.UploadSpeedLimited;
                    } else {
                        i10 = R.string.DownloadSpeedLimited;
                    }
                    String string = LocaleController.getString(i10);
                    if (z10) {
                        i11 = R.string.UploadSpeedLimitedMessage;
                    } else {
                        i11 = R.string.DownloadSpeedLimitedMessage;
                    }
                    org.telegram.ui.Components.oc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new ff(this, z10, 0)), spannableString), i12);
                    M.f29203j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void Uc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        hj hjVar = this.f41594m1;
        if (hjVar == null) {
            return;
        }
        int i10 = this.f41489d4;
        if (i10 == 8 && (chat2 = this.e) != null) {
            if (this.f41514f4) {
                String i11 = og.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.e;
                hjVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f41635p4 > 0L ? 1 : (this.f41635p4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.e;
                        }
                        this.f41594m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        hj hjVar2 = this.f41594m1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.e;
                        hjVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f41635p4));
                    this.f41594m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f41635p4));
                    if (chat7 == null) {
                        chat7 = this.e;
                    }
                    this.f41594m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                hj hjVar3 = this.f41594m1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.e.title));
                TLRPC.Chat chat8 = this.e;
                hjVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            hjVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.f41476c4)) {
                this.f41594m1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.f41476c4)) {
                this.f41594m1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f41594m1.setTitle(this.f41476c4);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.f41462b4.title)) {
                this.f41594m1.setTitle(this.f41462b4.title);
            } else {
                this.f41594m1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j10 = this.f41635p4;
                if (j10 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f41594m1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f41594m1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f41594m1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f41594m1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f41594m1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f41594m1.setTitle("");
                }
            } else if (K9() && !UserObject.isBotForum(this.f41509f)) {
                if (this.f41686t4) {
                    Zc();
                } else if (this.f41673s4) {
                    if (this.f41561j4.hasReplies()) {
                        this.f41594m1.setTitle(LocaleController.formatPluralString("Comments", this.f41561j4.getRepliesCount(), new Object[0]));
                    } else {
                        this.f41594m1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f41594m1.setTitle(LocaleController.formatPluralString("Replies", this.f41561j4.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f41509f)) {
                this.f41594m1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f41509f)) {
                this.f41594m1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.f41489d4;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f41509f)) {
                        this.f41594m1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f41594m1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f41594m1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", L8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.e;
                    if (chat9 != null) {
                        hj hjVar4 = this.f41594m1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.e;
                        hjVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f41509f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f41594m1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f41509f.f20491id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f41509f.phone)) {
                                    hj hjVar5 = this.f41594m1;
                                    String h = org.telegram.messenger.tl.h(new StringBuilder("+"), this.f41509f.phone, jf.b.c());
                                    TLRPC.User user4 = this.f41509f;
                                    hjVar5.h(h, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f41509f), this.f41509f.emoji_status, z10);
                                } else {
                                    hj hjVar6 = this.f41594m1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f41509f)));
                                    TLRPC.User user5 = this.f41509f;
                                    hjVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f41509f), this.f41509f.emoji_status, z10);
                                }
                            } else {
                                hj hjVar7 = this.f41594m1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f41509f)));
                                TLRPC.User user6 = this.f41509f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f41509f);
                                if (!MessagesController.isSupportUser(this.f41509f)) {
                                    emojiStatus = this.f41509f.emoji_status;
                                }
                                hjVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f41594m1.getTitleTextView().getText());
        Wc(false);
    }

    public final void V6() {
        this.S.d();
        Dc();
        nc();
        p7();
        m7();
        r7();
        q7();
        u7();
        u9();
        boolean z10 = true;
        if (this.v.f45157s == 1) {
            z10 = false;
        }
        if (this.f41555ib != z10) {
            this.f41555ib = z10;
            checkSystemBarColors();
        }
    }

    public final void V7(final int i10, final int i11, final boolean z10) {
        this.A0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.G6;
            if (i12 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            int i13 = messageObject.messageOwner.date;
            if (i13 <= i10 || i13 >= i11) {
                this.A0.M.add(messageObject);
            }
            i12++;
        }
        nj njVar = this.f41734x0;
        if (njVar != null) {
            njVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            Vb(true);
        }
        em emVar = this.A0;
        emVar.L = true;
        emVar.O(true);
        T7();
        UndoView undoView = this.K3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f41516f6, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                sn snVar = sn.this;
                MessagesController messagesController = snVar.getMessagesController();
                long j11 = snVar.f41516f6;
                if (ChatObject.isChannel(snVar.e)) {
                    j10 = snVar.f41516f6;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i10, i11, z10, new kg(snVar, 18));
            }
        }, new kf(this, 28));
    }

    public final float V8() {
        org.telegram.ui.Components.v31 v31Var = this.f41487d2;
        if (v31Var != null) {
            return v31Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Va(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Va(org.telegram.messenger.MessageObject):void");
    }

    public final void Vb(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f41673s4 && this.f41509f == null) {
                if (this.f41718vb == null) {
                    this.f41718vb = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f41718vb.booleanValue()) {
                    this.f41705ub = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.f41450a6 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f41705ub) {
                    return;
                }
                this.f41705ub = z10;
                if (z10) {
                    if (this.P.getVisibility() != 0) {
                        this.P.setVisibility(0);
                        this.P.setAlpha(0.0f);
                        this.P.setScaleX(0.3f);
                        this.P.setScaleY(0.3f);
                    }
                    this.P.animate().setListener(null).cancel();
                    this.P.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.P.animate().setListener(null).cancel();
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new oi(this, 3)).start();
                return;
            }
            this.f41705ub = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Vc() {
        Wc(false);
    }

    public final void W6() {
        TLRPC.Chat chat;
        long j10 = getArguments().getInt("search_from_user_id", 0);
        if (j10 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                qa("");
                ImageView imageView = this.f41513f3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                db(null, user);
                return;
            }
            return;
        }
        long j11 = getArguments().getInt("search_from_chat_id", 0);
        if (j11 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j11))) != null) {
            qa("");
            ImageView imageView2 = this.f41513f3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            db(chat, null);
        }
    }

    public final void W7(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.t1 t1Var2;
        CharacterStyle characterStyle2;
        MessageObject messageObject2;
        int i10;
        String str2;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.h80 I = org.telegram.ui.Components.h80.I(this, t1Var);
        org.telegram.ui.Components.bn0 bn0Var = new org.telegram.ui.Components.bn0(getParentActivity(), this.f41651qa);
        I.f26924p = new qe(bn0Var, 0);
        if (!str.startsWith("video?") && !pf.d.e(Uri.parse(str), false, null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean isWebBrowserOpenInApp = getMessagesController().isWebBrowserOpenInApp(str);
        if (isWebBrowserOpenInApp && z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!str.startsWith("#") && !str.startsWith("$")) {
            z12 = false;
        } else {
            z12 = true;
        }
        boolean startsWith = str.startsWith("mailto:");
        if (!startsWith) {
            if (z11 && !z12) {
                i11 = R.drawable.menu_website;
            } else {
                i11 = R.drawable.msg_openin;
            }
            if (z11 && !z12) {
                i12 = R.string.OpenInTelegramBrowser2;
            } else {
                i12 = R.string.Open;
            }
            String string = LocaleController.getString(i12);
            int i13 = i11;
            z15 = z10;
            ai.r2 r2Var = new ai.r2(this, str, characterStyle, messageObject, t1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            t1Var2 = t1Var;
            I.c(i13, string, r2Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            t1Var2 = t1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new re(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new re(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new se(this, messageObject2, 0), false);
        } else {
            messageObject2 = messageObject;
        }
        int i14 = R.drawable.msg_copy;
        if (z14) {
            i10 = R.string.CopyHashtag;
        } else if (startsWith) {
            i10 = R.string.CopyMail;
        } else {
            i10 = R.string.CopyLink;
        }
        I.c(i14, LocaleController.getString(i10), new ai.x9(this, str, messageObject2, startsWith, 10), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new re(this, str, 2), false);
        }
        bn0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            bn0Var.f(t1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.r61) {
            String url = ((org.telegram.ui.Components.r61) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = pf.d.u(parse, null, null, pf.d.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
                }
                str2 = URLDecoder.decode(url.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e7) {
                FileLog.e(e7);
                str2 = url;
            }
            if (str2.length() > 204) {
                str2 = str2.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            bn0Var.f(t1Var2, characterStyle2, spannableString2, false);
        } else {
            bn0Var.f(t1Var2, characterStyle2, null, false);
        }
        showDialog(bn0Var);
    }

    public final int W8() {
        return (int) (V8() * AndroidUtilities.dp(71.0f));
    }

    public final void Wa(long j10) {
        qj qjVar;
        MessageObject messageObject;
        int Q8;
        int abs;
        nj njVar = this.f41734x0;
        int i10 = -1;
        if (njVar != null && (qjVar = this.f41759z0) != null && qjVar.f46339y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f41734x0.getChildAt(childCount);
                this.f41734x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((Q8 = Q8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = Q8;
                    i12 = abs;
                }
            }
            this.f41766z7 = i10;
            this.A7 = i11;
            return;
        }
        this.f41766z7 = -1;
    }

    public final void Wb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new pe(this, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20679a);
    }

    public final void Wc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.s0 s0Var;
        if (this.f41594m1 != null) {
            int i10 = this.f41489d4;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.f41516f6, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                this.O0 = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f41509f)) {
                    if (!UserObject.isReplyUser(this.f41509f) && ((!K9() || this.f41686t4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    int i11 = org.telegram.ui.ActionBar.k6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.SRC_IN));
                    this.O0 = mutate;
                    this.L0 = getThemedColor(i11);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.f41594m1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f41509f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f41594m1.c(DialogObject.getBotVerificationIcon(this.f41509f));
                        }
                    }
                }
                this.f41594m1.j(drawable, mutate);
                if (!z10 && (s0Var = this.f41643q1) != null) {
                    if (isDialogMuted) {
                        if (s0Var.f21832m != 8) {
                            s0Var.f21832m = 8;
                            View view = s0Var.f21829j;
                            if (view instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view).getRightIcon().setVisibility(s0Var.f21832m);
                            }
                        }
                        this.f41643q1.d(LocaleController.getString(R.string.Unmute));
                        this.f41643q1.b(R.drawable.msg_mute);
                    } else {
                        if (s0Var.f21832m != 0) {
                            s0Var.f21832m = 0;
                            View view2 = s0Var.f21829j;
                            if (view2 instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view2).getRightIcon().setVisibility(s0Var.f21832m);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.f41516f6, d())) {
                            this.f41643q1.d(LocaleController.getString(R.string.Mute));
                            this.f41643q1.b(R.drawable.msg_unmute);
                        } else {
                            this.f41643q1.d(LocaleController.getString(R.string.Mute));
                            this.f41643q1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.xo xoVar = this.f41696u1;
                if (xoVar != null) {
                    xoVar.e(this.f41516f6, d(), null);
                }
            }
        }
    }

    public final void X6() {
        MessageObject messageObject;
        if (!this.P4 && (messageObject = this.V7) != null) {
            if (this.G6.indexOf(messageObject) >= 0) {
                this.Q4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.O4 != null) {
        } else {
            kf kfVar = new kf(this, 22);
            this.O4 = kfVar;
            AndroidUtilities.runOnUIThread(kfVar);
        }
    }

    public final void X7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.t1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.X7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1):void");
    }

    public final int X8(int i10) {
        SparseIntArray sparseIntArray = this.f41539h5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Xc;
            Xc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void X9() {
        M6(this.f41459b1, 5, true);
        M6(this.Y, 1, false);
        M6(this.f41488d3, 4, true);
        M6(this.f41446a1, 3, false);
        M6(this.R, 2, false);
        float f7 = this.Kc.e;
        j6.l lVar = this.Pc;
        float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, f7, 1.0f - ((float[]) lVar.f14334b)[5], 1.0f);
        kh.c cVar = this.f41459b1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(D);
        }
        gk gkVar = this.Y;
        if (gkVar != null) {
            gkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        jk jkVar = this.f41488d3;
        if (jkVar != null) {
            jkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        kk kkVar = this.f41446a1;
        if (kkVar != null) {
            kkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        jk jkVar2 = this.R;
        if (jkVar2 != null) {
            jkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        ih.f fVar = this.S;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - D) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        kk kkVar2 = this.f41446a1;
        ne.b bVar = this.Ic;
        if (kkVar2 != null) {
            kkVar2.setTotalVisibilityFactor((1.0f - bVar.e) * ((float[]) lVar.f14334b)[3]);
        }
        np npVar = this.f41468ba;
        if (npVar != null) {
            float f10 = bVar.e;
            if (npVar.S != f10) {
                npVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        t7();
    }

    public final void Xa() {
        int i10;
        int i11;
        nj njVar = this.f41734x0;
        if (njVar != null && this.f41759z0 != null) {
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f41734x0.getChildAt(childCount);
                this.f41734x0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i10 = Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f41759z0.h1(i11, i10);
        }
    }

    public final void Xb() {
        String str;
        if (this.Tb != null) {
            return;
        }
        if (this.f41764z5 != null) {
            str = getMessagesController().getFullName(this.f41764z5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new pe(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(this, 18));
        c2Var.setOnDismissListener(new oe(this, 8));
        this.Tb = alertDialog$Builder.p();
    }

    public final void Xc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Xc(boolean):void");
    }

    public final void Y6(boolean z10) {
        if (this.f41764z5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.G6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f41764z5.getId() && messageObject.getDialogId() == this.f41764z5.getDialogId()) {
                        this.f41764z5 = messageObject;
                        in inVar = this.f41739x5;
                        if (inVar != null) {
                            inVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f41660r5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f41764z5;
                                MessageObject.GroupedMessages groupedMessages = this.f41712v5;
                                if (groupedMessages == null) {
                                    groupedMessages = D8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.f41516f6, this.f41739x5);
                            }
                            m8();
                            return;
                        }
                        return;
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public final void Y7(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, String str) {
        qi P9 = P9(t1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(jf.b.d(str, false));
        ai.f3 f3Var = new ai.f3(this, t1Var, str, tL_contact, characterStyle, 3);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                f3Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new s1(this, tL_contact, f3Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = jf.b.d(str, false);
        P9.f44706b = new bf(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ca(this, P9, f3Var, 3)), 0);
        P9.d();
    }

    public final int Y8(int i10) {
        SparseIntArray sparseIntArray = this.f41526g5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Xc;
            Xc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void Y9(boolean z10, boolean z11) {
        if (this.P3) {
            AndroidUtilities.runOnUIThread(new ke(this, 20), 200L);
            if (z11) {
                this.P3 = false;
            }
        }
        if (z10 && !this.f41469bb) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int Ya(org.telegram.messenger.MessageObject r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Ya(org.telegram.messenger.MessageObject):int");
    }

    public final void Yb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.p40 p40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((p40Var = this.f41750y2) != null && p40Var.getVisibility() == 0)) {
                this.f41750y2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f41750y2.f(view, true);
                }
            }
        }
    }

    public final void Yc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.s0 s0Var = this.f41682t0;
        if (s0Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f41624o4) && (tL_forumTopic = this.f41624o4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s0Var.e(i10);
        }
    }

    public final void Z6() {
        kk kkVar;
        jk jkVar;
        jk jkVar2;
        gk gkVar = this.Y;
        if (gkVar != null && gkVar.f24201z3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((kkVar = this.f41446a1) == null || kkVar.getVisibility() != 0) && (((jkVar = this.R) == null || jkVar.getVisibility() != 0) && ((jkVar2 = this.f41488d3) == null || jkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void Z7(org.telegram.ui.Cells.z r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Z7(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final long Z8() {
        return this.f41635p4;
    }

    public final void Z9() {
        this.P4 = true;
        lm lmVar = this.f41629o9;
        AndroidUtilities.cancelRunOnUIThread(lmVar.f22163f0);
        lmVar.f22189z = false;
        ke keVar = new ke(this, 8);
        int i10 = this.P7;
        if (i10 != 0) {
            bb(i10, 0, false, this.O7, true, 0, null, null, keVar);
            return;
        }
        int i11 = this.N7;
        if (i11 > 0) {
            bb(i11, 0, true, this.O7, true, 0, null, null, keVar);
            return;
        }
        ab(!this.ob, keVar);
        this.ob = false;
        if (!this.T4.isEmpty()) {
            this.f41449a5 = true;
            this.Z4 = ((Integer) this.T4.get(0)).intValue();
        }
    }

    public final void Za() {
        ab(false, null);
    }

    public final void Zb(MessageSuggestionParams messageSuggestionParams) {
        if (this.B5 == null) {
            return;
        }
        new ai.h1(getParentActivity(), this.currentAccount, this.f41516f6, messageSuggestionParams, this, getResourceProvider(), 0, new xe(this, 0)).show();
    }

    public final void Zc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        hj hjVar = this.f41594m1;
        if (hjVar != null && (tL_forumTopic = this.f41624o4) != null) {
            hjVar.setTitle(tL_forumTopic.title);
        }
        ad();
    }

    public long a() {
        return this.f41516f6;
    }

    public final boolean a7(boolean z10, boolean z11) {
        gk gkVar = this.Y;
        if (gkVar == null || !gkVar.s0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41651qa);
            if (this.Y.f24067c1) {
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new ci.f(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f20679a);
            return true;
        }
        return true;
    }

    public final void a8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.a8(int, java.lang.Object[]):void");
    }

    public final float a9(float f7) {
        sn snVar = this.f41639pa;
        if (snVar == null) {
            snVar = this;
        }
        org.telegram.ui.Components.ah ahVar = snVar.Y0;
        if (ahVar == null) {
            return 0.0f;
        }
        return ahVar.c(f7);
    }

    public final void ab(boolean z10, ke keVar) {
        ArrayList arrayList;
        int i10;
        if (this.f41734x0.V1) {
            return;
        }
        this.Z4 = 0;
        this.Db = 0;
        this.f41449a5 = false;
        this.f41554i9.e(0);
        if (this.Q6[0] && this.T7 == 0 && this.G7 == 0) {
            this.f41708v1.d(false);
            if (this.f41759z0.I0() == 0) {
                this.f41678s9 = false;
                Cc();
                Ma();
                dd(false);
                return;
            }
            this.A0.T();
            en enVar = this.Ya;
            enVar.f36953a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.G6;
                if (i11 >= arrayList.size() || !((MessageObject) arrayList.get(i11)).isSponsored()) {
                    break;
                }
                i11++;
                z10 = false;
            }
            if (z10 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i11) != null) {
                long groupId = ((MessageObject) arrayList.get(i11)).getGroupId();
                while (groupId != 0 && (i10 = i11 + 1) < arrayList.size() && groupId == ((MessageObject) arrayList.get(i10)).getGroupId()) {
                    i11 = i10;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i11 = Math.min(i11, arrayList.size() - 1);
            }
            nk nkVar = this.f41554i9;
            enVar.f36954b = i11;
            enVar.d = 0;
            boolean z11 = !z10;
            enVar.f36955c = z11;
            nkVar.c(i11, 0, z11, true);
            this.f41678s9 = false;
            Cc();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.Cb;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        Ec(false);
        if (keVar != null) {
            keVar.run();
        } else {
            Qa();
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f41651qa);
            this.Cb = c2Var2;
            c2Var2.setOnCancelListener(this.f41757ya);
            this.Cb.r(1000L);
        }
        this.f41579k9 = this.f41540h6;
        this.f41602m9 = false;
        this.f41590l9 = 0;
        this.f41616n9 = false;
        ArrayList arrayList2 = this.f41688t6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f41540h6));
        AndroidUtilities.runOnUIThread(new kf(this, 13), 0L);
    }

    public final void ac(MessageObject messageObject) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().isPeerNoForwards(messageObject.getDialogId())) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || !message.noforwards) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                boolean z10 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = messageObject.messageText;
                    if (messageObject.textLayoutBlocks.size() > 1) {
                        z10 = true;
                    }
                } else {
                    charSequence = messageObject.caption;
                }
                if (!z10 && charSequence != null) {
                    z10 = true;
                }
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f41704u9 && this.f41716v9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f41704u9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f41691t9 == null) {
                        jl jlVar = new jl(getParentActivity(), this.f41651qa, this);
                        this.f41691t9 = jlVar;
                        this.f41558j1.addView(jlVar, w7.z5.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f41691t9.c();
                }
            }
        }
    }

    public final void ad() {
        hj hjVar;
        hj hjVar2;
        if (UserObject.isBotForum(this.f41509f) && (hjVar2 = this.f41594m1) != null) {
            hjVar2.getAvatarImageView().setVisibility(0);
            this.f41594m1.b();
        } else if (this.f41624o4 != null && (hjVar = this.f41594m1) != null) {
            hjVar.getAvatarImageView().setVisibility(0);
            og.d.p(this.f41594m1.getAvatarImageView(), this.f41624o4, true, true, this.f41651qa);
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21563xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21421q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21272i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21255h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21188da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21391oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21371na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21351ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21332la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21315ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21295ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21334lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21411pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21298jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21279id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21589z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.De));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21489tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21525ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21208ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21481t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21537w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21134af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21300jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21153be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21154bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21520v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21503u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21424q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21390o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21314k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21350m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21276i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21294j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21128a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21560xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21241ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21223fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21204ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21429qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21468se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21449re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21523vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21299je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21505uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21280ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21130ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21595zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21578yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21594zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21524vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21561xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21542wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21506ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21522vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21487td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21504ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21485tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21448rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21352mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21333lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21428qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21410pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21372nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21408pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21354md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21335ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21392od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21466sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21374nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21318kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21446rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21426qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21261hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21244gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21260hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21242gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21172cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21152bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21224fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21132ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21205eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Za));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ya));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21541wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21425qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21442r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Va));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ua));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21486tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21467sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21206ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21353mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21317kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21297jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21189dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21445ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21389o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21369n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21349m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21330l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21313k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21293j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21275i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21409pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21482t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21407pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21463s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f21519v8));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.f41516f6, this.f41764z5, this.f41561j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = H8();
        of2.payStars = j10;
        of2.monoForumPeer = S8();
        of2.suggestionParams = this.f41674s5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.f41489d4 == 0) {
            T9(false);
        }
        if (i10 == 0 || i10 == 1) {
            B6();
        }
        if (this.C5) {
            this.f41478c6 = true;
        }
    }

    public final void b7() {
        if (!this.fc) {
            this.fc = true;
            if (!this.f41533gc && this.f41489d4 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.H1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.H1.u();
                    this.f41533gc = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.I1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.I1.u();
                    this.f41533gc = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    c7();
                }
            }
        }
    }

    public final void b8(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.b8(int, java.lang.Object[]):void");
    }

    public final float b9(org.telegram.ui.Components.r31 r31Var) {
        float f7;
        org.telegram.ui.Components.v31 v31Var = this.f41487d2;
        if (v31Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float k10 = v31Var.k(r31Var);
            if (r31Var == org.telegram.ui.Components.r31.f30057b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * k10;
        }
        return 0.0f;
    }

    public final void ba(long j10, String str, boolean z10) {
        ca();
        ci.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.V1(j10, str, z10, false);
        }
    }

    public final void bb(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void bc(boolean z10, boolean z11) {
        gk gkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.E2 != null) && this.f41489d4 == 0 && (gkVar = this.Y) != null && gkVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.E2 == null) {
                    km kmVar = this.f41558j1;
                    int indexOfChild = kmVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(9, getParentActivity(), this.f41651qa, false);
                        this.E2 = p40Var;
                        kmVar.addView(p40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.E2.b(true);
                    return;
                }
                if (this.Y.f24080e2) {
                    org.telegram.ui.Components.p40 p40Var2 = this.E2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    p40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.E2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.E2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void bd() {
        int i10;
        org.telegram.ui.ActionBar.s0 s0Var = this.f41583l0;
        if (s0Var == null) {
            return;
        }
        if (getMessagesController().getTranslateController().isTranslateDialogHidden(a()) && getMessagesController().getTranslateController().isDialogTranslatable(a())) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        s0Var.e(i10);
    }

    @Override
    public final boolean c() {
        if (this.f41489d4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        org.telegram.ui.Cells.t1 t1Var;
        ei.x3 x3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        ei.x3 x3Var2 = this.J1;
        if (x3Var2 != null && !x3Var2.V && !this.f41556ic && this.fc && !this.Mc.f17447f && System.currentTimeMillis() - this.hc > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f41734x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f41734x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        ah.j1 j1Var = t1Var.N;
                        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !j1Var.v.isEmpty()) {
                            t1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + j1Var.d;
                            if (f7 >= AndroidUtilities.dp(240.0f) && f7 <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    t1Var = null;
                    break;
                }
            }
            if (t1Var != null) {
                ah.j1 j1Var2 = t1Var.N;
                this.f41556ic = true;
                t1Var.getLocationInWindow(iArr);
                this.J1.setTranslationY(((iArr[1] - x3Var.getTop()) - AndroidUtilities.dp(120.0f)) + j1Var2.d);
                this.J1.m(0.0f, (((ah.g1) j1Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + j1Var2.f794c);
                this.J1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ke(this, 19));
            AndroidUtilities.runOnUIThread(new ke(this, 19), 2000L);
        }
    }

    public final void c8(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.c8(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages c9(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.J6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void ca() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            gk gkVar = this.Y;
            if (gkVar == null || TextUtils.isEmpty(gkVar.getSlowModeTimer())) {
                gk gkVar2 = this.Y;
                if (gkVar2 != null && gkVar2.f24129m5.f17447f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H7();
                ci.a3 a3Var = this.V1;
                if (!z10 && this.f41489d4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                a3Var.U1 = z11;
                a3Var.f30158j0.f0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.f41674s5 == null) && !z10 && this.f41489d4 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        this.V1.R1(10, true);
                    } else {
                        this.V1.R1(-1, true);
                    }
                } else {
                    this.V1.R1(1, true);
                }
                ci.a3 a3Var2 = this.V1;
                a3Var2.V0 = true;
                a3Var2.A1.setVisibility(0);
                a3Var2.T0 = 0;
                a3Var2.F = false;
                a3Var2.G = false;
                a3Var2.f30155i0 = true;
                a3Var2.J = null;
                org.telegram.ui.ActionBar.u0 u0Var = a3Var2.f30170n1;
                if (u0Var != null) {
                    a3Var2.f30166m1.setTranslationY(0.0f);
                    u0Var.setVisibility(8);
                }
                this.V1.w1();
                this.V1.r1().setText(this.Y.getFieldText());
                ci.a3 a3Var3 = this.V1;
                a3Var3.f30181r = this.f41651qa;
                showDialog(a3Var3);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ie ieVar;
        if ((this.f41489d4 != 5 || (!this.G6.isEmpty() && this.f41635p4 != 0)) && !this.Mc.f17447f && this.f41768z9) {
            gk gkVar = this.Y;
            if (!gkVar.F2) {
                if (!gkVar.f24067c1 || (ieVar = gkVar.f24079e1) == null || ieVar.getVisibility() != 0) {
                    if ((!gkVar.g0() || !gkVar.f24121l0.v) && !org.telegram.ui.ActionBar.o2.hasSheets(gkVar.P2) && this.Z9 == 0.0f) {
                        vh.i iVar = this.f41567ja;
                        if (iVar == null || !iVar.a()) {
                            return true;
                        }
                        return false;
                    }
                    return false;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void cb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.cb(java.lang.CharSequence, boolean):void");
    }

    public final boolean cc(MessageObject messageObject) {
        if (this.f41489d4 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void cd(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        nj njVar = this.f41734x0;
        if (njVar != null) {
            if (!this.P4 && this.V7 != null) {
                int childCount = njVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f41734x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.V7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.G6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.V7) + this.A0.J;
                                i11 = Q8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f41734x0.getChildCount();
            gk gkVar = this.Y;
            if (gkVar != null) {
                gkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f41734x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                    MessageObject messageObject3 = t1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        t1Var.W3(messageObject3, t1Var.getCurrentMessagesGroup(), t1Var.l3(), t1Var.m3(), t1Var.g3(), t1Var.i3());
                        em emVar = this.A0;
                        this.f41734x0.getClass();
                        emVar.Q(RecyclerView.R(t1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f41759z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f41686t4 && (i10 = this.f41489d4) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f41635p4;
    }

    public final void d7(boolean z10) {
        int i10;
        if (this.f41759z0 != null && !this.C5 && !this.A0.L && !this.f41662r7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f41734x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f41734x0.getChildAt(i14));
                if (R != -1) {
                    if (i13 == -1 || R < i13) {
                        i13 = R;
                    }
                    if (i12 == -1 || R > i12) {
                        i12 = R;
                    }
                    i11++;
                }
            }
            em emVar = this.A0;
            if (emVar.N) {
                int i15 = emVar.E;
                if (i15 >= 0 && i13 >= 0 && i15 >= i13 && i15 <= i12) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = emVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            int i16 = i10;
            if (this.f41489d4 == 7) {
                if ((h - i13) - i11 <= i16 && !this.S6 && !this.O6[0]) {
                    this.S6 = true;
                    this.f41688t6.add(Integer.valueOf(this.f41540h6));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.G3;
                    int i17 = this.classGuid;
                    int i18 = this.f41448a4;
                    int i19 = this.f41540h6;
                    this.f41540h6 = i19 + 1;
                    hashtagSearchController.searchHashtag(str, i17, i18, i19);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.hf(this, h, i13, i11, i16, 1));
        }
    }

    public final void d8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.d8(int, java.lang.Object[]):void");
    }

    public final void d9(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.f41489d4 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.H3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.f41448a4);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j10 = this.f41516f6;
        long j11 = this.X6;
        int i14 = this.classGuid;
        boolean z11 = this.f41483cb;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j10, j11, i14, i10, this.f41635p4, this.A3, this.B3, this.C3);
        Rb(false);
    }

    public final void da() {
        ht.o().T = null;
        if (getParentActivity() == null) {
            return;
        }
        H7();
        this.V1.f30158j0.f0();
        this.V1.R1(1, false);
        ci.a3 a3Var = this.V1;
        a3Var.X1 = true;
        a3Var.n1(null);
        this.V1.w1();
        ci.a3 a3Var2 = this.V1;
        a3Var2.f30181r = this.f41651qa;
        if (this.visibleDialog != null) {
            a3Var2.show();
        } else {
            showDialog(a3Var2);
        }
    }

    public final void db(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.A3 = user;
        this.B3 = chat;
        if (this.f41557j0 != null && this.U1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.A3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f41762z3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a1.g.D(string, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.k10(org.telegram.ui.ActionBar.k6.B8, getResourceProvider()), string.length() + 1, spannableString.length(), 33);
                    this.f41557j0.setSearchFieldCaption(spannableString);
                    this.U1.getAdapter().U(null, 0, null, false, true);
                    this.f41557j0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f41557j0;
                    u0Var.f21894r = null;
                    ei.e2 e2Var = u0Var.e;
                    if (e2Var != null) {
                        e2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.F3 = "";
                    mediaDataController.searchMessagesInChat("", this.f41516f6, this.X6, this.classGuid, 0, this.f41635p4, this.A3, this.B3, this.C3);
                }
            }
        }
    }

    public final void dc(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            ah.f0 f0Var = this.f41580ka;
            if (f0Var != null && f0Var.d()) {
                this.f41580ka.setHiddenByScroll(true);
            }
            if (this.f41557j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21069n0) {
                    kVar.g(true);
                    this.Y.b1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ki.d2 d2Var = new ki.d2(richMessage);
                d2Var.J = this;
                d2Var.f15275r = messageObject;
                presentFragment(d2Var);
                return;
            }
            this.U1.getAdapter().f11954f0 = false;
            this.Y.setVisibility(0);
            Eb(true, null, messageObject, null, null, null, false);
            oc(false);
            if (!z10) {
                Q6();
            }
            if (z10) {
                this.f41674s5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.S0(false, false, true);
            Fc(0, true);
            dd(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.f41489d4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.f41516f6);
                tL_messages_getMessageEditData.f20436id = messageObject.getId();
                this.A5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new ne(this, 3));
                return;
            }
            gk gkVar = this.Y;
            org.telegram.ui.Components.ve veVar = gkVar.F1;
            if (veVar != null) {
                veVar.setEnabled(true);
                gkVar.F1.h(false);
            }
        }
    }

    public final void dd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.dd(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.h5 h5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        TLRPC.User user;
        boolean z10;
        hj hjVar;
        gk gkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.gu editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.sy0 sy0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        gk gkVar2;
        sn snVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            snVar.f8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            nj njVar = snVar.f41734x0;
            if (njVar != null) {
                njVar.g1();
            }
            org.telegram.ui.Components.qi qiVar = snVar.Y9;
            if (qiVar != null) {
                qiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            int i13 = 0;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == snVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        snVar.finishFragment();
                        b.b(snVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ci.a3 a3Var = snVar.V1;
                if (a3Var != null && a3Var.isShowing()) {
                    snVar.V1.dismiss(true);
                }
                if (z11 && (gkVar2 = snVar.Y) != null && gkVar2.q0()) {
                    snVar.Y.j0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f20364id = stickerSet2.f20371id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = snVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.sy0) && (tL_messages_stickerSet = (sy0Var = (org.telegram.ui.Components.sy0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f20371id == stickerSet2.f20371id) {
                            sy0Var.F0((TLRPC.TL_messages_stickerSet) objArr[1]);
                            if (objArr.length > 2) {
                                Object obj3 = objArr[2];
                                if (obj3 instanceof TLRPC.Document) {
                                    TLRPC.Document document = (TLRPC.Document) obj3;
                                    if (objArr.length > 3) {
                                        Object obj4 = objArr[3];
                                        if (obj4 instanceof String) {
                                            document.localThumbPath = (String) obj4;
                                        }
                                    }
                                    org.telegram.ui.Components.vc vcVar = new org.telegram.ui.Components.vc(sy0Var.container, snVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.oc q6 = vcVar.q(document, LocaleController.formatString(i12, stickerSet2.title));
                                    q6.f29203j = 2750;
                                    q6.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.sy0 sy0Var2 = new org.telegram.ui.Components.sy0(snVar.getParentActivity(), snVar, tL_inputStickerSetID, null, snVar.Y, snVar.f41651qa);
                            final boolean z15 = z12;
                            snVar = this;
                            sy0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    sn.X0(sn.this, objArr, sy0Var2, z15, stickerSet2);
                                }
                            });
                            snVar.showDialog(sy0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                nj njVar2 = snVar.f41734x0;
                if (njVar2 != null) {
                    njVar2.g1();
                }
                TextView textView = snVar.f41475c3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i14 = 0; i14 < 2; i14++) {
                    org.telegram.ui.ActionBar.n5 n5Var = snVar.P2[i14];
                    if (n5Var != null) {
                        n5Var.invalidate();
                    }
                }
                yj yjVar = snVar.U1;
                if (yjVar != null) {
                    yjVar.getListView().g1();
                }
                ai.u1 u1Var = snVar.X3;
                if (u1Var != null) {
                    u1Var.g1();
                }
                UndoView undoView = snVar.K3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                gk gkVar3 = snVar.Y;
                if (gkVar3 != null && (editField = gkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                hn[] hnVarArr = snVar.Q2;
                hn hnVar = hnVarArr[0];
                if (hnVar != null) {
                    hnVar.invalidate();
                }
                hn hnVar2 = hnVarArr[1];
                if (hnVar2 != null) {
                    hnVar2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (snVar.f41589l8 != null && (chat = snVar.e) != null && chat.f20344id == l4.longValue()) {
                    snVar.f41589l8.online_count = ((Integer) objArr[1]).intValue();
                    hj hjVar2 = snVar.f41594m1;
                    if (hjVar2 != null) {
                        hjVar2.m();
                        snVar.f41594m1.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == snVar.f41516f6 && (gkVar = snVar.Y) != null) {
                    gkVar.N1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                gk gkVar4 = snVar.Y;
                if (gkVar4 != null) {
                    gkVar4.O1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (snVar.e != null) {
                        TLRPC.Chat chat2 = snVar.getMessagesController().getChat(Long.valueOf(snVar.e.f20344id));
                        if (chat2 != null) {
                            snVar.e = chat2;
                        }
                    } else if (snVar.f41509f != null && (user = snVar.getMessagesController().getUser(Long.valueOf(snVar.f41509f.f20491id))) != null) {
                        snVar.f41509f = user;
                    }
                    snVar.Uc(true);
                }
                if (!snVar.K9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (snVar.e != null && (hjVar = snVar.f41594m1) != null) {
                        hjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    snVar.q();
                    snVar.dd(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && snVar.e != null) {
                    snVar.D9();
                    TLRPC.Chat chat3 = snVar.getMessagesController().getChat(Long.valueOf(snVar.e.f20344id));
                    if (chat3 != null) {
                        snVar.e = chat3;
                        snVar.D9();
                        z10 = !snVar.K9();
                        snVar.oc(false);
                        gk gkVar5 = snVar.Y;
                        if (gkVar5 != null) {
                            gkVar5.Y0(snVar.currentAccount, snVar.f41516f6);
                        }
                        FlagSecureReason flagSecureReason = snVar.Q3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                hj hjVar3 = snVar.f41594m1;
                if (hjVar3 != null && z10) {
                    hjVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    snVar.Xc(true);
                }
                org.telegram.ui.ActionBar.u0 u0Var = snVar.f41534h0;
                if (u0Var != null) {
                    if (ChatObject.isChannel(snVar.e) && !ChatObject.isMonoForum(snVar.e)) {
                        long j11 = snVar.e.linked_monoforum_id;
                        if (j11 != 0 && ChatObject.canManageMonoForum(snVar.currentAccount, -j11)) {
                            z13 = true;
                        }
                    }
                    u0Var.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!snVar.f41469bb) {
                    if (longValue == snVar.f41516f6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i15 = snVar.f41489d4;
                        if (intValue2 != i15 && i15 != 3 && i15 != 8) {
                            if (i15 != 1 && intValue2 == 1 && !snVar.isPaused && LaunchActivity.U() == snVar && snVar.f41660r5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                snVar.oa(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !snVar.Ec && snVar.f41509f != null && snVar.a() != snVar.getUserConfig().getClientUserId() && (userFull = snVar.getMessagesController().getUserFull(snVar.f41509f.f20491id)) != null && userFull.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i13 >= size) {
                                        break;
                                    }
                                    MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                                    if (messageObject3.getId() > 0 && !messageObject3.isOut() && !messageObject3.isSponsored()) {
                                        snVar.Ec = true;
                                        snVar.getMessagesController().loadFullUser(snVar.f41509f, snVar.classGuid, true);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            snVar.Da(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(snVar.e) && !snVar.e.megagroup && (chatFull = snVar.f41589l8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            MessageObject messageObject4 = (MessageObject) arrayList.get(i16);
                            if (messageObject4.isReply()) {
                                snVar.H6.put(messageObject4.getId(), messageObject4);
                            }
                        }
                        snVar.z7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                snVar.N9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                snVar.w6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == snVar.f41516f6) {
                        snVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (h5Var = snVar.parentLayout) != null && h5Var.getFragmentStack().size() > 1) {
                    snVar.finishFragment();
                } else {
                    snVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == snVar.a() && (booleanValue2 || snVar.parentLayout.getLastFragment() != snVar)) {
                    if (snVar.parentLayout.getLastFragment() == snVar) {
                        snVar.finishFragment();
                    } else {
                        snVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i17 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = snVar.A6;
                if (i10 == i17) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = snVar.e;
                    if (chat4 != null && chat4.f20344id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (snVar.C5) {
                            qh qhVar = snVar.f41763z4;
                            if (qhVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(qhVar);
                                snVar.f41763z4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            qh qhVar2 = new qh(snVar, messageObject2, intValue3);
                            snVar.f41763z4 = qhVar2;
                            AndroidUtilities.runOnUIThread(qhVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = snVar.e;
                    if (chat5 != null && chat5.f20344id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = snVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(snVar.e, snVar.getMessagesController().getChatFull(snVar.e.f20344id)));
                            int size3 = messageObject.messageOwner.replies.recent_repliers.size();
                            int i18 = 0;
                            while (true) {
                                if (i18 >= size3) {
                                    break;
                                } else if (MessageObject.getPeerId(messageObject.messageOwner.replies.recent_repliers.get(i18)) == MessageObject.getPeerId(peer)) {
                                    messageObject.messageOwner.replies.recent_repliers.remove(i18);
                                    break;
                                } else {
                                    i18++;
                                }
                            }
                            messageObject.messageOwner.replies.recent_repliers.add(0, peer);
                        }
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i19 = NotificationCenter.threadMessagesRead;
                    if ((i10 == i19 || i10 == NotificationCenter.monoForumMessagesRead) && snVar.f41516f6 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i19) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = snVar.f41635p4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i20 = snVar.f41725w4;
                            ArrayList arrayList2 = snVar.G6;
                            if (intValue4 > i20) {
                                snVar.f41725w4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id3 = messageObject5.getId();
                                    if (!messageObject5.isOut() && id3 > 0 && id3 <= snVar.f41725w4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        em emVar = snVar.A0;
                                        if (emVar != null) {
                                            emVar.M(messageObject5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > snVar.f41738x4) {
                                snVar.f41738x4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i22 = 0; i22 < size5; i22++) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i22);
                                    int id4 = messageObject6.getId();
                                    if (messageObject6.isOut() && id4 > 0 && id4 <= snVar.f41738x4) {
                                        if (!messageObject6.isUnread()) {
                                            break;
                                        }
                                        messageObject6.setIsRead();
                                        em emVar2 = snVar.A0;
                                        if (emVar2 != null) {
                                            emVar2.R(messageObject6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        snVar.a8(i10, objArr);
        snVar.b8(i10, objArr);
        snVar.c8(i10, objArr);
        snVar.d8(i10, objArr);
        snVar.e8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ci.a3 a3Var = this.V1;
        if (a3Var != null && this.visibleDialog == a3Var) {
            a3Var.f30158j0.a0(false);
            this.V1.dismissInternal();
            this.V1.f30158j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.V1 && dialog != this.f41617na && !(dialog instanceof gi.d3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.D8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.D8 = true;
            org.telegram.ui.Components.d5.r0(getParentActivity(), this.currentAccount, new ke(this, 10), true, this.f41651qa);
        }
    }

    public final void e8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.e8(int, java.lang.Object[]):void");
    }

    public final void e9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.e9():void");
    }

    public final void ea(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.t1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.ea(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.t1, org.telegram.messenger.MessageObject):void");
    }

    public final void eb(View view, MessageObject messageObject, org.telegram.ui.Components.fl0 fl0Var, View view2, float f7, float f10, ah.i1 i1Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.z zVar;
        ai.q7 q7Var;
        int[] iArr;
        int[] iArr2;
        int i12;
        boolean z14;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && messageObject != null) {
            if (getMessagesController().isFrozen()) {
                b.b(this.currentAccount);
                return;
            }
            ArrayList<TLRPC.MessageReactor> arrayList = null;
            if (i1Var != null && i1Var.f781a) {
                D7(true);
                if (view == null) {
                    zVar = t8(messageObject.getId(), true);
                } else {
                    zVar = view;
                }
                String str2 = "";
                if (z11) {
                    if (zVar != null) {
                        try {
                            zVar.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    long j10 = -ai.aa.b(messageObject).f980a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
                        org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    ai.fa faVar = ai.ha.y(this.currentAccount, false).B;
                    if (faVar != null) {
                        faVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j11 = this.f41516f6;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    ai.me meVar = new ai.me(parentActivity, i15, j11, this, messageObject, arrayList2, z14, false, 0L, this.f41651qa);
                    messageObject.getId();
                    meVar.V = this;
                    meVar.W = zVar;
                    meVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -ai.aa.b(messageObject).f980a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j12);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j12));
                    org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                ai.fa d02 = ai.ha.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Dc == null) {
                        this.Dc = new ai.q7(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        q7Var = null;
                    } else {
                        if (this.Dc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.Dc);
                            layoutContainer.addView(this.Dc, w7.z5.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Dc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Dc.bringToFront();
                        }
                        q7Var = this.Dc;
                    }
                    q7Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    d02.f1319o = q7Var;
                    q7Var.I = false;
                    q7Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    q7Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (zVar instanceof org.telegram.ui.Cells.t1) {
                        i12 = ((org.telegram.ui.Cells.t1) zVar).V;
                    } else {
                        i12 = 0;
                    }
                    q7Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            ah.i1 i1Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new sg.y0((org.telegram.ui.ActionBar.o2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(i1Var) && (chat = this.e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.e, 26)) {
                org.telegram.messenger.v0.p(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.vc.a0(this), R.raw.e_hand_2, 36);
            } else {
                ah.d1.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(i1Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.h hVar = this.J6;
                if (hVar.f(groupId) != null) {
                    if (messageObject.shouldDrawReactionsInLayout()) {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                    MessageObject findMessageWithFlags = ((MessageObject.GroupedMessages) hVar.f(messageObject.getGroupId())).findMessageWithFlags(i11);
                    if (findMessageWithFlags != null) {
                        id2 = findMessageWithFlags.getId();
                    }
                }
                int i18 = id2;
                if (selectReaction) {
                    org.telegram.ui.Cells.z t82 = t8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && t82 != null && i1Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j13 = i1Var.f785g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(i1Var.f784f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.p5.f(this.currentAccount, j13);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.oc q6 = org.telegram.ui.Components.vc.a0(this).q(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            q6.f29203j = 5000;
                            q6.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (fl0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        ah.d1.d(this, fl0Var, t82, view2, f7, f10, i1Var, i19, i10);
                    }
                }
                if (selectReaction && i1Var != null && (str = i1Var.f784f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<ah.i1> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    i1Var2 = i1Var;
                }
                ni niVar = new ni(this, z13, z10, i18, selectReaction, fl0Var, f7, f10, i1Var, messageObject);
                this.f41641pc = niVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, i1Var2, z11, z12, this, niVar);
                if (z10 || z13) {
                    xc(messageObject, true);
                    this.f41641pc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f41641pc, 50L);
                }
            }
        }
    }

    public final void ec() {
        org.telegram.ui.Components.x00 x00Var = this.f41756y9;
        if (x00Var != null && !x00Var.f32468c) {
            x00Var.c(false);
            try {
                this.f41756y9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        gk gkVar = this.Y;
        if (gkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.f41516f6, (int) d());
            ne.b bVar = gkVar.f24124l5;
            ih.h hVar = gkVar.I0;
            boolean z14 = false;
            if (streamingSendButtonState != BotForumHelper.SteamingSendButtonState.NO_STREAMING) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (streamingSendButtonState == BotForumHelper.SteamingSendButtonState.STOP) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z10 && bVar.e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((ne.b) hVar.f13181c).a(z12, z13);
            hVar.setClickable(z12);
            hVar.setEnabled(z12);
            if (bVar.f17447f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            gkVar.T4 = streamingSendButtonState;
            if (z14) {
                gkVar.F(z10);
            }
        }
    }

    public final void f8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.f8(java.lang.Object[]):void");
    }

    public final boolean f9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f41551i6;
        for (int i10 = 0; i10 < sparseArrayArr.length; i10++) {
            try {
                for (int i11 = 0; i11 < sparseArrayArr[i10].size(); i11++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i10].valueAt(i11);
                    if (messageObject != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void fa(long j10, final MessageObject messageObject, int i10, final long j11, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f20344id + " msg_id = " + i13);
        }
        this.f41719vc = 0;
        this.f41732wc = false;
        this.yc = null;
        this.zc = null;
        nj njVar = this.f41734x0;
        if (njVar != null) {
            njVar.g1();
        }
        if (this.f41706uc != -1) {
            getConnectionsManager().cancelRequest(this.f41706uc, false);
        }
        if (this.f41694tc != -1) {
            getConnectionsManager().cancelRequest(this.f41694tc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f41719vc = i13;
        this.f41732wc = false;
        this.f41746xc = System.currentTimeMillis();
        nj njVar2 = this.f41734x0;
        if (njVar2 != null) {
            njVar2.g1();
        }
        final int i14 = this.f41667rc + 1;
        this.f41667rc = i14;
        this.f41694tc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                sn snVar = sn.this;
                AndroidUtilities.runOnUIThread(new h0(29, snVar, new Runnable(i14, i11, j11, tLObject, i12, messageObject2, tL_messages_getDiscussionMessage, chat, messageObject) {
                    public final int f36336b;
                    public final int f36337c;
                    public final TLObject d;
                    public final int e;
                    public final MessageObject f36338f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f36339n;
                    public final MessageObject f36340r;

                    {
                        this.d = tLObject;
                        this.e = r7;
                        this.f36338f = r8;
                        this.h = r9;
                        this.f36339n = r10;
                        this.f36340r = r11;
                    }

                    @Override
                    public final void run() {
                        int i15;
                        final sn snVar2 = sn.this;
                        if (this.f36336b != snVar2.f41667rc) {
                            return;
                        }
                        snVar2.f41694tc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            snVar2.yc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            snVar2.getMessagesController().putUsers(snVar2.yc.users, false);
                            snVar2.getMessagesController().putChats(snVar2.yc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = snVar2.yc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i16 = 0; i16 < snVar2.yc.messages.size(); i16++) {
                                TLRPC.Message message = snVar2.yc.messages.get(i16);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i17 = this.f36337c;
                        final int i18 = this.e;
                        final MessageObject messageObject3 = this.f36338f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = this.h;
                        final TLRPC.Chat chat2 = this.f36339n;
                        final MessageObject messageObject4 = this.f36340r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = snVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f20365id;
                            tL_messages_getReplies.offset_date = 0;
                            tL_messages_getReplies.limit = 30;
                            if (i18 > 0) {
                                tL_messages_getReplies.offset_id = i18;
                                tL_messages_getReplies.add_offset = -15;
                            } else {
                                if (i17 == 0) {
                                    i15 = 1;
                                } else {
                                    i15 = i17;
                                }
                                tL_messages_getReplies.offset_id = i15;
                                tL_messages_getReplies.add_offset = -20;
                            }
                            final int i19 = snVar2.f41681sc + 1;
                            snVar2.f41681sc = i19;
                            snVar2.f41706uc = snVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new jh(sn.this, i19, tLObject3, tL_error2, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4, 0));
                                }
                            });
                            return;
                        }
                        snVar2.Ca(snVar2.yc, snVar2.zc, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f41694tc, this.classGuid);
    }

    public final void fb() {
        androidx.biometric.e[] eVarArr;
        jh.b bVar;
        jh.a aVar;
        org.telegram.ui.Components.ld[] ldVarArr;
        bj bjVar = this.f41720w;
        if (bjVar != null) {
            bjVar.c();
        }
        bj bjVar2 = this.f41733x;
        if (bjVar2 != null) {
            bjVar2.c();
        }
        gk gkVar = this.Y;
        if (gkVar != null) {
            gkVar.updateColors();
        }
        ci.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.h1();
        }
        nj njVar = this.f41734x0;
        if (njVar != null) {
            int childCount = njVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f41734x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    ((org.telegram.ui.Cells.t1) childAt).r1(0);
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.m1 m1Var = this.f41481c9;
        if (m1Var != null && m1Var.getContentView() != null) {
            View contentView = this.f41481c9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.tg0 tg0Var = this.L2;
        if (tg0Var != null) {
            tg0Var.d();
        }
        hk hkVar = this.Z;
        if (hkVar != null && hkVar.getEditView() != null) {
            for (org.telegram.ui.Components.ld ldVar : this.Z.getEditView().f28006a) {
                if (ldVar != null) {
                    ldVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var = this.f41534h0;
        if (u0Var != null) {
            u0Var.N();
        }
        ak akVar = this.f41559j2;
        if (akVar != null) {
            akVar.updateColors();
        }
        hj hjVar = this.f41594m1;
        if (hjVar != null) {
            hjVar.updateColors();
        }
        km kmVar = this.f41558j1;
        if (kmVar != null) {
            kmVar.M();
            ai.jc jcVar = this.f41558j1.L;
            if (jcVar != null) {
                jcVar.invalidate();
            }
        }
        org.telegram.ui.Components.ah ahVar = this.Y0;
        if (ahVar != null) {
            dh.d dVar = ahVar.f24731s;
            if (dVar != null) {
                dVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21184d6, false));
            ahVar.invalidate();
        }
        org.telegram.ui.Components.kz0 kz0Var = this.f41632p1;
        if (kz0Var != null) {
            kz0Var.updateColors();
        }
        hj hjVar2 = this.f41594m1;
        if (hjVar2 != null && hjVar2.getTimeItem() != null) {
            this.f41594m1.getTimeItem().invalidate();
        }
        ih.f fVar = this.S;
        if (fVar != null) {
            fVar.updateColors();
        }
        kh.h hVar = this.f41708v1;
        if (hVar != null) {
            for (androidx.biometric.e eVar : hVar.e) {
                if (eVar != null && (aVar = (bVar = (jh.b) eVar.f2822b).f14561b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        kk kkVar = this.f41446a1;
        if (kkVar != null) {
            kkVar.updateColors();
        }
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((dh.d) it.next()).updateColors();
        }
        s9();
    }

    public final void fc() {
        long j10;
        ke keVar = this.f41529g8;
        if (keVar != null) {
            AndroidUtilities.cancelRunOnUIThread(keVar);
        }
        ke keVar2 = new ke(this, 18);
        this.f41529g8 = keVar2;
        if (this.f41466b8 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(keVar2, j10);
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.m1 m1Var = this.f41481c9;
        if (m1Var != null) {
            m1Var.e = false;
            D7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.e;
    }

    public final void g7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.g7():void");
    }

    public final void g8(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && i7()) {
            boolean z11 = false;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i12);
                    if (sendingMediaInfo.inlineResult == null && sendingMediaInfo.videoEditedInfo == null) {
                        break;
                    }
                    i12++;
                } else if (!TextUtils.isEmpty(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption)) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.f41516f6, this.f41764z5, this.f41561j4, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = H8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.f41516f6, this.f41764z5, this.f41561j4, null, this.f41739x5, z10, i10, 0, H8(), 0L, S8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    i11 = i13;
                }
                i13 = i11 + 1;
                z11 = false;
            }
            if (!arrayList2.isEmpty()) {
                o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.f41516f6, this.f41764z5, this.f41561j4, null, this.f41739x5, false, true, this.B5, z10, i10, 0, this.f41489d4, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f41674s5);
                B6();
                if (i10 != 0) {
                    if (this.f41501e4 == -1) {
                        this.f41501e4 = 0;
                    }
                    this.f41501e4 = arrayList.size() + this.f41501e4;
                    Lc(true);
                }
            }
        }
    }

    public final boolean g9() {
        lm lmVar = this.f41629o9;
        if (lmVar != null && lmVar.x()) {
            return true;
        }
        return false;
    }

    public final void ga(boolean z10) {
        String string;
        if (!D9() && !f9()) {
            int i10 = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f41551i6;
                    if (i12 >= sparseArrayArr[i11].size()) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i11].valueAt(i12);
                    if (messageObject.isTodo()) {
                        i10 = 3;
                    } else if (messageObject.isPoll()) {
                        if (messageObject.isPublicPoll()) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        if (i10 == 2) {
                            break;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    i12++;
                }
                if (i10 == 2) {
                    break;
                }
            }
            ah.f0 f0Var = this.f41580ka;
            if (f0Var != null && f0Var.d()) {
                this.f41580ka.setHiddenByScroll(true);
            }
            Bundle e = org.telegram.messenger.v0.e(3, "onlySelect", "dialogsType", true);
            e.putInt("messagesCount", this.f41626o6);
            e.putInt("hasPoll", i10);
            e.putBoolean("hasInvoice", z11);
            e.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(e);
            eyVar.C2 = this;
            presentFragment(eyVar);
            return;
        }
        if (D9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.e) && !this.e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f41723w2 == null) {
                km kmVar = this.f41558j1;
                int indexOfChild = kmVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.p40 p40Var = new org.telegram.ui.Components.p40(7, getParentActivity(), null, true);
                    this.f41723w2 = p40Var;
                    kmVar.addView(p40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f41723w2.setAlpha(0.0f);
                    this.f41723w2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f41723w2.setText(string);
            this.f41723w2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f41736x2 == null) {
            km kmVar2 = this.f41558j1;
            int indexOfChild2 = kmVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.p40 p40Var2 = new org.telegram.ui.Components.p40(getParentActivity(), 9);
            this.f41736x2 = p40Var2;
            kmVar2.addView(p40Var2, indexOfChild2 + 1, w7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f41736x2.setAlpha(0.0f);
            this.f41736x2.setVisibility(4);
        }
        this.f41736x2.setText(string);
        this.f41736x2.f(this.f41459b1.getForwardButton(), true);
    }

    public final void gb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f20350id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.f41516f6, this.f41764z5, this.f41561j4, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = H8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        B6();
    }

    public final void gc() {
        AndroidUtilities.forEachViews((RecyclerView) this.f41734x0, (Utilities.Callback<View>) new ai.y8(5, this, y9()));
    }

    @Override
    public final org.telegram.ui.ActionBar.c5 getBackButtonState() {
        return org.telegram.ui.ActionBar.c5.f20794a;
    }

    @Override
    public final org.telegram.ui.ActionBar.c4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.c4.f20793c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.f41489d4 == 0 && (call = this.f41553i8) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f41489d4 == 2) {
            ArrayList arrayList = this.G6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + F8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f41651qa;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.n5 n5Var;
        org.telegram.ui.ActionBar.n5 n5Var2;
        View view;
        org.telegram.ui.Components.rz rzVar;
        org.telegram.ui.Components.rz rzVar2;
        org.telegram.ui.Components.rz rzVar3;
        org.telegram.ui.Components.rz rzVar4;
        org.telegram.ui.Components.rz rzVar5;
        org.telegram.ui.Components.rz rzVar6;
        org.telegram.ui.Components.rz rzVar7;
        org.telegram.ui.Components.rz rzVar8;
        org.telegram.ui.Components.rz rzVar9;
        org.telegram.ui.Components.rz rzVar10;
        org.telegram.ui.Components.rz rzVar11;
        View view2;
        org.telegram.ui.Components.rz rzVar12 = null;
        if (this.f41648q7) {
            return null;
        }
        int i10 = 0;
        if (this.f41603ma) {
            this.f41603ma = false;
            return null;
        }
        i6 i6Var = new i6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qd));
        F9();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.F8));
        hj hjVar = this.f41594m1;
        if (hjVar != null) {
            n5Var = hjVar.getTitleTextView();
        } else {
            n5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
        hj hjVar2 = this.f41594m1;
        if (hjVar2 != null) {
            n5Var2 = hjVar2.getTitleTextView();
        } else {
            n5Var2 = null;
        }
        int i11 = org.telegram.ui.ActionBar.k6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        hj hjVar3 = this.f41594m1;
        if (hjVar3 != null) {
            view = hjVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(i11, view));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.k6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21556x8));
        org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.j5 j5Var2 = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.j5 j5Var3 = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.j5 j5Var4 = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.j5 j5Var5 = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.j5 j5Var6 = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.j5 j5Var7 = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.j5 j5Var8 = (org.telegram.ui.ActionBar.j5) getThemedDrawable("drawableMsgOutMediaSelected");
        if (j5Var != null) {
            Drawable[] drawableArr = j5Var.A;
            int i13 = org.telegram.ui.ActionBar.k6.f21484ta;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, j5Var2.A, (org.telegram.ui.ActionBar.s6) null, i13));
            Drawable[] drawableArr2 = j5Var5.A;
            int i14 = org.telegram.ui.ActionBar.k6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.s6) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, j5Var6.A, (org.telegram.ui.ActionBar.s6) null, i14));
        }
        if (!this.f41651qa.p(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{j5Var5, j5Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{j5Var5, j5Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{j5Var5, j5Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fa));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, new Drawable[]{j5Var7, j5Var8}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21151bc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21427qc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21447rc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21170cb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21207ed));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21277ib));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21225fd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21296jb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21316kb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21540wb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21577yb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21559xb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.pe));
        this.f41651qa.getClass();
        jk jkVar = this.f41488d3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i15 = org.telegram.ui.ActionBar.k6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.t6(jkVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.R, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21133ae));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.kf));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21376nf));
        gk gkVar = this.Y;
        int i16 = org.telegram.ui.ActionBar.k6.f21356mf;
        arrayList.add(new org.telegram.ui.ActionBar.t6(gkVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21394of));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21174cf));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21227ff));
        gk gkVar2 = this.Y;
        if (gkVar2 != null) {
            rzVar = gkVar2.getEmojiView();
        } else {
            rzVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Ke));
        gk gkVar3 = this.Y;
        if (gkVar3 != null) {
            rzVar2 = gkVar3.getEmojiView();
        } else {
            rzVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar2, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Le));
        gk gkVar4 = this.Y;
        if (gkVar4 != null) {
            rzVar3 = gkVar4.getEmojiView();
        } else {
            rzVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar3, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Me));
        gk gkVar5 = this.Y;
        if (gkVar5 != null) {
            rzVar4 = gkVar5.getEmojiView();
        } else {
            rzVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar4, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Oe));
        gk gkVar6 = this.Y;
        if (gkVar6 != null) {
            rzVar5 = gkVar6.getEmojiView();
        } else {
            rzVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar5, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Pe));
        gk gkVar7 = this.Y;
        if (gkVar7 != null) {
            rzVar6 = gkVar7.getEmojiView();
        } else {
            rzVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar6, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Re));
        gk gkVar8 = this.Y;
        if (gkVar8 != null) {
            rzVar7 = gkVar8.getEmojiView();
        } else {
            rzVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar7, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Se));
        gk gkVar9 = this.Y;
        if (gkVar9 != null) {
            rzVar8 = gkVar9.getEmojiView();
        } else {
            rzVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar8, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.We));
        gk gkVar10 = this.Y;
        if (gkVar10 != null) {
            rzVar9 = gkVar10.getEmojiView();
        } else {
            rzVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar9, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Ne));
        gk gkVar11 = this.Y;
        if (gkVar11 != null) {
            rzVar10 = gkVar11.getEmojiView();
        } else {
            rzVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar10, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Je));
        gk gkVar12 = this.Y;
        if (gkVar12 != null) {
            rzVar11 = gkVar12.getEmojiView();
        } else {
            rzVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar11, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Ue));
        gk gkVar13 = this.Y;
        if (gkVar13 != null) {
            rzVar12 = gkVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(rzVar12, 0, new Class[]{org.telegram.ui.Components.rz.class}, (String[]) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.Qe));
        gk gkVar14 = this.Y;
        if (gkVar14 != null) {
            org.telegram.ui.Components.t51 trendingStickersAlert = gkVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.Y.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wk));
        }
        for (int i17 = 0; i17 < 2; i17++) {
            if (i17 == 0) {
                view2 = this.K3;
            } else {
                view2 = this.L3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fi));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21518v7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21501u7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21573y7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.L2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, i6Var, org.telegram.ui.ActionBar.k6.f21184d6));
        NumberTextView numberTextView = this.R2;
        int i18 = org.telegram.ui.ActionBar.k6.f21226fe;
        arrayList.add(new org.telegram.ui.ActionBar.t6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i18));
        ImageView imageView = this.f41500e3;
        int i19 = org.telegram.ui.ActionBar.k6.f21591z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41513f3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41571k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21278ic));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41734x0, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Fe));
        ei.g6 g6Var = this.Q;
        int i20 = org.telegram.ui.ActionBar.k6.f21334lc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(g6Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41609n2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41571k1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i20));
        org.telegram.ui.Components.p40 p40Var = this.f41644q2;
        int i21 = org.telegram.ui.ActionBar.k6.f21430qf;
        arrayList.add(new org.telegram.ui.ActionBar.t6(p40Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f41644q2, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21411pf));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.F2, 4, new Class[]{org.telegram.ui.Components.p40.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.G2, 4, new Class[]{org.telegram.ui.Components.p40.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21311k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21508uf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21526vf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21136ah));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21156bh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21176ch));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21193dh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21211eh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21228fh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21282ih));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21302jh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21321kh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21248gh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21264hh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21126a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Dj));
        int i22 = org.telegram.ui.ActionBar.k6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i22));
        xh.d dVar = this.f41665ra;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(dVar.f50282g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.t6(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f21190de));
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.t6) obj).f21869n = this.f41651qa;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f41651qa.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.f41651qa.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.k6.U0(str);
    }

    public final boolean h7(View view) {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer != null) {
            Yb(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void h8(View view) {
        i8(view, false);
    }

    public final void h9() {
        org.telegram.ui.Components.gu editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.s()) {
                this.Pc.h(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.f41599m6 = 0;
        this.f41636p6 = 0;
        this.f41613n6 = 0;
        this.f41661r6 = 0;
        this.f41675s6 = 0;
        this.q6 = 0;
        gk gkVar = this.Y;
        if (gkVar != null && (editField = gkVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        lm lmVar = this.f41629o9;
        if (lmVar != null) {
            lmVar.f(true);
            SparseArray sparseArray = this.f41629o9.f22901p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        jl jlVar = this.f41691t9;
        if (jlVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jlVar.H);
            jlVar.a();
        }
        gk gkVar2 = this.Y;
        if (gkVar2 != null) {
            gkVar2.f24053a0 = false;
        }
        this.f41704u9 = false;
        if (this.f41618nb != null) {
            p9();
        }
    }

    public final void ha(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f41660r5;
        if (messagePreviewParams != null && this.Ra == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.S5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f41764z5;
                if (messageObject2 == this.f41561j4) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f41739x5, this.B5);
            }
            if (!this.f41660r5.isEmpty()) {
                this.f41666rb = this.Y.f24200z2;
                Context context = this.f41558j1.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f41660r5;
                TLRPC.User user = this.f41509f;
                TLRPC.Chat chat = this.e;
                int i12 = this.currentAccount;
                qn qnVar = this.f41651qa;
                in inVar = this.f41739x5;
                if (inVar != null && inVar.f38335f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bl blVar = new bl(this, context, this, this.M8, messagePreviewParams2, user, chat, i12, qnVar, i10, z10);
                this.Ra = blVar;
                this.f41660r5.attach(blVar);
                TLRPC.ChatFull chatFull = this.f41589l8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.f41692ta) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.f41692ta.peers.get(0).peer;
                }
                this.Ra.setSendAsPeer(peer);
                g7();
                this.f41558j1.addView(this.Ra);
                if (this.f41666rb) {
                    gk gkVar = this.Y;
                    gkVar.T0 = true;
                    org.telegram.ui.Components.bg bgVar = gkVar.U0;
                    if (bgVar != null) {
                        bgVar.v(true);
                    }
                    this.Y.p1();
                    this.P3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void hb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j10) {
        long j11;
        String str;
        yj yjVar = this.U1;
        if (yjVar == null) {
            return;
        }
        TLRPC.User user = yjVar.getAdapter().f11974w0;
        if (user != null) {
            j11 = user.f20491id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f20342id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.U1.getAdapter().f11974w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.f41516f6, this.f41764z5, this.f41561j4, null, this.f41739x5, z10, i10, 0, H8(), j10, S8());
        this.Y.setFieldText("");
        j9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void hc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.f41516f6, d())) {
            if (z10) {
                getNotificationsController().muteDialog(this.f41516f6, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.h3 E = org.telegram.ui.Components.d5.E(this.f41516f6, d(), this, this.f41651qa);
            E.setCalcMandatoryInsets(C9());
            showDialog(E);
            return;
        }
        getNotificationsController().muteDialog(this.f41516f6, d(), false);
        if (!z10) {
            org.telegram.ui.Components.vc.z(this, 4, 0, this.f41651qa).j();
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.f41561j4;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f41509f;
    }

    public final boolean i7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void i8(View view, boolean z10) {
        boolean z11;
        ub(view);
        if (view != this.f41708v1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j8(z10, z11, 0.2f);
    }

    public final void i9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.vc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Ja(this.p5);
            La(this.p5);
            return;
        }
        showDialog(new sg.y0((org.telegram.ui.ActionBar.o2) this, 3, true));
    }

    public final void ia(String str, boolean z10) {
        boolean z11;
        dk dkVar;
        boolean z12;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                P7();
                ei.x3 x3Var = this.H1;
                if (x3Var != null && x3Var.V) {
                    x3Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                ei.x3 x3Var2 = this.I1;
                if (x3Var2 != null && x3Var2.V) {
                    x3Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new re(this, str, 10), 200L);
                    return;
                }
                this.G3 = str;
                this.F3 = str;
                boolean contains = str.contains("@");
                U6(true);
                if (!this.actionBar.f21069n0) {
                    this.Nc.a(true, true);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f41534h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f41497e0;
                    if (xVar != null) {
                        xVar.f(8);
                    }
                    wr wrVar = this.f41485d0;
                    if (wrVar != null) {
                        wrVar.b(false);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f41545i0;
                    if (xVar2 != null) {
                        xVar2.f(8);
                    }
                    if ((this.f41635p4 == 0 || (i10 = this.f41489d4) == 3 || i10 == 8) && (u0Var = this.f41557j0) != null) {
                        u0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
                    if (u0Var3 != null && this.W9) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar3 = this.f41607n0;
                    if (xVar3 != null && this.X9) {
                        xVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.f41570k0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    this.f41620o0 = true;
                    Mc(0, 0, -1);
                    oc(false);
                }
                rk rkVar = this.A1;
                if (rkVar != null) {
                    if (rkVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        rkVar.g(false);
                    }
                }
                ImageView imageView = this.f41513f3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.e) || !ChatObject.isPublic(this.e) || this.G3 == null)) {
                    this.D1 = 0;
                } else {
                    this.D1 = 2;
                }
                this.f41550i5 = false;
                if (this.f41448a4 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ei.h1 h1Var = this.C1;
                if (h1Var != null) {
                    h1Var.h.clear();
                }
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f41557j0;
                if (u0Var5 != null) {
                    this.f41653qc = true;
                    u0Var5.z(false);
                    this.f41653qc = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var6 = this.f41557j0;
                if (u0Var6 != null) {
                    u0Var6.setSearchFieldCaption(null);
                    this.f41557j0.H(str, false);
                    this.f41557j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.F3, this.f41516f6, this.X6, this.classGuid, 0, this.f41635p4, false, this.A3, this.B3, false, this.C3);
                Fc(0, true);
                this.f41633p2.e(true, true);
                Rb(true);
                dk dkVar2 = this.B1;
                if (dkVar2 != null) {
                    dkVar2.b(!contains);
                    Oc();
                }
                if ((contains || z10) && this.G3 != null && (dkVar = this.B1) != null) {
                    int currentPosition = dkVar.f25063a.getCurrentPosition();
                    int i11 = this.D1;
                    if (currentPosition != i11) {
                        this.B1.f25063a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.G3);
                this.F1.f27857f.N(true);
                View currentView = this.C1.getCurrentView();
                if (currentView instanceof un) {
                    ((un) currentView).f42454a.Qc(this.G3);
                }
            }
        }
    }

    public final void ib(ClipData clipData, boolean z10, int i10) {
        int i11 = 0;
        if (this.B5 != null) {
            while (i11 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i11).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    mb(i10, arrayList, z10);
                }
                i11++;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        while (i11 < clipData.getItemCount()) {
            Uri uri2 = clipData.getItemAt(i11).getUri();
            if (uri2 != null) {
                arrayList2.add(uri2);
            }
            i11++;
        }
        mb(i10, arrayList2, z10);
    }

    public final void ic(org.telegram.ui.ActionBar.s0 s0Var, boolean z10) {
        Set set;
        if (s0Var != null) {
            if (z10) {
                set = this.S0;
            } else {
                set = this.R0;
            }
            set.add(s0Var);
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (F9()) {
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.e(org.telegram.ui.ActionBar.k6.f21538w8);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21538w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            z10 = this.Qb;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.f41489d4 != 5 || (!this.G6.isEmpty() && this.f41635p4 != 0)) && !this.Mc.f17447f && this.f41768z9) {
            bl blVar = this.Ra;
            if (blVar == null || !blVar.f29543s) {
                vh.i iVar = this.f41567ja;
                if (iVar == null || !iVar.a()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    @Override
    public final void j(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
        bb(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final void j7(Runnable runnable, ag.a aVar, boolean z10) {
        if (aVar != null && z10) {
            s1 s1Var = new s1(this, aVar, runnable, 20);
            ai.ha x10 = ai.ha.x(this.currentAccount, aVar.f631a);
            if (!x10.e) {
                x10.q(true, true, s1Var);
                return;
            } else {
                s1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void j8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        kh.h hVar;
        org.telegram.ui.Cells.t1 t1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.V8;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            t1Var2.setInvalidatesParent(z12);
            if (z12) {
                Ra(t1Var2);
            }
        }
        this.f41558j1.invalidate();
        this.f41734x0.invalidate();
        AnimatorSet animatorSet = this.f41467b9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f41467b9.cancel();
        }
        this.f41467b9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.T8, f7);
        float f10 = 1.0f;
        if (z12) {
            this.W8 = 1.0f;
            this.X8 = 0.0f;
            ValueAnimator valueAnimator = this.oc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.bn0.d(new we(this, 3));
            }
        } else {
            float f11 = this.T8;
            this.X8 = f11 / max;
            this.U8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new fg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f41708v1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.f41467b9.playTogether(arrayList);
        this.f41467b9.setInterpolator(org.telegram.ui.Components.zr.h);
        this.f41467b9.setDuration(320L);
        View view2 = this.V8;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            t1Var = (org.telegram.ui.Cells.t1) view2;
        } else {
            t1Var = null;
        }
        this.f41467b9.addListener(new ah.q0(this, z12, t1Var, 4));
        if (this.V8 != null && this.W8 <= 0.0f) {
            ub(null);
        }
        this.f41467b9.start();
    }

    public final void j9(boolean z10) {
        Fb(false, null, null, null, null, true, 0, null, false, 0L, null, z10);
    }

    public final boolean ja(String str, org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, int i10, int i11) {
        gi.m4 m4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.e == null || str == null || this.f41489d4 != 0) {
            return false;
        }
        if (t1Var != null && (characterStyle != null || i11 != 1)) {
            m4Var = new gi.m4(this, i10, i11, characterStyle, t1Var);
        } else {
            m4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.e) != null) {
                try {
                    if (Yc == null) {
                        Yc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Zc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Yc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.e, matcher.group(2))) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.parseInt((CharSequence) parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.parseInt((CharSequence) parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.parseInt((CharSequence) queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = rh.f.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (ChatObject.isForum(this.e) && i12 != d()) {
                                        return false;
                                    }
                                    this.F7 = true;
                                    if (this.f41489d4 == 2) {
                                        this.f41543h9.D0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.K7 = W;
                                    if (W >= 0) {
                                        this.L7 = parseInt;
                                    }
                                    bb(parseInt, i10, true, 0, false, 0, num, g10, m4Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e) {
                            e = e;
                            FileLog.e(e);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Zc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f41677s8 = queryParameter2;
                                    R6(true);
                                    return true;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e7) {
                            FileLog.e(e7);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("comment")).intValue();
                    if (ChatObject.hasPublicLink(this.e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f41489d4 == 2) {
                            this.f41543h9.D0(intValue3);
                            finishFragment();
                            return true;
                        }
                        bb(intValue3, i10, true, 0, false, 0, null, null, m4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e10) {
                    e = e10;
                    z10 = false;
                }
            } else {
                try {
                    if (f41441ad == null) {
                        f41441ad = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f41441ad.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.e.f20344id || parseInt3 == 0) {
                        return false;
                    }
                    Uri parse3 = Uri.parse(str);
                    int intValue6 = Utilities.parseInt((CharSequence) parse3.getQueryParameter("thread")).intValue();
                    int intValue7 = Utilities.parseInt((CharSequence) parse3.getQueryParameter("topic")).intValue();
                    int intValue8 = Utilities.parseInt((CharSequence) parse3.getQueryParameter("comment")).intValue();
                    String queryParameter3 = parse3.getQueryParameter("task");
                    if (queryParameter3 != null) {
                        num2 = Utilities.parseInt((CharSequence) queryParameter3);
                    } else {
                        num2 = null;
                    }
                    byte[] g11 = rh.f.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f41624o4;
                            if (tL_forumTopic != null && tL_forumTopic.f20396id == findTopic.f20396id) {
                                return true;
                            }
                            return false;
                        }
                        this.F7 = true;
                        if (this.f41489d4 == 2) {
                            this.f41543h9.D0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        bb(parseInt3, i10, true, 0, false, 0, num2, g11, m4Var);
                        return true;
                    }
                    return false;
                } catch (Exception e11) {
                    FileLog.e(e11);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.parseLong(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("thread")).intValue();
            long j10 = this.e.f20344id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                fa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.F7 = true;
            if (this.f41489d4 == 2) {
                this.f41543h9.D0(intValue9);
                finishFragment();
                return true;
            }
            bb(intValue9, i10, true, 0, false, 0, null, null, m4Var);
            return true;
        }
    }

    public final void jb(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        long j11;
        if (i7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.f41516f6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.effect_id = j10;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f41674s5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                j11 = 0;
            } else {
                j11 = j10;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.f41516f6, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = H8();
                of3.effect_id = j11;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = S8();
                of3.suggestionParams = this.f41674s5;
                getSendMessagesHelper().sendMessage(of3);
                j11 = 0;
            }
            B6();
        }
    }

    public final void jc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.oc ocVar = this.M3;
        if (ocVar != null) {
            ocVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.p5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.f41477c5;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.f41516f6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f41477c5 - 1), Boolean.valueOf(this.f41502e5));
        this.M3 = org.telegram.ui.Components.vc.B(this, false, new ai.db(this, arrayList2, arrayList, i10, 15), new se(this, messageObject, 7), this.f41651qa).j();
    }

    public final void k7() {
        if (this.L3 != null) {
            return;
        }
        cl clVar = new cl(this, getParentActivity(), this, this.f41651qa);
        this.L3 = clVar;
        this.f41558j1.addView(clVar, 17, w7.z5.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void k8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void k9(boolean z10) {
        if (this.f41560j3.getTag() != null && !this.f41634p3) {
            if (!this.f41710v3 || this.f41658r3) {
                this.f41560j3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f41672s3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f41672s3.playTogether(ObjectAnimator.ofFloat(this.f41560j3, View.ALPHA, 0.0f));
                    this.f41672s3.addListener(new oi(this, 6));
                    this.f41672s3.setStartDelay(this.f41596m3);
                    this.f41672s3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f41672s3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f41672s3 = null;
                    }
                    this.f41560j3.setAlpha(0.0f);
                }
                this.f41596m3 = 500;
            }
        }
    }

    public final void ka(MessageObject messageObject) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
        long j10 = peer.channel_id;
        if (j10 != 0) {
            bundle.putLong("chat_id", j10);
        } else {
            long j11 = peer.chat_id;
            if (j11 != 0) {
                bundle.putLong("chat_id", j11);
            } else {
                long j12 = peer.user_id;
                if (j12 != 0) {
                    bundle.putLong("user_id", j12);
                }
            }
        }
        bundle.putInt("message_id", messageObject.getRealId());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new sn(bundle));
        }
    }

    public final void kb(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        String str;
        String str2;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                MediaController.PhotoEntry photoEntry = (MediaController.PhotoEntry) obj;
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo = new SendMessagesHelper.SendingMediaInfo();
                if (!photoEntry.isVideo && (str2 = photoEntry.imagePath) != null) {
                    sendingMediaInfo.path = str2;
                } else {
                    String str3 = photoEntry.path;
                    if (str3 != null) {
                        sendingMediaInfo.path = str3;
                    }
                }
                sendingMediaInfo.thumbPath = photoEntry.thumbPath;
                sendingMediaInfo.coverPath = photoEntry.coverPath;
                sendingMediaInfo.isLivePhoto = photoEntry.isLivePhoto();
                sendingMediaInfo.isVideo = photoEntry.isVideo;
                sendingMediaInfo.discardLivePhoto = photoEntry.isUnalivePhoto();
                sendingMediaInfo.livePhotoVideoOffset = photoEntry.livePhotoVideoOffset;
                sendingMediaInfo.livePhotoTimestampUs = photoEntry.livePhotoTimestampUs;
                CharSequence charSequence = photoEntry.caption;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                sendingMediaInfo.caption = str;
                sendingMediaInfo.entities = photoEntry.entities;
                sendingMediaInfo.masks = photoEntry.stickers;
                sendingMediaInfo.ttl = photoEntry.ttl;
                sendingMediaInfo.videoEditedInfo = photoEntry.editedInfo;
                sendingMediaInfo.canDeleteAfter = photoEntry.canDeleteAfter;
                sendingMediaInfo.highQuality = photoEntry.isHighQuality();
                arrayList2.add(sendingMediaInfo);
                photoEntry.reset();
            }
            o8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.f41516f6, this.f41764z5, this.f41561j4, null, this.f41739x5, z11, true, null, z10, i10, 0, this.f41489d4, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f41674s5);
            B6();
            gk gkVar = this.Y;
            if (gkVar != null) {
                gkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.f41501e4 == -1) {
                this.f41501e4 = 0;
            }
            this.f41501e4 = arrayList.size() + this.f41501e4;
            Lc(true);
        }
    }

    public final void kc() {
        boolean F9 = F9();
        SparseArray[] sparseArrayArr = this.f41551i6;
        if (!F9) {
            if (this.actionBar.s() && this.f41608n1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f41608n1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.B0.setText(LocaleController.getString(R.string.ReportMessagesNoCaps));
            this.B0.setAlpha(0.5f);
            this.B0.setEnabled(false);
            return;
        }
        this.B0.setText(LocaleController.formatString(R.string.ReportMessagesCountNoCaps, LocaleController.formatPluralString("messages", size, new Object[0])));
        this.B0.setAlpha(1.0f);
        this.B0.setEnabled(true);
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2 = null;
        o8(str, null);
        if (i7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.f41516f6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.invert_media = z11;
                of2.payStars = j11;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f41674s5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.f41516f6, false, false, true, 0, 0, null, -1, j11, S8(), this.f41674s5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.f41516f6, this.f41764z5, this.f41561j4, null, this.f41739x5, this.B5, z10, i10, 0, null, H8(), j10, z11, j11, S8(), this.f41674s5);
            B6();
        }
    }

    public final void l7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.Ub > 1000) {
            z10 = true;
        }
        kg kgVar = this.Vb;
        AndroidUtilities.cancelRunOnUIThread(kgVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        AndroidUtilities.runOnUIThread(kgVar, j10);
    }

    public final void l8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.B5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void l9(boolean z10) {
        if (this.f41573k3.getTag() != null && !this.f41645q3) {
            if (!this.f41724w3 || this.f41658r3) {
                this.f41573k3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41698u3, 0.0f);
                    this.f41685t3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f41685t3.addUpdateListener(new me(this, 1));
                    this.f41685t3.addListener(new oi(this, 8));
                    this.f41685t3.setStartDelay(this.f41596m3);
                    this.f41685t3.start();
                } else {
                    ValueAnimator valueAnimator = this.f41685t3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f41685t3 = null;
                    }
                    this.f41698u3 = 0.0f;
                    sc();
                }
                this.f41596m3 = 500;
            }
        }
    }

    public final void la(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f41509f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f41509f.f20491id) {
                j(messageFwdHeader.saved_from_msg_id, messageObject.getId(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = messageObject.messageOwner.fwd_from.saved_from_peer;
        long j10 = peer.channel_id;
        if (j10 != 0) {
            bundle.putLong("chat_id", j10);
        } else {
            long j11 = peer.chat_id;
            if (j11 != 0) {
                bundle.putLong("chat_id", j11);
            } else {
                long j12 = peer.user_id;
                if (j12 != 0) {
                    bundle.putLong("user_id", j12);
                }
            }
        }
        bundle.putInt("message_id", messageObject.messageOwner.fwd_from.saved_from_msg_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new sn(bundle));
        }
    }

    public final se lb(MessageObject messageObject, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        if (messageObject == null || messageObject.isOut() || !messageObject.isSecretMedia()) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message.destroyTime != 0 || (i10 = message.ttl) <= 0) {
            return null;
        }
        if (z10) {
            if (i10 != Integer.MAX_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i10 == Integer.MAX_VALUE) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            message.destroyTime = getConnectionsManager().getCurrentTime() + i11;
            if (this.h != null) {
                getMessagesController().markMessageAsRead(this.f41516f6, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.f41516f6, messageObject.getId(), null, i11, 0L, z11);
            return null;
        }
        return new se(this, messageObject, 1);
    }

    public final void lc() {
        km kmVar = this.f41558j1;
        if (kmVar != null && this.f41630oa == null) {
            if (this.f41651qa.h == null || kmVar.getBackgroundImage() == null) {
                if (this.f41558j1.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.f41558j1.U(org.telegram.ui.ActionBar.k6.s0());
                }
            }
        }
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        o8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.f41516f6, this.f41764z5, this.f41561j4, null, this.f41739x5, true, false, this.B5, z10, i10, 0, this.f41489d4, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, H8(), 0L, false, j10, S8(), this.f41674s5);
        B6();
        if (i10 != 0) {
            if (this.f41501e4 == -1) {
                this.f41501e4 = 0;
            }
            this.f41501e4 = arrayList.size() + this.f41501e4;
            Lc(true);
        }
    }

    public final void m7() {
        int b92 = (int) (b9(org.telegram.ui.Components.r31.f30058c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(b92);
        int b10 = w7.r.b(AndroidUtilities.dp(36.0f) + (this.f41558j1.getMeasuredHeight() - b92), 0, this.f41558j1.getMeasuredHeight());
        int measuredWidth = this.f41558j1.getMeasuredWidth();
        Rect rect = dd;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Ma, this.f41734x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f41734x0.getMeasuredHeight() - this.Na) - b92));
    }

    public final void m8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f41674s5;
        if (messageSuggestionParams != null) {
            Jb(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.S5;
        if (webPage != null) {
            Kb(true, webPage, false);
            return;
        }
        in inVar = this.f41739x5;
        if (inVar != null) {
            Ib(this.f41764z5, inVar);
            return;
        }
        MessageObject messageObject = this.f41764z5;
        if (messageObject != null && messageObject != this.f41561j4) {
            Hb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f41660r5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Gb(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.B5;
        if (messageObject2 != null) {
            Eb(true, null, messageObject2, null, null, null, false);
        } else {
            Kb(false, null, true);
        }
    }

    public final void m9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.p40 p40Var = this.f41750y2;
            if (p40Var != null) {
                p40Var.b(true);
            }
            aj ajVar = this.f41671s2;
            if (ajVar != null) {
                ajVar.b(true);
            }
            org.telegram.ui.Components.p40 p40Var2 = this.f41697u2;
            if (p40Var2 != null) {
                p40Var2.b(true);
            }
        }
        org.telegram.ui.Components.p40 p40Var3 = this.f41736x2;
        if (p40Var3 != null) {
            p40Var3.b(true);
        }
        org.telegram.ui.Components.p40 p40Var4 = this.f41723w2;
        if (p40Var4 != null) {
            p40Var4.b(true);
        }
        org.telegram.ui.Components.p40 p40Var5 = this.F2;
        if (p40Var5 != null) {
            p40Var5.b(true);
        }
        org.telegram.ui.Components.p40 p40Var6 = this.G2;
        if (p40Var6 != null) {
            p40Var6.b(true);
        }
        org.telegram.ui.Components.p40 p40Var7 = this.f41761z2;
        if (p40Var7 != null) {
            p40Var7.b(true);
        }
        org.telegram.ui.Components.p40 p40Var8 = this.A2;
        if (p40Var8 != null) {
            p40Var8.b(true);
        }
        org.telegram.ui.Components.zp zpVar = this.H2;
        if (zpVar != null) {
            zpVar.a();
        }
        ei.x3 x3Var = this.V0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = this.X0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        ei.x3 x3Var3 = this.W0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
    }

    public final void ma(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        org.telegram.ui.Cells.t1 t1Var2;
        boolean z10;
        long j10;
        long j11;
        org.telegram.ui.Components.c6 animation;
        Bitmap m10;
        if (t1Var == null) {
            int childCount = this.f41734x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f41734x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var2.getMessageObject().equals(messageObject)) {
                        break;
                    }
                }
            }
        }
        t1Var2 = t1Var;
        if (messageObject.isVideo()) {
            lb(messageObject, true);
        }
        if (messageObject.isVideo() && !messageObject.hasVideoQualities() && SharedConfig.streamMedia && messageObject.canStreamVideo() && !DialogObject.isEncryptedDialog(messageObject.getDialogId()) && !messageObject.mediaExists && !messageObject.attachPathExists) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            getFileLoader().startVideoStream(messageObject.getDocument(), messageObject);
        }
        PhotoViewer.u1().M2(null, this, this.f41651qa);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (t1Var2 != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = t1Var2.getPhotoImage().getAnimation()) != null && this.I8 != null && this.F8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.I8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.f41489d4;
        ll llVar = this.Sa;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.u1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.G6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.u1().d2(arrayList, arrayList.indexOf(messageObject), this.f41516f6, 0L, d(), llVar);
        } else {
            PhotoViewer u12 = PhotoViewer.u1();
            int i13 = messageObject.type;
            long j12 = 0;
            if (i13 != 0) {
                j10 = this.f41516f6;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = this.X6;
            } else {
                j11 = 0;
            }
            if (i13 != 0) {
                j12 = d();
            }
            if (!u12.h2(messageObject, this, j10, j11, j12, llVar) && z10) {
                getFileLoader().cancelLoadFile(messageObject.getDocument());
            }
        }
        m9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void mb(int i10, ArrayList arrayList, boolean z10) {
        String str;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            Uri uri = (Uri) arrayList.get(i11);
            String uri2 = uri.toString();
            if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str2 = uri2.split("/1/")[1];
                    int indexOf = str2.indexOf("/ACTUAL");
                    if (indexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"));
                    }
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            if (!BuildVars.NO_SCOPED_STORAGE) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                arrayList4.add(uri);
            } else {
                String path = AndroidUtilities.getPath(uri);
                if (path == null) {
                    String uri3 = uri.toString();
                    String copyFileToCache = MediaController.copyFileToCache(uri, "file");
                    if (copyFileToCache == null) {
                        zb();
                    } else {
                        str = uri3;
                        path = copyFileToCache;
                    }
                } else {
                    str = path;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                }
                arrayList2.add(path);
                arrayList3.add(str);
            }
        }
        if (arrayList2 == null && arrayList4 == null) {
            return;
        }
        o8(null, null);
        SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), (ArrayList<String>) arrayList2, (ArrayList<String>) arrayList3, (ArrayList<Uri>) arrayList4, (String) null, (String) null, this.f41516f6, this.f41764z5, this.f41561j4, (TL_stories.StoryItem) null, this.f41739x5, this.B5, z10, i10, (t0.i) null, H8(), 0L, false, 0L);
        j9(false);
    }

    public final void mc() {
        TLRPC.User user;
        boolean z10;
        if (this.f41534h0 != null && (user = this.f41509f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f41638p8;
            boolean z11 = false;
            if (hVar.m() != 0) {
                boolean z12 = false;
                z10 = false;
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i10);
                    for (int i11 = 0; i11 < botInfo.commands.size(); i11++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i11);
                        if (botCommand.command.toLowerCase().equals("help")) {
                            z12 = true;
                        } else if (botCommand.command.toLowerCase().equals("settings")) {
                            z10 = true;
                        }
                        if (!z10 || !z12) {
                        }
                    }
                }
                z11 = z12;
            } else {
                z10 = false;
            }
            if (z11) {
                this.f41534h0.K(30);
            } else {
                this.f41534h0.r(30);
            }
            if (z10) {
                this.f41534h0.K(31);
            } else {
                this.f41534h0.r(31);
            }
        }
    }

    @Override
    public final boolean n() {
        return this.D9;
    }

    public final void n7() {
        int i10;
        if (this.f41594m1 != null) {
            float actionModeFactor = (1.0f - this.Nc.e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f41594m1.setScaleX(lerp);
            this.f41594m1.setScaleY(lerp);
            this.f41594m1.setAlpha(actionModeFactor);
            hj hjVar = this.f41594m1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            hjVar.setVisibility(i10);
        }
    }

    public final void n9() {
        ValueAnimator valueAnimator = this.f41693tb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.v0 v0Var = this.f41585l3;
        if (v0Var != null && v0Var.getTag() != null) {
            this.f41585l3.setTag(null);
            org.telegram.ui.Cells.v0 v0Var2 = this.f41585l3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ef(this, v0Var2, 1));
            ofFloat.addListener(new ai.ne(14, this, v0Var2));
            ofFloat.setDuration(150L);
            this.f41693tb = ofFloat;
            ofFloat.start();
        }
    }

    public final void na(boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var;
        int i10;
        if (getParentActivity() != null && (h5Var = this.parentLayout) != null && h5Var.getLastFragment() == this && !this.T4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f20344id);
            } else {
                bundle.putLong("user_id", this.f41509f.f20491id);
            }
            bundle.putInt("chatMode", 2);
            sn snVar = new sn(bundle);
            snVar.T4 = new ArrayList(this.T4);
            snVar.V4 = new HashMap(this.V4);
            int size = this.T4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.T4.get(i11);
                MessageObject messageObject = (MessageObject) this.V4.get(num);
                MessageObject messageObject2 = (MessageObject) this.A6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    snVar.V4.put(num, messageObject);
                    snVar.Gc();
                }
            }
            snVar.f41463b5 = this.f41463b5;
            if (this.f41686t4) {
                i10 = this.T4.size();
            } else {
                i10 = this.f41477c5;
            }
            snVar.f41477c5 = i10;
            snVar.f41502e5 = this.f41502e5;
            snVar.f41601m8 = this.f41601m8;
            snVar.f41589l8 = this.f41589l8;
            snVar.f41543h9 = new gl(this, snVar);
            if (z10) {
                presentFragmentAsPreview(snVar);
                g7();
                return;
            }
            presentFragment(snVar, false);
        }
    }

    public final void nb(MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages c92 = c9(messageObject);
        boolean z12 = false;
        if (c92 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < c92.messages.size()) {
                    if (this.f41551i6[i10].indexOfKey(c92.messages.get(i11).getId()) < 0) {
                        break;
                    }
                    i11++;
                } else {
                    c92 = null;
                    break;
                }
            }
        }
        if (c92 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        t1Var.setDrawSelectionBackground(z11);
        if (c92 == null) {
            z12 = true;
        }
        t1Var.K3(true, z12, z10);
    }

    public final void nc() {
        if (this.f41487d2 == null) {
            return;
        }
        this.f41487d2.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.d());
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f41489d4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((o2Var instanceof sn) && ((sn) o2Var).C9()) {
                return false;
            }
        }
        return this.T6;
    }

    @Override
    public final void o(int i10, float f7, float f10, ne.e eVar) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        if (i10 == 0) {
            X9();
            return;
        }
        int i13 = 4;
        int i14 = 0;
        if (i10 == 1) {
            View view = this.T;
            if (view != null) {
                view.setAlpha(f7);
                View view2 = this.T;
                if (f7 > 0.0f) {
                    i13 = 0;
                }
                view2.setVisibility(i13);
            }
        } else if (i10 == 2) {
            X9();
            v7();
            rh.c cVar = this.Qc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.Kc.e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                ne.b bVar = this.Lc;
                float f11 = 1.0f - bVar.e;
                this.Y0.setAlpha(f11);
                org.telegram.ui.Components.ah ahVar = this.Y0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                ahVar.setVisibility(i12);
                float f12 = 1.0f - bVar.e;
                org.telegram.ui.Components.v31 v31Var = this.f41487d2;
                if (v31Var != null) {
                    v31Var.setAlpha(f12);
                    org.telegram.ui.Components.v31 v31Var2 = this.f41487d2;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    v31Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                ah.x xVar = this.W3;
                ne.b bVar2 = this.Mc;
                if (xVar != null) {
                    float f13 = bVar2.e;
                    xVar.setAlpha(f13);
                    ah.x xVar2 = this.W3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    xVar2.setVisibility(i15);
                }
                if (bVar2.e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                kh.f fVar = this.X;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar.setVisibility(i11);
                o7();
                if (bVar2.e < 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                nj njVar = this.f41734x0;
                if (z11) {
                    i13 = 0;
                }
                njVar.setVisibility(i13);
                v7();
                y7();
                x7();
                v9(1);
            } else if (i10 == 5) {
                n7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f7);
                }
            } else if (i10 == 6) {
                s7();
            }
        }
    }

    public final void o7() {
        boolean z10;
        ei.h1 h1Var;
        if (this.f41639pa != null) {
            return;
        }
        int i10 = 0;
        if (this.Mc.e >= 1.0f && ((h1Var = this.C1) == null || h1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ai.jc jcVar = this.f41558j1.L;
        if (!z10) {
            i10 = 4;
        }
        jcVar.setVisibility(i10);
    }

    public final void o8(CharSequence charSequence, ArrayList arrayList) {
        if (this.B5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.B5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.B5.isMediaEmpty()) {
                MessageObject messageObject2 = this.B5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                gk gkVar = this.Y;
                if (gkVar != null) {
                    this.B5.editingMessage = gkVar.getFieldText();
                    MessageObject messageObject3 = this.B5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.B5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final boolean o9(boolean z10) {
        dl dlVar;
        dl dlVar2 = this.J2;
        if (dlVar2 == null || dlVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.ah ahVar = this.Y0;
        if (ahVar != null && (dlVar = this.J2) != null) {
            ahVar.i(dlVar, false, z10);
        }
        int i10 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.T2;
            if (i10 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i10] = null;
                }
                i10++;
            } else {
                this.M2 = false;
                this.J2.setTag(1);
                return true;
            }
        }
    }

    public final void oa(int i10, boolean z10) {
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && h5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f20352id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f20344id);
                } else {
                    bundle.putLong("user_id", this.f41509f.f20491id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            sn snVar = new sn(bundle);
            if (this.f41686t4) {
                og.d.a(snVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            snVar.f41543h9 = new jj(this);
            presentFragment(snVar, false);
        }
    }

    public final void ob(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f41651qa != null && this.f41630oa == null) {
            gg.b c10 = gg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.f41516f6, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.f4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.f4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.k();
                    theme.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.f4 f4Var = theme;
                qn qnVar = this.f41651qa;
                TLRPC.WallPaper wallPaper = qnVar.f40883g;
                if (this.f41464b6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qnVar.q(f4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new pe(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.f41516f6);
            qn qnVar2 = this.f41651qa;
            org.telegram.ui.ActionBar.f4 f4Var2 = qnVar2.f40882f;
            if (this.f41464b6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            qnVar2.q(f4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void oc(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.oc(boolean):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        ci.a3 a3Var;
        org.telegram.ui.Components.co coVar;
        String str;
        ci.a3 a3Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (a3Var2 = this.V1) != null) {
                    org.telegram.ui.Components.ji jiVar = a3Var2.B0;
                    if (jiVar instanceof ki.q) {
                        ki.q qVar = (ki.q) jiVar;
                        if (intent != null && intent.getData() != null) {
                            ki.w3 w3Var = qVar.f15508r;
                            Uri data = intent.getData();
                            if (data == null) {
                                w3Var.getClass();
                                return;
                            } else if (w3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new hi.t(21, w3Var, data));
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                }
                if (i10 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ci.a3 a3Var3 = this.V1;
                        if (a3Var3 != null) {
                            org.telegram.ui.Components.ji jiVar2 = a3Var3.B0;
                            if (jiVar2 instanceof ki.q) {
                                ki.q qVar2 = (ki.q) jiVar2;
                                if (intent.getData() != null) {
                                    qVar2.f15508r.k2(intent.getData());
                                    return;
                                }
                                return;
                            }
                        }
                        Uri data2 = intent.getData();
                        if (data2.toString().contains("video")) {
                            try {
                                str = AndroidUtilities.getPath(data2);
                            } catch (Exception e) {
                                FileLog.e(e);
                                str = null;
                            }
                            if (str == null) {
                                zb();
                            }
                            if (this.C5) {
                                this.E8 = str;
                            } else {
                                ta(null, str);
                            }
                        } else if (this.B5 == null && this.f41489d4 == 1) {
                            org.telegram.ui.Components.d5.L(getParentActivity(), this.f41516f6, new m4.w0(11, this, data2), this.f41651qa);
                        } else {
                            o8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.f41516f6, this.f41764z5, this.f41561j4, this.f41739x5, null, null, null, null, 0, this.B5, true, 0, this.f41489d4, H8());
                        }
                        B6();
                        return;
                    }
                    zb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        zb();
                        return;
                    }
                    if (this.B5 == null && this.f41489d4 == 1) {
                        if (intent.getData() != null) {
                            ci.a3 a3Var4 = this.V1;
                            if (a3Var4 != null) {
                                a3Var4.dismiss();
                            }
                            org.telegram.ui.Components.d5.L(getParentActivity(), this.f41516f6, new org.telegram.ui.Components.b5(this) {
                                public final sn f39213b;

                                {
                                    this.f39213b = this;
                                }

                                @Override
                                public final void C(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            sn snVar = this.f39213b;
                                            snVar.o8(null, null);
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                snVar.mb(i12, arrayList, z10);
                                            }
                                            snVar.B6();
                                            return;
                                        default:
                                            sn snVar2 = this.f39213b;
                                            snVar2.o8(null, null);
                                            snVar2.ib(intent.getClipData(), z10, i12);
                                            snVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f41651qa);
                            return;
                        } else if (intent.getClipData() != null) {
                            ci.a3 a3Var5 = this.V1;
                            if (a3Var5 != null) {
                                a3Var5.dismiss();
                            }
                            org.telegram.ui.Components.d5.L(getParentActivity(), this.f41516f6, new org.telegram.ui.Components.b5(this) {
                                public final sn f39213b;

                                {
                                    this.f39213b = this;
                                }

                                @Override
                                public final void C(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            sn snVar = this.f39213b;
                                            snVar.o8(null, null);
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                snVar.mb(i12, arrayList, z10);
                                            }
                                            snVar.B6();
                                            return;
                                        default:
                                            sn snVar2 = this.f39213b;
                                            snVar2.o8(null, null);
                                            snVar2.ib(intent.getClipData(), z10, i12);
                                            snVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f41651qa);
                            return;
                        } else {
                            zb();
                        }
                    } else {
                        o8(null, null);
                        if (intent.getData() != null) {
                            Uri data3 = intent.getData();
                            if (data3 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(data3);
                                mb(0, arrayList, true);
                            }
                        } else if (intent.getClipData() != null) {
                            ib(intent.getClipData(), true, 0);
                        } else {
                            zb();
                        }
                    }
                    ci.a3 a3Var6 = this.V1;
                    if (a3Var6 != null) {
                        a3Var6.dismiss();
                    }
                    B6();
                    return;
                } else if (i10 == 28 && (a3Var = this.V1) != null && (coVar = a3Var.m0) != null) {
                    org.telegram.ui.ActionBar.g6 g6Var = coVar.f27703a;
                    if (coVar.l1 != -1 && coVar.f25378k1 != null) {
                        if (intent != null) {
                            if (intent.getData() != null) {
                                uri = intent.getData();
                            } else if (intent.getClipData() != null) {
                                ClipData clipData = intent.getClipData();
                                if (clipData.getItemCount() > 0) {
                                    uri = clipData.getItemAt(0).getUri();
                                }
                            }
                        }
                        if (uri == null) {
                            org.telegram.messenger.tl.q(R.string.UnsupportedAttachment, new org.telegram.ui.Components.vc(coVar.f27704b.container, g6Var), g6Var);
                            return;
                        }
                        coVar.h0(coVar.l1, new sh.c(uri));
                        org.telegram.ui.Components.kn knVar = coVar.f25378k1;
                        if (knVar != null) {
                            knVar.dismiss(true);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            H7();
            ci.a3 a3Var7 = this.V1;
            if (a3Var7 != null) {
                a3Var7.f30158j0.g0(i10, intent, this.f41542h8);
            }
            this.f41542h8 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.q60 q60Var;
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.Components.nf nfVar;
        org.telegram.ui.Components.lf lfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        lm lmVar;
        ah.e0 e0Var;
        org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f29196w;
        if (ocVar != null) {
            org.telegram.ui.Components.sb sbVar = ocVar.e;
            if (sbVar instanceof org.telegram.ui.Components.zb) {
                if (z10) {
                    ((org.telegram.ui.Components.zb) sbVar).f();
                    ocVar.b();
                    return false;
                }
                return false;
            }
        }
        a41 a41Var = this.f41591la;
        if (a41Var != null && !a41Var.f35579b0) {
            if (z10) {
                a41Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            ah.f0 f0Var = this.f41580ka;
            if (f0Var != null && (e0Var = f0Var.f725b) != null && e0Var.getReactionsWindow() != null) {
                if (z10) {
                    f0Var.f725b.e();
                    return false;
                }
            } else if (ht.o().E) {
                if (z10) {
                    ht.o().m();
                    return false;
                }
            } else {
                bl blVar = this.Ra;
                if (blVar != null && blVar.f29543s) {
                    if (z10) {
                        blVar.a(true);
                        return false;
                    }
                } else if (this.Mc.f17447f) {
                    if (z10) {
                        Rb(false);
                        return false;
                    }
                } else if (this.f41481c9 != null) {
                    if (z10) {
                        D7(true);
                        return false;
                    }
                } else if (!a7(z10, false)) {
                    if (g9()) {
                        if (z10 && (lmVar = this.f41629o9) != null && lmVar.x()) {
                            this.f41629o9.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.s()) {
                            if (z10) {
                                C7(false);
                                return false;
                            }
                        } else {
                            gk gkVar = this.Y;
                            if (gkVar != null && gkVar.q0() && (gkVar.f24087f2 != 1 || (tL_replyKeyboardMarkup = gkVar.f24133n2) == null || !tL_replyKeyboardMarkup.is_persistent || gkVar.f24126m2 == null)) {
                                if (z10) {
                                    this.Y.j0(true);
                                    return false;
                                }
                            } else {
                                gk gkVar2 = this.Y;
                                if (gkVar2 != null && gkVar2.t()) {
                                    if (z10) {
                                        gk gkVar3 = this.Y;
                                        gi.b0 b0Var = gkVar3.f24121l0;
                                        if (b0Var != null) {
                                            b0Var.setOpened(false);
                                        }
                                        if (!gkVar3.g0() && (lfVar = gkVar3.m0) != null) {
                                            lfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    gk gkVar4 = this.Y;
                                    if (gkVar4 == null || (nfVar = gkVar4.E0) == null || !nfVar.closeCreationLinkDialog(z10)) {
                                        if (this.f41489d4 == 6 && (c2Var = ig.v.d) != null && c2Var.isShowing()) {
                                            if (z10) {
                                                ig.v.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.e) && !this.f41514f4 && this.f41487d2 != null && d() != 0) {
                                            if (z10) {
                                                this.f41487d2.n(0L, this.B7);
                                                return false;
                                            }
                                        } else if (this.f41489d4 == 5 && !"hello".equalsIgnoreCase(this.f41476c4) && !"away".equalsIgnoreCase(this.f41476c4) && (this.G6.isEmpty() || this.f41635p4 == 0)) {
                                            if (z10) {
                                                Wb();
                                                return false;
                                            }
                                        } else if (this.f41489d4 == 6 && this.Y.u()) {
                                            if (z10) {
                                                Cb(new kf(this, 15));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21069n0) {
                                                if (z10) {
                                                    kVar2.g(true);
                                                    return false;
                                                }
                                            } else if (this.Kc.f17447f) {
                                                if (z10) {
                                                    xa();
                                                }
                                            } else {
                                                if (z10 && (q60Var = this.f41610n3) != null) {
                                                    q60Var.a(false);
                                                }
                                                return true;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArrayList arrayList;
        p9();
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.G6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.e)))) {
                    org.telegram.ui.Components.d41.u(messageObject, false);
                }
            }
        }
        this.R3 = false;
        q9();
        ArrayList arrayList2 = org.telegram.ui.Components.d41.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        pf.c cVar = this.Nb;
        if (cVar != null) {
            cVar.a(false);
            this.Nb = null;
        }
        this.Q3.detach();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.R3 = true;
        super.onBecomeFullyVisible();
        if (this.O) {
            showDialog(this.N);
        }
        if (this.f41666rb) {
            gk gkVar = this.Y;
            if (gkVar != null) {
                gkVar.G0();
                gk gkVar2 = this.Y;
                gkVar2.T0 = false;
                org.telegram.ui.Components.bg bgVar = gkVar2.U0;
                if (bgVar != null) {
                    bgVar.v(false);
                }
            }
            this.f41666rb = false;
        }
        if (this.H1 != null) {
            AndroidUtilities.runOnUIThread(new ke(this, 1), 600L);
        }
        if (this.D4 && !this.E4) {
            this.E4 = true;
            org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f29203j = 5000;
            M.v = new ke(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ah.f0 f0Var = this.f41580ka;
        if (f0Var != null && f0Var.d()) {
            this.f41580ka.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j10;
        long j11;
        hj hjVar = this.f41594m1;
        if (hjVar != null) {
            hjVar.getViewTreeObserver().addOnPreDrawListener(new vh(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        D7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.E1() || !PhotoViewer.u1().T1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.u1().M2(null, this, this.f41651qa);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer u12 = PhotoViewer.u1();
                    int i10 = playingMessageObject.type;
                    long j12 = 0;
                    if (i10 != 0) {
                        j10 = this.f41516f6;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = this.X6;
                    } else {
                        j11 = 0;
                    }
                    if (i10 != 0) {
                        j12 = d();
                    }
                    if (u12.g2(playingMessageObject, null, null, null, null, null, null, 0, this.Sa, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.u1().l4 = this;
                    }
                    m9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.E1() && PhotoViewer.u1().f33645l2) {
                PhotoViewer u13 = PhotoViewer.u1();
                if (u13.F2.y()) {
                    if (u13.Z2) {
                        u13.F2.N(false);
                    }
                    MediaController.getInstance().injectVideoPlayer(u13.F2, u13.T4);
                    u13.F2 = null;
                }
                PhotoViewer.u1().H0(false, true);
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z10, Runnable runnable) {
        ValueAnimator ofFloat;
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int measuredHeight4;
        ok okVar = this.ia;
        float f7 = 0.0f;
        if (z10 && this.f41495da && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var instanceof sn) {
                this.P4 = true;
                sn snVar = (sn) o2Var;
                snVar.f41519fa = this;
                this.fragmentView.setAlpha(0.0f);
                this.f41558j1.setSkipBackgroundDrawing(true);
                this.f41594m1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f41594m1.getAvatarImageView().setAlpha(0.0f);
                this.f41594m1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.f41506ea = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                gk gkVar = this.Y;
                if (gkVar != null) {
                    gkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                jk jkVar = this.R;
                if (jkVar != null) {
                    jkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                gk gkVar2 = this.Y;
                if (gkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = gkVar2.getMeasuredHeight();
                }
                jk jkVar2 = this.R;
                if (jkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = jkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                gk gkVar3 = snVar.Y;
                if (gkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = gkVar3.getMeasuredHeight();
                }
                jk jkVar3 = this.R;
                if (jkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = jkVar3.getMeasuredHeight();
                }
                this.f41454aa = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ah.l0(11, this, snVar));
                qc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.ha = animatorSet;
                animatorSet.addListener(new ei.n5(this, snVar, runnable));
                this.ha.setDuration(300L);
                this.ha.setInterpolator(org.telegram.ui.Components.zr.f33337f);
                this.ha.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(okVar, 200L);
                return this.ha;
            }
        }
        if (this.f41717va && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var2 instanceof xe1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                o2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f41744xa = f7;
                ofFloat.addUpdateListener(new ui(0, this));
                this.f41730wa = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                km kmVar = this.f41558j1;
                if (kmVar != null) {
                    kmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.ha = animatorSet2;
                animatorSet2.addListener(new vi(this, z10, runnable));
                this.ha.setDuration(150L);
                this.ha.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(okVar, 200L);
                } else {
                    this.ha.start();
                }
                return this.ha;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.c2 c2Var = this.N;
        if (c2Var != null && dialog == c2Var) {
            getMessagesController().deleteDialog(this.f41516f6, 0);
            org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
            if (h5Var != null && !h5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.ov0 ov0Var;
        super.onFragmentDestroy();
        ih.e eVar = this.Z3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f13165w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ih.d dVar = (ih.d) longSparseArray.valueAt(i10);
                if (dVar.f13153i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        gk gkVar = this.Y;
        if (gkVar != null) {
            gkVar.z0();
        }
        hj hjVar = this.f41594m1;
        if (hjVar != null && (ov0Var = hjVar.f28635c0) != null) {
            ov0Var.b(hjVar.G);
        }
        yj yjVar = this.U1;
        if (yjVar != null && yjVar.getAdapter() != null) {
            this.U1.getAdapter().P();
        }
        ci.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.dismissInternal();
        }
        ht o10 = ht.o();
        if (o10.f37996l == this.w9) {
            o10.W = null;
            o10.f37984a0 = null;
            o10.Y = null;
            o10.f37996l = null;
            o10.f37988c0 = null;
            o10.s();
        }
        getNotificationCenter().onAnimationFinish(this.R9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.S9);
        getNotificationCenter().onAnimationFinish(this.T9);
        getNotificationCenter().onAnimationFinish(this.U9);
        q9();
        ke keVar = this.X5;
        if (keVar != null) {
            AndroidUtilities.cancelRunOnUIThread(keVar);
            this.X5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f41769za);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f41516f6;
        if (this.f41489d4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j10, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.f41507eb;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f41507eb = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.f41489d4 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.f41516f6), Long.valueOf(d()), Boolean.TRUE);
        }
        if (this.f41509f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.Q3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f41509f != null) {
            getMessagesController().cancelLoadFullUser(this.f41509f.f20491id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        ci.a3 a3Var2 = this.V1;
        if (a3Var2 != null) {
            a3Var2.B1();
            this.V1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.e)) {
            getMessagesController().startShortPoll(this.e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.f41589l8;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.f41589l8.linked_chat_id)), this.classGuid, true);
            }
        }
        lm lmVar = this.f41629o9;
        if (lmVar != null) {
            lmVar.f(false);
        }
        pj pjVar = this.f41748y0;
        if (pjVar != null) {
            pjVar.N();
        }
        pk pkVar = this.Ia;
        if (pkVar != null) {
            pkVar.b();
        }
        this.f41617na = null;
        org.telegram.ui.ActionBar.h5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f41443cd ? 1 : 0);
            org.telegram.ui.ActionBar.h5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.l9) parentLayout2.getPulledDialogs().get(i11)).f28273b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        f41443cd = false;
        pf.c cVar = this.Nb;
        if (cVar != null) {
            cVar.a(false);
            this.Nb = null;
        }
        this.f41679sa.onFragmentDestroy();
        t01 t01Var = this.f41628o8;
        if (t01Var != null) {
            t01Var.b(true);
            this.f41628o8 = null;
        }
        ai.q7 q7Var = this.Dc;
        if (q7Var != null) {
            q7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.Dc);
            this.Dc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f41745xb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.I8, null, null, false);
        }
        ai.q7 q7Var = this.Dc;
        if (q7Var != null) {
            q7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.Dc);
            this.Dc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        ci.a3 a3Var;
        ci.a3 a3Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ri riVar;
        gk gkVar = this.Y;
        boolean z12 = false;
        if (gkVar != null && i10 == 2 && gkVar.f24112j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(gkVar.Q).sendCurrentLocation(gkVar.f24106i3, gkVar.f24112j3);
            }
            gkVar.f24112j3 = null;
            gkVar.f24106i3 = null;
        }
        yj yjVar = this.U1;
        if (yjVar != null && yjVar.getAdapter() != null) {
            hg.j1 adapter = this.U1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f11974w0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.I0.start();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i10 == 4) {
            ci.a3 a3Var3 = this.V1;
            if (a3Var3 != null) {
                a3Var3.f30158j0.Y();
            }
            org.telegram.ui.Components.up upVar = this.f41617na;
            if (upVar != null && (riVar = upVar.X) != null) {
                riVar.f30158j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (a3Var = this.V1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                a3Var.J1();
            }
        } else if ((i10 == 17 || i10 == 18) && (a3Var2 = this.V1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = a3Var2.f30158j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.V1.f30158j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41651qa);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new nh(this));
                org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(2);
        } else if (((i10 != 101 && i10 != 102) || this.f41509f == null) && (i10 != 103 || this.e == null)) {
        } else {
            int i11 = 0;
            while (true) {
                if (i11 < iArr.length) {
                    if (iArr[i11] != 0) {
                        z10 = false;
                        break;
                    }
                    i11++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (iArr.length > 0 && z10) {
                if (i10 == 103) {
                    org.telegram.ui.Components.voip.d2.l(this.e, null, this.f41578k8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f41509f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f41601m8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.d2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f41509f.f20491id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        gk gkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.u9[] u9VarArr;
        ah.x xVar;
        super.onResume();
        g7();
        this.Q9 = System.currentTimeMillis();
        if (this.D9 && getSendMessagesHelper().getImportingHistory(this.f41516f6) != null) {
            org.telegram.ui.Components.e50 e50Var = new org.telegram.ui.Components.e50(getParentActivity(), null, this, this.f41651qa);
            e50Var.setOnHideListener(new oe(this, 0));
            showDialog(e50Var);
            this.D9 = false;
        }
        K6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        Z6();
        ci.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.E1();
        }
        km kmVar = this.f41558j1;
        boolean z12 = true;
        if (kmVar != null) {
            org.telegram.ui.Components.o91 o91Var = kmVar.v;
            if (o91Var != null) {
                o91Var.c(true);
            }
            kmVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new ke(this, 23), 1000L);
        }
        b9 b9Var = new b9(this, 2);
        this.f41605mc = b9Var;
        setBulletinDelegate(b9Var);
        J6(false);
        TLRPC.PhotoSize photoSize = this.I5;
        if (photoSize != null && (xVar = this.f41445a0) != null) {
            ((org.telegram.ui.Components.yo[]) xVar.f900b)[0].f33014f.k(ImageLocation.getForObject(photoSize, this.K5), "50_50", ImageLocation.getForObject(this.J5, this.K5), "50_50_b", this.G5, null, this.f41764z5, this.H5);
        }
        if (this.O5 != null && (u9VarArr = this.N2) != null) {
            u9VarArr[0].k(ImageLocation.getForObject(this.O5, this.Q5), "50_50", ImageLocation.getForObject(this.P5, this.Q5), "50_50_b", this.L5, null, (MessageObject) this.V4.get(Integer.valueOf(this.X4)), this.M5);
            u9VarArr[0].setHasBlur(this.N5);
        }
        if (this.f41489d4 == 0) {
            getNotificationsController().setOpenedDialogId(this.f41516f6, d());
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f41516f6;
        if (this.f41489d4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j10, z10, true);
        if (this.f41478c6) {
            if (this.f41503e6 && (messageObject = this.W7) != null) {
                if (this.f41734x0 != null) {
                    int i10 = this.f41517f8;
                    if (i10 == -9000) {
                        i10 = P8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f41759z0.i1(this.G6.indexOf(this.W7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f41759z0.i1(this.G6.indexOf(this.W7) + this.A0.J, i10, z11);
                }
            } else {
                T9(false);
            }
            this.f41503e6 = false;
            this.f41478c6 = false;
            this.W7 = null;
        }
        this.C5 = false;
        this.D5 = false;
        d7(false);
        if (this.E5) {
            this.E5 = false;
            em emVar = this.A0;
            if (emVar != null) {
                emVar.O(false);
            }
        }
        hj hjVar = this.f41594m1;
        if (hjVar != null) {
            hjVar.getViewTreeObserver().addOnPreDrawListener(new vh(this, 0));
        }
        D6(false, false);
        if (this.Y != null && this.f41489d4 == 0 && this.ua != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.f41516f6 && (arrayList2 = this.ua.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new e80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.ua.entities;
            }
            CharSequence p5 = ChatActivityEnterView.p(arrayList, this.ua.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (p5 != null && p5.length() > 0 && p5.charAt(0) == '@') {
                p5 = TextUtils.concat(" ", p5);
            }
            this.Y.c1(p5, true);
            this.ua = null;
        }
        kk kkVar = this.f41446a1;
        if (kkVar != null && kkVar.getVisibility() != 0 && !this.actionBar.f21069n0 && this.f41489d4 != 7 && !org.telegram.ui.ActionBar.o2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        gk gkVar2 = this.Y;
        if (gkVar2 != null) {
            gkVar2.C0();
        }
        if (this.f41509f != null) {
            this.B8 = System.currentTimeMillis();
            this.C8 = 0L;
        }
        if (this.E8 != null) {
            AndroidUtilities.runOnUIThread(new ke(this, 3));
        }
        if (this.f41734x0 != null && ((gkVar = this.Y) == null || !gkVar.o0())) {
            this.f41734x0.setOnItemLongClickListener(this.Wa);
            this.f41734x0.setOnItemClickListener(this.Xa);
            this.f41734x0.setLongClickable(true);
        }
        org.telegram.ui.Components.m61.h = false;
        TLRPC.User user = this.f41509f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.m61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.f41589l8;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.f41589l8.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.f41589l8.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.m61.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                if (chatFull.bot_info.isEmpty() || (chat = this.e) == null || !chat.megagroup) {
                    z12 = false;
                }
                org.telegram.ui.Components.m61.h = z12;
            }
        }
        Uc(false);
        Ob();
        if (this.Z9 != 0.0f) {
            this.Z9 = 0.0f;
            this.f41734x0.invalidate();
        }
        this.Q3.attach();
        ai.q7 q7Var = this.Dc;
        if (q7Var != null) {
            q7Var.bringToFront();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        int themedColor;
        int themedColor2;
        int themedColor3;
        int themedColor4;
        try {
            super.onThemeColorsChanged();
            gh.d dVar = this.H;
            if (dVar != null) {
                dVar.f();
            }
            gh.d dVar2 = this.I;
            if (dVar2 != null) {
                dVar2.f();
            }
            Paint paint = this.S8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21463s8));
            }
            RadialProgressView radialProgressView = this.f41631p0;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21278ic));
            }
            kk kkVar = this.f41446a1;
            if (kkVar != null) {
                kkVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.k6.Oh));
            }
            lk lkVar = this.F0;
            if (lkVar != null && lkVar.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.k6.Oh)) != this.I0 || this.f41640pb != org.telegram.ui.ActionBar.k6.I.q())) {
                this.I0 = themedColor4;
                this.f41640pb = org.telegram.ui.ActionBar.k6.I.q();
                Drawable background = this.F0.getBackground();
                org.telegram.ui.ActionBar.k6.E1(background, themedColor4, false);
                org.telegram.ui.ActionBar.k6.E1(background, org.telegram.ui.ActionBar.a6.b(themedColor4), true);
            }
            fb();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Set<org.telegram.ui.ActionBar.s0> set = this.S0;
        Set<org.telegram.ui.ActionBar.s0> set2 = this.R0;
        try {
            RadialProgressView radialProgressView2 = this.G0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.H0));
            }
            NumberTextView numberTextView = this.R2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21226fe));
            }
            RadialProgressView radialProgressView3 = this.W2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21208ee));
            }
            org.telegram.ui.Components.w90 w90Var = this.f41512f2;
            if (w90Var != null && this.P0) {
                w90Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21245ge));
            }
            if (this.M0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.f21572y6)) != this.J0) {
                this.J0 = themedColor3;
                this.M0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.N0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Oh)) != this.K0) {
                this.K0 = themedColor2;
                this.N0.setTint(themedColor2);
            }
            if (this.O0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.H6)) != this.L0) {
                this.L0 = themedColor;
                this.O0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            rh.c cVar = this.Qc;
            if (cVar != null && (i10 = this.Q0) >= 0) {
                cVar.setColor(getThemedColor(i10));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.k6.f21405p7);
                for (org.telegram.ui.ActionBar.s0 s0Var : set2) {
                    if (s0Var != null) {
                        s0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f21405p7, false);
                for (org.telegram.ui.ActionBar.s0 s0Var2 : set) {
                    if (s0Var2 != null) {
                        s0Var2.a(x02, x02);
                    }
                }
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.pd pdVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.f41450a6) {
                this.f41450a6 = true;
                Bc();
            }
            iArr = this.R9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.Z5 = false;
            if (!z11) {
                this.f41464b6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f41509f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            gk gkVar = this.Y;
            if (gkVar != null && (pdVar = gkVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(pdVar);
                gkVar.S1 = null;
            }
        }
        g7();
        this.R9 = getNotificationCenter().setAnimationInProgress(this.R9, iArr);
    }

    @Override
    public final org.telegram.ui.Components.mo p() {
        return this.f41594m1;
    }

    public final void p7() {
        float f7;
        org.telegram.ui.Components.lf lfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + b9(org.telegram.ui.Components.r31.f30058c) + this.v.d();
        gk gkVar = this.Y;
        if (gkVar != null && (lfVar = gkVar.m0) != null) {
            lfVar.setTranslationY(-inputBubbleHeight);
        }
        yj yjVar = this.U1;
        if (yjVar != null) {
            if (yjVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            yjVar.setTranslationY(f7);
        }
    }

    public final void p8(boolean z10) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.f41589l8 != null && !ChatObject.isNotInChat(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.f41589l8;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f41654r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f41654r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.f41589l8.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f41589l8.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f41654r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f41654r == 0) {
                getMessagesController().checkChatInviter(this.e.f20344id, false);
            }
        }
    }

    public final void p9() {
        wk wkVar = this.f41618nb;
        if (wkVar == null) {
            return;
        }
        this.f41618nb = null;
        wkVar.e();
        if (wkVar.getReactionsWindow() != null && wkVar.getReactionsWindow().f869a != null) {
            wkVar.getReactionsWindow().f869a.animate().alpha(0.0f).setDuration(180L).start();
        }
        wkVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new eh(6, this, wkVar)).setDuration(180L).start();
    }

    public final void pa(TLRPC.Chat chat) {
        boolean z10;
        ei.x3 x3Var = this.H1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.I1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new eh(0, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21069n0) {
            this.Nc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f41534h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41497e0;
            if (xVar != null) {
                xVar.f(8);
            }
            wr wrVar = this.f41485d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f41545i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f41557j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.W9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f41607n0;
            if (xVar3 != null && this.X9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f41570k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f41620o0 = true;
            Mc(0, 0, -1);
            oc(false);
            ImageView imageView = this.f41500e3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f41513f3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f41557j0;
        if (u0Var5 != null) {
            this.f41653qc = true;
            this.f41550i5 = false;
            u0Var5.z(false);
            this.f41653qc = false;
        }
        db(chat, null);
        Fc(0, true);
    }

    public final void pb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                pb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f41734x0 && view != this.f41558j1) {
            view.setEnabled(z10);
        }
    }

    public final void pc() {
        oc(false);
    }

    @Override
    public final void q() {
        if (!this.f41686t4) {
            if (this.f41509f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f41509f.f20491id));
                if (user != null) {
                    this.f41509f = user;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.e.f20344id));
                if (chat != null) {
                    this.e = chat;
                } else {
                    return;
                }
            }
            hj hjVar = this.f41594m1;
            if (hjVar != null) {
                hjVar.b();
            }
        }
    }

    public final void q7() {
        float d;
        if (this.f41734x0 != null) {
            if (this.f41469bb && this.f41639pa == null) {
                d = AndroidUtilities.navigationBarHeight;
            } else {
                d = this.v.d() + b9(org.telegram.ui.Components.r31.f30058c) + AndroidUtilities.dp(16.0f) + this.Na + this.Gc;
            }
            int i10 = (int) this.E9;
            org.telegram.ui.Components.v31 v31Var = this.f41487d2;
            if (v31Var != null) {
                v31Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            ih.g gVar = this.f41721w0;
            boolean z10 = this.f41734x0.V1;
            RecyclerView recyclerView = gVar.f13178a;
            int i11 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new ah.g(gVar, i12, 13));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            ih.e eVar = this.Z3;
            if (eVar != null) {
                RectF rectF = eVar.f13159b;
                rectF.set(b9(org.telegram.ui.Components.r31.f30057b), i10 - this.G, 0.0f, d - this.Na);
                eVar.f13160c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void q8(org.telegram.messenger.MessageObject r60, java.util.ArrayList r61, java.util.ArrayList r62, java.util.ArrayList r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.q8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void q9() {
        UndoView undoView = this.K3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.oc ocVar = this.M3;
        if (ocVar != null) {
            ocVar.c(0L, false);
        }
        cl clVar = this.L3;
        if (clVar != null) {
            clVar.d(0, true);
        }
    }

    public final void qa(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i11;
        ei.x3 x3Var = this.H1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.I1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new re(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21069n0) {
            this.Nc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f41534h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41497e0;
            if (xVar != null) {
                xVar.f(8);
            }
            wr wrVar = this.f41485d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f41545i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            if ((this.f41635p4 == 0 || (i11 = this.f41489d4) == 3 || i11 == 8) && (u0Var = this.f41557j0) != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.W9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f41607n0;
            if (xVar3 != null && this.X9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f41570k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f41620o0 = true;
            Mc(0, 0, -1);
            oc(false);
        }
        if ((this.f41635p4 == 0 || this.f41686t4 || (i10 = this.f41489d4) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f41509f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f41550i5 = z11;
            org.telegram.ui.ActionBar.u0 u0Var5 = this.f41557j0;
            if (u0Var5 != null) {
                u0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f41557j0;
        if (u0Var6 != null) {
            u0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.F3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.f41516f6, this.X6, this.classGuid, 0, this.f41635p4, false, this.A3, this.B3, !TextUtils.isEmpty(str), this.C3);
        Fc(0, true);
    }

    public final void qb(boolean z10) {
        rb(z10, false, true);
    }

    public final void qc() {
        int i10;
        org.telegram.ui.Components.sb sbVar;
        sk skVar;
        gk gkVar;
        if (this.P9 && this.f41734x0 != null) {
            float f7 = 0.0f;
            if (this.Ba <= 0 || this.Qa != 0.0f) {
                float a92 = a9(AndroidUtilities.dp(7.0f));
                rk rkVar = this.A1;
                if (rkVar != null) {
                    i10 = AndroidUtilities.dp(rkVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float E8 = (E8() * AndroidUtilities.dp(43.0f)) + a92 + i10;
                float f10 = this.E9;
                this.F9 = E8;
                this.E9 = b9(org.telegram.ui.Components.r31.f30056a) + AndroidUtilities.dp(4.0f) + this.H9 + E8;
                if (this.actionBar.getVisibility() == 0 || this.f41639pa != null) {
                    this.E9 += this.actionBar.getMeasuredHeight();
                }
                this.G9 = 0;
                this.E9 = this.E9 + this.Ma + this.I9;
                if (this.Qa != 0.0f && (gkVar = this.Y) != null && gkVar.getVisibility() == 0) {
                    float f11 = this.E9;
                    float measuredHeight = this.Qa * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.E9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.v0 v0Var = this.f41585l3;
                if (v0Var != null) {
                    v0Var.setTranslationY(((this.f41734x0.getTranslationY() + this.E9) + this.M9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.E9;
                    float f13 = this.M9;
                    this.E9 = f12 + f13;
                    this.G9 = (int) (this.G9 + f13);
                }
                xj xjVar = this.f41560j3;
                if (xjVar != null) {
                    xjVar.setTranslationY((((this.f41734x0.getTranslationY() - f7) + this.E9) + this.K9) - AndroidUtilities.dp(4.0f));
                }
                sc();
                nj njVar = this.f41734x0;
                if (njVar != null && this.f41759z0 != null && this.A0 != null) {
                    int paddingTop = njVar.getPaddingTop();
                    int paddingBottom = this.f41734x0.getPaddingBottom();
                    q7();
                    if (this.f41734x0.getPaddingTop() != paddingTop || this.f41734x0.getPaddingBottom() != paddingBottom) {
                        w9();
                        v9(2);
                    }
                    this.f41734x0.setTopGlowOffset((int) ((this.E9 - this.G9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.E9) {
                        int childCount = this.f41734x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f41734x0.getChildAt(i11);
                            this.f41734x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.E9;
                                if (childAt.getTop() > f14) {
                                    this.f41734x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!K9() && !this.P4 && this.V7 != null && this.f41734x0 != null && ((skVar = this.f41460b2) == null || skVar.getVisibility() != 0)) {
                        this.f41734x0.scrollBy(0, (int) (f10 - this.E9));
                    }
                }
                this.P9 = false;
                org.telegram.ui.Components.oc ocVar = org.telegram.ui.Components.oc.f29196w;
                if (ocVar != null && (sbVar = ocVar.e) != null) {
                    sbVar.updatePosition();
                }
                q7();
            }
        }
    }

    public final void r7() {
        FrameLayout frameLayout = this.f41473c1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int r8() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4 = this.G6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.V7);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i12 = 0;
        int i13 = 0;
        int i14 = -1;
        for (int i15 = 0; i15 < arrayList4.size(); i15++) {
            MessageObject messageObject = (MessageObject) arrayList4.get(i15);
            int approximateHeightCached = messageObject.getApproximateHeightCached();
            arrayList5.add(Integer.valueOf(approximateHeightCached));
            if (messageObject.isSponsored() || i15 == indexOf) {
                if (i15 == indexOf) {
                    i14 = i12;
                }
                arrayList7.add(Integer.valueOf(i15));
                arrayList6.add(Integer.valueOf(i12));
                arrayList8.add(Integer.valueOf(i13));
            }
            if (messageObject.hasValidGroupIdFast()) {
                if (!hashSet.contains(Long.valueOf(messageObject.getGroupId()))) {
                    hashSet.add(Long.valueOf(messageObject.getGroupId()));
                }
            }
            i13++;
            i12 += approximateHeightCached;
        }
        int size = arrayList7.size();
        if (indexOf >= 0) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        if (size - i10 <= 0) {
            return 0;
        }
        hashSet.clear();
        int i16 = 0;
        while (indexOf >= 0) {
            MessageObject messageObject2 = (MessageObject) arrayList4.get(indexOf);
            int intValue = ((Integer) arrayList5.get(indexOf)).intValue();
            if (messageObject2.hasValidGroupIdFast()) {
                if (!hashSet.contains(Long.valueOf(messageObject2.getGroupId()))) {
                    hashSet.add(Long.valueOf(messageObject2.getGroupId()));
                }
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.V7) {
                    i11 = i16;
                } else {
                    int i17 = 0;
                    int i18 = -1;
                    int i19 = -1;
                    int i20 = -1;
                    int i21 = -1;
                    int i22 = -1;
                    int i23 = -1;
                    while (i17 < arrayList7.size()) {
                        int intValue2 = ((Integer) arrayList7.get(i17)).intValue();
                        int i24 = i16;
                        if (intValue2 >= indexOf && (i19 == -1 || i19 > intValue2)) {
                            i21 = ((Integer) arrayList6.get(i17)).intValue();
                            i20 = ((Integer) arrayList8.get(i17)).intValue();
                            i19 = intValue2;
                        }
                        if (intValue2 <= indexOf && (i18 == -1 || i18 < intValue2)) {
                            i22 = ((Integer) arrayList6.get(i17)).intValue();
                            i23 = ((Integer) arrayList8.get(i17)).intValue();
                            i18 = intValue2;
                        }
                        i17++;
                        i16 = i24;
                    }
                    i11 = i16;
                    int i25 = -1;
                    if (i19 != -1) {
                        if (Math.abs(i19 - indexOf) > this.Wb + 1 && Math.abs(i20 - i11) > this.Wb + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i18 == i25 || (Math.abs(i18 - indexOf) > this.Wb + 1 && Math.abs(i23 - i11) > this.Wb + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
                        return indexOf;
                    }
                }
                indexOf--;
                i16 = i11;
            }
            i16--;
            i14 -= intValue;
            if (!messageObject2.isSponsored()) {
            }
            i11 = i16;
            indexOf--;
            i16 = i11;
        }
        hashSet.clear();
        int i26 = 0;
        int i27 = 0;
        int i28 = 0;
        while (i26 < arrayList4.size()) {
            MessageObject messageObject3 = (MessageObject) arrayList4.get(i26);
            int intValue3 = ((Integer) arrayList5.get(i26)).intValue();
            if (!messageObject3.hasValidGroupIdFast()) {
                i27++;
                i28 += intValue3;
            } else if (!hashSet.contains(Long.valueOf(messageObject3.getGroupId()))) {
                hashSet.add(Long.valueOf(messageObject3.getGroupId()));
                i27++;
            }
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.V7) {
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                arrayList3 = arrayList7;
            } else {
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                int i29 = 0;
                int i30 = -1;
                int i31 = -1;
                int i32 = -1;
                int i33 = -1;
                int i34 = -1;
                int i35 = -1;
                while (i29 < arrayList7.size()) {
                    int intValue4 = ((Integer) arrayList7.get(i29)).intValue();
                    ArrayList arrayList9 = arrayList7;
                    if (intValue4 >= i26 && (i33 == -1 || i33 > intValue4)) {
                        i35 = ((Integer) arrayList6.get(i29)).intValue();
                        i34 = ((Integer) arrayList8.get(i29)).intValue();
                        i33 = intValue4;
                    }
                    if (intValue4 <= i26 && (i30 == -1 || i30 < intValue4)) {
                        i31 = ((Integer) arrayList6.get(i29)).intValue();
                        i32 = ((Integer) arrayList8.get(i29)).intValue();
                        i30 = intValue4;
                    }
                    i29++;
                    arrayList7 = arrayList9;
                }
                arrayList3 = arrayList7;
                int i36 = -1;
                if (i33 != -1) {
                    if (Math.abs(i33 - i26) >= this.Wb + 1 && Math.abs(i34 - i27) >= this.Wb + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.Wb + 1 && Math.abs(i32 - i27) >= this.Wb + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
                    return i26;
                }
            }
            i26++;
            arrayList5 = arrayList;
            arrayList4 = arrayList2;
            arrayList7 = arrayList3;
        }
        return -1;
    }

    public final void r9() {
        boolean z10;
        Mc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.F3, this.f41516f6, this.X6, this.classGuid, 0, this.f41635p4, this.A3, this.B3, this.C3);
        if (TextUtils.isEmpty(this.F3) && this.C3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.E3 = z10;
        this.f41620o0 = z10;
        oc(false);
        Pc();
    }

    public final void ra(TLRPC.User user) {
        boolean z10;
        ei.x3 x3Var = this.H1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.I1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new bg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21069n0) {
            this.Nc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f41534h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41497e0;
            if (xVar != null) {
                xVar.f(8);
            }
            wr wrVar = this.f41485d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f41545i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f41557j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.W9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f41607n0;
            if (xVar3 != null && this.X9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f41570k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f41620o0 = true;
            Mc(0, 0, -1);
            oc(false);
            ImageView imageView = this.f41500e3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f41513f3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f41557j0;
        if (u0Var5 != null) {
            this.f41653qc = true;
            this.f41550i5 = false;
            u0Var5.z(false);
            this.f41653qc = false;
        }
        db(null, user);
        Fc(0, true);
    }

    public final void rb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.rb(boolean, boolean, boolean):void");
    }

    public final void rc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.f41592lb == null) {
            this.f41592lb = new a0.h();
        }
        a0.h hVar2 = this.f41581kb;
        if (hVar2 == null) {
            this.f41581kb = new a0.h();
        } else {
            hVar2.b();
        }
        this.A0.P.clear();
        this.f41592lb.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.J6;
            arrayList = this.G6;
            z11 = true;
            if (i10 >= size) {
                break;
            }
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    messageObject = (MessageObject) arrayList.get(i11);
                    if (messageObject.getDialogId() == messageObject2.getDialogId() && messageObject.getId() == messageObject2.getId()) {
                        break;
                    }
                    i11++;
                } else {
                    messageObject = null;
                    break;
                }
            }
            if (messageObject2.stableId == 0) {
                if (messageObject == null) {
                    messageObject2.checkMediaExistance();
                } else {
                    messageObject2.mediaExists = messageObject.mediaExists;
                    messageObject2.attachPathExists = messageObject.attachPathExists;
                }
            }
            if (messageObject != null) {
                messageObject2.isSaved = messageObject.isSaved;
                if (this.A0.N && messageObject2.stableId != 0) {
                    messageObject.copyStableParams(messageObject2);
                } else {
                    messageObject2.copyStableParams(messageObject);
                }
            } else if (messageObject2.stableId == 0) {
                int i12 = Xc;
                Xc = i12 + 1;
                messageObject2.stableId = i12;
            }
            messageObject2.isOutOwnerCached = null;
            TLRPC.Message message2 = messageObject2.messageOwner;
            if (message2 != null) {
                message2.out = true;
            }
            messageObject2.isOutOwner();
            if (messageObject2.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupIdForUse());
                if (groupedMessages2 == null) {
                    groupedMessages2 = new MessageObject.GroupedMessages();
                    groupedMessages2.reversed = this.f41483cb;
                    long groupId = messageObject2.getGroupId();
                    groupedMessages2.groupId = groupId;
                    hVar.k(groupedMessages2, groupId);
                } else if (hVar3 == null || hVar3.h(messageObject2.getGroupId()) < 0) {
                    if (hVar4 == null) {
                        hVar4 = new a0.h();
                    }
                    hVar4.k(groupedMessages2, messageObject2.getGroupId());
                }
                if (hVar3 == null) {
                    hVar3 = new a0.h();
                }
                hVar3.k(groupedMessages2, groupedMessages2.groupId);
                if (groupedMessages2.getPosition(messageObject2) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < groupedMessages2.messages.size()) {
                            if (groupedMessages2.messages.get(i13).getId() == messageObject2.getId()) {
                                break;
                            }
                            i13++;
                        } else {
                            groupedMessages2.messages.add(messageObject2);
                            break;
                        }
                    }
                }
            } else if (messageObject2.getGroupIdForUse() != 0) {
                messageObject2.messageOwner.grouped_id = 0L;
                messageObject2.localSentGroupId = 0L;
            }
            this.A0.P.add(messageObject2);
            this.f41592lb.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (hVar3 != null) {
            for (int i14 = 0; i14 < hVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new org.telegram.ui.ActionBar.l4(7));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.C3 != null && TextUtils.isEmpty(this.F3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.C3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
                            arrayList3.add(messageObject3);
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
            }
        }
        for (int i17 = 0; i17 < arrayList3.size(); i17++) {
            MessageObject messageObject4 = (MessageObject) arrayList3.get(i17);
            if (!this.f41592lb.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.A0.P.add(messageObject4);
                this.f41592lb.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.A0.P.size()) {
            MessageObject messageObject5 = (MessageObject) this.A0.P.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.f41592lb.d(messageObject6.getId())) {
                        this.A0.P.add(i18, messageObject6);
                        this.f41592lb.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.A0.P, new org.telegram.ui.ActionBar.l4(8));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.A0.P.size()) {
            MessageObject messageObject8 = (MessageObject) this.A0.P.get(i19);
            if (this.f41483cb && messageObject8 != null && i19 == 0) {
                Ha(messageObject8, i19);
                i19++;
            }
            if (!this.f41483cb && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ha(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.f41581kb.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.v0.j(messageObject8.dateKeyInt, this.f41581kb);
            }
            arrayList4.add(messageObject8);
            if (this.f41483cb && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ha(messageObject8, i19);
                i19++;
            }
            if (!this.f41483cb && i19 >= this.A0.P.size() - 1) {
                Ha(messageObject8, this.A0.P.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.A0.O = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.A0.T();
            this.A0.O(true);
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.S6 || !arrayList.isEmpty() || this.A0.f36949w >= 0) {
                z11 = false;
            }
            Vb(z11);
            if (this.f41734x0 != null) {
                J7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.S6 || !arrayList.isEmpty() || this.A0.f36949w >= 0)) {
                    this.f41734x0.setEmptyView(this.f41473c1);
                    nj njVar = this.f41734x0;
                    njVar.K0(njVar.z1());
                    return;
                }
                this.f41473c1.setVisibility(8);
                this.f41734x0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f41542h8 = bundle.getString("path");
    }

    @Override
    public final void s(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.Jc.a(false, true);
        MessageObject messageObject = this.B5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.B5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f41674s5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.B5.messageOwner.suggested_post);
            }
            if (!ai.ha.U(this.currentAccount, messageSuggestionParams.amount)) {
                Zb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            kf kfVar = new kf(this, 26);
            this.C7 = kfVar;
            AndroidUtilities.runOnUIThread(kfVar, 3000L);
        }
        o8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.d5.a0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                sn snVar = sn.this;
                MessageObject messageObject2 = snVar.B5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = snVar.f41674s5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(snVar.B5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(snVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, snVar.f41516f6, snVar.B5, snVar.f41561j4, null, snVar.f41739x5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, snVar.f41516f6, snVar.B5, snVar.f41561j4, null, snVar.f41739x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, snVar.f41516f6, snVar.B5, snVar.f41561j4, null, snVar.f41739x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(snVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, null, snVar.f41739x5, photoEntry2.entities, photoEntry2.ttl, snVar.B5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), snVar.f41674s5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, null, snVar.f41739x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, snVar.B5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), snVar.f41674s5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, snVar.f41516f6, snVar.f41764z5, snVar.f41561j4, null, snVar.f41739x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, snVar.B5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), snVar.f41674s5);
                }
                snVar.B6();
            }
        }, j10);
    }

    public final void s7() {
        int i10;
        float f7 = this.Oc.e;
        org.telegram.ui.Components.k40 k40Var = this.F1;
        int i11 = 8;
        if (k40Var != null) {
            k40Var.setAlpha(f7);
            org.telegram.ui.Components.k40 k40Var2 = this.F1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            k40Var2.setVisibility(i10);
        }
        ai.u1 u1Var = this.X3;
        if (u1Var != null) {
            float f10 = 1.0f - f7;
            u1Var.setAlpha(f10);
            ai.u1 u1Var2 = this.X3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            u1Var2.setVisibility(i11);
        }
    }

    public final void s9() {
        this.f41558j1.invalidate();
        Iterator it = this.f41747y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void sa(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.f41594m1.e(true, false);
            } else if (getMessagesController().isCommunity(j10)) {
                showDialog(new hi.k0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new sn(bundle));
                }
            }
        } else if (j10 != getUserConfig().getClientUserId()) {
            if (j10 == a()) {
                this.f41594m1.e(true, false);
                return;
            }
            Bundle e = si.o0.e(j10, "user_id");
            if (this.h != null && j10 == this.f41509f.f20491id) {
                e.putLong("dialog_id", this.f41516f6);
            }
            ProfileActivity profileActivity = new ProfileActivity(e, null);
            TLRPC.User user = this.f41509f;
            if (user != null && user.f20491id == j10) {
                i10 = 1;
            }
            profileActivity.Q4(i10);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j10);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        kf kfVar = this.Ca;
        if (kfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kfVar);
        }
        gk gkVar = this.Y;
        if (gkVar != null && this.f41558j1 != null && gkVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f21722f) {
            this.Ba = this.f41558j1.getKeyboardHeight();
        } else {
            this.Ba = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f41542h8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(int i10, int i11, String str) {
        this.X7 = i10;
        this.Z7 = true;
        this.f41452a8 = 0L;
        this.f41466b8 = str;
        this.f41504e8 = i11;
        this.Y7 = true;
    }

    public final void sc() {
        int i10;
        vj vjVar = this.f41573k3;
        if (vjVar == null) {
            return;
        }
        vjVar.setTranslationX(W8() / 2.0f);
        this.f41573k3.setTranslationY((((this.f41734x0.getTranslationY() + this.E9) + this.L9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.L9, -this.f41573k3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f41573k3.setAlpha(this.f41698u3 * clamp);
        vj vjVar2 = this.f41573k3;
        if (this.f41698u3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        vjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.f41573k3.setScaleX(lerp);
        this.f41573k3.setScaleY(lerp);
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.y m10 = kVar.m();
            if (this.inMenuMode) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            m10.setVisibility(i10);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TLRPC.Message message;
        long j10;
        org.telegram.ui.ActionBar.h2 h2Var;
        float f7;
        float f10;
        gk gkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f41509f != null && this.f41607n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f41509f.f20491id);
            if (userFull != null && userFull.phone_calls_available) {
                this.X9 = !this.inPreviewMode;
                this.f41607n0.f(0);
            } else {
                this.X9 = false;
                this.f41607n0.f(8);
            }
        }
        hj hjVar = this.f41594m1;
        float f12 = 0.0f;
        if (hjVar != null) {
            hjVar.setOccupyStatusBar(!z10);
            hj hjVar2 = this.f41594m1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            hjVar2.setLayoutParams(w7.z5.d(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        gk gkVar2 = this.Y;
        if (gkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            gkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.kz0 kz0Var = this.f41632p1;
        if (kz0Var != null) {
            if (this.f41586l5 && !z10 && ((gkVar = this.Y) == null || !gkVar.f24201z3)) {
                i11 = 0;
            }
            kz0Var.setVisibility(i11);
        }
        yj yjVar = this.U1;
        if (yjVar != null) {
            ViewPropertyAnimator animate = yjVar.animate();
            if (!this.Y.f24201z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.zr.f33337f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                h2Var = new org.telegram.ui.ActionBar.h2(false);
            } else {
                h2Var = null;
            }
            kVar.setBackButtonDrawable(h2Var);
            org.telegram.ui.ActionBar.u0 u0Var = this.f41534h0;
            if (u0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41497e0;
            if (xVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                xVar.f21946i = f12;
                org.telegram.ui.ActionBar.u0 u0Var2 = xVar.f21950m;
                if (u0Var2 != null) {
                    u0Var2.setAlpha(f12);
                }
            }
        }
        nj njVar = this.f41734x0;
        if (njVar != null) {
            int childCount = njVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f41734x0.getChildAt(i12);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.t1;
                if (z14) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i13 = this.f41740x6 - 1;
                        this.f41740x6 = i13;
                        if (i13 <= 0) {
                            this.f41740x6 = 0;
                            this.f41753y6 = true;
                            Qb(false);
                        } else {
                            this.f41708v1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.e)) {
                            j10 = this.e.f20344id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j10, this.f41516f6);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        t1Var.setHighlighted(false);
                        t1Var.N3();
                    }
                }
            }
            this.f41734x0.setItemAnimator(null);
        }
        oc(false);
        Rc();
        ak akVar = this.f41559j2;
        if (akVar != null) {
            if (!z10 && !this.f41469bb) {
                z12 = true;
            } else {
                z12 = false;
            }
            akVar.setEnabled(z12);
        }
        ak akVar2 = this.f41584l2;
        if (akVar2 != null) {
            if (!z10 && !this.f41469bb) {
                z11 = true;
            } else {
                z11 = false;
            }
            akVar2.setEnabled(z11);
        }
        dl dlVar = this.J2;
        if (dlVar != null) {
            dlVar.setEnabled(!isInPreviewMode());
        }
        km kmVar = this.f41558j1;
        if (kmVar != null) {
            kmVar.setOccupyStatusBar((this.inBubbleMode || this.f41469bb || this.inPreviewMode) ? false : false);
        }
    }

    public final void t7() {
        if (this.f41558j1 == null) {
            return;
        }
        this.Gc = F6(false);
        this.Hc = F6(true);
        this.S.setInputBubbleHeight(this.Gc);
        Dc();
        nc();
        p7();
        m7();
        r7();
        q7();
    }

    public final org.telegram.ui.Cells.z t8(int i10, boolean z10) {
        MessageObject messageObject;
        nj njVar = this.f41734x0;
        if (njVar != null) {
            int childCount = njVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f41734x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.E9 - this.G9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f41734x0.getMeasuredHeight() - this.Na) {
                            return null;
                        }
                    }
                    return (org.telegram.ui.Cells.z) childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final void t9() {
        if (!this.P9) {
            this.P9 = true;
            km kmVar = this.f41558j1;
            if (kmVar != null) {
                kmVar.invalidate();
            }
            nj njVar = this.f41734x0;
            if (njVar != null) {
                njVar.invalidate();
            }
        }
        UndoView undoView = this.K3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(b9(org.telegram.ui.Components.r31.f30058c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(16.0f));
        }
        y7();
    }

    public final void ta(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.u1().M2(null, this, this.f41651qa);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.u1().T1()) {
                PhotoViewer.u1().H0(false, false);
            }
            PhotoViewer.u1().i2(arrayList, 0, 0, false, new ml(this, createVideoThumbnail, arrayList), this);
            return;
        }
        o8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.f41516f6, this.f41764z5, this.f41561j4, null, this.f41739x5, null, 0, this.B5, true, 0, 0, false, false, null, H8(), 0L, 0L, S8(), this.f41674s5);
        B6();
    }

    public final void tb(long j10) {
        this.f41635p4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20365id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void tc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f41601m8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f41601m8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f41486d1 != null) {
            if (z10 && this.f41511f1 == null) {
                li liVar = new li(getParentActivity(), getResourceProvider(), this);
                this.f41511f1 = liVar;
                w7.b6.b(liVar, 0.02f, 1.2f);
                this.f41511f1.setOnClickListener(new ve(this, 12));
            }
            li liVar2 = this.f41511f1;
            if (liVar2 != null) {
                if (!z10) {
                    liVar2.setVisibility(8);
                    return;
                }
                liVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f41601m8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f41601m8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f41509f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        q01 q01Var = new q01(formatString.substring(indexOf, indexOf2));
                        if (q01Var.f40683c != -1) {
                            q01Var.f40683c = -1;
                            q01Var.invalidateSelf();
                        }
                        q01Var.a(503316480);
                        q01Var.setBounds(0, 0, q01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(q01Var), indexOf, indexOf2, 33);
                    }
                }
                this.f41511f1.setCustomText(spannableStringBuilder);
                this.f41511f1.setOverrideTextMaxWidth(ei.x3.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f41511f1.getParent() != null && (!z10 || this.f41511f1.getParent() != this.f41486d1)) {
                    ((ViewGroup) this.f41511f1.getParent()).removeView(this.f41511f1);
                }
                if (z10) {
                    ViewParent parent = this.f41511f1.getParent();
                    LinearLayout linearLayout = this.f41486d1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f41511f1, w7.z5.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    public final void u7() {
        int i10;
        sn snVar = this.f41639pa;
        if (snVar != null) {
            snVar.u7();
        }
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) a9(AndroidUtilities.dp(7.0f)));
        rk rkVar = this.A1;
        if (rkVar != null) {
            i10 = AndroidUtilities.dp(rkVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(E8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.d());
        ai.u1 u1Var = this.X3;
        if (u1Var != null) {
            u1Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.k40 k40Var = this.F1;
        if (k40Var != null) {
            k40Var.e.setPadding(0, dp2, 0, dp3);
            k40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        ah.x xVar = this.W3;
        if (xVar != null) {
            kh.f fVar = (kh.f) xVar.f900b;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.z00 z00Var = this.f41622o2;
        if (z00Var != null) {
            z00Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.vx0 vx0Var = this.f41633p2;
        if (vx0Var != null) {
            vx0Var.f32066a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final org.telegram.ui.Cells.v0 u8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f41734x0 != null && this.A0 != null) {
            for (int i10 = 0; i10 < this.f41734x0.getChildCount(); i10++) {
                View childAt = this.f41734x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (org.telegram.ui.Wallet.l0.G(v0Var.getMessageObject(), wallettransaction)) {
                        return v0Var;
                    }
                }
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.G6;
                if (i11 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.l0.G((MessageObject) arrayList.get(i11), wallettransaction)) {
                    this.f41734x0.B0();
                    this.f41759z0.h1(this.A0.J + i11, 0);
                    return null;
                } else {
                    i11++;
                }
            }
        }
        return null;
    }

    public final void u9() {
        boolean z10;
        Rect rect;
        if (this.f41558j1 != null) {
            if (this.f41532gb <= 0 && this.f41544hb <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            ij ijVar = this.v;
            float c10 = ijVar.c();
            ne.m mVar = ijVar.f45152b;
            int max = (int) Math.max(0.0f, (c10 * mVar.f17470a) - AndroidUtilities.dp(29.0f));
            km kmVar = this.f41558j1;
            ai.jc jcVar = kmVar.L;
            Rect rect2 = this.Uc;
            if (jcVar != null) {
                rect2.set(0, 0, kmVar.getMeasuredWidth(), this.f41558j1.getMeasuredHeight() - max);
                this.f41558j1.L.setClipBounds(rect2);
            }
            if (this.f41734x0 != null) {
                rect2.set(0, 0, this.f41558j1.getMeasuredWidth(), this.f41558j1.getMeasuredHeight() - max);
                rect2.offset(0, -this.f41734x0.getTop());
                nj njVar = this.f41734x0;
                if (njVar.a1()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                njVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.f41558j1.getMeasuredWidth(), this.f41558j1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(ijVar.v, ijVar.c() * mVar.f17470a) - AndroidUtilities.dp(29.0f))));
                kh.f fVar = this.X;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void ua() {
        this.f41450a6 = true;
        this.fragmentBeginToShow = true;
        this.ha = null;
        this.f41558j1.invalidate();
        this.f41558j1.setSkipBackgroundDrawing(false);
        this.f41506ea = false;
        this.fragmentView.setAlpha(1.0f);
        this.f41594m1.setTranslationY(0.0f);
        this.f41594m1.getAvatarImageView().setScaleX(1.0f);
        this.f41594m1.getAvatarImageView().setScaleY(1.0f);
        this.f41594m1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void ub(View view) {
        View view2 = this.V8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.v0)) {
                ((org.telegram.ui.Cells.v0) view2).setInvalidateWithParent(null);
            }
            this.V8 = view;
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void uc() {
        final long j10;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.f41498e1 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.e.f20344id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f20344id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f20344id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(ai.nd.S0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.f41498e1.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final sn f43839b;

                    {
                        this.f43839b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                sn.c0(j11, this.f43839b);
                                return;
                            default:
                                sn.r1(j11, this.f43839b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f41498e1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f41601m8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.ro roVar = this.f41498e1;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                roVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.f41516f6))), LocaleController.getString(R.string.MessagePremiumUnlock), new ah.f(9));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.ro roVar2 = this.f41498e1;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                roVar2.c(z10, false, AndroidUtilities.replaceTags(ai.nd.S0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.f41516f6), LocaleController.formatNumber(this.f41601m8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final sn f43839b;

                    {
                        this.f43839b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                sn.c0(j10, this.f43839b);
                                return;
                            default:
                                sn.r1(j10, this.f43839b);
                                return;
                        }
                    }
                });
            } else {
                this.f41498e1.c(false, false, null, null, null);
            }
        } else {
            this.f41498e1.c(false, false, null, null, null);
        }
    }

    public final void v6(MessageObject messageObject, Integer num) {
        MessageObject messageObject2 = messageObject.replyMessageObject;
        if (messageObject2 != null) {
            int id2 = messageObject2.getId();
            SparseArray sparseArray = this.C6;
            ArrayList arrayList = (ArrayList) sparseArray.get(id2);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(id2, arrayList);
            }
            int id3 = messageObject.getId();
            if (!arrayList.contains(Integer.valueOf(id3))) {
                arrayList.add(Integer.valueOf(id3));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void v7() {
        int i10;
        float f7 = (1.0f - this.Mc.e) * (1.0f - this.Kc.e);
        this.f41708v1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f41708v1.setAlpha(f7);
        kh.h hVar = this.f41708v1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final void v8() {
        if (this.f41728w7) {
            return;
        }
        this.f41728w7 = true;
        getMessagesController().checkSensitive(this, this.f41516f6, new ke(this, 24), new kf(this, 15));
    }

    public final void v9(int i10) {
        sn snVar = this.f41639pa;
        if (snVar != null) {
            snVar.v9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.F != null) {
            zf.b0 b0Var = this.Rc;
            if (b0Var.f51992c == 0) {
                b0Var.invalidate();
            }
            b0Var.f51992c = i10 | b0Var.f51992c;
        }
    }

    public final void va(long j10, boolean z10) {
        if (this.f41487d2 != null && UserObject.isBotForum(this.f41509f)) {
            this.f41487d2.setAllTopicsHidden(true);
        }
        this.Y5.put(j10, 1);
        T7();
        UndoView undoView = this.K3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f41516f6, 0, new ai.ud(this, j10, z10, 6), new je(this, j10, 2));
        this.A0.O(false);
    }

    public final void vb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f41624o4 = tL_forumTopic;
        this.f41597m4 = arrayList;
        MessageObject messageObject = (MessageObject) i2.o1.i(1, arrayList);
        this.f41561j4 = messageObject;
        this.f41764z5 = messageObject;
        this.f41725w4 = i11;
        this.f41738x4 = i12;
        this.f41751y4 = Math.max(1, i11);
        this.f41635p4 = this.f41561j4.getId();
        this.f41646q4 = i10;
        this.f41659r4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41686t4 = z10;
        MessageObject messageObject2 = this.f41764z5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41673s4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        Gc();
        Xc(false);
        oc(false);
    }

    public final void vc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.vc(boolean):void");
    }

    @Override
    public final boolean w(final org.telegram.ui.ey r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.xe1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.w(org.telegram.ui.ey, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.xe1):boolean");
    }

    public final void w6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.w6():void");
    }

    public final void w7() {
        sn snVar = this.f41639pa;
        if (snVar != null) {
            snVar.w7();
        }
        float a92 = a9(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.f41487d2 != null) {
            a92 += b9(org.telegram.ui.Components.r31.f30056a);
        }
        if (this.A1 != null) {
            a92 += AndroidUtilities.dp(35.0f) * this.A1.E;
        }
        this.X.setFadeZoneTop((int) ((E8() * AndroidUtilities.dp(43.0f)) + a92));
    }

    public final boolean w8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f41734x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f41734x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (currentMessagesGroup = ((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.G6.indexOf((MessageObject) i2.o1.i(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        em emVar = this.A0;
                        emVar.q(indexOf + emVar.J, currentMessagesGroup.messages.size());
                        this.f41734x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            i2.o1.y(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.h5 h5Var = this.parentLayout;
        if (h5Var != null && !h5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(z10));
        return false;
    }

    public final void w9() {
        this.Da = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean wa() {
        if (this.T4.size() != 1 || this.f41574k4 == null || ((Integer) this.T4.get(0)).intValue() != this.f41574k4.getId()) {
            return false;
        }
        return true;
    }

    public final void wb() {
        AndroidUtilities.shakeViewSpring(this.f41734x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        gk gkVar = this.Y;
        for (int i10 = 0; i10 < gkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(gkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void wc() {
        MessageObject messageObject;
        if (this.f41509f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                nj njVar = this.f41734x0;
                if (njVar != null) {
                    int childCount = njVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f41734x0.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.t1) {
                            messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.getId() < 0) {
                            long j10 = messageObject.messageOwner.random_id;
                            if (j10 != 0) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                    }
                }
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.B8, this.C8, this.f41509f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f34105h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f41509f, null, null, messageObject2.getId());
            }
        }
    }

    @Override
    public final boolean x() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void x6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.h hVar = this.I6;
            ArrayList arrayList = (ArrayList) hVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.v0.j(pollId, hVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void x7() {
        if (this.Y0 != null) {
            this.Y0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - E8()) * (1.0f - this.Mc.e) * W8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final void x8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j10) {
        boolean z13;
        if (!arrayList.isEmpty() && i7()) {
            boolean z14 = false;
            if (i10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f41489d4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.A9 = true;
                em emVar = this.A0;
                if (emVar != null) {
                    emVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.f41516f6, z10, z11, z12, i10, 0, this.f41561j4, -1, j10, S8(), this.f41674s5);
            org.telegram.ui.Components.d5.s0(sendMessage, this, this.f41651qa);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new kf(this, 25));
            }
        }
    }

    public final void x9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f41509f) != null && user.contact_require_premium) {
            boolean isEmpty = this.G6.isEmpty();
            if (getMessagesController().isUserContactBlocked(a()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEmpty != z10) {
                getMessagesController().invalidateUserPremiumBlocked(a(), this.classGuid);
            }
        }
    }

    public final void xa() {
        org.telegram.ui.Cells.t1 t1Var;
        this.Kc.a(false, true);
        rh.c cVar = this.Qc;
        if (cVar != null && (t1Var = cVar.f46170n) != null && t1Var.getDelegate() != null) {
            cVar.f46170n.getDelegate().x1(cVar.f46170n, false);
        }
        gk gkVar = this.Y;
        if (gkVar != null) {
            gkVar.S0(true, true, false);
            this.Y.Y4 = null;
        }
    }

    public final void xb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41651qa);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.R = string;
        TLRPC.User user = this.f41509f;
        if (user != null) {
            if (user.bot) {
                c2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String h = org.telegram.messenger.tl.h(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, jf.b.c());
                TLRPC.User user2 = this.f41509f;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, h, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            c2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new hg.b2(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void xc(MessageObject messageObject, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new ai.y7(this, messageObject, z10, 14));
    }

    @Override
    public final void y() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void y6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.m9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f41509f, null, this.f41516f6, this.Ha, this.Ga);
    }

    public final void y7() {
        float f7 = this.I9;
        rk rkVar = this.A1;
        if (rkVar != null) {
            rkVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.A1.E;
        }
        dk dkVar = this.B1;
        if (dkVar != null) {
            dkVar.setTranslationY(f7);
        }
        float E8 = (E8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.v31 v31Var = this.f41487d2;
        org.telegram.ui.Components.r31 r31Var = org.telegram.ui.Components.r31.f30056a;
        if (v31Var != null) {
            v31Var.setSideMenuBackgroundMarginTop((E8() * a9(AndroidUtilities.dp(7.0f))) + E8);
            float b92 = b9(r31Var);
            float b10 = zf.f0.b(this.Mc.e);
            float E82 = E8();
            E8 += zf.f0.b(Math.min(w7.r.a(zf.f0.b(b10), 0.0f, 1.0f), w7.r.a(zf.f0.b(E82), 0.0f, 1.0f))) * b92;
        }
        org.telegram.ui.Components.ah ahVar = this.Y0;
        if (ahVar != null) {
            ahVar.setTranslationY((E8 - AndroidUtilities.dp(5.0f)) - (E8() * b9(r31Var)));
        }
    }

    public final int y8() {
        return this.f41489d4;
    }

    public final boolean y9() {
        if (this.f41487d2 != null && this.f41635p4 == 0) {
            return true;
        }
        return false;
    }

    public final void ya(org.telegram.ui.Cells.t1 t1Var) {
        rh.c cVar;
        if (this.Kc.f17447f && (cVar = this.Qc) != null && cVar.f46170n == t1Var) {
            Editable text = cVar.f46166a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(t1Var.getMessageObject(), text, this.Qc.getAttachedMedia());
                xa();
                return;
            }
            AndroidUtilities.shakeView(this.Qc.f46166a);
        }
    }

    public final boolean yb() {
        if (A9() && this.f41764z5 == null && this.B5 == null) {
            if (this.f41489d4 != 8 && A9() && this.e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20344id, 1L);
                if (this.f41489d4 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)) {
                            return true;
                        }
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    public final void yc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.J6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                pj pjVar = this.f41748y0;
                if (pjVar != null) {
                    pjVar.V(groupedMessages);
                }
                for (int i10 = 0; i10 < groupedMessages.messages.size(); i10++) {
                    groupedMessages.messages.get(i10).forceUpdate = true;
                    if (z10) {
                        groupedMessages.messages.get(i10).reactionsChanged = true;
                    }
                }
                this.A0.O(true);
                return;
            }
            MessageObject messageObject3 = (MessageObject) this.A6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.A0.N) {
                a0.h hVar = this.f41592lb;
                if (hVar != null) {
                    messageObject2 = (MessageObject) hVar.f(messageObject.getId());
                } else {
                    messageObject2 = null;
                }
                int indexOf = this.A0.P.indexOf(messageObject2);
                if (messageObject2 != null && z10) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                }
                if (indexOf >= 0) {
                    em emVar = this.A0;
                    emVar.m(emVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.G6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                em emVar2 = this.A0;
                emVar2.m(emVar2.J + indexOf2);
            }
        }
    }

    public final void z6(MessageObject messageObject, boolean z10) {
        A6(messageObject, z10, true);
    }

    public final void z7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.H6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.G6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.f41516f6 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.A6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        messageReplies.replies++;
                        messageObject.animateComments = true;
                        TLRPC.Message message = messageObject2.messageOwner;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (MessageObject.getPeerId(messageObject.messageOwner.replies.recent_repliers.get(i12)) == MessageObject.getPeerId(peer)) {
                                messageObject.messageOwner.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        messageObject.messageOwner.replies.recent_repliers.add(0, peer);
                        if (!messageObject2.isOut()) {
                            messageObject.messageOwner.replies.max_id = messageObject2.getId();
                        }
                        MessagesStorage messagesStorage = getMessagesStorage();
                        long j10 = this.e.f20344id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j10, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.J6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(groupedMessages, groupedMessages.groupId);
                                int size3 = groupedMessages.messages.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    groupedMessages.messages.get(i13).animateComments = true;
                                }
                            }
                        } else if (this.A0 != null && (indexOf = arrayList.indexOf(messageObject)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.A0.J));
                        }
                    }
                }
                i11++;
            }
            if (arrayList2 != null) {
                int size4 = arrayList2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    sparseArray.remove(((Integer) arrayList2.get(i14)).intValue());
                }
            }
            if (this.A0 != null) {
                if (hVar != null) {
                    int m10 = hVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.n(i15);
                        int indexOf2 = arrayList.indexOf((MessageObject) i2.o1.i(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            em emVar = this.A0;
                            if (!emVar.N) {
                                emVar.q(indexOf2 + emVar.J, groupedMessages2.messages.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.A0.N) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.A0.m(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final r0.k1 z8(r0.k1 k1Var) {
        ci.a3 a3Var;
        r0.a1 w0Var;
        if (k1Var != null && (a3Var = this.V1) != null) {
            if ((a3Var.isShowing() && !this.V1.isDismissed()) || this.V1.f30203x0) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    w0Var = new r0.z0(k1Var);
                } else if (i10 >= 30) {
                    w0Var = new r0.y0(k1Var);
                } else if (i10 >= 29) {
                    w0Var = new r0.x0(k1Var);
                } else {
                    w0Var = new r0.w0(k1Var);
                }
                w0Var.c(8, i0.b.e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return k1Var;
        }
        return k1Var;
    }

    public final void za(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        ah.i1 d = ah.i1.d(reactionCount.reaction);
        if (zVar instanceof org.telegram.ui.Cells.t1) {
            messageObject = ((org.telegram.ui.Cells.t1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) zVar).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        eb(zVar, messageObject2, null, null, f7, f10, d, false, false, false, false);
        if (messageObject2 != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (messageObject2.messageOwner != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            boolean z12 = this.A0.N;
            if (z12) {
                MessageObject messageObject3 = (MessageObject) this.A6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.C3 != null) {
                rc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.C3)) {
            MessageObject.GroupedMessages c92 = c9(messageObject2);
            if (c92 != null) {
                for (int i10 = 0; i10 < c92.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(c92.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            hg.n1 n1Var = this.Y3;
            if (n1Var != null) {
                n1Var.l();
            }
            rc(true);
        }
    }

    public final void zb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.vc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f41651qa).j();
    }

    public final void zc() {
        org.telegram.ui.ActionBar.m1 m1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        nj njVar = this.f41734x0;
        yj yjVar = this.U1;
        if ((yjVar != null && yjVar.I) || ((m1Var = this.f41481c9) != null && m1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        njVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void O() {
    }

    public void aa(boolean z10) {
    }
}
