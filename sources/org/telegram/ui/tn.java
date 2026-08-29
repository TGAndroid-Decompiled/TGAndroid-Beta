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
import java.util.Iterator;
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
public class tn extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, yx, mc0, org.telegram.ui.Components.zj, org.telegram.ui.Components.ug, xf.b, org.telegram.ui.Components.l50, vd.b {
    public static int Dc = 22;
    public static float Ec = 1.4f;
    public static int Fc = 10;
    public static Pattern Gc;
    public static Pattern Hc;
    public static Pattern Ic;
    public static final int[] Jc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Kc = false;
    public static final Rect Lc = new Rect();
    public final zd.b A;
    public TextView A0;
    public ChannelBoostsController.CanApplyBoost A1;
    public final eg.r[] A2;
    public FlagSecureReason A3;
    public boolean A4;
    public TLObject A5;
    public final boolean[] A6;
    public boolean A7;
    public Matrix A8;
    public long A9;
    public zk Aa;
    public boolean Ab;
    public final ArrayList Ac;
    public final lg.e B;
    public jk B0;
    public boolean B1;
    public NumberTextView B2;
    public boolean B3;
    public boolean B4;
    public int B5;
    public boolean B6;
    public boolean B7;
    public Paint B8;
    public int B9;
    public final hl Ba;
    public final RectF Bb;
    public final ArrayList Bc;
    public final int C;
    public RadialProgressView C0;
    public ee C1;
    public int C2;
    public MessageObject C3;
    public int C4;
    public TLRPC.WebPage C5;
    public boolean C6;
    public boolean C7;
    public final Paint C8;
    public int C9;
    public final kl Ca;
    public org.telegram.ui.ActionBar.c2 Cb;
    public final Rect Cc;
    public final qg.d D;
    public AnimatorSet D0;
    public ImageView D1;
    public final AnimatorSet[] D2;
    public int D3;
    public ArrayList D4;
    public ArrayList D5;
    public boolean D6;
    public int D7;
    public float D8;
    public int D9;
    public ArrayList Da;
    public long Db;
    public final qg.d E;
    public boolean E0;
    public wj E1;
    public boolean E2;
    public MessageObject E3;
    public int E4;
    public String E5;
    public boolean E6;
    public boolean E7;
    public boolean E8;
    public int E9;
    public final sl Ea;
    public final ig Eb;
    public final lg.a F;
    public nh.t3 F0;
    public lh.s2 F1;
    public ImageView F2;
    public MessageObject F3;
    public HashMap F4;
    public od.i F5;
    public int F6;
    public MessageObject F7;
    public View F8;
    public boolean F9;
    public final bi Fa;
    public int Fb;
    public final lg.a G;
    public nh.t3 G0;
    public org.telegram.ui.ActionBar.r0 G1;
    public RadialProgressView G2;
    public sg.e G3;
    public final SparseArray G4;
    public TLRPC.ChatInvite G5;
    public int G6;
    public MessageObject G7;
    public float G8;
    public boolean G9;
    public final si Ga;
    public boolean Gb;
    public final qg.e H;
    public nh.t3 H0;
    public TextView H1;
    public ImageView H2;
    public jh.e1 H3;
    public int H4;
    public ee H5;
    public long H6;
    public int H7;
    public float H8;
    public boolean H9;
    public final gn Ha;
    public Pattern Hb;
    public final lg.a I;
    public org.telegram.ui.Components.vg I0;
    public boolean I1;
    public AnimatorSet I2;
    public rf.z0 I3;
    public final int[] I4;
    public final LongSparseIntArray I5;
    public boolean I6;
    public boolean I7;
    public Integer I8;
    public org.telegram.ui.Components.mi I9;
    public final df Ia;
    public MessageObject Ib;
    public org.telegram.ui.ActionBar.c2 J;
    public boolean J0;
    public TextView J1;
    public FrameLayout J2;
    public sg.d J3;
    public int J4;
    public boolean J5;
    public long J6;
    public boolean J7;
    public int J8;
    public float J9;
    public final df Ja;
    public we Jb;
    public boolean K;
    public ik K0;
    public TextView K1;
    public ek K2;
    public int K3;
    public boolean K4;
    public boolean K5;
    public final ArrayList K6;
    public long K7;
    public boolean K8;
    public float K9;
    public boolean Ka;
    public ArrayList Kb;
    public FrameLayout L;
    public ug.c L0;
    public qk L1;
    public TextView L2;
    public TL_account.TL_businessChatLink L3;
    public int L4;
    public long L5;
    public final Paint L6;
    public String L7;
    public AnimatorSet L8;
    public np L9;
    public boolean La;
    public final BotForumHelper.BotDraftAnimationsPool Lb;
    public cg.i0 M;
    public FrameLayout M0;
    public TextView M1;
    public TextView M2;
    public String M3;
    public int M4;
    public boolean M5;
    public final Paint M6;
    public Integer M7;
    public org.telegram.ui.ActionBar.o1 M8;
    public Animator M9;
    public long Ma;
    public final sg.a Mb;
    public hk N;
    public LinearLayout N0;
    public org.telegram.ui.Components.m21 N1;
    public hk N2;
    public int N3;
    public boolean N4;
    public boolean N5;
    public final ColorMatrix N6;
    public byte[] N7;
    public boolean N8;
    public boolean N9;
    public NotificationCenter.ObserversGroup Na;
    public boolean Nb;
    public sg.f O;
    public org.telegram.ui.Components.co O0;
    public sf.f O1;
    public ImageView O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final m.f3 O6;
    public int O7;
    public org.telegram.ui.ActionBar.g1[] O8;
    public boolean O9;
    public NotificationCenter.ObserversGroup Oa;
    public boolean Ob;
    public View P;
    public li P0;
    public org.telegram.ui.Components.y80 P1;
    public ImageView P2;
    public boolean P3;
    public AnimatorSet P4;
    public long P5;
    public final org.telegram.ui.ActionBar.d5 P6;
    public int P7;
    public org.telegram.ui.ActionBar.g1 P8;
    public tn P9;
    public boolean Pa;
    public boolean Pb;
    public FrameLayout Q;
    public sf.t1 Q0;
    public ImageView Q1;
    public org.telegram.ui.Components.o6 Q2;
    public String Q3;
    public final SparseIntArray Q4;
    public Long Q5;
    public long Q6;
    public ee Q7;
    public final vj Q8;
    public float Q9;
    public int Qa;
    public long Qb;
    public FrameLayout R;
    public sf.v R0;
    public ph.l R1;
    public org.telegram.ui.Components.o6 R2;
    public byte[] R3;
    public final SparseIntArray R4;
    public int R5;
    public int R6;
    public String R7;
    public fm R8;
    public AnimatorSet R9;
    public int Ra;
    public boolean Rb;
    public final sg.k S;
    public sg.i S0;
    public TextView S1;
    public org.telegram.ui.Components.o6 S2;
    public String S3;
    public boolean S4;
    public final SparseArray[] S5;
    public int S6;
    public ChatObject.Call S7;
    public lk S8;
    public final ek S9;
    public boolean Sa;
    public boolean Sb;
    public ug.f T;
    public km T0;
    public yj T1;
    public uj T2;
    public MessageObject T3;
    public boolean T4;
    public final SparseArray[] T5;
    public final Matrix T6;
    public boolean T7;
    public int T8;
    public fh.k T9;
    public boolean Ta;
    public boolean Tb;
    public dk U;
    public org.telegram.ui.Components.yn U0;
    public FrameLayout U1;
    public tj U2;
    public MessageObject U3;
    public boolean U4;
    public final SparseArray[] U5;
    public LinearGradient U6;
    public boolean U7;
    public int U8;
    public kg.v U9;
    public a0.h Ua;
    public boolean Ub;
    public fk V;
    public final ArrayList V0;
    public yj V1;
    public org.telegram.ui.Cells.v0 V2;
    public boolean V3;
    public boolean V4;
    public boolean V5;
    public int V6;
    public TLRPC.ChatFull V7;
    public int V8;
    public f41 V9;
    public a0.h Va;
    public w8 Vb;
    public bg.x2 W;
    public gj W0;
    public FrameLayout W1;
    public int W2;
    public ArrayList W3;
    public boolean W4;
    public int W5;
    public int W6;
    public TLRPC.UserFull W7;
    public boolean W8;
    public boolean W9;
    public long Wa;
    public int Wb;
    public int X;
    public org.telegram.ui.Components.o6 X0;
    public TextView X1;
    public xk X2;
    public MessageObject X3;
    public boolean X4;
    public int X5;
    public final Paint X6;
    public org.telegram.ui.Cells.d6 X7;
    public boolean X8;
    public org.telegram.ui.Components.gp X9;
    public uk Xa;
    public ValueAnimator Xb;
    public org.telegram.ui.ActionBar.u0 Y;
    public dh Y0;
    public org.telegram.ui.Components.p00 Y1;
    public View Y2;
    public TLRPC.TL_forumTopic Y3;
    public MessageObject Y4;
    public int Y5;
    public final Matrix Y6;
    public k01 Y7;
    public lm Y8;
    public rn Y9;
    public boolean Ya;
    public ni Yb;
    public vr Z;
    public org.telegram.ui.Components.fy0 Z0;
    public org.telegram.ui.Components.qw0 Z1;
    public boolean Z2;
    public long Z3;
    public MessageObject Z4;
    public int Z5;
    public LinearGradient Z6;
    public final a0.h Z7;
    public org.telegram.ui.Cells.s1 Z8;
    public tn Z9;
    public boolean Za;
    public boolean Zb;
    public int f42736a;
    public org.telegram.ui.ActionBar.z f42737a0;
    public org.telegram.ui.ActionBar.u0 f42738a1;
    public org.telegram.ui.Components.g40 a2;
    public boolean f42739a3;
    public int f42740a4;
    public MessageObject.GroupedMessages f42741a5;
    public int f42742a6;
    public boolean f42743a7;
    public String f42744a8;
    public boolean f42745a9;
    public rn f42746aa;
    public boolean f42747ab;
    public int f42748ac;
    public boolean f42749b;
    public org.telegram.ui.ActionBar.u0 f42750b0;
    public org.telegram.ui.ActionBar.u0 f42751b1;
    public org.telegram.ui.Components.g40 f42752b2;
    public boolean f42753b3;
    public TLRPC.Chat f42754b4;
    public MessagePreviewParams f42755b5;
    public int f42756b6;
    public boolean f42757b7;
    public long f42758b8;
    public boolean f42759b9;
    public hh.e f42760ba;
    public ArrayList f42761bb;
    public int f42762bc;
    public boolean f42763c;
    public org.telegram.ui.ActionBar.u0 f42764c0;
    public org.telegram.ui.ActionBar.u0 f42765c1;
    public zi f42766c2;
    public AnimatorSet c3;
    public boolean f42767c4;
    public MessageSuggestionParams f42768c5;
    public int c6;
    public int f42769c7;
    public String f42770c8;
    public boolean f42771c9;
    public final ChatMessagesMetadataController f42772ca;
    public ValueAnimator f42773cb;
    public int f42774cc;
    public boolean d;
    public org.telegram.ui.ActionBar.w0 f42775d0;
    public org.telegram.ui.ActionBar.u0 f42776d1;
    public boolean f42777d2;
    public ValueAnimator f42778d3;
    public boolean f42779d4;
    public MessageObject f42780d5;
    public final ArrayList f42781d6;
    public boolean f42782d7;
    public boolean f42783d8;
    public il f42784d9;
    public TLRPC.TL_channels_sendAsPeers da;
    public boolean f42785db;
    public int f42786dc;
    public TLRPC.Chat f42787e;
    public org.telegram.ui.ActionBar.z f42788e0;
    public org.telegram.ui.Components.jo f42789e1;
    public org.telegram.ui.Components.g40 f42790e2;
    public float f42791e3;
    public boolean f42792e4;
    public MessageObject.GroupedMessages f42793e5;
    public boolean f42794e6;
    public boolean f42795e7;
    public boolean f42796e8;
    public boolean f42797e9;
    public TL_account.resolvedBusinessChatLinks f42798ea;
    public Boolean f42799eb;
    public int f42800ec;
    public TLRPC.User f42801f;
    public org.telegram.ui.ActionBar.w0 f42802f0;
    public ug.g f42803f1;
    public boolean f42804f2;
    public boolean f42805f3;
    public boolean f42806f4;
    public MessageObject.GroupedMessages f42807f5;
    public int f42808f6;
    public int f42809f7;
    public String f42810f8;
    public float f9;
    public boolean f42811fa;
    public boolean f42812fb;
    public boolean f42813fc;
    public org.telegram.ui.ActionBar.w0 f42814g0;
    public boolean f42815g1;
    public org.telegram.ui.Components.g40 f42816g2;
    public boolean f42817g3;
    public int f42818g4;
    public MessageObject f42819g5;
    public int f42820g6;
    public boolean f42821g7;
    public String f42822g8;
    public xj f42823g9;
    public boolean f42824ga;
    public boolean f42825gb;
    public long gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.u0 f42826h0;
    public int f42827h1;
    public org.telegram.ui.Components.g40 f42828h2;
    public boolean f42829h3;
    public int f42830h4;
    public jn f42831h5;
    public int f42832h6;
    public boolean f42833h7;
    public MessageObject f42834h8;
    public org.telegram.ui.Cells.s1 f42835h9;
    public float f42836ha;
    public int f42837hb;
    public TLRPC.TL_messages_discussionMessage hc;
    public org.telegram.ui.ActionBar.w0 f42838i0;
    public int f42839i1;
    public org.telegram.ui.Components.g40 f42840i2;
    public boolean f42841i3;
    public int f42842i4;
    public boolean f42843i5;
    public boolean f42844i6;
    public boolean f42845i7;
    public MessageObject f42846i8;
    public org.telegram.ui.Components.n00 f42847i9;
    public final cg f42848ia;
    public HashMap f42849ib;
    public TLRPC.messages_Messages f42850ic;
    public org.telegram.ui.ActionBar.z f42851j0;
    public org.telegram.ui.Components.mc f42852j1;
    public org.telegram.ui.Components.g40 f42853j2;
    public boolean f42854j3;
    public ph f42855j4;
    public MessageObject f42856j5;
    public final ArrayList f42857j6;
    public int f42858j7;
    public int f42859j8;
    public boolean f42860j9;
    public final nk f42861ja;
    public df f42862jb;
    public boolean f42863jc;
    public boolean f42864k0;
    public pk f42865k1;
    public org.telegram.ui.Components.g40 f42866k2;
    public TLRPC.User f42867k3;
    public final SparseArray f42868k4;
    public int f42869k5;
    public final SparseArray[] f42870k6;
    public int f42871k7;
    public boolean f42872k8;
    public boolean k9;
    public int f42873ka;
    public int f42874kb;
    public ln f42875kc;
    public RadialProgressView f42876l0;
    public bk l1;
    public org.telegram.ui.Cells.s1 f42877l2;
    public TLRPC.Chat f42878l3;
    public final ArrayList f42879l4;
    public MessageObject f42880l5;
    public final SparseArray f42881l6;
    public boolean f42882l7;
    public long f42883l8;
    public ValueAnimator f42884l9;
    public int f42885la;
    public org.telegram.ui.ActionBar.c2 f42886lb;
    public fn lc;
    public org.telegram.ui.ActionBar.u0 m0;
    public nh.g1 f42887m1;
    public int f42888m2;
    public kg.q0 f42889m3;
    public int f42890m4;
    public boolean f42891m5;
    public final SparseArray f42892m6;
    public ee f42893m7;
    public long f42894m8;
    public ValueAnimator f42895m9;
    public df ma;
    public int f42896mb;
    public jh.m5 f42897mc;
    public boolean f42898n;
    public org.telegram.ui.ActionBar.u0 f42899n0;
    public int f42900n1;
    public int f42901n2;
    public boolean f42902n3;
    public boolean f42903n4;
    public boolean f42904n5;
    public final HashMap f42905n6;
    public String f42906n7;
    public boolean f42907n8;
    public boolean f42908n9;
    public boolean f42909na;
    public int f42910nb;
    public boolean f42911nc;
    public org.telegram.ui.ActionBar.u0 f42912o0;
    public boolean f42913o1;
    public org.telegram.ui.Components.g40 f42914o2;
    public boolean f42915o3;
    public boolean f42916o4;
    public boolean f42917o5;
    public final SparseArray f42918o6;
    public boolean f42919o7;
    public String f42920o8;
    public float f42921o9;
    public boolean f42922oa;
    public boolean ob;
    public float f42923oc;
    public org.telegram.ui.ActionBar.u0 f42924p0;
    public org.telegram.ui.Components.b40 f42925p1;
    public org.telegram.ui.Components.g40 f42926p2;
    public String f42927p3;
    public int f42928p4;
    public boolean f42929p5;
    public final a0.h f42930p6;
    public boolean f42931p7;
    public hk f42932p8;
    public float f42933p9;
    public long f42934pa;
    public int f42935pb;
    public float f42936pc;
    public ClippingImageView f42937q0;
    public org.telegram.ui.ActionBar.c2 f42938q1;
    public org.telegram.ui.Components.g40 f42939q2;
    public String f42940q3;
    public final ArrayList f42941q4;
    public int f42942q5;
    public final ArrayList q6;
    public int f42943q7;
    public org.telegram.ui.Cells.s1 f42944q8;
    public int q9;
    public int f42945qa;
    public boolean qb;
    public final vd.a f42946qc;
    public long f42947r;
    public org.telegram.ui.Components.p01 f42948r0;
    public nh.t3 f42949r1;
    public org.telegram.ui.Components.kp f42950r2;
    public int f42951r3;
    public final HashMap f42952r4;
    public int f42953r5;
    public final SparseArray r6;
    public int f42954r7;
    public e5.c f42955r8;
    public int r9;
    public int f42956ra;
    public int f42957rb;
    public final vd.a f42958rc;
    public final HashMap f42959s;
    public f2.o0 f42960s0;
    public nh.t3 f42961s1;
    public View f42962s2;
    public int f42963s3;
    public MessageObject f42964s4;
    public TLRPC.PhotoSize f42965s5;
    public final a0.h f42966s6;
    public int f42967s7;
    public TextureView f42968s8;
    public float f42969s9;
    public mk f42970sa;
    public int f42971sb;
    public final vd.a f42972sc;
    public lj f42973t0;
    public nh.t3 f42974t1;
    public bl f42975t2;
    public int f42976t3;
    public int f42977t4;
    public TLRPC.PhotoSize f42978t5;
    public final a0.h f42979t6;
    public int f42980t7;
    public boolean f42981t8;
    public float f42982t9;
    public ok f42983ta;
    public int f42984tb;
    public final vd.a f42985tc;
    public nj f42986u0;
    public nh.t3 f42987u1;
    public cg.i0 f42988u2;
    public UndoView f42989u3;
    public int f42990u4;
    public TLObject f42991u5;
    public final int[] f42992u6;
    public int f42993u7;
    public final df f42994u8;
    public float f42995u9;
    public float f42996ua;
    public CharacterStyle f42997ub;
    public final vd.a f42998uc;
    public final ah.i v;
    public oj f42999v0;
    public nh.t3 f43000v1;
    public org.telegram.ui.Components.rf0 f43001v2;
    public al f43002v3;
    public final ArrayList f43003v4;
    public int f43004v5;
    public final int[] f43005v6;
    public int f43006v7;
    public final qg.b f43007v8;
    public float f43008v9;
    public int f43009va;
    public String f43010vb;
    public final vd.a f43011vc;
    public aj f43012w;
    public em f43013w0;
    public nh.t3 f43014w1;
    public boolean f43015w2;
    public org.telegram.ui.Components.mc f43016w3;
    public int f43017w4;
    public int f43018w5;
    public final int[] f43019w6;
    public boolean f43020w7;
    public final lg.a f43021w8;
    public float f43022w9;
    public int f43023wa;
    public ye.c f43024wb;
    public final vd.a f43025wc;
    public aj f43026x;
    public kk f43027x0;
    public pl f43028x1;
    public final org.telegram.ui.Components.t9[] f43029x2;
    public boolean f43030x3;
    public int x4;
    public boolean f43031x5;
    public final int[] f43032x6;
    public int f43033x7;
    public Bitmap f43034x8;
    public TLRPC.Document f43035x9;
    public ChatMessageSharedResources xa;
    public boolean xb;
    public final f5.u f43036xc;
    public final zd.b f43037y;
    public boolean f43038y0;
    public float f43039y1;
    public final sn[] f43040y2;
    public int f43041y3;
    public df f43042y4;
    public TLRPC.PhotoSize f43043y5;
    public final boolean[] f43044y6;
    public int f43045y7;
    public BitmapShader y8;
    public boolean f43046y9;
    public ValueAnimator f43047ya;
    public ee f43048yb;
    public bh.f f43049yc;
    public org.telegram.ui.Components.y80 f43050z0;
    public TL_stories.TL_premium_boostsStatus f43051z1;
    public final org.telegram.ui.ActionBar.h5[] f43052z2;
    public boolean f43053z3;
    public boolean f43054z4;
    public TLRPC.PhotoSize f43055z5;
    public final boolean[] f43056z6;
    public int f43057z7;
    public Paint f43058z8;
    public boolean f43059z9;
    public float f43060za;
    public boolean f43061zb;
    public jf.e0 f43062zc;

    public tn(Bundle bundle) {
        super(bundle);
        this.f42736a = 0;
        this.f42763c = false;
        this.d = false;
        this.f42959s = new HashMap();
        this.v = new ah.i(new df(this, 18));
        zd.b bVar = new zd.b(true);
        this.f43037y = bVar;
        zd.b bVar2 = new zd.b(true);
        this.A = bVar2;
        this.S = new sg.k();
        this.V0 = new ArrayList();
        this.f43029x2 = new org.telegram.ui.Components.t9[2];
        this.f43040y2 = new sn[2];
        this.f43052z2 = new org.telegram.ui.ActionBar.h5[2];
        this.A2 = new eg.r[2];
        this.D2 = new AnimatorSet[2];
        this.E2 = false;
        this.W2 = 500;
        this.L3 = null;
        this.O3 = -1;
        this.V3 = true;
        this.f42868k4 = new SparseArray();
        this.f42879l4 = new ArrayList();
        this.f42941q4 = new ArrayList();
        this.f42952r4 = new HashMap();
        this.f42977t4 = -1;
        this.f42990u4 = 0;
        this.f43003v4 = new ArrayList(10);
        this.D4 = new ArrayList();
        this.F4 = new HashMap();
        this.G4 = new SparseArray();
        this.I4 = new int[1];
        this.Q4 = new SparseIntArray();
        this.R4 = new SparseIntArray();
        this.V4 = true;
        this.X4 = true;
        this.f42891m5 = true;
        this.f42929p5 = true;
        this.I5 = new LongSparseIntArray();
        this.R5 = 1;
        this.S5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.T5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.U5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f42781d6 = new ArrayList();
        this.f42794e6 = true;
        this.f42820g6 = Integer.MIN_VALUE;
        this.f42857j6 = new ArrayList();
        this.f42870k6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f42881l6 = new SparseArray();
        this.f42892m6 = new SparseArray();
        this.f42905n6 = new HashMap();
        this.f42918o6 = new SparseArray();
        this.f42930p6 = new a0.h();
        this.q6 = new ArrayList();
        this.r6 = new SparseArray();
        this.f42966s6 = new a0.h();
        this.f42979t6 = new a0.h();
        this.f42992u6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f43005v6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f43019w6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f43032x6 = new int[2];
        this.f43044y6 = new boolean[2];
        this.f43056z6 = new boolean[2];
        this.A6 = new boolean[]{true, true};
        this.C6 = true;
        this.D6 = true;
        this.G6 = 0;
        this.K6 = new ArrayList();
        this.L6 = new Paint(1);
        this.M6 = new Paint(1);
        this.N6 = new ColorMatrix();
        this.O6 = new m.f3();
        this.P6 = new org.telegram.ui.ActionBar.d5(0, false, false, new hj(this));
        this.T6 = new Matrix();
        Paint paint = new Paint(1);
        this.X6 = paint;
        this.Y6 = new Matrix();
        this.f42858j7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f42980t7 = Integer.MAX_VALUE;
        this.f42993u7 = -1;
        this.C7 = true;
        this.H7 = Integer.MAX_VALUE;
        this.O7 = -1;
        this.P7 = -10000;
        this.Z7 = new a0.h();
        this.f42994u8 = new df(this, 23);
        qg.b bVar3 = new qg.b();
        this.f43007v8 = bVar3;
        lg.a aVar = new lg.a(bVar3);
        this.f43021w8 = aVar;
        this.C8 = new Paint(1);
        this.D8 = 0.0f;
        this.G8 = 1.0f;
        this.H8 = 0.0f;
        this.N8 = true;
        this.Q8 = new vj(this);
        this.f42860j9 = true;
        this.S9 = new ek(this, 0);
        this.f42772ca = new ChatMessagesMetadataController(this);
        this.f42848ia = new cg(this, 0);
        this.f42861ja = new nk(this);
        this.f42885la = -1;
        this.Ba = new hl(this);
        this.Ca = new kl(this);
        this.Ea = new sl(this);
        this.Fa = new bi(this);
        this.Ga = new si(this);
        this.Ha = new gn(this);
        this.Ia = new df(this, 26);
        this.Ja = new df(this, 27);
        this.Za = false;
        this.Bb = new RectF();
        this.Eb = new ig(this, 1);
        this.Lb = new BotForumHelper.BotDraftAnimationsPool();
        this.Mb = new Object();
        this.Zb = false;
        org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
        this.f42946qc = new vd.a(0, this, jrVar, 320L, false);
        this.f42958rc = new vd.a(1, this, jrVar, 520L, false);
        this.f42972sc = new vd.a(2, this, jrVar, 520L, false);
        this.f42985tc = new vd.a(3, this, jrVar, 320L, false);
        this.f42998uc = new vd.a(4, this, jrVar, 320L, false);
        this.f43011vc = new vd.a(5, this, jrVar, 320L, false);
        this.f43025wc = new vd.a(6, this, jrVar, 320L, false);
        ig igVar = new ig(this, 5);
        ?? obj = new Object();
        obj.f6632b = new float[32];
        obj.f6631a = 1;
        obj.d = new vd.k(obj, ud.a.f49172a, 240L);
        obj.f6633c = igVar;
        this.f43036xc = obj;
        this.Ac = new ArrayList();
        this.Bc = new ArrayList();
        this.Cc = new Rect();
        ?? obj2 = new Object();
        this.H = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            lg.e eVar = new lg.e(false);
            this.B = eVar;
            this.C = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            qg.d dVar = new qg.d(obj2);
            this.E = dVar;
            dVar.v = new ig(this, 8);
            dVar.d = eVar;
            dVar.f46671e = -3;
            dVar.f46672f = obj2;
            lg.a aVar2 = new lg.a(dVar);
            this.G = aVar2;
            aVar2.f15225f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                qg.d dVar2 = new qg.d(obj2);
                this.D = dVar2;
                dVar2.v = new ig(this, 8);
                dVar2.d = eVar;
                dVar2.f46671e = -2;
                dVar2.f46672f = obj2;
                lg.a aVar3 = new lg.a(dVar2);
                this.F = aVar3;
                aVar3.f15225f = LiteMode.isEnabled(262144);
            } else {
                this.D = null;
                this.F = aVar2;
            }
        } else {
            this.B = null;
            this.C = 0;
            this.D = null;
            this.E = null;
            this.F = new lg.a(obj2);
            this.G = new lg.a(obj2);
        }
        lg.a aVar4 = new lg.a(obj2);
        this.I = aVar4;
        aVar4.f15223c = bVar;
        this.F.f15223c = bVar;
        this.G.f15223c = bVar;
        aVar.f15223c = new zd.b(true);
        aVar4.f15222b = bVar2;
        this.F.f15222b = bVar2;
        this.G.f15222b = bVar2;
        aVar.f15222b = bVar2;
    }

    public static void A0(tn tnVar) {
        org.telegram.ui.Components.h40.h.a();
        tnVar.showDialog(new ih.h2(tnVar.getParentActivity(), tnVar.currentAccount, tnVar.a(), null, null));
    }

    public static org.telegram.ui.zt0 A1(org.telegram.ui.tn r16, org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.A1(org.telegram.ui.tn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.zt0");
    }

    public static void B0(tn tnVar) {
        tnVar.X9 = null;
        tnVar.f42973t0.setOnInterceptTouchListener(null);
        tnVar.jb(tnVar.T0, true);
        ChatThemeController.getInstance(tnVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void B1(tn tnVar) {
        SparseArray[] sparseArrayArr = tnVar.S5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) tnVar.f42870k6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            tnVar.T5[i10].clear();
            tnVar.U5[i10].clear();
        }
        if (tnVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(tnVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(tnVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                tnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        tnVar.c9();
        tnVar.yc(0, true);
        tnVar.Wc(false);
        tnVar.Lc();
    }

    public static CharSequence B8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.t21.k(messageObject)) {
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

    public static void C0(tn tnVar) {
        if (tnVar.T2.getAlpha() != 0.0f && !tnVar.actionBar.s() && !tnVar.A9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(tnVar.T2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            tnVar.G9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static TLRPC.TL_message C7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22413id = message.f22413id;
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

    public static void D0(org.telegram.ui.tn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.s1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.D0(org.telegram.ui.tn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.s1, int, int):void");
    }

    public static SpannableStringBuilder D8(MessageObject messageObject, boolean z10, long j10) {
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

    public static void E0(tn tnVar) {
        tnVar.G7(false);
        if (!tnVar.fragmentBeginToShow) {
            lj ljVar = tnVar.f42973t0;
            ljVar.U1 = false;
            ljVar.V1 = 0;
            ljVar.setEmptyView(tnVar.M0);
            lj ljVar2 = tnVar.f42973t0;
            ljVar2.U1 = true;
            ljVar2.V1 = 1;
            return;
        }
        tnVar.f42973t0.setEmptyView(tnVar.M0);
    }

    public static void F0(org.telegram.ui.tn r19, org.telegram.ui.gk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.F0(org.telegram.ui.tn, org.telegram.ui.gk, boolean[]):void");
    }

    public static void G0(tn tnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(tnVar.currentAccount).getInputUser(user.f22539id);
                    ConnectionsManager.getInstance(tnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new bg.h3(29, tnVar, user));
                }
            }
        }
    }

    public static void G1(tn tnVar) {
        int i10;
        if (tnVar.a() == tnVar.getUserConfig().getClientUserId() && tnVar.getUserConfig().isPremium() && tnVar.Xa == null) {
            uk ukVar = new uk(tnVar, tnVar, tnVar.getParentActivity(), tnVar.currentAccount, tnVar.f42746aa);
            tnVar.Xa = ukVar;
            ukVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            tnVar.Xa.setDelegate(new vk(tnVar));
            tnVar.Xa.setTop(true);
            int i11 = 0;
            tnVar.Xa.setClipChildren(false);
            tnVar.Xa.setClipToPadding(false);
            tnVar.Xa.setVisibility(0);
            uk ukVar2 = tnVar.Xa;
            if (ukVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            ukVar2.setHint(LocaleController.getString(i10));
            tnVar.T0.addView(tnVar.Xa, i7.f6.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            tnVar.Xa.p(null, null, true);
            tnVar.Xa.setTranslationY(-AndroidUtilities.dp(12.0f));
            tnVar.Xa.setScaleY(0.4f);
            tnVar.Xa.setScaleX(0.4f);
            tnVar.Xa.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.jr.h).start();
            tnVar.Lc();
            uk ukVar3 = tnVar.Xa;
            float f9 = tnVar.f42969s9;
            pk pkVar = tnVar.f42865k1;
            if (pkVar != null) {
                i11 = pkVar.getCurrentHeight();
            }
            ukVar3.setTranslationY(f9 + i11);
        }
    }

    public static java.util.ArrayList H7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.H7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void I0(tn tnVar, String str) {
        Uri parse = Uri.parse(str);
        u50.b(tnVar.getParentActivity(), tnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void J0(tn tnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        cg.f2 f2Var = new cg.f2(tnVar, tnVar.currentAccount, user, null, null, tnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            f2Var.f3146z0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(tnVar.getParentActivity());
        org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(160.0f), 4, t9Var, false);
        t9Var.setImageDrawable(n5Var);
        t9Var.addOnAttachStateChangeListener(new f5(n5Var, 1));
        n5Var.j(j10, false);
        f2Var.A0 = true;
        f2Var.f3144x0 = t9Var;
        tnVar.showDialog(f2Var);
    }

    public static void J3(tn tnVar) {
        org.telegram.ui.ActionBar.z zVar;
        if (!tnVar.Za && (zVar = tnVar.f42788e0) != null) {
            zVar.a();
            org.telegram.ui.ActionBar.w0 w0Var = zVar.f24004m;
            w0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (tnVar.N3 == 0) {
                w0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            w0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            w0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.t41(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            w0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = tnVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f29024a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.i01(obj, 0), 0, spannableStringBuilder4.length(), 33);
                w0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f29024a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.i01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                w0Var.g(56, spannableStringBuilder5);
            }
            w0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (tnVar.h == null) {
                w0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            w0Var.g(54, LocaleController.getString(R.string.Regular));
            tnVar.Za = true;
        }
    }

    public static FrameLayout J7(Context context, org.telegram.ui.ActionBar.c6 c6Var, CharSequence charSequence, int i10) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        eg.r rVar = new eg.r(context, 11);
        int i11 = 3;
        rVar.setMaxLines(3);
        rVar.setGravity(3);
        rVar.setEllipsize(TextUtils.TruncateAt.END);
        rVar.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.E8, c6Var));
        rVar.setTextSize(1, i10);
        rVar.setMaxWidth(AndroidUtilities.dp(170.0f));
        rVar.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(rVar, i7.f6.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void K0(tn tnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            jh.ia.j1(tnVar.getParentActivity(), tnVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, tnVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            tnVar.presentFragment(new bo0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void L0(tn tnVar) {
        if (AndroidUtilities.addToClipboard(tnVar.Ib.sponsoredInfo)) {
            b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.resourceProvider));
        }
    }

    public static void M0(tn tnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = tnVar.E1.getAdapter().f47385s0;
        int i10 = tnVar.currentAccount;
        TLRPC.User user2 = tnVar.f42801f;
        if (user2 != null) {
            j10 = user2.f22539id;
        } else {
            j10 = tnVar.f42787e.f22392id;
        }
        ph.y3 b10 = ph.y3.b(i10, j10, user.f22539id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, tnVar.N8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().m(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(tnVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(tnVar.currentAccount);
            MessagesController.showCantOpenAlert(tnVar, restrictionReason);
            return;
        }
        ph.p2 p2Var = new ph.p2(tnVar.getParentActivity(), tnVar.getResourceProvider());
        p2Var.w(false);
        p2Var.f45986w0 = true;
        p2Var.f45967g0 = tnVar.getParentActivity();
        p2Var.s(tnVar, b10);
        p2Var.show();
    }

    public static void N0(tn tnVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (tnVar.f42837hb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            tnVar.C5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                tnVar.C5 = null;
                MessagePreviewParams messagePreviewParams = tnVar.f42755b5;
                if (messagePreviewParams != null) {
                    int i11 = tnVar.currentAccount;
                    CharSequence fieldText = tnVar.U.getFieldText();
                    MessageObject messageObject3 = tnVar.f42856j5;
                    if (messageObject3 == tnVar.T3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, tnVar.f42831h5, tnVar.f42880l5);
                }
                tnVar.j8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                tnVar.E5 = str;
            }
            if (tnVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = tnVar.f42755b5;
            if (messagePreviewParams2 != null) {
                int i12 = tnVar.currentAccount;
                CharSequence fieldText2 = tnVar.U.getFieldText();
                MessageObject messageObject4 = tnVar.f42856j5;
                if (messageObject4 == tnVar.T3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, tnVar.f42831h5, tnVar.f42880l5);
            }
            tnVar.Eb(true, tnVar.C5, false);
            return;
        }
        tnVar.C5 = null;
        tnVar.j8();
    }

    public static void O0(tn tnVar, Long l10, Boolean bool) {
        int i10;
        int i11;
        if (l10.longValue() != tnVar.b()) {
            tnVar.Wa = SystemClock.uptimeMillis();
            tnVar.f42882l7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                tnVar.Sa(tnVar.b());
            } else if (tnVar.b() == 0) {
                tnVar.Sa(l10.longValue());
            } else {
                tnVar.f42858j7 = -1;
            }
            tnVar.getConnectionsManager().cancelRequestsForGuid(tnVar.classGuid);
            tnVar.getMessagesStorage().cancelTasksForGuid(tnVar.classGuid);
            tnVar.classGuid = ConnectionsManager.generateClassGuid();
            tnVar.Pa();
            tnVar.f42755b5 = null;
            tnVar.f42943q7 = 0;
            tnVar.f42821g7 = false;
            tnVar.f42833h7 = true;
            tnVar.f42781d6.clear();
            tnVar.Z3 = l10.longValue();
            TLRPC.TL_forumTopic findTopic = tnVar.getMessagesController().getTopicsController().findTopic(-tnVar.a(), l10.longValue());
            if (l10.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                tnVar.f42818g4 = i12;
                tnVar.f42830h4 = findTopic.read_outbox_max_id;
                tnVar.f42842i4 = Math.max(1, i12);
                tnVar.getMessagesController().getTopicsController().getTopicRepliesCount(tnVar.P5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                tnVar.Y3 = null;
                tnVar.W3 = null;
                tnVar.T3 = null;
                tnVar.f42856j5 = null;
                tnVar.f42818g4 = 0;
                tnVar.f42830h4 = 0;
                tnVar.f42842i4 = 0;
                tnVar.Z3 = 0L;
                tnVar.f42740a4 = 0;
                tnVar.f42754b4 = null;
                tnVar.f42779d4 = false;
                tnVar.f42767c4 = false;
            }
            tnVar.r8();
            tnVar.Nc(true);
            tnVar.W0.n(true);
            tnVar.W0.b();
            tnVar.N1.setCurrentTopic(l10.longValue());
            tnVar.Qc(true);
            tnVar.hc(true);
            tnVar.getMessagesController().setForumLastTopicId(-tnVar.a(), tnVar.b());
            tnVar.g9(true);
            tnVar.e9(true);
            dk dkVar = tnVar.U;
            if (dkVar != null) {
                dkVar.m0(false);
                tnVar.U.G1(true);
            }
            tnVar.A6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            tnVar.f42827h1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            tnVar.f42839i1 = i11;
            tnVar.Bc(false);
            tnVar.Ac(false);
            tnVar.Rc();
            ln lnVar = tnVar.f42875kc;
            if (lnVar != null && tnVar.actionBar.f23612j0) {
                lnVar.p(null);
            }
        }
    }

    public static g5.v O4(tn tnVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = tnVar.getMessagesController().createDeleteShowOnceTask(tnVar.P5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                tnVar.tc(arrayList, true);
            }
            return new g5.v(tnVar, createDeleteShowOnceTask, messageObject, 16);
        }
        return null;
    }

    public static void P0(tn tnVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = tnVar.getParentActivity();
        int i12 = tnVar.currentAccount;
        long j10 = tnVar.P5;
        rn rnVar = tnVar.f42746aa;
        int i13 = org.telegram.ui.Components.co.H;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, rnVar, false, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23133h5, rnVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, rnVar)));
        linearLayout.addView((View) imageView, i7.f6.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, rnVar));
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, i7.f6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, rnVar));
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
        b.p(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, i7.f6.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            cg.d1 d1Var = new cg.d1(parentActivity, rnVar, true);
            d1Var.setOnClickListener(new org.telegram.ui.Components.d3(f3Var, 1));
            d1Var.c(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(d1Var, i7.f6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(linearLayout);
        f3Var.show();
    }

    public static void Q0(tn tnVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f22433id = tnVar.getMessagesController().getInputUser(tnVar.f42801f);
            tnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new he(tnVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(tnVar.getUserConfig().getCurrentUser(), tnVar.P5, messageObject, tnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = tnVar.C8();
        SendMessagesHelper.getInstance(tnVar.currentAccount).sendMessage(of2);
        if (tnVar.N3 == 0) {
            tnVar.O9(false);
        }
        tnVar.e9(false);
    }

    public static tn Q9(int i10, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i10);
        return new tn(bundle);
    }

    public static boolean R0(tn tnVar) {
        MessageObject messageObject = tnVar.Ib;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static tn R9(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new tn(bundle);
    }

    public static void S0(tn tnVar, int i10) {
        int i11;
        RectF rectF;
        qg.d dVar = tnVar.D;
        qg.d dVar2 = tnVar.E;
        ArrayList arrayList = tnVar.Bc;
        lg.e eVar = tnVar.B;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            if (i7.n8.a(i10, 4)) {
                tnVar.p9();
            }
            if (i7.n8.a(i10, 2)) {
                ArrayList arrayList2 = tnVar.Ac;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, tnVar.T0.getMeasuredWidth(), tnVar.f42973t0.getY() + tnVar.f42973t0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.c(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.c(arrayList2, i11, AndroidUtilities.dp(8.0f));
                    }
                } else {
                    i11 = 0;
                }
                int a2 = jf.l0.a(arrayList2, i11, arrayList);
                int measuredWidth = tnVar.T0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f9 = measuredWidth;
                    rectF2.left = i7.w.a(rectF2.left, 0.0f, f9);
                    rectF2.top = Math.max(tnVar.f42973t0.getY(), rectF2.top);
                    rectF2.right = i7.w.a(rectF2.right, 0.0f, f9);
                    rectF2.bottom = Math.min(tnVar.f42973t0.getY() + tnVar.f42973t0.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            km kmVar = tnVar.T0;
            Objects.requireNonNull(kmVar);
            if (eVar.e(new rf(kmVar, 0), tnVar.T0.getWidth(), tnVar.T0.getHeight())) {
                if (dVar != null) {
                    dVar.d();
                }
                if (dVar2 != null) {
                    dVar2.d();
                }
                org.telegram.ui.ActionBar.l lVar = tnVar.actionBar;
                if (lVar != null) {
                    lVar.invalidate();
                }
                tnVar.n9();
            }
        }
    }

    public static void T0(tn tnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(tnVar.currentAccount).getInputUser(user.f22539id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(tnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(tnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static MessageObject T1(tn tnVar) {
        org.telegram.ui.Cells.s1 s1Var = tnVar.Z8;
        if (com.google.android.recaptcha.internal.a.u(s1Var)) {
            return s1Var.getMessageObject();
        }
        return null;
    }

    public static void U(org.telegram.ui.tn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.U(org.telegram.ui.tn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void U0(tn tnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, hf hfVar) {
        String str4;
        org.telegram.ui.Components.d31 d31Var;
        if (tnVar.Z4 != null && i10 < arrayList.size() && tnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = tnVar.getParentActivity();
            int i11 = iArr[0];
            df dfVar = new df(tnVar, 20);
            String[] strArr = org.telegram.ui.Components.k31.N;
            if (parentActivity == null) {
                d31Var = null;
            } else {
                org.telegram.ui.Components.d31 d31Var2 = new org.telegram.ui.Components.d31(parentActivity, str, str4, inputPeer, i11, richMessage, dfVar);
                d31Var2.G(z10);
                d31Var2.I = tnVar;
                d31Var2.J = hfVar;
                if (tnVar.getParentActivity() != null) {
                    tnVar.showDialog(d31Var2);
                }
                d31Var = d31Var2;
            }
            d31Var.setDimBehind(false);
            tnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(tnVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + tnVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + tnVar.a(), i12 - 1).apply();
                tnVar.Qc(true);
            }
        }
    }

    public static void U4(tn tnVar, org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int themedColor;
        int i11;
        vd.a aVar = tnVar.f42972sc;
        if (tnVar.U != null && !aVar.f49506f && s1Var.getMessageObject() != null) {
            km kmVar = tnVar.T0;
            RectF rectF = AndroidUtilities.rectTmp;
            sg.i.c(s1Var, kmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            dh.a aVar2 = s1Var.W5;
            if (aVar2 != null && s1Var.f25400j6) {
                rect.set(aVar2.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((tnVar.T0.getMeasuredHeight() - tnVar.f42973t0.getPaddingBottom()) + tnVar.f42923oc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = s1Var.getMessageObject();
                if (tnVar.f43049yc == null) {
                    tnVar.f43049yc = new bh.f(tnVar.getParentActivity(), tnVar.resourceProvider, tnVar);
                    int indexOfChild = tnVar.T0.indexOfChild(tnVar.f42973t0);
                    if (indexOfChild >= 0) {
                        tnVar.T0.addView(tnVar.f43049yc, indexOfChild + 1, i7.f6.g());
                    } else {
                        tnVar.T0.addView(tnVar.f43049yc, i7.f6.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (s1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.g6.f23246nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.g6.f23332sb;
                    }
                    themedColor = tnVar.getThemedColor(i11);
                } else {
                    if (s1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.g6.f23266od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.g6.f23248nd;
                    }
                    themedColor = tnVar.getThemedColor(i10);
                }
                tnVar.f43049yc.setColor(themedColor);
                tnVar.f43049yc.setCellToWatch(s1Var);
                tnVar.f43049yc.f2655b.f2651a.a(false, false);
                tnVar.f43049yc.setAnimatedVisibility(aVar.f49505e);
                tnVar.f43049yc.f2655b.setOnClickListener(new ag.o(new ig(tnVar, 2), 4));
                bh.f fVar = tnVar.f43049yc;
                fVar.f2661s = new ig(tnVar, 3);
                bh.b bVar = fVar.f2654a;
                bVar.setOnKeyListener(new jg(tnVar, 0));
                bVar.setOnEditorActionListener(new da(tnVar, 1));
                tnVar.U.P4 = bVar;
                AndroidUtilities.runOnUIThread(new ag.v0(tnVar, measuredHeight, bVar, 28), 100L);
                aVar.a(true, true);
            }
        }
    }

    public static void V(tn tnVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new te(tnVar, i10, 6));
        } else {
            tnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void V0(tn tnVar, TLRPC.ReactionCount reactionCount) {
        tnVar.A7(true);
        org.telegram.ui.Components.en0.c(tnVar.getParentActivity(), tnVar.currentAccount, reactionCount.reaction, tnVar.f42746aa);
    }

    public static void V1(tn tnVar, float f9) {
        org.telegram.ui.Cells.s1 s1Var = tnVar.Z8;
        if (com.google.android.recaptcha.internal.a.u(s1Var)) {
            s1Var.setSlidingOffset(f9);
        }
    }

    public static void W(tn tnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(tnVar.currentAccount).loadAttachMenuBots(false, true);
            tnVar.W9(user.f22539id, tnVar.f42822g8, false);
        }
    }

    public static void W0(tn tnVar, String str) {
        if (MessagesController.getInstance(tnVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            ye.d.m(tnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.c5.o0(tnVar.getParentActivity(), tnVar.f42746aa, str, true, new bg(tnVar, str, 1));
        }
    }

    public static void X(tn tnVar) {
        if (!tnVar.e7(tnVar.U.getSendButton())) {
            if (tnVar.getMediaController().isPlayingMessage(tnVar.Z4)) {
                tnVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = tnVar.getMessagesController().getInputPeer(tnVar.P5);
            if (tnVar.f42741a5 != null) {
                for (int i10 = 0; i10 < tnVar.f42741a5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f22508id.add(Integer.valueOf(tnVar.f42741a5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f22508id.add(Integer.valueOf(tnVar.Z4.getId()));
            }
            ConnectionsManager.getInstance(tnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new zg(0, tnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void X0(tn tnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        tnVar.Mb(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void X1(tn tnVar) {
        long j10;
        np npVar = tnVar.L9;
        if (npVar != null) {
            if (tnVar.f42779d4) {
                if (npVar.D != null) {
                    if (tnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.l9.a(tnVar, tnVar.getParentLayout().getFragmentStack().indexOf(tnVar), tnVar.f42787e, tnVar.f42801f, tnVar.Y3, tnVar.P5, tnVar.f42956ra, tnVar.f42945qa);
                    }
                    TLRPC.Chat chat = tnVar.f42787e;
                    TLRPC.TL_forumTopic tL_forumTopic = tnVar.L9.D;
                    long j11 = tnVar.P5;
                    int i10 = tnVar.f42945qa;
                    int i11 = tnVar.f42956ra;
                    if (tnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.l9.a(tnVar, tnVar.getParentLayout().getFragmentStack().indexOf(tnVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", tnVar.L9.f40856a);
                    bundle.putInt("dialog_filter_id", tnVar.L9.f40858b);
                    bundle.putBoolean("pulled", true);
                    tn g10 = yf.d.g(tnVar, -tnVar.P5, tnVar.L9.D, 0, bundle);
                    g10.N9 = true;
                    Kc = true;
                    tnVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = npVar.C;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f22392id;
            }
            if (j10 != 0) {
                tnVar.v6();
                np npVar2 = tnVar.L9;
                TLRPC.Chat chat3 = npVar2.C;
                long j13 = npVar2.V;
                int i12 = npVar2.f40856a;
                int i13 = npVar2.f40858b;
                if (tnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.l9.a(tnVar, tnVar.getParentLayout().getFragmentStack().indexOf(tnVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = tnVar.L9.C;
                if (chat4 != null) {
                    j12 = chat4.f22392id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", tnVar.L9.f40856a);
                bundle2.putInt("dialog_filter_id", tnVar.L9.f40858b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(tnVar.currentAccount).edit().remove("diditem" + tnVar.L9.V).apply();
                tn tnVar2 = new tn(bundle2);
                ArrayList arrayList = tnVar.f42761bb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = tnVar.f42761bb;
                    tnVar2.f42761bb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                tnVar2.N9 = true;
                Kc = true;
                tnVar.presentFragment(tnVar2, true);
            }
        }
    }

    public static void Y(tn tnVar, long j10, long j11, Long l10, Boolean bool) {
        boolean z10;
        jh.s7 y8 = jh.s7.y(tnVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y8.i0(j10, j11, z10, true);
    }

    public static void Y0(tn tnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            tnVar.f42813fc = true;
            tnVar.f42973t0.f1();
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
            tn tnVar2 = new tn(bundle);
            tnVar2.pb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                tnVar2.H7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = tnVar2.T3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                tnVar2.T3.messageOwner.reactions = tL_messageReactions;
            }
            ag.z1 z1Var = new ag.z1(tnVar, new boolean[]{false}, i11, tnVar2, 12);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f22413id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = tnVar2.getClassGuid();
                NotificationCenter.getInstance(tnVar.currentAccount).addObserver(new pi(tnVar, classGuid, z1Var, tnVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        tn tnVar3 = tn.this;
                        MessagesController messagesController = tnVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i18, true, 0, ((MessageObject) j7.l1.i(1, arrayList)).getId(), 1, false, 0, true, tnVar3.f42779d4, null);
                    }
                });
                return;
            }
            z1Var.run();
            return;
        }
        tnVar.f42800ec = 0;
        tnVar.f42813fc = false;
        tnVar.f42973t0.f1();
        if (messageObject2 != null) {
            tnVar.ga(messageObject2);
        } else if (tnVar.getParentActivity() != null) {
            org.telegram.ui.Components.tc.a0(tnVar).t(LocaleController.getString(R.string.ChannelPostDeleted), tnVar.f42746aa).j();
        }
    }

    public static void Z(tn tnVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (tnVar.getParentActivity() != null) {
            TLRPC.Chat chat = tnVar.f42787e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !tnVar.f42787e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (tnVar.h == null && (userFull = tnVar.W7) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new me(tnVar, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                tnVar.showDialog(alertDialog$Builder.f22714a);
            } else if (!tnVar.D4.isEmpty()) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
                edit.putInt("pin_" + tnVar.P5, ((Integer) tnVar.D4.get(0)).intValue()).commit();
                tnVar.yc(0, true);
            }
        }
    }

    public static void Z0(tn tnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = tnVar.getMessagesController().getInputPeer(tnVar.P5);
                tL_messages_getHistory.offset_date = tnVar.f42967s7 + 86400;
                tL_messages_getHistory.limit = 1;
                tnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new bg.h3(28, tnVar, tLObject));
                return;
            }
            tnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a0(tn tnVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(tnVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, tnVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(tnVar.currentAccount).editMessage(messageObject, null, false, tnVar, null, i10, i11);
        }
    }

    public static void a1(long j10, tn tnVar) {
        if (jh.s7.y(tnVar.currentAccount, false).p().amount < j10) {
            new jh.y9(tnVar.getParentActivity(), tnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(tnVar.a()), new df(tnVar, 15), tnVar.a()).show();
        } else {
            new jh.z9(tnVar.getParentActivity(), tnVar.resourceProvider).show();
        }
    }

    public static void b0(tn tnVar, long j10, boolean z10) {
        if (!tnVar.D4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
            edit.putInt("pin_" + tnVar.P5, ((Integer) tnVar.D4.get(0)).intValue()).commit();
            tnVar.D4.clear();
            tnVar.F4.clear();
            tnVar.H4 = 0;
            tnVar.L4 = 0;
            tnVar.M4 = 0;
            tnVar.yc(0, true);
        }
        if (ChatObject.isMonoForum(tnVar.f42787e) && ChatObject.canManageMonoForum(tnVar.currentAccount, tnVar.f42787e)) {
            if (j10 != 0) {
                tnVar.getMessagesStorage().removeTopic(-tnVar.f42787e.f22392id, j10);
                tnVar.getMessagesController().deleteSavedDialog(j10, tnVar.getMessagesController().getInputPeer(-tnVar.f42787e.f22392id));
                tnVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(tnVar.f42787e.f22392id, j10);
            }
        } else {
            tnVar.getMessagesController().deleteDialog(tnVar.P5, 1, z10);
            tnVar.getMessagesStorage().removeAllTopics(tnVar.P5);
            tnVar.getMessagesController().getTopicsController().reloadTopics(-tnVar.P5);
        }
        tnVar.I5.put(j10, 0);
        org.telegram.ui.Components.m21 m21Var = tnVar.N1;
        if (m21Var != null) {
            m21Var.setAllTopicsHidden(false);
        }
        if (j10 == tnVar.Z3) {
            tnVar.y7(false, null);
            tnVar.f43013w0.O(false);
        }
    }

    public static void b1(tn tnVar) {
        if (AndroidUtilities.addToClipboard(tnVar.Ib.sponsoredAdditionalInfo)) {
            b.n(R.string.TextCopied, new org.telegram.ui.Components.tc(org.telegram.ui.Components.hb.a(tnVar.getParentActivity()), tnVar.resourceProvider));
        }
    }

    public static void b2(tn tnVar, View view, boolean z10, float f9, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            messageObject = s1Var.getMessageObject();
            s1Var.f25295c1 = f9;
            s1Var.f25308d1 = f10;
            org.telegram.ui.Components.ma0 ma0Var = s1Var.Gc;
            float f11 = s1Var.f25308d1;
            ma0Var.h = s1Var.getTranslationX() + f9;
            ma0Var.f30634i = f11;
            ma0Var.f30637l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int E8 = tnVar.E8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && E8 >= 2 && E8 != 20 && E8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        tnVar.x6(messageObject, z10, true);
                        tnVar.dc();
                        tnVar.Wc(false);
                    }
                }
            }
        }
    }

    public static void b4(tn tnVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(tnVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new z6(tnVar, h0Var, text, 3), new c1(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void c0(tn tnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, hf hfVar) {
        String str4;
        if (tnVar.Z4 != null && i10 < arrayList.size() && tnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = tnVar.Z4;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.k31.I(tnVar.getParentActivity(), tnVar, inputPeer, iArr[0], tnVar.Z4.summarized, str, str4, charSequence, z10, hfVar, new df(tnVar, 28)).setDimBehind(false);
            tnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(tnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + tnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + tnVar.a(), i11 - 1).apply();
                tnVar.Qc(true);
            }
        }
    }

    public static void c1(tn tnVar, long j10, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(tnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.uz0.c(tnVar.getParentActivity(), tnVar.currentAccount, -j10, tnVar.getUserConfig().getCurrentUser(), null, z10, z11, tnVar.getResourceProvider());
    }

    public static void c2(tn tnVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = tnVar.q6;
        SparseArray[] sparseArrayArr = tnVar.S5;
        if (!tnVar.Ka && (i11 = i10 - tnVar.f43013w0.F) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.jl0 jl0Var = tnVar.f42973t0;
            hi hiVar = new hi(tnVar, z10, sparseArray);
            if (!jl0Var.Z1) {
                jl0Var.f29704i2 = new int[2];
                new HashSet();
                jl0Var.l1(jl0Var, true);
                jl0Var.f29694d2 = hiVar;
                jl0Var.Z1 = true;
                jl0Var.f29692c2 = i10;
                jl0Var.f29690b2 = i10;
            }
        }
    }

    public static void d0(tn tnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(tnVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f22508id;
        long clientUserId = tnVar.getUserConfig().getClientUserId();
        long j11 = tnVar.P5;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void d1(tn tnVar, TLRPC.User user, String str, Boolean bool) {
        Intent intent;
        String country;
        if (tnVar.getParentActivity() == null) {
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
            TLRPC.User currentUser = tnVar.getUserConfig().getCurrentUser();
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
                    obj.f40272a = split[2];
                    String str2 = split[0];
                    obj.f40274c = str2;
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
            } catch (Exception e10) {
                FileLog.e(e10);
            }
            String str4 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 < 1) {
                    break;
                }
                List list2 = (List) hashMap.get(str4.substring(0, i10));
                if (list2 != null && list2.size() > 0) {
                    String str5 = ((lt) list2.get(0)).f40274c;
                    if (str5.endsWith("0") && str.startsWith("0")) {
                        str = str.substring(1);
                    }
                    str = a4.w.n("+", str5, str);
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
                str = a4.w.n("+", country, str);
            }
        }
        contentValues.put("data1", str);
        contentValues.put("data2", (Integer) 2);
        arrayList.add(contentValues);
        intent.putExtra("finishActivityOnSaveCompleted", true);
        intent.putParcelableArrayListExtra("data", arrayList);
        tnVar.getParentActivity().startActivity(intent);
    }

    public static boolean d2(tn tnVar, View view, RectF rectF) {
        RectF rectF2 = tnVar.Bb;
        if (rectF != null && tnVar.f42973t0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void d4(tn tnVar) {
        if (tnVar.E3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = tnVar.N3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f22413id = 0;
        MessageObject messageObject = new MessageObject(tnVar.currentAccount, tL_message, false, false);
        tnVar.E3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void e0(tn tnVar, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var = tnVar.parentLayout;
        if (b5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 backgroundFragment = b5Var.getBackgroundFragment();
        if (backgroundFragment instanceof tn) {
            tn tnVar2 = (tn) backgroundFragment;
            if (tnVar2.a() == tnVar.P5) {
                tnVar.finishFragment();
                tnVar2.j(i10, 0, true, 0, true, 0);
                return;
            }
        }
        tnVar.presentFragment(Q9(i10, tnVar.P5));
    }

    public static void e1(tn tnVar, int i10) {
        if (tnVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 q82 = tnVar.q8(i10, false);
            if (q82 instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) q82;
                kg.r0 r0Var = s1Var.J;
                TLRPC.MessagePeerReaction randomUnreadReaction = s1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (r0Var.K || randomUnreadReaction.big)) {
                    kg.m0.d(tnVar, null, q82, null, 0.0f, 0.0f, kg.q0.d(randomUnreadReaction.reaction), tnVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    kg.m0.f();
                }
                r0Var.K = false;
                MessageObject messageObject = s1Var.f25556u7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (q82 instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) q82;
                kg.r0 r0Var2 = v0Var.f25815y0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = v0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (r0Var2.K || randomUnreadReaction2.big)) {
                    kg.m0.d(tnVar, null, q82, null, 0.0f, 0.0f, kg.q0.d(randomUnreadReaction2.reaction), tnVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    kg.m0.f();
                }
                r0Var2.K = false;
                MessageObject messageObject2 = v0Var.D0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void e4(tn tnVar) {
        if (tnVar.F3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f22413id = 0;
        MessageObject messageObject = new MessageObject(tnVar.currentAccount, tL_message, false, false);
        tnVar.F3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void f0(tn tnVar, kf.a aVar, Runnable runnable) {
        if (!tnVar.isFinished) {
            if (kf.a.m(jh.s7.x(tnVar.currentAccount, aVar.f13633a).p()).f13634b < aVar.f13634b) {
                kf.b bVar = aVar.f13633a;
                if (bVar == kf.b.f13635a) {
                    new jh.y9(tnVar.getParentActivity(), tnVar.getResourceProvider(), aVar.a(), 13, yf.d.h(tnVar.currentAccount, tnVar.a()), null, tnVar.a()).show();
                    return;
                } else if (bVar == kf.b.f13636b) {
                    new oh.f(tnVar.getParentActivity(), tnVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void f1(tn tnVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        tnVar.f42768c5 = null;
        int i10 = tnVar.f42874kb;
        if (i10 == 2) {
            tnVar.f42831h5 = null;
            tnVar.f42856j5 = null;
            MessagePreviewParams messagePreviewParams = tnVar.f42755b5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, tnVar.P5, null);
            }
            tnVar.j8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = tnVar.f42755b5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = tnVar.f42755b5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = tnVar.f42755b5.forwardMessages.messages.get(i11);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.E0 = true;
                if (j11 > 0) {
                    TLRPC.User user = tnVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", tnVar.f42755b5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = tnVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", tnVar.f42755b5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                c2Var.P = AndroidUtilities.replaceTags(formatString);
                c2Var.N = LocaleController.formatPluralString("messages", tnVar.f42755b5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new me(tnVar, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new me(tnVar, 5));
                tnVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(tnVar.getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
                }
            }
        } else if (i10 == 4) {
            tnVar.C5 = null;
            MessagePreviewParams messagePreviewParams3 = tnVar.f42755b5;
            if (messagePreviewParams3 != null) {
                int i12 = tnVar.currentAccount;
                MessageObject messageObject4 = tnVar.f42856j5;
                if (messageObject4 == tnVar.T3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, tnVar.f42831h5, tnVar.f42880l5);
            }
            dk dkVar = tnVar.U;
            dkVar.S2 = null;
            dkVar.T2 = false;
            tnVar.i8();
            tnVar.j8();
        } else {
            if (ChatObject.isForum(tnVar.f42787e) && !tnVar.f42779d4 && (messageObject = tnVar.f42856j5) != null) {
                long topicId = MessageObject.getTopicId(tnVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    tnVar.getMediaDataController().cleanDraft(tnVar.P5, topicId, false);
                }
            }
            tnVar.zb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void g0(tn tnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + tnVar.P5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(tnVar.f42787e) && !tnVar.f42787e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.c80.f27367r;
            org.telegram.ui.Components.c80.w(context, tnVar, org.telegram.ui.Components.tc.a0(tnVar), z10);
        }
        tnVar.vb(false, true);
    }

    public static void g1(tn tnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        tn tnVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        sg.a aVar = tnVar.Mb;
        if (num.intValue() != tnVar.b()) {
            tnVar.f42863jc = false;
            we weVar = tnVar.Jb;
            if (weVar != null) {
                AndroidUtilities.cancelRunOnUIThread(weVar);
                tnVar.Jb.run();
                tnVar.Jb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.m21 m21Var = tnVar.N1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(m21Var.f30552b).getTopicsController().getTopics(-m21Var.f30553c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f22444id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = tnVar.getMessagesController().getTopicsController().findTopic(-tnVar.a(), tL_forumTopic.f22444id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                tnVar.Wa = SystemClock.uptimeMillis();
                tnVar.f42882l7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    tnVar.Sa(tnVar.b());
                } else if (tnVar.b() == 0) {
                    tnVar.Sa(num.intValue());
                } else {
                    tnVar.f42858j7 = -1;
                }
                tnVar.getConnectionsManager().cancelRequestsForGuid(tnVar.classGuid);
                tnVar.getMessagesStorage().cancelTasksForGuid(tnVar.classGuid);
                tnVar.classGuid = ConnectionsManager.generateClassGuid();
                tnVar.Pa();
                tnVar.f42755b5 = null;
                tnVar.f42943q7 = 0;
                tnVar.f42821g7 = false;
                tnVar.f42833h7 = true;
                tnVar.f42781d6.clear();
                tnVar.f42763c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(tnVar.getCurrentAccount(), message, false, false));
                    tnVar2 = tnVar;
                    tnVar2.pb(arrayList, tnVar.f42787e, tL_forumTopic2.f22444id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    tnVar2 = tnVar;
                    tnVar2.Y3 = null;
                    tnVar2.W3 = null;
                    tnVar2.T3 = null;
                    tnVar2.f42856j5 = null;
                    tnVar2.f42818g4 = 0;
                    tnVar2.f42830h4 = 0;
                    tnVar2.f42842i4 = 0;
                    tnVar2.Z3 = 0L;
                    tnVar2.f42740a4 = 0;
                    tnVar2.f42754b4 = null;
                    tnVar2.f42779d4 = false;
                    tnVar2.f42767c4 = false;
                }
                em emVar = tnVar2.f43013w0;
                if (emVar != null) {
                    if (emVar.E >= 0 && !emVar.N()) {
                        em emVar2 = tnVar2.f43013w0;
                        emVar2.u(emVar2.E);
                    } else {
                        em emVar3 = tnVar2.f43013w0;
                        if (emVar3.E < 0 && emVar3.N()) {
                            tnVar2.f43013w0.o(0);
                        }
                    }
                    tnVar2.f43013w0.T();
                }
                tnVar2.r8();
                tnVar2.Nc(true);
                tnVar2.W0.n(true);
                if (tL_forumTopic2 != null) {
                    tnVar2.Tc();
                } else {
                    tnVar2.W0.b();
                }
                tnVar2.N1.setCurrentTopic(tnVar2.b());
                tnVar2.Qc(true);
                tnVar2.hc(true);
                tnVar2.getMessagesController().setForumLastTopicId(-tnVar2.a(), tnVar2.b());
                tnVar2.Ea();
                tnVar2.f9(true);
                tnVar2.e9(true);
                tnVar2.A6(true, true);
                if (tnVar2.U != null) {
                    if (!UserObject.isBotForum(tnVar2.f42801f)) {
                        tnVar2.U.m0(false);
                    }
                    tnVar2.U.G1(true);
                }
                if (tL_forumTopic2 != null) {
                    tnVar2.getMessagesController().getTopicsController().getTopicRepliesCount(tnVar2.P5, tL_forumTopic2.f22444id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                tnVar2.f42827h1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                tnVar2.f42839i1 = i11;
                tnVar2.Bc(false);
                tnVar2.Ac(false);
                tnVar2.Rc();
                ln lnVar = tnVar2.f42875kc;
                if (lnVar != null && tnVar2.actionBar.f23612j0) {
                    lnVar.p(null);
                }
                if (UserObject.isBotForum(tnVar2.f42801f)) {
                    tnVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(tnVar2.P5, num.intValue()), true);
                }
            }
        }
    }

    public static void h0(tn tnVar, MessageObject messageObject, Long l10, Runnable runnable) {
        jh.s7.y(tnVar.currentAccount, false).l0(messageObject, l10.longValue(), runnable, false);
    }

    public static void h1(tn tnVar, String str) {
        if (MessagesController.getInstance(tnVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            tnVar.getParentActivity();
            ye.d.n(str);
            return;
        }
        org.telegram.ui.Components.c5.o0(tnVar.getParentActivity(), tnVar.f42746aa, str, false, new bg(tnVar, str, 0));
    }

    public static void i0(tn tnVar) {
        org.telegram.ui.Cells.s1 s1Var;
        pl plVar;
        int i10;
        if (!tnVar.Nb && tnVar.B3 && tnVar.f42973t0.C && tnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = tnVar.f42973t0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = tnVar.f42973t0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        s1Var = (org.telegram.ui.Cells.s1) childAt;
                        if (s1Var.getMessageObject() != null && s1Var.getMessageObject().messageOwner != null && s1Var.getMessageObject().messageOwner.video_processing_pending) {
                            if (s1Var.getCurrentPosition() != null) {
                                if (s1Var.getMessageObject() != null && (s1Var.getCurrentPosition().flags & 8) != 0) {
                                    int i11 = s1Var.getCurrentPosition().flags;
                                    if (s1Var.getMessageObject().isOutOwner()) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    if ((i11 & i10) == 0) {
                                        continue;
                                    }
                                }
                            }
                            s1Var.getLocationInWindow(iArr);
                            float timeY = s1Var.getTimeY() + iArr[1];
                            if (timeY >= AndroidUtilities.dp(240.0f) && timeY <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    s1Var = null;
                    break;
                }
            }
            if (s1Var != null) {
                tnVar.Nb = true;
                pl plVar2 = new pl(tnVar, tnVar.getParentActivity());
                plVar2.q(true);
                plVar2.G = Layout.Alignment.ALIGN_CENTER;
                plVar2.d = 3500L;
                plVar2.P = true;
                plVar2.f18592e = true;
                plVar2.h = AndroidUtilities.dp(150.0f);
                plVar2.r(8.0f);
                tnVar.f43028x1 = plVar2;
                plVar2.t(LocaleController.getString(R.string.VideoConversionTimeInfo));
                tnVar.T0.addView(tnVar.f43028x1, i7.f6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                s1Var.getLocationInWindow(iArr);
                tnVar.f43039y1 = s1Var.getTimeY() + iArr[1];
                tnVar.f43028x1.setTranslationY(((-plVar.getTop()) - AndroidUtilities.dp(120.0f)) + tnVar.f43039y1);
                tnVar.f43028x1.n(0.0f, (s1Var.f25433lb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + s1Var.f25461nb);
                tnVar.f43028x1.v();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ee(tnVar, 2));
            AndroidUtilities.runOnUIThread(new ee(tnVar, 2), 2000L);
        }
    }

    public static void i1(tn tnVar, Object[] objArr, org.telegram.ui.Components.nx0 nx0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.tc tcVar = new org.telegram.ui.Components.tc(nx0Var.container, tnVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.mc r6 = tcVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r6.f30652j = 2750;
                r6.k(true);
            }
        }
    }

    public static void i2(tn tnVar) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (tnVar.f43000v1 != null) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var2 = null;
        for (int childCount = tnVar.f42973t0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = tnVar.f42973t0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.s1) && (primaryMessageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                s1Var2 = s1Var;
            }
        }
        tnVar.ub(s1Var2);
    }

    public static void j0(tn tnVar) {
        if (tnVar.I1) {
            tnVar.getMessagesController().addDialogToFolder(tnVar.P5, 0, 0, 0L);
            tnVar.Q7();
            tnVar.f42989u3.j(23, tnVar.P5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + tnVar.P5, false);
            edit.putBoolean("dialog_bar_block" + tnVar.P5, false);
            edit.putBoolean("dialog_bar_report" + tnVar.P5, false);
            edit.commit();
            tnVar.Qc(false);
            tnVar.getNotificationsController().clearDialogNotificationsSettings(tnVar.P5, tnVar.b());
        } else if (tnVar.H1.getTag() != null && ((Integer) tnVar.H1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = tnVar.V7;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < tnVar.V7.participants.participants.size(); i10++) {
                    hVar.k(null, tnVar.V7.participants.participants.get(i10).user_id);
                }
                long j10 = tnVar.V7.f22393id;
                org.telegram.ui.Components.x60 x60Var = new org.telegram.ui.Components.x60(tnVar.getParentActivity(), tnVar.currentAccount, hVar, tnVar.V7.f22393id, tnVar, tnVar.f42746aa);
                x60Var.f34611h0 = new me(tnVar, 20);
                x60Var.show();
            }
        } else if (tnVar.H1.getTag() != null) {
            tnVar.rb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", tnVar.f42801f.f22539id);
            bundle.putBoolean("addContact", true);
            hs hsVar = new hs(bundle);
            hsVar.K = new me(tnVar, 21);
            tnVar.presentFragment(hsVar);
        }
    }

    public static void j1(tn tnVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = tnVar.f42856j5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = tnVar.f42874kb;
            if (i10 == 5) {
                int i11 = tnVar.currentAccount;
                long j10 = tnVar.P5;
                MessageSuggestionParams messageSuggestionParams = tnVar.f42768c5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new jh.s0(context, i11, j10, messageSuggestionParams, tnVar, tnVar.getResourceProvider(), 0, new qe(tnVar, 3)).show();
            } else if (i10 == 1 && (messageObject = tnVar.f42880l5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = tnVar.f42768c5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    tnVar.Tb(messageSuggestionParams2);
                } else if (tnVar.f42880l5.canEditMedia() && tnVar.f42869k5 == 0) {
                    if (tnVar.F1 == null) {
                        tnVar.E7();
                    }
                    tnVar.F1.I1(tnVar.f42880l5, -1);
                    tnVar.X9();
                } else {
                    tnVar.j(tnVar.f42880l5.getId(), 0, true, 0, true, 0);
                }
            } else if (tnVar.f42755b5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(tnVar.P5) && !tnVar.f42755b5.hasSecretMessages && tnVar.N3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        tnVar.ca(0);
                        return;
                    }
                    MessageObject messageObject3 = tnVar.f42856j5;
                    if (messageObject3 != null) {
                        tnVar.j(messageObject3.getId(), 0, true, 0, true, 0);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    tnVar.ca(1);
                } else if (i10 == 4) {
                    tnVar.ca(2);
                }
            }
        }
    }

    public static void k0(tn tnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.c51[] c51VarArr;
        if (tnVar.B5 != 0) {
            tnVar.getConnectionsManager().cancelRequest(tnVar.B5, true);
            tnVar.B5 = 0;
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
            if ((charSequence instanceof Spannable) && (c51VarArr = (org.telegram.ui.Components.c51[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.c51.class)) != null && c51VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.c51 c51Var : c51VarArr) {
                    arrayList.add(c51Var.getURL());
                }
            }
            if (arrayList != null && tnVar.D5 != null && arrayList.size() == tnVar.D5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) tnVar.D5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            tnVar.D5 = arrayList;
        } catch (Exception e10) {
            FileLog.e(e10);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new df(tnVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new df(tnVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (tnVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new le(tnVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = tnVar.C5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = tnVar.f42837hb + 1;
            tnVar.f42837hb = i11;
            yf yfVar = new yf(tnVar, i11, getwebpagepreview, 0);
            if (tnVar.f42849ib == null) {
                tnVar.f42849ib = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) tnVar.f42849ib.get(getwebpagepreview.message);
            if (webPage2 != null) {
                yfVar.run(Boolean.TRUE, webPage2);
                return;
            }
            l6 l6Var = new l6(tnVar, getwebpagepreview, yfVar, 1);
            if (tnVar.B5 != 0) {
                tnVar.getConnectionsManager().cancelRequest(tnVar.B5, true);
            }
            tnVar.B5 = tnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new bh.v(12, tnVar, l6Var));
            tnVar.getConnectionsManager().bindRequestToGuid(tnVar.B5, tnVar.classGuid);
        }
    }

    public static void k1(tn tnVar, long j10, long j11) {
        jh.s7.y(tnVar.currentAccount, false).C(j10, j11, new jh.u3(tnVar, j10, j11, 1));
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.t41(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f29024a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.i01(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f29024a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.i01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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

    public static void l0(tn tnVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(tnVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (tnVar.i() != null) {
                tLObject2 = tnVar.i();
            } else {
                tLObject2 = tnVar.f42787e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = tnVar.f42801f;
                if (user2 != null && user2.bot && user.f22539id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.x3.s(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.tc.a0(tnVar), null);
                } else if (user2 != null && user2.bot && user.f22539id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.x3.s(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.tc.a0(tnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.x3.s(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.tc.a0(tnVar), null);
                } else {
                    TLRPC.Chat chat = tnVar.f42787e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.x3.s(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.tc.a0(tnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = tnVar.f42787e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.x3.s(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.tc.a0(tnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                tnVar.W9(user.f22539id, tnVar.f42822g8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.v6 v6Var = new org.telegram.ui.Components.v6(tnVar.getParentActivity());
                v6Var.setColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23156ia, false));
                v6Var.setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.L5, false));
                v6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.R = v6Var;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(tnVar, user, atomicBoolean, tL_attachMenuBot, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(tnVar.getParentActivity(), 5, tnVar.getResourceProvider());
                    y1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    y1Var.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
                    y1Var.setMultiline(true);
                    y1Var.e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
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
                    y1Var.setPadding(dp, 0, dp2, 0);
                    y1Var.setOnClickListener(new nh.r7(21, y1Var, atomicBoolean));
                    c2Var.C = 6;
                    alertDialog$Builder.n(y1Var);
                }
                alertDialog$Builder.o();
            } else {
                gi1.a(tnVar.getParentActivity(), new eh(tnVar, user, tL_attachMenuBot, 0), null);
            }
        }
    }

    public static void l1(tn tnVar, int i10) {
        if (tnVar.N3 == 7) {
            Object E = tnVar.I3.E(i10);
            if (i10 == 0) {
                tnVar.I3.getClass();
            }
            if (E instanceof MessageObject) {
                tnVar.fa((MessageObject) E);
            }
        } else if (tnVar.f42889m3 != null) {
            if (i10 >= 0 && i10 < tnVar.getMediaDataController().searchResultMessages.size()) {
                tnVar.f42902n3 = false;
                tnVar.lb(false, true, false);
                tnVar.getMediaDataController().setSearchedPosition(i10);
                tnVar.Fc(tnVar.getMediaDataController().getMask(), tnVar.getMediaDataController().getSearchPosition(), tnVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new ke(tnVar, tnVar.getMediaDataController().searchResultMessages.get(i10), 2));
            }
        } else {
            tnVar.getMediaDataController().jumpToSearchedMessage(tnVar.classGuid, i10);
            tnVar.Lb(false);
        }
    }

    public static void m0(tn tnVar) {
        if (tnVar.Ib == null) {
            return;
        }
        d31[] d31VarArr = {d31.T(tnVar.getParentActivity(), tnVar, true, tnVar.resourceProvider, new ih.b1(26, tnVar, d31VarArr))};
    }

    public static void m1(tn tnVar, long j10, long j11, Long l10) {
        int i10;
        String str;
        if (tnVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = tnVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(tnVar.f42787e)) {
            i10 = R.string.RemoveMessageFeeMessageChannel;
        } else {
            i10 = R.string.RemoveMessageFeeMessage;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(j10)));
        if (l10.longValue() > 0) {
            str = LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.c5.i0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new ch(tnVar, j10, j11, l10, 0), tnVar.resourceProvider, true);
    }

    public static void n0(tn tnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, l6 l6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f22413id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(tnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            tnVar.getMessagesController().getStoriesController().f16226k.d(hVar, new vf(9, hVar, l6Var), tnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void n1(tn tnVar) {
        MessagesController messagesController = tnVar.getMessagesController();
        long j10 = tnVar.P5;
        long j11 = tnVar.H6;
        int i10 = tnVar.classGuid;
        int i11 = tnVar.N3;
        long j12 = tnVar.Z3;
        int i12 = tnVar.f42842i4;
        int i13 = tnVar.R5;
        tnVar.R5 = i13 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j12, i12, i13, tnVar.f42779d4);
    }

    public static void o0(tn tnVar, long j10, long j11) {
        BotForumHelper.getInstance(tnVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        tnVar.Jb = null;
    }

    public static void o1(tn tnVar) {
        int i10;
        TLRPC.ChatFull chatFull = tnVar.V7;
        if (chatFull != null && !tnVar.f42891m5) {
            TLRPC.Chat chat = tnVar.f42787e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && tnVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(tnVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = tnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && tnVar.visibleDialog == null && tnVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = tnVar.getParentActivity();
                    me meVar = new me(tnVar, 12);
                    me meVar2 = new me(tnVar, 13);
                    Pattern pattern = org.telegram.ui.Components.c5.f27308a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new eg.k1(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, i7.f6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.R = frameLayout;
                    c2Var.K0 = 0.3974359f;
                    c2Var.N = LocaleController.getString(R.string.GigagroupAlertTitle);
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), meVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), meVar2);
                    tnVar.showDialog(c2Var);
                }
            }
        }
    }

    public static void p0(tn tnVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(tnVar.currentAccount).getInputUser(user.f22539id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(tnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(tnVar, tL_attachMenuBot, user, 0), 66);
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

    public static void q0(tn tnVar) {
        if (tnVar.N3 == 0 && tnVar.getMessagesController().freezeUntilDate > tnVar.getConnectionsManager().getCurrentTime() && !c.a(tnVar.currentAccount, tnVar.f42801f)) {
            c.c(tnVar.getParentActivity(), tnVar.currentAccount, tnVar.getResourceProvider());
        }
    }

    public static void q1(org.telegram.ui.tn r19, final org.telegram.ui.d31[] r20, final org.telegram.ui.Components.j70 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.q1(org.telegram.ui.tn, org.telegram.ui.d31[], org.telegram.ui.Components.j70):void");
    }

    public static void r1(tn tnVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c3;
        long j10;
        int[] iArr3 = tnVar.f43019w6;
        int[] iArr4 = tnVar.f43005v6;
        boolean[] zArr = tnVar.A6;
        int[] iArr5 = tnVar.f42992u6;
        int[] iArr6 = tnVar.f43032x6;
        boolean[] zArr2 = tnVar.f43056z6;
        ArrayList arrayList = tnVar.f42781d6;
        if ((i10 - i11) - i12 <= i13 && !tnVar.C6) {
            boolean[] zArr3 = tnVar.f43044y6;
            if (!zArr3[0]) {
                tnVar.C6 = true;
                arrayList.add(Integer.valueOf(tnVar.R5));
                if (tnVar.f42905n6.size() != 0) {
                    MessagesController messagesController = tnVar.getMessagesController();
                    j10 = 0;
                    long j11 = tnVar.P5;
                    c3 = 0;
                    long j12 = tnVar.H6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = tnVar.classGuid;
                    int i17 = tnVar.N3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = tnVar.Z3;
                    int i18 = tnVar.f42842i4;
                    int i19 = tnVar.R5;
                    tnVar.R5 = i19 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j13, i18, i19, tnVar.f42779d4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c3 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = tnVar.getMessagesController();
                    long j14 = tnVar.P5;
                    long j15 = tnVar.H6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = tnVar.classGuid;
                    int i22 = tnVar.N3;
                    long j16 = tnVar.Z3;
                    int i23 = tnVar.f42842i4;
                    int i24 = tnVar.R5;
                    tnVar.R5 = i24 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j16, i23, i24, tnVar.f42779d4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c3 = 0;
                j10 = 0;
                if (tnVar.H6 != 0 && !zArr3[1]) {
                    tnVar.C6 = true;
                    arrayList.add(Integer.valueOf(tnVar.R5));
                    MessagesController messagesController3 = tnVar.getMessagesController();
                    long j17 = tnVar.H6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = tnVar.classGuid;
                    int i28 = tnVar.N3;
                    long j18 = tnVar.Z3;
                    int i29 = tnVar.f42842i4;
                    int i30 = tnVar.R5;
                    tnVar.R5 = i30 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j18, i29, i30, tnVar.f42779d4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c3 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !tnVar.E7 && i11 <= 10) {
            if (tnVar.H6 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(tnVar.R5));
                MessagesController messagesController4 = tnVar.getMessagesController();
                long j19 = tnVar.H6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = tnVar.classGuid;
                int i34 = tnVar.N3;
                long j20 = tnVar.Z3;
                int i35 = tnVar.f42842i4;
                int i36 = tnVar.R5;
                tnVar.R5 = i36 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j20, i35, i36, tnVar.f42779d4);
                tnVar.E7 = true;
            } else if (!zArr[c3]) {
                arrayList.add(Integer.valueOf(tnVar.R5));
                MessagesController messagesController5 = tnVar.getMessagesController();
                long j21 = tnVar.P5;
                long j22 = tnVar.H6;
                int i37 = iArr2[c3];
                int i38 = iArr[c3];
                int i39 = tnVar.classGuid;
                int i40 = tnVar.N3;
                long j23 = tnVar.Z3;
                int i41 = tnVar.f42842i4;
                int i42 = tnVar.R5;
                tnVar.R5 = i42 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j23, i41, i42, tnVar.f42779d4);
                tnVar.E7 = true;
            }
        }
    }

    public static void s0(tn tnVar, ArrayList arrayList, long j10, org.telegram.ui.Components.yl0 yl0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(tnVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new eg.z0(tnVar, j10, 7), 400L);
            yl0Var.dismiss();
        }
    }

    public static void t0(long j10, tn tnVar) {
        if (jh.s7.y(tnVar.currentAccount, false).p().amount < j10) {
            new jh.y9(tnVar.getParentActivity(), tnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(tnVar.a()), new df(tnVar, 15), tnVar.a()).show();
        } else {
            new jh.z9(tnVar.getParentActivity(), tnVar.resourceProvider).show();
        }
    }

    public static void t1(tn tnVar) {
        if (MessagesController.getInstance(tnVar.currentAccount).isDialogMuted(tnVar.P5, tnVar.b())) {
            tnVar.Pc(true);
            AndroidUtilities.runOnUIThread(new ee(tnVar, 18), 150L);
            tnVar.f42775d0.M(null, null);
            if (tnVar.getParentActivity() != null) {
                org.telegram.ui.Components.tc.z(tnVar, 4, 0, tnVar.f42746aa).j();
                return;
            }
            return;
        }
        View view = tnVar.f42738a1.f23826i;
        if (view instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) view).b();
        }
    }

    public static void u0(tn tnVar, TLRPC.Document document) {
        tnVar.f42952r4.put(document, 0);
        SendMessagesHelper.getInstance(tnVar.currentAccount).sendSticker(document, null, tnVar.P5, null, null, null, tnVar.f42831h5, null, true, 0, 0, false, null, tnVar.C8(), 0L, tnVar.N8(), tnVar.f42768c5);
    }

    public static void u1(tn tnVar, String str) {
        if (tnVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(tnVar.currentAccount).getInviteText(1));
            tnVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public static boolean u9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void v0(tn tnVar, TLRPC.Document document) {
        tnVar.f42952r4.put(document, 0);
        SendMessagesHelper.getInstance(tnVar.currentAccount).sendSticker(document, null, tnVar.P5, null, null, null, tnVar.f42831h5, null, true, 0, 0, false, null, tnVar.C8(), 0L, tnVar.N8(), tnVar.f42768c5);
    }

    public static boolean v1(org.telegram.ui.tn r17, org.telegram.tgnet.TLRPC.MessageEntity r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.v1(org.telegram.ui.tn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void w0(tn tnVar) {
        long j10;
        ArrayList arrayList = tnVar.f42781d6;
        arrayList.add(Integer.valueOf(tnVar.R5));
        if (tnVar.N3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(tnVar.currentAccount);
            String str = tnVar.f42940q3;
            int i10 = tnVar.classGuid;
            int i11 = tnVar.K3;
            int i12 = tnVar.R5;
            tnVar.R5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (tnVar.f42967s7 != 0) {
            MessagesController messagesController = tnVar.getMessagesController();
            long j11 = tnVar.P5;
            long j12 = tnVar.H6;
            int i13 = tnVar.f42967s7;
            int i14 = tnVar.classGuid;
            int i15 = tnVar.N3;
            long j13 = tnVar.Z3;
            int i16 = tnVar.f42842i4;
            int i17 = tnVar.R5;
            tnVar.R5 = i17 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j13, i16, i17, tnVar.f42779d4);
        } else if (tnVar.f42943q7 != 0 && (!tnVar.F9() || tnVar.f42943q7 == tnVar.H7 || tnVar.f42779d4)) {
            int i18 = tnVar.f42809f7;
            if (i18 != 0) {
                tnVar.H6 = i18;
                MessagesController messagesController2 = tnVar.getMessagesController();
                long j14 = tnVar.H6;
                boolean z10 = tnVar.f42782d7;
                int i19 = tnVar.f42769c7;
                int i20 = tnVar.f42943q7;
                int i21 = tnVar.classGuid;
                int i22 = tnVar.N3;
                long j15 = tnVar.Z3;
                int i23 = tnVar.f42842i4;
                int i24 = tnVar.R5;
                tnVar.R5 = i24 + 1;
                messagesController2.loadMessages(j14, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j15, i23, i24, tnVar.f42779d4);
            } else {
                MessagesController messagesController3 = tnVar.getMessagesController();
                long j16 = tnVar.P5;
                long j17 = tnVar.H6;
                boolean z11 = tnVar.f42782d7;
                int i25 = tnVar.f42769c7;
                int i26 = tnVar.f42943q7;
                int i27 = tnVar.classGuid;
                int i28 = tnVar.N3;
                long j18 = tnVar.Z3;
                int i29 = tnVar.f42842i4;
                int i30 = tnVar.R5;
                tnVar.R5 = i30 + 1;
                messagesController3.loadMessages(j16, j17, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j18, i29, i30, tnVar.f42779d4);
            }
        } else if (tnVar.f42795e7) {
            tnVar.R5++;
        } else {
            MessagesController messagesController4 = tnVar.getMessagesController();
            long j19 = tnVar.P5;
            long j20 = tnVar.H6;
            boolean z12 = tnVar.f42782d7;
            int i31 = tnVar.f42769c7;
            int i32 = tnVar.f42943q7;
            int i33 = tnVar.classGuid;
            int i34 = tnVar.N3;
            long j21 = tnVar.Z3;
            int i35 = tnVar.f42842i4;
            int i36 = tnVar.R5;
            tnVar.R5 = i36 + 1;
            messagesController4.loadMessages(j19, j20, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j21, i35, i36, tnVar.f42779d4);
        }
        int i37 = tnVar.N3;
        if (i37 == 0 || (i37 == 3 && tnVar.I8() == tnVar.getUserConfig().getClientUserId())) {
            if (tnVar.F9() && !tnVar.f42779d4) {
                return;
            }
            arrayList.add(Integer.valueOf(tnVar.R5));
            MessagesController messagesController5 = tnVar.getMessagesController();
            long j22 = tnVar.P5;
            long j23 = tnVar.H6;
            int i38 = tnVar.classGuid;
            if (tnVar.N3 == 3) {
                j10 = 0;
            } else {
                j10 = tnVar.Z3;
            }
            long j24 = j10;
            int i39 = tnVar.f42842i4;
            int i40 = tnVar.R5;
            tnVar.R5 = i40 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j24, i39, i40, tnVar.f42779d4);
        }
    }

    public static void w1(tn tnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(tnVar.currentAccount).loadAttachMenuBots(false, true);
            tnVar.W9(user.f22539id, tnVar.f42822g8, false);
        }
    }

    public static void x0(tn tnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, hf hfVar) {
        String str3;
        if (tnVar.Z4 != null && i10 < arrayList.size() && tnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = tnVar.Z4;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.k31.I(tnVar.getParentActivity(), tnVar, inputPeer, iArr[0], tnVar.Z4.summarized, strArr[0], str3, charSequence, z10, hfVar, new ig(tnVar, 12)).setDimBehind(false);
            tnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(tnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + tnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + tnVar.a(), i11 - 1).apply();
                tnVar.Qc(true);
            }
        }
    }

    public static void x1(tn tnVar, View view, int i10) {
        org.telegram.ui.Components.y5 y5Var;
        TLRPC.User user;
        char c3;
        hk hkVar;
        hk hkVar2;
        if (i10 != 0) {
            rf.v0 adapter = tnVar.E1.getAdapter();
            if (adapter.f47385s0 != null && !adapter.f47366d0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = tnVar.E1.getAdapter().J(i11);
            int i12 = tnVar.E1.getAdapter().T;
            int i13 = tnVar.E1.getAdapter().U;
            if (tnVar.E1.getAdapter().B != null && i11 == 1) {
                tnVar.U.O0(i12, i13, tnVar.E1.getAdapter().B + "@" + ChatObject.getPublicUsername(tnVar.f42787e) + " ", false);
            } else if (tnVar.E1.getAdapter().B != null && i11 == 0) {
                tnVar.U.O0(i12, i13, a4.w.q(new StringBuilder(), tnVar.E1.getAdapter().B, " "), false);
            } else if (J instanceof sf.r1) {
                if (!tnVar.getUserConfig().isPremium()) {
                    tnVar.showDialog(new cg.p1(tnVar, tnVar.getParentActivity(), tnVar.currentAccount, true, 31, false, null));
                    return;
                }
                sf.r1 r1Var = (sf.r1) J;
                org.telegram.ui.Components.c5.a0(tnVar.currentAccount, Math.max(1, r1Var.a()), tnVar.P5, new ih.b1(23, tnVar, r1Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (tnVar.N3 != 0 || !tnVar.e7(view)) {
                        if (view instanceof org.telegram.ui.Cells.z7) {
                            sendAnimationData = ((org.telegram.ui.Cells.z7) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.c5.a0(tnVar.currentAccount, 1, tnVar.a(), new jh.g2(tnVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), tnVar.E1.getAdapter().L(i11), sendAnimationData, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (tnVar.f42854j3 && (hkVar2 = tnVar.N2) != null && hkVar2.getVisibility() == 0) {
                        tnVar.Za(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        tnVar.U.O0(i12, i13, a4.w.n("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (tnVar.f42854j3 && (hkVar = tnVar.N2) != null && hkVar.getVisibility() == 0) {
                        tnVar.Za(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        tnVar.U.O0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(u3.c.k(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.d51("" + user2.f22539id, 3, null), 0, spannableString.length(), 33);
                        tnVar.U.O0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof rf.s0) {
                    if (tnVar.E1.getAdapter().F != null && tnVar.N3 != 1) {
                        rf.s0 s0Var = (rf.s0) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(s0Var.f47347a, tnVar.P5, tnVar.f42856j5, tnVar.T3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = tnVar.C8();
                        of2.ephemeralReceiverBotId = s0Var.f47348b;
                        of2.monoForumPeer = tnVar.N8();
                        of2.suggestionParams = tnVar.f42768c5;
                        tnVar.getSendMessagesHelper().sendMessage(of2);
                        tnVar.U.setFieldText("");
                        tnVar.e9(false);
                    }
                } else if (J instanceof String) {
                    if (tnVar.E1.getAdapter().F != null) {
                        if (tnVar.N3 == 1) {
                            org.telegram.ui.Components.c5.M(tnVar.getParentActivity(), tnVar.P5, new kg.w(16, tnVar, (String) J), tnVar.f42746aa);
                            return;
                        } else if (!tnVar.e7(view)) {
                            org.telegram.ui.Components.c5.a0(tnVar.currentAccount, 1, tnVar.P5, new ih.b1(24, tnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    tnVar.U.O0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (tnVar.U.getFieldText() != null) {
                        if (tnVar.N3 == 1 || !tnVar.e7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (tnVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c3 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c3 = 2;
                                } else {
                                    c3 = 0;
                                }
                                if (c3 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                                    alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c3 == 1) {
                                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    tnVar.showDialog(alertDialog$Builder.f22714a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(tnVar.E1.getAdapter().N);
                                tnVar.Da = arrayList;
                                PhotoViewer.t1().K2(null, tnVar, tnVar.f42746aa);
                                PhotoViewer.t1().f2(arrayList, tnVar.E1.getAdapter().M(i11), 3, false, tnVar.Ea, tnVar);
                                return;
                            }
                            org.telegram.ui.Components.c5.a0(tnVar.currentAccount, 1, tnVar.a(), new ih.b1(25, tnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    vf vfVar = new vf(2, tnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (tnVar.f42812fb) {
                        vfVar.run();
                    } else {
                        gi1.a(tnVar.getParentActivity(), new lh.y1(4, tnVar, vfVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    wj wjVar = tnVar.E1;
                    if (wjVar != null && (user = wjVar.getAdapter().f47385s0) != null) {
                        tnVar.U.setFieldText("");
                        long j10 = tnVar.P5;
                        if (j10 == user.f22539id) {
                            tnVar.f42758b8 = j10;
                            tnVar.getMessagesController().sendBotStart(tnVar.f42801f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f22539id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", tnVar.P5);
                        if (tnVar.getMessagesController().checkCanOpenChat(bundle, tnVar)) {
                            tnVar.presentFragment(new tn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    dk dkVar = tnVar.U;
                    dkVar.U();
                    dkVar.Q0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            tnVar.U.O0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = tnVar.U.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                FileLog.e((Throwable) e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f9 = org.telegram.ui.Components.p5.f(tnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f9));
                            if (f9 != null) {
                                y5Var = new org.telegram.ui.Components.y5(f9, fontMetricsInt);
                            } else {
                                y5Var = new org.telegram.ui.Components.y5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(y5Var, 0, spannableString2.length(), 33);
                            tnVar.U.O0(i12, i13, spannableString2, false);
                            tnVar.E1.o(false);
                        }
                    }
                    tnVar.U.O0(i12, i13, str, true);
                    tnVar.E1.o(false);
                }
            }
        }
    }

    public static void y0(tn tnVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(tnVar.currentAccount).sendSticker(tL_document, str, tnVar.P5, tnVar.f42856j5, tnVar.T3, null, tnVar.f42831h5, null, z10, i10, 0, false, obj, tnVar.C8(), 0L, tnVar.N8(), tnVar.f42768c5);
    }

    public static void y1(tn tnVar, org.telegram.ui.Components.j70 j70Var) {
        if (tnVar.Ib == null) {
            return;
        }
        j70Var.u();
        tnVar.J9(tnVar.Ib, false, true);
        ye.d.r(tnVar.getParentActivity(), Uri.parse(tnVar.Ib.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(tnVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void z0(tn tnVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, hf hfVar) {
        if (tnVar.Z4 != null && i10 < arrayList.size() && tnVar.getParentActivity() != null) {
            org.telegram.ui.Components.k31.I(tnVar.getParentActivity(), tnVar, inputPeer, iArr[0], tnVar.Z4.summarized, "und", str, charSequence, z10, hfVar, new ig(tnVar, 4)).setDimBehind(false);
            tnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(tnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + tnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + tnVar.a(), i11 - 1).apply();
                tnVar.Qc(true);
            }
        }
    }

    public static void z1(tn tnVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.vg vgVar;
        String str;
        SparseArray[] sparseArrayArr = tnVar.S5;
        if (tnVar.getParentActivity() != null && tnVar.J9 == 0.0f) {
            if (tnVar.N3 == 3) {
                Bundle bundle = new Bundle();
                long I8 = tnVar.I8();
                if (I8 >= 0) {
                    bundle.putLong("user_id", I8);
                } else {
                    bundle.putLong("chat_id", -I8);
                }
                tnVar.presentFragment(new tn(bundle));
                return;
            }
            boolean z12 = false;
            if (tnVar.A9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                tnVar.vb(true, true);
                byte[] bArr = tnVar.R3;
                String str2 = tnVar.S3;
                qe qeVar = new qe(tnVar, 1);
                int i11 = y21.v;
                int currentAccount = tnVar.getCurrentAccount();
                Activity parentActivity = tnVar.getParentActivity();
                long a2 = tnVar.a();
                if (parentActivity != null) {
                    y21.J(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.tc.a0(tnVar), tnVar.getResourceProvider(), bArr, str2, qeVar);
                }
            } else if (tnVar.N3 == 2) {
                tnVar.finishFragment();
                fm fmVar = tnVar.R8;
                if (tnVar.f43027x0.getTag() == null) {
                    z12 = true;
                }
                fmVar.U(true, z12);
            } else {
                TLRPC.User user = tnVar.f42801f;
                if (user != null && user.f22539id == 489000) {
                    tnVar.bc(true);
                } else if (user != null && tnVar.f42898n) {
                    if (user.bot) {
                        String str3 = tnVar.f42744a8;
                        tnVar.f42744a8 = null;
                        tnVar.getMessagesController().unblockPeer(tnVar.f42801f.f22539id, new je(tnVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(tnVar.getParentActivity(), 0, tnVar.f42746aa);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.P = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new me(tnVar, 6));
                    c2Var.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    tnVar.showDialog(c2Var);
                } else if (UserObject.isReplyUser(user)) {
                    tnVar.bc(true);
                } else {
                    TLRPC.User user2 = tnVar.f42801f;
                    if (user2 != null && user2.bot && (str = tnVar.f42744a8) != null) {
                        if (str.length() != 0) {
                            tnVar.getMessagesController().sendBotStart(tnVar.f42801f, tnVar.f42744a8);
                        } else {
                            tnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", tnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        tnVar.f42744a8 = null;
                        tnVar.hc(false);
                        return;
                    }
                    if (ChatObject.isChannel(tnVar.f42787e)) {
                        TLRPC.Chat chat = tnVar.f42787e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (tnVar.f42787e.join_request) {
                                    tnVar.vb(true, true);
                                    MessagesController.getInstance(tnVar.currentAccount).addUserToChat(tnVar.f42787e.f22392id, UserConfig.getInstance(tnVar.currentAccount).getCurrentUser(), 0, null, null, true, new ee(tnVar, 17), new kg.w(15, tnVar, context));
                                    return;
                                }
                                ee eeVar = tnVar.H5;
                                if (eeVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(eeVar);
                                    tnVar.H5 = null;
                                }
                                tnVar.vb(true, true);
                                tnVar.getMessagesController().addUserToChat(tnVar.f42787e.f22392id, tnVar.getUserConfig().getCurrentUser(), 0, null, tnVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.r0 r0Var = tnVar.G1;
                                if (r0Var != null && (vgVar = tnVar.I0) != null && vgVar.d(r0Var) && tnVar.J1.getVisibility() != 8 && tnVar.J1.getTag(R.id.object_tag) != null) {
                                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(tnVar.currentAccount).edit();
                                    edit.putInt("dialog_bar_vis3" + tnVar.P5, 3).commit();
                                    tnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(tnVar.P5));
                                    return;
                                }
                                return;
                            }
                            tnVar.bc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = tnVar.V7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = tnVar.f42787e;
                    TLRPC.User user3 = tnVar.f42801f;
                    if (tnVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.c5.s(tnVar, false, chat2, user3, z11, true, false, z10, new me(tnVar, 7));
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.hv0 A() {
        return this.T0;
    }

    public final void A6(boolean z10, boolean z11) {
        long j10;
        TLRPC.DraftMessage draft;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        jn jnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i10;
        jn jnVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j12;
        org.telegram.ui.Components.h01 h01Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.y5 y5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        Long l11;
        if (this.U != null) {
            int i11 = this.N3;
            if (i11 == 0 || i11 == 8 || (i11 == 3 && getUserConfig().getClientUserId() == I8())) {
                long j14 = 0;
                if (this.N3 == 8) {
                    if (ChatObject.isMonoForum(this.f42787e)) {
                        if (this.Z3 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.f42787e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.h01 h01Var2 = null;
                if (v9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.P5);
                    if (oneThreadDraft != null) {
                        l11 = (Long) oneThreadDraft.first;
                        draft = (TLRPC.DraftMessage) oneThreadDraft.second;
                    } else {
                        draft = null;
                        l11 = null;
                    }
                    l10 = l11;
                } else {
                    MediaDataController mediaDataController = getMediaDataController();
                    long j15 = this.P5;
                    if (this.N3 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.Z3;
                    }
                    draft = mediaDataController.getDraft(j15, j10);
                    l10 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                dk dkVar = this.U;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                dkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.P5, b());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j16 = this.P5;
                    if (l10 != null) {
                        j13 = l10.longValue();
                    } else {
                        j13 = this.Z3;
                    }
                    message = mediaDataController2.getDraftMessage(j16, j13);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.U.getFieldText() != null && (this.N3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.Wb >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.U.setFieldText("");
                        this.U.setEffectId(0L);
                        e9(true);
                    }
                } else if (draftVoice != null) {
                    this.U.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.Wb = draftMessage3.date;
                    dk dkVar2 = this.U;
                    dkVar2.S2 = null;
                    dkVar2.T2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i12 = 0;
                        while (i12 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i12);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
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
                                h01Var = null;
                                org.telegram.ui.Components.d51 d51Var = new org.telegram.ui.Components.d51(a4.w.m(j12, ""), 3, null);
                                int i13 = messageEntity.offset;
                                valueOf.setSpan(d51Var, i13, messageEntity.length + i13, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f29024a |= 4;
                                    org.telegram.ui.Components.i01 i01Var = new org.telegram.ui.Components.i01(obj, 0);
                                    int i14 = messageEntity.offset;
                                    MediaDataController.addStyleToText(i01Var, i14, messageEntity.length + i14, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f29024a |= 1;
                                        org.telegram.ui.Components.i01 i01Var2 = new org.telegram.ui.Components.i01(obj2, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(i01Var2, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f29024a |= 2;
                                        org.telegram.ui.Components.i01 i01Var3 = new org.telegram.ui.Components.i01(obj3, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(i01Var3, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f29024a |= 8;
                                        org.telegram.ui.Components.i01 i01Var4 = new org.telegram.ui.Components.i01(obj4, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(i01Var4, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f29024a |= 16;
                                        org.telegram.ui.Components.i01 i01Var5 = new org.telegram.ui.Components.i01(obj5, 0);
                                        int i18 = messageEntity.offset;
                                        MediaDataController.addStyleToText(i01Var5, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.c51 c51Var = new org.telegram.ui.Components.c51(messageEntity.url, h01Var2);
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(c51Var, i19, messageEntity.length + i19, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f29024a |= 256;
                                        org.telegram.ui.Components.i01 i01Var6 = new org.telegram.ui.Components.i01(obj6, 0);
                                        int i20 = messageEntity.offset;
                                        MediaDataController.addStyleToText(i01Var6, i20, messageEntity.length + i20, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i21 = messageEntity.offset;
                                        org.telegram.ui.Components.qi0.c(valueOf, i21, messageEntity.length + i21, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.U.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            FileLog.e((Throwable) e10, false);
                                            fontMetricsInt = h01Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            y5Var = new org.telegram.ui.Components.y5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i22 = messageEntity.offset;
                                        valueOf.setSpan(y5Var, i22, messageEntity.length + i22, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        h01Var = h01Var2;
                                    }
                                    h01Var = h01Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                h01Var = null;
                            }
                            i12++;
                            h01Var2 = h01Var;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        jnVar = h01Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        jnVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.U.f1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.U.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new ee(this, 4), 700L);
                    }
                    this.U.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f42768c5 = of2;
                        Db(of2);
                    }
                    messageObject = this.f42856j5;
                    if (messageObject != null || this.T3 == messageObject) {
                        if (message == null && ((messageObject2 = this.T3) == null || messageObject2.getId() != message.f22413id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f42856j5 = messageObject3;
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
                                        jnVar2 = jnVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        jnVar2 = new jn(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f42831h5 = jnVar2;
                                }
                            }
                            V6(false);
                            jn jnVar3 = this.f42831h5;
                            if (jnVar3 != null) {
                                Cb(this.f42856j5, jnVar3);
                            } else {
                                Bb(this.f42856j5);
                            }
                            hc(false);
                            return;
                        } else if (l10 == null && l10.longValue() != j11 && this.f42787e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.f42787e.f22392id, l10.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f42856j5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Bb(messageObject4);
                            hc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j11 = 0;
                jnVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f42768c5 = of22;
                    Db(of22);
                }
                messageObject = this.f42856j5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l10 == null) {
                }
            }
        }
    }

    public final void A7(boolean z10) {
        this.N8 = z10;
        org.telegram.ui.ActionBar.o1 o1Var = this.M8;
        if (o1Var != null) {
            o1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.Xb;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Xb.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Xb = ofFloat;
            ofFloat.addUpdateListener(new ge(this, 0));
            this.Xb.setDuration(150L);
            this.Xb.start();
        }
    }

    public final int A8(MessageObject messageObject, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.f42835h9 == null) {
            this.f42835h9 = new org.telegram.ui.Cells.s1(getParentActivity(), this.currentAccount, true, this.xa, this.f42746aa);
        }
        org.telegram.ui.Cells.s1 s1Var = this.f42835h9;
        if (this.f42787e == null && !UserObject.isUserSelf(this.f42801f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        s1Var.J7 = z11;
        org.telegram.ui.Cells.s1 s1Var2 = this.f42835h9;
        int i10 = this.N3;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        s1Var2.L7 = z12;
        if (i10 == 3 && this.Ka) {
            z13 = true;
        } else {
            z13 = false;
        }
        s1Var2.M7 = z13;
        TLRPC.User user = this.f42801f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        s1Var2.N7 = z14;
        if (ChatObject.isChannel(this.f42787e) && this.f42787e.megagroup) {
            z15 = true;
        }
        s1Var2.O7 = z15;
        this.f42835h9.A8 = t9();
        this.f42835h9.B8 = C9();
        this.f42835h9.C8 = B9();
        return this.f42835h9.g1(messageObject, (MessageObject.GroupedMessages) this.f42979t6.f(messageObject.getGroupId()), z10);
    }

    public final boolean A9() {
        return !TextUtils.isEmpty(this.Q3);
    }

    public final void Aa(int i10) {
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
                    this.R7 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e10) {
                FileLog.e(e10);
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
                if (ChatObject.isChannel(this.f42787e) && (tL_chatBannedRights = this.f42787e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                hp0 hp0Var = new hp0(0, z10, true, this);
                if (this.N3 == 9) {
                    hp0Var.C = 1;
                    hp0Var.D = true;
                } else {
                    TLRPC.Chat chat = this.f42787e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f42787e.slowmode_enabled) {
                        hp0Var.C = 10;
                        hp0Var.D = true;
                    } else {
                        MessageObject messageObject = this.f42880l5;
                        if (messageObject != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (messageObject == null) {
                            z11 = true;
                        }
                        hp0Var.C = i11;
                        hp0Var.D = z11;
                    }
                }
                hp0Var.R = new jl(this);
                presentFragment(hp0Var);
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
                        this.R7 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Ab(ArrayList arrayList) {
        yb(true, null, null, arrayList, null, null, false, true);
    }

    public final void Ac(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f42839i1 > 0 && ((i10 = this.N3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42803f1.e(4, z11, z10);
        this.f42803f1.c(4, this.f42839i1, z10);
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.f42787e)) {
            arrayList.add(new xf.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f42736a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new xf.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new ig(this, 15)));
            arrayList.add(new xf.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new ig(this, 16)));
        }
        if (this.f42801f == null) {
            arrayList.add(new xf.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new xf.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new w0("", 1)));
            arrayList.add(new xf.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.b2(this)));
        }
        return arrayList;
    }

    public final int B6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f42973t0.getHeight();
        long j10 = 0;
        int i11 = 0;
        while (true) {
            View U0 = this.f42973t0.U0(i10);
            if (U0 == null) {
                break;
            }
            if (U0 instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) U0;
                messageObject = s1Var.getMessageObject();
                additionalPaddingHeight = s1Var.getAdditionalPaddingHeight();
            } else if (U0 instanceof org.telegram.ui.Cells.v0) {
                messageObject = ((org.telegram.ui.Cells.v0) U0).getMessageObject();
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
                height = Math.min(height, U0.getTop());
                i11 = Math.max(i11, U0.getBottom() - additionalPaddingHeight);
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

    public final long B7(MessageObject messageObject) {
        if (this.N3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.f42787e) && !this.f42779d4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f22444id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.f42787e));
        }
        return this.Z3;
    }

    public final boolean B9() {
        org.telegram.ui.Components.m21 m21Var = this.N1;
        if (m21Var != null && m21Var.M && m21Var.f30550a.f49506f) {
            return true;
        }
        return false;
    }

    public final void Ba(int r27) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Ba(int):void");
    }

    public final void Bb(MessageObject messageObject) {
        zb(true, messageObject, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void Bc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f42827h1 > 0 && ((i10 = this.N3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42803f1.e(3, z11, z10);
        this.f42803f1.c(3, this.f42827h1, z10);
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final float C6(boolean z10) {
        float f9;
        float f10;
        float f11;
        dk dkVar = this.U;
        float f12 = 0.0f;
        if (dkVar != null) {
            if (z10) {
                f9 = dkVar.f26124f5;
            } else {
                f9 = dkVar.f26117e5;
            }
        } else {
            f9 = 0.0f;
        }
        float max = Math.max(f9, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        vd.a aVar = this.f42972sc;
        f5.u uVar = this.f43036xc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(uVar.f6631a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(uVar.f6631a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (aVar.f49506f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) uVar.f6632b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = aVar.f49505e;
            f11 = f13;
        }
        if (!this.Ka && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f11) * f10, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f12);
        }
        return AndroidUtilities.lerp(dp, max, f11) * f10;
    }

    public final SendMessageChatArguments C8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.N3 == 9) {
            builder.setWelcomeMessageChatId(this.f42934pa);
        }
        if (this.N3 == 5) {
            builder.setQuickReplyShortcut(this.M3, H8());
        }
        return builder.build();
    }

    public final boolean C9() {
        if (this.N1 == null) {
            if (this.P3 || !ChatObject.isMonoForum(this.f42787e)) {
                if (!ChatObject.isForum(this.f42787e) || !ChatObject.areTabsEnabled(this.f42787e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean Ca(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f42758b8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f42801f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f42758b8 == this.P5) {
                this.f42758b8 = 0L;
                this.U.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f42758b8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((o2Var instanceof tn) && ((tn) o2Var).P5 == this.f42758b8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f42758b8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f42758b8));
                } else if (DialogObject.isUserDialog(this.f42758b8)) {
                    bundle.putLong("user_id", this.f42758b8);
                } else {
                    bundle.putLong("chat_id", -this.f42758b8);
                }
                v6();
                presentFragment(new tn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Cb(MessageObject messageObject, jn jnVar) {
        yb(true, messageObject, null, null, null, jnVar, false, true);
    }

    public final void Cc(boolean z10) {
        String string;
        if (this.N3 != 3 && !UserObject.isBotForum(this.f42801f)) {
            gj gjVar = this.W0;
            if (gjVar != null && this.Z3 != 0) {
                if (this.f42779d4) {
                    Sc();
                } else if (this.f42767c4) {
                    MessageObject messageObject = this.T3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.W0.setTitle(LocaleController.formatPluralString("Comments", this.T3.getRepliesCount(), new Object[0]));
                    } else {
                        this.W0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.T3;
                    if (messageObject2 != null) {
                        gjVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.X3 != null) {
                if (this.T3.getRepliesCount() == 0) {
                    if (this.f42767c4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.X3;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.f43013w0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final boolean D6() {
        if (!z9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f42779d4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                ik ikVar = this.K0;
                if (ikVar == null || ikVar.getVisibility() != 0) {
                    if (!F9() || this.f42779d4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.D7():void");
    }

    public final boolean D9() {
        boolean z10;
        boolean z11;
        float f9;
        FrameLayout frameLayout;
        if (!this.f42763c && !this.d && this.f42801f == null && this.f42973t0 != null && SharedConfig.animationsEnabled()) {
            if (this.f42799eb == null) {
                this.f42799eb = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f42799eb.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f42973t0.getChildCount(); i12++) {
                    i11 += this.f42973t0.getChildAt(i12).getHeight();
                    int top = this.f42973t0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f42921o9) {
                    L6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.f43044y6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.q6;
                if ((!z12 || ((this.H6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.C6 && f10 > this.f42921o9 && (!arrayList.isEmpty() ? i11 != 0 : this.f42785db)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.M0) == null || frameLayout.getVisibility() != 0 || this.M0.getChildCount() <= 0) {
                    if (!z10 && this.J6 == 0) {
                        L6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.N9 && this.fragmentBeginToShow) {
                        if (z10 && this.J6 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable d = this.f42746aa.d();
                        km kmVar = this.T0;
                        if (kmVar != null) {
                            d = kmVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.yb0) {
                            org.telegram.ui.Components.yb0 yb0Var = (org.telegram.ui.Components.yb0) d;
                            if (yb0Var.N != z11) {
                                if (!z11) {
                                    yb0Var.c();
                                }
                                yb0Var.q(z11);
                                if (z11) {
                                    f9 = 1.5f;
                                } else {
                                    f9 = 1.0f;
                                }
                                yb0Var.M = f9;
                                yb0Var.z();
                            } else if (z11) {
                                yb0Var.z();
                            }
                        }
                    }
                    if (z10 || (this.J6 != 0 && System.currentTimeMillis() - this.J6 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Da(MessageObject messageObject, int i10) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f22413id = 0;
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
        messageObject2.stableId = T8(messageObject.dateKeyInt);
        this.f43013w0.L.add(i10, messageObject2);
    }

    public final void Db(MessageSuggestionParams messageSuggestionParams) {
        zb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Dc(MessageObject messageObject, int i10) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.f42892m6;
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
            MessageObject messageObject3 = (MessageObject) this.f42870k6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                em emVar = this.f43013w0;
                if (emVar != null) {
                    emVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    public final boolean E6() {
        if (this.h == null) {
            ik ikVar = this.K0;
            if (ikVar == null || ikVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E7() {
        if (getParentActivity() != null && getParentActivity() != null && this.F1 == null) {
            lh.s2 s2Var = new lh.s2(this, getParentActivity(), this, this.f42746aa, 1);
            this.F1 = s2Var;
            s2Var.V = a();
            lh.s2 s2Var2 = this.F1;
            s2Var2.f31001e0 = true;
            s2Var2.V1 = new gl(this);
        }
    }

    public final int E8(MessageObject messageObject) {
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f22412id)) {
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

    public final boolean E9() {
        if (getUserConfig().getClientUserId() == a() && !getMessagesController().getSavedMessagesController().unsupported && getUserConfig().isPremium()) {
            return true;
        }
        return false;
    }

    public final void Ea() {
        int i10;
        this.D4.clear();
        this.F4.clear();
        this.H4 = 0;
        this.L4 = 0;
        this.M4 = 0;
        yc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.V7;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.N4 = true;
        zc();
    }

    public final void Eb(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        yb(z10, null, null, null, webPage, null, z11, true);
    }

    public final void Ec(boolean z10) {
        dk dkVar = this.U;
        if (dkVar != null) {
            dkVar.O1(z10);
        }
    }

    @Override
    public final boolean F() {
        return this.f42796e8;
    }

    public final boolean F6(MessageObject messageObject) {
        if (this.N3 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.f42787e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f42787e.f22392id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.N3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.f42787e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void F7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        ig igVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.S5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f42801f;
        TLRPC.Chat chat = this.f42787e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.V7;
        long j10 = this.H6;
        int b10 = (int) b();
        int i10 = this.N3;
        ig igVar2 = new ig(this, 6);
        if (z10) {
            igVar = new ig(this, 7);
        } else {
            igVar = null;
        }
        ig igVar3 = igVar;
        org.telegram.ui.Components.c5.z(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.S5, groupedMessages, b10, i10, null, igVar2, igVar3, this.f42746aa);
    }

    public final int F8() {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        int i10 = 0;
        if (b5Var == null || b5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(i10);
                if (o2Var != this && (o2Var instanceof tn) && ((tn) o2Var).P5 == this.P5) {
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

    public final boolean F9() {
        if (this.T3 != null) {
            return true;
        }
        return false;
    }

    public final void Fa(MessageObject messageObject) {
        if (messageObject == this.Ib) {
            this.Ib = null;
            Qc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.P5);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Fb(boolean z10) {
        if (this.T2 != null && !z9()) {
            if (this.T2.getTag() == null) {
                AnimatorSet animatorSet = this.c3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.T2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.c3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.c3.playTogether(ObjectAnimator.ofFloat(this.T2, View.ALPHA, 1.0f));
                this.c3.addListener(new oi(this, 5));
                this.c3.start();
            }
            if (!z10) {
                r9();
                this.W2 = 1000;
            }
        }
    }

    public final void Fc(int i10, int i11, int i12) {
        float f9;
        int i13;
        boolean z10;
        boolean z11;
        ug.g gVar = this.f42803f1;
        boolean z12 = false;
        if (gVar != null) {
            int i14 = 2;
            if (this.La) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.b(6).f8924c = z10;
            l3.g0 g0Var = gVar.f49236e[6];
            if (g0Var != null) {
                ((tg.b) g0Var.f14096b).b(z10, true);
            }
            ug.g gVar2 = this.f42803f1;
            if (this.La) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            gVar2.b(5).f8924c = z11;
            l3.g0 g0Var2 = gVar2.f49236e[5];
            if (g0Var2 != null) {
                ((tg.b) g0Var2.f14096b).b(z11, true);
            }
        }
        this.f42963s3 = i12;
        this.f42976t3 = i11;
        Gc();
        org.telegram.ui.Components.o6 o6Var = this.R2;
        if (o6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            o6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.R2.animate();
            if (i12 > 0) {
                f9 = 1.0f;
            } else {
                f9 = 0.5f;
            }
            animate.alpha(f9).start();
        }
    }

    public final void G6(boolean z10) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.User user2;
        boolean z11;
        final boolean z12;
        float f9;
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f42787e != null && (this.N3 != 0 || this.Z3 != 0 || (chatFull = this.V7) == null || chatFull.ttl_period == 0)) || ((user = this.f42801f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.W7) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.u0 u0Var = this.Y;
            if (u0Var != null) {
                u0Var.e(8);
            }
            gj gjVar = this.W0;
            if (gjVar != null) {
                gjVar.f34783a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var2 = this.Y;
            if (u0Var2 != null) {
                u0Var2.e(0);
            }
            gj gjVar2 = this.W0;
            if (gjVar2 != null) {
                gjVar2.f34783a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f42912o0;
        if (u0Var3 != null) {
            TLRPC.Chat chat = this.f42787e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u0Var3.e(i11);
        }
        gj gjVar3 = this.W0;
        if (gjVar3 != null) {
            TLRPC.Chat chat2 = this.f42787e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f42801f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            gjVar3.setCommunityItemVisible(z11);
            final gj gjVar4 = this.W0;
            TLRPC.Chat chat3 = this.f42787e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = gjVar4.A;
            ImageView imageView2 = gjVar4.f34809y;
            if (imageView2 != null && imageView != null) {
                gjVar4.f34795h0 = z12;
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
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f9);
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
                                    xn xnVar = gjVar4;
                                    if (!z14) {
                                        xnVar.f34809y.setVisibility(4);
                                        return;
                                    } else {
                                        xnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    xn xnVar2 = gjVar4;
                                    if (!z15) {
                                        xnVar2.A.setVisibility(4);
                                        return;
                                    } else {
                                        xnVar2.getClass();
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
                                    xn xnVar = gjVar4;
                                    if (!z14) {
                                        xnVar.f34809y.setVisibility(4);
                                        return;
                                    } else {
                                        xnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    xn xnVar2 = gjVar4;
                                    if (!z15) {
                                        xnVar2.A.setVisibility(4);
                                        return;
                                    } else {
                                        xnVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.W0.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.W7;
                if (userFull2 != null) {
                    this.W0.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.V7;
                    if (chatFull3 != null) {
                        this.W0.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f42899n0 != null && (chatFull2 = this.V7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.f42787e)) {
                TLRPC.Chat chat4 = this.f42787e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f42899n0;
            if (z13) {
                i12 = 0;
            }
            u0Var4.e(i12);
        }
        p();
    }

    public final void G7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.G7(boolean):void");
    }

    public final int G8() {
        return Math.max(this.L4, this.M4);
    }

    public final void G9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.q6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.f43044y6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() != this.H6) {
                            i13 = 0;
                        }
                        j(id2, 0, false, i13, true, 0);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.P5)) {
                int N0 = this.f42999v0.N0();
                int L0 = this.f42999v0.L0();
                while (true) {
                    if (L0 <= N0) {
                        em emVar = this.f43013w0;
                        int i14 = emVar.F;
                        if (L0 >= i14 && L0 < emVar.G && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
                            if (message.date < i10) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (w()) {
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
                this.S8.d(i11);
                org.telegram.ui.ActionBar.c2 c2Var = this.f42886lb;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                xc(false);
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f42746aa);
                this.f42886lb = c2Var2;
                c2Var2.setOnCancelListener(this.f42848ia);
                this.f42886lb.q(1000L);
                int i15 = this.R5;
                this.U8 = i15;
                this.W8 = false;
                this.f42781d6.add(Integer.valueOf(i15));
                this.V8 = 0;
                this.X8 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.P5;
                long j11 = this.H6;
                int i16 = this.classGuid;
                int i17 = this.N3;
                long j12 = this.Z3;
                int i18 = this.f42842i4;
                int i19 = this.R5;
                this.R5 = i19 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j12, i18, i19, this.f42779d4);
                this.T2.setAlpha(0.0f);
                this.T2.setTag(null);
                this.f42791e3 = 0.0f;
                lc();
                this.U2.setTag(null);
            }
        }
    }

    public final void Ga(MessageObject messageObject) {
        ArrayList arrayList = this.q6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            em emVar = this.f43013w0;
            if (emVar != null && !emVar.J) {
                emVar.u(emVar.F + indexOf);
            }
        }
    }

    public final void Gb(boolean z10) {
        if (this.U2 != null && !z9()) {
            if (this.U2.getTag() == null) {
                ValueAnimator valueAnimator = this.f42778d3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.U2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42791e3, 1.0f);
                this.f42778d3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f42778d3.addUpdateListener(new ge(this, 2));
                this.f42778d3.addListener(new oi(this, 7));
                this.f42778d3.start();
            }
            if (!z10) {
                r9();
                this.W2 = 1000;
            }
        }
    }

    public final void Gc() {
        org.telegram.ui.Components.o6 o6Var = this.Q2;
        if (o6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f42963s3;
            if (i10 < 0) {
                o6Var.c("", z10, true);
            } else if (i10 == 0) {
                o6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f42902n3) {
                o6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.N3 != 7 && !this.f42998uc.f49506f) {
                o6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f42976t3 + 1), Integer.valueOf(this.f42963s3)), z10, true);
            } else {
                o6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    @Override
    public final long H() {
        return this.H6;
    }

    public final void H6() {
        if (this.Ka) {
            return;
        }
        if (A9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int H8() {
        if (this.N3 == 5) {
            return (int) this.Z3;
        }
        return 0;
    }

    public final void H9() {
        this.f43054z4 = true;
        if (this.f42844i6) {
            getMessagesStorage().getUnreadMention(this.P5, b(), new qg(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.P5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f42779d4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.Z3;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f42832h6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new zg(1, this, messagesStorage));
    }

    public final void Ha(MessageObject messageObject) {
        ArrayList arrayList = this.q6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            em emVar = this.f43013w0;
            if (emVar != null && !emVar.J) {
                emVar.P(emVar.F + indexOf, true);
            }
        }
    }

    public final boolean Hb() {
        dk dkVar = this.U;
        if (dkVar != null && dkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.a2 == null) {
                    if (!this.X4) {
                        dk dkVar2 = this.U;
                        if (dkVar2 != null) {
                            dkVar2.U();
                            MediaDataController.getInstance(dkVar2.M).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.xf xfVar = dkVar2.Q0;
                            xfVar.M(false, false);
                            xfVar.S(false, false);
                            xfVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        km kmVar = this.T0;
                        int indexOfChild = kmVar.indexOfChild(this.O);
                        if (indexOfChild != -1) {
                            dk dkVar3 = this.U;
                            dkVar3.U();
                            MediaDataController.getInstance(dkVar3.M).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.xf xfVar2 = dkVar3.Q0;
                            xfVar2.M(false, false);
                            xfVar2.S(false, false);
                            xfVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f42962s2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            kmVar.addView(this.f42962s2, i10, i7.f6.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(9, getParentActivity(), this.f42746aa, false);
                            this.a2 = g40Var;
                            g40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            kmVar.addView(this.a2, i10, i7.f6.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.g40 g40Var2 = this.a2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(g40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f42962s2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new oi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.U.getEmojiButton();
                            if (emojiButton != null) {
                                this.a2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Hc() {
        M7();
        String str = this.f42940q3;
        if (str != null) {
            this.Z1.f32122e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.H3.setEmptyView(this.Z1);
            return;
        }
        this.H3.setEmptyView(null);
        this.Z1.setVisibility(8);
    }

    public final void I6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.I6():void");
    }

    public final boolean I7(android.view.View r94, boolean r95, boolean r96, float r97, float r98, boolean r99, boolean r100, boolean r101) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.I7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final long I8() {
        if (this.N3 == 3) {
            return this.Z3;
        }
        return 0L;
    }

    public final void I9(boolean z10) {
        TLRPC.Chat chat;
        if (this.da == null && (chat = this.f42787e) != null && ChatObject.canSendAsPeers(chat) && this.U != null && !ChatObject.isMonoForum(this.f42787e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.P5);
            this.da = sendAsPeers;
            if (sendAsPeers != null) {
                this.U.Q1(false, z10);
            }
        }
    }

    public final void Ia() {
        if (this.L7 == null && this.M7 == null && this.N7 == null) {
            ee eeVar = this.Q7;
            if (eeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(eeVar);
                this.Q7 = null;
            }
            this.H7 = Integer.MAX_VALUE;
            this.J7 = false;
            this.K7 = 0L;
            this.L7 = null;
            this.M7 = null;
            this.N7 = null;
        }
    }

    public final void Ib() {
        TLRPC.ChatFull chatFull = this.V7;
        if (chatFull != null && !this.f42891m5) {
            TLRPC.Chat chat = this.f42787e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new ee(this, 14), 1000L);
            }
        }
    }

    public final void Ic() {
        boolean z10;
        if (this.f42803f1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f42915o3 && !this.f42902n3) || (this.N3 == 7 && this.K3 == 2 && !this.q6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42803f1.e(6, z10, true);
        this.f42803f1.e(5, z10, true);
        if (z10) {
            this.f42803f1.e(1, false, true);
        }
        if (!z10) {
            this.f43033x7 = 0;
        }
        this.T0.invalidate();
    }

    @Override
    public final boolean J(fy fyVar) {
        return false;
    }

    public final void J6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f9 = (1.0f - this.f42972sc.f49505e) * (1.0f - this.f42946qc.f49505e) * ((float[]) this.f43036xc.f6632b)[i10];
            view.setAlpha(f9);
            if (z10) {
                if (f9 > 0.0f) {
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

    public final int J8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f42973t0.getMeasuredHeight() - this.f43023wa) - this.f42921o9) - this.v.d()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void J9(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Ja(boolean z10) {
        MessageObject messageObject = this.F7;
        if (messageObject != null) {
            if (z10) {
                boolean[] zArr = this.A6;
                zArr[1] = true;
                zArr[0] = true;
                this.D7 = 0;
                this.G6 = 0;
            }
            this.f43057z7 = 0;
            this.A7 = false;
            Ga(messageObject);
            this.F7 = null;
        }
    }

    public final void Jb(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.mc G = org.telegram.ui.Components.tc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f30652j = max;
        G.v = new te(this, i10, 3);
        G.k(true);
        this.C3 = messageObject;
        this.D3 = i10;
    }

    public final void Jc(String str) {
        if (this.N3 == 7 && !TextUtils.equals(this.f42940q3, str)) {
            M7();
            Lb(true);
            this.f42940q3 = str;
            this.f42927p3 = str;
            R6(false);
            x7(true);
            this.J6 = 0L;
            this.f42821g7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.K3);
            this.I3.l();
            this.H3.requestLayout();
            if (this.H3.getLayoutManager() != null) {
                this.H3.getLayoutManager().n0(0);
            }
            Hc();
            this.Z1.e(true, true);
            r8();
        }
    }

    public final boolean K6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.V7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            cg.v0.C1(this, this.f43051z1, this.A1, this.P5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void K7() {
        if (this.h == null && this.f42975t2 == null && getParentActivity() != null) {
            bl blVar = new bl(this, getParentActivity());
            this.f42975t2 = blVar;
            blVar.setTag(1);
            this.I0.addView(this.f42975t2, i7.f6.n(-1, 48));
            this.I0.h(1, this.f42975t2);
            this.I0.g(this.f42975t2);
            this.f42975t2.setOnClickListener(new ne(this, 17));
            this.f42975t2.setEnabled(!isInPreviewMode());
            this.f42975t2.setBackground(org.telegram.ui.ActionBar.g6.K0(false));
            org.telegram.ui.Components.rf0 rf0Var = new org.telegram.ui.Components.rf0(getParentActivity(), this.f42746aa);
            this.f43001v2 = rf0Var;
            this.f42975t2.addView(rf0Var, i7.f6.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.f42975t2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.B2 = numberTextView;
            numberTextView.h = true;
            int i10 = 14;
            numberTextView.setTextSize(14);
            this.B2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23106fe));
            this.B2.setTypeface(AndroidUtilities.bold());
            this.f42975t2.addView(this.B2, i7.f6.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            int i11 = 0;
            while (i11 < 2) {
                sn snVar = new sn(this, getParentActivity());
                sn[] snVarArr = this.f43040y2;
                snVarArr[i11] = snVar;
                snVar.setTextSize(i10);
                snVarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23106fe));
                snVarArr[i11].setTypeface(AndroidUtilities.bold());
                this.f42975t2.addView(snVarArr[i11], i7.f6.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                cl clVar = new cl(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f43052z2;
                h5VarArr[i11] = clVar;
                clVar.setTextSize(i10);
                h5VarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124ge));
                this.f42975t2.addView(h5VarArr[i11], i7.f6.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                eg.r rVar = new eg.r(getParentActivity(), 12);
                rVar.setSingleLine(true);
                rVar.setLines(1);
                rVar.setMaxLines(1);
                rVar.setEllipsize(TextUtils.TruncateAt.END);
                rVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Sh));
                rVar.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.g6.Oh)));
                rVar.setTextSize(1, 14.0f);
                rVar.setTypeface(AndroidUtilities.bold());
                rVar.setGravity(17);
                rVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                eg.r[] rVarArr = this.A2;
                rVarArr[i11] = rVar;
                this.f42975t2.addView(rVar, i7.f6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                dl dlVar = new dl(getParentActivity());
                dlVar.E = new gh.k();
                dlVar.D = new Path();
                dlVar.F = new float[8];
                org.telegram.ui.Components.t9[] t9VarArr = this.f43029x2;
                t9VarArr[i11] = dlVar;
                dlVar.setBlurAllowed(true);
                t9VarArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f42975t2.addView(t9VarArr[i11], i7.f6.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i11 == 1) {
                    snVarArr[i11].setVisibility(4);
                    rVarArr[i11].setVisibility(4);
                    h5VarArr[i11].setVisibility(4);
                    t9VarArr[i11].setVisibility(4);
                }
                i11++;
                i10 = 14;
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.H2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.H2;
            int i12 = org.telegram.ui.ActionBar.g6.f23069de;
            int themedColor = getThemedColor(i12);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            ImageView imageView3 = this.H2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.H2.setContentDescription(LocaleController.getString(R.string.AccPinnedMessagesList));
            this.H2.setVisibility(4);
            this.H2.setAlpha(0.0f);
            this.H2.setScaleX(0.4f);
            this.H2.setScaleY(0.4f);
            ImageView imageView4 = this.H2;
            int i13 = org.telegram.ui.ActionBar.g6.f23419x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i13) & 436207615, 1, -1));
            this.f42975t2.addView(this.H2, i7.f6.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.H2.setOnClickListener(new ne(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.F2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.F2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
            this.F2.setScaleType(scaleType);
            this.F2.setVisibility(8);
            this.F2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f42746aa);
            this.G2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.G2.setSize(AndroidUtilities.dp(16.0f));
            this.G2.setStrokeWidth(2.0f);
            this.G2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23088ee));
            this.f42975t2.addView(this.G2, i7.f6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.F2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i13) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f42975t2.addView(this.F2, i7.f6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.F2.setOnClickListener(new ne(this, 19));
            xc(false);
        }
    }

    public final int K8(MessageObject messageObject) {
        return J8(A8(messageObject, !TextUtils.isEmpty(this.L7))) - Ua(messageObject);
    }

    public final qi K9(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle) {
        ye.c cVar = this.f43024wb;
        if (cVar != null) {
            cVar.a(true);
            this.f43024wb = null;
        }
        if (characterStyle != null && s1Var != null && s1Var.getMessageObject() != null) {
            qi qiVar = new qi(this, s1Var.getMessageObject().getId(), characterStyle, s1Var, 0);
            this.f43024wb = qiVar;
            return qiVar;
        }
        this.f43024wb = null;
        return null;
    }

    public final void Ka(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            hVar = this.f42979t6;
            arrayList2 = this.q6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.F4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.F4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f42870k6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f42801f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f42801f.f22539id, (int) b(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Ta();
                this.Mb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Lb.bind(messageObject2.messageOwner.f22413id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f22413id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.F4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.F4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.H4) {
                    yc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f42881l6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.N3 == 1))) {
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
                    HashMap hashMap2 = this.f42905n6;
                    ArrayList arrayList6 = (ArrayList) hashMap2.get(str);
                    if (arrayList6 != null) {
                        i12 = arrayList6.indexOf(messageObject2);
                    } else {
                        i12 = -1;
                    }
                    if (messageObject2.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId())) != null && (indexOf = groupedMessages.messages.indexOf(messageObject2)) >= 0) {
                        i11 = i16;
                        if (messageObject2.getGroupId() != messageObject.getGroupId()) {
                            hVar.k(groupedMessages, messageObject.getGroupId());
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
                                groupedMessages2.reversed = this.La;
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
                    if (this.N3 == 3) {
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
                        em emVar2 = this.f43013w0;
                        if (emVar2 != null && !emVar2.J) {
                            emVar2.Q(emVar2.F + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        em emVar3 = this.f43013w0;
                        if (emVar3 != null && !emVar3.J) {
                            emVar3.u(emVar3.F + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.h hVar3 = this.f42930p6;
                        if (((MessageObject) hVar3.f(id4)) != null) {
                            hVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            em emVar4 = this.f43013w0;
                            int i22 = emVar4.A;
                            int i23 = emVar4.B;
                            int i24 = emVar4.D;
                            int i25 = emVar4.C;
                            if (!emVar4.J) {
                                emVar4.u(emVar4.F + indexOf2);
                                if (arrayList2.isEmpty()) {
                                    if (i22 >= 0) {
                                        i15 = 0;
                                        this.f43013w0.u(0);
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i23 >= 0) {
                                        this.f43013w0.u(i15);
                                    }
                                    if (i24 >= 0) {
                                        this.f43013w0.u(i15);
                                    }
                                    if (i25 >= 0) {
                                        this.f43013w0.u(i15);
                                    }
                                }
                            }
                        }
                        if (i21 >= 0) {
                            arrayList9.remove(i21);
                            if (arrayList9.isEmpty()) {
                                hashMap.remove(messageObject2.dateKey);
                                this.f42918o6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                em emVar5 = this.f43013w0;
                                int i26 = emVar5.A;
                                int i27 = emVar5.B;
                                int i28 = emVar5.D;
                                int i29 = emVar5.C;
                                if (!emVar5.J) {
                                    emVar5.u(emVar5.F + indexOf2);
                                    if (arrayList2.isEmpty()) {
                                        if (i26 >= 0) {
                                            i14 = 0;
                                            this.f43013w0.u(0);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i27 >= 0) {
                                            this.f43013w0.u(i14);
                                        }
                                        if (i28 >= 0) {
                                            this.f43013w0.u(i14);
                                        }
                                        if (i29 >= 0) {
                                            this.f43013w0.u(i14);
                                        }
                                        Dc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Dc(messageObject, messageObject2.getId());
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
                    int indexOf3 = arrayList2.indexOf((MessageObject) j7.l1.i(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (emVar = this.f43013w0) != null) {
                        emVar.q(indexOf3 + emVar.F, groupedMessages3.messages.size());
                        nj njVar = this.f42986u0;
                        if (njVar != null) {
                            njVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        zc();
    }

    public final void Kb(boolean z10) {
        boolean z11;
        ug.g gVar = this.f42803f1;
        if (gVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.f42787e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            gVar.e(2, z11, true);
            if (!z10) {
                this.f43033x7 = 0;
            }
        }
    }

    public final void Kc() {
        dk dkVar;
        if (this.N != null) {
            this.A0.setBackground(null);
            this.A0.setOnClickListener(null);
            boolean z10 = true;
            if (this.N3 == 3 && I8() == 2666000) {
                this.A0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.N.setVisibility(0);
                this.E1.setVisibility(8);
                this.E1.setTag(null);
                sc();
                org.telegram.ui.Components.fy0 fy0Var = this.Z0;
                if (fy0Var != null) {
                    fy0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f42787e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.f42787e)) {
                    TLRPC.Chat chat2 = this.f42787e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.f42787e.megagroup)) {
                        TLRPC.Chat chat3 = this.f42787e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.g6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.jq jqVar = new org.telegram.ui.Components.jq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                jqVar.f29787e = dp;
                                jqVar.f29788f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                jqVar.h = dp3;
                                jqVar.f29789n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.x3.i(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(jqVar, 1), 0, 1, 33);
                                this.A0.setBackground(org.telegram.ui.ActionBar.g6.g0(0, org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23152i6, false)));
                                this.A0.setText(spannableStringBuilder);
                                this.A0.setOnClickListener(new ne(this, 0));
                            } else {
                                this.A0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.A0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.A0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.f42787e.banned_rights.until_date)));
                        }
                        this.N.setVisibility(0);
                        this.E1.setVisibility(8);
                        this.E1.setTag(null);
                        sc();
                        org.telegram.ui.Components.fy0 fy0Var2 = this.Z0;
                        if (fy0Var2 != null) {
                            fy0Var2.f();
                        }
                    }
                }
                G7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.U0 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.A0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.N.setVisibility(0);
                        this.U.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.A0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a4.w.q(new StringBuilder("<b>"), this.f42801f.first_name, "</b>"))));
                        this.N.setVisibility(0);
                        this.U.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.A0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.N.setVisibility(0);
                        this.U.setVisibility(4);
                        this.U.setFieldText("");
                        getMediaDataController().cleanDraft(this.P5, this.Z3, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.N.setVisibility(4);
                            if (!this.inPreviewMode && !this.Ka && this.N3 != 3) {
                                this.U.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    W6();
                    G6(false);
                } else {
                    this.N.setVisibility(4);
                    if (this.Z0 != null && (dkVar = this.U) != null && dkVar.k0()) {
                        this.Z0.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.N.setVisibility(4);
            }
            if (z10) {
                this.U.m0(false);
                if (getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    public final void L6(boolean z10) {
        if (this.J6 == 0) {
            if (z10 && !this.K6.isEmpty()) {
                this.J6 = System.currentTimeMillis();
            } else {
                this.J6 = 1L;
            }
            D9();
            lj ljVar = this.f42973t0;
            if (ljVar != null) {
                ljVar.invalidate();
            }
        }
    }

    public final void L7() {
        int i10;
        int i11;
        if (this.N2 == null && getParentActivity() != null) {
            hk hkVar = new hk(this, getParentActivity(), 1);
            this.N2 = hkVar;
            hkVar.setClickable(false);
            this.N2.setWillNotDraw(false);
            this.f43036xc.j(4, false, false);
            this.N2.setClipToPadding(false);
            org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(getParentActivity(), true, true, true);
            this.Q2 = o6Var;
            org.telegram.ui.Components.jr jrVar = org.telegram.ui.Components.jr.h;
            o6Var.b(0.25f, 280L, jrVar);
            this.Q2.setTextSize(AndroidUtilities.dp(15.0f));
            this.Q2.setTypeface(AndroidUtilities.bold());
            this.Q2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23440ye));
            this.Q2.setGravity(3);
            this.N2.addView(this.Q2, i7.f6.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.Q.addView(this.N2, i7.f6.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.o6 o6Var2 = new org.telegram.ui.Components.o6(getParentActivity(), true, false, true);
            this.R2 = o6Var2;
            o6Var2.b(0.0f, 420L, jrVar);
            this.R2.setScaleProperty(0.7f);
            this.R2.setTextSize(AndroidUtilities.dp(15.0f));
            this.R2.setGravity(5);
            this.R2.setTypeface(AndroidUtilities.bold());
            this.R2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23260o6));
            org.telegram.ui.Components.o6 o6Var3 = this.R2;
            if (this.f42998uc.f49506f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            o6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.o6 o6Var4 = this.R2;
            o6Var4.f31268n = false;
            o6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.R2.setOnClickListener(new ne(this, 2));
            this.R2.setAlpha(0.5f);
            this.R2.setClickable(false);
            this.N2.addView(this.R2, i7.f6.e(-2, -1, 117));
            org.telegram.ui.Components.o6 o6Var5 = new org.telegram.ui.Components.o6(getParentActivity(), true, true, true);
            this.S2 = o6Var5;
            o6Var5.setGravity(17);
            this.S2.setTypeface(AndroidUtilities.bold());
            this.S2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.Ae));
            this.S2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.o6 o6Var6 = this.S2;
            int i12 = org.telegram.ui.ActionBar.g6.f23062d6;
            o6Var6.setBackground(org.telegram.ui.ActionBar.g6.g0(getThemedColor(i12), org.telegram.ui.ActionBar.g6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6))));
            org.telegram.ui.Components.o6 o6Var7 = this.S2;
            if (this.f43013w0.J) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            o6Var7.setText(LocaleController.getString(i11));
            this.S2.setOnClickListener(new ne(this, 3));
            this.S2.setVisibility(8);
            this.S2.setAlpha(0.0f);
            this.N2.addView(this.S2, i7.f6.e(-1, -1, 119));
            TLRPC.Chat chat = this.f42787e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.f42787e.megagroup) && this.N3 != 7 && !ChatObject.isMonoForum(this.f42787e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.P2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.P2.setImageResource(R.drawable.msg_usersearch);
                this.P2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23423xe), PorterDuff.Mode.MULTIPLY));
                this.P2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), 1, -1));
                this.N2.addView(this.P2, i7.f6.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.P2.setOnClickListener(new ne(this, 4));
                this.P2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.N3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.O2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.O2.setImageResource(R.drawable.msg_calendar);
                this.O2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23423xe), PorterDuff.Mode.MULTIPLY));
                this.O2.setBackgroundDrawable(org.telegram.ui.ActionBar.g6.f0(getThemedColor(org.telegram.ui.ActionBar.g6.f23452z8), 1, -1));
                this.N2.addView(this.O2, i7.f6.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.O2.setOnClickListener(new ne(this, 5));
                this.O2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int L8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f42973t0.getMeasuredHeight() - view.getBottom()) - this.f42973t0.getPaddingBottom()) + "} chatHeight=" + this.f42973t0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f42973t0.getPaddingBottom());
        return (this.f42973t0.getMeasuredHeight() - view.getBottom()) - this.f42973t0.getPaddingBottom();
    }

    public final void L9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.P5, messageObject);
        }
    }

    public final void La() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f42943q7 = 0;
        this.f42821g7 = false;
        this.f42833h7 = true;
        this.f42781d6.clear();
    }

    public final void Lb(boolean z10) {
        int i10;
        if (this.G3 != null) {
            vd.a aVar = this.f42998uc;
            if (aVar.f49506f != z10) {
                aVar.a(z10, true);
                if (!z10 && this.N3 == 7) {
                    f2.j0 j0Var = (f2.j0) this.H3.getLayoutManager();
                    Object E = this.I3.E((j0Var.N0() + j0Var.L0()) / 2);
                    Object E2 = this.I3.E(j0Var.L0());
                    Object E3 = this.I3.E(j0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.f43013w0.L();
                        int L0 = this.f42999v0.L0();
                        int N0 = this.f42999v0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f22413id;
                        int i12 = ((MessageObject) E2).messageOwner.f22413id;
                        int i13 = ((MessageObject) E3).messageOwner.f22413id;
                        boolean z11 = false;
                        boolean z12 = false;
                        int i14 = -1;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f22413id == i12) {
                                int i16 = this.f43013w0.F + i15;
                                if (L0 <= i16 && N0 >= i16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f22413id == i13) {
                                int i17 = this.f43013w0.F + i15;
                                if (L0 <= i17 && N0 >= i17) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f22413id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            int A8 = A8((MessageObject) L.get(i14), true);
                            this.f42999v0.h1(this.f43013w0.F + i14, (this.f42973t0.getHeight() - A8) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.o6 o6Var = this.R2;
                if (o6Var != null) {
                    if (aVar.f49506f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    o6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                nh.t3 t3Var = this.f42974t1;
                if (t3Var != null && t3Var.R) {
                    t3Var.e(true);
                }
                pl plVar = this.f43028x1;
                if (plVar != null && plVar.R) {
                    plVar.e(true);
                }
                dk dkVar = this.U;
                if (dkVar != null) {
                    dkVar.l0();
                }
                Gc();
            }
        }
    }

    public final void Lc() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        long a2 = a();
        long clientUserId = getUserConfig().getClientUserId();
        SparseArray[] sparseArrayArr = this.S5;
        if (a2 == clientUserId) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i12].valueAt(i13);
                    if (messageObject.hasValidGroupId()) {
                        MessageObject.GroupedMessages X8 = X8(messageObject);
                        if (X8 != null) {
                            groupedMessagePosition = X8.getPosition(messageObject);
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
            uk ukVar = this.Xa;
            if (ukVar != null) {
                ukVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Xa.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                uk ukVar2 = this.Xa;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                ukVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new ee(this, 11), 120L);
            } else {
                z10 = !org.telegram.ui.Components.fk0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.w0 k9 = this.actionBar.j(null).k(28);
            if (k9 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.aj0 aj0Var = k9.f23938x;
                if (aj0Var != null && k9.f23939y != i10) {
                    k9.f23939y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(aj0Var, i10);
                }
            }
        }
        if (this.U9 != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i15));
            }
            this.U9.setSelectedMessages(arrayList2);
        }
    }

    public final void M6(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        MessageObject messageObject2 = this.f42880l5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f42755b5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.C5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.C5 = null;
                dk dkVar = this.U;
                if (dkVar != null) {
                    dkVar.S2 = null;
                    dkVar.T2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f42755b5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = dkVar.getFieldText();
                    MessageObject messageObject3 = this.f42856j5;
                    if (messageObject3 == this.T3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f42831h5, this.f42880l5);
                }
                i8();
                j8();
            }
        }
    }

    public final void M7() {
        if (this.Z1 == null && this.f42925p1 == null) {
            org.telegram.ui.Components.p00 p00Var = new org.telegram.ui.Components.p00(getParentActivity(), this.f42746aa);
            this.Y1 = p00Var;
            p00Var.setViewType(7);
            org.telegram.ui.Components.qw0 qw0Var = new org.telegram.ui.Components.qw0(getParentActivity(), this.Y1, 1, null);
            this.Z1 = qw0Var;
            qw0Var.setClickable(true);
            this.Z1.d.setText(LocaleController.getString(R.string.NoResult));
            this.Z1.setVisibility(8);
            this.Z1.addView(this.Y1, 0);
            this.Z1.e(true, false);
            this.G3.addView(this.Z1, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.b40 b40Var = new org.telegram.ui.Components.b40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f42925p1 = b40Var;
            b40Var.setOnHashtagClickListener(new qe(this, 2));
            this.f42925p1.setOnScrollListener(new m3(this, 5));
            this.f42925p1.setVisibility(8);
            this.G3.addView(this.f42925p1, -1, -1);
            r7();
            p7();
        }
    }

    public final ln M8() {
        if (this.f42875kc == null) {
            this.f42875kc = new ln(this);
        }
        return this.f42875kc;
    }

    public final boolean M9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.c6 c6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.c6 animation;
        boolean z10;
        org.telegram.ui.Cells.s1 messageCell;
        boolean z11;
        if (this.f42973t0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.g40 g40Var = this.f42926p2;
            ArrayList<MessageObject> arrayList = null;
            if (g40Var != null && g40Var.getTag() != null && (messageCell = this.f42926p2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                c6Var = photoImage2.getAnimation();
                if (c6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f42973t0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f42981t8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                c6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f42973t0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f42973t0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        MessageObject messageObject2 = s1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = s1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f42973t0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f42973t0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f42981t8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f42973t0.getMeasuredHeight()) {
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
                h9(true);
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
                messageObject.audioProgress = c6Var.n();
                messageObject.audioProgressMs = c6Var.o();
                c6Var.stop();
                if (PhotoViewer.K1(messageObject)) {
                    PhotoViewer.W8.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ma() {
        this.f42997ub = null;
        this.f42971sb = 0;
        this.f42984tb = -1;
        this.f43010vb = null;
        this.f43024wb = null;
        this.f42803f1.d(false);
    }

    public final void Mb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f42746aa);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            c2Var.P = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new jh.b3(this, tL_game, messageObject, str, j10));
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

    public final void Mc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        if (this.fragmentView != null && !this.f42891m5) {
            int childCount = this.f42973t0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f42973t0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        MessageObject messageObject = s1Var.getMessageObject();
                        if (this.f42932p8 != null && ((messageObject.isRoundVideo() || messageObject.isVideo()) && !messageObject.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject))) {
                            ImageReceiver photoImage = s1Var.getPhotoImage();
                            this.f42932p8.setTranslationX(s1Var.getX() + photoImage.getImageX());
                            this.f42932p8.setTranslationY((this.f42973t0.getY() + (photoImage.getImageY() + (s1Var.getY() + s1Var.getPaddingTop()))) - this.f42932p8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42932p8.getLayoutParams();
                            if (messageObject.isRoundVideo()) {
                                this.f42932p8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(C9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(C9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(C9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f42955r8.setResizeMode(0);
                                    this.f42932p8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(C9())) / AndroidUtilities.roundPlayingMessageSize(C9());
                                float imageWidth = s1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(C9());
                                if (this.f42932p8.getScaleX() != imageWidth) {
                                    this.f42932p8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f42932p8.setPivotX(0.0f);
                                this.f42932p8.setPivotY(0.0f);
                                this.f42932p8.setScaleX(imageWidth);
                                this.f42932p8.setScaleY(imageWidth);
                                this.f42968s8.setScaleX(roundPlayingMessageSize2);
                                this.f42968s8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f42932p8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f42955r8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f42932p8.setLayoutParams(layoutParams);
                                }
                                this.f42968s8.setScaleX(1.0f);
                                this.f42968s8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f42932p8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f42932p8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f42841i3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f42932p8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(C9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f42841i3 && PipRoundVideoView.B == null) {
                            if (z11) {
                                j(playingMessageObject.getId(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f42981t8) {
                        this.f42973t0.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void N(int i10, float f9, float f10, vd.c cVar) {
        boolean z10;
        int i11;
        boolean z11;
        int i12;
        if (i10 == 0) {
            S9();
            return;
        }
        int i13 = 4;
        int i14 = 0;
        if (i10 == 1) {
            View view = this.P;
            if (view != null) {
                view.setAlpha(f9);
                View view2 = this.P;
                if (f9 > 0.0f) {
                    i13 = 0;
                }
                view2.setVisibility(i13);
            }
        } else if (i10 == 2) {
            S9();
            s7();
            bh.f fVar = this.f43049yc;
            if (fVar != null) {
                fVar.setAnimatedVisibility(this.f42972sc.f49505e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                vd.a aVar = this.f42985tc;
                float f11 = 1.0f - aVar.f49505e;
                this.I0.setAlpha(f11);
                org.telegram.ui.Components.vg vgVar = this.I0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                vgVar.setVisibility(i12);
                float f12 = 1.0f - aVar.f49505e;
                org.telegram.ui.Components.m21 m21Var = this.N1;
                if (m21Var != null) {
                    m21Var.setAlpha(f12);
                    org.telegram.ui.Components.m21 m21Var2 = this.N1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    m21Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                sg.e eVar = this.G3;
                vd.a aVar2 = this.f42998uc;
                if (eVar != null) {
                    float f13 = aVar2.f49505e;
                    eVar.setAlpha(f13);
                    sg.e eVar2 = this.G3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    eVar2.setVisibility(i15);
                }
                if (aVar2.f49505e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ug.f fVar2 = this.T;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar2.setVisibility(i11);
                l7();
                if (aVar2.f49505e < 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                lj ljVar = this.f42973t0;
                if (z11) {
                    i13 = 0;
                }
                ljVar.setVisibility(i13);
                s7();
                v7();
                u7();
                q9(1);
            } else if (i10 == 5) {
                k7();
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.setSearchFactor(f9);
                }
            } else if (i10 == 6) {
                p7();
            }
        }
    }

    public final void N6() {
        MessageObject editingMessageObject;
        int abs;
        dk dkVar = this.U;
        if (dkVar != null && (editingMessageObject = dkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f42801f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.ko[]) this.W.f2608b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.f42787e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        h5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new ig(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.re reVar = this.U.A1;
                if (reVar != null) {
                    reVar.setVisibility(8);
                }
                h5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView N7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f42994u8);
        if (this.f42932p8 == null) {
            hk hkVar = new hk(this, getParentActivity(), 2);
            this.f42932p8 = hkVar;
            hkVar.setOutlineProvider(new fl(this));
            this.f42932p8.setClipToOutline(true);
            this.f42932p8.setWillNotDraw(false);
            e5.c cVar = new e5.c(getParentActivity());
            this.f42955r8 = cVar;
            cVar.setBackgroundColor(0);
            if (z10) {
                this.f42932p8.addView(this.f42955r8, i7.f6.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f42968s8 = textureView;
            textureView.setOpaque(false);
            this.f42955r8.addView(this.f42968s8, i7.f6.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f42932p8.getParent();
        if (viewGroup != null && viewGroup != this.T0) {
            viewGroup.removeView(this.f42932p8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.T0.addView(this.f42932p8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(C9()), AndroidUtilities.roundPlayingMessageSize(C9())));
        }
        this.f42932p8.setTag(null);
        this.f42955r8.setDrawingReady(false);
        return this.f42968s8;
    }

    public final long N8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.f42787e) || !ChatObject.canManageMonoForum(this.currentAccount, this.f42787e)) {
            return 0L;
        }
        long j10 = this.Z3;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.f42880l5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f42856j5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j10;
    }

    public final void N9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.o2 o2Var;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null) {
            return;
        }
        long j10 = messageObject.messageOwner.action.channel_id;
        if (b5Var.getFragmentStack().size() > 0) {
            o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            o2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (indexOf > 0 && !(o2Var instanceof tn) && !(o2Var instanceof ProfileActivity) && this.f42787e.creator) {
            int size = b5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) b5Var2.getFragmentStack().get(indexOf);
                if (o2Var2 instanceof tn) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new tn(j7.l1.g(j10, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new ProfileActivity(j7.l1.g(j10, "chat_id"), null));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ko) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new ko(j7.l1.g(j10, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof jr) {
                    if (((jr) o2Var2).f39620a1 == 0) {
                        Bundle arguments = o2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) b5Var2).c(indexOf, new jr(arguments));
                    }
                    o2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(this, o2Var, messageObject, b5Var2, 28));
        }
        AndroidUtilities.runOnUIThread(new eg.z0(this, j10, 3), 1000L);
    }

    public final void Na(org.telegram.ui.Cells.s1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Na(org.telegram.ui.Cells.s1):void");
    }

    public final void Nb(boolean z10) {
        if (z10) {
            if (this.f43048yb == null) {
                ee eeVar = new ee(this, 10);
                this.f43048yb = eeVar;
                AndroidUtilities.runOnUIThread(eeVar, 100L);
                return;
            }
            return;
        }
        ee eeVar2 = this.f43048yb;
        if (eeVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(eeVar2);
        }
        this.f43048yb = null;
        this.xb = false;
        xc(true);
    }

    public final void Nc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        gj gjVar = this.W0;
        if (gjVar == null) {
            return;
        }
        int i10 = this.N3;
        if (i10 == 8 && (chat2 = this.f42787e) != null) {
            if (this.P3) {
                String i11 = yf.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.f42787e;
                gjVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.Z3 > 0L ? 1 : (this.Z3 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.f42787e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.f42787e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.f42787e;
                        }
                        this.W0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        gj gjVar2 = this.W0;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.f42787e;
                        gjVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.Z3));
                    this.W0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.Z3));
                    if (chat7 == null) {
                        chat7 = this.f42787e;
                    }
                    this.W0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                gj gjVar3 = this.W0;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.f42787e.title));
                TLRPC.Chat chat8 = this.f42787e;
                gjVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            gjVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.M3)) {
                this.W0.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.M3)) {
                this.W0.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.W0.setTitle(this.M3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.L3.title)) {
                this.W0.setTitle(this.L3.title);
            } else {
                this.W0.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j10 = this.Z3;
                if (j10 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.W0.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.W0.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.W0.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.W0.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.W0.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.W0.setTitle("");
                }
            } else if (F9() && !UserObject.isBotForum(this.f42801f)) {
                if (this.f42779d4) {
                    Sc();
                } else if (this.f42767c4) {
                    if (this.T3.hasReplies()) {
                        this.W0.setTitle(LocaleController.formatPluralString("Comments", this.T3.getRepliesCount(), new Object[0]));
                    } else {
                        this.W0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.W0.setTitle(LocaleController.formatPluralString("Replies", this.T3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f42801f)) {
                this.W0.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f42801f)) {
                this.W0.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.N3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f42801f)) {
                        this.W0.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.W0.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.W0.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", G8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.f42787e;
                    if (chat9 != null) {
                        gj gjVar4 = this.W0;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.f42787e;
                        gjVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f42801f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.W0.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f42801f.f22539id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f42801f.phone)) {
                                    gj gjVar5 = this.W0;
                                    String k9 = org.telegram.messenger.x3.k(new StringBuilder("+"), this.f42801f.phone, qe.b.c());
                                    TLRPC.User user4 = this.f42801f;
                                    gjVar5.h(k9, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f42801f), this.f42801f.emoji_status, z10);
                                } else {
                                    gj gjVar6 = this.W0;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f42801f)));
                                    TLRPC.User user5 = this.f42801f;
                                    gjVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f42801f), this.f42801f.emoji_status, z10);
                                }
                            } else {
                                gj gjVar7 = this.W0;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f42801f)));
                                TLRPC.User user6 = this.f42801f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f42801f);
                                if (!MessagesController.isSupportUser(this.f42801f)) {
                                    emojiStatus = this.f42801f.emoji_status;
                                }
                                gjVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.W0.getTitleTextView().getText());
        Pc(false);
    }

    public final void O6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.S7;
        if (call != null && (((str = this.f42770c8) != null || this.f42783d8) && this.J5)) {
            org.telegram.ui.Components.voip.h2.m(this.f42787e, str, this.U7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f42770c8 = null;
            this.f42783d8 = false;
            return;
        }
        if (this.f42770c8 != null && z10 && (chatFull = this.V7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            j7.l1.v(R.string.LinkHashExpired, org.telegram.ui.Components.tc.a0(this), R.raw.linkbroken, 36);
            this.f42770c8 = null;
        }
        this.T7 = !this.J5;
    }

    public final void O7() {
        if (this.T0 != null && this.G1 == null && getParentActivity() != null) {
            this.G1 = new org.telegram.ui.ActionBar.r0(this, getParentActivity(), 1);
            o9();
            this.G1.setClickable(true);
            this.I0.addView(this.G1, i7.f6.n(-1, 44));
            this.I0.h(2, this.G1);
            this.I0.g(this.G1);
            TextView textView = new TextView(getParentActivity());
            this.J1 = textView;
            int i10 = org.telegram.ui.ActionBar.g6.f23295q7;
            textView.setTextColor(getThemedColor(i10));
            TextView textView2 = this.J1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            textView2.setBackground(org.telegram.ui.ActionBar.g6.W(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2));
            this.J1.setTag(Integer.valueOf(i10));
            this.J1.setTextSize(1, 14.0f);
            this.J1.setTypeface(AndroidUtilities.bold());
            this.J1.setSingleLine(true);
            this.J1.setMaxLines(1);
            this.J1.setGravity(17);
            this.G1.addView(this.J1, i7.f6.e(-1, -1, 51));
            this.J1.setOnClickListener(new ne(this, 13));
            org.telegram.ui.Components.y80 y80Var = new org.telegram.ui.Components.y80(getParentActivity(), this.f42746aa);
            this.P1 = y80Var;
            y80Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23124ge));
            this.P1.setTextSize(1, 13.3f);
            this.P1.setDisablePaddingsOffset(true);
            this.P1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.il));
            this.P1.setGravity(17);
            this.P1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.I0.addView(this.P1, i7.f6.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.I0.h(8, this.P1);
            this.I0.g(this.P1);
            TextView textView3 = new TextView(getParentActivity());
            this.H1 = textView3;
            int i11 = org.telegram.ui.ActionBar.g6.f23141he;
            textView3.setTextColor(getThemedColor(i11));
            this.H1.setVisibility(8);
            this.H1.setTextSize(1, 14.0f);
            this.H1.setTypeface(AndroidUtilities.bold());
            this.H1.setSingleLine(true);
            this.H1.setMaxLines(1);
            this.H1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.H1.setGravity(17);
            TextView textView4 = this.H1;
            float dp3 = AndroidUtilities.dp(18.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            textView4.setBackground(org.telegram.ui.ActionBar.g6.W(dp3, getThemedColor(i11) & 436207615, dp4, dp4, dp4, dp4));
            this.G1.addView(this.H1, i7.f6.e(-1, -1, 51));
            this.H1.setOnClickListener(new ne(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.K1 = textView5;
            textView5.setTextColor(getThemedColor(i11));
            this.K1.setVisibility(8);
            this.K1.setTextSize(1, 14.0f);
            this.K1.setTypeface(AndroidUtilities.bold());
            this.K1.setSingleLine(true);
            this.K1.setMaxLines(1);
            this.K1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.K1.setGravity(17);
            this.K1.setText(LocaleController.getString(R.string.RestartTopic));
            this.K1.setBackground(org.telegram.ui.ActionBar.g6.f0(getThemedColor(i11) & 436207615, 3, -1));
            this.I0.addView(this.K1, i7.f6.n(-1, 48));
            this.I0.h(4, this.K1);
            this.I0.g(this.K1);
            this.K1.setOnClickListener(new ne(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.Q1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.Q1.setContentDescription(LocaleController.getString(R.string.Close));
            this.Q1.setBackground(org.telegram.ui.ActionBar.g6.M(getThemedColor(org.telegram.ui.ActionBar.g6.f23152i6), 0, 0));
            this.Q1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.f23069de), PorterDuff.Mode.MULTIPLY));
            this.Q1.setScaleType(ImageView.ScaleType.CENTER);
            this.G1.addView(this.Q1, i7.f6.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.Q1.setOnClickListener(new ne(this, 16));
        }
    }

    public final int O8() {
        return this.T0.getBackgroundSizeY();
    }

    public final void O9(boolean z10) {
        int i10;
        if (this.f42973t0 != null) {
            ArrayList arrayList = this.q6;
            if (!arrayList.isEmpty() && !this.f42970sa.f40300n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f42999v0.h1(i10, 0);
                this.f42973t0.B0();
            }
        }
    }

    public final void Oa() {
        org.telegram.ui.Components.yb0 i10;
        rn rnVar = this.f42746aa;
        if (rnVar != null) {
            Drawable d = rnVar.d();
            if (this.fragmentView != null) {
                d = this.T0.getBackgroundImage();
            }
            if (d instanceof wn) {
                d = ((wn) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.yb0) {
                ((org.telegram.ui.Components.yb0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.d5) && (i10 = ((org.telegram.ui.ActionBar.d5) themedDrawable).i()) != null) {
                i10.x(false);
            }
        }
    }

    public final void Ob(boolean z10) {
        float f9;
        int i10;
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupNotifyPeriod * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                if (z10) {
                    f9 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupUpload;
                } else {
                    f9 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupDownload;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f9 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(this);
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
                    org.telegram.ui.Components.mc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new ye(this, z10, 0)), spannableString), i12);
                    M.f30652j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void Oc() {
        Pc(false);
    }

    public final void P6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.f42987u1 == null && ChatObject.isMegagroup(this.f42787e) && (chatFull = getMessagesController().getChatFull(this.f42787e.f22392id)) != null && this.U != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            ik ikVar = this.K0;
            if (ikVar == null || ikVar.getVisibility() != 0) {
                org.telegram.ui.Components.h40 h40Var = org.telegram.ui.Components.h40.f29055n;
                if (h40Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f22398id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        h40Var.b();
                        nh.t3 t3Var = new nh.t3(getParentActivity(), 3);
                        this.f42987u1 = t3Var;
                        t3Var.i();
                        this.f42987u1.q(true);
                        nh.t3 t3Var2 = this.f42987u1;
                        t3Var2.G = Layout.Alignment.ALIGN_CENTER;
                        t3Var2.r(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(j10, this.f42987u1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t41(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f42987u1.t(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        nh.t3 t3Var3 = this.f42987u1;
                        t3Var3.h = nh.t3.a(t3Var3.getText(), this.f42987u1.getTextPaint());
                        nh.t3 t3Var4 = this.f42987u1;
                        t3Var4.d = -1L;
                        t3Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new ig(this, 27), 300L);
                    }
                }
            }
        }
    }

    public final void P7() {
        int i10;
        if (this.N1 == null && getParentActivity() != null) {
            if (this.f42975t2 == null) {
                K7();
            }
            org.telegram.ui.Components.m21 m21Var = new org.telegram.ui.Components.m21(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.N1 = m21Var;
            m21Var.K = new ee(this, 5);
            og.d n10 = pg.a.n(this.f42746aa);
            lg.a aVar = this.F;
            m21Var.setSideMenuBackgroundDrawable(aVar.c(m21Var, n10, false));
            org.telegram.ui.Components.m21 m21Var2 = this.N1;
            m21Var2.setTopMenuBackgroundDrawable(aVar.c(m21Var2, pg.a.n(this.f42746aa), false));
            this.N1.setCurrentTopic(b());
            this.N1.setOnNewTopicSelected(new ee(this, 6));
            this.N1.setOnTopicSelected(new pe(this, 0));
            this.N1.setOnDialogSelected(new pe(this, 1));
            int indexOfChild = this.T0.indexOfChild(this.T);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.T0.addView(this.N1, i10, i7.f6.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.N1.n();
            wj wjVar = this.E1;
            if (wjVar != null) {
                wjVar.bringToFront();
            }
        }
    }

    public final float P8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.T0.getBackgroundTranslationY()) - ((1.0f - this.f42982t9) * this.f42921o9);
    }

    public final boolean P9() {
        dk dkVar = this.U;
        boolean z10 = dkVar.f26200u2;
        if (z10) {
            dkVar.s1();
            this.f43053z3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Pa() {
        MessageObject messageObject;
        CharSequence charSequence;
        boolean z10;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        ik ikVar;
        dk dkVar = this.U;
        if (dkVar != null && dkVar.f26221y1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.U4 && dkVar != null && (ikVar = this.K0) != null && ikVar.getVisibility() != 0) {
            messageObject = this.f42856j5;
            charSequence = AndroidUtilities.getTrimmedString(this.U.getDraftMessage());
            z10 = this.U.T2;
        } else {
            messageObject = null;
            charSequence = null;
            z10 = true;
        }
        if (this.f42843i5) {
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
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.P5, B7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j11 = this.P5;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f42843i5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        jn jnVar = this.f42831h5;
        MessageSuggestionParams messageSuggestionParams = this.f42768c5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        dk dkVar2 = this.U;
        if (dkVar2 != null) {
            j10 = dkVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.saveDraft(j11, B7, charSequence2, entities, message, jnVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void Pb(boolean z10) {
        if (this.L != null) {
            if (!AndroidUtilities.isTablet() && !this.f42767c4 && this.f42801f == null) {
                if (this.f42799eb == null) {
                    this.f42799eb = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f42799eb.booleanValue()) {
                    this.f42785db = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.K5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f42785db) {
                    return;
                }
                this.f42785db = z10;
                if (z10) {
                    if (this.L.getVisibility() != 0) {
                        this.L.setVisibility(0);
                        this.L.setAlpha(0.0f);
                        this.L.setScaleX(0.3f);
                        this.L.setScaleY(0.3f);
                    }
                    this.L.animate().setListener(null).cancel();
                    this.L.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.L.animate().setListener(null).cancel();
                this.L.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new oi(this, 3)).start();
                return;
            }
            this.f42785db = z10;
            FrameLayout frameLayout = this.L;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Pc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (this.W0 != null) {
            int i10 = this.N3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.P5, b());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f42787e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f42801f)) {
                    if (!UserObject.isReplyUser(this.f42801f) && ((!F9() || this.f42779d4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.g6.H6), PorterDuff.Mode.SRC_IN));
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f42787e;
                    if (chat != null) {
                        drawable = this.W0.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f42801f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.W0.c(DialogObject.getBotVerificationIcon(this.f42801f));
                        }
                    }
                }
                this.W0.j(drawable, mutate);
                if (!z10 && (u0Var = this.f42738a1) != null) {
                    if (isDialogMuted) {
                        if (u0Var.f23829l != 8) {
                            u0Var.f23829l = 8;
                            View view = u0Var.f23826i;
                            if (view instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view).getRightIcon().setVisibility(u0Var.f23829l);
                            }
                        }
                        this.f42738a1.d(LocaleController.getString(R.string.Unmute));
                        this.f42738a1.b(R.drawable.msg_mute);
                    } else {
                        if (u0Var.f23829l != 0) {
                            u0Var.f23829l = 0;
                            View view2 = u0Var.f23826i;
                            if (view2 instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view2).getRightIcon().setVisibility(u0Var.f23829l);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.P5, b())) {
                            this.f42738a1.d(LocaleController.getString(R.string.Mute));
                            this.f42738a1.b(R.drawable.msg_unmute);
                        } else {
                            this.f42738a1.d(LocaleController.getString(R.string.Mute));
                            this.f42738a1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.jo joVar = this.f42789e1;
                if (joVar != null) {
                    joVar.d(this.P5, b(), null);
                }
            }
        }
    }

    public final void Q6() {
        ArrayList arrayList;
        int i10;
        if (this.La) {
            int i11 = -1;
            long j10 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.q6;
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
                        Collections.sort(arrayList2, new lh.e4(17));
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

    public final void Q7() {
        if (this.f42989u3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f42746aa);
            this.f42989u3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.T0.addView(this.f42989u3, i7.f6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final float Q8() {
        org.telegram.ui.Components.m21 m21Var = this.N1;
        if (m21Var != null) {
            return m21Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Qa() {
        org.telegram.ui.Cells.s1 s1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f42973t0.getChildCount(); i11++) {
            View childAt = this.f42973t0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                int min = Math.min(s1Var2.getBottom(), this.f42973t0.getHeight()) - Math.max(0, s1Var2.getTop());
                if (min > i10) {
                    s1Var = s1Var2;
                    i10 = min;
                }
            }
        }
        if (s1Var != null) {
            oj ojVar = this.f42999v0;
            this.f42973t0.getClass();
            ojVar.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) this.f42921o9), false);
        }
    }

    public final void Qb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new me(this, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22714a);
    }

    public final void Qc(boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Qc(boolean):void");
    }

    public final void R6(boolean z10) {
        rf.z0 z0Var;
        if (this.K3 == 2 && (z0Var = this.I3) != null) {
            String str = this.f42940q3;
            org.telegram.ui.web.t1 t1Var = z0Var.A;
            if (!TextUtils.equals(z0Var.f47418x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(t1Var);
                lh.e6 e6Var = z0Var.f47419y;
                if (e6Var != null && e6Var.I != 0) {
                    ConnectionsManager.getInstance(e6Var.f15834c).cancelRequest(e6Var.I, true);
                    e6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    z0Var.f47418x = str;
                    z0Var.f47419y = new lh.e6(z0Var.f47415r, str2, trim);
                    if (z10) {
                        t1Var.run();
                    } else {
                        AndroidUtilities.runOnUIThread(t1Var, 1000L);
                    }
                }
                lh.e6 e6Var2 = z0Var.f47419y;
                if (e6Var2 != null && e6Var2.J > 0) {
                    z0Var.l();
                }
            }
        }
    }

    public final ArrayList R7(MessageObject messageObject, boolean z10) {
        ArrayList n10 = org.telegram.messenger.x3.n(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.q6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.H6 || messageObject.getDialogId() == this.H6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    n10.add(messageObject2);
                }
            }
        }
        return n10;
    }

    public final int R8() {
        return (int) (Q8() * AndroidUtilities.dp(71.0f));
    }

    public final void Ra(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Ra(org.telegram.messenger.MessageObject):void");
    }

    public final void Rb() {
        String str;
        if (this.Cb != null) {
            return;
        }
        if (this.f42856j5 != null) {
            str = getMessagesController().getFullName(this.f42856j5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new me(this, 15));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new me(this, 16));
        c2Var.setOnDismissListener(new xf(this, 7));
        this.Cb = alertDialog$Builder.o();
    }

    public final void Rc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.u0 u0Var = this.f42924p0;
        if (u0Var != null) {
            TLRPC.Chat chat = this.f42787e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.Y3) && (tL_forumTopic = this.Y3) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u0Var.e(i10);
        }
    }

    public final void S6() {
        this.O.d();
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
        r7();
        p9();
        boolean z10 = true;
        if (this.v.f756s == 1) {
            z10 = false;
        }
        if (this.Sa != z10) {
            this.Sa = z10;
            checkSystemBarColors();
        }
    }

    public final void S7(final int i10, final int i11, final boolean z10) {
        this.f43013w0.I.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.q6;
            if (i12 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            int i13 = messageObject.messageOwner.date;
            if (i13 <= i10 || i13 >= i11) {
                this.f43013w0.I.add(messageObject);
            }
            i12++;
        }
        lj ljVar = this.f42973t0;
        if (ljVar != null) {
            ljVar.setEmptyView(null);
        }
        if (this.f43013w0.I.isEmpty()) {
            Pb(true);
        }
        em emVar = this.f43013w0;
        emVar.H = true;
        emVar.O(true);
        Q7();
        UndoView undoView = this.f42989u3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.P5, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                tn tnVar = tn.this;
                MessagesController messagesController = tnVar.getMessagesController();
                long j11 = tnVar.P5;
                if (ChatObject.isChannel(tnVar.f42787e)) {
                    j10 = tnVar.P5;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i10, i11, z10, new ig(tnVar, 18));
            }
        }, new df(this, 29));
    }

    public final int S8(int i10) {
        SparseIntArray sparseIntArray = this.R4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Fc;
            Fc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void S9() {
        J6(this.L0, 5, true);
        J6(this.U, 1, false);
        J6(this.N2, 4, true);
        J6(this.K0, 3, false);
        J6(this.N, 2, false);
        float f9 = this.f42972sc.f49505e;
        f5.u uVar = this.f43036xc;
        float b10 = th.b(1.0f, f9, 1.0f - ((float[]) uVar.f6632b)[5], 1.0f);
        ug.c cVar = this.L0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(b10);
        }
        dk dkVar = this.U;
        if (dkVar != null) {
            dkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        hk hkVar = this.N2;
        if (hkVar != null) {
            hkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        ik ikVar = this.K0;
        if (ikVar != null) {
            ikVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        hk hkVar2 = this.N;
        if (hkVar2 != null) {
            hkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        sg.f fVar = this.O;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - b10) * 255.0f));
            this.O.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        ik ikVar2 = this.K0;
        vd.a aVar = this.f42946qc;
        if (ikVar2 != null) {
            ikVar2.setTotalVisibilityFactor((1.0f - aVar.f49505e) * ((float[]) uVar.f6632b)[3]);
        }
        np npVar = this.L9;
        if (npVar != null) {
            float f10 = aVar.f49505e;
            if (npVar.O != f10) {
                npVar.O = f10;
                this.fragmentView.invalidate();
            }
        }
        q7();
    }

    public final void Sa(long j10) {
        oj ojVar;
        MessageObject messageObject;
        int L8;
        int abs;
        lj ljVar = this.f42973t0;
        int i10 = -1;
        if (ljVar != null && (ojVar = this.f42999v0) != null && ojVar.f6371y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = ljVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f42973t0.getChildAt(childCount);
                this.f42973t0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((L8 = L8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = L8;
                    i12 = abs;
                }
            }
            this.f42858j7 = i10;
            this.f42871k7 = i11;
            return;
        }
        this.f42858j7 = -1;
    }

    public final void Sb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.g40 g40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((g40Var = this.f42840i2) != null && g40Var.getVisibility() == 0)) {
                this.f42840i2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f42840i2.f(view, true);
                }
            }
        }
    }

    public final void Sc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        gj gjVar = this.W0;
        if (gjVar != null && (tL_forumTopic = this.Y3) != null) {
            gjVar.setTitle(tL_forumTopic.title);
        }
        Tc();
    }

    public final void T6() {
        TLRPC.Chat chat;
        long j10 = getArguments().getInt("search_from_user_id", 0);
        if (j10 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                la("");
                ImageView imageView = this.P2;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                Za(null, user);
                return;
            }
            return;
        }
        long j11 = getArguments().getInt("search_from_chat_id", 0);
        if (j11 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j11))) != null) {
            la("");
            ImageView imageView2 = this.P2;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Za(chat, null);
        }
    }

    public final void T7(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.s1 s1Var2;
        CharacterStyle characterStyle2;
        MessageObject messageObject2;
        int i10;
        String str2;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.j70 I = org.telegram.ui.Components.j70.I(this, s1Var);
        org.telegram.ui.Components.yl0 yl0Var = new org.telegram.ui.Components.yl0(getParentActivity(), this.f42746aa);
        I.f29595p = new ie(yl0Var, 0);
        if (!str.startsWith("video?") && !ye.d.f(Uri.parse(str), false, null)) {
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
            hh.k kVar = new hh.k(this, str, characterStyle, messageObject, s1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            s1Var2 = s1Var;
            I.c(i13, string, kVar, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            s1Var2 = s1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new je(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new je(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new ke(this, messageObject2, 0), false);
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
        I.c(i14, LocaleController.getString(i10), new ag.w0(this, str, messageObject2, startsWith, 8), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new je(this, str, 2), false);
        }
        yl0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            yl0Var.f(s1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.c51) {
            String url = ((org.telegram.ui.Components.c51) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = ye.d.v(parse, null, null, ye.d.a(parse.getHost()), null);
                } catch (Exception e10) {
                    FileLog.e((Throwable) e10, false);
                }
                str2 = URLDecoder.decode(url.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e11) {
                FileLog.e(e11);
                str2 = url;
            }
            if (str2.length() > 204) {
                str2 = str2.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            yl0Var.f(s1Var2, characterStyle2, spannableString2, false);
        } else {
            yl0Var.f(s1Var2, characterStyle2, null, false);
        }
        showDialog(yl0Var);
    }

    public final int T8(int i10) {
        SparseIntArray sparseIntArray = this.Q4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Fc;
            Fc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void T9(boolean z10, boolean z11) {
        if (this.f43053z3) {
            AndroidUtilities.runOnUIThread(new ee(this, 20), 200L);
            if (z11) {
                this.f43053z3 = false;
            }
        }
        if (z10 && !this.Ka) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final void Ta() {
        int i10;
        int i11;
        lj ljVar = this.f42973t0;
        if (ljVar != null && this.f42999v0 != null) {
            for (int childCount = ljVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f42973t0.getChildAt(childCount);
                this.f42973t0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i10 = L8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f42999v0.h1(i11, i10);
        }
    }

    public final void Tb(MessageSuggestionParams messageSuggestionParams) {
        if (this.f42880l5 == null) {
            return;
        }
        new jh.s0(getParentActivity(), this.currentAccount, this.P5, messageSuggestionParams, this, getResourceProvider(), 0, new qe(this, 0)).show();
    }

    public final void Tc() {
        gj gjVar;
        gj gjVar2;
        if (UserObject.isBotForum(this.f42801f) && (gjVar2 = this.W0) != null) {
            gjVar2.getAvatarImageView().setVisibility(0);
            this.W0.b();
        } else if (this.Y3 != null && (gjVar = this.W0) != null) {
            gjVar.getAvatarImageView().setVisibility(0);
            yf.d.p(this.W0.getAvatarImageView(), this.Y3, true, true, this.f42746aa);
        }
    }

    public final void U6() {
        MessageObject messageObject;
        if (!this.f43054z4 && (messageObject = this.F7) != null) {
            if (this.q6.indexOf(messageObject) >= 0) {
                this.A4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.f43042y4 != null) {
        } else {
            df dfVar = new df(this, 22);
            this.f43042y4 = dfVar;
            AndroidUtilities.runOnUIThread(dfVar);
        }
    }

    public final void U7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.s1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.U7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.s1):void");
    }

    public final long U8() {
        return this.Z3;
    }

    public final void U9() {
        this.f43054z4 = true;
        lm lmVar = this.Y8;
        AndroidUtilities.cancelRunOnUIThread(lmVar.f25944g0);
        lmVar.f25973z = false;
        ee eeVar = new ee(this, 8);
        int i10 = this.f43057z7;
        if (i10 != 0) {
            Xa(i10, 0, false, this.f43045y7, true, 0, null, null, eeVar);
            return;
        }
        int i11 = this.f43033x7;
        if (i11 > 0) {
            Xa(i11, 0, true, this.f43045y7, true, 0, null, null, eeVar);
            return;
        }
        Wa(!this.Ya, eeVar);
        this.Ya = false;
        if (!this.D4.isEmpty()) {
            this.K4 = true;
            this.J4 = ((Integer) this.D4.get(0)).intValue();
        }
    }

    public final int Ua(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f9;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        MessageObject messageObject2;
        if (!TextUtils.isEmpty(this.L7) && messageObject != null) {
            if (messageObject.getGroupId() != 0) {
                MessageObject.GroupedMessages y8 = y8(messageObject.getGroupId());
                org.telegram.ui.Cells.s1 s1Var2 = this.f42835h9;
                if (s1Var2 != null && (textLayoutBlocks2 = s1Var2.f25548te) != null && y8 != null && (messageObject2 = y8.captionMessage) != null) {
                    i10 = s1Var2.f25533se;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (s1Var2 != null) {
                        s1Var2.f25533se = 0;
                        s1Var2.f25548te = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (s1Var = this.f42835h9) != null && (textLayoutBlocks = s1Var.Y3) != null) {
                i10 = (int) s1Var.f25439m4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.s1 s1Var3 = this.f42835h9;
                if (s1Var3 != null && s1Var3.f25480p1) {
                    i10 = s1Var3.f25381i2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.s1 s1Var4 = this.f42835h9;
            if (s1Var4 != null) {
                s1Var4.f25533se = 0;
                s1Var4.f25548te = null;
            }
            if (arrayList == null || charSequence == null || (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.L7, this.O7)) < 0) {
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
                    if (x9()) {
                        f9 = 0.7f;
                    } else {
                        f9 = 0.5f;
                    }
                    if (lineTop <= f10 * f9) {
                        return 0;
                    }
                    float f12 = AndroidUtilities.displaySize.y;
                    if (x9()) {
                        f11 = 0.7f;
                    }
                    return (int) (lineTop - (f12 * f11));
                }
            }
            return 0;
        }
        org.telegram.ui.Cells.s1 s1Var5 = this.f42835h9;
        if (s1Var5 != null) {
            s1Var5.f25533se = 0;
            s1Var5.f25548te = null;
        }
        return 0;
    }

    public final void Ub(MessageObject messageObject) {
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f42797e9 && this.f9 <= this.U.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f42797e9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f42784d9 == null) {
                        il ilVar = new il(getParentActivity(), this.f42746aa, this);
                        this.f42784d9 = ilVar;
                        this.T0.addView(ilVar, i7.f6.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f42784d9.c();
                }
            }
        }
    }

    public final void Uc() {
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var = this.f42826h0;
        if (u0Var == null) {
            return;
        }
        if (getMessagesController().getTranslateController().isTranslateDialogHidden(a()) && getMessagesController().getTranslateController().isDialogTranslatable(a())) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        u0Var.e(i10);
    }

    public final void V6(boolean z10) {
        if (this.f42856j5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.q6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f42856j5.getId() && messageObject.getDialogId() == this.f42856j5.getDialogId()) {
                        this.f42856j5 = messageObject;
                        jn jnVar = this.f42831h5;
                        if (jnVar != null) {
                            jnVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f42755b5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f42856j5;
                                MessageObject.GroupedMessages groupedMessages = this.f42807f5;
                                if (groupedMessages == null) {
                                    groupedMessages = y8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.P5, this.f42831h5);
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

    public final void V7(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, String str) {
        qi K9 = K9(s1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(qe.b.d(str, false));
        jh.g2 g2Var = new jh.g2(this, s1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                g2Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new u1(this, tL_contact, g2Var, 14));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = qe.b.d(str, false);
        K9.f50515b = new te(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new x9(this, K9, g2Var, 3)), 0);
        K9.d();
    }

    public final float V8(float f9) {
        tn tnVar = this.Z9;
        if (tnVar == null) {
            tnVar = this;
        }
        org.telegram.ui.Components.vg vgVar = tnVar.I0;
        if (vgVar == null) {
            return 0.0f;
        }
        return vgVar.c(f9);
    }

    public final void Va() {
        Wa(false, null);
    }

    public final void Vb(boolean z10, boolean z11) {
        dk dkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f42914o2 != null) && this.N3 == 0 && (dkVar = this.U) != null && dkVar.getAudioVideoButtonContainer() != null && this.U.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f42914o2 == null) {
                    km kmVar = this.T0;
                    int indexOfChild = kmVar.indexOfChild(this.O);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(9, getParentActivity(), this.f42746aa, false);
                        this.f42914o2 = g40Var;
                        kmVar.addView(g40Var, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f42914o2.b(true);
                    return;
                }
                if (this.U.Z1) {
                    org.telegram.ui.Components.g40 g40Var2 = this.f42914o2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    g40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f42914o2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f42914o2.f(this.U.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Vc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        lj ljVar = this.f42973t0;
        if (ljVar != null) {
            if (!this.f43054z4 && this.F7 != null) {
                int childCount = ljVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f42973t0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.F7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.q6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.F7) + this.f43013w0.F;
                                i11 = L8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f42973t0.getChildCount();
            dk dkVar = this.U;
            if (dkVar != null) {
                dkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f42973t0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                    MessageObject messageObject3 = s1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        s1Var.X3(messageObject3, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        em emVar = this.f43013w0;
                        this.f42973t0.getClass();
                        emVar.Q(RecyclerView.R(s1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f42999v0.h1(i10, i11);
            }
        }
    }

    public final void W6() {
        ik ikVar;
        hk hkVar;
        hk hkVar2;
        dk dkVar = this.U;
        if (dkVar != null && dkVar.f26201u3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.f42787e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((ikVar = this.K0) == null || ikVar.getVisibility() != 0) && (((hkVar = this.N) == null || hkVar.getVisibility() != 0) && ((hkVar2 = this.N2) == null || hkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void W7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.W7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final float W8(org.telegram.ui.Components.i21 i21Var) {
        float f9;
        org.telegram.ui.Components.m21 m21Var = this.N1;
        if (m21Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j10 = m21Var.j(i21Var);
            if (i21Var == org.telegram.ui.Components.i21.f29304b) {
                f9 = 64.0f;
            } else {
                f9 = 36.0f;
            }
            return (AndroidUtilities.dp(f9) + dp) * j10;
        }
        return 0.0f;
    }

    public final void W9(long j10, String str, boolean z10) {
        X9();
        lh.s2 s2Var = this.F1;
        if (s2Var != null) {
            s2Var.N1(j10, str, z10, false);
        }
    }

    public final void Wa(boolean z10, ee eeVar) {
        ArrayList arrayList;
        int i10;
        if (this.f42973t0.T1) {
            return;
        }
        this.J4 = 0;
        this.f42896mb = 0;
        this.K4 = false;
        this.S8.d(0);
        if (this.A6[0] && this.D7 == 0 && this.f42943q7 == 0) {
            this.f42803f1.d(false);
            if (this.f42999v0.I0() == 0) {
                this.f42771c9 = false;
                vc();
                Ia();
                Wc(false);
                return;
            }
            this.f43013w0.T();
            gn gnVar = this.Ha;
            gnVar.f38625a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.q6;
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
            lk lkVar = this.S8;
            gnVar.f38626b = i11;
            gnVar.d = 0;
            boolean z11 = !z10;
            gnVar.f38627c = z11;
            lkVar.c(i11, 0, z11, true);
            this.f42771c9 = false;
            vc();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.f42886lb;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        xc(false);
        if (eeVar != null) {
            eeVar.run();
        } else {
            Ma();
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f42746aa);
            this.f42886lb = c2Var2;
            c2Var2.setOnCancelListener(this.f42848ia);
            this.f42886lb.q(1000L);
        }
        this.U8 = this.R5;
        this.W8 = false;
        this.V8 = 0;
        this.X8 = false;
        ArrayList arrayList2 = this.f42781d6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.R5));
        AndroidUtilities.runOnUIThread(new df(this, 13), 0L);
    }

    public final boolean Wb(MessageObject messageObject) {
        if (this.N3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void Wc(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Wc(boolean):void");
    }

    public final boolean X6(boolean z10, boolean z11) {
        dk dkVar = this.U;
        if (dkVar == null || !dkVar.v0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f42746aa);
            if (this.U.Y0) {
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new gh.q(4, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f22714a);
            return true;
        }
        return true;
    }

    public final void X7(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.X7(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages X8(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f42979t6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void X9() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            dk dkVar = this.U;
            if (dkVar == null || TextUtils.isEmpty(dkVar.getSlowModeTimer())) {
                dk dkVar2 = this.U;
                if (dkVar2 != null && dkVar2.f26110d5.f49506f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                E7();
                lh.s2 s2Var = this.F1;
                if (!z10 && this.N3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                s2Var.N1 = z11;
                s2Var.f31005f0.f0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 == 21 || i10 == 22) {
                    this.U.P();
                }
                TLRPC.Chat chat = this.f42787e;
                if ((chat == null || this.f42768c5 == null) && !z10 && this.N3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f42787e.slowmode_enabled) {
                        this.F1.J1(10, true);
                    } else {
                        this.F1.J1(-1, true);
                    }
                } else {
                    this.F1.J1(1, true);
                }
                lh.s2 s2Var2 = this.F1;
                s2Var2.O0 = true;
                s2Var2.f31049t1.setVisibility(0);
                s2Var2.M0 = 0;
                s2Var2.B = false;
                s2Var2.C = false;
                s2Var2.f31001e0 = true;
                s2Var2.F = null;
                org.telegram.ui.ActionBar.w0 w0Var = s2Var2.f31009g1;
                if (w0Var != null) {
                    s2Var2.f31006f1.setTranslationY(0.0f);
                    w0Var.setVisibility(8);
                }
                this.F1.r1();
                this.F1.m1().setText(this.U.getFieldText());
                lh.s2 s2Var3 = this.F1;
                s2Var3.f31040r = this.f42746aa;
                showDialog(s2Var3);
            }
        }
    }

    public final void Xa(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Xa(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Xb(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            kg.v vVar = this.U9;
            if (vVar != null && vVar.d()) {
                this.U9.setHiddenByScroll(true);
            }
            if (this.f42802f0 != null) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar.f23612j0) {
                    lVar.h(true);
                    this.U.e1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                th.x1 x1Var = new th.x1(richMessage);
                x1Var.F = this;
                x1Var.f48867r = messageObject;
                presentFragment(x1Var);
                return;
            }
            this.E1.getAdapter().f47363b0 = false;
            this.U.setVisibility(0);
            yb(true, null, messageObject, null, null, null, false, true);
            hc(false);
            if (!z10) {
                N6();
            }
            if (z10) {
                this.f42768c5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.U.V0(false, false, true);
            yc(0, true);
            Wc(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.N3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.P5);
                tL_messages_getMessageEditData.f22484id = messageObject.getId();
                this.f42869k5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new he(this, 3));
                return;
            }
            dk dkVar = this.U;
            org.telegram.ui.Components.re reVar = dkVar.A1;
            if (reVar != null) {
                reVar.setEnabled(true);
                dkVar.A1.h(false);
            }
        }
    }

    public final void Y6() {
        if (!this.Ob) {
            this.Ob = true;
            if (!this.Pb && this.N3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f42949r1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f42949r1.v();
                    this.Pb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f42961s1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f42961s1.v();
                    this.Pb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    Z6();
                }
            }
        }
    }

    public final void Y7(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Y7(int, java.lang.Object[]):void");
    }

    public final void Y8(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.N3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f42951r3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.K3);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j10 = this.P5;
        long j11 = this.H6;
        int i14 = this.classGuid;
        boolean z11 = this.La;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j10, j11, i14, i10, this.Z3, this.f42867k3, this.f42878l3, this.f42889m3);
        Lb(false);
    }

    public final void Y9() {
        ht.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        E7();
        this.F1.f31005f0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.U.P();
        }
        this.F1.J1(1, false);
        lh.s2 s2Var = this.F1;
        s2Var.Q1 = true;
        s2Var.i1(null);
        this.F1.r1();
        lh.s2 s2Var2 = this.F1;
        s2Var2.f31040r = this.f42746aa;
        if (this.visibleDialog != null) {
            s2Var2.show();
        } else {
            showDialog(s2Var2);
        }
    }

    public final void Ya(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Ya(java.lang.CharSequence, boolean):void");
    }

    public final void Yb() {
        org.telegram.ui.Components.n00 n00Var = this.f42847i9;
        if (n00Var != null && !n00Var.f30795c) {
            n00Var.c(false);
            try {
                this.f42847i9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Z6() {
        org.telegram.ui.Cells.s1 s1Var;
        nh.t3 t3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        nh.t3 t3Var2 = this.f42974t1;
        if (t3Var2 != null && !t3Var2.R && !this.Rb && this.Ob && !this.f42998uc.f49506f && System.currentTimeMillis() - this.Qb > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f42973t0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f42973t0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        s1Var = (org.telegram.ui.Cells.s1) childAt;
                        kg.r0 r0Var = s1Var.J;
                        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !r0Var.v.isEmpty()) {
                            s1Var.getLocationInWindow(iArr);
                            float f9 = iArr[1] + r0Var.d;
                            if (f9 >= AndroidUtilities.dp(240.0f) && f9 <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    s1Var = null;
                    break;
                }
            }
            if (s1Var != null) {
                kg.r0 r0Var2 = s1Var.J;
                this.Rb = true;
                s1Var.getLocationInWindow(iArr);
                this.f42974t1.setTranslationY(((iArr[1] - t3Var.getTop()) - AndroidUtilities.dp(120.0f)) + r0Var2.d);
                this.f42974t1.n(0.0f, (((kg.o0) r0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + r0Var2.f13833c);
                this.f42974t1.v();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ee(this, 19));
            AndroidUtilities.runOnUIThread(new ee(this, 19), 2000L);
        }
    }

    public final void Z7(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Z7(int, java.lang.Object[]):void");
    }

    public final void Z8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Z8():void");
    }

    public final void Z9(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.s1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.Z9(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.s1, org.telegram.messenger.MessageObject):void");
    }

    public final void Za(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f42867k3 = user;
        this.f42878l3 = chat;
        if (this.f42802f0 != null && this.E1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f42867k3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f42854j3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a4.w.y(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.g6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f42802f0.setSearchFieldCaption(spannableString);
                    this.E1.getAdapter().U(null, 0, null, false, true);
                    this.f42802f0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f42802f0;
                    w0Var.f23935r = null;
                    ig.f fVar = w0Var.f23920e;
                    if (fVar != null) {
                        fVar.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f42927p3 = "";
                    mediaDataController.searchMessagesInChat("", this.P5, this.H6, this.classGuid, 0, this.Z3, this.f42867k3, this.f42878l3, this.f42889m3);
                }
            }
        }
    }

    public final void Zb() {
        long j10;
        ee eeVar = this.Q7;
        if (eeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eeVar);
        }
        ee eeVar2 = new ee(this, 15);
        this.Q7 = eeVar2;
        if (this.L7 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(eeVar2, j10);
    }

    public long a() {
        return this.P5;
    }

    public final void a7(boolean z10) {
        int i10;
        if (this.f42999v0 != null && !this.f42891m5 && !this.f43013w0.H && !this.f42757b7) {
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < this.f42973t0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f42973t0.getChildAt(i14));
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
            em emVar = this.f43013w0;
            if (emVar.J) {
                int i15 = emVar.A;
                if (i15 >= 0 && i12 >= 0 && i15 >= i12 && i15 <= i11) {
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
            if (this.N3 == 7) {
                if ((h - i12) - i13 <= i10 && !this.C6 && !this.f43044y6[0]) {
                    this.C6 = true;
                    this.f42781d6.add(Integer.valueOf(this.R5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f42940q3;
                    int i16 = this.classGuid;
                    int i17 = this.K3;
                    int i18 = this.R5;
                    this.R5 = i18 + 1;
                    hashtagSearchController.searchHashtag(str, i16, i17, i18);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.hf(this, h, i12, i13, i10, 1));
        }
    }

    public final void a8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.a8(int, java.lang.Object[]):void");
    }

    public final boolean a9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.S5;
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

    public final void aa(long j10, final MessageObject messageObject, int i10, final long j11, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f22392id + " msg_id = " + i13);
        }
        this.f42800ec = 0;
        this.f42813fc = false;
        this.hc = null;
        this.f42850ic = null;
        lj ljVar = this.f42973t0;
        if (ljVar != null) {
            ljVar.f1();
        }
        if (this.f42786dc != -1) {
            getConnectionsManager().cancelRequest(this.f42786dc, false);
        }
        if (this.f42774cc != -1) {
            getConnectionsManager().cancelRequest(this.f42774cc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f42800ec = i13;
        this.f42813fc = false;
        this.gc = System.currentTimeMillis();
        lj ljVar2 = this.f42973t0;
        if (ljVar2 != null) {
            ljVar2.f1();
        }
        final int i14 = this.f42748ac + 1;
        this.f42748ac = i14;
        this.f42774cc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final tn tnVar = tn.this;
                final int i15 = i14;
                final int i16 = i11;
                final long j12 = j11;
                final int i17 = i12;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new vf(4, tnVar, new Runnable(i15, i16, j12, tLObject, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f43583b;
                    public final int f43584c;
                    public final TLObject d;
                    public final int f43585e;
                    public final MessageObject f43586f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f43587n;
                    public final MessageObject f43588r;

                    {
                        this.d = tLObject;
                        this.f43585e = i17;
                        this.f43586f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f43587n = chat2;
                        this.f43588r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i18;
                        final tn tnVar2 = tn.this;
                        if (this.f43583b != tnVar2.f42748ac) {
                            return;
                        }
                        tnVar2.f42774cc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            tnVar2.hc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            tnVar2.getMessagesController().putUsers(tnVar2.hc.users, false);
                            tnVar2.getMessagesController().putChats(tnVar2.hc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = tnVar2.hc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i19 = 0; i19 < tnVar2.hc.messages.size(); i19++) {
                                TLRPC.Message message = tnVar2.hc.messages.get(i19);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i20 = this.f43584c;
                        final int i21 = this.f43585e;
                        final MessageObject messageObject5 = this.f43586f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f43587n;
                        final MessageObject messageObject6 = this.f43588r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = tnVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f22413id;
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
                            final int i22 = tnVar2.f42762bc + 1;
                            tnVar2.f42762bc = i22;
                            tnVar2.f42786dc = tnVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new ih(tn.this, i22, tLObject3, tL_error2, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        tnVar2.ya(tnVar2.hc, tnVar2.f42850ic, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f42774cc, this.classGuid);
    }

    public final void ab(View view, MessageObject messageObject, org.telegram.ui.Components.fk0 fk0Var, View view2, float f9, float f10, kg.q0 q0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        jh.m5 m5Var;
        int[] iArr;
        int[] iArr2;
        int i12;
        boolean z14;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && messageObject != null) {
            if (getMessagesController().isFrozen()) {
                c.b(this.currentAccount);
                return;
            }
            ArrayList<TLRPC.MessageReactor> arrayList = null;
            if (q0Var != null && q0Var.f13821a) {
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
                    long j10 = -jh.m7.b(messageObject).f12468a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
                        org.telegram.ui.Components.tc a02 = org.telegram.ui.Components.tc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    jh.r7 r7Var = jh.s7.y(this.currentAccount, false).B;
                    if (r7Var != null) {
                        r7Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j11 = this.P5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    jh.db dbVar = new jh.db(parentActivity, i15, j11, this, messageObject, arrayList2, z14, false, 0L, this.f42746aa);
                    messageObject.getId();
                    dbVar.P = this;
                    dbVar.Q = a0Var;
                    dbVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -jh.m7.b(messageObject).f12468a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j12);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j12));
                    org.telegram.ui.Components.tc a03 = org.telegram.ui.Components.tc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                jh.r7 d02 = jh.s7.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f42897mc == null) {
                        this.f42897mc = new jh.m5(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        m5Var = null;
                    } else {
                        if (this.f42897mc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f42897mc);
                            layoutContainer.addView(this.f42897mc, i7.f6.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f42897mc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f42897mc.bringToFront();
                        }
                        m5Var = this.f42897mc;
                    }
                    m5Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f12728o = m5Var;
                    m5Var.E = false;
                    m5Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    m5Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f9;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.s1) {
                        i12 = ((org.telegram.ui.Cells.s1) a0Var).R;
                    } else {
                        i12 = 0;
                    }
                    m5Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            kg.q0 q0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new cg.p1((org.telegram.ui.ActionBar.o2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(q0Var) && (chat = this.f42787e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.f42787e, 26)) {
                j7.l1.v(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.tc.a0(this), R.raw.e_hand_2, 36);
            } else {
                kg.m0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(q0Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.h hVar = this.f42979t6;
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
                    org.telegram.ui.Cells.a0 q82 = q8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && q82 != null && q0Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j13 = q0Var.f13826g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(q0Var.f13825f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.p5.f(this.currentAccount, j13);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.mc r6 = org.telegram.ui.Components.tc.a0(this).r(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r6.f30652j = 5000;
                            r6.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (fk0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        kg.m0.d(this, fk0Var, q82, view2, f9, f10, q0Var, i19, i10);
                    }
                }
                if (selectReaction && q0Var != null && (str = q0Var.f13825f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<kg.q0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    q0Var2 = q0Var;
                }
                ni niVar = new ni(this, z13, z10, i18, selectReaction, fk0Var, f9, f10, q0Var, messageObject);
                this.Yb = niVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, q0Var2, z11, z12, this, niVar);
                if (z10 || z13) {
                    qc(messageObject, true);
                    this.Yb.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.Yb, 50L);
                }
            }
        }
    }

    public final void ac() {
        AndroidUtilities.forEachViews((RecyclerView) this.f42973t0, (f5.d) new jc(1, this, t9()));
    }

    @Override
    public final boolean allowFinishFragmentInsteadOfRemoveFromStack() {
        return !this.inPreviewMode;
    }

    @Override
    public final boolean allowPresentFragment() {
        return !this.inPreviewMode;
    }

    @Override
    public final long b() {
        int i10;
        if (!this.f42779d4 && (i10 = this.N3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.Z3;
    }

    public final void b7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f42907n8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f42907n8 = true;
            org.telegram.ui.Components.c5.s0(getParentActivity(), this.currentAccount, new ee(this, 9), true, this.f42746aa);
        }
    }

    public final void b8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.b8(int, java.lang.Object[]):void");
    }

    public final boolean b9() {
        lm lmVar = this.Y8;
        if (lmVar != null && lmVar.y()) {
            return true;
        }
        return false;
    }

    public final void ba(boolean z10) {
        String string;
        if (!y9() && !a9()) {
            int i10 = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.S5;
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
            kg.v vVar = this.U9;
            if (vVar != null && vVar.d()) {
                this.U9.setHiddenByScroll(true);
            }
            Bundle e10 = org.telegram.messenger.x3.e(3, "onlySelect", "dialogsType", true);
            e10.putInt("messagesCount", this.Y5);
            e10.putInt("hasPoll", i10);
            e10.putBoolean("hasInvoice", z11);
            e10.putBoolean("canSelectTopics", true);
            fy fyVar = new fy(e10);
            fyVar.f38379y2 = this;
            presentFragment(fyVar);
            return;
        }
        if (y9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.f42787e) && !this.f42787e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f42816g2 == null) {
                km kmVar = this.T0;
                int indexOfChild = kmVar.indexOfChild(this.O);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(7, getParentActivity(), null, true);
                    this.f42816g2 = g40Var;
                    kmVar.addView(g40Var, indexOfChild + 1, i7.f6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f42816g2.setAlpha(0.0f);
                    this.f42816g2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f42816g2.setText(string);
            this.f42816g2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f42828h2 == null) {
            km kmVar2 = this.T0;
            int indexOfChild2 = kmVar2.indexOfChild(this.O);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.g40 g40Var2 = new org.telegram.ui.Components.g40(getParentActivity(), 9);
            this.f42828h2 = g40Var2;
            kmVar2.addView(g40Var2, indexOfChild2 + 1, i7.f6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f42828h2.setAlpha(0.0f);
            this.f42828h2.setVisibility(4);
        }
        this.f42828h2.setText(string);
        this.f42828h2.f(this.L0.getForwardButton(), true);
    }

    public final void bb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f22398id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.P5, this.f42856j5, this.T3, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = C8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        y6();
    }

    public final void bc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.P5, b())) {
            if (z10) {
                getNotificationsController().muteDialog(this.P5, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.f3 F = org.telegram.ui.Components.c5.F(this.P5, b(), this, this.f42746aa);
            F.setCalcMandatoryInsets(x9());
            showDialog(F);
            return;
        }
        getNotificationsController().muteDialog(this.P5, b(), false);
        if (!z10) {
            org.telegram.ui.Components.tc.z(this, 4, 0, this.f42746aa).j();
        }
    }

    @Override
    public final boolean c() {
        if (this.N3 == 1) {
            return true;
        }
        return false;
    }

    public final void c7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        dk dkVar = this.U;
        if (dkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.P5, (int) b());
            vd.a aVar = dkVar.f26104c5;
            jh.g5 g5Var = dkVar.E0;
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
            if (z10 && aVar.f49505e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((vd.a) g5Var.f12120c).a(z12, z13);
            g5Var.setClickable(z12);
            g5Var.setEnabled(z12);
            if (aVar.f49506f != z11) {
                z14 = true;
            }
            aVar.a(z11, z10);
            dkVar.O4 = streamingSendButtonState;
            if (z14) {
                dkVar.J(z10);
            }
        }
    }

    public final void c8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.c8(java.lang.Object[]):void");
    }

    public final void c9() {
        org.telegram.ui.Components.st editField;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            if (lVar.s()) {
                this.f43036xc.j(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.W5 = 0;
        this.Z5 = 0;
        this.X5 = 0;
        this.f42756b6 = 0;
        this.c6 = 0;
        this.f42742a6 = 0;
        dk dkVar = this.U;
        if (dkVar != null && (editField = dkVar.getEditField()) != null) {
            if (this.U.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        lm lmVar = this.Y8;
        if (lmVar != null) {
            lmVar.f(true);
            SparseArray sparseArray = this.Y8.f24651u0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        il ilVar = this.f42784d9;
        if (ilVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ilVar.D);
            ilVar.a();
        }
        dk dkVar2 = this.U;
        if (dkVar2 != null) {
            dkVar2.T = false;
        }
        this.f42797e9 = false;
        if (this.Xa != null) {
            k9();
        }
    }

    public final void ca(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f42755b5;
        if (messagePreviewParams != null && this.Aa == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.C5;
                CharSequence fieldText = this.U.getFieldText();
                MessageObject messageObject2 = this.f42856j5;
                if (messageObject2 == this.T3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f42831h5, this.f42880l5);
            }
            if (!this.f42755b5.isEmpty()) {
                this.f42747ab = this.U.f26200u2;
                Context context = this.T0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f42755b5;
                TLRPC.User user = this.f42801f;
                TLRPC.Chat chat = this.f42787e;
                int i12 = this.currentAccount;
                rn rnVar = this.f42746aa;
                jn jnVar = this.f42831h5;
                if (jnVar != null && jnVar.f39594f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zk zkVar = new zk(this, context, this, this.f43021w8, messagePreviewParams2, user, chat, i12, rnVar, i10, z10);
                this.Aa = zkVar;
                this.f42755b5.attach(zkVar);
                TLRPC.ChatFull chatFull = this.V7;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.da) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.da.peers.get(0).peer;
                }
                this.Aa.setSendAsPeer(peer);
                d7();
                this.T0.addView(this.Aa);
                if (this.f42747ab) {
                    dk dkVar = this.U;
                    dkVar.P0 = true;
                    org.telegram.ui.Components.xf xfVar = dkVar.Q0;
                    if (xfVar != null) {
                        xfVar.u(true);
                    }
                    this.U.s1();
                    this.f43053z3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.de deVar;
        if ((this.N3 != 5 || (!this.q6.isEmpty() && this.Z3 != 0)) && !this.f42998uc.f49506f && this.f42860j9) {
            dk dkVar = this.U;
            if (!dkVar.A2) {
                if (!dkVar.Y0 || (deVar = dkVar.f26088a1) == null || deVar.getVisibility() != 0) {
                    if ((!dkVar.j0() || !dkVar.f26131h0.v) && !org.telegram.ui.ActionBar.o2.hasSheets(dkVar.K2) && this.J9 == 0.0f) {
                        fh.k kVar = this.T9;
                        if (kVar == null || !kVar.a()) {
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

    public final void cb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j10) {
        long j11;
        String str;
        wj wjVar = this.E1;
        if (wjVar == null) {
            return;
        }
        TLRPC.User user = wjVar.getAdapter().f47385s0;
        if (user != null) {
            j11 = user.f22539id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f22390id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.E1.getAdapter().f47385s0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.P5, this.f42856j5, this.T3, null, this.f42831h5, z10, i10, 0, C8(), j10, N8());
        this.U.setFieldText("");
        e9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void cc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.mc mcVar = this.f43016w3;
        if (mcVar != null) {
            mcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.Z4);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.M4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.P5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.M4 - 1), Boolean.valueOf(this.O4));
        this.f43016w3 = org.telegram.ui.Components.tc.B(this, false, new ag.z1(this, arrayList2, arrayList, i10, 11), new ke(this, messageObject, 7), this.f42746aa).j();
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.P5, this.f42856j5, this.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = C8();
        of2.payStars = j10;
        of2.monoForumPeer = N8();
        of2.suggestionParams = this.f42768c5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.N3 == 0) {
            O9(false);
        }
        if (i10 == 0 || i10 == 1) {
            y6();
        }
        if (this.f42891m5) {
            this.M5 = true;
        }
    }

    public final void d7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.d7():void");
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.P5, this.f42856j5, this.T3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = C8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13 = i11 + 1) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.P5, this.f42856j5, this.T3, null, this.f42831h5, z10, i10, 0, C8(), 0L, N8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    i11 = i13;
                }
            }
            if (!arrayList2.isEmpty()) {
                l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.P5, this.f42856j5, this.T3, null, this.f42831h5, false, true, this.f42880l5, z10, i10, 0, this.N3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f42768c5);
                y6();
                if (i10 != 0) {
                    if (this.O3 == -1) {
                        this.O3 = 0;
                    }
                    this.O3 = arrayList.size() + this.O3;
                    Ec(true);
                }
            }
        }
    }

    public final void d9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.tc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Fa(this.Z4);
            Ha(this.Z4);
            return;
        }
        showDialog(new cg.p1((org.telegram.ui.ActionBar.o2) this, 3, true));
    }

    public final void da(String str, boolean z10) {
        boolean z11;
        bk bkVar;
        boolean z12;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                M7();
                nh.t3 t3Var = this.f42949r1;
                if (t3Var != null && t3Var.R) {
                    t3Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                nh.t3 t3Var2 = this.f42961s1;
                if (t3Var2 != null && t3Var2.R) {
                    t3Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new je(this, str, 5), 200L);
                    return;
                }
                this.f42940q3 = str;
                this.f42927p3 = str;
                boolean contains = str.contains("@");
                R6(true);
                if (!this.actionBar.f23612j0) {
                    this.f43011vc.a(true, true);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f42775d0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.z zVar = this.f42737a0;
                    if (zVar != null) {
                        zVar.f(8);
                    }
                    vr vrVar = this.Z;
                    if (vrVar != null) {
                        vrVar.b(false);
                    }
                    org.telegram.ui.ActionBar.z zVar2 = this.f42788e0;
                    if (zVar2 != null) {
                        zVar2.f(8);
                    }
                    if ((this.Z3 == 0 || (i10 = this.N3) == 3 || i10 == 8) && (w0Var = this.f42802f0) != null) {
                        w0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.f42838i0;
                    if (w0Var3 != null && this.G9) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.z zVar3 = this.f42851j0;
                    if (zVar3 != null && this.H9) {
                        zVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.f42814g0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    this.f42864k0 = true;
                    Fc(0, 0, -1);
                    hc(false);
                }
                pk pkVar = this.f42865k1;
                if (pkVar != null) {
                    if (pkVar.A > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        pkVar.g(false);
                    }
                }
                ImageView imageView = this.P2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.f42787e) || !ChatObject.isPublic(this.f42787e) || this.f42940q3 == null)) {
                    this.f42900n1 = 0;
                } else {
                    this.f42900n1 = 2;
                }
                this.S4 = false;
                if (this.K3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                nh.g1 g1Var = this.f42887m1;
                if (g1Var != null) {
                    g1Var.h.clear();
                }
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f42802f0;
                if (w0Var5 != null) {
                    this.Zb = true;
                    w0Var5.z(false);
                    this.Zb = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = this.f42802f0;
                if (w0Var6 != null) {
                    w0Var6.setSearchFieldCaption(null);
                    this.f42802f0.H(str, false);
                    this.f42802f0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f42927p3, this.P5, this.H6, this.classGuid, 0, this.Z3, false, this.f42867k3, this.f42878l3, false, this.f42889m3);
                yc(0, true);
                this.Z1.e(true, true);
                Lb(true);
                bk bkVar2 = this.l1;
                if (bkVar2 != null) {
                    bkVar2.b(!contains);
                    Hc();
                }
                if ((contains || z10) && this.f42940q3 != null && (bkVar = this.l1) != null) {
                    int currentPosition = bkVar.f31098a.getCurrentPosition();
                    int i11 = this.f42900n1;
                    if (currentPosition != i11) {
                        this.l1.f31098a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f42940q3);
                this.f42925p1.f26976f.N(true);
                View currentView = this.f42887m1.getCurrentView();
                if (currentView instanceof vn) {
                    ((vn) currentView).f43683a.Jc(this.f42940q3);
                }
            }
        }
    }

    public final void db(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        long j11;
        if (f7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.P5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.effect_id = j10;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f42768c5;
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
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.P5, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = C8();
                of3.effect_id = j11;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = N8();
                of3.suggestionParams = this.f42768c5;
                getSendMessagesHelper().sendMessage(of3);
                j11 = 0;
            }
            y6();
        }
    }

    public final void dc() {
        boolean A9 = A9();
        SparseArray[] sparseArrayArr = this.S5;
        if (!A9) {
            if (this.actionBar.s() && this.X0 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.X0.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.f43027x0.setText(LocaleController.getString(R.string.ReportMessagesNoCaps));
            this.f43027x0.setAlpha(0.5f);
            this.f43027x0.setEnabled(false);
            return;
        }
        this.f43027x0.setText(LocaleController.formatString(R.string.ReportMessagesCountNoCaps, LocaleController.formatPluralString("messages", size, new Object[0])));
        this.f43027x0.setAlpha(1.0f);
        this.f43027x0.setEnabled(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.b5 b5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        gj gjVar;
        dk dkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.st editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.nx0 nx0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        dk dkVar2;
        tn tnVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            tnVar.c8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            lj ljVar = tnVar.f42973t0;
            if (ljVar != null) {
                ljVar.f1();
            }
            org.telegram.ui.Components.mi miVar = tnVar.I9;
            if (miVar != null) {
                miVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == tnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        tnVar.finishFragment();
                        c.b(tnVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                lh.s2 s2Var = tnVar.F1;
                if (s2Var != null && s2Var.isShowing()) {
                    tnVar.F1.dismiss(true);
                }
                if (z11 && (dkVar2 = tnVar.U) != null && dkVar2.t0()) {
                    tnVar.U.m0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f22412id = stickerSet2.f22419id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = tnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.nx0) && (tL_messages_stickerSet = (nx0Var = (org.telegram.ui.Components.nx0) dialog).O) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f22419id == stickerSet2.f22419id) {
                            nx0Var.D0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.tc tcVar = new org.telegram.ui.Components.tc(nx0Var.container, tnVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.mc r6 = tcVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r6.f30652j = 2750;
                                    r6.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.nx0 nx0Var2 = new org.telegram.ui.Components.nx0(tnVar.getParentActivity(), tnVar, tL_inputStickerSetID, null, tnVar.U, tnVar.f42746aa);
                            final boolean z15 = z12;
                            tnVar = this;
                            nx0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    tn.i1(tn.this, objArr, nx0Var2, z15, stickerSet2);
                                }
                            });
                            tnVar.showDialog(nx0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                lj ljVar2 = tnVar.f42973t0;
                if (ljVar2 != null) {
                    ljVar2.f1();
                }
                TextView textView = tnVar.M2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.h5 h5Var = tnVar.f43052z2[i13];
                    if (h5Var != null) {
                        h5Var.invalidate();
                    }
                }
                wj wjVar = tnVar.E1;
                if (wjVar != null) {
                    wjVar.getListView().f1();
                }
                jh.e1 e1Var = tnVar.H3;
                if (e1Var != null) {
                    e1Var.f1();
                }
                UndoView undoView = tnVar.f42989u3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                dk dkVar3 = tnVar.U;
                if (dkVar3 != null && (editField = dkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                eg.r[] rVarArr = tnVar.A2;
                eg.r rVar = rVarArr[0];
                if (rVar != null) {
                    rVar.invalidate();
                }
                eg.r rVar2 = rVarArr[1];
                if (rVar2 != null) {
                    rVar2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l10 = (Long) objArr[0];
                if (tnVar.V7 != null && (chat = tnVar.f42787e) != null && chat.f22392id == l10.longValue()) {
                    tnVar.V7.online_count = ((Integer) objArr[1]).intValue();
                    gj gjVar2 = tnVar.W0;
                    if (gjVar2 != null) {
                        gjVar2.m();
                        tnVar.W0.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == tnVar.P5 && (dkVar = tnVar.U) != null) {
                    dkVar.Q1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                dk dkVar4 = tnVar.U;
                if (dkVar4 != null) {
                    dkVar4.R1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (tnVar.f42787e != null) {
                        TLRPC.Chat chat2 = tnVar.getMessagesController().getChat(Long.valueOf(tnVar.f42787e.f22392id));
                        if (chat2 != null) {
                            tnVar.f42787e = chat2;
                        }
                    } else if (tnVar.f42801f != null && (user = tnVar.getMessagesController().getUser(Long.valueOf(tnVar.f42801f.f22539id))) != null) {
                        tnVar.f42801f = user;
                    }
                    tnVar.Nc(true);
                }
                if (!tnVar.F9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (tnVar.f42787e != null && (gjVar = tnVar.W0) != null) {
                        gjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    tnVar.p();
                    tnVar.Wc(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && tnVar.f42787e != null) {
                    tnVar.y9();
                    TLRPC.Chat chat3 = tnVar.getMessagesController().getChat(Long.valueOf(tnVar.f42787e.f22392id));
                    if (chat3 != null) {
                        tnVar.f42787e = chat3;
                        tnVar.y9();
                        z10 = !tnVar.F9();
                        tnVar.hc(false);
                        dk dkVar5 = tnVar.U;
                        if (dkVar5 != null) {
                            dkVar5.b1(tnVar.currentAccount, tnVar.P5);
                        }
                        FlagSecureReason flagSecureReason = tnVar.A3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                gj gjVar3 = tnVar.W0;
                if (gjVar3 != null && z10) {
                    gjVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    tnVar.Qc(true);
                }
                org.telegram.ui.ActionBar.w0 w0Var = tnVar.f42775d0;
                if (w0Var != null) {
                    if (ChatObject.isChannel(tnVar.f42787e) && !ChatObject.isMonoForum(tnVar.f42787e)) {
                        long j11 = tnVar.f42787e.linked_monoforum_id;
                        if (j11 != 0 && ChatObject.canManageMonoForum(tnVar.currentAccount, -j11)) {
                            z13 = true;
                        }
                    }
                    w0Var.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!tnVar.Ka) {
                    if (longValue == tnVar.P5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = tnVar.N3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !tnVar.isPaused && LaunchActivity.U() == tnVar && tnVar.f42755b5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                tnVar.ja(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            tnVar.za(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(tnVar.f42787e) && !tnVar.f42787e.megagroup && (chatFull = tnVar.V7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                tnVar.r6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        tnVar.w7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                tnVar.I9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                tnVar.t6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == tnVar.P5) {
                        tnVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (b5Var = tnVar.parentLayout) != null && b5Var.getFragmentStack().size() > 1) {
                    tnVar.finishFragment();
                } else {
                    tnVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == tnVar.a() && (booleanValue || tnVar.parentLayout.getLastFragment() != tnVar)) {
                    if (tnVar.parentLayout.getLastFragment() == tnVar) {
                        tnVar.finishFragment();
                    } else {
                        tnVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = tnVar.f42870k6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = tnVar.f42787e;
                    if (chat4 != null && chat4.f22392id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (tnVar.f42891m5) {
                            ph phVar = tnVar.f42855j4;
                            if (phVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(phVar);
                                tnVar.f42855j4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            ph phVar2 = new ph(tnVar, messageObject2, intValue3);
                            tnVar.f42855j4 = phVar2;
                            AndroidUtilities.runOnUIThread(phVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = tnVar.f42787e;
                    if (chat5 != null && chat5.f22392id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = tnVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(tnVar.f42787e, tnVar.getMessagesController().getChatFull(tnVar.f42787e.f22392id)));
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
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && tnVar.P5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = tnVar.Z3;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = tnVar.f42818g4;
                            ArrayList arrayList2 = tnVar.q6;
                            if (intValue4 > i19) {
                                tnVar.f42818g4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= tnVar.f42818g4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        em emVar = tnVar.f43013w0;
                                        if (emVar != null) {
                                            emVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > tnVar.f42830h4) {
                                tnVar.f42830h4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= tnVar.f42830h4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        em emVar2 = tnVar.f43013w0;
                                        if (emVar2 != null) {
                                            emVar2.R(messageObject5, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        tnVar.X7(i10, objArr);
        tnVar.Y7(i10, objArr);
        tnVar.Z7(i10, objArr);
        tnVar.a8(i10, objArr);
        tnVar.b8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        lh.s2 s2Var = this.F1;
        if (s2Var != null && this.visibleDialog == s2Var) {
            s2Var.f31005f0.a0(false);
            this.F1.dismissInternal();
            this.F1.f31005f0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.F1 && dialog != this.X9 && !(dialog instanceof ph.p2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e7(View view) {
        CharSequence slowModeTimer = this.U.getSlowModeTimer();
        if (slowModeTimer != null) {
            Sb(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void e8(View view) {
        f8(view, false);
    }

    public final void e9(boolean z10) {
        yb(false, null, null, null, null, null, false, z10);
    }

    public final boolean ea(String str, org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, int i10, int i11) {
        org.telegram.messenger.o6 o6Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.f42787e == null || str == null || this.N3 != 0) {
            return false;
        }
        if (s1Var != null && (characterStyle != null || i11 != 1)) {
            o6Var = new org.telegram.messenger.o6(this, i10, i11, characterStyle, s1Var);
        } else {
            o6Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.f42787e) != null) {
                try {
                    if (Gc == null) {
                        Gc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Hc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Gc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.f42787e, matcher.group(2))) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.parseInt((CharSequence) parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.parseInt((CharSequence) parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.parseInt((CharSequence) queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = bh.i.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (ChatObject.isForum(this.f42787e) && i12 != b()) {
                                        return false;
                                    }
                                    this.f42931p7 = true;
                                    if (this.N3 == 2) {
                                        this.R8.Q0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f42993u7 = W;
                                    if (W >= 0) {
                                        this.f43006v7 = parseInt;
                                    }
                                    Xa(parseInt, i10, true, 0, false, 0, num, g10, o6Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            FileLog.e(e);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Hc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.f42787e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f42770c8 = queryParameter2;
                                    O6(true);
                                    return true;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e11) {
                            FileLog.e(e11);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("comment")).intValue();
                    if (ChatObject.hasPublicLink(this.f42787e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.N3 == 2) {
                            this.R8.Q0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Xa(intValue3, i10, true, 0, false, 0, null, null, o6Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e12) {
                    e = e12;
                    z10 = false;
                }
            } else {
                try {
                    if (Ic == null) {
                        Ic = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = Ic.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f42787e.f22392id || parseInt3 == 0) {
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
                    byte[] g11 = bh.i.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.f42787e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.Y3;
                            if (tL_forumTopic != null && tL_forumTopic.f22444id == findTopic.f22444id) {
                                return true;
                            }
                            return false;
                        }
                        this.f42931p7 = true;
                        if (this.N3 == 2) {
                            this.R8.Q0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Xa(parseInt3, i10, true, 0, false, 0, num2, g11, o6Var);
                        return true;
                    }
                    return false;
                } catch (Exception e13) {
                    FileLog.e(e13);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.parseLong(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.parseInt((CharSequence) parse4.getQueryParameter("thread")).intValue();
            long j10 = this.f42787e.f22392id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                aa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f42931p7 = true;
            if (this.N3 == 2) {
                this.R8.Q0(intValue9);
                finishFragment();
                return true;
            }
            Xa(intValue9, i10, true, 0, false, 0, null, null, o6Var);
            return true;
        }
    }

    public final void eb(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.P5, this.f42856j5, this.T3, null, this.f42831h5, z11, true, null, z10, i10, 0, this.N3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f42768c5);
            y6();
            dk dkVar = this.U;
            if (dkVar != null) {
                dkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.O3 == -1) {
                this.O3 = 0;
            }
            this.O3 = arrayList.size() + this.O3;
            Ec(true);
        }
    }

    public final void ec() {
        km kmVar = this.T0;
        if (kmVar != null && this.Y9 == null) {
            if (this.f42746aa.f42157n == null || kmVar.getBackgroundImage() == null) {
                if (this.T0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.T0.V(org.telegram.ui.ActionBar.g6.r0());
                }
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.extendActionMode(android.view.Menu):boolean");
    }

    public final boolean f7() {
        CharSequence slowModeTimer = this.U.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        j7.l1.C(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void f8(View view, boolean z10) {
        boolean z11;
        ob(view);
        if (view != this.f42803f1) {
            z11 = true;
        } else {
            z11 = false;
        }
        g8(z10, z11, 0.2f);
    }

    public final void f9(boolean z10) {
        if (this.T2.getTag() != null && !this.Z2) {
            if (!this.f42805f3 || this.f42753b3) {
                this.T2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.c3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.c3.playTogether(ObjectAnimator.ofFloat(this.T2, View.ALPHA, 0.0f));
                    this.c3.addListener(new oi(this, 6));
                    this.c3.setStartDelay(this.W2);
                    this.c3.start();
                } else {
                    AnimatorSet animatorSet2 = this.c3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.c3 = null;
                    }
                    this.T2.setAlpha(0.0f);
                }
                this.W2 = 500;
            }
        }
    }

    public final void fa(MessageObject messageObject) {
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
            presentFragment(new tn(bundle));
        }
    }

    public final ke fb(MessageObject messageObject, boolean z10) {
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
                getMessagesController().markMessageAsRead(this.P5, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.P5, messageObject.getId(), null, i11, 0L, z11);
            return null;
        }
        return new ke(this, messageObject, 1);
    }

    public final void fc() {
        TLRPC.User user;
        boolean z10;
        if (this.f42775d0 != null && (user = this.f42801f) != null && this.h == null && user.bot) {
            a0.h hVar = this.Z7;
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
                this.f42775d0.K(30);
            } else {
                this.f42775d0.r(30);
            }
            if (z10) {
                this.f42775d0.K(31);
            } else {
                this.f42775d0.r(31);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.o1 o1Var = this.M8;
        if (o1Var != null) {
            o1Var.f23712e = false;
            A7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f42787e;
    }

    public final void g7(Runnable runnable, kf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            u1 u1Var = new u1(this, aVar, runnable, 19);
            jh.s7 x4 = jh.s7.x(this.currentAccount, aVar.f13633a);
            if (!x4.f12790e) {
                x4.q(true, true, u1Var);
                return;
            } else {
                u1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void g8(boolean z10, boolean z11, float f9) {
        boolean z12;
        ValueAnimator ofFloat;
        ug.g gVar;
        org.telegram.ui.Cells.s1 s1Var;
        if (f9 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.F8;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            s1Var2.setInvalidatesParent(z12);
            if (z12) {
                Na(s1Var2);
            }
        }
        this.T0.invalidate();
        this.f42973t0.invalidate();
        AnimatorSet animatorSet = this.L8;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.L8.cancel();
        }
        this.L8 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.D8, f9);
        float f10 = 1.0f;
        if (z12) {
            this.G8 = 1.0f;
            this.H8 = 0.0f;
            ValueAnimator valueAnimator = this.Xb;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.E8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f9);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.yl0.d(new pe(this, 3));
            }
        } else {
            float f11 = this.D8;
            this.H8 = f11 / max;
            this.E8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new ag(this, max, 0));
        if ((!z12 || z11) && (gVar = this.f42803f1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(gVar, property, f10));
        }
        this.L8.playTogether(arrayList);
        this.L8.setInterpolator(org.telegram.ui.Components.jr.h);
        this.L8.setDuration(320L);
        View view2 = this.F8;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            s1Var = (org.telegram.ui.Cells.s1) view2;
        } else {
            s1Var = null;
        }
        this.L8.addListener(new androidx.fragment.app.g(this, z12, s1Var, 5));
        if (this.F8 != null && this.G8 <= 0.0f) {
            ob(null);
        }
        this.L8.start();
    }

    public final void g9(boolean z10) {
        if (this.U2.getTag() != null && !this.f42739a3) {
            if (!this.f42817g3 || this.f42753b3) {
                this.U2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42791e3, 0.0f);
                    this.f42778d3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f42778d3.addUpdateListener(new ge(this, 1));
                    this.f42778d3.addListener(new oi(this, 8));
                    this.f42778d3.setStartDelay(this.W2);
                    this.f42778d3.start();
                } else {
                    ValueAnimator valueAnimator = this.f42778d3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f42778d3 = null;
                    }
                    this.f42791e3 = 0.0f;
                    lc();
                }
                this.W2 = 500;
            }
        }
    }

    public final void ga(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f42801f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f42801f.f22539id) {
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
            presentFragment(new tn(bundle));
        }
    }

    public final void gb(android.net.Uri r28, boolean r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.gb(android.net.Uri, boolean, int):void");
    }

    public final void gc() {
        if (this.N1 == null) {
            return;
        }
        this.N1.setSideMenuBackgroundMarginBottom(((this.O.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.c());
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return org.telegram.ui.ActionBar.x4.f23968a;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23984c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.N3 == 0 && (call = this.S7) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.N3 == 2) {
            ArrayList arrayList = this.q6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + A8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.c6 getResourceProvider() {
        return this.f42746aa;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        if (this.f42743a7) {
            return null;
        }
        if (this.W9) {
            this.W9 = false;
            return null;
        }
        f fVar = new f(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Qd));
        if (!A9()) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.g6.f23385v8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.g6.B8));
        } else {
            org.telegram.ui.ActionBar.l lVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.g6.y8;
            arrayList.add(new org.telegram.ui.ActionBar.i6(lVar, 64, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23452z8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 128, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1024, null, null, null, null, i11));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, Integer.MIN_VALUE, null, null, null, fVar, org.telegram.ui.ActionBar.g6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741824, null, null, null, fVar, org.telegram.ui.ActionBar.g6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1073741832, null, null, null, fVar, org.telegram.ui.ActionBar.g6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 32768, null, null, null, null, org.telegram.ui.ActionBar.g6.f23329s8));
        gj gjVar = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gjVar != null ? gjVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.A8));
        gj gjVar2 = this.W0;
        org.telegram.ui.ActionBar.h5 titleTextView = gjVar2 != null ? gjVar2.getTitleTextView() : null;
        int i12 = org.telegram.ui.ActionBar.g6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(titleTextView, 8, null, null, null, null, i12));
        gj gjVar3 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gjVar3 != null ? gjVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.g6.f23042c2, org.telegram.ui.ActionBar.g6.f23058d2}, org.telegram.ui.ActionBar.g6.f23282pa));
        gj gjVar4 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gjVar4 != null ? gjVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.g6.f23348t8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.g6.C8));
        org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.g6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar2, 67108864, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 67108864, null, null, null, null, i13));
        org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.g6.y8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(lVar3, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.g6.f23403w8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.g6.f23420x8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.g6.f23452z8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X0, 4, null, null, null, null, i14));
        gj gjVar5 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gjVar5 != null ? gjVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23187k4}, null, org.telegram.ui.ActionBar.g6.f23265oc));
        gj gjVar6 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.i6(gjVar6 != null ? gjVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23204l4}, null, org.telegram.ui.ActionBar.g6.f23284pc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23154i8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23172j8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23191k8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23208l8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23225m8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23243n8));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23262o8));
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.d5 d5Var3 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.d5 d5Var4 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.d5 d5Var5 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.d5 d5Var6 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{d5Var, d5Var2}, null, org.telegram.ui.ActionBar.g6.f23313ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.g6.f23067dc));
        if (d5Var != null) {
            Drawable[] k9 = d5Var.k();
            int i15 = org.telegram.ui.ActionBar.g6.f23350ta;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k9, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, d5Var2.k(), null, i15));
            Drawable[] k10 = d5Var3.k();
            int i16 = org.telegram.ui.ActionBar.g6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, k10, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, d5Var4.k(), null, i16));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.g6.Aa));
        if (this.f42746aa.h(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.g6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.g6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.g6.Fa));
        }
        lj ljVar = this.f42973t0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.s1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = d5Var5;
        drawableArr[i10] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ljVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.g6.Ba));
        lj ljVar2 = this.f42973t0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.s1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = d5Var5;
        drawableArr2[i10] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ljVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.g6.f23033bc));
        lj ljVar3 = this.f42973t0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.v0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i17 = org.telegram.ui.ActionBar.g6.f23158ic;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ljVar3, 4, clsArr3, themedPaint, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 2, new Class[]{org.telegram.ui.Cells.v0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.g6.f23176jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23399w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.g6.f23194kc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.g6.lc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23228mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23086ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23104fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 2, new Class[]{org.telegram.ui.Cells.s1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 2, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint[]) null, org.telegram.ui.ActionBar.g6.hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.g6.f23131h3};
        int i18 = org.telegram.ui.ActionBar.g6.f23195kd;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr3, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.g6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.g6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.g6.La));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.g6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23298qc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23315rc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.F3, org.telegram.ui.ActionBar.g6.G3}, null, org.telegram.ui.ActionBar.g6.f23333sc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23352tc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.g6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.g6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.M3, org.telegram.ui.ActionBar.g6.Q3, org.telegram.ui.ActionBar.g6.U3}, null, org.telegram.ui.ActionBar.g6.f23422xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.N3, org.telegram.ui.ActionBar.g6.R3, org.telegram.ui.ActionBar.g6.V3}, null, org.telegram.ui.ActionBar.g6.f23438yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23006a4, org.telegram.ui.ActionBar.g6.f23025b4, org.telegram.ui.ActionBar.g6.Z3}, null, org.telegram.ui.ActionBar.g6.f23456zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.g6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.g6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23043c4}, null, org.telegram.ui.ActionBar.g6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23060d4}, null, org.telegram.ui.ActionBar.g6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23115g4}, null, org.telegram.ui.ActionBar.g6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i19 = org.telegram.ui.ActionBar.g6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr4, null, i19));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.g6.f23132h4, org.telegram.ui.ActionBar.g6.B4, org.telegram.ui.ActionBar.g6.D4};
        int i20 = org.telegram.ui.ActionBar.g6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, drawableArr5, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.G4, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, org.telegram.ui.ActionBar.g6.H4, null, org.telegram.ui.ActionBar.g6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.O4}, null, org.telegram.ui.ActionBar.g6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.P4}, null, org.telegram.ui.ActionBar.g6.f23311r7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.Q4}, null, org.telegram.ui.ActionBar.g6.f23297qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.f23023b2, null, null, org.telegram.ui.ActionBar.g6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23168j4}, null, org.telegram.ui.ActionBar.g6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, fVar, org.telegram.ui.ActionBar.g6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.J2, null, null, org.telegram.ui.ActionBar.g6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.K2, null, null, org.telegram.ui.ActionBar.g6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.T1, null, null, org.telegram.ui.ActionBar.g6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.g6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.g6.f23407wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Rc));
        int i21 = org.telegram.ui.ActionBar.g6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.g6.f23013ab;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23049cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23066db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23085eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23015ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23103fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23034bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23051cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23122gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23068dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23139hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23087ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23157ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23105fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23123gd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23175jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23193kb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23140hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23159id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23177jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23314rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23248nd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23332sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23266od));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23212ld));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23229md));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.ob));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23283pb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23246nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.pd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23299qd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23211lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23227mb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23316rd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23351tb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23334sd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23370ub));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23353td));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23388vb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23372ud));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23406wb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23408wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23437yb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.xd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23390vd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23455zb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.xb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23439yd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23457zd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.U1, null, null, org.telegram.ui.ActionBar.g6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.V1, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, org.telegram.ui.ActionBar.g6.W1, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23160ie));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23371uc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23178je));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23389vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.g6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.g6.re));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.g6.f23335se));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 32, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.g6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.g6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23285pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.g6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.g6.f23300qe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.g6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23084ea));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23102fa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23121ga));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23138ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.g6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.g6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.g6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.g6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.g6.f23422xc));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.g6.Ra));
        if (!this.f42746aa.h(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.f23305r0, null, org.telegram.ui.ActionBar.g6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.f23395w0, null, null, org.telegram.ui.ActionBar.g6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Paint[]{org.telegram.ui.ActionBar.g6.B0[0], org.telegram.ui.ActionBar.g6.B0[1], org.telegram.ui.ActionBar.g6.D0}, null, null, org.telegram.ui.ActionBar.g6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Paint[]{org.telegram.ui.ActionBar.g6.C0[0], org.telegram.ui.ActionBar.g6.C0[1], org.telegram.ui.ActionBar.g6.E0}, null, null, org.telegram.ui.ActionBar.g6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23004a1}, null, org.telegram.ui.ActionBar.g6.f23011a9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23112g1, org.telegram.ui.ActionBar.g6.f23129h1}, null, org.telegram.ui.ActionBar.g6.f23173j9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.F0[1], null, null, org.telegram.ui.ActionBar.g6.f23155i9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.G0, null, null, org.telegram.ui.ActionBar.g6.f23226m9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.k9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23263o9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, org.telegram.ui.ActionBar.g6.H0, null, null, org.telegram.ui.ActionBar.g6.f23281p9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, org.telegram.ui.ActionBar.g6.I0, null, null, org.telegram.ui.ActionBar.g6.q9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.T0}, null, org.telegram.ui.ActionBar.g6.f23368u9));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.H3, 0, new Class[]{org.telegram.ui.Cells.p2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.V0, org.telegram.ui.ActionBar.g6.W0}, null, org.telegram.ui.ActionBar.g6.f23386v9));
        }
        wj wjVar = this.E1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i23 = org.telegram.ui.ActionBar.g6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wjVar, 0, null, themedPaint2, null, null, i23));
        wj wjVar2 = this.E1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.g6.f23149i3};
        int i24 = org.telegram.ui.ActionBar.g6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.i6(wjVar2, 0, null, null, drawableArr10, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23167j3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23149i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.N, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23149i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23149i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.g6.Xk));
        int i25 = org.telegram.ui.ActionBar.g6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i25));
        int i26 = org.telegram.ui.ActionBar.g6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.g6.f23152i6;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i26));
        int i28 = org.telegram.ui.ActionBar.g6.f23179jf;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i25));
        int i29 = org.telegram.ui.ActionBar.g6.f23036bf;
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23016ae));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.g6.f23035be));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.g6.f23197kf));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23250nf));
        dk dkVar = this.U;
        int i30 = org.telegram.ui.ActionBar.g6.f23231mf;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.g6.f23268of));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.g6.f23053cf));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.g6.f23017af));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23107ff));
        dk dkVar2 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar2 != null ? dkVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.He));
        dk dkVar3 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar3 != null ? dkVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Ke));
        dk dkVar4 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar4 != null ? dkVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Le));
        dk dkVar5 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar5 != null ? dkVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Me));
        dk dkVar6 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar6 != null ? dkVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Oe));
        dk dkVar7 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar7 != null ? dkVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Pe));
        dk dkVar8 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar8 != null ? dkVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Re));
        dk dkVar9 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar9 != null ? dkVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Se));
        dk dkVar10 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar10 != null ? dkVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.We));
        dk dkVar11 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar11 != null ? dkVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Ne));
        dk dkVar12 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar12 != null ? dkVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Je));
        dk dkVar13 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar13 != null ? dkVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Ue));
        dk dkVar14 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.i6(dkVar14 != null ? dkVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.fz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.g6.Qe));
        dk dkVar15 = this.U;
        if (dkVar15 != null) {
            org.telegram.ui.Components.e41 trendingStickersAlert = dkVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, new Drawable[]{this.U.getStickersArrowDrawable()}, null, i26));
        }
        int i31 = 0;
        while (i31 < 2) {
            View view = i31 == 0 ? this.f42989u3 : this.f43002v3;
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 32, null, null, null, null, org.telegram.ui.ActionBar.g6.Fi));
            int i32 = org.telegram.ui.ActionBar.g6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i32));
            int i33 = org.telegram.ui.ActionBar.g6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 2, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.i6(view, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i33));
            i31++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.g6.f23384v7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.g6.f23402w7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.f23366u7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.f23347t7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.g6.f23419x7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.g6.f23434y7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43001v2, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23088ee));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43001v2, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23062d6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.B2, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23106fe));
        for (int i34 = 0; i34 < 2; i34++) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43040y2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23106fe));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43052z2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23124ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.L2, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23106fe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.M2, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23124ge));
        ImageView imageView = this.F2;
        int i35 = org.telegram.ui.ActionBar.g6.f23069de;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.H2, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.Q1, 8, null, null, null, null, i35));
        TextView textView = this.H1;
        int i36 = org.telegram.ui.ActionBar.g6.f23141he;
        arrayList.add(new org.telegram.ui.ActionBar.i6(textView, 4, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J1, 262148, null, null, null, null, org.telegram.ui.ActionBar.g6.f23295q7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.J1, 262148, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.D1, 8, null, null, null, null, org.telegram.ui.ActionBar.g6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23391ve));
        ImageView imageView2 = this.O2;
        int i37 = org.telegram.ui.ActionBar.g6.f23423xe;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView2, 8, null, null, null, null, i37));
        ImageView imageView3 = this.O2;
        int i38 = org.telegram.ui.ActionBar.g6.f23452z8;
        arrayList.add(new org.telegram.ui.ActionBar.i6(imageView3, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P2, 8, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.P2, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.g6.f23458ze));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43027x0, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43027x0, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23355tf));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f43027x0, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.C0, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Sh));
        org.telegram.ui.Components.yn ynVar = this.U0;
        int i39 = org.telegram.ui.ActionBar.g6.f23158ic;
        arrayList.add(new org.telegram.ui.ActionBar.i6(ynVar, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X1, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42876l0, 2048, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.g6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 8, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.g6.De));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42973t0, 4, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.Ee));
        cg.i0 i0Var = this.M;
        int i40 = org.telegram.ui.ActionBar.g6.lc;
        arrayList.add(new org.telegram.ui.ActionBar.i6(i0Var, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.X1, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.U0, 536870912, null, null, null, null, i40));
        if (this.E1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.g6.Ce));
            int i41 = org.telegram.ui.ActionBar.g6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 4, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"nameTextView"}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 4, new Class[]{org.telegram.ui.Cells.f5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.g6.A6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.d2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.g6.f23221m4, org.telegram.ui.ActionBar.g6.f23239n4, org.telegram.ui.ActionBar.g6.f23258o4}, null, org.telegram.ui.ActionBar.g6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23450z6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, null, org.telegram.ui.ActionBar.g6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23159id));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23177jd));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.d2.class}, null, null, null, org.telegram.ui.ActionBar.g6.f23063d7));
        }
        org.telegram.ui.Components.g40 g40Var = this.a2;
        int i42 = org.telegram.ui.ActionBar.g6.f23301qf;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g40Var, 32, null, null, null, null, i42));
        org.telegram.ui.Components.g40 g40Var2 = this.a2;
        int i43 = org.telegram.ui.ActionBar.g6.pf;
        arrayList.add(new org.telegram.ui.ActionBar.i6(g40Var2, 4, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42926p2, 4, new Class[]{org.telegram.ui.Components.g40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42926p2, 8, new Class[]{org.telegram.ui.Components.g40.class}, new String[]{"imageView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42926p2, 4, new Class[]{org.telegram.ui.Components.g40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42939q2, 4, new Class[]{org.telegram.ui.Components.g40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.f42939q2, 4, new Class[]{org.telegram.ui.Components.g40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.T2, 0, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.i6(this.V2, 0, null, null, null, null, i40));
        int i44 = org.telegram.ui.ActionBar.g6.f23156ia;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23174ja));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23192ka));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23210la));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.ma));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23245na));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23264oa));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.g6.R4}, null, org.telegram.ui.ActionBar.g6.da));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23133h5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23151i5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23294q5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23189k6));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23374uf));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23392vf));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23019ah));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23038bh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23055ch));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23072dh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23091eh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23109fh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23162ih));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23181jh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23199kh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23127gh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23144hh));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.f23009a7));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.g6.Dj));
        int i45 = org.telegram.ui.ActionBar.g6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.i6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.g6.f23424xf));
        dk dkVar16 = this.U;
        if (dkVar16 != null && dkVar16.f26137i0 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.U.f26137i0.f46112c, 4, new Class[]{ph.x.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.g6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.i6(this.U.f26137i0.f46112c, 4, new Class[]{ph.x.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.g6.f23433y6));
        }
        hh.e eVar = this.f42760ba;
        if (eVar != null) {
            eVar.b(arrayList);
        }
        int size = arrayList.size();
        int i46 = 0;
        while (i46 < size) {
            Object obj = arrayList.get(i46);
            i46++;
            ((org.telegram.ui.ActionBar.i6) obj).f23544o = this.f42746aa;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f42746aa.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint G = this.f42746aa.G(str);
        if (G != null) {
            return G;
        }
        return org.telegram.ui.ActionBar.g6.S0(str);
    }

    public final void h7() {
        if (this.f43002v3 != null) {
            return;
        }
        al alVar = new al(this, getParentActivity(), this, this.f42746aa);
        this.f43002v3 = alVar;
        this.T0.addView(alVar, 17, i7.f6.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void h8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void h9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.g40 g40Var = this.f42840i2;
            if (g40Var != null) {
                g40Var.b(true);
            }
            zi ziVar = this.f42766c2;
            if (ziVar != null) {
                ziVar.b(true);
            }
            org.telegram.ui.Components.g40 g40Var2 = this.f42790e2;
            if (g40Var2 != null) {
                g40Var2.b(true);
            }
        }
        org.telegram.ui.Components.g40 g40Var3 = this.f42828h2;
        if (g40Var3 != null) {
            g40Var3.b(true);
        }
        org.telegram.ui.Components.g40 g40Var4 = this.f42816g2;
        if (g40Var4 != null) {
            g40Var4.b(true);
        }
        org.telegram.ui.Components.g40 g40Var5 = this.f42926p2;
        if (g40Var5 != null) {
            g40Var5.b(true);
        }
        org.telegram.ui.Components.g40 g40Var6 = this.f42939q2;
        if (g40Var6 != null) {
            g40Var6.b(true);
        }
        org.telegram.ui.Components.g40 g40Var7 = this.f42853j2;
        if (g40Var7 != null) {
            g40Var7.b(true);
        }
        org.telegram.ui.Components.g40 g40Var8 = this.f42866k2;
        if (g40Var8 != null) {
            g40Var8.b(true);
        }
        org.telegram.ui.Components.kp kpVar = this.f42950r2;
        if (kpVar != null) {
            kpVar.a();
        }
        nh.t3 t3Var = this.F0;
        if (t3Var != null) {
            t3Var.e(true);
        }
        nh.t3 t3Var2 = this.H0;
        if (t3Var2 != null) {
            t3Var2.e(true);
        }
        nh.t3 t3Var3 = this.G0;
        if (t3Var3 != null) {
            t3Var3.e(true);
        }
    }

    public final void ha(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        long j10;
        long j11;
        org.telegram.ui.Components.c6 animation;
        Bitmap m10;
        if (s1Var == null) {
            int childCount = this.f42973t0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f42973t0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var2.getMessageObject().equals(messageObject)) {
                        s1Var = s1Var2;
                        break;
                    }
                }
                i10++;
            }
        }
        if (messageObject.isVideo()) {
            fb(messageObject, true);
        }
        PhotoViewer.t1().K2(null, this, this.f42746aa);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (s1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = s1Var.getPhotoImage().getAnimation()) != null && this.f42968s8 != null && this.f42932p8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f42968s8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.N3;
        hl hlVar = this.Ba;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().f35715h4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.q6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().a2(arrayList, arrayList.indexOf(messageObject), this.P5, 0L, b(), hlVar);
        } else {
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = messageObject.type;
            long j12 = 0;
            if (i13 != 0) {
                j10 = this.P5;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = this.H6;
            } else {
                j11 = 0;
            }
            if (i13 != 0) {
                j12 = b();
            }
            t12.c2(messageObject, this, j10, j11, j12, hlVar);
        }
        h9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void hb(MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages X8 = X8(messageObject);
        boolean z12 = false;
        if (X8 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < X8.messages.size()) {
                    if (this.S5[i10].indexOfKey(X8.messages.get(i11).getId()) < 0) {
                        break;
                    }
                    i11++;
                } else {
                    X8 = null;
                    break;
                }
            }
        }
        if (X8 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        s1Var.setDrawSelectionBackground(z11);
        if (X8 == null) {
            z12 = true;
        }
        s1Var.L3(true, z12, z10);
    }

    public final void hc(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.hc(boolean):void");
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.T3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.f42787e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f42801f;
    }

    public final void i7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.Db > 1000) {
            z10 = true;
        }
        ig igVar = this.Eb;
        AndroidUtilities.cancelRunOnUIThread(igVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        AndroidUtilities.runOnUIThread(igVar, j10);
    }

    public final void i8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.f42880l5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void i9() {
        ValueAnimator valueAnimator = this.f42773cb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.v0 v0Var = this.V2;
        if (v0Var != null && v0Var.getTag() != null) {
            this.V2.setTag(null);
            org.telegram.ui.Cells.v0 v0Var2 = this.V2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new xe(this, v0Var2, 1));
            ofFloat.addListener(new bg.c3(14, this, v0Var2));
            ofFloat.setDuration(150L);
            this.f42773cb = ofFloat;
            ofFloat.start();
        }
    }

    public final void ia(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i10;
        if (getParentActivity() != null && (b5Var = this.parentLayout) != null && b5Var.getLastFragment() == this && !this.D4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f42787e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f22392id);
            } else {
                bundle.putLong("user_id", this.f42801f.f22539id);
            }
            bundle.putInt("chatMode", 2);
            tn tnVar = new tn(bundle);
            tnVar.D4 = new ArrayList(this.D4);
            tnVar.F4 = new HashMap(this.F4);
            int size = this.D4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.D4.get(i11);
                MessageObject messageObject = (MessageObject) this.F4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f42870k6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    tnVar.F4.put(num, messageObject);
                    tnVar.zc();
                }
            }
            tnVar.L4 = this.L4;
            if (this.f42779d4) {
                i10 = this.D4.size();
            } else {
                i10 = this.M4;
            }
            tnVar.M4 = i10;
            tnVar.O4 = this.O4;
            tnVar.W7 = this.W7;
            tnVar.V7 = this.V7;
            tnVar.R8 = new el(this, tnVar);
            if (z10) {
                presentFragmentAsPreview(tnVar);
                d7();
                return;
            }
            presentFragment(tnVar, false);
        }
    }

    public final void ib(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f42746aa != null && this.Y9 == null) {
            qf.b c3 = qf.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.P5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.b4 theme = chatThemeController.getTheme(c3);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.b4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.b4 b4Var = theme;
                rn rnVar = this.f42746aa;
                TLRPC.WallPaper wallPaper = rnVar.h;
                if (this.L5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                rnVar.i(b4Var, wallPaper, z11, null, false);
                return;
            }
            if (c3 != null && !c3.b()) {
                chatThemeController.requestChatTheme(c3, new me(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.P5);
            rn rnVar2 = this.f42746aa;
            org.telegram.ui.ActionBar.b4 b4Var2 = rnVar2.f42156f;
            if (this.L5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            rnVar2.i(b4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void ic() {
        hc(false);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int w02;
        if (A9()) {
            org.telegram.ui.ActionBar.c6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w02 = resourceProvider.h0(org.telegram.ui.ActionBar.g6.f23403w8);
            } else {
                w02 = org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23403w8, true);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.g6.I.q();
        } else {
            z10 = this.f43061zb;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.N3 != 5 || (!this.q6.isEmpty() && this.Z3 != 0)) && !this.f42998uc.f49506f && this.f42860j9) {
            zk zkVar = this.Aa;
            if (zkVar == null || !zkVar.f32256s) {
                fh.k kVar = this.T9;
                if (kVar == null || !kVar.a()) {
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
        Xa(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final void j7() {
        int W8 = (int) (W8(org.telegram.ui.Components.i21.f29305c) + this.O.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.T.setFadeZoneBottom(W8);
        int b10 = i7.w.b(AndroidUtilities.dp(36.0f) + (this.T0.getMeasuredHeight() - W8), 0, this.T0.getMeasuredHeight());
        int measuredWidth = this.T0.getMeasuredWidth();
        Rect rect = Lc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.f43009va, this.f42973t0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f42973t0.getMeasuredHeight() - this.f43023wa) - W8));
    }

    public final void j8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f42768c5;
        if (messageSuggestionParams != null) {
            Db(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.C5;
        if (webPage != null) {
            Eb(true, webPage, false);
            return;
        }
        jn jnVar = this.f42831h5;
        if (jnVar != null) {
            Cb(this.f42856j5, jnVar);
            return;
        }
        MessageObject messageObject = this.f42856j5;
        if (messageObject != null && messageObject != this.T3) {
            Bb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f42755b5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Ab(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.f42880l5;
        if (messageObject2 != null) {
            yb(true, null, messageObject2, null, null, null, false, true);
        } else {
            Eb(false, null, true);
        }
    }

    public final boolean j9(boolean z10) {
        bl blVar;
        bl blVar2 = this.f42975t2;
        if (blVar2 == null || blVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.vg vgVar = this.I0;
        if (vgVar != null && (blVar = this.f42975t2) != null) {
            vgVar.i(blVar, false, z10);
        }
        int i10 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.D2;
            if (i10 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i10] = null;
                }
                i10++;
            } else {
                this.f43015w2 = false;
                this.f42975t2.setTag(1);
                return true;
            }
        }
    }

    public final void ja(int i10, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f22400id);
            } else {
                TLRPC.Chat chat = this.f42787e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f22392id);
                } else {
                    bundle.putLong("user_id", this.f42801f.f22539id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            tn tnVar = new tn(bundle);
            if (this.f42779d4) {
                yf.d.a(tnVar, MessagesStorage.TopicKey.of(a(), b()));
            }
            tnVar.R8 = new hj(this);
            presentFragment(tnVar, false);
        }
    }

    public final void jb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                jb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f42973t0 && view != this.T0) {
            view.setEnabled(z10);
        }
    }

    public final void jc() {
        int i10;
        org.telegram.ui.Components.rb rbVar;
        qk qkVar;
        dk dkVar;
        if (this.f43059z9 && this.f42973t0 != null) {
            float f9 = 0.0f;
            if (this.f42885la <= 0 || this.f43060za != 0.0f) {
                float V8 = V8(AndroidUtilities.dp(7.0f));
                pk pkVar = this.f42865k1;
                if (pkVar != null) {
                    i10 = AndroidUtilities.dp(pkVar.A * 35.0f);
                } else {
                    i10 = 0;
                }
                float z82 = (z8() * AndroidUtilities.dp(43.0f)) + V8 + i10;
                float f10 = this.f42921o9;
                this.f42933p9 = z82;
                this.f42921o9 = W8(org.telegram.ui.Components.i21.f29303a) + AndroidUtilities.dp(4.0f) + this.r9 + z82;
                if (this.actionBar.getVisibility() == 0 || this.Z9 != null) {
                    this.f42921o9 += this.actionBar.getMeasuredHeight();
                }
                this.q9 = 0;
                this.f42921o9 = this.f42921o9 + this.f43009va + this.f42969s9;
                if (this.f43060za != 0.0f && (dkVar = this.U) != null && dkVar.getVisibility() == 0) {
                    float f11 = this.f42921o9;
                    float measuredHeight = this.f43060za * (this.U.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f42921o9 = f11 - measuredHeight;
                    f9 = measuredHeight;
                }
                org.telegram.ui.Cells.v0 v0Var = this.V2;
                if (v0Var != null) {
                    v0Var.setTranslationY(((this.f42973t0.getTranslationY() + this.f42921o9) + this.f43022w9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f42921o9;
                    float f13 = this.f43022w9;
                    this.f42921o9 = f12 + f13;
                    this.q9 = (int) (this.q9 + f13);
                }
                uj ujVar = this.T2;
                if (ujVar != null) {
                    ujVar.setTranslationY((((this.f42973t0.getTranslationY() - f9) + this.f42921o9) + this.f42995u9) - AndroidUtilities.dp(4.0f));
                }
                lc();
                lj ljVar = this.f42973t0;
                if (ljVar != null && this.f42999v0 != null && this.f43013w0 != null) {
                    int paddingTop = ljVar.getPaddingTop();
                    int paddingBottom = this.f42973t0.getPaddingBottom();
                    n7();
                    if (this.f42973t0.getPaddingTop() != paddingTop || this.f42973t0.getPaddingBottom() != paddingBottom) {
                        r9();
                        q9(2);
                    }
                    this.f42973t0.setTopGlowOffset((int) ((this.f42921o9 - this.q9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f42921o9) {
                        int childCount = this.f42973t0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f42973t0.getChildAt(i11);
                            this.f42973t0.getClass();
                            if (RecyclerView.R(childAt) == this.f43013w0.h() - 1) {
                                float f14 = this.f42921o9;
                                if (childAt.getTop() > f14) {
                                    this.f42973t0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!F9() && !this.f43054z4 && this.F7 != null && this.f42973t0 != null && ((qkVar = this.L1) == null || qkVar.getVisibility() != 0)) {
                        this.f42973t0.scrollBy(0, (int) (f10 - this.f42921o9));
                    }
                }
                this.f43059z9 = false;
                org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
                if (mcVar != null && (rbVar = mcVar.f30648e) != null) {
                    rbVar.updatePosition();
                }
                n7();
            }
        }
    }

    public final void k7() {
        int i10;
        if (this.W0 != null) {
            float actionModeFactor = (1.0f - this.f43011vc.f49505e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.W0.setScaleX(lerp);
            this.W0.setScaleY(lerp);
            this.W0.setAlpha(actionModeFactor);
            gj gjVar = this.W0;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            gjVar.setVisibility(i10);
        }
    }

    public final void k9() {
        uk ukVar = this.Xa;
        if (ukVar == null) {
            return;
        }
        this.Xa = null;
        ukVar.e();
        if (ukVar.getReactionsWindow() != null && ukVar.getReactionsWindow().f13681a != null) {
            ukVar.getReactionsWindow().f13681a.animate().alpha(0.0f).setDuration(180L).start();
        }
        ukVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new vf(12, this, ukVar)).setDuration(180L).start();
    }

    public final void ka(TLRPC.Chat chat) {
        boolean z10;
        nh.t3 t3Var = this.f42949r1;
        if (t3Var != null && t3Var.R) {
            t3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        nh.t3 t3Var2 = this.f42961s1;
        if (t3Var2 != null && t3Var2.R) {
            t3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new vf(6, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f23612j0) {
            this.f43011vc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f42775d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar = this.f42737a0;
            if (zVar != null) {
                zVar.f(8);
            }
            vr vrVar = this.Z;
            if (vrVar != null) {
                vrVar.b(false);
            }
            org.telegram.ui.ActionBar.z zVar2 = this.f42788e0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f42802f0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f42838i0;
            if (w0Var3 != null && this.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar3 = this.f42851j0;
            if (zVar3 != null && this.H9) {
                zVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f42814g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f42864k0 = true;
            Fc(0, 0, -1);
            hc(false);
            ImageView imageView = this.O2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.P2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f42802f0;
        if (w0Var5 != null) {
            this.Zb = true;
            this.S4 = false;
            w0Var5.z(false);
            this.Zb = false;
        }
        Za(chat, null);
        yc(0, true);
    }

    public final void kb(boolean z10) {
        lb(z10, false, true);
    }

    public final void kc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.Va == null) {
            this.Va = new a0.h();
        }
        a0.h hVar2 = this.Ua;
        if (hVar2 == null) {
            this.Ua = new a0.h();
        } else {
            hVar2.b();
        }
        this.f43013w0.L.clear();
        this.Va.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.f42979t6;
            arrayList = this.q6;
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
                if (this.f43013w0.J && messageObject2.stableId != 0) {
                    messageObject.copyStableParams(messageObject2);
                } else {
                    messageObject2.copyStableParams(messageObject);
                }
            } else if (messageObject2.stableId == 0) {
                int i12 = Fc;
                Fc = i12 + 1;
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
                    groupedMessages2.reversed = this.La;
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
            this.f43013w0.L.add(messageObject2);
            this.Va.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (hVar3 != null) {
            for (int i14 = 0; i14 < hVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new lh.e4(14));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f42889m3 != null && TextUtils.isEmpty(this.f42927p3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f42889m3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
            if (!this.Va.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.f43013w0.L.add(messageObject4);
                this.Va.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.f43013w0.L.size()) {
            MessageObject messageObject5 = (MessageObject) this.f43013w0.L.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.Va.d(messageObject6.getId())) {
                        this.f43013w0.L.add(i18, messageObject6);
                        this.Va.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.f43013w0.L, new lh.e4(15));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.f43013w0.L.size()) {
            MessageObject messageObject8 = (MessageObject) this.f43013w0.L.get(i19);
            if (this.La && messageObject8 != null && i19 == 0) {
                Da(messageObject8, i19);
                i19++;
            }
            if (!this.La && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.Ua.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.x3.m(messageObject8.dateKeyInt, this.Ua);
            }
            arrayList4.add(messageObject8);
            if (this.La && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject8, i19);
                i19++;
            }
            if (!this.La && i19 >= this.f43013w0.L.size() - 1) {
                Da(messageObject8, this.f43013w0.L.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.f43013w0.K = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.f43013w0.T();
            this.f43013w0.O(true);
            if (this.f43013w0.J ? !getMediaDataController().isSearchLoading() || !this.f43013w0.L.isEmpty() : !this.C6 || !arrayList.isEmpty() || this.f43013w0.f37866w >= 0) {
                z11 = false;
            }
            Pb(z11);
            if (this.f42973t0 != null) {
                G7(false);
                if (this.f43013w0.J ? !(getMediaDataController().isSearchLoading() || !this.f43013w0.L.isEmpty()) : !(this.C6 || !arrayList.isEmpty() || this.f43013w0.f37866w >= 0)) {
                    this.f42973t0.setEmptyView(this.M0);
                    lj ljVar = this.f42973t0;
                    ljVar.J0(ljVar.u1());
                    return;
                }
                this.M0.setVisibility(8);
                this.f42973t0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2 = null;
        l8(str, null);
        if (f7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.P5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.invert_media = z11;
                of2.payStars = j11;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f42768c5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.P5, false, false, true, 0, 0, null, -1, j11, N8(), this.f42768c5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.P5, this.f42856j5, this.T3, null, this.f42831h5, this.f42880l5, z10, i10, 0, null, C8(), j10, z11, j11, N8(), this.f42768c5);
            y6();
        }
    }

    public final void l7() {
        boolean z10;
        nh.g1 g1Var;
        if (this.Z9 != null) {
            return;
        }
        int i10 = 0;
        if (this.f42998uc.f49505e >= 1.0f && ((g1Var = this.f42887m1) == null || g1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        cg.h0 h0Var = this.T0.H;
        if (!z10) {
            i10 = 4;
        }
        h0Var.setVisibility(i10);
    }

    public final void l8(CharSequence charSequence, ArrayList arrayList) {
        if (this.f42880l5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.f42880l5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.f42880l5.isMediaEmpty()) {
                MessageObject messageObject2 = this.f42880l5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                dk dkVar = this.U;
                if (dkVar != null) {
                    this.f42880l5.editingMessage = dkVar.getFieldText();
                    MessageObject messageObject3 = this.f42880l5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.f42880l5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final void l9() {
        UndoView undoView = this.f42989u3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.mc mcVar = this.f43016w3;
        if (mcVar != null) {
            mcVar.c(0L, false);
        }
        al alVar = this.f43002v3;
        if (alVar != null) {
            alVar.e(0, true);
        }
    }

    public final void la(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i11;
        nh.t3 t3Var = this.f42949r1;
        if (t3Var != null && t3Var.R) {
            t3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        nh.t3 t3Var2 = this.f42961s1;
        if (t3Var2 != null && t3Var2.R) {
            t3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new je(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f23612j0) {
            this.f43011vc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f42775d0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar = this.f42737a0;
            if (zVar != null) {
                zVar.f(8);
            }
            vr vrVar = this.Z;
            if (vrVar != null) {
                vrVar.b(false);
            }
            org.telegram.ui.ActionBar.z zVar2 = this.f42788e0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            if ((this.Z3 == 0 || (i11 = this.N3) == 3 || i11 == 8) && (w0Var = this.f42802f0) != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f42838i0;
            if (w0Var3 != null && this.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar3 = this.f42851j0;
            if (zVar3 != null && this.H9) {
                zVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f42814g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f42864k0 = true;
            Fc(0, 0, -1);
            hc(false);
        }
        if ((this.Z3 == 0 || this.f42779d4 || (i10 = this.N3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f42801f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.S4 = z11;
            org.telegram.ui.ActionBar.w0 w0Var5 = this.f42802f0;
            if (w0Var5 != null) {
                w0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f42802f0;
        if (w0Var6 != null) {
            w0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f42927p3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.P5, this.H6, this.classGuid, 0, this.Z3, false, this.f42867k3, this.f42878l3, !TextUtils.isEmpty(str), this.f42889m3);
        yc(0, true);
    }

    public final void lb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.lb(boolean, boolean, boolean):void");
    }

    public final void lc() {
        int i10;
        tj tjVar = this.U2;
        if (tjVar == null) {
            return;
        }
        tjVar.setTranslationX(R8() / 2.0f);
        this.U2.setTranslationY((((this.f42973t0.getTranslationY() + this.f42921o9) + this.f43008v9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f43008v9, -this.U2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.U2.setAlpha(this.f42791e3 * clamp);
        tj tjVar2 = this.U2;
        if (this.f42791e3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        tjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.U2.setScaleX(lerp);
        this.U2.setScaleY(lerp);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        l8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.P5, this.f42856j5, this.T3, null, this.f42831h5, true, false, this.f42880l5, z10, i10, 0, this.N3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, C8(), 0L, false, j10, N8(), this.f42768c5);
        y6();
        if (i10 != 0) {
            if (this.O3 == -1) {
                this.O3 = 0;
            }
            this.O3 = arrayList.size() + this.O3;
            Ec(true);
        }
    }

    public final void m7() {
        float f9;
        org.telegram.ui.Components.gf gfVar;
        float inputBubbleHeight = this.O.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + W8(org.telegram.ui.Components.i21.f29305c) + this.v.c();
        dk dkVar = this.U;
        if (dkVar != null && (gfVar = dkVar.f26137i0) != null) {
            gfVar.setTranslationY(-inputBubbleHeight);
        }
        wj wjVar = this.E1;
        if (wjVar != null) {
            if (wjVar.g()) {
                f9 = AndroidUtilities.dp(5.0f);
            } else {
                f9 = -inputBubbleHeight;
            }
            wjVar.setTranslationY(f9);
        }
    }

    public final void m8(boolean z10) {
        TLRPC.Chat chat = this.f42787e;
        if (chat != null && this.V7 != null && !ChatObject.isNotInChat(chat) && !this.f42787e.creator) {
            TLRPC.ChatFull chatFull = this.V7;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f42947r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f42947r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.V7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.V7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f42947r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f42947r == 0) {
                getMessagesController().checkChatInviter(this.f42787e.f22392id, false);
            }
        }
    }

    public final void m9() {
        boolean z10;
        Fc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f42927p3, this.P5, this.H6, this.classGuid, 0, this.Z3, this.f42867k3, this.f42878l3, this.f42889m3);
        if (TextUtils.isEmpty(this.f42927p3) && this.f42889m3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f42915o3 = z10;
        this.f42864k0 = z10;
        hc(false);
        Ic();
    }

    public final void ma(TLRPC.User user) {
        boolean z10;
        nh.t3 t3Var = this.f42949r1;
        if (t3Var != null && t3Var.R) {
            t3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        nh.t3 t3Var2 = this.f42961s1;
        if (t3Var2 != null && t3Var2.R) {
            t3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new fg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f23612j0) {
            this.f43011vc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f42775d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar = this.f42737a0;
            if (zVar != null) {
                zVar.f(8);
            }
            vr vrVar = this.Z;
            if (vrVar != null) {
                vrVar.b(false);
            }
            org.telegram.ui.ActionBar.z zVar2 = this.f42788e0;
            if (zVar2 != null) {
                zVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f42802f0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f42838i0;
            if (w0Var3 != null && this.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.z zVar3 = this.f42851j0;
            if (zVar3 != null && this.H9) {
                zVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f42814g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f42864k0 = true;
            Fc(0, 0, -1);
            hc(false);
            ImageView imageView = this.O2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.P2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f42802f0;
        if (w0Var5 != null) {
            this.Zb = true;
            this.S4 = false;
            w0Var5.z(false);
            this.Zb = false;
        }
        Za(null, user);
        yc(0, true);
    }

    public final void mb(int i10, int i11, String str) {
        this.H7 = i10;
        this.J7 = true;
        this.K7 = 0L;
        this.L7 = str;
        this.O7 = i11;
        this.I7 = true;
    }

    public final void mc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.W7) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.W7.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.N0 != null) {
            if (z10 && this.P0 == null) {
                li liVar = new li(getParentActivity(), getResourceProvider(), this);
                this.P0 = liVar;
                i7.h6.b(liVar, 0.02f, 1.2f);
                this.P0.setOnClickListener(new ne(this, 12));
            }
            li liVar2 = this.P0;
            if (liVar2 != null) {
                if (!z10) {
                    liVar2.setVisibility(8);
                    return;
                }
                liVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.W7;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.W7.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f42801f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        h01 h01Var = new h01(formatString.substring(indexOf, indexOf2));
                        if (h01Var.f38713c != -1) {
                            h01Var.f38713c = -1;
                            h01Var.invalidateSelf();
                        }
                        h01Var.a(503316480);
                        h01Var.setBounds(0, 0, h01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(h01Var), indexOf, indexOf2, 33);
                    }
                }
                this.P0.setCustomText(spannableStringBuilder);
                this.P0.setOverrideTextMaxWidth(nh.t3.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.P0.getParent() != null && (!z10 || this.P0.getParent() != this.N0)) {
                    ((ViewGroup) this.P0.getParent()).removeView(this.P0);
                }
                if (z10) {
                    ViewParent parent = this.P0.getParent();
                    LinearLayout linearLayout = this.N0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.P0, i7.f6.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final boolean n() {
        return this.f42908n9;
    }

    public final void n7() {
        float c3;
        if (this.f42973t0 != null) {
            if (this.Ka && this.Z9 == null) {
                c3 = AndroidUtilities.navigationBarHeight;
            } else {
                c3 = this.v.c() + W8(org.telegram.ui.Components.i21.f29305c) + AndroidUtilities.dp(16.0f) + this.f43023wa + this.f42923oc;
            }
            int i10 = (int) this.f42921o9;
            org.telegram.ui.Components.m21 m21Var = this.N1;
            if (m21Var != null) {
                m21Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            f2.o0 o0Var = this.f42960s0;
            boolean z10 = this.f42973t0.T1;
            RecyclerView recyclerView = o0Var.f6453a;
            int i11 = (int) c3;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new sf.p1(o0Var, i12, 1));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            sg.d dVar = this.J3;
            if (dVar != null) {
                RectF rectF = dVar.f48037b;
                rectF.set(W8(org.telegram.ui.Components.i21.f29304b), i10 - this.C, 0.0f, c3 - this.f43023wa);
                dVar.f48038c.set(rectF.left, rectF.top, dVar.getMeasuredWidth() - rectF.right, dVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void n8(org.telegram.messenger.MessageObject r61, java.util.ArrayList r62, java.util.ArrayList r63, java.util.ArrayList r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.n8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n9() {
        this.T0.invalidate();
        Iterator it = this.f43037y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void na(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.W0.e(true, false);
            } else if (getMessagesController().isCommunity(j10)) {
                showDialog(new qh.i0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new tn(bundle));
                }
            }
        } else if (j10 != getUserConfig().getClientUserId()) {
            if (j10 == a()) {
                this.W0.e(true, false);
                return;
            }
            Bundle g10 = j7.l1.g(j10, "user_id");
            if (this.h != null && j10 == this.f42801f.f22539id) {
                g10.putLong("dialog_id", this.P5);
            }
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            TLRPC.User user = this.f42801f;
            if (user != null && user.f22539id == j10) {
                i10 = 1;
            }
            profileActivity.N4(i10);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j10);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void nb(long j10) {
        this.Z3 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22413id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void nc() {
        final long j10;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.O0 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.f42787e)) {
            if (this.f42787e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.f42787e.f22392id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f42787e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.f42787e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f22392id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f22392id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(jh.ia.R0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.O0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final tn f42369b;

                    {
                        this.f42369b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                tn.a1(j11, this.f42369b);
                                return;
                            default:
                                tn.t0(j11, this.f42369b);
                                return;
                        }
                    }
                });
                return;
            }
            this.O0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.W7;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.co coVar = this.O0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                coVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.P5))), LocaleController.getString(R.string.MessagePremiumUnlock), new bg.n(11));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.co coVar2 = this.O0;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                coVar2.c(z10, false, AndroidUtilities.replaceTags(jh.ia.R0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.P5), LocaleController.formatNumber(this.W7.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final tn f42369b;

                    {
                        this.f42369b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                tn.a1(j10, this.f42369b);
                                return;
                            default:
                                tn.t0(j10, this.f42369b);
                                return;
                        }
                    }
                });
            } else {
                this.O0.c(false, false, null, null, null);
            }
        } else {
            this.O0.c(false, false, null, null, null);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.N3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((o2Var instanceof tn) && ((tn) o2Var).x9()) {
                return false;
            }
        }
        return this.D6;
    }

    @Override
    public final org.telegram.ui.Components.xn o() {
        return this.W0;
    }

    public final void o7() {
        FrameLayout frameLayout = this.M0;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.O.getInputBubbleHeight() + this.v.b() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int o8() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4 = this.q6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.F7);
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
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.F7) {
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
                        if (Math.abs(i19 - indexOf) > this.Fb + 1 && Math.abs(i20 - i11) > this.Fb + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i17 == i25 || (Math.abs(i17 - indexOf) > this.Fb + 1 && Math.abs(i23 - i11) > this.Fb + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
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
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.F7) {
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
                    if (Math.abs(i33 - i26) >= this.Fb + 1 && Math.abs(i34 - i27) >= this.Fb + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.Fb + 1 && Math.abs(i32 - i27) >= this.Fb + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
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
        if (!this.f43059z9) {
            this.f43059z9 = true;
            km kmVar = this.T0;
            if (kmVar != null) {
                kmVar.invalidate();
            }
            lj ljVar = this.f42973t0;
            if (ljVar != null) {
                ljVar.invalidate();
            }
        }
        UndoView undoView = this.f42989u3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(W8(org.telegram.ui.Components.i21.f29305c) + this.O.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(16.0f));
        }
        v7();
    }

    public final void oa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f42746aa);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().G0(false, false);
            }
            PhotoViewer.t1().f2(arrayList, 0, 0, false, new ll(this, createVideoThumbnail, arrayList), this);
            return;
        }
        l8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.P5, this.f42856j5, this.T3, null, this.f42831h5, null, 0, this.f42880l5, true, 0, 0, false, false, null, C8(), 0L, 0L, N8(), this.f42768c5);
        y6();
    }

    public final void ob(View view) {
        View view2 = this.F8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.v0)) {
                ((org.telegram.ui.Cells.v0) view2).setInvalidateWithParent(null);
            }
            this.F8 = view;
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void oc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.oc(boolean):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        lh.s2 s2Var;
        org.telegram.ui.Components.on onVar;
        String str;
        lh.s2 s2Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (s2Var2 = this.F1) != null) {
                    org.telegram.ui.Components.fi fiVar = s2Var2.f31051u0;
                    if (fiVar instanceof th.p) {
                        th.p pVar = (th.p) fiVar;
                        if (intent != null && intent.getData() != null) {
                            th.p3 p3Var = pVar.f48623r;
                            Uri data = intent.getData();
                            if (data == null) {
                                p3Var.getClass();
                                return;
                            } else if (p3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new sf.o1(5, p3Var, data));
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
                        lh.s2 s2Var3 = this.F1;
                        if (s2Var3 != null) {
                            org.telegram.ui.Components.fi fiVar2 = s2Var3.f31051u0;
                            if (fiVar2 instanceof th.p) {
                                th.p pVar2 = (th.p) fiVar2;
                                if (intent.getData() != null) {
                                    pVar2.f48623r.e2(intent.getData());
                                    return;
                                }
                                return;
                            }
                        }
                        Uri data2 = intent.getData();
                        if (data2.toString().contains("video")) {
                            try {
                                str = AndroidUtilities.getPath(data2);
                            } catch (Exception e10) {
                                FileLog.e(e10);
                                str = null;
                            }
                            if (str == null) {
                                tb();
                            }
                            if (this.f42891m5) {
                                this.f42920o8 = str;
                            } else {
                                oa(null, str);
                            }
                        } else if (this.f42880l5 == null && this.N3 == 1) {
                            org.telegram.ui.Components.c5.M(getParentActivity(), this.P5, new kg.w(14, this, data2), this.f42746aa);
                        } else {
                            l8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.P5, this.f42856j5, this.T3, this.f42831h5, null, null, null, null, 0, this.f42880l5, true, 0, this.N3, C8());
                        }
                        y6();
                        return;
                    }
                    tb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        tb();
                        return;
                    }
                    if (this.f42880l5 == null && this.N3 == 1) {
                        if (intent.getData() != null) {
                            lh.s2 s2Var4 = this.F1;
                            if (s2Var4 != null) {
                                s2Var4.dismiss();
                            }
                            org.telegram.ui.Components.c5.M(getParentActivity(), this.P5, new org.telegram.ui.Components.b5(this) {
                                public final tn f38121b;

                                {
                                    this.f38121b = this;
                                }

                                @Override
                                public final void I(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            tn tnVar = this.f38121b;
                                            tnVar.l8(null, null);
                                            tnVar.gb(intent.getData(), z10, i12);
                                            tnVar.y6();
                                            return;
                                        default:
                                            tn tnVar2 = this.f38121b;
                                            tnVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                tnVar2.gb(clipData.getItemAt(i14).getUri(), z10, i12);
                                            }
                                            tnVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f42746aa);
                            return;
                        } else if (intent.getClipData() != null) {
                            lh.s2 s2Var5 = this.F1;
                            if (s2Var5 != null) {
                                s2Var5.dismiss();
                            }
                            org.telegram.ui.Components.c5.M(getParentActivity(), this.P5, new org.telegram.ui.Components.b5(this) {
                                public final tn f38121b;

                                {
                                    this.f38121b = this;
                                }

                                @Override
                                public final void I(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            tn tnVar = this.f38121b;
                                            tnVar.l8(null, null);
                                            tnVar.gb(intent.getData(), z10, i12);
                                            tnVar.y6();
                                            return;
                                        default:
                                            tn tnVar2 = this.f38121b;
                                            tnVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                tnVar2.gb(clipData.getItemAt(i14).getUri(), z10, i12);
                                            }
                                            tnVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f42746aa);
                            return;
                        } else {
                            tb();
                        }
                    } else {
                        l8(null, null);
                        if (intent.getData() != null) {
                            gb(intent.getData(), true, 0);
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                gb(clipData.getItemAt(i12).getUri(), true, 0);
                            }
                        } else {
                            tb();
                        }
                    }
                    lh.s2 s2Var6 = this.F1;
                    if (s2Var6 != null) {
                        s2Var6.dismiss();
                    }
                    y6();
                    return;
                } else if (i10 == 28 && (s2Var = this.F1) != null && (onVar = s2Var.f31014i0) != null) {
                    org.telegram.ui.ActionBar.c6 c6Var = onVar.f28402a;
                    if (onVar.f31413g1 != -1 && onVar.f31411f1 != null) {
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
                            org.telegram.messenger.x3.s(R.string.UnsupportedAttachment, new org.telegram.ui.Components.tc(onVar.f28403b.container, c6Var), c6Var);
                            return;
                        }
                        onVar.e0(onVar.f31413g1, new ch.c(uri));
                        org.telegram.ui.Components.xm xmVar = onVar.f31411f1;
                        if (xmVar != null) {
                            xmVar.dismiss(true);
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
            lh.s2 s2Var7 = this.F1;
            if (s2Var7 != null) {
                s2Var7.f31005f0.g0(i10, intent, this.R7);
            }
            this.R7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        xk xkVar;
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.Components.jf jfVar;
        org.telegram.ui.Components.gf gfVar;
        lm lmVar;
        kg.u uVar;
        org.telegram.ui.Components.mc mcVar = org.telegram.ui.Components.mc.f30644w;
        if (mcVar != null) {
            org.telegram.ui.Components.rb rbVar = mcVar.f30648e;
            if (rbVar instanceof org.telegram.ui.Components.xb) {
                if (z10) {
                    ((org.telegram.ui.Components.xb) rbVar).f();
                    mcVar.b();
                    return false;
                }
                return false;
            }
        }
        f41 f41Var = this.V9;
        if (f41Var != null && !f41Var.X) {
            if (z10) {
                f41Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            kg.v vVar = this.U9;
            if (vVar != null && (uVar = vVar.f13871b) != null && uVar.getReactionsWindow() != null) {
                if (z10) {
                    vVar.f13871b.e();
                    return false;
                }
            } else if (ht.q().E) {
                if (z10) {
                    ht.q().o();
                    return false;
                }
            } else {
                zk zkVar = this.Aa;
                if (zkVar != null && zkVar.f32256s) {
                    if (z10) {
                        zkVar.a(true);
                        return false;
                    }
                } else if (this.f42998uc.f49506f) {
                    if (z10) {
                        Lb(false);
                        return false;
                    }
                } else if (this.M8 != null) {
                    if (z10) {
                        A7(true);
                        return false;
                    }
                } else if (!X6(z10, false)) {
                    if (b9()) {
                        if (z10 && (lmVar = this.Y8) != null && lmVar.y()) {
                            this.Y8.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.l lVar = this.actionBar;
                        if (lVar != null && lVar.s()) {
                            if (z10) {
                                z7(false);
                                return false;
                            }
                        } else {
                            dk dkVar = this.U;
                            if (dkVar != null && dkVar.t0()) {
                                if (z10) {
                                    this.U.m0(true);
                                    return false;
                                }
                            } else {
                                dk dkVar2 = this.U;
                                if (dkVar2 != null && dkVar2.v()) {
                                    if (z10) {
                                        dk dkVar3 = this.U;
                                        ph.z zVar = dkVar3.f26131h0;
                                        if (zVar != null) {
                                            zVar.setOpened(false);
                                        }
                                        if (!dkVar3.j0() && (gfVar = dkVar3.f26137i0) != null) {
                                            gfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    dk dkVar4 = this.U;
                                    if (dkVar4 == null || (jfVar = dkVar4.A0) == null || !jfVar.closeCreationLinkDialog(z10)) {
                                        if (this.N3 == 6 && (c2Var = sf.r.d) != null && c2Var.isShowing()) {
                                            if (z10) {
                                                sf.r.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.f42787e) && !this.P3 && this.N1 != null && b() != 0) {
                                            if (z10) {
                                                this.N1.m(0L, this.f42882l7);
                                                return false;
                                            }
                                        } else if (this.N3 == 5 && !"hello".equalsIgnoreCase(this.M3) && !"away".equalsIgnoreCase(this.M3) && (this.q6.isEmpty() || this.Z3 == 0)) {
                                            if (z10) {
                                                Qb();
                                                return false;
                                            }
                                        } else if (this.N3 == 6 && this.U.w()) {
                                            if (z10) {
                                                wb(new df(this, 19));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                                            if (lVar2 != null && lVar2.f23612j0) {
                                                if (z10) {
                                                    lVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f42972sc.f49506f) {
                                                if (z10) {
                                                    ta();
                                                }
                                            } else {
                                                if (z10 && (xkVar = this.X2) != null) {
                                                    xkVar.d(false);
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
        k9();
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.q6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.f42787e)))) {
                    org.telegram.ui.Components.t21.u(messageObject, false);
                }
            }
        }
        this.B3 = false;
        l9();
        ArrayList arrayList2 = org.telegram.ui.Components.t21.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ye.c cVar = this.f43024wb;
        if (cVar != null) {
            cVar.a(false);
            this.f43024wb = null;
        }
        this.A3.detach();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.B3 = true;
        super.onBecomeFullyVisible();
        if (this.K) {
            showDialog(this.J);
        }
        if (this.f42747ab) {
            dk dkVar = this.U;
            if (dkVar != null) {
                dkVar.I0();
                dk dkVar2 = this.U;
                dkVar2.P0 = false;
                org.telegram.ui.Components.xf xfVar = dkVar2.Q0;
                if (xfVar != null) {
                    xfVar.u(false);
                }
            }
            this.f42747ab = false;
        }
        if (this.f42949r1 != null) {
            AndroidUtilities.runOnUIThread(new ee(this, 1), 600L);
        }
        if (this.f42903n4 && !this.f42916o4) {
            this.f42916o4 = true;
            org.telegram.ui.Components.mc M = org.telegram.ui.Components.tc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f30652j = 5000;
            M.v = new ee(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        kg.v vVar = this.U9;
        if (vVar != null && vVar.d()) {
            this.U9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j10;
        long j11;
        gj gjVar = this.W0;
        if (gjVar != null) {
            gjVar.getViewTreeObserver().addOnPreDrawListener(new vh(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        A7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C1() || !PhotoViewer.t1().Q1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f42746aa);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i10 = playingMessageObject.type;
                    long j12 = 0;
                    if (i10 != 0) {
                        j10 = this.P5;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = this.H6;
                    } else {
                        j11 = 0;
                    }
                    if (i10 != 0) {
                        j12 = b();
                    }
                    if (t12.e2(playingMessageObject, null, null, null, null, null, null, 0, this.Ba, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.t1().f35715h4 = this;
                    }
                    h9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.C1() && PhotoViewer.t1().f35713h2) {
                PhotoViewer t13 = PhotoViewer.t1();
                if (t13.B2.z()) {
                    if (t13.V2) {
                        t13.B2.O(false);
                    }
                    MediaController.getInstance().injectVideoPlayer(t13.B2, t13.P4);
                    t13.B2 = null;
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
        ek ekVar = this.S9;
        float f9 = 0.0f;
        if (z10 && this.N9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var instanceof tn) {
                this.f43054z4 = true;
                tn tnVar = (tn) o2Var;
                tnVar.P9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.T0.setSkipBackgroundDrawing(true);
                this.W0.setTranslationY(AndroidUtilities.dp(8.0f));
                this.W0.getAvatarImageView().setAlpha(0.0f);
                this.W0.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.O9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                dk dkVar = this.U;
                if (dkVar != null) {
                    dkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                hk hkVar = this.N;
                if (hkVar != null) {
                    hkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                dk dkVar2 = this.U;
                if (dkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = dkVar2.getMeasuredHeight();
                }
                hk hkVar2 = this.N;
                if (hkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = hkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                dk dkVar3 = tnVar.U;
                if (dkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = dkVar3.getMeasuredHeight();
                }
                hk hkVar3 = this.N;
                if (hkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = hkVar3.getMeasuredHeight();
                }
                this.K9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new bg.b3(7, this, tnVar));
                jc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.R9 = animatorSet;
                animatorSet.addListener(new bg.m0(this, tnVar, runnable));
                this.R9.setDuration(300L);
                this.R9.setInterpolator(org.telegram.ui.Components.jr.f29800f);
                this.R9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(ekVar, 200L);
                return this.R9;
            }
        }
        if (this.f42811fa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var2 instanceof ze1) {
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
                    f9 = 1.0f;
                }
                this.f42836ha = f9;
                ofFloat.addUpdateListener(new ti(0, this));
                this.f42824ga = true;
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.invalidate();
                }
                km kmVar = this.T0;
                if (kmVar != null) {
                    kmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.R9 = animatorSet2;
                animatorSet2.addListener(new vi(this, z10, runnable));
                this.R9.setDuration(150L);
                this.R9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(ekVar, 200L);
                } else {
                    this.R9.start();
                }
                return this.R9;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.c2 c2Var = this.J;
        if (c2Var != null && dialog == c2Var) {
            getMessagesController().deleteDialog(this.P5, 0);
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && !b5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.iu0 iu0Var;
        super.onFragmentDestroy();
        sg.d dVar = this.J3;
        if (dVar != null) {
            LongSparseArray longSparseArray = dVar.f48044w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                sg.c cVar = (sg.c) longSparseArray.valueAt(i10);
                if (cVar.f48031i) {
                    dVar.v.add(cVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                f5.a.n("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            dVar.a();
        }
        dk dkVar = this.U;
        if (dkVar != null) {
            dkVar.B0();
        }
        gj gjVar = this.W0;
        if (gjVar != null && (iu0Var = gjVar.V) != null) {
            iu0Var.b(gjVar.C);
        }
        wj wjVar = this.E1;
        if (wjVar != null && wjVar.getAdapter() != null) {
            this.E1.getAdapter().P();
        }
        lh.s2 s2Var = this.F1;
        if (s2Var != null) {
            s2Var.dismissInternal();
        }
        ht q6 = ht.q();
        if (q6.f39032l == this.f42823g9) {
            q6.W = null;
            q6.f39019a0 = null;
            q6.Y = null;
            q6.f39032l = null;
            q6.f39023c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.B9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.C9);
        getNotificationCenter().onAnimationFinish(this.D9);
        getNotificationCenter().onAnimationFinish(this.E9);
        l9();
        ee eeVar = this.H5;
        if (eeVar != null) {
            AndroidUtilities.cancelRunOnUIThread(eeVar);
            this.H5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f42861ja);
        MessagesController messagesController = getMessagesController();
        long j10 = this.P5;
        if (this.N3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j10, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.Na;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Na = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.Oa;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.Oa = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.N3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.P5), Long.valueOf(b()), Boolean.TRUE);
        }
        if (this.f42801f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.A3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f42801f != null) {
            getMessagesController().cancelLoadFullUser(this.f42801f.f22539id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        lh.s2 s2Var2 = this.F1;
        if (s2Var2 != null) {
            s2Var2.v1();
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.f42787e)) {
            getMessagesController().startShortPoll(this.f42787e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.V7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.V7.linked_chat_id)), this.classGuid, true);
            }
        }
        lm lmVar = this.Y8;
        if (lmVar != null) {
            lmVar.f(false);
        }
        nj njVar = this.f42986u0;
        if (njVar != null) {
            njVar.N();
        }
        mk mkVar = this.f42970sa;
        if (mkVar != null) {
            mkVar.b();
        }
        this.X9 = null;
        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Kc ? 1 : 0);
            org.telegram.ui.ActionBar.b5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.k9) parentLayout2.getPulledDialogs().get(i11)).f29970b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Kc = false;
        ye.c cVar2 = this.f43024wb;
        if (cVar2 != null) {
            cVar2.a(false);
            this.f43024wb = null;
        }
        this.f42772ca.onFragmentDestroy();
        k01 k01Var = this.Y7;
        if (k01Var != null) {
            k01Var.b(true);
            this.Y7 = null;
        }
        jh.m5 m5Var = this.f42897mc;
        if (m5Var != null) {
            m5Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f42897mc);
            this.f42897mc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f42825gb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f42968s8, null, null, false);
        }
        jh.m5 m5Var = this.f42897mc;
        if (m5Var != null) {
            m5Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f42897mc);
            this.f42897mc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        lh.s2 s2Var;
        org.telegram.ui.Components.bl blVar;
        lh.s2 s2Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ni niVar;
        dk dkVar = this.U;
        boolean z12 = false;
        if (dkVar != null && i10 == 2 && dkVar.f26115e3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(dkVar.M).sendCurrentLocation(dkVar.f26108d3, dkVar.f26115e3);
            }
            dkVar.f26115e3 = null;
            dkVar.f26108d3 = null;
        }
        wj wjVar = this.E1;
        if (wjVar != null && wjVar.getAdapter() != null) {
            rf.v0 adapter = this.E1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f47385s0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.E0.start();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i10 == 4) {
            lh.s2 s2Var3 = this.F1;
            if (s2Var3 != null) {
                s2Var3.f31005f0.Y();
            }
            org.telegram.ui.Components.gp gpVar = this.X9;
            if (gpVar != null && (niVar = gpVar.U) != null) {
                niVar.f31005f0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (s2Var = this.F1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                s2Var.D1();
            } else if (i10 == 30 && (blVar = s2Var.f31020k0) != null && s2Var.f31051u0 == blVar && s2Var.isShowing()) {
                s2Var.f31020k0.Y();
            }
        } else if ((i10 == 17 || i10 == 18) && (s2Var2 = this.F1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = s2Var2.f31005f0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.F1.f31005f0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f42746aa);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new nh(this));
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(2);
        } else if (((i10 != 101 && i10 != 102) || this.f42801f == null) && (i10 != 103 || this.f42787e == null)) {
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
                    org.telegram.ui.Components.voip.h2.m(this.f42787e, null, this.U7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f42801f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.W7;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.h2.n(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f42801f.f22539id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.h2.i(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        dk dkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.t9[] t9VarArr;
        bg.x2 x2Var;
        super.onResume();
        d7();
        this.A9 = System.currentTimeMillis();
        if (this.f42908n9 && getSendMessagesHelper().getImportingHistory(this.P5) != null) {
            org.telegram.ui.Components.u40 u40Var = new org.telegram.ui.Components.u40(getParentActivity(), null, this, this.f42746aa);
            u40Var.setOnHideListener(new xf(this, 8));
            showDialog(u40Var);
            this.f42908n9 = false;
        }
        H6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        W6();
        lh.s2 s2Var = this.F1;
        if (s2Var != null) {
            s2Var.y1();
        }
        km kmVar = this.T0;
        boolean z12 = true;
        if (kmVar != null) {
            org.telegram.ui.Components.c81 c81Var = kmVar.v;
            if (c81Var != null) {
                c81Var.c(true);
            }
            kmVar.B = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new ee(this, 24), 1000L);
        }
        w8 w8Var = new w8(this, 2);
        this.Vb = w8Var;
        setBulletinDelegate(w8Var);
        G6(false);
        TLRPC.PhotoSize photoSize = this.f42965s5;
        if (photoSize != null && (x2Var = this.W) != null) {
            ((org.telegram.ui.Components.ko[]) x2Var.f2608b)[0].f30116f.k(ImageLocation.getForObject(photoSize, this.f42991u5), "50_50", ImageLocation.getForObject(this.f42978t5, this.f42991u5), "50_50_b", this.f42942q5, null, this.f42856j5, this.f42953r5);
        }
        if (this.f43043y5 != null && (t9VarArr = this.f43029x2) != null) {
            t9VarArr[0].k(ImageLocation.getForObject(this.f43043y5, this.A5), "50_50", ImageLocation.getForObject(this.f43055z5, this.A5), "50_50_b", this.f43004v5, null, (MessageObject) this.F4.get(Integer.valueOf(this.H4)), this.f43018w5);
            t9VarArr[0].setHasBlur(this.f43031x5);
        }
        if (this.N3 == 0) {
            getNotificationsController().setOpenedDialogId(this.P5, b());
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.P5;
        if (this.N3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j10, z10, true);
        if (this.M5) {
            if (this.O5 && (messageObject = this.G7) != null) {
                if (this.f42973t0 != null) {
                    int i10 = this.P7;
                    if (i10 == -9000) {
                        i10 = K8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f42999v0.i1(this.q6.indexOf(this.G7) + this.f43013w0.F, i10, z11);
                    }
                    z11 = false;
                    this.f42999v0.i1(this.q6.indexOf(this.G7) + this.f43013w0.F, i10, z11);
                }
            } else {
                O9(false);
            }
            this.O5 = false;
            this.M5 = false;
            this.G7 = null;
        }
        this.f42891m5 = false;
        this.f42904n5 = false;
        a7(false);
        if (this.f42917o5) {
            this.f42917o5 = false;
            em emVar = this.f43013w0;
            if (emVar != null) {
                emVar.O(false);
            }
        }
        gj gjVar = this.W0;
        if (gjVar != null) {
            gjVar.getViewTreeObserver().addOnPreDrawListener(new vh(this, 0));
        }
        A6(false, false);
        if (this.U != null && this.N3 == 0 && this.f42798ea != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.P5 && (arrayList2 = this.f42798ea.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new z70(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f42798ea.entities;
            }
            CharSequence r6 = ChatActivityEnterView.r(arrayList, this.f42798ea.message, this.U.getEditField().getPaint().getFontMetricsInt());
            if (r6 != null && r6.length() > 0 && r6.charAt(0) == '@') {
                r6 = TextUtils.concat(" ", r6);
            }
            this.U.f1(r6, true);
            this.f42798ea = null;
        }
        ik ikVar = this.K0;
        if (ikVar != null && ikVar.getVisibility() != 0 && !this.actionBar.f23612j0 && this.N3 != 7 && !org.telegram.ui.ActionBar.o2.hasSheets(this)) {
            this.U.setFieldFocused(true);
        }
        dk dkVar2 = this.U;
        if (dkVar2 != null) {
            dkVar2.E0();
        }
        if (this.f42801f != null) {
            this.f42883l8 = System.currentTimeMillis();
            this.f42894m8 = 0L;
        }
        if (this.f42920o8 != null) {
            AndroidUtilities.runOnUIThread(new ee(this, 3));
        }
        if (this.f42973t0 != null && ((dkVar = this.U) == null || !dkVar.r0())) {
            this.f42973t0.setOnItemLongClickListener(this.Fa);
            this.f42973t0.setOnItemClickListener(this.Ga);
            this.f42973t0.setLongClickable(true);
        }
        org.telegram.ui.Components.x41.h = false;
        TLRPC.User user = this.f42801f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.x41.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.V7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.V7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.V7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.x41.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                org.telegram.ui.Components.x41.h = (chatFull.bot_info.isEmpty() || (chat = this.f42787e) == null || !chat.megagroup) ? false : false;
            }
        }
        Nc(false);
        Ib();
        if (this.J9 != 0.0f) {
            this.J9 = 0.0f;
            this.f42973t0.invalidate();
        }
        this.A3.attach();
        jh.m5 m5Var = this.f42897mc;
        if (m5Var != null) {
            m5Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.ld ldVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.K5) {
                this.K5 = true;
                uc();
            }
            iArr = this.B9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.J5 = false;
            if (!z11) {
                this.L5 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f42801f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            dk dkVar = this.U;
            if (dkVar != null && (ldVar = dkVar.N1) != null) {
                AndroidUtilities.cancelRunOnUIThread(ldVar);
                dkVar.N1 = null;
            }
        }
        d7();
        this.B9 = getNotificationCenter().setAnimationInProgress(this.B9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f42779d4) {
            if (this.f42801f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f42801f.f22539id));
                if (user != null) {
                    this.f42801f = user;
                } else {
                    return;
                }
            } else if (this.f42787e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f42787e.f22392id));
                if (chat != null) {
                    this.f42787e = chat;
                } else {
                    return;
                }
            }
            gj gjVar = this.W0;
            if (gjVar != null) {
                gjVar.b();
            }
        }
    }

    public final void p7() {
        int i10;
        float f9 = this.f43025wc.f49505e;
        org.telegram.ui.Components.b40 b40Var = this.f42925p1;
        int i11 = 8;
        if (b40Var != null) {
            b40Var.setAlpha(f9);
            org.telegram.ui.Components.b40 b40Var2 = this.f42925p1;
            if (f9 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            b40Var2.setVisibility(i10);
        }
        jh.e1 e1Var = this.H3;
        if (e1Var != null) {
            float f10 = 1.0f - f9;
            e1Var.setAlpha(f10);
            jh.e1 e1Var2 = this.H3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            e1Var2.setVisibility(i11);
        }
    }

    public final void p9() {
        boolean z10;
        Rect rect;
        if (this.T0 != null) {
            if (this.Qa <= 0 && this.Ra <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            ah.i iVar = this.v;
            float b10 = iVar.b();
            vd.l lVar = iVar.f750b;
            int max = (int) Math.max(0.0f, (b10 * lVar.f49531a) - AndroidUtilities.dp(29.0f));
            km kmVar = this.T0;
            cg.h0 h0Var = kmVar.H;
            Rect rect2 = this.Cc;
            if (h0Var != null) {
                rect2.set(0, 0, kmVar.getMeasuredWidth(), this.T0.getMeasuredHeight() - max);
                this.T0.H.setClipBounds(rect2);
            }
            if (this.f42973t0 != null) {
                rect2.set(0, 0, this.T0.getMeasuredWidth(), this.T0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f42973t0.getTop());
                lj ljVar = this.f42973t0;
                if (ljVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                ljVar.setClipBounds(rect);
            }
            if (this.T != null) {
                rect2.set(0, 0, this.T0.getMeasuredWidth(), this.T0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(iVar.v, iVar.b() * lVar.f49531a) - AndroidUtilities.dp(29.0f))));
                ug.f fVar = this.T;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void pa() {
        this.K5 = true;
        this.fragmentBeginToShow = true;
        this.R9 = null;
        this.T0.invalidate();
        this.T0.setSkipBackgroundDrawing(false);
        this.O9 = false;
        this.fragmentView.setAlpha(1.0f);
        this.W0.setTranslationY(0.0f);
        this.W0.getAvatarImageView().setScaleX(1.0f);
        this.W0.getAvatarImageView().setScaleY(1.0f);
        this.W0.getAvatarImageView().setAlpha(1.0f);
    }

    public final void pb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.Y3 = tL_forumTopic;
        this.W3 = arrayList;
        MessageObject messageObject = (MessageObject) j7.l1.i(1, arrayList);
        this.T3 = messageObject;
        this.f42856j5 = messageObject;
        this.f42818g4 = i11;
        this.f42830h4 = i12;
        this.f42842i4 = Math.max(1, i11);
        this.Z3 = this.T3.getId();
        this.f42740a4 = i10;
        this.f42754b4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42779d4 = z10;
        MessageObject messageObject2 = this.f42856j5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42767c4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        zc();
        Qc(false);
        hc(false);
    }

    public final void pc() {
        MessageObject messageObject;
        if (this.f42801f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                lj ljVar = this.f42973t0;
                if (ljVar != null) {
                    int childCount = ljVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f42973t0.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.s1) {
                            messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f42883l8, this.f42894m8, this.f42801f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f9 = SecretMediaViewer.f();
            MessageObject messageObject2 = f9.f36190d0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f9.G, f9.H, this.f42801f, null, null, messageObject2.getId());
            }
        }
    }

    public final void q7() {
        if (this.T0 == null) {
            return;
        }
        this.f42923oc = C6(false);
        this.f42936pc = C6(true);
        this.O.setInputBubbleHeight(this.f42923oc);
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
    }

    public final org.telegram.ui.Cells.a0 q8(int i10, boolean z10) {
        MessageObject messageObject;
        lj ljVar = this.f42973t0;
        if (ljVar != null) {
            int childCount = ljVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f42973t0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f42921o9 - this.q9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f42973t0.getMeasuredHeight() - this.f43023wa) {
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

    public final void q9(int i10) {
        tn tnVar = this.Z9;
        if (tnVar != null) {
            tnVar.q9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.B != null) {
            jf.e0 e0Var = this.f43062zc;
            if (e0Var.f11581c == 0) {
                e0Var.invalidate();
            }
            e0Var.f11581c = i10 | e0Var.f11581c;
        }
    }

    public final void qa(long j10, boolean z10) {
        if (this.N1 != null && UserObject.isBotForum(this.f42801f)) {
            this.N1.setAllTopicsHidden(true);
        }
        this.I5.put(j10, 1);
        Q7();
        UndoView undoView = this.f42989u3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.P5, 0, new jh.oa(this, j10, z10, 5), new eg.z0(this, j10, 4));
        this.f43013w0.O(false);
    }

    public final void qb() {
        AndroidUtilities.shakeViewSpring(this.f42973t0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        dk dkVar = this.U;
        for (int i10 = 0; i10 < dkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(dkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.l actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void qc(MessageObject messageObject, boolean z10) {
        if (this.f43013w0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new jh.r5(this, messageObject, z10, 9));
    }

    @Override
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.f42958rc.a(false, true);
        MessageObject messageObject = this.f42880l5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.f42880l5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f42768c5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.f42880l5.messageOwner.suggested_post);
            }
            if (!jh.s7.U(this.currentAccount, messageSuggestionParams.amount)) {
                Tb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            ee eeVar = new ee(this, 21);
            this.f42893m7 = eeVar;
            AndroidUtilities.runOnUIThread(eeVar, 3000L);
        }
        l8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.c5.b0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l10 = (Long) obj;
                tn tnVar = tn.this;
                MessageObject messageObject2 = tnVar.f42880l5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = tnVar.f42768c5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(tnVar.f42880l5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(tnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, tnVar.P5, tnVar.f42880l5, tnVar.T3, null, tnVar.f42831h5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, tnVar.C8(), photoEntry2.effectId, l10.longValue(), tnVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(tnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, tnVar.P5, tnVar.f42880l5, tnVar.T3, null, tnVar.f42831h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, tnVar.C8(), photoEntry2.effectId, l10.longValue(), tnVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(tnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, tnVar.P5, tnVar.f42880l5, tnVar.T3, null, tnVar.f42831h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, tnVar.C8(), photoEntry2.effectId, l10.longValue(), tnVar.N8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(tnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, tnVar.P5, tnVar.f42856j5, tnVar.T3, null, tnVar.f42831h5, photoEntry2.entities, photoEntry2.ttl, tnVar.f42880l5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, tnVar.C8(), photoEntry2.effectId, l10.longValue(), tnVar.N8(), tnVar.f42768c5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(tnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, tnVar.P5, tnVar.f42856j5, tnVar.T3, null, tnVar.f42831h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, tnVar.f42880l5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, tnVar.C8(), photoEntry2.effectId, l10.longValue(), tnVar.N8(), tnVar.f42768c5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(tnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, tnVar.P5, tnVar.f42856j5, tnVar.T3, null, tnVar.f42831h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, tnVar.f42880l5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, tnVar.C8(), photoEntry2.effectId, l10.longValue(), tnVar.N8(), tnVar.f42768c5);
                }
                tnVar.y6();
            }
        }, j10);
    }

    public final void r7() {
        int i10;
        tn tnVar = this.Z9;
        if (tnVar != null) {
            tnVar.r7();
        }
        int i11 = AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + i11 + ((int) V8(AndroidUtilities.dp(7.0f)));
        pk pkVar = this.f42865k1;
        if (pkVar != null) {
            i10 = AndroidUtilities.dp(pkVar.A * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(z8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.c());
        jh.e1 e1Var = this.H3;
        if (e1Var != null) {
            e1Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.b40 b40Var = this.f42925p1;
        if (b40Var != null) {
            b40Var.f26975e.setPadding(0, dp2, 0, dp3);
            b40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        sg.e eVar = this.G3;
        if (eVar != null) {
            ug.f fVar = eVar.f48047a;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.p00 p00Var = this.Y1;
        if (p00Var != null) {
            p00Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.qw0 qw0Var = this.Z1;
        if (qw0Var != null) {
            qw0Var.f32119a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final void r8() {
        if (this.f42821g7) {
            return;
        }
        this.f42821g7 = true;
        getMessagesController().checkSensitive(this, this.P5, new ee(this, 26), new df(this, 19));
    }

    public final void r9() {
        this.f42909na = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean ra() {
        if (this.D4.size() != 1 || this.U3 == null || ((Integer) this.D4.get(0)).intValue() != this.U3.getId()) {
            return false;
        }
        return true;
    }

    public final void rb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f42746aa);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        TLRPC.User user = this.f42801f;
        if (user != null) {
            if (user.bot) {
                c2Var.P = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String k9 = org.telegram.messenger.x3.k(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, qe.b.c());
                TLRPC.User user2 = this.f42801f;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, k9, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            c2Var.P = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new e3.d(this, i10, messageObject, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void rc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.f43013w0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f42979t6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                nj njVar = this.f42986u0;
                if (njVar != null) {
                    njVar.V(groupedMessages);
                }
                for (int i10 = 0; i10 < groupedMessages.messages.size(); i10++) {
                    groupedMessages.messages.get(i10).forceUpdate = true;
                    if (z10) {
                        groupedMessages.messages.get(i10).reactionsChanged = true;
                    }
                }
                this.f43013w0.O(true);
                return;
            }
            MessageObject messageObject3 = (MessageObject) this.f42870k6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.f43013w0.J) {
                a0.h hVar = this.Va;
                if (hVar != null) {
                    messageObject2 = (MessageObject) hVar.f(messageObject.getId());
                } else {
                    messageObject2 = null;
                }
                int indexOf = this.f43013w0.L.indexOf(messageObject2);
                if (messageObject2 != null && z10) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                }
                if (indexOf >= 0) {
                    em emVar = this.f43013w0;
                    emVar.m(emVar.F + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.q6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                em emVar2 = this.f43013w0;
                emVar2.m(emVar2.F + indexOf2);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.R7 = bundle.getString("path");
    }

    public final void s6(MessageObject messageObject, Integer num) {
        MessageObject messageObject2 = messageObject.replyMessageObject;
        if (messageObject2 != null) {
            int id2 = messageObject2.getId();
            SparseArray sparseArray = this.f42892m6;
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
        float f9 = (1.0f - this.f42998uc.f49505e) * (1.0f - this.f42972sc.f49505e);
        this.f42803f1.setTranslationX((1.0f - f9) * AndroidUtilities.dp(80.0f));
        this.f42803f1.setAlpha(f9);
        ug.g gVar = this.f42803f1;
        if (f9 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gVar.setVisibility(i10);
    }

    public final boolean s8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f42973t0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f42973t0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.s1) && (currentMessagesGroup = ((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.q6.indexOf((MessageObject) j7.l1.i(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        em emVar = this.f43013w0;
                        emVar.q(indexOf + emVar.F, currentMessagesGroup.messages.size());
                        this.f42973t0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            th.y(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && !b5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(z10));
        return false;
    }

    public final void s9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f42801f) != null && user.contact_require_premium) {
            boolean isEmpty = this.q6.isEmpty();
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

    public final boolean sa() {
        ArrayList<MessageObject> arrayList;
        dk dkVar = this.U;
        if (dkVar != null && dkVar.w0()) {
            return true;
        }
        ArrayList arrayList2 = this.q6;
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

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        df dfVar = this.ma;
        if (dfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(dfVar);
        }
        dk dkVar = this.U;
        if (dkVar != null && this.T0 != null && dkVar.getAdjustPanLayoutHelper() != null && !this.U.getAdjustPanLayoutHelper().f23740f) {
            this.f42885la = this.T0.getKeyboardHeight();
        } else {
            this.f42885la = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.R7;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean sb() {
        if (v9() && this.f42856j5 == null && this.f42880l5 == null) {
            if (this.N3 != 8 && v9() && this.f42787e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f42787e.f22392id, 1L);
                if (this.N3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.f42787e, findTopic)) {
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

    public final void sc() {
        org.telegram.ui.ActionBar.o1 o1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        lj ljVar = this.f42973t0;
        wj wjVar = this.E1;
        if ((wjVar != null && wjVar.E) || ((o1Var = this.M8) != null && o1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        ljVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            org.telegram.ui.ActionBar.a0 n10 = lVar.n();
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
        long j10;
        org.telegram.ui.ActionBar.h2 h2Var;
        float f9;
        float f10;
        dk dkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f42801f != null && this.f42851j0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f42801f.f22539id);
            if (userFull != null && userFull.phone_calls_available) {
                this.H9 = !this.inPreviewMode;
                this.f42851j0.f(0);
            } else {
                this.H9 = false;
                this.f42851j0.f(8);
            }
        }
        gj gjVar = this.W0;
        float f12 = 0.0f;
        if (gjVar != null) {
            gjVar.setOccupyStatusBar(!z10);
            gj gjVar2 = this.W0;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            gjVar2.setLayoutParams(i7.f6.d(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        dk dkVar2 = this.U;
        if (dkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            dkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.fy0 fy0Var = this.Z0;
        if (fy0Var != null) {
            if (this.V4 && !z10 && ((dkVar = this.U) == null || !dkVar.f26201u3)) {
                i11 = 0;
            }
            fy0Var.setVisibility(i11);
        }
        wj wjVar = this.E1;
        if (wjVar != null) {
            ViewPropertyAnimator animate = wjVar.animate();
            if (!this.U.f26201u3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.jr.f29800f).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            if (!z10) {
                h2Var = new org.telegram.ui.ActionBar.h2(false);
            } else {
                h2Var = null;
            }
            lVar.setBackButtonDrawable(h2Var);
            org.telegram.ui.ActionBar.w0 w0Var = this.f42775d0;
            if (w0Var != null) {
                if (!z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                w0Var.setAlpha(f9);
            }
            org.telegram.ui.ActionBar.z zVar = this.f42737a0;
            if (zVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                zVar.f24000i = f12;
                org.telegram.ui.ActionBar.w0 w0Var2 = zVar.f24004m;
                if (w0Var2 != null) {
                    w0Var2.setAlpha(f12);
                }
            }
        }
        lj ljVar = this.f42973t0;
        if (ljVar != null) {
            int childCount = ljVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f42973t0.getChildAt(i12);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.s1;
                if (z14) {
                    messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i13 = this.f42832h6 - 1;
                        this.f42832h6 = i13;
                        if (i13 <= 0) {
                            this.f42832h6 = 0;
                            this.f42844i6 = true;
                            Kb(false);
                        } else {
                            this.f42803f1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.f42787e)) {
                            j10 = this.f42787e.f22392id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j10, this.P5);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        s1Var.setHighlighted(false);
                        s1Var.O3();
                    }
                }
            }
            this.f42973t0.setItemAnimator(null);
        }
        hc(false);
        Kc();
        yj yjVar = this.T1;
        if (yjVar != null) {
            if (!z10 && !this.Ka) {
                z12 = true;
            } else {
                z12 = false;
            }
            yjVar.setEnabled(z12);
        }
        yj yjVar2 = this.V1;
        if (yjVar2 != null) {
            if (!z10 && !this.Ka) {
                z11 = true;
            } else {
                z11 = false;
            }
            yjVar2.setEnabled(z11);
        }
        bl blVar = this.f42975t2;
        if (blVar != null) {
            blVar.setEnabled(!isInPreviewMode());
        }
        km kmVar = this.T0;
        if (kmVar != null) {
            kmVar.setOccupyStatusBar((this.inBubbleMode || this.Ka || this.inPreviewMode) ? false : false);
        }
    }

    public final void t6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.t6():void");
    }

    public final void t7() {
        tn tnVar = this.Z9;
        if (tnVar != null) {
            tnVar.t7();
        }
        float V8 = V8(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.N1 != null) {
            V8 += W8(org.telegram.ui.Components.i21.f29303a);
        }
        if (this.f42865k1 != null) {
            V8 += AndroidUtilities.dp(35.0f) * this.f42865k1.A;
        }
        this.T.setFadeZoneTop((int) ((z8() * AndroidUtilities.dp(43.0f)) + V8));
    }

    public final void t8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j10) {
        boolean z13;
        if (!arrayList.isEmpty() && f7()) {
            boolean z14 = false;
            if (i10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.N3 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.k9 = true;
                em emVar = this.f43013w0;
                if (emVar != null) {
                    emVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.P5, z10, z11, z12, i10, 0, this.T3, -1, j10, N8(), this.f42768c5);
            org.telegram.ui.Components.c5.t0(sendMessage, this, this.f42746aa);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new df(this, 24));
            }
        }
    }

    public final boolean t9() {
        if (this.N1 != null && this.Z3 == 0) {
            return true;
        }
        return false;
    }

    public final void ta() {
        org.telegram.ui.Cells.s1 s1Var;
        this.f42972sc.a(false, true);
        bh.f fVar = this.f43049yc;
        if (fVar != null && (s1Var = fVar.f2659n) != null && s1Var.getDelegate() != null) {
            fVar.f2659n.getDelegate().F1(fVar.f2659n, false);
        }
        dk dkVar = this.U;
        if (dkVar != null) {
            dkVar.V0(true, true, false);
            this.U.P4 = null;
        }
    }

    public final void tb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.tc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f42746aa).j();
    }

    public final void tc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f43013w0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    public final void u6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.h hVar = this.f42966s6;
            ArrayList arrayList = (ArrayList) hVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.x3.m(pollId, hVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void u7() {
        if (this.I0 != null) {
            this.I0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - z8()) * (1.0f - this.f42998uc.f49505e) * R8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final int u8() {
        return this.N3;
    }

    public final void ua(org.telegram.ui.Cells.s1 s1Var) {
        bh.f fVar;
        if (this.f42972sc.f49506f && (fVar = this.f43049yc) != null && fVar.f2659n == s1Var) {
            Editable text = fVar.f2654a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(s1Var.getMessageObject(), text, this.f43049yc.getAttachedMedia());
                ta();
                return;
            }
            AndroidUtilities.shakeView(this.f43049yc.f2654a);
        }
    }

    public final void ub(org.telegram.ui.Cells.s1 s1Var) {
        if (getParentActivity() != null && s1Var != null && s1Var.f25419kb != null && s1Var.getPrimaryMessageObject() != null && s1Var.getPrimaryMessageObject().messageOwner != null && s1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Ta) {
                this.Ta = true;
                if (this.f43000v1 != null) {
                    return;
                }
                nh.t3 t3Var = new nh.t3(getParentActivity(), 3);
                t3Var.q(true);
                t3Var.G = Layout.Alignment.ALIGN_NORMAL;
                t3Var.d = -1L;
                t3Var.P = true;
                t3Var.f18592e = true;
                t3Var.i();
                t3Var.r(8.0f);
                this.f43000v1 = t3Var;
                t3Var.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                nh.t3 t3Var2 = this.f43000v1;
                t3Var2.h = nh.t3.a(t3Var2.getText(), this.f43000v1.getTextPaint());
                this.T0.addView(this.f43000v1, i7.f6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.T0.post(new vf(1, this, s1Var));
            }
        }
    }

    public final void uc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.uc():void");
    }

    @Override
    public final boolean v(final org.telegram.ui.fy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.ze1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.v(org.telegram.ui.fy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.ze1):boolean");
    }

    public final void v6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.l9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f42787e, this.f42801f, null, this.P5, this.f42956ra, this.f42945qa);
    }

    public final void v7() {
        float f9 = this.f42969s9;
        pk pkVar = this.f42865k1;
        if (pkVar != null) {
            pkVar.setTranslationY(f9);
            f9 += AndroidUtilities.dp(35.0f) * this.f42865k1.A;
        }
        bk bkVar = this.l1;
        if (bkVar != null) {
            bkVar.setTranslationY(f9);
        }
        float z82 = (z8() * AndroidUtilities.dp(43.0f)) + f9;
        org.telegram.ui.Components.m21 m21Var = this.N1;
        org.telegram.ui.Components.i21 i21Var = org.telegram.ui.Components.i21.f29303a;
        if (m21Var != null) {
            m21Var.setSideMenuBackgroundMarginTop((z8() * V8(AndroidUtilities.dp(7.0f))) + z82);
            float W8 = W8(i21Var);
            float b10 = jf.l0.b(this.f42998uc.f49505e);
            float z83 = z8();
            z82 += jf.l0.b(Math.min(i7.w.a(jf.l0.b(b10), 0.0f, 1.0f), i7.w.a(jf.l0.b(z83), 0.0f, 1.0f))) * W8;
        }
        org.telegram.ui.Components.vg vgVar = this.I0;
        if (vgVar != null) {
            vgVar.setTranslationY((z82 - AndroidUtilities.dp(5.0f)) - (z8() * W8(i21Var)));
        }
    }

    public final TLRPC.ChatFull v8() {
        return this.V7;
    }

    public final boolean v9() {
        if (!ChatObject.isForum(this.f42787e) || this.f42779d4) {
            if (ChatObject.isMonoForum(this.f42787e) && b() == 0 && !this.P3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void va(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f9, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        kg.q0 d = kg.q0.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.s1) {
            messageObject = ((org.telegram.ui.Cells.s1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) a0Var).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        ab(a0Var, messageObject2, null, null, f9, f10, d, false, false, false, false);
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
            boolean z12 = this.f43013w0.J;
            if (z12) {
                MessageObject messageObject3 = (MessageObject) this.f42870k6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f42889m3 != null) {
                kc(false);
            }
        }
        if (this.f43013w0.J && !messageObject2.hasReaction(this.f42889m3)) {
            MessageObject.GroupedMessages X8 = X8(messageObject2);
            if (X8 != null) {
                for (int i10 = 0; i10 < X8.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(X8.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            rf.z0 z0Var = this.I3;
            if (z0Var != null) {
                z0Var.l();
            }
            kc(true);
        }
    }

    public final void vb(boolean z10, boolean z11) {
        int i10;
        float f9;
        float f10;
        int i11;
        int i12;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        Object obj;
        if (!z10 || this.C0.getTag() == null) {
            if (!z10 && this.C0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.D0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.D0 = null;
            }
            RadialProgressView radialProgressView = this.C0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f16 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.D0 = animatorSet2;
                if (z10) {
                    this.C0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.D0;
                    kk kkVar = this.f43027x0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(kkVar, property, 0.1f);
                    kk kkVar2 = this.f43027x0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(kkVar2, property2, 0.1f);
                    kk kkVar3 = this.f43027x0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(kkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.C0, property, 1.0f), ObjectAnimator.ofFloat(this.C0, property2, 1.0f), ObjectAnimator.ofFloat(this.C0, property3, 1.0f));
                    this.D0.setStartDelay(200L);
                } else {
                    if (this.f43038y0) {
                        obj = this.f43050z0;
                    } else {
                        obj = this.f43027x0;
                    }
                    RadialProgressView radialProgressView2 = this.C0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.C0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.C0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.D0.addListener(new bg.z2(28, this, z10));
                this.D0.setDuration(150L);
                this.D0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.C0;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            radialProgressView5.setVisibility(i10);
            RadialProgressView radialProgressView6 = this.C0;
            if (z10) {
                f9 = 1.0f;
            } else {
                f9 = 0.1f;
            }
            radialProgressView6.setScaleX(f9);
            RadialProgressView radialProgressView7 = this.C0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView7.setScaleY(f10);
            this.C0.setAlpha(1.0f);
            kk kkVar4 = this.f43027x0;
            if (!z10 && !this.f43038y0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            kkVar4.setVisibility(i11);
            org.telegram.ui.Components.y80 y80Var = this.f43050z0;
            if (!z10 && this.f43038y0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            y80Var.setVisibility(i12);
            kk kkVar5 = this.f43027x0;
            if (!z10 && !this.f43038y0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            kkVar5.setScaleX(f11);
            org.telegram.ui.Components.y80 y80Var2 = this.f43050z0;
            if (!z10 && this.f43038y0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            y80Var2.setScaleX(f12);
            kk kkVar6 = this.f43027x0;
            if (!z10 && !this.f43038y0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            kkVar6.setScaleY(f13);
            org.telegram.ui.Components.y80 y80Var3 = this.f43050z0;
            if (!z10 && this.f43038y0) {
                f16 = 1.0f;
            }
            y80Var3.setScaleY(f16);
            kk kkVar7 = this.f43027x0;
            if (!z10 && !this.f43038y0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            kkVar7.setAlpha(f14);
            org.telegram.ui.Components.y80 y80Var4 = this.f43050z0;
            if (!z10 && this.f43038y0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            y80Var4.setAlpha(f15);
        }
    }

    public final void vc() {
        boolean z10;
        boolean z11;
        if (this.f42803f1 == null) {
            return;
        }
        if (this.f42771c9 && !b9() && !this.U.w0() && !this.Ka && (!this.f42915o3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.L5 != 0 && SystemClock.elapsedRealtime() >= this.L5 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f42815g1 = false;
        } else {
            this.f43033x7 = 0;
            this.f42808f6 = 0;
            z11 = true;
        }
        this.f42803f1.e(1, z10, z11);
    }

    @Override
    public final boolean w() {
        if (this.h != null) {
            return true;
        }
        return false;
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
        SparseArray sparseArray = this.r6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.q6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.P5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f42870k6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j10 = this.f42787e.f22392id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j10, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f42979t6.f(messageObject.getGroupId());
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
                        } else if (this.f43013w0 != null && (indexOf = arrayList.indexOf(messageObject)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.f43013w0.F));
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
            if (this.f43013w0 != null) {
                if (hVar != null) {
                    int m10 = hVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.n(i15);
                        int indexOf2 = arrayList.indexOf((MessageObject) j7.l1.i(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            em emVar = this.f43013w0;
                            if (!emVar.J) {
                                emVar.q(indexOf2 + emVar.F, groupedMessages2.messages.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.f43013w0.J) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.f43013w0.m(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final TLRPC.UserFull w8() {
        return this.W7;
    }

    public final boolean w9() {
        return UserObject.isBotForum(this.f42801f);
    }

    public final void wa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.wa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void wb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new ze(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.g6.f23295q7));
        }
    }

    public final void wc() {
        ug.g gVar = this.f42803f1;
        ah.i iVar = this.v;
        if (gVar != null) {
            this.f42803f1.setTranslationY((((-iVar.c()) - this.O.getInputBubbleHeight()) - W8(org.telegram.ui.Components.i21.f29305c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.Z0 != null) {
            this.Z0.setTranslationY((-iVar.c()) - AndroidUtilities.dp(16.0f));
        }
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    public final void x6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.x6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void x7(boolean z10) {
        boolean z11;
        this.q6.clear();
        this.f42905n6.clear();
        this.f42918o6.clear();
        this.f42781d6.clear();
        this.f42979t6.b();
        this.f42792e4 = false;
        em emVar = this.f43013w0;
        if (emVar != null) {
            if (emVar.f37866w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Pb(z11);
        }
        lj ljVar = this.f42973t0;
        if (ljVar != null) {
            ljVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f42870k6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f43005v6;
            int[] iArr2 = this.f42992u6;
            if (encryptedChat == null) {
                iArr2[i10] = Integer.MAX_VALUE;
                iArr[i10] = Integer.MIN_VALUE;
            } else {
                iArr2[i10] = Integer.MIN_VALUE;
                iArr[i10] = Integer.MAX_VALUE;
            }
            this.f43019w6[i10] = Integer.MIN_VALUE;
            this.f43032x6[i10] = 0;
            this.f43044y6[i10] = false;
            this.f43056z6[i10] = false;
            this.A6[i10] = true;
        }
        if (z10) {
            this.C7 = true;
            this.D6 = true;
            this.C6 = true;
            this.E7 = false;
        }
        this.T4 = false;
        this.f42943q7 = 0;
        this.f42931p7 = false;
        this.G6 = 0;
        this.F7 = null;
        this.f43057z7 = 0;
        this.A7 = false;
        this.f43020w7 = false;
        em emVar2 = this.f43013w0;
        if (emVar2 != null && !emVar2.J) {
            emVar2.O(false);
        }
    }

    public final ArrayList x8() {
        em emVar = this.f43013w0;
        if (emVar != null) {
            return emVar.L;
        }
        return null;
    }

    public boolean x9() {
        if (this.T0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void xa(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        org.telegram.ui.Components.h01 h01Var;
        String hostAuthority;
        boolean z11;
        boolean z12 = false;
        try {
            hostAuthority = AndroidUtilities.getHostAuthority(str);
        } catch (Exception e10) {
            FileLog.e(e10);
        }
        if (this.h != null) {
            if (getMessagesController().secretWebpagePreview == 1) {
            }
            if (z10 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i10 == 0) {
                    ye.d.q(getParentActivity(), Uri.parse(str), true, true, K9(s1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f42758b8 == 0) {
                        z12 = true;
                    }
                    ye.d.q(parentActivity, parse, z12, true, K9(s1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f42758b8 == 0) {
                        z12 = true;
                    }
                    ye.d.q(parentActivity2, parse2, z12, true, K9(s1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.c5.r0(this, str, true, true, false, false, K9(s1Var, characterStyle), null, this.f42746aa);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.c51) && (h01Var = ((org.telegram.ui.Components.c51) characterStyle).f27311a) != null && (h01Var.f29024a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.c5.r0(this, str, true, true, true, z12, K9(s1Var, characterStyle), null, this.f42746aa);
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
        if (characterStyle instanceof org.telegram.ui.Components.c51) {
            z12 = true;
        }
        org.telegram.ui.Components.c5.r0(this, str, true, true, true, z12, K9(s1Var, characterStyle), null, this.f42746aa);
    }

    public final void xb() {
        TLRPC.Chat chat = this.f42787e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.f42787e)) {
                    a60 a60Var = new a60(a());
                    a60Var.f43514h0 = this;
                    presentFragment(a60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.f42787e)) {
                vc vcVar = new vc(a());
                vcVar.f43514h0 = this;
                presentFragment(vcVar);
                return;
            } else {
                return;
            }
        }
        this.X9 = new org.telegram.ui.Components.gp(this, this.f42746aa);
        this.f42973t0.setOnInterceptTouchListener(new m4.a(17));
        jb(this.T0, false);
        showDialog(this.X9, new xf(this, 0));
    }

    public final void xc(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        Integer num;
        float f9;
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
        if ((!F9() || this.f42779d4) && this.H2 != null) {
            if (!this.K5) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.D4.size() > 1 && !this.E2) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.H2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.G2.getTag() != null) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (this.F2.getTag() != null) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (!z12 && !this.xb && !this.E2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z12 && !this.xb && !this.E2) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.xb && !this.E2) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (z13 != z12 || z14 != z18 || z15 != z16) {
                AnimatorSet animatorSet = this.I2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.I2 = null;
                }
                if (z11) {
                    if (z12) {
                        this.H2.setVisibility(0);
                    } else if (z16) {
                        this.F2.setVisibility(0);
                    }
                    if (z18) {
                        this.G2.setVisibility(0);
                        this.G2.setAlpha(0.0f);
                        this.G2.setScaleX(0.4f);
                        this.G2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.I2 = animatorSet2;
                    ImageView imageView = this.H2;
                    Property property = View.ALPHA;
                    if (z17) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f18);
                    ImageView imageView2 = this.H2;
                    Property property2 = View.SCALE_X;
                    if (z17) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f19);
                    ImageView imageView3 = this.H2;
                    Property property3 = View.SCALE_Y;
                    if (z17) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f20);
                    ImageView imageView4 = this.F2;
                    if (z16) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f21);
                    ImageView imageView5 = this.F2;
                    if (z16) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f22);
                    ImageView imageView6 = this.F2;
                    if (z16) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f23);
                    RadialProgressView radialProgressView = this.G2;
                    if (!z18) {
                        f24 = 0.0f;
                    } else {
                        f24 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f24);
                    RadialProgressView radialProgressView2 = this.G2;
                    if (!z18) {
                        f25 = 0.4f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f25);
                    RadialProgressView radialProgressView3 = this.G2;
                    if (!z18) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f26));
                    this.I2.setInterpolator(org.telegram.ui.Components.jr.h);
                    this.I2.setDuration(360L);
                    this.I2.addListener(new ql(this, z16, z17, z18));
                    this.I2.start();
                } else {
                    num = 1;
                    ImageView imageView7 = this.F2;
                    if (z16) {
                        f9 = 1.0f;
                    } else {
                        f9 = 0.0f;
                    }
                    imageView7.setAlpha(f9);
                    ImageView imageView8 = this.F2;
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    imageView8.setScaleX(f10);
                    ImageView imageView9 = this.F2;
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView9.setScaleY(f11);
                    ImageView imageView10 = this.F2;
                    if (z16) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.H2;
                    if (z17) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    imageView11.setAlpha(f12);
                    ImageView imageView12 = this.H2;
                    if (z17) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    imageView12.setScaleX(f13);
                    ImageView imageView13 = this.H2;
                    if (z17) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView13.setScaleY(f14);
                    ImageView imageView14 = this.H2;
                    if (z17) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.G2;
                    if (z18) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f15);
                    RadialProgressView radialProgressView5 = this.G2;
                    if (z18) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f16);
                    RadialProgressView radialProgressView6 = this.G2;
                    if (z18) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f17);
                    RadialProgressView radialProgressView7 = this.G2;
                    if (z18) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.F2;
                if (z16) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.H2;
                if (z12) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.G2;
                if (z18) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.f43001v2 != null) {
                if (F9() && !this.f42779d4) {
                    this.f43001v2.c(0, 1, false);
                } else {
                    this.f43001v2.c((this.D4.size() - 1) - Collections.binarySearch(this.D4, Integer.valueOf(this.H4), Comparator$CC.reverseOrder()), this.D4.size(), z11);
                }
            }
        }
    }

    public final void y6() {
        this.f42768c5 = null;
        if (this.Z3 == 0 || this.f42779d4) {
            if (this.f42779d4) {
                this.f42856j5 = this.T3;
            } else {
                this.f42856j5 = null;
            }
            this.f42831h5 = null;
            dk dkVar = this.U;
            if (dkVar != null) {
                dkVar.l1(null, null, null);
            }
        }
        e9(false);
        if (this.N3 == 0) {
            getMediaDataController().cleanDraft(this.P5, this.Z3, true);
        }
    }

    public final void y7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f43005v6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.D6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                j7.l1.t(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.f43057z7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.A6[0] = false;
            this.B6 = false;
            em emVar = this.f43013w0;
            if (emVar != null && emVar.B < 0) {
                emVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f42808f6 = i12;
            this.f42832h6 = dialog2.unread_mentions_count;
            if (this.f42820g6 != i12) {
                ug.g gVar = this.f42803f1;
                if (gVar != null) {
                    gVar.c(1, i12, this.J5);
                }
                this.f42820g6 = this.f42808f6;
                vc();
            }
            int i13 = this.f42832h6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f42832h6 = i14;
                if (i14 <= 0) {
                    this.f42832h6 = 0;
                    this.f42844i6 = true;
                    Kb(false);
                } else {
                    ug.g gVar2 = this.f42803f1;
                    if (gVar2 != null) {
                        gVar2.c(2, i14, true);
                    }
                    Kb(true);
                }
            }
            a7(false);
            return;
        }
        this.q6.clear();
        this.f42781d6.clear();
        this.f42905n6.clear();
        this.f42918o6.clear();
        this.f42979t6.b();
        this.f42792e4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f42870k6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f42992u6;
            if (encryptedChat == null) {
                iArr2[i15] = Integer.MAX_VALUE;
                iArr[i15] = Integer.MIN_VALUE;
            } else {
                iArr2[i15] = Integer.MIN_VALUE;
                iArr[i15] = Integer.MAX_VALUE;
            }
            this.f43019w6[i15] = Integer.MIN_VALUE;
            this.f43032x6[i15] = 0;
            this.S5[i15].clear();
            this.T5[i15].clear();
            this.U5[i15].clear();
        }
        c9();
        yc(0, true);
        if (this.f42834h8 != null) {
            this.f42834h8 = null;
            dk dkVar = this.U;
            if (dkVar != null) {
                dkVar.Z0(null, true, false);
            }
        }
        if (this.L != null) {
            Pb(false);
            G7(false);
            this.f42973t0.setEmptyView(this.M0);
        }
        em emVar2 = this.f43013w0;
        if (emVar2 != null) {
            emVar2.O(false);
        }
        if (this.h == null && (user = this.f42801f) != null && user.bot && this.f42744a8 == null) {
            this.f42744a8 = "";
            hc(false);
        }
    }

    public final MessageObject.GroupedMessages y8(long j10) {
        return (MessageObject.GroupedMessages) this.f42979t6.f(j10);
    }

    public final boolean y9() {
        if (this.f42787e != null) {
            return getMessagesController().isChatNoForwards(this.f42787e);
        }
        return getMessagesController().isUserNoForwards(this.W7);
    }

    public final void ya(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.ya(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void yb(boolean z10, MessageObject messageObject, MessageObject messageObject2, ArrayList arrayList, TLRPC.WebPage webPage, jn jnVar, boolean z11, boolean z12) {
        zb(z10, messageObject, messageObject2, arrayList, webPage, true, 0, jnVar, z11, 0L, null, z12);
    }

    public final void yc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.yc(int, boolean):void");
    }

    @Override
    public final void z(float f9, int i10) {
        if (i10 == 2 && f9 == 0.0f) {
            bh.f fVar = this.f43049yc;
            if (fVar != null) {
                this.T0.removeView(fVar);
                this.f43049yc = null;
            }
            dk dkVar = this.U;
            if (dkVar != null) {
                dkVar.H0();
            }
        }
    }

    public final void z6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f42746aa);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            c2Var.P = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            c2Var.P = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(c2Var);
    }

    public final void z7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.S5[i10].clear();
            this.T5[i10].clear();
            this.U5[i10].clear();
        }
        c9();
        yc(0, true);
        Wc(z10);
        Lc();
    }

    public final float z8() {
        tn tnVar = this.Z9;
        if (tnVar == null) {
            tnVar = this;
        }
        bk bkVar = tnVar.l1;
        if (bkVar == null) {
            return 0.0f;
        }
        return bkVar.f31099b;
    }

    public final boolean z9() {
        int i10 = this.N3;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void za(java.util.ArrayList r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.za(java.util.ArrayList, boolean):void");
    }

    public final void zb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.jn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.tn.zb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.jn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void zc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f42779d4 && !this.F4.isEmpty() && this.D4.size() == 1 && ((Integer) this.D4.get(0)).intValue() == b() + 1) {
            messageObject = (MessageObject) this.F4.get(this.D4.get(0));
        } else {
            messageObject = null;
        }
        this.U3 = messageObject;
        if (this.f42779d4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.Y3) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.f42787e, this.U3.messageOwner.from_id)) {
            this.U3 = null;
        }
    }

    @Override
    public final void O() {
    }

    public void V9(boolean z10) {
    }
}
