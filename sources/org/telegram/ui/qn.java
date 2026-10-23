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
public class qn extends org.telegram.ui.ActionBar.n2 implements NotificationCenter.NotificationCenterDelegate, vx, ic0, org.telegram.ui.Components.ek, org.telegram.ui.Components.bh, ng.b, org.telegram.ui.Components.y50, ne.d {
    public static int Ic = 22;
    public static float Jc = 1.4f;
    public static int Kc = 10;
    public static Pattern Lc;
    public static Pattern Mc;
    public static Pattern Nc;
    public static final int[] Oc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Pc = false;
    public static final Rect Qc = new Rect();
    public dm A0;
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
    public lk B0;
    public pl B1;
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
    public final ne.b Bc;
    public boolean C0;
    public float C1;
    public final pn[] C2;
    public int C3;
    public kf C4;
    public TLRPC.PhotoSize C5;
    public final boolean[] C6;
    public int C7;
    public BitmapShader C8;
    public boolean C9;
    public ChatMessageSharedResources Ca;
    public ke Cb;
    public final j6.l Cc;
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
    public rh.c Dc;
    public final re.b E;
    public TextView E0;
    public ChannelBoostsController.CanApplyBoost E1;
    public final ai.vd[] E2;
    public FlagSecureReason E3;
    public boolean E4;
    public TLObject E5;
    public final boolean[] E6;
    public boolean E7;
    public Matrix E8;
    public long E9;
    public float Ea;
    public boolean Eb;
    public zf.b0 Ec;
    public final bh.f F;
    public kk F0;
    public boolean F1;
    public NumberTextView F2;
    public boolean F3;
    public boolean F4;
    public int F5;
    public boolean F6;
    public boolean F7;
    public Paint F8;
    public int F9;
    public al Fa;
    public final RectF Fb;
    public final ArrayList Fc;
    public final int G;
    public RadialProgressView G0;
    public ke G1;
    public int G2;
    public MessageObject G3;
    public int G4;
    public TLRPC.WebPage G5;
    public boolean G6;
    public boolean G7;
    public final Paint G8;
    public int G9;
    public final kl Ga;
    public org.telegram.ui.ActionBar.b2 Gb;
    public final ArrayList Gc;
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
    public final rl Ha;
    public long Hb;
    public final Rect Hc;
    public final gh.d I;
    public boolean I0;
    public xj I1;
    public boolean I2;
    public MessageObject I3;
    public int I4;
    public String I5;
    public boolean I6;
    public boolean I7;
    public boolean I8;
    public int I9;
    public ArrayList Ia;
    public final kg Ib;
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
    public final bi Ja;
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
    public final gi Ka;
    public boolean Kb;
    public final gh.e L;
    public ei.x3 L0;
    public TextView L1;
    public ImageView L2;
    public ai.u1 L3;
    public int L4;
    public ke L5;
    public long L6;
    public int L7;
    public float L8;
    public boolean L9;
    public final zi La;
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
    public final dn Ma;
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
    public final kf Na;
    public df Nb;
    public boolean O;
    public jk O0;
    public TextView O1;
    public nk O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final ArrayList O6;
    public long O7;
    public boolean O8;
    public float O9;
    public final kf Oa;
    public ArrayList Ob;
    public FrameLayout P;
    public kh.c P0;
    public rk P1;
    public TextView P2;
    public TL_account.TL_businessChatLink P3;
    public int P4;
    public long P5;
    public final Paint P6;
    public String P7;
    public AnimatorSet P8;
    public lp P9;
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
    public ik R;
    public LinearLayout R0;
    public org.telegram.ui.Components.s31 R1;
    public ik R2;
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
    public li T0;
    public org.telegram.ui.Components.x90 T1;
    public ImageView T2;
    public boolean T3;
    public AnimatorSet T4;
    public long T5;
    public final org.telegram.ui.ActionBar.f5 T6;
    public int T7;
    public org.telegram.ui.ActionBar.e1 T8;
    public qn T9;
    public boolean Ta;
    public boolean Tb;
    public FrameLayout U;
    public ig.b2 U0;
    public ImageView U1;
    public org.telegram.ui.Components.q6 U2;
    public String U3;
    public final SparseIntArray U4;
    public Long U5;
    public long U6;
    public ke U7;
    public final dk U8;
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
    public em V8;
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
    public mk W8;
    public final nk W9;
    public boolean Wa;
    public boolean Wb;
    public kh.f X;
    public jm X0;
    public zj X1;
    public wj X2;
    public MessageObject X3;
    public boolean X4;
    public final SparseArray[] X5;
    public final Matrix X6;
    public boolean X7;
    public int X8;
    public vh.i X9;
    public boolean Xa;
    public boolean Xb;
    public fk Y;
    public org.telegram.ui.Components.po Y0;
    public FrameLayout Y1;
    public vj Y2;
    public MessageObject Y3;
    public boolean Y4;
    public final SparseArray[] Y5;
    public LinearGradient Y6;
    public boolean Y7;
    public int Y8;
    public ah.f0 Y9;
    public a0.h Ya;
    public boolean Yb;
    public gk Z;
    public final ArrayList Z0;
    public zj Z1;
    public org.telegram.ui.Cells.w0 Z2;
    public boolean Z3;
    public boolean Z4;
    public boolean Z5;
    public int Z6;
    public TLRPC.ChatFull Z7;
    public int Z8;
    public x31 Z9;
    public a0.h Za;
    public b9 Zb;
    public int f40615a;
    public ah.x f40616a0;
    public hj f40617a1;
    public FrameLayout a2;
    public int f40618a3;
    public ArrayList f40619a4;
    public boolean f40620a5;
    public int f40621a6;
    public int f40622a7;
    public TLRPC.UserFull f40623a8;
    public boolean f40624a9;
    public boolean f40625aa;
    public long f40626ab;
    public int f40627ac;
    public boolean f40628b;
    public int f40629b0;
    public org.telegram.ui.Components.q6 f40630b1;
    public TextView f40631b2;
    public org.telegram.ui.Components.r60 f40632b3;
    public MessageObject f40633b4;
    public boolean f40634b5;
    public int f40635b6;
    public final Paint f40636b7;
    public org.telegram.ui.Cells.f6 f40637b8;
    public boolean f40638b9;
    public org.telegram.ui.Components.wp f40639ba;
    public vk f40640bb;
    public ValueAnimator f40641bc;
    public boolean f40642c;
    public org.telegram.ui.ActionBar.s0 f40643c0;
    public fh f40644c1;
    public org.telegram.ui.Components.b10 f40645c2;
    public View f40646c3;
    public TLRPC.TL_forumTopic f40647c4;
    public MessageObject f40648c5;
    public int f40649c6;
    public final Matrix f40650c7;
    public q01 f40651c8;
    public km f40652c9;
    public on f40653ca;
    public boolean f40654cb;
    public ni f40655cc;
    public boolean d;
    public ur f40656d0;
    public org.telegram.ui.Components.iz0 f40657d1;
    public org.telegram.ui.Components.tx0 f40658d2;
    public boolean f40659d3;
    public long f40660d4;
    public MessageObject f40661d5;
    public int f40662d6;
    public LinearGradient f40663d7;
    public final a0.h f40664d8;
    public View f40665d9;
    public qn f40666da;
    public boolean db;
    public boolean f40667dc;
    public TLRPC.Chat e;
    public org.telegram.ui.ActionBar.x f40668e0;
    public org.telegram.ui.ActionBar.s0 f40669e1;
    public org.telegram.ui.Components.r40 f40670e2;
    public boolean f40671e3;
    public int f40672e4;
    public MessageObject.GroupedMessages f40673e5;
    public int f40674e6;
    public boolean e7;
    public String f40675e8;
    public boolean f40676e9;
    public on f40677ea;
    public boolean f40678eb;
    public int f40679ec;
    public TLRPC.User f40680f;
    public org.telegram.ui.ActionBar.s0 f40681f0;
    public org.telegram.ui.ActionBar.s0 f40682f1;
    public org.telegram.ui.Components.r40 f40683f2;
    public boolean f40684f3;
    public TLRPC.Chat f40685f4;
    public MessagePreviewParams f40686f5;
    public int f40687f6;
    public boolean f7;
    public long f40688f8;
    public boolean f40689f9;
    public xh.d f40690fa;
    public ArrayList f40691fb;
    public int fc;
    public org.telegram.ui.ActionBar.s0 f40692g0;
    public org.telegram.ui.ActionBar.s0 f40693g1;
    public aj f40694g2;
    public AnimatorSet f40695g3;
    public boolean f40696g4;
    public MessageSuggestionParams f40697g5;
    public int f40698g6;
    public int f40699g7;
    public String f40700g8;
    public boolean f40701g9;
    public final ChatMessagesMetadataController f40702ga;
    public ValueAnimator f40703gb;
    public int f40704gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.u0 f40705h0;
    public org.telegram.ui.ActionBar.s0 f40706h1;
    public boolean f40707h2;
    public ValueAnimator f40708h3;
    public boolean f40709h4;
    public MessageObject f40710h5;
    public final ArrayList f40711h6;
    public boolean f40712h7;
    public boolean f40713h8;
    public il f40714h9;
    public TLRPC.TL_channels_sendAsPeers ha;
    public boolean f40715hb;
    public int hc;
    public org.telegram.ui.ActionBar.x f40716i0;
    public org.telegram.ui.Components.zo f40717i1;
    public org.telegram.ui.Components.r40 f40718i2;
    public float f40719i3;
    public boolean f40720i4;
    public MessageObject.GroupedMessages f40721i5;
    public boolean f40722i6;
    public boolean f40723i7;
    public boolean f40724i8;
    public boolean f40725i9;
    public TL_account.resolvedBusinessChatLinks ia;
    public Boolean f40726ib;
    public int f40727ic;
    public org.telegram.ui.ActionBar.u0 f40728j0;
    public kh.h f40729j1;
    public boolean f40730j2;
    public boolean f40731j3;
    public boolean f40732j4;
    public MessageObject.GroupedMessages f40733j5;
    public int f40734j6;
    public int f40735j7;
    public String f40736j8;
    public float f40737j9;
    public boolean f40738ja;
    public boolean f40739jb;
    public boolean f40740jc;
    public org.telegram.ui.ActionBar.u0 f40741k0;
    public boolean f40742k1;
    public org.telegram.ui.Components.r40 f40743k2;
    public boolean f40744k3;
    public int f40745k4;
    public MessageObject f40746k5;
    public int f40747k6;
    public boolean f40748k7;
    public String f40749k8;
    public yj f40750k9;
    public boolean f40751ka;
    public boolean f40752kb;
    public long f40753kc;
    public org.telegram.ui.ActionBar.s0 f40754l0;
    public int l1;
    public org.telegram.ui.Components.r40 f40755l2;
    public boolean f40756l3;
    public int l4;
    public gn f40757l5;
    public int f40758l6;
    public boolean f40759l7;
    public MessageObject f40760l8;
    public org.telegram.ui.Cells.u1 f40761l9;
    public float f40762la;
    public int f40763lb;
    public TLRPC.TL_messages_discussionMessage f40764lc;
    public org.telegram.ui.ActionBar.u0 m0;
    public int f40765m1;
    public org.telegram.ui.Components.r40 f40766m2;
    public boolean f40767m3;
    public int f40768m4;
    public boolean f40769m5;
    public boolean f40770m6;
    public boolean f40771m7;
    public MessageObject f40772m8;
    public org.telegram.ui.Components.z00 f40773m9;
    public final hg f40774ma;
    public HashMap f40775mb;
    public TLRPC.messages_Messages f40776mc;
    public boolean f40777n;
    public org.telegram.ui.ActionBar.x f40778n0;
    public org.telegram.ui.Components.qc f40779n1;
    public org.telegram.ui.Components.r40 f40780n2;
    public boolean f40781n3;
    public qh f40782n4;
    public MessageObject f40783n5;
    public final ArrayList f40784n6;
    public int f40785n7;
    public int f40786n8;
    public boolean f40787n9;
    public final wk f40788na;
    public kf f40789nb;
    public boolean f40790nc;
    public boolean f40791o0;
    public qk f40792o1;
    public org.telegram.ui.Components.r40 f40793o2;
    public TLRPC.User f40794o3;
    public final SparseArray f40795o4;
    public int f40796o5;
    public final SparseArray[] f40797o6;
    public int f40798o7;
    public boolean f40799o8;
    public boolean f40800o9;
    public int f40801oa;
    public int ob;
    public in oc;
    public RadialProgressView f40802p0;
    public ck f40803p1;
    public org.telegram.ui.Cells.u1 f40804p2;
    public TLRPC.Chat f40805p3;
    public final ArrayList f40806p4;
    public MessageObject p5;
    public final SparseArray f40807p6;
    public boolean f40808p7;
    public long f40809p8;
    public ValueAnimator p9;
    public int f40810pa;
    public org.telegram.ui.ActionBar.b2 f40811pb;
    public cn f40812pc;
    public org.telegram.ui.ActionBar.s0 f40813q0;
    public ei.h1 f40814q1;
    public int f40815q2;
    public ah.i1 f40816q3;
    public int f40817q4;
    public boolean f40818q5;
    public final SparseArray q6;
    public kf f40819q7;
    public long f40820q8;
    public ValueAnimator f40821q9;
    public kf f40822qa;
    public int f40823qb;
    public ai.q7 f40824qc;
    public long f40825r;
    public org.telegram.ui.ActionBar.s0 f40826r0;
    public int f40827r1;
    public int f40828r2;
    public boolean f40829r3;
    public boolean f40830r4;
    public boolean f40831r5;
    public final HashMap f40832r6;
    public String f40833r7;
    public boolean f40834r8;
    public boolean f40835r9;
    public boolean f40836ra;
    public int f40837rb;
    public boolean f40838rc;
    public final HashMap f40839s;
    public org.telegram.ui.ActionBar.s0 f40840s0;
    public boolean f40841s1;
    public org.telegram.ui.Components.r40 f40842s2;
    public boolean f40843s3;
    public boolean f40844s4;
    public boolean f40845s5;
    public final SparseArray f40846s6;
    public boolean f40847s7;
    public String f40848s8;
    public float f40849s9;
    public boolean f40850sa;
    public boolean f40851sb;
    public boolean f40852sc;
    public org.telegram.ui.ActionBar.s0 f40853t0;
    public org.telegram.ui.Components.m40 f40854t1;
    public org.telegram.ui.Components.r40 f40855t2;
    public String f40856t3;
    public int f40857t4;
    public boolean f40858t5;
    public final a0.h f40859t6;
    public boolean f40860t7;
    public ik f40861t8;
    public float f40862t9;
    public long f40863ta;
    public int f40864tb;
    public float f40865tc;
    public ClippingImageView f40866u0;
    public org.telegram.ui.ActionBar.b2 f40867u1;
    public org.telegram.ui.Components.r40 f40868u2;
    public String f40869u3;
    public final ArrayList f40870u4;
    public int f40871u5;
    public final ArrayList f40872u6;
    public int f40873u7;
    public org.telegram.ui.Cells.u1 f40874u8;
    public int f40875u9;
    public int ua;
    public boolean f40876ub;
    public float f40877uc;
    public final ij v;
    public org.telegram.ui.Components.v11 f40878v0;
    public ei.x3 f40879v1;
    public org.telegram.ui.Components.aq f40880v2;
    public int f40881v3;
    public final HashMap f40882v4;
    public int f40883v5;
    public final SparseArray f40884v6;
    public int f40885v7;
    public o4 f40886v8;
    public int f40887v9;
    public int f40888va;
    public int f40889vb;
    public final ne.b f40890vc;
    public bj f40891w;
    public ih.g f40892w0;
    public ei.x3 f40893w1;
    public View f40894w2;
    public int f40895w3;
    public MessageObject f40896w4;
    public TLRPC.PhotoSize f40897w5;
    public final a0.h f40898w6;
    public int f40899w7;
    public TextureView f40900w8;
    public float w9;
    public ok f40901wa;
    public int f40902wb;
    public final ne.b f40903wc;
    public bj f40904x;
    public nj f40905x0;
    public ei.x3 f40906x1;
    public cl f40907x2;
    public int f40908x3;
    public int f40909x4;
    public TLRPC.PhotoSize f40910x5;
    public final a0.h f40911x6;
    public int f40912x7;
    public boolean f40913x8;
    public float f40914x9;
    public pk f40915xa;
    public int f40916xb;
    public final ne.b f40917xc;
    public final re.b f40918y;
    public pj f40919y0;
    public ei.x3 f40920y1;
    public ei.g6 f40921y2;
    public UndoView y3;
    public int f40922y4;
    public TLObject f40923y5;
    public final int[] f40924y6;
    public int f40925y7;
    public final kf f40926y8;
    public float f40927y9;
    public boolean f40928ya;
    public CharacterStyle f40929yb;
    public final ne.b yc;
    public qj f40930z0;
    public ei.x3 f40931z1;
    public org.telegram.ui.Components.qg0 f40932z2;
    public bl f40933z3;
    public final ArrayList f40934z4;
    public int f40935z5;
    public final int[] f40936z6;
    public int f40937z7;
    public final gh.b f40938z8;
    public float f40939z9;
    public float f40940za;
    public String f40941zb;
    public final ne.b zc;

    public qn(Bundle bundle) {
        super(bundle);
        this.f40615a = 0;
        this.f40642c = false;
        this.d = false;
        this.f40839s = new HashMap();
        this.v = new ij(this, new kf(this, 21));
        re.b bVar = new re.b();
        this.f40918y = bVar;
        re.b bVar2 = new re.b();
        this.E = bVar2;
        this.W = new ih.k();
        this.Z0 = new ArrayList();
        this.B2 = new org.telegram.ui.Components.w9[2];
        this.C2 = new pn[2];
        this.D2 = new org.telegram.ui.ActionBar.j5[2];
        this.E2 = new ai.vd[2];
        this.H2 = new AnimatorSet[2];
        this.I2 = false;
        this.f40618a3 = 500;
        this.P3 = null;
        this.S3 = -1;
        this.Z3 = true;
        this.f40795o4 = new SparseArray();
        this.f40806p4 = new ArrayList();
        this.f40870u4 = new ArrayList();
        this.f40882v4 = new HashMap();
        this.f40909x4 = -1;
        this.f40922y4 = 0;
        this.f40934z4 = new ArrayList(10);
        this.H4 = new ArrayList();
        this.J4 = new HashMap();
        this.K4 = new SparseArray();
        this.M4 = new int[1];
        this.U4 = new SparseIntArray();
        this.V4 = new SparseIntArray();
        this.Z4 = true;
        this.f40634b5 = true;
        this.f40818q5 = true;
        this.f40858t5 = true;
        this.M5 = new LongSparseIntArray();
        this.V5 = 1;
        this.W5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.X5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.Y5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f40711h6 = new ArrayList();
        this.f40722i6 = true;
        this.f40747k6 = Integer.MIN_VALUE;
        this.f40784n6 = new ArrayList();
        this.f40797o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f40807p6 = new SparseArray();
        this.q6 = new SparseArray();
        this.f40832r6 = new HashMap();
        this.f40846s6 = new SparseArray();
        this.f40859t6 = new a0.h();
        this.f40872u6 = new ArrayList();
        this.f40884v6 = new SparseArray();
        this.f40898w6 = new a0.h();
        this.f40911x6 = new a0.h();
        this.f40924y6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f40936z6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
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
        this.T6 = new org.telegram.ui.ActionBar.f5(0, false, false, new jj(this));
        this.X6 = new Matrix();
        Paint paint = new Paint(1);
        this.f40636b7 = paint;
        this.f40650c7 = new Matrix();
        this.f40785n7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f40912x7 = Integer.MAX_VALUE;
        this.f40925y7 = -1;
        this.G7 = true;
        this.L7 = Integer.MAX_VALUE;
        this.S7 = -1;
        this.T7 = -10000;
        this.f40664d8 = new a0.h();
        this.f40926y8 = new kf(this, 24);
        gh.b bVar3 = new gh.b();
        this.f40938z8 = bVar3;
        bh.b bVar4 = new bh.b(bVar3);
        this.A8 = bVar4;
        this.G8 = new Paint(1);
        this.H8 = 0.0f;
        this.K8 = 1.0f;
        this.L8 = 0.0f;
        this.R8 = true;
        this.U8 = new dk(this);
        this.f40787n9 = true;
        this.W9 = new nk(this, 0);
        this.f40702ga = new ChatMessagesMetadataController(this);
        this.f40774ma = new hg(this, 0);
        this.f40788na = new wk(this);
        this.f40810pa = -1;
        this.Ga = new kl(this);
        this.Ha = new rl(this);
        this.Ja = new bi(this);
        this.Ka = new gi(this);
        this.La = new zi(this);
        this.Ma = new dn(this);
        this.Na = new kf(this, 27);
        this.Oa = new kf(this, 29);
        this.db = false;
        this.Fb = new RectF();
        this.Ib = new kg(this, 1);
        this.Pb = new BotForumHelper.BotDraftAnimationsPool();
        this.Qb = new Object();
        this.f40667dc = false;
        org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
        this.f40890vc = new ne.b(0, this, bsVar, 320L, false);
        this.f40903wc = new ne.b(1, this, bsVar, 520L, false);
        this.f40917xc = new ne.b(2, this, bsVar, 520L, false);
        this.yc = new ne.b(3, this, bsVar, 320L, false);
        this.zc = new ne.b(4, this, bsVar, 320L, false);
        this.Ac = new ne.b(5, this, bsVar, 320L, false);
        this.Bc = new ne.b(6, this, bsVar, 320L, false);
        kg kgVar = new kg(this, 6);
        ?? obj = new Object();
        obj.f14289b = new float[32];
        obj.f14288a = 1;
        obj.d = new ne.l(obj, me.a.f16853a, 240L);
        obj.f14290c = kgVar;
        this.Cc = obj;
        this.Fc = new ArrayList();
        this.Gc = new ArrayList();
        this.Hc = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            bh.f fVar = new bh.f(false);
            this.F = fVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            gh.d dVar = new gh.d(obj2);
            this.I = dVar;
            dVar.v = new kg(this, 8);
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f11059f = obj2;
            bh.b bVar5 = new bh.b(dVar);
            this.K = bVar5;
            bVar5.f4360i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                gh.d dVar2 = new gh.d(obj2);
                this.H = dVar2;
                dVar2.v = new kg(this, 8);
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f11059f = obj2;
                bh.b bVar6 = new bh.b(dVar2);
                this.J = bVar6;
                bVar6.f4360i = LiteMode.isEnabled(262144);
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

    public static void A0(qn qnVar, MessageObject messageObject, Long l4, Runnable runnable) {
        ai.ga.y(qnVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void A1(qn qnVar, ag.a aVar, Runnable runnable) {
        if (!qnVar.isFinished) {
            if (ag.a.m(ai.ga.x(qnVar.currentAccount, aVar.f631a).p()).f632b < aVar.f632b) {
                ag.b bVar = aVar.f631a;
                if (bVar == ag.b.f633a) {
                    new ai.cd(qnVar.getParentActivity(), qnVar.getResourceProvider(), aVar.a(), 13, og.d.h(qnVar.currentAccount, qnVar.a()), null, qnVar.a()).show();
                    return;
                } else if (bVar == ag.b.f634b) {
                    new fi.f(qnVar.getParentActivity(), qnVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void B0(qn qnVar) {
        org.telegram.ui.Components.s40.h.a();
        qnVar.showDialog(new yh.o1(qnVar.getParentActivity(), qnVar.currentAccount, qnVar.a(), null, null));
    }

    public static void C0(org.telegram.ui.qn r19, org.telegram.ui.hk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.C0(org.telegram.ui.qn, org.telegram.ui.hk, boolean[]):void");
    }

    public static void C1(qn qnVar) {
        SparseArray[] sparseArrayArr = qnVar.W5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) qnVar.f40797o6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            qnVar.X5[i10].clear();
            qnVar.Y5[i10].clear();
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
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                qnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        qnVar.h9();
        qnVar.Dc(0, true);
        qnVar.bd(false);
        qnVar.Qc();
    }

    public static void D0(qn qnVar, TLRPC.Document document) {
        qnVar.f40882v4.put(document, 0);
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendSticker(document, null, qnVar.T5, null, null, null, qnVar.f40757l5, null, true, 0, 0, false, null, qnVar.H8(), 0L, qnVar.S8(), qnVar.f40697g5);
    }

    public static void E0(qn qnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(qnVar.currentAccount).getInputUser(user.f20427id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(qnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static org.telegram.ui.ju0 E1(org.telegram.ui.qn r14, org.telegram.messenger.MessageObject r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.E1(org.telegram.ui.qn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.ju0");
    }

    public static void F0(qn qnVar, long j10, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(qnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.x01.c(qnVar.getParentActivity(), qnVar.currentAccount, -j10, qnVar.getUserConfig().getCurrentUser(), null, z10, z11, qnVar.getResourceProvider());
    }

    public static TLRPC.TL_message F7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20301id = message.f20301id;
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

    public static void G0(qn qnVar) {
        long j10;
        ArrayList arrayList = qnVar.f40711h6;
        arrayList.add(Integer.valueOf(qnVar.V5));
        if (qnVar.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(qnVar.currentAccount);
            String str = qnVar.f40869u3;
            int i10 = qnVar.classGuid;
            int i11 = qnVar.O3;
            int i12 = qnVar.V5;
            qnVar.V5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (qnVar.f40899w7 != 0) {
            MessagesController messagesController = qnVar.getMessagesController();
            long j11 = qnVar.T5;
            long j12 = qnVar.L6;
            int i13 = qnVar.f40899w7;
            int i14 = qnVar.classGuid;
            int i15 = qnVar.R3;
            long j13 = qnVar.f40660d4;
            int i16 = qnVar.f40768m4;
            int i17 = qnVar.V5;
            qnVar.V5 = i17 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j13, i16, i17, qnVar.f40709h4);
        } else if (qnVar.f40873u7 != 0 && (!qnVar.K9() || qnVar.f40873u7 == qnVar.L7 || qnVar.f40709h4)) {
            int i18 = qnVar.f40735j7;
            if (i18 != 0) {
                qnVar.L6 = i18;
                MessagesController messagesController2 = qnVar.getMessagesController();
                long j14 = qnVar.L6;
                boolean z10 = qnVar.f40712h7;
                int i19 = qnVar.f40699g7;
                int i20 = qnVar.f40873u7;
                int i21 = qnVar.classGuid;
                int i22 = qnVar.R3;
                long j15 = qnVar.f40660d4;
                int i23 = qnVar.f40768m4;
                int i24 = qnVar.V5;
                qnVar.V5 = i24 + 1;
                messagesController2.loadMessages(j14, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j15, i23, i24, qnVar.f40709h4);
            } else {
                MessagesController messagesController3 = qnVar.getMessagesController();
                long j16 = qnVar.T5;
                long j17 = qnVar.L6;
                boolean z11 = qnVar.f40712h7;
                int i25 = qnVar.f40699g7;
                int i26 = qnVar.f40873u7;
                int i27 = qnVar.classGuid;
                int i28 = qnVar.R3;
                long j18 = qnVar.f40660d4;
                int i29 = qnVar.f40768m4;
                int i30 = qnVar.V5;
                qnVar.V5 = i30 + 1;
                messagesController3.loadMessages(j16, j17, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j18, i29, i30, qnVar.f40709h4);
            }
        } else if (qnVar.f40723i7) {
            qnVar.V5++;
        } else {
            MessagesController messagesController4 = qnVar.getMessagesController();
            long j19 = qnVar.T5;
            long j20 = qnVar.L6;
            boolean z12 = qnVar.f40712h7;
            int i31 = qnVar.f40699g7;
            int i32 = qnVar.f40873u7;
            int i33 = qnVar.classGuid;
            int i34 = qnVar.R3;
            long j21 = qnVar.f40660d4;
            int i35 = qnVar.f40768m4;
            int i36 = qnVar.V5;
            qnVar.V5 = i36 + 1;
            messagesController4.loadMessages(j19, j20, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j21, i35, i36, qnVar.f40709h4);
        }
        int i37 = qnVar.R3;
        if (i37 == 0 || (i37 == 3 && qnVar.N8() == qnVar.getUserConfig().getClientUserId())) {
            if (qnVar.K9() && !qnVar.f40709h4) {
                return;
            }
            arrayList.add(Integer.valueOf(qnVar.V5));
            MessagesController messagesController5 = qnVar.getMessagesController();
            long j22 = qnVar.T5;
            long j23 = qnVar.L6;
            int i38 = qnVar.classGuid;
            if (qnVar.R3 == 3) {
                j10 = 0;
            } else {
                j10 = qnVar.f40660d4;
            }
            long j24 = j10;
            int i39 = qnVar.f40768m4;
            int i40 = qnVar.V5;
            qnVar.V5 = i40 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j24, i39, i40, qnVar.f40709h4);
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
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.a41.k(messageObject)) {
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

    public static void H0(qn qnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        MessagesController.getNotificationsSettings(qnVar.currentAccount).edit().putLong("dialog_join_requested_time_" + qnVar.T5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(qnVar.e) && !qnVar.e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.a90.f24554r;
            org.telegram.ui.Components.a90.y(context, qnVar, org.telegram.ui.Components.xc.a0(qnVar), z10);
        }
        qnVar.Ab(false, true);
    }

    public static void I0(qn qnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, p6 p6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f20301id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(qnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            qnVar.getMessagesController().getStoriesController().f5498k.d(hVar, new eh(3, hVar, p6Var), qnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void I1(qn qnVar) {
        int i10;
        if (qnVar.a() == qnVar.getUserConfig().getClientUserId() && qnVar.getUserConfig().isPremium() && qnVar.f40640bb == null) {
            vk vkVar = new vk(qnVar, qnVar, qnVar.getParentActivity(), qnVar.currentAccount, qnVar.f40677ea);
            qnVar.f40640bb = vkVar;
            vkVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            qnVar.f40640bb.setDelegate(new xk(qnVar));
            qnVar.f40640bb.setTop(true);
            int i11 = 0;
            qnVar.f40640bb.setClipChildren(false);
            qnVar.f40640bb.setClipToPadding(false);
            qnVar.f40640bb.setVisibility(0);
            vk vkVar2 = qnVar.f40640bb;
            if (vkVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            vkVar2.setHint(LocaleController.getString(i10));
            qnVar.X0.addView(qnVar.f40640bb, w7.z5.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            qnVar.f40640bb.p(null, null, true);
            qnVar.f40640bb.setTranslationY(-AndroidUtilities.dp(12.0f));
            qnVar.f40640bb.setScaleY(0.4f);
            qnVar.f40640bb.setScaleX(0.4f);
            qnVar.f40640bb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.bs.h).start();
            qnVar.Qc();
            vk vkVar3 = qnVar.f40640bb;
            float f7 = qnVar.w9;
            qk qkVar = qnVar.f40792o1;
            if (qkVar != null) {
                i11 = qkVar.getCurrentHeight();
            }
            vkVar3.setTranslationY(f7 + i11);
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

    public static void J0(qn qnVar) {
        qnVar.J7(false);
        if (!qnVar.fragmentBeginToShow) {
            nj njVar = qnVar.f40905x0;
            njVar.W1 = false;
            njVar.X1 = 0;
            njVar.setEmptyView(qnVar.Q0);
            nj njVar2 = qnVar.f40905x0;
            njVar2.W1 = true;
            njVar2.X1 = 1;
            return;
        }
        qnVar.f40905x0.setEmptyView(qnVar.Q0);
    }

    public static void K0(qn qnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        qnVar.Rb(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static java.util.ArrayList K7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.K7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void L0(qn qnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = qnVar.I1.getAdapter().f11946w0;
        int i10 = qnVar.currentAccount;
        TLRPC.User user2 = qnVar.f40680f;
        if (user2 != null) {
            j10 = user2.f20427id;
        } else {
            j10 = qnVar.e.f20280id;
        }
        gi.t4 b10 = gi.t4.b(i10, j10, user.f20427id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, qnVar.S8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.H1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(qnVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(qnVar.currentAccount);
            MessagesController.showCantOpenAlert(qnVar, restrictionReason);
            return;
        }
        gi.d3 d3Var = new gi.d3(qnVar.getParentActivity(), qnVar.getResourceProvider());
        d3Var.x(false);
        d3Var.A0 = true;
        d3Var.f11148k0 = qnVar.getParentActivity();
        d3Var.t(qnVar, b10);
        d3Var.show();
    }

    public static void M0(qn qnVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(qnVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, qnVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(qnVar.currentAccount).editMessage(messageObject, null, false, qnVar, null, i10, i11);
        }
    }

    public static FrameLayout M7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.d6 d6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        ai.vd vdVar = new ai.vd(context, 13);
        int i11 = 3;
        vdVar.setMaxLines(3);
        vdVar.setGravity(3);
        vdVar.setEllipsize(TextUtils.TruncateAt.END);
        vdVar.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.E8, d6Var));
        vdVar.setTextSize(1, i10);
        vdVar.setMaxWidth(AndroidUtilities.dp(170.0f));
        vdVar.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(vdVar, w7.z5.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void N0(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(qnVar.currentAccount).loadAttachMenuBots(false, true);
            qnVar.ba(user.f20427id, qnVar.f40749k8, false);
        }
    }

    public static boolean P0(org.telegram.ui.qn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.P0(org.telegram.ui.qn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static a3.i0 P4(qn qnVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = qnVar.getMessagesController().createDeleteShowOnceTask(qnVar.T5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                qnVar.yc(arrayList, true);
            }
            return new a3.i0(qnVar, createDeleteShowOnceTask, messageObject, 16);
        }
        return null;
    }

    public static void Q0(qn qnVar, TLObject tLObject, TLRPC.User user) {
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
                tLObject2 = qnVar.e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = qnVar.f40680f;
                if (user2 != null && user2.bot && user.f20427id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.nk.q(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.xc.a0(qnVar), null);
                } else if (user2 != null && user2.bot && user.f20427id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.nk.q(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.xc.a0(qnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.nk.q(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.xc.a0(qnVar), null);
                } else {
                    TLRPC.Chat chat = qnVar.e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.nk.q(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.xc.a0(qnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = qnVar.e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.nk.q(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.xc.a0(qnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                qnVar.ba(user.f20427id, qnVar.f40749k8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.x6 x6Var = new org.telegram.ui.Components.x6(qnVar.getParentActivity());
                x6Var.setColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.ia, false));
                x6Var.setBackgroundColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.L5, false));
                x6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity());
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                b2Var.V = x6Var;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(qnVar, user, atomicBoolean, tL_attachMenuBot, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(qnVar.getParentActivity(), 5, qnVar.getResourceProvider());
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
                zh1.a(qnVar.getParentActivity(), new z(qnVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void R0(qn qnVar, long j10, long j11, Long l4) {
        int i10;
        String str;
        if (qnVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = qnVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(qnVar.e)) {
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
        org.telegram.ui.Components.f5.h0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new bh(qnVar, j10, j11, l4, 0), qnVar.resourceProvider, true);
    }

    public static void S0(qn qnVar, org.telegram.ui.Components.i80 i80Var) {
        if (qnVar.Mb == null) {
            return;
        }
        i80Var.u();
        qnVar.O9(qnVar.Mb, false, true);
        pf.d.q(qnVar.getParentActivity(), Uri.parse(qnVar.Mb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(qnVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void S3(qn qnVar) {
        org.telegram.ui.ActionBar.x xVar;
        if (!qnVar.db && (xVar = qnVar.f40716i0) != null) {
            xVar.a();
            org.telegram.ui.ActionBar.u0 u0Var = xVar.f21869m;
            u0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (qnVar.R3 == 0) {
                u0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            u0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            u0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            u0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = qnVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f28654a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o11(obj, 0), 0, spannableStringBuilder4.length(), 33);
                u0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f28654a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.o11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                u0Var.g(56, spannableStringBuilder5);
            }
            u0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (qnVar.h == null) {
                u0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            u0Var.g(54, LocaleController.getString(R.string.Regular));
            qnVar.db = true;
        }
    }

    public static void T0(qn qnVar, Object[] objArr, org.telegram.ui.Components.qy0 qy0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.xc xcVar = new org.telegram.ui.Components.xc(qy0Var.container, qnVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.qc q6 = xcVar.q(document, LocaleController.formatString(i10, stickerSet.title));
                q6.f29535j = 2750;
                q6.k(true);
            }
        }
    }

    public static MessageObject T1(qn qnVar) {
        View view = qnVar.f40665d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            return ((org.telegram.ui.Cells.u1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.w0) {
            return ((org.telegram.ui.Cells.w0) view).getMessageObject();
        }
        return null;
    }

    public static void U(qn qnVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = qnVar.getParentActivity();
        int i12 = qnVar.currentAccount;
        long j10 = qnVar.T5;
        on onVar = qnVar.f40677ea;
        int i13 = org.telegram.ui.Components.to.L;
        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.d6) onVar, false);
        f3Var.fixNavigationBar(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21065h5, onVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, onVar)));
        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.h6.f21100j5;
        textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, onVar));
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
        textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i14, onVar));
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
        org.telegram.messenger.nk.r(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.z5.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            sg.q0 q0Var = new sg.q0(parentActivity, onVar, true);
            q0Var.setOnClickListener(new org.telegram.ui.Components.f3(f3Var, 1));
            q0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(q0Var, w7.z5.t(-1, 48, 1, 0, 0, 0, 4));
        }
        f3Var.setCustomView(linearLayout);
        f3Var.show();
    }

    public static void U0(qn qnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            qnVar.f40740jc = true;
            qnVar.f40905x0.f1();
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
            qnVar2.ub(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                qnVar2.L7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = qnVar2.X3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                qnVar2.X3.messageOwner.reactions = tL_messageReactions;
            }
            ai.cb cbVar = new ai.cb(qnVar, new boolean[]{false}, i11, qnVar2, 15);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f20301id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = qnVar2.getClassGuid();
                NotificationCenter.getInstance(qnVar.currentAccount).addObserver(new pi(qnVar, classGuid, cbVar, qnVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        qn qnVar3 = qn.this;
                        MessagesController messagesController = qnVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((MessageObject) i2.e.h(1, arrayList)).getId(), 1, false, 0, true, qnVar3.f40709h4, null);
                    }
                });
                return;
            }
            cbVar.run();
            return;
        }
        qnVar.f40727ic = 0;
        qnVar.f40740jc = false;
        qnVar.f40905x0.f1();
        if (messageObject2 != null) {
            qnVar.la(messageObject2);
        } else if (qnVar.getParentActivity() != null) {
            org.telegram.ui.Components.xc.a0(qnVar).t(LocaleController.getString(R.string.ChannelPostDeleted), qnVar.f40677ea).j();
        }
    }

    public static void U4(qn qnVar, org.telegram.ui.Cells.u1 u1Var) {
        int i10;
        int themedColor;
        int i11;
        ne.b bVar = qnVar.f40917xc;
        if (qnVar.Y != null && !bVar.f17384f && u1Var.getMessageObject() != null) {
            jm jmVar = qnVar.X0;
            RectF rectF = AndroidUtilities.rectTmp;
            ih.j.c(u1Var, jmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            th.a aVar = u1Var.f23226a6;
            if (aVar != null && u1Var.f23411n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((qnVar.X0.getMeasuredHeight() - qnVar.f40905x0.getPaddingBottom()) + qnVar.f40865tc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = u1Var.getMessageObject();
                if (qnVar.Dc == null) {
                    qnVar.Dc = new rh.c(qnVar.getParentActivity(), qnVar.resourceProvider, qnVar);
                    int indexOfChild = qnVar.X0.indexOfChild(qnVar.f40905x0);
                    if (indexOfChild >= 0) {
                        qnVar.X0.addView(qnVar.Dc, indexOfChild + 1, w7.z5.g());
                    } else {
                        qnVar.X0.addView(qnVar.Dc, w7.z5.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (u1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.h6.f21182nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.h6.f21276sb;
                    }
                    themedColor = qnVar.getThemedColor(i11);
                } else {
                    if (u1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.h6.f21202od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.h6.f21184nd;
                    }
                    themedColor = qnVar.getThemedColor(i10);
                }
                qnVar.Dc.setColor(themedColor);
                qnVar.Dc.setCellToWatch(u1Var);
                qnVar.Dc.f45747b.f45743a.a(false, false);
                qnVar.Dc.setAnimatedVisibility(bVar.e);
                qnVar.Dc.f45747b.setOnClickListener(new hg.r0(new kg(qnVar, 0), 19));
                rh.c cVar = qnVar.Dc;
                cVar.f45752s = new kg(qnVar, 2);
                org.telegram.ui.Cells.b6 b6Var = cVar.f45746a;
                b6Var.setOnKeyListener(new lg(qnVar, 0));
                b6Var.setOnEditorActionListener(new ka(qnVar, 1));
                qnVar.Y.U4 = b6Var;
                AndroidUtilities.runOnUIThread(new i4(qnVar, measuredHeight, b6Var, 3), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void V(qn qnVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (qnVar.f40763lb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            qnVar.G5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                qnVar.G5 = null;
                MessagePreviewParams messagePreviewParams = qnVar.f40686f5;
                if (messagePreviewParams != null) {
                    int i11 = qnVar.currentAccount;
                    CharSequence fieldText = qnVar.Y.getFieldText();
                    MessageObject messageObject3 = qnVar.f40783n5;
                    if (messageObject3 == qnVar.X3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, qnVar.f40757l5, qnVar.p5);
                }
                qnVar.m8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                qnVar.I5 = str;
            }
            if (qnVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = qnVar.f40686f5;
            if (messagePreviewParams2 != null) {
                int i12 = qnVar.currentAccount;
                CharSequence fieldText2 = qnVar.Y.getFieldText();
                MessageObject messageObject4 = qnVar.f40783n5;
                if (messageObject4 == qnVar.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, qnVar.f40757l5, qnVar.p5);
            }
            qnVar.Eb(true, qnVar.G5, false, true);
            return;
        }
        qnVar.G5 = null;
        qnVar.m8();
    }

    public static void V0(qn qnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ai.md.k1(qnVar.getParentActivity(), qnVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, qnVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            qnVar.presentFragment(new eo0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static qn V9(int i10, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i10);
        return new qn(bundle);
    }

    public static boolean W(qn qnVar) {
        MessageObject messageObject = qnVar.Mb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void W0(qn qnVar, String str) {
        Uri parse = Uri.parse(str);
        t50.b(qnVar.getParentActivity(), qnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void W1(qn qnVar, float f7) {
        View view = qnVar.f40665d9;
        if (view instanceof org.telegram.ui.Cells.u1) {
            ((org.telegram.ui.Cells.u1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            ((org.telegram.ui.Cells.w0) view).setWalletSlidingOffset(f7);
        }
    }

    public static qn W9(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new qn(bundle);
    }

    public static void X(qn qnVar, long j10, long j11) {
        ai.ga.y(qnVar.currentAccount, false).C(j10, j11, new ai.q5(qnVar, j10, j11, 1));
    }

    public static void X0(qn qnVar, int i10) {
        int i11;
        RectF rectF;
        gh.d dVar = qnVar.H;
        gh.d dVar2 = qnVar.I;
        ArrayList arrayList = qnVar.Gc;
        bh.f fVar = qnVar.F;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && fVar != null) {
            if (w7.j6.a(i10, 4)) {
                qnVar.u9();
            }
            if (w7.j6.a(i10, 2)) {
                ArrayList arrayList2 = qnVar.Fc;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, qnVar.X0.getMeasuredWidth(), qnVar.f40905x0.getY() + qnVar.f40905x0.getPaddingTop());
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
                int a2 = zf.f0.a(arrayList2, i11, arrayList);
                int measuredWidth = qnVar.X0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f7 = measuredWidth;
                    rectF2.left = w7.r.a(rectF2.left, 0.0f, f7);
                    rectF2.top = Math.max(qnVar.f40905x0.getY(), rectF2.top);
                    rectF2.right = w7.r.a(rectF2.right, 0.0f, f7);
                    rectF2.bottom = Math.min(qnVar.f40905x0.getY() + qnVar.f40905x0.getMeasuredHeight(), rectF2.bottom);
                }
                fVar.g(a2, arrayList);
            }
            jm jmVar = qnVar.X0;
            Objects.requireNonNull(jmVar);
            if (fVar.e(new xf(jmVar, 0), qnVar.X0.getWidth(), qnVar.X0.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = qnVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                qnVar.s9();
            }
        }
    }

    public static void X1(qn qnVar) {
        long j10;
        lp lpVar = qnVar.P9;
        if (lpVar != null) {
            if (qnVar.f40709h4) {
                if (lpVar.H != null) {
                    if (qnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.o9.a(qnVar, qnVar.getParentLayout().getFragmentStack().indexOf(qnVar), qnVar.e, qnVar.f40680f, qnVar.f40647c4, qnVar.T5, qnVar.f40888va, qnVar.ua);
                    }
                    TLRPC.Chat chat = qnVar.e;
                    TLRPC.TL_forumTopic tL_forumTopic = qnVar.P9.H;
                    long j11 = qnVar.T5;
                    int i10 = qnVar.ua;
                    int i11 = qnVar.f40888va;
                    if (qnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.o9.a(qnVar, qnVar.getParentLayout().getFragmentStack().indexOf(qnVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", qnVar.P9.f38964a);
                    bundle.putInt("dialog_filter_id", qnVar.P9.f38966b);
                    bundle.putBoolean("pulled", true);
                    qn g10 = og.d.g(qnVar, -qnVar.T5, qnVar.P9.H, 0, bundle);
                    g10.R9 = true;
                    Pc = true;
                    qnVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = lpVar.G;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f20280id;
            }
            if (j10 != 0) {
                qnVar.y6();
                lp lpVar2 = qnVar.P9;
                TLRPC.Chat chat3 = lpVar2.G;
                long j13 = lpVar2.Z;
                int i12 = lpVar2.f38964a;
                int i13 = lpVar2.f38966b;
                if (qnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.o9.a(qnVar, qnVar.getParentLayout().getFragmentStack().indexOf(qnVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = qnVar.P9.G;
                if (chat4 != null) {
                    j12 = chat4.f20280id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", qnVar.P9.f38964a);
                bundle2.putInt("dialog_filter_id", qnVar.P9.f38966b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(qnVar.currentAccount).edit().remove("diditem" + qnVar.P9.Z).apply();
                qn qnVar2 = new qn(bundle2);
                ArrayList arrayList = qnVar.f40691fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = qnVar.f40691fb;
                    qnVar2.f40691fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                qnVar2.R9 = true;
                Pc = true;
                qnVar.presentFragment(qnVar2, true);
            }
        }
    }

    public static void Y(qn qnVar, long j10, long j11) {
        BotForumHelper.getInstance(qnVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        qnVar.Nb = null;
    }

    public static void Y0(qn qnVar) {
        if (AndroidUtilities.addToClipboard(qnVar.Mb.sponsoredInfo)) {
            org.telegram.messenger.nk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.resourceProvider));
        }
    }

    public static void Z(qn qnVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendSticker(tL_document, str, qnVar.T5, qnVar.f40783n5, qnVar.X3, null, qnVar.f40757l5, null, z10, i10, 0, false, obj, qnVar.H8(), 0L, qnVar.S8(), qnVar.f40697g5);
    }

    public static void Z0(qn qnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(qnVar.currentAccount).loadAttachMenuBots(false, true);
            qnVar.ba(user.f20427id, qnVar.f40749k8, false);
        }
    }

    public static void a0(qn qnVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new bf(qnVar, i10, 6));
        } else {
            qnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a1(qn qnVar) {
        qnVar.f40639ba = null;
        qnVar.f40905x0.setOnInterceptTouchListener(null);
        qnVar.ob(qnVar.X0, true);
        ChatThemeController.getInstance(qnVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void b0(qn qnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, of ofVar) {
        String str4;
        org.telegram.ui.Components.l41 l41Var;
        if (qnVar.f40661d5 != null && i10 < arrayList.size() && qnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = qnVar.getParentActivity();
            int i11 = iArr[0];
            kf kfVar = new kf(qnVar, 13);
            String[] strArr = org.telegram.ui.Components.t41.R;
            if (parentActivity == null) {
                l41Var = null;
            } else {
                org.telegram.ui.Components.l41 l41Var2 = new org.telegram.ui.Components.l41(parentActivity, str, str4, inputPeer, i11, richMessage, kfVar);
                l41Var2.I(z10);
                l41Var2.M = qnVar;
                l41Var2.N = ofVar;
                if (qnVar.getParentActivity() != null) {
                    qnVar.showDialog(l41Var2);
                }
                l41Var = l41Var2;
            }
            l41Var.setDimBehind(false);
            qnVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i12 - 1).apply();
                qnVar.Vc(true);
            }
        }
    }

    public static void b1(qn qnVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (qnVar.getParentActivity() != null) {
            TLRPC.Chat chat = qnVar.e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !qnVar.e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (qnVar.h == null && (userFull = qnVar.f40623a8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40677ea);
                alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new pe(qnVar, 21));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                qnVar.showDialog(alertDialog$Builder.f20609a);
            } else if (!qnVar.H4.isEmpty()) {
                MessagesController.getNotificationsSettings(qnVar.currentAccount).edit().putInt("pin_" + qnVar.T5, ((Integer) qnVar.H4.get(0)).intValue()).commit();
                qnVar.Dc(0, true);
            }
        }
    }

    public static void c0(long j10, qn qnVar) {
        if (ai.ga.y(qnVar.currentAccount, false).p().amount < j10) {
            new ai.cd(qnVar.getParentActivity(), qnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(qnVar.a()), new kg(qnVar, 7), qnVar.a()).show();
        } else {
            new ai.dd(qnVar.getParentActivity(), qnVar.resourceProvider).show();
        }
    }

    public static void c1(qn qnVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        qnVar.f40697g5 = null;
        int i10 = qnVar.ob;
        if (i10 == 2) {
            qnVar.f40757l5 = null;
            qnVar.f40783n5 = null;
            MessagePreviewParams messagePreviewParams = qnVar.f40686f5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, qnVar.T5, null);
            }
            qnVar.m8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = qnVar.f40686f5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = qnVar.f40686f5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = qnVar.f40686f5.forwardMessages.messages.get(i11);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40677ea);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                b2Var.I0 = true;
                if (j11 > 0) {
                    TLRPC.User user = qnVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", qnVar.f40686f5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = qnVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", qnVar.f40686f5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                b2Var.T = AndroidUtilities.replaceTags(formatString);
                b2Var.R = LocaleController.formatPluralString("messages", qnVar.f40686f5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new pe(qnVar, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new pe(qnVar, 7));
                qnVar.showDialog(b2Var);
                TextView textView = (TextView) b2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(qnVar.getThemedColor(org.telegram.ui.ActionBar.h6.f21232q7));
                }
            }
        } else if (i10 == 4) {
            qnVar.G5 = null;
            MessagePreviewParams messagePreviewParams3 = qnVar.f40686f5;
            if (messagePreviewParams3 != null) {
                int i12 = qnVar.currentAccount;
                MessageObject messageObject4 = qnVar.f40783n5;
                if (messageObject4 == qnVar.X3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, qnVar.f40757l5, qnVar.p5);
            }
            fk fkVar = qnVar.Y;
            fkVar.X2 = null;
            fkVar.Y2 = false;
            qnVar.l8();
            qnVar.m8();
        } else {
            if (ChatObject.isForum(qnVar.e) && !qnVar.f40709h4 && (messageObject = qnVar.f40783n5) != null) {
                long topicId = MessageObject.getTopicId(qnVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    qnVar.getMediaDataController().cleanDraft(qnVar.T5, topicId, false);
                }
            }
            qnVar.Db(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void c2(qn qnVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.u1) {
            org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) view;
            messageObject = u1Var.getMessageObject();
            u1Var.f23307g1 = f7;
            u1Var.f23322h1 = f10;
            org.telegram.ui.Components.kb0 kb0Var = u1Var.Kc;
            float f11 = u1Var.f23322h1;
            kb0Var.h = u1Var.getTranslationX() + f7;
            kb0Var.f27842i = f11;
            kb0Var.f27845l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.w0) {
            messageObject = ((org.telegram.ui.Cells.w0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int J8 = qnVar.J8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && J8 >= 2 && J8 != 20 && J8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        qnVar.A6(messageObject, z10, true);
                        qnVar.ic();
                        qnVar.bd(false);
                    }
                }
            }
        }
    }

    public static void d0(qn qnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        String str4;
        if (qnVar.f40661d5 != null && i10 < arrayList.size() && qnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = qnVar.f40661d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.t41.K(qnVar.getParentActivity(), qnVar, inputPeer, iArr[0], qnVar.f40661d5.summarized, str, str4, charSequence, z10, ofVar, new kf(qnVar, 19)).setDimBehind(false);
            qnVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i11 - 1).apply();
                qnVar.Vc(true);
            }
        }
    }

    public static void d1(qn qnVar, String str) {
        if (qnVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(qnVar.currentAccount).getInviteText(1));
            qnVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void d2(qn qnVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = qnVar.f40872u6;
        SparseArray[] sparseArrayArr = qnVar.W5;
        if (!qnVar.Pa && (i11 = i10 - qnVar.A0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.jm0 jm0Var = qnVar.f40905x0;
            si siVar = new si(qnVar, z10, sparseArray);
            if (!jm0Var.f27560b2) {
                jm0Var.f27578k2 = new int[2];
                new HashSet();
                jm0Var.l1(jm0Var, true);
                jm0Var.f27568f2 = siVar;
                jm0Var.f27560b2 = true;
                jm0Var.f27566e2 = i10;
                jm0Var.f27564d2 = i10;
            }
        }
    }

    public static void d4(qn qnVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(qnVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new e7(qnVar, h0Var, text, 3), new b1(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void e0(qn qnVar, long j10, long j11, Long l4, Boolean bool) {
        boolean z10 = false;
        ai.ga y3 = ai.ga.y(qnVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.i0(j10, j11, z10, true);
    }

    public static void e1(qn qnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = qnVar.getMessagesController().getInputPeer(qnVar.T5);
                tL_messages_getHistory.offset_date = qnVar.f40899w7 + 86400;
                tL_messages_getHistory.limit = 1;
                qnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new vc(2, qnVar, tLObject));
                return;
            }
            qnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static boolean e2(qn qnVar, View view, RectF rectF) {
        RectF rectF2 = qnVar.Fb;
        if (rectF != null && qnVar.f40905x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void f0(qn qnVar) {
        if (qnVar.Mb == null) {
            return;
        }
        t21[] t21VarArr = {t21.U(qnVar.getParentActivity(), qnVar, true, qnVar.resourceProvider, new org.telegram.ui.ActionBar.j3(11, qnVar, t21VarArr))};
    }

    public static void f1(qn qnVar, int i10) {
        if (qnVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 t82 = qnVar.t8(i10, false);
            if (t82 instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) t82;
                ah.j1 j1Var = u1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = u1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (j1Var.K || randomUnreadReaction.big)) {
                    ah.d1.d(qnVar, null, t82, null, 0.0f, 0.0f, ah.i1.d(randomUnreadReaction.reaction), qnVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    ah.d1.f();
                }
                j1Var.K = false;
                MessageObject messageObject = u1Var.f23572y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (t82 instanceof org.telegram.ui.Cells.w0) {
                org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) t82;
                ah.j1 j1Var2 = w0Var.E0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = w0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (j1Var2.K || randomUnreadReaction2.big)) {
                    ah.d1.d(qnVar, null, t82, null, 0.0f, 0.0f, ah.i1.d(randomUnreadReaction2.reaction), qnVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    ah.d1.f();
                }
                j1Var2.K = false;
                MessageObject messageObject2 = w0Var.P0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void f4(qn qnVar) {
        if (qnVar.I3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = qnVar.R3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f20301id = 0;
        MessageObject messageObject = new MessageObject(qnVar.currentAccount, tL_message, false, false);
        qnVar.I3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void g0(qn qnVar) {
        MessagesController messagesController = qnVar.getMessagesController();
        long j10 = qnVar.T5;
        long j11 = qnVar.L6;
        int i10 = qnVar.classGuid;
        int i11 = qnVar.R3;
        long j12 = qnVar.f40660d4;
        int i12 = qnVar.f40768m4;
        int i13 = qnVar.V5;
        qnVar.V5 = i13 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j12, i12, i13, qnVar.f40709h4);
    }

    public static void g1(qn qnVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ch chVar;
        String str;
        SparseArray[] sparseArrayArr = qnVar.W5;
        if (qnVar.getParentActivity() != null && qnVar.N9 == 0.0f) {
            if (qnVar.R3 == 3) {
                Bundle bundle = new Bundle();
                long N8 = qnVar.N8();
                if (N8 >= 0) {
                    bundle.putLong("user_id", N8);
                } else {
                    bundle.putLong("chat_id", -N8);
                }
                qnVar.presentFragment(new qn(bundle));
                return;
            }
            boolean z12 = false;
            if (qnVar.F9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                qnVar.Ab(true, true);
                byte[] bArr = qnVar.V3;
                String str2 = qnVar.W3;
                xe xeVar = new xe(qnVar, 1);
                int i11 = o21.v;
                int currentAccount = qnVar.getCurrentAccount();
                Activity parentActivity = qnVar.getParentActivity();
                long a2 = qnVar.a();
                if (parentActivity != null) {
                    o21.L(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.xc.a0(qnVar), qnVar.getResourceProvider(), bArr, str2, xeVar);
                }
            } else if (qnVar.R3 == 2) {
                qnVar.finishFragment();
                em emVar = qnVar.V8;
                if (qnVar.B0.getTag() == null) {
                    z12 = true;
                }
                emVar.J(true, z12);
            } else {
                TLRPC.User user = qnVar.f40680f;
                if (user != null && user.f20427id == 489000) {
                    qnVar.gc(true);
                } else if (user != null && qnVar.f40777n) {
                    if (user.bot) {
                        String str3 = qnVar.f40675e8;
                        qnVar.f40675e8 = null;
                        qnVar.getMessagesController().unblockPeer(qnVar.f40680f.f20427id, new re(qnVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40677ea);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                    b2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pe(qnVar, 8));
                    b2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    qnVar.showDialog(b2Var);
                } else if (UserObject.isReplyUser(user)) {
                    qnVar.gc(true);
                } else {
                    TLRPC.User user2 = qnVar.f40680f;
                    if (user2 != null && user2.bot && (str = qnVar.f40675e8) != null) {
                        if (str.length() != 0) {
                            qnVar.getMessagesController().sendBotStart(qnVar.f40680f, qnVar.f40675e8);
                        } else {
                            qnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", qnVar.T5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        qnVar.f40675e8 = null;
                        qnVar.mc(false);
                        return;
                    }
                    if (ChatObject.isChannel(qnVar.e)) {
                        TLRPC.Chat chat = qnVar.e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (qnVar.e.join_request) {
                                    qnVar.Ab(true, true);
                                    MessagesController.getInstance(qnVar.currentAccount).addUserToChat(qnVar.e.f20280id, UserConfig.getInstance(qnVar.currentAccount).getCurrentUser(), 0, null, null, true, new ke(qnVar, 14), new m4.w0(13, qnVar, context));
                                    return;
                                }
                                ke keVar = qnVar.L5;
                                if (keVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(keVar);
                                    qnVar.L5 = null;
                                }
                                qnVar.Ab(true, true);
                                qnVar.getMessagesController().addUserToChat(qnVar.e.f20280id, qnVar.getUserConfig().getCurrentUser(), 0, null, qnVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.p0 p0Var = qnVar.K1;
                                if (p0Var != null && (chVar = qnVar.M0) != null && chVar.d(p0Var) && qnVar.N1.getVisibility() != 8 && qnVar.N1.getTag(R.id.object_tag) != null) {
                                    MessagesController.getNotificationsSettings(qnVar.currentAccount).edit().putInt("dialog_bar_vis3" + qnVar.T5, 3).commit();
                                    qnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(qnVar.T5));
                                    return;
                                }
                                return;
                            }
                            qnVar.gc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = qnVar.Z7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = qnVar.e;
                    TLRPC.User user3 = qnVar.f40680f;
                    if (qnVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.f5.r(qnVar, false, chat2, user3, z11, true, false, z10, new pe(qnVar, 9));
                }
            }
        }
    }

    public static void g4(qn qnVar) {
        if (qnVar.J3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f20301id = 0;
        MessageObject messageObject = new MessageObject(qnVar.currentAccount, tL_message, false, false);
        qnVar.J3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void h0(qn qnVar, ArrayList arrayList, long j10, org.telegram.ui.Components.zm0 zm0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(qnVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new je(qnVar, j10, 5), 400L);
            zm0Var.dismiss();
        }
    }

    public static void h1(qn qnVar, org.telegram.ui.Cells.u1 u1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.i80 I = org.telegram.ui.Components.i80.I(qnVar, u1Var);
        org.telegram.ui.Components.zm0 zm0Var = new org.telegram.ui.Components.zm0(qnVar.getParentActivity(), qnVar.f40677ea);
        I.f27184p = new qe(zm0Var, 0);
        if (z10 && qnVar.getMessagesController().config.walletAvailable.get()) {
            I.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney), new re(qnVar, str, 11), false);
        }
        I.c(R.drawable.msg_copy, LocaleController.getString(R.string.WalletCopyAddress), new ue(qnVar, zm0Var, str, 1), false);
        if (z10) {
            I.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new re(qnVar, str, 12), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = qnVar.currentAccount;
                long j10 = user.f20427id;
                i0 i0Var = new i0(25, qnVar, userArr);
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
        zm0Var.e(I);
        zm0Var.f(u1Var, characterStyle, null, false);
        qnVar.showDialog(zm0Var);
    }

    public static void i0(qn qnVar) {
        if (AndroidUtilities.addToClipboard(qnVar.Mb.sponsoredAdditionalInfo)) {
            org.telegram.messenger.nk.p(R.string.TextCopied, new org.telegram.ui.Components.xc(org.telegram.ui.Components.lb.a(qnVar.getParentActivity()), qnVar.resourceProvider));
        }
    }

    public static void i1(org.telegram.ui.qn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.u1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.i1(org.telegram.ui.qn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1, int, int):void");
    }

    public static void j0(qn qnVar, TLRPC.Document document) {
        qnVar.f40882v4.put(document, 0);
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendSticker(document, null, qnVar.T5, null, null, null, qnVar.f40757l5, null, true, 0, 0, false, null, qnVar.H8(), 0L, qnVar.S8(), qnVar.f40697g5);
    }

    public static void j1(qn qnVar, int i10) {
        org.telegram.ui.ActionBar.d5 d5Var = qnVar.parentLayout;
        if (d5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.n2 backgroundFragment = d5Var.getBackgroundFragment();
        if (backgroundFragment instanceof qn) {
            qn qnVar2 = (qn) backgroundFragment;
            if (qnVar2.a() == qnVar.T5) {
                qnVar.finishFragment();
                qnVar2.j(i10, 0, true, 0, true, 0);
                return;
            }
        }
        qnVar.presentFragment(V9(i10, qnVar.T5));
    }

    public static void j2(qn qnVar) {
        org.telegram.ui.Cells.u1 u1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (qnVar.f40931z1 != null) {
            return;
        }
        org.telegram.ui.Cells.u1 u1Var2 = null;
        for (int childCount = qnVar.f40905x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = qnVar.f40905x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (primaryMessageObject = (u1Var = (org.telegram.ui.Cells.u1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                u1Var2 = u1Var;
            }
        }
        qnVar.zb(u1Var2);
    }

    public static void k0(qn qnVar) {
        if (qnVar.M1) {
            qnVar.getMessagesController().addDialogToFolder(qnVar.T5, 0, 0, 0L);
            qnVar.T7();
            qnVar.y3.j(23, qnVar.T5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + qnVar.T5, false);
            edit.putBoolean("dialog_bar_block" + qnVar.T5, false);
            edit.putBoolean("dialog_bar_report" + qnVar.T5, false);
            edit.commit();
            qnVar.Vc(false);
            qnVar.getNotificationsController().clearDialogNotificationsSettings(qnVar.T5, qnVar.d());
        } else if (qnVar.L1.getTag() != null && ((Integer) qnVar.L1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = qnVar.Z7;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < qnVar.Z7.participants.participants.size(); i10++) {
                    hVar.k(null, qnVar.Z7.participants.participants.get(i10).user_id);
                }
                long j10 = qnVar.Z7.f20281id;
                org.telegram.ui.Components.v70 v70Var = new org.telegram.ui.Components.v70(qnVar.getParentActivity(), qnVar.currentAccount, hVar, qnVar.Z7.f20281id, qnVar, qnVar.f40677ea);
                v70Var.f31183l0 = new pe(qnVar, 23);
                v70Var.show();
            }
        } else if (qnVar.L1.getTag() != null) {
            qnVar.wb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", qnVar.f40680f.f20427id);
            bundle.putBoolean("addContact", true);
            fs fsVar = new fs(bundle);
            fsVar.O = new pe(qnVar, 24);
            qnVar.presentFragment(fsVar);
        }
    }

    public static void k1(org.telegram.ui.qn r19, final org.telegram.ui.t21[] r20, final org.telegram.ui.Components.i80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.k1(org.telegram.ui.qn, org.telegram.ui.t21[], org.telegram.ui.Components.i80):void");
    }

    public static void l0(qn qnVar, TLRPC.ReactionCount reactionCount) {
        qnVar.D7(true);
        org.telegram.ui.Components.go0.c(qnVar.getParentActivity(), qnVar.currentAccount, reactionCount.reaction, qnVar.f40677ea);
    }

    public static void l1(qn qnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(qnVar.currentAccount).getInputUser(user.f20427id);
                    ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new vc(3, qnVar, user));
                }
            }
        }
    }

    public static void m0(qn qnVar) {
        if (qnVar.X2.getAlpha() != 0.0f && !qnVar.actionBar.t() && !qnVar.F9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(qnVar.X2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            qnVar.L9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void m1(qn qnVar, int i10) {
        if (qnVar.R3 == 7) {
            Object E = qnVar.M3.E(i10);
            if (i10 == 0) {
                qnVar.M3.getClass();
            }
            if (E instanceof MessageObject) {
                qnVar.ka((MessageObject) E);
            }
        } else if (qnVar.f40816q3 != null) {
            if (i10 >= 0 && i10 < qnVar.getMediaDataController().searchResultMessages.size()) {
                qnVar.f40829r3 = false;
                qnVar.qb(false, true, false);
                qnVar.getMediaDataController().setSearchedPosition(i10);
                qnVar.Kc(qnVar.getMediaDataController().getMask(), qnVar.getMediaDataController().getSearchPosition(), qnVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new se(qnVar, qnVar.getMediaDataController().searchResultMessages.get(i10), 5));
            }
        } else {
            qnVar.getMediaDataController().jumpToSearchedMessage(qnVar.classGuid, i10);
            qnVar.Qb(false);
        }
    }

    public static void n0(qn qnVar) {
        org.telegram.ui.Cells.u1 u1Var;
        pl plVar;
        int i10;
        if (!qnVar.Rb && qnVar.F3 && qnVar.f40905x0.G && qnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = qnVar.f40905x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = qnVar.f40905x0.getChildAt(childCount);
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
                qnVar.Rb = true;
                pl plVar2 = new pl(qnVar, qnVar.getParentActivity());
                plVar2.p(true);
                plVar2.K = Layout.Alignment.ALIGN_CENTER;
                plVar2.d = 3500L;
                plVar2.T = true;
                plVar2.e = true;
                plVar2.h = AndroidUtilities.dp(150.0f);
                plVar2.q(8.0f);
                qnVar.B1 = plVar2;
                plVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                qnVar.X0.addView(qnVar.B1, w7.z5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                u1Var.getLocationInWindow(iArr);
                qnVar.C1 = u1Var.getTimeY() + iArr[1];
                qnVar.B1.setTranslationY(((-plVar.getTop()) - AndroidUtilities.dp(120.0f)) + qnVar.C1);
                qnVar.B1.m(0.0f, (u1Var.f23442pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + u1Var.f23471rb);
                qnVar.B1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ke(qnVar, 2));
            AndroidUtilities.runOnUIThread(new ke(qnVar, 2), 2000L);
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
            obj.f28654a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.o11(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f28654a |= 16;
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

    public static void o0(qn qnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.n61[] n61VarArr;
        if (qnVar.F5 != 0) {
            qnVar.getConnectionsManager().cancelRequest(qnVar.F5, true);
            qnVar.F5 = 0;
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
            if (arrayList != null && qnVar.H5 != null && arrayList.size() == qnVar.H5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) qnVar.H5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            qnVar.H5 = arrayList;
        } catch (Exception e) {
            FileLog.e(e);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new kf(qnVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new kf(qnVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (qnVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new te(qnVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = qnVar.G5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = qnVar.f40763lb + 1;
            qnVar.f40763lb = i11;
            cg cgVar = new cg(qnVar, i11, getwebpagepreview, 0);
            if (qnVar.f40775mb == null) {
                qnVar.f40775mb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) qnVar.f40775mb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                cgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            p6 p6Var = new p6(qnVar, getwebpagepreview, cgVar, 1);
            if (qnVar.F5 != 0) {
                qnVar.getConnectionsManager().cancelRequest(qnVar.F5, true);
            }
            qnVar.F5 = qnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new ai.r5(10, qnVar, p6Var));
            qnVar.getConnectionsManager().bindRequestToGuid(qnVar.F5, qnVar.classGuid);
        }
    }

    public static void o1(long j10, qn qnVar) {
        if (ai.ga.y(qnVar.currentAccount, false).p().amount < j10) {
            new ai.cd(qnVar.getParentActivity(), qnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(qnVar.a()), new kg(qnVar, 7), qnVar.a()).show();
        } else {
            new ai.dd(qnVar.getParentActivity(), qnVar.resourceProvider).show();
        }
    }

    public static org.telegram.ui.Components.xo p0(qn qnVar, Context context) {
        org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(context, qnVar.currentAccount, qnVar.f40705h0.getPopupLayout().getSwipeBack(), false, new kj(qnVar), qnVar.getResourceProvider());
        qnVar.f40717i1 = zoVar;
        zoVar.d(qnVar.T5, qnVar.d(), null);
        return qnVar.f40717i1.f32986f;
    }

    public static void p1(qn qnVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != qnVar.d()) {
            qnVar.f40626ab = SystemClock.uptimeMillis();
            qnVar.f40808p7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                qnVar.Wa(qnVar.d());
            } else if (qnVar.d() == 0) {
                qnVar.Wa(l4.longValue());
            } else {
                qnVar.f40785n7 = -1;
            }
            qnVar.getConnectionsManager().cancelRequestsForGuid(qnVar.classGuid);
            qnVar.getMessagesStorage().cancelTasksForGuid(qnVar.classGuid);
            qnVar.classGuid = ConnectionsManager.generateClassGuid();
            qnVar.Ta();
            qnVar.f40686f5 = null;
            qnVar.f40873u7 = 0;
            qnVar.f40748k7 = false;
            qnVar.f40759l7 = true;
            qnVar.f40711h6.clear();
            qnVar.f40660d4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = qnVar.getMessagesController().getTopicsController().findTopic(-qnVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                qnVar.f40745k4 = i12;
                qnVar.l4 = findTopic.read_outbox_max_id;
                qnVar.f40768m4 = Math.max(1, i12);
                qnVar.getMessagesController().getTopicsController().getTopicRepliesCount(qnVar.T5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                qnVar.f40647c4 = null;
                qnVar.f40619a4 = null;
                qnVar.X3 = null;
                qnVar.f40783n5 = null;
                qnVar.f40745k4 = 0;
                qnVar.l4 = 0;
                qnVar.f40768m4 = 0;
                qnVar.f40660d4 = 0L;
                qnVar.f40672e4 = 0;
                qnVar.f40685f4 = null;
                qnVar.f40709h4 = false;
                qnVar.f40696g4 = false;
            }
            qnVar.v8();
            qnVar.Sc(true);
            qnVar.f40617a1.n(true);
            qnVar.f40617a1.b();
            qnVar.R1.setCurrentTopic(l4.longValue());
            qnVar.Vc(true);
            qnVar.mc(true);
            qnVar.getMessagesController().setForumLastTopicId(-qnVar.a(), qnVar.d());
            qnVar.l9(true);
            qnVar.j9(true);
            fk fkVar = qnVar.Y;
            if (fkVar != null) {
                fkVar.k0(false);
                qnVar.Y.D1(true);
            }
            qnVar.D6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            qnVar.l1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            qnVar.f40765m1 = i11;
            qnVar.Gc(false);
            qnVar.Fc(false);
            qnVar.Wc();
            in inVar = qnVar.oc;
            if (inVar != null && qnVar.actionBar.f21501n0) {
                inVar.p(null);
            }
        }
    }

    public static void q0(qn qnVar) {
        if (MessagesController.getInstance(qnVar.currentAccount).isDialogMuted(qnVar.T5, qnVar.d())) {
            qnVar.Uc(true);
            AndroidUtilities.runOnUIThread(new ke(qnVar, 7), 150L);
            qnVar.f40705h0.M(null, null);
            if (qnVar.getParentActivity() != null) {
                org.telegram.ui.Components.xc.z(qnVar, 4, 0, qnVar.f40677ea).j();
                return;
            }
            return;
        }
        View view = qnVar.f40669e1.f21703j;
        if (view instanceof org.telegram.ui.ActionBar.e1) {
            ((org.telegram.ui.ActionBar.e1) view).b();
        }
    }

    public static void q1(qn qnVar, String str) {
        if (MessagesController.getInstance(qnVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            pf.d.l(qnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.f5.n0(qnVar.getParentActivity(), qnVar.f40677ea, str, true, new bg(qnVar, str, 1));
        }
    }

    public static void r0(qn qnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(qnVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f20396id;
        long clientUserId = qnVar.getUserConfig().getClientUserId();
        long j11 = qnVar.T5;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void s0(qn qnVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f20321id = qnVar.getMessagesController().getInputUser(qnVar.f40680f);
            qnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new ne(qnVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(qnVar.getUserConfig().getCurrentUser(), qnVar.T5, messageObject, qnVar.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = qnVar.H8();
        SendMessagesHelper.getInstance(qnVar.currentAccount).sendMessage(of2);
        if (qnVar.R3 == 0) {
            qnVar.T9(false);
        }
        qnVar.j9(false);
    }

    public static void s1(qn qnVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(qnVar.currentAccount).getInputUser(user.f20427id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new hh(qnVar, tL_attachMenuBot, user, 0), 66);
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

    public static void t0(qn qnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        String str3;
        if (qnVar.f40661d5 != null && i10 < arrayList.size() && qnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = qnVar.f40661d5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.t41.K(qnVar.getParentActivity(), qnVar, inputPeer, iArr[0], qnVar.f40661d5.summarized, strArr[0], str3, charSequence, z10, ofVar, new kg(qnVar, 13)).setDimBehind(false);
            qnVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i11 - 1).apply();
                qnVar.Vc(true);
            }
        }
    }

    public static void t1(qn qnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        sg.m1 m1Var = new sg.m1(qnVar, qnVar.currentAccount, user, null, null, qnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            m1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(qnVar.getParentActivity());
        org.telegram.ui.Components.p5 p5Var = new org.telegram.ui.Components.p5(AndroidUtilities.dp(160.0f), 4, w9Var, false);
        w9Var.setImageDrawable(p5Var);
        w9Var.addOnAttachStateChangeListener(new k5(p5Var, 1));
        p5Var.j(j10, false);
        m1Var.E0 = true;
        m1Var.B0 = w9Var;
        qnVar.showDialog(m1Var);
    }

    public static void u0(qn qnVar) {
        int i10;
        TLRPC.ChatFull chatFull = qnVar.Z7;
        if (chatFull != null && !qnVar.f40818q5) {
            TLRPC.Chat chat = qnVar.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && qnVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = qnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && qnVar.visibleDialog == null && qnVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = qnVar.getParentActivity();
                    pe peVar = new pe(qnVar, 15);
                    pe peVar2 = new pe(qnVar, 16);
                    Pattern pattern = org.telegram.ui.Components.f5.f26081a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ci.o1(9));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, w7.z5.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
                    b2Var.V = frameLayout;
                    b2Var.O0 = 0.3974359f;
                    b2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), peVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), peVar2);
                    qnVar.showDialog(b2Var);
                }
            }
        }
    }

    public static void u1(qn qnVar, String str) {
        if (MessagesController.getInstance(qnVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            qnVar.getParentActivity();
            pf.d.m(str);
            return;
        }
        org.telegram.ui.Components.f5.n0(qnVar.getParentActivity(), qnVar.f40677ea, str, false, new bg(qnVar, str, 0));
    }

    public static void v0(org.telegram.ui.qn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.v0(org.telegram.ui.qn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void w0(qn qnVar) {
        if (qnVar.R3 == 0 && qnVar.getMessagesController().freezeUntilDate > qnVar.getConnectionsManager().getCurrentTime() && !b.a(qnVar.currentAccount, qnVar.f40680f)) {
            b.c(qnVar.getParentActivity(), qnVar.currentAccount, qnVar.getResourceProvider());
        }
    }

    public static void w1(qn qnVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j10;
        int[] iArr3 = qnVar.A6;
        int[] iArr4 = qnVar.f40936z6;
        boolean[] zArr = qnVar.E6;
        int[] iArr5 = qnVar.f40924y6;
        int[] iArr6 = qnVar.B6;
        boolean[] zArr2 = qnVar.D6;
        ArrayList arrayList = qnVar.f40711h6;
        if ((i10 - i11) - i12 <= i13 && !qnVar.G6) {
            boolean[] zArr3 = qnVar.C6;
            if (!zArr3[0]) {
                qnVar.G6 = true;
                arrayList.add(Integer.valueOf(qnVar.V5));
                if (qnVar.f40832r6.size() != 0) {
                    MessagesController messagesController = qnVar.getMessagesController();
                    j10 = 0;
                    long j11 = qnVar.T5;
                    c10 = 0;
                    long j12 = qnVar.L6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = qnVar.classGuid;
                    int i17 = qnVar.R3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = qnVar.f40660d4;
                    int i18 = qnVar.f40768m4;
                    int i19 = qnVar.V5;
                    qnVar.V5 = i19 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j13, i18, i19, qnVar.f40709h4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = qnVar.getMessagesController();
                    long j14 = qnVar.T5;
                    long j15 = qnVar.L6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = qnVar.classGuid;
                    int i22 = qnVar.R3;
                    long j16 = qnVar.f40660d4;
                    int i23 = qnVar.f40768m4;
                    int i24 = qnVar.V5;
                    qnVar.V5 = i24 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j16, i23, i24, qnVar.f40709h4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j10 = 0;
                if (qnVar.L6 != 0 && !zArr3[1]) {
                    qnVar.G6 = true;
                    arrayList.add(Integer.valueOf(qnVar.V5));
                    MessagesController messagesController3 = qnVar.getMessagesController();
                    long j17 = qnVar.L6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = qnVar.classGuid;
                    int i28 = qnVar.R3;
                    long j18 = qnVar.f40660d4;
                    int i29 = qnVar.f40768m4;
                    int i30 = qnVar.V5;
                    qnVar.V5 = i30 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j18, i29, i30, qnVar.f40709h4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !qnVar.I7 && i11 <= 10) {
            if (qnVar.L6 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(qnVar.V5));
                MessagesController messagesController4 = qnVar.getMessagesController();
                long j19 = qnVar.L6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = qnVar.classGuid;
                int i34 = qnVar.R3;
                long j20 = qnVar.f40660d4;
                int i35 = qnVar.f40768m4;
                int i36 = qnVar.V5;
                qnVar.V5 = i36 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j20, i35, i36, qnVar.f40709h4);
                qnVar.I7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(qnVar.V5));
                MessagesController messagesController5 = qnVar.getMessagesController();
                long j21 = qnVar.T5;
                long j22 = qnVar.L6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = qnVar.classGuid;
                int i40 = qnVar.R3;
                long j23 = qnVar.f40660d4;
                int i41 = qnVar.f40768m4;
                int i42 = qnVar.V5;
                qnVar.V5 = i42 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j23, i41, i42, qnVar.f40709h4);
                qnVar.I7 = true;
            }
        }
    }

    public static void x0(qn qnVar) {
        if (!qnVar.h7(qnVar.Y.getSendButton())) {
            if (qnVar.getMediaController().isPlayingMessage(qnVar.f40661d5)) {
                qnVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = qnVar.getMessagesController().getInputPeer(qnVar.T5);
            if (qnVar.f40673e5 != null) {
                for (int i10 = 0; i10 < qnVar.f40673e5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f20396id.add(Integer.valueOf(qnVar.f40673e5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f20396id.add(Integer.valueOf(qnVar.f40661d5.getId()));
            }
            ConnectionsManager.getInstance(qnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new vc(5, qnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void x1(qn qnVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, of ofVar) {
        if (qnVar.f40661d5 != null && i10 < arrayList.size() && qnVar.getParentActivity() != null) {
            org.telegram.ui.Components.t41.K(qnVar.getParentActivity(), qnVar, inputPeer, iArr[0], qnVar.f40661d5.summarized, "und", str, charSequence, z10, ofVar, new kf(qnVar, 15)).setDimBehind(false);
            qnVar.D7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(qnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + qnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + qnVar.a(), i11 - 1).apply();
                qnVar.Vc(true);
            }
        }
    }

    public static void y0(qn qnVar, View view, int i10) {
        org.telegram.ui.Components.a6 a6Var;
        TLRPC.User user;
        char c10;
        ik ikVar;
        ik ikVar2;
        if (i10 != 0) {
            hg.j1 adapter = qnVar.I1.getAdapter();
            if (adapter.f11946w0 != null && !adapter.f11928h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = qnVar.I1.getAdapter().J(i11);
            int i12 = qnVar.I1.getAdapter().X;
            int i13 = qnVar.I1.getAdapter().Y;
            if (qnVar.I1.getAdapter().F != null && i11 == 1) {
                qnVar.Y.M0(i12, i13, qnVar.I1.getAdapter().F + "@" + ChatObject.getPublicUsername(qnVar.e) + " ", false);
            } else if (qnVar.I1.getAdapter().F != null && i11 == 0) {
                qnVar.Y.M0(i12, i13, a1.g.s(new StringBuilder(), qnVar.I1.getAdapter().F, " "), false);
            } else if (J instanceof ig.z1) {
                if (!qnVar.getUserConfig().isPremium()) {
                    qnVar.showDialog(new sg.y0(qnVar, qnVar.getParentActivity(), qnVar.currentAccount, true, 31, false, null));
                    return;
                }
                ig.z1 z1Var = (ig.z1) J;
                org.telegram.ui.Components.f5.Z(qnVar.currentAccount, Math.max(1, z1Var.a()), qnVar.T5, new org.telegram.ui.ActionBar.j3(8, qnVar, z1Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (qnVar.R3 != 0 || !qnVar.h7(view)) {
                        if (view instanceof org.telegram.ui.Cells.c8) {
                            sendAnimationData = ((org.telegram.ui.Cells.c8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.f5.Z(qnVar.currentAccount, 1, qnVar.a(), new ai.f3(qnVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), qnVar.I1.getAdapter().L(i11), sendAnimationData, 2));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (qnVar.f40781n3 && (ikVar2 = qnVar.R2) != null && ikVar2.getVisibility() == 0) {
                        qnVar.db(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        qnVar.Y.M0(i12, i13, a1.g.p("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (qnVar.f40781n3 && (ikVar = qnVar.R2) != null && ikVar.getVisibility() == 0) {
                        qnVar.db(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        qnVar.Y.M0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(r4.c.u(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.o61("" + user2.f20427id, 3, null), 0, spannableString.length(), 33);
                        qnVar.Y.M0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof hg.g1) {
                    if (qnVar.I1.getAdapter().J != null && qnVar.R3 != 1) {
                        hg.g1 g1Var = (hg.g1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(g1Var.f11869a, qnVar.T5, qnVar.f40783n5, qnVar.X3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = qnVar.H8();
                        of2.ephemeralReceiverBotId = g1Var.f11870b;
                        of2.monoForumPeer = qnVar.S8();
                        of2.suggestionParams = qnVar.f40697g5;
                        qnVar.getSendMessagesHelper().sendMessage(of2);
                        qnVar.Y.setFieldText("");
                        qnVar.j9(false);
                    }
                } else if (J instanceof String) {
                    if (qnVar.I1.getAdapter().J != null) {
                        if (qnVar.R3 == 1) {
                            org.telegram.ui.Components.f5.L(qnVar.getParentActivity(), qnVar.T5, new m4.w0(12, qnVar, (String) J), qnVar.f40677ea);
                            return;
                        } else if (!qnVar.h7(view)) {
                            org.telegram.ui.Components.f5.Z(qnVar.currentAccount, 1, qnVar.T5, new org.telegram.ui.ActionBar.j3(9, qnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    qnVar.Y.M0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (qnVar.Y.getFieldText() != null) {
                        if (qnVar.R3 == 1 || !qnVar.h7(view)) {
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
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(qnVar.getParentActivity(), 0, qnVar.f40677ea);
                                    alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    qnVar.showDialog(alertDialog$Builder.f20609a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(qnVar.I1.getAdapter().R);
                                qnVar.Ia = arrayList;
                                PhotoViewer.u1().M2(null, qnVar, qnVar.f40677ea);
                                PhotoViewer.u1().i2(arrayList, qnVar.I1.getAdapter().M(i11), 3, false, qnVar.Ja, qnVar);
                                return;
                            }
                            org.telegram.ui.Components.f5.Z(qnVar.currentAccount, 1, qnVar.a(), new org.telegram.ui.ActionBar.j3(10, qnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    i0 i0Var = new i0(24, qnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (qnVar.f40739jb) {
                        i0Var.run();
                    } else {
                        zh1.a(qnVar.getParentActivity(), new org.telegram.ui.ActionBar.j3(12, qnVar, i0Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    xj xjVar = qnVar.I1;
                    if (xjVar != null && (user = xjVar.getAdapter().f11946w0) != null) {
                        qnVar.Y.setFieldText("");
                        long j10 = qnVar.T5;
                        if (j10 == user.f20427id) {
                            qnVar.f40688f8 = j10;
                            qnVar.getMessagesController().sendBotStart(qnVar.f40680f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f20427id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", qnVar.T5);
                        if (qnVar.getMessagesController().checkCanOpenChat(bundle, qnVar)) {
                            qnVar.presentFragment(new qn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    fk fkVar = qnVar.Y;
                    fkVar.S();
                    fkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            qnVar.Y.M0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = qnVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                FileLog.e((Throwable) e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.r5.f(qnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                a6Var = new org.telegram.ui.Components.a6(f7, fontMetricsInt);
                            } else {
                                a6Var = new org.telegram.ui.Components.a6(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(a6Var, 0, spannableString2.length(), 33);
                            qnVar.Y.M0(i12, i13, spannableString2, false);
                            qnVar.I1.o(false);
                        }
                    }
                    qnVar.Y.M0(i12, i13, str, true);
                    qnVar.I1.o(false);
                }
            }
        }
    }

    public static void y1(qn qnVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = qnVar.f40783n5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = qnVar.ob;
            if (i10 == 5) {
                int i11 = qnVar.currentAccount;
                long j10 = qnVar.T5;
                MessageSuggestionParams messageSuggestionParams = qnVar.f40697g5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new ai.h1(context, i11, j10, messageSuggestionParams, qnVar, qnVar.getResourceProvider(), 0, new xe(qnVar, 4)).show();
            } else if (i10 == 1 && (messageObject = qnVar.p5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = qnVar.f40697g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    qnVar.Yb(messageSuggestionParams2);
                } else if (qnVar.p5.canEditMedia() && qnVar.f40796o5 == 0) {
                    if (qnVar.J1 == null) {
                        qnVar.H7();
                    }
                    qnVar.J1.L1(qnVar.p5, -1);
                    qnVar.ca();
                } else {
                    qnVar.j(qnVar.p5.getId(), 0, true, 0, true, 0);
                }
            } else if (qnVar.f40686f5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(qnVar.T5) && !qnVar.f40686f5.hasSecretMessages && qnVar.R3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        qnVar.ha(0);
                        return;
                    }
                    MessageObject messageObject3 = qnVar.f40783n5;
                    if (messageObject3 != null) {
                        qnVar.j(messageObject3.getId(), 0, true, 0, true, 0);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    qnVar.ha(1);
                } else if (i10 == 4) {
                    qnVar.ha(2);
                }
            }
        }
    }

    public static void z0(qn qnVar, long j10, boolean z10) {
        if (!qnVar.H4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(qnVar.currentAccount).edit();
            edit.putInt("pin_" + qnVar.T5, ((Integer) qnVar.H4.get(0)).intValue()).commit();
            qnVar.H4.clear();
            qnVar.J4.clear();
            qnVar.L4 = 0;
            qnVar.P4 = 0;
            qnVar.Q4 = 0;
            qnVar.Dc(0, true);
        }
        if (ChatObject.isMonoForum(qnVar.e) && ChatObject.canManageMonoForum(qnVar.currentAccount, qnVar.e)) {
            if (j10 != 0) {
                qnVar.getMessagesStorage().removeTopic(-qnVar.e.f20280id, j10);
                qnVar.getMessagesController().deleteSavedDialog(j10, qnVar.getMessagesController().getInputPeer(-qnVar.e.f20280id));
                qnVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(qnVar.e.f20280id, j10);
            }
        } else {
            qnVar.getMessagesController().deleteDialog(qnVar.T5, 1, z10);
            qnVar.getMessagesStorage().removeAllTopics(qnVar.T5);
            qnVar.getMessagesController().getTopicsController().reloadTopics(-qnVar.T5);
        }
        qnVar.M5.put(j10, 0);
        org.telegram.ui.Components.s31 s31Var = qnVar.R1;
        if (s31Var != null) {
            s31Var.setAllTopicsHidden(false);
        }
        if (j10 == qnVar.f40660d4) {
            qnVar.B7(false, null);
            qnVar.A0.O(false);
        }
    }

    public static void z1(qn qnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        qn qnVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        ih.a aVar = qnVar.Qb;
        if (num.intValue() != qnVar.d()) {
            qnVar.f40790nc = false;
            df dfVar = qnVar.Nb;
            if (dfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dfVar);
                qnVar.Nb.run();
                qnVar.Nb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.s31 s31Var = qnVar.R1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(s31Var.f30184b).getTopicsController().getTopics(-s31Var.f30186c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f20332id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = qnVar.getMessagesController().getTopicsController().findTopic(-qnVar.a(), tL_forumTopic.f20332id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                qnVar.f40626ab = SystemClock.uptimeMillis();
                qnVar.f40808p7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    qnVar.Wa(qnVar.d());
                } else if (qnVar.d() == 0) {
                    qnVar.Wa(num.intValue());
                } else {
                    qnVar.f40785n7 = -1;
                }
                qnVar.getConnectionsManager().cancelRequestsForGuid(qnVar.classGuid);
                qnVar.getMessagesStorage().cancelTasksForGuid(qnVar.classGuid);
                qnVar.classGuid = ConnectionsManager.generateClassGuid();
                qnVar.Ta();
                qnVar.f40686f5 = null;
                qnVar.f40873u7 = 0;
                qnVar.f40748k7 = false;
                qnVar.f40759l7 = true;
                qnVar.f40711h6.clear();
                qnVar.f40642c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(qnVar.getCurrentAccount(), message, false, false));
                    qnVar2 = qnVar;
                    qnVar2.ub(arrayList, qnVar.e, tL_forumTopic2.f20332id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    qnVar2 = qnVar;
                    qnVar2.f40647c4 = null;
                    qnVar2.f40619a4 = null;
                    qnVar2.X3 = null;
                    qnVar2.f40783n5 = null;
                    qnVar2.f40745k4 = 0;
                    qnVar2.l4 = 0;
                    qnVar2.f40768m4 = 0;
                    qnVar2.f40660d4 = 0L;
                    qnVar2.f40672e4 = 0;
                    qnVar2.f40685f4 = null;
                    qnVar2.f40709h4 = false;
                    qnVar2.f40696g4 = false;
                }
                dm dmVar = qnVar2.A0;
                if (dmVar != null) {
                    if (dmVar.I >= 0 && !dmVar.N()) {
                        dm dmVar2 = qnVar2.A0;
                        dmVar2.u(dmVar2.I);
                    } else {
                        dm dmVar3 = qnVar2.A0;
                        if (dmVar3.I < 0 && dmVar3.N()) {
                            qnVar2.A0.o(0);
                        }
                    }
                    qnVar2.A0.T();
                }
                qnVar2.v8();
                qnVar2.Sc(true);
                qnVar2.f40617a1.n(true);
                if (tL_forumTopic2 != null) {
                    qnVar2.Yc();
                } else {
                    qnVar2.f40617a1.b();
                }
                qnVar2.R1.setCurrentTopic(qnVar2.d());
                qnVar2.Vc(true);
                qnVar2.mc(true);
                qnVar2.getMessagesController().setForumLastTopicId(-qnVar2.a(), qnVar2.d());
                qnVar2.Ia();
                qnVar2.k9(true);
                qnVar2.j9(true);
                qnVar2.D6(true, true);
                if (qnVar2.Y != null) {
                    if (!UserObject.isBotForum(qnVar2.f40680f)) {
                        qnVar2.Y.k0(false);
                    }
                    qnVar2.Y.D1(true);
                }
                if (tL_forumTopic2 != null) {
                    qnVar2.getMessagesController().getTopicsController().getTopicRepliesCount(qnVar2.T5, tL_forumTopic2.f20332id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                qnVar2.l1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                qnVar2.f40765m1 = i11;
                qnVar2.Gc(false);
                qnVar2.Fc(false);
                qnVar2.Wc();
                in inVar = qnVar2.oc;
                if (inVar != null && qnVar2.actionBar.f21501n0) {
                    inVar.p(null);
                }
                if (UserObject.isBotForum(qnVar2.f40680f)) {
                    qnVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(qnVar2.T5, num.intValue()), true);
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
    public final org.telegram.ui.Components.lw0 A() {
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
        int i32 = this.f40635b6;
        if (messageObject != null) {
            ArrayList arrayList = this.f40619a4;
            if (arrayList == null || !arrayList.contains(messageObject) || K9()) {
                if (messageObject.getDialogId() == this.T5) {
                    c13 = 0;
                } else {
                    c13 = 1;
                }
                if (z10 && messageObject.getGroupId() != 0) {
                    MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f40911x6.f(messageObject.getGroupId());
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
                                Zb(messageObject);
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
                            this.f40662d6--;
                        }
                        if (this.R3 == 1) {
                            z21 = true;
                        } else {
                            z21 = false;
                        }
                        if (!messageObject.canDeleteMessage(z21, this.e)) {
                            this.f40621a6--;
                        }
                        boolean D9 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D9) {
                            this.f40635b6--;
                        } else {
                            this.f40649c6--;
                        }
                        if (messageObject.isMusic() && !D9) {
                            this.f40687f6--;
                        } else if (messageObject.isDocument() && !D9) {
                            this.f40698g6--;
                        } else {
                            this.f40674e6--;
                        }
                    }
                } else if (this.W5[1].size() + this.W5[0].size() >= 100) {
                    AndroidUtilities.shakeView(this.f40630b1);
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
                            this.f40662d6++;
                        }
                        if (this.R3 == 1) {
                            z20 = true;
                        } else {
                            z20 = false;
                        }
                        if (!messageObject.canDeleteMessage(z20, this.e)) {
                            this.f40621a6++;
                        }
                        boolean D92 = D9();
                        if (this.R3 == 1 || !messageObject.canForwardMessage() || D92) {
                            this.f40635b6++;
                        } else {
                            this.f40649c6++;
                        }
                        if (messageObject.isMusic() && !D92) {
                            this.f40687f6++;
                        } else if (!messageObject.isDocument() || messageObject.isRoundOnce() || messageObject.isVoiceOnce() || D92) {
                            this.f40674e6++;
                        } else {
                            this.f40698g6++;
                        }
                        if (z10) {
                            Zb(messageObject);
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
                Dc(0, true);
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
                if ((i32 == 0 && this.f40635b6 != 0) || (i32 != 0 && this.f40635b6 == 0)) {
                    this.T4 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (k14 != null) {
                        if (this.f40635b6 != 0 && !z12) {
                            z19 = false;
                        } else {
                            z19 = true;
                        }
                        k14.setEnabled(z19);
                        Property property = View.ALPHA;
                        if (this.f40635b6 == 0) {
                            f10 = 1.0f;
                        }
                        arrayList2.add(ObjectAnimator.ofFloat(k14, property, f10));
                        if (z12 && k14.getBackground() != null) {
                            k14.setBackground(null);
                        } else if (k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21401z8), 5, -1));
                        }
                    }
                    kh.c cVar = this.P0;
                    if (cVar != null) {
                        if (this.f40635b6 != 0 && !z12) {
                            z18 = false;
                        } else {
                            z18 = true;
                        }
                        com.google.android.gms.internal.cast.z5 z5Var = cVar.f15068c;
                        ((ne.b) z5Var.d).a(z18, true);
                        ((jh.a) z5Var.f6881b).setEnabled(z18);
                    }
                    this.T4.playTogether(arrayList2);
                    c10 = 1;
                    i10 = size;
                    this.T4.setDuration(100L);
                    this.T4.addListener(new oi(this, 9));
                    this.T4.start();
                } else {
                    c10 = 1;
                    i10 = size;
                    if (k14 != null) {
                        if (this.f40635b6 != 0 && !z12) {
                            z14 = false;
                        } else {
                            z14 = true;
                        }
                        k14.setEnabled(z14);
                        if (this.f40635b6 == 0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        k14.setAlpha(f7);
                        if (!z12 && k14.getBackground() == null) {
                            k14.setBackground(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21401z8), 3, -1));
                        }
                    }
                    kh.c cVar2 = this.P0;
                    if (cVar2 != null) {
                        if (this.f40635b6 != 0 && !z12) {
                            z13 = false;
                        } else {
                            z13 = true;
                        }
                        com.google.android.gms.internal.cast.z5 z5Var2 = cVar2.f15068c;
                        ((ne.b) z5Var2.d).a(z13, false);
                        ((jh.a) z5Var2.f6881b).setEnabled(z13);
                    }
                }
                if (k10 != null) {
                    int i36 = this.f40687f6;
                    if (((i36 > 0 && this.f40698g6 == 0) || (i36 == 0 && this.f40698g6 > 0)) && this.f40674e6 == 0) {
                        i30 = 0;
                    } else {
                        i30 = 8;
                    }
                    k10.setVisibility(i30);
                    if (this.f40687f6 > 0) {
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
                    if (this.f40621a6 == 0) {
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
                if (this.f40662d6 == 1 && i11 == 1) {
                    i13 = 0;
                } else {
                    i13 = 8;
                }
                if (this.P0 != null) {
                    jk jkVar = this.O0;
                    if ((jkVar != null && jkVar.getVisibility() == 0 && !this.I0) || ((chat = this.e) != null && ((ChatObject.isNotInChat(chat) && !K9()) || ((ChatObject.isChannel(this.e) && !ChatObject.canPost(this.e) && !this.e.megagroup) || !ChatObject.canSendMessages(this.e))))) {
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
                    if (this.f40619a4 != null && c11 == 0) {
                        z15 = 0;
                        int size4 = this.W5[0].size();
                        for (int i42 = 0; i42 < size4; i42++) {
                            if (this.f40619a4.contains((MessageObject) this.W5[0].valueAt(i42))) {
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
                    ((ne.b) cVar3.f15067b.f6880a).a(z17, true);
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
        Qc();
    }

    public final void A7(boolean z10) {
        boolean z11;
        this.f40872u6.clear();
        this.f40832r6.clear();
        this.f40846s6.clear();
        this.f40711h6.clear();
        this.f40911x6.b();
        this.f40720i4 = false;
        dm dmVar = this.A0;
        if (dmVar != null) {
            if (dmVar.f36421w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            Ub(z11);
        }
        nj njVar = this.f40905x0;
        if (njVar != null) {
            njVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f40797o6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f40936z6;
            int[] iArr2 = this.f40924y6;
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
        this.f40873u7 = 0;
        this.f40860t7 = false;
        this.K6 = 0;
        this.J7 = null;
        this.D7 = 0;
        this.E7 = false;
        this.A7 = false;
        dm dmVar2 = this.A0;
        if (dmVar2 != null && !dmVar2.N) {
            dmVar2.O(false);
        }
    }

    public final TLRPC.ChatFull A8() {
        return this.Z7;
    }

    public final boolean A9() {
        if (!ChatObject.isForum(this.e) || this.f40709h4) {
            if (ChatObject.isMonoForum(this.e) && d() == 0 && !this.T3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Aa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Aa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Ab(boolean z10, boolean z11) {
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
                    lk lkVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(lkVar, property, 0.1f);
                    lk lkVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(lkVar2, property2, 0.1f);
                    lk lkVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(lkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
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
            lk lkVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            lkVar4.setVisibility(i11);
            org.telegram.ui.Components.x90 x90Var = this.D0;
            if (!z10 && this.C0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            x90Var.setVisibility(i12);
            lk lkVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            lkVar5.setScaleX(f11);
            org.telegram.ui.Components.x90 x90Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            x90Var2.setScaleX(f12);
            lk lkVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            lkVar6.setScaleY(f13);
            org.telegram.ui.Components.x90 x90Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            x90Var3.setScaleY(f16);
            lk lkVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            lkVar7.setAlpha(f14);
            org.telegram.ui.Components.x90 x90Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            x90Var4.setAlpha(f15);
        }
    }

    public final void Ac() {
        boolean z10;
        boolean z11;
        if (this.f40729j1 == null) {
            return;
        }
        if (this.f40701g9 && !g9() && !this.Y.u0() && !this.Pa && (!this.f40843s3 || getMediaDataController().searchResultMessages.isEmpty())) {
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
            this.f40742k1 = false;
        } else {
            this.B7 = 0;
            this.f40734j6 = 0;
            z11 = true;
        }
        this.f40729j1.e(1, z10, z11);
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.e)) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f40615a;
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
        if (this.f40680f == null) {
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new v0("", 1)));
            arrayList.add(new ng.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.d2(this)));
        }
        return arrayList;
    }

    public final void B6() {
        this.f40697g5 = null;
        if (this.f40660d4 == 0 || this.f40709h4) {
            if (this.f40709h4) {
                this.f40783n5 = this.X3;
            } else {
                this.f40783n5 = null;
            }
            this.f40757l5 = null;
            fk fkVar = this.Y;
            if (fkVar != null) {
                fkVar.i1(null, null, null);
            }
        }
        j9(false);
        if (this.R3 == 0) {
            getMediaDataController().cleanDraft(this.T5, this.f40660d4, true);
        }
    }

    public final void B7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f40936z6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.H6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.g0.o(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.D7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.E6[0] = false;
            this.F6 = false;
            dm dmVar = this.A0;
            if (dmVar != null && dmVar.F < 0) {
                dmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f40734j6 = i12;
            this.f40758l6 = dialog2.unread_mentions_count;
            if (this.f40747k6 != i12) {
                kh.h hVar = this.f40729j1;
                if (hVar != null) {
                    hVar.c(1, i12, this.N5);
                }
                this.f40747k6 = this.f40734j6;
                Ac();
            }
            int i13 = this.f40758l6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f40758l6 = i14;
                if (i14 <= 0) {
                    this.f40758l6 = 0;
                    this.f40770m6 = true;
                    Pb(false);
                } else {
                    kh.h hVar2 = this.f40729j1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Pb(true);
                }
            }
            d7(false);
            return;
        }
        this.f40872u6.clear();
        this.f40711h6.clear();
        this.f40832r6.clear();
        this.f40846s6.clear();
        this.f40911x6.b();
        this.f40720i4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f40797o6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f40924y6;
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
        Dc(0, true);
        if (this.f40760l8 != null) {
            this.f40760l8 = null;
            fk fkVar = this.Y;
            if (fkVar != null) {
                fkVar.W0(null, true, false);
            }
        }
        if (this.P != null) {
            Ub(false);
            J7(false);
            this.f40905x0.setEmptyView(this.Q0);
        }
        dm dmVar2 = this.A0;
        if (dmVar2 != null) {
            dmVar2.O(false);
        }
        if (this.h == null && (user = this.f40680f) != null && user.bot && this.f40675e8 == null) {
            this.f40675e8 = "";
            mc(false);
        }
    }

    public final TLRPC.UserFull B8() {
        return this.f40623a8;
    }

    public final boolean B9() {
        return UserObject.isBotForum(this.f40680f);
    }

    public final void Ba(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.u1 u1Var, boolean z10) {
        org.telegram.ui.Components.n11 n11Var;
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
                    if (this.f40688f8 == 0) {
                        z12 = true;
                    }
                    pf.d.p(parentActivity, parse, z12, true, P9(u1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f40688f8 == 0) {
                        z12 = true;
                    }
                    pf.d.p(parentActivity2, parse2, z12, true, P9(u1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.f5.q0(this, str, true, true, false, false, P9(u1Var, characterStyle), null, this.f40677ea);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.n61) && (n11Var = ((org.telegram.ui.Components.n61) characterStyle).f28699a) != null && (n11Var.f28654a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.f5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f40677ea);
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
        org.telegram.ui.Components.f5.q0(this, str, true, true, true, z12, P9(u1Var, characterStyle), null, this.f40677ea);
    }

    public final void Bb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new gf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
        showDialog(b2Var);
        TextView textView = (TextView) b2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21232q7));
        }
    }

    public final void Bc() {
        kh.h hVar = this.f40729j1;
        ij ijVar = this.v;
        if (hVar != null) {
            this.f40729j1.setTranslationY((((-ijVar.d()) - this.S.getInputBubbleHeight()) - b9(org.telegram.ui.Components.n31.f28685c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f40657d1 != null) {
            this.f40657d1.setTranslationY((-ijVar.d()) - AndroidUtilities.dp(16.0f));
        }
    }

    public final void C6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f40677ea);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
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
        Dc(0, true);
        bd(z10);
        Qc();
    }

    public final ArrayList C8() {
        dm dmVar = this.A0;
        if (dmVar != null) {
            return dmVar.P;
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Ca(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void Cb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.e)) {
                    z50 z50Var = new z50(a());
                    z50Var.f35592l0 = this;
                    presentFragment(z50Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.e)) {
                bd bdVar = new bd(a());
                bdVar.f35592l0 = this;
                presentFragment(bdVar);
                return;
            } else {
                return;
            }
        }
        this.f40639ba = new org.telegram.ui.Components.wp(this, this.f40677ea);
        this.f40905x0.setOnInterceptTouchListener(new m4.v0(23));
        ob(this.X0, false);
        showDialog(this.f40639ba, new oe(this, 1));
    }

    public final void Cc(boolean z10) {
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
        if ((!K9() || this.f40709h4) && this.L2 != null) {
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
                    this.M2.addListener(new ql(this, z14, z15, z16));
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
            if (this.f40932z2 != null) {
                if (K9() && !this.f40709h4) {
                    boolean z18 = z17;
                    this.f40932z2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.f40932z2.c((this.H4.size() - 1) - Collections.binarySearch(this.H4, Integer.valueOf(this.L4), Comparator$CC.reverseOrder()), this.H4.size(), z11);
            }
        }
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
        gn gnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        gn gnVar2;
        String str;
        int findQuoteStart;
        gn gnVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j12;
        org.telegram.ui.Components.n11 n11Var;
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
                        if (this.f40660d4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.n11 n11Var2 = null;
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
                        j10 = this.f40660d4;
                    }
                    draft = mediaDataController.getDraft(j15, j10);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                fk fkVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                fkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.T5, d());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j16 = this.T5;
                    if (l4 != null) {
                        j13 = l4.longValue();
                    } else {
                        j13 = this.f40660d4;
                    }
                    message = mediaDataController2.getDraftMessage(j16, j13);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.R3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.f40627ac >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        j9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.f40627ac = draftMessage3.date;
                    fk fkVar2 = this.Y;
                    fkVar2.X2 = null;
                    fkVar2.Y2 = !draftMessage3.no_webpage;
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
                                n11Var = null;
                                org.telegram.ui.Components.o61 o61Var = new org.telegram.ui.Components.o61(a1.g.o(j12, ""), 3, null);
                                int i12 = messageEntity.offset;
                                valueOf.setSpan(o61Var, i12, messageEntity.length + i12, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f28654a |= 4;
                                    org.telegram.ui.Components.o11 o11Var = new org.telegram.ui.Components.o11(obj, 0);
                                    int i13 = messageEntity.offset;
                                    MediaDataController.addStyleToText(o11Var, i13, messageEntity.length + i13, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f28654a |= 1;
                                        org.telegram.ui.Components.o11 o11Var2 = new org.telegram.ui.Components.o11(obj2, 0);
                                        int i14 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var2, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f28654a |= 2;
                                        org.telegram.ui.Components.o11 o11Var3 = new org.telegram.ui.Components.o11(obj3, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var3, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f28654a |= 8;
                                        org.telegram.ui.Components.o11 o11Var4 = new org.telegram.ui.Components.o11(obj4, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var4, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f28654a |= 16;
                                        org.telegram.ui.Components.o11 o11Var5 = new org.telegram.ui.Components.o11(obj5, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var5, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.n61 n61Var = new org.telegram.ui.Components.n61(messageEntity.url, n11Var2);
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(n61Var, i18, messageEntity.length + i18, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f28654a |= 256;
                                        org.telegram.ui.Components.o11 o11Var6 = new org.telegram.ui.Components.o11(obj6, 0);
                                        int i19 = messageEntity.offset;
                                        MediaDataController.addStyleToText(o11Var6, i19, messageEntity.length + i19, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i20 = messageEntity.offset;
                                        org.telegram.ui.Components.qj0.c(valueOf, i20, messageEntity.length + i20, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e) {
                                            FileLog.e((Throwable) e, false);
                                            fontMetricsInt = n11Var2;
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
                                        n11Var = n11Var2;
                                    }
                                    n11Var = n11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                n11Var = null;
                            }
                            i11++;
                            n11Var2 = n11Var;
                            c10 = c11;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        gnVar = n11Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        gnVar = null;
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
                        this.f40697g5 = of2;
                        Ib(of2);
                    }
                    messageObject = this.f40783n5;
                    if (messageObject != null || this.X3 == messageObject) {
                        if (message == null && ((messageObject2 = this.X3) == null || messageObject2.getId() != message.f20301id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f40783n5 = messageObject3;
                            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
                            if (inputReplyTo2 != null) {
                                int i22 = inputReplyTo2.flags;
                                if ((i22 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i23 = -1;
                                    if (arrayList != null) {
                                        int i24 = inputReplyTo2.quote_offset;
                                        if (arrayList.isEmpty()) {
                                            gnVar3 = gnVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            ?? obj7 = new Object();
                                            obj7.f37362a = messageObject3;
                                            obj7.f37363b = -1;
                                            obj7.f37364c = -1;
                                            obj7.d = -1;
                                            obj7.f37371m = true;
                                            obj7.e(i24, arrayList);
                                            gnVar3 = obj7;
                                        }
                                        this.f40757l5 = gnVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i22 & 16) != 0) {
                                            i23 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message3 = messageObject3.messageOwner;
                                        if (message3 == null || (str = message3.message) == null || str3 == null || (findQuoteStart = MessageObject.findQuoteStart(str, str3, i23)) < 0) {
                                            gnVar2 = gnVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            gnVar2 = new gn(messageObject3, findQuoteStart, str3.length() + findQuoteStart);
                                        }
                                        this.f40757l5 = gnVar2;
                                    }
                                }
                            }
                            Y6(false);
                            gn gnVar4 = this.f40757l5;
                            if (gnVar4 != null) {
                                Hb(this.f40783n5, gnVar4);
                            } else {
                                Gb(this.f40783n5);
                            }
                            mc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j11 && this.e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20280id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f40783n5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Gb(messageObject4);
                            mc(false);
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
                    this.f40697g5 = of22;
                    Ib(of22);
                }
                messageObject = this.f40783n5;
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
            ValueAnimator valueAnimator = this.f40641bc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f40641bc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f40641bc = ofFloat;
            ofFloat.addUpdateListener(new me(this, 0));
            this.f40641bc.setDuration(150L);
            this.f40641bc.start();
        }
    }

    public final MessageObject.GroupedMessages D8(long j10) {
        return (MessageObject.GroupedMessages) this.f40911x6.f(j10);
    }

    public final boolean D9() {
        if (this.e != null) {
            return getMessagesController().isChatNoForwards(this.e);
        }
        return getMessagesController().isUserNoForwards(this.f40623a8);
    }

    public final void Da(java.util.ArrayList r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Da(java.util.ArrayList, boolean):void");
    }

    public final void Db(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.gn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Db(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.gn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void Dc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Dc(int, boolean):void");
    }

    public final int E6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f40905x0.getHeight();
        int i11 = 0;
        long j10 = 0;
        while (true) {
            View U0 = this.f40905x0.U0(i10);
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
        if (ChatObject.isForum(this.e) && !this.f40709h4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f20332id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.e));
        }
        return this.f40660d4;
    }

    public final float E8() {
        qn qnVar = this.f40666da;
        if (qnVar == null) {
            qnVar = this;
        }
        ck ckVar = qnVar.f40803p1;
        if (ckVar == null) {
            return 0.0f;
        }
        return ckVar.f25583b;
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
                sp0 sp0Var = new sp0(0, z10, true, this);
                if (this.R3 == 9) {
                    sp0Var.G = 1;
                    sp0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        sp0Var.G = 10;
                        sp0Var.H = true;
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
                        sp0Var.G = i11;
                        sp0Var.H = z11;
                    }
                }
                sp0Var.V = new jl(this);
                presentFragment(sp0Var);
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

    public final void Eb(boolean z10, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        Db(z10, null, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void Ec() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f40709h4 && !this.J4.isEmpty() && this.H4.size() == 1 && ((Integer) this.H4.get(0)).intValue() == d() + 1) {
            messageObject = (MessageObject) this.J4.get(this.H4.get(0));
        } else {
            messageObject = null;
        }
        this.Y3 = messageObject;
        if (this.f40709h4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f40647c4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.e, this.Y3.messageOwner.from_id)) {
            this.Y3 = null;
        }
    }

    @Override
    public final boolean F() {
        return this.f40724i8;
    }

    public final float F6(boolean z10) {
        float f7;
        float f10;
        float f11;
        fk fkVar = this.Y;
        float f12 = 0.0f;
        if (fkVar != null) {
            if (z10) {
                f7 = fkVar.f23981k5;
            } else {
                f7 = fkVar.f23975j5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        ne.b bVar = this.f40917xc;
        j6.l lVar = this.Cc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(lVar.f14288a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(lVar.f14288a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f17384f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) lVar.f14289b;
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
        if (this.f40761l9 == null) {
            this.f40761l9 = new org.telegram.ui.Cells.u1(getParentActivity(), this.currentAccount, true, this.Ca, this.f40677ea);
        }
        org.telegram.ui.Cells.u1 u1Var = this.f40761l9;
        if (this.e == null && !UserObject.isUserSelf(this.f40680f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        u1Var.N7 = z11;
        org.telegram.ui.Cells.u1 u1Var2 = this.f40761l9;
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
        TLRPC.User user = this.f40680f;
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
        this.f40761l9.E8 = y9();
        this.f40761l9.F8 = H9();
        this.f40761l9.G8 = G9();
        return this.f40761l9.g1(messageObject, (MessageObject.GroupedMessages) this.f40911x6.f(messageObject.getGroupId()), z10);
    }

    public final boolean F9() {
        return !TextUtils.isEmpty(this.U3);
    }

    public final void Fa(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Fa(int):void");
    }

    public final void Fb(ArrayList arrayList) {
        Db(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void Fc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f40765m1 > 0 && ((i10 = this.R3) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40729j1.e(4, z11, z10);
        this.f40729j1.c(4, this.f40765m1, z10);
    }

    public final boolean G6() {
        if (!E9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f40709h4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                jk jkVar = this.O0;
                if (jkVar == null || jkVar.getVisibility() != 0) {
                    if (!K9() || this.f40709h4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.G7():void");
    }

    public final boolean G9() {
        org.telegram.ui.Components.s31 s31Var = this.R1;
        if (s31Var != null && s31Var.Q && s31Var.f30182a.f17384f) {
            return true;
        }
        return false;
    }

    public final boolean Ga(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f40688f8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f40680f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f40688f8 == this.T5) {
                this.f40688f8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f40688f8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((n2Var instanceof qn) && ((qn) n2Var).T5 == this.f40688f8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f40688f8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f40688f8));
                } else if (DialogObject.isUserDialog(this.f40688f8)) {
                    bundle.putLong("user_id", this.f40688f8);
                } else {
                    bundle.putLong("chat_id", -this.f40688f8);
                }
                y6();
                presentFragment(new qn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Gb(MessageObject messageObject) {
        Db(true, messageObject, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void Gc(boolean z10) {
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
        this.f40729j1.e(3, z11, z10);
        this.f40729j1.c(3, this.l1, z10);
    }

    @Override
    public final void H(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            rh.c cVar = this.Dc;
            if (cVar != null) {
                this.X0.removeView(cVar);
                this.Dc = null;
            }
            fk fkVar = this.Y;
            if (fkVar != null) {
                fkVar.F0();
            }
        }
    }

    public final boolean H6() {
        if (this.h == null) {
            jk jkVar = this.O0;
            if (jkVar == null || jkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void H7() {
        if (getParentActivity() != null && getParentActivity() != null && this.J1 == null) {
            ci.b3 b3Var = new ci.b3(this, getParentActivity(), this, this.f40677ea, 2);
            this.J1 = b3Var;
            b3Var.Z = a();
            ci.b3 b3Var2 = this.J1;
            b3Var2.f30559i0 = true;
            b3Var2.f30542c2 = new hl(this);
        }
    }

    public final SendMessageChatArguments H8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.R3 == 9) {
            builder.setWelcomeMessageChatId(this.f40863ta);
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
        tL_message.f20301id = 0;
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

    public final void Hb(MessageObject messageObject, gn gnVar) {
        Db(true, messageObject, null, null, null, true, 0, gnVar, false, 0L, null, true);
    }

    public final void Hc(boolean z10) {
        String string;
        if (this.R3 != 3 && !UserObject.isBotForum(this.f40680f)) {
            hj hjVar = this.f40617a1;
            if (hjVar != null && this.f40660d4 != 0) {
                if (this.f40709h4) {
                    Xc();
                } else if (this.f40696g4) {
                    MessageObject messageObject = this.X3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f40617a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f40617a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.X3;
                    if (messageObject2 != null) {
                        hjVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f40633b4 != null) {
                if (this.X3.getRepliesCount() == 0) {
                    if (this.f40696g4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f40633b4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
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
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20280id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.R3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void I7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        kg kgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.W5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f40680f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.Z7;
        long j10 = this.L6;
        int d = (int) d();
        int i10 = this.R3;
        kg kgVar2 = new kg(this, 4);
        if (z10) {
            kgVar = new kg(this, 5);
        } else {
            kgVar = null;
        }
        kg kgVar3 = kgVar;
        org.telegram.ui.Components.f5.y(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.W5, groupedMessages, d, i10, null, kgVar2, kgVar3, this.f40677ea);
    }

    public final boolean I9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f40642c && !this.d && this.f40680f == null && this.f40905x0 != null && SharedConfig.animationsEnabled()) {
            if (this.f40726ib == null) {
                this.f40726ib = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f40726ib.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f40905x0.getChildCount(); i12++) {
                    i11 += this.f40905x0.getChildAt(i12).getHeight();
                    int top = this.f40905x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.f40849s9) {
                    O6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.C6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.f40872u6;
                if ((!z12 || ((this.L6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.G6 && f10 > this.f40849s9 && (!arrayList.isEmpty() ? i11 != 0 : this.f40715hb)) {
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
                        Drawable e = this.f40677ea.e();
                        jm jmVar = this.X0;
                        if (jmVar != null) {
                            e = jmVar.getBackgroundImage();
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
        Dc(0, true);
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
        Ec();
    }

    public final void Ib(MessageSuggestionParams messageSuggestionParams) {
        Db(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Ic(MessageObject messageObject, int i10) {
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
            MessageObject messageObject3 = (MessageObject) this.f40797o6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                dm dmVar = this.A0;
                if (dmVar != null) {
                    dmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    @Override
    public final boolean J(cy cyVar) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.R3 != 0 || this.f40660d4 != 0 || (chatFull = this.Z7) == null || chatFull.ttl_period == 0)) || ((user = this.f40680f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f40623a8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.s0 s0Var = this.f40643c0;
            if (s0Var != null) {
                s0Var.e(8);
            }
            hj hjVar = this.f40617a1;
            if (hjVar != null) {
                hjVar.f29089a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.s0 s0Var2 = this.f40643c0;
            if (s0Var2 != null) {
                s0Var2.e(0);
            }
            hj hjVar2 = this.f40617a1;
            if (hjVar2 != null) {
                hjVar2.f29089a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.s0 s0Var3 = this.f40840s0;
        if (s0Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            s0Var3.e(i11);
        }
        hj hjVar3 = this.f40617a1;
        if (hjVar3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f40680f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hjVar3.setCommunityItemVisible(z11);
            final hj hjVar4 = this.f40617a1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = hjVar4.E;
            ImageView imageView2 = hjVar4.f29118y;
            if (imageView2 != null && imageView != null) {
                hjVar4.f29104l0 = z12;
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
                                    oo ooVar = hjVar4;
                                    if (!z14) {
                                        ooVar.f29118y.setVisibility(4);
                                        return;
                                    } else {
                                        ooVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    oo ooVar2 = hjVar4;
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
                                    oo ooVar = hjVar4;
                                    if (!z14) {
                                        ooVar.f29118y.setVisibility(4);
                                        return;
                                    } else {
                                        ooVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    oo ooVar2 = hjVar4;
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
                this.f40617a1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f40623a8;
                if (userFull2 != null) {
                    this.f40617a1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.Z7;
                    if (chatFull3 != null) {
                        this.f40617a1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f40826r0 != null && (chatFull2 = this.Z7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.s0 s0Var4 = this.f40826r0;
            if (z13) {
                i12 = 0;
            }
            s0Var4.e(i12);
        }
        p();
    }

    public final void J7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.J7(boolean):void");
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f20300id)) {
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
            Vc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.T5);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Jb(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        Eb(z10, webPage, z11, true);
    }

    public final void Jc(boolean z10) {
        fk fkVar = this.Y;
        if (fkVar != null) {
            fkVar.L1(z10);
        }
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
                if (n2Var != this && (n2Var instanceof qn) && ((qn) n2Var).T5 == this.T5) {
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
        ArrayList arrayList = this.f40872u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            dm dmVar = this.A0;
            if (dmVar != null && !dmVar.N) {
                dmVar.u(dmVar.J + indexOf);
            }
        }
    }

    public final void Kb(boolean z10) {
        if (this.X2 != null && !E9()) {
            if (this.X2.getTag() == null) {
                AnimatorSet animatorSet = this.f40695g3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.X2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f40695g3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f40695g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 1.0f));
                this.f40695g3.addListener(new oi(this, 5));
                this.f40695g3.start();
            }
            if (!z10) {
                w9();
                this.f40618a3 = 1000;
            }
        }
    }

    public final void Kc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        kh.h hVar = this.f40729j1;
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
                ((jh.b) eVar.f2815b).b(z10, true);
            }
            kh.h hVar2 = this.f40729j1;
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
                ((jh.b) eVar2.f2815b).b(z11, true);
            }
        }
        this.f40895w3 = i12;
        this.f40908x3 = i11;
        Lc();
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

    public final void L6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.L6():void");
    }

    public final boolean L7(android.view.View r96, boolean r97, boolean r98, float r99, float r100, boolean r101, boolean r102, boolean r103) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.L7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final int L8() {
        return Math.max(this.P4, this.Q4);
    }

    public final void L9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.f40872u6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            MessageObject messageObject = (MessageObject) i2.e.h(1, arrayList);
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
                int N0 = this.f40930z0.N0();
                int L0 = this.f40930z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        dm dmVar = this.A0;
                        int i14 = dmVar.J;
                        if (L0 >= i14 && L0 < dmVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
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
                org.telegram.ui.ActionBar.b2 b2Var = this.f40811pb;
                if (b2Var != null) {
                    b2Var.dismiss();
                }
                Cc(false);
                org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f40677ea);
                this.f40811pb = b2Var2;
                b2Var2.setOnCancelListener(this.f40774ma);
                this.f40811pb.r(1000L);
                int i15 = this.V5;
                this.Y8 = i15;
                this.f40624a9 = false;
                this.f40711h6.add(Integer.valueOf(i15));
                this.Z8 = 0;
                this.f40638b9 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.T5;
                long j11 = this.L6;
                int i16 = this.classGuid;
                int i17 = this.R3;
                long j12 = this.f40660d4;
                int i18 = this.f40768m4;
                int i19 = this.V5;
                this.V5 = i19 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j12, i18, i19, this.f40709h4);
                this.X2.setAlpha(0.0f);
                this.X2.setTag(null);
                this.f40719i3 = 0.0f;
                qc();
                this.Y2.setTag(null);
            }
        }
    }

    public final void La(MessageObject messageObject) {
        ArrayList arrayList = this.f40872u6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            dm dmVar = this.A0;
            if (dmVar != null && !dmVar.N) {
                dmVar.P(dmVar.J + indexOf, true);
            }
        }
    }

    public final void Lb(boolean z10) {
        if (this.Y2 != null && !E9()) {
            if (this.Y2.getTag() == null) {
                ValueAnimator valueAnimator = this.f40708h3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.Y2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40719i3, 1.0f);
                this.f40708h3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f40708h3.addUpdateListener(new me(this, 2));
                this.f40708h3.addListener(new oi(this, 7));
                this.f40708h3.start();
            }
            if (!z10) {
                w9();
                this.f40618a3 = 1000;
            }
        }
    }

    public final void Lc() {
        org.telegram.ui.Components.q6 q6Var = this.U2;
        if (q6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.f40895w3;
            if (i10 < 0) {
                q6Var.c("", z10, true);
            } else if (i10 == 0) {
                q6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.f40829r3) {
                q6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.R3 != 7 && !this.zc.f17384f) {
                q6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f40908x3 + 1), Integer.valueOf(this.f40895w3)), z10, true);
            } else {
                q6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void M6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.f40917xc.e) * (1.0f - this.f40890vc.e) * ((float[]) this.Cc.f14289b)[i10];
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
            return (int) this.f40660d4;
        }
        return 0;
    }

    public final void M9() {
        this.D4 = true;
        if (this.f40770m6) {
            getMessagesStorage().getUnreadMention(this.T5, d(), new sg(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.T5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f40709h4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f40660d4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f40758l6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new vc(4, this, messagesStorage));
    }

    public final void Ma() {
        if (this.P7 == null && this.Q7 == null && this.R7 == null) {
            ke keVar = this.U7;
            if (keVar != null) {
                AndroidUtilities.cancelRunOnUIThread(keVar);
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

    public final boolean Mb() {
        fk fkVar = this.Y;
        if (fkVar != null && fkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f40670e2 == null) {
                    if (!this.f40634b5) {
                        fk fkVar2 = this.Y;
                        if (fkVar2 != null) {
                            fkVar2.S();
                            MediaDataController.getInstance(fkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar = fkVar2.U0;
                            dgVar.L(false, false);
                            dgVar.Q(false, false);
                            dgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        jm jmVar = this.X0;
                        int indexOfChild = jmVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            fk fkVar3 = this.Y;
                            fkVar3.S();
                            MediaDataController.getInstance(fkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar2 = fkVar3.U0;
                            dgVar2.L(false, false);
                            dgVar2.Q(false, false);
                            dgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f40894w2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            jmVar.addView(this.f40894w2, i10, w7.z5.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(9, getParentActivity(), this.f40677ea, false);
                            this.f40670e2 = r40Var;
                            r40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            jmVar.addView(this.f40670e2, i10, w7.z5.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.r40 r40Var2 = this.f40670e2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(r40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f40894w2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new oi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f40670e2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Mc() {
        P7();
        String str = this.f40869u3;
        if (str != null) {
            this.f40658d2.e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.L3.setEmptyView(this.f40658d2);
            return;
        }
        this.L3.setEmptyView(null);
        this.f40658d2.setVisibility(8);
    }

    public final boolean N6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.Z7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            sg.k0.D1(this, this.D1, this.E1, this.T5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void N7() {
        if (this.h == null && this.f40907x2 == null && getParentActivity() != null) {
            cl clVar = new cl(this, getParentActivity());
            this.f40907x2 = clVar;
            clVar.setTag(1);
            this.M0.addView(this.f40907x2, w7.z5.n(-1, 48));
            this.M0.h(1, this.f40907x2);
            this.M0.g(this.f40907x2);
            this.f40907x2.setOnClickListener(new ve(this, 17));
            this.f40907x2.setEnabled(!isInPreviewMode());
            this.f40907x2.setBackground(org.telegram.ui.ActionBar.h6.L0(false));
            org.telegram.ui.Components.qg0 qg0Var = new org.telegram.ui.Components.qg0(getParentActivity(), this.f40677ea);
            this.f40932z2 = qg0Var;
            this.f40907x2.addView(qg0Var, w7.z5.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.f40907x2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.F2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.F2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21036fe));
            this.F2.setTypeface(AndroidUtilities.bold());
            this.f40907x2.addView(this.F2, w7.z5.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i10 = 0; i10 < 2; i10++) {
                pn pnVar = new pn(this, getParentActivity());
                pn[] pnVarArr = this.C2;
                pnVarArr[i10] = pnVar;
                pnVar.setTextSize(14);
                pnVarArr[i10].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21036fe));
                pnVarArr[i10].setTypeface(AndroidUtilities.bold());
                this.f40907x2.addView(pnVarArr[i10], w7.z5.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                dl dlVar = new dl(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.j5[] j5VarArr = this.D2;
                j5VarArr[i10] = dlVar;
                dlVar.setTextSize(14);
                j5VarArr[i10].setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21055ge));
                this.f40907x2.addView(j5VarArr[i10], w7.z5.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                ai.vd vdVar = new ai.vd(getParentActivity(), 14);
                vdVar.setSingleLine(true);
                vdVar.setLines(1);
                vdVar.setMaxLines(1);
                vdVar.setEllipsize(TextUtils.TruncateAt.END);
                vdVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.Sh));
                vdVar.setBackground(org.telegram.ui.ActionBar.x5.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.h6.Oh)));
                vdVar.setTextSize(1, 14.0f);
                vdVar.setTypeface(AndroidUtilities.bold());
                vdVar.setGravity(17);
                vdVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                ai.vd[] vdVarArr = this.E2;
                vdVarArr[i10] = vdVar;
                this.f40907x2.addView(vdVar, w7.z5.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                el elVar = new el(getParentActivity());
                elVar.I = new wh.g();
                elVar.H = new Path();
                elVar.J = new float[8];
                org.telegram.ui.Components.w9[] w9VarArr = this.B2;
                w9VarArr[i10] = elVar;
                elVar.setBlurAllowed(true);
                w9VarArr[i10].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f40907x2.addView(w9VarArr[i10], w7.z5.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i10 == 1) {
                    pnVarArr[i10].setVisibility(4);
                    vdVarArr[i10].setVisibility(4);
                    j5VarArr[i10].setVisibility(4);
                    w9VarArr[i10].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.L2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.L2;
            int i11 = org.telegram.ui.ActionBar.h6.f21000de;
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
            int i12 = org.telegram.ui.ActionBar.h6.f21365x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12) & 436207615, 1, -1));
            this.f40907x2.addView(this.L2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.L2.setOnClickListener(new ve(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.J2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.J2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), mode));
            this.J2.setScaleType(scaleType);
            this.J2.setVisibility(8);
            this.J2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f40677ea);
            this.K2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.K2.setSize(AndroidUtilities.dp(16.0f));
            this.K2.setStrokeWidth(2.0f);
            this.K2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21018ee));
            this.f40907x2.addView(this.K2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.J2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(i12) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f40907x2.addView(this.J2, w7.z5.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.J2.setOnClickListener(new ve(this, 19));
            Cc(false);
        }
    }

    public final long N8() {
        if (this.R3 == 3) {
            return this.f40660d4;
        }
        return 0L;
    }

    public final void N9(boolean z10) {
        TLRPC.Chat chat;
        if (this.ha == null && (chat = this.e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.T5);
            this.ha = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.N1(false, z10);
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

    public final void Nb() {
        TLRPC.ChatFull chatFull = this.Z7;
        if (chatFull != null && !this.f40818q5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new ke(this, 17), 1000L);
            }
        }
    }

    public final void Nc() {
        boolean z10;
        if (this.f40729j1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f40843s3 && !this.f40829r3) || (this.R3 == 7 && this.O3 == 2 && !this.f40872u6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40729j1.e(6, z10, true);
        this.f40729j1.e(5, z10, true);
        if (z10) {
            this.f40729j1.e(1, false, true);
        }
        if (!z10) {
            this.B7 = 0;
        }
        this.X0.invalidate();
    }

    public final void O6(boolean z10) {
        if (this.N6 == 0) {
            if (z10 && !this.O6.isEmpty()) {
                this.N6 = System.currentTimeMillis();
            } else {
                this.N6 = 1L;
            }
            I9();
            nj njVar = this.f40905x0;
            if (njVar != null) {
                njVar.invalidate();
            }
        }
    }

    public final void O7() {
        int i10;
        int i11;
        if (this.R2 == null && getParentActivity() != null) {
            ik ikVar = new ik(this, getParentActivity(), 1);
            this.R2 = ikVar;
            ikVar.setClickable(false);
            this.R2.setWillNotDraw(false);
            this.Cc.h(4, false, false);
            this.R2.setClipToPadding(false);
            org.telegram.ui.Components.q6 q6Var = new org.telegram.ui.Components.q6(getParentActivity(), true, true, true);
            this.U2 = q6Var;
            org.telegram.ui.Components.bs bsVar = org.telegram.ui.Components.bs.h;
            q6Var.b(0.25f, 280L, bsVar);
            this.U2.setTextSize(AndroidUtilities.dp(15.0f));
            this.U2.setTypeface(AndroidUtilities.bold());
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21389ye));
            this.U2.setGravity(3);
            this.R2.addView(this.U2, w7.z5.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.U.addView(this.R2, w7.z5.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.q6 q6Var2 = new org.telegram.ui.Components.q6(getParentActivity(), true, false, true);
            this.V2 = q6Var2;
            q6Var2.b(0.0f, 420L, bsVar);
            this.V2.setScaleProperty(0.7f);
            this.V2.setTextSize(AndroidUtilities.dp(15.0f));
            this.V2.setGravity(5);
            this.V2.setTypeface(AndroidUtilities.bold());
            this.V2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21197o6));
            org.telegram.ui.Components.q6 q6Var3 = this.V2;
            if (this.zc.f17384f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            q6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.q6 q6Var4 = this.V2;
            q6Var4.f29486n = false;
            q6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.V2.setOnClickListener(new ve(this, 2));
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
            int i12 = org.telegram.ui.ActionBar.h6.f20994d6;
            q6Var6.setBackground(org.telegram.ui.ActionBar.h6.h0(getThemedColor(i12), org.telegram.ui.ActionBar.h6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.h6.f21083i6))));
            org.telegram.ui.Components.q6 q6Var7 = this.W2;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            q6Var7.setText(LocaleController.getString(i11));
            this.W2.setOnClickListener(new ve(this, 3));
            this.W2.setVisibility(8);
            this.W2.setAlpha(0.0f);
            this.R2.addView(this.W2, w7.z5.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.e.megagroup) && this.R3 != 7 && !ChatObject.isMonoForum(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.T2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.T2.setImageResource(R.drawable.msg_usersearch);
                this.T2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21372xe), PorterDuff.Mode.MULTIPLY));
                this.T2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21401z8), 1, -1));
                this.R2.addView(this.T2, w7.z5.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.T2.setOnClickListener(new ve(this, 4));
                this.T2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.R3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.S2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.S2.setImageResource(R.drawable.msg_calendar);
                this.S2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21372xe), PorterDuff.Mode.MULTIPLY));
                this.S2.setBackgroundDrawable(org.telegram.ui.ActionBar.h6.g0(getThemedColor(org.telegram.ui.ActionBar.h6.f21401z8), 1, -1));
                this.R2.addView(this.S2, w7.z5.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.S2.setOnClickListener(new ve(this, 5));
                this.S2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int O8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f40905x0.getMeasuredHeight() - this.Ba) - this.f40849s9) - this.v.e()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
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
        dm dmVar;
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
            hVar = this.f40911x6;
            arrayList2 = this.f40872u6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.J4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f40797o6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f40680f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f40680f.f20427id, (int) d(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Xa();
                this.Qb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Pb.bind(messageObject2.messageOwner.f20301id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f20301id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.J4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.J4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.L4) {
                    Dc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f40807p6;
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
                    HashMap hashMap2 = this.f40832r6;
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
                        dm dmVar2 = this.A0;
                        if (dmVar2 != null && !dmVar2.N) {
                            dmVar2.Q(dmVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        dm dmVar3 = this.A0;
                        if (dmVar3 != null && !dmVar3.N) {
                            dmVar3.u(dmVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.h hVar3 = this.f40859t6;
                        if (((MessageObject) hVar3.f(id4)) != null) {
                            hVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            dm dmVar4 = this.A0;
                            int i22 = dmVar4.E;
                            int i23 = dmVar4.F;
                            int i24 = dmVar4.H;
                            int i25 = dmVar4.G;
                            if (!dmVar4.N) {
                                dmVar4.u(dmVar4.J + indexOf2);
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
                                this.f40846s6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                dm dmVar5 = this.A0;
                                int i26 = dmVar5.E;
                                int i27 = dmVar5.F;
                                int i28 = dmVar5.H;
                                int i29 = dmVar5.G;
                                if (!dmVar5.N) {
                                    dmVar5.u(dmVar5.J + indexOf2);
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
                                        Ic(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Ic(messageObject, messageObject2.getId());
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
                    int indexOf3 = arrayList2.indexOf((MessageObject) i2.e.h(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (dmVar = this.A0) != null) {
                        dmVar.q(indexOf3 + dmVar.J, groupedMessages3.messages.size());
                        pj pjVar = this.f40919y0;
                        if (pjVar != null) {
                            pjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        Ec();
    }

    public final void Ob(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.xc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f29535j = max;
        G.v = new bf(this, i10, 3);
        G.k(true);
        this.G3 = messageObject;
        this.H3 = i10;
    }

    public final void Oc(String str) {
        if (this.R3 == 7 && !TextUtils.equals(this.f40869u3, str)) {
            P7();
            Qb(true);
            this.f40869u3 = str;
            this.f40856t3 = str;
            U6(false);
            A7(true);
            this.N6 = 0L;
            this.f40748k7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.O3);
            this.M3.l();
            this.L3.requestLayout();
            if (this.L3.getLayoutManager() != null) {
                this.L3.getLayoutManager().n0(0);
            }
            Mc();
            this.f40658d2.e(true, true);
            v8();
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
        MessagePreviewParams messagePreviewParams = this.f40686f5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.G5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.G5 = null;
                fk fkVar = this.Y;
                if (fkVar != null) {
                    fkVar.X2 = null;
                    fkVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f40686f5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = fkVar.getFieldText();
                    MessageObject messageObject3 = this.f40783n5;
                    if (messageObject3 == this.X3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f40757l5, this.p5);
                }
                l8();
                m8();
            }
        }
    }

    public final void P7() {
        if (this.f40658d2 == null && this.f40854t1 == null) {
            org.telegram.ui.Components.b10 b10Var = new org.telegram.ui.Components.b10(getParentActivity(), this.f40677ea);
            this.f40645c2 = b10Var;
            b10Var.setViewType(7);
            org.telegram.ui.Components.tx0 tx0Var = new org.telegram.ui.Components.tx0(getParentActivity(), this.f40645c2, 1, null);
            this.f40658d2 = tx0Var;
            tx0Var.setClickable(true);
            this.f40658d2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f40658d2.setVisibility(8);
            this.f40658d2.addView(this.f40645c2, 0);
            this.f40658d2.e(true, false);
            this.K3.addView(this.f40658d2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f40854t1 = m40Var;
            m40Var.setOnHashtagClickListener(new xe(this, 2));
            this.f40854t1.setOnScrollListener(new k3(this, 5));
            this.f40854t1.setVisibility(8);
            this.K3.addView(this.f40854t1, -1, -1);
            u7();
            s7();
        }
    }

    public final int P8(MessageObject messageObject) {
        return O8(F8(messageObject, !TextUtils.isEmpty(this.P7))) - Ya(messageObject);
    }

    public final qi P9(org.telegram.ui.Cells.u1 u1Var, CharacterStyle characterStyle) {
        pf.c cVar = this.Ab;
        if (cVar != null) {
            cVar.a(true);
            this.Ab = null;
        }
        if (characterStyle != null && u1Var != null && u1Var.getMessageObject() != null) {
            qi qiVar = new qi(this, u1Var.getMessageObject().getId(), characterStyle, u1Var, 0);
            this.Ab = qiVar;
            return qiVar;
        }
        this.Ab = null;
        return null;
    }

    public final void Pa() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f40873u7 = 0;
        this.f40748k7 = false;
        this.f40759l7 = true;
        this.f40711h6.clear();
    }

    public final void Pb(boolean z10) {
        boolean z11;
        kh.h hVar = this.f40729j1;
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

    public final void Pc() {
        fk fkVar;
        if (this.R != null) {
            this.E0.setBackground(null);
            this.E0.setOnClickListener(null);
            boolean z10 = true;
            if (this.R3 == 3 && N8() == 2666000) {
                this.E0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.R.setVisibility(0);
                this.I1.setVisibility(8);
                this.I1.setTag(null);
                xc();
                org.telegram.ui.Components.iz0 iz0Var = this.f40657d1;
                if (iz0Var != null) {
                    iz0Var.f();
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
                                zqVar.f33024f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                zqVar.h = dp3;
                                zqVar.f33025n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.g0.g(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(zqVar, 1), 0, 1, 33);
                                this.E0.setBackground(org.telegram.ui.ActionBar.h6.h0(0, org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21083i6, false)));
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
                        this.I1.setVisibility(8);
                        this.I1.setTag(null);
                        xc();
                        org.telegram.ui.Components.iz0 iz0Var2 = this.f40657d1;
                        if (iz0Var2 != null) {
                            iz0Var2.f();
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
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a1.g.s(new StringBuilder("<b>"), this.f40680f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.T5, this.f40660d4, false);
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
                    if (this.f40657d1 != null && (fkVar = this.Y) != null && fkVar.i0()) {
                        this.f40657d1.e();
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

    public final void Q6() {
        MessageObject editingMessageObject;
        int abs;
        fk fkVar = this.Y;
        if (fkVar != null && (editingMessageObject = fkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f40680f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.j5 j5Var = ((org.telegram.ui.Components.ap[]) this.f40616a0.f899b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        j5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new kg(this, 14), 1000L);
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
        AndroidUtilities.cancelRunOnUIThread(this.f40926y8);
        if (this.f40861t8 == null) {
            ik ikVar = new ik(this, getParentActivity(), 2);
            this.f40861t8 = ikVar;
            ikVar.setOutlineProvider(new gl(this));
            this.f40861t8.setClipToOutline(true);
            this.f40861t8.setWillNotDraw(false);
            o4 o4Var = new o4(getParentActivity());
            this.f40886v8 = o4Var;
            o4Var.setBackgroundColor(0);
            if (z10) {
                this.f40861t8.addView(this.f40886v8, w7.z5.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f40900w8 = textureView;
            textureView.setOpaque(false);
            this.f40886v8.addView(this.f40900w8, w7.z5.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f40861t8.getParent();
        if (viewGroup != null && viewGroup != this.X0) {
            viewGroup.removeView(this.f40861t8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.X0.addView(this.f40861t8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(H9()), AndroidUtilities.roundPlayingMessageSize(H9())));
        }
        this.f40861t8.setTag(null);
        this.f40886v8.setDrawingReady(false);
        return this.f40900w8;
    }

    public final int Q8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f40905x0.getMeasuredHeight() - view.getBottom()) - this.f40905x0.getPaddingBottom()) + "} chatHeight=" + this.f40905x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f40905x0.getPaddingBottom());
        return (this.f40905x0.getMeasuredHeight() - view.getBottom()) - this.f40905x0.getPaddingBottom();
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
        this.f40929yb = null;
        this.f40902wb = 0;
        this.f40916xb = -1;
        this.f40941zb = null;
        this.Ab = null;
        this.f40729j1.d(false);
    }

    public final void Qb(boolean z10) {
        int i10;
        if (this.K3 != null) {
            ne.b bVar = this.zc;
            if (bVar.f17384f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.R3 == 7) {
                    s4.b0 b0Var = (s4.b0) this.L3.getLayoutManager();
                    Object E = this.M3.E((b0Var.N0() + b0Var.L0()) / 2);
                    Object E2 = this.M3.E(b0Var.L0());
                    Object E3 = this.M3.E(b0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f40930z0.L0();
                        int N0 = this.f40930z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f20301id;
                        int i12 = ((MessageObject) E2).messageOwner.f20301id;
                        int i13 = ((MessageObject) E3).messageOwner.f20301id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f20301id == i12) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f20301id == i13) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f20301id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.f40930z0.h1(this.A0.J + i14, (this.f40905x0.getHeight() - F8((MessageObject) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.q6 q6Var = this.V2;
                if (q6Var != null) {
                    if (bVar.f17384f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    q6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                ei.x3 x3Var = this.f40906x1;
                if (x3Var != null && x3Var.V) {
                    x3Var.e(true);
                }
                pl plVar = this.B1;
                if (plVar != null && plVar.V) {
                    plVar.e(true);
                }
                fk fkVar = this.Y;
                if (fkVar != null) {
                    fkVar.j0();
                }
                Lc();
            }
        }
    }

    public final void Qc() {
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
            vk vkVar = this.f40640bb;
            if (vkVar != null) {
                vkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f40640bb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                vk vkVar2 = this.f40640bb;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                vkVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new ke(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.dl0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.u0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.yj0 yj0Var = k10.f21762x;
                if (yj0Var != null && k10.f21763y != i10) {
                    k10.f21763y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(yj0Var, i10);
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

    public final void R6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.W7;
        if (call != null && (((str = this.f40700g8) != null || this.f40713h8) && this.N5)) {
            org.telegram.ui.Components.voip.d2.l(this.e, str, this.Y7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f40700g8 = null;
            this.f40713h8 = false;
            return;
        }
        if (this.f40700g8 != null && z10 && (chatFull = this.Z7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.g0.q(R.string.LinkHashExpired, org.telegram.ui.Components.xc.a0(this), R.raw.linkbroken, 36);
            this.f40700g8 = null;
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
            int i10 = org.telegram.ui.ActionBar.h6.f21232q7;
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
            this.N1.setOnClickListener(new ve(this, 13));
            org.telegram.ui.Components.x90 x90Var = new org.telegram.ui.Components.x90(getParentActivity(), this.f40677ea);
            this.T1 = x90Var;
            x90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.h6.f21055ge));
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
            this.L1.setOnClickListener(new ve(this, 14));
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
            this.O1.setOnClickListener(new ve(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.U1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.U1.setContentDescription(LocaleController.getString(R.string.Close));
            this.U1.setBackground(org.telegram.ui.ActionBar.h6.N(getThemedColor(org.telegram.ui.ActionBar.h6.f21083i6), 0, 0));
            this.U1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.h6.f21000de), PorterDuff.Mode.MULTIPLY));
            this.U1.setScaleType(ImageView.ScaleType.CENTER);
            this.K1.addView(this.U1, w7.z5.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.U1.setOnClickListener(new ve(this, 16));
        }
    }

    public final in R8() {
        if (this.oc == null) {
            this.oc = new in(this);
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
        if (this.f40905x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.r40 r40Var = this.f40855t2;
            ArrayList<MessageObject> arrayList = null;
            if (r40Var != null && r40Var.getTag() != null && (messageCell = this.f40855t2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                e6Var = photoImage2.getAnimation();
                if (e6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f40905x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.f40913x8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                e6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f40905x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f40905x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = u1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f40905x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f40905x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.f40913x8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f40905x0.getMeasuredHeight()) {
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
                if (PhotoViewer.N1(messageObject)) {
                    PhotoViewer.f33244b9.R0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ra(org.telegram.ui.Cells.u1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Ra(org.telegram.ui.Cells.u1):void");
    }

    public final void Rb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f40677ea);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
            b2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            b2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new ai.r4(this, tL_game, messageObject, str, j10));
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
                    presentFragment(new ci1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        ci1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Rc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        org.telegram.ui.Wallet.l3 l3Var;
        if (this.fragmentView != null && !this.f40818q5) {
            int childCount = this.f40905x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f40905x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.w0) {
                        org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                        MessageObject messageObject = w0Var.getMessageObject();
                        if (this.L7 != Integer.MAX_VALUE && messageObject != null && messageObject.getId() == this.L7 && w0Var.M()) {
                            org.telegram.ui.Wallet.n3 n3Var = w0Var.I0;
                            if (!n3Var.f34571h0 && (n3Var.f34566e0 == 0 || (l3Var = n3Var.f34565d0) == null || l3Var.c())) {
                                n3Var.e();
                                org.telegram.ui.Wallet.l3 l3Var2 = n3Var.f34565d0;
                                l3Var2.getClass();
                                l3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.l3 l3Var3 = n3Var.f34565d0;
                                l3Var3.f24862b = -1L;
                                l3Var3.f24863c = -1L;
                                n3Var.f34566e0 = SystemClock.elapsedRealtime();
                                n3Var.f34568f0 = false;
                                n3Var.f34559a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt;
                        MessageObject messageObject2 = u1Var.getMessageObject();
                        if (this.f40861t8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                            ImageReceiver photoImage = u1Var.getPhotoImage();
                            this.f40861t8.setTranslationX(u1Var.getX() + photoImage.getImageX());
                            this.f40861t8.setTranslationY((this.f40905x0.getY() + (photoImage.getImageY() + (u1Var.getY() + u1Var.getPaddingTop()))) - this.f40861t8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f40861t8.getLayoutParams();
                            if (messageObject2.isRoundVideo()) {
                                this.f40861t8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(H9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(H9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(H9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f40886v8.setResizeMode(0);
                                    this.f40861t8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(H9())) / AndroidUtilities.roundPlayingMessageSize(H9());
                                float imageWidth = u1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(H9());
                                if (this.f40861t8.getScaleX() != imageWidth) {
                                    this.f40861t8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f40861t8.setPivotX(0.0f);
                                this.f40861t8.setPivotY(0.0f);
                                this.f40861t8.setScaleX(imageWidth);
                                this.f40861t8.setScaleY(imageWidth);
                                this.f40900w8.setScaleX(roundPlayingMessageSize2);
                                this.f40900w8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f40861t8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f40886v8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f40861t8.setLayoutParams(layoutParams);
                                }
                                this.f40900w8.setScaleX(1.0f);
                                this.f40900w8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f40861t8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.f40861t8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.f40767m3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f40861t8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(H9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f40767m3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                j(playingMessageObject.getId(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f40913x8) {
                        this.f40905x0.invalidate();
                    }
                }
            }
        }
    }

    public final void S6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.f40920y1 == null && ChatObject.isMegagroup(this.e) && (chatFull = getMessagesController().getChatFull(this.e.f20280id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            jk jkVar = this.O0;
            if (jkVar == null || jkVar.getVisibility() != 0) {
                org.telegram.ui.Components.s40 s40Var = org.telegram.ui.Components.s40.f30198n;
                if (s40Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f20286id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        s40Var.b();
                        ei.x3 x3Var = new ei.x3(getParentActivity(), 3);
                        this.f40920y1 = x3Var;
                        x3Var.i(true);
                        this.f40920y1.p(true);
                        ei.x3 x3Var2 = this.f40920y1;
                        x3Var2.K = Layout.Alignment.ALIGN_CENTER;
                        x3Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(j10, this.f40920y1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f40920y1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        ei.x3 x3Var3 = this.f40920y1;
                        x3Var3.h = ei.x3.a(x3Var3.getText(), this.f40920y1.getTextPaint());
                        ei.x3 x3Var4 = this.f40920y1;
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
        if (this.R1 == null && getParentActivity() != null) {
            if (this.f40907x2 == null) {
                N7();
            }
            org.telegram.ui.Components.s31 s31Var = new org.telegram.ui.Components.s31(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.R1 = s31Var;
            s31Var.O = new ke(this, 5);
            eh.e o10 = fh.c.o(this.f40677ea);
            bh.b bVar = this.J;
            s31Var.setSideMenuBackgroundDrawable(bVar.c(s31Var, o10, false));
            org.telegram.ui.Components.s31 s31Var2 = this.R1;
            s31Var2.setTopMenuBackgroundDrawable(bVar.c(s31Var2, fh.c.o(this.f40677ea), false));
            this.R1.setCurrentTopic(d());
            this.R1.setOnNewTopicSelected(new ke(this, 6));
            this.R1.setOnTopicSelected(new we(this, 0));
            this.R1.setOnDialogSelected(new we(this, 1));
            int indexOfChild = this.X0.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.X0.addView(this.R1, i10, w7.z5.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.R1.n();
            xj xjVar = this.I1;
            if (xjVar != null) {
                xjVar.bringToFront();
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
        long j10 = this.f40660d4;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.p5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f40783n5) != null && (message = messageObject.messageOwner) != null) {
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
        if (indexOf > 0 && !(n2Var instanceof qn) && !(n2Var instanceof ProfileActivity) && this.e.creator) {
            int size = d5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) d5Var2.getFragmentStack().get(indexOf);
                if (n2Var2 instanceof qn) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new qn(zf.d0.b(j10, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new ProfileActivity(zf.d0.b(j10, "chat_id"), null));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof io) {
                    ((ActionBarLayout) d5Var2).c(indexOf, new io(zf.d0.b(j10, "chat_id")));
                    n2Var2.removeSelfFromStack();
                } else if (n2Var2 instanceof hr) {
                    if (((hr) n2Var2).f37732e1 == 0) {
                        Bundle arguments = n2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) d5Var2).c(indexOf, new hr(arguments));
                    }
                    n2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.camera.i(this, n2Var, messageObject, d5Var2, 9));
        }
        AndroidUtilities.runOnUIThread(new je(this, j10, 1), 1000L);
    }

    public final void Sa() {
        org.telegram.ui.Components.wc0 i10;
        on onVar = this.f40677ea;
        if (onVar != null) {
            Drawable e = onVar.e();
            if (this.fragmentView != null) {
                e = this.X0.getBackgroundImage();
            }
            if (e instanceof tn) {
                e = ((tn) e).c(true);
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
        if (z10) {
            if (this.Cb == null) {
                ke keVar = new ke(this, 11);
                this.Cb = keVar;
                AndroidUtilities.runOnUIThread(keVar, 100L);
                return;
            }
            return;
        }
        ke keVar2 = this.Cb;
        if (keVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(keVar2);
        }
        this.Cb = null;
        this.Bb = false;
        Cc(true);
    }

    public final void Sc(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        hj hjVar = this.f40617a1;
        if (hjVar == null) {
            return;
        }
        int i10 = this.R3;
        if (i10 == 8 && (chat2 = this.e) != null) {
            if (this.T3) {
                String i11 = og.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.e;
                hjVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f40660d4 > 0L ? 1 : (this.f40660d4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.e;
                        }
                        this.f40617a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        hj hjVar2 = this.f40617a1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.e;
                        hjVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f40660d4));
                    this.f40617a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f40660d4));
                    if (chat7 == null) {
                        chat7 = this.e;
                    }
                    this.f40617a1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                hj hjVar3 = this.f40617a1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.e.title));
                TLRPC.Chat chat8 = this.e;
                hjVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            hjVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.Q3)) {
                this.f40617a1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.Q3)) {
                this.f40617a1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f40617a1.setTitle(this.Q3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.P3.title)) {
                this.f40617a1.setTitle(this.P3.title);
            } else {
                this.f40617a1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j10 = this.f40660d4;
                if (j10 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f40617a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f40617a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f40617a1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f40617a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f40617a1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f40617a1.setTitle("");
                }
            } else if (K9() && !UserObject.isBotForum(this.f40680f)) {
                if (this.f40709h4) {
                    Xc();
                } else if (this.f40696g4) {
                    if (this.X3.hasReplies()) {
                        this.f40617a1.setTitle(LocaleController.formatPluralString("Comments", this.X3.getRepliesCount(), new Object[0]));
                    } else {
                        this.f40617a1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f40617a1.setTitle(LocaleController.formatPluralString("Replies", this.X3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f40680f)) {
                this.f40617a1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f40680f)) {
                this.f40617a1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.R3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f40680f)) {
                        this.f40617a1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f40617a1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f40617a1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", L8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.e;
                    if (chat9 != null) {
                        hj hjVar4 = this.f40617a1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.e;
                        hjVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f40680f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f40617a1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f40680f.f20427id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f40680f.phone)) {
                                    hj hjVar5 = this.f40617a1;
                                    String g10 = org.telegram.messenger.nk.g(new StringBuilder("+"), this.f40680f.phone, jf.b.c());
                                    TLRPC.User user4 = this.f40680f;
                                    hjVar5.h(g10, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f40680f), this.f40680f.emoji_status, z10);
                                } else {
                                    hj hjVar6 = this.f40617a1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f40680f)));
                                    TLRPC.User user5 = this.f40680f;
                                    hjVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f40680f), this.f40680f.emoji_status, z10);
                                }
                            } else {
                                hj hjVar7 = this.f40617a1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f40680f)));
                                TLRPC.User user6 = this.f40680f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f40680f);
                                if (!MessagesController.isSupportUser(this.f40680f)) {
                                    emojiStatus = this.f40680f.emoji_status;
                                }
                                hjVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f40617a1.getTitleTextView().getText());
        Uc(false);
    }

    public final void T6() {
        ArrayList arrayList;
        int i10;
        if (this.Qa) {
            int i11 = -1;
            int i12 = 0;
            long j10 = 0;
            while (true) {
                arrayList = this.f40872u6;
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
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f40677ea);
            this.y3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.X0.addView(this.y3, w7.z5.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int T8() {
        return this.X0.getBackgroundSizeY();
    }

    public final void T9(boolean z10) {
        int i10;
        if (this.f40905x0 != null) {
            ArrayList arrayList = this.f40872u6;
            if (!arrayList.isEmpty() && !this.f40901wa.f42392n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f40930z0.h1(i10, 0);
                this.f40905x0.B0();
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
        jk jkVar;
        fk fkVar = this.Y;
        if (fkVar != null && fkVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.Y4 && fkVar != null && (jkVar = this.O0) != null && jkVar.getVisibility() != 0) {
            messageObject = this.f40783n5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.Y2;
        } else {
            z10 = true;
            messageObject = null;
            charSequence = null;
        }
        if (this.f40769m5) {
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
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f40769m5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        gn gnVar = this.f40757l5;
        MessageSuggestionParams messageSuggestionParams = this.f40697g5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        fk fkVar2 = this.Y;
        if (fkVar2 != null) {
            j10 = fkVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.saveDraft(j11, E7, charSequence2, entities, message, gnVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void Tb(boolean z10) {
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
                    org.telegram.ui.Components.qc M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new ff(this, z10, 0)), spannableString), i12);
                    M.f29535j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void Tc() {
        Uc(false);
    }

    public final void U6(boolean z10) {
        hg.n1 n1Var;
        if (this.O3 == 2 && (n1Var = this.M3) != null) {
            String str = this.f40869u3;
            ei.bc bcVar = n1Var.E;
            if (!TextUtils.equals(n1Var.f11997x, str)) {
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
                ci.u6 u6Var = n1Var.f11998y;
                if (u6Var != null && u6Var.I != 0) {
                    ConnectionsManager.getInstance(u6Var.f5146c).cancelRequest(u6Var.I, true);
                    u6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    n1Var.f11997x = str;
                    n1Var.f11998y = new ci.u6(n1Var.f11994r, str2, trim);
                    if (z10) {
                        bcVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(bcVar, 1000L);
                    }
                }
                ci.u6 u6Var2 = n1Var.f11998y;
                if (u6Var2 != null && u6Var2.J > 0) {
                    n1Var.l();
                }
            }
        }
    }

    public final ArrayList U7(MessageObject messageObject, boolean z10) {
        ArrayList k10 = org.telegram.messenger.g0.k(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.f40872u6;
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
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.X0.getBackgroundTranslationY()) - ((1.0f - this.f40914x9) * this.f40849s9);
    }

    public final boolean U9() {
        fk fkVar = this.Y;
        boolean z10 = fkVar.f24058z2;
        if (z10) {
            fkVar.p1();
            this.D3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Ua() {
        org.telegram.ui.Cells.u1 u1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f40905x0.getChildCount(); i11++) {
            View childAt = this.f40905x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.u1) {
                org.telegram.ui.Cells.u1 u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                int min = Math.min(u1Var2.getBottom(), this.f40905x0.getHeight()) - Math.max(0, u1Var2.getTop());
                if (min > i10) {
                    u1Var = u1Var2;
                    i10 = min;
                }
            }
        }
        if (u1Var != null) {
            qj qjVar = this.f40930z0;
            this.f40905x0.getClass();
            qjVar.i1(RecyclerView.R(u1Var), u1Var.getTop() - ((int) this.f40849s9), false);
        }
    }

    public final void Ub(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f40696g4 && this.f40680f == null) {
                if (this.f40726ib == null) {
                    this.f40726ib = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f40726ib.booleanValue()) {
                    this.f40715hb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.O5 && SharedConfig.animationsEnabled()) {
                if (z10 == this.f40715hb) {
                    return;
                }
                this.f40715hb = z10;
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
            this.f40715hb = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Uc(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.s0 s0Var;
        if (this.f40617a1 != null) {
            int i10 = this.R3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.T5, d());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f40680f)) {
                    if (!UserObject.isReplyUser(this.f40680f) && ((!K9() || this.f40709h4) && isDialogMuted)) {
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
                        drawable = this.f40617a1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f40680f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f40617a1.c(DialogObject.getBotVerificationIcon(this.f40680f));
                        }
                    }
                }
                this.f40617a1.j(drawable, mutate);
                if (!z10 && (s0Var = this.f40669e1) != null) {
                    if (isDialogMuted) {
                        if (s0Var.f21706m != 8) {
                            s0Var.f21706m = 8;
                            View view = s0Var.f21703j;
                            if (view instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view).getRightIcon().setVisibility(s0Var.f21706m);
                            }
                        }
                        this.f40669e1.d(LocaleController.getString(R.string.Unmute));
                        this.f40669e1.b(R.drawable.msg_mute);
                    } else {
                        if (s0Var.f21706m != 0) {
                            s0Var.f21706m = 0;
                            View view2 = s0Var.f21703j;
                            if (view2 instanceof org.telegram.ui.ActionBar.e1) {
                                ((org.telegram.ui.ActionBar.e1) view2).getRightIcon().setVisibility(s0Var.f21706m);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.T5, d())) {
                            this.f40669e1.d(LocaleController.getString(R.string.Mute));
                            this.f40669e1.b(R.drawable.msg_unmute);
                        } else {
                            this.f40669e1.d(LocaleController.getString(R.string.Mute));
                            this.f40669e1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.zo zoVar = this.f40717i1;
                if (zoVar != null) {
                    zoVar.d(this.T5, d(), null);
                }
            }
        }
    }

    public final void V6() {
        this.S.d();
        Bc();
        lc();
        p7();
        m7();
        r7();
        q7();
        u7();
        u9();
        boolean z10 = true;
        if (this.v.f44746s == 1) {
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
            ArrayList arrayList = this.f40872u6;
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
        nj njVar = this.f40905x0;
        if (njVar != null) {
            njVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            Ub(true);
        }
        dm dmVar = this.A0;
        dmVar.L = true;
        dmVar.O(true);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                qn qnVar = qn.this;
                MessagesController messagesController = qnVar.getMessagesController();
                long j11 = qnVar.T5;
                if (ChatObject.isChannel(qnVar.e)) {
                    j10 = qnVar.T5;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i10, i11, z10, new kg(qnVar, 18));
            }
        }, new kf(this, 28));
    }

    public final float V8() {
        org.telegram.ui.Components.s31 s31Var = this.R1;
        if (s31Var != null) {
            return s31Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Va(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Va(org.telegram.messenger.MessageObject):void");
    }

    public final void Vb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new pe(this, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f20609a);
    }

    public final void Vc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Vc(boolean):void");
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
        org.telegram.ui.Components.zm0 zm0Var = new org.telegram.ui.Components.zm0(getParentActivity(), this.f40677ea);
        I.f27184p = new qe(zm0Var, 0);
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
            ai.r2 r2Var = new ai.r2(this, str, characterStyle, messageObject, u1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            u1Var2 = u1Var;
            I.c(i13, string, r2Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            u1Var2 = u1Var;
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
        zm0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            zm0Var.f(u1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.n61) {
            String url = ((org.telegram.ui.Components.n61) characterStyle2).getURL();
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
            zm0Var.f(u1Var2, characterStyle2, spannableString2, false);
        } else {
            zm0Var.f(u1Var2, characterStyle2, null, false);
        }
        showDialog(zm0Var);
    }

    public final int W8() {
        return (int) (V8() * AndroidUtilities.dp(71.0f));
    }

    public final void Wa(long j10) {
        qj qjVar;
        MessageObject messageObject;
        int Q8;
        int abs;
        nj njVar = this.f40905x0;
        int i10 = -1;
        if (njVar != null && (qjVar = this.f40930z0) != null && qjVar.f45918y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f40905x0.getChildAt(childCount);
                this.f40905x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.u1) && (messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((Q8 = Q8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = Q8;
                    i12 = abs;
                }
            }
            this.f40785n7 = i10;
            this.f40798o7 = i11;
            return;
        }
        this.f40785n7 = -1;
    }

    public final void Wb() {
        String str;
        if (this.Gb != null) {
            return;
        }
        if (this.f40783n5 != null) {
            str = getMessagesController().getFullName(this.f40783n5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new pe(this, 17));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(this, 18));
        b2Var.setOnDismissListener(new oe(this, 8));
        this.Gb = alertDialog$Builder.o();
    }

    public final void Wc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.s0 s0Var = this.f40853t0;
        if (s0Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f40647c4) && (tL_forumTopic = this.f40647c4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            s0Var.e(i10);
        }
    }

    public final void X6() {
        MessageObject messageObject;
        if (!this.D4 && (messageObject = this.J7) != null) {
            if (this.f40872u6.indexOf(messageObject) >= 0) {
                this.E4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.C4 != null) {
        } else {
            kf kfVar = new kf(this, 20);
            this.C4 = kfVar;
            AndroidUtilities.runOnUIThread(kfVar);
        }
    }

    public final void X7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.u1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.X7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.u1):void");
    }

    public final int X8(int i10) {
        SparseIntArray sparseIntArray = this.V4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Kc;
            Kc = i12 + 1;
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
        float f7 = this.f40917xc.e;
        j6.l lVar = this.Cc;
        float D = com.google.android.gms.internal.play_billing.k3.D(1.0f, f7, 1.0f - ((float[]) lVar.f14289b)[5], 1.0f);
        kh.c cVar = this.P0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(D);
        }
        fk fkVar = this.Y;
        if (fkVar != null) {
            fkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        ik ikVar = this.R2;
        if (ikVar != null) {
            ikVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        jk jkVar = this.O0;
        if (jkVar != null) {
            jkVar.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        ik ikVar2 = this.R;
        if (ikVar2 != null) {
            ikVar2.setTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        ih.f fVar = this.S;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - D) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * D);
        }
        jk jkVar2 = this.O0;
        ne.b bVar = this.f40890vc;
        if (jkVar2 != null) {
            jkVar2.setTotalVisibilityFactor((1.0f - bVar.e) * ((float[]) lVar.f14289b)[3]);
        }
        lp lpVar = this.P9;
        if (lpVar != null) {
            float f10 = bVar.e;
            if (lpVar.S != f10) {
                lpVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        t7();
    }

    public final void Xa() {
        int i10;
        int i11;
        nj njVar = this.f40905x0;
        if (njVar != null && this.f40930z0 != null) {
            for (int childCount = njVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f40905x0.getChildAt(childCount);
                this.f40905x0.getClass();
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
            this.f40930z0.h1(i11, i10);
        }
    }

    public final void Xb(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.r40 r40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((r40Var = this.f40766m2) != null && r40Var.getVisibility() == 0)) {
                this.f40766m2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f40766m2.f(view, true);
                }
            }
        }
    }

    public final void Xc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        hj hjVar = this.f40617a1;
        if (hjVar != null && (tL_forumTopic = this.f40647c4) != null) {
            hjVar.setTitle(tL_forumTopic.title);
        }
        Yc();
    }

    public final void Y6(boolean z10) {
        if (this.f40783n5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f40872u6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f40783n5.getId() && messageObject.getDialogId() == this.f40783n5.getDialogId()) {
                        this.f40783n5 = messageObject;
                        gn gnVar = this.f40757l5;
                        if (gnVar != null) {
                            gnVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f40686f5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f40783n5;
                                MessageObject.GroupedMessages groupedMessages = this.f40733j5;
                                if (groupedMessages == null) {
                                    groupedMessages = D8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.T5, this.f40757l5);
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
        qi P9 = P9(u1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(jf.b.d(str, false));
        ai.f3 f3Var = new ai.f3(this, u1Var, str, tL_contact, characterStyle, 3);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                f3Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new t1(this, tL_contact, f3Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = jf.b.d(str, false);
        P9.f44294b = new bf(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ca(this, P9, f3Var, 3)), 0);
        P9.d();
    }

    public final int Y8(int i10) {
        SparseIntArray sparseIntArray = this.U4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Kc;
            Kc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void Y9(boolean z10, boolean z11) {
        if (this.D3) {
            AndroidUtilities.runOnUIThread(new ke(this, 20), 200L);
            if (z11) {
                this.D3 = false;
            }
        }
        if (z10 && !this.Pa) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int Ya(org.telegram.messenger.MessageObject r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Ya(org.telegram.messenger.MessageObject):int");
    }

    public final void Yb(MessageSuggestionParams messageSuggestionParams) {
        if (this.p5 == null) {
            return;
        }
        new ai.h1(getParentActivity(), this.currentAccount, this.T5, messageSuggestionParams, this, getResourceProvider(), 0, new xe(this, 0)).show();
    }

    public final void Yc() {
        hj hjVar;
        hj hjVar2;
        if (UserObject.isBotForum(this.f40680f) && (hjVar2 = this.f40617a1) != null) {
            hjVar2.getAvatarImageView().setVisibility(0);
            this.f40617a1.b();
        } else if (this.f40647c4 != null && (hjVar = this.f40617a1) != null) {
            hjVar.getAvatarImageView().setVisibility(0);
            og.d.p(this.f40617a1.getAvatarImageView(), this.f40647c4, true, true, this.f40677ea);
        }
    }

    public final void Z6() {
        jk jkVar;
        ik ikVar;
        ik ikVar2;
        fk fkVar = this.Y;
        if (fkVar != null && fkVar.f24059z3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((jkVar = this.O0) == null || jkVar.getVisibility() != 0) && (((ikVar = this.R) == null || ikVar.getVisibility() != 0) && ((ikVar2 = this.R2) == null || ikVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void Z7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.Z7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final long Z8() {
        return this.f40660d4;
    }

    public final void Z9() {
        this.D4 = true;
        km kmVar = this.f40652c9;
        AndroidUtilities.cancelRunOnUIThread(kmVar.f21995f0);
        kmVar.f22021z = false;
        ke keVar = new ke(this, 8);
        int i10 = this.D7;
        if (i10 != 0) {
            bb(i10, 0, false, this.C7, true, 0, null, null, keVar);
            return;
        }
        int i11 = this.B7;
        if (i11 > 0) {
            bb(i11, 0, true, this.C7, true, 0, null, null, keVar);
            return;
        }
        ab(!this.f40654cb, keVar);
        this.f40654cb = false;
        if (!this.H4.isEmpty()) {
            this.O4 = true;
            this.N4 = ((Integer) this.H4.get(0)).intValue();
        }
    }

    public final void Za() {
        ab(false, null);
    }

    public final void Zb(MessageObject messageObject) {
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f40725i9 && this.f40737j9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f40725i9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f40714h9 == null) {
                        il ilVar = new il(getParentActivity(), this.f40677ea, this);
                        this.f40714h9 = ilVar;
                        this.X0.addView(ilVar, w7.z5.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f40714h9.c();
                }
            }
        }
    }

    public final void Zc() {
        int i10;
        org.telegram.ui.ActionBar.s0 s0Var = this.f40754l0;
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

    public long a() {
        return this.T5;
    }

    public final boolean a7(boolean z10, boolean z11) {
        fk fkVar = this.Y;
        if (fkVar == null || !fkVar.t0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f40677ea);
            if (this.Y.f23928c1) {
                alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new ci.f(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f20609a);
            return true;
        }
        return true;
    }

    public final void a8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.a8(int, java.lang.Object[]):void");
    }

    public final float a9(float f7) {
        qn qnVar = this.f40666da;
        if (qnVar == null) {
            qnVar = this;
        }
        org.telegram.ui.Components.ch chVar = qnVar.M0;
        if (chVar == null) {
            return 0.0f;
        }
        return chVar.c(f7);
    }

    public final void ab(boolean z10, ke keVar) {
        ArrayList arrayList;
        int i10;
        if (this.f40905x0.V1) {
            return;
        }
        this.N4 = 0;
        this.f40823qb = 0;
        this.O4 = false;
        this.W8.e(0);
        if (this.E6[0] && this.H7 == 0 && this.f40873u7 == 0) {
            this.f40729j1.d(false);
            if (this.f40930z0.I0() == 0) {
                this.f40701g9 = false;
                Ac();
                Ma();
                bd(false);
                return;
            }
            this.A0.T();
            dn dnVar = this.Ma;
            dnVar.f36426a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f40872u6;
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
            mk mkVar = this.W8;
            dnVar.f36427b = i11;
            dnVar.d = 0;
            boolean z11 = !z10;
            dnVar.f36428c = z11;
            mkVar.c(i11, 0, z11, true);
            this.f40701g9 = false;
            Ac();
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = this.f40811pb;
        if (b2Var != null) {
            b2Var.dismiss();
        }
        Cc(false);
        if (keVar != null) {
            keVar.run();
        } else {
            Qa();
            org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getParentActivity(), 3, this.f40677ea);
            this.f40811pb = b2Var2;
            b2Var2.setOnCancelListener(this.f40774ma);
            this.f40811pb.r(1000L);
        }
        this.Y8 = this.V5;
        this.f40624a9 = false;
        this.Z8 = 0;
        this.f40638b9 = false;
        ArrayList arrayList2 = this.f40711h6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.V5));
        AndroidUtilities.runOnUIThread(new kf(this, 12), 0L);
    }

    public final void ac(boolean z10, boolean z11) {
        fk fkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.f40842s2 != null) && this.R3 == 0 && (fkVar = this.Y) != null && fkVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f40842s2 == null) {
                    jm jmVar = this.X0;
                    int indexOfChild = jmVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(9, getParentActivity(), this.f40677ea, false);
                        this.f40842s2 = r40Var;
                        jmVar.addView(r40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.f40842s2.b(true);
                    return;
                }
                if (this.Y.f23941e2) {
                    org.telegram.ui.Components.r40 r40Var2 = this.f40842s2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    r40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f40842s2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f40842s2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void ad(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        nj njVar = this.f40905x0;
        if (njVar != null) {
            if (!this.D4 && this.J7 != null) {
                int childCount = njVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f40905x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.u1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.J7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f40872u6;
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
            int childCount2 = this.f40905x0.getChildCount();
            fk fkVar = this.Y;
            if (fkVar != null) {
                fkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f40905x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.u1) {
                    org.telegram.ui.Cells.u1 u1Var = (org.telegram.ui.Cells.u1) childAt2;
                    MessageObject messageObject3 = u1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        u1Var.X3(messageObject3, u1Var.getCurrentMessagesGroup(), u1Var.m3(), u1Var.n3(), u1Var.h3(), u1Var.j3());
                        dm dmVar = this.A0;
                        this.f40905x0.getClass();
                        dmVar.Q(RecyclerView.R(u1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f40930z0.h1(i10, i11);
            }
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

    public void b(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.T5, this.f40783n5, this.X3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = H8();
        of2.payStars = j10;
        of2.monoForumPeer = S8();
        of2.suggestionParams = this.f40697g5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.R3 == 0) {
            T9(false);
        }
        if (i10 == 0 || i10 == 1) {
            B6();
        }
        if (this.f40818q5) {
            this.Q5 = true;
        }
    }

    public final void b7() {
        if (!this.Sb) {
            this.Sb = true;
            if (!this.Tb && this.R3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f40879v1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f40879v1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f40893w1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f40893w1.u();
                    this.Tb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    c7();
                }
            }
        }
    }

    public final void b8(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.b8(int, java.lang.Object[]):void");
    }

    public final float b9(org.telegram.ui.Components.n31 n31Var) {
        float f7;
        org.telegram.ui.Components.s31 s31Var = this.R1;
        if (s31Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j10 = s31Var.j(n31Var);
            if (n31Var == org.telegram.ui.Components.n31.f28684b) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.bb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final boolean bc(MessageObject messageObject) {
        if (this.R3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void bd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.bd(boolean):void");
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
        ei.x3 x3Var2 = this.f40906x1;
        if (x3Var2 != null && !x3Var2.V && !this.Vb && this.Sb && !this.zc.f17384f && System.currentTimeMillis() - this.Ub > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f40905x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f40905x0.getChildAt(childCount);
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
                this.f40906x1.setTranslationY(((iArr[1] - x3Var.getTop()) - AndroidUtilities.dp(120.0f)) + j1Var2.d);
                this.f40906x1.m(0.0f, (((ah.g1) j1Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + j1Var2.f793c);
                this.f40906x1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new ke(this, 19));
            AndroidUtilities.runOnUIThread(new ke(this, 19), 2000L);
        }
    }

    public final void c8(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.c8(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages c9(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f40911x6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void ca() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            fk fkVar = this.Y;
            if (fkVar == null || TextUtils.isEmpty(fkVar.getSlowModeTimer())) {
                fk fkVar2 = this.Y;
                if (fkVar2 != null && fkVar2.f23969i5.f17384f) {
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
                b3Var.f30562j0.f0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.f40697g5 == null) && !z10 && this.R3 != 9) {
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
                b3Var2.f30559i0 = true;
                b3Var2.J = null;
                org.telegram.ui.ActionBar.u0 u0Var = b3Var2.f30574n1;
                if (u0Var != null) {
                    b3Var2.f30570m1.setTranslationY(0.0f);
                    u0Var.setVisibility(8);
                }
                this.J1.t1();
                this.J1.o1().setText(this.Y.getFieldText());
                ci.b3 b3Var3 = this.J1;
                b3Var3.f30585r = this.f40677ea;
                showDialog(b3Var3);
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ke keVar;
        if ((this.R3 != 5 || (!this.f40872u6.isEmpty() && this.f40660d4 != 0)) && !this.zc.f17384f && this.f40787n9) {
            fk fkVar = this.Y;
            if (!fkVar.F2) {
                if (!fkVar.f23928c1 || (keVar = fkVar.f23940e1) == null || keVar.getVisibility() != 0) {
                    if ((!fkVar.h0() || !fkVar.f23982l0.v) && !org.telegram.ui.ActionBar.n2.hasSheets(fkVar.P2) && this.N9 == 0.0f) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.cb(java.lang.CharSequence, boolean):void");
    }

    public final void cc(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            ah.f0 f0Var = this.Y9;
            if (f0Var != null && f0Var.d()) {
                this.Y9.setHiddenByScroll(true);
            }
            if (this.f40728j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21501n0) {
                    kVar.h(true);
                    this.Y.b1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                ki.d2 d2Var = new ki.d2(richMessage);
                d2Var.J = this;
                d2Var.f15217r = messageObject;
                presentFragment(d2Var);
                return;
            }
            this.I1.getAdapter().f11926f0 = false;
            this.Y.setVisibility(0);
            Db(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            mc(false);
            if (!z10) {
                Q6();
            }
            if (z10) {
                this.f40697g5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.S0(false, false, true);
            Dc(0, true);
            bd(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.R3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.T5);
                tL_messages_getMessageEditData.f20372id = messageObject.getId();
                this.f40796o5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new ne(this, 3));
                return;
            }
            fk fkVar = this.Y;
            org.telegram.ui.Components.xe xeVar = fkVar.F1;
            if (xeVar != null) {
                xeVar.setEnabled(true);
                fkVar.F1.h(false);
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.createView(android.content.Context):android.view.View");
    }

    @Override
    public final long d() {
        int i10;
        if (!this.f40709h4 && (i10 = this.R3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f40660d4;
    }

    public final void d7(boolean z10) {
        int i10;
        if (this.f40930z0 != null && !this.f40818q5 && !this.A0.L && !this.f7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f40905x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f40905x0.getChildAt(i14));
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
            dm dmVar = this.A0;
            if (dmVar.N) {
                int i15 = dmVar.E;
                if (i15 >= 0 && i13 >= 0 && i15 >= i13 && i15 <= i12) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = dmVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            int i16 = i10;
            if (this.R3 == 7) {
                if ((h - i13) - i11 <= i16 && !this.G6 && !this.C6[0]) {
                    this.G6 = true;
                    this.f40711h6.add(Integer.valueOf(this.V5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f40869u3;
                    int i17 = this.classGuid;
                    int i18 = this.O3;
                    int i19 = this.V5;
                    this.V5 = i19 + 1;
                    hashtagSearchController.searchHashtag(str, i17, i18, i19);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.gf(this, h, i13, i11, i16, 1));
        }
    }

    public final void d8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.d8(int, java.lang.Object[]):void");
    }

    public final void d9(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.R3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f40881v3;
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
        mediaDataController.searchMessagesInChat(null, j10, j11, i14, i10, this.f40660d4, this.f40794o3, this.f40805p3, this.f40816q3);
        Qb(false);
    }

    public final void da() {
        et.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        H7();
        this.J1.f30562j0.f0();
        this.J1.N1(1, false);
        ci.b3 b3Var = this.J1;
        b3Var.X1 = true;
        b3Var.k1(null);
        this.J1.t1();
        ci.b3 b3Var2 = this.J1;
        b3Var2.f30585r = this.f40677ea;
        if (this.visibleDialog != null) {
            b3Var2.show();
        } else {
            showDialog(b3Var2);
        }
    }

    public final void db(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f40794o3 = user;
        this.f40805p3 = chat;
        if (this.f40728j0 != null && this.I1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f40794o3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f40781n3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a1.g.C(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.h6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f40728j0.setSearchFieldCaption(spannableString);
                    this.I1.getAdapter().U(null, 0, null, false, true);
                    this.f40728j0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.u0 u0Var = this.f40728j0;
                    u0Var.f21755r = null;
                    ei.e2 e2Var = u0Var.e;
                    if (e2Var != null) {
                        e2Var.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f40856t3 = "";
                    mediaDataController.searchMessagesInChat("", this.T5, this.L6, this.classGuid, 0, this.f40660d4, this.f40794o3, this.f40805p3, this.f40816q3);
                }
            }
        }
    }

    public final void dc() {
        org.telegram.ui.Components.z00 z00Var = this.f40773m9;
        if (z00Var != null && !z00Var.f32797c) {
            z00Var.c(false);
            try {
                this.f40773m9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.d5 d5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        TLRPC.User user;
        boolean z10;
        hj hjVar;
        fk fkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.iu editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.qy0 qy0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        fk fkVar2;
        qn qnVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            qnVar.f8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            nj njVar = qnVar.f40905x0;
            if (njVar != null) {
                njVar.f1();
            }
            org.telegram.ui.Components.si siVar = qnVar.M9;
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
            int i13 = 0;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == qnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        qnVar.finishFragment();
                        b.b(qnVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ci.b3 b3Var = qnVar.J1;
                if (b3Var != null && b3Var.isShowing()) {
                    qnVar.J1.dismiss(true);
                }
                if (z11 && (fkVar2 = qnVar.Y) != null && fkVar2.r0()) {
                    qnVar.Y.k0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f20300id = stickerSet2.f20307id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = qnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.qy0) && (tL_messages_stickerSet = (qy0Var = (org.telegram.ui.Components.qy0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f20307id == stickerSet2.f20307id) {
                            qy0Var.E0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.xc xcVar = new org.telegram.ui.Components.xc(qy0Var.container, qnVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.qc q6 = xcVar.q(document, LocaleController.formatString(i12, stickerSet2.title));
                                    q6.f29535j = 2750;
                                    q6.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.qy0 qy0Var2 = new org.telegram.ui.Components.qy0(qnVar.getParentActivity(), qnVar, tL_inputStickerSetID, null, qnVar.Y, qnVar.f40677ea);
                            final boolean z15 = z12;
                            qnVar = this;
                            qy0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    qn.T0(qn.this, objArr, qy0Var2, z15, stickerSet2);
                                }
                            });
                            qnVar.showDialog(qy0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                nj njVar2 = qnVar.f40905x0;
                if (njVar2 != null) {
                    njVar2.f1();
                }
                TextView textView = qnVar.Q2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i14 = 0; i14 < 2; i14++) {
                    org.telegram.ui.ActionBar.j5 j5Var = qnVar.D2[i14];
                    if (j5Var != null) {
                        j5Var.invalidate();
                    }
                }
                xj xjVar = qnVar.I1;
                if (xjVar != null) {
                    xjVar.getListView().f1();
                }
                ai.u1 u1Var = qnVar.L3;
                if (u1Var != null) {
                    u1Var.f1();
                }
                UndoView undoView = qnVar.y3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                fk fkVar3 = qnVar.Y;
                if (fkVar3 != null && (editField = fkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                ai.vd[] vdVarArr = qnVar.E2;
                ai.vd vdVar = vdVarArr[0];
                if (vdVar != null) {
                    vdVar.invalidate();
                }
                ai.vd vdVar2 = vdVarArr[1];
                if (vdVar2 != null) {
                    vdVar2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (qnVar.Z7 != null && (chat = qnVar.e) != null && chat.f20280id == l4.longValue()) {
                    qnVar.Z7.online_count = ((Integer) objArr[1]).intValue();
                    hj hjVar2 = qnVar.f40617a1;
                    if (hjVar2 != null) {
                        hjVar2.m();
                        qnVar.f40617a1.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == qnVar.T5 && (fkVar = qnVar.Y) != null) {
                    fkVar.N1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                fk fkVar4 = qnVar.Y;
                if (fkVar4 != null) {
                    fkVar4.O1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (qnVar.e != null) {
                        TLRPC.Chat chat2 = qnVar.getMessagesController().getChat(Long.valueOf(qnVar.e.f20280id));
                        if (chat2 != null) {
                            qnVar.e = chat2;
                        }
                    } else if (qnVar.f40680f != null && (user = qnVar.getMessagesController().getUser(Long.valueOf(qnVar.f40680f.f20427id))) != null) {
                        qnVar.f40680f = user;
                    }
                    qnVar.Sc(true);
                }
                if (!qnVar.K9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (qnVar.e != null && (hjVar = qnVar.f40617a1) != null) {
                        hjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    qnVar.p();
                    qnVar.bd(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && qnVar.e != null) {
                    qnVar.D9();
                    TLRPC.Chat chat3 = qnVar.getMessagesController().getChat(Long.valueOf(qnVar.e.f20280id));
                    if (chat3 != null) {
                        qnVar.e = chat3;
                        qnVar.D9();
                        z10 = !qnVar.K9();
                        qnVar.mc(false);
                        fk fkVar5 = qnVar.Y;
                        if (fkVar5 != null) {
                            fkVar5.Y0(qnVar.currentAccount, qnVar.T5);
                        }
                        FlagSecureReason flagSecureReason = qnVar.E3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                hj hjVar3 = qnVar.f40617a1;
                if (hjVar3 != null && z10) {
                    hjVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    qnVar.Vc(true);
                }
                org.telegram.ui.ActionBar.u0 u0Var = qnVar.f40705h0;
                if (u0Var != null) {
                    if (ChatObject.isChannel(qnVar.e) && !ChatObject.isMonoForum(qnVar.e)) {
                        long j11 = qnVar.e.linked_monoforum_id;
                        if (j11 != 0 && ChatObject.canManageMonoForum(qnVar.currentAccount, -j11)) {
                            z13 = true;
                        }
                    }
                    u0Var.I(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!qnVar.Pa) {
                    if (longValue == qnVar.T5) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i15 = qnVar.R3;
                        if (intValue2 != i15 && i15 != 3 && i15 != 8) {
                            if (i15 != 1 && intValue2 == 1 && !qnVar.isPaused && LaunchActivity.U() == qnVar && qnVar.f40686f5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                qnVar.oa(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !qnVar.f40838rc && qnVar.f40680f != null && qnVar.a() != qnVar.getUserConfig().getClientUserId() && (userFull = qnVar.getMessagesController().getUserFull(qnVar.f40680f.f20427id)) != null && userFull.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i13 >= size) {
                                        break;
                                    }
                                    MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                                    if (messageObject3.getId() > 0 && !messageObject3.isOut() && !messageObject3.isSponsored()) {
                                        qnVar.f40838rc = true;
                                        qnVar.getMessagesController().loadFullUser(qnVar.f40680f, qnVar.classGuid, true);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            qnVar.Da(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(qnVar.e) && !qnVar.e.megagroup && (chatFull = qnVar.Z7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            MessageObject messageObject4 = (MessageObject) arrayList.get(i16);
                            if (messageObject4.isReply()) {
                                qnVar.f40884v6.put(messageObject4.getId(), messageObject4);
                            }
                        }
                        qnVar.z7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                qnVar.N9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                qnVar.w6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == qnVar.T5) {
                        qnVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (d5Var = qnVar.parentLayout) != null && d5Var.getFragmentStack().size() > 1) {
                    qnVar.finishFragment();
                } else {
                    qnVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == qnVar.a() && (booleanValue2 || qnVar.parentLayout.getLastFragment() != qnVar)) {
                    if (qnVar.parentLayout.getLastFragment() == qnVar) {
                        qnVar.finishFragment();
                    } else {
                        qnVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i17 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = qnVar.f40797o6;
                if (i10 == i17) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = qnVar.e;
                    if (chat4 != null && chat4.f20280id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (qnVar.f40818q5) {
                            qh qhVar = qnVar.f40782n4;
                            if (qhVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(qhVar);
                                qnVar.f40782n4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            qh qhVar2 = new qh(qnVar, messageObject2, intValue3);
                            qnVar.f40782n4 = qhVar2;
                            AndroidUtilities.runOnUIThread(qhVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = qnVar.e;
                    if (chat5 != null && chat5.f20280id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = qnVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(qnVar.e, qnVar.getMessagesController().getChatFull(qnVar.e.f20280id)));
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
                    if ((i10 == i19 || i10 == NotificationCenter.monoForumMessagesRead) && qnVar.T5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i19) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = qnVar.f40660d4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i20 = qnVar.f40745k4;
                            ArrayList arrayList2 = qnVar.f40872u6;
                            if (intValue4 > i20) {
                                qnVar.f40745k4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id3 = messageObject5.getId();
                                    if (!messageObject5.isOut() && id3 > 0 && id3 <= qnVar.f40745k4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        dm dmVar = qnVar.A0;
                                        if (dmVar != null) {
                                            dmVar.M(messageObject5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > qnVar.l4) {
                                qnVar.l4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i22 = 0; i22 < size5; i22++) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i22);
                                    int id4 = messageObject6.getId();
                                    if (messageObject6.isOut() && id4 > 0 && id4 <= qnVar.l4) {
                                        if (!messageObject6.isUnread()) {
                                            break;
                                        }
                                        messageObject6.setIsRead();
                                        dm dmVar2 = qnVar.A0;
                                        if (dmVar2 != null) {
                                            dmVar2.R(messageObject6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        qnVar.a8(i10, objArr);
        qnVar.b8(i10, objArr);
        qnVar.c8(i10, objArr);
        qnVar.d8(i10, objArr);
        qnVar.e8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ci.b3 b3Var = this.J1;
        if (b3Var != null && this.visibleDialog == b3Var) {
            b3Var.f30562j0.a0(false);
            this.J1.dismissInternal();
            this.J1.f30562j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.J1 && dialog != this.f40639ba && !(dialog instanceof gi.d3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f40834r8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f40834r8 = true;
            org.telegram.ui.Components.f5.r0(getParentActivity(), this.currentAccount, new ke(this, 10), true, this.f40677ea);
        }
    }

    public final void e8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.e8(int, java.lang.Object[]):void");
    }

    public final void e9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.e9():void");
    }

    public final void ea(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.u1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.ea(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.u1, org.telegram.messenger.MessageObject):void");
    }

    public final void eb(View view, MessageObject messageObject, org.telegram.ui.Components.dl0 dl0Var, View view2, float f7, float f10, ah.i1 i1Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
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
            if (i1Var != null && i1Var.f780a) {
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
                    long j10 = -ai.aa.b(messageObject).f979a;
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
                    ai.fa faVar = ai.ga.y(this.currentAccount, false).B;
                    if (faVar != null) {
                        faVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j11 = this.T5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    ai.le leVar = new ai.le(parentActivity, i15, j11, this, messageObject, arrayList2, z14, false, 0L, this.f40677ea);
                    messageObject.getId();
                    leVar.U = this;
                    leVar.V = a0Var;
                    leVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -ai.aa.b(messageObject).f979a;
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
                ai.fa d02 = ai.ga.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.f40824qc == null) {
                        this.f40824qc = new ai.q7(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        q7Var = null;
                    } else {
                        if (this.f40824qc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.f40824qc);
                            layoutContainer.addView(this.f40824qc, w7.z5.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.f40824qc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.f40824qc.bringToFront();
                        }
                        q7Var = this.f40824qc;
                    }
                    q7Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f1316o = q7Var;
                    q7Var.I = false;
                    q7Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    q7Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (a0Var instanceof org.telegram.ui.Cells.u1) {
                        i12 = ((org.telegram.ui.Cells.u1) a0Var).V;
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
                new sg.y0((org.telegram.ui.ActionBar.n2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(i1Var) && (chat = this.e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.e, 26)) {
                org.telegram.messenger.g0.q(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.xc.a0(this), R.raw.e_hand_2, 36);
            } else {
                ah.d1.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(i1Var, z11, z10);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.h hVar = this.f40911x6;
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
                        long j13 = i1Var.f784g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(i1Var.f783f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.r5.f(this.currentAccount, j13);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.qc q6 = org.telegram.ui.Components.xc.a0(this).q(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            q6.f29535j = 5000;
                            q6.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (dl0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        ah.d1.d(this, dl0Var, t82, view2, f7, f10, i1Var, i19, i10);
                    }
                }
                if (selectReaction && i1Var != null && (str = i1Var.f783f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<ah.i1> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    i1Var2 = i1Var;
                }
                ni niVar = new ni(this, z13, z10, i18, selectReaction, dl0Var, f7, f10, i1Var, messageObject);
                this.f40655cc = niVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, i1Var2, z11, z12, this, niVar);
                if (z10 || z13) {
                    vc(messageObject, true);
                    this.f40655cc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f40655cc, 50L);
                }
            }
        }
    }

    public final void ec() {
        long j10;
        ke keVar = this.U7;
        if (keVar != null) {
            AndroidUtilities.cancelRunOnUIThread(keVar);
        }
        ke keVar2 = new ke(this, 18);
        this.U7 = keVar2;
        if (this.P7 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(keVar2, j10);
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        fk fkVar = this.Y;
        if (fkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.T5, (int) d());
            ne.b bVar = fkVar.f23963h5;
            ai.i7 i7Var = fkVar.I0;
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
            ((ne.b) i7Var.f1494c).a(z12, z13);
            i7Var.setClickable(z12);
            i7Var.setEnabled(z12);
            if (bVar.f17384f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            fkVar.T4 = streamingSendButtonState;
            if (z14) {
                fkVar.I(z10);
            }
        }
    }

    public final void f8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.f8(java.lang.Object[]):void");
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
            FileLog.d("getDiscussionMessage chat = " + chat.f20280id + " msg_id = " + i13);
        }
        this.f40727ic = 0;
        this.f40740jc = false;
        this.f40764lc = null;
        this.f40776mc = null;
        nj njVar = this.f40905x0;
        if (njVar != null) {
            njVar.f1();
        }
        if (this.hc != -1) {
            getConnectionsManager().cancelRequest(this.hc, false);
        }
        if (this.f40704gc != -1) {
            getConnectionsManager().cancelRequest(this.f40704gc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f40727ic = i13;
        this.f40740jc = false;
        this.f40753kc = System.currentTimeMillis();
        nj njVar2 = this.f40905x0;
        if (njVar2 != null) {
            njVar2.f1();
        }
        final int i14 = this.f40679ec + 1;
        this.f40679ec = i14;
        this.f40704gc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                qn qnVar = qn.this;
                AndroidUtilities.runOnUIThread(new i0(29, qnVar, new Runnable(i14, i11, j11, tLObject, i12, messageObject2, tL_messages_getDiscussionMessage, chat, messageObject) {
                    public final int f35980b;
                    public final int f35981c;
                    public final TLObject d;
                    public final int e;
                    public final MessageObject f35982f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f35983n;
                    public final MessageObject f35984r;

                    {
                        this.d = tLObject;
                        this.e = r7;
                        this.f35982f = r8;
                        this.h = r9;
                        this.f35983n = r10;
                        this.f35984r = r11;
                    }

                    @Override
                    public final void run() {
                        int i15;
                        final qn qnVar2 = qn.this;
                        if (this.f35980b != qnVar2.f40679ec) {
                            return;
                        }
                        qnVar2.f40704gc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            qnVar2.f40764lc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            qnVar2.getMessagesController().putUsers(qnVar2.f40764lc.users, false);
                            qnVar2.getMessagesController().putChats(qnVar2.f40764lc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = qnVar2.f40764lc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i16 = 0; i16 < qnVar2.f40764lc.messages.size(); i16++) {
                                TLRPC.Message message = qnVar2.f40764lc.messages.get(i16);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i17 = this.f35981c;
                        final int i18 = this.e;
                        final MessageObject messageObject3 = this.f35982f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = this.h;
                        final TLRPC.Chat chat2 = this.f35983n;
                        final MessageObject messageObject4 = this.f35984r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = qnVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f20301id;
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
                            final int i19 = qnVar2.fc + 1;
                            qnVar2.fc = i19;
                            qnVar2.hc = qnVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new jh(qn.this, i19, tLObject3, tL_error2, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4, 0));
                                }
                            });
                            return;
                        }
                        qnVar2.Ca(qnVar2.f40764lc, qnVar2.f40776mc, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f40704gc, this.classGuid);
    }

    public final void fb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f20286id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.T5, this.f40783n5, this.X3, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = H8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        B6();
    }

    public final void fc() {
        AndroidUtilities.forEachViews((RecyclerView) this.f40905x0, (Utilities.Callback<View>) new ai.y8(5, this, y9()));
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.g7():void");
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.T5, this.f40783n5, this.X3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = H8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.T5, this.f40783n5, this.X3, null, this.f40757l5, z10, i10, 0, H8(), 0L, S8());
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
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f40783n5, this.X3, null, this.f40757l5, false, true, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f40697g5);
                B6();
                if (i10 != 0) {
                    if (this.S3 == -1) {
                        this.S3 = 0;
                    }
                    this.S3 = arrayList.size() + this.S3;
                    Jc(true);
                }
            }
        }
    }

    public final boolean g9() {
        km kmVar = this.f40652c9;
        if (kmVar != null && kmVar.x()) {
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
            Bundle d = org.telegram.messenger.nk.d(3, "onlySelect", "dialogsType", true);
            d.putInt("messagesCount", this.f40649c6);
            d.putInt("hasPoll", i10);
            d.putBoolean("hasInvoice", z11);
            d.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(d);
            cyVar.C2 = this;
            presentFragment(cyVar);
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
            if (this.f40743k2 == null) {
                jm jmVar = this.X0;
                int indexOfChild = jmVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.r40 r40Var = new org.telegram.ui.Components.r40(7, getParentActivity(), null, true);
                    this.f40743k2 = r40Var;
                    jmVar.addView(r40Var, indexOfChild + 1, w7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f40743k2.setAlpha(0.0f);
                    this.f40743k2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f40743k2.setText(string);
            this.f40743k2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f40755l2 == null) {
            jm jmVar2 = this.X0;
            int indexOfChild2 = jmVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.r40 r40Var2 = new org.telegram.ui.Components.r40(getParentActivity(), 9);
            this.f40755l2 = r40Var2;
            jmVar2.addView(r40Var2, indexOfChild2 + 1, w7.z5.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f40755l2.setAlpha(0.0f);
            this.f40755l2.setVisibility(4);
        }
        this.f40755l2.setText(string);
        this.f40755l2.f(this.P0.getForwardButton(), true);
    }

    public final void gb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j10) {
        long j11;
        String str;
        xj xjVar = this.I1;
        if (xjVar == null) {
            return;
        }
        TLRPC.User user = xjVar.getAdapter().f11946w0;
        if (user != null) {
            j11 = user.f20427id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f20278id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.I1.getAdapter().f11946w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.T5, this.f40783n5, this.X3, null, this.f40757l5, z10, i10, 0, H8(), j10, S8());
        this.Y.setFieldText("");
        j9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void gc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.T5, d())) {
            if (z10) {
                getNotificationsController().muteDialog(this.T5, d(), true);
                return;
            }
            org.telegram.ui.ActionBar.f3 E = org.telegram.ui.Components.f5.E(this.T5, d(), this, this.f40677ea);
            E.setCalcMandatoryInsets(C9());
            showDialog(E);
            return;
        }
        getNotificationsController().muteDialog(this.T5, d(), false);
        if (!z10) {
            org.telegram.ui.Components.xc.z(this, 4, 0, this.f40677ea).j();
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.z4 getBackButtonState() {
        return org.telegram.ui.ActionBar.z4.f21920a;
    }

    @Override
    public final org.telegram.ui.ActionBar.z3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.z3.f21919c;
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
            ArrayList arrayList = this.f40872u6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + F8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.d6 getResourceProvider() {
        return this.f40677ea;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        int i11;
        int i12;
        if (this.e7) {
            return null;
        }
        if (this.f40625aa) {
            this.f40625aa = false;
            return null;
        }
        e eVar = new e(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Qd));
        if (!F9()) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.h6.f21329v8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.h6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i13 = org.telegram.ui.ActionBar.h6.f21384y8;
            arrayList.add(new org.telegram.ui.ActionBar.j6(kVar, 64, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21401z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 128, null, null, null, null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1024, null, null, null, null, i13));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, Integer.MIN_VALUE, null, null, null, eVar, org.telegram.ui.ActionBar.h6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741824, null, null, null, eVar, org.telegram.ui.ActionBar.h6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1073741832, null, null, null, eVar, org.telegram.ui.ActionBar.h6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 32768, null, null, null, null, org.telegram.ui.ActionBar.h6.f21273s8));
        hj hjVar = this.f40617a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hjVar != null ? hjVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.A8));
        hj hjVar2 = this.f40617a1;
        org.telegram.ui.ActionBar.j5 titleTextView = hjVar2 != null ? hjVar2.getTitleTextView() : null;
        int i14 = org.telegram.ui.ActionBar.h6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(titleTextView, 8, null, null, null, null, i14));
        hj hjVar3 = this.f40617a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hjVar3 != null ? hjVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.h6.f20971c2, org.telegram.ui.ActionBar.h6.f20990d2}, org.telegram.ui.ActionBar.h6.f21217pa));
        hj hjVar4 = this.f40617a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hjVar4 != null ? hjVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.h6.f21292t8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.h6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i15 = org.telegram.ui.ActionBar.h6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar2, 67108864, null, null, null, null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 67108864, null, null, null, null, i15));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i16 = org.telegram.ui.ActionBar.h6.f21384y8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(kVar3, 512, null, null, null, null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.h6.f21348w8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.h6.f21366x8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.h6.f21401z8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40630b1, 4, null, null, null, null, i16));
        hj hjVar5 = this.f40617a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hjVar5 != null ? hjVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21119k4}, null, org.telegram.ui.ActionBar.h6.oc));
        hj hjVar6 = this.f40617a1;
        arrayList.add(new org.telegram.ui.ActionBar.j6(hjVar6 != null ? hjVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.l4}, null, org.telegram.ui.ActionBar.h6.f21219pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.f21245r0, null, org.telegram.ui.ActionBar.h6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21085i8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21103j8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21123k8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21140l8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21159m8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21179n8));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21199o8));
        org.telegram.ui.ActionBar.f5 f5Var = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.f5 f5Var2 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.f5 f5Var3 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.f5 f5Var4 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.f5 f5Var5 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.f5 f5Var6 = (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{f5Var, f5Var2}, null, org.telegram.ui.ActionBar.h6.f21255ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.f5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.h6.f20999dc));
        if (f5Var != null) {
            Drawable[] k10 = f5Var.k();
            int i17 = org.telegram.ui.ActionBar.h6.f21294ta;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k10, null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, f5Var2.k(), null, i17));
            Drawable[] k11 = f5Var3.k();
            int i18 = org.telegram.ui.ActionBar.h6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, k11, null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, f5Var4.k(), null, i18));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Aa));
        if (this.f40677ea.i(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{f5Var3, f5Var4}, null, org.telegram.ui.ActionBar.h6.Fa));
        }
        nj njVar = this.f40905x0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = f5Var5;
        drawableArr[i10] = f5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(njVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.h6.Ba));
        nj njVar2 = this.f40905x0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.u1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = f5Var5;
        drawableArr2[i10] = f5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(njVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.h6.f20961bc));
        nj njVar3 = this.f40905x0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.w0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i19 = org.telegram.ui.ActionBar.h6.f21088ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(njVar3, 4, clsArr3, themedPaint, null, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 2, new Class[]{org.telegram.ui.Cells.w0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.h6.f21107jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21344w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.h6.f21127kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21144lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.w0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21163mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21016ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 2, new Class[]{org.telegram.ui.Cells.u1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.f21053gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 2, new Class[]{org.telegram.ui.Cells.u1.class}, (Paint[]) null, org.telegram.ui.ActionBar.h6.hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.h6.f21063h3};
        int i20 = org.telegram.ui.ActionBar.h6.f21128kd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr3, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.h6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.h6.La));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.h6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21237qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21257rc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.F3, org.telegram.ui.ActionBar.h6.G3}, null, org.telegram.ui.ActionBar.h6.f21277sc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21296tc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.h6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.h6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.M3, org.telegram.ui.ActionBar.h6.Q3, org.telegram.ui.ActionBar.h6.U3}, null, org.telegram.ui.ActionBar.h6.f21370xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.N3, org.telegram.ui.ActionBar.h6.R3, org.telegram.ui.ActionBar.h6.V3}, null, org.telegram.ui.ActionBar.h6.yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20933a4, org.telegram.ui.ActionBar.h6.f20953b4, org.telegram.ui.ActionBar.h6.Z3}, null, org.telegram.ui.ActionBar.h6.zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.h6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.h6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20973c4}, null, org.telegram.ui.ActionBar.h6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20992d4}, null, org.telegram.ui.ActionBar.h6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21045g4}, null, org.telegram.ui.ActionBar.h6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i21 = org.telegram.ui.ActionBar.h6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr4, null, i21));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.h6.f21064h4, org.telegram.ui.ActionBar.h6.B4, org.telegram.ui.ActionBar.h6.D4};
        int i22 = org.telegram.ui.ActionBar.h6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, drawableArr5, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.G4, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, org.telegram.ui.ActionBar.h6.H4, null, org.telegram.ui.ActionBar.h6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.O4}, null, org.telegram.ui.ActionBar.h6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.P4}, null, org.telegram.ui.ActionBar.h6.f21252r7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.Q4}, null, org.telegram.ui.ActionBar.h6.f21235qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.f20951b2, null, null, org.telegram.ui.ActionBar.h6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21099j4}, null, org.telegram.ui.ActionBar.h6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, eVar, org.telegram.ui.ActionBar.h6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.J2, null, null, org.telegram.ui.ActionBar.h6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.K2, null, null, org.telegram.ui.ActionBar.h6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.T1, null, null, org.telegram.ui.ActionBar.h6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.h6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.h6.f21351wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Rc));
        int i23 = org.telegram.ui.ActionBar.h6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i23));
        int i24 = org.telegram.ui.ActionBar.h6.f20940ab;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20980cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21015eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20942ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21034fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20962bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20982cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21052gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21070hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21017ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21087ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21035fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21054gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21106jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21126kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21071hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21089id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21236qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21108jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21256rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21184nd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21276sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21202od));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21145ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21164md));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21218pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21182nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21220pd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21238qd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21143lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21162mb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21258rd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21295tb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21314ub));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21297td));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21332vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21316ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21350wb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21352wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21387yb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21371xd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21334vd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21404zb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21369xb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21388yd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21405zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.U1, null, null, org.telegram.ui.ActionBar.h6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.V1, null, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, org.telegram.ui.ActionBar.h6.W1, null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21090ie));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21315uc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21109je));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21333vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.h6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f21259re));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.h6.f21278se));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 32, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.h6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.h6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.h6.f21239qe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.h6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21014ea));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21033fa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21051ga));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, null, null, org.telegram.ui.ActionBar.h6.ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.h6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.h6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.h6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.h6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.h6.f21370xc));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 0, new Class[]{org.telegram.ui.Cells.u1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.h6.Ra));
        if (this.f40677ea.i(false)) {
            i11 = 2;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.h6.f21245r0, null, org.telegram.ui.ActionBar.h6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.f21340w0, null, null, org.telegram.ui.ActionBar.h6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.B0[0], org.telegram.ui.ActionBar.h6.B0[1], org.telegram.ui.ActionBar.h6.D0}, null, null, org.telegram.ui.ActionBar.h6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.h6.C0[0], org.telegram.ui.ActionBar.h6.C0[1], org.telegram.ui.ActionBar.h6.E0}, null, null, org.telegram.ui.ActionBar.h6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f20931a1}, null, org.telegram.ui.ActionBar.h6.f20938a9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21042g1, org.telegram.ui.ActionBar.h6.f21061h1}, null, org.telegram.ui.ActionBar.h6.f21104j9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.F0[1], null, null, org.telegram.ui.ActionBar.h6.f21086i9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.G0, null, null, org.telegram.ui.ActionBar.h6.f21160m9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21124k9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21200o9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.h6.H0, null, null, org.telegram.ui.ActionBar.h6.p9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.h6.I0, null, null, org.telegram.ui.ActionBar.h6.f21234q9));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.T0}, null, org.telegram.ui.ActionBar.h6.f21313u9));
            i11 = 2;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.L3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.h6.V0, org.telegram.ui.ActionBar.h6.W0}, null, org.telegram.ui.ActionBar.h6.f21330v9));
        }
        xj xjVar = this.I1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i25 = org.telegram.ui.ActionBar.h6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(xjVar, 0, null, themedPaint2, null, null, i25));
        xj xjVar2 = this.I1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.h6.f21080i3};
        int i26 = org.telegram.ui.ActionBar.h6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.j6(xjVar2, 0, null, null, drawableArr10, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21098j3}, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21080i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.R, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21080i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.f21080i3}, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        int i27 = org.telegram.ui.ActionBar.h6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i27));
        int i28 = org.telegram.ui.ActionBar.h6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i28));
        int i29 = org.telegram.ui.ActionBar.h6.f21083i6;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        int i30 = org.telegram.ui.ActionBar.h6.f21110jf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i27));
        int i31 = org.telegram.ui.ActionBar.h6.f20964bf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i31));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20943ae));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.h6.f20963be));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.h6.kf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21186nf));
        fk fkVar = this.Y;
        int i32 = org.telegram.ui.ActionBar.h6.f21166mf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, null, null, null, null, i32));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21204of));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20984cf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.h6.f20944af));
        int i33 = i11;
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21037ff));
        fk fkVar2 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar2 != null ? fkVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.He));
        fk fkVar3 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar3 != null ? fkVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ke));
        fk fkVar4 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar4 != null ? fkVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Le));
        fk fkVar5 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar5 != null ? fkVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Me));
        fk fkVar6 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar6 != null ? fkVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Oe));
        fk fkVar7 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar7 != null ? fkVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Pe));
        fk fkVar8 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar8 != null ? fkVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Re));
        fk fkVar9 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar9 != null ? fkVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Se));
        fk fkVar10 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar10 != null ? fkVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.We));
        fk fkVar11 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar11 != null ? fkVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ne));
        fk fkVar12 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar12 != null ? fkVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Je));
        fk fkVar13 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar13 != null ? fkVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Ue));
        fk fkVar14 = this.Y;
        arrayList.add(new org.telegram.ui.ActionBar.j6(fkVar14 != null ? fkVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.tz.class}, null, null, null, eVar, org.telegram.ui.ActionBar.h6.Qe));
        fk fkVar15 = this.Y;
        if (fkVar15 != null) {
            org.telegram.ui.Components.p51 trendingStickersAlert = fkVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, new Drawable[]{this.Y.getStickersArrowDrawable()}, null, i28));
        }
        int i34 = 0;
        while (i34 < i33) {
            View view = i34 == 0 ? this.y3 : this.f40933z3;
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
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f21328v7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21347w7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f21311u7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.f21291t7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.h6.f21365x7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.f21383y7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40932z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21018ee));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40932z2, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f20994d6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.F2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21036fe));
        for (int i37 = 0; i37 < i33; i37++) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.C2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21036fe));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.D2[i37], 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21055ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.P2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21036fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Q2, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21055ge));
        ImageView imageView = this.J2;
        int i38 = org.telegram.ui.ActionBar.h6.f21000de;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.L2, 8, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.U1, 8, null, null, null, null, i38));
        TextView textView = this.L1;
        int i39 = org.telegram.ui.ActionBar.h6.he;
        arrayList.add(new org.telegram.ui.ActionBar.j6(textView, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, org.telegram.ui.ActionBar.h6.f21232q7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.N1, 262148, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.H1, 8, null, null, null, null, org.telegram.ui.ActionBar.h6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21335ve));
        ImageView imageView2 = this.S2;
        int i40 = org.telegram.ui.ActionBar.h6.f21372xe;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView2, 8, null, null, null, null, i40));
        ImageView imageView3 = this.S2;
        int i41 = org.telegram.ui.ActionBar.h6.f21401z8;
        arrayList.add(new org.telegram.ui.ActionBar.j6(imageView3, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 8, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.T2, 65568, null, null, null, null, i41));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.E0, 4, null, null, null, null, org.telegram.ui.ActionBar.h6.f21406ze));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21299tf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.B0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.G0, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sh));
        org.telegram.ui.Components.po poVar = this.Y0;
        int i42 = org.telegram.ui.ActionBar.h6.f21088ic;
        arrayList.add(new org.telegram.ui.ActionBar.j6(poVar, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40631b2, 4, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40802p0, 2048, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 131072, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.h6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 8, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.h6.De));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40905x0, 4, new Class[]{org.telegram.ui.Cells.w1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ee));
        ei.g6 g6Var = this.Q;
        int i43 = org.telegram.ui.ActionBar.h6.f21144lc;
        arrayList.add(new org.telegram.ui.ActionBar.j6(g6Var, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40631b2, 536870912, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y0, 536870912, null, null, null, null, i43));
        if (this.I1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.h6.Ce));
            int i44 = org.telegram.ui.ActionBar.h6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"nameTextView"}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 4, new Class[]{org.telegram.ui.Cells.g5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.h6.A6));
            Drawable[] drawableArr11 = new Drawable[3];
            drawableArr11[0] = org.telegram.ui.ActionBar.h6.f21155m4;
            drawableArr11[1] = org.telegram.ui.ActionBar.h6.f21175n4;
            drawableArr11[i33] = org.telegram.ui.ActionBar.h6.f21195o4;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, drawableArr11, null, org.telegram.ui.ActionBar.h6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21399z6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, i44));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21089id));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f21108jd));
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.I1.getListView(), 0, new Class[]{org.telegram.ui.Cells.f2.class}, null, null, null, org.telegram.ui.ActionBar.h6.f20995d7));
        }
        org.telegram.ui.Components.r40 r40Var = this.f40670e2;
        int i45 = org.telegram.ui.ActionBar.h6.f21240qf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r40Var, 32, null, null, null, null, i45));
        org.telegram.ui.Components.r40 r40Var2 = this.f40670e2;
        int i46 = org.telegram.ui.ActionBar.h6.f21221pf;
        arrayList.add(new org.telegram.ui.ActionBar.j6(r40Var2, 4, null, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40855t2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40855t2, 8, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"imageView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40855t2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40868u2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"textView"}, null, null, null, i46));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.f40868u2, 4, new Class[]{org.telegram.ui.Components.r40.class}, new String[]{"arrowImageView"}, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.X2, 0, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.j6(this.Z2, 0, null, null, null, null, i43));
        int i47 = org.telegram.ui.ActionBar.h6.ia;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21105ja));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21125ka));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21142la));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21161ma));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21181na));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, i47));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21201oa));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.h6.R4}, null, org.telegram.ui.ActionBar.h6.f20998da));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21065h5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21082i5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21231q5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21121k6));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21318uf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21336vf));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20946ah));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20966bh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20986ch));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21003dh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21021eh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21038fh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21092ih));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21112jh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21131kh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21058gh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f21074hh));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.f20936a7));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.h6.Dj));
        int i48 = org.telegram.ui.ActionBar.h6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, null, i48));
        arrayList.add(new org.telegram.ui.ActionBar.j6(null, 0, null, null, null, eVar, org.telegram.ui.ActionBar.h6.f21373xf));
        fk fkVar16 = this.Y;
        if (fkVar16 == null || fkVar16.m0 == null) {
            i12 = 0;
        } else {
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f11534c, 4, new Class[]{gi.z.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.h6.G6));
            i12 = 0;
            arrayList.add(new org.telegram.ui.ActionBar.j6(this.Y.m0.f11534c, 4, new Class[]{gi.z.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.h6.f21382y6));
        }
        xh.d dVar = this.f40690fa;
        if (dVar != null) {
            dVar.b(arrayList);
        }
        int size = arrayList.size();
        int i49 = i12;
        while (i49 < size) {
            Object obj = arrayList.get(i49);
            i49++;
            ((org.telegram.ui.ActionBar.j6) obj).f21471o = this.f40677ea;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f40677ea.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint n10 = this.f40677ea.n(str);
        if (n10 != null) {
            return n10;
        }
        return org.telegram.ui.ActionBar.h6.T0(str);
    }

    public final boolean h7(View view) {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer != null) {
            Xb(view, slowModeTimer, true);
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
            if (kVar.t()) {
                this.Cc.h(5, false, true);
                this.actionBar.s();
            } else {
                return;
            }
        }
        this.f40621a6 = 0;
        this.f40662d6 = 0;
        this.f40635b6 = 0;
        this.f40687f6 = 0;
        this.f40698g6 = 0;
        this.f40674e6 = 0;
        fk fkVar = this.Y;
        if (fkVar != null && (editField = fkVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        km kmVar = this.f40652c9;
        if (kmVar != null) {
            kmVar.f(true);
            SparseArray sparseArray = this.f40652c9.f22736p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        il ilVar = this.f40714h9;
        if (ilVar != null) {
            AndroidUtilities.cancelRunOnUIThread(ilVar.H);
            ilVar.a();
        }
        fk fkVar2 = this.Y;
        if (fkVar2 != null) {
            fkVar2.f23914a0 = false;
        }
        this.f40725i9 = false;
        if (this.f40640bb != null) {
            p9();
        }
    }

    public final void ha(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f40686f5;
        if (messagePreviewParams != null && this.Fa == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.G5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f40783n5;
                if (messageObject2 == this.X3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f40757l5, this.p5);
            }
            if (!this.f40686f5.isEmpty()) {
                this.f40678eb = this.Y.f24058z2;
                Context context = this.X0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f40686f5;
                TLRPC.User user = this.f40680f;
                TLRPC.Chat chat = this.e;
                int i12 = this.currentAccount;
                on onVar = this.f40677ea;
                gn gnVar = this.f40757l5;
                if (gnVar != null && gnVar.f37365f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                al alVar = new al(this, context, this, this.A8, messagePreviewParams2, user, chat, i12, onVar, i10, z10);
                this.Fa = alVar;
                this.f40686f5.attach(alVar);
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
                if (this.f40678eb) {
                    fk fkVar = this.Y;
                    fkVar.T0 = true;
                    org.telegram.ui.Components.dg dgVar = fkVar.U0;
                    if (dgVar != null) {
                        dgVar.v(true);
                    }
                    this.Y.p1();
                    this.D3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void hb(ClipData clipData, boolean z10, int i10) {
        int i11 = 0;
        if (this.p5 != null) {
            while (i11 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i11).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    lb(i10, arrayList, z10);
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
        lb(i10, arrayList2, z10);
    }

    public final void hc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = this.A3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f40661d5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.Q4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.T5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.Q4 - 1), Boolean.valueOf(this.S4));
        this.A3 = org.telegram.ui.Components.xc.B(this, false, new ai.cb(this, arrayList2, arrayList, i10, 14), new se(this, messageObject, 7), this.f40677ea).j();
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
        return this.f40680f;
    }

    public final boolean i7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
        b2Var.R = string;
        b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void i8(View view, boolean z10) {
        boolean z11;
        tb(view);
        if (view != this.f40729j1) {
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
            Ja(this.f40661d5);
            La(this.f40661d5);
            return;
        }
        showDialog(new sg.y0((org.telegram.ui.ActionBar.n2) this, 3, true));
    }

    public final void ia(String str, boolean z10) {
        boolean z11;
        ck ckVar;
        boolean z12;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                P7();
                ei.x3 x3Var = this.f40879v1;
                if (x3Var != null && x3Var.V) {
                    x3Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                ei.x3 x3Var2 = this.f40893w1;
                if (x3Var2 != null && x3Var2.V) {
                    x3Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new re(this, str, 5), 200L);
                    return;
                }
                this.f40869u3 = str;
                this.f40856t3 = str;
                boolean contains = str.contains("@");
                U6(true);
                if (!this.actionBar.f21501n0) {
                    this.Ac.a(true, true);
                    org.telegram.ui.ActionBar.u0 u0Var2 = this.f40705h0;
                    if (u0Var2 != null) {
                        u0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f40668e0;
                    if (xVar != null) {
                        xVar.f(8);
                    }
                    ur urVar = this.f40656d0;
                    if (urVar != null) {
                        urVar.b(false);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f40716i0;
                    if (xVar2 != null) {
                        xVar2.f(8);
                    }
                    if ((this.f40660d4 == 0 || (i10 = this.R3) == 3 || i10 == 8) && (u0Var = this.f40728j0) != null) {
                        u0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
                    if (u0Var3 != null && this.K9) {
                        u0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar3 = this.f40778n0;
                    if (xVar3 != null && this.L9) {
                        xVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.u0 u0Var4 = this.f40741k0;
                    if (u0Var4 != null) {
                        u0Var4.setVisibility(8);
                    }
                    this.f40791o0 = true;
                    Kc(0, 0, -1);
                    mc(false);
                }
                qk qkVar = this.f40792o1;
                if (qkVar != null) {
                    if (qkVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        qkVar.g(false);
                    }
                }
                ImageView imageView = this.T2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.e) || !ChatObject.isPublic(this.e) || this.f40869u3 == null)) {
                    this.f40827r1 = 0;
                } else {
                    this.f40827r1 = 2;
                }
                this.W4 = false;
                if (this.O3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ei.h1 h1Var = this.f40814q1;
                if (h1Var != null) {
                    h1Var.h.clear();
                }
                org.telegram.ui.ActionBar.u0 u0Var5 = this.f40728j0;
                if (u0Var5 != null) {
                    this.f40667dc = true;
                    u0Var5.z(false);
                    this.f40667dc = false;
                }
                org.telegram.ui.ActionBar.u0 u0Var6 = this.f40728j0;
                if (u0Var6 != null) {
                    u0Var6.setSearchFieldCaption(null);
                    this.f40728j0.H(str, false);
                    this.f40728j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f40856t3, this.T5, this.L6, this.classGuid, 0, this.f40660d4, false, this.f40794o3, this.f40805p3, false, this.f40816q3);
                Dc(0, true);
                this.f40658d2.e(true, true);
                Qb(true);
                ck ckVar2 = this.f40803p1;
                if (ckVar2 != null) {
                    ckVar2.b(!contains);
                    Mc();
                }
                if ((contains || z10) && this.f40869u3 != null && (ckVar = this.f40803p1) != null) {
                    int currentPosition = ckVar.f25582a.getCurrentPosition();
                    int i11 = this.f40827r1;
                    if (currentPosition != i11) {
                        this.f40803p1.f25582a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f40869u3);
                this.f40854t1.f28386f.N(true);
                View currentView = this.f40814q1.getCurrentView();
                if (currentView instanceof sn) {
                    ((sn) currentView).f41500a.Oc(this.f40869u3);
                }
            }
        }
    }

    public final void ib(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        long j11;
        if (i7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.T5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = H8();
                of2.effect_id = j10;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = S8();
                of2.suggestionParams = this.f40697g5;
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
                of3.suggestionParams = this.f40697g5;
                getSendMessagesHelper().sendMessage(of3);
                j11 = 0;
            }
            B6();
        }
    }

    public final void ic() {
        boolean F9 = F9();
        SparseArray[] sparseArrayArr = this.W5;
        if (!F9) {
            if (this.actionBar.t() && this.f40630b1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f40630b1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
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
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (F9()) {
            org.telegram.ui.ActionBar.d6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.r(org.telegram.ui.ActionBar.h6.f21348w8);
            } else {
                x02 = org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21348w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
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
        if ((this.R3 != 5 || (!this.f40872u6.isEmpty() && this.f40660d4 != 0)) && !this.zc.f17384f && this.f40787n9) {
            al alVar = this.Fa;
            if (alVar == null || !alVar.f28996s) {
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
            ai.ga x10 = ai.ga.x(this.currentAccount, aVar.f631a);
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
        this.f40905x0.invalidate();
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
            ValueAnimator valueAnimator = this.f40641bc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.I8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.zm0.d(new we(this, 3));
            }
        } else {
            float f11 = this.H8;
            this.L8 = f11 / max;
            this.I8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new dg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f40729j1) != null) {
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
            tb(null);
        }
        this.P8.start();
    }

    public final void j9(boolean z10) {
        Eb(false, null, false, z10);
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
                    if (Lc == null) {
                        Lc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Mc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Lc.matcher(str);
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
                                    this.f40860t7 = true;
                                    if (this.R3 == 2) {
                                        this.V8.D0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f40925y7 = W;
                                    if (W >= 0) {
                                        this.f40937z7 = parseInt;
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
                        Matcher matcher2 = Mc.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f40700g8 = queryParameter2;
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
                    if (Nc == null) {
                        Nc = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = Nc.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.e.f20280id || parseInt3 == 0) {
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
                            TLRPC.TL_forumTopic tL_forumTopic = this.f40647c4;
                            if (tL_forumTopic != null && tL_forumTopic.f20332id == findTopic.f20332id) {
                                return true;
                            }
                            return false;
                        }
                        this.f40860t7 = true;
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
            long j10 = this.e.f20280id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                fa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f40860t7 = true;
            if (this.R3 == 2) {
                this.V8.D0(intValue9);
                finishFragment();
                return true;
            }
            bb(intValue9, i10, true, 0, false, 0, null, null, m4Var);
            return true;
        }
    }

    public final void jb(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.T5, this.f40783n5, this.X3, null, this.f40757l5, z11, true, null, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, H8(), 0L, false, 0L, S8(), this.f40697g5);
            B6();
            fk fkVar = this.Y;
            if (fkVar != null) {
                fkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Jc(true);
        }
    }

    public final void jc() {
        jm jmVar = this.X0;
        if (jmVar != null && this.f40653ca == null) {
            if (this.f40677ea.f39937n == null || jmVar.getBackgroundImage() == null) {
                if (this.X0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.X0.V(org.telegram.ui.ActionBar.h6.s0());
                }
            }
        }
    }

    public final void k7() {
        if (this.f40933z3 != null) {
            return;
        }
        bl blVar = new bl(this, getParentActivity(), this, this.f40677ea);
        this.f40933z3 = blVar;
        this.X0.addView(blVar, 17, w7.z5.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void k8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void k9(boolean z10) {
        if (this.X2.getTag() != null && !this.f40659d3) {
            if (!this.f40731j3 || this.f40684f3) {
                this.X2.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f40695g3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f40695g3.playTogether(ObjectAnimator.ofFloat(this.X2, View.ALPHA, 0.0f));
                    this.f40695g3.addListener(new oi(this, 6));
                    this.f40695g3.setStartDelay(this.f40618a3);
                    this.f40695g3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f40695g3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f40695g3 = null;
                    }
                    this.X2.setAlpha(0.0f);
                }
                this.f40618a3 = 500;
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
            presentFragment(new qn(bundle));
        }
    }

    public final se kb(MessageObject messageObject, boolean z10) {
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
        return new se(this, messageObject, 1);
    }

    public final void kc() {
        TLRPC.User user;
        boolean z10;
        if (this.f40705h0 != null && (user = this.f40680f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f40664d8;
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
                this.f40705h0.K(30);
            } else {
                this.f40705h0.r(30);
            }
            if (z10) {
                this.f40705h0.K(31);
            } else {
                this.f40705h0.r(31);
            }
        }
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
                of2.suggestionParams = this.f40697g5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.T5, false, false, true, 0, 0, null, -1, j11, S8(), this.f40697g5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.T5, this.f40783n5, this.X3, null, this.f40757l5, this.p5, z10, i10, 0, null, H8(), j10, z11, j11, S8(), this.f40697g5);
            B6();
        }
    }

    public final void l7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.Hb > 1000) {
            z10 = true;
        }
        kg kgVar = this.Ib;
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
        MessageObject messageObject = this.p5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void l9(boolean z10) {
        if (this.Y2.getTag() != null && !this.f40671e3) {
            if (!this.f40744k3 || this.f40684f3) {
                this.Y2.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f40719i3, 0.0f);
                    this.f40708h3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f40708h3.addUpdateListener(new me(this, 1));
                    this.f40708h3.addListener(new oi(this, 8));
                    this.f40708h3.setStartDelay(this.f40618a3);
                    this.f40708h3.start();
                } else {
                    ValueAnimator valueAnimator = this.f40708h3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f40708h3 = null;
                    }
                    this.f40719i3 = 0.0f;
                    qc();
                }
                this.f40618a3 = 500;
            }
        }
    }

    public final void la(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f40680f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f40680f.f20427id) {
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

    public final void lb(int i10, ArrayList arrayList, boolean z10) {
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
                        yb();
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
        SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), (ArrayList<String>) arrayList2, (ArrayList<String>) arrayList3, (ArrayList<Uri>) arrayList4, (String) null, (String) null, this.T5, this.f40783n5, this.X3, (TL_stories.StoryItem) null, this.f40757l5, this.p5, z10, i10, (t0.i) null, H8(), 0L, false, 0L);
        j9(false);
    }

    public final void lc() {
        if (this.R1 == null) {
            return;
        }
        this.R1.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.d());
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        o8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.T5, this.f40783n5, this.X3, null, this.f40757l5, true, false, this.p5, z10, i10, 0, this.R3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, H8(), 0L, false, j10, S8(), this.f40697g5);
        B6();
        if (i10 != 0) {
            if (this.S3 == -1) {
                this.S3 = 0;
            }
            this.S3 = arrayList.size() + this.S3;
            Jc(true);
        }
    }

    public final void m7() {
        int b92 = (int) (b9(org.telegram.ui.Components.n31.f28685c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(b92);
        int b10 = w7.r.b(AndroidUtilities.dp(36.0f) + (this.X0.getMeasuredHeight() - b92), 0, this.X0.getMeasuredHeight());
        int measuredWidth = this.X0.getMeasuredWidth();
        Rect rect = Qc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Aa, this.f40905x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f40905x0.getMeasuredHeight() - this.Ba) - b92));
    }

    public final void m8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f40697g5;
        if (messageSuggestionParams != null) {
            Ib(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.G5;
        if (webPage != null) {
            Eb(true, webPage, false, true);
            return;
        }
        gn gnVar = this.f40757l5;
        if (gnVar != null) {
            Hb(this.f40783n5, gnVar);
            return;
        }
        MessageObject messageObject = this.f40783n5;
        if (messageObject != null && messageObject != this.X3) {
            Gb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f40686f5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Fb(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.p5;
        if (messageObject2 != null) {
            Db(true, null, messageObject2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Eb(false, null, true, true);
        }
    }

    public final void m9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.r40 r40Var = this.f40766m2;
            if (r40Var != null) {
                r40Var.b(true);
            }
            aj ajVar = this.f40694g2;
            if (ajVar != null) {
                ajVar.b(true);
            }
            org.telegram.ui.Components.r40 r40Var2 = this.f40718i2;
            if (r40Var2 != null) {
                r40Var2.b(true);
            }
        }
        org.telegram.ui.Components.r40 r40Var3 = this.f40755l2;
        if (r40Var3 != null) {
            r40Var3.b(true);
        }
        org.telegram.ui.Components.r40 r40Var4 = this.f40743k2;
        if (r40Var4 != null) {
            r40Var4.b(true);
        }
        org.telegram.ui.Components.r40 r40Var5 = this.f40855t2;
        if (r40Var5 != null) {
            r40Var5.b(true);
        }
        org.telegram.ui.Components.r40 r40Var6 = this.f40868u2;
        if (r40Var6 != null) {
            r40Var6.b(true);
        }
        org.telegram.ui.Components.r40 r40Var7 = this.f40780n2;
        if (r40Var7 != null) {
            r40Var7.b(true);
        }
        org.telegram.ui.Components.r40 r40Var8 = this.f40793o2;
        if (r40Var8 != null) {
            r40Var8.b(true);
        }
        org.telegram.ui.Components.aq aqVar = this.f40880v2;
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
        org.telegram.ui.Cells.u1 u1Var2;
        boolean z10;
        long j10;
        long j11;
        org.telegram.ui.Components.e6 animation;
        Bitmap m10;
        if (u1Var == null) {
            int childCount = this.f40905x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f40905x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    u1Var2 = (org.telegram.ui.Cells.u1) childAt;
                    if (u1Var2.getMessageObject().equals(messageObject)) {
                        break;
                    }
                }
            }
        }
        u1Var2 = u1Var;
        if (messageObject.isVideo()) {
            kb(messageObject, true);
        }
        if (messageObject.isVideo() && !messageObject.hasVideoQualities() && SharedConfig.streamMedia && messageObject.canStreamVideo() && !DialogObject.isEncryptedDialog(messageObject.getDialogId()) && !messageObject.mediaExists && !messageObject.attachPathExists) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            getFileLoader().startVideoStream(messageObject.getDocument(), messageObject);
        }
        PhotoViewer.u1().M2(null, this, this.f40677ea);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (u1Var2 != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = u1Var2.getPhotoImage().getAnimation()) != null && this.f40900w8 != null && this.f40861t8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f40900w8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.R3;
        kl klVar = this.Ga;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.u1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f40872u6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.u1().d2(arrayList, arrayList.indexOf(messageObject), this.T5, 0L, d(), klVar);
        } else {
            PhotoViewer u12 = PhotoViewer.u1();
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
            if (!u12.h2(messageObject, this, j10, j11, j12, klVar) && z10) {
                getFileLoader().cancelLoadFile(messageObject.getDocument());
            }
        }
        m9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void mb(MessageObject messageObject, org.telegram.ui.Cells.u1 u1Var, int i10, boolean z10) {
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

    public final void mc(boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.mc(boolean):void");
    }

    @Override
    public final boolean n() {
        return this.f40835r9;
    }

    public final void n7() {
        int i10;
        if (this.f40617a1 != null) {
            float actionModeFactor = (1.0f - this.Ac.e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f40617a1.setScaleX(lerp);
            this.f40617a1.setScaleY(lerp);
            this.f40617a1.setAlpha(actionModeFactor);
            hj hjVar = this.f40617a1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            hjVar.setVisibility(i10);
        }
    }

    public final void n9() {
        ValueAnimator valueAnimator = this.f40703gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.w0 w0Var = this.Z2;
        if (w0Var != null && w0Var.getTag() != null) {
            this.Z2.setTag(null);
            org.telegram.ui.Cells.w0 w0Var2 = this.Z2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ef(this, w0Var2, 1));
            ofFloat.addListener(new ai.me(14, this, w0Var2));
            ofFloat.setDuration(150L);
            this.f40703gb = ofFloat;
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
                bundle.putLong("chat_id", chat.f20280id);
            } else {
                bundle.putLong("user_id", this.f40680f.f20427id);
            }
            bundle.putInt("chatMode", 2);
            qn qnVar = new qn(bundle);
            qnVar.H4 = new ArrayList(this.H4);
            qnVar.J4 = new HashMap(this.J4);
            int size = this.H4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.H4.get(i11);
                MessageObject messageObject = (MessageObject) this.J4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f40797o6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    qnVar.J4.put(num, messageObject);
                    qnVar.Ec();
                }
            }
            qnVar.P4 = this.P4;
            if (this.f40709h4) {
                i10 = this.H4.size();
            } else {
                i10 = this.Q4;
            }
            qnVar.Q4 = i10;
            qnVar.S4 = this.S4;
            qnVar.f40623a8 = this.f40623a8;
            qnVar.Z7 = this.Z7;
            qnVar.V8 = new fl(this, qnVar);
            if (z10) {
                presentFragmentAsPreview(qnVar);
                g7();
                return;
            }
            presentFragment(qnVar, false);
        }
    }

    public final void nb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f40677ea != null && this.f40653ca == null) {
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
                on onVar = this.f40677ea;
                TLRPC.WallPaper wallPaper = onVar.h;
                if (this.P5 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                onVar.k(c4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new pe(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.T5);
            on onVar2 = this.f40677ea;
            org.telegram.ui.ActionBar.c4 c4Var2 = onVar2.f39936f;
            if (this.P5 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            onVar2.k(c4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void nc() {
        mc(false);
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.R3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((n2Var instanceof qn) && ((qn) n2Var).C9()) {
                return false;
            }
        }
        return this.H6;
    }

    @Override
    public final org.telegram.ui.Components.oo o() {
        return this.f40617a1;
    }

    public final void o7() {
        boolean z10;
        ei.h1 h1Var;
        if (this.f40666da != null) {
            return;
        }
        int i10 = 0;
        if (this.zc.e >= 1.0f && ((h1Var = this.f40814q1) == null || h1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ai.ic icVar = this.X0.L;
        if (!z10) {
            i10 = 4;
        }
        icVar.setVisibility(i10);
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
                fk fkVar = this.Y;
                if (fkVar != null) {
                    this.p5.editingMessage = fkVar.getFieldText();
                    MessageObject messageObject3 = this.p5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.p5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final boolean o9(boolean z10) {
        cl clVar;
        cl clVar2 = this.f40907x2;
        if (clVar2 == null || clVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.ch chVar = this.M0;
        if (chVar != null && (clVar = this.f40907x2) != null) {
            chVar.i(clVar, false, z10);
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
                this.f40907x2.setTag(1);
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
                bundle.putInt("enc_id", encryptedChat.f20288id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f20280id);
                } else {
                    bundle.putLong("user_id", this.f40680f.f20427id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            qn qnVar = new qn(bundle);
            if (this.f40709h4) {
                og.d.a(qnVar, MessagesStorage.TopicKey.of(a(), d()));
            }
            qnVar.V8 = new jj(this);
            presentFragment(qnVar, false);
        }
    }

    public final void ob(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                ob(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f40905x0 && view != this.X0) {
            view.setEnabled(z10);
        }
    }

    public final void oc() {
        int i10;
        org.telegram.ui.Components.ub ubVar;
        rk rkVar;
        fk fkVar;
        if (this.D9 && this.f40905x0 != null) {
            float f7 = 0.0f;
            if (this.f40810pa <= 0 || this.Ea != 0.0f) {
                float a92 = a9(AndroidUtilities.dp(7.0f));
                qk qkVar = this.f40792o1;
                if (qkVar != null) {
                    i10 = AndroidUtilities.dp(qkVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float E8 = (E8() * AndroidUtilities.dp(43.0f)) + a92 + i10;
                float f10 = this.f40849s9;
                this.f40862t9 = E8;
                this.f40849s9 = b9(org.telegram.ui.Components.n31.f28683a) + AndroidUtilities.dp(4.0f) + this.f40887v9 + E8;
                if (this.actionBar.getVisibility() == 0 || this.f40666da != null) {
                    this.f40849s9 += this.actionBar.getMeasuredHeight();
                }
                this.f40875u9 = 0;
                this.f40849s9 = this.f40849s9 + this.Aa + this.w9;
                if (this.Ea != 0.0f && (fkVar = this.Y) != null && fkVar.getVisibility() == 0) {
                    float f11 = this.f40849s9;
                    float measuredHeight = this.Ea * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f40849s9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.w0 w0Var = this.Z2;
                if (w0Var != null) {
                    w0Var.setTranslationY(((this.f40905x0.getTranslationY() + this.f40849s9) + this.A9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.f40849s9;
                    float f13 = this.A9;
                    this.f40849s9 = f12 + f13;
                    this.f40875u9 = (int) (this.f40875u9 + f13);
                }
                wj wjVar = this.X2;
                if (wjVar != null) {
                    wjVar.setTranslationY((((this.f40905x0.getTranslationY() - f7) + this.f40849s9) + this.f40927y9) - AndroidUtilities.dp(4.0f));
                }
                qc();
                nj njVar = this.f40905x0;
                if (njVar != null && this.f40930z0 != null && this.A0 != null) {
                    int paddingTop = njVar.getPaddingTop();
                    int paddingBottom = this.f40905x0.getPaddingBottom();
                    q7();
                    if (this.f40905x0.getPaddingTop() != paddingTop || this.f40905x0.getPaddingBottom() != paddingBottom) {
                        w9();
                        v9(2);
                    }
                    this.f40905x0.setTopGlowOffset((int) ((this.f40849s9 - this.f40875u9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.f40849s9) {
                        int childCount = this.f40905x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f40905x0.getChildAt(i11);
                            this.f40905x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.f40849s9;
                                if (childAt.getTop() > f14) {
                                    this.f40905x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!K9() && !this.D4 && this.J7 != null && this.f40905x0 != null && ((rkVar = this.P1) == null || rkVar.getVisibility() != 0)) {
                        this.f40905x0.scrollBy(0, (int) (f10 - this.f40849s9));
                    }
                }
                this.D9 = false;
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29528w;
                if (qcVar != null && (ubVar = qcVar.e) != null) {
                    ubVar.updatePosition();
                }
                q7();
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
                            ki.w3 w3Var = qVar.f15448r;
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
                                    qVar2.f15448r.f2(intent.getData());
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
                                yb();
                            }
                            if (this.f40818q5) {
                                this.f40848s8 = str;
                            } else {
                                ta(null, str);
                            }
                        } else if (this.p5 == null && this.R3 == 1) {
                            org.telegram.ui.Components.f5.L(getParentActivity(), this.T5, new m4.w0(11, this, data2), this.f40677ea);
                        } else {
                            o8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.T5, this.f40783n5, this.X3, this.f40757l5, null, null, null, null, 0, this.p5, true, 0, this.R3, H8());
                        }
                        B6();
                        return;
                    }
                    yb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        yb();
                        return;
                    }
                    if (this.p5 == null && this.R3 == 1) {
                        if (intent.getData() != null) {
                            ci.b3 b3Var4 = this.J1;
                            if (b3Var4 != null) {
                                b3Var4.dismiss();
                            }
                            org.telegram.ui.Components.f5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.e5(this) {
                                public final qn f38907b;

                                {
                                    this.f38907b = this;
                                }

                                @Override
                                public final void C(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            qn qnVar = this.f38907b;
                                            qnVar.o8(null, null);
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                qnVar.lb(i12, arrayList, z10);
                                            }
                                            qnVar.B6();
                                            return;
                                        default:
                                            qn qnVar2 = this.f38907b;
                                            qnVar2.o8(null, null);
                                            qnVar2.hb(intent.getClipData(), z10, i12);
                                            qnVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f40677ea);
                            return;
                        } else if (intent.getClipData() != null) {
                            ci.b3 b3Var5 = this.J1;
                            if (b3Var5 != null) {
                                b3Var5.dismiss();
                            }
                            org.telegram.ui.Components.f5.L(getParentActivity(), this.T5, new org.telegram.ui.Components.e5(this) {
                                public final qn f38907b;

                                {
                                    this.f38907b = this;
                                }

                                @Override
                                public final void C(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            qn qnVar = this.f38907b;
                                            qnVar.o8(null, null);
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                qnVar.lb(i12, arrayList, z10);
                                            }
                                            qnVar.B6();
                                            return;
                                        default:
                                            qn qnVar2 = this.f38907b;
                                            qnVar2.o8(null, null);
                                            qnVar2.hb(intent.getClipData(), z10, i12);
                                            qnVar2.B6();
                                            return;
                                    }
                                }
                            }, this.f40677ea);
                            return;
                        } else {
                            yb();
                        }
                    } else {
                        o8(null, null);
                        if (intent.getData() != null) {
                            Uri data3 = intent.getData();
                            if (data3 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(data3);
                                lb(0, arrayList, true);
                            }
                        } else if (intent.getClipData() != null) {
                            hb(intent.getClipData(), true, 0);
                        } else {
                            yb();
                        }
                    }
                    ci.b3 b3Var6 = this.J1;
                    if (b3Var6 != null) {
                        b3Var6.dismiss();
                    }
                    B6();
                    return;
                } else if (i10 == 28 && (b3Var = this.J1) != null && (foVar = b3Var.m0) != null) {
                    org.telegram.ui.ActionBar.d6 d6Var = foVar.f28176a;
                    if (foVar.f26308k1 != -1 && foVar.f26306j1 != null) {
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
                            org.telegram.messenger.nk.q(R.string.UnsupportedAttachment, new org.telegram.ui.Components.xc(foVar.f28177b.container, d6Var), d6Var);
                            return;
                        }
                        foVar.h0(foVar.f26308k1, new sh.c(uri));
                        org.telegram.ui.Components.mn mnVar = foVar.f26306j1;
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
                b3Var7.f30562j0.g0(i10, intent, this.V7);
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
        km kmVar;
        ah.e0 e0Var;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f29528w;
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
        x31 x31Var = this.Z9;
        if (x31Var != null && !x31Var.f43027b0) {
            if (z10) {
                x31Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            ah.f0 f0Var = this.Y9;
            if (f0Var != null && (e0Var = f0Var.f724b) != null && e0Var.getReactionsWindow() != null) {
                if (z10) {
                    f0Var.f724b.e();
                    return false;
                }
            } else if (et.q().E) {
                if (z10) {
                    et.q().o();
                    return false;
                }
            } else {
                al alVar = this.Fa;
                if (alVar != null && alVar.f28996s) {
                    if (z10) {
                        alVar.a(true);
                        return false;
                    }
                } else if (this.zc.f17384f) {
                    if (z10) {
                        Qb(false);
                        return false;
                    }
                } else if (this.Q8 != null) {
                    if (z10) {
                        D7(true);
                        return false;
                    }
                } else if (!a7(z10, false)) {
                    if (g9()) {
                        if (z10 && (kmVar = this.f40652c9) != null && kmVar.x()) {
                            this.f40652c9.f(false);
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
                            fk fkVar = this.Y;
                            if (fkVar != null && fkVar.r0() && (fkVar.f23948f2 != 1 || (tL_replyKeyboardMarkup = fkVar.f23994n2) == null || !tL_replyKeyboardMarkup.is_persistent || fkVar.f23987m2 == null)) {
                                if (z10) {
                                    this.Y.k0(true);
                                    return false;
                                }
                            } else {
                                fk fkVar2 = this.Y;
                                if (fkVar2 != null && fkVar2.u()) {
                                    if (z10) {
                                        fk fkVar3 = this.Y;
                                        gi.b0 b0Var = fkVar3.f23982l0;
                                        if (b0Var != null) {
                                            b0Var.setOpened(false);
                                        }
                                        if (!fkVar3.h0() && (nfVar = fkVar3.m0) != null) {
                                            nfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    fk fkVar4 = this.Y;
                                    if (fkVar4 == null || (pfVar = fkVar4.E0) == null || !pfVar.closeCreationLinkDialog(z10)) {
                                        if (this.R3 == 6 && (b2Var = ig.v.d) != null && b2Var.isShowing()) {
                                            if (z10) {
                                                ig.v.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.e) && !this.T3 && this.R1 != null && d() != 0) {
                                            if (z10) {
                                                this.R1.m(0L, this.f40808p7);
                                                return false;
                                            }
                                        } else if (this.R3 == 5 && !"hello".equalsIgnoreCase(this.Q3) && !"away".equalsIgnoreCase(this.Q3) && (this.f40872u6.isEmpty() || this.f40660d4 == 0)) {
                                            if (z10) {
                                                Vb();
                                                return false;
                                            }
                                        } else if (this.R3 == 6 && this.Y.v()) {
                                            if (z10) {
                                                Bb(new kf(this, 18));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21501n0) {
                                                if (z10) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f40917xc.f17384f) {
                                                if (z10) {
                                                    xa();
                                                }
                                            } else {
                                                if (z10 && (r60Var = this.f40632b3) != null) {
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
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f40872u6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.e)))) {
                    org.telegram.ui.Components.a41.u(messageObject, false);
                }
            }
        }
        this.F3 = false;
        q9();
        ArrayList arrayList2 = org.telegram.ui.Components.a41.Q;
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
        if (this.f40678eb) {
            fk fkVar = this.Y;
            if (fkVar != null) {
                fkVar.G0();
                fk fkVar2 = this.Y;
                fkVar2.T0 = false;
                org.telegram.ui.Components.dg dgVar = fkVar2.U0;
                if (dgVar != null) {
                    dgVar.v(false);
                }
            }
            this.f40678eb = false;
        }
        if (this.f40879v1 != null) {
            AndroidUtilities.runOnUIThread(new ke(this, 1), 600L);
        }
        if (this.f40830r4 && !this.f40844s4) {
            this.f40844s4 = true;
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f29535j = 5000;
            M.v = new ke(this, 2);
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
        hj hjVar = this.f40617a1;
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
                    PhotoViewer.u1().M2(null, this, this.f40677ea);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer u12 = PhotoViewer.u1();
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
                    if (u12.g2(playingMessageObject, null, null, null, null, null, null, 0, this.Ga, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.u1().l4 = this;
                    }
                    m9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.E1() && PhotoViewer.u1().f33346l2) {
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
        nk nkVar = this.W9;
        float f7 = 0.0f;
        if (z10 && this.R9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var instanceof qn) {
                this.D4 = true;
                qn qnVar = (qn) n2Var;
                qnVar.T9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.X0.setSkipBackgroundDrawing(true);
                this.f40617a1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f40617a1.getAvatarImageView().setAlpha(0.0f);
                this.f40617a1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.S9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                fk fkVar = this.Y;
                if (fkVar != null) {
                    fkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                ik ikVar = this.R;
                if (ikVar != null) {
                    ikVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                fk fkVar2 = this.Y;
                if (fkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = fkVar2.getMeasuredHeight();
                }
                ik ikVar2 = this.R;
                if (ikVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = ikVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                fk fkVar3 = qnVar.Y;
                if (fkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = fkVar3.getMeasuredHeight();
                }
                ik ikVar3 = this.R;
                if (ikVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = ikVar3.getMeasuredHeight();
                }
                this.O9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ah.l0(11, this, qnVar));
                oc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.V9 = animatorSet;
                animatorSet.addListener(new ei.n5(this, qnVar, runnable));
                this.V9.setDuration(300L);
                this.V9.setInterpolator(org.telegram.ui.Components.bs.f25025f);
                this.V9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(nkVar, 200L);
                return this.V9;
            }
        }
        if (this.f40738ja && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (n2Var2 instanceof re1) {
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
                this.f40762la = f7;
                ofFloat.addUpdateListener(new ui(0, this));
                this.f40751ka = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                jm jmVar = this.X0;
                if (jmVar != null) {
                    jmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V9 = animatorSet2;
                animatorSet2.addListener(new vi(this, z10, runnable));
                this.V9.setDuration(150L);
                this.V9.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(nkVar, 200L);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.mv0 mv0Var;
        super.onFragmentDestroy();
        ih.e eVar = this.N3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f13126w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                ih.d dVar = (ih.d) longSparseArray.valueAt(i10);
                if (dVar.f13114i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        fk fkVar = this.Y;
        if (fkVar != null) {
            fkVar.z0();
        }
        hj hjVar = this.f40617a1;
        if (hjVar != null && (mv0Var = hjVar.f29094c0) != null) {
            mv0Var.b(hjVar.G);
        }
        xj xjVar = this.I1;
        if (xjVar != null && xjVar.getAdapter() != null) {
            this.I1.getAdapter().P();
        }
        ci.b3 b3Var = this.J1;
        if (b3Var != null) {
            b3Var.dismissInternal();
        }
        et q6 = et.q();
        if (q6.f36791l == this.f40750k9) {
            q6.W = null;
            q6.f36779a0 = null;
            q6.Y = null;
            q6.f36791l = null;
            q6.f36783c0 = null;
            q6.u();
        }
        getNotificationCenter().onAnimationFinish(this.F9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.G9);
        getNotificationCenter().onAnimationFinish(this.H9);
        getNotificationCenter().onAnimationFinish(this.I9);
        q9();
        ke keVar = this.L5;
        if (keVar != null) {
            AndroidUtilities.cancelRunOnUIThread(keVar);
            this.L5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f40788na);
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
        if (this.f40680f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.E3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f40680f != null) {
            getMessagesController().cancelLoadFullUser(this.f40680f.f20427id);
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
        km kmVar = this.f40652c9;
        if (kmVar != null) {
            kmVar.f(false);
        }
        pj pjVar = this.f40919y0;
        if (pjVar != null) {
            pjVar.N();
        }
        ok okVar = this.f40901wa;
        if (okVar != null) {
            okVar.b();
        }
        this.f40639ba = null;
        org.telegram.ui.ActionBar.d5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Pc ? 1 : 0);
            org.telegram.ui.ActionBar.d5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.n9) parentLayout2.getPulledDialogs().get(i11)).f28730b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Pc = false;
        pf.c cVar = this.Ab;
        if (cVar != null) {
            cVar.a(false);
            this.Ab = null;
        }
        this.f40702ga.onFragmentDestroy();
        q01 q01Var = this.f40651c8;
        if (q01Var != null) {
            q01Var.b(true);
            this.f40651c8 = null;
        }
        ai.q7 q7Var = this.f40824qc;
        if (q7Var != null) {
            q7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f40824qc);
            this.f40824qc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f40752kb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f40900w8, null, null, false);
        }
        ai.q7 q7Var = this.f40824qc;
        if (q7Var != null) {
            q7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.f40824qc);
            this.f40824qc = null;
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
        fk fkVar = this.Y;
        boolean z12 = false;
        if (fkVar != null && i10 == 2 && fkVar.f23973j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(fkVar.Q).sendCurrentLocation(fkVar.f23967i3, fkVar.f23973j3);
            }
            fkVar.f23973j3 = null;
            fkVar.f23967i3 = null;
        }
        xj xjVar = this.I1;
        if (xjVar != null && xjVar.getAdapter() != null) {
            hg.j1 adapter = this.I1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f11946w0;
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
                b3Var3.f30562j0.Y();
            }
            org.telegram.ui.Components.wp wpVar = this.f40639ba;
            if (wpVar != null && (tiVar = wpVar.Y) != null) {
                tiVar.f30562j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (b3Var = this.J1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                b3Var.G1();
            } else if (i10 == 30 && (rlVar = b3Var.f30576o0) != null && b3Var.B0 == rlVar && b3Var.isShowing()) {
                b3Var.f30576o0.b0();
            }
        } else if ((i10 == 17 || i10 == 18) && (b3Var2 = this.J1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = b3Var2.f30562j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.J1.f30562j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f40677ea);
                alertDialog$Builder.f20609a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f20609a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new nh(this));
                org.telegram.messenger.g0.p(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ea(2);
        } else if (((i10 != 101 && i10 != 102) || this.f40680f == null) && (i10 != 103 || this.e == null)) {
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
                TLRPC.User user2 = this.f40680f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f40623a8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.d2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f40680f.f20427id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.d2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        fk fkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z11;
        org.telegram.ui.Components.w9[] w9VarArr;
        ah.x xVar;
        super.onResume();
        g7();
        this.E9 = System.currentTimeMillis();
        if (this.f40835r9 && getSendMessagesHelper().getImportingHistory(this.T5) != null) {
            org.telegram.ui.Components.g50 g50Var = new org.telegram.ui.Components.g50(getParentActivity(), null, this, this.f40677ea);
            g50Var.setOnHideListener(new oe(this, 0));
            showDialog(g50Var);
            this.f40835r9 = false;
        }
        K6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        Z6();
        ci.b3 b3Var = this.J1;
        if (b3Var != null) {
            b3Var.B1();
        }
        jm jmVar = this.X0;
        boolean z12 = true;
        if (jmVar != null) {
            org.telegram.ui.Components.h91 h91Var = jmVar.v;
            if (h91Var != null) {
                h91Var.c(true);
            }
            jmVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new ke(this, 23), 1000L);
        }
        b9 b9Var = new b9(this, 2);
        this.Zb = b9Var;
        setBulletinDelegate(b9Var);
        J6(false);
        TLRPC.PhotoSize photoSize = this.f40897w5;
        if (photoSize != null && (xVar = this.f40616a0) != null) {
            ((org.telegram.ui.Components.ap[]) xVar.f899b)[0].f24694f.k(ImageLocation.getForObject(photoSize, this.f40923y5), "50_50", ImageLocation.getForObject(this.f40910x5, this.f40923y5), "50_50_b", this.f40871u5, null, this.f40783n5, this.f40883v5);
        }
        if (this.C5 != null && (w9VarArr = this.B2) != null) {
            w9VarArr[0].k(ImageLocation.getForObject(this.C5, this.E5), "50_50", ImageLocation.getForObject(this.D5, this.E5), "50_50_b", this.f40935z5, null, (MessageObject) this.J4.get(Integer.valueOf(this.L4)), this.A5);
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
                if (this.f40905x0 != null) {
                    int i10 = this.T7;
                    if (i10 == -9000) {
                        i10 = P8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f40930z0.i1(this.f40872u6.indexOf(this.K7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f40930z0.i1(this.f40872u6.indexOf(this.K7) + this.A0.J, i10, z11);
                }
            } else {
                T9(false);
            }
            this.S5 = false;
            this.Q5 = false;
            this.K7 = null;
        }
        this.f40818q5 = false;
        this.f40831r5 = false;
        d7(false);
        if (this.f40845s5) {
            this.f40845s5 = false;
            dm dmVar = this.A0;
            if (dmVar != null) {
                dmVar.O(false);
            }
        }
        hj hjVar = this.f40617a1;
        if (hjVar != null) {
            hjVar.getViewTreeObserver().addOnPreDrawListener(new vh(this, 0));
        }
        D6(false, false);
        if (this.Y != null && this.R3 == 0 && this.ia != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.T5 && (arrayList2 = this.ia.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new y70(this, 3)).collect(Collectors.toCollection(new Object()));
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
        jk jkVar = this.O0;
        if (jkVar != null && jkVar.getVisibility() != 0 && !this.actionBar.f21501n0 && this.R3 != 7 && !org.telegram.ui.ActionBar.n2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        fk fkVar2 = this.Y;
        if (fkVar2 != null) {
            fkVar2.C0();
        }
        if (this.f40680f != null) {
            this.f40809p8 = System.currentTimeMillis();
            this.f40820q8 = 0L;
        }
        if (this.f40848s8 != null) {
            AndroidUtilities.runOnUIThread(new ke(this, 3));
        }
        if (this.f40905x0 != null && ((fkVar = this.Y) == null || !fkVar.p0())) {
            this.f40905x0.setOnItemLongClickListener(this.Ka);
            this.f40905x0.setOnItemClickListener(this.La);
            this.f40905x0.setLongClickable(true);
        }
        org.telegram.ui.Components.i61.h = false;
        TLRPC.User user = this.f40680f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.i61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.Z7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.Z7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.Z7.participants.participants.get(i11).user_id));
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
                if (chatFull.bot_info.isEmpty() || (chat = this.e) == null || !chat.megagroup) {
                    z12 = false;
                }
                org.telegram.ui.Components.i61.h = z12;
            }
        }
        Sc(false);
        Nb();
        if (this.N9 != 0.0f) {
            this.N9 = 0.0f;
            this.f40905x0.invalidate();
        }
        this.E3.attach();
        ai.q7 q7Var = this.f40824qc;
        if (q7Var != null) {
            q7Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.onTransitionAnimationEnd(boolean, boolean):void");
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
                zc();
            }
            iArr = this.F9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.N5 = false;
            if (!z11) {
                this.P5 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f40680f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            fk fkVar = this.Y;
            if (fkVar != null && (rdVar = fkVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(rdVar);
                fkVar.S1 = null;
            }
        }
        g7();
        this.F9 = getNotificationCenter().setAnimationInProgress(this.F9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f40709h4) {
            if (this.f40680f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f40680f.f20427id));
                if (user != null) {
                    this.f40680f = user;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.e.f20280id));
                if (chat != null) {
                    this.e = chat;
                } else {
                    return;
                }
            }
            hj hjVar = this.f40617a1;
            if (hjVar != null) {
                hjVar.b();
            }
        }
    }

    public final void p7() {
        float f7;
        org.telegram.ui.Components.nf nfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + b9(org.telegram.ui.Components.n31.f28685c) + this.v.d();
        fk fkVar = this.Y;
        if (fkVar != null && (nfVar = fkVar.m0) != null) {
            nfVar.setTranslationY(-inputBubbleHeight);
        }
        xj xjVar = this.I1;
        if (xjVar != null) {
            if (xjVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            xjVar.setTranslationY(f7);
        }
    }

    public final void p8(boolean z10) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.Z7 != null && !ChatObject.isNotInChat(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.Z7;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f40825r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f40825r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.Z7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.Z7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f40825r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f40825r == 0) {
                getMessagesController().checkChatInviter(this.e.f20280id, false);
            }
        }
    }

    public final void p9() {
        vk vkVar = this.f40640bb;
        if (vkVar == null) {
            return;
        }
        this.f40640bb = null;
        vkVar.e();
        if (vkVar.getReactionsWindow() != null && vkVar.getReactionsWindow().f868a != null) {
            vkVar.getReactionsWindow().f868a.animate().alpha(0.0f).setDuration(180L).start();
        }
        vkVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new eh(6, this, vkVar)).setDuration(180L).start();
    }

    public final void pa(TLRPC.Chat chat) {
        boolean z10;
        ei.x3 x3Var = this.f40879v1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.f40893w1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new eh(0, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21501n0) {
            this.Ac.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f40705h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f40668e0;
            if (xVar != null) {
                xVar.f(8);
            }
            ur urVar = this.f40656d0;
            if (urVar != null) {
                urVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f40716i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f40728j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f40778n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f40741k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f40791o0 = true;
            Kc(0, 0, -1);
            mc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f40728j0;
        if (u0Var5 != null) {
            this.f40667dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f40667dc = false;
        }
        db(chat, null);
        Dc(0, true);
    }

    public final void pb(boolean z10) {
        qb(z10, false, true);
    }

    public final void pc(boolean z10) {
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
            hVar = this.f40911x6;
            arrayList = this.f40872u6;
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
                int i12 = Kc;
                Kc = i12 + 1;
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
        if (this.f40816q3 != null && TextUtils.isEmpty(this.f40856t3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f40816q3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
                arrayList4 = org.telegram.messenger.g0.j(messageObject8.dateKeyInt, this.Ya);
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
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.G6 || !arrayList.isEmpty() || this.A0.f36421w >= 0) {
                z11 = false;
            }
            Ub(z11);
            if (this.f40905x0 != null) {
                J7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.G6 || !arrayList.isEmpty() || this.A0.f36421w >= 0)) {
                    this.f40905x0.setEmptyView(this.Q0);
                    nj njVar = this.f40905x0;
                    njVar.K0(njVar.v1());
                    return;
                }
                this.Q0.setVisibility(8);
                this.f40905x0.setEmptyView(null);
            }
        }
    }

    public final void q7() {
        float d;
        if (this.f40905x0 != null) {
            if (this.Pa && this.f40666da == null) {
                d = AndroidUtilities.navigationBarHeight;
            } else {
                d = this.v.d() + b9(org.telegram.ui.Components.n31.f28685c) + AndroidUtilities.dp(16.0f) + this.Ba + this.f40865tc;
            }
            int i10 = (int) this.f40849s9;
            org.telegram.ui.Components.s31 s31Var = this.R1;
            if (s31Var != null) {
                s31Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            ih.g gVar = this.f40892w0;
            boolean z10 = this.f40905x0.V1;
            RecyclerView recyclerView = gVar.f13139a;
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
                RectF rectF = eVar.f13120b;
                rectF.set(b9(org.telegram.ui.Components.n31.f28684b), i10 - this.G, 0.0f, d - this.Ba);
                eVar.f13121c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void q8(org.telegram.messenger.MessageObject r60, java.util.ArrayList r61, java.util.ArrayList r62, java.util.ArrayList r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.q8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
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
        bl blVar = this.f40933z3;
        if (blVar != null) {
            blVar.e(0, true);
        }
    }

    public final void qa(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var;
        int i11;
        ei.x3 x3Var = this.f40879v1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.f40893w1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new re(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21501n0) {
            this.Ac.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f40705h0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f40668e0;
            if (xVar != null) {
                xVar.f(8);
            }
            ur urVar = this.f40656d0;
            if (urVar != null) {
                urVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f40716i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            if ((this.f40660d4 == 0 || (i11 = this.R3) == 3 || i11 == 8) && (u0Var = this.f40728j0) != null) {
                u0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f40778n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f40741k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f40791o0 = true;
            Kc(0, 0, -1);
            mc(false);
        }
        if ((this.f40660d4 == 0 || this.f40709h4 || (i10 = this.R3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f40680f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.W4 = z11;
            org.telegram.ui.ActionBar.u0 u0Var5 = this.f40728j0;
            if (u0Var5 != null) {
                u0Var5.z(z11);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var6 = this.f40728j0;
        if (u0Var6 != null) {
            u0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f40856t3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.T5, this.L6, this.classGuid, 0, this.f40660d4, false, this.f40794o3, this.f40805p3, !TextUtils.isEmpty(str), this.f40816q3);
        Dc(0, true);
    }

    public final void qb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.qb(boolean, boolean, boolean):void");
    }

    public final void qc() {
        int i10;
        vj vjVar = this.Y2;
        if (vjVar == null) {
            return;
        }
        vjVar.setTranslationX(W8() / 2.0f);
        this.Y2.setTranslationY((((this.f40905x0.getTranslationY() + this.f40849s9) + this.f40939z9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f40939z9, -this.Y2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.Y2.setAlpha(this.f40719i3 * clamp);
        vj vjVar2 = this.Y2;
        if (this.f40719i3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        vjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.Y2.setScaleX(lerp);
        this.Y2.setScaleY(lerp);
    }

    @Override
    public final void r(int i10, float f7, float f10, ne.e eVar) {
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
            rh.c cVar = this.Dc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.f40917xc.e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                ne.b bVar = this.yc;
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
                org.telegram.ui.Components.s31 s31Var = this.R1;
                if (s31Var != null) {
                    s31Var.setAlpha(f12);
                    org.telegram.ui.Components.s31 s31Var2 = this.R1;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    s31Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                ah.x xVar = this.K3;
                ne.b bVar2 = this.zc;
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
                nj njVar = this.f40905x0;
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
        ArrayList arrayList4 = this.f40872u6;
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
        Kc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f40856t3, this.T5, this.L6, this.classGuid, 0, this.f40660d4, this.f40794o3, this.f40805p3, this.f40816q3);
        if (TextUtils.isEmpty(this.f40856t3) && this.f40816q3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.f40843s3 = z10;
        this.f40791o0 = z10;
        mc(false);
        Nc();
    }

    public final void ra(TLRPC.User user) {
        boolean z10;
        ei.x3 x3Var = this.f40879v1;
        if (x3Var != null && x3Var.V) {
            x3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        ei.x3 x3Var2 = this.f40893w1;
        if (x3Var2 != null && x3Var2.V) {
            x3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ig(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21501n0) {
            this.Ac.a(true, true);
            org.telegram.ui.ActionBar.u0 u0Var = this.f40705h0;
            if (u0Var != null) {
                u0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f40668e0;
            if (xVar != null) {
                xVar.f(8);
            }
            ur urVar = this.f40656d0;
            if (urVar != null) {
                urVar.b(false);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f40716i0;
            if (xVar2 != null) {
                xVar2.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f40728j0;
            if (u0Var2 != null) {
                u0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.u0 u0Var3 = this.m0;
            if (u0Var3 != null && this.K9) {
                u0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar3 = this.f40778n0;
            if (xVar3 != null && this.L9) {
                xVar3.f(8);
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f40741k0;
            if (u0Var4 != null) {
                u0Var4.setVisibility(8);
            }
            this.f40791o0 = true;
            Kc(0, 0, -1);
            mc(false);
            ImageView imageView = this.S2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.T2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var5 = this.f40728j0;
        if (u0Var5 != null) {
            this.f40667dc = true;
            this.W4 = false;
            u0Var5.z(false);
            this.f40667dc = false;
        }
        db(null, user);
        Dc(0, true);
    }

    public final void rb(int i10, int i11, String str) {
        this.L7 = i10;
        this.N7 = true;
        this.O7 = 0L;
        this.P7 = str;
        this.S7 = i11;
        this.M7 = true;
    }

    public final void rc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f40623a8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f40623a8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.R0 != null) {
            if (z10 && this.T0 == null) {
                li liVar = new li(getParentActivity(), getResourceProvider(), this);
                this.T0 = liVar;
                w7.b6.b(liVar, 0.02f, 1.2f);
                this.T0.setOnClickListener(new ve(this, 12));
            }
            li liVar2 = this.T0;
            if (liVar2 != null) {
                if (!z10) {
                    liVar2.setVisibility(8);
                    return;
                }
                liVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f40623a8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f40623a8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f40680f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        n01 n01Var = new n01(formatString.substring(indexOf, indexOf2));
                        if (n01Var.f39391c != -1) {
                            n01Var.f39391c = -1;
                            n01Var.invalidateSelf();
                        }
                        n01Var.a(503316480);
                        n01Var.setBounds(0, 0, n01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(n01Var), indexOf, indexOf2, 33);
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
    public final void restoreSelfArgs(Bundle bundle) {
        this.V7 = bundle.getString("path");
    }

    @Override
    public final void s(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.f40903wc.a(false, true);
        MessageObject messageObject = this.p5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.p5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f40697g5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.p5.messageOwner.suggested_post);
            }
            if (!ai.ga.U(this.currentAccount, messageSuggestionParams.amount)) {
                Yb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            kf kfVar = new kf(this, 26);
            this.f40819q7 = kfVar;
            AndroidUtilities.runOnUIThread(kfVar, 3000L);
        }
        o8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.f5.a0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                qn qnVar = qn.this;
                MessageObject messageObject2 = qnVar.p5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = qnVar.f40697g5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(qnVar.p5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(qnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, qnVar.T5, qnVar.p5, qnVar.X3, null, qnVar.f40757l5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, qnVar.H8(), photoEntry2.effectId, l4.longValue(), qnVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, qnVar.T5, qnVar.p5, qnVar.X3, null, qnVar.f40757l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, qnVar.H8(), photoEntry2.effectId, l4.longValue(), qnVar.S8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, qnVar.T5, qnVar.p5, qnVar.X3, null, qnVar.f40757l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, qnVar.H8(), photoEntry2.effectId, l4.longValue(), qnVar.S8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(qnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, qnVar.T5, qnVar.f40783n5, qnVar.X3, null, qnVar.f40757l5, photoEntry2.entities, photoEntry2.ttl, qnVar.p5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, qnVar.H8(), photoEntry2.effectId, l4.longValue(), qnVar.S8(), qnVar.f40697g5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, qnVar.T5, qnVar.f40783n5, qnVar.X3, null, qnVar.f40757l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, qnVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, qnVar.H8(), photoEntry2.effectId, l4.longValue(), qnVar.S8(), qnVar.f40697g5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(qnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, qnVar.T5, qnVar.f40783n5, qnVar.X3, null, qnVar.f40757l5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, qnVar.p5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, qnVar.H8(), photoEntry2.effectId, l4.longValue(), qnVar.S8(), qnVar.f40697g5);
                }
                qnVar.B6();
            }
        }, j10);
    }

    public final void s7() {
        int i10;
        float f7 = this.Bc.e;
        org.telegram.ui.Components.m40 m40Var = this.f40854t1;
        int i11 = 8;
        if (m40Var != null) {
            m40Var.setAlpha(f7);
            org.telegram.ui.Components.m40 m40Var2 = this.f40854t1;
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
        Iterator it = this.f40918y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void sa(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.f40617a1.e(true, false);
            } else if (getMessagesController().isCommunity(j10)) {
                showDialog(new hi.k0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new qn(bundle));
                }
            }
        } else if (j10 != getUserConfig().getClientUserId()) {
            if (j10 == a()) {
                this.f40617a1.e(true, false);
                return;
            }
            Bundle b10 = zf.d0.b(j10, "user_id");
            if (this.h != null && j10 == this.f40680f.f20427id) {
                b10.putLong("dialog_id", this.T5);
            }
            ProfileActivity profileActivity = new ProfileActivity(b10, null);
            TLRPC.User user = this.f40680f;
            if (user != null && user.f20427id == j10) {
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
        kf kfVar = this.f40822qa;
        if (kfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kfVar);
        }
        fk fkVar = this.Y;
        if (fkVar != null && this.X0 != null && fkVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f21640f) {
            this.f40810pa = this.X0.getKeyboardHeight();
        } else {
            this.f40810pa = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.V7;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(long j10) {
        this.f40660d4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20301id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void sc() {
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
                chat = getMessagesController().getMonoForumLinkedChat(this.e.f20280id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f20280id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f20280id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(ai.md.S0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.S0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final qn f43483b;

                    {
                        this.f43483b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                qn.c0(j11, this.f43483b);
                                return;
                            default:
                                qn.o1(j11, this.f43483b);
                                return;
                        }
                    }
                });
                return;
            }
            this.S0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f40623a8;
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
                toVar2.c(z10, false, AndroidUtilities.replaceTags(ai.md.S0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.T5), LocaleController.formatNumber(this.f40623a8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final qn f43483b;

                    {
                        this.f43483b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                qn.c0(j10, this.f43483b);
                                return;
                            default:
                                qn.o1(j10, this.f43483b);
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
        fk fkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f40680f != null && this.f40778n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f40680f.f20427id);
            if (userFull != null && userFull.phone_calls_available) {
                this.L9 = !this.inPreviewMode;
                this.f40778n0.f(0);
            } else {
                this.L9 = false;
                this.f40778n0.f(8);
            }
        }
        hj hjVar = this.f40617a1;
        float f12 = 0.0f;
        if (hjVar != null) {
            hjVar.setOccupyStatusBar(!z10);
            hj hjVar2 = this.f40617a1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            hjVar2.setLayoutParams(w7.z5.d(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        fk fkVar2 = this.Y;
        if (fkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            fkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.iz0 iz0Var = this.f40657d1;
        if (iz0Var != null) {
            if (this.Z4 && !z10 && ((fkVar = this.Y) == null || !fkVar.f24059z3)) {
                i11 = 0;
            }
            iz0Var.setVisibility(i11);
        }
        xj xjVar = this.I1;
        if (xjVar != null) {
            ViewPropertyAnimator animate = xjVar.animate();
            if (!this.Y.f24059z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.bs.f25025f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                g2Var = new org.telegram.ui.ActionBar.g2(false);
            } else {
                g2Var = null;
            }
            kVar.setBackButtonDrawable(g2Var);
            org.telegram.ui.ActionBar.u0 u0Var = this.f40705h0;
            if (u0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                u0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.x xVar = this.f40668e0;
            if (xVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                xVar.f21865i = f12;
                org.telegram.ui.ActionBar.u0 u0Var2 = xVar.f21869m;
                if (u0Var2 != null) {
                    u0Var2.setAlpha(f12);
                }
            }
        }
        nj njVar = this.f40905x0;
        if (njVar != null) {
            int childCount = njVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f40905x0.getChildAt(i12);
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
                        int i13 = this.f40758l6 - 1;
                        this.f40758l6 = i13;
                        if (i13 <= 0) {
                            this.f40758l6 = 0;
                            this.f40770m6 = true;
                            Pb(false);
                        } else {
                            this.f40729j1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.e)) {
                            j10 = this.e.f20280id;
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
            this.f40905x0.setItemAnimator(null);
        }
        mc(false);
        Pc();
        zj zjVar = this.X1;
        if (zjVar != null) {
            if (!z10 && !this.Pa) {
                z12 = true;
            } else {
                z12 = false;
            }
            zjVar.setEnabled(z12);
        }
        zj zjVar2 = this.Z1;
        if (zjVar2 != null) {
            if (!z10 && !this.Pa) {
                z11 = true;
            } else {
                z11 = false;
            }
            zjVar2.setEnabled(z11);
        }
        cl clVar = this.f40907x2;
        if (clVar != null) {
            clVar.setEnabled(!isInPreviewMode());
        }
        jm jmVar = this.X0;
        if (jmVar != null) {
            jmVar.setOccupyStatusBar((this.inBubbleMode || this.Pa || this.inPreviewMode) ? false : false);
        }
    }

    public final void t7() {
        if (this.X0 == null) {
            return;
        }
        this.f40865tc = F6(false);
        this.f40877uc = F6(true);
        this.S.setInputBubbleHeight(this.f40865tc);
        Bc();
        lc();
        p7();
        m7();
        r7();
        q7();
    }

    public final org.telegram.ui.Cells.a0 t8(int i10, boolean z10) {
        MessageObject messageObject;
        nj njVar = this.f40905x0;
        if (njVar != null) {
            int childCount = njVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f40905x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.u1) {
                    messageObject = ((org.telegram.ui.Cells.u1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.w0) {
                    messageObject = ((org.telegram.ui.Cells.w0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f40849s9 - this.f40875u9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f40905x0.getMeasuredHeight() - this.Ba) {
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
            jm jmVar = this.X0;
            if (jmVar != null) {
                jmVar.invalidate();
            }
            nj njVar = this.f40905x0;
            if (njVar != null) {
                njVar.invalidate();
            }
        }
        UndoView undoView = this.y3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(b9(org.telegram.ui.Components.n31.f28685c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(16.0f));
        }
        y7();
    }

    public final void ta(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.u1().M2(null, this, this.f40677ea);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.u1().T1()) {
                PhotoViewer.u1().H0(false, false);
            }
            PhotoViewer.u1().i2(arrayList, 0, 0, false, new ll(this, createVideoThumbnail, arrayList), this);
            return;
        }
        o8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.T5, this.f40783n5, this.X3, null, this.f40757l5, null, 0, this.p5, true, 0, 0, false, false, null, H8(), 0L, 0L, S8(), this.f40697g5);
        B6();
    }

    public final void tb(View view) {
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

    public final void tc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.tc(boolean):void");
    }

    public final void u7() {
        int i10;
        qn qnVar = this.f40666da;
        if (qnVar != null) {
            qnVar.u7();
        }
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) a9(AndroidUtilities.dp(7.0f)));
        qk qkVar = this.f40792o1;
        if (qkVar != null) {
            i10 = AndroidUtilities.dp(qkVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(E8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.d());
        ai.u1 u1Var = this.L3;
        if (u1Var != null) {
            u1Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.m40 m40Var = this.f40854t1;
        if (m40Var != null) {
            m40Var.e.setPadding(0, dp2, 0, dp3);
            m40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        ah.x xVar = this.K3;
        if (xVar != null) {
            kh.f fVar = (kh.f) xVar.f899b;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.b10 b10Var = this.f40645c2;
        if (b10Var != null) {
            b10Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.tx0 tx0Var = this.f40658d2;
        if (tx0Var != null) {
            tx0Var.f30700a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final org.telegram.ui.Cells.w0 u8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f40905x0 != null && this.A0 != null) {
            for (int i10 = 0; i10 < this.f40905x0.getChildCount(); i10++) {
                View childAt = this.f40905x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.w0) {
                    org.telegram.ui.Cells.w0 w0Var = (org.telegram.ui.Cells.w0) childAt;
                    if (org.telegram.ui.Wallet.m0.G(w0Var.getMessageObject(), wallettransaction)) {
                        return w0Var;
                    }
                }
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.f40872u6;
                if (i11 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.m0.G((MessageObject) arrayList.get(i11), wallettransaction)) {
                    this.f40905x0.B0();
                    this.f40930z0.h1(this.A0.J + i11, 0);
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
            ij ijVar = this.v;
            float c10 = ijVar.c();
            ne.m mVar = ijVar.f44741b;
            int max = (int) Math.max(0.0f, (c10 * mVar.f17407a) - AndroidUtilities.dp(29.0f));
            jm jmVar = this.X0;
            ai.ic icVar = jmVar.L;
            Rect rect2 = this.Hc;
            if (icVar != null) {
                rect2.set(0, 0, jmVar.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                this.X0.L.setClipBounds(rect2);
            }
            if (this.f40905x0 != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f40905x0.getTop());
                nj njVar = this.f40905x0;
                if (njVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                njVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.X0.getMeasuredWidth(), this.X0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(ijVar.v, ijVar.c() * mVar.f17407a) - AndroidUtilities.dp(29.0f))));
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
        this.f40617a1.setTranslationY(0.0f);
        this.f40617a1.getAvatarImageView().setScaleX(1.0f);
        this.f40617a1.getAvatarImageView().setScaleY(1.0f);
        this.f40617a1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void ub(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f40647c4 = tL_forumTopic;
        this.f40619a4 = arrayList;
        MessageObject messageObject = (MessageObject) i2.e.h(1, arrayList);
        this.X3 = messageObject;
        this.f40783n5 = messageObject;
        this.f40745k4 = i11;
        this.l4 = i12;
        this.f40768m4 = Math.max(1, i11);
        this.f40660d4 = this.X3.getId();
        this.f40672e4 = i10;
        this.f40685f4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f40709h4 = z10;
        MessageObject messageObject2 = this.f40783n5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f40696g4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        Ec();
        Vc(false);
        mc(false);
    }

    public final void uc() {
        MessageObject messageObject;
        if (this.f40680f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                nj njVar = this.f40905x0;
                if (njVar != null) {
                    int childCount = njVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f40905x0.getChildAt(i10);
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f40809p8, this.f40820q8, this.f40680f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f33806h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f40680f, null, null, messageObject2.getId());
            }
        }
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
        float f7 = (1.0f - this.zc.e) * (1.0f - this.f40917xc.e);
        this.f40729j1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f40729j1.setAlpha(f7);
        kh.h hVar = this.f40729j1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final void v8() {
        if (this.f40748k7) {
            return;
        }
        this.f40748k7 = true;
        getMessagesController().checkSensitive(this, this.T5, new ke(this, 24), new kf(this, 18));
    }

    public final void v9(int i10) {
        qn qnVar = this.f40666da;
        if (qnVar != null) {
            qnVar.v9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.F != null) {
            zf.b0 b0Var = this.Ec;
            if (b0Var.f51532c == 0) {
                b0Var.invalidate();
            }
            b0Var.f51532c = i10 | b0Var.f51532c;
        }
    }

    public final void va(long j10, boolean z10) {
        if (this.R1 != null && UserObject.isBotForum(this.f40680f)) {
            this.R1.setAllTopicsHidden(true);
        }
        this.M5.put(j10, 1);
        T7();
        UndoView undoView = this.y3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.T5, 0, new ai.td(this, j10, z10, 6), new je(this, j10, 2));
        this.A0.O(false);
    }

    public final void vb() {
        AndroidUtilities.shakeViewSpring(this.f40905x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        fk fkVar = this.Y;
        for (int i10 = 0; i10 < fkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(fkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void vc(MessageObject messageObject, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new ai.y7(this, messageObject, z10, 14));
    }

    @Override
    public final boolean w(final org.telegram.ui.cy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.re1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.w(org.telegram.ui.cy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.re1):boolean");
    }

    public final void w6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.w6():void");
    }

    public final void w7() {
        qn qnVar = this.f40666da;
        if (qnVar != null) {
            qnVar.w7();
        }
        float a92 = a9(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.R1 != null) {
            a92 += b9(org.telegram.ui.Components.n31.f28683a);
        }
        if (this.f40792o1 != null) {
            a92 += AndroidUtilities.dp(35.0f) * this.f40792o1.E;
        }
        this.X.setFadeZoneTop((int) ((E8() * AndroidUtilities.dp(43.0f)) + a92));
    }

    public final boolean w8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f40905x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f40905x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.u1) && (currentMessagesGroup = ((org.telegram.ui.Cells.u1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f40872u6.indexOf((MessageObject) i2.e.h(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        dm dmVar = this.A0;
                        dmVar.q(indexOf + dmVar.J, currentMessagesGroup.messages.size());
                        this.f40905x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            i2.e.y(false, this.actionBar);
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
        this.f40836ra = true;
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

    public final void wb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f40677ea);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20609a;
        b2Var.R = string;
        TLRPC.User user = this.f40680f;
        if (user != null) {
            if (user.bot) {
                b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String g10 = org.telegram.messenger.nk.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, jf.b.c());
                TLRPC.User user2 = this.f40680f;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, g10, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            b2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new hg.b2(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(b2Var);
    }

    public final void wc(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f40911x6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                pj pjVar = this.f40919y0;
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
            MessageObject messageObject3 = (MessageObject) this.f40797o6[0].get(messageObject.getId());
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
                    dm dmVar = this.A0;
                    dmVar.m(dmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f40872u6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                dm dmVar2 = this.A0;
                dmVar2.m(dmVar2.J + indexOf2);
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
            a0.h hVar = this.f40898w6;
            ArrayList arrayList = (ArrayList) hVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.g0.j(pollId, hVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void x7() {
        if (this.M0 != null) {
            this.M0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - E8()) * (1.0f - this.zc.e) * W8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
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
                this.f40800o9 = true;
                dm dmVar = this.A0;
                if (dmVar != null) {
                    dmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.T5, z10, z11, z12, i10, 0, this.X3, -1, j10, S8(), this.f40697g5);
            org.telegram.ui.Components.f5.s0(sendMessage, this, this.f40677ea);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new kf(this, 25));
            }
        }
    }

    public final void x9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f40680f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f40872u6.isEmpty();
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
        this.f40917xc.a(false, true);
        rh.c cVar = this.Dc;
        if (cVar != null && (u1Var = cVar.f45750n) != null && u1Var.getDelegate() != null) {
            cVar.f45750n.getDelegate().x1(cVar.f45750n, false);
        }
        fk fkVar = this.Y;
        if (fkVar != null) {
            fkVar.S0(true, true, false);
            this.Y.U4 = null;
        }
    }

    public final boolean xb() {
        if (A9() && this.f40783n5 == null && this.p5 == null) {
            if (this.R3 != 8 && A9() && this.e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f20280id, 1L);
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

    public final void xc() {
        org.telegram.ui.ActionBar.m1 m1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        nj njVar = this.f40905x0;
        xj xjVar = this.I1;
        if ((xjVar != null && xjVar.I) || ((m1Var = this.Q8) != null && m1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        njVar.setImportantForAccessibility(i10);
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
        org.telegram.ui.Components.o9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f40680f, null, this.T5, this.f40888va, this.ua);
    }

    public final void y7() {
        float f7 = this.w9;
        qk qkVar = this.f40792o1;
        if (qkVar != null) {
            qkVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.f40792o1.E;
        }
        ck ckVar = this.f40803p1;
        if (ckVar != null) {
            ckVar.setTranslationY(f7);
        }
        float E8 = (E8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.s31 s31Var = this.R1;
        org.telegram.ui.Components.n31 n31Var = org.telegram.ui.Components.n31.f28683a;
        if (s31Var != null) {
            s31Var.setSideMenuBackgroundMarginTop((E8() * a9(AndroidUtilities.dp(7.0f))) + E8);
            float b92 = b9(n31Var);
            float b10 = zf.f0.b(this.zc.e);
            float E82 = E8();
            E8 += zf.f0.b(Math.min(w7.r.a(zf.f0.b(b10), 0.0f, 1.0f), w7.r.a(zf.f0.b(E82), 0.0f, 1.0f))) * b92;
        }
        org.telegram.ui.Components.ch chVar = this.M0;
        if (chVar != null) {
            chVar.setTranslationY((E8 - AndroidUtilities.dp(5.0f)) - (E8() * b9(n31Var)));
        }
    }

    public final int y8() {
        return this.R3;
    }

    public final boolean y9() {
        if (this.R1 != null && this.f40660d4 == 0) {
            return true;
        }
        return false;
    }

    public final void ya(org.telegram.ui.Cells.u1 u1Var) {
        rh.c cVar;
        if (this.f40917xc.f17384f && (cVar = this.Dc) != null && cVar.f45750n == u1Var) {
            Editable text = cVar.f45746a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(u1Var.getMessageObject(), text, this.Dc.getAttachedMedia());
                xa();
                return;
            }
            AndroidUtilities.shakeView(this.Dc.f45746a);
        }
    }

    public final void yb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.xc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f40677ea).j();
    }

    public final void yc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
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
        SparseArray sparseArray = this.f40884v6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f40872u6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.T5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f40797o6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j10 = this.e.f20280id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j10, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f40911x6.f(messageObject.getGroupId());
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
                        int indexOf2 = arrayList.indexOf((MessageObject) i2.e.h(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            dm dmVar = this.A0;
                            if (!dmVar.N) {
                                dmVar.q(indexOf2 + dmVar.J, groupedMessages2.messages.size());
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
            if ((b3Var.isShowing() && !this.J1.isDismissed()) || this.J1.f30607x0) {
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

    public final void za(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        ah.i1 d = ah.i1.d(reactionCount.reaction);
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
                MessageObject messageObject3 = (MessageObject) this.f40797o6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.f40816q3 != null) {
                pc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.f40816q3)) {
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
            pc(true);
        }
    }

    public final void zb(org.telegram.ui.Cells.u1 u1Var) {
        if (getParentActivity() != null && u1Var != null && u1Var.ob != null && u1Var.getPrimaryMessageObject() != null && u1Var.getPrimaryMessageObject().messageOwner != null && u1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Xa) {
                this.Xa = true;
                if (this.f40931z1 != null) {
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
                this.f40931z1 = x3Var;
                x3Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                ei.x3 x3Var2 = this.f40931z1;
                x3Var2.h = ei.x3.a(x3Var2.getText(), this.f40931z1.getTextPaint());
                this.X0.addView(this.f40931z1, w7.z5.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.X0.post(new i0(23, this, u1Var));
            }
        }
    }

    public final void zc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.qn.zc():void");
    }

    @Override
    public final void O() {
    }

    public void aa(boolean z10) {
    }
}
