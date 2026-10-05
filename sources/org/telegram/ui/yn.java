package org.telegram.ui;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.ClipData;
import android.content.ContentValues;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
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
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ForegroundColorSpan;
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
import j$.util.stream.Collectors;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.net.URLDecoder;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
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
public class yn extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, oy, bd0, org.telegram.ui.Components.ik, org.telegram.ui.Components.dh, mg.b, org.telegram.ui.Components.r50, le.d {
    public static int Bc = 22;
    public static float Cc = 1.4f;
    public static int Dc = 10;
    public static Pattern Ec;
    public static Pattern Fc;
    public static Pattern Gc;
    public static final int[] Hc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Ic = false;
    public static final Rect Jc = new Rect();
    public boolean A0;
    public float A1;
    public final xn[] A2;
    public int A3;
    public yf A4;
    public TLRPC.PhotoSize A5;
    public final boolean[] A6;
    public int A7;
    public BitmapShader A8;
    public boolean A9;
    public ValueAnimator Aa;
    public boolean Ab;
    public final Rect Ac;
    public org.telegram.ui.Components.q90 B0;
    public TL_stories.TL_premium_boostsStatus B1;
    public final org.telegram.ui.ActionBar.i5[] B2;
    public boolean B3;
    public boolean B4;
    public TLRPC.PhotoSize B5;
    public final boolean[] B6;
    public int B7;
    public Paint B8;
    public boolean B9;
    public float Ba;
    public boolean Bb;
    public TextView C0;
    public ChannelBoostsController.CanApplyBoost C1;
    public final ai.p4[] C2;
    public FlagSecureReason C3;
    public boolean C4;
    public TLObject C5;
    public final boolean[] C6;
    public boolean C7;
    public Matrix C8;
    public long C9;
    public el Ca;
    public final RectF Cb;
    public pk D0;
    public boolean D1;
    public NumberTextView D2;
    public boolean D3;
    public boolean D4;
    public int D5;
    public boolean D6;
    public boolean D7;
    public Paint D8;
    public int D9;
    public final ml Da;
    public org.telegram.ui.ActionBar.b2 Db;
    public final pe.b E;
    public RadialProgressView E0;
    public qe E1;
    public int E2;
    public MessageObject E3;
    public int E4;
    public TLRPC.WebPage E5;
    public boolean E6;
    public boolean E7;
    public final Paint E8;
    public int E9;
    public final pl Ea;
    public long Eb;
    public final ah.i F;
    public AnimatorSet F0;
    public ImageView F1;
    public final AnimatorSet[] F2;
    public int F3;
    public ArrayList F4;
    public ArrayList F5;
    public boolean F6;
    public int F7;
    public float F8;
    public int F9;
    public ArrayList Fa;
    public final ug Fb;
    public final int G;
    public boolean G0;
    public ck G1;
    public boolean G2;
    public MessageObject G3;
    public int G4;
    public String G5;
    public boolean G6;
    public boolean G7;
    public boolean G8;
    public int G9;
    public final xl Ga;
    public int Gb;
    public ah.c H;
    public ci.e4 H0;
    public ai.g4 H1;
    public ImageView H2;
    public MessageObject H3;
    public HashMap H4;
    public i9.s H5;
    public int H6;
    public MessageObject H7;
    public View H8;
    public boolean H9;
    public final ii Ha;
    public boolean Hb;
    public ah.c I;
    public ci.e4 I0;
    public org.telegram.ui.ActionBar.q0 I1;
    public RadialProgressView I2;
    public hh.f I3;
    public final SparseArray I4;
    public TLRPC.ChatInvite I5;
    public int I6;
    public MessageObject I7;
    public float I8;
    public boolean I9;
    public final zi Ia;
    public Pattern Ib;
    public final fh.e J;
    public ci.e4 J0;
    public TextView J1;
    public ImageView J2;
    public ai.w0 J3;
    public int J4;
    public ug J5;
    public long J6;
    public int J7;
    public float J8;
    public boolean J9;
    public final ln Ja;
    public MessageObject Jb;
    public ah.c K;
    public org.telegram.ui.Components.eh K0;
    public boolean K1;
    public AnimatorSet K2;
    public gg.o1 K3;
    public final int[] K4;
    public final LongSparseIntArray K5;
    public boolean K6;
    public boolean K7;
    public Integer K8;
    public org.telegram.ui.Components.wi K9;
    public final yf Ka;
    public kf Kb;
    public org.telegram.ui.ActionBar.b2 L;
    public boolean L0;
    public TextView L1;
    public FrameLayout L2;
    public hh.e L3;
    public int L4;
    public boolean L5;
    public long L6;
    public boolean L7;
    public int L8;
    public float L9;
    public final yf La;
    public ArrayList Lb;
    public boolean M;
    public ok M0;
    public TextView M1;
    public kk M2;
    public int M3;
    public boolean M4;
    public boolean M5;
    public final ArrayList M6;
    public long M7;
    public boolean M8;
    public float M9;
    public boolean Ma;
    public final BotForumHelper.BotDraftAnimationsPool Mb;
    public FrameLayout N;
    public jh.c N0;
    public wk N1;
    public TextView N2;
    public TL_account.TL_businessChatLink N3;
    public int N4;
    public long N5;
    public final Paint N6;
    public String N7;
    public AnimatorSet N8;
    public wp N9;
    public boolean Na;
    public final hh.a Nb;
    public ci.r6 O;
    public FrameLayout O0;
    public TextView O1;
    public TextView O2;
    public String O3;
    public int O4;
    public boolean O5;
    public final Paint O6;
    public Integer O7;
    public org.telegram.ui.ActionBar.n1 O8;
    public Animator O9;
    public long Oa;
    public boolean Ob;
    public nk P;
    public LinearLayout P0;
    public org.telegram.ui.Components.w31 P1;
    public nk P2;
    public int P3;
    public boolean P4;
    public boolean P5;
    public final ColorMatrix P6;
    public byte[] P7;
    public boolean P8;
    public boolean P9;
    public NotificationCenter.ObserversGroup Pa;
    public boolean Pb;
    public hh.g Q;
    public org.telegram.ui.Components.mo Q0;
    public hg.f Q1;
    public ImageView Q2;
    public int Q3;
    public boolean Q4;
    public boolean Q5;
    public final m.c3 Q6;
    public int Q7;
    public org.telegram.ui.ActionBar.f1[] Q8;
    public boolean Q9;
    public boolean Qa;
    public boolean Qb;
    public View R;
    public si R0;
    public org.telegram.ui.Components.q90 R1;
    public ImageView R2;
    public boolean R3;
    public AnimatorSet R4;
    public long R5;
    public final org.telegram.ui.ActionBar.e5 R6;
    public int R7;
    public org.telegram.ui.ActionBar.f1 R8;
    public yn R9;
    public int Ra;
    public long Rb;
    public FrameLayout S;
    public hg.c2 S0;
    public ImageView S1;
    public org.telegram.ui.Components.p6 S2;
    public String S3;
    public final SparseIntArray S4;
    public Long S5;
    public long S6;
    public qe S7;
    public final bk S8;
    public float S9;
    public int Sa;
    public boolean Sb;
    public FrameLayout T;
    public hg.a0 T0;
    public ei.o T1;
    public org.telegram.ui.Components.p6 T2;
    public byte[] T3;
    public final SparseIntArray T4;
    public int T5;
    public int T6;
    public String T7;
    public km T8;
    public AnimatorSet T9;
    public boolean Ta;
    public boolean Tb;
    public final hh.l U;
    public hh.k U0;
    public TextView U1;
    public org.telegram.ui.Components.p6 U2;
    public String U3;
    public boolean U4;
    public final SparseArray[] U5;
    public int U6;
    public ChatObject.Call U7;
    public rk U8;
    public final kk U9;
    public boolean Ua;
    public boolean Ub;
    public jh.f V;
    public qm V0;
    public ek V1;
    public ak V2;
    public MessageObject V3;
    public boolean V4;
    public final SparseArray[] V5;
    public final Matrix V6;
    public boolean V7;
    public int V8;
    public uh.i V9;
    public a0.i Va;
    public boolean Vb;
    public jk W;
    public org.telegram.ui.Components.io W0;
    public FrameLayout W1;
    public zj W2;
    public MessageObject W3;
    public boolean W4;
    public final SparseArray[] W5;
    public LinearGradient W6;
    public boolean W7;
    public int W8;
    public zg.r W9;
    public a0.i Wa;
    public b9 Wb;
    public lk X;
    public final ArrayList X0;
    public ek X1;
    public org.telegram.ui.Cells.w0 X2;
    public boolean X3;
    public boolean X4;
    public boolean X5;
    public int X6;
    public TLRPC.ChatFull X7;
    public int X8;
    public c51 X9;
    public long Xa;
    public int Xb;
    public ai.f0 Y;
    public nj Y0;
    public FrameLayout Y1;
    public int Y2;
    public ArrayList Y3;
    public boolean Y4;
    public int Y5;
    public int Y6;
    public TLRPC.UserFull Y7;
    public boolean Y8;
    public boolean Y9;
    public al Ya;
    public ValueAnimator Yb;
    public int Z;
    public org.telegram.ui.Components.p6 Z0;
    public TextView Z1;
    public org.telegram.ui.Components.k60 Z2;
    public MessageObject Z3;
    public boolean Z4;
    public int Z5;
    public final Paint Z6;
    public org.telegram.ui.Cells.g6 Z7;
    public boolean Z8;
    public org.telegram.ui.Components.pp Z9;
    public boolean Za;
    public ui Zb;
    public int f43262a;
    public org.telegram.ui.ActionBar.t0 f43263a0;
    public mh f43264a1;
    public org.telegram.ui.Components.w00 a2;
    public View f43265a3;
    public TLRPC.TL_forumTopic f43266a4;
    public MessageObject f43267a5;
    public int f43268a6;
    public final Matrix f43269a7;
    public g11 f43270a8;
    public rm f43271a9;
    public wn f43272aa;
    public boolean f43273ab;
    public boolean f43274ac;
    public boolean f43275b;
    public fs f43276b0;
    public org.telegram.ui.Components.jz0 f43277b1;
    public org.telegram.ui.Components.ux0 f43278b2;
    public boolean f43279b3;
    public long f43280b4;
    public MessageObject f43281b5;
    public int f43282b6;
    public LinearGradient f43283b7;
    public final a0.i f43284b8;
    public org.telegram.ui.Cells.u1 f43285b9;
    public yn f43286ba;
    public boolean f43287bb;
    public int f43288bc;
    public boolean f43289c;
    public org.telegram.ui.ActionBar.y f43290c0;
    public org.telegram.ui.ActionBar.t0 f43291c1;
    public org.telegram.ui.Components.m40 f43292c2;
    public boolean f43293c3;
    public int f43294c4;
    public MessageObject.GroupedMessages f43295c5;
    public int f43296c6;
    public boolean f43297c7;
    public String f43298c8;
    public boolean f43299c9;
    public wn f43300ca;
    public ArrayList cb;
    public int f43301cc;
    public boolean d;
    public org.telegram.ui.ActionBar.t0 f43302d0;
    public org.telegram.ui.ActionBar.t0 f43303d1;
    public org.telegram.ui.Components.m40 f43304d2;
    public boolean f43305d3;
    public TLRPC.Chat f43306d4;
    public MessagePreviewParams f43307d5;
    public int f43308d6;
    public boolean f43309d7;
    public long f43310d8;
    public boolean f43311d9;
    public wh.d f43312da;
    public ValueAnimator f43313db;
    public int f43314dc;
    public TLRPC.Chat f43315e;
    public org.telegram.ui.ActionBar.t0 f43316e0;
    public org.telegram.ui.ActionBar.t0 f43317e1;
    public gj f43318e2;
    public AnimatorSet f43319e3;
    public boolean f43320e4;
    public MessageSuggestionParams f43321e5;
    public int f43322e6;
    public int e7;
    public String f43323e8;
    public boolean f43324e9;
    public final ChatMessagesMetadataController f43325ea;
    public boolean f43326eb;
    public int ec;
    public TLRPC.User f43327f;
    public org.telegram.ui.ActionBar.v0 f43328f0;
    public org.telegram.ui.ActionBar.t0 f43329f1;
    public boolean f43330f2;
    public ValueAnimator f43331f3;
    public boolean f43332f4;
    public MessageObject f43333f5;
    public final ArrayList f43334f6;
    public boolean f7;
    public boolean f43335f8;
    public nl f43336f9;
    public TLRPC.TL_channels_sendAsPeers f43337fa;
    public Boolean f43338fb;
    public int f43339fc;
    public org.telegram.ui.ActionBar.y f43340g0;
    public org.telegram.ui.Components.so f43341g1;
    public org.telegram.ui.Components.m40 f43342g2;
    public float f43343g3;
    public boolean f43344g4;
    public MessageObject.GroupedMessages f43345g5;
    public boolean f43346g6;
    public boolean f43347g7;
    public boolean f43348g8;
    public boolean f43349g9;
    public TL_account.resolvedBusinessChatLinks f43350ga;
    public boolean f43351gb;
    public boolean gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.v0 f43352h0;
    public jh.h f43353h1;
    public boolean f43354h2;
    public boolean f43355h3;
    public boolean f43356h4;
    public MessageObject.GroupedMessages f43357h5;
    public int f43358h6;
    public int f43359h7;
    public String f43360h8;
    public float f43361h9;
    public boolean ha;
    public boolean f43362hb;
    public long f43363hc;
    public org.telegram.ui.ActionBar.v0 f43364i0;
    public boolean f43365i1;
    public org.telegram.ui.Components.m40 f43366i2;
    public boolean f43367i3;
    public int f43368i4;
    public MessageObject f43369i5;
    public int f43370i6;
    public boolean f43371i7;
    public String f43372i8;
    public dk f43373i9;
    public boolean f43374ia;
    public int f43375ib;
    public TLRPC.TL_messages_discussionMessage f43376ic;
    public org.telegram.ui.ActionBar.t0 f43377j0;
    public int f43378j1;
    public org.telegram.ui.Components.m40 f43379j2;
    public boolean j3;
    public int f43380j4;
    public on f43381j5;
    public int f43382j6;
    public boolean f43383j7;
    public MessageObject f43384j8;
    public org.telegram.ui.Cells.u1 f43385j9;
    public float f43386ja;
    public HashMap f43387jb;
    public TLRPC.messages_Messages f43388jc;
    public org.telegram.ui.ActionBar.v0 f43389k0;
    public int f43390k1;
    public org.telegram.ui.Components.m40 f43391k2;
    public boolean f43392k3;
    public int f43393k4;
    public boolean f43394k5;
    public boolean f43395k6;
    public boolean f43396k7;
    public MessageObject f43397k8;
    public org.telegram.ui.Components.u00 f43398k9;
    public final rg f43399ka;
    public yf f43400kb;
    public boolean f43401kc;
    public org.telegram.ui.ActionBar.y f43402l0;
    public org.telegram.ui.Components.rc l1;
    public org.telegram.ui.Components.m40 f43403l2;
    public boolean f43404l3;
    public zh l4;
    public MessageObject f43405l5;
    public final ArrayList f43406l6;
    public int f43407l7;
    public int f43408l8;
    public boolean f43409l9;
    public final tk f43410la;
    public int f43411lb;
    public qn f43412lc;
    public boolean m0;
    public vk f43413m1;
    public org.telegram.ui.Components.m40 f43414m2;
    public TLRPC.User f43415m3;
    public final SparseArray f43416m4;
    public int f43417m5;
    public final SparseArray[] f43418m6;
    public int f43419m7;
    public boolean f43420m8;
    public boolean f43421m9;
    public int f43422ma;
    public org.telegram.ui.ActionBar.b2 f43423mb;
    public kn f43424mc;
    public boolean f43425n;
    public RadialProgressView f43426n0;
    public hk f43427n1;
    public org.telegram.ui.Cells.u1 f43428n2;
    public TLRPC.Chat f43429n3;
    public final ArrayList f43430n4;
    public MessageObject f43431n5;
    public final SparseArray f43432n6;
    public boolean f43433n7;
    public long f43434n8;
    public ValueAnimator f43435n9;
    public int f43436na;
    public int nb;
    public yh.c4 nc;
    public org.telegram.ui.ActionBar.t0 f43437o0;
    public ci.i1 f43438o1;
    public int f43439o2;
    public zg.m0 f43440o3;
    public int f43441o4;
    public boolean f43442o5;
    public final SparseArray f43443o6;
    public yf f43444o7;
    public long f43445o8;
    public ValueAnimator o9;
    public yf f43446oa;
    public int f43447ob;
    public boolean f43448oc;
    public org.telegram.ui.ActionBar.t0 f43449p0;
    public int f43450p1;
    public int f43451p2;
    public boolean f43452p3;
    public boolean f43453p4;
    public boolean p5;
    public final HashMap f43454p6;
    public String f43455p7;
    public boolean f43456p8;
    public boolean f43457p9;
    public boolean f43458pa;
    public boolean f43459pb;
    public float f43460pc;
    public org.telegram.ui.ActionBar.t0 f43461q0;
    public boolean f43462q1;
    public org.telegram.ui.Components.m40 f43463q2;
    public boolean f43464q3;
    public boolean f43465q4;
    public boolean f43466q5;
    public final SparseArray q6;
    public boolean f43467q7;
    public String f43468q8;
    public float f43469q9;
    public boolean f43470qa;
    public int f43471qb;
    public float f43472qc;
    public long f43473r;
    public org.telegram.ui.ActionBar.t0 f43474r0;
    public org.telegram.ui.Components.h40 f43475r1;
    public org.telegram.ui.Components.m40 f43476r2;
    public String f43477r3;
    public int f43478r4;
    public boolean f43479r5;
    public final a0.i f43480r6;
    public boolean f43481r7;
    public nk f43482r8;
    public float f43483r9;
    public long f43484ra;
    public boolean f43485rb;
    public final le.b f43486rc;
    public final HashMap f43487s;
    public ClippingImageView f43488s0;
    public org.telegram.ui.ActionBar.b2 f43489s1;
    public org.telegram.ui.Components.m40 f43490s2;
    public String f43491s3;
    public final ArrayList f43492s4;
    public int f43493s5;
    public final ArrayList f43494s6;
    public int f43495s7;
    public org.telegram.ui.Cells.u1 f43496s8;
    public int f43497s9;
    public int f43498sa;
    public int f43499sb;
    public final le.b f43500sc;
    public org.telegram.ui.Components.w11 f43501t0;
    public ci.e4 f43502t1;
    public org.telegram.ui.Components.tp f43503t2;
    public int f43504t3;
    public final HashMap f43505t4;
    public int f43506t5;
    public final SparseArray f43507t6;
    public int f43508t7;
    public l4 f43509t8;
    public int f43510t9;
    public int ta;
    public int f43511tb;
    public final le.b f43512tc;
    public hh.h f43513u0;
    public ci.e4 f43514u1;
    public View f43515u2;
    public int f43516u3;
    public MessageObject f43517u4;
    public TLRPC.PhotoSize f43518u5;
    public final a0.i f43519u6;
    public int f43520u7;
    public TextureView f43521u8;
    public float f43522u9;
    public sk f43523ua;
    public int f43524ub;
    public final le.b f43525uc;
    public final ph.i v;
    public sj f43526v0;
    public ci.e4 f43527v1;
    public gl f43528v2;
    public int f43529v3;
    public int f43530v4;
    public TLRPC.PhotoSize f43531v5;
    public final a0.i f43532v6;
    public int f43533v7;
    public boolean f43534v8;
    public float v9;
    public uk f43535va;
    public CharacterStyle f43536vb;
    public final le.b f43537vc;
    public hj f43538w;
    public uj f43539w0;
    public ci.e4 f43540w1;
    public ci.r6 f43541w2;
    public UndoView f43542w3;
    public int f43543w4;
    public TLObject f43544w5;
    public final int[] f43545w6;
    public int f43546w7;
    public final yf f43547w8;
    public float f43548w9;
    public float f43549wa;
    public String f43550wb;
    public final le.b wc;
    public hj f43551x;
    public vj f43552x0;
    public ci.e4 f43553x1;
    public org.telegram.ui.Components.ig0 f43554x2;
    public fl f43555x3;
    public final ArrayList f43556x4;
    public int f43557x5;
    public final int[] f43558x6;
    public int f43559x7;
    public final fh.b f43560x8;
    public float f43561x9;
    public int f43562xa;
    public nf.e f43563xb;
    public final le.b xc;
    public final pe.b f43564y;
    public jm f43565y0;
    public ci.e4 f43566y1;
    public boolean f43567y2;
    public org.telegram.ui.Components.rc y3;
    public int f43568y4;
    public int f43569y5;
    public final int[] f43570y6;
    public boolean f43571y7;
    public ah.c f43572y8;
    public float f43573y9;
    public int f43574ya;
    public boolean f43575yb;
    public final j6.l f43576yc;
    public qk f43577z0;
    public ul f43578z1;
    public final org.telegram.ui.Components.w9[] f43579z2;
    public boolean f43580z3;
    public int f43581z4;
    public boolean f43582z5;
    public final int[] f43583z6;
    public int f43584z7;
    public Bitmap f43585z8;
    public TLRPC.Document f43586z9;
    public ChatMessageSharedResources f43587za;
    public qe f43588zb;
    public qh.c f43589zc;

    public yn(Bundle bundle) {
        super(bundle);
        this.f43262a = 0;
        this.f43289c = false;
        this.d = false;
        this.f43487s = new HashMap();
        this.v = new ph.i(new yf(this, 18));
        pe.b bVar = new pe.b();
        this.f43564y = bVar;
        pe.b bVar2 = new pe.b();
        this.E = bVar2;
        this.U = new hh.l();
        this.X0 = new ArrayList();
        this.f43579z2 = new org.telegram.ui.Components.w9[2];
        this.A2 = new xn[2];
        this.B2 = new org.telegram.ui.ActionBar.i5[2];
        this.C2 = new ai.p4[2];
        this.F2 = new AnimatorSet[2];
        this.G2 = false;
        this.Y2 = 500;
        this.N3 = null;
        this.Q3 = -1;
        this.X3 = true;
        this.f43416m4 = new SparseArray();
        this.f43430n4 = new ArrayList();
        this.f43492s4 = new ArrayList();
        this.f43505t4 = new HashMap();
        this.f43530v4 = -1;
        this.f43543w4 = 0;
        this.f43556x4 = new ArrayList(10);
        this.F4 = new ArrayList();
        this.H4 = new HashMap();
        this.I4 = new SparseArray();
        this.K4 = new int[1];
        this.S4 = new SparseIntArray();
        this.T4 = new SparseIntArray();
        this.X4 = true;
        this.Z4 = true;
        this.f43442o5 = true;
        this.f43479r5 = true;
        this.K5 = new LongSparseIntArray();
        this.T5 = 1;
        this.U5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.V5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.W5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43334f6 = new ArrayList();
        this.f43346g6 = true;
        this.f43370i6 = Integer.MIN_VALUE;
        this.f43406l6 = new ArrayList();
        this.f43418m6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43432n6 = new SparseArray();
        this.f43443o6 = new SparseArray();
        this.f43454p6 = new HashMap();
        this.q6 = new SparseArray();
        this.f43480r6 = new a0.i();
        this.f43494s6 = new ArrayList();
        this.f43507t6 = new SparseArray();
        this.f43519u6 = new a0.i();
        this.f43532v6 = new a0.i();
        this.f43545w6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f43558x6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f43570y6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f43583z6 = new int[2];
        this.A6 = new boolean[2];
        this.B6 = new boolean[2];
        this.C6 = new boolean[]{true, true};
        this.E6 = true;
        this.F6 = true;
        this.I6 = 0;
        this.M6 = new ArrayList();
        this.N6 = new Paint(1);
        this.O6 = new Paint(1);
        this.P6 = new ColorMatrix();
        this.Q6 = new m.c3();
        this.R6 = new org.telegram.ui.ActionBar.e5(0, false, false, new oj(this));
        this.V6 = new Matrix();
        Paint paint = new Paint(1);
        this.Z6 = paint;
        this.f43269a7 = new Matrix();
        this.f43407l7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f43533v7 = Integer.MAX_VALUE;
        this.f43546w7 = -1;
        this.E7 = true;
        this.J7 = Integer.MAX_VALUE;
        this.Q7 = -1;
        this.R7 = -10000;
        this.f43284b8 = new a0.i();
        this.f43547w8 = new yf(this, 21);
        fh.b bVar3 = new fh.b();
        this.f43560x8 = bVar3;
        this.f43572y8 = new ah.c(bVar3);
        this.E8 = new Paint(1);
        this.F8 = 0.0f;
        this.I8 = 1.0f;
        this.J8 = 0.0f;
        this.P8 = true;
        this.S8 = new bk(this);
        this.f43409l9 = true;
        this.U9 = new kk(this, 0);
        this.f43325ea = new ChatMessagesMetadataController(this);
        this.f43399ka = new rg(this, 0);
        this.f43410la = new tk(this);
        this.f43436na = -1;
        this.Da = new ml(this);
        this.Ea = new pl(this);
        this.Ga = new xl(this);
        this.Ha = new ii(this);
        this.Ia = new zi(this);
        this.Ja = new ln(this);
        this.Ka = new yf(this, 25);
        this.La = new yf(this, 28);
        this.f43273ab = false;
        this.Cb = new RectF();
        this.Fb = new ug(this, 0);
        this.Mb = new BotForumHelper.BotDraftAnimationsPool();
        this.Nb = new Object();
        this.f43274ac = false;
        org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
        this.f43486rc = new le.b(0, this, trVar, 320L, false);
        this.f43500sc = new le.b(1, this, trVar, 520L, false);
        this.f43512tc = new le.b(2, this, trVar, 520L, false);
        this.f43525uc = new le.b(3, this, trVar, 320L, false);
        this.f43537vc = new le.b(4, this, trVar, 320L, false);
        this.wc = new le.b(5, this, trVar, 320L, false);
        this.xc = new le.b(6, this, trVar, 320L, false);
        ug ugVar = new ug(this, 5);
        ?? obj = new Object();
        obj.f14025b = new float[32];
        obj.f14024a = 1;
        obj.d = new le.l(obj, ke.a.f14759a, 240L);
        obj.f14026c = ugVar;
        this.f43576yc = obj;
        this.Ac = new Rect();
        ?? obj2 = new Object();
        this.J = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.i iVar = new ah.i();
            this.F = iVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            fh.d dVar = new fh.d(obj2);
            dVar.d = iVar;
            dVar.f9862e = -3;
            dVar.f9863f = obj2;
            ah.c cVar = new ah.c(dVar);
            this.I = cVar;
            cVar.f461i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(obj2);
                dVar2.d = iVar;
                dVar2.f9862e = -2;
                dVar2.f9863f = obj2;
                ah.c cVar2 = new ah.c(dVar2);
                this.H = cVar2;
                cVar2.f461i = LiteMode.isEnabled(262144);
            } else {
                this.H = this.I;
            }
        } else {
            this.F = null;
            this.G = 0;
            this.H = new ah.c(obj2);
            this.I = new ah.c(obj2);
        }
        ah.c cVar3 = new ah.c(obj2);
        this.K = cVar3;
        cVar3.f458e = bVar;
        this.H.f458e = bVar;
        this.I.f458e = bVar;
        this.f43572y8.f458e = new pe.b();
        this.K.d = bVar2;
        this.H.d = bVar2;
        this.I.d = bVar2;
        this.f43572y8.d = bVar2;
    }

    public static void A0(org.telegram.ui.yn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.u1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.A0(org.telegram.ui.yn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1, int, int):void");
    }

    public static org.telegram.ui.yu0 A1(org.telegram.ui.yn r16, org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.A1(org.telegram.ui.yn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.yu0");
    }

    public static void B0(yn ynVar) {
        ynVar.G7(false);
        if (!ynVar.fragmentBeginToShow) {
            sj sjVar = ynVar.f43526v0;
            sjVar.Y1 = false;
            sjVar.Z1 = 0;
            sjVar.setEmptyView(ynVar.O0);
            sj sjVar2 = ynVar.f43526v0;
            sjVar2.Y1 = true;
            sjVar2.Z1 = 1;
            return;
        }
        ynVar.f43526v0.setEmptyView(ynVar.O0);
    }

    public static void B1(yn ynVar) {
        SparseArray[] sparseArrayArr = ynVar.U5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) ynVar.f43418m6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            ynVar.V5[i10].clear();
            ynVar.W5[i10].clear();
        }
        if (ynVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(ynVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(ynVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                ynVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        ynVar.d9();
        ynVar.xc(0, true);
        ynVar.Vc(false);
        ynVar.Kc();
    }

    public static void C0(yn ynVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(ynVar.currentAccount).getInputUser(user.f20194id);
                    ConnectionsManager.getInstance(ynVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ai.v1(26, ynVar, user));
                }
            }
        }
    }

    public static TLRPC.TL_message C7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20068id = message.f20068id;
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

    public static CharSequence C8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
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

    public static void E0(yn ynVar, String str) {
        Uri parse = Uri.parse(str);
        k60.b(ynVar.getParentActivity(), ynVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static SpannableStringBuilder E8(MessageObject messageObject, boolean z10, long j3) {
        TLRPC.Chat chat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long fromChatId = messageObject.getFromChatId();
            if (j3 != fromChatId) {
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

    public static void F0(yn ynVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        rg.m1 m1Var = new rg.m1(ynVar, ynVar.currentAccount, user, null, null, ynVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            m1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(ynVar.getParentActivity());
        org.telegram.ui.Components.o5 o5Var = new org.telegram.ui.Components.o5(AndroidUtilities.dp(160.0f), 4, w9Var, false);
        w9Var.setImageDrawable(o5Var);
        w9Var.addOnAttachStateChangeListener(new g5(o5Var, 1));
        o5Var.j(j3, false);
        m1Var.E0 = true;
        m1Var.B0 = w9Var;
        ynVar.showDialog(m1Var);
    }

    public static void G0(yn ynVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            yh.z7.p1(ynVar.getParentActivity(), ynVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, ynVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            ynVar.presentFragment(new so0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void G1(yn ynVar) {
        int i10;
        if (ynVar.a() == ynVar.getUserConfig().getClientUserId() && ynVar.getUserConfig().isPremium() && ynVar.Ya == null) {
            al alVar = new al(ynVar, ynVar, ynVar.getParentActivity(), ynVar.currentAccount, ynVar.f43300ca);
            ynVar.Ya = alVar;
            alVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            ynVar.Ya.setDelegate(new bl(ynVar));
            ynVar.Ya.setTop(true);
            int i11 = 0;
            ynVar.Ya.setClipChildren(false);
            ynVar.Ya.setClipToPadding(false);
            ynVar.Ya.setVisibility(0);
            al alVar2 = ynVar.Ya;
            if (alVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            alVar2.setHint(LocaleController.getString(i10));
            ynVar.V0.addView(ynVar.Ya, w7.z5.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            ynVar.Ya.p(null, null, true);
            ynVar.Ya.setTranslationY(-AndroidUtilities.dp(12.0f));
            ynVar.Ya.setScaleY(0.4f);
            ynVar.Ya.setScaleX(0.4f);
            ynVar.Ya.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.tr.h).start();
            ynVar.Kc();
            al alVar3 = ynVar.Ya;
            float f7 = ynVar.f43522u9;
            vk vkVar = ynVar.f43413m1;
            if (vkVar != null) {
                i11 = vkVar.getCurrentHeight();
            }
            alVar3.setTranslationY(f7 + i11);
        }
    }

    public static void H0(yn ynVar) {
        if (AndroidUtilities.addToClipboard(ynVar.Jb.sponsoredInfo)) {
            org.telegram.messenger.bi.n(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.resourceProvider));
        }
    }

    public static java.util.ArrayList H7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.H7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void I0(yn ynVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = ynVar.G1.getAdapter().f10696w0;
        int i10 = ynVar.currentAccount;
        TLRPC.User user2 = ynVar.f43327f;
        if (user2 != null) {
            j3 = user2.f20194id;
        } else {
            j3 = ynVar.f43315e.f20047id;
        }
        ei.f5 b10 = ei.f5.b(i10, j3, user.f20194id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, ynVar.O8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(ynVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(ynVar.currentAccount);
            MessagesController.showCantOpenAlert(ynVar, restrictionReason);
            return;
        }
        ei.l3 l3Var = new ei.l3(ynVar.getParentActivity(), ynVar.getResourceProvider());
        l3Var.w(false);
        l3Var.A0 = true;
        l3Var.f9165k0 = ynVar.getParentActivity();
        l3Var.s(ynVar, b10);
        l3Var.show();
    }

    public static void J0(yn ynVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (ynVar.f43375ib != i10) {
            return;
        }
        if (bool.booleanValue()) {
            ynVar.E5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                ynVar.E5 = null;
                MessagePreviewParams messagePreviewParams = ynVar.f43307d5;
                if (messagePreviewParams != null) {
                    int i11 = ynVar.currentAccount;
                    CharSequence fieldText = ynVar.W.getFieldText();
                    MessageObject messageObject3 = ynVar.f43405l5;
                    if (messageObject3 == ynVar.V3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, ynVar.f43381j5, ynVar.f43431n5);
                }
                ynVar.j8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                ynVar.G5 = str;
            }
            if (ynVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = ynVar.f43307d5;
            if (messagePreviewParams2 != null) {
                int i12 = ynVar.currentAccount;
                CharSequence fieldText2 = ynVar.W.getFieldText();
                MessageObject messageObject4 = ynVar.f43405l5;
                if (messageObject4 == ynVar.V3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, ynVar.f43381j5, ynVar.f43431n5);
            }
            ynVar.Db(true, ynVar.E5, false);
            return;
        }
        ynVar.E5 = null;
        ynVar.j8();
    }

    public static void J3(yn ynVar) {
        org.telegram.ui.ActionBar.y yVar;
        if (!ynVar.f43273ab && (yVar = ynVar.f43340g0) != null) {
            yVar.a();
            org.telegram.ui.ActionBar.v0 v0Var = yVar.f21710m;
            v0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (ynVar.P3 == 0) {
                v0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            v0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            v0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            v0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = ynVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f28925a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o11(obj, 0), 0, spannableStringBuilder4.length(), 33);
                v0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f28925a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.o11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                v0Var.g(56, spannableStringBuilder5);
            }
            v0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (ynVar.h == null) {
                v0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            v0Var.g(54, LocaleController.getString(R.string.Regular));
            ynVar.f43273ab = true;
        }
    }

    public static FrameLayout J7(Context context, org.telegram.ui.ActionBar.d6 d6Var, CharSequence charSequence, int i10) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        ai.p4 p4Var = new ai.p4(context, 12);
        int i11 = 3;
        p4Var.setMaxLines(3);
        p4Var.setGravity(3);
        p4Var.setEllipsize(TextUtils.TruncateAt.END);
        p4Var.setTextColor(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.E8, d6Var));
        p4Var.setTextSize(1, i10);
        p4Var.setMaxWidth(AndroidUtilities.dp(170.0f));
        p4Var.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(p4Var, w7.z5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void K0(yn ynVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        ynVar.f43321e5 = null;
        int i10 = ynVar.f43411lb;
        if (i10 == 2) {
            ynVar.f43381j5 = null;
            ynVar.f43405l5 = null;
            MessagePreviewParams messagePreviewParams = ynVar.f43307d5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, ynVar.R5, null);
            }
            ynVar.j8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = ynVar.f43307d5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = ynVar.f43307d5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = ynVar.f43307d5.forwardMessages.messages.get(i11);
                    if (j3 == 0) {
                        j10 = messageObject3.getDialogId();
                        j3 = messageObject3.getFromChatId();
                    } else if (j3 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43300ca);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                b2Var.I0 = true;
                if (j10 > 0) {
                    TLRPC.User user = ynVar.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", ynVar.f43307d5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = ynVar.getMessagesController().getChat(Long.valueOf(-j10));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", ynVar.f43307d5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                b2Var.T = AndroidUtilities.replaceTags(formatString);
                b2Var.R = LocaleController.formatPluralString("messages", ynVar.f43307d5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new re(ynVar, 8));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new re(ynVar, 9));
                ynVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(ynVar.getThemedColor(org.telegram.ui.ActionBar.i6.f21068q7));
                }
            }
        } else if (i10 == 4) {
            ynVar.E5 = null;
            MessagePreviewParams messagePreviewParams3 = ynVar.f43307d5;
            if (messagePreviewParams3 != null) {
                int i12 = ynVar.currentAccount;
                MessageObject messageObject4 = ynVar.f43405l5;
                if (messageObject4 == ynVar.V3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, ynVar.f43381j5, ynVar.f43431n5);
            }
            jk jkVar = ynVar.W;
            jkVar.X2 = null;
            jkVar.Y2 = false;
            ynVar.i8();
            ynVar.j8();
        } else {
            if (ChatObject.isForum(ynVar.f43315e) && !ynVar.f43332f4 && (messageObject = ynVar.f43405l5) != null) {
                long topicId = MessageObject.getTopicId(ynVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    ynVar.getMediaDataController().cleanDraft(ynVar.R5, topicId, false);
                }
            }
            ynVar.xb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void L0(yn ynVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(ynVar.currentAccount).sendSticker(tL_document, str, ynVar.R5, ynVar.f43405l5, ynVar.V3, null, ynVar.f43381j5, null, z10, i10, 0, false, obj, ynVar.D8(), 0L, ynVar.O8(), ynVar.f43321e5);
    }

    public static void M0(yn ynVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = ynVar.getParentActivity();
        int i12 = ynVar.currentAccount;
        long j3 = ynVar.R5;
        wn wnVar = ynVar.f43300ca;
        int i13 = org.telegram.ui.Components.mo.L;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.d6) wnVar, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.f20899h5, wnVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.v0(org.telegram.ui.ActionBar.i6.Oh, wnVar)));
        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.i6.f20935j5;
        textView.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.i6.v0(i14, wnVar));
        textView2.setTextSize(1, 14.0f);
        if (j3 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i12).getUser(Long.valueOf(j3)));
        } else {
            str = "";
        }
        if (premiumFeaturesBlocked) {
            i11 = R.string.PremiumMessageTextLocked;
        } else {
            i11 = R.string.PremiumMessageText;
        }
        org.telegram.messenger.bi.p(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            rg.q0 q0Var = new rg.q0(parentActivity, wnVar, true);
            q0Var.setOnClickListener(new org.telegram.ui.Components.e3(f3Var, 1));
            q0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(q0Var, w7.z5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(linearLayout);
        f3Var.show();
    }

    public static void N0(yn ynVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f20088id = ynVar.getMessagesController().getInputUser(ynVar.f43327f);
            ynVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new pe(ynVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(ynVar.getUserConfig().getCurrentUser(), ynVar.R5, messageObject, ynVar.V3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = ynVar.D8();
        SendMessagesHelper.getInstance(ynVar.currentAccount).sendMessage(of2);
        if (ynVar.P3 == 0) {
            ynVar.N9(false);
        }
        ynVar.f9(false);
    }

    public static a3.h0 N4(yn ynVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = ynVar.getMessagesController().createDeleteShowOnceTask(ynVar.R5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                ynVar.sc(arrayList, true);
            }
            return new a3.h0(ynVar, createDeleteShowOnceTask, messageObject, 13);
        }
        return null;
    }

    public static void O0(org.telegram.ui.yn r19, org.telegram.ui.mk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.O0(org.telegram.ui.yn, org.telegram.ui.mk, boolean[]):void");
    }

    public static boolean P0(yn ynVar) {
        MessageObject messageObject = ynVar.Jb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static yn P9(int i10, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i10);
        return new yn(bundle);
    }

    public static void Q0(yn ynVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.eh ehVar;
        String str;
        SparseArray[] sparseArrayArr = ynVar.U5;
        if (ynVar.getParentActivity() != null && ynVar.L9 == 0.0f) {
            if (ynVar.P3 == 3) {
                Bundle bundle = new Bundle();
                long J8 = ynVar.J8();
                if (J8 >= 0) {
                    bundle.putLong("user_id", J8);
                } else {
                    bundle.putLong("chat_id", -J8);
                }
                ynVar.presentFragment(new yn(bundle));
                return;
            }
            boolean z12 = false;
            if (ynVar.z9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                ynVar.ub(true, true);
                byte[] bArr = ynVar.T3;
                String str2 = ynVar.U3;
                xe xeVar = new xe(ynVar, 0);
                int i11 = t31.v;
                int currentAccount = ynVar.getCurrentAccount();
                Activity parentActivity = ynVar.getParentActivity();
                long a2 = ynVar.a();
                if (parentActivity != null) {
                    t31.I(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.yc.a0(ynVar), ynVar.getResourceProvider(), bArr, str2, xeVar);
                }
            } else if (ynVar.P3 == 2) {
                ynVar.finishFragment();
                km kmVar = ynVar.T8;
                if (ynVar.f43577z0.getTag() == null) {
                    z12 = true;
                }
                kmVar.X(true, z12);
            } else {
                TLRPC.User user = ynVar.f43327f;
                if (user != null && user.f20194id == 489000) {
                    ynVar.ac(true);
                } else if (user != null && ynVar.f43425n) {
                    if (user.bot) {
                        String str3 = ynVar.f43298c8;
                        ynVar.f43298c8 = null;
                        ynVar.getMessagesController().unblockPeer(ynVar.f43327f.f20194id, new ue(ynVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43300ca);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                    b2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new re(ynVar, 4));
                    b2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    ynVar.showDialog(b2Var);
                } else if (UserObject.isReplyUser(user)) {
                    ynVar.ac(true);
                } else {
                    TLRPC.User user2 = ynVar.f43327f;
                    if (user2 != null && user2.bot && (str = ynVar.f43298c8) != null) {
                        if (str.length() != 0) {
                            ynVar.getMessagesController().sendBotStart(ynVar.f43327f, ynVar.f43298c8);
                        } else {
                            ynVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", ynVar.R5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        ynVar.f43298c8 = null;
                        ynVar.gc(false);
                        return;
                    }
                    if (ChatObject.isChannel(ynVar.f43315e)) {
                        TLRPC.Chat chat = ynVar.f43315e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (ynVar.f43315e.join_request) {
                                    ynVar.ub(true, true);
                                    MessagesController.getInstance(ynVar.currentAccount).addUserToChat(ynVar.f43315e.f20047id, UserConfig.getInstance(ynVar.currentAccount).getCurrentUser(), 0, null, null, true, new qe(ynVar, 3), new o(7, ynVar, context));
                                    return;
                                }
                                ug ugVar = ynVar.J5;
                                if (ugVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(ugVar);
                                    ynVar.J5 = null;
                                }
                                ynVar.ub(true, true);
                                ynVar.getMessagesController().addUserToChat(ynVar.f43315e.f20047id, ynVar.getUserConfig().getCurrentUser(), 0, null, ynVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.q0 q0Var = ynVar.I1;
                                if (q0Var != null && (ehVar = ynVar.K0) != null && ehVar.d(q0Var) && ynVar.L1.getVisibility() != 8 && ynVar.L1.getTag(R.id.object_tag) != null) {
                                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
                                    edit.putInt("dialog_bar_vis3" + ynVar.R5, 3).commit();
                                    ynVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(ynVar.R5));
                                    return;
                                }
                                return;
                            }
                            ynVar.ac(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = ynVar.X7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = ynVar.f43315e;
                    TLRPC.User user3 = ynVar.f43327f;
                    if (ynVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.e5.s(ynVar, false, chat2, user3, z11, true, false, z10, new re(ynVar, 5));
                }
            }
        }
    }

    public static yn Q9(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new yn(bundle);
    }

    public static void R0(yn ynVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(ynVar.currentAccount).getInputUser(user.f20194id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(ynVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new rh(ynVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void S(org.telegram.ui.yn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.S(org.telegram.ui.yn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void S0(yn ynVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, uf ufVar) {
        String str4;
        org.telegram.ui.Components.n41 n41Var;
        if (ynVar.f43281b5 != null && i10 < arrayList.size() && ynVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = ynVar.getParentActivity();
            int i11 = iArr[0];
            yf yfVar = new yf(ynVar, 17);
            String[] strArr = org.telegram.ui.Components.u41.R;
            if (parentActivity == null) {
                n41Var = null;
            } else {
                org.telegram.ui.Components.n41 n41Var2 = new org.telegram.ui.Components.n41(parentActivity, str, str4, inputPeer, i11, richMessage, yfVar);
                n41Var2.F(z10);
                n41Var2.M = ynVar;
                n41Var2.N = ufVar;
                if (ynVar.getParentActivity() != null) {
                    ynVar.showDialog(n41Var2);
                }
                n41Var = n41Var2;
            }
            n41Var.setDimBehind(false);
            ynVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ynVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + ynVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + ynVar.a(), i12 - 1).apply();
                ynVar.Pc(true);
            }
        }
    }

    public static void T(yn ynVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new hf(ynVar, i10, 6));
        } else {
            ynVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void T0(yn ynVar, int i10) {
        ah.i iVar = ynVar.F;
        if (Build.VERSION.SDK_INT >= 31 && iVar != null) {
            if (w7.e0.a(i10, 4)) {
                ni.a e7 = ynVar.glassEngine.e();
                float dp = AndroidUtilities.dp(48.0f);
                float dp2 = AndroidUtilities.dp(48.0f);
                int i11 = 0;
                while (i11 < e7.f16919b) {
                    RectF rectF = (RectF) e7.f16918a.get(i11);
                    rectF.inset(-dp, -dp2);
                    if (rectF.isEmpty()) {
                        e7.d(i11);
                    } else {
                        i11++;
                    }
                }
                e7.b(ynVar.f43526v0.getY(), ynVar.f43526v0.getWidth(), ynVar.f43526v0.getY() + ynVar.f43526v0.getHeight());
                iVar.h(e7);
            }
            qm qmVar = ynVar.V0;
            iVar.e(qmVar.G0, qmVar.getWidth(), ynVar.V0.getHeight());
        }
    }

    public static MessageObject T1(yn ynVar) {
        org.telegram.ui.Cells.u1 u1Var = ynVar.f43285b9;
        if (com.google.android.gms.internal.vision.e2.u(u1Var)) {
            return u1Var.getMessageObject();
        }
        return null;
    }

    public static void T4(yn ynVar, org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int themedColor;
        int i11;
        le.b bVar = ynVar.f43512tc;
        if (ynVar.W != null && !bVar.f15437f && u1Var.getMessageObject() != null) {
            qm qmVar = ynVar.V0;
            RectF rectF = AndroidUtilities.rectTmp;
            hh.k.c(u1Var, qmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            sh.a aVar = u1Var.f23132a6;
            if (aVar != null && u1Var.f23317n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((ynVar.V0.getMeasuredHeight() - ynVar.f43526v0.getPaddingBottom()) + ynVar.f43460pc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = u1Var.getMessageObject();
                if (ynVar.f43589zc == null) {
                    ynVar.f43589zc = new qh.c(ynVar.getParentActivity(), ynVar.resourceProvider, ynVar);
                    int indexOfChild = ynVar.V0.indexOfChild(ynVar.f43526v0);
                    if (indexOfChild >= 0) {
                        ynVar.V0.addView(ynVar.f43589zc, indexOfChild + 1, w7.z5.g());
                    } else {
                        ynVar.V0.addView(ynVar.f43589zc, w7.z5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (u1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.i6.nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.i6.f21112sb;
                    }
                    themedColor = ynVar.getThemedColor(i11);
                } else {
                    if (u1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.i6.f21036od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.i6.f21018nd;
                    }
                    themedColor = ynVar.getThemedColor(i10);
                }
                ynVar.f43589zc.setColor(themedColor);
                ynVar.f43589zc.setCellToWatch(u1Var);
                ynVar.f43589zc.f45460b.f45456a.a(false, false);
                ynVar.f43589zc.setAnimatedVisibility(bVar.f15436e);
                ynVar.f43589zc.f45460b.setOnClickListener(new org.telegram.ui.Components.voip.o(new ug(ynVar, 1), 8));
                qh.c cVar = ynVar.f43589zc;
                cVar.f45466s = new ug(ynVar, 2);
                org.telegram.ui.Cells.c6 c6Var = cVar.f45459a;
                c6Var.setOnKeyListener(new vg(ynVar, 0));
                c6Var.setOnEditorActionListener(new ka(ynVar, 1));
                ynVar.W.U4 = c6Var;
                AndroidUtilities.runOnUIThread(new ai.s1(ynVar, measuredHeight, c6Var, 28), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void U(yn ynVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        yn ynVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        hh.a aVar = ynVar.Nb;
        if (num.intValue() != ynVar.d()) {
            ynVar.f43401kc = false;
            kf kfVar = ynVar.Kb;
            if (kfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(kfVar);
                ynVar.Kb.run();
                ynVar.Kb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.w31 w31Var = ynVar.P1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(w31Var.f32500b).getTopicsController().getTopics(-w31Var.f32502c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f20099id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = ynVar.getMessagesController().getTopicsController().findTopic(-ynVar.a(), tL_forumTopic.f20099id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                ynVar.Xa = SystemClock.uptimeMillis();
                ynVar.f43433n7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    ynVar.Ra(ynVar.d());
                } else if (ynVar.d() == 0) {
                    ynVar.Ra(num.intValue());
                } else {
                    ynVar.f43407l7 = -1;
                }
                ynVar.getConnectionsManager().cancelRequestsForGuid(ynVar.classGuid);
                ynVar.getMessagesStorage().cancelTasksForGuid(ynVar.classGuid);
                ynVar.classGuid = ConnectionsManager.generateClassGuid();
                ynVar.Oa();
                ynVar.f43307d5 = null;
                ynVar.f43495s7 = 0;
                ynVar.f43371i7 = false;
                ynVar.f43383j7 = true;
                ynVar.f43334f6.clear();
                ynVar.f43289c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(ynVar.getCurrentAccount(), message, false, false));
                    ynVar2 = ynVar;
                    ynVar2.ob(arrayList, ynVar.f43315e, tL_forumTopic2.f20099id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    ynVar2 = ynVar;
                    ynVar2.f43266a4 = null;
                    ynVar2.Y3 = null;
                    ynVar2.V3 = null;
                    ynVar2.f43405l5 = null;
                    ynVar2.f43368i4 = 0;
                    ynVar2.f43380j4 = 0;
                    ynVar2.f43393k4 = 0;
                    ynVar2.f43280b4 = 0L;
                    ynVar2.f43294c4 = 0;
                    ynVar2.f43306d4 = null;
                    ynVar2.f43332f4 = false;
                    ynVar2.f43320e4 = false;
                }
                jm jmVar = ynVar2.f43565y0;
                if (jmVar != null) {
                    if (jmVar.I >= 0 && !jmVar.N()) {
                        jm jmVar2 = ynVar2.f43565y0;
                        jmVar2.u(jmVar2.I);
                    } else {
                        jm jmVar3 = ynVar2.f43565y0;
                        if (jmVar3.I < 0 && jmVar3.N()) {
                            ynVar2.f43565y0.o(0);
                        }
                    }
                    ynVar2.f43565y0.T();
                }
                ynVar2.r8();
                ynVar2.Mc(true);
                ynVar2.Y0.m(true);
                if (tL_forumTopic2 != null) {
                    ynVar2.Sc();
                } else {
                    ynVar2.Y0.b();
                }
                ynVar2.P1.setCurrentTopic(ynVar2.d());
                ynVar2.Pc(true);
                ynVar2.gc(true);
                ynVar2.getMessagesController().setForumLastTopicId(-ynVar2.a(), ynVar2.d());
                ynVar2.Da();
                ynVar2.g9(true);
                ynVar2.f9(true);
                ynVar2.A6(true, true);
                if (ynVar2.W != null) {
                    if (!UserObject.isBotForum(ynVar2.f43327f)) {
                        ynVar2.W.m0(false);
                    }
                    ynVar2.W.F1(true);
                }
                if (tL_forumTopic2 != null) {
                    ynVar2.getMessagesController().getTopicsController().getTopicRepliesCount(ynVar2.R5, tL_forumTopic2.f20099id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                ynVar2.f43378j1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                ynVar2.f43390k1 = i11;
                ynVar2.Ac(false);
                ynVar2.zc(false);
                ynVar2.Qc();
                qn qnVar = ynVar2.f43412lc;
                if (qnVar != null && ynVar2.actionBar.f21286n0) {
                    qnVar.p(null);
                }
                if (UserObject.isBotForum(ynVar2.f43327f)) {
                    ynVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(ynVar2.R5, num.intValue()), true);
                }
            }
        }
    }

    public static void U0(yn ynVar, TLRPC.ReactionCount reactionCount) {
        ynVar.A7(true);
        org.telegram.ui.Components.ao0.c(ynVar.getParentActivity(), ynVar.currentAccount, reactionCount.reaction, ynVar.f43300ca);
    }

    public static void V0(yn ynVar, String str) {
        if (MessagesController.getInstance(ynVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            nf.f.m(ynVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.e5.o0(ynVar.getParentActivity(), ynVar.f43300ca, str, true, new ng(ynVar, str, 1));
        }
    }

    public static void V1(yn ynVar, float f7) {
        org.telegram.ui.Cells.u1 u1Var = ynVar.f43285b9;
        if (com.google.android.gms.internal.vision.e2.u(u1Var)) {
            u1Var.setSlidingOffset(f7);
        }
    }

    public static void W(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(ynVar.currentAccount).loadAttachMenuBots(false, true);
            ynVar.V9(user.f20194id, ynVar.f43372i8, false);
        }
    }

    public static void W0(yn ynVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        ynVar.Lb(tL_game, messageObject, str, false, j3);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static void X(yn ynVar) {
        if (!ynVar.e7(ynVar.W.getSendButton())) {
            if (ynVar.getMediaController().isPlayingMessage(ynVar.f43281b5)) {
                ynVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = ynVar.getMessagesController().getInputPeer(ynVar.R5);
            if (ynVar.f43295c5 != null) {
                for (int i10 = 0; i10 < ynVar.f43295c5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f20163id.add(Integer.valueOf(ynVar.f43295c5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f20163id.add(Integer.valueOf(ynVar.f43281b5.getId()));
            }
            ConnectionsManager.getInstance(ynVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ai.v1(27, ynVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void X0(yn ynVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            ynVar.gc = true;
            ynVar.f43526v0.g1();
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
            yn ynVar2 = new yn(bundle);
            ynVar2.ob(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                ynVar2.J7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = ynVar2.V3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                ynVar2.V3.messageOwner.reactions = tL_messageReactions;
            }
            ai.c9 c9Var = new ai.c9(ynVar, new boolean[]{false}, i11, ynVar2, 13);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f20068id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = ynVar2.getClassGuid();
                NotificationCenter.getInstance(ynVar.currentAccount).addObserver(new wi(ynVar, classGuid, c9Var, ynVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        yn ynVar3 = yn.this;
                        MessagesController messagesController = ynVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i18, true, 0, ((MessageObject) hg.c.g(1, arrayList)).getId(), 1, false, 0, true, ynVar3.f43332f4, null);
                    }
                });
                return;
            }
            c9Var.run();
            return;
        }
        ynVar.f43339fc = 0;
        ynVar.gc = false;
        ynVar.f43526v0.g1();
        if (messageObject2 != null) {
            ynVar.fa(messageObject2);
        } else if (ynVar.getParentActivity() != null) {
            org.telegram.ui.Components.yc.a0(ynVar).t(LocaleController.getString(R.string.ChannelPostDeleted), ynVar.f43300ca).j();
        }
    }

    public static void X1(yn ynVar) {
        long j3;
        wp wpVar = ynVar.N9;
        if (wpVar != null) {
            if (ynVar.f43332f4) {
                if (wpVar.H != null) {
                    if (ynVar.getParentLayout() != null) {
                        org.telegram.ui.Components.o9.a(ynVar, ynVar.getParentLayout().getFragmentStack().indexOf(ynVar), ynVar.f43315e, ynVar.f43327f, ynVar.f43266a4, ynVar.R5, ynVar.ta, ynVar.f43498sa);
                    }
                    TLRPC.Chat chat = ynVar.f43315e;
                    TLRPC.TL_forumTopic tL_forumTopic = ynVar.N9.H;
                    long j10 = ynVar.R5;
                    int i10 = ynVar.f43498sa;
                    int i11 = ynVar.ta;
                    if (ynVar.getParentLayout() != null) {
                        org.telegram.ui.Components.o9.a(ynVar, ynVar.getParentLayout().getFragmentStack().indexOf(ynVar), chat, null, tL_forumTopic, j10, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", ynVar.N9.f42624a);
                    bundle.putInt("dialog_filter_id", ynVar.N9.f42626b);
                    bundle.putBoolean("pulled", true);
                    yn g10 = ng.d.g(ynVar, -ynVar.R5, ynVar.N9.H, 0, bundle);
                    g10.P9 = true;
                    Ic = true;
                    ynVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = wpVar.G;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f20047id;
            }
            if (j3 != 0) {
                ynVar.v6();
                wp wpVar2 = ynVar.N9;
                TLRPC.Chat chat3 = wpVar2.G;
                long j12 = wpVar2.Z;
                int i12 = wpVar2.f42624a;
                int i13 = wpVar2.f42626b;
                if (ynVar.getParentLayout() != null) {
                    org.telegram.ui.Components.o9.a(ynVar, ynVar.getParentLayout().getFragmentStack().indexOf(ynVar), chat3, null, null, j12, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = ynVar.N9.G;
                if (chat4 != null) {
                    j11 = chat4.f20047id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", ynVar.N9.f42624a);
                bundle2.putInt("dialog_filter_id", ynVar.N9.f42626b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(ynVar.currentAccount).edit().remove("diditem" + ynVar.N9.Z).apply();
                yn ynVar2 = new yn(bundle2);
                ArrayList arrayList = ynVar.cb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = ynVar.cb;
                    ynVar2.cb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                ynVar2.P9 = true;
                Ic = true;
                ynVar.presentFragment(ynVar2, true);
            }
        }
    }

    public static void Y(yn ynVar) {
        if (ynVar.V2.getAlpha() != 0.0f && !ynVar.actionBar.s() && !ynVar.z9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(ynVar.V2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            ynVar.F9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void Y0(yn ynVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = ynVar.getMessagesController().getInputPeer(ynVar.R5);
                tL_messages_getHistory.offset_date = ynVar.f43520u7 + 86400;
                tL_messages_getHistory.limit = 1;
                ynVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new ai.v1(25, ynVar, tLObject));
                return;
            }
            ynVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void Z(yn ynVar, long j3, long j10, Long l4, Boolean bool) {
        boolean z10;
        yh.u5 y3 = yh.u5.y(ynVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y3.i0(j3, j10, z10, true);
    }

    public static void Z0(long j3, yn ynVar) {
        if (yh.u5.y(ynVar.currentAccount, false).p().amount < j3) {
            new yh.n7(ynVar.getParentActivity(), ynVar.getResourceProvider(), j3, 13, DialogObject.getShortName(ynVar.a()), new yf(ynVar, 14), ynVar.a()).show();
        } else {
            new yh.p7(ynVar.getParentActivity(), ynVar.resourceProvider).show();
        }
    }

    public static void a1(yn ynVar) {
        if (AndroidUtilities.addToClipboard(ynVar.Jb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.bi.n(R.string.TextCopied, new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(ynVar.getParentActivity()), ynVar.resourceProvider));
        }
    }

    public static void b0(yn ynVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (ynVar.getParentActivity() != null) {
            TLRPC.Chat chat = ynVar.f43315e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !ynVar.f43315e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (ynVar.h == null && (userFull = ynVar.Y7) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43300ca);
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new re(ynVar, 23));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                ynVar.showDialog(alertDialog$Builder.f20377a);
            } else if (!ynVar.F4.isEmpty()) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
                edit.putInt("pin_" + ynVar.R5, ((Integer) ynVar.F4.get(0)).intValue()).commit();
                ynVar.xc(0, true);
            }
        }
    }

    public static void b1(yn ynVar, long j3, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(ynVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.x01.c(ynVar.getParentActivity(), ynVar.currentAccount, -j3, ynVar.getUserConfig().getCurrentUser(), null, z10, z11, ynVar.getResourceProvider());
    }

    public static void b2(yn ynVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            messageObject = u1Var.getMessageObject();
            u1Var.f23212g1 = f7;
            u1Var.f23226h1 = f10;
            org.telegram.ui.Components.db0 db0Var = u1Var.Kc;
            float f11 = u1Var.f23226h1;
            db0Var.h = u1Var.getTranslationX() + f7;
            db0Var.f25746i = f11;
            db0Var.f25749l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int F8 = ynVar.F8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && F8 >= 2 && F8 != 20 && F8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        ynVar.x6(messageObject, z10, true);
                        ynVar.cc();
                        ynVar.Vc(false);
                    }
                }
            }
        }
    }

    public static void b4(yn ynVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(ynVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new c7(ynVar, h0Var, text, 3), new z0(h0Var, 16));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void c0(yn ynVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(ynVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, ynVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(ynVar.currentAccount).editMessage(messageObject, null, false, ynVar, null, i10, i11);
        }
    }

    public static void c1(yn ynVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = ynVar.f43405l5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = ynVar.f43411lb;
            if (i10 == 5) {
                int i11 = ynVar.currentAccount;
                long j3 = ynVar.R5;
                MessageSuggestionParams messageSuggestionParams = ynVar.f43321e5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new yh.f0(context, i11, j3, messageSuggestionParams, ynVar, ynVar.getResourceProvider(), 0, new xe(ynVar, 3)).show();
            } else if (i10 == 1 && (messageObject = ynVar.f43431n5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = ynVar.f43321e5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    ynVar.Sb(messageSuggestionParams2);
                } else if (ynVar.f43431n5.canEditMedia() && ynVar.f43417m5 == 0) {
                    if (ynVar.H1 == null) {
                        ynVar.E7();
                    }
                    ynVar.H1.H1(ynVar.f43431n5, -1);
                    ynVar.W9();
                } else {
                    ynVar.D(ynVar.f43431n5.getId(), 0, 0, 0, true, true);
                }
            } else if (ynVar.f43307d5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(ynVar.R5) && !ynVar.f43307d5.hasSecretMessages && ynVar.P3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        ynVar.ba(0);
                        return;
                    }
                    MessageObject messageObject3 = ynVar.f43405l5;
                    if (messageObject3 != null) {
                        ynVar.D(messageObject3.getId(), 0, 0, 0, true, true);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    ynVar.ba(1);
                } else if (i10 == 4) {
                    ynVar.ba(2);
                }
            }
        }
    }

    public static void c2(yn ynVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = ynVar.f43494s6;
        SparseArray[] sparseArrayArr = ynVar.U5;
        if (!ynVar.Ma && (i11 = i10 - ynVar.f43565y0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.zl0 zl0Var = ynVar.f43526v0;
            oi oiVar = new oi(ynVar, z10, sparseArray);
            if (!zl0Var.f33537d2) {
                zl0Var.f33554m2 = new int[2];
                new HashSet();
                zl0Var.n1(zl0Var, true);
                zl0Var.f33545h2 = oiVar;
                zl0Var.f33537d2 = true;
                zl0Var.f33543g2 = i10;
                zl0Var.f33541f2 = i10;
            }
        }
    }

    public static void c4(yn ynVar) {
        if (ynVar.G3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = ynVar.P3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f20068id = 0;
        MessageObject messageObject = new MessageObject(ynVar.currentAccount, tL_message, false, false);
        ynVar.G3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void d0(yn ynVar, long j3, boolean z10) {
        if (!ynVar.F4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
            edit.putInt("pin_" + ynVar.R5, ((Integer) ynVar.F4.get(0)).intValue()).commit();
            ynVar.F4.clear();
            ynVar.H4.clear();
            ynVar.J4 = 0;
            ynVar.N4 = 0;
            ynVar.O4 = 0;
            ynVar.xc(0, true);
        }
        if (ChatObject.isMonoForum(ynVar.f43315e) && ChatObject.canManageMonoForum(ynVar.currentAccount, ynVar.f43315e)) {
            if (j3 != 0) {
                ynVar.getMessagesStorage().removeTopic(-ynVar.f43315e.f20047id, j3);
                ynVar.getMessagesController().deleteSavedDialog(j3, ynVar.getMessagesController().getInputPeer(-ynVar.f43315e.f20047id));
                ynVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(ynVar.f43315e.f20047id, j3);
            }
        } else {
            ynVar.getMessagesController().deleteDialog(ynVar.R5, 1, z10);
            ynVar.getMessagesStorage().removeAllTopics(ynVar.R5);
            ynVar.getMessagesController().getTopicsController().reloadTopics(-ynVar.R5);
        }
        ynVar.K5.put(j3, 0);
        org.telegram.ui.Components.w31 w31Var = ynVar.P1;
        if (w31Var != null) {
            w31Var.setAllTopicsHidden(false);
        }
        if (j3 == ynVar.f43280b4) {
            ynVar.y7(false, null);
            ynVar.f43565y0.O(false);
        }
    }

    public static void d1(yn ynVar, TLRPC.User user, String str, Boolean bool) {
        Intent intent;
        String country;
        if (ynVar.getParentActivity() == null) {
            return;
        }
        if (bool.booleanValue()) {
            intent = new Intent("android.intent.action.INSERT");
            intent.setType("vnd.android.cursor.dir/raw_contact");
        } else {
            intent = new Intent("android.intent.action.INSERT_OR_EDIT");
            intent.setType("vnd.android.cursor.item/contact");
        }
        if (user != null) {
            intent.putExtra("name", ContactsController.formatName(user.first_name, user.last_name));
        }
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        ContentValues contentValues = new ContentValues();
        contentValues.put("mimetype", "vnd.android.cursor.item/phone_v2");
        if (!str.startsWith("+")) {
            TLRPC.User currentUser = ynVar.getUserConfig().getCurrentUser();
            HashMap hashMap = new HashMap();
            boolean z10 = false;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f41340a = split[2];
                    String str2 = split[0];
                    obj.f41342c = str2;
                    obj.d = split[1];
                    List list = (List) hashMap.get(str2);
                    if (list == null) {
                        String str3 = split[0];
                        list = new ArrayList();
                        hashMap.put(str3, list);
                    }
                    list.add(obj);
                }
                bufferedReader.close();
            } catch (Exception e7) {
                FileLog.e(e7);
            }
            String str4 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 < 1) {
                    break;
                }
                List list2 = (List) hashMap.get(str4.substring(0, i10));
                if (list2 != null && list2.size() > 0) {
                    String str5 = ((ut) list2.get(0)).f41342c;
                    if (str5.endsWith("0") && str.startsWith("0")) {
                        str = str.substring(1);
                    }
                    str = a4.a.q("+", str5, str);
                    z10 = true;
                } else {
                    i10--;
                }
            }
            if (!z10 && Build.VERSION.SDK_INT >= 23) {
                Context context = ApplicationLoader.applicationContext;
                if (context != null) {
                    country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                } else {
                    country = Locale.getDefault().getCountry();
                }
                if (country.endsWith("0") && str.startsWith("0")) {
                    str = str.substring(1);
                }
                str = a4.a.q("+", country, str);
            }
        }
        contentValues.put("data1", str);
        contentValues.put("data2", (Integer) 2);
        arrayList.add(contentValues);
        intent.putExtra("finishActivityOnSaveCompleted", true);
        intent.putParcelableArrayListExtra("data", arrayList);
        ynVar.getParentActivity().startActivity(intent);
    }

    public static boolean d2(yn ynVar, View view, RectF rectF) {
        RectF rectF2 = ynVar.Cb;
        if (rectF != null && ynVar.f43526v0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void e0(yn ynVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(ynVar.currentAccount).getInputUser(user.f20194id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(ynVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new rh(ynVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void e1(yn ynVar, int i10) {
        if (ynVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 q82 = ynVar.q8(i10, false);
            if (q82 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) q82;
                zg.n0 n0Var = u1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = u1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (n0Var.K || randomUnreadReaction.big)) {
                    zg.i0.d(ynVar, null, q82, null, 0.0f, 0.0f, zg.m0.d(randomUnreadReaction.reaction), ynVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    zg.i0.f();
                }
                n0Var.K = false;
                MessageObject messageObject = u1Var.f23477y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (q82 instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) q82;
                zg.n0 n0Var2 = w0Var.C0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = w0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (n0Var2.K || randomUnreadReaction2.big)) {
                    zg.i0.d(ynVar, null, q82, null, 0.0f, 0.0f, zg.m0.d(randomUnreadReaction2.reaction), ynVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    zg.i0.f();
                }
                n0Var2.K = false;
                MessageObject messageObject2 = w0Var.H0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void e4(yn ynVar) {
        if (ynVar.H3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f20068id = 0;
        MessageObject messageObject = new MessageObject(ynVar.currentAccount, tL_message, false, false);
        ynVar.H3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void f0(yn ynVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, uf ufVar) {
        String str4;
        if (ynVar.f43281b5 != null && i10 < arrayList.size() && ynVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = ynVar.f43281b5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.u41.H(ynVar.getParentActivity(), ynVar, inputPeer, iArr[0], ynVar.f43281b5.summarized, str, str4, charSequence, z10, ufVar, new yf(ynVar, 26)).setDimBehind(false);
            ynVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ynVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + ynVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + ynVar.a(), i11 - 1).apply();
                ynVar.Pc(true);
            }
        }
    }

    public static void f1(yn ynVar) {
        if (ynVar.P3 == 0 && ynVar.getMessagesController().freezeUntilDate > ynVar.getConnectionsManager().getCurrentTime() && !b.a(ynVar.currentAccount, ynVar.f43327f)) {
            b.c(ynVar.getParentActivity(), ynVar.currentAccount, ynVar.getResourceProvider());
        }
    }

    public static void g0(yn ynVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(ynVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f20163id;
        long clientUserId = ynVar.getUserConfig().getClientUserId();
        long j10 = ynVar.R5;
        if (clientUserId == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void g1(yn ynVar, View view, int i10) {
        org.telegram.ui.Components.z5 z5Var;
        TLRPC.User user;
        char c10;
        nk nkVar;
        nk nkVar2;
        if (i10 != 0) {
            gg.k1 adapter = ynVar.G1.getAdapter();
            if (adapter.f10696w0 != null && !adapter.f10678h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = ynVar.G1.getAdapter().J(i11);
            int i12 = ynVar.G1.getAdapter().X;
            int i13 = ynVar.G1.getAdapter().Y;
            if (ynVar.G1.getAdapter().F != null && i11 == 1) {
                ynVar.W.O0(i12, i13, ynVar.G1.getAdapter().F + "@" + ChatObject.getPublicUsername(ynVar.f43315e) + " ", false);
            } else if (ynVar.G1.getAdapter().F != null && i11 == 0) {
                ynVar.W.O0(i12, i13, a4.a.t(new StringBuilder(), ynVar.G1.getAdapter().F, " "), false);
            } else if (J instanceof hg.a2) {
                if (!ynVar.getUserConfig().isPremium()) {
                    ynVar.showDialog(new rg.y0(ynVar, ynVar.getParentActivity(), ynVar.currentAccount, true, 31, false, null));
                    return;
                }
                hg.a2 a2Var = (hg.a2) J;
                org.telegram.ui.Components.e5.a0(ynVar.currentAccount, Math.max(1, a2Var.a()), ynVar.R5, new qc(2, ynVar, a2Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (ynVar.P3 != 0 || !ynVar.e7(view)) {
                        if (view instanceof org.telegram.ui.Cells.d8) {
                            sendAnimationData = ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.e5.a0(ynVar.currentAccount, 1, ynVar.a(), new ua(ynVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), ynVar.G1.getAdapter().L(i11), sendAnimationData, 1));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (ynVar.f43404l3 && (nkVar2 = ynVar.P2) != null && nkVar2.getVisibility() == 0) {
                        ynVar.Ya(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        ynVar.W.O0(i12, i13, a4.a.q("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (ynVar.f43404l3 && (nkVar = ynVar.P2) != null && nkVar.getVisibility() == 0) {
                        ynVar.Ya(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        ynVar.W.O0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(sa.e.v(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.o61("" + user2.f20194id, 3, null), 0, spannableString.length(), 33);
                        ynVar.W.O0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof gg.h1) {
                    if (ynVar.G1.getAdapter().J != null && ynVar.P3 != 1) {
                        gg.h1 h1Var = (gg.h1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(h1Var.f10605a, ynVar.R5, ynVar.f43405l5, ynVar.V3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = ynVar.D8();
                        of2.ephemeralReceiverBotId = h1Var.f10606b;
                        of2.monoForumPeer = ynVar.O8();
                        of2.suggestionParams = ynVar.f43321e5;
                        ynVar.getSendMessagesHelper().sendMessage(of2);
                        ynVar.W.setFieldText("");
                        ynVar.f9(false);
                    }
                } else if (J instanceof String) {
                    if (ynVar.G1.getAdapter().J != null) {
                        if (ynVar.P3 == 1) {
                            org.telegram.ui.Components.e5.M(ynVar.getParentActivity(), ynVar.R5, new o(8, ynVar, (String) J), ynVar.f43300ca);
                            return;
                        } else if (!ynVar.e7(view)) {
                            org.telegram.ui.Components.e5.a0(ynVar.currentAccount, 1, ynVar.R5, new qc(3, ynVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    ynVar.W.O0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (ynVar.W.getFieldText() != null) {
                        if (ynVar.P3 == 1 || !ynVar.e7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (ynVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity(), 0, ynVar.f43300ca);
                                    alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    ynVar.showDialog(alertDialog$Builder.f20377a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(ynVar.G1.getAdapter().R);
                                ynVar.Fa = arrayList;
                                PhotoViewer.t1().K2(null, ynVar, ynVar.f43300ca);
                                PhotoViewer.t1().g2(arrayList, ynVar.G1.getAdapter().M(i11), 3, false, ynVar.Ga, ynVar);
                                return;
                            }
                            org.telegram.ui.Components.e5.a0(ynVar.currentAccount, 1, ynVar.a(), new qc(4, ynVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    org.telegram.ui.ActionBar.g6 g6Var = new org.telegram.ui.ActionBar.g6(27, ynVar, (TLRPC.TL_inlineBotWebView) J);
                    if (ynVar.f43351gb) {
                        g6Var.run();
                    } else {
                        cj1.a(ynVar.getParentActivity(), new qc(6, ynVar, g6Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    ck ckVar = ynVar.G1;
                    if (ckVar != null && (user = ckVar.getAdapter().f10696w0) != null) {
                        ynVar.W.setFieldText("");
                        long j3 = ynVar.R5;
                        if (j3 == user.f20194id) {
                            ynVar.f43310d8 = j3;
                            ynVar.getMessagesController().sendBotStart(ynVar.f43327f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f20194id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", ynVar.R5);
                        if (ynVar.getMessagesController().checkCanOpenChat(bundle, ynVar)) {
                            ynVar.presentFragment(new yn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    jk jkVar = ynVar.W;
                    jkVar.S();
                    jkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            ynVar.W.O0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = ynVar.W.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e7) {
                                FileLog.e((Throwable) e7, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.q5.f(ynVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                z5Var = new org.telegram.ui.Components.z5(f7, fontMetricsInt);
                            } else {
                                z5Var = new org.telegram.ui.Components.z5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(z5Var, 0, spannableString2.length(), 33);
                            ynVar.W.O0(i12, i13, spannableString2, false);
                            ynVar.G1.o(false);
                        }
                    }
                    ynVar.W.O0(i12, i13, str, true);
                    ynVar.G1.o(false);
                }
            }
        }
    }

    public static void h0(yn ynVar, int i10) {
        if (ynVar.P3 == 7) {
            Object E = ynVar.K3.E(i10);
            if (i10 == 0) {
                ynVar.K3.getClass();
            }
            if (E instanceof MessageObject) {
                ynVar.ea((MessageObject) E);
            }
        } else if (ynVar.f43440o3 != null) {
            if (i10 >= 0 && i10 < ynVar.getMediaDataController().searchResultMessages.size()) {
                ynVar.f43452p3 = false;
                ynVar.kb(false, true, false);
                ynVar.getMediaDataController().setSearchedPosition(i10);
                ynVar.Ec(ynVar.getMediaDataController().getMask(), ynVar.getMediaDataController().getSearchPosition(), ynVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new ve(ynVar, ynVar.getMediaDataController().searchResultMessages.get(i10), 5));
            }
        } else {
            ynVar.getMediaDataController().jumpToSearchedMessage(ynVar.classGuid, i10);
            ynVar.Kb(false);
        }
    }

    public static void h1(yn ynVar, String str) {
        if (MessagesController.getInstance(ynVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            ynVar.getParentActivity();
            nf.f.n(str);
            return;
        }
        org.telegram.ui.Components.e5.o0(ynVar.getParentActivity(), ynVar.f43300ca, str, false, new ng(ynVar, str, 0));
    }

    public static void i0(yn ynVar, int i10) {
        org.telegram.ui.ActionBar.c5 c5Var = ynVar.parentLayout;
        if (c5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 backgroundFragment = c5Var.getBackgroundFragment();
        if (backgroundFragment instanceof yn) {
            yn ynVar2 = (yn) backgroundFragment;
            if (ynVar2.a() == ynVar.R5) {
                ynVar.finishFragment();
                ynVar2.D(i10, 0, 0, 0, true, true);
                return;
            }
        }
        ynVar.presentFragment(P9(i10, ynVar.R5));
    }

    public static void i1(yn ynVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != ynVar.d()) {
            ynVar.Xa = SystemClock.uptimeMillis();
            ynVar.f43433n7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                ynVar.Ra(ynVar.d());
            } else if (ynVar.d() == 0) {
                ynVar.Ra(l4.longValue());
            } else {
                ynVar.f43407l7 = -1;
            }
            ynVar.getConnectionsManager().cancelRequestsForGuid(ynVar.classGuid);
            ynVar.getMessagesStorage().cancelTasksForGuid(ynVar.classGuid);
            ynVar.classGuid = ConnectionsManager.generateClassGuid();
            ynVar.Oa();
            ynVar.f43307d5 = null;
            ynVar.f43495s7 = 0;
            ynVar.f43371i7 = false;
            ynVar.f43383j7 = true;
            ynVar.f43334f6.clear();
            ynVar.f43280b4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = ynVar.getMessagesController().getTopicsController().findTopic(-ynVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                ynVar.f43368i4 = i12;
                ynVar.f43380j4 = findTopic.read_outbox_max_id;
                ynVar.f43393k4 = Math.max(1, i12);
                ynVar.getMessagesController().getTopicsController().getTopicRepliesCount(ynVar.R5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                ynVar.f43266a4 = null;
                ynVar.Y3 = null;
                ynVar.V3 = null;
                ynVar.f43405l5 = null;
                ynVar.f43368i4 = 0;
                ynVar.f43380j4 = 0;
                ynVar.f43393k4 = 0;
                ynVar.f43280b4 = 0L;
                ynVar.f43294c4 = 0;
                ynVar.f43306d4 = null;
                ynVar.f43332f4 = false;
                ynVar.f43320e4 = false;
            }
            ynVar.r8();
            ynVar.Mc(true);
            ynVar.Y0.m(true);
            ynVar.Y0.b();
            ynVar.P1.setCurrentTopic(l4.longValue());
            ynVar.Pc(true);
            ynVar.gc(true);
            ynVar.getMessagesController().setForumLastTopicId(-ynVar.a(), ynVar.d());
            ynVar.h9(true);
            ynVar.f9(true);
            jk jkVar = ynVar.W;
            if (jkVar != null) {
                jkVar.m0(false);
                ynVar.W.F1(true);
            }
            ynVar.A6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            ynVar.f43378j1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            ynVar.f43390k1 = i11;
            ynVar.Ac(false);
            ynVar.zc(false);
            ynVar.Qc();
            qn qnVar = ynVar.f43412lc;
            if (qnVar != null && ynVar.actionBar.f21286n0) {
                qnVar.p(null);
            }
        }
    }

    public static void i2(yn ynVar) {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (ynVar.f43553x1 != null) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var2 = null;
        for (int childCount = ynVar.f43526v0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = ynVar.f43526v0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (primaryMessageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                u1Var2 = u1Var;
            }
        }
        ynVar.tb(u1Var2);
    }

    public static void j0(yn ynVar, zf.a aVar, Runnable runnable) {
        if (!ynVar.isFinished) {
            if (zf.a.m(yh.u5.x(ynVar.currentAccount, aVar.f53321a).p()).f53322b < aVar.f53322b) {
                zf.b bVar = aVar.f53321a;
                if (bVar == zf.b.f53323a) {
                    new yh.n7(ynVar.getParentActivity(), ynVar.getResourceProvider(), aVar.a(), 13, ng.d.h(ynVar.currentAccount, ynVar.a()), null, ynVar.a()).show();
                    return;
                } else if (bVar == zf.b.f53324b) {
                    new di.j(ynVar.getParentActivity(), ynVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void j1(yn ynVar, Object[] objArr, org.telegram.ui.Components.ry0 ry0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.yc ycVar = new org.telegram.ui.Components.yc(ry0Var.container, ynVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.rc r10 = ycVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r10.f30427j = 2750;
                r10.k(true);
            }
        }
    }

    public static void k0(yn ynVar, MessageObject messageObject, Long l4, Runnable runnable) {
        yh.u5.y(ynVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void k1(yn ynVar, long j3, long j10) {
        yh.u5.y(ynVar.currentAccount, false).C(j3, j10, new kg(ynVar, j3, j10, 0));
    }

    public static void k8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f28925a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o11(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f28925a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.o11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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

    public static void l0(yn ynVar) {
        org.telegram.ui.Cells.u1 u1Var;
        ul ulVar;
        int i10;
        if (!ynVar.Ob && ynVar.D3 && ynVar.f43526v0.G && ynVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = ynVar.f43526v0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = ynVar.f43526v0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        u1Var = (org.telegram.ui.Cells.u1) childAt;
                        if (u1Var.getMessageObject() != null && u1Var.getMessageObject().messageOwner != null && u1Var.getMessageObject().messageOwner.video_processing_pending) {
                            if (u1Var.getCurrentPosition() != null) {
                                if (u1Var.getMessageObject() != null && (u1Var.getCurrentPosition().flags & 8) != 0) {
                                    int i11 = u1Var.getCurrentPosition().flags;
                                    if (u1Var.getMessageObject().isOutOwner()) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    if ((i11 & i10) == 0) {
                                        continue;
                                    }
                                }
                            }
                            u1Var.getLocationInWindow(iArr);
                            float timeY = u1Var.getTimeY() + iArr[1];
                            if (timeY >= AndroidUtilities.dp(240.0f) && timeY <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    u1Var = null;
                    break;
                }
            }
            if (u1Var != null) {
                ynVar.Ob = true;
                ul ulVar2 = new ul(ynVar, ynVar.getParentActivity());
                ulVar2.p(true);
                ulVar2.K = Layout.Alignment.ALIGN_CENTER;
                ulVar2.d = 3500L;
                ulVar2.T = true;
                ulVar2.f4989e = true;
                ulVar2.h = AndroidUtilities.dp(150.0f);
                ulVar2.q(8.0f);
                ynVar.f43578z1 = ulVar2;
                ulVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                ynVar.V0.addView(ynVar.f43578z1, w7.z5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                u1Var.getLocationInWindow(iArr);
                ynVar.A1 = u1Var.getTimeY() + iArr[1];
                ynVar.f43578z1.setTranslationY(((-ulVar.getTop()) - AndroidUtilities.dp(120.0f)) + ynVar.A1);
                ynVar.f43578z1.m(0.0f, (u1Var.f23347pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + u1Var.f23377rb);
                ynVar.f43578z1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new qe(ynVar, 1));
            AndroidUtilities.runOnUIThread(new qe(ynVar, 1), 2000L);
        }
    }

    public static void l1(yn ynVar, long j3, long j10, Long l4) {
        int i10;
        String str;
        if (ynVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = ynVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(ynVar.f43315e)) {
            i10 = R.string.RemoveMessageFeeMessageChannel;
        } else {
            i10 = R.string.RemoveMessageFeeMessage;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(j3)));
        if (l4.longValue() > 0) {
            str = LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l4.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.e5.i0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new nh(ynVar, j3, j10, l4, 0), ynVar.resourceProvider, true);
    }

    public static void m0(yn ynVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.n61[] n61VarArr;
        if (ynVar.D5 != 0) {
            ynVar.getConnectionsManager().cancelRequest(ynVar.D5, true);
            ynVar.D5 = 0;
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
            if ((charSequence instanceof Spannable) && (n61VarArr = (org.telegram.ui.Components.n61[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.n61.class)) != null && n61VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.n61 n61Var : n61VarArr) {
                    arrayList.add(n61Var.getURL());
                }
            }
            if (arrayList != null && ynVar.F5 != null && arrayList.size() == ynVar.F5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) ynVar.F5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            ynVar.F5 = arrayList;
        } catch (Exception e7) {
            FileLog.e(e7);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new yf(ynVar, 16));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new yf(ynVar, 15));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (ynVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new we(ynVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = ynVar.E5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = ynVar.f43375ib + 1;
            ynVar.f43375ib = i11;
            jg jgVar = new jg(ynVar, i11, getwebpagepreview, 0);
            if (ynVar.f43387jb == null) {
                ynVar.f43387jb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) ynVar.f43387jb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                jgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            o6 o6Var = new o6(ynVar, getwebpagepreview, jgVar, 1);
            if (ynVar.D5 != 0) {
                ynVar.getConnectionsManager().cancelRequest(ynVar.D5, true);
            }
            ynVar.D5 = ynVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new ai.m0(6, ynVar, o6Var));
            ynVar.getConnectionsManager().bindRequestToGuid(ynVar.D5, ynVar.classGuid);
        }
    }

    public static void m1(yn ynVar) {
        MessagesController messagesController = ynVar.getMessagesController();
        long j3 = ynVar.R5;
        long j10 = ynVar.J6;
        int i10 = ynVar.classGuid;
        int i11 = ynVar.P3;
        long j11 = ynVar.f43280b4;
        int i12 = ynVar.f43393k4;
        int i13 = ynVar.T5;
        ynVar.T5 = i13 + 1;
        messagesController.loadMessages(j3, j10, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j11, i12, i13, ynVar.f43332f4);
    }

    public static void n0(yn ynVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(ynVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (ynVar.i() != null) {
                tLObject2 = ynVar.i();
            } else {
                tLObject2 = ynVar.f43315e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = ynVar.f43327f;
                if (user2 != null && user2.bot && user.f20194id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.bi.o(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.yc.a0(ynVar), null);
                } else if (user2 != null && user2.bot && user.f20194id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.bi.o(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.yc.a0(ynVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.bi.o(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.yc.a0(ynVar), null);
                } else {
                    TLRPC.Chat chat = ynVar.f43315e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.bi.o(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.yc.a0(ynVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = ynVar.f43315e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.bi.o(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.yc.a0(ynVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                ynVar.V9(user.f20194id, ynVar.f43372i8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.w6 w6Var = new org.telegram.ui.Components.w6(ynVar.getParentActivity());
                w6Var.setColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20922ia, false));
                w6Var.setBackgroundColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.L5, false));
                w6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(ynVar.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                b2Var.V = w6Var;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(ynVar, user, atomicBoolean, tL_attachMenuBot, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(ynVar.getParentActivity(), 5, ynVar.getResourceProvider());
                    a2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    a2Var.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
                    a2Var.setMultiline(true);
                    a2Var.e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
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
                    a2Var.setPadding(dp, 0, dp2, 0);
                    a2Var.setOnClickListener(new qf(3, a2Var, atomicBoolean));
                    b2Var.G = 6;
                    alertDialog$Builder.n(a2Var);
                }
                alertDialog$Builder.o();
            } else {
                cj1.a(ynVar.getParentActivity(), new z(ynVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void n1(yn ynVar) {
        int i10;
        TLRPC.ChatFull chatFull = ynVar.X7;
        if (chatFull != null && !ynVar.f43442o5) {
            TLRPC.Chat chat = ynVar.f43315e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && ynVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ynVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = ynVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && ynVar.visibleDialog == null && ynVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = ynVar.getParentActivity();
                    re reVar = new re(ynVar, 14);
                    re reVar2 = new re(ynVar, 15);
                    Pattern pattern = org.telegram.ui.Components.e5.f25971a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ai.k2(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
                    b2Var.V = frameLayout;
                    b2Var.O0 = 0.3974359f;
                    b2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), reVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), reVar2);
                    ynVar.showDialog(b2Var);
                }
            }
        }
    }

    public static void o0(yn ynVar) {
        if (ynVar.Jb == null) {
            return;
        }
        z31[] z31VarArr = {z31.R(ynVar.getParentActivity(), ynVar, true, ynVar.resourceProvider, new qc(5, ynVar, z31VarArr))};
    }

    public static void p0(yn ynVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, o6 o6Var) {
        try {
            a0.i iVar = new a0.i();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f20068id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(ynVar.currentAccount, tL_message, false, false));
            iVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            ynVar.getMessagesController().getStoriesController().f1298k.d(iVar, new oh(4, iVar, o6Var), ynVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void p1(org.telegram.ui.yn r19, final org.telegram.ui.z31[] r20, final org.telegram.ui.Components.b80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.p1(org.telegram.ui.yn, org.telegram.ui.z31[], org.telegram.ui.Components.b80):void");
    }

    public static Integer p8(ArrayList arrayList, int i10, int[] iArr) {
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

    public static void q0(yn ynVar, long j3, long j10) {
        BotForumHelper.getInstance(ynVar.currentAccount).saveIsStreamingTopic(j3, j10, false);
        ynVar.Kb = null;
    }

    public static void q1(yn ynVar) {
        if (ynVar.K1) {
            ynVar.getMessagesController().addDialogToFolder(ynVar.R5, 0, 0, 0L);
            ynVar.Q7();
            ynVar.f43542w3.j(23, ynVar.R5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + ynVar.R5, false);
            edit.putBoolean("dialog_bar_block" + ynVar.R5, false);
            edit.putBoolean("dialog_bar_report" + ynVar.R5, false);
            edit.commit();
            ynVar.Pc(false);
            ynVar.getNotificationsController().clearDialogNotificationsSettings(ynVar.R5, ynVar.d());
        } else if (ynVar.J1.getTag() != null && ((Integer) ynVar.J1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = ynVar.X7;
            if (chatFull != null && chatFull.participants != null) {
                a0.i iVar = new a0.i();
                for (int i10 = 0; i10 < ynVar.X7.participants.participants.size(); i10++) {
                    iVar.k(null, ynVar.X7.participants.participants.get(i10).user_id);
                }
                long j3 = ynVar.X7.f20048id;
                org.telegram.ui.Components.p70 p70Var = new org.telegram.ui.Components.p70(ynVar.getParentActivity(), ynVar.currentAccount, iVar, ynVar.X7.f20048id, ynVar, ynVar.f43300ca);
                p70Var.f29628l0 = new re(ynVar, 25);
                p70Var.show();
            }
        } else if (ynVar.J1.getTag() != null) {
            ynVar.qb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", ynVar.f43327f.f20194id);
            bundle.putBoolean("addContact", true);
            qs qsVar = new qs(bundle);
            qsVar.O = new re(ynVar, 26);
            ynVar.presentFragment(qsVar);
        }
    }

    public static void r1(yn ynVar) {
        org.telegram.ui.Components.n40.h.a();
        ynVar.showDialog(new xh.q1(ynVar.getParentActivity(), ynVar.currentAccount, ynVar.a(), null, null));
    }

    public static void s0(yn ynVar, ArrayList arrayList, long j3, org.telegram.ui.Components.sm0 sm0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(ynVar.currentAccount).sendMessage(arrayList, j3, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new gg(ynVar, j3, 4), 400L);
            sm0Var.dismiss();
        }
    }

    public static void s1(yn ynVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = ynVar.f43570y6;
        int[] iArr4 = ynVar.f43558x6;
        boolean[] zArr = ynVar.C6;
        int[] iArr5 = ynVar.f43545w6;
        int[] iArr6 = ynVar.f43583z6;
        boolean[] zArr2 = ynVar.B6;
        ArrayList arrayList = ynVar.f43334f6;
        if ((i10 - i11) - i12 <= i13 && !ynVar.E6) {
            boolean[] zArr3 = ynVar.A6;
            if (!zArr3[0]) {
                ynVar.E6 = true;
                arrayList.add(Integer.valueOf(ynVar.T5));
                if (ynVar.f43454p6.size() != 0) {
                    MessagesController messagesController = ynVar.getMessagesController();
                    j3 = 0;
                    long j10 = ynVar.R5;
                    c10 = 0;
                    long j11 = ynVar.J6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = ynVar.classGuid;
                    int i17 = ynVar.P3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = ynVar.f43280b4;
                    int i18 = ynVar.f43393k4;
                    int i19 = ynVar.T5;
                    ynVar.T5 = i19 + 1;
                    messagesController.loadMessages(j10, j11, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j12, i18, i19, ynVar.f43332f4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    MessagesController messagesController2 = ynVar.getMessagesController();
                    long j13 = ynVar.R5;
                    long j14 = ynVar.J6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = ynVar.classGuid;
                    int i22 = ynVar.P3;
                    long j15 = ynVar.f43280b4;
                    int i23 = ynVar.f43393k4;
                    int i24 = ynVar.T5;
                    ynVar.T5 = i24 + 1;
                    messagesController2.loadMessages(j13, j14, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j15, i23, i24, ynVar.f43332f4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (ynVar.J6 != 0 && !zArr3[1]) {
                    ynVar.E6 = true;
                    arrayList.add(Integer.valueOf(ynVar.T5));
                    MessagesController messagesController3 = ynVar.getMessagesController();
                    long j16 = ynVar.J6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = ynVar.classGuid;
                    int i28 = ynVar.P3;
                    long j17 = ynVar.f43280b4;
                    int i29 = ynVar.f43393k4;
                    int i30 = ynVar.T5;
                    ynVar.T5 = i30 + 1;
                    messagesController3.loadMessages(j16, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j17, i29, i30, ynVar.f43332f4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i12 > 0 && !ynVar.G7 && i11 <= 10) {
            if (ynVar.J6 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(ynVar.T5));
                MessagesController messagesController4 = ynVar.getMessagesController();
                long j18 = ynVar.J6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = ynVar.classGuid;
                int i34 = ynVar.P3;
                long j19 = ynVar.f43280b4;
                int i35 = ynVar.f43393k4;
                int i36 = ynVar.T5;
                ynVar.T5 = i36 + 1;
                messagesController4.loadMessages(j18, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j19, i35, i36, ynVar.f43332f4);
                ynVar.G7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(ynVar.T5));
                MessagesController messagesController5 = ynVar.getMessagesController();
                long j20 = ynVar.R5;
                long j21 = ynVar.J6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = ynVar.classGuid;
                int i40 = ynVar.P3;
                long j22 = ynVar.f43280b4;
                int i41 = ynVar.f43393k4;
                int i42 = ynVar.T5;
                ynVar.T5 = i42 + 1;
                messagesController5.loadMessages(j20, j21, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j22, i41, i42, ynVar.f43332f4);
                ynVar.G7 = true;
            }
        }
    }

    public static void t0(long j3, yn ynVar) {
        if (yh.u5.y(ynVar.currentAccount, false).p().amount < j3) {
            new yh.n7(ynVar.getParentActivity(), ynVar.getResourceProvider(), j3, 13, DialogObject.getShortName(ynVar.a()), new yf(ynVar, 14), ynVar.a()).show();
        } else {
            new yh.p7(ynVar.getParentActivity(), ynVar.resourceProvider).show();
        }
    }

    public static boolean t9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void u0(yn ynVar, TLRPC.Document document) {
        ynVar.f43505t4.put(document, 0);
        SendMessagesHelper.getInstance(ynVar.currentAccount).sendSticker(document, null, ynVar.R5, null, null, null, ynVar.f43381j5, null, true, 0, 0, false, null, ynVar.D8(), 0L, ynVar.O8(), ynVar.f43321e5);
    }

    public static void u1(yn ynVar) {
        if (MessagesController.getInstance(ynVar.currentAccount).isDialogMuted(ynVar.R5, ynVar.d())) {
            ynVar.Oc(true);
            AndroidUtilities.runOnUIThread(new qe(ynVar, 17), 150L);
            ynVar.f43328f0.M(null, null);
            if (ynVar.getParentActivity() != null) {
                org.telegram.ui.Components.yc.z(ynVar, 4, 0, ynVar.f43300ca).j();
                return;
            }
            return;
        }
        View view = ynVar.f43291c1.f21519i;
        if (view instanceof org.telegram.ui.ActionBar.f1) {
            ((org.telegram.ui.ActionBar.f1) view).b();
        }
    }

    public static void v0(yn ynVar, TLRPC.Document document) {
        ynVar.f43505t4.put(document, 0);
        SendMessagesHelper.getInstance(ynVar.currentAccount).sendSticker(document, null, ynVar.R5, null, null, null, ynVar.f43381j5, null, true, 0, 0, false, null, ynVar.D8(), 0L, ynVar.O8(), ynVar.f43321e5);
    }

    public static void v1(yn ynVar, String str) {
        if (ynVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(ynVar.currentAccount).getInviteText(1));
            ynVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void w0(yn ynVar) {
        long j3;
        ArrayList arrayList = ynVar.f43334f6;
        arrayList.add(Integer.valueOf(ynVar.T5));
        if (ynVar.P3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(ynVar.currentAccount);
            String str = ynVar.f43491s3;
            int i10 = ynVar.classGuid;
            int i11 = ynVar.M3;
            int i12 = ynVar.T5;
            ynVar.T5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (ynVar.f43520u7 != 0) {
            MessagesController messagesController = ynVar.getMessagesController();
            long j10 = ynVar.R5;
            long j11 = ynVar.J6;
            int i13 = ynVar.f43520u7;
            int i14 = ynVar.classGuid;
            int i15 = ynVar.P3;
            long j12 = ynVar.f43280b4;
            int i16 = ynVar.f43393k4;
            int i17 = ynVar.T5;
            ynVar.T5 = i17 + 1;
            messagesController.loadMessages(j10, j11, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j12, i16, i17, ynVar.f43332f4);
        } else if (ynVar.f43495s7 != 0 && (!ynVar.E9() || ynVar.f43495s7 == ynVar.J7 || ynVar.f43332f4)) {
            int i18 = ynVar.f43359h7;
            if (i18 != 0) {
                ynVar.J6 = i18;
                MessagesController messagesController2 = ynVar.getMessagesController();
                long j13 = ynVar.J6;
                boolean z10 = ynVar.f7;
                int i19 = ynVar.e7;
                int i20 = ynVar.f43495s7;
                int i21 = ynVar.classGuid;
                int i22 = ynVar.P3;
                long j14 = ynVar.f43280b4;
                int i23 = ynVar.f43393k4;
                int i24 = ynVar.T5;
                ynVar.T5 = i24 + 1;
                messagesController2.loadMessages(j13, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j14, i23, i24, ynVar.f43332f4);
            } else {
                MessagesController messagesController3 = ynVar.getMessagesController();
                long j15 = ynVar.R5;
                long j16 = ynVar.J6;
                boolean z11 = ynVar.f7;
                int i25 = ynVar.e7;
                int i26 = ynVar.f43495s7;
                int i27 = ynVar.classGuid;
                int i28 = ynVar.P3;
                long j17 = ynVar.f43280b4;
                int i29 = ynVar.f43393k4;
                int i30 = ynVar.T5;
                ynVar.T5 = i30 + 1;
                messagesController3.loadMessages(j15, j16, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j17, i29, i30, ynVar.f43332f4);
            }
        } else if (ynVar.f43347g7) {
            ynVar.T5++;
        } else {
            MessagesController messagesController4 = ynVar.getMessagesController();
            long j18 = ynVar.R5;
            long j19 = ynVar.J6;
            boolean z12 = ynVar.f7;
            int i31 = ynVar.e7;
            int i32 = ynVar.f43495s7;
            int i33 = ynVar.classGuid;
            int i34 = ynVar.P3;
            long j20 = ynVar.f43280b4;
            int i35 = ynVar.f43393k4;
            int i36 = ynVar.T5;
            ynVar.T5 = i36 + 1;
            messagesController4.loadMessages(j18, j19, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j20, i35, i36, ynVar.f43332f4);
        }
        int i37 = ynVar.P3;
        if (i37 == 0 || (i37 == 3 && ynVar.J8() == ynVar.getUserConfig().getClientUserId())) {
            if (ynVar.E9() && !ynVar.f43332f4) {
                return;
            }
            arrayList.add(Integer.valueOf(ynVar.T5));
            MessagesController messagesController5 = ynVar.getMessagesController();
            long j21 = ynVar.R5;
            long j22 = ynVar.J6;
            int i38 = ynVar.classGuid;
            if (ynVar.P3 == 3) {
                j3 = 0;
            } else {
                j3 = ynVar.f43280b4;
            }
            long j23 = j3;
            int i39 = ynVar.f43393k4;
            int i40 = ynVar.T5;
            ynVar.T5 = i40 + 1;
            messagesController5.loadMessages(j21, j22, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j23, i39, i40, ynVar.f43332f4);
        }
    }

    public static boolean w1(org.telegram.ui.yn r17, org.telegram.tgnet.TLRPC.MessageEntity r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.w1(org.telegram.ui.yn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void x0(yn ynVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, uf ufVar) {
        String str3;
        if (ynVar.f43281b5 != null && i10 < arrayList.size() && ynVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = ynVar.f43281b5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.u41.H(ynVar.getParentActivity(), ynVar, inputPeer, iArr[0], ynVar.f43281b5.summarized, strArr[0], str3, charSequence, z10, ufVar, new ug(ynVar, 11)).setDimBehind(false);
            ynVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ynVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + ynVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + ynVar.a(), i11 - 1).apply();
                ynVar.Pc(true);
            }
        }
    }

    public static void x1(yn ynVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(ynVar.currentAccount).loadAttachMenuBots(false, true);
            ynVar.V9(user.f20194id, ynVar.f43372i8, false);
        }
    }

    public static void y0(yn ynVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, uf ufVar) {
        if (ynVar.f43281b5 != null && i10 < arrayList.size() && ynVar.getParentActivity() != null) {
            org.telegram.ui.Components.u41.H(ynVar.getParentActivity(), ynVar, inputPeer, iArr[0], ynVar.f43281b5.summarized, "und", str, charSequence, z10, ufVar, new ug(ynVar, 3)).setDimBehind(false);
            ynVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(ynVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + ynVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + ynVar.a(), i11 - 1).apply();
                ynVar.Pc(true);
            }
        }
    }

    public static void y1(yn ynVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(ynVar.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + ynVar.R5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(ynVar.f43315e) && !ynVar.f43315e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.u80.f31378r;
            org.telegram.ui.Components.u80.w(context, ynVar, org.telegram.ui.Components.yc.a0(ynVar), z10);
        }
        ynVar.ub(false, true);
    }

    public static void z0(yn ynVar) {
        ynVar.Z9 = null;
        ynVar.f43526v0.setOnInterceptTouchListener(null);
        ynVar.ib(ynVar.V0, true);
        ChatThemeController.getInstance(ynVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void z1(yn ynVar, org.telegram.ui.Components.b80 b80Var) {
        if (ynVar.Jb == null) {
            return;
        }
        b80Var.u();
        ynVar.I9(ynVar.Jb, false, true);
        nf.f.r(ynVar.getParentActivity(), Uri.parse(ynVar.Jb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(ynVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    @Override
    public final boolean A() {
        return false;
    }

    public final void A6(boolean z10, boolean z11) {
        long j3;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        on onVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i10;
        on onVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j11;
        org.telegram.ui.Components.n11 n11Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.z5 z5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        Long l10;
        if (this.W != null) {
            int i11 = this.P3;
            if (i11 == 0 || i11 == 8 || (i11 == 3 && getUserConfig().getClientUserId() == J8())) {
                long j13 = 0;
                if (this.P3 == 8) {
                    if (ChatObject.isMonoForum(this.f43315e)) {
                        if (this.f43280b4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.f43315e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.n11 n11Var2 = null;
                if (u9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.R5);
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
                    long j14 = this.R5;
                    if (this.P3 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f43280b4;
                    }
                    draft = mediaDataController.getDraft(j14, j3);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                jk jkVar = this.W;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                jkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.R5, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j15 = this.R5;
                    if (l4 != null) {
                        j12 = l4.longValue();
                    } else {
                        j12 = this.f43280b4;
                    }
                    message = mediaDataController2.getDraftMessage(j15, j12);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.W.getFieldText() != null && (this.P3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.Xb >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.W.setFieldText("");
                        this.W.setEffectId(0L);
                        f9(true);
                    }
                } else if (draftVoice != null) {
                    this.W.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.Xb = draftMessage3.date;
                    jk jkVar2 = this.W;
                    jkVar2.X2 = null;
                    jkVar2.Y2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i12 = 0;
                        while (i12 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i12);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            long j16 = j13;
                            if (z12 || (messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                draftMessage2 = draftMessage3;
                                if (z12) {
                                    j11 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j11 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                n11Var = null;
                                org.telegram.ui.Components.o61 o61Var = new org.telegram.ui.Components.o61(a4.a.p(j11, ""), 3, null);
                                int i13 = messageEntity.offset;
                                valueOf.setSpan(o61Var, i13, messageEntity.length + i13, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f28925a |= 4;
                                    org.telegram.ui.Components.o11 o11Var = new org.telegram.ui.Components.o11(obj, 0);
                                    int i14 = messageEntity.offset;
                                    MediaDataController.addStyleToText(o11Var, i14, messageEntity.length + i14, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f28925a |= 1;
                                        org.telegram.ui.Components.o11 o11Var2 = new org.telegram.ui.Components.o11(obj2, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var2, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f28925a |= 2;
                                        org.telegram.ui.Components.o11 o11Var3 = new org.telegram.ui.Components.o11(obj3, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var3, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f28925a |= 8;
                                        org.telegram.ui.Components.o11 o11Var4 = new org.telegram.ui.Components.o11(obj4, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var4, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f28925a |= 16;
                                        org.telegram.ui.Components.o11 o11Var5 = new org.telegram.ui.Components.o11(obj5, 0);
                                        int i18 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var5, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.n61 n61Var = new org.telegram.ui.Components.n61(messageEntity.url, n11Var2);
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(n61Var, i19, messageEntity.length + i19, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f28925a |= 256;
                                        org.telegram.ui.Components.o11 o11Var6 = new org.telegram.ui.Components.o11(obj6, 0);
                                        int i20 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var6, i20, messageEntity.length + i20, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i21 = messageEntity.offset;
                                        org.telegram.ui.Components.fj0.c(valueOf, i21, messageEntity.length + i21, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.W.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e7) {
                                            FileLog.e((Throwable) e7, false);
                                            fontMetricsInt = n11Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            z5Var = new org.telegram.ui.Components.z5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            z5Var = new org.telegram.ui.Components.z5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i22 = messageEntity.offset;
                                        valueOf.setSpan(z5Var, i22, messageEntity.length + i22, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        n11Var = n11Var2;
                                    }
                                    n11Var = n11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                n11Var = null;
                            }
                            i12++;
                            n11Var2 = n11Var;
                            j13 = j16;
                            draftMessage3 = draftMessage2;
                        }
                        j10 = j13;
                        onVar = n11Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        onVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.W.e1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.W.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new qe(this, 4), 700L);
                    }
                    this.W.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f43321e5 = of2;
                        Cb(of2);
                    }
                    messageObject = this.f43405l5;
                    if (messageObject != null || this.V3 == messageObject) {
                        if (message == null && ((messageObject2 = this.V3) == null || messageObject2.getId() != message.f20068id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f43405l5 = messageObject3;
                            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
                            if (inputReplyTo2 != null) {
                                int i23 = inputReplyTo2.flags;
                                if ((i23 & 4) != 0) {
                                    String str3 = inputReplyTo2.quote_text;
                                    if ((i23 & 16) != 0) {
                                        i10 = inputReplyTo2.quote_offset;
                                    } else {
                                        i10 = -1;
                                    }
                                    TLRPC.Message message3 = messageObject3.messageOwner;
                                    if (message3 == null || (str = message3.message) == null || str3 == null || (findQuoteStart = MessageObject.findQuoteStart(str, str3, i10)) < 0) {
                                        onVar2 = onVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        onVar2 = new on(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f43381j5 = onVar2;
                                }
                            }
                            V6(false);
                            on onVar3 = this.f43381j5;
                            if (onVar3 != null) {
                                Bb(this.f43405l5, onVar3);
                            } else {
                                Ab(this.f43405l5);
                            }
                            gc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j10 && this.f43315e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.f43315e.f20047id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f43405l5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Ab(messageObject4);
                            gc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j10 = 0;
                onVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f43321e5 = of22;
                    Cb(of22);
                }
                messageObject = this.f43405l5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l4 == null) {
                }
            }
        }
    }

    public final void A7(boolean z10) {
        this.P8 = z10;
        org.telegram.ui.ActionBar.n1 n1Var = this.O8;
        if (n1Var != null) {
            n1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.Yb;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Yb.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Yb = ofFloat;
            ofFloat.addUpdateListener(new oe(this, 0));
            this.Yb.setDuration(150L);
            this.Yb.start();
        }
    }

    public final float A8() {
        yn ynVar = this.f43286ba;
        if (ynVar == null) {
            ynVar = this;
        }
        hk hkVar = ynVar.f43427n1;
        if (hkVar == null) {
            return 0.0f;
        }
        return hkVar.f32674b;
    }

    public final boolean A9() {
        org.telegram.ui.Components.w31 w31Var = this.P1;
        if (w31Var != null && w31Var.Q && w31Var.f32498a.f15437f) {
            return true;
        }
        return false;
    }

    public final void Aa(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Aa(int):void");
    }

    public final void Ab(MessageObject messageObject) {
        yb(true, messageObject, null, false, true);
    }

    public final void Ac(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f43378j1 > 0 && ((i10 = this.P3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43353h1.e(3, z11, z10);
        this.f43353h1.c(3, this.f43378j1, z10);
    }

    public final int B6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f43526v0.getHeight();
        long j3 = 0;
        int i11 = 0;
        while (true) {
            View U0 = this.f43526v0.U0(i10);
            if (U0 == null) {
                break;
            }
            if (U0 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) U0;
                messageObject = u1Var.getMessageObject();
                additionalPaddingHeight = u1Var.getAdditionalPaddingHeight();
            } else if (U0 instanceof org.telegram.ui.Cells.w0) {
                messageObject = ((org.telegram.ui.Cells.w0) U0).getMessageObject();
                additionalPaddingHeight = 0;
            } else {
                continue;
            }
            if (messageObject != null) {
                long groupId = messageObject.getGroupId();
                boolean isOut = messageObject.isOut();
                if (j3 != 0 && j3 != groupId) {
                    break;
                }
                height = Math.min(height, U0.getTop());
                i11 = Math.max(i11, U0.getBottom() - additionalPaddingHeight);
                if (isOut) {
                    if (groupId == 0) {
                        break;
                    }
                    j3 = groupId;
                }
                i10++;
            } else {
                continue;
            }
        }
        return Math.max(0, i11 - height);
    }

    public final long B7(MessageObject messageObject) {
        if (this.P3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.f43315e) && !this.f43332f4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f20099id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.f43315e));
        }
        return this.f43280b4;
    }

    public final int B8(MessageObject messageObject, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.f43385j9 == null) {
            this.f43385j9 = new org.telegram.ui.Cells.u1(getParentActivity(), this.currentAccount, true, this.f43587za, this.f43300ca);
        }
        org.telegram.ui.Cells.u1 u1Var = this.f43385j9;
        if (this.f43315e == null && !UserObject.isUserSelf(this.f43327f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1Var.N7 = z11;
        org.telegram.ui.Cells.u1 u1Var2 = this.f43385j9;
        int i10 = this.P3;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        u1Var2.P7 = z12;
        if (i10 == 3 && this.Ma) {
            z13 = true;
        } else {
            z13 = false;
        }
        u1Var2.Q7 = z13;
        TLRPC.User user = this.f43327f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        u1Var2.R7 = z14;
        if (ChatObject.isChannel(this.f43315e) && this.f43315e.megagroup) {
            z15 = true;
        }
        u1Var2.S7 = z15;
        this.f43385j9.E8 = s9();
        this.f43385j9.F8 = B9();
        this.f43385j9.G8 = A9();
        return this.f43385j9.g1(messageObject, (MessageObject.GroupedMessages) this.f43532v6.f(messageObject.getGroupId()), z10);
    }

    public final boolean B9() {
        if (this.P1 == null) {
            if (this.R3 || !ChatObject.isMonoForum(this.f43315e)) {
                if (!ChatObject.isForum(this.f43315e) || !ChatObject.areTabsEnabled(this.f43315e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean Ba(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f43310d8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f43327f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f43310d8 == this.R5) {
                this.f43310d8 = 0L;
                this.W.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f43310d8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((n2Var instanceof yn) && ((yn) n2Var).R5 == this.f43310d8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f43310d8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f43310d8));
                } else if (DialogObject.isUserDialog(this.f43310d8)) {
                    bundle.putLong("user_id", this.f43310d8);
                } else {
                    bundle.putLong("chat_id", -this.f43310d8);
                }
                v6();
                presentFragment(new yn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Bb(MessageObject messageObject, on onVar) {
        xb(true, messageObject, null, null, null, true, 0, onVar, false, 0L, null, true);
    }

    public final void Bc(boolean z10) {
        String string;
        if (this.P3 != 3 && !UserObject.isBotForum(this.f43327f)) {
            nj njVar = this.Y0;
            if (njVar != null && this.f43280b4 != 0) {
                if (this.f43332f4) {
                    Rc();
                } else if (this.f43320e4) {
                    MessageObject messageObject = this.V3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.Y0.setTitle(LocaleController.formatPluralString("Comments", this.V3.getRepliesCount(), new Object[0]));
                    } else {
                        this.Y0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.V3;
                    if (messageObject2 != null) {
                        njVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.Z3 != null) {
                if (this.V3.getRepliesCount() == 0) {
                    if (this.f43320e4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.Z3;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.f43565y0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final float C6(boolean z10) {
        float f7;
        float f10;
        float f11;
        jk jkVar = this.W;
        float f12 = 0.0f;
        if (jkVar != null) {
            if (z10) {
                f7 = jkVar.f23923k5;
            } else {
                f7 = jkVar.f23917j5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        le.b bVar = this.f43512tc;
        j6.l lVar = this.f43576yc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f14024a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f14024a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f15437f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f14025b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.f15436e;
            f11 = f13;
        }
        if (!this.Ma && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f11) * f10, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f12);
        }
        return AndroidUtilities.lerp(dp, max, f11) * f10;
    }

    public final boolean C9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f43289c && !this.d && this.f43327f == null && this.f43526v0 != null && SharedConfig.animationsEnabled()) {
            if (this.f43338fb == null) {
                this.f43338fb = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f43338fb.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f43526v0.getChildCount(); i12++) {
                    i11 += this.f43526v0.getChildAt(i12).getHeight();
                    int top = this.f43526v0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f43469q9) {
                    L6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.A6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f43494s6;
                if ((!z12 || ((this.J6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.E6 && f10 > this.f43469q9 && (!arrayList.isEmpty() ? i11 != 0 : this.f43326eb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.O0) == null || frameLayout.getVisibility() != 0 || this.O0.getChildCount() <= 0) {
                    if (!z10 && this.L6 == 0) {
                        L6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.P9 && this.fragmentBeginToShow) {
                        if (z10 && this.L6 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable d = this.f43300ca.d();
                        qm qmVar = this.V0;
                        if (qmVar != null) {
                            d = qmVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.pc0) {
                            org.telegram.ui.Components.pc0 pc0Var = (org.telegram.ui.Components.pc0) d;
                            if (pc0Var.N != z11) {
                                if (!z11) {
                                    pc0Var.c();
                                }
                                pc0Var.q(z11);
                                if (z11) {
                                    f7 = 1.5f;
                                } else {
                                    f7 = 1.0f;
                                }
                                pc0Var.M = f7;
                                pc0Var.z();
                            } else if (z11) {
                                pc0Var.z();
                            }
                        }
                    }
                    if (z10 || (this.L6 != 0 && System.currentTimeMillis() - this.L6 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Ca(MessageObject messageObject, int i10) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f20068id = 0;
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
        messageObject2.stableId = U8(messageObject.dateKeyInt);
        this.f43565y0.P.add(i10, messageObject2);
    }

    public final void Cb(MessageSuggestionParams messageSuggestionParams) {
        xb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Cc(MessageObject messageObject, int i10) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.f43443o6;
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
            MessageObject messageObject3 = (MessageObject) this.f43418m6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                jm jmVar = this.f43565y0;
                if (jmVar != null) {
                    jmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    @Override
    public final void D(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        Wa(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final boolean D6() {
        if (!y9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f43332f4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                ok okVar = this.M0;
                if (okVar == null || okVar.getVisibility() != 0) {
                    if (!E9() || this.f43332f4) {
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

    public final void D7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.D7():void");
    }

    public final SendMessageChatArguments D8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.P3 == 9) {
            builder.setWelcomeMessageChatId(this.f43484ra);
        }
        if (this.P3 == 5) {
            builder.setQuickReplyShortcut(this.O3, I8());
        }
        return builder.build();
    }

    public final boolean D9() {
        if (getUserConfig().getClientUserId() == a() && !getMessagesController().getSavedMessagesController().unsupported && getUserConfig().isPremium()) {
            return true;
        }
        return false;
    }

    public final void Da() {
        int i10;
        this.F4.clear();
        this.H4.clear();
        this.J4 = 0;
        this.N4 = 0;
        this.O4 = 0;
        xc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.X7;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.P4 = true;
        yc();
    }

    public final void Db(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        yb(z10, null, webPage, z11, true);
    }

    public final void Dc(boolean z10) {
        jk jkVar = this.W;
        if (jkVar != null) {
            jkVar.N1(z10);
        }
    }

    @Override
    public final boolean E() {
        return this.f43348g8;
    }

    public final boolean E6() {
        if (this.h == null) {
            ok okVar = this.M0;
            if (okVar == null || okVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E7() {
        if (getParentActivity() != null && getParentActivity() != null && this.H1 == null) {
            ai.g4 g4Var = new ai.g4(this, getParentActivity(), this, this.f43300ca, 2);
            this.H1 = g4Var;
            g4Var.Z = a();
            ai.g4 g4Var2 = this.H1;
            g4Var2.f32919i0 = true;
            g4Var2.Z1 = new ll(this);
        }
    }

    public final boolean E9() {
        if (this.V3 != null) {
            return true;
        }
        return false;
    }

    public final void Ea(MessageObject messageObject) {
        if (messageObject == this.Jb) {
            this.Jb = null;
            Pc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.R5);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Eb(boolean z10) {
        if (this.V2 != null && !y9()) {
            if (this.V2.getTag() == null) {
                AnimatorSet animatorSet = this.f43319e3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.V2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f43319e3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f43319e3.playTogether(ObjectAnimator.ofFloat(this.V2, View.ALPHA, 1.0f));
                this.f43319e3.addListener(new vi(this, 5));
                this.f43319e3.start();
            }
            if (!z10) {
                q9();
                this.Y2 = 1000;
            }
        }
    }

    public final void Ec(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        jh.h hVar = this.f43353h1;
        boolean z12 = false;
        if (hVar != null) {
            int i14 = 2;
            if (this.Na) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f3415c = z10;
            aa.a aVar = hVar.f14164e[6];
            if (aVar != null) {
                ((ih.b) aVar.f386b).b(z10, true);
            }
            jh.h hVar2 = this.f43353h1;
            if (this.Na) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3415c = z11;
            aa.a aVar2 = hVar2.f14164e[5];
            if (aVar2 != null) {
                ((ih.b) aVar2.f386b).b(z11, true);
            }
        }
        this.f43516u3 = i12;
        this.f43529v3 = i11;
        Fc();
        org.telegram.ui.Components.p6 p6Var = this.T2;
        if (p6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            p6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.T2.animate();
            if (i12 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
        }
    }

    public final boolean F6(MessageObject messageObject) {
        if (this.P3 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.f43315e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f43315e.f20047id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.P3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.f43315e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void F7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        ug ugVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.U5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f43327f;
        TLRPC.Chat chat = this.f43315e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.X7;
        long j3 = this.J6;
        int d = (int) d();
        int i10 = this.P3;
        ug ugVar2 = new ug(this, 6);
        if (z10) {
            ugVar = new ug(this, 7);
        } else {
            ugVar = null;
        }
        ug ugVar3 = ugVar;
        org.telegram.ui.Components.e5.z(this, user, chat, encryptedChat, chatFull, j3, messageObject, this.U5, groupedMessages, d, i10, null, ugVar2, ugVar3, this.f43300ca);
    }

    public final int F8(MessageObject messageObject) {
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f20067id)) {
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

    public final void F9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        int i13;
        ArrayList arrayList = this.f43494s6;
        if (!arrayList.isEmpty()) {
            MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.A6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() == this.J6) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        D(id2, 0, i13, 0, false, true);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.R5)) {
                int N0 = this.f43552x0.N0();
                int L0 = this.f43552x0.L0();
                while (true) {
                    if (L0 <= N0) {
                        jm jmVar = this.f43565y0;
                        int i14 = jmVar.J;
                        if (L0 >= i14 && L0 < jmVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
                            if (message.date < i10) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (v()) {
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
                this.U8.f(i11);
                org.telegram.ui.ActionBar.b2 b2Var = this.f43423mb;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                wc(false);
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f43300ca);
                this.f43423mb = b2Var2;
                b2Var2.setOnCancelListener(this.f43399ka);
                this.f43423mb.q(1000L);
                int i15 = this.T5;
                this.W8 = i15;
                this.Y8 = false;
                this.f43334f6.add(Integer.valueOf(i15));
                this.X8 = 0;
                this.Z8 = false;
                MessagesController messagesController = getMessagesController();
                long j3 = this.R5;
                long j10 = this.J6;
                int i16 = this.classGuid;
                int i17 = this.P3;
                long j11 = this.f43280b4;
                int i18 = this.f43393k4;
                int i19 = this.T5;
                this.T5 = i19 + 1;
                messagesController.loadMessages(j3, j10, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j11, i18, i19, this.f43332f4);
                this.V2.setAlpha(0.0f);
                this.V2.setTag(null);
                this.f43343g3 = 0.0f;
                kc();
                this.W2.setTag(null);
            }
        }
    }

    public final void Fa(MessageObject messageObject) {
        ArrayList arrayList = this.f43494s6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jm jmVar = this.f43565y0;
            if (jmVar != null && !jmVar.N) {
                jmVar.u(jmVar.J + indexOf);
            }
        }
    }

    public final void Fb(boolean z10) {
        if (this.W2 != null && !y9()) {
            if (this.W2.getTag() == null) {
                ValueAnimator valueAnimator = this.f43331f3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.W2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43343g3, 1.0f);
                this.f43331f3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f43331f3.addUpdateListener(new oe(this, 2));
                this.f43331f3.addListener(new vi(this, 7));
                this.f43331f3.start();
            }
            if (!z10) {
                q9();
                this.Y2 = 1000;
            }
        }
    }

    public final void Fc() {
        org.telegram.ui.Components.p6 p6Var = this.S2;
        if (p6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f43516u3;
            if (i10 < 0) {
                p6Var.c("", z10, true);
            } else if (i10 == 0) {
                p6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f43452p3) {
                p6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.P3 != 7 && !this.f43537vc.f15437f) {
                p6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f43529v3 + 1), Integer.valueOf(this.f43516u3)), z10, true);
            } else {
                p6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    @Override
    public final long G() {
        return this.J6;
    }

    public final void G6(boolean z10) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f43315e != null && (this.P3 != 0 || this.f43280b4 != 0 || (chatFull = this.X7) == null || chatFull.ttl_period == 0)) || ((user = this.f43327f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.Y7) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.t0 t0Var = this.f43263a0;
            if (t0Var != null) {
                t0Var.e(8);
            }
            nj njVar = this.Y0;
            if (njVar != null) {
                njVar.f27271a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.t0 t0Var2 = this.f43263a0;
            if (t0Var2 != null) {
                t0Var2.e(0);
            }
            nj njVar2 = this.Y0;
            if (njVar2 != null) {
                njVar2.f27271a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var3 = this.f43461q0;
        if (t0Var3 != null) {
            TLRPC.Chat chat = this.f43315e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            t0Var3.e(i11);
        }
        nj njVar3 = this.Y0;
        if (njVar3 != null) {
            TLRPC.Chat chat2 = this.f43315e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f43327f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            njVar3.setCommunityItemVisible(z11);
            final nj njVar4 = this.Y0;
            TLRPC.Chat chat3 = this.f43315e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = njVar4.E;
            ImageView imageView2 = njVar4.f27301y;
            if (imageView2 != null && imageView != null) {
                njVar4.f27287l0 = z12;
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
                                    ho hoVar = njVar4;
                                    if (!z14) {
                                        hoVar.f27301y.setVisibility(4);
                                        return;
                                    } else {
                                        hoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    ho hoVar2 = njVar4;
                                    if (!z15) {
                                        hoVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        hoVar2.getClass();
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
                                    ho hoVar = njVar4;
                                    if (!z14) {
                                        hoVar.f27301y.setVisibility(4);
                                        return;
                                    } else {
                                        hoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    ho hoVar2 = njVar4;
                                    if (!z15) {
                                        hoVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        hoVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.Y0.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.Y7;
                if (userFull2 != null) {
                    this.Y0.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.X7;
                    if (chatFull3 != null) {
                        this.Y0.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f43449p0 != null && (chatFull2 = this.X7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.f43315e)) {
                TLRPC.Chat chat4 = this.f43315e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = this.f43449p0;
            if (z13) {
                i12 = 0;
            }
            t0Var4.e(i12);
        }
        o();
    }

    public final void G7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.G7(boolean):void");
    }

    public final int G8() {
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        int i10 = 0;
        if (c5Var == null || c5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(i10);
                if (n2Var != this && (n2Var instanceof yn) && ((yn) n2Var).R5 == this.R5) {
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

    public final void G9() {
        this.B4 = true;
        if (this.f43395k6) {
            getMessagesStorage().getUnreadMention(this.R5, d(), new ah(this, 2));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.R5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f43332f4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f43280b4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f43382j6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ai.v1(28, this, messagesStorage));
    }

    public final void Ga(MessageObject messageObject) {
        ArrayList arrayList = this.f43494s6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jm jmVar = this.f43565y0;
            if (jmVar != null && !jmVar.N) {
                jmVar.P(jmVar.J + indexOf, true);
            }
        }
    }

    public final boolean Gb() {
        jk jkVar = this.W;
        if (jkVar != null && jkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f43292c2 == null) {
                    if (!this.Z4) {
                        jk jkVar2 = this.W;
                        if (jkVar2 != null) {
                            jkVar2.S();
                            MediaDataController.getInstance(jkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.fg fgVar = jkVar2.U0;
                            fgVar.J(false, false);
                            fgVar.O(false, false);
                            fgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        qm qmVar = this.V0;
                        int indexOfChild = qmVar.indexOfChild(this.Q);
                        if (indexOfChild != -1) {
                            jk jkVar3 = this.W;
                            jkVar3.S();
                            MediaDataController.getInstance(jkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.fg fgVar2 = jkVar3.U0;
                            fgVar2.J(false, false);
                            fgVar2.O(false, false);
                            fgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f43515u2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            qmVar.addView(this.f43515u2, i10, w7.z5.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(9, getParentActivity(), this.f43300ca, false);
                            this.f43292c2 = m40Var;
                            m40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            qmVar.addView(this.f43292c2, i10, w7.z5.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.m40 m40Var2 = this.f43292c2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f43515u2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new vi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.W.getEmojiButton();
                            if (emojiButton != null) {
                                this.f43292c2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Gc() {
        M7();
        String str = this.f43491s3;
        if (str != null) {
            this.f43278b2.f31551e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.J3.setEmptyView(this.f43278b2);
            return;
        }
        this.J3.setEmptyView(null);
        this.f43278b2.setVisibility(8);
    }

    @Override
    public final boolean H(uy uyVar) {
        return false;
    }

    public final void H6() {
        if (this.Ma) {
            return;
        }
        if (z9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int H8() {
        return Math.max(this.N4, this.O4);
    }

    public final void H9(boolean z10) {
        TLRPC.Chat chat;
        if (this.f43337fa == null && (chat = this.f43315e) != null && ChatObject.canSendAsPeers(chat) && this.W != null && !ChatObject.isMonoForum(this.f43315e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.R5);
            this.f43337fa = sendAsPeers;
            if (sendAsPeers != null) {
                this.W.Q1(false, z10);
            }
        }
    }

    public final void Ha() {
        if (this.N7 == null && this.O7 == null && this.P7 == null) {
            qe qeVar = this.S7;
            if (qeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(qeVar);
                this.S7 = null;
            }
            this.J7 = Integer.MAX_VALUE;
            this.L7 = false;
            this.M7 = 0L;
            this.N7 = null;
            this.O7 = null;
            this.P7 = null;
        }
    }

    public final void Hb() {
        TLRPC.ChatFull chatFull = this.X7;
        if (chatFull != null && !this.f43442o5) {
            TLRPC.Chat chat = this.f43315e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new qe(this, 15), 1000L);
            }
        }
    }

    public final void Hc() {
        boolean z10;
        if (this.f43353h1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f43464q3 && !this.f43452p3) || (this.P3 == 7 && this.M3 == 2 && !this.f43494s6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43353h1.e(6, z10, true);
        this.f43353h1.e(5, z10, true);
        if (z10) {
            this.f43353h1.e(1, false, true);
        }
        if (!z10) {
            this.f43584z7 = 0;
        }
        this.V0.invalidate();
    }

    public final void I6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.I6():void");
    }

    public final boolean I7(android.view.View r94, boolean r95, boolean r96, float r97, float r98, boolean r99, boolean r100, boolean r101) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.I7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final int I8() {
        if (this.P3 == 5) {
            return (int) this.f43280b4;
        }
        return 0;
    }

    public final void I9(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Ia(boolean z10) {
        MessageObject messageObject = this.H7;
        if (messageObject != null) {
            if (z10) {
                boolean[] zArr = this.C6;
                zArr[1] = true;
                zArr[0] = true;
                this.F7 = 0;
                this.I6 = 0;
            }
            this.B7 = 0;
            this.C7 = false;
            Fa(messageObject);
            this.H7 = null;
        }
    }

    public final void Ib(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.rc G = org.telegram.ui.Components.yc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f30427j = max;
        G.v = new hf(this, i10, 3);
        G.k(true);
        this.E3 = messageObject;
        this.F3 = i10;
    }

    public final void Ic(String str) {
        if (this.P3 == 7 && !TextUtils.equals(this.f43491s3, str)) {
            M7();
            Kb(true);
            this.f43491s3 = str;
            this.f43477r3 = str;
            R6(false);
            x7(true);
            this.L6 = 0L;
            this.f43371i7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.M3);
            this.K3.l();
            this.J3.requestLayout();
            if (this.J3.getLayoutManager() != null) {
                this.J3.getLayoutManager().n0(0);
            }
            Gc();
            this.f43278b2.e(true, true);
            r8();
        }
    }

    public final void J6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.f43512tc.f15436e) * (1.0f - this.f43486rc.f15436e) * ((float[]) this.f43576yc.f14025b)[i10];
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

    public final long J8() {
        if (this.P3 == 3) {
            return this.f43280b4;
        }
        return 0L;
    }

    public final xi J9(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle) {
        nf.e eVar = this.f43563xb;
        if (eVar != null) {
            eVar.a(true);
            this.f43563xb = null;
        }
        if (characterStyle != null && u1Var != null && u1Var.getMessageObject() != null) {
            xi xiVar = new xi(this, u1Var.getMessageObject().getId(), characterStyle, u1Var, 0);
            this.f43563xb = xiVar;
            return xiVar;
        }
        this.f43563xb = null;
        return null;
    }

    public final void Ja(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        a0.i iVar;
        ArrayList arrayList2;
        jm jmVar;
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
        a0.i iVar2 = null;
        while (true) {
            int size = arrayList5.size();
            iVar = this.f43532v6;
            arrayList2 = this.f43494s6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.H4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.H4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f43418m6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f43327f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f43327f.f20194id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Sa();
                this.Nb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Mb.bind(messageObject2.messageOwner.f20068id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f20068id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.H4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.H4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.J4) {
                    xc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f43432n6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.P3 == 1))) {
                if (z10) {
                    arrayList5.remove(i16);
                    i16--;
                }
                u6(messageObject, messageObject2);
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
                    HashMap hashMap2 = this.f43454p6;
                    ArrayList arrayList6 = (ArrayList) hashMap2.get(str);
                    if (arrayList6 != null) {
                        i12 = arrayList6.indexOf(messageObject2);
                    } else {
                        i12 = -1;
                    }
                    if (messageObject2.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId())) != null && (indexOf = groupedMessages.messages.indexOf(messageObject2)) >= 0) {
                        i11 = i16;
                        if (messageObject2.getGroupId() != messageObject.getGroupId()) {
                            iVar.k(groupedMessages, messageObject.getGroupId());
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
                            if (iVar2 == null) {
                                iVar2 = new a0.i();
                            }
                            iVar2.k(groupedMessages, groupedMessages.groupId);
                        } else {
                            if (iVar2 == null) {
                                iVar2 = new a0.i();
                            }
                            iVar2.k(groupedMessages, groupedMessages.groupId);
                            if (indexOf > 0 && indexOf < groupedMessages.messages.size() - 1) {
                                MessageObject.GroupedMessages groupedMessages2 = new MessageObject.GroupedMessages();
                                groupedMessages2.reversed = this.Na;
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
                                iVar2.k(groupedMessages2, groupedMessages2.groupId);
                                iVar.k(groupedMessages2, groupedMessages2.groupId);
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
                    if (this.P3 == 3) {
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
                        jm jmVar2 = this.f43565y0;
                        if (jmVar2 != null && !jmVar2.N) {
                            jmVar2.Q(jmVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        jm jmVar3 = this.f43565y0;
                        if (jmVar3 != null && !jmVar3.N) {
                            jmVar3.u(jmVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.i iVar3 = this.f43480r6;
                        if (((MessageObject) iVar3.f(id4)) != null) {
                            iVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            jm jmVar4 = this.f43565y0;
                            int i22 = jmVar4.E;
                            int i23 = jmVar4.F;
                            int i24 = jmVar4.H;
                            int i25 = jmVar4.G;
                            if (!jmVar4.N) {
                                jmVar4.u(jmVar4.J + indexOf2);
                                if (arrayList2.isEmpty()) {
                                    if (i22 >= 0) {
                                        i15 = 0;
                                        this.f43565y0.u(0);
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i23 >= 0) {
                                        this.f43565y0.u(i15);
                                    }
                                    if (i24 >= 0) {
                                        this.f43565y0.u(i15);
                                    }
                                    if (i25 >= 0) {
                                        this.f43565y0.u(i15);
                                    }
                                }
                            }
                        }
                        if (i21 >= 0) {
                            arrayList9.remove(i21);
                            if (arrayList9.isEmpty()) {
                                hashMap.remove(messageObject2.dateKey);
                                this.q6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                jm jmVar5 = this.f43565y0;
                                int i26 = jmVar5.E;
                                int i27 = jmVar5.F;
                                int i28 = jmVar5.H;
                                int i29 = jmVar5.G;
                                if (!jmVar5.N) {
                                    jmVar5.u(jmVar5.J + indexOf2);
                                    if (arrayList2.isEmpty()) {
                                        if (i26 >= 0) {
                                            i14 = 0;
                                            this.f43565y0.u(0);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i27 >= 0) {
                                            this.f43565y0.u(i14);
                                        }
                                        if (i28 >= 0) {
                                            this.f43565y0.u(i14);
                                        }
                                        if (i29 >= 0) {
                                            this.f43565y0.u(i14);
                                        }
                                        Cc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Cc(messageObject, messageObject2.getId());
                i16 = i11;
            }
            i16++;
            arrayList5 = arrayList;
        }
        if (iVar2 != null) {
            for (int i30 = 0; i30 < iVar2.m(); i30++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) iVar2.n(i30);
                if (groupedMessages3.messages.isEmpty()) {
                    iVar.l(groupedMessages3.groupId);
                } else {
                    groupedMessages3.calculate();
                    int indexOf3 = arrayList2.indexOf((MessageObject) hg.c.g(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (jmVar = this.f43565y0) != null) {
                        jmVar.q(indexOf3 + jmVar.J, groupedMessages3.messages.size());
                        uj ujVar = this.f43539w0;
                        if (ujVar != null) {
                            ujVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        yc();
    }

    public final void Jb(boolean z10) {
        boolean z11;
        jh.h hVar = this.f43353h1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.f43315e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.f43584z7 = 0;
            }
        }
    }

    public final void Jc() {
        jk jkVar;
        if (this.P != null) {
            this.C0.setBackground(null);
            this.C0.setOnClickListener(null);
            boolean z10 = true;
            if (this.P3 == 3 && J8() == 2666000) {
                this.C0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.P.setVisibility(0);
                this.G1.setVisibility(8);
                this.G1.setTag(null);
                rc();
                org.telegram.ui.Components.jz0 jz0Var = this.f43277b1;
                if (jz0Var != null) {
                    jz0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f43315e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.f43315e)) {
                    TLRPC.Chat chat2 = this.f43315e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.f43315e.megagroup)) {
                        TLRPC.Chat chat3 = this.f43315e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.i6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.sq sqVar = new org.telegram.ui.Components.sq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                sqVar.f30926e = dp;
                                sqVar.f30927f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                sqVar.h = dp3;
                                sqVar.f30928n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(sqVar, 1), 0, 1, 33);
                                this.C0.setBackground(org.telegram.ui.ActionBar.i6.g0(0, org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20918i6, false)));
                                this.C0.setText(spannableStringBuilder);
                                this.C0.setOnClickListener(new ye(this, 0));
                            } else {
                                this.C0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.C0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.C0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.f43315e.banned_rights.until_date)));
                        }
                        this.P.setVisibility(0);
                        this.G1.setVisibility(8);
                        this.G1.setTag(null);
                        rc();
                        org.telegram.ui.Components.jz0 jz0Var2 = this.f43277b1;
                        if (jz0Var2 != null) {
                            jz0Var2.f();
                        }
                    }
                }
                G7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.W0 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.C0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.P.setVisibility(0);
                        this.W.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.C0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a4.a.t(new StringBuilder("<b>"), this.f43327f.first_name, "</b>"))));
                        this.P.setVisibility(0);
                        this.W.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.C0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.P.setVisibility(0);
                        this.W.setVisibility(4);
                        this.W.setFieldText("");
                        getMediaDataController().cleanDraft(this.R5, this.f43280b4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.P.setVisibility(4);
                            if (!this.inPreviewMode && !this.Ma && this.P3 != 3) {
                                this.W.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    W6();
                    G6(false);
                } else {
                    this.P.setVisibility(4);
                    if (this.f43277b1 != null && (jkVar = this.W) != null && jkVar.k0()) {
                        this.f43277b1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.P.setVisibility(4);
            }
            if (z10) {
                this.W.m0(false);
                if (getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    public final boolean K6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.X7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            rg.k0.C1(this, this.B1, this.C1, this.R5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void K7() {
        if (this.h == null && this.f43528v2 == null && getParentActivity() != null) {
            gl glVar = new gl(this, getParentActivity());
            this.f43528v2 = glVar;
            glVar.setTag(1);
            this.K0.addView(this.f43528v2, w7.z5.n(-1, 48));
            this.K0.h(1, this.f43528v2);
            this.K0.g(this.f43528v2);
            this.f43528v2.setOnClickListener(new ye(this, 17));
            this.f43528v2.setEnabled(!isInPreviewMode());
            this.f43528v2.setBackground(org.telegram.ui.ActionBar.i6.K0(false));
            org.telegram.ui.Components.ig0 ig0Var = new org.telegram.ui.Components.ig0(getParentActivity(), this.f43300ca);
            this.f43554x2 = ig0Var;
            this.f43528v2.addView(ig0Var, w7.z5.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.f43528v2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.D2 = numberTextView;
            numberTextView.h = true;
            int i10 = 14;
            numberTextView.setTextSize(14);
            this.D2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.fe));
            this.D2.setTypeface(AndroidUtilities.bold());
            this.f43528v2.addView(this.D2, w7.z5.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            int i11 = 0;
            while (i11 < 2) {
                xn xnVar = new xn(this, getParentActivity());
                xn[] xnVarArr = this.A2;
                xnVarArr[i11] = xnVar;
                xnVar.setTextSize(i10);
                xnVarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.fe));
                xnVarArr[i11].setTypeface(AndroidUtilities.bold());
                this.f43528v2.addView(xnVarArr[i11], w7.z5.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                hl hlVar = new hl(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.i5[] i5VarArr = this.B2;
                i5VarArr[i11] = hlVar;
                hlVar.setTextSize(i10);
                i5VarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20889ge));
                this.f43528v2.addView(i5VarArr[i11], w7.z5.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                ai.p4 p4Var = new ai.p4(getParentActivity(), 13);
                p4Var.setSingleLine(true);
                p4Var.setLines(1);
                p4Var.setMaxLines(1);
                p4Var.setEllipsize(TextUtils.TruncateAt.END);
                p4Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Sh));
                p4Var.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.i6.Oh)));
                p4Var.setTextSize(1, 14.0f);
                p4Var.setTypeface(AndroidUtilities.bold());
                p4Var.setGravity(17);
                p4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                ai.p4[] p4VarArr = this.C2;
                p4VarArr[i11] = p4Var;
                this.f43528v2.addView(p4Var, w7.z5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                il ilVar = new il(getParentActivity());
                ilVar.I = new vh.g();
                ilVar.H = new Path();
                ilVar.J = new float[8];
                org.telegram.ui.Components.w9[] w9VarArr = this.f43579z2;
                w9VarArr[i11] = ilVar;
                ilVar.setBlurAllowed(true);
                w9VarArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f43528v2.addView(w9VarArr[i11], w7.z5.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i11 == 1) {
                    xnVarArr[i11].setVisibility(4);
                    p4VarArr[i11].setVisibility(4);
                    i5VarArr[i11].setVisibility(4);
                    w9VarArr[i11].setVisibility(4);
                }
                i11++;
                i10 = 14;
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.J2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.J2;
            int i12 = org.telegram.ui.ActionBar.i6.f20835de;
            int themedColor = getThemedColor(i12);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            ImageView imageView3 = this.J2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.J2.setContentDescription(LocaleController.getString(R.string.AccPinnedMessagesList));
            this.J2.setVisibility(4);
            this.J2.setAlpha(0.0f);
            this.J2.setScaleX(0.4f);
            this.J2.setScaleY(0.4f);
            ImageView imageView4 = this.J2;
            int i13 = org.telegram.ui.ActionBar.i6.f21198x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i13) & 436207615, 1, -1));
            this.f43528v2.addView(this.J2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.J2.setOnClickListener(new ye(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.H2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.H2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
            this.H2.setScaleType(scaleType);
            this.H2.setVisibility(8);
            this.H2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f43300ca);
            this.I2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.I2.setSize(AndroidUtilities.dp(16.0f));
            this.I2.setStrokeWidth(2.0f);
            this.I2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20853ee));
            this.f43528v2.addView(this.I2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.H2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i13) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f43528v2.addView(this.H2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.H2.setOnClickListener(new ye(this, 19));
            wc(false);
        }
    }

    public final int K8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f43526v0.getMeasuredHeight() - this.f43574ya) - this.f43469q9) - this.v.d()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void K9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.R5, messageObject);
        }
    }

    public final void Ka() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f43495s7 = 0;
        this.f43371i7 = false;
        this.f43383j7 = true;
        this.f43334f6.clear();
    }

    public final void Kb(boolean z10) {
        int i10;
        if (this.I3 != null) {
            le.b bVar = this.f43537vc;
            if (bVar.f15437f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.P3 == 7) {
                    s4.c0 c0Var = (s4.c0) this.J3.getLayoutManager();
                    Object E = this.K3.E((c0Var.N0() + c0Var.L0()) / 2);
                    Object E2 = this.K3.E(c0Var.L0());
                    Object E3 = this.K3.E(c0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.f43565y0.L();
                        int L0 = this.f43552x0.L0();
                        int N0 = this.f43552x0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f20068id;
                        int i12 = ((MessageObject) E2).messageOwner.f20068id;
                        int i13 = ((MessageObject) E3).messageOwner.f20068id;
                        boolean z11 = false;
                        boolean z12 = false;
                        int i14 = -1;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f20068id == i12) {
                                int i16 = this.f43565y0.J + i15;
                                if (L0 <= i16 && N0 >= i16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f20068id == i13) {
                                int i17 = this.f43565y0.J + i15;
                                if (L0 <= i17 && N0 >= i17) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f20068id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            int B8 = B8((MessageObject) L.get(i14), true);
                            this.f43552x0.h1(this.f43565y0.J + i14, (this.f43526v0.getHeight() - B8) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.p6 p6Var = this.T2;
                if (p6Var != null) {
                    if (bVar.f15437f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    p6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                ci.e4 e4Var = this.f43527v1;
                if (e4Var != null && e4Var.V) {
                    e4Var.e(true);
                }
                ul ulVar = this.f43578z1;
                if (ulVar != null && ulVar.V) {
                    ulVar.e(true);
                }
                jk jkVar = this.W;
                if (jkVar != null) {
                    jkVar.l0();
                }
                Fc();
            }
        }
    }

    public final void Kc() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        long a2 = a();
        long clientUserId = getUserConfig().getClientUserId();
        SparseArray[] sparseArrayArr = this.U5;
        if (a2 == clientUserId) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i12].valueAt(i13);
                    if (messageObject.hasValidGroupId()) {
                        MessageObject.GroupedMessages Y8 = Y8(messageObject);
                        if (Y8 != null) {
                            groupedMessagePosition = Y8.getPosition(messageObject);
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
            al alVar = this.Ya;
            if (alVar != null) {
                alVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Ya.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                al alVar2 = this.Ya;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                alVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new qe(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.sk0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.v0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.nj0 nj0Var = k10.f21606x;
                if (nj0Var != null && k10.f21607y != i10) {
                    k10.f21607y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(nj0Var, i10);
                }
            }
        }
        if (this.W9 != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i15));
            }
            this.W9.setSelectedMessages(arrayList2);
        }
    }

    public final void L6(boolean z10) {
        if (this.L6 == 0) {
            if (z10 && !this.M6.isEmpty()) {
                this.L6 = System.currentTimeMillis();
            } else {
                this.L6 = 1L;
            }
            C9();
            sj sjVar = this.f43526v0;
            if (sjVar != null) {
                sjVar.invalidate();
            }
        }
    }

    public final void L7() {
        int i10;
        int i11;
        if (this.P2 == null && getParentActivity() != null) {
            nk nkVar = new nk(this, getParentActivity(), 1);
            this.P2 = nkVar;
            nkVar.setClickable(false);
            this.P2.setWillNotDraw(false);
            this.f43576yc.j(4, false, false);
            this.P2.setClipToPadding(false);
            org.telegram.ui.Components.p6 p6Var = new org.telegram.ui.Components.p6(getParentActivity(), true, true, true);
            this.S2 = p6Var;
            org.telegram.ui.Components.tr trVar = org.telegram.ui.Components.tr.h;
            p6Var.b(0.25f, 280L, trVar);
            this.S2.setTextSize(AndroidUtilities.dp(15.0f));
            this.S2.setTypeface(AndroidUtilities.bold());
            this.S2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21222ye));
            this.S2.setGravity(3);
            this.P2.addView(this.S2, w7.z5.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.S.addView(this.P2, w7.z5.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.p6 p6Var2 = new org.telegram.ui.Components.p6(getParentActivity(), true, false, true);
            this.T2 = p6Var2;
            p6Var2.b(0.0f, 420L, trVar);
            this.T2.setScaleProperty(0.7f);
            this.T2.setTextSize(AndroidUtilities.dp(15.0f));
            this.T2.setGravity(5);
            this.T2.setTypeface(AndroidUtilities.bold());
            this.T2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21030o6));
            org.telegram.ui.Components.p6 p6Var3 = this.T2;
            if (this.f43537vc.f15437f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            p6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.p6 p6Var4 = this.T2;
            p6Var4.f29606n = false;
            p6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.T2.setOnClickListener(new ye(this, 2));
            this.T2.setAlpha(0.5f);
            this.T2.setClickable(false);
            this.P2.addView(this.T2, w7.z5.e(-2, -1, 117));
            org.telegram.ui.Components.p6 p6Var5 = new org.telegram.ui.Components.p6(getParentActivity(), true, true, true);
            this.U2 = p6Var5;
            p6Var5.setGravity(17);
            this.U2.setTypeface(AndroidUtilities.bold());
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.Ae));
            this.U2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.p6 p6Var6 = this.U2;
            int i12 = org.telegram.ui.ActionBar.i6.f20827d6;
            p6Var6.setBackground(org.telegram.ui.ActionBar.i6.g0(getThemedColor(i12), org.telegram.ui.ActionBar.i6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.i6.f20918i6))));
            org.telegram.ui.Components.p6 p6Var7 = this.U2;
            if (this.f43565y0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            p6Var7.setText(LocaleController.getString(i11));
            this.U2.setOnClickListener(new ye(this, 3));
            this.U2.setVisibility(8);
            this.U2.setAlpha(0.0f);
            this.P2.addView(this.U2, w7.z5.e(-1, -1, 119));
            TLRPC.Chat chat = this.f43315e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.f43315e.megagroup) && this.P3 != 7 && !ChatObject.isMonoForum(this.f43315e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.R2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.R2.setImageResource(R.drawable.msg_usersearch);
                this.R2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21204xe), PorterDuff.Mode.MULTIPLY));
                this.R2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f21235z8), 1, -1));
                this.P2.addView(this.R2, w7.z5.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.R2.setOnClickListener(new ye(this, 4));
                this.R2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.P3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.Q2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.Q2.setImageResource(R.drawable.msg_calendar);
                this.Q2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f21204xe), PorterDuff.Mode.MULTIPLY));
                this.Q2.setBackgroundDrawable(org.telegram.ui.ActionBar.i6.f0(getThemedColor(org.telegram.ui.ActionBar.i6.f21235z8), 1, -1));
                this.P2.addView(this.Q2, w7.z5.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.Q2.setOnClickListener(new ye(this, 5));
                this.Q2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int L8(MessageObject messageObject) {
        return K8(B8(messageObject, !TextUtils.isEmpty(this.N7))) - Ta(messageObject);
    }

    public final boolean L9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.d6 d6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.d6 animation;
        boolean z10;
        org.telegram.ui.Cells.u1 messageCell;
        boolean z11;
        if (this.f43526v0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.m40 m40Var = this.f43476r2;
            ArrayList<MessageObject> arrayList = null;
            if (m40Var != null && m40Var.getTag() != null && (messageCell = this.f43476r2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                d6Var = photoImage2.getAnimation();
                if (d6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f43526v0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f43534v8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                d6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f43526v0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f43526v0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = u1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f43526v0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f43526v0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f43534v8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f43526v0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    d6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                d6Var = animation;
                            }
                        }
                    }
                    i10++;
                }
            }
            if (messageObject != null && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                i9(true);
                if (messageObject.isRoundVideo()) {
                    boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                    MediaController mediaController = MediaController.getInstance();
                    if (playMessage) {
                        arrayList = R7(messageObject, false);
                    }
                    mediaController.setVoiceMessagesPlaylist(arrayList, false);
                    return playMessage;
                }
                SharedConfig.setNoSoundHintShowed(true);
                messageObject.audioProgress = d6Var.n();
                messageObject.audioProgressMs = d6Var.o();
                d6Var.stop();
                if (PhotoViewer.L1(messageObject)) {
                    PhotoViewer.f33874b9.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void La() {
        this.f43536vb = null;
        this.f43511tb = 0;
        this.f43524ub = -1;
        this.f43550wb = null;
        this.f43563xb = null;
        this.f43353h1.d(false);
    }

    public final void Lb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43300ca);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
            b2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            b2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ze(this, tL_game, messageObject, str, j3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(b2Var);
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
                    presentFragment(new fj1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        fj1.T(str, messageObject, parentActivity, str6, str3);
    }

    public final void Lc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        if (this.fragmentView != null && !this.f43442o5) {
            int childCount = this.f43526v0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f43526v0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject = u1Var.getMessageObject();
                        if (this.f43482r8 != null && ((messageObject.isRoundVideo() || messageObject.isVideo()) && !messageObject.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject))) {
                            ImageReceiver photoImage = u1Var.getPhotoImage();
                            this.f43482r8.setTranslationX(u1Var.getX() + photoImage.getImageX());
                            this.f43482r8.setTranslationY((this.f43526v0.getY() + (photoImage.getImageY() + (u1Var.getY() + u1Var.getPaddingTop()))) - this.f43482r8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f43482r8.getLayoutParams();
                            if (messageObject.isRoundVideo()) {
                                this.f43482r8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(B9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(B9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(B9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f43509t8.setResizeMode(0);
                                    this.f43482r8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(B9())) / AndroidUtilities.roundPlayingMessageSize(B9());
                                float imageWidth = u1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(B9());
                                if (this.f43482r8.getScaleX() != imageWidth) {
                                    this.f43482r8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f43482r8.setPivotX(0.0f);
                                this.f43482r8.setPivotY(0.0f);
                                this.f43482r8.setScaleX(imageWidth);
                                this.f43482r8.setScaleY(imageWidth);
                                this.f43521u8.setScaleX(roundPlayingMessageSize2);
                                this.f43521u8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f43482r8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f43509t8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f43482r8.setLayoutParams(layoutParams);
                                }
                                this.f43521u8.setScaleX(1.0f);
                                this.f43521u8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f43482r8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f43482r8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f43392k3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f43482r8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(B9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f43392k3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                D(playingMessageObject.getId(), 0, 0, 0, false, true);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f43534v8) {
                        this.f43526v0.invalidate();
                    }
                }
            }
        }
    }

    public final void M6(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        MessageObject messageObject2 = this.f43431n5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f43307d5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.E5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.E5 = null;
                jk jkVar = this.W;
                if (jkVar != null) {
                    jkVar.X2 = null;
                    jkVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f43307d5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = jkVar.getFieldText();
                    MessageObject messageObject3 = this.f43405l5;
                    if (messageObject3 == this.V3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f43381j5, this.f43431n5);
                }
                i8();
                j8();
            }
        }
    }

    public final void M7() {
        if (this.f43278b2 == null && this.f43475r1 == null) {
            org.telegram.ui.Components.w00 w00Var = new org.telegram.ui.Components.w00(getParentActivity(), this.f43300ca);
            this.a2 = w00Var;
            w00Var.setViewType(7);
            org.telegram.ui.Components.ux0 ux0Var = new org.telegram.ui.Components.ux0(getParentActivity(), this.a2, 1, null);
            this.f43278b2 = ux0Var;
            ux0Var.setClickable(true);
            this.f43278b2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f43278b2.setVisibility(8);
            this.f43278b2.addView(this.a2, 0);
            this.f43278b2.e(true, false);
            this.I3.addView(this.f43278b2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.h40 h40Var = new org.telegram.ui.Components.h40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f43475r1 = h40Var;
            h40Var.setOnHashtagClickListener(new xe(this, 2));
            this.f43475r1.setOnScrollListener(new i3(this, 6));
            this.f43475r1.setVisibility(8);
            this.I3.addView(this.f43475r1, -1, -1);
            r7();
            p7();
        }
    }

    public final int M8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f43526v0.getMeasuredHeight() - view.getBottom()) - this.f43526v0.getPaddingBottom()) + "} chatHeight=" + this.f43526v0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f43526v0.getPaddingBottom());
        return (this.f43526v0.getMeasuredHeight() - view.getBottom()) - this.f43526v0.getPaddingBottom();
    }

    public final void M9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var == null) {
            return;
        }
        long j3 = messageObject.messageOwner.action.channel_id;
        if (c5Var.getFragmentStack().size() > 0) {
            n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            n2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.c5 c5Var2 = this.parentLayout;
        if (indexOf > 0 && !(n2Var instanceof yn) && !(n2Var instanceof ProfileActivity) && this.f43315e.creator) {
            int size = c5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) c5Var2.getFragmentStack().get(indexOf);
                if (n2Var2 instanceof yn) {
                    ((ActionBarLayout) c5Var2).c(indexOf, new yn(sa.e.f(j3, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) c5Var2).c(indexOf, new ProfileActivity(sa.e.f(j3, "chat_id"), null));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof to) {
                    ((ActionBarLayout) c5Var2).c(indexOf, new to(sa.e.f(j3, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof rr) {
                    if (((rr) n2Var2).f40177e1 == 0) {
                        Bundle arguments = n2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) c5Var2).c(indexOf, new rr(arguments));
                    }
                    n2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.m5(this, n2Var, messageObject, c5Var2, 5));
        }
        AndroidUtilities.runOnUIThread(new gg(this, j3, 0), 1000L);
    }

    public final void Ma(org.telegram.ui.Cells.u1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Ma(org.telegram.ui.Cells.u1):void");
    }

    public final void Mb(boolean z10) {
        if (z10) {
            if (this.f43588zb == null) {
                qe qeVar = new qe(this, 11);
                this.f43588zb = qeVar;
                AndroidUtilities.runOnUIThread(qeVar, 100L);
                return;
            }
            return;
        }
        qe qeVar2 = this.f43588zb;
        if (qeVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(qeVar2);
        }
        this.f43588zb = null;
        this.f43575yb = false;
        wc(true);
    }

    public final void Mc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        nj njVar = this.Y0;
        if (njVar == null) {
            return;
        }
        int i10 = this.P3;
        if (i10 == 8 && (chat2 = this.f43315e) != null) {
            if (this.R3) {
                String i11 = ng.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.f43315e;
                njVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f43280b4 > 0L ? 1 : (this.f43280b4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.f43315e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.f43315e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.f43315e;
                        }
                        this.Y0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        nj njVar2 = this.Y0;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.f43315e;
                        njVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f43280b4));
                    this.Y0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f43280b4));
                    if (chat7 == null) {
                        chat7 = this.f43315e;
                    }
                    this.Y0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                nj njVar3 = this.Y0;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.f43315e.title));
                TLRPC.Chat chat8 = this.f43315e;
                njVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            njVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.O3)) {
                this.Y0.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.O3)) {
                this.Y0.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.Y0.setTitle(this.O3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.N3.title)) {
                this.Y0.setTitle(this.N3.title);
            } else {
                this.Y0.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j3 = this.f43280b4;
                if (j3 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j3));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j3));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.Y0.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.Y0.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.Y0.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.Y0.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.Y0.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.Y0.setTitle("");
                }
            } else if (E9() && !UserObject.isBotForum(this.f43327f)) {
                if (this.f43332f4) {
                    Rc();
                } else if (this.f43320e4) {
                    if (this.V3.hasReplies()) {
                        this.Y0.setTitle(LocaleController.formatPluralString("Comments", this.V3.getRepliesCount(), new Object[0]));
                    } else {
                        this.Y0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.Y0.setTitle(LocaleController.formatPluralString("Replies", this.V3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f43327f)) {
                this.Y0.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f43327f)) {
                this.Y0.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.P3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f43327f)) {
                        this.Y0.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.Y0.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.Y0.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", H8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.f43315e;
                    if (chat9 != null) {
                        nj njVar4 = this.Y0;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.f43315e;
                        njVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f43327f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.Y0.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f43327f.f20194id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f43327f.phone)) {
                                    nj njVar5 = this.Y0;
                                    String g10 = org.telegram.messenger.bi.g(new StringBuilder("+"), this.f43327f.phone, gf.b.c());
                                    TLRPC.User user4 = this.f43327f;
                                    njVar5.h(g10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f43327f), this.f43327f.emoji_status, z10);
                                } else {
                                    nj njVar6 = this.Y0;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f43327f)));
                                    TLRPC.User user5 = this.f43327f;
                                    njVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f43327f), this.f43327f.emoji_status, z10);
                                }
                            } else {
                                nj njVar7 = this.Y0;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f43327f)));
                                TLRPC.User user6 = this.f43327f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f43327f);
                                if (!MessagesController.isSupportUser(this.f43327f)) {
                                    emojiStatus = this.f43327f.emoji_status;
                                }
                                njVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.Y0.getTitleTextView().getText());
        Oc(false);
    }

    public final void N6() {
        MessageObject editingMessageObject;
        int abs;
        jk jkVar = this.W;
        if (jkVar != null && (editingMessageObject = jkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f43327f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.i5 i5Var = ((org.telegram.ui.Components.to[]) this.Y.f935b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.f43315e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        i5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new ug(this, 12), 1000L);
                    return;
                }
                org.telegram.ui.Components.ze zeVar = this.W.F1;
                if (zeVar != null) {
                    zeVar.setVisibility(8);
                }
                i5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView N7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f43547w8);
        if (this.f43482r8 == null) {
            nk nkVar = new nk(this, getParentActivity(), 2);
            this.f43482r8 = nkVar;
            nkVar.setOutlineProvider(new kl(this));
            this.f43482r8.setClipToOutline(true);
            this.f43482r8.setWillNotDraw(false);
            l4 l4Var = new l4(getParentActivity());
            this.f43509t8 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.f43482r8.addView(this.f43509t8, w7.z5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f43521u8 = textureView;
            textureView.setOpaque(false);
            this.f43509t8.addView(this.f43521u8, w7.z5.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f43482r8.getParent();
        if (viewGroup != null && viewGroup != this.V0) {
            viewGroup.removeView(this.f43482r8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.V0.addView(this.f43482r8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(B9()), AndroidUtilities.roundPlayingMessageSize(B9())));
        }
        this.f43482r8.setTag(null);
        this.f43509t8.setDrawingReady(false);
        return this.f43521u8;
    }

    public final qn N8() {
        if (this.f43412lc == null) {
            this.f43412lc = new qn(this);
        }
        return this.f43412lc;
    }

    public final void N9(boolean z10) {
        int i10;
        if (this.f43526v0 != null) {
            ArrayList arrayList = this.f43494s6;
            if (!arrayList.isEmpty() && !this.f43523ua.f38179n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f43552x0.h1(i10, 0);
                this.f43526v0.C0();
            }
        }
    }

    public final void Na() {
        org.telegram.ui.Components.pc0 i10;
        wn wnVar = this.f43300ca;
        if (wnVar != null) {
            Drawable d = wnVar.d();
            if (this.fragmentView != null) {
                d = this.V0.getBackgroundImage();
            }
            if (d instanceof bo) {
                d = ((bo) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.pc0) {
                ((org.telegram.ui.Components.pc0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.e5) && (i10 = ((org.telegram.ui.ActionBar.e5) themedDrawable).i()) != null) {
                i10.x(false);
            }
        }
    }

    public final void Nb(boolean z10) {
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
                spannableString.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this);
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
                    org.telegram.ui.Components.rc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new mf(this, z10, 0)), spannableString), i12);
                    M.f30427j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void Nc() {
        Oc(false);
    }

    public final void O6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.U7;
        if (call != null && (((str = this.f43323e8) != null || this.f43335f8) && this.L5)) {
            org.telegram.ui.Components.voip.g2.l(this.f43315e, str, this.W7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f43323e8 = null;
            this.f43335f8 = false;
            return;
        }
        if (this.f43323e8 != null && z10 && (chatFull = this.X7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.q.p(R.string.LinkHashExpired, org.telegram.ui.Components.yc.a0(this), R.raw.linkbroken, 36);
            this.f43323e8 = null;
        }
        this.V7 = !this.L5;
    }

    public final void O7() {
        if (this.V0 != null && this.I1 == null && getParentActivity() != null) {
            this.I1 = new org.telegram.ui.ActionBar.q0(this, getParentActivity(), 1);
            o9();
            this.I1.setClickable(true);
            this.K0.addView(this.I1, w7.z5.n(-1, 44));
            this.K0.h(2, this.I1);
            this.K0.g(this.I1);
            TextView textView = new TextView(getParentActivity());
            this.L1 = textView;
            int i10 = org.telegram.ui.ActionBar.i6.f21068q7;
            textView.setTextColor(getThemedColor(i10));
            TextView textView2 = this.L1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            textView2.setBackground(org.telegram.ui.ActionBar.i6.W(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2));
            this.L1.setTag(Integer.valueOf(i10));
            this.L1.setTextSize(1, 14.0f);
            this.L1.setTypeface(AndroidUtilities.bold());
            this.L1.setSingleLine(true);
            this.L1.setMaxLines(1);
            this.L1.setGravity(17);
            this.I1.addView(this.L1, w7.z5.e(-1, -1, 51));
            this.L1.setOnClickListener(new ye(this, 13));
            org.telegram.ui.Components.q90 q90Var = new org.telegram.ui.Components.q90(getParentActivity(), this.f43300ca);
            this.R1 = q90Var;
            q90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f20889ge));
            this.R1.setTextSize(1, 13.3f);
            this.R1.setDisablePaddingsOffset(true);
            this.R1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.il));
            this.R1.setGravity(17);
            this.R1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.K0.addView(this.R1, w7.z5.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.K0.h(8, this.R1);
            this.K0.g(this.R1);
            TextView textView3 = new TextView(getParentActivity());
            this.J1 = textView3;
            int i11 = org.telegram.ui.ActionBar.i6.f20907he;
            textView3.setTextColor(getThemedColor(i11));
            this.J1.setVisibility(8);
            this.J1.setTextSize(1, 14.0f);
            this.J1.setTypeface(AndroidUtilities.bold());
            this.J1.setSingleLine(true);
            this.J1.setMaxLines(1);
            this.J1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.J1.setGravity(17);
            TextView textView4 = this.J1;
            float dp3 = AndroidUtilities.dp(18.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            textView4.setBackground(org.telegram.ui.ActionBar.i6.W(dp3, getThemedColor(i11) & 436207615, dp4, dp4, dp4, dp4));
            this.I1.addView(this.J1, w7.z5.e(-1, -1, 51));
            this.J1.setOnClickListener(new ye(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.M1 = textView5;
            textView5.setTextColor(getThemedColor(i11));
            this.M1.setVisibility(8);
            this.M1.setTextSize(1, 14.0f);
            this.M1.setTypeface(AndroidUtilities.bold());
            this.M1.setSingleLine(true);
            this.M1.setMaxLines(1);
            this.M1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.M1.setGravity(17);
            this.M1.setText(LocaleController.getString(R.string.RestartTopic));
            this.M1.setBackground(org.telegram.ui.ActionBar.i6.f0(getThemedColor(i11) & 436207615, 3, -1));
            this.K0.addView(this.M1, w7.z5.n(-1, 48));
            this.K0.h(4, this.M1);
            this.K0.g(this.M1);
            this.M1.setOnClickListener(new ye(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.S1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.S1.setContentDescription(LocaleController.getString(R.string.Close));
            this.S1.setBackground(org.telegram.ui.ActionBar.i6.M(getThemedColor(org.telegram.ui.ActionBar.i6.f20918i6), 0, 0));
            this.S1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.f20835de), PorterDuff.Mode.MULTIPLY));
            this.S1.setScaleType(ImageView.ScaleType.CENTER);
            this.I1.addView(this.S1, w7.z5.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.S1.setOnClickListener(new ye(this, 16));
        }
    }

    public final long O8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.f43315e) || !ChatObject.canManageMonoForum(this.currentAccount, this.f43315e)) {
            return 0L;
        }
        long j3 = this.f43280b4;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.f43431n5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f43405l5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j3;
    }

    public final boolean O9() {
        jk jkVar = this.W;
        boolean z10 = jkVar.f24000z2;
        if (z10) {
            jkVar.r1();
            this.B3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Oa() {
        MessageObject messageObject;
        CharSequence charSequence;
        boolean z10;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j3;
        ok okVar;
        jk jkVar = this.W;
        if (jkVar != null && jkVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.W4 && jkVar != null && (okVar = this.M0) != null && okVar.getVisibility() != 0) {
            messageObject = this.f43405l5;
            charSequence = AndroidUtilities.getTrimmedString(this.W.getDraftMessage());
            z10 = this.W.Y2;
        } else {
            messageObject = null;
            charSequence = null;
            z10 = true;
        }
        if (this.f43394k5) {
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
        long B7 = B7(messageObject);
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.R5, B7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j10 = this.R5;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f43394k5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        on onVar = this.f43381j5;
        MessageSuggestionParams messageSuggestionParams = this.f43321e5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        jk jkVar2 = this.W;
        if (jkVar2 != null) {
            j3 = jkVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.saveDraft(j10, B7, charSequence2, entities, message, onVar, suggestedPost2, j3, !z10, false, richMessage);
    }

    public final void Ob(boolean z10) {
        if (this.N != null) {
            if (!AndroidUtilities.isTablet() && !this.f43320e4 && this.f43327f == null) {
                if (this.f43338fb == null) {
                    this.f43338fb = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f43338fb.booleanValue()) {
                    this.f43326eb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.M5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f43326eb) {
                    return;
                }
                this.f43326eb = z10;
                if (z10) {
                    if (this.N.getVisibility() != 0) {
                        this.N.setVisibility(0);
                        this.N.setAlpha(0.0f);
                        this.N.setScaleX(0.3f);
                        this.N.setScaleY(0.3f);
                    }
                    this.N.animate().setListener(null).cancel();
                    this.N.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.N.animate().setListener(null).cancel();
                this.N.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new vi(this, 3)).start();
                return;
            }
            this.f43326eb = z10;
            FrameLayout frameLayout = this.N;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Oc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.t0 t0Var;
        if (this.Y0 != null) {
            int i10 = this.P3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.R5, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f43315e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f43327f)) {
                    if (!UserObject.isReplyUser(this.f43327f) && ((!E9() || this.f43332f4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.i6.H6), PorterDuff.Mode.SRC_IN));
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f43315e;
                    if (chat != null) {
                        drawable = this.Y0.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f43327f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.Y0.c(DialogObject.getBotVerificationIcon(this.f43327f));
                        }
                    }
                }
                this.Y0.i(drawable, mutate);
                if (!z10 && (t0Var = this.f43291c1) != null) {
                    if (isDialogMuted) {
                        if (t0Var.f21522l != 8) {
                            t0Var.f21522l = 8;
                            View view = t0Var.f21519i;
                            if (view instanceof org.telegram.ui.ActionBar.f1) {
                                ((org.telegram.ui.ActionBar.f1) view).getRightIcon().setVisibility(t0Var.f21522l);
                            }
                        }
                        this.f43291c1.d(LocaleController.getString(R.string.Unmute));
                        this.f43291c1.b(R.drawable.msg_mute);
                    } else {
                        if (t0Var.f21522l != 0) {
                            t0Var.f21522l = 0;
                            View view2 = t0Var.f21519i;
                            if (view2 instanceof org.telegram.ui.ActionBar.f1) {
                                ((org.telegram.ui.ActionBar.f1) view2).getRightIcon().setVisibility(t0Var.f21522l);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.R5, d())) {
                            this.f43291c1.d(LocaleController.getString(R.string.Mute));
                            this.f43291c1.b(R.drawable.msg_unmute);
                        } else {
                            this.f43291c1.d(LocaleController.getString(R.string.Mute));
                            this.f43291c1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.so soVar = this.f43341g1;
                if (soVar != null) {
                    soVar.d(this.R5, d(), null);
                }
            }
        }
    }

    public final void P6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.f43540w1 == null && ChatObject.isMegagroup(this.f43315e) && (chatFull = getMessagesController().getChatFull(this.f43315e.f20047id)) != null && this.W != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            ok okVar = this.M0;
            if (okVar == null || okVar.getVisibility() != 0) {
                org.telegram.ui.Components.n40 n40Var = org.telegram.ui.Components.n40.f28963n;
                if (n40Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j3 = groupStickerSetById.documents.get(0).f20053id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        n40Var.b();
                        ci.e4 e4Var = new ci.e4(getParentActivity(), 3);
                        this.f43540w1 = e4Var;
                        e4Var.i();
                        this.f43540w1.p(true);
                        ci.e4 e4Var2 = this.f43540w1;
                        e4Var2.K = Layout.Alignment.ALIGN_CENTER;
                        e4Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.z5(j3, this.f43540w1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f43540w1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        ci.e4 e4Var3 = this.f43540w1;
                        e4Var3.h = ci.e4.a(e4Var3.getText(), this.f43540w1.getTextPaint());
                        ci.e4 e4Var4 = this.f43540w1;
                        e4Var4.d = -1L;
                        e4Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new ug(this, 23), 300L);
                    }
                }
            }
        }
    }

    public final void P7() {
        int i10;
        if (this.P1 == null && getParentActivity() != null) {
            if (this.f43528v2 == null) {
                K7();
            }
            org.telegram.ui.Components.w31 w31Var = new org.telegram.ui.Components.w31(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.P1 = w31Var;
            w31Var.O = new qe(this, 6);
            w31Var.setSideMenuBackgroundDrawable(this.H.c(w31Var, eh.b.p(this.f43300ca), false));
            org.telegram.ui.Components.w31 w31Var2 = this.P1;
            w31Var2.setTopMenuBackgroundDrawable(this.H.c(w31Var2, eh.b.p(this.f43300ca), false));
            this.P1.setCurrentTopic(d());
            this.P1.setOnNewTopicSelected(new qe(this, 7));
            this.P1.setOnTopicSelected(new cf(this, 0));
            this.P1.setOnDialogSelected(new cf(this, 1));
            int indexOfChild = this.V0.indexOfChild(this.V);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.V0.addView(this.P1, i10, w7.z5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.P1.n();
            ck ckVar = this.G1;
            if (ckVar != null) {
                ckVar.bringToFront();
            }
        }
    }

    public final int P8() {
        return this.V0.getBackgroundSizeY();
    }

    public final void Pa() {
        org.telegram.ui.Cells.u1 u1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f43526v0.getChildCount(); i11++) {
            View childAt = this.f43526v0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                int min = Math.min(u1Var2.getBottom(), this.f43526v0.getHeight()) - Math.max(0, u1Var2.getTop());
                if (min > i10) {
                    u1Var = u1Var2;
                    i10 = min;
                }
            }
        }
        if (u1Var != null) {
            vj vjVar = this.f43552x0;
            this.f43526v0.getClass();
            vjVar.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) this.f43469q9), false);
        }
    }

    public final void Pb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new re(this, 11));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20377a);
    }

    public final void Pc(boolean r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Pc(boolean):void");
    }

    public final void Q6() {
        ArrayList arrayList;
        int i10;
        if (this.Na) {
            int i11 = -1;
            long j3 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f43494s6;
                if (i12 >= arrayList.size()) {
                    break;
                }
                long groupIdForUse = ((MessageObject) arrayList.get(i12)).getGroupIdForUse();
                if (j3 != groupIdForUse) {
                    if (i11 >= 0 && j3 != 0 && (i10 = i12 - i11) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < i10; i13++) {
                            arrayList2.add((MessageObject) arrayList.remove(i11));
                        }
                        Collections.sort(arrayList2, new ff(3));
                        arrayList.addAll(i11, arrayList2);
                    }
                    i11 = i12;
                    j3 = groupIdForUse;
                }
                i12++;
            }
            if (i11 >= 0 && j3 != 0 && arrayList.size() - i11 > 1) {
                int size = arrayList.size() - i11;
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList3.add((MessageObject) arrayList.remove(i11));
                }
                arrayList.addAll(i11, arrayList3);
            }
        }
    }

    public final void Q7() {
        if (this.f43542w3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f43300ca);
            this.f43542w3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.V0.addView(this.f43542w3, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final float Q8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.V0.getBackgroundTranslationY()) - ((1.0f - this.v9) * this.f43469q9);
    }

    public final void Qa(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Qa(org.telegram.messenger.MessageObject):void");
    }

    public final void Qb() {
        String str;
        if (this.Db != null) {
            return;
        }
        if (this.f43405l5 != null) {
            str = getMessagesController().getFullName(this.f43405l5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new re(this, 19));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new re(this, 20));
        b2Var.setOnDismissListener(new ig(this, 7));
        this.Db = alertDialog$Builder.o();
    }

    public final void Qc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.t0 t0Var = this.f43474r0;
        if (t0Var != null) {
            TLRPC.Chat chat = this.f43315e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f43266a4) && (tL_forumTopic = this.f43266a4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            t0Var.e(i10);
        }
    }

    public final void R6(boolean z10) {
        gg.o1 o1Var;
        if (this.M3 == 2 && (o1Var = this.K3) != null) {
            String str = this.f43491s3;
            ci.qc qcVar = o1Var.E;
            if (!TextUtils.equals(o1Var.f10740x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(qcVar);
                ai.v8 v8Var = o1Var.f10741y;
                if (v8Var != null && v8Var.I != 0) {
                    ConnectionsManager.getInstance(v8Var.f785c).cancelRequest(v8Var.I, true);
                    v8Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    o1Var.f10740x = str;
                    o1Var.f10741y = new ai.v8(o1Var.f10737r, str2, trim);
                    if (z10) {
                        qcVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(qcVar, 1000L);
                    }
                }
                ai.v8 v8Var2 = o1Var.f10741y;
                if (v8Var2 != null && v8Var2.J > 0) {
                    o1Var.l();
                }
            }
        }
    }

    public final ArrayList R7(MessageObject messageObject, boolean z10) {
        ArrayList k10 = org.telegram.messenger.q.k(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.f43494s6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.J6 || messageObject.getDialogId() == this.J6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    k10.add(messageObject2);
                }
            }
        }
        return k10;
    }

    public final float R8() {
        org.telegram.ui.Components.w31 w31Var = this.P1;
        if (w31Var != null) {
            return w31Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void R9() {
        J6(this.N0, 5, true);
        J6(this.W, 1, false);
        J6(this.P2, 4, true);
        J6(this.M0, 3, false);
        J6(this.P, 2, false);
        float f7 = this.f43512tc.f15436e;
        j6.l lVar = this.f43576yc;
        float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 1.0f - ((float[]) lVar.f14025b)[5], 1.0f);
        jh.c cVar = this.N0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(b10);
        }
        jk jkVar = this.W;
        if (jkVar != null) {
            jkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        nk nkVar = this.P2;
        if (nkVar != null) {
            nkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        ok okVar = this.M0;
        if (okVar != null) {
            okVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        nk nkVar2 = this.P;
        if (nkVar2 != null) {
            nkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        hh.g gVar = this.Q;
        if (gVar != null) {
            gVar.setInputBubbleAlpha((int) ((1.0f - b10) * 255.0f));
            this.Q.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        ok okVar2 = this.M0;
        le.b bVar = this.f43486rc;
        if (okVar2 != null) {
            okVar2.setTotalVisibilityFactor((1.0f - bVar.f15436e) * ((float[]) lVar.f14025b)[3]);
        }
        wp wpVar = this.N9;
        if (wpVar != null) {
            float f10 = bVar.f15436e;
            if (wpVar.S != f10) {
                wpVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        q7();
    }

    public final void Ra(long j3) {
        vj vjVar;
        MessageObject messageObject;
        int M8;
        int abs;
        sj sjVar = this.f43526v0;
        int i10 = -1;
        if (sjVar != null && (vjVar = this.f43552x0) != null && vjVar.f46535y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f43526v0.getChildAt(childCount);
                this.f43526v0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j3 && (abs = Math.abs((M8 = M8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = M8;
                    i12 = abs;
                }
            }
            this.f43407l7 = i10;
            this.f43419m7 = i11;
            return;
        }
        this.f43407l7 = -1;
    }

    public final void Rb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.m40 m40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((m40Var = this.f43391k2) != null && m40Var.getVisibility() == 0)) {
                this.f43391k2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f43391k2.f(view, true);
                }
            }
        }
    }

    public final void Rc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        nj njVar = this.Y0;
        if (njVar != null && (tL_forumTopic = this.f43266a4) != null) {
            njVar.setTitle(tL_forumTopic.title);
        }
        Sc();
    }

    public final void S6() {
        this.Q.d();
        vc();
        fc();
        m7();
        j7();
        o7();
        n7();
        r7();
        p9();
        boolean z10 = true;
        if (this.v.f44735s == 1) {
            z10 = false;
        }
        if (this.Ta != z10) {
            this.Ta = z10;
            checkSystemBarColors();
        }
    }

    public final void S7(final int i10, final int i11, final boolean z10) {
        this.f43565y0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f43494s6;
            if (i12 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            int i13 = messageObject.messageOwner.date;
            if (i13 <= i10 || i13 >= i11) {
                this.f43565y0.M.add(messageObject);
            }
            i12++;
        }
        sj sjVar = this.f43526v0;
        if (sjVar != null) {
            sjVar.setEmptyView(null);
        }
        if (this.f43565y0.M.isEmpty()) {
            Ob(true);
        }
        jm jmVar = this.f43565y0;
        jmVar.L = true;
        jmVar.O(true);
        Q7();
        UndoView undoView = this.f43542w3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.R5, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                yn ynVar = yn.this;
                MessagesController messagesController = ynVar.getMessagesController();
                long j10 = ynVar.R5;
                if (ChatObject.isChannel(ynVar.f43315e)) {
                    j3 = ynVar.R5;
                } else {
                    j3 = 0;
                }
                messagesController.deleteMessagesRange(j10, j3, i10, i11, z10, new ug(ynVar, 16));
            }
        }, new yf(this, 27));
    }

    public final int S8() {
        return (int) (R8() * AndroidUtilities.dp(71.0f));
    }

    public final void S9(boolean z10, boolean z11) {
        if (this.B3) {
            AndroidUtilities.runOnUIThread(new qe(this, 19), 200L);
            if (z11) {
                this.B3 = false;
            }
        }
        if (z10 && !this.Ma) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final void Sa() {
        int i10;
        int i11;
        sj sjVar = this.f43526v0;
        if (sjVar != null && this.f43552x0 != null) {
            for (int childCount = sjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f43526v0.getChildAt(childCount);
                this.f43526v0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = M8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i10 = M8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f43552x0.h1(i11, i10);
        }
    }

    public final void Sb(MessageSuggestionParams messageSuggestionParams) {
        if (this.f43431n5 == null) {
            return;
        }
        new yh.f0(getParentActivity(), this.currentAccount, this.R5, messageSuggestionParams, this, getResourceProvider(), 0, new xe(this, 1)).show();
    }

    public final void Sc() {
        nj njVar;
        nj njVar2;
        if (UserObject.isBotForum(this.f43327f) && (njVar2 = this.Y0) != null) {
            njVar2.getAvatarImageView().setVisibility(0);
            this.Y0.b();
        } else if (this.f43266a4 != null && (njVar = this.Y0) != null) {
            njVar.getAvatarImageView().setVisibility(0);
            ng.d.p(this.Y0.getAvatarImageView(), this.f43266a4, true, true, this.f43300ca);
        }
    }

    public final void T6() {
        TLRPC.Chat chat;
        long j3 = getArguments().getInt("search_from_user_id", 0);
        if (j3 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user != null) {
                ka("");
                ImageView imageView = this.R2;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                Ya(null, user);
                return;
            }
            return;
        }
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j10))) != null) {
            ka("");
            ImageView imageView2 = this.R2;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Ya(chat, null);
        }
    }

    public final void T7(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.u1 u1Var2;
        CharacterStyle characterStyle2;
        MessageObject messageObject2;
        int i10;
        String str2;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.b80 I = org.telegram.ui.Components.b80.I(this, u1Var);
        org.telegram.ui.Components.sm0 sm0Var = new org.telegram.ui.Components.sm0(getParentActivity(), this.f43300ca);
        I.f24880p = new se(sm0Var, 0);
        if (!str.startsWith("video?") && !nf.f.f(Uri.parse(str), false, null)) {
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
            te teVar = new te(this, str, characterStyle, messageObject, u1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            u1Var2 = u1Var;
            I.c(i13, string, teVar, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            u1Var2 = u1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new ue(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new ue(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new ve(this, messageObject2, 0), false);
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
        I.c(i14, LocaleController.getString(i10), new ai.s4(this, str, messageObject2, startsWith, 11), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new ue(this, str, 2), false);
        }
        sm0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            sm0Var.f(u1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.n61) {
            String url = ((org.telegram.ui.Components.n61) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = nf.f.v(parse, null, null, nf.f.a(parse.getHost()), null);
                } catch (Exception e7) {
                    FileLog.e((Throwable) e7, false);
                }
                str2 = URLDecoder.decode(url.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e10) {
                FileLog.e(e10);
                str2 = url;
            }
            if (str2.length() > 204) {
                str2 = str2.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            sm0Var.f(u1Var2, characterStyle2, spannableString2, false);
        } else {
            sm0Var.f(u1Var2, characterStyle2, null, false);
        }
        showDialog(sm0Var);
    }

    public final int T8(int i10) {
        SparseIntArray sparseIntArray = this.T4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Dc;
            Dc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void T9() {
        this.B4 = true;
        rm rmVar = this.f43271a9;
        AndroidUtilities.cancelRunOnUIThread(rmVar.f21963g0);
        rmVar.f21992z = false;
        qe qeVar = new qe(this, 8);
        int i10 = this.B7;
        if (i10 != 0) {
            Wa(i10, 0, false, this.A7, true, 0, null, null, qeVar);
            return;
        }
        int i11 = this.f43584z7;
        if (i11 > 0) {
            Wa(i11, 0, true, this.A7, true, 0, null, null, qeVar);
            return;
        }
        Va(!this.Za, qeVar);
        this.Za = false;
        if (!this.F4.isEmpty()) {
            this.M4 = true;
            this.L4 = ((Integer) this.F4.get(0)).intValue();
        }
    }

    public final int Ta(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f7;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        MessageObject messageObject2;
        if (!TextUtils.isEmpty(this.N7) && messageObject != null) {
            if (messageObject.getGroupId() != 0) {
                MessageObject.GroupedMessages z82 = z8(messageObject.getGroupId());
                org.telegram.ui.Cells.u1 u1Var2 = this.f43385j9;
                if (u1Var2 != null && (textLayoutBlocks2 = u1Var2.f23484ye) != null && z82 != null && (messageObject2 = z82.captionMessage) != null) {
                    i10 = u1Var2.f23469xe;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (u1Var2 != null) {
                        u1Var2.f23469xe = 0;
                        u1Var2.f23484ye = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (u1Var = this.f43385j9) != null && (textLayoutBlocks = u1Var.f23159c4) != null) {
                i10 = (int) u1Var.f23355q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.u1 u1Var3 = this.f43385j9;
                if (u1Var3 != null && u1Var3.f23398t1) {
                    i10 = u1Var3.f23297m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.u1 u1Var4 = this.f43385j9;
            if (u1Var4 != null) {
                u1Var4.f23469xe = 0;
                u1Var4.f23484ye = null;
            }
            if (arrayList == null || charSequence == null || (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.N7, this.Q7)) < 0) {
                return 0;
            }
            for (int i11 = 0; i11 < arrayList.size(); i11++) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i11);
                String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                int i12 = textLayoutBlock.charactersOffset;
                if (findQuoteStart > i12) {
                    if (findQuoteStart - i12 > charSequence3.length() - 1) {
                        lineTop = i10 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height));
                    } else {
                        lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i10 + textLayoutBlock.padTop;
                    }
                    float f10 = AndroidUtilities.displaySize.y;
                    float f11 = 0.5f;
                    if (w9()) {
                        f7 = 0.7f;
                    } else {
                        f7 = 0.5f;
                    }
                    if (lineTop <= f10 * f7) {
                        return 0;
                    }
                    float f12 = AndroidUtilities.displaySize.y;
                    if (w9()) {
                        f11 = 0.7f;
                    }
                    return (int) (lineTop - (f12 * f11));
                }
            }
            return 0;
        }
        org.telegram.ui.Cells.u1 u1Var5 = this.f43385j9;
        if (u1Var5 != null) {
            u1Var5.f23469xe = 0;
            u1Var5.f23484ye = null;
        }
        return 0;
    }

    public final void Tb(MessageObject messageObject) {
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f43349g9 && this.f43361h9 <= this.W.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f43349g9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f43336f9 == null) {
                        nl nlVar = new nl(getParentActivity(), this.f43300ca, this);
                        this.f43336f9 = nlVar;
                        this.V0.addView(nlVar, w7.z5.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f43336f9.c();
                }
            }
        }
    }

    public final void Tc() {
        int i10;
        org.telegram.ui.ActionBar.t0 t0Var = this.f43377j0;
        if (t0Var == null) {
            return;
        }
        if (getMessagesController().getTranslateController().isTranslateDialogHidden(a()) && getMessagesController().getTranslateController().isDialogTranslatable(a())) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        t0Var.e(i10);
    }

    public final void U6() {
        MessageObject messageObject;
        if (!this.B4 && (messageObject = this.H7) != null) {
            if (this.f43494s6.indexOf(messageObject) >= 0) {
                this.C4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.A4 != null) {
        } else {
            yf yfVar = new yf(this, 20);
            this.A4 = yfVar;
            AndroidUtilities.runOnUIThread(yfVar);
        }
    }

    public final void U7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.u1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.U7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1):void");
    }

    public final int U8(int i10) {
        SparseIntArray sparseIntArray = this.S4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Dc;
            Dc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void Ua() {
        Va(false, null);
    }

    public final void Ub(boolean z10, boolean z11) {
        jk jkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f43463q2 != null) && this.P3 == 0 && (jkVar = this.W) != null && jkVar.getAudioVideoButtonContainer() != null && this.W.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f43463q2 == null) {
                    qm qmVar = this.V0;
                    int indexOfChild = qmVar.indexOfChild(this.Q);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(9, getParentActivity(), this.f43300ca, false);
                        this.f43463q2 = m40Var;
                        qmVar.addView(m40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f43463q2.b(true);
                    return;
                }
                if (this.W.f23884e2) {
                    org.telegram.ui.Components.m40 m40Var2 = this.f43463q2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    m40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f43463q2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f43463q2.f(this.W.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Uc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        sj sjVar = this.f43526v0;
        if (sjVar != null) {
            if (!this.B4 && this.H7 != null) {
                int childCount = sjVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f43526v0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.H7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f43494s6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.H7) + this.f43565y0.J;
                                i11 = M8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f43526v0.getChildCount();
            jk jkVar = this.W;
            if (jkVar != null) {
                jkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f43526v0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                    MessageObject messageObject3 = u1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        u1Var.X3(messageObject3, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
                        jm jmVar = this.f43565y0;
                        this.f43526v0.getClass();
                        jmVar.Q(RecyclerView.R(u1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f43552x0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void V(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            qh.c cVar = this.f43589zc;
            if (cVar != null) {
                this.V0.removeView(cVar);
                this.f43589zc = null;
            }
            jk jkVar = this.W;
            if (jkVar != null) {
                jkVar.H0();
            }
        }
    }

    public final void V6(boolean z10) {
        if (this.f43405l5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f43494s6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f43405l5.getId() && messageObject.getDialogId() == this.f43405l5.getDialogId()) {
                        this.f43405l5 = messageObject;
                        on onVar = this.f43381j5;
                        if (onVar != null) {
                            onVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f43307d5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f43405l5;
                                MessageObject.GroupedMessages groupedMessages = this.f43357h5;
                                if (groupedMessages == null) {
                                    groupedMessages = z8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.R5, this.f43381j5);
                            }
                            j8();
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

    public final void V7(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, String str) {
        xi J9 = J9(u1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(gf.b.d(str, false));
        ua uaVar = new ua(this, u1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                uaVar.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new r1(this, tL_contact, uaVar, 14));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = gf.b.d(str, false);
        J9.f16886b = new hf(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ca(this, J9, uaVar, 3)), 0);
        J9.d();
    }

    public final long V8() {
        return this.f43280b4;
    }

    public final void V9(long j3, String str, boolean z10) {
        W9();
        ai.g4 g4Var = this.H1;
        if (g4Var != null) {
            g4Var.M1(j3, str, z10, false);
        }
    }

    public final void Va(boolean z10, qe qeVar) {
        ArrayList arrayList;
        int i10;
        if (this.f43526v0.X1) {
            return;
        }
        this.L4 = 0;
        this.nb = 0;
        this.M4 = false;
        this.U8.f(0);
        if (this.C6[0] && this.F7 == 0 && this.f43495s7 == 0) {
            this.f43353h1.d(false);
            if (this.f43552x0.I0() == 0) {
                this.f43324e9 = false;
                uc();
                Ha();
                Vc(false);
                return;
            }
            this.f43565y0.T();
            ln lnVar = this.Ja;
            lnVar.f38360a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f43494s6;
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
            rk rkVar = this.U8;
            lnVar.f38361b = i11;
            lnVar.d = 0;
            boolean z11 = !z10;
            lnVar.f38362c = z11;
            rkVar.d(i11, 0, z11, true);
            this.f43324e9 = false;
            uc();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f43423mb;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        wc(false);
        if (qeVar != null) {
            qeVar.run();
        } else {
            La();
            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f43300ca);
            this.f43423mb = b2Var2;
            b2Var2.setOnCancelListener(this.f43399ka);
            this.f43423mb.q(1000L);
        }
        this.W8 = this.T5;
        this.Y8 = false;
        this.X8 = 0;
        this.Z8 = false;
        ArrayList arrayList2 = this.f43334f6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.T5));
        AndroidUtilities.runOnUIThread(new yf(this, 11), 0L);
    }

    public final boolean Vb(MessageObject messageObject) {
        if (this.P3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void Vc(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Vc(boolean):void");
    }

    public final void W6() {
        ok okVar;
        nk nkVar;
        nk nkVar2;
        jk jkVar = this.W;
        if (jkVar != null && jkVar.f24001z3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.f43315e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((okVar = this.M0) == null || okVar.getVisibility() != 0) && (((nkVar = this.P) == null || nkVar.getVisibility() != 0) && ((nkVar2 = this.P2) == null || nkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void W7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.W7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final float W8(float f7) {
        yn ynVar = this.f43286ba;
        if (ynVar == null) {
            ynVar = this;
        }
        org.telegram.ui.Components.eh ehVar = ynVar.K0;
        if (ehVar == null) {
            return 0.0f;
        }
        return ehVar.c(f7);
    }

    public final void W9() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            jk jkVar = this.W;
            if (jkVar == null || TextUtils.isEmpty(jkVar.getSlowModeTimer())) {
                jk jkVar2 = this.W;
                if (jkVar2 != null && jkVar2.f23912i5.f15437f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                E7();
                ai.g4 g4Var = this.H1;
                if (!z10 && this.P3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                g4Var.R1 = z11;
                g4Var.f32922j0.f0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 == 21 || i10 == 22) {
                    this.W.N();
                }
                TLRPC.Chat chat = this.f43315e;
                if ((chat == null || this.f43321e5 == null) && !z10 && this.P3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f43315e.slowmode_enabled) {
                        this.H1.I1(10, true);
                    } else {
                        this.H1.I1(-1, true);
                    }
                } else {
                    this.H1.I1(1, true);
                }
                ai.g4 g4Var2 = this.H1;
                g4Var2.S0 = true;
                g4Var2.f32968x1.setVisibility(0);
                g4Var2.Q0 = 0;
                g4Var2.F = false;
                g4Var2.G = false;
                g4Var2.f32919i0 = true;
                g4Var2.J = null;
                org.telegram.ui.ActionBar.v0 v0Var = g4Var2.f32926k1;
                if (v0Var != null) {
                    g4Var2.f32923j1.setTranslationY(0.0f);
                    v0Var.setVisibility(8);
                }
                this.H1.q1();
                this.H1.m1().setText(this.W.getFieldText());
                ai.g4 g4Var3 = this.H1;
                g4Var3.f32945r = this.f43300ca;
                showDialog(g4Var3);
            }
        }
    }

    public final void Wa(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Wa(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Wb(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            zg.r rVar = this.W9;
            if (rVar != null && rVar.d()) {
                this.W9.setHiddenByScroll(true);
            }
            if (this.f43352h0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21286n0) {
                    kVar.h(true);
                    this.W.d1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ii.e2 e2Var = new ii.e2(richMessage);
                e2Var.J = this;
                e2Var.f12335r = messageObject;
                presentFragment(e2Var);
                return;
            }
            this.G1.getAdapter().f10676f0 = false;
            this.W.setVisibility(0);
            xb(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            gc(false);
            if (!z10) {
                N6();
            }
            if (z10) {
                this.f43321e5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.W.U0(false, false, true);
            xc(0, true);
            Vc(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.P3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.R5);
                tL_messages_getMessageEditData.f20139id = messageObject.getId();
                this.f43417m5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new pe(this, 3));
                return;
            }
            jk jkVar = this.W;
            org.telegram.ui.Components.ze zeVar = jkVar.F1;
            if (zeVar != null) {
                zeVar.setEnabled(true);
                jkVar.F1.h(false);
            }
        }
    }

    public final boolean X6(boolean z10, boolean z11) {
        jk jkVar = this.W;
        if (jkVar == null || !jkVar.v0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43300ca);
            if (this.W.f23870c1) {
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new ai.k(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f20377a);
            return true;
        }
        return true;
    }

    public final void X7(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.X7(int, java.lang.Object[]):void");
    }

    public final float X8(org.telegram.ui.Components.s31 s31Var) {
        float f7;
        org.telegram.ui.Components.w31 w31Var = this.P1;
        if (w31Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j3 = w31Var.j(s31Var);
            if (s31Var == org.telegram.ui.Components.s31.f30678b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * j3;
        }
        return 0.0f;
    }

    public final void X9() {
        rt.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        E7();
        this.H1.f32922j0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.W.N();
        }
        this.H1.I1(1, false);
        ai.g4 g4Var = this.H1;
        g4Var.U1 = true;
        g4Var.i1(null);
        this.H1.q1();
        ai.g4 g4Var2 = this.H1;
        g4Var2.f32945r = this.f43300ca;
        if (this.visibleDialog != null) {
            g4Var2.show();
        } else {
            showDialog(g4Var2);
        }
    }

    public final void Xa(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Xa(java.lang.CharSequence, boolean):void");
    }

    public final void Xb() {
        org.telegram.ui.Components.u00 u00Var = this.f43398k9;
        if (u00Var != null && !u00Var.f31277c) {
            u00Var.c(false);
            try {
                this.f43398k9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Y6() {
        if (!this.Pb) {
            this.Pb = true;
            if (!this.Qb && this.P3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f43502t1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f43502t1.u();
                    this.Qb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f43514u1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f43514u1.u();
                    this.Qb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    Z6();
                }
            }
        }
    }

    public final void Y7(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Y7(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages Y8(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f43532v6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void Y9(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.u1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Y9(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.u1, org.telegram.messenger.MessageObject):void");
    }

    public final void Ya(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f43415m3 = user;
        this.f43429n3 = chat;
        if (this.f43352h0 != null && this.G1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f43415m3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f43404l3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a4.a.D(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.i6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f43352h0.setSearchFieldCaption(spannableString);
                    this.G1.getAdapter().U(null, 0, null, false, true);
                    this.f43352h0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.v0 v0Var = this.f43352h0;
                    v0Var.f21599r = null;
                    ci.h2 h2Var = v0Var.f21584e;
                    if (h2Var != null) {
                        h2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f43477r3 = "";
                    mediaDataController.searchMessagesInChat("", this.R5, this.J6, this.classGuid, 0, this.f43280b4, this.f43415m3, this.f43429n3, this.f43440o3);
                }
            }
        }
    }

    public final void Yb() {
        long j3;
        qe qeVar = this.S7;
        if (qeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qeVar);
        }
        qe qeVar2 = new qe(this, 16);
        this.S7 = qeVar2;
        if (this.N7 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(qeVar2, j3);
    }

    public final void Z6() {
        org.telegram.ui.Cells.u1 u1Var;
        ci.e4 e4Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        ci.e4 e4Var2 = this.f43527v1;
        if (e4Var2 != null && !e4Var2.V && !this.Sb && this.Pb && !this.f43537vc.f15437f && System.currentTimeMillis() - this.Rb > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f43526v0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f43526v0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        u1Var = (org.telegram.ui.Cells.u1) childAt;
                        zg.n0 n0Var = u1Var.N;
                        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !n0Var.v.isEmpty()) {
                            u1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + n0Var.d;
                            if (f7 >= AndroidUtilities.dp(240.0f) && f7 <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    u1Var = null;
                    break;
                }
            }
            if (u1Var != null) {
                zg.n0 n0Var2 = u1Var.N;
                this.Sb = true;
                u1Var.getLocationInWindow(iArr);
                this.f43527v1.setTranslationY(((iArr[1] - e4Var.getTop()) - AndroidUtilities.dp(120.0f)) + n0Var2.d);
                this.f43527v1.m(0.0f, (((zg.k0) n0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + n0Var2.f53479c);
                this.f43527v1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new qe(this, 18));
            AndroidUtilities.runOnUIThread(new qe(this, 18), 2000L);
        }
    }

    public final void Z7(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.Z7(int, java.lang.Object[]):void");
    }

    public final void Z8(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.P3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f43504t3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.M3);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j3 = this.R5;
        long j10 = this.J6;
        int i14 = this.classGuid;
        boolean z11 = this.Na;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j3, j10, i14, i10, this.f43280b4, this.f43415m3, this.f43429n3, this.f43440o3);
        Kb(false);
    }

    public final void Z9(long j3, final MessageObject messageObject, int i10, final long j10, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f20047id + " msg_id = " + i13);
        }
        this.f43339fc = 0;
        this.gc = false;
        this.f43376ic = null;
        this.f43388jc = null;
        sj sjVar = this.f43526v0;
        if (sjVar != null) {
            sjVar.g1();
        }
        if (this.ec != -1) {
            getConnectionsManager().cancelRequest(this.ec, false);
        }
        if (this.f43314dc != -1) {
            getConnectionsManager().cancelRequest(this.f43314dc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f43339fc = i13;
        this.gc = false;
        this.f43363hc = System.currentTimeMillis();
        sj sjVar2 = this.f43526v0;
        if (sjVar2 != null) {
            sjVar2.g1();
        }
        final int i14 = this.f43288bc + 1;
        this.f43288bc = i14;
        this.f43314dc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final yn ynVar = yn.this;
                final int i15 = i14;
                final int i16 = i11;
                final long j11 = j10;
                final int i17 = i12;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.g6(29, ynVar, new Runnable(i15, i16, j11, tLObject, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f36314b;
                    public final int f36315c;
                    public final TLObject d;
                    public final int f36316e;
                    public final MessageObject f36317f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f36318n;
                    public final MessageObject f36319r;

                    {
                        this.d = tLObject;
                        this.f36316e = i17;
                        this.f36317f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f36318n = chat2;
                        this.f36319r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i18;
                        final yn ynVar2 = yn.this;
                        if (this.f36314b != ynVar2.f43288bc) {
                            return;
                        }
                        ynVar2.f43314dc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            ynVar2.f43376ic = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            ynVar2.getMessagesController().putUsers(ynVar2.f43376ic.users, false);
                            ynVar2.getMessagesController().putChats(ynVar2.f43376ic.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = ynVar2.f43376ic;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i19 = 0; i19 < ynVar2.f43376ic.messages.size(); i19++) {
                                TLRPC.Message message = ynVar2.f43376ic.messages.get(i19);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i20 = this.f36315c;
                        final int i21 = this.f36316e;
                        final MessageObject messageObject5 = this.f36317f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f36318n;
                        final MessageObject messageObject6 = this.f36319r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = ynVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f20068id;
                            tL_messages_getReplies.offset_date = 0;
                            tL_messages_getReplies.limit = 30;
                            if (i21 > 0) {
                                tL_messages_getReplies.offset_id = i21;
                                tL_messages_getReplies.add_offset = -15;
                            } else {
                                if (i20 == 0) {
                                    i18 = 1;
                                } else {
                                    i18 = i20;
                                }
                                tL_messages_getReplies.offset_id = i18;
                                tL_messages_getReplies.add_offset = -20;
                            }
                            final int i22 = ynVar2.f43301cc + 1;
                            ynVar2.f43301cc = i22;
                            ynVar2.ec = ynVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new sh(yn.this, i22, tLObject3, tL_error2, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        ynVar2.xa(ynVar2.f43376ic, ynVar2.f43388jc, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f43314dc, this.classGuid);
    }

    public final void Za(View view, MessageObject messageObject, org.telegram.ui.Components.sk0 sk0Var, View view2, float f7, float f10, zg.m0 m0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        yh.c4 c4Var;
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
            if (m0Var != null && m0Var.f53467a) {
                A7(true);
                if (view == null) {
                    a0Var = q8(messageObject.getId(), true);
                } else {
                    a0Var = view;
                }
                String str2 = "";
                if (z11) {
                    if (a0Var != null) {
                        try {
                            a0Var.performHapticFeedback(0);
                        } catch (Exception unused) {
                        }
                    }
                    TLRPC.Message message2 = messageObject.messageOwner;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    }
                    ArrayList<TLRPC.MessageReactor> arrayList2 = arrayList;
                    long j3 = -yh.n5.b(messageObject).f51702a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
                        org.telegram.ui.Components.yc a02 = org.telegram.ui.Components.yc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    yh.t5 t5Var = yh.u5.y(this.currentAccount, false).B;
                    if (t5Var != null) {
                        t5Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j10 = this.R5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    yh.r8 r8Var = new yh.r8(parentActivity, i15, j10, this, messageObject, arrayList2, z14, false, 0L, this.f43300ca);
                    messageObject.getId();
                    r8Var.T = this;
                    r8Var.U = a0Var;
                    r8Var.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -yh.n5.b(messageObject).f51702a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    org.telegram.ui.Components.yc a03 = org.telegram.ui.Components.yc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                yh.t5 d02 = yh.u5.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.nc == null) {
                        this.nc = new yh.c4(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        c4Var = null;
                    } else {
                        if (this.nc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.nc);
                            layoutContainer.addView(this.nc, w7.z5.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.nc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.nc.bringToFront();
                        }
                        c4Var = this.nc;
                    }
                    c4Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f52033o = c4Var;
                    c4Var.I = false;
                    c4Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    c4Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.u1) {
                        i12 = ((org.telegram.ui.Cells.u1) a0Var).V;
                    } else {
                        i12 = 0;
                    }
                    c4Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            zg.m0 m0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new rg.y0((org.telegram.ui.ActionBar.n2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(m0Var) && (chat = this.f43315e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.f43315e, 26)) {
                org.telegram.messenger.q.p(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.yc.a0(this), R.raw.e_hand_2, 36);
            } else {
                zg.i0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(m0Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.i iVar = this.f43532v6;
                if (iVar.f(groupId) != null) {
                    if (messageObject.shouldDrawReactionsInLayout()) {
                        i11 = 9;
                    } else {
                        i11 = 10;
                    }
                    MessageObject findMessageWithFlags = ((MessageObject.GroupedMessages) iVar.f(messageObject.getGroupId())).findMessageWithFlags(i11);
                    if (findMessageWithFlags != null) {
                        id2 = findMessageWithFlags.getId();
                    }
                }
                int i18 = id2;
                if (selectReaction) {
                    org.telegram.ui.Cells.a0 q82 = q8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && q82 != null && m0Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j12 = m0Var.f53472g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(m0Var.f53471f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.q5.f(this.currentAccount, j12);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.rc r10 = org.telegram.ui.Components.yc.a0(this).r(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f30427j = 5000;
                            r10.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (sk0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        zg.i0.d(this, sk0Var, q82, view2, f7, f10, m0Var, i19, i10);
                    }
                }
                if (selectReaction && m0Var != null && (str = m0Var.f53471f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<zg.m0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    m0Var2 = m0Var;
                }
                ui uiVar = new ui(this, z13, z10, i18, selectReaction, sk0Var, f7, f10, m0Var, messageObject);
                this.Zb = uiVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, m0Var2, z11, z12, this, uiVar);
                if (z10 || z13) {
                    pc(messageObject, true);
                    this.Zb.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.Zb, 50L);
                }
            }
        }
    }

    public final void Zb() {
        AndroidUtilities.forEachViews((RecyclerView) this.f43526v0, (Utilities.Callback<View>) new ai.i3(4, this, s9()));
    }

    public long a() {
        return this.R5;
    }

    @Override
    public final void a0(int i10, float f7, float f10, le.e eVar) {
        boolean z10;
        int i11;
        int i12;
        if (i10 == 0) {
            R9();
            return;
        }
        boolean z11 = true;
        int i13 = 4;
        int i14 = 0;
        if (i10 == 1) {
            View view = this.R;
            if (view != null) {
                view.setAlpha(f7);
                View view2 = this.R;
                if (f7 > 0.0f) {
                    i13 = 0;
                }
                view2.setVisibility(i13);
            }
        } else if (i10 == 2) {
            R9();
            s7();
            qh.c cVar = this.f43589zc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.f43512tc.f15436e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                le.b bVar = this.f43525uc;
                float f11 = 1.0f - bVar.f15436e;
                this.K0.setAlpha(f11);
                org.telegram.ui.Components.eh ehVar = this.K0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                ehVar.setVisibility(i12);
                float f12 = 1.0f - bVar.f15436e;
                org.telegram.ui.Components.w31 w31Var = this.P1;
                if (w31Var != null) {
                    w31Var.setAlpha(f12);
                    org.telegram.ui.Components.w31 w31Var2 = this.P1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    w31Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                hh.f fVar = this.I3;
                le.b bVar2 = this.f43537vc;
                if (fVar != null) {
                    float f13 = bVar2.f15436e;
                    fVar.setAlpha(f13);
                    hh.f fVar2 = this.I3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    fVar2.setVisibility(i15);
                }
                if (bVar2.f15436e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jh.f fVar3 = this.V;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar3.setVisibility(i11);
                l7();
                if (bVar2.f15436e >= 1.0f) {
                    z11 = false;
                }
                sj sjVar = this.f43526v0;
                if (z11) {
                    i13 = 0;
                }
                sjVar.setVisibility(i13);
                s7();
                v7();
                u7();
                this.glassEngine.g();
            } else if (i10 == 5) {
                k7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f7);
                }
            } else if (i10 == 6) {
                p7();
            }
        }
    }

    public final void a7(boolean z10) {
        int i10;
        if (this.f43552x0 != null && !this.f43442o5 && !this.f43565y0.L && !this.f43309d7) {
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < this.f43526v0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f43526v0.getChildAt(i14));
                if (R != -1) {
                    if (i12 == -1 || R < i12) {
                        i12 = R;
                    }
                    if (i11 == -1 || R > i11) {
                        i11 = R;
                    }
                    i13++;
                }
            }
            jm jmVar = this.f43565y0;
            if (jmVar.N) {
                int i15 = jmVar.E;
                if (i15 >= 0 && i12 >= 0 && i15 >= i12 && i15 <= i11) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = jmVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            if (this.P3 == 7) {
                if ((h - i12) - i13 <= i10 && !this.E6 && !this.A6[0]) {
                    this.E6 = true;
                    this.f43334f6.add(Integer.valueOf(this.T5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f43491s3;
                    int i16 = this.classGuid;
                    int i17 = this.M3;
                    int i18 = this.T5;
                    this.T5 = i18 + 1;
                    hashtagSearchController.searchHashtag(str, i16, i17, i18);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.ef(this, h, i12, i13, i10, 1));
        }
    }

    public final void a8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.a8(int, java.lang.Object[]):void");
    }

    public final void a9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.a9():void");
    }

    public final void aa(boolean z10) {
        String string;
        if (!x9() && !b9()) {
            int i10 = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.U5;
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
            zg.r rVar = this.W9;
            if (rVar != null && rVar.d()) {
                this.W9.setHiddenByScroll(true);
            }
            Bundle d = org.telegram.messenger.bi.d(3, "onlySelect", "dialogsType", true);
            d.putInt("messagesCount", this.f43268a6);
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            d.putBoolean("canSelectTopics", true);
            uy uyVar = new uy(d);
            uyVar.C2 = this;
            presentFragment(uyVar);
            return;
        }
        if (x9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.f43315e) && !this.f43315e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f43366i2 == null) {
                qm qmVar = this.V0;
                int indexOfChild = qmVar.indexOfChild(this.Q);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, getParentActivity(), null, true);
                    this.f43366i2 = m40Var;
                    qmVar.addView(m40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f43366i2.setAlpha(0.0f);
                    this.f43366i2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f43366i2.setText(string);
            this.f43366i2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f43379j2 == null) {
            qm qmVar2 = this.V0;
            int indexOfChild2 = qmVar2.indexOfChild(this.Q);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.m40 m40Var2 = new org.telegram.ui.Components.m40(getParentActivity(), 9);
            this.f43379j2 = m40Var2;
            qmVar2.addView(m40Var2, indexOfChild2 + 1, w7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f43379j2.setAlpha(0.0f);
            this.f43379j2.setVisibility(4);
        }
        this.f43379j2.setText(string);
        this.f43379j2.f(this.N0.getForwardButton(), true);
    }

    public final void ab(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f20053id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.R5, this.f43405l5, this.V3, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = D8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        y6();
    }

    public final void ac(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.R5, d())) {
            if (z10) {
                getNotificationsController().muteDialog(this.R5, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.f3 F = org.telegram.ui.Components.e5.F(this.R5, d(), this, this.f43300ca);
            F.setCalcMandatoryInsets(w9());
            showDialog(F);
            return;
        }
        getNotificationsController().muteDialog(this.R5, d(), false);
        if (!z10) {
            org.telegram.ui.Components.yc.z(this, 4, 0, this.f43300ca).j();
        }
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j3) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.R5, this.f43405l5, this.V3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = D8();
        of2.payStars = j3;
        of2.monoForumPeer = O8();
        of2.suggestionParams = this.f43321e5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.P3 == 0) {
            N9(false);
        }
        if (i10 == 0 || i10 == 1) {
            y6();
        }
        if (this.f43442o5) {
            this.O5 = true;
        }
    }

    public final void b7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f43456p8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f43456p8 = true;
            org.telegram.ui.Components.e5.s0(getParentActivity(), this.currentAccount, new qe(this, 10), true, this.f43300ca);
        }
    }

    public final void b8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.b8(int, java.lang.Object[]):void");
    }

    public final boolean b9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.U5;
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

    public final void ba(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f43307d5;
        if (messagePreviewParams != null && this.Ca == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.E5;
                CharSequence fieldText = this.W.getFieldText();
                MessageObject messageObject2 = this.f43405l5;
                if (messageObject2 == this.V3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f43381j5, this.f43431n5);
            }
            if (!this.f43307d5.isEmpty()) {
                this.f43287bb = this.W.f24000z2;
                Context context = this.V0.getContext();
                ah.c cVar = this.f43572y8;
                MessagePreviewParams messagePreviewParams2 = this.f43307d5;
                TLRPC.User user = this.f43327f;
                TLRPC.Chat chat = this.f43315e;
                int i12 = this.currentAccount;
                wn wnVar = this.f43300ca;
                on onVar = this.f43381j5;
                if (onVar != null && onVar.f39255f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                el elVar = new el(this, context, this, cVar, messagePreviewParams2, user, chat, i12, wnVar, i10, z10);
                this.Ca = elVar;
                this.f43307d5.attach(elVar);
                TLRPC.ChatFull chatFull = this.X7;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.f43337fa) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.f43337fa.peers.get(0).peer;
                }
                this.Ca.setSendAsPeer(peer);
                d7();
                this.V0.addView(this.Ca);
                if (this.f43287bb) {
                    jk jkVar = this.W;
                    jkVar.T0 = true;
                    org.telegram.ui.Components.fg fgVar = jkVar.U0;
                    if (fgVar != null) {
                        fgVar.u(true);
                    }
                    this.W.r1();
                    this.B3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void bb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j3) {
        long j10;
        String str;
        ck ckVar = this.G1;
        if (ckVar == null) {
            return;
        }
        TLRPC.User user = ckVar.getAdapter().f10696w0;
        if (user != null) {
            j10 = user.f20194id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f20045id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.G1.getAdapter().f10696w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.R5, this.f43405l5, this.V3, null, this.f43381j5, z10, i10, 0, D8(), j3, O8());
        this.W.setFieldText("");
        f9(false);
        getMediaDataController().increaseInlineRating(j10);
    }

    public final void bc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.rc rcVar = this.y3;
        if (rcVar != null) {
            rcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f43281b5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.O4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.R5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.O4 - 1), Boolean.valueOf(this.Q4));
        this.y3 = org.telegram.ui.Components.yc.B(this, false, new ai.c9(this, arrayList2, arrayList, i10, 12), new ve(this, messageObject, 7), this.f43300ca).j();
    }

    @Override
    public final boolean c() {
        if (this.P3 == 1) {
            return true;
        }
        return false;
    }

    public final void c7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        jk jkVar = this.W;
        if (jkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.R5, (int) d());
            le.b bVar = jkVar.f23906h5;
            gi.a aVar = jkVar.I0;
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
            if (z10 && bVar.f15436e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((le.b) aVar.f10890c).a(z12, z13);
            aVar.setClickable(z12);
            aVar.setEnabled(z12);
            if (bVar.f15437f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            jkVar.T4 = streamingSendButtonState;
            if (z14) {
                jkVar.I(z10);
            }
        }
    }

    public final void c8(java.lang.Object... r80) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.c8(java.lang.Object[]):void");
    }

    public final boolean c9() {
        rm rmVar = this.f43271a9;
        if (rmVar != null && rmVar.y()) {
            return true;
        }
        return false;
    }

    public final void ca(String str, boolean z10) {
        boolean z11;
        hk hkVar;
        boolean z12;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                M7();
                ci.e4 e4Var = this.f43502t1;
                if (e4Var != null && e4Var.V) {
                    e4Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                ci.e4 e4Var2 = this.f43514u1;
                if (e4Var2 != null && e4Var2.V) {
                    e4Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new ue(this, str, 5), 200L);
                    return;
                }
                this.f43491s3 = str;
                this.f43477r3 = str;
                boolean contains = str.contains("@");
                R6(true);
                if (!this.actionBar.f21286n0) {
                    this.wc.a(true, true);
                    org.telegram.ui.ActionBar.v0 v0Var2 = this.f43328f0;
                    if (v0Var2 != null) {
                        v0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar = this.f43290c0;
                    if (yVar != null) {
                        yVar.f(8);
                    }
                    fs fsVar = this.f43276b0;
                    if (fsVar != null) {
                        fsVar.b(false);
                    }
                    org.telegram.ui.ActionBar.y yVar2 = this.f43340g0;
                    if (yVar2 != null) {
                        yVar2.f(8);
                    }
                    if ((this.f43280b4 == 0 || (i10 = this.P3) == 3 || i10 == 8) && (v0Var = this.f43352h0) != null) {
                        v0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var3 = this.f43389k0;
                    if (v0Var3 != null && this.I9) {
                        v0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar3 = this.f43402l0;
                    if (yVar3 != null && this.J9) {
                        yVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.v0 v0Var4 = this.f43364i0;
                    if (v0Var4 != null) {
                        v0Var4.setVisibility(8);
                    }
                    this.m0 = true;
                    Ec(0, 0, -1);
                    gc(false);
                }
                vk vkVar = this.f43413m1;
                if (vkVar != null) {
                    if (vkVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        vkVar.g(false);
                    }
                }
                ImageView imageView = this.R2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.f43315e) || !ChatObject.isPublic(this.f43315e) || this.f43491s3 == null)) {
                    this.f43450p1 = 0;
                } else {
                    this.f43450p1 = 2;
                }
                this.U4 = false;
                if (this.M3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ci.i1 i1Var = this.f43438o1;
                if (i1Var != null) {
                    i1Var.h.clear();
                }
                org.telegram.ui.ActionBar.v0 v0Var5 = this.f43352h0;
                if (v0Var5 != null) {
                    this.f43274ac = true;
                    v0Var5.z(false);
                    this.f43274ac = false;
                }
                org.telegram.ui.ActionBar.v0 v0Var6 = this.f43352h0;
                if (v0Var6 != null) {
                    v0Var6.setSearchFieldCaption(null);
                    this.f43352h0.H(str, false);
                    this.f43352h0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f43477r3, this.R5, this.J6, this.classGuid, 0, this.f43280b4, false, this.f43415m3, this.f43429n3, false, this.f43440o3);
                xc(0, true);
                this.f43278b2.e(true, true);
                Kb(true);
                hk hkVar2 = this.f43427n1;
                if (hkVar2 != null) {
                    hkVar2.b(!contains);
                    Gc();
                }
                if ((contains || z10) && this.f43491s3 != null && (hkVar = this.f43427n1) != null) {
                    int currentPosition = hkVar.f32673a.getCurrentPosition();
                    int i11 = this.f43450p1;
                    if (currentPosition != i11) {
                        this.f43427n1.f32673a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f43491s3);
                this.f43475r1.f27064f.N(true);
                View currentView = this.f43438o1.getCurrentView();
                if (currentView instanceof ao) {
                    ((ao) currentView).f34922a.Ic(this.f43491s3);
                }
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.me meVar;
        if ((this.P3 != 5 || (!this.f43494s6.isEmpty() && this.f43280b4 != 0)) && !this.f43537vc.f15437f && this.f43409l9) {
            jk jkVar = this.W;
            if (!jkVar.F2) {
                if (!jkVar.f23870c1 || (meVar = jkVar.f23883e1) == null || meVar.getVisibility() != 0) {
                    if ((!jkVar.j0() || !jkVar.f23924l0.v) && !org.telegram.ui.ActionBar.n2.hasSheets(jkVar.P2) && this.L9 == 0.0f) {
                        uh.i iVar = this.V9;
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

    public final void cb(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        long j10;
        if (f7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.R5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = D8();
                of2.effect_id = j3;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = O8();
                of2.suggestionParams = this.f43321e5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                j10 = 0;
            } else {
                j10 = j3;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.R5, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = D8();
                of3.effect_id = j10;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = O8();
                of3.suggestionParams = this.f43321e5;
                getSendMessagesHelper().sendMessage(of3);
                j10 = 0;
            }
            y6();
        }
    }

    public final void cc() {
        boolean z92 = z9();
        SparseArray[] sparseArrayArr = this.U5;
        if (!z92) {
            if (this.actionBar.s() && this.Z0 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.Z0.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.f43577z0.setText(LocaleController.getString(R.string.ReportMessagesNoCaps));
            this.f43577z0.setAlpha(0.5f);
            this.f43577z0.setEnabled(false);
            return;
        }
        this.f43577z0.setText(LocaleController.formatString(R.string.ReportMessagesCountNoCaps, LocaleController.formatPluralString("messages", size, new Object[0])));
        this.f43577z0.setAlpha(1.0f);
        this.f43577z0.setEnabled(true);
    }

    @Override
    public final android.view.View createView(android.content.Context r57) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f43332f4 && (i10 = this.P3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f43280b4;
    }

    public final void d7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.d7():void");
    }

    public final void d8(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && f7()) {
            int i12 = 0;
            while (true) {
                if (i12 < arrayList2.size()) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i12);
                    if (sendingMediaInfo.inlineResult == null && sendingMediaInfo.videoEditedInfo == null) {
                        break;
                    }
                    i12++;
                } else if (!TextUtils.isEmpty(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption)) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.R5, this.f43405l5, this.V3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = D8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13 = i11 + 1) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.R5, this.f43405l5, this.V3, null, this.f43381j5, z10, i10, 0, D8(), 0L, O8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    i11 = i13;
                }
            }
            if (!arrayList2.isEmpty()) {
                l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.R5, this.f43405l5, this.V3, null, this.f43381j5, false, true, this.f43431n5, z10, i10, 0, this.P3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, D8(), 0L, false, 0L, O8(), this.f43321e5);
                y6();
                if (i10 != 0) {
                    if (this.Q3 == -1) {
                        this.Q3 = 0;
                    }
                    this.Q3 = arrayList.size() + this.Q3;
                    Dc(true);
                }
            }
        }
    }

    public final void d9() {
        org.telegram.ui.Components.eu editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.s()) {
                this.f43576yc.j(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.Y5 = 0;
        this.f43282b6 = 0;
        this.Z5 = 0;
        this.f43308d6 = 0;
        this.f43322e6 = 0;
        this.f43296c6 = 0;
        jk jkVar = this.W;
        if (jkVar != null && (editField = jkVar.getEditField()) != null) {
            if (this.W.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        rm rmVar = this.f43271a9;
        if (rmVar != null) {
            rmVar.f(true);
            SparseArray sparseArray = this.f43271a9.f22738u0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        nl nlVar = this.f43336f9;
        if (nlVar != null) {
            AndroidUtilities.cancelRunOnUIThread(nlVar.H);
            nlVar.a();
        }
        jk jkVar2 = this.W;
        if (jkVar2 != null) {
            jkVar2.f23856a0 = false;
        }
        this.f43349g9 = false;
        if (this.Ya != null) {
            l9();
        }
    }

    public final boolean da(String str, org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, int i10, int i11) {
        ei.y4 y4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.f43315e == null || str == null || this.P3 != 0) {
            return false;
        }
        if (u1Var != null && (characterStyle != null || i11 != 1)) {
            y4Var = new ei.y4(this, i10, i11, characterStyle, u1Var);
        } else {
            y4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.f43315e) != null) {
                try {
                    if (Ec == null) {
                        Ec = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Fc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Ec.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.f43315e, matcher.group(2))) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.parseInt((CharSequence) parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.parseInt((CharSequence) parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.parseInt((CharSequence) queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = qh.f.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (ChatObject.isForum(this.f43315e) && i12 != d()) {
                                        return false;
                                    }
                                    this.f43481r7 = true;
                                    if (this.P3 == 2) {
                                        this.T8.S0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f43546w7 = W;
                                    if (W >= 0) {
                                        this.f43559x7 = parseInt;
                                    }
                                    Wa(parseInt, i10, true, 0, false, 0, num, g10, y4Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e7) {
                            e = e7;
                            FileLog.e(e);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Fc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.f43315e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f43323e8 = queryParameter2;
                                    O6(true);
                                    return true;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("comment")).intValue();
                    if (ChatObject.hasPublicLink(this.f43315e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.P3 == 2) {
                            this.T8.S0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Wa(intValue3, i10, true, 0, false, 0, null, null, y4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
            } else {
                try {
                    if (Gc == null) {
                        Gc = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = Gc.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f43315e.f20047id || parseInt3 == 0) {
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
                    byte[] g11 = qh.f.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.f43315e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f43266a4;
                            if (tL_forumTopic != null && tL_forumTopic.f20099id == findTopic.f20099id) {
                                return true;
                            }
                            return false;
                        }
                        this.f43481r7 = true;
                        if (this.P3 == 2) {
                            this.T8.S0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Wa(parseInt3, i10, true, 0, false, 0, num2, g11, y4Var);
                        return true;
                    }
                    return false;
                } catch (Exception e12) {
                    FileLog.e(e12);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.parseLong(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("thread")).intValue();
            long j3 = this.f43315e.f20047id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                Z9(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f43481r7 = true;
            if (this.P3 == 2) {
                this.T8.S0(intValue9);
                finishFragment();
                return true;
            }
            Wa(intValue9, i10, true, 0, false, 0, null, null, y4Var);
            return true;
        }
    }

    public final void db(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.R5, this.f43405l5, this.V3, null, this.f43381j5, z11, true, null, z10, i10, 0, this.P3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, D8(), 0L, false, 0L, O8(), this.f43321e5);
            y6();
            jk jkVar = this.W;
            if (jkVar != null) {
                jkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.Q3 == -1) {
                this.Q3 = 0;
            }
            this.Q3 = arrayList.size() + this.Q3;
            Dc(true);
        }
    }

    public final void dc() {
        qm qmVar = this.V0;
        if (qmVar != null && this.f43272aa == null) {
            if (this.f43300ca.f42614n == null || qmVar.getBackgroundImage() == null) {
                if (this.V0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.V0.V(org.telegram.ui.ActionBar.i6.r0());
                }
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j3;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.c5 c5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        nj njVar;
        jk jkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.eu editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.ry0 ry0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        jk jkVar2;
        yn ynVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            ynVar.c8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            sj sjVar = ynVar.f43526v0;
            if (sjVar != null) {
                sjVar.g1();
            }
            org.telegram.ui.Components.wi wiVar = ynVar.K9;
            if (wiVar != null) {
                wiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == ynVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        ynVar.finishFragment();
                        b.b(ynVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ai.g4 g4Var = ynVar.H1;
                if (g4Var != null && g4Var.isShowing()) {
                    ynVar.H1.dismiss(true);
                }
                if (z11 && (jkVar2 = ynVar.W) != null && jkVar2.t0()) {
                    ynVar.W.m0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f20067id = stickerSet2.f20074id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = ynVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.ry0) && (tL_messages_stickerSet = (ry0Var = (org.telegram.ui.Components.ry0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f20074id == stickerSet2.f20074id) {
                            ry0Var.D0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.yc ycVar = new org.telegram.ui.Components.yc(ry0Var.container, ynVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.rc r10 = ycVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r10.f30427j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.ry0 ry0Var2 = new org.telegram.ui.Components.ry0(ynVar.getParentActivity(), ynVar, tL_inputStickerSetID, null, ynVar.W, ynVar.f43300ca);
                            final boolean z15 = z12;
                            ynVar = this;
                            ry0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    yn.j1(yn.this, objArr, ry0Var2, z15, stickerSet2);
                                }
                            });
                            ynVar.showDialog(ry0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                sj sjVar2 = ynVar.f43526v0;
                if (sjVar2 != null) {
                    sjVar2.g1();
                }
                TextView textView = ynVar.O2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.i5 i5Var = ynVar.B2[i13];
                    if (i5Var != null) {
                        i5Var.invalidate();
                    }
                }
                ck ckVar = ynVar.G1;
                if (ckVar != null) {
                    ckVar.getListView().g1();
                }
                ai.w0 w0Var = ynVar.J3;
                if (w0Var != null) {
                    w0Var.g1();
                }
                UndoView undoView = ynVar.f43542w3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                jk jkVar3 = ynVar.W;
                if (jkVar3 != null && (editField = jkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                ai.p4[] p4VarArr = ynVar.C2;
                ai.p4 p4Var = p4VarArr[0];
                if (p4Var != null) {
                    p4Var.invalidate();
                }
                ai.p4 p4Var2 = p4VarArr[1];
                if (p4Var2 != null) {
                    p4Var2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (ynVar.X7 != null && (chat = ynVar.f43315e) != null && chat.f20047id == l4.longValue()) {
                    ynVar.X7.online_count = ((Integer) objArr[1]).intValue();
                    nj njVar2 = ynVar.Y0;
                    if (njVar2 != null) {
                        njVar2.l();
                        ynVar.Y0.m(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == ynVar.R5 && (jkVar = ynVar.W) != null) {
                    jkVar.Q1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                jk jkVar4 = ynVar.W;
                if (jkVar4 != null) {
                    jkVar4.R1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (ynVar.f43315e != null) {
                        TLRPC.Chat chat2 = ynVar.getMessagesController().getChat(Long.valueOf(ynVar.f43315e.f20047id));
                        if (chat2 != null) {
                            ynVar.f43315e = chat2;
                        }
                    } else if (ynVar.f43327f != null && (user = ynVar.getMessagesController().getUser(Long.valueOf(ynVar.f43327f.f20194id))) != null) {
                        ynVar.f43327f = user;
                    }
                    ynVar.Mc(true);
                }
                if (!ynVar.E9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (ynVar.f43315e != null && (njVar = ynVar.Y0) != null) {
                        njVar.l();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    ynVar.o();
                    ynVar.Vc(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && ynVar.f43315e != null) {
                    ynVar.x9();
                    TLRPC.Chat chat3 = ynVar.getMessagesController().getChat(Long.valueOf(ynVar.f43315e.f20047id));
                    if (chat3 != null) {
                        ynVar.f43315e = chat3;
                        ynVar.x9();
                        z10 = !ynVar.E9();
                        ynVar.gc(false);
                        jk jkVar5 = ynVar.W;
                        if (jkVar5 != null) {
                            jkVar5.a1(ynVar.currentAccount, ynVar.R5);
                        }
                        FlagSecureReason flagSecureReason = ynVar.C3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                nj njVar3 = ynVar.Y0;
                if (njVar3 != null && z10) {
                    njVar3.m(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    ynVar.Pc(true);
                }
                org.telegram.ui.ActionBar.v0 v0Var = ynVar.f43328f0;
                if (v0Var != null) {
                    if (ChatObject.isChannel(ynVar.f43315e) && !ChatObject.isMonoForum(ynVar.f43315e)) {
                        long j10 = ynVar.f43315e.linked_monoforum_id;
                        if (j10 != 0 && ChatObject.canManageMonoForum(ynVar.currentAccount, -j10)) {
                            z13 = true;
                        }
                    }
                    v0Var.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!ynVar.Ma) {
                    if (longValue == ynVar.R5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = ynVar.P3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !ynVar.isPaused && LaunchActivity.U() == ynVar && ynVar.f43307d5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                ynVar.ia(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            ynVar.ya(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(ynVar.f43315e) && !ynVar.f43315e.megagroup && (chatFull = ynVar.X7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                ynVar.f43507t6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        ynVar.w7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                ynVar.H9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                ynVar.t6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == ynVar.R5) {
                        ynVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (c5Var = ynVar.parentLayout) != null && c5Var.getFragmentStack().size() > 1) {
                    ynVar.finishFragment();
                } else {
                    ynVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == ynVar.a() && (booleanValue || ynVar.parentLayout.getLastFragment() != ynVar)) {
                    if (ynVar.parentLayout.getLastFragment() == ynVar) {
                        ynVar.finishFragment();
                    } else {
                        ynVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = ynVar.f43418m6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = ynVar.f43315e;
                    if (chat4 != null && chat4.f20047id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (ynVar.f43442o5) {
                            zh zhVar = ynVar.l4;
                            if (zhVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(zhVar);
                                ynVar.l4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            zh zhVar2 = new zh(ynVar, messageObject2, intValue3);
                            ynVar.l4 = zhVar2;
                            AndroidUtilities.runOnUIThread(zhVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = ynVar.f43315e;
                    if (chat5 != null && chat5.f20047id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = ynVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(ynVar.f43315e, ynVar.getMessagesController().getChatFull(ynVar.f43315e.f20047id)));
                            int size2 = messageObject.messageOwner.replies.recent_repliers.size();
                            int i17 = 0;
                            while (true) {
                                if (i17 >= size2) {
                                    break;
                                } else if (MessageObject.getPeerId(messageObject.messageOwner.replies.recent_repliers.get(i17)) == MessageObject.getPeerId(peer)) {
                                    messageObject.messageOwner.replies.recent_repliers.remove(i17);
                                    break;
                                } else {
                                    i17++;
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
                    int i18 = NotificationCenter.threadMessagesRead;
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && ynVar.R5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = ynVar.f43280b4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = ynVar.f43368i4;
                            ArrayList arrayList2 = ynVar.f43494s6;
                            if (intValue4 > i19) {
                                ynVar.f43368i4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= ynVar.f43368i4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        jm jmVar = ynVar.f43565y0;
                                        if (jmVar != null) {
                                            jmVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > ynVar.f43380j4) {
                                ynVar.f43380j4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= ynVar.f43380j4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        jm jmVar2 = ynVar.f43565y0;
                                        if (jmVar2 != null) {
                                            jmVar2.R(messageObject5, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        ynVar.X7(i10, objArr);
        ynVar.Y7(i10, objArr);
        ynVar.Z7(i10, objArr);
        ynVar.a8(i10, objArr);
        ynVar.b8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ai.g4 g4Var = this.H1;
        if (g4Var != null && this.visibleDialog == g4Var) {
            g4Var.f32922j0.Z(false);
            this.H1.dismissInternal();
            this.H1.f32922j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.H1 && dialog != this.Z9 && !(dialog instanceof ei.l3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e7(View view) {
        CharSequence slowModeTimer = this.W.getSlowModeTimer();
        if (slowModeTimer != null) {
            Rb(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void e8(View view) {
        f8(view, false);
    }

    public final void e9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.yc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Ea(this.f43281b5);
            Ga(this.f43281b5);
            return;
        }
        showDialog(new rg.y0((org.telegram.ui.ActionBar.n2) this, 3, true));
    }

    public final void ea(MessageObject messageObject) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = messageObject.messageOwner.peer_id;
        long j3 = peer.channel_id;
        if (j3 != 0) {
            bundle.putLong("chat_id", j3);
        } else {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                bundle.putLong("chat_id", j10);
            } else {
                long j11 = peer.user_id;
                if (j11 != 0) {
                    bundle.putLong("user_id", j11);
                }
            }
        }
        bundle.putInt("message_id", messageObject.getRealId());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new yn(bundle));
        }
    }

    public final ve eb(MessageObject messageObject, boolean z10) {
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
                getMessagesController().markMessageAsRead(this.R5, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.R5, messageObject.getId(), null, i11, 0L, z11);
            return null;
        }
        return new ve(this, messageObject, 1);
    }

    public final void ec() {
        TLRPC.User user;
        boolean z10;
        if (this.f43328f0 != null && (user = this.f43327f) != null && this.h == null && user.bot) {
            a0.i iVar = this.f43284b8;
            boolean z11 = false;
            if (iVar.m() != 0) {
                boolean z12 = false;
                z10 = false;
                for (int i10 = 0; i10 < iVar.m(); i10++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) iVar.n(i10);
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
                this.f43328f0.K(30);
            } else {
                this.f43328f0.r(30);
            }
            if (z10) {
                this.f43328f0.K(31);
            } else {
                this.f43328f0.r(31);
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.extendActionMode(android.view.Menu):boolean");
    }

    public final boolean f7() {
        CharSequence slowModeTimer = this.W.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void f8(View view, boolean z10) {
        boolean z11;
        nb(view);
        if (view != this.f43353h1) {
            z11 = true;
        } else {
            z11 = false;
        }
        g8(z10, z11, 0.2f);
    }

    public final void f9(boolean z10) {
        yb(false, null, null, false, z10);
    }

    public final void fa(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f43327f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f43327f.f20194id) {
                D(messageFwdHeader.saved_from_msg_id, messageObject.getId(), 0, 0, true, true);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = messageObject.messageOwner.fwd_from.saved_from_peer;
        long j3 = peer.channel_id;
        if (j3 != 0) {
            bundle.putLong("chat_id", j3);
        } else {
            long j10 = peer.chat_id;
            if (j10 != 0) {
                bundle.putLong("chat_id", j10);
            } else {
                long j11 = peer.user_id;
                if (j11 != 0) {
                    bundle.putLong("user_id", j11);
                }
            }
        }
        bundle.putInt("message_id", messageObject.messageOwner.fwd_from.saved_from_msg_id);
        if (getMessagesController().checkCanOpenChat(bundle, this)) {
            presentFragment(new yn(bundle));
        }
    }

    public final void fb(int r28, android.net.Uri r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.fb(int, android.net.Uri, boolean):void");
    }

    public final void fc() {
        if (this.P1 == null) {
            return;
        }
        this.P1.setSideMenuBackgroundMarginBottom(((this.Q.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.c());
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.n1 n1Var = this.O8;
        if (n1Var != null) {
            n1Var.f21417e = false;
            A7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f43315e;
    }

    public final void g7(Runnable runnable, zf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            r1 r1Var = new r1(this, aVar, runnable, 19);
            yh.u5 x10 = yh.u5.x(this.currentAccount, aVar.f53321a);
            if (!x10.f52088e) {
                x10.q(true, true, r1Var);
                return;
            } else {
                r1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void g8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        jh.h hVar;
        org.telegram.ui.Cells.u1 u1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.H8;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
            u1Var2.setInvalidatesParent(z12);
            if (z12) {
                Ma(u1Var2);
            }
        }
        this.V0.invalidate();
        this.f43526v0.invalidate();
        AnimatorSet animatorSet = this.N8;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.N8.cancel();
        }
        this.N8 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.F8, f7);
        float f10 = 1.0f;
        if (z12) {
            this.I8 = 1.0f;
            this.J8 = 0.0f;
            ValueAnimator valueAnimator = this.Yb;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.G8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.sm0.d(new cf(this, 3));
            }
        } else {
            float f11 = this.F8;
            this.J8 = f11 / max;
            this.G8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new mg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f43353h1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.N8.playTogether(arrayList);
        this.N8.setInterpolator(org.telegram.ui.Components.tr.h);
        this.N8.setDuration(320L);
        View view2 = this.H8;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            u1Var = (org.telegram.ui.Cells.u1) view2;
        } else {
            u1Var = null;
        }
        this.N8.addListener(new androidx.fragment.app.g(this, z12, u1Var, 3));
        if (this.H8 != null && this.I8 <= 0.0f) {
            nb(null);
        }
        this.N8.start();
    }

    public final void g9(boolean z10) {
        if (this.V2.getTag() != null && !this.f43279b3) {
            if (!this.f43355h3 || this.f43305d3) {
                this.V2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f43319e3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f43319e3.playTogether(ObjectAnimator.ofFloat(this.V2, View.ALPHA, 0.0f));
                    this.f43319e3.addListener(new vi(this, 6));
                    this.f43319e3.setStartDelay(this.Y2);
                    this.f43319e3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f43319e3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f43319e3 = null;
                    }
                    this.V2.setAlpha(0.0f);
                }
                this.Y2 = 500;
            }
        }
    }

    public final void ga(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        long j3;
        long j10;
        org.telegram.ui.Components.d6 animation;
        Bitmap m10;
        if (u1Var == null) {
            int childCount = this.f43526v0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f43526v0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var2.getMessageObject().equals(messageObject)) {
                        u1Var = u1Var2;
                        break;
                    }
                }
                i10++;
            }
        }
        if (messageObject.isVideo()) {
            eb(messageObject, true);
        }
        PhotoViewer.t1().K2(null, this, this.f43300ca);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (u1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = u1Var.getPhotoImage().getAnimation()) != null && this.f43521u8 != null && this.f43482r8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f43521u8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.P3;
        ml mlVar = this.Da;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f43494s6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().b2(arrayList, arrayList.indexOf(messageObject), this.R5, 0L, d(), mlVar);
        } else {
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = messageObject.type;
            long j11 = 0;
            if (i13 != 0) {
                j3 = this.R5;
            } else {
                j3 = 0;
            }
            if (i13 != 0) {
                j10 = this.J6;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = d();
            }
            t12.d2(messageObject, this, j3, j10, j11, mlVar);
        }
        i9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void gb(MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages Y8 = Y8(messageObject);
        boolean z12 = false;
        if (Y8 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < Y8.messages.size()) {
                    if (this.U5[i10].indexOfKey(Y8.messages.get(i11).getId()) < 0) {
                        break;
                    }
                    i11++;
                } else {
                    Y8 = null;
                    break;
                }
            }
        }
        if (Y8 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        u1Var.setDrawSelectionBackground(z11);
        if (Y8 == null) {
            z12 = true;
        }
        u1Var.L3(true, z12, z10);
    }

    public final void gc(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.gc(boolean):void");
    }

    @Override
    public final org.telegram.ui.ActionBar.y4 getBackButtonState() {
        return org.telegram.ui.ActionBar.y4.f21724a;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21740c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.P3 == 0 && (call = this.U7) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.P3 == 2) {
            ArrayList arrayList = this.f43494s6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + B8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f43300ca;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        if (this.f43297c7) {
            return null;
        }
        if (this.Y9) {
            this.Y9 = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Qd));
        if (!z9()) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.i6.f21164v8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.i6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.i6.f21216y8;
            arrayList.add(new org.telegram.ui.ActionBar.k6(kVar, 64, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21235z8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 128, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1024, null, null, null, null, i11));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.i6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.i6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.i6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 32768, null, null, null, null, org.telegram.ui.ActionBar.i6.f21109s8));
        nj njVar = this.Y0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(njVar != null ? njVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.A8));
        nj njVar2 = this.Y0;
        org.telegram.ui.ActionBar.i5 titleTextView = njVar2 != null ? njVar2.getTitleTextView() : null;
        int i12 = org.telegram.ui.ActionBar.i6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(titleTextView, 8, null, null, null, null, i12));
        nj njVar3 = this.Y0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(njVar3 != null ? njVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.i6.f20805c2, org.telegram.ui.ActionBar.i6.f20823d2}, org.telegram.ui.ActionBar.i6.f21052pa));
        nj njVar4 = this.Y0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(njVar4 != null ? njVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.i6.f21128t8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.i6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.i6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar2, 67108864, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 67108864, null, null, null, null, i13));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.i6.f21216y8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(kVar3, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.i6.f21182w8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.i6.f21199x8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.i6.f21235z8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Z0, 4, null, null, null, null, i14));
        nj njVar5 = this.Y0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(njVar5 != null ? njVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20954k4}, null, org.telegram.ui.ActionBar.i6.f21035oc));
        nj njVar6 = this.Y0;
        arrayList.add(new org.telegram.ui.ActionBar.k6(njVar6 != null ? njVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.l4}, null, org.telegram.ui.ActionBar.i6.f21054pc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.f21081r0, null, org.telegram.ui.ActionBar.i6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20920i8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20938j8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20958k8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20976l8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20995m8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21015n8));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21032o8));
        org.telegram.ui.ActionBar.e5 e5Var = (org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.e5 e5Var2 = (org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.e5 e5Var3 = (org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.e5 e5Var4 = (org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.e5 e5Var5 = (org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.e5 e5Var6 = (org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{e5Var, e5Var2}, null, org.telegram.ui.ActionBar.i6.f21091ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.e5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.i6.f20833dc));
        if (e5Var != null) {
            Drawable[] k10 = e5Var.k();
            int i15 = org.telegram.ui.ActionBar.i6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, e5Var2.k(), null, i15));
            Drawable[] k11 = e5Var3.k();
            int i16 = org.telegram.ui.ActionBar.i6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, e5Var4.k(), null, i16));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{e5Var3, e5Var4}, null, org.telegram.ui.ActionBar.i6.Aa));
        if (this.f43300ca.h(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{e5Var3, e5Var4}, null, org.telegram.ui.ActionBar.i6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{e5Var3, e5Var4}, null, org.telegram.ui.ActionBar.i6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{e5Var3, e5Var4}, null, org.telegram.ui.ActionBar.i6.Fa));
        }
        sj sjVar = this.f43526v0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = e5Var5;
        drawableArr[i10] = e5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(sjVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.i6.Ba));
        sj sjVar2 = this.f43526v0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = e5Var5;
        drawableArr2[i10] = e5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(sjVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.i6.f20796bc));
        sj sjVar3 = this.f43526v0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.w0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i17 = org.telegram.ui.ActionBar.i6.f20924ic;
        arrayList.add(new org.telegram.ui.ActionBar.k6(sjVar3, 4, clsArr3, themedPaint, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 2, new Class[]{org.telegram.ui.Cells.w0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.i6.f20942jc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f21178w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.i6.f20962kc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20980lc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20999mc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.i6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20869fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 2, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.i6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.i6.f20905hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.i6.f20897h3};
        int i18 = org.telegram.ui.ActionBar.i6.f20963kd;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr3, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.i6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.i6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.i6.La));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.i6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21073qc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21093rc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.F3, org.telegram.ui.ActionBar.i6.G3}, null, org.telegram.ui.ActionBar.i6.f21113sc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21131tc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.i6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.i6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.M3, org.telegram.ui.ActionBar.i6.Q3, org.telegram.ui.ActionBar.i6.U3}, null, org.telegram.ui.ActionBar.i6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.N3, org.telegram.ui.ActionBar.i6.R3, org.telegram.ui.ActionBar.i6.V3}, null, org.telegram.ui.ActionBar.i6.f21220yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20768a4, org.telegram.ui.ActionBar.i6.f20788b4, org.telegram.ui.ActionBar.i6.Z3}, null, org.telegram.ui.ActionBar.i6.f21239zc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.i6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.i6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20807c4}, null, org.telegram.ui.ActionBar.i6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20825d4}, null, org.telegram.ui.ActionBar.i6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20880g4}, null, org.telegram.ui.ActionBar.i6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i19 = org.telegram.ui.ActionBar.i6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr4, null, i19));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.i6.f20898h4, org.telegram.ui.ActionBar.i6.B4, org.telegram.ui.ActionBar.i6.D4};
        int i20 = org.telegram.ui.ActionBar.i6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr5, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.G4, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.i6.H4, null, org.telegram.ui.ActionBar.i6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.O4}, null, org.telegram.ui.ActionBar.i6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.P4}, null, org.telegram.ui.ActionBar.i6.f21088r7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.Q4}, null, org.telegram.ui.ActionBar.i6.f21071qa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.f20786b2, null, null, org.telegram.ui.ActionBar.i6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20934j4}, null, org.telegram.ui.ActionBar.i6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, eVar, org.telegram.ui.ActionBar.i6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.J2, null, null, org.telegram.ui.ActionBar.i6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.K2, null, null, org.telegram.ui.ActionBar.i6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.T1, null, null, org.telegram.ui.ActionBar.i6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.i6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.i6.wc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Rc));
        int i21 = org.telegram.ui.ActionBar.i6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.i6.f20775ab;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20832db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20851eb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20777ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20868fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.bd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20815cd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20887gb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20834dd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20904hb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20852ed));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20923ib));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20870fd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20888gd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20941jb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20961kb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20906hd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20925id));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21072qb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20943jd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21092rb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21018nd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21112sb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21036od));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20981ld));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21000md));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21034ob));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21053pb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21055pd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21074qd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20979lb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20998mb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21094rd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21130tb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21114sd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21149ub));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21132td));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21166vb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21151ud));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21185wb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21186wd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21219yb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21203xd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21168vd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21238zb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21202xb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21221yd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21240zd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.U1, null, null, org.telegram.ui.ActionBar.i6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.V1, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.i6.W1, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20926ie));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21150uc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20944je));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21167vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.i6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.i6.f21095re));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.i6.f21115se));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.i6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.i6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21056pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.i6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.i6.f21075qe));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.i6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20850ea));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20867fa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20886ga));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.i6.ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.i6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.i6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.i6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.i6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.i6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.i6.Ra));
        if (!this.f43300ca.h(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.i6.f21081r0, null, org.telegram.ui.ActionBar.i6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.f21174w0, null, null, org.telegram.ui.ActionBar.i6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Paint[]{org.telegram.ui.ActionBar.i6.B0[0], org.telegram.ui.ActionBar.i6.B0[1], org.telegram.ui.ActionBar.i6.D0}, null, null, org.telegram.ui.ActionBar.i6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Paint[]{org.telegram.ui.ActionBar.i6.C0[0], org.telegram.ui.ActionBar.i6.C0[1], org.telegram.ui.ActionBar.i6.E0}, null, null, org.telegram.ui.ActionBar.i6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20766a1}, null, org.telegram.ui.ActionBar.i6.f20773a9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20877g1, org.telegram.ui.ActionBar.i6.f20895h1}, null, org.telegram.ui.ActionBar.i6.f20939j9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.F0[1], null, null, org.telegram.ui.ActionBar.i6.f20921i9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.G0, null, null, org.telegram.ui.ActionBar.i6.f20996m9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20959k9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.o9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.i6.H0, null, null, org.telegram.ui.ActionBar.i6.f21051p9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.i6.I0, null, null, org.telegram.ui.ActionBar.i6.f21070q9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.T0}, null, org.telegram.ui.ActionBar.i6.f21147u9));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.J3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.V0, org.telegram.ui.ActionBar.i6.W0}, null, org.telegram.ui.ActionBar.i6.v9));
        }
        ck ckVar = this.G1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i23 = org.telegram.ui.ActionBar.i6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.k6(ckVar, 0, null, themedPaint2, null, null, i23));
        ck ckVar2 = this.G1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.i6.f20915i3};
        int i24 = org.telegram.ui.ActionBar.i6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.k6(ckVar2, 0, null, null, drawableArr10, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.j3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.P2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.P2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20915i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.P, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.P, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20915i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20915i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.i6.Xk));
        int i25 = org.telegram.ui.ActionBar.i6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i25));
        int i26 = org.telegram.ui.ActionBar.i6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.i6.f20918i6;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i26));
        int i28 = org.telegram.ui.ActionBar.i6.f20945jf;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i25));
        int i29 = org.telegram.ui.ActionBar.i6.f20798bf;
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20778ae));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.i6.f20797be));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.i6.f20965kf));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21019nf));
        jk jkVar = this.W;
        int i30 = org.telegram.ui.ActionBar.i6.f21002mf;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.i6.f21038of));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.i6.f20817cf));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.i6.f20779af));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20871ff));
        jk jkVar2 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar2 != null ? jkVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.He));
        jk jkVar3 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar3 != null ? jkVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Ke));
        jk jkVar4 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar4 != null ? jkVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Le));
        jk jkVar5 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar5 != null ? jkVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Me));
        jk jkVar6 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar6 != null ? jkVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Oe));
        jk jkVar7 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar7 != null ? jkVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Pe));
        jk jkVar8 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar8 != null ? jkVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Re));
        jk jkVar9 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar9 != null ? jkVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Se));
        jk jkVar10 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar10 != null ? jkVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.We));
        jk jkVar11 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar11 != null ? jkVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Ne));
        jk jkVar12 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar12 != null ? jkVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Je));
        jk jkVar13 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar13 != null ? jkVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Ue));
        jk jkVar14 = this.W;
        arrayList.add(new org.telegram.ui.ActionBar.k6(jkVar14 != null ? jkVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.nz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.i6.Qe));
        jk jkVar15 = this.W;
        if (jkVar15 != null) {
            org.telegram.ui.Components.p51 trendingStickersAlert = jkVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, new Drawable[]{this.W.getStickersArrowDrawable()}, null, i26));
        }
        int i31 = 0;
        while (i31 < 2) {
            View view = i31 == 0 ? this.f43542w3 : this.f43555x3;
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 32, null, null, null, null, org.telegram.ui.ActionBar.i6.Fi));
            int i32 = org.telegram.ui.ActionBar.i6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i32));
            int i33 = org.telegram.ui.ActionBar.i6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 2, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.k6(view, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i33));
            i31++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.i6.f21163v7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.i6.f21181w7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.f21145u7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.f21127t7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.i6.f21198x7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.i6.f21215y7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43554x2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20853ee));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43554x2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20827d6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.D2, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.fe));
        for (int i34 = 0; i34 < 2; i34++) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.A2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.i6.fe));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.B2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20889ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.N2, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.fe));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.O2, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f20889ge));
        ImageView imageView = this.H2;
        int i35 = org.telegram.ui.ActionBar.i6.f20835de;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.J2, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.S1, 8, null, null, null, null, i35));
        TextView textView = this.J1;
        int i36 = org.telegram.ui.ActionBar.i6.f20907he;
        arrayList.add(new org.telegram.ui.ActionBar.k6(textView, 4, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L1, 262148, null, null, null, null, org.telegram.ui.ActionBar.i6.f21068q7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.L1, 262148, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.F1, 8, null, null, null, null, org.telegram.ui.ActionBar.i6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f21169ve));
        ImageView imageView2 = this.Q2;
        int i37 = org.telegram.ui.ActionBar.i6.f21204xe;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView2, 8, null, null, null, null, i37));
        ImageView imageView3 = this.Q2;
        int i38 = org.telegram.ui.ActionBar.i6.f21235z8;
        arrayList.add(new org.telegram.ui.ActionBar.k6(imageView3, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R2, 8, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.R2, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.C0, 4, null, null, null, null, org.telegram.ui.ActionBar.i6.f21241ze));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43577z0, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43577z0, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21134tf));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43577z0, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.E0, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Sh));
        org.telegram.ui.Components.io ioVar = this.W0;
        int i39 = org.telegram.ui.ActionBar.i6.f20924ic;
        arrayList.add(new org.telegram.ui.ActionBar.k6(ioVar, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Z1, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43426n0, 2048, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.i6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.i6.De));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43526v0, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.i6.Ee));
        ci.r6 r6Var = this.O;
        int i40 = org.telegram.ui.ActionBar.i6.f20980lc;
        arrayList.add(new org.telegram.ui.ActionBar.k6(r6Var, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.Z1, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.W0, 536870912, null, null, null, null, i40));
        if (this.G1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.i6.Ce));
            int i41 = org.telegram.ui.ActionBar.i6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"nameTextView"}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.i6.A6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.i6.f20991m4, org.telegram.ui.ActionBar.i6.f21011n4, org.telegram.ui.ActionBar.i6.f21028o4}, null, org.telegram.ui.ActionBar.i6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.i6.f21233z6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.i6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20925id));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20943jd));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.G1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.i6.f20828d7));
        }
        org.telegram.ui.Components.m40 m40Var = this.f43292c2;
        int i42 = org.telegram.ui.ActionBar.i6.f21076qf;
        arrayList.add(new org.telegram.ui.ActionBar.k6(m40Var, 32, null, null, null, null, i42));
        org.telegram.ui.Components.m40 m40Var2 = this.f43292c2;
        int i43 = org.telegram.ui.ActionBar.i6.f21057pf;
        arrayList.add(new org.telegram.ui.ActionBar.k6(m40Var2, 4, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43476r2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43476r2, 8, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"imageView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43476r2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43490s2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.f43490s2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.V2, 0, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.X2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.k6(this.X2, 0, null, null, null, null, i40));
        int i44 = org.telegram.ui.ActionBar.i6.f20922ia;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20940ja));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20960ka));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20978la));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20997ma));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f21017na));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f21033oa));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.i6.R4}, null, org.telegram.ui.ActionBar.i6.f20831da));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20899h5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f20917i5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f21067q5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20956k6));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21153uf));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f21170vf));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20781ah));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20800bh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20819ch));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20838dh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20855eh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20873fh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20928ih));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20947jh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20967kh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20892gh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20909hh));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.f20771a7));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.i6.Dj));
        int i45 = org.telegram.ui.ActionBar.i6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.k6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.i6.f21205xf));
        jk jkVar16 = this.W;
        if (jkVar16 != null && jkVar16.m0 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.W.m0.f9497c, 4, new Class[]{ei.b0.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.i6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.k6(this.W.m0.f9497c, 4, new Class[]{ei.b0.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.i6.f21214y6));
        }
        wh.d dVar = this.f43312da;
        if (dVar != null) {
            dVar.b(arrayList);
        }
        int size = arrayList.size();
        int i46 = 0;
        while (i46 < size) {
            Object obj = arrayList.get(i46);
            i46++;
            ((org.telegram.ui.ActionBar.k6) obj).f21354o = this.f43300ca;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f43300ca.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint H = this.f43300ca.H(str);
        if (H != null) {
            return H;
        }
        return org.telegram.ui.ActionBar.i6.S0(str);
    }

    public final void h7() {
        if (this.f43555x3 != null) {
            return;
        }
        fl flVar = new fl(this, getParentActivity(), this, this.f43300ca);
        this.f43555x3 = flVar;
        this.V0.addView(flVar, 17, w7.z5.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void h8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void h9(boolean z10) {
        if (this.W2.getTag() != null && !this.f43293c3) {
            if (!this.f43367i3 || this.f43305d3) {
                this.W2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43343g3, 0.0f);
                    this.f43331f3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f43331f3.addUpdateListener(new oe(this, 1));
                    this.f43331f3.addListener(new vi(this, 8));
                    this.f43331f3.setStartDelay(this.Y2);
                    this.f43331f3.start();
                } else {
                    ValueAnimator valueAnimator = this.f43331f3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f43331f3 = null;
                    }
                    this.f43343g3 = 0.0f;
                    kc();
                }
                this.Y2 = 500;
            }
        }
    }

    public final void ha(boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var;
        int i10;
        if (getParentActivity() != null && (c5Var = this.parentLayout) != null && c5Var.getLastFragment() == this && !this.F4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f43315e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f20047id);
            } else {
                bundle.putLong("user_id", this.f43327f.f20194id);
            }
            bundle.putInt("chatMode", 2);
            yn ynVar = new yn(bundle);
            ynVar.F4 = new ArrayList(this.F4);
            ynVar.H4 = new HashMap(this.H4);
            int size = this.F4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.F4.get(i11);
                MessageObject messageObject = (MessageObject) this.H4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f43418m6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    ynVar.H4.put(num, messageObject);
                    ynVar.yc();
                }
            }
            ynVar.N4 = this.N4;
            if (this.f43332f4) {
                i10 = this.F4.size();
            } else {
                i10 = this.O4;
            }
            ynVar.O4 = i10;
            ynVar.Q4 = this.Q4;
            ynVar.Y7 = this.Y7;
            ynVar.X7 = this.X7;
            ynVar.T8 = new jl(this, ynVar);
            if (z10) {
                presentFragmentAsPreview(ynVar);
                d7();
                return;
            }
            presentFragment(ynVar, false);
        }
    }

    public final void hb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f43300ca != null && this.f43272aa == null) {
            fg.b c10 = fg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.R5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.c4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.c4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.c4 c4Var = theme;
                wn wnVar = this.f43300ca;
                TLRPC.WallPaper wallPaper = wnVar.h;
                if (this.N5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wnVar.i(c4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new re(this, 16));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.R5);
            wn wnVar2 = this.f43300ca;
            org.telegram.ui.ActionBar.c4 c4Var2 = wnVar2.f42613f;
            if (this.N5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            wnVar2.i(c4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void hc() {
        gc(false);
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.V3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.f43315e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f43327f;
    }

    public final void i7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.Eb > 1000) {
            z10 = true;
        }
        ug ugVar = this.Fb;
        AndroidUtilities.cancelRunOnUIThread(ugVar);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        AndroidUtilities.runOnUIThread(ugVar, j3);
    }

    public final void i8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.f43431n5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void i9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.m40 m40Var = this.f43391k2;
            if (m40Var != null) {
                m40Var.b(true);
            }
            gj gjVar = this.f43318e2;
            if (gjVar != null) {
                gjVar.b(true);
            }
            org.telegram.ui.Components.m40 m40Var2 = this.f43342g2;
            if (m40Var2 != null) {
                m40Var2.b(true);
            }
        }
        org.telegram.ui.Components.m40 m40Var3 = this.f43379j2;
        if (m40Var3 != null) {
            m40Var3.b(true);
        }
        org.telegram.ui.Components.m40 m40Var4 = this.f43366i2;
        if (m40Var4 != null) {
            m40Var4.b(true);
        }
        org.telegram.ui.Components.m40 m40Var5 = this.f43476r2;
        if (m40Var5 != null) {
            m40Var5.b(true);
        }
        org.telegram.ui.Components.m40 m40Var6 = this.f43490s2;
        if (m40Var6 != null) {
            m40Var6.b(true);
        }
        org.telegram.ui.Components.m40 m40Var7 = this.f43403l2;
        if (m40Var7 != null) {
            m40Var7.b(true);
        }
        org.telegram.ui.Components.m40 m40Var8 = this.f43414m2;
        if (m40Var8 != null) {
            m40Var8.b(true);
        }
        org.telegram.ui.Components.tp tpVar = this.f43503t2;
        if (tpVar != null) {
            tpVar.a();
        }
        ci.e4 e4Var = this.H0;
        if (e4Var != null) {
            e4Var.e(true);
        }
        ci.e4 e4Var2 = this.J0;
        if (e4Var2 != null) {
            e4Var2.e(true);
        }
        ci.e4 e4Var3 = this.I0;
        if (e4Var3 != null) {
            e4Var3.e(true);
        }
    }

    public final void ia(int i10, boolean z10) {
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && c5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f20055id);
            } else {
                TLRPC.Chat chat = this.f43315e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f20047id);
                } else {
                    bundle.putLong("user_id", this.f43327f.f20194id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            yn ynVar = new yn(bundle);
            if (this.f43332f4) {
                ng.d.a(ynVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            ynVar.T8 = new oj(this);
            presentFragment(ynVar, false);
        }
    }

    public final void ib(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                ib(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f43526v0 && view != this.V0) {
            view.setEnabled(z10);
        }
    }

    public final void ic() {
        int i10;
        org.telegram.ui.Components.vb vbVar;
        wk wkVar;
        jk jkVar;
        if (this.B9 && this.f43526v0 != null) {
            float f7 = 0.0f;
            if (this.f43436na <= 0 || this.Ba != 0.0f) {
                float W8 = W8(AndroidUtilities.dp(7.0f));
                vk vkVar = this.f43413m1;
                if (vkVar != null) {
                    i10 = AndroidUtilities.dp(vkVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float A8 = (A8() * AndroidUtilities.dp(43.0f)) + W8 + i10;
                float f10 = this.f43469q9;
                this.f43483r9 = A8;
                this.f43469q9 = X8(org.telegram.ui.Components.s31.f30677a) + AndroidUtilities.dp(4.0f) + this.f43510t9 + A8;
                if (this.actionBar.getVisibility() == 0 || this.f43286ba != null) {
                    this.f43469q9 += this.actionBar.getMeasuredHeight();
                }
                this.f43497s9 = 0;
                this.f43469q9 = this.f43469q9 + this.f43562xa + this.f43522u9;
                if (this.Ba != 0.0f && (jkVar = this.W) != null && jkVar.getVisibility() == 0) {
                    float f11 = this.f43469q9;
                    float measuredHeight = this.Ba * (this.W.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f43469q9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.w0 w0Var = this.X2;
                if (w0Var != null) {
                    w0Var.setTranslationY(((this.f43526v0.getTranslationY() + this.f43469q9) + this.f43573y9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f43469q9;
                    float f13 = this.f43573y9;
                    this.f43469q9 = f12 + f13;
                    this.f43497s9 = (int) (this.f43497s9 + f13);
                }
                ak akVar = this.V2;
                if (akVar != null) {
                    akVar.setTranslationY((((this.f43526v0.getTranslationY() - f7) + this.f43469q9) + this.f43548w9) - AndroidUtilities.dp(4.0f));
                }
                kc();
                sj sjVar = this.f43526v0;
                if (sjVar != null && this.f43552x0 != null && this.f43565y0 != null) {
                    int paddingTop = sjVar.getPaddingTop();
                    int paddingBottom = this.f43526v0.getPaddingBottom();
                    n7();
                    if (this.f43526v0.getPaddingTop() != paddingTop || this.f43526v0.getPaddingBottom() != paddingBottom) {
                        q9();
                    }
                    this.f43526v0.setTopGlowOffset((int) ((this.f43469q9 - this.f43497s9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f43469q9) {
                        int childCount = this.f43526v0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f43526v0.getChildAt(i11);
                            this.f43526v0.getClass();
                            if (RecyclerView.R(childAt) == this.f43565y0.h() - 1) {
                                float f14 = this.f43469q9;
                                if (childAt.getTop() > f14) {
                                    this.f43526v0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!E9() && !this.B4 && this.H7 != null && this.f43526v0 != null && ((wkVar = this.N1) == null || wkVar.getVisibility() != 0)) {
                        this.f43526v0.scrollBy(0, (int) (f10 - this.f43469q9));
                    }
                }
                this.B9 = false;
                org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30419w;
                if (rcVar != null && (vbVar = rcVar.f30423e) != null) {
                    vbVar.updatePosition();
                }
                n7();
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int w02;
        if (z9()) {
            org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w02 = resourceProvider.j0(org.telegram.ui.ActionBar.i6.f21182w8);
            } else {
                w02 = org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f21182w8, true);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.i6.I.q();
        } else {
            z10 = this.Ab;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.P3 != 5 || (!this.f43494s6.isEmpty() && this.f43280b4 != 0)) && !this.f43537vc.f15437f && this.f43409l9) {
            el elVar = this.Ca;
            if (elVar == null || !elVar.f27463s) {
                uh.i iVar = this.V9;
                if (iVar == null || !iVar.a()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void j7() {
        int X8 = (int) (X8(org.telegram.ui.Components.s31.f30679c) + this.Q.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.V.setFadeZoneBottom(X8);
        int b10 = w7.q.b(AndroidUtilities.dp(36.0f) + (this.V0.getMeasuredHeight() - X8), 0, this.V0.getMeasuredHeight());
        int measuredWidth = this.V0.getMeasuredWidth();
        Rect rect = Jc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.f43562xa, this.f43526v0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f43526v0.getMeasuredHeight() - this.f43574ya) - X8));
    }

    public final void j8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f43321e5;
        if (messageSuggestionParams != null) {
            Cb(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.E5;
        if (webPage != null) {
            Db(true, webPage, false);
            return;
        }
        on onVar = this.f43381j5;
        if (onVar != null) {
            Bb(this.f43405l5, onVar);
            return;
        }
        MessageObject messageObject = this.f43405l5;
        if (messageObject != null && messageObject != this.V3) {
            Ab(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f43307d5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            zb(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.f43431n5;
        if (messageObject2 != null) {
            xb(true, null, messageObject2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Db(false, null, true);
        }
    }

    public final void j9() {
        ValueAnimator valueAnimator = this.f43313db;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.w0 w0Var = this.X2;
        if (w0Var != null && w0Var.getTag() != null) {
            this.X2.setTag(null);
            org.telegram.ui.Cells.w0 w0Var2 = this.X2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new lf(this, w0Var2, 1));
            ofFloat.addListener(new ai.z(13, this, w0Var2));
            ofFloat.setDuration(150L);
            this.f43313db = ofFloat;
            ofFloat.start();
        }
    }

    public final void ja(TLRPC.Chat chat) {
        boolean z10;
        ci.e4 e4Var = this.f43502t1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.e4 e4Var2 = this.f43514u1;
        if (e4Var2 != null && e4Var2.V) {
            e4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new oh(1, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21286n0) {
            this.wc.a(true, true);
            org.telegram.ui.ActionBar.v0 v0Var = this.f43328f0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43290c0;
            if (yVar != null) {
                yVar.f(8);
            }
            fs fsVar = this.f43276b0;
            if (fsVar != null) {
                fsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f43340g0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = this.f43352h0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = this.f43389k0;
            if (v0Var3 != null && this.I9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f43402l0;
            if (yVar3 != null && this.J9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = this.f43364i0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            this.m0 = true;
            Ec(0, 0, -1);
            gc(false);
            ImageView imageView = this.Q2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.R2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = this.f43352h0;
        if (v0Var5 != null) {
            this.f43274ac = true;
            this.U4 = false;
            v0Var5.z(false);
            this.f43274ac = false;
        }
        Ya(chat, null);
        xc(0, true);
    }

    public final void jb(boolean z10) {
        kb(z10, false, true);
    }

    public final void jc(boolean z10) {
        a0.i iVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.Wa == null) {
            this.Wa = new a0.i();
        }
        a0.i iVar2 = this.Va;
        if (iVar2 == null) {
            this.Va = new a0.i();
        } else {
            iVar2.b();
        }
        this.f43565y0.P.clear();
        this.Wa.b();
        a0.i iVar3 = null;
        a0.i iVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            iVar = this.f43532v6;
            arrayList = this.f43494s6;
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
                if (this.f43565y0.N && messageObject2.stableId != 0) {
                    messageObject.copyStableParams(messageObject2);
                } else {
                    messageObject2.copyStableParams(messageObject);
                }
            } else if (messageObject2.stableId == 0) {
                int i12 = Dc;
                Dc = i12 + 1;
                messageObject2.stableId = i12;
            }
            messageObject2.isOutOwnerCached = null;
            TLRPC.Message message2 = messageObject2.messageOwner;
            if (message2 != null) {
                message2.out = true;
            }
            messageObject2.isOutOwner();
            if (messageObject2.hasValidGroupId()) {
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupIdForUse());
                if (groupedMessages2 == null) {
                    groupedMessages2 = new MessageObject.GroupedMessages();
                    groupedMessages2.reversed = this.Na;
                    long groupId = messageObject2.getGroupId();
                    groupedMessages2.groupId = groupId;
                    iVar.k(groupedMessages2, groupId);
                } else if (iVar3 == null || iVar3.h(messageObject2.getGroupId()) < 0) {
                    if (iVar4 == null) {
                        iVar4 = new a0.i();
                    }
                    iVar4.k(groupedMessages2, messageObject2.getGroupId());
                }
                if (iVar3 == null) {
                    iVar3 = new a0.i();
                }
                iVar3.k(groupedMessages2, groupedMessages2.groupId);
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
            this.f43565y0.P.add(messageObject2);
            this.Wa.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (iVar3 != null) {
            for (int i14 = 0; i14 < iVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) iVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new ff(0));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f43440o3 != null && TextUtils.isEmpty(this.f43477r3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f43440o3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
            if (!this.Wa.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.f43565y0.P.add(messageObject4);
                this.Wa.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.f43565y0.P.size()) {
            MessageObject messageObject5 = (MessageObject) this.f43565y0.P.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.Wa.d(messageObject6.getId())) {
                        this.f43565y0.P.add(i18, messageObject6);
                        this.Wa.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.f43565y0.P, new ff(1));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.f43565y0.P.size()) {
            MessageObject messageObject8 = (MessageObject) this.f43565y0.P.get(i19);
            if (this.Na && messageObject8 != null && i19 == 0) {
                Ca(messageObject8, i19);
                i19++;
            }
            if (!this.Na && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ca(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.Va.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.q.j(messageObject8.dateKeyInt, this.Va);
            }
            arrayList4.add(messageObject8);
            if (this.Na && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ca(messageObject8, i19);
                i19++;
            }
            if (!this.Na && i19 >= this.f43565y0.P.size() - 1) {
                Ca(messageObject8, this.f43565y0.P.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.f43565y0.O = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.f43565y0.T();
            this.f43565y0.O(true);
            if (this.f43565y0.N ? !getMediaDataController().isSearchLoading() || !this.f43565y0.P.isEmpty() : !this.E6 || !arrayList.isEmpty() || this.f43565y0.f37735w >= 0) {
                z11 = false;
            }
            Ob(z11);
            if (this.f43526v0 != null) {
                G7(false);
                if (this.f43565y0.N ? !(getMediaDataController().isSearchLoading() || !this.f43565y0.P.isEmpty()) : !(this.E6 || !arrayList.isEmpty() || this.f43565y0.f37735w >= 0)) {
                    this.f43526v0.setEmptyView(this.O0);
                    sj sjVar = this.f43526v0;
                    sjVar.L0(sjVar.v1());
                    return;
                }
                this.O0.setVisibility(8);
                this.f43526v0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        String str2 = null;
        l8(str, null);
        if (f7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.R5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = D8();
                of2.invert_media = z11;
                of2.payStars = j10;
                of2.monoForumPeer = O8();
                of2.suggestionParams = this.f43321e5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.R5, false, false, true, 0, 0, null, -1, j10, O8(), this.f43321e5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.R5, this.f43405l5, this.V3, null, this.f43381j5, this.f43431n5, z10, i10, 0, null, D8(), j3, z11, j10, O8(), this.f43321e5);
            y6();
        }
    }

    public final void k7() {
        int i10;
        if (this.Y0 != null) {
            float actionModeFactor = (1.0f - this.wc.f15436e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.Y0.setScaleX(lerp);
            this.Y0.setScaleY(lerp);
            this.Y0.setAlpha(actionModeFactor);
            nj njVar = this.Y0;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            njVar.setVisibility(i10);
        }
    }

    public final boolean k9(boolean z10) {
        gl glVar;
        gl glVar2 = this.f43528v2;
        if (glVar2 == null || glVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.eh ehVar = this.K0;
        if (ehVar != null && (glVar = this.f43528v2) != null) {
            ehVar.i(glVar, false, z10);
        }
        int i10 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.F2;
            if (i10 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i10] = null;
                }
                i10++;
            } else {
                this.f43567y2 = false;
                this.f43528v2.setTag(1);
                return true;
            }
        }
    }

    public final void ka(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.v0 v0Var;
        int i11;
        ci.e4 e4Var = this.f43502t1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.e4 e4Var2 = this.f43514u1;
        if (e4Var2 != null && e4Var2.V) {
            e4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ue(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21286n0) {
            this.wc.a(true, true);
            org.telegram.ui.ActionBar.v0 v0Var2 = this.f43328f0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43290c0;
            if (yVar != null) {
                yVar.f(8);
            }
            fs fsVar = this.f43276b0;
            if (fsVar != null) {
                fsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f43340g0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            if ((this.f43280b4 == 0 || (i11 = this.P3) == 3 || i11 == 8) && (v0Var = this.f43352h0) != null) {
                v0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = this.f43389k0;
            if (v0Var3 != null && this.I9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f43402l0;
            if (yVar3 != null && this.J9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = this.f43364i0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            this.m0 = true;
            Ec(0, 0, -1);
            gc(false);
        }
        if ((this.f43280b4 == 0 || this.f43332f4 || (i10 = this.P3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f43327f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.U4 = z11;
            org.telegram.ui.ActionBar.v0 v0Var5 = this.f43352h0;
            if (v0Var5 != null) {
                v0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var6 = this.f43352h0;
        if (v0Var6 != null) {
            v0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f43477r3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.R5, this.J6, this.classGuid, 0, this.f43280b4, false, this.f43415m3, this.f43429n3, !TextUtils.isEmpty(str), this.f43440o3);
        xc(0, true);
    }

    public final void kb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.kb(boolean, boolean, boolean):void");
    }

    public final void kc() {
        int i10;
        zj zjVar = this.W2;
        if (zjVar == null) {
            return;
        }
        zjVar.setTranslationX(S8() / 2.0f);
        this.W2.setTranslationY((((this.f43526v0.getTranslationY() + this.f43469q9) + this.f43561x9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f43561x9, -this.W2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.W2.setAlpha(this.f43343g3 * clamp);
        zj zjVar2 = this.W2;
        if (this.f43343g3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        zjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.W2.setScaleX(lerp);
        this.W2.setScaleY(lerp);
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        l8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.R5, this.f43405l5, this.V3, null, this.f43381j5, true, false, this.f43431n5, z10, i10, 0, this.P3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, D8(), 0L, false, j3, O8(), this.f43321e5);
        y6();
        if (i10 != 0) {
            if (this.Q3 == -1) {
                this.Q3 = 0;
            }
            this.Q3 = arrayList.size() + this.Q3;
            Dc(true);
        }
    }

    public final void l7() {
        boolean z10;
        ci.i1 i1Var;
        if (this.f43286ba != null) {
            return;
        }
        int i10 = 0;
        if (this.f43537vc.f15436e >= 1.0f && ((i1Var = this.f43438o1) == null || i1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ci.ab abVar = this.V0.L;
        if (!z10) {
            i10 = 4;
        }
        abVar.setVisibility(i10);
    }

    public final void l8(CharSequence charSequence, ArrayList arrayList) {
        if (this.f43431n5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.f43431n5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.f43431n5.isMediaEmpty()) {
                MessageObject messageObject2 = this.f43431n5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                jk jkVar = this.W;
                if (jkVar != null) {
                    this.f43431n5.editingMessage = jkVar.getFieldText();
                    MessageObject messageObject3 = this.f43431n5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.f43431n5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final void l9() {
        al alVar = this.Ya;
        if (alVar == null) {
            return;
        }
        this.Ya = null;
        alVar.e();
        if (alVar.getReactionsWindow() != null && alVar.getReactionsWindow().f53550a != null) {
            alVar.getReactionsWindow().f53550a.animate().alpha(0.0f).setDuration(180L).start();
        }
        alVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new oh(7, this, alVar)).setDuration(180L).start();
    }

    public final void la(TLRPC.User user) {
        boolean z10;
        ci.e4 e4Var = this.f43502t1;
        if (e4Var != null && e4Var.V) {
            e4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.e4 e4Var2 = this.f43514u1;
        if (e4Var2 != null && e4Var2.V) {
            e4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new sg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21286n0) {
            this.wc.a(true, true);
            org.telegram.ui.ActionBar.v0 v0Var = this.f43328f0;
            if (v0Var != null) {
                v0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43290c0;
            if (yVar != null) {
                yVar.f(8);
            }
            fs fsVar = this.f43276b0;
            if (fsVar != null) {
                fsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f43340g0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var2 = this.f43352h0;
            if (v0Var2 != null) {
                v0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.v0 v0Var3 = this.f43389k0;
            if (v0Var3 != null && this.I9) {
                v0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f43402l0;
            if (yVar3 != null && this.J9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.v0 v0Var4 = this.f43364i0;
            if (v0Var4 != null) {
                v0Var4.setVisibility(8);
            }
            this.m0 = true;
            Ec(0, 0, -1);
            gc(false);
            ImageView imageView = this.Q2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.R2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.v0 v0Var5 = this.f43352h0;
        if (v0Var5 != null) {
            this.f43274ac = true;
            this.U4 = false;
            v0Var5.z(false);
            this.f43274ac = false;
        }
        Ya(null, user);
        xc(0, true);
    }

    public final void lb(int i10, int i11, String str) {
        this.J7 = i10;
        this.L7 = true;
        this.M7 = 0L;
        this.N7 = str;
        this.Q7 = i11;
        this.K7 = true;
    }

    public final void lc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.Y7) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.Y7.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.P0 != null) {
            if (z10 && this.R0 == null) {
                si siVar = new si(getParentActivity(), getResourceProvider(), this);
                this.R0 = siVar;
                w7.b6.b(siVar, 0.02f, 1.2f);
                this.R0.setOnClickListener(new ye(this, 12));
            }
            si siVar2 = this.R0;
            if (siVar2 != null) {
                if (!z10) {
                    siVar2.setVisibility(8);
                    return;
                }
                siVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.Y7;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.Y7.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f43327f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        d11 d11Var = new d11(formatString.substring(indexOf, indexOf2));
                        if (d11Var.f35605c != -1) {
                            d11Var.f35605c = -1;
                            d11Var.invalidateSelf();
                        }
                        d11Var.a(503316480);
                        d11Var.setBounds(0, 0, d11Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(d11Var), indexOf, indexOf2, 33);
                    }
                }
                this.R0.setCustomText(spannableStringBuilder);
                this.R0.setOverrideTextMaxWidth(ci.e4.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.R0.getParent() != null && (!z10 || this.R0.getParent() != this.P0)) {
                    ((ViewGroup) this.R0.getParent()).removeView(this.R0);
                }
                if (z10) {
                    ViewParent parent = this.R0.getParent();
                    LinearLayout linearLayout = this.P0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.R0, w7.z5.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final boolean m() {
        return this.f43457p9;
    }

    public final void m7() {
        float f7;
        org.telegram.ui.Components.pf pfVar;
        float inputBubbleHeight = this.Q.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + X8(org.telegram.ui.Components.s31.f30679c) + this.v.c();
        jk jkVar = this.W;
        if (jkVar != null && (pfVar = jkVar.m0) != null) {
            pfVar.setTranslationY(-inputBubbleHeight);
        }
        ck ckVar = this.G1;
        if (ckVar != null) {
            if (ckVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            ckVar.setTranslationY(f7);
        }
    }

    public final void m8(boolean z10) {
        TLRPC.Chat chat = this.f43315e;
        if (chat != null && this.X7 != null && !ChatObject.isNotInChat(chat) && !this.f43315e.creator) {
            TLRPC.ChatFull chatFull = this.X7;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f43473r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f43473r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.X7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.X7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f43473r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f43473r == 0) {
                getMessagesController().checkChatInviter(this.f43315e.f20047id, false);
            }
        }
    }

    public final void m9() {
        UndoView undoView = this.f43542w3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.rc rcVar = this.y3;
        if (rcVar != null) {
            rcVar.c(0L, false);
        }
        fl flVar = this.f43555x3;
        if (flVar != null) {
            flVar.e(0, true);
        }
    }

    public final void ma(long j3) {
        int i10 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.Y0.e(true, false);
            } else if (getMessagesController().isCommunity(j3)) {
                showDialog(new fi.k0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new yn(bundle));
                }
            }
        } else if (j3 != getUserConfig().getClientUserId()) {
            if (j3 == a()) {
                this.Y0.e(true, false);
                return;
            }
            Bundle f7 = sa.e.f(j3, "user_id");
            if (this.h != null && j3 == this.f43327f.f20194id) {
                f7.putLong("dialog_id", this.R5);
            }
            ProfileActivity profileActivity = new ProfileActivity(f7, null);
            TLRPC.User user = this.f43327f;
            if (user != null && user.f20194id == j3) {
                i10 = 1;
            }
            profileActivity.N4(i10);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j3);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void mb(long j3) {
        this.f43280b4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20068id = (int) j3;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void mc() {
        final long j3;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.Q0 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.f43315e)) {
            if (this.f43315e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.f43315e.f20047id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f43315e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j10 = this.f43315e.send_paid_messages_stars;
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f20047id), LocaleController.formatNumber(j10, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f20047id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(yh.z7.X0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.Q0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final yn f36047b;

                    {
                        this.f36047b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                yn.Z0(j10, this.f36047b);
                                return;
                            default:
                                yn.t0(j10, this.f36047b);
                                return;
                        }
                    }
                });
                return;
            }
            this.Q0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.Y7;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.mo moVar = this.Q0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                moVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.R5))), LocaleController.getString(R.string.MessagePremiumUnlock), new ai.e2(7));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.mo moVar2 = this.Q0;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                moVar2.c(z10, false, AndroidUtilities.replaceTags(yh.z7.X0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.R5), LocaleController.formatNumber(this.Y7.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final yn f36047b;

                    {
                        this.f36047b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                yn.Z0(j3, this.f36047b);
                                return;
                            default:
                                yn.t0(j3, this.f36047b);
                                return;
                        }
                    }
                });
            } else {
                this.Q0.c(false, false, null, null, null);
            }
        } else {
            this.Q0.c(false, false, null, null, null);
        }
    }

    @Override
    public final org.telegram.ui.Components.ho n() {
        return this.Y0;
    }

    public final void n7() {
        float c10;
        if (this.f43526v0 != null) {
            if (this.Ma && this.f43286ba == null) {
                c10 = AndroidUtilities.navigationBarHeight;
            } else {
                c10 = this.v.c() + X8(org.telegram.ui.Components.s31.f30679c) + AndroidUtilities.dp(16.0f) + this.f43574ya + this.f43460pc;
            }
            int i10 = (int) this.f43469q9;
            org.telegram.ui.Components.w31 w31Var = this.P1;
            if (w31Var != null) {
                w31Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            hh.h hVar = this.f43513u0;
            boolean z10 = this.f43526v0.X1;
            RecyclerView recyclerView = hVar.f11463a;
            int i11 = (int) c10;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new ai.o8(hVar, i12, 9));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            hh.e eVar = this.L3;
            if (eVar != null) {
                RectF rectF = eVar.f11441b;
                rectF.set(X8(org.telegram.ui.Components.s31.f30678b), i10 - this.G, 0.0f, c10 - this.f43574ya);
                eVar.f11442c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void n8(org.telegram.messenger.MessageObject r61, java.util.ArrayList r62, java.util.ArrayList r63, java.util.ArrayList r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.n8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n9() {
        boolean z10;
        Ec(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f43477r3, this.R5, this.J6, this.classGuid, 0, this.f43280b4, this.f43415m3, this.f43429n3, this.f43440o3);
        if (TextUtils.isEmpty(this.f43477r3) && this.f43440o3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f43464q3 = z10;
        this.m0 = z10;
        gc(false);
        Hc();
    }

    public final void na(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f43300ca);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().R1()) {
                PhotoViewer.t1().G0(false, false);
            }
            PhotoViewer.t1().g2(arrayList, 0, 0, false, new ql(this, createVideoThumbnail, arrayList), this);
            return;
        }
        l8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.R5, this.f43405l5, this.V3, null, this.f43381j5, null, 0, this.f43431n5, true, 0, 0, false, false, null, D8(), 0L, 0L, O8(), this.f43321e5);
        y6();
    }

    public final void nb(View view) {
        View view2 = this.H8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.w0)) {
                ((org.telegram.ui.Cells.w0) view2).setInvalidateWithParent(null);
            }
            this.H8 = view;
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void nc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.nc(boolean):void");
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.P3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((n2Var instanceof yn) && ((yn) n2Var).w9()) {
                return false;
            }
        }
        return this.F6;
    }

    @Override
    public final void o() {
        if (!this.f43332f4) {
            if (this.f43327f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f43327f.f20194id));
                if (user != null) {
                    this.f43327f = user;
                } else {
                    return;
                }
            } else if (this.f43315e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43315e.f20047id));
                if (chat != null) {
                    this.f43315e = chat;
                } else {
                    return;
                }
            }
            nj njVar = this.Y0;
            if (njVar != null) {
                njVar.b();
            }
        }
    }

    public final void o7() {
        FrameLayout frameLayout = this.O0;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.Q.getInputBubbleHeight() + this.v.b() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int o8() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4 = this.f43494s6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.H7);
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
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.H7) {
                    i11 = i16;
                } else {
                    int i17 = -1;
                    int i18 = 0;
                    int i19 = -1;
                    int i20 = -1;
                    int i21 = -1;
                    int i22 = -1;
                    int i23 = -1;
                    while (i18 < arrayList7.size()) {
                        int intValue2 = ((Integer) arrayList7.get(i18)).intValue();
                        int i24 = i16;
                        if (intValue2 >= indexOf && (i19 == -1 || i19 > intValue2)) {
                            i21 = ((Integer) arrayList6.get(i18)).intValue();
                            i20 = ((Integer) arrayList8.get(i18)).intValue();
                            i19 = intValue2;
                        }
                        if (intValue2 <= indexOf && (i17 == -1 || i17 < intValue2)) {
                            i22 = ((Integer) arrayList6.get(i18)).intValue();
                            i23 = ((Integer) arrayList8.get(i18)).intValue();
                            i17 = intValue2;
                        }
                        i18++;
                        i16 = i24;
                    }
                    i11 = i16;
                    int i25 = -1;
                    if (i19 != -1) {
                        if (Math.abs(i19 - indexOf) > this.Gb + 1 && Math.abs(i20 - i11) > this.Gb + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i17 == i25 || (Math.abs(i17 - indexOf) > this.Gb + 1 && Math.abs(i23 - i11) > this.Gb + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
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
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.H7) {
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
                    if (Math.abs(i33 - i26) >= this.Gb + 1 && Math.abs(i34 - i27) >= this.Gb + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.Gb + 1 && Math.abs(i32 - i27) >= this.Gb + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
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

    public final void o9() {
        if (!this.B9) {
            this.B9 = true;
            qm qmVar = this.V0;
            if (qmVar != null) {
                qmVar.invalidate();
            }
            sj sjVar = this.f43526v0;
            if (sjVar != null) {
                sjVar.invalidate();
            }
        }
        UndoView undoView = this.f43542w3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(X8(org.telegram.ui.Components.s31.f30679c) + this.Q.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(16.0f));
        }
        v7();
    }

    public final void oa() {
        this.M5 = true;
        this.fragmentBeginToShow = true;
        this.T9 = null;
        this.V0.invalidate();
        this.V0.setSkipBackgroundDrawing(false);
        this.Q9 = false;
        this.fragmentView.setAlpha(1.0f);
        this.Y0.setTranslationY(0.0f);
        this.Y0.getAvatarImageView().setScaleX(1.0f);
        this.Y0.getAvatarImageView().setScaleY(1.0f);
        this.Y0.getAvatarImageView().setAlpha(1.0f);
    }

    public final void ob(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f43266a4 = tL_forumTopic;
        this.Y3 = arrayList;
        MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
        this.V3 = messageObject;
        this.f43405l5 = messageObject;
        this.f43368i4 = i11;
        this.f43380j4 = i12;
        this.f43393k4 = Math.max(1, i11);
        this.f43280b4 = this.V3.getId();
        this.f43294c4 = i10;
        this.f43306d4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43332f4 = z10;
        MessageObject messageObject2 = this.f43405l5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43320e4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        yc();
        Pc(false);
        gc(false);
    }

    public final void oc() {
        MessageObject messageObject;
        if (this.f43327f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                sj sjVar = this.f43526v0;
                if (sjVar != null) {
                    int childCount = sjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f43526v0.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        } else {
                            messageObject = null;
                        }
                        if (messageObject != null && messageObject.getId() < 0) {
                            long j3 = messageObject.messageOwner.random_id;
                            if (j3 != 0) {
                                arrayList.add(Long.valueOf(j3));
                            }
                        }
                    }
                }
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f43434n8, this.f43445o8, this.f43327f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f34441h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f43327f, null, null, messageObject2.getId());
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        ai.g4 g4Var;
        org.telegram.ui.Components.xn xnVar;
        String str;
        ai.g4 g4Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (g4Var2 = this.H1) != null) {
                    org.telegram.ui.Components.pi piVar = g4Var2.f32971y0;
                    if (piVar instanceof ii.r) {
                        ii.r rVar = (ii.r) piVar;
                        if (intent != null && intent.getData() != null) {
                            ii.x3 x3Var = rVar.f12603r;
                            Uri data = intent.getData();
                            if (data == null) {
                                x3Var.getClass();
                                return;
                            } else if (x3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new gg.x1(13, x3Var, data));
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
                        ai.g4 g4Var3 = this.H1;
                        if (g4Var3 != null) {
                            org.telegram.ui.Components.pi piVar2 = g4Var3.f32971y0;
                            if (piVar2 instanceof ii.r) {
                                ii.r rVar2 = (ii.r) piVar2;
                                if (intent.getData() != null) {
                                    rVar2.f12603r.f2(intent.getData());
                                    return;
                                }
                                return;
                            }
                        }
                        Uri data2 = intent.getData();
                        if (data2.toString().contains("video")) {
                            try {
                                str = AndroidUtilities.getPath(data2);
                            } catch (Exception e7) {
                                FileLog.e(e7);
                                str = null;
                            }
                            if (str == null) {
                                sb();
                            }
                            if (this.f43442o5) {
                                this.f43468q8 = str;
                            } else {
                                na(null, str);
                            }
                        } else if (this.f43431n5 == null && this.P3 == 1) {
                            org.telegram.ui.Components.e5.M(getParentActivity(), this.R5, new o(11, this, data2), this.f43300ca);
                        } else {
                            l8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.R5, this.f43405l5, this.V3, this.f43381j5, null, null, null, null, 0, this.f43431n5, true, 0, this.P3, D8());
                        }
                        y6();
                        return;
                    }
                    sb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        sb();
                        return;
                    }
                    if (this.f43431n5 == null && this.P3 == 1) {
                        if (intent.getData() != null) {
                            ai.g4 g4Var4 = this.H1;
                            if (g4Var4 != null) {
                                g4Var4.dismiss();
                            }
                            org.telegram.ui.Components.e5.M(getParentActivity(), this.R5, new org.telegram.ui.Components.d5(this) {
                                public final yn f38936b;

                                {
                                    this.f38936b = this;
                                }

                                @Override
                                public final void K(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            yn ynVar = this.f38936b;
                                            ynVar.l8(null, null);
                                            ynVar.fb(i12, intent.getData(), z10);
                                            ynVar.y6();
                                            return;
                                        default:
                                            yn ynVar2 = this.f38936b;
                                            ynVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                ynVar2.fb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            ynVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f43300ca);
                            return;
                        } else if (intent.getClipData() != null) {
                            ai.g4 g4Var5 = this.H1;
                            if (g4Var5 != null) {
                                g4Var5.dismiss();
                            }
                            org.telegram.ui.Components.e5.M(getParentActivity(), this.R5, new org.telegram.ui.Components.d5(this) {
                                public final yn f38936b;

                                {
                                    this.f38936b = this;
                                }

                                @Override
                                public final void K(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            yn ynVar = this.f38936b;
                                            ynVar.l8(null, null);
                                            ynVar.fb(i12, intent.getData(), z10);
                                            ynVar.y6();
                                            return;
                                        default:
                                            yn ynVar2 = this.f38936b;
                                            ynVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                ynVar2.fb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            ynVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f43300ca);
                            return;
                        } else {
                            sb();
                        }
                    } else {
                        l8(null, null);
                        if (intent.getData() != null) {
                            fb(0, intent.getData(), true);
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                fb(0, clipData.getItemAt(i12).getUri(), true);
                            }
                        } else {
                            sb();
                        }
                    }
                    ai.g4 g4Var6 = this.H1;
                    if (g4Var6 != null) {
                        g4Var6.dismiss();
                    }
                    y6();
                    return;
                } else if (i10 == 28 && (g4Var = this.H1) != null && (xnVar = g4Var.m0) != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = xnVar.f29740a;
                    if (xnVar.f33025k1 != -1 && xnVar.f33023j1 != null) {
                        if (intent != null) {
                            if (intent.getData() != null) {
                                uri = intent.getData();
                            } else if (intent.getClipData() != null) {
                                ClipData clipData2 = intent.getClipData();
                                if (clipData2.getItemCount() > 0) {
                                    uri = clipData2.getItemAt(0).getUri();
                                }
                            }
                        }
                        if (uri == null) {
                            org.telegram.messenger.bi.o(R.string.UnsupportedAttachment, new org.telegram.ui.Components.yc(xnVar.f29741b.container, d6Var), d6Var);
                            return;
                        }
                        xnVar.e0(xnVar.f33025k1, new rh.c(uri));
                        org.telegram.ui.Components.fn fnVar = xnVar.f33023j1;
                        if (fnVar != null) {
                            fnVar.dismiss(true);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            E7();
            ai.g4 g4Var7 = this.H1;
            if (g4Var7 != null) {
                g4Var7.f32922j0.g0(i10, intent, this.T7);
            }
            this.T7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.k60 k60Var;
        org.telegram.ui.ActionBar.b2 b2Var;
        org.telegram.ui.Components.rf rfVar;
        org.telegram.ui.Components.pf pfVar;
        rm rmVar;
        zg.q qVar;
        org.telegram.ui.Components.rc rcVar = org.telegram.ui.Components.rc.f30419w;
        if (rcVar != null) {
            org.telegram.ui.Components.vb vbVar = rcVar.f30423e;
            if (vbVar instanceof org.telegram.ui.Components.cc) {
                if (z10) {
                    ((org.telegram.ui.Components.cc) vbVar).f();
                    rcVar.b();
                    return false;
                }
                return false;
            }
        }
        c51 c51Var = this.X9;
        if (c51Var != null && !c51Var.f35313b0) {
            if (z10) {
                c51Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            zg.r rVar = this.W9;
            if (rVar != null && (qVar = rVar.f53516b) != null && qVar.getReactionsWindow() != null) {
                if (z10) {
                    rVar.f53516b.e();
                    return false;
                }
            } else if (rt.q().E) {
                if (z10) {
                    rt.q().o();
                    return false;
                }
            } else {
                el elVar = this.Ca;
                if (elVar != null && elVar.f27463s) {
                    if (z10) {
                        elVar.a(true);
                        return false;
                    }
                } else if (this.f43537vc.f15437f) {
                    if (z10) {
                        Kb(false);
                        return false;
                    }
                } else if (this.O8 != null) {
                    if (z10) {
                        A7(true);
                        return false;
                    }
                } else if (!X6(z10, false)) {
                    if (c9()) {
                        if (z10 && (rmVar = this.f43271a9) != null && rmVar.y()) {
                            this.f43271a9.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.s()) {
                            if (z10) {
                                z7(false);
                                return false;
                            }
                        } else {
                            jk jkVar = this.W;
                            if (jkVar != null && jkVar.t0()) {
                                if (z10) {
                                    this.W.m0(true);
                                    return false;
                                }
                            } else {
                                jk jkVar2 = this.W;
                                if (jkVar2 != null && jkVar2.v()) {
                                    if (z10) {
                                        jk jkVar3 = this.W;
                                        ei.d0 d0Var = jkVar3.f23924l0;
                                        if (d0Var != null) {
                                            d0Var.setOpened(false);
                                        }
                                        if (!jkVar3.j0() && (pfVar = jkVar3.m0) != null) {
                                            pfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    jk jkVar4 = this.W;
                                    if (jkVar4 == null || (rfVar = jkVar4.E0) == null || !rfVar.closeCreationLinkDialog(z10)) {
                                        if (this.P3 == 6 && (b2Var = hg.w.f11376e) != null && b2Var.isShowing()) {
                                            if (z10) {
                                                hg.w.f11376e.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.f43315e) && !this.R3 && this.P1 != null && d() != 0) {
                                            if (z10) {
                                                this.P1.m(0L, this.f43433n7);
                                                return false;
                                            }
                                        } else if (this.P3 == 5 && !"hello".equalsIgnoreCase(this.O3) && !"away".equalsIgnoreCase(this.O3) && (this.f43494s6.isEmpty() || this.f43280b4 == 0)) {
                                            if (z10) {
                                                Pb();
                                                return false;
                                            }
                                        } else if (this.P3 == 6 && this.W.w()) {
                                            if (z10) {
                                                vb(new yf(this, 19));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21286n0) {
                                                if (z10) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f43512tc.f15437f) {
                                                if (z10) {
                                                    sa();
                                                }
                                            } else {
                                                if (z10 && (k60Var = this.Z2) != null) {
                                                    k60Var.a(false);
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
        l9();
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f43494s6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.f43315e)))) {
                    org.telegram.ui.Components.d41.u(messageObject, false);
                }
            }
        }
        this.D3 = false;
        m9();
        ArrayList arrayList2 = org.telegram.ui.Components.d41.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        nf.e eVar = this.f43563xb;
        if (eVar != null) {
            eVar.a(false);
            this.f43563xb = null;
        }
        this.C3.detach();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.D3 = true;
        super.onBecomeFullyVisible();
        if (this.M) {
            showDialog(this.L);
        }
        if (this.f43287bb) {
            jk jkVar = this.W;
            if (jkVar != null) {
                jkVar.I0();
                jk jkVar2 = this.W;
                jkVar2.T0 = false;
                org.telegram.ui.Components.fg fgVar = jkVar2.U0;
                if (fgVar != null) {
                    fgVar.u(false);
                }
            }
            this.f43287bb = false;
        }
        if (this.f43502t1 != null) {
            AndroidUtilities.runOnUIThread(new qe(this, 0), 600L);
        }
        if (this.f43453p4 && !this.f43465q4) {
            this.f43465q4 = true;
            org.telegram.ui.Components.rc M = org.telegram.ui.Components.yc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f30427j = 5000;
            M.v = new qe(this, 1);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        zg.r rVar = this.W9;
        if (rVar != null && rVar.d()) {
            this.W9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j3;
        long j10;
        nj njVar = this.Y0;
        if (njVar != null) {
            njVar.getViewTreeObserver().addOnPreDrawListener(new g7(this, 1));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        A7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.D1() || !PhotoViewer.t1().R1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f43300ca);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i10 = playingMessageObject.type;
                    long j11 = 0;
                    if (i10 != 0) {
                        j3 = this.R5;
                    } else {
                        j3 = 0;
                    }
                    if (i10 != 0) {
                        j10 = this.J6;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = d();
                    }
                    if (t12.f2(playingMessageObject, null, null, null, null, null, null, 0, this.Da, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.t1().l4 = this;
                    }
                    i9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.D1() && PhotoViewer.t1().f33976l2) {
                PhotoViewer t13 = PhotoViewer.t1();
                if (t13.F2.y()) {
                    if (t13.Z2) {
                        t13.F2.N(false);
                    }
                    MediaController.getInstance().injectVideoPlayer(t13.F2, t13.T4);
                    t13.F2 = null;
                }
                PhotoViewer.t1().G0(false, true);
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
        kk kkVar = this.U9;
        float f7 = 0.0f;
        if (z10 && this.P9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var instanceof yn) {
                this.B4 = true;
                yn ynVar = (yn) n2Var;
                ynVar.R9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.V0.setSkipBackgroundDrawing(true);
                this.Y0.setTranslationY(AndroidUtilities.dp(8.0f));
                this.Y0.getAvatarImageView().setAlpha(0.0f);
                this.Y0.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.Q9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                jk jkVar = this.W;
                if (jkVar != null) {
                    jkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                nk nkVar = this.P;
                if (nkVar != null) {
                    nkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                jk jkVar2 = this.W;
                if (jkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = jkVar2.getMeasuredHeight();
                }
                nk nkVar2 = this.P;
                if (nkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = nkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                jk jkVar3 = ynVar.W;
                if (jkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = jkVar3.getMeasuredHeight();
                }
                nk nkVar3 = this.P;
                if (nkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = nkVar3.getMeasuredHeight();
                }
                this.M9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ai.x(9, this, ynVar));
                ic();
                AnimatorSet animatorSet = new AnimatorSet();
                this.T9 = animatorSet;
                animatorSet.addListener(new ci.x5(this, ynVar, runnable));
                this.T9.setDuration(300L);
                this.T9.setInterpolator(org.telegram.ui.Components.tr.f31215f);
                this.T9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(kkVar, 200L);
                return this.T9;
            }
        }
        if (this.ha && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var2 instanceof wf1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                n2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f43386ja = f7;
                ofFloat.addUpdateListener(new aj(0, this));
                this.f43374ia = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                qm qmVar = this.V0;
                if (qmVar != null) {
                    qmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.T9 = animatorSet2;
                animatorSet2.addListener(new cj(this, z10, runnable));
                this.T9.setDuration(150L);
                this.T9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(kkVar, 200L);
                } else {
                    this.T9.start();
                }
                return this.T9;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var = this.L;
        if (b2Var != null && dialog == b2Var) {
            getMessagesController().deleteDialog(this.R5, 0);
            org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
            if (c5Var != null && !c5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.iv0 iv0Var;
        super.onFragmentDestroy();
        hh.e eVar = this.L3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f11448w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                hh.d dVar = (hh.d) longSparseArray.valueAt(i10);
                if (dVar.f11435i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        jk jkVar = this.W;
        if (jkVar != null) {
            jkVar.B0();
        }
        nj njVar = this.Y0;
        if (njVar != null && (iv0Var = njVar.f27276c0) != null) {
            iv0Var.b(njVar.G);
        }
        ck ckVar = this.G1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            this.G1.getAdapter().P();
        }
        ai.g4 g4Var = this.H1;
        if (g4Var != null) {
            g4Var.dismissInternal();
        }
        rt q6 = rt.q();
        if (q6.f40252l == this.f43373i9) {
            q6.W = null;
            q6.f40239a0 = null;
            q6.Y = null;
            q6.f40252l = null;
            q6.f40243c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.D9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.E9);
        getNotificationCenter().onAnimationFinish(this.F9);
        getNotificationCenter().onAnimationFinish(this.G9);
        m9();
        ug ugVar = this.J5;
        if (ugVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ugVar);
            this.J5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f43410la);
        MessagesController messagesController = getMessagesController();
        long j3 = this.R5;
        if (this.P3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j3, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.Pa;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Pa = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.P3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.R5), Long.valueOf(d()), Boolean.TRUE);
        }
        if (this.f43327f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.C3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f43327f != null) {
            getMessagesController().cancelLoadFullUser(this.f43327f.f20194id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        ai.g4 g4Var2 = this.H1;
        if (g4Var2 != null) {
            g4Var2.u1();
            this.H1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.f43315e)) {
            getMessagesController().startShortPoll(this.f43315e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.X7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.X7.linked_chat_id)), this.classGuid, true);
            }
        }
        rm rmVar = this.f43271a9;
        if (rmVar != null) {
            rmVar.f(false);
        }
        uj ujVar = this.f43539w0;
        if (ujVar != null) {
            ujVar.N();
        }
        sk skVar = this.f43523ua;
        if (skVar != null) {
            skVar.b();
        }
        this.Z9 = null;
        org.telegram.ui.ActionBar.c5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Ic ? 1 : 0);
            org.telegram.ui.ActionBar.c5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.n9) parentLayout2.getPulledDialogs().get(i11)).f28998b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Ic = false;
        nf.e eVar2 = this.f43563xb;
        if (eVar2 != null) {
            eVar2.a(false);
            this.f43563xb = null;
        }
        this.f43325ea.onFragmentDestroy();
        g11 g11Var = this.f43270a8;
        if (g11Var != null) {
            g11Var.b(true);
            this.f43270a8 = null;
        }
        yh.c4 c4Var = this.nc;
        if (c4Var != null) {
            c4Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.nc);
            this.nc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f43362hb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f43521u8, null, null, false);
        }
        yh.c4 c4Var = this.nc;
        if (c4Var != null) {
            c4Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.nc);
            this.nc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        ai.g4 g4Var;
        org.telegram.ui.Components.jl jlVar;
        ai.g4 g4Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.xi xiVar;
        jk jkVar = this.W;
        boolean z12 = false;
        if (jkVar != null && i10 == 2 && jkVar.j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(jkVar.Q).sendCurrentLocation(jkVar.f23910i3, jkVar.j3);
            }
            jkVar.j3 = null;
            jkVar.f23910i3 = null;
        }
        ck ckVar = this.G1;
        if (ckVar != null && ckVar.getAdapter() != null) {
            gg.k1 adapter = this.G1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f10696w0;
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
            ai.g4 g4Var3 = this.H1;
            if (g4Var3 != null) {
                g4Var3.f32922j0.X();
            }
            org.telegram.ui.Components.pp ppVar = this.Z9;
            if (ppVar != null && (xiVar = ppVar.Y) != null) {
                xiVar.f32922j0.X();
            }
        } else if ((i10 == 5 || i10 == 30) && (g4Var = this.H1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                g4Var.C1();
            } else if (i10 == 30 && (jlVar = g4Var.f32936o0) != null && g4Var.f32971y0 == jlVar && g4Var.isShowing()) {
                g4Var.f32936o0.X();
            }
        } else if ((i10 == 17 || i10 == 18) && (g4Var2 = this.H1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = g4Var2.f32922j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.S(z12);
            this.H1.f32922j0.X();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43300ca);
                alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new wh(this));
                org.telegram.messenger.q.o(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            za(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            za(2);
        } else if (((i10 != 101 && i10 != 102) || this.f43327f == null) && (i10 != 103 || this.f43315e == null)) {
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
                    org.telegram.ui.Components.voip.g2.l(this.f43315e, null, this.W7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f43327f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.Y7;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f43327f.f20194id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        jk jkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.w9[] w9VarArr;
        ai.f0 f0Var;
        super.onResume();
        d7();
        this.C9 = System.currentTimeMillis();
        if (this.f43457p9 && getSendMessagesHelper().getImportingHistory(this.R5) != null) {
            org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(getParentActivity(), null, this, this.f43300ca);
            a50Var.setOnHideListener(new ig(this, 8));
            showDialog(a50Var);
            this.f43457p9 = false;
        }
        H6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        W6();
        ai.g4 g4Var = this.H1;
        if (g4Var != null) {
            g4Var.x1();
        }
        qm qmVar = this.V0;
        boolean z12 = true;
        if (qmVar != null) {
            org.telegram.ui.Components.k91 k91Var = qmVar.v;
            if (k91Var != null) {
                k91Var.c(true);
            }
            qmVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new qe(this, 22), 1000L);
        }
        b9 b9Var = new b9(this, 2);
        this.Wb = b9Var;
        setBulletinDelegate(b9Var);
        G6(false);
        TLRPC.PhotoSize photoSize = this.f43518u5;
        if (photoSize != null && (f0Var = this.Y) != null) {
            ((org.telegram.ui.Components.to[]) f0Var.f935b)[0].f31199f.k(ImageLocation.getForObject(photoSize, this.f43544w5), "50_50", ImageLocation.getForObject(this.f43531v5, this.f43544w5), "50_50_b", this.f43493s5, null, this.f43405l5, this.f43506t5);
        }
        if (this.A5 != null && (w9VarArr = this.f43579z2) != null) {
            w9VarArr[0].k(ImageLocation.getForObject(this.A5, this.C5), "50_50", ImageLocation.getForObject(this.B5, this.C5), "50_50_b", this.f43557x5, null, (MessageObject) this.H4.get(Integer.valueOf(this.J4)), this.f43569y5);
            w9VarArr[0].setHasBlur(this.f43582z5);
        }
        if (this.P3 == 0) {
            getNotificationsController().setOpenedDialogId(this.R5, d());
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.R5;
        if (this.P3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j3, z10, true);
        if (this.O5) {
            if (this.Q5 && (messageObject = this.I7) != null) {
                if (this.f43526v0 != null) {
                    int i10 = this.R7;
                    if (i10 == -9000) {
                        i10 = L8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f43552x0.i1(this.f43494s6.indexOf(this.I7) + this.f43565y0.J, i10, z11);
                    }
                    z11 = false;
                    this.f43552x0.i1(this.f43494s6.indexOf(this.I7) + this.f43565y0.J, i10, z11);
                }
            } else {
                N9(false);
            }
            this.Q5 = false;
            this.O5 = false;
            this.I7 = null;
        }
        this.f43442o5 = false;
        this.p5 = false;
        a7(false);
        if (this.f43466q5) {
            this.f43466q5 = false;
            jm jmVar = this.f43565y0;
            if (jmVar != null) {
                jmVar.O(false);
            }
        }
        nj njVar = this.Y0;
        if (njVar != null) {
            njVar.getViewTreeObserver().addOnPreDrawListener(new g7(this, 1));
        }
        A6(false, false);
        if (this.W != null && this.P3 == 0 && this.f43350ga != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.R5 && (arrayList2 = this.f43350ga.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new q80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f43350ga.entities;
            }
            CharSequence r10 = ChatActivityEnterView.r(arrayList, this.f43350ga.message, this.W.getEditField().getPaint().getFontMetricsInt());
            if (r10 != null && r10.length() > 0 && r10.charAt(0) == '@') {
                r10 = TextUtils.concat(" ", r10);
            }
            this.W.e1(r10, true);
            this.f43350ga = null;
        }
        ok okVar = this.M0;
        if (okVar != null && okVar.getVisibility() != 0 && !this.actionBar.f21286n0 && this.P3 != 7 && !org.telegram.ui.ActionBar.n2.hasSheets(this)) {
            this.W.setFieldFocused(true);
        }
        jk jkVar2 = this.W;
        if (jkVar2 != null) {
            jkVar2.E0();
        }
        if (this.f43327f != null) {
            this.f43434n8 = System.currentTimeMillis();
            this.f43445o8 = 0L;
        }
        if (this.f43468q8 != null) {
            AndroidUtilities.runOnUIThread(new qe(this, 2));
        }
        if (this.f43526v0 != null && ((jkVar = this.W) == null || !jkVar.r0())) {
            this.f43526v0.setOnItemLongClickListener(this.Ha);
            this.f43526v0.setOnItemClickListener(this.Ia);
            this.f43526v0.setLongClickable(true);
        }
        org.telegram.ui.Components.i61.h = false;
        TLRPC.User user = this.f43327f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.i61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.X7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.X7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.X7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.i61.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                org.telegram.ui.Components.i61.h = (chatFull.bot_info.isEmpty() || (chat = this.f43315e) == null || !chat.megagroup) ? false : false;
            }
        }
        Mc(false);
        Hb();
        if (this.L9 != 0.0f) {
            this.L9 = 0.0f;
            this.f43526v0.invalidate();
        }
        this.C3.attach();
        yh.c4 c4Var = this.nc;
        if (c4Var != null) {
            c4Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.td tdVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.M5) {
                this.M5 = true;
                tc();
            }
            iArr = this.D9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.L5 = false;
            if (!z11) {
                this.N5 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f43327f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            jk jkVar = this.W;
            if (jkVar != null && (tdVar = jkVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(tdVar);
                jkVar.S1 = null;
            }
        }
        d7();
        this.D9 = getNotificationCenter().setAnimationInProgress(this.D9, iArr);
    }

    public final void p7() {
        int i10;
        float f7 = this.xc.f15436e;
        org.telegram.ui.Components.h40 h40Var = this.f43475r1;
        int i11 = 8;
        if (h40Var != null) {
            h40Var.setAlpha(f7);
            org.telegram.ui.Components.h40 h40Var2 = this.f43475r1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h40Var2.setVisibility(i10);
        }
        ai.w0 w0Var = this.J3;
        if (w0Var != null) {
            float f10 = 1.0f - f7;
            w0Var.setAlpha(f10);
            ai.w0 w0Var2 = this.J3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            w0Var2.setVisibility(i11);
        }
    }

    public final void p9() {
        boolean z10;
        Rect rect;
        if (this.V0 != null) {
            if (this.Ra <= 0 && this.Sa <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            ph.i iVar = this.v;
            float b10 = iVar.b();
            le.m mVar = iVar.f44729b;
            int max = (int) Math.max(0.0f, (b10 * mVar.f15464a) - AndroidUtilities.dp(29.0f));
            qm qmVar = this.V0;
            ci.ab abVar = qmVar.L;
            Rect rect2 = this.Ac;
            if (abVar != null) {
                rect2.set(0, 0, qmVar.getMeasuredWidth(), this.V0.getMeasuredHeight() - max);
                this.V0.L.setClipBounds(rect2);
            }
            if (this.f43526v0 != null) {
                rect2.set(0, 0, this.V0.getMeasuredWidth(), this.V0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f43526v0.getTop());
                sj sjVar = this.f43526v0;
                if (sjVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                sjVar.setClipBounds(rect);
            }
            if (this.V != null) {
                rect2.set(0, 0, this.V0.getMeasuredWidth(), this.V0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(iVar.v, iVar.b() * mVar.f15464a) - AndroidUtilities.dp(29.0f))));
                jh.f fVar = this.V;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void pa(long j3, boolean z10) {
        if (this.P1 != null && UserObject.isBotForum(this.f43327f)) {
            this.P1.setAllTopicsHidden(true);
        }
        this.K5.put(j3, 1);
        Q7();
        UndoView undoView = this.f43542w3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.R5, 0, new ci.n9(this, j3, z10, 5), new gg(this, j3, 1));
        this.f43565y0.O(false);
    }

    public final void pb() {
        AndroidUtilities.shakeViewSpring(this.f43526v0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        jk jkVar = this.W;
        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void pc(MessageObject messageObject, boolean z10) {
        if (this.f43565y0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new ci.y0(this, messageObject, z10, 12));
    }

    @Override
    public final void q(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j3) {
        if (photoEntry == null) {
            return;
        }
        this.f43500sc.a(false, true);
        MessageObject messageObject = this.f43431n5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.f43431n5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f43321e5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.f43431n5.messageOwner.suggested_post);
            }
            if (!yh.u5.U(this.currentAccount, messageSuggestionParams.amount)) {
                Sb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            yf yfVar = new yf(this, 24);
            this.f43444o7 = yfVar;
            AndroidUtilities.runOnUIThread(yfVar, 3000L);
        }
        l8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.e5.b0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                yn ynVar = yn.this;
                MessageObject messageObject2 = ynVar.f43431n5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = ynVar.f43321e5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(ynVar.f43431n5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(ynVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, ynVar.R5, ynVar.f43431n5, ynVar.V3, null, ynVar.f43381j5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, ynVar.D8(), photoEntry2.effectId, l4.longValue(), ynVar.O8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(ynVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, ynVar.R5, ynVar.f43431n5, ynVar.V3, null, ynVar.f43381j5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, ynVar.D8(), photoEntry2.effectId, l4.longValue(), ynVar.O8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(ynVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, ynVar.R5, ynVar.f43431n5, ynVar.V3, null, ynVar.f43381j5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, ynVar.D8(), photoEntry2.effectId, l4.longValue(), ynVar.O8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(ynVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, ynVar.R5, ynVar.f43405l5, ynVar.V3, null, ynVar.f43381j5, photoEntry2.entities, photoEntry2.ttl, ynVar.f43431n5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, ynVar.D8(), photoEntry2.effectId, l4.longValue(), ynVar.O8(), ynVar.f43321e5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(ynVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, ynVar.R5, ynVar.f43405l5, ynVar.V3, null, ynVar.f43381j5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, ynVar.f43431n5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, ynVar.D8(), photoEntry2.effectId, l4.longValue(), ynVar.O8(), ynVar.f43321e5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(ynVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, ynVar.R5, ynVar.f43405l5, ynVar.V3, null, ynVar.f43381j5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, ynVar.f43431n5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, ynVar.D8(), photoEntry2.effectId, l4.longValue(), ynVar.O8(), ynVar.f43321e5);
                }
                ynVar.y6();
            }
        }, j3);
    }

    public final void q7() {
        if (this.V0 == null) {
            return;
        }
        this.f43460pc = C6(false);
        this.f43472qc = C6(true);
        this.Q.setInputBubbleHeight(this.f43460pc);
        vc();
        fc();
        m7();
        j7();
        o7();
        n7();
    }

    public final org.telegram.ui.Cells.a0 q8(int i10, boolean z10) {
        MessageObject messageObject;
        sj sjVar = this.f43526v0;
        if (sjVar != null) {
            int childCount = sjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f43526v0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f43469q9 - this.f43497s9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f43526v0.getMeasuredHeight() - this.f43574ya) {
                            return null;
                        }
                    }
                    return (org.telegram.ui.Cells.a0) childAt;
                }
            }
            return null;
        }
        return null;
    }

    public final void q9() {
        this.f43458pa = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean qa() {
        if (this.F4.size() != 1 || this.W3 == null || ((Integer) this.F4.get(0)).intValue() != this.W3.getId()) {
            return false;
        }
        return true;
    }

    public final void qb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43300ca);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        b2Var.R = string;
        TLRPC.User user = this.f43327f;
        if (user != null) {
            if (user.bot) {
                b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String g10 = org.telegram.messenger.bi.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, gf.b.c());
                TLRPC.User user2 = this.f43327f;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, g10, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new gg.d2(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
    }

    public final void qc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.f43565y0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f43532v6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                uj ujVar = this.f43539w0;
                if (ujVar != null) {
                    ujVar.V(groupedMessages);
                }
                for (int i10 = 0; i10 < groupedMessages.messages.size(); i10++) {
                    groupedMessages.messages.get(i10).forceUpdate = true;
                    if (z10) {
                        groupedMessages.messages.get(i10).reactionsChanged = true;
                    }
                }
                this.f43565y0.O(true);
                return;
            }
            MessageObject messageObject3 = (MessageObject) this.f43418m6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.f43565y0.N) {
                a0.i iVar = this.Wa;
                if (iVar != null) {
                    messageObject2 = (MessageObject) iVar.f(messageObject.getId());
                } else {
                    messageObject2 = null;
                }
                int indexOf = this.f43565y0.P.indexOf(messageObject2);
                if (messageObject2 != null && z10) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                }
                if (indexOf >= 0) {
                    jm jmVar = this.f43565y0;
                    jmVar.m(jmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f43494s6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                jm jmVar2 = this.f43565y0;
                jmVar2.m(jmVar2.J + indexOf2);
            }
        }
    }

    public final void r7() {
        int i10;
        yn ynVar = this.f43286ba;
        if (ynVar != null) {
            ynVar.r7();
        }
        int i11 = AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + ((int) W8(AndroidUtilities.dp(7.0f)));
        vk vkVar = this.f43413m1;
        if (vkVar != null) {
            i10 = AndroidUtilities.dp(vkVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(A8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.c());
        ai.w0 w0Var = this.J3;
        if (w0Var != null) {
            w0Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.h40 h40Var = this.f43475r1;
        if (h40Var != null) {
            h40Var.f27063e.setPadding(0, dp2, 0, dp3);
            h40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        hh.f fVar = this.I3;
        if (fVar != null) {
            jh.f fVar2 = fVar.f11451a;
            fVar2.setFadeZoneTop(dp2);
            fVar2.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.w00 w00Var = this.a2;
        if (w00Var != null) {
            w00Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.ux0 ux0Var = this.f43278b2;
        if (ux0Var != null) {
            ux0Var.f31548a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final void r8() {
        if (this.f43371i7) {
            return;
        }
        this.f43371i7 = true;
        getMessagesController().checkSensitive(this, this.R5, new qe(this, 23), new yf(this, 19));
    }

    public final void r9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f43327f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f43494s6.isEmpty();
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

    public final boolean ra() {
        ArrayList<MessageObject> arrayList;
        jk jkVar = this.W;
        if (jkVar != null && jkVar.w0()) {
            return true;
        }
        ArrayList arrayList2 = this.f43494s6;
        for (int size = arrayList2.size() - 1; size >= 0; size--) {
            MessageObject messageObject = (MessageObject) arrayList2.get(size);
            if ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.isContentUnread() && !messageObject.isOut()) {
                MediaController mediaController = MediaController.getInstance();
                if (MediaController.getInstance().playMessage(messageObject)) {
                    arrayList = R7(messageObject, true);
                } else {
                    arrayList = null;
                }
                mediaController.setVoiceMessagesPlaylist(arrayList, true);
                return true;
            }
        }
        if (Build.VERSION.SDK_INT >= 23 && getParentActivity() != null && getParentActivity().checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            getParentActivity().requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 3);
            return true;
        }
        return false;
    }

    public final boolean rb() {
        if (u9() && this.f43405l5 == null && this.f43431n5 == null) {
            if (this.P3 != 8 && u9() && this.f43315e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f43315e.f20047id, 1L);
                if (this.P3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.f43315e, findTopic)) {
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

    public final void rc() {
        org.telegram.ui.ActionBar.n1 n1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        sj sjVar = this.f43526v0;
        ck ckVar = this.G1;
        if ((ckVar != null && ckVar.I) || ((n1Var = this.O8) != null && n1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        sjVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.T7 = bundle.getString("path");
    }

    public final void s6(MessageObject messageObject, Integer num) {
        MessageObject messageObject2 = messageObject.replyMessageObject;
        if (messageObject2 != null) {
            int id2 = messageObject2.getId();
            SparseArray sparseArray = this.f43443o6;
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

    public final void s7() {
        int i10;
        float f7 = (1.0f - this.f43537vc.f15436e) * (1.0f - this.f43512tc.f15436e);
        this.f43353h1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f43353h1.setAlpha(f7);
        jh.h hVar = this.f43353h1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final boolean s8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f43526v0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f43526v0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (currentMessagesGroup = ((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f43494s6.indexOf((MessageObject) hg.c.g(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        jm jmVar = this.f43565y0;
                        jmVar.q(indexOf + jmVar.J, currentMessagesGroup.messages.size());
                        this.f43526v0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            hg.c.u(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.c5 c5Var = this.parentLayout;
        if (c5Var != null && !c5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(z10));
        return false;
    }

    public final boolean s9() {
        if (this.P1 != null && this.f43280b4 == 0) {
            return true;
        }
        return false;
    }

    public final void sa() {
        org.telegram.ui.Cells.u1 u1Var;
        this.f43512tc.a(false, true);
        qh.c cVar = this.f43589zc;
        if (cVar != null && (u1Var = cVar.f45464n) != null && u1Var.getDelegate() != null) {
            cVar.f45464n.getDelegate().D1(cVar.f45464n, false);
        }
        jk jkVar = this.W;
        if (jkVar != null) {
            jkVar.U0(true, true, false);
            this.W.U4 = null;
        }
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        yf yfVar = this.f43446oa;
        if (yfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(yfVar);
        }
        jk jkVar = this.W;
        if (jkVar != null && this.V0 != null && jkVar.getAdjustPanLayoutHelper() != null && !this.W.getAdjustPanLayoutHelper().f21457f) {
            this.f43436na = this.V0.getKeyboardHeight();
        } else {
            this.f43436na = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.T7;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.yc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f43300ca).j();
    }

    public final void sc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f43565y0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.z n10 = kVar.n();
            if (this.inMenuMode) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            n10.setVisibility(i10);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TLRPC.Message message;
        long j3;
        org.telegram.ui.ActionBar.g2 g2Var;
        float f7;
        float f10;
        jk jkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f43327f != null && this.f43402l0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f43327f.f20194id);
            if (userFull != null && userFull.phone_calls_available) {
                this.J9 = !this.inPreviewMode;
                this.f43402l0.f(0);
            } else {
                this.J9 = false;
                this.f43402l0.f(8);
            }
        }
        nj njVar = this.Y0;
        float f12 = 0.0f;
        if (njVar != null) {
            njVar.setOccupyStatusBar(!z10);
            nj njVar2 = this.Y0;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            njVar2.setLayoutParams(w7.z5.d(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        jk jkVar2 = this.W;
        if (jkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.jz0 jz0Var = this.f43277b1;
        if (jz0Var != null) {
            if (this.X4 && !z10 && ((jkVar = this.W) == null || !jkVar.f24001z3)) {
                i11 = 0;
            }
            jz0Var.setVisibility(i11);
        }
        ck ckVar = this.G1;
        if (ckVar != null) {
            ViewPropertyAnimator animate = ckVar.animate();
            if (!this.W.f24001z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.tr.f31215f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                g2Var = new org.telegram.ui.ActionBar.g2(false);
            } else {
                g2Var = null;
            }
            kVar.setBackButtonDrawable(g2Var);
            org.telegram.ui.ActionBar.v0 v0Var = this.f43328f0;
            if (v0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                v0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43290c0;
            if (yVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                yVar.f21706i = f12;
                org.telegram.ui.ActionBar.v0 v0Var2 = yVar.f21710m;
                if (v0Var2 != null) {
                    v0Var2.setAlpha(f12);
                }
            }
        }
        sj sjVar = this.f43526v0;
        if (sjVar != null) {
            int childCount = sjVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f43526v0.getChildAt(i12);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.u1;
                if (z14) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i13 = this.f43382j6 - 1;
                        this.f43382j6 = i13;
                        if (i13 <= 0) {
                            this.f43382j6 = 0;
                            this.f43395k6 = true;
                            Jb(false);
                        } else {
                            this.f43353h1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.f43315e)) {
                            j3 = this.f43315e.f20047id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j3, this.R5);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        u1Var.setHighlighted(false);
                        u1Var.O3();
                    }
                }
            }
            this.f43526v0.setItemAnimator(null);
        }
        gc(false);
        Jc();
        ek ekVar = this.V1;
        if (ekVar != null) {
            if (!z10 && !this.Ma) {
                z12 = true;
            } else {
                z12 = false;
            }
            ekVar.setEnabled(z12);
        }
        ek ekVar2 = this.X1;
        if (ekVar2 != null) {
            if (!z10 && !this.Ma) {
                z11 = true;
            } else {
                z11 = false;
            }
            ekVar2.setEnabled(z11);
        }
        gl glVar = this.f43528v2;
        if (glVar != null) {
            glVar.setEnabled(!isInPreviewMode());
        }
        qm qmVar = this.V0;
        if (qmVar != null) {
            qmVar.setOccupyStatusBar((this.inBubbleMode || this.Ma || this.inPreviewMode) ? false : false);
        }
    }

    public final void t6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.t6():void");
    }

    public final void t7() {
        yn ynVar = this.f43286ba;
        if (ynVar != null) {
            ynVar.t7();
        }
        float W8 = W8(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.P1 != null) {
            W8 += X8(org.telegram.ui.Components.s31.f30677a);
        }
        if (this.f43413m1 != null) {
            W8 += AndroidUtilities.dp(35.0f) * this.f43413m1.E;
        }
        this.V.setFadeZoneTop((int) ((A8() * AndroidUtilities.dp(43.0f)) + W8));
    }

    public final void t8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j3) {
        boolean z13;
        if (!arrayList.isEmpty() && f7()) {
            boolean z14 = false;
            if (i10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.P3 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.f43421m9 = true;
                jm jmVar = this.f43565y0;
                if (jmVar != null) {
                    jmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.R5, z10, z11, z12, i10, 0, this.V3, -1, j3, O8(), this.f43321e5);
            org.telegram.ui.Components.e5.t0(sendMessage, this, this.f43300ca);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new yf(this, 22));
            }
        }
    }

    public final void ta(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        if (this.f43512tc.f15437f && (cVar = this.f43589zc) != null && cVar.f45464n == u1Var) {
            Editable text = cVar.f45459a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(u1Var.getMessageObject(), text, this.f43589zc.getAttachedMedia());
                sa();
                return;
            }
            AndroidUtilities.shakeView(this.f43589zc.f45459a);
        }
    }

    public final void tb(org.telegram.ui.Cells.u1 u1Var) {
        if (getParentActivity() != null && u1Var != null && u1Var.f23333ob != null && u1Var.getPrimaryMessageObject() != null && u1Var.getPrimaryMessageObject().messageOwner != null && u1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Ua) {
                this.Ua = true;
                if (this.f43553x1 != null) {
                    return;
                }
                ci.e4 e4Var = new ci.e4(getParentActivity(), 3);
                e4Var.p(true);
                e4Var.K = Layout.Alignment.ALIGN_NORMAL;
                e4Var.d = -1L;
                e4Var.T = true;
                e4Var.f4989e = true;
                e4Var.i();
                e4Var.q(8.0f);
                this.f43553x1 = e4Var;
                e4Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                ci.e4 e4Var2 = this.f43553x1;
                e4Var2.h = ci.e4.a(e4Var2.getText(), this.f43553x1.getTextPaint());
                this.V0.addView(this.f43553x1, w7.z5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.V0.post(new org.telegram.ui.ActionBar.g6(26, this, u1Var));
            }
        }
    }

    public final void tc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.tc():void");
    }

    @Override
    public final boolean u(final org.telegram.ui.uy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.wf1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.u(org.telegram.ui.uy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.wf1):boolean");
    }

    public final void u6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.i iVar = this.f43519u6;
            ArrayList arrayList = (ArrayList) iVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.q.j(pollId, iVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void u7() {
        if (this.K0 != null) {
            this.K0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - A8()) * (1.0f - this.f43537vc.f15436e) * S8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final int u8() {
        return this.P3;
    }

    public final boolean u9() {
        if (!ChatObject.isForum(this.f43315e) || this.f43332f4) {
            if (ChatObject.isMonoForum(this.f43315e) && d() == 0 && !this.R3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void ua(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        zg.m0 d = zg.m0.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            messageObject = ((org.telegram.ui.Cells.u1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        Za(a0Var, messageObject2, null, null, f7, f10, d, false, false, false, false);
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
            boolean z12 = this.f43565y0.N;
            if (z12) {
                MessageObject messageObject3 = (MessageObject) this.f43418m6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f43440o3 != null) {
                jc(false);
            }
        }
        if (this.f43565y0.N && !messageObject2.hasReaction(this.f43440o3)) {
            MessageObject.GroupedMessages Y8 = Y8(messageObject2);
            if (Y8 != null) {
                for (int i10 = 0; i10 < Y8.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(Y8.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            gg.o1 o1Var = this.K3;
            if (o1Var != null) {
                o1Var.l();
            }
            jc(true);
        }
    }

    public final void ub(boolean z10, boolean z11) {
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
        if (!z10 || this.E0.getTag() == null) {
            if (!z10 && this.E0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.F0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.F0 = null;
            }
            RadialProgressView radialProgressView = this.E0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f16 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.F0 = animatorSet2;
                if (z10) {
                    this.E0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.F0;
                    qk qkVar = this.f43577z0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qkVar, property, 0.1f);
                    qk qkVar2 = this.f43577z0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qkVar2, property2, 0.1f);
                    qk qkVar3 = this.f43577z0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(qkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.E0, property, 1.0f), ObjectAnimator.ofFloat(this.E0, property2, 1.0f), ObjectAnimator.ofFloat(this.E0, property3, 1.0f));
                    this.F0.setStartDelay(200L);
                } else {
                    if (this.A0) {
                        obj = this.B0;
                    } else {
                        obj = this.f43577z0;
                    }
                    RadialProgressView radialProgressView2 = this.E0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.E0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.E0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.F0.addListener(new ai.n(28, this, z10));
                this.F0.setDuration(150L);
                this.F0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.E0;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            radialProgressView5.setVisibility(i10);
            RadialProgressView radialProgressView6 = this.E0;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.1f;
            }
            radialProgressView6.setScaleX(f7);
            RadialProgressView radialProgressView7 = this.E0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView7.setScaleY(f10);
            this.E0.setAlpha(1.0f);
            qk qkVar4 = this.f43577z0;
            if (!z10 && !this.A0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            qkVar4.setVisibility(i11);
            org.telegram.ui.Components.q90 q90Var = this.B0;
            if (!z10 && this.A0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            q90Var.setVisibility(i12);
            qk qkVar5 = this.f43577z0;
            if (!z10 && !this.A0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            qkVar5.setScaleX(f11);
            org.telegram.ui.Components.q90 q90Var2 = this.B0;
            if (!z10 && this.A0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            q90Var2.setScaleX(f12);
            qk qkVar6 = this.f43577z0;
            if (!z10 && !this.A0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            qkVar6.setScaleY(f13);
            org.telegram.ui.Components.q90 q90Var3 = this.B0;
            if (!z10 && this.A0) {
                f16 = 1.0f;
            }
            q90Var3.setScaleY(f16);
            qk qkVar7 = this.f43577z0;
            if (!z10 && !this.A0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            qkVar7.setAlpha(f14);
            org.telegram.ui.Components.q90 q90Var4 = this.B0;
            if (!z10 && this.A0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            q90Var4.setAlpha(f15);
        }
    }

    public final void uc() {
        boolean z10;
        boolean z11;
        if (this.f43353h1 == null) {
            return;
        }
        if (this.f43324e9 && !c9() && !this.W.w0() && !this.Ma && (!this.f43464q3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.N5 != 0 && SystemClock.elapsedRealtime() >= this.N5 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f43365i1 = false;
        } else {
            this.f43584z7 = 0;
            this.f43358h6 = 0;
            z11 = true;
        }
        this.f43353h1.e(1, z10, z11);
    }

    @Override
    public final boolean v() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void v6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.o9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f43315e, this.f43327f, null, this.R5, this.ta, this.f43498sa);
    }

    public final void v7() {
        float f7 = this.f43522u9;
        vk vkVar = this.f43413m1;
        if (vkVar != null) {
            vkVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.f43413m1.E;
        }
        hk hkVar = this.f43427n1;
        if (hkVar != null) {
            hkVar.setTranslationY(f7);
        }
        float A8 = (A8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.w31 w31Var = this.P1;
        org.telegram.ui.Components.s31 s31Var = org.telegram.ui.Components.s31.f30677a;
        if (w31Var != null) {
            w31Var.setSideMenuBackgroundMarginTop((A8() * W8(AndroidUtilities.dp(7.0f))) + A8);
            float X8 = X8(s31Var);
            float a2 = w7.d9.a(this.f43537vc.f15436e);
            float A82 = A8();
            A8 += w7.d9.a(Math.min(w7.q.a(w7.d9.a(a2), 0.0f, 1.0f), w7.q.a(w7.d9.a(A82), 0.0f, 1.0f))) * X8;
        }
        org.telegram.ui.Components.eh ehVar = this.K0;
        if (ehVar != null) {
            ehVar.setTranslationY((A8 - AndroidUtilities.dp(5.0f)) - (A8() * X8(s31Var)));
        }
    }

    public final TLRPC.ChatFull v8() {
        return this.X7;
    }

    public final boolean v9() {
        return UserObject.isBotForum(this.f43327f);
    }

    public final void va(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.va(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void vb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20377a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f20377a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new nf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.i6.f21068q7));
        }
    }

    public final void vc() {
        jh.h hVar = this.f43353h1;
        ph.i iVar = this.v;
        if (hVar != null) {
            this.f43353h1.setTranslationY((((-iVar.c()) - this.Q.getInputBubbleHeight()) - X8(org.telegram.ui.Components.s31.f30679c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f43277b1 != null) {
            this.f43277b1.setTranslationY((-iVar.c()) - AndroidUtilities.dp(16.0f));
        }
    }

    @Override
    public final void w() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void w6(MessageObject messageObject, boolean z10) {
        x6(messageObject, z10, true);
    }

    public final void w7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.f43507t6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.i iVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f43494s6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.R5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f43418m6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j3 = this.f43315e.f20047id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j3, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f43532v6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (iVar == null) {
                                    iVar = new a0.i();
                                }
                                iVar.k(groupedMessages, groupedMessages.groupId);
                                int size3 = groupedMessages.messages.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    groupedMessages.messages.get(i13).animateComments = true;
                                }
                            }
                        } else if (this.f43565y0 != null && (indexOf = arrayList.indexOf(messageObject)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.f43565y0.J));
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
            if (this.f43565y0 != null) {
                if (iVar != null) {
                    int m10 = iVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.n(i15);
                        int indexOf2 = arrayList.indexOf((MessageObject) hg.c.g(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            jm jmVar = this.f43565y0;
                            if (!jmVar.N) {
                                jmVar.q(indexOf2 + jmVar.J, groupedMessages2.messages.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.f43565y0.N) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.f43565y0.m(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final TLRPC.UserFull w8() {
        return this.Y7;
    }

    public boolean w9() {
        if (this.V0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void wa(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        org.telegram.ui.Components.n11 n11Var;
        String hostAuthority;
        boolean z11;
        boolean z12 = false;
        try {
            hostAuthority = AndroidUtilities.getHostAuthority(str);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (this.h != null) {
            if (getMessagesController().secretWebpagePreview == 1) {
            }
            if (z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i10 == 0) {
                    nf.f.q(getParentActivity(), Uri.parse(str), true, true, J9(u1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f43310d8 == 0) {
                        z12 = true;
                    }
                    nf.f.q(parentActivity, parse, z12, true, J9(u1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f43310d8 == 0) {
                        z12 = true;
                    }
                    nf.f.q(parentActivity2, parse2, z12, true, J9(u1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.e5.r0(this, str, true, true, false, false, J9(u1Var, characterStyle), null, this.f43300ca);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.n61) && (n11Var = ((org.telegram.ui.Components.n61) characterStyle).f28987a) != null && (n11Var.f28925a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.e5.r0(this, str, true, true, true, z12, J9(u1Var, characterStyle), null, this.f43300ca);
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
        if (characterStyle instanceof org.telegram.ui.Components.n61) {
            z12 = true;
        }
        org.telegram.ui.Components.e5.r0(this, str, true, true, true, z12, J9(u1Var, characterStyle), null, this.f43300ca);
    }

    public final void wb() {
        TLRPC.Chat chat = this.f43315e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.f43315e)) {
                    r60 r60Var = new r60(a());
                    r60Var.f35414l0 = this;
                    presentFragment(r60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.f43315e)) {
                cd cdVar = new cd(a());
                cdVar.f35414l0 = this;
                presentFragment(cdVar);
                return;
            } else {
                return;
            }
        }
        this.Z9 = new org.telegram.ui.Components.pp(this, this.f43300ca);
        this.f43526v0.setOnInterceptTouchListener(new m4(8));
        ib(this.V0, false);
        showDialog(this.Z9, new ig(this, 0));
    }

    public final void wc(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Integer num;
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
        if ((!E9() || this.f43332f4) && this.J2 != null) {
            if (!this.M5) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.F4.size() > 1 && !this.G2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.J2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.I2.getTag() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.H2.getTag() != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z12 && !this.f43575yb && !this.G2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z12 && !this.f43575yb && !this.G2) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.f43575yb && !this.G2) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z13 != z12 || z14 != z18 || z15 != z16) {
                AnimatorSet animatorSet = this.K2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.K2 = null;
                }
                if (z11) {
                    if (z12) {
                        this.J2.setVisibility(0);
                    } else if (z16) {
                        this.H2.setVisibility(0);
                    }
                    if (z18) {
                        this.I2.setVisibility(0);
                        this.I2.setAlpha(0.0f);
                        this.I2.setScaleX(0.4f);
                        this.I2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.K2 = animatorSet2;
                    ImageView imageView = this.J2;
                    Property property = View.ALPHA;
                    if (z17) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f18);
                    ImageView imageView2 = this.J2;
                    Property property2 = View.SCALE_X;
                    if (z17) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f19);
                    ImageView imageView3 = this.J2;
                    Property property3 = View.SCALE_Y;
                    if (z17) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f20);
                    ImageView imageView4 = this.H2;
                    if (z16) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f21);
                    ImageView imageView5 = this.H2;
                    if (z16) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f22);
                    ImageView imageView6 = this.H2;
                    if (z16) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f23);
                    RadialProgressView radialProgressView = this.I2;
                    if (!z18) {
                        f24 = 0.0f;
                    } else {
                        f24 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f24);
                    RadialProgressView radialProgressView2 = this.I2;
                    if (!z18) {
                        f25 = 0.4f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f25);
                    RadialProgressView radialProgressView3 = this.I2;
                    if (!z18) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f26));
                    this.K2.setInterpolator(org.telegram.ui.Components.tr.h);
                    this.K2.setDuration(360L);
                    this.K2.addListener(new vl(this, z16, z17, z18));
                    this.K2.start();
                } else {
                    num = 1;
                    ImageView imageView7 = this.H2;
                    if (z16) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView7.setAlpha(f7);
                    ImageView imageView8 = this.H2;
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    imageView8.setScaleX(f10);
                    ImageView imageView9 = this.H2;
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView9.setScaleY(f11);
                    ImageView imageView10 = this.H2;
                    if (z16) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.J2;
                    if (z17) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    imageView11.setAlpha(f12);
                    ImageView imageView12 = this.J2;
                    if (z17) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    imageView12.setScaleX(f13);
                    ImageView imageView13 = this.J2;
                    if (z17) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView13.setScaleY(f14);
                    ImageView imageView14 = this.J2;
                    if (z17) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.I2;
                    if (z18) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f15);
                    RadialProgressView radialProgressView5 = this.I2;
                    if (z18) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f16);
                    RadialProgressView radialProgressView6 = this.I2;
                    if (z18) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f17);
                    RadialProgressView radialProgressView7 = this.I2;
                    if (z18) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.H2;
                if (z16) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.J2;
                if (z12) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.I2;
                if (z18) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.f43554x2 != null) {
                if (E9() && !this.f43332f4) {
                    this.f43554x2.c(0, 1, false);
                } else {
                    this.f43554x2.c((this.F4.size() - 1) - Collections.binarySearch(this.F4, Integer.valueOf(this.J4), Comparator$CC.reverseOrder()), this.F4.size(), z11);
                }
            }
        }
    }

    public final void x6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.x6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void x7(boolean z10) {
        boolean z11;
        this.f43494s6.clear();
        this.f43454p6.clear();
        this.q6.clear();
        this.f43334f6.clear();
        this.f43532v6.b();
        this.f43344g4 = false;
        jm jmVar = this.f43565y0;
        if (jmVar != null) {
            if (jmVar.f37735w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Ob(z11);
        }
        sj sjVar = this.f43526v0;
        if (sjVar != null) {
            sjVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f43418m6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f43558x6;
            int[] iArr2 = this.f43545w6;
            if (encryptedChat == null) {
                iArr2[i10] = Integer.MAX_VALUE;
                iArr[i10] = Integer.MIN_VALUE;
            } else {
                iArr2[i10] = Integer.MIN_VALUE;
                iArr[i10] = Integer.MAX_VALUE;
            }
            this.f43570y6[i10] = Integer.MIN_VALUE;
            this.f43583z6[i10] = 0;
            this.A6[i10] = false;
            this.B6[i10] = false;
            this.C6[i10] = true;
        }
        if (z10) {
            this.E7 = true;
            this.F6 = true;
            this.E6 = true;
            this.G7 = false;
        }
        this.V4 = false;
        this.f43495s7 = 0;
        this.f43481r7 = false;
        this.I6 = 0;
        this.H7 = null;
        this.B7 = 0;
        this.C7 = false;
        this.f43571y7 = false;
        jm jmVar2 = this.f43565y0;
        if (jmVar2 != null && !jmVar2.N) {
            jmVar2.O(false);
        }
    }

    public final ArrayList x8() {
        jm jmVar = this.f43565y0;
        if (jmVar != null) {
            return jmVar.P;
        }
        return null;
    }

    public final boolean x9() {
        if (this.f43315e != null) {
            return getMessagesController().isChatNoForwards(this.f43315e);
        }
        return getMessagesController().isUserNoForwards(this.Y7);
    }

    public final void xa(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.xa(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void xb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.on r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.xb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.on, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void xc(int r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.xc(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.Components.mw0 y() {
        return this.V0;
    }

    public final void y6() {
        this.f43321e5 = null;
        if (this.f43280b4 == 0 || this.f43332f4) {
            if (this.f43332f4) {
                this.f43405l5 = this.V3;
            } else {
                this.f43405l5 = null;
            }
            this.f43381j5 = null;
            jk jkVar = this.W;
            if (jkVar != null) {
                jkVar.k1(null, null, null);
            }
        }
        f9(false);
        if (this.P3 == 0) {
            getMediaDataController().cleanDraft(this.R5, this.f43280b4, true);
        }
    }

    public final void y7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f43558x6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.F6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.q.n(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.B7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.C6[0] = false;
            this.D6 = false;
            jm jmVar = this.f43565y0;
            if (jmVar != null && jmVar.F < 0) {
                jmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f43358h6 = i12;
            this.f43382j6 = dialog2.unread_mentions_count;
            if (this.f43370i6 != i12) {
                jh.h hVar = this.f43353h1;
                if (hVar != null) {
                    hVar.c(1, i12, this.L5);
                }
                this.f43370i6 = this.f43358h6;
                uc();
            }
            int i13 = this.f43382j6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f43382j6 = i14;
                if (i14 <= 0) {
                    this.f43382j6 = 0;
                    this.f43395k6 = true;
                    Jb(false);
                } else {
                    jh.h hVar2 = this.f43353h1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Jb(true);
                }
            }
            a7(false);
            return;
        }
        this.f43494s6.clear();
        this.f43334f6.clear();
        this.f43454p6.clear();
        this.q6.clear();
        this.f43532v6.b();
        this.f43344g4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f43418m6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f43545w6;
            if (encryptedChat == null) {
                iArr2[i15] = Integer.MAX_VALUE;
                iArr[i15] = Integer.MIN_VALUE;
            } else {
                iArr2[i15] = Integer.MIN_VALUE;
                iArr[i15] = Integer.MAX_VALUE;
            }
            this.f43570y6[i15] = Integer.MIN_VALUE;
            this.f43583z6[i15] = 0;
            this.U5[i15].clear();
            this.V5[i15].clear();
            this.W5[i15].clear();
        }
        d9();
        xc(0, true);
        if (this.f43384j8 != null) {
            this.f43384j8 = null;
            jk jkVar = this.W;
            if (jkVar != null) {
                jkVar.Y0(null, true, false);
            }
        }
        if (this.N != null) {
            Ob(false);
            G7(false);
            this.f43526v0.setEmptyView(this.O0);
        }
        jm jmVar2 = this.f43565y0;
        if (jmVar2 != null) {
            jmVar2.O(false);
        }
        if (this.h == null && (user = this.f43327f) != null && user.bot && this.f43298c8 == null) {
            this.f43298c8 = "";
            gc(false);
        }
    }

    public final li.p y8() {
        yn ynVar = this.f43286ba;
        if (ynVar != null) {
            return ynVar.y8();
        }
        return this.glassEngine;
    }

    public final boolean y9() {
        int i10 = this.P3;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void ya(java.util.ArrayList r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.yn.ya(java.util.ArrayList, boolean):void");
    }

    public final void yb(boolean z10, MessageObject messageObject, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        xb(z10, messageObject, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void yc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f43332f4 && !this.H4.isEmpty() && this.F4.size() == 1 && ((Integer) this.F4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.H4.get(this.F4.get(0));
        } else {
            messageObject = null;
        }
        this.W3 = messageObject;
        if (this.f43332f4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f43266a4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.f43315e, this.W3.messageOwner.from_id)) {
            this.W3 = null;
        }
    }

    @Override
    public final List z() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.f43315e)) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f43262a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new mg.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new ug(this, 13)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new ug(this, 14)));
        }
        if (this.f43327f == null) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new t0("", 1)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.d2(this)));
        }
        return arrayList;
    }

    public final void z6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43300ca);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20377a;
        b2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(b2Var);
    }

    public final void z7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.U5[i10].clear();
            this.V5[i10].clear();
            this.W5[i10].clear();
        }
        d9();
        xc(0, true);
        Vc(z10);
        Kc();
    }

    public final MessageObject.GroupedMessages z8(long j3) {
        return (MessageObject.GroupedMessages) this.f43532v6.f(j3);
    }

    public final boolean z9() {
        return !TextUtils.isEmpty(this.S3);
    }

    public final void za(int i10) {
        boolean z10;
        int i11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11 = false;
        if (i10 == 0) {
            int i12 = Build.VERSION.SDK_INT;
            if (i12 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i12 >= 24) {
                        Activity parentActivity = getParentActivity();
                        intent.putExtra("output", FileProvider.d(parentActivity, ApplicationLoader.getApplicationId() + ".provider", generatePicturePath));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(generatePicturePath));
                    }
                    this.T7 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e7) {
                FileLog.e(e7);
                return;
            }
        }
        try {
            if (i10 == 1) {
                Activity parentActivity2 = getParentActivity();
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 33) {
                    if (parentActivity2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i13 >= 23 && parentActivity2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (ChatObject.isChannel(this.f43315e) && (tL_chatBannedRights = this.f43315e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                fq0 fq0Var = new fq0(0, z10, true, this);
                if (this.P3 == 9) {
                    fq0Var.G = 1;
                    fq0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.f43315e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f43315e.slowmode_enabled) {
                        fq0Var.G = 10;
                        fq0Var.H = true;
                    } else {
                        MessageObject messageObject = this.f43431n5;
                        if (messageObject != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (messageObject == null) {
                            z11 = true;
                        }
                        fq0Var.G = i11;
                        fq0Var.H = z11;
                    }
                }
                fq0Var.V = new ol(this);
                presentFragment(fq0Var);
            } else if (i10 == 2) {
                int i14 = Build.VERSION.SDK_INT;
                if (i14 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File generateVideoPath = AndroidUtilities.generateVideoPath();
                    if (generateVideoPath != null) {
                        if (i14 >= 24) {
                            Activity parentActivity3 = getParentActivity();
                            intent2.putExtra("output", FileProvider.d(parentActivity3, ApplicationLoader.getApplicationId() + ".provider", generateVideoPath));
                            intent2.addFlags(2);
                            intent2.addFlags(1);
                        } else {
                            intent2.putExtra("output", Uri.fromFile(generateVideoPath));
                        }
                        intent2.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                        this.T7 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void zb(ArrayList arrayList) {
        xb(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void zc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f43390k1 > 0 && ((i10 = this.P3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f43353h1.e(4, z11, z10);
        this.f43353h1.c(4, this.f43390k1, z10);
    }

    @Override
    public final void M() {
    }

    public void U9(boolean z10) {
    }
}
