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
import android.os.SystemClock;
import android.os.Vibrator;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
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
public class sn extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, xx, kc0, org.telegram.ui.Components.ek, org.telegram.ui.Components.bh, ng.b, org.telegram.ui.Components.y50, ne.d {
    public static int Hc = 22;
    public static float Ic = 1.4f;
    public static int Jc = 10;
    public static Pattern Kc;
    public static Pattern Lc;
    public static Pattern Mc;
    public static final int[] Nc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Oc = false;
    public static final Rect Pc = new Rect();
    public fm A0;
    public ei.x3 A1;
    public boolean A2;
    public org.telegram.ui.Components.qc A3;
    public int A4;
    public int A5;
    public final int[] A6;
    public boolean A7;
    public final bh.b A8;
    public float A9;
    public int Aa;
    public pf.c Ab;
    public final ne.b Ac;
    public nk B0;
    public rl B1;
    public final org.telegram.ui.Components.w9[] B2;
    public boolean B3;
    public int B4;
    public boolean B5;
    public final int[] B6;
    public int B7;
    public Bitmap B8;
    public TLRPC.Document B9;
    public int Ba;
    public boolean Bb;
    public final j6.l Bc;
    public boolean C0;
    public float C1;
    public final rn[] C2;
    public int C3;
    public mf C4;
    public TLRPC.PhotoSize C5;
    public final boolean[] C6;
    public int C7;
    public BitmapShader C8;
    public boolean C9;
    public ChatMessageSharedResources Ca;
    public me Cb;
    public rh.c Cc;
    public org.telegram.ui.Components.x90 D0;
    public TL_stories.TL_premium_boostsStatus D1;
    public final org.telegram.ui.ActionBar.j5[] D2;
    public boolean D3;
    public boolean D4;
    public TLRPC.PhotoSize D5;
    public final boolean[] D6;
    public int D7;
    public Paint D8;
    public boolean D9;
    public ValueAnimator Da;
    public boolean Db;
    public zf.b0 Dc;
    public final re.b E;
    public TextView E0;
    public ChannelBoostsController.CanApplyBoost E1;
    public final ai.ud[] E2;
    public FlagSecureReason E3;
    public boolean E4;
    public TLObject E5;
    public final boolean[] E6;
    public boolean E7;
    public Matrix E8;
    public long E9;
    public float Ea;
    public boolean Eb;
    public final ArrayList Ec;
    public final bh.f F;
    public mk F0;
    public boolean F1;
    public NumberTextView F2;
    public boolean F3;
    public boolean F4;
    public int F5;
    public boolean F6;
    public boolean F7;
    public Paint F8;
    public int F9;
    public cl Fa;
    public final RectF Fb;
    public final ArrayList Fc;
    public final int G;
    public RadialProgressView G0;
    public me G1;
    public int G2;
    public MessageObject G3;
    public int G4;
    public TLRPC.WebPage G5;
    public boolean G6;
    public boolean G7;
    public final Paint G8;
    public int G9;
    public final ml Ga;
    public org.telegram.ui.ActionBar.b2 Gb;
    public final Rect Gc;
    public final gh.d H;
    public AnimatorSet H0;
    public ImageView H1;
    public final AnimatorSet[] H2;
    public int H3;
    public ArrayList H4;
    public ArrayList H5;
    public boolean H6;
    public int H7;
    public float H8;
    public int H9;
    public final tl Ha;
    public long Hb;
    public final gh.d I;
    public boolean I0;
    public zj I1;
    public boolean I2;
    public MessageObject I3;
    public int I4;
    public String I5;
    public boolean I6;
    public boolean I7;
    public boolean I8;
    public int I9;
    public ArrayList Ia;
    public final mg Ib;
    public final bh.b J;
    public ei.x3 J0;
    public ci.b3 J1;
    public ImageView J2;
    public MessageObject J3;
    public HashMap J4;
    public j9.u J5;
    public int J6;
    public MessageObject J7;
    public View J8;
    public boolean J9;
    public final di Ja;
    public int Jb;
    public final bh.b K;
    public ei.x3 K0;
    public org.telegram.ui.ActionBar.p0 K1;
    public RadialProgressView K2;
    public ah.x K3;
    public final SparseArray K4;
    public TLRPC.ChatInvite K5;
    public int K6;
    public MessageObject K7;
    public float K8;
    public boolean K9;
    public final ii Ka;
    public boolean Kb;
    public final gh.e L;
    public ei.x3 L0;
    public TextView L1;
    public ImageView L2;
    public ai.u1 L3;
    public int L4;
    public me L5;
    public long L6;
    public int L7;
    public float L8;
    public boolean L9;
    public final bj La;
    public Pattern Lb;
    public final bh.b M;
    public org.telegram.ui.Components.ch M0;
    public boolean M1;
    public AnimatorSet M2;
    public hg.n1 M3;
    public final int[] M4;
    public final LongSparseIntArray M5;
    public boolean M6;
    public boolean M7;
    public Integer M8;
    public org.telegram.ui.Components.si M9;
    public final fn Ma;
    public MessageObject Mb;
    public org.telegram.ui.ActionBar.b2 N;
    public boolean N0;
    public TextView N1;
    public FrameLayout N2;
    public ih.e N3;
    public int N4;
    public boolean N5;
    public long N6;
    public boolean N7;
    public int N8;
    public float N9;
    public final mf Na;
    public ff Nb;
    public boolean O;
    public lk O0;
    public TextView O1;
    public pk O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final ArrayList O6;
    public long O7;
    public boolean O8;
    public float O9;
    public final mf Oa;
    public ArrayList Ob;
    public FrameLayout P;
    public kh.c P0;
    public tk P1;
    public TextView P2;
    public TL_account.TL_businessChatLink P3;
    public int P4;
    public long P5;
    public final Paint P6;
    public String P7;
    public AnimatorSet P8;
    public np P9;
    public boolean Pa;
    public final BotForumHelper.BotDraftAnimationsPool Pb;
    public ei.g6 Q;
    public FrameLayout Q0;
    public TextView Q1;
    public TextView Q2;
    public String Q3;
    public int Q4;
    public boolean Q5;
    public final Paint Q6;
    public Integer Q7;
    public org.telegram.ui.ActionBar.m1 Q8;
    public Animator Q9;
    public boolean Qa;
    public final ih.a Qb;
    public kk R;
    public LinearLayout R0;
    public org.telegram.ui.Components.q31 R1;
    public kk R2;
    public int R3;
    public boolean R4;
    public boolean R5;
    public final ColorMatrix R6;
    public byte[] R7;
    public boolean R8;
    public boolean R9;
    public long Ra;
    public boolean Rb;
    public ih.f S;
    public org.telegram.ui.Components.to S0;
    public ig.e S1;
    public ImageView S2;
    public int S3;
    public boolean S4;
    public boolean S5;
    public final m.e3 S6;
    public int S7;
    public org.telegram.ui.ActionBar.e1[] S8;
    public boolean S9;
    public NotificationCenter.ObserversGroup Sa;
    public boolean Sb;
    public View T;
    public ni T0;
    public org.telegram.ui.Components.x90 T1;
    public ImageView T2;
    public boolean T3;
    public AnimatorSet T4;
    public long T5;
    public final org.telegram.ui.ActionBar.f5 T6;
    public int T7;
    public org.telegram.ui.ActionBar.e1 T8;
    public sn T9;
    public boolean Ta;
    public boolean Tb;
    public FrameLayout U;
    public ig.z1 U0;
    public ImageView U1;
    public org.telegram.ui.Components.q6 U2;
    public String U3;
    public final SparseIntArray U4;
    public Long U5;
    public long U6;
    public me U7;
    public final fk U8;
    public float U9;
    public int Ua;
    public long Ub;
    public FrameLayout V;
    public ig.z V0;
    public gi.n V1;
    public org.telegram.ui.Components.q6 V2;
    public byte[] V3;
    public final SparseIntArray V4;
    public int V5;
    public int V6;
    public String V7;
    public gm V8;
    public AnimatorSet V9;
    public int Va;
    public boolean Vb;
    public final ih.k W;
    public ih.j W0;
    public TextView W1;
    public org.telegram.ui.Components.q6 W2;
    public String W3;
    public boolean W4;
    public final SparseArray[] W5;
    public int W6;
    public ChatObject.Call W7;
    public ok W8;
    public final pk W9;
    public boolean Wa;
    public boolean Wb;
    public kh.f X;
    public lm X0;
    public bk X1;
    public yj X2;
    public MessageObject X3;
    public boolean X4;
    public final SparseArray[] X5;
    public final Matrix X6;
    public boolean X7;
    public int X8;
    public vh.i X9;
    public boolean Xa;
    public boolean Xb;
    public hk Y;
    public org.telegram.ui.Components.po Y0;
    public FrameLayout Y1;
    public xj Y2;
    public MessageObject Y3;
    public boolean Y4;
    public final SparseArray[] Y5;
    public LinearGradient Y6;
    public boolean Y7;
    public int Y8;
    public ah.f0 Y9;
    public a0.h Ya;
    public boolean Yb;
    public ik Z;
    public final ArrayList Z0;
    public bk Z1;
    public org.telegram.ui.Cells.x0 Z2;
    public boolean Z3;
    public boolean Z4;
    public boolean Z5;
    public int Z6;
    public TLRPC.ChatFull Z7;
    public int Z8;
    public z31 Z9;
    public a0.h Za;
    public b9 Zb;
    public int f41143a;
    public ah.x f41144a0;
    public jj f41145a1;
    public FrameLayout a2;
    public int f41146a3;
    public ArrayList f41147a4;
    public boolean f41148a5;
    public int f41149a6;
    public int f41150a7;
    public TLRPC.UserFull f41151a8;
    public boolean f41152a9;
    public boolean f41153aa;
    public long f41154ab;
    public int f41155ac;
    public boolean f41156b;
    public int f41157b0;
    public org.telegram.ui.Components.q6 f41158b1;
    public TextView f41159b2;
    public org.telegram.ui.Components.r60 f41160b3;
    public MessageObject f41161b4;
    public boolean f41162b5;
    public int f41163b6;
    public final Paint f41164b7;
    public org.telegram.ui.Cells.f6 f41165b8;
    public boolean f41166b9;
    public org.telegram.ui.Components.wp f41167ba;
    public xk f41168bb;
    public ValueAnimator f41169bc;
    public boolean f41170c;
    public org.telegram.ui.ActionBar.s0 f41171c0;
    public hh f41172c1;
    public org.telegram.ui.Components.b10 f41173c2;
    public View f41174c3;
    public TLRPC.TL_forumTopic f41175c4;
    public MessageObject f41176c5;
    public int f41177c6;
    public final Matrix f41178c7;
    public s01 f41179c8;
    public mm f41180c9;
    public qn f41181ca;
    public boolean f41182cb;
    public pi f41183cc;
    public boolean d;
    public wr f41184d0;
    public org.telegram.ui.Components.gz0 f41185d1;
    public org.telegram.ui.Components.rx0 f41186d2;
    public boolean f41187d3;
    public long f41188d4;
    public MessageObject f41189d5;
    public int f41190d6;
    public LinearGradient f41191d7;
    public final a0.h f41192d8;
    public View f41193d9;
    public sn f41194da;
    public boolean db;
    public boolean f41195dc;
    public TLRPC.Chat e;
    public org.telegram.ui.ActionBar.x f41196e0;
    public org.telegram.ui.ActionBar.s0 f41197e1;
    public org.telegram.ui.Components.r40 f41198e2;
    public boolean f41199e3;
    public int f41200e4;
    public MessageObject.GroupedMessages f41201e5;
    public int f41202e6;
    public boolean e7;
    public String f41203e8;
    public boolean f41204e9;
    public qn f41205ea;
    public boolean f41206eb;
    public int f41207ec;
    public TLRPC.User f41208f;
    public org.telegram.ui.ActionBar.s0 f41209f0;
    public org.telegram.ui.ActionBar.s0 f41210f1;
    public org.telegram.ui.Components.r40 f41211f2;
    public boolean f41212f3;
    public TLRPC.Chat f41213f4;
    public MessagePreviewParams f41214f5;
    public int f41215f6;
    public boolean f7;
    public long f41216f8;
    public boolean f41217f9;
    public xh.d f41218fa;
    public ArrayList f41219fb;
    public int fc;
    public org.telegram.ui.ActionBar.s0 f41220g0;
    public org.telegram.ui.ActionBar.s0 f41221g1;
    public cj f41222g2;
    public AnimatorSet f41223g3;
    public boolean f41224g4;
    public MessageSuggestionParams f41225g5;
    public int f41226g6;
    public int f41227g7;
    public String f41228g8;
    public boolean f41229g9;
    public final ChatMessagesMetadataController f41230ga;
    public ValueAnimator f41231gb;
    public int f41232gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.u0 f41233h0;
    public org.telegram.ui.ActionBar.s0 f41234h1;
    public boolean f41235h2;
    public ValueAnimator f41236h3;
    public boolean f41237h4;
    public MessageObject f41238h5;
    public final ArrayList f41239h6;
    public boolean f41240h7;
    public boolean f41241h8;
    public kl f41242h9;
    public TLRPC.TL_channels_sendAsPeers ha;
    public boolean f41243hb;
    public int hc;
    public org.telegram.ui.ActionBar.x f41244i0;
    public org.telegram.ui.Components.zo f41245i1;
    public org.telegram.ui.Components.r40 f41246i2;
    public float f41247i3;
    public boolean f41248i4;
    public MessageObject.GroupedMessages f41249i5;
    public boolean f41250i6;
    public boolean f41251i7;
    public boolean f41252i8;
    public boolean f41253i9;
    public TL_account.resolvedBusinessChatLinks ia;
    public Boolean f41254ib;
    public int f41255ic;
    public org.telegram.ui.ActionBar.u0 f41256j0;
    public kh.h f41257j1;
    public boolean f41258j2;
    public boolean f41259j3;
    public boolean f41260j4;
    public MessageObject.GroupedMessages f41261j5;
    public int f41262j6;
    public int f41263j7;
    public String f41264j8;
    public float f41265j9;
    public boolean f41266ja;
    public boolean f41267jb;
    public boolean f41268jc;
    public org.telegram.ui.ActionBar.u0 f41269k0;
    public boolean f41270k1;
    public org.telegram.ui.Components.r40 f41271k2;
    public boolean f41272k3;
    public int f41273k4;
    public MessageObject f41274k5;
    public int f41275k6;
    public boolean f41276k7;
    public String f41277k8;
    public ak f41278k9;
    public boolean f41279ka;
    public boolean f41280kb;
    public long f41281kc;
    public org.telegram.ui.ActionBar.s0 f41282l0;
    public int l1;
    public org.telegram.ui.Components.r40 f41283l2;
    public boolean f41284l3;
    public int l4;
    public in f41285l5;
    public int f41286l6;
    public boolean f41287l7;
    public MessageObject f41288l8;
    public org.telegram.ui.Cells.u1 f41289l9;
    public float f41290la;
    public int f41291lb;
    public TLRPC.TL_messages_discussionMessage f41292lc;
    public org.telegram.ui.ActionBar.u0 m0;
    public int f41293m1;
    public org.telegram.ui.Components.r40 f41294m2;
    public boolean f41295m3;
    public int f41296m4;
    public boolean f41297m5;
    public boolean f41298m6;
    public boolean f41299m7;
    public MessageObject f41300m8;
    public org.telegram.ui.Components.z00 f41301m9;
    public final jg f41302ma;
    public HashMap f41303mb;
    public TLRPC.messages_Messages f41304mc;
    public boolean f41305n;
    public org.telegram.ui.ActionBar.x f41306n0;
    public org.telegram.ui.Components.qc f41307n1;
    public org.telegram.ui.Components.r40 f41308n2;
    public boolean f41309n3;
    public sh f41310n4;
    public MessageObject f41311n5;
    public final ArrayList f41312n6;
    public int f41313n7;
    public int f41314n8;
    public boolean f41315n9;
    public final yk f41316na;
    public mf f41317nb;
    public boolean f41318nc;
    public boolean f41319o0;
    public sk f41320o1;
    public org.telegram.ui.Components.r40 f41321o2;
    public TLRPC.User f41322o3;
    public final SparseArray f41323o4;
    public int f41324o5;
    public final SparseArray[] f41325o6;
    public int f41326o7;
    public boolean f41327o8;
    public boolean f41328o9;
    public int f41329oa;
    public int ob;
    public kn oc;
    public RadialProgressView f41330p0;
    public ek f41331p1;
    public org.telegram.ui.Cells.u1 f41332p2;
    public TLRPC.Chat f41333p3;
    public final ArrayList f41334p4;
    public MessageObject p5;
    public final SparseArray f41335p6;
    public boolean f41336p7;
    public long f41337p8;
    public ValueAnimator p9;
    public int f41338pa;
    public org.telegram.ui.ActionBar.b2 f41339pb;
    public en f41340pc;
    public org.telegram.ui.ActionBar.s0 f41341q0;
    public ei.h1 f41342q1;
    public int f41343q2;
    public ah.i1 f41344q3;
    public int f41345q4;
    public boolean f41346q5;
    public final SparseArray q6;
    public mf f41347q7;
    public long f41348q8;
    public ValueAnimator f41349q9;
    public mf f41350qa;
    public int f41351qb;
    public ai.p7 f41352qc;
    public long f41353r;
    public org.telegram.ui.ActionBar.s0 f41354r0;
    public int f41355r1;
    public int f41356r2;
    public boolean f41357r3;
    public boolean f41358r4;
    public boolean f41359r5;
    public final HashMap f41360r6;
    public String f41361r7;
    public boolean f41362r8;
    public boolean f41363r9;
    public boolean f41364ra;
    public int f41365rb;
    public boolean f41366rc;
    public final HashMap f41367s;
    public org.telegram.ui.ActionBar.s0 f41368s0;
    public boolean f41369s1;
    public org.telegram.ui.Components.r40 f41370s2;
    public boolean f41371s3;
    public boolean f41372s4;
    public boolean f41373s5;
    public final SparseArray f41374s6;
    public boolean f41375s7;
    public String f41376s8;
    public float f41377s9;
    public boolean f41378sa;
    public boolean f41379sb;
    public float f41380sc;
    public org.telegram.ui.ActionBar.s0 f41381t0;
    public org.telegram.ui.Components.m40 f41382t1;
    public org.telegram.ui.Components.r40 f41383t2;
    public String f41384t3;
    public int f41385t4;
    public boolean f41386t5;
    public final a0.h f41387t6;
    public boolean f41388t7;
    public kk f41389t8;
    public float f41390t9;
    public long f41391ta;
    public int f41392tb;
    public float f41393tc;
    public ClippingImageView f41394u0;
    public org.telegram.ui.ActionBar.b2 f41395u1;
    public org.telegram.ui.Components.r40 f41396u2;
    public String f41397u3;
    public final ArrayList f41398u4;
    public int f41399u5;
    public final ArrayList f41400u6;
    public int f41401u7;
    public org.telegram.ui.Cells.u1 f41402u8;
    public int f41403u9;
    public int ua;
    public boolean f41404ub;
    public final ne.b f41405uc;
    public final kj v;
    public org.telegram.ui.Components.t11 f41406v0;
    public ei.x3 f41407v1;
    public org.telegram.ui.Components.aq f41408v2;
    public int f41409v3;
    public final HashMap f41410v4;
    public int f41411v5;
    public final SparseArray f41412v6;
    public int f41413v7;
    public o4 f41414v8;
    public int f41415v9;
    public int f41416va;
    public int f41417vb;
    public final ne.b f41418vc;
    public dj f41419w;
    public ih.g f41420w0;
    public ei.x3 f41421w1;
    public View f41422w2;
    public int f41423w3;
    public MessageObject f41424w4;
    public TLRPC.PhotoSize f41425w5;
    public final a0.h f41426w6;
    public int f41427w7;
    public TextureView f41428w8;
    public float w9;
    public qk f41429wa;
    public int f41430wb;
    public final ne.b f41431wc;
    public dj f41432x;
    public pj f41433x0;
    public ei.x3 f41434x1;
    public el f41435x2;
    public int f41436x3;
    public int f41437x4;
    public TLRPC.PhotoSize f41438x5;
    public final a0.h f41439x6;
    public int f41440x7;
    public boolean f41441x8;
    public float f41442x9;
    public rk f41443xa;
    public int f41444xb;
    public final ne.b f41445xc;
    public final re.b f41446y;
    public rj f41447y0;
    public ei.x3 f41448y1;
    public ei.g6 f41449y2;
    public UndoView y3;
    public int f41450y4;
    public TLObject f41451y5;
    public final int[] f41452y6;
    public int f41453y7;
    public final mf f41454y8;
    public float f41455y9;
    public boolean f41456ya;
    public CharacterStyle f41457yb;
    public final ne.b yc;
    public sj f41458z0;
    public ei.x3 f41459z1;
    public org.telegram.ui.Components.pg0 f41460z2;
    public dl f41461z3;
    public final ArrayList f41462z4;
    public int f41463z5;
    public final int[] f41464z6;
    public int f41465z7;
    public final gh.b f41466z8;
    public float f41467z9;
    public float f41468za;
    public String f41469zb;
    public final ne.b zc;

    public sn(Bundle bundle) {
        super(bundle);
        this.f41143a = 0;
        this.f41170c = false;
        this.d = false;
        this.f41367s = new HashMap();
        this.v = new kj(this, new mf(this, 21));
        re.b bVar = new re.b();
        this.f41446y = bVar;
        re.b bVar2 = new re.b();
        this.E = bVar2;
        this.W = new ih.k();
        this.Z0 = new ArrayList();
        this.B2 = new org.telegram.ui.Components.w9[2];
        this.C2 = new rn[2];
        this.D2 = new org.telegram.ui.ActionBar.j5[2];
        this.E2 = new ai.ud[2];
        this.H2 = new AnimatorSet[2];
        this.I2 = false;
        this.f41146a3 = 500;
        this.P3 = null;
        this.S3 = -1;
        this.Z3 = true;
        this.f41323o4 = new SparseArray();
        this.f41334p4 = new ArrayList();
        this.f41398u4 = new ArrayList();
        this.f41410v4 = new HashMap();
        this.f41437x4 = -1;
        this.f41450y4 = 0;
        this.f41462z4 = new ArrayList(10);
        this.H4 = new ArrayList();
        this.J4 = new HashMap();
        this.K4 = new SparseArray();
        this.M4 = new int[1];
        this.U4 = new SparseIntArray();
        this.V4 = new SparseIntArray();
        this.Z4 = true;
        this.f41162b5 = true;
        this.f41346q5 = true;
        this.f41386t5 = true;
        this.M5 = new LongSparseIntArray();
        this.V5 = 1;
        this.W5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41239h6 = new ArrayList();
        this.f41250i6 = true;
        this.f41275k6 = Integer.MIN_VALUE;
        this.f41312n6 = new ArrayList();
        this.f41325o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f41335p6 = new SparseArray();
        this.q6 = new SparseArray();
        this.f41360r6 = new HashMap();
        this.f41374s6 = new SparseArray();
        this.f41387t6 = new a0.h();
        this.f41400u6 = new ArrayList();
        this.f41412v6 = new SparseArray();
        this.f41426w6 = new a0.h();
        this.f41439x6 = new a0.h();
        this.f41452y6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f41464z6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.A6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.B6 = new int[2];
        this.C6 = new boolean[2];
        this.D6 = new boolean[2];
        this.E6 = new boolean[]{true, true};
        this.G6 = true;
        this.H6 = true;
        this.K6 = 0;
        this.O6 = new ArrayList();
        this.P6 = new Paint(1);
        this.Q6 = new Paint(1);
        this.R6 = new ColorMatrix();
        this.S6 = new m.e3();
        this.T6 = new org.telegram.ui.ActionBar.f5(0, false, false, new lj(this));
        this.X6 = new Matrix();
        Paint paint = new Paint(1);
        this.f41164b7 = paint;
        this.f41178c7 = new Matrix();
        this.f41313n7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f41440x7 = Integer.MAX_VALUE;
        this.f41453y7 = -1;
        this.G7 = true;
        this.L7 = Integer.MAX_VALUE;
        this.S7 = -1;
        this.T7 = -10000;
        this.f41192d8 = new a0.h();
        this.f41454y8 = new mf(this, 24);
        gh.b bVar3 = new gh.b();
        this.f41466z8 = bVar3;
        bh.b bVar4 = new bh.b(bVar3);
        this.A8 = bVar4;
        this.G8 = new Paint(1);
        this.H8 = 0.0f;
        this.K8 = 1.0f;
        this.L8 = 0.0f;
        this.R8 = true;
        this.U8 = new fk(this);
        this.f41315n9 = true;
        this.W9 = new pk(this, 0);
        this.f41230ga = new ChatMessagesMetadataController(this);
        this.f41302ma = new jg(this, 0);
        this.f41316na = new yk(this);
        this.f41338pa = -1;
        this.Ga = new ml(this);
        this.Ha = new tl(this);
        this.Ja = new di(this);
        this.Ka = new ii(this);
        this.La = new bj(this);
        this.Ma = new fn(this);
        this.Na = new mf(this, 27);
        this.Oa = new mf(this, 29);
        this.db = false;
        this.Fb = new RectF();
        this.Ib = new mg(this, 1);
        this.Pb = new BotForumHelper.BotDraftAnimationsPool();
        this.Qb = new Object();
        this.f41195dc = false;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.f41405uc = new ne.b(0, this, bsVar, 320L, false);
        this.f41418vc = new ne.b(1, this, bsVar, 520L, false);
        this.f41431wc = new ne.b(2, this, bsVar, 520L, false);
        this.f41445xc = new ne.b(3, this, bsVar, 320L, false);
        this.yc = new ne.b(4, this, bsVar, 320L, false);
        this.zc = new ne.b(5, this, bsVar, 320L, false);
        this.Ac = new ne.b(6, this, bsVar, 320L, false);
        mg mgVar = new mg(this, 6);
        ?? obj = new Object();
        obj.f14284b = new float[32];
        obj.f14283a = 1;
        obj.d = new ne.l(obj, me.a.f16847a, 240L);
        obj.f14285c = mgVar;
        this.Bc = obj;
        this.Ec = new ArrayList();
        this.Fc = new ArrayList();
        this.Gc = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.F = fVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            gh.d dVar = new gh.d(obj2);
            this.I = dVar;
            dVar.v = new mg(this, 8);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f11060f = obj2;
            bh.b bVar5 = new bh.b(dVar);
            this.K = bVar5;
            bVar5.f4363i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(obj2);
                this.H = dVar2;
                dVar2.v = new mg(this, 8);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f11060f = obj2;
                bh.b bVar6 = new bh.b(dVar2);
                this.J = bVar6;
                bVar6.f4363i = LiteMode.isEnabled(262144);
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

    public static void A0(sn snVar, MessageObject messageObject, Long l4, Runnable runnable) {
        ai.fa.y(snVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void A1(sn snVar, ag.a aVar, Runnable runnable) {
        if (!snVar.isFinished) {
            if (ag.a.m(ai.fa.x(snVar.currentAccount, aVar.f631a).p()).f632b < aVar.f632b) {
                ag.c cVar = aVar.f631a;
                if (cVar == ag.c.f635a) {
                    new ai.bd(snVar.getParentActivity(), snVar.getResourceProvider(), aVar.a(), 13, og.d.h(snVar.currentAccount, snVar.a()), null, snVar.a()).show();
                    return;
                } else if (cVar == ag.c.f636b) {
                    new fi.f(snVar.getParentActivity(), snVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void B0(sn snVar) {
        org.telegram.ui.Components.s40.h.a();
        snVar.showDialog(new yh.p1(snVar.getParentActivity(), snVar.currentAccount, snVar.a(), null, null));
    }

    public static void C0(org.telegram.ui.sn r19, org.telegram.ui.jk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.C0(org.telegram.ui.sn, org.telegram.ui.jk, boolean[]):void");
    }

    public static void C1(sn snVar) {
        SparseArray[] sparseArrayArr = snVar.W5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) snVar.f41325o6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            snVar.X5[i10].clear();
            snVar.Y5[i10].clear();
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
        snVar.Cc(0, true);
        snVar.ad(false);
        snVar.Pc();
    }

    public static void D0(sn snVar, TLRPC.Document document) {
        snVar.f41410v4.put(document, 0);
        SendMessagesHelper.getInstance(snVar.currentAccount).sendSticker(document, null, snVar.T5, null, null, null, snVar.f41285l5, null, true, 0, 0, false, null, snVar.H8(), 0L, snVar.S8(), snVar.f41225g5);
    }

    public static void E0(sn snVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(snVar.currentAccount).getInputUser(user.f20419id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new jh(snVar, tL_attachMenuBot, user, 1), 66);
    }

    public static org.telegram.ui.lu0 E1(org.telegram.ui.sn r14, org.telegram.messenger.MessageObject r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.E1(org.telegram.ui.sn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.lu0");
    }

    public static void F0(sn snVar, long j10, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(snVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.v01.c(snVar.getParentActivity(), snVar.currentAccount, -j10, snVar.getUserConfig().getCurrentUser(), null, z10, z11, snVar.getResourceProvider());
    }

    public static TLRPC.TL_message F7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20293id = message.f20293id;
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

    public static void G0(sn snVar) {
        long j10;
        ArrayList arrayList = snVar.f41239h6;
        arrayList.add(Integer.valueOf(snVar.V5));
        if (snVar.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(snVar.currentAccount);
            String str = snVar.f41397u3;
            int i10 = snVar.classGuid;
            int i11 = snVar.O3;
            int i12 = snVar.V5;
            snVar.V5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (snVar.f41427w7 != 0) {
            MessagesController messagesController = snVar.getMessagesController();
            long j11 = snVar.T5;
            long j12 = snVar.L6;
            int i13 = snVar.f41427w7;
            int i14 = snVar.classGuid;
            int i15 = snVar.R3;
            long j13 = snVar.f41188d4;
            int i16 = snVar.f41296m4;
            int i17 = snVar.V5;
            snVar.V5 = i17 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j13, i16, i17, snVar.f41237h4);
        } else if (snVar.f41401u7 != 0 && (!snVar.K9() || snVar.f41401u7 == snVar.L7 || snVar.f41237h4)) {
            int i18 = snVar.f41263j7;
            if (i18 != 0) {
                snVar.L6 = i18;
                MessagesController messagesController2 = snVar.getMessagesController();
                long j14 = snVar.L6;
                boolean z10 = snVar.f41240h7;
                int i19 = snVar.f41227g7;
                int i20 = snVar.f41401u7;
                int i21 = snVar.classGuid;
                int i22 = snVar.R3;
                long j15 = snVar.f41188d4;
                int i23 = snVar.f41296m4;
                int i24 = snVar.V5;
                snVar.V5 = i24 + 1;
                messagesController2.loadMessages(j14, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j15, i23, i24, snVar.f41237h4);
            } else {
                MessagesController messagesController3 = snVar.getMessagesController();
                long j16 = snVar.T5;
                long j17 = snVar.L6;
                boolean z11 = snVar.f41240h7;
                int i25 = snVar.f41227g7;
                int i26 = snVar.f41401u7;
                int i27 = snVar.classGuid;
                int i28 = snVar.R3;
                long j18 = snVar.f41188d4;
                int i29 = snVar.f41296m4;
                int i30 = snVar.V5;
                snVar.V5 = i30 + 1;
                messagesController3.loadMessages(j16, j17, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j18, i29, i30, snVar.f41237h4);
            }
        } else if (snVar.f41251i7) {
            snVar.V5++;
        } else {
            MessagesController messagesController4 = snVar.getMessagesController();
            long j19 = snVar.T5;
            long j20 = snVar.L6;
            boolean z12 = snVar.f41240h7;
            int i31 = snVar.f41227g7;
            int i32 = snVar.f41401u7;
            int i33 = snVar.classGuid;
            int i34 = snVar.R3;
            long j21 = snVar.f41188d4;
            int i35 = snVar.f41296m4;
            int i36 = snVar.V5;
            snVar.V5 = i36 + 1;
            messagesController4.loadMessages(j19, j20, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j21, i35, i36, snVar.f41237h4);
        }
        int i37 = snVar.R3;
        if (i37 == 0 || (i37 == 3 && snVar.N8() == snVar.getUserConfig().getClientUserId())) {
            if (snVar.K9() && !snVar.f41237h4) {
                return;
            }
            arrayList.add(Integer.valueOf(snVar.V5));
            MessagesController messagesController5 = snVar.getMessagesController();
            long j22 = snVar.T5;
            long j23 = snVar.L6;
            int i38 = snVar.classGuid;
            if (snVar.R3 == 3) {
                j10 = 0;
            } else {
                j10 = snVar.f41188d4;
            }
            long j24 = j10;
            int i39 = snVar.f41296m4;
            int i40 = snVar.V5;
            snVar.V5 = i40 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j24, i39, i40, snVar.f41237h4);
        }
    }

    public static CharSequence G8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.y31.k(messageObject)) {
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

    public static void H0(sn snVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        MessagesController.getNotificationsSettings(snVar.currentAccount).edit().putLong("dialog_join_requested_time_" + snVar.T5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(snVar.e) && !snVar.e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.a90.f24545r;
            org.telegram.ui.Components.a90.y(context, snVar, org.telegram.ui.Components.xc.a0(snVar), z10);
        }
        snVar.zb(false, true);
    }

    public static void I0(sn snVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, p6 p6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f20293id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(snVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            snVar.getMessagesController().getStoriesController().f5500k.d(hVar, new gh(3, hVar, p6Var), snVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void I1(sn snVar) {
        int i10;
        if (snVar.a() == snVar.getUserConfig().getClientUserId() && snVar.getUserConfig().isPremium() && snVar.f41168bb == null) {
            xk xkVar = new xk(snVar, snVar, snVar.getParentActivity(), snVar.currentAccount, snVar.f41205ea);
            snVar.f41168bb = xkVar;
            xkVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            snVar.f41168bb.setDelegate(new zk(snVar));
            snVar.f41168bb.setTop(true);
            int i11 = 0;
            snVar.f41168bb.setClipChildren(false);
            snVar.f41168bb.setClipToPadding(false);
            snVar.f41168bb.setVisibility(0);
            xk xkVar2 = snVar.f41168bb;
            if (xkVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            xkVar2.setHint(LocaleController.getString(i10));
            snVar.X0.addView(snVar.f41168bb, w7.z5.a(92.5f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 49));
            snVar.f41168bb.p(null, null, true);
            snVar.f41168bb.setTranslationY(-AndroidUtilities.dp(12.0f));
            snVar.f41168bb.setScaleY(0.4f);
            snVar.f41168bb.setScaleX(0.4f);
            snVar.f41168bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
            snVar.Pc();
            xk xkVar3 = snVar.f41168bb;
            float f7 = snVar.w9;
            sk skVar = snVar.f41320o1;
            if (skVar != null) {
                i11 = skVar.getCurrentHeight();
            }
            xkVar3.setTranslationY(f7 + i11);
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

    public static void J0(sn snVar) {
        snVar.J7(false);
        if (!snVar.fragmentBeginToShow) {
            pj pjVar = snVar.f41433x0;
            pjVar.W1 = false;
            pjVar.X1 = 0;
            pjVar.setEmptyView(snVar.Q0);
            pj pjVar2 = snVar.f41433x0;
            pjVar2.W1 = true;
            pjVar2.X1 = 1;
            return;
        }
        snVar.f41433x0.setEmptyView(snVar.Q0);
    }

    public static void K0(sn snVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        snVar.Qb(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static java.util.ArrayList K7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.K7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void L0(sn snVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = snVar.I1.getAdapter().f11947w0;
        int i10 = snVar.currentAccount;
        TLRPC.User user2 = snVar.f41208f;
        if (user2 != null) {
            j10 = user2.f20419id;
        } else {
            j10 = snVar.e.f20272id;
        }
        gi.t4 b10 = gi.t4.b(i10, j10, user.f20419id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, snVar.S8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.H1.P().k(b10) != null) {
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
        d3Var.A0 = true;
        d3Var.f11149k0 = snVar.getParentActivity();
        d3Var.t(snVar, b10);
        d3Var.show();
    }

    public static void M0(sn snVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(snVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, snVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(snVar.currentAccount).editMessage(messageObject, null, false, snVar, null, i10, i11);
        }
    }

    public static FrameLayout M7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.d6 d6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        ai.ud udVar = new ai.ud(context, 13);
        int i11 = 3;
        udVar.setMaxLines(3);
        udVar.setGravity(3);
        udVar.setEllipsize(TextUtils.TruncateAt.END);
        udVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        udVar.setTextSize(1, i10);
        udVar.setMaxWidth(AndroidUtilities.dp(170.0f));
        udVar.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(udVar, w7.z5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void N0(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(snVar.currentAccount).loadAttachMenuBots(false, true);
            snVar.ba(user.f20419id, snVar.f41277k8, false);
        }
    }

    public static boolean P0(org.telegram.ui.sn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.P0(org.telegram.ui.sn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static a3.i0 P4(sn snVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = snVar.getMessagesController().createDeleteShowOnceTask(snVar.T5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                snVar.xc(arrayList, true);
            }
            return new a3.i0(snVar, createDeleteShowOnceTask, messageObject, 16);
        }
        return null;
    }

    public static void Q0(sn snVar, TLObject tLObject, TLRPC.User user) {
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
                TLRPC.User user2 = snVar.f41208f;
                if (user2 != null && user2.bot && user.f20419id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.wh.q(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.xc.a0(snVar), null);
                } else if (user2 != null && user2.bot && user.f20419id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.wh.q(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.xc.a0(snVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.wh.q(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.xc.a0(snVar), null);
                } else {
                    TLRPC.Chat chat = snVar.e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.wh.q(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.xc.a0(snVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = snVar.e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.wh.q(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.xc.a0(snVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                snVar.ba(user.f20419id, snVar.f41277k8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(snVar.getParentActivity());
                x6Var.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ia, false));
                x6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false));
                x6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.V = x6Var;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(snVar, user, atomicBoolean, tL_attachMenuBot, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(snVar.getParentActivity(), 5, snVar.getResourceProvider());
                    a2Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    a2Var.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
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
                    a2Var.setOnClickListener(new org.telegram.ui.ActionBar.s1(13, a2Var, atomicBoolean));
                    b2Var.G = 6;
                    alertDialog$Builder.n(a2Var);
                }
                alertDialog$Builder.o();
            } else {
                bi1.a(snVar.getParentActivity(), new z(snVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void R0(sn snVar, long j10, long j11, Long l4) {
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
        org.telegram.ui.Components.f5.h0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new dh(snVar, j10, j11, l4, 0), snVar.resourceProvider, true);
    }

    public static void S0(sn snVar, org.telegram.ui.Components.i80 i80Var) {
        if (snVar.Mb == null) {
            return;
        }
        i80Var.u();
        snVar.O9(snVar.Mb, false, true);
        pf.d.q(snVar.getParentActivity(), Uri.parse(snVar.Mb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(snVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void S3(sn snVar) {
        org.telegram.ui.ActionBar.x xVar;
        if (!snVar.db && (xVar = snVar.f41244i0) != null) {
            xVar.a();
            org.telegram.ui.ActionBar.u0 u0Var = xVar.f21861m;
            u0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (snVar.R3 == 0) {
                u0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            u0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            u0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.c61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            u0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = snVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f28049a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.m11(obj, 0), 0, spannableStringBuilder4.length(), 33);
                u0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f28049a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.m11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                u0Var.g(56, spannableStringBuilder5);
            }
            u0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (snVar.h == null) {
                u0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            u0Var.g(54, LocaleController.getString(R.string.Regular));
            snVar.db = true;
        }
    }

    public static void T0(sn snVar, Object[] objArr, org.telegram.ui.Components.oy0 oy0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.xc xcVar = new org.telegram.ui.Components.xc(oy0Var.container, snVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.qc r10 = xcVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r10.f29639j = 2750;
                r10.k(true);
            }
        }
    }

    public static MessageObject T1(sn snVar) {
        View view = snVar.f41193d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.x0) {
            return ((org.telegram.ui.Cells.x0) view).getMessageObject();
        }
        return null;
    }

    public static void U(sn snVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = snVar.getParentActivity();
        int i12 = snVar.currentAccount;
        long j10 = snVar.T5;
        qn qnVar = snVar.f41205ea;
        int i13 = org.telegram.ui.Components.to.L;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.d6) qnVar, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21057h5, qnVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, qnVar)));
        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.h6.f21092j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, qnVar));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, qnVar));
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
        org.telegram.messenger.wh.r(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            sg.p0 p0Var = new sg.p0(parentActivity, qnVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.f3(f3Var, 1));
            p0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(p0Var, w7.z5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(linearLayout);
        f3Var.show();
    }

    public static void U0(sn snVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            snVar.f41268jc = true;
            snVar.f41433x0.f1();
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
            snVar2.tb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                snVar2.L7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = snVar2.X3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                snVar2.X3.messageOwner.reactions = tL_messageReactions;
            }
            ai.bb bbVar = new ai.bb(snVar, new boolean[]{false}, i11, snVar2, 15);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f20293id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = snVar2.getClassGuid();
                NotificationCenter.getInstance(snVar.currentAccount).addObserver(new ri(snVar, classGuid, bbVar, snVar2), NotificationCenter.messagesDidLoad);
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((MessageObject) i0.a.h(1, arrayList)).getId(), 1, false, 0, true, snVar3.f41237h4, null);
                    }
                });
                return;
            }
            bbVar.run();
            return;
        }
        snVar.f41255ic = 0;
        snVar.f41268jc = false;
        snVar.f41433x0.f1();
        if (messageObject2 != null) {
            snVar.la(messageObject2);
        } else if (snVar.getParentActivity() != null) {
            org.telegram.ui.Components.xc.a0(snVar).t(LocaleController.getString(R.string.ChannelPostDeleted), snVar.f41205ea).j();
        }
    }

    public static void U4(sn snVar, org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int themedColor;
        int i11;
        ne.b bVar = snVar.f41431wc;
        if (snVar.Y != null && !bVar.f17380f && u1Var.getMessageObject() != null) {
            lm lmVar = snVar.X0;
            RectF rectF = AndroidUtilities.rectTmp;
            ih.j.c(u1Var, lmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            th.a aVar = u1Var.f23215a6;
            if (aVar != null && u1Var.f23400n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((snVar.X0.getMeasuredHeight() - snVar.f41433x0.getPaddingBottom()) + snVar.f41380sc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = u1Var.getMessageObject();
                if (snVar.Cc == null) {
                    snVar.Cc = new rh.c(snVar.getParentActivity(), snVar.resourceProvider, snVar);
                    int indexOfChild = snVar.X0.indexOfChild(snVar.f41433x0);
                    if (indexOfChild >= 0) {
                        snVar.X0.addView(snVar.Cc, indexOfChild + 1, w7.z5.g());
                    } else {
                        snVar.X0.addView(snVar.Cc, w7.z5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (u1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.h6.f21174nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21268sb;
                    }
                    themedColor = snVar.getThemedColor(i11);
                } else {
                    if (u1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.h6.f21194od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21176nd;
                    }
                    themedColor = snVar.getThemedColor(i10);
                }
                snVar.Cc.setColor(themedColor);
                snVar.Cc.setCellToWatch(u1Var);
                snVar.Cc.f45761b.f45757a.a(false, false);
                snVar.Cc.setAnimatedVisibility(bVar.e);
                snVar.Cc.f45761b.setOnClickListener(new hg.r0(new mg(snVar, 0), 19));
                rh.c cVar = snVar.Cc;
                cVar.f45766s = new mg(snVar, 2);
                org.telegram.ui.Cells.b6 b6Var = cVar.f45760a;
                b6Var.setOnKeyListener(new ng(snVar, 0));
                b6Var.setOnEditorActionListener(new ma(snVar, 1));
                snVar.Y.U4 = b6Var;
                AndroidUtilities.runOnUIThread(new i4(snVar, measuredHeight, b6Var, 3), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void V(sn snVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (snVar.f41291lb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            snVar.G5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                snVar.G5 = null;
                MessagePreviewParams messagePreviewParams = snVar.f41214f5;
                if (messagePreviewParams != null) {
                    int i11 = snVar.currentAccount;
                    CharSequence fieldText = snVar.Y.getFieldText();
                    MessageObject messageObject3 = snVar.f41311n5;
                    if (messageObject3 == snVar.X3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, snVar.f41285l5, snVar.p5);
                }
                snVar.m8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                snVar.I5 = str;
            }
            if (snVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = snVar.f41214f5;
            if (messagePreviewParams2 != null) {
                int i12 = snVar.currentAccount;
                CharSequence fieldText2 = snVar.Y.getFieldText();
                MessageObject messageObject4 = snVar.f41311n5;
                if (messageObject4 == snVar.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, snVar.f41285l5, snVar.p5);
            }
            snVar.Ib(true, snVar.G5, false);
            return;
        }
        snVar.G5 = null;
        snVar.m8();
    }

    public static void V0(sn snVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ai.ld.k1(snVar.getParentActivity(), snVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, snVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            snVar.presentFragment(new fo0((TLRPC.PaymentReceipt) tLObject));
        }
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
        MessageObject messageObject = snVar.Mb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void W0(sn snVar, String str) {
        Uri parse = Uri.parse(str);
        u50.b(snVar.getParentActivity(), snVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void W1(sn snVar, float f7) {
        View view = snVar.f41193d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.x0) {
            ((org.telegram.ui.Cells.x0) view).setWalletSlidingOffset(f7);
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
        ai.fa.y(snVar.currentAccount, false).C(j10, j11, new ai.p5(snVar, j10, j11, 1));
    }

    public static void X0(sn snVar, int i10) {
        int i11;
        RectF rectF;
        gh.d dVar = snVar.H;
        gh.d dVar2 = snVar.I;
        ArrayList arrayList = snVar.Fc;
        bh.f fVar = snVar.F;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            if (w7.m6.a(i10, 4)) {
                snVar.u9();
            }
            if (w7.m6.a(i10, 2)) {
                ArrayList arrayList2 = snVar.Ec;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, snVar.X0.getMeasuredWidth(), snVar.f41433x0.getY() + snVar.f41433x0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.d(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.d(i11, AndroidUtilities.dp(8.0f), arrayList2);
                    }
                } else {
                    i11 = 0;
                }
                int a2 = zf.e0.a(arrayList2, i11, arrayList);
                int measuredWidth = snVar.X0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.r.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(snVar.f41433x0.getY(), rectF2.top);
                    rectF2.right = w7.r.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(snVar.f41433x0.getY() + snVar.f41433x0.getMeasuredHeight(), rectF2.bottom);
                }
                fVar.g(a2, arrayList);
            }
            lm lmVar = snVar.X0;
            Objects.requireNonNull(lmVar);
            if (fVar.e(new zf(lmVar, 0), snVar.X0.getWidth(), snVar.X0.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = snVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                snVar.s9();
            }
        }
    }

    public static void X1(sn snVar) {
        long j10;
        np npVar = snVar.P9;
        if (npVar != null) {
            if (snVar.f41237h4) {
                if (npVar.H != null) {
                    if (snVar.getParentLayout() != null) {
                        org.telegram.ui.Components.o9.a(snVar, snVar.getParentLayout().getFragmentStack().indexOf(snVar), snVar.e, snVar.f41208f, snVar.f41175c4, snVar.T5, snVar.f41416va, snVar.ua);
                    }
                    TLRPC.Chat chat = snVar.e;
                    TLRPC.TL_forumTopic tL_forumTopic = snVar.P9.H;
                    long j11 = snVar.T5;
                    int i10 = snVar.ua;
                    int i11 = snVar.f41416va;
                    if (snVar.getParentLayout() != null) {
                        org.telegram.ui.Components.o9.a(snVar, snVar.getParentLayout().getFragmentStack().indexOf(snVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", snVar.P9.f39490a);
                    bundle.putInt("dialog_filter_id", snVar.P9.f39492b);
                    bundle.putBoolean("pulled", true);
                    sn g10 = og.d.g(snVar, -snVar.T5, snVar.P9.H, 0, bundle);
                    g10.R9 = true;
                    Oc = true;
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
                j10 = chat2.f20272id;
            }
            if (j10 != 0) {
                snVar.y6();
                np npVar2 = snVar.P9;
                TLRPC.Chat chat3 = npVar2.G;
                long j13 = npVar2.Z;
                int i12 = npVar2.f39490a;
                int i13 = npVar2.f39492b;
                if (snVar.getParentLayout() != null) {
                    org.telegram.ui.Components.o9.a(snVar, snVar.getParentLayout().getFragmentStack().indexOf(snVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = snVar.P9.G;
                if (chat4 != null) {
                    j12 = chat4.f20272id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", snVar.P9.f39490a);
                bundle2.putInt("dialog_filter_id", snVar.P9.f39492b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(snVar.currentAccount).edit().remove("diditem" + snVar.P9.Z).apply();
                sn snVar2 = new sn(bundle2);
                ArrayList arrayList = snVar.f41219fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = snVar.f41219fb;
                    snVar2.f41219fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                snVar2.R9 = true;
                Oc = true;
                snVar.presentFragment(snVar2, true);
            }
        }
    }

    public static void Y(sn snVar, long j10, long j11) {
        BotForumHelper.getInstance(snVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        snVar.Nb = null;
    }

    public static void Y0(sn snVar) {
        if (AndroidUtilities.addToClipboard(snVar.Mb.sponsoredInfo)) {
            org.telegram.messenger.wh.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.resourceProvider));
        }
    }

    public static void Z(sn snVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(snVar.currentAccount).sendSticker(tL_document, str, snVar.T5, snVar.f41311n5, snVar.X3, null, snVar.f41285l5, null, z10, i10, 0, false, obj, snVar.H8(), 0L, snVar.S8(), snVar.f41225g5);
    }

    public static void Z0(sn snVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(snVar.currentAccount).loadAttachMenuBots(false, true);
            snVar.ba(user.f20419id, snVar.f41277k8, false);
        }
    }

    public static void a0(sn snVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new df(snVar, i10, 6));
        } else {
            snVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a1(sn snVar) {
        snVar.f41167ba = null;
        snVar.f41433x0.setOnInterceptTouchListener(null);
        snVar.nb(snVar.X0, true);
        ChatThemeController.getInstance(snVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void b0(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, qf qfVar) {
        String str4;
        org.telegram.ui.Components.j41 j41Var;
        if (snVar.f41189d5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = snVar.getParentActivity();
            int i11 = iArr[0];
            mf mfVar = new mf(snVar, 13);
            String[] strArr = org.telegram.ui.Components.r41.R;
            if (parentActivity == null) {
                j41Var = null;
            } else {
                org.telegram.ui.Components.j41 j41Var2 = new org.telegram.ui.Components.j41(parentActivity, str, str4, inputPeer, i11, richMessage, mfVar);
                j41Var2.I(z10);
                j41Var2.M = snVar;
                j41Var2.N = qfVar;
                if (snVar.getParentActivity() != null) {
                    snVar.showDialog(j41Var2);
                }
                j41Var = j41Var2;
            }
            j41Var.setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i12 - 1).apply();
                snVar.Uc(true);
            }
        }
    }

    public static void b1(sn snVar) {
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
                if (snVar.h == null && (userFull = snVar.f41151a8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41205ea);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new re(snVar, 21));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                snVar.showDialog(alertDialog$Builder.f20601a);
            } else if (!snVar.H4.isEmpty()) {
                MessagesController.getNotificationsSettings(snVar.currentAccount).edit().putInt("pin_" + snVar.T5, ((Integer) snVar.H4.get(0)).intValue()).commit();
                snVar.Cc(0, true);
            }
        }
    }

    public static void c0(long j10, sn snVar) {
        if (ai.fa.y(snVar.currentAccount, false).p().amount < j10) {
            new ai.bd(snVar.getParentActivity(), snVar.getResourceProvider(), j10, 13, DialogObject.getShortName(snVar.a()), new mg(snVar, 7), snVar.a()).show();
        } else {
            new ai.cd(snVar.getParentActivity(), snVar.resourceProvider).show();
        }
    }

    public static void c1(sn snVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        snVar.f41225g5 = null;
        int i10 = snVar.ob;
        if (i10 == 2) {
            snVar.f41285l5 = null;
            snVar.f41311n5 = null;
            MessagePreviewParams messagePreviewParams = snVar.f41214f5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, snVar.T5, null);
            }
            snVar.m8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = snVar.f41214f5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = snVar.f41214f5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = snVar.f41214f5.forwardMessages.messages.get(i11);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41205ea);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.I0 = true;
                if (j11 > 0) {
                    TLRPC.User user = snVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", snVar.f41214f5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = snVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", snVar.f41214f5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                b2Var.T = AndroidUtilities.replaceTags(formatString);
                b2Var.R = LocaleController.formatPluralString("messages", snVar.f41214f5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new re(snVar, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new re(snVar, 7));
                snVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(snVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
                }
            }
        } else if (i10 == 4) {
            snVar.G5 = null;
            MessagePreviewParams messagePreviewParams3 = snVar.f41214f5;
            if (messagePreviewParams3 != null) {
                int i12 = snVar.currentAccount;
                MessageObject messageObject4 = snVar.f41311n5;
                if (messageObject4 == snVar.X3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, snVar.f41285l5, snVar.p5);
            }
            hk hkVar = snVar.Y;
            hkVar.X2 = null;
            hkVar.Y2 = false;
            snVar.l8();
            snVar.m8();
        } else {
            if (ChatObject.isForum(snVar.e) && !snVar.f41237h4 && (messageObject = snVar.f41311n5) != null) {
                long topicId = MessageObject.getTopicId(snVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    snVar.getMediaDataController().cleanDraft(snVar.T5, topicId, false);
                }
            }
            snVar.Cb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void c2(sn snVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            messageObject = u1Var.getMessageObject();
            u1Var.f23296g1 = f7;
            u1Var.f23311h1 = f10;
            org.telegram.ui.Components.kb0 kb0Var = u1Var.Kc;
            float f11 = u1Var.f23311h1;
            kb0Var.h = u1Var.getTranslationX() + f7;
            kb0Var.f27828i = f11;
            kb0Var.f27831l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.x0) {
            messageObject = ((org.telegram.ui.Cells.x0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int J8 = snVar.J8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && J8 >= 2 && J8 != 20 && J8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        snVar.A6(messageObject, z10, true);
                        snVar.hc();
                        snVar.ad(false);
                    }
                }
            }
        }
    }

    public static void d0(sn snVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, qf qfVar) {
        String str4;
        if (snVar.f41189d5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = snVar.f41189d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.r41.K(snVar.getParentActivity(), snVar, inputPeer, iArr[0], snVar.f41189d5.summarized, str, str4, charSequence, z10, qfVar, new mf(snVar, 19)).setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i11 - 1).apply();
                snVar.Uc(true);
            }
        }
    }

    public static void d1(sn snVar, String str) {
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

    public static void d2(sn snVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = snVar.f41400u6;
        SparseArray[] sparseArrayArr = snVar.W5;
        if (!snVar.Pa && (i11 = i10 - snVar.A0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.im0 im0Var = snVar.f41433x0;
            ui uiVar = new ui(snVar, z10, sparseArray);
            if (!im0Var.f27261b2) {
                im0Var.f27279k2 = new int[2];
                new HashSet();
                im0Var.l1(im0Var, true);
                im0Var.f27269f2 = uiVar;
                im0Var.f27261b2 = true;
                im0Var.f27267e2 = i10;
                im0Var.f27265d2 = i10;
            }
        }
    }

    public static void d4(sn snVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(snVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new e7(snVar, h0Var, text, 3), new b1(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void e0(sn snVar, long j10, long j11, Long l4, Boolean bool) {
        boolean z10 = false;
        ai.fa y3 = ai.fa.y(snVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.i0(j10, j11, z10, true);
    }

    public static void e1(sn snVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = snVar.getMessagesController().getInputPeer(snVar.T5);
                tL_messages_getHistory.offset_date = snVar.f41427w7 + 86400;
                tL_messages_getHistory.limit = 1;
                snVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new xc(2, snVar, tLObject));
                return;
            }
            snVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static boolean e2(sn snVar, View view, RectF rectF) {
        RectF rectF2 = snVar.Fb;
        if (rectF != null && snVar.f41433x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void f0(sn snVar) {
        if (snVar.Mb == null) {
            return;
        }
        v21[] v21VarArr = {v21.U(snVar.getParentActivity(), snVar, true, snVar.resourceProvider, new org.telegram.ui.ActionBar.j3(11, snVar, v21VarArr))};
    }

    public static void f1(sn snVar, int i10) {
        if (snVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 t82 = snVar.t8(i10, false);
            if (t82 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) t82;
                ah.j1 j1Var = u1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = u1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (j1Var.K || randomUnreadReaction.big)) {
                    ah.d1.d(snVar, null, t82, null, 0.0f, 0.0f, ah.i1.d(randomUnreadReaction.reaction), snVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    ah.d1.f();
                }
                j1Var.K = false;
                MessageObject messageObject = u1Var.f23561y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (t82 instanceof org.telegram.ui.Cells.x0) {
                org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) t82;
                ah.j1 j1Var2 = x0Var.E0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = x0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (j1Var2.K || randomUnreadReaction2.big)) {
                    ah.d1.d(snVar, null, t82, null, 0.0f, 0.0f, ah.i1.d(randomUnreadReaction2.reaction), snVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    ah.d1.f();
                }
                j1Var2.K = false;
                MessageObject messageObject2 = x0Var.P0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void f4(sn snVar) {
        if (snVar.I3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = snVar.R3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f20293id = 0;
        MessageObject messageObject = new MessageObject(snVar.currentAccount, tL_message, false, false);
        snVar.I3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void g0(sn snVar) {
        MessagesController messagesController = snVar.getMessagesController();
        long j10 = snVar.T5;
        long j11 = snVar.L6;
        int i10 = snVar.classGuid;
        int i11 = snVar.R3;
        long j12 = snVar.f41188d4;
        int i12 = snVar.f41296m4;
        int i13 = snVar.V5;
        snVar.V5 = i13 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j12, i12, i13, snVar.f41237h4);
    }

    public static void g1(sn snVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ch chVar;
        String str;
        SparseArray[] sparseArrayArr = snVar.W5;
        if (snVar.getParentActivity() != null && snVar.N9 == 0.0f) {
            if (snVar.R3 == 3) {
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
                snVar.zb(true, true);
                byte[] bArr = snVar.V3;
                String str2 = snVar.W3;
                ze zeVar = new ze(snVar, 1);
                int i11 = q21.v;
                int currentAccount = snVar.getCurrentAccount();
                Activity parentActivity = snVar.getParentActivity();
                long a2 = snVar.a();
                if (parentActivity != null) {
                    q21.L(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.xc.a0(snVar), snVar.getResourceProvider(), bArr, str2, zeVar);
                }
            } else if (snVar.R3 == 2) {
                snVar.finishFragment();
                gm gmVar = snVar.V8;
                if (snVar.B0.getTag() == null) {
                    z12 = true;
                }
                gmVar.J(true, z12);
            } else {
                TLRPC.User user = snVar.f41208f;
                if (user != null && user.f20419id == 489000) {
                    snVar.fc(true);
                } else if (user != null && snVar.f41305n) {
                    if (user.bot) {
                        String str3 = snVar.f41203e8;
                        snVar.f41203e8 = null;
                        snVar.getMessagesController().unblockPeer(snVar.f41208f.f20419id, new te(snVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41205ea);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new re(snVar, 8));
                    b2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    snVar.showDialog(b2Var);
                } else if (UserObject.isReplyUser(user)) {
                    snVar.fc(true);
                } else {
                    TLRPC.User user2 = snVar.f41208f;
                    if (user2 != null && user2.bot && (str = snVar.f41203e8) != null) {
                        if (str.length() != 0) {
                            snVar.getMessagesController().sendBotStart(snVar.f41208f, snVar.f41203e8);
                        } else {
                            snVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", snVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        snVar.f41203e8 = null;
                        snVar.lc(false);
                        return;
                    }
                    if (ChatObject.isChannel(snVar.e)) {
                        TLRPC.Chat chat = snVar.e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (snVar.e.join_request) {
                                    snVar.zb(true, true);
                                    MessagesController.getInstance(snVar.currentAccount).addUserToChat(snVar.e.f20272id, UserConfig.getInstance(snVar.currentAccount).getCurrentUser(), 0, null, null, true, new me(snVar, 14), new m4.y0(12, snVar, context));
                                    return;
                                }
                                me meVar = snVar.L5;
                                if (meVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(meVar);
                                    snVar.L5 = null;
                                }
                                snVar.zb(true, true);
                                snVar.getMessagesController().addUserToChat(snVar.e.f20272id, snVar.getUserConfig().getCurrentUser(), 0, null, snVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.p0 p0Var = snVar.K1;
                                if (p0Var != null && (chVar = snVar.M0) != null && chVar.d(p0Var) && snVar.N1.getVisibility() != 8 && snVar.N1.getTag(R.id.object_tag) != null) {
                                    MessagesController.getNotificationsSettings(snVar.currentAccount).edit().putInt("dialog_bar_vis3" + snVar.T5, 3).commit();
                                    snVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(snVar.T5));
                                    return;
                                }
                                return;
                            }
                            snVar.fc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = snVar.Z7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = snVar.e;
                    TLRPC.User user3 = snVar.f41208f;
                    if (snVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.f5.r(snVar, false, chat2, user3, z11, true, false, z10, new re(snVar, 9));
                }
            }
        }
    }

    public static void g4(sn snVar) {
        if (snVar.J3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f20293id = 0;
        MessageObject messageObject = new MessageObject(snVar.currentAccount, tL_message, false, false);
        snVar.J3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void h0(sn snVar, ArrayList arrayList, long j10, org.telegram.ui.Components.ym0 ym0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(snVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new le(snVar, j10, 5), 400L);
            ym0Var.dismiss();
        }
    }

    public static void h1(sn snVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.i80 I = org.telegram.ui.Components.i80.I(snVar, u1Var);
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(snVar.getParentActivity(), snVar.f41205ea);
        I.f27129p = new se(ym0Var, 0);
        if (z10 && snVar.getMessagesController().config.walletAvailable.get()) {
            I.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney), new te(snVar, str, 11), false);
        }
        I.c(R.drawable.msg_copy, LocaleController.getString(R.string.WalletCopyAddress), new we(snVar, ym0Var, str, 1), false);
        if (z10) {
            I.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new te(snVar, str, 12), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = snVar.currentAccount;
                long j10 = user.f20419id;
                i0 i0Var = new i0(25, snVar, userArr);
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
                I.n(userOrChat, LocaleController.getString(i10), i0Var);
            } else {
                I.p(13, -1, LocaleController.getString(R.string.WalletAddressNoLinkedAccount));
            }
        }
        ym0Var.e(I);
        ym0Var.f(u1Var, characterStyle, null, false);
        snVar.showDialog(ym0Var);
    }

    public static void i0(sn snVar) {
        if (AndroidUtilities.addToClipboard(snVar.Mb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.wh.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(snVar.getParentActivity()), snVar.resourceProvider));
        }
    }

    public static void i1(org.telegram.ui.sn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.u1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.i1(org.telegram.ui.sn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1, int, int):void");
    }

    public static void j0(sn snVar, TLRPC.Document document) {
        snVar.f41410v4.put(document, 0);
        SendMessagesHelper.getInstance(snVar.currentAccount).sendSticker(document, null, snVar.T5, null, null, null, snVar.f41285l5, null, true, 0, 0, false, null, snVar.H8(), 0L, snVar.S8(), snVar.f41225g5);
    }

    public static void j1(sn snVar, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var = snVar.parentLayout;
        if (d5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 backgroundFragment = d5Var.getBackgroundFragment();
        if (backgroundFragment instanceof sn) {
            sn snVar2 = (sn) backgroundFragment;
            if (snVar2.a() == snVar.T5) {
                snVar.finishFragment();
                snVar2.j(i10, 0, true, 0, true, 0);
                return;
            }
        }
        snVar.presentFragment(V9(i10, snVar.T5));
    }

    public static void j2(sn snVar) {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (snVar.f41459z1 != null) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var2 = null;
        for (int childCount = snVar.f41433x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = snVar.f41433x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (primaryMessageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                u1Var2 = u1Var;
            }
        }
        snVar.yb(u1Var2);
    }

    public static void k0(sn snVar) {
        if (snVar.M1) {
            snVar.getMessagesController().addDialogToFolder(snVar.T5, 0, 0, 0L);
            snVar.T7();
            snVar.y3.j(23, snVar.T5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + snVar.T5, false);
            edit.putBoolean("dialog_bar_block" + snVar.T5, false);
            edit.putBoolean("dialog_bar_report" + snVar.T5, false);
            edit.commit();
            snVar.Uc(false);
            snVar.getNotificationsController().clearDialogNotificationsSettings(snVar.T5, snVar.d());
        } else if (snVar.L1.getTag() != null && ((Integer) snVar.L1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = snVar.Z7;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < snVar.Z7.participants.participants.size(); i10++) {
                    hVar.k(null, snVar.Z7.participants.participants.get(i10).user_id);
                }
                long j10 = snVar.Z7.f20273id;
                org.telegram.ui.Components.v70 v70Var = new org.telegram.ui.Components.v70(snVar.getParentActivity(), snVar.currentAccount, hVar, snVar.Z7.f20273id, snVar, snVar.f41205ea);
                v70Var.f31204l0 = new re(snVar, 23);
                v70Var.show();
            }
        } else if (snVar.L1.getTag() != null) {
            snVar.vb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", snVar.f41208f.f20419id);
            bundle.putBoolean("addContact", true);
            hs hsVar = new hs(bundle);
            hsVar.O = new re(snVar, 24);
            snVar.presentFragment(hsVar);
        }
    }

    public static void k1(org.telegram.ui.sn r19, final org.telegram.ui.v21[] r20, final org.telegram.ui.Components.i80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.k1(org.telegram.ui.sn, org.telegram.ui.v21[], org.telegram.ui.Components.i80):void");
    }

    public static void l0(sn snVar, TLRPC.ReactionCount reactionCount) {
        snVar.D7(true);
        org.telegram.ui.Components.fo0.c(snVar.getParentActivity(), snVar.currentAccount, reactionCount.reaction, snVar.f41205ea);
    }

    public static void l1(sn snVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(snVar.currentAccount).getInputUser(user.f20419id);
                    ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new xc(3, snVar, user));
                }
            }
        }
    }

    public static void m0(sn snVar) {
        if (snVar.X2.getAlpha() != 0.0f && !snVar.actionBar.s() && !snVar.F9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(snVar.X2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            snVar.L9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void m1(sn snVar, int i10) {
        if (snVar.R3 == 7) {
            Object E = snVar.M3.E(i10);
            if (i10 == 0) {
                snVar.M3.getClass();
            }
            if (E instanceof MessageObject) {
                snVar.ka((MessageObject) E);
            }
        } else if (snVar.f41344q3 != null) {
            if (i10 >= 0 && i10 < snVar.getMediaDataController().searchResultMessages.size()) {
                snVar.f41357r3 = false;
                snVar.pb(false, true, false);
                snVar.getMediaDataController().setSearchedPosition(i10);
                snVar.Jc(snVar.getMediaDataController().getMask(), snVar.getMediaDataController().getSearchPosition(), snVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new ue(snVar, snVar.getMediaDataController().searchResultMessages.get(i10), 5));
            }
        } else {
            snVar.getMediaDataController().jumpToSearchedMessage(snVar.classGuid, i10);
            snVar.Pb(false);
        }
    }

    public static void n0(sn snVar) {
        org.telegram.ui.Cells.u1 u1Var;
        rl rlVar;
        int i10;
        if (!snVar.Rb && snVar.F3 && snVar.f41433x0.G && snVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = snVar.f41433x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = snVar.f41433x0.getChildAt(childCount);
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
                snVar.Rb = true;
                rl rlVar2 = new rl(snVar, snVar.getParentActivity());
                rlVar2.p(true);
                rlVar2.K = Layout.Alignment.ALIGN_CENTER;
                rlVar2.d = 3500L;
                rlVar2.T = true;
                rlVar2.e = true;
                rlVar2.h = AndroidUtilities.dp(150.0f);
                rlVar2.q(8.0f);
                snVar.B1 = rlVar2;
                rlVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                snVar.X0.addView(snVar.B1, w7.z5.a(120.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
                u1Var.getLocationInWindow(iArr);
                snVar.C1 = u1Var.getTimeY() + iArr[1];
                snVar.B1.setTranslationY(((-rlVar.getTop()) - AndroidUtilities.dp(120.0f)) + snVar.C1);
                snVar.B1.m(0.0f, (u1Var.f23431pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + u1Var.f23460rb);
                snVar.B1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new me(snVar, 2));
            AndroidUtilities.runOnUIThread(new me(snVar, 2), 2000L);
        }
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.c61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f28049a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.m11(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f28049a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.m11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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
        org.telegram.ui.Components.l61[] l61VarArr;
        if (snVar.F5 != 0) {
            snVar.getConnectionsManager().cancelRequest(snVar.F5, true);
            snVar.F5 = 0;
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
            if ((charSequence instanceof Spannable) && (l61VarArr = (org.telegram.ui.Components.l61[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.l61.class)) != null && l61VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.l61 l61Var : l61VarArr) {
                    arrayList.add(l61Var.getURL());
                }
            }
            if (arrayList != null && snVar.H5 != null && arrayList.size() == snVar.H5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) snVar.H5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            snVar.H5 = arrayList;
        } catch (Exception e) {
            FileLog.e(e);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new mf(snVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new mf(snVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (snVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new ve(snVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = snVar.G5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = snVar.f41291lb + 1;
            snVar.f41291lb = i11;
            eg egVar = new eg(snVar, i11, getwebpagepreview, 0);
            if (snVar.f41303mb == null) {
                snVar.f41303mb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) snVar.f41303mb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                egVar.run(Boolean.TRUE, webPage2);
                return;
            }
            p6 p6Var = new p6(snVar, getwebpagepreview, egVar, 1);
            if (snVar.F5 != 0) {
                snVar.getConnectionsManager().cancelRequest(snVar.F5, true);
            }
            snVar.F5 = snVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new ai.q5(10, snVar, p6Var));
            snVar.getConnectionsManager().bindRequestToGuid(snVar.F5, snVar.classGuid);
        }
    }

    public static void o1(long j10, sn snVar) {
        if (ai.fa.y(snVar.currentAccount, false).p().amount < j10) {
            new ai.bd(snVar.getParentActivity(), snVar.getResourceProvider(), j10, 13, DialogObject.getShortName(snVar.a()), new mg(snVar, 7), snVar.a()).show();
        } else {
            new ai.cd(snVar.getParentActivity(), snVar.resourceProvider).show();
        }
    }

    public static org.telegram.ui.Components.xo p0(sn snVar, Context context) {
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(context, snVar.currentAccount, snVar.f41233h0.getPopupLayout().getSwipeBack(), false, new mj(snVar), snVar.getResourceProvider());
        snVar.f41245i1 = zoVar;
        zoVar.d(snVar.T5, snVar.d(), null);
        return snVar.f41245i1.f32976f;
    }

    public static void p1(sn snVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != snVar.d()) {
            snVar.f41154ab = SystemClock.uptimeMillis();
            snVar.f41336p7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                snVar.Wa(snVar.d());
            } else if (snVar.d() == 0) {
                snVar.Wa(l4.longValue());
            } else {
                snVar.f41313n7 = -1;
            }
            snVar.getConnectionsManager().cancelRequestsForGuid(snVar.classGuid);
            snVar.getMessagesStorage().cancelTasksForGuid(snVar.classGuid);
            snVar.classGuid = ConnectionsManager.generateClassGuid();
            snVar.Ta();
            snVar.f41214f5 = null;
            snVar.f41401u7 = 0;
            snVar.f41276k7 = false;
            snVar.f41287l7 = true;
            snVar.f41239h6.clear();
            snVar.f41188d4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = snVar.getMessagesController().getTopicsController().findTopic(-snVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                snVar.f41273k4 = i12;
                snVar.l4 = findTopic.read_outbox_max_id;
                snVar.f41296m4 = Math.max(1, i12);
                snVar.getMessagesController().getTopicsController().getTopicRepliesCount(snVar.T5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                snVar.f41175c4 = null;
                snVar.f41147a4 = null;
                snVar.X3 = null;
                snVar.f41311n5 = null;
                snVar.f41273k4 = 0;
                snVar.l4 = 0;
                snVar.f41296m4 = 0;
                snVar.f41188d4 = 0L;
                snVar.f41200e4 = 0;
                snVar.f41213f4 = null;
                snVar.f41237h4 = false;
                snVar.f41224g4 = false;
            }
            snVar.v8();
            snVar.Rc(true);
            snVar.f41145a1.n(true);
            snVar.f41145a1.b();
            snVar.R1.setCurrentTopic(l4.longValue());
            snVar.Uc(true);
            snVar.lc(true);
            snVar.getMessagesController().setForumLastTopicId(-snVar.a(), snVar.d());
            snVar.l9(true);
            snVar.j9(true);
            hk hkVar = snVar.Y;
            if (hkVar != null) {
                hkVar.k0(false);
                snVar.Y.E1(true);
            }
            snVar.D6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            snVar.l1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            snVar.f41293m1 = i11;
            snVar.Fc(false);
            snVar.Ec(false);
            snVar.Vc();
            kn knVar = snVar.oc;
            if (knVar != null && snVar.actionBar.f21493n0) {
                knVar.p(null);
            }
        }
    }

    public static void q0(sn snVar) {
        if (MessagesController.getInstance(snVar.currentAccount).isDialogMuted(snVar.T5, snVar.d())) {
            snVar.Tc(true);
            AndroidUtilities.runOnUIThread(new me(snVar, 7), 150L);
            snVar.f41233h0.M(null, null);
            if (snVar.getParentActivity() != null) {
                org.telegram.ui.Components.xc.z(snVar, 4, 0, snVar.f41205ea).j();
                return;
            }
            return;
        }
        View view = snVar.f41197e1.f21695j;
        if (view instanceof org.telegram.ui.ActionBar.e1) {
            ((org.telegram.ui.ActionBar.e1) view).b();
        }
    }

    public static void q1(sn snVar, String str) {
        if (MessagesController.getInstance(snVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            pf.d.l(snVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.f5.n0(snVar.getParentActivity(), snVar.f41205ea, str, true, new dg(snVar, str, 1));
        }
    }

    public static void r0(sn snVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(snVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f20388id;
        long clientUserId = snVar.getUserConfig().getClientUserId();
        long j11 = snVar.T5;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void s0(sn snVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f20313id = snVar.getMessagesController().getInputUser(snVar.f41208f);
            snVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new pe(snVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(snVar.getUserConfig().getCurrentUser(), snVar.T5, messageObject, snVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = snVar.H8();
        SendMessagesHelper.getInstance(snVar.currentAccount).sendMessage(of2);
        if (snVar.R3 == 0) {
            snVar.T9(false);
        }
        snVar.j9(false);
    }

    public static void s1(sn snVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(snVar.currentAccount).getInputUser(user.f20419id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new jh(snVar, tL_attachMenuBot, user, 0), 66);
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

    public static void t0(sn snVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, qf qfVar) {
        String str3;
        if (snVar.f41189d5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = snVar.f41189d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.r41.K(snVar.getParentActivity(), snVar, inputPeer, iArr[0], snVar.f41189d5.summarized, strArr[0], str3, charSequence, z10, qfVar, new mg(snVar, 13)).setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i11 - 1).apply();
                snVar.Uc(true);
            }
        }
    }

    public static void t1(sn snVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        sg.l1 l1Var = new sg.l1(snVar, snVar.currentAccount, user, null, null, snVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            l1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(snVar.getParentActivity());
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(160.0f), 4, w9Var, false);
        w9Var.setImageDrawable(p5Var);
        w9Var.addOnAttachStateChangeListener(new k5(p5Var, 1));
        p5Var.j(j10, false);
        l1Var.E0 = true;
        l1Var.B0 = w9Var;
        snVar.showDialog(l1Var);
    }

    public static void u0(sn snVar) {
        int i10;
        TLRPC.ChatFull chatFull = snVar.Z7;
        if (chatFull != null && !snVar.f41346q5) {
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
                    re reVar = new re(snVar, 15);
                    re reVar2 = new re(snVar, 16);
                    Pattern pattern = org.telegram.ui.Components.f5.f26080a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ci.o1(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.z5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                    b2Var.V = frameLayout;
                    b2Var.O0 = 0.3974359f;
                    b2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), reVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), reVar2);
                    snVar.showDialog(b2Var);
                }
            }
        }
    }

    public static void u1(sn snVar, String str) {
        if (MessagesController.getInstance(snVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            snVar.getParentActivity();
            pf.d.m(str);
            return;
        }
        org.telegram.ui.Components.f5.n0(snVar.getParentActivity(), snVar.f41205ea, str, false, new dg(snVar, str, 0));
    }

    public static void v0(org.telegram.ui.sn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.v0(org.telegram.ui.sn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void w0(sn snVar) {
        if (snVar.R3 == 0 && snVar.getMessagesController().freezeUntilDate > snVar.getConnectionsManager().getCurrentTime() && !b.a(snVar.currentAccount, snVar.f41208f)) {
            b.c(snVar.getParentActivity(), snVar.currentAccount, snVar.getResourceProvider());
        }
    }

    public static void w1(sn snVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j10;
        int[] iArr3 = snVar.A6;
        int[] iArr4 = snVar.f41464z6;
        boolean[] zArr = snVar.E6;
        int[] iArr5 = snVar.f41452y6;
        int[] iArr6 = snVar.B6;
        boolean[] zArr2 = snVar.D6;
        ArrayList arrayList = snVar.f41239h6;
        if ((i10 - i11) - i12 <= i13 && !snVar.G6) {
            boolean[] zArr3 = snVar.C6;
            if (!zArr3[0]) {
                snVar.G6 = true;
                arrayList.add(Integer.valueOf(snVar.V5));
                if (snVar.f41360r6.size() != 0) {
                    MessagesController messagesController = snVar.getMessagesController();
                    j10 = 0;
                    long j11 = snVar.T5;
                    c10 = 0;
                    long j12 = snVar.L6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = snVar.classGuid;
                    int i17 = snVar.R3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = snVar.f41188d4;
                    int i18 = snVar.f41296m4;
                    int i19 = snVar.V5;
                    snVar.V5 = i19 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j13, i18, i19, snVar.f41237h4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = snVar.getMessagesController();
                    long j14 = snVar.T5;
                    long j15 = snVar.L6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = snVar.classGuid;
                    int i22 = snVar.R3;
                    long j16 = snVar.f41188d4;
                    int i23 = snVar.f41296m4;
                    int i24 = snVar.V5;
                    snVar.V5 = i24 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j16, i23, i24, snVar.f41237h4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j10 = 0;
                if (snVar.L6 != 0 && !zArr3[1]) {
                    snVar.G6 = true;
                    arrayList.add(Integer.valueOf(snVar.V5));
                    MessagesController messagesController3 = snVar.getMessagesController();
                    long j17 = snVar.L6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = snVar.classGuid;
                    int i28 = snVar.R3;
                    long j18 = snVar.f41188d4;
                    int i29 = snVar.f41296m4;
                    int i30 = snVar.V5;
                    snVar.V5 = i30 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j18, i29, i30, snVar.f41237h4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !snVar.I7 && i11 <= 10) {
            if (snVar.L6 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(snVar.V5));
                MessagesController messagesController4 = snVar.getMessagesController();
                long j19 = snVar.L6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = snVar.classGuid;
                int i34 = snVar.R3;
                long j20 = snVar.f41188d4;
                int i35 = snVar.f41296m4;
                int i36 = snVar.V5;
                snVar.V5 = i36 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j20, i35, i36, snVar.f41237h4);
                snVar.I7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(snVar.V5));
                MessagesController messagesController5 = snVar.getMessagesController();
                long j21 = snVar.T5;
                long j22 = snVar.L6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = snVar.classGuid;
                int i40 = snVar.R3;
                long j23 = snVar.f41188d4;
                int i41 = snVar.f41296m4;
                int i42 = snVar.V5;
                snVar.V5 = i42 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j23, i41, i42, snVar.f41237h4);
                snVar.I7 = true;
            }
        }
    }

    public static void x0(sn snVar) {
        if (!snVar.h7(snVar.Y.getSendButton())) {
            if (snVar.getMediaController().isPlayingMessage(snVar.f41189d5)) {
                snVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = snVar.getMessagesController().getInputPeer(snVar.T5);
            if (snVar.f41201e5 != null) {
                for (int i10 = 0; i10 < snVar.f41201e5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f20388id.add(Integer.valueOf(snVar.f41201e5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f20388id.add(Integer.valueOf(snVar.f41189d5.getId()));
            }
            ConnectionsManager.getInstance(snVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new xc(5, snVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void x1(sn snVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, qf qfVar) {
        if (snVar.f41189d5 != null && i10 < arrayList.size() && snVar.getParentActivity() != null) {
            org.telegram.ui.Components.r41.K(snVar.getParentActivity(), snVar, inputPeer, iArr[0], snVar.f41189d5.summarized, "und", str, charSequence, z10, qfVar, new mf(snVar, 15)).setDimBehind(false);
            snVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(snVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + snVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + snVar.a(), i11 - 1).apply();
                snVar.Uc(true);
            }
        }
    }

    public static void y0(sn snVar, View view, int i10) {
        org.telegram.ui.Components.a6 a6Var;
        TLRPC.User user;
        char c10;
        kk kkVar;
        kk kkVar2;
        if (i10 != 0) {
            hg.j1 adapter = snVar.I1.getAdapter();
            if (adapter.f11947w0 != null && !adapter.f11929h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = snVar.I1.getAdapter().J(i11);
            int i12 = snVar.I1.getAdapter().X;
            int i13 = snVar.I1.getAdapter().Y;
            if (snVar.I1.getAdapter().F != null && i11 == 1) {
                snVar.Y.M0(i12, i13, snVar.I1.getAdapter().F + "@" + ChatObject.getPublicUsername(snVar.e) + " ", false);
            } else if (snVar.I1.getAdapter().F != null && i11 == 0) {
                snVar.Y.M0(i12, i13, a1.g.s(new StringBuilder(), snVar.I1.getAdapter().F, " "), false);
            } else if (J instanceof ig.x1) {
                if (!snVar.getUserConfig().isPremium()) {
                    snVar.showDialog(new sg.x0(snVar, snVar.getParentActivity(), snVar.currentAccount, true, 31, false, null));
                    return;
                }
                ig.x1 x1Var = (ig.x1) J;
                org.telegram.ui.Components.f5.Z(snVar.currentAccount, Math.max(1, x1Var.a()), snVar.T5, new org.telegram.ui.ActionBar.j3(8, snVar, x1Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (snVar.R3 != 0 || !snVar.h7(view)) {
                        if (view instanceof org.telegram.ui.Cells.c8) {
                            sendAnimationData = ((org.telegram.ui.Cells.c8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.f5.Z(snVar.currentAccount, 1, snVar.a(), new ai.g3(snVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), snVar.I1.getAdapter().L(i11), sendAnimationData, 2));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (snVar.f41309n3 && (kkVar2 = snVar.R2) != null && kkVar2.getVisibility() == 0) {
                        snVar.db(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        snVar.Y.M0(i12, i13, a1.g.p("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (snVar.f41309n3 && (kkVar = snVar.R2) != null && kkVar.getVisibility() == 0) {
                        snVar.db(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        snVar.Y.M0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(r.c.u(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.m61("" + user2.f20419id, 3, null), 0, spannableString.length(), 33);
                        snVar.Y.M0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof hg.g1) {
                    if (snVar.I1.getAdapter().J != null && snVar.R3 != 1) {
                        hg.g1 g1Var = (hg.g1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(g1Var.f11870a, snVar.T5, snVar.f41311n5, snVar.X3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = snVar.H8();
                        of2.ephemeralReceiverBotId = g1Var.f11871b;
                        of2.monoForumPeer = snVar.S8();
                        of2.suggestionParams = snVar.f41225g5;
                        snVar.getSendMessagesHelper().sendMessage(of2);
                        snVar.Y.setFieldText("");
                        snVar.j9(false);
                    }
                } else if (J instanceof String) {
                    if (snVar.I1.getAdapter().J != null) {
                        if (snVar.R3 == 1) {
                            org.telegram.ui.Components.f5.L(snVar.getParentActivity(), snVar.T5, new m4.y0(11, snVar, (String) J), snVar.f41205ea);
                            return;
                        } else if (!snVar.h7(view)) {
                            org.telegram.ui.Components.f5.Z(snVar.currentAccount, 1, snVar.T5, new org.telegram.ui.ActionBar.j3(9, snVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    snVar.Y.M0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (snVar.Y.getFieldText() != null) {
                        if (snVar.R3 == 1 || !snVar.h7(view)) {
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
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(snVar.getParentActivity(), 0, snVar.f41205ea);
                                    alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    snVar.showDialog(alertDialog$Builder.f20601a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(snVar.I1.getAdapter().R);
                                snVar.Ia = arrayList;
                                PhotoViewer.t1().K2(null, snVar, snVar.f41205ea);
                                PhotoViewer.t1().g2(arrayList, snVar.I1.getAdapter().M(i11), 3, false, snVar.Ja, snVar);
                                return;
                            }
                            org.telegram.ui.Components.f5.Z(snVar.currentAccount, 1, snVar.a(), new org.telegram.ui.ActionBar.j3(10, snVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    i0 i0Var = new i0(24, snVar, (TLRPC.TL_inlineBotWebView) J);
                    if (snVar.f41267jb) {
                        i0Var.run();
                    } else {
                        bi1.a(snVar.getParentActivity(), new org.telegram.ui.ActionBar.j3(12, snVar, i0Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    zj zjVar = snVar.I1;
                    if (zjVar != null && (user = zjVar.getAdapter().f11947w0) != null) {
                        snVar.Y.setFieldText("");
                        long j10 = snVar.T5;
                        if (j10 == user.f20419id) {
                            snVar.f41216f8 = j10;
                            snVar.getMessagesController().sendBotStart(snVar.f41208f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f20419id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", snVar.T5);
                        if (snVar.getMessagesController().checkCanOpenChat(bundle, snVar)) {
                            snVar.presentFragment(new sn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    hk hkVar = snVar.Y;
                    hkVar.S();
                    hkVar.U0.h(str);
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
                            TLRPC.Document f7 = org.telegram.ui.Components.r5.f(snVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                a6Var = new org.telegram.ui.Components.a6(f7, fontMetricsInt);
                            } else {
                                a6Var = new org.telegram.ui.Components.a6(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(a6Var, 0, spannableString2.length(), 33);
                            snVar.Y.M0(i12, i13, spannableString2, false);
                            snVar.I1.o(false);
                        }
                    }
                    snVar.Y.M0(i12, i13, str, true);
                    snVar.I1.o(false);
                }
            }
        }
    }

    public static void y1(sn snVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = snVar.f41311n5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = snVar.ob;
            if (i10 == 5) {
                int i11 = snVar.currentAccount;
                long j10 = snVar.T5;
                MessageSuggestionParams messageSuggestionParams = snVar.f41225g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new ai.h1(context, i11, j10, messageSuggestionParams, snVar, snVar.getResourceProvider(), 0, new ze(snVar, 4)).show();
            } else if (i10 == 1 && (messageObject = snVar.p5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = snVar.f41225g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    snVar.Xb(messageSuggestionParams2);
                } else if (snVar.p5.canEditMedia() && snVar.f41324o5 == 0) {
                    if (snVar.J1 == null) {
                        snVar.H7();
                    }
                    snVar.J1.L1(snVar.p5, -1);
                    snVar.ca();
                } else {
                    snVar.j(snVar.p5.getId(), 0, true, 0, true, 0);
                }
            } else if (snVar.f41214f5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(snVar.T5) && !snVar.f41214f5.hasSecretMessages && snVar.R3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        snVar.ha(0);
                        return;
                    }
                    MessageObject messageObject3 = snVar.f41311n5;
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

    public static void z0(sn snVar, long j10, boolean z10) {
        if (!snVar.H4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(snVar.currentAccount).edit();
            edit.putInt("pin_" + snVar.T5, ((Integer) snVar.H4.get(0)).intValue()).commit();
            snVar.H4.clear();
            snVar.J4.clear();
            snVar.L4 = 0;
            snVar.P4 = 0;
            snVar.Q4 = 0;
            snVar.Cc(0, true);
        }
        if (ChatObject.isMonoForum(snVar.e) && ChatObject.canManageMonoForum(snVar.currentAccount, snVar.e)) {
            if (j10 != 0) {
                snVar.getMessagesStorage().removeTopic(-snVar.e.f20272id, j10);
                snVar.getMessagesController().deleteSavedDialog(j10, snVar.getMessagesController().getInputPeer(-snVar.e.f20272id));
                snVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(snVar.e.f20272id, j10);
            }
        } else {
            snVar.getMessagesController().deleteDialog(snVar.T5, 1, z10);
            snVar.getMessagesStorage().removeAllTopics(snVar.T5);
            snVar.getMessagesController().getTopicsController().reloadTopics(-snVar.T5);
        }
        snVar.M5.put(j10, 0);
        org.telegram.ui.Components.q31 q31Var = snVar.R1;
        if (q31Var != null) {
            q31Var.setAllTopicsHidden(false);
        }
        if (j10 == snVar.f41188d4) {
            snVar.B7(false, null);
            snVar.A0.O(false);
        }
    }

    public static void z1(sn snVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        sn snVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        ih.a aVar = snVar.Qb;
        if (num.intValue() != snVar.d()) {
            snVar.f41318nc = false;
            ff ffVar = snVar.Nb;
            if (ffVar != null) {
                AndroidUtilities.cancelRunOnUIThread(ffVar);
                snVar.Nb.run();
                snVar.Nb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.q31 q31Var = snVar.R1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(q31Var.f29559b).getTopicsController().getTopics(-q31Var.f29561c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f20324id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = snVar.getMessagesController().getTopicsController().findTopic(-snVar.a(), tL_forumTopic.f20324id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                snVar.f41154ab = SystemClock.uptimeMillis();
                snVar.f41336p7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    snVar.Wa(snVar.d());
                } else if (snVar.d() == 0) {
                    snVar.Wa(num.intValue());
                } else {
                    snVar.f41313n7 = -1;
                }
                snVar.getConnectionsManager().cancelRequestsForGuid(snVar.classGuid);
                snVar.getMessagesStorage().cancelTasksForGuid(snVar.classGuid);
                snVar.classGuid = ConnectionsManager.generateClassGuid();
                snVar.Ta();
                snVar.f41214f5 = null;
                snVar.f41401u7 = 0;
                snVar.f41276k7 = false;
                snVar.f41287l7 = true;
                snVar.f41239h6.clear();
                snVar.f41170c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(snVar.getCurrentAccount(), message, false, false));
                    snVar2 = snVar;
                    snVar2.tb(arrayList, snVar.e, tL_forumTopic2.f20324id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    snVar2 = snVar;
                    snVar2.f41175c4 = null;
                    snVar2.f41147a4 = null;
                    snVar2.X3 = null;
                    snVar2.f41311n5 = null;
                    snVar2.f41273k4 = 0;
                    snVar2.l4 = 0;
                    snVar2.f41296m4 = 0;
                    snVar2.f41188d4 = 0L;
                    snVar2.f41200e4 = 0;
                    snVar2.f41213f4 = null;
                    snVar2.f41237h4 = false;
                    snVar2.f41224g4 = false;
                }
                fm fmVar = snVar2.A0;
                if (fmVar != null) {
                    if (fmVar.I >= 0 && !fmVar.N()) {
                        fm fmVar2 = snVar2.A0;
                        fmVar2.u(fmVar2.I);
                    } else {
                        fm fmVar3 = snVar2.A0;
                        if (fmVar3.I < 0 && fmVar3.N()) {
                            snVar2.A0.o(0);
                        }
                    }
                    snVar2.A0.T();
                }
                snVar2.v8();
                snVar2.Rc(true);
                snVar2.f41145a1.n(true);
                if (tL_forumTopic2 != null) {
                    snVar2.Xc();
                } else {
                    snVar2.f41145a1.b();
                }
                snVar2.R1.setCurrentTopic(snVar2.d());
                snVar2.Uc(true);
                snVar2.lc(true);
                snVar2.getMessagesController().setForumLastTopicId(-snVar2.a(), snVar2.d());
                snVar2.Ia();
                snVar2.k9(true);
                snVar2.j9(true);
                snVar2.D6(true, true);
                if (snVar2.Y != null) {
                    if (!UserObject.isBotForum(snVar2.f41208f)) {
                        snVar2.Y.k0(false);
                    }
                    snVar2.Y.E1(true);
                }
                if (tL_forumTopic2 != null) {
                    snVar2.getMessagesController().getTopicsController().getTopicRepliesCount(snVar2.T5, tL_forumTopic2.f20324id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                snVar2.l1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                snVar2.f41293m1 = i11;
                snVar2.Fc(false);
                snVar2.Ec(false);
                snVar2.Vc();
                kn knVar = snVar2.oc;
                if (knVar != null && snVar2.actionBar.f21493n0) {
                    knVar.p(null);
                }
                if (UserObject.isBotForum(snVar2.f41208f)) {
                    snVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(snVar2.T5, num.intValue()), true);
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
    public final org.telegram.ui.Components.jw0 A() {
        return this.X0;
    }

    public final void A6(MessageObject messageObject, boolean z10, boolean z11) {
        boolean z12;
        char c10;
        int i10;
        boolean z13;
        boolean z14;
        float f7;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i14;
        boolean z15;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        TLRPC.Chat chat;
        boolean z16;
        char c11;
        boolean z17;
        int i25;
        char c12;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        int i31;
        boolean z18;
        boolean z19;
        char c13;
        TLRPC.Message message;
        boolean z20;
        TLRPC.Message message2;
        boolean z21;
        boolean z22;
        boolean z23;
        int i32 = this.f41163b6;
        if (messageObject != null) {
            ArrayList arrayList = this.f41147a4;
            if (arrayList == null || !arrayList.contains(messageObject) || K9()) {
                if (messageObject.getDialogId() == this.T5) {
                    c13 = 0;
                } else {
                    c13 = 1;
                }
                if (z10 && messageObject.getGroupId() != 0) {
                    MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f41439x6.f(messageObject.getGroupId());
                    if (groupedMessages != null) {
                        boolean z24 = false;
                        int i33 = 0;
                        for (int i34 = 0; i34 < groupedMessages.messages.size(); i34++) {
                            if (this.W5[c13].indexOfKey(groupedMessages.messages.get(i34).getId()) < 0) {
                                i33 = i34;
                                z24 = true;
                            }
                        }
                        for (int i35 = 0; i35 < groupedMessages.messages.size(); i35++) {
                            MessageObject messageObject2 = groupedMessages.messages.get(i35);
                            if (z24) {
                                if (this.W5[c13].indexOfKey(messageObject2.getId()) < 0) {
                                    if (i35 == i33) {
                                        z23 = true;
                                    } else {
                                        z23 = false;
                                    }
                                    A6(messageObject2, false, z23);
                                }
                            } else {
                                if (i35 == groupedMessages.messages.size() - 1) {
                                    z22 = true;
                                } else {
                                    z22 = false;
                                }
                                A6(messageObject2, false, z22);
                            }
                            if (!TextUtils.isEmpty(messageObject2.caption)) {
                                Yb(messageObject);
                            }
                        }
                        return;
                    }
                    return;
                } else if (this.W5[c13].indexOfKey(messageObject.getId()) >= 0) {
                    this.W5[c13].remove(messageObject.getId());
                    if (!F9()) {
                        if ((messageObject.type == 0 || messageObject.isAnimatedEmoji() || messageObject.caption != null) && ((message2 = messageObject.messageOwner) == null || !message2.noforwards)) {
                            this.X5[c13].remove(messageObject.getId());
                        }
                        if (!messageObject.isAnimatedEmoji() && ((messageObject.isSticker() || messageObject.isAnimatedSticker()) && MessageObject.isStickerHasSet(messageObject.getDocument()))) {
                            this.Y5[c13].remove(messageObject.getId());
                        }
                        if (messageObject.canEditMessage(this.e)) {
                            this.f41190d6--;
                        }
                        if (this.R3 == 1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (!messageObject.canDeleteMessage(z21, this.e)) {
                            this.f41149a6--;
                        }
                        boolean D9 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D9) {
                            this.f41163b6--;
                        } else {
                            this.f41177c6--;
                        }
                        if (messageObject.isMusic() && !D9) {
                            this.f41215f6--;
                        } else if (messageObject.isDocument() && !D9) {
                            this.f41226g6--;
                        } else {
                            this.f41202e6--;
                        }
                    }
                } else if (this.W5[1].size() + this.W5[0].size() >= 100) {
                    AndroidUtilities.shakeView(this.f41158b1);
                    Vibrator vibrator = (Vibrator) ApplicationLoader.applicationContext.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                        return;
                    }
                    return;
                } else {
                    this.W5[c13].put(messageObject.getId(), messageObject);
                    if (!F9()) {
                        if ((messageObject.type == 0 || messageObject.isAnimatedEmoji() || messageObject.caption != null) && ((message = messageObject.messageOwner) == null || !message.noforwards)) {
                            this.X5[c13].put(messageObject.getId(), messageObject);
                        }
                        if (!messageObject.isAnimatedEmoji() && ((messageObject.isSticker() || messageObject.isAnimatedSticker()) && MessageObject.isStickerHasSet(messageObject.getDocument()))) {
                            this.Y5[c13].put(messageObject.getId(), messageObject);
                        }
                        if (messageObject.canEditMessage(this.e)) {
                            this.f41190d6++;
                        }
                        if (this.R3 == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (!messageObject.canDeleteMessage(z20, this.e)) {
                            this.f41149a6++;
                        }
                        boolean D92 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D92) {
                            this.f41163b6++;
                        } else {
                            this.f41177c6++;
                        }
                        if (messageObject.isMusic() && !D92) {
                            this.f41215f6++;
                        } else if (!messageObject.isDocument() || messageObject.isRoundOnce() || messageObject.isVoiceOnce() || D92) {
                            this.f41202e6++;
                        } else {
                            this.f41226g6++;
                        }
                        if (z10) {
                            Yb(messageObject);
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (z11 && this.actionBar.s() && !F9()) {
            int size = this.W5[1].size() + this.W5[0].size();
            if (size == 0) {
                h9();
                Cc(0, true);
            } else {
                G7();
                org.telegram.ui.ActionBar.u0 k10 = this.actionBar.j(null).k(25);
                org.telegram.ui.ActionBar.u0 k11 = this.actionBar.j(null).k(10);
                org.telegram.ui.ActionBar.u0 k12 = this.actionBar.j(null).k(22);
                org.telegram.ui.ActionBar.u0 k13 = this.actionBar.j(null).k(23);
                org.telegram.ui.ActionBar.u0 k14 = this.actionBar.j(null).k(11);
                org.telegram.ui.ActionBar.u0 k15 = this.actionBar.j(null).k(12);
                org.telegram.ui.ActionBar.u0 k16 = this.actionBar.j(null).k(28);
                org.telegram.ui.ActionBar.u0 k17 = this.actionBar.j(null).k(69);
                if (!D9() && !f9()) {
                    z12 = false;
                } else {
                    z12 = true;
                }
                float f10 = 0.5f;
                if ((i32 == 0 && this.f41163b6 != 0) || (i32 != 0 && this.f41163b6 == 0)) {
                    this.T4 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (k14 != null) {
                        if (this.f41163b6 != 0 && !z12) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        k14.setEnabled(z19);
                        Property property = View.ALPHA;
                        if (this.f41163b6 == 0) {
                            f10 = 1.0f;
                        }
                        arrayList2.add(ObjectAnimator.ofFloat(k14, property, f10));
                        if (z12 && k14.getBackground() != null) {
                            k14.setBackground(null);
                        } else if (k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21393z8), 5, -1));
                        }
                    }
                    kh.c cVar = this.P0;
                    if (cVar != null) {
                        if (this.f41163b6 != 0 && !z12) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        com.google.android.gms.internal.cast.z5 z5Var = cVar.f15062c;
                        ((ne.b) z5Var.d).a(z18, true);
                        ((jh.a) z5Var.f6883b).setEnabled(z18);
                    }
                    this.T4.playTogether(arrayList2);
                    c10 = 1;
                    i10 = size;
                    this.T4.setDuration(100L);
                    this.T4.addListener(new qi(this, 9));
                    this.T4.start();
                } else {
                    c10 = 1;
                    i10 = size;
                    if (k14 != null) {
                        if (this.f41163b6 != 0 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        k14.setEnabled(z14);
                        if (this.f41163b6 == 0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        k14.setAlpha(f7);
                        if (!z12 && k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21393z8), 3, -1));
                        }
                    }
                    kh.c cVar2 = this.P0;
                    if (cVar2 != null) {
                        if (this.f41163b6 != 0 && !z12) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        com.google.android.gms.internal.cast.z5 z5Var2 = cVar2.f15062c;
                        ((ne.b) z5Var2.d).a(z13, false);
                        ((jh.a) z5Var2.f6883b).setEnabled(z13);
                    }
                }
                if (k10 != null) {
                    int i36 = this.f41215f6;
                    if (((i36 > 0 && this.f41226g6 == 0) || (i36 == 0 && this.f41226g6 > 0)) && this.f41202e6 == 0) {
                        i30 = 0;
                    } else {
                        i30 = 8;
                    }
                    k10.setVisibility(i30);
                    if (this.f41215f6 > 0) {
                        i31 = R.string.SaveToMusic;
                    } else {
                        i31 = R.string.SaveToDownloads;
                    }
                    k10.setContentDescription(LocaleController.getString(i31));
                }
                if (k11 != null) {
                    k11.getVisibility();
                    if (!z12 && this.X5[c10].size() + this.X5[0].size() != 0) {
                        i29 = 0;
                    } else {
                        i29 = 8;
                    }
                    k11.setVisibility(i29);
                    k11.getVisibility();
                }
                if (k12 != null) {
                    k12.getVisibility();
                    if (getMediaDataController().canAddStickerToFavorites()) {
                        i11 = i10;
                        if (this.Y5[c10].size() + this.Y5[0].size() == i11) {
                            i28 = 0;
                            k12.setVisibility(i28);
                            k12.getVisibility();
                        }
                    } else {
                        i11 = i10;
                    }
                    i28 = 8;
                    k12.setVisibility(i28);
                    k12.getVisibility();
                } else {
                    i11 = i10;
                }
                if (k15 != null) {
                    if (this.f41149a6 == 0) {
                        i27 = 0;
                    } else {
                        i27 = 8;
                    }
                    k15.setVisibility(i27);
                }
                this.Z5 = false;
                int i37 = 0;
                while (true) {
                    if (i37 >= 2) {
                        break;
                    }
                    int i38 = 0;
                    while (true) {
                        if (i38 >= this.Y5[i37].size()) {
                            break;
                        }
                        MessageObject messageObject3 = (MessageObject) this.Y5[i37].valueAt(i38);
                        if (messageObject3 != null && !getMediaDataController().isStickerInFavorites(messageObject3.getDocument())) {
                            this.Z5 = true;
                            break;
                        }
                        i38++;
                    }
                    if (this.Z5) {
                        break;
                    }
                    i37++;
                }
                if (k12 != null) {
                    if (this.Z5) {
                        i26 = R.drawable.msg_fave;
                    } else {
                        i26 = R.drawable.msg_unfave;
                    }
                    k12.setIcon(i26);
                }
                if (this.f41190d6 == 1 && i11 == 1) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                if (this.P0 != null) {
                    lk lkVar = this.O0;
                    if ((lkVar != null && lkVar.getVisibility() == 0 && !this.I0) || ((chat = this.e) != null && ((ChatObject.isNotInChat(chat) && !K9()) || ((ChatObject.isChannel(this.e) && !ChatObject.canPost(this.e) && !this.e.megagroup) || !ChatObject.canSendMessages(this.e))))) {
                        z16 = false;
                    } else {
                        z16 = true;
                    }
                    if (this.R3 == 1 || !z16 || (this.W5[0].size() != 0 && this.W5[1].size() != 0)) {
                        u0Var = k10;
                        c11 = '\b';
                    } else if (i11 == 1) {
                        char c14 = 0;
                        int size2 = this.W5[0].size();
                        int i39 = 0;
                        while (true) {
                            if (i39 < size2) {
                                MessageObject messageObject4 = (MessageObject) this.W5[c14].valueAt(i39);
                                if (ChatObject.isForum(this.e) && !I6(messageObject4)) {
                                    c12 = '\b';
                                    break;
                                } else {
                                    i39++;
                                    c14 = 0;
                                }
                            } else {
                                c12 = 0;
                                break;
                            }
                        }
                        u0Var = k10;
                        c11 = c12;
                    } else {
                        long j10 = 0;
                        int i40 = 0;
                        c11 = 0;
                        for (i12 = 2; i40 < i12; i12 = 2) {
                            int size3 = this.W5[i40].size();
                            int i41 = 0;
                            while (true) {
                                u0Var = k10;
                                if (i41 < size3) {
                                    MessageObject messageObject5 = (MessageObject) this.W5[i40].valueAt(i41);
                                    long groupId = messageObject5.getGroupId();
                                    if (groupId == 0 || (j10 != 0 && j10 != groupId)) {
                                        break;
                                    }
                                    i25 = i40;
                                    if (ChatObject.isForum(this.e) && !I6(messageObject5)) {
                                        break;
                                    }
                                    i41++;
                                    k10 = u0Var;
                                    j10 = groupId;
                                    i40 = i25;
                                } else {
                                    i25 = i40;
                                    break;
                                }
                            }
                            i25 = i40;
                            c11 = '\b';
                            if (c11 == '\b') {
                                break;
                            }
                            i40 = i25 + 1;
                            k10 = u0Var;
                        }
                        u0Var = k10;
                    }
                    if (this.f41147a4 != null && c11 == 0) {
                        z15 = 0;
                        int size4 = this.W5[0].size();
                        for (int i42 = 0; i42 < size4; i42++) {
                            if (this.f41147a4.contains((MessageObject) this.W5[0].valueAt(i42))) {
                                c11 = '\b';
                            }
                        }
                    } else {
                        z15 = 0;
                    }
                    kh.c cVar3 = this.P0;
                    if (c11 == 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    i14 = 1;
                    ((ne.b) cVar3.f15061b.f6882a).a(z17, true);
                } else {
                    u0Var = k10;
                    i14 = 1;
                    z15 = 0;
                }
                if (k13 != null) {
                    k13.setVisibility(i13);
                }
                if (k17 != null) {
                    if (i11 == i14 && !z12) {
                        i23 = i14;
                    } else {
                        i23 = z15;
                    }
                    if (i23 != 0) {
                        int i43 = z15;
                        for (int i44 = i43; i44 < 2; i44++) {
                            for (int i45 = z15; i45 < this.W5[i44].size(); i45++) {
                                MessageObject messageObject6 = (MessageObject) this.W5[i44].valueAt(i45);
                                if (messageObject6 != null && !messageObject6.isVoiceOnce() && !messageObject6.isRoundOnce() && !messageObject6.messageOwner.noforwards && (messageObject6.isVoice() || messageObject6.isRoundVideo())) {
                                    i43 = i14;
                                }
                            }
                        }
                        i23 = i43;
                    }
                    if (i23 != 0) {
                        i24 = z15;
                    } else {
                        i24 = 8;
                    }
                    k17.setVisibility(i24);
                }
                if (k16 != null) {
                    if (getUserConfig().isPremium()) {
                        if (k13 != null && k13.getVisibility() == 0) {
                            i16 = i14;
                        } else {
                            i16 = z15;
                        }
                        if (k14 != null && k14.getVisibility() == 0) {
                            i17 = i14;
                        } else {
                            i17 = z15;
                        }
                        int i46 = i16 + i17;
                        if (u0Var != null && u0Var.getVisibility() == 0) {
                            i18 = i14;
                        } else {
                            i18 = z15;
                        }
                        int i47 = i46 + i18;
                        if (k11 != null && k11.getVisibility() == 0) {
                            i19 = i14;
                        } else {
                            i19 = z15;
                        }
                        int i48 = i47 + i19;
                        if (k15 != null && k15.getVisibility() == 0) {
                            i20 = i14;
                        } else {
                            i20 = z15;
                        }
                        int i49 = i48 + i20;
                        if (k12 != null && k12.getVisibility() == 0) {
                            i21 = i14;
                        } else {
                            i21 = z15;
                        }
                        int i50 = i49 + i21;
                        if (k17 != null && k17.getVisibility() == 0) {
                            i22 = i14;
                        } else {
                            i22 = z15;
                        }
                        if (i50 + i22 < 4) {
                            i15 = z15;
                            k16.setVisibility(i15);
                        }
                    }
                    i15 = 8;
                    k16.setVisibility(i15);
                }
            }
        }
        Pc();
    }

    public final void A7(boolean z10) {
        boolean z11;
        this.f41400u6.clear();
        this.f41360r6.clear();
        this.f41374s6.clear();
        this.f41239h6.clear();
        this.f41439x6.b();
        this.f41248i4 = false;
        fm fmVar = this.A0;
        if (fmVar != null) {
            if (fmVar.f36953w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Tb(z11);
        }
        pj pjVar = this.f41433x0;
        if (pjVar != null) {
            pjVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f41325o6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f41464z6;
            int[] iArr2 = this.f41452y6;
            if (encryptedChat == null) {
                iArr2[i10] = Integer.MAX_VALUE;
                iArr[i10] = Integer.MIN_VALUE;
            } else {
                iArr2[i10] = Integer.MIN_VALUE;
                iArr[i10] = Integer.MAX_VALUE;
            }
            this.A6[i10] = Integer.MIN_VALUE;
            this.B6[i10] = 0;
            this.C6[i10] = false;
            this.D6[i10] = false;
            this.E6[i10] = true;
        }
        if (z10) {
            this.G7 = true;
            this.H6 = true;
            this.G6 = true;
            this.I7 = false;
        }
        this.X4 = false;
        this.f41401u7 = 0;
        this.f41388t7 = false;
        this.K6 = 0;
        this.J7 = null;
        this.D7 = 0;
        this.E7 = false;
        this.A7 = false;
        fm fmVar2 = this.A0;
        if (fmVar2 != null && !fmVar2.N) {
            fmVar2.O(false);
        }
    }

    public final TLRPC.ChatFull A8() {
        return this.Z7;
    }

    public final boolean A9() {
        if (!ChatObject.isForum(this.e) || this.f41237h4) {
            if (ChatObject.isMonoForum(this.e) && d() == 0 && !this.T3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Aa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Aa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Ab(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new jf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21224q7));
        }
    }

    public final void Ac() {
        kh.h hVar = this.f41257j1;
        kj kjVar = this.v;
        if (hVar != null) {
            this.f41257j1.setTranslationY((((-kjVar.d()) - this.S.getInputBubbleHeight()) - b9(org.telegram.ui.Components.l31.f28060c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f41185d1 != null) {
            this.f41185d1.setTranslationY((-kjVar.d()) - AndroidUtilities.dp(16.0f));
        }
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.e)) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f41143a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new ng.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new mg(this, 15)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new mg(this, 16)));
        }
        if (this.f41208f == null) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new v0("", 1)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.d2(this)));
        }
        return arrayList;
    }

    public final void B6() {
        this.f41225g5 = null;
        if (this.f41188d4 == 0 || this.f41237h4) {
            if (this.f41237h4) {
                this.f41311n5 = this.X3;
            } else {
                this.f41311n5 = null;
            }
            this.f41285l5 = null;
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.i1(null, null, null);
            }
        }
        j9(false);
        if (this.R3 == 0) {
            getMediaDataController().cleanDraft(this.T5, this.f41188d4, true);
        }
    }

    public final void B7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f41464z6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.H6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.q.o(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.D7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.E6[0] = false;
            this.F6 = false;
            fm fmVar = this.A0;
            if (fmVar != null && fmVar.F < 0) {
                fmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f41262j6 = i12;
            this.f41286l6 = dialog2.unread_mentions_count;
            if (this.f41275k6 != i12) {
                kh.h hVar = this.f41257j1;
                if (hVar != null) {
                    hVar.c(1, i12, this.N5);
                }
                this.f41275k6 = this.f41262j6;
                zc();
            }
            int i13 = this.f41286l6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f41286l6 = i14;
                if (i14 <= 0) {
                    this.f41286l6 = 0;
                    this.f41298m6 = true;
                    Ob(false);
                } else {
                    kh.h hVar2 = this.f41257j1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Ob(true);
                }
            }
            d7(false);
            return;
        }
        this.f41400u6.clear();
        this.f41239h6.clear();
        this.f41360r6.clear();
        this.f41374s6.clear();
        this.f41439x6.b();
        this.f41248i4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f41325o6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f41452y6;
            if (encryptedChat == null) {
                iArr2[i15] = Integer.MAX_VALUE;
                iArr[i15] = Integer.MIN_VALUE;
            } else {
                iArr2[i15] = Integer.MIN_VALUE;
                iArr[i15] = Integer.MAX_VALUE;
            }
            this.A6[i15] = Integer.MIN_VALUE;
            this.B6[i15] = 0;
            this.W5[i15].clear();
            this.X5[i15].clear();
            this.Y5[i15].clear();
        }
        h9();
        Cc(0, true);
        if (this.f41288l8 != null) {
            this.f41288l8 = null;
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.W0(null, true, false);
            }
        }
        if (this.P != null) {
            Tb(false);
            J7(false);
            this.f41433x0.setEmptyView(this.Q0);
        }
        fm fmVar2 = this.A0;
        if (fmVar2 != null) {
            fmVar2.O(false);
        }
        if (this.h == null && (user = this.f41208f) != null && user.bot && this.f41203e8 == null) {
            this.f41203e8 = "";
            lc(false);
        }
    }

    public final TLRPC.UserFull B8() {
        return this.f41151a8;
    }

    public final boolean B9() {
        return UserObject.isBotForum(this.f41208f);
    }

    public final void Ba(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        org.telegram.ui.Components.l11 l11Var;
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
                    pf.d.p(getParentActivity(), Uri.parse(str), true, true, P9(u1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f41216f8 == 0) {
                        z12 = true;
                    }
                    pf.d.p(parentActivity, parse, z12, true, P9(u1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f41216f8 == 0) {
                        z12 = true;
                    }
                    pf.d.p(parentActivity2, parse2, z12, true, P9(u1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.f5.q0(this, str, true, true, false, false, P9(u1Var, characterStyle), null, this.f41205ea);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.l61) && (l11Var = ((org.telegram.ui.Components.l61) characterStyle).f28112a) != null && (l11Var.f28049a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.f5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f41205ea);
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
        if (characterStyle instanceof org.telegram.ui.Components.l61) {
            z12 = true;
        }
        org.telegram.ui.Components.f5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f41205ea);
    }

    public final void Bb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.e)) {
                    b60 b60Var = new b60(a());
                    b60Var.f36151l0 = this;
                    presentFragment(b60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.e)) {
                dd ddVar = new dd(a());
                ddVar.f36151l0 = this;
                presentFragment(ddVar);
                return;
            } else {
                return;
            }
        }
        this.f41167ba = new org.telegram.ui.Components.wp(this, this.f41205ea);
        this.f41433x0.setOnInterceptTouchListener(new m4.v0(23));
        nb(this.X0, false);
        showDialog(this.f41167ba, new qe(this, 1));
    }

    public final void Bc(boolean z10) {
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
        if ((!K9() || this.f41237h4) && this.L2 != null) {
            if (!this.O5) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.H4.size() > 1 && !this.I2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.L2.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.K2.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.J2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr == null && !this.Bb && !this.I2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.Bb && !this.I2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.Bb && !this.I2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (objArr2 == objArr && z12 == z16 && z13 == z14) {
                z17 = false;
            } else {
                AnimatorSet animatorSet = this.M2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.M2 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.L2.setVisibility(0);
                    } else if (z14) {
                        this.J2.setVisibility(0);
                    }
                    if (z16) {
                        this.K2.setVisibility(0);
                        this.K2.setAlpha(0.0f);
                        this.K2.setScaleX(0.4f);
                        this.K2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.M2 = animatorSet2;
                    ImageView imageView = this.L2;
                    Property property = View.ALPHA;
                    if (z15) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f18);
                    ImageView imageView2 = this.L2;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f19);
                    ImageView imageView3 = this.L2;
                    Property property3 = View.SCALE_Y;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    z17 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f20);
                    ImageView imageView4 = this.J2;
                    if (z14) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f21);
                    ImageView imageView5 = this.J2;
                    if (z14) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f22);
                    ImageView imageView6 = this.J2;
                    if (z14) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f23);
                    RadialProgressView radialProgressView = this.K2;
                    if (!z16) {
                        f24 = 0.0f;
                    } else {
                        f24 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f24);
                    RadialProgressView radialProgressView2 = this.K2;
                    if (!z16) {
                        f25 = 0.4f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f25);
                    RadialProgressView radialProgressView3 = this.K2;
                    if (!z16) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f26));
                    this.M2.setInterpolator(org.telegram.ui.Components.bs.h);
                    this.M2.setDuration(360L);
                    this.M2.addListener(new sl(this, z14, z15, z16));
                    this.M2.start();
                } else {
                    num = 1;
                    z17 = false;
                    ImageView imageView7 = this.J2;
                    if (z14) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView7.setAlpha(f7);
                    ImageView imageView8 = this.J2;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    imageView8.setScaleX(f10);
                    ImageView imageView9 = this.J2;
                    if (z14) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView9.setScaleY(f11);
                    ImageView imageView10 = this.J2;
                    if (z14) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.L2;
                    if (z15) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    imageView11.setAlpha(f12);
                    ImageView imageView12 = this.L2;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    imageView12.setScaleX(f13);
                    ImageView imageView13 = this.L2;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView13.setScaleY(f14);
                    ImageView imageView14 = this.L2;
                    if (z15) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.K2;
                    if (z16) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f15);
                    RadialProgressView radialProgressView5 = this.K2;
                    if (z16) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f16);
                    RadialProgressView radialProgressView6 = this.K2;
                    if (z16) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f17);
                    RadialProgressView radialProgressView7 = this.K2;
                    if (z16) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.J2;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.L2;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.K2;
                if (z16) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.f41460z2 != null) {
                if (K9() && !this.f41237h4) {
                    boolean z18 = z17;
                    this.f41460z2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.f41460z2.c((this.H4.size() - 1) - Collections.binarySearch(this.H4, Integer.valueOf(this.L4), Comparator$CC.reverseOrder()), this.H4.size(), z11);
            }
        }
    }

    public final void C6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41205ea);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            b2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            b2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(b2Var);
    }

    public final void C7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.W5[i10].clear();
            this.X5[i10].clear();
            this.Y5[i10].clear();
        }
        h9();
        Cc(0, true);
        ad(z10);
        Pc();
    }

    public final ArrayList C8() {
        fm fmVar = this.A0;
        if (fmVar != null) {
            return fmVar.P;
        }
        return null;
    }

    public boolean C9() {
        if (this.X0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ca(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Ca(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void Cb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.in r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Cb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.in, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void Cc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Cc(int, boolean):void");
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
        org.telegram.ui.Components.l11 l11Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.a6 a6Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        Long l10;
        if (this.Y != null) {
            int i10 = this.R3;
            char c10 = '\b';
            if (i10 == 0 || i10 == 8 || (i10 == 3 && getUserConfig().getClientUserId() == N8())) {
                long j14 = 0;
                if (this.R3 == 8) {
                    if (ChatObject.isMonoForum(this.e)) {
                        if (this.f41188d4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.l11 l11Var2 = null;
                if (A9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.T5);
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
                    long j15 = this.T5;
                    if (this.R3 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.f41188d4;
                    }
                    draft = mediaDataController.getDraft(j15, j10);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                hk hkVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                hkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.T5, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j16 = this.T5;
                    if (l4 != null) {
                        j13 = l4.longValue();
                    } else {
                        j13 = this.f41188d4;
                    }
                    message = mediaDataController2.getDraftMessage(j16, j13);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.R3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.f41155ac >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        j9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.f41155ac = draftMessage3.date;
                    hk hkVar2 = this.Y;
                    hkVar2.X2 = null;
                    hkVar2.Y2 = !draftMessage3.no_webpage;
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
                                l11Var = null;
                                org.telegram.ui.Components.m61 m61Var = new org.telegram.ui.Components.m61(a1.g.o(j12, ""), 3, null);
                                int i12 = messageEntity.offset;
                                valueOf.setSpan(m61Var, i12, messageEntity.length + i12, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f28049a |= 4;
                                    org.telegram.ui.Components.m11 m11Var = new org.telegram.ui.Components.m11(obj, 0);
                                    int i13 = messageEntity.offset;
                                    MediaDataController.addStyleToText(m11Var, i13, messageEntity.length + i13, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f28049a |= 1;
                                        org.telegram.ui.Components.m11 m11Var2 = new org.telegram.ui.Components.m11(obj2, 0);
                                        int i14 = messageEntity.offset;
                                        MediaDataController.addStyleToText(m11Var2, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f28049a |= 2;
                                        org.telegram.ui.Components.m11 m11Var3 = new org.telegram.ui.Components.m11(obj3, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(m11Var3, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f28049a |= 8;
                                        org.telegram.ui.Components.m11 m11Var4 = new org.telegram.ui.Components.m11(obj4, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(m11Var4, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f28049a |= 16;
                                        org.telegram.ui.Components.m11 m11Var5 = new org.telegram.ui.Components.m11(obj5, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(m11Var5, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.l61 l61Var = new org.telegram.ui.Components.l61(messageEntity.url, l11Var2);
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(l61Var, i18, messageEntity.length + i18, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f28049a |= 256;
                                        org.telegram.ui.Components.m11 m11Var6 = new org.telegram.ui.Components.m11(obj6, 0);
                                        int i19 = messageEntity.offset;
                                        MediaDataController.addStyleToText(m11Var6, i19, messageEntity.length + i19, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i20 = messageEntity.offset;
                                        org.telegram.ui.Components.pj0.c(valueOf, i20, messageEntity.length + i20, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e) {
                                            FileLog.e((Throwable) e, false);
                                            fontMetricsInt = l11Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            a6Var = new org.telegram.ui.Components.a6(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            a6Var = new org.telegram.ui.Components.a6(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i21 = messageEntity.offset;
                                        valueOf.setSpan(a6Var, i21, messageEntity.length + i21, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        l11Var = l11Var2;
                                    }
                                    l11Var = l11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                l11Var = null;
                            }
                            i11++;
                            l11Var2 = l11Var;
                            c10 = c11;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        inVar = l11Var2;
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
                        AndroidUtilities.runOnUIThread(new me(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f41225g5 = of2;
                        Hb(of2);
                    }
                    messageObject = this.f41311n5;
                    if (messageObject != null || this.X3 == messageObject) {
                        if (message == null && ((messageObject2 = this.X3) == null || messageObject2.getId() != message.f20293id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f41311n5 = messageObject3;
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
                                            obj7.f37923a = messageObject3;
                                            obj7.f37924b = -1;
                                            obj7.f37925c = -1;
                                            obj7.d = -1;
                                            obj7.f37932m = true;
                                            obj7.e(i24, arrayList);
                                            inVar3 = obj7;
                                        }
                                        this.f41285l5 = inVar3;
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
                                        this.f41285l5 = inVar2;
                                    }
                                }
                            }
                            Y6(false);
                            in inVar4 = this.f41285l5;
                            if (inVar4 != null) {
                                Gb(this.f41311n5, inVar4);
                            } else {
                                Fb(this.f41311n5);
                            }
                            lc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j11 && this.e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20272id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f41311n5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Fb(messageObject4);
                            lc(false);
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
                    this.f41225g5 = of22;
                    Hb(of22);
                }
                messageObject = this.f41311n5;
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
        this.R8 = z10;
        org.telegram.ui.ActionBar.m1 m1Var = this.Q8;
        if (m1Var != null) {
            m1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f41169bc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f41169bc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f41169bc = ofFloat;
            ofFloat.addUpdateListener(new oe(this, 0));
            this.f41169bc.setDuration(150L);
            this.f41169bc.start();
        }
    }

    public final MessageObject.GroupedMessages D8(long j10) {
        return (MessageObject.GroupedMessages) this.f41439x6.f(j10);
    }

    public final boolean D9() {
        if (this.e != null) {
            return getMessagesController().isChatNoForwards(this.e);
        }
        return getMessagesController().isUserNoForwards(this.f41151a8);
    }

    public final void Da(java.util.ArrayList r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Da(java.util.ArrayList, boolean):void");
    }

    public final void Db(boolean z10, MessageObject messageObject, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        Cb(z10, messageObject, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void Dc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f41237h4 && !this.J4.isEmpty() && this.H4.size() == 1 && ((Integer) this.H4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.J4.get(this.H4.get(0));
        } else {
            messageObject = null;
        }
        this.Y3 = messageObject;
        if (this.f41237h4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f41175c4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.e, this.Y3.messageOwner.from_id)) {
            this.Y3 = null;
        }
    }

    @Override
    public final void E(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            rh.c cVar = this.Cc;
            if (cVar != null) {
                this.X0.removeView(cVar);
                this.Cc = null;
            }
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.F0();
            }
        }
    }

    public final int E6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f41433x0.getHeight();
        int i11 = 0;
        long j10 = 0;
        while (true) {
            View U0 = this.f41433x0.U0(i10);
            if (U0 == null) {
                break;
            }
            if (U0 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) U0;
                messageObject = u1Var.getMessageObject();
                additionalPaddingHeight = u1Var.getAdditionalPaddingHeight();
            } else if (U0 instanceof org.telegram.ui.Cells.x0) {
                messageObject = ((org.telegram.ui.Cells.x0) U0).getMessageObject();
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

    public final long E7(MessageObject messageObject) {
        if (this.R3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.e) && !this.f41237h4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f20324id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.e));
        }
        return this.f41188d4;
    }

    public final float E8() {
        sn snVar = this.f41194da;
        if (snVar == null) {
            snVar = this;
        }
        ek ekVar = snVar.f41331p1;
        if (ekVar == null) {
            return 0.0f;
        }
        return ekVar.f25630b;
    }

    public final boolean E9() {
        int i10 = this.R3;
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
                    this.V7 = generatePicturePath.getAbsolutePath();
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
                tp0 tp0Var = new tp0(0, z10, true, this);
                if (this.R3 == 9) {
                    tp0Var.G = 1;
                    tp0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        tp0Var.G = 10;
                        tp0Var.H = true;
                    } else {
                        MessageObject messageObject = this.p5;
                        if (messageObject != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (messageObject == null) {
                            z11 = true;
                        }
                        tp0Var.G = i11;
                        tp0Var.H = z11;
                    }
                }
                tp0Var.V = new ll(this);
                presentFragment(tp0Var);
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
                        this.V7 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Eb(ArrayList arrayList) {
        Cb(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void Ec(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f41293m1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41257j1.e(4, z11, z10);
        this.f41257j1.c(4, this.f41293m1, z10);
    }

    public final float F6(boolean z10) {
        float f7;
        float f10;
        float f11;
        hk hkVar = this.Y;
        float f12 = 0.0f;
        if (hkVar != null) {
            if (z10) {
                f7 = hkVar.f23973k5;
            } else {
                f7 = hkVar.f23967j5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        ne.b bVar = this.f41431wc;
        j6.l lVar = this.Bc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f14283a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f14283a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f17380f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f14284b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.e;
            f11 = f13;
        }
        if (!this.Pa && !isInPreviewMode()) {
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
        if (this.f41289l9 == null) {
            this.f41289l9 = new org.telegram.ui.Cells.u1(getParentActivity(), this.currentAccount, true, this.Ca, this.f41205ea);
        }
        org.telegram.ui.Cells.u1 u1Var = this.f41289l9;
        if (this.e == null && !UserObject.isUserSelf(this.f41208f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1Var.N7 = z11;
        org.telegram.ui.Cells.u1 u1Var2 = this.f41289l9;
        int i10 = this.R3;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        u1Var2.P7 = z12;
        if (i10 == 3 && this.Pa) {
            z13 = true;
        } else {
            z13 = false;
        }
        u1Var2.Q7 = z13;
        TLRPC.User user = this.f41208f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        u1Var2.R7 = z14;
        if (ChatObject.isChannel(this.e) && this.e.megagroup) {
            z15 = true;
        }
        u1Var2.S7 = z15;
        this.f41289l9.E8 = y9();
        this.f41289l9.F8 = H9();
        this.f41289l9.G8 = G9();
        return this.f41289l9.g1(messageObject, (MessageObject.GroupedMessages) this.f41439x6.f(messageObject.getGroupId()), z10);
    }

    public final boolean F9() {
        return !TextUtils.isEmpty(this.U3);
    }

    public final void Fa(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Fa(int):void");
    }

    public final void Fb(MessageObject messageObject) {
        Db(true, messageObject, null, false, true);
    }

    public final void Fc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.l1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41257j1.e(3, z11, z10);
        this.f41257j1.c(3, this.l1, z10);
    }

    @Override
    public final boolean G() {
        return this.f41252i8;
    }

    public final boolean G6() {
        if (!E9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f41237h4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                lk lkVar = this.O0;
                if (lkVar == null || lkVar.getVisibility() != 0) {
                    if (!K9() || this.f41237h4) {
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
        org.telegram.ui.Components.q31 q31Var = this.R1;
        if (q31Var != null && q31Var.Q && q31Var.f29557a.f17380f) {
            return true;
        }
        return false;
    }

    public final boolean Ga(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f41216f8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f41208f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f41216f8 == this.T5) {
                this.f41216f8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f41216f8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((n2Var instanceof sn) && ((sn) n2Var).T5 == this.f41216f8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f41216f8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f41216f8));
                } else if (DialogObject.isUserDialog(this.f41216f8)) {
                    bundle.putLong("user_id", this.f41216f8);
                } else {
                    bundle.putLong("chat_id", -this.f41216f8);
                }
                y6();
                presentFragment(new sn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Gb(MessageObject messageObject, in inVar) {
        Cb(true, messageObject, null, null, null, true, 0, inVar, false, 0L, null, true);
    }

    public final void Gc(boolean z10) {
        String string;
        if (this.R3 != 3 && !UserObject.isBotForum(this.f41208f)) {
            jj jjVar = this.f41145a1;
            if (jjVar != null && this.f41188d4 != 0) {
                if (this.f41237h4) {
                    Wc();
                } else if (this.f41224g4) {
                    MessageObject messageObject = this.X3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f41145a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f41145a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.X3;
                    if (messageObject2 != null) {
                        jjVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f41161b4 != null) {
                if (this.X3.getRepliesCount() == 0) {
                    if (this.f41224g4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f41161b4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final boolean H6() {
        if (this.h == null) {
            lk lkVar = this.O0;
            if (lkVar == null || lkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H7() {
        if (getParentActivity() != null && getParentActivity() != null && this.J1 == null) {
            ci.b3 b3Var = new ci.b3(this, getParentActivity(), this, this.f41205ea, 2);
            this.J1 = b3Var;
            b3Var.Z = a();
            ci.b3 b3Var2 = this.J1;
            b3Var2.f30583i0 = true;
            b3Var2.f30566c2 = new jl(this);
        }
    }

    public final SendMessageChatArguments H8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.R3 == 9) {
            builder.setWelcomeMessageChatId(this.f41391ta);
        }
        if (this.R3 == 5) {
            builder.setQuickReplyShortcut(this.Q3, M8());
        }
        return builder.build();
    }

    public final boolean H9() {
        if (this.R1 == null) {
            if (this.T3 || !ChatObject.isMonoForum(this.e)) {
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
        tL_message.f20293id = 0;
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

    public final void Hb(MessageSuggestionParams messageSuggestionParams) {
        Cb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Hc(MessageObject messageObject, int i10) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.q6;
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
            MessageObject messageObject3 = (MessageObject) this.f41325o6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                fm fmVar = this.A0;
                if (fmVar != null) {
                    fmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    @Override
    public final long I() {
        return this.L6;
    }

    public final boolean I6(MessageObject messageObject) {
        if (this.R3 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20272id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.R3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void I7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        mg mgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.W5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f41208f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.Z7;
        long j10 = this.L6;
        int d = (int) d();
        int i10 = this.R3;
        mg mgVar2 = new mg(this, 4);
        if (z10) {
            mgVar = new mg(this, 5);
        } else {
            mgVar = null;
        }
        mg mgVar3 = mgVar;
        org.telegram.ui.Components.f5.y(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.W5, groupedMessages, d, i10, null, mgVar2, mgVar3, this.f41205ea);
    }

    public final boolean I9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f41170c && !this.d && this.f41208f == null && this.f41433x0 != null && SharedConfig.animationsEnabled()) {
            if (this.f41254ib == null) {
                this.f41254ib = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f41254ib.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f41433x0.getChildCount(); i12++) {
                    i11 += this.f41433x0.getChildAt(i12).getHeight();
                    int top = this.f41433x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f41377s9) {
                    O6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.C6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f41400u6;
                if ((!z12 || ((this.L6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.G6 && f10 > this.f41377s9 && (!arrayList.isEmpty() ? i11 != 0 : this.f41243hb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.Q0) == null || frameLayout.getVisibility() != 0 || this.Q0.getChildCount() <= 0) {
                    if (!z10 && this.N6 == 0) {
                        O6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.R9 && this.fragmentBeginToShow) {
                        if (z10 && this.N6 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable e = this.f41205ea.e();
                        lm lmVar = this.X0;
                        if (lmVar != null) {
                            e = lmVar.getBackgroundImage();
                        }
                        if (e instanceof org.telegram.ui.Components.wc0) {
                            org.telegram.ui.Components.wc0 wc0Var = (org.telegram.ui.Components.wc0) e;
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
                    if (z10 || (this.N6 != 0 && System.currentTimeMillis() - this.N6 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Ia() {
        int i10;
        this.H4.clear();
        this.J4.clear();
        this.L4 = 0;
        this.P4 = 0;
        this.Q4 = 0;
        Cc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.Z7;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.R4 = true;
        Dc();
    }

    public final void Ib(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        Db(z10, null, webPage, z11, true);
    }

    public final void Ic(boolean z10) {
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.M1(z10);
        }
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.R3 != 0 || this.f41188d4 != 0 || (chatFull = this.Z7) == null || chatFull.ttl_period == 0)) || ((user = this.f41208f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f41151a8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.s0 s0Var = this.f41171c0;
            if (s0Var != null) {
                s0Var.e(8);
            }
            jj jjVar = this.f41145a1;
            if (jjVar != null) {
                jjVar.f29012a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.s0 s0Var2 = this.f41171c0;
            if (s0Var2 != null) {
                s0Var2.e(0);
            }
            jj jjVar2 = this.f41145a1;
            if (jjVar2 != null) {
                jjVar2.f29012a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.s0 s0Var3 = this.f41368s0;
        if (s0Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s0Var3.e(i11);
        }
        jj jjVar3 = this.f41145a1;
        if (jjVar3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f41208f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            jjVar3.setCommunityItemVisible(z11);
            final jj jjVar4 = this.f41145a1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = jjVar4.E;
            ImageView imageView2 = jjVar4.f29041y;
            if (imageView2 != null && imageView != null) {
                jjVar4.f29027l0 = z12;
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
                                    oo ooVar = jjVar4;
                                    if (!z14) {
                                        ooVar.f29041y.setVisibility(4);
                                        return;
                                    } else {
                                        ooVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    oo ooVar2 = jjVar4;
                                    if (!z15) {
                                        ooVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        ooVar2.getClass();
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
                                    oo ooVar = jjVar4;
                                    if (!z14) {
                                        ooVar.f29041y.setVisibility(4);
                                        return;
                                    } else {
                                        ooVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    oo ooVar2 = jjVar4;
                                    if (!z15) {
                                        ooVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        ooVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f41145a1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f41151a8;
                if (userFull2 != null) {
                    this.f41145a1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.Z7;
                    if (chatFull3 != null) {
                        this.f41145a1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f41354r0 != null && (chatFull2 = this.Z7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.s0 s0Var4 = this.f41354r0;
            if (z13) {
                i12 = 0;
            }
            s0Var4.e(i12);
        }
        p();
    }

    public final void J7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.J7(boolean):void");
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f20292id)) {
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
        if (messageObject == this.Mb) {
            this.Mb = null;
            Uc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.T5);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Jb(boolean z10) {
        if (this.X2 != null && !E9()) {
            if (this.X2.getTag() == null) {
                AnimatorSet animatorSet = this.f41223g3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.X2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f41223g3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f41223g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 1.0f));
                this.f41223g3.addListener(new qi(this, 5));
                this.f41223g3.start();
            }
            if (!z10) {
                w9();
                this.f41146a3 = 1000;
            }
        }
    }

    public final void Jc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        kh.h hVar = this.f41257j1;
        boolean z12 = false;
        if (hVar != null) {
            int i14 = 2;
            if (this.Qa) {
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
                ((jh.b) eVar.f2818b).b(z10, true);
            }
            kh.h hVar2 = this.f41257j1;
            if (this.Qa) {
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
                ((jh.b) eVar2.f2818b).b(z11, true);
            }
        }
        this.f41423w3 = i12;
        this.f41436x3 = i11;
        Kc();
        org.telegram.ui.Components.q6 q6Var = this.V2;
        if (q6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            q6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.V2.animate();
            if (i12 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
        }
    }

    @Override
    public final boolean K(ey eyVar) {
        return false;
    }

    public final void K6() {
        if (this.Pa) {
            return;
        }
        if (F9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int K8() {
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        int i10 = 0;
        if (d5Var == null || d5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(i10);
                if (n2Var != this && (n2Var instanceof sn) && ((sn) n2Var).T5 == this.T5) {
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
        if (this.X3 != null) {
            return true;
        }
        return false;
    }

    public final void Ka(MessageObject messageObject) {
        ArrayList arrayList = this.f41400u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fm fmVar = this.A0;
            if (fmVar != null && !fmVar.N) {
                fmVar.u(fmVar.J + indexOf);
            }
        }
    }

    public final void Kb(boolean z10) {
        if (this.Y2 != null && !E9()) {
            if (this.Y2.getTag() == null) {
                ValueAnimator valueAnimator = this.f41236h3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.Y2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41247i3, 1.0f);
                this.f41236h3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f41236h3.addUpdateListener(new oe(this, 2));
                this.f41236h3.addListener(new qi(this, 7));
                this.f41236h3.start();
            }
            if (!z10) {
                w9();
                this.f41146a3 = 1000;
            }
        }
    }

    public final void Kc() {
        org.telegram.ui.Components.q6 q6Var = this.U2;
        if (q6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f41423w3;
            if (i10 < 0) {
                q6Var.c("", z10, true);
            } else if (i10 == 0) {
                q6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f41357r3) {
                q6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.R3 != 7 && !this.yc.f17380f) {
                q6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f41436x3 + 1), Integer.valueOf(this.f41423w3)), z10, true);
            } else {
                q6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void L6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.L6():void");
    }

    public final boolean L7(android.view.View r97, boolean r98, boolean r99, float r100, float r101, boolean r102, boolean r103, boolean r104) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.L7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final int L8() {
        return Math.max(this.P4, this.Q4);
    }

    public final void L9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.f41400u6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            MessageObject messageObject = (MessageObject) i0.a.h(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.C6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() != this.L6) {
                            i13 = 0;
                        }
                        j(id2, 0, false, i13, true, 0);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.T5)) {
                int N0 = this.f41458z0.N0();
                int L0 = this.f41458z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        fm fmVar = this.A0;
                        int i14 = fmVar.J;
                        if (L0 >= i14 && L0 < fmVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
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
                this.W8.e(i11);
                org.telegram.ui.ActionBar.b2 b2Var = this.f41339pb;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                Bc(false);
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f41205ea);
                this.f41339pb = b2Var2;
                b2Var2.setOnCancelListener(this.f41302ma);
                this.f41339pb.q(1000L);
                int i15 = this.V5;
                this.Y8 = i15;
                this.f41152a9 = false;
                this.f41239h6.add(Integer.valueOf(i15));
                this.Z8 = 0;
                this.f41166b9 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.T5;
                long j11 = this.L6;
                int i16 = this.classGuid;
                int i17 = this.R3;
                long j12 = this.f41188d4;
                int i18 = this.f41296m4;
                int i19 = this.V5;
                this.V5 = i19 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j12, i18, i19, this.f41237h4);
                this.X2.setAlpha(0.0f);
                this.X2.setTag(null);
                this.f41247i3 = 0.0f;
                pc();
                this.Y2.setTag(null);
            }
        }
    }

    public final void La(MessageObject messageObject) {
        ArrayList arrayList = this.f41400u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fm fmVar = this.A0;
            if (fmVar != null && !fmVar.N) {
                fmVar.P(fmVar.J + indexOf, true);
            }
        }
    }

    public final boolean Lb() {
        hk hkVar = this.Y;
        if (hkVar != null && hkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f41198e2 == null) {
                    if (!this.f41162b5) {
                        hk hkVar2 = this.Y;
                        if (hkVar2 != null) {
                            hkVar2.S();
                            MediaDataController.getInstance(hkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar = hkVar2.U0;
                            dgVar.L(false, false);
                            dgVar.Q(false, false);
                            dgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        lm lmVar = this.X0;
                        int indexOfChild = lmVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            hk hkVar3 = this.Y;
                            hkVar3.S();
                            MediaDataController.getInstance(hkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar2 = hkVar3.U0;
                            dgVar2.L(false, false);
                            dgVar2.Q(false, false);
                            dgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f41422w2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            lmVar.addView(this.f41422w2, i10, w7.z5.a(10.0f, 37.0f, 0.0f, 0.0f, 27.0f, 10, 83));
                            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(9, getParentActivity(), this.f41205ea, false);
                            this.f41198e2 = r40Var;
                            r40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            lmVar.addView(this.f41198e2, i10, w7.z5.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 83));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.r40 r40Var2 = this.f41198e2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(r40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f41422w2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new qi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f41198e2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Lc() {
        P7();
        String str = this.f41397u3;
        if (str != null) {
            this.f41186d2.e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.L3.setEmptyView(this.f41186d2);
            return;
        }
        this.L3.setEmptyView(null);
        this.f41186d2.setVisibility(8);
    }

    public final void M6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.f41431wc.e) * (1.0f - this.f41405uc.e) * ((float[]) this.Bc.f14284b)[i10];
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
        if (this.R3 == 5) {
            return (int) this.f41188d4;
        }
        return 0;
    }

    public final void M9() {
        this.D4 = true;
        if (this.f41298m6) {
            getMessagesStorage().getUnreadMention(this.T5, d(), new ug(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.T5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f41237h4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f41188d4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f41286l6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new xc(4, this, messagesStorage));
    }

    public final void Ma() {
        if (this.P7 == null && this.Q7 == null && this.R7 == null) {
            me meVar = this.U7;
            if (meVar != null) {
                AndroidUtilities.cancelRunOnUIThread(meVar);
                this.U7 = null;
            }
            this.L7 = Integer.MAX_VALUE;
            this.N7 = false;
            this.O7 = 0L;
            this.P7 = null;
            this.Q7 = null;
            this.R7 = null;
        }
    }

    public final void Mb() {
        TLRPC.ChatFull chatFull = this.Z7;
        if (chatFull != null && !this.f41346q5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new me(this, 17), 1000L);
            }
        }
    }

    public final void Mc() {
        boolean z10;
        if (this.f41257j1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f41371s3 && !this.f41357r3) || (this.R3 == 7 && this.O3 == 2 && !this.f41400u6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41257j1.e(6, z10, true);
        this.f41257j1.e(5, z10, true);
        if (z10) {
            this.f41257j1.e(1, false, true);
        }
        if (!z10) {
            this.B7 = 0;
        }
        this.X0.invalidate();
    }

    public final boolean N6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.Z7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            sg.j0.D1(this, this.D1, this.E1, this.T5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void N7() {
        if (this.h == null && this.f41435x2 == null && getParentActivity() != null) {
            el elVar = new el(this, getParentActivity());
            this.f41435x2 = elVar;
            elVar.setTag(1);
            this.M0.addView(this.f41435x2, w7.z5.n(-1, 48));
            this.M0.h(1, this.f41435x2);
            this.M0.g(this.f41435x2);
            this.f41435x2.setOnClickListener(new xe(this, 17));
            this.f41435x2.setEnabled(!isInPreviewMode());
            this.f41435x2.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            org.telegram.ui.Components.pg0 pg0Var = new org.telegram.ui.Components.pg0(getParentActivity(), this.f41205ea);
            this.f41460z2 = pg0Var;
            this.f41435x2.addView(pg0Var, w7.z5.a(48.0f, 13.0f, 0.0f, 0.0f, 0.0f, 3, 51));
            this.f41435x2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.F2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.F2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21028fe));
            this.F2.setTypeface(AndroidUtilities.bold());
            this.f41435x2.addView(this.F2, w7.z5.a(18.0f, 23.0f, 7.0f, 44.0f, 0.0f, -1, 51));
            for (int i10 = 0; i10 < 2; i10++) {
                rn rnVar = new rn(this, getParentActivity());
                rn[] rnVarArr = this.C2;
                rnVarArr[i10] = rnVar;
                rnVar.setTextSize(14);
                rnVarArr[i10].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21028fe));
                rnVarArr[i10].setTypeface(AndroidUtilities.bold());
                this.f41435x2.addView(rnVarArr[i10], w7.z5.a(18.0f, 23.0f, 7.3f, 44.0f, 0.0f, -1, 51));
                fl flVar = new fl(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.D2;
                j5VarArr[i10] = flVar;
                flVar.setTextSize(14);
                j5VarArr[i10].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21047ge));
                this.f41435x2.addView(j5VarArr[i10], w7.z5.a(18.0f, 23.0f, 25.3f, 44.0f, 0.0f, -1, 51));
                ai.ud udVar = new ai.ud(getParentActivity(), 14);
                udVar.setSingleLine(true);
                udVar.setLines(1);
                udVar.setMaxLines(1);
                udVar.setEllipsize(TextUtils.TruncateAt.END);
                udVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
                udVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                udVar.setTextSize(1, 14.0f);
                udVar.setTypeface(AndroidUtilities.bold());
                udVar.setGravity(17);
                udVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                ai.ud[] udVarArr = this.E2;
                udVarArr[i10] = udVar;
                this.f41435x2.addView(udVar, w7.z5.a(28.0f, 0.0f, 10.0f, 14.0f, 0.0f, -2, 53));
                gl glVar = new gl(getParentActivity());
                glVar.I = new wh.g();
                glVar.H = new Path();
                glVar.J = new float[8];
                org.telegram.ui.Components.w9[] w9VarArr = this.B2;
                w9VarArr[i10] = glVar;
                glVar.setBlurAllowed(true);
                w9VarArr[i10].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f41435x2.addView(w9VarArr[i10], w7.z5.a(32.0f, 22.0f, 8.0f, 0.0f, 0.0f, 32, 51));
                if (i10 == 1) {
                    rnVarArr[i10].setVisibility(4);
                    udVarArr[i10].setVisibility(4);
                    j5VarArr[i10].setVisibility(4);
                    w9VarArr[i10].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.L2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.L2;
            int i11 = org.telegram.ui.ActionBar.h6.f20992de;
            int themedColor = getThemedColor(i11);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            ImageView imageView3 = this.L2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.L2.setContentDescription(LocaleController.getString(R.string.AccPinnedMessagesList));
            this.L2.setVisibility(4);
            this.L2.setAlpha(0.0f);
            this.L2.setScaleX(0.4f);
            this.L2.setScaleY(0.4f);
            ImageView imageView4 = this.L2;
            int i12 = org.telegram.ui.ActionBar.h6.f21357x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12) & 436207615, 1, -1));
            this.f41435x2.addView(this.L2, w7.z5.a(48.0f, 0.0f, 0.0f, 7.0f, 0.0f, 36, 53));
            this.L2.setOnClickListener(new xe(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.J2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.J2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), mode));
            this.J2.setScaleType(scaleType);
            this.J2.setVisibility(8);
            this.J2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f41205ea);
            this.K2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.K2.setSize(AndroidUtilities.dp(16.0f));
            this.K2.setStrokeWidth(2.0f);
            this.K2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21010ee));
            this.f41435x2.addView(this.K2, w7.z5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 36, 53));
            this.J2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f41435x2.addView(this.J2, w7.z5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 36, 53));
            this.J2.setOnClickListener(new xe(this, 19));
            Bc(false);
        }
    }

    public final long N8() {
        if (this.R3 == 3) {
            return this.f41188d4;
        }
        return 0L;
    }

    public final void N9(boolean z10) {
        TLRPC.Chat chat;
        if (this.ha == null && (chat = this.e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.T5);
            this.ha = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.P1(false, z10);
            }
        }
    }

    public final void Na(boolean z10) {
        MessageObject messageObject = this.J7;
        if (messageObject != null) {
            if (z10) {
                boolean[] zArr = this.E6;
                zArr[1] = true;
                zArr[0] = true;
                this.H7 = 0;
                this.K6 = 0;
            }
            this.D7 = 0;
            this.E7 = false;
            Ka(messageObject);
            this.J7 = null;
        }
    }

    public final void Nb(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f29639j = max;
        G.v = new df(this, i10, 3);
        G.k(true);
        this.G3 = messageObject;
        this.H3 = i10;
    }

    public final void Nc(String str) {
        if (this.R3 == 7 && !TextUtils.equals(this.f41397u3, str)) {
            P7();
            Pb(true);
            this.f41397u3 = str;
            this.f41384t3 = str;
            U6(false);
            A7(true);
            this.N6 = 0L;
            this.f41276k7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.O3);
            this.M3.l();
            this.L3.requestLayout();
            if (this.L3.getLayoutManager() != null) {
                this.L3.getLayoutManager().n0(0);
            }
            Lc();
            this.f41186d2.e(true, true);
            v8();
        }
    }

    public final void O6(boolean z10) {
        if (this.N6 == 0) {
            if (z10 && !this.O6.isEmpty()) {
                this.N6 = System.currentTimeMillis();
            } else {
                this.N6 = 1L;
            }
            I9();
            pj pjVar = this.f41433x0;
            if (pjVar != null) {
                pjVar.invalidate();
            }
        }
    }

    public final void O7() {
        int i10;
        int i11;
        if (this.R2 == null && getParentActivity() != null) {
            kk kkVar = new kk(this, getParentActivity(), 1);
            this.R2 = kkVar;
            kkVar.setClickable(false);
            this.R2.setWillNotDraw(false);
            this.Bc.i(4, false, false);
            this.R2.setClipToPadding(false);
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), true, true, true);
            this.U2 = q6Var;
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
            q6Var.b(0.25f, 280L, bsVar);
            this.U2.setTextSize(AndroidUtilities.dp(15.0f));
            this.U2.setTypeface(AndroidUtilities.bold());
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21381ye));
            this.U2.setGravity(3);
            this.R2.addView(this.U2, w7.z5.a(30.0f, 0.0f, -1.0f, 97.33f, 0.0f, -2, 16));
            this.U.addView(this.R2, w7.z5.a(44.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 80));
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(getParentActivity(), true, false, true);
            this.V2 = q6Var2;
            q6Var2.b(0.0f, 420L, bsVar);
            this.V2.setScaleProperty(0.7f);
            this.V2.setTextSize(AndroidUtilities.dp(15.0f));
            this.V2.setGravity(5);
            this.V2.setTypeface(AndroidUtilities.bold());
            this.V2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21189o6));
            org.telegram.ui.Components.q6 q6Var3 = this.V2;
            if (this.yc.f17380f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            q6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.q6 q6Var4 = this.V2;
            q6Var4.f29580n = false;
            q6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.V2.setOnClickListener(new xe(this, 2));
            this.V2.setAlpha(0.5f);
            this.V2.setClickable(false);
            this.R2.addView(this.V2, w7.z5.e(-2, -1, 117));
            org.telegram.ui.Components.q6 q6Var5 = new org.telegram.ui.Components.q6(getParentActivity(), true, true, true);
            this.W2 = q6Var5;
            q6Var5.setGravity(17);
            this.W2.setTypeface(AndroidUtilities.bold());
            this.W2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ae));
            this.W2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.q6 q6Var6 = this.W2;
            int i12 = org.telegram.ui.ActionBar.h6.f20986d6;
            q6Var6.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i12), org.telegram.ui.ActionBar.h6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.h6.f21075i6))));
            org.telegram.ui.Components.q6 q6Var7 = this.W2;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            q6Var7.setText(LocaleController.getString(i11));
            this.W2.setOnClickListener(new xe(this, 3));
            this.W2.setVisibility(8);
            this.W2.setAlpha(0.0f);
            this.R2.addView(this.W2, w7.z5.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.e.megagroup) && this.R3 != 7 && !ChatObject.isMonoForum(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.T2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.T2.setImageResource(R.drawable.msg_usersearch);
                this.T2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21364xe), PorterDuff.Mode.MULTIPLY));
                this.T2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21393z8), 1, -1));
                this.R2.addView(this.T2, w7.z5.a(44.0f, 48.0f, 0.0f, 0.0f, 0.0f, 44, 51));
                this.T2.setOnClickListener(new xe(this, 4));
                this.T2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.R3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.S2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.S2.setImageResource(R.drawable.msg_calendar);
                this.S2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21364xe), PorterDuff.Mode.MULTIPLY));
                this.S2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21393z8), 1, -1));
                this.R2.addView(this.S2, w7.z5.a(44.0f, 2.66f, 0.0f, 0.0f, 0.0f, 44, 51));
                this.S2.setOnClickListener(new xe(this, 5));
                this.S2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int O8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f41433x0.getMeasuredHeight() - this.Ba) - this.f41377s9) - this.v.e()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
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
        fm fmVar;
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
            hVar = this.f41439x6;
            arrayList2 = this.f41400u6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.J4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f41325o6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f41208f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f41208f.f20419id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Xa();
                this.Qb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Pb.bind(messageObject2.messageOwner.f20293id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f20293id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.J4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.L4) {
                    Cc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f41335p6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.R3 == 1))) {
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
                    HashMap hashMap2 = this.f41360r6;
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
                                groupedMessages2.reversed = this.Qa;
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
                    if (this.R3 == 3) {
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
                        fm fmVar2 = this.A0;
                        if (fmVar2 != null && !fmVar2.N) {
                            fmVar2.Q(fmVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        fm fmVar3 = this.A0;
                        if (fmVar3 != null && !fmVar3.N) {
                            fmVar3.u(fmVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.h hVar3 = this.f41387t6;
                        if (((MessageObject) hVar3.f(id4)) != null) {
                            hVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            fm fmVar4 = this.A0;
                            int i22 = fmVar4.E;
                            int i23 = fmVar4.F;
                            int i24 = fmVar4.H;
                            int i25 = fmVar4.G;
                            if (!fmVar4.N) {
                                fmVar4.u(fmVar4.J + indexOf2);
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
                                this.f41374s6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                fm fmVar5 = this.A0;
                                int i26 = fmVar5.E;
                                int i27 = fmVar5.F;
                                int i28 = fmVar5.H;
                                int i29 = fmVar5.G;
                                if (!fmVar5.N) {
                                    fmVar5.u(fmVar5.J + indexOf2);
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
                                        Hc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Hc(messageObject, messageObject2.getId());
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
                    int indexOf3 = arrayList2.indexOf((MessageObject) i0.a.h(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (fmVar = this.A0) != null) {
                        fmVar.q(indexOf3 + fmVar.J, groupedMessages3.messages.size());
                        rj rjVar = this.f41447y0;
                        if (rjVar != null) {
                            rjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        Dc();
    }

    public final void Ob(boolean z10) {
        boolean z11;
        kh.h hVar = this.f41257j1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.B7 = 0;
            }
        }
    }

    public final void Oc() {
        hk hkVar;
        if (this.R != null) {
            this.E0.setBackground(null);
            this.E0.setOnClickListener(null);
            boolean z10 = true;
            if (this.R3 == 3 && N8() == 2666000) {
                this.E0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.R.setVisibility(0);
                this.I1.setVisibility(8);
                this.I1.setTag(null);
                wc();
                org.telegram.ui.Components.gz0 gz0Var = this.f41185d1;
                if (gz0Var != null) {
                    gz0Var.f();
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
                                int i10 = org.telegram.ui.ActionBar.h6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                zqVar.e = dp;
                                zqVar.f32995f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                zqVar.h = dp3;
                                zqVar.f32996n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(zqVar, 1), 0, 1, 33);
                                this.E0.setBackground(org.telegram.ui.ActionBar.h6.h0(0, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21075i6, false)));
                                this.E0.setText(spannableStringBuilder);
                                this.E0.setOnClickListener(new xe(this, 0));
                            } else {
                                this.E0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.E0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.E0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.e.banned_rights.until_date)));
                        }
                        this.R.setVisibility(0);
                        this.I1.setVisibility(8);
                        this.I1.setTag(null);
                        wc();
                        org.telegram.ui.Components.gz0 gz0Var2 = this.f41185d1;
                        if (gz0Var2 != null) {
                            gz0Var2.f();
                        }
                    }
                }
                J7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.Y0 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a1.g.s(new StringBuilder("<b>"), this.f41208f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.T5, this.f41188d4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.R.setVisibility(4);
                            if (!this.inPreviewMode && !this.Pa && this.R3 != 3) {
                                this.Y.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    Z6();
                    J6(false);
                } else {
                    this.R.setVisibility(4);
                    if (this.f41185d1 != null && (hkVar = this.Y) != null && hkVar.i0()) {
                        this.f41185d1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.R.setVisibility(4);
            }
            if (z10) {
                this.Y.k0(false);
                if (getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    public final void P6(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        MessageObject messageObject2 = this.p5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f41214f5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.G5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.G5 = null;
                hk hkVar = this.Y;
                if (hkVar != null) {
                    hkVar.X2 = null;
                    hkVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f41214f5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = hkVar.getFieldText();
                    MessageObject messageObject3 = this.f41311n5;
                    if (messageObject3 == this.X3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f41285l5, this.p5);
                }
                l8();
                m8();
            }
        }
    }

    public final void P7() {
        if (this.f41186d2 == null && this.f41382t1 == null) {
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getParentActivity(), this.f41205ea);
            this.f41173c2 = b10Var;
            b10Var.setViewType(7);
            org.telegram.ui.Components.rx0 rx0Var = new org.telegram.ui.Components.rx0(getParentActivity(), this.f41173c2, 1, null);
            this.f41186d2 = rx0Var;
            rx0Var.setClickable(true);
            this.f41186d2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f41186d2.setVisibility(8);
            this.f41186d2.addView(this.f41173c2, 0);
            this.f41186d2.e(true, false);
            this.K3.addView(this.f41186d2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f41382t1 = m40Var;
            m40Var.setOnHashtagClickListener(new ze(this, 2));
            this.f41382t1.setOnScrollListener(new k3(this, 5));
            this.f41382t1.setVisibility(8);
            this.K3.addView(this.f41382t1, -1, -1);
            u7();
            s7();
        }
    }

    public final int P8(MessageObject messageObject) {
        return O8(F8(messageObject, !TextUtils.isEmpty(this.P7))) - Ya(messageObject);
    }

    public final si P9(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle) {
        pf.c cVar = this.Ab;
        if (cVar != null) {
            cVar.a(true);
            this.Ab = null;
        }
        if (characterStyle != null && u1Var != null && u1Var.getMessageObject() != null) {
            si siVar = new si(this, u1Var.getMessageObject().getId(), characterStyle, u1Var, 0);
            this.Ab = siVar;
            return siVar;
        }
        this.Ab = null;
        return null;
    }

    public final void Pa() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f41401u7 = 0;
        this.f41276k7 = false;
        this.f41287l7 = true;
        this.f41239h6.clear();
    }

    public final void Pb(boolean z10) {
        int i10;
        if (this.K3 != null) {
            ne.b bVar = this.yc;
            if (bVar.f17380f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.R3 == 7) {
                    s4.b0 b0Var = (s4.b0) this.L3.getLayoutManager();
                    Object E = this.M3.E((b0Var.N0() + b0Var.L0()) / 2);
                    Object E2 = this.M3.E(b0Var.L0());
                    Object E3 = this.M3.E(b0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f41458z0.L0();
                        int N0 = this.f41458z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f20293id;
                        int i12 = ((MessageObject) E2).messageOwner.f20293id;
                        int i13 = ((MessageObject) E3).messageOwner.f20293id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f20293id == i12) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f20293id == i13) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f20293id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.f41458z0.h1(this.A0.J + i14, (this.f41433x0.getHeight() - F8((MessageObject) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.q6 q6Var = this.V2;
                if (q6Var != null) {
                    if (bVar.f17380f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    q6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                ei.x3 x3Var = this.f41434x1;
                if (x3Var != null && x3Var.V) {
                    x3Var.e(true);
                }
                rl rlVar = this.B1;
                if (rlVar != null && rlVar.V) {
                    rlVar.e(true);
                }
                hk hkVar = this.Y;
                if (hkVar != null) {
                    hkVar.j0();
                }
                Kc();
            }
        }
    }

    public final void Pc() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i12 = (a() > getUserConfig().getClientUserId() ? 1 : (a() == getUserConfig().getClientUserId() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.W5;
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
            xk xkVar = this.f41168bb;
            if (xkVar != null) {
                xkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f41168bb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                xk xkVar2 = this.f41168bb;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                xkVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new me(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.cl0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.u0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.xj0 xj0Var = k10.f21754x;
                if (xj0Var != null && k10.f21755y != i10) {
                    k10.f21755y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(xj0Var, i10);
                }
            }
        }
        if (this.Y9 != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i15));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i16));
            }
            this.Y9.setSelectedMessages(arrayList2);
        }
    }

    public final void Q6() {
        MessageObject editingMessageObject;
        int abs;
        hk hkVar = this.Y;
        if (hkVar != null && (editingMessageObject = hkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f41208f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.ap[]) this.f41144a0.f901b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        j5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new mg(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.xe xeVar = this.Y.F1;
                if (xeVar != null) {
                    xeVar.setVisibility(8);
                }
                j5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView Q7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f41454y8);
        if (this.f41389t8 == null) {
            kk kkVar = new kk(this, getParentActivity(), 2);
            this.f41389t8 = kkVar;
            kkVar.setOutlineProvider(new il(this));
            this.f41389t8.setClipToOutline(true);
            this.f41389t8.setWillNotDraw(false);
            o4 o4Var = new o4(getParentActivity());
            this.f41414v8 = o4Var;
            o4Var.setBackgroundColor(0);
            if (z10) {
                this.f41389t8.addView(this.f41414v8, w7.z5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f41428w8 = textureView;
            textureView.setOpaque(false);
            this.f41414v8.addView(this.f41428w8, w7.z5.d(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f41389t8.getParent();
        if (viewGroup != null && viewGroup != this.X0) {
            viewGroup.removeView(this.f41389t8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.X0.addView(this.f41389t8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(H9()), AndroidUtilities.roundPlayingMessageSize(H9())));
        }
        this.f41389t8.setTag(null);
        this.f41414v8.setDrawingReady(false);
        return this.f41428w8;
    }

    public final int Q8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f41433x0.getMeasuredHeight() - view.getBottom()) - this.f41433x0.getPaddingBottom()) + "} chatHeight=" + this.f41433x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f41433x0.getPaddingBottom());
        return (this.f41433x0.getMeasuredHeight() - view.getBottom()) - this.f41433x0.getPaddingBottom();
    }

    public final void Q9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.T5, messageObject);
        }
    }

    public final void Qa() {
        this.f41457yb = null;
        this.f41430wb = 0;
        this.f41444xb = -1;
        this.f41469zb = null;
        this.Ab = null;
        this.f41257j1.d(false);
    }

    public final void Qb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41205ea);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            b2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            b2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.q4(this, tL_game, messageObject, str, j10));
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
                    presentFragment(new ei1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        ei1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Qc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        org.telegram.ui.Wallet.i3 i3Var;
        if (this.fragmentView != null && !this.f41346q5) {
            int childCount = this.f41433x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f41433x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.x0) {
                        org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) childAt;
                        MessageObject messageObject = x0Var.getMessageObject();
                        if (this.L7 != Integer.MAX_VALUE && messageObject != null && messageObject.getId() == this.L7 && x0Var.M()) {
                            org.telegram.ui.Wallet.k3 k3Var = x0Var.I0;
                            if (!k3Var.f34397h0 && (k3Var.f34392e0 == 0 || (i3Var = k3Var.f34391d0) == null || i3Var.c())) {
                                k3Var.f();
                                org.telegram.ui.Wallet.i3 i3Var2 = k3Var.f34391d0;
                                i3Var2.getClass();
                                i3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.i3 i3Var3 = k3Var.f34391d0;
                                i3Var3.f24891b = -1L;
                                i3Var3.f24892c = -1L;
                                k3Var.f34392e0 = SystemClock.elapsedRealtime();
                                k3Var.f34394f0 = false;
                                k3Var.f34385a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        if (this.f41389t8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                            ImageReceiver photoImage = u1Var.getPhotoImage();
                            this.f41389t8.setTranslationX(u1Var.getX() + photoImage.getImageX());
                            this.f41389t8.setTranslationY((this.f41433x0.getY() + (photoImage.getImageY() + (u1Var.getY() + u1Var.getPaddingTop()))) - this.f41389t8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f41389t8.getLayoutParams();
                            if (messageObject2.isRoundVideo()) {
                                this.f41389t8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(H9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(H9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(H9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f41414v8.setResizeMode(0);
                                    this.f41389t8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(H9())) / AndroidUtilities.roundPlayingMessageSize(H9());
                                float imageWidth = u1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(H9());
                                if (this.f41389t8.getScaleX() != imageWidth) {
                                    this.f41389t8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f41389t8.setPivotX(0.0f);
                                this.f41389t8.setPivotY(0.0f);
                                this.f41389t8.setScaleX(imageWidth);
                                this.f41389t8.setScaleY(imageWidth);
                                this.f41428w8.setScaleX(roundPlayingMessageSize2);
                                this.f41428w8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f41389t8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f41414v8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f41389t8.setLayoutParams(layoutParams);
                                }
                                this.f41428w8.setScaleX(1.0f);
                                this.f41428w8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f41389t8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f41389t8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f41295m3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f41389t8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(H9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f41295m3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                j(playingMessageObject.getId(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f41441x8) {
                        this.f41433x0.invalidate();
                    }
                }
            }
        }
    }

    public final void R6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.W7;
        if (call != null && (((str = this.f41228g8) != null || this.f41241h8) && this.N5)) {
            org.telegram.ui.Components.voip.d2.l(this.e, str, this.Y7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f41228g8 = null;
            this.f41241h8 = false;
            return;
        }
        if (this.f41228g8 != null && z10 && (chatFull = this.Z7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.q.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(this), R.raw.linkbroken, 36);
            this.f41228g8 = null;
        }
        this.X7 = !this.N5;
    }

    public final void R7() {
        if (this.X0 != null && this.K1 == null && getParentActivity() != null) {
            this.K1 = new org.telegram.ui.ActionBar.p0(this, getParentActivity(), 1);
            t9();
            this.K1.setClickable(true);
            this.M0.addView(this.K1, w7.z5.n(-1, 44));
            this.M0.h(2, this.K1);
            this.M0.g(this.K1);
            TextView textView = new TextView(getParentActivity());
            this.N1 = textView;
            int i10 = org.telegram.ui.ActionBar.h6.f21224q7;
            textView.setTextColor(getThemedColor(i10));
            TextView textView2 = this.N1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            textView2.setBackground(org.telegram.ui.ActionBar.h6.X(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2));
            this.N1.setTag(Integer.valueOf(i10));
            this.N1.setTextSize(1, 14.0f);
            this.N1.setTypeface(AndroidUtilities.bold());
            this.N1.setSingleLine(true);
            this.N1.setMaxLines(1);
            this.N1.setGravity(17);
            this.K1.addView(this.N1, w7.z5.e(-1, -1, 51));
            this.N1.setOnClickListener(new xe(this, 13));
            org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(getParentActivity(), this.f41205ea);
            this.T1 = x90Var;
            x90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21047ge));
            this.T1.setTextSize(1, 13.3f);
            this.T1.setDisablePaddingsOffset(true);
            this.T1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.il));
            this.T1.setGravity(17);
            this.T1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.M0.addView(this.T1, w7.z5.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.M0.h(8, this.T1);
            this.M0.g(this.T1);
            TextView textView3 = new TextView(getParentActivity());
            this.L1 = textView3;
            int i11 = org.telegram.ui.ActionBar.h6.he;
            textView3.setTextColor(getThemedColor(i11));
            this.L1.setVisibility(8);
            this.L1.setTextSize(1, 14.0f);
            this.L1.setTypeface(AndroidUtilities.bold());
            this.L1.setSingleLine(true);
            this.L1.setMaxLines(1);
            this.L1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.L1.setGravity(17);
            TextView textView4 = this.L1;
            float dp3 = AndroidUtilities.dp(18.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            textView4.setBackground(org.telegram.ui.ActionBar.h6.X(dp3, getThemedColor(i11) & 436207615, dp4, dp4, dp4, dp4));
            this.K1.addView(this.L1, w7.z5.e(-1, -1, 51));
            this.L1.setOnClickListener(new xe(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.O1 = textView5;
            textView5.setTextColor(getThemedColor(i11));
            this.O1.setVisibility(8);
            this.O1.setTextSize(1, 14.0f);
            this.O1.setTypeface(AndroidUtilities.bold());
            this.O1.setSingleLine(true);
            this.O1.setMaxLines(1);
            this.O1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.O1.setGravity(17);
            this.O1.setText(LocaleController.getString(R.string.RestartTopic));
            this.O1.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i11) & 436207615, 3, -1));
            this.M0.addView(this.O1, w7.z5.n(-1, 48));
            this.M0.h(4, this.O1);
            this.M0.g(this.O1);
            this.O1.setOnClickListener(new xe(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.U1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.U1.setContentDescription(LocaleController.getString(R.string.Close));
            this.U1.setBackground(org.telegram.ui.ActionBar.h6.N(getThemedColor(org.telegram.ui.ActionBar.h6.f21075i6), 0, 0));
            this.U1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f20992de), PorterDuff.Mode.MULTIPLY));
            this.U1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.addView(this.U1, w7.z5.a(34.0f, 0.0f, 5.0f, 5.0f, 0.0f, 34, 53));
            this.U1.setOnClickListener(new xe(this, 16));
        }
    }

    public final kn R8() {
        if (this.oc == null) {
            this.oc = new kn(this);
        }
        return this.oc;
    }

    public final boolean R9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.e6 e6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.e6 animation;
        boolean z10;
        org.telegram.ui.Cells.u1 messageCell;
        boolean z11;
        if (this.f41433x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.r40 r40Var = this.f41383t2;
            ArrayList<MessageObject> arrayList = null;
            if (r40Var != null && r40Var.getTag() != null && (messageCell = this.f41383t2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                e6Var = photoImage2.getAnimation();
                if (e6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f41433x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f41441x8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                e6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f41433x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f41433x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = u1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f41433x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f41433x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f41441x8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f41433x0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    e6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                e6Var = animation;
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
                messageObject.audioProgress = e6Var.n();
                messageObject.audioProgressMs = e6Var.o();
                e6Var.stop();
                if (PhotoViewer.L1(messageObject)) {
                    PhotoViewer.f33227b9.Q0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ra(org.telegram.ui.Cells.u1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Ra(org.telegram.ui.Cells.u1):void");
    }

    public final void Rb(boolean z10) {
        if (z10) {
            if (this.Cb == null) {
                me meVar = new me(this, 11);
                this.Cb = meVar;
                AndroidUtilities.runOnUIThread(meVar, 100L);
                return;
            }
            return;
        }
        me meVar2 = this.Cb;
        if (meVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(meVar2);
        }
        this.Cb = null;
        this.Bb = false;
        Bc(true);
    }

    public final void Rc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        jj jjVar = this.f41145a1;
        if (jjVar == null) {
            return;
        }
        int i10 = this.R3;
        if (i10 == 8 && (chat2 = this.e) != null) {
            if (this.T3) {
                String i11 = og.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.e;
                jjVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f41188d4 > 0L ? 1 : (this.f41188d4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.e;
                        }
                        this.f41145a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        jj jjVar2 = this.f41145a1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.e;
                        jjVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f41188d4));
                    this.f41145a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f41188d4));
                    if (chat7 == null) {
                        chat7 = this.e;
                    }
                    this.f41145a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                jj jjVar3 = this.f41145a1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.e.title));
                TLRPC.Chat chat8 = this.e;
                jjVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            jjVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.Q3)) {
                this.f41145a1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.Q3)) {
                this.f41145a1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f41145a1.setTitle(this.Q3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.P3.title)) {
                this.f41145a1.setTitle(this.P3.title);
            } else {
                this.f41145a1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j10 = this.f41188d4;
                if (j10 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f41145a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f41145a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f41145a1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f41145a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f41145a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f41145a1.setTitle("");
                }
            } else if (K9() && !UserObject.isBotForum(this.f41208f)) {
                if (this.f41237h4) {
                    Wc();
                } else if (this.f41224g4) {
                    if (this.X3.hasReplies()) {
                        this.f41145a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f41145a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f41145a1.setTitle(LocaleController.formatPluralString("Replies", this.X3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f41208f)) {
                this.f41145a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f41208f)) {
                this.f41145a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.R3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f41208f)) {
                        this.f41145a1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f41145a1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f41145a1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", L8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.e;
                    if (chat9 != null) {
                        jj jjVar4 = this.f41145a1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.e;
                        jjVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f41208f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f41145a1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f41208f.f20419id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f41208f.phone)) {
                                    jj jjVar5 = this.f41145a1;
                                    String g10 = org.telegram.messenger.wh.g(new StringBuilder("+"), this.f41208f.phone, jf.b.c());
                                    TLRPC.User user4 = this.f41208f;
                                    jjVar5.h(g10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f41208f), this.f41208f.emoji_status, z10);
                                } else {
                                    jj jjVar6 = this.f41145a1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f41208f)));
                                    TLRPC.User user5 = this.f41208f;
                                    jjVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f41208f), this.f41208f.emoji_status, z10);
                                }
                            } else {
                                jj jjVar7 = this.f41145a1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f41208f)));
                                TLRPC.User user6 = this.f41208f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f41208f);
                                if (!MessagesController.isSupportUser(this.f41208f)) {
                                    emojiStatus = this.f41208f.emoji_status;
                                }
                                jjVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f41145a1.getTitleTextView().getText());
        Tc(false);
    }

    public final void S6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.f41448y1 == null && ChatObject.isMegagroup(this.e) && (chatFull = getMessagesController().getChatFull(this.e.f20272id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            lk lkVar = this.O0;
            if (lkVar == null || lkVar.getVisibility() != 0) {
                org.telegram.ui.Components.s40 s40Var = org.telegram.ui.Components.s40.f30184n;
                if (s40Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f20278id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        s40Var.b();
                        ei.x3 x3Var = new ei.x3(getParentActivity(), 3);
                        this.f41448y1 = x3Var;
                        x3Var.i(true);
                        this.f41448y1.p(true);
                        ei.x3 x3Var2 = this.f41448y1;
                        x3Var2.K = Layout.Alignment.ALIGN_CENTER;
                        x3Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(j10, this.f41448y1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f41448y1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        ei.x3 x3Var3 = this.f41448y1;
                        x3Var3.h = ei.x3.a(x3Var3.getText(), this.f41448y1.getTextPaint());
                        ei.x3 x3Var4 = this.f41448y1;
                        x3Var4.d = -1L;
                        x3Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new mg(this, 28), 300L);
                    }
                }
            }
        }
    }

    public final void S7() {
        int i10;
        if (this.R1 == null && getParentActivity() != null) {
            if (this.f41435x2 == null) {
                N7();
            }
            org.telegram.ui.Components.q31 q31Var = new org.telegram.ui.Components.q31(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.R1 = q31Var;
            q31Var.O = new me(this, 5);
            eh.e o10 = fh.c.o(this.f41205ea);
            bh.b bVar = this.J;
            q31Var.setSideMenuBackgroundDrawable(bVar.c(q31Var, o10, false));
            org.telegram.ui.Components.q31 q31Var2 = this.R1;
            q31Var2.setTopMenuBackgroundDrawable(bVar.c(q31Var2, fh.c.o(this.f41205ea), false));
            this.R1.setCurrentTopic(d());
            this.R1.setOnNewTopicSelected(new me(this, 6));
            this.R1.setOnTopicSelected(new ye(this, 0));
            this.R1.setOnDialogSelected(new ye(this, 1));
            int indexOfChild = this.X0.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.X0.addView(this.R1, i10, w7.z5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.R1.n();
            zj zjVar = this.I1;
            if (zjVar != null) {
                zjVar.bringToFront();
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
        long j10 = this.f41188d4;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.p5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f41311n5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j10;
    }

    public final void S9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.n2 n2Var;
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var == null) {
            return;
        }
        long j10 = messageObject.messageOwner.action.channel_id;
        if (d5Var.getFragmentStack().size() > 0) {
            n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            n2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.d5 d5Var2 = this.parentLayout;
        if (indexOf > 0 && !(n2Var instanceof sn) && !(n2Var instanceof ProfileActivity) && this.e.creator) {
            int size = d5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) d5Var2.getFragmentStack().get(indexOf);
                if (n2Var2 instanceof sn) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new sn(z7.g5.a(j10, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new ProfileActivity(z7.g5.a(j10, "chat_id"), null));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof ko) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new ko(z7.g5.a(j10, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof jr) {
                    if (((jr) n2Var2).f38276e1 == 0) {
                        Bundle arguments = n2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) d5Var2).c(indexOf, new jr(arguments));
                    }
                    n2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(this, n2Var, messageObject, d5Var2, 9));
        }
        AndroidUtilities.runOnUIThread(new le(this, j10, 1), 1000L);
    }

    public final void Sa() {
        org.telegram.ui.Components.wc0 i10;
        qn qnVar = this.f41205ea;
        if (qnVar != null) {
            Drawable e = qnVar.e();
            if (this.fragmentView != null) {
                e = this.X0.getBackgroundImage();
            }
            if (e instanceof vn) {
                e = ((vn) e).c(true);
            }
            if (e instanceof org.telegram.ui.Components.wc0) {
                ((org.telegram.ui.Components.wc0) e).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.f5) && (i10 = ((org.telegram.ui.ActionBar.f5) themedDrawable).i()) != null) {
                i10.w(false);
            }
        }
    }

    public final void Sb(boolean z10) {
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
                spannableString.setSpan(new org.telegram.ui.Components.c61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(this);
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
                    org.telegram.ui.Components.qc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new hf(this, z10, 0)), spannableString), i12);
                    M.f29639j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void Sc() {
        Tc(false);
    }

    public final void T6() {
        ArrayList arrayList;
        int i10;
        if (this.Qa) {
            int i11 = -1;
            int i12 = 0;
            long j10 = 0;
            while (true) {
                arrayList = this.f41400u6;
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
                        Collections.sort(arrayList2, new org.telegram.ui.ActionBar.i4(10));
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
        if (this.y3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f41205ea);
            this.y3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.X0.addView(this.y3, w7.z5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
    }

    public final int T8() {
        return this.X0.getBackgroundSizeY();
    }

    public final void T9(boolean z10) {
        int i10;
        if (this.f41433x0 != null) {
            ArrayList arrayList = this.f41400u6;
            if (!arrayList.isEmpty() && !this.f41429wa.f43266n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f41458z0.h1(i10, 0);
                this.f41433x0.B0();
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
        lk lkVar;
        hk hkVar = this.Y;
        if (hkVar != null && hkVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.Y4 && hkVar != null && (lkVar = this.O0) != null && lkVar.getVisibility() != 0) {
            messageObject = this.f41311n5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.Y2;
        } else {
            z10 = true;
            messageObject = null;
            charSequence = null;
        }
        if (this.f41297m5) {
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
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.T5, E7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j11 = this.T5;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f41297m5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        in inVar = this.f41285l5;
        MessageSuggestionParams messageSuggestionParams = this.f41225g5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        hk hkVar2 = this.Y;
        if (hkVar2 != null) {
            j10 = hkVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.saveDraft(j11, E7, charSequence2, entities, message, inVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void Tb(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f41224g4 && this.f41208f == null) {
                if (this.f41254ib == null) {
                    this.f41254ib = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f41254ib.booleanValue()) {
                    this.f41243hb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.O5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f41243hb) {
                    return;
                }
                this.f41243hb = z10;
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
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new qi(this, 3)).start();
                return;
            }
            this.f41243hb = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Tc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.s0 s0Var;
        if (this.f41145a1 != null) {
            int i10 = this.R3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.T5, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f41208f)) {
                    if (!UserObject.isReplyUser(this.f41208f) && ((!K9() || this.f41237h4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.H6), PorterDuff.Mode.SRC_IN));
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.f41145a1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f41208f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f41145a1.c(DialogObject.getBotVerificationIcon(this.f41208f));
                        }
                    }
                }
                this.f41145a1.j(drawable, mutate);
                if (!z10 && (s0Var = this.f41197e1) != null) {
                    if (isDialogMuted) {
                        if (s0Var.f21698m != 8) {
                            s0Var.f21698m = 8;
                            View view = s0Var.f21695j;
                            if (view instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view).getRightIcon().setVisibility(s0Var.f21698m);
                            }
                        }
                        this.f41197e1.d(LocaleController.getString(R.string.Unmute));
                        this.f41197e1.b(R.drawable.msg_mute);
                    } else {
                        if (s0Var.f21698m != 0) {
                            s0Var.f21698m = 0;
                            View view2 = s0Var.f21695j;
                            if (view2 instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view2).getRightIcon().setVisibility(s0Var.f21698m);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.T5, d())) {
                            this.f41197e1.d(LocaleController.getString(R.string.Mute));
                            this.f41197e1.b(R.drawable.msg_unmute);
                        } else {
                            this.f41197e1.d(LocaleController.getString(R.string.Mute));
                            this.f41197e1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.zo zoVar = this.f41245i1;
                if (zoVar != null) {
                    zoVar.d(this.T5, d(), null);
                }
            }
        }
    }

    public final void U6(boolean z10) {
        hg.n1 n1Var;
        if (this.O3 == 2 && (n1Var = this.M3) != null) {
            String str = this.f41397u3;
            ei.bc bcVar = n1Var.E;
            if (!TextUtils.equals(n1Var.f11998x, str)) {
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
                ci.u6 u6Var = n1Var.f11999y;
                if (u6Var != null && u6Var.I != 0) {
                    ConnectionsManager.getInstance(u6Var.f5148c).cancelRequest(u6Var.I, true);
                    u6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    n1Var.f11998x = str;
                    n1Var.f11999y = new ci.u6(n1Var.f11995r, str2, trim);
                    if (z10) {
                        bcVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(bcVar, 1000L);
                    }
                }
                ci.u6 u6Var2 = n1Var.f11999y;
                if (u6Var2 != null && u6Var2.J > 0) {
                    n1Var.l();
                }
            }
        }
    }

    public final ArrayList U7(MessageObject messageObject, boolean z10) {
        ArrayList k10 = org.telegram.messenger.q.k(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.f41400u6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.L6 || messageObject.getDialogId() == this.L6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    k10.add(messageObject2);
                }
            }
        }
        return k10;
    }

    public final float U8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.X0.getBackgroundTranslationY()) - ((1.0f - this.f41442x9) * this.f41377s9);
    }

    public final boolean U9() {
        hk hkVar = this.Y;
        boolean z10 = hkVar.f24050z2;
        if (z10) {
            hkVar.q1();
            this.D3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Ua() {
        org.telegram.ui.Cells.u1 u1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f41433x0.getChildCount(); i11++) {
            View childAt = this.f41433x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                int min = Math.min(u1Var2.getBottom(), this.f41433x0.getHeight()) - Math.max(0, u1Var2.getTop());
                if (min > i10) {
                    u1Var = u1Var2;
                    i10 = min;
                }
            }
        }
        if (u1Var != null) {
            sj sjVar = this.f41458z0;
            this.f41433x0.getClass();
            sjVar.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) this.f41377s9), false);
        }
    }

    public final void Ub() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new re(this, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20601a);
    }

    public final void Uc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Uc(boolean):void");
    }

    public final void V6() {
        this.S.d();
        Ac();
        kc();
        p7();
        m7();
        r7();
        q7();
        u7();
        u9();
        boolean z10 = true;
        if (this.v.f44759s == 1) {
            z10 = false;
        }
        if (this.Wa != z10) {
            this.Wa = z10;
            checkSystemBarColors();
        }
    }

    public final void V7(final int i10, final int i11, final boolean z10) {
        this.A0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f41400u6;
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
        pj pjVar = this.f41433x0;
        if (pjVar != null) {
            pjVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            Tb(true);
        }
        fm fmVar = this.A0;
        fmVar.L = true;
        fmVar.O(true);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                sn snVar = sn.this;
                MessagesController messagesController = snVar.getMessagesController();
                long j11 = snVar.T5;
                if (ChatObject.isChannel(snVar.e)) {
                    j10 = snVar.T5;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i10, i11, z10, new mg(snVar, 18));
            }
        }, new mf(this, 28));
    }

    public final float V8() {
        org.telegram.ui.Components.q31 q31Var = this.R1;
        if (q31Var != null) {
            return q31Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Va(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Va(org.telegram.messenger.MessageObject):void");
    }

    public final void Vb() {
        String str;
        if (this.Gb != null) {
            return;
        }
        if (this.f41311n5 != null) {
            str = getMessagesController().getFullName(this.f41311n5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new re(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new re(this, 18));
        b2Var.setOnDismissListener(new qe(this, 8));
        this.Gb = alertDialog$Builder.o();
    }

    public final void Vc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.s0 s0Var = this.f41381t0;
        if (s0Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f41175c4) && (tL_forumTopic = this.f41175c4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s0Var.e(i10);
        }
    }

    public final void W6() {
        TLRPC.Chat chat;
        long j10 = getArguments().getInt("search_from_user_id", 0);
        if (j10 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                qa("");
                ImageView imageView = this.T2;
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
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            db(chat, null);
        }
    }

    public final void W7(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
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
        org.telegram.ui.Components.i80 I = org.telegram.ui.Components.i80.I(this, u1Var);
        org.telegram.ui.Components.ym0 ym0Var = new org.telegram.ui.Components.ym0(getParentActivity(), this.f41205ea);
        I.f27129p = new se(ym0Var, 0);
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
            ai.l2 l2Var = new ai.l2(this, str, characterStyle, messageObject, u1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            u1Var2 = u1Var;
            I.c(i13, string, l2Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            u1Var2 = u1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new te(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new te(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new ue(this, messageObject2, 0), false);
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
        I.c(i14, LocaleController.getString(i10), new ai.y3(this, str, messageObject2, startsWith, 11), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new te(this, str, 2), false);
        }
        ym0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            ym0Var.f(u1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.l61) {
            String url = ((org.telegram.ui.Components.l61) characterStyle2).getURL();
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
            ym0Var.f(u1Var2, characterStyle2, spannableString2, false);
        } else {
            ym0Var.f(u1Var2, characterStyle2, null, false);
        }
        showDialog(ym0Var);
    }

    public final int W8() {
        return (int) (V8() * AndroidUtilities.dp(71.0f));
    }

    public final void Wa(long j10) {
        sj sjVar;
        MessageObject messageObject;
        int Q8;
        int abs;
        pj pjVar = this.f41433x0;
        int i10 = -1;
        if (pjVar != null && (sjVar = this.f41458z0) != null && sjVar.f45935y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = pjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f41433x0.getChildAt(childCount);
                this.f41433x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((Q8 = Q8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = Q8;
                    i12 = abs;
                }
            }
            this.f41313n7 = i10;
            this.f41326o7 = i11;
            return;
        }
        this.f41313n7 = -1;
    }

    public final void Wb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.r40 r40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((r40Var = this.f41294m2) != null && r40Var.getVisibility() == 0)) {
                this.f41294m2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f41294m2.f(view, true);
                }
            }
        }
    }

    public final void Wc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        jj jjVar = this.f41145a1;
        if (jjVar != null && (tL_forumTopic = this.f41175c4) != null) {
            jjVar.setTitle(tL_forumTopic.title);
        }
        Xc();
    }

    public final void X6() {
        MessageObject messageObject;
        if (!this.D4 && (messageObject = this.J7) != null) {
            if (this.f41400u6.indexOf(messageObject) >= 0) {
                this.E4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.C4 != null) {
        } else {
            mf mfVar = new mf(this, 20);
            this.C4 = mfVar;
            AndroidUtilities.runOnUIThread(mfVar);
        }
    }

    public final void X7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.u1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.X7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1):void");
    }

    public final int X8(int i10) {
        SparseIntArray sparseIntArray = this.V4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Jc;
            Jc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void X9() {
        M6(this.P0, 5, true);
        M6(this.Y, 1, false);
        M6(this.R2, 4, true);
        M6(this.O0, 3, false);
        M6(this.R, 2, false);
        float f7 = this.f41431wc.e;
        j6.l lVar = this.Bc;
        float D = com.google.android.gms.internal.cast.a6.D(1.0f, f7, 1.0f - ((float[]) lVar.f14284b)[5], 1.0f);
        kh.c cVar = this.P0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(D);
        }
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        kk kkVar = this.R2;
        if (kkVar != null) {
            kkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        lk lkVar = this.O0;
        if (lkVar != null) {
            lkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        kk kkVar2 = this.R;
        if (kkVar2 != null) {
            kkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        ih.f fVar = this.S;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - D) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        lk lkVar2 = this.O0;
        ne.b bVar = this.f41405uc;
        if (lkVar2 != null) {
            lkVar2.setTotalVisibilityFactor((1.0f - bVar.e) * ((float[]) lVar.f14284b)[3]);
        }
        np npVar = this.P9;
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
        pj pjVar = this.f41433x0;
        if (pjVar != null && this.f41458z0 != null) {
            for (int childCount = pjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f41433x0.getChildAt(childCount);
                this.f41433x0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                        i10 = Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f41458z0.h1(i11, i10);
        }
    }

    public final void Xb(MessageSuggestionParams messageSuggestionParams) {
        if (this.p5 == null) {
            return;
        }
        new ai.h1(getParentActivity(), this.currentAccount, this.T5, messageSuggestionParams, this, getResourceProvider(), 0, new ze(this, 0)).show();
    }

    public final void Xc() {
        jj jjVar;
        jj jjVar2;
        if (UserObject.isBotForum(this.f41208f) && (jjVar2 = this.f41145a1) != null) {
            jjVar2.getAvatarImageView().setVisibility(0);
            this.f41145a1.b();
        } else if (this.f41175c4 != null && (jjVar = this.f41145a1) != null) {
            jjVar.getAvatarImageView().setVisibility(0);
            og.d.p(this.f41145a1.getAvatarImageView(), this.f41175c4, true, true, this.f41205ea);
        }
    }

    public final void Y6(boolean z10) {
        if (this.f41311n5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f41400u6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f41311n5.getId() && messageObject.getDialogId() == this.f41311n5.getDialogId()) {
                        this.f41311n5 = messageObject;
                        in inVar = this.f41285l5;
                        if (inVar != null) {
                            inVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f41214f5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f41311n5;
                                MessageObject.GroupedMessages groupedMessages = this.f41261j5;
                                if (groupedMessages == null) {
                                    groupedMessages = D8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.T5, this.f41285l5);
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

    public final void Y7(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, String str) {
        si P9 = P9(u1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(jf.b.d(str, false));
        ai.g3 g3Var = new ai.g3(this, u1Var, str, tL_contact, characterStyle, 3);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                g3Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new t1(this, tL_contact, g3Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = jf.b.d(str, false);
        P9.f44308b = new df(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ea(this, P9, g3Var, 3)), 0);
        P9.d();
    }

    public final int Y8(int i10) {
        SparseIntArray sparseIntArray = this.U4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Jc;
            Jc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void Y9(boolean z10, boolean z11) {
        if (this.D3) {
            AndroidUtilities.runOnUIThread(new me(this, 20), 200L);
            if (z11) {
                this.D3 = false;
            }
        }
        if (z10 && !this.Pa) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int Ya(org.telegram.messenger.MessageObject r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Ya(org.telegram.messenger.MessageObject):int");
    }

    public final void Yb(MessageObject messageObject) {
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f41253i9 && this.f41265j9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f41253i9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f41242h9 == null) {
                        kl klVar = new kl(getParentActivity(), this.f41205ea, this);
                        this.f41242h9 = klVar;
                        this.X0.addView(klVar, w7.z5.a(56.0f, 8.0f, 0.0f, 8.0f, 8.0f, -2, 83));
                    }
                    this.f41242h9.c();
                }
            }
        }
    }

    public final void Yc() {
        int i10;
        org.telegram.ui.ActionBar.s0 s0Var = this.f41282l0;
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

    public final void Z6() {
        lk lkVar;
        kk kkVar;
        kk kkVar2;
        hk hkVar = this.Y;
        if (hkVar != null && hkVar.f24051z3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((lkVar = this.O0) == null || lkVar.getVisibility() != 0) && (((kkVar = this.R) == null || kkVar.getVisibility() != 0) && ((kkVar2 = this.R2) == null || kkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void Z7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.Z7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final long Z8() {
        return this.f41188d4;
    }

    public final void Z9() {
        this.D4 = true;
        mm mmVar = this.f41180c9;
        AndroidUtilities.cancelRunOnUIThread(mmVar.f21989f0);
        mmVar.f22015z = false;
        me meVar = new me(this, 8);
        int i10 = this.D7;
        if (i10 != 0) {
            bb(i10, 0, false, this.C7, true, 0, null, null, meVar);
            return;
        }
        int i11 = this.B7;
        if (i11 > 0) {
            bb(i11, 0, true, this.C7, true, 0, null, null, meVar);
            return;
        }
        ab(!this.f41182cb, meVar);
        this.f41182cb = false;
        if (!this.H4.isEmpty()) {
            this.O4 = true;
            this.N4 = ((Integer) this.H4.get(0)).intValue();
        }
    }

    public final void Za() {
        ab(false, null);
    }

    public final void Zb(boolean z10, boolean z11) {
        hk hkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f41370s2 != null) && this.R3 == 0 && (hkVar = this.Y) != null && hkVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f41370s2 == null) {
                    lm lmVar = this.X0;
                    int indexOfChild = lmVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(9, getParentActivity(), this.f41205ea, false);
                        this.f41370s2 = r40Var;
                        lmVar.addView(r40Var, indexOfChild + 1, w7.z5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f41370s2.b(true);
                    return;
                }
                if (this.Y.f23933e2) {
                    org.telegram.ui.Components.r40 r40Var2 = this.f41370s2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    r40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f41370s2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f41370s2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Zc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        pj pjVar = this.f41433x0;
        if (pjVar != null) {
            if (!this.D4 && this.J7 != null) {
                int childCount = pjVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f41433x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.J7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f41400u6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.J7) + this.A0.J;
                                i11 = Q8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f41433x0.getChildCount();
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f41433x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                    MessageObject messageObject3 = u1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        u1Var.X3(messageObject3, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
                        fm fmVar = this.A0;
                        this.f41433x0.getClass();
                        fmVar.Q(RecyclerView.R(u1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f41458z0.h1(i10, i11);
            }
        }
    }

    public long a() {
        return this.T5;
    }

    public final boolean a7(boolean z10, boolean z11) {
        hk hkVar = this.Y;
        if (hkVar == null || !hkVar.t0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41205ea);
            if (this.Y.f23920c1) {
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new ci.f(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f20601a);
            return true;
        }
        return true;
    }

    public final void a8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.a8(int, java.lang.Object[]):void");
    }

    public final float a9(float f7) {
        sn snVar = this.f41194da;
        if (snVar == null) {
            snVar = this;
        }
        org.telegram.ui.Components.ch chVar = snVar.M0;
        if (chVar == null) {
            return 0.0f;
        }
        return chVar.c(f7);
    }

    public final void ab(boolean z10, me meVar) {
        ArrayList arrayList;
        int i10;
        if (this.f41433x0.V1) {
            return;
        }
        this.N4 = 0;
        this.f41351qb = 0;
        this.O4 = false;
        this.W8.e(0);
        if (this.E6[0] && this.H7 == 0 && this.f41401u7 == 0) {
            this.f41257j1.d(false);
            if (this.f41458z0.I0() == 0) {
                this.f41229g9 = false;
                zc();
                Ma();
                ad(false);
                return;
            }
            this.A0.T();
            fn fnVar = this.Ma;
            fnVar.f36958a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f41400u6;
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
            ok okVar = this.W8;
            fnVar.f36959b = i11;
            fnVar.d = 0;
            boolean z11 = !z10;
            fnVar.f36960c = z11;
            okVar.c(i11, 0, z11, true);
            this.f41229g9 = false;
            zc();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f41339pb;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        Bc(false);
        if (meVar != null) {
            meVar.run();
        } else {
            Qa();
            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f41205ea);
            this.f41339pb = b2Var2;
            b2Var2.setOnCancelListener(this.f41302ma);
            this.f41339pb.q(1000L);
        }
        this.Y8 = this.V5;
        this.f41152a9 = false;
        this.Z8 = 0;
        this.f41166b9 = false;
        ArrayList arrayList2 = this.f41239h6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.V5));
        AndroidUtilities.runOnUIThread(new mf(this, 12), 0L);
    }

    public final boolean ac(MessageObject messageObject) {
        if (this.R3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void ad(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.ad(boolean):void");
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
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.T5, this.f41311n5, this.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = H8();
        of2.payStars = j10;
        of2.monoForumPeer = S8();
        of2.suggestionParams = this.f41225g5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.R3 == 0) {
            T9(false);
        }
        if (i10 == 0 || i10 == 1) {
            B6();
        }
        if (this.f41346q5) {
            this.Q5 = true;
        }
    }

    public final void b7() {
        if (!this.Sb) {
            this.Sb = true;
            if (!this.Tb && this.R3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f41407v1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f41407v1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f41421w1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f41421w1.u();
                    this.Tb = true;
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

    public final float b9(org.telegram.ui.Components.l31 l31Var) {
        float f7;
        org.telegram.ui.Components.q31 q31Var = this.R1;
        if (q31Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j10 = q31Var.j(l31Var);
            if (l31Var == org.telegram.ui.Components.l31.f28059b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * j10;
        }
        return 0.0f;
    }

    public final void ba(long j10, String str, boolean z10) {
        ca();
        ci.b3 b3Var = this.J1;
        if (b3Var != null) {
            b3Var.R1(j10, str, z10, false);
        }
    }

    public final void bb(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void bc(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            ah.f0 f0Var = this.Y9;
            if (f0Var != null && f0Var.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            if (this.f41256j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21493n0) {
                    kVar.h(true);
                    this.Y.b1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ki.d2 d2Var = new ki.d2(richMessage);
                d2Var.J = this;
                d2Var.f15211r = messageObject;
                presentFragment(d2Var);
                return;
            }
            this.I1.getAdapter().f11927f0 = false;
            this.Y.setVisibility(0);
            Cb(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            lc(false);
            if (!z10) {
                Q6();
            }
            if (z10) {
                this.f41225g5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.S0(false, false, true);
            Cc(0, true);
            ad(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.R3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.T5);
                tL_messages_getMessageEditData.f20364id = messageObject.getId();
                this.f41324o5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new pe(this, 3));
                return;
            }
            hk hkVar = this.Y;
            org.telegram.ui.Components.xe xeVar = hkVar.F1;
            if (xeVar != null) {
                xeVar.setEnabled(true);
                hkVar.F1.h(false);
            }
        }
    }

    @Override
    public final boolean c() {
        if (this.R3 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        org.telegram.ui.Cells.u1 u1Var;
        ei.x3 x3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        ei.x3 x3Var2 = this.f41434x1;
        if (x3Var2 != null && !x3Var2.V && !this.Vb && this.Sb && !this.yc.f17380f && System.currentTimeMillis() - this.Ub > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f41433x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f41433x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        u1Var = (org.telegram.ui.Cells.u1) childAt;
                        ah.j1 j1Var = u1Var.N;
                        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !j1Var.v.isEmpty()) {
                            u1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + j1Var.d;
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
                ah.j1 j1Var2 = u1Var.N;
                this.Vb = true;
                u1Var.getLocationInWindow(iArr);
                this.f41434x1.setTranslationY(((iArr[1] - x3Var.getTop()) - AndroidUtilities.dp(120.0f)) + j1Var2.d);
                this.f41434x1.m(0.0f, (((ah.g1) j1Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + j1Var2.f795c);
                this.f41434x1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new me(this, 19));
            AndroidUtilities.runOnUIThread(new me(this, 19), 2000L);
        }
    }

    public final void c8(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.c8(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages c9(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f41439x6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void ca() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            hk hkVar = this.Y;
            if (hkVar == null || TextUtils.isEmpty(hkVar.getSlowModeTimer())) {
                hk hkVar2 = this.Y;
                if (hkVar2 != null && hkVar2.f23961i5.f17380f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H7();
                ci.b3 b3Var = this.J1;
                if (!z10 && this.R3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                b3Var.U1 = z11;
                b3Var.f30586j0.f0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.f41225g5 == null) && !z10 && this.R3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        this.J1.N1(10, true);
                    } else {
                        this.J1.N1(-1, true);
                    }
                } else {
                    this.J1.N1(1, true);
                }
                ci.b3 b3Var2 = this.J1;
                b3Var2.V0 = true;
                b3Var2.A1.setVisibility(0);
                b3Var2.T0 = 0;
                b3Var2.F = false;
                b3Var2.G = false;
                b3Var2.f30583i0 = true;
                b3Var2.J = null;
                org.telegram.ui.ActionBar.u0 u0Var = b3Var2.f30598n1;
                if (u0Var != null) {
                    b3Var2.f30594m1.setTranslationY(0.0f);
                    u0Var.setVisibility(8);
                }
                this.J1.t1();
                this.J1.o1().setText(this.Y.getFieldText());
                ci.b3 b3Var3 = this.J1;
                b3Var3.f30609r = this.f41205ea;
                showDialog(b3Var3);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ke keVar;
        if ((this.R3 != 5 || (!this.f41400u6.isEmpty() && this.f41188d4 != 0)) && !this.yc.f17380f && this.f41315n9) {
            hk hkVar = this.Y;
            if (!hkVar.F2) {
                if (!hkVar.f23920c1 || (keVar = hkVar.f23932e1) == null || keVar.getVisibility() != 0) {
                    if ((!hkVar.h0() || !hkVar.f23974l0.v) && !org.telegram.ui.ActionBar.n2.hasSheets(hkVar.P2) && this.N9 == 0.0f) {
                        vh.i iVar = this.X9;
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

    public final void cc() {
        org.telegram.ui.Components.z00 z00Var = this.f41301m9;
        if (z00Var != null && !z00Var.f32797c) {
            z00Var.c(false);
            try {
                this.f41301m9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f41237h4 && (i10 = this.R3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f41188d4;
    }

    public final void d7(boolean z10) {
        int i10;
        if (this.f41458z0 != null && !this.f41346q5 && !this.A0.L && !this.f7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f41433x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f41433x0.getChildAt(i14));
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
            fm fmVar = this.A0;
            if (fmVar.N) {
                int i15 = fmVar.E;
                if (i15 >= 0 && i13 >= 0 && i15 >= i13 && i15 <= i12) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = fmVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            int i16 = i10;
            if (this.R3 == 7) {
                if ((h - i13) - i11 <= i16 && !this.G6 && !this.C6[0]) {
                    this.G6 = true;
                    this.f41239h6.add(Integer.valueOf(this.V5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f41397u3;
                    int i17 = this.classGuid;
                    int i18 = this.O3;
                    int i19 = this.V5;
                    this.V5 = i19 + 1;
                    hashtagSearchController.searchHashtag(str, i17, i18, i19);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.cf(this, h, i13, i11, i16, 1));
        }
    }

    public final void d8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.d8(int, java.lang.Object[]):void");
    }

    public final void d9(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f41409v3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.O3);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j10 = this.T5;
        long j11 = this.L6;
        int i14 = this.classGuid;
        boolean z11 = this.Qa;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j10, j11, i14, i10, this.f41188d4, this.f41322o3, this.f41333p3, this.f41344q3);
        Pb(false);
    }

    public final void da() {
        gt.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        H7();
        this.J1.f30586j0.f0();
        this.J1.N1(1, false);
        ci.b3 b3Var = this.J1;
        b3Var.X1 = true;
        b3Var.k1(null);
        this.J1.t1();
        ci.b3 b3Var2 = this.J1;
        b3Var2.f30609r = this.f41205ea;
        if (this.visibleDialog != null) {
            b3Var2.show();
        } else {
            showDialog(b3Var2);
        }
    }

    public final void db(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f41322o3 = user;
        this.f41333p3 = chat;
        if (this.f41256j0 != null && this.I1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f41322o3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f41309n3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a1.g.D(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.h6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f41256j0.setSearchFieldCaption(spannableString);
                    this.I1.getAdapter().U(null, 0, null, false, true);
                    this.f41256j0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f41256j0;
                    u0Var.f21747r = null;
                    ei.e2 e2Var = u0Var.e;
                    if (e2Var != null) {
                        e2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f41384t3 = "";
                    mediaDataController.searchMessagesInChat("", this.T5, this.L6, this.classGuid, 0, this.f41188d4, this.f41322o3, this.f41333p3, this.f41344q3);
                }
            }
        }
    }

    public final void dc() {
        long j10;
        me meVar = this.U7;
        if (meVar != null) {
            AndroidUtilities.cancelRunOnUIThread(meVar);
        }
        me meVar2 = new me(this, 18);
        this.U7 = meVar2;
        if (this.P7 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(meVar2, j10);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.d5 d5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        jj jjVar;
        hk hkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.iu editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.oy0 oy0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        hk hkVar2;
        sn snVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            snVar.f8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            pj pjVar = snVar.f41433x0;
            if (pjVar != null) {
                pjVar.f1();
            }
            org.telegram.ui.Components.si siVar = snVar.M9;
            if (siVar != null) {
                siVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
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
                ci.b3 b3Var = snVar.J1;
                if (b3Var != null && b3Var.isShowing()) {
                    snVar.J1.dismiss(true);
                }
                if (z11 && (hkVar2 = snVar.Y) != null && hkVar2.r0()) {
                    snVar.Y.k0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f20292id = stickerSet2.f20299id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = snVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.oy0) && (tL_messages_stickerSet = (oy0Var = (org.telegram.ui.Components.oy0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f20299id == stickerSet2.f20299id) {
                            oy0Var.E0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.xc xcVar = new org.telegram.ui.Components.xc(oy0Var.container, snVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.qc r10 = xcVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r10.f29639j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.oy0 oy0Var2 = new org.telegram.ui.Components.oy0(snVar.getParentActivity(), snVar, tL_inputStickerSetID, null, snVar.Y, snVar.f41205ea);
                            final boolean z15 = z12;
                            snVar = this;
                            oy0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    sn.T0(sn.this, objArr, oy0Var2, z15, stickerSet2);
                                }
                            });
                            snVar.showDialog(oy0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                pj pjVar2 = snVar.f41433x0;
                if (pjVar2 != null) {
                    pjVar2.f1();
                }
                TextView textView = snVar.Q2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.j5 j5Var = snVar.D2[i13];
                    if (j5Var != null) {
                        j5Var.invalidate();
                    }
                }
                zj zjVar = snVar.I1;
                if (zjVar != null) {
                    zjVar.getListView().f1();
                }
                ai.u1 u1Var = snVar.L3;
                if (u1Var != null) {
                    u1Var.f1();
                }
                UndoView undoView = snVar.y3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                hk hkVar3 = snVar.Y;
                if (hkVar3 != null && (editField = hkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                ai.ud[] udVarArr = snVar.E2;
                ai.ud udVar = udVarArr[0];
                if (udVar != null) {
                    udVar.invalidate();
                }
                ai.ud udVar2 = udVarArr[1];
                if (udVar2 != null) {
                    udVar2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (snVar.Z7 != null && (chat = snVar.e) != null && chat.f20272id == l4.longValue()) {
                    snVar.Z7.online_count = ((Integer) objArr[1]).intValue();
                    jj jjVar2 = snVar.f41145a1;
                    if (jjVar2 != null) {
                        jjVar2.m();
                        snVar.f41145a1.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == snVar.T5 && (hkVar = snVar.Y) != null) {
                    hkVar.P1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                hk hkVar4 = snVar.Y;
                if (hkVar4 != null) {
                    hkVar4.Q1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (snVar.e != null) {
                        TLRPC.Chat chat2 = snVar.getMessagesController().getChat(Long.valueOf(snVar.e.f20272id));
                        if (chat2 != null) {
                            snVar.e = chat2;
                        }
                    } else if (snVar.f41208f != null && (user = snVar.getMessagesController().getUser(Long.valueOf(snVar.f41208f.f20419id))) != null) {
                        snVar.f41208f = user;
                    }
                    snVar.Rc(true);
                }
                if (!snVar.K9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (snVar.e != null && (jjVar = snVar.f41145a1) != null) {
                        jjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    snVar.p();
                    snVar.ad(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && snVar.e != null) {
                    snVar.D9();
                    TLRPC.Chat chat3 = snVar.getMessagesController().getChat(Long.valueOf(snVar.e.f20272id));
                    if (chat3 != null) {
                        snVar.e = chat3;
                        snVar.D9();
                        z10 = !snVar.K9();
                        snVar.lc(false);
                        hk hkVar5 = snVar.Y;
                        if (hkVar5 != null) {
                            hkVar5.Y0(snVar.currentAccount, snVar.T5);
                        }
                        FlagSecureReason flagSecureReason = snVar.E3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                jj jjVar3 = snVar.f41145a1;
                if (jjVar3 != null && z10) {
                    jjVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    snVar.Uc(true);
                }
                org.telegram.ui.ActionBar.u0 u0Var = snVar.f41233h0;
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
                if (!snVar.Pa) {
                    if (longValue == snVar.T5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = snVar.R3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !snVar.isPaused && LaunchActivity.U() == snVar && snVar.f41214f5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                snVar.oa(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            snVar.Da(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(snVar.e) && !snVar.e.megagroup && (chatFull = snVar.Z7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                snVar.f41412v6.put(messageObject3.getId(), messageObject3);
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
                    if (((Long) objArr[0]).longValue() == snVar.T5) {
                        snVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (d5Var = snVar.parentLayout) != null && d5Var.getFragmentStack().size() > 1) {
                    snVar.finishFragment();
                } else {
                    snVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == snVar.a() && (booleanValue || snVar.parentLayout.getLastFragment() != snVar)) {
                    if (snVar.parentLayout.getLastFragment() == snVar) {
                        snVar.finishFragment();
                    } else {
                        snVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = snVar.f41325o6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = snVar.e;
                    if (chat4 != null && chat4.f20272id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (snVar.f41346q5) {
                            sh shVar = snVar.f41310n4;
                            if (shVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(shVar);
                                snVar.f41310n4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            sh shVar2 = new sh(snVar, messageObject2, intValue3);
                            snVar.f41310n4 = shVar2;
                            AndroidUtilities.runOnUIThread(shVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = snVar.e;
                    if (chat5 != null && chat5.f20272id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = snVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(snVar.e, snVar.getMessagesController().getChatFull(snVar.e.f20272id)));
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
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && snVar.T5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = snVar.f41188d4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = snVar.f41273k4;
                            ArrayList arrayList2 = snVar.f41400u6;
                            if (intValue4 > i19) {
                                snVar.f41273k4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= snVar.f41273k4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        fm fmVar = snVar.A0;
                                        if (fmVar != null) {
                                            fmVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > snVar.l4) {
                                snVar.l4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= snVar.l4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        fm fmVar2 = snVar.A0;
                                        if (fmVar2 != null) {
                                            fmVar2.R(messageObject5, false, false);
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
        ci.b3 b3Var = this.J1;
        if (b3Var != null && this.visibleDialog == b3Var) {
            b3Var.f30586j0.a0(false);
            this.J1.dismissInternal();
            this.J1.f30586j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.J1 && dialog != this.f41167ba && !(dialog instanceof gi.d3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f41362r8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f41362r8 = true;
            org.telegram.ui.Components.f5.r0(getParentActivity(), this.currentAccount, new me(this, 10), true, this.f41205ea);
        }
    }

    public final void e8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.e8(int, java.lang.Object[]):void");
    }

    public final void e9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.e9():void");
    }

    public final void ea(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.u1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.ea(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.u1, org.telegram.messenger.MessageObject):void");
    }

    public final void eb(View view, MessageObject messageObject, org.telegram.ui.Components.cl0 cl0Var, View view2, float f7, float f10, ah.i1 i1Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        ai.p7 p7Var;
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
            if (i1Var != null && i1Var.f782a) {
                D7(true);
                if (view == null) {
                    a0Var = t8(messageObject.getId(), true);
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
                    long j10 = -ai.z9.b(messageObject).f2544a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
                        org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    ai.ea eaVar = ai.fa.y(this.currentAccount, false).B;
                    if (eaVar != null) {
                        eaVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j11 = this.T5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    ai.ke keVar = new ai.ke(parentActivity, i15, j11, this, messageObject, arrayList2, z14, false, 0L, this.f41205ea);
                    messageObject.getId();
                    keVar.U = this;
                    keVar.V = a0Var;
                    keVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -ai.z9.b(messageObject).f2544a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j12);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j12));
                    org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                ai.ea d02 = ai.fa.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f41352qc == null) {
                        this.f41352qc = new ai.p7(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        p7Var = null;
                    } else {
                        if (this.f41352qc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f41352qc);
                            layoutContainer.addView(this.f41352qc, w7.z5.d(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f41352qc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f41352qc.bringToFront();
                        }
                        p7Var = this.f41352qc;
                    }
                    p7Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f1265o = p7Var;
                    p7Var.I = false;
                    p7Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    p7Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.u1) {
                        i12 = ((org.telegram.ui.Cells.u1) a0Var).V;
                    } else {
                        i12 = 0;
                    }
                    p7Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            ah.i1 i1Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new sg.x0((org.telegram.ui.ActionBar.n2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(i1Var) && (chat = this.e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.e, 26)) {
                org.telegram.messenger.q.q(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.xc.a0(this), R.raw.e_hand_2, 36);
            } else {
                ah.d1.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(i1Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.h hVar = this.f41439x6;
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
                    org.telegram.ui.Cells.a0 t82 = t8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && t82 != null && i1Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j13 = i1Var.f786g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(i1Var.f785f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.r5.f(this.currentAccount, j13);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.qc r10 = org.telegram.ui.Components.xc.a0(this).r(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f29639j = 5000;
                            r10.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (cl0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        ah.d1.d(this, cl0Var, t82, view2, f7, f10, i1Var, i19, i10);
                    }
                }
                if (selectReaction && i1Var != null && (str = i1Var.f785f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<ah.i1> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    i1Var2 = i1Var;
                }
                pi piVar = new pi(this, z13, z10, i18, selectReaction, cl0Var, f7, f10, i1Var, messageObject);
                this.f41183cc = piVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, i1Var2, z11, z12, this, piVar);
                if (z10 || z13) {
                    uc(messageObject, true);
                    this.f41183cc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f41183cc, 50L);
                }
            }
        }
    }

    public final void ec() {
        AndroidUtilities.forEachViews((RecyclerView) this.f41433x0, (Utilities.Callback<View>) new ai.x8(5, this, y9()));
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        hk hkVar = this.Y;
        if (hkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.T5, (int) d());
            ne.b bVar = hkVar.f23955h5;
            ai.h7 h7Var = hkVar.I0;
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
            ((ne.b) h7Var.f1430c).a(z12, z13);
            h7Var.setClickable(z12);
            h7Var.setEnabled(z12);
            if (bVar.f17380f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            hkVar.T4 = streamingSendButtonState;
            if (z14) {
                hkVar.I(z10);
            }
        }
    }

    public final void f8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.f8(java.lang.Object[]):void");
    }

    public final boolean f9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.W5;
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
            FileLog.d("getDiscussionMessage chat = " + chat.f20272id + " msg_id = " + i13);
        }
        this.f41255ic = 0;
        this.f41268jc = false;
        this.f41292lc = null;
        this.f41304mc = null;
        pj pjVar = this.f41433x0;
        if (pjVar != null) {
            pjVar.f1();
        }
        if (this.hc != -1) {
            getConnectionsManager().cancelRequest(this.hc, false);
        }
        if (this.f41232gc != -1) {
            getConnectionsManager().cancelRequest(this.f41232gc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f41255ic = i13;
        this.f41268jc = false;
        this.f41281kc = System.currentTimeMillis();
        pj pjVar2 = this.f41433x0;
        if (pjVar2 != null) {
            pjVar2.f1();
        }
        final int i14 = this.f41207ec + 1;
        this.f41207ec = i14;
        this.f41232gc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                sn snVar = sn.this;
                AndroidUtilities.runOnUIThread(new i0(29, snVar, new Runnable(i14, i11, j11, tLObject, i12, messageObject2, tL_messages_getDiscussionMessage, chat, messageObject) {
                    public final int f36534b;
                    public final int f36535c;
                    public final TLObject d;
                    public final int e;
                    public final MessageObject f36536f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f36537n;
                    public final MessageObject f36538r;

                    {
                        this.d = tLObject;
                        this.e = r7;
                        this.f36536f = r8;
                        this.h = r9;
                        this.f36537n = r10;
                        this.f36538r = r11;
                    }

                    @Override
                    public final void run() {
                        int i15;
                        final sn snVar2 = sn.this;
                        if (this.f36534b != snVar2.f41207ec) {
                            return;
                        }
                        snVar2.f41232gc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            snVar2.f41292lc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            snVar2.getMessagesController().putUsers(snVar2.f41292lc.users, false);
                            snVar2.getMessagesController().putChats(snVar2.f41292lc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = snVar2.f41292lc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i16 = 0; i16 < snVar2.f41292lc.messages.size(); i16++) {
                                TLRPC.Message message = snVar2.f41292lc.messages.get(i16);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i17 = this.f36535c;
                        final int i18 = this.e;
                        final MessageObject messageObject3 = this.f36536f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = this.h;
                        final TLRPC.Chat chat2 = this.f36537n;
                        final MessageObject messageObject4 = this.f36538r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = snVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f20293id;
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
                            final int i19 = snVar2.fc + 1;
                            snVar2.fc = i19;
                            snVar2.hc = snVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new lh(sn.this, i19, tLObject3, tL_error2, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4, 0));
                                }
                            });
                            return;
                        }
                        snVar2.Ca(snVar2.f41292lc, snVar2.f41304mc, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f41232gc, this.classGuid);
    }

    public final void fb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f20278id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.T5, this.f41311n5, this.X3, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = H8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        B6();
    }

    public final void fc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.T5, d())) {
            if (z10) {
                getNotificationsController().muteDialog(this.T5, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.f3 E = org.telegram.ui.Components.f5.E(this.T5, d(), this, this.f41205ea);
            E.setCalcMandatoryInsets(C9());
            showDialog(E);
            return;
        }
        getNotificationsController().muteDialog(this.T5, d(), false);
        if (!z10) {
            org.telegram.ui.Components.xc.z(this, 4, 0, this.f41205ea).j();
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.m1 m1Var = this.Q8;
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.T5, this.f41311n5, this.X3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = H8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.T5, this.f41311n5, this.X3, null, this.f41285l5, z10, i10, 0, H8(), 0L, S8());
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
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f41311n5, this.X3, null, this.f41285l5, false, true, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f41225g5);
                B6();
                if (i10 != 0) {
                    if (this.S3 == -1) {
                        this.S3 = 0;
                    }
                    this.S3 = arrayList.size() + this.S3;
                    Ic(true);
                }
            }
        }
    }

    public final boolean g9() {
        mm mmVar = this.f41180c9;
        if (mmVar != null && mmVar.x()) {
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
                    SparseArray[] sparseArrayArr = this.W5;
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
            ah.f0 f0Var = this.Y9;
            if (f0Var != null && f0Var.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            Bundle d = org.telegram.messenger.wh.d(3, "onlySelect", "dialogsType", true);
            d.putInt("messagesCount", this.f41177c6);
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            d.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(d);
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
            if (this.f41271k2 == null) {
                lm lmVar = this.X0;
                int indexOfChild = lmVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, getParentActivity(), null, true);
                    this.f41271k2 = r40Var;
                    lmVar.addView(r40Var, indexOfChild + 1, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 51));
                    this.f41271k2.setAlpha(0.0f);
                    this.f41271k2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f41271k2.setText(string);
            this.f41271k2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f41283l2 == null) {
            lm lmVar2 = this.X0;
            int indexOfChild2 = lmVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(getParentActivity(), 9);
            this.f41283l2 = r40Var2;
            lmVar2.addView(r40Var2, indexOfChild2 + 1, w7.z5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 51));
            this.f41283l2.setAlpha(0.0f);
            this.f41283l2.setVisibility(4);
        }
        this.f41283l2.setText(string);
        this.f41283l2.f(this.P0.getForwardButton(), true);
    }

    public final void gb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j10) {
        long j11;
        String str;
        zj zjVar = this.I1;
        if (zjVar == null) {
            return;
        }
        TLRPC.User user = zjVar.getAdapter().f11947w0;
        if (user != null) {
            j11 = user.f20419id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f20270id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.I1.getAdapter().f11947w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.T5, this.f41311n5, this.X3, null, this.f41285l5, z10, i10, 0, H8(), j10, S8());
        this.Y.setFieldText("");
        j9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void gc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = this.A3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f41189d5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.Q4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.T5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.Q4 - 1), Boolean.valueOf(this.S4));
        this.A3 = org.telegram.ui.Components.xc.B(this, false, new ai.bb(this, arrayList2, arrayList, i10, 14), new ue(this, messageObject, 7), this.f41205ea).j();
    }

    @Override
    public final org.telegram.ui.ActionBar.z4 getBackButtonState() {
        return org.telegram.ui.ActionBar.z4.f21912a;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21911c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.R3 == 0 && (call = this.W7) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.R3 == 2) {
            ArrayList arrayList = this.f41400u6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + F8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f41205ea;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        int i11;
        int i12;
        if (this.e7) {
            return null;
        }
        if (this.f41153aa) {
            this.f41153aa = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Qd));
        if (!F9()) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21321v8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.h6.f21376y8;
            arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21393z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21265s8));
        jj jjVar = this.f41145a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jjVar != null ? jjVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        jj jjVar2 = this.f41145a1;
        org.telegram.ui.ActionBar.j5 titleTextView = jjVar2 != null ? jjVar2.getTitleTextView() : null;
        int i14 = org.telegram.ui.ActionBar.h6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(titleTextView, 8, null, null, null, null, i14));
        jj jjVar3 = this.f41145a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jjVar3 != null ? jjVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.h6.f20963c2, org.telegram.ui.ActionBar.h6.f20982d2}, org.telegram.ui.ActionBar.h6.f21209pa));
        jj jjVar4 = this.f41145a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jjVar4 != null ? jjVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21284t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.h6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 67108864, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, i15));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.h6.f21376y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar3, 512, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.h6.f21340w8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.h6.f21358x8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.h6.f21393z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41158b1, 4, null, null, null, null, i16));
        jj jjVar5 = this.f41145a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jjVar5 != null ? jjVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21111k4}, null, org.telegram.ui.ActionBar.h6.oc));
        jj jjVar6 = this.f41145a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(jjVar6 != null ? jjVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.l4}, null, org.telegram.ui.ActionBar.h6.f21211pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21237r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21077i8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21095j8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21115k8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21132l8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21151m8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21171n8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21191o8));
        org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.f5 f5Var3 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.f5 f5Var4 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.f5 f5Var5 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.f5 f5Var6 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{f5Var, f5Var2}, null, org.telegram.ui.ActionBar.h6.f21247ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.h6.f20991dc));
        if (f5Var != null) {
            Drawable[] k10 = f5Var.k();
            int i17 = org.telegram.ui.ActionBar.h6.f21286ta;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, f5Var2.k(), null, i17));
            Drawable[] k11 = f5Var3.k();
            int i18 = org.telegram.ui.ActionBar.h6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, f5Var4.k(), null, i18));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Aa));
        if (this.f41205ea.i(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Fa));
        }
        pj pjVar = this.f41433x0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = f5Var5;
        drawableArr[i10] = f5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(pjVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.h6.Ba));
        pj pjVar2 = this.f41433x0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = f5Var5;
        drawableArr2[i10] = f5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(pjVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.h6.f20953bc));
        pj pjVar3 = this.f41433x0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.x0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i19 = org.telegram.ui.ActionBar.h6.f21080ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(pjVar3, 4, clsArr3, themedPaint, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 2, new Class[]{org.telegram.ui.Cells.x0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.h6.f21099jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21336w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.h6.f21119kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.x0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21136lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.x0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21155mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21008ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 2, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.f21045gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.h6.f21055h3};
        int i20 = org.telegram.ui.ActionBar.h6.f21120kd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr3, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21229qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21249rc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f21269sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21288tc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.h6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.h6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.M3, org.telegram.ui.ActionBar.h6.Q3, org.telegram.ui.ActionBar.h6.U3}, null, org.telegram.ui.ActionBar.h6.f21362xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.N3, org.telegram.ui.ActionBar.h6.R3, org.telegram.ui.ActionBar.h6.V3}, null, org.telegram.ui.ActionBar.h6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20925a4, org.telegram.ui.ActionBar.h6.f20945b4, org.telegram.ui.ActionBar.h6.Z3}, null, org.telegram.ui.ActionBar.h6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.h6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.h6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20965c4}, null, org.telegram.ui.ActionBar.h6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20984d4}, null, org.telegram.ui.ActionBar.h6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21037g4}, null, org.telegram.ui.ActionBar.h6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i21 = org.telegram.ui.ActionBar.h6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr4, null, i21));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.h6.f21056h4, org.telegram.ui.ActionBar.h6.B4, org.telegram.ui.ActionBar.h6.D4};
        int i22 = org.telegram.ui.ActionBar.h6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr5, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.G4, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.H4, null, org.telegram.ui.ActionBar.h6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O4}, null, org.telegram.ui.ActionBar.h6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P4}, null, org.telegram.ui.ActionBar.h6.f21244r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Q4}, null, org.telegram.ui.ActionBar.h6.f21227qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.f20943b2, null, null, org.telegram.ui.ActionBar.h6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21091j4}, null, org.telegram.ui.ActionBar.h6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, eVar, org.telegram.ui.ActionBar.h6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.J2, null, null, org.telegram.ui.ActionBar.h6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.K2, null, null, org.telegram.ui.ActionBar.h6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.T1, null, null, org.telegram.ui.ActionBar.h6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.h6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.h6.f21343wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Rc));
        int i23 = org.telegram.ui.ActionBar.h6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i23));
        int i24 = org.telegram.ui.ActionBar.h6.f20932ab;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20972cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21007eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20934ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21026fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20954bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20974cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21044gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21062hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21009ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21079ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21027fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21046gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21098jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21118kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21063hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21081id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21228qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21100jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21248rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21176nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21268sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21194od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21137ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21156md));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21210pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21174nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21212pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21230qd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21135lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21154mb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21250rd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21287tb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21306ub));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21289td));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21324vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21308ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21342wb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21344wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21379yb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21363xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21326vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21396zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21361xb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21380yd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21397zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.U1, null, null, org.telegram.ui.ActionBar.h6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.V1, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.W1, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21082ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21307uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21101je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21325vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.h6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f21251re));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f21270se));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.h6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.h6.f21231qe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.h6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21006ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21025fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21043ga));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.h6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.h6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.h6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.h6.f21362xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.h6.Ra));
        if (this.f41205ea.i(false)) {
            i11 = 2;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.h6.f21237r0, null, org.telegram.ui.ActionBar.h6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.f21332w0, null, null, org.telegram.ui.ActionBar.h6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.B0[0], org.telegram.ui.ActionBar.h6.B0[1], org.telegram.ui.ActionBar.h6.D0}, null, null, org.telegram.ui.ActionBar.h6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.C0[0], org.telegram.ui.ActionBar.h6.C0[1], org.telegram.ui.ActionBar.h6.E0}, null, null, org.telegram.ui.ActionBar.h6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20923a1}, null, org.telegram.ui.ActionBar.h6.f20930a9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21034g1, org.telegram.ui.ActionBar.h6.f21053h1}, null, org.telegram.ui.ActionBar.h6.f21096j9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.F0[1], null, null, org.telegram.ui.ActionBar.h6.f21078i9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.G0, null, null, org.telegram.ui.ActionBar.h6.f21152m9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21116k9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21192o9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.h6.H0, null, null, org.telegram.ui.ActionBar.h6.p9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.I0, null, null, org.telegram.ui.ActionBar.h6.f21226q9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.T0}, null, org.telegram.ui.ActionBar.h6.f21305u9));
            i11 = 2;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.V0, org.telegram.ui.ActionBar.h6.W0}, null, org.telegram.ui.ActionBar.h6.f21322v9));
        }
        zj zjVar = this.I1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i25 = org.telegram.ui.ActionBar.h6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(zjVar, 0, null, themedPaint2, null, null, i25));
        zj zjVar2 = this.I1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.h6.f21072i3};
        int i26 = org.telegram.ui.ActionBar.h6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.j6(zjVar2, 0, null, null, drawableArr10, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21090j3}, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21072i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21072i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21072i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        int i27 = org.telegram.ui.ActionBar.h6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i27));
        int i28 = org.telegram.ui.ActionBar.h6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i28));
        int i29 = org.telegram.ui.ActionBar.h6.f21075i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        int i30 = org.telegram.ui.ActionBar.h6.f21102jf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i27));
        int i31 = org.telegram.ui.ActionBar.h6.f20956bf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20935ae));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.h6.f20955be));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.h6.kf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21178nf));
        hk hkVar = this.Y;
        int i32 = org.telegram.ui.ActionBar.h6.f21158mf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21196of));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20976cf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20936af));
        int i33 = i11;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21029ff));
        hk hkVar2 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar2 != null ? hkVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.He));
        hk hkVar3 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar3 != null ? hkVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ke));
        hk hkVar4 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar4 != null ? hkVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Le));
        hk hkVar5 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar5 != null ? hkVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Me));
        hk hkVar6 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar6 != null ? hkVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oe));
        hk hkVar7 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar7 != null ? hkVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Pe));
        hk hkVar8 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar8 != null ? hkVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Re));
        hk hkVar9 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar9 != null ? hkVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Se));
        hk hkVar10 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar10 != null ? hkVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.We));
        hk hkVar11 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar11 != null ? hkVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ne));
        hk hkVar12 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar12 != null ? hkVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Je));
        hk hkVar13 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar13 != null ? hkVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ue));
        hk hkVar14 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hkVar14 != null ? hkVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qe));
        hk hkVar15 = this.Y;
        if (hkVar15 != null) {
            org.telegram.ui.Components.n51 trendingStickersAlert = hkVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, new Drawable[]{this.Y.getStickersArrowDrawable()}, null, i28));
        }
        int i34 = 0;
        while (i34 < i33) {
            View view = i34 == 0 ? this.y3 : this.f41461z3;
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 32, null, null, null, null, org.telegram.ui.ActionBar.h6.Fi));
            int i35 = org.telegram.ui.ActionBar.h6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i35));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i35));
            int i36 = org.telegram.ui.ActionBar.h6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 2, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i35));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i36));
            arrayList.add(new org.telegram.ui.ActionBar.j6(view, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i36));
            i34++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f21320v7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21339w7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f21303u7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f21283t7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21357x7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f21375y7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41460z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21010ee));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41460z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20986d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21028fe));
        for (int i37 = 0; i37 < i33; i37++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21028fe));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.D2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21047ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21028fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21047ge));
        ImageView imageView = this.J2;
        int i38 = org.telegram.ui.ActionBar.h6.f20992de;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L2, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U1, 8, null, null, null, null, i38));
        TextView textView = this.L1;
        int i39 = org.telegram.ui.ActionBar.h6.he;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.f21224q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H1, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21327ve));
        ImageView imageView2 = this.S2;
        int i40 = org.telegram.ui.ActionBar.h6.f21364xe;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i40));
        ImageView imageView3 = this.S2;
        int i41 = org.telegram.ui.ActionBar.h6.f21393z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView3, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 8, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21398ze));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21291tf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sh));
        org.telegram.ui.Components.po poVar = this.Y0;
        int i42 = org.telegram.ui.ActionBar.h6.f21080ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(poVar, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41159b2, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41330p0, 2048, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.h6.De));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41433x0, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ee));
        ei.g6 g6Var = this.Q;
        int i43 = org.telegram.ui.ActionBar.h6.f21136lc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(g6Var, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41159b2, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y0, 536870912, null, null, null, null, i43));
        if (this.I1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ce));
            int i44 = org.telegram.ui.ActionBar.h6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"nameTextView"}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A6));
            Drawable[] drawableArr11 = new Drawable[3];
            drawableArr11[0] = org.telegram.ui.ActionBar.h6.f21147m4;
            drawableArr11[1] = org.telegram.ui.ActionBar.h6.f21167n4;
            drawableArr11[i33] = org.telegram.ui.ActionBar.h6.f21187o4;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, drawableArr11, null, org.telegram.ui.ActionBar.h6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21391z6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21081id));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21100jd));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20987d7));
        }
        org.telegram.ui.Components.r40 r40Var = this.f41198e2;
        int i45 = org.telegram.ui.ActionBar.h6.f21232qf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r40Var, 32, null, null, null, null, i45));
        org.telegram.ui.Components.r40 r40Var2 = this.f41198e2;
        int i46 = org.telegram.ui.ActionBar.h6.f21213pf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r40Var2, 4, null, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41383t2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41383t2, 8, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"imageView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41383t2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41396u2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f41396u2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i43));
        int i47 = org.telegram.ui.ActionBar.h6.ia;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21097ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21117ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21134la));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21153ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21173na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21193oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.R4}, null, org.telegram.ui.ActionBar.h6.f20990da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21057h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21074i5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21223q5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21113k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21310uf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21328vf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20938ah));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20958bh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20978ch));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20995dh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21013eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21030fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084ih));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21104jh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21123kh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21050gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21066hh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20928a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Dj));
        int i48 = org.telegram.ui.ActionBar.h6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21365xf));
        hk hkVar16 = this.Y;
        if (hkVar16 == null || hkVar16.m0 == null) {
            i12 = 0;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f11535c, 4, new Class[]{gi.z.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.h6.G6));
            i12 = 0;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f11535c, 4, new Class[]{gi.z.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.h6.f21374y6));
        }
        xh.d dVar = this.f41218fa;
        if (dVar != null) {
            dVar.b(arrayList);
        }
        int size = arrayList.size();
        int i49 = i12;
        while (i49 < size) {
            Object obj = arrayList.get(i49);
            i49++;
            ((org.telegram.ui.ActionBar.j6) obj).f21463o = this.f41205ea;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f41205ea.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint n10 = this.f41205ea.n(str);
        if (n10 != null) {
            return n10;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    public final boolean h7(View view) {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer != null) {
            Wb(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void h8(View view) {
        i8(view, false);
    }

    public final void h9() {
        org.telegram.ui.Components.iu editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.s()) {
                this.Bc.i(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.f41149a6 = 0;
        this.f41190d6 = 0;
        this.f41163b6 = 0;
        this.f41215f6 = 0;
        this.f41226g6 = 0;
        this.f41202e6 = 0;
        hk hkVar = this.Y;
        if (hkVar != null && (editField = hkVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        mm mmVar = this.f41180c9;
        if (mmVar != null) {
            mmVar.f(true);
            SparseArray sparseArray = this.f41180c9.f22731p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        kl klVar = this.f41242h9;
        if (klVar != null) {
            AndroidUtilities.cancelRunOnUIThread(klVar.H);
            klVar.a();
        }
        hk hkVar2 = this.Y;
        if (hkVar2 != null) {
            hkVar2.f23906a0 = false;
        }
        this.f41253i9 = false;
        if (this.f41168bb != null) {
            p9();
        }
    }

    public final void ha(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f41214f5;
        if (messagePreviewParams != null && this.Fa == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.G5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f41311n5;
                if (messageObject2 == this.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f41285l5, this.p5);
            }
            if (!this.f41214f5.isEmpty()) {
                this.f41206eb = this.Y.f24050z2;
                Context context = this.X0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f41214f5;
                TLRPC.User user = this.f41208f;
                TLRPC.Chat chat = this.e;
                int i12 = this.currentAccount;
                qn qnVar = this.f41205ea;
                in inVar = this.f41285l5;
                if (inVar != null && inVar.f37926f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cl clVar = new cl(this, context, this, this.A8, messagePreviewParams2, user, chat, i12, qnVar, i10, z10);
                this.Fa = clVar;
                this.f41214f5.attach(clVar);
                TLRPC.ChatFull chatFull = this.Z7;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.ha) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.ha.peers.get(0).peer;
                }
                this.Fa.setSendAsPeer(peer);
                g7();
                this.X0.addView(this.Fa);
                if (this.f41206eb) {
                    hk hkVar = this.Y;
                    hkVar.T0 = true;
                    org.telegram.ui.Components.dg dgVar = hkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(true);
                    }
                    this.Y.q1();
                    this.D3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void hb(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        long j11;
        if (i7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.effect_id = j10;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f41225g5;
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
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.T5, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = H8();
                of3.effect_id = j11;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = S8();
                of3.suggestionParams = this.f41225g5;
                getSendMessagesHelper().sendMessage(of3);
                j11 = 0;
            }
            B6();
        }
    }

    public final void hc() {
        boolean F9 = F9();
        SparseArray[] sparseArrayArr = this.W5;
        if (!F9) {
            if (this.actionBar.s() && this.f41158b1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f41158b1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
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
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.X3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f41208f;
    }

    public final boolean i7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void i8(View view, boolean z10) {
        boolean z11;
        sb(view);
        if (view != this.f41257j1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j8(z10, z11, 0.2f);
    }

    public final void i9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.xc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Ja(this.f41189d5);
            La(this.f41189d5);
            return;
        }
        showDialog(new sg.x0((org.telegram.ui.ActionBar.n2) this, 3, true));
    }

    public final void ia(String str, boolean z10) {
        boolean z11;
        ek ekVar;
        boolean z12;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                P7();
                ei.x3 x3Var = this.f41407v1;
                if (x3Var != null && x3Var.V) {
                    x3Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                ei.x3 x3Var2 = this.f41421w1;
                if (x3Var2 != null && x3Var2.V) {
                    x3Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new te(this, str, 5), 200L);
                    return;
                }
                this.f41397u3 = str;
                this.f41384t3 = str;
                boolean contains = str.contains("@");
                U6(true);
                if (!this.actionBar.f21493n0) {
                    this.zc.a(true, true);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f41233h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f41196e0;
                    if (xVar != null) {
                        xVar.f(8);
                    }
                    wr wrVar = this.f41184d0;
                    if (wrVar != null) {
                        wrVar.b(false);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f41244i0;
                    if (xVar2 != null) {
                        xVar2.f(8);
                    }
                    if ((this.f41188d4 == 0 || (i10 = this.R3) == 3 || i10 == 8) && (u0Var = this.f41256j0) != null) {
                        u0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
                    if (u0Var3 != null && this.K9) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar3 = this.f41306n0;
                    if (xVar3 != null && this.L9) {
                        xVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.f41269k0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    this.f41319o0 = true;
                    Jc(0, 0, -1);
                    lc(false);
                }
                sk skVar = this.f41320o1;
                if (skVar != null) {
                    if (skVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        skVar.g(false);
                    }
                }
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.e) || !ChatObject.isPublic(this.e) || this.f41397u3 == null)) {
                    this.f41355r1 = 0;
                } else {
                    this.f41355r1 = 2;
                }
                this.W4 = false;
                if (this.O3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ei.h1 h1Var = this.f41342q1;
                if (h1Var != null) {
                    h1Var.h.clear();
                }
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f41256j0;
                if (u0Var5 != null) {
                    this.f41195dc = true;
                    u0Var5.z(false);
                    this.f41195dc = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var6 = this.f41256j0;
                if (u0Var6 != null) {
                    u0Var6.setSearchFieldCaption(null);
                    this.f41256j0.H(str, false);
                    this.f41256j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f41384t3, this.T5, this.L6, this.classGuid, 0, this.f41188d4, false, this.f41322o3, this.f41333p3, false, this.f41344q3);
                Cc(0, true);
                this.f41186d2.e(true, true);
                Pb(true);
                ek ekVar2 = this.f41331p1;
                if (ekVar2 != null) {
                    ekVar2.b(!contains);
                    Lc();
                }
                if ((contains || z10) && this.f41397u3 != null && (ekVar = this.f41331p1) != null) {
                    int currentPosition = ekVar.f25629a.getCurrentPosition();
                    int i11 = this.f41355r1;
                    if (currentPosition != i11) {
                        this.f41331p1.f25629a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f41397u3);
                this.f41382t1.f28390f.N(true);
                View currentView = this.f41342q1.getCurrentView();
                if (currentView instanceof un) {
                    ((un) currentView).f42016a.Nc(this.f41397u3);
                }
            }
        }
    }

    public final void ib(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f41311n5, this.X3, null, this.f41285l5, z11, true, null, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f41225g5);
            B6();
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Ic(true);
        }
    }

    public final void ic() {
        lm lmVar = this.X0;
        if (lmVar != null && this.f41181ca == null) {
            if (this.f41205ea.f40472n == null || lmVar.getBackgroundImage() == null) {
                if (this.X0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.X0.V(org.telegram.ui.ActionBar.h6.s0());
                }
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (F9()) {
            org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.r(org.telegram.ui.ActionBar.h6.f21340w8);
            } else {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21340w8, true);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.h6.I.q();
        } else {
            z10 = this.Db;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.R3 != 5 || (!this.f41400u6.isEmpty() && this.f41188d4 != 0)) && !this.yc.f17380f && this.f41315n9) {
            cl clVar = this.Fa;
            if (clVar == null || !clVar.f28927s) {
                vh.i iVar = this.X9;
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
            t1 t1Var = new t1(this, aVar, runnable, 20);
            ai.fa x10 = ai.fa.x(this.currentAccount, aVar.f631a);
            if (!x10.e) {
                x10.q(true, true, t1Var);
                return;
            } else {
                t1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void j8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        kh.h hVar;
        org.telegram.ui.Cells.u1 u1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.J8;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) view;
            u1Var2.setInvalidatesParent(z12);
            if (z12) {
                Ra(u1Var2);
            }
        }
        this.X0.invalidate();
        this.f41433x0.invalidate();
        AnimatorSet animatorSet = this.P8;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.P8.cancel();
        }
        this.P8 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.H8, f7);
        float f10 = 1.0f;
        if (z12) {
            this.K8 = 1.0f;
            this.L8 = 0.0f;
            ValueAnimator valueAnimator = this.f41169bc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.I8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.ym0.d(new ye(this, 3));
            }
        } else {
            float f11 = this.H8;
            this.L8 = f11 / max;
            this.I8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new fg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f41257j1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.P8.playTogether(arrayList);
        this.P8.setInterpolator(org.telegram.ui.Components.bs.h);
        this.P8.setDuration(320L);
        View view2 = this.J8;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            u1Var = (org.telegram.ui.Cells.u1) view2;
        } else {
            u1Var = null;
        }
        this.P8.addListener(new ah.q0(this, z12, u1Var, 4));
        if (this.J8 != null && this.K8 <= 0.0f) {
            sb(null);
        }
        this.P8.start();
    }

    public final void j9(boolean z10) {
        Db(false, null, null, false, z10);
    }

    public final boolean ja(String str, org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, int i10, int i11) {
        gi.m4 m4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.e == null || str == null || this.R3 != 0) {
            return false;
        }
        if (u1Var != null && (characterStyle != null || i11 != 1)) {
            m4Var = new gi.m4(this, i10, i11, characterStyle, u1Var);
        } else {
            m4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.e) != null) {
                try {
                    if (Kc == null) {
                        Kc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Lc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Kc.matcher(str);
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
                                    this.f41388t7 = true;
                                    if (this.R3 == 2) {
                                        this.V8.D0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f41453y7 = W;
                                    if (W >= 0) {
                                        this.f41465z7 = parseInt;
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
                        Matcher matcher2 = Lc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f41228g8 = queryParameter2;
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
                        if (this.R3 == 2) {
                            this.V8.D0(intValue3);
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
                    if (Mc == null) {
                        Mc = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = Mc.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.e.f20272id || parseInt3 == 0) {
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
                            TLRPC.TL_forumTopic tL_forumTopic = this.f41175c4;
                            if (tL_forumTopic != null && tL_forumTopic.f20324id == findTopic.f20324id) {
                                return true;
                            }
                            return false;
                        }
                        this.f41388t7 = true;
                        if (this.R3 == 2) {
                            this.V8.D0(parseInt3);
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
            long j10 = this.e.f20272id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                fa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f41388t7 = true;
            if (this.R3 == 2) {
                this.V8.D0(intValue9);
                finishFragment();
                return true;
            }
            bb(intValue9, i10, true, 0, false, 0, null, null, m4Var);
            return true;
        }
    }

    public final ue jb(MessageObject messageObject, boolean z10) {
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
                getMessagesController().markMessageAsRead(this.T5, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.T5, messageObject.getId(), null, i11, 0L, z11);
            return null;
        }
        return new ue(this, messageObject, 1);
    }

    public final void jc() {
        TLRPC.User user;
        boolean z10;
        if (this.f41233h0 != null && (user = this.f41208f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f41192d8;
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
                this.f41233h0.K(30);
            } else {
                this.f41233h0.r(30);
            }
            if (z10) {
                this.f41233h0.K(31);
            } else {
                this.f41233h0.r(31);
            }
        }
    }

    public final void k7() {
        if (this.f41461z3 != null) {
            return;
        }
        dl dlVar = new dl(this, getParentActivity(), this, this.f41205ea);
        this.f41461z3 = dlVar;
        this.X0.addView(dlVar, 17, w7.z5.a(-2.0f, 8.0f, 8.0f, 8.0f, 0.0f, -1, 51));
    }

    public final void k8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void k9(boolean z10) {
        if (this.X2.getTag() != null && !this.f41187d3) {
            if (!this.f41259j3 || this.f41212f3) {
                this.X2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f41223g3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f41223g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 0.0f));
                    this.f41223g3.addListener(new qi(this, 6));
                    this.f41223g3.setStartDelay(this.f41146a3);
                    this.f41223g3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f41223g3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f41223g3 = null;
                    }
                    this.X2.setAlpha(0.0f);
                }
                this.f41146a3 = 500;
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

    public final void kb(int r28, android.net.Uri r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.kb(int, android.net.Uri, boolean):void");
    }

    public final void kc() {
        if (this.R1 == null) {
            return;
        }
        this.R1.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.d());
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2 = null;
        o8(str, null);
        if (i7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.invert_media = z11;
                of2.payStars = j11;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f41225g5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.T5, false, false, true, 0, 0, null, -1, j11, S8(), this.f41225g5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.T5, this.f41311n5, this.X3, null, this.f41285l5, this.p5, z10, i10, 0, null, H8(), j10, z11, j11, S8(), this.f41225g5);
            B6();
        }
    }

    public final void l7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.Hb > 1000) {
            z10 = true;
        }
        mg mgVar = this.Ib;
        AndroidUtilities.cancelRunOnUIThread(mgVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        AndroidUtilities.runOnUIThread(mgVar, j10);
    }

    public final void l8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.p5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void l9(boolean z10) {
        if (this.Y2.getTag() != null && !this.f41199e3) {
            if (!this.f41272k3 || this.f41212f3) {
                this.Y2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f41247i3, 0.0f);
                    this.f41236h3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f41236h3.addUpdateListener(new oe(this, 1));
                    this.f41236h3.addListener(new qi(this, 8));
                    this.f41236h3.setStartDelay(this.f41146a3);
                    this.f41236h3.start();
                } else {
                    ValueAnimator valueAnimator = this.f41236h3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f41236h3 = null;
                    }
                    this.f41247i3 = 0.0f;
                    pc();
                }
                this.f41146a3 = 500;
            }
        }
    }

    public final void la(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f41208f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f41208f.f20419id) {
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

    public final void lb(MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages c92 = c9(messageObject);
        boolean z12 = false;
        if (c92 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < c92.messages.size()) {
                    if (this.W5[i10].indexOfKey(c92.messages.get(i11).getId()) < 0) {
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
        u1Var.setDrawSelectionBackground(z11);
        if (c92 == null) {
            z12 = true;
        }
        u1Var.L3(true, z12, z10);
    }

    public final void lc(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.lc(boolean):void");
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        o8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.T5, this.f41311n5, this.X3, null, this.f41285l5, true, false, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, H8(), 0L, false, j10, S8(), this.f41225g5);
        B6();
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Ic(true);
        }
    }

    public final void m7() {
        int b92 = (int) (b9(org.telegram.ui.Components.l31.f28060c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(b92);
        int b10 = w7.r.b(AndroidUtilities.dp(36.0f) + (this.X0.getMeasuredHeight() - b92), 0, this.X0.getMeasuredHeight());
        int measuredWidth = this.X0.getMeasuredWidth();
        Rect rect = Pc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Aa, this.f41433x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f41433x0.getMeasuredHeight() - this.Ba) - b92));
    }

    public final void m8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f41225g5;
        if (messageSuggestionParams != null) {
            Hb(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.G5;
        if (webPage != null) {
            Ib(true, webPage, false);
            return;
        }
        in inVar = this.f41285l5;
        if (inVar != null) {
            Gb(this.f41311n5, inVar);
            return;
        }
        MessageObject messageObject = this.f41311n5;
        if (messageObject != null && messageObject != this.X3) {
            Fb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f41214f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Eb(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.p5;
        if (messageObject2 != null) {
            Cb(true, null, messageObject2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Ib(false, null, true);
        }
    }

    public final void m9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.r40 r40Var = this.f41294m2;
            if (r40Var != null) {
                r40Var.b(true);
            }
            cj cjVar = this.f41222g2;
            if (cjVar != null) {
                cjVar.b(true);
            }
            org.telegram.ui.Components.r40 r40Var2 = this.f41246i2;
            if (r40Var2 != null) {
                r40Var2.b(true);
            }
        }
        org.telegram.ui.Components.r40 r40Var3 = this.f41283l2;
        if (r40Var3 != null) {
            r40Var3.b(true);
        }
        org.telegram.ui.Components.r40 r40Var4 = this.f41271k2;
        if (r40Var4 != null) {
            r40Var4.b(true);
        }
        org.telegram.ui.Components.r40 r40Var5 = this.f41383t2;
        if (r40Var5 != null) {
            r40Var5.b(true);
        }
        org.telegram.ui.Components.r40 r40Var6 = this.f41396u2;
        if (r40Var6 != null) {
            r40Var6.b(true);
        }
        org.telegram.ui.Components.r40 r40Var7 = this.f41308n2;
        if (r40Var7 != null) {
            r40Var7.b(true);
        }
        org.telegram.ui.Components.r40 r40Var8 = this.f41321o2;
        if (r40Var8 != null) {
            r40Var8.b(true);
        }
        org.telegram.ui.Components.aq aqVar = this.f41408v2;
        if (aqVar != null) {
            aqVar.a();
        }
        ei.x3 x3Var = this.J0;
        if (x3Var != null) {
            x3Var.e(true);
        }
        ei.x3 x3Var2 = this.L0;
        if (x3Var2 != null) {
            x3Var2.e(true);
        }
        ei.x3 x3Var3 = this.K0;
        if (x3Var3 != null) {
            x3Var3.e(true);
        }
    }

    public final void ma(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        long j10;
        long j11;
        org.telegram.ui.Components.e6 animation;
        Bitmap m10;
        if (u1Var == null) {
            int childCount = this.f41433x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f41433x0.getChildAt(i10);
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
            jb(messageObject, true);
        }
        PhotoViewer.t1().K2(null, this, this.f41205ea);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (u1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = u1Var.getPhotoImage().getAnimation()) != null && this.f41428w8 != null && this.f41389t8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f41428w8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.R3;
        ml mlVar = this.Ga;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f41400u6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().b2(arrayList, arrayList.indexOf(messageObject), this.T5, 0L, d(), mlVar);
        } else {
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = messageObject.type;
            long j12 = 0;
            if (i13 != 0) {
                j10 = this.T5;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = this.L6;
            } else {
                j11 = 0;
            }
            if (i13 != 0) {
                j12 = d();
            }
            t12.d2(messageObject, this, j10, j11, j12, mlVar);
        }
        m9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void mb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f41205ea != null && this.f41181ca == null) {
            gg.b c10 = gg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.T5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.c4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.c4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.k();
                    theme.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.c4 c4Var = theme;
                qn qnVar = this.f41205ea;
                TLRPC.WallPaper wallPaper = qnVar.h;
                if (this.P5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                qnVar.k(c4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new re(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.T5);
            qn qnVar2 = this.f41205ea;
            org.telegram.ui.ActionBar.c4 c4Var2 = qnVar2.f40471f;
            if (this.P5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            qnVar2.k(c4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void mc() {
        lc(false);
    }

    @Override
    public final boolean n() {
        return this.f41363r9;
    }

    public final void n7() {
        int i10;
        if (this.f41145a1 != null) {
            float actionModeFactor = (1.0f - this.zc.e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f41145a1.setScaleX(lerp);
            this.f41145a1.setScaleY(lerp);
            this.f41145a1.setAlpha(actionModeFactor);
            jj jjVar = this.f41145a1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            jjVar.setVisibility(i10);
        }
    }

    public final void n9() {
        ValueAnimator valueAnimator = this.f41231gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.x0 x0Var = this.Z2;
        if (x0Var != null && x0Var.getTag() != null) {
            this.Z2.setTag(null);
            org.telegram.ui.Cells.x0 x0Var2 = this.Z2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new gf(this, x0Var2, 1));
            ofFloat.addListener(new ai.le(14, this, x0Var2));
            ofFloat.setDuration(150L);
            this.f41231gb = ofFloat;
            ofFloat.start();
        }
    }

    public final void na(boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var;
        int i10;
        if (getParentActivity() != null && (d5Var = this.parentLayout) != null && d5Var.getLastFragment() == this && !this.H4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f20272id);
            } else {
                bundle.putLong("user_id", this.f41208f.f20419id);
            }
            bundle.putInt("chatMode", 2);
            sn snVar = new sn(bundle);
            snVar.H4 = new ArrayList(this.H4);
            snVar.J4 = new HashMap(this.J4);
            int size = this.H4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.H4.get(i11);
                MessageObject messageObject = (MessageObject) this.J4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f41325o6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    snVar.J4.put(num, messageObject);
                    snVar.Dc();
                }
            }
            snVar.P4 = this.P4;
            if (this.f41237h4) {
                i10 = this.H4.size();
            } else {
                i10 = this.Q4;
            }
            snVar.Q4 = i10;
            snVar.S4 = this.S4;
            snVar.f41151a8 = this.f41151a8;
            snVar.Z7 = this.Z7;
            snVar.V8 = new hl(this, snVar);
            if (z10) {
                presentFragmentAsPreview(snVar);
                g7();
                return;
            }
            presentFragment(snVar, false);
        }
    }

    public final void nb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                nb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f41433x0 && view != this.X0) {
            view.setEnabled(z10);
        }
    }

    public final void nc() {
        int i10;
        org.telegram.ui.Components.ub ubVar;
        tk tkVar;
        hk hkVar;
        if (this.D9 && this.f41433x0 != null) {
            float f7 = 0.0f;
            if (this.f41338pa <= 0 || this.Ea != 0.0f) {
                float a92 = a9(AndroidUtilities.dp(7.0f));
                sk skVar = this.f41320o1;
                if (skVar != null) {
                    i10 = AndroidUtilities.dp(skVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float E8 = (E8() * AndroidUtilities.dp(43.0f)) + a92 + i10;
                float f10 = this.f41377s9;
                this.f41390t9 = E8;
                this.f41377s9 = b9(org.telegram.ui.Components.l31.f28058a) + AndroidUtilities.dp(4.0f) + this.f41415v9 + E8;
                if (this.actionBar.getVisibility() == 0 || this.f41194da != null) {
                    this.f41377s9 += this.actionBar.getMeasuredHeight();
                }
                this.f41403u9 = 0;
                this.f41377s9 = this.f41377s9 + this.Aa + this.w9;
                if (this.Ea != 0.0f && (hkVar = this.Y) != null && hkVar.getVisibility() == 0) {
                    float f11 = this.f41377s9;
                    float measuredHeight = this.Ea * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f41377s9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.x0 x0Var = this.Z2;
                if (x0Var != null) {
                    x0Var.setTranslationY(((this.f41433x0.getTranslationY() + this.f41377s9) + this.A9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f41377s9;
                    float f13 = this.A9;
                    this.f41377s9 = f12 + f13;
                    this.f41403u9 = (int) (this.f41403u9 + f13);
                }
                yj yjVar = this.X2;
                if (yjVar != null) {
                    yjVar.setTranslationY((((this.f41433x0.getTranslationY() - f7) + this.f41377s9) + this.f41455y9) - AndroidUtilities.dp(4.0f));
                }
                pc();
                pj pjVar = this.f41433x0;
                if (pjVar != null && this.f41458z0 != null && this.A0 != null) {
                    int paddingTop = pjVar.getPaddingTop();
                    int paddingBottom = this.f41433x0.getPaddingBottom();
                    q7();
                    if (this.f41433x0.getPaddingTop() != paddingTop || this.f41433x0.getPaddingBottom() != paddingBottom) {
                        w9();
                        v9(2);
                    }
                    this.f41433x0.setTopGlowOffset((int) ((this.f41377s9 - this.f41403u9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f41377s9) {
                        int childCount = this.f41433x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f41433x0.getChildAt(i11);
                            this.f41433x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.f41377s9;
                                if (childAt.getTop() > f14) {
                                    this.f41433x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!K9() && !this.D4 && this.J7 != null && this.f41433x0 != null && ((tkVar = this.P1) == null || tkVar.getVisibility() != 0)) {
                        this.f41433x0.scrollBy(0, (int) (f10 - this.f41377s9));
                    }
                }
                this.D9 = false;
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29632w;
                if (qcVar != null && (ubVar = qcVar.e) != null) {
                    ubVar.updatePosition();
                }
                q7();
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.R3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((n2Var instanceof sn) && ((sn) n2Var).C9()) {
                return false;
            }
        }
        return this.H6;
    }

    @Override
    public final org.telegram.ui.Components.oo o() {
        return this.f41145a1;
    }

    public final void o7() {
        boolean z10;
        ei.h1 h1Var;
        if (this.f41194da != null) {
            return;
        }
        int i10 = 0;
        if (this.yc.e >= 1.0f && ((h1Var = this.f41342q1) == null || h1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ai.hc hcVar = this.X0.L;
        if (!z10) {
            i10 = 4;
        }
        hcVar.setVisibility(i10);
    }

    public final void o8(CharSequence charSequence, ArrayList arrayList) {
        if (this.p5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.p5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.p5.isMediaEmpty()) {
                MessageObject messageObject2 = this.p5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                hk hkVar = this.Y;
                if (hkVar != null) {
                    this.p5.editingMessage = hkVar.getFieldText();
                    MessageObject messageObject3 = this.p5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.p5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final boolean o9(boolean z10) {
        el elVar;
        el elVar2 = this.f41435x2;
        if (elVar2 == null || elVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.ch chVar = this.M0;
        if (chVar != null && (elVar = this.f41435x2) != null) {
            chVar.i(elVar, false, z10);
        }
        int i10 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.H2;
            if (i10 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i10] = null;
                }
                i10++;
            } else {
                this.A2 = false;
                this.f41435x2.setTag(1);
                return true;
            }
        }
    }

    public final void oa(int i10, boolean z10) {
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && d5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f20280id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f20272id);
                } else {
                    bundle.putLong("user_id", this.f41208f.f20419id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            sn snVar = new sn(bundle);
            if (this.f41237h4) {
                og.d.a(snVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            snVar.V8 = new lj(this);
            presentFragment(snVar, false);
        }
    }

    public final void ob(boolean z10) {
        pb(z10, false, true);
    }

    public final void oc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.Za == null) {
            this.Za = new a0.h();
        }
        a0.h hVar2 = this.Ya;
        if (hVar2 == null) {
            this.Ya = new a0.h();
        } else {
            hVar2.b();
        }
        this.A0.P.clear();
        this.Za.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.f41439x6;
            arrayList = this.f41400u6;
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
                int i12 = Jc;
                Jc = i12 + 1;
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
                    groupedMessages2.reversed = this.Qa;
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
            this.Za.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (hVar3 != null) {
            for (int i14 = 0; i14 < hVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new org.telegram.ui.ActionBar.i4(7));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f41344q3 != null && TextUtils.isEmpty(this.f41384t3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f41344q3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
            if (!this.Za.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.A0.P.add(messageObject4);
                this.Za.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.A0.P.size()) {
            MessageObject messageObject5 = (MessageObject) this.A0.P.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.Za.d(messageObject6.getId())) {
                        this.A0.P.add(i18, messageObject6);
                        this.Za.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.A0.P, new org.telegram.ui.ActionBar.i4(8));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.A0.P.size()) {
            MessageObject messageObject8 = (MessageObject) this.A0.P.get(i19);
            if (this.Qa && messageObject8 != null && i19 == 0) {
                Ha(messageObject8, i19);
                i19++;
            }
            if (!this.Qa && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ha(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.Ya.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.q.j(messageObject8.dateKeyInt, this.Ya);
            }
            arrayList4.add(messageObject8);
            if (this.Qa && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ha(messageObject8, i19);
                i19++;
            }
            if (!this.Qa && i19 >= this.A0.P.size() - 1) {
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
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.G6 || !arrayList.isEmpty() || this.A0.f36953w >= 0) {
                z11 = false;
            }
            Tb(z11);
            if (this.f41433x0 != null) {
                J7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.G6 || !arrayList.isEmpty() || this.A0.f36953w >= 0)) {
                    this.f41433x0.setEmptyView(this.Q0);
                    pj pjVar = this.f41433x0;
                    pjVar.K0(pjVar.v1());
                    return;
                }
                this.Q0.setVisibility(8);
                this.f41433x0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        ci.b3 b3Var;
        org.telegram.ui.Components.fo foVar;
        String str;
        ci.b3 b3Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (b3Var2 = this.J1) != null) {
                    org.telegram.ui.Components.li liVar = b3Var2.B0;
                    if (liVar instanceof ki.q) {
                        ki.q qVar = (ki.q) liVar;
                        if (intent != null && intent.getData() != null) {
                            ki.w3 w3Var = qVar.f15442r;
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
                        ci.b3 b3Var3 = this.J1;
                        if (b3Var3 != null) {
                            org.telegram.ui.Components.li liVar2 = b3Var3.B0;
                            if (liVar2 instanceof ki.q) {
                                ki.q qVar2 = (ki.q) liVar2;
                                if (intent.getData() != null) {
                                    qVar2.f15442r.f2(intent.getData());
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
                                xb();
                            }
                            if (this.f41346q5) {
                                this.f41376s8 = str;
                            } else {
                                ta(null, str);
                            }
                        } else if (this.p5 == null && this.R3 == 1) {
                            org.telegram.ui.Components.f5.L(getParentActivity(), this.T5, new m4.y0(10, this, data2), this.f41205ea);
                        } else {
                            o8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.T5, this.f41311n5, this.X3, this.f41285l5, null, null, null, null, 0, this.p5, true, 0, this.R3, H8());
                        }
                        B6();
                        return;
                    }
                    xb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        xb();
                        return;
                    }
                    if (this.p5 == null && this.R3 == 1) {
                        if (intent.getData() != null) {
                            ci.b3 b3Var4 = this.J1;
                            if (b3Var4 != null) {
                                b3Var4.dismiss();
                            }
                            org.telegram.ui.Components.f5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.e5(this) {
                                public final sn f39431b;

                                {
                                    this.f39431b = this;
                                }

                                @Override
                                public final void C(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            sn snVar = this.f39431b;
                                            snVar.o8(null, null);
                                            snVar.kb(i12, intent.getData(), z10);
                                            snVar.B6();
                                            return;
                                        default:
                                            sn snVar2 = this.f39431b;
                                            snVar2.o8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                snVar2.kb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            snVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f41205ea);
                            return;
                        } else if (intent.getClipData() != null) {
                            ci.b3 b3Var5 = this.J1;
                            if (b3Var5 != null) {
                                b3Var5.dismiss();
                            }
                            org.telegram.ui.Components.f5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.e5(this) {
                                public final sn f39431b;

                                {
                                    this.f39431b = this;
                                }

                                @Override
                                public final void C(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            sn snVar = this.f39431b;
                                            snVar.o8(null, null);
                                            snVar.kb(i12, intent.getData(), z10);
                                            snVar.B6();
                                            return;
                                        default:
                                            sn snVar2 = this.f39431b;
                                            snVar2.o8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                snVar2.kb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            snVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f41205ea);
                            return;
                        } else {
                            xb();
                        }
                    } else {
                        o8(null, null);
                        if (intent.getData() != null) {
                            kb(0, intent.getData(), true);
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                kb(0, clipData.getItemAt(i12).getUri(), true);
                            }
                        } else {
                            xb();
                        }
                    }
                    ci.b3 b3Var6 = this.J1;
                    if (b3Var6 != null) {
                        b3Var6.dismiss();
                    }
                    B6();
                    return;
                } else if (i10 == 28 && (b3Var = this.J1) != null && (foVar = b3Var.m0) != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = foVar.f28237a;
                    if (foVar.f26299k1 != -1 && foVar.f26297j1 != null) {
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
                            org.telegram.messenger.wh.q(R.string.UnsupportedAttachment, new org.telegram.ui.Components.xc(foVar.f28238b.container, d6Var), d6Var);
                            return;
                        }
                        foVar.h0(foVar.f26299k1, new sh.c(uri));
                        org.telegram.ui.Components.mn mnVar = foVar.f26297j1;
                        if (mnVar != null) {
                            mnVar.dismiss(true);
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
            ci.b3 b3Var7 = this.J1;
            if (b3Var7 != null) {
                b3Var7.f30586j0.g0(i10, intent, this.V7);
            }
            this.V7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.r60 r60Var;
        org.telegram.ui.ActionBar.b2 b2Var;
        org.telegram.ui.Components.pf pfVar;
        org.telegram.ui.Components.nf nfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        mm mmVar;
        ah.e0 e0Var;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29632w;
        if (qcVar != null) {
            org.telegram.ui.Components.ub ubVar = qcVar.e;
            if (ubVar instanceof org.telegram.ui.Components.bc) {
                if (z10) {
                    ((org.telegram.ui.Components.bc) ubVar).f();
                    qcVar.b();
                    return false;
                }
                return false;
            }
        }
        z31 z31Var = this.Z9;
        if (z31Var != null && !z31Var.f43543b0) {
            if (z10) {
                z31Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            ah.f0 f0Var = this.Y9;
            if (f0Var != null && (e0Var = f0Var.f726b) != null && e0Var.getReactionsWindow() != null) {
                if (z10) {
                    f0Var.f726b.e();
                    return false;
                }
            } else if (gt.q().E) {
                if (z10) {
                    gt.q().o();
                    return false;
                }
            } else {
                cl clVar = this.Fa;
                if (clVar != null && clVar.f28927s) {
                    if (z10) {
                        clVar.a(true);
                        return false;
                    }
                } else if (this.yc.f17380f) {
                    if (z10) {
                        Pb(false);
                        return false;
                    }
                } else if (this.Q8 != null) {
                    if (z10) {
                        D7(true);
                        return false;
                    }
                } else if (!a7(z10, false)) {
                    if (g9()) {
                        if (z10 && (mmVar = this.f41180c9) != null && mmVar.x()) {
                            this.f41180c9.f(false);
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
                            hk hkVar = this.Y;
                            if (hkVar != null && hkVar.r0() && (hkVar.f23940f2 != 1 || (tL_replyKeyboardMarkup = hkVar.f23986n2) == null || !tL_replyKeyboardMarkup.is_persistent || hkVar.f23979m2 == null)) {
                                if (z10) {
                                    this.Y.k0(true);
                                    return false;
                                }
                            } else {
                                hk hkVar2 = this.Y;
                                if (hkVar2 != null && hkVar2.t()) {
                                    if (z10) {
                                        hk hkVar3 = this.Y;
                                        gi.b0 b0Var = hkVar3.f23974l0;
                                        if (b0Var != null) {
                                            b0Var.setOpened(false);
                                        }
                                        if (!hkVar3.h0() && (nfVar = hkVar3.m0) != null) {
                                            nfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    hk hkVar4 = this.Y;
                                    if (hkVar4 == null || (pfVar = hkVar4.E0) == null || !pfVar.closeCreationLinkDialog(z10)) {
                                        if (this.R3 == 6 && (b2Var = ig.v.d) != null && b2Var.isShowing()) {
                                            if (z10) {
                                                ig.v.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.e) && !this.T3 && this.R1 != null && d() != 0) {
                                            if (z10) {
                                                this.R1.m(0L, this.f41336p7);
                                                return false;
                                            }
                                        } else if (this.R3 == 5 && !"hello".equalsIgnoreCase(this.Q3) && !"away".equalsIgnoreCase(this.Q3) && (this.f41400u6.isEmpty() || this.f41188d4 == 0)) {
                                            if (z10) {
                                                Ub();
                                                return false;
                                            }
                                        } else if (this.R3 == 6 && this.Y.v()) {
                                            if (z10) {
                                                Ab(new mf(this, 18));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21493n0) {
                                                if (z10) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f41431wc.f17380f) {
                                                if (z10) {
                                                    xa();
                                                }
                                            } else {
                                                if (z10 && (r60Var = this.f41160b3) != null) {
                                                    r60Var.a(false);
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
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f41400u6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.e)))) {
                    org.telegram.ui.Components.y31.u(messageObject, false);
                }
            }
        }
        this.F3 = false;
        q9();
        ArrayList arrayList2 = org.telegram.ui.Components.y31.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        pf.c cVar = this.Ab;
        if (cVar != null) {
            cVar.a(false);
            this.Ab = null;
        }
        this.E3.detach();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.F3 = true;
        super.onBecomeFullyVisible();
        if (this.O) {
            showDialog(this.N);
        }
        if (this.f41206eb) {
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.G0();
                hk hkVar2 = this.Y;
                hkVar2.T0 = false;
                org.telegram.ui.Components.dg dgVar = hkVar2.U0;
                if (dgVar != null) {
                    dgVar.v(false);
                }
            }
            this.f41206eb = false;
        }
        if (this.f41407v1 != null) {
            AndroidUtilities.runOnUIThread(new me(this, 1), 600L);
        }
        if (this.f41358r4 && !this.f41372s4) {
            this.f41372s4 = true;
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f29639j = 5000;
            M.v = new me(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ah.f0 f0Var = this.Y9;
        if (f0Var != null && f0Var.d()) {
            this.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j10;
        long j11;
        jj jjVar = this.f41145a1;
        if (jjVar != null) {
            jjVar.getViewTreeObserver().addOnPreDrawListener(new xh(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        D7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.D1() || !PhotoViewer.t1().R1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f41205ea);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i10 = playingMessageObject.type;
                    long j12 = 0;
                    if (i10 != 0) {
                        j10 = this.T5;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = this.L6;
                    } else {
                        j11 = 0;
                    }
                    if (i10 != 0) {
                        j12 = d();
                    }
                    if (t12.f2(playingMessageObject, null, null, null, null, null, null, 0, this.Ga, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.t1().l4 = this;
                    }
                    m9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.D1() && PhotoViewer.t1().f33329l2) {
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
        pk pkVar = this.W9;
        float f7 = 0.0f;
        if (z10 && this.R9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var instanceof sn) {
                this.D4 = true;
                sn snVar = (sn) n2Var;
                snVar.T9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.X0.setSkipBackgroundDrawing(true);
                this.f41145a1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f41145a1.getAvatarImageView().setAlpha(0.0f);
                this.f41145a1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.S9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                hk hkVar = this.Y;
                if (hkVar != null) {
                    hkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                kk kkVar = this.R;
                if (kkVar != null) {
                    kkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                hk hkVar2 = this.Y;
                if (hkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = hkVar2.getMeasuredHeight();
                }
                kk kkVar2 = this.R;
                if (kkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = kkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                hk hkVar3 = snVar.Y;
                if (hkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = hkVar3.getMeasuredHeight();
                }
                kk kkVar3 = this.R;
                if (kkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = kkVar3.getMeasuredHeight();
                }
                this.O9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ah.l0(11, this, snVar));
                nc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.V9 = animatorSet;
                animatorSet.addListener(new ei.n5(this, snVar, runnable));
                this.V9.setDuration(300L);
                this.V9.setInterpolator(org.telegram.ui.Components.bs.f25030f);
                this.V9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(pkVar, 200L);
                return this.V9;
            }
        }
        if (this.f41266ja && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var2 instanceof te1) {
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
                this.f41290la = f7;
                ofFloat.addUpdateListener(new wi(0, this));
                this.f41279ka = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                lm lmVar = this.X0;
                if (lmVar != null) {
                    lmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V9 = animatorSet2;
                animatorSet2.addListener(new xi(this, z10, runnable));
                this.V9.setDuration(150L);
                this.V9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(pkVar, 200L);
                } else {
                    this.V9.start();
                }
                return this.V9;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.b2 b2Var = this.N;
        if (b2Var != null && dialog == b2Var) {
            getMessagesController().deleteDialog(this.T5, 0);
            org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
            if (d5Var != null && !d5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
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
        org.telegram.ui.Components.kv0 kv0Var;
        super.onFragmentDestroy();
        ih.e eVar = this.N3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f13121w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ih.d dVar = (ih.d) longSparseArray.valueAt(i10);
                if (dVar.f13109i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.z0();
        }
        jj jjVar = this.f41145a1;
        if (jjVar != null && (kv0Var = jjVar.f29017c0) != null) {
            kv0Var.b(jjVar.G);
        }
        zj zjVar = this.I1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            this.I1.getAdapter().P();
        }
        ci.b3 b3Var = this.J1;
        if (b3Var != null) {
            b3Var.dismissInternal();
        }
        gt q6 = gt.q();
        if (q6.f37322l == this.f41278k9) {
            q6.W = null;
            q6.f37310a0 = null;
            q6.Y = null;
            q6.f37322l = null;
            q6.f37314c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.F9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.G9);
        getNotificationCenter().onAnimationFinish(this.H9);
        getNotificationCenter().onAnimationFinish(this.I9);
        q9();
        me meVar = this.L5;
        if (meVar != null) {
            AndroidUtilities.cancelRunOnUIThread(meVar);
            this.L5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f41316na);
        MessagesController messagesController = getMessagesController();
        long j10 = this.T5;
        if (this.R3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j10, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.Sa;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Sa = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.R3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.T5), Long.valueOf(d()), Boolean.TRUE);
        }
        if (this.f41208f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.E3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f41208f != null) {
            getMessagesController().cancelLoadFullUser(this.f41208f.f20419id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        ci.b3 b3Var2 = this.J1;
        if (b3Var2 != null) {
            b3Var2.y1();
            this.J1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.e)) {
            getMessagesController().startShortPoll(this.e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.Z7.linked_chat_id)), this.classGuid, true);
            }
        }
        mm mmVar = this.f41180c9;
        if (mmVar != null) {
            mmVar.f(false);
        }
        rj rjVar = this.f41447y0;
        if (rjVar != null) {
            rjVar.N();
        }
        qk qkVar = this.f41429wa;
        if (qkVar != null) {
            qkVar.b();
        }
        this.f41167ba = null;
        org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Oc ? 1 : 0);
            org.telegram.ui.ActionBar.d5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.n9) parentLayout2.getPulledDialogs().get(i11)).f28681b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Oc = false;
        pf.c cVar = this.Ab;
        if (cVar != null) {
            cVar.a(false);
            this.Ab = null;
        }
        this.f41230ga.onFragmentDestroy();
        s01 s01Var = this.f41179c8;
        if (s01Var != null) {
            s01Var.b(true);
            this.f41179c8 = null;
        }
        ai.p7 p7Var = this.f41352qc;
        if (p7Var != null) {
            p7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f41352qc);
            this.f41352qc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f41280kb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f41428w8, null, null, false);
        }
        ai.p7 p7Var = this.f41352qc;
        if (p7Var != null) {
            p7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f41352qc);
            this.f41352qc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        ci.b3 b3Var;
        org.telegram.ui.Components.rl rlVar;
        ci.b3 b3Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ti tiVar;
        hk hkVar = this.Y;
        boolean z12 = false;
        if (hkVar != null && i10 == 2 && hkVar.f23965j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(hkVar.Q).sendCurrentLocation(hkVar.f23959i3, hkVar.f23965j3);
            }
            hkVar.f23965j3 = null;
            hkVar.f23959i3 = null;
        }
        zj zjVar = this.I1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            hg.j1 adapter = this.I1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f11947w0;
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
            ci.b3 b3Var3 = this.J1;
            if (b3Var3 != null) {
                b3Var3.f30586j0.Y();
            }
            org.telegram.ui.Components.wp wpVar = this.f41167ba;
            if (wpVar != null && (tiVar = wpVar.Y) != null) {
                tiVar.f30586j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (b3Var = this.J1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                b3Var.G1();
            } else if (i10 == 30 && (rlVar = b3Var.f30600o0) != null && b3Var.B0 == rlVar && b3Var.isShowing()) {
                b3Var.f30600o0.b0();
            }
        } else if ((i10 == 17 || i10 == 18) && (b3Var2 = this.J1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = b3Var2.f30586j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.J1.f30586j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41205ea);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new ph(this));
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(2);
        } else if (((i10 != 101 && i10 != 102) || this.f41208f == null) && (i10 != 103 || this.e == null)) {
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
                    org.telegram.ui.Components.voip.d2.l(this.e, null, this.Y7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f41208f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f41151a8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.d2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f41208f.f20419id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        hk hkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.w9[] w9VarArr;
        ah.x xVar;
        super.onResume();
        g7();
        this.E9 = System.currentTimeMillis();
        if (this.f41363r9 && getSendMessagesHelper().getImportingHistory(this.T5) != null) {
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(getParentActivity(), null, this, this.f41205ea);
            g50Var.setOnHideListener(new qe(this, 0));
            showDialog(g50Var);
            this.f41363r9 = false;
        }
        K6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        Z6();
        ci.b3 b3Var = this.J1;
        if (b3Var != null) {
            b3Var.B1();
        }
        lm lmVar = this.X0;
        boolean z12 = true;
        if (lmVar != null) {
            org.telegram.ui.Components.f91 f91Var = lmVar.v;
            if (f91Var != null) {
                f91Var.c(true);
            }
            lmVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new me(this, 23), 1000L);
        }
        b9 b9Var = new b9(this, 2);
        this.Zb = b9Var;
        setBulletinDelegate(b9Var);
        J6(false);
        TLRPC.PhotoSize photoSize = this.f41425w5;
        if (photoSize != null && (xVar = this.f41144a0) != null) {
            ((org.telegram.ui.Components.ap[]) xVar.f901b)[0].f24687f.k(ImageLocation.getForObject(photoSize, this.f41451y5), "50_50", ImageLocation.getForObject(this.f41438x5, this.f41451y5), "50_50_b", this.f41399u5, null, this.f41311n5, this.f41411v5);
        }
        if (this.C5 != null && (w9VarArr = this.B2) != null) {
            w9VarArr[0].k(ImageLocation.getForObject(this.C5, this.E5), "50_50", ImageLocation.getForObject(this.D5, this.E5), "50_50_b", this.f41463z5, null, (MessageObject) this.J4.get(Integer.valueOf(this.L4)), this.A5);
            w9VarArr[0].setHasBlur(this.B5);
        }
        if (this.R3 == 0) {
            getNotificationsController().setOpenedDialogId(this.T5, d());
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.T5;
        if (this.R3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j10, z10, true);
        if (this.Q5) {
            if (this.S5 && (messageObject = this.K7) != null) {
                if (this.f41433x0 != null) {
                    int i10 = this.T7;
                    if (i10 == -9000) {
                        i10 = P8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f41458z0.i1(this.f41400u6.indexOf(this.K7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f41458z0.i1(this.f41400u6.indexOf(this.K7) + this.A0.J, i10, z11);
                }
            } else {
                T9(false);
            }
            this.S5 = false;
            this.Q5 = false;
            this.K7 = null;
        }
        this.f41346q5 = false;
        this.f41359r5 = false;
        d7(false);
        if (this.f41373s5) {
            this.f41373s5 = false;
            fm fmVar = this.A0;
            if (fmVar != null) {
                fmVar.O(false);
            }
        }
        jj jjVar = this.f41145a1;
        if (jjVar != null) {
            jjVar.getViewTreeObserver().addOnPreDrawListener(new xh(this, 0));
        }
        D6(false, false);
        if (this.Y != null && this.R3 == 0 && this.ia != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.T5 && (arrayList2 = this.ia.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new a80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.ia.entities;
            }
            CharSequence p5 = ChatActivityEnterView.p(arrayList, this.ia.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (p5 != null && p5.length() > 0 && p5.charAt(0) == '@') {
                p5 = TextUtils.concat(" ", p5);
            }
            this.Y.c1(p5, true);
            this.ia = null;
        }
        lk lkVar = this.O0;
        if (lkVar != null && lkVar.getVisibility() != 0 && !this.actionBar.f21493n0 && this.R3 != 7 && !org.telegram.ui.ActionBar.n2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        hk hkVar2 = this.Y;
        if (hkVar2 != null) {
            hkVar2.C0();
        }
        if (this.f41208f != null) {
            this.f41337p8 = System.currentTimeMillis();
            this.f41348q8 = 0L;
        }
        if (this.f41376s8 != null) {
            AndroidUtilities.runOnUIThread(new me(this, 3));
        }
        if (this.f41433x0 != null && ((hkVar = this.Y) == null || !hkVar.p0())) {
            this.f41433x0.setOnItemLongClickListener(this.Ka);
            this.f41433x0.setOnItemClickListener(this.La);
            this.f41433x0.setLongClickable(true);
        }
        org.telegram.ui.Components.g61.h = false;
        TLRPC.User user = this.f41208f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.g61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.Z7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.Z7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.g61.h = true;
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
                org.telegram.ui.Components.g61.h = z12;
            }
        }
        Rc(false);
        Mb();
        if (this.N9 != 0.0f) {
            this.N9 = 0.0f;
            this.f41433x0.invalidate();
        }
        this.E3.attach();
        ai.p7 p7Var = this.f41352qc;
        if (p7Var != null) {
            p7Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.rd rdVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.O5) {
                this.O5 = true;
                yc();
            }
            iArr = this.F9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.N5 = false;
            if (!z11) {
                this.P5 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f41208f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            hk hkVar = this.Y;
            if (hkVar != null && (rdVar = hkVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                hkVar.S1 = null;
            }
        }
        g7();
        this.F9 = getNotificationCenter().setAnimationInProgress(this.F9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f41237h4) {
            if (this.f41208f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f41208f.f20419id));
                if (user != null) {
                    this.f41208f = user;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.e.f20272id));
                if (chat != null) {
                    this.e = chat;
                } else {
                    return;
                }
            }
            jj jjVar = this.f41145a1;
            if (jjVar != null) {
                jjVar.b();
            }
        }
    }

    public final void p7() {
        float f7;
        org.telegram.ui.Components.nf nfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + b9(org.telegram.ui.Components.l31.f28060c) + this.v.d();
        hk hkVar = this.Y;
        if (hkVar != null && (nfVar = hkVar.m0) != null) {
            nfVar.setTranslationY(-inputBubbleHeight);
        }
        zj zjVar = this.I1;
        if (zjVar != null) {
            if (zjVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            zjVar.setTranslationY(f7);
        }
    }

    public final void p8(boolean z10) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.Z7 != null && !ChatObject.isNotInChat(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.Z7;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f41353r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f41353r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.Z7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.Z7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f41353r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f41353r == 0) {
                getMessagesController().checkChatInviter(this.e.f20272id, false);
            }
        }
    }

    public final void p9() {
        xk xkVar = this.f41168bb;
        if (xkVar == null) {
            return;
        }
        this.f41168bb = null;
        xkVar.e();
        if (xkVar.getReactionsWindow() != null && xkVar.getReactionsWindow().f870a != null) {
            xkVar.getReactionsWindow().f870a.animate().alpha(0.0f).setDuration(180L).start();
        }
        xkVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new gh(6, this, xkVar)).setDuration(180L).start();
    }

    public final void pa(TLRPC.Chat chat) {
        boolean z10;
        ei.x3 x3Var = this.f41407v1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.f41421w1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new gh(0, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21493n0) {
            this.zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f41233h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41196e0;
            if (xVar != null) {
                xVar.f(8);
            }
            wr wrVar = this.f41184d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f41244i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f41256j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f41306n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f41269k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f41319o0 = true;
            Jc(0, 0, -1);
            lc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f41256j0;
        if (u0Var5 != null) {
            this.f41195dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f41195dc = false;
        }
        db(chat, null);
        Cc(0, true);
    }

    public final void pb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.pb(boolean, boolean, boolean):void");
    }

    public final void pc() {
        int i10;
        xj xjVar = this.Y2;
        if (xjVar == null) {
            return;
        }
        xjVar.setTranslationX(W8() / 2.0f);
        this.Y2.setTranslationY((((this.f41433x0.getTranslationY() + this.f41377s9) + this.f41467z9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f41467z9, -this.Y2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.Y2.setAlpha(this.f41247i3 * clamp);
        xj xjVar2 = this.Y2;
        if (this.f41247i3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        xjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.Y2.setScaleX(lerp);
        this.Y2.setScaleY(lerp);
    }

    public final void q7() {
        float d;
        if (this.f41433x0 != null) {
            if (this.Pa && this.f41194da == null) {
                d = AndroidUtilities.navigationBarHeight;
            } else {
                d = this.v.d() + b9(org.telegram.ui.Components.l31.f28060c) + AndroidUtilities.dp(16.0f) + this.Ba + this.f41380sc;
            }
            int i10 = (int) this.f41377s9;
            org.telegram.ui.Components.q31 q31Var = this.R1;
            if (q31Var != null) {
                q31Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            ih.g gVar = this.f41420w0;
            boolean z10 = this.f41433x0.V1;
            RecyclerView recyclerView = gVar.f13134a;
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
            ih.e eVar = this.N3;
            if (eVar != null) {
                RectF rectF = eVar.f13115b;
                rectF.set(b9(org.telegram.ui.Components.l31.f28059b), i10 - this.G, 0.0f, d - this.Ba);
                eVar.f13116c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void q8(org.telegram.messenger.MessageObject r60, java.util.ArrayList r61, java.util.ArrayList r62, java.util.ArrayList r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.q8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void q9() {
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.qc qcVar = this.A3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        dl dlVar = this.f41461z3;
        if (dlVar != null) {
            dlVar.e(0, true);
        }
    }

    public final void qa(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i11;
        ei.x3 x3Var = this.f41407v1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.f41421w1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new te(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21493n0) {
            this.zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f41233h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41196e0;
            if (xVar != null) {
                xVar.f(8);
            }
            wr wrVar = this.f41184d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f41244i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            if ((this.f41188d4 == 0 || (i11 = this.R3) == 3 || i11 == 8) && (u0Var = this.f41256j0) != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f41306n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f41269k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f41319o0 = true;
            Jc(0, 0, -1);
            lc(false);
        }
        if ((this.f41188d4 == 0 || this.f41237h4 || (i10 = this.R3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f41208f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.W4 = z11;
            org.telegram.ui.ActionBar.u0 u0Var5 = this.f41256j0;
            if (u0Var5 != null) {
                u0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f41256j0;
        if (u0Var6 != null) {
            u0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f41384t3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.T5, this.L6, this.classGuid, 0, this.f41188d4, false, this.f41322o3, this.f41333p3, !TextUtils.isEmpty(str), this.f41344q3);
        Cc(0, true);
    }

    public final void qb(int i10, int i11, String str) {
        this.L7 = i10;
        this.N7 = true;
        this.O7 = 0L;
        this.P7 = str;
        this.S7 = i11;
        this.M7 = true;
    }

    public final void qc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f41151a8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f41151a8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R0 != null) {
            if (z10 && this.T0 == null) {
                ni niVar = new ni(getParentActivity(), getResourceProvider(), this);
                this.T0 = niVar;
                w7.b6.b(niVar, 0.02f, 1.2f);
                this.T0.setOnClickListener(new xe(this, 12));
            }
            ni niVar2 = this.T0;
            if (niVar2 != null) {
                if (!z10) {
                    niVar2.setVisibility(8);
                    return;
                }
                niVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f41151a8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f41151a8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f41208f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        p01 p01Var = new p01(formatString.substring(indexOf, indexOf2));
                        if (p01Var.f39932c != -1) {
                            p01Var.f39932c = -1;
                            p01Var.invalidateSelf();
                        }
                        p01Var.a(503316480);
                        p01Var.setBounds(0, 0, p01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(p01Var), indexOf, indexOf2, 33);
                    }
                }
                this.T0.setCustomText(spannableStringBuilder);
                this.T0.setOverrideTextMaxWidth(ei.x3.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.T0.getParent() != null && (!z10 || this.T0.getParent() != this.R0)) {
                    ((ViewGroup) this.T0.getParent()).removeView(this.T0);
                }
                if (z10) {
                    ViewParent parent = this.T0.getParent();
                    LinearLayout linearLayout = this.R0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.T0, w7.z5.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.f41418vc.a(false, true);
        MessageObject messageObject = this.p5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.p5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f41225g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.p5.messageOwner.suggested_post);
            }
            if (!ai.fa.U(this.currentAccount, messageSuggestionParams.amount)) {
                Xb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            mf mfVar = new mf(this, 26);
            this.f41347q7 = mfVar;
            AndroidUtilities.runOnUIThread(mfVar, 3000L);
        }
        o8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.f5.a0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                sn snVar = sn.this;
                MessageObject messageObject2 = snVar.p5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = snVar.f41225g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(snVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(snVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, snVar.T5, snVar.p5, snVar.X3, null, snVar.f41285l5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, snVar.T5, snVar.p5, snVar.X3, null, snVar.f41285l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, snVar.T5, snVar.p5, snVar.X3, null, snVar.f41285l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(snVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, snVar.T5, snVar.f41311n5, snVar.X3, null, snVar.f41285l5, photoEntry2.entities, photoEntry2.ttl, snVar.p5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), snVar.f41225g5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, snVar.T5, snVar.f41311n5, snVar.X3, null, snVar.f41285l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, snVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), snVar.f41225g5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(snVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, snVar.T5, snVar.f41311n5, snVar.X3, null, snVar.f41285l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, snVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, snVar.H8(), photoEntry2.effectId, l4.longValue(), snVar.S8(), snVar.f41225g5);
                }
                snVar.B6();
            }
        }, j10);
    }

    public final void r7() {
        FrameLayout frameLayout = this.Q0;
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
        ArrayList arrayList4 = this.f41400u6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.J7);
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
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.J7) {
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
                        if (Math.abs(i19 - indexOf) > this.Jb + 1 && Math.abs(i20 - i11) > this.Jb + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i18 == i25 || (Math.abs(i18 - indexOf) > this.Jb + 1 && Math.abs(i23 - i11) > this.Jb + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
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
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.J7) {
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
                    if (Math.abs(i33 - i26) >= this.Jb + 1 && Math.abs(i34 - i27) >= this.Jb + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.Jb + 1 && Math.abs(i32 - i27) >= this.Jb + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
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
        Jc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f41384t3, this.T5, this.L6, this.classGuid, 0, this.f41188d4, this.f41322o3, this.f41333p3, this.f41344q3);
        if (TextUtils.isEmpty(this.f41384t3) && this.f41344q3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f41371s3 = z10;
        this.f41319o0 = z10;
        lc(false);
        Mc();
    }

    public final void ra(TLRPC.User user) {
        boolean z10;
        ei.x3 x3Var = this.f41407v1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.f41421w1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new kg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21493n0) {
            this.zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f41233h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41196e0;
            if (xVar != null) {
                xVar.f(8);
            }
            wr wrVar = this.f41184d0;
            if (wrVar != null) {
                wrVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f41244i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f41256j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f41306n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f41269k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f41319o0 = true;
            Jc(0, 0, -1);
            lc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f41256j0;
        if (u0Var5 != null) {
            this.f41195dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f41195dc = false;
        }
        db(null, user);
        Cc(0, true);
    }

    public final void rb(long j10) {
        this.f41188d4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20293id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void rc() {
        final long j10;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.S0 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.e.f20272id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f20272id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f20272id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(ai.ld.S0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.S0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final sn f35427b;

                    {
                        this.f35427b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                sn.c0(j11, this.f35427b);
                                return;
                            default:
                                sn.o1(j11, this.f35427b);
                                return;
                        }
                    }
                });
                return;
            }
            this.S0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f41151a8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.to toVar = this.S0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                toVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.T5))), LocaleController.getString(R.string.MessagePremiumUnlock), new ah.f(9));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.to toVar2 = this.S0;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                toVar2.c(z10, false, AndroidUtilities.replaceTags(ai.ld.S0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.T5), LocaleController.formatNumber(this.f41151a8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final sn f35427b;

                    {
                        this.f35427b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                sn.c0(j10, this.f35427b);
                                return;
                            default:
                                sn.o1(j10, this.f35427b);
                                return;
                        }
                    }
                });
            } else {
                this.S0.c(false, false, null, null, null);
            }
        } else {
            this.S0.c(false, false, null, null, null);
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.V7 = bundle.getString("path");
    }

    public final void s7() {
        int i10;
        float f7 = this.Ac.e;
        org.telegram.ui.Components.m40 m40Var = this.f41382t1;
        int i11 = 8;
        if (m40Var != null) {
            m40Var.setAlpha(f7);
            org.telegram.ui.Components.m40 m40Var2 = this.f41382t1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            m40Var2.setVisibility(i10);
        }
        ai.u1 u1Var = this.L3;
        if (u1Var != null) {
            float f10 = 1.0f - f7;
            u1Var.setAlpha(f10);
            ai.u1 u1Var2 = this.L3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            u1Var2.setVisibility(i11);
        }
    }

    public final void s9() {
        this.X0.invalidate();
        Iterator it = this.f41446y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void sa(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.f41145a1.e(true, false);
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
                this.f41145a1.e(true, false);
                return;
            }
            Bundle a2 = z7.g5.a(j10, "user_id");
            if (this.h != null && j10 == this.f41208f.f20419id) {
                a2.putLong("dialog_id", this.T5);
            }
            ProfileActivity profileActivity = new ProfileActivity(a2, null);
            TLRPC.User user = this.f41208f;
            if (user != null && user.f20419id == j10) {
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

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        mf mfVar = this.f41350qa;
        if (mfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mfVar);
        }
        hk hkVar = this.Y;
        if (hkVar != null && this.X0 != null && hkVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f21632f) {
            this.f41338pa = this.X0.getKeyboardHeight();
        } else {
            this.f41338pa = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.V7;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(View view) {
        View view2 = this.J8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.x0)) {
                ((org.telegram.ui.Cells.x0) view2).setInvalidateWithParent(null);
            }
            this.J8 = view;
            if (view instanceof org.telegram.ui.Cells.x0) {
                ((org.telegram.ui.Cells.x0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void sc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.sc(boolean):void");
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.y n10 = kVar.n();
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
        org.telegram.ui.ActionBar.g2 g2Var;
        float f7;
        float f10;
        hk hkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f41208f != null && this.f41306n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f41208f.f20419id);
            if (userFull != null && userFull.phone_calls_available) {
                this.L9 = !this.inPreviewMode;
                this.f41306n0.f(0);
            } else {
                this.L9 = false;
                this.f41306n0.f(8);
            }
        }
        jj jjVar = this.f41145a1;
        float f12 = 0.0f;
        if (jjVar != null) {
            jjVar.setOccupyStatusBar(!z10);
            jj jjVar2 = this.f41145a1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            jjVar2.setLayoutParams(w7.z5.a(-1.0f, f11, 0.0f, 52.0f, 0.0f, -2, 51));
        }
        hk hkVar2 = this.Y;
        if (hkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            hkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.gz0 gz0Var = this.f41185d1;
        if (gz0Var != null) {
            if (this.Z4 && !z10 && ((hkVar = this.Y) == null || !hkVar.f24051z3)) {
                i11 = 0;
            }
            gz0Var.setVisibility(i11);
        }
        zj zjVar = this.I1;
        if (zjVar != null) {
            ViewPropertyAnimator animate = zjVar.animate();
            if (!this.Y.f24051z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.bs.f25030f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                g2Var = new org.telegram.ui.ActionBar.g2(false);
            } else {
                g2Var = null;
            }
            kVar.setBackButtonDrawable(g2Var);
            org.telegram.ui.ActionBar.u0 u0Var = this.f41233h0;
            if (u0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.x xVar = this.f41196e0;
            if (xVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                xVar.f21857i = f12;
                org.telegram.ui.ActionBar.u0 u0Var2 = xVar.f21861m;
                if (u0Var2 != null) {
                    u0Var2.setAlpha(f12);
                }
            }
        }
        pj pjVar = this.f41433x0;
        if (pjVar != null) {
            int childCount = pjVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f41433x0.getChildAt(i12);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.u1;
                if (z14) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                    messageObject = ((org.telegram.ui.Cells.x0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i13 = this.f41286l6 - 1;
                        this.f41286l6 = i13;
                        if (i13 <= 0) {
                            this.f41286l6 = 0;
                            this.f41298m6 = true;
                            Ob(false);
                        } else {
                            this.f41257j1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.e)) {
                            j10 = this.e.f20272id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j10, this.T5);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        u1Var.setHighlighted(false);
                        u1Var.O3();
                    }
                }
            }
            this.f41433x0.setItemAnimator(null);
        }
        lc(false);
        Oc();
        bk bkVar = this.X1;
        if (bkVar != null) {
            if (!z10 && !this.Pa) {
                z12 = true;
            } else {
                z12 = false;
            }
            bkVar.setEnabled(z12);
        }
        bk bkVar2 = this.Z1;
        if (bkVar2 != null) {
            if (!z10 && !this.Pa) {
                z11 = true;
            } else {
                z11 = false;
            }
            bkVar2.setEnabled(z11);
        }
        el elVar = this.f41435x2;
        if (elVar != null) {
            elVar.setEnabled(!isInPreviewMode());
        }
        lm lmVar = this.X0;
        if (lmVar != null) {
            lmVar.setOccupyStatusBar((this.inBubbleMode || this.Pa || this.inPreviewMode) ? false : false);
        }
    }

    public final void t7() {
        if (this.X0 == null) {
            return;
        }
        this.f41380sc = F6(false);
        this.f41393tc = F6(true);
        this.S.setInputBubbleHeight(this.f41380sc);
        Ac();
        kc();
        p7();
        m7();
        r7();
        q7();
    }

    public final org.telegram.ui.Cells.a0 t8(int i10, boolean z10) {
        MessageObject messageObject;
        pj pjVar = this.f41433x0;
        if (pjVar != null) {
            int childCount = pjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f41433x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.x0) {
                    messageObject = ((org.telegram.ui.Cells.x0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f41377s9 - this.f41403u9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f41433x0.getMeasuredHeight() - this.Ba) {
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

    public final void t9() {
        if (!this.D9) {
            this.D9 = true;
            lm lmVar = this.X0;
            if (lmVar != null) {
                lmVar.invalidate();
            }
            pj pjVar = this.f41433x0;
            if (pjVar != null) {
                pjVar.invalidate();
            }
        }
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(b9(org.telegram.ui.Components.l31.f28060c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(16.0f));
        }
        y7();
    }

    public final void ta(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f41205ea);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().R1()) {
                PhotoViewer.t1().G0(false, false);
            }
            PhotoViewer.t1().g2(arrayList, 0, 0, false, new nl(this, createVideoThumbnail, arrayList), this);
            return;
        }
        o8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.T5, this.f41311n5, this.X3, null, this.f41285l5, null, 0, this.p5, true, 0, 0, false, false, null, H8(), 0L, 0L, S8(), this.f41225g5);
        B6();
    }

    public final void tb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f41175c4 = tL_forumTopic;
        this.f41147a4 = arrayList;
        MessageObject messageObject = (MessageObject) i0.a.h(1, arrayList);
        this.X3 = messageObject;
        this.f41311n5 = messageObject;
        this.f41273k4 = i11;
        this.l4 = i12;
        this.f41296m4 = Math.max(1, i11);
        this.f41188d4 = this.X3.getId();
        this.f41200e4 = i10;
        this.f41213f4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f41237h4 = z10;
        MessageObject messageObject2 = this.f41311n5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f41224g4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        Dc();
        Uc(false);
        lc(false);
    }

    public final void tc() {
        MessageObject messageObject;
        if (this.f41208f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                pj pjVar = this.f41433x0;
                if (pjVar != null) {
                    int childCount = pjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f41433x0.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.u1) {
                            messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f41337p8, this.f41348q8, this.f41208f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f33787h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f41208f, null, null, messageObject2.getId());
            }
        }
    }

    @Override
    public final void u(int i10, float f7, float f10, ne.e eVar) {
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
            rh.c cVar = this.Cc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.f41431wc.e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                ne.b bVar = this.f41445xc;
                float f11 = 1.0f - bVar.e;
                this.M0.setAlpha(f11);
                org.telegram.ui.Components.ch chVar = this.M0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                chVar.setVisibility(i12);
                float f12 = 1.0f - bVar.e;
                org.telegram.ui.Components.q31 q31Var = this.R1;
                if (q31Var != null) {
                    q31Var.setAlpha(f12);
                    org.telegram.ui.Components.q31 q31Var2 = this.R1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    q31Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                ah.x xVar = this.K3;
                ne.b bVar2 = this.yc;
                if (xVar != null) {
                    float f13 = bVar2.e;
                    xVar.setAlpha(f13);
                    ah.x xVar2 = this.K3;
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
                pj pjVar = this.f41433x0;
                if (z11) {
                    i13 = 0;
                }
                pjVar.setVisibility(i13);
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

    public final void u7() {
        int i10;
        sn snVar = this.f41194da;
        if (snVar != null) {
            snVar.u7();
        }
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) a9(AndroidUtilities.dp(7.0f)));
        sk skVar = this.f41320o1;
        if (skVar != null) {
            i10 = AndroidUtilities.dp(skVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(E8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.d());
        ai.u1 u1Var = this.L3;
        if (u1Var != null) {
            u1Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.m40 m40Var = this.f41382t1;
        if (m40Var != null) {
            m40Var.e.setPadding(0, dp2, 0, dp3);
            m40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        ah.x xVar = this.K3;
        if (xVar != null) {
            kh.f fVar = (kh.f) xVar.f901b;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.b10 b10Var = this.f41173c2;
        if (b10Var != null) {
            b10Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.rx0 rx0Var = this.f41186d2;
        if (rx0Var != null) {
            rx0Var.f30070a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final org.telegram.ui.Cells.x0 u8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f41433x0 != null && this.A0 != null) {
            for (int i10 = 0; i10 < this.f41433x0.getChildCount(); i10++) {
                View childAt = this.f41433x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.x0) {
                    org.telegram.ui.Cells.x0 x0Var = (org.telegram.ui.Cells.x0) childAt;
                    if (org.telegram.ui.Wallet.m0.G(x0Var.getMessageObject(), wallettransaction)) {
                        return x0Var;
                    }
                }
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f41400u6;
                if (i11 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.m0.G((MessageObject) arrayList.get(i11), wallettransaction)) {
                    this.f41433x0.B0();
                    this.f41458z0.h1(this.A0.J + i11, 0);
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
        if (this.X0 != null) {
            if (this.Ua <= 0 && this.Va <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            kj kjVar = this.v;
            float c10 = kjVar.c();
            ne.m mVar = kjVar.f44754b;
            int max = (int) Math.max(0.0f, (c10 * mVar.f17403a) - AndroidUtilities.dp(29.0f));
            lm lmVar = this.X0;
            ai.hc hcVar = lmVar.L;
            Rect rect2 = this.Gc;
            if (hcVar != null) {
                rect2.set(0, 0, lmVar.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                this.X0.L.setClipBounds(rect2);
            }
            if (this.f41433x0 != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f41433x0.getTop());
                pj pjVar = this.f41433x0;
                if (pjVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                pjVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(kjVar.v, kjVar.c() * mVar.f17403a) - AndroidUtilities.dp(29.0f))));
                kh.f fVar = this.X;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void ua() {
        this.O5 = true;
        this.fragmentBeginToShow = true;
        this.V9 = null;
        this.X0.invalidate();
        this.X0.setSkipBackgroundDrawing(false);
        this.S9 = false;
        this.fragmentView.setAlpha(1.0f);
        this.f41145a1.setTranslationY(0.0f);
        this.f41145a1.getAvatarImageView().setScaleX(1.0f);
        this.f41145a1.getAvatarImageView().setScaleY(1.0f);
        this.f41145a1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void ub() {
        AndroidUtilities.shakeViewSpring(this.f41433x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        hk hkVar = this.Y;
        for (int i10 = 0; i10 < hkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(hkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void uc(MessageObject messageObject, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new ai.x7(this, messageObject, z10, 14));
    }

    public final void v6(MessageObject messageObject, Integer num) {
        MessageObject messageObject2 = messageObject.replyMessageObject;
        if (messageObject2 != null) {
            int id2 = messageObject2.getId();
            SparseArray sparseArray = this.q6;
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
        float f7 = (1.0f - this.yc.e) * (1.0f - this.f41431wc.e);
        this.f41257j1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f41257j1.setAlpha(f7);
        kh.h hVar = this.f41257j1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final void v8() {
        if (this.f41276k7) {
            return;
        }
        this.f41276k7 = true;
        getMessagesController().checkSensitive(this, this.T5, new me(this, 24), new mf(this, 18));
    }

    public final void v9(int i10) {
        sn snVar = this.f41194da;
        if (snVar != null) {
            snVar.v9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.F != null) {
            zf.b0 b0Var = this.Dc;
            if (b0Var.f51543c == 0) {
                b0Var.invalidate();
            }
            b0Var.f51543c = i10 | b0Var.f51543c;
        }
    }

    public final void va(long j10, boolean z10) {
        if (this.R1 != null && UserObject.isBotForum(this.f41208f)) {
            this.R1.setAllTopicsHidden(true);
        }
        this.M5.put(j10, 1);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 0, new ai.sd(this, j10, z10, 6), new le(this, j10, 2));
        this.A0.O(false);
    }

    public final void vb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f41205ea);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.R = string;
        TLRPC.User user = this.f41208f;
        if (user != null) {
            if (user.bot) {
                b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String g10 = org.telegram.messenger.wh.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, jf.b.c());
                TLRPC.User user2 = this.f41208f;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, g10, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new hg.b2(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
    }

    public final void vc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f41439x6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                rj rjVar = this.f41447y0;
                if (rjVar != null) {
                    rjVar.V(groupedMessages);
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
            MessageObject messageObject3 = (MessageObject) this.f41325o6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.A0.N) {
                a0.h hVar = this.Za;
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
                    fm fmVar = this.A0;
                    fmVar.m(fmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f41400u6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                fm fmVar2 = this.A0;
                fmVar2.m(fmVar2.J + indexOf2);
            }
        }
    }

    @Override
    public final boolean w(final org.telegram.ui.ey r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.te1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.w(org.telegram.ui.ey, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.te1):boolean");
    }

    public final void w6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.w6():void");
    }

    public final void w7() {
        sn snVar = this.f41194da;
        if (snVar != null) {
            snVar.w7();
        }
        float a92 = a9(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.R1 != null) {
            a92 += b9(org.telegram.ui.Components.l31.f28058a);
        }
        if (this.f41320o1 != null) {
            a92 += AndroidUtilities.dp(35.0f) * this.f41320o1.E;
        }
        this.X.setFadeZoneTop((int) ((E8() * AndroidUtilities.dp(43.0f)) + a92));
    }

    public final boolean w8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f41433x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f41433x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (currentMessagesGroup = ((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f41400u6.indexOf((MessageObject) i0.a.h(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        fm fmVar = this.A0;
                        fmVar.q(indexOf + fmVar.J, currentMessagesGroup.messages.size());
                        this.f41433x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            i0.a.x(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.d5 d5Var = this.parentLayout;
        if (d5Var != null && !d5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.g2(z10));
        return false;
    }

    public final void w9() {
        this.f41364ra = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean wa() {
        if (this.H4.size() != 1 || this.Y3 == null || ((Integer) this.H4.get(0)).intValue() != this.Y3.getId()) {
            return false;
        }
        return true;
    }

    public final boolean wb() {
        if (A9() && this.f41311n5 == null && this.p5 == null) {
            if (this.R3 != 8 && A9() && this.e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20272id, 1L);
                if (this.R3 != 8) {
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

    public final void wc() {
        org.telegram.ui.ActionBar.m1 m1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        pj pjVar = this.f41433x0;
        zj zjVar = this.I1;
        if ((zjVar != null && zjVar.I) || ((m1Var = this.Q8) != null && m1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        pjVar.setImportantForAccessibility(i10);
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
            a0.h hVar = this.f41426w6;
            ArrayList arrayList = (ArrayList) hVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.q.j(pollId, hVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void x7() {
        if (this.M0 != null) {
            this.M0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - E8()) * (1.0f - this.yc.e) * W8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
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
            if (this.R3 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.f41328o9 = true;
                fm fmVar = this.A0;
                if (fmVar != null) {
                    fmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.T5, z10, z11, z12, i10, 0, this.X3, -1, j10, S8(), this.f41225g5);
            org.telegram.ui.Components.f5.s0(sendMessage, this, this.f41205ea);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new mf(this, 25));
            }
        }
    }

    public final void x9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f41208f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f41400u6.isEmpty();
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
        org.telegram.ui.Cells.u1 u1Var;
        this.f41431wc.a(false, true);
        rh.c cVar = this.Cc;
        if (cVar != null && (u1Var = cVar.f45764n) != null && u1Var.getDelegate() != null) {
            cVar.f45764n.getDelegate().x1(cVar.f45764n, false);
        }
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.S0(true, true, false);
            this.Y.U4 = null;
        }
    }

    public final void xb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.xc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f41205ea).j();
    }

    public final void xc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
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
        org.telegram.ui.Components.o9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f41208f, null, this.T5, this.f41416va, this.ua);
    }

    public final void y7() {
        float f7 = this.w9;
        sk skVar = this.f41320o1;
        if (skVar != null) {
            skVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.f41320o1.E;
        }
        ek ekVar = this.f41331p1;
        if (ekVar != null) {
            ekVar.setTranslationY(f7);
        }
        float E8 = (E8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.q31 q31Var = this.R1;
        org.telegram.ui.Components.l31 l31Var = org.telegram.ui.Components.l31.f28058a;
        if (q31Var != null) {
            q31Var.setSideMenuBackgroundMarginTop((E8() * a9(AndroidUtilities.dp(7.0f))) + E8);
            float b92 = b9(l31Var);
            float b10 = zf.e0.b(this.yc.e);
            float E82 = E8();
            E8 += zf.e0.b(Math.min(w7.r.a(zf.e0.b(b10), 0.0f, 1.0f), w7.r.a(zf.e0.b(E82), 0.0f, 1.0f))) * b92;
        }
        org.telegram.ui.Components.ch chVar = this.M0;
        if (chVar != null) {
            chVar.setTranslationY((E8 - AndroidUtilities.dp(5.0f)) - (E8() * b9(l31Var)));
        }
    }

    public final int y8() {
        return this.R3;
    }

    public final boolean y9() {
        if (this.R1 != null && this.f41188d4 == 0) {
            return true;
        }
        return false;
    }

    public final void ya(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar;
        if (this.f41431wc.f17380f && (cVar = this.Cc) != null && cVar.f45764n == u1Var) {
            Editable text = cVar.f45760a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(u1Var.getMessageObject(), text, this.Cc.getAttachedMedia());
                xa();
                return;
            }
            AndroidUtilities.shakeView(this.Cc.f45760a);
        }
    }

    public final void yb(org.telegram.ui.Cells.u1 u1Var) {
        if (getParentActivity() != null && u1Var != null && u1Var.ob != null && u1Var.getPrimaryMessageObject() != null && u1Var.getPrimaryMessageObject().messageOwner != null && u1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Xa) {
                this.Xa = true;
                if (this.f41459z1 != null) {
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
                this.f41459z1 = x3Var;
                x3Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                ei.x3 x3Var2 = this.f41459z1;
                x3Var2.h = ei.x3.a(x3Var2.getText(), this.f41459z1.getTextPaint());
                this.X0.addView(this.f41459z1, w7.z5.a(120.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
                this.X0.post(new i0(23, this, u1Var));
            }
        }
    }

    public final void yc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.sn.yc():void");
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
        SparseArray sparseArray = this.f41412v6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f41400u6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.T5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f41325o6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j10 = this.e.f20272id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j10, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f41439x6.f(messageObject.getGroupId());
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
                        int indexOf2 = arrayList.indexOf((MessageObject) i0.a.h(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            fm fmVar = this.A0;
                            if (!fmVar.N) {
                                fmVar.q(indexOf2 + fmVar.J, groupedMessages2.messages.size());
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
        ci.b3 b3Var;
        r0.a1 w0Var;
        if (k1Var != null && (b3Var = this.J1) != null) {
            if (b3Var.isShowing() || this.J1.f30631x0) {
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
                w0Var.c(8, i0.c.e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return k1Var;
        }
        return k1Var;
    }

    public final void za(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        ah.i1 d = ah.i1.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            messageObject = ((org.telegram.ui.Cells.u1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.x0) {
            messageObject = ((org.telegram.ui.Cells.x0) a0Var).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        eb(a0Var, messageObject2, null, null, f7, f10, d, false, false, false, false);
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
                MessageObject messageObject3 = (MessageObject) this.f41325o6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f41344q3 != null) {
                oc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.f41344q3)) {
            MessageObject.GroupedMessages c92 = c9(messageObject2);
            if (c92 != null) {
                for (int i10 = 0; i10 < c92.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(c92.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            hg.n1 n1Var = this.M3;
            if (n1Var != null) {
                n1Var.l();
            }
            oc(true);
        }
    }

    public final void zb(boolean z10, boolean z11) {
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
            AnimatorSet animatorSet = this.H0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.H0 = null;
            }
            RadialProgressView radialProgressView = this.G0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f16 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.H0 = animatorSet2;
                if (z10) {
                    this.G0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.H0;
                    nk nkVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nkVar, property, 0.1f);
                    nk nkVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(nkVar2, property2, 0.1f);
                    nk nkVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(nkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
                    this.H0.setStartDelay(200L);
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
                this.H0.addListener(new ah.p0(29, this, z10));
                this.H0.setDuration(150L);
                this.H0.start();
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
            nk nkVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            nkVar4.setVisibility(i11);
            org.telegram.ui.Components.x90 x90Var = this.D0;
            if (!z10 && this.C0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            x90Var.setVisibility(i12);
            nk nkVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            nkVar5.setScaleX(f11);
            org.telegram.ui.Components.x90 x90Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            x90Var2.setScaleX(f12);
            nk nkVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            nkVar6.setScaleY(f13);
            org.telegram.ui.Components.x90 x90Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            x90Var3.setScaleY(f16);
            nk nkVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            nkVar7.setAlpha(f14);
            org.telegram.ui.Components.x90 x90Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            x90Var4.setAlpha(f15);
        }
    }

    public final void zc() {
        boolean z10;
        boolean z11;
        if (this.f41257j1 == null) {
            return;
        }
        if (this.f41229g9 && !g9() && !this.Y.u0() && !this.Pa && (!this.f41371s3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.P5 != 0 && SystemClock.elapsedRealtime() >= this.P5 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f41270k1 = false;
        } else {
            this.B7 = 0;
            this.f41262j6 = 0;
            z11 = true;
        }
        this.f41257j1.e(1, z10, z11);
    }

    @Override
    public final void O() {
    }

    public void aa(boolean z10) {
    }
}
