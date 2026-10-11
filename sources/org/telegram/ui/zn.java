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
public class zn extends org.telegram.ui.ActionBar.m2 implements NotificationCenter.NotificationCenterDelegate, my, bd0, org.telegram.ui.Components.jk, org.telegram.ui.Components.eh, mg.b, org.telegram.ui.Components.g60, me.d {
    public static int Hc = 22;
    public static float Ic = 1.4f;
    public static int Jc = 10;
    public static Pattern Kc;
    public static Pattern Lc;
    public static Pattern Mc;
    public static final int[] Nc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Oc = false;
    public static final Rect Pc = new Rect();
    public mm A0;
    public ci.d4 A1;
    public boolean A2;
    public org.telegram.ui.Components.sc A3;
    public int A4;
    public int A5;
    public final int[] A6;
    public boolean A7;
    public final ah.c A8;
    public float A9;
    public int Aa;
    public of.e Ab;
    public final me.b Ac;
    public uk B0;
    public yl B1;
    public final org.telegram.ui.Components.y9[] B2;
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
    public final yn[] C2;
    public int C3;
    public qf C4;
    public TLRPC.PhotoSize C5;
    public final boolean[] C6;
    public int C7;
    public BitmapShader C8;
    public boolean C9;
    public ChatMessageSharedResources Ca;
    public le Cb;
    public qh.c Cc;
    public org.telegram.ui.Components.fa0 D0;
    public TL_stories.TL_premium_boostsStatus D1;
    public final org.telegram.ui.ActionBar.h5[] D2;
    public boolean D3;
    public boolean D4;
    public TLRPC.PhotoSize D5;
    public final boolean[] D6;
    public int D7;
    public Paint D8;
    public boolean D9;
    public ValueAnimator Da;
    public boolean Db;
    public yf.b0 Dc;
    public final qe.b E;
    public TextView E0;
    public ChannelBoostsController.CanApplyBoost E1;
    public final ai.q4[] E2;
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
    public final ah.h F;
    public tk F0;
    public boolean F1;
    public NumberTextView F2;
    public boolean F3;
    public boolean F4;
    public int F5;
    public boolean F6;
    public boolean F7;
    public Paint F8;
    public int F9;
    public jl Fa;
    public final RectF Fb;
    public final ArrayList Fc;
    public final int G;
    public RadialProgressView G0;
    public le G1;
    public int G2;
    public MessageObject G3;
    public int G4;
    public TLRPC.WebPage G5;
    public boolean G6;
    public boolean G7;
    public final Paint G8;
    public int G9;
    public final tl Ga;
    public org.telegram.ui.ActionBar.a2 Gb;
    public final Rect Gc;
    public final fh.d H;
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
    public final am Ha;
    public long Hb;
    public final fh.d I;
    public boolean I0;
    public gk I1;
    public boolean I2;
    public MessageObject I3;
    public int I4;
    public String I5;
    public boolean I6;
    public boolean I7;
    public boolean I8;
    public int I9;
    public ArrayList Ia;
    public final sg Ib;
    public final ah.c J;
    public ci.d4 J0;
    public ai.h4 J1;
    public ImageView J2;
    public MessageObject J3;
    public HashMap J4;
    public i9.s J5;
    public int J6;
    public MessageObject J7;
    public View J8;
    public boolean J9;
    public final ki Ja;
    public int Jb;
    public final ah.c K;
    public ci.d4 K0;
    public org.telegram.ui.ActionBar.p0 K1;
    public RadialProgressView K2;
    public ai.f0 K3;
    public final SparseArray K4;
    public TLRPC.ChatInvite K5;
    public int K6;
    public MessageObject K7;
    public float K8;
    public boolean K9;
    public final pi Ka;
    public boolean Kb;
    public final fh.e L;
    public ci.d4 L0;
    public TextView L1;
    public ImageView L2;
    public ai.w0 L3;
    public int L4;
    public le L5;
    public long L6;
    public int L7;
    public float L8;
    public boolean L9;
    public final ij La;
    public Pattern Lb;
    public final ah.c M;
    public org.telegram.ui.Components.fh M0;
    public boolean M1;
    public AnimatorSet M2;
    public gg.n1 M3;
    public final int[] M4;
    public final LongSparseIntArray M5;
    public boolean M6;
    public boolean M7;
    public Integer M8;
    public org.telegram.ui.Components.xi M9;
    public final mn Ma;
    public MessageObject Mb;
    public org.telegram.ui.ActionBar.a2 N;
    public boolean N0;
    public TextView N1;
    public FrameLayout N2;
    public hh.e N3;
    public int N4;
    public boolean N5;
    public long N6;
    public boolean N7;
    public int N8;
    public float N9;
    public final qf Na;
    public kf Nb;
    public boolean O;
    public sk O0;
    public TextView O1;
    public wk O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final ArrayList O6;
    public long O7;
    public boolean O8;
    public float O9;
    public final qf Oa;
    public ArrayList Ob;
    public FrameLayout P;
    public jh.c P0;
    public al P1;
    public TextView P2;
    public TL_account.TL_businessChatLink P3;
    public int P4;
    public long P5;
    public final Paint P6;
    public String P7;
    public AnimatorSet P8;
    public xp P9;
    public boolean Pa;
    public final BotForumHelper.BotDraftAnimationsPool Pb;
    public ci.r6 Q;
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
    public final hh.a Qb;
    public rk R;
    public LinearLayout R0;
    public org.telegram.ui.Components.e41 R1;
    public rk R2;
    public int R3;
    public boolean R4;
    public boolean R5;
    public final ColorMatrix R6;
    public byte[] R7;
    public boolean R8;
    public boolean R9;
    public long Ra;
    public boolean Rb;
    public hh.f S;
    public org.telegram.ui.Components.zo S0;
    public hg.f S1;
    public ImageView S2;
    public int S3;
    public boolean S4;
    public boolean S5;
    public final m.c3 S6;
    public int S7;
    public org.telegram.ui.ActionBar.e1[] S8;
    public boolean S9;
    public NotificationCenter.ObserversGroup Sa;
    public boolean Sb;
    public View T;
    public ui T0;
    public org.telegram.ui.Components.fa0 T1;
    public ImageView T2;
    public boolean T3;
    public AnimatorSet T4;
    public long T5;
    public final org.telegram.ui.ActionBar.d5 T6;
    public int T7;
    public org.telegram.ui.ActionBar.e1 T8;
    public zn T9;
    public boolean Ta;
    public boolean Tb;
    public FrameLayout U;
    public hg.d2 U0;
    public ImageView U1;
    public org.telegram.ui.Components.r6 U2;
    public String U3;
    public final SparseIntArray U4;
    public Long U5;
    public long U6;
    public le U7;
    public final mk U8;
    public float U9;
    public int Ua;
    public long Ub;
    public FrameLayout V;
    public hg.a0 V0;
    public ei.n V1;
    public org.telegram.ui.Components.r6 V2;
    public byte[] V3;
    public final SparseIntArray V4;
    public int V5;
    public int V6;
    public String V7;
    public nm V8;
    public AnimatorSet V9;
    public int Va;
    public boolean Vb;
    public final hh.k W;
    public hh.j W0;
    public TextView W1;
    public org.telegram.ui.Components.r6 W2;
    public String W3;
    public boolean W4;
    public final SparseArray[] W5;
    public int W6;
    public ChatObject.Call W7;
    public vk W8;
    public final wk W9;
    public boolean Wa;
    public boolean Wb;
    public jh.f X;
    public sm X0;
    public ik X1;
    public fk X2;
    public MessageObject X3;
    public boolean X4;
    public final SparseArray[] X5;
    public final Matrix X6;
    public boolean X7;
    public int X8;
    public uh.i X9;
    public boolean Xa;
    public boolean Xb;
    public ok Y;
    public org.telegram.ui.Components.vo Y0;
    public FrameLayout Y1;
    public ek Y2;
    public MessageObject Y3;
    public boolean Y4;
    public final SparseArray[] Y5;
    public LinearGradient Y6;
    public boolean Y7;
    public int Y8;
    public zg.t Y9;
    public a0.i Ya;
    public boolean Yb;
    public pk Z;
    public final ArrayList Z0;
    public ik Z1;
    public org.telegram.ui.Cells.w0 Z2;
    public boolean Z3;
    public boolean Z4;
    public boolean Z5;
    public int Z6;
    public TLRPC.ChatFull Z7;
    public int Z8;
    public j51 Z9;
    public a0.i Za;
    public x8 Zb;
    public int f44699a;
    public ai.f0 f44700a0;
    public qj f44701a1;
    public FrameLayout a2;
    public int f44702a3;
    public ArrayList f44703a4;
    public boolean f44704a5;
    public int f44705a6;
    public int f44706a7;
    public TLRPC.UserFull f44707a8;
    public boolean f44708a9;
    public boolean f44709aa;
    public long f44710ab;
    public int f44711ac;
    public boolean f44712b;
    public int f44713b0;
    public org.telegram.ui.Components.r6 f44714b1;
    public TextView f44715b2;
    public org.telegram.ui.Components.z60 f44716b3;
    public MessageObject f44717b4;
    public boolean f44718b5;
    public int f44719b6;
    public final Paint f44720b7;
    public org.telegram.ui.Cells.g6 f44721b8;
    public boolean f44722b9;
    public org.telegram.ui.Components.cq f44723ba;
    public el f44724bb;
    public ValueAnimator f44725bc;
    public boolean f44726c;
    public org.telegram.ui.ActionBar.s0 f44727c0;
    public oh f44728c1;
    public org.telegram.ui.Components.k10 f44729c2;
    public View f44730c3;
    public TLRPC.TL_forumTopic f44731c4;
    public MessageObject f44732c5;
    public int f44733c6;
    public final Matrix f44734c7;
    public l11 f44735c8;
    public tm f44736c9;
    public xn f44737ca;
    public boolean cb;
    public wi f44738cc;
    public boolean d;
    public es f44739d0;
    public org.telegram.ui.Components.qz0 f44740d1;
    public org.telegram.ui.Components.cy0 f44741d2;
    public boolean f44742d3;
    public long f44743d4;
    public MessageObject f44744d5;
    public int f44745d6;
    public LinearGradient f44746d7;
    public final a0.i f44747d8;
    public View f44748d9;
    public zn f44749da;
    public boolean f44750db;
    public boolean f44751dc;
    public TLRPC.Chat f44752e;
    public org.telegram.ui.ActionBar.x f44753e0;
    public org.telegram.ui.ActionBar.s0 f44754e1;
    public org.telegram.ui.Components.a50 f44755e2;
    public boolean f44756e3;
    public int f44757e4;
    public MessageObject.GroupedMessages f44758e5;
    public int f44759e6;
    public boolean e7;
    public String f44760e8;
    public boolean f44761e9;
    public xn f44762ea;
    public boolean f44763eb;
    public int ec;
    public TLRPC.User f44764f;
    public org.telegram.ui.ActionBar.s0 f44765f0;
    public org.telegram.ui.ActionBar.s0 f44766f1;
    public org.telegram.ui.Components.a50 f44767f2;
    public boolean f44768f3;
    public TLRPC.Chat f44769f4;
    public MessagePreviewParams f44770f5;
    public int f44771f6;
    public boolean f7;
    public long f44772f8;
    public boolean f44773f9;
    public wh.d f44774fa;
    public ArrayList f44775fb;
    public int f44776fc;
    public org.telegram.ui.ActionBar.s0 f44777g0;
    public org.telegram.ui.ActionBar.s0 f44778g1;
    public jj f44779g2;
    public AnimatorSet f44780g3;
    public boolean f44781g4;
    public MessageSuggestionParams f44782g5;
    public int f44783g6;
    public int f44784g7;
    public String f44785g8;
    public boolean f44786g9;
    public final ChatMessagesMetadataController ga;
    public ValueAnimator f44787gb;
    public int gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.u0 f44788h0;
    public org.telegram.ui.ActionBar.s0 f44789h1;
    public boolean f44790h2;
    public ValueAnimator f44791h3;
    public boolean f44792h4;
    public MessageObject f44793h5;
    public final ArrayList f44794h6;
    public boolean f44795h7;
    public boolean f44796h8;
    public rl f44797h9;
    public TLRPC.TL_channels_sendAsPeers ha;
    public boolean f44798hb;
    public int f44799hc;
    public org.telegram.ui.ActionBar.x f44800i0;
    public org.telegram.ui.Components.fp f44801i1;
    public org.telegram.ui.Components.a50 f44802i2;
    public float f44803i3;
    public boolean f44804i4;
    public MessageObject.GroupedMessages f44805i5;
    public boolean f44806i6;
    public boolean f44807i7;
    public boolean f44808i8;
    public boolean f44809i9;
    public TL_account.resolvedBusinessChatLinks f44810ia;
    public Boolean f44811ib;
    public int f44812ic;
    public org.telegram.ui.ActionBar.u0 f44813j0;
    public jh.h f44814j1;
    public boolean f44815j2;
    public boolean j3;
    public boolean f44816j4;
    public MessageObject.GroupedMessages f44817j5;
    public int f44818j6;
    public int f44819j7;
    public String f44820j8;
    public float f44821j9;
    public boolean f44822ja;
    public boolean f44823jb;
    public boolean f44824jc;
    public org.telegram.ui.ActionBar.u0 f44825k0;
    public boolean f44826k1;
    public org.telegram.ui.Components.a50 f44827k2;
    public boolean f44828k3;
    public int f44829k4;
    public MessageObject f44830k5;
    public int f44831k6;
    public boolean f44832k7;
    public String f44833k8;
    public hk f44834k9;
    public boolean f44835ka;
    public boolean f44836kb;
    public long f44837kc;
    public org.telegram.ui.ActionBar.s0 f44838l0;
    public int l1;
    public org.telegram.ui.Components.a50 f44839l2;
    public boolean f44840l3;
    public int l4;
    public pn f44841l5;
    public int f44842l6;
    public boolean f44843l7;
    public MessageObject f44844l8;
    public org.telegram.ui.Cells.u1 f44845l9;
    public float f44846la;
    public int f44847lb;
    public TLRPC.TL_messages_discussionMessage f44848lc;
    public org.telegram.ui.ActionBar.u0 m0;
    public int f44849m1;
    public org.telegram.ui.Components.a50 f44850m2;
    public boolean f44851m3;
    public int f44852m4;
    public boolean f44853m5;
    public boolean f44854m6;
    public boolean f44855m7;
    public MessageObject f44856m8;
    public org.telegram.ui.Components.i10 f44857m9;
    public final pg f44858ma;
    public HashMap f44859mb;
    public TLRPC.messages_Messages f44860mc;
    public boolean f44861n;
    public org.telegram.ui.ActionBar.x f44862n0;
    public org.telegram.ui.Components.sc f44863n1;
    public org.telegram.ui.Components.a50 f44864n2;
    public boolean f44865n3;
    public zh f44866n4;
    public MessageObject f44867n5;
    public final ArrayList f44868n6;
    public int f44869n7;
    public int f44870n8;
    public boolean f44871n9;
    public final fl f44872na;
    public qf nb;
    public boolean nc;
    public boolean f44873o0;
    public zk f44874o1;
    public org.telegram.ui.Components.a50 f44875o2;
    public TLRPC.User f44876o3;
    public final SparseArray f44877o4;
    public int f44878o5;
    public final SparseArray[] f44879o6;
    public int f44880o7;
    public boolean f44881o8;
    public boolean o9;
    public int f44882oa;
    public int f44883ob;
    public rn f44884oc;
    public RadialProgressView f44885p0;
    public lk f44886p1;
    public org.telegram.ui.Cells.u1 f44887p2;
    public TLRPC.Chat f44888p3;
    public final ArrayList f44889p4;
    public MessageObject p5;
    public final SparseArray f44890p6;
    public boolean f44891p7;
    public long f44892p8;
    public ValueAnimator f44893p9;
    public int f44894pa;
    public org.telegram.ui.ActionBar.a2 f44895pb;
    public ln f44896pc;
    public org.telegram.ui.ActionBar.s0 f44897q0;
    public ci.h1 f44898q1;
    public int f44899q2;
    public zg.n0 f44900q3;
    public int f44901q4;
    public boolean f44902q5;
    public final SparseArray q6;
    public qf f44903q7;
    public long f44904q8;
    public ValueAnimator f44905q9;
    public qf f44906qa;
    public int f44907qb;
    public yh.w3 f44908qc;
    public long f44909r;
    public org.telegram.ui.ActionBar.s0 f44910r0;
    public int f44911r1;
    public int f44912r2;
    public boolean f44913r3;
    public boolean f44914r4;
    public boolean f44915r5;
    public final HashMap f44916r6;
    public String f44917r7;
    public boolean f44918r8;
    public boolean f44919r9;
    public boolean f44920ra;
    public int f44921rb;
    public boolean f44922rc;
    public final HashMap f44923s;
    public org.telegram.ui.ActionBar.s0 f44924s0;
    public boolean f44925s1;
    public org.telegram.ui.Components.a50 f44926s2;
    public boolean f44927s3;
    public boolean f44928s4;
    public boolean f44929s5;
    public final SparseArray f44930s6;
    public boolean f44931s7;
    public String f44932s8;
    public float f44933s9;
    public boolean f44934sa;
    public boolean f44935sb;
    public float f44936sc;
    public org.telegram.ui.ActionBar.s0 f44937t0;
    public org.telegram.ui.Components.v40 f44938t1;
    public org.telegram.ui.Components.a50 f44939t2;
    public String f44940t3;
    public int f44941t4;
    public boolean f44942t5;
    public final a0.i f44943t6;
    public boolean f44944t7;
    public rk f44945t8;
    public float f44946t9;
    public long ta;
    public int f44947tb;
    public float f44948tc;
    public ClippingImageView f44949u0;
    public org.telegram.ui.ActionBar.a2 f44950u1;
    public org.telegram.ui.Components.a50 f44951u2;
    public String f44952u3;
    public final ArrayList f44953u4;
    public int f44954u5;
    public final ArrayList f44955u6;
    public int f44956u7;
    public org.telegram.ui.Cells.u1 f44957u8;
    public int f44958u9;
    public int f44959ua;
    public boolean f44960ub;
    public final me.b f44961uc;
    public final rj v;
    public org.telegram.ui.Components.e21 f44962v0;
    public ci.d4 f44963v1;
    public org.telegram.ui.Components.gq f44964v2;
    public int f44965v3;
    public final HashMap f44966v4;
    public int f44967v5;
    public final SparseArray f44968v6;
    public int f44969v7;
    public k4 f44970v8;
    public int v9;
    public int f44971va;
    public int f44972vb;
    public final me.b f44973vc;
    public kj f44974w;
    public hh.g f44975w0;
    public ci.d4 f44976w1;
    public View f44977w2;
    public int f44978w3;
    public MessageObject f44979w4;
    public TLRPC.PhotoSize f44980w5;
    public final a0.i f44981w6;
    public int f44982w7;
    public TextureView f44983w8;
    public float f44984w9;
    public xk f44985wa;
    public int f44986wb;
    public final me.b f44987wc;
    public kj f44988x;
    public wj f44989x0;
    public ci.d4 f44990x1;
    public ll f44991x2;
    public int f44992x3;
    public int f44993x4;
    public TLRPC.PhotoSize f44994x5;
    public final a0.i f44995x6;
    public int f44996x7;
    public boolean f44997x8;
    public float f44998x9;
    public yk f44999xa;
    public int f45000xb;
    public final me.b xc;
    public final qe.b f45001y;
    public yj f45002y0;
    public ci.d4 f45003y1;
    public ci.r6 f45004y2;
    public UndoView y3;
    public int f45005y4;
    public TLObject f45006y5;
    public final int[] f45007y6;
    public int f45008y7;
    public final qf f45009y8;
    public float f45010y9;
    public boolean f45011ya;
    public CharacterStyle f45012yb;
    public final me.b yc;
    public zj f45013z0;
    public ci.d4 f45014z1;
    public org.telegram.ui.Components.zg0 f45015z2;
    public kl f45016z3;
    public final ArrayList f45017z4;
    public int f45018z5;
    public final int[] f45019z6;
    public int f45020z7;
    public final fh.b f45021z8;
    public float f45022z9;
    public float f45023za;
    public String f45024zb;
    public final me.b f45025zc;

    public zn(Bundle bundle) {
        super(bundle);
        this.f44699a = 0;
        this.f44726c = false;
        this.d = false;
        this.f44923s = new HashMap();
        this.v = new rj(this, new qf(this, 21));
        qe.b bVar = new qe.b();
        this.f45001y = bVar;
        qe.b bVar2 = new qe.b();
        this.E = bVar2;
        this.W = new hh.k();
        this.Z0 = new ArrayList();
        this.B2 = new org.telegram.ui.Components.y9[2];
        this.C2 = new yn[2];
        this.D2 = new org.telegram.ui.ActionBar.h5[2];
        this.E2 = new ai.q4[2];
        this.H2 = new AnimatorSet[2];
        this.I2 = false;
        this.f44702a3 = 500;
        this.P3 = null;
        this.S3 = -1;
        this.Z3 = true;
        this.f44877o4 = new SparseArray();
        this.f44889p4 = new ArrayList();
        this.f44953u4 = new ArrayList();
        this.f44966v4 = new HashMap();
        this.f44993x4 = -1;
        this.f45005y4 = 0;
        this.f45017z4 = new ArrayList(10);
        this.H4 = new ArrayList();
        this.J4 = new HashMap();
        this.K4 = new SparseArray();
        this.M4 = new int[1];
        this.U4 = new SparseIntArray();
        this.V4 = new SparseIntArray();
        this.Z4 = true;
        this.f44718b5 = true;
        this.f44902q5 = true;
        this.f44942t5 = true;
        this.M5 = new LongSparseIntArray();
        this.V5 = 1;
        this.W5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44794h6 = new ArrayList();
        this.f44806i6 = true;
        this.f44831k6 = Integer.MIN_VALUE;
        this.f44868n6 = new ArrayList();
        this.f44879o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44890p6 = new SparseArray();
        this.q6 = new SparseArray();
        this.f44916r6 = new HashMap();
        this.f44930s6 = new SparseArray();
        this.f44943t6 = new a0.i();
        this.f44955u6 = new ArrayList();
        this.f44968v6 = new SparseArray();
        this.f44981w6 = new a0.i();
        this.f44995x6 = new a0.i();
        this.f45007y6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f45019z6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
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
        this.S6 = new m.c3();
        this.T6 = new org.telegram.ui.ActionBar.d5(0, false, false, new sj(this));
        this.X6 = new Matrix();
        Paint paint = new Paint(1);
        this.f44720b7 = paint;
        this.f44734c7 = new Matrix();
        this.f44869n7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f44996x7 = Integer.MAX_VALUE;
        this.f45008y7 = -1;
        this.G7 = true;
        this.L7 = Integer.MAX_VALUE;
        this.S7 = -1;
        this.T7 = -10000;
        this.f44747d8 = new a0.i();
        this.f45009y8 = new qf(this, 24);
        fh.b bVar3 = new fh.b();
        this.f45021z8 = bVar3;
        ah.c cVar = new ah.c(bVar3);
        this.A8 = cVar;
        this.G8 = new Paint(1);
        this.H8 = 0.0f;
        this.K8 = 1.0f;
        this.L8 = 0.0f;
        this.R8 = true;
        this.U8 = new mk(this);
        this.f44871n9 = true;
        this.W9 = new wk(this, 0);
        this.ga = new ChatMessagesMetadataController(this);
        this.f44858ma = new pg(this, 0);
        this.f44872na = new fl(this);
        this.f44894pa = -1;
        this.Ga = new tl(this);
        this.Ha = new am(this);
        this.Ja = new ki(this);
        this.Ka = new pi(this);
        this.La = new ij(this);
        this.Ma = new mn(this);
        this.Na = new qf(this, 27);
        this.Oa = new qf(this, 29);
        this.f44750db = false;
        this.Fb = new RectF();
        this.Ib = new sg(this, 1);
        this.Pb = new BotForumHelper.BotDraftAnimationsPool();
        this.Qb = new Object();
        this.f44751dc = false;
        org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
        this.f44961uc = new me.b(0, this, isVar, 320L, false);
        this.f44973vc = new me.b(1, this, isVar, 520L, false);
        this.f44987wc = new me.b(2, this, isVar, 520L, false);
        this.xc = new me.b(3, this, isVar, 320L, false);
        this.yc = new me.b(4, this, isVar, 320L, false);
        this.f45025zc = new me.b(5, this, isVar, 320L, false);
        this.Ac = new me.b(6, this, isVar, 320L, false);
        sg sgVar = new sg(this, 6);
        ?? obj = new Object();
        obj.f14061b = new float[32];
        obj.f14060a = 1;
        obj.d = new me.l(obj, le.a.f15504a, 240L);
        obj.f14062c = sgVar;
        this.Bc = obj;
        this.Ec = new ArrayList();
        this.Fc = new ArrayList();
        this.Gc = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ah.h hVar = new ah.h(false);
            this.F = hVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            fh.d dVar = new fh.d(obj2);
            this.I = dVar;
            dVar.v = new sg(this, 8);
            dVar.d = hVar;
            dVar.f9936e = -3;
            dVar.f9937f = obj2;
            ah.c cVar2 = new ah.c(dVar);
            this.K = cVar2;
            cVar2.f547i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                fh.d dVar2 = new fh.d(obj2);
                this.H = dVar2;
                dVar2.v = new sg(this, 8);
                dVar2.d = hVar;
                dVar2.f9936e = -2;
                dVar2.f9937f = obj2;
                ah.c cVar3 = new ah.c(dVar2);
                this.J = cVar3;
                cVar3.f547i = LiteMode.isEnabled(262144);
            } else {
                this.H = null;
                this.J = cVar2;
            }
        } else {
            this.F = null;
            this.G = 0;
            this.H = null;
            this.I = null;
            this.J = new ah.c(obj2);
            this.K = new ah.c(obj2);
        }
        ah.c cVar4 = new ah.c(obj2);
        this.M = cVar4;
        cVar4.f544e = bVar;
        this.J.f544e = bVar;
        this.K.f544e = bVar;
        cVar.f544e = new qe.b();
        cVar4.d = bVar2;
        this.J.d = bVar2;
        this.K.d = bVar2;
        cVar.d = bVar2;
    }

    public static void A0(zn znVar, MessageObject messageObject, Long l4, Runnable runnable) {
        yh.n5.y(znVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void A1(zn znVar, zf.a aVar, Runnable runnable) {
        if (!znVar.isFinished) {
            if (zf.a.m(yh.n5.x(znVar.currentAccount, aVar.f54528a).p()).f54529b < aVar.f54529b) {
                zf.b bVar = aVar.f54528a;
                if (bVar == zf.b.f54530a) {
                    new yh.e7(znVar.getParentActivity(), znVar.getResourceProvider(), aVar.a(), 13, ng.d.h(znVar.currentAccount, znVar.a()), null, znVar.a()).show();
                    return;
                } else if (bVar == zf.b.f54531b) {
                    new di.h(znVar.getParentActivity(), znVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void B0(zn znVar) {
        org.telegram.ui.Components.b50.h.a();
        znVar.showDialog(new xh.r1(znVar.getParentActivity(), znVar.currentAccount, znVar.a(), null, null));
    }

    public static void C0(org.telegram.ui.zn r19, org.telegram.ui.qk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.C0(org.telegram.ui.zn, org.telegram.ui.qk, boolean[]):void");
    }

    public static void C1(zn znVar) {
        SparseArray[] sparseArrayArr = znVar.W5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) znVar.f44879o6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            znVar.X5[i10].clear();
            znVar.Y5[i10].clear();
        }
        if (znVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(znVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(znVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception e7) {
                        FileLog.e(e7);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                znVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        znVar.h9();
        znVar.Cc(0, true);
        znVar.ad(false);
        znVar.Pc();
    }

    public static void D0(zn znVar, TLRPC.Document document) {
        znVar.f44966v4.put(document, 0);
        SendMessagesHelper.getInstance(znVar.currentAccount).sendSticker(document, null, znVar.T5, null, null, null, znVar.f44841l5, null, true, 0, 0, false, null, znVar.H8(), 0L, znVar.S8(), znVar.f44782g5);
    }

    public static void E0(zn znVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(znVar.currentAccount).getInputUser(user.f20179id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(znVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new qh(znVar, tL_attachMenuBot, user, 1), 66);
    }

    public static org.telegram.ui.dv0 E1(org.telegram.ui.zn r14, org.telegram.messenger.MessageObject r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.E1(org.telegram.ui.zn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.dv0");
    }

    public static void F0(zn znVar, long j3, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(znVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.f11.c(znVar.getParentActivity(), znVar.currentAccount, -j3, znVar.getUserConfig().getCurrentUser(), null, z10, z11, znVar.getResourceProvider());
    }

    public static TLRPC.TL_message F7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20053id = message.f20053id;
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

    public static void G0(zn znVar) {
        long j3;
        ArrayList arrayList = znVar.f44794h6;
        arrayList.add(Integer.valueOf(znVar.V5));
        if (znVar.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(znVar.currentAccount);
            String str = znVar.f44952u3;
            int i10 = znVar.classGuid;
            int i11 = znVar.O3;
            int i12 = znVar.V5;
            znVar.V5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (znVar.f44982w7 != 0) {
            MessagesController messagesController = znVar.getMessagesController();
            long j10 = znVar.T5;
            long j11 = znVar.L6;
            int i13 = znVar.f44982w7;
            int i14 = znVar.classGuid;
            int i15 = znVar.R3;
            long j12 = znVar.f44743d4;
            int i16 = znVar.f44852m4;
            int i17 = znVar.V5;
            znVar.V5 = i17 + 1;
            messagesController.loadMessages(j10, j11, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j12, i16, i17, znVar.f44792h4);
        } else if (znVar.f44956u7 != 0 && (!znVar.K9() || znVar.f44956u7 == znVar.L7 || znVar.f44792h4)) {
            int i18 = znVar.f44819j7;
            if (i18 != 0) {
                znVar.L6 = i18;
                MessagesController messagesController2 = znVar.getMessagesController();
                long j13 = znVar.L6;
                boolean z10 = znVar.f44795h7;
                int i19 = znVar.f44784g7;
                int i20 = znVar.f44956u7;
                int i21 = znVar.classGuid;
                int i22 = znVar.R3;
                long j14 = znVar.f44743d4;
                int i23 = znVar.f44852m4;
                int i24 = znVar.V5;
                znVar.V5 = i24 + 1;
                messagesController2.loadMessages(j13, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j14, i23, i24, znVar.f44792h4);
            } else {
                MessagesController messagesController3 = znVar.getMessagesController();
                long j15 = znVar.T5;
                long j16 = znVar.L6;
                boolean z11 = znVar.f44795h7;
                int i25 = znVar.f44784g7;
                int i26 = znVar.f44956u7;
                int i27 = znVar.classGuid;
                int i28 = znVar.R3;
                long j17 = znVar.f44743d4;
                int i29 = znVar.f44852m4;
                int i30 = znVar.V5;
                znVar.V5 = i30 + 1;
                messagesController3.loadMessages(j15, j16, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j17, i29, i30, znVar.f44792h4);
            }
        } else if (znVar.f44807i7) {
            znVar.V5++;
        } else {
            MessagesController messagesController4 = znVar.getMessagesController();
            long j18 = znVar.T5;
            long j19 = znVar.L6;
            boolean z12 = znVar.f44795h7;
            int i31 = znVar.f44784g7;
            int i32 = znVar.f44956u7;
            int i33 = znVar.classGuid;
            int i34 = znVar.R3;
            long j20 = znVar.f44743d4;
            int i35 = znVar.f44852m4;
            int i36 = znVar.V5;
            znVar.V5 = i36 + 1;
            messagesController4.loadMessages(j18, j19, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j20, i35, i36, znVar.f44792h4);
        }
        int i37 = znVar.R3;
        if (i37 == 0 || (i37 == 3 && znVar.N8() == znVar.getUserConfig().getClientUserId())) {
            if (znVar.K9() && !znVar.f44792h4) {
                return;
            }
            arrayList.add(Integer.valueOf(znVar.V5));
            MessagesController messagesController5 = znVar.getMessagesController();
            long j21 = znVar.T5;
            long j22 = znVar.L6;
            int i38 = znVar.classGuid;
            if (znVar.R3 == 3) {
                j3 = 0;
            } else {
                j3 = znVar.f44743d4;
            }
            long j23 = j3;
            int i39 = znVar.f44852m4;
            int i40 = znVar.V5;
            znVar.V5 = i40 + 1;
            messagesController5.loadMessages(j21, j22, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j23, i39, i40, znVar.f44792h4);
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
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.l41.k(messageObject)) {
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

    public static void H0(zn znVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        MessagesController.getNotificationsSettings(znVar.currentAccount).edit().putLong("dialog_join_requested_time_" + znVar.T5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(znVar.f44752e) && !znVar.f44752e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.j90.f27627r;
            org.telegram.ui.Components.j90.y(context, znVar, org.telegram.ui.Components.ad.a0(znVar), z10);
        }
        znVar.zb(false, true);
    }

    public static void I0(zn znVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, k6 k6Var) {
        try {
            a0.i iVar = new a0.i();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f20053id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(znVar.currentAccount, tL_message, false, false));
            iVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            znVar.getMessagesController().getStoriesController().f1414k.d(iVar, new ug(7, iVar, k6Var), znVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void I1(zn znVar) {
        int i10;
        if (znVar.a() == znVar.getUserConfig().getClientUserId() && znVar.getUserConfig().isPremium() && znVar.f44724bb == null) {
            el elVar = new el(znVar, znVar, znVar.getParentActivity(), znVar.currentAccount, znVar.f44762ea);
            znVar.f44724bb = elVar;
            elVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            znVar.f44724bb.setDelegate(new gl(znVar));
            znVar.f44724bb.setTop(true);
            int i11 = 0;
            znVar.f44724bb.setClipChildren(false);
            znVar.f44724bb.setClipToPadding(false);
            znVar.f44724bb.setVisibility(0);
            el elVar2 = znVar.f44724bb;
            if (elVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            elVar2.setHint(LocaleController.getString(i10));
            znVar.X0.addView(znVar.f44724bb, w7.x5.a(92.5f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 49));
            znVar.f44724bb.p(null, null, true);
            znVar.f44724bb.setTranslationY(-AndroidUtilities.dp(12.0f));
            znVar.f44724bb.setScaleY(0.4f);
            znVar.f44724bb.setScaleX(0.4f);
            znVar.f44724bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.is.h).start();
            znVar.Pc();
            el elVar3 = znVar.f44724bb;
            float f7 = znVar.f44984w9;
            zk zkVar = znVar.f44874o1;
            if (zkVar != null) {
                i11 = zkVar.getCurrentHeight();
            }
            elVar3.setTranslationY(f7 + i11);
        }
    }

    public static SpannableStringBuilder I8(MessageObject messageObject, boolean z10, long j3) {
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

    public static void J0(zn znVar) {
        znVar.J7(false);
        if (!znVar.fragmentBeginToShow) {
            wj wjVar = znVar.f44989x0;
            wjVar.W1 = false;
            wjVar.X1 = 0;
            wjVar.setEmptyView(znVar.Q0);
            wj wjVar2 = znVar.f44989x0;
            wjVar2.W1 = true;
            wjVar2.X1 = 1;
            return;
        }
        znVar.f44989x0.setEmptyView(znVar.Q0);
    }

    public static void K0(zn znVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j3) {
        znVar.Qb(tL_game, messageObject, str, false, j3);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(znVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j3, false).commit();
    }

    public static java.util.ArrayList K7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.K7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void L0(zn znVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j3;
        TLRPC.User user = znVar.I1.getAdapter().f10693w0;
        int i10 = znVar.currentAccount;
        TLRPC.User user2 = znVar.f44764f;
        if (user2 != null) {
            j3 = user2.f20179id;
        } else {
            j3 = znVar.f44752e.f20032id;
        }
        ei.e5 b10 = ei.e5.b(i10, j3, user.f20179id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, znVar.S8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.G1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.G1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(znVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(znVar.currentAccount);
            MessagesController.showCantOpenAlert(znVar, restrictionReason);
            return;
        }
        ei.k3 k3Var = new ei.k3(znVar.getParentActivity(), znVar.getResourceProvider());
        k3Var.x(false);
        k3Var.A0 = true;
        k3Var.f9166k0 = znVar.getParentActivity();
        k3Var.t(znVar, b10);
        k3Var.show();
    }

    public static void M0(zn znVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(znVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, znVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(znVar.currentAccount).editMessage(messageObject, null, false, znVar, null, i10, i11);
        }
    }

    public static FrameLayout M7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.d6 d6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        ai.q4 q4Var = new ai.q4(context, 12);
        int i11 = 3;
        q4Var.setMaxLines(3);
        q4Var.setGravity(3);
        q4Var.setEllipsize(TextUtils.TruncateAt.END);
        q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        q4Var.setTextSize(1, i10);
        q4Var.setMaxWidth(AndroidUtilities.dp(170.0f));
        q4Var.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(q4Var, w7.x5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void N0(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(znVar.currentAccount).loadAttachMenuBots(false, true);
            znVar.ba(user.f20179id, znVar.f44833k8, false);
        }
    }

    public static boolean P0(org.telegram.ui.zn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.P0(org.telegram.ui.zn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static a3.h0 P4(zn znVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = znVar.getMessagesController().createDeleteShowOnceTask(znVar.T5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                znVar.xc(arrayList, true);
            }
            return new a3.h0(znVar, createDeleteShowOnceTask, messageObject, 13);
        }
        return null;
    }

    public static void Q0(zn znVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(znVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (znVar.i() != null) {
                tLObject2 = znVar.i();
            } else {
                tLObject2 = znVar.f44752e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = znVar.f44764f;
                if (user2 != null && user2.bot && user.f20179id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.ai.q(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.ad.a0(znVar), null);
                } else if (user2 != null && user2.bot && user.f20179id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.ai.q(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.ad.a0(znVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.ai.q(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.ad.a0(znVar), null);
                } else {
                    TLRPC.Chat chat = znVar.f44752e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.ai.q(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.ad.a0(znVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = znVar.f44752e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.ai.q(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.ad.a0(znVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                znVar.ba(user.f20179id, znVar.f44833k8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.y6 y6Var = new org.telegram.ui.Components.y6(znVar.getParentActivity());
                y6Var.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20881ia, false));
                y6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false));
                y6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity());
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.V = y6Var;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(znVar, user, atomicBoolean, tL_attachMenuBot, 5));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.a2 a2Var2 = new org.telegram.ui.Cells.a2(znVar.getParentActivity(), 5, znVar.getResourceProvider());
                    a2Var2.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    a2Var2.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
                    a2Var2.setMultiline(true);
                    a2Var2.e(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.OpenUrlOption2, UserObject.getUserName(user))), "", true, false, false);
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
                    a2Var2.setPadding(dp, 0, dp2, 0);
                    a2Var2.setOnClickListener(new rf(3, a2Var2, atomicBoolean));
                    a2Var.G = 6;
                    alertDialog$Builder.n(a2Var2);
                }
                alertDialog$Builder.o();
            } else {
                mj1.a(znVar.getParentActivity(), new y(znVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void R0(zn znVar, long j3, long j10, Long l4) {
        int i10;
        String str;
        if (znVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = znVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(znVar.f44752e)) {
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
        org.telegram.ui.Components.g5.h0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new lh(znVar, j3, j10, l4, 0), znVar.resourceProvider, true);
    }

    public static void S0(zn znVar, org.telegram.ui.Components.q80 q80Var) {
        if (znVar.Mb == null) {
            return;
        }
        q80Var.u();
        znVar.O9(znVar.Mb, false, true);
        of.f.r(znVar.getParentActivity(), Uri.parse(znVar.Mb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(znVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void S3(zn znVar) {
        org.telegram.ui.ActionBar.x xVar;
        if (!znVar.f44750db && (xVar = znVar.f44800i0) != null) {
            xVar.a();
            org.telegram.ui.ActionBar.u0 u0Var = xVar.f21666m;
            u0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (znVar.R3 == 0) {
                u0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            u0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            u0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.o61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            u0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = znVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f31643a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.w11(obj, 0), 0, spannableStringBuilder4.length(), 33);
                u0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f31643a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.w11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                u0Var.g(56, spannableStringBuilder5);
            }
            u0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (znVar.h == null) {
                u0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            u0Var.g(54, LocaleController.getString(R.string.Regular));
            znVar.f44750db = true;
        }
    }

    public static void T0(zn znVar, Object[] objArr, org.telegram.ui.Components.zy0 zy0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.ad adVar = new org.telegram.ui.Components.ad(zy0Var.container, znVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.sc r10 = adVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r10.f30711j = 2750;
                r10.k(true);
            }
        }
    }

    public static MessageObject T1(zn znVar) {
        View view = znVar.f44748d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) view).getMessageObject();
        }
        return null;
    }

    public static void U(zn znVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = znVar.getParentActivity();
        int i12 = znVar.currentAccount;
        long j3 = znVar.T5;
        xn xnVar = znVar.f44762ea;
        int i13 = org.telegram.ui.Components.zo.L;
        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.d6) xnVar, false);
        e3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f20857h5, xnVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, xnVar)));
        linearLayout.addView((View) imageView, w7.x5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.h6.f20894j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, xnVar));
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, w7.x5.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, xnVar));
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
        org.telegram.messenger.ai.r(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.x5.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            rg.p0 p0Var = new rg.p0(parentActivity, xnVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.g3(e3Var, 1));
            p0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(p0Var, w7.x5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        e3Var.setCustomView(linearLayout);
        e3Var.show();
    }

    public static void U0(zn znVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            znVar.f44824jc = true;
            znVar.f44989x0.f1();
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
            zn znVar2 = new zn(bundle);
            znVar2.tb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                znVar2.L7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = znVar2.X3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                znVar2.X3.messageOwner.reactions = tL_messageReactions;
            }
            ai.d9 d9Var = new ai.d9(znVar, new boolean[]{false}, i11, znVar2, 14);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f20053id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = znVar2.getClassGuid();
                NotificationCenter.getInstance(znVar.currentAccount).addObserver(new yi(znVar, classGuid, d9Var, znVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        zn znVar3 = zn.this;
                        MessagesController messagesController = znVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((MessageObject) hg.c.g(1, arrayList)).getId(), 1, false, 0, true, znVar3.f44792h4, null);
                    }
                });
                return;
            }
            d9Var.run();
            return;
        }
        znVar.f44812ic = 0;
        znVar.f44824jc = false;
        znVar.f44989x0.f1();
        if (messageObject2 != null) {
            znVar.la(messageObject2);
        } else if (znVar.getParentActivity() != null) {
            org.telegram.ui.Components.ad.a0(znVar).t(LocaleController.getString(R.string.ChannelPostDeleted), znVar.f44762ea).j();
        }
    }

    public static void U4(zn znVar, org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int themedColor;
        int i11;
        me.b bVar = znVar.f44987wc;
        if (znVar.Y != null && !bVar.f16366f && u1Var.getMessageObject() != null) {
            sm smVar = znVar.X0;
            RectF rectF = AndroidUtilities.rectTmp;
            hh.j.c(u1Var, smVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            sh.a aVar = u1Var.f23106a6;
            if (aVar != null && u1Var.f23290n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((znVar.X0.getMeasuredHeight() - znVar.f44989x0.getPaddingBottom()) + znVar.f44936sc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = u1Var.getMessageObject();
                if (znVar.Cc == null) {
                    znVar.Cc = new qh.c(znVar.getParentActivity(), znVar.resourceProvider, znVar);
                    int indexOfChild = znVar.X0.indexOfChild(znVar.f44989x0);
                    if (indexOfChild >= 0) {
                        znVar.X0.addView(znVar.Cc, indexOfChild + 1, w7.x5.g());
                    } else {
                        znVar.X0.addView(znVar.Cc, w7.x5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (u1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.h6.nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21068sb;
                    }
                    themedColor = znVar.getThemedColor(i11);
                } else {
                    if (u1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.h6.f20995od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f20976nd;
                    }
                    themedColor = znVar.getThemedColor(i10);
                }
                znVar.Cc.setColor(themedColor);
                znVar.Cc.setCellToWatch(u1Var);
                znVar.Cc.f46739b.f46735a.a(false, false);
                znVar.Cc.setAnimatedVisibility(bVar.f16365e);
                znVar.Cc.f46739b.setOnClickListener(new org.telegram.ui.Components.voip.p(new sg(znVar, 0), 8));
                qh.c cVar = znVar.Cc;
                cVar.f46745s = new sg(znVar, 2);
                org.telegram.ui.Cells.c6 c6Var = cVar.f46738a;
                c6Var.setOnKeyListener(new tg(znVar, 0));
                c6Var.setOnEditorActionListener(new ia(znVar, 1));
                znVar.Y.U4 = c6Var;
                AndroidUtilities.runOnUIThread(new ai.s1(znVar, measuredHeight, c6Var, 28), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void V(zn znVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (znVar.f44847lb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            znVar.G5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                znVar.G5 = null;
                MessagePreviewParams messagePreviewParams = znVar.f44770f5;
                if (messagePreviewParams != null) {
                    int i11 = znVar.currentAccount;
                    CharSequence fieldText = znVar.Y.getFieldText();
                    MessageObject messageObject3 = znVar.f44867n5;
                    if (messageObject3 == znVar.X3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, znVar.f44841l5, znVar.p5);
                }
                znVar.m8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                znVar.I5 = str;
            }
            if (znVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = znVar.f44770f5;
            if (messagePreviewParams2 != null) {
                int i12 = znVar.currentAccount;
                CharSequence fieldText2 = znVar.Y.getFieldText();
                MessageObject messageObject4 = znVar.f44867n5;
                if (messageObject4 == znVar.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, znVar.f44841l5, znVar.p5);
            }
            znVar.Ib(true, znVar.G5, false);
            return;
        }
        znVar.G5 = null;
        znVar.m8();
    }

    public static void V0(zn znVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            yh.p7.k1(znVar.getParentActivity(), znVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, znVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            znVar.presentFragment(new uo0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static zn V9(int i10, long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("message_id", i10);
        return new zn(bundle);
    }

    public static boolean W(zn znVar) {
        MessageObject messageObject = znVar.Mb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(znVar.getParentActivity()), znVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void W0(zn znVar, String str) {
        Uri parse = Uri.parse(str);
        i60.b(znVar.getParentActivity(), znVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void W1(zn znVar, float f7) {
        View view = znVar.f44748d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).setWalletSlidingOffset(f7);
        }
    }

    public static zn W9(long j3) {
        Bundle bundle = new Bundle();
        if (j3 >= 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        return new zn(bundle);
    }

    public static void X(zn znVar, long j3, long j10) {
        yh.n5.y(znVar.currentAccount, false).C(j3, j10, new eh(znVar, j3, j10, 0));
    }

    public static void X0(zn znVar, int i10) {
        int i11;
        RectF rectF;
        fh.d dVar = znVar.H;
        fh.d dVar2 = znVar.I;
        ArrayList arrayList = znVar.Fc;
        ah.h hVar = znVar.F;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && hVar != null) {
            if (w7.g0.a(i10, 4)) {
                znVar.u9();
            }
            if (w7.g0.a(i10, 2)) {
                ArrayList arrayList2 = znVar.Ec;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, znVar.X0.getMeasuredWidth(), znVar.f44989x0.getY() + znVar.f44989x0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.c(1, AndroidUtilities.dp(48.0f), arrayList2) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.c(i11, AndroidUtilities.dp(8.0f), arrayList2);
                    }
                } else {
                    i11 = 0;
                }
                int a2 = yf.e0.a(arrayList2, i11, arrayList);
                int measuredWidth = znVar.X0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.o.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(znVar.f44989x0.getY(), rectF2.top);
                    rectF2.right = w7.o.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(znVar.f44989x0.getY() + znVar.f44989x0.getMeasuredHeight(), rectF2.bottom);
                }
                hVar.g(a2, arrayList);
            }
            sm smVar = znVar.X0;
            Objects.requireNonNull(smVar);
            if (hVar.e(new eg(smVar, 0), znVar.X0.getWidth(), znVar.X0.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = znVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                znVar.s9();
            }
        }
    }

    public static void X1(zn znVar) {
        long j3;
        xp xpVar = znVar.P9;
        if (xpVar != null) {
            if (znVar.f44792h4) {
                if (xpVar.H != null) {
                    if (znVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(znVar, znVar.getParentLayout().getFragmentStack().indexOf(znVar), znVar.f44752e, znVar.f44764f, znVar.f44731c4, znVar.T5, znVar.f44971va, znVar.f44959ua);
                    }
                    TLRPC.Chat chat = znVar.f44752e;
                    TLRPC.TL_forumTopic tL_forumTopic = znVar.P9.H;
                    long j10 = znVar.T5;
                    int i10 = znVar.f44959ua;
                    int i11 = znVar.f44971va;
                    if (znVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(znVar, znVar.getParentLayout().getFragmentStack().indexOf(znVar), chat, null, tL_forumTopic, j10, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", znVar.P9.f44129a);
                    bundle.putInt("dialog_filter_id", znVar.P9.f44131b);
                    bundle.putBoolean("pulled", true);
                    zn g10 = ng.d.g(znVar, -znVar.T5, znVar.P9.H, 0, bundle);
                    g10.R9 = true;
                    Oc = true;
                    znVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = xpVar.G;
            long j11 = 0;
            if (chat2 == null) {
                j3 = 0;
            } else {
                j3 = chat2.f20032id;
            }
            if (j3 != 0) {
                znVar.y6();
                xp xpVar2 = znVar.P9;
                TLRPC.Chat chat3 = xpVar2.G;
                long j12 = xpVar2.Z;
                int i12 = xpVar2.f44129a;
                int i13 = xpVar2.f44131b;
                if (znVar.getParentLayout() != null) {
                    org.telegram.ui.Components.q9.a(znVar, znVar.getParentLayout().getFragmentStack().indexOf(znVar), chat3, null, null, j12, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = znVar.P9.G;
                if (chat4 != null) {
                    j11 = chat4.f20032id;
                }
                bundle2.putLong("chat_id", j11);
                bundle2.putInt("dialog_folder_id", znVar.P9.f44129a);
                bundle2.putInt("dialog_filter_id", znVar.P9.f44131b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(znVar.currentAccount).edit().remove("diditem" + znVar.P9.Z).apply();
                zn znVar2 = new zn(bundle2);
                ArrayList arrayList = znVar.f44775fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = znVar.f44775fb;
                    znVar2.f44775fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                znVar2.R9 = true;
                Oc = true;
                znVar.presentFragment(znVar2, true);
            }
        }
    }

    public static void Y(zn znVar, long j3, long j10) {
        BotForumHelper.getInstance(znVar.currentAccount).saveIsStreamingTopic(j3, j10, false);
        znVar.Nb = null;
    }

    public static void Y0(zn znVar) {
        if (AndroidUtilities.addToClipboard(znVar.Mb.sponsoredInfo)) {
            org.telegram.messenger.ai.p(R.string.TextCopied, new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(znVar.getParentActivity()), znVar.resourceProvider));
        }
    }

    public static void Z(zn znVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(znVar.currentAccount).sendSticker(tL_document, str, znVar.T5, znVar.f44867n5, znVar.X3, null, znVar.f44841l5, null, z10, i10, 0, false, obj, znVar.H8(), 0L, znVar.S8(), znVar.f44782g5);
    }

    public static void Z0(zn znVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(znVar.currentAccount).loadAttachMenuBots(false, true);
            znVar.ba(user.f20179id, znVar.f44833k8, false);
        }
    }

    public static void a0(zn znVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new hf(znVar, i10, 6));
        } else {
            znVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a1(zn znVar) {
        znVar.f44723ba = null;
        znVar.f44989x0.setOnInterceptTouchListener(null);
        znVar.nb(znVar.X0, true);
        ChatThemeController.getInstance(znVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void b0(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, vf vfVar) {
        String str4;
        org.telegram.ui.Components.w41 w41Var;
        if (znVar.f44744d5 != null && i10 < arrayList.size() && znVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = znVar.getParentActivity();
            int i11 = iArr[0];
            qf qfVar = new qf(znVar, 13);
            String[] strArr = org.telegram.ui.Components.d51.R;
            if (parentActivity == null) {
                w41Var = null;
            } else {
                org.telegram.ui.Components.w41 w41Var2 = new org.telegram.ui.Components.w41(parentActivity, str, str4, inputPeer, i11, richMessage, qfVar);
                w41Var2.I(z10);
                w41Var2.M = znVar;
                w41Var2.N = vfVar;
                if (znVar.getParentActivity() != null) {
                    znVar.showDialog(w41Var2);
                }
                w41Var = w41Var2;
            }
            w41Var.setDimBehind(false);
            znVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(znVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + znVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(znVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + znVar.a(), i12 - 1).apply();
                znVar.Uc(true);
            }
        }
    }

    public static void b1(zn znVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (znVar.getParentActivity() != null) {
            TLRPC.Chat chat = znVar.f44752e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !znVar.f44752e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (znVar.h == null && (userFull = znVar.f44707a8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44762ea);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new qe(znVar, 21));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                znVar.showDialog(alertDialog$Builder.f20368a);
            } else if (!znVar.H4.isEmpty()) {
                MessagesController.getNotificationsSettings(znVar.currentAccount).edit().putInt("pin_" + znVar.T5, ((Integer) znVar.H4.get(0)).intValue()).commit();
                znVar.Cc(0, true);
            }
        }
    }

    public static void c0(long j3, zn znVar) {
        if (yh.n5.y(znVar.currentAccount, false).p().amount < j3) {
            new yh.e7(znVar.getParentActivity(), znVar.getResourceProvider(), j3, 13, DialogObject.getShortName(znVar.a()), new sg(znVar, 7), znVar.a()).show();
        } else {
            new yh.f7(znVar.getParentActivity(), znVar.resourceProvider).show();
        }
    }

    public static void c1(zn znVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        znVar.f44782g5 = null;
        int i10 = znVar.f44883ob;
        if (i10 == 2) {
            znVar.f44841l5 = null;
            znVar.f44867n5 = null;
            MessagePreviewParams messagePreviewParams = znVar.f44770f5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, znVar.T5, null);
            }
            znVar.m8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = znVar.f44770f5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = znVar.f44770f5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j3 = 0;
                long j10 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = znVar.f44770f5.forwardMessages.messages.get(i11);
                    if (j3 == 0) {
                        j10 = messageObject3.getDialogId();
                        j3 = messageObject3.getFromChatId();
                    } else if (j3 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44762ea);
                org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                a2Var.I0 = true;
                if (j10 > 0) {
                    TLRPC.User user = znVar.getMessagesController().getUser(Long.valueOf(j10));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", znVar.f44770f5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = znVar.getMessagesController().getChat(Long.valueOf(-j10));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", znVar.f44770f5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                a2Var.T = AndroidUtilities.replaceTags(formatString);
                a2Var.R = LocaleController.formatPluralString("messages", znVar.f44770f5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new qe(znVar, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new qe(znVar, 7));
                znVar.showDialog(a2Var);
                TextView textView = (TextView) a2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(znVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21026q7));
                }
            }
        } else if (i10 == 4) {
            znVar.G5 = null;
            MessagePreviewParams messagePreviewParams3 = znVar.f44770f5;
            if (messagePreviewParams3 != null) {
                int i12 = znVar.currentAccount;
                MessageObject messageObject4 = znVar.f44867n5;
                if (messageObject4 == znVar.X3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, znVar.f44841l5, znVar.p5);
            }
            ok okVar = znVar.Y;
            okVar.X2 = null;
            okVar.Y2 = false;
            znVar.l8();
            znVar.m8();
        } else {
            if (ChatObject.isForum(znVar.f44752e) && !znVar.f44792h4 && (messageObject = znVar.f44867n5) != null) {
                long topicId = MessageObject.getTopicId(znVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    znVar.getMediaDataController().cleanDraft(znVar.T5, topicId, false);
                }
            }
            znVar.Cb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void c2(zn znVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            messageObject = u1Var.getMessageObject();
            u1Var.f23187g1 = f7;
            u1Var.f23199h1 = f10;
            org.telegram.ui.Components.sb0 sb0Var = u1Var.Kc;
            float f11 = u1Var.f23199h1;
            sb0Var.h = u1Var.getTranslationX() + f7;
            sb0Var.f30698i = f11;
            sb0Var.f30701l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int J8 = znVar.J8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && J8 >= 2 && J8 != 20 && J8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        znVar.A6(messageObject, z10, true);
                        znVar.hc();
                        znVar.ad(false);
                    }
                }
            }
        }
    }

    public static void d0(zn znVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        String str4;
        if (znVar.f44744d5 != null && i10 < arrayList.size() && znVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = znVar.f44744d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.d51.K(znVar.getParentActivity(), znVar, inputPeer, iArr[0], znVar.f44744d5.summarized, str, str4, charSequence, z10, vfVar, new qf(znVar, 19)).setDimBehind(false);
            znVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(znVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + znVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(znVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + znVar.a(), i11 - 1).apply();
                znVar.Uc(true);
            }
        }
    }

    public static void d1(zn znVar, String str) {
        if (znVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(znVar.currentAccount).getInviteText(1));
            znVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public static void d2(zn znVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = znVar.f44955u6;
        SparseArray[] sparseArrayArr = znVar.W5;
        if (!znVar.Pa && (i11 = i10 - znVar.A0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.sm0 sm0Var = znVar.f44989x0;
            bj bjVar = new bj(znVar, z10, sparseArray);
            if (!sm0Var.f30784b2) {
                sm0Var.f30802k2 = new int[2];
                new HashSet();
                sm0Var.l1(sm0Var, true);
                sm0Var.f30792f2 = bjVar;
                sm0Var.f30784b2 = true;
                sm0Var.f30790e2 = i10;
                sm0Var.f30788d2 = i10;
            }
        }
    }

    public static void d4(zn znVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(znVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new z6(znVar, h0Var, text, 3), new y0(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void e0(zn znVar, long j3, long j10, Long l4, Boolean bool) {
        boolean z10 = false;
        yh.n5 y3 = yh.n5.y(znVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.i0(j3, j10, z10, true);
    }

    public static void e1(zn znVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = znVar.getMessagesController().getInputPeer(znVar.T5);
                tL_messages_getHistory.offset_date = znVar.f44982w7 + 86400;
                tL_messages_getHistory.limit = 1;
                znVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new ai.v1(25, znVar, tLObject));
                return;
            }
            znVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static boolean e2(zn znVar, View view, RectF rectF) {
        RectF rectF2 = znVar.Fb;
        if (rectF != null && znVar.f44989x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void f0(zn znVar) {
        if (znVar.Mb == null) {
            return;
        }
        g41[] g41VarArr = {g41.U(znVar.getParentActivity(), znVar, true, znVar.resourceProvider, new oc(5, znVar, g41VarArr))};
    }

    public static void f1(zn znVar, int i10) {
        if (znVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 t82 = znVar.t8(i10, false);
            if (t82 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) t82;
                zg.o0 o0Var = u1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = u1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (o0Var.K || randomUnreadReaction.big)) {
                    zg.j0.d(znVar, null, t82, null, 0.0f, 0.0f, zg.n0.d(randomUnreadReaction.reaction), znVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    zg.j0.f();
                }
                o0Var.K = false;
                MessageObject messageObject = u1Var.f23450y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (t82 instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) t82;
                zg.o0 o0Var2 = w0Var.E0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = w0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (o0Var2.K || randomUnreadReaction2.big)) {
                    zg.j0.d(znVar, null, t82, null, 0.0f, 0.0f, zg.n0.d(randomUnreadReaction2.reaction), znVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    zg.j0.f();
                }
                o0Var2.K = false;
                MessageObject messageObject2 = w0Var.P0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void f4(zn znVar) {
        if (znVar.I3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = znVar.R3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f20053id = 0;
        MessageObject messageObject = new MessageObject(znVar.currentAccount, tL_message, false, false);
        znVar.I3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void g0(zn znVar) {
        MessagesController messagesController = znVar.getMessagesController();
        long j3 = znVar.T5;
        long j10 = znVar.L6;
        int i10 = znVar.classGuid;
        int i11 = znVar.R3;
        long j11 = znVar.f44743d4;
        int i12 = znVar.f44852m4;
        int i13 = znVar.V5;
        znVar.V5 = i13 + 1;
        messagesController.loadMessages(j3, j10, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j11, i12, i13, znVar.f44792h4);
    }

    public static void g1(zn znVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.fh fhVar;
        String str;
        SparseArray[] sparseArrayArr = znVar.W5;
        if (znVar.getParentActivity() != null && znVar.N9 == 0.0f) {
            if (znVar.R3 == 3) {
                Bundle bundle = new Bundle();
                long N8 = znVar.N8();
                if (N8 >= 0) {
                    bundle.putLong("user_id", N8);
                } else {
                    bundle.putLong("chat_id", -N8);
                }
                znVar.presentFragment(new zn(bundle));
                return;
            }
            boolean z12 = false;
            if (znVar.F9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                znVar.zb(true, true);
                byte[] bArr = znVar.V3;
                String str2 = znVar.W3;
                bf bfVar = new bf(znVar, 1);
                int i11 = b41.v;
                int currentAccount = znVar.getCurrentAccount();
                Activity parentActivity = znVar.getParentActivity();
                long a2 = znVar.a();
                if (parentActivity != null) {
                    b41.L(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.ad.a0(znVar), znVar.getResourceProvider(), bArr, str2, bfVar);
                }
            } else if (znVar.R3 == 2) {
                znVar.finishFragment();
                nm nmVar = znVar.V8;
                if (znVar.B0.getTag() == null) {
                    z12 = true;
                }
                nmVar.V(true, z12);
            } else {
                TLRPC.User user = znVar.f44764f;
                if (user != null && user.f20179id == 489000) {
                    znVar.fc(true);
                } else if (user != null && znVar.f44861n) {
                    if (user.bot) {
                        String str3 = znVar.f44760e8;
                        znVar.f44760e8 = null;
                        znVar.getMessagesController().unblockPeer(znVar.f44764f.f20179id, new te(znVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44762ea);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                    a2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qe(znVar, 8));
                    a2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    znVar.showDialog(a2Var);
                } else if (UserObject.isReplyUser(user)) {
                    znVar.fc(true);
                } else {
                    TLRPC.User user2 = znVar.f44764f;
                    if (user2 != null && user2.bot && (str = znVar.f44760e8) != null) {
                        if (str.length() != 0) {
                            znVar.getMessagesController().sendBotStart(znVar.f44764f, znVar.f44760e8);
                        } else {
                            znVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", znVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        znVar.f44760e8 = null;
                        znVar.lc(false);
                        return;
                    }
                    if (ChatObject.isChannel(znVar.f44752e)) {
                        TLRPC.Chat chat = znVar.f44752e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (znVar.f44752e.join_request) {
                                    znVar.zb(true, true);
                                    MessagesController.getInstance(znVar.currentAccount).addUserToChat(znVar.f44752e.f20032id, UserConfig.getInstance(znVar.currentAccount).getCurrentUser(), 0, null, null, true, new le(znVar, 14), new m4.v0(10, znVar, context));
                                    return;
                                }
                                le leVar = znVar.L5;
                                if (leVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(leVar);
                                    znVar.L5 = null;
                                }
                                znVar.zb(true, true);
                                znVar.getMessagesController().addUserToChat(znVar.f44752e.f20032id, znVar.getUserConfig().getCurrentUser(), 0, null, znVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.p0 p0Var = znVar.K1;
                                if (p0Var != null && (fhVar = znVar.M0) != null && fhVar.d(p0Var) && znVar.N1.getVisibility() != 8 && znVar.N1.getTag(R.id.object_tag) != null) {
                                    MessagesController.getNotificationsSettings(znVar.currentAccount).edit().putInt("dialog_bar_vis3" + znVar.T5, 3).commit();
                                    znVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(znVar.T5));
                                    return;
                                }
                                return;
                            }
                            znVar.fc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = znVar.Z7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = znVar.f44752e;
                    TLRPC.User user3 = znVar.f44764f;
                    if (znVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.g5.r(znVar, false, chat2, user3, z11, true, false, z10, new qe(znVar, 9));
                }
            }
        }
    }

    public static void g4(zn znVar) {
        if (znVar.J3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f20053id = 0;
        MessageObject messageObject = new MessageObject(znVar.currentAccount, tL_message, false, false);
        znVar.J3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void h0(zn znVar, ArrayList arrayList, long j3, org.telegram.ui.Components.in0 in0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(znVar.currentAccount).sendMessage(arrayList, j3, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new ke(znVar, j3, 5), 400L);
            in0Var.dismiss();
        }
    }

    public static void h1(zn znVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.q80 I = org.telegram.ui.Components.q80.I(znVar, u1Var);
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(znVar.getParentActivity(), znVar.f44762ea);
        I.f30078p = new re(in0Var, 0);
        if (z10 && znVar.getMessagesController().config.walletAvailable.get()) {
            I.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney), new te(znVar, str, 11), false);
        }
        I.c(R.drawable.msg_copy, LocaleController.getString(R.string.WalletCopyAddress), new xe(znVar, in0Var, str, 1), false);
        if (z10) {
            I.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new te(znVar, str, 12), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = znVar.currentAccount;
                long j3 = user.f20179id;
                org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(29, znVar, userArr);
                TLObject userOrChat = MessagesController.getInstance(i11).getUserOrChat(j3);
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
                I.n(userOrChat, LocaleController.getString(i10), a6Var);
            } else {
                I.p(13, -1, LocaleController.getString(R.string.WalletAddressNoLinkedAccount));
            }
        }
        in0Var.e(I);
        in0Var.f(u1Var, characterStyle, null, false);
        znVar.showDialog(in0Var);
    }

    public static void i0(zn znVar) {
        if (AndroidUtilities.addToClipboard(znVar.Mb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.ai.p(R.string.TextCopied, new org.telegram.ui.Components.ad(org.telegram.ui.Components.nb.a(znVar.getParentActivity()), znVar.resourceProvider));
        }
    }

    public static void i1(org.telegram.ui.zn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.u1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.i1(org.telegram.ui.zn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1, int, int):void");
    }

    public static void j0(zn znVar, TLRPC.Document document) {
        znVar.f44966v4.put(document, 0);
        SendMessagesHelper.getInstance(znVar.currentAccount).sendSticker(document, null, znVar.T5, null, null, null, znVar.f44841l5, null, true, 0, 0, false, null, znVar.H8(), 0L, znVar.S8(), znVar.f44782g5);
    }

    public static void j1(zn znVar, int i10) {
        org.telegram.ui.ActionBar.b5 b5Var = znVar.parentLayout;
        if (b5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.m2 backgroundFragment = b5Var.getBackgroundFragment();
        if (backgroundFragment instanceof zn) {
            zn znVar2 = (zn) backgroundFragment;
            if (znVar2.a() == znVar.T5) {
                znVar.finishFragment();
                znVar2.F(i10, 0, 0, 0, true, true);
                return;
            }
        }
        znVar.presentFragment(V9(i10, znVar.T5));
    }

    public static void j2(zn znVar) {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (znVar.f45014z1 != null) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var2 = null;
        for (int childCount = znVar.f44989x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = znVar.f44989x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (primaryMessageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                u1Var2 = u1Var;
            }
        }
        znVar.yb(u1Var2);
    }

    public static void k0(zn znVar) {
        if (znVar.M1) {
            znVar.getMessagesController().addDialogToFolder(znVar.T5, 0, 0, 0L);
            znVar.T7();
            znVar.y3.j(23, znVar.T5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(znVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + znVar.T5, false);
            edit.putBoolean("dialog_bar_block" + znVar.T5, false);
            edit.putBoolean("dialog_bar_report" + znVar.T5, false);
            edit.commit();
            znVar.Uc(false);
            znVar.getNotificationsController().clearDialogNotificationsSettings(znVar.T5, znVar.d());
        } else if (znVar.L1.getTag() != null && ((Integer) znVar.L1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = znVar.Z7;
            if (chatFull != null && chatFull.participants != null) {
                a0.i iVar = new a0.i();
                for (int i10 = 0; i10 < znVar.Z7.participants.participants.size(); i10++) {
                    iVar.k(null, znVar.Z7.participants.participants.get(i10).user_id);
                }
                long j3 = znVar.Z7.f20033id;
                org.telegram.ui.Components.e80 e80Var = new org.telegram.ui.Components.e80(znVar.getParentActivity(), znVar.currentAccount, iVar, znVar.Z7.f20033id, znVar, znVar.f44762ea);
                e80Var.f25909l0 = new qe(znVar, 23);
                e80Var.show();
            }
        } else if (znVar.L1.getTag() != null) {
            znVar.vb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", znVar.f44764f.f20179id);
            bundle.putBoolean("addContact", true);
            ps psVar = new ps(bundle);
            psVar.O = new qe(znVar, 24);
            znVar.presentFragment(psVar);
        }
    }

    public static void k1(org.telegram.ui.zn r19, final org.telegram.ui.g41[] r20, final org.telegram.ui.Components.q80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.k1(org.telegram.ui.zn, org.telegram.ui.g41[], org.telegram.ui.Components.q80):void");
    }

    public static void l0(zn znVar, TLRPC.ReactionCount reactionCount) {
        znVar.D7(true);
        org.telegram.ui.Components.po0.c(znVar.getParentActivity(), znVar.currentAccount, reactionCount.reaction, znVar.f44762ea);
    }

    public static void l1(zn znVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(znVar.currentAccount).getInputUser(user.f20179id);
                    ConnectionsManager.getInstance(znVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ai.v1(26, znVar, user));
                }
            }
        }
    }

    public static void m0(zn znVar) {
        if (znVar.X2.getAlpha() != 0.0f && !znVar.actionBar.t() && !znVar.F9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(znVar.X2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            znVar.L9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void m1(zn znVar, int i10) {
        if (znVar.R3 == 7) {
            Object E = znVar.M3.E(i10);
            if (i10 == 0) {
                znVar.M3.getClass();
            }
            if (E instanceof MessageObject) {
                znVar.ka((MessageObject) E);
            }
        } else if (znVar.f44900q3 != null) {
            if (i10 >= 0 && i10 < znVar.getMediaDataController().searchResultMessages.size()) {
                znVar.f44913r3 = false;
                znVar.pb(false, true, false);
                znVar.getMediaDataController().setSearchedPosition(i10);
                znVar.Jc(znVar.getMediaDataController().getMask(), znVar.getMediaDataController().getSearchPosition(), znVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new ue(znVar, znVar.getMediaDataController().searchResultMessages.get(i10), 5));
            }
        } else {
            znVar.getMediaDataController().jumpToSearchedMessage(znVar.classGuid, i10);
            znVar.Pb(false);
        }
    }

    public static void n0(zn znVar) {
        org.telegram.ui.Cells.u1 u1Var;
        yl ylVar;
        int i10;
        if (!znVar.Rb && znVar.F3 && znVar.f44989x0.G && znVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = znVar.f44989x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = znVar.f44989x0.getChildAt(childCount);
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
                znVar.Rb = true;
                yl ylVar2 = new yl(znVar, znVar.getParentActivity());
                ylVar2.p(true);
                ylVar2.K = Layout.Alignment.ALIGN_CENTER;
                ylVar2.d = 3500L;
                ylVar2.T = true;
                ylVar2.f4908e = true;
                ylVar2.h = AndroidUtilities.dp(150.0f);
                ylVar2.q(8.0f);
                znVar.B1 = ylVar2;
                ylVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                znVar.X0.addView(znVar.B1, w7.x5.a(120.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
                u1Var.getLocationInWindow(iArr);
                znVar.C1 = u1Var.getTimeY() + iArr[1];
                znVar.B1.setTranslationY(((-ylVar.getTop()) - AndroidUtilities.dp(120.0f)) + znVar.C1);
                znVar.B1.m(0.0f, (u1Var.f23320pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + u1Var.f23350rb);
                znVar.B1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(znVar, 2));
            AndroidUtilities.runOnUIThread(new le(znVar, 2), 2000L);
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.o61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f31643a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.w11(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f31643a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.w11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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

    public static void o0(zn znVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.x61[] x61VarArr;
        if (znVar.F5 != 0) {
            znVar.getConnectionsManager().cancelRequest(znVar.F5, true);
            znVar.F5 = 0;
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
            if ((charSequence instanceof Spannable) && (x61VarArr = (org.telegram.ui.Components.x61[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.x61.class)) != null && x61VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.x61 x61Var : x61VarArr) {
                    arrayList.add(x61Var.getURL());
                }
            }
            if (arrayList != null && znVar.H5 != null && arrayList.size() == znVar.H5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) znVar.H5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            znVar.H5 = arrayList;
        } catch (Exception e7) {
            FileLog.e(e7);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new qf(znVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new qf(znVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (znVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new ve(znVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = znVar.G5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = znVar.f44847lb + 1;
            znVar.f44847lb = i11;
            kg kgVar = new kg(znVar, i11, getwebpagepreview, 0);
            if (znVar.f44859mb == null) {
                znVar.f44859mb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) znVar.f44859mb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                kgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            k6 k6Var = new k6(znVar, getwebpagepreview, kgVar, 1);
            if (znVar.F5 != 0) {
                znVar.getConnectionsManager().cancelRequest(znVar.F5, true);
            }
            znVar.F5 = znVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new ai.m0(6, znVar, k6Var));
            znVar.getConnectionsManager().bindRequestToGuid(znVar.F5, znVar.classGuid);
        }
    }

    public static void o1(long j3, zn znVar) {
        if (yh.n5.y(znVar.currentAccount, false).p().amount < j3) {
            new yh.e7(znVar.getParentActivity(), znVar.getResourceProvider(), j3, 13, DialogObject.getShortName(znVar.a()), new sg(znVar, 7), znVar.a()).show();
        } else {
            new yh.f7(znVar.getParentActivity(), znVar.resourceProvider).show();
        }
    }

    public static org.telegram.ui.Components.dp p0(zn znVar, Context context) {
        org.telegram.ui.Components.fp fpVar = new org.telegram.ui.Components.fp(context, znVar.currentAccount, znVar.f44788h0.getPopupLayout().getSwipeBack(), false, new tj(znVar), znVar.getResourceProvider());
        znVar.f44801i1 = fpVar;
        fpVar.d(znVar.T5, znVar.d(), null);
        return znVar.f44801i1.f26427f;
    }

    public static void p1(zn znVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != znVar.d()) {
            znVar.f44710ab = SystemClock.uptimeMillis();
            znVar.f44891p7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                znVar.Wa(znVar.d());
            } else if (znVar.d() == 0) {
                znVar.Wa(l4.longValue());
            } else {
                znVar.f44869n7 = -1;
            }
            znVar.getConnectionsManager().cancelRequestsForGuid(znVar.classGuid);
            znVar.getMessagesStorage().cancelTasksForGuid(znVar.classGuid);
            znVar.classGuid = ConnectionsManager.generateClassGuid();
            znVar.Ta();
            znVar.f44770f5 = null;
            znVar.f44956u7 = 0;
            znVar.f44832k7 = false;
            znVar.f44843l7 = true;
            znVar.f44794h6.clear();
            znVar.f44743d4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = znVar.getMessagesController().getTopicsController().findTopic(-znVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                znVar.f44829k4 = i12;
                znVar.l4 = findTopic.read_outbox_max_id;
                znVar.f44852m4 = Math.max(1, i12);
                znVar.getMessagesController().getTopicsController().getTopicRepliesCount(znVar.T5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                znVar.f44731c4 = null;
                znVar.f44703a4 = null;
                znVar.X3 = null;
                znVar.f44867n5 = null;
                znVar.f44829k4 = 0;
                znVar.l4 = 0;
                znVar.f44852m4 = 0;
                znVar.f44743d4 = 0L;
                znVar.f44757e4 = 0;
                znVar.f44769f4 = null;
                znVar.f44792h4 = false;
                znVar.f44781g4 = false;
            }
            znVar.v8();
            znVar.Rc(true);
            znVar.f44701a1.o(true);
            znVar.f44701a1.b();
            znVar.R1.setCurrentTopic(l4.longValue());
            znVar.Uc(true);
            znVar.lc(true);
            znVar.getMessagesController().setForumLastTopicId(-znVar.a(), znVar.d());
            znVar.l9(true);
            znVar.j9(true);
            ok okVar = znVar.Y;
            if (okVar != null) {
                okVar.k0(false);
                znVar.Y.E1(true);
            }
            znVar.D6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            znVar.l1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            znVar.f44849m1 = i11;
            znVar.Fc(false);
            znVar.Ec(false);
            znVar.Vc();
            rn rnVar = znVar.f44884oc;
            if (rnVar != null && znVar.actionBar.f21286n0) {
                rnVar.p(null);
            }
        }
    }

    public static void q0(zn znVar) {
        if (MessagesController.getInstance(znVar.currentAccount).isDialogMuted(znVar.T5, znVar.d())) {
            znVar.Tc(true);
            AndroidUtilities.runOnUIThread(new le(znVar, 7), 150L);
            znVar.f44788h0.M(null, null);
            if (znVar.getParentActivity() != null) {
                org.telegram.ui.Components.ad.z(znVar, 4, 0, znVar.f44762ea).j();
                return;
            }
            return;
        }
        View view = znVar.f44754e1.f21475j;
        if (view instanceof org.telegram.ui.ActionBar.e1) {
            ((org.telegram.ui.ActionBar.e1) view).b();
        }
    }

    public static void q1(zn znVar, String str) {
        if (MessagesController.getInstance(znVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            of.f.m(znVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.g5.n0(znVar.getParentActivity(), znVar.f44762ea, str, true, new jg(znVar, str, 1));
        }
    }

    public static void r0(zn znVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j3;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(znVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f20148id;
        long clientUserId = znVar.getUserConfig().getClientUserId();
        long j10 = znVar.T5;
        if (clientUserId == j10) {
            j3 = 0;
        } else {
            j3 = -j10;
        }
        Long valueOf = Long.valueOf(j3);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void s0(zn znVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f20073id = znVar.getMessagesController().getInputUser(znVar.f44764f);
            znVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new oe(znVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(znVar.getUserConfig().getCurrentUser(), znVar.T5, messageObject, znVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = znVar.H8();
        SendMessagesHelper.getInstance(znVar.currentAccount).sendMessage(of2);
        if (znVar.R3 == 0) {
            znVar.T9(false);
        }
        znVar.j9(false);
    }

    public static void s1(zn znVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(znVar.currentAccount).getInputUser(user.f20179id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(znVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new qh(znVar, tL_attachMenuBot, user, 0), 66);
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

    public static void t0(zn znVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, vf vfVar) {
        String str3;
        if (znVar.f44744d5 != null && i10 < arrayList.size() && znVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = znVar.f44744d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.d51.K(znVar.getParentActivity(), znVar, inputPeer, iArr[0], znVar.f44744d5.summarized, strArr[0], str3, charSequence, z10, vfVar, new sg(znVar, 13)).setDimBehind(false);
            znVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(znVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + znVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(znVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + znVar.a(), i11 - 1).apply();
                znVar.Uc(true);
            }
        }
    }

    public static void t1(zn znVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j3;
        rg.l1 l1Var = new rg.l1(znVar, znVar.currentAccount, user, null, null, znVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j3 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j3 = tL_emojiStatusCollectible.document_id;
            l1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(znVar.getParentActivity());
        org.telegram.ui.Components.q5 q5Var = new org.telegram.ui.Components.q5(AndroidUtilities.dp(160.0f), 4, y9Var, false);
        y9Var.setImageDrawable(q5Var);
        y9Var.addOnAttachStateChangeListener(new e5(q5Var, 1));
        q5Var.j(j3, false);
        l1Var.E0 = true;
        l1Var.B0 = y9Var;
        znVar.showDialog(l1Var);
    }

    public static void u0(zn znVar) {
        int i10;
        TLRPC.ChatFull chatFull = znVar.Z7;
        if (chatFull != null && !znVar.f44902q5) {
            TLRPC.Chat chat = znVar.f44752e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && znVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(znVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = znVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && znVar.visibleDialog == null && znVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = znVar.getParentActivity();
                    qe qeVar = new qe(znVar, 15);
                    qe qeVar2 = new qe(znVar, 16);
                    Pattern pattern = org.telegram.ui.Components.g5.f26605a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ai.l2(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.x5.a(-1.0f, -1.0f, -1.0f, -1.0f, -1.0f, -1, 0));
                    org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
                    a2Var.V = frameLayout;
                    a2Var.O0 = 0.3974359f;
                    a2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    a2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), qeVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), qeVar2);
                    znVar.showDialog(a2Var);
                }
            }
        }
    }

    public static void u1(zn znVar, String str) {
        if (MessagesController.getInstance(znVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            znVar.getParentActivity();
            of.f.n(str);
            return;
        }
        org.telegram.ui.Components.g5.n0(znVar.getParentActivity(), znVar.f44762ea, str, false, new jg(znVar, str, 0));
    }

    public static void v0(org.telegram.ui.zn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.v0(org.telegram.ui.zn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void w0(zn znVar) {
        if (znVar.R3 == 0 && znVar.getMessagesController().freezeUntilDate > znVar.getConnectionsManager().getCurrentTime() && !b.a(znVar.currentAccount, znVar.f44764f)) {
            b.c(znVar.getParentActivity(), znVar.currentAccount, znVar.getResourceProvider());
        }
    }

    public static void w1(zn znVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j3;
        int[] iArr3 = znVar.A6;
        int[] iArr4 = znVar.f45019z6;
        boolean[] zArr = znVar.E6;
        int[] iArr5 = znVar.f45007y6;
        int[] iArr6 = znVar.B6;
        boolean[] zArr2 = znVar.D6;
        ArrayList arrayList = znVar.f44794h6;
        if ((i10 - i11) - i12 <= i13 && !znVar.G6) {
            boolean[] zArr3 = znVar.C6;
            if (!zArr3[0]) {
                znVar.G6 = true;
                arrayList.add(Integer.valueOf(znVar.V5));
                if (znVar.f44916r6.size() != 0) {
                    MessagesController messagesController = znVar.getMessagesController();
                    j3 = 0;
                    long j10 = znVar.T5;
                    c10 = 0;
                    long j11 = znVar.L6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = znVar.classGuid;
                    int i17 = znVar.R3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j12 = znVar.f44743d4;
                    int i18 = znVar.f44852m4;
                    int i19 = znVar.V5;
                    znVar.V5 = i19 + 1;
                    messagesController.loadMessages(j10, j11, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j12, i18, i19, znVar.f44792h4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j3 = 0;
                    MessagesController messagesController2 = znVar.getMessagesController();
                    long j13 = znVar.T5;
                    long j14 = znVar.L6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = znVar.classGuid;
                    int i22 = znVar.R3;
                    long j15 = znVar.f44743d4;
                    int i23 = znVar.f44852m4;
                    int i24 = znVar.V5;
                    znVar.V5 = i24 + 1;
                    messagesController2.loadMessages(j13, j14, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j15, i23, i24, znVar.f44792h4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j3 = 0;
                if (znVar.L6 != 0 && !zArr3[1]) {
                    znVar.G6 = true;
                    arrayList.add(Integer.valueOf(znVar.V5));
                    MessagesController messagesController3 = znVar.getMessagesController();
                    long j16 = znVar.L6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = znVar.classGuid;
                    int i28 = znVar.R3;
                    long j17 = znVar.f44743d4;
                    int i29 = znVar.f44852m4;
                    int i30 = znVar.V5;
                    znVar.V5 = i30 + 1;
                    messagesController3.loadMessages(j16, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j17, i29, i30, znVar.f44792h4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j3 = 0;
        }
        if (i12 > 0 && !znVar.I7 && i11 <= 10) {
            if (znVar.L6 != j3 && !zArr[1]) {
                arrayList.add(Integer.valueOf(znVar.V5));
                MessagesController messagesController4 = znVar.getMessagesController();
                long j18 = znVar.L6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = znVar.classGuid;
                int i34 = znVar.R3;
                long j19 = znVar.f44743d4;
                int i35 = znVar.f44852m4;
                int i36 = znVar.V5;
                znVar.V5 = i36 + 1;
                messagesController4.loadMessages(j18, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j19, i35, i36, znVar.f44792h4);
                znVar.I7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(znVar.V5));
                MessagesController messagesController5 = znVar.getMessagesController();
                long j20 = znVar.T5;
                long j21 = znVar.L6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = znVar.classGuid;
                int i40 = znVar.R3;
                long j22 = znVar.f44743d4;
                int i41 = znVar.f44852m4;
                int i42 = znVar.V5;
                znVar.V5 = i42 + 1;
                messagesController5.loadMessages(j20, j21, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j22, i41, i42, znVar.f44792h4);
                znVar.I7 = true;
            }
        }
    }

    public static void x0(zn znVar) {
        if (!znVar.h7(znVar.Y.getSendButton())) {
            if (znVar.getMediaController().isPlayingMessage(znVar.f44744d5)) {
                znVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = znVar.getMessagesController().getInputPeer(znVar.T5);
            if (znVar.f44758e5 != null) {
                for (int i10 = 0; i10 < znVar.f44758e5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f20148id.add(Integer.valueOf(znVar.f44758e5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f20148id.add(Integer.valueOf(znVar.f44744d5.getId()));
            }
            ConnectionsManager.getInstance(znVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ai.v1(28, znVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void x1(zn znVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, vf vfVar) {
        if (znVar.f44744d5 != null && i10 < arrayList.size() && znVar.getParentActivity() != null) {
            org.telegram.ui.Components.d51.K(znVar.getParentActivity(), znVar, inputPeer, iArr[0], znVar.f44744d5.summarized, "und", str, charSequence, z10, vfVar, new qf(znVar, 15)).setDimBehind(false);
            znVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(znVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + znVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(znVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + znVar.a(), i11 - 1).apply();
                znVar.Uc(true);
            }
        }
    }

    public static void y0(zn znVar, View view, int i10) {
        org.telegram.ui.Components.b6 b6Var;
        TLRPC.User user;
        char c10;
        rk rkVar;
        rk rkVar2;
        if (i10 != 0) {
            gg.j1 adapter = znVar.I1.getAdapter();
            if (adapter.f10693w0 != null && !adapter.f10675h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = znVar.I1.getAdapter().J(i11);
            int i12 = znVar.I1.getAdapter().X;
            int i13 = znVar.I1.getAdapter().Y;
            if (znVar.I1.getAdapter().F != null && i11 == 1) {
                znVar.Y.M0(i12, i13, znVar.I1.getAdapter().F + "@" + ChatObject.getPublicUsername(znVar.f44752e) + " ", false);
            } else if (znVar.I1.getAdapter().F != null && i11 == 0) {
                znVar.Y.M0(i12, i13, a1.g.t(new StringBuilder(), znVar.I1.getAdapter().F, " "), false);
            } else if (J instanceof hg.b2) {
                if (!znVar.getUserConfig().isPremium()) {
                    znVar.showDialog(new rg.y0(znVar, znVar.getParentActivity(), znVar.currentAccount, true, 31, false, null));
                    return;
                }
                hg.b2 b2Var = (hg.b2) J;
                org.telegram.ui.Components.g5.Z(znVar.currentAccount, Math.max(1, b2Var.a()), znVar.T5, new oc(2, znVar, b2Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (znVar.R3 != 0 || !znVar.h7(view)) {
                        if (view instanceof org.telegram.ui.Cells.d8) {
                            sendAnimationData = ((org.telegram.ui.Cells.d8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.g5.Z(znVar.currentAccount, 1, znVar.a(), new sa(znVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), znVar.I1.getAdapter().L(i11), sendAnimationData, 1));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (znVar.f44865n3 && (rkVar2 = znVar.R2) != null && rkVar2.getVisibility() == 0) {
                        znVar.db(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        znVar.Y.M0(i12, i13, a1.g.q("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (znVar.f44865n3 && (rkVar = znVar.R2) != null && rkVar.getVisibility() == 0) {
                        znVar.db(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        znVar.Y.M0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(sc.v.v(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.y61("" + user2.f20179id, 3, null), 0, spannableString.length(), 33);
                        znVar.Y.M0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof gg.g1) {
                    if (znVar.I1.getAdapter().J != null && znVar.R3 != 1) {
                        gg.g1 g1Var = (gg.g1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(g1Var.f10611a, znVar.T5, znVar.f44867n5, znVar.X3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = znVar.H8();
                        of2.ephemeralReceiverBotId = g1Var.f10612b;
                        of2.monoForumPeer = znVar.S8();
                        of2.suggestionParams = znVar.f44782g5;
                        znVar.getSendMessagesHelper().sendMessage(of2);
                        znVar.Y.setFieldText("");
                        znVar.j9(false);
                    }
                } else if (J instanceof String) {
                    if (znVar.I1.getAdapter().J != null) {
                        if (znVar.R3 == 1) {
                            org.telegram.ui.Components.g5.L(znVar.getParentActivity(), znVar.T5, new m4.v0(9, znVar, (String) J), znVar.f44762ea);
                            return;
                        } else if (!znVar.h7(view)) {
                            org.telegram.ui.Components.g5.Z(znVar.currentAccount, 1, znVar.T5, new oc(3, znVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    znVar.Y.M0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (znVar.Y.getFieldText() != null) {
                        if (znVar.R3 == 1 || !znVar.h7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (znVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(znVar.getParentActivity(), 0, znVar.f44762ea);
                                    alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    znVar.showDialog(alertDialog$Builder.f20368a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(znVar.I1.getAdapter().R);
                                znVar.Ia = arrayList;
                                PhotoViewer.t1().K2(null, znVar, znVar.f44762ea);
                                PhotoViewer.t1().g2(arrayList, znVar.I1.getAdapter().M(i11), 3, false, znVar.Ja, znVar);
                                return;
                            }
                            org.telegram.ui.Components.g5.Z(znVar.currentAccount, 1, znVar.a(), new oc(4, znVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    org.telegram.ui.ActionBar.a6 a6Var = new org.telegram.ui.ActionBar.a6(28, znVar, (TLRPC.TL_inlineBotWebView) J);
                    if (znVar.f44823jb) {
                        a6Var.run();
                    } else {
                        mj1.a(znVar.getParentActivity(), new oc(6, znVar, a6Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    gk gkVar = znVar.I1;
                    if (gkVar != null && (user = gkVar.getAdapter().f10693w0) != null) {
                        znVar.Y.setFieldText("");
                        long j3 = znVar.T5;
                        if (j3 == user.f20179id) {
                            znVar.f44772f8 = j3;
                            znVar.getMessagesController().sendBotStart(znVar.f44764f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f20179id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", znVar.T5);
                        if (znVar.getMessagesController().checkCanOpenChat(bundle, znVar)) {
                            znVar.presentFragment(new zn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    ok okVar = znVar.Y;
                    okVar.S();
                    okVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            znVar.Y.M0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = znVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e7) {
                                FileLog.e((Throwable) e7, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.s5.f(znVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                b6Var = new org.telegram.ui.Components.b6(f7, fontMetricsInt);
                            } else {
                                b6Var = new org.telegram.ui.Components.b6(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(b6Var, 0, spannableString2.length(), 33);
                            znVar.Y.M0(i12, i13, spannableString2, false);
                            znVar.I1.o(false);
                        }
                    }
                    znVar.Y.M0(i12, i13, str, true);
                    znVar.I1.o(false);
                }
            }
        }
    }

    public static void y1(zn znVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = znVar.f44867n5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = znVar.f44883ob;
            if (i10 == 5) {
                int i11 = znVar.currentAccount;
                long j3 = znVar.T5;
                MessageSuggestionParams messageSuggestionParams = znVar.f44782g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new yh.c0(context, i11, j3, messageSuggestionParams, znVar, znVar.getResourceProvider(), 0, new bf(znVar, 4)).show();
            } else if (i10 == 1 && (messageObject = znVar.p5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = znVar.f44782g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    znVar.Xb(messageSuggestionParams2);
                } else if (znVar.p5.canEditMedia() && znVar.f44878o5 == 0) {
                    if (znVar.J1 == null) {
                        znVar.H7();
                    }
                    znVar.J1.L1(znVar.p5, -1);
                    znVar.ca();
                } else {
                    znVar.F(znVar.p5.getId(), 0, 0, 0, true, true);
                }
            } else if (znVar.f44770f5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(znVar.T5) && !znVar.f44770f5.hasSecretMessages && znVar.R3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        znVar.ha(0);
                        return;
                    }
                    MessageObject messageObject3 = znVar.f44867n5;
                    if (messageObject3 != null) {
                        znVar.F(messageObject3.getId(), 0, 0, 0, true, true);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    znVar.ha(1);
                } else if (i10 == 4) {
                    znVar.ha(2);
                }
            }
        }
    }

    public static void z0(zn znVar, long j3, boolean z10) {
        if (!znVar.H4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(znVar.currentAccount).edit();
            edit.putInt("pin_" + znVar.T5, ((Integer) znVar.H4.get(0)).intValue()).commit();
            znVar.H4.clear();
            znVar.J4.clear();
            znVar.L4 = 0;
            znVar.P4 = 0;
            znVar.Q4 = 0;
            znVar.Cc(0, true);
        }
        if (ChatObject.isMonoForum(znVar.f44752e) && ChatObject.canManageMonoForum(znVar.currentAccount, znVar.f44752e)) {
            if (j3 != 0) {
                znVar.getMessagesStorage().removeTopic(-znVar.f44752e.f20032id, j3);
                znVar.getMessagesController().deleteSavedDialog(j3, znVar.getMessagesController().getInputPeer(-znVar.f44752e.f20032id));
                znVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(znVar.f44752e.f20032id, j3);
            }
        } else {
            znVar.getMessagesController().deleteDialog(znVar.T5, 1, z10);
            znVar.getMessagesStorage().removeAllTopics(znVar.T5);
            znVar.getMessagesController().getTopicsController().reloadTopics(-znVar.T5);
        }
        znVar.M5.put(j3, 0);
        org.telegram.ui.Components.e41 e41Var = znVar.R1;
        if (e41Var != null) {
            e41Var.setAllTopicsHidden(false);
        }
        if (j3 == znVar.f44743d4) {
            znVar.B7(false, null);
            znVar.A0.O(false);
        }
    }

    public static void z1(zn znVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        zn znVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        hh.a aVar = znVar.Qb;
        if (num.intValue() != znVar.d()) {
            znVar.nc = false;
            kf kfVar = znVar.Nb;
            if (kfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(kfVar);
                znVar.Nb.run();
                znVar.Nb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.e41 e41Var = znVar.R1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(e41Var.f25842b).getTopicsController().getTopics(-e41Var.f25844c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f20084id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = znVar.getMessagesController().getTopicsController().findTopic(-znVar.a(), tL_forumTopic.f20084id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                znVar.f44710ab = SystemClock.uptimeMillis();
                znVar.f44891p7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    znVar.Wa(znVar.d());
                } else if (znVar.d() == 0) {
                    znVar.Wa(num.intValue());
                } else {
                    znVar.f44869n7 = -1;
                }
                znVar.getConnectionsManager().cancelRequestsForGuid(znVar.classGuid);
                znVar.getMessagesStorage().cancelTasksForGuid(znVar.classGuid);
                znVar.classGuid = ConnectionsManager.generateClassGuid();
                znVar.Ta();
                znVar.f44770f5 = null;
                znVar.f44956u7 = 0;
                znVar.f44832k7 = false;
                znVar.f44843l7 = true;
                znVar.f44794h6.clear();
                znVar.f44726c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(znVar.getCurrentAccount(), message, false, false));
                    znVar2 = znVar;
                    znVar2.tb(arrayList, znVar.f44752e, tL_forumTopic2.f20084id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    znVar2 = znVar;
                    znVar2.f44731c4 = null;
                    znVar2.f44703a4 = null;
                    znVar2.X3 = null;
                    znVar2.f44867n5 = null;
                    znVar2.f44829k4 = 0;
                    znVar2.l4 = 0;
                    znVar2.f44852m4 = 0;
                    znVar2.f44743d4 = 0L;
                    znVar2.f44757e4 = 0;
                    znVar2.f44769f4 = null;
                    znVar2.f44792h4 = false;
                    znVar2.f44781g4 = false;
                }
                mm mmVar = znVar2.A0;
                if (mmVar != null) {
                    if (mmVar.I >= 0 && !mmVar.N()) {
                        mm mmVar2 = znVar2.A0;
                        mmVar2.u(mmVar2.I);
                    } else {
                        mm mmVar3 = znVar2.A0;
                        if (mmVar3.I < 0 && mmVar3.N()) {
                            znVar2.A0.o(0);
                        }
                    }
                    znVar2.A0.T();
                }
                znVar2.v8();
                znVar2.Rc(true);
                znVar2.f44701a1.o(true);
                if (tL_forumTopic2 != null) {
                    znVar2.Xc();
                } else {
                    znVar2.f44701a1.b();
                }
                znVar2.R1.setCurrentTopic(znVar2.d());
                znVar2.Uc(true);
                znVar2.lc(true);
                znVar2.getMessagesController().setForumLastTopicId(-znVar2.a(), znVar2.d());
                znVar2.Ia();
                znVar2.k9(true);
                znVar2.j9(true);
                znVar2.D6(true, true);
                if (znVar2.Y != null) {
                    if (!UserObject.isBotForum(znVar2.f44764f)) {
                        znVar2.Y.k0(false);
                    }
                    znVar2.Y.E1(true);
                }
                if (tL_forumTopic2 != null) {
                    znVar2.getMessagesController().getTopicsController().getTopicRepliesCount(znVar2.T5, tL_forumTopic2.f20084id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                znVar2.l1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                znVar2.f44849m1 = i11;
                znVar2.Fc(false);
                znVar2.Ec(false);
                znVar2.Vc();
                rn rnVar = znVar2.f44884oc;
                if (rnVar != null && znVar2.actionBar.f21286n0) {
                    rnVar.p(null);
                }
                if (UserObject.isBotForum(znVar2.f44764f)) {
                    znVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(znVar2.T5, num.intValue()), true);
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
    public final void A(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            qh.c cVar = this.Cc;
            if (cVar != null) {
                this.X0.removeView(cVar);
                this.Cc = null;
            }
            ok okVar = this.Y;
            if (okVar != null) {
                okVar.F0();
            }
        }
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
        int i32 = this.f44719b6;
        if (messageObject != null) {
            ArrayList arrayList = this.f44703a4;
            if (arrayList == null || !arrayList.contains(messageObject) || K9()) {
                if (messageObject.getDialogId() == this.T5) {
                    c13 = 0;
                } else {
                    c13 = 1;
                }
                if (z10 && messageObject.getGroupId() != 0) {
                    MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f44995x6.f(messageObject.getGroupId());
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
                        if (messageObject.canEditMessage(this.f44752e)) {
                            this.f44745d6--;
                        }
                        if (this.R3 == 1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (!messageObject.canDeleteMessage(z21, this.f44752e)) {
                            this.f44705a6--;
                        }
                        boolean D9 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D9) {
                            this.f44719b6--;
                        } else {
                            this.f44733c6--;
                        }
                        if (messageObject.isMusic() && !D9) {
                            this.f44771f6--;
                        } else if (messageObject.isDocument() && !D9) {
                            this.f44783g6--;
                        } else {
                            this.f44759e6--;
                        }
                    }
                } else if (this.W5[1].size() + this.W5[0].size() >= 100) {
                    AndroidUtilities.shakeView(this.f44714b1);
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
                        if (messageObject.canEditMessage(this.f44752e)) {
                            this.f44745d6++;
                        }
                        if (this.R3 == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (!messageObject.canDeleteMessage(z20, this.f44752e)) {
                            this.f44705a6++;
                        }
                        boolean D92 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D92) {
                            this.f44719b6++;
                        } else {
                            this.f44733c6++;
                        }
                        if (messageObject.isMusic() && !D92) {
                            this.f44771f6++;
                        } else if (!messageObject.isDocument() || messageObject.isRoundOnce() || messageObject.isVoiceOnce() || D92) {
                            this.f44759e6++;
                        } else {
                            this.f44783g6++;
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
        if (z11 && this.actionBar.t() && !F9()) {
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
                if ((i32 == 0 && this.f44719b6 != 0) || (i32 != 0 && this.f44719b6 == 0)) {
                    this.T4 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (k14 != null) {
                        if (this.f44719b6 != 0 && !z12) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        k14.setEnabled(z19);
                        Property property = View.ALPHA;
                        if (this.f44719b6 == 0) {
                            f10 = 1.0f;
                        }
                        arrayList2.add(ObjectAnimator.ofFloat(k14, property, f10));
                        if (z12 && k14.getBackground() != null) {
                            k14.setBackground(null);
                        } else if (k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21191z8), 5, -1));
                        }
                    }
                    jh.c cVar = this.P0;
                    if (cVar != null) {
                        if (this.f44719b6 != 0 && !z12) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        ci.u5 u5Var = cVar.f14175c;
                        ((me.b) u5Var.d).a(z18, true);
                        ((ih.a) u5Var.f6064a).setEnabled(z18);
                    }
                    this.T4.playTogether(arrayList2);
                    c10 = 1;
                    i10 = size;
                    this.T4.setDuration(100L);
                    this.T4.addListener(new xi(this, 9));
                    this.T4.start();
                } else {
                    c10 = 1;
                    i10 = size;
                    if (k14 != null) {
                        if (this.f44719b6 != 0 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        k14.setEnabled(z14);
                        if (this.f44719b6 == 0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        k14.setAlpha(f7);
                        if (!z12 && k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21191z8), 3, -1));
                        }
                    }
                    jh.c cVar2 = this.P0;
                    if (cVar2 != null) {
                        if (this.f44719b6 != 0 && !z12) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        ci.u5 u5Var2 = cVar2.f14175c;
                        ((me.b) u5Var2.d).a(z13, false);
                        ((ih.a) u5Var2.f6064a).setEnabled(z13);
                    }
                }
                if (k10 != null) {
                    int i36 = this.f44771f6;
                    if (((i36 > 0 && this.f44783g6 == 0) || (i36 == 0 && this.f44783g6 > 0)) && this.f44759e6 == 0) {
                        i30 = 0;
                    } else {
                        i30 = 8;
                    }
                    k10.setVisibility(i30);
                    if (this.f44771f6 > 0) {
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
                    if (this.f44705a6 == 0) {
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
                if (this.f44745d6 == 1 && i11 == 1) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                if (this.P0 != null) {
                    sk skVar = this.O0;
                    if ((skVar != null && skVar.getVisibility() == 0 && !this.I0) || ((chat = this.f44752e) != null && ((ChatObject.isNotInChat(chat) && !K9()) || ((ChatObject.isChannel(this.f44752e) && !ChatObject.canPost(this.f44752e) && !this.f44752e.megagroup) || !ChatObject.canSendMessages(this.f44752e))))) {
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
                                if (ChatObject.isForum(this.f44752e) && !I6(messageObject4)) {
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
                        long j3 = 0;
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
                                    if (groupId == 0 || (j3 != 0 && j3 != groupId)) {
                                        break;
                                    }
                                    i25 = i40;
                                    if (ChatObject.isForum(this.f44752e) && !I6(messageObject5)) {
                                        break;
                                    }
                                    i41++;
                                    k10 = u0Var;
                                    j3 = groupId;
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
                    if (this.f44703a4 != null && c11 == 0) {
                        z15 = 0;
                        int size4 = this.W5[0].size();
                        for (int i42 = 0; i42 < size4; i42++) {
                            if (this.f44703a4.contains((MessageObject) this.W5[0].valueAt(i42))) {
                                c11 = '\b';
                            }
                        }
                    } else {
                        z15 = 0;
                    }
                    jh.c cVar3 = this.P0;
                    if (c11 == 0) {
                        z17 = true;
                    } else {
                        z17 = z15;
                    }
                    i14 = 1;
                    ((me.b) cVar3.f14174b.f6066c).a(z17, true);
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
        this.f44955u6.clear();
        this.f44916r6.clear();
        this.f44930s6.clear();
        this.f44794h6.clear();
        this.f44995x6.b();
        this.f44804i4 = false;
        mm mmVar = this.A0;
        if (mmVar != null) {
            if (mmVar.f39970w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Tb(z11);
        }
        wj wjVar = this.f44989x0;
        if (wjVar != null) {
            wjVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f44879o6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f45019z6;
            int[] iArr2 = this.f45007y6;
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
        this.f44956u7 = 0;
        this.f44944t7 = false;
        this.K6 = 0;
        this.J7 = null;
        this.D7 = 0;
        this.E7 = false;
        this.A7 = false;
        mm mmVar2 = this.A0;
        if (mmVar2 != null && !mmVar2.N) {
            mmVar2.O(false);
        }
    }

    public final TLRPC.ChatFull A8() {
        return this.Z7;
    }

    public final boolean A9() {
        if (!ChatObject.isForum(this.f44752e) || this.f44792h4) {
            if (ChatObject.isMonoForum(this.f44752e) && d() == 0 && !this.T3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Aa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Aa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Ab(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new nf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        showDialog(a2Var);
        TextView textView = (TextView) a2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21026q7));
        }
    }

    public final void Ac() {
        jh.h hVar = this.f44814j1;
        rj rjVar = this.v;
        if (hVar != null) {
            this.f44814j1.setTranslationY((((-rjVar.d()) - this.S.getInputBubbleHeight()) - b9(org.telegram.ui.Components.a41.f24434c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f44740d1 != null) {
            this.f44740d1.setTranslationY((-rjVar.d()) - AndroidUtilities.dp(16.0f));
        }
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.f44752e)) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f44699a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new mg.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new sg(this, 15)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new sg(this, 16)));
        }
        if (this.f44764f == null) {
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new s0("", 1)));
            arrayList.add(new mg.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.d2(this)));
        }
        return arrayList;
    }

    public final void B6() {
        this.f44782g5 = null;
        if (this.f44743d4 == 0 || this.f44792h4) {
            if (this.f44792h4) {
                this.f44867n5 = this.X3;
            } else {
                this.f44867n5 = null;
            }
            this.f44841l5 = null;
            ok okVar = this.Y;
            if (okVar != null) {
                okVar.j1(null, null, null);
            }
        }
        j9(false);
        if (this.R3 == 0) {
            getMediaDataController().cleanDraft(this.T5, this.f44743d4, true);
        }
    }

    public final void B7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f45019z6;
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
            mm mmVar = this.A0;
            if (mmVar != null && mmVar.F < 0) {
                mmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f44818j6 = i12;
            this.f44842l6 = dialog2.unread_mentions_count;
            if (this.f44831k6 != i12) {
                jh.h hVar = this.f44814j1;
                if (hVar != null) {
                    hVar.c(1, i12, this.N5);
                }
                this.f44831k6 = this.f44818j6;
                zc();
            }
            int i13 = this.f44842l6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f44842l6 = i14;
                if (i14 <= 0) {
                    this.f44842l6 = 0;
                    this.f44854m6 = true;
                    Ob(false);
                } else {
                    jh.h hVar2 = this.f44814j1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Ob(true);
                }
            }
            d7(false);
            return;
        }
        this.f44955u6.clear();
        this.f44794h6.clear();
        this.f44916r6.clear();
        this.f44930s6.clear();
        this.f44995x6.b();
        this.f44804i4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f44879o6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f45007y6;
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
        if (this.f44844l8 != null) {
            this.f44844l8 = null;
            ok okVar = this.Y;
            if (okVar != null) {
                okVar.X0(null, true, false);
            }
        }
        if (this.P != null) {
            Tb(false);
            J7(false);
            this.f44989x0.setEmptyView(this.Q0);
        }
        mm mmVar2 = this.A0;
        if (mmVar2 != null) {
            mmVar2.O(false);
        }
        if (this.h == null && (user = this.f44764f) != null && user.bot && this.f44760e8 == null) {
            this.f44760e8 = "";
            lc(false);
        }
    }

    public final TLRPC.UserFull B8() {
        return this.f44707a8;
    }

    public final boolean B9() {
        return UserObject.isBotForum(this.f44764f);
    }

    public final void Ba(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        org.telegram.ui.Components.v11 v11Var;
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
                    of.f.q(getParentActivity(), Uri.parse(str), true, true, P9(u1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f44772f8 == 0) {
                        z12 = true;
                    }
                    of.f.q(parentActivity, parse, z12, true, P9(u1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f44772f8 == 0) {
                        z12 = true;
                    }
                    of.f.q(parentActivity2, parse2, z12, true, P9(u1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.q0(this, str, true, true, false, false, P9(u1Var, characterStyle), null, this.f44762ea);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.x61) && (v11Var = ((org.telegram.ui.Components.x61) characterStyle).f32838a) != null && (v11Var.f31643a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f44762ea);
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
        if (characterStyle instanceof org.telegram.ui.Components.x61) {
            z12 = true;
        }
        org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f44762ea);
    }

    public final void Bb() {
        TLRPC.Chat chat = this.f44752e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.f44752e)) {
                    q60 q60Var = new q60(a());
                    q60Var.f36020l0 = this;
                    presentFragment(q60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.f44752e)) {
                ad adVar = new ad(a());
                adVar.f36020l0 = this;
                presentFragment(adVar);
                return;
            } else {
                return;
            }
        }
        this.f44723ba = new org.telegram.ui.Components.cq(this, this.f44762ea);
        this.f44989x0.setOnInterceptTouchListener(new ig(0));
        nb(this.X0, false);
        showDialog(this.f44723ba, new pe(this, 1));
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
        if ((!K9() || this.f44792h4) && this.L2 != null) {
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
                    this.M2.setInterpolator(org.telegram.ui.Components.is.h);
                    this.M2.setDuration(360L);
                    this.M2.addListener(new zl(this, z14, z15, z16));
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
            if (this.f45015z2 != null) {
                if (K9() && !this.f44792h4) {
                    boolean z18 = z17;
                    this.f45015z2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.f45015z2.c((this.H4.size() - 1) - Collections.binarySearch(this.H4, Integer.valueOf(this.L4), Comparator$CC.reverseOrder()), this.H4.size(), z11);
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44762ea);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        a2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            a2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            a2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(a2Var);
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
        mm mmVar = this.A0;
        if (mmVar != null) {
            return mmVar.P;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Ca(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void Cb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.pn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Cb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.pn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void Cc(int r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Cc(int, boolean):void");
    }

    public final void D6(boolean z10, boolean z11) {
        long j3;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        pn pnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i10;
        pn pnVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j11;
        org.telegram.ui.Components.v11 v11Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.b6 b6Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j12;
        Long l10;
        if (this.Y != null) {
            int i11 = this.R3;
            char c10 = '\b';
            if (i11 == 0 || i11 == 8 || (i11 == 3 && getUserConfig().getClientUserId() == N8())) {
                long j13 = 0;
                if (this.R3 == 8) {
                    if (ChatObject.isMonoForum(this.f44752e)) {
                        if (this.f44743d4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.f44752e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.v11 v11Var2 = null;
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
                    long j14 = this.T5;
                    if (this.R3 == 3) {
                        j3 = 0;
                    } else {
                        j3 = this.f44743d4;
                    }
                    draft = mediaDataController.getDraft(j14, j3);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                ok okVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                okVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.T5, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j15 = this.T5;
                    if (l4 != null) {
                        j12 = l4.longValue();
                    } else {
                        j12 = this.f44743d4;
                    }
                    message = mediaDataController2.getDraftMessage(j15, j12);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.R3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.f44711ac >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        j9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.f44711ac = draftMessage3.date;
                    ok okVar2 = this.Y;
                    okVar2.X2 = null;
                    okVar2.Y2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i12 = 0;
                        while (i12 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i12);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
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
                                v11Var = null;
                                org.telegram.ui.Components.y61 y61Var = new org.telegram.ui.Components.y61(a1.g.p(j11, ""), 3, null);
                                int i13 = messageEntity.offset;
                                valueOf.setSpan(y61Var, i13, messageEntity.length + i13, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f31643a |= 4;
                                    org.telegram.ui.Components.w11 w11Var = new org.telegram.ui.Components.w11(obj, 0);
                                    int i14 = messageEntity.offset;
                                    MediaDataController.addStyleToText(w11Var, i14, messageEntity.length + i14, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f31643a |= 1;
                                        org.telegram.ui.Components.w11 w11Var2 = new org.telegram.ui.Components.w11(obj2, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(w11Var2, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f31643a |= 2;
                                        org.telegram.ui.Components.w11 w11Var3 = new org.telegram.ui.Components.w11(obj3, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(w11Var3, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f31643a |= 8;
                                        org.telegram.ui.Components.w11 w11Var4 = new org.telegram.ui.Components.w11(obj4, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(w11Var4, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f31643a |= 16;
                                        org.telegram.ui.Components.w11 w11Var5 = new org.telegram.ui.Components.w11(obj5, 0);
                                        int i18 = messageEntity.offset;
                                        MediaDataController.addStyleToText(w11Var5, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.x61 x61Var = new org.telegram.ui.Components.x61(messageEntity.url, v11Var2);
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(x61Var, i19, messageEntity.length + i19, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f31643a |= 256;
                                        org.telegram.ui.Components.w11 w11Var6 = new org.telegram.ui.Components.w11(obj6, 0);
                                        int i20 = messageEntity.offset;
                                        MediaDataController.addStyleToText(w11Var6, i20, messageEntity.length + i20, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i21 = messageEntity.offset;
                                        org.telegram.ui.Components.zj0.c(valueOf, i21, messageEntity.length + i21, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e7) {
                                            FileLog.e((Throwable) e7, false);
                                            fontMetricsInt = v11Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            b6Var = new org.telegram.ui.Components.b6(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            b6Var = new org.telegram.ui.Components.b6(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i22 = messageEntity.offset;
                                        valueOf.setSpan(b6Var, i22, messageEntity.length + i22, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        v11Var = v11Var2;
                                    }
                                    v11Var = v11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                v11Var = null;
                            }
                            i12++;
                            v11Var2 = v11Var;
                            c10 = c11;
                            j13 = j16;
                            draftMessage3 = draftMessage2;
                        }
                        j10 = j13;
                        pnVar = v11Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j10 = 0;
                        pnVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.Y.d1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Y.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new le(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f44782g5 = of2;
                        Hb(of2);
                    }
                    messageObject = this.f44867n5;
                    if (messageObject != null || this.X3 == messageObject) {
                        if (message == null && ((messageObject2 = this.X3) == null || messageObject2.getId() != message.f20053id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f44867n5 = messageObject3;
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
                                        pnVar2 = pnVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        pnVar2 = new pn(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f44841l5 = pnVar2;
                                }
                            }
                            Y6(false);
                            pn pnVar3 = this.f44841l5;
                            if (pnVar3 != null) {
                                Gb(this.f44867n5, pnVar3);
                            } else {
                                Fb(this.f44867n5);
                            }
                            lc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j10 && this.f44752e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.f44752e.f20032id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f44867n5 = messageObject4;
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
                j10 = 0;
                pnVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f44782g5 = of22;
                    Hb(of22);
                }
                messageObject = this.f44867n5;
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
            ValueAnimator valueAnimator = this.f44725bc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f44725bc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f44725bc = ofFloat;
            ofFloat.addUpdateListener(new ne(this, 0));
            this.f44725bc.setDuration(150L);
            this.f44725bc.start();
        }
    }

    public final MessageObject.GroupedMessages D8(long j3) {
        return (MessageObject.GroupedMessages) this.f44995x6.f(j3);
    }

    public final boolean D9() {
        if (this.f44752e != null) {
            return getMessagesController().isChatNoForwards(this.f44752e);
        }
        return getMessagesController().isUserNoForwards(this.f44707a8);
    }

    public final void Da(java.util.ArrayList r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Da(java.util.ArrayList, boolean):void");
    }

    public final void Db(boolean z10, MessageObject messageObject, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        Cb(z10, messageObject, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void Dc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f44792h4 && !this.J4.isEmpty() && this.H4.size() == 1 && ((Integer) this.H4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.J4.get(this.H4.get(0));
        } else {
            messageObject = null;
        }
        this.Y3 = messageObject;
        if (this.f44792h4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f44731c4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.f44752e, this.Y3.messageOwner.from_id)) {
            this.Y3 = null;
        }
    }

    public final int E6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f44989x0.getHeight();
        int i11 = 0;
        long j3 = 0;
        while (true) {
            View U0 = this.f44989x0.U0(i10);
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

    public final long E7(MessageObject messageObject) {
        if (this.R3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.f44752e) && !this.f44792h4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f20084id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.f44752e));
        }
        return this.f44743d4;
    }

    public final float E8() {
        zn znVar = this.f44749da;
        if (znVar == null) {
            znVar = this;
        }
        lk lkVar = znVar.f44886p1;
        if (lkVar == null) {
            return 0.0f;
        }
        return lkVar.f27717b;
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
            } catch (Exception e7) {
                FileLog.e(e7);
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
                if (ChatObject.isChannel(this.f44752e) && (tL_chatBannedRights = this.f44752e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                jq0 jq0Var = new jq0(0, z10, true, this);
                if (this.R3 == 9) {
                    jq0Var.G = 1;
                    jq0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.f44752e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f44752e.slowmode_enabled) {
                        jq0Var.G = 10;
                        jq0Var.H = true;
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
                        jq0Var.G = i11;
                        jq0Var.H = z11;
                    }
                }
                jq0Var.V = new sl(this);
                presentFragment(jq0Var);
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
                } catch (Exception e10) {
                    FileLog.e(e10);
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
        if (this.f44849m1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44814j1.e(4, z11, z10);
        this.f44814j1.c(4, this.f44849m1, z10);
    }

    @Override
    public final void F(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        bb(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final float F6(boolean z10) {
        float f7;
        float f10;
        float f11;
        ok okVar = this.Y;
        float f12 = 0.0f;
        if (okVar != null) {
            if (z10) {
                f7 = okVar.f23911k5;
            } else {
                f7 = okVar.f23905j5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        me.b bVar = this.f44987wc;
        j6.l lVar = this.Bc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f14060a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f14060a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f16366f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f14061b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.f16365e;
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
        if (this.f44845l9 == null) {
            this.f44845l9 = new org.telegram.ui.Cells.u1(getParentActivity(), this.currentAccount, true, this.Ca, this.f44762ea);
        }
        org.telegram.ui.Cells.u1 u1Var = this.f44845l9;
        if (this.f44752e == null && !UserObject.isUserSelf(this.f44764f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1Var.N7 = z11;
        org.telegram.ui.Cells.u1 u1Var2 = this.f44845l9;
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
        TLRPC.User user = this.f44764f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        u1Var2.R7 = z14;
        if (ChatObject.isChannel(this.f44752e) && this.f44752e.megagroup) {
            z15 = true;
        }
        u1Var2.S7 = z15;
        this.f44845l9.E8 = y9();
        this.f44845l9.F8 = H9();
        this.f44845l9.G8 = G9();
        return this.f44845l9.g1(messageObject, (MessageObject.GroupedMessages) this.f44995x6.f(messageObject.getGroupId()), z10);
    }

    public final boolean F9() {
        return !TextUtils.isEmpty(this.U3);
    }

    public final void Fa(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Fa(int):void");
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
        this.f44814j1.e(3, z11, z10);
        this.f44814j1.c(3, this.l1, z10);
    }

    @Override
    public final boolean G() {
        return this.f44808i8;
    }

    public final boolean G6() {
        if (!E9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f44792h4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                sk skVar = this.O0;
                if (skVar == null || skVar.getVisibility() != 0) {
                    if (!K9() || this.f44792h4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.G7():void");
    }

    public final boolean G9() {
        org.telegram.ui.Components.e41 e41Var = this.R1;
        if (e41Var != null && e41Var.Q && e41Var.f25840a.f16366f) {
            return true;
        }
        return false;
    }

    public final boolean Ga(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f44772f8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f44764f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f44772f8 == this.T5) {
                this.f44772f8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f44772f8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((m2Var instanceof zn) && ((zn) m2Var).T5 == this.f44772f8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f44772f8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f44772f8));
                } else if (DialogObject.isUserDialog(this.f44772f8)) {
                    bundle.putLong("user_id", this.f44772f8);
                } else {
                    bundle.putLong("chat_id", -this.f44772f8);
                }
                y6();
                presentFragment(new zn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Gb(MessageObject messageObject, pn pnVar) {
        Cb(true, messageObject, null, null, null, true, 0, pnVar, false, 0L, null, true);
    }

    public final void Gc(boolean z10) {
        String string;
        if (this.R3 != 3 && !UserObject.isBotForum(this.f44764f)) {
            qj qjVar = this.f44701a1;
            if (qjVar != null && this.f44743d4 != 0) {
                if (this.f44792h4) {
                    Wc();
                } else if (this.f44781g4) {
                    MessageObject messageObject = this.X3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f44701a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f44701a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.X3;
                    if (messageObject2 != null) {
                        qjVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f44717b4 != null) {
                if (this.X3.getRepliesCount() == 0) {
                    if (this.f44781g4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f44717b4;
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
            sk skVar = this.O0;
            if (skVar == null || skVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H7() {
        if (getParentActivity() != null && getParentActivity() != null && this.J1 == null) {
            ai.h4 h4Var = new ai.h4(this, getParentActivity(), this, this.f44762ea, 2);
            this.J1 = h4Var;
            h4Var.Z = a();
            ai.h4 h4Var2 = this.J1;
            h4Var2.f33225i0 = true;
            h4Var2.f33207c2 = new ql(this);
        }
    }

    public final SendMessageChatArguments H8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.R3 == 9) {
            builder.setWelcomeMessageChatId(this.ta);
        }
        if (this.R3 == 5) {
            builder.setQuickReplyShortcut(this.Q3, M8());
        }
        return builder.build();
    }

    public final boolean H9() {
        if (this.R1 == null) {
            if (this.T3 || !ChatObject.isMonoForum(this.f44752e)) {
                if (!ChatObject.isForum(this.f44752e) || !ChatObject.areTabsEnabled(this.f44752e)) {
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
        tL_message.f20053id = 0;
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
            MessageObject messageObject3 = (MessageObject) this.f44879o6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                mm mmVar = this.A0;
                if (mmVar != null) {
                    mmVar.R(messageObject3, true, false);
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
        if (messageObject != null && ChatObject.isForum(this.f44752e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f44752e.f20032id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.R3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.f44752e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void I7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        sg sgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.W5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f44764f;
        TLRPC.Chat chat = this.f44752e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.Z7;
        long j3 = this.L6;
        int d = (int) d();
        int i10 = this.R3;
        sg sgVar2 = new sg(this, 4);
        if (z10) {
            sgVar = new sg(this, 5);
        } else {
            sgVar = null;
        }
        sg sgVar3 = sgVar;
        org.telegram.ui.Components.g5.y(this, user, chat, encryptedChat, chatFull, j3, messageObject, this.W5, groupedMessages, d, i10, null, sgVar2, sgVar3, this.f44762ea);
    }

    public final boolean I9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f44726c && !this.d && this.f44764f == null && this.f44989x0 != null && SharedConfig.animationsEnabled()) {
            if (this.f44811ib == null) {
                this.f44811ib = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f44811ib.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f44989x0.getChildCount(); i12++) {
                    i11 += this.f44989x0.getChildAt(i12).getHeight();
                    int top = this.f44989x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f44933s9) {
                    O6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.C6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f44955u6;
                if ((!z12 || ((this.L6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.G6 && f10 > this.f44933s9 && (!arrayList.isEmpty() ? i11 != 0 : this.f44798hb)) {
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
                        Drawable d = this.f44762ea.d();
                        sm smVar = this.X0;
                        if (smVar != null) {
                            d = smVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.dd0) {
                            org.telegram.ui.Components.dd0 dd0Var = (org.telegram.ui.Components.dd0) d;
                            if (dd0Var.N != z11) {
                                if (!z11) {
                                    dd0Var.c();
                                }
                                dd0Var.q(z11);
                                if (z11) {
                                    f7 = 1.5f;
                                } else {
                                    f7 = 1.0f;
                                }
                                dd0Var.M = f7;
                                dd0Var.z();
                            } else if (z11) {
                                dd0Var.z();
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
        ok okVar = this.Y;
        if (okVar != null) {
            okVar.M1(z10);
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f44752e != null && (this.R3 != 0 || this.f44743d4 != 0 || (chatFull = this.Z7) == null || chatFull.ttl_period == 0)) || ((user = this.f44764f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f44707a8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.s0 s0Var = this.f44727c0;
            if (s0Var != null) {
                s0Var.e(8);
            }
            qj qjVar = this.f44701a1;
            if (qjVar != null) {
                qjVar.f31507a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.s0 s0Var2 = this.f44727c0;
            if (s0Var2 != null) {
                s0Var2.e(0);
            }
            qj qjVar2 = this.f44701a1;
            if (qjVar2 != null) {
                qjVar2.f31507a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.s0 s0Var3 = this.f44924s0;
        if (s0Var3 != null) {
            TLRPC.Chat chat = this.f44752e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s0Var3.e(i11);
        }
        qj qjVar3 = this.f44701a1;
        if (qjVar3 != null) {
            TLRPC.Chat chat2 = this.f44752e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f44764f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            qjVar3.setCommunityItemVisible(z11);
            final qj qjVar4 = this.f44701a1;
            TLRPC.Chat chat3 = this.f44752e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = qjVar4.E;
            ImageView imageView2 = qjVar4.f31537y;
            if (imageView2 != null && imageView != null) {
                qjVar4.f31523l0 = z12;
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
                                    uo uoVar = qjVar4;
                                    if (!z14) {
                                        uoVar.f31537y.setVisibility(4);
                                        return;
                                    } else {
                                        uoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    uo uoVar2 = qjVar4;
                                    if (!z15) {
                                        uoVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        uoVar2.getClass();
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
                                    uo uoVar = qjVar4;
                                    if (!z14) {
                                        uoVar.f31537y.setVisibility(4);
                                        return;
                                    } else {
                                        uoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    uo uoVar2 = qjVar4;
                                    if (!z15) {
                                        uoVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        uoVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f44701a1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f44707a8;
                if (userFull2 != null) {
                    this.f44701a1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.Z7;
                    if (chatFull3 != null) {
                        this.f44701a1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f44910r0 != null && (chatFull2 = this.Z7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.f44752e)) {
                TLRPC.Chat chat4 = this.f44752e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.s0 s0Var4 = this.f44910r0;
            if (z13) {
                i12 = 0;
            }
            s0Var4.e(i12);
        }
        p();
    }

    public final void J7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.Q0 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.Q0;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.Q0 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.X0.addView(this.Q0, 3, w7.x5.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.Q0.setTranslationX(W8() / 2.0f);
            if (this.A0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f44715b2 = textView;
                textView.setText(LocaleController.getString(R.string.NoFilteredMessages));
                this.f44715b2.setTextSize(1, 14.0f);
                this.f44715b2.setGravity(17);
                this.f44715b2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20883ic));
                this.f44715b2.setBackground(new org.telegram.ui.ActionBar.t5(this.f44715b2, this.X0, AndroidUtilities.dp(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f44715b2.setTypeface(AndroidUtilities.bold());
                this.f44715b2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(3.0f));
                this.Q0.addView(this.f44715b2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (E9()) {
                Activity parentActivity = getParentActivity();
                int i11 = this.R3;
                long j3 = this.f44743d4;
                String str = this.Q3;
                org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextSize(1, 14.0f);
                textView2.setTypeface(AndroidUtilities.bold());
                textView2.setTextAlignment(4);
                textView2.setLineSpacing(AndroidUtilities.dp(1.66f), 1.0f);
                textView2.setGravity(17);
                ai.q4 q4Var = new ai.q4(parentActivity, 3);
                q4Var.setTextAlignment(4);
                q4Var.setGravity(17);
                q4Var.setTextSize(1, 12.0f);
                q4Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
                q4Var.setGravity(1);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                q4Var.setMaxWidth(AndroidUtilities.dp(160.0f));
                int i12 = 22;
                int i13 = 9;
                if (i11 == 9) {
                    imageView.setImageResource(R.drawable.large_greeting);
                    textView2.setText(LocaleController.getString(R.string.WelcomeMessageEmptyTitle));
                    q4Var.setText(LocaleController.getString(R.string.WelcomeMessageEmptySubtitle));
                    q4Var.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), ci.d4.a(q4Var.getText(), q4Var.getPaint())));
                } else if ("hello".equalsIgnoreCase(str)) {
                    imageView.setImageResource(R.drawable.large_greeting);
                    textView2.setText(LocaleController.getString(R.string.BusinessGreetingIntroTitle));
                    q4Var.setText(LocaleController.getString(R.string.BusinessGreetingIntro));
                    q4Var.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), ci.d4.a(q4Var.getText(), q4Var.getPaint())));
                } else if ("away".equalsIgnoreCase(str)) {
                    imageView.setImageResource(R.drawable.large_away);
                    textView2.setText(LocaleController.getString(R.string.BusinessAwayIntroTitle));
                    q4Var.setText(LocaleController.getString(R.string.BusinessAwayIntro));
                    q4Var.setMaxWidth(Math.min(AndroidUtilities.dp(160.0f), ci.d4.a(q4Var.getText(), q4Var.getPaint())));
                } else {
                    if (i11 == 5) {
                        imageView.setImageResource(R.drawable.large_quickreplies);
                        hg.b2 c10 = hg.c2.f(UserConfig.selectedAccount).c(j3);
                        if (c10 != null) {
                            str = c10.f11174b;
                        }
                        textView2.setText(LocaleController.getString(R.string.BusinessRepliesIntroTitle));
                        q4Var.setMaxWidth(AndroidUtilities.dp(208.0f));
                        q4Var.setTextAlignment(2);
                        q4Var.setGravity(3);
                        q4Var.setText(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.BusinessRepliesIntro1, str)));
                        q4Var.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                        ai.q4 q4Var2 = new ai.q4(parentActivity, 3);
                        linearLayout.f11200a = q4Var2;
                        q4Var2.setMaxWidth(AndroidUtilities.dp(208.0f));
                        q4Var2.setTextAlignment(2);
                        q4Var2.setGravity(3);
                        q4Var2.setTextSize(1, 13.0f);
                        q4Var2.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.BusinessRepliesIntro2)));
                        q4Var2.setPadding(AndroidUtilities.dp(28.0f), 0, 0, 0);
                    }
                    i12 = 12;
                }
                int i14 = i12;
                linearLayout.addView(imageView, w7.x5.t(78, 78, 49, 20, 17, 20, 9));
                linearLayout.addView(textView2, w7.x5.t(-2, -2, 49, 20, 0, 20, 6));
                if (linearLayout.f11200a == null) {
                    i13 = 19;
                }
                linearLayout.addView(q4Var, w7.x5.t(-2, -2, 49, i14, 0, i14, i13));
                ai.q4 q4Var3 = linearLayout.f11200a;
                if (q4Var3 != null) {
                    linearLayout.addView(q4Var3, w7.x5.t(-2, -2, 49, 12, 0, 12, 19));
                }
                int i15 = org.telegram.ui.ActionBar.h6.f20883ic;
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
                q4Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
                ai.q4 q4Var4 = linearLayout.f11200a;
                if (q4Var4 != null) {
                    q4Var4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i15, resourceProvider));
                }
                this.U0 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.t5(this.U0, this.X0, AndroidUtilities.dp(24.0f), getThemedPaint("paintChatActionBackground")));
                this.Q0.addView(this.U0, w7.x5.e(-2, -2, 17));
                this.W0.d(this.U0, this.X0, new m4.p0(29), false);
            } else if (this.R3 == 6) {
                Activity parentActivity2 = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.P3;
                org.telegram.ui.ActionBar.d6 resourceProvider2 = getResourceProvider();
                ?? linearLayout2 = new LinearLayout(parentActivity2);
                linearLayout2.setOrientation(1);
                int i16 = org.telegram.ui.ActionBar.h6.f20883ic;
                org.telegram.ui.ActionBar.h6.w0(i16, resourceProvider2);
                org.telegram.ui.ActionBar.h6.v0(i16);
                ImageView imageView2 = new ImageView(parentActivity2);
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                imageView2.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView2.setImageResource(R.drawable.filled_chatlink_large);
                linearLayout2.addView(imageView2, w7.x5.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView3 = new TextView(parentActivity2);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, resourceProvider2));
                textView3.setGravity(1);
                textView3.setMaxWidth(AndroidUtilities.dp(208.0f));
                org.telegram.messenger.q.n(R.string.BusinessLinksIntro, textView3);
                linearLayout2.addView(textView3, w7.x5.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView4 = new TextView(parentActivity2);
                textView4.setTextAlignment(4);
                textView4.setTextSize(1, 13.0f);
                textView4.setTextColor(org.telegram.ui.ActionBar.h6.w0(i16, resourceProvider2));
                textView4.setTypeface(textView4.getTypeface(), 1);
                textView4.setGravity(1);
                textView4.setMaxWidth(AndroidUtilities.dp(208.0f));
                String str2 = tL_businessChatLink.link;
                hg.z[] zVarArr = hg.z.f11458e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView4.setText(str2);
                textView4.setBackground(org.telegram.ui.ActionBar.h6.a0(503316480, 503316480, 5, 5));
                textView4.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                textView4.setOnClickListener(new ai.f2(10, tL_businessChatLink, this));
                linearLayout2.addView(textView4, w7.x5.t(-2, -2, 49, 17, 0, 17, 17));
                this.V0 = linearLayout2;
                linearLayout2.setBackground(new org.telegram.ui.ActionBar.t5(this.V0, this.X0, AndroidUtilities.dp(24.0f), getThemedPaint("paintChatActionBackground")));
                this.Q0.addView(this.V0, w7.x5.e(-2, -2, 17));
            } else if ((this.B9 != null && this.f44764f != null && !this.f44861n) || (this.f44707a8 != null && a() != getUserConfig().getClientUserId() && ((this.f44707a8.contact_require_premium && !getUserConfig().isPremium()) || this.f44707a8.send_paid_messages_stars > yh.n5.y(this.currentAccount, false).p().amount))) {
                this.S0 = new si(this, getParentActivity(), this.currentAccount, this.B9, this.f44762ea);
                rc();
                this.S0.setListener(new qe(this, 4));
                LinearLayout linearLayout3 = new LinearLayout(getParentActivity());
                this.R0 = linearLayout3;
                linearLayout3.setOrientation(1);
                this.R0.setGravity(17);
                this.R0.addView(this.S0, w7.x5.e(-2, -2, 17));
                this.Q0.addView(this.R0, w7.x5.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f44707a8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.S0.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.S0.setSticker(this.f44707a8.business_intro.sticker);
                }
                qc();
            } else if (this.h == null) {
                String str3 = null;
                Paint paint = null;
                str3 = null;
                if (this.f44792h4 && this.R3 == 0) {
                    Activity parentActivity3 = getParentActivity();
                    sm smVar = this.X0;
                    xn xnVar = this.f44762ea;
                    LinearLayout linearLayout4 = new LinearLayout(parentActivity3);
                    int dp = AndroidUtilities.dp(18.0f);
                    if (xnVar != null) {
                        paint = xnVar.F("paintChatActionBackground");
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.h6.T0("paintChatActionBackground");
                    }
                    int i17 = org.telegram.ui.ActionBar.h6.f20723a;
                    linearLayout4.setBackground(new org.telegram.ui.ActionBar.t5(linearLayout4, smVar, dp, paint));
                    linearLayout4.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                    linearLayout4.setOrientation(1);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity3);
                    TextView textView5 = new TextView(parentActivity3);
                    org.telegram.messenger.ai.k(15.0f, 1, textView5);
                    int i18 = org.telegram.ui.ActionBar.h6.f20883ic;
                    textView5.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, xnVar));
                    textView5.setGravity(1);
                    textView5.setMaxWidth(AndroidUtilities.dp(210.0f));
                    textView5.setText(LocaleController.getString(R.string.AlmostDone));
                    TextView textView6 = new TextView(parentActivity3);
                    textView6.setTextSize(1, 13.0f);
                    textView6.setTextColor(org.telegram.ui.ActionBar.h6.w0(i18, xnVar));
                    textView6.setGravity(1);
                    textView6.setMaxWidth(AndroidUtilities.dp(160.0f));
                    textView6.setText(LocaleController.getString(R.string.TopicEmptyViewDescription));
                    linearLayout4.addView(y9Var, w7.x5.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout4.addView(textView5, w7.x5.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout4.addView(textView6, w7.x5.q(-2, -2, 1));
                    TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker("🥳");
                    if (emojiAnimatedSticker != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(emojiAnimatedSticker.thumbs, org.telegram.ui.ActionBar.h6.f20770c7, 0.2f);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        y9Var.i(ImageLocation.getForDocument(emojiAnimatedSticker), null, "tgs", svgThumb, null);
                    }
                    this.Q0.addView(linearLayout4, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!K9() && this.R3 == 0 && (((user2 = this.f44764f) != null && user2.self) || ((chat = this.f44752e) != null && chat.creator && !ChatObject.isChannelAndNotMegaGroup(chat)))) {
                    Activity parentActivity4 = getParentActivity();
                    sm smVar2 = this.X0;
                    if (this.f44752e != null) {
                        i10 = 1;
                    } else {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.vo voVar = new org.telegram.ui.Components.vo(parentActivity4, smVar2, i10, this.f44762ea);
                    this.Y0 = voVar;
                    this.Q0.addView(voVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f44752e != null) {
                        this.Y0.setStatusText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupEmptyTitle1)));
                    }
                } else {
                    if (K9() && this.R3 == 0) {
                        str3 = this.f44781g4 ? LocaleController.getString(R.string.NoComments) : LocaleController.getString(R.string.NoReplies);
                    } else if (this.R3 == 1) {
                        str3 = LocaleController.getString(R.string.NoScheduledMessages);
                    } else {
                        TLRPC.User user3 = this.f44764f;
                        if (user3 != null) {
                            long j10 = user3.f20179id;
                            if (j10 != 777000 && j10 != 429000 && j10 != 4244000 && MessagesController.isSupportUser(user3)) {
                                str3 = LocaleController.getString(R.string.GotAQuestion);
                            }
                        }
                        if (this.R3 != 8 && ((user = this.f44764f) == null || user.self || user.deleted || this.f44861n)) {
                            str3 = LocaleController.getString(R.string.NoMessages);
                        }
                    }
                    if (str3 == null) {
                        this.S0 = new ti(this, getParentActivity(), this.currentAccount, this.B9, this.f44762ea);
                        rc();
                        this.S0.setListener(new qe(this, 5));
                        TLRPC.UserFull userFull2 = this.f44707a8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.S0.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.S0.setSticker(this.f44707a8.business_intro.sticker);
                        }
                        LinearLayout linearLayout5 = new LinearLayout(getParentActivity());
                        this.R0 = linearLayout5;
                        linearLayout5.setOrientation(1);
                        this.R0.setGravity(17);
                        this.R0.addView(this.S0, w7.x5.e(-2, -2, 17));
                        this.Q0.addView(this.R0, w7.x5.e(-1, -2, 17));
                        qc();
                        return;
                    }
                    TextView textView7 = new TextView(getParentActivity());
                    this.f44715b2 = textView7;
                    textView7.setText(str3);
                    this.f44715b2.setTextSize(1, 14.0f);
                    this.f44715b2.setGravity(17);
                    this.f44715b2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20883ic));
                    this.f44715b2.setBackground(new org.telegram.ui.ActionBar.t5(this.f44715b2, this.X0, AndroidUtilities.dp(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f44715b2.setTypeface(AndroidUtilities.bold());
                    this.f44715b2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(3.0f));
                    this.Q0.addView(this.f44715b2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.Y0 = new org.telegram.ui.Components.vo(getParentActivity(), this.X0, 0, this.f44762ea);
                if (this.h.admin_id == getUserConfig().getClientUserId()) {
                    this.Y0.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleOutgoing, UserObject.getFirstName(this.f44764f)));
                } else {
                    this.Y0.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleIncoming, UserObject.getFirstName(this.f44764f)));
                }
                this.Q0.addView(this.Y0, new FrameLayout.LayoutParams(-2, -2, 17));
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f20052id)) {
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
                AnimatorSet animatorSet = this.f44780g3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.X2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f44780g3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f44780g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 1.0f));
                this.f44780g3.addListener(new xi(this, 5));
                this.f44780g3.start();
            }
            if (!z10) {
                w9();
                this.f44702a3 = 1000;
            }
        }
    }

    public final void Jc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        jh.h hVar = this.f44814j1;
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
            hVar.b(6).f3494c = z10;
            aa.a aVar = hVar.f14199e[6];
            if (aVar != null) {
                ((ih.b) aVar.f384b).b(z10, true);
            }
            jh.h hVar2 = this.f44814j1;
            if (this.Qa) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3494c = z11;
            aa.a aVar2 = hVar2.f14199e[5];
            if (aVar2 != null) {
                ((ih.b) aVar2.f384b).b(z11, true);
            }
        }
        this.f44978w3 = i12;
        this.f44992x3 = i11;
        Kc();
        org.telegram.ui.Components.r6 r6Var = this.V2;
        if (r6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            r6Var.setClickable(z12);
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
    public final boolean K(sy syVar) {
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
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(i10);
                if (m2Var != this && (m2Var instanceof zn) && ((zn) m2Var).T5 == this.T5) {
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
        ArrayList arrayList = this.f44955u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            mm mmVar = this.A0;
            if (mmVar != null && !mmVar.N) {
                mmVar.u(mmVar.J + indexOf);
            }
        }
    }

    public final void Kb(boolean z10) {
        if (this.Y2 != null && !E9()) {
            if (this.Y2.getTag() == null) {
                ValueAnimator valueAnimator = this.f44791h3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.Y2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44803i3, 1.0f);
                this.f44791h3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f44791h3.addUpdateListener(new ne(this, 2));
                this.f44791h3.addListener(new xi(this, 7));
                this.f44791h3.start();
            }
            if (!z10) {
                w9();
                this.f44702a3 = 1000;
            }
        }
    }

    public final void Kc() {
        org.telegram.ui.Components.r6 r6Var = this.U2;
        if (r6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f44978w3;
            if (i10 < 0) {
                r6Var.c("", z10, true);
            } else if (i10 == 0) {
                r6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f44913r3) {
                r6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.R3 != 7 && !this.yc.f16366f) {
                r6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f44992x3 + 1), Integer.valueOf(this.f44978w3)), z10, true);
            } else {
                r6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void L6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.L6():void");
    }

    public final boolean L7(android.view.View r94, boolean r95, boolean r96, float r97, float r98, boolean r99, boolean r100, boolean r101) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.L7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final int L8() {
        return Math.max(this.P4, this.Q4);
    }

    public final void L9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        int i13;
        ArrayList arrayList = this.f44955u6;
        if (!arrayList.isEmpty()) {
            MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.C6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() == this.L6) {
                            i13 = 1;
                        } else {
                            i13 = 0;
                        }
                        F(id2, 0, i13, 0, false, true);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.T5)) {
                int N0 = this.f45013z0.N0();
                int L0 = this.f45013z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        mm mmVar = this.A0;
                        int i14 = mmVar.J;
                        if (L0 >= i14 && L0 < mmVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
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
                this.W8.e(i11);
                org.telegram.ui.ActionBar.a2 a2Var = this.f44895pb;
                if (a2Var != null) {
                    a2Var.dismiss();
                }
                Bc(false);
                org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, this.f44762ea);
                this.f44895pb = a2Var2;
                a2Var2.setOnCancelListener(this.f44858ma);
                this.f44895pb.q(1000L);
                int i15 = this.V5;
                this.Y8 = i15;
                this.f44708a9 = false;
                this.f44794h6.add(Integer.valueOf(i15));
                this.Z8 = 0;
                this.f44722b9 = false;
                MessagesController messagesController = getMessagesController();
                long j3 = this.T5;
                long j10 = this.L6;
                int i16 = this.classGuid;
                int i17 = this.R3;
                long j11 = this.f44743d4;
                int i18 = this.f44852m4;
                int i19 = this.V5;
                this.V5 = i19 + 1;
                messagesController.loadMessages(j3, j10, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j11, i18, i19, this.f44792h4);
                this.X2.setAlpha(0.0f);
                this.X2.setTag(null);
                this.f44803i3 = 0.0f;
                pc();
                this.Y2.setTag(null);
            }
        }
    }

    public final void La(MessageObject messageObject) {
        ArrayList arrayList = this.f44955u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            mm mmVar = this.A0;
            if (mmVar != null && !mmVar.N) {
                mmVar.P(mmVar.J + indexOf, true);
            }
        }
    }

    public final boolean Lb() {
        ok okVar = this.Y;
        if (okVar != null && okVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f44755e2 == null) {
                    if (!this.f44718b5) {
                        ok okVar2 = this.Y;
                        if (okVar2 != null) {
                            okVar2.S();
                            MediaDataController.getInstance(okVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.gg ggVar = okVar2.U0;
                            ggVar.L(false, false);
                            ggVar.Q(false, false);
                            ggVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        sm smVar = this.X0;
                        int indexOfChild = smVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            ok okVar3 = this.Y;
                            okVar3.S();
                            MediaDataController.getInstance(okVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.gg ggVar2 = okVar3.U0;
                            ggVar2.L(false, false);
                            ggVar2.Q(false, false);
                            ggVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f44977w2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            smVar.addView(this.f44977w2, i10, w7.x5.a(10.0f, 37.0f, 0.0f, 0.0f, 27.0f, 10, 83));
                            org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(9, getParentActivity(), this.f44762ea, false);
                            this.f44755e2 = a50Var;
                            a50Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            smVar.addView(this.f44755e2, i10, w7.x5.a(-2.0f, 5.0f, 0.0f, 5.0f, 3.0f, -2, 83));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.a50 a50Var2 = this.f44755e2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(a50Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f44977w2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new xi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f44755e2.f(emojiButton, true);
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
        String str = this.f44952u3;
        if (str != null) {
            this.f44741d2.f25351e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.L3.setEmptyView(this.f44741d2);
            return;
        }
        this.L3.setEmptyView(null);
        this.f44741d2.setVisibility(8);
    }

    public final void M6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.f44987wc.f16365e) * (1.0f - this.f44961uc.f16365e) * ((float[]) this.Bc.f14061b)[i10];
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
            return (int) this.f44743d4;
        }
        return 0;
    }

    public final void M9() {
        this.D4 = true;
        if (this.f44854m6) {
            getMessagesStorage().getUnreadMention(this.T5, d(), new bh(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.T5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f44792h4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f44743d4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f44842l6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ai.v1(27, this, messagesStorage));
    }

    public final void Ma() {
        if (this.P7 == null && this.Q7 == null && this.R7 == null) {
            le leVar = this.U7;
            if (leVar != null) {
                AndroidUtilities.cancelRunOnUIThread(leVar);
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
        if (chatFull != null && !this.f44902q5) {
            TLRPC.Chat chat = this.f44752e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new le(this, 17), 1000L);
            }
        }
    }

    public final void Mc() {
        boolean z10;
        if (this.f44814j1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f44927s3 && !this.f44913r3) || (this.R3 == 7 && this.O3 == 2 && !this.f44955u6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44814j1.e(6, z10, true);
        this.f44814j1.e(5, z10, true);
        if (z10) {
            this.f44814j1.e(1, false, true);
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
            rg.j0.D1(this, this.D1, this.E1, this.T5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void N7() {
        if (this.h == null && this.f44991x2 == null && getParentActivity() != null) {
            ll llVar = new ll(this, getParentActivity());
            this.f44991x2 = llVar;
            llVar.setTag(1);
            this.M0.addView(this.f44991x2, w7.x5.n(-1, 48));
            this.M0.h(1, this.f44991x2);
            this.M0.g(this.f44991x2);
            this.f44991x2.setOnClickListener(new ze(this, 17));
            this.f44991x2.setEnabled(!isInPreviewMode());
            this.f44991x2.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            org.telegram.ui.Components.zg0 zg0Var = new org.telegram.ui.Components.zg0(getParentActivity(), this.f44762ea);
            this.f45015z2 = zg0Var;
            this.f44991x2.addView(zg0Var, w7.x5.a(48.0f, 13.0f, 0.0f, 0.0f, 0.0f, 3, 51));
            this.f44991x2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.F2 = numberTextView;
            numberTextView.h = true;
            int i10 = 14;
            numberTextView.setTextSize(14);
            this.F2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20830fe));
            this.F2.setTypeface(AndroidUtilities.bold());
            this.f44991x2.addView(this.F2, w7.x5.a(18.0f, 23.0f, 7.0f, 44.0f, 0.0f, -1, 51));
            int i11 = 0;
            while (i11 < 2) {
                yn ynVar = new yn(this, getParentActivity());
                yn[] ynVarArr = this.C2;
                ynVarArr[i11] = ynVar;
                ynVar.setTextSize(i10);
                ynVarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20830fe));
                ynVarArr[i11].setTypeface(AndroidUtilities.bold());
                this.f44991x2.addView(ynVarArr[i11], w7.x5.a(18.0f, 23.0f, 7.3f, 44.0f, 0.0f, -1, 51));
                ml mlVar = new ml(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.h5[] h5VarArr = this.D2;
                h5VarArr[i11] = mlVar;
                mlVar.setTextSize(i10);
                h5VarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.ge));
                this.f44991x2.addView(h5VarArr[i11], w7.x5.a(18.0f, 23.0f, 25.3f, 44.0f, 0.0f, -1, 51));
                ai.q4 q4Var = new ai.q4(getParentActivity(), 13);
                q4Var.setSingleLine(true);
                q4Var.setLines(1);
                q4Var.setMaxLines(1);
                q4Var.setEllipsize(TextUtils.TruncateAt.END);
                q4Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
                q4Var.setBackground(org.telegram.ui.ActionBar.w5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                q4Var.setTextSize(1, 14.0f);
                q4Var.setTypeface(AndroidUtilities.bold());
                q4Var.setGravity(17);
                q4Var.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                ai.q4[] q4VarArr = this.E2;
                q4VarArr[i11] = q4Var;
                this.f44991x2.addView(q4Var, w7.x5.a(28.0f, 0.0f, 10.0f, 14.0f, 0.0f, -2, 53));
                nl nlVar = new nl(getParentActivity());
                nlVar.I = new vh.g();
                nlVar.H = new Path();
                nlVar.J = new float[8];
                org.telegram.ui.Components.y9[] y9VarArr = this.B2;
                y9VarArr[i11] = nlVar;
                nlVar.setBlurAllowed(true);
                y9VarArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f44991x2.addView(y9VarArr[i11], w7.x5.a(32.0f, 22.0f, 8.0f, 0.0f, 0.0f, 32, 51));
                if (i11 == 1) {
                    ynVarArr[i11].setVisibility(4);
                    q4VarArr[i11].setVisibility(4);
                    h5VarArr[i11].setVisibility(4);
                    y9VarArr[i11].setVisibility(4);
                }
                i11++;
                i10 = 14;
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.L2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.L2;
            int i12 = org.telegram.ui.ActionBar.h6.f20794de;
            int themedColor = getThemedColor(i12);
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
            int i13 = org.telegram.ui.ActionBar.h6.f21156x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i13) & 436207615, 1, -1));
            this.f44991x2.addView(this.L2, w7.x5.a(48.0f, 0.0f, 0.0f, 7.0f, 0.0f, 36, 53));
            this.L2.setOnClickListener(new ze(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.J2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.J2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
            this.J2.setScaleType(scaleType);
            this.J2.setVisibility(8);
            this.J2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f44762ea);
            this.K2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.K2.setSize(AndroidUtilities.dp(16.0f));
            this.K2.setStrokeWidth(2.0f);
            this.K2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20812ee));
            this.f44991x2.addView(this.K2, w7.x5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 36, 53));
            this.J2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i13) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f44991x2.addView(this.J2, w7.x5.a(48.0f, 0.0f, 0.0f, 2.0f, 0.0f, 36, 53));
            this.J2.setOnClickListener(new ze(this, 19));
            Bc(false);
        }
    }

    public final long N8() {
        if (this.R3 == 3) {
            return this.f44743d4;
        }
        return 0L;
    }

    public final void N9(boolean z10) {
        TLRPC.Chat chat;
        if (this.ha == null && (chat = this.f44752e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.f44752e)) {
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
        org.telegram.ui.Components.sc G = org.telegram.ui.Components.ad.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f30711j = max;
        G.v = new hf(this, i10, 3);
        G.k(true);
        this.G3 = messageObject;
        this.H3 = i10;
    }

    public final void Nc(String str) {
        if (this.R3 == 7 && !TextUtils.equals(this.f44952u3, str)) {
            P7();
            Pb(true);
            this.f44952u3 = str;
            this.f44940t3 = str;
            U6(false);
            A7(true);
            this.N6 = 0L;
            this.f44832k7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.O3);
            this.M3.l();
            this.L3.requestLayout();
            if (this.L3.getLayoutManager() != null) {
                this.L3.getLayoutManager().n0(0);
            }
            Lc();
            this.f44741d2.e(true, true);
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
            wj wjVar = this.f44989x0;
            if (wjVar != null) {
                wjVar.invalidate();
            }
        }
    }

    public final void O7() {
        int i10;
        int i11;
        if (this.R2 == null && getParentActivity() != null) {
            rk rkVar = new rk(this, getParentActivity(), 1);
            this.R2 = rkVar;
            rkVar.setClickable(false);
            this.R2.setWillNotDraw(false);
            this.Bc.i(4, false, false);
            this.R2.setClipToPadding(false);
            org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(getParentActivity(), true, true, true);
            this.U2 = r6Var;
            org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.h;
            r6Var.b(0.25f, 280L, isVar);
            this.U2.setTextSize(AndroidUtilities.dp(15.0f));
            this.U2.setTypeface(AndroidUtilities.bold());
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21178ye));
            this.U2.setGravity(3);
            this.R2.addView(this.U2, w7.x5.a(30.0f, 0.0f, -1.0f, 97.33f, 0.0f, -2, 16));
            this.U.addView(this.R2, w7.x5.a(44.0f, 7.0f, 0.0f, 7.0f, 0.0f, -1, 80));
            org.telegram.ui.Components.r6 r6Var2 = new org.telegram.ui.Components.r6(getParentActivity(), true, false, true);
            this.V2 = r6Var2;
            r6Var2.b(0.0f, 420L, isVar);
            this.V2.setScaleProperty(0.7f);
            this.V2.setTextSize(AndroidUtilities.dp(15.0f));
            this.V2.setGravity(5);
            this.V2.setTypeface(AndroidUtilities.bold());
            this.V2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f20989o6));
            org.telegram.ui.Components.r6 r6Var3 = this.V2;
            if (this.yc.f16366f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            r6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.r6 r6Var4 = this.V2;
            r6Var4.f30349n = false;
            r6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.V2.setOnClickListener(new ze(this, 2));
            this.V2.setAlpha(0.5f);
            this.V2.setClickable(false);
            this.R2.addView(this.V2, w7.x5.e(-2, -1, 117));
            org.telegram.ui.Components.r6 r6Var5 = new org.telegram.ui.Components.r6(getParentActivity(), true, true, true);
            this.W2 = r6Var5;
            r6Var5.setGravity(17);
            this.W2.setTypeface(AndroidUtilities.bold());
            this.W2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Ae));
            this.W2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.r6 r6Var6 = this.W2;
            int i12 = org.telegram.ui.ActionBar.h6.f20786d6;
            r6Var6.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i12), org.telegram.ui.ActionBar.h6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.h6.f20877i6))));
            org.telegram.ui.Components.r6 r6Var7 = this.W2;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            r6Var7.setText(LocaleController.getString(i11));
            this.W2.setOnClickListener(new ze(this, 3));
            this.W2.setVisibility(8);
            this.W2.setAlpha(0.0f);
            this.R2.addView(this.W2, w7.x5.e(-1, -1, 119));
            TLRPC.Chat chat = this.f44752e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.f44752e.megagroup) && this.R3 != 7 && !ChatObject.isMonoForum(this.f44752e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.T2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.T2.setImageResource(R.drawable.msg_usersearch);
                this.T2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21162xe), PorterDuff.Mode.MULTIPLY));
                this.T2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21191z8), 1, -1));
                this.R2.addView(this.T2, w7.x5.a(44.0f, 48.0f, 0.0f, 0.0f, 0.0f, 44, 51));
                this.T2.setOnClickListener(new ze(this, 4));
                this.T2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.R3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.S2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.S2.setImageResource(R.drawable.msg_calendar);
                this.S2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21162xe), PorterDuff.Mode.MULTIPLY));
                this.S2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21191z8), 1, -1));
                this.R2.addView(this.S2, w7.x5.a(44.0f, 2.66f, 0.0f, 0.0f, 0.0f, 44, 51));
                this.S2.setOnClickListener(new ze(this, 5));
                this.S2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int O8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f44989x0.getMeasuredHeight() - this.Ba) - this.f44933s9) - this.v.e()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
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
        a0.i iVar;
        ArrayList arrayList2;
        mm mmVar;
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
            iVar = this.f44995x6;
            arrayList2 = this.f44955u6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.J4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f44879o6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f44764f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f44764f.f20179id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Xa();
                this.Qb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Pb.bind(messageObject2.messageOwner.f20053id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f20053id = id2;
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
                SparseArray sparseArray = this.f44890p6;
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
                    HashMap hashMap2 = this.f44916r6;
                    ArrayList arrayList6 = (ArrayList) hashMap2.get(str);
                    if (arrayList6 != null) {
                        i12 = arrayList6.indexOf(messageObject2);
                    } else {
                        i12 = -1;
                    }
                    if (messageObject2.getGroupId() != 0 && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupId())) != null && (indexOf = groupedMessages.messages.indexOf(messageObject2)) >= 0) {
                        if (messageObject2.getGroupId() != messageObject.getGroupId()) {
                            i11 = i16;
                            iVar.k(groupedMessages, messageObject.getGroupId());
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
                        mm mmVar2 = this.A0;
                        if (mmVar2 != null && !mmVar2.N) {
                            mmVar2.Q(mmVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        mm mmVar3 = this.A0;
                        if (mmVar3 != null && !mmVar3.N) {
                            mmVar3.u(mmVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.i iVar3 = this.f44943t6;
                        if (((MessageObject) iVar3.f(id4)) != null) {
                            iVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            mm mmVar4 = this.A0;
                            int i22 = mmVar4.E;
                            int i23 = mmVar4.F;
                            int i24 = mmVar4.H;
                            int i25 = mmVar4.G;
                            if (!mmVar4.N) {
                                mmVar4.u(mmVar4.J + indexOf2);
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
                                this.f44930s6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                mm mmVar5 = this.A0;
                                int i26 = mmVar5.E;
                                int i27 = mmVar5.F;
                                int i28 = mmVar5.H;
                                int i29 = mmVar5.G;
                                if (!mmVar5.N) {
                                    mmVar5.u(mmVar5.J + indexOf2);
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
        if (iVar2 != null) {
            for (int i30 = 0; i30 < iVar2.m(); i30++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) iVar2.n(i30);
                if (groupedMessages3.messages.isEmpty()) {
                    iVar.l(groupedMessages3.groupId);
                } else {
                    groupedMessages3.calculate();
                    int indexOf3 = arrayList2.indexOf((MessageObject) hg.c.g(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (mmVar = this.A0) != null) {
                        mmVar.q(indexOf3 + mmVar.J, groupedMessages3.messages.size());
                        yj yjVar = this.f45002y0;
                        if (yjVar != null) {
                            yjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        Dc();
    }

    public final void Ob(boolean z10) {
        boolean z11;
        jh.h hVar = this.f44814j1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.f44752e)) {
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
        ok okVar;
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
                org.telegram.ui.Components.qz0 qz0Var = this.f44740d1;
                if (qz0Var != null) {
                    qz0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f44752e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.f44752e)) {
                    TLRPC.Chat chat2 = this.f44752e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.f44752e.megagroup)) {
                        TLRPC.Chat chat3 = this.f44752e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.h6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.fr frVar = new org.telegram.ui.Components.fr(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                frVar.f26470e = dp;
                                frVar.f26471f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                frVar.h = dp3;
                                frVar.f26472n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.q.g(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(frVar, 1), 0, 1, 33);
                                this.E0.setBackground(org.telegram.ui.ActionBar.h6.h0(0, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f20877i6, false)));
                                this.E0.setText(spannableStringBuilder);
                                this.E0.setOnClickListener(new ze(this, 0));
                            } else {
                                this.E0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.E0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.E0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.f44752e.banned_rights.until_date)));
                        }
                        this.R.setVisibility(0);
                        this.I1.setVisibility(8);
                        this.I1.setTag(null);
                        wc();
                        org.telegram.ui.Components.qz0 qz0Var2 = this.f44740d1;
                        if (qz0Var2 != null) {
                            qz0Var2.f();
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
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a1.g.t(new StringBuilder("<b>"), this.f44764f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.T5, this.f44743d4, false);
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
                    if (this.f44740d1 != null && (okVar = this.Y) != null && okVar.i0()) {
                        this.f44740d1.e();
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
        MessagePreviewParams messagePreviewParams = this.f44770f5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.G5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.G5 = null;
                ok okVar = this.Y;
                if (okVar != null) {
                    okVar.X2 = null;
                    okVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f44770f5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = okVar.getFieldText();
                    MessageObject messageObject3 = this.f44867n5;
                    if (messageObject3 == this.X3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f44841l5, this.p5);
                }
                l8();
                m8();
            }
        }
    }

    public final void P7() {
        if (this.f44741d2 == null && this.f44938t1 == null) {
            org.telegram.ui.Components.k10 k10Var = new org.telegram.ui.Components.k10(getParentActivity(), this.f44762ea);
            this.f44729c2 = k10Var;
            k10Var.setViewType(7);
            org.telegram.ui.Components.cy0 cy0Var = new org.telegram.ui.Components.cy0(getParentActivity(), this.f44729c2, 1, null);
            this.f44741d2 = cy0Var;
            cy0Var.setClickable(true);
            this.f44741d2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f44741d2.setVisibility(8);
            this.f44741d2.addView(this.f44729c2, 0);
            this.f44741d2.e(true, false);
            this.K3.addView(this.f44741d2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.v40 v40Var = new org.telegram.ui.Components.v40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f44938t1 = v40Var;
            v40Var.setOnHashtagClickListener(new bf(this, 2));
            this.f44938t1.setOnScrollListener(new h3(this, 5));
            this.f44938t1.setVisibility(8);
            this.K3.addView(this.f44938t1, -1, -1);
            u7();
            s7();
        }
    }

    public final int P8(MessageObject messageObject) {
        return O8(F8(messageObject, !TextUtils.isEmpty(this.P7))) - Ya(messageObject);
    }

    public final zi P9(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle) {
        of.e eVar = this.Ab;
        if (eVar != null) {
            eVar.a(true);
            this.Ab = null;
        }
        if (characterStyle != null && u1Var != null && u1Var.getMessageObject() != null) {
            zi ziVar = new zi(this, u1Var.getMessageObject().getId(), characterStyle, u1Var, 0);
            this.Ab = ziVar;
            return ziVar;
        }
        this.Ab = null;
        return null;
    }

    public final void Pa() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f44956u7 = 0;
        this.f44832k7 = false;
        this.f44843l7 = true;
        this.f44794h6.clear();
    }

    public final void Pb(boolean z10) {
        int i10;
        if (this.K3 != null) {
            me.b bVar = this.yc;
            if (bVar.f16366f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.R3 == 7) {
                    s4.d0 d0Var = (s4.d0) this.L3.getLayoutManager();
                    Object E = this.M3.E((d0Var.N0() + d0Var.L0()) / 2);
                    Object E2 = this.M3.E(d0Var.L0());
                    Object E3 = this.M3.E(d0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f45013z0.L0();
                        int N0 = this.f45013z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f20053id;
                        int i12 = ((MessageObject) E2).messageOwner.f20053id;
                        int i13 = ((MessageObject) E3).messageOwner.f20053id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f20053id == i12) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f20053id == i13) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f20053id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.f45013z0.h1(this.A0.J + i14, (this.f44989x0.getHeight() - F8((MessageObject) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.r6 r6Var = this.V2;
                if (r6Var != null) {
                    if (bVar.f16366f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    r6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                ci.d4 d4Var = this.f44990x1;
                if (d4Var != null && d4Var.V) {
                    d4Var.e(true);
                }
                yl ylVar = this.B1;
                if (ylVar != null && ylVar.V) {
                    ylVar.e(true);
                }
                ok okVar = this.Y;
                if (okVar != null) {
                    okVar.j0();
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
            el elVar = this.f44724bb;
            if (elVar != null) {
                elVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f44724bb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                el elVar2 = this.f44724bb;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                elVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new le(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.ml0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.u0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.hk0 hk0Var = k10.f21562x;
                if (hk0Var != null && k10.f21563y != i10) {
                    k10.f21563y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(hk0Var, i10);
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
        ok okVar = this.Y;
        if (okVar != null && (editingMessageObject = okVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f44764f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.h5 h5Var = ((org.telegram.ui.Components.gp[]) this.f44700a0.f933b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.f44752e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        h5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new sg(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.af afVar = this.Y.F1;
                if (afVar != null) {
                    afVar.setVisibility(8);
                }
                h5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView Q7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f45009y8);
        if (this.f44945t8 == null) {
            rk rkVar = new rk(this, getParentActivity(), 2);
            this.f44945t8 = rkVar;
            rkVar.setOutlineProvider(new pl(this));
            this.f44945t8.setClipToOutline(true);
            this.f44945t8.setWillNotDraw(false);
            k4 k4Var = new k4(getParentActivity());
            this.f44970v8 = k4Var;
            k4Var.setBackgroundColor(0);
            if (z10) {
                this.f44945t8.addView(this.f44970v8, w7.x5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f44983w8 = textureView;
            textureView.setOpaque(false);
            this.f44970v8.addView(this.f44983w8, w7.x5.d(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f44945t8.getParent();
        if (viewGroup != null && viewGroup != this.X0) {
            viewGroup.removeView(this.f44945t8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.X0.addView(this.f44945t8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(H9()), AndroidUtilities.roundPlayingMessageSize(H9())));
        }
        this.f44945t8.setTag(null);
        this.f44970v8.setDrawingReady(false);
        return this.f44983w8;
    }

    public final int Q8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f44989x0.getMeasuredHeight() - view.getBottom()) - this.f44989x0.getPaddingBottom()) + "} chatHeight=" + this.f44989x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f44989x0.getPaddingBottom());
        return (this.f44989x0.getMeasuredHeight() - view.getBottom()) - this.f44989x0.getPaddingBottom();
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
        this.f45012yb = null;
        this.f44986wb = 0;
        this.f45000xb = -1;
        this.f45024zb = null;
        this.Ab = null;
        this.f44814j1.d(false);
    }

    public final void Qb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j3) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44762ea);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
            a2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            a2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new we(this, tL_game, messageObject, str, j3));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(a2Var);
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
                    presentFragment(new pj1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        pj1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Qc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        org.telegram.ui.Wallet.d3 d3Var;
        if (this.fragmentView != null && !this.f44902q5) {
            int childCount = this.f44989x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f44989x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        MessageObject messageObject = w0Var.getMessageObject();
                        if (this.L7 != Integer.MAX_VALUE && messageObject != null && messageObject.getId() == this.L7 && w0Var.M()) {
                            org.telegram.ui.Wallet.f3 f3Var = w0Var.I0;
                            if (!f3Var.f34909h0 && (f3Var.f34904e0 == 0 || (d3Var = f3Var.f34902d0) == null || d3Var.c())) {
                                f3Var.e();
                                org.telegram.ui.Wallet.d3 d3Var2 = f3Var.f34902d0;
                                d3Var2.getClass();
                                d3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.d3 d3Var3 = f3Var.f34902d0;
                                d3Var3.f27640b = -1L;
                                d3Var3.f27641c = -1L;
                                f3Var.f34904e0 = SystemClock.elapsedRealtime();
                                f3Var.f34906f0 = false;
                                f3Var.f34896a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        if (this.f44945t8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                            ImageReceiver photoImage = u1Var.getPhotoImage();
                            this.f44945t8.setTranslationX(u1Var.getX() + photoImage.getImageX());
                            this.f44945t8.setTranslationY((this.f44989x0.getY() + (photoImage.getImageY() + (u1Var.getY() + u1Var.getPaddingTop()))) - this.f44945t8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f44945t8.getLayoutParams();
                            if (messageObject2.isRoundVideo()) {
                                this.f44945t8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(H9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(H9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(H9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f44970v8.setResizeMode(0);
                                    this.f44945t8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(H9())) / AndroidUtilities.roundPlayingMessageSize(H9());
                                float imageWidth = u1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(H9());
                                if (this.f44945t8.getScaleX() != imageWidth) {
                                    this.f44945t8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f44945t8.setPivotX(0.0f);
                                this.f44945t8.setPivotY(0.0f);
                                this.f44945t8.setScaleX(imageWidth);
                                this.f44945t8.setScaleY(imageWidth);
                                this.f44983w8.setScaleX(roundPlayingMessageSize2);
                                this.f44983w8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f44945t8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f44970v8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f44945t8.setLayoutParams(layoutParams);
                                }
                                this.f44983w8.setScaleX(1.0f);
                                this.f44983w8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f44945t8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f44945t8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f44851m3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f44945t8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(H9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f44851m3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                F(playingMessageObject.getId(), 0, 0, 0, false, true);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f44997x8) {
                        this.f44989x0.invalidate();
                    }
                }
            }
        }
    }

    public final void R6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.W7;
        if (call != null && (((str = this.f44785g8) != null || this.f44796h8) && this.N5)) {
            org.telegram.ui.Components.voip.g2.l(this.f44752e, str, this.Y7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f44785g8 = null;
            this.f44796h8 = false;
            return;
        }
        if (this.f44785g8 != null && z10 && (chatFull = this.Z7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.q.q(R.string.LinkHashExpired, org.telegram.ui.Components.ad.a0(this), R.raw.linkbroken, 36);
            this.f44785g8 = null;
        }
        this.X7 = !this.N5;
    }

    public final void R7() {
        if (this.X0 != null && this.K1 == null && getParentActivity() != null) {
            this.K1 = new org.telegram.ui.ActionBar.p0(this, getParentActivity(), 1);
            t9();
            this.K1.setClickable(true);
            this.M0.addView(this.K1, w7.x5.n(-1, 44));
            this.M0.h(2, this.K1);
            this.M0.g(this.K1);
            TextView textView = new TextView(getParentActivity());
            this.N1 = textView;
            int i10 = org.telegram.ui.ActionBar.h6.f21026q7;
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
            this.K1.addView(this.N1, w7.x5.e(-1, -1, 51));
            this.N1.setOnClickListener(new ze(this, 13));
            org.telegram.ui.Components.fa0 fa0Var = new org.telegram.ui.Components.fa0(getParentActivity(), this.f44762ea);
            this.T1 = fa0Var;
            fa0Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.ge));
            this.T1.setTextSize(1, 13.3f);
            this.T1.setDisablePaddingsOffset(true);
            this.T1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.il));
            this.T1.setGravity(17);
            this.T1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.M0.addView(this.T1, w7.x5.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.M0.h(8, this.T1);
            this.M0.g(this.T1);
            TextView textView3 = new TextView(getParentActivity());
            this.L1 = textView3;
            int i11 = org.telegram.ui.ActionBar.h6.f20865he;
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
            this.K1.addView(this.L1, w7.x5.e(-1, -1, 51));
            this.L1.setOnClickListener(new ze(this, 14));
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
            this.M0.addView(this.O1, w7.x5.n(-1, 48));
            this.M0.h(4, this.O1);
            this.M0.g(this.O1);
            this.O1.setOnClickListener(new ze(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.U1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.U1.setContentDescription(LocaleController.getString(R.string.Close));
            this.U1.setBackground(org.telegram.ui.ActionBar.h6.N(getThemedColor(org.telegram.ui.ActionBar.h6.f20877i6), 0, 0));
            this.U1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f20794de), PorterDuff.Mode.MULTIPLY));
            this.U1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.addView(this.U1, w7.x5.a(34.0f, 0.0f, 5.0f, 5.0f, 0.0f, 34, 53));
            this.U1.setOnClickListener(new ze(this, 16));
        }
    }

    public final rn R8() {
        if (this.f44884oc == null) {
            this.f44884oc = new rn(this);
        }
        return this.f44884oc;
    }

    public final boolean R9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.f6 f6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.f6 animation;
        boolean z10;
        org.telegram.ui.Cells.u1 messageCell;
        boolean z11;
        if (this.f44989x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.a50 a50Var = this.f44939t2;
            ArrayList<MessageObject> arrayList = null;
            if (a50Var != null && a50Var.getTag() != null && (messageCell = this.f44939t2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                f6Var = photoImage2.getAnimation();
                if (f6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f44989x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f44997x8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                f6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f44989x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f44989x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = u1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f44989x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f44989x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f44997x8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f44989x0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    f6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                f6Var = animation;
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
                messageObject.audioProgress = f6Var.n();
                messageObject.audioProgressMs = f6Var.o();
                f6Var.stop();
                if (PhotoViewer.L1(messageObject)) {
                    PhotoViewer.f33892b9.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ra(org.telegram.ui.Cells.u1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Ra(org.telegram.ui.Cells.u1):void");
    }

    public final void Rb(boolean z10) {
        if (z10) {
            if (this.Cb == null) {
                le leVar = new le(this, 11);
                this.Cb = leVar;
                AndroidUtilities.runOnUIThread(leVar, 100L);
                return;
            }
            return;
        }
        le leVar2 = this.Cb;
        if (leVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar2);
        }
        this.Cb = null;
        this.Bb = false;
        Bc(true);
    }

    public final void Rc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        qj qjVar = this.f44701a1;
        if (qjVar == null) {
            return;
        }
        int i10 = this.R3;
        if (i10 == 8 && (chat2 = this.f44752e) != null) {
            if (this.T3) {
                String i11 = ng.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.f44752e;
                qjVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f44743d4 > 0L ? 1 : (this.f44743d4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.f44752e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.f44752e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.f44752e;
                        }
                        this.f44701a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        qj qjVar2 = this.f44701a1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.f44752e;
                        qjVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f44743d4));
                    this.f44701a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f44743d4));
                    if (chat7 == null) {
                        chat7 = this.f44752e;
                    }
                    this.f44701a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                qj qjVar3 = this.f44701a1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.f44752e.title));
                TLRPC.Chat chat8 = this.f44752e;
                qjVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            qjVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.Q3)) {
                this.f44701a1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.Q3)) {
                this.f44701a1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f44701a1.setTitle(this.Q3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.P3.title)) {
                this.f44701a1.setTitle(this.P3.title);
            } else {
                this.f44701a1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j3 = this.f44743d4;
                if (j3 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j3));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j3));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f44701a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f44701a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f44701a1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f44701a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f44701a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f44701a1.setTitle("");
                }
            } else if (K9() && !UserObject.isBotForum(this.f44764f)) {
                if (this.f44792h4) {
                    Wc();
                } else if (this.f44781g4) {
                    if (this.X3.hasReplies()) {
                        this.f44701a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f44701a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f44701a1.setTitle(LocaleController.formatPluralString("Replies", this.X3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f44764f)) {
                this.f44701a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f44764f)) {
                this.f44701a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.R3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f44764f)) {
                        this.f44701a1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f44701a1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f44701a1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", L8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.f44752e;
                    if (chat9 != null) {
                        qj qjVar4 = this.f44701a1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.f44752e;
                        qjVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f44764f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f44701a1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f44764f.f20179id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f44764f.phone)) {
                                    qj qjVar5 = this.f44701a1;
                                    String g10 = org.telegram.messenger.ai.g(new StringBuilder("+"), this.f44764f.phone, hf.b.c());
                                    TLRPC.User user4 = this.f44764f;
                                    qjVar5.h(g10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f44764f), this.f44764f.emoji_status, z10);
                                } else {
                                    qj qjVar6 = this.f44701a1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f44764f)));
                                    TLRPC.User user5 = this.f44764f;
                                    qjVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f44764f), this.f44764f.emoji_status, z10);
                                }
                            } else {
                                qj qjVar7 = this.f44701a1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f44764f)));
                                TLRPC.User user6 = this.f44764f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f44764f);
                                if (!MessagesController.isSupportUser(this.f44764f)) {
                                    emojiStatus = this.f44764f.emoji_status;
                                }
                                qjVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f44701a1.getTitleTextView().getText());
        Tc(false);
    }

    public final void S6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.f45003y1 == null && ChatObject.isMegagroup(this.f44752e) && (chatFull = getMessagesController().getChatFull(this.f44752e.f20032id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            sk skVar = this.O0;
            if (skVar == null || skVar.getVisibility() != 0) {
                org.telegram.ui.Components.b50 b50Var = org.telegram.ui.Components.b50.f24853n;
                if (b50Var.c()) {
                    long j3 = stickerSet.thumb_document_id;
                    if (j3 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j3 = groupStickerSetById.documents.get(0).f20038id;
                    }
                    if (j3 != 0 && getParentActivity() != null) {
                        b50Var.b();
                        ci.d4 d4Var = new ci.d4(getParentActivity(), 3);
                        this.f45003y1 = d4Var;
                        d4Var.i();
                        this.f45003y1.p(true);
                        ci.d4 d4Var2 = this.f45003y1;
                        d4Var2.K = Layout.Alignment.ALIGN_CENTER;
                        d4Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.b6(j3, this.f45003y1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f45003y1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        ci.d4 d4Var3 = this.f45003y1;
                        d4Var3.h = ci.d4.a(d4Var3.getText(), this.f45003y1.getTextPaint());
                        ci.d4 d4Var4 = this.f45003y1;
                        d4Var4.d = -1L;
                        d4Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new sg(this, 28), 300L);
                    }
                }
            }
        }
    }

    public final void S7() {
        int i10;
        if (this.R1 == null && getParentActivity() != null) {
            if (this.f44991x2 == null) {
                N7();
            }
            org.telegram.ui.Components.e41 e41Var = new org.telegram.ui.Components.e41(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.R1 = e41Var;
            e41Var.O = new le(this, 5);
            dh.e o9 = eh.b.o(this.f44762ea);
            ah.c cVar = this.J;
            e41Var.setSideMenuBackgroundDrawable(cVar.c(e41Var, o9, false));
            org.telegram.ui.Components.e41 e41Var2 = this.R1;
            e41Var2.setTopMenuBackgroundDrawable(cVar.c(e41Var2, eh.b.o(this.f44762ea), false));
            this.R1.setCurrentTopic(d());
            this.R1.setOnNewTopicSelected(new le(this, 6));
            this.R1.setOnTopicSelected(new af(this, 0));
            this.R1.setOnDialogSelected(new af(this, 1));
            int indexOfChild = this.X0.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.X0.addView(this.R1, i10, w7.x5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.R1.o();
            gk gkVar = this.I1;
            if (gkVar != null) {
                gkVar.bringToFront();
            }
        }
    }

    public final long S8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.f44752e) || !ChatObject.canManageMonoForum(this.currentAccount, this.f44752e)) {
            return 0L;
        }
        long j3 = this.f44743d4;
        int i10 = (j3 > 0L ? 1 : (j3 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.p5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f44867n5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j3;
    }

    public final void S9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.m2 m2Var;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var == null) {
            return;
        }
        long j3 = messageObject.messageOwner.action.channel_id;
        if (b5Var.getFragmentStack().size() > 0) {
            m2Var = (org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            m2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.b5 b5Var2 = this.parentLayout;
        if (indexOf > 0 && !(m2Var instanceof zn) && !(m2Var instanceof ProfileActivity) && this.f44752e.creator) {
            int size = b5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) b5Var2.getFragmentStack().get(indexOf);
                if (m2Var2 instanceof zn) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new zn(sc.v.f(j3, "chat_id")));
                    m2Var2.removeSelfFromStack();
                } else if (m2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new ProfileActivity(sc.v.f(j3, "chat_id"), null));
                    m2Var2.removeSelfFromStack();
                } else if (m2Var2 instanceof uo) {
                    ((ActionBarLayout) b5Var2).c(indexOf, new uo(sc.v.f(j3, "chat_id")));
                    m2Var2.removeSelfFromStack();
                } else if (m2Var2 instanceof sr) {
                    if (((sr) m2Var2).f41797e1 == 0) {
                        Bundle arguments = m2Var2.getArguments();
                        arguments.putLong("chat_id", j3);
                        ((ActionBarLayout) b5Var2).c(indexOf, new sr(arguments));
                    }
                    m2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.ui.ActionBar.l5(this, m2Var, messageObject, b5Var2, 5));
        }
        AndroidUtilities.runOnUIThread(new ke(this, j3, 1), 1000L);
    }

    public final void Sa() {
        org.telegram.ui.Components.dd0 i10;
        xn xnVar = this.f44762ea;
        if (xnVar != null) {
            Drawable d = xnVar.d();
            if (this.fragmentView != null) {
                d = this.X0.getBackgroundImage();
            }
            if (d instanceof co) {
                d = ((co) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.dd0) {
                ((org.telegram.ui.Components.dd0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.d5) && (i10 = ((org.telegram.ui.ActionBar.d5) themedDrawable).i()) != null) {
                i10.x(false);
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
                spannableString.setSpan(new org.telegram.ui.Components.o61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(this);
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
                    org.telegram.ui.Components.sc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new mf(this, z10, 0)), spannableString), i12);
                    M.f30711j = 8000;
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
            long j3 = 0;
            while (true) {
                arrayList = this.f44955u6;
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

    public final void T7() {
        if (this.y3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f44762ea);
            this.y3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.X0.addView(this.y3, w7.x5.a(-2.0f, 8.0f, 0.0f, 8.0f, 8.0f, -1, 83));
        }
    }

    public final int T8() {
        return this.X0.getBackgroundSizeY();
    }

    public final void T9(boolean z10) {
        int i10;
        if (this.f44989x0 != null) {
            ArrayList arrayList = this.f44955u6;
            if (!arrayList.isEmpty() && !this.f44985wa.f40976n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f45013z0.h1(i10, 0);
                this.f44989x0.B0();
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
        long j3;
        sk skVar;
        ok okVar = this.Y;
        if (okVar != null && okVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.Y4 && okVar != null && (skVar = this.O0) != null && skVar.getVisibility() != 0) {
            messageObject = this.f44867n5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.Y2;
        } else {
            z10 = true;
            messageObject = null;
            charSequence = null;
        }
        if (this.f44853m5) {
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
        long j10 = this.T5;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f44853m5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        pn pnVar = this.f44841l5;
        MessageSuggestionParams messageSuggestionParams = this.f44782g5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        ok okVar2 = this.Y;
        if (okVar2 != null) {
            j3 = okVar2.getEffectId();
        } else {
            j3 = 0;
        }
        mediaDataController2.saveDraft(j10, E7, charSequence2, entities, message, pnVar, suggestedPost2, j3, !z10, false, richMessage);
    }

    public final void Tb(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f44781g4 && this.f44764f == null) {
                if (this.f44811ib == null) {
                    this.f44811ib = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f44811ib.booleanValue()) {
                    this.f44798hb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.O5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f44798hb) {
                    return;
                }
                this.f44798hb = z10;
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
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new xi(this, 3)).start();
                return;
            }
            this.f44798hb = z10;
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
        if (this.f44701a1 != null) {
            int i10 = this.R3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.T5, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f44752e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f44764f)) {
                    if (!UserObject.isReplyUser(this.f44764f) && ((!K9() || this.f44792h4) && isDialogMuted)) {
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
                    TLRPC.Chat chat = this.f44752e;
                    if (chat != null) {
                        drawable = this.f44701a1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f44764f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f44701a1.c(DialogObject.getBotVerificationIcon(this.f44764f));
                        }
                    }
                }
                this.f44701a1.j(drawable, mutate);
                if (!z10 && (s0Var = this.f44754e1) != null) {
                    if (isDialogMuted) {
                        if (s0Var.f21478m != 8) {
                            s0Var.f21478m = 8;
                            View view = s0Var.f21475j;
                            if (view instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view).getRightIcon().setVisibility(s0Var.f21478m);
                            }
                        }
                        this.f44754e1.d(LocaleController.getString(R.string.Unmute));
                        this.f44754e1.b(R.drawable.msg_mute);
                    } else {
                        if (s0Var.f21478m != 0) {
                            s0Var.f21478m = 0;
                            View view2 = s0Var.f21475j;
                            if (view2 instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view2).getRightIcon().setVisibility(s0Var.f21478m);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.T5, d())) {
                            this.f44754e1.d(LocaleController.getString(R.string.Mute));
                            this.f44754e1.b(R.drawable.msg_unmute);
                        } else {
                            this.f44754e1.d(LocaleController.getString(R.string.Mute));
                            this.f44754e1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.fp fpVar = this.f44801i1;
                if (fpVar != null) {
                    fpVar.d(this.T5, d(), null);
                }
            }
        }
    }

    public final void U6(boolean z10) {
        gg.n1 n1Var;
        if (this.O3 == 2 && (n1Var = this.M3) != null) {
            String str = this.f44952u3;
            ci.rc rcVar = n1Var.E;
            if (!TextUtils.equals(n1Var.f10745x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(rcVar);
                ai.w8 w8Var = n1Var.f10746y;
                if (w8Var != null && w8Var.I != 0) {
                    ConnectionsManager.getInstance(w8Var.f895c).cancelRequest(w8Var.I, true);
                    w8Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    n1Var.f10745x = str;
                    n1Var.f10746y = new ai.w8(n1Var.f10742r, str2, trim);
                    if (z10) {
                        rcVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(rcVar, 1000L);
                    }
                }
                ai.w8 w8Var2 = n1Var.f10746y;
                if (w8Var2 != null && w8Var2.J > 0) {
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
            ArrayList arrayList = this.f44955u6;
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
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.X0.getBackgroundTranslationY()) - ((1.0f - this.f44998x9) * this.f44933s9);
    }

    public final boolean U9() {
        ok okVar = this.Y;
        boolean z10 = okVar.f23988z2;
        if (z10) {
            okVar.q1();
            this.D3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Ua() {
        org.telegram.ui.Cells.u1 u1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f44989x0.getChildCount(); i11++) {
            View childAt = this.f44989x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                int min = Math.min(u1Var2.getBottom(), this.f44989x0.getHeight()) - Math.max(0, u1Var2.getTop());
                if (min > i10) {
                    u1Var = u1Var2;
                    i10 = min;
                }
            }
        }
        if (u1Var != null) {
            zj zjVar = this.f45013z0;
            this.f44989x0.getClass();
            zjVar.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) this.f44933s9), false);
        }
    }

    public final void Ub() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new qe(this, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20368a);
    }

    public final void Uc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Uc(boolean):void");
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
        if (this.v.f45913s == 1) {
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
            ArrayList arrayList = this.f44955u6;
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
        wj wjVar = this.f44989x0;
        if (wjVar != null) {
            wjVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            Tb(true);
        }
        mm mmVar = this.A0;
        mmVar.L = true;
        mmVar.O(true);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 81, new Runnable() {
            @Override
            public final void run() {
                long j3;
                zn znVar = zn.this;
                MessagesController messagesController = znVar.getMessagesController();
                long j10 = znVar.T5;
                if (ChatObject.isChannel(znVar.f44752e)) {
                    j3 = znVar.T5;
                } else {
                    j3 = 0;
                }
                messagesController.deleteMessagesRange(j10, j3, i10, i11, z10, new sg(znVar, 18));
            }
        }, new qf(this, 28));
    }

    public final float V8() {
        org.telegram.ui.Components.e41 e41Var = this.R1;
        if (e41Var != null) {
            return e41Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Va(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Va(org.telegram.messenger.MessageObject):void");
    }

    public final void Vb() {
        String str;
        if (this.Gb != null) {
            return;
        }
        if (this.f44867n5 != null) {
            str = getMessagesController().getFullName(this.f44867n5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new qe(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qe(this, 18));
        a2Var.setOnDismissListener(new pe(this, 8));
        this.Gb = alertDialog$Builder.o();
    }

    public final void Vc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.s0 s0Var = this.f44937t0;
        if (s0Var != null) {
            TLRPC.Chat chat = this.f44752e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f44731c4) && (tL_forumTopic = this.f44731c4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s0Var.e(i10);
        }
    }

    public final void W6() {
        TLRPC.Chat chat;
        long j3 = getArguments().getInt("search_from_user_id", 0);
        if (j3 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
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
        long j10 = getArguments().getInt("search_from_chat_id", 0);
        if (j10 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j10))) != null) {
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
        org.telegram.ui.Components.q80 I = org.telegram.ui.Components.q80.I(this, u1Var);
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(getParentActivity(), this.f44762ea);
        I.f30078p = new re(in0Var, 0);
        if (!str.startsWith("video?") && !of.f.f(Uri.parse(str), false, null)) {
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
            se seVar = new se(this, str, characterStyle, messageObject, u1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            u1Var2 = u1Var;
            I.c(i13, string, seVar, false);
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
        I.c(i14, LocaleController.getString(i10), new ai.t4(this, str, messageObject2, startsWith, 11), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new te(this, str, 2), false);
        }
        in0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            in0Var.f(u1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.x61) {
            String url = ((org.telegram.ui.Components.x61) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = of.f.v(parse, null, null, of.f.a(parse.getHost()), null);
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
            in0Var.f(u1Var2, characterStyle2, spannableString2, false);
        } else {
            in0Var.f(u1Var2, characterStyle2, null, false);
        }
        showDialog(in0Var);
    }

    public final int W8() {
        return (int) (V8() * AndroidUtilities.dp(71.0f));
    }

    public final void Wa(long j3) {
        zj zjVar;
        MessageObject messageObject;
        int Q8;
        int abs;
        wj wjVar = this.f44989x0;
        int i10 = -1;
        if (wjVar != null && (zjVar = this.f45013z0) != null && zjVar.f47745y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = wjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44989x0.getChildAt(childCount);
                this.f44989x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j3 && (abs = Math.abs((Q8 = Q8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = Q8;
                    i12 = abs;
                }
            }
            this.f44869n7 = i10;
            this.f44880o7 = i11;
            return;
        }
        this.f44869n7 = -1;
    }

    public final void Wb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.a50 a50Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((a50Var = this.f44850m2) != null && a50Var.getVisibility() == 0)) {
                this.f44850m2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f44850m2.f(view, true);
                }
            }
        }
    }

    public final void Wc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        qj qjVar = this.f44701a1;
        if (qjVar != null && (tL_forumTopic = this.f44731c4) != null) {
            qjVar.setTitle(tL_forumTopic.title);
        }
        Xc();
    }

    public final void X6() {
        MessageObject messageObject;
        if (!this.D4 && (messageObject = this.J7) != null) {
            if (this.f44955u6.indexOf(messageObject) >= 0) {
                this.E4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.C4 != null) {
        } else {
            qf qfVar = new qf(this, 20);
            this.C4 = qfVar;
            AndroidUtilities.runOnUIThread(qfVar);
        }
    }

    public final void X7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.u1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.X7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1):void");
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
        float f7 = this.f44987wc.f16365e;
        j6.l lVar = this.Bc;
        float b10 = com.google.android.gms.internal.vision.e2.b(1.0f, f7, 1.0f - ((float[]) lVar.f14061b)[5], 1.0f);
        jh.c cVar = this.P0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(b10);
        }
        ok okVar = this.Y;
        if (okVar != null) {
            okVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        rk rkVar = this.R2;
        if (rkVar != null) {
            rkVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        sk skVar = this.O0;
        if (skVar != null) {
            skVar.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        rk rkVar2 = this.R;
        if (rkVar2 != null) {
            rkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        hh.f fVar = this.S;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - b10) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * b10);
        }
        sk skVar2 = this.O0;
        me.b bVar = this.f44961uc;
        if (skVar2 != null) {
            skVar2.setTotalVisibilityFactor((1.0f - bVar.f16365e) * ((float[]) lVar.f14061b)[3]);
        }
        xp xpVar = this.P9;
        if (xpVar != null) {
            float f10 = bVar.f16365e;
            if (xpVar.S != f10) {
                xpVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        t7();
    }

    public final void Xa() {
        int i10;
        int i11;
        wj wjVar = this.f44989x0;
        if (wjVar != null && this.f45013z0 != null) {
            for (int childCount = wjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44989x0.getChildAt(childCount);
                this.f44989x0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        if (((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = Q8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                        i10 = Q8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f45013z0.h1(i11, i10);
        }
    }

    public final void Xb(MessageSuggestionParams messageSuggestionParams) {
        if (this.p5 == null) {
            return;
        }
        new yh.c0(getParentActivity(), this.currentAccount, this.T5, messageSuggestionParams, this, getResourceProvider(), 0, new bf(this, 0)).show();
    }

    public final void Xc() {
        qj qjVar;
        qj qjVar2;
        if (UserObject.isBotForum(this.f44764f) && (qjVar2 = this.f44701a1) != null) {
            qjVar2.getAvatarImageView().setVisibility(0);
            this.f44701a1.b();
        } else if (this.f44731c4 != null && (qjVar = this.f44701a1) != null) {
            qjVar.getAvatarImageView().setVisibility(0);
            ng.d.p(this.f44701a1.getAvatarImageView(), this.f44731c4, true, true, this.f44762ea);
        }
    }

    public final void Y6(boolean z10) {
        if (this.f44867n5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f44955u6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f44867n5.getId() && messageObject.getDialogId() == this.f44867n5.getDialogId()) {
                        this.f44867n5 = messageObject;
                        pn pnVar = this.f44841l5;
                        if (pnVar != null) {
                            pnVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f44770f5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f44867n5;
                                MessageObject.GroupedMessages groupedMessages = this.f44817j5;
                                if (groupedMessages == null) {
                                    groupedMessages = D8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.T5, this.f44841l5);
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
        zi P9 = P9(u1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(hf.b.d(str, false));
        sa saVar = new sa(this, u1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                saVar.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new q1(this, tL_contact, saVar, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = hf.b.d(str, false);
        P9.f17168b = new hf(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new aa(this, P9, saVar, 3)), 0);
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
            AndroidUtilities.runOnUIThread(new le(this, 20), 200L);
            if (z11) {
                this.D3 = false;
            }
        }
        if (z10 && !this.Pa) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int Ya(MessageObject messageObject) {
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
        if (!TextUtils.isEmpty(this.P7) && messageObject != null) {
            if (messageObject.getGroupId() != 0) {
                MessageObject.GroupedMessages D8 = D8(messageObject.getGroupId());
                org.telegram.ui.Cells.u1 u1Var2 = this.f44845l9;
                if (u1Var2 != null && (textLayoutBlocks2 = u1Var2.f23456ye) != null && D8 != null && (messageObject2 = D8.captionMessage) != null) {
                    i10 = u1Var2.f23442xe;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (u1Var2 != null) {
                        u1Var2.f23442xe = 0;
                        u1Var2.f23456ye = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (u1Var = this.f44845l9) != null && (textLayoutBlocks = u1Var.f23134c4) != null) {
                i10 = (int) u1Var.f23328q4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.u1 u1Var3 = this.f44845l9;
                if (u1Var3 != null && u1Var3.f23370t1) {
                    i10 = u1Var3.f23270m2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.u1 u1Var4 = this.f44845l9;
            if (u1Var4 != null) {
                u1Var4.f23442xe = 0;
                u1Var4.f23456ye = null;
            }
            if (arrayList == null || charSequence == null || (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.P7, this.S7)) < 0) {
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
                    if (C9()) {
                        f7 = 0.7f;
                    } else {
                        f7 = 0.5f;
                    }
                    if (lineTop <= f10 * f7) {
                        return 0;
                    }
                    float f12 = AndroidUtilities.displaySize.y;
                    if (C9()) {
                        f11 = 0.7f;
                    }
                    return (int) (lineTop - (f12 * f11));
                }
            }
            return 0;
        }
        org.telegram.ui.Cells.u1 u1Var5 = this.f44845l9;
        if (u1Var5 != null) {
            u1Var5.f23442xe = 0;
            u1Var5.f23456ye = null;
        }
        return 0;
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f44809i9 && this.f44821j9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f44809i9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f44797h9 == null) {
                        rl rlVar = new rl(getParentActivity(), this.f44762ea, this);
                        this.f44797h9 = rlVar;
                        this.X0.addView(rlVar, w7.x5.a(56.0f, 8.0f, 0.0f, 8.0f, 8.0f, -2, 83));
                    }
                    this.f44797h9.c();
                }
            }
        }
    }

    public final void Yc() {
        int i10;
        org.telegram.ui.ActionBar.s0 s0Var = this.f44838l0;
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
        sk skVar;
        rk rkVar;
        rk rkVar2;
        ok okVar = this.Y;
        if (okVar != null && okVar.f23989z3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.f44752e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((skVar = this.O0) == null || skVar.getVisibility() != 0) && (((rkVar = this.R) == null || rkVar.getVisibility() != 0) && ((rkVar2 = this.R2) == null || rkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void Z7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.Z7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final long Z8() {
        return this.f44743d4;
    }

    public final void Z9() {
        this.D4 = true;
        tm tmVar = this.f44736c9;
        AndroidUtilities.cancelRunOnUIThread(tmVar.f21854f0);
        tmVar.f21880z = false;
        le leVar = new le(this, 8);
        int i10 = this.D7;
        if (i10 != 0) {
            bb(i10, 0, false, this.C7, true, 0, null, null, leVar);
            return;
        }
        int i11 = this.B7;
        if (i11 > 0) {
            bb(i11, 0, true, this.C7, true, 0, null, null, leVar);
            return;
        }
        ab(!this.cb, leVar);
        this.cb = false;
        if (!this.H4.isEmpty()) {
            this.O4 = true;
            this.N4 = ((Integer) this.H4.get(0)).intValue();
        }
    }

    public final void Za() {
        ab(false, null);
    }

    public final void Zb(boolean z10, boolean z11) {
        ok okVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f44926s2 != null) && this.R3 == 0 && (okVar = this.Y) != null && okVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f44926s2 == null) {
                    sm smVar = this.X0;
                    int indexOfChild = smVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(9, getParentActivity(), this.f44762ea, false);
                        this.f44926s2 = a50Var;
                        smVar.addView(a50Var, indexOfChild + 1, w7.x5.a(-2.0f, 10.0f, 0.0f, 10.0f, 0.0f, -2, 51));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f44926s2.b(true);
                    return;
                }
                if (this.Y.f23872e2) {
                    org.telegram.ui.Components.a50 a50Var2 = this.f44926s2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    a50Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f44926s2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f44926s2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Zc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        wj wjVar = this.f44989x0;
        if (wjVar != null) {
            if (!this.D4 && this.J7 != null) {
                int childCount = wjVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f44989x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.J7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f44955u6;
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
            int childCount2 = this.f44989x0.getChildCount();
            ok okVar = this.Y;
            if (okVar != null) {
                okVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f44989x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                    MessageObject messageObject3 = u1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        u1Var.X3(messageObject3, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
                        mm mmVar = this.A0;
                        this.f44989x0.getClass();
                        mmVar.Q(RecyclerView.R(u1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f45013z0.h1(i10, i11);
            }
        }
    }

    public long a() {
        return this.T5;
    }

    public final boolean a7(boolean z10, boolean z11) {
        ok okVar = this.Y;
        if (okVar == null || !okVar.t0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44762ea);
            if (this.Y.f23858c1) {
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new ai.k(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f20368a);
            return true;
        }
        return true;
    }

    public final void a8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.a8(int, java.lang.Object[]):void");
    }

    public final float a9(float f7) {
        zn znVar = this.f44749da;
        if (znVar == null) {
            znVar = this;
        }
        org.telegram.ui.Components.fh fhVar = znVar.M0;
        if (fhVar == null) {
            return 0.0f;
        }
        return fhVar.c(f7);
    }

    public final void ab(boolean z10, le leVar) {
        ArrayList arrayList;
        int i10;
        if (this.f44989x0.V1) {
            return;
        }
        this.N4 = 0;
        this.f44907qb = 0;
        this.O4 = false;
        this.W8.e(0);
        if (this.E6[0] && this.H7 == 0 && this.f44956u7 == 0) {
            this.f44814j1.d(false);
            if (this.f45013z0.I0() == 0) {
                this.f44786g9 = false;
                zc();
                Ma();
                ad(false);
                return;
            }
            this.A0.T();
            mn mnVar = this.Ma;
            mnVar.f39976a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f44955u6;
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
            vk vkVar = this.W8;
            mnVar.f39977b = i11;
            mnVar.d = 0;
            boolean z11 = !z10;
            mnVar.f39978c = z11;
            vkVar.c(i11, 0, z11, true);
            this.f44786g9 = false;
            zc();
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = this.f44895pb;
        if (a2Var != null) {
            a2Var.dismiss();
        }
        Bc(false);
        if (leVar != null) {
            leVar.run();
        } else {
            Qa();
            org.telegram.ui.ActionBar.a2 a2Var2 = new org.telegram.ui.ActionBar.a2(getParentActivity(), 3, this.f44762ea);
            this.f44895pb = a2Var2;
            a2Var2.setOnCancelListener(this.f44858ma);
            this.f44895pb.q(1000L);
        }
        this.Y8 = this.V5;
        this.f44708a9 = false;
        this.Z8 = 0;
        this.f44722b9 = false;
        ArrayList arrayList2 = this.f44794h6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.V5));
        AndroidUtilities.runOnUIThread(new qf(this, 12), 0L);
    }

    public final boolean ac(MessageObject messageObject) {
        if (this.R3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void ad(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.ad(boolean):void");
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
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.T5, this.f44867n5, this.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = H8();
        of2.payStars = j3;
        of2.monoForumPeer = S8();
        of2.suggestionParams = this.f44782g5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.R3 == 0) {
            T9(false);
        }
        if (i10 == 0 || i10 == 1) {
            B6();
        }
        if (this.f44902q5) {
            this.Q5 = true;
        }
    }

    public final void b7() {
        if (!this.Sb) {
            this.Sb = true;
            if (!this.Tb && this.R3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f44963v1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f44963v1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f44976w1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f44976w1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    c7();
                }
            }
        }
    }

    public final void b8(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.b8(int, java.lang.Object[]):void");
    }

    public final float b9(org.telegram.ui.Components.a41 a41Var) {
        float f7;
        org.telegram.ui.Components.e41 e41Var = this.R1;
        if (e41Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j3 = e41Var.j(a41Var);
            if (a41Var == org.telegram.ui.Components.a41.f24433b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * j3;
        }
        return 0.0f;
    }

    public final void ba(long j3, String str, boolean z10) {
        ca();
        ai.h4 h4Var = this.J1;
        if (h4Var != null) {
            h4Var.R1(j3, str, z10, false);
        }
    }

    public final void bb(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void bc(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            zg.t tVar = this.Y9;
            if (tVar != null && tVar.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            if (this.f44813j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21286n0) {
                    kVar.h(true);
                    this.Y.c1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ii.e2 e2Var = new ii.e2(richMessage);
                e2Var.J = this;
                e2Var.f12379r = messageObject;
                presentFragment(e2Var);
                return;
            }
            this.I1.getAdapter().f10673f0 = false;
            this.Y.setVisibility(0);
            Cb(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            lc(false);
            if (!z10) {
                Q6();
            }
            if (z10) {
                this.f44782g5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.T0(false, false, true);
            Cc(0, true);
            ad(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.R3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.T5);
                tL_messages_getMessageEditData.f20124id = messageObject.getId();
                this.f44878o5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new oe(this, 3));
                return;
            }
            ok okVar = this.Y;
            org.telegram.ui.Components.af afVar = okVar.F1;
            if (afVar != null) {
                afVar.setEnabled(true);
                okVar.F1.h(false);
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
        ci.d4 d4Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        ci.d4 d4Var2 = this.f44990x1;
        if (d4Var2 != null && !d4Var2.V && !this.Vb && this.Sb && !this.yc.f16366f && System.currentTimeMillis() - this.Ub > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f44989x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f44989x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        u1Var = (org.telegram.ui.Cells.u1) childAt;
                        zg.o0 o0Var = u1Var.N;
                        MessageObject primaryMessageObject = u1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !o0Var.v.isEmpty()) {
                            u1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + o0Var.d;
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
                zg.o0 o0Var2 = u1Var.N;
                this.Vb = true;
                u1Var.getLocationInWindow(iArr);
                this.f44990x1.setTranslationY(((iArr[1] - d4Var.getTop()) - AndroidUtilities.dp(120.0f)) + o0Var2.d);
                this.f44990x1.m(0.0f, (((zg.l0) o0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + o0Var2.f54711c);
                this.f44990x1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(this, 19));
            AndroidUtilities.runOnUIThread(new le(this, 19), 2000L);
        }
    }

    public final void c8(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.c8(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages c9(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f44995x6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void ca() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            ok okVar = this.Y;
            if (okVar == null || TextUtils.isEmpty(okVar.getSlowModeTimer())) {
                ok okVar2 = this.Y;
                if (okVar2 != null && okVar2.f23900i5.f16366f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                H7();
                ai.h4 h4Var = this.J1;
                if (!z10 && this.R3 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                h4Var.U1 = z11;
                h4Var.f33228j0.f0();
                TLRPC.Chat chat = this.f44752e;
                if ((chat == null || this.f44782g5 == null) && !z10 && this.R3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f44752e.slowmode_enabled) {
                        this.J1.N1(10, true);
                    } else {
                        this.J1.N1(-1, true);
                    }
                } else {
                    this.J1.N1(1, true);
                }
                ai.h4 h4Var2 = this.J1;
                h4Var2.V0 = true;
                h4Var2.A1.setVisibility(0);
                h4Var2.T0 = 0;
                h4Var2.F = false;
                h4Var2.G = false;
                h4Var2.f33225i0 = true;
                h4Var2.J = null;
                org.telegram.ui.ActionBar.u0 u0Var = h4Var2.f33240n1;
                if (u0Var != null) {
                    h4Var2.f33236m1.setTranslationY(0.0f);
                    u0Var.setVisibility(8);
                }
                this.J1.t1();
                this.J1.o1().setText(this.Y.getFieldText());
                ai.h4 h4Var3 = this.J1;
                h4Var3.f33251r = this.f44762ea;
                showDialog(h4Var3);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ne neVar;
        if ((this.R3 != 5 || (!this.f44955u6.isEmpty() && this.f44743d4 != 0)) && !this.yc.f16366f && this.f44871n9) {
            ok okVar = this.Y;
            if (!okVar.F2) {
                if (!okVar.f23858c1 || (neVar = okVar.f23871e1) == null || neVar.getVisibility() != 0) {
                    if ((!okVar.h0() || !okVar.f23912l0.v) && !org.telegram.ui.ActionBar.m2.hasSheets(okVar.P2) && this.N9 == 0.0f) {
                        uh.i iVar = this.X9;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.cb(java.lang.CharSequence, boolean):void");
    }

    public final void cc() {
        org.telegram.ui.Components.i10 i10Var = this.f44857m9;
        if (i10Var != null && !i10Var.f27130c) {
            i10Var.c(false);
            try {
                this.f44857m9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f44792h4 && (i10 = this.R3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f44743d4;
    }

    public final void d7(boolean z10) {
        int i10;
        if (this.f45013z0 != null && !this.f44902q5 && !this.A0.L && !this.f7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f44989x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f44989x0.getChildAt(i14));
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
            mm mmVar = this.A0;
            if (mmVar.N) {
                int i15 = mmVar.E;
                if (i15 >= 0 && i13 >= 0 && i15 >= i13 && i15 <= i12) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = mmVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            int i16 = i10;
            if (this.R3 == 7) {
                if ((h - i13) - i11 <= i16 && !this.G6 && !this.C6[0]) {
                    this.G6 = true;
                    this.f44794h6.add(Integer.valueOf(this.V5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f44952u3;
                    int i17 = this.classGuid;
                    int i18 = this.O3;
                    int i19 = this.V5;
                    this.V5 = i19 + 1;
                    hashtagSearchController.searchHashtag(str, i17, i18, i19);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.ef(this, h, i13, i11, i16, 1));
        }
    }

    public final void d8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.d8(int, java.lang.Object[]):void");
    }

    public final void d9(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f44965v3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.O3);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j3 = this.T5;
        long j10 = this.L6;
        int i14 = this.classGuid;
        boolean z11 = this.Qa;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j3, j10, i14, i10, this.f44743d4, this.f44876o3, this.f44888p3, this.f44900q3);
        Pb(false);
    }

    public final void da() {
        qt.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        H7();
        this.J1.f33228j0.f0();
        this.J1.N1(1, false);
        ai.h4 h4Var = this.J1;
        h4Var.X1 = true;
        h4Var.k1(null);
        this.J1.t1();
        ai.h4 h4Var2 = this.J1;
        h4Var2.f33251r = this.f44762ea;
        if (this.visibleDialog != null) {
            h4Var2.show();
        } else {
            showDialog(h4Var2);
        }
    }

    public final void db(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f44876o3 = user;
        this.f44888p3 = chat;
        if (this.f44813j0 != null && this.I1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f44876o3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f44865n3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a1.g.D(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.h6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f44813j0.setSearchFieldCaption(spannableString);
                    this.I1.getAdapter().U(null, 0, null, false, true);
                    this.f44813j0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f44813j0;
                    u0Var.f21555r = null;
                    ci.g2 g2Var = u0Var.f21540e;
                    if (g2Var != null) {
                        g2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f44940t3 = "";
                    mediaDataController.searchMessagesInChat("", this.T5, this.L6, this.classGuid, 0, this.f44743d4, this.f44876o3, this.f44888p3, this.f44900q3);
                }
            }
        }
    }

    public final void dc() {
        long j3;
        le leVar = this.U7;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
        }
        le leVar2 = new le(this, 18);
        this.U7 = leVar2;
        if (this.P7 != null) {
            j3 = 2500;
        } else {
            j3 = 1000;
        }
        AndroidUtilities.runOnUIThread(leVar2, j3);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j3;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.b5 b5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z10;
        qj qjVar;
        ok okVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.su editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.zy0 zy0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        ok okVar2;
        zn znVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            znVar.f8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            wj wjVar = znVar.f44989x0;
            if (wjVar != null) {
                wjVar.f1();
            }
            org.telegram.ui.Components.xi xiVar = znVar.M9;
            if (xiVar != null) {
                xiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == znVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        znVar.finishFragment();
                        b.b(znVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ai.h4 h4Var = znVar.J1;
                if (h4Var != null && h4Var.isShowing()) {
                    znVar.J1.dismiss(true);
                }
                if (z11 && (okVar2 = znVar.Y) != null && okVar2.r0()) {
                    znVar.Y.k0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f20052id = stickerSet2.f20059id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = znVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.zy0) && (tL_messages_stickerSet = (zy0Var = (org.telegram.ui.Components.zy0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f20059id == stickerSet2.f20059id) {
                            zy0Var.E0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.ad adVar = new org.telegram.ui.Components.ad(zy0Var.container, znVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.sc r10 = adVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r10.f30711j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.zy0 zy0Var2 = new org.telegram.ui.Components.zy0(znVar.getParentActivity(), znVar, tL_inputStickerSetID, null, znVar.Y, znVar.f44762ea);
                            final boolean z15 = z12;
                            znVar = this;
                            zy0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    zn.T0(zn.this, objArr, zy0Var2, z15, stickerSet2);
                                }
                            });
                            znVar.showDialog(zy0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                wj wjVar2 = znVar.f44989x0;
                if (wjVar2 != null) {
                    wjVar2.f1();
                }
                TextView textView = znVar.Q2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.h5 h5Var = znVar.D2[i13];
                    if (h5Var != null) {
                        h5Var.invalidate();
                    }
                }
                gk gkVar = znVar.I1;
                if (gkVar != null) {
                    gkVar.getListView().f1();
                }
                ai.w0 w0Var = znVar.L3;
                if (w0Var != null) {
                    w0Var.f1();
                }
                UndoView undoView = znVar.y3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                ok okVar3 = znVar.Y;
                if (okVar3 != null && (editField = okVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                ai.q4[] q4VarArr = znVar.E2;
                ai.q4 q4Var = q4VarArr[0];
                if (q4Var != null) {
                    q4Var.invalidate();
                }
                ai.q4 q4Var2 = q4VarArr[1];
                if (q4Var2 != null) {
                    q4Var2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (znVar.Z7 != null && (chat = znVar.f44752e) != null && chat.f20032id == l4.longValue()) {
                    znVar.Z7.online_count = ((Integer) objArr[1]).intValue();
                    qj qjVar2 = znVar.f44701a1;
                    if (qjVar2 != null) {
                        qjVar2.m();
                        znVar.f44701a1.o(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == znVar.T5 && (okVar = znVar.Y) != null) {
                    okVar.P1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                ok okVar4 = znVar.Y;
                if (okVar4 != null) {
                    okVar4.Q1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (znVar.f44752e != null) {
                        TLRPC.Chat chat2 = znVar.getMessagesController().getChat(Long.valueOf(znVar.f44752e.f20032id));
                        if (chat2 != null) {
                            znVar.f44752e = chat2;
                        }
                    } else if (znVar.f44764f != null && (user = znVar.getMessagesController().getUser(Long.valueOf(znVar.f44764f.f20179id))) != null) {
                        znVar.f44764f = user;
                    }
                    znVar.Rc(true);
                }
                if (!znVar.K9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (znVar.f44752e != null && (qjVar = znVar.f44701a1) != null) {
                        qjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    znVar.p();
                    znVar.ad(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && znVar.f44752e != null) {
                    znVar.D9();
                    TLRPC.Chat chat3 = znVar.getMessagesController().getChat(Long.valueOf(znVar.f44752e.f20032id));
                    if (chat3 != null) {
                        znVar.f44752e = chat3;
                        znVar.D9();
                        z10 = !znVar.K9();
                        znVar.lc(false);
                        ok okVar5 = znVar.Y;
                        if (okVar5 != null) {
                            okVar5.Z0(znVar.currentAccount, znVar.T5);
                        }
                        FlagSecureReason flagSecureReason = znVar.E3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                qj qjVar3 = znVar.f44701a1;
                if (qjVar3 != null && z10) {
                    qjVar3.o(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    znVar.Uc(true);
                }
                org.telegram.ui.ActionBar.u0 u0Var = znVar.f44788h0;
                if (u0Var != null) {
                    if (ChatObject.isChannel(znVar.f44752e) && !ChatObject.isMonoForum(znVar.f44752e)) {
                        long j10 = znVar.f44752e.linked_monoforum_id;
                        if (j10 != 0 && ChatObject.canManageMonoForum(znVar.currentAccount, -j10)) {
                            z13 = true;
                        }
                    }
                    u0Var.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!znVar.Pa) {
                    if (longValue == znVar.T5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = znVar.R3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !znVar.isPaused && LaunchActivity.U() == znVar && znVar.f44770f5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                znVar.oa(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            znVar.Da(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(znVar.f44752e) && !znVar.f44752e.megagroup && (chatFull = znVar.Z7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                znVar.f44968v6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        znVar.z7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                znVar.N9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                znVar.w6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == znVar.T5) {
                        znVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (b5Var = znVar.parentLayout) != null && b5Var.getFragmentStack().size() > 1) {
                    znVar.finishFragment();
                } else {
                    znVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == znVar.a() && (booleanValue || znVar.parentLayout.getLastFragment() != znVar)) {
                    if (znVar.parentLayout.getLastFragment() == znVar) {
                        znVar.finishFragment();
                    } else {
                        znVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = znVar.f44879o6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = znVar.f44752e;
                    if (chat4 != null && chat4.f20032id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (znVar.f44902q5) {
                            zh zhVar = znVar.f44866n4;
                            if (zhVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(zhVar);
                                znVar.f44866n4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            zh zhVar2 = new zh(znVar, messageObject2, intValue3);
                            znVar.f44866n4 = zhVar2;
                            AndroidUtilities.runOnUIThread(zhVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = znVar.f44752e;
                    if (chat5 != null && chat5.f20032id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = znVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(znVar.f44752e, znVar.getMessagesController().getChatFull(znVar.f44752e.f20032id)));
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
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && znVar.T5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j3 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j3 = ((Long) objArr[1]).longValue();
                        } else {
                            j3 = 0;
                        }
                        long j11 = znVar.f44743d4;
                        if (j3 == j11 || j11 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = znVar.f44829k4;
                            ArrayList arrayList2 = znVar.f44955u6;
                            if (intValue4 > i19) {
                                znVar.f44829k4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= znVar.f44829k4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        mm mmVar = znVar.A0;
                                        if (mmVar != null) {
                                            mmVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > znVar.l4) {
                                znVar.l4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= znVar.l4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        mm mmVar2 = znVar.A0;
                                        if (mmVar2 != null) {
                                            mmVar2.R(messageObject5, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        znVar.a8(i10, objArr);
        znVar.b8(i10, objArr);
        znVar.c8(i10, objArr);
        znVar.d8(i10, objArr);
        znVar.e8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ai.h4 h4Var = this.J1;
        if (h4Var != null && this.visibleDialog == h4Var) {
            h4Var.f33228j0.a0(false);
            this.J1.dismissInternal();
            this.J1.f33228j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.J1 && dialog != this.f44723ba && !(dialog instanceof ei.k3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f44918r8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f44918r8 = true;
            org.telegram.ui.Components.g5.r0(getParentActivity(), this.currentAccount, new le(this, 10), true, this.f44762ea);
        }
    }

    public final void e8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.e8(int, java.lang.Object[]):void");
    }

    public final void e9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.e9():void");
    }

    public final void ea(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.u1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.ea(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.u1, org.telegram.messenger.MessageObject):void");
    }

    public final void eb(View view, MessageObject messageObject, org.telegram.ui.Components.ml0 ml0Var, View view2, float f7, float f10, zg.n0 n0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        yh.w3 w3Var;
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
            if (n0Var != null && n0Var.f54700a) {
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
                    long j3 = -yh.h5.b(messageObject).f52723a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j3);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j3));
                        org.telegram.ui.Components.ad a02 = org.telegram.ui.Components.ad.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    yh.m5 m5Var = yh.n5.y(this.currentAccount, false).B;
                    if (m5Var != null) {
                        m5Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j10 = this.T5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    yh.h8 h8Var = new yh.h8(parentActivity, i15, j10, this, messageObject, arrayList2, z14, false, 0L, this.f44762ea);
                    messageObject.getId();
                    h8Var.U = this;
                    h8Var.V = a0Var;
                    h8Var.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j11 = -yh.h5.b(messageObject).f52723a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j11);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j11));
                    org.telegram.ui.Components.ad a03 = org.telegram.ui.Components.ad.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                yh.m5 d02 = yh.n5.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f44908qc == null) {
                        this.f44908qc = new yh.w3(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        w3Var = null;
                    } else {
                        if (this.f44908qc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f44908qc);
                            layoutContainer.addView(this.f44908qc, w7.x5.d(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f44908qc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f44908qc.bringToFront();
                        }
                        w3Var = this.f44908qc;
                    }
                    w3Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f52967o = w3Var;
                    w3Var.I = false;
                    w3Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    w3Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.u1) {
                        i12 = ((org.telegram.ui.Cells.u1) a0Var).V;
                    } else {
                        i12 = 0;
                    }
                    w3Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            zg.n0 n0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new rg.y0((org.telegram.ui.ActionBar.m2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(n0Var) && (chat = this.f44752e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.f44752e, 26)) {
                org.telegram.messenger.q.q(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.ad.a0(this), R.raw.e_hand_2, 36);
            } else {
                zg.j0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(n0Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.i iVar = this.f44995x6;
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
                    org.telegram.ui.Cells.a0 t82 = t8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && t82 != null && n0Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j12 = n0Var.f54705g;
                        if (j12 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(n0Var.f54704f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.s5.f(this.currentAccount, j12);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.sc r10 = org.telegram.ui.Components.ad.a0(this).r(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f30711j = 5000;
                            r10.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (ml0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        zg.j0.d(this, ml0Var, t82, view2, f7, f10, n0Var, i19, i10);
                    }
                }
                if (selectReaction && n0Var != null && (str = n0Var.f54704f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<zg.n0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    n0Var2 = n0Var;
                }
                wi wiVar = new wi(this, z13, z10, i18, selectReaction, ml0Var, f7, f10, n0Var, messageObject);
                this.f44738cc = wiVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, n0Var2, z11, z12, this, wiVar);
                if (z10 || z13) {
                    uc(messageObject, true);
                    this.f44738cc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f44738cc, 50L);
                }
            }
        }
    }

    public final void ec() {
        AndroidUtilities.forEachViews((RecyclerView) this.f44989x0, (Utilities.Callback<View>) new ai.j3(4, this, y9()));
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        ok okVar = this.Y;
        if (okVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.T5, (int) d());
            me.b bVar = okVar.f23894h5;
            gi.a aVar = okVar.I0;
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
            if (z10 && bVar.f16365e > 0.0f) {
                z13 = true;
            } else {
                z13 = false;
            }
            ((me.b) aVar.f10894c).a(z12, z13);
            aVar.setClickable(z12);
            aVar.setEnabled(z12);
            if (bVar.f16366f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            okVar.T4 = streamingSendButtonState;
            if (z14) {
                okVar.I(z10);
            }
        }
    }

    public final void f8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.f8(java.lang.Object[]):void");
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

    public final void fa(long j3, final MessageObject messageObject, int i10, final long j10, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j3));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f20032id + " msg_id = " + i13);
        }
        this.f44812ic = 0;
        this.f44824jc = false;
        this.f44848lc = null;
        this.f44860mc = null;
        wj wjVar = this.f44989x0;
        if (wjVar != null) {
            wjVar.f1();
        }
        if (this.f44799hc != -1) {
            getConnectionsManager().cancelRequest(this.f44799hc, false);
        }
        if (this.gc != -1) {
            getConnectionsManager().cancelRequest(this.gc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f44812ic = i13;
        this.f44824jc = false;
        this.f44837kc = System.currentTimeMillis();
        wj wjVar2 = this.f44989x0;
        if (wjVar2 != null) {
            wjVar2.f1();
        }
        final int i14 = this.ec + 1;
        this.ec = i14;
        this.gc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final zn znVar = zn.this;
                final int i15 = i14;
                final int i16 = i11;
                final long j11 = j10;
                final int i17 = i12;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new ug(3, znVar, new Runnable(i15, i16, j11, tLObject, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f39940b;
                    public final int f39941c;
                    public final TLObject d;
                    public final int f39942e;
                    public final MessageObject f39943f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f39944n;
                    public final MessageObject f39945r;

                    {
                        this.d = tLObject;
                        this.f39942e = i17;
                        this.f39943f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f39944n = chat2;
                        this.f39945r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i18;
                        final zn znVar2 = zn.this;
                        if (this.f39940b != znVar2.ec) {
                            return;
                        }
                        znVar2.gc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            znVar2.f44848lc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            znVar2.getMessagesController().putUsers(znVar2.f44848lc.users, false);
                            znVar2.getMessagesController().putChats(znVar2.f44848lc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = znVar2.f44848lc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i19 = 0; i19 < znVar2.f44848lc.messages.size(); i19++) {
                                TLRPC.Message message = znVar2.f44848lc.messages.get(i19);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i20 = this.f39941c;
                        final int i21 = this.f39942e;
                        final MessageObject messageObject5 = this.f39943f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f39944n;
                        final MessageObject messageObject6 = this.f39945r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = znVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f20053id;
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
                            final int i22 = znVar2.f44776fc + 1;
                            znVar2.f44776fc = i22;
                            znVar2.f44799hc = znVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new sh(zn.this, i22, tLObject3, tL_error2, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        znVar2.Ca(znVar2.f44848lc, znVar2.f44860mc, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.gc, this.classGuid);
    }

    public final void fb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f20038id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.T5, this.f44867n5, this.X3, null, false, arrayList, null, null, true, 0, 0, null, false);
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
            org.telegram.ui.ActionBar.e3 E = org.telegram.ui.Components.g5.E(this.T5, d(), this, this.f44762ea);
            E.setCalcMandatoryInsets(C9());
            showDialog(E);
            return;
        }
        getNotificationsController().muteDialog(this.T5, d(), false);
        if (!z10) {
            org.telegram.ui.Components.ad.z(this, 4, 0, this.f44762ea).j();
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.m1 m1Var = this.Q8;
        if (m1Var != null) {
            m1Var.f21372e = false;
            D7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f44752e;
    }

    public final void g7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.g7():void");
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.T5, this.f44867n5, this.X3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = H8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.T5, this.f44867n5, this.X3, null, this.f44841l5, z10, i10, 0, H8(), 0L, S8());
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
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f44867n5, this.X3, null, this.f44841l5, false, true, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f44782g5);
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
        tm tmVar = this.f44736c9;
        if (tmVar != null && tmVar.x()) {
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
            zg.t tVar = this.Y9;
            if (tVar != null && tVar.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            Bundle d = org.telegram.messenger.ai.d(3, "onlySelect", "dialogsType", true);
            d.putInt("messagesCount", this.f44733c6);
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            d.putBoolean("canSelectTopics", true);
            sy syVar = new sy(d);
            syVar.C2 = this;
            presentFragment(syVar);
            return;
        }
        if (D9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.f44752e) && !this.f44752e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z10) {
            if (this.f44827k2 == null) {
                sm smVar = this.X0;
                int indexOfChild = smVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(7, getParentActivity(), null, true);
                    this.f44827k2 = a50Var;
                    smVar.addView(a50Var, indexOfChild + 1, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 51));
                    this.f44827k2.setAlpha(0.0f);
                    this.f44827k2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f44827k2.setText(string);
            this.f44827k2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f44839l2 == null) {
            sm smVar2 = this.X0;
            int indexOfChild2 = smVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.a50 a50Var2 = new org.telegram.ui.Components.a50(getParentActivity(), 9);
            this.f44839l2 = a50Var2;
            smVar2.addView(a50Var2, indexOfChild2 + 1, w7.x5.a(-2.0f, 12.0f, 0.0f, 12.0f, 0.0f, -2, 51));
            this.f44839l2.setAlpha(0.0f);
            this.f44839l2.setVisibility(4);
        }
        this.f44839l2.setText(string);
        this.f44839l2.f(this.P0.getForwardButton(), true);
    }

    public final void gb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j3) {
        long j10;
        String str;
        gk gkVar = this.I1;
        if (gkVar == null) {
            return;
        }
        TLRPC.User user = gkVar.getAdapter().f10693w0;
        if (user != null) {
            j10 = user.f20179id;
        } else {
            j10 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f20030id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j10);
        TLRPC.User user2 = this.I1.getAdapter().f10693w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.T5, this.f44867n5, this.X3, null, this.f44841l5, z10, i10, 0, H8(), j3, S8());
        this.Y.setFieldText("");
        j9(false);
        getMediaDataController().increaseInlineRating(j10);
    }

    public final void gc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.sc scVar = this.A3;
        if (scVar != null) {
            scVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f44744d5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.Q4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.T5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.Q4 - 1), Boolean.valueOf(this.S4));
        this.A3 = org.telegram.ui.Components.ad.B(this, false, new ai.d9(this, arrayList2, arrayList, i10, 13), new ue(this, messageObject, 7), this.f44762ea).j();
    }

    @Override
    public final org.telegram.ui.ActionBar.x4 getBackButtonState() {
        return org.telegram.ui.ActionBar.x4.f21682a;
    }

    @Override
    public final org.telegram.ui.ActionBar.y3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.y3.f21698c;
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
            ArrayList arrayList = this.f44955u6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + F8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f44762ea;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        int i11;
        int i12;
        if (this.e7) {
            return null;
        }
        if (this.f44709aa) {
            this.f44709aa = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Qd));
        if (!F9()) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21120v8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.h6.f21173y8;
            arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21191z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21065s8));
        qj qjVar = this.f44701a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(qjVar != null ? qjVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        qj qjVar2 = this.f44701a1;
        org.telegram.ui.ActionBar.h5 titleTextView = qjVar2 != null ? qjVar2.getTitleTextView() : null;
        int i14 = org.telegram.ui.ActionBar.h6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(titleTextView, 8, null, null, null, null, i14));
        qj qjVar3 = this.f44701a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(qjVar3 != null ? qjVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.h6.f20765c2, org.telegram.ui.ActionBar.h6.f20782d2}, org.telegram.ui.ActionBar.h6.f21010pa));
        qj qjVar4 = this.f44701a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(qjVar4 != null ? qjVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21084t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.h6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 67108864, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, i15));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.h6.f21173y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar3, 512, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.h6.f21138w8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.h6.f21157x8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.h6.f21191z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44714b1, 4, null, null, null, null, i16));
        qj qjVar5 = this.f44701a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(qjVar5 != null ? qjVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20912k4}, null, org.telegram.ui.ActionBar.h6.f20994oc));
        qj qjVar6 = this.f44701a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(qjVar6 != null ? qjVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.l4}, null, org.telegram.ui.ActionBar.h6.f21012pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21039r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20879i8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20897j8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20916k8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20934l8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20953m8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20973n8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20991o8));
        org.telegram.ui.ActionBar.d5 d5Var = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.d5 d5Var2 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.d5 d5Var3 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.d5 d5Var4 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.d5 d5Var5 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.d5 d5Var6 = (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{d5Var, d5Var2}, null, org.telegram.ui.ActionBar.h6.f21049ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.d5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.h6.f20792dc));
        if (d5Var != null) {
            Drawable[] k10 = d5Var.k();
            int i17 = org.telegram.ui.ActionBar.h6.ta;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, d5Var2.k(), null, i17));
            Drawable[] k11 = d5Var3.k();
            int i18 = org.telegram.ui.ActionBar.h6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, d5Var4.k(), null, i18));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Aa));
        if (this.f44762ea.h(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{d5Var3, d5Var4}, null, org.telegram.ui.ActionBar.h6.Fa));
        }
        wj wjVar = this.f44989x0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = d5Var5;
        drawableArr[i10] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wjVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.h6.Ba));
        wj wjVar2 = this.f44989x0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = d5Var5;
        drawableArr2[i10] = d5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wjVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.h6.f20755bc));
        wj wjVar3 = this.f44989x0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.w0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i19 = org.telegram.ui.ActionBar.h6.f20883ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(wjVar3, 4, clsArr3, themedPaint, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 2, new Class[]{org.telegram.ui.Cells.w0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.h6.f20901jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21134w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.h6.f20920kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20938lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20957mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.h6.ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20828fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 2, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.f20863hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.h6.f20855h3};
        int i20 = org.telegram.ui.ActionBar.h6.f20921kd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr3, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21031qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21051rc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f21069sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21087tc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.h6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.h6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.M3, org.telegram.ui.ActionBar.h6.Q3, org.telegram.ui.ActionBar.h6.U3}, null, org.telegram.ui.ActionBar.h6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.N3, org.telegram.ui.ActionBar.h6.R3, org.telegram.ui.ActionBar.h6.V3}, null, org.telegram.ui.ActionBar.h6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20727a4, org.telegram.ui.ActionBar.h6.f20747b4, org.telegram.ui.ActionBar.h6.Z3}, null, org.telegram.ui.ActionBar.h6.f21195zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.h6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.h6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20767c4}, null, org.telegram.ui.ActionBar.h6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20784d4}, null, org.telegram.ui.ActionBar.h6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20840g4}, null, org.telegram.ui.ActionBar.h6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i21 = org.telegram.ui.ActionBar.h6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr4, null, i21));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.h6.f20856h4, org.telegram.ui.ActionBar.h6.B4, org.telegram.ui.ActionBar.h6.D4};
        int i22 = org.telegram.ui.ActionBar.h6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr5, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.G4, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.H4, null, org.telegram.ui.ActionBar.h6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O4}, null, org.telegram.ui.ActionBar.h6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P4}, null, org.telegram.ui.ActionBar.h6.f21046r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Q4}, null, org.telegram.ui.ActionBar.h6.f21029qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.f20745b2, null, null, org.telegram.ui.ActionBar.h6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20893j4}, null, org.telegram.ui.ActionBar.h6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, eVar, org.telegram.ui.ActionBar.h6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.J2, null, null, org.telegram.ui.ActionBar.h6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.K2, null, null, org.telegram.ui.ActionBar.h6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.T1, null, null, org.telegram.ui.ActionBar.h6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.h6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.h6.f21142wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Rc));
        int i23 = org.telegram.ui.ActionBar.h6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i23));
        int i24 = org.telegram.ui.ActionBar.h6.f20734ab;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20791db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20810eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20736ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20827fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20756bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20846gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20793dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20862hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20811ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20882ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20829fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20847gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20900jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20919kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20864hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20884id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21030qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20902jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21050rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20976nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21068sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20995od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20939ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20958md));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20993ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21011pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21013pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21032qd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20937lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20956mb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21086tb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21070sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21105ub));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21088td));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21122vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21107ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21141wb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21143wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21176yb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21161xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21124vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21194zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21160xb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21177yd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21196zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.U1, null, null, org.telegram.ui.ActionBar.h6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.V1, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.W1, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20885ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21106uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20903je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21123vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.h6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f21052re));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f21071se));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21014pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.h6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.h6.f21033qe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.h6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20809ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20826fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ga));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.h6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.h6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.h6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.h6.xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.h6.Ra));
        if (this.f44762ea.h(false)) {
            i11 = 2;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.h6.f21039r0, null, org.telegram.ui.ActionBar.h6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.f21130w0, null, null, org.telegram.ui.ActionBar.h6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.B0[0], org.telegram.ui.ActionBar.h6.B0[1], org.telegram.ui.ActionBar.h6.D0}, null, null, org.telegram.ui.ActionBar.h6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.C0[0], org.telegram.ui.ActionBar.h6.C0[1], org.telegram.ui.ActionBar.h6.E0}, null, null, org.telegram.ui.ActionBar.h6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20725a1}, null, org.telegram.ui.ActionBar.h6.f20732a9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20837g1, org.telegram.ui.ActionBar.h6.f20853h1}, null, org.telegram.ui.ActionBar.h6.f20898j9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.F0[1], null, null, org.telegram.ui.ActionBar.h6.f20880i9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.G0, null, null, org.telegram.ui.ActionBar.h6.f20954m9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20917k9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.o9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, org.telegram.ui.ActionBar.h6.H0, null, null, org.telegram.ui.ActionBar.h6.f21009p9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, org.telegram.ui.ActionBar.h6.I0, null, null, org.telegram.ui.ActionBar.h6.f21028q9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.T0}, null, org.telegram.ui.ActionBar.h6.f21103u9));
            i11 = 2;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.s2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.V0, org.telegram.ui.ActionBar.h6.W0}, null, org.telegram.ui.ActionBar.h6.v9));
        }
        gk gkVar = this.I1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i25 = org.telegram.ui.ActionBar.h6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar, 0, null, themedPaint2, null, null, i25));
        gk gkVar2 = this.I1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.h6.f20874i3};
        int i26 = org.telegram.ui.ActionBar.h6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.j6(gkVar2, 0, null, null, drawableArr10, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.j3}, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20874i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20874i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20874i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        int i27 = org.telegram.ui.ActionBar.h6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i27));
        int i28 = org.telegram.ui.ActionBar.h6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i28));
        int i29 = org.telegram.ui.ActionBar.h6.f20877i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        int i30 = org.telegram.ui.ActionBar.h6.jf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i27));
        int i31 = org.telegram.ui.ActionBar.h6.f20758bf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20737ae));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.h6.f20757be));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.h6.f20923kf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20978nf));
        ok okVar = this.Y;
        int i32 = org.telegram.ui.ActionBar.h6.f20960mf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f20996of));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20776cf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20738af));
        int i33 = i11;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20831ff));
        ok okVar2 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar2 != null ? okVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.He));
        ok okVar3 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar3 != null ? okVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ke));
        ok okVar4 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar4 != null ? okVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Le));
        ok okVar5 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar5 != null ? okVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Me));
        ok okVar6 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar6 != null ? okVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oe));
        ok okVar7 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar7 != null ? okVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Pe));
        ok okVar8 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar8 != null ? okVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Re));
        ok okVar9 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar9 != null ? okVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Se));
        ok okVar10 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar10 != null ? okVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.We));
        ok okVar11 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar11 != null ? okVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ne));
        ok okVar12 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar12 != null ? okVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Je));
        ok okVar13 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar13 != null ? okVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ue));
        ok okVar14 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(okVar14 != null ? okVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.b00.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qe));
        ok okVar15 = this.Y;
        if (okVar15 != null) {
            org.telegram.ui.Components.z51 trendingStickersAlert = okVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, new Drawable[]{this.Y.getStickersArrowDrawable()}, null, i28));
        }
        int i34 = 0;
        while (i34 < i33) {
            View view = i34 == 0 ? this.y3 : this.f45016z3;
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f21119v7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21137w7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f21101u7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f21083t7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21156x7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f21172y7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45015z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20812ee));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f45015z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20786d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20830fe));
        for (int i37 = 0; i37 < i33; i37++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20830fe));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.D2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f20830fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.ge));
        ImageView imageView = this.J2;
        int i38 = org.telegram.ui.ActionBar.h6.f20794de;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L2, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U1, 8, null, null, null, null, i38));
        TextView textView = this.L1;
        int i39 = org.telegram.ui.ActionBar.h6.f20865he;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.f21026q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H1, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21125ve));
        ImageView imageView2 = this.S2;
        int i40 = org.telegram.ui.ActionBar.h6.f21162xe;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i40));
        ImageView imageView3 = this.S2;
        int i41 = org.telegram.ui.ActionBar.h6.f21191z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView3, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 8, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21197ze));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21090tf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sh));
        org.telegram.ui.Components.vo voVar = this.Y0;
        int i42 = org.telegram.ui.ActionBar.h6.f20883ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(voVar, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44715b2, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44885p0, 2048, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.h6.De));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44989x0, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ee));
        ci.r6 r6Var = this.Q;
        int i43 = org.telegram.ui.ActionBar.h6.f20938lc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r6Var, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44715b2, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y0, 536870912, null, null, null, null, i43));
        if (this.I1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ce));
            int i44 = org.telegram.ui.ActionBar.h6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"nameTextView"}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A6));
            Drawable[] drawableArr11 = new Drawable[3];
            drawableArr11[0] = org.telegram.ui.ActionBar.h6.f20949m4;
            drawableArr11[1] = org.telegram.ui.ActionBar.h6.f20969n4;
            drawableArr11[i33] = org.telegram.ui.ActionBar.h6.f20987o4;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, drawableArr11, null, org.telegram.ui.ActionBar.h6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21189z6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20884id));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20902jd));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20787d7));
        }
        org.telegram.ui.Components.a50 a50Var = this.f44755e2;
        int i45 = org.telegram.ui.ActionBar.h6.f21034qf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(a50Var, 32, null, null, null, null, i45));
        org.telegram.ui.Components.a50 a50Var2 = this.f44755e2;
        int i46 = org.telegram.ui.ActionBar.h6.f21015pf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(a50Var2, 4, null, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44939t2, 4, new Class[]{org.telegram.ui.Components.a50.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44939t2, 8, new Class[]{org.telegram.ui.Components.a50.class}, new String[]{"imageView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44939t2, 4, new Class[]{org.telegram.ui.Components.a50.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44951u2, 4, new Class[]{org.telegram.ui.Components.a50.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f44951u2, 4, new Class[]{org.telegram.ui.Components.a50.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i43));
        int i47 = org.telegram.ui.ActionBar.h6.f20881ia;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20899ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20918ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20936la));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20955ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20975na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20992oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.R4}, null, org.telegram.ui.ActionBar.h6.f20790da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20857h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20876i5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21025q5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20914k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21109uf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21126vf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20740ah));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20760bh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20778ch));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20797dh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20814eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20833fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20887ih));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20905jh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20925kh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20850gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20868hh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20730a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Dj));
        int i48 = org.telegram.ui.ActionBar.h6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.xf));
        ok okVar16 = this.Y;
        if (okVar16 == null || okVar16.m0 == null) {
            i12 = 0;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f9494c, 4, new Class[]{ei.a0.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.h6.G6));
            i12 = 0;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f9494c, 4, new Class[]{ei.a0.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.h6.f21171y6));
        }
        wh.d dVar = this.f44774fa;
        if (dVar != null) {
            dVar.b(arrayList);
        }
        int size = arrayList.size();
        int i49 = i12;
        while (i49 < size) {
            Object obj = arrayList.get(i49);
            i49++;
            ((org.telegram.ui.ActionBar.j6) obj).f21255o = this.f44762ea;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f44762ea.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint F = this.f44762ea.F(str);
        if (F != null) {
            return F;
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
        org.telegram.ui.Components.su editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.t()) {
                this.Bc.i(5, false, true);
                this.actionBar.s();
            } else {
                return;
            }
        }
        this.f44705a6 = 0;
        this.f44745d6 = 0;
        this.f44719b6 = 0;
        this.f44771f6 = 0;
        this.f44783g6 = 0;
        this.f44759e6 = 0;
        ok okVar = this.Y;
        if (okVar != null && (editField = okVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        tm tmVar = this.f44736c9;
        if (tmVar != null) {
            tmVar.f(true);
            SparseArray sparseArray = this.f44736c9.f22653p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        rl rlVar = this.f44797h9;
        if (rlVar != null) {
            AndroidUtilities.cancelRunOnUIThread(rlVar.H);
            rlVar.a();
        }
        ok okVar2 = this.Y;
        if (okVar2 != null) {
            okVar2.f23844a0 = false;
        }
        this.f44809i9 = false;
        if (this.f44724bb != null) {
            p9();
        }
    }

    public final void ha(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f44770f5;
        if (messagePreviewParams != null && this.Fa == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.G5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f44867n5;
                if (messageObject2 == this.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f44841l5, this.p5);
            }
            if (!this.f44770f5.isEmpty()) {
                this.f44763eb = this.Y.f23988z2;
                Context context = this.X0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f44770f5;
                TLRPC.User user = this.f44764f;
                TLRPC.Chat chat = this.f44752e;
                int i12 = this.currentAccount;
                xn xnVar = this.f44762ea;
                pn pnVar = this.f44841l5;
                if (pnVar != null && pnVar.f40916f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jl jlVar = new jl(this, context, this, this.A8, messagePreviewParams2, user, chat, i12, xnVar, i10, z10);
                this.Fa = jlVar;
                this.f44770f5.attach(jlVar);
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
                if (this.f44763eb) {
                    ok okVar = this.Y;
                    okVar.T0 = true;
                    org.telegram.ui.Components.gg ggVar = okVar.U0;
                    if (ggVar != null) {
                        ggVar.v(true);
                    }
                    this.Y.q1();
                    this.D3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void hb(ArrayList arrayList, String str, boolean z10, int i10, long j3, boolean z11) {
        long j10;
        if (i7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.effect_id = j3;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f44782g5;
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
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.T5, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = H8();
                of3.effect_id = j10;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = S8();
                of3.suggestionParams = this.f44782g5;
                getSendMessagesHelper().sendMessage(of3);
                j10 = 0;
            }
            B6();
        }
    }

    public final void hc() {
        boolean F9 = F9();
        SparseArray[] sparseArrayArr = this.W5;
        if (!F9) {
            if (this.actionBar.t() && this.f44714b1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f44714b1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
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
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.f44752e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f44764f;
    }

    public final boolean i7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        a2Var.R = string;
        a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void i8(View view, boolean z10) {
        boolean z11;
        sb(view);
        if (view != this.f44814j1) {
            z11 = true;
        } else {
            z11 = false;
        }
        j8(z10, z11, 0.2f);
    }

    public final void i9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.ad.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Ja(this.f44744d5);
            La(this.f44744d5);
            return;
        }
        showDialog(new rg.y0((org.telegram.ui.ActionBar.m2) this, 3, true));
    }

    public final void ia(String str, boolean z10) {
        boolean z11;
        lk lkVar;
        boolean z12;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                P7();
                ci.d4 d4Var = this.f44963v1;
                if (d4Var != null && d4Var.V) {
                    d4Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                ci.d4 d4Var2 = this.f44976w1;
                if (d4Var2 != null && d4Var2.V) {
                    d4Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new te(this, str, 5), 200L);
                    return;
                }
                this.f44952u3 = str;
                this.f44940t3 = str;
                boolean contains = str.contains("@");
                U6(true);
                if (!this.actionBar.f21286n0) {
                    this.f45025zc.a(true, true);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f44788h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f44753e0;
                    if (xVar != null) {
                        xVar.f(8);
                    }
                    es esVar = this.f44739d0;
                    if (esVar != null) {
                        esVar.b(false);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f44800i0;
                    if (xVar2 != null) {
                        xVar2.f(8);
                    }
                    if ((this.f44743d4 == 0 || (i10 = this.R3) == 3 || i10 == 8) && (u0Var = this.f44813j0) != null) {
                        u0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
                    if (u0Var3 != null && this.K9) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar3 = this.f44862n0;
                    if (xVar3 != null && this.L9) {
                        xVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.f44825k0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    this.f44873o0 = true;
                    Jc(0, 0, -1);
                    lc(false);
                }
                zk zkVar = this.f44874o1;
                if (zkVar != null) {
                    if (zkVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        zkVar.g(false);
                    }
                }
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.f44752e) || !ChatObject.isPublic(this.f44752e) || this.f44952u3 == null)) {
                    this.f44911r1 = 0;
                } else {
                    this.f44911r1 = 2;
                }
                this.W4 = false;
                if (this.O3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ci.h1 h1Var = this.f44898q1;
                if (h1Var != null) {
                    h1Var.h.clear();
                }
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f44813j0;
                if (u0Var5 != null) {
                    this.f44751dc = true;
                    u0Var5.z(false);
                    this.f44751dc = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var6 = this.f44813j0;
                if (u0Var6 != null) {
                    u0Var6.setSearchFieldCaption(null);
                    this.f44813j0.H(str, false);
                    this.f44813j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f44940t3, this.T5, this.L6, this.classGuid, 0, this.f44743d4, false, this.f44876o3, this.f44888p3, false, this.f44900q3);
                Cc(0, true);
                this.f44741d2.e(true, true);
                Pb(true);
                lk lkVar2 = this.f44886p1;
                if (lkVar2 != null) {
                    lkVar2.b(!contains);
                    Lc();
                }
                if ((contains || z10) && this.f44952u3 != null && (lkVar = this.f44886p1) != null) {
                    int currentPosition = lkVar.f27716a.getCurrentPosition();
                    int i11 = this.f44911r1;
                    if (currentPosition != i11) {
                        this.f44886p1.f27716a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f44952u3);
                this.f44938t1.f31676f.N(true);
                View currentView = this.f44898q1.getCurrentView();
                if (currentView instanceof bo) {
                    ((bo) currentView).f36419a.Nc(this.f44952u3);
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
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f44867n5, this.X3, null, this.f44841l5, z11, true, null, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f44782g5);
            B6();
            ok okVar = this.Y;
            if (okVar != null) {
                okVar.setFieldText("");
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
        sm smVar = this.X0;
        if (smVar != null && this.f44737ca == null) {
            if (this.f44762ea.f44116n == null || smVar.getBackgroundImage() == null) {
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
                x02 = resourceProvider.c0(org.telegram.ui.ActionBar.h6.f21138w8);
            } else {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21138w8, true);
            }
            if (i0.a.f(x02) > 0.699999988079071d) {
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
        if ((this.R3 != 5 || (!this.f44955u6.isEmpty() && this.f44743d4 != 0)) && !this.yc.f16366f && this.f44871n9) {
            jl jlVar = this.Fa;
            if (jlVar == null || !jlVar.f32619s) {
                uh.i iVar = this.X9;
                if (iVar == null || !iVar.a()) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public final void j7(Runnable runnable, zf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            q1 q1Var = new q1(this, aVar, runnable, 20);
            yh.n5 x10 = yh.n5.x(this.currentAccount, aVar.f54528a);
            if (!x10.f53000e) {
                x10.q(true, true, q1Var);
                return;
            } else {
                q1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void j8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        jh.h hVar;
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
        this.f44989x0.invalidate();
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
            ValueAnimator valueAnimator = this.f44725bc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.I8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.in0.d(new af(this, 3));
            }
        } else {
            float f11 = this.H8;
            this.L8 = f11 / max;
            this.I8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new lg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f44814j1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.P8.playTogether(arrayList);
        this.P8.setInterpolator(org.telegram.ui.Components.is.h);
        this.P8.setDuration(320L);
        View view2 = this.J8;
        if (view2 instanceof org.telegram.ui.Cells.u1) {
            u1Var = (org.telegram.ui.Cells.u1) view2;
        } else {
            u1Var = null;
        }
        this.P8.addListener(new androidx.fragment.app.g(this, z12, u1Var, 3));
        if (this.J8 != null && this.K8 <= 0.0f) {
            sb(null);
        }
        this.P8.start();
    }

    public final void j9(boolean z10) {
        Db(false, null, null, false, z10);
    }

    public final boolean ja(String str, org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle, int i10, int i11) {
        ei.w4 w4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.f44752e == null || str == null || this.R3 != 0) {
            return false;
        }
        if (u1Var != null && (characterStyle != null || i11 != 1)) {
            w4Var = new ei.w4(this, i10, i11, characterStyle, u1Var);
        } else {
            w4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.f44752e) != null) {
                try {
                    if (Kc == null) {
                        Kc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Lc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Kc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.f44752e, matcher.group(2))) {
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
                                    if (ChatObject.isForum(this.f44752e) && i12 != d()) {
                                        return false;
                                    }
                                    this.f44944t7 = true;
                                    if (this.R3 == 2) {
                                        this.V8.O0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f45008y7 = W;
                                    if (W >= 0) {
                                        this.f45020z7 = parseInt;
                                    }
                                    bb(parseInt, i10, true, 0, false, 0, num, g10, w4Var);
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
                        Matcher matcher2 = Lc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.f44752e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f44785g8 = queryParameter2;
                                    R6(true);
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
                    if (ChatObject.hasPublicLink(this.f44752e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.R3 == 2) {
                            this.V8.O0(intValue3);
                            finishFragment();
                            return true;
                        }
                        bb(intValue3, i10, true, 0, false, 0, null, null, w4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e11) {
                    e = e11;
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
                    if (parseLong != this.f44752e.f20032id || parseInt3 == 0) {
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
                        if (ChatObject.isForum(this.f44752e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f44731c4;
                            if (tL_forumTopic != null && tL_forumTopic.f20084id == findTopic.f20084id) {
                                return true;
                            }
                            return false;
                        }
                        this.f44944t7 = true;
                        if (this.R3 == 2) {
                            this.V8.O0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        bb(parseInt3, i10, true, 0, false, 0, num2, g11, w4Var);
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
            long j3 = this.f44752e.f20032id;
            if (longValue != j3 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                fa(j3, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f44944t7 = true;
            if (this.R3 == 2) {
                this.V8.O0(intValue9);
                finishFragment();
                return true;
            }
            bb(intValue9, i10, true, 0, false, 0, null, null, w4Var);
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
        if (this.f44788h0 != null && (user = this.f44764f) != null && this.h == null && user.bot) {
            a0.i iVar = this.f44747d8;
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
                this.f44788h0.K(30);
            } else {
                this.f44788h0.r(30);
            }
            if (z10) {
                this.f44788h0.K(31);
            } else {
                this.f44788h0.r(31);
            }
        }
    }

    @Override
    public final void k(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j3, boolean z11, long j10) {
        String str2 = null;
        o8(str, null);
        if (i7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.invert_media = z11;
                of2.payStars = j10;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f44782g5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.T5, false, false, true, 0, 0, null, -1, j10, S8(), this.f44782g5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.T5, this.f44867n5, this.X3, null, this.f44841l5, this.p5, z10, i10, 0, null, H8(), j3, z11, j10, S8(), this.f44782g5);
            B6();
        }
    }

    public final void k7() {
        if (this.f45016z3 != null) {
            return;
        }
        kl klVar = new kl(this, getParentActivity(), this, this.f44762ea);
        this.f45016z3 = klVar;
        this.X0.addView(klVar, 17, w7.x5.a(-2.0f, 8.0f, 8.0f, 8.0f, 0.0f, -1, 51));
    }

    public final void k8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void k9(boolean z10) {
        if (this.X2.getTag() != null && !this.f44742d3) {
            if (!this.j3 || this.f44768f3) {
                this.X2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f44780g3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f44780g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 0.0f));
                    this.f44780g3.addListener(new xi(this, 6));
                    this.f44780g3.setStartDelay(this.f44702a3);
                    this.f44780g3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f44780g3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f44780g3 = null;
                    }
                    this.X2.setAlpha(0.0f);
                }
                this.f44702a3 = 500;
            }
        }
    }

    public final void ka(MessageObject messageObject) {
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
            presentFragment(new zn(bundle));
        }
    }

    public final void kb(int r28, android.net.Uri r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.kb(int, android.net.Uri, boolean):void");
    }

    public final void kc() {
        if (this.R1 == null) {
            return;
        }
        this.R1.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.d());
    }

    @Override
    public final void l(long j3, ArrayList arrayList, boolean z10, int i10) {
        o8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.T5, this.f44867n5, this.X3, null, this.f44841l5, true, false, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, H8(), 0L, false, j3, S8(), this.f44782g5);
        B6();
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Ic(true);
        }
    }

    public final void l7(boolean z10) {
        long j3;
        if (System.currentTimeMillis() - this.Hb > 1000) {
            z10 = true;
        }
        sg sgVar = this.Ib;
        AndroidUtilities.cancelRunOnUIThread(sgVar);
        if (z10) {
            j3 = 0;
        } else {
            j3 = 150;
        }
        AndroidUtilities.runOnUIThread(sgVar, j3);
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
        if (this.Y2.getTag() != null && !this.f44756e3) {
            if (!this.f44828k3 || this.f44768f3) {
                this.Y2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44803i3, 0.0f);
                    this.f44791h3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f44791h3.addUpdateListener(new ne(this, 1));
                    this.f44791h3.addListener(new xi(this, 8));
                    this.f44791h3.setStartDelay(this.f44702a3);
                    this.f44791h3.start();
                } else {
                    ValueAnimator valueAnimator = this.f44791h3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f44791h3 = null;
                    }
                    this.f44803i3 = 0.0f;
                    pc();
                }
                this.f44702a3 = 500;
            }
        }
    }

    public final void la(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f44764f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f44764f.f20179id) {
                F(messageFwdHeader.saved_from_msg_id, messageObject.getId(), 0, 0, true, true);
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
            presentFragment(new zn(bundle));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.lc(boolean):void");
    }

    @Override
    public final boolean m() {
        return this.f44919r9;
    }

    public final void m7() {
        int b92 = (int) (b9(org.telegram.ui.Components.a41.f24434c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(b92);
        int b10 = w7.o.b(AndroidUtilities.dp(36.0f) + (this.X0.getMeasuredHeight() - b92), 0, this.X0.getMeasuredHeight());
        int measuredWidth = this.X0.getMeasuredWidth();
        Rect rect = Pc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Aa, this.f44989x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f44989x0.getMeasuredHeight() - this.Ba) - b92));
    }

    public final void m8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f44782g5;
        if (messageSuggestionParams != null) {
            Hb(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.G5;
        if (webPage != null) {
            Ib(true, webPage, false);
            return;
        }
        pn pnVar = this.f44841l5;
        if (pnVar != null) {
            Gb(this.f44867n5, pnVar);
            return;
        }
        MessageObject messageObject = this.f44867n5;
        if (messageObject != null && messageObject != this.X3) {
            Fb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f44770f5;
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
            org.telegram.ui.Components.a50 a50Var = this.f44850m2;
            if (a50Var != null) {
                a50Var.b(true);
            }
            jj jjVar = this.f44779g2;
            if (jjVar != null) {
                jjVar.b(true);
            }
            org.telegram.ui.Components.a50 a50Var2 = this.f44802i2;
            if (a50Var2 != null) {
                a50Var2.b(true);
            }
        }
        org.telegram.ui.Components.a50 a50Var3 = this.f44839l2;
        if (a50Var3 != null) {
            a50Var3.b(true);
        }
        org.telegram.ui.Components.a50 a50Var4 = this.f44827k2;
        if (a50Var4 != null) {
            a50Var4.b(true);
        }
        org.telegram.ui.Components.a50 a50Var5 = this.f44939t2;
        if (a50Var5 != null) {
            a50Var5.b(true);
        }
        org.telegram.ui.Components.a50 a50Var6 = this.f44951u2;
        if (a50Var6 != null) {
            a50Var6.b(true);
        }
        org.telegram.ui.Components.a50 a50Var7 = this.f44864n2;
        if (a50Var7 != null) {
            a50Var7.b(true);
        }
        org.telegram.ui.Components.a50 a50Var8 = this.f44875o2;
        if (a50Var8 != null) {
            a50Var8.b(true);
        }
        org.telegram.ui.Components.gq gqVar = this.f44964v2;
        if (gqVar != null) {
            gqVar.a();
        }
        ci.d4 d4Var = this.J0;
        if (d4Var != null) {
            d4Var.e(true);
        }
        ci.d4 d4Var2 = this.L0;
        if (d4Var2 != null) {
            d4Var2.e(true);
        }
        ci.d4 d4Var3 = this.K0;
        if (d4Var3 != null) {
            d4Var3.e(true);
        }
    }

    public final void ma(org.telegram.ui.Cells.u1 u1Var, MessageObject messageObject) {
        long j3;
        long j10;
        org.telegram.ui.Components.f6 animation;
        Bitmap m10;
        if (u1Var == null) {
            int childCount = this.f44989x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f44989x0.getChildAt(i10);
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
        PhotoViewer.t1().K2(null, this, this.f44762ea);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (u1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = u1Var.getPhotoImage().getAnimation()) != null && this.f44983w8 != null && this.f44945t8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f44983w8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.R3;
        tl tlVar = this.Ga;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f44955u6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().b2(arrayList, arrayList.indexOf(messageObject), this.T5, 0L, d(), tlVar);
        } else {
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = messageObject.type;
            long j11 = 0;
            if (i13 != 0) {
                j3 = this.T5;
            } else {
                j3 = 0;
            }
            if (i13 != 0) {
                j10 = this.L6;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = d();
            }
            t12.d2(messageObject, this, j3, j10, j11, tlVar);
        }
        m9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void mb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f44762ea != null && this.f44737ca == null) {
            fg.b c10 = fg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.T5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.b4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.b4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.b4 b4Var = theme;
                xn xnVar = this.f44762ea;
                TLRPC.WallPaper wallPaper = xnVar.h;
                if (this.P5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                xnVar.i(b4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new qe(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.T5);
            xn xnVar2 = this.f44762ea;
            org.telegram.ui.ActionBar.b4 b4Var2 = xnVar2.f44115f;
            if (this.P5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            xnVar2.i(b4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void mc() {
        lc(false);
    }

    @Override
    public final void n(int i10, float f7, float f10, me.e eVar) {
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
            qh.c cVar = this.Cc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.f44987wc.f16365e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                me.b bVar = this.xc;
                float f11 = 1.0f - bVar.f16365e;
                this.M0.setAlpha(f11);
                org.telegram.ui.Components.fh fhVar = this.M0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                fhVar.setVisibility(i12);
                float f12 = 1.0f - bVar.f16365e;
                org.telegram.ui.Components.e41 e41Var = this.R1;
                if (e41Var != null) {
                    e41Var.setAlpha(f12);
                    org.telegram.ui.Components.e41 e41Var2 = this.R1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    e41Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                ai.f0 f0Var = this.K3;
                me.b bVar2 = this.yc;
                if (f0Var != null) {
                    float f13 = bVar2.f16365e;
                    f0Var.setAlpha(f13);
                    ai.f0 f0Var2 = this.K3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    f0Var2.setVisibility(i15);
                }
                if (bVar2.f16365e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                jh.f fVar = this.X;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar.setVisibility(i11);
                o7();
                if (bVar2.f16365e < 1.0f) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                wj wjVar = this.f44989x0;
                if (z11) {
                    i13 = 0;
                }
                wjVar.setVisibility(i13);
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

    public final void n7() {
        int i10;
        if (this.f44701a1 != null) {
            float actionModeFactor = (1.0f - this.f45025zc.f16365e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f44701a1.setScaleX(lerp);
            this.f44701a1.setScaleY(lerp);
            this.f44701a1.setAlpha(actionModeFactor);
            qj qjVar = this.f44701a1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qjVar.setVisibility(i10);
        }
    }

    public final void n9() {
        ValueAnimator valueAnimator = this.f44787gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.w0 w0Var = this.Z2;
        if (w0Var != null && w0Var.getTag() != null) {
            this.Z2.setTag(null);
            org.telegram.ui.Cells.w0 w0Var2 = this.Z2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new lf(this, w0Var2, 1));
            ofFloat.addListener(new ai.z(13, this, w0Var2));
            ofFloat.setDuration(150L);
            this.f44787gb = ofFloat;
            ofFloat.start();
        }
    }

    public final void na(boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var;
        int i10;
        if (getParentActivity() != null && (b5Var = this.parentLayout) != null && b5Var.getLastFragment() == this && !this.H4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f44752e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f20032id);
            } else {
                bundle.putLong("user_id", this.f44764f.f20179id);
            }
            bundle.putInt("chatMode", 2);
            zn znVar = new zn(bundle);
            znVar.H4 = new ArrayList(this.H4);
            znVar.J4 = new HashMap(this.J4);
            int size = this.H4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.H4.get(i11);
                MessageObject messageObject = (MessageObject) this.J4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f44879o6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    znVar.J4.put(num, messageObject);
                    znVar.Dc();
                }
            }
            znVar.P4 = this.P4;
            if (this.f44792h4) {
                i10 = this.H4.size();
            } else {
                i10 = this.Q4;
            }
            znVar.Q4 = i10;
            znVar.S4 = this.S4;
            znVar.f44707a8 = this.f44707a8;
            znVar.Z7 = this.Z7;
            znVar.V8 = new ol(this, znVar);
            if (z10) {
                presentFragmentAsPreview(znVar);
                g7();
                return;
            }
            presentFragment(znVar, false);
        }
    }

    public final void nb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                nb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f44989x0 && view != this.X0) {
            view.setEnabled(z10);
        }
    }

    public final void nc() {
        int i10;
        org.telegram.ui.Components.wb wbVar;
        al alVar;
        ok okVar;
        if (this.D9 && this.f44989x0 != null) {
            float f7 = 0.0f;
            if (this.f44894pa <= 0 || this.Ea != 0.0f) {
                float a92 = a9(AndroidUtilities.dp(7.0f));
                zk zkVar = this.f44874o1;
                if (zkVar != null) {
                    i10 = AndroidUtilities.dp(zkVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float E8 = (E8() * AndroidUtilities.dp(43.0f)) + a92 + i10;
                float f10 = this.f44933s9;
                this.f44946t9 = E8;
                this.f44933s9 = b9(org.telegram.ui.Components.a41.f24432a) + AndroidUtilities.dp(4.0f) + this.v9 + E8;
                if (this.actionBar.getVisibility() == 0 || this.f44749da != null) {
                    this.f44933s9 += this.actionBar.getMeasuredHeight();
                }
                this.f44958u9 = 0;
                this.f44933s9 = this.f44933s9 + this.Aa + this.f44984w9;
                if (this.Ea != 0.0f && (okVar = this.Y) != null && okVar.getVisibility() == 0) {
                    float f11 = this.f44933s9;
                    float measuredHeight = this.Ea * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f44933s9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.w0 w0Var = this.Z2;
                if (w0Var != null) {
                    w0Var.setTranslationY(((this.f44989x0.getTranslationY() + this.f44933s9) + this.A9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f44933s9;
                    float f13 = this.A9;
                    this.f44933s9 = f12 + f13;
                    this.f44958u9 = (int) (this.f44958u9 + f13);
                }
                fk fkVar = this.X2;
                if (fkVar != null) {
                    fkVar.setTranslationY((((this.f44989x0.getTranslationY() - f7) + this.f44933s9) + this.f45010y9) - AndroidUtilities.dp(4.0f));
                }
                pc();
                wj wjVar = this.f44989x0;
                if (wjVar != null && this.f45013z0 != null && this.A0 != null) {
                    int paddingTop = wjVar.getPaddingTop();
                    int paddingBottom = this.f44989x0.getPaddingBottom();
                    q7();
                    if (this.f44989x0.getPaddingTop() != paddingTop || this.f44989x0.getPaddingBottom() != paddingBottom) {
                        w9();
                        v9(2);
                    }
                    this.f44989x0.setTopGlowOffset((int) ((this.f44933s9 - this.f44958u9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f44933s9) {
                        int childCount = this.f44989x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f44989x0.getChildAt(i11);
                            this.f44989x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.f44933s9;
                                if (childAt.getTop() > f14) {
                                    this.f44989x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!K9() && !this.D4 && this.J7 != null && this.f44989x0 != null && ((alVar = this.P1) == null || alVar.getVisibility() != 0)) {
                        this.f44989x0.scrollBy(0, (int) (f10 - this.f44933s9));
                    }
                }
                this.D9 = false;
                org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30703w;
                if (scVar != null && (wbVar = scVar.f30707e) != null) {
                    wbVar.updatePosition();
                }
                q7();
            }
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.R3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((m2Var instanceof zn) && ((zn) m2Var).C9()) {
                return false;
            }
        }
        return this.H6;
    }

    @Override
    public final org.telegram.ui.Components.uo o() {
        return this.f44701a1;
    }

    public final void o7() {
        boolean z10;
        ci.h1 h1Var;
        if (this.f44749da != null) {
            return;
        }
        int i10 = 0;
        if (this.yc.f16365e >= 1.0f && ((h1Var = this.f44898q1) == null || h1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ci.bb bbVar = this.X0.L;
        if (!z10) {
            i10 = 4;
        }
        bbVar.setVisibility(i10);
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
                ok okVar = this.Y;
                if (okVar != null) {
                    this.p5.editingMessage = okVar.getFieldText();
                    MessageObject messageObject3 = this.p5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.p5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final boolean o9(boolean z10) {
        ll llVar;
        ll llVar2 = this.f44991x2;
        if (llVar2 == null || llVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.fh fhVar = this.M0;
        if (fhVar != null && (llVar = this.f44991x2) != null) {
            fhVar.i(llVar, false, z10);
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
                this.f44991x2.setTag(1);
                return true;
            }
        }
    }

    public final void oa(int i10, boolean z10) {
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && b5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f20040id);
            } else {
                TLRPC.Chat chat = this.f44752e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f20032id);
                } else {
                    bundle.putLong("user_id", this.f44764f.f20179id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            zn znVar = new zn(bundle);
            if (this.f44792h4) {
                ng.d.a(znVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            znVar.V8 = new sj(this);
            presentFragment(znVar, false);
        }
    }

    public final void ob(boolean z10) {
        pb(z10, false, true);
    }

    public final void oc(boolean z10) {
        a0.i iVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.Za == null) {
            this.Za = new a0.i();
        }
        a0.i iVar2 = this.Ya;
        if (iVar2 == null) {
            this.Ya = new a0.i();
        } else {
            iVar2.b();
        }
        this.A0.P.clear();
        this.Za.b();
        a0.i iVar3 = null;
        a0.i iVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            iVar = this.f44995x6;
            arrayList = this.f44955u6;
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
                MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.f(messageObject2.getGroupIdForUse());
                if (groupedMessages2 == null) {
                    groupedMessages2 = new MessageObject.GroupedMessages();
                    groupedMessages2.reversed = this.Qa;
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
            this.A0.P.add(messageObject2);
            this.Za.k(messageObject2, messageObject2.getId());
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
        if (this.f44900q3 != null && TextUtils.isEmpty(this.f44940t3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f44900q3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) iVar.f(messageObject5.getGroupId())) != null) {
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
        Collections.sort(this.A0.P, new ff(1));
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
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.G6 || !arrayList.isEmpty() || this.A0.f39970w >= 0) {
                z11 = false;
            }
            Tb(z11);
            if (this.f44989x0 != null) {
                J7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.G6 || !arrayList.isEmpty() || this.A0.f39970w >= 0)) {
                    this.f44989x0.setEmptyView(this.Q0);
                    wj wjVar = this.f44989x0;
                    wjVar.K0(wjVar.v1());
                    return;
                }
                this.Q0.setVisibility(8);
                this.f44989x0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        ai.h4 h4Var;
        org.telegram.ui.Components.lo loVar;
        String str;
        ai.h4 h4Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (h4Var2 = this.J1) != null) {
                    org.telegram.ui.Components.qi qiVar = h4Var2.B0;
                    if (qiVar instanceof ii.r) {
                        ii.r rVar = (ii.r) qiVar;
                        if (intent != null && intent.getData() != null) {
                            ii.x3 x3Var = rVar.f12649r;
                            Uri data = intent.getData();
                            if (data == null) {
                                x3Var.getClass();
                                return;
                            } else if (x3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new gg.w1(13, x3Var, data));
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
                        ai.h4 h4Var3 = this.J1;
                        if (h4Var3 != null) {
                            org.telegram.ui.Components.qi qiVar2 = h4Var3.B0;
                            if (qiVar2 instanceof ii.r) {
                                ii.r rVar2 = (ii.r) qiVar2;
                                if (intent.getData() != null) {
                                    rVar2.f12649r.f2(intent.getData());
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
                                xb();
                            }
                            if (this.f44902q5) {
                                this.f44932s8 = str;
                            } else {
                                ta(null, str);
                            }
                        } else if (this.p5 == null && this.R3 == 1) {
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.T5, new m4.v0(8, this, data2), this.f44762ea);
                        } else {
                            o8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.T5, this.f44867n5, this.X3, this.f44841l5, null, null, null, null, 0, this.p5, true, 0, this.R3, H8());
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
                            ai.h4 h4Var4 = this.J1;
                            if (h4Var4 != null) {
                                h4Var4.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.f5(this) {
                                public final zn f39921b;

                                {
                                    this.f39921b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            zn znVar = this.f39921b;
                                            znVar.o8(null, null);
                                            znVar.kb(i12, intent.getData(), z10);
                                            znVar.B6();
                                            return;
                                        default:
                                            zn znVar2 = this.f39921b;
                                            znVar2.o8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                znVar2.kb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            znVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f44762ea);
                            return;
                        } else if (intent.getClipData() != null) {
                            ai.h4 h4Var5 = this.J1;
                            if (h4Var5 != null) {
                                h4Var5.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.f5(this) {
                                public final zn f39921b;

                                {
                                    this.f39921b = this;
                                }

                                @Override
                                public final void J(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            zn znVar = this.f39921b;
                                            znVar.o8(null, null);
                                            znVar.kb(i12, intent.getData(), z10);
                                            znVar.B6();
                                            return;
                                        default:
                                            zn znVar2 = this.f39921b;
                                            znVar2.o8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                znVar2.kb(i12, clipData.getItemAt(i14).getUri(), z10);
                                            }
                                            znVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f44762ea);
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
                    ai.h4 h4Var6 = this.J1;
                    if (h4Var6 != null) {
                        h4Var6.dismiss();
                    }
                    B6();
                    return;
                } else if (i10 == 28 && (h4Var = this.J1) != null && (loVar = h4Var.m0) != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = loVar.f30160a;
                    if (loVar.f28394k1 != -1 && loVar.f28392j1 != null) {
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
                            org.telegram.messenger.ai.q(R.string.UnsupportedAttachment, new org.telegram.ui.Components.ad(loVar.f30161b.container, d6Var), d6Var);
                            return;
                        }
                        loVar.h0(loVar.f28394k1, new rh.c(uri));
                        org.telegram.ui.Components.sn snVar = loVar.f28392j1;
                        if (snVar != null) {
                            snVar.dismiss(true);
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
            ai.h4 h4Var7 = this.J1;
            if (h4Var7 != null) {
                h4Var7.f33228j0.g0(i10, intent, this.V7);
            }
            this.V7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.z60 z60Var;
        org.telegram.ui.ActionBar.a2 a2Var;
        org.telegram.ui.Components.sf sfVar;
        org.telegram.ui.Components.qf qfVar;
        tm tmVar;
        zg.s sVar;
        org.telegram.ui.Components.sc scVar = org.telegram.ui.Components.sc.f30703w;
        if (scVar != null) {
            org.telegram.ui.Components.wb wbVar = scVar.f30707e;
            if (wbVar instanceof org.telegram.ui.Components.dc) {
                if (z10) {
                    ((org.telegram.ui.Components.dc) wbVar).f();
                    scVar.b();
                    return false;
                }
                return false;
            }
        }
        j51 j51Var = this.Z9;
        if (j51Var != null && !j51Var.f38844b0) {
            if (z10) {
                j51Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            zg.t tVar = this.Y9;
            if (tVar != null && (sVar = tVar.f54750b) != null && sVar.getReactionsWindow() != null) {
                if (z10) {
                    tVar.f54750b.e();
                    return false;
                }
            } else if (qt.q().E) {
                if (z10) {
                    qt.q().o();
                    return false;
                }
            } else {
                jl jlVar = this.Fa;
                if (jlVar != null && jlVar.f32619s) {
                    if (z10) {
                        jlVar.a(true);
                        return false;
                    }
                } else if (this.yc.f16366f) {
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
                        if (z10 && (tmVar = this.f44736c9) != null && tmVar.x()) {
                            this.f44736c9.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.t()) {
                            if (z10) {
                                C7(false);
                                return false;
                            }
                        } else {
                            ok okVar = this.Y;
                            if (okVar != null && okVar.r0()) {
                                if (z10) {
                                    this.Y.k0(true);
                                    return false;
                                }
                            } else {
                                ok okVar2 = this.Y;
                                if (okVar2 != null && okVar2.u()) {
                                    if (z10) {
                                        ok okVar3 = this.Y;
                                        ei.c0 c0Var = okVar3.f23912l0;
                                        if (c0Var != null) {
                                            c0Var.setOpened(false);
                                        }
                                        if (!okVar3.h0() && (qfVar = okVar3.m0) != null) {
                                            qfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    ok okVar4 = this.Y;
                                    if (okVar4 == null || (sfVar = okVar4.E0) == null || !sfVar.closeCreationLinkDialog(z10)) {
                                        if (this.R3 == 6 && (a2Var = hg.w.d) != null && a2Var.isShowing()) {
                                            if (z10) {
                                                hg.w.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.f44752e) && !this.T3 && this.R1 != null && d() != 0) {
                                            if (z10) {
                                                this.R1.m(0L, this.f44891p7);
                                                return false;
                                            }
                                        } else if (this.R3 == 5 && !"hello".equalsIgnoreCase(this.Q3) && !"away".equalsIgnoreCase(this.Q3) && (this.f44955u6.isEmpty() || this.f44743d4 == 0)) {
                                            if (z10) {
                                                Ub();
                                                return false;
                                            }
                                        } else if (this.R3 == 6 && this.Y.v()) {
                                            if (z10) {
                                                Ab(new qf(this, 18));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21286n0) {
                                                if (z10) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f44987wc.f16366f) {
                                                if (z10) {
                                                    xa();
                                                }
                                            } else {
                                                if (z10 && (z60Var = this.f44716b3) != null) {
                                                    z60Var.a(false);
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
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f44955u6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.f44752e)))) {
                    org.telegram.ui.Components.l41.u(messageObject, false);
                }
            }
        }
        this.F3 = false;
        q9();
        ArrayList arrayList2 = org.telegram.ui.Components.l41.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        of.e eVar = this.Ab;
        if (eVar != null) {
            eVar.a(false);
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
        if (this.f44763eb) {
            ok okVar = this.Y;
            if (okVar != null) {
                okVar.G0();
                ok okVar2 = this.Y;
                okVar2.T0 = false;
                org.telegram.ui.Components.gg ggVar = okVar2.U0;
                if (ggVar != null) {
                    ggVar.v(false);
                }
            }
            this.f44763eb = false;
        }
        if (this.f44963v1 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 1), 600L);
        }
        if (this.f44914r4 && !this.f44928s4) {
            this.f44928s4 = true;
            org.telegram.ui.Components.sc M = org.telegram.ui.Components.ad.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f30711j = 5000;
            M.v = new le(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        zg.t tVar = this.Y9;
        if (tVar != null && tVar.d()) {
            this.Y9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j3;
        long j10;
        qj qjVar = this.f44701a1;
        if (qjVar != null) {
            qjVar.getViewTreeObserver().addOnPreDrawListener(new ei(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        D7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.D1() || !PhotoViewer.t1().R1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f44762ea);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i10 = playingMessageObject.type;
                    long j11 = 0;
                    if (i10 != 0) {
                        j3 = this.T5;
                    } else {
                        j3 = 0;
                    }
                    if (i10 != 0) {
                        j10 = this.L6;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = d();
                    }
                    if (t12.f2(playingMessageObject, null, null, null, null, null, null, 0, this.Ga, null, j3, j10, j11, false, null, null)) {
                        PhotoViewer.t1().l4 = this;
                    }
                    m9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.D1() && PhotoViewer.t1().f33994l2) {
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
        wk wkVar = this.W9;
        float f7 = 0.0f;
        if (z10 && this.R9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (m2Var instanceof zn) {
                this.D4 = true;
                zn znVar = (zn) m2Var;
                znVar.T9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.X0.setSkipBackgroundDrawing(true);
                this.f44701a1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f44701a1.getAvatarImageView().setAlpha(0.0f);
                this.f44701a1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.S9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                ok okVar = this.Y;
                if (okVar != null) {
                    okVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                rk rkVar = this.R;
                if (rkVar != null) {
                    rkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                ok okVar2 = this.Y;
                if (okVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = okVar2.getMeasuredHeight();
                }
                rk rkVar2 = this.R;
                if (rkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = rkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                ok okVar3 = znVar.Y;
                if (okVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = okVar3.getMeasuredHeight();
                }
                rk rkVar3 = this.R;
                if (rkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = rkVar3.getMeasuredHeight();
                }
                this.O9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ai.x(9, this, znVar));
                nc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.V9 = animatorSet;
                animatorSet.addListener(new ci.x5(this, znVar, runnable));
                this.V9.setDuration(300L);
                this.V9.setInterpolator(org.telegram.ui.Components.is.f27451f);
                this.V9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(wkVar, 200L);
                return this.V9;
            }
        }
        if (this.f44822ja && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (m2Var2 instanceof eg1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                m2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f44846la = f7;
                ofFloat.addUpdateListener(new dj(0, this));
                this.f44835ka = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                sm smVar = this.X0;
                if (smVar != null) {
                    smVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V9 = animatorSet2;
                animatorSet2.addListener(new ej(this, z10, runnable));
                this.V9.setDuration(150L);
                this.V9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(wkVar, 200L);
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
        org.telegram.ui.ActionBar.a2 a2Var = this.N;
        if (a2Var != null && dialog == a2Var) {
            getMessagesController().deleteDialog(this.T5, 0);
            org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
            if (b5Var != null && !b5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.m2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.vv0 vv0Var;
        super.onFragmentDestroy();
        hh.e eVar = this.N3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f11496w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                hh.d dVar = (hh.d) longSparseArray.valueAt(i10);
                if (dVar.f11483i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        ok okVar = this.Y;
        if (okVar != null) {
            okVar.z0();
        }
        qj qjVar = this.f44701a1;
        if (qjVar != null && (vv0Var = qjVar.f31512c0) != null) {
            vv0Var.b(qjVar.G);
        }
        gk gkVar = this.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            this.I1.getAdapter().P();
        }
        ai.h4 h4Var = this.J1;
        if (h4Var != null) {
            h4Var.dismissInternal();
        }
        qt q6 = qt.q();
        if (q6.f41244l == this.f44834k9) {
            q6.W = null;
            q6.f41231a0 = null;
            q6.Y = null;
            q6.f41244l = null;
            q6.f41235c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.F9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.G9);
        getNotificationCenter().onAnimationFinish(this.H9);
        getNotificationCenter().onAnimationFinish(this.I9);
        q9();
        le leVar = this.L5;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
            this.L5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f44872na);
        MessagesController messagesController = getMessagesController();
        long j3 = this.T5;
        if (this.R3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j3, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.Sa;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Sa = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.R3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.T5), Long.valueOf(d()), Boolean.TRUE);
        }
        if (this.f44764f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.E3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f44764f != null) {
            getMessagesController().cancelLoadFullUser(this.f44764f.f20179id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        ai.h4 h4Var2 = this.J1;
        if (h4Var2 != null) {
            h4Var2.y1();
            this.J1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.f44752e)) {
            getMessagesController().startShortPoll(this.f44752e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.Z7.linked_chat_id)), this.classGuid, true);
            }
        }
        tm tmVar = this.f44736c9;
        if (tmVar != null) {
            tmVar.f(false);
        }
        yj yjVar = this.f45002y0;
        if (yjVar != null) {
            yjVar.N();
        }
        xk xkVar = this.f44985wa;
        if (xkVar != null) {
            xkVar.b();
        }
        this.f44723ba = null;
        org.telegram.ui.ActionBar.b5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Oc ? 1 : 0);
            org.telegram.ui.ActionBar.b5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.p9) parentLayout2.getPulledDialogs().get(i11)).f29643b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Oc = false;
        of.e eVar2 = this.Ab;
        if (eVar2 != null) {
            eVar2.a(false);
            this.Ab = null;
        }
        this.ga.onFragmentDestroy();
        l11 l11Var = this.f44735c8;
        if (l11Var != null) {
            l11Var.b(true);
            this.f44735c8 = null;
        }
        yh.w3 w3Var = this.f44908qc;
        if (w3Var != null) {
            w3Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f44908qc);
            this.f44908qc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f44836kb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f44983w8, null, null, false);
        }
        yh.w3 w3Var = this.f44908qc;
        if (w3Var != null) {
            w3Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f44908qc);
            this.f44908qc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        ai.h4 h4Var;
        org.telegram.ui.Components.xl xlVar;
        ai.h4 h4Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.yi yiVar;
        ok okVar = this.Y;
        boolean z12 = false;
        if (okVar != null && i10 == 2 && okVar.j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(okVar.Q).sendCurrentLocation(okVar.f23898i3, okVar.j3);
            }
            okVar.j3 = null;
            okVar.f23898i3 = null;
        }
        gk gkVar = this.I1;
        if (gkVar != null && gkVar.getAdapter() != null) {
            gg.j1 adapter = this.I1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f10693w0;
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
            ai.h4 h4Var3 = this.J1;
            if (h4Var3 != null) {
                h4Var3.f33228j0.Y();
            }
            org.telegram.ui.Components.cq cqVar = this.f44723ba;
            if (cqVar != null && (yiVar = cqVar.Y) != null) {
                yiVar.f33228j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (h4Var = this.J1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                h4Var.G1();
            } else if (i10 == 30 && (xlVar = h4Var.f33242o0) != null && h4Var.B0 == xlVar && h4Var.isShowing()) {
                h4Var.f33242o0.b0();
            }
        } else if ((i10 == 17 || i10 == 18) && (h4Var2 = this.J1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = h4Var2.f33228j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.J1.f33228j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44762ea);
                alertDialog$Builder.f20368a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20368a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new wh(this));
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(2);
        } else if (((i10 != 101 && i10 != 102) || this.f44764f == null) && (i10 != 103 || this.f44752e == null)) {
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
                    org.telegram.ui.Components.voip.g2.l(this.f44752e, null, this.Y7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f44764f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f44707a8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f44764f.f20179id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        ok okVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.y9[] y9VarArr;
        ai.f0 f0Var;
        super.onResume();
        g7();
        this.E9 = System.currentTimeMillis();
        if (this.f44919r9 && getSendMessagesHelper().getImportingHistory(this.T5) != null) {
            org.telegram.ui.Components.p50 p50Var = new org.telegram.ui.Components.p50(getParentActivity(), null, this, this.f44762ea);
            p50Var.setOnHideListener(new pe(this, 0));
            showDialog(p50Var);
            this.f44919r9 = false;
        }
        K6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        Z6();
        ai.h4 h4Var = this.J1;
        if (h4Var != null) {
            h4Var.B1();
        }
        sm smVar = this.X0;
        boolean z12 = true;
        if (smVar != null) {
            org.telegram.ui.Components.t91 t91Var = smVar.v;
            if (t91Var != null) {
                t91Var.c(true);
            }
            smVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new le(this, 23), 1000L);
        }
        x8 x8Var = new x8(this, 2);
        this.Zb = x8Var;
        setBulletinDelegate(x8Var);
        J6(false);
        TLRPC.PhotoSize photoSize = this.f44980w5;
        if (photoSize != null && (f0Var = this.f44700a0) != null) {
            ((org.telegram.ui.Components.gp[]) f0Var.f933b)[0].f26792f.k(ImageLocation.getForObject(photoSize, this.f45006y5), "50_50", ImageLocation.getForObject(this.f44994x5, this.f45006y5), "50_50_b", this.f44954u5, null, this.f44867n5, this.f44967v5);
        }
        if (this.C5 != null && (y9VarArr = this.B2) != null) {
            y9VarArr[0].k(ImageLocation.getForObject(this.C5, this.E5), "50_50", ImageLocation.getForObject(this.D5, this.E5), "50_50_b", this.f45018z5, null, (MessageObject) this.J4.get(Integer.valueOf(this.L4)), this.A5);
            y9VarArr[0].setHasBlur(this.B5);
        }
        if (this.R3 == 0) {
            getNotificationsController().setOpenedDialogId(this.T5, d());
        }
        MessagesController messagesController = getMessagesController();
        long j3 = this.T5;
        if (this.R3 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j3, z10, true);
        if (this.Q5) {
            if (this.S5 && (messageObject = this.K7) != null) {
                if (this.f44989x0 != null) {
                    int i10 = this.T7;
                    if (i10 == -9000) {
                        i10 = P8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f45013z0.i1(this.f44955u6.indexOf(this.K7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f45013z0.i1(this.f44955u6.indexOf(this.K7) + this.A0.J, i10, z11);
                }
            } else {
                T9(false);
            }
            this.S5 = false;
            this.Q5 = false;
            this.K7 = null;
        }
        this.f44902q5 = false;
        this.f44915r5 = false;
        d7(false);
        if (this.f44929s5) {
            this.f44929s5 = false;
            mm mmVar = this.A0;
            if (mmVar != null) {
                mmVar.O(false);
            }
        }
        qj qjVar = this.f44701a1;
        if (qjVar != null) {
            qjVar.getViewTreeObserver().addOnPreDrawListener(new ei(this, 0));
        }
        D6(false, false);
        if (this.Y != null && this.R3 == 0 && this.f44810ia != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.T5 && (arrayList2 = this.f44810ia.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new q80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f44810ia.entities;
            }
            CharSequence q6 = ChatActivityEnterView.q(arrayList, this.f44810ia.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (q6 != null && q6.length() > 0 && q6.charAt(0) == '@') {
                q6 = TextUtils.concat(" ", q6);
            }
            this.Y.d1(q6, true);
            this.f44810ia = null;
        }
        sk skVar = this.O0;
        if (skVar != null && skVar.getVisibility() != 0 && !this.actionBar.f21286n0 && this.R3 != 7 && !org.telegram.ui.ActionBar.m2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        ok okVar2 = this.Y;
        if (okVar2 != null) {
            okVar2.C0();
        }
        if (this.f44764f != null) {
            this.f44892p8 = System.currentTimeMillis();
            this.f44904q8 = 0L;
        }
        if (this.f44932s8 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 3));
        }
        if (this.f44989x0 != null && ((okVar = this.Y) == null || !okVar.p0())) {
            this.f44989x0.setOnItemLongClickListener(this.Ka);
            this.f44989x0.setOnItemClickListener(this.La);
            this.f44989x0.setLongClickable(true);
        }
        org.telegram.ui.Components.s61.h = false;
        TLRPC.User user = this.f44764f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.s61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.Z7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.Z7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.s61.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                if (chatFull.bot_info.isEmpty() || (chat = this.f44752e) == null || !chat.megagroup) {
                    z12 = false;
                }
                org.telegram.ui.Components.s61.h = z12;
            }
        }
        Rc(false);
        Mb();
        if (this.N9 != 0.0f) {
            this.N9 = 0.0f;
            this.f44989x0.invalidate();
        }
        this.E3.attach();
        yh.w3 w3Var = this.f44908qc;
        if (w3Var != null) {
            w3Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.vd vdVar;
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
            iArr = UserObject.isUserSelf(this.f44764f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            ok okVar = this.Y;
            if (okVar != null && (vdVar = okVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(vdVar);
                okVar.S1 = null;
            }
        }
        g7();
        this.F9 = getNotificationCenter().setAnimationInProgress(this.F9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f44792h4) {
            if (this.f44764f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f44764f.f20179id));
                if (user != null) {
                    this.f44764f = user;
                } else {
                    return;
                }
            } else if (this.f44752e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f44752e.f20032id));
                if (chat != null) {
                    this.f44752e = chat;
                } else {
                    return;
                }
            }
            qj qjVar = this.f44701a1;
            if (qjVar != null) {
                qjVar.b();
            }
        }
    }

    public final void p7() {
        float f7;
        org.telegram.ui.Components.qf qfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + b9(org.telegram.ui.Components.a41.f24434c) + this.v.d();
        ok okVar = this.Y;
        if (okVar != null && (qfVar = okVar.m0) != null) {
            qfVar.setTranslationY(-inputBubbleHeight);
        }
        gk gkVar = this.I1;
        if (gkVar != null) {
            if (gkVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            gkVar.setTranslationY(f7);
        }
    }

    public final void p8(boolean z10) {
        TLRPC.Chat chat = this.f44752e;
        if (chat != null && this.Z7 != null && !ChatObject.isNotInChat(chat) && !this.f44752e.creator) {
            TLRPC.ChatFull chatFull = this.Z7;
            long j3 = chatFull.inviterId;
            if (j3 != 0) {
                this.f44909r = j3;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f44909r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.Z7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.Z7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f44909r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f44909r == 0) {
                getMessagesController().checkChatInviter(this.f44752e.f20032id, false);
            }
        }
    }

    public final void p9() {
        el elVar = this.f44724bb;
        if (elVar == null) {
            return;
        }
        this.f44724bb = null;
        elVar.e();
        if (elVar.getReactionsWindow() != null && elVar.getReactionsWindow().f54536a != null) {
            elVar.getReactionsWindow().f54536a.animate().alpha(0.0f).setDuration(180L).start();
        }
        elVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new ug(10, this, elVar)).setDuration(180L).start();
    }

    public final void pa(TLRPC.Chat chat) {
        boolean z10;
        ci.d4 d4Var = this.f44963v1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.d4 d4Var2 = this.f44976w1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ug(4, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21286n0) {
            this.f45025zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f44788h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44753e0;
            if (xVar != null) {
                xVar.f(8);
            }
            es esVar = this.f44739d0;
            if (esVar != null) {
                esVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f44800i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f44813j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f44862n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f44825k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f44873o0 = true;
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
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f44813j0;
        if (u0Var5 != null) {
            this.f44751dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f44751dc = false;
        }
        db(chat, null);
        Cc(0, true);
    }

    public final void pb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.pb(boolean, boolean, boolean):void");
    }

    public final void pc() {
        int i10;
        ek ekVar = this.Y2;
        if (ekVar == null) {
            return;
        }
        ekVar.setTranslationX(W8() / 2.0f);
        this.Y2.setTranslationY((((this.f44989x0.getTranslationY() + this.f44933s9) + this.f45022z9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f45022z9, -this.Y2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.Y2.setAlpha(this.f44803i3 * clamp);
        ek ekVar2 = this.Y2;
        if (this.f44803i3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        ekVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.Y2.setScaleX(lerp);
        this.Y2.setScaleY(lerp);
    }

    public final void q7() {
        float d;
        if (this.f44989x0 != null) {
            if (this.Pa && this.f44749da == null) {
                d = AndroidUtilities.navigationBarHeight;
            } else {
                d = this.v.d() + b9(org.telegram.ui.Components.a41.f24434c) + AndroidUtilities.dp(16.0f) + this.Ba + this.f44936sc;
            }
            int i10 = (int) this.f44933s9;
            org.telegram.ui.Components.e41 e41Var = this.R1;
            if (e41Var != null) {
                e41Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            hh.g gVar = this.f44975w0;
            boolean z10 = this.f44989x0.V1;
            RecyclerView recyclerView = gVar.f11510a;
            int i11 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new ai.p8(gVar, i12, 9));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            hh.e eVar = this.N3;
            if (eVar != null) {
                RectF rectF = eVar.f11489b;
                rectF.set(b9(org.telegram.ui.Components.a41.f24433b), i10 - this.G, 0.0f, d - this.Ba);
                eVar.f11490c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void q8(org.telegram.messenger.MessageObject r60, java.util.ArrayList r61, java.util.ArrayList r62, java.util.ArrayList r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.q8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void q9() {
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.sc scVar = this.A3;
        if (scVar != null) {
            scVar.c(0L, false);
        }
        kl klVar = this.f45016z3;
        if (klVar != null) {
            klVar.e(0, true);
        }
    }

    public final void qa(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i11;
        ci.d4 d4Var = this.f44963v1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.d4 d4Var2 = this.f44976w1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new te(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21286n0) {
            this.f45025zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f44788h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44753e0;
            if (xVar != null) {
                xVar.f(8);
            }
            es esVar = this.f44739d0;
            if (esVar != null) {
                esVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f44800i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            if ((this.f44743d4 == 0 || (i11 = this.R3) == 3 || i11 == 8) && (u0Var = this.f44813j0) != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f44862n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f44825k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f44873o0 = true;
            Jc(0, 0, -1);
            lc(false);
        }
        if ((this.f44743d4 == 0 || this.f44792h4 || (i10 = this.R3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f44764f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.W4 = z11;
            org.telegram.ui.ActionBar.u0 u0Var5 = this.f44813j0;
            if (u0Var5 != null) {
                u0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f44813j0;
        if (u0Var6 != null) {
            u0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f44940t3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.T5, this.L6, this.classGuid, 0, this.f44743d4, false, this.f44876o3, this.f44888p3, !TextUtils.isEmpty(str), this.f44900q3);
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
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f44707a8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f44707a8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R0 != null) {
            if (z10 && this.T0 == null) {
                ui uiVar = new ui(getParentActivity(), getResourceProvider(), this);
                this.T0 = uiVar;
                w7.z5.b(uiVar, 0.02f, 1.2f);
                this.T0.setOnClickListener(new ze(this, 12));
            }
            ui uiVar2 = this.T0;
            if (uiVar2 != null) {
                if (!z10) {
                    uiVar2.setVisibility(8);
                    return;
                }
                uiVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f44707a8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f44707a8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f44764f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        i11 i11Var = new i11(formatString.substring(indexOf, indexOf2));
                        if (i11Var.f38556c != -1) {
                            i11Var.f38556c = -1;
                            i11Var.invalidateSelf();
                        }
                        i11Var.a(503316480);
                        i11Var.setBounds(0, 0, i11Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(i11Var), indexOf, indexOf2, 33);
                    }
                }
                this.T0.setCustomText(spannableStringBuilder);
                this.T0.setOverrideTextMaxWidth(ci.d4.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.T0.getParent() != null && (!z10 || this.T0.getParent() != this.R0)) {
                    ((ViewGroup) this.T0.getParent()).removeView(this.T0);
                }
                if (z10) {
                    ViewParent parent = this.T0.getParent();
                    LinearLayout linearLayout = this.R0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.T0, w7.x5.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j3) {
        if (photoEntry == null) {
            return;
        }
        this.f44973vc.a(false, true);
        MessageObject messageObject = this.p5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.p5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f44782g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.p5.messageOwner.suggested_post);
            }
            if (!yh.n5.U(this.currentAccount, messageSuggestionParams.amount)) {
                Xb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            qf qfVar = new qf(this, 26);
            this.f44903q7 = qfVar;
            AndroidUtilities.runOnUIThread(qfVar, 3000L);
        }
        o8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.g5.a0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                zn znVar = zn.this;
                MessageObject messageObject2 = znVar.p5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = znVar.f44782g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(znVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(znVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, znVar.T5, znVar.p5, znVar.X3, null, znVar.f44841l5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, znVar.H8(), photoEntry2.effectId, l4.longValue(), znVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, znVar.T5, znVar.p5, znVar.X3, null, znVar.f44841l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, znVar.H8(), photoEntry2.effectId, l4.longValue(), znVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, znVar.T5, znVar.p5, znVar.X3, null, znVar.f44841l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, znVar.H8(), photoEntry2.effectId, l4.longValue(), znVar.S8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(znVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, znVar.T5, znVar.f44867n5, znVar.X3, null, znVar.f44841l5, photoEntry2.entities, photoEntry2.ttl, znVar.p5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, znVar.H8(), photoEntry2.effectId, l4.longValue(), znVar.S8(), znVar.f44782g5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, znVar.T5, znVar.f44867n5, znVar.X3, null, znVar.f44841l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, znVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, znVar.H8(), photoEntry2.effectId, l4.longValue(), znVar.S8(), znVar.f44782g5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(znVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, znVar.T5, znVar.f44867n5, znVar.X3, null, znVar.f44841l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, znVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, znVar.H8(), photoEntry2.effectId, l4.longValue(), znVar.S8(), znVar.f44782g5);
                }
                znVar.B6();
            }
        }, j3);
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
        ArrayList arrayList4 = this.f44955u6;
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
        getMediaDataController().searchMessagesInChat(this.f44940t3, this.T5, this.L6, this.classGuid, 0, this.f44743d4, this.f44876o3, this.f44888p3, this.f44900q3);
        if (TextUtils.isEmpty(this.f44940t3) && this.f44900q3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f44927s3 = z10;
        this.f44873o0 = z10;
        lc(false);
        Mc();
    }

    public final void ra(TLRPC.User user) {
        boolean z10;
        ci.d4 d4Var = this.f44963v1;
        if (d4Var != null && d4Var.V) {
            d4Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ci.d4 d4Var2 = this.f44976w1;
        if (d4Var2 != null && d4Var2.V) {
            d4Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new qg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21286n0) {
            this.f45025zc.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f44788h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44753e0;
            if (xVar != null) {
                xVar.f(8);
            }
            es esVar = this.f44739d0;
            if (esVar != null) {
                esVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f44800i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f44813j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f44862n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f44825k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f44873o0 = true;
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
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f44813j0;
        if (u0Var5 != null) {
            this.f44751dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f44751dc = false;
        }
        db(null, user);
        Cc(0, true);
    }

    public final void rb(long j3) {
        this.f44743d4 = j3;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20053id = (int) j3;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void rc() {
        final long j3;
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
        if (ChatObject.isMonoForum(this.f44752e)) {
            if (this.f44752e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.f44752e.f20032id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f44752e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j10 = this.f44752e.send_paid_messages_stars;
                int i12 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f20032id), LocaleController.formatNumber(j10, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f20032id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(yh.p7.S0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.S0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final zn f37675b;

                    {
                        this.f37675b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                zn.c0(j10, this.f37675b);
                                return;
                            default:
                                zn.o1(j10, this.f37675b);
                                return;
                        }
                    }
                });
                return;
            }
            this.S0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f44707a8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.zo zoVar = this.S0;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                zoVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.T5))), LocaleController.getString(R.string.MessagePremiumUnlock), new ai.e2(7));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.zo zoVar2 = this.S0;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                zoVar2.c(z10, false, AndroidUtilities.replaceTags(yh.p7.S0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.T5), LocaleController.formatNumber(this.f44707a8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final zn f37675b;

                    {
                        this.f37675b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                zn.c0(j3, this.f37675b);
                                return;
                            default:
                                zn.o1(j3, this.f37675b);
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
        float f7 = this.Ac.f16365e;
        org.telegram.ui.Components.v40 v40Var = this.f44938t1;
        int i11 = 8;
        if (v40Var != null) {
            v40Var.setAlpha(f7);
            org.telegram.ui.Components.v40 v40Var2 = this.f44938t1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            v40Var2.setVisibility(i10);
        }
        ai.w0 w0Var = this.L3;
        if (w0Var != null) {
            float f10 = 1.0f - f7;
            w0Var.setAlpha(f10);
            ai.w0 w0Var2 = this.L3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            w0Var2.setVisibility(i11);
        }
    }

    public final void s9() {
        this.X0.invalidate();
        Iterator it = this.f45001y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void sa(long j3) {
        int i10 = 0;
        if (j3 < 0) {
            if (j3 == a()) {
                this.f44701a1.e(true, false);
            } else if (getMessagesController().isCommunity(j3)) {
                showDialog(new fi.k0(this, -j3, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j3);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new zn(bundle));
                }
            }
        } else if (j3 != getUserConfig().getClientUserId()) {
            if (j3 == a()) {
                this.f44701a1.e(true, false);
                return;
            }
            Bundle f7 = sc.v.f(j3, "user_id");
            if (this.h != null && j3 == this.f44764f.f20179id) {
                f7.putLong("dialog_id", this.T5);
            }
            ProfileActivity profileActivity = new ProfileActivity(f7, null);
            TLRPC.User user = this.f44764f;
            if (user != null && user.f20179id == j3) {
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

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        qf qfVar = this.f44906qa;
        if (qfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(qfVar);
        }
        ok okVar = this.Y;
        if (okVar != null && this.X0 != null && okVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f21412f) {
            this.f44894pa = this.X0.getKeyboardHeight();
        } else {
            this.f44894pa = -1;
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
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.w0)) {
                ((org.telegram.ui.Cells.w0) view2).setInvalidateWithParent(null);
            }
            this.J8 = view;
            if (view instanceof org.telegram.ui.Cells.w0) {
                ((org.telegram.ui.Cells.w0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void sc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.sc(boolean):void");
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.y o9 = kVar.o();
            if (this.inMenuMode) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            o9.setVisibility(i10);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TLRPC.Message message;
        long j3;
        org.telegram.ui.ActionBar.f2 f2Var;
        float f7;
        float f10;
        ok okVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f44764f != null && this.f44862n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f44764f.f20179id);
            if (userFull != null && userFull.phone_calls_available) {
                this.L9 = !this.inPreviewMode;
                this.f44862n0.f(0);
            } else {
                this.L9 = false;
                this.f44862n0.f(8);
            }
        }
        qj qjVar = this.f44701a1;
        float f12 = 0.0f;
        if (qjVar != null) {
            qjVar.setOccupyStatusBar(!z10);
            qj qjVar2 = this.f44701a1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            qjVar2.setLayoutParams(w7.x5.a(-1.0f, f11, 0.0f, 52.0f, 0.0f, -2, 51));
        }
        ok okVar2 = this.Y;
        if (okVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            okVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.qz0 qz0Var = this.f44740d1;
        if (qz0Var != null) {
            if (this.Z4 && !z10 && ((okVar = this.Y) == null || !okVar.f23989z3)) {
                i11 = 0;
            }
            qz0Var.setVisibility(i11);
        }
        gk gkVar = this.I1;
        if (gkVar != null) {
            ViewPropertyAnimator animate = gkVar.animate();
            if (!this.Y.f23989z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.is.f27451f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                f2Var = new org.telegram.ui.ActionBar.f2(false);
            } else {
                f2Var = null;
            }
            kVar.setBackButtonDrawable(f2Var);
            org.telegram.ui.ActionBar.u0 u0Var = this.f44788h0;
            if (u0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.x xVar = this.f44753e0;
            if (xVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                xVar.f21662i = f12;
                org.telegram.ui.ActionBar.u0 u0Var2 = xVar.f21666m;
                if (u0Var2 != null) {
                    u0Var2.setAlpha(f12);
                }
            }
        }
        wj wjVar = this.f44989x0;
        if (wjVar != null) {
            int childCount = wjVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f44989x0.getChildAt(i12);
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
                        int i13 = this.f44842l6 - 1;
                        this.f44842l6 = i13;
                        if (i13 <= 0) {
                            this.f44842l6 = 0;
                            this.f44854m6 = true;
                            Ob(false);
                        } else {
                            this.f44814j1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.f44752e)) {
                            j3 = this.f44752e.f20032id;
                        } else {
                            j3 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j3, this.T5);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        u1Var.setHighlighted(false);
                        u1Var.O3();
                    }
                }
            }
            this.f44989x0.setItemAnimator(null);
        }
        lc(false);
        Oc();
        ik ikVar = this.X1;
        if (ikVar != null) {
            if (!z10 && !this.Pa) {
                z12 = true;
            } else {
                z12 = false;
            }
            ikVar.setEnabled(z12);
        }
        ik ikVar2 = this.Z1;
        if (ikVar2 != null) {
            if (!z10 && !this.Pa) {
                z11 = true;
            } else {
                z11 = false;
            }
            ikVar2.setEnabled(z11);
        }
        ll llVar = this.f44991x2;
        if (llVar != null) {
            llVar.setEnabled(!isInPreviewMode());
        }
        sm smVar = this.X0;
        if (smVar != null) {
            smVar.setOccupyStatusBar((this.inBubbleMode || this.Pa || this.inPreviewMode) ? false : false);
        }
    }

    public final void t7() {
        if (this.X0 == null) {
            return;
        }
        this.f44936sc = F6(false);
        this.f44948tc = F6(true);
        this.S.setInputBubbleHeight(this.f44936sc);
        Ac();
        kc();
        p7();
        m7();
        r7();
        q7();
    }

    public final org.telegram.ui.Cells.a0 t8(int i10, boolean z10) {
        MessageObject messageObject;
        wj wjVar = this.f44989x0;
        if (wjVar != null) {
            int childCount = wjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f44989x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f44933s9 - this.f44958u9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f44989x0.getMeasuredHeight() - this.Ba) {
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
            sm smVar = this.X0;
            if (smVar != null) {
                smVar.invalidate();
            }
            wj wjVar = this.f44989x0;
            if (wjVar != null) {
                wjVar.invalidate();
            }
        }
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(b9(org.telegram.ui.Components.a41.f24434c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(16.0f));
        }
        y7();
    }

    public final void ta(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f44762ea);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().R1()) {
                PhotoViewer.t1().G0(false, false);
            }
            PhotoViewer.t1().g2(arrayList, 0, 0, false, new ul(this, createVideoThumbnail, arrayList), this);
            return;
        }
        o8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.T5, this.f44867n5, this.X3, null, this.f44841l5, null, 0, this.p5, true, 0, 0, false, false, null, H8(), 0L, 0L, S8(), this.f44782g5);
        B6();
    }

    public final void tb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f44731c4 = tL_forumTopic;
        this.f44703a4 = arrayList;
        MessageObject messageObject = (MessageObject) hg.c.g(1, arrayList);
        this.X3 = messageObject;
        this.f44867n5 = messageObject;
        this.f44829k4 = i11;
        this.l4 = i12;
        this.f44852m4 = Math.max(1, i11);
        this.f44743d4 = this.X3.getId();
        this.f44757e4 = i10;
        this.f44769f4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44792h4 = z10;
        MessageObject messageObject2 = this.f44867n5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44781g4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        Dc();
        Uc(false);
        lc(false);
    }

    public final void tc() {
        MessageObject messageObject;
        if (this.f44764f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                wj wjVar = this.f44989x0;
                if (wjVar != null) {
                    int childCount = wjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f44989x0.getChildAt(i10);
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f44892p8, this.f44904q8, this.f44764f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f34459h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f44764f, null, null, messageObject2.getId());
            }
        }
    }

    public final void u7() {
        int i10;
        zn znVar = this.f44749da;
        if (znVar != null) {
            znVar.u7();
        }
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) a9(AndroidUtilities.dp(7.0f)));
        zk zkVar = this.f44874o1;
        if (zkVar != null) {
            i10 = AndroidUtilities.dp(zkVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(E8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.d());
        ai.w0 w0Var = this.L3;
        if (w0Var != null) {
            w0Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.v40 v40Var = this.f44938t1;
        if (v40Var != null) {
            v40Var.f31675e.setPadding(0, dp2, 0, dp3);
            v40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        ai.f0 f0Var = this.K3;
        if (f0Var != null) {
            jh.f fVar = (jh.f) f0Var.f933b;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.k10 k10Var = this.f44729c2;
        if (k10Var != null) {
            k10Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.cy0 cy0Var = this.f44741d2;
        if (cy0Var != null) {
            cy0Var.f25348a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final org.telegram.ui.Cells.w0 u8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f44989x0 != null && this.A0 != null) {
            for (int i10 = 0; i10 < this.f44989x0.getChildCount(); i10++) {
                View childAt = this.f44989x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (org.telegram.ui.Wallet.l0.F(w0Var.getMessageObject(), wallettransaction)) {
                        return w0Var;
                    }
                }
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f44955u6;
                if (i11 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.l0.F((MessageObject) arrayList.get(i11), wallettransaction)) {
                    this.f44989x0.B0();
                    this.f45013z0.h1(this.A0.J + i11, 0);
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
            rj rjVar = this.v;
            float c10 = rjVar.c();
            me.m mVar = rjVar.f45907b;
            int max = (int) Math.max(0.0f, (c10 * mVar.f16393a) - AndroidUtilities.dp(29.0f));
            sm smVar = this.X0;
            ci.bb bbVar = smVar.L;
            Rect rect2 = this.Gc;
            if (bbVar != null) {
                rect2.set(0, 0, smVar.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                this.X0.L.setClipBounds(rect2);
            }
            if (this.f44989x0 != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f44989x0.getTop());
                wj wjVar = this.f44989x0;
                if (wjVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                wjVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(rjVar.v, rjVar.c() * mVar.f16393a) - AndroidUtilities.dp(29.0f))));
                jh.f fVar = this.X;
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
        this.f44701a1.setTranslationY(0.0f);
        this.f44701a1.getAvatarImageView().setScaleX(1.0f);
        this.f44701a1.getAvatarImageView().setScaleY(1.0f);
        this.f44701a1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void ub() {
        AndroidUtilities.shakeViewSpring(this.f44989x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        ok okVar = this.Y;
        for (int i10 = 0; i10 < okVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(okVar.getChildAt(i10), 5.0f);
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
        getNotificationCenter().doOnIdle(new ci.x0(this, messageObject, z10, 12));
    }

    @Override
    public final boolean v() {
        if (this.h != null) {
            return true;
        }
        return false;
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
        float f7 = (1.0f - this.yc.f16365e) * (1.0f - this.f44987wc.f16365e);
        this.f44814j1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f44814j1.setAlpha(f7);
        jh.h hVar = this.f44814j1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final void v8() {
        if (this.f44832k7) {
            return;
        }
        this.f44832k7 = true;
        getMessagesController().checkSensitive(this, this.T5, new le(this, 24), new qf(this, 18));
    }

    public final void v9(int i10) {
        zn znVar = this.f44749da;
        if (znVar != null) {
            znVar.v9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.F != null) {
            yf.b0 b0Var = this.Dc;
            if (b0Var.f52204c == 0) {
                b0Var.invalidate();
            }
            b0Var.f52204c = i10 | b0Var.f52204c;
        }
    }

    public final void va(long j3, boolean z10) {
        if (this.R1 != null && UserObject.isBotForum(this.f44764f)) {
            this.R1.setAllTopicsHidden(true);
        }
        this.M5.put(j3, 1);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 0, new ci.o9(this, j3, z10, 5), new ke(this, j3, 2));
        this.A0.O(false);
    }

    public final void vb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44762ea);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.a2 a2Var = alertDialog$Builder.f20368a;
        a2Var.R = string;
        TLRPC.User user = this.f44764f;
        if (user != null) {
            if (user.bot) {
                a2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String g10 = org.telegram.messenger.ai.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, hf.b.c());
                TLRPC.User user2 = this.f44764f;
                a2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, g10, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            a2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new gg.c2(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(a2Var);
    }

    public final void vc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f44995x6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                yj yjVar = this.f45002y0;
                if (yjVar != null) {
                    yjVar.V(groupedMessages);
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
            MessageObject messageObject3 = (MessageObject) this.f44879o6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.A0.N) {
                a0.i iVar = this.Za;
                if (iVar != null) {
                    messageObject2 = (MessageObject) iVar.f(messageObject.getId());
                } else {
                    messageObject2 = null;
                }
                int indexOf = this.A0.P.indexOf(messageObject2);
                if (messageObject2 != null && z10) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                }
                if (indexOf >= 0) {
                    mm mmVar = this.A0;
                    mmVar.m(mmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f44955u6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                mm mmVar2 = this.A0;
                mmVar2.m(mmVar2.J + indexOf2);
            }
        }
    }

    @Override
    public final boolean w(final org.telegram.ui.sy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.eg1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.w(org.telegram.ui.sy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.eg1):boolean");
    }

    public final void w6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.w6():void");
    }

    public final void w7() {
        zn znVar = this.f44749da;
        if (znVar != null) {
            znVar.w7();
        }
        float a92 = a9(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.R1 != null) {
            a92 += b9(org.telegram.ui.Components.a41.f24432a);
        }
        if (this.f44874o1 != null) {
            a92 += AndroidUtilities.dp(35.0f) * this.f44874o1.E;
        }
        this.X.setFadeZoneTop((int) ((E8() * AndroidUtilities.dp(43.0f)) + a92));
    }

    public final boolean w8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f44989x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f44989x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (currentMessagesGroup = ((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f44955u6.indexOf((MessageObject) hg.c.g(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        mm mmVar = this.A0;
                        mmVar.q(indexOf + mmVar.J, currentMessagesGroup.messages.size());
                        this.f44989x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            hg.c.v(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.b5 b5Var = this.parentLayout;
        if (b5Var != null && !b5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.f2(z10));
        return false;
    }

    public final void w9() {
        this.f44920ra = true;
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
        if (A9() && this.f44867n5 == null && this.p5 == null) {
            if (this.R3 != 8 && A9() && this.f44752e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f44752e.f20032id, 1L);
                if (this.R3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.f44752e, findTopic)) {
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
        wj wjVar = this.f44989x0;
        gk gkVar = this.I1;
        if ((gkVar != null && gkVar.I) || ((m1Var = this.Q8) != null && m1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        wjVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e7) {
            FileLog.e(e7);
        }
    }

    public final void x6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.i iVar = this.f44981w6;
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

    public final void x7() {
        if (this.M0 != null) {
            this.M0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - E8()) * (1.0f - this.yc.f16365e) * W8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final void x8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j3) {
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
                this.o9 = true;
                mm mmVar = this.A0;
                if (mmVar != null) {
                    mmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.T5, z10, z11, z12, i10, 0, this.X3, -1, j3, S8(), this.f44782g5);
            org.telegram.ui.Components.g5.s0(sendMessage, this, this.f44762ea);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new qf(this, 25));
            }
        }
    }

    public final void x9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f44764f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f44955u6.isEmpty();
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
        this.f44987wc.a(false, true);
        qh.c cVar = this.Cc;
        if (cVar != null && (u1Var = cVar.f46743n) != null && u1Var.getDelegate() != null) {
            cVar.f46743n.getDelegate().K1(cVar.f46743n, false);
        }
        ok okVar = this.Y;
        if (okVar != null) {
            okVar.T0(true, true, false);
            this.Y.U4 = null;
        }
    }

    public final void xb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.ad.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f44762ea).j();
    }

    public final void xc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    public final void y6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.q9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f44752e, this.f44764f, null, this.T5, this.f44971va, this.f44959ua);
    }

    public final void y7() {
        float f7 = this.f44984w9;
        zk zkVar = this.f44874o1;
        if (zkVar != null) {
            zkVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.f44874o1.E;
        }
        lk lkVar = this.f44886p1;
        if (lkVar != null) {
            lkVar.setTranslationY(f7);
        }
        float E8 = (E8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.e41 e41Var = this.R1;
        org.telegram.ui.Components.a41 a41Var = org.telegram.ui.Components.a41.f24432a;
        if (e41Var != null) {
            e41Var.setSideMenuBackgroundMarginTop((E8() * a9(AndroidUtilities.dp(7.0f))) + E8);
            float b92 = b9(a41Var);
            float b10 = yf.e0.b(this.yc.f16365e);
            float E82 = E8();
            E8 += yf.e0.b(Math.min(w7.o.a(yf.e0.b(b10), 0.0f, 1.0f), w7.o.a(yf.e0.b(E82), 0.0f, 1.0f))) * b92;
        }
        org.telegram.ui.Components.fh fhVar = this.M0;
        if (fhVar != null) {
            fhVar.setTranslationY((E8 - AndroidUtilities.dp(5.0f)) - (E8() * b9(a41Var)));
        }
    }

    public final int y8() {
        return this.R3;
    }

    public final boolean y9() {
        if (this.R1 != null && this.f44743d4 == 0) {
            return true;
        }
        return false;
    }

    public final void ya(org.telegram.ui.Cells.u1 u1Var) {
        qh.c cVar;
        if (this.f44987wc.f16366f && (cVar = this.Cc) != null && cVar.f46743n == u1Var) {
            Editable text = cVar.f46738a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(u1Var.getMessageObject(), text, this.Cc.getAttachedMedia());
                xa();
                return;
            }
            AndroidUtilities.shakeView(this.Cc.f46738a);
        }
    }

    public final void yb(org.telegram.ui.Cells.u1 u1Var) {
        if (getParentActivity() != null && u1Var != null && u1Var.f23307ob != null && u1Var.getPrimaryMessageObject() != null && u1Var.getPrimaryMessageObject().messageOwner != null && u1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Xa) {
                this.Xa = true;
                if (this.f45014z1 != null) {
                    return;
                }
                ci.d4 d4Var = new ci.d4(getParentActivity(), 3);
                d4Var.p(true);
                d4Var.K = Layout.Alignment.ALIGN_NORMAL;
                d4Var.d = -1L;
                d4Var.T = true;
                d4Var.f4908e = true;
                d4Var.i();
                d4Var.q(8.0f);
                this.f45014z1 = d4Var;
                d4Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                ci.d4 d4Var2 = this.f45014z1;
                d4Var2.h = ci.d4.a(d4Var2.getText(), this.f45014z1.getTextPaint());
                this.X0.addView(this.f45014z1, w7.x5.a(120.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 55));
                this.X0.post(new org.telegram.ui.ActionBar.a6(27, this, u1Var));
            }
        }
    }

    public final void yc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zn.yc():void");
    }

    @Override
    public final org.telegram.ui.Components.uw0 z() {
        return this.X0;
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
        SparseArray sparseArray = this.f44968v6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.i iVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f44955u6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.T5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f44879o6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j3 = this.f44752e.f20032id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j3, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f44995x6.f(messageObject.getGroupId());
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
                if (iVar != null) {
                    int m10 = iVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) iVar.n(i15);
                        int indexOf2 = arrayList.indexOf((MessageObject) hg.c.g(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            mm mmVar = this.A0;
                            if (!mmVar.N) {
                                mmVar.q(indexOf2 + mmVar.J, groupedMessages2.messages.size());
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
        ai.h4 h4Var;
        r0.a1 w0Var;
        if (k1Var != null && (h4Var = this.J1) != null) {
            if (h4Var.isShowing() || this.J1.f33273x0) {
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
                w0Var.c(8, i0.b.f11574e);
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
        zg.n0 d = zg.n0.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.u1) {
            messageObject = ((org.telegram.ui.Cells.u1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) a0Var).getMessageObject();
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
                MessageObject messageObject3 = (MessageObject) this.f44879o6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f44900q3 != null) {
                oc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.f44900q3)) {
            MessageObject.GroupedMessages c92 = c9(messageObject2);
            if (c92 != null) {
                for (int i10 = 0; i10 < c92.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(c92.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            gg.n1 n1Var = this.M3;
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
                    uk ukVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(ukVar, property, 0.1f);
                    uk ukVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(ukVar2, property2, 0.1f);
                    uk ukVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(ukVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
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
                this.H0.addListener(new ai.n(28, this, z10));
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
            uk ukVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            ukVar4.setVisibility(i11);
            org.telegram.ui.Components.fa0 fa0Var = this.D0;
            if (!z10 && this.C0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            fa0Var.setVisibility(i12);
            uk ukVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            ukVar5.setScaleX(f11);
            org.telegram.ui.Components.fa0 fa0Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            fa0Var2.setScaleX(f12);
            uk ukVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            ukVar6.setScaleY(f13);
            org.telegram.ui.Components.fa0 fa0Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            fa0Var3.setScaleY(f16);
            uk ukVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            ukVar7.setAlpha(f14);
            org.telegram.ui.Components.fa0 fa0Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            fa0Var4.setAlpha(f15);
        }
    }

    public final void zc() {
        boolean z10;
        boolean z11;
        if (this.f44814j1 == null) {
            return;
        }
        if (this.f44786g9 && !g9() && !this.Y.u0() && !this.Pa && (!this.f44927s3 || getMediaDataController().searchResultMessages.isEmpty())) {
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
            this.f44826k1 = false;
        } else {
            this.B7 = 0;
            this.f44818j6 = 0;
            z11 = true;
        }
        this.f44814j1.e(1, z10, z11);
    }

    @Override
    public final void O() {
    }

    public void aa(boolean z10) {
    }
}
