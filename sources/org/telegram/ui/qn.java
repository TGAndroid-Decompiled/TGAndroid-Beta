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
public class qn extends org.telegram.ui.ActionBar.o2 implements NotificationCenter.NotificationCenterDelegate, wx, kc0, org.telegram.ui.Components.wj, org.telegram.ui.Components.rg, uf.b, org.telegram.ui.Components.x40, td.b {
    public static int Dc = 22;
    public static float Ec = 1.4f;
    public static int Fc = 10;
    public static Pattern Gc;
    public static Pattern Hc;
    public static Pattern Ic;
    public static final int[] Jc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Kc = false;
    public static final Rect Lc = new Rect();
    public final xd.b A;
    public TextView A0;
    public ChannelBoostsController.CanApplyBoost A1;
    public final bg.t[] A2;
    public FlagSecureReason A3;
    public boolean A4;
    public TLObject A5;
    public final boolean[] A6;
    public boolean A7;
    public Matrix A8;
    public long A9;
    public wk Aa;
    public boolean Ab;
    public final ArrayList Ac;
    public final ig.e B;
    public gk B0;
    public boolean B1;
    public NumberTextView B2;
    public boolean B3;
    public boolean B4;
    public int B5;
    public boolean B6;
    public boolean B7;
    public Paint B8;
    public int B9;
    public final el Ba;
    public final RectF Bb;
    public final ArrayList Bc;
    public final int C;
    public RadialProgressView C0;
    public ge C1;
    public int C2;
    public MessageObject C3;
    public int C4;
    public TLRPC.WebPage C5;
    public boolean C6;
    public boolean C7;
    public final Paint C8;
    public int C9;
    public final hl Ca;
    public org.telegram.ui.ActionBar.c2 Cb;
    public final Rect Cc;
    public final ng.d D;
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
    public final ng.d E;
    public boolean E0;
    public tj E1;
    public boolean E2;
    public MessageObject E3;
    public int E4;
    public String E5;
    public boolean E6;
    public boolean E7;
    public boolean E8;
    public int E9;
    public final pl Ea;
    public final jg Eb;
    public final ig.a F;
    public kh.x3 F0;
    public ih.u2 F1;
    public ImageView F2;
    public MessageObject F3;
    public HashMap F4;
    public fm F5;
    public int F6;
    public MessageObject F7;
    public View F8;
    public boolean F9;
    public final yh Fa;
    public int Fb;
    public final ig.a G;
    public kh.x3 G0;
    public org.telegram.ui.ActionBar.r0 G1;
    public RadialProgressView G2;
    public pg.e G3;
    public final SparseArray G4;
    public TLRPC.ChatInvite G5;
    public int G6;
    public MessageObject G7;
    public float G8;
    public boolean G9;
    public final pi Ga;
    public boolean Gb;
    public final ng.e H;
    public kh.x3 H0;
    public TextView H1;
    public ImageView H2;
    public gh.f1 H3;
    public int H4;
    public ge H5;
    public long H6;
    public int H7;
    public float H8;
    public boolean H9;
    public final dn Ha;
    public Pattern Hb;
    public final ig.a I;
    public org.telegram.ui.Components.sg I0;
    public boolean I1;
    public AnimatorSet I2;
    public of.j1 I3;
    public final int[] I4;
    public final LongSparseIntArray I5;
    public boolean I6;
    public boolean I7;
    public Integer I8;
    public org.telegram.ui.Components.ji I9;
    public final gf Ia;
    public MessageObject Ib;
    public org.telegram.ui.ActionBar.c2 J;
    public boolean J0;
    public TextView J1;
    public FrameLayout J2;
    public pg.d J3;
    public int J4;
    public boolean J5;
    public long J6;
    public boolean J7;
    public int J8;
    public float J9;
    public final gf Ja;
    public ye Jb;
    public boolean K;
    public fk K0;
    public TextView K1;
    public bk K2;
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
    public rg.c L0;
    public nk L1;
    public TextView L2;
    public TL_account.TL_businessChatLink L3;
    public int L4;
    public long L5;
    public final Paint L6;
    public String L7;
    public AnimatorSet L8;
    public kp L9;
    public boolean La;
    public final BotForumHelper.BotDraftAnimationsPool Lb;
    public kh.h6 M;
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
    public final pg.a Mb;
    public ek N;
    public LinearLayout N0;
    public org.telegram.ui.Components.b21 N1;
    public ek N2;
    public int N3;
    public boolean N4;
    public boolean N5;
    public final ColorMatrix N6;
    public byte[] N7;
    public boolean N8;
    public boolean N9;
    public NotificationCenter.ObserversGroup Na;
    public boolean Nb;
    public pg.f O;
    public org.telegram.ui.Components.yn O0;
    public pf.f O1;
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
    public ii P0;
    public org.telegram.ui.Components.l80 P1;
    public ImageView P2;
    public boolean P3;
    public AnimatorSet P4;
    public long P5;
    public final org.telegram.ui.ActionBar.d5 P6;
    public int P7;
    public org.telegram.ui.ActionBar.g1 P8;
    public qn P9;
    public boolean Pa;
    public boolean Pb;
    public FrameLayout Q;
    public pf.s1 Q0;
    public ImageView Q1;
    public org.telegram.ui.Components.j6 Q2;
    public String Q3;
    public final SparseIntArray Q4;
    public Long Q5;
    public long Q6;
    public ge Q7;
    public final sj Q8;
    public float Q9;
    public int Qa;
    public long Qb;
    public FrameLayout R;
    public pf.w R0;
    public mh.n R1;
    public org.telegram.ui.Components.j6 R2;
    public byte[] R3;
    public final SparseIntArray R4;
    public int R5;
    public int R6;
    public String R7;
    public cm R8;
    public AnimatorSet R9;
    public int Ra;
    public boolean Rb;
    public final pg.j S;
    public pg.i S0;
    public TextView S1;
    public org.telegram.ui.Components.j6 S2;
    public String S3;
    public boolean S4;
    public final SparseArray[] S5;
    public int S6;
    public ChatObject.Call S7;
    public ik S8;
    public final bk S9;
    public boolean Sa;
    public boolean Sb;
    public rg.f T;
    public im T0;
    public vj T1;
    public rj T2;
    public MessageObject T3;
    public boolean T4;
    public final SparseArray[] T5;
    public final Matrix T6;
    public boolean T7;
    public int T8;
    public ch.k T9;
    public boolean Ta;
    public boolean Tb;
    public ak U;
    public org.telegram.ui.Components.un U0;
    public FrameLayout U1;
    public qj U2;
    public MessageObject U3;
    public boolean U4;
    public final SparseArray[] U5;
    public LinearGradient U6;
    public boolean U7;
    public int U8;
    public hg.v U9;
    public a0.h Ua;
    public boolean Ub;
    public ck V;
    public final ArrayList V0;
    public vj V1;
    public org.telegram.ui.Cells.w0 V2;
    public boolean V3;
    public boolean V4;
    public boolean V5;
    public int V6;
    public TLRPC.ChatFull V7;
    public int V8;
    public d41 V9;
    public a0.h Va;
    public x8 Vb;
    public fh.d2 W;
    public dj W0;
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
    public org.telegram.ui.Components.j6 X0;
    public TextView X1;
    public uk X2;
    public MessageObject X3;
    public boolean X4;
    public int X5;
    public final Paint X6;
    public org.telegram.ui.Cells.f6 X7;
    public boolean X8;
    public org.telegram.ui.Components.cp X9;
    public rk Xa;
    public ValueAnimator Xb;
    public org.telegram.ui.ActionBar.u0 Y;
    public dh Y0;
    public org.telegram.ui.Components.e00 Y1;
    public View Y2;
    public TLRPC.TL_forumTopic Y3;
    public MessageObject Y4;
    public int Y5;
    public final Matrix Y6;
    public j01 Y7;
    public jm Y8;
    public on Y9;
    public boolean Ya;
    public ki Yb;
    public wr Z;
    public org.telegram.ui.Components.ux0 Z0;
    public org.telegram.ui.Components.gw0 Z1;
    public boolean Z2;
    public long Z3;
    public MessageObject Z4;
    public int Z5;
    public LinearGradient Z6;
    public final a0.h Z7;
    public org.telegram.ui.Cells.t1 Z8;
    public qn Z9;
    public boolean Za;
    public boolean Zb;
    public int f41839a;
    public org.telegram.ui.ActionBar.y f41840a0;
    public org.telegram.ui.ActionBar.u0 f41841a1;
    public org.telegram.ui.Components.s30 a2;
    public boolean a3;
    public int f41842a4;
    public MessageObject.GroupedMessages f41843a5;
    public int f41844a6;
    public boolean f41845a7;
    public String f41846a8;
    public boolean f41847a9;
    public on f41848aa;
    public boolean f41849ab;
    public int f41850ac;
    public boolean f41851b;
    public org.telegram.ui.ActionBar.u0 f41852b0;
    public org.telegram.ui.ActionBar.u0 f41853b1;
    public org.telegram.ui.Components.s30 f41854b2;
    public boolean f41855b3;
    public TLRPC.Chat f41856b4;
    public MessagePreviewParams f41857b5;
    public int f41858b6;
    public boolean f41859b7;
    public long f41860b8;
    public boolean f41861b9;
    public eh.e ba;
    public ArrayList f41862bb;
    public int f41863bc;
    public boolean f41864c;
    public org.telegram.ui.ActionBar.u0 f41865c0;
    public org.telegram.ui.ActionBar.u0 f41866c1;
    public wi f41867c2;
    public AnimatorSet f41868c3;
    public boolean f41869c4;
    public MessageSuggestionParams f41870c5;
    public int f41871c6;
    public int f41872c7;
    public String f41873c8;
    public boolean f41874c9;
    public final ChatMessagesMetadataController f41875ca;
    public ValueAnimator f41876cb;
    public int f41877cc;
    public boolean d;
    public org.telegram.ui.ActionBar.w0 f41878d0;
    public org.telegram.ui.ActionBar.u0 f41879d1;
    public boolean f41880d2;
    public ValueAnimator f41881d3;
    public boolean f41882d4;
    public MessageObject f41883d5;
    public final ArrayList f41884d6;
    public boolean f41885d7;
    public boolean f41886d8;
    public fl d9;
    public TLRPC.TL_channels_sendAsPeers f41887da;
    public boolean f41888db;
    public int f41889dc;
    public TLRPC.Chat f41890e;
    public org.telegram.ui.ActionBar.y f41891e0;
    public org.telegram.ui.Components.fo f41892e1;
    public org.telegram.ui.Components.s30 f41893e2;
    public float f41894e3;
    public boolean f41895e4;
    public MessageObject.GroupedMessages f41896e5;
    public boolean f41897e6;
    public boolean f41898e7;
    public boolean f41899e8;
    public boolean f41900e9;
    public TL_account.resolvedBusinessChatLinks f41901ea;
    public Boolean f41902eb;
    public int ec;
    public TLRPC.User f41903f;
    public org.telegram.ui.ActionBar.w0 f41904f0;
    public rg.g f41905f1;
    public boolean f41906f2;
    public boolean f41907f3;
    public boolean f41908f4;
    public MessageObject.GroupedMessages f41909f5;
    public int f41910f6;
    public int f41911f7;
    public String f41912f8;
    public float f41913f9;
    public boolean f41914fa;
    public boolean f41915fb;
    public boolean fc;
    public org.telegram.ui.ActionBar.w0 f41916g0;
    public boolean f41917g1;
    public org.telegram.ui.Components.s30 f41918g2;
    public boolean f41919g3;
    public int f41920g4;
    public MessageObject f41921g5;
    public int f41922g6;
    public boolean f41923g7;
    public String f41924g8;
    public uj f41925g9;
    public boolean f41926ga;
    public boolean f41927gb;
    public long f41928gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.u0 f41929h0;
    public int f41930h1;
    public org.telegram.ui.Components.s30 f41931h2;
    public boolean f41932h3;
    public int f41933h4;
    public gn f41934h5;
    public int f41935h6;
    public boolean f41936h7;
    public MessageObject f41937h8;
    public org.telegram.ui.Cells.t1 f41938h9;
    public float f41939ha;
    public int f41940hb;
    public TLRPC.TL_messages_discussionMessage f41941hc;
    public org.telegram.ui.ActionBar.w0 f41942i0;
    public int f41943i1;
    public org.telegram.ui.Components.s30 f41944i2;
    public boolean f41945i3;
    public int f41946i4;
    public boolean f41947i5;
    public boolean f41948i6;
    public boolean f41949i7;
    public MessageObject f41950i8;
    public org.telegram.ui.Components.c00 i9;
    public final eg f41951ia;
    public HashMap f41952ib;
    public TLRPC.messages_Messages f41953ic;
    public org.telegram.ui.ActionBar.y f41954j0;
    public org.telegram.ui.Components.gc f41955j1;
    public org.telegram.ui.Components.s30 f41956j2;
    public boolean f41957j3;
    public oh f41958j4;
    public MessageObject f41959j5;
    public final ArrayList f41960j6;
    public int f41961j7;
    public int f41962j8;
    public boolean f41963j9;
    public final kk f41964ja;
    public gf f41965jb;
    public boolean jc;
    public boolean f41966k0;
    public mk f41967k1;
    public org.telegram.ui.Components.s30 f41968k2;
    public TLRPC.User f41969k3;
    public final SparseArray f41970k4;
    public int f41971k5;
    public final SparseArray[] f41972k6;
    public int f41973k7;
    public boolean f41974k8;
    public boolean f41975k9;
    public int ka;
    public int f41976kb;
    public in f41977kc;
    public RadialProgressView f41978l0;
    public yj l1;
    public org.telegram.ui.Cells.t1 f41979l2;
    public TLRPC.Chat f41980l3;
    public final ArrayList f41981l4;
    public MessageObject f41982l5;
    public final SparseArray f41983l6;
    public boolean f41984l7;
    public long f41985l8;
    public ValueAnimator f41986l9;
    public int f41987la;
    public org.telegram.ui.ActionBar.c2 f41988lb;
    public cn f41989lc;
    public org.telegram.ui.ActionBar.u0 m0;
    public kh.j1 f41990m1;
    public int f41991m2;
    public hg.r0 f41992m3;
    public int f41993m4;
    public boolean f41994m5;
    public final SparseArray f41995m6;
    public ge f41996m7;
    public long f41997m8;
    public ValueAnimator f41998m9;
    public gf f41999ma;
    public int mb;
    public gh.p5 f42000mc;
    public boolean f42001n;
    public org.telegram.ui.ActionBar.u0 f42002n0;
    public int f42003n1;
    public int f42004n2;
    public boolean f42005n3;
    public boolean f42006n4;
    public boolean f42007n5;
    public final HashMap f42008n6;
    public String f42009n7;
    public boolean f42010n8;
    public boolean f42011n9;
    public boolean f42012na;
    public int f42013nb;
    public boolean f42014nc;
    public org.telegram.ui.ActionBar.u0 f42015o0;
    public boolean f42016o1;
    public org.telegram.ui.Components.s30 f42017o2;
    public boolean f42018o3;
    public boolean f42019o4;
    public boolean f42020o5;
    public final SparseArray o6;
    public boolean f42021o7;
    public String f42022o8;
    public float o9;
    public boolean f42023oa;
    public boolean ob;
    public float f42024oc;
    public org.telegram.ui.ActionBar.u0 f42025p0;
    public org.telegram.ui.Components.n30 f42026p1;
    public org.telegram.ui.Components.s30 f42027p2;
    public String f42028p3;
    public int f42029p4;
    public boolean f42030p5;
    public final a0.h p6;
    public boolean f42031p7;
    public ek f42032p8;
    public float p9;
    public long f42033pa;
    public int f42034pb;
    public float f42035pc;
    public ClippingImageView f42036q0;
    public org.telegram.ui.ActionBar.c2 f42037q1;
    public org.telegram.ui.Components.s30 f42038q2;
    public String f42039q3;
    public final ArrayList f42040q4;
    public int f42041q5;
    public final ArrayList f42042q6;
    public int f42043q7;
    public org.telegram.ui.Cells.t1 f42044q8;
    public int f42045q9;
    public int f42046qa;
    public boolean f42047qb;
    public final td.a f42048qc;
    public long f42049r;
    public org.telegram.ui.Components.d01 f42050r0;
    public kh.x3 f42051r1;
    public org.telegram.ui.Components.gp f42052r2;
    public int f42053r3;
    public final HashMap f42054r4;
    public int f42055r5;
    public final SparseArray f42056r6;
    public int f42057r7;
    public c5.c f42058r8;
    public int f42059r9;
    public int f42060ra;
    public int f42061rb;
    public final td.a f42062rc;
    public final HashMap f42063s;
    public f2.x0 f42064s0;
    public kh.x3 f42065s1;
    public View f42066s2;
    public int f42067s3;
    public MessageObject f42068s4;
    public TLRPC.PhotoSize f42069s5;
    public final a0.h f42070s6;
    public int f42071s7;
    public TextureView f42072s8;
    public float f42073s9;
    public jk f42074sa;
    public int f42075sb;
    public final td.a f42076sc;
    public ij f42077t0;
    public kh.x3 f42078t1;
    public yk f42079t2;
    public int f42080t3;
    public int f42081t4;
    public TLRPC.PhotoSize f42082t5;
    public final a0.h f42083t6;
    public int f42084t7;
    public boolean f42085t8;
    public float f42086t9;
    public lk f42087ta;
    public int f42088tb;
    public final td.a f42089tc;
    public kj f42090u0;
    public kh.x3 f42091u1;
    public kh.h6 f42092u2;
    public UndoView f42093u3;
    public int f42094u4;
    public TLObject f42095u5;
    public final int[] f42096u6;
    public int f42097u7;
    public final gf f42098u8;
    public float f42099u9;
    public float f42100ua;
    public CharacterStyle f42101ub;
    public final td.a f42102uc;
    public final xg.i v;
    public lj f42103v0;
    public kh.x3 f42104v1;
    public org.telegram.ui.Components.ef0 f42105v2;
    public xk f42106v3;
    public final ArrayList v4;
    public int f42107v5;
    public final int[] f42108v6;
    public int f42109v7;
    public final ng.b f42110v8;
    public float f42111v9;
    public int va;
    public String vb;
    public final td.a f42112vc;
    public xi f42113w;
    public bm f42114w0;
    public kh.x3 f42115w1;
    public boolean f42116w2;
    public org.telegram.ui.Components.gc f42117w3;
    public int f42118w4;
    public int f42119w5;
    public final int[] f42120w6;
    public boolean f42121w7;
    public final ig.a w8;
    public float f42122w9;
    public int f42123wa;
    public ve.d f42124wb;
    public final td.a f42125wc;
    public xi f42126x;
    public hk f42127x0;
    public ml f42128x1;
    public final org.telegram.ui.Components.o9[] f42129x2;
    public boolean f42130x3;
    public int f42131x4;
    public boolean f42132x5;
    public final int[] f42133x6;
    public int f42134x7;
    public Bitmap f42135x8;
    public TLRPC.Document f42136x9;
    public ChatMessageSharedResources f42137xa;
    public boolean f42138xb;
    public final d5.w f42139xc;
    public final xd.b f42140y;
    public boolean f42141y0;
    public float f42142y1;
    public final pn[] f42143y2;
    public int f42144y3;
    public gf f42145y4;
    public TLRPC.PhotoSize f42146y5;
    public final boolean[] f42147y6;
    public int f42148y7;
    public BitmapShader f42149y8;
    public boolean f42150y9;
    public ValueAnimator f42151ya;
    public ge f42152yb;
    public yg.c yc;
    public org.telegram.ui.Components.l80 f42153z0;
    public TL_stories.TL_premium_boostsStatus f42154z1;
    public final org.telegram.ui.ActionBar.h5[] f42155z2;
    public boolean f42156z3;
    public boolean f42157z4;
    public TLRPC.PhotoSize f42158z5;
    public final boolean[] f42159z6;
    public int f42160z7;
    public Paint f42161z8;
    public boolean f42162z9;
    public float f42163za;
    public boolean f42164zb;
    public ff.f0 f42165zc;

    public qn(Bundle bundle) {
        super(bundle);
        this.f41839a = 0;
        this.f41864c = false;
        this.d = false;
        this.f42063s = new HashMap();
        this.v = new xg.i(new gf(this, 18));
        xd.b bVar = new xd.b(true);
        this.f42140y = bVar;
        xd.b bVar2 = new xd.b(true);
        this.A = bVar2;
        this.S = new pg.j();
        this.V0 = new ArrayList();
        this.f42129x2 = new org.telegram.ui.Components.o9[2];
        this.f42143y2 = new pn[2];
        this.f42155z2 = new org.telegram.ui.ActionBar.h5[2];
        this.A2 = new bg.t[2];
        this.D2 = new AnimatorSet[2];
        this.E2 = false;
        this.W2 = 500;
        this.L3 = null;
        this.O3 = -1;
        this.V3 = true;
        this.f41970k4 = new SparseArray();
        this.f41981l4 = new ArrayList();
        this.f42040q4 = new ArrayList();
        this.f42054r4 = new HashMap();
        this.f42081t4 = -1;
        this.f42094u4 = 0;
        this.v4 = new ArrayList(10);
        this.D4 = new ArrayList();
        this.F4 = new HashMap();
        this.G4 = new SparseArray();
        this.I4 = new int[1];
        this.Q4 = new SparseIntArray();
        this.R4 = new SparseIntArray();
        this.V4 = true;
        this.X4 = true;
        this.f41994m5 = true;
        this.f42030p5 = true;
        this.I5 = new LongSparseIntArray();
        this.R5 = 1;
        this.S5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.T5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.U5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41884d6 = new ArrayList();
        this.f41897e6 = true;
        this.f41922g6 = Integer.MIN_VALUE;
        this.f41960j6 = new ArrayList();
        this.f41972k6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41983l6 = new SparseArray();
        this.f41995m6 = new SparseArray();
        this.f42008n6 = new HashMap();
        this.o6 = new SparseArray();
        this.p6 = new a0.h();
        this.f42042q6 = new ArrayList();
        this.f42056r6 = new SparseArray();
        this.f42070s6 = new a0.h();
        this.f42083t6 = new a0.h();
        this.f42096u6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f42108v6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f42120w6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f42133x6 = new int[2];
        this.f42147y6 = new boolean[2];
        this.f42159z6 = new boolean[2];
        this.A6 = new boolean[]{true, true};
        this.C6 = true;
        this.D6 = true;
        this.G6 = 0;
        this.K6 = new ArrayList();
        this.L6 = new Paint(1);
        this.M6 = new Paint(1);
        this.N6 = new ColorMatrix();
        this.O6 = new m.f3();
        this.P6 = new org.telegram.ui.ActionBar.d5(0, false, false, new ej(this));
        this.T6 = new Matrix();
        Paint paint = new Paint(1);
        this.X6 = paint;
        this.Y6 = new Matrix();
        this.f41961j7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f42084t7 = Integer.MAX_VALUE;
        this.f42097u7 = -1;
        this.C7 = true;
        this.H7 = Integer.MAX_VALUE;
        this.O7 = -1;
        this.P7 = -10000;
        this.Z7 = new a0.h();
        this.f42098u8 = new gf(this, 23);
        ng.b bVar3 = new ng.b();
        this.f42110v8 = bVar3;
        ig.a aVar = new ig.a(bVar3);
        this.w8 = aVar;
        this.C8 = new Paint(1);
        this.D8 = 0.0f;
        this.G8 = 1.0f;
        this.H8 = 0.0f;
        this.N8 = true;
        this.Q8 = new sj(this);
        this.f41963j9 = true;
        this.S9 = new bk(this, 0);
        this.f41875ca = new ChatMessagesMetadataController(this);
        this.f41951ia = new eg(this, 0);
        this.f41964ja = new kk(this);
        this.f41987la = -1;
        this.Ba = new el(this);
        this.Ca = new hl(this);
        this.Ea = new pl(this);
        this.Fa = new yh(this);
        this.Ga = new pi(this);
        this.Ha = new dn(this);
        this.Ia = new gf(this, 26);
        this.Ja = new gf(this, 27);
        this.Za = false;
        this.Bb = new RectF();
        this.Eb = new jg(this, 1);
        this.Lb = new BotForumHelper.BotDraftAnimationsPool();
        this.Mb = new Object();
        this.Zb = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.f42048qc = new td.a(0, this, grVar, 320L, false);
        this.f42062rc = new td.a(1, this, grVar, 520L, false);
        this.f42076sc = new td.a(2, this, grVar, 520L, false);
        this.f42089tc = new td.a(3, this, grVar, 320L, false);
        this.f42102uc = new td.a(4, this, grVar, 320L, false);
        this.f42112vc = new td.a(5, this, grVar, 320L, false);
        this.f42125wc = new td.a(6, this, grVar, 320L, false);
        jg jgVar = new jg(this, 5);
        ?? obj = new Object();
        obj.f4402b = new float[32];
        obj.f4401a = 1;
        obj.d = new td.j(obj, sd.a.f47511a, 240L);
        obj.f4403c = jgVar;
        this.f42139xc = obj;
        this.Ac = new ArrayList();
        this.Bc = new ArrayList();
        this.Cc = new Rect();
        ?? obj2 = new Object();
        this.H = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ig.e eVar = new ig.e(false);
            this.B = eVar;
            this.C = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            ng.d dVar = new ng.d(obj2);
            this.E = dVar;
            dVar.v = new jg(this, 8);
            dVar.d = eVar;
            dVar.f18604e = -3;
            dVar.f18605f = obj2;
            ig.a aVar2 = new ig.a(dVar);
            this.G = aVar2;
            aVar2.f11132f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                ng.d dVar2 = new ng.d(obj2);
                this.D = dVar2;
                dVar2.v = new jg(this, 8);
                dVar2.d = eVar;
                dVar2.f18604e = -2;
                dVar2.f18605f = obj2;
                ig.a aVar3 = new ig.a(dVar2);
                this.F = aVar3;
                aVar3.f11132f = LiteMode.isEnabled(262144);
            } else {
                this.D = null;
                this.F = aVar2;
            }
        } else {
            this.B = null;
            this.C = 0;
            this.D = null;
            this.E = null;
            this.F = new ig.a(obj2);
            this.G = new ig.a(obj2);
        }
        ig.a aVar4 = new ig.a(obj2);
        this.I = aVar4;
        aVar4.f11130c = bVar;
        this.F.f11130c = bVar;
        this.G.f11130c = bVar;
        aVar.f11130c = new xd.b(true);
        aVar4.f11129b = bVar2;
        this.F.f11129b = bVar2;
        this.G.f11129b = bVar2;
        aVar.f11129b = bVar2;
    }

    public static void A0(qn qnVar) {
        qnVar.X9 = null;
        qnVar.f42077t0.setOnInterceptTouchListener(null);
        qnVar.jb(qnVar.T0, true);
        ChatThemeController.getInstance(qnVar.currentAccount).clearWallpaperThumbImages();
    }

    public static org.telegram.ui.bu0 A1(org.telegram.ui.qn r16, org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.A1(org.telegram.ui.qn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.bu0");
    }

    public static void B0(qn qnVar) {
        if (qnVar.T2.getAlpha() != 0.0f && !qnVar.actionBar.s() && !qnVar.A9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(qnVar.T2.getCustomDate() * 1000);
            int i9 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.clear();
            calendar.set(i9, i10, i11);
            qnVar.G9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void B1(qn qnVar) {
        SparseArray[] sparseArrayArr = qnVar.S5;
        MessageObject messageObject = null;
        for (int i9 = 1; i9 >= 0; i9--) {
            if (messageObject == null && sparseArrayArr[i9].size() != 0) {
                messageObject = (MessageObject) qnVar.f41972k6[i9].get(sparseArrayArr[i9].keyAt(0));
            }
            sparseArrayArr[i9].clear();
            qnVar.T5[i9].clear();
            qnVar.U5[i9].clear();
        }
        if (qnVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(qnVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(qnVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                qnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        qnVar.c9();
        qnVar.yc(0, true);
        qnVar.Wc(false);
        qnVar.Lc();
    }

    public static CharSequence B8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.i21.k(messageObject)) {
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
        for (int i9 = 0; i9 < size; i9++) {
            MessageObject messageObject2 = groupedMessages.messages.get(i9);
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

    public static void C0(org.telegram.ui.qn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.t1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.C0(org.telegram.ui.qn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1, int, int):void");
    }

    public static TLRPC.TL_message C7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22401id = message.f22401id;
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

    public static void D0(qn qnVar) {
        qnVar.G7(false);
        if (!qnVar.fragmentBeginToShow) {
            ij ijVar = qnVar.f42077t0;
            ijVar.U1 = false;
            ijVar.V1 = 0;
            ijVar.setEmptyView(qnVar.M0);
            ij ijVar2 = qnVar.f42077t0;
            ijVar2.U1 = true;
            ijVar2.V1 = 1;
            return;
        }
        qnVar.f42077t0.setEmptyView(qnVar.M0);
    }

    public static SpannableStringBuilder D8(MessageObject messageObject, boolean z10, long j10) {
        TLRPC.Chat chat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long fromChatId = messageObject.getFromChatId();
            if (j10 != fromChatId) {
                int i9 = (fromChatId > 0L ? 1 : (fromChatId == 0L ? 0 : -1));
                if (i9 > 0) {
                    TLRPC.User user = MessagesController.getInstance(messageObject.currentAccount).getUser(Long.valueOf(fromChatId));
                    if (user != null) {
                        spannableStringBuilder.append((CharSequence) ContactsController.formatName(user.first_name, user.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i9 < 0 && (chat = MessagesController.getInstance(messageObject.currentAccount).getChat(Long.valueOf(-fromChatId))) != null) {
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

    public static void E0(org.telegram.ui.qn r19, org.telegram.ui.dk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.E0(org.telegram.ui.qn, org.telegram.ui.dk, boolean[]):void");
    }

    public static void F0(qn qnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(qnVar.currentAccount).getInputUser(user.f22527id);
                    ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new rc(3, qnVar, user));
                }
            }
        }
    }

    public static void G1(qn qnVar) {
        int i9;
        if (qnVar.a() == qnVar.getUserConfig().getClientUserId() && qnVar.getUserConfig().isPremium() && qnVar.Xa == null) {
            rk rkVar = new rk(qnVar, qnVar, qnVar.getParentActivity(), qnVar.currentAccount, qnVar.f41848aa);
            qnVar.Xa = rkVar;
            rkVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            qnVar.Xa.setDelegate(new sk(qnVar));
            qnVar.Xa.setTop(true);
            int i10 = 0;
            qnVar.Xa.setClipChildren(false);
            qnVar.Xa.setClipToPadding(false);
            qnVar.Xa.setVisibility(0);
            rk rkVar2 = qnVar.Xa;
            if (rkVar2.getSelectedReactions().isEmpty()) {
                i9 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i9 = R.string.SavedTagReactionsSelectedEditHint;
            }
            rkVar2.setHint(LocaleController.getString(i9));
            qnVar.T0.addView(qnVar.Xa, g7.e6.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            qnVar.Xa.p(null, null, true);
            qnVar.Xa.setTranslationY(-AndroidUtilities.dp(12.0f));
            qnVar.Xa.setScaleY(0.4f);
            qnVar.Xa.setScaleX(0.4f);
            qnVar.Xa.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            qnVar.Lc();
            rk rkVar3 = qnVar.Xa;
            float f10 = qnVar.f42073s9;
            mk mkVar = qnVar.f41967k1;
            if (mkVar != null) {
                i10 = mkVar.getCurrentHeight();
            }
            rkVar3.setTranslationY(f10 + i10);
        }
    }

    public static void H0(qn qnVar, String str) {
        Uri parse = Uri.parse(str);
        r50.b(qnVar.getParentActivity(), qnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static java.util.ArrayList H7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.H7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void I0(qn qnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        zf.k1 k1Var = new zf.k1(qnVar, qnVar.currentAccount, user, null, null, qnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            k1Var.f50591z0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(qnVar.getParentActivity());
        org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(160.0f), 4, o9Var, false);
        o9Var.setImageDrawable(i5Var);
        o9Var.addOnAttachStateChangeListener(new e5(i5Var, 1));
        i5Var.j(j10, false);
        k1Var.A0 = true;
        k1Var.f50589x0 = o9Var;
        qnVar.showDialog(k1Var);
    }

    public static void J3(qn qnVar) {
        org.telegram.ui.ActionBar.y yVar;
        if (!qnVar.Za && (yVar = qnVar.f41891e0) != null) {
            yVar.a();
            org.telegram.ui.ActionBar.w0 w0Var = yVar.f23965m;
            w0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (qnVar.N3 == 0) {
                w0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            w0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            w0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i41(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            w0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = qnVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f34062a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.wz0(obj, 0), 0, spannableStringBuilder4.length(), 33);
                w0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f34062a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.wz0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                w0Var.g(56, spannableStringBuilder5);
            }
            w0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (qnVar.h == null) {
                w0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            w0Var.g(54, LocaleController.getString(R.string.Regular));
            qnVar.Za = true;
        }
    }

    public static FrameLayout J7(Context context, org.telegram.ui.ActionBar.b6 b6Var, CharSequence charSequence, int i9) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        bg.t tVar = new bg.t(context, 13);
        int i10 = 3;
        tVar.setMaxLines(3);
        tVar.setGravity(3);
        tVar.setEllipsize(TextUtils.TruncateAt.END);
        tVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.E8, b6Var));
        tVar.setTextSize(1, i9);
        tVar.setMaxWidth(AndroidUtilities.dp(170.0f));
        tVar.setText(charSequence);
        if (LocaleController.isRTL) {
            i10 = 5;
        }
        frameLayout.addView(tVar, g7.e6.e(-1, -2, i10 | 16));
        return frameLayout;
    }

    public static void K0(qn qnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            gh.oa.j1(qnVar.getParentActivity(), qnVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, qnVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            qnVar.presentFragment(new co0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void L0(qn qnVar) {
        if (AndroidUtilities.addToClipboard(qnVar.Ib.sponsoredInfo)) {
            org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.resourceProvider));
        }
    }

    public static void M0(qn qnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = qnVar.E1.getAdapter().f19343s0;
        int i9 = qnVar.currentAccount;
        TLRPC.User user2 = qnVar.f41903f;
        if (user2 != null) {
            j10 = user2.f22527id;
        } else {
            j10 = qnVar.f41890e.f22380id;
        }
        mh.s4 b10 = mh.s4.b(i9, j10, user.f22527id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, qnVar.N8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.C1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(qnVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(qnVar.currentAccount);
            MessagesController.showCantOpenAlert(qnVar, restrictionReason);
            return;
        }
        mh.c3 c3Var = new mh.c3(qnVar.getParentActivity(), qnVar.getResourceProvider());
        c3Var.w(false);
        c3Var.f17777w0 = true;
        c3Var.f17758g0 = qnVar.getParentActivity();
        c3Var.s(qnVar, b10);
        c3Var.show();
    }

    public static void N0(qn qnVar, int i9, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (qnVar.f41940hb != i9) {
            return;
        }
        if (bool.booleanValue()) {
            qnVar.C5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                qnVar.C5 = null;
                MessagePreviewParams messagePreviewParams = qnVar.f41857b5;
                if (messagePreviewParams != null) {
                    int i10 = qnVar.currentAccount;
                    CharSequence fieldText = qnVar.U.getFieldText();
                    MessageObject messageObject3 = qnVar.f41959j5;
                    if (messageObject3 == qnVar.T3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i10, null, fieldText, messageObject2, qnVar.f41934h5, qnVar.f41982l5);
                }
                qnVar.j8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                qnVar.E5 = str;
            }
            if (qnVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = qnVar.f41857b5;
            if (messagePreviewParams2 != null) {
                int i11 = qnVar.currentAccount;
                CharSequence fieldText2 = qnVar.U.getFieldText();
                MessageObject messageObject4 = qnVar.f41959j5;
                if (messageObject4 == qnVar.T3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i11, null, fieldText2, messageObject, qnVar.f41934h5, qnVar.f41982l5);
            }
            qnVar.Eb(true, qnVar.C5, false);
            return;
        }
        qnVar.C5 = null;
        qnVar.j8();
    }

    public static void O0(qn qnVar, Long l10, Boolean bool) {
        int i9;
        int i10;
        if (l10.longValue() != qnVar.b()) {
            qnVar.Wa = SystemClock.uptimeMillis();
            qnVar.f41984l7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                qnVar.Sa(qnVar.b());
            } else if (qnVar.b() == 0) {
                qnVar.Sa(l10.longValue());
            } else {
                qnVar.f41961j7 = -1;
            }
            qnVar.getConnectionsManager().cancelRequestsForGuid(qnVar.classGuid);
            qnVar.getMessagesStorage().cancelTasksForGuid(qnVar.classGuid);
            qnVar.classGuid = ConnectionsManager.generateClassGuid();
            qnVar.Pa();
            qnVar.f41857b5 = null;
            qnVar.f42043q7 = 0;
            qnVar.f41923g7 = false;
            qnVar.f41936h7 = true;
            qnVar.f41884d6.clear();
            qnVar.Z3 = l10.longValue();
            TLRPC.TL_forumTopic findTopic = qnVar.getMessagesController().getTopicsController().findTopic(-qnVar.a(), l10.longValue());
            if (l10.longValue() != 0 && findTopic != null) {
                int i11 = findTopic.read_inbox_max_id;
                qnVar.f41920g4 = i11;
                qnVar.f41933h4 = findTopic.read_outbox_max_id;
                qnVar.f41946i4 = Math.max(1, i11);
                qnVar.getMessagesController().getTopicsController().getTopicRepliesCount(qnVar.P5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                qnVar.Y3 = null;
                qnVar.W3 = null;
                qnVar.T3 = null;
                qnVar.f41959j5 = null;
                qnVar.f41920g4 = 0;
                qnVar.f41933h4 = 0;
                qnVar.f41946i4 = 0;
                qnVar.Z3 = 0L;
                qnVar.f41842a4 = 0;
                qnVar.f41856b4 = null;
                qnVar.f41882d4 = false;
                qnVar.f41869c4 = false;
            }
            qnVar.r8();
            qnVar.Nc(true);
            qnVar.W0.n(true);
            qnVar.W0.b();
            qnVar.N1.setCurrentTopic(l10.longValue());
            qnVar.Qc(true);
            qnVar.hc(true);
            qnVar.getMessagesController().setForumLastTopicId(-qnVar.a(), qnVar.b());
            qnVar.g9(true);
            qnVar.e9(true);
            ak akVar = qnVar.U;
            if (akVar != null) {
                akVar.l0(false);
                qnVar.U.G1(true);
            }
            qnVar.A6(true, true);
            if (findTopic != null) {
                i9 = findTopic.unread_reactions_count;
            } else {
                i9 = 0;
            }
            qnVar.f41930h1 = i9;
            if (findTopic != null) {
                i10 = findTopic.unread_poll_votes_count;
            } else {
                i10 = 0;
            }
            qnVar.f41943i1 = i10;
            qnVar.Bc(false);
            qnVar.Ac(false);
            qnVar.Rc();
            in inVar = qnVar.f41977kc;
            if (inVar != null && qnVar.actionBar.f23577j0) {
                inVar.p(null);
            }
        }
    }

    public static e5.w O4(qn qnVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = qnVar.getMessagesController().createDeleteShowOnceTask(qnVar.P5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                qnVar.tc(arrayList, true);
            }
            return new e5.w(qnVar, createDeleteShowOnceTask, messageObject, 17);
        }
        return null;
    }

    public static void P0(qn qnVar) {
        int i9;
        String str;
        int i10;
        Activity parentActivity = qnVar.getParentActivity();
        int i11 = qnVar.currentAccount;
        long j10 = qnVar.P5;
        on onVar = qnVar.f41848aa;
        int i12 = org.telegram.ui.Components.yn.H;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(parentActivity, onVar, false, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23072h5, onVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, onVar)));
        linearLayout.addView((View) imageView, g7.e6.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i11).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i13 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, onVar));
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i9 = R.string.PremiumMessageHeaderLocked;
        } else {
            i9 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i9));
        linearLayout.addView(textView, g7.e6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i13, onVar));
        textView2.setTextSize(1, 14.0f);
        if (j10 > 0) {
            str = UserObject.getFirstName(MessagesController.getInstance(i11).getUser(Long.valueOf(j10)));
        } else {
            str = "";
        }
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageTextLocked;
        } else {
            i10 = R.string.PremiumMessageText;
        }
        org.telegram.messenger.ll.q(i10, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, g7.e6.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            zf.p0 p0Var = new zf.p0(parentActivity, onVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.z2(f3Var, 1));
            p0Var.c(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(p0Var, g7.e6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(linearLayout);
        f3Var.show();
    }

    public static void Q0(qn qnVar, int i9, MessageObject messageObject) {
        if (i9 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f22421id = qnVar.getMessagesController().getInputUser(qnVar.f41903f);
            qnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new je(qnVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(qnVar.getUserConfig().getCurrentUser(), qnVar.P5, messageObject, qnVar.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = qnVar.C8();
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendMessage(of2);
        if (qnVar.N3 == 0) {
            qnVar.O9(false);
        }
        qnVar.e9(false);
    }

    public static qn Q9(int i9, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i9);
        return new qn(bundle);
    }

    public static boolean R0(qn qnVar) {
        MessageObject messageObject = qnVar.Ib;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static qn R9(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new qn(bundle);
    }

    public static void S0(qn qnVar, int i9) {
        int i10;
        RectF rectF;
        ng.d dVar = qnVar.D;
        ng.d dVar2 = qnVar.E;
        ArrayList arrayList = qnVar.Bc;
        ig.e eVar = qnVar.B;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 31 && eVar != null) {
            if (g7.z7.a(i9, 4)) {
                qnVar.p9();
            }
            if (g7.z7.a(i9, 2)) {
                ArrayList arrayList2 = qnVar.Ac;
                if (i11 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, qnVar.T0.getMeasuredWidth(), qnVar.f42077t0.getY() + qnVar.f42077t0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i10 = dVar2.c(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                    } else {
                        i10 = 0;
                    }
                    if (dVar != null) {
                        i10 += dVar.c(arrayList2, i10, AndroidUtilities.dp(8.0f));
                    }
                } else {
                    i10 = 0;
                }
                int a2 = ff.m0.a(arrayList2, i10, arrayList);
                int measuredWidth = qnVar.T0.getMeasuredWidth();
                for (int i12 = 0; i12 < a2; i12++) {
                    RectF rectF2 = (RectF) arrayList.get(i12);
                    float f10 = measuredWidth;
                    rectF2.left = g7.n.a(rectF2.left, 0.0f, f10);
                    rectF2.top = Math.max(qnVar.f42077t0.getY(), rectF2.top);
                    rectF2.right = g7.n.a(rectF2.right, 0.0f, f10);
                    rectF2.bottom = Math.min(qnVar.f42077t0.getY() + qnVar.f42077t0.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            im imVar = qnVar.T0;
            Objects.requireNonNull(imVar);
            if (eVar.e(new uf(imVar, 0), qnVar.T0.getWidth(), qnVar.T0.getHeight())) {
                if (dVar != null) {
                    dVar.d();
                }
                if (dVar2 != null) {
                    dVar2.d();
                }
                org.telegram.ui.ActionBar.k kVar = qnVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                qnVar.n9();
            }
        }
    }

    public static void T(org.telegram.ui.qn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.T(org.telegram.ui.qn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void T0(qn qnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(qnVar.currentAccount).getInputUser(user.f22527id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(qnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static MessageObject T1(qn qnVar) {
        org.telegram.ui.Cells.t1 t1Var = qnVar.Z8;
        if (e2.c.v(t1Var)) {
            return t1Var.getMessageObject();
        }
        return null;
    }

    public static void U(qn qnVar, int i9) {
        if (i9 != 0) {
            AndroidUtilities.runOnUIThread(new ve(qnVar, i9, 6));
        } else {
            qnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void U0(qn qnVar, int i9, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, lf lfVar) {
        String str4;
        org.telegram.ui.Components.s21 s21Var;
        if (qnVar.Z4 != null && i9 < arrayList.size() && qnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = qnVar.getParentActivity();
            int i10 = iArr[0];
            gf gfVar = new gf(qnVar, 20);
            String[] strArr = org.telegram.ui.Components.z21.N;
            if (parentActivity == null) {
                s21Var = null;
            } else {
                org.telegram.ui.Components.s21 s21Var2 = new org.telegram.ui.Components.s21(parentActivity, str, str4, inputPeer, i10, richMessage, gfVar);
                s21Var2.G(z10);
                s21Var2.I = qnVar;
                s21Var2.J = lfVar;
                if (qnVar.getParentActivity() != null) {
                    qnVar.showDialog(s21Var2);
                }
                s21Var = s21Var2;
            }
            s21Var.setDimBehind(false);
            qnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i11 - 1).apply();
                qnVar.Qc(true);
            }
        }
    }

    public static void U4(qn qnVar, org.telegram.ui.Cells.t1 t1Var) {
        int i9;
        int themedColor;
        int i10;
        td.a aVar = qnVar.f42076sc;
        if (qnVar.U != null && !aVar.f47776f && t1Var.getMessageObject() != null) {
            im imVar = qnVar.T0;
            RectF rectF = AndroidUtilities.rectTmp;
            pg.i.c(t1Var, imVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            ah.a aVar2 = t1Var.W5;
            if (aVar2 != null && t1Var.f25436j6) {
                rect.set(aVar2.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((qnVar.T0.getMeasuredHeight() - qnVar.f42077t0.getPaddingBottom()) + qnVar.f42024oc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = t1Var.getMessageObject();
                if (qnVar.yc == null) {
                    qnVar.yc = new yg.c(qnVar.getParentActivity(), qnVar.resourceProvider, qnVar);
                    int indexOfChild = qnVar.T0.indexOfChild(qnVar.f42077t0);
                    if (indexOfChild >= 0) {
                        qnVar.T0.addView(qnVar.yc, indexOfChild + 1, g7.e6.g());
                    } else {
                        qnVar.T0.addView(qnVar.yc, g7.e6.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (t1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.f6.f23184nb;
                    } else {
                        i10 = org.telegram.ui.ActionBar.f6.f23272sb;
                    }
                    themedColor = qnVar.getThemedColor(i10);
                } else {
                    if (t1Var.f3()) {
                        i9 = org.telegram.ui.ActionBar.f6.f23201od;
                    } else {
                        i9 = org.telegram.ui.ActionBar.f6.nd;
                    }
                    themedColor = qnVar.getThemedColor(i9);
                }
                qnVar.yc.setColor(themedColor);
                qnVar.yc.setCellToWatch(t1Var);
                qnVar.yc.f50209b.f50205a.a(false, false);
                qnVar.yc.setAnimatedVisibility(aVar.f47775e);
                qnVar.yc.f50209b.setOnClickListener(new kh.x8(new jg(qnVar, 2), 26));
                yg.c cVar = qnVar.yc;
                cVar.f50215s = new jg(qnVar, 3);
                fh.s sVar = cVar.f50208a;
                sVar.setOnKeyListener(new kg(qnVar, 0));
                sVar.setOnEditorActionListener(new ea(qnVar, 1));
                qnVar.U.P4 = sVar;
                AndroidUtilities.runOnUIThread(new d5.i(qnVar, measuredHeight, sVar, 29), 100L);
                aVar.a(true, true);
            }
        }
    }

    public static void V(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(qnVar.currentAccount).loadAttachMenuBots(false, true);
            qnVar.W9(user.f22527id, qnVar.f41924g8, false);
        }
    }

    public static void V0(qn qnVar, TLRPC.ReactionCount reactionCount) {
        qnVar.A7(true);
        org.telegram.ui.Components.sm0.c(qnVar.getParentActivity(), qnVar.currentAccount, reactionCount.reaction, qnVar.f41848aa);
    }

    public static void V1(qn qnVar, float f10) {
        org.telegram.ui.Cells.t1 t1Var = qnVar.Z8;
        if (e2.c.v(t1Var)) {
            t1Var.setSlidingOffset(f10);
        }
    }

    public static void W(qn qnVar) {
        if (!qnVar.e7(qnVar.U.getSendButton())) {
            if (qnVar.getMediaController().isPlayingMessage(qnVar.Z4)) {
                qnVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = qnVar.getMessagesController().getInputPeer(qnVar.P5);
            if (qnVar.f41843a5 != null) {
                for (int i9 = 0; i9 < qnVar.f41843a5.messages.size(); i9++) {
                    tL_messages_sendScheduledMessages.f22496id.add(Integer.valueOf(qnVar.f41843a5.messages.get(i9).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f22496id.add(Integer.valueOf(qnVar.Z4.getId()));
            }
            ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new rc(4, qnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void W0(qn qnVar, String str) {
        if (MessagesController.getInstance(qnVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            ve.e.m(qnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.y4.o0(qnVar.getParentActivity(), qnVar.f41848aa, str, true, new dg(qnVar, str, 1));
        }
    }

    public static void X(qn qnVar, long j10, long j11, Long l10, Boolean bool) {
        boolean z10;
        gh.v7 y10 = gh.v7.y(qnVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        } else {
            z10 = false;
        }
        y10.i0(j10, j11, z10, true);
    }

    public static void X0(qn qnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        qnVar.Mb(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void X1(qn qnVar) {
        long j10;
        kp kpVar = qnVar.L9;
        if (kpVar != null) {
            if (qnVar.f41882d4) {
                if (kpVar.D != null) {
                    if (qnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.g9.a(qnVar, qnVar.getParentLayout().getFragmentStack().indexOf(qnVar), qnVar.f41890e, qnVar.f41903f, qnVar.Y3, qnVar.P5, qnVar.f42060ra, qnVar.f42046qa);
                    }
                    TLRPC.Chat chat = qnVar.f41890e;
                    TLRPC.TL_forumTopic tL_forumTopic = qnVar.L9.D;
                    long j11 = qnVar.P5;
                    int i9 = qnVar.f42046qa;
                    int i10 = qnVar.f42060ra;
                    if (qnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.g9.a(qnVar, qnVar.getParentLayout().getFragmentStack().indexOf(qnVar), chat, null, tL_forumTopic, j11, i9, i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", qnVar.L9.f39885a);
                    bundle.putInt("dialog_filter_id", qnVar.L9.f39887b);
                    bundle.putBoolean("pulled", true);
                    qn g10 = vf.c.g(qnVar, -qnVar.P5, qnVar.L9.D, 0, bundle);
                    g10.N9 = true;
                    Kc = true;
                    qnVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = kpVar.C;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f22380id;
            }
            if (j10 != 0) {
                qnVar.v6();
                kp kpVar2 = qnVar.L9;
                TLRPC.Chat chat3 = kpVar2.C;
                long j13 = kpVar2.V;
                int i11 = kpVar2.f39885a;
                int i12 = kpVar2.f39887b;
                if (qnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.g9.a(qnVar, qnVar.getParentLayout().getFragmentStack().indexOf(qnVar), chat3, null, null, j13, i11, i12);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = qnVar.L9.C;
                if (chat4 != null) {
                    j12 = chat4.f22380id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", qnVar.L9.f39885a);
                bundle2.putInt("dialog_filter_id", qnVar.L9.f39887b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(qnVar.currentAccount).edit().remove("diditem" + qnVar.L9.V).apply();
                qn qnVar2 = new qn(bundle2);
                ArrayList arrayList = qnVar.f41862bb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = qnVar.f41862bb;
                    qnVar2.f41862bb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                qnVar2.N9 = true;
                Kc = true;
                qnVar.presentFragment(qnVar2, true);
            }
        }
    }

    public static void Y(qn qnVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (qnVar.getParentActivity() != null) {
            TLRPC.Chat chat = qnVar.f41890e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !qnVar.f41890e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (qnVar.h == null && (userFull = qnVar.W7) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new oe(qnVar, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qnVar.showDialog(alertDialog$Builder.f22702a);
            } else if (!qnVar.D4.isEmpty()) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("pin_" + qnVar.P5, ((Integer) qnVar.D4.get(0)).intValue()).commit();
                qnVar.yc(0, true);
            }
        }
    }

    public static void Y0(qn qnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i9, MessageObject messageObject, int i10, int i11, MessageObject messageObject2) {
        boolean z10;
        int i12;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i13 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            qnVar.fc = true;
            qnVar.f42077t0.f1();
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
            qn qnVar2 = new qn(bundle);
            qnVar2.pb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i9 != 0) {
                qnVar2.H7 = i9;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = qnVar2.T3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                qnVar2.T3.messageOwner.reactions = tL_messageReactions;
            }
            c3.d dVar = new c3.d(qnVar, new boolean[]{false}, i10, qnVar2, 13);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i14 = message.f22401id;
                        i12 = i11;
                        if (i14 > i12 && !message.out) {
                            i13 = i14;
                            break;
                        }
                    }
                }
                i12 = i11;
                final int classGuid = qnVar2.getClassGuid();
                NotificationCenter.getInstance(qnVar.currentAccount).addObserver(new mi(qnVar, classGuid, dVar, qnVar2), NotificationCenter.messagesDidLoad);
                final int i15 = i12;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i16;
                        int i17;
                        qn qnVar3 = qn.this;
                        MessagesController messagesController = qnVar3.getMessagesController();
                        TLRPC.messages_Messages messages_messages2 = messages_messages;
                        int size2 = messages_messages2.messages.size();
                        int i18 = i9;
                        if (i18 > 0) {
                            i16 = i18;
                        } else {
                            i16 = i15;
                        }
                        if (i18 > 0) {
                            i17 = 3;
                        } else {
                            i17 = 2;
                        }
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i16, 0, false, classGuid, i13, 0, 0, 0, i17, true, 0, ((MessageObject) j3.r0.j(1, arrayList)).getId(), 1, false, 0, true, qnVar3.f41882d4, null);
                    }
                });
                return;
            }
            dVar.run();
            return;
        }
        qnVar.ec = 0;
        qnVar.fc = false;
        qnVar.f42077t0.f1();
        if (messageObject2 != null) {
            qnVar.ga(messageObject2);
        } else if (qnVar.getParentActivity() != null) {
            org.telegram.ui.Components.oc.a0(qnVar).t(LocaleController.getString(R.string.ChannelPostDeleted), qnVar.f41848aa).j();
        }
    }

    public static void Z(qn qnVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i9, int i10) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(qnVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, qnVar, null, i9, i10);
        } else {
            SendMessagesHelper.getInstance(qnVar.currentAccount).editMessage(messageObject, null, false, qnVar, null, i9, i10);
        }
    }

    public static void Z0(qn qnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = qnVar.getMessagesController().getInputPeer(qnVar.P5);
                tL_messages_getHistory.offset_date = qnVar.f42071s7 + 86400;
                tL_messages_getHistory.limit = 1;
                qnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new rc(2, qnVar, tLObject));
                return;
            }
            qnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a0(qn qnVar, long j10, boolean z10) {
        if (!qnVar.D4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
            edit.putInt("pin_" + qnVar.P5, ((Integer) qnVar.D4.get(0)).intValue()).commit();
            qnVar.D4.clear();
            qnVar.F4.clear();
            qnVar.H4 = 0;
            qnVar.L4 = 0;
            qnVar.M4 = 0;
            qnVar.yc(0, true);
        }
        if (ChatObject.isMonoForum(qnVar.f41890e) && ChatObject.canManageMonoForum(qnVar.currentAccount, qnVar.f41890e)) {
            if (j10 != 0) {
                qnVar.getMessagesStorage().removeTopic(-qnVar.f41890e.f22380id, j10);
                qnVar.getMessagesController().deleteSavedDialog(j10, qnVar.getMessagesController().getInputPeer(-qnVar.f41890e.f22380id));
                qnVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(qnVar.f41890e.f22380id, j10);
            }
        } else {
            qnVar.getMessagesController().deleteDialog(qnVar.P5, 1, z10);
            qnVar.getMessagesStorage().removeAllTopics(qnVar.P5);
            qnVar.getMessagesController().getTopicsController().reloadTopics(-qnVar.P5);
        }
        qnVar.I5.put(j10, 0);
        org.telegram.ui.Components.b21 b21Var = qnVar.N1;
        if (b21Var != null) {
            b21Var.setAllTopicsHidden(false);
        }
        if (j10 == qnVar.Z3) {
            qnVar.y7(false, null);
            qnVar.f42114w0.O(false);
        }
    }

    public static void a1(long j10, qn qnVar) {
        if (gh.v7.y(qnVar.currentAccount, false).p().amount < j10) {
            new gh.ea(qnVar.getParentActivity(), qnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(qnVar.a()), new gf(qnVar, 15), qnVar.a()).show();
        } else {
            new gh.fa(qnVar.getParentActivity(), qnVar.resourceProvider).show();
        }
    }

    public static void b0(qn qnVar, int i9, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, lf lfVar) {
        String str4;
        if (qnVar.Z4 != null && i9 < arrayList.size() && qnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = qnVar.Z4;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.z21.I(qnVar.getParentActivity(), qnVar, inputPeer, iArr[0], qnVar.Z4.summarized, str, str4, charSequence, z10, lfVar, new gf(qnVar, 28)).setDimBehind(false);
            qnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i10 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i10 - 1).apply();
                qnVar.Qc(true);
            }
        }
    }

    public static void b1(qn qnVar) {
        if (AndroidUtilities.addToClipboard(qnVar.Ib.sponsoredAdditionalInfo)) {
            org.telegram.messenger.ll.o(R.string.TextCopied, new org.telegram.ui.Components.oc(org.telegram.ui.Components.cb.a(qnVar.getParentActivity()), qnVar.resourceProvider));
        }
    }

    public static void b2(qn qnVar, View view, boolean z10, float f10, float f11) {
        MessageObject messageObject;
        int i9;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            messageObject = t1Var.getMessageObject();
            t1Var.f25329c1 = f10;
            t1Var.f25344d1 = f11;
            org.telegram.ui.Components.y90 y90Var = t1Var.Gc;
            float f12 = t1Var.f25344d1;
            y90Var.h = t1Var.getTranslationX() + f10;
            y90Var.f34908i = f12;
            y90Var.f34911l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int E8 = qnVar.E8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && E8 >= 2 && E8 != 20 && E8 != 21) {
            if (messageObject == null || ((i9 = messageObject.type) != 27 && i9 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        qnVar.x6(messageObject, z10, true);
                        qnVar.dc();
                        qnVar.Wc(false);
                    }
                }
            }
        }
    }

    public static void b4(qn qnVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(qnVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new a7(qnVar, h0Var, text, 3), new b1(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void c0(qn qnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(qnVar.currentAccount);
        int i9 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f22496id;
        long clientUserId = qnVar.getUserConfig().getClientUserId();
        long j11 = qnVar.P5;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, arrayList, valueOf, bool, bool);
    }

    public static void c1(qn qnVar, long j10, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(qnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.iz0.c(qnVar.getParentActivity(), qnVar.currentAccount, -j10, qnVar.getUserConfig().getCurrentUser(), null, z10, z11, qnVar.getResourceProvider());
    }

    public static void c2(qn qnVar, int i9) {
        int i10;
        boolean z10;
        ArrayList arrayList = qnVar.f42042q6;
        SparseArray[] sparseArrayArr = qnVar.S5;
        if (!qnVar.Ka && (i10 = i9 - qnVar.f42114w0.F) >= 0 && i10 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i10);
            if (sparseArrayArr[0].get(messageObject.getId(), null) == null && sparseArrayArr[1].get(messageObject.getId(), null) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i11), (MessageObject) sparseArrayArr[0].valueAt(i11));
            }
            for (int i12 = 0; i12 < sparseArrayArr[1].size(); i12++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i12), (MessageObject) sparseArrayArr[1].valueAt(i12));
            }
            org.telegram.ui.Components.wk0 wk0Var = qnVar.f42077t0;
            ei eiVar = new ei(qnVar, z10, sparseArray);
            if (!wk0Var.Z1) {
                wk0Var.f34255i2 = new int[2];
                new HashSet();
                wk0Var.l1(wk0Var, true);
                wk0Var.f34245d2 = eiVar;
                wk0Var.Z1 = true;
                wk0Var.f34243c2 = i9;
                wk0Var.f34241b2 = i9;
            }
        }
    }

    public static void d0(qn qnVar, int i9) {
        org.telegram.ui.ActionBar.b5 b5Var = qnVar.parentLayout;
        if (b5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.o2 backgroundFragment = b5Var.getBackgroundFragment();
        if (backgroundFragment instanceof qn) {
            qn qnVar2 = (qn) backgroundFragment;
            if (qnVar2.a() == qnVar.P5) {
                qnVar.finishFragment();
                qnVar2.j(i9, 0, true, 0, true, 0);
                return;
            }
        }
        qnVar.presentFragment(Q9(i9, qnVar.P5));
    }

    public static void d1(qn qnVar, TLRPC.User user, String str, Boolean bool) {
        Intent intent;
        String country;
        if (qnVar.getParentActivity() == null) {
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
            TLRPC.User currentUser = qnVar.getUserConfig().getCurrentUser();
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
                    obj.f40225a = split[2];
                    String str2 = split[0];
                    obj.f40227c = str2;
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
            int i9 = 4;
            while (true) {
                if (i9 < 1) {
                    break;
                }
                List list2 = (List) hashMap.get(str4.substring(0, i9));
                if (list2 != null && list2.size() > 0) {
                    String str5 = ((lt) list2.get(0)).f40227c;
                    if (str5.endsWith("0") && str.startsWith("0")) {
                        str = str.substring(1);
                    }
                    str = aa.d.o("+", str5, str);
                    z10 = true;
                } else {
                    i9--;
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
                str = aa.d.o("+", country, str);
            }
        }
        contentValues.put("data1", str);
        contentValues.put("data2", (Integer) 2);
        arrayList.add(contentValues);
        intent.putExtra("finishActivityOnSaveCompleted", true);
        intent.putParcelableArrayListExtra("data", arrayList);
        qnVar.getParentActivity().startActivity(intent);
    }

    public static boolean d2(qn qnVar, View view, RectF rectF) {
        RectF rectF2 = qnVar.Bb;
        if (rectF != null && qnVar.f42077t0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void d4(qn qnVar) {
        if (qnVar.E3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i9 = qnVar.N3;
        if (i9 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i9 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f22401id = 0;
        MessageObject messageObject = new MessageObject(qnVar.currentAccount, tL_message, false, false);
        qnVar.E3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void e0(qn qnVar, gf.a aVar, Runnable runnable) {
        if (!qnVar.isFinished) {
            if (gf.a.m(gh.v7.x(qnVar.currentAccount, aVar.f7747a).p()).f7748b < aVar.f7748b) {
                gf.b bVar = aVar.f7747a;
                if (bVar == gf.b.f7749a) {
                    new gh.ea(qnVar.getParentActivity(), qnVar.getResourceProvider(), aVar.a(), 13, vf.c.h(qnVar.currentAccount, qnVar.a()), null, qnVar.a()).show();
                    return;
                } else if (bVar == gf.b.f7750b) {
                    new lh.f(qnVar.getParentActivity(), qnVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void e1(qn qnVar, int i9) {
        if (qnVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 q82 = qnVar.q8(i9, false);
            if (q82 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q82;
                hg.s0 s0Var = t1Var.J;
                TLRPC.MessagePeerReaction randomUnreadReaction = t1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (s0Var.K || randomUnreadReaction.big)) {
                    hg.n0.d(qnVar, null, q82, null, 0.0f, 0.0f, hg.r0.d(randomUnreadReaction.reaction), qnVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    hg.n0.f();
                }
                s0Var.K = false;
                MessageObject messageObject = t1Var.f25593u7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (q82 instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) q82;
                hg.s0 s0Var2 = w0Var.f25882y0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = w0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (s0Var2.K || randomUnreadReaction2.big)) {
                    hg.n0.d(qnVar, null, q82, null, 0.0f, 0.0f, hg.r0.d(randomUnreadReaction2.reaction), qnVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    hg.n0.f();
                }
                s0Var2.K = false;
                MessageObject messageObject2 = w0Var.D0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void e4(qn qnVar) {
        if (qnVar.F3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f22401id = 0;
        MessageObject messageObject = new MessageObject(qnVar.currentAccount, tL_message, false, false);
        qnVar.F3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void f0(qn qnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + qnVar.P5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(qnVar.f41890e) && !qnVar.f41890e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i9 = org.telegram.ui.Components.p70.f31565r;
            org.telegram.ui.Components.p70.w(context, qnVar, org.telegram.ui.Components.oc.a0(qnVar), z10);
        }
        qnVar.vb(false, true);
    }

    public static void f1(qn qnVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        qnVar.f41870c5 = null;
        int i9 = qnVar.f41976kb;
        if (i9 == 2) {
            qnVar.f41934h5 = null;
            qnVar.f41959j5 = null;
            MessagePreviewParams messagePreviewParams = qnVar.f41857b5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, qnVar.P5, null);
            }
            qnVar.j8();
        } else if (i9 == 3) {
            MessagePreviewParams messagePreviewParams2 = qnVar.f41857b5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = qnVar.f41857b5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    MessageObject messageObject3 = qnVar.f41857b5.forwardMessages.messages.get(i10);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.E0 = true;
                if (j11 > 0) {
                    TLRPC.User user = qnVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", qnVar.f41857b5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = qnVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", qnVar.f41857b5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                c2Var.P = AndroidUtilities.replaceTags(formatString);
                c2Var.N = LocaleController.formatPluralString("messages", qnVar.f41857b5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new oe(qnVar, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new oe(qnVar, 5));
                qnVar.showDialog(c2Var);
                TextView textView = (TextView) c2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
                }
            }
        } else if (i9 == 4) {
            qnVar.C5 = null;
            MessagePreviewParams messagePreviewParams3 = qnVar.f41857b5;
            if (messagePreviewParams3 != null) {
                int i11 = qnVar.currentAccount;
                MessageObject messageObject4 = qnVar.f41959j5;
                if (messageObject4 == qnVar.T3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i11, null, null, messageObject2, qnVar.f41934h5, qnVar.f41982l5);
            }
            ak akVar = qnVar.U;
            akVar.S2 = null;
            akVar.T2 = false;
            qnVar.i8();
            qnVar.j8();
        } else {
            if (ChatObject.isForum(qnVar.f41890e) && !qnVar.f41882d4 && (messageObject = qnVar.f41959j5) != null) {
                long topicId = MessageObject.getTopicId(qnVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    qnVar.getMediaDataController().cleanDraft(qnVar.P5, topicId, false);
                }
            }
            qnVar.zb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void g0(qn qnVar, MessageObject messageObject, Long l10, Runnable runnable) {
        gh.v7.y(qnVar.currentAccount, false).l0(messageObject, l10.longValue(), runnable, false);
    }

    public static void g1(qn qnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        qn qnVar2;
        int i9;
        int i10;
        TLRPC.TL_forumTopic findTopic;
        pg.a aVar = qnVar.Mb;
        if (num.intValue() != qnVar.b()) {
            qnVar.jc = false;
            ye yeVar = qnVar.Jb;
            if (yeVar != null) {
                AndroidUtilities.cancelRunOnUIThread(yeVar);
                qnVar.Jb.run();
                qnVar.Jb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.b21 b21Var = qnVar.N1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(b21Var.f27001b).getTopicsController().getTopics(-b21Var.f27002c);
            if (topics != null) {
                int size = topics.size();
                int i11 = 0;
                while (i11 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i11);
                    i11++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f22432id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = qnVar.getMessagesController().getTopicsController().findTopic(-qnVar.a(), tL_forumTopic.f22432id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                qnVar.Wa = SystemClock.uptimeMillis();
                qnVar.f41984l7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    qnVar.Sa(qnVar.b());
                } else if (qnVar.b() == 0) {
                    qnVar.Sa(num.intValue());
                } else {
                    qnVar.f41961j7 = -1;
                }
                qnVar.getConnectionsManager().cancelRequestsForGuid(qnVar.classGuid);
                qnVar.getMessagesStorage().cancelTasksForGuid(qnVar.classGuid);
                qnVar.classGuid = ConnectionsManager.generateClassGuid();
                qnVar.Pa();
                qnVar.f41857b5 = null;
                qnVar.f42043q7 = 0;
                qnVar.f41923g7 = false;
                qnVar.f41936h7 = true;
                qnVar.f41884d6.clear();
                qnVar.f41864c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(qnVar.getCurrentAccount(), message, false, false));
                    qnVar2 = qnVar;
                    qnVar2.pb(arrayList, qnVar.f41890e, tL_forumTopic2.f22432id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    qnVar2 = qnVar;
                    qnVar2.Y3 = null;
                    qnVar2.W3 = null;
                    qnVar2.T3 = null;
                    qnVar2.f41959j5 = null;
                    qnVar2.f41920g4 = 0;
                    qnVar2.f41933h4 = 0;
                    qnVar2.f41946i4 = 0;
                    qnVar2.Z3 = 0L;
                    qnVar2.f41842a4 = 0;
                    qnVar2.f41856b4 = null;
                    qnVar2.f41882d4 = false;
                    qnVar2.f41869c4 = false;
                }
                bm bmVar = qnVar2.f42114w0;
                if (bmVar != null) {
                    if (bmVar.E >= 0 && !bmVar.N()) {
                        bm bmVar2 = qnVar2.f42114w0;
                        bmVar2.u(bmVar2.E);
                    } else {
                        bm bmVar3 = qnVar2.f42114w0;
                        if (bmVar3.E < 0 && bmVar3.N()) {
                            qnVar2.f42114w0.o(0);
                        }
                    }
                    qnVar2.f42114w0.T();
                }
                qnVar2.r8();
                qnVar2.Nc(true);
                qnVar2.W0.n(true);
                if (tL_forumTopic2 != null) {
                    qnVar2.Tc();
                } else {
                    qnVar2.W0.b();
                }
                qnVar2.N1.setCurrentTopic(qnVar2.b());
                qnVar2.Qc(true);
                qnVar2.hc(true);
                qnVar2.getMessagesController().setForumLastTopicId(-qnVar2.a(), qnVar2.b());
                qnVar2.Ea();
                qnVar2.f9(true);
                qnVar2.e9(true);
                qnVar2.A6(true, true);
                if (qnVar2.U != null) {
                    if (!UserObject.isBotForum(qnVar2.f41903f)) {
                        qnVar2.U.l0(false);
                    }
                    qnVar2.U.G1(true);
                }
                if (tL_forumTopic2 != null) {
                    qnVar2.getMessagesController().getTopicsController().getTopicRepliesCount(qnVar2.P5, tL_forumTopic2.f22432id);
                }
                if (tL_forumTopic2 != null) {
                    i9 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i9 = 0;
                }
                qnVar2.f41930h1 = i9;
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i10 = 0;
                }
                qnVar2.f41943i1 = i10;
                qnVar2.Bc(false);
                qnVar2.Ac(false);
                qnVar2.Rc();
                in inVar = qnVar2.f41977kc;
                if (inVar != null && qnVar2.actionBar.f23577j0) {
                    inVar.p(null);
                }
                if (UserObject.isBotForum(qnVar2.f41903f)) {
                    qnVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(qnVar2.P5, num.intValue()), true);
                }
            }
        }
    }

    public static void h0(qn qnVar) {
        org.telegram.ui.Cells.t1 t1Var;
        ml mlVar;
        int i9;
        if (!qnVar.Nb && qnVar.B3 && qnVar.f42077t0.C && qnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = qnVar.f42077t0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = qnVar.f42077t0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        if (t1Var.getMessageObject() != null && t1Var.getMessageObject().messageOwner != null && t1Var.getMessageObject().messageOwner.video_processing_pending) {
                            if (t1Var.getCurrentPosition() != null) {
                                if (t1Var.getMessageObject() != null && (t1Var.getCurrentPosition().flags & 8) != 0) {
                                    int i10 = t1Var.getCurrentPosition().flags;
                                    if (t1Var.getMessageObject().isOutOwner()) {
                                        i9 = 1;
                                    } else {
                                        i9 = 2;
                                    }
                                    if ((i10 & i9) == 0) {
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
                qnVar.Nb = true;
                ml mlVar2 = new ml(qnVar, qnVar.getParentActivity());
                mlVar2.q(true);
                mlVar2.G = Layout.Alignment.ALIGN_CENTER;
                mlVar2.d = 3500L;
                mlVar2.P = true;
                mlVar2.f16347e = true;
                mlVar2.h = AndroidUtilities.dp(150.0f);
                mlVar2.r(8.0f);
                qnVar.f42128x1 = mlVar2;
                mlVar2.t(LocaleController.getString(R.string.VideoConversionTimeInfo));
                qnVar.T0.addView(qnVar.f42128x1, g7.e6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                t1Var.getLocationInWindow(iArr);
                qnVar.f42142y1 = t1Var.getTimeY() + iArr[1];
                qnVar.f42128x1.setTranslationY(((-mlVar.getTop()) - AndroidUtilities.dp(120.0f)) + qnVar.f42142y1);
                qnVar.f42128x1.n(0.0f, (t1Var.f25468lb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + t1Var.f25497nb);
                qnVar.f42128x1.v();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ge(qnVar, 2));
            AndroidUtilities.runOnUIThread(new ge(qnVar, 2), 2000L);
        }
    }

    public static void h1(qn qnVar, String str) {
        if (MessagesController.getInstance(qnVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            qnVar.getParentActivity();
            ve.e.n(str);
            return;
        }
        org.telegram.ui.Components.y4.o0(qnVar.getParentActivity(), qnVar.f41848aa, str, false, new dg(qnVar, str, 0));
    }

    public static void i0(qn qnVar) {
        if (qnVar.I1) {
            qnVar.getMessagesController().addDialogToFolder(qnVar.P5, 0, 0, 0L);
            qnVar.Q7();
            qnVar.f42093u3.j(23, qnVar.P5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + qnVar.P5, false);
            edit.putBoolean("dialog_bar_block" + qnVar.P5, false);
            edit.putBoolean("dialog_bar_report" + qnVar.P5, false);
            edit.commit();
            qnVar.Qc(false);
            qnVar.getNotificationsController().clearDialogNotificationsSettings(qnVar.P5, qnVar.b());
        } else if (qnVar.H1.getTag() != null && ((Integer) qnVar.H1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = qnVar.V7;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i9 = 0; i9 < qnVar.V7.participants.participants.size(); i9++) {
                    hVar.k(null, qnVar.V7.participants.participants.get(i9).user_id);
                }
                long j10 = qnVar.V7.f22381id;
                org.telegram.ui.Components.k60 k60Var = new org.telegram.ui.Components.k60(qnVar.getParentActivity(), qnVar.currentAccount, hVar, qnVar.V7.f22381id, qnVar, qnVar.f41848aa);
                k60Var.f29981h0 = new oe(qnVar, 20);
                k60Var.show();
            }
        } else if (qnVar.H1.getTag() != null) {
            qnVar.rb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", qnVar.f41903f.f22527id);
            bundle.putBoolean("addContact", true);
            is isVar = new is(bundle);
            isVar.K = new oe(qnVar, 21);
            qnVar.presentFragment(isVar);
        }
    }

    public static void i1(qn qnVar, Object[] objArr, org.telegram.ui.Components.cx0 cx0Var, boolean z10, TLRPC.StickerSet stickerSet) {
        int i9;
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
                org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(cx0Var.container, qnVar.resourceProvider);
                if (z10) {
                    i9 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i9 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.gc r10 = ocVar.r(document, LocaleController.formatString(i9, stickerSet.title));
                r10.f28737j = 2750;
                r10.k(true);
            }
        }
    }

    public static void i2(qn qnVar) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (qnVar.f42104v1 != null) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var2 = null;
        for (int childCount = qnVar.f42077t0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = qnVar.f42077t0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (primaryMessageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                t1Var2 = t1Var;
            }
        }
        qnVar.ub(t1Var2);
    }

    public static void j0(qn qnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.r41[] r41VarArr;
        if (qnVar.B5 != 0) {
            qnVar.getConnectionsManager().cancelRequest(qnVar.B5, true);
            qnVar.B5 = 0;
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
            if ((charSequence instanceof Spannable) && (r41VarArr = (org.telegram.ui.Components.r41[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.r41.class)) != null && r41VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.r41 r41Var : r41VarArr) {
                    arrayList.add(r41Var.getURL());
                }
            }
            if (arrayList != null && qnVar.D5 != null && arrayList.size() == qnVar.D5.size()) {
                boolean z12 = true;
                for (int i9 = 0; i9 < arrayList.size(); i9++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i9), (CharSequence) qnVar.D5.get(i9))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            qnVar.D5 = arrayList;
        } catch (Exception e10) {
            FileLog.e(e10);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new gf(qnVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new gf(qnVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (qnVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new ne(qnVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = qnVar.C5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i10 = qnVar.f41940hb + 1;
            qnVar.f41940hb = i10;
            ag agVar = new ag(qnVar, i10, getwebpagepreview, 0);
            if (qnVar.f41952ib == null) {
                qnVar.f41952ib = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) qnVar.f41952ib.get(getwebpagepreview.message);
            if (webPage2 != null) {
                agVar.run(Boolean.TRUE, webPage2);
                return;
            }
            l6 l6Var = new l6(qnVar, getwebpagepreview, agVar, 1);
            if (qnVar.B5 != 0) {
                qnVar.getConnectionsManager().cancelRequest(qnVar.B5, true);
            }
            qnVar.B5 = qnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new bg.y0(12, qnVar, l6Var));
            qnVar.getConnectionsManager().bindRequestToGuid(qnVar.B5, qnVar.classGuid);
        }
    }

    public static void j1(qn qnVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = qnVar.f41959j5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i9 = qnVar.f41976kb;
            if (i9 == 5) {
                int i10 = qnVar.currentAccount;
                long j10 = qnVar.P5;
                MessageSuggestionParams messageSuggestionParams = qnVar.f41870c5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new gh.t0(context, i10, j10, messageSuggestionParams, qnVar, qnVar.getResourceProvider(), 0, new se(qnVar, 3)).show();
            } else if (i9 == 1 && (messageObject = qnVar.f41982l5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = qnVar.f41870c5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    qnVar.Tb(messageSuggestionParams2);
                } else if (qnVar.f41982l5.canEditMedia() && qnVar.f41971k5 == 0) {
                    if (qnVar.F1 == null) {
                        qnVar.E7();
                    }
                    qnVar.F1.I1(qnVar.f41982l5, -1);
                    qnVar.X9();
                } else {
                    qnVar.j(qnVar.f41982l5.getId(), 0, true, 0, true, 0);
                }
            } else if (qnVar.f41857b5 != null) {
                if (i9 == 2) {
                    if (!DialogObject.isEncryptedDialog(qnVar.P5) && !qnVar.f41857b5.hasSecretMessages && qnVar.N3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        qnVar.ca(0);
                        return;
                    }
                    MessageObject messageObject3 = qnVar.f41959j5;
                    if (messageObject3 != null) {
                        qnVar.j(messageObject3.getId(), 0, true, 0, true, 0);
                    }
                } else if (i9 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    qnVar.ca(1);
                } else if (i9 == 4) {
                    qnVar.ca(2);
                }
            }
        }
    }

    public static void k0(qn qnVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(qnVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (qnVar.i() != null) {
                tLObject2 = qnVar.i();
            } else {
                tLObject2 = qnVar.f41890e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = qnVar.f41903f;
                if (user2 != null && user2.bot && user.f22527id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.ll.p(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.oc.a0(qnVar), null);
                } else if (user2 != null && user2.bot && user.f22527id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.ll.p(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.oc.a0(qnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.ll.p(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.oc.a0(qnVar), null);
                } else {
                    TLRPC.Chat chat = qnVar.f41890e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.ll.p(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.oc.a0(qnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = qnVar.f41890e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.ll.p(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.oc.a0(qnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                qnVar.W9(user.f22527id, qnVar.f41924g8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(qnVar.getParentActivity());
                q6Var.setColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23095ia, false));
                q6Var.setBackgroundColor(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.L5, false));
                q6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity());
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.R = q6Var;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(qnVar, user, atomicBoolean, tL_attachMenuBot, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(qnVar.getParentActivity(), 5, qnVar.getResourceProvider());
                    z1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    z1Var.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
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
                    z1Var.setOnClickListener(new mh.k3(20, z1Var, atomicBoolean));
                    c2Var.C = 6;
                    alertDialog$Builder.n(z1Var);
                }
                alertDialog$Builder.o();
            } else {
                fi1.a(qnVar.getParentActivity(), new eh(qnVar, user, tL_attachMenuBot, 0), null);
            }
        }
    }

    public static void k1(qn qnVar, long j10, long j11) {
        gh.v7.y(qnVar.currentAccount, false).C(j10, j11, new gh.w3(qnVar, j10, j11, 1));
    }

    public static void k8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        int i9 = 6;
        if (z10) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_quote, 6, LocaleController.getString(R.string.Quote));
            i9 = 7;
        }
        if (z13) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, i9, LocaleController.getString(R.string.Spoiler));
            i9++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i9, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i10 = i9 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i9 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.i41(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i10, spannableStringBuilder3);
            i10 = i9 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f34062a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.wz0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i11 = i10 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i10, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f34062a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.wz0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i10 += 2;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_underline, i11, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_link, i10, LocaleController.getString(R.string.CreateLink));
            i10++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_date, i10, LocaleController.getString(R.string.FormattedDate));
            i10++;
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, i10, LocaleController.getString(R.string.Regular));
    }

    public static void l0(qn qnVar) {
        if (qnVar.Ib == null) {
            return;
        }
        d31[] d31VarArr = {d31.S(qnVar.getParentActivity(), qnVar, true, qnVar.resourceProvider, new df(3, qnVar, d31VarArr))};
    }

    public static void l1(qn qnVar, int i9) {
        if (qnVar.N3 == 7) {
            Object E = qnVar.I3.E(i9);
            if (i9 == 0) {
                qnVar.I3.getClass();
            }
            if (E instanceof MessageObject) {
                qnVar.fa((MessageObject) E);
            }
        } else if (qnVar.f41992m3 != null) {
            if (i9 >= 0 && i9 < qnVar.getMediaDataController().searchResultMessages.size()) {
                qnVar.f42005n3 = false;
                qnVar.lb(false, true, false);
                qnVar.getMediaDataController().setSearchedPosition(i9);
                qnVar.Fc(qnVar.getMediaDataController().getMask(), qnVar.getMediaDataController().getSearchPosition(), qnVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new me(qnVar, qnVar.getMediaDataController().searchResultMessages.get(i9), 2));
            }
        } else {
            qnVar.getMediaDataController().jumpToSearchedMessage(qnVar.classGuid, i9);
            qnVar.Lb(false);
        }
    }

    public static void m0(qn qnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, l6 l6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f22401id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(qnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            qnVar.getMessagesController().getStoriesController().f12244k.d(hVar, new rd(12, hVar, l6Var), qnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void m1(qn qnVar, long j10, long j11, Long l10) {
        int i9;
        String str;
        if (qnVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = qnVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(qnVar.f41890e)) {
            i9 = R.string.RemoveMessageFeeMessageChannel;
        } else {
            i9 = R.string.RemoveMessageFeeMessage;
        }
        SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i9, DialogObject.getShortName(j10)));
        if (l10.longValue() > 0) {
            str = LocaleController.formatPluralStringComma("RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.y4.i0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new ch(qnVar, j10, j11, l10, 0), qnVar.resourceProvider, true);
    }

    public static void n0(qn qnVar, long j10, long j11) {
        BotForumHelper.getInstance(qnVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        qnVar.Jb = null;
    }

    public static void n1(qn qnVar) {
        MessagesController messagesController = qnVar.getMessagesController();
        long j10 = qnVar.P5;
        long j11 = qnVar.H6;
        int i9 = qnVar.classGuid;
        int i10 = qnVar.N3;
        long j12 = qnVar.Z3;
        int i11 = qnVar.f41946i4;
        int i12 = qnVar.R5;
        qnVar.R5 = i12 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i9, 0, 0, i10, j12, i11, i12, qnVar.f41882d4);
    }

    public static void o0(qn qnVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(qnVar.currentAccount).getInputUser(user.f22527id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(qnVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void o1(qn qnVar) {
        int i9;
        TLRPC.ChatFull chatFull = qnVar.V7;
        if (chatFull != null && !qnVar.f41994m5) {
            TLRPC.Chat chat = qnVar.f41890e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && qnVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
                int i10 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i9 = 120;
                } else {
                    i9 = 604800;
                }
                int currentTime = qnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i10) >= i9 && qnVar.visibleDialog == null && qnVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = qnVar.getParentActivity();
                    oe oeVar = new oe(qnVar, 12);
                    oe oeVar2 = new oe(qnVar, 13);
                    Pattern pattern = org.telegram.ui.Components.y4.f34847a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bg.q1(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, g7.e6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.R = frameLayout;
                    c2Var.K0 = 0.3974359f;
                    c2Var.N = LocaleController.getString(R.string.GigagroupAlertTitle);
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), oeVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), oeVar2);
                    qnVar.showDialog(c2Var);
                }
            }
        }
    }

    public static void p0(qn qnVar) {
        if (qnVar.N3 == 0 && qnVar.getMessagesController().freezeUntilDate > qnVar.getConnectionsManager().getCurrentTime() && !b.a(qnVar.currentAccount, qnVar.f41903f)) {
            b.c(qnVar.getParentActivity(), qnVar.currentAccount, qnVar.getResourceProvider());
        }
    }

    public static Integer p8(ArrayList arrayList, int i9, int[] iArr) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Integer num = (Integer) arrayList.get(0);
        if (i9 >= num.intValue()) {
            iArr[0] = 0;
            return num;
        }
        int size = arrayList.size();
        int i10 = size - 1;
        Integer num2 = (Integer) arrayList.get(i10);
        if (i9 <= num2.intValue()) {
            iArr[0] = i10;
            return num2;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            i12 = (i11 + size) / 2;
            Integer num3 = (Integer) arrayList.get(i12);
            if (num3.intValue() == i9) {
                iArr[0] = i12;
                return num3;
            } else if (i9 < num3.intValue()) {
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    Integer num4 = (Integer) arrayList.get(i13);
                    if (i9 > num4.intValue()) {
                        iArr[0] = i13;
                        return num4;
                    }
                }
                i11 = i12 + 1;
            } else if (i12 > 0 && i9 < ((Integer) arrayList.get(i12 - 1)).intValue()) {
                iArr[0] = i12;
                return num3;
            } else {
                size = i12;
            }
        }
        iArr[0] = i12;
        return (Integer) arrayList.get(i12);
    }

    public static void q1(org.telegram.ui.qn r19, final org.telegram.ui.d31[] r20, final org.telegram.ui.Components.x60 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.q1(org.telegram.ui.qn, org.telegram.ui.d31[], org.telegram.ui.Components.x60):void");
    }

    public static void r0(qn qnVar, ArrayList arrayList, long j10, org.telegram.ui.Components.ll0 ll0Var, boolean z10, int i9) {
        if (z10) {
            SendMessagesHelper.getInstance(qnVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i9, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new bg.e1(qnVar, j10, 7), 400L);
            ll0Var.dismiss();
        }
    }

    public static void r1(qn qnVar, int i9, int i10, int i11, int i12) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j10;
        int[] iArr3 = qnVar.f42120w6;
        int[] iArr4 = qnVar.f42108v6;
        boolean[] zArr = qnVar.A6;
        int[] iArr5 = qnVar.f42096u6;
        int[] iArr6 = qnVar.f42133x6;
        boolean[] zArr2 = qnVar.f42159z6;
        ArrayList arrayList = qnVar.f41884d6;
        if ((i9 - i10) - i11 <= i12 && !qnVar.C6) {
            boolean[] zArr3 = qnVar.f42147y6;
            if (!zArr3[0]) {
                qnVar.C6 = true;
                arrayList.add(Integer.valueOf(qnVar.R5));
                if (qnVar.f42008n6.size() != 0) {
                    MessagesController messagesController = qnVar.getMessagesController();
                    j10 = 0;
                    long j11 = qnVar.P5;
                    c10 = 0;
                    long j12 = qnVar.H6;
                    int i13 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i14 = iArr6[0];
                    int i15 = qnVar.classGuid;
                    int i16 = qnVar.N3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = qnVar.Z3;
                    int i17 = qnVar.f41946i4;
                    int i18 = qnVar.R5;
                    qnVar.R5 = i18 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i13, 0, z10, i14, i15, 0, 0, i16, j13, i17, i18, qnVar.f41882d4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = qnVar.getMessagesController();
                    long j14 = qnVar.P5;
                    long j15 = qnVar.H6;
                    boolean z11 = !zArr2[0];
                    int i19 = iArr6[0];
                    int i20 = qnVar.classGuid;
                    int i21 = qnVar.N3;
                    long j16 = qnVar.Z3;
                    int i22 = qnVar.f41946i4;
                    int i23 = qnVar.R5;
                    qnVar.R5 = i23 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z11, i19, i20, 0, 0, i21, j16, i22, i23, qnVar.f41882d4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j10 = 0;
                if (qnVar.H6 != 0 && !zArr3[1]) {
                    qnVar.C6 = true;
                    arrayList.add(Integer.valueOf(qnVar.R5));
                    MessagesController messagesController3 = qnVar.getMessagesController();
                    long j17 = qnVar.H6;
                    int i24 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i25 = iArr6[1];
                    int i26 = qnVar.classGuid;
                    int i27 = qnVar.N3;
                    long j18 = qnVar.Z3;
                    int i28 = qnVar.f41946i4;
                    int i29 = qnVar.R5;
                    qnVar.R5 = i29 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i24, 0, z12, i25, i26, 0, 0, i27, j18, i28, i29, qnVar.f41882d4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j10 = 0;
        }
        if (i11 > 0 && !qnVar.E7 && i10 <= 10) {
            if (qnVar.H6 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(qnVar.R5));
                MessagesController messagesController4 = qnVar.getMessagesController();
                long j19 = qnVar.H6;
                int i30 = iArr2[1];
                int i31 = iArr[1];
                int i32 = qnVar.classGuid;
                int i33 = qnVar.N3;
                long j20 = qnVar.Z3;
                int i34 = qnVar.f41946i4;
                int i35 = qnVar.R5;
                qnVar.R5 = i35 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i30, 0, true, i31, i32, 1, 0, i33, j20, i34, i35, qnVar.f41882d4);
                qnVar.E7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(qnVar.R5));
                MessagesController messagesController5 = qnVar.getMessagesController();
                long j21 = qnVar.P5;
                long j22 = qnVar.H6;
                int i36 = iArr2[c10];
                int i37 = iArr[c10];
                int i38 = qnVar.classGuid;
                int i39 = qnVar.N3;
                long j23 = qnVar.Z3;
                int i40 = qnVar.f41946i4;
                int i41 = qnVar.R5;
                qnVar.R5 = i41 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i36, 0, true, i37, i38, 1, 0, i39, j23, i40, i41, qnVar.f41882d4);
                qnVar.E7 = true;
            }
        }
    }

    public static void s0(long j10, qn qnVar) {
        if (gh.v7.y(qnVar.currentAccount, false).p().amount < j10) {
            new gh.ea(qnVar.getParentActivity(), qnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(qnVar.a()), new gf(qnVar, 15), qnVar.a()).show();
        } else {
            new gh.fa(qnVar.getParentActivity(), qnVar.resourceProvider).show();
        }
    }

    public static void t0(qn qnVar, TLRPC.Document document) {
        qnVar.f42054r4.put(document, 0);
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendSticker(document, null, qnVar.P5, null, null, null, qnVar.f41934h5, null, true, 0, 0, false, null, qnVar.C8(), 0L, qnVar.N8(), qnVar.f41870c5);
    }

    public static void t1(qn qnVar) {
        if (MessagesController.getInstance(qnVar.currentAccount).isDialogMuted(qnVar.P5, qnVar.b())) {
            qnVar.Pc(true);
            AndroidUtilities.runOnUIThread(new ge(qnVar, 18), 150L);
            qnVar.f41878d0.M(null, null);
            if (qnVar.getParentActivity() != null) {
                org.telegram.ui.Components.oc.z(qnVar, 4, 0, qnVar.f41848aa).j();
                return;
            }
            return;
        }
        View view = qnVar.f41841a1.f23808i;
        if (view instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) view).b();
        }
    }

    public static void u0(qn qnVar, TLRPC.Document document) {
        qnVar.f42054r4.put(document, 0);
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendSticker(document, null, qnVar.P5, null, null, null, qnVar.f41934h5, null, true, 0, 0, false, null, qnVar.C8(), 0L, qnVar.N8(), qnVar.f41870c5);
    }

    public static void u1(qn qnVar, String str) {
        if (qnVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(qnVar.currentAccount).getInviteText(1));
            qnVar.getParentActivity().startActivityForResult(intent, 500);
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

    public static void v0(qn qnVar) {
        long j10;
        ArrayList arrayList = qnVar.f41884d6;
        arrayList.add(Integer.valueOf(qnVar.R5));
        if (qnVar.N3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(qnVar.currentAccount);
            String str = qnVar.f42039q3;
            int i9 = qnVar.classGuid;
            int i10 = qnVar.K3;
            int i11 = qnVar.R5;
            qnVar.R5 = i11 + 1;
            hashtagSearchController.searchHashtag(str, i9, i10, i11);
        } else if (qnVar.f42071s7 != 0) {
            MessagesController messagesController = qnVar.getMessagesController();
            long j11 = qnVar.P5;
            long j12 = qnVar.H6;
            int i12 = qnVar.f42071s7;
            int i13 = qnVar.classGuid;
            int i14 = qnVar.N3;
            long j13 = qnVar.Z3;
            int i15 = qnVar.f41946i4;
            int i16 = qnVar.R5;
            qnVar.R5 = i16 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i12, true, 0, i13, 4, 0, i14, j13, i15, i16, qnVar.f41882d4);
        } else if (qnVar.f42043q7 != 0 && (!qnVar.F9() || qnVar.f42043q7 == qnVar.H7 || qnVar.f41882d4)) {
            int i17 = qnVar.f41911f7;
            if (i17 != 0) {
                qnVar.H6 = i17;
                MessagesController messagesController2 = qnVar.getMessagesController();
                long j14 = qnVar.H6;
                boolean z10 = qnVar.f41885d7;
                int i18 = qnVar.f41872c7;
                int i19 = qnVar.f42043q7;
                int i20 = qnVar.classGuid;
                int i21 = qnVar.N3;
                long j15 = qnVar.Z3;
                int i22 = qnVar.f41946i4;
                int i23 = qnVar.R5;
                qnVar.R5 = i23 + 1;
                messagesController2.loadMessages(j14, 0L, z10, i18, i19, 0, true, 0, i20, 3, 0, i21, j15, i22, i23, qnVar.f41882d4);
            } else {
                MessagesController messagesController3 = qnVar.getMessagesController();
                long j16 = qnVar.P5;
                long j17 = qnVar.H6;
                boolean z11 = qnVar.f41885d7;
                int i24 = qnVar.f41872c7;
                int i25 = qnVar.f42043q7;
                int i26 = qnVar.classGuid;
                int i27 = qnVar.N3;
                long j18 = qnVar.Z3;
                int i28 = qnVar.f41946i4;
                int i29 = qnVar.R5;
                qnVar.R5 = i29 + 1;
                messagesController3.loadMessages(j16, j17, z11, i24, i25, 0, true, 0, i26, 3, 0, i27, j18, i28, i29, qnVar.f41882d4);
            }
        } else if (qnVar.f41898e7) {
            qnVar.R5++;
        } else {
            MessagesController messagesController4 = qnVar.getMessagesController();
            long j19 = qnVar.P5;
            long j20 = qnVar.H6;
            boolean z12 = qnVar.f41885d7;
            int i30 = qnVar.f41872c7;
            int i31 = qnVar.f42043q7;
            int i32 = qnVar.classGuid;
            int i33 = qnVar.N3;
            long j21 = qnVar.Z3;
            int i34 = qnVar.f41946i4;
            int i35 = qnVar.R5;
            qnVar.R5 = i35 + 1;
            messagesController4.loadMessages(j19, j20, z12, i30, i31, 0, true, 0, i32, 2, 0, i33, j21, i34, i35, qnVar.f41882d4);
        }
        int i36 = qnVar.N3;
        if (i36 == 0 || (i36 == 3 && qnVar.I8() == qnVar.getUserConfig().getClientUserId())) {
            if (qnVar.F9() && !qnVar.f41882d4) {
                return;
            }
            arrayList.add(Integer.valueOf(qnVar.R5));
            MessagesController messagesController5 = qnVar.getMessagesController();
            long j22 = qnVar.P5;
            long j23 = qnVar.H6;
            int i37 = qnVar.classGuid;
            if (qnVar.N3 == 3) {
                j10 = 0;
            } else {
                j10 = qnVar.Z3;
            }
            long j24 = j10;
            int i38 = qnVar.f41946i4;
            int i39 = qnVar.R5;
            qnVar.R5 = i39 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i37, 2, 0, 1, j24, i38, i39, qnVar.f41882d4);
        }
    }

    public static boolean v1(org.telegram.ui.qn r17, org.telegram.tgnet.TLRPC.MessageEntity r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.v1(org.telegram.ui.qn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void w0(qn qnVar, int i9, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, lf lfVar) {
        String str3;
        if (qnVar.Z4 != null && i9 < arrayList.size() && qnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = qnVar.Z4;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.z21.I(qnVar.getParentActivity(), qnVar, inputPeer, iArr[0], qnVar.Z4.summarized, strArr[0], str3, charSequence, z10, lfVar, new jg(qnVar, 12)).setDimBehind(false);
            qnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i10 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i10 - 1).apply();
                qnVar.Qc(true);
            }
        }
    }

    public static void w1(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(qnVar.currentAccount).loadAttachMenuBots(false, true);
            qnVar.W9(user.f22527id, qnVar.f41924g8, false);
        }
    }

    public static void x0(qn qnVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i9) {
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendSticker(tL_document, str, qnVar.P5, qnVar.f41959j5, qnVar.T3, null, qnVar.f41934h5, null, z10, i9, 0, false, obj, qnVar.C8(), 0L, qnVar.N8(), qnVar.f41870c5);
    }

    public static void x1(qn qnVar, View view, int i9) {
        org.telegram.ui.Components.t5 t5Var;
        TLRPC.User user;
        char c10;
        ek ekVar;
        ek ekVar2;
        if (i9 != 0) {
            of.f1 adapter = qnVar.E1.getAdapter();
            if (adapter.f19343s0 != null && !adapter.f19324d0) {
                return;
            }
            int i10 = i9 - 1;
            Object J = qnVar.E1.getAdapter().J(i10);
            int i11 = qnVar.E1.getAdapter().T;
            int i12 = qnVar.E1.getAdapter().U;
            if (qnVar.E1.getAdapter().B != null && i10 == 1) {
                qnVar.U.O0(i11, i12, qnVar.E1.getAdapter().B + "@" + ChatObject.getPublicUsername(qnVar.f41890e) + " ", false);
            } else if (qnVar.E1.getAdapter().B != null && i10 == 0) {
                qnVar.U.O0(i11, i12, aa.d.r(new StringBuilder(), qnVar.E1.getAdapter().B, " "), false);
            } else if (J instanceof pf.q1) {
                if (!qnVar.getUserConfig().isPremium()) {
                    qnVar.showDialog(new zf.x0(qnVar, qnVar.getParentActivity(), qnVar.currentAccount, true, 31, false, null));
                    return;
                }
                pf.q1 q1Var = (pf.q1) J;
                org.telegram.ui.Components.y4.a0(qnVar.currentAccount, Math.max(1, q1Var.a()), qnVar.P5, new df(0, qnVar, q1Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (qnVar.N3 != 0 || !qnVar.e7(view)) {
                        if (view instanceof org.telegram.ui.Cells.b8) {
                            sendAnimationData = ((org.telegram.ui.Cells.b8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.y4.a0(qnVar.currentAccount, 1, qnVar.a(), new gh.i2(qnVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), qnVar.E1.getAdapter().L(i10), sendAnimationData, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (qnVar.f41957j3 && (ekVar2 = qnVar.N2) != null && ekVar2.getVisibility() == 0) {
                        qnVar.Za(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        qnVar.U.O0(i11, i12, aa.d.o("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (qnVar.f41957j3 && (ekVar = qnVar.N2) != null && ekVar.getVisibility() == 0) {
                        qnVar.Za(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        qnVar.U.O0(i11, i12, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(ta.b.j(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.s41("" + user2.f22527id, 3, null), 0, spannableString.length(), 33);
                        qnVar.U.O0(i11, i12, spannableString, false);
                    }
                } else if (J instanceof of.c1) {
                    if (qnVar.E1.getAdapter().F != null && qnVar.N3 != 1) {
                        of.c1 c1Var = (of.c1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(c1Var.f19265a, qnVar.P5, qnVar.f41959j5, qnVar.T3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = qnVar.C8();
                        of2.ephemeralReceiverBotId = c1Var.f19266b;
                        of2.monoForumPeer = qnVar.N8();
                        of2.suggestionParams = qnVar.f41870c5;
                        qnVar.getSendMessagesHelper().sendMessage(of2);
                        qnVar.U.setFieldText("");
                        qnVar.e9(false);
                    }
                } else if (J instanceof String) {
                    if (qnVar.E1.getAdapter().F != null) {
                        if (qnVar.N3 == 1) {
                            org.telegram.ui.Components.y4.M(qnVar.getParentActivity(), qnVar.P5, new ih.v3(16, qnVar, (String) J), qnVar.f41848aa);
                            return;
                        } else if (!qnVar.e7(view)) {
                            org.telegram.ui.Components.y4.a0(qnVar.currentAccount, 1, qnVar.P5, new df(1, qnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    qnVar.U.O0(i11, i12, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (qnVar.U.getFieldText() != null) {
                        if (qnVar.N3 == 1 || !qnVar.e7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (qnVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                                    alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    qnVar.showDialog(alertDialog$Builder.f22702a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(qnVar.E1.getAdapter().N);
                                qnVar.Da = arrayList;
                                PhotoViewer.t1().K2(null, qnVar, qnVar.f41848aa);
                                PhotoViewer.t1().f2(arrayList, qnVar.E1.getAdapter().M(i10), 3, false, qnVar.Ea, qnVar);
                                return;
                            }
                            org.telegram.ui.Components.y4.a0(qnVar.currentAccount, 1, qnVar.a(), new df(2, qnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    rd rdVar = new rd(5, qnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (qnVar.f41915fb) {
                        rdVar.run();
                    } else {
                        fi1.a(qnVar.getParentActivity(), new ih.a2(4, qnVar, rdVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    tj tjVar = qnVar.E1;
                    if (tjVar != null && (user = tjVar.getAdapter().f19343s0) != null) {
                        qnVar.U.setFieldText("");
                        long j10 = qnVar.P5;
                        if (j10 == user.f22527id) {
                            qnVar.f41860b8 = j10;
                            qnVar.getMessagesController().sendBotStart(qnVar.f41903f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f22527id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", qnVar.P5);
                        if (qnVar.getMessagesController().checkCanOpenChat(bundle, qnVar)) {
                            qnVar.presentFragment(new qn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    ak akVar = qnVar.U;
                    akVar.T();
                    akVar.Q0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            qnVar.U.O0(i11, i12, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = qnVar.U.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                FileLog.e((Throwable) e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f10 = org.telegram.ui.Components.k5.f(qnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                            if (f10 != null) {
                                t5Var = new org.telegram.ui.Components.t5(f10, fontMetricsInt);
                            } else {
                                t5Var = new org.telegram.ui.Components.t5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(t5Var, 0, spannableString2.length(), 33);
                            qnVar.U.O0(i11, i12, spannableString2, false);
                            qnVar.E1.o(false);
                        }
                    }
                    qnVar.U.O0(i11, i12, str, true);
                    qnVar.E1.o(false);
                }
            }
        }
    }

    public static void y0(qn qnVar, int i9, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, lf lfVar) {
        if (qnVar.Z4 != null && i9 < arrayList.size() && qnVar.getParentActivity() != null) {
            org.telegram.ui.Components.z21.I(qnVar.getParentActivity(), qnVar, inputPeer, iArr[0], qnVar.Z4.summarized, "und", str, charSequence, z10, lfVar, new jg(qnVar, 4)).setDimBehind(false);
            qnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i10 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i10 - 1).apply();
                qnVar.Qc(true);
            }
        }
    }

    public static void y1(qn qnVar, org.telegram.ui.Components.x60 x60Var) {
        if (qnVar.Ib == null) {
            return;
        }
        x60Var.u();
        qnVar.J9(qnVar.Ib, false, true);
        ve.e.r(qnVar.getParentActivity(), Uri.parse(qnVar.Ib.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(qnVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void z0(qn qnVar) {
        org.telegram.ui.Components.t30.h.a();
        qnVar.showDialog(new fh.p2(qnVar.getParentActivity(), qnVar.currentAccount, qnVar.a(), null, null));
    }

    public static void z1(qn qnVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.sg sgVar;
        String str;
        SparseArray[] sparseArrayArr = qnVar.S5;
        if (qnVar.getParentActivity() != null && qnVar.J9 == 0.0f) {
            if (qnVar.N3 == 3) {
                Bundle bundle = new Bundle();
                long I8 = qnVar.I8();
                if (I8 >= 0) {
                    bundle.putLong("user_id", I8);
                } else {
                    bundle.putLong("chat_id", -I8);
                }
                qnVar.presentFragment(new qn(bundle));
                return;
            }
            boolean z12 = false;
            if (qnVar.A9()) {
                ArrayList arrayList = new ArrayList();
                for (int i9 = 0; i9 < sparseArrayArr[0].size(); i9++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i9)));
                }
                qnVar.vb(true, true);
                byte[] bArr = qnVar.R3;
                String str2 = qnVar.S3;
                se seVar = new se(qnVar, 1);
                int i10 = y21.v;
                int currentAccount = qnVar.getCurrentAccount();
                Activity parentActivity = qnVar.getParentActivity();
                long a2 = qnVar.a();
                if (parentActivity != null) {
                    y21.J(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.oc.a0(qnVar), qnVar.getResourceProvider(), bArr, str2, seVar);
                }
            } else if (qnVar.N3 == 2) {
                qnVar.finishFragment();
                cm cmVar = qnVar.R8;
                if (qnVar.f42127x0.getTag() == null) {
                    z12 = true;
                }
                cmVar.D(true, z12);
            } else {
                TLRPC.User user = qnVar.f41903f;
                if (user != null && user.f22527id == 489000) {
                    qnVar.bc(true);
                } else if (user != null && qnVar.f42001n) {
                    if (user.bot) {
                        String str3 = qnVar.f41846a8;
                        qnVar.f41846a8 = null;
                        qnVar.getMessagesController().unblockPeer(qnVar.f41903f.f22527id, new le(qnVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f41848aa);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.P = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new oe(qnVar, 6));
                    c2Var.N = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    qnVar.showDialog(c2Var);
                } else if (UserObject.isReplyUser(user)) {
                    qnVar.bc(true);
                } else {
                    TLRPC.User user2 = qnVar.f41903f;
                    if (user2 != null && user2.bot && (str = qnVar.f41846a8) != null) {
                        if (str.length() != 0) {
                            qnVar.getMessagesController().sendBotStart(qnVar.f41903f, qnVar.f41846a8);
                        } else {
                            qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", qnVar.P5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        qnVar.f41846a8 = null;
                        qnVar.hc(false);
                        return;
                    }
                    if (ChatObject.isChannel(qnVar.f41890e)) {
                        TLRPC.Chat chat = qnVar.f41890e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (qnVar.f41890e.join_request) {
                                    qnVar.vb(true, true);
                                    MessagesController.getInstance(qnVar.currentAccount).addUserToChat(qnVar.f41890e.f22380id, UserConfig.getInstance(qnVar.currentAccount).getCurrentUser(), 0, null, null, true, new ge(qnVar, 17), new ih.v3(15, qnVar, context));
                                    return;
                                }
                                ge geVar = qnVar.H5;
                                if (geVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(geVar);
                                    qnVar.H5 = null;
                                }
                                qnVar.vb(true, true);
                                qnVar.getMessagesController().addUserToChat(qnVar.f41890e.f22380id, qnVar.getUserConfig().getCurrentUser(), 0, null, qnVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.r0 r0Var = qnVar.G1;
                                if (r0Var != null && (sgVar = qnVar.I0) != null && sgVar.d(r0Var) && qnVar.J1.getVisibility() != 8 && qnVar.J1.getTag(R.id.object_tag) != null) {
                                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                                    edit.putInt("dialog_bar_vis3" + qnVar.P5, 3).commit();
                                    qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(qnVar.P5));
                                    return;
                                }
                                return;
                            }
                            qnVar.bc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = qnVar.V7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = qnVar.f41890e;
                    TLRPC.User user3 = qnVar.f41903f;
                    if (qnVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.y4.s(qnVar, false, chat2, user3, z11, true, false, z10, new oe(qnVar, 7));
                }
            }
        }
    }

    @Override
    public final List A() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.f41890e)) {
            arrayList.add(new uf.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i9 = this.f41839a;
            if (i9 != 1) {
                if (i9 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new uf.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new jg(this, 15)));
            arrayList.add(new uf.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new jg(this, 16)));
        }
        if (this.f41903f == null) {
            arrayList.add(new uf.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new uf.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new v0("", 1)));
            arrayList.add(new uf.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.c2(this)));
        }
        return arrayList;
    }

    public final void A6(boolean z10, boolean z11) {
        long j10;
        TLRPC.DraftMessage draft;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        gn gnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i9;
        gn gnVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j12;
        org.telegram.ui.Components.vz0 vz0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.t5 t5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        Long l11;
        if (this.U != null) {
            int i10 = this.N3;
            if (i10 == 0 || i10 == 8 || (i10 == 3 && getUserConfig().getClientUserId() == I8())) {
                long j14 = 0;
                if (this.N3 == 8) {
                    if (ChatObject.isMonoForum(this.f41890e)) {
                        if (this.Z3 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.f41890e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.vz0 vz0Var2 = null;
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
                ak akVar = this.U;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                akVar.setRichDraftPreview(richMessage);
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
                    ak akVar2 = this.U;
                    akVar2.S2 = null;
                    akVar2.T2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i11 = 0;
                        while (i11 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i11);
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
                                vz0Var = null;
                                org.telegram.ui.Components.s41 s41Var = new org.telegram.ui.Components.s41(aa.d.m(j12, ""), 3, null);
                                int i12 = messageEntity.offset;
                                valueOf.setSpan(s41Var, i12, messageEntity.length + i12, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f34062a |= 4;
                                    org.telegram.ui.Components.wz0 wz0Var = new org.telegram.ui.Components.wz0(obj, 0);
                                    int i13 = messageEntity.offset;
                                    MediaDataController.addStyleToText(wz0Var, i13, messageEntity.length + i13, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f34062a |= 1;
                                        org.telegram.ui.Components.wz0 wz0Var2 = new org.telegram.ui.Components.wz0(obj2, 0);
                                        int i14 = messageEntity.offset;
                                        MediaDataController.addStyleToText(wz0Var2, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f34062a |= 2;
                                        org.telegram.ui.Components.wz0 wz0Var3 = new org.telegram.ui.Components.wz0(obj3, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(wz0Var3, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f34062a |= 8;
                                        org.telegram.ui.Components.wz0 wz0Var4 = new org.telegram.ui.Components.wz0(obj4, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(wz0Var4, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f34062a |= 16;
                                        org.telegram.ui.Components.wz0 wz0Var5 = new org.telegram.ui.Components.wz0(obj5, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(wz0Var5, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.r41 r41Var = new org.telegram.ui.Components.r41(messageEntity.url, vz0Var2);
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(r41Var, i18, messageEntity.length + i18, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f34062a |= 256;
                                        org.telegram.ui.Components.wz0 wz0Var6 = new org.telegram.ui.Components.wz0(obj6, 0);
                                        int i19 = messageEntity.offset;
                                        MediaDataController.addStyleToText(wz0Var6, i19, messageEntity.length + i19, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i20 = messageEntity.offset;
                                        org.telegram.ui.Components.fi0.c(valueOf, i20, messageEntity.length + i20, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.U.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            FileLog.e((Throwable) e10, false);
                                            fontMetricsInt = vz0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            t5Var = new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            t5Var = new org.telegram.ui.Components.t5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i21 = messageEntity.offset;
                                        valueOf.setSpan(t5Var, i21, messageEntity.length + i21, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        vz0Var = vz0Var2;
                                    }
                                    vz0Var = vz0Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                vz0Var = null;
                            }
                            i11++;
                            vz0Var2 = vz0Var;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        gnVar = vz0Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        gnVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.U.f1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.U.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new ge(this, 4), 700L);
                    }
                    this.U.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f41870c5 = of2;
                        Db(of2);
                    }
                    messageObject = this.f41959j5;
                    if (messageObject != null || this.T3 == messageObject) {
                        if (message == null && ((messageObject2 = this.T3) == null || messageObject2.getId() != message.f22401id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f41959j5 = messageObject3;
                            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
                            if (inputReplyTo2 != null) {
                                int i22 = inputReplyTo2.flags;
                                if ((i22 & 4) != 0) {
                                    String str3 = inputReplyTo2.quote_text;
                                    if ((i22 & 16) != 0) {
                                        i9 = inputReplyTo2.quote_offset;
                                    } else {
                                        i9 = -1;
                                    }
                                    TLRPC.Message message3 = messageObject3.messageOwner;
                                    if (message3 == null || (str = message3.message) == null || str3 == null || (findQuoteStart = MessageObject.findQuoteStart(str, str3, i9)) < 0) {
                                        gnVar2 = gnVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        gnVar2 = new gn(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f41934h5 = gnVar2;
                                }
                            }
                            V6(false);
                            gn gnVar3 = this.f41934h5;
                            if (gnVar3 != null) {
                                Cb(this.f41959j5, gnVar3);
                            } else {
                                Bb(this.f41959j5);
                            }
                            hc(false);
                            return;
                        } else if (l10 == null && l10.longValue() != j11 && this.f41890e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.f41890e.f22380id, l10.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f41959j5 = messageObject4;
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
                gnVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f41870c5 = of22;
                    Db(of22);
                }
                messageObject = this.f41959j5;
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
            ofFloat.addUpdateListener(new ie(this, 0));
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
        if (this.f41938h9 == null) {
            this.f41938h9 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount, true, this.f42137xa, this.f41848aa);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f41938h9;
        if (this.f41890e == null && !UserObject.isUserSelf(this.f41903f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        t1Var.J7 = z11;
        org.telegram.ui.Cells.t1 t1Var2 = this.f41938h9;
        int i9 = this.N3;
        if (i9 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        t1Var2.L7 = z12;
        if (i9 == 3 && this.Ka) {
            z13 = true;
        } else {
            z13 = false;
        }
        t1Var2.M7 = z13;
        TLRPC.User user = this.f41903f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        t1Var2.N7 = z14;
        if (ChatObject.isChannel(this.f41890e) && this.f41890e.megagroup) {
            z15 = true;
        }
        t1Var2.O7 = z15;
        this.f41938h9.A8 = t9();
        this.f41938h9.B8 = C9();
        this.f41938h9.C8 = B9();
        return this.f41938h9.g1(messageObject, (MessageObject.GroupedMessages) this.f42083t6.f(messageObject.getGroupId()), z10);
    }

    public final boolean A9() {
        return !TextUtils.isEmpty(this.Q3);
    }

    public final void Aa(int i9) {
        boolean z10;
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11 = false;
        if (i9 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (i11 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File generatePicturePath = AndroidUtilities.generatePicturePath();
                if (generatePicturePath != null) {
                    if (i11 >= 24) {
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
            if (i9 == 1) {
                Activity parentActivity2 = getParentActivity();
                int i12 = Build.VERSION.SDK_INT;
                if (i12 >= 33) {
                    if (parentActivity2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (i12 >= 23 && parentActivity2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (ChatObject.isChannel(this.f41890e) && (tL_chatBannedRights = this.f41890e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                ip0 ip0Var = new ip0(0, z10, true, this);
                if (this.N3 == 9) {
                    ip0Var.C = 1;
                    ip0Var.D = true;
                } else {
                    TLRPC.Chat chat = this.f41890e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f41890e.slowmode_enabled) {
                        ip0Var.C = 10;
                        ip0Var.D = true;
                    } else {
                        MessageObject messageObject = this.f41982l5;
                        if (messageObject != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (messageObject == null) {
                            z11 = true;
                        }
                        ip0Var.C = i10;
                        ip0Var.D = z11;
                    }
                }
                ip0Var.R = new gl(this);
                presentFragment(ip0Var);
            } else if (i9 == 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 23 && getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File generateVideoPath = AndroidUtilities.generateVideoPath();
                    if (generateVideoPath != null) {
                        if (i13 >= 24) {
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
        int i9;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f41943i1 > 0 && ((i9 = this.N3) == 0 || i9 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41905f1.e(4, z11, z10);
        this.f41905f1.c(4, this.f41943i1, z10);
    }

    @Override
    public final void B(float f10, int i9) {
        if (i9 == 2 && f10 == 0.0f) {
            yg.c cVar = this.yc;
            if (cVar != null) {
                this.T0.removeView(cVar);
                this.yc = null;
            }
            ak akVar = this.U;
            if (akVar != null) {
                akVar.G0();
            }
        }
    }

    public final int B6(int i9) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f42077t0.getHeight();
        long j10 = 0;
        int i10 = 0;
        while (true) {
            View U0 = this.f42077t0.U0(i9);
            if (U0 == null) {
                break;
            }
            if (U0 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) U0;
                messageObject = t1Var.getMessageObject();
                additionalPaddingHeight = t1Var.getAdditionalPaddingHeight();
            } else if (U0 instanceof org.telegram.ui.Cells.w0) {
                messageObject = ((org.telegram.ui.Cells.w0) U0).getMessageObject();
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
                i10 = Math.max(i10, U0.getBottom() - additionalPaddingHeight);
                if (isOut) {
                    if (groupId == 0) {
                        break;
                    }
                    j10 = groupId;
                }
                i9++;
            } else {
                continue;
            }
        }
        return Math.max(0, i10 - height);
    }

    public final long B7(MessageObject messageObject) {
        if (this.N3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.f41890e) && !this.f41882d4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f22432id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.f41890e));
        }
        return this.Z3;
    }

    public final boolean B9() {
        org.telegram.ui.Components.b21 b21Var = this.N1;
        if (b21Var != null && b21Var.M && b21Var.f26999a.f47776f) {
            return true;
        }
        return false;
    }

    public final void Ba(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Ba(int):void");
    }

    public final void Bb(MessageObject messageObject) {
        zb(true, messageObject, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void Bc(boolean z10) {
        boolean z11;
        int i9;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f41930h1 > 0 && ((i9 = this.N3) == 0 || i9 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41905f1.e(3, z11, z10);
        this.f41905f1.c(3, this.f41930h1, z10);
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final float C6(boolean z10) {
        float f10;
        float f11;
        float f12;
        ak akVar = this.U;
        float f13 = 0.0f;
        if (akVar != null) {
            if (z10) {
                f10 = akVar.f26113f5;
            } else {
                f10 = akVar.f26106e5;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        td.a aVar = this.f42076sc;
        d5.w wVar = this.f42139xc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(wVar.f4401a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(wVar.f4401a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f47776f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) wVar.f4402b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f47775e;
            f12 = f14;
        }
        if (!this.Ka && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f12) * f11, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f13);
        }
        return AndroidUtilities.lerp(dp, max, f12) * f11;
    }

    public final SendMessageChatArguments C8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.N3 == 9) {
            builder.setWelcomeMessageChatId(this.f42033pa);
        }
        if (this.N3 == 5) {
            builder.setQuickReplyShortcut(this.M3, H8());
        }
        return builder.build();
    }

    public final boolean C9() {
        if (this.N1 == null) {
            if (this.P3 || !ChatObject.isMonoForum(this.f41890e)) {
                if (!ChatObject.isForum(this.f41890e) || !ChatObject.areTabsEnabled(this.f41890e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean Ca(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f41860b8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f41903f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f41860b8 == this.P5) {
                this.f41860b8 = 0L;
                this.U.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f41860b8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((o2Var instanceof qn) && ((qn) o2Var).P5 == this.f41860b8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f41860b8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f41860b8));
                } else if (DialogObject.isUserDialog(this.f41860b8)) {
                    bundle.putLong("user_id", this.f41860b8);
                } else {
                    bundle.putLong("chat_id", -this.f41860b8);
                }
                v6();
                presentFragment(new qn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Cb(MessageObject messageObject, gn gnVar) {
        yb(true, messageObject, null, null, null, gnVar, false, true);
    }

    public final void Cc(boolean z10) {
        String string;
        if (this.N3 != 3 && !UserObject.isBotForum(this.f41903f)) {
            dj djVar = this.W0;
            if (djVar != null && this.Z3 != 0) {
                if (this.f41882d4) {
                    Sc();
                } else if (this.f41869c4) {
                    MessageObject messageObject = this.T3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.W0.setTitle(LocaleController.formatPluralString("Comments", this.T3.getRepliesCount(), new Object[0]));
                    } else {
                        this.W0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.T3;
                    if (messageObject2 != null) {
                        djVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.X3 != null) {
                if (this.T3.getRepliesCount() == 0) {
                    if (this.f41869c4) {
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
                    this.f42114w0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final boolean D6() {
        if (!z9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f41882d4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                fk fkVar = this.K0;
                if (fkVar == null || fkVar.getVisibility() != 0) {
                    if (!F9() || this.f41882d4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.D7():void");
    }

    public final boolean D9() {
        boolean z10;
        boolean z11;
        float f10;
        FrameLayout frameLayout;
        if (!this.f41864c && !this.d && this.f41903f == null && this.f42077t0 != null && SharedConfig.animationsEnabled()) {
            if (this.f41902eb == null) {
                this.f41902eb = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f41902eb.booleanValue()) {
                int i9 = Integer.MAX_VALUE;
                int i10 = 0;
                for (int i11 = 0; i11 < this.f42077t0.getChildCount(); i11++) {
                    i10 += this.f42077t0.getChildAt(i11).getHeight();
                    int top = this.f42077t0.getChildAt(i11).getTop();
                    if (top < i9) {
                        i9 = top;
                    }
                }
                float f11 = i9;
                if (f11 <= this.o9) {
                    L6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.f42147y6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f42042q6;
                if ((!z12 || ((this.H6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.C6 && f11 > this.o9 && (!arrayList.isEmpty() ? i10 != 0 : this.f41888db)) {
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
                        Drawable d = this.f41848aa.d();
                        im imVar = this.T0;
                        if (imVar != null) {
                            d = imVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.jb0) {
                            org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) d;
                            if (jb0Var.N != z11) {
                                if (!z11) {
                                    jb0Var.c();
                                }
                                jb0Var.q(z11);
                                if (z11) {
                                    f10 = 1.5f;
                                } else {
                                    f10 = 1.0f;
                                }
                                jb0Var.M = f10;
                                jb0Var.z();
                            } else if (z11) {
                                jb0Var.z();
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

    public final void Da(MessageObject messageObject, int i9) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f22401id = 0;
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
        this.f42114w0.L.add(i9, messageObject2);
    }

    public final void Db(MessageSuggestionParams messageSuggestionParams) {
        zb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Dc(MessageObject messageObject, int i9) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.f41995m6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i9);
        if (arrayList == null) {
            return;
        }
        if (messageObject == null) {
            messageObject2 = new MessageObject(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            messageObject2 = null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            MessageObject messageObject3 = (MessageObject) this.f41972k6[0].get(((Integer) arrayList.get(i10)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                bm bmVar = this.f42114w0;
                if (bmVar != null) {
                    bmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i9);
        }
    }

    public final boolean E6() {
        if (this.h == null) {
            fk fkVar = this.K0;
            if (fkVar == null || fkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E7() {
        if (getParentActivity() != null && getParentActivity() != null && this.F1 == null) {
            ih.u2 u2Var = new ih.u2(this, getParentActivity(), this, this.f41848aa, 1);
            this.F1 = u2Var;
            u2Var.V = a();
            ih.u2 u2Var2 = this.F1;
            u2Var2.f30110e0 = true;
            u2Var2.V1 = new dl(this);
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
                int i9 = messageObject.type;
                if (i9 == 6) {
                    return -1;
                }
                if (i9 != 10 && i9 != 31 && i9 != 11 && i9 != 21 && i9 != 30 && !messageObject.isWallpaperAction()) {
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f22400id)) {
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
            int i10 = messageObject.type;
            if (i10 != 10 && i10 != 11) {
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
        int i9;
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
            i9 = 0;
        } else {
            i9 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i9);
        this.N4 = true;
        zc();
    }

    public final void Eb(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        yb(z10, null, null, null, webPage, null, z11, true);
    }

    public final void Ec(boolean z10) {
        ak akVar = this.U;
        if (akVar != null) {
            akVar.O1(z10);
        }
    }

    @Override
    public final boolean F() {
        return this.f41899e8;
    }

    public final boolean F6(MessageObject messageObject) {
        if (this.N3 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.f41890e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f41890e.f22380id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.N3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.f41890e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void F7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        jg jgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.S5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f41903f;
        TLRPC.Chat chat = this.f41890e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.V7;
        long j10 = this.H6;
        int b10 = (int) b();
        int i9 = this.N3;
        jg jgVar2 = new jg(this, 6);
        if (z10) {
            jgVar = new jg(this, 7);
        } else {
            jgVar = null;
        }
        jg jgVar3 = jgVar;
        org.telegram.ui.Components.y4.z(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.S5, groupedMessages, b10, i9, null, jgVar2, jgVar3, this.f41848aa);
    }

    public final int F8() {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        int i9 = 0;
        if (b5Var == null || b5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i9 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.parentLayout.getFragmentStack().get(i9);
                if (o2Var != this && (o2Var instanceof qn) && ((qn) o2Var).P5 == this.P5) {
                    break;
                }
                i9++;
            } else {
                i9 = indexOf;
                break;
            }
        }
        return i9 - indexOf;
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
                AnimatorSet animatorSet = this.f41868c3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.T2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f41868c3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f41868c3.playTogether(ObjectAnimator.ofFloat(this.T2, View.ALPHA, 1.0f));
                this.f41868c3.addListener(new li(this, 5));
                this.f41868c3.start();
            }
            if (!z10) {
                r9();
                this.W2 = 1000;
            }
        }
    }

    public final void Fc(int i9, int i10, int i11) {
        float f10;
        int i12;
        boolean z10;
        boolean z11;
        rg.g gVar = this.f41905f1;
        boolean z12 = false;
        if (gVar != null) {
            int i13 = 2;
            if (this.La) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if ((i12 & i9) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.b(6).f6087c = z10;
            j4.c cVar = gVar.f47199e[6];
            if (cVar != null) {
                ((qg.b) cVar.f13431b).b(z10, true);
            }
            rg.g gVar2 = this.f41905f1;
            if (this.La) {
                i13 = 1;
            }
            if ((i9 & i13) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            gVar2.b(5).f6087c = z11;
            j4.c cVar2 = gVar2.f47199e[5];
            if (cVar2 != null) {
                ((qg.b) cVar2.f13431b).b(z11, true);
            }
        }
        this.f42067s3 = i11;
        this.f42080t3 = i10;
        Gc();
        org.telegram.ui.Components.j6 j6Var = this.R2;
        if (j6Var != null) {
            if (i11 > 0) {
                z12 = true;
            }
            j6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.R2.animate();
            if (i11 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
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
        float f10;
        float f11;
        float f12;
        float f13;
        int i9;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10;
        TLRPC.EncryptedChat encryptedChat = this.h;
        boolean z13 = true;
        int i11 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f41890e != null && (this.N3 != 0 || this.Z3 != 0 || (chatFull = this.V7) == null || chatFull.ttl_period == 0)) || ((user = this.f41903f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.W7) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.u0 u0Var = this.Y;
            if (u0Var != null) {
                u0Var.e(8);
            }
            dj djVar = this.W0;
            if (djVar != null) {
                djVar.f32724a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var2 = this.Y;
            if (u0Var2 != null) {
                u0Var2.e(0);
            }
            dj djVar2 = this.W0;
            if (djVar2 != null) {
                djVar2.f32724a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f42015o0;
        if (u0Var3 != null) {
            TLRPC.Chat chat = this.f41890e;
            if (chat != null && chat.forum) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u0Var3.e(i10);
        }
        dj djVar3 = this.W0;
        if (djVar3 != null) {
            TLRPC.Chat chat2 = this.f41890e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f41903f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            djVar3.setCommunityItemVisible(z11);
            final dj djVar4 = this.W0;
            TLRPC.Chat chat3 = this.f41890e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = djVar4.A;
            ImageView imageView2 = djVar4.f32750y;
            if (imageView2 != null && imageView != null) {
                djVar4.f32736h0 = z12;
                float f18 = 1.1f;
                float f19 = 1.0f;
                if (!z10) {
                    int i12 = 4;
                    if (z12) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    imageView2.setVisibility(i9);
                    if (z12) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    imageView2.setAlpha(f14);
                    if (z12) {
                        f15 = 1.1f;
                    } else {
                        f15 = 0.0f;
                    }
                    imageView2.setScaleX(f15);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    imageView2.setScaleY(f18);
                    if (z12) {
                        i12 = 0;
                    }
                    imageView.setVisibility(i12);
                    if (z12) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    imageView.setAlpha(f16);
                    if (z12) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    imageView.setScaleX(f17);
                    if (!z12) {
                        f19 = 0.0f;
                    }
                    imageView.setScaleY(f19);
                } else {
                    if (z12) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (z12) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z12) {
                        f11 = 1.1f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                    if (!z12) {
                        f18 = 0.0f;
                    }
                    scaleX.scaleY(f18).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    tn tnVar = djVar4;
                                    if (!z14) {
                                        tnVar.f32750y.setVisibility(4);
                                        return;
                                    } else {
                                        tnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    tn tnVar2 = djVar4;
                                    if (!z15) {
                                        tnVar2.A.setVisibility(4);
                                        return;
                                    } else {
                                        tnVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                    ViewPropertyAnimator animate2 = imageView.animate();
                    if (z12) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                    if (z12) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                    if (!z12) {
                        f19 = 0.0f;
                    }
                    scaleX2.scaleY(f19).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z14 = z12;
                                    tn tnVar = djVar4;
                                    if (!z14) {
                                        tnVar.f32750y.setVisibility(4);
                                        return;
                                    } else {
                                        tnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    tn tnVar2 = djVar4;
                                    if (!z15) {
                                        tnVar2.A.setVisibility(4);
                                        return;
                                    } else {
                                        tnVar2.getClass();
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
        if (this.f42002n0 != null && (chatFull2 = this.V7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.f41890e)) {
                TLRPC.Chat chat4 = this.f41890e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f42002n0;
            if (z13) {
                i11 = 0;
            }
            u0Var4.e(i11);
        }
        p();
    }

    public final void G7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.G7(boolean):void");
    }

    public final int G8() {
        return Math.max(this.L4, this.M4);
    }

    public final void G9(int i9) {
        int i10;
        TLRPC.Message message;
        int i11;
        ArrayList arrayList = this.f42042q6;
        if (!arrayList.isEmpty()) {
            int i12 = 1;
            MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i9 && messageObject.messageOwner.date <= i9) || (messageObject.messageOwner.date >= i9 && this.f42147y6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i9 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() != this.H6) {
                            i12 = 0;
                        }
                        j(id2, 0, false, i12, true, 0);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.P5)) {
                int N0 = this.f42103v0.N0();
                int L0 = this.f42103v0.L0();
                while (true) {
                    if (L0 <= N0) {
                        bm bmVar = this.f42114w0;
                        int i13 = bmVar.F;
                        if (L0 >= i13 && L0 < bmVar.G && (message = ((MessageObject) arrayList.get(L0 - i13)).messageOwner) != null) {
                            if (message.date < i9) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            if (w()) {
                                i11 ^= 1;
                            }
                            i10 = i11 ^ 1;
                        } else {
                            L0++;
                        }
                    } else {
                        i10 = -1;
                        break;
                    }
                }
                this.S8.d(i10);
                org.telegram.ui.ActionBar.c2 c2Var = this.f41988lb;
                if (c2Var != null) {
                    c2Var.dismiss();
                }
                xc(false);
                org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f41848aa);
                this.f41988lb = c2Var2;
                c2Var2.setOnCancelListener(this.f41951ia);
                this.f41988lb.q(1000L);
                int i14 = this.R5;
                this.U8 = i14;
                this.W8 = false;
                this.f41884d6.add(Integer.valueOf(i14));
                this.V8 = 0;
                this.X8 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.P5;
                long j11 = this.H6;
                int i15 = this.classGuid;
                int i16 = this.N3;
                long j12 = this.Z3;
                int i17 = this.f41946i4;
                int i18 = this.R5;
                this.R5 = i18 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i9, true, 0, i15, 4, 0, i16, j12, i17, i18, this.f41882d4);
                this.T2.setAlpha(0.0f);
                this.T2.setTag(null);
                this.f41894e3 = 0.0f;
                lc();
                this.U2.setTag(null);
            }
        }
    }

    public final void Ga(MessageObject messageObject) {
        ArrayList arrayList = this.f42042q6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            bm bmVar = this.f42114w0;
            if (bmVar != null && !bmVar.J) {
                bmVar.u(bmVar.F + indexOf);
            }
        }
    }

    public final void Gb(boolean z10) {
        if (this.U2 != null && !z9()) {
            if (this.U2.getTag() == null) {
                ValueAnimator valueAnimator = this.f41881d3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.U2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41894e3, 1.0f);
                this.f41881d3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f41881d3.addUpdateListener(new ie(this, 2));
                this.f41881d3.addListener(new li(this, 7));
                this.f41881d3.start();
            }
            if (!z10) {
                r9();
                this.W2 = 1000;
            }
        }
    }

    public final void Gc() {
        org.telegram.ui.Components.j6 j6Var = this.Q2;
        if (j6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i9 = this.f42067s3;
            if (i9 < 0) {
                j6Var.c("", z10, true);
            } else if (i9 == 0) {
                j6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f42005n3) {
                j6Var.c(LocaleController.formatPluralString("TaggedMessages", i9, new Object[0]), z10, true);
            } else if (this.N3 != 7 && !this.f42102uc.f47776f) {
                j6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f42080t3 + 1), Integer.valueOf(this.f42067s3)), z10, true);
            } else {
                j6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i9, LocaleController.formatNumber(i9, ' ')), z10, true);
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
        this.f42157z4 = true;
        if (this.f41948i6) {
            getMessagesStorage().getUnreadMention(this.P5, b(), new rg(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.P5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f41882d4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.Z3;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f41935h6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new rc(5, this, messagesStorage));
    }

    public final void Ha(MessageObject messageObject) {
        ArrayList arrayList = this.f42042q6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            bm bmVar = this.f42114w0;
            if (bmVar != null && !bmVar.J) {
                bmVar.P(bmVar.F + indexOf, true);
            }
        }
    }

    public final boolean Hb() {
        ak akVar = this.U;
        if (akVar != null && akVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.a2 == null) {
                    if (!this.X4) {
                        ak akVar2 = this.U;
                        if (akVar2 != null) {
                            akVar2.T();
                            MediaDataController.getInstance(akVar2.M).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.uf ufVar = akVar2.Q0;
                            ufVar.M(false, false);
                            ufVar.R(false, false);
                            ufVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        im imVar = this.T0;
                        int indexOfChild = imVar.indexOfChild(this.O);
                        if (indexOfChild != -1) {
                            ak akVar3 = this.U;
                            akVar3.T();
                            MediaDataController.getInstance(akVar3.M).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.uf ufVar2 = akVar3.Q0;
                            ufVar2.M(false, false);
                            ufVar2.R(false, false);
                            ufVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f42066s2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i9 = indexOfChild + 1;
                            imVar.addView(this.f42066s2, i9, g7.e6.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(9, getParentActivity(), this.f41848aa, false);
                            this.a2 = s30Var;
                            s30Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            imVar.addView(this.a2, i9, g7.e6.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.s30 s30Var2 = this.a2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(s30Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f42066s2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new li(this, 4));
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
        String str = this.f42039q3;
        if (str != null) {
            this.Z1.f28885e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.H3.setEmptyView(this.Z1);
            return;
        }
        this.H3.setEmptyView(null);
        this.Z1.setVisibility(8);
    }

    @Override
    public final boolean I(dy dyVar) {
        return false;
    }

    public final void I6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.I6():void");
    }

    public final boolean I7(android.view.View r93, boolean r94, boolean r95, float r96, float r97, boolean r98, boolean r99, boolean r100) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.I7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final long I8() {
        if (this.N3 == 3) {
            return this.Z3;
        }
        return 0L;
    }

    public final void I9(boolean z10) {
        TLRPC.Chat chat;
        if (this.f41887da == null && (chat = this.f41890e) != null && ChatObject.canSendAsPeers(chat) && this.U != null && !ChatObject.isMonoForum(this.f41890e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.P5);
            this.f41887da = sendAsPeers;
            if (sendAsPeers != null) {
                this.U.Q1(false, z10);
            }
        }
    }

    public final void Ia() {
        if (this.L7 == null && this.M7 == null && this.N7 == null) {
            ge geVar = this.Q7;
            if (geVar != null) {
                AndroidUtilities.cancelRunOnUIThread(geVar);
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
        if (chatFull != null && !this.f41994m5) {
            TLRPC.Chat chat = this.f41890e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new ge(this, 14), 1000L);
            }
        }
    }

    public final void Ic() {
        boolean z10;
        if (this.f41905f1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f42018o3 && !this.f42005n3) || (this.N3 == 7 && this.K3 == 2 && !this.f42042q6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41905f1.e(6, z10, true);
        this.f41905f1.e(5, z10, true);
        if (z10) {
            this.f41905f1.e(1, false, true);
        }
        if (!z10) {
            this.f42134x7 = 0;
        }
        this.T0.invalidate();
    }

    @Override
    public final void J0(int i9, float f10, float f11, td.c cVar) {
        boolean z10;
        int i10;
        boolean z11;
        int i11;
        if (i9 == 0) {
            S9();
            return;
        }
        int i12 = 4;
        int i13 = 0;
        if (i9 == 1) {
            View view = this.P;
            if (view != null) {
                view.setAlpha(f10);
                View view2 = this.P;
                if (f10 > 0.0f) {
                    i12 = 0;
                }
                view2.setVisibility(i12);
            }
        } else if (i9 == 2) {
            S9();
            s7();
            yg.c cVar2 = this.yc;
            if (cVar2 != null) {
                cVar2.setAnimatedVisibility(this.f42076sc.f47775e);
            }
        } else {
            int i14 = 8;
            if (i9 == 3) {
                td.a aVar = this.f42089tc;
                float f12 = 1.0f - aVar.f47775e;
                this.I0.setAlpha(f12);
                org.telegram.ui.Components.sg sgVar = this.I0;
                if (f12 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                sgVar.setVisibility(i11);
                float f13 = 1.0f - aVar.f47775e;
                org.telegram.ui.Components.b21 b21Var = this.N1;
                if (b21Var != null) {
                    b21Var.setAlpha(f13);
                    org.telegram.ui.Components.b21 b21Var2 = this.N1;
                    if (f13 <= 0.0f) {
                        i13 = 8;
                    }
                    b21Var2.setVisibility(i13);
                }
            } else if (i9 == 4) {
                pg.e eVar = this.G3;
                td.a aVar2 = this.f42102uc;
                if (eVar != null) {
                    float f14 = aVar2.f47775e;
                    eVar.setAlpha(f14);
                    pg.e eVar2 = this.G3;
                    if (f14 > 0.0f) {
                        i14 = 0;
                    }
                    eVar2.setVisibility(i14);
                }
                if (aVar2.f47775e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                rg.f fVar = this.T;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                fVar.setVisibility(i10);
                l7();
                if (aVar2.f47775e < 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                ij ijVar = this.f42077t0;
                if (z11) {
                    i12 = 0;
                }
                ijVar.setVisibility(i12);
                s7();
                v7();
                u7();
                q9(1);
            } else if (i9 == 5) {
                k7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f10);
                }
            } else if (i9 == 6) {
                p7();
            }
        }
    }

    public final void J6(View view, int i9, boolean z10) {
        int i10;
        if (view != null) {
            float f10 = (1.0f - this.f42076sc.f47775e) * (1.0f - this.f42048qc.f47775e) * ((float[]) this.f42139xc.f4402b)[i9];
            view.setAlpha(f10);
            if (z10) {
                if (f10 > 0.0f) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (view.getVisibility() != i10) {
                    view.setVisibility(i10);
                }
            }
        }
    }

    public final int J8(int i9) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f42077t0.getMeasuredHeight() - this.f42123wa) - this.o9) - this.v.d()) - AndroidUtilities.dp(53.0f)) - i9) / 2.0f);
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
            this.f42160z7 = 0;
            this.A7 = false;
            Ga(messageObject);
            this.F7 = null;
        }
    }

    public final void Jb(MessageObject messageObject, CharSequence charSequence, int i9) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.gc G = org.telegram.ui.Components.oc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f28737j = max;
        G.v = new ve(this, i9, 3);
        G.k(true);
        this.C3 = messageObject;
        this.D3 = i9;
    }

    public final void Jc(String str) {
        if (this.N3 == 7 && !TextUtils.equals(this.f42039q3, str)) {
            M7();
            Lb(true);
            this.f42039q3 = str;
            this.f42028p3 = str;
            R6(false);
            x7(true);
            this.J6 = 0L;
            this.f41923g7 = false;
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
            zf.j0.C1(this, this.f42154z1, this.A1, this.P5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void K7() {
        if (this.h == null && this.f42079t2 == null && getParentActivity() != null) {
            yk ykVar = new yk(this, getParentActivity());
            this.f42079t2 = ykVar;
            ykVar.setTag(1);
            this.I0.addView(this.f42079t2, g7.e6.n(-1, 48));
            this.I0.h(1, this.f42079t2);
            this.I0.g(this.f42079t2);
            this.f42079t2.setOnClickListener(new pe(this, 17));
            this.f42079t2.setEnabled(!isInPreviewMode());
            this.f42079t2.setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            org.telegram.ui.Components.ef0 ef0Var = new org.telegram.ui.Components.ef0(getParentActivity(), this.f41848aa);
            this.f42105v2 = ef0Var;
            this.f42079t2.addView(ef0Var, g7.e6.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.f42079t2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.B2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.B2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23044fe));
            this.B2.setTypeface(AndroidUtilities.bold());
            this.f42079t2.addView(this.B2, g7.e6.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i9 = 0; i9 < 2; i9++) {
                pn pnVar = new pn(this, getParentActivity());
                pn[] pnVarArr = this.f42143y2;
                pnVarArr[i9] = pnVar;
                pnVar.setTextSize(14);
                pnVarArr[i9].setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23044fe));
                pnVarArr[i9].setTypeface(AndroidUtilities.bold());
                this.f42079t2.addView(pnVarArr[i9], g7.e6.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                zk zkVar = new zk(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.f42155z2;
                h5VarArr[i9] = zkVar;
                zkVar.setTextSize(14);
                h5VarArr[i9].setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23063ge));
                this.f42079t2.addView(h5VarArr[i9], g7.e6.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                bg.t tVar = new bg.t(getParentActivity(), 14);
                tVar.setSingleLine(true);
                tVar.setLines(1);
                tVar.setMaxLines(1);
                tVar.setEllipsize(TextUtils.TruncateAt.END);
                tVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Sh));
                tVar.setBackground(org.telegram.ui.ActionBar.v5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.f6.Oh)));
                tVar.setTextSize(1, 14.0f);
                tVar.setTypeface(AndroidUtilities.bold());
                tVar.setGravity(17);
                tVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                bg.t[] tVarArr = this.A2;
                tVarArr[i9] = tVar;
                this.f42079t2.addView(tVar, g7.e6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                al alVar = new al(getParentActivity());
                alVar.E = new dh.l();
                alVar.D = new Path();
                alVar.F = new float[8];
                org.telegram.ui.Components.o9[] o9VarArr = this.f42129x2;
                o9VarArr[i9] = alVar;
                alVar.setBlurAllowed(true);
                o9VarArr[i9].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f42079t2.addView(o9VarArr[i9], g7.e6.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i9 == 1) {
                    pnVarArr[i9].setVisibility(4);
                    tVarArr[i9].setVisibility(4);
                    h5VarArr[i9].setVisibility(4);
                    o9VarArr[i9].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.H2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.H2;
            int i10 = org.telegram.ui.ActionBar.f6.f23008de;
            int themedColor = getThemedColor(i10);
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
            int i11 = org.telegram.ui.ActionBar.f6.f23352x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i11) & 436207615, 1, -1));
            this.f42079t2.addView(this.H2, g7.e6.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.H2.setOnClickListener(new pe(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.F2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.F2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), mode));
            this.F2.setScaleType(scaleType);
            this.F2.setVisibility(8);
            this.F2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f41848aa);
            this.G2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.G2.setSize(AndroidUtilities.dp(16.0f));
            this.G2.setStrokeWidth(2.0f);
            this.G2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23026ee));
            this.f42079t2.addView(this.G2, g7.e6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.F2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i11) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f42079t2.addView(this.F2, g7.e6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.F2.setOnClickListener(new pe(this, 19));
            xc(false);
        }
    }

    public final int K8(MessageObject messageObject) {
        return J8(A8(messageObject, !TextUtils.isEmpty(this.L7))) - Ua(messageObject);
    }

    public final ni K9(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle) {
        ve.d dVar = this.f42124wb;
        if (dVar != null) {
            dVar.a(true);
            this.f42124wb = null;
        }
        if (characterStyle != null && t1Var != null && t1Var.getMessageObject() != null) {
            ni niVar = new ni(this, t1Var.getMessageObject().getId(), characterStyle, t1Var, 0);
            this.f42124wb = niVar;
            return niVar;
        }
        this.f42124wb = null;
        return null;
    }

    public final void Ka(ArrayList arrayList, int i9, boolean z10, boolean z11) {
        a0.h hVar;
        ArrayList arrayList2;
        bm bmVar;
        int i10;
        int i11;
        ArrayList arrayList3;
        HashMap hashMap;
        int i12;
        int i13;
        int i14;
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
        int i15 = 0;
        a0.h hVar2 = null;
        while (true) {
            int size = arrayList5.size();
            hVar = this.f42083t6;
            arrayList2 = this.f42042q6;
            if (i15 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i15);
            if (((MessageObject) this.F4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.F4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f41972k6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i9].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f41903f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f41903f.f22527id, (int) b(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Ta();
                this.Mb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Lb.bind(messageObject2.messageOwner.f22401id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f22401id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.F4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.F4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.H4) {
                    yc(0, true);
                }
            }
            if (i9 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f41983l6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.N3 == 1))) {
                if (z10) {
                    arrayList5.remove(i15);
                    i15--;
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
                        int i16 = 0;
                        while (true) {
                            if (i16 < tL_messageMediaWebPage.webpage.attributes.size()) {
                                TLRPC.WebPageAttribute webPageAttribute = tL_messageMediaWebPage.webpage.attributes.get(i16);
                                if (webPageAttribute instanceof TLRPC.TL_webPageAttributeStory) {
                                    storyItem2 = ((TLRPC.TL_webPageAttributeStory) webPageAttribute).storyItem;
                                    break;
                                }
                                i16++;
                            } else {
                                storyItem2 = storyItem;
                                break;
                            }
                        }
                        if (storyItem2 != null) {
                            TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage2 = (TLRPC.TL_messageMediaWebPage) MessageObject.getMedia(messageObject.messageOwner);
                            int i17 = 0;
                            while (true) {
                                if (i17 >= tL_messageMediaWebPage2.webpage.attributes.size()) {
                                    break;
                                }
                                TLRPC.WebPageAttribute webPageAttribute2 = tL_messageMediaWebPage2.webpage.attributes.get(i17);
                                if (webPageAttribute2 instanceof TLRPC.TL_webPageAttributeStory) {
                                    TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory = (TLRPC.TL_webPageAttributeStory) webPageAttribute2;
                                    if (!(tL_webPageAttributeStory.storyItem instanceof TL_stories.TL_storyItem)) {
                                        tL_webPageAttributeStory.storyItem = storyItem2;
                                    }
                                } else {
                                    i17++;
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
                    sparseArrayArr[i9].put(messageObject2.getId(), messageObject);
                } else {
                    sparseArrayArr[i9].remove(messageObject2.getId());
                }
                int indexOf2 = arrayList2.indexOf(messageObject2);
                if (indexOf2 >= 0) {
                    String str = messageObject2.dateKey;
                    HashMap hashMap2 = this.f42008n6;
                    ArrayList arrayList6 = (ArrayList) hashMap2.get(str);
                    if (arrayList6 != null) {
                        i11 = arrayList6.indexOf(messageObject2);
                    } else {
                        i11 = -1;
                    }
                    if (messageObject2.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject2.getGroupId())) != null && (indexOf = groupedMessages.messages.indexOf(messageObject2)) >= 0) {
                        i10 = i15;
                        if (messageObject2.getGroupId() != messageObject.getGroupId()) {
                            hVar.k(groupedMessages, messageObject.getGroupId());
                        }
                        if (messageObject.isMusic() || messageObject.isDocument() || ((arrayList4 = messageObject.photoThumbs) != null && !arrayList4.isEmpty())) {
                            arrayList3 = arrayList6;
                            hashMap = hashMap2;
                            i12 = i11;
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
                                int i18 = indexOf + 1;
                                arrayList7.addAll(arrayList8.subList(i18, arrayList8.size()));
                                int i19 = 0;
                                while (i19 < groupedMessages2.messages.size()) {
                                    groupedMessages2.messages.get(i19).localGroupId = groupedMessages2.groupId;
                                    groupedMessages.messages.remove(i18);
                                    i19++;
                                    hashMap2 = hashMap2;
                                    i11 = i11;
                                }
                                hashMap = hashMap2;
                                i12 = i11;
                                hVar2.k(groupedMessages2, groupedMessages2.groupId);
                                hVar.k(groupedMessages2, groupedMessages2.groupId);
                            } else {
                                arrayList3 = arrayList6;
                                hashMap = hashMap2;
                                i12 = i11;
                            }
                            groupedMessages.messages.remove(indexOf);
                        }
                    } else {
                        i10 = i15;
                        arrayList3 = arrayList6;
                        hashMap = hashMap2;
                        i12 = i11;
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
                        bm bmVar2 = this.f42114w0;
                        if (bmVar2 != null && !bmVar2.J) {
                            bmVar2.Q(bmVar2.F + indexOf2);
                        }
                        if (i12 >= 0) {
                            arrayList3.set(i12, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i20 = i12;
                        arrayList2.remove(indexOf2);
                        bm bmVar3 = this.f42114w0;
                        if (bmVar3 != null && !bmVar3.J) {
                            bmVar3.u(bmVar3.F + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.h hVar3 = this.p6;
                        if (((MessageObject) hVar3.f(id4)) != null) {
                            hVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            bm bmVar4 = this.f42114w0;
                            int i21 = bmVar4.A;
                            int i22 = bmVar4.B;
                            int i23 = bmVar4.D;
                            int i24 = bmVar4.C;
                            if (!bmVar4.J) {
                                bmVar4.u(bmVar4.F + indexOf2);
                                if (arrayList2.isEmpty()) {
                                    if (i21 >= 0) {
                                        i14 = 0;
                                        this.f42114w0.u(0);
                                    } else {
                                        i14 = 0;
                                    }
                                    if (i22 >= 0) {
                                        this.f42114w0.u(i14);
                                    }
                                    if (i23 >= 0) {
                                        this.f42114w0.u(i14);
                                    }
                                    if (i24 >= 0) {
                                        this.f42114w0.u(i14);
                                    }
                                }
                            }
                        }
                        if (i20 >= 0) {
                            arrayList9.remove(i20);
                            if (arrayList9.isEmpty()) {
                                hashMap.remove(messageObject2.dateKey);
                                this.o6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                bm bmVar5 = this.f42114w0;
                                int i25 = bmVar5.A;
                                int i26 = bmVar5.B;
                                int i27 = bmVar5.D;
                                int i28 = bmVar5.C;
                                if (!bmVar5.J) {
                                    bmVar5.u(bmVar5.F + indexOf2);
                                    if (arrayList2.isEmpty()) {
                                        if (i25 >= 0) {
                                            i13 = 0;
                                            this.f42114w0.u(0);
                                        } else {
                                            i13 = 0;
                                        }
                                        if (i26 >= 0) {
                                            this.f42114w0.u(i13);
                                        }
                                        if (i27 >= 0) {
                                            this.f42114w0.u(i13);
                                        }
                                        if (i28 >= 0) {
                                            this.f42114w0.u(i13);
                                        }
                                        Dc(messageObject, messageObject2.getId());
                                        i15 = i10;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i10 = i15;
                }
                Dc(messageObject, messageObject2.getId());
                i15 = i10;
            }
            i15++;
            arrayList5 = arrayList;
        }
        if (hVar2 != null) {
            for (int i29 = 0; i29 < hVar2.m(); i29++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar2.n(i29);
                if (groupedMessages3.messages.isEmpty()) {
                    hVar.l(groupedMessages3.groupId);
                } else {
                    groupedMessages3.calculate();
                    int indexOf3 = arrayList2.indexOf((MessageObject) j3.r0.j(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (bmVar = this.f42114w0) != null) {
                        bmVar.q(indexOf3 + bmVar.F, groupedMessages3.messages.size());
                        kj kjVar = this.f42090u0;
                        if (kjVar != null) {
                            kjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        zc();
    }

    public final void Kb(boolean z10) {
        boolean z11;
        rg.g gVar = this.f41905f1;
        if (gVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.f41890e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            gVar.e(2, z11, true);
            if (!z10) {
                this.f42134x7 = 0;
            }
        }
    }

    public final void Kc() {
        ak akVar;
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
                org.telegram.ui.Components.ux0 ux0Var = this.Z0;
                if (ux0Var != null) {
                    ux0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f41890e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.f41890e)) {
                    TLRPC.Chat chat2 = this.f41890e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.f41890e.megagroup)) {
                        TLRPC.Chat chat3 = this.f41890e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i9 = org.telegram.ui.ActionBar.f6.Oh;
                                mutate.setTint(getThemedColor(i9));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.fq fqVar = new org.telegram.ui.Components.fq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                fqVar.f28545e = dp;
                                fqVar.f28546f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                fqVar.h = dp3;
                                fqVar.f28547n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.l0.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i9)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(fqVar, 1), 0, 1, 33);
                                this.A0.setBackground(org.telegram.ui.ActionBar.f6.g0(0, org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.f23092i6, false)));
                                this.A0.setText(spannableStringBuilder);
                                this.A0.setOnClickListener(new pe(this, 0));
                            } else {
                                this.A0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.A0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.A0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.f41890e.banned_rights.until_date)));
                        }
                        this.N.setVisibility(0);
                        this.E1.setVisibility(8);
                        this.E1.setTag(null);
                        sc();
                        org.telegram.ui.Components.ux0 ux0Var2 = this.Z0;
                        if (ux0Var2 != null) {
                            ux0Var2.f();
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
                        this.A0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, aa.d.r(new StringBuilder("<b>"), this.f41903f.first_name, "</b>"))));
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
                    if (this.Z0 != null && (akVar = this.U) != null && akVar.j0()) {
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
                this.U.l0(false);
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
            ij ijVar = this.f42077t0;
            if (ijVar != null) {
                ijVar.invalidate();
            }
        }
    }

    public final void L7() {
        int i9;
        int i10;
        if (this.N2 == null && getParentActivity() != null) {
            ek ekVar = new ek(this, getParentActivity(), 1);
            this.N2 = ekVar;
            ekVar.setClickable(false);
            this.N2.setWillNotDraw(false);
            this.f42139xc.j(4, false, false);
            this.N2.setClipToPadding(false);
            org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(getParentActivity(), true, true, true);
            this.Q2 = j6Var;
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            j6Var.b(0.25f, 280L, grVar);
            this.Q2.setTextSize(AndroidUtilities.dp(15.0f));
            this.Q2.setTypeface(AndroidUtilities.bold());
            this.Q2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23376ye));
            this.Q2.setGravity(3);
            this.N2.addView(this.Q2, g7.e6.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.Q.addView(this.N2, g7.e6.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(getParentActivity(), true, false, true);
            this.R2 = j6Var2;
            j6Var2.b(0.0f, 420L, grVar);
            this.R2.setScaleProperty(0.7f);
            this.R2.setTextSize(AndroidUtilities.dp(15.0f));
            this.R2.setGravity(5);
            this.R2.setTypeface(AndroidUtilities.bold());
            this.R2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.o6));
            org.telegram.ui.Components.j6 j6Var3 = this.R2;
            if (this.f42102uc.f47776f) {
                i9 = R.string.SearchAsChat;
            } else {
                i9 = R.string.SearchAsList;
            }
            j6Var3.setText(LocaleController.getString(i9));
            org.telegram.ui.Components.j6 j6Var4 = this.R2;
            j6Var4.f29650n = false;
            j6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.R2.setOnClickListener(new pe(this, 2));
            this.R2.setAlpha(0.5f);
            this.R2.setClickable(false);
            this.N2.addView(this.R2, g7.e6.e(-2, -1, 117));
            org.telegram.ui.Components.j6 j6Var5 = new org.telegram.ui.Components.j6(getParentActivity(), true, true, true);
            this.S2 = j6Var5;
            j6Var5.setGravity(17);
            this.S2.setTypeface(AndroidUtilities.bold());
            this.S2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.Ae));
            this.S2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.j6 j6Var6 = this.S2;
            int i11 = org.telegram.ui.ActionBar.f6.f23001d6;
            j6Var6.setBackground(org.telegram.ui.ActionBar.f6.g0(getThemedColor(i11), org.telegram.ui.ActionBar.f6.v(getThemedColor(i11), getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6))));
            org.telegram.ui.Components.j6 j6Var7 = this.S2;
            if (this.f42114w0.J) {
                i10 = R.string.SavedTagHideOtherMessages;
            } else {
                i10 = R.string.SavedTagShowOtherMessages;
            }
            j6Var7.setText(LocaleController.getString(i10));
            this.S2.setOnClickListener(new pe(this, 3));
            this.S2.setVisibility(8);
            this.S2.setAlpha(0.0f);
            this.N2.addView(this.S2, g7.e6.e(-1, -1, 119));
            TLRPC.Chat chat = this.f41890e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.f41890e.megagroup) && this.N3 != 7 && !ChatObject.isMonoForum(this.f41890e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.P2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.P2.setImageResource(R.drawable.msg_usersearch);
                this.P2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23359xe), PorterDuff.Mode.MULTIPLY));
                this.P2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), 1, -1));
                this.N2.addView(this.P2, g7.e6.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.P2.setOnClickListener(new pe(this, 4));
                this.P2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.N3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.O2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.O2.setImageResource(R.drawable.msg_calendar);
                this.O2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23359xe), PorterDuff.Mode.MULTIPLY));
                this.O2.setBackgroundDrawable(org.telegram.ui.ActionBar.f6.f0(getThemedColor(org.telegram.ui.ActionBar.f6.f23388z8), 1, -1));
                this.N2.addView(this.O2, g7.e6.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.O2.setOnClickListener(new pe(this, 5));
                this.O2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int L8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f42077t0.getMeasuredHeight() - view.getBottom()) - this.f42077t0.getPaddingBottom()) + "} chatHeight=" + this.f42077t0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f42077t0.getPaddingBottom());
        return (this.f42077t0.getMeasuredHeight() - view.getBottom()) - this.f42077t0.getPaddingBottom();
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
        this.f42043q7 = 0;
        this.f41923g7 = false;
        this.f41936h7 = true;
        this.f41884d6.clear();
    }

    public final void Lb(boolean z10) {
        int i9;
        if (this.G3 != null) {
            td.a aVar = this.f42102uc;
            if (aVar.f47776f != z10) {
                aVar.a(z10, true);
                if (!z10 && this.N3 == 7) {
                    f2.m0 m0Var = (f2.m0) this.H3.getLayoutManager();
                    Object E = this.I3.E((m0Var.N0() + m0Var.L0()) / 2);
                    Object E2 = this.I3.E(m0Var.L0());
                    Object E3 = this.I3.E(m0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.f42114w0.L();
                        int L0 = this.f42103v0.L0();
                        int N0 = this.f42103v0.N0();
                        int i10 = ((MessageObject) E).messageOwner.f22401id;
                        int i11 = ((MessageObject) E2).messageOwner.f22401id;
                        int i12 = ((MessageObject) E3).messageOwner.f22401id;
                        boolean z11 = false;
                        boolean z12 = false;
                        int i13 = -1;
                        for (int i14 = 0; i14 < L.size(); i14++) {
                            if (((MessageObject) L.get(i14)).messageOwner.f22401id == i11) {
                                int i15 = this.f42114w0.F + i14;
                                if (L0 <= i15 && N0 >= i15) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i14)).messageOwner.f22401id == i12) {
                                int i16 = this.f42114w0.F + i14;
                                if (L0 <= i16 && N0 >= i16) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i14)).messageOwner.f22401id == i10) {
                                i13 = i14;
                            }
                        }
                        if (!z11 && !z12 && i13 != -1) {
                            int A8 = A8((MessageObject) L.get(i13), true);
                            this.f42103v0.h1(this.f42114w0.F + i13, (this.f42077t0.getHeight() - A8) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.j6 j6Var = this.R2;
                if (j6Var != null) {
                    if (aVar.f47776f) {
                        i9 = R.string.SearchAsChat;
                    } else {
                        i9 = R.string.SearchAsList;
                    }
                    j6Var.c(LocaleController.getString(i9), !LocaleController.isRTL, true);
                }
                kh.x3 x3Var = this.f42078t1;
                if (x3Var != null && x3Var.R) {
                    x3Var.e(true);
                }
                ml mlVar = this.f42128x1;
                if (mlVar != null && mlVar.R) {
                    mlVar.e(true);
                }
                ak akVar = this.U;
                if (akVar != null) {
                    akVar.k0();
                }
                Gc();
            }
        }
    }

    public final void Lc() {
        boolean z10;
        int i9;
        int i10;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        long a2 = a();
        long clientUserId = getUserConfig().getClientUserId();
        SparseArray[] sparseArrayArr = this.S5;
        if (a2 == clientUserId) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i11 = 0; i11 < sparseArrayArr.length; i11++) {
                for (int i12 = 0; i12 < sparseArrayArr[i11].size(); i12++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i11].valueAt(i12);
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
            rk rkVar = this.Xa;
            if (rkVar != null) {
                rkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Xa.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                rk rkVar2 = this.Xa;
                if (isEmpty) {
                    i10 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i10 = R.string.SavedTagReactionsSelectedEditHint;
                }
                rkVar2.setHint(LocaleController.getString(i10));
                AndroidUtilities.runOnUIThread(new ge(this, 11), 120L);
            } else {
                z10 = !org.telegram.ui.Components.uj0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.w0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i9 = R.drawable.menu_tag_edit;
                } else {
                    i9 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.pi0 pi0Var = k10.f23924x;
                if (pi0Var != null && k10.f23925y != i9) {
                    k10.f23925y = i9;
                    AndroidUtilities.updateImageViewImageAnimated(pi0Var, i9);
                }
            }
        }
        if (this.U9 != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i13 = 0; i13 < sparseArray.size(); i13++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i13));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i14 = 0; i14 < sparseArray2.size(); i14++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i14));
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
        MessageObject messageObject2 = this.f41982l5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f41857b5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i9 = messageObject2.type;
            if ((i9 == 0 || i9 == 19) && (webPage = this.C5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.C5 = null;
                ak akVar = this.U;
                if (akVar != null) {
                    akVar.S2 = null;
                    akVar.T2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f41857b5;
                if (messagePreviewParams2 != null) {
                    int i10 = this.currentAccount;
                    CharSequence fieldText = akVar.getFieldText();
                    MessageObject messageObject3 = this.f41959j5;
                    if (messageObject3 == this.T3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i10, null, fieldText, messageObject, this.f41934h5, this.f41982l5);
                }
                i8();
                j8();
            }
        }
    }

    public final void M7() {
        if (this.Z1 == null && this.f42026p1 == null) {
            org.telegram.ui.Components.e00 e00Var = new org.telegram.ui.Components.e00(getParentActivity(), this.f41848aa);
            this.Y1 = e00Var;
            e00Var.setViewType(7);
            org.telegram.ui.Components.gw0 gw0Var = new org.telegram.ui.Components.gw0(getParentActivity(), this.Y1, 1, null);
            this.Z1 = gw0Var;
            gw0Var.setClickable(true);
            this.Z1.d.setText(LocaleController.getString(R.string.NoResult));
            this.Z1.setVisibility(8);
            this.Z1.addView(this.Y1, 0);
            this.Z1.e(true, false);
            this.G3.addView(this.Z1, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.n30 n30Var = new org.telegram.ui.Components.n30(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f42026p1 = n30Var;
            n30Var.setOnHashtagClickListener(new se(this, 2));
            this.f42026p1.setOnScrollListener(new l3(this, 5));
            this.f42026p1.setVisibility(8);
            this.G3.addView(this.f42026p1, -1, -1);
            r7();
            p7();
        }
    }

    public final in M8() {
        if (this.f41977kc == null) {
            this.f41977kc = new in(this);
        }
        return this.f41977kc;
    }

    public final boolean M9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.x5 x5Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.x5 animation;
        boolean z10;
        org.telegram.ui.Cells.t1 messageCell;
        boolean z11;
        if (this.f42077t0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.s30 s30Var = this.f42027p2;
            ArrayList<MessageObject> arrayList = null;
            if (s30Var != null && s30Var.getTag() != null && (messageCell = this.f42027p2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                x5Var = photoImage2.getAnimation();
                if (x5Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f42077t0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f42085t8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                x5Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f42077t0.getChildCount();
                int i9 = 0;
                while (true) {
                    if (i9 >= childCount) {
                        break;
                    }
                    View childAt = this.f42077t0.getChildAt(i9);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject2 = t1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = t1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f42077t0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f42077t0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f42085t8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f42077t0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    x5Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                x5Var = animation;
                            }
                        }
                    }
                    i9++;
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
                messageObject.audioProgress = x5Var.n();
                messageObject.audioProgressMs = x5Var.o();
                x5Var.stop();
                if (PhotoViewer.K1(messageObject)) {
                    PhotoViewer.W8.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ma() {
        this.f42101ub = null;
        this.f42075sb = 0;
        this.f42088tb = -1;
        this.vb = null;
        this.f42124wb = null;
        this.f41905f1.d(false);
    }

    public final void Mb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41848aa);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            c2Var.P = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new gh.c3(this, tL_game, messageObject, str, j10));
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
                    presentFragment(new ii1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        ii1.U(str, messageObject, parentActivity, str6, str3);
    }

    public final void Mc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        if (this.fragmentView != null && !this.f41994m5) {
            int childCount = this.f42077t0.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 < childCount) {
                    View childAt = this.f42077t0.getChildAt(i9);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject = t1Var.getMessageObject();
                        if (this.f42032p8 != null && ((messageObject.isRoundVideo() || messageObject.isVideo()) && !messageObject.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject))) {
                            ImageReceiver photoImage = t1Var.getPhotoImage();
                            this.f42032p8.setTranslationX(t1Var.getX() + photoImage.getImageX());
                            this.f42032p8.setTranslationY((this.f42077t0.getY() + (photoImage.getImageY() + (t1Var.getY() + t1Var.getPaddingTop()))) - this.f42032p8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f42032p8.getLayoutParams();
                            if (messageObject.isRoundVideo()) {
                                this.f42032p8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(C9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(C9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(C9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f42058r8.setResizeMode(0);
                                    this.f42032p8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(C9())) / AndroidUtilities.roundPlayingMessageSize(C9());
                                float imageWidth = t1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(C9());
                                if (this.f42032p8.getScaleX() != imageWidth) {
                                    this.f42032p8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f42032p8.setPivotX(0.0f);
                                this.f42032p8.setPivotY(0.0f);
                                this.f42032p8.setScaleX(imageWidth);
                                this.f42032p8.setScaleY(imageWidth);
                                this.f42072s8.setScaleX(roundPlayingMessageSize2);
                                this.f42072s8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f42032p8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f42058r8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f42032p8.setLayoutParams(layoutParams);
                                }
                                this.f42072s8.setScaleX(1.0f);
                                this.f42072s8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f42032p8.invalidate();
                            z12 = true;
                        }
                    }
                    i9++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f42032p8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f41945i3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f42032p8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(C9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f41945i3 && PipRoundVideoView.B == null) {
                            if (z11) {
                                j(playingMessageObject.getId(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f42085t8) {
                        this.f42077t0.invalidate();
                    }
                }
            }
        }
    }

    public final void N6() {
        MessageObject editingMessageObject;
        int abs;
        ak akVar = this.U;
        if (akVar != null && (editingMessageObject = akVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f41903f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.go[]) this.W.f6412b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.f41890e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        h5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new jg(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.oe oeVar = this.U.A1;
                if (oeVar != null) {
                    oeVar.setVisibility(8);
                }
                h5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView N7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f42098u8);
        if (this.f42032p8 == null) {
            ek ekVar = new ek(this, getParentActivity(), 2);
            this.f42032p8 = ekVar;
            ekVar.setOutlineProvider(new cl(this));
            this.f42032p8.setClipToOutline(true);
            this.f42032p8.setWillNotDraw(false);
            c5.c cVar = new c5.c(getParentActivity());
            this.f42058r8 = cVar;
            cVar.setBackgroundColor(0);
            if (z10) {
                this.f42032p8.addView(this.f42058r8, g7.e6.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f42072s8 = textureView;
            textureView.setOpaque(false);
            this.f42058r8.addView(this.f42072s8, g7.e6.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f42032p8.getParent();
        if (viewGroup != null && viewGroup != this.T0) {
            viewGroup.removeView(this.f42032p8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.T0.addView(this.f42032p8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(C9()), AndroidUtilities.roundPlayingMessageSize(C9())));
        }
        this.f42032p8.setTag(null);
        this.f42058r8.setDrawingReady(false);
        return this.f42072s8;
    }

    public final long N8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.f41890e) || !ChatObject.canManageMonoForum(this.currentAccount, this.f41890e)) {
            return 0L;
        }
        long j10 = this.Z3;
        int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i9 == 0 && (messageObject2 = this.f41982l5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i9 == 0 && (messageObject = this.f41959j5) != null && (message = messageObject.messageOwner) != null) {
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
        if (indexOf > 0 && !(o2Var instanceof qn) && !(o2Var instanceof ProfileActivity) && this.f41890e.creator) {
            int size = b5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) b5Var2.getFragmentStack().get(indexOf);
                if (o2Var2 instanceof qn) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new qn(e2.c.g(j10, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new ProfileActivity(e2.c.g(j10, "chat_id"), null));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof ho) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new ho(e2.c.g(j10, "chat_id")));
                    o2Var2.removeSelfFromStack();
                } else if (o2Var2 instanceof jr) {
                    if (((jr) o2Var2).f39559a1 == 0) {
                        Bundle arguments = o2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) b5Var2).c(indexOf, new jr(arguments));
                    }
                    o2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new k6(this, o2Var, messageObject, b5Var2, 4));
        }
        AndroidUtilities.runOnUIThread(new bg.e1(this, j10, 3), 1000L);
    }

    public final void Na(org.telegram.ui.Cells.t1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Na(org.telegram.ui.Cells.t1):void");
    }

    public final void Nb(boolean z10) {
        if (z10) {
            if (this.f42152yb == null) {
                ge geVar = new ge(this, 10);
                this.f42152yb = geVar;
                AndroidUtilities.runOnUIThread(geVar, 100L);
                return;
            }
            return;
        }
        ge geVar2 = this.f42152yb;
        if (geVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(geVar2);
        }
        this.f42152yb = null;
        this.f42138xb = false;
        xc(true);
    }

    public final void Nc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        dj djVar = this.W0;
        if (djVar == null) {
            return;
        }
        int i9 = this.N3;
        if (i9 == 8 && (chat2 = this.f41890e) != null) {
            if (this.P3) {
                String i10 = vf.c.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.f41890e;
                djVar.h(i10, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i11 = (this.Z3 > 0L ? 1 : (this.Z3 == 0L ? 0 : -1));
                if (i11 == 0) {
                    TLRPC.Chat chat4 = this.f41890e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.f41890e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.f41890e;
                        }
                        this.W0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        dj djVar2 = this.W0;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.f41890e;
                        djVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i11 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.Z3));
                    this.W0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.Z3));
                    if (chat7 == null) {
                        chat7 = this.f41890e;
                    }
                    this.W0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                dj djVar3 = this.W0;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.f41890e.title));
                TLRPC.Chat chat8 = this.f41890e;
                djVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i9 == 9) {
            djVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i9 == 5) {
            if ("hello".equalsIgnoreCase(this.M3)) {
                this.W0.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.M3)) {
                this.W0.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.W0.setTitle(this.M3);
            }
        } else if (i9 == 6) {
            if (!TextUtils.isEmpty(this.L3.title)) {
                this.W0.setTitle(this.L3.title);
            } else {
                this.W0.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i9 == 3) {
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
            } else if (F9() && !UserObject.isBotForum(this.f41903f)) {
                if (this.f41882d4) {
                    Sc();
                } else if (this.f41869c4) {
                    if (this.T3.hasReplies()) {
                        this.W0.setTitle(LocaleController.formatPluralString("Comments", this.T3.getRepliesCount(), new Object[0]));
                    } else {
                        this.W0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.W0.setTitle(LocaleController.formatPluralString("Replies", this.T3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f41903f)) {
                this.W0.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f41903f)) {
                this.W0.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i12 = this.N3;
                if (i12 == 1) {
                    if (UserObject.isUserSelf(this.f41903f)) {
                        this.W0.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.W0.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i12 == 2) {
                    this.W0.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", G8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.f41890e;
                    if (chat9 != null) {
                        dj djVar4 = this.W0;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.f41890e;
                        djVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f41903f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.W0.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f41903f.f22527id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f41903f.phone)) {
                                    dj djVar5 = this.W0;
                                    String g10 = org.telegram.messenger.ll.g(new StringBuilder("+"), this.f41903f.phone, ne.b.c());
                                    TLRPC.User user4 = this.f41903f;
                                    djVar5.h(g10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f41903f), this.f41903f.emoji_status, z10);
                                } else {
                                    dj djVar6 = this.W0;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f41903f)));
                                    TLRPC.User user5 = this.f41903f;
                                    djVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f41903f), this.f41903f.emoji_status, z10);
                                }
                            } else {
                                dj djVar7 = this.W0;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f41903f)));
                                TLRPC.User user6 = this.f41903f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f41903f);
                                if (!MessagesController.isSupportUser(this.f41903f)) {
                                    emojiStatus = this.f41903f.emoji_status;
                                }
                                djVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
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
        if (call != null && (((str = this.f41873c8) != null || this.f41886d8) && this.J5)) {
            org.telegram.ui.Components.voip.e2.m(this.f41890e, str, this.U7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f41873c8 = null;
            this.f41886d8 = false;
            return;
        }
        if (this.f41873c8 != null && z10 && (chatFull = this.V7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.l0.p(R.string.LinkHashExpired, org.telegram.ui.Components.oc.a0(this), R.raw.linkbroken, 36);
            this.f41873c8 = null;
        }
        this.T7 = !this.J5;
    }

    public final void O7() {
        if (this.T0 != null && this.G1 == null && getParentActivity() != null) {
            this.G1 = new org.telegram.ui.ActionBar.r0(this, getParentActivity(), 1);
            o9();
            this.G1.setClickable(true);
            this.I0.addView(this.G1, g7.e6.n(-1, 44));
            this.I0.h(2, this.G1);
            this.I0.g(this.G1);
            TextView textView = new TextView(getParentActivity());
            this.J1 = textView;
            int i9 = org.telegram.ui.ActionBar.f6.f23230q7;
            textView.setTextColor(getThemedColor(i9));
            TextView textView2 = this.J1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            textView2.setBackground(org.telegram.ui.ActionBar.f6.W(dp, getThemedColor(i9) & 436207615, dp2, dp2, dp2, dp2));
            this.J1.setTag(Integer.valueOf(i9));
            this.J1.setTextSize(1, 14.0f);
            this.J1.setTypeface(AndroidUtilities.bold());
            this.J1.setSingleLine(true);
            this.J1.setMaxLines(1);
            this.J1.setGravity(17);
            this.G1.addView(this.J1, g7.e6.e(-1, -1, 51));
            this.J1.setOnClickListener(new pe(this, 13));
            org.telegram.ui.Components.l80 l80Var = new org.telegram.ui.Components.l80(getParentActivity(), this.f41848aa);
            this.P1 = l80Var;
            l80Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23063ge));
            this.P1.setTextSize(1, 13.3f);
            this.P1.setDisablePaddingsOffset(true);
            this.P1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.il));
            this.P1.setGravity(17);
            this.P1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.I0.addView(this.P1, g7.e6.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.I0.h(8, this.P1);
            this.I0.g(this.P1);
            TextView textView3 = new TextView(getParentActivity());
            this.H1 = textView3;
            int i10 = org.telegram.ui.ActionBar.f6.f23081he;
            textView3.setTextColor(getThemedColor(i10));
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
            textView4.setBackground(org.telegram.ui.ActionBar.f6.W(dp3, getThemedColor(i10) & 436207615, dp4, dp4, dp4, dp4));
            this.G1.addView(this.H1, g7.e6.e(-1, -1, 51));
            this.H1.setOnClickListener(new pe(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.K1 = textView5;
            textView5.setTextColor(getThemedColor(i10));
            this.K1.setVisibility(8);
            this.K1.setTextSize(1, 14.0f);
            this.K1.setTypeface(AndroidUtilities.bold());
            this.K1.setSingleLine(true);
            this.K1.setMaxLines(1);
            this.K1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.K1.setGravity(17);
            this.K1.setText(LocaleController.getString(R.string.RestartTopic));
            this.K1.setBackground(org.telegram.ui.ActionBar.f6.f0(getThemedColor(i10) & 436207615, 3, -1));
            this.I0.addView(this.K1, g7.e6.n(-1, 48));
            this.I0.h(4, this.K1);
            this.I0.g(this.K1);
            this.K1.setOnClickListener(new pe(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.Q1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.Q1.setContentDescription(LocaleController.getString(R.string.Close));
            this.Q1.setBackground(org.telegram.ui.ActionBar.f6.M(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), 0, 0));
            this.Q1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23008de), PorterDuff.Mode.MULTIPLY));
            this.Q1.setScaleType(ImageView.ScaleType.CENTER);
            this.G1.addView(this.Q1, g7.e6.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.Q1.setOnClickListener(new pe(this, 16));
        }
    }

    public final int O8() {
        return this.T0.getBackgroundSizeY();
    }

    public final void O9(boolean z10) {
        int i9;
        if (this.f42077t0 != null) {
            ArrayList arrayList = this.f42042q6;
            if (!arrayList.isEmpty() && !this.f42074sa.f40824n) {
                if (z10) {
                    i9 = 0;
                    while (i9 < arrayList.size() && ((MessageObject) arrayList.get(i9)).isSponsored()) {
                        i9++;
                    }
                } else {
                    i9 = 0;
                }
                this.f42103v0.h1(i9, 0);
                this.f42077t0.B0();
            }
        }
    }

    public final void Oa() {
        org.telegram.ui.Components.jb0 i9;
        on onVar = this.f41848aa;
        if (onVar != null) {
            Drawable d = onVar.d();
            if (this.fragmentView != null) {
                d = this.T0.getBackgroundImage();
            }
            if (d instanceof tn) {
                d = ((tn) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.jb0) {
                ((org.telegram.ui.Components.jb0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.d5) && (i9 = ((org.telegram.ui.ActionBar.d5) themedDrawable).i()) != null) {
                i9.x(false);
            }
        }
    }

    public final void Ob(boolean z10) {
        float f10;
        int i9;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupNotifyPeriod * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                if (z10) {
                    f10 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupUpload;
                } else {
                    f10 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupDownload;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(this);
                    int i11 = R.raw.speed_limit;
                    if (z10) {
                        i9 = R.string.UploadSpeedLimited;
                    } else {
                        i9 = R.string.DownloadSpeedLimited;
                    }
                    String string = LocaleController.getString(i9);
                    if (z10) {
                        i10 = R.string.UploadSpeedLimitedMessage;
                    } else {
                        i10 = R.string.DownloadSpeedLimitedMessage;
                    }
                    org.telegram.ui.Components.gc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i10), new af(this, z10, 0)), spannableString), i11);
                    M.f28737j = 8000;
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
        if (this.f42091u1 == null && ChatObject.isMegagroup(this.f41890e) && (chatFull = getMessagesController().getChatFull(this.f41890e.f22380id)) != null && this.U != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            fk fkVar = this.K0;
            if (fkVar == null || fkVar.getVisibility() != 0) {
                org.telegram.ui.Components.t30 t30Var = org.telegram.ui.Components.t30.f32610n;
                if (t30Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f22386id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        t30Var.b();
                        kh.x3 x3Var = new kh.x3(getParentActivity(), 3);
                        this.f42091u1 = x3Var;
                        x3Var.i();
                        this.f42091u1.q(true);
                        kh.x3 x3Var2 = this.f42091u1;
                        x3Var2.G = Layout.Alignment.ALIGN_CENTER;
                        x3Var2.r(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(j10, this.f42091u1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.i41(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f42091u1.t(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        kh.x3 x3Var3 = this.f42091u1;
                        x3Var3.h = kh.x3.a(x3Var3.getText(), this.f42091u1.getTextPaint());
                        kh.x3 x3Var4 = this.f42091u1;
                        x3Var4.d = -1L;
                        x3Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new jg(this, 27), 300L);
                    }
                }
            }
        }
    }

    public final void P7() {
        int i9;
        if (this.N1 == null && getParentActivity() != null) {
            if (this.f42079t2 == null) {
                K7();
            }
            org.telegram.ui.Components.b21 b21Var = new org.telegram.ui.Components.b21(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.N1 = b21Var;
            b21Var.K = new ge(this, 5);
            lg.d n10 = mg.c.n(this.f41848aa);
            ig.a aVar = this.F;
            b21Var.setSideMenuBackgroundDrawable(aVar.c(b21Var, n10, false));
            org.telegram.ui.Components.b21 b21Var2 = this.N1;
            b21Var2.setTopMenuBackgroundDrawable(aVar.c(b21Var2, mg.c.n(this.f41848aa), false));
            this.N1.setCurrentTopic(b());
            this.N1.setOnNewTopicSelected(new ge(this, 6));
            this.N1.setOnTopicSelected(new re(this, 0));
            this.N1.setOnDialogSelected(new re(this, 1));
            int indexOfChild = this.T0.indexOfChild(this.T);
            if (indexOfChild >= 0) {
                i9 = indexOfChild + 1;
            } else {
                i9 = 8;
            }
            this.T0.addView(this.N1, i9, g7.e6.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.N1.n();
            tj tjVar = this.E1;
            if (tjVar != null) {
                tjVar.bringToFront();
            }
        }
    }

    public final float P8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.T0.getBackgroundTranslationY()) - ((1.0f - this.f42086t9) * this.o9);
    }

    public final boolean P9() {
        ak akVar = this.U;
        boolean z10 = akVar.f26189u2;
        if (z10) {
            akVar.s1();
            this.f42156z3 = true;
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
        fk fkVar;
        ak akVar = this.U;
        if (akVar != null && akVar.f26210y1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.U4 && akVar != null && (fkVar = this.K0) != null && fkVar.getVisibility() != 0) {
            messageObject = this.f41959j5;
            charSequence = AndroidUtilities.getTrimmedString(this.U.getDraftMessage());
            z10 = this.U.T2;
        } else {
            messageObject = null;
            charSequence = null;
            z10 = true;
        }
        if (this.f41947i5) {
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
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f41947i5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        gn gnVar = this.f41934h5;
        MessageSuggestionParams messageSuggestionParams = this.f41870c5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        ak akVar2 = this.U;
        if (akVar2 != null) {
            j10 = akVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.saveDraft(j11, B7, charSequence2, entities, message, gnVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void Pb(boolean z10) {
        if (this.L != null) {
            if (!AndroidUtilities.isTablet() && !this.f41869c4 && this.f41903f == null) {
                if (this.f41902eb == null) {
                    this.f41902eb = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f41902eb.booleanValue()) {
                    this.f41888db = z10;
                    return;
                }
            }
            int i9 = 0;
            if (this.K5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f41888db) {
                    return;
                }
                this.f41888db = z10;
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
                this.L.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new li(this, 3)).start();
                return;
            }
            this.f41888db = z10;
            FrameLayout frameLayout = this.L;
            if (!z10) {
                i9 = 4;
            }
            frameLayout.setVisibility(i9);
        }
    }

    public final void Pc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (this.W0 != null) {
            int i9 = this.N3;
            if (i9 == 0 || i9 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.P5, b());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f41890e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f41903f)) {
                    if (!UserObject.isReplyUser(this.f41903f) && ((!F9() || this.f41882d4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.H6), PorterDuff.Mode.SRC_IN));
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f41890e;
                    if (chat != null) {
                        drawable = this.W0.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f41903f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.W0.c(DialogObject.getBotVerificationIcon(this.f41903f));
                        }
                    }
                }
                this.W0.j(drawable, mutate);
                if (!z10 && (u0Var = this.f41841a1) != null) {
                    if (isDialogMuted) {
                        if (u0Var.f23811l != 8) {
                            u0Var.f23811l = 8;
                            View view = u0Var.f23808i;
                            if (view instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view).getRightIcon().setVisibility(u0Var.f23811l);
                            }
                        }
                        this.f41841a1.d(LocaleController.getString(R.string.Unmute));
                        this.f41841a1.b(R.drawable.msg_mute);
                    } else {
                        if (u0Var.f23811l != 0) {
                            u0Var.f23811l = 0;
                            View view2 = u0Var.f23808i;
                            if (view2 instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view2).getRightIcon().setVisibility(u0Var.f23811l);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.P5, b())) {
                            this.f41841a1.d(LocaleController.getString(R.string.Mute));
                            this.f41841a1.b(R.drawable.msg_unmute);
                        } else {
                            this.f41841a1.d(LocaleController.getString(R.string.Mute));
                            this.f41841a1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.fo foVar = this.f41892e1;
                if (foVar != null) {
                    foVar.d(this.P5, b(), null);
                }
            }
        }
    }

    public final void Q6() {
        ArrayList arrayList;
        int i9;
        if (this.La) {
            int i10 = -1;
            long j10 = 0;
            int i11 = 0;
            while (true) {
                arrayList = this.f42042q6;
                if (i11 >= arrayList.size()) {
                    break;
                }
                long groupIdForUse = ((MessageObject) arrayList.get(i11)).getGroupIdForUse();
                if (j10 != groupIdForUse) {
                    if (i10 >= 0 && j10 != 0 && (i9 = i11 - i10) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < i9; i12++) {
                            arrayList2.add((MessageObject) arrayList.remove(i10));
                        }
                        Collections.sort(arrayList2, new j9.a(19));
                        arrayList.addAll(i10, arrayList2);
                    }
                    i10 = i11;
                    j10 = groupIdForUse;
                }
                i11++;
            }
            if (i10 >= 0 && j10 != 0 && arrayList.size() - i10 > 1) {
                int size = arrayList.size() - i10;
                ArrayList arrayList3 = new ArrayList();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList3.add((MessageObject) arrayList.remove(i10));
                }
                arrayList.addAll(i10, arrayList3);
            }
        }
    }

    public final void Q7() {
        if (this.f42093u3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f41848aa);
            this.f42093u3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.T0.addView(this.f42093u3, g7.e6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final float Q8() {
        org.telegram.ui.Components.b21 b21Var = this.N1;
        if (b21Var != null) {
            return b21Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Qa() {
        org.telegram.ui.Cells.t1 t1Var = null;
        int i9 = 0;
        for (int i10 = 0; i10 < this.f42077t0.getChildCount(); i10++) {
            View childAt = this.f42077t0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                int min = Math.min(t1Var2.getBottom(), this.f42077t0.getHeight()) - Math.max(0, t1Var2.getTop());
                if (min > i9) {
                    t1Var = t1Var2;
                    i9 = min;
                }
            }
        }
        if (t1Var != null) {
            lj ljVar = this.f42103v0;
            this.f42077t0.getClass();
            ljVar.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) this.o9), false);
        }
    }

    public final void Qb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new oe(this, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22702a);
    }

    public final void Qc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Qc(boolean):void");
    }

    public final void R6(boolean z10) {
        of.j1 j1Var;
        if (this.K3 == 2 && (j1Var = this.I3) != null) {
            String str = this.f42039q3;
            mh.m2 m2Var = j1Var.A;
            if (!TextUtils.equals(j1Var.f19383x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(m2Var);
                ih.h6 h6Var = j1Var.f19384y;
                if (h6Var != null && h6Var.I != 0) {
                    ConnectionsManager.getInstance(h6Var.f11847c).cancelRequest(h6Var.I, true);
                    h6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    j1Var.f19383x = str;
                    j1Var.f19384y = new ih.h6(j1Var.f19380r, str2, trim);
                    if (z10) {
                        m2Var.run();
                    } else {
                        AndroidUtilities.runOnUIThread(m2Var, 1000L);
                    }
                }
                ih.h6 h6Var2 = j1Var.f19384y;
                if (h6Var2 != null && h6Var2.J > 0) {
                    j1Var.l();
                }
            }
        }
    }

    public final ArrayList R7(MessageObject messageObject, boolean z10) {
        ArrayList k10 = org.telegram.messenger.l0.k(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.f42042q6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.H6 || messageObject.getDialogId() == this.H6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    k10.add(messageObject2);
                }
            }
        }
        return k10;
    }

    public final int R8() {
        return (int) (Q8() * AndroidUtilities.dp(71.0f));
    }

    public final void Ra(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Ra(org.telegram.messenger.MessageObject):void");
    }

    public final void Rb() {
        String str;
        if (this.Cb != null) {
            return;
        }
        if (this.f41959j5 != null) {
            str = getMessagesController().getFullName(this.f41959j5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new oe(this, 15));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new oe(this, 16));
        c2Var.setOnDismissListener(new zf(this, 7));
        this.Cb = alertDialog$Builder.o();
    }

    public final void Rc() {
        int i9;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.u0 u0Var = this.f42025p0;
        if (u0Var != null) {
            TLRPC.Chat chat = this.f41890e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.Y3) && (tL_forumTopic = this.Y3) != null && !tL_forumTopic.closed) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            u0Var.e(i9);
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
        if (this.v.f49448s == 1) {
            z10 = false;
        }
        if (this.Sa != z10) {
            this.Sa = z10;
            checkSystemBarColors();
        }
    }

    public final void S7(final int i9, final int i10, final boolean z10) {
        this.f42114w0.I.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.f42042q6;
            if (i11 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            int i12 = messageObject.messageOwner.date;
            if (i12 <= i9 || i12 >= i10) {
                this.f42114w0.I.add(messageObject);
            }
            i11++;
        }
        ij ijVar = this.f42077t0;
        if (ijVar != null) {
            ijVar.setEmptyView(null);
        }
        if (this.f42114w0.I.isEmpty()) {
            Pb(true);
        }
        bm bmVar = this.f42114w0;
        bmVar.H = true;
        bmVar.O(true);
        Q7();
        UndoView undoView = this.f42093u3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.P5, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                qn qnVar = qn.this;
                MessagesController messagesController = qnVar.getMessagesController();
                long j11 = qnVar.P5;
                if (ChatObject.isChannel(qnVar.f41890e)) {
                    j10 = qnVar.P5;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i9, i10, z10, new jg(qnVar, 18));
            }
        }, new gf(this, 29));
    }

    public final int S8(int i9) {
        SparseIntArray sparseIntArray = this.R4;
        int i10 = sparseIntArray.get(i9, -1);
        if (i10 == -1) {
            int i11 = Fc;
            Fc = i11 + 1;
            sparseIntArray.put(i9, i11);
            return i11;
        }
        return i10;
    }

    public final void S9() {
        J6(this.L0, 5, true);
        J6(this.U, 1, false);
        J6(this.N2, 4, true);
        J6(this.K0, 3, false);
        J6(this.N, 2, false);
        float f10 = this.f42076sc.f47775e;
        d5.w wVar = this.f42139xc;
        float C = j3.r0.C(1.0f, f10, 1.0f - ((float[]) wVar.f4402b)[5], 1.0f);
        rg.c cVar = this.L0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(C);
        }
        ak akVar = this.U;
        if (akVar != null) {
            akVar.setTranslationY(AndroidUtilities.dp(54.0f) * C);
        }
        ek ekVar = this.N2;
        if (ekVar != null) {
            ekVar.setTranslationY(AndroidUtilities.dp(54.0f) * C);
        }
        fk fkVar = this.K0;
        if (fkVar != null) {
            fkVar.setTranslationY(AndroidUtilities.dp(54.0f) * C);
        }
        ek ekVar2 = this.N;
        if (ekVar2 != null) {
            ekVar2.setTranslationY(AndroidUtilities.dp(54.0f) * C);
        }
        pg.f fVar = this.O;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - C) * 255.0f));
            this.O.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * C);
        }
        fk fkVar2 = this.K0;
        td.a aVar = this.f42048qc;
        if (fkVar2 != null) {
            fkVar2.setTotalVisibilityFactor((1.0f - aVar.f47775e) * ((float[]) wVar.f4402b)[3]);
        }
        kp kpVar = this.L9;
        if (kpVar != null) {
            float f11 = aVar.f47775e;
            if (kpVar.O != f11) {
                kpVar.O = f11;
                this.fragmentView.invalidate();
            }
        }
        q7();
    }

    public final void Sa(long j10) {
        lj ljVar;
        MessageObject messageObject;
        int L8;
        int abs;
        ij ijVar = this.f42077t0;
        int i9 = -1;
        if (ijVar != null && (ljVar = this.f42103v0) != null && ljVar.f5441y < 0) {
            int i10 = 0;
            int i11 = Integer.MAX_VALUE;
            for (int childCount = ijVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f42077t0.getChildAt(childCount);
                this.f42077t0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((L8 = L8(childAt)))) < i11) {
                    i9 = messageObject.getId();
                    i10 = L8;
                    i11 = abs;
                }
            }
            this.f41961j7 = i9;
            this.f41973k7 = i10;
            return;
        }
        this.f41961j7 = -1;
    }

    public final void Sb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.s30 s30Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((s30Var = this.f41944i2) != null && s30Var.getVisibility() == 0)) {
                this.f41944i2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f41944i2.f(view, true);
                }
            }
        }
    }

    public final void Sc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        dj djVar = this.W0;
        if (djVar != null && (tL_forumTopic = this.Y3) != null) {
            djVar.setTitle(tL_forumTopic.title);
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

    public final void T7(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.t1 t1Var2;
        CharacterStyle characterStyle2;
        MessageObject messageObject2;
        int i9;
        String str2;
        TLRPC.WebPage webPage;
        int i10;
        int i11;
        org.telegram.ui.Components.x60 I = org.telegram.ui.Components.x60.I(this, t1Var);
        org.telegram.ui.Components.ll0 ll0Var = new org.telegram.ui.Components.ll0(getParentActivity(), this.f41848aa);
        I.f34575p = new ke(ll0Var, 0);
        if (!str.startsWith("video?") && !ve.e.f(Uri.parse(str), false, null)) {
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
                i10 = R.drawable.menu_website;
            } else {
                i10 = R.drawable.msg_openin;
            }
            if (z11 && !z12) {
                i11 = R.string.OpenInTelegramBrowser2;
            } else {
                i11 = R.string.Open;
            }
            String string = LocaleController.getString(i11);
            int i12 = i10;
            z15 = z10;
            eh.m mVar = new eh.m(this, str, characterStyle, messageObject, t1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            t1Var2 = t1Var;
            I.c(i12, string, mVar, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            t1Var2 = t1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new le(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new le(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new me(this, messageObject2, 0), false);
        } else {
            messageObject2 = messageObject;
        }
        int i13 = R.drawable.msg_copy;
        if (z14) {
            i9 = R.string.CopyHashtag;
        } else if (startsWith) {
            i9 = R.string.CopyMail;
        } else {
            i9 = R.string.CopyLink;
        }
        I.c(i13, LocaleController.getString(i9), new bg.d(this, str, messageObject2, startsWith, 8), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new le(this, str, 2), false);
        }
        ll0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            ll0Var.f(t1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.r41) {
            String url = ((org.telegram.ui.Components.r41) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = ve.e.v(parse, null, null, ve.e.a(parse.getHost()), null);
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
            ll0Var.f(t1Var2, characterStyle2, spannableString2, false);
        } else {
            ll0Var.f(t1Var2, characterStyle2, null, false);
        }
        showDialog(ll0Var);
    }

    public final int T8(int i9) {
        SparseIntArray sparseIntArray = this.Q4;
        int i10 = sparseIntArray.get(i9, -1);
        if (i10 == -1) {
            int i11 = Fc;
            Fc = i11 + 1;
            sparseIntArray.put(i9, i11);
            return i11;
        }
        return i10;
    }

    public final void T9(boolean z10, boolean z11) {
        if (this.f42156z3) {
            AndroidUtilities.runOnUIThread(new ge(this, 20), 200L);
            if (z11) {
                this.f42156z3 = false;
            }
        }
        if (z10 && !this.Ka) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final void Ta() {
        int i9;
        int i10;
        ij ijVar = this.f42077t0;
        if (ijVar != null && this.f42103v0 != null) {
            for (int childCount = ijVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f42077t0.getChildAt(childCount);
                this.f42077t0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
                            i9 = L8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i9 = L8(childAt);
                        break;
                    }
                }
            }
        }
        i9 = 0;
        i10 = -1;
        if (i10 >= 0) {
            this.f42103v0.h1(i10, i9);
        }
    }

    public final void Tb(MessageSuggestionParams messageSuggestionParams) {
        if (this.f41982l5 == null) {
            return;
        }
        new gh.t0(getParentActivity(), this.currentAccount, this.P5, messageSuggestionParams, this, getResourceProvider(), 0, new se(this, 0)).show();
    }

    public final void Tc() {
        dj djVar;
        dj djVar2;
        if (UserObject.isBotForum(this.f41903f) && (djVar2 = this.W0) != null) {
            djVar2.getAvatarImageView().setVisibility(0);
            this.W0.b();
        } else if (this.Y3 != null && (djVar = this.W0) != null) {
            djVar.getAvatarImageView().setVisibility(0);
            vf.c.p(this.W0.getAvatarImageView(), this.Y3, true, true, this.f41848aa);
        }
    }

    public final void U6() {
        MessageObject messageObject;
        if (!this.f42157z4 && (messageObject = this.F7) != null) {
            if (this.f42042q6.indexOf(messageObject) >= 0) {
                this.A4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.f42145y4 != null) {
        } else {
            gf gfVar = new gf(this, 22);
            this.f42145y4 = gfVar;
            AndroidUtilities.runOnUIThread(gfVar);
        }
    }

    public final void U7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.t1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.U7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1):void");
    }

    public final long U8() {
        return this.Z3;
    }

    public final void U9() {
        this.f42157z4 = true;
        jm jmVar = this.Y8;
        AndroidUtilities.cancelRunOnUIThread(jmVar.f24083g0);
        jmVar.f24112z = false;
        ge geVar = new ge(this, 8);
        int i9 = this.f42160z7;
        if (i9 != 0) {
            Xa(i9, 0, false, this.f42148y7, true, 0, null, null, geVar);
            return;
        }
        int i10 = this.f42134x7;
        if (i10 > 0) {
            Xa(i10, 0, true, this.f42148y7, true, 0, null, null, geVar);
            return;
        }
        Wa(!this.Ya, geVar);
        this.Ya = false;
        if (!this.D4.isEmpty()) {
            this.K4 = true;
            this.J4 = ((Integer) this.D4.get(0)).intValue();
        }
    }

    public final int Ua(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i9;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f10;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        MessageObject messageObject2;
        if (!TextUtils.isEmpty(this.L7) && messageObject != null) {
            if (messageObject.getGroupId() != 0) {
                MessageObject.GroupedMessages y82 = y8(messageObject.getGroupId());
                org.telegram.ui.Cells.t1 t1Var2 = this.f41938h9;
                if (t1Var2 != null && (textLayoutBlocks2 = t1Var2.f25585te) != null && y82 != null && (messageObject2 = y82.captionMessage) != null) {
                    i9 = t1Var2.f25570se;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (t1Var2 != null) {
                        t1Var2.f25570se = 0;
                        t1Var2.f25585te = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.f41938h9) != null && (textLayoutBlocks = t1Var.Y3) != null) {
                i9 = (int) t1Var.f25475m4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.f41938h9;
                if (t1Var3 != null && t1Var3.f25512p1) {
                    i9 = t1Var3.f25418i2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i9 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var4 = this.f41938h9;
            if (t1Var4 != null) {
                t1Var4.f25570se = 0;
                t1Var4.f25585te = null;
            }
            if (arrayList == null || charSequence == null || (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.L7, this.O7)) < 0) {
                return 0;
            }
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject.TextLayoutBlock textLayoutBlock = arrayList.get(i10);
                String charSequence3 = textLayoutBlock.textLayout.getText().toString();
                int i11 = textLayoutBlock.charactersOffset;
                if (findQuoteStart > i11) {
                    if (findQuoteStart - i11 > charSequence3.length() - 1) {
                        lineTop = i9 + ((int) (textLayoutBlock.textYOffset(arrayList) + textLayoutBlock.padTop + textLayoutBlock.height));
                    } else {
                        lineTop = staticLayout.getLineTop(staticLayout.getLineForOffset(findQuoteStart - textLayoutBlock.charactersOffset)) + textLayoutBlock.textYOffset(arrayList) + i9 + textLayoutBlock.padTop;
                    }
                    float f11 = AndroidUtilities.displaySize.y;
                    float f12 = 0.5f;
                    if (x9()) {
                        f10 = 0.7f;
                    } else {
                        f10 = 0.5f;
                    }
                    if (lineTop <= f11 * f10) {
                        return 0;
                    }
                    float f13 = AndroidUtilities.displaySize.y;
                    if (x9()) {
                        f12 = 0.7f;
                    }
                    return (int) (lineTop - (f13 * f12));
                }
            }
            return 0;
        }
        org.telegram.ui.Cells.t1 t1Var5 = this.f41938h9;
        if (t1Var5 != null) {
            t1Var5.f25570se = 0;
            t1Var5.f25585te = null;
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f41900e9 && this.f41913f9 <= this.U.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f41900e9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.d9 == null) {
                        fl flVar = new fl(getParentActivity(), this.f41848aa, this);
                        this.d9 = flVar;
                        this.T0.addView(flVar, g7.e6.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.d9.c();
                }
            }
        }
    }

    public final void Uc() {
        int i9;
        org.telegram.ui.ActionBar.u0 u0Var = this.f41929h0;
        if (u0Var == null) {
            return;
        }
        if (getMessagesController().getTranslateController().isTranslateDialogHidden(a()) && getMessagesController().getTranslateController().isDialogTranslatable(a())) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        u0Var.e(i9);
    }

    public final void V6(boolean z10) {
        if (this.f41959j5 != null) {
            int i9 = 0;
            while (true) {
                ArrayList arrayList = this.f42042q6;
                if (i9 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i9);
                    if (messageObject != null && messageObject.getId() == this.f41959j5.getId() && messageObject.getDialogId() == this.f41959j5.getDialogId()) {
                        this.f41959j5 = messageObject;
                        gn gnVar = this.f41934h5;
                        if (gnVar != null) {
                            gnVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f41857b5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f41959j5;
                                MessageObject.GroupedMessages groupedMessages = this.f41909f5;
                                if (groupedMessages == null) {
                                    groupedMessages = y8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.P5, this.f41934h5);
                            }
                            j8();
                            return;
                        }
                        return;
                    }
                    i9++;
                } else {
                    return;
                }
            }
        }
    }

    public final void V7(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, String str) {
        ni K9 = K9(t1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(ne.b.d(str, false));
        gh.i2 i2Var = new gh.i2(this, t1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                i2Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new t1(this, tL_contact, i2Var, 14));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = ne.b.d(str, false);
        K9.f48382b = new ve(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new y9(this, K9, i2Var, 3)), 0);
        K9.d();
    }

    public final float V8(float f10) {
        qn qnVar = this.Z9;
        if (qnVar == null) {
            qnVar = this;
        }
        org.telegram.ui.Components.sg sgVar = qnVar.I0;
        if (sgVar == null) {
            return 0.0f;
        }
        return sgVar.c(f10);
    }

    public final void Va() {
        Wa(false, null);
    }

    public final void Vb(boolean z10, boolean z11) {
        ak akVar;
        int i9;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f42017o2 != null) && this.N3 == 0 && (akVar = this.U) != null && akVar.getAudioVideoButtonContainer() != null && this.U.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f42017o2 == null) {
                    im imVar = this.T0;
                    int indexOfChild = imVar.indexOfChild(this.O);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(9, getParentActivity(), this.f41848aa, false);
                        this.f42017o2 = s30Var;
                        imVar.addView(s30Var, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f42017o2.b(true);
                    return;
                }
                if (this.U.Z1) {
                    org.telegram.ui.Components.s30 s30Var2 = this.f42017o2;
                    if (z11) {
                        i9 = R.string.HoldToVideo;
                    } else {
                        i9 = R.string.HoldToAudio;
                    }
                    s30Var2.setText(LocaleController.getString(i9));
                } else {
                    this.f42017o2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f42017o2.f(this.U.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Vc(Utilities.CallbackReturn callbackReturn) {
        int i9;
        int i10;
        ij ijVar = this.f42077t0;
        if (ijVar != null) {
            if (!this.f42157z4 && this.F7 != null) {
                int childCount = ijVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.f42077t0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.F7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f42042q6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i9 = arrayList.indexOf(this.F7) + this.f42114w0.F;
                                i10 = L8(childAt);
                            }
                        }
                    }
                    i11++;
                }
            }
            i9 = -1;
            i10 = 0;
            int childCount2 = this.f42077t0.getChildCount();
            ak akVar = this.U;
            if (akVar != null) {
                akVar.getEditingMessageObject();
            }
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.f42077t0.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                    MessageObject messageObject3 = t1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        t1Var.X3(messageObject3, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        bm bmVar = this.f42114w0;
                        this.f42077t0.getClass();
                        bmVar.Q(RecyclerView.R(t1Var));
                    }
                }
            }
            if (i9 != -1) {
                this.f42103v0.h1(i9, i10);
            }
        }
    }

    public final void W6() {
        fk fkVar;
        ek ekVar;
        ek ekVar2;
        ak akVar = this.U;
        if (akVar != null && akVar.f26190u3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.f41890e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((fkVar = this.K0) == null || fkVar.getVisibility() != 0) && (((ekVar = this.N) == null || ekVar.getVisibility() != 0) && ((ekVar2 = this.N2) == null || ekVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void W7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.W7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final float W8(org.telegram.ui.Components.w11 w11Var) {
        float f10;
        org.telegram.ui.Components.b21 b21Var = this.N1;
        if (b21Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j10 = b21Var.j(w11Var);
            if (w11Var == org.telegram.ui.Components.w11.f34072b) {
                f10 = 64.0f;
            } else {
                f10 = 36.0f;
            }
            return (AndroidUtilities.dp(f10) + dp) * j10;
        }
        return 0.0f;
    }

    public final void W9(long j10, String str, boolean z10) {
        X9();
        ih.u2 u2Var = this.F1;
        if (u2Var != null) {
            u2Var.N1(j10, str, z10, false);
        }
    }

    public final void Wa(boolean z10, ge geVar) {
        ArrayList arrayList;
        int i9;
        if (this.f42077t0.T1) {
            return;
        }
        this.J4 = 0;
        this.mb = 0;
        this.K4 = false;
        this.S8.d(0);
        if (this.A6[0] && this.D7 == 0 && this.f42043q7 == 0) {
            this.f41905f1.d(false);
            if (this.f42103v0.I0() == 0) {
                this.f41874c9 = false;
                vc();
                Ia();
                Wc(false);
                return;
            }
            this.f42114w0.T();
            dn dnVar = this.Ha;
            dnVar.f37564a = null;
            int i10 = 0;
            while (true) {
                arrayList = this.f42042q6;
                if (i10 >= arrayList.size() || !((MessageObject) arrayList.get(i10)).isSponsored()) {
                    break;
                }
                i10++;
                z10 = false;
            }
            if (z10 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i10) != null) {
                long groupId = ((MessageObject) arrayList.get(i10)).getGroupId();
                while (groupId != 0 && (i9 = i10 + 1) < arrayList.size() && groupId == ((MessageObject) arrayList.get(i9)).getGroupId()) {
                    i10 = i9;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 = Math.min(i10, arrayList.size() - 1);
            }
            ik ikVar = this.S8;
            dnVar.f37565b = i10;
            dnVar.d = 0;
            boolean z11 = !z10;
            dnVar.f37566c = z11;
            ikVar.c(i10, 0, z11, true);
            this.f41874c9 = false;
            vc();
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = this.f41988lb;
        if (c2Var != null) {
            c2Var.dismiss();
        }
        xc(false);
        if (geVar != null) {
            geVar.run();
        } else {
            Ma();
            org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getParentActivity(), 3, this.f41848aa);
            this.f41988lb = c2Var2;
            c2Var2.setOnCancelListener(this.f41951ia);
            this.f41988lb.q(1000L);
        }
        this.U8 = this.R5;
        this.W8 = false;
        this.V8 = 0;
        this.X8 = false;
        ArrayList arrayList2 = this.f41884d6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.R5));
        AndroidUtilities.runOnUIThread(new gf(this, 13), 0L);
    }

    public final boolean Wb(MessageObject messageObject) {
        if (this.N3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void Wc(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Wc(boolean):void");
    }

    public final boolean X6(boolean z10, boolean z11) {
        ak akVar = this.U;
        if (akVar == null || !akVar.u0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41848aa);
            if (this.U.Y0) {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new dh.s(4, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f22702a);
            return true;
        }
        return true;
    }

    public final void X7(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.X7(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages X8(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f42083t6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void X9() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            ak akVar = this.U;
            if (akVar == null || TextUtils.isEmpty(akVar.getSlowModeTimer())) {
                ak akVar2 = this.U;
                if (akVar2 != null && akVar2.f26099d5.f47776f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                E7();
                ih.u2 u2Var = this.F1;
                if (!z10 && this.N3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                u2Var.N1 = z11;
                u2Var.f30114f0.e0();
                int i9 = Build.VERSION.SDK_INT;
                if (i9 == 21 || i9 == 22) {
                    this.U.O();
                }
                TLRPC.Chat chat = this.f41890e;
                if ((chat == null || this.f41870c5 == null) && !z10 && this.N3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f41890e.slowmode_enabled) {
                        this.F1.J1(10, true);
                    } else {
                        this.F1.J1(-1, true);
                    }
                } else {
                    this.F1.J1(1, true);
                }
                ih.u2 u2Var2 = this.F1;
                u2Var2.O0 = true;
                u2Var2.f30158t1.setVisibility(0);
                u2Var2.M0 = 0;
                u2Var2.B = false;
                u2Var2.C = false;
                u2Var2.f30110e0 = true;
                u2Var2.F = null;
                org.telegram.ui.ActionBar.w0 w0Var = u2Var2.f30118g1;
                if (w0Var != null) {
                    u2Var2.f30115f1.setTranslationY(0.0f);
                    w0Var.setVisibility(8);
                }
                this.F1.r1();
                this.F1.m1().setText(this.U.getFieldText());
                ih.u2 u2Var3 = this.F1;
                u2Var3.f30149r = this.f41848aa;
                showDialog(u2Var3);
            }
        }
    }

    public final void Xa(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Xa(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Xb(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            hg.v vVar = this.U9;
            if (vVar != null && vVar.d()) {
                this.U9.setHiddenByScroll(true);
            }
            if (this.f41904f0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f23577j0) {
                    kVar.h(true);
                    this.U.e1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                qh.x1 x1Var = new qh.x1(richMessage);
                x1Var.F = this;
                x1Var.f46813r = messageObject;
                presentFragment(x1Var);
                return;
            }
            this.E1.getAdapter().f19321b0 = false;
            this.U.setVisibility(0);
            yb(true, null, messageObject, null, null, null, false, true);
            hc(false);
            if (!z10) {
                N6();
            }
            if (z10) {
                this.f41870c5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.U.V0(false, false, true);
            yc(0, true);
            Wc(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.N3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.P5);
                tL_messages_getMessageEditData.f22472id = messageObject.getId();
                this.f41971k5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new je(this, 3));
                return;
            }
            ak akVar = this.U;
            org.telegram.ui.Components.oe oeVar = akVar.A1;
            if (oeVar != null) {
                oeVar.setEnabled(true);
                akVar.A1.h(false);
            }
        }
    }

    public final void Y6() {
        if (!this.Ob) {
            this.Ob = true;
            if (!this.Pb && this.N3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f42051r1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f42051r1.v();
                    this.Pb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f42065s1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f42065s1.v();
                    this.Pb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    Z6();
                }
            }
        }
    }

    public final void Y7(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Y7(int, java.lang.Object[]):void");
    }

    public final void Y8(boolean z10) {
        int i9;
        int i10 = 1;
        if (this.N3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i11 = this.classGuid;
            int i12 = this.f42053r3;
            if (!z10) {
                i10 = -1;
            }
            hashtagSearchController.jumpToMessage(i11, i12 + i10, this.K3);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j10 = this.P5;
        long j11 = this.H6;
        int i13 = this.classGuid;
        boolean z11 = this.La;
        if (!z10 ? !z11 : z11) {
            i9 = 2;
        } else {
            i9 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j10, j11, i13, i9, this.Z3, this.f41969k3, this.f41980l3, this.f41992m3);
        Lb(false);
    }

    public final void Y9() {
        ht.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        E7();
        this.F1.f30114f0.e0();
        int i9 = Build.VERSION.SDK_INT;
        if (i9 == 21 || i9 == 22) {
            this.U.O();
        }
        this.F1.J1(1, false);
        ih.u2 u2Var = this.F1;
        u2Var.Q1 = true;
        u2Var.i1(null);
        this.F1.r1();
        ih.u2 u2Var2 = this.F1;
        u2Var2.f30149r = this.f41848aa;
        if (this.visibleDialog != null) {
            u2Var2.show();
        } else {
            showDialog(u2Var2);
        }
    }

    public final void Ya(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Ya(java.lang.CharSequence, boolean):void");
    }

    public final void Yb() {
        org.telegram.ui.Components.c00 c00Var = this.i9;
        if (c00Var != null && !c00Var.f27322c) {
            c00Var.c(false);
            try {
                this.i9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Z6() {
        org.telegram.ui.Cells.t1 t1Var;
        kh.x3 x3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        kh.x3 x3Var2 = this.f42078t1;
        if (x3Var2 != null && !x3Var2.R && !this.Rb && this.Ob && !this.f42102uc.f47776f && System.currentTimeMillis() - this.Qb > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f42077t0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f42077t0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        hg.s0 s0Var = t1Var.J;
                        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !s0Var.v.isEmpty()) {
                            t1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + s0Var.d;
                            if (f10 >= AndroidUtilities.dp(240.0f) && f10 <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
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
                hg.s0 s0Var2 = t1Var.J;
                this.Rb = true;
                t1Var.getLocationInWindow(iArr);
                this.f42078t1.setTranslationY(((iArr[1] - x3Var.getTop()) - AndroidUtilities.dp(120.0f)) + s0Var2.d);
                this.f42078t1.n(0.0f, (((hg.p0) s0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + s0Var2.f10735c);
                this.f42078t1.v();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ge(this, 19));
            AndroidUtilities.runOnUIThread(new ge(this, 19), 2000L);
        }
    }

    public final void Z7(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Z7(int, java.lang.Object[]):void");
    }

    public final void Z8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Z8():void");
    }

    public final void Z9(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.t1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Z9(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.t1, org.telegram.messenger.MessageObject):void");
    }

    public final void Za(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f41969k3 = user;
        this.f41980l3 = chat;
        if (this.f41904f0 != null && this.E1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f41969k3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f41957j3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(aa.d.z(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.f6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f41904f0.setSearchFieldCaption(spannableString);
                    this.E1.getAdapter().U(null, 0, null, false, true);
                    this.f41904f0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f41904f0;
                    w0Var.f23921r = null;
                    fg.g gVar = w0Var.f23906e;
                    if (gVar != null) {
                        gVar.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f42028p3 = "";
                    mediaDataController.searchMessagesInChat("", this.P5, this.H6, this.classGuid, 0, this.Z3, this.f41969k3, this.f41980l3, this.f41992m3);
                }
            }
        }
    }

    public final void Zb() {
        long j10;
        ge geVar = this.Q7;
        if (geVar != null) {
            AndroidUtilities.cancelRunOnUIThread(geVar);
        }
        ge geVar2 = new ge(this, 15);
        this.Q7 = geVar2;
        if (this.L7 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(geVar2, j10);
    }

    public long a() {
        return this.P5;
    }

    public final void a7(boolean z10) {
        int i9;
        if (this.f42103v0 != null && !this.f41994m5 && !this.f42114w0.H && !this.f41859b7) {
            int i10 = -1;
            int i11 = -1;
            int i12 = 0;
            for (int i13 = 0; i13 < this.f42077t0.getChildCount(); i13++) {
                int R = RecyclerView.R(this.f42077t0.getChildAt(i13));
                if (R != -1) {
                    if (i11 == -1 || R < i11) {
                        i11 = R;
                    }
                    if (i10 == -1 || R > i10) {
                        i10 = R;
                    }
                    i12++;
                }
            }
            bm bmVar = this.f42114w0;
            if (bmVar.J) {
                int i14 = bmVar.A;
                if (i14 >= 0 && i11 >= 0 && i14 >= i11 && i14 <= i10) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = bmVar.h();
            if (z10) {
                i9 = 25;
            } else {
                i9 = 5;
            }
            if (this.N3 == 7) {
                if ((h - i11) - i12 <= i9 && !this.C6 && !this.f42147y6[0]) {
                    this.C6 = true;
                    this.f41884d6.add(Integer.valueOf(this.R5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f42039q3;
                    int i15 = this.classGuid;
                    int i16 = this.K3;
                    int i17 = this.R5;
                    this.R5 = i17 + 1;
                    hashtagSearchController.searchHashtag(str, i15, i16, i17);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.af(this, h, i11, i12, i9, 1));
        }
    }

    public final void a8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.a8(int, java.lang.Object[]):void");
    }

    public final boolean a9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.S5;
        for (int i9 = 0; i9 < sparseArrayArr.length; i9++) {
            try {
                for (int i10 = 0; i10 < sparseArrayArr[i9].size(); i10++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i9].valueAt(i10);
                    if (messageObject != null && (message = messageObject.messageOwner) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void aa(long j10, final MessageObject messageObject, int i9, final long j11, final int i10, final int i11, final MessageObject messageObject2) {
        int i12 = i9;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i12;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f22380id + " msg_id = " + i12);
        }
        this.ec = 0;
        this.fc = false;
        this.f41941hc = null;
        this.f41953ic = null;
        ij ijVar = this.f42077t0;
        if (ijVar != null) {
            ijVar.f1();
        }
        if (this.f41889dc != -1) {
            getConnectionsManager().cancelRequest(this.f41889dc, false);
        }
        if (this.f41877cc != -1) {
            getConnectionsManager().cancelRequest(this.f41877cc, false);
        }
        if (messageObject2 != null) {
            i12 = messageObject2.getId();
        }
        this.ec = i12;
        this.fc = false;
        this.f41928gc = System.currentTimeMillis();
        ij ijVar2 = this.f42077t0;
        if (ijVar2 != null) {
            ijVar2.f1();
        }
        final int i13 = this.f41850ac + 1;
        this.f41850ac = i13;
        this.f41877cc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final qn qnVar = qn.this;
                final int i14 = i13;
                final int i15 = i10;
                final long j12 = j11;
                final int i16 = i11;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new rd(7, qnVar, new Runnable(i14, i15, j12, tLObject, i16, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f44125b;
                    public final int f44126c;
                    public final TLObject d;
                    public final int f44127e;
                    public final MessageObject f44128f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f44129n;
                    public final MessageObject f44130r;

                    {
                        this.d = tLObject;
                        this.f44127e = i16;
                        this.f44128f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f44129n = chat2;
                        this.f44130r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i17;
                        final qn qnVar2 = qn.this;
                        if (this.f44125b != qnVar2.f41850ac) {
                            return;
                        }
                        qnVar2.f41877cc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            qnVar2.f41941hc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            qnVar2.getMessagesController().putUsers(qnVar2.f41941hc.users, false);
                            qnVar2.getMessagesController().putChats(qnVar2.f41941hc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = qnVar2.f41941hc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i18 = 0; i18 < qnVar2.f41941hc.messages.size(); i18++) {
                                TLRPC.Message message = qnVar2.f41941hc.messages.get(i18);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i19 = this.f44126c;
                        final int i20 = this.f44127e;
                        final MessageObject messageObject5 = this.f44128f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f44129n;
                        final MessageObject messageObject6 = this.f44130r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = qnVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f22401id;
                            tL_messages_getReplies.offset_date = 0;
                            tL_messages_getReplies.limit = 30;
                            if (i20 > 0) {
                                tL_messages_getReplies.offset_id = i20;
                                tL_messages_getReplies.add_offset = -15;
                            } else {
                                if (i19 == 0) {
                                    i17 = 1;
                                } else {
                                    i17 = i19;
                                }
                                tL_messages_getReplies.offset_id = i17;
                                tL_messages_getReplies.add_offset = -20;
                            }
                            final int i21 = qnVar2.f41863bc + 1;
                            qnVar2.f41863bc = i21;
                            qnVar2.f41889dc = qnVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new ih(qn.this, i21, tLObject3, tL_error2, i19, messageObject5, tL_messages_getDiscussionMessage3, chat3, i20, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        qnVar2.ya(qnVar2.f41941hc, qnVar2.f41953ic, i19, messageObject5, tL_messages_getDiscussionMessage3, chat3, i20, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f41877cc, this.classGuid);
    }

    public final void ab(View view, MessageObject messageObject, org.telegram.ui.Components.uj0 uj0Var, View view2, float f10, float f11, hg.r0 r0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i9;
        TLRPC.Document f12;
        int i10;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        gh.p5 p5Var;
        int[] iArr;
        int[] iArr2;
        int i11;
        boolean z14;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && messageObject != null) {
            if (getMessagesController().isFrozen()) {
                b.b(this.currentAccount);
                return;
            }
            ArrayList<TLRPC.MessageReactor> arrayList = null;
            if (r0Var != null && r0Var.f10713a) {
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
                    long j10 = -gh.p7.b(messageObject).f8727a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
                        org.telegram.ui.Components.oc a02 = org.telegram.ui.Components.oc.a0(this);
                        int i12 = R.raw.stars_topup;
                        int i13 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i12, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i13, str2))).k(true);
                        return;
                    }
                    gh.u7 u7Var = gh.v7.y(this.currentAccount, false).B;
                    if (u7Var != null) {
                        u7Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i14 = this.currentAccount;
                    long j11 = this.P5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    gh.jb jbVar = new gh.jb(parentActivity, i14, j11, this, messageObject, arrayList2, z14, false, 0L, this.f41848aa);
                    messageObject.getId();
                    jbVar.P = this;
                    jbVar.Q = a0Var;
                    jbVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -gh.p7.b(messageObject).f8727a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j12);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j12));
                    org.telegram.ui.Components.oc a03 = org.telegram.ui.Components.oc.a0(this);
                    int i15 = R.raw.stars_topup;
                    int i16 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i15, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i16, str2))).k(true);
                    return;
                }
                gh.u7 d02 = gh.v7.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f42000mc == null) {
                        this.f42000mc = new gh.p5(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        p5Var = null;
                    } else {
                        if (this.f42000mc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f42000mc);
                            layoutContainer.addView(this.f42000mc, g7.e6.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f42000mc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f42000mc.bringToFront();
                        }
                        p5Var = this.f42000mc;
                    }
                    p5Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f8975o = p5Var;
                    p5Var.E = false;
                    p5Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    p5Var.getLocationInWindow(new int[2]);
                    float f13 = (iArr[0] - iArr2[0]) + f10;
                    float f14 = (iArr[1] - iArr2[1]) + f11;
                    if (a0Var instanceof org.telegram.ui.Cells.t1) {
                        i11 = ((org.telegram.ui.Cells.t1) a0Var).R;
                    } else {
                        i11 = 0;
                    }
                    p5Var.d(f13, f14 + i11, false);
                    return;
                }
                return;
            }
            hg.r0 r0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new zf.x0((org.telegram.ui.ActionBar.o2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(r0Var) && (chat = this.f41890e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.f41890e, 26)) {
                org.telegram.messenger.l0.p(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.oc.a0(this), R.raw.e_hand_2, 36);
            } else {
                hg.n0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(r0Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.h hVar = this.f42083t6;
                if (hVar.f(groupId) != null) {
                    if (messageObject.shouldDrawReactionsInLayout()) {
                        i10 = 9;
                    } else {
                        i10 = 10;
                    }
                    MessageObject findMessageWithFlags = ((MessageObject.GroupedMessages) hVar.f(messageObject.getGroupId())).findMessageWithFlags(i10);
                    if (findMessageWithFlags != null) {
                        id2 = findMessageWithFlags.getId();
                    }
                }
                int i17 = id2;
                if (selectReaction) {
                    org.telegram.ui.Cells.a0 q82 = q8(i17, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && q82 != null && r0Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j13 = r0Var.f10718g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(r0Var.f10717f);
                            if (tL_availableReaction != null) {
                                f12 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f12 = org.telegram.ui.Components.k5.f(this.currentAccount, j13);
                        }
                        if (f12 != null) {
                            org.telegram.ui.Components.gc r10 = org.telegram.ui.Components.oc.a0(this).r(f12, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f28737j = 5000;
                            r10.j();
                        }
                    }
                    if (!z10) {
                        int i18 = this.currentAccount;
                        if (uj0Var != null) {
                            if (z11) {
                                i9 = 0;
                            } else {
                                i9 = 2;
                            }
                        } else {
                            i9 = 1;
                        }
                        hg.n0.d(this, uj0Var, q82, view2, f10, f11, r0Var, i18, i9);
                    }
                }
                if (selectReaction && r0Var != null && (str = r0Var.f10717f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<hg.r0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    r0Var2 = r0Var;
                }
                ki kiVar = new ki(this, z13, z10, i17, selectReaction, uj0Var, f10, f11, r0Var, messageObject);
                this.Yb = kiVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, r0Var2, z11, z12, this, kiVar);
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
        AndroidUtilities.forEachViews((RecyclerView) this.f42077t0, (d5.d) new kc(1, this, t9()));
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
        int i9;
        if (!this.f41882d4 && (i9 = this.N3) != 3 && i9 != 5 && i9 != 8) {
            return 0L;
        }
        return this.Z3;
    }

    public final void b7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f42010n8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f42010n8 = true;
            org.telegram.ui.Components.y4.s0(getParentActivity(), this.currentAccount, new ge(this, 9), true, this.f41848aa);
        }
    }

    public final void b8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.b8(int, java.lang.Object[]):void");
    }

    public final boolean b9() {
        jm jmVar = this.Y8;
        if (jmVar != null && jmVar.y()) {
            return true;
        }
        return false;
    }

    public final void ba(boolean z10) {
        String string;
        if (!y9() && !a9()) {
            int i9 = 0;
            boolean z11 = false;
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.S5;
                    if (i11 >= sparseArrayArr[i10].size()) {
                        break;
                    }
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i10].valueAt(i11);
                    if (messageObject.isTodo()) {
                        i9 = 3;
                    } else if (messageObject.isPoll()) {
                        if (messageObject.isPublicPoll()) {
                            i9 = 2;
                        } else {
                            i9 = 1;
                        }
                        if (i9 == 2) {
                            break;
                        }
                    } else if (messageObject.isInvoice()) {
                        z11 = true;
                    }
                    i11++;
                }
                if (i9 == 2) {
                    break;
                }
            }
            hg.v vVar = this.U9;
            if (vVar != null && vVar.d()) {
                this.U9.setHiddenByScroll(true);
            }
            Bundle e10 = org.telegram.messenger.l0.e(3, "onlySelect", "dialogsType", true);
            e10.putInt("messagesCount", this.Y5);
            e10.putInt("hasPoll", i9);
            e10.putBoolean("hasInvoice", z11);
            e10.putBoolean("canSelectTopics", true);
            dy dyVar = new dy(e10);
            dyVar.f37752y2 = this;
            presentFragment(dyVar);
            return;
        }
        if (y9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.f41890e) && !this.f41890e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f41918g2 == null) {
                im imVar = this.T0;
                int indexOfChild = imVar.indexOfChild(this.O);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.s30 s30Var = new org.telegram.ui.Components.s30(7, getParentActivity(), null, true);
                    this.f41918g2 = s30Var;
                    imVar.addView(s30Var, indexOfChild + 1, g7.e6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f41918g2.setAlpha(0.0f);
                    this.f41918g2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f41918g2.setText(string);
            this.f41918g2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f41931h2 == null) {
            im imVar2 = this.T0;
            int indexOfChild2 = imVar2.indexOfChild(this.O);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.s30 s30Var2 = new org.telegram.ui.Components.s30(getParentActivity(), 9);
            this.f41931h2 = s30Var2;
            imVar2.addView(s30Var2, indexOfChild2 + 1, g7.e6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f41931h2.setAlpha(0.0f);
            this.f41931h2.setVisibility(4);
        }
        this.f41931h2.setText(string);
        this.f41931h2.f(this.L0.getForwardButton(), true);
    }

    public final void bb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f22386id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.P5, this.f41959j5, this.T3, null, false, arrayList, null, null, true, 0, 0, null, false);
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
            org.telegram.ui.ActionBar.f3 F = org.telegram.ui.Components.y4.F(this.P5, b(), this, this.f41848aa);
            F.setCalcMandatoryInsets(x9());
            showDialog(F);
            return;
        }
        getNotificationsController().muteDialog(this.P5, b(), false);
        if (!z10) {
            org.telegram.ui.Components.oc.z(this, 4, 0, this.f41848aa).j();
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
        ak akVar = this.U;
        if (akVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.P5, (int) b());
            td.a aVar = akVar.f26093c5;
            gh.j5 j5Var = akVar.E0;
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
            if (z10 && aVar.f47775e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((td.a) j5Var.f8346c).a(z12, z13);
            j5Var.setClickable(z12);
            j5Var.setEnabled(z12);
            if (aVar.f47776f != z11) {
                z14 = true;
            }
            aVar.a(z11, z10);
            akVar.O4 = streamingSendButtonState;
            if (z14) {
                akVar.J(z10);
            }
        }
    }

    public final void c8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.c8(java.lang.Object[]):void");
    }

    public final void c9() {
        org.telegram.ui.Components.mt editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.s()) {
                this.f42139xc.j(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.W5 = 0;
        this.Z5 = 0;
        this.X5 = 0;
        this.f41858b6 = 0;
        this.f41871c6 = 0;
        this.f41844a6 = 0;
        ak akVar = this.U;
        if (akVar != null && (editField = akVar.getEditField()) != null) {
            if (this.U.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        jm jmVar = this.Y8;
        if (jmVar != null) {
            jmVar.f(true);
            SparseArray sparseArray = this.Y8.f24841u0;
            for (int i9 = 0; i9 < sparseArray.size(); i9++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i9))).cancel();
            }
            sparseArray.clear();
        }
        fl flVar = this.d9;
        if (flVar != null) {
            AndroidUtilities.cancelRunOnUIThread(flVar.D);
            flVar.a();
        }
        ak akVar2 = this.U;
        if (akVar2 != null) {
            akVar2.T = false;
        }
        this.f41900e9 = false;
        if (this.Xa != null) {
            k9();
        }
    }

    public final void ca(int i9) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f41857b5;
        if (messagePreviewParams != null && this.Aa == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i10 = this.currentAccount;
                TLRPC.WebPage webPage = this.C5;
                CharSequence fieldText = this.U.getFieldText();
                MessageObject messageObject2 = this.f41959j5;
                if (messageObject2 == this.T3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i10, webPage, fieldText, messageObject, this.f41934h5, this.f41982l5);
            }
            if (!this.f41857b5.isEmpty()) {
                this.f41849ab = this.U.f26189u2;
                Context context = this.T0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f41857b5;
                TLRPC.User user = this.f41903f;
                TLRPC.Chat chat = this.f41890e;
                int i11 = this.currentAccount;
                on onVar = this.f41848aa;
                gn gnVar = this.f41934h5;
                if (gnVar != null && gnVar.f38576f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                wk wkVar = new wk(this, context, this, this.w8, messagePreviewParams2, user, chat, i11, onVar, i9, z10);
                this.Aa = wkVar;
                this.f41857b5.attach(wkVar);
                TLRPC.ChatFull chatFull = this.V7;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.f41887da) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.f41887da.peers.get(0).peer;
                }
                this.Aa.setSendAsPeer(peer);
                d7();
                this.T0.addView(this.Aa);
                if (this.f41849ab) {
                    ak akVar = this.U;
                    akVar.P0 = true;
                    org.telegram.ui.Components.uf ufVar = akVar.Q0;
                    if (ufVar != null) {
                        ufVar.u(true);
                    }
                    this.U.s1();
                    this.f42156z3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ae aeVar;
        if ((this.N3 != 5 || (!this.f42042q6.isEmpty() && this.Z3 != 0)) && !this.f42102uc.f47776f && this.f41963j9) {
            ak akVar = this.U;
            if (!akVar.A2) {
                if (!akVar.Y0 || (aeVar = akVar.f26077a1) == null || aeVar.getVisibility() != 0) {
                    if ((!akVar.i0() || !akVar.f26120h0.v) && !org.telegram.ui.ActionBar.o2.hasSheets(akVar.K2) && this.J9 == 0.0f) {
                        ch.k kVar = this.T9;
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

    public final void cb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i9, long j10) {
        long j11;
        String str;
        tj tjVar = this.E1;
        if (tjVar == null) {
            return;
        }
        TLRPC.User user = tjVar.getAdapter().f19343s0;
        if (user != null) {
            j11 = user.f22527id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f22378id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.E1.getAdapter().f19343s0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.P5, this.f41959j5, this.T3, null, this.f41934h5, z10, i9, 0, C8(), j10, N8());
        this.U.setFieldText("");
        e9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void cc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.gc gcVar = this.f42117w3;
        if (gcVar != null) {
            gcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.Z4);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i9 = this.M4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.P5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.M4 - 1), Boolean.valueOf(this.O4));
        this.f42117w3 = org.telegram.ui.Components.oc.B(this, false, new c3.d(this, arrayList2, arrayList, i9, 12), new me(this, messageObject, 7), this.f41848aa).j();
    }

    @Override
    public final android.view.View createView(android.content.Context r51) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i9, boolean z10, int i10, long j10) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.P5, this.f41959j5, this.T3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
        of2.sendMessageChatArguments = C8();
        of2.payStars = j10;
        of2.monoForumPeer = N8();
        of2.suggestionParams = this.f41870c5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.N3 == 0) {
            O9(false);
        }
        if (i9 == 0 || i9 == 1) {
            y6();
        }
        if (this.f41994m5) {
            this.M5 = true;
        }
    }

    public final void d7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.d7():void");
    }

    public final void d8(int i9, ArrayList arrayList, boolean z10) {
        int i10;
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && f7()) {
            int i11 = 0;
            while (true) {
                if (i11 < arrayList2.size()) {
                    SendMessagesHelper.SendingMediaInfo sendingMediaInfo = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i11);
                    if (sendingMediaInfo.inlineResult == null && sendingMediaInfo.videoEditedInfo == null) {
                        break;
                    }
                    i11++;
                } else if (!TextUtils.isEmpty(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption)) {
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.P5, this.f41959j5, this.T3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i9, 0, null, false);
                    of2.sendMessageChatArguments = C8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            for (int i12 = 0; i12 < arrayList2.size(); i12 = i10 + 1) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i12);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i13 = i12;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.P5, this.f41959j5, this.T3, null, this.f41934h5, z10, i9, 0, C8(), 0L, N8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i13);
                    i10 = i13 - 1;
                } else {
                    i10 = i12;
                }
            }
            if (!arrayList2.isEmpty()) {
                l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.P5, this.f41959j5, this.T3, null, this.f41934h5, false, true, this.f41982l5, z10, i9, 0, this.N3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f41870c5);
                y6();
                if (i9 != 0) {
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
            org.telegram.ui.Components.oc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Fa(this.Z4);
            Ha(this.Z4);
            return;
        }
        showDialog(new zf.x0((org.telegram.ui.ActionBar.o2) this, 3, true));
    }

    public final void da(String str, boolean z10) {
        boolean z11;
        yj yjVar;
        boolean z12;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i9;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                M7();
                kh.x3 x3Var = this.f42051r1;
                if (x3Var != null && x3Var.R) {
                    x3Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                kh.x3 x3Var2 = this.f42065s1;
                if (x3Var2 != null && x3Var2.R) {
                    x3Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new le(this, str, 5), 200L);
                    return;
                }
                this.f42039q3 = str;
                this.f42028p3 = str;
                boolean contains = str.contains("@");
                R6(true);
                if (!this.actionBar.f23577j0) {
                    this.f42112vc.a(true, true);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f41878d0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar = this.f41840a0;
                    if (yVar != null) {
                        yVar.f(8);
                    }
                    wr wrVar = this.Z;
                    if (wrVar != null) {
                        wrVar.b(false);
                    }
                    org.telegram.ui.ActionBar.y yVar2 = this.f41891e0;
                    if (yVar2 != null) {
                        yVar2.f(8);
                    }
                    if ((this.Z3 == 0 || (i9 = this.N3) == 3 || i9 == 8) && (w0Var = this.f41904f0) != null) {
                        w0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.f41942i0;
                    if (w0Var3 != null && this.G9) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar3 = this.f41954j0;
                    if (yVar3 != null && this.H9) {
                        yVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.f41916g0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    this.f41966k0 = true;
                    Fc(0, 0, -1);
                    hc(false);
                }
                mk mkVar = this.f41967k1;
                if (mkVar != null) {
                    if (mkVar.A > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        mkVar.g(false);
                    }
                }
                ImageView imageView = this.P2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.f41890e) || !ChatObject.isPublic(this.f41890e) || this.f42039q3 == null)) {
                    this.f42003n1 = 0;
                } else {
                    this.f42003n1 = 2;
                }
                this.S4 = false;
                if (this.K3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                kh.j1 j1Var = this.f41990m1;
                if (j1Var != null) {
                    j1Var.h.clear();
                }
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f41904f0;
                if (w0Var5 != null) {
                    this.Zb = true;
                    w0Var5.z(false);
                    this.Zb = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = this.f41904f0;
                if (w0Var6 != null) {
                    w0Var6.setSearchFieldCaption(null);
                    this.f41904f0.H(str, false);
                    this.f41904f0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f42028p3, this.P5, this.H6, this.classGuid, 0, this.Z3, false, this.f41969k3, this.f41980l3, false, this.f41992m3);
                yc(0, true);
                this.Z1.e(true, true);
                Lb(true);
                yj yjVar2 = this.l1;
                if (yjVar2 != null) {
                    yjVar2.b(!contains);
                    Hc();
                }
                if ((contains || z10) && this.f42039q3 != null && (yjVar = this.l1) != null) {
                    int currentPosition = yjVar.f29804a.getCurrentPosition();
                    int i10 = this.f42003n1;
                    if (currentPosition != i10) {
                        this.l1.f29804a.d(i10, i10);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f42039q3);
                this.f42026p1.f31011f.N(true);
                View currentView = this.f41990m1.getCurrentView();
                if (currentView instanceof sn) {
                    ((sn) currentView).f42731a.Jc(this.f42039q3);
                }
            }
        }
    }

    public final void db(ArrayList arrayList, String str, boolean z10, int i9, long j10, boolean z11) {
        long j11;
        if (f7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.P5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.effect_id = j10;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f41870c5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                j11 = 0;
            } else {
                j11 = j10;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.P5, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i9, 0);
                of3.sendMessageChatArguments = C8();
                of3.effect_id = j11;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = N8();
                of3.suggestionParams = this.f41870c5;
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
            this.f42127x0.setText(LocaleController.getString(R.string.ReportMessagesNoCaps));
            this.f42127x0.setAlpha(0.5f);
            this.f42127x0.setEnabled(false);
            return;
        }
        this.f42127x0.setText(LocaleController.formatString(R.string.ReportMessagesCountNoCaps, LocaleController.formatPluralString("messages", size, new Object[0])));
        this.f42127x0.setAlpha(1.0f);
        this.f42127x0.setEnabled(true);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, final Object... objArr) {
        long j10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.b5 b5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        dj djVar;
        ak akVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.mt editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.cx0 cx0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i11;
        ak akVar2;
        qn qnVar = this;
        if (i9 == NotificationCenter.messagesDidLoad) {
            qnVar.c8(objArr);
            return;
        }
        if (i9 == NotificationCenter.invalidateMotionBackground) {
            ij ijVar = qnVar.f42077t0;
            if (ijVar != null) {
                ijVar.f1();
            }
            org.telegram.ui.Components.ji jiVar = qnVar.I9;
            if (jiVar != null) {
                jiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            if (i9 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == qnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        qnVar.finishFragment();
                        b.b(qnVar.currentAccount);
                    }
                }
            } else if (i9 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ih.u2 u2Var = qnVar.F1;
                if (u2Var != null && u2Var.isShowing()) {
                    qnVar.F1.dismiss(true);
                }
                if (z11 && (akVar2 = qnVar.U) != null && akVar2.s0()) {
                    qnVar.U.l0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f22400id = stickerSet2.f22407id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = qnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.cx0) && (tL_messages_stickerSet = (cx0Var = (org.telegram.ui.Components.cx0) dialog).O) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f22407id == stickerSet2.f22407id) {
                            cx0Var.C0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.oc ocVar = new org.telegram.ui.Components.oc(cx0Var.container, qnVar.resourceProvider);
                                    if (z12) {
                                        i11 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i11 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.gc r10 = ocVar.r(document, LocaleController.formatString(i11, stickerSet2.title));
                                    r10.f28737j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.cx0 cx0Var2 = new org.telegram.ui.Components.cx0(qnVar.getParentActivity(), qnVar, tL_inputStickerSetID, null, qnVar.U, qnVar.f41848aa);
                            final boolean z15 = z12;
                            qnVar = this;
                            cx0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    qn.i1(qn.this, objArr, cx0Var2, z15, stickerSet2);
                                }
                            });
                            qnVar.showDialog(cx0Var2);
                        }
                    }
                }
            } else if (i9 == NotificationCenter.emojiLoaded) {
                ij ijVar2 = qnVar.f42077t0;
                if (ijVar2 != null) {
                    ijVar2.f1();
                }
                TextView textView = qnVar.M2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i12 = 0; i12 < 2; i12++) {
                    org.telegram.ui.ActionBar.h5 h5Var = qnVar.f42155z2[i12];
                    if (h5Var != null) {
                        h5Var.invalidate();
                    }
                }
                tj tjVar = qnVar.E1;
                if (tjVar != null) {
                    tjVar.getListView().f1();
                }
                gh.f1 f1Var = qnVar.H3;
                if (f1Var != null) {
                    f1Var.f1();
                }
                UndoView undoView = qnVar.f42093u3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                ak akVar3 = qnVar.U;
                if (akVar3 != null && (editField = akVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                bg.t[] tVarArr = qnVar.A2;
                bg.t tVar = tVarArr[0];
                if (tVar != null) {
                    tVar.invalidate();
                }
                bg.t tVar2 = tVarArr[1];
                if (tVar2 != null) {
                    tVar2.invalidate();
                }
            } else if (i9 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i10).getConnectionState();
            } else if (i9 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l10 = (Long) objArr[0];
                if (qnVar.V7 != null && (chat = qnVar.f41890e) != null && chat.f22380id == l10.longValue()) {
                    qnVar.V7.online_count = ((Integer) objArr[1]).intValue();
                    dj djVar2 = qnVar.W0;
                    if (djVar2 != null) {
                        djVar2.m();
                        qnVar.W0.n(false);
                    }
                }
            } else if (i9 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == qnVar.P5 && (akVar = qnVar.U) != null) {
                    akVar.Q1(false, true);
                }
            } else if (i9 == NotificationCenter.userIsPremiumBlockedUpadted) {
                ak akVar4 = qnVar.U;
                if (akVar4 != null) {
                    akVar4.R1();
                }
            } else if (i9 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (qnVar.f41890e != null) {
                        TLRPC.Chat chat2 = qnVar.getMessagesController().getChat(Long.valueOf(qnVar.f41890e.f22380id));
                        if (chat2 != null) {
                            qnVar.f41890e = chat2;
                        }
                    } else if (qnVar.f41903f != null && (user = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.f41903f.f22527id))) != null) {
                        qnVar.f41903f = user;
                    }
                    qnVar.Nc(true);
                }
                if (!qnVar.F9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (qnVar.f41890e != null && (djVar = qnVar.W0) != null) {
                        djVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    qnVar.p();
                    qnVar.Wc(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && qnVar.f41890e != null) {
                    qnVar.y9();
                    TLRPC.Chat chat3 = qnVar.getMessagesController().getChat(Long.valueOf(qnVar.f41890e.f22380id));
                    if (chat3 != null) {
                        qnVar.f41890e = chat3;
                        qnVar.y9();
                        z10 = !qnVar.F9();
                        qnVar.hc(false);
                        ak akVar5 = qnVar.U;
                        if (akVar5 != null) {
                            akVar5.b1(qnVar.currentAccount, qnVar.P5);
                        }
                        FlagSecureReason flagSecureReason = qnVar.A3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                dj djVar3 = qnVar.W0;
                if (djVar3 != null && z10) {
                    djVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    qnVar.Qc(true);
                }
                org.telegram.ui.ActionBar.w0 w0Var = qnVar.f41878d0;
                if (w0Var != null) {
                    if (ChatObject.isChannel(qnVar.f41890e) && !ChatObject.isMonoForum(qnVar.f41890e)) {
                        long j11 = qnVar.f41890e.linked_monoforum_id;
                        if (j11 != 0 && ChatObject.canManageMonoForum(qnVar.currentAccount, -j11)) {
                            z13 = true;
                        }
                    }
                    w0Var.I(70, z13);
                }
            } else if (i9 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!qnVar.Ka) {
                    if (longValue == qnVar.P5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i13 = qnVar.N3;
                        if (intValue2 != i13 && i13 != 3 && i13 != 8) {
                            if (i13 != 1 && intValue2 == 1 && !qnVar.isPaused && LaunchActivity.U() == qnVar && qnVar.f41857b5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                qnVar.ja(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            qnVar.za(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(qnVar.f41890e) && !qnVar.f41890e.megagroup && (chatFull = qnVar.V7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i14 = 0; i14 < size; i14++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                            if (messageObject3.isReply()) {
                                qnVar.f42056r6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        qnVar.w7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i9 == NotificationCenter.didLoadSendAsPeers) {
                qnVar.I9(true);
            } else if (i9 == NotificationCenter.didLoadSponsoredMessages) {
                qnVar.t6();
            } else if (i9 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == qnVar.P5) {
                        qnVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (b5Var = qnVar.parentLayout) != null && b5Var.getFragmentStack().size() > 1) {
                    qnVar.finishFragment();
                } else {
                    qnVar.removeSelfFromStack(true);
                }
            } else if (i9 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == qnVar.a() && (booleanValue || qnVar.parentLayout.getLastFragment() != qnVar)) {
                    if (qnVar.parentLayout.getLastFragment() == qnVar) {
                        qnVar.finishFragment();
                    } else {
                        qnVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i15 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = qnVar.f41972k6;
                if (i9 == i15) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = qnVar.f41890e;
                    if (chat4 != null && chat4.f22380id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (qnVar.f41994m5) {
                            oh ohVar = qnVar.f41958j4;
                            if (ohVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(ohVar);
                                qnVar.f41958j4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            oh ohVar2 = new oh(qnVar, messageObject2, intValue3);
                            qnVar.f41958j4 = ohVar2;
                            AndroidUtilities.runOnUIThread(ohVar2, 500L);
                        }
                    }
                } else if (i9 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = qnVar.f41890e;
                    if (chat5 != null && chat5.f22380id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = qnVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(qnVar.f41890e, qnVar.getMessagesController().getChatFull(qnVar.f41890e.f22380id)));
                            int size2 = messageObject.messageOwner.replies.recent_repliers.size();
                            int i16 = 0;
                            while (true) {
                                if (i16 >= size2) {
                                    break;
                                } else if (MessageObject.getPeerId(messageObject.messageOwner.replies.recent_repliers.get(i16)) == MessageObject.getPeerId(peer)) {
                                    messageObject.messageOwner.replies.recent_repliers.remove(i16);
                                    break;
                                } else {
                                    i16++;
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
                    int i17 = NotificationCenter.threadMessagesRead;
                    if ((i9 == i17 || i9 == NotificationCenter.monoForumMessagesRead) && qnVar.P5 == ((Long) objArr[0]).longValue()) {
                        if (i9 == i17) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i9 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = qnVar.Z3;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i18 = qnVar.f41920g4;
                            ArrayList arrayList2 = qnVar.f42042q6;
                            if (intValue4 > i18) {
                                qnVar.f41920g4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i19 = 0; i19 < size3; i19++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i19);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= qnVar.f41920g4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        bm bmVar = qnVar.f42114w0;
                                        if (bmVar != null) {
                                            bmVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > qnVar.f41933h4) {
                                qnVar.f41933h4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i20 = 0; i20 < size4; i20++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i20);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= qnVar.f41933h4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        bm bmVar2 = qnVar.f42114w0;
                                        if (bmVar2 != null) {
                                            bmVar2.R(messageObject5, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        qnVar.X7(i9, objArr);
        qnVar.Y7(i9, objArr);
        qnVar.Z7(i9, objArr);
        qnVar.a8(i9, objArr);
        qnVar.b8(i9, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ih.u2 u2Var = this.F1;
        if (u2Var != null && this.visibleDialog == u2Var) {
            u2Var.f30114f0.Z(false);
            this.F1.dismissInternal();
            this.F1.f30114f0.c0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.F1 && dialog != this.X9 && !(dialog instanceof mh.c3) && super.dismissDialogOnPause(dialog)) {
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

    public final boolean ea(String str, org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, int i9, int i10) {
        mh.l4 l4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i11;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.f41890e == null || str == null || this.N3 != 0) {
            return false;
        }
        if (t1Var != null && (characterStyle != null || i10 != 1)) {
            l4Var = new mh.l4(this, i9, i10, characterStyle, t1Var);
        } else {
            l4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.f41890e) != null) {
                try {
                    if (Gc == null) {
                        Gc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Hc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Gc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.f41890e, matcher.group(2))) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.parseInt((CharSequence) parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.parseInt((CharSequence) parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.parseInt((CharSequence) queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = yg.f.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i11 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i11 = 0;
                                    }
                                    if (ChatObject.isForum(this.f41890e) && i11 != b()) {
                                        return false;
                                    }
                                    this.f42031p7 = true;
                                    if (this.N3 == 2) {
                                        this.R8.P0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f42097u7 = W;
                                    if (W >= 0) {
                                        this.f42109v7 = parseInt;
                                    }
                                    Xa(parseInt, i9, true, 0, false, 0, num, g10, l4Var);
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
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.f41890e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f41873c8 = queryParameter2;
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
                    if (ChatObject.hasPublicLink(this.f41890e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.N3 == 2) {
                            this.R8.P0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Xa(intValue3, i9, true, 0, false, 0, null, null, l4Var);
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
                    if (parseLong != this.f41890e.f22380id || parseInt3 == 0) {
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
                    byte[] g11 = yg.f.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.f41890e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.Y3;
                            if (tL_forumTopic != null && tL_forumTopic.f22432id == findTopic.f22432id) {
                                return true;
                            }
                            return false;
                        }
                        this.f42031p7 = true;
                        if (this.N3 == 2) {
                            this.R8.P0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Xa(parseInt3, i9, true, 0, false, 0, num2, g11, l4Var);
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
            long j10 = this.f41890e.f22380id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                aa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f42031p7 = true;
            if (this.N3 == 2) {
                this.R8.P0(intValue9);
                finishFragment();
                return true;
            }
            Xa(intValue9, i9, true, 0, false, 0, null, null, l4Var);
            return true;
        }
    }

    public final void eb(ArrayList arrayList, int i9, boolean z10, boolean z11) {
        String str;
        String str2;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
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
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.P5, this.f41959j5, this.T3, null, this.f41934h5, z11, true, null, z10, i9, 0, this.N3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f41870c5);
            y6();
            ak akVar = this.U;
            if (akVar != null) {
                akVar.setFieldText("");
            }
        }
        if (i9 != 0) {
            if (this.O3 == -1) {
                this.O3 = 0;
            }
            this.O3 = arrayList.size() + this.O3;
            Ec(true);
        }
    }

    public final void ec() {
        im imVar = this.T0;
        if (imVar != null && this.Y9 == null) {
            if (this.f41848aa.f41206n == null || imVar.getBackgroundImage() == null) {
                if (this.T0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.T0.V(org.telegram.ui.ActionBar.f6.r0());
                }
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.extendActionMode(android.view.Menu):boolean");
    }

    public final boolean f7() {
        CharSequence slowModeTimer = this.U.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void f8(View view, boolean z10) {
        boolean z11;
        ob(view);
        if (view != this.f41905f1) {
            z11 = true;
        } else {
            z11 = false;
        }
        g8(z10, z11, 0.2f);
    }

    public final void f9(boolean z10) {
        if (this.T2.getTag() != null && !this.Z2) {
            if (!this.f41907f3 || this.f41855b3) {
                this.T2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f41868c3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f41868c3.playTogether(ObjectAnimator.ofFloat(this.T2, View.ALPHA, 0.0f));
                    this.f41868c3.addListener(new li(this, 6));
                    this.f41868c3.setStartDelay(this.W2);
                    this.f41868c3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f41868c3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f41868c3 = null;
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
            presentFragment(new qn(bundle));
        }
    }

    public final me fb(MessageObject messageObject, boolean z10) {
        int i9;
        boolean z11;
        int i10;
        if (messageObject == null || messageObject.isOut() || !messageObject.isSecretMedia()) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message.destroyTime != 0 || (i9 = message.ttl) <= 0) {
            return null;
        }
        if (z10) {
            if (i9 != Integer.MAX_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i9 == Integer.MAX_VALUE) {
                i10 = 0;
            } else {
                i10 = i9;
            }
            message.destroyTime = getConnectionsManager().getCurrentTime() + i10;
            if (this.h != null) {
                getMessagesController().markMessageAsRead(this.P5, messageObject.messageOwner.random_id, i10);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.P5, messageObject.getId(), null, i10, 0L, z11);
            return null;
        }
        return new me(this, messageObject, 1);
    }

    public final void fc() {
        TLRPC.User user;
        boolean z10;
        if (this.f41878d0 != null && (user = this.f41903f) != null && this.h == null && user.bot) {
            a0.h hVar = this.Z7;
            boolean z11 = false;
            if (hVar.m() != 0) {
                boolean z12 = false;
                z10 = false;
                for (int i9 = 0; i9 < hVar.m(); i9++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i9);
                    for (int i10 = 0; i10 < botInfo.commands.size(); i10++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i10);
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
                this.f41878d0.K(30);
            } else {
                this.f41878d0.r(30);
            }
            if (z10) {
                this.f41878d0.K(31);
            } else {
                this.f41878d0.r(31);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.o1 o1Var = this.M8;
        if (o1Var != null) {
            o1Var.f23690e = false;
            A7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f41890e;
    }

    public final void g7(Runnable runnable, gf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            t1 t1Var = new t1(this, aVar, runnable, 19);
            gh.v7 x10 = gh.v7.x(this.currentAccount, aVar.f7747a);
            if (!x10.f9048e) {
                x10.q(true, true, t1Var);
                return;
            } else {
                t1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void g8(boolean z10, boolean z11, float f10) {
        boolean z12;
        ValueAnimator ofFloat;
        rg.g gVar;
        org.telegram.ui.Cells.t1 t1Var;
        if (f10 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.F8;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            t1Var2.setInvalidatesParent(z12);
            if (z12) {
                Na(t1Var2);
            }
        }
        this.T0.invalidate();
        this.f42077t0.invalidate();
        AnimatorSet animatorSet = this.L8;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.L8.cancel();
        }
        this.L8 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.D8, f10);
        float f11 = 1.0f;
        if (z12) {
            this.G8 = 1.0f;
            this.H8 = 0.0f;
            ValueAnimator valueAnimator = this.Xb;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.E8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.ll0.d(new re(this, 3));
            }
        } else {
            float f12 = this.D8;
            this.H8 = f12 / max;
            this.E8 = false;
            ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new cg(this, max, 0));
        if ((!z12 || z11) && (gVar = this.f41905f1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(gVar, property, f11));
        }
        this.L8.playTogether(arrayList);
        this.L8.setInterpolator(org.telegram.ui.Components.gr.h);
        this.L8.setDuration(320L);
        View view2 = this.F8;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            t1Var = (org.telegram.ui.Cells.t1) view2;
        } else {
            t1Var = null;
        }
        this.L8.addListener(new androidx.fragment.app.g(this, z12, t1Var, 4));
        if (this.F8 != null && this.G8 <= 0.0f) {
            ob(null);
        }
        this.L8.start();
    }

    public final void g9(boolean z10) {
        if (this.U2.getTag() != null && !this.a3) {
            if (!this.f41919g3 || this.f41855b3) {
                this.U2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41894e3, 0.0f);
                    this.f41881d3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f41881d3.addUpdateListener(new ie(this, 1));
                    this.f41881d3.addListener(new li(this, 8));
                    this.f41881d3.setStartDelay(this.W2);
                    this.f41881d3.start();
                } else {
                    ValueAnimator valueAnimator = this.f41881d3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f41881d3 = null;
                    }
                    this.f41894e3 = 0.0f;
                    lc();
                }
                this.W2 = 500;
            }
        }
    }

    public final void ga(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f41903f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f41903f.f22527id) {
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
            presentFragment(new qn(bundle));
        }
    }

    public final void gb(android.net.Uri r28, boolean r29, int r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.gb(android.net.Uri, boolean, int):void");
    }

    public final void gc() {
        if (this.N1 == null) {
            return;
        }
        this.N1.setSideMenuBackgroundMarginBottom(((this.O.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.c());
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return org.telegram.ui.ActionBar.x4.f23943a;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f23979c;
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
            ArrayList arrayList = this.f42042q6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + A8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.b6 getResourceProvider() {
        return this.f41848aa;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i9;
        if (this.f41845a7) {
            return null;
        }
        if (this.W9) {
            this.W9 = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Qd));
        if (!A9()) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.f6.f23321v8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.f6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i10 = org.telegram.ui.ActionBar.f6.f23371y8;
            arrayList.add(new org.telegram.ui.ActionBar.h6(kVar, 64, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23388z8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 128, null, null, null, null, i10));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1024, null, null, null, null, i10));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.f6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.f6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.f6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 32768, null, null, null, null, org.telegram.ui.ActionBar.f6.f23269s8));
        dj djVar = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(djVar != null ? djVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.A8));
        dj djVar2 = this.W0;
        org.telegram.ui.ActionBar.h5 titleTextView = djVar2 != null ? djVar2.getTitleTextView() : null;
        int i11 = org.telegram.ui.ActionBar.f6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(titleTextView, 8, null, null, null, null, i11));
        dj djVar3 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(djVar3 != null ? djVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.f6.f22979c2, org.telegram.ui.ActionBar.f6.f22997d2}, org.telegram.ui.ActionBar.f6.f23214pa));
        dj djVar4 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(djVar4 != null ? djVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.f6.f23287t8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.f6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.f6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar2, 67108864, null, null, null, null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 67108864, null, null, null, null, i12));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.f6.f23371y8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(kVar3, 512, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.f6.w8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.f6.f23353x8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.f6.f23388z8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X0, 4, null, null, null, null, i13));
        dj djVar5 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(djVar5 != null ? djVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23125k4}, null, org.telegram.ui.ActionBar.f6.f23200oc));
        dj djVar6 = this.W0;
        arrayList.add(new org.telegram.ui.ActionBar.h6(djVar6 != null ? djVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23142l4}, null, org.telegram.ui.ActionBar.f6.f23216pc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23094i8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23111j8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23129k8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23146l8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23164m8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23181n8));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23198o8));
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.d5 d5Var3 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.d5 d5Var4 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.d5 d5Var5 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.d5 d5Var6 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{d5Var, d5Var2}, null, org.telegram.ui.ActionBar.f6.f23252ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.f6.f23006dc));
        if (d5Var != null) {
            Drawable[] k10 = d5Var.k();
            int i14 = org.telegram.ui.ActionBar.f6.f23289ta;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, d5Var2.k(), null, i14));
            Drawable[] k11 = d5Var3.k();
            int i15 = org.telegram.ui.ActionBar.f6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, d5Var4.k(), null, i15));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.f6.Aa));
        if (this.f41848aa.h(false)) {
            i9 = 1;
        } else {
            i9 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.f6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.f6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.f6.Fa));
        }
        ij ijVar = this.f42077t0;
        Class[] clsArr = new Class[i9];
        clsArr[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = d5Var5;
        drawableArr[i9] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ijVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.f6.Ba));
        ij ijVar2 = this.f42077t0;
        Class[] clsArr2 = new Class[i9];
        clsArr2[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = d5Var5;
        drawableArr2[i9] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ijVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.f6.f22970bc));
        ij ijVar3 = this.f42077t0;
        Class[] clsArr3 = new Class[i9];
        clsArr3[0] = org.telegram.ui.Cells.w0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i16 = org.telegram.ui.ActionBar.f6.f23097ic;
        arrayList.add(new org.telegram.ui.ActionBar.h6(ijVar3, 4, clsArr3, themedPaint, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 2, new Class[]{org.telegram.ui.Cells.w0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.f6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23332w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.f6.f23132kc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23150lc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23167mc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.f6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 2, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.f6.f23061gc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.f6.f23079hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.f6.f23070h3};
        int i17 = org.telegram.ui.ActionBar.f6.f23133kd;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr3, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.f6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.f6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.f6.La));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.f6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23235qc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23254rc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.F3, org.telegram.ui.ActionBar.f6.G3}, null, org.telegram.ui.ActionBar.f6.f23273sc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23291tc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.f6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.f6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.M3, org.telegram.ui.ActionBar.f6.Q3, org.telegram.ui.ActionBar.f6.U3}, null, org.telegram.ui.ActionBar.f6.f23357xc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.N3, org.telegram.ui.ActionBar.f6.R3, org.telegram.ui.ActionBar.f6.V3}, null, org.telegram.ui.ActionBar.f6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22944a4, org.telegram.ui.ActionBar.f6.f22963b4, org.telegram.ui.ActionBar.f6.Z3}, null, org.telegram.ui.ActionBar.f6.f23392zc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.f6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.f6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22981c4}, null, org.telegram.ui.ActionBar.f6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22999d4}, null, org.telegram.ui.ActionBar.f6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23053g4}, null, org.telegram.ui.ActionBar.f6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i18 = org.telegram.ui.ActionBar.f6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr4, null, i18));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.f6.f23071h4, org.telegram.ui.ActionBar.f6.B4, org.telegram.ui.ActionBar.f6.D4};
        int i19 = org.telegram.ui.ActionBar.f6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr5, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.G4, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.f6.H4, null, org.telegram.ui.ActionBar.f6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.O4}, null, org.telegram.ui.ActionBar.f6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.P4}, null, org.telegram.ui.ActionBar.f6.f23249r7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.Q4}, null, org.telegram.ui.ActionBar.f6.f23233qa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.f22961b2, null, null, org.telegram.ui.ActionBar.f6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23107j4}, null, org.telegram.ui.ActionBar.f6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, eVar, org.telegram.ui.ActionBar.f6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.J2, null, null, org.telegram.ui.ActionBar.f6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.K2, null, null, org.telegram.ui.ActionBar.f6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.T1, null, null, org.telegram.ui.ActionBar.f6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.f6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.f6.f23339wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Rc));
        int i20 = org.telegram.ui.ActionBar.f6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i20));
        int i21 = org.telegram.ui.ActionBar.f6.f22951ab;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22988cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23005db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23024eb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22953ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23042fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22971bd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22990cd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23060gb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23007dd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23078hb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23025ed));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23096ib));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23043fd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23062gd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23114jb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23131kb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23080hd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23098id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23234qb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23115jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23253rb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.nd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23272sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23201od));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23151ld));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23168md));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.ob));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23215pb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23184nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23217pd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23236qd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23149lb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.mb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23255rd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23290tb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23274sd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23308ub));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23292td));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.vb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23310ud));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23338wb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23340wd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23374yb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23358xd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.vd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23391zb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23356xb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23375yd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23393zd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.U1, null, null, org.telegram.ui.ActionBar.f6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.V1, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.f6.W1, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23099ie));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23309uc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23116je));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23323vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.f6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.f6.f23256re));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.f6.f23275se));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.f6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.f6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23218pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.f6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.f6.f23237qe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.f6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23023ea));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23041fa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23059ga));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23077ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.f6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.f6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.f6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.f6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.f6.f23357xc));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.f6.Ra));
        if (!this.f41848aa.h(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.f6.f23242r0, null, org.telegram.ui.ActionBar.f6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.f23328w0, null, null, org.telegram.ui.ActionBar.f6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.f6.B0[0], org.telegram.ui.ActionBar.f6.B0[1], org.telegram.ui.ActionBar.f6.D0}, null, null, org.telegram.ui.ActionBar.f6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.f6.C0[0], org.telegram.ui.ActionBar.f6.C0[1], org.telegram.ui.ActionBar.f6.E0}, null, null, org.telegram.ui.ActionBar.f6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f22943a1}, null, org.telegram.ui.ActionBar.f6.f22949a9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23050g1, org.telegram.ui.ActionBar.f6.f23068h1}, null, org.telegram.ui.ActionBar.f6.f23112j9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.F0[1], null, null, org.telegram.ui.ActionBar.f6.i9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.G0, null, null, org.telegram.ui.ActionBar.f6.f23165m9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23130k9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.o9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.f6.H0, null, null, org.telegram.ui.ActionBar.f6.p9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.f6.I0, null, null, org.telegram.ui.ActionBar.f6.f23232q9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.T0}, null, org.telegram.ui.ActionBar.f6.f23306u9));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.H3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.V0, org.telegram.ui.ActionBar.f6.W0}, null, org.telegram.ui.ActionBar.f6.f23322v9));
        }
        tj tjVar = this.E1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i22 = org.telegram.ui.ActionBar.f6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.h6(tjVar, 0, null, themedPaint2, null, null, i22));
        tj tjVar2 = this.E1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.f6.f23089i3};
        int i23 = org.telegram.ui.ActionBar.f6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.h6(tjVar2, 0, null, null, drawableArr10, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23106j3}, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23089i3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.N, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23089i3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23089i3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.f6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.f6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.f6.Xk));
        int i24 = org.telegram.ui.ActionBar.f6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i24));
        int i25 = org.telegram.ui.ActionBar.f6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i25));
        int i26 = org.telegram.ui.ActionBar.f6.f23092i6;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i25));
        int i27 = org.telegram.ui.ActionBar.f6.f23117jf;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i24));
        int i28 = org.telegram.ui.ActionBar.f6.f22973bf;
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.f6.f22954ae));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.f6.f22972be));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.f6.f23135kf));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23187nf));
        ak akVar = this.U;
        int i29 = org.telegram.ui.ActionBar.f6.mf;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar, 0, null, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, null, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.f6.f23202of));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.f6.f22992cf));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.f6.f22955af));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23045ff));
        ak akVar2 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar2 != null ? akVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.He));
        ak akVar3 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar3 != null ? akVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Ke));
        ak akVar4 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar4 != null ? akVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Le));
        ak akVar5 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar5 != null ? akVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Me));
        ak akVar6 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar6 != null ? akVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Oe));
        ak akVar7 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar7 != null ? akVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Pe));
        ak akVar8 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar8 != null ? akVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Re));
        ak akVar9 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar9 != null ? akVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Se));
        ak akVar10 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar10 != null ? akVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.We));
        ak akVar11 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar11 != null ? akVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Ne));
        ak akVar12 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar12 != null ? akVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Je));
        ak akVar13 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar13 != null ? akVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Ue));
        ak akVar14 = this.U;
        arrayList.add(new org.telegram.ui.ActionBar.h6(akVar14 != null ? akVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.wy.class}, null, null, null, eVar, org.telegram.ui.ActionBar.f6.Qe));
        ak akVar15 = this.U;
        if (akVar15 != null) {
            org.telegram.ui.Components.t31 trendingStickersAlert = akVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, new Drawable[]{this.U.getStickersArrowDrawable()}, null, i25));
        }
        int i30 = 0;
        while (i30 < 2) {
            View view = i30 == 0 ? this.f42093u3 : this.f42106v3;
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 32, null, null, null, null, org.telegram.ui.ActionBar.f6.Fi));
            int i31 = org.telegram.ui.ActionBar.f6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i31));
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i31));
            int i32 = org.telegram.ui.ActionBar.f6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 2, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i31));
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.h6(view, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i32));
            i30++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.f6.f23320v7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.f6.f23335w7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.f6.f23304u7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.f6.f23286t7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.f6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.f6.f23352x7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.f6.f23370y7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42105v2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23026ee));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42105v2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23001d6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.B2, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23044fe));
        for (int i33 = 0; i33 < 2; i33++) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42143y2[i33], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23044fe));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42155z2[i33], 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23063ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.L2, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23044fe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.M2, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23063ge));
        ImageView imageView = this.F2;
        int i34 = org.telegram.ui.ActionBar.f6.f23008de;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView, 8, null, null, null, null, i34));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.H2, 8, null, null, null, null, i34));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.Q1, 8, null, null, null, null, i34));
        TextView textView = this.H1;
        int i35 = org.telegram.ui.ActionBar.f6.f23081he;
        arrayList.add(new org.telegram.ui.ActionBar.h6(textView, 4, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J1, 262148, null, null, null, null, org.telegram.ui.ActionBar.f6.f23230q7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.J1, 262148, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.D1, 8, null, null, null, null, org.telegram.ui.ActionBar.f6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23324ve));
        ImageView imageView2 = this.O2;
        int i36 = org.telegram.ui.ActionBar.f6.f23359xe;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView2, 8, null, null, null, null, i36));
        ImageView imageView3 = this.O2;
        int i37 = org.telegram.ui.ActionBar.f6.f23388z8;
        arrayList.add(new org.telegram.ui.ActionBar.h6(imageView3, 65568, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P2, 8, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.P2, 65568, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.A0, 4, null, null, null, null, org.telegram.ui.ActionBar.f6.f23394ze));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42127x0, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42127x0, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23294tf));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42127x0, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.C0, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Sh));
        org.telegram.ui.Components.un unVar = this.U0;
        int i38 = org.telegram.ui.ActionBar.f6.f23097ic;
        arrayList.add(new org.telegram.ui.ActionBar.h6(unVar, 4, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X1, 4, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f41978l0, 2048, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.f6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.f6.De));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42077t0, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.f6.Ee));
        kh.h6 h6Var = this.M;
        int i39 = org.telegram.ui.ActionBar.f6.f23150lc;
        arrayList.add(new org.telegram.ui.ActionBar.h6(h6Var, 536870912, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.X1, 536870912, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.U0, 536870912, null, null, null, null, i39));
        if (this.E1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.f6.Ce));
            int i40 = org.telegram.ui.ActionBar.f6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"nameTextView"}, null, null, null, i40));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.f6.A6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.f6.f23160m4, org.telegram.ui.ActionBar.f6.f23177n4, org.telegram.ui.ActionBar.f6.f23195o4}, null, org.telegram.ui.ActionBar.f6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23386z6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.f6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, i40));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23098id));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23115jd));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.E1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.f6.f23002d7));
        }
        org.telegram.ui.Components.s30 s30Var = this.a2;
        int i41 = org.telegram.ui.ActionBar.f6.f23238qf;
        arrayList.add(new org.telegram.ui.ActionBar.h6(s30Var, 32, null, null, null, null, i41));
        org.telegram.ui.Components.s30 s30Var2 = this.a2;
        int i42 = org.telegram.ui.ActionBar.f6.f23219pf;
        arrayList.add(new org.telegram.ui.ActionBar.h6(s30Var2, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42027p2, 4, new Class[]{org.telegram.ui.Components.s30.class}, new String[]{"textView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42027p2, 8, new Class[]{org.telegram.ui.Components.s30.class}, new String[]{"imageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42027p2, 4, new Class[]{org.telegram.ui.Components.s30.class}, new String[]{"arrowImageView"}, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42038q2, 4, new Class[]{org.telegram.ui.Components.s30.class}, new String[]{"textView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.f42038q2, 4, new Class[]{org.telegram.ui.Components.s30.class}, new String[]{"arrowImageView"}, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T2, 0, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.T2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.V2, 0, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.h6(this.V2, 0, null, null, null, null, i39));
        int i43 = org.telegram.ui.ActionBar.f6.f23095ia;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i43));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23113ja));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i43));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.ka));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i43));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i43));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23148la));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23166ma));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i43));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23183na));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, i43));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23199oa));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.f6.R4}, null, org.telegram.ui.ActionBar.f6.f23004da));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23072h5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23091i5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23228q5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23127k6));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23312uf));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23325vf));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22957ah));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22975bh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22994ch));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23011dh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23029eh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23047fh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23101ih));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23119jh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23137kh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23066gh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f23084hh));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.f22947a7));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.f6.Dj));
        int i44 = org.telegram.ui.ActionBar.f6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, i44));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, null, i44));
        arrayList.add(new org.telegram.ui.ActionBar.h6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.f6.f23360xf));
        ak akVar16 = this.U;
        if (akVar16 != null && akVar16.f26126i0 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.U.f26126i0.f18206c, 4, new Class[]{mh.a0.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.f6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.h6(this.U.f26126i0.f18206c, 4, new Class[]{mh.a0.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.f6.f23369y6));
        }
        eh.e eVar2 = this.ba;
        if (eVar2 != null) {
            eVar2.b(arrayList);
        }
        int size = arrayList.size();
        int i45 = 0;
        while (i45 < size) {
            Object obj = arrayList.get(i45);
            i45++;
            ((org.telegram.ui.ActionBar.h6) obj).f23506o = this.f41848aa;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f41848aa.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint O = this.f41848aa.O(str);
        if (O != null) {
            return O;
        }
        return org.telegram.ui.ActionBar.f6.S0(str);
    }

    public final void h7() {
        if (this.f42106v3 != null) {
            return;
        }
        xk xkVar = new xk(this, getParentActivity(), this, this.f41848aa);
        this.f42106v3 = xkVar;
        this.T0.addView(xkVar, 17, g7.e6.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void h8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void h9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.s30 s30Var = this.f41944i2;
            if (s30Var != null) {
                s30Var.b(true);
            }
            wi wiVar = this.f41867c2;
            if (wiVar != null) {
                wiVar.b(true);
            }
            org.telegram.ui.Components.s30 s30Var2 = this.f41893e2;
            if (s30Var2 != null) {
                s30Var2.b(true);
            }
        }
        org.telegram.ui.Components.s30 s30Var3 = this.f41931h2;
        if (s30Var3 != null) {
            s30Var3.b(true);
        }
        org.telegram.ui.Components.s30 s30Var4 = this.f41918g2;
        if (s30Var4 != null) {
            s30Var4.b(true);
        }
        org.telegram.ui.Components.s30 s30Var5 = this.f42027p2;
        if (s30Var5 != null) {
            s30Var5.b(true);
        }
        org.telegram.ui.Components.s30 s30Var6 = this.f42038q2;
        if (s30Var6 != null) {
            s30Var6.b(true);
        }
        org.telegram.ui.Components.s30 s30Var7 = this.f41956j2;
        if (s30Var7 != null) {
            s30Var7.b(true);
        }
        org.telegram.ui.Components.s30 s30Var8 = this.f41968k2;
        if (s30Var8 != null) {
            s30Var8.b(true);
        }
        org.telegram.ui.Components.gp gpVar = this.f42052r2;
        if (gpVar != null) {
            gpVar.a();
        }
        kh.x3 x3Var = this.F0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        kh.x3 x3Var2 = this.H0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        kh.x3 x3Var3 = this.G0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
    }

    public final void ha(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        long j10;
        long j11;
        org.telegram.ui.Components.x5 animation;
        Bitmap m10;
        if (t1Var == null) {
            int childCount = this.f42077t0.getChildCount();
            int i9 = 0;
            while (true) {
                if (i9 >= childCount) {
                    break;
                }
                View childAt = this.f42077t0.getChildAt(i9);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var2.getMessageObject().equals(messageObject)) {
                        t1Var = t1Var2;
                        break;
                    }
                }
                i9++;
            }
        }
        if (messageObject.isVideo()) {
            fb(messageObject, true);
        }
        PhotoViewer.t1().K2(null, this, this.f41848aa);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (t1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = t1Var.getPhotoImage().getAnimation()) != null && this.f42072s8 != null && this.f42032p8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f42072s8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i10 = this.N3;
        el elVar = this.Ba;
        if (i10 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().f35649h4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f42042q6;
            int size = arrayList2.size();
            for (int i11 = 0; i11 < size; i11++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i11);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().a2(arrayList, arrayList.indexOf(messageObject), this.P5, 0L, b(), elVar);
        } else {
            PhotoViewer t12 = PhotoViewer.t1();
            int i12 = messageObject.type;
            long j12 = 0;
            if (i12 != 0) {
                j10 = this.P5;
            } else {
                j10 = 0;
            }
            if (i12 != 0) {
                j11 = this.H6;
            } else {
                j11 = 0;
            }
            if (i12 != 0) {
                j12 = b();
            }
            t12.c2(messageObject, this, j10, j11, j12, elVar);
        }
        h9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void hb(MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, int i9, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages X8 = X8(messageObject);
        boolean z12 = false;
        if (X8 != null) {
            int i10 = 0;
            while (true) {
                if (i10 < X8.messages.size()) {
                    if (this.S5[i9].indexOfKey(X8.messages.get(i10).getId()) < 0) {
                        break;
                    }
                    i10++;
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
        t1Var.setDrawSelectionBackground(z11);
        if (X8 == null) {
            z12 = true;
        }
        t1Var.L3(true, z12, z10);
    }

    public final void hc(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.hc(boolean):void");
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.T3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.f41890e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f41903f;
    }

    public final void i7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.Db > 1000) {
            z10 = true;
        }
        jg jgVar = this.Eb;
        AndroidUtilities.cancelRunOnUIThread(jgVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        AndroidUtilities.runOnUIThread(jgVar, j10);
    }

    public final void i8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.f41982l5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void i9() {
        ValueAnimator valueAnimator = this.f41876cb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.w0 w0Var = this.V2;
        if (w0Var != null && w0Var.getTag() != null) {
            this.V2.setTag(null);
            org.telegram.ui.Cells.w0 w0Var2 = this.V2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ze(this, w0Var2, 1));
            ofFloat.addListener(new fg.j(11, this, w0Var2));
            ofFloat.setDuration(150L);
            this.f41876cb = ofFloat;
            ofFloat.start();
        }
    }

    public final void ia(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i9;
        if (getParentActivity() != null && (b5Var = this.parentLayout) != null && b5Var.getLastFragment() == this && !this.D4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f41890e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f22380id);
            } else {
                bundle.putLong("user_id", this.f41903f.f22527id);
            }
            bundle.putInt("chatMode", 2);
            qn qnVar = new qn(bundle);
            qnVar.D4 = new ArrayList(this.D4);
            qnVar.F4 = new HashMap(this.F4);
            int size = this.D4.size();
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) this.D4.get(i10);
                MessageObject messageObject = (MessageObject) this.F4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f41972k6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    qnVar.F4.put(num, messageObject);
                    qnVar.zc();
                }
            }
            qnVar.L4 = this.L4;
            if (this.f41882d4) {
                i9 = this.D4.size();
            } else {
                i9 = this.M4;
            }
            qnVar.M4 = i9;
            qnVar.O4 = this.O4;
            qnVar.W7 = this.W7;
            qnVar.V7 = this.V7;
            qnVar.R8 = new bl(this, qnVar);
            if (z10) {
                presentFragmentAsPreview(qnVar);
                d7();
                return;
            }
            presentFragment(qnVar, false);
        }
    }

    public final void ib(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f41848aa != null && this.Y9 == null) {
            nf.b c10 = nf.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.P5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.b4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.b4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.b4 b4Var = theme;
                on onVar = this.f41848aa;
                TLRPC.WallPaper wallPaper = onVar.h;
                if (this.L5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                onVar.i(b4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new oe(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.P5);
            on onVar2 = this.f41848aa;
            org.telegram.ui.ActionBar.b4 b4Var2 = onVar2.f41205f;
            if (this.L5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            onVar2.i(b4Var2, dialogWallpaper, z10, null, false);
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
            org.telegram.ui.ActionBar.b6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w02 = resourceProvider.p0(org.telegram.ui.ActionBar.f6.w8);
            } else {
                w02 = org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.w8, true);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.f6.I.q();
        } else {
            z10 = this.f42164zb;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.N3 != 5 || (!this.f42042q6.isEmpty() && this.Z3 != 0)) && !this.f42102uc.f47776f && this.f41963j9) {
            wk wkVar = this.Aa;
            if (wkVar == null || !wkVar.f27461s) {
                ch.k kVar = this.T9;
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
    public final void j(int i9, int i10, boolean z10, int i11, boolean z11, int i12) {
        Xa(i9, i10, z10, i11, z11, i12, null, null, null);
    }

    public final void j7() {
        int W8 = (int) (W8(org.telegram.ui.Components.w11.f34073c) + this.O.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.T.setFadeZoneBottom(W8);
        int b10 = g7.n.b(AndroidUtilities.dp(36.0f) + (this.T0.getMeasuredHeight() - W8), 0, this.T0.getMeasuredHeight());
        int measuredWidth = this.T0.getMeasuredWidth();
        Rect rect = Lc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.va, this.f42077t0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f42077t0.getMeasuredHeight() - this.f42123wa) - W8));
    }

    public final void j8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f41870c5;
        if (messageSuggestionParams != null) {
            Db(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.C5;
        if (webPage != null) {
            Eb(true, webPage, false);
            return;
        }
        gn gnVar = this.f41934h5;
        if (gnVar != null) {
            Cb(this.f41959j5, gnVar);
            return;
        }
        MessageObject messageObject = this.f41959j5;
        if (messageObject != null && messageObject != this.T3) {
            Bb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f41857b5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Ab(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.f41982l5;
        if (messageObject2 != null) {
            yb(true, null, messageObject2, null, null, null, false, true);
        } else {
            Eb(false, null, true);
        }
    }

    public final boolean j9(boolean z10) {
        yk ykVar;
        yk ykVar2 = this.f42079t2;
        if (ykVar2 == null || ykVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.sg sgVar = this.I0;
        if (sgVar != null && (ykVar = this.f42079t2) != null) {
            sgVar.i(ykVar, false, z10);
        }
        int i9 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.D2;
            if (i9 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i9];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i9] = null;
                }
                i9++;
            } else {
                this.f42116w2 = false;
                this.f42079t2.setTag(1);
                return true;
            }
        }
    }

    public final void ja(int i9, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f22388id);
            } else {
                TLRPC.Chat chat = this.f41890e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f22380id);
                } else {
                    bundle.putLong("user_id", this.f41903f.f22527id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i9);
                bundle.putBoolean("converting_toast", true);
            }
            qn qnVar = new qn(bundle);
            if (this.f41882d4) {
                vf.c.a(qnVar, MessagesStorage.TopicKey.of(a(), b()));
            }
            qnVar.R8 = new ej(this);
            presentFragment(qnVar, false);
        }
    }

    public final void jb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i9 = 0; i9 < viewGroup.getChildCount(); i9++) {
                jb(viewGroup.getChildAt(i9), z10);
            }
        }
        if (view != this.f42077t0 && view != this.T0) {
            view.setEnabled(z10);
        }
    }

    public final void jc() {
        int i9;
        org.telegram.ui.Components.lb lbVar;
        nk nkVar;
        ak akVar;
        if (this.f42162z9 && this.f42077t0 != null) {
            float f10 = 0.0f;
            if (this.f41987la <= 0 || this.f42163za != 0.0f) {
                float V8 = V8(AndroidUtilities.dp(7.0f));
                mk mkVar = this.f41967k1;
                if (mkVar != null) {
                    i9 = AndroidUtilities.dp(mkVar.A * 35.0f);
                } else {
                    i9 = 0;
                }
                float z82 = (z8() * AndroidUtilities.dp(43.0f)) + V8 + i9;
                float f11 = this.o9;
                this.p9 = z82;
                this.o9 = W8(org.telegram.ui.Components.w11.f34071a) + AndroidUtilities.dp(4.0f) + this.f42059r9 + z82;
                if (this.actionBar.getVisibility() == 0 || this.Z9 != null) {
                    this.o9 += this.actionBar.getMeasuredHeight();
                }
                this.f42045q9 = 0;
                this.o9 = this.o9 + this.va + this.f42073s9;
                if (this.f42163za != 0.0f && (akVar = this.U) != null && akVar.getVisibility() == 0) {
                    float f12 = this.o9;
                    float measuredHeight = this.f42163za * (this.U.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.o9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.w0 w0Var = this.V2;
                if (w0Var != null) {
                    w0Var.setTranslationY(((this.f42077t0.getTranslationY() + this.o9) + this.f42122w9) - AndroidUtilities.dp(30.0f));
                    float f13 = this.o9;
                    float f14 = this.f42122w9;
                    this.o9 = f13 + f14;
                    this.f42045q9 = (int) (this.f42045q9 + f14);
                }
                rj rjVar = this.T2;
                if (rjVar != null) {
                    rjVar.setTranslationY((((this.f42077t0.getTranslationY() - f10) + this.o9) + this.f42099u9) - AndroidUtilities.dp(4.0f));
                }
                lc();
                ij ijVar = this.f42077t0;
                if (ijVar != null && this.f42103v0 != null && this.f42114w0 != null) {
                    int paddingTop = ijVar.getPaddingTop();
                    int paddingBottom = this.f42077t0.getPaddingBottom();
                    n7();
                    if (this.f42077t0.getPaddingTop() != paddingTop || this.f42077t0.getPaddingBottom() != paddingBottom) {
                        r9();
                        q9(2);
                    }
                    this.f42077t0.setTopGlowOffset((int) ((this.o9 - this.f42045q9) - AndroidUtilities.dp(4.0f)));
                    if (f11 != this.o9) {
                        int childCount = this.f42077t0.getChildCount();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= childCount) {
                                break;
                            }
                            View childAt = this.f42077t0.getChildAt(i10);
                            this.f42077t0.getClass();
                            if (RecyclerView.R(childAt) == this.f42114w0.h() - 1) {
                                float f15 = this.o9;
                                if (childAt.getTop() > f15) {
                                    this.f42077t0.scrollBy(0, (int) (childAt.getTop() - f15));
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!F9() && !this.f42157z4 && this.F7 != null && this.f42077t0 != null && ((nkVar = this.L1) == null || nkVar.getVisibility() != 0)) {
                        this.f42077t0.scrollBy(0, (int) (f11 - this.o9));
                    }
                }
                this.f42162z9 = false;
                org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
                if (gcVar != null && (lbVar = gcVar.f28733e) != null) {
                    lbVar.updatePosition();
                }
                n7();
            }
        }
    }

    public final void k7() {
        int i9;
        if (this.W0 != null) {
            float actionModeFactor = (1.0f - this.f42112vc.f47775e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.W0.setScaleX(lerp);
            this.W0.setScaleY(lerp);
            this.W0.setAlpha(actionModeFactor);
            dj djVar = this.W0;
            if (actionModeFactor > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            djVar.setVisibility(i9);
        }
    }

    public final void k9() {
        rk rkVar = this.Xa;
        if (rkVar == null) {
            return;
        }
        this.Xa = null;
        rkVar.e();
        if (rkVar.getReactionsWindow() != null && rkVar.getReactionsWindow().f10574a != null) {
            rkVar.getReactionsWindow().f10574a.animate().alpha(0.0f).setDuration(180L).start();
        }
        rkVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new rd(15, this, rkVar)).setDuration(180L).start();
    }

    public final void ka(TLRPC.Chat chat) {
        boolean z10;
        kh.x3 x3Var = this.f42051r1;
        if (x3Var != null && x3Var.R) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        kh.x3 x3Var2 = this.f42065s1;
        if (x3Var2 != null && x3Var2.R) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new rd(9, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f23577j0) {
            this.f42112vc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f41878d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f41840a0;
            if (yVar != null) {
                yVar.f(8);
            }
            wr wrVar = this.Z;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f41891e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f41904f0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f41942i0;
            if (w0Var3 != null && this.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f41954j0;
            if (yVar3 != null && this.H9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f41916g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f41966k0 = true;
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
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f41904f0;
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
        this.f42114w0.L.clear();
        this.Va.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i9 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.f42083t6;
            arrayList = this.f42042q6;
            z11 = true;
            if (i9 >= size) {
                break;
            }
            MessageObject messageObject2 = (MessageObject) arrayList2.get(i9);
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject.getDialogId() == messageObject2.getDialogId() && messageObject.getId() == messageObject2.getId()) {
                        break;
                    }
                    i10++;
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
                if (this.f42114w0.J && messageObject2.stableId != 0) {
                    messageObject.copyStableParams(messageObject2);
                } else {
                    messageObject2.copyStableParams(messageObject);
                }
            } else if (messageObject2.stableId == 0) {
                int i11 = Fc;
                Fc = i11 + 1;
                messageObject2.stableId = i11;
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
                    int i12 = 0;
                    while (true) {
                        if (i12 < groupedMessages2.messages.size()) {
                            if (groupedMessages2.messages.get(i12).getId() == messageObject2.getId()) {
                                break;
                            }
                            i12++;
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
            this.f42114w0.L.add(messageObject2);
            this.Va.k(messageObject2, messageObject2.getId());
            i9++;
        }
        if (hVar3 != null) {
            for (int i13 = 0; i13 < hVar3.m(); i13++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar3.n(i13);
                Collections.sort(groupedMessages3.messages, new j9.a(16));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f41992m3 != null && TextUtils.isEmpty(this.f42028p3)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i14);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f41992m3.f(messageObject3.messageOwner.reactions.results.get(i15).reaction)) {
                            arrayList3.add(messageObject3);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < arrayList3.size(); i16++) {
            MessageObject messageObject4 = (MessageObject) arrayList3.get(i16);
            if (!this.Va.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.f42114w0.L.add(messageObject4);
                this.Va.k(messageObject4, messageObject4.getId());
            }
        }
        int i17 = 0;
        while (i17 < this.f42114w0.L.size()) {
            MessageObject messageObject5 = (MessageObject) this.f42114w0.L.get(i17);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.Va.d(messageObject6.getId())) {
                        this.f42114w0.L.add(i17, messageObject6);
                        this.Va.k(messageObject6, messageObject6.getId());
                        i17++;
                    }
                }
            }
            i17++;
        }
        Collections.sort(this.f42114w0.L, new j9.a(17));
        MessageObject messageObject7 = null;
        int i18 = 0;
        while (i18 < this.f42114w0.L.size()) {
            MessageObject messageObject8 = (MessageObject) this.f42114w0.L.get(i18);
            if (this.La && messageObject8 != null && i18 == 0) {
                Da(messageObject8, i18);
                i18++;
            }
            if (!this.La && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject7, i18);
                i18++;
            }
            ArrayList arrayList4 = (ArrayList) this.Ua.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.l0.j(messageObject8.dateKeyInt, this.Ua);
            }
            arrayList4.add(messageObject8);
            if (this.La && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject8, i18);
                i18++;
            }
            if (!this.La && i18 >= this.f42114w0.L.size() - 1) {
                Da(messageObject8, this.f42114w0.L.size());
                i18++;
            }
            i18++;
            messageObject7 = messageObject8;
        }
        this.f42114w0.K = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.f42114w0.T();
            this.f42114w0.O(true);
            if (this.f42114w0.J ? !getMediaDataController().isSearchLoading() || !this.f42114w0.L.isEmpty() : !this.C6 || !arrayList.isEmpty() || this.f42114w0.f36906w >= 0) {
                z11 = false;
            }
            Pb(z11);
            if (this.f42077t0 != null) {
                G7(false);
                if (this.f42114w0.J ? !(getMediaDataController().isSearchLoading() || !this.f42114w0.L.isEmpty()) : !(this.C6 || !arrayList.isEmpty() || this.f42114w0.f36906w >= 0)) {
                    this.f42077t0.setEmptyView(this.M0);
                    ij ijVar = this.f42077t0;
                    ijVar.J0(ijVar.u1());
                    return;
                }
                this.M0.setVisibility(8);
                this.f42077t0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i9, long j10, boolean z11, long j11) {
        String str2 = null;
        l8(str, null);
        if (f7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.P5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.invert_media = z11;
                of2.payStars = j11;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f41870c5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.P5, false, false, true, 0, 0, null, -1, j11, N8(), this.f41870c5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.P5, this.f41959j5, this.T3, null, this.f41934h5, this.f41982l5, z10, i9, 0, null, C8(), j10, z11, j11, N8(), this.f41870c5);
            y6();
        }
    }

    public final void l7() {
        boolean z10;
        kh.j1 j1Var;
        if (this.Z9 != null) {
            return;
        }
        int i9 = 0;
        if (this.f42102uc.f47775e >= 1.0f && ((j1Var = this.f41990m1) == null || j1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        fh.l2 l2Var = this.T0.H;
        if (!z10) {
            i9 = 4;
        }
        l2Var.setVisibility(i9);
    }

    public final void l8(CharSequence charSequence, ArrayList arrayList) {
        if (this.f41982l5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.f41982l5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.f41982l5.isMediaEmpty()) {
                MessageObject messageObject2 = this.f41982l5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                ak akVar = this.U;
                if (akVar != null) {
                    this.f41982l5.editingMessage = akVar.getFieldText();
                    MessageObject messageObject3 = this.f41982l5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.f41982l5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final void l9() {
        UndoView undoView = this.f42093u3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.gc gcVar = this.f42117w3;
        if (gcVar != null) {
            gcVar.c(0L, false);
        }
        xk xkVar = this.f42106v3;
        if (xkVar != null) {
            xkVar.e(0, true);
        }
    }

    public final void la(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i9;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        kh.x3 x3Var = this.f42051r1;
        if (x3Var != null && x3Var.R) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        kh.x3 x3Var2 = this.f42065s1;
        if (x3Var2 != null && x3Var2.R) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new le(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f23577j0) {
            this.f42112vc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f41878d0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f41840a0;
            if (yVar != null) {
                yVar.f(8);
            }
            wr wrVar = this.Z;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f41891e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            if ((this.Z3 == 0 || (i10 = this.N3) == 3 || i10 == 8) && (w0Var = this.f41904f0) != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f41942i0;
            if (w0Var3 != null && this.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f41954j0;
            if (yVar3 != null && this.H9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f41916g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f41966k0 = true;
            Fc(0, 0, -1);
            hc(false);
        }
        if ((this.Z3 == 0 || this.f41882d4 || (i9 = this.N3) == 3 || i9 == 8) && !UserObject.isReplyUser(this.f41903f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.S4 = z11;
            org.telegram.ui.ActionBar.w0 w0Var5 = this.f41904f0;
            if (w0Var5 != null) {
                w0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f41904f0;
        if (w0Var6 != null) {
            w0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f42028p3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.P5, this.H6, this.classGuid, 0, this.Z3, false, this.f41969k3, this.f41980l3, !TextUtils.isEmpty(str), this.f41992m3);
        yc(0, true);
    }

    public final void lb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.lb(boolean, boolean, boolean):void");
    }

    public final void lc() {
        int i9;
        qj qjVar = this.U2;
        if (qjVar == null) {
            return;
        }
        qjVar.setTranslationX(R8() / 2.0f);
        this.U2.setTranslationY((((this.f42077t0.getTranslationY() + this.o9) + this.f42111v9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f42111v9, -this.U2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.U2.setAlpha(this.f41894e3 * clamp);
        qj qjVar2 = this.U2;
        if (this.f41894e3 * clamp > 0.0f) {
            i9 = 0;
        } else {
            i9 = 4;
        }
        qjVar2.setVisibility(i9);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.U2.setScaleX(lerp);
        this.U2.setScaleY(lerp);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i9) {
        l8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.P5, this.f41959j5, this.T3, null, this.f41934h5, true, false, this.f41982l5, z10, i9, 0, this.N3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, C8(), 0L, false, j10, N8(), this.f41870c5);
        y6();
        if (i9 != 0) {
            if (this.O3 == -1) {
                this.O3 = 0;
            }
            this.O3 = arrayList.size() + this.O3;
            Ec(true);
        }
    }

    public final void m7() {
        float f10;
        org.telegram.ui.Components.df dfVar;
        float inputBubbleHeight = this.O.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + W8(org.telegram.ui.Components.w11.f34073c) + this.v.c();
        ak akVar = this.U;
        if (akVar != null && (dfVar = akVar.f26126i0) != null) {
            dfVar.setTranslationY(-inputBubbleHeight);
        }
        tj tjVar = this.E1;
        if (tjVar != null) {
            if (tjVar.g()) {
                f10 = AndroidUtilities.dp(5.0f);
            } else {
                f10 = -inputBubbleHeight;
            }
            tjVar.setTranslationY(f10);
        }
    }

    public final void m8(boolean z10) {
        TLRPC.Chat chat = this.f41890e;
        if (chat != null && this.V7 != null && !ChatObject.isNotInChat(chat) && !this.f41890e.creator) {
            TLRPC.ChatFull chatFull = this.V7;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f42049r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f42049r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.V7.participants.participants.size();
                for (int i9 = 0; i9 < size; i9++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.V7.participants.participants.get(i9);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f42049r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f42049r == 0) {
                getMessagesController().checkChatInviter(this.f41890e.f22380id, false);
            }
        }
    }

    public final void m9() {
        boolean z10;
        Fc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f42028p3, this.P5, this.H6, this.classGuid, 0, this.Z3, this.f41969k3, this.f41980l3, this.f41992m3);
        if (TextUtils.isEmpty(this.f42028p3) && this.f41992m3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f42018o3 = z10;
        this.f41966k0 = z10;
        hc(false);
        Ic();
    }

    public final void ma(TLRPC.User user) {
        boolean z10;
        kh.x3 x3Var = this.f42051r1;
        if (x3Var != null && x3Var.R) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        kh.x3 x3Var2 = this.f42065s1;
        if (x3Var2 != null && x3Var2.R) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new hg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f23577j0) {
            this.f42112vc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f41878d0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f41840a0;
            if (yVar != null) {
                yVar.f(8);
            }
            wr wrVar = this.Z;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f41891e0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f41904f0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f41942i0;
            if (w0Var3 != null && this.G9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f41954j0;
            if (yVar3 != null && this.H9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f41916g0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f41966k0 = true;
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
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f41904f0;
        if (w0Var5 != null) {
            this.Zb = true;
            this.S4 = false;
            w0Var5.z(false);
            this.Zb = false;
        }
        Za(null, user);
        yc(0, true);
    }

    public final void mb(int i9, int i10, String str) {
        this.H7 = i9;
        this.J7 = true;
        this.K7 = 0L;
        this.L7 = str;
        this.O7 = i10;
        this.I7 = true;
    }

    public final void mc() {
        boolean z10;
        int i9;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.W7) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.W7.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.N0 != null) {
            if (z10 && this.P0 == null) {
                ii iiVar = new ii(getParentActivity(), getResourceProvider(), this);
                this.P0 = iiVar;
                g7.g6.b(iiVar, 0.02f, 1.2f);
                this.P0.setOnClickListener(new pe(this, 12));
            }
            ii iiVar2 = this.P0;
            if (iiVar2 != null) {
                if (!z10) {
                    iiVar2.setVisibility(8);
                    return;
                }
                iiVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.W7;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.W7.business_intro.title)) {
                    i9 = R.string.GreetingHowSticker;
                } else {
                    i9 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i9, UserObject.getFirstName(this.f41903f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        g01 g01Var = new g01(formatString.substring(indexOf, indexOf2));
                        if (g01Var.f38404c != -1) {
                            g01Var.f38404c = -1;
                            g01Var.invalidateSelf();
                        }
                        g01Var.a(503316480);
                        g01Var.setBounds(0, 0, g01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(g01Var), indexOf, indexOf2, 33);
                    }
                }
                this.P0.setCustomText(spannableStringBuilder);
                this.P0.setOverrideTextMaxWidth(kh.x3.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.P0.getParent() != null && (!z10 || this.P0.getParent() != this.N0)) {
                    ((ViewGroup) this.P0.getParent()).removeView(this.P0);
                }
                if (z10) {
                    ViewParent parent = this.P0.getParent();
                    LinearLayout linearLayout = this.N0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.P0, g7.e6.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final boolean n() {
        return this.f42011n9;
    }

    public final void n7() {
        float c10;
        if (this.f42077t0 != null) {
            if (this.Ka && this.Z9 == null) {
                c10 = AndroidUtilities.navigationBarHeight;
            } else {
                c10 = this.v.c() + W8(org.telegram.ui.Components.w11.f34073c) + AndroidUtilities.dp(16.0f) + this.f42123wa + this.f42024oc;
            }
            int i9 = (int) this.o9;
            org.telegram.ui.Components.b21 b21Var = this.N1;
            if (b21Var != null) {
                b21Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            f2.x0 x0Var = this.f42064s0;
            boolean z10 = this.f42077t0.T1;
            RecyclerView recyclerView = x0Var.f5561a;
            int i10 = (int) c10;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i9 || paddingBottom != i10) {
                int i11 = paddingTop - i9;
                if (!z10 && i11 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i11 >= 0 || canScrollVertically) && (i11 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new org.telegram.ui.Components.qd(x0Var, i11, 28));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i9, recyclerView.getPaddingRight(), i10);
            }
            pg.d dVar = this.J3;
            if (dVar != null) {
                RectF rectF = dVar.f45857b;
                rectF.set(W8(org.telegram.ui.Components.w11.f34072b), i9 - this.C, 0.0f, c10 - this.f42123wa);
                dVar.f45858c.set(rectF.left, rectF.top, dVar.getMeasuredWidth() - rectF.right, dVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void n8(org.telegram.messenger.MessageObject r61, java.util.ArrayList r62, java.util.ArrayList r63, java.util.ArrayList r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.n8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n9() {
        this.T0.invalidate();
        Iterator it = this.f42140y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void na(long j10) {
        int i9 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.W0.e(true, false);
            } else if (getMessagesController().isCommunity(j10)) {
                showDialog(new nh.j0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new qn(bundle));
                }
            }
        } else if (j10 != getUserConfig().getClientUserId()) {
            if (j10 == a()) {
                this.W0.e(true, false);
                return;
            }
            Bundle g10 = e2.c.g(j10, "user_id");
            if (this.h != null && j10 == this.f41903f.f22527id) {
                g10.putLong("dialog_id", this.P5);
            }
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            TLRPC.User user = this.f41903f;
            if (user != null && user.f22527id == j10) {
                i9 = 1;
            }
            profileActivity.N4(i9);
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
        tL_message.f22401id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void nc() {
        final long j10;
        int i9;
        boolean z10;
        int i10;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.O0 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.f41890e)) {
            if (this.f41890e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.f41890e.f22380id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f41890e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.f41890e.send_paid_messages_stars;
                int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i11 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f22380id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f22380id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(gh.oa.R0(formatString, 1.0f, null));
                if (i11 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.O0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final qn f43467b;

                    {
                        this.f43467b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                qn.a1(j11, this.f43467b);
                                return;
                            default:
                                qn.s0(j11, this.f43467b);
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
                org.telegram.ui.Components.yn ynVar = this.O0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i10 = R.string.MessageLockedPremiumLocked;
                } else {
                    i10 = R.string.MessageLockedPremium;
                }
                ynVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i10, DialogObject.getShortName(this.P5))), LocaleController.getString(R.string.MessagePremiumUnlock), new fh.n(10));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.yn ynVar2 = this.O0;
                if (i9 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                ynVar2.c(z10, false, AndroidUtilities.replaceTags(gh.oa.R0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.P5), LocaleController.formatNumber(this.W7.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final qn f43467b;

                    {
                        this.f43467b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                qn.a1(j10, this.f43467b);
                                return;
                            default:
                                qn.s0(j10, this.f43467b);
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
            if ((o2Var instanceof qn) && ((qn) o2Var).x9()) {
                return false;
            }
        }
        return this.D6;
    }

    @Override
    public final org.telegram.ui.Components.tn o() {
        return this.W0;
    }

    public final void o7() {
        FrameLayout frameLayout = this.M0;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.O.getInputBubbleHeight() + this.v.b() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int o8() {
        int i9;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i10;
        ArrayList arrayList4 = this.f42042q6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.F7);
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        ArrayList arrayList8 = new ArrayList();
        HashSet hashSet = new HashSet();
        int i11 = 0;
        int i12 = 0;
        int i13 = -1;
        for (int i14 = 0; i14 < arrayList4.size(); i14++) {
            MessageObject messageObject = (MessageObject) arrayList4.get(i14);
            int approximateHeightCached = messageObject.getApproximateHeightCached();
            arrayList5.add(Integer.valueOf(approximateHeightCached));
            if (messageObject.isSponsored() || i14 == indexOf) {
                if (i14 == indexOf) {
                    i13 = i11;
                }
                arrayList7.add(Integer.valueOf(i14));
                arrayList6.add(Integer.valueOf(i11));
                arrayList8.add(Integer.valueOf(i12));
            }
            if (messageObject.hasValidGroupIdFast()) {
                if (!hashSet.contains(Long.valueOf(messageObject.getGroupId()))) {
                    hashSet.add(Long.valueOf(messageObject.getGroupId()));
                }
            }
            i12++;
            i11 += approximateHeightCached;
        }
        int size = arrayList7.size();
        if (indexOf >= 0) {
            i9 = 1;
        } else {
            i9 = 0;
        }
        if (size - i9 <= 0) {
            return 0;
        }
        hashSet.clear();
        int i15 = 0;
        while (indexOf >= 0) {
            MessageObject messageObject2 = (MessageObject) arrayList4.get(indexOf);
            int intValue = ((Integer) arrayList5.get(indexOf)).intValue();
            if (messageObject2.hasValidGroupIdFast()) {
                if (!hashSet.contains(Long.valueOf(messageObject2.getGroupId()))) {
                    hashSet.add(Long.valueOf(messageObject2.getGroupId()));
                }
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.F7) {
                    i10 = i15;
                } else {
                    int i16 = -1;
                    int i17 = 0;
                    int i18 = -1;
                    int i19 = -1;
                    int i20 = -1;
                    int i21 = -1;
                    int i22 = -1;
                    while (i17 < arrayList7.size()) {
                        int intValue2 = ((Integer) arrayList7.get(i17)).intValue();
                        int i23 = i15;
                        if (intValue2 >= indexOf && (i18 == -1 || i18 > intValue2)) {
                            i20 = ((Integer) arrayList6.get(i17)).intValue();
                            i19 = ((Integer) arrayList8.get(i17)).intValue();
                            i18 = intValue2;
                        }
                        if (intValue2 <= indexOf && (i16 == -1 || i16 < intValue2)) {
                            i21 = ((Integer) arrayList6.get(i17)).intValue();
                            i22 = ((Integer) arrayList8.get(i17)).intValue();
                            i16 = intValue2;
                        }
                        i17++;
                        i15 = i23;
                    }
                    i10 = i15;
                    int i24 = -1;
                    if (i18 != -1) {
                        if (Math.abs(i18 - indexOf) > this.Fb + 1 && Math.abs(i19 - i10) > this.Fb + 1 && Math.abs(i20 - (intValue + i13)) > AndroidUtilities.displaySize.y) {
                            i24 = -1;
                        }
                    }
                    if (i16 == i24 || (Math.abs(i16 - indexOf) > this.Fb + 1 && Math.abs(i22 - i10) > this.Fb + 1 && Math.abs(i21 - i13) > AndroidUtilities.displaySize.y)) {
                        return indexOf;
                    }
                }
                indexOf--;
                i15 = i10;
            }
            i15--;
            i13 -= intValue;
            if (!messageObject2.isSponsored()) {
            }
            i10 = i15;
            indexOf--;
            i15 = i10;
        }
        hashSet.clear();
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i25 < arrayList4.size()) {
            MessageObject messageObject3 = (MessageObject) arrayList4.get(i25);
            int intValue3 = ((Integer) arrayList5.get(i25)).intValue();
            if (!messageObject3.hasValidGroupIdFast()) {
                i26++;
                i27 += intValue3;
            } else if (!hashSet.contains(Long.valueOf(messageObject3.getGroupId()))) {
                hashSet.add(Long.valueOf(messageObject3.getGroupId()));
                i26++;
            }
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.F7) {
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                arrayList3 = arrayList7;
            } else {
                arrayList = arrayList5;
                arrayList2 = arrayList4;
                int i28 = 0;
                int i29 = -1;
                int i30 = -1;
                int i31 = -1;
                int i32 = -1;
                int i33 = -1;
                int i34 = -1;
                while (i28 < arrayList7.size()) {
                    int intValue4 = ((Integer) arrayList7.get(i28)).intValue();
                    ArrayList arrayList9 = arrayList7;
                    if (intValue4 >= i25 && (i32 == -1 || i32 > intValue4)) {
                        i34 = ((Integer) arrayList6.get(i28)).intValue();
                        i33 = ((Integer) arrayList8.get(i28)).intValue();
                        i32 = intValue4;
                    }
                    if (intValue4 <= i25 && (i29 == -1 || i29 < intValue4)) {
                        i30 = ((Integer) arrayList6.get(i28)).intValue();
                        i31 = ((Integer) arrayList8.get(i28)).intValue();
                        i29 = intValue4;
                    }
                    i28++;
                    arrayList7 = arrayList9;
                }
                arrayList3 = arrayList7;
                int i35 = -1;
                if (i32 != -1) {
                    if (Math.abs(i32 - i25) >= this.Fb + 1 && Math.abs(i33 - i26) >= this.Fb + 1 && Math.abs(i34 - (intValue3 + i27)) > AndroidUtilities.displaySize.y) {
                        i35 = -1;
                    }
                }
                if (i29 == i35 || (Math.abs(i29 - i25) >= this.Fb + 1 && Math.abs(i31 - i26) >= this.Fb + 1 && Math.abs(i30 - i27) > AndroidUtilities.displaySize.y)) {
                    return i25;
                }
            }
            i25++;
            arrayList5 = arrayList;
            arrayList4 = arrayList2;
            arrayList7 = arrayList3;
        }
        return -1;
    }

    public final void o9() {
        if (!this.f42162z9) {
            this.f42162z9 = true;
            im imVar = this.T0;
            if (imVar != null) {
                imVar.invalidate();
            }
            ij ijVar = this.f42077t0;
            if (ijVar != null) {
                ijVar.invalidate();
            }
        }
        UndoView undoView = this.f42093u3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(W8(org.telegram.ui.Components.w11.f34073c) + this.O.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(16.0f));
        }
        v7();
    }

    public final void oa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f41848aa);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().F0(false, false);
            }
            PhotoViewer.t1().f2(arrayList, 0, 0, false, new il(this, createVideoThumbnail, arrayList), this);
            return;
        }
        l8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.P5, this.f41959j5, this.T3, null, this.f41934h5, null, 0, this.f41982l5, true, 0, 0, false, false, null, C8(), 0L, 0L, N8(), this.f41870c5);
        y6();
    }

    public final void ob(View view) {
        View view2 = this.F8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.w0)) {
                ((org.telegram.ui.Cells.w0) view2).setInvalidateWithParent(null);
            }
            this.F8 = view;
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void oc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.oc(boolean):void");
    }

    @Override
    public final void onActivityResultFragment(int i9, int i10, final Intent intent) {
        ih.u2 u2Var;
        org.telegram.ui.Components.jn jnVar;
        String str;
        ih.u2 u2Var2;
        if (i10 == -1) {
            Uri uri = null;
            if (i9 != 0 && i9 != 2) {
                if (i9 == 21 && (u2Var2 = this.F1) != null) {
                    org.telegram.ui.Components.ci ciVar = u2Var2.f30160u0;
                    if (ciVar instanceof qh.p) {
                        qh.p pVar = (qh.p) ciVar;
                        if (intent != null && intent.getData() != null) {
                            qh.o3 o3Var = pVar.f46606r;
                            Uri data = intent.getData();
                            if (data == null) {
                                o3Var.getClass();
                                return;
                            } else if (o3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new ai1(21, o3Var, data));
                                return;
                            } else {
                                return;
                            }
                        }
                        return;
                    }
                }
                if (i9 == 1) {
                    if (intent != null && intent.getData() != null) {
                        ih.u2 u2Var3 = this.F1;
                        if (u2Var3 != null) {
                            org.telegram.ui.Components.ci ciVar2 = u2Var3.f30160u0;
                            if (ciVar2 instanceof qh.p) {
                                qh.p pVar2 = (qh.p) ciVar2;
                                if (intent.getData() != null) {
                                    pVar2.f46606r.e2(intent.getData());
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
                            if (this.f41994m5) {
                                this.f42022o8 = str;
                            } else {
                                oa(null, str);
                            }
                        } else if (this.f41982l5 == null && this.N3 == 1) {
                            org.telegram.ui.Components.y4.M(getParentActivity(), this.P5, new ih.v3(14, this, data2), this.f41848aa);
                        } else {
                            l8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.P5, this.f41959j5, this.T3, this.f41934h5, null, null, null, null, 0, this.f41982l5, true, 0, this.N3, C8());
                        }
                        y6();
                        return;
                    }
                    tb();
                    return;
                } else if (i9 == 21) {
                    if (intent == null) {
                        tb();
                        return;
                    }
                    if (this.f41982l5 == null && this.N3 == 1) {
                        if (intent.getData() != null) {
                            ih.u2 u2Var4 = this.F1;
                            if (u2Var4 != null) {
                                u2Var4.dismiss();
                            }
                            org.telegram.ui.Components.y4.M(getParentActivity(), this.P5, new org.telegram.ui.Components.x4(this) {
                                public final qn f38761b;

                                {
                                    this.f38761b = this;
                                }

                                @Override
                                public final void B(int i11, int i12, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            qn qnVar = this.f38761b;
                                            qnVar.l8(null, null);
                                            qnVar.gb(intent.getData(), z10, i11);
                                            qnVar.y6();
                                            return;
                                        default:
                                            qn qnVar2 = this.f38761b;
                                            qnVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                                                qnVar2.gb(clipData.getItemAt(i13).getUri(), z10, i11);
                                            }
                                            qnVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f41848aa);
                            return;
                        } else if (intent.getClipData() != null) {
                            ih.u2 u2Var5 = this.F1;
                            if (u2Var5 != null) {
                                u2Var5.dismiss();
                            }
                            org.telegram.ui.Components.y4.M(getParentActivity(), this.P5, new org.telegram.ui.Components.x4(this) {
                                public final qn f38761b;

                                {
                                    this.f38761b = this;
                                }

                                @Override
                                public final void B(int i11, int i12, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            qn qnVar = this.f38761b;
                                            qnVar.l8(null, null);
                                            qnVar.gb(intent.getData(), z10, i11);
                                            qnVar.y6();
                                            return;
                                        default:
                                            qn qnVar2 = this.f38761b;
                                            qnVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i13 = 0; i13 < clipData.getItemCount(); i13++) {
                                                qnVar2.gb(clipData.getItemAt(i13).getUri(), z10, i11);
                                            }
                                            qnVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f41848aa);
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
                            for (int i11 = 0; i11 < clipData.getItemCount(); i11++) {
                                gb(clipData.getItemAt(i11).getUri(), true, 0);
                            }
                        } else {
                            tb();
                        }
                    }
                    ih.u2 u2Var6 = this.F1;
                    if (u2Var6 != null) {
                        u2Var6.dismiss();
                    }
                    y6();
                    return;
                } else if (i9 == 28 && (u2Var = this.F1) != null && (jnVar = u2Var.f30123i0) != null) {
                    org.telegram.ui.ActionBar.b6 b6Var = jnVar.f27492a;
                    if (jnVar.f29777g1 != -1 && jnVar.f29775f1 != null) {
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
                            org.telegram.messenger.ll.p(R.string.UnsupportedAttachment, new org.telegram.ui.Components.oc(jnVar.f27493b.container, b6Var), b6Var);
                            return;
                        }
                        jnVar.d0(jnVar.f29777g1, new zg.c(uri));
                        org.telegram.ui.Components.sm smVar = jnVar.f29775f1;
                        if (smVar != null) {
                            smVar.dismiss(true);
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
            ih.u2 u2Var7 = this.F1;
            if (u2Var7 != null) {
                u2Var7.f30114f0.f0(i9, intent, this.R7);
            }
            this.R7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        uk ukVar;
        org.telegram.ui.ActionBar.c2 c2Var;
        org.telegram.ui.Components.ff ffVar;
        org.telegram.ui.Components.df dfVar;
        jm jmVar;
        hg.u uVar;
        org.telegram.ui.Components.gc gcVar = org.telegram.ui.Components.gc.f28729w;
        if (gcVar != null) {
            org.telegram.ui.Components.lb lbVar = gcVar.f28733e;
            if (lbVar instanceof org.telegram.ui.Components.rb) {
                if (z10) {
                    ((org.telegram.ui.Components.rb) lbVar).f();
                    gcVar.b();
                    return false;
                }
                return false;
            }
        }
        d41 d41Var = this.V9;
        if (d41Var != null && !d41Var.X) {
            if (z10) {
                d41Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            hg.v vVar = this.U9;
            if (vVar != null && (uVar = vVar.f10762b) != null && uVar.getReactionsWindow() != null) {
                if (z10) {
                    vVar.f10762b.e();
                    return false;
                }
            } else if (ht.q().E) {
                if (z10) {
                    ht.q().o();
                    return false;
                }
            } else {
                wk wkVar = this.Aa;
                if (wkVar != null && wkVar.f27461s) {
                    if (z10) {
                        wkVar.a(true);
                        return false;
                    }
                } else if (this.f42102uc.f47776f) {
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
                        if (z10 && (jmVar = this.Y8) != null && jmVar.y()) {
                            this.Y8.f(false);
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
                            ak akVar = this.U;
                            if (akVar != null && akVar.s0()) {
                                if (z10) {
                                    this.U.l0(true);
                                    return false;
                                }
                            } else {
                                ak akVar2 = this.U;
                                if (akVar2 != null && akVar2.v()) {
                                    if (z10) {
                                        ak akVar3 = this.U;
                                        mh.c0 c0Var = akVar3.f26120h0;
                                        if (c0Var != null) {
                                            c0Var.setOpened(false);
                                        }
                                        if (!akVar3.i0() && (dfVar = akVar3.f26126i0) != null) {
                                            dfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    ak akVar4 = this.U;
                                    if (akVar4 == null || (ffVar = akVar4.A0) == null || !ffVar.closeCreationLinkDialog(z10)) {
                                        if (this.N3 == 6 && (c2Var = pf.r.d) != null && c2Var.isShowing()) {
                                            if (z10) {
                                                pf.r.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.f41890e) && !this.P3 && this.N1 != null && b() != 0) {
                                            if (z10) {
                                                this.N1.m(0L, this.f41984l7);
                                                return false;
                                            }
                                        } else if (this.N3 == 5 && !"hello".equalsIgnoreCase(this.M3) && !"away".equalsIgnoreCase(this.M3) && (this.f42042q6.isEmpty() || this.Z3 == 0)) {
                                            if (z10) {
                                                Qb();
                                                return false;
                                            }
                                        } else if (this.N3 == 6 && this.U.w()) {
                                            if (z10) {
                                                wb(new gf(this, 19));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f23577j0) {
                                                if (z10) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f42076sc.f47776f) {
                                                if (z10) {
                                                    ta();
                                                }
                                            } else {
                                                if (z10 && (ukVar = this.X2) != null) {
                                                    ukVar.d(false);
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
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f42042q6) != null) {
            for (int i9 = 0; i9 < arrayList.size(); i9++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i9);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.f41890e)))) {
                    org.telegram.ui.Components.i21.u(messageObject, false);
                }
            }
        }
        this.B3 = false;
        l9();
        ArrayList arrayList2 = org.telegram.ui.Components.i21.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        ve.d dVar = this.f42124wb;
        if (dVar != null) {
            dVar.a(false);
            this.f42124wb = null;
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
        if (this.f41849ab) {
            ak akVar = this.U;
            if (akVar != null) {
                akVar.H0();
                ak akVar2 = this.U;
                akVar2.P0 = false;
                org.telegram.ui.Components.uf ufVar = akVar2.Q0;
                if (ufVar != null) {
                    ufVar.u(false);
                }
            }
            this.f41849ab = false;
        }
        if (this.f42051r1 != null) {
            AndroidUtilities.runOnUIThread(new ge(this, 1), 600L);
        }
        if (this.f42006n4 && !this.f42019o4) {
            this.f42019o4 = true;
            org.telegram.ui.Components.gc M = org.telegram.ui.Components.oc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f28737j = 5000;
            M.v = new ge(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        hg.v vVar = this.U9;
        if (vVar != null && vVar.d()) {
            this.U9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j10;
        long j11;
        dj djVar = this.W0;
        if (djVar != null) {
            djVar.getViewTreeObserver().addOnPreDrawListener(new sh(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        A7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C1() || !PhotoViewer.t1().Q1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f41848aa);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i9 = playingMessageObject.type;
                    long j12 = 0;
                    if (i9 != 0) {
                        j10 = this.P5;
                    } else {
                        j10 = 0;
                    }
                    if (i9 != 0) {
                        j11 = this.H6;
                    } else {
                        j11 = 0;
                    }
                    if (i9 != 0) {
                        j12 = b();
                    }
                    if (t12.e2(playingMessageObject, null, null, null, null, null, null, 0, this.Ba, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.t1().f35649h4 = this;
                    }
                    h9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.C1() && PhotoViewer.t1().f35647h2) {
                PhotoViewer t13 = PhotoViewer.t1();
                if (t13.B2.z()) {
                    if (t13.V2) {
                        t13.B2.O(false);
                    }
                    MediaController.getInstance().injectVideoPlayer(t13.B2, t13.P4);
                    t13.B2 = null;
                }
                PhotoViewer.t1().F0(false, true);
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
        bk bkVar = this.S9;
        float f10 = 0.0f;
        if (z10 && this.N9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var instanceof qn) {
                this.f42157z4 = true;
                qn qnVar = (qn) o2Var;
                qnVar.P9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.T0.setSkipBackgroundDrawing(true);
                this.W0.setTranslationY(AndroidUtilities.dp(8.0f));
                this.W0.getAvatarImageView().setAlpha(0.0f);
                this.W0.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.O9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ak akVar = this.U;
                if (akVar != null) {
                    akVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                ek ekVar = this.N;
                if (ekVar != null) {
                    ekVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                ak akVar2 = this.U;
                if (akVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = akVar2.getMeasuredHeight();
                }
                ek ekVar2 = this.N;
                if (ekVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = ekVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                ak akVar3 = qnVar.U;
                if (akVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = akVar3.getMeasuredHeight();
                }
                ek ekVar3 = this.N;
                if (ekVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = ekVar3.getMeasuredHeight();
                }
                this.K9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new f2.g(5, this, qnVar));
                jc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.R9 = animatorSet;
                animatorSet.addListener(new kh.o5(this, qnVar, runnable));
                this.R9.setDuration(300L);
                this.R9.setInterpolator(org.telegram.ui.Components.gr.f28844f);
                this.R9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(bkVar, 200L);
                return this.R9;
            }
        }
        if (this.f41914fa && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (o2Var2 instanceof we1) {
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
                    f10 = 1.0f;
                }
                this.f41939ha = f10;
                ofFloat.addUpdateListener(new qi(0, this));
                this.f41926ga = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                im imVar = this.T0;
                if (imVar != null) {
                    imVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.R9 = animatorSet2;
                animatorSet2.addListener(new si(this, z10, runnable));
                this.R9.setDuration(150L);
                this.R9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(bkVar, 200L);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.wt0 wt0Var;
        super.onFragmentDestroy();
        pg.d dVar = this.J3;
        if (dVar != null) {
            LongSparseArray longSparseArray = dVar.f45864w;
            int size = longSparseArray.size();
            for (int i9 = 0; i9 < size; i9++) {
                pg.c cVar = (pg.c) longSparseArray.valueAt(i9);
                if (cVar.f45851i) {
                    dVar.v.add(cVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                d5.a.n("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            dVar.a();
        }
        ak akVar = this.U;
        if (akVar != null) {
            akVar.A0();
        }
        dj djVar = this.W0;
        if (djVar != null && (wt0Var = djVar.V) != null) {
            wt0Var.b(djVar.C);
        }
        tj tjVar = this.E1;
        if (tjVar != null && tjVar.getAdapter() != null) {
            this.E1.getAdapter().P();
        }
        ih.u2 u2Var = this.F1;
        if (u2Var != null) {
            u2Var.dismissInternal();
        }
        ht q10 = ht.q();
        if (q10.f38923l == this.f41925g9) {
            q10.W = null;
            q10.f38910a0 = null;
            q10.Y = null;
            q10.f38923l = null;
            q10.f38914c0 = null;
            q10.u();
        }
        getNotificationCenter().onAnimationFinish(this.B9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.C9);
        getNotificationCenter().onAnimationFinish(this.D9);
        getNotificationCenter().onAnimationFinish(this.E9);
        l9();
        ge geVar = this.H5;
        if (geVar != null) {
            AndroidUtilities.cancelRunOnUIThread(geVar);
            this.H5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f41964ja);
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
        if (this.f41903f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.A3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f41903f != null) {
            getMessagesController().cancelLoadFullUser(this.f41903f.f22527id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        ih.u2 u2Var2 = this.F1;
        if (u2Var2 != null) {
            u2Var2.v1();
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.f41890e)) {
            getMessagesController().startShortPoll(this.f41890e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.V7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.V7.linked_chat_id)), this.classGuid, true);
            }
        }
        jm jmVar = this.Y8;
        if (jmVar != null) {
            jmVar.f(false);
        }
        kj kjVar = this.f42090u0;
        if (kjVar != null) {
            kjVar.N();
        }
        jk jkVar = this.f42074sa;
        if (jkVar != null) {
            jkVar.b();
        }
        this.X9 = null;
        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Kc ? 1 : 0);
            org.telegram.ui.ActionBar.b5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i10 = 0;
                while (i10 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.f9) parentLayout2.getPulledDialogs().get(i10)).f28346b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i10);
                        i10--;
                    }
                    i10++;
                }
            }
        }
        Kc = false;
        ve.d dVar2 = this.f42124wb;
        if (dVar2 != null) {
            dVar2.a(false);
            this.f42124wb = null;
        }
        this.f41875ca.onFragmentDestroy();
        j01 j01Var = this.Y7;
        if (j01Var != null) {
            j01Var.b(true);
            this.Y7 = null;
        }
        gh.p5 p5Var = this.f42000mc;
        if (p5Var != null) {
            p5Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f42000mc);
            this.f42000mc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f41927gb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f42072s8, null, null, false);
        }
        gh.p5 p5Var = this.f42000mc;
        if (p5Var != null) {
            p5Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f42000mc);
            this.f42000mc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i9, String[] strArr, int[] iArr) {
        ih.u2 u2Var;
        org.telegram.ui.Components.xk xkVar;
        ih.u2 u2Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ki kiVar;
        ak akVar = this.U;
        boolean z12 = false;
        if (akVar != null && i9 == 2 && akVar.f26104e3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(akVar.M).sendCurrentLocation(akVar.f26097d3, akVar.f26104e3);
            }
            akVar.f26104e3 = null;
            akVar.f26097d3 = null;
        }
        tj tjVar = this.E1;
        if (tjVar != null && tjVar.getAdapter() != null) {
            of.f1 adapter = this.E1.getAdapter();
            if (i9 == 2) {
                TLRPC.User user = adapter.f19343s0;
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
        if (i9 == 4) {
            ih.u2 u2Var3 = this.F1;
            if (u2Var3 != null) {
                u2Var3.f30114f0.X();
            }
            org.telegram.ui.Components.cp cpVar = this.X9;
            if (cpVar != null && (kiVar = cpVar.U) != null) {
                kiVar.f30114f0.X();
            }
        } else if ((i9 == 5 || i9 == 30) && (u2Var = this.F1) != null) {
            if (i9 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                u2Var.D1();
            } else if (i9 == 30 && (xkVar = u2Var.f30129k0) != null && u2Var.f30160u0 == xkVar && u2Var.isShowing()) {
                u2Var.f30129k0.X();
            }
        } else if ((i9 == 17 || i9 == 18) && (u2Var2 = this.F1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var2.f30114f0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.T(z12);
            this.F1.f30114f0.X();
        } else if (i9 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41848aa);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new mh(this));
                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i9 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(0);
        } else if (i9 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(2);
        } else if (((i9 != 101 && i9 != 102) || this.f41903f == null) && (i9 != 103 || this.f41890e == null)) {
        } else {
            int i10 = 0;
            while (true) {
                if (i10 < iArr.length) {
                    if (iArr[i10] != 0) {
                        z10 = false;
                        break;
                    }
                    i10++;
                } else {
                    z10 = true;
                    break;
                }
            }
            if (iArr.length > 0 && z10) {
                if (i9 == 103) {
                    org.telegram.ui.Components.voip.e2.m(this.f41890e, null, this.U7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f41903f;
                if (i9 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.W7;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.e2.n(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f41903f.f22527id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.e2.i(getParentActivity(), null, i9);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        ak akVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.o9[] o9VarArr;
        fh.d2 d2Var;
        super.onResume();
        d7();
        this.A9 = System.currentTimeMillis();
        if (this.f42011n9 && getSendMessagesHelper().getImportingHistory(this.P5) != null) {
            org.telegram.ui.Components.g40 g40Var = new org.telegram.ui.Components.g40(getParentActivity(), null, this, this.f41848aa);
            g40Var.setOnHideListener(new zf(this, 8));
            showDialog(g40Var);
            this.f42011n9 = false;
        }
        H6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        W6();
        ih.u2 u2Var = this.F1;
        if (u2Var != null) {
            u2Var.y1();
        }
        im imVar = this.T0;
        boolean z12 = true;
        if (imVar != null) {
            org.telegram.ui.Components.q71 q71Var = imVar.v;
            if (q71Var != null) {
                q71Var.c(true);
            }
            imVar.B = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new ge(this, 24), 1000L);
        }
        x8 x8Var = new x8(this, 2);
        this.Vb = x8Var;
        setBulletinDelegate(x8Var);
        G6(false);
        TLRPC.PhotoSize photoSize = this.f42069s5;
        if (photoSize != null && (d2Var = this.W) != null) {
            ((org.telegram.ui.Components.go[]) d2Var.f6412b)[0].f28825f.k(ImageLocation.getForObject(photoSize, this.f42095u5), "50_50", ImageLocation.getForObject(this.f42082t5, this.f42095u5), "50_50_b", this.f42041q5, null, this.f41959j5, this.f42055r5);
        }
        if (this.f42146y5 != null && (o9VarArr = this.f42129x2) != null) {
            o9VarArr[0].k(ImageLocation.getForObject(this.f42146y5, this.A5), "50_50", ImageLocation.getForObject(this.f42158z5, this.A5), "50_50_b", this.f42107v5, null, (MessageObject) this.F4.get(Integer.valueOf(this.H4)), this.f42119w5);
            o9VarArr[0].setHasBlur(this.f42132x5);
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
                if (this.f42077t0 != null) {
                    int i9 = this.P7;
                    if (i9 == -9000) {
                        i9 = K8(messageObject);
                    } else if (i9 == -10000) {
                        i9 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f42103v0.i1(this.f42042q6.indexOf(this.G7) + this.f42114w0.F, i9, z11);
                    }
                    z11 = false;
                    this.f42103v0.i1(this.f42042q6.indexOf(this.G7) + this.f42114w0.F, i9, z11);
                }
            } else {
                O9(false);
            }
            this.O5 = false;
            this.M5 = false;
            this.G7 = null;
        }
        this.f41994m5 = false;
        this.f42007n5 = false;
        a7(false);
        if (this.f42020o5) {
            this.f42020o5 = false;
            bm bmVar = this.f42114w0;
            if (bmVar != null) {
                bmVar.O(false);
            }
        }
        dj djVar = this.W0;
        if (djVar != null) {
            djVar.getViewTreeObserver().addOnPreDrawListener(new sh(this, 0));
        }
        A6(false, false);
        if (this.U != null && this.N3 == 0 && this.f41901ea != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.P5 && (arrayList2 = this.f41901ea.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new w70(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f41901ea.entities;
            }
            CharSequence r10 = ChatActivityEnterView.r(arrayList, this.f41901ea.message, this.U.getEditField().getPaint().getFontMetricsInt());
            if (r10 != null && r10.length() > 0 && r10.charAt(0) == '@') {
                r10 = TextUtils.concat(" ", r10);
            }
            this.U.f1(r10, true);
            this.f41901ea = null;
        }
        fk fkVar = this.K0;
        if (fkVar != null && fkVar.getVisibility() != 0 && !this.actionBar.f23577j0 && this.N3 != 7 && !org.telegram.ui.ActionBar.o2.hasSheets(this)) {
            this.U.setFieldFocused(true);
        }
        ak akVar2 = this.U;
        if (akVar2 != null) {
            akVar2.D0();
        }
        if (this.f41903f != null) {
            this.f41985l8 = System.currentTimeMillis();
            this.f41997m8 = 0L;
        }
        if (this.f42022o8 != null) {
            AndroidUtilities.runOnUIThread(new ge(this, 3));
        }
        if (this.f42077t0 != null && ((akVar = this.U) == null || !akVar.q0())) {
            this.f42077t0.setOnItemLongClickListener(this.Fa);
            this.f42077t0.setOnItemClickListener(this.Ga);
            this.f42077t0.setLongClickable(true);
        }
        org.telegram.ui.Components.m41.h = false;
        TLRPC.User user = this.f41903f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.m41.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.V7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i10 = 0;
                while (true) {
                    if (i10 < this.V7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.V7.participants.participants.get(i10).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.m41.h = true;
                            break;
                        }
                        i10++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                org.telegram.ui.Components.m41.h = (chatFull.bot_info.isEmpty() || (chat = this.f41890e) == null || !chat.megagroup) ? false : false;
            }
        }
        Nc(false);
        Ib();
        if (this.J9 != 0.0f) {
            this.J9 = 0.0f;
            this.f42077t0.invalidate();
        }
        this.A3.attach();
        gh.p5 p5Var = this.f42000mc;
        if (p5Var != null) {
            p5Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.hd hdVar;
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
            iArr = UserObject.isUserSelf(this.f41903f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            ak akVar = this.U;
            if (akVar != null && (hdVar = akVar.N1) != null) {
                AndroidUtilities.cancelRunOnUIThread(hdVar);
                akVar.N1 = null;
            }
        }
        d7();
        this.B9 = getNotificationCenter().setAnimationInProgress(this.B9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f41882d4) {
            if (this.f41903f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f41903f.f22527id));
                if (user != null) {
                    this.f41903f = user;
                } else {
                    return;
                }
            } else if (this.f41890e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f41890e.f22380id));
                if (chat != null) {
                    this.f41890e = chat;
                } else {
                    return;
                }
            }
            dj djVar = this.W0;
            if (djVar != null) {
                djVar.b();
            }
        }
    }

    public final void p7() {
        int i9;
        float f10 = this.f42125wc.f47775e;
        org.telegram.ui.Components.n30 n30Var = this.f42026p1;
        int i10 = 8;
        if (n30Var != null) {
            n30Var.setAlpha(f10);
            org.telegram.ui.Components.n30 n30Var2 = this.f42026p1;
            if (f10 > 0.0f) {
                i9 = 0;
            } else {
                i9 = 8;
            }
            n30Var2.setVisibility(i9);
        }
        gh.f1 f1Var = this.H3;
        if (f1Var != null) {
            float f11 = 1.0f - f10;
            f1Var.setAlpha(f11);
            gh.f1 f1Var2 = this.H3;
            if (f11 > 0.0f) {
                i10 = 0;
            }
            f1Var2.setVisibility(i10);
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
            xg.i iVar = this.v;
            float b10 = iVar.b();
            td.k kVar = iVar.f49442b;
            int max = (int) Math.max(0.0f, (b10 * kVar.f47800a) - AndroidUtilities.dp(29.0f));
            im imVar = this.T0;
            fh.l2 l2Var = imVar.H;
            Rect rect2 = this.Cc;
            if (l2Var != null) {
                rect2.set(0, 0, imVar.getMeasuredWidth(), this.T0.getMeasuredHeight() - max);
                this.T0.H.setClipBounds(rect2);
            }
            if (this.f42077t0 != null) {
                rect2.set(0, 0, this.T0.getMeasuredWidth(), this.T0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f42077t0.getTop());
                ij ijVar = this.f42077t0;
                if (ijVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                ijVar.setClipBounds(rect);
            }
            if (this.T != null) {
                rect2.set(0, 0, this.T0.getMeasuredWidth(), this.T0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(iVar.v, iVar.b() * kVar.f47800a) - AndroidUtilities.dp(29.0f))));
                rg.f fVar = this.T;
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

    public final void pb(ArrayList arrayList, TLRPC.Chat chat, int i9, int i10, int i11, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.Y3 = tL_forumTopic;
        this.W3 = arrayList;
        MessageObject messageObject = (MessageObject) j3.r0.j(1, arrayList);
        this.T3 = messageObject;
        this.f41959j5 = messageObject;
        this.f41920g4 = i10;
        this.f41933h4 = i11;
        this.f41946i4 = Math.max(1, i10);
        this.Z3 = this.T3.getId();
        this.f41842a4 = i9;
        this.f41856b4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41882d4 = z10;
        MessageObject messageObject2 = this.f41959j5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41869c4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        zc();
        Qc(false);
        hc(false);
    }

    public final void pc() {
        MessageObject messageObject;
        if (this.f41903f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                ij ijVar = this.f42077t0;
                if (ijVar != null) {
                    int childCount = ijVar.getChildCount();
                    for (int i9 = 0; i9 < childCount; i9++) {
                        View childAt = this.f42077t0.getChildAt(i9);
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f41985l8, this.f41997m8, this.f41903f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f10 = SecretMediaViewer.f();
            MessageObject messageObject2 = f10.f36125d0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f10.G, f10.H, this.f41903f, null, null, messageObject2.getId());
            }
        }
    }

    public final void q7() {
        if (this.T0 == null) {
            return;
        }
        this.f42024oc = C6(false);
        this.f42035pc = C6(true);
        this.O.setInputBubbleHeight(this.f42024oc);
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
    }

    public final org.telegram.ui.Cells.a0 q8(int i9, boolean z10) {
        MessageObject messageObject;
        ij ijVar = this.f42077t0;
        if (ijVar != null) {
            int childCount = ijVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f42077t0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i9) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.o9 - this.f42045q9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f42077t0.getMeasuredHeight() - this.f42123wa) {
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

    public final void q9(int i9) {
        qn qnVar = this.Z9;
        if (qnVar != null) {
            qnVar.q9(i9);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.B != null) {
            ff.f0 f0Var = this.f42165zc;
            if (f0Var.f6167c == 0) {
                f0Var.invalidate();
            }
            f0Var.f6167c = i9 | f0Var.f6167c;
        }
    }

    public final void qa(long j10, boolean z10) {
        if (this.N1 != null && UserObject.isBotForum(this.f41903f)) {
            this.N1.setAllTopicsHidden(true);
        }
        this.I5.put(j10, 1);
        Q7();
        UndoView undoView = this.f42093u3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.P5, 0, new gh.ua(this, j10, z10, 6), new bg.e1(this, j10, 4));
        this.f42114w0.O(false);
    }

    public final void qb() {
        AndroidUtilities.shakeViewSpring(this.f42077t0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        ak akVar = this.U;
        for (int i9 = 0; i9 < akVar.getChildCount(); i9++) {
            AndroidUtilities.shakeViewSpring(akVar.getChildAt(i9), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i10), 5.0f);
        }
    }

    public final void qc(MessageObject messageObject, boolean z10) {
        if (this.f42114w0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new gh.u5(this, messageObject, z10, 9));
    }

    @Override
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i9, final int i10, final boolean z11, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.f42062rc.a(false, true);
        MessageObject messageObject = this.f41982l5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.f41982l5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f41870c5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.f41982l5.messageOwner.suggested_post);
            }
            if (!gh.v7.U(this.currentAccount, messageSuggestionParams.amount)) {
                Tb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            ge geVar = new ge(this, 21);
            this.f41996m7 = geVar;
            AndroidUtilities.runOnUIThread(geVar, 3000L);
        }
        l8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.y4.b0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l10 = (Long) obj;
                qn qnVar = qn.this;
                MessageObject messageObject2 = qnVar.f41982l5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i11 = i9;
                int i12 = i10;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = qnVar.f41870c5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(qnVar.f41982l5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(qnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, qnVar.P5, qnVar.f41982l5, qnVar.T3, null, qnVar.f41934h5, photoEntry2.entities, photoEntry2.ttl, null, z12, i11, i12, z13, photoEntry2.hasSpoiler, photoEntry2.caption, qnVar.C8(), photoEntry2.effectId, l10.longValue(), qnVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, qnVar.P5, qnVar.f41982l5, qnVar.T3, null, qnVar.f41934h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i11, i12, 0, z13, photoEntry2.caption, qnVar.C8(), photoEntry2.effectId, l10.longValue(), qnVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, qnVar.P5, qnVar.f41982l5, qnVar.T3, null, qnVar.f41934h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i11, i12, 0, z13, photoEntry2.caption, qnVar.C8(), photoEntry2.effectId, l10.longValue(), qnVar.N8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(qnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, qnVar.P5, qnVar.f41959j5, qnVar.T3, null, qnVar.f41934h5, photoEntry2.entities, photoEntry2.ttl, qnVar.f41982l5, z12, i11, i12, z13, photoEntry2.hasSpoiler, photoEntry2.caption, qnVar.C8(), photoEntry2.effectId, l10.longValue(), qnVar.N8(), qnVar.f41870c5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, qnVar.P5, qnVar.f41959j5, qnVar.T3, null, qnVar.f41934h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, qnVar.f41982l5, videoEditedInfo2, z12, i11, i12, 0, z13, photoEntry2.caption, qnVar.C8(), photoEntry2.effectId, l10.longValue(), qnVar.N8(), qnVar.f41870c5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, qnVar.P5, qnVar.f41959j5, qnVar.T3, null, qnVar.f41934h5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, qnVar.f41982l5, videoEditedInfo2, z12, i11, i12, 0, z13, photoEntry2.caption, qnVar.C8(), photoEntry2.effectId, l10.longValue(), qnVar.N8(), qnVar.f41870c5);
                }
                qnVar.y6();
            }
        }, j10);
    }

    public final void r7() {
        int i9;
        qn qnVar = this.Z9;
        if (qnVar != null) {
            qnVar.r7();
        }
        int i10 = AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i10 + ((int) V8(AndroidUtilities.dp(7.0f)));
        mk mkVar = this.f41967k1;
        if (mkVar != null) {
            i9 = AndroidUtilities.dp(mkVar.A * 35.0f);
        } else {
            i9 = 0;
        }
        int dp2 = AndroidUtilities.dp(z8() * 43.0f) + dp + i9;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.c());
        gh.f1 f1Var = this.H3;
        if (f1Var != null) {
            f1Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.n30 n30Var = this.f42026p1;
        if (n30Var != null) {
            n30Var.f31010e.setPadding(0, dp2, 0, dp3);
            n30Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        pg.e eVar = this.G3;
        if (eVar != null) {
            rg.f fVar = eVar.f45867a;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.e00 e00Var = this.Y1;
        if (e00Var != null) {
            e00Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.gw0 gw0Var = this.Z1;
        if (gw0Var != null) {
            gw0Var.f28882a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final void r8() {
        if (this.f41923g7) {
            return;
        }
        this.f41923g7 = true;
        getMessagesController().checkSensitive(this, this.P5, new ge(this, 26), new gf(this, 19));
    }

    public final void r9() {
        this.f42012na = true;
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

    public final void rb(MessageObject messageObject, int i9) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41848aa);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        TLRPC.User user = this.f41903f;
        if (user != null) {
            if (user.bot) {
                c2Var.P = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i10 = R.string.AreYouSureShareMyContactInfoUser;
                String g10 = org.telegram.messenger.ll.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, ne.b.c());
                TLRPC.User user2 = this.f41903f;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i10, g10, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            c2Var.P = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new c3.e(this, i9, messageObject, 5));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(c2Var);
    }

    public final void rc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.f42114w0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f42083t6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                kj kjVar = this.f42090u0;
                if (kjVar != null) {
                    kjVar.V(groupedMessages);
                }
                for (int i9 = 0; i9 < groupedMessages.messages.size(); i9++) {
                    groupedMessages.messages.get(i9).forceUpdate = true;
                    if (z10) {
                        groupedMessages.messages.get(i9).reactionsChanged = true;
                    }
                }
                this.f42114w0.O(true);
                return;
            }
            MessageObject messageObject3 = (MessageObject) this.f41972k6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.f42114w0.J) {
                a0.h hVar = this.Va;
                if (hVar != null) {
                    messageObject2 = (MessageObject) hVar.f(messageObject.getId());
                } else {
                    messageObject2 = null;
                }
                int indexOf = this.f42114w0.L.indexOf(messageObject2);
                if (messageObject2 != null && z10) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                }
                if (indexOf >= 0) {
                    bm bmVar = this.f42114w0;
                    bmVar.m(bmVar.F + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f42042q6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                bm bmVar2 = this.f42114w0;
                bmVar2.m(bmVar2.F + indexOf2);
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
            SparseArray sparseArray = this.f41995m6;
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
        int i9;
        float f10 = (1.0f - this.f42102uc.f47775e) * (1.0f - this.f42076sc.f47775e);
        this.f41905f1.setTranslationX((1.0f - f10) * AndroidUtilities.dp(80.0f));
        this.f41905f1.setAlpha(f10);
        rg.g gVar = this.f41905f1;
        if (f10 > 0.0f) {
            i9 = 0;
        } else {
            i9 = 8;
        }
        gVar.setVisibility(i9);
    }

    public final boolean s8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f42077t0.getChildCount();
        HashMap hashMap = null;
        int i9 = 0;
        while (true) {
            z10 = true;
            if (i9 >= childCount) {
                break;
            }
            View childAt = this.f42077t0.getChildAt(i9);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (currentMessagesGroup = ((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f42042q6.indexOf((MessageObject) j3.r0.j(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        bm bmVar = this.f42114w0;
                        bmVar.q(indexOf + bmVar.F, currentMessagesGroup.messages.size());
                        this.f42077t0.setItemAnimator(null);
                    }
                }
            }
            i9++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            org.telegram.ui.Cells.j2.v(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && !b5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.h2(z10));
        return false;
    }

    public final void s9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f41903f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f42042q6.isEmpty();
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
        ak akVar = this.U;
        if (akVar != null && akVar.v0()) {
            return true;
        }
        ArrayList arrayList2 = this.f42042q6;
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
        gf gfVar = this.f41999ma;
        if (gfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(gfVar);
        }
        ak akVar = this.U;
        if (akVar != null && this.T0 != null && akVar.getAdjustPanLayoutHelper() != null && !this.U.getAdjustPanLayoutHelper().f23718f) {
            this.f41987la = this.T0.getKeyboardHeight();
        } else {
            this.f41987la = -1;
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
        if (v9() && this.f41959j5 == null && this.f41982l5 == null) {
            if (this.N3 != 8 && v9() && this.f41890e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f41890e.f22380id, 1L);
                if (this.N3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.f41890e, findTopic)) {
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
        int i9;
        if (this.h != null) {
            return;
        }
        ij ijVar = this.f42077t0;
        tj tjVar = this.E1;
        if ((tjVar != null && tjVar.E) || ((o1Var = this.M8) != null && o1Var.isShowing())) {
            i9 = 4;
        } else {
            i9 = 0;
        }
        ijVar.setImportantForAccessibility(i9);
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i9;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.z n10 = kVar.n();
            if (this.inMenuMode) {
                i9 = 8;
            } else {
                i9 = 0;
            }
            n10.setVisibility(i9);
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
        float f10;
        float f11;
        ak akVar;
        int i9;
        float f12;
        super.setInPreviewMode(z10);
        int i10 = 8;
        boolean z13 = true;
        if (this.f41903f != null && this.f41954j0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f41903f.f22527id);
            if (userFull != null && userFull.phone_calls_available) {
                this.H9 = !this.inPreviewMode;
                this.f41954j0.f(0);
            } else {
                this.H9 = false;
                this.f41954j0.f(8);
            }
        }
        dj djVar = this.W0;
        float f13 = 0.0f;
        if (djVar != null) {
            djVar.setOccupyStatusBar(!z10);
            dj djVar2 = this.W0;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            djVar2.setLayoutParams(g7.e6.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        ak akVar2 = this.U;
        if (akVar2 != null) {
            if (!z10) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            akVar2.setVisibility(i9);
        }
        org.telegram.ui.Components.ux0 ux0Var = this.Z0;
        if (ux0Var != null) {
            if (this.V4 && !z10 && ((akVar = this.U) == null || !akVar.f26190u3)) {
                i10 = 0;
            }
            ux0Var.setVisibility(i10);
        }
        tj tjVar = this.E1;
        if (tjVar != null) {
            ViewPropertyAnimator animate = tjVar.animate();
            if (!this.U.f26190u3 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.gr.f28844f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                h2Var = new org.telegram.ui.ActionBar.h2(false);
            } else {
                h2Var = null;
            }
            kVar.setBackButtonDrawable(h2Var);
            org.telegram.ui.ActionBar.w0 w0Var = this.f41878d0;
            if (w0Var != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.y yVar = this.f41840a0;
            if (yVar != null) {
                if (!z10) {
                    f13 = 1.0f;
                }
                yVar.f23961i = f13;
                org.telegram.ui.ActionBar.w0 w0Var2 = yVar.f23965m;
                if (w0Var2 != null) {
                    w0Var2.setAlpha(f13);
                }
            }
        }
        ij ijVar = this.f42077t0;
        if (ijVar != null) {
            int childCount = ijVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f42077t0.getChildAt(i11);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.t1;
                if (z14) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i12 = this.f41935h6 - 1;
                        this.f41935h6 = i12;
                        if (i12 <= 0) {
                            this.f41935h6 = 0;
                            this.f41948i6 = true;
                            Kb(false);
                        } else {
                            this.f41905f1.c(2, i12, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.f41890e)) {
                            j10 = this.f41890e.f22380id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j10, this.P5);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        t1Var.setHighlighted(false);
                        t1Var.O3();
                    }
                }
            }
            this.f42077t0.setItemAnimator(null);
        }
        hc(false);
        Kc();
        vj vjVar = this.T1;
        if (vjVar != null) {
            if (!z10 && !this.Ka) {
                z12 = true;
            } else {
                z12 = false;
            }
            vjVar.setEnabled(z12);
        }
        vj vjVar2 = this.V1;
        if (vjVar2 != null) {
            if (!z10 && !this.Ka) {
                z11 = true;
            } else {
                z11 = false;
            }
            vjVar2.setEnabled(z11);
        }
        yk ykVar = this.f42079t2;
        if (ykVar != null) {
            ykVar.setEnabled(!isInPreviewMode());
        }
        im imVar = this.T0;
        if (imVar != null) {
            imVar.setOccupyStatusBar((this.inBubbleMode || this.Ka || this.inPreviewMode) ? false : false);
        }
    }

    public final void t6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.t6():void");
    }

    public final void t7() {
        qn qnVar = this.Z9;
        if (qnVar != null) {
            qnVar.t7();
        }
        float V8 = V8(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.N1 != null) {
            V8 += W8(org.telegram.ui.Components.w11.f34071a);
        }
        if (this.f41967k1 != null) {
            V8 += AndroidUtilities.dp(35.0f) * this.f41967k1.A;
        }
        this.T.setFadeZoneTop((int) ((z8() * AndroidUtilities.dp(43.0f)) + V8));
    }

    public final void t8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i9, long j10) {
        boolean z13;
        if (!arrayList.isEmpty() && f7()) {
            boolean z14 = false;
            if (i9 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.N3 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.f41975k9 = true;
                bm bmVar = this.f42114w0;
                if (bmVar != null) {
                    bmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.P5, z10, z11, z12, i9, 0, this.T3, -1, j10, N8(), this.f41870c5);
            org.telegram.ui.Components.y4.t0(sendMessage, this, this.f41848aa);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new gf(this, 24));
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
        org.telegram.ui.Cells.t1 t1Var;
        this.f42076sc.a(false, true);
        yg.c cVar = this.yc;
        if (cVar != null && (t1Var = cVar.f50213n) != null && t1Var.getDelegate() != null) {
            cVar.f50213n.getDelegate().t1(cVar.f50213n, false);
        }
        ak akVar = this.U;
        if (akVar != null) {
            akVar.V0(true, true, false);
            this.U.P4 = null;
        }
    }

    public final void tb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.oc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f41848aa).j();
    }

    public final void tc(ArrayList arrayList, boolean z10) {
        for (int i9 = 0; i9 < arrayList.size(); i9++) {
            this.f42114w0.R((MessageObject) arrayList.get(i9), false, z10);
        }
    }

    public final void u6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.h hVar = this.f42070s6;
            ArrayList arrayList = (ArrayList) hVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.l0.j(pollId, hVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void u7() {
        if (this.I0 != null) {
            this.I0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - z8()) * (1.0f - this.f42102uc.f47775e) * R8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final int u8() {
        return this.N3;
    }

    public final void ua(org.telegram.ui.Cells.t1 t1Var) {
        yg.c cVar;
        if (this.f42076sc.f47776f && (cVar = this.yc) != null && cVar.f50213n == t1Var) {
            Editable text = cVar.f50208a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(t1Var.getMessageObject(), text, this.yc.getAttachedMedia());
                ta();
                return;
            }
            AndroidUtilities.shakeView(this.yc.f50208a);
        }
    }

    public final void ub(org.telegram.ui.Cells.t1 t1Var) {
        if (getParentActivity() != null && t1Var != null && t1Var.f25454kb != null && t1Var.getPrimaryMessageObject() != null && t1Var.getPrimaryMessageObject().messageOwner != null && t1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Ta) {
                this.Ta = true;
                if (this.f42104v1 != null) {
                    return;
                }
                kh.x3 x3Var = new kh.x3(getParentActivity(), 3);
                x3Var.q(true);
                x3Var.G = Layout.Alignment.ALIGN_NORMAL;
                x3Var.d = -1L;
                x3Var.P = true;
                x3Var.f16347e = true;
                x3Var.i();
                x3Var.r(8.0f);
                this.f42104v1 = x3Var;
                x3Var.t(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                kh.x3 x3Var2 = this.f42104v1;
                x3Var2.h = kh.x3.a(x3Var2.getText(), this.f42104v1.getTextPaint());
                this.T0.addView(this.f42104v1, g7.e6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.T0.post(new rd(4, this, t1Var));
            }
        }
    }

    public final void uc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.uc():void");
    }

    @Override
    public final boolean v(final org.telegram.ui.dy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.we1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.v(org.telegram.ui.dy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.we1):boolean");
    }

    public final void v6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.g9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f41890e, this.f41903f, null, this.P5, this.f42060ra, this.f42046qa);
    }

    public final void v7() {
        float f10 = this.f42073s9;
        mk mkVar = this.f41967k1;
        if (mkVar != null) {
            mkVar.setTranslationY(f10);
            f10 += AndroidUtilities.dp(35.0f) * this.f41967k1.A;
        }
        yj yjVar = this.l1;
        if (yjVar != null) {
            yjVar.setTranslationY(f10);
        }
        float z82 = (z8() * AndroidUtilities.dp(43.0f)) + f10;
        org.telegram.ui.Components.b21 b21Var = this.N1;
        org.telegram.ui.Components.w11 w11Var = org.telegram.ui.Components.w11.f34071a;
        if (b21Var != null) {
            b21Var.setSideMenuBackgroundMarginTop((z8() * V8(AndroidUtilities.dp(7.0f))) + z82);
            float W8 = W8(w11Var);
            float b10 = ff.m0.b(this.f42102uc.f47775e);
            float z83 = z8();
            z82 += ff.m0.b(Math.min(g7.n.a(ff.m0.b(b10), 0.0f, 1.0f), g7.n.a(ff.m0.b(z83), 0.0f, 1.0f))) * W8;
        }
        org.telegram.ui.Components.sg sgVar = this.I0;
        if (sgVar != null) {
            sgVar.setTranslationY((z82 - AndroidUtilities.dp(5.0f)) - (z8() * W8(w11Var)));
        }
    }

    public final TLRPC.ChatFull v8() {
        return this.V7;
    }

    public final boolean v9() {
        if (!ChatObject.isForum(this.f41890e) || this.f41882d4) {
            if (ChatObject.isMonoForum(this.f41890e) && b() == 0 && !this.P3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void va(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f10, float f11) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        hg.r0 d = hg.r0.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            messageObject = ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        ab(a0Var, messageObject2, null, null, f10, f11, d, false, false, false, false);
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
            boolean z12 = this.f42114w0.J;
            if (z12) {
                MessageObject messageObject3 = (MessageObject) this.f41972k6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f41992m3 != null) {
                kc(false);
            }
        }
        if (this.f42114w0.J && !messageObject2.hasReaction(this.f41992m3)) {
            MessageObject.GroupedMessages X8 = X8(messageObject2);
            if (X8 != null) {
                for (int i9 = 0; i9 < X8.messages.size(); i9++) {
                    getMediaDataController().removeMessageFromResults(X8.messages.get(i9).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            of.j1 j1Var = this.I3;
            if (j1Var != null) {
                j1Var.l();
            }
            kc(true);
        }
    }

    public final void vb(boolean z10, boolean z11) {
        int i9;
        float f10;
        float f11;
        int i10;
        int i11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
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
            float f17 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.D0 = animatorSet2;
                if (z10) {
                    this.C0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.D0;
                    hk hkVar = this.f42127x0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(hkVar, property, 0.1f);
                    hk hkVar2 = this.f42127x0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(hkVar2, property2, 0.1f);
                    hk hkVar3 = this.f42127x0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(hkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.C0, property, 1.0f), ObjectAnimator.ofFloat(this.C0, property2, 1.0f), ObjectAnimator.ofFloat(this.C0, property3, 1.0f));
                    this.D0.setStartDelay(200L);
                } else {
                    if (this.f42141y0) {
                        obj = this.f42153z0;
                    } else {
                        obj = this.f42127x0;
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
                this.D0.addListener(new hg.b0(28, this, z10));
                this.D0.setDuration(150L);
                this.D0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.C0;
            if (z10) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            radialProgressView5.setVisibility(i9);
            RadialProgressView radialProgressView6 = this.C0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView6.setScaleX(f10);
            RadialProgressView radialProgressView7 = this.C0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            radialProgressView7.setScaleY(f11);
            this.C0.setAlpha(1.0f);
            hk hkVar4 = this.f42127x0;
            if (!z10 && !this.f42141y0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            hkVar4.setVisibility(i10);
            org.telegram.ui.Components.l80 l80Var = this.f42153z0;
            if (!z10 && this.f42141y0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            l80Var.setVisibility(i11);
            hk hkVar5 = this.f42127x0;
            if (!z10 && !this.f42141y0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            hkVar5.setScaleX(f12);
            org.telegram.ui.Components.l80 l80Var2 = this.f42153z0;
            if (!z10 && this.f42141y0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            l80Var2.setScaleX(f13);
            hk hkVar6 = this.f42127x0;
            if (!z10 && !this.f42141y0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            hkVar6.setScaleY(f14);
            org.telegram.ui.Components.l80 l80Var3 = this.f42153z0;
            if (!z10 && this.f42141y0) {
                f17 = 1.0f;
            }
            l80Var3.setScaleY(f17);
            hk hkVar7 = this.f42127x0;
            if (!z10 && !this.f42141y0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            hkVar7.setAlpha(f15);
            org.telegram.ui.Components.l80 l80Var4 = this.f42153z0;
            if (!z10 && this.f42141y0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            l80Var4.setAlpha(f16);
        }
    }

    public final void vc() {
        boolean z10;
        boolean z11;
        if (this.f41905f1 == null) {
            return;
        }
        if (this.f41874c9 && !b9() && !this.U.v0() && !this.Ka && (!this.f42018o3 || getMediaDataController().searchResultMessages.isEmpty())) {
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
            this.f41917g1 = false;
        } else {
            this.f42134x7 = 0;
            this.f41910f6 = 0;
            z11 = true;
        }
        this.f41905f1.e(1, z10, z11);
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
        int i9;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.f42056r6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i10 = 0;
            while (true) {
                arrayList = this.f42042q6;
                if (i10 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i10);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i10)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.P5 && (i9 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f41972k6[0].get(i9)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        messageReplies.replies++;
                        messageObject.animateComments = true;
                        TLRPC.Message message = messageObject2.messageOwner;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= size2) {
                                break;
                            } else if (MessageObject.getPeerId(messageObject.messageOwner.replies.recent_repliers.get(i11)) == MessageObject.getPeerId(peer)) {
                                messageObject.messageOwner.replies.recent_repliers.remove(i11);
                                break;
                            } else {
                                i11++;
                            }
                        }
                        messageObject.messageOwner.replies.recent_repliers.add(0, peer);
                        if (!messageObject2.isOut()) {
                            messageObject.messageOwner.replies.max_id = messageObject2.getId();
                        }
                        MessagesStorage messagesStorage = getMessagesStorage();
                        long j10 = this.f41890e.f22380id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j10, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f42083t6.f(messageObject.getGroupId());
                            if (groupedMessages != null) {
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(groupedMessages, groupedMessages.groupId);
                                int size3 = groupedMessages.messages.size();
                                for (int i12 = 0; i12 < size3; i12++) {
                                    groupedMessages.messages.get(i12).animateComments = true;
                                }
                            }
                        } else if (this.f42114w0 != null && (indexOf = arrayList.indexOf(messageObject)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.f42114w0.F));
                        }
                    }
                }
                i10++;
            }
            if (arrayList2 != null) {
                int size4 = arrayList2.size();
                for (int i13 = 0; i13 < size4; i13++) {
                    sparseArray.remove(((Integer) arrayList2.get(i13)).intValue());
                }
            }
            if (this.f42114w0 != null) {
                if (hVar != null) {
                    int m10 = hVar.m();
                    for (int i14 = 0; i14 < m10; i14++) {
                        MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.n(i14);
                        int indexOf2 = arrayList.indexOf((MessageObject) j3.r0.j(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            bm bmVar = this.f42114w0;
                            if (!bmVar.J) {
                                bmVar.q(indexOf2 + bmVar.F, groupedMessages2.messages.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.f42114w0.J) {
                    int size5 = arrayList3.size();
                    for (int i15 = 0; i15 < size5; i15++) {
                        this.f42114w0.m(((Integer) arrayList3.get(i15)).intValue());
                    }
                }
            }
        }
    }

    public final TLRPC.UserFull w8() {
        return this.W7;
    }

    public final boolean w9() {
        return UserObject.isBotForum(this.f41903f);
    }

    public final void wa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.wa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void wb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new bf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        showDialog(c2Var);
        TextView textView = (TextView) c2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7));
        }
    }

    public final void wc() {
        rg.g gVar = this.f41905f1;
        xg.i iVar = this.v;
        if (gVar != null) {
            this.f41905f1.setTranslationY((((-iVar.c()) - this.O.getInputBubbleHeight()) - W8(org.telegram.ui.Components.w11.f34073c)) - AndroidUtilities.dp(13.0f));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.x6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void x7(boolean z10) {
        boolean z11;
        this.f42042q6.clear();
        this.f42008n6.clear();
        this.o6.clear();
        this.f41884d6.clear();
        this.f42083t6.b();
        this.f41895e4 = false;
        bm bmVar = this.f42114w0;
        if (bmVar != null) {
            if (bmVar.f36906w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Pb(z11);
        }
        ij ijVar = this.f42077t0;
        if (ijVar != null) {
            ijVar.setEmptyView(null);
        }
        for (int i9 = 0; i9 < 2; i9++) {
            this.f41972k6[i9].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f42108v6;
            int[] iArr2 = this.f42096u6;
            if (encryptedChat == null) {
                iArr2[i9] = Integer.MAX_VALUE;
                iArr[i9] = Integer.MIN_VALUE;
            } else {
                iArr2[i9] = Integer.MIN_VALUE;
                iArr[i9] = Integer.MAX_VALUE;
            }
            this.f42120w6[i9] = Integer.MIN_VALUE;
            this.f42133x6[i9] = 0;
            this.f42147y6[i9] = false;
            this.f42159z6[i9] = false;
            this.A6[i9] = true;
        }
        if (z10) {
            this.C7 = true;
            this.D6 = true;
            this.C6 = true;
            this.E7 = false;
        }
        this.T4 = false;
        this.f42043q7 = 0;
        this.f42031p7 = false;
        this.G6 = 0;
        this.F7 = null;
        this.f42160z7 = 0;
        this.A7 = false;
        this.f42121w7 = false;
        bm bmVar2 = this.f42114w0;
        if (bmVar2 != null && !bmVar2.J) {
            bmVar2.O(false);
        }
    }

    public final ArrayList x8() {
        bm bmVar = this.f42114w0;
        if (bmVar != null) {
            return bmVar.L;
        }
        return null;
    }

    public boolean x9() {
        if (this.T0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void xa(int i9, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var, boolean z10) {
        org.telegram.ui.Components.vz0 vz0Var;
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
                if (i9 == 0) {
                    ve.e.q(getParentActivity(), Uri.parse(str), true, true, K9(t1Var, characterStyle));
                    return;
                } else if (i9 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f41860b8 == 0) {
                        z12 = true;
                    }
                    ve.e.q(parentActivity, parse, z12, true, K9(t1Var, characterStyle));
                    return;
                } else if (i9 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f41860b8 == 0) {
                        z12 = true;
                    }
                    ve.e.q(parentActivity2, parse2, z12, true, K9(t1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i9 == 0 && i9 != 2) {
                if (i9 == 1) {
                    org.telegram.ui.Components.y4.r0(this, str, true, true, false, false, K9(t1Var, characterStyle), null, this.f41848aa);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.r41) && (vz0Var = ((org.telegram.ui.Components.r41) characterStyle).f32081a) != null && (vz0Var.f34062a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.y4.r0(this, str, true, true, true, z12, K9(t1Var, characterStyle), null, this.f41848aa);
            }
        }
        if (getMessagesController().authDomains.contains(hostAuthority)) {
            SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
            if (i9 != 0 && i9 != 2) {
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
        if (i9 == 0) {
        }
        if (characterStyle instanceof org.telegram.ui.Components.r41) {
            z12 = true;
        }
        org.telegram.ui.Components.y4.r0(this, str, true, true, true, z12, K9(t1Var, characterStyle), null, this.f41848aa);
    }

    public final void xb() {
        TLRPC.Chat chat = this.f41890e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.f41890e)) {
                    y50 y50Var = new y50(a());
                    y50Var.f44472h0 = this;
                    presentFragment(y50Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.f41890e)) {
                xc xcVar = new xc(a());
                xcVar.f44472h0 = this;
                presentFragment(xcVar);
                return;
            } else {
                return;
            }
        }
        this.X9 = new org.telegram.ui.Components.cp(this, this.f41848aa);
        this.f42077t0.setOnInterceptTouchListener(new mg.b(23));
        jb(this.T0, false);
        showDialog(this.X9, new zf(this, 0));
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
        float f10;
        float f11;
        float f12;
        int i9;
        float f13;
        float f14;
        float f15;
        int i10;
        float f16;
        float f17;
        float f18;
        int i11;
        Integer num2;
        Integer num3;
        Integer num4;
        float f19;
        float f20;
        float f21;
        float f22;
        float f23;
        float f24;
        float f25;
        float f26;
        float f27;
        if ((!F9() || this.f41882d4) && this.H2 != null) {
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
            if (!z12 && !this.f42138xb && !this.E2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z12 && !this.f42138xb && !this.E2) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (this.f42138xb && !this.E2) {
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
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f19);
                    ImageView imageView2 = this.H2;
                    Property property2 = View.SCALE_X;
                    if (z17) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f20);
                    ImageView imageView3 = this.H2;
                    Property property3 = View.SCALE_Y;
                    if (z17) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.4f;
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f21);
                    ImageView imageView4 = this.F2;
                    if (z16) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f22);
                    ImageView imageView5 = this.F2;
                    if (z16) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f23);
                    ImageView imageView6 = this.F2;
                    if (z16) {
                        f24 = 1.0f;
                    } else {
                        f24 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f24);
                    RadialProgressView radialProgressView = this.G2;
                    if (!z18) {
                        f25 = 0.0f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f25);
                    RadialProgressView radialProgressView2 = this.G2;
                    if (!z18) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f26);
                    RadialProgressView radialProgressView3 = this.G2;
                    if (!z18) {
                        f27 = 0.4f;
                    } else {
                        f27 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f27));
                    this.I2.setInterpolator(org.telegram.ui.Components.gr.h);
                    this.I2.setDuration(360L);
                    this.I2.addListener(new nl(this, z16, z17, z18));
                    this.I2.start();
                } else {
                    num = 1;
                    ImageView imageView7 = this.F2;
                    if (z16) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView7.setAlpha(f10);
                    ImageView imageView8 = this.F2;
                    if (z16) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView8.setScaleX(f11);
                    ImageView imageView9 = this.F2;
                    if (z16) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.4f;
                    }
                    imageView9.setScaleY(f12);
                    ImageView imageView10 = this.F2;
                    if (z16) {
                        i9 = 0;
                    } else {
                        i9 = 4;
                    }
                    imageView10.setVisibility(i9);
                    ImageView imageView11 = this.H2;
                    if (z17) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView11.setAlpha(f13);
                    ImageView imageView12 = this.H2;
                    if (z17) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView12.setScaleX(f14);
                    ImageView imageView13 = this.H2;
                    if (z17) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    imageView13.setScaleY(f15);
                    ImageView imageView14 = this.H2;
                    if (z17) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView14.setVisibility(i10);
                    RadialProgressView radialProgressView4 = this.G2;
                    if (z18) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f16);
                    RadialProgressView radialProgressView5 = this.G2;
                    if (z18) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f17);
                    RadialProgressView radialProgressView6 = this.G2;
                    if (z18) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f18);
                    RadialProgressView radialProgressView7 = this.G2;
                    if (z18) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    radialProgressView7.setVisibility(i11);
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
            if (this.f42105v2 != null) {
                if (F9() && !this.f41882d4) {
                    this.f42105v2.c(0, 1, false);
                } else {
                    this.f42105v2.c((this.D4.size() - 1) - Collections.binarySearch(this.D4, Integer.valueOf(this.H4), Comparator$CC.reverseOrder()), this.D4.size(), z11);
                }
            }
        }
    }

    public final void y6() {
        this.f41870c5 = null;
        if (this.Z3 == 0 || this.f41882d4) {
            if (this.f41882d4) {
                this.f41959j5 = this.T3;
            } else {
                this.f41959j5 = null;
            }
            this.f41934h5 = null;
            ak akVar = this.U;
            if (akVar != null) {
                akVar.l1(null, null, null);
            }
        }
        e9(false);
        if (this.N3 == 0) {
            getMediaDataController().cleanDraft(this.P5, this.Z3, true);
        }
    }

    public final void y7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f42108v6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.D6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.l0.n(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i9 = dialog.top_message;
            int i10 = iArr[0];
            if (i9 > i10) {
                this.f42160z7 = Math.max(i10 + 1, dialog.read_inbox_max_id);
            }
            this.A6[0] = false;
            this.B6 = false;
            bm bmVar = this.f42114w0;
            if (bmVar != null && bmVar.B < 0) {
                bmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i11 = dialog2.unread_count;
            this.f41910f6 = i11;
            this.f41935h6 = dialog2.unread_mentions_count;
            if (this.f41922g6 != i11) {
                rg.g gVar = this.f41905f1;
                if (gVar != null) {
                    gVar.c(1, i11, this.J5);
                }
                this.f41922g6 = this.f41910f6;
                vc();
            }
            int i12 = this.f41935h6;
            int i13 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i12 != i13) {
                this.f41935h6 = i13;
                if (i13 <= 0) {
                    this.f41935h6 = 0;
                    this.f41948i6 = true;
                    Kb(false);
                } else {
                    rg.g gVar2 = this.f41905f1;
                    if (gVar2 != null) {
                        gVar2.c(2, i13, true);
                    }
                    Kb(true);
                }
            }
            a7(false);
            return;
        }
        this.f42042q6.clear();
        this.f41884d6.clear();
        this.f42008n6.clear();
        this.o6.clear();
        this.f42083t6.b();
        this.f41895e4 = false;
        for (int i14 = 1; i14 >= 0; i14--) {
            this.f41972k6[i14].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f42096u6;
            if (encryptedChat == null) {
                iArr2[i14] = Integer.MAX_VALUE;
                iArr[i14] = Integer.MIN_VALUE;
            } else {
                iArr2[i14] = Integer.MIN_VALUE;
                iArr[i14] = Integer.MAX_VALUE;
            }
            this.f42120w6[i14] = Integer.MIN_VALUE;
            this.f42133x6[i14] = 0;
            this.S5[i14].clear();
            this.T5[i14].clear();
            this.U5[i14].clear();
        }
        c9();
        yc(0, true);
        if (this.f41937h8 != null) {
            this.f41937h8 = null;
            ak akVar = this.U;
            if (akVar != null) {
                akVar.Z0(null, true, false);
            }
        }
        if (this.L != null) {
            Pb(false);
            G7(false);
            this.f42077t0.setEmptyView(this.M0);
        }
        bm bmVar2 = this.f42114w0;
        if (bmVar2 != null) {
            bmVar2.O(false);
        }
        if (this.h == null && (user = this.f41903f) != null && user.bot && this.f41846a8 == null) {
            this.f41846a8 = "";
            hc(false);
        }
    }

    public final MessageObject.GroupedMessages y8(long j10) {
        return (MessageObject.GroupedMessages) this.f42083t6.f(j10);
    }

    public final boolean y9() {
        if (this.f41890e != null) {
            return getMessagesController().isChatNoForwards(this.f41890e);
        }
        return getMessagesController().isUserNoForwards(this.W7);
    }

    public final void ya(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.ya(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void yb(boolean z10, MessageObject messageObject, MessageObject messageObject2, ArrayList arrayList, TLRPC.WebPage webPage, gn gnVar, boolean z11, boolean z12) {
        zb(z10, messageObject, messageObject2, arrayList, webPage, true, 0, gnVar, z11, 0L, null, z12);
    }

    public final void yc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.yc(int, boolean):void");
    }

    @Override
    public final org.telegram.ui.Components.xu0 z() {
        return this.T0;
    }

    public final void z6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41848aa);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
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
        for (int i9 = 1; i9 >= 0; i9--) {
            this.S5[i9].clear();
            this.T5[i9].clear();
            this.U5[i9].clear();
        }
        c9();
        yc(0, true);
        Wc(z10);
        Lc();
    }

    public final float z8() {
        qn qnVar = this.Z9;
        if (qnVar == null) {
            qnVar = this;
        }
        yj yjVar = qnVar.l1;
        if (yjVar == null) {
            return 0.0f;
        }
        return yjVar.f29805b;
    }

    public final boolean z9() {
        int i9 = this.N3;
        if (i9 != 5 && i9 != 9) {
            return false;
        }
        return true;
    }

    public final void za(java.util.ArrayList r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.za(java.util.ArrayList, boolean):void");
    }

    public final void zb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.gn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.zb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.gn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void zc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f41882d4 && !this.F4.isEmpty() && this.D4.size() == 1 && ((Integer) this.D4.get(0)).intValue() == b() + 1) {
            messageObject = (MessageObject) this.F4.get(this.D4.get(0));
        } else {
            messageObject = null;
        }
        this.U3 = messageObject;
        if (this.f41882d4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.Y3) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.f41890e, this.U3.messageOwner.from_id)) {
            this.U3 = null;
        }
    }

    @Override
    public final void N() {
    }

    public void V9(boolean z10) {
    }
}
