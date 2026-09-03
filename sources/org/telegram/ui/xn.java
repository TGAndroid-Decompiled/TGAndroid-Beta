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
public class xn extends org.telegram.ui.ActionBar.p2 implements NotificationCenter.NotificationCenterDelegate, jy, wc0, org.telegram.ui.Components.zj, org.telegram.ui.Components.rg, ag.b, org.telegram.ui.Components.s50, xd.b {
    public static int Ec = 22;
    public static float Fc = 1.4f;
    public static int Gc = 10;
    public static Pattern Hc;
    public static Pattern Ic;
    public static Pattern Jc;
    public static final int[] Kc = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean Lc = false;
    public static final Rect Mc = new Rect();
    public org.telegram.ui.Components.g90 A0;
    public TL_stories.TL_premium_boostsStatus A1;
    public final org.telegram.ui.ActionBar.l5[] A2;
    public boolean A3;
    public boolean A4;
    public TLRPC.PhotoSize A5;
    public final boolean[] A6;
    public int A7;
    public Paint A8;
    public boolean A9;
    public float Aa;
    public boolean Ab;
    public lf.e0 Ac;
    public final be.b B;
    public TextView B0;
    public ChannelBoostsController.CanApplyBoost B1;
    public final hg.q[] B2;
    public FlagSecureReason B3;
    public boolean B4;
    public TLObject B5;
    public final boolean[] B6;
    public boolean B7;
    public Matrix B8;
    public long B9;
    public fl Ba;
    public boolean Bb;
    public final ArrayList Bc;
    public final og.e C;
    public pk C0;
    public boolean C1;
    public NumberTextView C2;
    public boolean C3;
    public boolean C4;
    public int C5;
    public boolean C6;
    public boolean C7;
    public Paint C8;
    public int C9;
    public final nl Ca;
    public final RectF Cb;
    public final ArrayList Cc;
    public final int D;
    public RadialProgressView D0;
    public le D1;
    public int D2;
    public MessageObject D3;
    public int D4;
    public TLRPC.WebPage D5;
    public boolean D6;
    public boolean D7;
    public final Paint D8;
    public int D9;
    public final ql Da;
    public org.telegram.ui.ActionBar.d2 Db;
    public final Rect Dc;
    public final tg.d E;
    public AnimatorSet E0;
    public ImageView E1;
    public final AnimatorSet[] E2;
    public int E3;
    public ArrayList E4;
    public ArrayList E5;
    public boolean E6;
    public int E7;
    public float E8;
    public int E9;
    public ArrayList Ea;
    public long Eb;
    public final tg.d F;
    public boolean F0;
    public bk F1;
    public boolean F2;
    public MessageObject F3;
    public int F4;
    public String F5;
    public boolean F6;
    public boolean F7;
    public boolean F8;
    public int F9;
    public final yl Fa;
    public final ng Fb;
    public final og.a G;
    public qh.e3 G0;
    public oh.u2 G1;
    public ImageView G2;
    public MessageObject G3;
    public HashMap G4;
    public androidx.biometric.k G5;
    public int G6;
    public MessageObject G7;
    public View G8;
    public boolean G9;
    public final gi Ga;
    public int Gb;
    public final og.a H;
    public qh.e3 H0;
    public org.telegram.ui.ActionBar.r0 H1;
    public RadialProgressView H2;
    public vg.e H3;
    public final SparseArray H4;
    public TLRPC.ChatInvite H5;
    public int H6;
    public MessageObject H7;
    public float H8;
    public boolean H9;
    public final xi Ha;
    public boolean Hb;
    public final tg.e I;
    public qh.e3 I0;
    public TextView I1;
    public ImageView I2;
    public mh.d1 I3;
    public int I4;
    public le I5;
    public long I6;
    public int I7;
    public float I8;
    public boolean I9;
    public final kn Ia;
    public Pattern Ib;
    public final og.a J;
    public org.telegram.ui.Components.sg J0;
    public boolean J1;
    public AnimatorSet J2;
    public uf.y0 J3;
    public final int[] J4;
    public final LongSparseIntArray J5;
    public boolean J6;
    public boolean J7;
    public Integer J8;
    public org.telegram.ui.Components.li J9;
    public final lf Ja;
    public MessageObject Jb;
    public org.telegram.ui.ActionBar.d2 K;
    public boolean K0;
    public TextView K1;
    public FrameLayout K2;
    public vg.d K3;
    public int K4;
    public boolean K5;
    public long K6;
    public boolean K7;
    public int K8;
    public float K9;
    public final lf Ka;
    public df Kb;
    public boolean L;
    public ok L0;
    public TextView L1;
    public kk L2;
    public int L3;
    public boolean L4;
    public boolean L5;
    public final ArrayList L6;
    public long L7;
    public boolean L8;
    public float L9;
    public boolean La;
    public ArrayList Lb;
    public FrameLayout M;
    public xg.c M0;
    public wk M1;
    public TextView M2;
    public TL_account.TL_businessChatLink M3;
    public int M4;
    public long M5;
    public final Paint M6;
    public String M7;
    public AnimatorSet M8;
    public up M9;
    public boolean Ma;
    public final BotForumHelper.BotDraftAnimationsPool Mb;
    public fg.i0 N;
    public FrameLayout N0;
    public TextView N1;
    public TextView N2;
    public String N3;
    public int N4;
    public boolean N5;
    public final Paint N6;
    public Integer N7;
    public org.telegram.ui.ActionBar.p1 N8;
    public Animator N9;
    public long Na;
    public final vg.a Nb;
    public nk O;
    public LinearLayout O0;
    public org.telegram.ui.Components.w21 O1;
    public nk O2;
    public int O3;
    public boolean O4;
    public boolean O5;
    public final ColorMatrix O6;
    public byte[] O7;
    public boolean O8;
    public boolean O9;
    public NotificationCenter.ObserversGroup Oa;
    public boolean Ob;
    public vg.f P;
    public org.telegram.ui.Components.ho P0;
    public vf.e P1;
    public ImageView P2;
    public int P3;
    public boolean P4;
    public boolean P5;
    public final m.e3 P6;
    public int P7;
    public org.telegram.ui.ActionBar.g1[] P8;
    public boolean P9;
    public NotificationCenter.ObserversGroup Pa;
    public boolean Pb;
    public View Q;
    public qi Q0;
    public org.telegram.ui.Components.g90 Q1;
    public ImageView Q2;
    public boolean Q3;
    public AnimatorSet Q4;
    public long Q5;
    public final org.telegram.ui.ActionBar.h5 Q6;
    public int Q7;
    public org.telegram.ui.ActionBar.g1 Q8;
    public xn Q9;
    public boolean Qa;
    public boolean Qb;
    public FrameLayout R;
    public vf.q1 R0;
    public ImageView R1;
    public org.telegram.ui.Components.k6 R2;
    public String R3;
    public final SparseIntArray R4;
    public Long R5;
    public long R6;
    public le R7;
    public final ak R8;
    public float R9;
    public int Ra;
    public long Rb;
    public FrameLayout S;
    public vf.u S0;
    public sh.l S1;
    public org.telegram.ui.Components.k6 S2;
    public byte[] S3;
    public final SparseIntArray S4;
    public int S5;
    public int S6;
    public String S7;
    public km S8;
    public AnimatorSet S9;
    public int Sa;
    public boolean Sb;
    public final vg.j T;
    public vg.i T0;
    public TextView T1;
    public org.telegram.ui.Components.k6 T2;
    public String T3;
    public boolean T4;
    public final SparseArray[] T5;
    public int T6;
    public ChatObject.Call T7;
    public rk T8;
    public final kk T9;
    public boolean Ta;
    public boolean Tb;
    public xg.f U;
    public pm U0;
    public dk U1;
    public zj U2;
    public MessageObject U3;
    public boolean U4;
    public final SparseArray[] U5;
    public final Matrix U6;
    public boolean U7;
    public int U8;
    public ih.k U9;
    public boolean Ua;
    public boolean Ub;
    public jk V;
    public org.telegram.ui.Components.bo V0;
    public FrameLayout V1;
    public yj V2;
    public MessageObject V3;
    public boolean V4;
    public final SparseArray[] V5;
    public LinearGradient V6;
    public boolean V7;
    public int V8;
    public ng.v V9;
    public a0.h Va;
    public boolean Vb;
    public lk W;
    public final ArrayList W0;
    public dk W1;
    public org.telegram.ui.Cells.v0 W2;
    public boolean W3;
    public boolean W4;
    public boolean W5;
    public int W6;
    public TLRPC.ChatFull W7;
    public int W8;
    public w41 W9;
    public a0.h Wa;
    public a9 Wb;
    public eg.s2 X;
    public lj X0;
    public FrameLayout X1;
    public int X2;
    public ArrayList X3;
    public boolean X4;
    public int X5;
    public int X6;
    public TLRPC.UserFull X7;
    public boolean X8;
    public boolean X9;
    public long Xa;
    public int Xb;
    public int Y;
    public org.telegram.ui.Components.k6 Y0;
    public TextView Y1;
    public dl Y2;
    public MessageObject Y3;
    public boolean Y4;
    public int Y5;
    public final Paint Y6;
    public org.telegram.ui.Cells.f6 Y7;
    public boolean Y8;
    public org.telegram.ui.Components.mp Y9;
    public al Ya;
    public ValueAnimator Yb;
    public org.telegram.ui.ActionBar.u0 Z;
    public hh Z0;
    public org.telegram.ui.Components.u00 Z1;
    public View Z2;
    public TLRPC.TL_forumTopic Z3;
    public MessageObject Z4;
    public int Z5;
    public final Matrix Z6;
    public b11 Z7;
    public qm Z8;
    public vn Z9;
    public boolean Za;
    public si Zb;
    public int f43090a;
    public ds f43091a0;
    public org.telegram.ui.Components.qy0 f43092a1;
    public org.telegram.ui.Components.zw0 a2;
    public boolean f43093a3;
    public long f43094a4;
    public MessageObject f43095a5;
    public int f43096a6;
    public LinearGradient f43097a7;
    public final a0.h f43098a8;
    public org.telegram.ui.Cells.t1 f43099a9;
    public xn f43100aa;
    public boolean f43101ab;
    public boolean f43102ac;
    public boolean f43103b;
    public org.telegram.ui.ActionBar.y f43104b0;
    public org.telegram.ui.ActionBar.u0 f43105b1;
    public org.telegram.ui.Components.m40 f43106b2;
    public boolean f43107b3;
    public int f43108b4;
    public MessageObject.GroupedMessages f43109b5;
    public int f43110b6;
    public boolean f43111b7;
    public String f43112b8;
    public boolean f43113b9;
    public vn f43114ba;
    public boolean f43115bb;
    public int f43116bc;
    public boolean f43117c;
    public org.telegram.ui.ActionBar.u0 f43118c0;
    public org.telegram.ui.ActionBar.u0 f43119c1;
    public org.telegram.ui.Components.m40 f43120c2;
    public boolean c3;
    public TLRPC.Chat f43121c4;
    public MessagePreviewParams f43122c5;
    public int f43123c6;
    public boolean f43124c7;
    public long f43125c8;
    public boolean f43126c9;
    public kh.e f43127ca;
    public ArrayList f43128cb;
    public int f43129cc;
    public boolean d;
    public org.telegram.ui.ActionBar.u0 f43130d0;
    public org.telegram.ui.ActionBar.u0 f43131d1;
    public ej f43132d2;
    public AnimatorSet f43133d3;
    public boolean f43134d4;
    public MessageSuggestionParams f43135d5;
    public int f43136d6;
    public int f43137d7;
    public String f43138d8;
    public boolean f43139d9;
    public final ChatMessagesMetadataController f43140da;
    public ValueAnimator f43141db;
    public int f43142dc;
    public TLRPC.Chat f43143e;
    public org.telegram.ui.ActionBar.w0 f43144e0;
    public org.telegram.ui.ActionBar.u0 f43145e1;
    public boolean f43146e2;
    public ValueAnimator f43147e3;
    public boolean f43148e4;
    public MessageObject f43149e5;
    public final ArrayList e6;
    public boolean f43150e7;
    public boolean f43151e8;
    public ol f43152e9;
    public TLRPC.TL_channels_sendAsPeers f43153ea;
    public boolean f43154eb;
    public int f43155ec;
    public TLRPC.User f43156f;
    public org.telegram.ui.ActionBar.y f43157f0;
    public org.telegram.ui.Components.no f43158f1;
    public org.telegram.ui.Components.m40 f43159f2;
    public float f43160f3;
    public boolean f43161f4;
    public MessageObject.GroupedMessages f43162f5;
    public boolean f43163f6;
    public boolean f43164f7;
    public boolean f43165f8;
    public boolean f43166f9;
    public TL_account.resolvedBusinessChatLinks fa;
    public Boolean f43167fb;
    public int f43168fc;
    public org.telegram.ui.ActionBar.w0 f43169g0;
    public xg.g f43170g1;
    public boolean f43171g2;
    public boolean f43172g3;
    public boolean f43173g4;
    public MessageObject.GroupedMessages f43174g5;
    public int f43175g6;
    public int f43176g7;
    public String f43177g8;
    public float f43178g9;
    public boolean f43179ga;
    public boolean f43180gb;
    public boolean f43181gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.w0 f43182h0;
    public boolean f43183h1;
    public org.telegram.ui.Components.m40 f43184h2;
    public boolean f43185h3;
    public int f43186h4;
    public MessageObject f43187h5;
    public int f43188h6;
    public boolean f43189h7;
    public String f43190h8;
    public ck h9;
    public boolean f43191ha;
    public boolean f43192hb;
    public long f43193hc;
    public org.telegram.ui.ActionBar.u0 f43194i0;
    public int f43195i1;
    public org.telegram.ui.Components.m40 f43196i2;
    public boolean f43197i3;
    public int f43198i4;
    public nn f43199i5;
    public int f43200i6;
    public boolean f43201i7;
    public MessageObject f43202i8;
    public org.telegram.ui.Cells.t1 f43203i9;
    public float f43204ia;
    public int f43205ib;
    public TLRPC.TL_messages_discussionMessage ic;
    public org.telegram.ui.ActionBar.w0 f43206j0;
    public int f43207j1;
    public org.telegram.ui.Components.m40 f43208j2;
    public boolean f43209j3;
    public int f43210j4;
    public boolean f43211j5;
    public boolean f43212j6;
    public boolean f43213j7;
    public MessageObject f43214j8;
    public org.telegram.ui.Components.s00 f43215j9;
    public final ig f43216ja;
    public HashMap f43217jb;
    public TLRPC.messages_Messages jc;
    public org.telegram.ui.ActionBar.y f43218k0;
    public org.telegram.ui.Components.ic f43219k1;
    public org.telegram.ui.Components.m40 f43220k2;
    public boolean f43221k3;
    public uh f43222k4;
    public MessageObject f43223k5;
    public final ArrayList f43224k6;
    public int f43225k7;
    public int f43226k8;
    public boolean f43227k9;
    public final tk f43228ka;
    public lf f43229kb;
    public boolean f43230kc;
    public boolean f43231l0;
    public vk l1;
    public org.telegram.ui.Components.m40 f43232l2;
    public TLRPC.User f43233l3;
    public final SparseArray f43234l4;
    public int f43235l5;
    public final SparseArray[] f43236l6;
    public int f43237l7;
    public boolean f43238l8;
    public boolean f43239l9;
    public int f43240la;
    public int f43241lb;
    public pn f43242lc;
    public RadialProgressView m0;
    public hk f43243m1;
    public org.telegram.ui.Cells.t1 f43244m2;
    public TLRPC.Chat f43245m3;
    public final ArrayList f43246m4;
    public MessageObject f43247m5;
    public final SparseArray f43248m6;
    public boolean f43249m7;
    public long f43250m8;
    public ValueAnimator m9;
    public int f43251ma;
    public org.telegram.ui.ActionBar.d2 f43252mb;
    public jn f43253mc;
    public boolean f43254n;
    public org.telegram.ui.ActionBar.u0 f43255n0;
    public ek f43256n1;
    public int f43257n2;
    public ng.q0 f43258n3;
    public int f43259n4;
    public boolean f43260n5;
    public final SparseArray f43261n6;
    public le f43262n7;
    public long f43263n8;
    public ValueAnimator f43264n9;
    public lf f43265na;
    public int f43266nb;
    public mh.l5 nc;
    public org.telegram.ui.ActionBar.u0 f43267o0;
    public int f43268o1;
    public int f43269o2;
    public boolean f43270o3;
    public boolean f43271o4;
    public boolean f43272o5;
    public final HashMap f43273o6;
    public String f43274o7;
    public boolean f43275o8;
    public boolean f43276o9;
    public boolean oa;
    public int f43277ob;
    public boolean f43278oc;
    public org.telegram.ui.ActionBar.u0 f43279p0;
    public boolean f43280p1;
    public org.telegram.ui.Components.m40 f43281p2;
    public boolean f43282p3;
    public boolean f43283p4;
    public boolean f43284p5;
    public final SparseArray f43285p6;
    public boolean f43286p7;
    public String f43287p8;
    public float f43288p9;
    public boolean f43289pa;
    public boolean f43290pb;
    public float f43291pc;
    public org.telegram.ui.ActionBar.u0 f43292q0;
    public org.telegram.ui.Components.h40 f43293q1;
    public org.telegram.ui.Components.m40 f43294q2;
    public String f43295q3;
    public int f43296q4;
    public boolean f43297q5;
    public final a0.h f43298q6;
    public boolean f43299q7;
    public nk f43300q8;
    public float f43301q9;
    public long f43302qa;
    public int qb;
    public float f43303qc;
    public long f43304r;
    public ClippingImageView f43305r0;
    public org.telegram.ui.ActionBar.d2 f43306r1;
    public org.telegram.ui.Components.m40 f43307r2;
    public String f43308r3;
    public final ArrayList f43309r4;
    public int f43310r5;
    public final ArrayList f43311r6;
    public int f43312r7;
    public org.telegram.ui.Cells.t1 f43313r8;
    public int f43314r9;
    public int f43315ra;
    public boolean f43316rb;
    public final xd.a f43317rc;
    public final HashMap f43318s;
    public org.telegram.ui.Components.a11 f43319s0;
    public qh.e3 f43320s1;
    public org.telegram.ui.Components.qp f43321s2;
    public int f43322s3;
    public final HashMap f43323s4;
    public int f43324s5;
    public final SparseArray s6;
    public int f43325s7;
    public o4 f43326s8;
    public int s9;
    public int f43327sa;
    public int sb;
    public final xd.a f43328sc;
    public f2.o0 f43329t0;
    public qh.e3 f43330t1;
    public View f43331t2;
    public int f43332t3;
    public MessageObject f43333t4;
    public TLRPC.PhotoSize f43334t5;
    public final a0.h t6;
    public int f43335t7;
    public TextureView f43336t8;
    public float t9;
    public sk f43337ta;
    public int f43338tb;
    public final xd.a f43339tc;
    public qj f43340u0;
    public qh.e3 f43341u1;
    public hl f43342u2;
    public int f43343u3;
    public int f43344u4;
    public TLRPC.PhotoSize f43345u5;
    public final a0.h f43346u6;
    public int f43347u7;
    public boolean f43348u8;
    public float f43349u9;
    public uk f43350ua;
    public int f43351ub;
    public final xd.a f43352uc;
    public final dh.i v;
    public sj f43353v0;
    public qh.e3 f43354v1;
    public fg.i0 f43355v2;
    public UndoView f43356v3;
    public int f43357v4;
    public TLObject f43358v5;
    public final int[] f43359v6;
    public int f43360v7;
    public final lf f43361v8;
    public float f43362v9;
    public float f43363va;
    public CharacterStyle f43364vb;
    public final xd.a f43365vc;
    public fj f43366w;
    public tj f43367w0;
    public qh.e3 f43368w1;
    public org.telegram.ui.Components.cg0 f43369w2;
    public gl f43370w3;
    public final ArrayList f43371w4;
    public int f43372w5;
    public final int[] f43373w6;
    public int f43374w7;
    public final tg.b f43375w8;
    public float f43376w9;
    public int f43377wa;
    public String f43378wb;
    public final xd.a f43379wc;
    public fj f43380x;
    public jm f43381x0;
    public qh.e3 f43382x1;
    public boolean f43383x2;
    public org.telegram.ui.Components.ic f43384x3;
    public int f43385x4;
    public int f43386x5;
    public final int[] f43387x6;
    public boolean f43388x7;
    public final og.a f43389x8;
    public float f43390x9;
    public int f43391xa;
    public af.f f43392xb;
    public final xd.a f43393xc;
    public final be.b f43394y;
    public qk f43395y0;
    public vl f43396y1;
    public final org.telegram.ui.Components.p9[] f43397y2;
    public boolean f43398y3;
    public int f43399y4;
    public boolean f43400y5;
    public final int[] f43401y6;
    public int f43402y7;
    public Bitmap f43403y8;
    public TLRPC.Document f43404y9;
    public ChatMessageSharedResources f43405ya;
    public boolean f43406yb;
    public final h5.u f43407yc;
    public boolean f43408z0;
    public float f43409z1;
    public final wn[] f43410z2;
    public int f43411z3;
    public lf z4;
    public TLRPC.PhotoSize f43412z5;
    public final boolean[] f43413z6;
    public int f43414z7;
    public BitmapShader f43415z8;
    public boolean f43416z9;
    public ValueAnimator za;
    public le zb;
    public eh.f f43417zc;

    public xn(Bundle bundle) {
        super(bundle);
        this.f43090a = 0;
        this.f43117c = false;
        this.d = false;
        this.f43318s = new HashMap();
        this.v = new dh.i(new lf(this, 18));
        be.b bVar = new be.b(true);
        this.f43394y = bVar;
        be.b bVar2 = new be.b(true);
        this.B = bVar2;
        this.T = new vg.j();
        this.W0 = new ArrayList();
        this.f43397y2 = new org.telegram.ui.Components.p9[2];
        this.f43410z2 = new wn[2];
        this.A2 = new org.telegram.ui.ActionBar.l5[2];
        this.B2 = new hg.q[2];
        this.E2 = new AnimatorSet[2];
        this.F2 = false;
        this.X2 = 500;
        this.M3 = null;
        this.P3 = -1;
        this.W3 = true;
        this.f43234l4 = new SparseArray();
        this.f43246m4 = new ArrayList();
        this.f43309r4 = new ArrayList();
        this.f43323s4 = new HashMap();
        this.f43344u4 = -1;
        this.f43357v4 = 0;
        this.f43371w4 = new ArrayList(10);
        this.E4 = new ArrayList();
        this.G4 = new HashMap();
        this.H4 = new SparseArray();
        this.J4 = new int[1];
        this.R4 = new SparseIntArray();
        this.S4 = new SparseIntArray();
        this.W4 = true;
        this.Y4 = true;
        this.f43260n5 = true;
        this.f43297q5 = true;
        this.J5 = new LongSparseIntArray();
        this.S5 = 1;
        this.T5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.U5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.V5 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.e6 = new ArrayList();
        this.f43163f6 = true;
        this.f43188h6 = Integer.MIN_VALUE;
        this.f43224k6 = new ArrayList();
        this.f43236l6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f43248m6 = new SparseArray();
        this.f43261n6 = new SparseArray();
        this.f43273o6 = new HashMap();
        this.f43285p6 = new SparseArray();
        this.f43298q6 = new a0.h();
        this.f43311r6 = new ArrayList();
        this.s6 = new SparseArray();
        this.t6 = new a0.h();
        this.f43346u6 = new a0.h();
        this.f43359v6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.f43373w6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f43387x6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.f43401y6 = new int[2];
        this.f43413z6 = new boolean[2];
        this.A6 = new boolean[2];
        this.B6 = new boolean[]{true, true};
        this.D6 = true;
        this.E6 = true;
        this.H6 = 0;
        this.L6 = new ArrayList();
        this.M6 = new Paint(1);
        this.N6 = new Paint(1);
        this.O6 = new ColorMatrix();
        this.P6 = new m.e3();
        this.Q6 = new org.telegram.ui.ActionBar.h5(0, false, false, new mj(this));
        this.U6 = new Matrix();
        Paint paint = new Paint(1);
        this.Y6 = paint;
        this.Z6 = new Matrix();
        this.f43225k7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.f43347u7 = Integer.MAX_VALUE;
        this.f43360v7 = -1;
        this.D7 = true;
        this.I7 = Integer.MAX_VALUE;
        this.P7 = -1;
        this.Q7 = -10000;
        this.f43098a8 = new a0.h();
        this.f43361v8 = new lf(this, 23);
        tg.b bVar3 = new tg.b();
        this.f43375w8 = bVar3;
        og.a aVar = new og.a(bVar3);
        this.f43389x8 = aVar;
        this.D8 = new Paint(1);
        this.E8 = 0.0f;
        this.H8 = 1.0f;
        this.I8 = 0.0f;
        this.O8 = true;
        this.R8 = new ak(this);
        this.f43227k9 = true;
        this.T9 = new kk(this, 0);
        this.f43140da = new ChatMessagesMetadataController(this);
        this.f43216ja = new ig(this, 0);
        this.f43228ka = new tk(this);
        this.f43251ma = -1;
        this.Ca = new nl(this);
        this.Da = new ql(this);
        this.Fa = new yl(this);
        this.Ga = new gi(this);
        this.Ha = new xi(this);
        this.Ia = new kn(this);
        this.Ja = new lf(this, 26);
        this.Ka = new lf(this, 27);
        this.f43101ab = false;
        this.Cb = new RectF();
        this.Fb = new ng(this, 1);
        this.Mb = new BotForumHelper.BotDraftAnimationsPool();
        this.Nb = new Object();
        this.f43102ac = false;
        org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
        this.f43317rc = new xd.a(0, this, prVar, 320L, false);
        this.f43328sc = new xd.a(1, this, prVar, 520L, false);
        this.f43339tc = new xd.a(2, this, prVar, 520L, false);
        this.f43352uc = new xd.a(3, this, prVar, 320L, false);
        this.f43365vc = new xd.a(4, this, prVar, 320L, false);
        this.f43379wc = new xd.a(5, this, prVar, 320L, false);
        this.f43393xc = new xd.a(6, this, prVar, 320L, false);
        ng ngVar = new ng(this, 5);
        ?? obj = new Object();
        obj.f7300b = new float[32];
        obj.f7299a = 1;
        obj.d = new xd.j(obj, wd.a.f49529a, 240L);
        obj.f7301c = ngVar;
        this.f43407yc = obj;
        this.Bc = new ArrayList();
        this.Cc = new ArrayList();
        this.Dc = new Rect();
        ?? obj2 = new Object();
        this.I = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            og.e eVar = new og.e(false);
            this.C = eVar;
            this.D = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            tg.d dVar = new tg.d(obj2);
            this.F = dVar;
            dVar.v = new ng(this, 8);
            dVar.d = eVar;
            dVar.f48126e = -3;
            dVar.f48127f = obj2;
            og.a aVar2 = new og.a(dVar);
            this.H = aVar2;
            aVar2.f16757f = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                tg.d dVar2 = new tg.d(obj2);
                this.E = dVar2;
                dVar2.v = new ng(this, 8);
                dVar2.d = eVar;
                dVar2.f48126e = -2;
                dVar2.f48127f = obj2;
                og.a aVar3 = new og.a(dVar2);
                this.G = aVar3;
                aVar3.f16757f = LiteMode.isEnabled(262144);
            } else {
                this.E = null;
                this.G = aVar2;
            }
        } else {
            this.C = null;
            this.D = 0;
            this.E = null;
            this.F = null;
            this.G = new og.a(obj2);
            this.H = new og.a(obj2);
        }
        og.a aVar4 = new og.a(obj2);
        this.J = aVar4;
        aVar4.f16755c = bVar;
        this.G.f16755c = bVar;
        this.H.f16755c = bVar;
        aVar.f16755c = new be.b(true);
        aVar4.f16754b = bVar2;
        this.G.f16754b = bVar2;
        this.H.f16754b = bVar2;
        aVar.f16754b = bVar2;
    }

    public static void A0(xn xnVar) {
        org.telegram.ui.Components.n40.h.a();
        xnVar.showDialog(new lh.g2(xnVar.getParentActivity(), xnVar.currentAccount, xnVar.a(), null, null));
    }

    public static org.telegram.ui.qu0 A1(org.telegram.ui.xn r16, org.telegram.messenger.MessageObject r17, org.telegram.tgnet.TLRPC.FileLocation r18, int r19, boolean r20, boolean r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.A1(org.telegram.ui.xn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    public static void B0(xn xnVar) {
        xnVar.Y9 = null;
        xnVar.f43340u0.setOnInterceptTouchListener(null);
        xnVar.jb(xnVar.U0, true);
        ChatThemeController.getInstance(xnVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void B1(xn xnVar) {
        SparseArray[] sparseArrayArr = xnVar.T5;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) xnVar.f43236l6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            xnVar.U5[i10].clear();
            xnVar.V5[i10].clear();
        }
        if (xnVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(xnVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(xnVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception unused) {
                        intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                xnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        xnVar.c9();
        xnVar.yc(0, true);
        xnVar.Wc(false);
        xnVar.Lc();
    }

    public static CharSequence B8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.d31.k(messageObject)) {
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

    public static void C0(xn xnVar) {
        if (xnVar.U2.getAlpha() != 0.0f && !xnVar.actionBar.s() && !xnVar.A9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(xnVar.U2.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            xnVar.G9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static TLRPC.TL_message C7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20866id = message.f20866id;
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

    public static void D0(org.telegram.ui.xn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.t1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.D0(org.telegram.ui.xn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1, int, int):void");
    }

    public static SpannableStringBuilder D8(MessageObject messageObject, boolean z4, long j10) {
        TLRPC.Chat chat;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z4) {
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

    public static void E0(xn xnVar) {
        xnVar.G7(false);
        if (!xnVar.fragmentBeginToShow) {
            qj qjVar = xnVar.f43340u0;
            qjVar.V1 = false;
            qjVar.W1 = 0;
            qjVar.setEmptyView(xnVar.N0);
            qj qjVar2 = xnVar.f43340u0;
            qjVar2.V1 = true;
            qjVar2.W1 = 1;
            return;
        }
        xnVar.f43340u0.setEmptyView(xnVar.N0);
    }

    public static void F0(org.telegram.ui.xn r19, org.telegram.ui.mk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.F0(org.telegram.ui.xn, org.telegram.ui.mk, boolean[]):void");
    }

    public static void G0(xn xnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(xnVar.currentAccount).getInputUser(user.f20992id);
                    ConnectionsManager.getInstance(xnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new eg.b3(26, xnVar, user));
                }
            }
        }
    }

    public static void G1(xn xnVar) {
        int i10;
        if (xnVar.a() == xnVar.getUserConfig().getClientUserId() && xnVar.getUserConfig().isPremium() && xnVar.Ya == null) {
            al alVar = new al(xnVar, xnVar, xnVar.getParentActivity(), xnVar.currentAccount, xnVar.f43114ba);
            xnVar.Ya = alVar;
            alVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            xnVar.Ya.setDelegate(new bl(xnVar));
            xnVar.Ya.setTop(true);
            int i11 = 0;
            xnVar.Ya.setClipChildren(false);
            xnVar.Ya.setClipToPadding(false);
            xnVar.Ya.setVisibility(0);
            al alVar2 = xnVar.Ya;
            if (alVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            alVar2.setHint(LocaleController.getString(i10));
            xnVar.U0.addView(xnVar.Ya, k7.c6.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            xnVar.Ya.p(null, null, true);
            xnVar.Ya.setTranslationY(-AndroidUtilities.dp(12.0f));
            xnVar.Ya.setScaleY(0.4f);
            xnVar.Ya.setScaleX(0.4f);
            xnVar.Ya.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.pr.h).start();
            xnVar.Lc();
            al alVar3 = xnVar.Ya;
            float f10 = xnVar.t9;
            vk vkVar = xnVar.l1;
            if (vkVar != null) {
                i11 = vkVar.getCurrentHeight();
            }
            alVar3.setTranslationY(f10 + i11);
        }
    }

    public static java.util.ArrayList H7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.H7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void I0(xn xnVar, String str) {
        Uri parse = Uri.parse(str);
        g60.b(xnVar.getParentActivity(), xnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void J0(xn xnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        fg.d2 d2Var = new fg.d2(xnVar, xnVar.currentAccount, user, null, null, xnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            d2Var.A0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(xnVar.getParentActivity());
        org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(160.0f), 4, p9Var, false);
        p9Var.setImageDrawable(j5Var);
        p9Var.addOnAttachStateChangeListener(new h5(j5Var, 1));
        j5Var.j(j10, false);
        d2Var.B0 = true;
        d2Var.f6297y0 = p9Var;
        xnVar.showDialog(d2Var);
    }

    public static void J3(xn xnVar) {
        org.telegram.ui.ActionBar.y yVar;
        if (!xnVar.f43101ab && (yVar = xnVar.f43157f0) != null) {
            yVar.a();
            org.telegram.ui.ActionBar.w0 w0Var = yVar.f22462m;
            w0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (xnVar.O3 == 0) {
                w0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            w0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            w0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e51(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            w0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = xnVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f30949a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.t01(obj, 0), 0, spannableStringBuilder4.length(), 33);
                w0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f30949a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.t01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                w0Var.g(56, spannableStringBuilder5);
            }
            w0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (xnVar.h == null) {
                w0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            w0Var.g(54, LocaleController.getString(R.string.Regular));
            xnVar.f43101ab = true;
        }
    }

    public static FrameLayout J7(Context context, org.telegram.ui.ActionBar.g6 g6Var, CharSequence charSequence, int i10) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        hg.q qVar = new hg.q(context, 11);
        int i11 = 3;
        qVar.setMaxLines(3);
        qVar.setGravity(3);
        qVar.setEllipsize(TextUtils.TruncateAt.END);
        qVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.E8, g6Var));
        qVar.setTextSize(1, i10);
        qVar.setMaxWidth(AndroidUtilities.dp(170.0f));
        qVar.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(qVar, k7.c6.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void K0(xn xnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            mh.ja.j1(xnVar.getParentActivity(), xnVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, xnVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            xnVar.presentFragment(new lo0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void L0(xn xnVar) {
        if (AndroidUtilities.addToClipboard(xnVar.Jb.sponsoredInfo)) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.resourceProvider));
        }
    }

    public static void M0(xn xnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = xnVar.F1.getAdapter().f48753t0;
        int i10 = xnVar.currentAccount;
        TLRPC.User user2 = xnVar.f43156f;
        if (user2 != null) {
            j10 = user2.f20992id;
        } else {
            j10 = xnVar.f43143e.f20845id;
        }
        sh.y3 b10 = sh.y3.b(i10, j10, user.f20992id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, xnVar.N8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.D1.P().m(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(xnVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(xnVar.currentAccount);
            MessagesController.showCantOpenAlert(xnVar, restrictionReason);
            return;
        }
        sh.p2 p2Var = new sh.p2(xnVar.getParentActivity(), xnVar.getResourceProvider());
        p2Var.w(false);
        p2Var.f47649x0 = true;
        p2Var.f47629h0 = xnVar.getParentActivity();
        p2Var.s(xnVar, b10);
        p2Var.show();
    }

    public static void N0(xn xnVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (xnVar.f43205ib != i10) {
            return;
        }
        if (bool.booleanValue()) {
            xnVar.D5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                xnVar.D5 = null;
                MessagePreviewParams messagePreviewParams = xnVar.f43122c5;
                if (messagePreviewParams != null) {
                    int i11 = xnVar.currentAccount;
                    CharSequence fieldText = xnVar.V.getFieldText();
                    MessageObject messageObject3 = xnVar.f43223k5;
                    if (messageObject3 == xnVar.U3) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, xnVar.f43199i5, xnVar.f43247m5);
                }
                xnVar.j8();
                return;
            }
            boolean z4 = webPage instanceof TLRPC.TL_webPagePending;
            if (z4) {
                xnVar.F5 = str;
            }
            if (xnVar.h != null && z4) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = xnVar.f43122c5;
            if (messagePreviewParams2 != null) {
                int i12 = xnVar.currentAccount;
                CharSequence fieldText2 = xnVar.V.getFieldText();
                MessageObject messageObject4 = xnVar.f43223k5;
                if (messageObject4 == xnVar.U3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, xnVar.f43199i5, xnVar.f43247m5);
            }
            xnVar.Eb(true, xnVar.D5, false);
            return;
        }
        xnVar.D5 = null;
        xnVar.j8();
    }

    public static void O0(xn xnVar, Long l10, Boolean bool) {
        int i10;
        int i11;
        if (l10.longValue() != xnVar.b()) {
            xnVar.Xa = SystemClock.uptimeMillis();
            xnVar.f43249m7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                xnVar.Sa(xnVar.b());
            } else if (xnVar.b() == 0) {
                xnVar.Sa(l10.longValue());
            } else {
                xnVar.f43225k7 = -1;
            }
            xnVar.getConnectionsManager().cancelRequestsForGuid(xnVar.classGuid);
            xnVar.getMessagesStorage().cancelTasksForGuid(xnVar.classGuid);
            xnVar.classGuid = ConnectionsManager.generateClassGuid();
            xnVar.Pa();
            xnVar.f43122c5 = null;
            xnVar.f43312r7 = 0;
            xnVar.f43189h7 = false;
            xnVar.f43201i7 = true;
            xnVar.e6.clear();
            xnVar.f43094a4 = l10.longValue();
            TLRPC.TL_forumTopic findTopic = xnVar.getMessagesController().getTopicsController().findTopic(-xnVar.a(), l10.longValue());
            if (l10.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                xnVar.f43186h4 = i12;
                xnVar.f43198i4 = findTopic.read_outbox_max_id;
                xnVar.f43210j4 = Math.max(1, i12);
                xnVar.getMessagesController().getTopicsController().getTopicRepliesCount(xnVar.Q5, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                xnVar.Z3 = null;
                xnVar.X3 = null;
                xnVar.U3 = null;
                xnVar.f43223k5 = null;
                xnVar.f43186h4 = 0;
                xnVar.f43198i4 = 0;
                xnVar.f43210j4 = 0;
                xnVar.f43094a4 = 0L;
                xnVar.f43108b4 = 0;
                xnVar.f43121c4 = null;
                xnVar.f43148e4 = false;
                xnVar.f43134d4 = false;
            }
            xnVar.r8();
            xnVar.Nc(true);
            xnVar.X0.n(true);
            xnVar.X0.b();
            xnVar.O1.setCurrentTopic(l10.longValue());
            xnVar.Qc(true);
            xnVar.hc(true);
            xnVar.getMessagesController().setForumLastTopicId(-xnVar.a(), xnVar.b());
            xnVar.g9(true);
            xnVar.e9(true);
            jk jkVar = xnVar.V;
            if (jkVar != null) {
                jkVar.m0(false);
                xnVar.V.G1(true);
            }
            xnVar.A6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            xnVar.f43195i1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            xnVar.f43207j1 = i11;
            xnVar.Bc(false);
            xnVar.Ac(false);
            xnVar.Rc();
            pn pnVar = xnVar.f43242lc;
            if (pnVar != null && xnVar.actionBar.f21548k0) {
                pnVar.p(null);
            }
        }
    }

    public static i5.v O4(xn xnVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = xnVar.getMessagesController().createDeleteShowOnceTask(xnVar.Q5, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                xnVar.tc(arrayList, true);
            }
            return new i5.v(xnVar, createDeleteShowOnceTask, messageObject, 15);
        }
        return null;
    }

    public static void P0(xn xnVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = xnVar.getParentActivity();
        int i12 = xnVar.currentAccount;
        long j10 = xnVar.Q5;
        vn vnVar = xnVar.f43114ba;
        int i13 = org.telegram.ui.Components.ho.I;
        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(parentActivity, vnVar, false, false);
        h3Var.fixNavigationBar(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21733h5, vnVar));
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        imageView.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, vnVar)));
        linearLayout.addView((View) imageView, k7.c6.t(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.k6.f21768j5;
        textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, vnVar));
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, k7.c6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i14, vnVar));
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
        b.o(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, k7.c6.t(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            fg.b1 b1Var = new fg.b1(parentActivity, vnVar, true);
            b1Var.setOnClickListener(new org.telegram.ui.Components.a3(h3Var, 1));
            b1Var.c(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(b1Var, k7.c6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        h3Var.setCustomView(linearLayout);
        h3Var.show();
    }

    public static void Q0(xn xnVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f20886id = xnVar.getMessagesController().getInputUser(xnVar.f43156f);
            xnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new oe(xnVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(xnVar.getUserConfig().getCurrentUser(), xnVar.Q5, messageObject, xnVar.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = xnVar.C8();
        SendMessagesHelper.getInstance(xnVar.currentAccount).sendMessage(of2);
        if (xnVar.O3 == 0) {
            xnVar.O9(false);
        }
        xnVar.e9(false);
    }

    public static xn Q9(int i10, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i10);
        return new xn(bundle);
    }

    public static boolean R0(xn xnVar) {
        MessageObject messageObject = xnVar.Jb;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static xn R9(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new xn(bundle);
    }

    public static void S0(xn xnVar, int i10) {
        int i11;
        RectF rectF;
        tg.d dVar = xnVar.E;
        tg.d dVar2 = xnVar.F;
        ArrayList arrayList = xnVar.Cc;
        og.e eVar = xnVar.C;
        int i12 = Build.VERSION.SDK_INT;
        if (i12 >= 31 && eVar != null) {
            if (k7.x8.a(i10, 4)) {
                xnVar.p9();
            }
            if (k7.x8.a(i10, 2)) {
                ArrayList arrayList2 = xnVar.Bc;
                if (i12 >= 29) {
                    if (dVar2 != null) {
                        if (arrayList2.isEmpty()) {
                            rectF = new RectF();
                            arrayList2.add(rectF);
                        } else {
                            rectF = (RectF) arrayList2.get(0);
                        }
                        rectF.set(0.0f, 0.0f, xnVar.U0.getMeasuredWidth(), xnVar.f43340u0.getY() + xnVar.f43340u0.getPaddingTop());
                        rectF.inset(0.0f, -AndroidUtilities.dp(45.0f));
                        i11 = dVar2.d(arrayList2, 1, AndroidUtilities.dp(48.0f)) + 1;
                    } else {
                        i11 = 0;
                    }
                    if (dVar != null) {
                        i11 += dVar.d(arrayList2, i11, AndroidUtilities.dp(8.0f));
                    }
                } else {
                    i11 = 0;
                }
                int a2 = lf.l0.a(i11, arrayList2, arrayList);
                int measuredWidth = xnVar.U0.getMeasuredWidth();
                for (int i13 = 0; i13 < a2; i13++) {
                    RectF rectF2 = (RectF) arrayList.get(i13);
                    float f10 = measuredWidth;
                    rectF2.left = k7.o.a(rectF2.left, 0.0f, f10);
                    rectF2.top = Math.max(xnVar.f43340u0.getY(), rectF2.top);
                    rectF2.right = k7.o.a(rectF2.right, 0.0f, f10);
                    rectF2.bottom = Math.min(xnVar.f43340u0.getY() + xnVar.f43340u0.getMeasuredHeight(), rectF2.bottom);
                }
                eVar.g(a2, arrayList);
            }
            pm pmVar = xnVar.U0;
            Objects.requireNonNull(pmVar);
            if (eVar.e(new yf(pmVar, 0), xnVar.U0.getWidth(), xnVar.U0.getHeight())) {
                if (dVar != null) {
                    dVar.e();
                }
                if (dVar2 != null) {
                    dVar2.e();
                }
                org.telegram.ui.ActionBar.k kVar = xnVar.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                xnVar.n9();
            }
        }
    }

    public static void T0(xn xnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(xnVar.currentAccount).getInputUser(user.f20992id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(xnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mh(xnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static MessageObject T1(xn xnVar) {
        org.telegram.ui.Cells.t1 t1Var = xnVar.f43099a9;
        if (e2.c.s(t1Var)) {
            return t1Var.getMessageObject();
        }
        return null;
    }

    public static void U(org.telegram.ui.xn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.U(org.telegram.ui.xn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void U0(xn xnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z4, pf pfVar) {
        String str4;
        org.telegram.ui.Components.n31 n31Var;
        if (xnVar.f43095a5 != null && i10 < arrayList.size() && xnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = xnVar.getParentActivity();
            int i11 = iArr[0];
            lf lfVar = new lf(xnVar, 20);
            String[] strArr = org.telegram.ui.Components.v31.O;
            if (parentActivity == null) {
                n31Var = null;
            } else {
                org.telegram.ui.Components.n31 n31Var2 = new org.telegram.ui.Components.n31(parentActivity, str, str4, inputPeer, i11, richMessage, lfVar);
                n31Var2.G(z4);
                n31Var2.J = xnVar;
                n31Var2.K = pfVar;
                if (xnVar.getParentActivity() != null) {
                    xnVar.showDialog(n31Var2);
                }
                n31Var = n31Var2;
            }
            n31Var.setDimBehind(false);
            xnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(xnVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + xnVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + xnVar.a(), i12 - 1).apply();
                xnVar.Qc(true);
            }
        }
    }

    public static void U4(xn xnVar, org.telegram.ui.Cells.t1 t1Var) {
        int i10;
        int themedColor;
        int i11;
        xd.a aVar = xnVar.f43339tc;
        if (xnVar.V != null && !aVar.f50542f && t1Var.getMessageObject() != null) {
            pm pmVar = xnVar.U0;
            RectF rectF = AndroidUtilities.rectTmp;
            vg.i.c(t1Var, pmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            gh.a aVar2 = t1Var.X5;
            if (aVar2 != null && t1Var.f23919k6) {
                rect.set(aVar2.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((xnVar.U0.getMeasuredHeight() - xnVar.f43340u0.getPaddingBottom()) + xnVar.f43291pc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = t1Var.getMessageObject();
                if (xnVar.f43417zc == null) {
                    xnVar.f43417zc = new eh.f(xnVar.getParentActivity(), xnVar.resourceProvider, xnVar);
                    int indexOfChild = xnVar.U0.indexOfChild(xnVar.f43340u0);
                    if (indexOfChild >= 0) {
                        xnVar.U0.addView(xnVar.f43417zc, indexOfChild + 1, k7.c6.g());
                    } else {
                        xnVar.U0.addView(xnVar.f43417zc, k7.c6.g());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (t1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.k6.f21846nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.k6.sb;
                    }
                    themedColor = xnVar.getThemedColor(i11);
                } else {
                    if (t1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.k6.f21865od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f21847nd;
                    }
                    themedColor = xnVar.getThemedColor(i10);
                }
                xnVar.f43417zc.setColor(themedColor);
                xnVar.f43417zc.setCellToWatch(t1Var);
                xnVar.f43417zc.f5624b.f5620a.a(false, false);
                xnVar.f43417zc.setAnimatedVisibility(aVar.f50541e);
                xnVar.f43417zc.f5624b.setOnClickListener(new androidx.mediarouter.app.c(new ng(xnVar, 2), 4));
                eh.f fVar = xnVar.f43417zc;
                fVar.f5630s = new ng(xnVar, 3);
                eh.b bVar = fVar.f5623a;
                bVar.setOnKeyListener(new og(xnVar, 0));
                bVar.setOnEditorActionListener(new ha(xnVar, 1));
                xnVar.V.Q4 = bVar;
                AndroidUtilities.runOnUIThread(new bh.a(xnVar, measuredHeight, bVar, 26), 100L);
                aVar.a(true, true);
            }
        }
    }

    public static void V(xn xnVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new af(xnVar, i10, 6));
        } else {
            xnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void V0(xn xnVar, TLRPC.ReactionCount reactionCount) {
        xnVar.A7(true);
        org.telegram.ui.Components.on0.c(xnVar.getParentActivity(), xnVar.currentAccount, reactionCount.reaction, xnVar.f43114ba);
    }

    public static void V1(xn xnVar, float f10) {
        org.telegram.ui.Cells.t1 t1Var = xnVar.f43099a9;
        if (e2.c.s(t1Var)) {
            t1Var.setSlidingOffset(f10);
        }
    }

    public static void W(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(xnVar.currentAccount).loadAttachMenuBots(false, true);
            xnVar.W9(user.f20992id, xnVar.f43190h8, false);
        }
    }

    public static void W0(xn xnVar, String str) {
        if (MessagesController.getInstance(xnVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            af.g.m(xnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.z4.o0(xnVar.getParentActivity(), xnVar.f43114ba, str, true, new hg(xnVar, str, 1));
        }
    }

    public static void X(xn xnVar) {
        if (!xnVar.e7(xnVar.V.getSendButton())) {
            if (xnVar.getMediaController().isPlayingMessage(xnVar.f43095a5)) {
                xnVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = xnVar.getMessagesController().getInputPeer(xnVar.Q5);
            if (xnVar.f43109b5 != null) {
                for (int i10 = 0; i10 < xnVar.f43109b5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f20961id.add(Integer.valueOf(xnVar.f43109b5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f20961id.add(Integer.valueOf(xnVar.f43095a5.getId()));
            }
            ConnectionsManager.getInstance(xnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new eg.b3(27, xnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void X0(xn xnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        xnVar.Mb(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void X1(xn xnVar) {
        long j10;
        up upVar = xnVar.M9;
        if (upVar != null) {
            if (xnVar.f43148e4) {
                if (upVar.E != null) {
                    if (xnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.h9.a(xnVar, xnVar.getParentLayout().getFragmentStack().indexOf(xnVar), xnVar.f43143e, xnVar.f43156f, xnVar.Z3, xnVar.Q5, xnVar.f43327sa, xnVar.f43315ra);
                    }
                    TLRPC.Chat chat = xnVar.f43143e;
                    TLRPC.TL_forumTopic tL_forumTopic = xnVar.M9.E;
                    long j11 = xnVar.Q5;
                    int i10 = xnVar.f43315ra;
                    int i11 = xnVar.f43327sa;
                    if (xnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.h9.a(xnVar, xnVar.getParentLayout().getFragmentStack().indexOf(xnVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", xnVar.M9.f41882a);
                    bundle.putInt("dialog_filter_id", xnVar.M9.f41884b);
                    bundle.putBoolean("pulled", true);
                    xn g10 = bg.e.g(xnVar, -xnVar.Q5, xnVar.M9.E, 0, bundle);
                    g10.O9 = true;
                    Lc = true;
                    xnVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = upVar.D;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f20845id;
            }
            if (j10 != 0) {
                xnVar.v6();
                up upVar2 = xnVar.M9;
                TLRPC.Chat chat3 = upVar2.D;
                long j13 = upVar2.W;
                int i12 = upVar2.f41882a;
                int i13 = upVar2.f41884b;
                if (xnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.h9.a(xnVar, xnVar.getParentLayout().getFragmentStack().indexOf(xnVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = xnVar.M9.D;
                if (chat4 != null) {
                    j12 = chat4.f20845id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", xnVar.M9.f41882a);
                bundle2.putInt("dialog_filter_id", xnVar.M9.f41884b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(xnVar.currentAccount).edit().remove("diditem" + xnVar.M9.W).apply();
                xn xnVar2 = new xn(bundle2);
                ArrayList arrayList = xnVar.f43128cb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = xnVar.f43128cb;
                    xnVar2.f43128cb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                xnVar2.O9 = true;
                Lc = true;
                xnVar.presentFragment(xnVar2, true);
            }
        }
    }

    public static void Y(xn xnVar, long j10, long j11, Long l10, Boolean bool) {
        boolean z4;
        mh.t7 y10 = mh.t7.y(xnVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z4 = true;
        } else {
            z4 = false;
        }
        y10.i0(j10, j11, z4, true);
    }

    public static void Y0(xn xnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z4;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            xnVar.f43181gc = true;
            xnVar.f43340u0.e1();
            Bundle bundle = new Bundle();
            final long dialogId = ((MessageObject) arrayList.get(0)).getDialogId();
            bundle.putLong("chat_id", -dialogId);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            bundle.putBoolean("historyPreloaded", z4);
            xn xnVar2 = new xn(bundle);
            xnVar2.pb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                xnVar2.I7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = xnVar2.U3.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                xnVar2.U3.messageOwner.reactions = tL_messageReactions;
            }
            dg.u1 u1Var = new dg.u1(xnVar, new boolean[]{false}, i11, xnVar2, 12);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f20866id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = xnVar2.getClassGuid();
                NotificationCenter.getInstance(xnVar.currentAccount).addObserver(new ui(xnVar, classGuid, u1Var, xnVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        xn xnVar3 = xn.this;
                        MessagesController messagesController = xnVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i18, true, 0, ((MessageObject) l.d.i(1, arrayList)).getId(), 1, false, 0, true, xnVar3.f43148e4, null);
                    }
                });
                return;
            }
            u1Var.run();
            return;
        }
        xnVar.f43168fc = 0;
        xnVar.f43181gc = false;
        xnVar.f43340u0.e1();
        if (messageObject2 != null) {
            xnVar.ga(messageObject2);
        } else if (xnVar.getParentActivity() != null) {
            org.telegram.ui.Components.qc.a0(xnVar).t(LocaleController.getString(R.string.ChannelPostDeleted), xnVar.f43114ba).j();
        }
    }

    public static void Z(xn xnVar) {
        TLRPC.UserFull userFull;
        boolean z4;
        if (xnVar.getParentActivity() != null) {
            TLRPC.Chat chat = xnVar.f43143e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !xnVar.f43143e.monoforum) {
                    z4 = true;
                }
                z4 = false;
            } else {
                if (xnVar.h == null && (userFull = xnVar.X7) != null) {
                    z4 = userFull.can_pin_message;
                }
                z4 = false;
            }
            if (z4) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f43114ba);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new te(xnVar, 22));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                xnVar.showDialog(alertDialog$Builder.f21168a);
            } else if (!xnVar.E4.isEmpty()) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
                edit.putInt("pin_" + xnVar.Q5, ((Integer) xnVar.E4.get(0)).intValue()).commit();
                xnVar.yc(0, true);
            }
        }
    }

    public static void Z0(xn xnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = xnVar.getMessagesController().getInputPeer(xnVar.Q5);
                tL_messages_getHistory.offset_date = xnVar.f43335t7 + 86400;
                tL_messages_getHistory.limit = 1;
                xnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new eg.b3(25, xnVar, tLObject));
                return;
            }
            xnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void a0(xn xnVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(xnVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, xnVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(xnVar.currentAccount).editMessage(messageObject, null, false, xnVar, null, i10, i11);
        }
    }

    public static void a1(long j10, xn xnVar) {
        if (mh.t7.y(xnVar.currentAccount, false).p().amount < j10) {
            new mh.z9(xnVar.getParentActivity(), xnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(xnVar.a()), new lf(xnVar, 15), xnVar.a()).show();
        } else {
            new mh.aa(xnVar.getParentActivity(), xnVar.resourceProvider).show();
        }
    }

    public static void b0(xn xnVar, long j10, boolean z4) {
        if (!xnVar.E4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
            edit.putInt("pin_" + xnVar.Q5, ((Integer) xnVar.E4.get(0)).intValue()).commit();
            xnVar.E4.clear();
            xnVar.G4.clear();
            xnVar.I4 = 0;
            xnVar.M4 = 0;
            xnVar.N4 = 0;
            xnVar.yc(0, true);
        }
        if (ChatObject.isMonoForum(xnVar.f43143e) && ChatObject.canManageMonoForum(xnVar.currentAccount, xnVar.f43143e)) {
            if (j10 != 0) {
                xnVar.getMessagesStorage().removeTopic(-xnVar.f43143e.f20845id, j10);
                xnVar.getMessagesController().deleteSavedDialog(j10, xnVar.getMessagesController().getInputPeer(-xnVar.f43143e.f20845id));
                xnVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(xnVar.f43143e.f20845id, j10);
            }
        } else {
            xnVar.getMessagesController().deleteDialog(xnVar.Q5, 1, z4);
            xnVar.getMessagesStorage().removeAllTopics(xnVar.Q5);
            xnVar.getMessagesController().getTopicsController().reloadTopics(-xnVar.Q5);
        }
        xnVar.J5.put(j10, 0);
        org.telegram.ui.Components.w21 w21Var = xnVar.O1;
        if (w21Var != null) {
            w21Var.setAllTopicsHidden(false);
        }
        if (j10 == xnVar.f43094a4) {
            xnVar.y7(false, null);
            xnVar.f43381x0.O(false);
        }
    }

    public static void b1(xn xnVar) {
        if (AndroidUtilities.addToClipboard(xnVar.Jb.sponsoredAdditionalInfo)) {
            b.m(R.string.TextCopied, new org.telegram.ui.Components.qc(org.telegram.ui.Components.cb.a(xnVar.getParentActivity()), xnVar.resourceProvider));
        }
    }

    public static void b2(xn xnVar, View view, boolean z4, float f10, float f11) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) view;
            messageObject = t1Var.getMessageObject();
            t1Var.f23813d1 = f10;
            t1Var.f23828e1 = f11;
            org.telegram.ui.Components.ta0 ta0Var = t1Var.Hc;
            float f12 = t1Var.f23828e1;
            ta0Var.h = t1Var.getTranslationX() + f10;
            ta0Var.f31319i = f12;
            ta0Var.f31322l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int E8 = xnVar.E8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && E8 >= 2 && E8 != 20 && E8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        xnVar.x6(messageObject, z4, true);
                        xnVar.dc();
                        xnVar.Wc(false);
                    }
                }
            }
        }
    }

    public static void b4(xn xnVar, org.telegram.ui.Cells.h0 h0Var) {
        String charSequence;
        if (MessagesController.getInstance(xnVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = h0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new d7(xnVar, h0Var, text, 3), new a1(h0Var, 14));
            return;
        }
        h0Var.setClickable(false);
    }

    public static void c0(xn xnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z4, pf pfVar) {
        String str4;
        if (xnVar.f43095a5 != null && i10 < arrayList.size() && xnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = xnVar.f43095a5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.v31.I(xnVar.getParentActivity(), xnVar, inputPeer, iArr[0], xnVar.f43095a5.summarized, str, str4, charSequence, z4, pfVar, new lf(xnVar, 28)).setDimBehind(false);
            xnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(xnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + xnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + xnVar.a(), i11 - 1).apply();
                xnVar.Qc(true);
            }
        }
    }

    public static void c1(xn xnVar, long j10, boolean z4, boolean z10) {
        if (!AndroidUtilities.isContextSafe(xnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.f01.c(xnVar.getParentActivity(), xnVar.currentAccount, -j10, xnVar.getUserConfig().getCurrentUser(), null, z4, z10, xnVar.getResourceProvider());
    }

    public static void c2(xn xnVar, int i10) {
        int i11;
        boolean z4;
        ArrayList arrayList = xnVar.f43311r6;
        SparseArray[] sparseArrayArr = xnVar.T5;
        if (!xnVar.La && (i11 = i10 - xnVar.f43381x0.G) >= 0 && i11 < arrayList.size()) {
            MessageObject messageObject = (MessageObject) arrayList.get(i11);
            if (sparseArrayArr[0].get(messageObject.getId(), null) == null && sparseArrayArr[1].get(messageObject.getId(), null) == null) {
                z4 = true;
            } else {
                z4 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i12), (MessageObject) sparseArrayArr[0].valueAt(i12));
            }
            for (int i13 = 0; i13 < sparseArrayArr[1].size(); i13++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i13), (MessageObject) sparseArrayArr[1].valueAt(i13));
            }
            org.telegram.ui.Components.sl0 sl0Var = xnVar.f43340u0;
            mi miVar = new mi(xnVar, z4, sparseArray);
            if (!sl0Var.a2) {
                sl0Var.f31101j2 = new int[2];
                new HashSet();
                sl0Var.k1(sl0Var, true);
                sl0Var.f31091e2 = miVar;
                sl0Var.a2 = true;
                sl0Var.f31089d2 = i10;
                sl0Var.f31087c2 = i10;
            }
        }
    }

    public static void d0(xn xnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(xnVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f20961id;
        long clientUserId = xnVar.getUserConfig().getClientUserId();
        long j11 = xnVar.Q5;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void d1(xn xnVar, TLRPC.User user, String str, Boolean bool) {
        Intent intent;
        String country;
        if (xnVar.getParentActivity() == null) {
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
            TLRPC.User currentUser = xnVar.getUserConfig().getCurrentUser();
            HashMap hashMap = new HashMap();
            boolean z4 = false;
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(ApplicationLoader.applicationContext.getResources().getAssets().open("countries.txt")));
                while (true) {
                    String readLine = bufferedReader.readLine();
                    if (readLine == null) {
                        break;
                    }
                    String[] split = readLine.split(";");
                    ?? obj = new Object();
                    obj.f41631a = split[2];
                    String str2 = split[0];
                    obj.f41633c = str2;
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
            } catch (Exception e6) {
                FileLog.e(e6);
            }
            String str4 = currentUser.phone;
            int i10 = 4;
            while (true) {
                if (i10 < 1) {
                    break;
                }
                List list2 = (List) hashMap.get(str4.substring(0, i10));
                if (list2 != null && list2.size() > 0) {
                    String str5 = ((tt) list2.get(0)).f41633c;
                    if (str5.endsWith("0") && str.startsWith("0")) {
                        str = str.substring(1);
                    }
                    str = android.support.v4.media.a.o("+", str5, str);
                    z4 = true;
                } else {
                    i10--;
                }
            }
            if (!z4 && Build.VERSION.SDK_INT >= 23) {
                Context context = ApplicationLoader.applicationContext;
                if (context != null) {
                    country = ((TelephonyManager) context.getSystemService(TelephonyManager.class)).getSimCountryIso().toUpperCase(Locale.US);
                } else {
                    country = Locale.getDefault().getCountry();
                }
                if (country.endsWith("0") && str.startsWith("0")) {
                    str = str.substring(1);
                }
                str = android.support.v4.media.a.o("+", country, str);
            }
        }
        contentValues.put("data1", str);
        contentValues.put("data2", (Integer) 2);
        arrayList.add(contentValues);
        intent.putExtra("finishActivityOnSaveCompleted", true);
        intent.putParcelableArrayListExtra("data", arrayList);
        xnVar.getParentActivity().startActivity(intent);
    }

    public static boolean d2(xn xnVar, View view, RectF rectF) {
        RectF rectF2 = xnVar.Cb;
        if (rectF != null && xnVar.f43340u0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void d4(xn xnVar) {
        if (xnVar.F3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = xnVar.O3;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f20866id = 0;
        MessageObject messageObject = new MessageObject(xnVar.currentAccount, tL_message, false, false);
        xnVar.F3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void e0(xn xnVar, int i10) {
        org.telegram.ui.ActionBar.f5 f5Var = xnVar.parentLayout;
        if (f5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.p2 backgroundFragment = f5Var.getBackgroundFragment();
        if (backgroundFragment instanceof xn) {
            xn xnVar2 = (xn) backgroundFragment;
            if (xnVar2.a() == xnVar.Q5) {
                xnVar.finishFragment();
                xnVar2.j(i10, 0, true, 0, true, 0);
                return;
            }
        }
        xnVar.presentFragment(Q9(i10, xnVar.Q5));
    }

    public static void e1(xn xnVar, int i10) {
        if (xnVar.fragmentView != null) {
            org.telegram.ui.Cells.a0 q82 = xnVar.q8(i10, false);
            if (q82 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) q82;
                ng.r0 r0Var = t1Var.K;
                TLRPC.MessagePeerReaction randomUnreadReaction = t1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (r0Var.K || randomUnreadReaction.big)) {
                    ng.m0.d(xnVar, null, q82, null, 0.0f, 0.0f, ng.q0.d(randomUnreadReaction.reaction), xnVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    ng.m0.f();
                }
                r0Var.K = false;
                MessageObject messageObject = t1Var.f24075v7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (q82 instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) q82;
                ng.r0 r0Var2 = v0Var.f24300z0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = v0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (r0Var2.K || randomUnreadReaction2.big)) {
                    ng.m0.d(xnVar, null, q82, null, 0.0f, 0.0f, ng.q0.d(randomUnreadReaction2.reaction), xnVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    ng.m0.f();
                }
                r0Var2.K = false;
                MessageObject messageObject2 = v0Var.E0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void e4(xn xnVar) {
        if (xnVar.G3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f20866id = 0;
        MessageObject messageObject = new MessageObject(xnVar.currentAccount, tL_message, false, false);
        xnVar.G3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void f0(xn xnVar, mf.a aVar, Runnable runnable) {
        if (!xnVar.isFinished) {
            if (mf.a.m(mh.t7.x(xnVar.currentAccount, aVar.f13651a).p()).f13652b < aVar.f13652b) {
                mf.b bVar = aVar.f13651a;
                if (bVar == mf.b.f13653a) {
                    new mh.z9(xnVar.getParentActivity(), xnVar.getResourceProvider(), aVar.a(), 13, bg.e.h(xnVar.currentAccount, xnVar.a()), null, xnVar.a()).show();
                    return;
                } else if (bVar == mf.b.f13654b) {
                    new rh.f(xnVar.getParentActivity(), xnVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void f1(xn xnVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        xnVar.f43135d5 = null;
        int i10 = xnVar.f43241lb;
        if (i10 == 2) {
            xnVar.f43199i5 = null;
            xnVar.f43223k5 = null;
            MessagePreviewParams messagePreviewParams = xnVar.f43122c5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, xnVar.Q5, null);
            }
            xnVar.j8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = xnVar.f43122c5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = xnVar.f43122c5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = xnVar.f43122c5.forwardMessages.messages.get(i11);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f43114ba);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.F0 = true;
                if (j11 > 0) {
                    TLRPC.User user = xnVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", xnVar.f43122c5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = xnVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", xnVar.f43122c5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                d2Var.Q = AndroidUtilities.replaceTags(formatString);
                d2Var.O = LocaleController.formatPluralString("messages", xnVar.f43122c5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new te(xnVar, 4));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new te(xnVar, 5));
                xnVar.showDialog(d2Var);
                TextView textView = (TextView) d2Var.d(-1);
                if (textView != null) {
                    textView.setTextColor(xnVar.getThemedColor(org.telegram.ui.ActionBar.k6.f21897q7));
                }
            }
        } else if (i10 == 4) {
            xnVar.D5 = null;
            MessagePreviewParams messagePreviewParams3 = xnVar.f43122c5;
            if (messagePreviewParams3 != null) {
                int i12 = xnVar.currentAccount;
                MessageObject messageObject4 = xnVar.f43223k5;
                if (messageObject4 == xnVar.U3) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, xnVar.f43199i5, xnVar.f43247m5);
            }
            jk jkVar = xnVar.V;
            jkVar.T2 = null;
            jkVar.U2 = false;
            xnVar.i8();
            xnVar.j8();
        } else {
            if (ChatObject.isForum(xnVar.f43143e) && !xnVar.f43148e4 && (messageObject = xnVar.f43223k5) != null) {
                long topicId = MessageObject.getTopicId(xnVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    xnVar.getMediaDataController().cleanDraft(xnVar.Q5, topicId, false);
                }
            }
            xnVar.zb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void g0(xn xnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z4;
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
        edit.putLong("dialog_join_requested_time_" + xnVar.Q5, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(xnVar.f43143e) && !xnVar.f43143e.megagroup) {
                z4 = true;
            } else {
                z4 = false;
            }
            int i10 = org.telegram.ui.Components.j80.f28062r;
            org.telegram.ui.Components.j80.w(context, xnVar, org.telegram.ui.Components.qc.a0(xnVar), z4);
        }
        xnVar.vb(false, true);
    }

    public static void g1(xn xnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        xn xnVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        vg.a aVar = xnVar.Nb;
        if (num.intValue() != xnVar.b()) {
            xnVar.f43230kc = false;
            df dfVar = xnVar.Kb;
            if (dfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(dfVar);
                xnVar.Kb.run();
                xnVar.Kb = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.w21 w21Var = xnVar.O1;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(w21Var.f32620b).getTopicsController().getTopics(-w21Var.f32622c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f20897id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = xnVar.getMessagesController().getTopicsController().findTopic(-xnVar.a(), tL_forumTopic.f20897id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                xnVar.Xa = SystemClock.uptimeMillis();
                xnVar.f43249m7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    xnVar.Sa(xnVar.b());
                } else if (xnVar.b() == 0) {
                    xnVar.Sa(num.intValue());
                } else {
                    xnVar.f43225k7 = -1;
                }
                xnVar.getConnectionsManager().cancelRequestsForGuid(xnVar.classGuid);
                xnVar.getMessagesStorage().cancelTasksForGuid(xnVar.classGuid);
                xnVar.classGuid = ConnectionsManager.generateClassGuid();
                xnVar.Pa();
                xnVar.f43122c5 = null;
                xnVar.f43312r7 = 0;
                xnVar.f43189h7 = false;
                xnVar.f43201i7 = true;
                xnVar.e6.clear();
                xnVar.f43117c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(xnVar.getCurrentAccount(), message, false, false));
                    xnVar2 = xnVar;
                    xnVar2.pb(arrayList, xnVar.f43143e, tL_forumTopic2.f20897id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    xnVar2 = xnVar;
                    xnVar2.Z3 = null;
                    xnVar2.X3 = null;
                    xnVar2.U3 = null;
                    xnVar2.f43223k5 = null;
                    xnVar2.f43186h4 = 0;
                    xnVar2.f43198i4 = 0;
                    xnVar2.f43210j4 = 0;
                    xnVar2.f43094a4 = 0L;
                    xnVar2.f43108b4 = 0;
                    xnVar2.f43121c4 = null;
                    xnVar2.f43148e4 = false;
                    xnVar2.f43134d4 = false;
                }
                jm jmVar = xnVar2.f43381x0;
                if (jmVar != null) {
                    if (jmVar.F >= 0 && !jmVar.N()) {
                        jm jmVar2 = xnVar2.f43381x0;
                        jmVar2.u(jmVar2.F);
                    } else {
                        jm jmVar3 = xnVar2.f43381x0;
                        if (jmVar3.F < 0 && jmVar3.N()) {
                            xnVar2.f43381x0.o(0);
                        }
                    }
                    xnVar2.f43381x0.T();
                }
                xnVar2.r8();
                xnVar2.Nc(true);
                xnVar2.X0.n(true);
                if (tL_forumTopic2 != null) {
                    xnVar2.Tc();
                } else {
                    xnVar2.X0.b();
                }
                xnVar2.O1.setCurrentTopic(xnVar2.b());
                xnVar2.Qc(true);
                xnVar2.hc(true);
                xnVar2.getMessagesController().setForumLastTopicId(-xnVar2.a(), xnVar2.b());
                xnVar2.Ea();
                xnVar2.f9(true);
                xnVar2.e9(true);
                xnVar2.A6(true, true);
                if (xnVar2.V != null) {
                    if (!UserObject.isBotForum(xnVar2.f43156f)) {
                        xnVar2.V.m0(false);
                    }
                    xnVar2.V.G1(true);
                }
                if (tL_forumTopic2 != null) {
                    xnVar2.getMessagesController().getTopicsController().getTopicRepliesCount(xnVar2.Q5, tL_forumTopic2.f20897id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                xnVar2.f43195i1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                xnVar2.f43207j1 = i11;
                xnVar2.Bc(false);
                xnVar2.Ac(false);
                xnVar2.Rc();
                pn pnVar = xnVar2.f43242lc;
                if (pnVar != null && xnVar2.actionBar.f21548k0) {
                    pnVar.p(null);
                }
                if (UserObject.isBotForum(xnVar2.f43156f)) {
                    xnVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(xnVar2.Q5, num.intValue()), true);
                }
            }
        }
    }

    public static void h0(xn xnVar, MessageObject messageObject, Long l10, Runnable runnable) {
        mh.t7.y(xnVar.currentAccount, false).l0(messageObject, l10.longValue(), runnable, false);
    }

    public static void h1(xn xnVar, String str) {
        if (MessagesController.getInstance(xnVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            xnVar.getParentActivity();
            af.g.n(str);
            return;
        }
        org.telegram.ui.Components.z4.o0(xnVar.getParentActivity(), xnVar.f43114ba, str, false, new hg(xnVar, str, 0));
    }

    public static void i0(xn xnVar) {
        org.telegram.ui.Cells.t1 t1Var;
        vl vlVar;
        int i10;
        if (!xnVar.Ob && xnVar.C3 && xnVar.f43340u0.D && xnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = xnVar.f43340u0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = xnVar.f43340u0.getChildAt(childCount);
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
                xnVar.Ob = true;
                vl vlVar2 = new vl(xnVar, xnVar.getParentActivity());
                vlVar2.p(true);
                vlVar2.H = Layout.Alignment.ALIGN_CENTER;
                vlVar2.d = 3500L;
                vlVar2.Q = true;
                vlVar2.f45266e = true;
                vlVar2.h = AndroidUtilities.dp(150.0f);
                vlVar2.q(8.0f);
                xnVar.f43396y1 = vlVar2;
                vlVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                xnVar.U0.addView(xnVar.f43396y1, k7.c6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                t1Var.getLocationInWindow(iArr);
                xnVar.f43409z1 = t1Var.getTimeY() + iArr[1];
                xnVar.f43396y1.setTranslationY(((-vlVar.getTop()) - AndroidUtilities.dp(120.0f)) + xnVar.f43409z1);
                xnVar.f43396y1.m(0.0f, (t1Var.f23951mb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + t1Var.f23980ob);
                xnVar.f43396y1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(xnVar, 2));
            AndroidUtilities.runOnUIThread(new le(xnVar, 2), 2000L);
        }
    }

    public static void i1(xn xnVar, Object[] objArr, org.telegram.ui.Components.xx0 xx0Var, boolean z4, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(xx0Var.container, xnVar.resourceProvider);
                if (z4) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.ic r10 = qcVar.r(document, LocaleController.formatString(i10, stickerSet.title));
                r10.f27778j = 2750;
                r10.k(true);
            }
        }
    }

    public static void i2(xn xnVar) {
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (xnVar.f43368w1 != null) {
            return;
        }
        org.telegram.ui.Cells.t1 t1Var2 = null;
        for (int childCount = xnVar.f43340u0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = xnVar.f43340u0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (primaryMessageObject = (t1Var = (org.telegram.ui.Cells.t1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                t1Var2 = t1Var;
            }
        }
        xnVar.ub(t1Var2);
    }

    public static void j0(xn xnVar) {
        if (xnVar.J1) {
            xnVar.getMessagesController().addDialogToFolder(xnVar.Q5, 0, 0, 0L);
            xnVar.Q7();
            xnVar.f43356v3.j(23, xnVar.Q5, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + xnVar.Q5, false);
            edit.putBoolean("dialog_bar_block" + xnVar.Q5, false);
            edit.putBoolean("dialog_bar_report" + xnVar.Q5, false);
            edit.commit();
            xnVar.Qc(false);
            xnVar.getNotificationsController().clearDialogNotificationsSettings(xnVar.Q5, xnVar.b());
        } else if (xnVar.I1.getTag() != null && ((Integer) xnVar.I1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = xnVar.W7;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < xnVar.W7.participants.participants.size(); i10++) {
                    hVar.k(null, xnVar.W7.participants.participants.get(i10).user_id);
                }
                long j10 = xnVar.W7.f20846id;
                org.telegram.ui.Components.e70 e70Var = new org.telegram.ui.Components.e70(xnVar.getParentActivity(), xnVar.currentAccount, hVar, xnVar.W7.f20846id, xnVar, xnVar.f43114ba);
                e70Var.f26475i0 = new te(xnVar, 20);
                e70Var.show();
            }
        } else if (xnVar.I1.getTag() != null) {
            xnVar.rb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", xnVar.f43156f.f20992id);
            bundle.putBoolean("addContact", true);
            os osVar = new os(bundle);
            osVar.L = new te(xnVar, 21);
            xnVar.presentFragment(osVar);
        }
    }

    public static void j1(xn xnVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = xnVar.f43223k5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z4 = zArr[0];
            if (z4) {
                zArr[0] = false;
            }
            int i10 = xnVar.f43241lb;
            if (i10 == 5) {
                int i11 = xnVar.currentAccount;
                long j10 = xnVar.Q5;
                MessageSuggestionParams messageSuggestionParams = xnVar.f43135d5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new mh.r0(context, i11, j10, messageSuggestionParams, xnVar, xnVar.getResourceProvider(), 0, new xe(xnVar, 3)).show();
            } else if (i10 == 1 && (messageObject = xnVar.f43247m5) != null) {
                if (messageObject.needResendWhenEdit() && !z4) {
                    MessageSuggestionParams messageSuggestionParams2 = xnVar.f43135d5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    xnVar.Tb(messageSuggestionParams2);
                } else if (xnVar.f43247m5.canEditMedia() && xnVar.f43235l5 == 0) {
                    if (xnVar.G1 == null) {
                        xnVar.E7();
                    }
                    xnVar.G1.I1(xnVar.f43247m5, -1);
                    xnVar.X9();
                } else {
                    xnVar.j(xnVar.f43247m5.getId(), 0, true, 0, true, 0);
                }
            } else if (xnVar.f43122c5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(xnVar.Q5) && !xnVar.f43122c5.hasSecretMessages && xnVar.O3 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        xnVar.ca(0);
                        return;
                    }
                    MessageObject messageObject3 = xnVar.f43223k5;
                    if (messageObject3 != null) {
                        xnVar.j(messageObject3.getId(), 0, true, 0, true, 0);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    xnVar.ca(1);
                } else if (i10 == 4) {
                    xnVar.ca(2);
                }
            }
        }
    }

    public static void k0(xn xnVar, CharSequence charSequence, MessagesController messagesController, boolean z4) {
        boolean z10;
        CharSequence charSequence2;
        org.telegram.ui.Components.n51[] n51VarArr;
        if (xnVar.C5 != 0) {
            xnVar.getConnectionsManager().cancelRequest(xnVar.C5, true);
            xnVar.C5 = 0;
            z10 = true;
        } else {
            z10 = false;
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
            if ((charSequence instanceof Spannable) && (n51VarArr = (org.telegram.ui.Components.n51[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.n51.class)) != null && n51VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.n51 n51Var : n51VarArr) {
                    arrayList.add(n51Var.getURL());
                }
            }
            if (arrayList != null && xnVar.E5 != null && arrayList.size() == xnVar.E5.size()) {
                boolean z11 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) xnVar.E5.get(i10))) {
                        z11 = false;
                    }
                }
                if (z11 && !z10) {
                    return;
                }
            }
            xnVar.E5 = arrayList;
        } catch (Exception e6) {
            FileLog.e(e6);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new lf(xnVar, 17));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new lf(xnVar, 16));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (xnVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new se(xnVar, messagesController, charSequence, z4));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = xnVar.D5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = xnVar.f43205ib + 1;
            xnVar.f43205ib = i11;
            eg egVar = new eg(xnVar, i11, getwebpagepreview, 0);
            if (xnVar.f43217jb == null) {
                xnVar.f43217jb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) xnVar.f43217jb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                egVar.run(Boolean.TRUE, webPage2);
                return;
            }
            p6 p6Var = new p6(xnVar, getwebpagepreview, egVar, 1);
            if (xnVar.C5 != 0) {
                xnVar.getConnectionsManager().cancelRequest(xnVar.C5, true);
            }
            xnVar.C5 = xnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new eh.w(11, xnVar, p6Var));
            xnVar.getConnectionsManager().bindRequestToGuid(xnVar.C5, xnVar.classGuid);
        }
    }

    public static void k1(xn xnVar, long j10, long j11) {
        mh.t7.y(xnVar.currentAccount, false).C(j10, j11, new mh.t3(xnVar, j10, j11, 1));
    }

    public static void k8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z4, boolean z10, boolean z11, boolean z12) {
        if (menu.findItem(R.id.menu_bold) != null) {
            return;
        }
        if (Build.VERSION.SDK_INT >= 23) {
            menu.removeItem(16908341);
        }
        int i10 = 6;
        if (z4) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_quote, 6, LocaleController.getString(R.string.Quote));
            i10 = 7;
        }
        if (z12) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_spoiler, i10, LocaleController.getString(R.string.Spoiler));
            i10++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z11) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.e51(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f30949a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.t01(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f30949a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.t01(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i11 += 2;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_underline, i12, spannableStringBuilder5);
        }
        if (z10) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_link, i11, LocaleController.getString(R.string.CreateLink));
            i11++;
        }
        if (z4 && encryptedChat == null) {
            menu.add(R.id.menu_groupbolditalic, R.id.menu_date, i11, LocaleController.getString(R.string.FormattedDate));
            i11++;
        }
        menu.add(R.id.menu_groupbolditalic, R.id.menu_regular, i11, LocaleController.getString(R.string.Regular));
    }

    public static void l0(xn xnVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(xnVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (xnVar.i() != null) {
                tLObject2 = xnVar.i();
            } else {
                tLObject2 = xnVar.f43143e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = xnVar.f43156f;
                if (user2 != null && user2.bot && user.f20992id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.y3.s(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.qc.a0(xnVar), null);
                } else if (user2 != null && user2.bot && user.f20992id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.y3.s(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.qc.a0(xnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.y3.s(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.qc.a0(xnVar), null);
                } else {
                    TLRPC.Chat chat = xnVar.f43143e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.y3.s(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.qc.a0(xnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = xnVar.f43143e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.y3.s(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.qc.a0(xnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                xnVar.W9(user.f20992id, xnVar.f43190h8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.r6 r6Var = new org.telegram.ui.Components.r6(xnVar.getParentActivity());
                r6Var.setColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21756ia, false));
                r6Var.setBackgroundColor(org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false));
                r6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity());
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.S = r6Var;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(xnVar, user, atomicBoolean, tL_attachMenuBot, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(xnVar.getParentActivity(), 5, xnVar.getResourceProvider());
                    z1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    z1Var.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
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
                    z1Var.setOnClickListener(new org.telegram.messenger.video.g(18, z1Var, atomicBoolean));
                    d2Var.D = 6;
                    alertDialog$Builder.n(z1Var);
                }
                alertDialog$Builder.o();
            } else {
                bj1.a(xnVar.getParentActivity(), new jh(xnVar, user, tL_attachMenuBot, 0), null);
            }
        }
    }

    public static void l1(xn xnVar, int i10) {
        if (xnVar.O3 == 7) {
            Object E = xnVar.J3.E(i10);
            if (i10 == 0) {
                xnVar.J3.getClass();
            }
            if (E instanceof MessageObject) {
                xnVar.fa((MessageObject) E);
            }
        } else if (xnVar.f43258n3 != null) {
            if (i10 >= 0 && i10 < xnVar.getMediaDataController().searchResultMessages.size()) {
                xnVar.f43270o3 = false;
                xnVar.lb(false, true, false);
                xnVar.getMediaDataController().setSearchedPosition(i10);
                xnVar.Fc(xnVar.getMediaDataController().getMask(), xnVar.getMediaDataController().getSearchPosition(), xnVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new re(xnVar, xnVar.getMediaDataController().searchResultMessages.get(i10), 2));
            }
        } else {
            xnVar.getMediaDataController().jumpToSearchedMessage(xnVar.classGuid, i10);
            xnVar.Lb(false);
        }
    }

    public static void m0(xn xnVar) {
        if (xnVar.Jb == null) {
            return;
        }
        w31[] w31VarArr = {w31.T(xnVar.getParentActivity(), xnVar, true, xnVar.resourceProvider, new lh.a1(18, xnVar, w31VarArr))};
    }

    public static void m1(xn xnVar, long j10, long j11, Long l10) {
        int i10;
        String str;
        if (xnVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = xnVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(xnVar.f43143e)) {
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
        org.telegram.ui.Components.z4.i0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new gh(xnVar, j10, j11, l10, 0), xnVar.resourceProvider, true);
    }

    public static void n0(xn xnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, p6 p6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f20866id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(xnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            xnVar.getMessagesController().getStoriesController().f17780k.d(hVar, new xc(16, hVar, p6Var), xnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void n1(xn xnVar) {
        MessagesController messagesController = xnVar.getMessagesController();
        long j10 = xnVar.Q5;
        long j11 = xnVar.I6;
        int i10 = xnVar.classGuid;
        int i11 = xnVar.O3;
        long j12 = xnVar.f43094a4;
        int i12 = xnVar.f43210j4;
        int i13 = xnVar.S5;
        xnVar.S5 = i13 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j12, i12, i13, xnVar.f43148e4);
    }

    public static void o0(xn xnVar, long j10, long j11) {
        BotForumHelper.getInstance(xnVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        xnVar.Kb = null;
    }

    public static void o1(xn xnVar) {
        int i10;
        TLRPC.ChatFull chatFull = xnVar.W7;
        if (chatFull != null && !xnVar.f43260n5) {
            TLRPC.Chat chat = xnVar.f43143e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && xnVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(xnVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = xnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && xnVar.visibleDialog == null && xnVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = xnVar.getParentActivity();
                    te teVar = new te(xnVar, 12);
                    te teVar2 = new te(xnVar, 13);
                    Pattern pattern = org.telegram.ui.Components.z4.f33754a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new hg.j1(7));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, k7.c6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.S = frameLayout;
                    d2Var.L0 = 0.3974359f;
                    d2Var.O = LocaleController.getString(R.string.GigagroupAlertTitle);
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), teVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), teVar2);
                    xnVar.showDialog(d2Var);
                }
            }
        }
    }

    public static void p0(xn xnVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(xnVar.currentAccount).getInputUser(user.f20992id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(xnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mh(xnVar, tL_attachMenuBot, user, 0), 66);
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

    public static void q0(xn xnVar) {
        if (xnVar.O3 == 0 && xnVar.getMessagesController().freezeUntilDate > xnVar.getConnectionsManager().getCurrentTime() && !c.a(xnVar.currentAccount, xnVar.f43156f)) {
            c.c(xnVar.getParentActivity(), xnVar.currentAccount, xnVar.getResourceProvider());
        }
    }

    public static void q1(org.telegram.ui.xn r19, final org.telegram.ui.w31[] r20, final org.telegram.ui.Components.q70 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.q1(org.telegram.ui.xn, org.telegram.ui.w31[], org.telegram.ui.Components.q70):void");
    }

    public static void r1(xn xnVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c3;
        long j10;
        int[] iArr3 = xnVar.f43387x6;
        int[] iArr4 = xnVar.f43373w6;
        boolean[] zArr = xnVar.B6;
        int[] iArr5 = xnVar.f43359v6;
        int[] iArr6 = xnVar.f43401y6;
        boolean[] zArr2 = xnVar.A6;
        ArrayList arrayList = xnVar.e6;
        if ((i10 - i11) - i12 <= i13 && !xnVar.D6) {
            boolean[] zArr3 = xnVar.f43413z6;
            if (!zArr3[0]) {
                xnVar.D6 = true;
                arrayList.add(Integer.valueOf(xnVar.S5));
                if (xnVar.f43273o6.size() != 0) {
                    MessagesController messagesController = xnVar.getMessagesController();
                    j10 = 0;
                    long j11 = xnVar.Q5;
                    c3 = 0;
                    long j12 = xnVar.I6;
                    int i14 = iArr5[0];
                    boolean z4 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = xnVar.classGuid;
                    int i17 = xnVar.O3;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = xnVar.f43094a4;
                    int i18 = xnVar.f43210j4;
                    int i19 = xnVar.S5;
                    xnVar.S5 = i19 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i14, 0, z4, i15, i16, 0, 0, i17, j13, i18, i19, xnVar.f43148e4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c3 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = xnVar.getMessagesController();
                    long j14 = xnVar.Q5;
                    long j15 = xnVar.I6;
                    boolean z10 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = xnVar.classGuid;
                    int i22 = xnVar.O3;
                    long j16 = xnVar.f43094a4;
                    int i23 = xnVar.f43210j4;
                    int i24 = xnVar.S5;
                    xnVar.S5 = i24 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z10, i20, i21, 0, 0, i22, j16, i23, i24, xnVar.f43148e4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c3 = 0;
                j10 = 0;
                if (xnVar.I6 != 0 && !zArr3[1]) {
                    xnVar.D6 = true;
                    arrayList.add(Integer.valueOf(xnVar.S5));
                    MessagesController messagesController3 = xnVar.getMessagesController();
                    long j17 = xnVar.I6;
                    int i25 = iArr5[1];
                    boolean z11 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = xnVar.classGuid;
                    int i28 = xnVar.O3;
                    long j18 = xnVar.f43094a4;
                    int i29 = xnVar.f43210j4;
                    int i30 = xnVar.S5;
                    xnVar.S5 = i30 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i25, 0, z11, i26, i27, 0, 0, i28, j18, i29, i30, xnVar.f43148e4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c3 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !xnVar.F7 && i11 <= 10) {
            if (xnVar.I6 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(xnVar.S5));
                MessagesController messagesController4 = xnVar.getMessagesController();
                long j19 = xnVar.I6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = xnVar.classGuid;
                int i34 = xnVar.O3;
                long j20 = xnVar.f43094a4;
                int i35 = xnVar.f43210j4;
                int i36 = xnVar.S5;
                xnVar.S5 = i36 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j20, i35, i36, xnVar.f43148e4);
                xnVar.F7 = true;
            } else if (!zArr[c3]) {
                arrayList.add(Integer.valueOf(xnVar.S5));
                MessagesController messagesController5 = xnVar.getMessagesController();
                long j21 = xnVar.Q5;
                long j22 = xnVar.I6;
                int i37 = iArr2[c3];
                int i38 = iArr[c3];
                int i39 = xnVar.classGuid;
                int i40 = xnVar.O3;
                long j23 = xnVar.f43094a4;
                int i41 = xnVar.f43210j4;
                int i42 = xnVar.S5;
                xnVar.S5 = i42 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j23, i41, i42, xnVar.f43148e4);
                xnVar.F7 = true;
            }
        }
    }

    public static void s0(xn xnVar, ArrayList arrayList, long j10, org.telegram.ui.Components.im0 im0Var, boolean z4, int i10) {
        if (z4) {
            SendMessagesHelper.getInstance(xnVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new hg.y0(xnVar, j10, 7), 400L);
            im0Var.dismiss();
        }
    }

    public static void t0(long j10, xn xnVar) {
        if (mh.t7.y(xnVar.currentAccount, false).p().amount < j10) {
            new mh.z9(xnVar.getParentActivity(), xnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(xnVar.a()), new lf(xnVar, 15), xnVar.a()).show();
        } else {
            new mh.aa(xnVar.getParentActivity(), xnVar.resourceProvider).show();
        }
    }

    public static void t1(xn xnVar) {
        if (MessagesController.getInstance(xnVar.currentAccount).isDialogMuted(xnVar.Q5, xnVar.b())) {
            xnVar.Pc(true);
            AndroidUtilities.runOnUIThread(new le(xnVar, 18), 150L);
            xnVar.f43144e0.M(null, null);
            if (xnVar.getParentActivity() != null) {
                org.telegram.ui.Components.qc.z(xnVar, 4, 0, xnVar.f43114ba).j();
                return;
            }
            return;
        }
        View view = xnVar.f43105b1.f22304i;
        if (view instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) view).b();
        }
    }

    public static void u0(xn xnVar, TLRPC.Document document) {
        xnVar.f43323s4.put(document, 0);
        SendMessagesHelper.getInstance(xnVar.currentAccount).sendSticker(document, null, xnVar.Q5, null, null, null, xnVar.f43199i5, null, true, 0, 0, false, null, xnVar.C8(), 0L, xnVar.N8(), xnVar.f43135d5);
    }

    public static void u1(xn xnVar, String str) {
        if (xnVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(xnVar.currentAccount).getInviteText(1));
            xnVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public static boolean u9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void v0(xn xnVar, TLRPC.Document document) {
        xnVar.f43323s4.put(document, 0);
        SendMessagesHelper.getInstance(xnVar.currentAccount).sendSticker(document, null, xnVar.Q5, null, null, null, xnVar.f43199i5, null, true, 0, 0, false, null, xnVar.C8(), 0L, xnVar.N8(), xnVar.f43135d5);
    }

    public static boolean v1(org.telegram.ui.xn r17, org.telegram.tgnet.TLRPC.MessageEntity r18) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.v1(org.telegram.ui.xn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void w0(xn xnVar) {
        long j10;
        ArrayList arrayList = xnVar.e6;
        arrayList.add(Integer.valueOf(xnVar.S5));
        if (xnVar.O3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(xnVar.currentAccount);
            String str = xnVar.f43308r3;
            int i10 = xnVar.classGuid;
            int i11 = xnVar.L3;
            int i12 = xnVar.S5;
            xnVar.S5 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (xnVar.f43335t7 != 0) {
            MessagesController messagesController = xnVar.getMessagesController();
            long j11 = xnVar.Q5;
            long j12 = xnVar.I6;
            int i13 = xnVar.f43335t7;
            int i14 = xnVar.classGuid;
            int i15 = xnVar.O3;
            long j13 = xnVar.f43094a4;
            int i16 = xnVar.f43210j4;
            int i17 = xnVar.S5;
            xnVar.S5 = i17 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j13, i16, i17, xnVar.f43148e4);
        } else if (xnVar.f43312r7 != 0 && (!xnVar.F9() || xnVar.f43312r7 == xnVar.I7 || xnVar.f43148e4)) {
            int i18 = xnVar.f43176g7;
            if (i18 != 0) {
                xnVar.I6 = i18;
                MessagesController messagesController2 = xnVar.getMessagesController();
                long j14 = xnVar.I6;
                boolean z4 = xnVar.f43150e7;
                int i19 = xnVar.f43137d7;
                int i20 = xnVar.f43312r7;
                int i21 = xnVar.classGuid;
                int i22 = xnVar.O3;
                long j15 = xnVar.f43094a4;
                int i23 = xnVar.f43210j4;
                int i24 = xnVar.S5;
                xnVar.S5 = i24 + 1;
                messagesController2.loadMessages(j14, 0L, z4, i19, i20, 0, true, 0, i21, 3, 0, i22, j15, i23, i24, xnVar.f43148e4);
            } else {
                MessagesController messagesController3 = xnVar.getMessagesController();
                long j16 = xnVar.Q5;
                long j17 = xnVar.I6;
                boolean z10 = xnVar.f43150e7;
                int i25 = xnVar.f43137d7;
                int i26 = xnVar.f43312r7;
                int i27 = xnVar.classGuid;
                int i28 = xnVar.O3;
                long j18 = xnVar.f43094a4;
                int i29 = xnVar.f43210j4;
                int i30 = xnVar.S5;
                xnVar.S5 = i30 + 1;
                messagesController3.loadMessages(j16, j17, z10, i25, i26, 0, true, 0, i27, 3, 0, i28, j18, i29, i30, xnVar.f43148e4);
            }
        } else if (xnVar.f43164f7) {
            xnVar.S5++;
        } else {
            MessagesController messagesController4 = xnVar.getMessagesController();
            long j19 = xnVar.Q5;
            long j20 = xnVar.I6;
            boolean z11 = xnVar.f43150e7;
            int i31 = xnVar.f43137d7;
            int i32 = xnVar.f43312r7;
            int i33 = xnVar.classGuid;
            int i34 = xnVar.O3;
            long j21 = xnVar.f43094a4;
            int i35 = xnVar.f43210j4;
            int i36 = xnVar.S5;
            xnVar.S5 = i36 + 1;
            messagesController4.loadMessages(j19, j20, z11, i31, i32, 0, true, 0, i33, 2, 0, i34, j21, i35, i36, xnVar.f43148e4);
        }
        int i37 = xnVar.O3;
        if (i37 == 0 || (i37 == 3 && xnVar.I8() == xnVar.getUserConfig().getClientUserId())) {
            if (xnVar.F9() && !xnVar.f43148e4) {
                return;
            }
            arrayList.add(Integer.valueOf(xnVar.S5));
            MessagesController messagesController5 = xnVar.getMessagesController();
            long j22 = xnVar.Q5;
            long j23 = xnVar.I6;
            int i38 = xnVar.classGuid;
            if (xnVar.O3 == 3) {
                j10 = 0;
            } else {
                j10 = xnVar.f43094a4;
            }
            long j24 = j10;
            int i39 = xnVar.f43210j4;
            int i40 = xnVar.S5;
            xnVar.S5 = i40 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j24, i39, i40, xnVar.f43148e4);
        }
    }

    public static void w1(xn xnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(xnVar.currentAccount).loadAttachMenuBots(false, true);
            xnVar.W9(user.f20992id, xnVar.f43190h8, false);
        }
    }

    public static void x0(xn xnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z4, pf pfVar) {
        String str3;
        if (xnVar.f43095a5 != null && i10 < arrayList.size() && xnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = xnVar.f43095a5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.v31.I(xnVar.getParentActivity(), xnVar, inputPeer, iArr[0], xnVar.f43095a5.summarized, strArr[0], str3, charSequence, z4, pfVar, new ng(xnVar, 12)).setDimBehind(false);
            xnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(xnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + xnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + xnVar.a(), i11 - 1).apply();
                xnVar.Qc(true);
            }
        }
    }

    public static void x1(xn xnVar, View view, int i10) {
        org.telegram.ui.Components.u5 u5Var;
        TLRPC.User user;
        char c3;
        nk nkVar;
        nk nkVar2;
        if (i10 != 0) {
            uf.u0 adapter = xnVar.F1.getAdapter();
            if (adapter.f48753t0 != null && !adapter.f48735e0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = xnVar.F1.getAdapter().J(i11);
            int i12 = xnVar.F1.getAdapter().U;
            int i13 = xnVar.F1.getAdapter().V;
            if (xnVar.F1.getAdapter().C != null && i11 == 1) {
                xnVar.V.O0(i12, i13, xnVar.F1.getAdapter().C + "@" + ChatObject.getPublicUsername(xnVar.f43143e) + " ", false);
            } else if (xnVar.F1.getAdapter().C != null && i11 == 0) {
                xnVar.V.O0(i12, i13, android.support.v4.media.a.r(new StringBuilder(), xnVar.F1.getAdapter().C, " "), false);
            } else if (J instanceof vf.o1) {
                if (!xnVar.getUserConfig().isPremium()) {
                    xnVar.showDialog(new fg.n1(xnVar, xnVar.getParentActivity(), xnVar.currentAccount, true, 31, false, null));
                    return;
                }
                vf.o1 o1Var = (vf.o1) J;
                org.telegram.ui.Components.z4.a0(xnVar.currentAccount, Math.max(1, o1Var.a()), xnVar.Q5, new lh.a1(15, xnVar, o1Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (xnVar.O3 != 0 || !xnVar.e7(view)) {
                        if (view instanceof org.telegram.ui.Cells.b8) {
                            sendAnimationData = ((org.telegram.ui.Cells.b8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.z4.a0(xnVar.currentAccount, 1, xnVar.a(), new mh.f2(xnVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), xnVar.F1.getAdapter().L(i11), sendAnimationData, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (xnVar.f43221k3 && (nkVar2 = xnVar.O2) != null && nkVar2.getVisibility() == 0) {
                        xnVar.Za(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        xnVar.V.O0(i12, i13, android.support.v4.media.a.o("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (xnVar.f43221k3 && (nkVar = xnVar.O2) != null && nkVar.getVisibility() == 0) {
                        xnVar.Za(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        xnVar.V.O0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(w.c.e(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.o51("" + user2.f20992id, 3, null), 0, spannableString.length(), 33);
                        xnVar.V.O0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof uf.r0) {
                    if (xnVar.F1.getAdapter().G != null && xnVar.O3 != 1) {
                        uf.r0 r0Var = (uf.r0) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(r0Var.f48714a, xnVar.Q5, xnVar.f43223k5, xnVar.U3, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = xnVar.C8();
                        of2.ephemeralReceiverBotId = r0Var.f48715b;
                        of2.monoForumPeer = xnVar.N8();
                        of2.suggestionParams = xnVar.f43135d5;
                        xnVar.getSendMessagesHelper().sendMessage(of2);
                        xnVar.V.setFieldText("");
                        xnVar.e9(false);
                    }
                } else if (J instanceof String) {
                    if (xnVar.F1.getAdapter().G != null) {
                        if (xnVar.O3 == 1) {
                            org.telegram.ui.Components.z4.M(xnVar.getParentActivity(), xnVar.Q5, new ng.w(15, xnVar, (String) J), xnVar.f43114ba);
                            return;
                        } else if (!xnVar.e7(view)) {
                            org.telegram.ui.Components.z4.a0(xnVar.currentAccount, 1, xnVar.Q5, new lh.a1(16, xnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    xnVar.V.O0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (xnVar.V.getFieldText() != null) {
                        if (xnVar.O3 == 1 || !xnVar.e7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (xnVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c3 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c3 = 2;
                                } else {
                                    c3 = 0;
                                }
                                if (c3 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f43114ba);
                                    alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c3 == 1) {
                                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    xnVar.showDialog(alertDialog$Builder.f21168a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(xnVar.F1.getAdapter().O);
                                xnVar.Ea = arrayList;
                                PhotoViewer.t1().K2(null, xnVar, xnVar.f43114ba);
                                PhotoViewer.t1().f2(arrayList, xnVar.F1.getAdapter().M(i11), 3, false, xnVar.Fa, xnVar);
                                return;
                            }
                            org.telegram.ui.Components.z4.a0(xnVar.currentAccount, 1, xnVar.a(), new lh.a1(17, xnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    xc xcVar = new xc(9, xnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (xnVar.f43180gb) {
                        xcVar.run();
                    } else {
                        bj1.a(xnVar.getParentActivity(), new oh.a2(4, xnVar, xcVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    bk bkVar = xnVar.F1;
                    if (bkVar != null && (user = bkVar.getAdapter().f48753t0) != null) {
                        xnVar.V.setFieldText("");
                        long j10 = xnVar.Q5;
                        if (j10 == user.f20992id) {
                            xnVar.f43125c8 = j10;
                            xnVar.getMessagesController().sendBotStart(xnVar.f43156f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f20992id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", xnVar.Q5);
                        if (xnVar.getMessagesController().checkCanOpenChat(bundle, xnVar)) {
                            xnVar.presentFragment(new xn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    jk jkVar = xnVar.V;
                    jkVar.U();
                    jkVar.R0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            xnVar.V.O0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = xnVar.V.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e6) {
                                FileLog.e((Throwable) e6, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f10 = org.telegram.ui.Components.l5.f(xnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f10));
                            if (f10 != null) {
                                u5Var = new org.telegram.ui.Components.u5(f10, fontMetricsInt);
                            } else {
                                u5Var = new org.telegram.ui.Components.u5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(u5Var, 0, spannableString2.length(), 33);
                            xnVar.V.O0(i12, i13, spannableString2, false);
                            xnVar.F1.o(false);
                        }
                    }
                    xnVar.V.O0(i12, i13, str, true);
                    xnVar.F1.o(false);
                }
            }
        }
    }

    public static void y0(xn xnVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z4, int i10) {
        SendMessagesHelper.getInstance(xnVar.currentAccount).sendSticker(tL_document, str, xnVar.Q5, xnVar.f43223k5, xnVar.U3, null, xnVar.f43199i5, null, z4, i10, 0, false, obj, xnVar.C8(), 0L, xnVar.N8(), xnVar.f43135d5);
    }

    public static void y1(xn xnVar, org.telegram.ui.Components.q70 q70Var) {
        if (xnVar.Jb == null) {
            return;
        }
        q70Var.u();
        xnVar.J9(xnVar.Jb, false, true);
        af.g.r(xnVar.getParentActivity(), Uri.parse(xnVar.Jb.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(xnVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void z0(xn xnVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z4, pf pfVar) {
        if (xnVar.f43095a5 != null && i10 < arrayList.size() && xnVar.getParentActivity() != null) {
            org.telegram.ui.Components.v31.I(xnVar.getParentActivity(), xnVar, inputPeer, iArr[0], xnVar.f43095a5.summarized, "und", str, charSequence, z4, pfVar, new ng(xnVar, 4)).setDimBehind(false);
            xnVar.A7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(xnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + xnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + xnVar.a(), i11 - 1).apply();
                xnVar.Qc(true);
            }
        }
    }

    public static void z1(xn xnVar, Context context) {
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.sg sgVar;
        String str;
        SparseArray[] sparseArrayArr = xnVar.T5;
        if (xnVar.getParentActivity() != null && xnVar.K9 == 0.0f) {
            if (xnVar.O3 == 3) {
                Bundle bundle = new Bundle();
                long I8 = xnVar.I8();
                if (I8 >= 0) {
                    bundle.putLong("user_id", I8);
                } else {
                    bundle.putLong("chat_id", -I8);
                }
                xnVar.presentFragment(new xn(bundle));
                return;
            }
            boolean z11 = false;
            if (xnVar.A9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                xnVar.vb(true, true);
                byte[] bArr = xnVar.S3;
                String str2 = xnVar.T3;
                xe xeVar = new xe(xnVar, 1);
                int i11 = q31.v;
                int currentAccount = xnVar.getCurrentAccount();
                Activity parentActivity = xnVar.getParentActivity();
                long a2 = xnVar.a();
                if (parentActivity != null) {
                    q31.J(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.qc.a0(xnVar), xnVar.getResourceProvider(), bArr, str2, xeVar);
                }
            } else if (xnVar.O3 == 2) {
                xnVar.finishFragment();
                km kmVar = xnVar.S8;
                if (xnVar.f43395y0.getTag() == null) {
                    z11 = true;
                }
                kmVar.W(true, z11);
            } else {
                TLRPC.User user = xnVar.f43156f;
                if (user != null && user.f20992id == 489000) {
                    xnVar.bc(true);
                } else if (user != null && xnVar.f43254n) {
                    if (user.bot) {
                        String str3 = xnVar.f43112b8;
                        xnVar.f43112b8 = null;
                        xnVar.getMessagesController().unblockPeer(xnVar.f43156f.f20992id, new qe(xnVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(xnVar.getParentActivity(), 0, xnVar.f43114ba);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.Q = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new te(xnVar, 6));
                    d2Var.O = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    xnVar.showDialog(d2Var);
                } else if (UserObject.isReplyUser(user)) {
                    xnVar.bc(true);
                } else {
                    TLRPC.User user2 = xnVar.f43156f;
                    if (user2 != null && user2.bot && (str = xnVar.f43112b8) != null) {
                        if (str.length() != 0) {
                            xnVar.getMessagesController().sendBotStart(xnVar.f43156f, xnVar.f43112b8);
                        } else {
                            xnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", xnVar.Q5, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        xnVar.f43112b8 = null;
                        xnVar.hc(false);
                        return;
                    }
                    if (ChatObject.isChannel(xnVar.f43143e)) {
                        TLRPC.Chat chat = xnVar.f43143e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (ChatObject.isNotInChat(chat)) {
                                if (xnVar.f43143e.join_request) {
                                    xnVar.vb(true, true);
                                    MessagesController.getInstance(xnVar.currentAccount).addUserToChat(xnVar.f43143e.f20845id, UserConfig.getInstance(xnVar.currentAccount).getCurrentUser(), 0, null, null, true, new le(xnVar, 17), new ng.w(14, xnVar, context));
                                    return;
                                }
                                le leVar = xnVar.I5;
                                if (leVar != null) {
                                    AndroidUtilities.cancelRunOnUIThread(leVar);
                                    xnVar.I5 = null;
                                }
                                xnVar.vb(true, true);
                                xnVar.getMessagesController().addUserToChat(xnVar.f43143e.f20845id, xnVar.getUserConfig().getCurrentUser(), 0, null, xnVar, null);
                                NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                org.telegram.ui.ActionBar.r0 r0Var = xnVar.H1;
                                if (r0Var != null && (sgVar = xnVar.J0) != null && sgVar.d(r0Var) && xnVar.K1.getVisibility() != 8 && xnVar.K1.getTag(R.id.object_tag) != null) {
                                    SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(xnVar.currentAccount).edit();
                                    edit.putInt("dialog_bar_vis3" + xnVar.Q5, 3).commit();
                                    xnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(xnVar.Q5));
                                    return;
                                }
                                return;
                            }
                            xnVar.bc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = xnVar.W7;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    TLRPC.Chat chat2 = xnVar.f43143e;
                    TLRPC.User user3 = xnVar.f43156f;
                    if (xnVar.h != null) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    org.telegram.ui.Components.z4.s(xnVar, false, chat2, user3, z10, true, false, z4, new te(xnVar, 7));
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.pv0 A() {
        return this.U0;
    }

    public final void A6(boolean z4, boolean z10) {
        long j10;
        TLRPC.DraftMessage draft;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        nn nnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        int i10;
        nn nnVar2;
        String str;
        int findQuoteStart;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j12;
        org.telegram.ui.Components.s01 s01Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.u5 u5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        Long l11;
        if (this.V != null) {
            int i11 = this.O3;
            if (i11 == 0 || i11 == 8 || (i11 == 3 && getUserConfig().getClientUserId() == I8())) {
                long j14 = 0;
                if (this.O3 == 8) {
                    if (ChatObject.isMonoForum(this.f43143e)) {
                        if (this.f43094a4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.f43143e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.s01 s01Var2 = null;
                if (v9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.Q5);
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
                    long j15 = this.Q5;
                    if (this.O3 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.f43094a4;
                    }
                    draft = mediaDataController.getDraft(j15, j10);
                    l10 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                jk jkVar = this.V;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                jkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.Q5, b());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j16 = this.Q5;
                    if (l10 != null) {
                        j13 = l10.longValue();
                    } else {
                        j13 = this.f43094a4;
                    }
                    message = mediaDataController2.getDraftMessage(j16, j13);
                } else {
                    message = null;
                }
                if ((!z10 || draftMessage3 == null) && this.V.getFieldText() != null && (this.O3 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.Xb >= draftMessage3.date)) {
                    if (z4 && draftMessage3 == null) {
                        this.V.setFieldText("");
                        this.V.setEffectId(0L);
                        e9(true);
                    }
                } else if (draftVoice != null) {
                    this.V.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.Xb = draftMessage3.date;
                    jk jkVar2 = this.V;
                    jkVar2.T2 = null;
                    jkVar2.U2 = !draftMessage3.no_webpage;
                    if (!draftMessage3.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(draftMessage3.message);
                        MediaDataController.sortEntities(draftMessage3.entities);
                        int i12 = 0;
                        while (i12 < draftMessage3.entities.size()) {
                            TLRPC.MessageEntity messageEntity = draftMessage3.entities.get(i12);
                            boolean z11 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            long j17 = j14;
                            if (z11 || (messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                draftMessage2 = draftMessage3;
                                if (z11) {
                                    j12 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j12 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                s01Var = null;
                                org.telegram.ui.Components.o51 o51Var = new org.telegram.ui.Components.o51(android.support.v4.media.a.n(j12, ""), 3, null);
                                int i13 = messageEntity.offset;
                                valueOf.setSpan(o51Var, i13, messageEntity.length + i13, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f30949a |= 4;
                                    org.telegram.ui.Components.t01 t01Var = new org.telegram.ui.Components.t01(obj, 0);
                                    int i14 = messageEntity.offset;
                                    MediaDataController.addStyleToText(t01Var, i14, messageEntity.length + i14, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f30949a |= 1;
                                        org.telegram.ui.Components.t01 t01Var2 = new org.telegram.ui.Components.t01(obj2, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(t01Var2, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f30949a |= 2;
                                        org.telegram.ui.Components.t01 t01Var3 = new org.telegram.ui.Components.t01(obj3, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(t01Var3, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f30949a |= 8;
                                        org.telegram.ui.Components.t01 t01Var4 = new org.telegram.ui.Components.t01(obj4, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(t01Var4, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f30949a |= 16;
                                        org.telegram.ui.Components.t01 t01Var5 = new org.telegram.ui.Components.t01(obj5, 0);
                                        int i18 = messageEntity.offset;
                                        MediaDataController.addStyleToText(t01Var5, i18, messageEntity.length + i18, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.n51 n51Var = new org.telegram.ui.Components.n51(messageEntity.url, s01Var2);
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(n51Var, i19, messageEntity.length + i19, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f30949a |= 256;
                                        org.telegram.ui.Components.t01 t01Var6 = new org.telegram.ui.Components.t01(obj6, 0);
                                        int i20 = messageEntity.offset;
                                        MediaDataController.addStyleToText(t01Var6, i20, messageEntity.length + i20, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i21 = messageEntity.offset;
                                        org.telegram.ui.Components.bj0.c(valueOf, i21, messageEntity.length + i21, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.V.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e6) {
                                            FileLog.e((Throwable) e6, false);
                                            fontMetricsInt = s01Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            u5Var = new org.telegram.ui.Components.u5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            u5Var = new org.telegram.ui.Components.u5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i22 = messageEntity.offset;
                                        valueOf.setSpan(u5Var, i22, messageEntity.length + i22, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        s01Var = s01Var2;
                                    }
                                    s01Var = s01Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                s01Var = null;
                            }
                            i12++;
                            s01Var2 = s01Var;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        nnVar = s01Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        nnVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.V.f1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.V.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new le(this, 4), 700L);
                    }
                    this.V.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f43135d5 = of2;
                        Db(of2);
                    }
                    messageObject = this.f43223k5;
                    if (messageObject != null || this.U3 == messageObject) {
                        if (message == null && ((messageObject2 = this.U3) == null || messageObject2.getId() != message.f20866id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f43223k5 = messageObject3;
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
                                        nnVar2 = nnVar;
                                    } else {
                                        messageObject3.getDialogId();
                                        nnVar2 = new nn(findQuoteStart, str3.length() + findQuoteStart, messageObject3);
                                    }
                                    this.f43199i5 = nnVar2;
                                }
                            }
                            V6(false);
                            nn nnVar3 = this.f43199i5;
                            if (nnVar3 != null) {
                                Cb(this.f43223k5, nnVar3);
                            } else {
                                Bb(this.f43223k5);
                            }
                            hc(false);
                            return;
                        } else if (l10 == null && l10.longValue() != j11 && this.f43143e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.f43143e.f20845id, l10.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f43223k5 = messageObject4;
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
                nnVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f43135d5 = of22;
                    Db(of22);
                }
                messageObject = this.f43223k5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l10 == null) {
                }
            }
        }
    }

    public final void A7(boolean z4) {
        this.O8 = z4;
        org.telegram.ui.ActionBar.p1 p1Var = this.N8;
        if (p1Var != null) {
            p1Var.dismiss();
        }
        if (!z4) {
            ValueAnimator valueAnimator = this.Yb;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Yb.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Yb = ofFloat;
            ofFloat.addUpdateListener(new ne(this, 0));
            this.Yb.setDuration(150L);
            this.Yb.start();
        }
    }

    public final int A8(MessageObject messageObject, boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.f43203i9 == null) {
            this.f43203i9 = new org.telegram.ui.Cells.t1(getParentActivity(), this.currentAccount, true, this.f43405ya, this.f43114ba);
        }
        org.telegram.ui.Cells.t1 t1Var = this.f43203i9;
        if (this.f43143e == null && !UserObject.isUserSelf(this.f43156f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        t1Var.K7 = z10;
        org.telegram.ui.Cells.t1 t1Var2 = this.f43203i9;
        int i10 = this.O3;
        if (i10 == 3) {
            z11 = true;
        } else {
            z11 = false;
        }
        t1Var2.M7 = z11;
        if (i10 == 3 && this.La) {
            z12 = true;
        } else {
            z12 = false;
        }
        t1Var2.N7 = z12;
        TLRPC.User user = this.f43156f;
        if (user != null && user.bot) {
            z13 = true;
        } else {
            z13 = false;
        }
        t1Var2.O7 = z13;
        if (ChatObject.isChannel(this.f43143e) && this.f43143e.megagroup) {
            z14 = true;
        }
        t1Var2.P7 = z14;
        this.f43203i9.B8 = t9();
        this.f43203i9.C8 = C9();
        this.f43203i9.D8 = B9();
        return this.f43203i9.g1(messageObject, (MessageObject.GroupedMessages) this.f43346u6.f(messageObject.getGroupId()), z4);
    }

    public final boolean A9() {
        return !TextUtils.isEmpty(this.R3);
    }

    public final void Aa(int i10) {
        boolean z4;
        int i11;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z10 = false;
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
                    this.S7 = generatePicturePath.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e6) {
                FileLog.e(e6);
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
                if (ChatObject.isChannel(this.f43143e) && (tL_chatBannedRights = this.f43143e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z4 = false;
                } else {
                    z4 = true;
                }
                wp0 wp0Var = new wp0(0, z4, true, this);
                if (this.O3 == 9) {
                    wp0Var.D = 1;
                    wp0Var.E = true;
                } else {
                    TLRPC.Chat chat = this.f43143e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f43143e.slowmode_enabled) {
                        wp0Var.D = 10;
                        wp0Var.E = true;
                    } else {
                        MessageObject messageObject = this.f43247m5;
                        if (messageObject != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (messageObject == null) {
                            z10 = true;
                        }
                        wp0Var.D = i11;
                        wp0Var.E = z10;
                    }
                }
                wp0Var.S = new pl(this);
                presentFragment(wp0Var);
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
                        this.S7 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Ab(ArrayList arrayList) {
        yb(true, null, null, arrayList, null, null, false, true);
    }

    public final void Ac(boolean z4) {
        boolean z10;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f43207j1 > 0 && ((i10 = this.O3) == 0 || i10 == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43170g1.e(4, z10, z4);
        this.f43170g1.c(4, this.f43207j1, z4);
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.f43143e)) {
            arrayList.add(new ag.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f43090a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new ag.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new ng(this, 15)));
            arrayList.add(new ag.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new ng(this, 16)));
        }
        if (this.f43156f == null) {
            arrayList.add(new ag.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new ag.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new u0("", 1)));
            arrayList.add(new ag.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.c2(this)));
        }
        return arrayList;
    }

    public final int B6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f43340u0.getHeight();
        long j10 = 0;
        int i11 = 0;
        while (true) {
            View T0 = this.f43340u0.T0(i10);
            if (T0 == null) {
                break;
            }
            if (T0 instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) T0;
                messageObject = t1Var.getMessageObject();
                additionalPaddingHeight = t1Var.getAdditionalPaddingHeight();
            } else if (T0 instanceof org.telegram.ui.Cells.v0) {
                messageObject = ((org.telegram.ui.Cells.v0) T0).getMessageObject();
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
                height = Math.min(height, T0.getTop());
                i11 = Math.max(i11, T0.getBottom() - additionalPaddingHeight);
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
        if (this.O3 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.f43143e) && !this.f43148e4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f20897id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.f43143e));
        }
        return this.f43094a4;
    }

    public final boolean B9() {
        org.telegram.ui.Components.w21 w21Var = this.O1;
        if (w21Var != null && w21Var.N && w21Var.f32618a.f50542f) {
            return true;
        }
        return false;
    }

    public final void Ba(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Ba(int):void");
    }

    public final void Bb(MessageObject messageObject) {
        zb(true, messageObject, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void Bc(boolean z4) {
        boolean z10;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f43195i1 > 0 && ((i10 = this.O3) == 0 || i10 == 8)) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43170g1.e(3, z10, z4);
        this.f43170g1.c(3, this.f43195i1, z4);
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final float C6(boolean z4) {
        float f10;
        float f11;
        float f12;
        jk jkVar = this.V;
        float f13 = 0.0f;
        if (jkVar != null) {
            if (z4) {
                f10 = jkVar.f24615g5;
            } else {
                f10 = jkVar.f24609f5;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        xd.a aVar = this.f43339tc;
        h5.u uVar = this.f43407yc;
        if (z4) {
            if (31 - Integer.numberOfLeadingZeros(uVar.f7299a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(uVar.f7299a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f50542f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) uVar.f7300b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f50541e;
            f12 = f14;
        }
        if (!this.La && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f12) * f11, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f13);
        }
        return AndroidUtilities.lerp(dp, max, f12) * f11;
    }

    public final SendMessageChatArguments C8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.O3 == 9) {
            builder.setWelcomeMessageChatId(this.f43302qa);
        }
        if (this.O3 == 5) {
            builder.setQuickReplyShortcut(this.N3, H8());
        }
        return builder.build();
    }

    public final boolean C9() {
        if (this.O1 == null) {
            if (this.Q3 || !ChatObject.isMonoForum(this.f43143e)) {
                if (!ChatObject.isForum(this.f43143e) || !ChatObject.areTabsEnabled(this.f43143e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean Ca(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f43125c8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f43156f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f43125c8 == this.Q5) {
                this.f43125c8 = 0L;
                this.V.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f43125c8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((p2Var instanceof xn) && ((xn) p2Var).Q5 == this.f43125c8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f43125c8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f43125c8));
                } else if (DialogObject.isUserDialog(this.f43125c8)) {
                    bundle.putLong("user_id", this.f43125c8);
                } else {
                    bundle.putLong("chat_id", -this.f43125c8);
                }
                v6();
                presentFragment(new xn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Cb(MessageObject messageObject, nn nnVar) {
        yb(true, messageObject, null, null, null, nnVar, false, true);
    }

    public final void Cc(boolean z4) {
        String string;
        if (this.O3 != 3 && !UserObject.isBotForum(this.f43156f)) {
            lj ljVar = this.X0;
            if (ljVar != null && this.f43094a4 != 0) {
                if (this.f43148e4) {
                    Sc();
                } else if (this.f43134d4) {
                    MessageObject messageObject = this.U3;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.X0.setTitle(LocaleController.formatPluralString("Comments", this.U3.getRepliesCount(), new Object[0]));
                    } else {
                        this.X0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.U3;
                    if (messageObject2 != null) {
                        ljVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.Y3 != null) {
                if (this.U3.getRepliesCount() == 0) {
                    if (this.f43134d4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.Y3;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z4) {
                    this.f43381x0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final boolean D6() {
        if (!z9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f43148e4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                ok okVar = this.L0;
                if (okVar == null || okVar.getVisibility() != 0) {
                    if (!F9() || this.f43148e4) {
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.D7():void");
    }

    public final boolean D9() {
        boolean z4;
        boolean z10;
        float f10;
        FrameLayout frameLayout;
        if (!this.f43117c && !this.d && this.f43156f == null && this.f43340u0 != null && SharedConfig.animationsEnabled()) {
            if (this.f43167fb == null) {
                this.f43167fb = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.f43167fb.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f43340u0.getChildCount(); i12++) {
                    i11 += this.f43340u0.getChildAt(i12).getHeight();
                    int top = this.f43340u0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f11 = i10;
                if (f11 <= this.f43288p9) {
                    L6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.f43413z6;
                boolean z11 = zArr[0];
                ArrayList arrayList = this.f43311r6;
                if ((!z11 || ((this.I6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.D6 && f11 > this.f43288p9 && (!arrayList.isEmpty() ? i11 != 0 : this.f43154eb)) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (!z4 || !this.inTransitionAnimation || (frameLayout = this.N0) == null || frameLayout.getVisibility() != 0 || this.N0.getChildCount() <= 0) {
                    if (!z4 && this.K6 == 0) {
                        L6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.O9 && this.fragmentBeginToShow) {
                        if (z4 && this.K6 == 0) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        Drawable d = this.f43114ba.d();
                        pm pmVar = this.U0;
                        if (pmVar != null) {
                            d = pmVar.getBackgroundImage();
                        }
                        if (d instanceof org.telegram.ui.Components.fc0) {
                            org.telegram.ui.Components.fc0 fc0Var = (org.telegram.ui.Components.fc0) d;
                            if (fc0Var.N != z10) {
                                if (!z10) {
                                    fc0Var.c();
                                }
                                fc0Var.q(z10);
                                if (z10) {
                                    f10 = 1.5f;
                                } else {
                                    f10 = 1.0f;
                                }
                                fc0Var.M = f10;
                                fc0Var.z();
                            } else if (z10) {
                                fc0Var.z();
                            }
                        }
                    }
                    if (z4 || (this.K6 != 0 && System.currentTimeMillis() - this.K6 <= 200)) {
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
        tL_message.f20866id = 0;
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
        this.f43381x0.M.add(i10, messageObject2);
    }

    public final void Db(MessageSuggestionParams messageSuggestionParams) {
        zb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Dc(MessageObject messageObject, int i10) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.f43261n6;
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
            MessageObject messageObject3 = (MessageObject) this.f43236l6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                jm jmVar = this.f43381x0;
                if (jmVar != null) {
                    jmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    public final boolean E6() {
        if (this.h == null) {
            ok okVar = this.L0;
            if (okVar == null || okVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void E7() {
        if (getParentActivity() != null && getParentActivity() != null && this.G1 == null) {
            oh.u2 u2Var = new oh.u2(this, getParentActivity(), this, this.f43114ba, 1);
            this.G1 = u2Var;
            u2Var.W = a();
            oh.u2 u2Var2 = this.G1;
            u2Var2.f29069f0 = true;
            u2Var2.W1 = new ml(this);
        }
    }

    public final int E8(MessageObject messageObject) {
        String str;
        String str2;
        if (messageObject == null) {
            return -1;
        }
        boolean z4 = false;
        boolean z10 = true;
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
                                z4 = true;
                            }
                            if (z4 || !messageObject.mediaExists()) {
                                z10 = z4;
                            }
                            if (z10) {
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f20865id)) {
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
                        z4 = true;
                    }
                    if (z4 || !FileLoader.getInstance(this.currentAccount).getPathToMessage(messageObject.messageOwner).exists()) {
                        z10 = z4;
                    }
                    if (z10) {
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
        this.E4.clear();
        this.G4.clear();
        this.I4 = 0;
        this.M4 = 0;
        this.N4 = 0;
        yc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.W7;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.O4 = true;
        zc();
    }

    public final void Eb(boolean z4, TLRPC.WebPage webPage, boolean z10) {
        yb(z4, null, null, null, webPage, null, z10, true);
    }

    public final void Ec(boolean z4) {
        jk jkVar = this.V;
        if (jkVar != null) {
            jkVar.O1(z4);
        }
    }

    @Override
    public final boolean F() {
        return this.f43165f8;
    }

    public final boolean F6(MessageObject messageObject) {
        if (this.O3 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.f43143e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f43143e.f20845id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.O3 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.f43143e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void F7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z4) {
        ng ngVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.T5;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f43156f;
        TLRPC.Chat chat = this.f43143e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.W7;
        long j10 = this.I6;
        int b10 = (int) b();
        int i10 = this.O3;
        ng ngVar2 = new ng(this, 6);
        if (z4) {
            ngVar = new ng(this, 7);
        } else {
            ngVar = null;
        }
        ng ngVar3 = ngVar;
        org.telegram.ui.Components.z4.z(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.T5, groupedMessages, b10, i10, null, ngVar2, ngVar3, this.f43114ba);
    }

    public final int F8() {
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        int i10 = 0;
        if (f5Var == null || f5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(i10);
                if (p2Var != this && (p2Var instanceof xn) && ((xn) p2Var).Q5 == this.Q5) {
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
        if (this.U3 != null) {
            return true;
        }
        return false;
    }

    public final void Fa(MessageObject messageObject) {
        if (messageObject == this.Jb) {
            this.Jb = null;
            Qc(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.Q5);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Fb(boolean z4) {
        if (this.U2 != null && !z9()) {
            if (this.U2.getTag() == null) {
                AnimatorSet animatorSet = this.f43133d3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.U2.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f43133d3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f43133d3.playTogether(ObjectAnimator.ofFloat(this.U2, View.ALPHA, 1.0f));
                this.f43133d3.addListener(new ti(this, 5));
                this.f43133d3.start();
            }
            if (!z4) {
                r9();
                this.X2 = 1000;
            }
        }
    }

    public final void Fc(int i10, int i11, int i12) {
        float f10;
        int i13;
        boolean z4;
        boolean z10;
        xg.g gVar = this.f43170g1;
        boolean z11 = false;
        if (gVar != null) {
            int i14 = 2;
            if (this.Ma) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            gVar.b(6).f11144c = z4;
            s5.m mVar = gVar.f50622e[6];
            if (mVar != null) {
                ((wg.b) mVar.f47093b).b(z4, true);
            }
            xg.g gVar2 = this.f43170g1;
            if (this.Ma) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar2.b(5).f11144c = z10;
            s5.m mVar2 = gVar2.f50622e[5];
            if (mVar2 != null) {
                ((wg.b) mVar2.f47093b).b(z10, true);
            }
        }
        this.f43332t3 = i12;
        this.f43343u3 = i11;
        Gc();
        org.telegram.ui.Components.k6 k6Var = this.S2;
        if (k6Var != null) {
            if (i12 > 0) {
                z11 = true;
            }
            k6Var.setClickable(z11);
            ViewPropertyAnimator animate = this.S2.animate();
            if (i12 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
        }
    }

    public final void G6(boolean z4) {
        TLRPC.User user;
        TLRPC.UserFull userFull;
        TLRPC.ChatFull chatFull;
        TLRPC.ChatFull chatFull2;
        TLRPC.User user2;
        boolean z10;
        final boolean z11;
        float f10;
        float f11;
        float f12;
        float f13;
        int i10;
        float f14;
        float f15;
        float f16;
        float f17;
        int i11;
        TLRPC.EncryptedChat encryptedChat = this.h;
        boolean z12 = true;
        int i12 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f43143e != null && (this.O3 != 0 || this.f43094a4 != 0 || (chatFull = this.W7) == null || chatFull.ttl_period == 0)) || ((user = this.f43156f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.X7) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.u0 u0Var = this.Z;
            if (u0Var != null) {
                u0Var.e(8);
            }
            lj ljVar = this.X0;
            if (ljVar != null) {
                ljVar.f25302a.a(false, z4);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var2 = this.Z;
            if (u0Var2 != null) {
                u0Var2.e(0);
            }
            lj ljVar2 = this.X0;
            if (ljVar2 != null) {
                ljVar2.f25302a.a(true, z4);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f43279p0;
        if (u0Var3 != null) {
            TLRPC.Chat chat = this.f43143e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u0Var3.e(i11);
        }
        lj ljVar3 = this.X0;
        if (ljVar3 != null) {
            TLRPC.Chat chat2 = this.f43143e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f43156f) != null && user2.linked_community_id != 0)) {
                z10 = true;
            } else {
                z10 = false;
            }
            ljVar3.setCommunityItemVisible(z10);
            final lj ljVar4 = this.X0;
            TLRPC.Chat chat3 = this.f43143e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ImageView imageView = ljVar4.B;
            ImageView imageView2 = ljVar4.f25329y;
            if (imageView2 != null && imageView != null) {
                ljVar4.f25315i0 = z11;
                float f18 = 1.1f;
                float f19 = 1.0f;
                if (!z4) {
                    int i13 = 4;
                    if (z11) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView2.setVisibility(i10);
                    if (z11) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.0f;
                    }
                    imageView2.setAlpha(f14);
                    if (z11) {
                        f15 = 1.1f;
                    } else {
                        f15 = 0.0f;
                    }
                    imageView2.setScaleX(f15);
                    if (!z11) {
                        f18 = 0.0f;
                    }
                    imageView2.setScaleY(f18);
                    if (z11) {
                        i13 = 0;
                    }
                    imageView.setVisibility(i13);
                    if (z11) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    imageView.setAlpha(f16);
                    if (z11) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.0f;
                    }
                    imageView.setScaleX(f17);
                    if (!z11) {
                        f19 = 0.0f;
                    }
                    imageView.setScaleY(f19);
                } else {
                    if (z11) {
                        imageView2.setVisibility(0);
                        imageView.setVisibility(0);
                    }
                    ViewPropertyAnimator animate = imageView2.animate();
                    if (z11) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    ViewPropertyAnimator alpha = animate.alpha(f10);
                    if (z11) {
                        f11 = 1.1f;
                    } else {
                        f11 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                    if (!z11) {
                        f18 = 0.0f;
                    }
                    scaleX.scaleY(f18).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z13 = z11;
                                    ao aoVar = ljVar4;
                                    if (!z13) {
                                        aoVar.f25329y.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z14 = z11;
                                    ao aoVar2 = ljVar4;
                                    if (!z14) {
                                        aoVar2.B.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                    ViewPropertyAnimator animate2 = imageView.animate();
                    if (z11) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    ViewPropertyAnimator alpha2 = animate2.alpha(f12);
                    if (z11) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                    if (!z11) {
                        f19 = 0.0f;
                    }
                    scaleX2.scaleY(f19).withEndAction(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    boolean z13 = z11;
                                    ao aoVar = ljVar4;
                                    if (!z13) {
                                        aoVar.f25329y.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z14 = z11;
                                    ao aoVar2 = ljVar4;
                                    if (!z14) {
                                        aoVar2.B.setVisibility(4);
                                        return;
                                    } else {
                                        aoVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.X0.g(encryptedChat2.ttl, z4);
            } else {
                TLRPC.UserFull userFull2 = this.X7;
                if (userFull2 != null) {
                    this.X0.g(userFull2.ttl_period, z4);
                } else {
                    TLRPC.ChatFull chatFull3 = this.W7;
                    if (chatFull3 != null) {
                        this.X0.g(chatFull3.ttl_period, z4);
                    }
                }
            }
        }
        if (this.f43267o0 != null && (chatFull2 = this.W7) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.f43143e)) {
                TLRPC.Chat chat4 = this.f43143e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z12 = false;
                }
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f43267o0;
            if (z12) {
                i12 = 0;
            }
            u0Var4.e(i12);
        }
        p();
    }

    public final void G7(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.G7(boolean):void");
    }

    public final int G8() {
        return Math.max(this.M4, this.N4);
    }

    public final void G9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.f43311r6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            MessageObject messageObject = (MessageObject) l.d.i(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.f43413z6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() != this.I6) {
                            i13 = 0;
                        }
                        j(id2, 0, false, i13, true, 0);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.Q5)) {
                int N0 = this.f43367w0.N0();
                int L0 = this.f43367w0.L0();
                while (true) {
                    if (L0 <= N0) {
                        jm jmVar = this.f43381x0;
                        int i14 = jmVar.G;
                        if (L0 >= i14 && L0 < jmVar.H && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
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
                this.T8.d(i11);
                org.telegram.ui.ActionBar.d2 d2Var = this.f43252mb;
                if (d2Var != null) {
                    d2Var.dismiss();
                }
                xc(false);
                org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, this.f43114ba);
                this.f43252mb = d2Var2;
                d2Var2.setOnCancelListener(this.f43216ja);
                this.f43252mb.q(1000L);
                int i15 = this.S5;
                this.V8 = i15;
                this.X8 = false;
                this.e6.add(Integer.valueOf(i15));
                this.W8 = 0;
                this.Y8 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.Q5;
                long j11 = this.I6;
                int i16 = this.classGuid;
                int i17 = this.O3;
                long j12 = this.f43094a4;
                int i18 = this.f43210j4;
                int i19 = this.S5;
                this.S5 = i19 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j12, i18, i19, this.f43148e4);
                this.U2.setAlpha(0.0f);
                this.U2.setTag(null);
                this.f43160f3 = 0.0f;
                lc();
                this.V2.setTag(null);
            }
        }
    }

    public final void Ga(MessageObject messageObject) {
        ArrayList arrayList = this.f43311r6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jm jmVar = this.f43381x0;
            if (jmVar != null && !jmVar.K) {
                jmVar.u(jmVar.G + indexOf);
            }
        }
    }

    public final void Gb(boolean z4) {
        if (this.V2 != null && !z9()) {
            if (this.V2.getTag() == null) {
                ValueAnimator valueAnimator = this.f43147e3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.V2.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43160f3, 1.0f);
                this.f43147e3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f43147e3.addUpdateListener(new ne(this, 2));
                this.f43147e3.addListener(new ti(this, 7));
                this.f43147e3.start();
            }
            if (!z4) {
                r9();
                this.X2 = 1000;
            }
        }
    }

    public final void Gc() {
        org.telegram.ui.Components.k6 k6Var = this.R2;
        if (k6Var != null) {
            boolean z4 = !LocaleController.isRTL;
            int i10 = this.f43332t3;
            if (i10 < 0) {
                k6Var.c("", z4, true);
            } else if (i10 == 0) {
                k6Var.c(LocaleController.getString(R.string.NoResult), z4, true);
            } else if (this.f43270o3) {
                k6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z4, true);
            } else if (this.O3 != 7 && !this.f43365vc.f50542f) {
                k6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.f43343u3 + 1), Integer.valueOf(this.f43332t3)), z4, true);
            } else {
                k6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z4, true);
            }
        }
    }

    @Override
    public final long H() {
        return this.I6;
    }

    public final void H6() {
        if (this.La) {
            return;
        }
        if (A9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int H8() {
        if (this.O3 == 5) {
            return (int) this.f43094a4;
        }
        return 0;
    }

    public final void H9() {
        this.A4 = true;
        if (this.f43212j6) {
            getMessagesStorage().getUnreadMention(this.Q5, b(), new vg(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.Q5);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f43148e4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f43094a4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f43200i6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new eg.b3(28, this, messagesStorage));
    }

    public final void Ha(MessageObject messageObject) {
        ArrayList arrayList = this.f43311r6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            jm jmVar = this.f43381x0;
            if (jmVar != null && !jmVar.K) {
                jmVar.P(jmVar.G + indexOf, true);
            }
        }
    }

    public final boolean Hb() {
        jk jkVar = this.V;
        if (jkVar != null && jkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f43106b2 == null) {
                    if (!this.Y4) {
                        jk jkVar2 = this.V;
                        if (jkVar2 != null) {
                            jkVar2.U();
                            MediaDataController.getInstance(jkVar2.N).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.uf ufVar = jkVar2.R0;
                            ufVar.N(false, false);
                            ufVar.S(false, false);
                            ufVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        pm pmVar = this.U0;
                        int indexOfChild = pmVar.indexOfChild(this.P);
                        if (indexOfChild != -1) {
                            jk jkVar3 = this.V;
                            jkVar3.U();
                            MediaDataController.getInstance(jkVar3.N).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.uf ufVar2 = jkVar3.R0;
                            ufVar2.N(false, false);
                            ufVar2.S(false, false);
                            ufVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.f43331t2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            pmVar.addView(this.f43331t2, i10, k7.c6.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(9, getParentActivity(), this.f43114ba, false);
                            this.f43106b2 = m40Var;
                            m40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            pmVar.addView(this.f43106b2, i10, k7.c6.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.m40 m40Var2 = this.f43106b2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(m40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.f43331t2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new ti(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.V.getEmojiButton();
                            if (emojiButton != null) {
                                this.f43106b2.f(emojiButton, true);
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
        String str = this.f43308r3;
        if (str != null) {
            this.a2.f34033e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.I3.setEmptyView(this.a2);
            return;
        }
        this.I3.setEmptyView(null);
        this.a2.setVisibility(8);
    }

    public final void I6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.I6():void");
    }

    public final boolean I7(android.view.View r92, boolean r93, boolean r94, float r95, float r96, boolean r97, boolean r98, boolean r99) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.I7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final long I8() {
        if (this.O3 == 3) {
            return this.f43094a4;
        }
        return 0L;
    }

    public final void I9(boolean z4) {
        TLRPC.Chat chat;
        if (this.f43153ea == null && (chat = this.f43143e) != null && ChatObject.canSendAsPeers(chat) && this.V != null && !ChatObject.isMonoForum(this.f43143e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.Q5);
            this.f43153ea = sendAsPeers;
            if (sendAsPeers != null) {
                this.V.Q1(false, z4);
            }
        }
    }

    public final void Ia() {
        if (this.M7 == null && this.N7 == null && this.O7 == null) {
            le leVar = this.R7;
            if (leVar != null) {
                AndroidUtilities.cancelRunOnUIThread(leVar);
                this.R7 = null;
            }
            this.I7 = Integer.MAX_VALUE;
            this.K7 = false;
            this.L7 = 0L;
            this.M7 = null;
            this.N7 = null;
            this.O7 = null;
        }
    }

    public final void Ib() {
        TLRPC.ChatFull chatFull = this.W7;
        if (chatFull != null && !this.f43260n5) {
            TLRPC.Chat chat = this.f43143e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new le(this, 14), 1000L);
            }
        }
    }

    public final void Ic() {
        boolean z4;
        if (this.f43170g1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.f43282p3 && !this.f43270o3) || (this.O3 == 7 && this.L3 == 2 && !this.f43311r6.isEmpty())) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f43170g1.e(6, z4, true);
        this.f43170g1.e(5, z4, true);
        if (z4) {
            this.f43170g1.e(1, false, true);
        }
        if (!z4) {
            this.f43402y7 = 0;
        }
        this.U0.invalidate();
    }

    @Override
    public final boolean J(py pyVar) {
        return false;
    }

    public final void J6(View view, int i10, boolean z4) {
        int i11;
        if (view != null) {
            float f10 = (1.0f - this.f43339tc.f50541e) * (1.0f - this.f43317rc.f50541e) * ((float[]) this.f43407yc.f7300b)[i10];
            view.setAlpha(f10);
            if (z4) {
                if (f10 > 0.0f) {
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
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f43340u0.getMeasuredHeight() - this.f43391xa) - this.f43288p9) - this.v.d()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void J9(MessageObject messageObject, boolean z4, boolean z10) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z4;
            tL_messages_clickSponsoredMessage.fullscreen = z10;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Ja(boolean z4) {
        MessageObject messageObject = this.G7;
        if (messageObject != null) {
            if (z4) {
                boolean[] zArr = this.B6;
                zArr[1] = true;
                zArr[0] = true;
                this.E7 = 0;
                this.H6 = 0;
            }
            this.A7 = 0;
            this.B7 = false;
            Ga(messageObject);
            this.G7 = null;
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
        org.telegram.ui.Components.ic G = org.telegram.ui.Components.qc.a0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f27778j = max;
        G.v = new af(this, i10, 3);
        G.k(true);
        this.D3 = messageObject;
        this.E3 = i10;
    }

    public final void Jc(String str) {
        if (this.O3 == 7 && !TextUtils.equals(this.f43308r3, str)) {
            M7();
            Lb(true);
            this.f43308r3 = str;
            this.f43295q3 = str;
            R6(false);
            x7(true);
            this.K6 = 0L;
            this.f43189h7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.L3);
            this.J3.l();
            this.I3.requestLayout();
            if (this.I3.getLayoutManager() != null) {
                this.I3.getLayoutManager().n0(0);
            }
            Hc();
            this.a2.e(true, true);
            r8();
        }
    }

    public final boolean K6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.W7);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            fg.v0.C1(this, this.A1, this.B1, this.Q5, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void K7() {
        if (this.h == null && this.f43342u2 == null && getParentActivity() != null) {
            hl hlVar = new hl(this, getParentActivity());
            this.f43342u2 = hlVar;
            hlVar.setTag(1);
            this.J0.addView(this.f43342u2, k7.c6.n(-1, 48));
            this.J0.h(1, this.f43342u2);
            this.J0.g(this.f43342u2);
            this.f43342u2.setOnClickListener(new ue(this, 17));
            this.f43342u2.setEnabled(!isInPreviewMode());
            this.f43342u2.setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            org.telegram.ui.Components.cg0 cg0Var = new org.telegram.ui.Components.cg0(getParentActivity(), this.f43114ba);
            this.f43369w2 = cg0Var;
            this.f43342u2.addView(cg0Var, k7.c6.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.f43342u2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.C2 = numberTextView;
            numberTextView.h = true;
            int i10 = 14;
            numberTextView.setTextSize(14);
            this.C2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21705fe));
            this.C2.setTypeface(AndroidUtilities.bold());
            this.f43342u2.addView(this.C2, k7.c6.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            int i11 = 0;
            while (i11 < 2) {
                wn wnVar = new wn(this, getParentActivity());
                wn[] wnVarArr = this.f43410z2;
                wnVarArr[i11] = wnVar;
                wnVar.setTextSize(i10);
                wnVarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21705fe));
                wnVarArr[i11].setTypeface(AndroidUtilities.bold());
                this.f43342u2.addView(wnVarArr[i11], k7.c6.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                il ilVar = new il(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.l5[] l5VarArr = this.A2;
                l5VarArr[i11] = ilVar;
                ilVar.setTextSize(i10);
                l5VarArr[i11].setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21724ge));
                this.f43342u2.addView(l5VarArr[i11], k7.c6.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                hg.q qVar = new hg.q(getParentActivity(), 12);
                qVar.setSingleLine(true);
                qVar.setLines(1);
                qVar.setMaxLines(1);
                qVar.setEllipsize(TextUtils.TruncateAt.END);
                qVar.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Sh));
                qVar.setBackground(org.telegram.ui.ActionBar.a6.e(new float[]{16.0f}, getThemedColor(org.telegram.ui.ActionBar.k6.Oh)));
                qVar.setTextSize(1, 14.0f);
                qVar.setTypeface(AndroidUtilities.bold());
                qVar.setGravity(17);
                qVar.setPadding(AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f), 0);
                hg.q[] qVarArr = this.B2;
                qVarArr[i11] = qVar;
                this.f43342u2.addView(qVar, k7.c6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                jl jlVar = new jl(getParentActivity());
                jlVar.F = new jh.k();
                jlVar.E = new Path();
                jlVar.G = new float[8];
                org.telegram.ui.Components.p9[] p9VarArr = this.f43397y2;
                p9VarArr[i11] = jlVar;
                jlVar.setBlurAllowed(true);
                p9VarArr[i11].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.f43342u2.addView(p9VarArr[i11], k7.c6.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i11 == 1) {
                    wnVarArr[i11].setVisibility(4);
                    qVarArr[i11].setVisibility(4);
                    l5VarArr[i11].setVisibility(4);
                    p9VarArr[i11].setVisibility(4);
                }
                i11++;
                i10 = 14;
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.I2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.I2;
            int i12 = org.telegram.ui.ActionBar.k6.f21669de;
            int themedColor = getThemedColor(i12);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            imageView2.setColorFilter(new PorterDuffColorFilter(themedColor, mode));
            ImageView imageView3 = this.I2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.I2.setContentDescription(LocaleController.getString(R.string.AccPinnedMessagesList));
            this.I2.setVisibility(4);
            this.I2.setAlpha(0.0f);
            this.I2.setScaleX(0.4f);
            this.I2.setScaleY(0.4f);
            ImageView imageView4 = this.I2;
            int i13 = org.telegram.ui.ActionBar.k6.f22020x7;
            imageView4.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13) & 436207615, 1, -1));
            this.f43342u2.addView(this.I2, k7.c6.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.I2.setOnClickListener(new ue(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.G2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            this.G2.setColorFilter(new PorterDuffColorFilter(getThemedColor(i12), mode));
            this.G2.setScaleType(scaleType);
            this.G2.setVisibility(8);
            this.G2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f43114ba);
            this.H2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.H2.setSize(AndroidUtilities.dp(16.0f));
            this.H2.setStrokeWidth(2.0f);
            this.H2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21687ee));
            this.f43342u2.addView(this.H2, k7.c6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.G2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i13) & 436207615, 1, AndroidUtilities.dp(14.0f)));
            this.f43342u2.addView(this.G2, k7.c6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.G2.setOnClickListener(new ue(this, 19));
            xc(false);
        }
    }

    public final int K8(MessageObject messageObject) {
        return J8(A8(messageObject, !TextUtils.isEmpty(this.M7))) - Ua(messageObject);
    }

    public final vi K9(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle) {
        af.f fVar = this.f43392xb;
        if (fVar != null) {
            fVar.a(true);
            this.f43392xb = null;
        }
        if (characterStyle != null && t1Var != null && t1Var.getMessageObject() != null) {
            vi viVar = new vi(this, t1Var.getMessageObject().getId(), characterStyle, t1Var, 0);
            this.f43392xb = viVar;
            return viVar;
        }
        this.f43392xb = null;
        return null;
    }

    public final void Ka(ArrayList arrayList, int i10, boolean z4, boolean z10) {
        a0.h hVar;
        ArrayList arrayList2;
        jm jmVar;
        int i11;
        int i12;
        ArrayList arrayList3;
        HashMap hashMap;
        int i13;
        int i14;
        int i15;
        boolean z11;
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
            hVar = this.f43346u6;
            arrayList2 = this.f43311r6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.G4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.G4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.f43236l6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f43156f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f43156f.f20992id, (int) b(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                Ta();
                this.Nb.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.Mb.bind(messageObject2.messageOwner.f20866id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f20866id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.G4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.G4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.I4) {
                    yc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.f43248m6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z4 || z10 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.O3 == 1))) {
                if (z4) {
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
                    HashMap hashMap2 = this.f43273o6;
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
                                groupedMessages2.reversed = this.Ma;
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
                    if (this.O3 == 3) {
                        messageObject.isSaved = true;
                    }
                    if (messageObject.type >= 0) {
                        boolean z12 = messageObject.reactionsChanged;
                        if (messageObject2.isBotPendingDraft && !messageObject.isBotPendingDraft) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        messageObject.reactionsChanged = z12 | z11;
                        messageObject.copyStableParams(messageObject2);
                        arrayList2.set(indexOf2, messageObject);
                        jm jmVar2 = this.f43381x0;
                        if (jmVar2 != null && !jmVar2.K) {
                            jmVar2.Q(jmVar2.G + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        jm jmVar3 = this.f43381x0;
                        if (jmVar3 != null && !jmVar3.K) {
                            jmVar3.u(jmVar3.G + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.h hVar3 = this.f43298q6;
                        if (((MessageObject) hVar3.f(id4)) != null) {
                            hVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            jm jmVar4 = this.f43381x0;
                            int i22 = jmVar4.B;
                            int i23 = jmVar4.C;
                            int i24 = jmVar4.E;
                            int i25 = jmVar4.D;
                            if (!jmVar4.K) {
                                jmVar4.u(jmVar4.G + indexOf2);
                                if (arrayList2.isEmpty()) {
                                    if (i22 >= 0) {
                                        i15 = 0;
                                        this.f43381x0.u(0);
                                    } else {
                                        i15 = 0;
                                    }
                                    if (i23 >= 0) {
                                        this.f43381x0.u(i15);
                                    }
                                    if (i24 >= 0) {
                                        this.f43381x0.u(i15);
                                    }
                                    if (i25 >= 0) {
                                        this.f43381x0.u(i15);
                                    }
                                }
                            }
                        }
                        if (i21 >= 0) {
                            arrayList9.remove(i21);
                            if (arrayList9.isEmpty()) {
                                hashMap.remove(messageObject2.dateKey);
                                this.f43285p6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                jm jmVar5 = this.f43381x0;
                                int i26 = jmVar5.B;
                                int i27 = jmVar5.C;
                                int i28 = jmVar5.E;
                                int i29 = jmVar5.D;
                                if (!jmVar5.K) {
                                    jmVar5.u(jmVar5.G + indexOf2);
                                    if (arrayList2.isEmpty()) {
                                        if (i26 >= 0) {
                                            i14 = 0;
                                            this.f43381x0.u(0);
                                        } else {
                                            i14 = 0;
                                        }
                                        if (i27 >= 0) {
                                            this.f43381x0.u(i14);
                                        }
                                        if (i28 >= 0) {
                                            this.f43381x0.u(i14);
                                        }
                                        if (i29 >= 0) {
                                            this.f43381x0.u(i14);
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
                    int indexOf3 = arrayList2.indexOf((MessageObject) l.d.i(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (jmVar = this.f43381x0) != null) {
                        jmVar.q(indexOf3 + jmVar.G, groupedMessages3.messages.size());
                        sj sjVar = this.f43353v0;
                        if (sjVar != null) {
                            sjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        zc();
    }

    public final void Kb(boolean z4) {
        boolean z10;
        xg.g gVar = this.f43170g1;
        if (gVar != null) {
            if (z4 && !ChatObject.isMonoForum(this.f43143e)) {
                z10 = true;
            } else {
                z10 = false;
            }
            gVar.e(2, z10, true);
            if (!z4) {
                this.f43402y7 = 0;
            }
        }
    }

    public final void Kc() {
        jk jkVar;
        if (this.O != null) {
            this.B0.setBackground(null);
            this.B0.setOnClickListener(null);
            boolean z4 = true;
            if (this.O3 == 3 && I8() == 2666000) {
                this.B0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.O.setVisibility(0);
                this.F1.setVisibility(8);
                this.F1.setTag(null);
                sc();
                org.telegram.ui.Components.qy0 qy0Var = this.f43092a1;
                if (qy0Var != null) {
                    qy0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f43143e;
                if (chat != null && !ChatObject.canSendMessages(chat) && !ChatObject.canSendAnyMedia(this.f43143e)) {
                    TLRPC.Chat chat2 = this.f43143e;
                    if (!chat2.gigagroup && (!ChatObject.isChannel(chat2) || this.f43143e.megagroup)) {
                        TLRPC.Chat chat3 = this.f43143e;
                        TLRPC.TL_chatBannedRights tL_chatBannedRights = chat3.default_banned_rights;
                        if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                            if (ChatObject.isPossibleRemoveChatRestrictionsByBoosts(chat3)) {
                                Drawable mutate = getParentActivity().getDrawable(R.drawable.filled_limit_boost).mutate();
                                int i10 = org.telegram.ui.ActionBar.k6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.pq pqVar = new org.telegram.ui.Components.pq(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                pqVar.f30161e = dp;
                                pqVar.f30162f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                pqVar.h = dp3;
                                pqVar.f30163n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.y3.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new ForegroundColorSpan(getThemedColor(i10)), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(pqVar, 1), 0, 1, 33);
                                this.B0.setBackground(org.telegram.ui.ActionBar.k6.g0(0, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f21752i6, false)));
                                this.B0.setText(spannableStringBuilder);
                                this.B0.setOnClickListener(new ue(this, 0));
                            } else {
                                this.B0.setText(LocaleController.getString(R.string.GlobalSendMessageRestricted));
                            }
                        } else if (AndroidUtilities.isBannedForever(chat3.banned_rights)) {
                            this.B0.setText(LocaleController.getString(R.string.SendMessageRestrictedForever));
                        } else {
                            this.B0.setText(LocaleController.formatString("SendMessageRestricted", R.string.SendMessageRestricted, LocaleController.formatDateForBan(this.f43143e.banned_rights.until_date)));
                        }
                        this.O.setVisibility(0);
                        this.F1.setVisibility(8);
                        this.F1.setTag(null);
                        sc();
                        org.telegram.ui.Components.qy0 qy0Var2 = this.f43092a1;
                        if (qy0Var2 != null) {
                            qy0Var2.f();
                        }
                    }
                }
                G7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.V0 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.B0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.O.setVisibility(0);
                        this.V.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.B0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, android.support.v4.media.a.r(new StringBuilder("<b>"), this.f43156f.first_name, "</b>"))));
                        this.O.setVisibility(0);
                        this.V.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.B0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.O.setVisibility(0);
                        this.V.setVisibility(4);
                        this.V.setFieldText("");
                        getMediaDataController().cleanDraft(this.Q5, this.f43094a4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.O.setVisibility(4);
                            if (!this.inPreviewMode && !this.La && this.O3 != 3) {
                                this.V.setVisibility(0);
                            }
                        }
                        z4 = false;
                    }
                    W6();
                    G6(false);
                } else {
                    this.O.setVisibility(4);
                    if (this.f43092a1 != null && (jkVar = this.V) != null && jkVar.k0()) {
                        this.f43092a1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.O.setVisibility(4);
            }
            if (z4) {
                this.V.m0(false);
                if (getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final void L(int i10, float f10, float f11, xd.c cVar) {
        boolean z4;
        int i11;
        boolean z10;
        int i12;
        if (i10 == 0) {
            S9();
            return;
        }
        int i13 = 4;
        int i14 = 0;
        if (i10 == 1) {
            View view = this.Q;
            if (view != null) {
                view.setAlpha(f10);
                View view2 = this.Q;
                if (f10 > 0.0f) {
                    i13 = 0;
                }
                view2.setVisibility(i13);
            }
        } else if (i10 == 2) {
            S9();
            s7();
            eh.f fVar = this.f43417zc;
            if (fVar != null) {
                fVar.setAnimatedVisibility(this.f43339tc.f50541e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                xd.a aVar = this.f43352uc;
                float f12 = 1.0f - aVar.f50541e;
                this.J0.setAlpha(f12);
                org.telegram.ui.Components.sg sgVar = this.J0;
                if (f12 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                sgVar.setVisibility(i12);
                float f13 = 1.0f - aVar.f50541e;
                org.telegram.ui.Components.w21 w21Var = this.O1;
                if (w21Var != null) {
                    w21Var.setAlpha(f13);
                    org.telegram.ui.Components.w21 w21Var2 = this.O1;
                    if (f13 <= 0.0f) {
                        i14 = 8;
                    }
                    w21Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                vg.e eVar = this.H3;
                xd.a aVar2 = this.f43365vc;
                if (eVar != null) {
                    float f14 = aVar2.f50541e;
                    eVar.setAlpha(f14);
                    vg.e eVar2 = this.H3;
                    if (f14 > 0.0f) {
                        i15 = 0;
                    }
                    eVar2.setVisibility(i15);
                }
                if (aVar2.f50541e < 1.0f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                xg.f fVar2 = this.U;
                if (z4) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar2.setVisibility(i11);
                l7();
                if (aVar2.f50541e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                qj qjVar = this.f43340u0;
                if (z10) {
                    i13 = 0;
                }
                qjVar.setVisibility(i13);
                s7();
                v7();
                u7();
                q9(1);
            } else if (i10 == 5) {
                k7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f10);
                }
            } else if (i10 == 6) {
                p7();
            }
        }
    }

    public final void L6(boolean z4) {
        if (this.K6 == 0) {
            if (z4 && !this.L6.isEmpty()) {
                this.K6 = System.currentTimeMillis();
            } else {
                this.K6 = 1L;
            }
            D9();
            qj qjVar = this.f43340u0;
            if (qjVar != null) {
                qjVar.invalidate();
            }
        }
    }

    public final void L7() {
        int i10;
        int i11;
        if (this.O2 == null && getParentActivity() != null) {
            nk nkVar = new nk(this, getParentActivity(), 1);
            this.O2 = nkVar;
            nkVar.setClickable(false);
            this.O2.setWillNotDraw(false);
            this.f43407yc.h(4, false, false);
            this.O2.setClipToPadding(false);
            org.telegram.ui.Components.k6 k6Var = new org.telegram.ui.Components.k6(getParentActivity(), true, true, true);
            this.R2 = k6Var;
            org.telegram.ui.Components.pr prVar = org.telegram.ui.Components.pr.h;
            k6Var.b(0.25f, 280L, prVar);
            this.R2.setTextSize(AndroidUtilities.dp(15.0f));
            this.R2.setTypeface(AndroidUtilities.bold());
            this.R2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f22046ye));
            this.R2.setGravity(3);
            this.O2.addView(this.R2, k7.c6.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.R.addView(this.O2, k7.c6.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.k6 k6Var2 = new org.telegram.ui.Components.k6(getParentActivity(), true, false, true);
            this.S2 = k6Var2;
            k6Var2.b(0.0f, 420L, prVar);
            this.S2.setScaleProperty(0.7f);
            this.S2.setTextSize(AndroidUtilities.dp(15.0f));
            this.S2.setGravity(5);
            this.S2.setTypeface(AndroidUtilities.bold());
            this.S2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21859o6));
            org.telegram.ui.Components.k6 k6Var3 = this.S2;
            if (this.f43365vc.f50542f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            k6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.k6 k6Var4 = this.S2;
            k6Var4.f28285n = false;
            k6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.S2.setOnClickListener(new ue(this, 2));
            this.S2.setAlpha(0.5f);
            this.S2.setClickable(false);
            this.O2.addView(this.S2, k7.c6.e(-2, -1, 117));
            org.telegram.ui.Components.k6 k6Var5 = new org.telegram.ui.Components.k6(getParentActivity(), true, true, true);
            this.T2 = k6Var5;
            k6Var5.setGravity(17);
            this.T2.setTypeface(AndroidUtilities.bold());
            this.T2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ae));
            this.T2.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.k6 k6Var6 = this.T2;
            int i12 = org.telegram.ui.ActionBar.k6.f21661d6;
            k6Var6.setBackground(org.telegram.ui.ActionBar.k6.g0(getThemedColor(i12), org.telegram.ui.ActionBar.k6.v(getThemedColor(i12), getThemedColor(org.telegram.ui.ActionBar.k6.f21752i6))));
            org.telegram.ui.Components.k6 k6Var7 = this.T2;
            if (this.f43381x0.K) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            k6Var7.setText(LocaleController.getString(i11));
            this.T2.setOnClickListener(new ue(this, 3));
            this.T2.setVisibility(8);
            this.T2.setAlpha(0.0f);
            this.O2.addView(this.T2, k7.c6.e(-1, -1, 119));
            TLRPC.Chat chat = this.f43143e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.f43143e.megagroup) && this.O3 != 7 && !ChatObject.isMonoForum(this.f43143e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.Q2 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.Q2.setImageResource(R.drawable.msg_usersearch);
                this.Q2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f22027xe), PorterDuff.Mode.MULTIPLY));
                this.Q2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.f22057z8), 1, -1));
                this.O2.addView(this.Q2, k7.c6.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.Q2.setOnClickListener(new ue(this, 4));
                this.Q2.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.O3 != 7) {
                ImageView imageView2 = new ImageView(getParentActivity());
                this.P2 = imageView2;
                imageView2.setScaleType(ImageView.ScaleType.CENTER);
                this.P2.setImageResource(R.drawable.msg_calendar);
                this.P2.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f22027xe), PorterDuff.Mode.MULTIPLY));
                this.P2.setBackgroundDrawable(org.telegram.ui.ActionBar.k6.f0(getThemedColor(org.telegram.ui.ActionBar.k6.f22057z8), 1, -1));
                this.O2.addView(this.P2, k7.c6.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.P2.setOnClickListener(new ue(this, 5));
                this.P2.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int L8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f43340u0.getMeasuredHeight() - view.getBottom()) - this.f43340u0.getPaddingBottom()) + "} chatHeight=" + this.f43340u0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f43340u0.getPaddingBottom());
        return (this.f43340u0.getMeasuredHeight() - view.getBottom()) - this.f43340u0.getPaddingBottom();
    }

    public final void L9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.Q5, messageObject);
        }
    }

    public final void La() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.f43312r7 = 0;
        this.f43189h7 = false;
        this.f43201i7 = true;
        this.e6.clear();
    }

    public final void Lb(boolean z4) {
        int i10;
        if (this.H3 != null) {
            xd.a aVar = this.f43365vc;
            if (aVar.f50542f != z4) {
                aVar.a(z4, true);
                if (!z4 && this.O3 == 7) {
                    f2.j0 j0Var = (f2.j0) this.I3.getLayoutManager();
                    Object E = this.J3.E((j0Var.N0() + j0Var.L0()) / 2);
                    Object E2 = this.J3.E(j0Var.L0());
                    Object E3 = this.J3.E(j0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.f43381x0.L();
                        int L0 = this.f43367w0.L0();
                        int N0 = this.f43367w0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f20866id;
                        int i12 = ((MessageObject) E2).messageOwner.f20866id;
                        int i13 = ((MessageObject) E3).messageOwner.f20866id;
                        boolean z10 = false;
                        boolean z11 = false;
                        int i14 = -1;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f20866id == i12) {
                                int i16 = this.f43381x0.G + i15;
                                if (L0 <= i16 && N0 >= i16) {
                                    z10 = true;
                                } else {
                                    z10 = false;
                                }
                                if (z10) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f20866id == i13) {
                                int i17 = this.f43381x0.G + i15;
                                if (L0 <= i17 && N0 >= i17) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((MessageObject) L.get(i15)).messageOwner.f20866id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z10 && !z11 && i14 != -1) {
                            int A8 = A8((MessageObject) L.get(i14), true);
                            this.f43367w0.h1(this.f43381x0.G + i14, (this.f43340u0.getHeight() - A8) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.k6 k6Var = this.S2;
                if (k6Var != null) {
                    if (aVar.f50542f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    k6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                qh.e3 e3Var = this.f43341u1;
                if (e3Var != null && e3Var.S) {
                    e3Var.e(true);
                }
                vl vlVar = this.f43396y1;
                if (vlVar != null && vlVar.S) {
                    vlVar.e(true);
                }
                jk jkVar = this.V;
                if (jkVar != null) {
                    jkVar.l0();
                }
                Gc();
            }
        }
    }

    public final void Lc() {
        boolean z4;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        long a2 = a();
        long clientUserId = getUserConfig().getClientUserId();
        SparseArray[] sparseArrayArr = this.T5;
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
            al alVar = this.Ya;
            if (alVar != null) {
                alVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Ya.getSelectedReactions().isEmpty();
                z4 = !isEmpty;
                al alVar2 = this.Ya;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                alVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new le(this, 11), 120L);
            } else {
                z4 = !org.telegram.ui.Components.qk0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.w0 k10 = this.actionBar.j(null).k(28);
            if (k10 != null) {
                if (z4) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.kj0 kj0Var = k10.f22370x;
                if (kj0Var != null && k10.f22371y != i10) {
                    k10.f22371y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(kj0Var, i10);
                }
            }
        }
        if (this.V9 != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i15));
            }
            this.V9.setSelectedMessages(arrayList2);
        }
    }

    public final void M6(CharSequence charSequence) {
        boolean z4;
        TLRPC.WebPage webPage;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        MessageObject messageObject2 = this.f43247m5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z4 = true;
        } else {
            z4 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f43122c5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.D5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z4) {
                this.D5 = null;
                jk jkVar = this.V;
                if (jkVar != null) {
                    jkVar.T2 = null;
                    jkVar.U2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f43122c5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = jkVar.getFieldText();
                    MessageObject messageObject3 = this.f43223k5;
                    if (messageObject3 == this.U3) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f43199i5, this.f43247m5);
                }
                i8();
                j8();
            }
        }
    }

    public final void M7() {
        if (this.a2 == null && this.f43293q1 == null) {
            org.telegram.ui.Components.u00 u00Var = new org.telegram.ui.Components.u00(getParentActivity(), this.f43114ba);
            this.Z1 = u00Var;
            u00Var.setViewType(7);
            org.telegram.ui.Components.zw0 zw0Var = new org.telegram.ui.Components.zw0(getParentActivity(), this.Z1, 1, null);
            this.a2 = zw0Var;
            zw0Var.setClickable(true);
            this.a2.d.setText(LocaleController.getString(R.string.NoResult));
            this.a2.setVisibility(8);
            this.a2.addView(this.Z1, 0);
            this.a2.e(true, false);
            this.H3.addView(this.a2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.h40 h40Var = new org.telegram.ui.Components.h40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.f43293q1 = h40Var;
            h40Var.setOnHashtagClickListener(new xe(this, 2));
            this.f43293q1.setOnScrollListener(new l3(this, 5));
            this.f43293q1.setVisibility(8);
            this.H3.addView(this.f43293q1, -1, -1);
            r7();
            p7();
        }
    }

    public final pn M8() {
        if (this.f43242lc == null) {
            this.f43242lc = new pn(this);
        }
        return this.f43242lc;
    }

    public final boolean M9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.y5 y5Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.y5 animation;
        boolean z4;
        org.telegram.ui.Cells.t1 messageCell;
        boolean z10;
        if (this.f43340u0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.m40 m40Var = this.f43294q2;
            ArrayList<MessageObject> arrayList = null;
            if (m40Var != null && m40Var.getTag() != null && (messageCell = this.f43294q2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                y5Var = photoImage2.getAnimation();
                if (y5Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f43340u0.getMeasuredHeight()) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    this.f43348u8 = z10;
                } else {
                    messageObject = null;
                }
            } else {
                y5Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f43340u0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f43340u0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject2 = t1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = t1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f43340u0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f43340u0.getMeasuredHeight()) {
                                    z4 = false;
                                } else {
                                    z4 = true;
                                }
                                this.f43348u8 = z4;
                                if (imageY >= 0.0f && imageHeight <= this.f43340u0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    y5Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                y5Var = animation;
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
                messageObject.audioProgress = y5Var.n();
                messageObject.audioProgressMs = y5Var.o();
                y5Var.stop();
                if (PhotoViewer.K1(messageObject)) {
                    PhotoViewer.X8.P0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Ma() {
        this.f43364vb = null;
        this.f43338tb = 0;
        this.f43351ub = -1;
        this.f43378wb = null;
        this.f43392xb = null;
        this.f43170g1.d(false);
    }

    public final void Mb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z4, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43114ba);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            d2Var.Q = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new mh.a3(this, tL_game, messageObject, str, j10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(d2Var);
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
                    presentFragment(new ej1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        ej1.V(str, messageObject, parentActivity, str6, str3);
    }

    public final void Mc(boolean z4, boolean z10) {
        boolean z11;
        MessageObject playingMessageObject;
        if (this.fragmentView != null && !this.f43260n5) {
            int childCount = this.f43340u0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f43340u0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        MessageObject messageObject = t1Var.getMessageObject();
                        if (this.f43300q8 != null && ((messageObject.isRoundVideo() || messageObject.isVideo()) && !messageObject.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject))) {
                            ImageReceiver photoImage = t1Var.getPhotoImage();
                            this.f43300q8.setTranslationX(t1Var.getX() + photoImage.getImageX());
                            this.f43300q8.setTranslationY((this.f43340u0.getY() + (photoImage.getImageY() + (t1Var.getY() + t1Var.getPaddingTop()))) - this.f43300q8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.f43300q8.getLayoutParams();
                            if (messageObject.isRoundVideo()) {
                                this.f43300q8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(C9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(C9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(C9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.f43326s8.setResizeMode(0);
                                    this.f43300q8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(C9())) / AndroidUtilities.roundPlayingMessageSize(C9());
                                float imageWidth = t1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(C9());
                                if (this.f43300q8.getScaleX() != imageWidth) {
                                    this.f43300q8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.f43300q8.setPivotX(0.0f);
                                this.f43300q8.setPivotY(0.0f);
                                this.f43300q8.setScaleX(imageWidth);
                                this.f43300q8.setScaleY(imageWidth);
                                this.f43336t8.setScaleX(roundPlayingMessageSize2);
                                this.f43336t8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.f43300q8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.f43326s8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.f43300q8.setLayoutParams(layoutParams);
                                }
                                this.f43336t8.setScaleX(1.0f);
                                this.f43336t8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.f43300q8.invalidate();
                            z11 = true;
                        }
                    }
                    i10++;
                } else {
                    z11 = false;
                    break;
                }
            }
            if (z4 && this.f43300q8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z11) {
                    if (this.f43209j3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.f43300q8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(C9())) - 100);
                    this.fragmentView.invalidate();
                    if (playingMessageObject.isRoundVideo() || playingMessageObject.isVideo()) {
                        if (!this.f43209j3 && PipRoundVideoView.C == null) {
                            if (z10) {
                                j(playingMessageObject.getId(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.getInstance().setCurrentVideoVisible(false);
                        }
                    }
                } else {
                    MediaController.getInstance().setCurrentVideoVisible(true);
                    if (!playingMessageObject.isRoundVideo() && !this.f43348u8) {
                        this.f43340u0.invalidate();
                    }
                }
            }
        }
    }

    public final void N6() {
        MessageObject editingMessageObject;
        int abs;
        jk jkVar = this.V;
        if (jkVar != null && (editingMessageObject = jkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f43156f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.l5 l5Var = ((org.telegram.ui.Components.oo[]) this.X.f5475b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.f43143e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        l5Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new ng(this, 14), 1000L);
                    return;
                }
                org.telegram.ui.Components.oe oeVar = this.V.B1;
                if (oeVar != null) {
                    oeVar.setVisibility(8);
                }
                l5Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView N7(boolean z4) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.f43361v8);
        if (this.f43300q8 == null) {
            nk nkVar = new nk(this, getParentActivity(), 2);
            this.f43300q8 = nkVar;
            nkVar.setOutlineProvider(new ll(this));
            this.f43300q8.setClipToOutline(true);
            this.f43300q8.setWillNotDraw(false);
            o4 o4Var = new o4(getParentActivity());
            this.f43326s8 = o4Var;
            o4Var.setBackgroundColor(0);
            if (z4) {
                this.f43300q8.addView(this.f43326s8, k7.c6.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.f43336t8 = textureView;
            textureView.setOpaque(false);
            this.f43326s8.addView(this.f43336t8, k7.c6.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.f43300q8.getParent();
        if (viewGroup != null && viewGroup != this.U0) {
            viewGroup.removeView(this.f43300q8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.U0.addView(this.f43300q8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(C9()), AndroidUtilities.roundPlayingMessageSize(C9())));
        }
        this.f43300q8.setTag(null);
        this.f43326s8.setDrawingReady(false);
        return this.f43336t8;
    }

    public final long N8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.f43143e) || !ChatObject.canManageMonoForum(this.currentAccount, this.f43143e)) {
            return 0L;
        }
        long j10 = this.f43094a4;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.f43247m5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f43223k5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j10;
    }

    public final void N9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.p2 p2Var;
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var == null) {
            return;
        }
        long j10 = messageObject.messageOwner.action.channel_id;
        if (f5Var.getFragmentStack().size() > 0) {
            p2Var = (org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            p2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.f5 f5Var2 = this.parentLayout;
        if (indexOf > 0 && !(p2Var instanceof xn) && !(p2Var instanceof ProfileActivity) && this.f43143e.creator) {
            int size = f5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) f5Var2.getFragmentStack().get(indexOf);
                if (p2Var2 instanceof xn) {
                    ((ActionBarLayout) f5Var2).c(indexOf, new xn(l.d.g(j10, "chat_id")));
                    p2Var2.removeSelfFromStack();
                } else if (p2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) f5Var2).c(indexOf, new ProfileActivity(l.d.g(j10, "chat_id"), null));
                    p2Var2.removeSelfFromStack();
                } else if (p2Var2 instanceof po) {
                    ((ActionBarLayout) f5Var2).c(indexOf, new po(l.d.g(j10, "chat_id")));
                    p2Var2.removeSelfFromStack();
                } else if (p2Var2 instanceof qr) {
                    if (((qr) p2Var2).f40572b1 == 0) {
                        Bundle arguments = p2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) f5Var2).c(indexOf, new qr(arguments));
                    }
                    p2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(this, p2Var, messageObject, f5Var2, 26));
        }
        AndroidUtilities.runOnUIThread(new hg.y0(this, j10, 3), 1000L);
    }

    public final void Na(org.telegram.ui.Cells.t1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Na(org.telegram.ui.Cells.t1):void");
    }

    public final void Nb(boolean z4) {
        if (z4) {
            if (this.zb == null) {
                le leVar = new le(this, 10);
                this.zb = leVar;
                AndroidUtilities.runOnUIThread(leVar, 100L);
                return;
            }
            return;
        }
        le leVar2 = this.zb;
        if (leVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar2);
        }
        this.zb = null;
        this.f43406yb = false;
        xc(true);
    }

    public final void Nc(boolean z4) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        lj ljVar = this.X0;
        if (ljVar == null) {
            return;
        }
        int i10 = this.O3;
        if (i10 == 8 && (chat2 = this.f43143e) != null) {
            if (this.Q3) {
                String i11 = bg.e.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.f43143e;
                ljVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z4);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f43094a4 > 0L ? 1 : (this.f43094a4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.f43143e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.f43143e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.f43143e;
                        }
                        this.X0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z4);
                    } else {
                        lj ljVar2 = this.X0;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.f43143e;
                        ljVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z4);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f43094a4));
                    this.X0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z4);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f43094a4));
                    if (chat7 == null) {
                        chat7 = this.f43143e;
                    }
                    this.X0.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z4);
                }
            } else {
                lj ljVar3 = this.X0;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.f43143e.title));
                TLRPC.Chat chat8 = this.f43143e;
                ljVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z4);
            }
        } else if (i10 == 9) {
            ljVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.N3)) {
                this.X0.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.N3)) {
                this.X0.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.X0.setTitle(this.N3);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.M3.title)) {
                this.X0.setTitle(this.M3.title);
            } else {
                this.X0.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j10 = this.f43094a4;
                if (j10 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.X0.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.X0.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.X0.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.X0.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.X0.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.X0.setTitle("");
                }
            } else if (F9() && !UserObject.isBotForum(this.f43156f)) {
                if (this.f43148e4) {
                    Sc();
                } else if (this.f43134d4) {
                    if (this.U3.hasReplies()) {
                        this.X0.setTitle(LocaleController.formatPluralString("Comments", this.U3.getRepliesCount(), new Object[0]));
                    } else {
                        this.X0.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.X0.setTitle(LocaleController.formatPluralString("Replies", this.U3.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f43156f)) {
                this.X0.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f43156f)) {
                this.X0.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.O3;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f43156f)) {
                        this.X0.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.X0.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.X0.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", G8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.f43143e;
                    if (chat9 != null) {
                        lj ljVar4 = this.X0;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.f43143e;
                        ljVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z4);
                    } else {
                        TLRPC.User user3 = this.f43156f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.X0.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f43156f.f20992id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f43156f.phone)) {
                                    lj ljVar5 = this.X0;
                                    String j11 = org.telegram.messenger.y3.j(new StringBuilder("+"), this.f43156f.phone, se.b.c());
                                    TLRPC.User user4 = this.f43156f;
                                    ljVar5.h(j11, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f43156f), this.f43156f.emoji_status, z4);
                                } else {
                                    lj ljVar6 = this.X0;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f43156f)));
                                    TLRPC.User user5 = this.f43156f;
                                    ljVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f43156f), this.f43156f.emoji_status, z4);
                                }
                            } else {
                                lj ljVar7 = this.X0;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f43156f)));
                                TLRPC.User user6 = this.f43156f;
                                boolean z10 = user6.scam;
                                boolean z11 = user6.fake;
                                boolean z12 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f43156f);
                                if (!MessagesController.isSupportUser(this.f43156f)) {
                                    emojiStatus = this.f43156f.emoji_status;
                                }
                                ljVar7.h(removeRTL5, z10, z11, z12, isPremiumUser, emojiStatus, z4);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.X0.getTitleTextView().getText());
        Pc(false);
    }

    public final void O6(boolean z4) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.T7;
        if (call != null && (((str = this.f43138d8) != null || this.f43151e8) && this.K5)) {
            org.telegram.ui.Components.voip.g2.l(this.f43143e, str, this.V7, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f43138d8 = null;
            this.f43151e8 = false;
            return;
        }
        if (this.f43138d8 != null && z4 && (chatFull = this.W7) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            l.d.v(R.string.LinkHashExpired, org.telegram.ui.Components.qc.a0(this), R.raw.linkbroken, 36);
            this.f43138d8 = null;
        }
        this.U7 = !this.K5;
    }

    public final void O7() {
        if (this.U0 != null && this.H1 == null && getParentActivity() != null) {
            this.H1 = new org.telegram.ui.ActionBar.r0(this, getParentActivity(), 1);
            o9();
            this.H1.setClickable(true);
            this.J0.addView(this.H1, k7.c6.n(-1, 44));
            this.J0.h(2, this.H1);
            this.J0.g(this.H1);
            TextView textView = new TextView(getParentActivity());
            this.K1 = textView;
            int i10 = org.telegram.ui.ActionBar.k6.f21897q7;
            textView.setTextColor(getThemedColor(i10));
            TextView textView2 = this.K1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            textView2.setBackground(org.telegram.ui.ActionBar.k6.W(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2));
            this.K1.setTag(Integer.valueOf(i10));
            this.K1.setTextSize(1, 14.0f);
            this.K1.setTypeface(AndroidUtilities.bold());
            this.K1.setSingleLine(true);
            this.K1.setMaxLines(1);
            this.K1.setGravity(17);
            this.H1.addView(this.K1, k7.c6.e(-1, -1, 51));
            this.K1.setOnClickListener(new ue(this, 13));
            org.telegram.ui.Components.g90 g90Var = new org.telegram.ui.Components.g90(getParentActivity(), this.f43114ba);
            this.Q1 = g90Var;
            g90Var.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21724ge));
            this.Q1.setTextSize(1, 13.3f);
            this.Q1.setDisablePaddingsOffset(true);
            this.Q1.setLinkTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.il));
            this.Q1.setGravity(17);
            this.Q1.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.J0.addView(this.Q1, k7.c6.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.J0.h(8, this.Q1);
            this.J0.g(this.Q1);
            TextView textView3 = new TextView(getParentActivity());
            this.I1 = textView3;
            int i11 = org.telegram.ui.ActionBar.k6.f21741he;
            textView3.setTextColor(getThemedColor(i11));
            this.I1.setVisibility(8);
            this.I1.setTextSize(1, 14.0f);
            this.I1.setTypeface(AndroidUtilities.bold());
            this.I1.setSingleLine(true);
            this.I1.setMaxLines(1);
            this.I1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.I1.setGravity(17);
            TextView textView4 = this.I1;
            float dp3 = AndroidUtilities.dp(18.0f);
            int dp4 = AndroidUtilities.dp(4.0f);
            textView4.setBackground(org.telegram.ui.ActionBar.k6.W(dp3, getThemedColor(i11) & 436207615, dp4, dp4, dp4, dp4));
            this.H1.addView(this.I1, k7.c6.e(-1, -1, 51));
            this.I1.setOnClickListener(new ue(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.L1 = textView5;
            textView5.setTextColor(getThemedColor(i11));
            this.L1.setVisibility(8);
            this.L1.setTextSize(1, 14.0f);
            this.L1.setTypeface(AndroidUtilities.bold());
            this.L1.setSingleLine(true);
            this.L1.setMaxLines(1);
            this.L1.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.L1.setGravity(17);
            this.L1.setText(LocaleController.getString(R.string.RestartTopic));
            this.L1.setBackground(org.telegram.ui.ActionBar.k6.f0(getThemedColor(i11) & 436207615, 3, -1));
            this.J0.addView(this.L1, k7.c6.n(-1, 48));
            this.J0.h(4, this.L1);
            this.J0.g(this.L1);
            this.L1.setOnClickListener(new ue(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.R1 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.R1.setContentDescription(LocaleController.getString(R.string.Close));
            this.R1.setBackground(org.telegram.ui.ActionBar.k6.M(getThemedColor(org.telegram.ui.ActionBar.k6.f21752i6), 0, 0));
            this.R1.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.f21669de), PorterDuff.Mode.MULTIPLY));
            this.R1.setScaleType(ImageView.ScaleType.CENTER);
            this.H1.addView(this.R1, k7.c6.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.R1.setOnClickListener(new ue(this, 16));
        }
    }

    public final int O8() {
        return this.U0.getBackgroundSizeY();
    }

    public final void O9(boolean z4) {
        int i10;
        if (this.f43340u0 != null) {
            ArrayList arrayList = this.f43311r6;
            if (!arrayList.isEmpty() && !this.f43337ta.f35874n) {
                if (z4) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f43367w0.h1(i10, 0);
                this.f43340u0.B0();
            }
        }
    }

    public final void Oa() {
        org.telegram.ui.Components.fc0 i10;
        vn vnVar = this.f43114ba;
        if (vnVar != null) {
            Drawable d = vnVar.d();
            if (this.fragmentView != null) {
                d = this.U0.getBackgroundImage();
            }
            if (d instanceof ao) {
                d = ((ao) d).c(true);
            }
            if (d instanceof org.telegram.ui.Components.fc0) {
                ((org.telegram.ui.Components.fc0) d).x(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.h5) && (i10 = ((org.telegram.ui.ActionBar.h5) themedDrawable).i()) != null) {
                i10.x(false);
            }
        }
    }

    public final void Ob(boolean z4) {
        float f10;
        int i10;
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupNotifyPeriod * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && !MessagesController.getInstance(this.currentAccount).premiumFeaturesBlocked()) {
                if (z4) {
                    f10 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupUpload;
                } else {
                    f10 = MessagesController.getInstance(this.currentAccount).uploadPremiumSpeedupDownload;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(this);
                    int i12 = R.raw.speed_limit;
                    if (z4) {
                        i10 = R.string.UploadSpeedLimited;
                    } else {
                        i10 = R.string.DownloadSpeedLimited;
                    }
                    String string = LocaleController.getString(i10);
                    if (z4) {
                        i11 = R.string.UploadSpeedLimitedMessage;
                    } else {
                        i11 = R.string.DownloadSpeedLimitedMessage;
                    }
                    org.telegram.ui.Components.ic M = a02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new ff(this, z4, 0)), spannableString), i12);
                    M.f27778j = 8000;
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
        if (this.f43354v1 == null && ChatObject.isMegagroup(this.f43143e) && (chatFull = getMessagesController().getChatFull(this.f43143e.f20845id)) != null && this.V != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            ok okVar = this.L0;
            if (okVar == null || okVar.getVisibility() != 0) {
                org.telegram.ui.Components.n40 n40Var = org.telegram.ui.Components.n40.f29377n;
                if (n40Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f20851id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        n40Var.b();
                        qh.e3 e3Var = new qh.e3(getParentActivity(), 3);
                        this.f43354v1 = e3Var;
                        e3Var.i();
                        this.f43354v1.p(true);
                        qh.e3 e3Var2 = this.f43354v1;
                        e3Var2.H = Layout.Alignment.ALIGN_CENTER;
                        e3Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(j10, this.f43354v1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.e51(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.f43354v1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        qh.e3 e3Var3 = this.f43354v1;
                        e3Var3.h = qh.e3.a(e3Var3.getText(), this.f43354v1.getTextPaint());
                        qh.e3 e3Var4 = this.f43354v1;
                        e3Var4.d = -1L;
                        e3Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new ng(this, 27), 300L);
                    }
                }
            }
        }
    }

    public final void P7() {
        int i10;
        if (this.O1 == null && getParentActivity() != null) {
            if (this.f43342u2 == null) {
                K7();
            }
            org.telegram.ui.Components.w21 w21Var = new org.telegram.ui.Components.w21(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.O1 = w21Var;
            w21Var.L = new le(this, 5);
            rg.d o10 = sg.b.o(this.f43114ba);
            og.a aVar = this.G;
            w21Var.setSideMenuBackgroundDrawable(aVar.c(w21Var, o10, false));
            org.telegram.ui.Components.w21 w21Var2 = this.O1;
            w21Var2.setTopMenuBackgroundDrawable(aVar.c(w21Var2, sg.b.o(this.f43114ba), false));
            this.O1.setCurrentTopic(b());
            this.O1.setOnNewTopicSelected(new le(this, 6));
            this.O1.setOnTopicSelected(new we(this, 0));
            this.O1.setOnDialogSelected(new we(this, 1));
            int indexOfChild = this.U0.indexOfChild(this.U);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.U0.addView(this.O1, i10, k7.c6.f(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.O1.n();
            bk bkVar = this.F1;
            if (bkVar != null) {
                bkVar.bringToFront();
            }
        }
    }

    public final float P8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.U0.getBackgroundTranslationY()) - ((1.0f - this.f43349u9) * this.f43288p9);
    }

    public final boolean P9() {
        jk jkVar = this.V;
        boolean z4 = jkVar.f24691v2;
        if (z4) {
            jkVar.s1();
            this.A3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z4;
    }

    public final void Pa() {
        MessageObject messageObject;
        CharSequence charSequence;
        boolean z4;
        boolean z10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        ok okVar;
        jk jkVar = this.V;
        if (jkVar != null && jkVar.f24713z1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.V4 && jkVar != null && (okVar = this.L0) != null && okVar.getVisibility() != 0) {
            messageObject = this.f43223k5;
            charSequence = AndroidUtilities.getTrimmedString(this.V.getDraftMessage());
            z4 = this.V.U2;
        } else {
            messageObject = null;
            charSequence = null;
            z4 = true;
        }
        if (this.f43211j5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        MediaDataController mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) < 101) {
            z10 = false;
        } else {
            z10 = true;
        }
        ArrayList<TLRPC.MessageEntity> entities = mediaDataController.getEntities(charSequenceArr, z10, false);
        long B7 = B7(messageObject);
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.Q5, B7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j11 = this.Q5;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f43211j5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        nn nnVar = this.f43199i5;
        MessageSuggestionParams messageSuggestionParams = this.f43135d5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        jk jkVar2 = this.V;
        if (jkVar2 != null) {
            j10 = jkVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.saveDraft(j11, B7, charSequence2, entities, message, nnVar, suggestedPost2, j10, !z4, false, richMessage);
    }

    public final void Pb(boolean z4) {
        if (this.M != null) {
            if (!AndroidUtilities.isTablet() && !this.f43134d4 && this.f43156f == null) {
                if (this.f43167fb == null) {
                    this.f43167fb = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.f43167fb.booleanValue()) {
                    this.f43154eb = z4;
                    return;
                }
            }
            int i10 = 0;
            if (this.L5 && SharedConfig.animationsEnabled()) {
                if (z4 == this.f43154eb) {
                    return;
                }
                this.f43154eb = z4;
                if (z4) {
                    if (this.M.getVisibility() != 0) {
                        this.M.setVisibility(0);
                        this.M.setAlpha(0.0f);
                        this.M.setScaleX(0.3f);
                        this.M.setScaleY(0.3f);
                    }
                    this.M.animate().setListener(null).cancel();
                    this.M.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.M.animate().setListener(null).cancel();
                this.M.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new ti(this, 3)).start();
                return;
            }
            this.f43154eb = z4;
            FrameLayout frameLayout = this.M;
            if (!z4) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void Pc(boolean z4) {
        Drawable mutate;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (this.X0 != null) {
            int i10 = this.O3;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.Q5, b());
                if (z4) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.f43143e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f43156f)) {
                    if (!UserObject.isReplyUser(this.f43156f) && ((!F9() || this.f43148e4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.k6.H6), PorterDuff.Mode.SRC_IN));
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f43143e;
                    if (chat != null) {
                        drawable = this.X0.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f43156f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.X0.c(DialogObject.getBotVerificationIcon(this.f43156f));
                        }
                    }
                }
                this.X0.j(drawable, mutate);
                if (!z4 && (u0Var = this.f43105b1) != null) {
                    if (isDialogMuted) {
                        if (u0Var.f22307l != 8) {
                            u0Var.f22307l = 8;
                            View view = u0Var.f22304i;
                            if (view instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view).getRightIcon().setVisibility(u0Var.f22307l);
                            }
                        }
                        this.f43105b1.d(LocaleController.getString(R.string.Unmute));
                        this.f43105b1.b(R.drawable.msg_mute);
                    } else {
                        if (u0Var.f22307l != 0) {
                            u0Var.f22307l = 0;
                            View view2 = u0Var.f22304i;
                            if (view2 instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view2).getRightIcon().setVisibility(u0Var.f22307l);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.Q5, b())) {
                            this.f43105b1.d(LocaleController.getString(R.string.Mute));
                            this.f43105b1.b(R.drawable.msg_unmute);
                        } else {
                            this.f43105b1.d(LocaleController.getString(R.string.Mute));
                            this.f43105b1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.no noVar = this.f43158f1;
                if (noVar != null) {
                    noVar.d(this.Q5, b(), null);
                }
            }
        }
    }

    public final void Q6() {
        ArrayList arrayList;
        int i10;
        if (this.Ma) {
            int i11 = -1;
            long j10 = 0;
            int i12 = 0;
            while (true) {
                arrayList = this.f43311r6;
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
                        Collections.sort(arrayList2, new oh.k0(14));
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
        if (this.f43356v3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f43114ba);
            this.f43356v3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.U0.addView(this.f43356v3, k7.c6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final float Q8() {
        org.telegram.ui.Components.w21 w21Var = this.O1;
        if (w21Var != null) {
            return w21Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void Qa() {
        org.telegram.ui.Cells.t1 t1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f43340u0.getChildCount(); i11++) {
            View childAt = this.f43340u0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.t1) {
                org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                int min = Math.min(t1Var2.getBottom(), this.f43340u0.getHeight()) - Math.max(0, t1Var2.getTop());
                if (min > i10) {
                    t1Var = t1Var2;
                    i10 = min;
                }
            }
        }
        if (t1Var != null) {
            tj tjVar = this.f43367w0;
            this.f43340u0.getClass();
            tjVar.i1(RecyclerView.R(t1Var), t1Var.getTop() - ((int) this.f43288p9), false);
        }
    }

    public final void Qb() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new te(this, 8));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f21168a);
    }

    public final void Qc(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Qc(boolean):void");
    }

    public final void R6(boolean z4) {
        uf.y0 y0Var;
        if (this.L3 == 2 && (y0Var = this.J3) != null) {
            String str = this.f43308r3;
            qh.u9 u9Var = y0Var.B;
            if (!TextUtils.equals(y0Var.f48785x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(u9Var);
                oh.f6 f6Var = y0Var.f48786y;
                if (f6Var != null && f6Var.I != 0) {
                    ConnectionsManager.getInstance(f6Var.f17400c).cancelRequest(f6Var.I, true);
                    f6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    y0Var.f48785x = str;
                    y0Var.f48786y = new oh.f6(y0Var.f48782r, str2, trim);
                    if (z4) {
                        u9Var.run();
                    } else {
                        AndroidUtilities.runOnUIThread(u9Var, 1000L);
                    }
                }
                oh.f6 f6Var2 = y0Var.f48786y;
                if (f6Var2 != null && f6Var2.J > 0) {
                    y0Var.l();
                }
            }
        }
    }

    public final ArrayList R7(MessageObject messageObject, boolean z4) {
        ArrayList m9 = org.telegram.messenger.y3.m(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.f43311r6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.I6 || messageObject.getDialogId() == this.I6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z4 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    m9.add(messageObject2);
                }
            }
        }
        return m9;
    }

    public final int R8() {
        return (int) (Q8() * AndroidUtilities.dp(71.0f));
    }

    public final void Ra(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Ra(org.telegram.messenger.MessageObject):void");
    }

    public final void Rb() {
        String str;
        if (this.Db != null) {
            return;
        }
        if (this.f43223k5 != null) {
            str = getMessagesController().getFullName(this.f43223k5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new te(this, 15));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new te(this, 16));
        d2Var.setOnDismissListener(new dg(this, 7));
        this.Db = alertDialog$Builder.o();
    }

    public final void Rc() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.u0 u0Var = this.f43292q0;
        if (u0Var != null) {
            TLRPC.Chat chat = this.f43143e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.Z3) && (tL_forumTopic = this.Z3) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u0Var.e(i10);
        }
    }

    public final void S6() {
        this.P.d();
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
        r7();
        p9();
        boolean z4 = true;
        if (this.v.f4764s == 1) {
            z4 = false;
        }
        if (this.Ta != z4) {
            this.Ta = z4;
            checkSystemBarColors();
        }
    }

    public final void S7(final int i10, final int i11, final boolean z4) {
        this.f43381x0.J.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f43311r6;
            if (i12 >= arrayList.size()) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList.get(i12);
            int i13 = messageObject.messageOwner.date;
            if (i13 <= i10 || i13 >= i11) {
                this.f43381x0.J.add(messageObject);
            }
            i12++;
        }
        qj qjVar = this.f43340u0;
        if (qjVar != null) {
            qjVar.setEmptyView(null);
        }
        if (this.f43381x0.J.isEmpty()) {
            Pb(true);
        }
        jm jmVar = this.f43381x0;
        jmVar.I = true;
        jmVar.O(true);
        Q7();
        UndoView undoView = this.f43356v3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.Q5, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                xn xnVar = xn.this;
                MessagesController messagesController = xnVar.getMessagesController();
                long j11 = xnVar.Q5;
                if (ChatObject.isChannel(xnVar.f43143e)) {
                    j10 = xnVar.Q5;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i10, i11, z4, new ng(xnVar, 18));
            }
        }, new lf(this, 29));
    }

    public final int S8(int i10) {
        SparseIntArray sparseIntArray = this.S4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Gc;
            Gc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void S9() {
        J6(this.M0, 5, true);
        J6(this.V, 1, false);
        J6(this.O2, 4, true);
        J6(this.L0, 3, false);
        J6(this.O, 2, false);
        float f10 = this.f43339tc.f50541e;
        h5.u uVar = this.f43407yc;
        float c3 = yh.c(1.0f, f10, 1.0f - ((float[]) uVar.f7300b)[5], 1.0f);
        xg.c cVar = this.M0;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(c3);
        }
        jk jkVar = this.V;
        if (jkVar != null) {
            jkVar.setTranslationY(AndroidUtilities.dp(54.0f) * c3);
        }
        nk nkVar = this.O2;
        if (nkVar != null) {
            nkVar.setTranslationY(AndroidUtilities.dp(54.0f) * c3);
        }
        ok okVar = this.L0;
        if (okVar != null) {
            okVar.setTranslationY(AndroidUtilities.dp(54.0f) * c3);
        }
        nk nkVar2 = this.O;
        if (nkVar2 != null) {
            nkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * c3);
        }
        vg.f fVar = this.P;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - c3) * 255.0f));
            this.P.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * c3);
        }
        ok okVar2 = this.L0;
        xd.a aVar = this.f43317rc;
        if (okVar2 != null) {
            okVar2.setTotalVisibilityFactor((1.0f - aVar.f50541e) * ((float[]) uVar.f7300b)[3]);
        }
        up upVar = this.M9;
        if (upVar != null) {
            float f11 = aVar.f50541e;
            if (upVar.P != f11) {
                upVar.P = f11;
                this.fragmentView.invalidate();
            }
        }
        q7();
    }

    public final void Sa(long j10) {
        tj tjVar;
        MessageObject messageObject;
        int L8;
        int abs;
        qj qjVar = this.f43340u0;
        int i10 = -1;
        if (qjVar != null && (tjVar = this.f43367w0) != null && tjVar.f5825y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = qjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f43340u0.getChildAt(childCount);
                this.f43340u0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.t1) && (messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((L8 = L8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = L8;
                    i12 = abs;
                }
            }
            this.f43225k7 = i10;
            this.f43237l7 = i11;
            return;
        }
        this.f43225k7 = -1;
    }

    public final void Sb(View view, CharSequence charSequence, boolean z4) {
        org.telegram.ui.Components.m40 m40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z4 || ((m40Var = this.f43208j2) != null && m40Var.getVisibility() == 0)) {
                this.f43208j2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z4) {
                    this.f43208j2.f(view, true);
                }
            }
        }
    }

    public final void Sc() {
        TLRPC.TL_forumTopic tL_forumTopic;
        lj ljVar = this.X0;
        if (ljVar != null && (tL_forumTopic = this.Z3) != null) {
            ljVar.setTitle(tL_forumTopic.title);
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
                ImageView imageView = this.Q2;
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
            ImageView imageView2 = this.Q2;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            Za(chat, null);
        }
    }

    public final void T7(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
        boolean z4;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        org.telegram.ui.Cells.t1 t1Var2;
        CharacterStyle characterStyle2;
        MessageObject messageObject2;
        int i10;
        String str2;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.q70 I = org.telegram.ui.Components.q70.I(this, t1Var);
        org.telegram.ui.Components.im0 im0Var = new org.telegram.ui.Components.im0(getParentActivity(), this.f43114ba);
        I.f30328p = new pe(im0Var, 0);
        if (!str.startsWith("video?") && !af.g.f(Uri.parse(str), false, null)) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean isWebBrowserOpenInApp = getMessagesController().isWebBrowserOpenInApp(str);
        if (isWebBrowserOpenInApp && z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!str.startsWith("#") && !str.startsWith("$")) {
            z11 = false;
        } else {
            z11 = true;
        }
        boolean startsWith = str.startsWith("mailto:");
        if (!startsWith) {
            if (z10 && !z11) {
                i11 = R.drawable.menu_website;
            } else {
                i11 = R.drawable.msg_openin;
            }
            if (z10 && !z11) {
                i12 = R.string.OpenInTelegramBrowser2;
            } else {
                i12 = R.string.Open;
            }
            String string = LocaleController.getString(i12);
            int i13 = i11;
            z14 = z4;
            kh.k kVar = new kh.k(this, str, characterStyle, messageObject, t1Var, z10, z11);
            z13 = z11;
            characterStyle2 = characterStyle;
            z12 = z10;
            t1Var2 = t1Var;
            I.c(i13, string, kVar, false);
        } else {
            z12 = z10;
            z13 = z11;
            z14 = z4;
            t1Var2 = t1Var;
            characterStyle2 = characterStyle;
        }
        if ((z12 && !z13) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new qe(this, str, 0), false);
        } else if (!startsWith && !z13 && !z12 && z14 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new qe(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new re(this, messageObject2, 0), false);
        } else {
            messageObject2 = messageObject;
        }
        int i14 = R.drawable.msg_copy;
        if (z13) {
            i10 = R.string.CopyHashtag;
        } else if (startsWith) {
            i10 = R.string.CopyMail;
        } else {
            i10 = R.string.CopyLink;
        }
        I.c(i14, LocaleController.getString(i10), new dg.t0(this, str, messageObject2, startsWith, 6), false);
        if (isWebBrowserOpenInApp && !z13 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new qe(this, str, 2), false);
        }
        im0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            im0Var.f(t1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.n51) {
            String url = ((org.telegram.ui.Components.n51) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = af.g.v(parse, null, null, af.g.a(parse.getHost()), null);
                } catch (Exception e6) {
                    FileLog.e((Throwable) e6, false);
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
            im0Var.f(t1Var2, characterStyle2, spannableString2, false);
        } else {
            im0Var.f(t1Var2, characterStyle2, null, false);
        }
        showDialog(im0Var);
    }

    public final int T8(int i10) {
        SparseIntArray sparseIntArray = this.R4;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = Gc;
            Gc = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void T9(boolean z4, boolean z10) {
        if (this.A3) {
            AndroidUtilities.runOnUIThread(new le(this, 20), 200L);
            if (z10) {
                this.A3 = false;
            }
        }
        if (z4 && !this.La) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final void Ta() {
        int i10;
        int i11;
        qj qjVar = this.f43340u0;
        if (qjVar != null && this.f43367w0 != null) {
            for (int childCount = qjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f43340u0.getChildAt(childCount);
                this.f43340u0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        if (((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup() == null) {
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
            this.f43367w0.h1(i11, i10);
        }
    }

    public final void Tb(MessageSuggestionParams messageSuggestionParams) {
        if (this.f43247m5 == null) {
            return;
        }
        new mh.r0(getParentActivity(), this.currentAccount, this.Q5, messageSuggestionParams, this, getResourceProvider(), 0, new xe(this, 0)).show();
    }

    public final void Tc() {
        lj ljVar;
        lj ljVar2;
        if (UserObject.isBotForum(this.f43156f) && (ljVar2 = this.X0) != null) {
            ljVar2.getAvatarImageView().setVisibility(0);
            this.X0.b();
        } else if (this.Z3 != null && (ljVar = this.X0) != null) {
            ljVar.getAvatarImageView().setVisibility(0);
            bg.e.p(this.X0.getAvatarImageView(), this.Z3, true, true, this.f43114ba);
        }
    }

    public final void U6() {
        MessageObject messageObject;
        if (!this.A4 && (messageObject = this.G7) != null) {
            if (this.f43311r6.indexOf(messageObject) >= 0) {
                this.B4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.z4 != null) {
        } else {
            lf lfVar = new lf(this, 22);
            this.z4 = lfVar;
            AndroidUtilities.runOnUIThread(lfVar);
        }
    }

    public final void U7(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.t1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.U7(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.t1):void");
    }

    public final long U8() {
        return this.f43094a4;
    }

    public final void U9() {
        this.A4 = true;
        qm qmVar = this.Z8;
        AndroidUtilities.cancelRunOnUIThread(qmVar.f24514g0);
        qmVar.f24543z = false;
        le leVar = new le(this, 8);
        int i10 = this.A7;
        if (i10 != 0) {
            Xa(i10, 0, false, this.f43414z7, true, 0, null, null, leVar);
            return;
        }
        int i11 = this.f43402y7;
        if (i11 > 0) {
            Xa(i11, 0, true, this.f43414z7, true, 0, null, null, leVar);
            return;
        }
        Wa(!this.Za, leVar);
        this.Za = false;
        if (!this.E4.isEmpty()) {
            this.L4 = true;
            this.K4 = ((Integer) this.E4.get(0)).intValue();
        }
    }

    public final int Ua(MessageObject messageObject) {
        ArrayList<MessageObject.TextLayoutBlock> arrayList;
        CharSequence charSequence;
        int i10;
        org.telegram.ui.Cells.t1 t1Var;
        MessageObject.TextLayoutBlocks textLayoutBlocks;
        int findQuoteStart;
        StaticLayout staticLayout;
        float lineTop;
        float f10;
        MessageObject.TextLayoutBlocks textLayoutBlocks2;
        MessageObject messageObject2;
        if (!TextUtils.isEmpty(this.M7) && messageObject != null) {
            if (messageObject.getGroupId() != 0) {
                MessageObject.GroupedMessages y82 = y8(messageObject.getGroupId());
                org.telegram.ui.Cells.t1 t1Var2 = this.f43203i9;
                if (t1Var2 != null && (textLayoutBlocks2 = t1Var2.f24067ue) != null && y82 != null && (messageObject2 = y82.captionMessage) != null) {
                    i10 = t1Var2.te;
                    charSequence = messageObject2.caption;
                    arrayList = textLayoutBlocks2.textLayoutBlocks;
                } else {
                    if (t1Var2 != null) {
                        t1Var2.te = 0;
                        t1Var2.f24067ue = null;
                    }
                    return 0;
                }
            } else if (!TextUtils.isEmpty(messageObject.caption) && (t1Var = this.f43203i9) != null && (textLayoutBlocks = t1Var.Z3) != null) {
                i10 = (int) t1Var.f23960n4;
                charSequence = messageObject.caption;
                arrayList = textLayoutBlocks.textLayoutBlocks;
            } else {
                CharSequence charSequence2 = messageObject.messageText;
                arrayList = messageObject.textLayoutBlocks;
                org.telegram.ui.Cells.t1 t1Var3 = this.f43203i9;
                if (t1Var3 != null && t1Var3.f24000q1) {
                    i10 = t1Var3.f23901j2 + AndroidUtilities.dp(10.0f);
                    charSequence = charSequence2;
                } else {
                    charSequence = charSequence2;
                    i10 = 0;
                }
            }
            org.telegram.ui.Cells.t1 t1Var4 = this.f43203i9;
            if (t1Var4 != null) {
                t1Var4.te = 0;
                t1Var4.f24067ue = null;
            }
            if (arrayList == null || charSequence == null || (findQuoteStart = MessageObject.findQuoteStart(charSequence.toString(), this.M7, this.P7)) < 0) {
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
        org.telegram.ui.Cells.t1 t1Var5 = this.f43203i9;
        if (t1Var5 != null) {
            t1Var5.te = 0;
            t1Var5.f24067ue = null;
        }
        return 0;
    }

    public final void Ub(MessageObject messageObject) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().isPeerNoForwards(messageObject.getDialogId())) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null || !message.noforwards) {
                ArrayList<MessageObject.TextLayoutBlock> arrayList = messageObject.textLayoutBlocks;
                boolean z4 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = messageObject.messageText;
                    if (messageObject.textLayoutBlocks.size() > 1) {
                        z4 = true;
                    }
                } else {
                    charSequence = messageObject.caption;
                }
                if (!z4 && charSequence != null) {
                    z4 = true;
                }
                if (z4 && SharedConfig.textSelectionHintShows <= 2 && !this.f43166f9 && this.f43178g9 <= this.V.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f43166f9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f43152e9 == null) {
                        ol olVar = new ol(getParentActivity(), this.f43114ba, this);
                        this.f43152e9 = olVar;
                        this.U0.addView(olVar, k7.c6.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f43152e9.c();
                }
            }
        }
    }

    public final void Uc() {
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var = this.f43194i0;
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

    public final void V6(boolean z4) {
        if (this.f43223k5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.f43311r6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f43223k5.getId() && messageObject.getDialogId() == this.f43223k5.getDialogId()) {
                        this.f43223k5 = messageObject;
                        nn nnVar = this.f43199i5;
                        if (nnVar != null) {
                            nnVar.a(messageObject);
                        }
                        if (z4) {
                            MessagePreviewParams messagePreviewParams = this.f43122c5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f43223k5;
                                MessageObject.GroupedMessages groupedMessages = this.f43174g5;
                                if (groupedMessages == null) {
                                    groupedMessages = y8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.Q5, this.f43199i5);
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

    public final void V7(org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, String str) {
        vi K9 = K9(t1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(se.b.d(str, false));
        mh.f2 f2Var = new mh.f2(this, t1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                f2Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new s1(this, tL_contact, f2Var, 14));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = se.b.d(str, false);
        K9.f180b = new af(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ba(this, K9, f2Var, 3)), 0);
        K9.d();
    }

    public final float V8(float f10) {
        xn xnVar = this.f43100aa;
        if (xnVar == null) {
            xnVar = this;
        }
        org.telegram.ui.Components.sg sgVar = xnVar.J0;
        if (sgVar == null) {
            return 0.0f;
        }
        return sgVar.c(f10);
    }

    public final void Va() {
        Wa(false, null);
    }

    public final void Vb(boolean z4, boolean z10) {
        jk jkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z4 || this.f43281p2 != null) && this.O3 == 0 && (jkVar = this.V) != null && jkVar.getAudioVideoButtonContainer() != null && this.V.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.f43281p2 == null) {
                    pm pmVar = this.U0;
                    int indexOfChild = pmVar.indexOfChild(this.P);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(9, getParentActivity(), this.f43114ba, false);
                        this.f43281p2 = m40Var;
                        pmVar.addView(m40Var, indexOfChild + 1, k7.c6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z4) {
                    this.f43281p2.b(true);
                    return;
                }
                if (this.V.a2) {
                    org.telegram.ui.Components.m40 m40Var2 = this.f43281p2;
                    if (z10) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    m40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.f43281p2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.f43281p2.f(this.V.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void Vc(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        qj qjVar = this.f43340u0;
        if (qjVar != null) {
            if (!this.A4 && this.G7 != null) {
                int childCount = qjVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f43340u0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.G7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.f43311r6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.G7) + this.f43381x0.G;
                                i11 = L8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f43340u0.getChildCount();
            jk jkVar = this.V;
            if (jkVar != null) {
                jkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f43340u0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt2;
                    MessageObject messageObject3 = t1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        t1Var.X3(messageObject3, t1Var.getCurrentMessagesGroup(), t1Var.m3(), t1Var.n3(), t1Var.h3(), t1Var.j3());
                        jm jmVar = this.f43381x0;
                        this.f43340u0.getClass();
                        jmVar.Q(RecyclerView.R(t1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f43367w0.h1(i10, i11);
            }
        }
    }

    public final void W6() {
        ok okVar;
        nk nkVar;
        nk nkVar2;
        jk jkVar = this.V;
        if (jkVar != null && jkVar.f24692v3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.f43143e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((okVar = this.L0) == null || okVar.getVisibility() != 0) && (((nkVar = this.O) == null || nkVar.getVisibility() != 0) && ((nkVar2 = this.O2) == null || nkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void W7(org.telegram.ui.Cells.a0 r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.W7(org.telegram.ui.Cells.a0, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final float W8(org.telegram.ui.Components.s21 s21Var) {
        float f10;
        org.telegram.ui.Components.w21 w21Var = this.O1;
        if (w21Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float j10 = w21Var.j(s21Var);
            if (s21Var == org.telegram.ui.Components.s21.f30976b) {
                f10 = 64.0f;
            } else {
                f10 = 36.0f;
            }
            return (AndroidUtilities.dp(f10) + dp) * j10;
        }
        return 0.0f;
    }

    public final void W9(long j10, String str, boolean z4) {
        X9();
        oh.u2 u2Var = this.G1;
        if (u2Var != null) {
            u2Var.N1(j10, str, z4, false);
        }
    }

    public final void Wa(boolean z4, le leVar) {
        ArrayList arrayList;
        int i10;
        if (this.f43340u0.U1) {
            return;
        }
        this.K4 = 0;
        this.f43266nb = 0;
        this.L4 = false;
        this.T8.d(0);
        if (this.B6[0] && this.E7 == 0 && this.f43312r7 == 0) {
            this.f43170g1.d(false);
            if (this.f43367w0.I0() == 0) {
                this.f43139d9 = false;
                vc();
                Ia();
                Wc(false);
                return;
            }
            this.f43381x0.T();
            kn knVar = this.Ia;
            knVar.f38344a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f43311r6;
                if (i11 >= arrayList.size() || !((MessageObject) arrayList.get(i11)).isSponsored()) {
                    break;
                }
                i11++;
                z4 = false;
            }
            if (z4 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i11) != null) {
                long groupId = ((MessageObject) arrayList.get(i11)).getGroupId();
                while (groupId != 0 && (i10 = i11 + 1) < arrayList.size() && groupId == ((MessageObject) arrayList.get(i10)).getGroupId()) {
                    i11 = i10;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i11 = Math.min(i11, arrayList.size() - 1);
            }
            rk rkVar = this.T8;
            knVar.f38345b = i11;
            knVar.d = 0;
            boolean z10 = !z4;
            knVar.f38346c = z10;
            rkVar.c(i11, 0, z10, true);
            this.f43139d9 = false;
            vc();
            return;
        }
        org.telegram.ui.ActionBar.d2 d2Var = this.f43252mb;
        if (d2Var != null) {
            d2Var.dismiss();
        }
        xc(false);
        if (leVar != null) {
            leVar.run();
        } else {
            Ma();
            org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(getParentActivity(), 3, this.f43114ba);
            this.f43252mb = d2Var2;
            d2Var2.setOnCancelListener(this.f43216ja);
            this.f43252mb.q(1000L);
        }
        this.V8 = this.S5;
        this.X8 = false;
        this.W8 = 0;
        this.Y8 = false;
        ArrayList arrayList2 = this.e6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.S5));
        AndroidUtilities.runOnUIThread(new lf(this, 13), 0L);
    }

    public final boolean Wb(MessageObject messageObject) {
        if (this.O3 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void Wc(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Wc(boolean):void");
    }

    public final boolean X6(boolean z4, boolean z10) {
        jk jkVar = this.V;
        if (jkVar == null || !jkVar.v0()) {
            return false;
        }
        if (z4) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43114ba);
            if (this.V.Z0) {
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new jh.q(4, this, z10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f21168a);
            return true;
        }
        return true;
    }

    public final void X7(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.X7(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages X8(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f43346u6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void X9() {
        boolean z4;
        boolean z10;
        if (getParentActivity() != null) {
            jk jkVar = this.V;
            if (jkVar == null || TextUtils.isEmpty(jkVar.getSlowModeTimer())) {
                jk jkVar2 = this.V;
                if (jkVar2 != null && jkVar2.f24602e5.f50542f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                E7();
                oh.u2 u2Var = this.G1;
                if (!z4 && this.O3 != 9) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                u2Var.O1 = z10;
                u2Var.f29072g0.f0();
                int i10 = Build.VERSION.SDK_INT;
                if (i10 == 21 || i10 == 22) {
                    this.V.P();
                }
                TLRPC.Chat chat = this.f43143e;
                if ((chat == null || this.f43135d5 == null) && !z4 && this.O3 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.f43143e.slowmode_enabled) {
                        this.G1.J1(10, true);
                    } else {
                        this.G1.J1(-1, true);
                    }
                } else {
                    this.G1.J1(1, true);
                }
                oh.u2 u2Var2 = this.G1;
                u2Var2.P0 = true;
                u2Var2.f29116u1.setVisibility(0);
                u2Var2.N0 = 0;
                u2Var2.C = false;
                u2Var2.D = false;
                u2Var2.f29069f0 = true;
                u2Var2.G = null;
                org.telegram.ui.ActionBar.w0 w0Var = u2Var2.f29076h1;
                if (w0Var != null) {
                    u2Var2.f29073g1.setTranslationY(0.0f);
                    w0Var.setVisibility(8);
                }
                this.G1.r1();
                this.G1.m1().setText(this.V.getFieldText());
                oh.u2 u2Var3 = this.G1;
                u2Var3.f29104r = this.f43114ba;
                showDialog(u2Var3);
            }
        }
    }

    public final void Xa(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Xa(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void Xb(MessageObject messageObject, boolean z4) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            ng.v vVar = this.V9;
            if (vVar != null && vVar.d()) {
                this.V9.setHiddenByScroll(true);
            }
            if (this.f43169g0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f21548k0) {
                    kVar.h(true);
                    this.V.e1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                wh.z1 z1Var = new wh.z1(richMessage);
                z1Var.G = this;
                z1Var.f50240r = messageObject;
                presentFragment(z1Var);
                return;
            }
            this.F1.getAdapter().f48732c0 = false;
            this.V.setVisibility(0);
            yb(true, null, messageObject, null, null, null, false, true);
            hc(false);
            if (!z4) {
                N6();
            }
            if (z4) {
                this.f43135d5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.V.V0(false, false, true);
            yc(0, true);
            Wc(false);
            if (!z4 && !messageObject.scheduled && !messageObject.isQuickReply() && this.O3 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.Q5);
                tL_messages_getMessageEditData.f20937id = messageObject.getId();
                this.f43235l5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new oe(this, 3));
                return;
            }
            jk jkVar = this.V;
            org.telegram.ui.Components.oe oeVar = jkVar.B1;
            if (oeVar != null) {
                oeVar.setEnabled(true);
                jkVar.B1.h(false);
            }
        }
    }

    public final void Y6() {
        if (!this.Pb) {
            this.Pb = true;
            if (!this.Qb && this.O3 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.f43320s1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.f43320s1.u();
                    this.Qb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.f43330t1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.f43330t1.u();
                    this.Qb = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    Z6();
                }
            }
        }
    }

    public final void Y7(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Y7(int, java.lang.Object[]):void");
    }

    public final void Y8(boolean z4) {
        int i10;
        int i11 = 1;
        if (this.O3 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.f43322s3;
            if (!z4) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.L3);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j10 = this.Q5;
        long j11 = this.I6;
        int i14 = this.classGuid;
        boolean z10 = this.Ma;
        if (!z4 ? !z10 : z10) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j10, j11, i14, i10, this.f43094a4, this.f43233l3, this.f43245m3, this.f43258n3);
        Lb(false);
    }

    public final void Y9() {
        qt.q().T = null;
        if (getParentActivity() == null) {
            return;
        }
        E7();
        this.G1.f29072g0.f0();
        int i10 = Build.VERSION.SDK_INT;
        if (i10 == 21 || i10 == 22) {
            this.V.P();
        }
        this.G1.J1(1, false);
        oh.u2 u2Var = this.G1;
        u2Var.R1 = true;
        u2Var.i1(null);
        this.G1.r1();
        oh.u2 u2Var2 = this.G1;
        u2Var2.f29104r = this.f43114ba;
        if (this.visibleDialog != null) {
            u2Var2.show();
        } else {
            showDialog(u2Var2);
        }
    }

    public final void Ya(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Ya(java.lang.CharSequence, boolean):void");
    }

    public final void Yb() {
        org.telegram.ui.Components.s00 s00Var = this.f43215j9;
        if (s00Var != null && !s00Var.f30944c) {
            s00Var.c(false);
            try {
                this.f43215j9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Z6() {
        org.telegram.ui.Cells.t1 t1Var;
        qh.e3 e3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z4;
        qh.e3 e3Var2 = this.f43341u1;
        if (e3Var2 != null && !e3Var2.S && !this.Sb && this.Pb && !this.f43365vc.f50542f && System.currentTimeMillis() - this.Rb > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f43340u0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f43340u0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.t1) {
                        t1Var = (org.telegram.ui.Cells.t1) childAt;
                        ng.r0 r0Var = t1Var.K;
                        MessageObject primaryMessageObject = t1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z4 = false;
                        } else {
                            z4 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z4 && !r0Var.v.isEmpty()) {
                            t1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + r0Var.d;
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
                ng.r0 r0Var2 = t1Var.K;
                this.Sb = true;
                t1Var.getLocationInWindow(iArr);
                this.f43341u1.setTranslationY(((iArr[1] - e3Var.getTop()) - AndroidUtilities.dp(120.0f)) + r0Var2.d);
                this.f43341u1.m(0.0f, (((ng.o0) r0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + r0Var2.f16188c);
                this.f43341u1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(this, 19));
            AndroidUtilities.runOnUIThread(new le(this, 19), 2000L);
        }
    }

    public final void Z7(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Z7(int, java.lang.Object[]):void");
    }

    public final void Z8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Z8():void");
    }

    public final void Z9(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.t1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.Z9(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.t1, org.telegram.messenger.MessageObject):void");
    }

    public final void Za(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.f43233l3 = user;
        this.f43245m3 = chat;
        if (this.f43169g0 != null && this.F1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.f43233l3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.f43221k3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(android.support.v4.media.a.z(string, " ", str));
                    spannableString.setSpan(new ForegroundColorSpan(getThemedColor(org.telegram.ui.ActionBar.k6.B8)), string.length() + 1, spannableString.length(), 33);
                    this.f43169g0.setSearchFieldCaption(spannableString);
                    this.F1.getAdapter().U(null, 0, null, false, true);
                    this.f43169g0.setSearchFieldHint(null);
                    org.telegram.ui.ActionBar.w0 w0Var = this.f43169g0;
                    w0Var.f22366r = null;
                    lg.f fVar = w0Var.f22351e;
                    if (fVar != null) {
                        fVar.setText("");
                    }
                    MediaDataController mediaDataController = getMediaDataController();
                    this.f43295q3 = "";
                    mediaDataController.searchMessagesInChat("", this.Q5, this.I6, this.classGuid, 0, this.f43094a4, this.f43233l3, this.f43245m3, this.f43258n3);
                }
            }
        }
    }

    public final void Zb() {
        long j10;
        le leVar = this.R7;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
        }
        le leVar2 = new le(this, 15);
        this.R7 = leVar2;
        if (this.M7 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(leVar2, j10);
    }

    public long a() {
        return this.Q5;
    }

    public final void a7(boolean z4) {
        int i10;
        if (this.f43367w0 != null && !this.f43260n5 && !this.f43381x0.I && !this.f43124c7) {
            int i11 = -1;
            int i12 = -1;
            int i13 = 0;
            for (int i14 = 0; i14 < this.f43340u0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f43340u0.getChildAt(i14));
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
            jm jmVar = this.f43381x0;
            if (jmVar.K) {
                int i15 = jmVar.B;
                if (i15 >= 0 && i12 >= 0 && i15 >= i12 && i15 <= i11) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = jmVar.h();
            if (z4) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            if (this.O3 == 7) {
                if ((h - i12) - i13 <= i10 && !this.D6 && !this.f43413z6[0]) {
                    this.D6 = true;
                    this.e6.add(Integer.valueOf(this.S5));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.f43308r3;
                    int i16 = this.classGuid;
                    int i17 = this.L3;
                    int i18 = this.S5;
                    this.S5 = i18 + 1;
                    hashtagSearchController.searchHashtag(str, i16, i17, i18);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.kf(this, h, i12, i13, i10, 1));
        }
    }

    public final void a8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.a8(int, java.lang.Object[]):void");
    }

    public final boolean a9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.T5;
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
            FileLog.d("getDiscussionMessage chat = " + chat.f20845id + " msg_id = " + i13);
        }
        this.f43168fc = 0;
        this.f43181gc = false;
        this.ic = null;
        this.jc = null;
        qj qjVar = this.f43340u0;
        if (qjVar != null) {
            qjVar.e1();
        }
        if (this.f43155ec != -1) {
            getConnectionsManager().cancelRequest(this.f43155ec, false);
        }
        if (this.f43142dc != -1) {
            getConnectionsManager().cancelRequest(this.f43142dc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.f43168fc = i13;
        this.f43181gc = false;
        this.f43193hc = System.currentTimeMillis();
        qj qjVar2 = this.f43340u0;
        if (qjVar2 != null) {
            qjVar2.e1();
        }
        final int i14 = this.f43116bc + 1;
        this.f43116bc = i14;
        this.f43142dc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                xn xnVar = xn.this;
                AndroidUtilities.runOnUIThread(new xc(11, xnVar, new Runnable(i14, i11, j11, tLObject, i12, messageObject2, tL_messages_getDiscussionMessage, chat, messageObject) {
                    public final int f35180b;
                    public final int f35181c;
                    public final TLObject d;
                    public final int f35182e;
                    public final MessageObject f35183f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f35184n;
                    public final MessageObject f35185r;

                    {
                        this.d = tLObject;
                        this.f35182e = r7;
                        this.f35183f = r8;
                        this.h = r9;
                        this.f35184n = r10;
                        this.f35185r = r11;
                    }

                    @Override
                    public final void run() {
                        int i15;
                        final xn xnVar2 = xn.this;
                        if (this.f35180b != xnVar2.f43116bc) {
                            return;
                        }
                        xnVar2.f43142dc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            xnVar2.ic = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            xnVar2.getMessagesController().putUsers(xnVar2.ic.users, false);
                            xnVar2.getMessagesController().putChats(xnVar2.ic.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = xnVar2.ic;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i16 = 0; i16 < xnVar2.ic.messages.size(); i16++) {
                                TLRPC.Message message = xnVar2.ic.messages.get(i16);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i17 = this.f35181c;
                        final int i18 = this.f35182e;
                        final MessageObject messageObject3 = this.f35183f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = this.h;
                        final TLRPC.Chat chat2 = this.f35184n;
                        final MessageObject messageObject4 = this.f35185r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = xnVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f20866id;
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
                            final int i19 = xnVar2.f43129cc + 1;
                            xnVar2.f43129cc = i19;
                            xnVar2.f43155ec = xnVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new nh(xn.this, i19, tLObject3, tL_error2, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4, 0));
                                }
                            });
                            return;
                        }
                        xnVar2.ya(xnVar2.ic, xnVar2.jc, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.f43142dc, this.classGuid);
    }

    public final void ab(View view, MessageObject messageObject, org.telegram.ui.Components.qk0 qk0Var, View view2, float f10, float f11, ng.q0 q0Var, boolean z4, boolean z10, boolean z11, boolean z12) {
        String str;
        int i10;
        TLRPC.Document f12;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.a0 a0Var;
        mh.l5 l5Var;
        int[] iArr;
        int[] iArr2;
        int i12;
        boolean z13;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && messageObject != null) {
            if (getMessagesController().isFrozen()) {
                c.b(this.currentAccount);
                return;
            }
            ArrayList<TLRPC.MessageReactor> arrayList = null;
            if (q0Var != null && q0Var.f16176a) {
                A7(true);
                if (view == null) {
                    a0Var = q8(messageObject.getId(), true);
                } else {
                    a0Var = view;
                }
                String str2 = "";
                if (z10) {
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
                    long j10 = -mh.n7.b(messageObject).f14492a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
                        org.telegram.ui.Components.qc a02 = org.telegram.ui.Components.qc.a0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        a02.Q(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    mh.s7 s7Var = mh.t7.y(this.currentAccount, false).B;
                    if (s7Var != null) {
                        s7Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j11 = this.Q5;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z13 = false;
                    } else {
                        z13 = true;
                    }
                    mh.eb ebVar = new mh.eb(parentActivity, i15, j11, this, messageObject, arrayList2, z13, false, 0L, this.f43114ba);
                    messageObject.getId();
                    ebVar.Q = this;
                    ebVar.R = a0Var;
                    ebVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -mh.n7.b(messageObject).f14492a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j12);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j12));
                    org.telegram.ui.Components.qc a03 = org.telegram.ui.Components.qc.a0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    a03.Q(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                mh.s7 d02 = mh.t7.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (a0Var instanceof org.telegram.ui.Cells.a0)) {
                    if (this.nc == null) {
                        this.nc = new mh.l5(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        l5Var = null;
                    } else {
                        if (this.nc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.nc);
                            layoutContainer.addView(this.nc, k7.c6.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.nc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.nc.bringToFront();
                        }
                        l5Var = this.nc;
                    }
                    l5Var.setMessageCell((org.telegram.ui.Cells.a0) a0Var);
                    d02.f14762o = l5Var;
                    l5Var.F = false;
                    l5Var.b(1.0f, null);
                    a0Var.getLocationInWindow(new int[2]);
                    l5Var.getLocationInWindow(new int[2]);
                    float f13 = (iArr[0] - iArr2[0]) + f10;
                    float f14 = (iArr[1] - iArr2[1]) + f11;
                    if (a0Var instanceof org.telegram.ui.Cells.t1) {
                        i12 = ((org.telegram.ui.Cells.t1) a0Var).S;
                    } else {
                        i12 = 0;
                    }
                    l5Var.d(f13, f14 + i12, false);
                    return;
                }
                return;
            }
            ng.q0 q0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new fg.n1((org.telegram.ui.ActionBar.p2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(q0Var) && (chat = this.f43143e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.f43143e, 26)) {
                l.d.v(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.qc.a0(this), R.raw.e_hand_2, 36);
            } else {
                ng.m0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(q0Var, z10, z4);
                int id2 = messageObject.getId();
                long groupId = messageObject.getGroupId();
                a0.h hVar = this.f43346u6;
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
                        long j13 = q0Var.f16181g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(q0Var.f16180f);
                            if (tL_availableReaction != null) {
                                f12 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f12 = org.telegram.ui.Components.l5.f(this.currentAccount, j13);
                        }
                        if (f12 != null) {
                            org.telegram.ui.Components.ic r10 = org.telegram.ui.Components.qc.a0(this).r(f12, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            r10.f27778j = 5000;
                            r10.j();
                        }
                    }
                    if (!z4) {
                        int i19 = this.currentAccount;
                        if (qk0Var != null) {
                            if (z10) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        ng.m0.d(this, qk0Var, q82, view2, f10, f11, q0Var, i19, i10);
                    }
                }
                if (selectReaction && q0Var != null && (str = q0Var.f16180f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<ng.q0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    q0Var2 = q0Var;
                }
                si siVar = new si(this, z12, z4, i18, selectReaction, qk0Var, f10, f11, q0Var, messageObject);
                this.Zb = siVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, q0Var2, z10, z11, this, siVar);
                if (z4 || z12) {
                    qc(messageObject, true);
                    this.Zb.run();
                }
                if (!z12) {
                    AndroidUtilities.runOnUIThread(this.Zb, 50L);
                }
            }
        }
    }

    public final void ac() {
        AndroidUtilities.forEachViews((RecyclerView) this.f43340u0, (h5.d) new oc(1, this, t9()));
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
        if (!this.f43148e4 && (i10 = this.O3) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f43094a4;
    }

    public final void b7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.f43275o8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.f43275o8 = true;
            org.telegram.ui.Components.z4.s0(getParentActivity(), this.currentAccount, new le(this, 9), true, this.f43114ba);
        }
    }

    public final void b8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.b8(int, java.lang.Object[]):void");
    }

    public final boolean b9() {
        qm qmVar = this.Z8;
        if (qmVar != null && qmVar.y()) {
            return true;
        }
        return false;
    }

    public final void ba(boolean z4) {
        String string;
        if (!y9() && !a9()) {
            int i10 = 0;
            boolean z10 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.T5;
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
                        z10 = true;
                    }
                    i12++;
                }
                if (i10 == 2) {
                    break;
                }
            }
            ng.v vVar = this.V9;
            if (vVar != null && vVar.d()) {
                this.V9.setHiddenByScroll(true);
            }
            Bundle e6 = org.telegram.messenger.y3.e(3, "onlySelect", "dialogsType", true);
            e6.putInt("messagesCount", this.Z5);
            e6.putInt("hasPoll", i10);
            e6.putBoolean("hasInvoice", z10);
            e6.putBoolean("canSelectTopics", true);
            py pyVar = new py(e6);
            pyVar.f40278z2 = this;
            presentFragment(pyVar);
            return;
        }
        if (y9()) {
            if (a() > 0) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoUser);
            } else if (ChatObject.isChannel(this.f43143e) && !this.f43143e.megagroup) {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoChannel);
            } else {
                string = LocaleController.getString(R.string.ForwardsRestrictedInfoGroup);
            }
        } else {
            string = LocaleController.getString(R.string.ForwardsRestrictedInfoBot);
        }
        if (z4) {
            if (this.f43184h2 == null) {
                pm pmVar = this.U0;
                int indexOfChild = pmVar.indexOfChild(this.P);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.m40 m40Var = new org.telegram.ui.Components.m40(7, getParentActivity(), null, true);
                    this.f43184h2 = m40Var;
                    pmVar.addView(m40Var, indexOfChild + 1, k7.c6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f43184h2.setAlpha(0.0f);
                    this.f43184h2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f43184h2.setText(string);
            this.f43184h2.f(this.actionBar.getActionMode().k(11), true);
            return;
        }
        if (this.f43196i2 == null) {
            pm pmVar2 = this.U0;
            int indexOfChild2 = pmVar2.indexOfChild(this.P);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.m40 m40Var2 = new org.telegram.ui.Components.m40(getParentActivity(), 9);
            this.f43196i2 = m40Var2;
            pmVar2.addView(m40Var2, indexOfChild2 + 1, k7.c6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f43196i2.setAlpha(0.0f);
            this.f43196i2.setVisibility(4);
        }
        this.f43196i2.setText(string);
        this.f43196i2.f(this.M0.getForwardButton(), true);
    }

    public final void bb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f20851id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.Q5, this.f43223k5, this.U3, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = C8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        y6();
    }

    public final void bc(boolean z4) {
        if (!getMessagesController().isDialogMuted(this.Q5, b())) {
            if (z4) {
                getNotificationsController().muteDialog(this.Q5, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.h3 F = org.telegram.ui.Components.z4.F(this.Q5, b(), this, this.f43114ba);
            F.setCalcMandatoryInsets(x9());
            showDialog(F);
            return;
        }
        getNotificationsController().muteDialog(this.Q5, b(), false);
        if (!z4) {
            org.telegram.ui.Components.qc.z(this, 4, 0, this.f43114ba).j();
        }
    }

    @Override
    public final boolean c() {
        if (this.O3 == 1) {
            return true;
        }
        return false;
    }

    public final void c7(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        jk jkVar = this.V;
        if (jkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.Q5, (int) b());
            xd.a aVar = jkVar.f24595d5;
            mh.f5 f5Var = jkVar.F0;
            boolean z13 = false;
            if (streamingSendButtonState != BotForumHelper.SteamingSendButtonState.NO_STREAMING) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (streamingSendButtonState == BotForumHelper.SteamingSendButtonState.STOP) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z4 && aVar.f50541e > 0.0f) {
                z12 = true;
            } else {
                z12 = false;
            }
            ((xd.a) f5Var.f14039c).a(z11, z12);
            f5Var.setClickable(z11);
            f5Var.setEnabled(z11);
            if (aVar.f50542f != z10) {
                z13 = true;
            }
            aVar.a(z10, z4);
            jkVar.P4 = streamingSendButtonState;
            if (z13) {
                jkVar.J(z4);
            }
        }
    }

    public final void c8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.c8(java.lang.Object[]):void");
    }

    public final void c9() {
        org.telegram.ui.Components.xt editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.s()) {
                this.f43407yc.h(5, false, true);
                this.actionBar.r();
            } else {
                return;
            }
        }
        this.X5 = 0;
        this.f43096a6 = 0;
        this.Y5 = 0;
        this.f43123c6 = 0;
        this.f43136d6 = 0;
        this.f43110b6 = 0;
        jk jkVar = this.V;
        if (jkVar != null && (editField = jkVar.getEditField()) != null) {
            if (this.V.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        qm qmVar = this.Z8;
        if (qmVar != null) {
            qmVar.f(true);
            SparseArray sparseArray = this.Z8.f23235u0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        ol olVar = this.f43152e9;
        if (olVar != null) {
            AndroidUtilities.cancelRunOnUIThread(olVar.E);
            olVar.a();
        }
        jk jkVar2 = this.V;
        if (jkVar2 != null) {
            jkVar2.U = false;
        }
        this.f43166f9 = false;
        if (this.Ya != null) {
            k9();
        }
    }

    public final void ca(int i10) {
        boolean z4;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f43122c5;
        if (messagePreviewParams != null && this.Ba == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.D5;
                CharSequence fieldText = this.V.getFieldText();
                MessageObject messageObject2 = this.f43223k5;
                if (messageObject2 == this.U3) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f43199i5, this.f43247m5);
            }
            if (!this.f43122c5.isEmpty()) {
                this.f43115bb = this.V.f24691v2;
                Context context = this.U0.getContext();
                MessagePreviewParams messagePreviewParams2 = this.f43122c5;
                TLRPC.User user = this.f43156f;
                TLRPC.Chat chat = this.f43143e;
                int i12 = this.currentAccount;
                vn vnVar = this.f43114ba;
                nn nnVar = this.f43199i5;
                if (nnVar != null && nnVar.f39409f) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                fl flVar = new fl(this, context, this, this.f43389x8, messagePreviewParams2, user, chat, i12, vnVar, i10, z4);
                this.Ba = flVar;
                this.f43122c5.attach(flVar);
                TLRPC.ChatFull chatFull = this.W7;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.f43153ea) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.f43153ea.peers.get(0).peer;
                }
                this.Ba.setSendAsPeer(peer);
                d7();
                this.U0.addView(this.Ba);
                if (this.f43115bb) {
                    jk jkVar = this.V;
                    jkVar.Q0 = true;
                    org.telegram.ui.Components.uf ufVar = jkVar.R0;
                    if (ufVar != null) {
                        ufVar.u(true);
                    }
                    this.V.s1();
                    this.A3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ae aeVar;
        if ((this.O3 != 5 || (!this.f43311r6.isEmpty() && this.f43094a4 != 0)) && !this.f43365vc.f50542f && this.f43227k9) {
            jk jkVar = this.V;
            if (!jkVar.B2) {
                if (!jkVar.Z0 || (aeVar = jkVar.f24579b1) == null || aeVar.getVisibility() != 0) {
                    if ((!jkVar.j0() || !jkVar.f24622i0.v) && !org.telegram.ui.ActionBar.p2.hasSheets(jkVar.L2) && this.K9 == 0.0f) {
                        ih.k kVar = this.U9;
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

    public final void cb(TLRPC.BotInlineResult botInlineResult, boolean z4, int i10, long j10) {
        long j11;
        String str;
        bk bkVar = this.F1;
        if (bkVar == null) {
            return;
        }
        TLRPC.User user = bkVar.getAdapter().f48753t0;
        if (user != null) {
            j11 = user.f20992id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f20843id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.F1.getAdapter().f48753t0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.Q5, this.f43223k5, this.U3, null, this.f43199i5, z4, i10, 0, C8(), j10, N8());
        this.V.setFieldText("");
        e9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void cc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.ic icVar = this.f43384x3;
        if (icVar != null) {
            icVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f43095a5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.N4;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.Q5), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.N4 - 1), Boolean.valueOf(this.P4));
        this.f43384x3 = org.telegram.ui.Components.qc.B(this, false, new dg.u1(this, arrayList2, arrayList, i10, 11), new re(this, messageObject, 7), this.f43114ba).j();
    }

    @Override
    public final android.view.View createView(android.content.Context r53) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.createView(android.content.Context):android.view.View");
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z4, int i11, long j10) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.Q5, this.f43223k5, this.U3, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i11, 0);
        of2.sendMessageChatArguments = C8();
        of2.payStars = j10;
        of2.monoForumPeer = N8();
        of2.suggestionParams = this.f43135d5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.O3 == 0) {
            O9(false);
        }
        if (i10 == 0 || i10 == 1) {
            y6();
        }
        if (this.f43260n5) {
            this.N5 = true;
        }
    }

    public final void d7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.d7():void");
    }

    public final void d8(int i10, ArrayList arrayList, boolean z4) {
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.Q5, this.f43223k5, this.U3, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z4, i10, 0, null, false);
                    of2.sendMessageChatArguments = C8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            for (int i13 = 0; i13 < arrayList2.size(); i13 = i11 + 1) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.Q5, this.f43223k5, this.U3, null, this.f43199i5, z4, i10, 0, C8(), 0L, N8());
                    arrayList2 = arrayList;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    i11 = i13;
                }
            }
            if (!arrayList2.isEmpty()) {
                l8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.Q5, this.f43223k5, this.U3, null, this.f43199i5, false, true, this.f43247m5, z4, i10, 0, this.O3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f43135d5);
                y6();
                if (i10 != 0) {
                    if (this.P3 == -1) {
                        this.P3 = 0;
                    }
                    this.P3 = arrayList.size() + this.P3;
                    Ec(true);
                }
            }
        }
    }

    public final void d9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.qc.a0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Fa(this.f43095a5);
            Ha(this.f43095a5);
            return;
        }
        showDialog(new fg.n1((org.telegram.ui.ActionBar.p2) this, 3, true));
    }

    public final void da(String str, boolean z4) {
        boolean z10;
        hk hkVar;
        boolean z11;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                M7();
                qh.e3 e3Var = this.f43320s1;
                if (e3Var != null && e3Var.S) {
                    e3Var.e(true);
                    z10 = true;
                } else {
                    z10 = false;
                }
                qh.e3 e3Var2 = this.f43330t1;
                if (e3Var2 != null && e3Var2.S) {
                    e3Var2.e(true);
                    z10 = true;
                }
                if (z10) {
                    AndroidUtilities.runOnUIThread(new qe(this, str, 5), 200L);
                    return;
                }
                this.f43308r3 = str;
                this.f43295q3 = str;
                boolean contains = str.contains("@");
                R6(true);
                if (!this.actionBar.f21548k0) {
                    this.f43379wc.a(true, true);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f43144e0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar = this.f43104b0;
                    if (yVar != null) {
                        yVar.f(8);
                    }
                    ds dsVar = this.f43091a0;
                    if (dsVar != null) {
                        dsVar.b(false);
                    }
                    org.telegram.ui.ActionBar.y yVar2 = this.f43157f0;
                    if (yVar2 != null) {
                        yVar2.f(8);
                    }
                    if ((this.f43094a4 == 0 || (i10 = this.O3) == 3 || i10 == 8) && (w0Var = this.f43169g0) != null) {
                        w0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.f43206j0;
                    if (w0Var3 != null && this.H9) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar3 = this.f43218k0;
                    if (yVar3 != null && this.I9) {
                        yVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.f43182h0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    this.f43231l0 = true;
                    Fc(0, 0, -1);
                    hc(false);
                }
                vk vkVar = this.l1;
                if (vkVar != null) {
                    if (vkVar.B > 0.5f) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        vkVar.g(false);
                    }
                }
                ImageView imageView = this.Q2;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z4 && (!ChatObject.isChannelAndNotMegaGroup(this.f43143e) || !ChatObject.isPublic(this.f43143e) || this.f43308r3 == null)) {
                    this.f43268o1 = 0;
                } else {
                    this.f43268o1 = 2;
                }
                this.T4 = false;
                if (this.L3 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                ek ekVar = this.f43256n1;
                if (ekVar != null) {
                    ekVar.h.clear();
                }
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f43169g0;
                if (w0Var5 != null) {
                    this.f43102ac = true;
                    w0Var5.z(false);
                    this.f43102ac = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = this.f43169g0;
                if (w0Var6 != null) {
                    w0Var6.setSearchFieldCaption(null);
                    this.f43169g0.H(str, false);
                    this.f43169g0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.f43295q3, this.Q5, this.I6, this.classGuid, 0, this.f43094a4, false, this.f43233l3, this.f43245m3, false, this.f43258n3);
                yc(0, true);
                this.a2.e(true, true);
                Lb(true);
                hk hkVar2 = this.f43243m1;
                if (hkVar2 != null) {
                    hkVar2.b(!contains);
                    Hc();
                }
                if ((contains || z4) && this.f43308r3 != null && (hkVar = this.f43243m1) != null) {
                    int currentPosition = hkVar.f30855a.getCurrentPosition();
                    int i11 = this.f43268o1;
                    if (currentPosition != i11) {
                        this.f43243m1.f30855a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.f43308r3);
                this.f43293q1.f27357f.N(true);
                View currentView = this.f43256n1.getCurrentView();
                if (currentView instanceof zn) {
                    ((zn) currentView).f43986a.Jc(this.f43308r3);
                }
            }
        }
    }

    public final void db(ArrayList arrayList, String str, boolean z4, int i10, long j10, boolean z10) {
        long j11;
        if (f7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q5, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.effect_id = j10;
                of2.invert_media = z10;
                of2.payStars = 0L;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f43135d5;
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
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.Q5, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z4, i10, 0);
                of3.sendMessageChatArguments = C8();
                of3.effect_id = j11;
                of3.invert_media = z10;
                of3.payStars = 0L;
                of3.monoForumPeer = N8();
                of3.suggestionParams = this.f43135d5;
                getSendMessagesHelper().sendMessage(of3);
                j11 = 0;
            }
            y6();
        }
    }

    public final void dc() {
        boolean A9 = A9();
        SparseArray[] sparseArrayArr = this.T5;
        if (!A9) {
            if (this.actionBar.s() && this.Y0 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.Y0.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.f43395y0.setText(LocaleController.getString(R.string.ReportMessagesNoCaps));
            this.f43395y0.setAlpha(0.5f);
            this.f43395y0.setEnabled(false);
            return;
        }
        this.f43395y0.setText(LocaleController.formatString(R.string.ReportMessagesCountNoCaps, LocaleController.formatPluralString("messages", size, new Object[0])));
        this.f43395y0.setAlpha(1.0f);
        this.f43395y0.setEnabled(true);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.f5 f5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.User user;
        boolean z4;
        lj ljVar;
        jk jkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.xt editField;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.xx0 xx0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        jk jkVar2;
        xn xnVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            xnVar.c8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            qj qjVar = xnVar.f43340u0;
            if (qjVar != null) {
                qjVar.e1();
            }
            org.telegram.ui.Components.li liVar = xnVar.J9;
            if (liVar != null) {
                liVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z12 = false;
            r2 = false;
            boolean z13 = false;
            if (i10 == NotificationCenter.loadingMessagesFailed) {
                if (((Integer) objArr[0]).intValue() == xnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        xnVar.finishFragment();
                        c.b(xnVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z10 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z10 = false;
                }
                oh.u2 u2Var = xnVar.G1;
                if (u2Var != null && u2Var.isShowing()) {
                    xnVar.G1.dismiss(true);
                }
                if (z10 && (jkVar2 = xnVar.V) != null && jkVar2.t0()) {
                    xnVar.V.m0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f20865id = stickerSet2.f20872id;
                        if (objArr.length > 4) {
                            z11 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z11 = false;
                        }
                        Dialog dialog = xnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.xx0) && (tL_messages_stickerSet = (xx0Var = (org.telegram.ui.Components.xx0) dialog).P) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f20872id == stickerSet2.f20872id) {
                            xx0Var.D0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.qc qcVar = new org.telegram.ui.Components.qc(xx0Var.container, xnVar.resourceProvider);
                                    if (z11) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.ic r10 = qcVar.r(document, LocaleController.formatString(i12, stickerSet2.title));
                                    r10.f27778j = 2750;
                                    r10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.xx0 xx0Var2 = new org.telegram.ui.Components.xx0(xnVar.getParentActivity(), xnVar, tL_inputStickerSetID, null, xnVar.V, xnVar.f43114ba);
                            final boolean z14 = z11;
                            xnVar = this;
                            xx0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    xn.i1(xn.this, objArr, xx0Var2, z14, stickerSet2);
                                }
                            });
                            xnVar.showDialog(xx0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                qj qjVar2 = xnVar.f43340u0;
                if (qjVar2 != null) {
                    qjVar2.e1();
                }
                TextView textView = xnVar.N2;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.l5 l5Var = xnVar.A2[i13];
                    if (l5Var != null) {
                        l5Var.invalidate();
                    }
                }
                bk bkVar = xnVar.F1;
                if (bkVar != null) {
                    bkVar.getListView().e1();
                }
                mh.d1 d1Var = xnVar.I3;
                if (d1Var != null) {
                    d1Var.e1();
                }
                UndoView undoView = xnVar.f43356v3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                jk jkVar3 = xnVar.V;
                if (jkVar3 != null && (editField = jkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                hg.q[] qVarArr = xnVar.B2;
                hg.q qVar = qVarArr[0];
                if (qVar != null) {
                    qVar.invalidate();
                }
                hg.q qVar2 = qVarArr[1];
                if (qVar2 != null) {
                    qVar2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l10 = (Long) objArr[0];
                if (xnVar.W7 != null && (chat = xnVar.f43143e) != null && chat.f20845id == l10.longValue()) {
                    xnVar.W7.online_count = ((Integer) objArr[1]).intValue();
                    lj ljVar2 = xnVar.X0;
                    if (ljVar2 != null) {
                        ljVar2.m();
                        xnVar.X0.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == xnVar.Q5 && (jkVar = xnVar.V) != null) {
                    jkVar.Q1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                jk jkVar4 = xnVar.V;
                if (jkVar4 != null) {
                    jkVar4.R1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (xnVar.f43143e != null) {
                        TLRPC.Chat chat2 = xnVar.getMessagesController().getChat(Long.valueOf(xnVar.f43143e.f20845id));
                        if (chat2 != null) {
                            xnVar.f43143e = chat2;
                        }
                    } else if (xnVar.f43156f != null && (user = xnVar.getMessagesController().getUser(Long.valueOf(xnVar.f43156f.f20992id))) != null) {
                        xnVar.f43156f = user;
                    }
                    xnVar.Nc(true);
                }
                if (!xnVar.F9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (xnVar.f43143e != null && (ljVar = xnVar.X0) != null) {
                        ljVar.m();
                    }
                    z4 = true;
                } else {
                    z4 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    xnVar.p();
                    xnVar.Wc(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z4 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && xnVar.f43143e != null) {
                    xnVar.y9();
                    TLRPC.Chat chat3 = xnVar.getMessagesController().getChat(Long.valueOf(xnVar.f43143e.f20845id));
                    if (chat3 != null) {
                        xnVar.f43143e = chat3;
                        xnVar.y9();
                        z4 = !xnVar.F9();
                        xnVar.hc(false);
                        jk jkVar5 = xnVar.V;
                        if (jkVar5 != null) {
                            jkVar5.b1(xnVar.currentAccount, xnVar.Q5);
                        }
                        FlagSecureReason flagSecureReason = xnVar.B3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                lj ljVar3 = xnVar.X0;
                if (ljVar3 != null && z4) {
                    ljVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    xnVar.Qc(true);
                }
                org.telegram.ui.ActionBar.w0 w0Var = xnVar.f43144e0;
                if (w0Var != null) {
                    if (ChatObject.isChannel(xnVar.f43143e) && !ChatObject.isMonoForum(xnVar.f43143e)) {
                        long j11 = xnVar.f43143e.linked_monoforum_id;
                        if (j11 != 0 && ChatObject.canManageMonoForum(xnVar.currentAccount, -j11)) {
                            z12 = true;
                        }
                    }
                    w0Var.I(70, z12);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!xnVar.La) {
                    if (longValue == xnVar.Q5) {
                        ((Boolean) objArr[2]).getClass();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i14 = xnVar.O3;
                        if (intValue2 != i14 && i14 != 3 && i14 != 8) {
                            if (i14 != 1 && intValue2 == 1 && !xnVar.isPaused && LaunchActivity.U() == xnVar && xnVar.f43122c5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z13 = true;
                                }
                                xnVar.ja(id2, z13);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            xnVar.za(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(xnVar.f43143e) && !xnVar.f43143e.megagroup && (chatFull = xnVar.W7) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size = arrayList.size();
                        for (int i15 = 0; i15 < size; i15++) {
                            MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                            if (messageObject3.isReply()) {
                                xnVar.s6.put(messageObject3.getId(), messageObject3);
                            }
                        }
                        xnVar.w7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                xnVar.I9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                xnVar.t6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == xnVar.Q5) {
                        xnVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (f5Var = xnVar.parentLayout) != null && f5Var.getFragmentStack().size() > 1) {
                    xnVar.finishFragment();
                } else {
                    xnVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == xnVar.a() && (booleanValue || xnVar.parentLayout.getLastFragment() != xnVar)) {
                    if (xnVar.parentLayout.getLastFragment() == xnVar) {
                        xnVar.finishFragment();
                    } else {
                        xnVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i16 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = xnVar.f43236l6;
                if (i10 == i16) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = xnVar.f43143e;
                    if (chat4 != null && chat4.f20845id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (xnVar.f43260n5) {
                            uh uhVar = xnVar.f43222k4;
                            if (uhVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(uhVar);
                                xnVar.f43222k4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            uh uhVar2 = new uh(xnVar, messageObject2, intValue3);
                            xnVar.f43222k4 = uhVar2;
                            AndroidUtilities.runOnUIThread(uhVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = xnVar.f43143e;
                    if (chat5 != null && chat5.f20845id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = xnVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(xnVar.f43143e, xnVar.getMessagesController().getChatFull(xnVar.f43143e.f20845id)));
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
                    if ((i10 == i18 || i10 == NotificationCenter.monoForumMessagesRead) && xnVar.Q5 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i18) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = xnVar.f43094a4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i19 = xnVar.f43186h4;
                            ArrayList arrayList2 = xnVar.f43311r6;
                            if (intValue4 > i19) {
                                xnVar.f43186h4 = intValue4;
                                int size3 = arrayList2.size();
                                for (int i20 = 0; i20 < size3; i20++) {
                                    MessageObject messageObject4 = (MessageObject) arrayList2.get(i20);
                                    int id3 = messageObject4.getId();
                                    if (!messageObject4.isOut() && id3 > 0 && id3 <= xnVar.f43186h4) {
                                        if (!messageObject4.isUnread()) {
                                            break;
                                        }
                                        messageObject4.setIsRead();
                                        jm jmVar = xnVar.f43381x0;
                                        if (jmVar != null) {
                                            jmVar.M(messageObject4);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > xnVar.f43198i4) {
                                xnVar.f43198i4 = intValue5;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id4 = messageObject5.getId();
                                    if (messageObject5.isOut() && id4 > 0 && id4 <= xnVar.f43198i4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        jm jmVar2 = xnVar.f43381x0;
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
        xnVar.X7(i10, objArr);
        xnVar.Y7(i10, objArr);
        xnVar.Z7(i10, objArr);
        xnVar.a8(i10, objArr);
        xnVar.b8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        oh.u2 u2Var = this.G1;
        if (u2Var != null && this.visibleDialog == u2Var) {
            u2Var.f29072g0.a0(false);
            this.G1.dismissInternal();
            this.G1.f29072g0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.G1 && dialog != this.Y9 && !(dialog instanceof sh.p2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e7(View view) {
        CharSequence slowModeTimer = this.V.getSlowModeTimer();
        if (slowModeTimer != null) {
            Sb(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void e8(View view) {
        f8(view, false);
    }

    public final void e9(boolean z4) {
        yb(false, null, null, null, null, null, false, z4);
    }

    public final boolean ea(String str, org.telegram.ui.Cells.t1 t1Var, CharacterStyle characterStyle, int i10, int i11) {
        org.telegram.messenger.p6 p6Var;
        boolean z4;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.f43143e == null || str == null || this.O3 != 0) {
            return false;
        }
        if (t1Var != null && (characterStyle != null || i11 != 1)) {
            p6Var = new org.telegram.messenger.p6(this, i10, i11, characterStyle, t1Var);
        } else {
            p6Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.f43143e) != null) {
                try {
                    if (Hc == null) {
                        Hc = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        Ic = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = Hc.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z4 = false;
                        try {
                            if (ChatObject.hasPublicLink(this.f43143e, matcher.group(2))) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.parseInt((CharSequence) parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.parseInt((CharSequence) parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.parseInt((CharSequence) queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = eh.i.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (ChatObject.isForum(this.f43143e) && i12 != b()) {
                                        return false;
                                    }
                                    this.f43299q7 = true;
                                    if (this.O3 == 2) {
                                        this.S8.O0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.f43360v7 = W;
                                    if (W >= 0) {
                                        this.f43374w7 = parseInt;
                                    }
                                    Xa(parseInt, i10, true, 0, false, 0, num, g10, p6Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e6) {
                            e = e6;
                            FileLog.e(e);
                            return z4;
                        }
                    } else {
                        z4 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = Ic.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.f43143e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f43138d8 = queryParameter2;
                                    O6(true);
                                    return true;
                                }
                                return z4;
                            }
                            return z4;
                        } catch (Exception e10) {
                            FileLog.e(e10);
                            return z4;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.parseInt((CharSequence) parse2.getQueryParameter("comment")).intValue();
                    if (ChatObject.hasPublicLink(this.f43143e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.O3 == 2) {
                            this.S8.O0(intValue3);
                            finishFragment();
                            return true;
                        }
                        Xa(intValue3, i10, true, 0, false, 0, null, null, p6Var);
                        return true;
                    }
                    return z4;
                } catch (Exception e11) {
                    e = e11;
                    z4 = false;
                }
            } else {
                try {
                    if (Jc == null) {
                        Jc = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = Jc.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f43143e.f20845id || parseInt3 == 0) {
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
                    byte[] g11 = eh.i.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.f43143e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.Z3;
                            if (tL_forumTopic != null && tL_forumTopic.f20897id == findTopic.f20897id) {
                                return true;
                            }
                            return false;
                        }
                        this.f43299q7 = true;
                        if (this.O3 == 2) {
                            this.S8.O0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        Xa(parseInt3, i10, true, 0, false, 0, num2, g11, p6Var);
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
            long j10 = this.f43143e.f20845id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                aa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.f43299q7 = true;
            if (this.O3 == 2) {
                this.S8.O0(intValue9);
                finishFragment();
                return true;
            }
            Xa(intValue9, i10, true, 0, false, 0, null, null, p6Var);
            return true;
        }
    }

    public final void eb(ArrayList arrayList, int i10, boolean z4, boolean z10) {
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
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.Q5, this.f43223k5, this.U3, null, this.f43199i5, z10, true, null, z4, i10, 0, this.O3, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, C8(), 0L, false, 0L, N8(), this.f43135d5);
            y6();
            jk jkVar = this.V;
            if (jkVar != null) {
                jkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.P3 == -1) {
                this.P3 = 0;
            }
            this.P3 = arrayList.size() + this.P3;
            Ec(true);
        }
    }

    public final void ec() {
        pm pmVar = this.U0;
        if (pmVar != null && this.Z9 == null) {
            if (this.f43114ba.f42179n == null || pmVar.getBackgroundImage() == null) {
                if (this.U0.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.U0.V(org.telegram.ui.ActionBar.k6.r0());
                }
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.extendActionMode(android.view.Menu):boolean");
    }

    public final boolean f7() {
        CharSequence slowModeTimer = this.V.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string;
        d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        l.d.C(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void f8(View view, boolean z4) {
        boolean z10;
        ob(view);
        if (view != this.f43170g1) {
            z10 = true;
        } else {
            z10 = false;
        }
        g8(z4, z10, 0.2f);
    }

    public final void f9(boolean z4) {
        if (this.U2.getTag() != null && !this.f43093a3) {
            if (!this.f43172g3 || this.c3) {
                this.U2.setTag(null);
                if (z4) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f43133d3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f43133d3.playTogether(ObjectAnimator.ofFloat(this.U2, View.ALPHA, 0.0f));
                    this.f43133d3.addListener(new ti(this, 6));
                    this.f43133d3.setStartDelay(this.X2);
                    this.f43133d3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f43133d3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f43133d3 = null;
                    }
                    this.U2.setAlpha(0.0f);
                }
                this.X2 = 500;
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
            presentFragment(new xn(bundle));
        }
    }

    public final re fb(MessageObject messageObject, boolean z4) {
        int i10;
        boolean z10;
        int i11;
        if (messageObject == null || messageObject.isOut() || !messageObject.isSecretMedia()) {
            return null;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message.destroyTime != 0 || (i10 = message.ttl) <= 0) {
            return null;
        }
        if (z4) {
            if (i10 != Integer.MAX_VALUE) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (i10 == Integer.MAX_VALUE) {
                i11 = 0;
            } else {
                i11 = i10;
            }
            message.destroyTime = getConnectionsManager().getCurrentTime() + i11;
            if (this.h != null) {
                getMessagesController().markMessageAsRead(this.Q5, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.Q5, messageObject.getId(), null, i11, 0L, z10);
            return null;
        }
        return new re(this, messageObject, 1);
    }

    public final void fc() {
        TLRPC.User user;
        boolean z4;
        if (this.f43144e0 != null && (user = this.f43156f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f43098a8;
            boolean z10 = false;
            if (hVar.m() != 0) {
                boolean z11 = false;
                z4 = false;
                for (int i10 = 0; i10 < hVar.m(); i10++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i10);
                    for (int i11 = 0; i11 < botInfo.commands.size(); i11++) {
                        TLRPC.BotCommand botCommand = botInfo.commands.get(i11);
                        if (botCommand.command.toLowerCase().equals("help")) {
                            z11 = true;
                        } else if (botCommand.command.toLowerCase().equals("settings")) {
                            z4 = true;
                        }
                        if (!z4 || !z11) {
                        }
                    }
                }
                z10 = z11;
            } else {
                z4 = false;
            }
            if (z10) {
                this.f43144e0.K(30);
            } else {
                this.f43144e0.r(30);
            }
            if (z4) {
                this.f43144e0.K(31);
            } else {
                this.f43144e0.r(31);
            }
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.p1 p1Var = this.N8;
        if (p1Var != null) {
            p1Var.f22220e = false;
            A7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f43143e;
    }

    public final void g7(Runnable runnable, mf.a aVar, boolean z4) {
        if (aVar != null && z4) {
            s1 s1Var = new s1(this, aVar, runnable, 19);
            mh.t7 x10 = mh.t7.x(this.currentAccount, aVar.f13651a);
            if (!x10.f14833e) {
                x10.q(true, true, s1Var);
                return;
            } else {
                s1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void g8(boolean z4, boolean z10, float f10) {
        boolean z11;
        ValueAnimator ofFloat;
        xg.g gVar;
        org.telegram.ui.Cells.t1 t1Var;
        if (f10 > 0.0f) {
            z11 = true;
        } else {
            z11 = false;
        }
        View view = this.G8;
        if (view instanceof org.telegram.ui.Cells.t1) {
            org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) view;
            t1Var2.setInvalidatesParent(z11);
            if (z11) {
                Na(t1Var2);
            }
        }
        this.U0.invalidate();
        this.f43340u0.invalidate();
        AnimatorSet animatorSet = this.M8;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.M8.cancel();
        }
        this.M8 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.E8, f10);
        float f11 = 1.0f;
        if (z11) {
            this.H8 = 1.0f;
            this.I8 = 0.0f;
            ValueAnimator valueAnimator = this.Yb;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.F8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
            if (z4) {
                org.telegram.ui.Components.im0.d(new we(this, 3));
            }
        } else {
            float f12 = this.E8;
            this.I8 = f12 / max;
            this.F8 = false;
            ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new gg(this, max, 0));
        if ((!z11 || z10) && (gVar = this.f43170g1) != null) {
            Property property = View.ALPHA;
            if (z11) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(gVar, property, f11));
        }
        this.M8.playTogether(arrayList);
        this.M8.setInterpolator(org.telegram.ui.Components.pr.h);
        this.M8.setDuration(320L);
        View view2 = this.G8;
        if (view2 instanceof org.telegram.ui.Cells.t1) {
            t1Var = (org.telegram.ui.Cells.t1) view2;
        } else {
            t1Var = null;
        }
        this.M8.addListener(new androidx.fragment.app.g(this, z11, t1Var, 4));
        if (this.G8 != null && this.H8 <= 0.0f) {
            ob(null);
        }
        this.M8.start();
    }

    public final void g9(boolean z4) {
        if (this.V2.getTag() != null && !this.f43107b3) {
            if (!this.f43185h3 || this.c3) {
                this.V2.setTag(null);
                if (z4) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43160f3, 0.0f);
                    this.f43147e3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f43147e3.addUpdateListener(new ne(this, 1));
                    this.f43147e3.addListener(new ti(this, 8));
                    this.f43147e3.setStartDelay(this.X2);
                    this.f43147e3.start();
                } else {
                    ValueAnimator valueAnimator = this.f43147e3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f43147e3 = null;
                    }
                    this.f43160f3 = 0.0f;
                    lc();
                }
                this.X2 = 500;
            }
        }
    }

    public final void ga(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f43156f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f43156f.f20992id) {
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
            presentFragment(new xn(bundle));
        }
    }

    public final void gb(int r28, android.net.Uri r29, boolean r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.gb(int, android.net.Uri, boolean):void");
    }

    public final void gc() {
        if (this.O1 == null) {
            return;
        }
        this.O1.setSideMenuBackgroundMarginBottom(((this.P.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.c());
    }

    @Override
    public final org.telegram.ui.ActionBar.b5 getBackButtonState() {
        return org.telegram.ui.ActionBar.b5.f21199a;
    }

    @Override
    public final org.telegram.ui.ActionBar.a4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.a4.f21184c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.O3 == 0 && (call = this.T7) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.O3 == 2) {
            ArrayList arrayList = this.f43311r6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + A8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.g6 getResourceProvider() {
        return this.f43114ba;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        int i10;
        if (this.f43111b7) {
            return null;
        }
        if (this.X9) {
            this.X9 = false;
            return null;
        }
        f fVar = new f(this, 4);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Qd));
        if (!A9()) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 64, null, null, null, null, org.telegram.ui.ActionBar.k6.f21983v8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1024, null, null, null, null, org.telegram.ui.ActionBar.k6.B8));
        } else {
            org.telegram.ui.ActionBar.k kVar = this.actionBar;
            int i11 = org.telegram.ui.ActionBar.k6.f22040y8;
            arrayList.add(new org.telegram.ui.ActionBar.m6(kVar, 64, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f22057z8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 128, null, null, null, null, i11));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1024, null, null, null, null, i11));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, Integer.MIN_VALUE, null, null, null, fVar, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741824, null, null, null, fVar, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1073741832, null, null, null, fVar, org.telegram.ui.ActionBar.k6.F8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 32768, null, null, null, null, org.telegram.ui.ActionBar.k6.f21932s8));
        lj ljVar = this.X0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ljVar != null ? ljVar.getTitleTextView() : null, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.A8));
        lj ljVar2 = this.X0;
        org.telegram.ui.ActionBar.l5 titleTextView = ljVar2 != null ? ljVar2.getTitleTextView() : null;
        int i12 = org.telegram.ui.ActionBar.k6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(titleTextView, 8, null, null, null, null, i12));
        lj ljVar3 = this.X0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ljVar3 != null ? ljVar3.getSubtitleTextView() : null, 262148, (Class[]) null, new Paint[]{org.telegram.ui.ActionBar.k6.f21640c2, org.telegram.ui.ActionBar.k6.f21657d2}, org.telegram.ui.ActionBar.k6.f21881pa));
        lj ljVar4 = this.X0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ljVar4 != null ? ljVar4.getSubtitleTextView() : null, 262148, (Class[]) null, (Paint[]) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 256, null, null, null, null, org.telegram.ui.ActionBar.k6.f21948t8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 134217728, null, null, null, null, org.telegram.ui.ActionBar.k6.C8));
        org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
        int i13 = org.telegram.ui.ActionBar.k6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar2, 67108864, null, null, null, null, i13));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 67108864, null, null, null, null, i13));
        org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
        int i14 = org.telegram.ui.ActionBar.k6.f22040y8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(kVar3, 512, null, null, null, null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 1048576, null, null, null, null, org.telegram.ui.ActionBar.k6.f22002w8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 2097152, null, null, null, null, org.telegram.ui.ActionBar.k6.f22021x8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.actionBar, 4194304, null, null, null, null, org.telegram.ui.ActionBar.k6.f22057z8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y0, 4, null, null, null, null, i14));
        lj ljVar5 = this.X0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ljVar5 != null ? ljVar5.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21785k4}, null, org.telegram.ui.ActionBar.k6.f21864oc));
        lj ljVar6 = this.X0;
        arrayList.add(new org.telegram.ui.ActionBar.m6(ljVar6 != null ? ljVar6.getTitleTextView() : null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21803l4}, null, org.telegram.ui.ActionBar.k6.f21883pc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.O7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.P7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.R7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.S7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.T7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.U7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21754i8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21771j8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21789k8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21807l8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21825m8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21843n8));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21861o8));
        org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.h5 h5Var2 = (org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.h5 h5Var3 = (org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.h5 h5Var4 = (org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.h5 h5Var5 = (org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.h5 h5Var6 = (org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgOutMediaSelected");
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, new Drawable[]{h5Var, h5Var2}, null, org.telegram.ui.ActionBar.k6.f21918ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{(org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgInSelected"), (org.telegram.ui.ActionBar.h5) getThemedDrawable("drawableMsgInMediaSelected")}, null, org.telegram.ui.ActionBar.k6.f21667dc));
        if (h5Var != null) {
            Drawable[] k10 = h5Var.k();
            int i15 = org.telegram.ui.ActionBar.k6.f21949ta;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k10, null, i15));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, h5Var2.k(), null, i15));
            Drawable[] k11 = h5Var3.k();
            int i16 = org.telegram.ui.ActionBar.k6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, k11, null, i16));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, h5Var4.k(), null, i16));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{h5Var3, h5Var4}, null, org.telegram.ui.ActionBar.k6.Aa));
        if (this.f43114ba.h(false)) {
            i10 = 1;
        } else {
            i10 = 1;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{h5Var3, h5Var4}, null, org.telegram.ui.ActionBar.k6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{h5Var3, h5Var4}, null, org.telegram.ui.ActionBar.k6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{h5Var3, h5Var4}, null, org.telegram.ui.ActionBar.k6.Fa));
        }
        qj qjVar = this.f43340u0;
        Class[] clsArr = new Class[i10];
        clsArr[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr = new Drawable[2];
        drawableArr[0] = h5Var5;
        drawableArr[i10] = h5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(qjVar, 0, clsArr, null, drawableArr, null, org.telegram.ui.ActionBar.k6.Ba));
        qj qjVar2 = this.f43340u0;
        Class[] clsArr2 = new Class[i10];
        clsArr2[0] = org.telegram.ui.Cells.t1.class;
        Drawable[] drawableArr2 = new Drawable[2];
        drawableArr2[0] = h5Var5;
        drawableArr2[i10] = h5Var6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(qjVar2, 0, clsArr2, null, drawableArr2, null, org.telegram.ui.ActionBar.k6.f21631bc));
        qj qjVar3 = this.f43340u0;
        Class[] clsArr3 = new Class[i10];
        clsArr3[0] = org.telegram.ui.Cells.v0.class;
        Paint themedPaint = getThemedPaint("paintChatActionText");
        int i17 = org.telegram.ui.ActionBar.k6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.m6(qjVar3, 4, clsArr3, themedPaint, null, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 2, new Class[]{org.telegram.ui.Cells.v0.class}, getThemedPaint("paintChatActionText"), null, null, org.telegram.ui.ActionBar.k6.jc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21998w4, getThemedDrawable("drawableShareIcon"), getThemedDrawable("drawableReplyIcon"), getThemedDrawable("drawableBotInline"), getThemedDrawable("drawableBotLink"), getThemedDrawable("drawableBotLock"), getThemedDrawable("drawable_botInvite"), getThemedDrawable("drawableGoIcon"), getThemedDrawable("drawableCommentSticker")}, null, org.telegram.ui.ActionBar.k6.f21793kc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21811lc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.v0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21828mc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21685ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21703fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 2, new Class[]{org.telegram.ui.Cells.t1.class, org.telegram.ui.Cells.h0.class}, (Paint[]) null, org.telegram.ui.ActionBar.k6.f21722gc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 2, new Class[]{org.telegram.ui.Cells.t1.class}, (Paint[]) null, org.telegram.ui.ActionBar.k6.f21739hc));
        Drawable[] drawableArr3 = {org.telegram.ui.ActionBar.k6.f21731h3};
        int i18 = org.telegram.ui.ActionBar.k6.f21794kd;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr3, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheck")}, null, org.telegram.ui.ActionBar.k6.Ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckSelected")}, null, org.telegram.ui.ActionBar.k6.Ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckRead"), getThemedDrawable("drawableMsgOutHalfCheck")}, null, org.telegram.ui.ActionBar.k6.La));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCheckReadSelected"), getThemedDrawable("drawableMsgOutHalfCheckSelected")}, null, org.telegram.ui.ActionBar.k6.Ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Na));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Oa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21901qc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21920rc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.F3, org.telegram.ui.ActionBar.k6.G3}, null, org.telegram.ui.ActionBar.k6.f21934sc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgStickerHalfCheck"), getThemedDrawable("drawableMsgStickerCheck"), getThemedDrawable("drawableMsgStickerClock"), getThemedDrawable("drawableMsgStickerViews"), getThemedDrawable("drawableMsgStickerReplies"), getThemedDrawable("drawableMsgStickerPinned")}, null, i17));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21951tc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViews"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinned")}, null, org.telegram.ui.ActionBar.k6.Ra));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutViewsSelected"), getThemedDrawable("drawableMsgOutReplies"), getThemedDrawable("drawableMsgOutPinnedSelected")}, null, org.telegram.ui.ActionBar.k6.Sa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.M3, org.telegram.ui.ActionBar.k6.Q3, org.telegram.ui.ActionBar.k6.U3}, null, org.telegram.ui.ActionBar.k6.f22025xc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.N3, org.telegram.ui.ActionBar.k6.R3, org.telegram.ui.ActionBar.k6.V3}, null, org.telegram.ui.ActionBar.k6.f22044yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21604a4, org.telegram.ui.ActionBar.k6.f21623b4, org.telegram.ui.ActionBar.k6.Z3}, null, org.telegram.ui.ActionBar.k6.f22059zc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenu")}, null, org.telegram.ui.ActionBar.k6.Ta));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutMenuSelected")}, null, org.telegram.ui.ActionBar.k6.Ua));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21641c4}, null, org.telegram.ui.ActionBar.k6.Ac));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21659d4}, null, org.telegram.ui.ActionBar.k6.Bc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21714g4}, null, org.telegram.ui.ActionBar.k6.Cc));
        Drawable[] drawableArr4 = {getThemedDrawable("drawableMsgOutInstant")};
        int i19 = org.telegram.ui.ActionBar.k6.Va;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr4, null, i19));
        Drawable[] drawableArr5 = {org.telegram.ui.ActionBar.k6.f21732h4, org.telegram.ui.ActionBar.k6.B4, org.telegram.ui.ActionBar.k6.D4};
        int i20 = org.telegram.ui.ActionBar.k6.Dc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, drawableArr5, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudio"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{getThemedDrawable("drawableMsgOutCallAudioSelected"), getThemedDrawable("drawableMsgOutCallVideo")}, null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.G4, null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, org.telegram.ui.ActionBar.k6.H4, null, org.telegram.ui.ActionBar.k6.Ec));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.O4}, null, org.telegram.ui.ActionBar.k6.Ia));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.P4}, null, org.telegram.ui.ActionBar.k6.f21915r7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.Q4}, null, org.telegram.ui.ActionBar.k6.f21900qa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.f21621b2, null, null, org.telegram.ui.ActionBar.k6.Fc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21767j4}, null, org.telegram.ui.ActionBar.k6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, fVar, org.telegram.ui.ActionBar.k6.Hc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.J2, null, null, org.telegram.ui.ActionBar.k6.Ic));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.K2, null, null, org.telegram.ui.ActionBar.k6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Xa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.T1, null, null, org.telegram.ui.ActionBar.k6.Lc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Mc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatBotButton"), null, null, org.telegram.ui.ActionBar.k6.Nc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, getThemedPaint("paintChatTimeBackground"), null, null, org.telegram.ui.ActionBar.k6.f22006wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Oc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ya));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Zb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Qc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Za));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Rc));
        int i21 = org.telegram.ui.ActionBar.k6.Uc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i21));
        int i22 = org.telegram.ui.ActionBar.k6.f21611ab;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Vc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21648cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Xc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Yc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21666db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Zc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21684eb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21613ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21702fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21632bd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21650cd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21721gb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21668dd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21738hb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21686ed));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21757ib));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21704fd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21723gd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21774jb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21792kb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21740hd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21758id));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.qb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21775jd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21919rb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21847nd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21865od));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21812ld));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21829md));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21863ob));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21882pb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21846nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21884pd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21902qd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21810lb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21827mb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.rd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21950tb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21935sd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21968ub));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21952td));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21986vb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21970ud));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22005wb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22007wd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22043yb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22026xd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21988vd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.zb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22024xb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22045yd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ab));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.zd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Bb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ad));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Cb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Bd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Db));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Cd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Eb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Dd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ed));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Gb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Fd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Gd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ib));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Hd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Jb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Id));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Jd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Lb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.U1, null, null, org.telegram.ui.ActionBar.k6.Ld));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.V1, null, null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, org.telegram.ui.ActionBar.k6.W1, null, null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Nb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Pa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Ob));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.Qa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21759ie));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21969uc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21776je));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21987vc));
        Drawable[] drawableArr6 = org.telegram.ui.ActionBar.k6.T4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.k6.f21921re));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[0]}, null, org.telegram.ui.ActionBar.k6.f21936se));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 32, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr6[1]}, null, org.telegram.ui.ActionBar.k6.Rb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21885pe));
        Drawable[] drawableArr7 = org.telegram.ui.ActionBar.k6.S4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[0]}, null, org.telegram.ui.ActionBar.k6.f21903qe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr7[1]}, null, org.telegram.ui.ActionBar.k6.Pb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21683ea));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.fa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21720ga));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21737ha));
        Drawable[] drawableArr8 = org.telegram.ui.ActionBar.k6.M4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[0]}, null, org.telegram.ui.ActionBar.k6.Kc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr8[1]}, null, org.telegram.ui.ActionBar.k6.Xa));
        Drawable[] drawableArr9 = org.telegram.ui.ActionBar.k6.N4;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[0]}, null, org.telegram.ui.ActionBar.k6.f22025xc));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 0, new Class[]{org.telegram.ui.Cells.t1.class}, null, new Drawable[]{drawableArr9[1]}, null, org.telegram.ui.ActionBar.k6.Ra));
        if (!this.f43114ba.h(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.k6.f21908r0, null, org.telegram.ui.ActionBar.k6.J7));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.f21994w0, null, null, org.telegram.ui.ActionBar.k6.U8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.k6.B0[0], org.telegram.ui.ActionBar.k6.B0[1], org.telegram.ui.ActionBar.k6.D0}, null, null, org.telegram.ui.ActionBar.k6.X8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Paint[]{org.telegram.ui.ActionBar.k6.C0[0], org.telegram.ui.ActionBar.k6.C0[1], org.telegram.ui.ActionBar.k6.E0}, null, null, org.telegram.ui.ActionBar.k6.Z8));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21602a1}, null, org.telegram.ui.ActionBar.k6.f21609a9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21711g1, org.telegram.ui.ActionBar.k6.f21729h1}, null, org.telegram.ui.ActionBar.k6.f21772j9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.F0[1], null, null, org.telegram.ui.ActionBar.k6.f21755i9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.G0, null, null, org.telegram.ui.ActionBar.k6.m9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21790k9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21862o9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, org.telegram.ui.ActionBar.k6.H0, null, null, org.telegram.ui.ActionBar.k6.f21880p9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, org.telegram.ui.ActionBar.k6.I0, null, null, org.telegram.ui.ActionBar.k6.f21899q9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.T0}, null, org.telegram.ui.ActionBar.k6.f21966u9));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.I3, 0, new Class[]{org.telegram.ui.Cells.r2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.V0, org.telegram.ui.ActionBar.k6.W0}, null, org.telegram.ui.ActionBar.k6.f21984v9));
        }
        bk bkVar = this.F1;
        Paint themedPaint2 = getThemedPaint("paintChatComposeBackground");
        int i23 = org.telegram.ui.ActionBar.k6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.m6(bkVar, 0, null, themedPaint2, null, null, i23));
        bk bkVar2 = this.F1;
        Drawable[] drawableArr10 = {org.telegram.ui.ActionBar.k6.f21749i3};
        int i24 = org.telegram.ui.ActionBar.k6.Td;
        arrayList.add(new org.telegram.ui.ActionBar.m6(bkVar2, 0, null, null, drawableArr10, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21766j3}, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O2, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O2, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21749i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.O, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21749i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, null, getThemedPaint("paintChatComposeBackground"), null, null, i23));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21749i3}, null, i24));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 4, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.k6.Ud));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 16777216, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.k6.Wd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, null, null, null, org.telegram.ui.ActionBar.k6.Xk));
        int i25 = org.telegram.ui.ActionBar.k6.Yd;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, null, i25));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"sendButton"}, null, null, 24, null, i25));
        int i26 = org.telegram.ui.ActionBar.k6.Wk;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i26));
        int i27 = org.telegram.ui.ActionBar.k6.f21752i6;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"botButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 40, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i26));
        int i28 = org.telegram.ui.ActionBar.k6.f21777jf;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"scheduledButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"attachButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i26));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"suggestButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"notifyButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"videoTimelineView"}, null, null, null, i25));
        int i29 = org.telegram.ui.ActionBar.k6.f21634bf;
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"micDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"cameraDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"sendDrawable"}, null, null, null, i29));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21614ae));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"lockShadowDrawable"}, null, null, null, org.telegram.ui.ActionBar.k6.f21633be));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"recordDeleteImageView"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, null, null, null, org.telegram.ui.ActionBar.k6.f21796kf));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21849nf));
        jk jkVar = this.V;
        int i30 = org.telegram.ui.ActionBar.k6.f21831mf;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, null, null, null, null, i30));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, org.telegram.ui.ActionBar.k6.f21867of));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 196608, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, null, null, null, i27));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"redDotPaint"}, null, null, null, i28));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, null, null, null, org.telegram.ui.ActionBar.k6.f21652cf));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"dotPaint"}, null, null, null, org.telegram.ui.ActionBar.k6.f21615af));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V, 0, new Class[]{ChatActivityEnterView.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21706ff));
        jk jkVar2 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar2 != null ? jkVar2.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.He));
        jk jkVar3 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar3 != null ? jkVar3.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Ke));
        jk jkVar4 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar4 != null ? jkVar4.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Le));
        jk jkVar5 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar5 != null ? jkVar5.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Me));
        jk jkVar6 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar6 != null ? jkVar6.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Oe));
        jk jkVar7 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar7 != null ? jkVar7.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Pe));
        jk jkVar8 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar8 != null ? jkVar8.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Re));
        jk jkVar9 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar9 != null ? jkVar9.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Se));
        jk jkVar10 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar10 != null ? jkVar10.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.We));
        jk jkVar11 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar11 != null ? jkVar11.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Ne));
        jk jkVar12 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar12 != null ? jkVar12.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Je));
        jk jkVar13 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar13 != null ? jkVar13.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Ue));
        jk jkVar14 = this.V;
        arrayList.add(new org.telegram.ui.ActionBar.m6(jkVar14 != null ? jkVar14.getEmojiView() : null, 0, new Class[]{org.telegram.ui.Components.mz.class}, null, null, null, fVar, org.telegram.ui.ActionBar.k6.Qe));
        jk jkVar15 = this.V;
        if (jkVar15 != null) {
            org.telegram.ui.Components.p41 trendingStickersAlert = jkVar15.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, new Drawable[]{this.V.getStickersArrowDrawable()}, null, i26));
        }
        int i31 = 0;
        while (i31 < 2) {
            View view = i31 == 0 ? this.f43356v3 : this.f43370w3;
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 32, null, null, null, null, org.telegram.ui.ActionBar.k6.Fi));
            int i32 = org.telegram.ui.ActionBar.k6.Gi;
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 0, new Class[]{UndoView.class}, new String[]{"undoImageView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 0, new Class[]{UndoView.class}, new String[]{"undoTextView"}, null, null, null, i32));
            int i33 = org.telegram.ui.ActionBar.k6.Hi;
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 0, new Class[]{UndoView.class}, new String[]{"infoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 0, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 2, new Class[]{UndoView.class}, new String[]{"subinfoTextView"}, null, null, null, i32));
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 0, new Class[]{UndoView.class}, new String[]{"textPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 0, new Class[]{UndoView.class}, new String[]{"progressPaint"}, null, null, null, i33));
            arrayList.add(new org.telegram.ui.ActionBar.m6(view, 8, new Class[]{UndoView.class}, new String[]{"leftImageView"}, null, null, null, i33));
            i31++;
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.k6.f21982v7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"playButton"}, null, null, null, org.telegram.ui.ActionBar.k6.f22001w7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.k6.f21964u7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.k6.f21947t7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, null, null, null, org.telegram.ui.ActionBar.k6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 8, new Class[]{FragmentContextView.class}, new String[]{"closeButton"}, null, null, null, org.telegram.ui.ActionBar.k6.f22020x7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, null, null, null, org.telegram.ui.ActionBar.k6.f22039y7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43369w2, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21687ee));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43369w2, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21661d6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.C2, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21705fe));
        for (int i34 = 0; i34 < 2; i34++) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43410z2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21705fe));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.A2[i34], 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21724ge));
        }
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.M2, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21705fe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.N2, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f21724ge));
        ImageView imageView = this.G2;
        int i35 = org.telegram.ui.ActionBar.k6.f21669de;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.I2, 8, null, null, null, null, i35));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.R1, 8, null, null, null, null, i35));
        TextView textView = this.I1;
        int i36 = org.telegram.ui.ActionBar.k6.f21741he;
        arrayList.add(new org.telegram.ui.ActionBar.m6(textView, 4, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K1, 262148, null, null, null, null, org.telegram.ui.ActionBar.k6.f21897q7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.K1, 262148, null, null, null, null, i36));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.E1, 8, null, null, null, null, org.telegram.ui.ActionBar.k6.Wk));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21989ve));
        ImageView imageView2 = this.P2;
        int i37 = org.telegram.ui.ActionBar.k6.f22027xe;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView2, 8, null, null, null, null, i37));
        ImageView imageView3 = this.P2;
        int i38 = org.telegram.ui.ActionBar.k6.f22057z8;
        arrayList.add(new org.telegram.ui.ActionBar.m6(imageView3, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q2, 8, null, null, null, null, i37));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Q2, 65568, null, null, null, null, i38));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.B0, 4, null, null, null, null, org.telegram.ui.ActionBar.k6.f22060ze));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43395y0, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43395y0, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21953tf));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43395y0, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.D0, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Sh));
        org.telegram.ui.Components.bo boVar = this.V0;
        int i39 = org.telegram.ui.ActionBar.k6.ic;
        arrayList.add(new org.telegram.ui.ActionBar.m6(boVar, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y1, 4, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.m0, 2048, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 131072, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"backgroundLayout"}, null, null, null, org.telegram.ui.ActionBar.k6.Fe));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 8, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"imageView"}, null, null, null, org.telegram.ui.ActionBar.k6.De));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43340u0, 4, new Class[]{org.telegram.ui.Cells.v1.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.k6.Ee));
        fg.i0 i0Var = this.N;
        int i40 = org.telegram.ui.ActionBar.k6.f21811lc;
        arrayList.add(new org.telegram.ui.ActionBar.m6(i0Var, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.Y1, 536870912, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.V0, 536870912, null, null, null, null, i40));
        if (this.F1 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 4, new Class[]{org.telegram.ui.Cells.i0.class}, new String[]{"textView"}, null, null, null, org.telegram.ui.ActionBar.k6.Ce));
            int i41 = org.telegram.ui.ActionBar.k6.G6;
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"nameTextView"}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 4, new Class[]{org.telegram.ui.Cells.h5.class}, new String[]{"usernameTextView"}, null, null, null, org.telegram.ui.ActionBar.k6.A6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, new Drawable[]{org.telegram.ui.ActionBar.k6.f21821m4, org.telegram.ui.ActionBar.k6.f21839n4, org.telegram.ui.ActionBar.k6.f21857o4}, null, org.telegram.ui.ActionBar.k6.Ge));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.k6.f22055z6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.k6.J6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, i41));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21758id));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21775jd));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.F1.getListView(), 0, new Class[]{org.telegram.ui.Cells.e2.class}, null, null, null, org.telegram.ui.ActionBar.k6.f21662d7));
        }
        org.telegram.ui.Components.m40 m40Var = this.f43106b2;
        int i42 = org.telegram.ui.ActionBar.k6.f21904qf;
        arrayList.add(new org.telegram.ui.ActionBar.m6(m40Var, 32, null, null, null, null, i42));
        org.telegram.ui.Components.m40 m40Var2 = this.f43106b2;
        int i43 = org.telegram.ui.ActionBar.k6.f21886pf;
        arrayList.add(new org.telegram.ui.ActionBar.m6(m40Var2, 4, null, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43294q2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43294q2, 8, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"imageView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43294q2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43307r2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"textView"}, null, null, null, i43));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.f43307r2, 4, new Class[]{org.telegram.ui.Components.m40.class}, new String[]{"arrowImageView"}, null, null, null, i42));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.U2, 0, null, null, null, null, i40));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.W2, 0, null, null, null, null, i39));
        arrayList.add(new org.telegram.ui.ActionBar.m6(this.W2, 0, null, null, null, null, i40));
        int i44 = org.telegram.ui.ActionBar.k6.f21756ia;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21773ja));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21791ka));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21809la));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21826ma));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21845na));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, i44));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.oa));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, new Drawable[]{org.telegram.ui.ActionBar.k6.R4}, null, org.telegram.ui.ActionBar.k6.f21665da));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.X9));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21733h5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21751i5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f21895q5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.A5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.K5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.I5));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21787k6));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21972uf));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21990vf));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21617ah));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21636bh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21654ch));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21672dh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21690eh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21708fh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21761ih));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21779jh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21798kh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21727gh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21744hh));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.f21607a7));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, org.telegram.ui.ActionBar.k6.Dj));
        int i45 = org.telegram.ui.ActionBar.k6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, null, i45));
        arrayList.add(new org.telegram.ui.ActionBar.m6(null, 0, null, null, null, fVar, org.telegram.ui.ActionBar.k6.f22028xf));
        jk jkVar16 = this.V;
        if (jkVar16 != null && jkVar16.f24628j0 != null) {
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.V.f24628j0.f47773c, 4, new Class[]{sh.x.class}, new String[]{"description"}, null, null, null, org.telegram.ui.ActionBar.k6.G6));
            arrayList.add(new org.telegram.ui.ActionBar.m6(this.V.f24628j0.f47773c, 4, new Class[]{sh.x.class}, new String[]{"command"}, null, null, null, org.telegram.ui.ActionBar.k6.f22038y6));
        }
        kh.e eVar = this.f43127ca;
        if (eVar != null) {
            eVar.b(arrayList);
        }
        int size = arrayList.size();
        int i46 = 0;
        while (i46 < size) {
            Object obj = arrayList.get(i46);
            i46++;
            ((org.telegram.ui.ActionBar.m6) obj).f22153o = this.f43114ba;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f43114ba.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint F = this.f43114ba.F(str);
        if (F != null) {
            return F;
        }
        return org.telegram.ui.ActionBar.k6.S0(str);
    }

    public final void h7() {
        if (this.f43370w3 != null) {
            return;
        }
        gl glVar = new gl(this, getParentActivity(), this, this.f43114ba);
        this.f43370w3 = glVar;
        this.U0.addView(glVar, 17, k7.c6.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void h8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void h9(boolean z4) {
        if (!z4) {
            org.telegram.ui.Components.m40 m40Var = this.f43208j2;
            if (m40Var != null) {
                m40Var.b(true);
            }
            ej ejVar = this.f43132d2;
            if (ejVar != null) {
                ejVar.b(true);
            }
            org.telegram.ui.Components.m40 m40Var2 = this.f43159f2;
            if (m40Var2 != null) {
                m40Var2.b(true);
            }
        }
        org.telegram.ui.Components.m40 m40Var3 = this.f43196i2;
        if (m40Var3 != null) {
            m40Var3.b(true);
        }
        org.telegram.ui.Components.m40 m40Var4 = this.f43184h2;
        if (m40Var4 != null) {
            m40Var4.b(true);
        }
        org.telegram.ui.Components.m40 m40Var5 = this.f43294q2;
        if (m40Var5 != null) {
            m40Var5.b(true);
        }
        org.telegram.ui.Components.m40 m40Var6 = this.f43307r2;
        if (m40Var6 != null) {
            m40Var6.b(true);
        }
        org.telegram.ui.Components.m40 m40Var7 = this.f43220k2;
        if (m40Var7 != null) {
            m40Var7.b(true);
        }
        org.telegram.ui.Components.m40 m40Var8 = this.f43232l2;
        if (m40Var8 != null) {
            m40Var8.b(true);
        }
        org.telegram.ui.Components.qp qpVar = this.f43321s2;
        if (qpVar != null) {
            qpVar.a();
        }
        qh.e3 e3Var = this.G0;
        if (e3Var != null) {
            e3Var.e(true);
        }
        qh.e3 e3Var2 = this.I0;
        if (e3Var2 != null) {
            e3Var2.e(true);
        }
        qh.e3 e3Var3 = this.H0;
        if (e3Var3 != null) {
            e3Var3.e(true);
        }
    }

    public final void ha(org.telegram.ui.Cells.t1 t1Var, MessageObject messageObject) {
        long j10;
        long j11;
        org.telegram.ui.Components.y5 animation;
        Bitmap m9;
        if (t1Var == null) {
            int childCount = this.f43340u0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 >= childCount) {
                    break;
                }
                View childAt = this.f43340u0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    org.telegram.ui.Cells.t1 t1Var2 = (org.telegram.ui.Cells.t1) childAt;
                    if (t1Var2.getMessageObject().equals(messageObject)) {
                        t1Var = t1Var2;
                        break;
                    }
                }
                i10++;
            }
        }
        if (messageObject.isVideo()) {
            fb(messageObject, true);
        }
        PhotoViewer.t1().K2(null, this, this.f43114ba);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (t1Var != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = t1Var.getPhotoImage().getAnimation()) != null && this.f43336t8 != null && this.f43300q8.getTag() != null && (m9 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.f43336t8.getBitmap(m9.getWidth(), m9.getHeight());
                    new Canvas(m9).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.O3;
        nl nlVar = this.Ca;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.t1().f34298i4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.f43311r6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.t1().a2(arrayList, arrayList.indexOf(messageObject), this.Q5, 0L, b(), nlVar);
        } else {
            PhotoViewer t12 = PhotoViewer.t1();
            int i13 = messageObject.type;
            long j12 = 0;
            if (i13 != 0) {
                j10 = this.Q5;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = this.I6;
            } else {
                j11 = 0;
            }
            if (i13 != 0) {
                j12 = b();
            }
            t12.c2(messageObject, this, j10, j11, j12, nlVar);
        }
        h9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void hb(MessageObject messageObject, org.telegram.ui.Cells.t1 t1Var, int i10, boolean z4) {
        boolean z10;
        MessageObject.GroupedMessages X8 = X8(messageObject);
        boolean z11 = false;
        if (X8 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < X8.messages.size()) {
                    if (this.T5[i10].indexOfKey(X8.messages.get(i11).getId()) < 0) {
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
            z10 = true;
        } else {
            z10 = false;
        }
        t1Var.setDrawSelectionBackground(z10);
        if (X8 == null) {
            z11 = true;
        }
        t1Var.L3(true, z11, z4);
    }

    public final void hc(boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.hc(boolean):void");
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.U3;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.f43143e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f43156f;
    }

    public final void i7(boolean z4) {
        long j10;
        if (System.currentTimeMillis() - this.Eb > 1000) {
            z4 = true;
        }
        ng ngVar = this.Fb;
        AndroidUtilities.cancelRunOnUIThread(ngVar);
        if (z4) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        AndroidUtilities.runOnUIThread(ngVar, j10);
    }

    public final void i8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.f43247m5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void i9() {
        ValueAnimator valueAnimator = this.f43141db;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.v0 v0Var = this.W2;
        if (v0Var != null && v0Var.getTag() != null) {
            this.W2.setTag(null);
            org.telegram.ui.Cells.v0 v0Var2 = this.W2;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ef(this, v0Var2, 1));
            ofFloat.addListener(new eg.w2(10, this, v0Var2));
            ofFloat.setDuration(150L);
            this.f43141db = ofFloat;
            ofFloat.start();
        }
    }

    public final void ia(boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var;
        int i10;
        if (getParentActivity() != null && (f5Var = this.parentLayout) != null && f5Var.getLastFragment() == this && !this.E4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f43143e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f20845id);
            } else {
                bundle.putLong("user_id", this.f43156f.f20992id);
            }
            bundle.putInt("chatMode", 2);
            xn xnVar = new xn(bundle);
            xnVar.E4 = new ArrayList(this.E4);
            xnVar.G4 = new HashMap(this.G4);
            int size = this.E4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.E4.get(i11);
                MessageObject messageObject = (MessageObject) this.G4.get(num);
                MessageObject messageObject2 = (MessageObject) this.f43236l6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    xnVar.G4.put(num, messageObject);
                    xnVar.zc();
                }
            }
            xnVar.M4 = this.M4;
            if (this.f43148e4) {
                i10 = this.E4.size();
            } else {
                i10 = this.N4;
            }
            xnVar.N4 = i10;
            xnVar.P4 = this.P4;
            xnVar.X7 = this.X7;
            xnVar.W7 = this.W7;
            xnVar.S8 = new kl(this, xnVar);
            if (z4) {
                presentFragmentAsPreview(xnVar);
                d7();
                return;
            }
            presentFragment(xnVar, false);
        }
    }

    public final void ib(TLRPC.ChatTheme chatTheme) {
        boolean z4;
        boolean z10;
        if (this.f43114ba != null && this.Z9 == null) {
            tf.b c3 = tf.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.Q5, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.f4 theme = chatThemeController.getTheme(c3);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.f4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.l();
                    theme.n(this.currentAccount);
                }
                org.telegram.ui.ActionBar.f4 f4Var = theme;
                vn vnVar = this.f43114ba;
                TLRPC.WallPaper wallPaper = vnVar.h;
                if (this.M5 != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                vnVar.i(f4Var, wallPaper, z10, null, false);
                return;
            }
            if (c3 != null && !c3.b()) {
                chatThemeController.requestChatTheme(c3, new te(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.Q5);
            vn vnVar2 = this.f43114ba;
            org.telegram.ui.ActionBar.f4 f4Var2 = vnVar2.f42178f;
            if (this.M5 != 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            vnVar2.i(f4Var2, dialogWallpaper, z4, null, false);
        }
    }

    public final void ic() {
        hc(false);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z4;
        int w02;
        if (A9()) {
            org.telegram.ui.ActionBar.g6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                w02 = resourceProvider.e0(org.telegram.ui.ActionBar.k6.f22002w8);
            } else {
                w02 = org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.f22002w8, true);
            }
            if (i0.a.f(w02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z4 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            z4 = this.Ab;
        }
        return !z4;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.O3 != 5 || (!this.f43311r6.isEmpty() && this.f43094a4 != 0)) && !this.f43365vc.f50542f && this.f43227k9) {
            fl flVar = this.Ba;
            if (flVar == null || !flVar.f33460s) {
                ih.k kVar = this.U9;
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
    public final void j(int i10, int i11, boolean z4, int i12, boolean z10, int i13) {
        Xa(i10, i11, z4, i12, z10, i13, null, null, null);
    }

    public final void j7() {
        int W8 = (int) (W8(org.telegram.ui.Components.s21.f30977c) + this.P.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.U.setFadeZoneBottom(W8);
        int b10 = k7.o.b(AndroidUtilities.dp(36.0f) + (this.U0.getMeasuredHeight() - W8), 0, this.U0.getMeasuredHeight());
        int measuredWidth = this.U0.getMeasuredWidth();
        Rect rect = Mc;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.f43377wa, this.f43340u0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f43340u0.getMeasuredHeight() - this.f43391xa) - W8));
    }

    public final void j8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f43135d5;
        if (messageSuggestionParams != null) {
            Db(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.D5;
        if (webPage != null) {
            Eb(true, webPage, false);
            return;
        }
        nn nnVar = this.f43199i5;
        if (nnVar != null) {
            Cb(this.f43223k5, nnVar);
            return;
        }
        MessageObject messageObject = this.f43223k5;
        if (messageObject != null && messageObject != this.U3) {
            Bb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f43122c5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Ab(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.f43247m5;
        if (messageObject2 != null) {
            yb(true, null, messageObject2, null, null, null, false, true);
        } else {
            Eb(false, null, true);
        }
    }

    public final boolean j9(boolean z4) {
        hl hlVar;
        hl hlVar2 = this.f43342u2;
        if (hlVar2 == null || hlVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.sg sgVar = this.J0;
        if (sgVar != null && (hlVar = this.f43342u2) != null) {
            sgVar.i(hlVar, false, z4);
        }
        int i10 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.E2;
            if (i10 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i10] = null;
                }
                i10++;
            } else {
                this.f43383x2 = false;
                this.f43342u2.setTag(1);
                return true;
            }
        }
    }

    public final void ja(int i10, boolean z4) {
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && f5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f20853id);
            } else {
                TLRPC.Chat chat = this.f43143e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f20845id);
                } else {
                    bundle.putLong("user_id", this.f43156f.f20992id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z4) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            xn xnVar = new xn(bundle);
            if (this.f43148e4) {
                bg.e.a(xnVar, MessagesStorage.TopicKey.of(a(), b()));
            }
            xnVar.S8 = new mj(this);
            presentFragment(xnVar, false);
        }
    }

    public final void jb(View view, boolean z4) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                jb(viewGroup.getChildAt(i10), z4);
            }
        }
        if (view != this.f43340u0 && view != this.U0) {
            view.setEnabled(z4);
        }
    }

    public final void jc() {
        int i10;
        org.telegram.ui.Components.nb nbVar;
        wk wkVar;
        jk jkVar;
        if (this.A9 && this.f43340u0 != null) {
            float f10 = 0.0f;
            if (this.f43251ma <= 0 || this.Aa != 0.0f) {
                float V8 = V8(AndroidUtilities.dp(7.0f));
                vk vkVar = this.l1;
                if (vkVar != null) {
                    i10 = AndroidUtilities.dp(vkVar.B * 35.0f);
                } else {
                    i10 = 0;
                }
                float z82 = (z8() * AndroidUtilities.dp(43.0f)) + V8 + i10;
                float f11 = this.f43288p9;
                this.f43301q9 = z82;
                this.f43288p9 = W8(org.telegram.ui.Components.s21.f30975a) + AndroidUtilities.dp(4.0f) + this.s9 + z82;
                if (this.actionBar.getVisibility() == 0 || this.f43100aa != null) {
                    this.f43288p9 += this.actionBar.getMeasuredHeight();
                }
                this.f43314r9 = 0;
                this.f43288p9 = this.f43288p9 + this.f43377wa + this.t9;
                if (this.Aa != 0.0f && (jkVar = this.V) != null && jkVar.getVisibility() == 0) {
                    float f12 = this.f43288p9;
                    float measuredHeight = this.Aa * (this.V.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.f43288p9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.v0 v0Var = this.W2;
                if (v0Var != null) {
                    v0Var.setTranslationY(((this.f43340u0.getTranslationY() + this.f43288p9) + this.f43390x9) - AndroidUtilities.dp(30.0f));
                    float f13 = this.f43288p9;
                    float f14 = this.f43390x9;
                    this.f43288p9 = f13 + f14;
                    this.f43314r9 = (int) (this.f43314r9 + f14);
                }
                zj zjVar = this.U2;
                if (zjVar != null) {
                    zjVar.setTranslationY((((this.f43340u0.getTranslationY() - f10) + this.f43288p9) + this.f43362v9) - AndroidUtilities.dp(4.0f));
                }
                lc();
                qj qjVar = this.f43340u0;
                if (qjVar != null && this.f43367w0 != null && this.f43381x0 != null) {
                    int paddingTop = qjVar.getPaddingTop();
                    int paddingBottom = this.f43340u0.getPaddingBottom();
                    n7();
                    if (this.f43340u0.getPaddingTop() != paddingTop || this.f43340u0.getPaddingBottom() != paddingBottom) {
                        r9();
                        q9(2);
                    }
                    this.f43340u0.setTopGlowOffset((int) ((this.f43288p9 - this.f43314r9) - AndroidUtilities.dp(4.0f)));
                    if (f11 != this.f43288p9) {
                        int childCount = this.f43340u0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f43340u0.getChildAt(i11);
                            this.f43340u0.getClass();
                            if (RecyclerView.R(childAt) == this.f43381x0.h() - 1) {
                                float f15 = this.f43288p9;
                                if (childAt.getTop() > f15) {
                                    this.f43340u0.scrollBy(0, (int) (childAt.getTop() - f15));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!F9() && !this.A4 && this.G7 != null && this.f43340u0 != null && ((wkVar = this.M1) == null || wkVar.getVisibility() != 0)) {
                        this.f43340u0.scrollBy(0, (int) (f11 - this.f43288p9));
                    }
                }
                this.A9 = false;
                org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27770w;
                if (icVar != null && (nbVar = icVar.f27774e) != null) {
                    nbVar.updatePosition();
                }
                n7();
            }
        }
    }

    public final void k7() {
        int i10;
        if (this.X0 != null) {
            float actionModeFactor = (1.0f - this.f43379wc.f50541e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.X0.setScaleX(lerp);
            this.X0.setScaleY(lerp);
            this.X0.setAlpha(actionModeFactor);
            lj ljVar = this.X0;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ljVar.setVisibility(i10);
        }
    }

    public final void k9() {
        al alVar = this.Ya;
        if (alVar == null) {
            return;
        }
        this.Ya = null;
        alVar.e();
        if (alVar.getReactionsWindow() != null && alVar.getReactionsWindow().f16035a != null) {
            alVar.getReactionsWindow().f16035a.animate().alpha(0.0f).setDuration(180L).start();
        }
        alVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new xc(19, this, alVar)).setDuration(180L).start();
    }

    public final void ka(TLRPC.Chat chat) {
        boolean z4;
        qh.e3 e3Var = this.f43320s1;
        if (e3Var != null && e3Var.S) {
            e3Var.e(true);
            z4 = true;
        } else {
            z4 = false;
        }
        qh.e3 e3Var2 = this.f43330t1;
        if (e3Var2 != null && e3Var2.S) {
            e3Var2.e(true);
            z4 = true;
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new xc(13, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f21548k0) {
            this.f43379wc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f43144e0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43104b0;
            if (yVar != null) {
                yVar.f(8);
            }
            ds dsVar = this.f43091a0;
            if (dsVar != null) {
                dsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f43157f0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f43169g0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f43206j0;
            if (w0Var3 != null && this.H9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f43218k0;
            if (yVar3 != null && this.I9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f43182h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f43231l0 = true;
            Fc(0, 0, -1);
            hc(false);
            ImageView imageView = this.P2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.Q2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f43169g0;
        if (w0Var5 != null) {
            this.f43102ac = true;
            this.T4 = false;
            w0Var5.z(false);
            this.f43102ac = false;
        }
        Za(chat, null);
        yc(0, true);
    }

    public final void kb(boolean z4) {
        lb(z4, false, true);
    }

    public final void kc(boolean z4) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z10;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.Wa == null) {
            this.Wa = new a0.h();
        }
        a0.h hVar2 = this.Va;
        if (hVar2 == null) {
            this.Va = new a0.h();
        } else {
            hVar2.b();
        }
        this.f43381x0.M.clear();
        this.Wa.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.f43346u6;
            arrayList = this.f43311r6;
            z10 = true;
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
                if (this.f43381x0.K && messageObject2.stableId != 0) {
                    messageObject.copyStableParams(messageObject2);
                } else {
                    messageObject2.copyStableParams(messageObject);
                }
            } else if (messageObject2.stableId == 0) {
                int i12 = Gc;
                Gc = i12 + 1;
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
                    groupedMessages2.reversed = this.Ma;
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
            this.f43381x0.M.add(messageObject2);
            this.Wa.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (hVar3 != null) {
            for (int i14 = 0; i14 < hVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new oh.k0(11));
                groupedMessages3.calculate();
            }
        }
        ArrayList arrayList3 = new ArrayList();
        if (this.f43258n3 != null && TextUtils.isEmpty(this.f43295q3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                MessageObject messageObject3 = (MessageObject) arrayList.get(i15);
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= messageObject3.messageOwner.reactions.results.size()) {
                            break;
                        } else if (this.f43258n3.f(messageObject3.messageOwner.reactions.results.get(i16).reaction)) {
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
                this.f43381x0.M.add(messageObject4);
                this.Wa.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.f43381x0.M.size()) {
            MessageObject messageObject5 = (MessageObject) this.f43381x0.M.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.Wa.d(messageObject6.getId())) {
                        this.f43381x0.M.add(i18, messageObject6);
                        this.Wa.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.f43381x0.M, new oh.k0(12));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.f43381x0.M.size()) {
            MessageObject messageObject8 = (MessageObject) this.f43381x0.M.get(i19);
            if (this.Ma && messageObject8 != null && i19 == 0) {
                Da(messageObject8, i19);
                i19++;
            }
            if (!this.Ma && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.Va.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.y3.l(messageObject8.dateKeyInt, this.Va);
            }
            arrayList4.add(messageObject8);
            if (this.Ma && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Da(messageObject8, i19);
                i19++;
            }
            if (!this.Ma && i19 >= this.f43381x0.M.size() - 1) {
                Da(messageObject8, this.f43381x0.M.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.f43381x0.L = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z4) {
            this.f43381x0.T();
            this.f43381x0.O(true);
            if (this.f43381x0.K ? !getMediaDataController().isSearchLoading() || !this.f43381x0.M.isEmpty() : !this.D6 || !arrayList.isEmpty() || this.f43381x0.f38079w >= 0) {
                z10 = false;
            }
            Pb(z10);
            if (this.f43340u0 != null) {
                G7(false);
                if (this.f43381x0.K ? !(getMediaDataController().isSearchLoading() || !this.f43381x0.M.isEmpty()) : !(this.D6 || !arrayList.isEmpty() || this.f43381x0.f38079w >= 0)) {
                    this.f43340u0.setEmptyView(this.N0);
                    qj qjVar = this.f43340u0;
                    qjVar.J0(qjVar.t1());
                    return;
                }
                this.N0.setVisibility(8);
                this.f43340u0.setEmptyView(null);
            }
        }
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z4, int i10, long j10, boolean z10, long j11) {
        String str2 = null;
        l8(str, null);
        if (f7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.Q5, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = C8();
                of2.invert_media = z10;
                of2.payStars = j11;
                of2.monoForumPeer = N8();
                of2.suggestionParams = this.f43135d5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.Q5, false, false, true, 0, 0, null, -1, j11, N8(), this.f43135d5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.Q5, this.f43223k5, this.U3, null, this.f43199i5, this.f43247m5, z4, i10, 0, null, C8(), j10, z10, j11, N8(), this.f43135d5);
            y6();
        }
    }

    public final void l7() {
        boolean z4;
        ek ekVar;
        if (this.f43100aa != null) {
            return;
        }
        int i10 = 0;
        if (this.f43365vc.f50541e >= 1.0f && ((ekVar = this.f43256n1) == null || ekVar.getPositionAnimated() <= 0.0f)) {
            z4 = false;
        } else {
            z4 = true;
        }
        fg.h0 h0Var = this.U0.I;
        if (!z4) {
            i10 = 4;
        }
        h0Var.setVisibility(i10);
    }

    public final void l8(CharSequence charSequence, ArrayList arrayList) {
        if (this.f43247m5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.f43247m5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.f43247m5.isMediaEmpty()) {
                MessageObject messageObject2 = this.f43247m5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                jk jkVar = this.V;
                if (jkVar != null) {
                    this.f43247m5.editingMessage = jkVar.getFieldText();
                    MessageObject messageObject3 = this.f43247m5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.f43247m5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final void l9() {
        UndoView undoView = this.f43356v3;
        if (undoView != null) {
            undoView.e(0, true);
        }
        org.telegram.ui.Components.ic icVar = this.f43384x3;
        if (icVar != null) {
            icVar.c(0L, false);
        }
        gl glVar = this.f43370w3;
        if (glVar != null) {
            glVar.e(0, true);
        }
    }

    public final void la(String str) {
        boolean z4;
        boolean z10;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i11;
        qh.e3 e3Var = this.f43320s1;
        if (e3Var != null && e3Var.S) {
            e3Var.e(true);
            z4 = true;
        } else {
            z4 = false;
        }
        qh.e3 e3Var2 = this.f43330t1;
        if (e3Var2 != null && e3Var2.S) {
            e3Var2.e(true);
            z4 = true;
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new qe(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f21548k0) {
            this.f43379wc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f43144e0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43104b0;
            if (yVar != null) {
                yVar.f(8);
            }
            ds dsVar = this.f43091a0;
            if (dsVar != null) {
                dsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f43157f0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            if ((this.f43094a4 == 0 || (i11 = this.O3) == 3 || i11 == 8) && (w0Var = this.f43169g0) != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f43206j0;
            if (w0Var3 != null && this.H9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f43218k0;
            if (yVar3 != null && this.I9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f43182h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f43231l0 = true;
            Fc(0, 0, -1);
            hc(false);
        }
        if ((this.f43094a4 == 0 || this.f43148e4 || (i10 = this.O3) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f43156f)) {
            if (str == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.T4 = z10;
            org.telegram.ui.ActionBar.w0 w0Var5 = this.f43169g0;
            if (w0Var5 != null) {
                w0Var5.z(z10);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f43169g0;
        if (w0Var6 != null) {
            w0Var6.H(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.f43295q3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.Q5, this.I6, this.classGuid, 0, this.f43094a4, false, this.f43233l3, this.f43245m3, !TextUtils.isEmpty(str), this.f43258n3);
        yc(0, true);
    }

    public final void lb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.lb(boolean, boolean, boolean):void");
    }

    public final void lc() {
        int i10;
        yj yjVar = this.V2;
        if (yjVar == null) {
            return;
        }
        yjVar.setTranslationX(R8() / 2.0f);
        this.V2.setTranslationY((((this.f43340u0.getTranslationY() + this.f43288p9) + this.f43376w9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.f43376w9, -this.V2.getHeight(), 0.0f), 1.0f, 0.0f);
        this.V2.setAlpha(this.f43160f3 * clamp);
        yj yjVar2 = this.V2;
        if (this.f43160f3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        yjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.V2.setScaleX(lerp);
        this.V2.setScaleY(lerp);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z4, int i10) {
        l8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.Q5, this.f43223k5, this.U3, null, this.f43199i5, true, false, this.f43247m5, z4, i10, 0, this.O3, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, C8(), 0L, false, j10, N8(), this.f43135d5);
        y6();
        if (i10 != 0) {
            if (this.P3 == -1) {
                this.P3 = 0;
            }
            this.P3 = arrayList.size() + this.P3;
            Ec(true);
        }
    }

    public final void m7() {
        float f10;
        org.telegram.ui.Components.df dfVar;
        float inputBubbleHeight = this.P.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + W8(org.telegram.ui.Components.s21.f30977c) + this.v.c();
        jk jkVar = this.V;
        if (jkVar != null && (dfVar = jkVar.f24628j0) != null) {
            dfVar.setTranslationY(-inputBubbleHeight);
        }
        bk bkVar = this.F1;
        if (bkVar != null) {
            if (bkVar.g()) {
                f10 = AndroidUtilities.dp(5.0f);
            } else {
                f10 = -inputBubbleHeight;
            }
            bkVar.setTranslationY(f10);
        }
    }

    public final void m8(boolean z4) {
        TLRPC.Chat chat = this.f43143e;
        if (chat != null && this.W7 != null && !ChatObject.isNotInChat(chat) && !this.f43143e.creator) {
            TLRPC.ChatFull chatFull = this.W7;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f43304r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f43304r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.W7.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.W7.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f43304r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z4 && this.f43304r == 0) {
                getMessagesController().checkChatInviter(this.f43143e.f20845id, false);
            }
        }
    }

    public final void m9() {
        boolean z4;
        Fc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.f43295q3, this.Q5, this.I6, this.classGuid, 0, this.f43094a4, this.f43233l3, this.f43245m3, this.f43258n3);
        if (TextUtils.isEmpty(this.f43295q3) && this.f43258n3 == null) {
            z4 = false;
        } else {
            z4 = true;
        }
        this.f43282p3 = z4;
        this.f43231l0 = z4;
        hc(false);
        Ic();
    }

    public final void ma(TLRPC.User user) {
        boolean z4;
        qh.e3 e3Var = this.f43320s1;
        if (e3Var != null && e3Var.S) {
            e3Var.e(true);
            z4 = true;
        } else {
            z4 = false;
        }
        qh.e3 e3Var2 = this.f43330t1;
        if (e3Var2 != null && e3Var2.S) {
            e3Var2.e(true);
            z4 = true;
        }
        if (z4) {
            AndroidUtilities.runOnUIThread(new lg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f21548k0) {
            this.f43379wc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f43144e0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43104b0;
            if (yVar != null) {
                yVar.f(8);
            }
            ds dsVar = this.f43091a0;
            if (dsVar != null) {
                dsVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f43157f0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f43169g0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.f43206j0;
            if (w0Var3 != null && this.H9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f43218k0;
            if (yVar3 != null && this.I9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f43182h0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f43231l0 = true;
            Fc(0, 0, -1);
            hc(false);
            ImageView imageView = this.P2;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.Q2;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f43169g0;
        if (w0Var5 != null) {
            this.f43102ac = true;
            this.T4 = false;
            w0Var5.z(false);
            this.f43102ac = false;
        }
        Za(null, user);
        yc(0, true);
    }

    public final void mb(int i10, int i11, String str) {
        this.I7 = i10;
        this.K7 = true;
        this.L7 = 0L;
        this.M7 = str;
        this.P7 = i11;
        this.J7 = true;
    }

    public final void mc() {
        boolean z4;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.X7) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.X7.send_paid_messages_stars <= 0)) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.O0 != null) {
            if (z4 && this.Q0 == null) {
                qi qiVar = new qi(getParentActivity(), getResourceProvider(), this);
                this.Q0 = qiVar;
                k7.e6.b(qiVar, 0.02f, 1.2f);
                this.Q0.setOnClickListener(new ue(this, 12));
            }
            qi qiVar2 = this.Q0;
            if (qiVar2 != null) {
                if (!z4) {
                    qiVar2.setVisibility(8);
                    return;
                }
                qiVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.X7;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.X7.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f43156f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        y01 y01Var = new y01(formatString.substring(indexOf, indexOf2));
                        if (y01Var.f43500c != -1) {
                            y01Var.f43500c = -1;
                            y01Var.invalidateSelf();
                        }
                        y01Var.a(503316480);
                        y01Var.setBounds(0, 0, y01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(y01Var), indexOf, indexOf2, 33);
                    }
                }
                this.Q0.setCustomText(spannableStringBuilder);
                this.Q0.setOverrideTextMaxWidth(qh.e3.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.Q0.getParent() != null && (!z4 || this.Q0.getParent() != this.O0)) {
                    ((ViewGroup) this.Q0.getParent()).removeView(this.Q0);
                }
                if (z4) {
                    ViewParent parent = this.Q0.getParent();
                    LinearLayout linearLayout = this.O0;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.Q0, k7.c6.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final boolean n() {
        return this.f43276o9;
    }

    public final void n7() {
        float c3;
        if (this.f43340u0 != null) {
            if (this.La && this.f43100aa == null) {
                c3 = AndroidUtilities.navigationBarHeight;
            } else {
                c3 = this.v.c() + W8(org.telegram.ui.Components.s21.f30977c) + AndroidUtilities.dp(16.0f) + this.f43391xa + this.f43291pc;
            }
            int i10 = (int) this.f43288p9;
            org.telegram.ui.Components.w21 w21Var = this.O1;
            if (w21Var != null) {
                w21Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            f2.o0 o0Var = this.f43329t0;
            boolean z4 = this.f43340u0.U1;
            RecyclerView recyclerView = o0Var.f5902a;
            int i11 = (int) c3;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z4 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new qh.d8(o0Var, i12, 4));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            vg.d dVar = this.K3;
            if (dVar != null) {
                RectF rectF = dVar.f49309b;
                rectF.set(W8(org.telegram.ui.Components.s21.f30976b), i10 - this.D, 0.0f, c3 - this.f43391xa);
                dVar.f49310c.set(rectF.left, rectF.top, dVar.getMeasuredWidth() - rectF.right, dVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void n8(org.telegram.messenger.MessageObject r61, java.util.ArrayList r62, java.util.ArrayList r63, java.util.ArrayList r64) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.n8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void n9() {
        this.U0.invalidate();
        Iterator it = this.f43394y.iterator();
        while (it.hasNext()) {
            ((View) it.next()).invalidate();
        }
    }

    public final void na(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.X0.e(true, false);
            } else if (getMessagesController().isCommunity(j10)) {
                showDialog(new th.i0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new xn(bundle));
                }
            }
        } else if (j10 != getUserConfig().getClientUserId()) {
            if (j10 == a()) {
                this.X0.e(true, false);
                return;
            }
            Bundle g10 = l.d.g(j10, "user_id");
            if (this.h != null && j10 == this.f43156f.f20992id) {
                g10.putLong("dialog_id", this.Q5);
            }
            ProfileActivity profileActivity = new ProfileActivity(g10, null);
            TLRPC.User user = this.f43156f;
            if (user != null && user.f20992id == j10) {
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
        this.f43094a4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f20866id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void nc() {
        final long j10;
        int i10;
        boolean z4;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.P0 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.f43143e)) {
            if (this.f43143e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.f43143e.f20845id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f43143e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.f43143e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f20845id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f20845id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(mh.ja.R0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.P0.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final xn f43949b;

                    {
                        this.f43949b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                xn.a1(j11, this.f43949b);
                                return;
                            default:
                                xn.t0(j11, this.f43949b);
                                return;
                        }
                    }
                });
                return;
            }
            this.P0.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.X7;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.ho hoVar = this.P0;
                boolean z10 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                hoVar.c(z10, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.Q5))), LocaleController.getString(R.string.MessagePremiumUnlock), new eg.m(9));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.ho hoVar2 = this.P0;
                if (i10 > 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                hoVar2.c(z4, false, AndroidUtilities.replaceTags(mh.ja.R0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.Q5), LocaleController.formatNumber(this.X7.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final xn f43949b;

                    {
                        this.f43949b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                xn.a1(j10, this.f43949b);
                                return;
                            default:
                                xn.t0(j10, this.f43949b);
                                return;
                        }
                    }
                });
            } else {
                this.P0.c(false, false, null, null, null);
            }
        } else {
            this.P0.c(false, false, null, null, null);
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.O3 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((p2Var instanceof xn) && ((xn) p2Var).x9()) {
                return false;
            }
        }
        return this.E6;
    }

    @Override
    public final org.telegram.ui.Components.ao o() {
        return this.X0;
    }

    public final void o7() {
        FrameLayout frameLayout = this.N0;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.P.getInputBubbleHeight() + this.v.b() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int o8() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4 = this.f43311r6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.G7);
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
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.G7) {
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
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.G7) {
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
        if (!this.A9) {
            this.A9 = true;
            pm pmVar = this.U0;
            if (pmVar != null) {
                pmVar.invalidate();
            }
            qj qjVar = this.f43340u0;
            if (qjVar != null) {
                qjVar.invalidate();
            }
        }
        UndoView undoView = this.f43356v3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(W8(org.telegram.ui.Components.s21.f30977c) + this.P.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(16.0f));
        }
        v7();
    }

    public final void oa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.t1().K2(null, this, this.f43114ba);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.t1().Q1()) {
                PhotoViewer.t1().G0(false, false);
            }
            PhotoViewer.t1().f2(arrayList, 0, 0, false, new rl(this, createVideoThumbnail, arrayList), this);
            return;
        }
        l8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.Q5, this.f43223k5, this.U3, null, this.f43199i5, null, 0, this.f43247m5, true, 0, 0, false, false, null, C8(), 0L, 0L, N8(), this.f43135d5);
        y6();
    }

    public final void ob(View view) {
        View view2 = this.G8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.v0)) {
                ((org.telegram.ui.Cells.v0) view2).setInvalidateWithParent(null);
            }
            this.G8 = view;
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void oc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.oc(boolean):void");
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        oh.u2 u2Var;
        org.telegram.ui.Components.rn rnVar;
        String str;
        oh.u2 u2Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (u2Var2 = this.G1) != null) {
                    org.telegram.ui.Components.ei eiVar = u2Var2.f29118v0;
                    if (eiVar instanceof wh.q) {
                        wh.q qVar = (wh.q) eiVar;
                        if (intent != null && intent.getData() != null) {
                            wh.r3 r3Var = qVar.f49966r;
                            Uri data = intent.getData();
                            if (data == null) {
                                r3Var.getClass();
                                return;
                            } else if (r3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new vf.k0(7, r3Var, data));
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
                        oh.u2 u2Var3 = this.G1;
                        if (u2Var3 != null) {
                            org.telegram.ui.Components.ei eiVar2 = u2Var3.f29118v0;
                            if (eiVar2 instanceof wh.q) {
                                wh.q qVar2 = (wh.q) eiVar2;
                                if (intent.getData() != null) {
                                    qVar2.f49966r.d2(intent.getData());
                                    return;
                                }
                                return;
                            }
                        }
                        Uri data2 = intent.getData();
                        if (data2.toString().contains("video")) {
                            try {
                                str = AndroidUtilities.getPath(data2);
                            } catch (Exception e6) {
                                FileLog.e(e6);
                                str = null;
                            }
                            if (str == null) {
                                tb();
                            }
                            if (this.f43260n5) {
                                this.f43287p8 = str;
                            } else {
                                oa(null, str);
                            }
                        } else if (this.f43247m5 == null && this.O3 == 1) {
                            org.telegram.ui.Components.z4.M(getParentActivity(), this.Q5, new ng.w(13, this, data2), this.f43114ba);
                        } else {
                            l8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.Q5, this.f43223k5, this.U3, this.f43199i5, null, null, null, null, 0, this.f43247m5, true, 0, this.O3, C8());
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
                    if (this.f43247m5 == null && this.O3 == 1) {
                        if (intent.getData() != null) {
                            oh.u2 u2Var4 = this.G1;
                            if (u2Var4 != null) {
                                u2Var4.dismiss();
                            }
                            org.telegram.ui.Components.z4.M(getParentActivity(), this.Q5, new org.telegram.ui.Components.y4(this) {
                                public final xn f38957b;

                                {
                                    this.f38957b = this;
                                }

                                @Override
                                public final void I(int i12, int i13, boolean z4) {
                                    switch (r3) {
                                        case 0:
                                            xn xnVar = this.f38957b;
                                            xnVar.l8(null, null);
                                            xnVar.gb(i12, intent.getData(), z4);
                                            xnVar.y6();
                                            return;
                                        default:
                                            xn xnVar2 = this.f38957b;
                                            xnVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                xnVar2.gb(i12, clipData.getItemAt(i14).getUri(), z4);
                                            }
                                            xnVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f43114ba);
                            return;
                        } else if (intent.getClipData() != null) {
                            oh.u2 u2Var5 = this.G1;
                            if (u2Var5 != null) {
                                u2Var5.dismiss();
                            }
                            org.telegram.ui.Components.z4.M(getParentActivity(), this.Q5, new org.telegram.ui.Components.y4(this) {
                                public final xn f38957b;

                                {
                                    this.f38957b = this;
                                }

                                @Override
                                public final void I(int i12, int i13, boolean z4) {
                                    switch (r3) {
                                        case 0:
                                            xn xnVar = this.f38957b;
                                            xnVar.l8(null, null);
                                            xnVar.gb(i12, intent.getData(), z4);
                                            xnVar.y6();
                                            return;
                                        default:
                                            xn xnVar2 = this.f38957b;
                                            xnVar2.l8(null, null);
                                            ClipData clipData = intent.getClipData();
                                            for (int i14 = 0; i14 < clipData.getItemCount(); i14++) {
                                                xnVar2.gb(i12, clipData.getItemAt(i14).getUri(), z4);
                                            }
                                            xnVar2.y6();
                                            return;
                                    }
                                }
                            }, this.f43114ba);
                            return;
                        } else {
                            tb();
                        }
                    } else {
                        l8(null, null);
                        if (intent.getData() != null) {
                            gb(0, intent.getData(), true);
                        } else if (intent.getClipData() != null) {
                            ClipData clipData = intent.getClipData();
                            for (int i12 = 0; i12 < clipData.getItemCount(); i12++) {
                                gb(0, clipData.getItemAt(i12).getUri(), true);
                            }
                        } else {
                            tb();
                        }
                    }
                    oh.u2 u2Var6 = this.G1;
                    if (u2Var6 != null) {
                        u2Var6.dismiss();
                    }
                    y6();
                    return;
                } else if (i10 == 28 && (u2Var = this.G1) != null && (rnVar = u2Var.f29081j0) != null) {
                    org.telegram.ui.ActionBar.g6 g6Var = rnVar.f26589a;
                    if (rnVar.f30829h1 != -1 && rnVar.f30827g1 != null) {
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
                            org.telegram.messenger.y3.s(R.string.UnsupportedAttachment, new org.telegram.ui.Components.qc(rnVar.f26590b.container, g6Var), g6Var);
                            return;
                        }
                        rnVar.e0(rnVar.f30829h1, new fh.c(uri));
                        org.telegram.ui.Components.an anVar = rnVar.f30827g1;
                        if (anVar != null) {
                            anVar.dismiss(true);
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
            oh.u2 u2Var7 = this.G1;
            if (u2Var7 != null) {
                u2Var7.f29072g0.g0(i10, intent, this.S7);
            }
            this.S7 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z4) {
        dl dlVar;
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.Components.ff ffVar;
        org.telegram.ui.Components.df dfVar;
        qm qmVar;
        ng.u uVar;
        org.telegram.ui.Components.ic icVar = org.telegram.ui.Components.ic.f27770w;
        if (icVar != null) {
            org.telegram.ui.Components.nb nbVar = icVar.f27774e;
            if (nbVar instanceof org.telegram.ui.Components.tb) {
                if (z4) {
                    ((org.telegram.ui.Components.tb) nbVar).f();
                    icVar.b();
                    return false;
                }
                return false;
            }
        }
        w41 w41Var = this.W9;
        if (w41Var != null && !w41Var.Y) {
            if (z4) {
                w41Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z4) {
                closeSheet();
                return false;
            }
        } else {
            ng.v vVar = this.V9;
            if (vVar != null && (uVar = vVar.f16226b) != null && uVar.getReactionsWindow() != null) {
                if (z4) {
                    vVar.f16226b.e();
                    return false;
                }
            } else if (qt.q().E) {
                if (z4) {
                    qt.q().o();
                    return false;
                }
            } else {
                fl flVar = this.Ba;
                if (flVar != null && flVar.f33460s) {
                    if (z4) {
                        flVar.a(true);
                        return false;
                    }
                } else if (this.f43365vc.f50542f) {
                    if (z4) {
                        Lb(false);
                        return false;
                    }
                } else if (this.N8 != null) {
                    if (z4) {
                        A7(true);
                        return false;
                    }
                } else if (!X6(z4, false)) {
                    if (b9()) {
                        if (z4 && (qmVar = this.Z8) != null && qmVar.y()) {
                            this.Z8.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.s()) {
                            if (z4) {
                                z7(false);
                                return false;
                            }
                        } else {
                            jk jkVar = this.V;
                            if (jkVar != null && jkVar.t0()) {
                                if (z4) {
                                    this.V.m0(true);
                                    return false;
                                }
                            } else {
                                jk jkVar2 = this.V;
                                if (jkVar2 != null && jkVar2.v()) {
                                    if (z4) {
                                        jk jkVar3 = this.V;
                                        sh.z zVar = jkVar3.f24622i0;
                                        if (zVar != null) {
                                            zVar.setOpened(false);
                                        }
                                        if (!jkVar3.j0() && (dfVar = jkVar3.f24628j0) != null) {
                                            dfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    jk jkVar4 = this.V;
                                    if (jkVar4 == null || (ffVar = jkVar4.B0) == null || !ffVar.closeCreationLinkDialog(z4)) {
                                        if (this.O3 == 6 && (d2Var = vf.q.d) != null && d2Var.isShowing()) {
                                            if (z4) {
                                                vf.q.d.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.f43143e) && !this.Q3 && this.O1 != null && b() != 0) {
                                            if (z4) {
                                                this.O1.m(0L, this.f43249m7);
                                                return false;
                                            }
                                        } else if (this.O3 == 5 && !"hello".equalsIgnoreCase(this.N3) && !"away".equalsIgnoreCase(this.N3) && (this.f43311r6.isEmpty() || this.f43094a4 == 0)) {
                                            if (z4) {
                                                Qb();
                                                return false;
                                            }
                                        } else if (this.O3 == 6 && this.V.w()) {
                                            if (z4) {
                                                wb(new lf(this, 19));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f21548k0) {
                                                if (z4) {
                                                    kVar2.h(true);
                                                    return false;
                                                }
                                            } else if (this.f43339tc.f50542f) {
                                                if (z4) {
                                                    ta();
                                                }
                                            } else {
                                                if (z4 && (dlVar = this.Y2) != null) {
                                                    dlVar.d(false);
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
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.f43311r6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.f43143e)))) {
                    org.telegram.ui.Components.d31.u(messageObject, false);
                }
            }
        }
        this.C3 = false;
        l9();
        ArrayList arrayList2 = org.telegram.ui.Components.d31.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        af.f fVar = this.f43392xb;
        if (fVar != null) {
            fVar.a(false);
            this.f43392xb = null;
        }
        this.B3.detach();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.C3 = true;
        super.onBecomeFullyVisible();
        if (this.L) {
            showDialog(this.K);
        }
        if (this.f43115bb) {
            jk jkVar = this.V;
            if (jkVar != null) {
                jkVar.I0();
                jk jkVar2 = this.V;
                jkVar2.Q0 = false;
                org.telegram.ui.Components.uf ufVar = jkVar2.R0;
                if (ufVar != null) {
                    ufVar.u(false);
                }
            }
            this.f43115bb = false;
        }
        if (this.f43320s1 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 1), 600L);
        }
        if (this.f43271o4 && !this.f43283p4) {
            this.f43283p4 = true;
            org.telegram.ui.Components.ic M = org.telegram.ui.Components.qc.a0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f27778j = 5000;
            M.v = new le(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        ng.v vVar = this.V9;
        if (vVar != null && vVar.d()) {
            this.V9.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j10;
        long j11;
        lj ljVar = this.X0;
        if (ljVar != null) {
            ljVar.getViewTreeObserver().addOnPreDrawListener(new ai(this, 0));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        A7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.C1() || !PhotoViewer.t1().Q1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.t1().K2(null, this, this.f43114ba);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer t12 = PhotoViewer.t1();
                    int i10 = playingMessageObject.type;
                    long j12 = 0;
                    if (i10 != 0) {
                        j10 = this.Q5;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = this.I6;
                    } else {
                        j11 = 0;
                    }
                    if (i10 != 0) {
                        j12 = b();
                    }
                    if (t12.e2(playingMessageObject, null, null, null, null, null, null, 0, this.Ca, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.t1().f34298i4 = this;
                    }
                    h9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.C1() && PhotoViewer.t1().f34296i2) {
                PhotoViewer t13 = PhotoViewer.t1();
                if (t13.C2.y()) {
                    if (t13.W2) {
                        t13.C2.N(false);
                    }
                    MediaController.getInstance().injectVideoPlayer(t13.C2, t13.Q4);
                    t13.C2 = null;
                }
                PhotoViewer.t1().G0(false, true);
            }
        }
    }

    @Override
    public final AnimatorSet onCustomTransitionAnimation(boolean z4, Runnable runnable) {
        ValueAnimator ofFloat;
        int measuredHeight;
        int measuredHeight2;
        int measuredHeight3;
        int measuredHeight4;
        kk kkVar = this.T9;
        float f10 = 0.0f;
        if (z4 && this.O9 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (p2Var instanceof xn) {
                this.A4 = true;
                xn xnVar = (xn) p2Var;
                xnVar.Q9 = this;
                this.fragmentView.setAlpha(0.0f);
                this.U0.setSkipBackgroundDrawing(true);
                this.X0.setTranslationY(AndroidUtilities.dp(8.0f));
                this.X0.getAvatarImageView().setAlpha(0.0f);
                this.X0.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.P9 = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                jk jkVar = this.V;
                if (jkVar != null) {
                    jkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                nk nkVar = this.O;
                if (nkVar != null) {
                    nkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                jk jkVar2 = this.V;
                if (jkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = jkVar2.getMeasuredHeight();
                }
                nk nkVar2 = this.O;
                if (nkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = nkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                jk jkVar3 = xnVar.V;
                if (jkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = jkVar3.getMeasuredHeight();
                }
                nk nkVar3 = this.O;
                if (nkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = nkVar3.getMeasuredHeight();
                }
                this.L9 = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new bg.a(8, this, xnVar));
                jc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.S9 = animatorSet;
                animatorSet.addListener(new eg.j0(this, xnVar, runnable));
                this.S9.setDuration(300L);
                this.S9.setInterpolator(org.telegram.ui.Components.pr.f30168f);
                this.S9.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(kkVar, 200L);
                return this.S9;
            }
        }
        if (this.f43179ga && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (p2Var2 instanceof sf1) {
                float[] fArr = {1.0f, 0.0f};
                if (z4) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                p2Var2.getFragmentView().getWidth();
                if (!z4) {
                    f10 = 1.0f;
                }
                this.f43204ia = f10;
                ofFloat.addUpdateListener(new yi(0, this));
                this.f43191ha = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                pm pmVar = this.U0;
                if (pmVar != null) {
                    pmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.S9 = animatorSet2;
                animatorSet2.addListener(new aj(this, z4, runnable));
                this.S9.setDuration(150L);
                this.S9.playTogether(ofFloat);
                if (z4) {
                    AndroidUtilities.runOnUIThread(kkVar, 200L);
                } else {
                    this.S9.start();
                }
                return this.S9;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.d2 d2Var = this.K;
        if (d2Var != null && dialog == d2Var) {
            getMessagesController().deleteDialog(this.Q5, 0);
            org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
            if (f5Var != null && !f5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.p2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z4;
        org.telegram.ui.Components.qu0 qu0Var;
        super.onFragmentDestroy();
        vg.d dVar = this.K3;
        if (dVar != null) {
            LongSparseArray longSparseArray = dVar.f49316w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                vg.c cVar = (vg.c) longSparseArray.valueAt(i10);
                if (cVar.f49303i) {
                    dVar.v.add(cVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                h5.a.n("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            dVar.a();
        }
        jk jkVar = this.V;
        if (jkVar != null) {
            jkVar.B0();
        }
        lj ljVar = this.X0;
        if (ljVar != null && (qu0Var = ljVar.W) != null) {
            qu0Var.b(ljVar.D);
        }
        bk bkVar = this.F1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            this.F1.getAdapter().P();
        }
        oh.u2 u2Var = this.G1;
        if (u2Var != null) {
            u2Var.dismissInternal();
        }
        qt q10 = qt.q();
        if (q10.f40657l == this.h9) {
            q10.W = null;
            q10.f40644a0 = null;
            q10.Y = null;
            q10.f40657l = null;
            q10.f40648c0 = null;
            q10.u();
        }
        getNotificationCenter().onAnimationFinish(this.C9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.D9);
        getNotificationCenter().onAnimationFinish(this.E9);
        getNotificationCenter().onAnimationFinish(this.F9);
        l9();
        le leVar = this.I5;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
            this.I5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f43228ka);
        MessagesController messagesController = getMessagesController();
        long j10 = this.Q5;
        if (this.O3 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        messagesController.setLastCreatedDialogId(j10, z4, false);
        NotificationCenter.ObserversGroup observersGroup = this.Oa;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.Oa = null;
        }
        NotificationCenter.ObserversGroup observersGroup2 = this.Pa;
        if (observersGroup2 != null) {
            observersGroup2.removeAllObservers();
            this.Pa = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.O3 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.Q5), Long.valueOf(b()), Boolean.TRUE);
        }
        if (this.f43156f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.B3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f43156f != null) {
            getMessagesController().cancelLoadFullUser(this.f43156f.f20992id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        oh.u2 u2Var2 = this.G1;
        if (u2Var2 != null) {
            u2Var2.v1();
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.f43143e)) {
            getMessagesController().startShortPoll(this.f43143e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.W7;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.W7.linked_chat_id)), this.classGuid, true);
            }
        }
        qm qmVar = this.Z8;
        if (qmVar != null) {
            qmVar.f(false);
        }
        sj sjVar = this.f43353v0;
        if (sjVar != null) {
            sjVar.N();
        }
        sk skVar = this.f43337ta;
        if (skVar != null) {
            skVar.b();
        }
        this.Y9 = null;
        org.telegram.ui.ActionBar.f5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!Lc ? 1 : 0);
            org.telegram.ui.ActionBar.f5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.g9) parentLayout2.getPulledDialogs().get(i11)).f27117b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        Lc = false;
        af.f fVar = this.f43392xb;
        if (fVar != null) {
            fVar.a(false);
            this.f43392xb = null;
        }
        this.f43140da.onFragmentDestroy();
        b11 b11Var = this.Z7;
        if (b11Var != null) {
            b11Var.b(true);
            this.Z7 = null;
        }
        mh.l5 l5Var = this.nc;
        if (l5Var != null) {
            l5Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.nc);
            this.nc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.f43192hb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.f43336t8, null, null, false);
        }
        mh.l5 l5Var = this.nc;
        if (l5Var != null) {
            l5Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.nc);
            this.nc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        oh.u2 u2Var;
        org.telegram.ui.Components.cl clVar;
        oh.u2 u2Var2;
        boolean z4;
        boolean z10;
        org.telegram.ui.Components.mi miVar;
        jk jkVar = this.V;
        boolean z11 = false;
        if (jkVar != null && i10 == 2 && jkVar.f24607f3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(jkVar.N).sendCurrentLocation(jkVar.f24600e3, jkVar.f24607f3);
            }
            jkVar.f24607f3 = null;
            jkVar.f24600e3 = null;
        }
        bk bkVar = this.F1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            uf.u0 adapter = this.F1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f48753t0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.F0.start();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i10 == 4) {
            oh.u2 u2Var3 = this.G1;
            if (u2Var3 != null) {
                u2Var3.f29072g0.Y();
            }
            org.telegram.ui.Components.mp mpVar = this.Y9;
            if (mpVar != null && (miVar = mpVar.V) != null) {
                miVar.f29072g0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (u2Var = this.G1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                u2Var.D1();
            } else if (i10 == 30 && (clVar = u2Var.f29087l0) != null && u2Var.f29118v0 == clVar && u2Var.isShowing()) {
                u2Var.f29087l0.Y();
            }
        } else if ((i10 == 17 || i10 == 18) && (u2Var2 = this.G1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = u2Var2.f29072g0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z11 = true;
            }
            chatAttachAlertPhotoLayout.U(z11);
            this.G1.f29072g0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43114ba);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new sh(this));
                l.d.C(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Aa(2);
        } else if (((i10 != 101 && i10 != 102) || this.f43156f == null) && (i10 != 103 || this.f43143e == null)) {
        } else {
            int i11 = 0;
            while (true) {
                if (i11 < iArr.length) {
                    if (iArr[i11] != 0) {
                        z4 = false;
                        break;
                    }
                    i11++;
                } else {
                    z4 = true;
                    break;
                }
            }
            if (iArr.length > 0 && z4) {
                if (i10 == 103) {
                    org.telegram.ui.Components.voip.g2.l(this.f43143e, null, this.V7, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f43156f;
                if (i10 == 102) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                TLRPC.UserFull userFull = this.X7;
                if (userFull != null && userFull.video_calls_available) {
                    z11 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user2, z10, z11, getParentActivity(), getMessagesController().getUserFull(this.f43156f.f20992id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z4;
        TLRPC.Chat chat;
        jk jkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        MessageObject messageObject;
        boolean z10;
        org.telegram.ui.Components.p9[] p9VarArr;
        eg.s2 s2Var;
        super.onResume();
        d7();
        this.B9 = System.currentTimeMillis();
        if (this.f43276o9 && getSendMessagesHelper().getImportingHistory(this.Q5) != null) {
            org.telegram.ui.Components.a50 a50Var = new org.telegram.ui.Components.a50(getParentActivity(), null, this, this.f43114ba);
            a50Var.setOnHideListener(new dg(this, 8));
            showDialog(a50Var);
            this.f43276o9 = false;
        }
        H6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        W6();
        oh.u2 u2Var = this.G1;
        if (u2Var != null) {
            u2Var.y1();
        }
        pm pmVar = this.U0;
        boolean z11 = true;
        if (pmVar != null) {
            org.telegram.ui.Components.o81 o81Var = pmVar.v;
            if (o81Var != null) {
                o81Var.c(true);
            }
            pmVar.C = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new le(this, 24), 1000L);
        }
        a9 a9Var = new a9(this, 2);
        this.Wb = a9Var;
        setBulletinDelegate(a9Var);
        G6(false);
        TLRPC.PhotoSize photoSize = this.f43334t5;
        if (photoSize != null && (s2Var = this.X) != null) {
            ((org.telegram.ui.Components.oo[]) s2Var.f5475b)[0].f29839f.k(ImageLocation.getForObject(photoSize, this.f43358v5), "50_50", ImageLocation.getForObject(this.f43345u5, this.f43358v5), "50_50_b", this.f43310r5, null, this.f43223k5, this.f43324s5);
        }
        if (this.f43412z5 != null && (p9VarArr = this.f43397y2) != null) {
            p9VarArr[0].k(ImageLocation.getForObject(this.f43412z5, this.B5), "50_50", ImageLocation.getForObject(this.A5, this.B5), "50_50_b", this.f43372w5, null, (MessageObject) this.G4.get(Integer.valueOf(this.I4)), this.f43386x5);
            p9VarArr[0].setHasBlur(this.f43400y5);
        }
        if (this.O3 == 0) {
            getNotificationsController().setOpenedDialogId(this.Q5, b());
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.Q5;
        if (this.O3 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        messagesController.setLastVisibleDialogId(j10, z4, true);
        if (this.N5) {
            if (this.P5 && (messageObject = this.H7) != null) {
                if (this.f43340u0 != null) {
                    int i10 = this.Q7;
                    if (i10 == -9000) {
                        i10 = K8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z10 = true;
                        this.f43367w0.i1(this.f43311r6.indexOf(this.H7) + this.f43381x0.G, i10, z10);
                    }
                    z10 = false;
                    this.f43367w0.i1(this.f43311r6.indexOf(this.H7) + this.f43381x0.G, i10, z10);
                }
            } else {
                O9(false);
            }
            this.P5 = false;
            this.N5 = false;
            this.H7 = null;
        }
        this.f43260n5 = false;
        this.f43272o5 = false;
        a7(false);
        if (this.f43284p5) {
            this.f43284p5 = false;
            jm jmVar = this.f43381x0;
            if (jmVar != null) {
                jmVar.O(false);
            }
        }
        lj ljVar = this.X0;
        if (ljVar != null) {
            ljVar.getViewTreeObserver().addOnPreDrawListener(new ai(this, 0));
        }
        A6(false, false);
        if (this.V != null && this.O3 == 0 && this.fa != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.Q5 && (arrayList2 = this.fa.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new j80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.fa.entities;
            }
            CharSequence r10 = ChatActivityEnterView.r(arrayList, this.fa.message, this.V.getEditField().getPaint().getFontMetricsInt());
            if (r10 != null && r10.length() > 0 && r10.charAt(0) == '@') {
                r10 = TextUtils.concat(" ", r10);
            }
            this.V.f1(r10, true);
            this.fa = null;
        }
        ok okVar = this.L0;
        if (okVar != null && okVar.getVisibility() != 0 && !this.actionBar.f21548k0 && this.O3 != 7 && !org.telegram.ui.ActionBar.p2.hasSheets(this)) {
            this.V.setFieldFocused(true);
        }
        jk jkVar2 = this.V;
        if (jkVar2 != null) {
            jkVar2.E0();
        }
        if (this.f43156f != null) {
            this.f43250m8 = System.currentTimeMillis();
            this.f43263n8 = 0L;
        }
        if (this.f43287p8 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 3));
        }
        if (this.f43340u0 != null && ((jkVar = this.V) == null || !jkVar.r0())) {
            this.f43340u0.setOnItemLongClickListener(this.Ga);
            this.f43340u0.setOnItemClickListener(this.Ha);
            this.f43340u0.setLongClickable(true);
        }
        org.telegram.ui.Components.i51.h = false;
        TLRPC.User user = this.f43156f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.i51.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.W7;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.W7.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.W7.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.i51.h = true;
                            break;
                        }
                        i11++;
                    } else {
                        break;
                    }
                }
            } else if (chatFull instanceof TLRPC.TL_channelFull) {
                org.telegram.ui.Components.i51.h = (chatFull.bot_info.isEmpty() || (chat = this.f43143e) == null || !chat.megagroup) ? false : false;
            }
        }
        Nc(false);
        Ib();
        if (this.K9 != 0.0f) {
            this.K9 = 0.0f;
            this.f43340u0.invalidate();
        }
        this.B3.attach();
        mh.l5 l5Var = this.nc;
        if (l5Var != null) {
            l5Var.bringToFront();
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z4, boolean z10) {
        int[] iArr;
        org.telegram.ui.Components.id idVar;
        super.onTransitionAnimationStart(z4, z10);
        System.currentTimeMillis();
        if (z4) {
            if (!this.L5) {
                this.L5 = true;
                uc();
            }
            iArr = this.C9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.K5 = false;
            if (!z10) {
                this.M5 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f43156f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            jk jkVar = this.V;
            if (jkVar != null && (idVar = jkVar.O1) != null) {
                AndroidUtilities.cancelRunOnUIThread(idVar);
                jkVar.O1 = null;
            }
        }
        d7();
        this.C9 = getNotificationCenter().setAnimationInProgress(this.C9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f43148e4) {
            if (this.f43156f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f43156f.f20992id));
                if (user != null) {
                    this.f43156f = user;
                } else {
                    return;
                }
            } else if (this.f43143e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.f43143e.f20845id));
                if (chat != null) {
                    this.f43143e = chat;
                } else {
                    return;
                }
            }
            lj ljVar = this.X0;
            if (ljVar != null) {
                ljVar.b();
            }
        }
    }

    public final void p7() {
        int i10;
        float f10 = this.f43393xc.f50541e;
        org.telegram.ui.Components.h40 h40Var = this.f43293q1;
        int i11 = 8;
        if (h40Var != null) {
            h40Var.setAlpha(f10);
            org.telegram.ui.Components.h40 h40Var2 = this.f43293q1;
            if (f10 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            h40Var2.setVisibility(i10);
        }
        mh.d1 d1Var = this.I3;
        if (d1Var != null) {
            float f11 = 1.0f - f10;
            d1Var.setAlpha(f11);
            mh.d1 d1Var2 = this.I3;
            if (f11 > 0.0f) {
                i11 = 0;
            }
            d1Var2.setVisibility(i11);
        }
    }

    public final void p9() {
        boolean z4;
        Rect rect;
        if (this.U0 != null) {
            if (this.Ra <= 0 && this.Sa <= 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            dh.i iVar = this.v;
            float b10 = iVar.b();
            xd.k kVar = iVar.f4758b;
            int max = (int) Math.max(0.0f, (b10 * kVar.f50566a) - AndroidUtilities.dp(29.0f));
            pm pmVar = this.U0;
            fg.h0 h0Var = pmVar.I;
            Rect rect2 = this.Dc;
            if (h0Var != null) {
                rect2.set(0, 0, pmVar.getMeasuredWidth(), this.U0.getMeasuredHeight() - max);
                this.U0.I.setClipBounds(rect2);
            }
            if (this.f43340u0 != null) {
                rect2.set(0, 0, this.U0.getMeasuredWidth(), this.U0.getMeasuredHeight() - max);
                rect2.offset(0, -this.f43340u0.getTop());
                qj qjVar = this.f43340u0;
                if (qjVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                qjVar.setClipBounds(rect);
            }
            if (this.U != null) {
                rect2.set(0, 0, this.U0.getMeasuredWidth(), this.U0.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(iVar.v, iVar.b() * kVar.f50566a) - AndroidUtilities.dp(29.0f))));
                xg.f fVar = this.U;
                if (z4) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void pa() {
        this.L5 = true;
        this.fragmentBeginToShow = true;
        this.S9 = null;
        this.U0.invalidate();
        this.U0.setSkipBackgroundDrawing(false);
        this.P9 = false;
        this.fragmentView.setAlpha(1.0f);
        this.X0.setTranslationY(0.0f);
        this.X0.getAvatarImageView().setScaleX(1.0f);
        this.X0.getAvatarImageView().setScaleY(1.0f);
        this.X0.getAvatarImageView().setAlpha(1.0f);
    }

    public final void pb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z4;
        boolean z10;
        this.Z3 = tL_forumTopic;
        this.X3 = arrayList;
        MessageObject messageObject = (MessageObject) l.d.i(1, arrayList);
        this.U3 = messageObject;
        this.f43223k5 = messageObject;
        this.f43186h4 = i11;
        this.f43198i4 = i12;
        this.f43210j4 = Math.max(1, i11);
        this.f43094a4 = this.U3.getId();
        this.f43108b4 = i10;
        this.f43121c4 = chat;
        if (tL_forumTopic != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f43148e4 = z4;
        MessageObject messageObject2 = this.f43223k5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z4) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f43134d4 = z10;
        if (z4) {
            messageObject2.isTopicMainMessage = true;
        }
        zc();
        Qc(false);
        hc(false);
    }

    public final void pc() {
        MessageObject messageObject;
        if (this.f43156f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                qj qjVar = this.f43340u0;
                if (qjVar != null) {
                    int childCount = qjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f43340u0.getChildAt(i10);
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.f43250m8, this.f43263n8, this.f43156f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f10 = SecretMediaViewer.f();
            MessageObject messageObject2 = f10.f34771e0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f10.H, f10.I, this.f43156f, null, null, messageObject2.getId());
            }
        }
    }

    public final void q7() {
        if (this.U0 == null) {
            return;
        }
        this.f43291pc = C6(false);
        this.f43303qc = C6(true);
        this.P.setInputBubbleHeight(this.f43291pc);
        wc();
        gc();
        m7();
        j7();
        o7();
        n7();
    }

    public final org.telegram.ui.Cells.a0 q8(int i10, boolean z4) {
        MessageObject messageObject;
        qj qjVar = this.f43340u0;
        if (qjVar != null) {
            int childCount = qjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f43340u0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.t1) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z4) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.f43288p9 - this.f43314r9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f43340u0.getMeasuredHeight() - this.f43391xa) {
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
        xn xnVar = this.f43100aa;
        if (xnVar != null) {
            xnVar.q9(i10);
        }
        if (Build.VERSION.SDK_INT >= 31 && this.C != null) {
            lf.e0 e0Var = this.Ac;
            if (e0Var.f12417c == 0) {
                e0Var.invalidate();
            }
            e0Var.f12417c = i10 | e0Var.f12417c;
        }
    }

    public final void qa(long j10, boolean z4) {
        if (this.O1 != null && UserObject.isBotForum(this.f43156f)) {
            this.O1.setAllTopicsHidden(true);
        }
        this.J5.put(j10, 1);
        Q7();
        UndoView undoView = this.f43356v3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.Q5, 0, new mh.pa(this, j10, z4, 4), new hg.y0(this, j10, 4));
        this.f43381x0.O(false);
    }

    public final void qb() {
        AndroidUtilities.shakeViewSpring(this.f43340u0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        jk jkVar = this.V;
        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void qc(MessageObject messageObject, boolean z4) {
        if (this.f43381x0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new mh.r5(this, messageObject, z4, 7));
    }

    @Override
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z4, final int i10, final int i11, final boolean z10, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.f43328sc.a(false, true);
        MessageObject messageObject = this.f43247m5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.f43247m5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f43135d5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.f43247m5.messageOwner.suggested_post);
            }
            if (!mh.t7.U(this.currentAccount, messageSuggestionParams.amount)) {
                Tb(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            le leVar = new le(this, 21);
            this.f43262n7 = leVar;
            AndroidUtilities.runOnUIThread(leVar, 3000L);
        }
        l8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.z4.b0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l10 = (Long) obj;
                xn xnVar = xn.this;
                MessageObject messageObject2 = xnVar.f43247m5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z11 = z4;
                int i12 = i10;
                int i13 = i11;
                boolean z12 = z10;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = xnVar.f43135d5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(xnVar.f43247m5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(xnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, xnVar.Q5, xnVar.f43247m5, xnVar.U3, null, xnVar.f43199i5, photoEntry2.entities, photoEntry2.ttl, null, z11, i12, i13, z12, photoEntry2.hasSpoiler, photoEntry2.caption, xnVar.C8(), photoEntry2.effectId, l10.longValue(), xnVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, xnVar.Q5, xnVar.f43247m5, xnVar.U3, null, xnVar.f43199i5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z11, i12, i13, 0, z12, photoEntry2.caption, xnVar.C8(), photoEntry2.effectId, l10.longValue(), xnVar.N8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, xnVar.Q5, xnVar.f43247m5, xnVar.U3, null, xnVar.f43199i5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z11, i12, i13, 0, z12, photoEntry2.caption, xnVar.C8(), photoEntry2.effectId, l10.longValue(), xnVar.N8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(xnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, xnVar.Q5, xnVar.f43223k5, xnVar.U3, null, xnVar.f43199i5, photoEntry2.entities, photoEntry2.ttl, xnVar.f43247m5, z11, i12, i13, z12, photoEntry2.hasSpoiler, photoEntry2.caption, xnVar.C8(), photoEntry2.effectId, l10.longValue(), xnVar.N8(), xnVar.f43135d5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, xnVar.Q5, xnVar.f43223k5, xnVar.U3, null, xnVar.f43199i5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, xnVar.f43247m5, videoEditedInfo2, z11, i12, i13, 0, z12, photoEntry2.caption, xnVar.C8(), photoEntry2.effectId, l10.longValue(), xnVar.N8(), xnVar.f43135d5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(xnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, xnVar.Q5, xnVar.f43223k5, xnVar.U3, null, xnVar.f43199i5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, xnVar.f43247m5, videoEditedInfo2, z11, i12, i13, 0, z12, photoEntry2.caption, xnVar.C8(), photoEntry2.effectId, l10.longValue(), xnVar.N8(), xnVar.f43135d5);
                }
                xnVar.y6();
            }
        }, j10);
    }

    public final void r7() {
        int i10;
        xn xnVar = this.f43100aa;
        if (xnVar != null) {
            xnVar.r7();
        }
        int i11 = AndroidUtilities.statusBarHeight;
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + i11 + ((int) V8(AndroidUtilities.dp(7.0f)));
        vk vkVar = this.l1;
        if (vkVar != null) {
            i10 = AndroidUtilities.dp(vkVar.B * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(z8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.c());
        mh.d1 d1Var = this.I3;
        if (d1Var != null) {
            d1Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.h40 h40Var = this.f43293q1;
        if (h40Var != null) {
            h40Var.f27356e.setPadding(0, dp2, 0, dp3);
            h40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        vg.e eVar = this.H3;
        if (eVar != null) {
            xg.f fVar = eVar.f49319a;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.u00 u00Var = this.Z1;
        if (u00Var != null) {
            u00Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.zw0 zw0Var = this.a2;
        if (zw0Var != null) {
            zw0Var.f34030a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final void r8() {
        if (this.f43189h7) {
            return;
        }
        this.f43189h7 = true;
        getMessagesController().checkSensitive(this, this.Q5, new le(this, 26), new lf(this, 19));
    }

    public final void r9() {
        this.oa = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final boolean ra() {
        if (this.E4.size() != 1 || this.V3 == null || ((Integer) this.E4.get(0)).intValue() != this.V3.getId()) {
            return false;
        }
        return true;
    }

    public final void rb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43114ba);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string;
        TLRPC.User user = this.f43156f;
        if (user != null) {
            if (user.bot) {
                d2Var.Q = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String j10 = org.telegram.messenger.y3.j(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, se.b.c());
                TLRPC.User user2 = this.f43156f;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, j10, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            d2Var.Q = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new e3.d(this, i10, messageObject, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(d2Var);
    }

    public final void rc(MessageObject messageObject, boolean z4) {
        MessageObject messageObject2;
        if (this.f43381x0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f43346u6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                sj sjVar = this.f43353v0;
                if (sjVar != null) {
                    sjVar.V(groupedMessages);
                }
                for (int i10 = 0; i10 < groupedMessages.messages.size(); i10++) {
                    groupedMessages.messages.get(i10).forceUpdate = true;
                    if (z4) {
                        groupedMessages.messages.get(i10).reactionsChanged = true;
                    }
                }
                this.f43381x0.O(true);
                return;
            }
            MessageObject messageObject3 = (MessageObject) this.f43236l6[0].get(messageObject.getId());
            if (z4) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.f43381x0.K) {
                a0.h hVar = this.Wa;
                if (hVar != null) {
                    messageObject2 = (MessageObject) hVar.f(messageObject.getId());
                } else {
                    messageObject2 = null;
                }
                int indexOf = this.f43381x0.M.indexOf(messageObject2);
                if (messageObject2 != null && z4) {
                    messageObject2.forceUpdate = true;
                    messageObject2.reactionsChanged = true;
                }
                if (indexOf >= 0) {
                    jm jmVar = this.f43381x0;
                    jmVar.m(jmVar.G + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.f43311r6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                jm jmVar2 = this.f43381x0;
                jmVar2.m(jmVar2.G + indexOf2);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.S7 = bundle.getString("path");
    }

    public final void s6(MessageObject messageObject, Integer num) {
        MessageObject messageObject2 = messageObject.replyMessageObject;
        if (messageObject2 != null) {
            int id2 = messageObject2.getId();
            SparseArray sparseArray = this.f43261n6;
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
        float f10 = (1.0f - this.f43365vc.f50541e) * (1.0f - this.f43339tc.f50541e);
        this.f43170g1.setTranslationX((1.0f - f10) * AndroidUtilities.dp(80.0f));
        this.f43170g1.setAlpha(f10);
        xg.g gVar = this.f43170g1;
        if (f10 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        gVar.setVisibility(i10);
    }

    public final boolean s8() {
        boolean z4;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f43340u0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z4 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f43340u0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.t1) && (currentMessagesGroup = ((org.telegram.ui.Cells.t1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.f43311r6.indexOf((MessageObject) l.d.i(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        jm jmVar = this.f43381x0;
                        jmVar.q(indexOf + jmVar.G, currentMessagesGroup.messages.size());
                        this.f43340u0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            yh.z(false, this.actionBar);
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.f5 f5Var = this.parentLayout;
        if (f5Var != null && !f5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z4 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.i2(z4));
        return false;
    }

    public final void s9() {
        TLRPC.User user;
        boolean z4;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f43156f) != null && user.contact_require_premium) {
            boolean isEmpty = this.f43311r6.isEmpty();
            if (getMessagesController().isUserContactBlocked(a()) != null) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (isEmpty != z4) {
                getMessagesController().invalidateUserPremiumBlocked(a(), this.classGuid);
            }
        }
    }

    public final boolean sa() {
        ArrayList<MessageObject> arrayList;
        jk jkVar = this.V;
        if (jkVar != null && jkVar.w0()) {
            return true;
        }
        ArrayList arrayList2 = this.f43311r6;
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
        lf lfVar = this.f43265na;
        if (lfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(lfVar);
        }
        jk jkVar = this.V;
        if (jkVar != null && this.U0 != null && jkVar.getAdjustPanLayoutHelper() != null && !this.V.getAdjustPanLayoutHelper().f22256f) {
            this.f43251ma = this.U0.getKeyboardHeight();
        } else {
            this.f43251ma = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.S7;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final boolean sb() {
        if (v9() && this.f43223k5 == null && this.f43247m5 == null) {
            if (this.O3 != 8 && v9() && this.f43143e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.f43143e.f20845id, 1L);
                if (this.O3 != 8) {
                    if (findTopic != null) {
                        if (findTopic.closed && !ChatObject.canManageTopic(this.currentAccount, this.f43143e, findTopic)) {
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
        org.telegram.ui.ActionBar.p1 p1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        qj qjVar = this.f43340u0;
        bk bkVar = this.F1;
        if ((bkVar != null && bkVar.F) || ((p1Var = this.N8) != null && p1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        qjVar.setImportantForAccessibility(i10);
    }

    @Override
    public final void setInMenuMode(boolean z4) {
        int i10;
        super.setInMenuMode(z4);
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
    public final void setInPreviewMode(boolean z4) {
        boolean z10;
        boolean z11;
        MessageObject messageObject;
        TLRPC.Message message;
        long j10;
        org.telegram.ui.ActionBar.i2 i2Var;
        float f10;
        float f11;
        jk jkVar;
        int i10;
        float f12;
        super.setInPreviewMode(z4);
        int i11 = 8;
        boolean z12 = true;
        if (this.f43156f != null && this.f43218k0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f43156f.f20992id);
            if (userFull != null && userFull.phone_calls_available) {
                this.I9 = !this.inPreviewMode;
                this.f43218k0.f(0);
            } else {
                this.I9 = false;
                this.f43218k0.f(8);
            }
        }
        lj ljVar = this.X0;
        float f13 = 0.0f;
        if (ljVar != null) {
            ljVar.setOccupyStatusBar(!z4);
            lj ljVar2 = this.X0;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            ljVar2.setLayoutParams(k7.c6.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        jk jkVar2 = this.V;
        if (jkVar2 != null) {
            if (!z4) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.qy0 qy0Var = this.f43092a1;
        if (qy0Var != null) {
            if (this.W4 && !z4 && ((jkVar = this.V) == null || !jkVar.f24692v3)) {
                i11 = 0;
            }
            qy0Var.setVisibility(i11);
        }
        bk bkVar = this.F1;
        if (bkVar != null) {
            ViewPropertyAnimator animate = bkVar.animate();
            if (!this.V.f24692v3 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.pr.f30168f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z4) {
                i2Var = new org.telegram.ui.ActionBar.i2(false);
            } else {
                i2Var = null;
            }
            kVar.setBackButtonDrawable(i2Var);
            org.telegram.ui.ActionBar.w0 w0Var = this.f43144e0;
            if (w0Var != null) {
                if (!z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                w0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.y yVar = this.f43104b0;
            if (yVar != null) {
                if (!z4) {
                    f13 = 1.0f;
                }
                yVar.f22458i = f13;
                org.telegram.ui.ActionBar.w0 w0Var2 = yVar.f22462m;
                if (w0Var2 != null) {
                    w0Var2.setAlpha(f13);
                }
            }
        }
        qj qjVar = this.f43340u0;
        if (qjVar != null) {
            int childCount = qjVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f43340u0.getChildAt(i12);
                boolean z13 = childAt instanceof org.telegram.ui.Cells.t1;
                if (z13) {
                    messageObject = ((org.telegram.ui.Cells.t1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    messageObject = null;
                }
                if (messageObject != null && (message = messageObject.messageOwner) != null && message.media_unread && message.mentioned) {
                    if (!messageObject.isVoice() && !messageObject.isRoundVideo()) {
                        int i13 = this.f43200i6 - 1;
                        this.f43200i6 = i13;
                        if (i13 <= 0) {
                            this.f43200i6 = 0;
                            this.f43212j6 = true;
                            Kb(false);
                        } else {
                            this.f43170g1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.f43143e)) {
                            j10 = this.f43143e.f20845id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j10, this.Q5);
                        messageObject.setContentIsRead();
                    }
                    if (z13) {
                        org.telegram.ui.Cells.t1 t1Var = (org.telegram.ui.Cells.t1) childAt;
                        t1Var.setHighlighted(false);
                        t1Var.O3();
                    }
                }
            }
            this.f43340u0.setItemAnimator(null);
        }
        hc(false);
        Kc();
        dk dkVar = this.U1;
        if (dkVar != null) {
            if (!z4 && !this.La) {
                z11 = true;
            } else {
                z11 = false;
            }
            dkVar.setEnabled(z11);
        }
        dk dkVar2 = this.W1;
        if (dkVar2 != null) {
            if (!z4 && !this.La) {
                z10 = true;
            } else {
                z10 = false;
            }
            dkVar2.setEnabled(z10);
        }
        hl hlVar = this.f43342u2;
        if (hlVar != null) {
            hlVar.setEnabled(!isInPreviewMode());
        }
        pm pmVar = this.U0;
        if (pmVar != null) {
            pmVar.setOccupyStatusBar((this.inBubbleMode || this.La || this.inPreviewMode) ? false : false);
        }
    }

    public final void t6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.t6():void");
    }

    public final void t7() {
        xn xnVar = this.f43100aa;
        if (xnVar != null) {
            xnVar.t7();
        }
        float V8 = V8(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.O1 != null) {
            V8 += W8(org.telegram.ui.Components.s21.f30975a);
        }
        if (this.l1 != null) {
            V8 += AndroidUtilities.dp(35.0f) * this.l1.B;
        }
        this.U.setFadeZoneTop((int) ((z8() * AndroidUtilities.dp(43.0f)) + V8));
    }

    public final void t8(ArrayList arrayList, boolean z4, boolean z10, boolean z11, int i10, long j10) {
        boolean z12;
        if (!arrayList.isEmpty() && f7()) {
            boolean z13 = false;
            if (i10 != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.O3 == 1) {
                z13 = true;
            }
            if (z12 == z13) {
                this.f43239l9 = true;
                jm jmVar = this.f43381x0;
                if (jmVar != null) {
                    jmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.Q5, z4, z10, z11, i10, 0, this.U3, -1, j10, N8(), this.f43135d5);
            org.telegram.ui.Components.z4.t0(sendMessage, this, this.f43114ba);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new lf(this, 24));
            }
        }
    }

    public final boolean t9() {
        if (this.O1 != null && this.f43094a4 == 0) {
            return true;
        }
        return false;
    }

    public final void ta() {
        org.telegram.ui.Cells.t1 t1Var;
        this.f43339tc.a(false, true);
        eh.f fVar = this.f43417zc;
        if (fVar != null && (t1Var = fVar.f5628n) != null && t1Var.getDelegate() != null) {
            fVar.f5628n.getDelegate().L1(fVar.f5628n, false);
        }
        jk jkVar = this.V;
        if (jkVar != null) {
            jkVar.V0(true, true, false);
            this.V.Q4 = null;
        }
    }

    public final void tb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.qc.a0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f43114ba).j();
    }

    public final void tc(ArrayList arrayList, boolean z4) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f43381x0.R((MessageObject) arrayList.get(i10), false, z4);
        }
    }

    public final void u6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.h hVar = this.t6;
            ArrayList arrayList = (ArrayList) hVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.y3.l(pollId, hVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void u7() {
        if (this.J0 != null) {
            this.J0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - z8()) * (1.0f - this.f43365vc.f50541e) * R8())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final int u8() {
        return this.O3;
    }

    public final void ua(org.telegram.ui.Cells.t1 t1Var) {
        eh.f fVar;
        if (this.f43339tc.f50542f && (fVar = this.f43417zc) != null && fVar.f5628n == t1Var) {
            Editable text = fVar.f5623a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(t1Var.getMessageObject(), text, this.f43417zc.getAttachedMedia());
                ta();
                return;
            }
            AndroidUtilities.shakeView(this.f43417zc.f5623a);
        }
    }

    public final void ub(org.telegram.ui.Cells.t1 t1Var) {
        if (getParentActivity() != null && t1Var != null && t1Var.f23938lb != null && t1Var.getPrimaryMessageObject() != null && t1Var.getPrimaryMessageObject().messageOwner != null && t1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.Ua) {
                this.Ua = true;
                if (this.f43368w1 != null) {
                    return;
                }
                qh.e3 e3Var = new qh.e3(getParentActivity(), 3);
                e3Var.p(true);
                e3Var.H = Layout.Alignment.ALIGN_NORMAL;
                e3Var.d = -1L;
                e3Var.Q = true;
                e3Var.f45266e = true;
                e3Var.i();
                e3Var.q(8.0f);
                this.f43368w1 = e3Var;
                e3Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                qh.e3 e3Var2 = this.f43368w1;
                e3Var2.h = qh.e3.a(e3Var2.getText(), this.f43368w1.getTextPaint());
                this.U0.addView(this.f43368w1, k7.c6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.U0.post(new xc(8, this, t1Var));
            }
        }
    }

    public final void uc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.uc():void");
    }

    @Override
    public final boolean v(final org.telegram.ui.py r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.sf1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.v(org.telegram.ui.py, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.sf1):boolean");
    }

    public final void v6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.h9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f43143e, this.f43156f, null, this.Q5, this.f43327sa, this.f43315ra);
    }

    public final void v7() {
        float f10 = this.t9;
        vk vkVar = this.l1;
        if (vkVar != null) {
            vkVar.setTranslationY(f10);
            f10 += AndroidUtilities.dp(35.0f) * this.l1.B;
        }
        hk hkVar = this.f43243m1;
        if (hkVar != null) {
            hkVar.setTranslationY(f10);
        }
        float z82 = (z8() * AndroidUtilities.dp(43.0f)) + f10;
        org.telegram.ui.Components.w21 w21Var = this.O1;
        org.telegram.ui.Components.s21 s21Var = org.telegram.ui.Components.s21.f30975a;
        if (w21Var != null) {
            w21Var.setSideMenuBackgroundMarginTop((z8() * V8(AndroidUtilities.dp(7.0f))) + z82);
            float W8 = W8(s21Var);
            float b10 = lf.l0.b(this.f43365vc.f50541e);
            float z83 = z8();
            z82 += lf.l0.b(Math.min(k7.o.a(lf.l0.b(b10), 0.0f, 1.0f), k7.o.a(lf.l0.b(z83), 0.0f, 1.0f))) * W8;
        }
        org.telegram.ui.Components.sg sgVar = this.J0;
        if (sgVar != null) {
            sgVar.setTranslationY((z82 - AndroidUtilities.dp(5.0f)) - (z8() * W8(s21Var)));
        }
    }

    public final TLRPC.ChatFull v8() {
        return this.W7;
    }

    public final boolean v9() {
        if (!ChatObject.isForum(this.f43143e) || this.f43148e4) {
            if (ChatObject.isMonoForum(this.f43143e) && b() == 0 && !this.Q3) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void va(org.telegram.ui.Cells.a0 a0Var, TLRPC.ReactionCount reactionCount, float f10, float f11) {
        MessageObject messageObject;
        boolean z4;
        boolean z10;
        TLRPC.Message message;
        ng.q0 d = ng.q0.d(reactionCount.reaction);
        if (a0Var instanceof org.telegram.ui.Cells.t1) {
            messageObject = ((org.telegram.ui.Cells.t1) a0Var).getPrimaryMessageObject();
        } else if (a0Var instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) a0Var).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        ab(a0Var, messageObject2, null, null, f10, f11, d, false, false, false, false);
        if (messageObject2 != null) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (messageObject2.messageOwner != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z4 & z10) {
            boolean z11 = this.f43381x0.K;
            if (z11) {
                MessageObject messageObject3 = (MessageObject) this.f43236l6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z11 && this.f43258n3 != null) {
                kc(false);
            }
        }
        if (this.f43381x0.K && !messageObject2.hasReaction(this.f43258n3)) {
            MessageObject.GroupedMessages X8 = X8(messageObject2);
            if (X8 != null) {
                for (int i10 = 0; i10 < X8.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(X8.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            uf.y0 y0Var = this.J3;
            if (y0Var != null) {
                y0Var.l();
            }
            kc(true);
        }
    }

    public final void vb(boolean z4, boolean z10) {
        int i10;
        float f10;
        float f11;
        int i11;
        int i12;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        Object obj;
        if (!z4 || this.D0.getTag() == null) {
            if (!z4 && this.D0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.E0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.E0 = null;
            }
            RadialProgressView radialProgressView = this.D0;
            if (z4) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f17 = 0.1f;
            if (z10) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.E0 = animatorSet2;
                if (z4) {
                    this.D0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.E0;
                    qk qkVar = this.f43395y0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(qkVar, property, 0.1f);
                    qk qkVar2 = this.f43395y0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(qkVar2, property2, 0.1f);
                    qk qkVar3 = this.f43395y0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(qkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.D0, property, 1.0f), ObjectAnimator.ofFloat(this.D0, property2, 1.0f), ObjectAnimator.ofFloat(this.D0, property3, 1.0f));
                    this.E0.setStartDelay(200L);
                } else {
                    if (this.f43408z0) {
                        obj = this.A0;
                    } else {
                        obj = this.f43395y0;
                    }
                    RadialProgressView radialProgressView2 = this.D0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.D0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.D0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.E0.addListener(new eg.u2(18, this, z4));
                this.E0.setDuration(150L);
                this.E0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.D0;
            if (z4) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            radialProgressView5.setVisibility(i10);
            RadialProgressView radialProgressView6 = this.D0;
            if (z4) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView6.setScaleX(f10);
            RadialProgressView radialProgressView7 = this.D0;
            if (z4) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            radialProgressView7.setScaleY(f11);
            this.D0.setAlpha(1.0f);
            qk qkVar4 = this.f43395y0;
            if (!z4 && !this.f43408z0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            qkVar4.setVisibility(i11);
            org.telegram.ui.Components.g90 g90Var = this.A0;
            if (!z4 && this.f43408z0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            g90Var.setVisibility(i12);
            qk qkVar5 = this.f43395y0;
            if (!z4 && !this.f43408z0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            qkVar5.setScaleX(f12);
            org.telegram.ui.Components.g90 g90Var2 = this.A0;
            if (!z4 && this.f43408z0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            g90Var2.setScaleX(f13);
            qk qkVar6 = this.f43395y0;
            if (!z4 && !this.f43408z0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            qkVar6.setScaleY(f14);
            org.telegram.ui.Components.g90 g90Var3 = this.A0;
            if (!z4 && this.f43408z0) {
                f17 = 1.0f;
            }
            g90Var3.setScaleY(f17);
            qk qkVar7 = this.f43395y0;
            if (!z4 && !this.f43408z0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            qkVar7.setAlpha(f15);
            org.telegram.ui.Components.g90 g90Var4 = this.A0;
            if (!z4 && this.f43408z0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            g90Var4.setAlpha(f16);
        }
    }

    public final void vc() {
        boolean z4;
        boolean z10;
        if (this.f43170g1 == null) {
            return;
        }
        if (this.f43139d9 && !b9() && !this.V.w0() && !this.La && (!this.f43282p3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z4) {
            if (this.M5 != 0 && SystemClock.elapsedRealtime() >= this.M5 + 150) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f43183h1 = false;
        } else {
            this.f43402y7 = 0;
            this.f43175g6 = 0;
            z10 = true;
        }
        this.f43170g1.e(1, z4, z10);
    }

    @Override
    public final boolean w() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void w6(MessageObject messageObject, boolean z4) {
        x6(messageObject, z4, true);
    }

    public final void w7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.s6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.f43311r6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.Q5 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.f43236l6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j10 = this.f43143e.f20845id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j10, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.f43346u6.f(messageObject.getGroupId());
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
                        } else if (this.f43381x0 != null && (indexOf = arrayList.indexOf(messageObject)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.f43381x0.G));
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
            if (this.f43381x0 != null) {
                if (hVar != null) {
                    int m9 = hVar.m();
                    for (int i15 = 0; i15 < m9; i15++) {
                        MessageObject.GroupedMessages groupedMessages2 = (MessageObject.GroupedMessages) hVar.n(i15);
                        int indexOf2 = arrayList.indexOf((MessageObject) l.d.i(1, groupedMessages2.messages));
                        if (indexOf2 >= 0) {
                            jm jmVar = this.f43381x0;
                            if (!jmVar.K) {
                                jmVar.q(indexOf2 + jmVar.G, groupedMessages2.messages.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.f43381x0.K) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.f43381x0.m(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final TLRPC.UserFull w8() {
        return this.X7;
    }

    public final boolean w9() {
        return UserObject.isBotForum(this.f43156f);
    }

    public final void wa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.wa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void wb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new gf(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        showDialog(d2Var);
        TextView textView = (TextView) d2Var.d(-1);
        if (textView != null) {
            textView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.f21897q7));
        }
    }

    public final void wc() {
        xg.g gVar = this.f43170g1;
        dh.i iVar = this.v;
        if (gVar != null) {
            this.f43170g1.setTranslationY((((-iVar.c()) - this.P.getInputBubbleHeight()) - W8(org.telegram.ui.Components.s21.f30977c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f43092a1 != null) {
            this.f43092a1.setTranslationY((-iVar.c()) - AndroidUtilities.dp(16.0f));
        }
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    public final void x6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.x6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void x7(boolean z4) {
        boolean z10;
        this.f43311r6.clear();
        this.f43273o6.clear();
        this.f43285p6.clear();
        this.e6.clear();
        this.f43346u6.b();
        this.f43161f4 = false;
        jm jmVar = this.f43381x0;
        if (jmVar != null) {
            if (jmVar.f38079w < 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            Pb(z10);
        }
        qj qjVar = this.f43340u0;
        if (qjVar != null) {
            qjVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.f43236l6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.f43373w6;
            int[] iArr2 = this.f43359v6;
            if (encryptedChat == null) {
                iArr2[i10] = Integer.MAX_VALUE;
                iArr[i10] = Integer.MIN_VALUE;
            } else {
                iArr2[i10] = Integer.MIN_VALUE;
                iArr[i10] = Integer.MAX_VALUE;
            }
            this.f43387x6[i10] = Integer.MIN_VALUE;
            this.f43401y6[i10] = 0;
            this.f43413z6[i10] = false;
            this.A6[i10] = false;
            this.B6[i10] = true;
        }
        if (z4) {
            this.D7 = true;
            this.E6 = true;
            this.D6 = true;
            this.F7 = false;
        }
        this.U4 = false;
        this.f43312r7 = 0;
        this.f43299q7 = false;
        this.H6 = 0;
        this.G7 = null;
        this.A7 = 0;
        this.B7 = false;
        this.f43388x7 = false;
        jm jmVar2 = this.f43381x0;
        if (jmVar2 != null && !jmVar2.K) {
            jmVar2.O(false);
        }
    }

    public final ArrayList x8() {
        jm jmVar = this.f43381x0;
        if (jmVar != null) {
            return jmVar.M;
        }
        return null;
    }

    public boolean x9() {
        if (this.U0.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void xa(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.t1 t1Var, boolean z4) {
        org.telegram.ui.Components.s01 s01Var;
        String hostAuthority;
        boolean z10;
        boolean z11 = false;
        try {
            hostAuthority = AndroidUtilities.getHostAuthority(str);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
        if (this.h != null) {
            if (getMessagesController().secretWebpagePreview == 1) {
            }
            if (z4 && !AndroidUtilities.shouldShowUrlInAlert(str)) {
                if (i10 == 0) {
                    af.g.q(getParentActivity(), Uri.parse(str), true, true, K9(t1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f43125c8 == 0) {
                        z11 = true;
                    }
                    af.g.q(parentActivity, parse, z11, true, K9(t1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f43125c8 == 0) {
                        z11 = true;
                    }
                    af.g.q(parentActivity2, parse2, z11, true, K9(t1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.z4.r0(this, str, true, true, false, false, K9(t1Var, characterStyle), null, this.f43114ba);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.n51) && (s01Var = ((org.telegram.ui.Components.n51) characterStyle).f29392a) != null && (s01Var.f30949a & 1024) != 0) {
                    z11 = true;
                }
                org.telegram.ui.Components.z4.r0(this, str, true, true, true, z11, K9(t1Var, characterStyle), null, this.f43114ba);
            }
        }
        if (getMessagesController().authDomains.contains(hostAuthority)) {
            SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
            if (i10 != 0 && i10 != 2) {
                z10 = false;
                sendMessagesHelper.requestUrlAuth(str, this, z10);
                return;
            }
            z10 = true;
            sendMessagesHelper.requestUrlAuth(str, this, z10);
            return;
        }
        if (z4) {
        }
        if (i10 == 0) {
        }
        if (characterStyle instanceof org.telegram.ui.Components.n51) {
            z11 = true;
        }
        org.telegram.ui.Components.z4.r0(this, str, true, true, true, z11, K9(t1Var, characterStyle), null, this.f43114ba);
    }

    public final void xb() {
        TLRPC.Chat chat = this.f43143e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.f43143e)) {
                    n60 n60Var = new n60(a());
                    n60Var.f35449i0 = this;
                    presentFragment(n60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.f43143e)) {
                bd bdVar = new bd(a());
                bdVar.f35449i0 = this;
                presentFragment(bdVar);
                return;
            } else {
                return;
            }
        }
        this.Y9 = new org.telegram.ui.Components.mp(this, this.f43114ba);
        this.f43340u0.setOnInterceptTouchListener(new mh.c3(22));
        jb(this.U0, false);
        showDialog(this.Y9, new dg(this, 0));
    }

    public final void xc(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        Integer num;
        float f10;
        float f11;
        float f12;
        int i10;
        float f13;
        float f14;
        float f15;
        int i11;
        float f16;
        float f17;
        float f18;
        int i12;
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
        if ((!F9() || this.f43148e4) && this.I2 != null) {
            if (!this.L5) {
                z10 = false;
            } else {
                z10 = z4;
            }
            if (this.E4.size() > 1 && !this.F2) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.I2.getTag() != null) {
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
            if (!z11 && !this.f43406yb && !this.F2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (z11 && !this.f43406yb && !this.F2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (this.f43406yb && !this.F2) {
                z17 = true;
            } else {
                z17 = false;
            }
            if (z12 != z11 || z13 != z17 || z14 != z15) {
                AnimatorSet animatorSet = this.J2;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.J2 = null;
                }
                if (z10) {
                    if (z11) {
                        this.I2.setVisibility(0);
                    } else if (z15) {
                        this.G2.setVisibility(0);
                    }
                    if (z17) {
                        this.H2.setVisibility(0);
                        this.H2.setAlpha(0.0f);
                        this.H2.setScaleX(0.4f);
                        this.H2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.J2 = animatorSet2;
                    ImageView imageView = this.I2;
                    Property property = View.ALPHA;
                    if (z16) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f19);
                    ImageView imageView2 = this.I2;
                    Property property2 = View.SCALE_X;
                    if (z16) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f20);
                    ImageView imageView3 = this.I2;
                    Property property3 = View.SCALE_Y;
                    if (z16) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.4f;
                    }
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f21);
                    ImageView imageView4 = this.G2;
                    if (z15) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f22);
                    ImageView imageView5 = this.G2;
                    if (z15) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f23);
                    ImageView imageView6 = this.G2;
                    if (z15) {
                        f24 = 1.0f;
                    } else {
                        f24 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f24);
                    RadialProgressView radialProgressView = this.H2;
                    if (!z17) {
                        f25 = 0.0f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f25);
                    RadialProgressView radialProgressView2 = this.H2;
                    if (!z17) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f26);
                    RadialProgressView radialProgressView3 = this.H2;
                    if (!z17) {
                        f27 = 0.4f;
                    } else {
                        f27 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f27));
                    this.J2.setInterpolator(org.telegram.ui.Components.pr.h);
                    this.J2.setDuration(360L);
                    this.J2.addListener(new wl(this, z15, z16, z17));
                    this.J2.start();
                } else {
                    num = 1;
                    ImageView imageView7 = this.G2;
                    if (z15) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView7.setAlpha(f10);
                    ImageView imageView8 = this.G2;
                    if (z15) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView8.setScaleX(f11);
                    ImageView imageView9 = this.G2;
                    if (z15) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.4f;
                    }
                    imageView9.setScaleY(f12);
                    ImageView imageView10 = this.G2;
                    if (z15) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.I2;
                    if (z16) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView11.setAlpha(f13);
                    ImageView imageView12 = this.I2;
                    if (z16) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView12.setScaleX(f14);
                    ImageView imageView13 = this.I2;
                    if (z16) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    imageView13.setScaleY(f15);
                    ImageView imageView14 = this.I2;
                    if (z16) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.H2;
                    if (z17) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f16);
                    RadialProgressView radialProgressView5 = this.H2;
                    if (z17) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f17);
                    RadialProgressView radialProgressView6 = this.H2;
                    if (z17) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f18);
                    RadialProgressView radialProgressView7 = this.H2;
                    if (z17) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.G2;
                if (z15) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.I2;
                if (z11) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.H2;
                if (z17) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.f43369w2 != null) {
                if (F9() && !this.f43148e4) {
                    this.f43369w2.c(0, 1, false);
                } else {
                    this.f43369w2.c((this.E4.size() - 1) - Collections.binarySearch(this.E4, Integer.valueOf(this.I4), Comparator$CC.reverseOrder()), this.E4.size(), z10);
                }
            }
        }
    }

    public final void y6() {
        this.f43135d5 = null;
        if (this.f43094a4 == 0 || this.f43148e4) {
            if (this.f43148e4) {
                this.f43223k5 = this.U3;
            } else {
                this.f43223k5 = null;
            }
            this.f43199i5 = null;
            jk jkVar = this.V;
            if (jkVar != null) {
                jkVar.l1(null, null, null);
            }
        }
        e9(false);
        if (this.O3 == 0) {
            getMediaDataController().cleanDraft(this.Q5, this.f43094a4, true);
        }
    }

    public final void y7(boolean z4, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.f43373w6;
        if (z4) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb = new StringBuilder("clear history by overwrite firstLoading=");
                sb.append(this.E6);
                sb.append(" minMessage=");
                sb.append(iArr[0]);
                sb.append(" topMessage=");
                l.d.t(tL_updates_channelDifferenceTooLong.dialog.top_message, sb);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.A7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.B6[0] = false;
            this.C6 = false;
            jm jmVar = this.f43381x0;
            if (jmVar != null && jmVar.C < 0) {
                jmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f43175g6 = i12;
            this.f43200i6 = dialog2.unread_mentions_count;
            if (this.f43188h6 != i12) {
                xg.g gVar = this.f43170g1;
                if (gVar != null) {
                    gVar.c(1, i12, this.K5);
                }
                this.f43188h6 = this.f43175g6;
                vc();
            }
            int i13 = this.f43200i6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f43200i6 = i14;
                if (i14 <= 0) {
                    this.f43200i6 = 0;
                    this.f43212j6 = true;
                    Kb(false);
                } else {
                    xg.g gVar2 = this.f43170g1;
                    if (gVar2 != null) {
                        gVar2.c(2, i14, true);
                    }
                    Kb(true);
                }
            }
            a7(false);
            return;
        }
        this.f43311r6.clear();
        this.e6.clear();
        this.f43273o6.clear();
        this.f43285p6.clear();
        this.f43346u6.b();
        this.f43161f4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.f43236l6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.f43359v6;
            if (encryptedChat == null) {
                iArr2[i15] = Integer.MAX_VALUE;
                iArr[i15] = Integer.MIN_VALUE;
            } else {
                iArr2[i15] = Integer.MIN_VALUE;
                iArr[i15] = Integer.MAX_VALUE;
            }
            this.f43387x6[i15] = Integer.MIN_VALUE;
            this.f43401y6[i15] = 0;
            this.T5[i15].clear();
            this.U5[i15].clear();
            this.V5[i15].clear();
        }
        c9();
        yc(0, true);
        if (this.f43202i8 != null) {
            this.f43202i8 = null;
            jk jkVar = this.V;
            if (jkVar != null) {
                jkVar.Z0(null, true, false);
            }
        }
        if (this.M != null) {
            Pb(false);
            G7(false);
            this.f43340u0.setEmptyView(this.N0);
        }
        jm jmVar2 = this.f43381x0;
        if (jmVar2 != null) {
            jmVar2.O(false);
        }
        if (this.h == null && (user = this.f43156f) != null && user.bot && this.f43112b8 == null) {
            this.f43112b8 = "";
            hc(false);
        }
    }

    public final MessageObject.GroupedMessages y8(long j10) {
        return (MessageObject.GroupedMessages) this.f43346u6.f(j10);
    }

    public final boolean y9() {
        if (this.f43143e != null) {
            return getMessagesController().isChatNoForwards(this.f43143e);
        }
        return getMessagesController().isUserNoForwards(this.X7);
    }

    public final void ya(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.ya(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void yb(boolean z4, MessageObject messageObject, MessageObject messageObject2, ArrayList arrayList, TLRPC.WebPage webPage, nn nnVar, boolean z10, boolean z11) {
        zb(z4, messageObject, messageObject2, arrayList, webPage, true, 0, nnVar, z10, 0L, null, z11);
    }

    public final void yc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.yc(int, boolean):void");
    }

    @Override
    public final void z(float f10, int i10) {
        if (i10 == 2 && f10 == 0.0f) {
            eh.f fVar = this.f43417zc;
            if (fVar != null) {
                this.U0.removeView(fVar);
                this.f43417zc = null;
            }
            jk jkVar = this.V;
            if (jkVar != null) {
                jkVar.H0();
            }
        }
    }

    public final void z6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f43114ba);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
        d2Var.O = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            d2Var.Q = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            d2Var.Q = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(d2Var);
    }

    public final void z7(boolean z4) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.T5[i10].clear();
            this.U5[i10].clear();
            this.V5[i10].clear();
        }
        c9();
        yc(0, true);
        Wc(z4);
        Lc();
    }

    public final float z8() {
        xn xnVar = this.f43100aa;
        if (xnVar == null) {
            xnVar = this;
        }
        hk hkVar = xnVar.f43243m1;
        if (hkVar == null) {
            return 0.0f;
        }
        return hkVar.f30856b;
    }

    public final boolean z9() {
        int i10 = this.O3;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void za(java.util.ArrayList r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.za(java.util.ArrayList, boolean):void");
    }

    public final void zb(boolean r31, org.telegram.messenger.MessageObject r32, org.telegram.messenger.MessageObject r33, java.util.ArrayList r34, org.telegram.tgnet.TLRPC.WebPage r35, boolean r36, int r37, org.telegram.ui.nn r38, boolean r39, long r40, org.telegram.messenger.MessageSuggestionParams r42, boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xn.zb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.nn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void zc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f43148e4 && !this.G4.isEmpty() && this.E4.size() == 1 && ((Integer) this.E4.get(0)).intValue() == b() + 1) {
            messageObject = (MessageObject) this.G4.get(this.E4.get(0));
        } else {
            messageObject = null;
        }
        this.V3 = messageObject;
        if (this.f43148e4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.Z3) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.f43143e, this.V3.messageOwner.from_id)) {
            this.V3 = null;
        }
    }

    @Override
    public final void O() {
    }

    public void V9(boolean z4) {
    }
}
