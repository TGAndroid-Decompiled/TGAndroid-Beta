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
import j$.util.concurrent.ConcurrentHashMap;
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
public class un extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, ux, kc0, org.telegram.ui.Components.ek, org.telegram.ui.Components.bh, og.b, org.telegram.ui.Components.a60, oe.d {
    public static int f44168bd = 22;
    public static float f44169cd = 1.4f;
    public static int f44170dd = 10;
    public static Pattern ed;
    public static Pattern f44171fd;
    public static Pattern f44172gd;
    public static final int[] f44173hd = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean f44174id = false;
    public static final Rect f44175jd = new Rect();
    public fm A0;
    public sk A1;
    public org.telegram.ui.Components.t40 A2;
    public TLRPC.User A3;
    public final SparseArray A4;
    public int A5;
    public final SparseArray[] A6;
    public int A7;
    public boolean A8;
    public boolean A9;
    public int Aa;
    public boolean Ab;
    public int Ac;
    public nk B0;
    public ek B1;
    public org.telegram.ui.Cells.s1 B2;
    public TLRPC.Chat B3;
    public final ArrayList B4;
    public MessageObject B5;
    public final SparseArray B6;
    public boolean B7;
    public long B8;
    public ValueAnimator B9;
    public int Ba;
    public ArrayList Bb;
    public int Bc;
    public boolean C0;
    public fi.h1 C1;
    public int C2;
    public bh.x0 C3;
    public int C4;
    public boolean C5;
    public final SparseArray C6;
    public jg C7;
    public long C8;
    public ValueAnimator C9;
    public kf Ca;
    public ValueAnimator Cb;
    public int Cc;
    public org.telegram.ui.Components.z90 D0;
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
    public boolean Db;
    public int Dc;
    public final se.b E;
    public TextView E0;
    public boolean E1;
    public org.telegram.ui.Components.t40 E2;
    public boolean E3;
    public boolean E4;
    public boolean E5;
    public final SparseArray E6;
    public boolean E7;
    public String E8;
    public float E9;
    public boolean Ea;
    public Boolean Eb;
    public int Ec;
    public final ch.f F;
    public mk F0;
    public org.telegram.ui.Components.o40 F1;
    public org.telegram.ui.Components.t40 F2;
    public String F3;
    public int F4;
    public boolean F5;
    public final a0.h F6;
    public boolean F7;
    public kk F8;
    public float F9;
    public long Fa;
    public boolean Fb;
    public boolean Fc;
    public final int G;
    public RadialProgressView G0;
    public org.telegram.ui.ActionBar.e2 G1;
    public org.telegram.ui.Components.t40 G2;
    public String G3;
    public final ArrayList G4;
    public int G5;
    public final ArrayList G6;
    public int G7;
    public org.telegram.ui.Cells.s1 G8;
    public int G9;
    public int Ga;
    public boolean Gb;
    public long Gc;
    public final hh.d H;
    public int H0;
    public fi.v3 H1;
    public org.telegram.ui.Components.dq H2;
    public int H3;
    public final HashMap H4;
    public int H5;
    public final SparseArray H6;
    public int H7;
    public m4 H8;
    public int H9;
    public int Ha;
    public int Hb;
    public TLRPC.TL_messages_discussionMessage Hc;
    public final hh.d I;
    public int I0;
    public fi.v3 I1;
    public View I2;
    public int I3;
    public MessageObject I4;
    public TLRPC.PhotoSize I5;
    public final a0.h I6;
    public int I7;
    public TextureView I8;
    public float I9;
    public qk Ia;
    public HashMap Ib;
    public TLRPC.messages_Messages Ic;
    public ch.b J;
    public int J0;
    public fi.v3 J1;
    public el J2;
    public int J3;
    public int J4;
    public TLRPC.PhotoSize J5;
    public final a0.h J6;
    public int J7;
    public boolean J8;
    public float J9;
    public rk Ja;
    public kf Jb;
    public boolean Jc;
    public ch.b K;
    public int K0;
    public fi.v3 K1;
    public fi.f6 K2;
    public UndoView K3;
    public int K4;
    public TLObject K5;
    public final int[] K6;
    public int K7;
    public final kf K8;
    public float K9;
    public boolean Ka;
    public int Kb;
    public mn Kc;
    public final hh.e L;
    public int L0;
    public fi.v3 L1;
    public org.telegram.ui.Components.tg0 L2;
    public dl L3;
    public final ArrayList L4;
    public int L5;
    public final int[] L6;
    public int L7;
    public final hh.b L8;
    public float L9;
    public float La;
    public org.telegram.ui.ActionBar.e2 Lb;
    public fn Lc;
    public ch.b M;
    public Drawable M0;
    public fi.v3 M1;
    public boolean M2;
    public org.telegram.ui.Components.qc M3;
    public int M4;
    public int M5;
    public final int[] M6;
    public boolean M7;
    public ch.b M8;
    public float M9;
    public int Ma;
    public int Mb;
    public bi.m7 Mc;
    public org.telegram.ui.ActionBar.e2 N;
    public Drawable N0;
    public rl N1;
    public final org.telegram.ui.Components.y9[] N2;
    public boolean N3;
    public int N4;
    public boolean N5;
    public final int[] N6;
    public int N7;
    public Bitmap N8;
    public TLRPC.Document N9;
    public int Na;
    public int Nb;
    public boolean Nc;
    public boolean O;
    public Drawable O0;
    public float O1;
    public final tn[] O2;
    public int O3;
    public kf O4;
    public TLRPC.PhotoSize O5;
    public final boolean[] O6;
    public int O7;
    public BitmapShader O8;
    public boolean O9;
    public ChatMessageSharedResources Oa;
    public boolean Ob;
    public boolean Oc;
    public FrameLayout P;
    public boolean P0;
    public TL_stories.TL_premium_boostsStatus P1;
    public final org.telegram.ui.ActionBar.b6[] P2;
    public boolean P3;
    public boolean P4;
    public TLRPC.PhotoSize P5;
    public final boolean[] P6;
    public int P7;
    public Paint P8;
    public boolean P9;
    public ValueAnimator Pa;
    public int Pb;
    public float Pc;
    public fi.f6 Q;
    public int Q0;
    public ChannelBoostsController.CanApplyBoost Q1;
    public final jn[] Q2;
    public FlagSecureReason Q3;
    public boolean Q4;
    public TLObject Q5;
    public final boolean[] Q6;
    public boolean Q7;
    public Matrix Q8;
    public long Q9;
    public float Qa;
    public boolean Qb;
    public float Qc;
    public kk R;
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
    public cl Ra;
    public int Rb;
    public final oe.b Rc;
    public jh.f S;
    public final Set S0;
    public le S1;
    public int S2;
    public MessageObject S3;
    public int S4;
    public TLRPC.WebPage S5;
    public boolean S6;
    public boolean S7;
    public final Paint S8;
    public int S9;
    public final ml Sa;
    public int Sb;
    public final oe.b Sc;
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
    public final tl Ta;
    public int Tb;
    public final oe.b Tc;
    public FrameLayout U;
    public boolean U0;
    public zj U1;
    public boolean U2;
    public MessageObject U3;
    public int U4;
    public String U5;
    public boolean U6;
    public boolean U7;
    public boolean U8;
    public int U9;
    public ArrayList Ua;
    public CharacterStyle Ub;
    public final oe.b Uc;
    public FrameLayout V;
    public fi.v3 V0;
    public di.a3 V1;
    public ImageView V2;
    public MessageObject V3;
    public HashMap V4;
    public k9.u V5;
    public int V6;
    public MessageObject V7;
    public View V8;
    public boolean V9;
    public final ci Va;
    public String Vb;
    public final oe.b Vc;
    public final jh.m W;
    public fi.v3 W0;
    public org.telegram.ui.ActionBar.q0 W1;
    public RadialProgressView W2;
    public bh.r W3;
    public final SparseArray W4;
    public TLRPC.ChatInvite W5;
    public int W6;
    public MessageObject W7;
    public float W8;
    public boolean W9;
    public final hi Wa;
    public qf.c Wb;
    public final oe.b Wc;
    public lh.f X;
    public fi.v3 X0;
    public TextView X1;
    public ImageView X2;
    public bi.r1 X3;
    public int X4;
    public le X5;
    public long X6;
    public int X7;
    public float X8;
    public boolean X9;
    public final aj Xa;
    public boolean Xb;
    public final oe.b Xc;
    public hk Y;
    public org.telegram.ui.Components.ch Y0;
    public boolean Y1;
    public AnimatorSet Y2;
    public ig.n1 Y3;
    public final int[] Y4;
    public final LongSparseIntArray Y5;
    public boolean Y6;
    public boolean Y7;
    public Integer Y8;
    public org.telegram.ui.Components.si Y9;
    public final gn Ya;
    public le Yb;
    public final k6.m Yc;
    public ik Z;
    public boolean Z0;
    public TextView Z1;
    public FrameLayout Z2;
    public jh.e Z3;
    public int Z4;
    public boolean Z5;
    public long Z6;
    public boolean Z7;
    public int Z8;
    public float Z9;
    public final kf Za;
    public boolean Zb;
    public sh.c Zc;
    public int f44176a;
    public bh.r f44177a0;
    public lk f44178a1;
    public TextView a2;
    public pk f44179a3;
    public int f44180a4;
    public boolean f44181a5;
    public boolean f44182a6;
    public final ArrayList f44183a7;
    public long f44184a8;
    public boolean f44185a9;
    public float f44186aa;
    public final jg f44187ab;
    public boolean f44188ac;
    public final Rect ad;
    public boolean f44189b;
    public int f44190b0;
    public lh.c f44191b1;
    public tk f44192b2;
    public TextView f44193b3;
    public TL_account.TL_businessChatLink f44194b4;
    public int f44195b5;
    public long f44196b6;
    public final Paint f44197b7;
    public String f44198b8;
    public AnimatorSet f44199b9;
    public rp f44200ba;
    public boolean f44201bb;
    public final RectF f44202bc;
    public boolean f44203c;
    public org.telegram.ui.ActionBar.u0 f44204c0;
    public FrameLayout f44205c1;
    public TextView f44206c2;
    public TextView f44207c3;
    public String f44208c4;
    public int f44209c5;
    public boolean f44210c6;
    public final Paint f44211c7;
    public Integer f44212c8;
    public org.telegram.ui.ActionBar.o1 f44213c9;
    public Animator f44214ca;
    public boolean f44215cb;
    public org.telegram.ui.ActionBar.e2 f44216cc;
    public boolean d;
    public yr f44217d0;
    public LinearLayout f44218d1;
    public org.telegram.ui.Components.e41 f44219d2;
    public kk f44220d3;
    public int f44221d4;
    public boolean f44222d5;
    public boolean f44223d6;
    public final ColorMatrix f44224d7;
    public byte[] f44225d8;
    public boolean f44226d9;
    public boolean f44227da;
    public long f44228db;
    public long f44229dc;
    public TLRPC.Chat e;
    public org.telegram.ui.ActionBar.y f44230e0;
    public org.telegram.ui.Components.vo f44231e1;
    public jg.e f44232e2;
    public ImageView f44233e3;
    public int f44234e4;
    public boolean f44235e5;
    public boolean f44236e6;
    public final m.d3 f44237e7;
    public int f44238e8;
    public org.telegram.ui.ActionBar.g1[] f44239e9;
    public boolean f44240ea;
    public org.telegram.ui.Components.md eb;
    public final jg f44241ec;
    public TLRPC.User f44242f;
    public org.telegram.ui.ActionBar.u0 f44243f0;
    public mi f44244f1;
    public org.telegram.ui.Components.z90 f44245f2;
    public ImageView f44246f3;
    public boolean f44247f4;
    public AnimatorSet f44248f5;
    public long f44249f6;
    public final org.telegram.ui.ActionBar.l5 f7;
    public int f44250f8;
    public org.telegram.ui.ActionBar.g1 f44251f9;
    public un f44252fa;
    public boolean f44253fb;
    public int f44254fc;
    public org.telegram.ui.ActionBar.u0 f44255g0;
    public jg.d2 f44256g1;
    public ImageView f44257g2;
    public org.telegram.ui.Components.s6 f44258g3;
    public String f44259g4;
    public final SparseIntArray f44260g5;
    public Long f44261g6;
    public long g7;
    public le f44262g8;
    public final fk f44263g9;
    public float f44264ga;
    public boolean f44265gb;
    public boolean gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.w0 f44266h0;
    public jg.a0 f44267h1;
    public hi.u f44268h2;
    public org.telegram.ui.Components.s6 f44269h3;
    public byte[] f44270h4;
    public final SparseIntArray f44271h5;
    public int f44272h6;
    public int f44273h7;
    public String f44274h8;
    public gm f44275h9;
    public AnimatorSet f44276ha;
    public boolean f44277hb;
    public Pattern f44278hc;
    public org.telegram.ui.ActionBar.y f44279i0;
    public jh.k f44280i1;
    public TextView f44281i2;
    public org.telegram.ui.Components.s6 f44282i3;
    public String f44283i4;
    public boolean f44284i5;
    public final SparseArray[] f44285i6;
    public int f44286i7;
    public ChatObject.Call f44287i8;
    public ok f44288i9;
    public final pk ia;
    public MessageObject f44289ib;
    public MessageObject f44290ic;
    public org.telegram.ui.ActionBar.w0 f44291j0;
    public mm f44292j1;
    public bk f44293j2;
    public yj f44294j3;
    public MessageObject f44295j4;
    public boolean f44296j5;
    public final SparseArray[] f44297j6;
    public final Matrix f44298j7;
    public boolean f44299j8;
    public int f44300j9;
    public wh.i ja;
    public boolean f44301jb;
    public cf f44302jc;
    public org.telegram.ui.ActionBar.w0 f44303k0;
    public org.telegram.ui.Components.qo f44304k1;
    public FrameLayout f44305k2;
    public wj f44306k3;
    public MessageObject f44307k4;
    public boolean f44308k5;
    public final SparseArray[] f44309k6;
    public LinearGradient f44310k7;
    public boolean f44311k8;
    public int f44312k9;
    public bh.x f44313ka;
    public boolean f44314kb;
    public ArrayList f44315kc;
    public org.telegram.ui.ActionBar.u0 f44316l0;
    public final ArrayList l1;
    public bk f44317l2;
    public org.telegram.ui.Cells.v0 f44318l3;
    public boolean l4;
    public boolean f44319l5;
    public boolean f44320l6;
    public int f44321l7;
    public TLRPC.ChatFull f44322l8;
    public int f44323l9;
    public c41 f44324la;
    public int f44325lb;
    public final BotForumHelper.BotDraftAnimationsPool f44326lc;
    public org.telegram.ui.ActionBar.w0 m0;
    public ij f44327m1;
    public FrameLayout f44328m2;
    public int f44329m3;
    public ArrayList f44330m4;
    public boolean f44331m5;
    public int f44332m6;
    public int f44333m7;
    public TLRPC.UserFull f44334m8;
    public boolean f44335m9;
    public boolean f44336ma;
    public int f44337mb;
    public final jh.a f44338mc;
    public boolean f44339n;
    public org.telegram.ui.ActionBar.y f44340n0;
    public org.telegram.ui.Components.s6 f44341n1;
    public TextView f44342n2;
    public org.telegram.ui.Components.t60 f44343n3;
    public MessageObject f44344n4;
    public boolean f44345n5;
    public int f44346n6;
    public final Paint f44347n7;
    public org.telegram.ui.Cells.k6 f44348n8;
    public boolean f44349n9;
    public org.telegram.ui.Components.yp f44350na;
    public NotificationCenter.ObserversGroup f44351nb;
    public boolean f44352nc;
    public boolean f44353o0;
    public eh f44354o1;
    public org.telegram.ui.Components.c10 f44355o2;
    public View f44356o3;
    public TLRPC.TL_forumTopic f44357o4;
    public MessageObject f44358o5;
    public int f44359o6;
    public final Matrix f44360o7;
    public y01 f44361o8;
    public nm f44362o9;
    public sn f44363oa;
    public boolean f44364ob;
    public boolean f44365oc;
    public RadialProgressView f44366p0;
    public org.telegram.ui.Components.tz0 f44367p1;
    public org.telegram.ui.Components.ey0 f44368p2;
    public boolean f44369p3;
    public long f44370p4;
    public MessageObject f44371p5;
    public int f44372p6;
    public LinearGradient f44373p7;
    public final a0.h f44374p8;
    public View f44375p9;
    public un f44376pa;
    public int pb;
    public boolean pc;
    public org.telegram.ui.ActionBar.u0 f44377q0;
    public org.telegram.ui.ActionBar.u0 f44378q1;
    public org.telegram.ui.Components.t40 f44379q2;
    public boolean f44380q3;
    public int f44381q4;
    public MessageObject.GroupedMessages q5;
    public int f44382q6;
    public boolean f44383q7;
    public String f44384q8;
    public boolean q9;
    public sn f44385qa;
    public int f44386qb;
    public long f44387qc;
    public long f44388r;
    public org.telegram.ui.ActionBar.u0 f44389r0;
    public org.telegram.ui.ActionBar.u0 f44390r1;
    public org.telegram.ui.Components.t40 f44391r2;
    public boolean f44392r3;
    public TLRPC.Chat f44393r4;
    public MessagePreviewParams f44394r5;
    public int r6;
    public boolean f44395r7;
    public long f44396r8;
    public boolean f44397r9;
    public yh.d f44398ra;
    public boolean f44399rb;
    public boolean f44400rc;
    public final HashMap f44401s;
    public org.telegram.ui.ActionBar.u0 f44402s0;
    public org.telegram.ui.ActionBar.u0 f44403s1;
    public bj f44404s2;
    public AnimatorSet f44405s3;
    public boolean f44406s4;
    public MessageSuggestionParams f44407s5;
    public int f44408s6;
    public int f44409s7;
    public String f44410s8;
    public boolean f44411s9;
    public final ChatMessagesMetadataController f44412sa;
    public boolean f44413sb;
    public boolean f44414sc;
    public org.telegram.ui.ActionBar.u0 f44415t0;
    public org.telegram.ui.ActionBar.u0 f44416t1;
    public boolean f44417t2;
    public ValueAnimator f44418t3;
    public boolean f44419t4;
    public MessageObject f44420t5;
    public final ArrayList f44421t6;
    public boolean f44422t7;
    public boolean f44423t8;
    public kl f44424t9;
    public TLRPC.TL_channels_sendAsPeers f44425ta;
    public a0.h f44426tb;
    public boolean f44427tc;
    public ClippingImageView f44428u0;
    public org.telegram.ui.Components.bp f44429u1;
    public org.telegram.ui.Components.t40 f44430u2;
    public float f44431u3;
    public boolean f44432u4;
    public MessageObject.GroupedMessages f44433u5;
    public boolean f44434u6;
    public boolean f44435u7;
    public boolean f44436u8;
    public boolean f44437u9;
    public TL_account.resolvedBusinessChatLinks f44438ua;
    public a0.h f44439ub;
    public boolean f44440uc;
    public final jj v;
    public org.telegram.ui.Components.g21 f44441v0;
    public lh.h f44442v1;
    public boolean f44443v2;
    public boolean f44444v3;
    public boolean f44445v4;
    public MessageObject.GroupedMessages f44446v5;
    public int f44447v6;
    public int f44448v7;
    public String f44449v8;
    public float f44450v9;
    public boolean va;
    public long f44451vb;
    public d9 f44452vc;
    public cj f44453w;
    public jh.g f44454w0;
    public boolean f44455w1;
    public org.telegram.ui.Components.t40 f44456w2;
    public boolean f44457w3;
    public int f44458w4;
    public MessageObject f44459w5;
    public int f44460w6;
    public boolean f44461w7;
    public String f44462w8;
    public ak f44463w9;
    public boolean f44464wa;
    public xk f44465wb;
    public int f44466wc;
    public cj f44467x;
    public oj f44468x0;
    public int f44469x1;
    public org.telegram.ui.Components.t40 f44470x2;
    public boolean f44471x3;
    public int f44472x4;
    public kn f44473x5;
    public int f44474x6;
    public boolean f44475x7;
    public MessageObject f44476x8;
    public org.telegram.ui.Cells.s1 x9;
    public float f44477xa;
    public boolean f44478xb;
    public ValueAnimator f44479xc;
    public final se.b f44480y;
    public qj f44481y0;
    public int f44482y1;
    public org.telegram.ui.Components.t40 f44483y2;
    public boolean y3;
    public int f44484y4;
    public boolean f44485y5;
    public boolean f44486y6;
    public boolean f44487y7;
    public MessageObject f44488y8;
    public org.telegram.ui.Components.z00 f44489y9;
    public final fg f44490ya;
    public boolean f44491yb;
    public oi f44492yc;
    public rj f44493z0;
    public org.telegram.ui.Components.qc f44494z1;
    public org.telegram.ui.Components.t40 f44495z2;
    public boolean f44496z3;
    public sh f44497z4;
    public MessageObject f44498z5;
    public final ArrayList f44499z6;
    public int f44500z7;
    public int f44501z8;
    public boolean f44502z9;
    public final yk f44503za;
    public boolean f44504zb;
    public boolean zc;

    public un(Bundle bundle) {
        super(bundle);
        this.f44176a = 0;
        this.f44203c = false;
        this.d = false;
        this.f44401s = new HashMap();
        this.v = new jj(this, new kf(this, 24));
        se.b bVar = new se.b();
        this.f44480y = bVar;
        se.b bVar2 = new se.b();
        this.E = bVar2;
        this.W = new jh.m();
        this.H0 = org.telegram.ui.ActionBar.y6.Sh;
        this.Q0 = -1;
        this.R0 = Collections.newSetFromMap(new WeakHashMap());
        this.S0 = Collections.newSetFromMap(new WeakHashMap());
        this.l1 = new ArrayList();
        this.N2 = new org.telegram.ui.Components.y9[2];
        this.O2 = new tn[2];
        this.P2 = new org.telegram.ui.ActionBar.b6[2];
        this.Q2 = new jn[2];
        this.T2 = new AnimatorSet[2];
        this.U2 = false;
        this.f44329m3 = 500;
        this.f44194b4 = null;
        this.f44234e4 = -1;
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
        this.f44260g5 = new SparseIntArray();
        this.f44271h5 = new SparseIntArray();
        this.f44319l5 = true;
        this.f44345n5 = true;
        this.C5 = true;
        this.F5 = true;
        this.Y5 = new LongSparseIntArray();
        this.f44272h6 = 1;
        this.f44285i6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44297j6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44309k6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f44421t6 = new ArrayList();
        this.f44434u6 = true;
        this.f44460w6 = Integer.MIN_VALUE;
        this.f44499z6 = new ArrayList();
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
        this.f44183a7 = new ArrayList();
        this.f44197b7 = new Paint(1);
        this.f44211c7 = new Paint(1);
        this.f44224d7 = new ColorMatrix();
        this.f44237e7 = new m.d3();
        this.f7 = new org.telegram.ui.ActionBar.l5(0, false, false, new xj(this, 0));
        this.f44298j7 = new Matrix();
        Paint paint = new Paint(1);
        this.f44347n7 = paint;
        this.f44360o7 = new Matrix();
        this.f44500z7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.J7 = Integer.MAX_VALUE;
        this.K7 = -1;
        this.S7 = true;
        this.X7 = Integer.MAX_VALUE;
        this.f44238e8 = -1;
        this.f44250f8 = -10000;
        this.f44374p8 = new a0.h();
        this.K8 = new kf(this, 26);
        hh.b bVar3 = new hh.b();
        this.L8 = bVar3;
        this.M8 = new ch.b(bVar3);
        this.S8 = new Paint(1);
        this.T8 = 0.0f;
        this.W8 = 1.0f;
        this.X8 = 0.0f;
        this.f44226d9 = true;
        this.f44263g9 = new fk(this);
        this.f44502z9 = true;
        this.ia = new pk(this, 0);
        this.f44412sa = new ChatMessagesMetadataController(this);
        this.f44490ya = new fg(this, 0);
        this.f44503za = new yk(this);
        this.Ba = -1;
        this.Sa = new ml(this);
        this.Ta = new tl(this);
        this.Va = new ci(this);
        this.Wa = new hi(this);
        this.Xa = new aj(this);
        this.Ya = new gn(this);
        this.Za = new kf(this, 29);
        this.f44187ab = new jg(this, 2);
        this.f44337mb = Integer.MIN_VALUE;
        this.f44504zb = false;
        this.f44202bc = new RectF();
        this.f44241ec = new jg(this, 5);
        this.f44326lc = new BotForumHelper.BotDraftAnimationsPool();
        this.f44338mc = new Object();
        this.zc = false;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.Rc = new oe.b(0, this, dsVar, 320L, false);
        this.Sc = new oe.b(1, this, dsVar, 520L, false);
        this.Tc = new oe.b(2, this, dsVar, 520L, false);
        this.Uc = new oe.b(3, this, dsVar, 320L, false);
        this.Vc = new oe.b(4, this, dsVar, 320L, false);
        this.Wc = new oe.b(5, this, dsVar, 320L, false);
        this.Xc = new oe.b(6, this, dsVar, 320L, false);
        jg jgVar = new jg(this, 8);
        ?? obj = new Object();
        obj.f16424b = new float[32];
        obj.f16423a = 1;
        obj.d = new oe.l(obj, ne.a.f18779a, 240L);
        obj.f16425c = jgVar;
        this.Yc = obj;
        this.ad = new Rect();
        ?? obj2 = new Object();
        this.L = obj2;
        if (Build.VERSION.SDK_INT >= 31 && SharedConfig.chatBlurEnabled()) {
            ch.f fVar = new ch.f();
            this.F = fVar;
            this.G = Math.max(0, AndroidUtilities.dp(48.0f) - Math.min(AndroidUtilities.navigationBarHeight, AndroidUtilities.statusBarHeight));
            hh.d dVar = new hh.d(obj2);
            this.I = dVar;
            dVar.d = fVar;
            dVar.e = -3;
            dVar.f12841f = obj2;
            ch.b bVar4 = new ch.b(dVar);
            this.K = bVar4;
            bVar4.f6303i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                hh.d dVar2 = new hh.d(obj2);
                this.H = dVar2;
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f12841f = obj2;
                ch.b bVar5 = new ch.b(dVar2);
                this.J = bVar5;
                bVar5.f6303i = LiteMode.isEnabled(262144);
            } else {
                this.H = null;
                this.J = this.K;
            }
        } else {
            this.F = null;
            this.G = 0;
            this.H = null;
            this.I = null;
            this.J = new ch.b(obj2);
            this.K = new ch.b(obj2);
        }
        ch.b bVar6 = new ch.b(obj2);
        this.M = bVar6;
        bVar6.e = bVar;
        this.J.e = bVar;
        this.K.e = bVar;
        this.M8.e = new se.b();
        this.M.d = bVar2;
        this.J.d = bVar2;
        this.K.d = bVar2;
        this.M8.d = bVar2;
    }

    public static void A0(un unVar, boolean z10, TLRPC.TL_error tL_error, TLObject tLObject, long j10, boolean z11, boolean z12, boolean z13, TLObject tLObject2) {
        int i10;
        boolean z14;
        unVar.f44265gb = false;
        if (!z10 && (tL_error != null || !(tLObject instanceof TLRPC.Updates))) {
            if (z12) {
                unVar.f44277hb = false;
            }
            if (tL_error != null) {
                org.telegram.ui.Components.g5.e0(unVar.currentAccount, tL_error, unVar, tLObject2, new Object[0]);
            }
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                unVar.getMessagesController().putUsers(updates.users, false);
                unVar.getMessagesController().putChats(updates.chats, false);
            }
            TLRPC.Chat chat = unVar.getMessagesController().getChat(Long.valueOf(j10));
            if (chat != null) {
                if (z11 && !z12) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                chat.in_news = z14;
                if (z12) {
                    chat.left = true;
                }
                ArrayList arrayList = new ArrayList();
                arrayList.add(chat);
                unVar.getMessagesStorage().putUsersAndChats(null, arrayList, true, true);
                unVar.e = chat;
            }
            if (z12) {
                unVar.getMessagesController().deleteDialog(-j10, 3);
            }
            unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelNewsUpdated, Long.valueOf(j10));
            unVar.getMessagesController().sortDialogs(null);
            unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
            if (!unVar.isFinishing()) {
                if (z13) {
                    i10 = R.string.ChannelAddedToNewsBulletin;
                } else if (z12) {
                    i10 = R.string.ChannelRemovedFromNewsBulletin;
                } else if (z11) {
                    i10 = R.string.ChannelRemovedFromChatsBulletin;
                } else {
                    i10 = R.string.ChannelAddedToChatsBulletin;
                }
                unVar.Ib(i10);
            }
        }
        if (unVar.B0 != null) {
            unVar.Gb(false, true);
            unVar.uc(false);
        }
    }

    public static void A1(un unVar, long j10, long j11) {
        bi.ca.y(unVar.currentAccount, false).C(j10, j11, new bi.l5(unVar, j10, j11, 1));
    }

    public static void B0(un unVar, TLRPC.Document document) {
        unVar.H4.put(document, 0);
        SendMessagesHelper.getInstance(unVar.currentAccount).sendSticker(document, null, unVar.f44249f6, null, null, null, unVar.f44473x5, null, true, 0, 0, false, null, unVar.L8(), 0L, unVar.X8(), unVar.f44407s5);
    }

    public static void B1(un unVar, Context context) {
        boolean z10;
        boolean z11;
        boolean z12;
        int i10;
        int i11;
        int i12;
        int i13;
        boolean z13;
        org.telegram.ui.Components.ch chVar;
        boolean z14;
        String str;
        SparseArray[] sparseArrayArr = unVar.f44285i6;
        if (unVar.getParentActivity() != null && unVar.Z9 == 0.0f) {
            if (unVar.f44221d4 == 3) {
                Bundle bundle = new Bundle();
                long S8 = unVar.S8();
                if (S8 >= 0) {
                    bundle.putLong("user_id", S8);
                } else {
                    bundle.putLong("chat_id", -S8);
                }
                unVar.presentFragment(new un(bundle));
                return;
            }
            boolean z15 = false;
            if (unVar.J9()) {
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArrayArr[0].size(); i14++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i14)));
                }
                unVar.Gb(true, true);
                byte[] bArr = unVar.f44270h4;
                String str2 = unVar.f44283i4;
                ye yeVar = new ye(unVar, 2);
                int i15 = v21.f44574w;
                int currentAccount = unVar.getCurrentAccount();
                Activity parentActivity = unVar.getParentActivity();
                long a2 = unVar.a();
                if (parentActivity != null) {
                    v21.N(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.wc.b0(unVar), unVar.getResourceProvider(), bArr, str2, yeVar);
                }
            } else if (unVar.f44221d4 == 2) {
                unVar.finishFragment();
                gm gmVar = unVar.f44275h9;
                if (unVar.B0.getTag() == null) {
                    z15 = true;
                }
                gmVar.T(true, z15);
            } else {
                TLRPC.User user = unVar.f44242f;
                if (user != null && user.f22174id == 489000) {
                    unVar.nc(true);
                } else if (user != null && unVar.f44339n) {
                    if (user.bot) {
                        String str3 = unVar.f44384q8;
                        unVar.f44384q8 = null;
                        unVar.getMessagesController().unblockPeer(unVar.f44242f.f22174id, new se(unVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44385qa);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new pe(unVar, 8));
                    e2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    unVar.showDialog(e2Var);
                } else if (UserObject.isReplyUser(user)) {
                    unVar.nc(true);
                } else {
                    TLRPC.User user2 = unVar.f44242f;
                    if (user2 != null && user2.bot && (str = unVar.f44384q8) != null) {
                        if (str.length() != 0) {
                            unVar.getMessagesController().sendBotStart(unVar.f44242f, unVar.f44384q8);
                        } else {
                            unVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", unVar.f44249f6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        unVar.f44384q8 = null;
                        unVar.uc(false);
                        return;
                    }
                    if (ChatObject.isChannel(unVar.e)) {
                        TLRPC.Chat chat = unVar.e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (!unVar.f44265gb) {
                                if (ChatObject.isNotInChat(chat) && (!unVar.G9() || !unVar.e.in_news)) {
                                    if (unVar.e.join_request) {
                                        unVar.Gb(true, true);
                                        MessagesController messagesController = MessagesController.getInstance(unVar.currentAccount);
                                        long j10 = unVar.e.f22027id;
                                        TLRPC.User currentUser = UserConfig.getInstance(unVar.currentAccount).getCurrentUser();
                                        le leVar = new le(unVar, 18);
                                        m4.s0 s0Var = new m4.s0(14, unVar, context);
                                        if (unVar.G9() && unVar.f44253fb) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        messagesController.addUserToChat(j10, currentUser, 0, null, null, true, leVar, s0Var, null, z14);
                                        return;
                                    }
                                    le leVar2 = unVar.X5;
                                    if (leVar2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(leVar2);
                                        unVar.X5 = null;
                                    }
                                    if (unVar.G9() && unVar.f44253fb) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    unVar.Gb(true, true);
                                    unVar.getMessagesController().addUserToChat(unVar.e.f22027id, unVar.getUserConfig().getCurrentUser(), 0, null, unVar, false, new af(unVar, z13, 0), null, null, z13);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                    org.telegram.ui.ActionBar.q0 q0Var = unVar.W1;
                                    if (q0Var != null && (chVar = unVar.Y0) != null && chVar.d(q0Var) && unVar.Z1.getVisibility() != 8 && unVar.Z1.getTag(R.id.object_tag) != null) {
                                        MessagesController.getNotificationsSettings(unVar.currentAccount).edit().putInt("dialog_bar_vis3" + unVar.f44249f6, 3).commit();
                                        unVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(unVar.f44249f6));
                                        return;
                                    }
                                    return;
                                } else if (unVar.G9()) {
                                    if (unVar.G9() && !unVar.f44265gb && unVar.getParentActivity() != null) {
                                        boolean z16 = unVar.e.in_news;
                                        boolean isDialogMuted = unVar.getMessagesController().isDialogMuted(unVar.f44249f6, 0L);
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) unVar.getMessagesController().dialogs_dict.f(unVar.f44249f6);
                                        if (dialog != null && dialog.folder_id == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        org.telegram.ui.Components.md mdVar = unVar.eb;
                                        if (mdVar == null || !mdVar.isShowing()) {
                                            org.telegram.ui.Components.md mdVar2 = new org.telegram.ui.Components.md(unVar.f44178a1, unVar.f44385qa, unVar.J);
                                            unVar.eb = mdVar2;
                                            if (!z16) {
                                                if (isDialogMuted) {
                                                    i12 = R.drawable.msg_notifications;
                                                } else {
                                                    i12 = R.drawable.input_notify_off;
                                                }
                                                if (isDialogMuted) {
                                                    i13 = R.string.ChannelNotify;
                                                } else {
                                                    i13 = R.string.ChannelDoNotNotify;
                                                }
                                                mdVar2.b(i12, LocaleController.getString(i13), false, new af(unVar, isDialogMuted, 2));
                                            }
                                            if (z16) {
                                                mdVar2.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.ChannelAddToChats), false, new kf(unVar, 15));
                                                mdVar2.b(R.drawable.msg_leave, LocaleController.getString(R.string.ChannelRemoveFromNews), true, new kf(unVar, 16));
                                            } else {
                                                if (z12) {
                                                    i10 = R.drawable.msg_unarchive;
                                                } else {
                                                    i10 = R.drawable.msg_archive;
                                                }
                                                if (z12) {
                                                    i11 = R.string.Unarchive;
                                                } else {
                                                    i11 = R.string.Archive;
                                                }
                                                mdVar2.b(i10, LocaleController.getString(i11), false, new af(unVar, z12, 3));
                                                mdVar2.b(R.drawable.msg_chats_remove, LocaleController.getString(R.string.ChannelRemoveFromChats), true, new kf(unVar, 17));
                                            }
                                            if (!mdVar2.isShowing()) {
                                                FrameLayout frameLayout = mdVar2.f30526b;
                                                if (frameLayout.isAttachedToWindow() && frameLayout.getWidth() != 0) {
                                                    Rect rect = new Rect();
                                                    frameLayout.getWindowVisibleDisplayFrame(rect);
                                                    int[] iArr = new int[2];
                                                    frameLayout.getLocationOnScreen(iArr);
                                                    int g7 = d3.g(32.0f, rect.width(), AndroidUtilities.dp(232.0f));
                                                    int min = Math.min(AndroidUtilities.dp(16.0f) + Math.max(g7, frameLayout.getWidth()), rect.width());
                                                    org.telegram.ui.Components.ld ldVar = mdVar2.f30527c;
                                                    LinearLayout linearLayout = ldVar.f30170a;
                                                    int dp = AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(48.0f) * linearLayout.getChildCount());
                                                    mdVar2.setWidth(min);
                                                    mdVar2.setHeight(dp);
                                                    int max = Math.max(rect.left, Math.min(rect.right - min, ((frameLayout.getWidth() - min) / 2) + iArr[0]));
                                                    int dp2 = (AndroidUtilities.dp(8.0f) + (frameLayout.getHeight() + iArr[1])) - dp;
                                                    ldVar.f30171b.set(iArr[0] - max, (dp - AndroidUtilities.dp(8.0f)) - frameLayout.getHeight(), frameLayout.getWidth() + (iArr[0] - max), dp - AndroidUtilities.dp(8.0f));
                                                    int i16 = min - g7;
                                                    ldVar.f30172c.set(i16 / 2.0f, AndroidUtilities.dp(8.0f), (min + g7) / 2.0f, dp - AndroidUtilities.dp(8.0f));
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                                                    layoutParams.width = g7;
                                                    layoutParams.height = dp - AndroidUtilities.dp(16.0f);
                                                    layoutParams.leftMargin = i16 / 2;
                                                    layoutParams.topMargin = AndroidUtilities.dp(8.0f);
                                                    linearLayout.setLayoutParams(layoutParams);
                                                    mdVar2.f30528f = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                                                    frameLayout.draw(new Canvas(mdVar2.f30528f));
                                                    ldVar.f30174n = 0.0f;
                                                    mdVar2.f30529g = false;
                                                    mdVar2.showAtLocation(frameLayout, 51, max, dp2);
                                                    frameLayout.addOnAttachStateChangeListener(mdVar2.f30530i);
                                                    mdVar2.f30525a.setCenterMenuVisible(true);
                                                    mdVar2.c(1.0f);
                                                    return;
                                                }
                                                return;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                } else {
                                    unVar.nc(true);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = unVar.f44322l8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = unVar.e;
                    TLRPC.User user3 = unVar.f44242f;
                    if (unVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.g5.r(unVar, false, chat2, user3, z11, true, false, z10, new pe(unVar, 9));
                }
            }
        }
    }

    public static void C0(un unVar) {
        long j10;
        ArrayList arrayList = unVar.f44421t6;
        arrayList.add(Integer.valueOf(unVar.f44272h6));
        if (unVar.f44221d4 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(unVar.currentAccount);
            String str = unVar.G3;
            int i10 = unVar.classGuid;
            int i11 = unVar.f44180a4;
            int i12 = unVar.f44272h6;
            unVar.f44272h6 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (unVar.I7 != 0) {
            MessagesController messagesController = unVar.getMessagesController();
            long j11 = unVar.f44249f6;
            long j12 = unVar.X6;
            int i13 = unVar.I7;
            int i14 = unVar.classGuid;
            int i15 = unVar.f44221d4;
            long j13 = unVar.f44370p4;
            int i16 = unVar.f44484y4;
            int i17 = unVar.f44272h6;
            unVar.f44272h6 = i17 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j13, i16, i17, unVar.f44419t4);
        } else if (unVar.G7 != 0 && (!unVar.O9() || unVar.G7 == unVar.X7 || unVar.f44419t4)) {
            int i18 = unVar.f44448v7;
            if (i18 != 0) {
                unVar.X6 = i18;
                MessagesController messagesController2 = unVar.getMessagesController();
                long j14 = unVar.X6;
                boolean z10 = unVar.f44422t7;
                int i19 = unVar.f44409s7;
                int i20 = unVar.G7;
                int i21 = unVar.classGuid;
                int i22 = unVar.f44221d4;
                long j15 = unVar.f44370p4;
                int i23 = unVar.f44484y4;
                int i24 = unVar.f44272h6;
                unVar.f44272h6 = i24 + 1;
                messagesController2.loadMessages(j14, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j15, i23, i24, unVar.f44419t4);
            } else {
                MessagesController messagesController3 = unVar.getMessagesController();
                long j16 = unVar.f44249f6;
                long j17 = unVar.X6;
                boolean z11 = unVar.f44422t7;
                int i25 = unVar.f44409s7;
                int i26 = unVar.G7;
                int i27 = unVar.classGuid;
                int i28 = unVar.f44221d4;
                long j18 = unVar.f44370p4;
                int i29 = unVar.f44484y4;
                int i30 = unVar.f44272h6;
                unVar.f44272h6 = i30 + 1;
                messagesController3.loadMessages(j16, j17, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j18, i29, i30, unVar.f44419t4);
            }
        } else if (unVar.f44435u7) {
            unVar.f44272h6++;
        } else {
            MessagesController messagesController4 = unVar.getMessagesController();
            long j19 = unVar.f44249f6;
            long j20 = unVar.X6;
            boolean z12 = unVar.f44422t7;
            int i31 = unVar.f44409s7;
            int i32 = unVar.G7;
            int i33 = unVar.classGuid;
            int i34 = unVar.f44221d4;
            long j21 = unVar.f44370p4;
            int i35 = unVar.f44484y4;
            int i36 = unVar.f44272h6;
            unVar.f44272h6 = i36 + 1;
            messagesController4.loadMessages(j19, j20, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j21, i35, i36, unVar.f44419t4);
        }
        int i37 = unVar.f44221d4;
        if (i37 == 0 || (i37 == 3 && unVar.S8() == unVar.getUserConfig().getClientUserId())) {
            if (unVar.O9() && !unVar.f44419t4) {
                return;
            }
            arrayList.add(Integer.valueOf(unVar.f44272h6));
            MessagesController messagesController5 = unVar.getMessagesController();
            long j22 = unVar.f44249f6;
            long j23 = unVar.X6;
            int i38 = unVar.classGuid;
            if (unVar.f44221d4 == 3) {
                j10 = 0;
            } else {
                j10 = unVar.f44370p4;
            }
            long j24 = j10;
            int i39 = unVar.f44484y4;
            int i40 = unVar.f44272h6;
            unVar.f44272h6 = i40 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j24, i39, i40, unVar.f44419t4);
        }
    }

    public static void C1(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, of ofVar) {
        String str4;
        org.telegram.ui.Components.w41 w41Var;
        if (unVar.f44371p5 != null && i10 < arrayList.size() && unVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = unVar.getParentActivity();
            int i11 = iArr[0];
            kf kfVar = new kf(unVar, 23);
            String[] strArr = org.telegram.ui.Components.f51.X;
            if (parentActivity == null) {
                w41Var = null;
            } else {
                org.telegram.ui.Components.w41 w41Var2 = new org.telegram.ui.Components.w41(parentActivity, str, str4, inputPeer, i11, richMessage, kfVar);
                w41Var2.Q(z10);
                w41Var2.S = unVar;
                w41Var2.T = ofVar;
                if (unVar.getParentActivity() != null) {
                    unVar.showDialog(w41Var2);
                }
                w41Var = w41Var2;
            }
            w41Var.setDimBehind(false);
            unVar.H7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(unVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + unVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(unVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + unVar.a(), i12 - 1).apply();
                unVar.dd(true);
            }
        }
    }

    public static boolean C9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void D0(un unVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(unVar.currentAccount).sendSticker(tL_document, str, unVar.f44249f6, unVar.f44498z5, unVar.f44295j4, null, unVar.f44473x5, null, z10, i10, 0, false, obj, unVar.L8(), 0L, unVar.X8(), unVar.f44407s5);
    }

    public static void E0(un unVar, long j10, long j11) {
        BotForumHelper.getInstance(unVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        unVar.f44302jc = null;
    }

    public static void E1(un unVar) {
        SparseArray[] sparseArrayArr = unVar.f44285i6;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) unVar.A6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            unVar.f44297j6[i10].clear();
            unVar.f44309k6[i10].clear();
        }
        if (unVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(unVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(unVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                unVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        unVar.m9();
        unVar.Lc(0, true);
        unVar.jd(false);
        unVar.Yc();
    }

    public static void F0(un unVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(unVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (unVar.i() != null) {
                tLObject2 = unVar.i();
            } else {
                tLObject2 = unVar.e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = unVar.f44242f;
                if (user2 != null && user2.bot && user.f22174id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.vh.n(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.wc.b0(unVar), null);
                } else if (user2 != null && user2.bot && user.f22174id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.vh.n(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.wc.b0(unVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.vh.n(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.wc.b0(unVar), null);
                } else {
                    TLRPC.Chat chat = unVar.e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.vh.n(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.wc.b0(unVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = unVar.e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.vh.n(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.wc.b0(unVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                unVar.ga(user.f22174id, unVar.f44462w8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.z6 z6Var = new org.telegram.ui.Components.z6(unVar.getParentActivity());
                z6Var.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ia, false));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.L5, z6Var, null);
                z6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity());
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.V = z6Var;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(unVar, user, atomicBoolean, tL_attachMenuBot, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(unVar.getParentActivity(), 5, unVar.getResourceProvider());
                    y1Var.setPadding(0, AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f));
                    y1Var.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
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
                    y1Var.setOnClickListener(new org.telegram.ui.ActionBar.u1(13, y1Var, atomicBoolean));
                    e2Var.G = 6;
                    alertDialog$Builder.o(y1Var);
                }
                alertDialog$Builder.p();
            } else {
                ki1.a(unVar.getParentActivity(), new y(unVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void G0(un unVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j10;
        int[] iArr3 = unVar.M6;
        int[] iArr4 = unVar.L6;
        boolean[] zArr = unVar.Q6;
        int[] iArr5 = unVar.K6;
        int[] iArr6 = unVar.N6;
        boolean[] zArr2 = unVar.P6;
        ArrayList arrayList = unVar.f44421t6;
        if ((i10 - i11) - i12 <= i13 && !unVar.S6) {
            boolean[] zArr3 = unVar.O6;
            if (!zArr3[0]) {
                unVar.S6 = true;
                arrayList.add(Integer.valueOf(unVar.f44272h6));
                if (unVar.D6.size() != 0) {
                    MessagesController messagesController = unVar.getMessagesController();
                    j10 = 0;
                    long j11 = unVar.f44249f6;
                    c10 = 0;
                    long j12 = unVar.X6;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = unVar.classGuid;
                    int i17 = unVar.f44221d4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = unVar.f44370p4;
                    int i18 = unVar.f44484y4;
                    int i19 = unVar.f44272h6;
                    unVar.f44272h6 = i19 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j13, i18, i19, unVar.f44419t4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = unVar.getMessagesController();
                    long j14 = unVar.f44249f6;
                    long j15 = unVar.X6;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = unVar.classGuid;
                    int i22 = unVar.f44221d4;
                    long j16 = unVar.f44370p4;
                    int i23 = unVar.f44484y4;
                    int i24 = unVar.f44272h6;
                    unVar.f44272h6 = i24 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j16, i23, i24, unVar.f44419t4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j10 = 0;
                if (unVar.X6 != 0 && !zArr3[1]) {
                    unVar.S6 = true;
                    arrayList.add(Integer.valueOf(unVar.f44272h6));
                    MessagesController messagesController3 = unVar.getMessagesController();
                    long j17 = unVar.X6;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = unVar.classGuid;
                    int i28 = unVar.f44221d4;
                    long j18 = unVar.f44370p4;
                    int i29 = unVar.f44484y4;
                    int i30 = unVar.f44272h6;
                    unVar.f44272h6 = i30 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j18, i29, i30, unVar.f44419t4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !unVar.U7 && i11 <= 10) {
            if (unVar.X6 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(unVar.f44272h6));
                MessagesController messagesController4 = unVar.getMessagesController();
                long j19 = unVar.X6;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = unVar.classGuid;
                int i34 = unVar.f44221d4;
                long j20 = unVar.f44370p4;
                int i35 = unVar.f44484y4;
                int i36 = unVar.f44272h6;
                unVar.f44272h6 = i36 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j20, i35, i36, unVar.f44419t4);
                unVar.U7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(unVar.f44272h6));
                MessagesController messagesController5 = unVar.getMessagesController();
                long j21 = unVar.f44249f6;
                long j22 = unVar.X6;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = unVar.classGuid;
                int i40 = unVar.f44221d4;
                long j23 = unVar.f44370p4;
                int i41 = unVar.f44484y4;
                int i42 = unVar.f44272h6;
                unVar.f44272h6 = i42 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j23, i41, i42, unVar.f44419t4);
                unVar.U7 = true;
            }
        }
    }

    public static org.telegram.ui.qu0 G1(org.telegram.ui.un r14, org.telegram.messenger.MessageObject r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.G1(org.telegram.ui.un, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.qu0");
    }

    public static void H0(un unVar) {
        if (unVar.f44294j3.getAlpha() != 0.0f && !unVar.actionBar.q() && !unVar.J9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(unVar.f44294j3.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            unVar.P9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void I0(un unVar, org.telegram.ui.Cells.s1 s1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.k80 I = org.telegram.ui.Components.k80.I(unVar, s1Var);
        org.telegram.ui.Components.hn0 hn0Var = new org.telegram.ui.Components.hn0(unVar.getParentActivity(), unVar.f44385qa);
        I.f29861p = new re(hn0Var, 0);
        if (z10 && unVar.getMessagesController().config.walletAvailable.get()) {
            I.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney), new se(unVar, str, 11), false);
        }
        I.c(R.drawable.msg_copy, LocaleController.getString(R.string.WalletCopyAddress), new ve(unVar, hn0Var, str, 1), false);
        if (z10) {
            I.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new se(unVar, str, 12), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = unVar.currentAccount;
                long j10 = user.f22174id;
                ed edVar = new ed(6, unVar, userArr);
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
                I.n(userOrChat, LocaleController.getString(i10), edVar);
            } else {
                I.p(13, -1, LocaleController.getString(R.string.WalletAddressNoLinkedAccount));
            }
        }
        hn0Var.e(I);
        hn0Var.f(s1Var, characterStyle, null, false);
        unVar.showDialog(hn0Var);
    }

    public static void J0(un unVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        unVar.f44407s5 = null;
        int i10 = unVar.Kb;
        if (i10 == 2) {
            unVar.f44473x5 = null;
            unVar.f44498z5 = null;
            MessagePreviewParams messagePreviewParams = unVar.f44394r5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, unVar.f44249f6, null);
            }
            unVar.q8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = unVar.f44394r5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = unVar.f44394r5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = unVar.f44394r5.forwardMessages.messages.get(i11);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44385qa);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                e2Var.K0 = true;
                if (j11 > 0) {
                    TLRPC.User user = unVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", unVar.f44394r5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = unVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", unVar.f44394r5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                e2Var.T = AndroidUtilities.replaceTags(formatString);
                e2Var.R = LocaleController.formatPluralString("messages", unVar.f44394r5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new pe(unVar, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new pe(unVar, 7));
                unVar.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, unVar.getResourceProvider());
                }
            }
        } else if (i10 == 4) {
            unVar.S5 = null;
            MessagePreviewParams messagePreviewParams3 = unVar.f44394r5;
            if (messagePreviewParams3 != null) {
                int i12 = unVar.currentAccount;
                MessageObject messageObject4 = unVar.f44498z5;
                if (messageObject4 == unVar.f44295j4) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, unVar.f44473x5, unVar.B5);
            }
            hk hkVar = unVar.Y;
            hkVar.X2 = null;
            hkVar.Y2 = false;
            unVar.p8();
            unVar.q8();
        } else {
            if (ChatObject.isForum(unVar.e) && !unVar.f44419t4 && (messageObject = unVar.f44498z5) != null) {
                long topicId = MessageObject.getTopicId(unVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    unVar.getMediaDataController().cleanDraft(unVar.f44249f6, topicId, false);
                }
            }
            unVar.Lb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static TLRPC.TL_message J7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22048id = message.f22048id;
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

    public static void K0(un unVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = unVar.U1.getAdapter().f14137w0;
        int i10 = unVar.currentAccount;
        TLRPC.User user2 = unVar.f44242f;
        if (user2 != null) {
            j10 = user2.f22174id;
        } else {
            j10 = unVar.e.f22027id;
        }
        hi.c5 b10 = hi.c5.b(i10, j10, user.f22174id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, unVar.X8(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(unVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(unVar.currentAccount);
            MessagesController.showCantOpenAlert(unVar, restrictionReason);
            return;
        }
        hi.m3 m3Var = new hi.m3(unVar.getParentActivity(), unVar.getResourceProvider());
        m3Var.x(false);
        m3Var.B0 = true;
        m3Var.f13116l0 = unVar.getParentActivity();
        m3Var.t(unVar, b10);
        m3Var.show();
    }

    public static void K1(un unVar) {
        int i10;
        if (unVar.a() == unVar.getUserConfig().getClientUserId() && unVar.getUserConfig().isPremium() && unVar.f44465wb == null) {
            xk xkVar = new xk(unVar, unVar, unVar.getParentActivity(), unVar.currentAccount, unVar.f44385qa);
            unVar.f44465wb = xkVar;
            xkVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            unVar.f44465wb.setDelegate(new zk(unVar));
            unVar.f44465wb.setTop(true);
            int i11 = 0;
            unVar.f44465wb.setClipChildren(false);
            unVar.f44465wb.setClipToPadding(false);
            unVar.f44465wb.setVisibility(0);
            xk xkVar2 = unVar.f44465wb;
            if (xkVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            xkVar2.setHint(LocaleController.getString(i10));
            unVar.f44292j1.addView(unVar.f44465wb, org.telegram.ui.Components.gb1.h(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            unVar.f44465wb.p(null, null, true);
            unVar.f44465wb.setTranslationY(-AndroidUtilities.dp(12.0f));
            unVar.f44465wb.setScaleY(0.4f);
            unVar.f44465wb.setScaleX(0.4f);
            unVar.f44465wb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
            unVar.Yc();
            xk xkVar3 = unVar.f44465wb;
            float f7 = unVar.I9;
            sk skVar = unVar.A1;
            if (skVar != null) {
                i11 = skVar.getCurrentHeight();
            }
            xkVar3.setTranslationY(f7 + i11);
        }
    }

    public static CharSequence K8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
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

    public static void L0(un unVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, q6 q6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f22048id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(unVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            unVar.getMessagesController().getStoriesController().f8637k.d(hVar, new ed(14, hVar, q6Var), unVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void M0(un unVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        MessagesController.getNotificationsSettings(unVar.currentAccount).edit().putLong("dialog_join_requested_time_" + unVar.f44249f6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(unVar.e) && !unVar.e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.c90.f27095s;
            org.telegram.ui.Components.c90.w(context, unVar, org.telegram.ui.Components.wc.b0(unVar), z10);
        }
        unVar.Gb(false, true);
    }

    public static SpannableStringBuilder M8(MessageObject messageObject, boolean z10, long j10) {
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

    public static void O0(un unVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(unVar.currentAccount).getInputUser(user.f22174id);
                    ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new z7(4, unVar, user));
                }
            }
        }
    }

    public static java.util.ArrayList O7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.O7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static int O8() {
        return AndroidUtilities.dp(102.0f);
    }

    public static void P0(un unVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        String str3;
        if (unVar.f44371p5 != null && i10 < arrayList.size() && unVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = unVar.f44371p5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.f51.S(unVar.getParentActivity(), unVar, inputPeer, iArr[0], unVar.f44371p5.summarized, strArr[0], str3, charSequence, z10, ofVar, new kf(unVar, 19)).setDimBehind(false);
            unVar.H7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(unVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + unVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(unVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + unVar.a(), i11 - 1).apply();
                unVar.dd(true);
            }
        }
    }

    public static void Q0(org.telegram.ui.un r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.s1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Q0(org.telegram.ui.un, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.s1, int, int):void");
    }

    public static FrameLayout Q7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.u6 u6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(AndroidUtilities.dp(48.0f));
        frameLayout.setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(4.0f));
        bi.md mdVar = new bi.md(context, 13);
        int i11 = 3;
        mdVar.setMaxLines(3);
        mdVar.setGravity(3);
        mdVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.f7.V(mdVar, org.telegram.ui.ActionBar.y6.E8, u6Var);
        mdVar.setTextSize(1, i10);
        mdVar.setMaxWidth(AndroidUtilities.dp(170.0f));
        mdVar.setText(charSequence);
        if (LocaleController.isRTL) {
            i11 = 5;
        }
        frameLayout.addView(mdVar, org.telegram.ui.Components.gb1.i(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void R0(un unVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(unVar.currentAccount).getInputUser(user.f22174id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new kh(unVar, tL_attachMenuBot, user, 0), 66);
    }

    public static a3.i0 R4(un unVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = unVar.getMessagesController().createDeleteShowOnceTask(unVar.f44249f6, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                unVar.Gc(arrayList, true);
            }
            return new a3.i0(unVar, createDeleteShowOnceTask, messageObject, 16);
        }
        return null;
    }

    public static void S0(un unVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != unVar.b()) {
            unVar.f44451vb = SystemClock.uptimeMillis();
            unVar.B7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                unVar.bb(unVar.b());
            } else if (unVar.b() == 0) {
                unVar.bb(l4.longValue());
            } else {
                unVar.f44500z7 = -1;
            }
            unVar.getConnectionsManager().cancelRequestsForGuid(unVar.classGuid);
            unVar.getMessagesStorage().cancelTasksForGuid(unVar.classGuid);
            unVar.classGuid = ConnectionsManager.generateClassGuid();
            unVar.Ya();
            unVar.f44394r5 = null;
            unVar.G7 = 0;
            unVar.f44461w7 = false;
            unVar.f44475x7 = true;
            unVar.f44421t6.clear();
            unVar.f44370p4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = unVar.getMessagesController().getTopicsController().findTopic(-unVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                unVar.f44458w4 = i12;
                unVar.f44472x4 = findTopic.read_outbox_max_id;
                unVar.f44484y4 = Math.max(1, i12);
                unVar.getMessagesController().getTopicsController().getTopicRepliesCount(unVar.f44249f6, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                unVar.f44357o4 = null;
                unVar.f44330m4 = null;
                unVar.f44295j4 = null;
                unVar.f44498z5 = null;
                unVar.f44458w4 = 0;
                unVar.f44472x4 = 0;
                unVar.f44484y4 = 0;
                unVar.f44370p4 = 0L;
                unVar.f44381q4 = 0;
                unVar.f44393r4 = null;
                unVar.f44419t4 = false;
                unVar.f44406s4 = false;
            }
            unVar.z8();
            unVar.ad(true);
            unVar.f44327m1.n(true);
            unVar.f44327m1.b();
            unVar.f44219d2.setCurrentTopic(l4.longValue());
            unVar.dd(true);
            unVar.uc(true);
            unVar.getMessagesController().setForumLastTopicId(-unVar.a(), unVar.b());
            unVar.q9(true);
            unVar.o9(true);
            hk hkVar = unVar.Y;
            if (hkVar != null) {
                hkVar.j0(false);
                unVar.Y.D1(true);
            }
            unVar.F6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            unVar.f44469x1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            unVar.f44482y1 = i11;
            unVar.Oc(false);
            unVar.Nc(false);
            unVar.ed();
            mn mnVar = unVar.Kc;
            if (mnVar != null && unVar.actionBar.f22772n0) {
                mnVar.k(null);
            }
        }
    }

    public static void T0(un unVar, TLRPC.ReactionCount reactionCount) {
        unVar.H7(true);
        org.telegram.ui.Components.oo0.c(unVar.getParentActivity(), unVar.currentAccount, reactionCount.reaction, unVar.f44385qa);
    }

    public static void T3(un unVar) {
        org.telegram.ui.ActionBar.y yVar;
        if (!unVar.f44504zb && (yVar = unVar.f44279i0) != null) {
            yVar.a();
            org.telegram.ui.ActionBar.w0 w0Var = yVar.f23278m;
            w0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (unVar.f44221d4 == 0) {
                w0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            w0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            w0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.q61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            w0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = unVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f34904a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.z11(obj, 0), 0, spannableStringBuilder4.length(), 33);
                w0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f34904a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.z11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                w0Var.g(56, spannableStringBuilder5);
            }
            w0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (unVar.h == null) {
                w0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            w0Var.g(54, LocaleController.getString(R.string.Regular));
            unVar.f44504zb = true;
        }
    }

    public static void U0(un unVar) {
        if (AndroidUtilities.addToClipboard(unVar.f44290ic.sponsoredInfo)) {
            org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.resourceProvider));
        }
    }

    public static void V(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, of ofVar) {
        String str4;
        if (unVar.f44371p5 != null && i10 < arrayList.size() && unVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = unVar.f44371p5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.f51.S(unVar.getParentActivity(), unVar, inputPeer, iArr[0], unVar.f44371p5.summarized, str, str4, charSequence, z10, ofVar, new jg(unVar, 1)).setDimBehind(false);
            unVar.H7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(unVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + unVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(unVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + unVar.a(), i11 - 1).apply();
                unVar.dd(true);
            }
        }
    }

    public static void V0(un unVar, int i10) {
        org.telegram.ui.ActionBar.j5 j5Var = unVar.parentLayout;
        if (j5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.r2 backgroundFragment = j5Var.getBackgroundFragment();
        if (backgroundFragment instanceof un) {
            un unVar2 = (un) backgroundFragment;
            if (unVar2.a() == unVar.f44249f6) {
                unVar.finishFragment();
                unVar2.j(i10, 0, true, 0, true, 0);
                return;
            }
        }
        unVar.presentFragment(aa(i10, unVar.f44249f6));
    }

    public static void W(un unVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        tg.m1 m1Var = new tg.m1(unVar, unVar.currentAccount, user, null, null, unVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            m1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(unVar.getParentActivity());
        org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(160.0f), 4, y9Var, false);
        y9Var.setImageDrawable(r5Var);
        y9Var.addOnAttachStateChangeListener(new i5(r5Var, 1));
        r5Var.j(j10, false);
        m1Var.E0 = true;
        m1Var.B0 = y9Var;
        unVar.showDialog(m1Var);
    }

    public static boolean W0(org.telegram.ui.un r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.W0(org.telegram.ui.un, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static MessageObject W1(un unVar) {
        View view = unVar.f44375p9;
        if (view instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) view).getMessageObject();
        }
        return null;
    }

    public static void W4(un unVar, org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        oe.b bVar = unVar.Tc;
        if (unVar.Y != null && !bVar.f19327f && s1Var.getMessageObject() != null) {
            mm mmVar = unVar.f44292j1;
            RectF rectF = AndroidUtilities.rectTmp;
            jh.k.c(s1Var, mmVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            uh.a aVar = s1Var.f25017a6;
            if (aVar != null && s1Var.f25202n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((unVar.f44292j1.getMeasuredHeight() - unVar.f44468x0.getPaddingBottom()) + unVar.Pc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = s1Var.getMessageObject();
                if (unVar.Zc == null) {
                    unVar.Zc = new sh.c(unVar.getParentActivity(), unVar.resourceProvider, unVar);
                    int indexOfChild = unVar.f44292j1.indexOfChild(unVar.f44468x0);
                    if (indexOfChild >= 0) {
                        unVar.f44292j1.addView(unVar.Zc, indexOfChild + 1, org.telegram.ui.Components.gb1.k());
                    } else {
                        unVar.f44292j1.addView(unVar.Zc, org.telegram.ui.Components.gb1.k());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (s1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.y6.f23543nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.y6.f23637sb;
                    }
                    unVar.Q0 = i11;
                } else {
                    if (s1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.y6.f23565od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23545nd;
                    }
                    unVar.Q0 = i10;
                }
                unVar.Zc.setColor(unVar.getThemedColor(unVar.Q0));
                unVar.Zc.setCellToWatch(s1Var);
                unVar.Zc.f48616b.f48612a.a(false, false);
                unVar.Zc.setAnimatedVisibility(bVar.e);
                unVar.Zc.f48616b.setOnClickListener(new ig.d0(new jg(unVar, 7), 20));
                sh.c cVar = unVar.Zc;
                cVar.f48621s = new jg(unVar, 9);
                org.telegram.ui.Cells.g6 g6Var = cVar.f48615a;
                g6Var.setOnKeyListener(new ng(unVar, 0));
                g6Var.setOnEditorActionListener(new la(unVar, 1));
                unVar.Y.Y4 = g6Var;
                AndroidUtilities.runOnUIThread(new g4(unVar, measuredHeight, g6Var, 3), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void X(un unVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(unVar.currentAccount).getInputUser(user.f22174id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new kh(unVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void X0(un unVar) {
        if (AndroidUtilities.addToClipboard(unVar.f44290ic.sponsoredAdditionalInfo)) {
            org.telegram.messenger.vh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.resourceProvider));
        }
    }

    public static void Y(un unVar, ArrayList arrayList, long j10, org.telegram.ui.Components.hn0 hn0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(unVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new ag.o0(unVar, j10, 3), 400L);
            hn0Var.dismiss();
        }
    }

    public static void Y0(un unVar, int i10) {
        if (unVar.fragmentView != null) {
            org.telegram.ui.Cells.z x82 = unVar.x8(i10, false);
            if (x82 instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) x82;
                bh.y0 y0Var = s1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = s1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (y0Var.K || randomUnreadReaction.big)) {
                    bh.s0.d(unVar, null, x82, null, 0.0f, 0.0f, bh.x0.d(randomUnreadReaction.reaction), unVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    bh.s0.f();
                }
                y0Var.K = false;
                MessageObject messageObject = s1Var.f25363y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (x82 instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) x82;
                bh.y0 y0Var2 = v0Var.E0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = v0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (y0Var2.K || randomUnreadReaction2.big)) {
                    bh.s0.d(unVar, null, x82, null, 0.0f, 0.0f, bh.x0.d(randomUnreadReaction2.reaction), unVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
                    bh.s0.f();
                }
                y0Var2.K = false;
                MessageObject messageObject2 = v0Var.P0;
                if (messageObject2 != null) {
                    messageObject2.markReactionsAsRead();
                }
            }
        }
    }

    public static void Y1(un unVar, float f7) {
        View view = unVar.f44375p9;
        if (view instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setWalletSlidingOffset(f7);
        }
    }

    public static void Z(un unVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new ze(unVar, i10, 6));
        } else {
            unVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void Z0(org.telegram.ui.un r19, org.telegram.ui.jk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Z0(org.telegram.ui.un, org.telegram.ui.jk, boolean[]):void");
    }

    public static void Z1(un unVar) {
        long j10;
        rp rpVar = unVar.f44200ba;
        if (rpVar != null) {
            if (unVar.f44419t4) {
                if (rpVar.H != null) {
                    if (unVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(unVar, unVar.getParentLayout().getFragmentStack().indexOf(unVar), unVar.e, unVar.f44242f, unVar.f44357o4, unVar.f44249f6, unVar.Ha, unVar.Ga);
                    }
                    TLRPC.Chat chat = unVar.e;
                    TLRPC.TL_forumTopic tL_forumTopic = unVar.f44200ba.H;
                    long j11 = unVar.f44249f6;
                    int i10 = unVar.Ga;
                    int i11 = unVar.Ha;
                    if (unVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(unVar, unVar.getParentLayout().getFragmentStack().indexOf(unVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", unVar.f44200ba.f43199a);
                    bundle.putInt("dialog_filter_id", unVar.f44200ba.f43201b);
                    bundle.putBoolean("pulled", true);
                    un g7 = pg.d.g(unVar, -unVar.f44249f6, unVar.f44200ba.H, 0, bundle);
                    g7.f44227da = true;
                    f44174id = true;
                    unVar.presentFragment(g7, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = rpVar.G;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f22027id;
            }
            if (j10 != 0) {
                unVar.A6();
                rp rpVar2 = unVar.f44200ba;
                TLRPC.Chat chat3 = rpVar2.G;
                long j13 = rpVar2.Z;
                int i12 = rpVar2.f43199a;
                int i13 = rpVar2.f43201b;
                if (unVar.getParentLayout() != null) {
                    org.telegram.ui.Components.q9.a(unVar, unVar.getParentLayout().getFragmentStack().indexOf(unVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = unVar.f44200ba.G;
                if (chat4 != null) {
                    j12 = chat4.f22027id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", unVar.f44200ba.f43199a);
                bundle2.putInt("dialog_filter_id", unVar.f44200ba.f43201b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(unVar.currentAccount).edit().remove("diditem" + unVar.f44200ba.Z).apply();
                un unVar2 = new un(bundle2);
                ArrayList arrayList = unVar.Bb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = unVar.Bb;
                    unVar2.Bb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                unVar2.f44227da = true;
                f44174id = true;
                unVar.presentFragment(unVar2, true);
            }
        }
    }

    public static void a0(un unVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            unVar.Fc = true;
            unVar.f44468x0.g1();
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
            un unVar2 = new un(bundle);
            unVar2.Ab(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                unVar2.X7 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = unVar2.f44295j4.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                unVar2.f44295j4.messageOwner.reactions = tL_messageReactions;
            }
            ai.h1 h1Var = new ai.h1(unVar, new boolean[]{false}, i11, unVar2, 17);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f22048id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = unVar2.getClassGuid();
                NotificationCenter.getInstance(unVar.currentAccount).addObserver(new qi(unVar, classGuid, h1Var, unVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        un unVar3 = un.this;
                        MessagesController messagesController = unVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((MessageObject) ic.a.g(1, arrayList)).getId(), 1, false, 0, true, unVar3.f44419t4, null);
                    }
                });
                return;
            }
            h1Var.run();
            return;
        }
        unVar.Ec = 0;
        unVar.Fc = false;
        unVar.f44468x0.g1();
        if (messageObject2 != null) {
            unVar.qa(messageObject2);
        } else if (unVar.getParentActivity() != null) {
            org.telegram.ui.Components.wc.b0(unVar).t(LocaleController.getString(R.string.ChannelPostDeleted), unVar.f44385qa).j();
        }
    }

    public static void a1(un unVar) {
        if (unVar.f44221d4 == 0 && unVar.getMessagesController().freezeUntilDate > unVar.getConnectionsManager().getCurrentTime() && !b.a(unVar.currentAccount, unVar.f44242f)) {
            b.c(unVar.getParentActivity(), unVar.currentAccount, unVar.getResourceProvider());
        }
    }

    public static un aa(int i10, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i10);
        return new un(bundle);
    }

    public static void b0(long j10, un unVar) {
        if (bi.ca.y(unVar.currentAccount, false).p().amount < j10) {
            new bi.tc(unVar.getParentActivity(), unVar.getResourceProvider(), j10, 13, DialogObject.getShortName(unVar.a()), new kf(unVar, 22), unVar.a()).show();
        } else {
            new bi.uc(unVar.getParentActivity(), unVar.resourceProvider).show();
        }
    }

    public static void b1(un unVar, int i10) {
        ch.f fVar = unVar.F;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (a8.pf.a(i10, 4)) {
                qi.a e = unVar.glassEngine.e();
                float dp = AndroidUtilities.dp(48.0f);
                float dp2 = AndroidUtilities.dp(48.0f);
                int i11 = 0;
                while (i11 < e.f47065b) {
                    RectF rectF = (RectF) e.f47064a.get(i11);
                    rectF.inset(-dp, -dp2);
                    if (rectF.isEmpty()) {
                        e.d(i11);
                    } else {
                        i11++;
                    }
                }
                e.b(unVar.f44468x0.getY(), unVar.f44468x0.getWidth(), unVar.f44468x0.getY() + unVar.f44468x0.getHeight());
                fVar.h(e);
            }
            mm mmVar = unVar.f44292j1;
            fVar.e(mmVar.f41582v0, mmVar.getWidth(), unVar.f44292j1.getHeight());
        }
    }

    public static un ba(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new un(bundle);
    }

    public static void c0(un unVar, bg.a aVar, Runnable runnable) {
        if (!unVar.isFinished) {
            if (bg.a.m(bi.ca.x(unVar.currentAccount, aVar.f3978a).p()).f3979b < aVar.f3979b) {
                bg.b bVar = aVar.f3978a;
                if (bVar == bg.b.f3980a) {
                    new bi.tc(unVar.getParentActivity(), unVar.getResourceProvider(), aVar.a(), 13, pg.d.h(unVar.currentAccount, unVar.a()), null, unVar.a()).show();
                    return;
                } else if (bVar == bg.b.f3981b) {
                    new gi.g(unVar.getParentActivity(), unVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void c1(un unVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (unVar.getParentActivity() != null) {
            TLRPC.Chat chat = unVar.e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !unVar.e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (unVar.h == null && (userFull = unVar.f44334m8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44385qa);
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new pe(unVar, 18));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                unVar.showDialog(alertDialog$Builder.f22366a);
            } else if (!unVar.T4.isEmpty()) {
                MessagesController.getNotificationsSettings(unVar.currentAccount).edit().putInt("pin_" + unVar.f44249f6, ((Integer) unVar.T4.get(0)).intValue()).commit();
                unVar.Lc(0, true);
            }
        }
    }

    public static void d0(un unVar, String str) {
        Uri parse = Uri.parse(str);
        y50.b(unVar.getParentActivity(), unVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void d1(un unVar) {
        org.telegram.ui.Components.u40.h.a();
        unVar.showDialog(new zh.p1(unVar.getParentActivity(), unVar.currentAccount, unVar.a(), null, null));
    }

    public static void e0(un unVar, String str) {
        if (unVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(unVar.currentAccount).getInviteText(1));
            unVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void e1(un unVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, of ofVar) {
        if (unVar.f44371p5 != null && i10 < arrayList.size() && unVar.getParentActivity() != null) {
            org.telegram.ui.Components.f51.S(unVar.getParentActivity(), unVar, inputPeer, iArr[0], unVar.f44371p5.summarized, "und", str, charSequence, z10, ofVar, new kf(unVar, 20)).setDimBehind(false);
            unVar.H7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(unVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + unVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(unVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + unVar.a(), i11 - 1).apply();
                unVar.dd(true);
            }
        }
    }

    public static void e2(un unVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            messageObject = s1Var.getMessageObject();
            s1Var.f25099g1 = f7;
            s1Var.f25112h1 = f10;
            org.telegram.ui.Components.ib0 ib0Var = s1Var.Kc;
            float f11 = s1Var.f25112h1;
            ib0Var.h = s1Var.getTranslationX() + f7;
            ib0Var.f29268i = f11;
            ib0Var.f29271l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int N8 = unVar.N8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && N8 >= 2 && N8 != 20 && N8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        unVar.C6(messageObject, z10, true);
                        unVar.qc();
                        unVar.jd(false);
                    }
                }
            }
        }
    }

    public static void f0(un unVar) {
        unVar.N7(false);
        if (!unVar.fragmentBeginToShow) {
            oj ojVar = unVar.f44468x0;
            ojVar.W1 = false;
            ojVar.X1 = 0;
            ojVar.setEmptyView(unVar.f44205c1);
            oj ojVar2 = unVar.f44468x0;
            ojVar2.W1 = true;
            ojVar2.X1 = 1;
            return;
        }
        unVar.f44468x0.setEmptyView(unVar.f44205c1);
    }

    public static void f1(un unVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = unVar.getMessagesController().getInputPeer(unVar.f44249f6);
                tL_messages_getHistory.offset_date = unVar.I7 + 86400;
                tL_messages_getHistory.limit = 1;
                unVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new z7(3, unVar, tLObject));
                return;
            }
            unVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void f2(un unVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = unVar.G6;
        SparseArray[] sparseArrayArr = unVar.f44285i6;
        if (!unVar.f44201bb && (i11 = i10 - unVar.A0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.mm0 mm0Var = unVar.f44468x0;
            ti tiVar = new ti(unVar, z10, sparseArray);
            if (!mm0Var.f30621b2) {
                mm0Var.f30639k2 = new int[2];
                new HashSet();
                mm0Var.o1(mm0Var, true);
                mm0Var.f30629f2 = tiVar;
                mm0Var.f30621b2 = true;
                mm0Var.f30627e2 = i10;
                mm0Var.f30625d2 = i10;
            }
        }
    }

    public static void g0(un unVar, String str) {
        if (MessagesController.getInstance(unVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            unVar.getParentActivity();
            qf.d.m(str);
            return;
        }
        org.telegram.ui.Components.g5.n0(unVar.getParentActivity(), unVar.f44385qa, str, false, new ag(unVar, str, 0));
    }

    public static boolean g1(un unVar) {
        MessageObject messageObject = unVar.f44290ic;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(unVar.getParentActivity()), unVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static boolean g2(un unVar, View view, RectF rectF) {
        RectF rectF2 = unVar.f44202bc;
        if (rectF != null && unVar.f44468x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void g4(un unVar, org.telegram.ui.Cells.g0 g0Var) {
        String charSequence;
        if (MessagesController.getInstance(unVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = g0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new e7(unVar, g0Var, text, 3), new y0(g0Var, 16));
            return;
        }
        g0Var.setClickable(false);
    }

    public static void h0(un unVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f22068id = unVar.getMessagesController().getInputUser(unVar.f44242f);
            unVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new oe(unVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(unVar.getUserConfig().getCurrentUser(), unVar.f44249f6, messageObject, unVar.f44295j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = unVar.L8();
        SendMessagesHelper.getInstance(unVar.currentAccount).sendMessage(of2);
        if (unVar.f44221d4 == 0) {
            unVar.Y9(false);
        }
        unVar.o9(false);
    }

    public static void h1(un unVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(unVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, unVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(unVar.currentAccount).editMessage(messageObject, null, false, unVar, null, i10, i11);
        }
    }

    public static void h4(un unVar) {
        if (unVar.U3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = unVar.f44221d4;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f22048id = 0;
        MessageObject messageObject = new MessageObject(unVar.currentAccount, tL_message, false, false);
        unVar.U3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void i0(un unVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = unVar.f44498z5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = unVar.Kb;
            if (i10 == 5) {
                int i11 = unVar.currentAccount;
                long j10 = unVar.f44249f6;
                MessageSuggestionParams messageSuggestionParams = unVar.f44407s5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new bi.g1(context, i11, j10, messageSuggestionParams, unVar, unVar.getResourceProvider(), 0, new ye(unVar, 1)).show();
            } else if (i10 == 1 && (messageObject = unVar.B5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = unVar.f44407s5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    unVar.fc(messageSuggestionParams2);
                } else if (unVar.B5.canEditMedia() && unVar.A5 == 0) {
                    if (unVar.V1 == null) {
                        unVar.L7();
                    }
                    unVar.V1.O1(unVar.B5, -1);
                    unVar.ha();
                } else {
                    unVar.j(unVar.B5.getId(), 0, true, 0, true, 0);
                }
            } else if (unVar.f44394r5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(unVar.f44249f6) && !unVar.f44394r5.hasSecretMessages && unVar.f44221d4 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        unVar.ma(0);
                        return;
                    }
                    MessageObject messageObject3 = unVar.f44498z5;
                    if (messageObject3 != null) {
                        unVar.j(messageObject3.getId(), 0, true, 0, true, 0);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    unVar.ma(1);
                } else if (i10 == 4) {
                    unVar.ma(2);
                }
            }
        }
    }

    public static void i1(un unVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        unVar.Yb(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(unVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void i4(un unVar) {
        if (unVar.V3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f22048id = 0;
        MessageObject messageObject = new MessageObject(unVar.currentAccount, tL_message, false, false);
        unVar.V3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void j0(un unVar) {
        org.telegram.ui.Cells.s1 s1Var;
        rl rlVar;
        int i10;
        if (!unVar.f44352nc && unVar.R3 && unVar.f44468x0.G && unVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = unVar.f44468x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = unVar.f44468x0.getChildAt(childCount);
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
                unVar.f44352nc = true;
                rl rlVar2 = new rl(unVar, unVar.getParentActivity());
                rlVar2.p(true);
                rlVar2.K = Layout.Alignment.ALIGN_CENTER;
                rlVar2.d = 3500L;
                rlVar2.T = true;
                rlVar2.e = true;
                rlVar2.h = AndroidUtilities.dp(150.0f);
                rlVar2.q(8.0f);
                unVar.N1 = rlVar2;
                rlVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                unVar.f44292j1.addView(unVar.N1, org.telegram.ui.Components.gb1.h(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                s1Var.getLocationInWindow(iArr);
                unVar.O1 = s1Var.getTimeY() + iArr[1];
                unVar.N1.setTranslationY(((-rlVar.getTop()) - AndroidUtilities.dp(120.0f)) + unVar.O1);
                unVar.N1.m(0.0f, (s1Var.pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + s1Var.f25262rb);
                unVar.N1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(unVar, 2));
            AndroidUtilities.runOnUIThread(new le(unVar, 2), 2000L);
        }
    }

    public static void j1(un unVar) {
        unVar.f44350na = null;
        unVar.f44468x0.setOnInterceptTouchListener(null);
        unVar.ub(unVar.f44292j1, true);
        ChatThemeController.getInstance(unVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void k0(un unVar) {
        if (unVar.Y1) {
            unVar.getMessagesController().addDialogToFolder(unVar.f44249f6, 0, 0, 0L);
            unVar.X7();
            unVar.K3.j(23, unVar.f44249f6, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(unVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + unVar.f44249f6, false);
            edit.putBoolean("dialog_bar_block" + unVar.f44249f6, false);
            edit.putBoolean("dialog_bar_report" + unVar.f44249f6, false);
            edit.commit();
            unVar.dd(false);
            unVar.getNotificationsController().clearDialogNotificationsSettings(unVar.f44249f6, unVar.b());
        } else if (unVar.X1.getTag() != null && ((Integer) unVar.X1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = unVar.f44322l8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < unVar.f44322l8.participants.participants.size(); i10++) {
                    hVar.k(null, unVar.f44322l8.participants.participants.get(i10).user_id);
                }
                long j10 = unVar.f44322l8.f22028id;
                org.telegram.ui.Components.y70 y70Var = new org.telegram.ui.Components.y70(unVar.getParentActivity(), unVar.currentAccount, hVar, unVar.f44322l8.f22028id, unVar, unVar.f44385qa);
                y70Var.f34952l0 = new pe(unVar, 25);
                y70Var.show();
            }
        } else if (unVar.X1.getTag() != null) {
            unVar.Cb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", unVar.f44242f.f22174id);
            bundle.putBoolean("addContact", true);
            js jsVar = new js(bundle);
            jsVar.O = new pe(unVar, 26);
            unVar.presentFragment(jsVar);
        }
    }

    public static void k1(un unVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.z61[] z61VarArr;
        if (unVar.R5 != 0) {
            unVar.getConnectionsManager().cancelRequest(unVar.R5, true);
            unVar.R5 = 0;
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
            if ((charSequence instanceof Spannable) && (z61VarArr = (org.telegram.ui.Components.z61[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.z61.class)) != null && z61VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.z61 z61Var : z61VarArr) {
                    arrayList.add(z61Var.getURL());
                }
            }
            if (arrayList != null && unVar.T5 != null && arrayList.size() == unVar.T5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) unVar.T5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            unVar.T5 = arrayList;
        } catch (Exception e) {
            FileLog.e(e);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new jg(unVar, 4));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new jg(unVar, 3));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (unVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new ue(unVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = unVar.S5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = unVar.Hb + 1;
            unVar.Hb = i11;
            lg lgVar = new lg(unVar, i11, getwebpagepreview, 0);
            if (unVar.Ib == null) {
                unVar.Ib = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) unVar.Ib.get(getwebpagepreview.message);
            if (webPage2 != null) {
                lgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            q6 q6Var = new q6(unVar, getwebpagepreview, lgVar, 1);
            if (unVar.R5 != 0) {
                unVar.getConnectionsManager().cancelRequest(unVar.R5, true);
            }
            unVar.R5 = unVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new bi.m5(10, unVar, q6Var));
            unVar.getConnectionsManager().bindRequestToGuid(unVar.R5, unVar.classGuid);
        }
    }

    public static void l0(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(unVar.currentAccount).loadAttachMenuBots(false, true);
            unVar.ga(user.f22174id, unVar.f44462w8, false);
        }
    }

    public static void l1(un unVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        un unVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        jh.a aVar = unVar.f44338mc;
        if (num.intValue() != unVar.b()) {
            unVar.Jc = false;
            cf cfVar = unVar.f44302jc;
            if (cfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(cfVar);
                unVar.f44302jc.run();
                unVar.f44302jc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.e41 e41Var = unVar.f44219d2;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(e41Var.f27725b).getTopicsController().getTopics(-e41Var.f27727c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f22079id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = unVar.getMessagesController().getTopicsController().findTopic(-unVar.a(), tL_forumTopic.f22079id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                unVar.f44451vb = SystemClock.uptimeMillis();
                unVar.B7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    unVar.bb(unVar.b());
                } else if (unVar.b() == 0) {
                    unVar.bb(num.intValue());
                } else {
                    unVar.f44500z7 = -1;
                }
                unVar.getConnectionsManager().cancelRequestsForGuid(unVar.classGuid);
                unVar.getMessagesStorage().cancelTasksForGuid(unVar.classGuid);
                unVar.classGuid = ConnectionsManager.generateClassGuid();
                unVar.Ya();
                unVar.f44394r5 = null;
                unVar.G7 = 0;
                unVar.f44461w7 = false;
                unVar.f44475x7 = true;
                unVar.f44421t6.clear();
                unVar.f44203c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(unVar.getCurrentAccount(), message, false, false));
                    unVar2 = unVar;
                    unVar2.Ab(arrayList, unVar.e, tL_forumTopic2.f22079id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    unVar2 = unVar;
                    unVar2.f44357o4 = null;
                    unVar2.f44330m4 = null;
                    unVar2.f44295j4 = null;
                    unVar2.f44498z5 = null;
                    unVar2.f44458w4 = 0;
                    unVar2.f44472x4 = 0;
                    unVar2.f44484y4 = 0;
                    unVar2.f44370p4 = 0L;
                    unVar2.f44381q4 = 0;
                    unVar2.f44393r4 = null;
                    unVar2.f44419t4 = false;
                    unVar2.f44406s4 = false;
                }
                fm fmVar = unVar2.A0;
                if (fmVar != null) {
                    if (fmVar.I >= 0 && !fmVar.N()) {
                        fm fmVar2 = unVar2.A0;
                        fmVar2.u(fmVar2.I);
                    } else {
                        fm fmVar3 = unVar2.A0;
                        if (fmVar3.I < 0 && fmVar3.N()) {
                            unVar2.A0.o(0);
                        }
                    }
                    unVar2.A0.T();
                }
                unVar2.z8();
                unVar2.ad(true);
                unVar2.f44327m1.n(true);
                if (tL_forumTopic2 != null) {
                    unVar2.gd();
                } else {
                    unVar2.f44327m1.b();
                }
                unVar2.f44219d2.setCurrentTopic(unVar2.b());
                unVar2.dd(true);
                unVar2.uc(true);
                unVar2.getMessagesController().setForumLastTopicId(-unVar2.a(), unVar2.b());
                unVar2.Na();
                unVar2.p9(true);
                unVar2.o9(true);
                unVar2.F6(true, true);
                if (unVar2.Y != null) {
                    if (!UserObject.isBotForum(unVar2.f44242f)) {
                        unVar2.Y.j0(false);
                    }
                    unVar2.Y.D1(true);
                }
                if (tL_forumTopic2 != null) {
                    unVar2.getMessagesController().getTopicsController().getTopicRepliesCount(unVar2.f44249f6, tL_forumTopic2.f22079id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                unVar2.f44469x1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                unVar2.f44482y1 = i11;
                unVar2.Oc(false);
                unVar2.Nc(false);
                unVar2.ed();
                mn mnVar = unVar2.Kc;
                if (mnVar != null && unVar2.actionBar.f22772n0) {
                    mnVar.k(null);
                }
                if (UserObject.isBotForum(unVar2.f44242f)) {
                    unVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(unVar2.f44249f6, num.intValue()), true);
                }
            }
        }
    }

    public static void l2(un unVar) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (unVar.L1 != null) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var2 = null;
        for (int childCount = unVar.f44468x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = unVar.f44468x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.s1) && (primaryMessageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                s1Var2 = s1Var;
            }
        }
        unVar.Fb(s1Var2);
    }

    public static org.telegram.ui.Components.zo m0(un unVar, Context context) {
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, unVar.currentAccount, unVar.f44266h0.getPopupLayout().getSwipeBack(), false, new lj(unVar), unVar.getResourceProvider());
        unVar.f44429u1 = bpVar;
        bpVar.e(unVar.f44249f6, unVar.b(), null);
        return unVar.f44429u1.f26925f;
    }

    public static void m1(un unVar, long j10, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(unVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.i11.c(unVar.getParentActivity(), unVar.currentAccount, -j10, unVar.getUserConfig().getCurrentUser(), null, z10, z11, unVar.getResourceProvider());
    }

    public static void n0(un unVar) {
        if (MessagesController.getInstance(unVar.currentAccount).isDialogMuted(unVar.f44249f6, unVar.b())) {
            unVar.cd(true);
            AndroidUtilities.runOnUIThread(new le(unVar, 7), 150L);
            unVar.f44266h0.U(null, null);
            if (unVar.getParentActivity() != null) {
                org.telegram.ui.Components.wc.z(unVar, 4, 0, unVar.f44385qa).j();
                return;
            }
            return;
        }
        View view = unVar.f44378q1.f23113j;
        if (view instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) view).b();
        }
    }

    public static void n1(un unVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = unVar.getParentActivity();
        int i12 = unVar.currentAccount;
        long j10 = unVar.f44249f6;
        sn snVar = unVar.f44385qa;
        int i13 = org.telegram.ui.Components.vo.L;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.u6) snVar, false);
        k3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23425h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.large_message_lock, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int dp = AndroidUtilities.dp(80.0f);
        int i14 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i14, snVar));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, snVar);
        linearLayout.addView((View) imageView, org.telegram.ui.Components.gb1.x(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.y6.f23462j5;
        org.telegram.ui.ActionBar.f7.V(textView, i15, snVar);
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, org.telegram.ui.Components.gb1.x(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, i15, snVar);
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
        org.telegram.messenger.vh.o(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            tg.p0 p0Var = new tg.p0(parentActivity, snVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.g3(k3Var, 1));
            p0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(p0Var, org.telegram.ui.Components.gb1.x(-1, 48, 1, 0, 0, 0, 4));
        }
        k3Var.setCustomView(linearLayout);
        k3Var.show();
    }

    public static void o0(un unVar, String str) {
        if (MessagesController.getInstance(unVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            qf.d.l(unVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.g5.n0(unVar.getParentActivity(), unVar.f44385qa, str, true, new ag(unVar, str, 1));
        }
    }

    public static void o1(un unVar, int i10) {
        if (unVar.f44221d4 == 7) {
            Object E = unVar.Y3.E(i10);
            if (i10 == 0) {
                unVar.Y3.getClass();
            }
            if (E instanceof MessageObject) {
                unVar.pa((MessageObject) E);
            }
        } else if (unVar.C3 != null) {
            if (i10 >= 0 && i10 < unVar.getMediaDataController().searchResultMessages.size()) {
                unVar.D3 = false;
                unVar.wb(false, true, false);
                unVar.getMediaDataController().setSearchedPosition(i10);
                unVar.Sc(unVar.getMediaDataController().getMask(), unVar.getMediaDataController().getSearchPosition(), unVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new te(unVar, unVar.getMediaDataController().searchResultMessages.get(i10), 2));
            }
        } else {
            unVar.getMediaDataController().jumpToSearchedMessage(unVar.classGuid, i10);
            unVar.Xb(false);
        }
    }

    public static void p0(un unVar) {
        if (unVar.f44290ic == null) {
            return;
        }
        a31[] a31VarArr = {a31.T(unVar.getParentActivity(), unVar, true, unVar.resourceProvider, new li.s2(13, unVar, a31VarArr))};
    }

    public static void p1(un unVar) {
        int i10;
        TLRPC.ChatFull chatFull = unVar.f44322l8;
        if (chatFull != null && !unVar.C5) {
            TLRPC.Chat chat = unVar.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && unVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(unVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = unVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && unVar.visibleDialog == null && unVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = unVar.getParentActivity();
                    pe peVar = new pe(unVar, 15);
                    pe peVar2 = new pe(unVar, 16);
                    Pattern pattern = org.telegram.ui.Components.g5.f28418a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ag.v0(11));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, org.telegram.ui.Components.gb1.h(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
                    e2Var.V = frameLayout;
                    e2Var.Q0 = 0.3974359f;
                    e2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), peVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), peVar2);
                    unVar.showDialog(e2Var);
                }
            }
        }
    }

    public static void q0(un unVar, org.telegram.ui.Components.k80 k80Var) {
        if (unVar.f44290ic == null) {
            return;
        }
        k80Var.u();
        unVar.T9(unVar.f44290ic, false, true);
        qf.d.q(unVar.getParentActivity(), Uri.parse(unVar.f44290ic.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(unVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void q1(un unVar, MessageObject messageObject, Long l4, Runnable runnable) {
        bi.ca.y(unVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void r0(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(unVar.currentAccount).loadAttachMenuBots(false, true);
            unVar.ga(user.f22174id, unVar.f44462w8, false);
        }
    }

    public static void r8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.q61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f34904a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.z11(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f34904a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.z11(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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

    public static void s0(un unVar, long j10, boolean z10) {
        if (!unVar.T4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(unVar.currentAccount).edit();
            edit.putInt("pin_" + unVar.f44249f6, ((Integer) unVar.T4.get(0)).intValue()).commit();
            unVar.T4.clear();
            unVar.V4.clear();
            unVar.X4 = 0;
            unVar.f44195b5 = 0;
            unVar.f44209c5 = 0;
            unVar.Lc(0, true);
        }
        if (ChatObject.isMonoForum(unVar.e) && ChatObject.canManageMonoForum(unVar.currentAccount, unVar.e)) {
            if (j10 != 0) {
                unVar.getMessagesStorage().removeTopic(-unVar.e.f22027id, j10);
                unVar.getMessagesController().deleteSavedDialog(j10, unVar.getMessagesController().getInputPeer(-unVar.e.f22027id));
                unVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(unVar.e.f22027id, j10);
            }
        } else {
            unVar.getMessagesController().deleteDialog(unVar.f44249f6, 1, z10);
            unVar.getMessagesStorage().removeAllTopics(unVar.f44249f6);
            unVar.getMessagesController().getTopicsController().reloadTopics(-unVar.f44249f6);
        }
        unVar.Y5.put(j10, 0);
        org.telegram.ui.Components.e41 e41Var = unVar.f44219d2;
        if (e41Var != null) {
            e41Var.setAllTopicsHidden(false);
        }
        if (j10 == unVar.f44370p4) {
            unVar.F7(false, null);
            unVar.A0.O(false);
        }
    }

    public static void s1(un unVar) {
        if (!unVar.l7(unVar.Y.getSendButton())) {
            if (unVar.getMediaController().isPlayingMessage(unVar.f44371p5)) {
                unVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = unVar.getMessagesController().getInputPeer(unVar.f44249f6);
            if (unVar.q5 != null) {
                for (int i10 = 0; i10 < unVar.q5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f22143id.add(Integer.valueOf(unVar.q5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f22143id.add(Integer.valueOf(unVar.f44371p5.getId()));
            }
            ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new z7(5, unVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void t1(long j10, un unVar) {
        if (bi.ca.y(unVar.currentAccount, false).p().amount < j10) {
            new bi.tc(unVar.getParentActivity(), unVar.getResourceProvider(), j10, 13, DialogObject.getShortName(unVar.a()), new kf(unVar, 22), unVar.a()).show();
        } else {
            new bi.uc(unVar.getParentActivity(), unVar.resourceProvider).show();
        }
    }

    public static void u0(un unVar, TLRPC.Document document) {
        unVar.H4.put(document, 0);
        SendMessagesHelper.getInstance(unVar.currentAccount).sendSticker(document, null, unVar.f44249f6, null, null, null, unVar.f44473x5, null, true, 0, 0, false, null, unVar.L8(), 0L, unVar.X8(), unVar.f44407s5);
    }

    public static void v0(un unVar, Object[] objArr, org.telegram.ui.Components.cz0 cz0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.wc wcVar = new org.telegram.ui.Components.wc(cz0Var.container, unVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.qc q5 = wcVar.q(document, LocaleController.formatString(i10, stickerSet.title));
                q5.f31887j = 2750;
                q5.k(true);
            }
        }
    }

    public static void v1(un unVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (unVar.Hb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            unVar.S5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                unVar.S5 = null;
                MessagePreviewParams messagePreviewParams = unVar.f44394r5;
                if (messagePreviewParams != null) {
                    int i11 = unVar.currentAccount;
                    CharSequence fieldText = unVar.Y.getFieldText();
                    MessageObject messageObject3 = unVar.f44498z5;
                    if (messageObject3 == unVar.f44295j4) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, unVar.f44473x5, unVar.B5);
                }
                unVar.q8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                unVar.U5 = str;
            }
            if (unVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = unVar.f44394r5;
            if (messagePreviewParams2 != null) {
                int i12 = unVar.currentAccount;
                CharSequence fieldText2 = unVar.Y.getFieldText();
                MessageObject messageObject4 = unVar.f44498z5;
                if (messageObject4 == unVar.f44295j4) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, unVar.f44473x5, unVar.B5);
            }
            unVar.Qb(true, unVar.S5, false);
            return;
        }
        unVar.S5 = null;
        unVar.q8();
    }

    public static void w0(un unVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(unVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f22143id;
        long clientUserId = unVar.getUserConfig().getClientUserId();
        long j11 = unVar.f44249f6;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void w1(org.telegram.ui.un r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.w1(org.telegram.ui.un, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static Integer w8(ArrayList arrayList, int i10, int[] iArr) {
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

    public static void x0(un unVar) {
        MessagesController messagesController = unVar.getMessagesController();
        long j10 = unVar.f44249f6;
        long j11 = unVar.X6;
        int i10 = unVar.classGuid;
        int i11 = unVar.f44221d4;
        long j12 = unVar.f44370p4;
        int i12 = unVar.f44484y4;
        int i13 = unVar.f44272h6;
        unVar.f44272h6 = i13 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j12, i12, i13, unVar.f44419t4);
    }

    public static void x1(un unVar, View view, int i10) {
        org.telegram.ui.Components.c6 c6Var;
        TLRPC.User user;
        char c10;
        kk kkVar;
        kk kkVar2;
        if (i10 != 0) {
            ig.j1 adapter = unVar.U1.getAdapter();
            if (adapter.f14137w0 != null && !adapter.f14119h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = unVar.U1.getAdapter().J(i11);
            int i12 = unVar.U1.getAdapter().X;
            int i13 = unVar.U1.getAdapter().Y;
            if (unVar.U1.getAdapter().F != null && i11 == 1) {
                unVar.Y.M0(i12, i13, unVar.U1.getAdapter().F + "@" + ChatObject.getPublicUsername(unVar.e) + " ", false);
            } else if (unVar.U1.getAdapter().F != null && i11 == 0) {
                unVar.Y.M0(i12, i13, a1.g.s(new StringBuilder(), unVar.U1.getAdapter().F, " "), false);
            } else if (J instanceof jg.b2) {
                if (!unVar.getUserConfig().isPremium()) {
                    unVar.showDialog(new tg.y0(unVar, unVar.getParentActivity(), unVar.currentAccount, true, 31, false, null));
                    return;
                }
                jg.b2 b2Var = (jg.b2) J;
                org.telegram.ui.Components.g5.Z(unVar.currentAccount, Math.max(1, b2Var.a()), unVar.f44249f6, new li.s2(10, unVar, b2Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (unVar.f44221d4 != 0 || !unVar.l7(view)) {
                        if (view instanceof org.telegram.ui.Cells.g8) {
                            sendAnimationData = ((org.telegram.ui.Cells.g8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.g5.Z(unVar.currentAccount, 1, unVar.a(), new bi.b3(unVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), unVar.U1.getAdapter().L(i11), sendAnimationData, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (unVar.f44496z3 && (kkVar2 = unVar.f44220d3) != null && kkVar2.getVisibility() == 0) {
                        unVar.ib(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        unVar.Y.M0(i12, i13, a1.g.p("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (unVar.f44496z3 && (kkVar = unVar.f44220d3) != null && kkVar.getVisibility() == 0) {
                        unVar.ib(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        unVar.Y.M0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(org.telegram.ui.Components.b10.u(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.a71("" + user2.f22174id, 3, null), 0, spannableString.length(), 33);
                        unVar.Y.M0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof ig.g1) {
                    if (unVar.U1.getAdapter().J != null && unVar.f44221d4 != 1) {
                        ig.g1 g1Var = (ig.g1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(g1Var.f14060a, unVar.f44249f6, unVar.f44498z5, unVar.f44295j4, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = unVar.L8();
                        of2.ephemeralReceiverBotId = g1Var.f14061b;
                        of2.monoForumPeer = unVar.X8();
                        of2.suggestionParams = unVar.f44407s5;
                        unVar.getSendMessagesHelper().sendMessage(of2);
                        unVar.Y.setFieldText("");
                        unVar.o9(false);
                    }
                } else if (J instanceof String) {
                    if (unVar.U1.getAdapter().J != null) {
                        if (unVar.f44221d4 == 1) {
                            org.telegram.ui.Components.g5.L(unVar.getParentActivity(), unVar.f44249f6, new m4.s0(15, unVar, (String) J), unVar.f44385qa);
                            return;
                        } else if (!unVar.l7(view)) {
                            org.telegram.ui.Components.g5.Z(unVar.currentAccount, 1, unVar.f44249f6, new li.s2(11, unVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    unVar.Y.M0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (unVar.Y.getFieldText() != null) {
                        if (unVar.f44221d4 == 1 || !unVar.l7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (unVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity(), 0, unVar.f44385qa);
                                    alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    unVar.showDialog(alertDialog$Builder.f22366a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(unVar.U1.getAdapter().R);
                                unVar.Ua = arrayList;
                                PhotoViewer.u1().M2(null, unVar, unVar.f44385qa);
                                PhotoViewer.u1().i2(arrayList, unVar.U1.getAdapter().M(i11), 3, false, unVar.Va, unVar);
                                return;
                            }
                            org.telegram.ui.Components.g5.Z(unVar.currentAccount, 1, unVar.a(), new li.s2(12, unVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    ed edVar = new ed(7, unVar, (TLRPC.TL_inlineBotWebView) J);
                    if (unVar.Fb) {
                        edVar.run();
                    } else {
                        ki1.a(unVar.getParentActivity(), new li.s2(14, unVar, edVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    zj zjVar = unVar.U1;
                    if (zjVar != null && (user = zjVar.getAdapter().f14137w0) != null) {
                        unVar.Y.setFieldText("");
                        long j10 = unVar.f44249f6;
                        if (j10 == user.f22174id) {
                            unVar.f44396r8 = j10;
                            unVar.getMessagesController().sendBotStart(unVar.f44242f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f22174id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", unVar.f44249f6);
                        if (unVar.getMessagesController().checkCanOpenChat(bundle, unVar)) {
                            unVar.presentFragment(new un(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    hk hkVar = unVar.Y;
                    hkVar.R();
                    hkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            unVar.Y.M0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = unVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                FileLog.e((Throwable) e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.t5.f(unVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                c6Var = new org.telegram.ui.Components.c6(f7, fontMetricsInt);
                            } else {
                                c6Var = new org.telegram.ui.Components.c6(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(c6Var, 0, spannableString2.length(), 33);
                            unVar.Y.M0(i12, i13, spannableString2, false);
                            unVar.U1.o(false);
                        }
                    }
                    unVar.Y.M0(i12, i13, str, true);
                    unVar.U1.o(false);
                }
            }
        }
    }

    public static void y0(un unVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.i1(unVar.getParentActivity(), unVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, unVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            unVar.presentFragment(new po0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void y1(org.telegram.ui.un r19, final org.telegram.ui.a31[] r20, final org.telegram.ui.Components.k80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.y1(org.telegram.ui.un, org.telegram.ui.a31[], org.telegram.ui.Components.k80):void");
    }

    public static void z0(un unVar, long j10, long j11, Long l4) {
        int i10;
        String str;
        if (unVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = unVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(unVar.e)) {
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
        org.telegram.ui.Components.g5.h0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new gh(unVar, j10, j11, l4, 0), unVar.resourceProvider, true);
    }

    public static void z1(un unVar, long j10, long j11, Long l4, Boolean bool) {
        boolean z10 = false;
        bi.ca y3 = bi.ca.y(unVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.i0(j10, j11, z10, true);
    }

    @Override
    public final org.telegram.ui.Components.vw0 A() {
        return this.f44292j1;
    }

    public final void A6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.q9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f44242f, null, this.f44249f6, this.Ha, this.Ga);
    }

    public final void A7() {
        un unVar = this.f44376pa;
        if (unVar != null) {
            unVar.A7();
        }
        float f92 = f9(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.f44219d2 != null) {
            f92 += g9(org.telegram.ui.Components.a41.f26406a);
        }
        if (this.A1 != null) {
            f92 += AndroidUtilities.dp(35.0f) * this.A1.E;
        }
        this.X.setFadeZoneTop((int) ((I8() * AndroidUtilities.dp(43.0f)) + f92));
    }

    public final boolean A8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f44468x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f44468x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.s1) && (currentMessagesGroup = ((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.G6.indexOf((MessageObject) ic.a.g(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        fm fmVar = this.A0;
                        fmVar.q(indexOf + fmVar.J, currentMessagesGroup.messages.size());
                        this.f44468x0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!AndroidUtilities.isTablet()) {
            return true;
        }
        if (AndroidUtilities.isSmallTablet() && ApplicationLoader.applicationContext.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(false));
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && !j5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.j2(z10));
        return false;
    }

    public final void A9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f44242f) != null && user.contact_require_premium) {
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

    public final void Aa(long j10, boolean z10) {
        if (this.f44219d2 != null && UserObject.isBotForum(this.f44242f)) {
            this.f44219d2.setAllTopicsHidden(true);
        }
        this.Y5.put(j10, 1);
        X7();
        UndoView undoView = this.K3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f44249f6, 0, new bi.kd(this, j10, z10, 6), new ag.o0(this, j10, 2));
        this.A0.O(false);
    }

    public final void Ab(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f44357o4 = tL_forumTopic;
        this.f44330m4 = arrayList;
        MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
        this.f44295j4 = messageObject;
        this.f44498z5 = messageObject;
        this.f44458w4 = i11;
        this.f44472x4 = i12;
        this.f44484y4 = Math.max(1, i11);
        this.f44370p4 = this.f44295j4.getId();
        this.f44381q4 = i10;
        this.f44393r4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44419t4 = z10;
        MessageObject messageObject2 = this.f44498z5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44406s4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        Mc();
        dd(false);
        uc(false);
    }

    public final void Ac() {
        final long j10;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.f44231e1 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.e.f22027id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f22027id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f22027id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(bi.dd.Q0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.f44231e1.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final un f46054b;

                    {
                        this.f46054b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                un.t1(j11, this.f46054b);
                                return;
                            default:
                                un.b0(j11, this.f46054b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f44231e1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f44334m8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.vo voVar = this.f44231e1;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                voVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.f44249f6))), LocaleController.getString(R.string.MessagePremiumUnlock), new bh.f(9));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.vo voVar2 = this.f44231e1;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                voVar2.c(z10, false, AndroidUtilities.replaceTags(bi.dd.Q0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.f44249f6), LocaleController.formatNumber(this.f44334m8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final un f46054b;

                    {
                        this.f46054b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                un.t1(j10, this.f46054b);
                                return;
                            default:
                                un.b0(j10, this.f46054b);
                                return;
                        }
                    }
                });
            } else {
                this.f44231e1.c(false, false, null, null, null);
            }
        } else {
            this.f44231e1.c(false, false, null, null, null);
        }
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.e)) {
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f44176a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new og.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new jg(this, 19)));
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new jg(this, 20)));
        }
        if (this.f44242f == null) {
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new s0("", 1)));
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.b2(this)));
        }
        return arrayList;
    }

    public final void B6(MessageObject messageObject, boolean z10) {
        C6(messageObject, z10, true);
    }

    public final void B7() {
        if (this.Y0 != null) {
            this.Y0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - I8()) * (1.0f - this.Vc.e) * b9())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final void B8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j10) {
        boolean z13;
        if (!arrayList.isEmpty() && m7()) {
            boolean z14 = false;
            if (i10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f44221d4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.A9 = true;
                fm fmVar = this.A0;
                if (fmVar != null) {
                    fmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.f44249f6, z10, z11, z12, i10, 0, this.f44295j4, -1, j10, X8(), this.f44407s5);
            org.telegram.ui.Components.g5.s0(sendMessage, this, this.f44385qa);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new kf(this, 28));
            }
        }
    }

    public final boolean B9() {
        if (this.f44219d2 != null && this.f44370p4 == 0) {
            return true;
        }
        return false;
    }

    public final boolean Ba() {
        if (this.T4.size() != 1 || this.f44307k4 == null || ((Integer) this.T4.get(0)).intValue() != this.f44307k4.getId()) {
            return false;
        }
        return true;
    }

    public final void Bb() {
        AndroidUtilities.shakeViewSpring(this.f44468x0, 5.0f);
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

    public final void Bc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Bc(boolean):void");
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.C6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void C7() {
        float f7 = this.I9;
        sk skVar = this.A1;
        if (skVar != null) {
            skVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.A1.E;
        }
        ek ekVar = this.B1;
        if (ekVar != null) {
            ekVar.setTranslationY(f7);
        }
        float I8 = (I8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.e41 e41Var = this.f44219d2;
        org.telegram.ui.Components.a41 a41Var = org.telegram.ui.Components.a41.f26406a;
        if (e41Var != null) {
            e41Var.setSideMenuBackgroundMarginTop((I8() * f9(AndroidUtilities.dp(7.0f))) + I8);
            float g92 = g9(a41Var);
            float a2 = a8.v0.a(this.Vc.e);
            float I82 = I8();
            I8 += a8.v0.a(Math.min(a8.ee.a(a8.v0.a(a2), 0.0f, 1.0f), a8.ee.a(a8.v0.a(I82), 0.0f, 1.0f))) * g92;
        }
        org.telegram.ui.Components.ch chVar = this.Y0;
        if (chVar != null) {
            chVar.setTranslationY((I8 - AndroidUtilities.dp(5.0f)) - (I8() * g9(a41Var)));
        }
    }

    public final r0.k1 C8(r0.k1 k1Var) {
        di.a3 a3Var;
        r0.a1 w0Var;
        if (k1Var != null && (a3Var = this.V1) != null) {
            if ((a3Var.isShowing() && !this.V1.isDismissed()) || this.V1.f33075x0) {
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

    public final void Ca() {
        org.telegram.ui.Cells.s1 s1Var;
        this.Tc.a(false, true);
        sh.c cVar = this.Zc;
        if (cVar != null && (s1Var = cVar.f48619n) != null && s1Var.getDelegate() != null) {
            cVar.f48619n.getDelegate().n1(cVar.f48619n, false);
        }
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.S0(true, true, false);
            this.Y.Y4 = null;
        }
    }

    public final void Cb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44385qa);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = string;
        TLRPC.User user = this.f44242f;
        if (user != null) {
            if (user.bot) {
                e2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String g7 = org.telegram.messenger.vh.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, kf.b.c());
                TLRPC.User user2 = this.f44242f;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, g7, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            e2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new i2.z(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(e2Var);
    }

    public final void Cc() {
        MessageObject messageObject;
        if (this.f44242f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                oj ojVar = this.f44468x0;
                if (ojVar != null) {
                    int childCount = ojVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f44468x0.getChildAt(i10);
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.B8, this.C8, this.f44242f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f36166h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f44242f, null, null, messageObject2.getId());
            }
        }
    }

    public final void D6() {
        this.f44407s5 = null;
        if (this.f44370p4 == 0 || this.f44419t4) {
            if (this.f44419t4) {
                this.f44498z5 = this.f44295j4;
            } else {
                this.f44498z5 = null;
            }
            this.f44473x5 = null;
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.i1(null, null, null);
            }
        }
        o9(false);
        if (this.f44221d4 == 0) {
            getMediaDataController().cleanDraft(this.f44249f6, this.f44370p4, true);
        }
    }

    public final void D7() {
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
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.f44249f6 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.A6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j10 = this.e.f22027id;
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
                        int indexOf2 = arrayList.indexOf((MessageObject) ic.a.g(1, groupedMessages2.messages));
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

    public final TLRPC.ChatFull D8() {
        return this.f44322l8;
    }

    public final boolean D9() {
        if (!ChatObject.isForum(this.e) || this.f44419t4) {
            if (ChatObject.isMonoForum(this.e) && b() == 0 && !this.f44247f4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Da(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar;
        if (this.Tc.f19327f && (cVar = this.Zc) != null && cVar.f48619n == s1Var) {
            Editable text = cVar.f48615a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(s1Var.getMessageObject(), text, this.Zc.getAttachedMedia());
                Ca();
                return;
            }
            AndroidUtilities.shakeView(this.Zc.f48615a);
        }
    }

    public final boolean Db() {
        if (D9() && this.f44498z5 == null && this.B5 == null) {
            if (this.f44221d4 != 8 && D9() && this.e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f22027id, 1L);
                if (this.f44221d4 != 8) {
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

    public final void Dc(MessageObject messageObject, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new bi.u7(this, messageObject, z10, 14));
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        boolean z10;
        int i11;
        int i12;
        if (i10 == 0) {
            ca();
            return;
        }
        boolean z11 = true;
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
            ca();
            z7();
            sh.c cVar = this.Zc;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.Tc.e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                oe.b bVar = this.Uc;
                float f11 = 1.0f - bVar.e;
                this.Y0.setAlpha(f11);
                org.telegram.ui.Components.ch chVar = this.Y0;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                chVar.setVisibility(i12);
                float f12 = 1.0f - bVar.e;
                org.telegram.ui.Components.e41 e41Var = this.f44219d2;
                if (e41Var != null) {
                    e41Var.setAlpha(f12);
                    org.telegram.ui.Components.e41 e41Var2 = this.f44219d2;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    e41Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                bh.r rVar = this.W3;
                oe.b bVar2 = this.Vc;
                if (rVar != null) {
                    float f13 = bVar2.e;
                    rVar.setAlpha(f13);
                    bh.r rVar2 = this.W3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    rVar2.setVisibility(i15);
                }
                if (bVar2.e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                lh.f fVar = this.X;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                fVar.setVisibility(i11);
                s7();
                if (bVar2.e >= 1.0f) {
                    z11 = false;
                }
                oj ojVar = this.f44468x0;
                if (z11) {
                    i13 = 0;
                }
                ojVar.setVisibility(i13);
                z7();
                C7();
                B7();
                this.glassEngine.g();
            } else if (i10 == 5) {
                r7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f7);
                }
            } else if (i10 == 6) {
                w7();
            }
        }
    }

    public final void E6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44385qa);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            e2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            e2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(e2Var);
    }

    public final void E7(boolean z10) {
        boolean z11;
        this.f44325lb = 0;
        this.f44337mb = Integer.MIN_VALUE;
        if (this.f44301jb) {
            this.f44301jb = false;
            this.f44314kb = false;
            rj rjVar = this.f44493z0;
            if (rjVar != null) {
                rjVar.G = true;
            }
        }
        this.G6.clear();
        this.D6.clear();
        this.E6.clear();
        this.f44421t6.clear();
        this.J6.b();
        this.f44432u4 = false;
        fm fmVar = this.A0;
        if (fmVar != null) {
            if (fmVar.f39416w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            bc(z11);
        }
        oj ojVar = this.f44468x0;
        if (ojVar != null) {
            ojVar.setEmptyView(null);
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
        this.f44296j5 = false;
        this.G7 = 0;
        this.F7 = false;
        this.W6 = 0;
        this.V7 = null;
        this.P7 = 0;
        this.Q7 = false;
        this.M7 = false;
        fm fmVar2 = this.A0;
        if (fmVar2 != null && !fmVar2.N) {
            fmVar2.O(false);
        }
    }

    public final TLRPC.UserFull E8() {
        return this.f44334m8;
    }

    public final boolean E9() {
        return UserObject.isBotForum(this.f44242f);
    }

    public final void Ea(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        MessageObject messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        bh.x0 d = bh.x0.d(reactionCount.reaction);
        if (zVar instanceof org.telegram.ui.Cells.s1) {
            messageObject = ((org.telegram.ui.Cells.s1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) zVar).getMessageObject();
        } else {
            return;
        }
        MessageObject messageObject2 = messageObject;
        jb(zVar, messageObject2, null, null, f7, f10, d, false, false, false, false);
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
                xc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.C3)) {
            MessageObject.GroupedMessages h92 = h9(messageObject2);
            if (h92 != null) {
                for (int i10 = 0; i10 < h92.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(h92.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            ig.n1 n1Var = this.Y3;
            if (n1Var != null) {
                n1Var.l();
            }
            xc(true);
        }
    }

    public final void Eb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.wc.b0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f44385qa).j();
    }

    public final void Ec(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.J6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                qj qjVar = this.f44481y0;
                if (qjVar != null) {
                    qjVar.V(groupedMessages);
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
                a0.h hVar = this.f44439ub;
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
            int indexOf2 = this.G6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                fm fmVar2 = this.A0;
                fmVar2.m(fmVar2.J + indexOf2);
            }
        }
    }

    public final void F6(boolean z10, boolean z11) {
        long j10;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        kn knVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        kn knVar2;
        String str;
        int findQuoteStart;
        kn knVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j12;
        org.telegram.ui.Components.y11 y11Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.c6 c6Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        Long l10;
        if (this.Y != null) {
            int i10 = this.f44221d4;
            char c10 = '\b';
            if (i10 == 0 || i10 == 8 || (i10 == 3 && getUserConfig().getClientUserId() == S8())) {
                long j14 = 0;
                if (this.f44221d4 == 8) {
                    if (ChatObject.isMonoForum(this.e)) {
                        if (this.f44370p4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.y11 y11Var2 = null;
                if (D9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.f44249f6);
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
                    long j15 = this.f44249f6;
                    if (this.f44221d4 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.f44370p4;
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
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.f44249f6, b());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j16 = this.f44249f6;
                    if (l4 != null) {
                        j13 = l4.longValue();
                    } else {
                        j13 = this.f44370p4;
                    }
                    message = mediaDataController2.getDraftMessage(j16, j13);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.f44221d4 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.f44466wc >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        o9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.f44466wc = draftMessage3.date;
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
                                y11Var = null;
                                org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(a1.g.o(j12, ""), 3, null);
                                int i12 = messageEntity.offset;
                                valueOf.setSpan(a71Var, i12, messageEntity.length + i12, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f34904a |= 4;
                                    org.telegram.ui.Components.z11 z11Var = new org.telegram.ui.Components.z11(obj, 0);
                                    int i13 = messageEntity.offset;
                                    MediaDataController.addStyleToText(z11Var, i13, messageEntity.length + i13, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f34904a |= 1;
                                        org.telegram.ui.Components.z11 z11Var2 = new org.telegram.ui.Components.z11(obj2, 0);
                                        int i14 = messageEntity.offset;
                                        MediaDataController.addStyleToText(z11Var2, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f34904a |= 2;
                                        org.telegram.ui.Components.z11 z11Var3 = new org.telegram.ui.Components.z11(obj3, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(z11Var3, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f34904a |= 8;
                                        org.telegram.ui.Components.z11 z11Var4 = new org.telegram.ui.Components.z11(obj4, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(z11Var4, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f34904a |= 16;
                                        org.telegram.ui.Components.z11 z11Var5 = new org.telegram.ui.Components.z11(obj5, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(z11Var5, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.z61 z61Var = new org.telegram.ui.Components.z61(messageEntity.url, y11Var2);
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(z61Var, i18, messageEntity.length + i18, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f34904a |= 256;
                                        org.telegram.ui.Components.z11 z11Var6 = new org.telegram.ui.Components.z11(obj6, 0);
                                        int i19 = messageEntity.offset;
                                        MediaDataController.addStyleToText(z11Var6, i19, messageEntity.length + i19, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i20 = messageEntity.offset;
                                        org.telegram.ui.Components.sj0.c(valueOf, i20, messageEntity.length + i20, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e) {
                                            FileLog.e((Throwable) e, false);
                                            fontMetricsInt = y11Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            c6Var = new org.telegram.ui.Components.c6(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                            draftMessage2 = draftMessage3;
                                        } else {
                                            draftMessage2 = draftMessage3;
                                            c6Var = new org.telegram.ui.Components.c6(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i21 = messageEntity.offset;
                                        valueOf.setSpan(c6Var, i21, messageEntity.length + i21, 33);
                                    } else {
                                        draftMessage2 = draftMessage3;
                                        y11Var = y11Var2;
                                    }
                                    y11Var = y11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                y11Var = null;
                            }
                            i11++;
                            y11Var2 = y11Var;
                            c10 = c11;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        knVar = y11Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        knVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.Y.c1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Y.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new le(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f44407s5 = of2;
                        Pb(of2);
                    }
                    messageObject = this.f44498z5;
                    if (messageObject != null || this.f44295j4 == messageObject) {
                        if (message == null && ((messageObject2 = this.f44295j4) == null || messageObject2.getId() != message.f22048id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f44498z5 = messageObject3;
                            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
                            if (inputReplyTo2 != null) {
                                int i22 = inputReplyTo2.flags;
                                if ((i22 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i23 = -1;
                                    if (arrayList != null) {
                                        int i24 = inputReplyTo2.quote_offset;
                                        if (arrayList.isEmpty()) {
                                            knVar3 = knVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            ?? obj7 = new Object();
                                            obj7.f40976a = messageObject3;
                                            obj7.f40977b = -1;
                                            obj7.f40978c = -1;
                                            obj7.d = -1;
                                            obj7.f40985m = true;
                                            obj7.e(i24, arrayList);
                                            knVar3 = obj7;
                                        }
                                        this.f44473x5 = knVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i22 & 16) != 0) {
                                            i23 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message3 = messageObject3.messageOwner;
                                        if (message3 == null || (str = message3.message) == null || str3 == null || (findQuoteStart = MessageObject.findQuoteStart(str, str3, i23)) < 0) {
                                            knVar2 = knVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            knVar2 = new kn(messageObject3, findQuoteStart, str3.length() + findQuoteStart);
                                        }
                                        this.f44473x5 = knVar2;
                                    }
                                }
                            }
                            c7(false);
                            kn knVar4 = this.f44473x5;
                            if (knVar4 != null) {
                                Ob(this.f44498z5, knVar4);
                            } else {
                                Nb(this.f44498z5);
                            }
                            uc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j11 && this.e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.e.f22027id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.f44498z5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Nb(messageObject4);
                            uc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j11 = 0;
                knVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f44407s5 = of22;
                    Pb(of22);
                }
                messageObject = this.f44498z5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l4 == null) {
                }
            }
        }
    }

    public final void F7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.L6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.T6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.t.o(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.P7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.Q6[0] = false;
            this.R6 = false;
            fm fmVar = this.A0;
            if (fmVar != null && fmVar.F < 0) {
                fmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f44447v6 = i12;
            this.f44474x6 = dialog2.unread_mentions_count;
            if (this.f44460w6 != i12) {
                lh.h hVar = this.f44442v1;
                if (hVar != null) {
                    hVar.c(1, i12, this.Z5);
                }
                this.f44460w6 = this.f44447v6;
                Ic();
            }
            int i13 = this.f44474x6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.f44474x6 = i14;
                if (i14 <= 0) {
                    this.f44474x6 = 0;
                    this.f44486y6 = true;
                    Wb(false);
                } else {
                    lh.h hVar2 = this.f44442v1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    Wb(true);
                }
            }
            h7(false);
            return;
        }
        this.G6.clear();
        this.f44421t6.clear();
        this.D6.clear();
        this.E6.clear();
        this.J6.b();
        this.f44432u4 = false;
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
            this.f44285i6[i15].clear();
            this.f44297j6[i15].clear();
            this.f44309k6[i15].clear();
        }
        m9();
        Lc(0, true);
        if (this.f44476x8 != null) {
            this.f44476x8 = null;
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.W0(null, true, false);
            }
        }
        if (this.P != null) {
            bc(false);
            N7(false);
            this.f44468x0.setEmptyView(this.f44205c1);
        }
        fm fmVar2 = this.A0;
        if (fmVar2 != null) {
            fmVar2.O(false);
        }
        if (this.h == null && (user = this.f44242f) != null && user.bot && this.f44384q8 == null) {
            this.f44384q8 = "";
            uc(false);
        }
    }

    public final ArrayList F8() {
        fm fmVar = this.A0;
        if (fmVar != null) {
            return fmVar.P;
        }
        return null;
    }

    public boolean F9() {
        if (this.f44292j1.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Fa(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Fa(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Fb(org.telegram.ui.Cells.s1 s1Var) {
        if (getParentActivity() != null && s1Var != null && s1Var.f25222ob != null && s1Var.getPrimaryMessageObject() != null && s1Var.getPrimaryMessageObject().messageOwner != null && s1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.f44413sb) {
                this.f44413sb = true;
                if (this.L1 != null) {
                    return;
                }
                fi.v3 v3Var = new fi.v3(getParentActivity(), 3);
                v3Var.p(true);
                v3Var.K = Layout.Alignment.ALIGN_NORMAL;
                v3Var.d = -1L;
                v3Var.T = true;
                v3Var.e = true;
                v3Var.i(true);
                v3Var.q(8.0f);
                this.L1 = v3Var;
                v3Var.s(AndroidUtilities.replaceTags(LocaleController.getString(R.string.MessageBizBot)));
                fi.v3 v3Var2 = this.L1;
                v3Var2.h = fi.v3.a(v3Var2.getText(), this.L1.getTextPaint());
                this.f44292j1.addView(this.L1, org.telegram.ui.Components.gb1.h(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f44292j1.post(new ed(5, this, s1Var));
            }
        }
    }

    public final void Fc() {
        org.telegram.ui.ActionBar.o1 o1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        oj ojVar = this.f44468x0;
        zj zjVar = this.U1;
        if ((zjVar != null && zjVar.I) || ((o1Var = this.f44213c9) != null && o1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        ojVar.setImportantForAccessibility(i10);
    }

    public final int G6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f44468x0.getHeight();
        int i11 = 0;
        long j10 = 0;
        while (true) {
            View U0 = this.f44468x0.U0(i10);
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

    public final void G7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.f44285i6[i10].clear();
            this.f44297j6[i10].clear();
            this.f44309k6[i10].clear();
        }
        m9();
        Lc(0, true);
        jd(z10);
        Yc();
    }

    public final oi.q G8() {
        un unVar = this.f44376pa;
        if (unVar != null) {
            return unVar.G8();
        }
        return this.glassEngine;
    }

    public final boolean G9() {
        if (ChatObject.isChannelAndNotMegaGroup(this.e) && !O9() && this.f44221d4 == 0) {
            return true;
        }
        return false;
    }

    public final void Ga(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        org.telegram.ui.Components.y11 y11Var;
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
                    qf.d.p(getParentActivity(), Uri.parse(str), true, true, U9(s1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f44396r8 == 0) {
                        z12 = true;
                    }
                    qf.d.p(parentActivity, parse, z12, true, U9(s1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f44396r8 == 0) {
                        z12 = true;
                    }
                    qf.d.p(parentActivity2, parse2, z12, true, U9(s1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.q0(this, str, true, true, false, false, U9(s1Var, characterStyle), null, this.f44385qa);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.z61) && (y11Var = ((org.telegram.ui.Components.z61) characterStyle).f35230a) != null && (y11Var.f34904a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, U9(s1Var, characterStyle), null, this.f44385qa);
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
        if (characterStyle instanceof org.telegram.ui.Components.z61) {
            z12 = true;
        }
        org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, U9(s1Var, characterStyle), null, this.f44385qa);
    }

    public final void Gb(boolean z10, boolean z11) {
        int i10;
        float f7;
        float f10;
        int i11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        View view;
        int i12;
        if (this.G0 != null && G9()) {
            TLRPC.Chat chat = this.e;
            if (!chat.in_news && ChatObject.isNotInChat(chat)) {
                i12 = org.telegram.ui.ActionBar.y6.Sh;
            } else {
                i12 = org.telegram.ui.ActionBar.y6.Oh;
            }
            this.H0 = i12;
            this.G0.setProgressColor(getThemedColor(i12));
        }
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
            int i13 = 0;
            float f16 = 0.1f;
            if (z11) {
                this.T0 = new AnimatorSet();
                if (z10) {
                    this.G0.setVisibility(0);
                    AnimatorSet animatorSet2 = this.T0;
                    nk nkVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(nkVar, property, 0.1f);
                    nk nkVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(nkVar2, property2, 0.1f);
                    nk nkVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(nkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
                    this.T0.setStartDelay(200L);
                } else {
                    if (this.C0) {
                        view = this.D0;
                    } else {
                        view = this.B0;
                    }
                    view.setVisibility(0);
                    AnimatorSet animatorSet3 = this.T0;
                    RadialProgressView radialProgressView2 = this.G0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.G0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.G0;
                    Property property6 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(view, property4, 1.0f), ObjectAnimator.ofFloat(view, property5, 1.0f), ObjectAnimator.ofFloat(view, property6, 1.0f));
                }
                this.T0.addListener(new bh.f0(29, this, z10));
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
            nk nkVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            nkVar4.setVisibility(i11);
            org.telegram.ui.Components.z90 z90Var = this.D0;
            if (z10 || !this.C0) {
                i13 = 4;
            }
            z90Var.setVisibility(i13);
            nk nkVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            nkVar5.setScaleX(f11);
            org.telegram.ui.Components.z90 z90Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            z90Var2.setScaleX(f12);
            nk nkVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            nkVar6.setScaleY(f13);
            org.telegram.ui.Components.z90 z90Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            z90Var3.setScaleY(f16);
            nk nkVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            nkVar7.setAlpha(f14);
            org.telegram.ui.Components.z90 z90Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            z90Var4.setAlpha(f15);
        }
    }

    public final void Gc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    @Override
    public final boolean H() {
        return this.f44436u8;
    }

    public final float H6(boolean z10) {
        float f7;
        float f10;
        float f11;
        hk hkVar = this.Y;
        float f12 = 0.0f;
        if (hkVar != null) {
            if (z10) {
                f7 = hkVar.f25932o5;
            } else {
                f7 = hkVar.f25926n5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        oe.b bVar = this.Tc;
        k6.m mVar = this.Yc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(mVar.f16423a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(mVar.f16423a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f19327f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) mVar.f16424b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.e;
            f11 = f13;
        }
        if (!this.f44201bb && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f11) * f10, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f12);
        }
        return AndroidUtilities.lerp(dp, max, f11) * f10;
    }

    public final void H7(boolean z10) {
        this.f44226d9 = z10;
        org.telegram.ui.ActionBar.o1 o1Var = this.f44213c9;
        if (o1Var != null) {
            o1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f44479xc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f44479xc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f44479xc = ofFloat;
            ofFloat.addUpdateListener(new ne(this, 0));
            this.f44479xc.setDuration(150L);
            this.f44479xc.start();
        }
    }

    public final MessageObject.GroupedMessages H8(long j10) {
        return (MessageObject.GroupedMessages) this.J6.f(j10);
    }

    public final boolean H9() {
        if (this.e != null) {
            return getMessagesController().isChatNoForwards(this.e);
        }
        return getMessagesController().isUserNoForwards(this.f44334m8);
    }

    public final void Ha(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Ha(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void Hb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new ff(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23596q7, getResourceProvider());
        }
    }

    public final void Hc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Hc():void");
    }

    public final boolean I6() {
        if (!I9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f44419t4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                lk lkVar = this.f44178a1;
                if (lkVar == null || lkVar.getVisibility() != 0) {
                    if (!O9() || this.f44419t4) {
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

    public final long I7(MessageObject messageObject) {
        if (this.f44221d4 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.e) && !this.f44419t4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f22079id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.e));
        }
        return this.f44370p4;
    }

    public final float I8() {
        un unVar = this.f44376pa;
        if (unVar == null) {
            unVar = this;
        }
        ek ekVar = unVar.B1;
        if (ekVar == null) {
            return 0.0f;
        }
        return ekVar.f28282b;
    }

    public final boolean I9() {
        int i10 = this.f44221d4;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void Ia(java.util.ArrayList r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Ia(java.util.ArrayList, boolean):void");
    }

    public final void Ib(int i10) {
        int i11;
        if (getParentActivity() != null && this.e != null) {
            TextPaint textPaint = new TextPaint(1);
            textPaint.setTextSize(AndroidUtilities.dp(15.0f));
            textPaint.setTypeface(AndroidUtilities.bold());
            int i12 = 0;
            SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(i10, TextUtils.ellipsize(this.e.title, textPaint, AndroidUtilities.dp(120.0f), TextUtils.TruncateAt.END)));
            if (i10 == R.string.ChannelArchivedBulletin) {
                i12 = R.raw.chats_archived;
            } else if (i10 == R.string.ChannelUnarchivedBulletin) {
                i12 = R.raw.chats_unarchive;
            } else if (i10 == R.string.ChannelDoNotNotifyBulletin) {
                i12 = R.raw.ic_mute;
            } else if (i10 == R.string.ChannelNotifyBulletin) {
                i12 = R.raw.ic_unmute;
            }
            if (i12 != 0) {
                org.telegram.ui.Components.wc.b0(this).P(i12, replaceTags).j();
                return;
            }
            if (i10 == R.string.ChannelRemovedFromNewsBulletin) {
                i11 = R.drawable.news_removed;
            } else if (i10 == R.string.ChannelAddedToNewsBulletin) {
                i11 = R.drawable.news_added;
            } else {
                i11 = R.drawable.news_chats;
            }
            Drawable mutate = getParentActivity().getResources().getDrawable(i11).mutate();
            org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(this);
            b02.getClass();
            org.telegram.ui.Components.qc b10 = b02.b(new org.telegram.ui.Components.qg0(b02.X(), b02.f34407c, mutate, replaceTags), 1780);
            b10.f31889l = true;
            org.telegram.ui.Components.ub ubVar = b10.e;
            ubVar.pillStyle = true;
            ubVar.b();
            b10.f31881a = 1313167187;
            b10.j();
        }
    }

    public final void Ic() {
        boolean z10;
        boolean z11;
        if (this.f44442v1 == null) {
            return;
        }
        if (this.f44411s9 && !l9() && !this.Y.t0() && !this.f44201bb && (!this.E3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f44196b6 != 0 && SystemClock.elapsedRealtime() >= this.f44196b6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f44455w1 = false;
        } else {
            this.N7 = 0;
            this.f44447v6 = 0;
            z11 = true;
        }
        this.f44442v1.e(1, z10, z11);
    }

    @Override
    public final long J() {
        return this.X6;
    }

    public final boolean J6() {
        if (this.h == null) {
            lk lkVar = this.f44178a1;
            if (lkVar == null || lkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int J8(MessageObject messageObject, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.x9 == null) {
            this.x9 = new org.telegram.ui.Cells.s1(getParentActivity(), this.currentAccount, true, this.Oa, this.f44385qa);
        }
        org.telegram.ui.Cells.s1 s1Var = this.x9;
        if (this.e == null && !UserObject.isUserSelf(this.f44242f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        s1Var.N7 = z11;
        org.telegram.ui.Cells.s1 s1Var2 = this.x9;
        int i10 = this.f44221d4;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        s1Var2.P7 = z12;
        if (i10 == 3 && this.f44201bb) {
            z13 = true;
        } else {
            z13 = false;
        }
        s1Var2.Q7 = z13;
        TLRPC.User user = this.f44242f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        s1Var2.R7 = z14;
        if (ChatObject.isChannel(this.e) && this.e.megagroup) {
            z15 = true;
        }
        s1Var2.S7 = z15;
        this.x9.E8 = B9();
        this.x9.F8 = L9();
        this.x9.G8 = K9();
        return this.x9.g1(messageObject, (MessageObject.GroupedMessages) this.J6.f(messageObject.getGroupId()), z10);
    }

    public final boolean J9() {
        return !TextUtils.isEmpty(this.f44259g4);
    }

    public final void Ja(int i10) {
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
                    this.f44274h8 = generatePicturePath.getAbsolutePath();
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
                aq0 aq0Var = new aq0(0, z10, true, this);
                if (this.f44221d4 == 9) {
                    aq0Var.G = 1;
                    aq0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        aq0Var.G = 10;
                        aq0Var.H = true;
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
                        aq0Var.G = i11;
                        aq0Var.H = z11;
                    }
                }
                aq0Var.V = new ll(this);
                presentFragment(aq0Var);
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
                        this.f44274h8 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Jb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.e)) {
                    e60 e60Var = new e60(a());
                    e60Var.f38047l0 = this;
                    presentFragment(e60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.e)) {
                bd bdVar = new bd(a());
                bdVar.f38047l0 = this;
                presentFragment(bdVar);
                return;
            } else {
                return;
            }
        }
        this.f44350na = new org.telegram.ui.Components.yp(this, this.f44385qa);
        this.f44468x0.setOnInterceptTouchListener(new cg(0));
        ub(this.f44292j1, false);
        showDialog(this.f44350na, new qe(this, 1));
    }

    public final void Jc() {
        lh.h hVar = this.f44442v1;
        jj jjVar = this.v;
        if (hVar != null) {
            this.f44442v1.setTranslationY((((-jjVar.d()) - this.S.getInputBubbleHeight()) - g9(org.telegram.ui.Components.a41.f26408c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f44367p1 != null) {
            this.f44367p1.setTranslationY((-jjVar.d()) - AndroidUtilities.dp(16.0f));
        }
    }

    @Override
    public final boolean K(cy cyVar) {
        return false;
    }

    public final boolean K6(MessageObject messageObject) {
        if (this.f44221d4 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f22027id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.f44221d4 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void K7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.K7():void");
    }

    public final boolean K9() {
        org.telegram.ui.Components.e41 e41Var = this.f44219d2;
        if (e41Var != null && e41Var.Q && e41Var.f27723a.f19327f) {
            return true;
        }
        return false;
    }

    public final void Ka(int r38) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Ka(int):void");
    }

    public final void Kb(boolean z10, MessageObject messageObject, ArrayList arrayList, TLRPC.WebPage webPage, boolean z11, int i10, kn knVar, boolean z12, long j10, boolean z13) {
        Lb(z10, messageObject, null, arrayList, webPage, z11, i10, knVar, z12, j10, null, z13);
    }

    public final void Kc(boolean z10) {
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
        if ((!O9() || this.f44419t4) && this.X2 != null) {
            if (!this.f44182a6) {
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
            if (objArr == null && !this.Xb && !this.U2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.Xb && !this.U2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.Xb && !this.U2) {
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
                    this.Y2.setInterpolator(org.telegram.ui.Components.ds.h);
                    this.Y2.setDuration(360L);
                    this.Y2.addListener(new sl(this, z14, z15, z16));
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
                if (O9() && !this.f44419t4) {
                    boolean z18 = z17;
                    this.L2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.L2.c((this.T4.size() - 1) - Collections.binarySearch(this.T4, Integer.valueOf(this.X4), Comparator$CC.reverseOrder()), this.T4.size(), z11);
            }
        }
    }

    public final void L6(final boolean z10, final boolean z11, final boolean z12) {
        TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews;
        if (!this.f44265gb && G9()) {
            this.f44265gb = true;
            if (z11) {
                this.f44277hb = true;
            }
            this.B0.setEnabled(false);
            Gb(true, true);
            final long j10 = this.e.f22027id;
            if (z11) {
                TLRPC.TL_channels_leaveChannel tL_channels_leaveChannel = new TLRPC.TL_channels_leaveChannel();
                tL_channels_leaveChannel.channel = getMessagesController().getInputChannel(j10);
                tL_channels_editChannelNews = tL_channels_leaveChannel;
            } else {
                TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews2 = new TLRPC.TL_channels_editChannelNews();
                tL_channels_editChannelNews2.channel = getMessagesController().getInputChannel(j10);
                tL_channels_editChannelNews2.news = z10;
                tL_channels_editChannelNews = tL_channels_editChannelNews2;
            }
            final TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews3 = tL_channels_editChannelNews;
            getConnectionsManager().sendRequest(tL_channels_editChannelNews3, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final boolean z13;
                    boolean z14;
                    final boolean z15 = z11;
                    if (z15 && tL_error != null && "USER_NOT_PARTICIPANT".equals(tL_error.text)) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z16 = tLObject instanceof TLRPC.Updates;
                    final un unVar = un.this;
                    final long j11 = j10;
                    final boolean z17 = z10;
                    if (z16) {
                        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                        ArrayList<TLRPC.Chat> arrayList = updates.chats;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            TLRPC.Chat chat = arrayList.get(i10);
                            i10++;
                            TLRPC.Chat chat2 = chat;
                            if (chat2.f22027id == j11) {
                                if (z17 && !z15) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                chat2.in_news = z14;
                                if (z15) {
                                    chat2.left = true;
                                }
                            }
                        }
                        unVar.getMessagesController().lambda$processUpdates$379(updates, false);
                    }
                    final boolean z18 = z12;
                    final TLObject tLObject2 = tL_channels_editChannelNews3;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            un.A0(un.this, z13, tL_error, tLObject, j11, z17, z15, z18, tLObject2);
                        }
                    });
                }
            });
        }
    }

    public final void L7() {
        if (getParentActivity() != null && getParentActivity() != null && this.V1 == null) {
            di.a3 a3Var = new di.a3(this, getParentActivity(), this, this.f44385qa, 2);
            this.V1 = a3Var;
            a3Var.Z = a();
            di.a3 a3Var2 = this.V1;
            a3Var2.f33027i0 = true;
            a3Var2.f33010c2 = new jl(this);
        }
    }

    public final SendMessageChatArguments L8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.f44221d4 == 9) {
            builder.setWelcomeMessageChatId(this.Fa);
        }
        if (this.f44221d4 == 5) {
            builder.setQuickReplyShortcut(this.f44208c4, R8());
        }
        return builder.build();
    }

    public final boolean L9() {
        if (this.f44219d2 == null) {
            if (this.f44247f4 || !ChatObject.isMonoForum(this.e)) {
                if (!ChatObject.isForum(this.e) || !ChatObject.areTabsEnabled(this.e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean La(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f44396r8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f44242f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f44396r8 == this.f44249f6) {
                this.f44396r8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f44396r8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((r2Var instanceof un) && ((un) r2Var).f44249f6 == this.f44396r8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f44396r8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f44396r8));
                } else if (DialogObject.isUserDialog(this.f44396r8)) {
                    bundle.putLong("user_id", this.f44396r8);
                } else {
                    bundle.putLong("chat_id", -this.f44396r8);
                }
                A6();
                presentFragment(new un(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Lb(boolean r30, org.telegram.messenger.MessageObject r31, org.telegram.messenger.MessageObject r32, java.util.ArrayList r33, org.telegram.tgnet.TLRPC.WebPage r34, boolean r35, int r36, org.telegram.ui.kn r37, boolean r38, long r39, org.telegram.messenger.MessageSuggestionParams r41, boolean r42) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Lb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.kn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void Lc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Lc(int, boolean):void");
    }

    public final SpannableStringBuilder M6(boolean z10) {
        int i10;
        int i11;
        float f7;
        if (!z10) {
            i10 = R.string.ChannelAddToNews;
        } else if (this.e.in_news) {
            i10 = R.string.ChannelAddedToNews;
        } else {
            i10 = R.string.ChannelAddedToChats;
        }
        if (!z10) {
            i11 = R.drawable.news_plus;
        } else if (getMessagesController().isDialogMuted(this.f44249f6, 0L)) {
            i11 = R.drawable.news_muted;
        } else {
            i11 = R.drawable.news_unmuted;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (!z10 || !this.e.in_news) {
            spannableStringBuilder.append((CharSequence) "￼ ");
            org.telegram.ui.Components.zq zqVar = new org.telegram.ui.Components.zq(i11, 2);
            if (z10) {
                f7 = 20.0f;
            } else {
                f7 = 24.0f;
            }
            zqVar.setSize(AndroidUtilities.dp(f7));
            spannableStringBuilder.setSpan(zqVar, 0, 1, 33);
        }
        spannableStringBuilder.append((CharSequence) LocaleController.getString(i10));
        if (z10) {
            spannableStringBuilder.append((CharSequence) " ￼");
            org.telegram.ui.Components.zq zqVar2 = new org.telegram.ui.Components.zq(R.drawable.news_menu_arrow, 2);
            zqVar2.setSize(AndroidUtilities.dp(18.0f));
            spannableStringBuilder.setSpan(zqVar2, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        return spannableStringBuilder;
    }

    public final void M7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        jg jgVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.f44285i6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f44242f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f44322l8;
        long j10 = this.X6;
        int b10 = (int) b();
        int i10 = this.f44221d4;
        jg jgVar2 = new jg(this, 10);
        if (z10) {
            jgVar = new jg(this, 11);
        } else {
            jgVar = null;
        }
        jg jgVar3 = jgVar;
        org.telegram.ui.Components.g5.y(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.f44285i6, groupedMessages, b10, i10, null, jgVar2, jgVar3, this.f44385qa);
    }

    public final boolean M9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f44203c && !this.d && this.f44242f == null && this.f44468x0 != null && SharedConfig.animationsEnabled()) {
            if (this.Eb == null) {
                this.Eb = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.Eb.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f44468x0.getChildCount(); i12++) {
                    i11 += this.f44468x0.getChildAt(i12).getHeight();
                    int top = this.f44468x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.E9) {
                    S6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.O6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.G6;
                if ((!z12 || ((this.X6 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.S6 && f10 > this.E9 && (!arrayList.isEmpty() ? i11 != 0 : this.Db)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f44205c1) == null || frameLayout.getVisibility() != 0 || this.f44205c1.getChildCount() <= 0) {
                    if (!z10 && this.Z6 == 0) {
                        S6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.f44227da && this.fragmentBeginToShow) {
                        if (z10 && this.Z6 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable l4 = this.f44385qa.l();
                        mm mmVar = this.f44292j1;
                        if (mmVar != null) {
                            l4 = mmVar.getBackgroundImage();
                        }
                        if (l4 instanceof org.telegram.ui.Components.uc0) {
                            org.telegram.ui.Components.uc0 uc0Var = (org.telegram.ui.Components.uc0) l4;
                            if (uc0Var.N != z11) {
                                if (!z11) {
                                    uc0Var.c();
                                }
                                float f11 = 1.0f;
                                if (!z11 && uc0Var.N) {
                                    uc0Var.h = 1.0f - ((uc0Var.h - (((int) (f7 / 0.125f)) * 0.125f)) / 0.125f);
                                    uc0Var.d = true;
                                }
                                uc0Var.N = z11;
                                if (z11) {
                                    f11 = 1.5f;
                                }
                                uc0Var.M = f11;
                                uc0Var.y();
                            } else if (z11) {
                                uc0Var.y();
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

    public final void Ma(MessageObject messageObject, int i10) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f22048id = 0;
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
        messageObject2.stableId = d9(messageObject.dateKeyInt);
        this.A0.P.add(i10, messageObject2);
    }

    public final void Mb(ArrayList arrayList) {
        Kb(true, null, arrayList, null, true, 0, null, false, 0L, true);
    }

    public final void Mc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f44419t4 && !this.V4.isEmpty() && this.T4.size() == 1 && ((Integer) this.T4.get(0)).intValue() == b() + 1) {
            messageObject = (MessageObject) this.V4.get(this.T4.get(0));
        } else {
            messageObject = null;
        }
        this.f44307k4 = messageObject;
        if (this.f44419t4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f44357o4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.e, this.f44307k4.messageOwner.from_id)) {
            this.f44307k4 = null;
        }
    }

    public final void N6(boolean z10) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.f44221d4 != 0 || this.f44370p4 != 0 || (chatFull = this.f44322l8) == null || chatFull.ttl_period == 0)) || ((user = this.f44242f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f44334m8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f44204c0;
            if (u0Var != null) {
                u0Var.e(8);
            }
            ij ijVar = this.f44327m1;
            if (ijVar != null) {
                ijVar.f31637a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f44204c0;
            if (u0Var2 != null) {
                u0Var2.e(0);
            }
            ij ijVar2 = this.f44327m1;
            if (ijVar2 != null) {
                ijVar2.f31637a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f44402s0;
        if (u0Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u0Var3.e(i11);
        }
        ij ijVar3 = this.f44327m1;
        if (ijVar3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f44242f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ijVar3.setCommunityItemVisible(z11);
            final ij ijVar4 = this.f44327m1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = ijVar4.E;
            ImageView imageView2 = ijVar4.f31669y;
            if (imageView2 != null && imageView != null) {
                ijVar4.f31652l0 = z12;
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
                                    po poVar = ijVar4;
                                    if (!z14) {
                                        poVar.f31669y.setVisibility(4);
                                        return;
                                    } else {
                                        poVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    po poVar2 = ijVar4;
                                    if (!z15) {
                                        poVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        poVar2.getClass();
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
                                    po poVar = ijVar4;
                                    if (!z14) {
                                        poVar.f31669y.setVisibility(4);
                                        return;
                                    } else {
                                        poVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    po poVar2 = ijVar4;
                                    if (!z15) {
                                        poVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        poVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f44327m1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f44334m8;
                if (userFull2 != null) {
                    this.f44327m1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f44322l8;
                    if (chatFull3 != null) {
                        this.f44327m1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f44389r0 != null && (chatFull2 = this.f44322l8) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f44389r0;
            if (z13) {
                i12 = 0;
            }
            u0Var4.e(i12);
        }
        p();
    }

    public final void N7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f44205c1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f44205c1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f44205c1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.f44292j1.addView(this.f44205c1, 3, org.telegram.ui.Components.gb1.i(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f44205c1.setTranslationX(b9() / 2.0f);
            int i10 = 1;
            if (this.A0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f44342n2 = textView;
                textView.setText(LocaleController.getString(R.string.NoFilteredMessages));
                this.f44342n2.setTextSize(1, 14.0f);
                this.f44342n2.setGravity(17);
                org.telegram.ui.ActionBar.f7.V(this.f44342n2, org.telegram.ui.ActionBar.y6.f23451ic, getResourceProvider());
                this.f44342n2.setBackground(new org.telegram.ui.ActionBar.l6(this.f44342n2, this.f44292j1, AndroidUtilities.dp(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f44342n2.setTypeface(AndroidUtilities.bold());
                this.f44342n2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(3.0f));
                this.f44205c1.addView(this.f44342n2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (I9()) {
                jg.d2 d2Var = new jg.d2(getParentActivity(), this.f44221d4, this.f44370p4, this.f44208c4, getResourceProvider());
                this.f44256g1 = d2Var;
                int dp = AndroidUtilities.dp(24.0f);
                jg.d2 d2Var2 = this.f44256g1;
                mm mmVar = this.f44292j1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.y6.f23290a;
                d2Var.setBackground(new org.telegram.ui.ActionBar.l6(d2Var2, mmVar, dp, themedPaint));
                this.f44205c1.addView(this.f44256g1, org.telegram.ui.Components.gb1.i(-2, -2, 17));
                this.f44280i1.d(this.f44256g1, this.f44292j1, new m4.x0(29), false);
            } else if (this.f44221d4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f44194b4;
                org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.y6.f23451ic;
                org.telegram.ui.ActionBar.y6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.y6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.filled_chatlink_large);
                linearLayout.addView(imageView, org.telegram.ui.Components.gb1.x(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.f7.V(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(AndroidUtilities.dp(208.0f));
                org.telegram.messenger.t.n(R.string.BusinessLinksIntro, textView2);
                linearLayout.addView(textView2, org.telegram.ui.Components.gb1.x(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.f7.V(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(AndroidUtilities.dp(208.0f));
                String str = tL_businessChatLink.link;
                jg.z[] zVarArr = jg.z.e;
                if (str.startsWith("https://")) {
                    str = str.substring(8);
                }
                textView3.setText(str);
                textView3.setBackground(org.telegram.ui.ActionBar.y6.a0(503316480, 503316480, 5, 5));
                textView3.setPadding(AndroidUtilities.dp(7.0f), 0, AndroidUtilities.dp(7.0f), 0);
                textView3.setOnClickListener(new bi.q(20, tL_businessChatLink, this));
                linearLayout.addView(textView3, org.telegram.ui.Components.gb1.x(-2, -2, 49, 17, 0, 17, 17));
                this.f44267h1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.l6(this.f44267h1, this.f44292j1, AndroidUtilities.dp(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f44205c1.addView(this.f44267h1, org.telegram.ui.Components.gb1.i(-2, -2, 17));
            } else if ((this.N9 != null && this.f44242f != null && !this.f44339n) || (this.f44334m8 != null && a() != getUserConfig().getClientUserId() && ((this.f44334m8.contact_require_premium && !getUserConfig().isPremium()) || this.f44334m8.send_paid_messages_stars > bi.ca.y(this.currentAccount, false).p().amount))) {
                this.f44231e1 = new ki(this, getParentActivity(), this.currentAccount, this.N9, this.f44385qa);
                Ac();
                this.f44231e1.setListener(new pe(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f44218d1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f44218d1.setGravity(17);
                this.f44218d1.addView(this.f44231e1, org.telegram.ui.Components.gb1.i(-2, -2, 17));
                this.f44205c1.addView(this.f44218d1, org.telegram.ui.Components.gb1.i(-1, -2, 17));
                TLRPC.UserFull userFull = this.f44334m8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f44231e1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f44231e1.setSticker(this.f44334m8.business_intro.sticker);
                }
                zc();
            } else if (this.h == null) {
                String str2 = null;
                Paint paint = null;
                str2 = null;
                if (this.f44419t4 && this.f44221d4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    mm mmVar2 = this.f44292j1;
                    sn snVar = this.f44385qa;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int dp2 = AndroidUtilities.dp(18.0f);
                    if (snVar != null) {
                        paint = snVar.d("paintChatActionBackground");
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.y6.U0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.y6.f23290a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.l6(linearLayout3, mmVar2, dp2, paint));
                    linearLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity2);
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.vh.j(15.0f, 1, textView4);
                    int i14 = org.telegram.ui.ActionBar.y6.f23451ic;
                    org.telegram.ui.ActionBar.f7.V(textView4, i14, snVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(AndroidUtilities.dp(210.0f));
                    textView4.setText(LocaleController.getString(R.string.AlmostDone));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.f7.V(textView5, i14, snVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(AndroidUtilities.dp(160.0f));
                    textView5.setText(LocaleController.getString(R.string.TopicEmptyViewDescription));
                    linearLayout3.addView(y9Var, org.telegram.ui.Components.gb1.x(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, org.telegram.ui.Components.gb1.x(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, org.telegram.ui.Components.gb1.u(-2, -2, 1));
                    TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker("🥳");
                    if (emojiAnimatedSticker != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(emojiAnimatedSticker.thumbs, org.telegram.ui.ActionBar.y6.f23336c7, 0.2f);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        y9Var.i(ImageLocation.getForDocument(emojiAnimatedSticker), null, "tgs", svgThumb, null);
                    }
                    this.f44205c1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!O9() && this.f44221d4 == 0 && (((user2 = this.f44242f) != null && user2.self) || ((chat = this.e) != null && chat.creator && !ChatObject.isChannelAndNotMegaGroup(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    mm mmVar3 = this.f44292j1;
                    if (this.e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.qo qoVar = new org.telegram.ui.Components.qo(parentActivity3, mmVar3, i10, this.f44385qa);
                    this.f44304k1 = qoVar;
                    this.f44205c1.addView(qoVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.e != null) {
                        this.f44304k1.setStatusText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupEmptyTitle1)));
                    }
                } else {
                    if (O9() && this.f44221d4 == 0) {
                        str2 = this.f44406s4 ? LocaleController.getString(R.string.NoComments) : LocaleController.getString(R.string.NoReplies);
                    } else if (this.f44221d4 == 1) {
                        str2 = LocaleController.getString(R.string.NoScheduledMessages);
                    } else {
                        TLRPC.User user3 = this.f44242f;
                        if (user3 != null) {
                            long j10 = user3.f22174id;
                            if (j10 != 777000 && j10 != 429000 && j10 != 4244000 && MessagesController.isSupportUser(user3)) {
                                str2 = LocaleController.getString(R.string.GotAQuestion);
                            }
                        }
                        if (this.f44221d4 != 8 && ((user = this.f44242f) == null || user.self || user.deleted || this.f44339n)) {
                            str2 = LocaleController.getString(R.string.NoMessages);
                        }
                    }
                    if (str2 == null) {
                        this.f44231e1 = new li(this, getParentActivity(), this.currentAccount, this.N9, this.f44385qa);
                        Ac();
                        this.f44231e1.setListener(new pe(this, 5));
                        TLRPC.UserFull userFull2 = this.f44334m8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f44231e1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f44231e1.setSticker(this.f44334m8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f44218d1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f44218d1.setGravity(17);
                        this.f44218d1.addView(this.f44231e1, org.telegram.ui.Components.gb1.i(-2, -2, 17));
                        this.f44205c1.addView(this.f44218d1, org.telegram.ui.Components.gb1.i(-1, -2, 17));
                        zc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f44342n2 = textView6;
                    textView6.setText(str2);
                    this.f44342n2.setTextSize(1, 14.0f);
                    this.f44342n2.setGravity(17);
                    org.telegram.ui.ActionBar.f7.V(this.f44342n2, org.telegram.ui.ActionBar.y6.f23451ic, getResourceProvider());
                    this.f44342n2.setBackground(new org.telegram.ui.ActionBar.l6(this.f44342n2, this.f44292j1, AndroidUtilities.dp(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f44342n2.setTypeface(AndroidUtilities.bold());
                    this.f44342n2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(3.0f));
                    this.f44205c1.addView(this.f44342n2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.f44304k1 = new org.telegram.ui.Components.qo(getParentActivity(), this.f44292j1, 0, this.f44385qa);
                if (this.h.admin_id == getUserConfig().getClientUserId()) {
                    this.f44304k1.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleOutgoing, UserObject.getFirstName(this.f44242f)));
                } else {
                    this.f44304k1.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleIncoming, UserObject.getFirstName(this.f44242f)));
                }
                this.f44205c1.addView(this.f44304k1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final int N8(MessageObject messageObject) {
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f22047id)) {
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

    public final boolean N9() {
        if (getUserConfig().getClientUserId() == a() && !getMessagesController().getSavedMessagesController().unsupported && getUserConfig().isPremium()) {
            return true;
        }
        return false;
    }

    public final void Na() {
        int i10;
        this.T4.clear();
        this.V4.clear();
        this.X4 = 0;
        this.f44195b5 = 0;
        this.f44209c5 = 0;
        Lc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.f44322l8;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.f44222d5 = true;
        Mc();
    }

    public final void Nb(MessageObject messageObject) {
        Kb(true, messageObject, null, null, true, 0, null, false, 0L, true);
    }

    public final void Nc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f44482y1 > 0 && ((i10 = this.f44221d4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44442v1.e(4, z11, z10);
        this.f44442v1.c(4, this.f44482y1, z10);
    }

    public final void O6() {
        if (this.f44201bb) {
            return;
        }
        if (J9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final boolean O9() {
        if (this.f44295j4 != null) {
            return true;
        }
        return false;
    }

    public final void Oa(MessageObject messageObject) {
        if (messageObject == this.f44290ic) {
            this.f44290ic = null;
            dd(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.f44249f6);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Ob(MessageObject messageObject, kn knVar) {
        Kb(true, messageObject, null, null, true, 0, knVar, false, 0L, true);
    }

    public final void Oc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f44469x1 > 0 && ((i10 = this.f44221d4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f44442v1.e(3, z11, z10);
        this.f44442v1.c(3, this.f44469x1, z10);
    }

    public final void P6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.P6():void");
    }

    public final boolean P7(android.view.View r94, boolean r95, boolean r96, float r97, float r98, boolean r99, boolean r100, boolean r101) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.P7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final int P8() {
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        int i10 = 0;
        if (j5Var == null || j5Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(i10);
                if (r2Var != this && (r2Var instanceof un) && ((un) r2Var).f44249f6 == this.f44249f6) {
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

    public final void P9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.G6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
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
            } else if (!DialogObject.isEncryptedDialog(this.f44249f6)) {
                int N0 = this.f44493z0.N0();
                int L0 = this.f44493z0.L0();
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
                this.f44288i9.e(i11);
                org.telegram.ui.ActionBar.e2 e2Var = this.Lb;
                if (e2Var != null) {
                    e2Var.dismiss();
                }
                Kc(false);
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, this.f44385qa);
                this.Lb = e2Var2;
                e2Var2.setOnCancelListener(this.f44490ya);
                this.Lb.r(1000L);
                int i15 = this.f44272h6;
                this.f44312k9 = i15;
                this.f44335m9 = false;
                this.f44421t6.add(Integer.valueOf(i15));
                this.f44323l9 = 0;
                this.f44349n9 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.f44249f6;
                long j11 = this.X6;
                int i16 = this.classGuid;
                int i17 = this.f44221d4;
                long j12 = this.f44370p4;
                int i18 = this.f44484y4;
                int i19 = this.f44272h6;
                this.f44272h6 = i19 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j12, i18, i19, this.f44419t4);
                this.f44294j3.setAlpha(0.0f);
                this.f44294j3.setTag(null);
                this.f44431u3 = 0.0f;
                yc();
                this.f44306k3.setTag(null);
            }
        }
    }

    public final void Pa(MessageObject messageObject) {
        ArrayList arrayList = this.G6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fm fmVar = this.A0;
            if (fmVar != null && !fmVar.N) {
                fmVar.u(fmVar.J + indexOf);
            }
        }
    }

    public final void Pb(MessageSuggestionParams messageSuggestionParams) {
        Lb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Pc(boolean z10) {
        String string;
        if (this.f44221d4 != 3 && !UserObject.isBotForum(this.f44242f)) {
            ij ijVar = this.f44327m1;
            if (ijVar != null && this.f44370p4 != 0) {
                if (this.f44419t4) {
                    fd();
                } else if (this.f44406s4) {
                    MessageObject messageObject = this.f44295j4;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f44327m1.setTitle(LocaleController.formatPluralString("Comments", this.f44295j4.getRepliesCount(), new Object[0]));
                    } else {
                        this.f44327m1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.f44295j4;
                    if (messageObject2 != null) {
                        ijVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f44344n4 != null) {
                if (this.f44295j4.getRepliesCount() == 0) {
                    if (this.f44406s4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f44344n4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final void Q6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.Tc.e) * (1.0f - this.Rc.e) * ((float[]) this.Yc.f16424b)[i10];
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

    public final int Q8() {
        return Math.max(this.f44195b5, this.f44209c5);
    }

    public final void Q9(ArrayList arrayList) {
        org.telegram.ui.Components.e41 e41Var;
        if (arrayList != null && (e41Var = this.f44219d2) != null && e41Var.Q) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && messageObject.type == 36) {
                    TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
                    ConcurrentHashMap concurrentHashMap = org.telegram.ui.Components.fb1.f28143a;
                    if (media instanceof TLRPC.TL_messageMediaWidget) {
                        messageObject.updateSideMenuEnabled(true);
                    }
                }
            }
        }
    }

    public final void Qa(MessageObject messageObject) {
        ArrayList arrayList = this.G6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fm fmVar = this.A0;
            if (fmVar != null && !fmVar.N) {
                fmVar.P(fmVar.J + indexOf, true);
            }
        }
    }

    public final void Qb(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        Kb(z10, null, null, webPage, true, 0, null, z11, 0L, true);
    }

    public final void Qc(MessageObject messageObject, int i10) {
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

    public final boolean R6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.f44322l8);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            tg.j0.G1(this, this.P1, this.Q1, this.f44249f6, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void R7() {
        if (this.h == null && this.J2 == null && getParentActivity() != null) {
            el elVar = new el(this, getParentActivity());
            this.J2 = elVar;
            elVar.setTag(1);
            this.Y0.addView(this.J2, org.telegram.ui.Components.gb1.r(-1, 48));
            this.Y0.h(1, this.J2);
            this.Y0.g(this.J2);
            this.J2.setOnClickListener(new xe(this, 17));
            this.J2.setEnabled(!isInPreviewMode());
            this.J2.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            org.telegram.ui.Components.tg0 tg0Var = new org.telegram.ui.Components.tg0(getParentActivity(), this.f44385qa);
            this.L2 = tg0Var;
            this.J2.addView(tg0Var, org.telegram.ui.Components.gb1.h(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.J2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.R2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.R2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23398fe));
            this.R2.setTypeface(AndroidUtilities.bold());
            this.J2.addView(this.R2, org.telegram.ui.Components.gb1.h(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i10 = 0; i10 < 2; i10++) {
                tn tnVar = new tn(this, getParentActivity());
                tn[] tnVarArr = this.O2;
                tnVarArr[i10] = tnVar;
                tnVar.setTextSize(14);
                org.telegram.ui.ActionBar.f7.Y(tnVarArr[i10], org.telegram.ui.ActionBar.y6.f23398fe, getResourceProvider());
                tnVarArr[i10].setTypeface(AndroidUtilities.bold());
                this.J2.addView(tnVarArr[i10], org.telegram.ui.Components.gb1.h(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                fl flVar = new fl(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.b6[] b6VarArr = this.P2;
                b6VarArr[i10] = flVar;
                flVar.setTextSize(14);
                org.telegram.ui.ActionBar.f7.Y(b6VarArr[i10], org.telegram.ui.ActionBar.y6.f23416ge, getResourceProvider());
                this.J2.addView(b6VarArr[i10], org.telegram.ui.Components.gb1.h(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                jn jnVar = new jn(this, getParentActivity());
                jn[] jnVarArr = this.Q2;
                jnVarArr[i10] = jnVar;
                this.J2.addView(jnVar, org.telegram.ui.Components.gb1.h(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                gl glVar = new gl(getParentActivity());
                glVar.I = new xh.g();
                glVar.H = new Path();
                glVar.J = new float[8];
                org.telegram.ui.Components.y9[] y9VarArr = this.N2;
                y9VarArr[i10] = glVar;
                glVar.setBlurAllowed(true);
                y9VarArr[i10].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.J2.addView(y9VarArr[i10], org.telegram.ui.Components.gb1.h(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i10 == 1) {
                    tnVarArr[i10].setVisibility(4);
                    jnVarArr[i10].setVisibility(4);
                    b6VarArr[i10].setVisibility(4);
                    y9VarArr[i10].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.X2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.X2;
            int i11 = org.telegram.ui.ActionBar.y6.f23362de;
            org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.f7.t(imageView2, i11, resourceProvider, mode);
            ImageView imageView3 = this.X2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.X2.setContentDescription(LocaleController.getString(R.string.AccPinnedMessagesList));
            this.X2.setVisibility(4);
            this.X2.setAlpha(0.0f);
            this.X2.setScaleX(0.4f);
            this.X2.setScaleY(0.4f);
            ImageView imageView4 = this.X2;
            int i12 = org.telegram.ui.ActionBar.y6.f23730x7;
            org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.f7.h(i12, 25), getResourceProvider());
            this.J2.addView(this.X2, org.telegram.ui.Components.gb1.h(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.X2.setOnClickListener(new xe(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.V2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            org.telegram.ui.ActionBar.f7.t(this.V2, i11, getResourceProvider(), mode);
            this.V2.setScaleType(scaleType);
            this.V2.setVisibility(8);
            this.V2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f44385qa);
            this.W2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.W2.setSize(AndroidUtilities.dp(16.0f));
            this.W2.setStrokeWidth(2.0f);
            this.W2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23379ee));
            this.J2.addView(this.W2, org.telegram.ui.Components.gb1.h(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.f7.R(this.V2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12) & 436207615, 1, AndroidUtilities.dp(14.0f)), null, org.telegram.ui.ActionBar.f7.h(i12, 25), getResourceProvider());
            this.J2.addView(this.V2, org.telegram.ui.Components.gb1.h(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.V2.setOnClickListener(new xe(this, 19));
            Kc(false);
        }
    }

    public final int R8() {
        if (this.f44221d4 == 5) {
            return (int) this.f44370p4;
        }
        return 0;
    }

    public final void R9() {
        this.P4 = true;
        if (this.f44486y6) {
            getMessagesStorage().getUnreadMention(this.f44249f6, b(), new tg(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.f44249f6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f44419t4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f44370p4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.f44474x6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new z7(6, this, messagesStorage));
    }

    public final void Ra() {
        if (this.f44198b8 == null && this.f44212c8 == null && this.f44225d8 == null) {
            le leVar = this.f44262g8;
            if (leVar != null) {
                AndroidUtilities.cancelRunOnUIThread(leVar);
                this.f44262g8 = null;
            }
            this.X7 = Integer.MAX_VALUE;
            this.Z7 = false;
            this.f44184a8 = 0L;
            this.f44198b8 = null;
            this.f44212c8 = null;
            this.f44225d8 = null;
        }
    }

    public final void Rb(boolean z10) {
        if (this.f44294j3 != null && !I9()) {
            if (this.f44294j3.getTag() == null) {
                AnimatorSet animatorSet = this.f44405s3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f44294j3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f44405s3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f44405s3.playTogether(ObjectAnimator.ofFloat(this.f44294j3, View.ALPHA, 1.0f));
                this.f44405s3.addListener(new pi(this, 5));
                this.f44405s3.start();
            }
            if (!z10) {
                z9();
                this.f44329m3 = 1000;
            }
        }
    }

    public final void Rc(boolean z10) {
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.L1(z10);
        }
    }

    public final void S6(boolean z10) {
        if (this.Z6 == 0) {
            if (z10 && !this.f44183a7.isEmpty()) {
                this.Z6 = System.currentTimeMillis();
            } else {
                this.Z6 = 1L;
            }
            M9();
            oj ojVar = this.f44468x0;
            if (ojVar != null) {
                ojVar.invalidate();
            }
        }
    }

    public final void S7() {
        int i10;
        int i11;
        if (this.f44220d3 == null && getParentActivity() != null) {
            kk kkVar = new kk(this, getParentActivity(), 1);
            this.f44220d3 = kkVar;
            kkVar.setClickable(false);
            this.f44220d3.setWillNotDraw(false);
            this.Yc.h(4, false, false);
            this.f44220d3.setClipToPadding(false);
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getParentActivity(), true, true, true);
            this.f44258g3 = s6Var;
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
            s6Var.b(0.25f, 280L, dsVar);
            this.f44258g3.setTextSize(AndroidUtilities.dp(15.0f));
            this.f44258g3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(this.f44258g3, org.telegram.ui.ActionBar.y6.f23754ye, getResourceProvider());
            this.f44258g3.setGravity(3);
            this.f44220d3.addView(this.f44258g3, org.telegram.ui.Components.gb1.h(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.U.addView(this.f44220d3, org.telegram.ui.Components.gb1.h(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(getParentActivity(), true, false, true);
            this.f44269h3 = s6Var2;
            s6Var2.b(0.0f, 420L, dsVar);
            this.f44269h3.setScaleProperty(0.7f);
            this.f44269h3.setTextSize(AndroidUtilities.dp(15.0f));
            this.f44269h3.setGravity(5);
            this.f44269h3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(this.f44269h3, org.telegram.ui.ActionBar.y6.f23558o6, getResourceProvider());
            org.telegram.ui.Components.s6 s6Var3 = this.f44269h3;
            if (this.Vc.f19327f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            s6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.s6 s6Var4 = this.f44269h3;
            s6Var4.f32442n = false;
            s6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.f44269h3.setOnClickListener(new xe(this, 2));
            this.f44269h3.setAlpha(0.5f);
            this.f44269h3.setClickable(false);
            this.f44220d3.addView(this.f44269h3, org.telegram.ui.Components.gb1.i(-2, -1, 117));
            org.telegram.ui.Components.s6 s6Var5 = new org.telegram.ui.Components.s6(getParentActivity(), true, true, true);
            this.f44282i3 = s6Var5;
            s6Var5.setGravity(17);
            this.f44282i3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(this.f44282i3, org.telegram.ui.ActionBar.y6.Ae, getResourceProvider());
            this.f44282i3.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.s6 s6Var6 = this.f44282i3;
            int i12 = org.telegram.ui.ActionBar.y6.f23354d6;
            int themedColor = getThemedColor(i12);
            int themedColor2 = getThemedColor(i12);
            int i13 = org.telegram.ui.ActionBar.y6.f23446i6;
            org.telegram.ui.ActionBar.f7.R(s6Var6, org.telegram.ui.ActionBar.y6.h0(themedColor, org.telegram.ui.ActionBar.y6.v(themedColor2, getThemedColor(i13))), org.telegram.ui.ActionBar.f7.N(i12), org.telegram.ui.ActionBar.f7.q(i12, i13), getResourceProvider());
            org.telegram.ui.Components.s6 s6Var7 = this.f44282i3;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            s6Var7.setText(LocaleController.getString(i11));
            this.f44282i3.setOnClickListener(new xe(this, 3));
            this.f44282i3.setVisibility(8);
            this.f44282i3.setAlpha(0.0f);
            this.f44220d3.addView(this.f44282i3, org.telegram.ui.Components.gb1.i(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.e.megagroup) && this.f44221d4 != 7 && !ChatObject.isMonoForum(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f44246f3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f44246f3.setImageResource(R.drawable.msg_usersearch);
                org.telegram.ui.ActionBar.f7.t(this.f44246f3, org.telegram.ui.ActionBar.y6.f23736xe, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f44246f3;
                int i14 = org.telegram.ui.ActionBar.y6.f23767z8;
                org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i14), getResourceProvider());
                this.f44220d3.addView(this.f44246f3, org.telegram.ui.Components.gb1.h(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f44246f3.setOnClickListener(new xe(this, 4));
                this.f44246f3.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.f44221d4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f44233e3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f44233e3.setImageResource(R.drawable.msg_calendar);
                org.telegram.ui.ActionBar.f7.t(this.f44233e3, org.telegram.ui.ActionBar.y6.f23736xe, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f44233e3;
                int i15 = org.telegram.ui.ActionBar.y6.f23767z8;
                org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i15), getResourceProvider());
                this.f44220d3.addView(this.f44233e3, org.telegram.ui.Components.gb1.h(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f44233e3.setOnClickListener(new xe(this, 5));
                this.f44233e3.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final long S8() {
        if (this.f44221d4 == 3) {
            return this.f44370p4;
        }
        return 0L;
    }

    public final void S9(boolean z10) {
        TLRPC.Chat chat;
        if (this.f44425ta == null && (chat = this.e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.f44249f6);
            this.f44425ta = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.N1(false, z10);
            }
        }
    }

    public final void Sa(boolean z10) {
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
            Pa(messageObject);
            this.V7 = null;
        }
    }

    public final void Sb(boolean z10) {
        if (this.f44306k3 != null && !I9()) {
            if (this.f44306k3.getTag() == null) {
                ValueAnimator valueAnimator = this.f44418t3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f44306k3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44431u3, 1.0f);
                this.f44418t3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f44418t3.addUpdateListener(new ne(this, 2));
                this.f44418t3.addListener(new pi(this, 7));
                this.f44418t3.start();
            }
            if (!z10) {
                z9();
                this.f44329m3 = 1000;
            }
        }
    }

    public final void Sc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        lh.h hVar = this.f44442v1;
        boolean z12 = false;
        if (hVar != null) {
            int i14 = 2;
            if (this.f44215cb) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f1281c = z10;
            k6.c cVar = hVar.e[6];
            if (cVar != null) {
                ((kh.b) cVar.f16406b).b(z10, true);
            }
            lh.h hVar2 = this.f44442v1;
            if (this.f44215cb) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f1281c = z11;
            k6.c cVar2 = hVar2.e[5];
            if (cVar2 != null) {
                ((kh.b) cVar2.f16406b).b(z11, true);
            }
        }
        this.I3 = i12;
        this.J3 = i11;
        Tc();
        org.telegram.ui.Components.s6 s6Var = this.f44269h3;
        if (s6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            s6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f44269h3.animate();
            if (i12 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
        }
    }

    public final void T6(CharSequence charSequence) {
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
        MessagePreviewParams messagePreviewParams = this.f44394r5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.S5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.S5 = null;
                hk hkVar = this.Y;
                if (hkVar != null) {
                    hkVar.X2 = null;
                    hkVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f44394r5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = hkVar.getFieldText();
                    MessageObject messageObject3 = this.f44498z5;
                    if (messageObject3 == this.f44295j4) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.f44473x5, this.B5);
                }
                p8();
                q8();
            }
        }
    }

    public final void T7() {
        if (this.f44368p2 == null && this.F1 == null) {
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(getParentActivity(), this.f44385qa);
            this.f44355o2 = c10Var;
            c10Var.setViewType(7);
            org.telegram.ui.Components.ey0 ey0Var = new org.telegram.ui.Components.ey0(getParentActivity(), this.f44355o2, 1, null);
            this.f44368p2 = ey0Var;
            ey0Var.setClickable(true);
            this.f44368p2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f44368p2.setVisibility(8);
            this.f44368p2.addView(this.f44355o2, 0);
            this.f44368p2.e(true, false);
            this.W3.addView(this.f44368p2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.o40 o40Var = new org.telegram.ui.Components.o40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.F1 = o40Var;
            o40Var.setOnHashtagClickListener(new ye(this, 4));
            this.F1.setOnScrollListener(new i3(this, 6));
            this.F1.setVisibility(8);
            this.W3.addView(this.F1, -1, -1);
            y7();
            w7();
        }
    }

    public final int T8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f44468x0.getMeasuredHeight() - this.Na) - this.E9) - this.v.e()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void T9(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Ta(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f44242f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f44242f.f22174id, (int) b(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                cb();
                this.f44338mc.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.f44326lc.bind(messageObject2.messageOwner.f22048id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f22048id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.V4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.V4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.X4) {
                    Lc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.B6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.f44221d4 == 1))) {
                if (z10) {
                    arrayList5.remove(i16);
                    i16--;
                }
                z6(messageObject, messageObject2);
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
                                groupedMessages2.reversed = this.f44215cb;
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
                    if (this.f44221d4 == 3) {
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
                        a0.h hVar3 = this.F6;
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
                                this.E6.remove(messageObject2.dateKeyInt);
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
                                        Qc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Qc(messageObject, messageObject2.getId());
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
                    int indexOf3 = arrayList2.indexOf((MessageObject) ic.a.g(1, groupedMessages3.messages));
                    if (indexOf3 >= 0 && (fmVar = this.A0) != null) {
                        fmVar.q(indexOf3 + fmVar.J, groupedMessages3.messages.size());
                        qj qjVar = this.f44481y0;
                        if (qjVar != null) {
                            qjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        Mc();
    }

    public final boolean Tb() {
        hk hkVar = this.Y;
        if (hkVar != null && hkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f44379q2 == null) {
                    if (!this.f44345n5) {
                        hk hkVar2 = this.Y;
                        if (hkVar2 != null) {
                            hkVar2.R();
                            MediaDataController.getInstance(hkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar = hkVar2.U0;
                            dgVar.L(false, false);
                            dgVar.Q(false, false);
                            dgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        mm mmVar = this.f44292j1;
                        int indexOfChild = mmVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            hk hkVar3 = this.Y;
                            hkVar3.R();
                            MediaDataController.getInstance(hkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar2 = hkVar3.U0;
                            dgVar2.L(false, false);
                            dgVar2.Q(false, false);
                            dgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.I2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            mmVar.addView(this.I2, i10, org.telegram.ui.Components.gb1.h(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(9, getParentActivity(), this.f44385qa, false);
                            this.f44379q2 = t40Var;
                            t40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            mmVar.addView(this.f44379q2, i10, org.telegram.ui.Components.gb1.h(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.t40 t40Var2 = this.f44379q2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(t40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.I2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new pi(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f44379q2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Tc() {
        org.telegram.ui.Components.s6 s6Var = this.f44258g3;
        if (s6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.I3;
            if (i10 < 0) {
                s6Var.c("", z10, true);
            } else if (i10 == 0) {
                s6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.D3) {
                s6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.f44221d4 != 7 && !this.Vc.f19327f) {
                s6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.J3 + 1), Integer.valueOf(this.I3)), z10, true);
            } else {
                s6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void U6() {
        MessageObject editingMessageObject;
        int abs;
        hk hkVar = this.Y;
        if (hkVar != null && (editingMessageObject = hkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f44242f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.b6 b6Var = ((org.telegram.ui.Components.cp[]) this.f44177a0.f4113b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        b6Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new jg(this, 18), 1000L);
                    return;
                }
                org.telegram.ui.Components.xe xeVar = this.Y.F1;
                if (xeVar != null) {
                    xeVar.setVisibility(8);
                }
                b6Var.l(LocaleController.formatString("TimeToEditExpired", R.string.TimeToEditExpired, new Object[0]), false);
            }
        }
    }

    public final TextureView U7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.K8);
        if (this.F8 == null) {
            kk kkVar = new kk(this, getParentActivity(), 2);
            this.F8 = kkVar;
            kkVar.setOutlineProvider(new il(this));
            this.F8.setClipToOutline(true);
            this.F8.setWillNotDraw(false);
            m4 m4Var = new m4(getParentActivity());
            this.H8 = m4Var;
            m4Var.setBackgroundColor(0);
            if (z10) {
                this.F8.addView(this.H8, org.telegram.ui.Components.gb1.i(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.I8 = textureView;
            textureView.setOpaque(false);
            this.H8.addView(this.I8, org.telegram.ui.Components.gb1.g(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.F8.getParent();
        if (viewGroup != null && viewGroup != this.f44292j1) {
            viewGroup.removeView(this.F8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.f44292j1.addView(this.F8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(L9()), AndroidUtilities.roundPlayingMessageSize(L9())));
        }
        this.F8.setTag(null);
        this.H8.setDrawingReady(false);
        return this.I8;
    }

    public final int U8(MessageObject messageObject) {
        return T8(J8(messageObject, !TextUtils.isEmpty(this.f44198b8))) - db(messageObject);
    }

    public final ri U9(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle) {
        qf.c cVar = this.Wb;
        if (cVar != null) {
            cVar.a(true);
            this.Wb = null;
        }
        if (characterStyle != null && s1Var != null && s1Var.getMessageObject() != null) {
            ri riVar = new ri(this, s1Var.getMessageObject().getId(), characterStyle, s1Var, 0);
            this.Wb = riVar;
            return riVar;
        }
        this.Wb = null;
        return null;
    }

    public final void Ua() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.G7 = 0;
        this.f44461w7 = false;
        this.f44475x7 = true;
        this.f44421t6.clear();
    }

    public final void Ub() {
        TLRPC.ChatFull chatFull = this.f44322l8;
        if (chatFull != null && !this.C5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new le(this, 15), 1000L);
            }
        }
    }

    public final void Uc() {
        T7();
        String str = this.G3;
        if (str != null) {
            this.f44368p2.e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.X3.setEmptyView(this.f44368p2);
            return;
        }
        this.X3.setEmptyView(null);
        this.f44368p2.setVisibility(8);
    }

    public final void V6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.f44287i8;
        if (call != null && (((str = this.f44410s8) != null || this.f44423t8) && this.Z5)) {
            org.telegram.ui.Components.voip.g2.l(this.e, str, this.f44311k8, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f44410s8 = null;
            this.f44423t8 = false;
            return;
        }
        if (this.f44410s8 != null && z10 && (chatFull = this.f44322l8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.t.q(R.string.LinkHashExpired, org.telegram.ui.Components.wc.b0(this), R.raw.linkbroken, 36);
            this.f44410s8 = null;
        }
        this.f44299j8 = !this.Z5;
    }

    public final void V7() {
        if (this.f44292j1 != null && this.W1 == null && getParentActivity() != null) {
            this.W1 = new org.telegram.ui.ActionBar.q0(this, getParentActivity(), 1);
            x9();
            this.W1.setClickable(true);
            this.Y0.addView(this.W1, org.telegram.ui.Components.gb1.r(-1, 44));
            this.Y0.h(2, this.W1);
            this.Y0.g(this.W1);
            TextView textView = new TextView(getParentActivity());
            this.Z1 = textView;
            int i10 = org.telegram.ui.ActionBar.y6.f23596q7;
            org.telegram.ui.ActionBar.f7.V(textView, i10, getResourceProvider());
            TextView textView2 = this.Z1;
            float dp = AndroidUtilities.dp(18.0f);
            int dp2 = AndroidUtilities.dp(4.0f);
            org.telegram.ui.ActionBar.f7.R(textView2, org.telegram.ui.ActionBar.y6.X(dp, getThemedColor(i10) & 436207615, dp2, dp2, dp2, dp2), null, org.telegram.ui.ActionBar.f7.h(i10, 25), getResourceProvider());
            this.Z1.setTag(Integer.valueOf(i10));
            this.Z1.setTextSize(1, 14.0f);
            this.Z1.setTypeface(AndroidUtilities.bold());
            this.Z1.setSingleLine(true);
            this.Z1.setMaxLines(1);
            this.Z1.setGravity(17);
            this.W1.addView(this.Z1, org.telegram.ui.Components.gb1.i(-1, -1, 51));
            this.Z1.setOnClickListener(new xe(this, 13));
            org.telegram.ui.Components.z90 z90Var = new org.telegram.ui.Components.z90(getParentActivity(), this.f44385qa);
            this.f44245f2 = z90Var;
            org.telegram.ui.ActionBar.f7.V(z90Var, org.telegram.ui.ActionBar.y6.f23416ge, getResourceProvider());
            this.f44245f2.setTextSize(1, 13.3f);
            this.f44245f2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.f7.H(this.f44245f2, org.telegram.ui.ActionBar.y6.il, getResourceProvider());
            this.f44245f2.setGravity(17);
            this.f44245f2.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.Y0.addView(this.f44245f2, org.telegram.ui.Components.gb1.o(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.Y0.h(8, this.f44245f2);
            this.Y0.g(this.f44245f2);
            TextView textView3 = new TextView(getParentActivity());
            this.X1 = textView3;
            int i11 = org.telegram.ui.ActionBar.y6.f23434he;
            org.telegram.ui.ActionBar.f7.V(textView3, i11, getResourceProvider());
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
            org.telegram.ui.ActionBar.f7.R(textView4, org.telegram.ui.ActionBar.y6.X(AndroidUtilities.dp(18.0f), themedColor, dp3, dp3, dp3, dp3), null, org.telegram.ui.ActionBar.f7.h(i11, 25), getResourceProvider());
            this.W1.addView(this.X1, org.telegram.ui.Components.gb1.i(-1, -1, 51));
            this.X1.setOnClickListener(new xe(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.a2 = textView5;
            org.telegram.ui.ActionBar.f7.V(textView5, i11, getResourceProvider());
            this.a2.setVisibility(8);
            this.a2.setTextSize(1, 14.0f);
            this.a2.setTypeface(AndroidUtilities.bold());
            this.a2.setSingleLine(true);
            this.a2.setMaxLines(1);
            this.a2.setPadding(AndroidUtilities.dp(4.0f), 0, AndroidUtilities.dp(4.0f), 0);
            this.a2.setGravity(17);
            this.a2.setText(LocaleController.getString(R.string.RestartTopic));
            org.telegram.ui.ActionBar.f7.R(this.a2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i11) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.f7.h(i11, 25), getResourceProvider());
            this.Y0.addView(this.a2, org.telegram.ui.Components.gb1.r(-1, 48));
            this.Y0.h(4, this.a2);
            this.Y0.g(this.a2);
            this.a2.setOnClickListener(new xe(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f44257g2 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.f44257g2.setContentDescription(LocaleController.getString(R.string.Close));
            ImageView imageView2 = this.f44257g2;
            int i12 = org.telegram.ui.ActionBar.y6.f23446i6;
            org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.N(getThemedColor(i12), 0, 0), null, org.telegram.ui.ActionBar.f7.N(i12), getResourceProvider());
            org.telegram.ui.ActionBar.f7.t(this.f44257g2, org.telegram.ui.ActionBar.y6.f23362de, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f44257g2.setScaleType(ImageView.ScaleType.CENTER);
            this.W1.addView(this.f44257g2, org.telegram.ui.Components.gb1.h(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f44257g2.setOnClickListener(new xe(this, 16));
        }
    }

    public final int V8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f44468x0.getMeasuredHeight() - view.getBottom()) - this.f44468x0.getPaddingBottom()) + "} chatHeight=" + this.f44468x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f44468x0.getPaddingBottom());
        return (this.f44468x0.getMeasuredHeight() - view.getBottom()) - this.f44468x0.getPaddingBottom();
    }

    public final void V9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.f44249f6, messageObject);
        }
    }

    public final void Va() {
        this.Ub = null;
        this.Sb = 0;
        this.Tb = -1;
        this.Vb = null;
        this.Wb = null;
        this.f44442v1.d(false);
    }

    public final void Vb(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f31887j = max;
        G.f31899w = new ze(this, i10, 3);
        G.k(true);
        this.S3 = messageObject;
        this.T3 = i10;
    }

    public final void Vc() {
        boolean z10;
        if (this.f44442v1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.E3 && !this.D3) || (this.f44221d4 == 7 && this.f44180a4 == 2 && !this.G6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f44442v1.e(6, z10, true);
        this.f44442v1.e(5, z10, true);
        if (z10) {
            this.f44442v1.e(1, false, true);
        }
        if (!z10) {
            this.N7 = 0;
        }
        this.f44292j1.invalidate();
    }

    public final void W6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.K1 == null && ChatObject.isMegagroup(this.e) && (chatFull = getMessagesController().getChatFull(this.e.f22027id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            lk lkVar = this.f44178a1;
            if (lkVar == null || lkVar.getVisibility() != 0) {
                org.telegram.ui.Components.u40 u40Var = org.telegram.ui.Components.u40.f33241n;
                if (u40Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f22033id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        u40Var.b();
                        fi.v3 v3Var = new fi.v3(getParentActivity(), 3);
                        this.K1 = v3Var;
                        v3Var.i(true);
                        this.K1.p(true);
                        fi.v3 v3Var2 = this.K1;
                        v3Var2.K = Layout.Alignment.ALIGN_CENTER;
                        v3Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.c6(j10, this.K1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.K1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        fi.v3 v3Var3 = this.K1;
                        v3Var3.h = fi.v3.a(v3Var3.getText(), this.K1.getTextPaint());
                        fi.v3 v3Var4 = this.K1;
                        v3Var4.d = -1L;
                        v3Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new jg(this, 29), 300L);
                    }
                }
            }
        }
    }

    public final void W7() {
        int i10;
        if (this.f44219d2 == null && getParentActivity() != null) {
            if (this.J2 == null) {
                R7();
            }
            org.telegram.ui.Components.e41 e41Var = new org.telegram.ui.Components.e41(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.f44219d2 = e41Var;
            e41Var.O = new le(this, 5);
            e41Var.setSideMenuBackgroundDrawable(this.J.c(e41Var, gh.c.p(this.f44385qa), false));
            org.telegram.ui.Components.e41 e41Var2 = this.f44219d2;
            e41Var2.setTopMenuBackgroundDrawable(this.J.c(e41Var2, gh.c.p(this.f44385qa), false));
            this.f44219d2.setCurrentTopic(b());
            this.f44219d2.setOnNewTopicSelected(new le(this, 6));
            this.f44219d2.setOnTopicSelected(new we(this, 0));
            this.f44219d2.setOnDialogSelected(new we(this, 1));
            int indexOfChild = this.f44292j1.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.f44292j1.addView(this.f44219d2, i10, org.telegram.ui.Components.gb1.j(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.f44219d2.o();
            zj zjVar = this.U1;
            if (zjVar != null) {
                zjVar.bringToFront();
            }
        }
    }

    public final mn W8() {
        if (this.Kc == null) {
            this.Kc = new mn(this);
        }
        return this.Kc;
    }

    public final boolean W9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.g6 g6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.g6 animation;
        boolean z10;
        org.telegram.ui.Cells.s1 messageCell;
        boolean z11;
        if (this.f44468x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.t40 t40Var = this.F2;
            ArrayList<MessageObject> arrayList = null;
            if (t40Var != null && t40Var.getTag() != null && (messageCell = this.F2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                g6Var = photoImage2.getAnimation();
                if (g6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f44468x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.J8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                g6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f44468x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f44468x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        MessageObject messageObject2 = s1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = s1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f44468x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f44468x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.J8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f44468x0.getMeasuredHeight()) {
                                    messageObject = messageObject2;
                                    g6Var = animation;
                                    break;
                                }
                                messageObject = messageObject2;
                                g6Var = animation;
                            }
                        }
                    }
                    i10++;
                }
            }
            if (messageObject != null && !MediaController.getInstance().isPlayingMessage(messageObject)) {
                r9(true);
                if (messageObject.isRoundVideo()) {
                    boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                    MediaController mediaController = MediaController.getInstance();
                    if (playMessage) {
                        arrayList = Y7(messageObject, false);
                    }
                    mediaController.setVoiceMessagesPlaylist(arrayList, false);
                    return playMessage;
                }
                SharedConfig.setNoSoundHintShowed(true);
                messageObject.audioProgress = g6Var.n();
                messageObject.audioProgressMs = g6Var.o();
                g6Var.stop();
                if (PhotoViewer.N1(messageObject)) {
                    PhotoViewer.f35604b9.Q0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Wa(org.telegram.ui.Cells.s1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Wa(org.telegram.ui.Cells.s1):void");
    }

    public final void Wb(boolean z10) {
        boolean z11;
        lh.h hVar = this.f44442v1;
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

    public final void Wc(String str) {
        if (this.f44221d4 == 7 && !TextUtils.equals(this.G3, str)) {
            T7();
            Xb(true);
            this.G3 = str;
            this.F3 = str;
            Y6(false);
            E7(true);
            this.Z6 = 0L;
            this.f44461w7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.f44180a4);
            this.Y3.l();
            this.X3.requestLayout();
            if (this.X3.getLayoutManager() != null) {
                this.X3.getLayoutManager().n0(0);
            }
            Uc();
            this.f44368p2.e(true, true);
            z8();
        }
    }

    public final void X6() {
        ArrayList arrayList;
        int i10;
        if (this.f44215cb) {
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
                        Collections.sort(arrayList2, new org.telegram.ui.ActionBar.n4(10));
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

    public final void X7() {
        if (this.K3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f44385qa);
            this.K3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.f44292j1.addView(this.K3, org.telegram.ui.Components.gb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final long X8() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.e) || !ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
            return 0L;
        }
        long j10 = this.f44370p4;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.B5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.f44498z5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j10;
    }

    public final void X9(MessageObject messageObject) {
        org.telegram.ui.ActionBar.r2 r2Var;
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var == null) {
            return;
        }
        long j10 = messageObject.messageOwner.action.channel_id;
        if (j5Var.getFragmentStack().size() > 0) {
            r2Var = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            r2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.j5 j5Var2 = this.parentLayout;
        if (indexOf > 0 && !(r2Var instanceof un) && !(r2Var instanceof ProfileActivity) && this.e.creator) {
            int size = j5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) j5Var2.getFragmentStack().get(indexOf);
                if (r2Var2 instanceof un) {
                    ((ActionBarLayout) j5Var2).c(indexOf, new un(a1.g.h(j10, "chat_id")));
                    r2Var2.removeSelfFromStack();
                } else if (r2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) j5Var2).c(indexOf, new ProfileActivity(a1.g.h(j10, "chat_id"), null));
                    r2Var2.removeSelfFromStack();
                } else if (r2Var2 instanceof mo) {
                    ((ActionBarLayout) j5Var2).c(indexOf, new mo(a1.g.h(j10, "chat_id")));
                    r2Var2.removeSelfFromStack();
                } else if (r2Var2 instanceof kr) {
                    if (((kr) r2Var2).f41011d1 == 0) {
                        Bundle arguments = r2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) j5Var2).c(indexOf, new kr(arguments));
                    }
                    r2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new m4.v0(this, r2Var, messageObject, j5Var2, 12));
        }
        AndroidUtilities.runOnUIThread(new ag.o0(this, j10, 1), 1000L);
    }

    public final void Xa() {
        org.telegram.ui.Components.uc0 i10;
        sn snVar = this.f44385qa;
        if (snVar != null) {
            Drawable l4 = snVar.l();
            if (this.fragmentView != null) {
                l4 = this.f44292j1.getBackgroundImage();
            }
            if (l4 instanceof xn) {
                l4 = ((xn) l4).c(true);
            }
            if (l4 instanceof org.telegram.ui.Components.uc0) {
                ((org.telegram.ui.Components.uc0) l4).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.l5) && (i10 = ((org.telegram.ui.ActionBar.l5) themedDrawable).i()) != null) {
                i10.w(false);
            }
        }
    }

    public final void Xb(boolean z10) {
        int i10;
        if (this.W3 != null) {
            oe.b bVar = this.Vc;
            if (bVar.f19327f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.f44221d4 == 7) {
                    s4.c0 c0Var = (s4.c0) this.X3.getLayoutManager();
                    Object E = this.Y3.E((c0Var.N0() + c0Var.L0()) / 2);
                    Object E2 = this.Y3.E(c0Var.L0());
                    Object E3 = this.Y3.E(c0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f44493z0.L0();
                        int N0 = this.f44493z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f22048id;
                        int i12 = ((MessageObject) E2).messageOwner.f22048id;
                        int i13 = ((MessageObject) E3).messageOwner.f22048id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f22048id == i12) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f22048id == i13) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f22048id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.f44493z0.h1(this.A0.J + i14, (this.f44468x0.getHeight() - J8((MessageObject) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.s6 s6Var = this.f44269h3;
                if (s6Var != null) {
                    if (bVar.f19327f) {
                        i10 = R.string.SearchAsChat;
                    } else {
                        i10 = R.string.SearchAsList;
                    }
                    s6Var.c(LocaleController.getString(i10), !LocaleController.isRTL, true);
                }
                fi.v3 v3Var = this.J1;
                if (v3Var != null && v3Var.V) {
                    v3Var.e(true);
                }
                rl rlVar = this.N1;
                if (rlVar != null && rlVar.V) {
                    rlVar.e(true);
                }
                hk hkVar = this.Y;
                if (hkVar != null) {
                    hkVar.i0();
                }
                Tc();
            }
        }
    }

    public final void Xc() {
        hk hkVar;
        if (this.R != null) {
            this.E0.setBackground(null);
            this.E0.setOnClickListener(null);
            boolean z10 = true;
            if (this.f44221d4 == 3 && S8() == 2666000) {
                this.E0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.R.setVisibility(0);
                this.U1.setVisibility(8);
                this.U1.setTag(null);
                Fc();
                org.telegram.ui.Components.tz0 tz0Var = this.f44367p1;
                if (tz0Var != null) {
                    tz0Var.f();
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
                                int i10 = org.telegram.ui.ActionBar.y6.Oh;
                                mutate.setTint(getThemedColor(i10));
                                this.N0 = mutate;
                                this.K0 = getThemedColor(i10);
                                mutate.setBounds(0, 0, AndroidUtilities.dp(14.0f), AndroidUtilities.dp(14.0f));
                                org.telegram.ui.Components.ar arVar = new org.telegram.ui.Components.ar(null, mutate, AndroidUtilities.dp(-6.0f), AndroidUtilities.dp(-6.0f));
                                int dp = AndroidUtilities.dp(14.0f);
                                int dp2 = AndroidUtilities.dp(14.0f);
                                arVar.e = dp;
                                arVar.f26593f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                arVar.h = dp3;
                                arVar.f26594n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.t.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p10(i10, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(arVar, 1), 0, 1, 33);
                                TextView textView = this.E0;
                                int i11 = org.telegram.ui.ActionBar.y6.f23446i6;
                                org.telegram.ui.ActionBar.f7.R(textView, org.telegram.ui.ActionBar.y6.h0(0, org.telegram.ui.ActionBar.y6.x0(null, i11, false)), null, org.telegram.ui.ActionBar.f7.N(i11), null);
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
                        this.U1.setVisibility(8);
                        this.U1.setTag(null);
                        Fc();
                        org.telegram.ui.Components.tz0 tz0Var2 = this.f44367p1;
                        if (tz0Var2 != null) {
                            tz0Var2.f();
                        }
                    }
                }
                N7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.f44304k1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a1.g.s(new StringBuilder("<b>"), this.f44242f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.f44249f6, this.f44370p4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.R.setVisibility(4);
                            if (!this.inPreviewMode && !this.f44201bb && this.f44221d4 != 3) {
                                this.Y.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    d7();
                    N6(false);
                } else {
                    this.R.setVisibility(4);
                    if (this.f44367p1 != null && (hkVar = this.Y) != null && hkVar.h0()) {
                        this.f44367p1.e();
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

    public final void Y6(boolean z10) {
        ig.n1 n1Var;
        if (this.f44180a4 == 2 && (n1Var = this.Y3) != null) {
            String str = this.G3;
            fi.ua uaVar = n1Var.E;
            if (!TextUtils.equals(n1Var.f14187x, str)) {
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
                AndroidUtilities.cancelRunOnUIThread(uaVar);
                di.t6 t6Var = n1Var.f14188y;
                if (t6Var != null && t6Var.I != 0) {
                    ConnectionsManager.getInstance(t6Var.f9490c).cancelRequest(t6Var.I, true);
                    t6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    n1Var.f14187x = str;
                    n1Var.f14188y = new di.t6(n1Var.f14184r, str2, trim);
                    if (z10) {
                        uaVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(uaVar, 1000L);
                    }
                }
                di.t6 t6Var2 = n1Var.f14188y;
                if (t6Var2 != null && t6Var2.J > 0) {
                    n1Var.l();
                }
            }
        }
    }

    public final ArrayList Y7(MessageObject messageObject, boolean z10) {
        ArrayList l4 = org.telegram.messenger.t.l(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.G6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.X6 || messageObject.getDialogId() == this.X6) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    l4.add(messageObject2);
                }
            }
        }
        return l4;
    }

    public final int Y8() {
        return this.f44292j1.getBackgroundSizeY();
    }

    public final void Y9(boolean z10) {
        int i10;
        if (this.f44468x0 != null) {
            ArrayList arrayList = this.G6;
            if (!arrayList.isEmpty() && !this.Ia.f38541n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f44493z0.h1(i10, 0);
                this.f44468x0.C0();
            }
        }
    }

    public final void Ya() {
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
        if (!this.f44308k5 && hkVar != null && (lkVar = this.f44178a1) != null && lkVar.getVisibility() != 0) {
            messageObject = this.f44498z5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.Y2;
        } else {
            z10 = true;
            messageObject = null;
            charSequence = null;
        }
        if (this.f44485y5) {
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
        long I7 = I7(messageObject);
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.f44249f6, I7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j11 = this.f44249f6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.f44485y5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        kn knVar = this.f44473x5;
        MessageSuggestionParams messageSuggestionParams = this.f44407s5;
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
        mediaDataController2.saveDraft(j11, I7, charSequence2, entities, message, knVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void Yb(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44385qa);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
            e2Var.R = string;
            if (user != null) {
                str3 = ContactsController.formatName(user.first_name, user.last_name);
            }
            e2Var.T = LocaleController.formatString(R.string.BotPermissionGameAlert, str3);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), new bi.m4(this, tL_game, messageObject, str, j10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            showDialog(e2Var);
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
                    presentFragment(new ni1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        ni1.W(str, messageObject, parentActivity, str6, str3);
    }

    public final void Yc() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i12 = (a() > getUserConfig().getClientUserId() ? 1 : (a() == getUserConfig().getClientUserId() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f44285i6;
        if (i12 == 0) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i13 = 0; i13 < sparseArrayArr.length; i13++) {
                for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i13].valueAt(i14);
                    if (messageObject.hasValidGroupId()) {
                        MessageObject.GroupedMessages h92 = h9(messageObject);
                        if (h92 != null) {
                            groupedMessagePosition = h92.getPosition(messageObject);
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
            xk xkVar = this.f44465wb;
            if (xkVar != null) {
                xkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f44465wb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                xk xkVar2 = this.f44465wb;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                xkVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new le(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.fl0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.w0 j10 = this.actionBar.i(null).j(28);
            if (j10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.ak0 ak0Var = j10.f23202x;
                if (ak0Var != null && j10.f23203y != i10) {
                    j10.f23203y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(ak0Var, i10);
                }
            }
        }
        if (this.f44313ka != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i15));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i16));
            }
            this.f44313ka.setSelectedMessages(arrayList2);
        }
    }

    public final void Z6() {
        this.S.d();
        Jc();
        tc();
        t7();
        q7();
        v7();
        u7();
        y7();
        y9();
        boolean z10 = true;
        if (this.v.f47622s == 1) {
            z10 = false;
        }
        if (this.f44399rb != z10) {
            this.f44399rb = z10;
            checkSystemBarColors();
        }
    }

    public final void Z7(final int i10, final int i11, final boolean z10) {
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
        oj ojVar = this.f44468x0;
        if (ojVar != null) {
            ojVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            bc(true);
        }
        fm fmVar = this.A0;
        fmVar.L = true;
        fmVar.O(true);
        X7();
        UndoView undoView = this.K3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f44249f6, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                un unVar = un.this;
                MessagesController messagesController = unVar.getMessagesController();
                long j11 = unVar.f44249f6;
                if (ChatObject.isChannel(unVar.e)) {
                    j10 = unVar.f44249f6;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i10, i11, z10, new jg(unVar, 21));
            }
        }, new jg(this, 6));
    }

    public final float Z8(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.f44292j1.getBackgroundTranslationY()) - ((1.0f - this.J9) * this.E9);
    }

    public final boolean Z9() {
        hk hkVar = this.Y;
        boolean z10 = hkVar.f25990z2;
        if (z10) {
            hkVar.p1();
            this.P3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void Za() {
        org.telegram.ui.Cells.s1 s1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f44468x0.getChildCount(); i11++) {
            View childAt = this.f44468x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                int min = Math.min(s1Var2.getBottom(), this.f44468x0.getHeight()) - Math.max(0, s1Var2.getTop());
                if (min > i10) {
                    s1Var = s1Var2;
                    i10 = min;
                }
            }
        }
        if (s1Var != null) {
            rj rjVar = this.f44493z0;
            this.f44468x0.getClass();
            rjVar.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) this.E9), false);
        }
    }

    public final void Zb(boolean z10) {
        if (z10) {
            if (this.Yb == null) {
                le leVar = new le(this, 11);
                this.Yb = leVar;
                AndroidUtilities.runOnUIThread(leVar, 100L);
                return;
            }
            return;
        }
        le leVar2 = this.Yb;
        if (leVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar2);
        }
        this.Yb = null;
        this.Xb = false;
        Kc(true);
    }

    public final void Zc(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        org.telegram.ui.Wallet.k3 k3Var;
        if (this.fragmentView != null && !this.C5) {
            int childCount = this.f44468x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f44468x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        MessageObject messageObject = v0Var.getMessageObject();
                        if (this.X7 != Integer.MAX_VALUE && messageObject != null && messageObject.getId() == this.X7 && v0Var.L()) {
                            org.telegram.ui.Wallet.m3 m3Var = v0Var.I0;
                            if (!m3Var.f36896h0 && (m3Var.f36891e0 == 0 || (k3Var = m3Var.f36890d0) == null || k3Var.c())) {
                                m3Var.e();
                                org.telegram.ui.Wallet.k3 k3Var2 = m3Var.f36890d0;
                                k3Var2.getClass();
                                k3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.k3 k3Var3 = m3Var.f36890d0;
                                k3Var3.f27460b = -1L;
                                k3Var3.f27461c = -1L;
                                m3Var.f36891e0 = SystemClock.elapsedRealtime();
                                m3Var.f36893f0 = false;
                                m3Var.f36884a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        MessageObject messageObject2 = s1Var.getMessageObject();
                        if (this.F8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                            ImageReceiver photoImage = s1Var.getPhotoImage();
                            this.F8.setTranslationX(s1Var.getX() + photoImage.getImageX());
                            this.F8.setTranslationY((this.f44468x0.getY() + (photoImage.getImageY() + (s1Var.getY() + s1Var.getPaddingTop()))) - this.F8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.F8.getLayoutParams();
                            if (messageObject2.isRoundVideo()) {
                                this.F8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(L9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(L9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(L9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.H8.setResizeMode(0);
                                    this.F8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(L9())) / AndroidUtilities.roundPlayingMessageSize(L9());
                                float imageWidth = s1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(L9());
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
                    this.F8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(L9())) - 100);
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
                        this.f44468x0.invalidate();
                    }
                }
            }
        }
    }

    public long a() {
        return this.f44249f6;
    }

    public final void a7() {
        TLRPC.Chat chat;
        long j10 = getArguments().getInt("search_from_user_id", 0);
        if (j10 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                va("");
                ImageView imageView = this.f44246f3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                ib(null, user);
                return;
            }
            return;
        }
        long j11 = getArguments().getInt("search_from_chat_id", 0);
        if (j11 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j11))) != null) {
            va("");
            ImageView imageView2 = this.f44246f3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            ib(chat, null);
        }
    }

    public final void a8(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
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
        org.telegram.ui.Components.k80 I = org.telegram.ui.Components.k80.I(this, s1Var);
        org.telegram.ui.Components.hn0 hn0Var = new org.telegram.ui.Components.hn0(getParentActivity(), this.f44385qa);
        I.f29861p = new re(hn0Var, 0);
        if (!str.startsWith("video?") && !qf.d.e(Uri.parse(str), false, null)) {
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
            bi.o2 o2Var = new bi.o2(this, str, characterStyle, messageObject, s1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            s1Var2 = s1Var;
            I.c(i13, string, o2Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            s1Var2 = s1Var;
            characterStyle2 = characterStyle;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(R.drawable.msg_openin, LocaleController.getString(R.string.OpenInSystemBrowser2), new se(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !isWebBrowserOpenInApp) {
            I.c(R.drawable.menu_website, LocaleController.getString(R.string.OpenInTelegramBrowser2), new se(this, str, 1), false);
        }
        TLRPC.MessageMedia media = MessageObject.getMedia(messageObject);
        if ((media instanceof TLRPC.TL_messageMediaWebPage) && (webPage = media.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            messageObject2 = messageObject;
            I.c(R.drawable.menu_instant_view, LocaleController.getString(R.string.OpenInstantView), new te(this, messageObject2, 0), false);
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
        I.c(i14, LocaleController.getString(i10), new bi.s9(this, str, messageObject2, startsWith, 10), false);
        if (isWebBrowserOpenInApp && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(R.drawable.outline_saved_24, LocaleController.getString(R.string.WebBookmarkAdd), new se(this, str, 2), false);
        }
        hn0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            hn0Var.f(s1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.z61) {
            String url = ((org.telegram.ui.Components.z61) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = qf.d.u(parse, null, null, qf.d.a(parse.getHost()), null);
                } catch (Exception e) {
                    FileLog.e((Throwable) e, false);
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
            hn0Var.f(s1Var2, characterStyle2, spannableString2, false);
        } else {
            hn0Var.f(s1Var2, characterStyle2, null, false);
        }
        showDialog(hn0Var);
    }

    public final float a9() {
        org.telegram.ui.Components.e41 e41Var = this.f44219d2;
        if (e41Var != null) {
            return e41Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void ab(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.ab(org.telegram.messenger.MessageObject):void");
    }

    public final void ac(boolean z10) {
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
                spannableString.setSpan(new org.telegram.ui.Components.q61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(this);
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
                    org.telegram.ui.Components.qc M = b02.M(string, AndroidUtilities.replaceCharSequence("%d", AndroidUtilities.premiumText(LocaleController.getString(i11), new af(this, z10, 1)), spannableString), i12);
                    M.f31887j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void ad(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        ij ijVar = this.f44327m1;
        if (ijVar == null) {
            return;
        }
        int i10 = this.f44221d4;
        if (i10 == 8 && (chat2 = this.e) != null) {
            if (this.f44247f4) {
                String i11 = pg.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.e;
                ijVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f44370p4 > 0L ? 1 : (this.f44370p4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.e;
                        }
                        this.f44327m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        ij ijVar2 = this.f44327m1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.e;
                        ijVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f44370p4));
                    this.f44327m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f44370p4));
                    if (chat7 == null) {
                        chat7 = this.e;
                    }
                    this.f44327m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                ij ijVar3 = this.f44327m1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.e.title));
                TLRPC.Chat chat8 = this.e;
                ijVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            ijVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.f44208c4)) {
                this.f44327m1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.f44208c4)) {
                this.f44327m1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f44327m1.setTitle(this.f44208c4);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.f44194b4.title)) {
                this.f44327m1.setTitle(this.f44194b4.title);
            } else {
                this.f44327m1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j10 = this.f44370p4;
                if (j10 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f44327m1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f44327m1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f44327m1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f44327m1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f44327m1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f44327m1.setTitle("");
                }
            } else if (O9() && !UserObject.isBotForum(this.f44242f)) {
                if (this.f44419t4) {
                    fd();
                } else if (this.f44406s4) {
                    if (this.f44295j4.hasReplies()) {
                        this.f44327m1.setTitle(LocaleController.formatPluralString("Comments", this.f44295j4.getRepliesCount(), new Object[0]));
                    } else {
                        this.f44327m1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f44327m1.setTitle(LocaleController.formatPluralString("Replies", this.f44295j4.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f44242f)) {
                this.f44327m1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f44242f)) {
                this.f44327m1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.f44221d4;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f44242f)) {
                        this.f44327m1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f44327m1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f44327m1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", Q8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.e;
                    if (chat9 != null) {
                        ij ijVar4 = this.f44327m1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.e;
                        ijVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f44242f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f44327m1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f44242f.f22174id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f44242f.phone)) {
                                    ij ijVar5 = this.f44327m1;
                                    String g7 = org.telegram.messenger.vh.g(new StringBuilder("+"), this.f44242f.phone, kf.b.c());
                                    TLRPC.User user4 = this.f44242f;
                                    ijVar5.h(g7, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f44242f), this.f44242f.emoji_status, z10);
                                } else {
                                    ij ijVar6 = this.f44327m1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f44242f)));
                                    TLRPC.User user5 = this.f44242f;
                                    ijVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f44242f), this.f44242f.emoji_status, z10);
                                }
                            } else {
                                ij ijVar7 = this.f44327m1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f44242f)));
                                TLRPC.User user6 = this.f44242f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f44242f);
                                if (!MessagesController.isSupportUser(this.f44242f)) {
                                    emojiStatus = this.f44242f.emoji_status;
                                }
                                ijVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f44327m1.getTitleTextView().getText());
        cd(false);
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23737xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23445i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23425h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23358da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23562oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23542na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23522ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23504la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23486ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23506lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23585pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23469jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23452id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23765z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.De));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23660tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23697ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23379ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23653t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23710w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23304af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23471jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23323be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23324bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23693v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23674u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23581p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23561o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23485k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23521m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23449i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23466j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23299a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23734xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23430ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23413ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23394fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23377ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23640se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23620re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23470je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23677uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23301ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23771zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23753yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23770zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23696vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23735xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23716wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23678ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23694vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23676ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23639sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23619rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23523mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23505lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23601qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23583pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23543nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23563ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23525md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23507ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23565od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23545nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23489kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23617rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23599qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23433hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23415gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23431hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23361dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23414gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23342cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23322bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23395fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23359db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Za));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ya));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23715wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23598qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23613r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Va));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ua));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ta));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23752yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23658tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23638sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23432hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23396fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23378ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23524mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23488kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23468jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23360dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23616ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23560o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23540n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23520m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23502l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23484k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23465j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23564oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23654t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23582pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23634s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23692v8));
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
        if (!this.f44419t4 && (i10 = this.f44221d4) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f44370p4;
    }

    public final void b7() {
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
            kf kfVar = new kf(this, 25);
            this.O4 = kfVar;
            AndroidUtilities.runOnUIThread(kfVar);
        }
    }

    public final void b8(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.s1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.b8(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.s1):void");
    }

    public final int b9() {
        return (int) (a9() * AndroidUtilities.dp(71.0f));
    }

    public final void bb(long j10) {
        rj rjVar;
        MessageObject messageObject;
        int V8;
        int abs;
        oj ojVar = this.f44468x0;
        int i10 = -1;
        if (ojVar != null && (rjVar = this.f44493z0) != null && rjVar.f47714y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = ojVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44468x0.getChildAt(childCount);
                this.f44468x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((V8 = V8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = V8;
                    i12 = abs;
                }
            }
            this.f44500z7 = i10;
            this.A7 = i11;
            return;
        }
        this.f44500z7 = -1;
    }

    public final void bc(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f44406s4 && this.f44242f == null) {
                if (this.Eb == null) {
                    this.Eb = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.Eb.booleanValue()) {
                    this.Db = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.f44182a6 && SharedConfig.animationsEnabled()) {
                if (z10 == this.Db) {
                    return;
                }
                this.Db = z10;
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
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new pi(this, 3)).start();
                return;
            }
            this.Db = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void bd() {
        cd(false);
    }

    @Override
    public final boolean c() {
        if (this.f44221d4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7(boolean z10) {
        if (this.f44498z5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.G6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.f44498z5.getId() && messageObject.getDialogId() == this.f44498z5.getDialogId()) {
                        this.f44498z5 = messageObject;
                        kn knVar = this.f44473x5;
                        if (knVar != null) {
                            knVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f44394r5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.f44498z5;
                                MessageObject.GroupedMessages groupedMessages = this.f44446v5;
                                if (groupedMessages == null) {
                                    groupedMessages = H8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.f44249f6, this.f44473x5);
                            }
                            q8();
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

    public final void c8(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, String str) {
        ri U9 = U9(s1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(kf.b.d(str, false));
        bi.b3 b3Var = new bi.b3(this, s1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                b3Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new q1(this, tL_contact, b3Var, 14));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = kf.b.d(str, false);
        U9.f47031b = new ze(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ea(this, U9, b3Var, 3)), 0);
        U9.d();
    }

    public final int c9(int i10) {
        SparseIntArray sparseIntArray = this.f44271h5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = f44170dd;
            f44170dd = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void ca() {
        Q6(this.f44191b1, 5, true);
        Q6(this.Y, 1, false);
        Q6(this.f44220d3, 4, true);
        Q6(this.f44178a1, 3, false);
        Q6(this.R, 2, false);
        float f7 = this.Tc.e;
        k6.m mVar = this.Yc;
        float d = ic.a.d(1.0f, f7, 1.0f - ((float[]) mVar.f16424b)[5], 1.0f);
        lh.c cVar = this.f44191b1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(d);
        }
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        kk kkVar = this.f44220d3;
        if (kkVar != null) {
            kkVar.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        lk lkVar = this.f44178a1;
        if (lkVar != null) {
            lkVar.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        kk kkVar2 = this.R;
        if (kkVar2 != null) {
            kkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        jh.f fVar = this.S;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - d) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        lk lkVar2 = this.f44178a1;
        oe.b bVar = this.Rc;
        if (lkVar2 != null) {
            lkVar2.setTotalVisibilityFactor((1.0f - bVar.e) * ((float[]) mVar.f16424b)[3]);
        }
        rp rpVar = this.f44200ba;
        if (rpVar != null) {
            float f10 = bVar.e;
            if (rpVar.S != f10) {
                rpVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        x7();
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ke keVar;
        if ((this.f44221d4 != 5 || (!this.G6.isEmpty() && this.f44370p4 != 0)) && !this.Vc.f19327f && this.f44502z9) {
            hk hkVar = this.Y;
            if (!hkVar.F2) {
                if (!hkVar.f25857c1 || (keVar = hkVar.f25869e1) == null || keVar.getVisibility() != 0) {
                    if ((!hkVar.g0() || !hkVar.f25911l0.v) && !org.telegram.ui.ActionBar.r2.hasSheets(hkVar.P2) && this.Z9 == 0.0f) {
                        wh.i iVar = this.ja;
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

    public final void cb() {
        int i10;
        int i11;
        oj ojVar = this.f44468x0;
        if (ojVar != null && this.f44493z0 != null) {
            for (int childCount = ojVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f44468x0.getChildAt(childCount);
                this.f44468x0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = V8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i10 = V8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f44493z0.h1(i11, i10);
        }
    }

    public final void cc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new pe(this, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22366a);
    }

    public final void cd(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (this.f44327m1 != null) {
            int i10 = this.f44221d4;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.f44249f6, b());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                this.O0 = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f44242f)) {
                    if (!UserObject.isReplyUser(this.f44242f) && ((!O9() || this.f44419t4) && isDialogMuted)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(R.drawable.mini_ephemeral_hidden_14).mutate();
                    int i11 = org.telegram.ui.ActionBar.y6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.SRC_IN));
                    this.O0 = mutate;
                    this.L0 = getThemedColor(i11);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.f44327m1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f44242f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f44327m1.c(DialogObject.getBotVerificationIcon(this.f44242f));
                        }
                    }
                }
                this.f44327m1.j(drawable, mutate);
                if (!z10 && (u0Var = this.f44378q1) != null) {
                    if (isDialogMuted) {
                        if (u0Var.f23116m != 8) {
                            u0Var.f23116m = 8;
                            View view = u0Var.f23113j;
                            if (view instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view).getRightIcon().setVisibility(u0Var.f23116m);
                            }
                        }
                        this.f44378q1.d(LocaleController.getString(R.string.Unmute));
                        this.f44378q1.b(R.drawable.msg_mute);
                    } else {
                        if (u0Var.f23116m != 0) {
                            u0Var.f23116m = 0;
                            View view2 = u0Var.f23113j;
                            if (view2 instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view2).getRightIcon().setVisibility(u0Var.f23116m);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.f44249f6, b())) {
                            this.f44378q1.d(LocaleController.getString(R.string.Mute));
                            this.f44378q1.b(R.drawable.msg_unmute);
                        } else {
                            this.f44378q1.d(LocaleController.getString(R.string.Mute));
                            this.f44378q1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.bp bpVar = this.f44429u1;
                if (bpVar != null) {
                    bpVar.e(this.f44249f6, b(), null);
                }
            }
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.f44249f6, this.f44498z5, this.f44295j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = L8();
        of2.payStars = j10;
        of2.monoForumPeer = X8();
        of2.suggestionParams = this.f44407s5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.f44221d4 == 0) {
            Y9(false);
        }
        if (i10 == 0 || i10 == 1) {
            D6();
        }
        if (this.C5) {
            this.f44210c6 = true;
        }
    }

    public final void d7() {
        lk lkVar;
        kk kkVar;
        kk kkVar2;
        hk hkVar = this.Y;
        if (hkVar != null && hkVar.f25991z3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((lkVar = this.f44178a1) == null || lkVar.getVisibility() != 0) && (((kkVar = this.R) == null || kkVar.getVisibility() != 0) && ((kkVar2 = this.f44220d3) == null || kkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void d8(org.telegram.ui.Cells.z r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.d8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int d9(int i10) {
        SparseIntArray sparseIntArray = this.f44260g5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = f44170dd;
            f44170dd = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void da(boolean z10, boolean z11) {
        if (this.P3) {
            AndroidUtilities.runOnUIThread(new le(this, 21), 200L);
            if (z11) {
                this.P3 = false;
            }
        }
        if (z10 && !this.f44201bb) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int db(org.telegram.messenger.MessageObject r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.db(org.telegram.messenger.MessageObject):int");
    }

    public final void dc() {
        String str;
        if (this.f44216cc != null) {
            return;
        }
        if (this.f44498z5 != null) {
            str = getMessagesController().getFullName(this.f44498z5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new pe(this, 20));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new pe(this, 21));
        e2Var.setOnDismissListener(new qe(this, 8));
        this.f44216cc = alertDialog$Builder.p();
    }

    public final void dd(boolean r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.dd(boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        MessageObject messageObject2;
        org.telegram.ui.ActionBar.j5 j5Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull userFull;
        TLRPC.User user;
        boolean z10;
        ij ijVar;
        hk hkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.ju editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.cz0 cz0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        hk hkVar2;
        un unVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            unVar.j8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            oj ojVar = unVar.f44468x0;
            if (ojVar != null) {
                ojVar.g1();
            }
            org.telegram.ui.Components.si siVar = unVar.Y9;
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
                if (((Integer) objArr[0]).intValue() == unVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        unVar.finishFragment();
                        b.b(unVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                di.a3 a3Var = unVar.V1;
                if (a3Var != null && a3Var.isShowing()) {
                    unVar.V1.dismiss(true);
                }
                if (z11 && (hkVar2 = unVar.Y) != null && hkVar2.q0()) {
                    unVar.Y.j0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f22047id = stickerSet2.f22054id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = unVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.cz0) && (tL_messages_stickerSet = (cz0Var = (org.telegram.ui.Components.cz0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f22054id == stickerSet2.f22054id) {
                            cz0Var.F0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.wc wcVar = new org.telegram.ui.Components.wc(cz0Var.container, unVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.qc q5 = wcVar.q(document, LocaleController.formatString(i12, stickerSet2.title));
                                    q5.f31887j = 2750;
                                    q5.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.cz0 cz0Var2 = new org.telegram.ui.Components.cz0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Y, unVar.f44385qa);
                            final boolean z15 = z12;
                            unVar = this;
                            cz0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    un.v0(un.this, objArr, cz0Var2, z15, stickerSet2);
                                }
                            });
                            unVar.showDialog(cz0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                oj ojVar2 = unVar.f44468x0;
                if (ojVar2 != null) {
                    ojVar2.g1();
                }
                TextView textView = unVar.f44207c3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i14 = 0; i14 < 2; i14++) {
                    org.telegram.ui.ActionBar.b6 b6Var = unVar.P2[i14];
                    if (b6Var != null) {
                        b6Var.invalidate();
                    }
                }
                zj zjVar = unVar.U1;
                if (zjVar != null) {
                    zjVar.getListView().g1();
                }
                bi.r1 r1Var = unVar.X3;
                if (r1Var != null) {
                    r1Var.g1();
                }
                UndoView undoView = unVar.K3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                hk hkVar3 = unVar.Y;
                if (hkVar3 != null && (editField = hkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                jn[] jnVarArr = unVar.Q2;
                jn jnVar = jnVarArr[0];
                if (jnVar != null) {
                    jnVar.invalidate();
                }
                jn jnVar2 = jnVarArr[1];
                if (jnVar2 != null) {
                    jnVar2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (unVar.f44322l8 != null && (chat = unVar.e) != null && chat.f22027id == l4.longValue()) {
                    unVar.f44322l8.online_count = ((Integer) objArr[1]).intValue();
                    ij ijVar2 = unVar.f44327m1;
                    if (ijVar2 != null) {
                        ijVar2.m();
                        unVar.f44327m1.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == unVar.f44249f6 && (hkVar = unVar.Y) != null) {
                    hkVar.N1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                hk hkVar4 = unVar.Y;
                if (hkVar4 != null) {
                    hkVar4.O1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (unVar.e != null) {
                        TLRPC.Chat chat2 = unVar.getMessagesController().getChat(Long.valueOf(unVar.e.f22027id));
                        if (chat2 != null) {
                            unVar.e = chat2;
                        }
                    } else if (unVar.f44242f != null && (user = unVar.getMessagesController().getUser(Long.valueOf(unVar.f44242f.f22174id))) != null) {
                        unVar.f44242f = user;
                    }
                    unVar.ad(true);
                }
                if (!unVar.O9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (unVar.e != null && (ijVar = unVar.f44327m1) != null) {
                        ijVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    unVar.p();
                    unVar.jd(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && unVar.e != null) {
                    unVar.H9();
                    TLRPC.Chat chat3 = unVar.getMessagesController().getChat(Long.valueOf(unVar.e.f22027id));
                    if (chat3 != null) {
                        unVar.e = chat3;
                        unVar.H9();
                        z10 = !unVar.O9();
                        unVar.uc(false);
                        hk hkVar5 = unVar.Y;
                        if (hkVar5 != null) {
                            hkVar5.Y0(unVar.currentAccount, unVar.f44249f6);
                        }
                        FlagSecureReason flagSecureReason = unVar.Q3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                ij ijVar3 = unVar.f44327m1;
                if (ijVar3 != null && z10) {
                    ijVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    unVar.dd(true);
                }
                org.telegram.ui.ActionBar.w0 w0Var = unVar.f44266h0;
                if (w0Var != null) {
                    if (ChatObject.isChannel(unVar.e) && !ChatObject.isMonoForum(unVar.e)) {
                        long j11 = unVar.e.linked_monoforum_id;
                        if (j11 != 0 && ChatObject.canManageMonoForum(unVar.currentAccount, -j11)) {
                            z13 = true;
                        }
                    }
                    w0Var.Q(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!unVar.f44201bb) {
                    if (longValue == unVar.f44249f6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i15 = unVar.f44221d4;
                        if (intValue2 != i15 && i15 != 3 && i15 != 8) {
                            if (i15 != 1 && intValue2 == 1 && !unVar.isPaused && LaunchActivity.U() == unVar && unVar.f44394r5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                unVar.ta(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !unVar.Nc && unVar.f44242f != null && unVar.a() != unVar.getUserConfig().getClientUserId() && (userFull = unVar.getMessagesController().getUserFull(unVar.f44242f.f22174id)) != null && userFull.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i13 >= size) {
                                        break;
                                    }
                                    MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                                    if (messageObject3.getId() > 0 && !messageObject3.isOut() && !messageObject3.isSponsored()) {
                                        unVar.Nc = true;
                                        unVar.getMessagesController().loadFullUser(unVar.f44242f, unVar.classGuid, true);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            unVar.Ia(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(unVar.e) && !unVar.e.megagroup && (chatFull = unVar.f44322l8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            MessageObject messageObject4 = (MessageObject) arrayList.get(i16);
                            if (messageObject4.isReply()) {
                                unVar.H6.put(messageObject4.getId(), messageObject4);
                            }
                        }
                        unVar.D7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                unVar.S9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                unVar.y6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == unVar.f44249f6) {
                        unVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (j5Var = unVar.parentLayout) != null && j5Var.getFragmentStack().size() > 1) {
                    unVar.finishFragment();
                } else {
                    unVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == unVar.a() && (booleanValue2 || unVar.parentLayout.getLastFragment() != unVar)) {
                    if (unVar.parentLayout.getLastFragment() == unVar) {
                        unVar.finishFragment();
                    } else {
                        unVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i17 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = unVar.A6;
                if (i10 == i17) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = unVar.e;
                    if (chat4 != null && chat4.f22027id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (unVar.C5) {
                            sh shVar = unVar.f44497z4;
                            if (shVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(shVar);
                                unVar.f44497z4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            sh shVar2 = new sh(unVar, messageObject2, intValue3);
                            unVar.f44497z4 = shVar2;
                            AndroidUtilities.runOnUIThread(shVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = unVar.e;
                    if (chat5 != null && chat5.f22027id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = unVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(unVar.e, unVar.getMessagesController().getChatFull(unVar.e.f22027id)));
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
                    if ((i10 == i19 || i10 == NotificationCenter.monoForumMessagesRead) && unVar.f44249f6 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i19) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = unVar.f44370p4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i20 = unVar.f44458w4;
                            ArrayList arrayList2 = unVar.G6;
                            if (intValue4 > i20) {
                                unVar.f44458w4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id3 = messageObject5.getId();
                                    if (!messageObject5.isOut() && id3 > 0 && id3 <= unVar.f44458w4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        fm fmVar = unVar.A0;
                                        if (fmVar != null) {
                                            fmVar.M(messageObject5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > unVar.f44472x4) {
                                unVar.f44472x4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i22 = 0; i22 < size5; i22++) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i22);
                                    int id4 = messageObject6.getId();
                                    if (messageObject6.isOut() && id4 > 0 && id4 <= unVar.f44472x4) {
                                        if (!messageObject6.isUnread()) {
                                            break;
                                        }
                                        messageObject6.setIsRead();
                                        fm fmVar2 = unVar.A0;
                                        if (fmVar2 != null) {
                                            fmVar2.R(messageObject6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        unVar.e8(i10, objArr);
        unVar.f8(i10, objArr);
        unVar.g8(i10, objArr);
        unVar.h8(i10, objArr);
        unVar.i8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        di.a3 a3Var = this.V1;
        if (a3Var != null && this.visibleDialog == a3Var) {
            a3Var.f33030j0.a0(false);
            this.V1.dismissInternal();
            this.V1.f33030j0.d0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.V1 && dialog != this.f44350na && !(dialog instanceof hi.m3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final boolean e7(boolean z10, boolean z11) {
        hk hkVar = this.Y;
        if (hkVar == null || !hkVar.s0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44385qa);
            if (this.Y.f25857c1) {
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new di.f(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f22366a);
            return true;
        }
        return true;
    }

    public final void e8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.e8(int, java.lang.Object[]):void");
    }

    public final long e9() {
        return this.f44370p4;
    }

    public final void ea() {
        this.P4 = true;
        nm nmVar = this.f44362o9;
        AndroidUtilities.cancelRunOnUIThread(nmVar.f24094f0);
        nmVar.f24120z = false;
        le leVar = new le(this, 8);
        int i10 = this.P7;
        if (i10 != 0) {
            gb(i10, 0, false, this.O7, true, 0, null, null, leVar);
            return;
        }
        int i11 = this.N7;
        if (i11 > 0) {
            gb(i11, 0, true, this.O7, true, 0, null, null, leVar);
            return;
        }
        fb(!this.f44478xb, leVar);
        this.f44478xb = false;
        if (!this.T4.isEmpty()) {
            this.f44181a5 = true;
            this.Z4 = ((Integer) this.T4.get(0)).intValue();
        }
    }

    public final void eb() {
        fb(false, null);
    }

    public final void ec(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.t40 t40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((t40Var = this.f44483y2) != null && t40Var.getVisibility() == 0)) {
                this.f44483y2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f44483y2.f(view, true);
                }
            }
        }
    }

    public final void ed() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.u0 u0Var = this.f44415t0;
        if (u0Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f44357o4) && (tL_forumTopic = this.f44357o4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u0Var.e(i10);
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7() {
        if (!this.f44365oc) {
            this.f44365oc = true;
            if (!this.pc && this.f44221d4 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.H1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.H1.u();
                    this.pc = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.I1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.I1.u();
                    this.pc = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    g7();
                }
            }
        }
    }

    public final void f8(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.f8(int, java.lang.Object[]):void");
    }

    public final float f9(float f7) {
        un unVar = this.f44376pa;
        if (unVar == null) {
            unVar = this;
        }
        org.telegram.ui.Components.ch chVar = unVar.Y0;
        if (chVar == null) {
            return 0.0f;
        }
        return chVar.c(f7);
    }

    public final void fb(boolean z10, le leVar) {
        ArrayList arrayList;
        int i10;
        if (this.f44468x0.V1) {
            return;
        }
        this.f44325lb = 0;
        this.f44337mb = Integer.MIN_VALUE;
        this.Z4 = 0;
        this.Mb = 0;
        this.f44181a5 = false;
        this.f44288i9.e(0);
        if (this.Q6[0] && this.T7 == 0 && this.G7 == 0) {
            this.f44442v1.d(false);
            if (this.f44493z0.I0() == 0) {
                this.f44411s9 = false;
                Ic();
                Ra();
                jd(false);
                return;
            }
            this.A0.T();
            gn gnVar = this.Ya;
            gnVar.f39717c = null;
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
            ok okVar = this.f44288i9;
            gnVar.d = i11;
            gnVar.f39718f = 0;
            boolean z11 = !z10;
            gnVar.e = z11;
            okVar.c(i11, 0, z11, true);
            this.f44411s9 = false;
            Ic();
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.Lb;
        if (e2Var != null) {
            e2Var.dismiss();
        }
        Kc(false);
        if (leVar != null) {
            leVar.run();
        } else {
            Va();
            org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, this.f44385qa);
            this.Lb = e2Var2;
            e2Var2.setOnCancelListener(this.f44490ya);
            this.Lb.r(1000L);
        }
        this.f44312k9 = this.f44272h6;
        this.f44335m9 = false;
        this.f44323l9 = 0;
        this.f44349n9 = false;
        ArrayList arrayList2 = this.f44421t6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f44272h6));
        AndroidUtilities.runOnUIThread(new kf(this, 13), 0L);
    }

    public final void fc(MessageSuggestionParams messageSuggestionParams) {
        if (this.B5 == null) {
            return;
        }
        new bi.g1(getParentActivity(), this.currentAccount, this.f44249f6, messageSuggestionParams, this, getResourceProvider(), 0, new ye(this, 0)).show();
    }

    public final void fd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        ij ijVar = this.f44327m1;
        if (ijVar != null && (tL_forumTopic = this.f44357o4) != null) {
            ijVar.setTitle(tL_forumTopic.title);
        }
        gd();
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.o1 o1Var = this.f44213c9;
        if (o1Var != null) {
            o1Var.e = false;
            H7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.e;
    }

    public final void g7() {
        org.telegram.ui.Cells.s1 s1Var;
        fi.v3 v3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        fi.v3 v3Var2 = this.J1;
        if (v3Var2 != null && !v3Var2.V && !this.f44400rc && this.f44365oc && !this.Vc.f19327f && System.currentTimeMillis() - this.f44387qc > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f44468x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f44468x0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        s1Var = (org.telegram.ui.Cells.s1) childAt;
                        bh.y0 y0Var = s1Var.N;
                        MessageObject primaryMessageObject = s1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.messageOwner) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !y0Var.v.isEmpty()) {
                            s1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + y0Var.d;
                            if (f7 >= AndroidUtilities.dp(240.0f) && f7 <= (AndroidUtilities.displaySize.y - AndroidUtilities.dp(25.0f)) - AndroidUtilities.navigationBarHeight) {
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
                bh.y0 y0Var2 = s1Var.N;
                this.f44400rc = true;
                s1Var.getLocationInWindow(iArr);
                this.J1.setTranslationY(((iArr[1] - v3Var.getTop()) - AndroidUtilities.dp(120.0f)) + y0Var2.d);
                this.J1.m(0.0f, (((bh.v0) y0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + y0Var2.f4217c);
                this.J1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(this, 20));
            AndroidUtilities.runOnUIThread(new le(this, 20), 2000L);
        }
    }

    public final void g8(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.g8(int, java.lang.Object[]):void");
    }

    public final float g9(org.telegram.ui.Components.a41 a41Var) {
        float f7;
        org.telegram.ui.Components.e41 e41Var = this.f44219d2;
        if (e41Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float k10 = e41Var.k(a41Var);
            if (a41Var == org.telegram.ui.Components.a41.f26407b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * k10;
        }
        return 0.0f;
    }

    public final void ga(long j10, String str, boolean z10) {
        ha();
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.U1(j10, str, z10, false);
        }
    }

    public final void gb(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.gb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void gc(MessageObject messageObject) {
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f44437u9 && this.f44450v9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f44437u9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.f44424t9 == null) {
                        kl klVar = new kl(getParentActivity(), this.f44385qa, this);
                        this.f44424t9 = klVar;
                        this.f44292j1.addView(klVar, org.telegram.ui.Components.gb1.h(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.f44424t9.c();
                }
            }
        }
    }

    public final void gd() {
        ij ijVar;
        ij ijVar2;
        if (UserObject.isBotForum(this.f44242f) && (ijVar2 = this.f44327m1) != null) {
            ijVar2.getAvatarImageView().setVisibility(0);
            this.f44327m1.b();
        } else if (this.f44357o4 != null && (ijVar = this.f44327m1) != null) {
            ijVar.getAvatarImageView().setVisibility(0);
            pg.d.p(this.f44327m1.getAvatarImageView(), this.f44357o4, true, true, this.f44385qa);
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e5 getBackButtonState() {
        return org.telegram.ui.ActionBar.e5.f22603a;
    }

    @Override
    public final org.telegram.ui.ActionBar.e4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.e4.f22602c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.f44221d4 == 0 && (call = this.f44287i8) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f44221d4 == 2) {
            ArrayList arrayList = this.G6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + J8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.f44385qa;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.b6 b6Var;
        org.telegram.ui.ActionBar.b6 b6Var2;
        View view;
        org.telegram.ui.Components.sz szVar;
        org.telegram.ui.Components.sz szVar2;
        org.telegram.ui.Components.sz szVar3;
        org.telegram.ui.Components.sz szVar4;
        org.telegram.ui.Components.sz szVar5;
        org.telegram.ui.Components.sz szVar6;
        org.telegram.ui.Components.sz szVar7;
        org.telegram.ui.Components.sz szVar8;
        org.telegram.ui.Components.sz szVar9;
        org.telegram.ui.Components.sz szVar10;
        org.telegram.ui.Components.sz szVar11;
        View view2;
        org.telegram.ui.Components.sz szVar12 = null;
        if (this.f44383q7) {
            return null;
        }
        int i10 = 0;
        if (this.f44336ma) {
            this.f44336ma = false;
            return null;
        }
        j6 j6Var = new j6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qd));
        J9();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.F8));
        ij ijVar = this.f44327m1;
        if (ijVar != null) {
            b6Var = ijVar.getTitleTextView();
        } else {
            b6Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(b6Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A8));
        ij ijVar2 = this.f44327m1;
        if (ijVar2 != null) {
            b6Var2 = ijVar2.getTitleTextView();
        } else {
            b6Var2 = null;
        }
        int i11 = org.telegram.ui.ActionBar.y6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(b6Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        ij ijVar3 = this.f44327m1;
        if (ijVar3 != null) {
            view = ijVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(i11, view));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.y6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23731x8));
        org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.l5 l5Var2 = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.l5 l5Var3 = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.l5 l5Var4 = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.l5 l5Var5 = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.l5 l5Var6 = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.l5 l5Var7 = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.l5 l5Var8 = (org.telegram.ui.ActionBar.l5) getThemedDrawable("drawableMsgOutMediaSelected");
        if (l5Var != null) {
            Drawable[] drawableArr = l5Var.A;
            int i13 = org.telegram.ui.ActionBar.y6.f23656ta;
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, l5Var2.A, (org.telegram.ui.ActionBar.g7) null, i13));
            Drawable[] drawableArr2 = l5Var5.A;
            int i14 = org.telegram.ui.ActionBar.y6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.g7) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, l5Var6.A, (org.telegram.ui.ActionBar.g7) null, i14));
        }
        if (!this.f44385qa.p(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var5, l5Var6}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var5, l5Var6}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var5, l5Var6}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fa));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var7, l5Var8}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23321bc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23600qc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23618rc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23340cb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23450ib));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23397fd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23467jb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23487kb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23714wb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23751yb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23733xb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23584pe));
        this.f44385qa.getClass();
        kk kkVar = this.f44220d3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i15 = org.telegram.ui.ActionBar.y6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.h7(kkVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23303ae));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23491kf));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23547nf));
        hk hkVar = this.Y;
        int i16 = org.telegram.ui.ActionBar.y6.f23527mf;
        arrayList.add(new org.telegram.ui.ActionBar.h7(hkVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23567of));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23344cf));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23399ff));
        hk hkVar2 = this.Y;
        if (hkVar2 != null) {
            szVar = hkVar2.getEmojiView();
        } else {
            szVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Ke));
        hk hkVar3 = this.Y;
        if (hkVar3 != null) {
            szVar2 = hkVar3.getEmojiView();
        } else {
            szVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar2, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Le));
        hk hkVar4 = this.Y;
        if (hkVar4 != null) {
            szVar3 = hkVar4.getEmojiView();
        } else {
            szVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar3, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Me));
        hk hkVar5 = this.Y;
        if (hkVar5 != null) {
            szVar4 = hkVar5.getEmojiView();
        } else {
            szVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar4, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Oe));
        hk hkVar6 = this.Y;
        if (hkVar6 != null) {
            szVar5 = hkVar6.getEmojiView();
        } else {
            szVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar5, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Pe));
        hk hkVar7 = this.Y;
        if (hkVar7 != null) {
            szVar6 = hkVar7.getEmojiView();
        } else {
            szVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar6, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Re));
        hk hkVar8 = this.Y;
        if (hkVar8 != null) {
            szVar7 = hkVar8.getEmojiView();
        } else {
            szVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar7, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Se));
        hk hkVar9 = this.Y;
        if (hkVar9 != null) {
            szVar8 = hkVar9.getEmojiView();
        } else {
            szVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar8, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.We));
        hk hkVar10 = this.Y;
        if (hkVar10 != null) {
            szVar9 = hkVar10.getEmojiView();
        } else {
            szVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar9, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Ne));
        hk hkVar11 = this.Y;
        if (hkVar11 != null) {
            szVar10 = hkVar11.getEmojiView();
        } else {
            szVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar10, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Je));
        hk hkVar12 = this.Y;
        if (hkVar12 != null) {
            szVar11 = hkVar12.getEmojiView();
        } else {
            szVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar11, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Ue));
        hk hkVar13 = this.Y;
        if (hkVar13 != null) {
            szVar12 = hkVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar12, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Qe));
        hk hkVar14 = this.Y;
        if (hkVar14 != null) {
            org.telegram.ui.Components.b61 trendingStickersAlert = hkVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.getThemeDescriptions());
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.Y.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wk));
        }
        for (int i17 = 0; i17 < 2; i17++) {
            if (i17 == 0) {
                view2 = this.K3;
            } else {
                view2 = this.L3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.h7(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fi));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xe));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ye));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ze));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23691v7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23672u7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23747y7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.L2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23354d6));
        NumberTextView numberTextView = this.R2;
        int i18 = org.telegram.ui.ActionBar.y6.f23398fe;
        arrayList.add(new org.telegram.ui.ActionBar.h7(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i18));
        ImageView imageView = this.f44233e3;
        int i19 = org.telegram.ui.ActionBar.y6.f23767z8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44246f3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44304k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23451ic));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44468x0, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fe));
        fi.f6 f6Var = this.Q;
        int i20 = org.telegram.ui.ActionBar.y6.f23506lc;
        arrayList.add(new org.telegram.ui.ActionBar.h7(f6Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44342n2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44304k1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i20));
        org.telegram.ui.Components.t40 t40Var = this.f44379q2;
        int i21 = org.telegram.ui.ActionBar.y6.f23602qf;
        arrayList.add(new org.telegram.ui.ActionBar.h7(t40Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f44379q2, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23585pf));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.F2, 4, new Class[]{org.telegram.ui.Components.t40.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.G2, 4, new Class[]{org.telegram.ui.Components.t40.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23482k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23680uf));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23698vf));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23306ah));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23326bh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23346ch));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23365dh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23382eh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23401fh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23454ih));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23473jh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23493kh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23418gh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23437hh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23297a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Dj));
        int i22 = org.telegram.ui.ActionBar.y6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i22));
        yh.d dVar = this.f44398ra;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(dVar.f52583g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.h7(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23362de));
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.h7) obj).f22698n = this.f44385qa;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f44385qa.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.f44385qa.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    public final void h7(boolean z10) {
        int i10;
        if (this.f44493z0 != null && !this.C5 && !this.A0.L && !this.f44395r7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f44468x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f44468x0.getChildAt(i14));
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
            if (this.f44221d4 == 7) {
                if ((h - i13) - i11 <= i16 && !this.S6 && !this.O6[0]) {
                    this.S6 = true;
                    this.f44421t6.add(Integer.valueOf(this.f44272h6));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.G3;
                    int i17 = this.classGuid;
                    int i18 = this.f44180a4;
                    int i19 = this.f44272h6;
                    this.f44272h6 = i19 + 1;
                    hashtagSearchController.searchHashtag(str, i17, i18, i19);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.cf(this, h, i13, i11, i16, 1));
        }
    }

    public final void h8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.h8(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages h9(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.J6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void ha() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            hk hkVar = this.Y;
            if (hkVar == null || TextUtils.isEmpty(hkVar.getSlowModeTimer())) {
                hk hkVar2 = this.Y;
                if (hkVar2 != null && hkVar2.f25919m5.f19327f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                L7();
                di.a3 a3Var = this.V1;
                if (!z10 && this.f44221d4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                a3Var.U1 = z11;
                a3Var.f33030j0.f0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.f44407s5 == null) && !z10 && this.f44221d4 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        this.V1.Q1(10, true);
                    } else {
                        this.V1.Q1(-1, true);
                    }
                } else {
                    this.V1.Q1(1, true);
                }
                di.a3 a3Var2 = this.V1;
                a3Var2.V0 = true;
                a3Var2.A1.setVisibility(0);
                a3Var2.T0 = 0;
                a3Var2.F = false;
                a3Var2.G = false;
                a3Var2.f33027i0 = true;
                a3Var2.J = null;
                org.telegram.ui.ActionBar.w0 w0Var = a3Var2.f33042n1;
                if (w0Var != null) {
                    a3Var2.f33038m1.setTranslationY(0.0f);
                    w0Var.setVisibility(8);
                }
                this.V1.v1();
                this.V1.r1().setText(this.Y.getFieldText());
                di.a3 a3Var3 = this.V1;
                a3Var3.f33053r = this.f44385qa;
                showDialog(a3Var3);
            }
        }
    }

    public final void hb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.hb(java.lang.CharSequence, boolean):void");
    }

    public final void hc(boolean z10, boolean z11) {
        hk hkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.E2 != null) && this.f44221d4 == 0 && (hkVar = this.Y) != null && hkVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.E2 == null) {
                    mm mmVar = this.f44292j1;
                    int indexOfChild = mmVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(9, getParentActivity(), this.f44385qa, false);
                        this.E2 = t40Var;
                        mmVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.E2.b(true);
                    return;
                }
                if (this.Y.f25870e2) {
                    org.telegram.ui.Components.t40 t40Var2 = this.E2;
                    if (z11) {
                        i10 = R.string.HoldToVideo;
                    } else {
                        i10 = R.string.HoldToAudio;
                    }
                    t40Var2.setText(LocaleController.getString(i10));
                } else {
                    this.E2.setText(LocaleController.getString(R.string.HoldToAudioOnly));
                }
                this.E2.f(this.Y.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void hd() {
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var = this.f44316l0;
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

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.f44295j4;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f44242f;
    }

    public final void i7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.D8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.D8 = true;
            org.telegram.ui.Components.g5.r0(getParentActivity(), this.currentAccount, new le(this, 10), true, this.f44385qa);
        }
    }

    public final void i8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.i8(int, java.lang.Object[]):void");
    }

    public final void i9(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.f44221d4 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.H3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.f44180a4);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j10 = this.f44249f6;
        long j11 = this.X6;
        int i14 = this.classGuid;
        boolean z11 = this.f44215cb;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j10, j11, i14, i10, this.f44370p4, this.A3, this.B3, this.C3);
        Xb(false);
    }

    public final void ia() {
        ft.o().T = null;
        if (getParentActivity() == null) {
            return;
        }
        L7();
        this.V1.f33030j0.f0();
        this.V1.Q1(1, false);
        di.a3 a3Var = this.V1;
        a3Var.X1 = true;
        a3Var.n1(null);
        this.V1.v1();
        di.a3 a3Var2 = this.V1;
        a3Var2.f33053r = this.f44385qa;
        if (this.visibleDialog != null) {
            a3Var2.show();
        } else {
            showDialog(a3Var2);
        }
    }

    public final void ib(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.A3 = user;
        this.B3 = chat;
        if (this.f44291j0 != null && this.U1 != null) {
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
                    this.f44496z3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a1.g.D(string, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.B8, getResourceProvider()), string.length() + 1, spannableString.length(), 33);
                    this.f44291j0.setSearchFieldCaption(spannableString);
                    this.U1.getAdapter().U(null, 0, null, false, true);
                    this.f44291j0.setSearchFieldHint(null);
                    this.f44291j0.n();
                    MediaDataController mediaDataController = getMediaDataController();
                    this.F3 = "";
                    mediaDataController.searchMessagesInChat("", this.f44249f6, this.X6, this.classGuid, 0, this.f44370p4, this.A3, this.B3, this.C3);
                }
            }
        }
    }

    public final boolean ic(MessageObject messageObject) {
        if (this.f44221d4 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void id(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        oj ojVar = this.f44468x0;
        if (ojVar != null) {
            if (!this.P4 && this.V7 != null) {
                int childCount = ojVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f44468x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.V7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.G6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.V7) + this.A0.J;
                                i11 = V8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f44468x0.getChildCount();
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f44468x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                    MessageObject messageObject3 = s1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        s1Var.Z3(messageObject3, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        fm fmVar = this.A0;
                        this.f44468x0.getClass();
                        fmVar.Q(RecyclerView.R(s1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f44493z0.h1(i10, i11);
            }
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (J9()) {
            org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.e(org.telegram.ui.ActionBar.y6.f23711w8);
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23711w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.y6.I.q();
        } else {
            z10 = this.Zb;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.f44221d4 != 5 || (!this.G6.isEmpty() && this.f44370p4 != 0)) && !this.Vc.f19327f && this.f44502z9) {
            cl clVar = this.Ra;
            if (clVar == null || !clVar.f30960s) {
                wh.i iVar = this.ja;
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
        gb(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final void j7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        hk hkVar = this.Y;
        if (hkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.f44249f6, (int) b());
            oe.b bVar = hkVar.f25914l5;
            jh.h hVar = hkVar.I0;
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
            ((oe.b) hVar.f15956c).a(z12, z13);
            hVar.setClickable(z12);
            hVar.setEnabled(z12);
            if (bVar.f19327f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            hkVar.T4 = streamingSendButtonState;
            if (z14) {
                hkVar.G(z10);
            }
        }
    }

    public final void j8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.j8(java.lang.Object[]):void");
    }

    public final void j9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.j9():void");
    }

    public final void ja(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.s1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.ja(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.s1, org.telegram.messenger.MessageObject):void");
    }

    public final void jb(View view, MessageObject messageObject, org.telegram.ui.Components.fl0 fl0Var, View view2, float f7, float f10, bh.x0 x0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        String str;
        int i10;
        TLRPC.Document f11;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.z zVar;
        bi.m7 m7Var;
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
            if (x0Var != null && x0Var.f4205a) {
                H7(true);
                if (view == null) {
                    zVar = x8(messageObject.getId(), true);
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
                    long j10 = -bi.v9.b(messageObject).f5571a;
                    TLRPC.ChatFull chatFull = getMessagesController().getChatFull(j10);
                    if (chatFull != null && !chatFull.paid_reactions_available && (arrayList2 == null || arrayList2.isEmpty())) {
                        TLRPC.Chat chat2 = getMessagesController().getChat(Long.valueOf(j10));
                        org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(this);
                        int i13 = R.raw.stars_topup;
                        int i14 = R.string.StarsReactionsDisabled;
                        if (chat2 != null) {
                            str2 = chat2.title;
                        }
                        b02.R(i13, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i14, str2))).k(true);
                        return;
                    }
                    bi.aa aaVar = bi.ca.y(this.currentAccount, false).B;
                    if (aaVar != null) {
                        aaVar.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i15 = this.currentAccount;
                    long j11 = this.f44249f6;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    bi.be beVar = new bi.be(parentActivity, i15, j11, this, messageObject, arrayList2, z14, false, 0L, this.f44385qa);
                    messageObject.getId();
                    beVar.V = this;
                    beVar.W = zVar;
                    beVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -bi.v9.b(messageObject).f5571a;
                TLRPC.ChatFull chatFull2 = getMessagesController().getChatFull(j12);
                if (chatFull2 != null && !chatFull2.paid_reactions_available) {
                    TLRPC.Chat chat3 = getMessagesController().getChat(Long.valueOf(j12));
                    org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(this);
                    int i16 = R.raw.stars_topup;
                    int i17 = R.string.StarsReactionsDisabled;
                    if (chat3 != null) {
                        str2 = chat3.title;
                    }
                    b03.R(i16, 36, AndroidUtilities.replaceTags(LocaleController.formatString(i17, str2))).k(true);
                    return;
                }
                bi.aa d02 = bi.ca.y(this.currentAccount, false).d0(messageObject, this, 1L, true, true, null);
                if (d02 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Mc == null) {
                        this.Mc = new bi.m7(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        m7Var = null;
                    } else {
                        if (this.Mc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.Mc);
                            layoutContainer.addView(this.Mc, org.telegram.ui.Components.gb1.g(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Mc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Mc.bringToFront();
                        }
                        m7Var = this.Mc;
                    }
                    m7Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    d02.f4281o = m7Var;
                    m7Var.I = false;
                    m7Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    m7Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f7;
                    float f13 = (iArr[1] - iArr2[1]) + f10;
                    if (zVar instanceof org.telegram.ui.Cells.s1) {
                        i12 = ((org.telegram.ui.Cells.s1) zVar).V;
                    } else {
                        i12 = 0;
                    }
                    m7Var.d(f12, f13 + i12, false);
                    return;
                }
                return;
            }
            bh.x0 x0Var2 = null;
            if (a() == getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (message = messageObject.messageOwner) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new tg.y0((org.telegram.ui.ActionBar.r2) this, 24, true).show();
            } else if (!messageObject.hasChosenReaction(x0Var) && (chat = this.e) != null && !ChatObject.isChannelAndNotMegaGroup(chat) && !ChatObject.canUserDoAction(this.e, 26)) {
                org.telegram.messenger.t.q(R.string.SendReactionsIsRestrictedInThisChat, org.telegram.ui.Components.wc.b0(this), R.raw.e_hand_2, 36);
            } else {
                bh.s0.b(false);
                int size = messageObject.getChoosenReactions().size();
                boolean selectReaction = messageObject.selectReaction(x0Var, z11, z10);
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
                    org.telegram.ui.Cells.z x82 = x8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && x82 != null && x0Var != null && !getUserConfig().isPremium() && size == 1) {
                        SharedConfig.setMultipleReactionsPromoShowed(true);
                        long j13 = x0Var.f4209g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = MediaDataController.getInstance(this.currentAccount).getReactionsMap().get(x0Var.f4208f);
                            if (tL_availableReaction != null) {
                                f11 = tL_availableReaction.center_icon;
                            }
                        } else {
                            f11 = org.telegram.ui.Components.t5.f(this.currentAccount, j13);
                        }
                        if (f11 != null) {
                            org.telegram.ui.Components.qc q5 = org.telegram.ui.Components.wc.b0(this).q(f11, LocaleController.getString(R.string.ChatMultipleReactionsPromo));
                            q5.f31887j = 5000;
                            q5.j();
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
                        bh.s0.d(this, fl0Var, x82, view2, f7, f10, x0Var, i19, i10);
                    }
                }
                if (selectReaction && x0Var != null && (str = x0Var.f4208f) != null) {
                    AndroidUtilities.makeAccessibilityAnnouncement(LocaleController.formatString(R.string.AccDescrYouReactedWith, str));
                }
                ArrayList<bh.x0> arrayList3 = new ArrayList<>();
                arrayList3.addAll(messageObject.getChoosenReactions());
                SendMessagesHelper sendMessagesHelper = getSendMessagesHelper();
                if (selectReaction) {
                    x0Var2 = x0Var;
                }
                oi oiVar = new oi(this, z13, z10, i18, selectReaction, fl0Var, f7, f10, x0Var, messageObject);
                this.f44492yc = oiVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, x0Var2, z11, z12, this, oiVar);
                if (z10 || z13) {
                    Dc(messageObject, true);
                    this.f44492yc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.f44492yc, 50L);
                }
            }
        }
    }

    public final void jc(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            bh.x xVar = this.f44313ka;
            if (xVar != null && xVar.d()) {
                this.f44313ka.setHiddenByScroll(true);
            }
            if (this.f44291j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f22772n0) {
                    kVar.g(true);
                    this.Y.b1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                li.b2 b2Var = new li.b2(richMessage);
                b2Var.J = this;
                b2Var.f17140r = messageObject;
                presentFragment(b2Var);
                return;
            }
            this.U1.getAdapter().f14117f0 = false;
            this.Y.setVisibility(0);
            Lb(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            uc(false);
            if (!z10) {
                U6();
            }
            if (z10) {
                this.f44407s5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.S0(false, false, true);
            Lc(0, true);
            jd(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.f44221d4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.f44249f6);
                tL_messages_getMessageEditData.f22119id = messageObject.getId();
                this.A5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new oe(this, 3));
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

    public final void jd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.jd(boolean):void");
    }

    public final void k7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.k7():void");
    }

    public final void k8(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && m7()) {
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.f44249f6, this.f44498z5, this.f44295j4, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = L8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.f44249f6, this.f44498z5, this.f44295j4, null, this.f44473x5, z10, i10, 0, L8(), 0L, X8());
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
                s8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.f44249f6, this.f44498z5, this.f44295j4, null, this.f44473x5, false, true, this.B5, z10, i10, 0, this.f44221d4, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, L8(), 0L, false, 0L, X8(), this.f44407s5);
                D6();
                if (i10 != 0) {
                    if (this.f44234e4 == -1) {
                        this.f44234e4 = 0;
                    }
                    this.f44234e4 = arrayList.size() + this.f44234e4;
                    Rc(true);
                }
            }
        }
    }

    public final boolean k9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f44285i6;
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

    public final void ka(long j10, final MessageObject messageObject, int i10, final long j11, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f22027id + " msg_id = " + i13);
        }
        this.Ec = 0;
        this.Fc = false;
        this.Hc = null;
        this.Ic = null;
        oj ojVar = this.f44468x0;
        if (ojVar != null) {
            ojVar.g1();
        }
        if (this.Dc != -1) {
            getConnectionsManager().cancelRequest(this.Dc, false);
        }
        if (this.Cc != -1) {
            getConnectionsManager().cancelRequest(this.Cc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.Ec = i13;
        this.Fc = false;
        this.Gc = System.currentTimeMillis();
        oj ojVar2 = this.f44468x0;
        if (ojVar2 != null) {
            ojVar2.g1();
        }
        final int i14 = this.Ac + 1;
        this.Ac = i14;
        this.Cc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                un unVar = un.this;
                AndroidUtilities.runOnUIThread(new ed(10, unVar, new Runnable(i14, i11, j11, tLObject, i12, messageObject2, tL_messages_getDiscussionMessage, chat, messageObject) {
                    public final int f38090b;
                    public final int f38091c;
                    public final TLObject d;
                    public final int e;
                    public final MessageObject f38092f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f38093n;
                    public final MessageObject f38094r;

                    {
                        this.d = tLObject;
                        this.e = r7;
                        this.f38092f = r8;
                        this.h = r9;
                        this.f38093n = r10;
                        this.f38094r = r11;
                    }

                    @Override
                    public final void run() {
                        int i15;
                        final un unVar2 = un.this;
                        if (this.f38090b != unVar2.Ac) {
                            return;
                        }
                        unVar2.Cc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            unVar2.Hc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            unVar2.getMessagesController().putUsers(unVar2.Hc.users, false);
                            unVar2.getMessagesController().putChats(unVar2.Hc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = unVar2.Hc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i16 = 0; i16 < unVar2.Hc.messages.size(); i16++) {
                                TLRPC.Message message = unVar2.Hc.messages.get(i16);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i17 = this.f38091c;
                        final int i18 = this.e;
                        final MessageObject messageObject3 = this.f38092f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = this.h;
                        final TLRPC.Chat chat2 = this.f38093n;
                        final MessageObject messageObject4 = this.f38094r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = unVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f22048id;
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
                            final int i19 = unVar2.Bc + 1;
                            unVar2.Bc = i19;
                            unVar2.Dc = unVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new lh(un.this, i19, tLObject3, tL_error2, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4, 0));
                                }
                            });
                            return;
                        }
                        unVar2.Ha(unVar2.Hc, unVar2.Ic, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, i18, messageObject4);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Cc, this.classGuid);
    }

    public final void kb() {
        k6.c[] cVarArr;
        kh.b bVar;
        kh.a aVar;
        org.telegram.ui.Components.od[] odVarArr;
        cj cjVar = this.f44453w;
        if (cjVar != null) {
            cjVar.c();
        }
        cj cjVar2 = this.f44467x;
        if (cjVar2 != null) {
            cjVar2.c();
        }
        hk hkVar = this.Y;
        if (hkVar != null) {
            hkVar.updateColors();
        }
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.h1();
        }
        oj ojVar = this.f44468x0;
        if (ojVar != null) {
            int childCount = ojVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f44468x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) childAt).s1(0);
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.o1 o1Var = this.f44213c9;
        if (o1Var != null && o1Var.getContentView() != null) {
            View contentView = this.f44213c9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.tg0 tg0Var = this.L2;
        if (tg0Var != null) {
            tg0Var.d();
        }
        ik ikVar = this.Z;
        if (ikVar != null && ikVar.getEditView() != null) {
            for (org.telegram.ui.Components.od odVar : this.Z.getEditView().f30964a) {
                if (odVar != null) {
                    odVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f44266h0;
        if (w0Var != null) {
            w0Var.V();
        }
        bk bkVar = this.f44293j2;
        if (bkVar != null) {
            bkVar.updateColors();
        }
        ij ijVar = this.f44327m1;
        if (ijVar != null) {
            ijVar.updateColors();
        }
        mm mmVar = this.f44292j1;
        if (mmVar != null) {
            mmVar.M();
            bi.cc ccVar = this.f44292j1.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
        org.telegram.ui.Components.ch chVar = this.Y0;
        if (chVar != null) {
            eh.d dVar = chVar.f27152s;
            if (dVar != null) {
                dVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23354d6, false));
            chVar.invalidate();
        }
        org.telegram.ui.Components.tz0 tz0Var = this.f44367p1;
        if (tz0Var != null) {
            tz0Var.updateColors();
        }
        ij ijVar2 = this.f44327m1;
        if (ijVar2 != null && ijVar2.getTimeItem() != null) {
            this.f44327m1.getTimeItem().invalidate();
        }
        jh.f fVar = this.S;
        if (fVar != null) {
            fVar.updateColors();
        }
        lh.h hVar = this.f44442v1;
        if (hVar != null) {
            for (k6.c cVar : hVar.e) {
                if (cVar != null && (aVar = (bVar = (kh.b) cVar.f16406b).f16654b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        lk lkVar = this.f44178a1;
        if (lkVar != null) {
            lkVar.updateColors();
        }
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((eh.d) it.next()).updateColors();
        }
        this.f44292j1.invalidate();
        Iterator it2 = this.f44480y.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void kc() {
        org.telegram.ui.Components.z00 z00Var = this.f44489y9;
        if (z00Var != null && !z00Var.f35161c) {
            z00Var.c(false);
            try {
                this.f44489y9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2 = null;
        s8(str, null);
        if (m7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.f44249f6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = L8();
                of2.invert_media = z11;
                of2.payStars = j11;
                of2.monoForumPeer = X8();
                of2.suggestionParams = this.f44407s5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.f44249f6, false, false, true, 0, 0, null, -1, j11, X8(), this.f44407s5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.f44249f6, this.f44498z5, this.f44295j4, null, this.f44473x5, this.B5, z10, i10, 0, null, L8(), j10, z11, j11, X8(), this.f44407s5);
            D6();
        }
    }

    public final boolean l7(View view) {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer != null) {
            ec(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void l8(View view) {
        m8(view, false);
    }

    public final boolean l9() {
        nm nmVar = this.f44362o9;
        if (nmVar != null && nmVar.x()) {
            return true;
        }
        return false;
    }

    public final void la(boolean z10) {
        String string;
        if (!H9() && !k9()) {
            int i10 = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f44285i6;
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
            bh.x xVar = this.f44313ka;
            if (xVar != null && xVar.d()) {
                this.f44313ka.setHiddenByScroll(true);
            }
            Bundle c10 = org.telegram.messenger.vh.c(3, "onlySelect", "dialogsType", true);
            c10.putInt("messagesCount", this.f44359o6);
            c10.putInt("hasPoll", i10);
            c10.putBoolean("hasInvoice", z11);
            c10.putBoolean("canSelectTopics", true);
            cy cyVar = new cy(c10);
            cyVar.C2 = this;
            presentFragment(cyVar);
            return;
        }
        if (H9()) {
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
            if (this.f44456w2 == null) {
                mm mmVar = this.f44292j1;
                int indexOfChild = mmVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(7, getParentActivity(), null, true);
                    this.f44456w2 = t40Var;
                    mmVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f44456w2.setAlpha(0.0f);
                    this.f44456w2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f44456w2.setText(string);
            this.f44456w2.f(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.f44470x2 == null) {
            mm mmVar2 = this.f44292j1;
            int indexOfChild2 = mmVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(getParentActivity(), 9);
            this.f44470x2 = t40Var2;
            mmVar2.addView(t40Var2, indexOfChild2 + 1, org.telegram.ui.Components.gb1.h(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f44470x2.setAlpha(0.0f);
            this.f44470x2.setVisibility(4);
        }
        this.f44470x2.setText(string);
        this.f44470x2.f(this.f44191b1.getForwardButton(), true);
    }

    public final void lb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f22033id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.f44249f6, this.f44498z5, this.f44295j4, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = L8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        D6();
    }

    public final void lc() {
        long j10;
        le leVar = this.f44262g8;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
        }
        le leVar2 = new le(this, 16);
        this.f44262g8 = leVar2;
        if (this.f44198b8 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(leVar2, j10);
    }

    @Override
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        s8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.f44249f6, this.f44498z5, this.f44295j4, null, this.f44473x5, true, false, this.B5, z10, i10, 0, this.f44221d4, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, L8(), 0L, false, j10, X8(), this.f44407s5);
        D6();
        if (i10 != 0) {
            if (this.f44234e4 == -1) {
                this.f44234e4 = 0;
            }
            this.f44234e4 = arrayList.size() + this.f44234e4;
            Rc(true);
        }
    }

    public final boolean m7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22366a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void m8(View view, boolean z10) {
        boolean z11;
        zb(view);
        if (view != this.f44442v1) {
            z11 = true;
        } else {
            z11 = false;
        }
        n8(z10, z11, 0.2f);
    }

    public final void m9() {
        org.telegram.ui.Components.ju editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.q()) {
                this.Yc.h(5, false, true);
                this.actionBar.p();
            } else {
                return;
            }
        }
        this.f44332m6 = 0;
        this.f44372p6 = 0;
        this.f44346n6 = 0;
        this.r6 = 0;
        this.f44408s6 = 0;
        this.f44382q6 = 0;
        hk hkVar = this.Y;
        if (hkVar != null && (editField = hkVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        nm nmVar = this.f44362o9;
        if (nmVar != null) {
            nmVar.f(true);
            SparseArray sparseArray = this.f44362o9.f25457p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        kl klVar = this.f44424t9;
        if (klVar != null) {
            AndroidUtilities.cancelRunOnUIThread(klVar.H);
            klVar.a();
        }
        hk hkVar2 = this.Y;
        if (hkVar2 != null) {
            hkVar2.f25843a0 = false;
        }
        this.f44437u9 = false;
        if (this.f44465wb != null) {
            u9();
        }
    }

    public final void ma(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f44394r5;
        if (messagePreviewParams != null && this.Ra == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.S5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.f44498z5;
                if (messageObject2 == this.f44295j4) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.f44473x5, this.B5);
            }
            if (!this.f44394r5.isEmpty()) {
                this.Ab = this.Y.f25990z2;
                Context context = this.f44292j1.getContext();
                ch.b bVar = this.M8;
                MessagePreviewParams messagePreviewParams2 = this.f44394r5;
                TLRPC.User user = this.f44242f;
                TLRPC.Chat chat = this.e;
                int i12 = this.currentAccount;
                sn snVar = this.f44385qa;
                kn knVar = this.f44473x5;
                if (knVar != null && knVar.f40979f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                cl clVar = new cl(this, context, this, bVar, messagePreviewParams2, user, chat, i12, snVar, i10, z10);
                this.Ra = clVar;
                this.f44394r5.attach(clVar);
                TLRPC.ChatFull chatFull = this.f44322l8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.f44425ta) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.f44425ta.peers.get(0).peer;
                }
                this.Ra.setSendAsPeer(peer);
                k7();
                this.f44292j1.addView(this.Ra);
                if (this.Ab) {
                    hk hkVar = this.Y;
                    hkVar.T0 = true;
                    org.telegram.ui.Components.dg dgVar = hkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(true);
                    }
                    this.Y.p1();
                    this.P3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void mb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j10) {
        long j11;
        String str;
        zj zjVar = this.U1;
        if (zjVar == null) {
            return;
        }
        TLRPC.User user = zjVar.getAdapter().f14137w0;
        if (user != null) {
            j11 = user.f22174id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f22025id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.U1.getAdapter().f14137w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.f44249f6, this.f44498z5, this.f44295j4, null, this.f44473x5, z10, i10, 0, L8(), j10, X8());
        this.Y.setFieldText("");
        o9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void mc() {
        AndroidUtilities.forEachViews((RecyclerView) this.f44468x0, (Utilities.Callback<View>) new bi.t8(5, this, B9()));
    }

    @Override
    public final boolean n() {
        return this.D9;
    }

    public final void n7(Runnable runnable, bg.a aVar, boolean z10) {
        if (aVar != null && z10) {
            q1 q1Var = new q1(this, aVar, runnable, 19);
            bi.ca x9 = bi.ca.x(this.currentAccount, aVar.f3978a);
            if (!x9.e) {
                x9.q(true, true, q1Var);
                return;
            } else {
                q1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void n8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        lh.h hVar;
        org.telegram.ui.Cells.s1 s1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.V8;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            s1Var2.setInvalidatesParent(z12);
            if (z12) {
                Wa(s1Var2);
            }
        }
        this.f44292j1.invalidate();
        this.f44468x0.invalidate();
        AnimatorSet animatorSet = this.f44199b9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f44199b9.cancel();
        }
        this.f44199b9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.T8, f7);
        float f10 = 1.0f;
        if (z12) {
            this.W8 = 1.0f;
            this.X8 = 0.0f;
            ValueAnimator valueAnimator = this.f44479xc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.U8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.hn0.d(new we(this, 3));
            }
        } else {
            float f11 = this.T8;
            this.X8 = f11 / max;
            this.U8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new dg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f44442v1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.f44199b9.playTogether(arrayList);
        this.f44199b9.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f44199b9.setDuration(320L);
        View view2 = this.V8;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            s1Var = (org.telegram.ui.Cells.s1) view2;
        } else {
            s1Var = null;
        }
        this.f44199b9.addListener(new ai.l0(this, z12, s1Var, 6));
        if (this.V8 != null && this.W8 <= 0.0f) {
            zb(null);
        }
        this.f44199b9.start();
    }

    public final void n9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.b0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Oa(this.f44371p5);
            Qa(this.f44371p5);
            return;
        }
        showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) this, 3, true));
    }

    public final void na(String str, boolean z10) {
        boolean z11;
        ek ekVar;
        boolean z12;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                T7();
                fi.v3 v3Var = this.H1;
                if (v3Var != null && v3Var.V) {
                    v3Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                fi.v3 v3Var2 = this.I1;
                if (v3Var2 != null && v3Var2.V) {
                    v3Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    AndroidUtilities.runOnUIThread(new se(this, str, 5), 200L);
                    return;
                }
                this.G3 = str;
                this.F3 = str;
                boolean contains = str.contains("@");
                Y6(true);
                if (!this.actionBar.f22772n0) {
                    this.Wc.a(true, true);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f44266h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar = this.f44230e0;
                    if (yVar != null) {
                        yVar.f(8);
                    }
                    yr yrVar = this.f44217d0;
                    if (yrVar != null) {
                        yrVar.b(false);
                    }
                    org.telegram.ui.ActionBar.y yVar2 = this.f44279i0;
                    if (yVar2 != null) {
                        yVar2.f(8);
                    }
                    if ((this.f44370p4 == 0 || (i10 = this.f44221d4) == 3 || i10 == 8) && (w0Var = this.f44291j0) != null) {
                        w0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
                    if (w0Var3 != null && this.W9) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar3 = this.f44340n0;
                    if (yVar3 != null && this.X9) {
                        yVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.f44303k0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    this.f44353o0 = true;
                    Sc(0, 0, -1);
                    uc(false);
                }
                sk skVar = this.A1;
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
                ImageView imageView = this.f44246f3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.e) || !ChatObject.isPublic(this.e) || this.G3 == null)) {
                    this.D1 = 0;
                } else {
                    this.D1 = 2;
                }
                this.f44284i5 = false;
                if (this.f44180a4 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                fi.h1 h1Var = this.C1;
                if (h1Var != null) {
                    h1Var.h.clear();
                }
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f44291j0;
                if (w0Var5 != null) {
                    this.zc = true;
                    w0Var5.F(false);
                    this.zc = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = this.f44291j0;
                if (w0Var6 != null) {
                    w0Var6.setSearchFieldCaption(null);
                    this.f44291j0.P(str, false);
                    this.f44291j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.F3, this.f44249f6, this.X6, this.classGuid, 0, this.f44370p4, false, this.A3, this.B3, false, this.C3);
                Lc(0, true);
                this.f44368p2.e(true, true);
                Xb(true);
                ek ekVar2 = this.B1;
                if (ekVar2 != null) {
                    ekVar2.b(!contains);
                    Uc();
                }
                if ((contains || z10) && this.G3 != null && (ekVar = this.B1) != null) {
                    int currentPosition = ekVar.f28281a.getCurrentPosition();
                    int i11 = this.D1;
                    if (currentPosition != i11) {
                        this.B1.f28281a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.G3);
                this.F1.f31153f.O(true);
                View currentView = this.C1.getCurrentView();
                if (currentView instanceof wn) {
                    ((wn) currentView).f45518a.Wc(this.G3);
                }
            }
        }
    }

    public final void nb(ClipData clipData, boolean z10, int i10) {
        int i11 = 0;
        if (this.B5 != null) {
            while (i11 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i11).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    rb(i10, arrayList, z10);
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
        rb(i10, arrayList2, z10);
    }

    public final void nc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.f44249f6, b())) {
            if (z10) {
                getNotificationsController().muteDialog(this.f44249f6, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.k3 E = org.telegram.ui.Components.g5.E(this.f44249f6, b(), this, this.f44385qa);
            E.setCalcMandatoryInsets(F9());
            showDialog(E);
            return;
        }
        getNotificationsController().muteDialog(this.f44249f6, b(), false);
        if (!z10) {
            org.telegram.ui.Components.wc.z(this, 4, 0, this.f44385qa).j();
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f44221d4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((r2Var instanceof un) && ((un) r2Var).F9()) {
                return false;
            }
        }
        if (this.T6 && !this.f44301jb) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.po o() {
        return this.f44327m1;
    }

    public final void o7() {
        if (this.L3 != null) {
            return;
        }
        dl dlVar = new dl(this, getParentActivity(), this, this.f44385qa);
        this.L3 = dlVar;
        this.f44292j1.addView(dlVar, 17, org.telegram.ui.Components.gb1.h(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void o8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void o9(boolean z10) {
        Kb(false, null, null, null, true, 0, null, false, 0L, z10);
    }

    public final boolean oa(String str, org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, int i10, int i11) {
        hi.v4 v4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.e == null || str == null || this.f44221d4 != 0) {
            return false;
        }
        if (s1Var != null && (characterStyle != null || i11 != 1)) {
            v4Var = new hi.v4(this, i10, i11, characterStyle, s1Var);
        } else {
            v4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (ChatObject.getPublicUsername(this.e) != null) {
                try {
                    if (ed == null) {
                        ed = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f44171fd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = ed.matcher(str);
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
                                byte[] g7 = sh.f.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (ChatObject.isForum(this.e) && i12 != b()) {
                                        return false;
                                    }
                                    this.F7 = true;
                                    if (this.f44221d4 == 2) {
                                        this.f44275h9.Q0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.K7 = W;
                                    if (W >= 0) {
                                        this.L7 = parseInt;
                                    }
                                    gb(parseInt, i10, true, 0, false, 0, num, g7, v4Var);
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
                        Matcher matcher2 = f44171fd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f44410s8 = queryParameter2;
                                    V6(true);
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
                    if (ChatObject.hasPublicLink(this.e, lowerCase) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f44221d4 == 2) {
                            this.f44275h9.Q0(intValue3);
                            finishFragment();
                            return true;
                        }
                        gb(intValue3, i10, true, 0, false, 0, null, null, v4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
            } else {
                try {
                    if (f44172gd == null) {
                        f44172gd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f44172gd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.e.f22027id || parseInt3 == 0) {
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
                    byte[] g10 = sh.f.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (ChatObject.isForum(this.e) && (findTopic = getMessagesController().getTopicsController().findTopic(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f44357o4;
                            if (tL_forumTopic != null && tL_forumTopic.f22079id == findTopic.f22079id) {
                                return true;
                            }
                            return false;
                        }
                        this.F7 = true;
                        if (this.f44221d4 == 2) {
                            this.f44275h9.Q0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        gb(parseInt3, i10, true, 0, false, 0, num2, g10, v4Var);
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
            long j10 = this.e.f22027id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                ka(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.F7 = true;
            if (this.f44221d4 == 2) {
                this.f44275h9.Q0(intValue9);
                finishFragment();
                return true;
            }
            gb(intValue9, i10, true, 0, false, 0, null, null, v4Var);
            return true;
        }
    }

    public final void ob(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        long j11;
        if (m7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.f44249f6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = L8();
                of2.effect_id = j10;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = X8();
                of2.suggestionParams = this.f44407s5;
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
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.f44249f6, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = L8();
                of3.effect_id = j11;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = X8();
                of3.suggestionParams = this.f44407s5;
                getSendMessagesHelper().sendMessage(of3);
                j11 = 0;
            }
            D6();
        }
    }

    public final void oc(org.telegram.ui.ActionBar.u0 u0Var, boolean z10) {
        Set set;
        if (u0Var != null) {
            if (z10) {
                set = this.S0;
            } else {
                set = this.R0;
            }
            set.add(u0Var);
        }
    }

    @Override
    public final void onActivityResultFragment(int i10, int i11, final Intent intent) {
        di.a3 a3Var;
        org.telegram.ui.Components.go goVar;
        String str;
        di.a3 a3Var2;
        if (i11 == -1) {
            Uri uri = null;
            if (i10 != 0 && i10 != 2) {
                if (i10 == 21 && (a3Var2 = this.V1) != null) {
                    org.telegram.ui.Components.li liVar = a3Var2.B0;
                    if (liVar instanceof li.q) {
                        li.q qVar = (li.q) liVar;
                        if (intent != null && intent.getData() != null) {
                            li.v3 v3Var = qVar.f17418r;
                            Uri data = intent.getData();
                            if (data == null) {
                                v3Var.getClass();
                                return;
                            } else if (v3Var.getContext() != null) {
                                Utilities.globalQueue.postRunnable(new k2.e0(3, v3Var, data));
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
                        di.a3 a3Var3 = this.V1;
                        if (a3Var3 != null) {
                            org.telegram.ui.Components.li liVar2 = a3Var3.B0;
                            if (liVar2 instanceof li.q) {
                                li.q qVar2 = (li.q) liVar2;
                                if (intent.getData() != null) {
                                    qVar2.f17418r.k2(intent.getData());
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
                                Eb();
                            }
                            if (this.C5) {
                                this.E8 = str;
                            } else {
                                ya(null, str);
                            }
                        } else if (this.B5 == null && this.f44221d4 == 1) {
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.f44249f6, new m4.s0(13, this, data2), this.f44385qa);
                        } else {
                            s8(null, null);
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.f44249f6, this.f44498z5, this.f44295j4, this.f44473x5, null, null, null, null, 0, this.B5, true, 0, this.f44221d4, L8());
                        }
                        D6();
                        return;
                    }
                    Eb();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        Eb();
                        return;
                    }
                    if (this.B5 == null && this.f44221d4 == 1) {
                        if (intent.getData() != null) {
                            di.a3 a3Var4 = this.V1;
                            if (a3Var4 != null) {
                                a3Var4.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.f44249f6, new org.telegram.ui.Components.e5(this) {
                                public final un f41537b;

                                {
                                    this.f41537b = this;
                                }

                                @Override
                                public final void G(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            un unVar = this.f41537b;
                                            unVar.s8(null, null);
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                unVar.rb(i12, arrayList, z10);
                                            }
                                            unVar.D6();
                                            return;
                                        default:
                                            un unVar2 = this.f41537b;
                                            unVar2.s8(null, null);
                                            unVar2.nb(intent.getClipData(), z10, i12);
                                            unVar2.D6();
                                            return;
                                    }
                                }
                            }, this.f44385qa);
                            return;
                        } else if (intent.getClipData() != null) {
                            di.a3 a3Var5 = this.V1;
                            if (a3Var5 != null) {
                                a3Var5.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.f44249f6, new org.telegram.ui.Components.e5(this) {
                                public final un f41537b;

                                {
                                    this.f41537b = this;
                                }

                                @Override
                                public final void G(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            un unVar = this.f41537b;
                                            unVar.s8(null, null);
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                unVar.rb(i12, arrayList, z10);
                                            }
                                            unVar.D6();
                                            return;
                                        default:
                                            un unVar2 = this.f41537b;
                                            unVar2.s8(null, null);
                                            unVar2.nb(intent.getClipData(), z10, i12);
                                            unVar2.D6();
                                            return;
                                    }
                                }
                            }, this.f44385qa);
                            return;
                        } else {
                            Eb();
                        }
                    } else {
                        s8(null, null);
                        if (intent.getData() != null) {
                            Uri data3 = intent.getData();
                            if (data3 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(data3);
                                rb(0, arrayList, true);
                            }
                        } else if (intent.getClipData() != null) {
                            nb(intent.getClipData(), true, 0);
                        } else {
                            Eb();
                        }
                    }
                    di.a3 a3Var6 = this.V1;
                    if (a3Var6 != null) {
                        a3Var6.dismiss();
                    }
                    D6();
                    return;
                } else if (i10 == 28 && (a3Var = this.V1) != null && (goVar = a3Var.m0) != null) {
                    org.telegram.ui.ActionBar.u6 u6Var = goVar.f30212a;
                    if (goVar.l1 != -1 && goVar.f28633k1 != null) {
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
                            org.telegram.messenger.vh.n(R.string.UnsupportedAttachment, new org.telegram.ui.Components.wc(goVar.f30213b.container, u6Var), u6Var);
                            return;
                        }
                        goVar.h0(goVar.l1, new th.c(uri));
                        org.telegram.ui.Components.nn nnVar = goVar.f28633k1;
                        if (nnVar != null) {
                            nnVar.dismiss(true);
                            return;
                        }
                        return;
                    }
                    return;
                } else {
                    return;
                }
            }
            L7();
            di.a3 a3Var7 = this.V1;
            if (a3Var7 != null) {
                a3Var7.f33030j0.g0(i10, intent, this.f44274h8);
            }
            this.f44274h8 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.t60 t60Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.Components.pf pfVar;
        org.telegram.ui.Components.nf nfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        nm nmVar;
        bh.w wVar;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
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
        c41 c41Var = this.f44324la;
        if (c41Var != null && !c41Var.f38249b0) {
            if (z10) {
                c41Var.dismiss();
                return false;
            }
        } else if (hasShownSheet()) {
            if (z10) {
                closeSheet();
                return false;
            }
        } else {
            bh.x xVar = this.f44313ka;
            if (xVar != null && (wVar = xVar.f4196b) != null && wVar.getReactionsWindow() != null) {
                if (z10) {
                    xVar.f4196b.e();
                    return false;
                }
            } else if (ft.o().E) {
                if (z10) {
                    ft.o().m();
                    return false;
                }
            } else {
                cl clVar = this.Ra;
                if (clVar != null && clVar.f30960s) {
                    if (z10) {
                        clVar.a(true);
                        return false;
                    }
                } else if (this.Vc.f19327f) {
                    if (z10) {
                        Xb(false);
                        return false;
                    }
                } else if (this.f44213c9 != null) {
                    if (z10) {
                        H7(true);
                        return false;
                    }
                } else if (!e7(z10, false)) {
                    if (l9()) {
                        if (z10 && (nmVar = this.f44362o9) != null && nmVar.x()) {
                            this.f44362o9.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.q()) {
                            if (z10) {
                                G7(false);
                                return false;
                            }
                        } else {
                            hk hkVar = this.Y;
                            if (hkVar != null && hkVar.q0() && (hkVar.f25877f2 != 1 || (tL_replyKeyboardMarkup = hkVar.f25923n2) == null || !tL_replyKeyboardMarkup.is_persistent || hkVar.f25916m2 == null)) {
                                if (z10) {
                                    this.Y.j0(true);
                                    return false;
                                }
                            } else {
                                hk hkVar2 = this.Y;
                                if (hkVar2 != null && hkVar2.s()) {
                                    if (z10) {
                                        hk hkVar3 = this.Y;
                                        hi.i0 i0Var = hkVar3.f25911l0;
                                        if (i0Var != null) {
                                            i0Var.setOpened(false);
                                        }
                                        if (!hkVar3.g0() && (nfVar = hkVar3.m0) != null) {
                                            nfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    hk hkVar4 = this.Y;
                                    if (hkVar4 == null || (pfVar = hkVar4.E0) == null || !pfVar.closeCreationLinkDialog(z10)) {
                                        if (this.f44221d4 == 6 && (e2Var = jg.w.e) != null && e2Var.isShowing()) {
                                            if (z10) {
                                                jg.w.e.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.e) && !this.f44247f4 && this.f44219d2 != null && b() != 0) {
                                            if (z10) {
                                                this.f44219d2.n(0L, this.B7);
                                                return false;
                                            }
                                        } else if (this.f44221d4 == 5 && !"hello".equalsIgnoreCase(this.f44208c4) && !"away".equalsIgnoreCase(this.f44208c4) && (this.G6.isEmpty() || this.f44370p4 == 0)) {
                                            if (z10) {
                                                cc();
                                                return false;
                                            }
                                        } else if (this.f44221d4 == 6 && this.Y.t()) {
                                            if (z10) {
                                                Hb(new kf(this, 18));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f22772n0) {
                                                if (z10) {
                                                    kVar2.g(true);
                                                    return false;
                                                }
                                            } else if (this.Tc.f19327f) {
                                                if (z10) {
                                                    Ca();
                                                }
                                            } else {
                                                if (z10 && (t60Var = this.f44343n3) != null) {
                                                    t60Var.a(false);
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
        u9();
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.G6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.e)))) {
                    org.telegram.ui.Components.l41.u(messageObject, false);
                }
            }
        }
        this.R3 = false;
        v9();
        ArrayList arrayList2 = org.telegram.ui.Components.l41.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        qf.c cVar = this.Wb;
        if (cVar != null) {
            cVar.a(false);
            this.Wb = null;
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
        if (this.Ab) {
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.G0();
                hk hkVar2 = this.Y;
                hkVar2.T0 = false;
                org.telegram.ui.Components.dg dgVar = hkVar2.U0;
                if (dgVar != null) {
                    dgVar.u(false);
                }
            }
            this.Ab = false;
        }
        if (this.H1 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 1), 600L);
        }
        if (this.D4 && !this.E4) {
            this.E4 = true;
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f31887j = 5000;
            M.f31899w = new le(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        bh.x xVar = this.f44313ka;
        if (xVar != null && xVar.d()) {
            this.f44313ka.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j10;
        long j11;
        ij ijVar = this.f44327m1;
        if (ijVar != null) {
            ijVar.getViewTreeObserver().addOnPreDrawListener(new i7(this, 1));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        H7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.E1() || !PhotoViewer.u1().T1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.u1().M2(null, this, this.f44385qa);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer u12 = PhotoViewer.u1();
                    int i10 = playingMessageObject.type;
                    long j12 = 0;
                    if (i10 != 0) {
                        j10 = this.f44249f6;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = this.X6;
                    } else {
                        j11 = 0;
                    }
                    if (i10 != 0) {
                        j12 = b();
                    }
                    if (u12.g2(playingMessageObject, null, null, null, null, null, null, 0, this.Sa, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.u1().l4 = this;
                    }
                    r9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.E1() && PhotoViewer.u1().f35706l2) {
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
        pk pkVar = this.ia;
        float f7 = 0.0f;
        if (z10 && this.f44227da && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (r2Var instanceof un) {
                this.P4 = true;
                un unVar = (un) r2Var;
                unVar.f44252fa = this;
                this.fragmentView.setAlpha(0.0f);
                this.f44292j1.setSkipBackgroundDrawing(true);
                this.f44327m1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f44327m1.getAvatarImageView().setAlpha(0.0f);
                this.f44327m1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.f44240ea = true;
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
                hk hkVar3 = unVar.Y;
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
                this.f44186aa = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new bh.b0(10, this, unVar));
                wc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f44276ha = animatorSet;
                animatorSet.addListener(new fi.m5(this, unVar, runnable));
                this.f44276ha.setDuration(300L);
                this.f44276ha.setInterpolator(org.telegram.ui.Components.ds.f27584f);
                this.f44276ha.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(pkVar, 200L);
                return this.f44276ha;
            }
        }
        if (this.va && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (r2Var2 instanceof af1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                r2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.f44477xa = f7;
                ofFloat.addUpdateListener(new vi(0, this));
                this.f44464wa = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                mm mmVar = this.f44292j1;
                if (mmVar != null) {
                    mmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f44276ha = animatorSet2;
                animatorSet2.addListener(new wi(this, z10, runnable));
                this.f44276ha.setDuration(150L);
                this.f44276ha.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(pkVar, 200L);
                } else {
                    this.f44276ha.start();
                }
                return this.f44276ha;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.e2 e2Var = this.N;
        if (e2Var != null && dialog == e2Var) {
            getMessagesController().deleteDialog(this.f44249f6, 0);
            org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
            if (j5Var != null && !j5Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.sv0 sv0Var;
        org.telegram.ui.Components.md mdVar = this.eb;
        if (mdVar != null) {
            mdVar.d();
        }
        getMessagesController().setSkipPeerDialogOnLoad(this.classGuid, false);
        super.onFragmentDestroy();
        jh.e eVar = this.Z3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f15940w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                jh.d dVar = (jh.d) longSparseArray.valueAt(i10);
                if (dVar.f15928i) {
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
        ij ijVar = this.f44327m1;
        if (ijVar != null && (sv0Var = ijVar.f31642c0) != null) {
            sv0Var.b(ijVar.G);
        }
        zj zjVar = this.U1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            this.U1.getAdapter().P();
        }
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.dismissInternal();
        }
        ft o10 = ft.o();
        if (o10.f39456l == this.f44463w9) {
            o10.W = null;
            o10.f39444a0 = null;
            o10.Y = null;
            o10.f39456l = null;
            o10.f39448c0 = null;
            o10.s();
        }
        getNotificationCenter().onAnimationFinish(this.R9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.S9);
        getNotificationCenter().onAnimationFinish(this.T9);
        getNotificationCenter().onAnimationFinish(this.U9);
        v9();
        le leVar = this.X5;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
            this.X5 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.f44503za);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f44249f6;
        if (this.f44221d4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j10, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.f44351nb;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f44351nb = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.f44221d4 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.f44249f6), Long.valueOf(b()), Boolean.TRUE);
        }
        if (this.f44242f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.Q3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f44242f != null) {
            getMessagesController().cancelLoadFullUser(this.f44242f.f22174id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        di.a3 a3Var2 = this.V1;
        if (a3Var2 != null) {
            a3Var2.A1();
            this.V1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.e)) {
            getMessagesController().startShortPoll(this.e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.f44322l8;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.f44322l8.linked_chat_id)), this.classGuid, true);
            }
        }
        nm nmVar = this.f44362o9;
        if (nmVar != null) {
            nmVar.f(false);
        }
        qj qjVar = this.f44481y0;
        if (qjVar != null) {
            qjVar.N();
        }
        qk qkVar = this.Ia;
        if (qkVar != null) {
            qkVar.b();
        }
        this.f44350na = null;
        org.telegram.ui.ActionBar.j5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f44174id ? 1 : 0);
            org.telegram.ui.ActionBar.j5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.p9) parentLayout2.getPulledDialogs().get(i11)).f31470b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        f44174id = false;
        qf.c cVar = this.Wb;
        if (cVar != null) {
            cVar.a(false);
            this.Wb = null;
        }
        this.f44412sa.onFragmentDestroy();
        y01 y01Var = this.f44361o8;
        if (y01Var != null) {
            y01Var.b(true);
            this.f44361o8 = null;
        }
        bi.m7 m7Var = this.Mc;
        if (m7Var != null) {
            m7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.Mc);
            this.Mc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Gb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.I8, null, null, false);
        }
        bi.m7 m7Var = this.Mc;
        if (m7Var != null) {
            m7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.Mc);
            this.Mc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        di.a3 a3Var;
        di.a3 a3Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.ti tiVar;
        hk hkVar = this.Y;
        boolean z12 = false;
        if (hkVar != null && i10 == 2 && hkVar.f25902j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(hkVar.Q).sendCurrentLocation(hkVar.f25896i3, hkVar.f25902j3);
            }
            hkVar.f25902j3 = null;
            hkVar.f25896i3 = null;
        }
        zj zjVar = this.U1;
        if (zjVar != null && zjVar.getAdapter() != null) {
            ig.j1 adapter = this.U1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f14137w0;
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
            di.a3 a3Var3 = this.V1;
            if (a3Var3 != null) {
                a3Var3.f33030j0.Y();
            }
            org.telegram.ui.Components.yp ypVar = this.f44350na;
            if (ypVar != null && (tiVar = ypVar.X) != null) {
                tiVar.f33030j0.Y();
            }
        } else if ((i10 == 5 || i10 == 30) && (a3Var = this.V1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                a3Var.I1();
            }
        } else if ((i10 == 17 || i10 == 18) && (a3Var2 = this.V1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = a3Var2.f33030j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.U(z12);
            this.V1.f33030j0.Y();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f44385qa);
                alertDialog$Builder.f22366a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22366a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new ph(this));
                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ja(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ja(2);
        } else if (((i10 != 101 && i10 != 102) || this.f44242f == null) && (i10 != 103 || this.e == null)) {
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
                    org.telegram.ui.Components.voip.g2.l(this.e, null, this.f44311k8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f44242f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f44334m8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f44242f.f22174id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.g2.h(getParentActivity(), null, i10);
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
        org.telegram.ui.Components.y9[] y9VarArr;
        bh.r rVar;
        super.onResume();
        k7();
        this.Q9 = System.currentTimeMillis();
        if (this.D9 && getSendMessagesHelper().getImportingHistory(this.f44249f6) != null) {
            org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(getParentActivity(), null, this, this.f44385qa);
            i50Var.setOnHideListener(new qe(this, 0));
            showDialog(i50Var);
            this.D9 = false;
        }
        O6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        d7();
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.D1();
        }
        mm mmVar = this.f44292j1;
        boolean z12 = true;
        if (mmVar != null) {
            org.telegram.ui.Components.x91 x91Var = mmVar.v;
            if (x91Var != null) {
                x91Var.c(true);
            }
            mmVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new le(this, 24), 1000L);
        }
        d9 d9Var = new d9(this, 2);
        this.f44452vc = d9Var;
        setBulletinDelegate(d9Var);
        N6(false);
        TLRPC.PhotoSize photoSize = this.I5;
        if (photoSize != null && (rVar = this.f44177a0) != null) {
            ((org.telegram.ui.Components.cp[]) rVar.f4113b)[0].f27228f.k(ImageLocation.getForObject(photoSize, this.K5), "50_50", ImageLocation.getForObject(this.J5, this.K5), "50_50_b", this.G5, null, this.f44498z5, this.H5);
        }
        if (this.O5 != null && (y9VarArr = this.N2) != null) {
            y9VarArr[0].k(ImageLocation.getForObject(this.O5, this.Q5), "50_50", ImageLocation.getForObject(this.P5, this.Q5), "50_50_b", this.L5, null, (MessageObject) this.V4.get(Integer.valueOf(this.X4)), this.M5);
            y9VarArr[0].setHasBlur(this.N5);
        }
        if (this.f44221d4 == 0) {
            getNotificationsController().setOpenedDialogId(this.f44249f6, b());
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f44249f6;
        if (this.f44221d4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j10, z10, true);
        if (this.f44210c6) {
            if (this.f44236e6 && (messageObject = this.W7) != null) {
                if (this.f44468x0 != null) {
                    int i10 = this.f44250f8;
                    if (i10 == -9000) {
                        i10 = U8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f44493z0.i1(this.G6.indexOf(this.W7) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f44493z0.i1(this.G6.indexOf(this.W7) + this.A0.J, i10, z11);
                }
            } else {
                Y9(false);
            }
            this.f44236e6 = false;
            this.f44210c6 = false;
            this.W7 = null;
        }
        this.C5 = false;
        this.D5 = false;
        h7(false);
        if (this.E5) {
            this.E5 = false;
            fm fmVar = this.A0;
            if (fmVar != null) {
                fmVar.O(false);
            }
        }
        ij ijVar = this.f44327m1;
        if (ijVar != null) {
            ijVar.getViewTreeObserver().addOnPreDrawListener(new i7(this, 1));
        }
        F6(false, false);
        if (this.Y != null && this.f44221d4 == 0 && this.f44438ua != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.f44249f6 && (arrayList2 = this.f44438ua.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new e80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f44438ua.entities;
            }
            CharSequence o10 = ChatActivityEnterView.o(arrayList, this.f44438ua.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (o10 != null && o10.length() > 0 && o10.charAt(0) == '@') {
                o10 = TextUtils.concat(" ", o10);
            }
            this.Y.c1(o10, true);
            this.f44438ua = null;
        }
        lk lkVar = this.f44178a1;
        if (lkVar != null && lkVar.getVisibility() != 0 && !this.actionBar.f22772n0 && this.f44221d4 != 7 && !org.telegram.ui.ActionBar.r2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        hk hkVar2 = this.Y;
        if (hkVar2 != null) {
            hkVar2.C0();
        }
        if (this.f44242f != null) {
            this.B8 = System.currentTimeMillis();
            this.C8 = 0L;
        }
        if (this.E8 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 3));
        }
        if (this.f44468x0 != null && ((hkVar = this.Y) == null || !hkVar.o0())) {
            this.f44468x0.setOnItemLongClickListener(this.Wa);
            this.f44468x0.setOnItemClickListener(this.Xa);
            this.f44468x0.setLongClickable(true);
        }
        org.telegram.ui.Components.u61.h = false;
        TLRPC.User user = this.f44242f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.u61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.f44322l8;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.f44322l8.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.f44322l8.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.u61.h = true;
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
                org.telegram.ui.Components.u61.h = z12;
            }
        }
        ad(false);
        Ub();
        if (this.Z9 != 0.0f) {
            this.Z9 = 0.0f;
            this.f44468x0.invalidate();
        }
        this.Q3.attach();
        bi.m7 m7Var = this.Mc;
        if (m7Var != null) {
            m7Var.bringToFront();
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
            hh.d dVar = this.H;
            if (dVar != null) {
                Iterator it = dVar.v.iterator();
                while (it.hasNext()) {
                    ((eh.e) it.next()).f9974g0 = true;
                }
            }
            hh.d dVar2 = this.I;
            if (dVar2 != null) {
                Iterator it2 = dVar2.v.iterator();
                while (it2.hasNext()) {
                    ((eh.e) it2.next()).f9974g0 = true;
                }
            }
            Paint paint = this.S8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23634s8));
            }
            RadialProgressView radialProgressView = this.f44366p0;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23451ic));
            }
            lk lkVar = this.f44178a1;
            if (lkVar != null) {
                lkVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
            }
            mk mkVar = this.F0;
            if (mkVar != null && mkVar.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.y6.Oh)) != this.I0 || this.f44491yb != org.telegram.ui.ActionBar.y6.I.q())) {
                this.I0 = themedColor4;
                this.f44491yb = org.telegram.ui.ActionBar.y6.I.q();
                Drawable background = this.F0.getBackground();
                org.telegram.ui.ActionBar.y6.E1(background, themedColor4, false);
                org.telegram.ui.ActionBar.y6.E1(background, org.telegram.ui.ActionBar.o6.b(themedColor4), true);
            }
            kb();
        } catch (Exception e) {
            FileLog.e(e);
        }
        Set<org.telegram.ui.ActionBar.u0> set = this.S0;
        Set<org.telegram.ui.ActionBar.u0> set2 = this.R0;
        try {
            RadialProgressView radialProgressView2 = this.G0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.H0));
            }
            NumberTextView numberTextView = this.R2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23398fe));
            }
            RadialProgressView radialProgressView3 = this.W2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23379ee));
            }
            org.telegram.ui.Components.z90 z90Var = this.f44245f2;
            if (z90Var != null && this.P0) {
                z90Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23416ge));
            }
            if (this.M0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.f23746y6)) != this.J0) {
                this.J0 = themedColor3;
                this.M0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.N0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.y6.Oh)) != this.K0) {
                this.K0 = themedColor2;
                this.N0.setTint(themedColor2);
            }
            if (this.O0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.H6)) != this.L0) {
                this.L0 = themedColor;
                this.O0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            sh.c cVar = this.Zc;
            if (cVar != null && (i10 = this.Q0) >= 0) {
                cVar.setColor(getThemedColor(i10));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.y6.f23579p7);
                for (org.telegram.ui.ActionBar.u0 u0Var : set2) {
                    if (u0Var != null) {
                        u0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23579p7, false);
                for (org.telegram.ui.ActionBar.u0 u0Var2 : set) {
                    if (u0Var2 != null) {
                        u0Var2.a(x02, x02);
                    }
                }
            }
        } catch (Exception e10) {
            FileLog.e(e10);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r14, boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.sd sdVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.f44182a6) {
                this.f44182a6 = true;
                Hc();
            }
            iArr = this.R9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.Z5 = false;
            if (!z11) {
                this.f44196b6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f44242f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            hk hkVar = this.Y;
            if (hkVar != null && (sdVar = hkVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                hkVar.S1 = null;
            }
        }
        k7();
        this.R9 = getNotificationCenter().setAnimationInProgress(this.R9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f44419t4) {
            if (this.f44242f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f44242f.f22174id));
                if (user != null) {
                    this.f44242f = user;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.e.f22027id));
                if (chat != null) {
                    this.e = chat;
                } else {
                    return;
                }
            }
            ij ijVar = this.f44327m1;
            if (ijVar != null) {
                ijVar.b();
            }
        }
    }

    public final void p7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.f44229dc > 1000) {
            z10 = true;
        }
        jg jgVar = this.f44241ec;
        AndroidUtilities.cancelRunOnUIThread(jgVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        AndroidUtilities.runOnUIThread(jgVar, j10);
    }

    public final void p8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.B5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void p9(boolean z10) {
        if (this.f44294j3.getTag() != null && !this.f44369p3) {
            if (!this.f44444v3 || this.f44392r3) {
                this.f44294j3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f44405s3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f44405s3.playTogether(ObjectAnimator.ofFloat(this.f44294j3, View.ALPHA, 0.0f));
                    this.f44405s3.addListener(new pi(this, 6));
                    this.f44405s3.setStartDelay(this.f44329m3);
                    this.f44405s3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f44405s3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f44405s3 = null;
                    }
                    this.f44294j3.setAlpha(0.0f);
                }
                this.f44329m3 = 500;
            }
        }
    }

    public final void pa(MessageObject messageObject) {
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
            presentFragment(new un(bundle));
        }
    }

    public final void pb(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            s8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.f44249f6, this.f44498z5, this.f44295j4, null, this.f44473x5, z11, true, null, z10, i10, 0, this.f44221d4, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, L8(), 0L, false, 0L, X8(), this.f44407s5);
            D6();
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.f44234e4 == -1) {
                this.f44234e4 = 0;
            }
            this.f44234e4 = arrayList.size() + this.f44234e4;
            Rc(true);
        }
    }

    public final void pc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = this.M3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f44371p5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.f44209c5;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.f44249f6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f44209c5 - 1), Boolean.valueOf(this.f44235e5));
        this.M3 = org.telegram.ui.Components.wc.B(this, false, new ai.h1(this, arrayList2, arrayList, i10, 16), new te(this, messageObject, 7), this.f44385qa).j();
    }

    public final void q7() {
        int g92 = (int) (g9(org.telegram.ui.Components.a41.f26408c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(g92);
        int b10 = a8.ee.b(AndroidUtilities.dp(36.0f) + (this.f44292j1.getMeasuredHeight() - g92), 0, this.f44292j1.getMeasuredHeight());
        int measuredWidth = this.f44292j1.getMeasuredWidth();
        Rect rect = f44175jd;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Ma, this.f44468x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f44468x0.getMeasuredHeight() - this.Na) - g92));
    }

    public final void q8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f44407s5;
        if (messageSuggestionParams != null) {
            Pb(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.S5;
        if (webPage != null) {
            Qb(true, webPage, false);
            return;
        }
        kn knVar = this.f44473x5;
        if (knVar != null) {
            Ob(this.f44498z5, knVar);
            return;
        }
        MessageObject messageObject = this.f44498z5;
        if (messageObject != null && messageObject != this.f44295j4) {
            Nb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f44394r5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Mb(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.B5;
        if (messageObject2 != null) {
            Lb(true, null, messageObject2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Qb(false, null, true);
        }
    }

    public final void q9(boolean z10) {
        if (this.f44306k3.getTag() != null && !this.f44380q3) {
            if (!this.f44457w3 || this.f44392r3) {
                this.f44306k3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44431u3, 0.0f);
                    this.f44418t3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f44418t3.addUpdateListener(new ne(this, 1));
                    this.f44418t3.addListener(new pi(this, 8));
                    this.f44418t3.setStartDelay(this.f44329m3);
                    this.f44418t3.start();
                } else {
                    ValueAnimator valueAnimator = this.f44418t3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f44418t3 = null;
                    }
                    this.f44431u3 = 0.0f;
                    yc();
                }
                this.f44329m3 = 500;
            }
        }
    }

    public final void qa(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f44242f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f44242f.f22174id) {
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
            presentFragment(new un(bundle));
        }
    }

    public final te qb(MessageObject messageObject, boolean z10) {
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
                getMessagesController().markMessageAsRead(this.f44249f6, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.f44249f6, messageObject.getId(), null, i11, 0L, z11);
            return null;
        }
        return new te(this, messageObject, 1);
    }

    public final void qc() {
        boolean J9 = J9();
        SparseArray[] sparseArrayArr = this.f44285i6;
        if (!J9) {
            if (this.actionBar.q() && this.f44341n1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f44341n1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
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
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.Sc.a(false, true);
        MessageObject messageObject = this.B5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.B5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f44407s5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.B5.messageOwner.suggested_post);
            }
            if (!bi.ca.U(this.currentAccount, messageSuggestionParams.amount)) {
                fc(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            jg jgVar = new jg(this, 0);
            this.C7 = jgVar;
            AndroidUtilities.runOnUIThread(jgVar, 3000L);
        }
        s8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.g5.a0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                un unVar = un.this;
                MessageObject messageObject2 = unVar.B5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = unVar.f44407s5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(unVar.B5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(unVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, unVar.f44249f6, unVar.B5, unVar.f44295j4, null, unVar.f44473x5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, unVar.L8(), photoEntry2.effectId, l4.longValue(), unVar.X8(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(unVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, unVar.f44249f6, unVar.B5, unVar.f44295j4, null, unVar.f44473x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, unVar.L8(), photoEntry2.effectId, l4.longValue(), unVar.X8(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(unVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, unVar.f44249f6, unVar.B5, unVar.f44295j4, null, unVar.f44473x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, unVar.L8(), photoEntry2.effectId, l4.longValue(), unVar.X8(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(unVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, unVar.f44249f6, unVar.f44498z5, unVar.f44295j4, null, unVar.f44473x5, photoEntry2.entities, photoEntry2.ttl, unVar.B5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, unVar.L8(), photoEntry2.effectId, l4.longValue(), unVar.X8(), unVar.f44407s5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(unVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, unVar.f44249f6, unVar.f44498z5, unVar.f44295j4, null, unVar.f44473x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, unVar.B5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, unVar.L8(), photoEntry2.effectId, l4.longValue(), unVar.X8(), unVar.f44407s5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(unVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, unVar.f44249f6, unVar.f44498z5, unVar.f44295j4, null, unVar.f44473x5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, unVar.B5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, unVar.L8(), photoEntry2.effectId, l4.longValue(), unVar.X8(), unVar.f44407s5);
                }
                unVar.D6();
            }
        }, j10);
    }

    public final void r7() {
        int i10;
        if (this.f44327m1 != null) {
            float actionModeFactor = (1.0f - this.Wc.e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f44327m1.setScaleX(lerp);
            this.f44327m1.setScaleY(lerp);
            this.f44327m1.setAlpha(actionModeFactor);
            ij ijVar = this.f44327m1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ijVar.setVisibility(i10);
        }
    }

    public final void r9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.t40 t40Var = this.f44483y2;
            if (t40Var != null) {
                t40Var.b(true);
            }
            bj bjVar = this.f44404s2;
            if (bjVar != null) {
                bjVar.b(true);
            }
            org.telegram.ui.Components.t40 t40Var2 = this.f44430u2;
            if (t40Var2 != null) {
                t40Var2.b(true);
            }
        }
        org.telegram.ui.Components.t40 t40Var3 = this.f44470x2;
        if (t40Var3 != null) {
            t40Var3.b(true);
        }
        org.telegram.ui.Components.t40 t40Var4 = this.f44456w2;
        if (t40Var4 != null) {
            t40Var4.b(true);
        }
        org.telegram.ui.Components.t40 t40Var5 = this.F2;
        if (t40Var5 != null) {
            t40Var5.b(true);
        }
        org.telegram.ui.Components.t40 t40Var6 = this.G2;
        if (t40Var6 != null) {
            t40Var6.b(true);
        }
        org.telegram.ui.Components.t40 t40Var7 = this.f44495z2;
        if (t40Var7 != null) {
            t40Var7.b(true);
        }
        org.telegram.ui.Components.t40 t40Var8 = this.A2;
        if (t40Var8 != null) {
            t40Var8.b(true);
        }
        org.telegram.ui.Components.dq dqVar = this.H2;
        if (dqVar != null) {
            dqVar.a();
        }
        fi.v3 v3Var = this.V0;
        if (v3Var != null) {
            v3Var.e(true);
        }
        fi.v3 v3Var2 = this.X0;
        if (v3Var2 != null) {
            v3Var2.e(true);
        }
        fi.v3 v3Var3 = this.W0;
        if (v3Var3 != null) {
            v3Var3.e(true);
        }
    }

    public final void ra(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        org.telegram.ui.Cells.s1 s1Var2;
        boolean z10;
        long j10;
        long j11;
        org.telegram.ui.Components.g6 animation;
        Bitmap m10;
        if (s1Var == null) {
            int childCount = this.f44468x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f44468x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                    if (s1Var2.getMessageObject().equals(messageObject)) {
                        break;
                    }
                }
            }
        }
        s1Var2 = s1Var;
        if (messageObject.isVideo()) {
            qb(messageObject, true);
        }
        if (messageObject.isVideo() && !messageObject.hasVideoQualities() && SharedConfig.streamMedia && messageObject.canStreamVideo() && !DialogObject.isEncryptedDialog(messageObject.getDialogId()) && !messageObject.mediaExists && !messageObject.attachPathExists) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            getFileLoader().startVideoStream(messageObject.getDocument(), messageObject);
        }
        PhotoViewer.u1().M2(null, this, this.f44385qa);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (s1Var2 != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = s1Var2.getPhotoImage().getAnimation()) != null && this.I8 != null && this.F8.getTag() != null && (m10 = animation.m()) != null) {
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
        int i11 = this.f44221d4;
        ml mlVar = this.Sa;
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
            PhotoViewer.u1().d2(arrayList, arrayList.indexOf(messageObject), this.f44249f6, 0L, b(), mlVar);
        } else {
            PhotoViewer u12 = PhotoViewer.u1();
            int i13 = messageObject.type;
            long j12 = 0;
            if (i13 != 0) {
                j10 = this.f44249f6;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = this.X6;
            } else {
                j11 = 0;
            }
            if (i13 != 0) {
                j12 = b();
            }
            if (!u12.h2(messageObject, this, j10, j11, j12, mlVar) && z10) {
                getFileLoader().cancelLoadFile(messageObject.getDocument());
            }
        }
        r9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final void rb(int i10, ArrayList arrayList, boolean z10) {
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
                        Eb();
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
        s8(null, null);
        SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), (ArrayList<String>) arrayList2, (ArrayList<String>) arrayList3, (ArrayList<Uri>) arrayList4, (String) null, (String) null, this.f44249f6, this.f44498z5, this.f44295j4, (TL_stories.StoryItem) null, this.f44473x5, this.B5, z10, i10, (t0.i) null, L8(), 0L, false, 0L);
        o9(false);
    }

    public final void rc() {
        mm mmVar = this.f44292j1;
        if (mmVar != null && this.f44363oa == null) {
            if (this.f44385qa.h == null || mmVar.getBackgroundImage() == null) {
                if (this.f44292j1.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.f44292j1.U(org.telegram.ui.ActionBar.y6.s0());
                }
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f44274h8 = bundle.getString("path");
    }

    public final void s7() {
        boolean z10;
        fi.h1 h1Var;
        if (this.f44376pa != null) {
            return;
        }
        int i10 = 0;
        if (this.Vc.e >= 1.0f && ((h1Var = this.C1) == null || h1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        bi.cc ccVar = this.f44292j1.L;
        if (!z10) {
            i10 = 4;
        }
        ccVar.setVisibility(i10);
    }

    public final void s8(CharSequence charSequence, ArrayList arrayList) {
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
                hk hkVar = this.Y;
                if (hkVar != null) {
                    this.B5.editingMessage = hkVar.getFieldText();
                    MessageObject messageObject3 = this.B5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.B5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final void s9() {
        ValueAnimator valueAnimator = this.Cb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.v0 v0Var = this.f44318l3;
        if (v0Var != null && v0Var.getTag() != null) {
            this.f44318l3.setTag(null);
            org.telegram.ui.Cells.v0 v0Var2 = this.f44318l3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new ef(this, v0Var2, 1));
            ofFloat.addListener(new bi.ce(14, this, v0Var2));
            ofFloat.setDuration(150L);
            this.Cb = ofFloat;
            ofFloat.start();
        }
    }

    public final void sa(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        int i10;
        if (getParentActivity() != null && (j5Var = this.parentLayout) != null && j5Var.getLastFragment() == this && !this.T4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f22027id);
            } else {
                bundle.putLong("user_id", this.f44242f.f22174id);
            }
            bundle.putInt("chatMode", 2);
            un unVar = new un(bundle);
            unVar.T4 = new ArrayList(this.T4);
            unVar.V4 = new HashMap(this.V4);
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
                    unVar.V4.put(num, messageObject);
                    unVar.Mc();
                }
            }
            unVar.f44195b5 = this.f44195b5;
            if (this.f44419t4) {
                i10 = this.T4.size();
            } else {
                i10 = this.f44209c5;
            }
            unVar.f44209c5 = i10;
            unVar.f44235e5 = this.f44235e5;
            unVar.f44334m8 = this.f44334m8;
            unVar.f44322l8 = this.f44322l8;
            unVar.f44275h9 = new hl(this, unVar);
            if (z10) {
                presentFragmentAsPreview(unVar);
                k7();
                return;
            }
            presentFragment(unVar, false);
        }
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        kf kfVar = this.Ca;
        if (kfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(kfVar);
        }
        hk hkVar = this.Y;
        if (hkVar != null && this.f44292j1 != null && hkVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f22965f) {
            this.Ba = this.f44292j1.getKeyboardHeight();
        } else {
            this.Ba = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f44274h8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages h92 = h9(messageObject);
        boolean z12 = false;
        if (h92 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < h92.messages.size()) {
                    if (this.f44285i6[i10].indexOfKey(h92.messages.get(i11).getId()) < 0) {
                        break;
                    }
                    i11++;
                } else {
                    h92 = null;
                    break;
                }
            }
        }
        if (h92 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        s1Var.setDrawSelectionBackground(z11);
        if (h92 == null) {
            z12 = true;
        }
        s1Var.N3(true, z12, z10);
    }

    public final void sc() {
        TLRPC.User user;
        boolean z10;
        if (this.f44266h0 != null && (user = this.f44242f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f44374p8;
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
                this.f44266h0.S(30);
            } else {
                this.f44266h0.t(30);
            }
            if (z10) {
                this.f44266h0.S(31);
            } else {
                this.f44266h0.t(31);
            }
        }
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.z l4 = kVar.l();
            if (this.inMenuMode) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            l4.setVisibility(i10);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        MessageObject messageObject;
        TLRPC.Message message;
        long j10;
        org.telegram.ui.ActionBar.j2 j2Var;
        float f7;
        float f10;
        hk hkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f44242f != null && this.f44340n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f44242f.f22174id);
            if (userFull != null && userFull.phone_calls_available) {
                this.X9 = !this.inPreviewMode;
                this.f44340n0.f(0);
            } else {
                this.X9 = false;
                this.f44340n0.f(8);
            }
        }
        ij ijVar = this.f44327m1;
        float f12 = 0.0f;
        if (ijVar != null) {
            ijVar.setOccupyStatusBar(!z10);
            ij ijVar2 = this.f44327m1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            ijVar2.setLayoutParams(org.telegram.ui.Components.gb1.h(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
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
        org.telegram.ui.Components.tz0 tz0Var = this.f44367p1;
        if (tz0Var != null) {
            if (this.f44319l5 && !z10 && ((hkVar = this.Y) == null || !hkVar.f25991z3)) {
                i11 = 0;
            }
            tz0Var.setVisibility(i11);
        }
        zj zjVar = this.U1;
        if (zjVar != null) {
            ViewPropertyAnimator animate = zjVar.animate();
            if (!this.Y.f25991z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.ds.f27584f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                j2Var = new org.telegram.ui.ActionBar.j2(false);
            } else {
                j2Var = null;
            }
            kVar.setBackButtonDrawable(j2Var);
            org.telegram.ui.ActionBar.w0 w0Var = this.f44266h0;
            if (w0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                w0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.y yVar = this.f44230e0;
            if (yVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                yVar.f23274i = f12;
                org.telegram.ui.ActionBar.w0 w0Var2 = yVar.f23278m;
                if (w0Var2 != null) {
                    w0Var2.setAlpha(f12);
                }
            }
        }
        oj ojVar = this.f44468x0;
        if (ojVar != null) {
            int childCount = ojVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f44468x0.getChildAt(i12);
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
                        int i13 = this.f44474x6 - 1;
                        this.f44474x6 = i13;
                        if (i13 <= 0) {
                            this.f44474x6 = 0;
                            this.f44486y6 = true;
                            Wb(false);
                        } else {
                            this.f44442v1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.e)) {
                            j10 = this.e.f22027id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j10, this.f44249f6);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        s1Var.setHighlighted(false);
                        s1Var.Q3();
                    }
                }
            }
            this.f44468x0.setItemAnimator(null);
        }
        uc(false);
        Xc();
        bk bkVar = this.f44293j2;
        if (bkVar != null) {
            if (!z10 && !this.f44201bb) {
                z12 = true;
            } else {
                z12 = false;
            }
            bkVar.setEnabled(z12);
        }
        bk bkVar2 = this.f44317l2;
        if (bkVar2 != null) {
            if (!z10 && !this.f44201bb) {
                z11 = true;
            } else {
                z11 = false;
            }
            bkVar2.setEnabled(z11);
        }
        el elVar = this.J2;
        if (elVar != null) {
            elVar.setEnabled(!isInPreviewMode());
        }
        mm mmVar = this.f44292j1;
        if (mmVar != null) {
            mmVar.setOccupyStatusBar((this.inBubbleMode || this.f44201bb || this.inPreviewMode) ? false : false);
        }
    }

    public final void t7() {
        float f7;
        org.telegram.ui.Components.nf nfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + g9(org.telegram.ui.Components.a41.f26408c) + this.v.d();
        hk hkVar = this.Y;
        if (hkVar != null && (nfVar = hkVar.m0) != null) {
            nfVar.setTranslationY(-inputBubbleHeight);
        }
        zj zjVar = this.U1;
        if (zjVar != null) {
            if (zjVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            zjVar.setTranslationY(f7);
        }
    }

    public final void t8(boolean z10) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.f44322l8 != null && !ChatObject.isNotInChat(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.f44322l8;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f44388r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f44388r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.f44322l8.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f44322l8.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f44388r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f44388r == 0) {
                getMessagesController().checkChatInviter(this.e.f22027id, false);
            }
        }
    }

    public final boolean t9(boolean z10) {
        el elVar;
        el elVar2 = this.J2;
        if (elVar2 == null || elVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.ch chVar = this.Y0;
        if (chVar != null && (elVar = this.J2) != null) {
            chVar.i(elVar, false, z10);
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

    public final void ta(int i10, boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && j5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f22035id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f22027id);
                } else {
                    bundle.putLong("user_id", this.f44242f.f22174id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            un unVar = new un(bundle);
            if (this.f44419t4) {
                pg.d.a(unVar, MessagesStorage.TopicKey.of(a(), b()));
            }
            unVar.f44275h9 = new kj(this);
            presentFragment(unVar, false);
        }
    }

    public final void tb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f44385qa != null && this.f44363oa == null) {
            hg.b c10 = hg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.f44249f6, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.h4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.h4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.k();
                    theme.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.h4 h4Var = theme;
                sn snVar = this.f44385qa;
                TLRPC.WallPaper wallPaper = snVar.f43543g;
                if (this.f44196b6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                snVar.q(h4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new pe(this, 14));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.f44249f6);
            sn snVar2 = this.f44385qa;
            org.telegram.ui.ActionBar.h4 h4Var2 = snVar2.f43542f;
            if (this.f44196b6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            snVar2.q(h4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void tc() {
        if (this.f44219d2 == null) {
            return;
        }
        this.f44219d2.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.d());
    }

    public final void u7() {
        float d;
        boolean z10;
        if (this.f44468x0 != null) {
            if (this.f44201bb && this.f44376pa == null) {
                d = AndroidUtilities.navigationBarHeight;
            } else {
                d = this.v.d() + g9(org.telegram.ui.Components.a41.f26408c) + AndroidUtilities.dp(16.0f) + this.Na + this.Pc;
            }
            int i10 = (int) this.E9;
            org.telegram.ui.Components.e41 e41Var = this.f44219d2;
            if (e41Var != null) {
                e41Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            jh.g gVar = this.f44454w0;
            if (!this.f44468x0.V1 && this.f44325lb == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = gVar.f15953a;
            int i11 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        AndroidUtilities.doOnLayout(recyclerView, new ag.r0(gVar, i12, 14));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            jh.e eVar = this.Z3;
            if (eVar != null) {
                RectF rectF = eVar.f15934b;
                rectF.set(g9(org.telegram.ui.Components.a41.f26407b), i10 - this.G, 0.0f, d - this.Na);
                eVar.f15935c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void u8(org.telegram.messenger.MessageObject r60, java.util.ArrayList r61, java.util.ArrayList r62, java.util.ArrayList r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.u8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void u9() {
        xk xkVar = this.f44465wb;
        if (xkVar == null) {
            return;
        }
        this.f44465wb = null;
        xkVar.e();
        if (xkVar.getReactionsWindow() != null && xkVar.getReactionsWindow().f4047a != null) {
            xkVar.getReactionsWindow().f4047a.animate().alpha(0.0f).setDuration(180L).start();
        }
        xkVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new ed(17, this, xkVar)).setDuration(180L).start();
    }

    public final void ua(TLRPC.Chat chat) {
        boolean z10;
        fi.v3 v3Var = this.H1;
        if (v3Var != null && v3Var.V) {
            v3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        fi.v3 v3Var2 = this.I1;
        if (v3Var2 != null && v3Var2.V) {
            v3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new ed(11, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f22772n0) {
            this.Wc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f44266h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f44230e0;
            if (yVar != null) {
                yVar.f(8);
            }
            yr yrVar = this.f44217d0;
            if (yrVar != null) {
                yrVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f44279i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f44291j0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.W9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f44340n0;
            if (yVar3 != null && this.X9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f44303k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f44353o0 = true;
            Sc(0, 0, -1);
            uc(false);
            ImageView imageView = this.f44233e3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f44246f3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f44291j0;
        if (w0Var5 != null) {
            this.zc = true;
            this.f44284i5 = false;
            w0Var5.F(false);
            this.zc = false;
        }
        ib(chat, null);
        Lc(0, true);
    }

    public final void ub(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                ub(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f44468x0 && view != this.f44292j1) {
            view.setEnabled(z10);
        }
    }

    public final void uc(boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.uc(boolean):void");
    }

    @Override
    public final boolean v(final org.telegram.ui.cy r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.af1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.v(org.telegram.ui.cy, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.af1):boolean");
    }

    public final void v7() {
        FrameLayout frameLayout = this.f44205c1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final int v8() {
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
                        if (Math.abs(i19 - indexOf) > this.f44254fc + 1 && Math.abs(i20 - i11) > this.f44254fc + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i18 == i25 || (Math.abs(i18 - indexOf) > this.f44254fc + 1 && Math.abs(i23 - i11) > this.f44254fc + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
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
                    if (Math.abs(i33 - i26) >= this.f44254fc + 1 && Math.abs(i34 - i27) >= this.f44254fc + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.f44254fc + 1 && Math.abs(i32 - i27) >= this.f44254fc + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
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

    public final void v9() {
        UndoView undoView = this.K3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.qc qcVar = this.M3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        dl dlVar = this.L3;
        if (dlVar != null) {
            dlVar.d(0, true);
        }
    }

    public final void va(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i11;
        fi.v3 v3Var = this.H1;
        if (v3Var != null && v3Var.V) {
            v3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        fi.v3 v3Var2 = this.I1;
        if (v3Var2 != null && v3Var2.V) {
            v3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new se(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f22772n0) {
            this.Wc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f44266h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f44230e0;
            if (yVar != null) {
                yVar.f(8);
            }
            yr yrVar = this.f44217d0;
            if (yrVar != null) {
                yrVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f44279i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            if ((this.f44370p4 == 0 || (i11 = this.f44221d4) == 3 || i11 == 8) && (w0Var = this.f44291j0) != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.W9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f44340n0;
            if (yVar3 != null && this.X9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f44303k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f44353o0 = true;
            Sc(0, 0, -1);
            uc(false);
        }
        if ((this.f44370p4 == 0 || this.f44419t4 || (i10 = this.f44221d4) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f44242f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f44284i5 = z11;
            org.telegram.ui.ActionBar.w0 w0Var5 = this.f44291j0;
            if (w0Var5 != null) {
                w0Var5.F(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f44291j0;
        if (w0Var6 != null) {
            w0Var6.P(str, false);
        }
        MediaDataController mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.F3 = str2;
        mediaDataController.searchMessagesInChat(str2, this.f44249f6, this.X6, this.classGuid, 0, this.f44370p4, false, this.A3, this.B3, !TextUtils.isEmpty(str), this.C3);
        Lc(0, true);
    }

    public final void vb(boolean z10) {
        wb(z10, false, true);
    }

    public final void vc() {
        uc(false);
    }

    @Override
    public final boolean w() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void w7() {
        int i10;
        float f7 = this.Xc.e;
        org.telegram.ui.Components.o40 o40Var = this.F1;
        int i11 = 8;
        if (o40Var != null) {
            o40Var.setAlpha(f7);
            org.telegram.ui.Components.o40 o40Var2 = this.F1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o40Var2.setVisibility(i10);
        }
        bi.r1 r1Var = this.X3;
        if (r1Var != null) {
            float f10 = 1.0f - f7;
            r1Var.setAlpha(f10);
            bi.r1 r1Var2 = this.X3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            r1Var2.setVisibility(i11);
        }
    }

    public final void w9() {
        boolean z10;
        Sc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.F3, this.f44249f6, this.X6, this.classGuid, 0, this.f44370p4, this.A3, this.B3, this.C3);
        if (TextUtils.isEmpty(this.F3) && this.C3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.E3 = z10;
        this.f44353o0 = z10;
        uc(false);
        Vc();
    }

    public final void wa(TLRPC.User user) {
        boolean z10;
        fi.v3 v3Var = this.H1;
        if (v3Var != null && v3Var.V) {
            v3Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        fi.v3 v3Var2 = this.I1;
        if (v3Var2 != null && v3Var2.V) {
            v3Var2.e(true);
            z10 = true;
        }
        if (z10) {
            AndroidUtilities.runOnUIThread(new gg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f22772n0) {
            this.Wc.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f44266h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f44230e0;
            if (yVar != null) {
                yVar.f(8);
            }
            yr yrVar = this.f44217d0;
            if (yrVar != null) {
                yrVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f44279i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f44291j0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.W9) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f44340n0;
            if (yVar3 != null && this.X9) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f44303k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f44353o0 = true;
            Sc(0, 0, -1);
            uc(false);
            ImageView imageView = this.f44233e3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f44246f3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f44291j0;
        if (w0Var5 != null) {
            this.zc = true;
            this.f44284i5 = false;
            w0Var5.F(false);
            this.zc = false;
        }
        ib(null, user);
        Lc(0, true);
    }

    public final void wb(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.wb(boolean, boolean, boolean):void");
    }

    public final void wc() {
        int i10;
        org.telegram.ui.Components.ub ubVar;
        tk tkVar;
        hk hkVar;
        if (this.P9 && this.f44468x0 != null) {
            float f7 = 0.0f;
            if (this.Ba <= 0 || this.Qa != 0.0f) {
                float f92 = f9(AndroidUtilities.dp(7.0f));
                sk skVar = this.A1;
                if (skVar != null) {
                    i10 = AndroidUtilities.dp(skVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float I8 = (I8() * AndroidUtilities.dp(43.0f)) + f92 + i10;
                float f10 = this.E9;
                this.F9 = I8;
                this.E9 = g9(org.telegram.ui.Components.a41.f26406a) + AndroidUtilities.dp(4.0f) + this.H9 + I8;
                if (this.actionBar.getVisibility() == 0 || this.f44376pa != null) {
                    this.E9 += this.actionBar.getMeasuredHeight();
                }
                this.G9 = 0;
                this.E9 = this.E9 + this.Ma + this.I9;
                if (this.Qa != 0.0f && (hkVar = this.Y) != null && hkVar.getVisibility() == 0) {
                    float f11 = this.E9;
                    float measuredHeight = this.Qa * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.E9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.v0 v0Var = this.f44318l3;
                if (v0Var != null) {
                    v0Var.setTranslationY(((this.f44468x0.getTranslationY() + this.E9) + this.M9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.E9;
                    float f13 = this.M9;
                    this.E9 = f12 + f13;
                    this.G9 = (int) (this.G9 + f13);
                }
                yj yjVar = this.f44294j3;
                if (yjVar != null) {
                    yjVar.setTranslationY((((this.f44468x0.getTranslationY() - f7) + this.E9) + this.K9) - AndroidUtilities.dp(4.0f));
                }
                yc();
                oj ojVar = this.f44468x0;
                if (ojVar != null && this.f44493z0 != null && this.A0 != null) {
                    int paddingTop = ojVar.getPaddingTop();
                    int paddingBottom = this.f44468x0.getPaddingBottom();
                    u7();
                    if (this.f44468x0.getPaddingTop() != paddingTop || this.f44468x0.getPaddingBottom() != paddingBottom) {
                        z9();
                    }
                    this.f44468x0.setTopGlowOffset((int) ((this.E9 - this.G9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.E9 && this.f44325lb == 0) {
                        int childCount = this.f44468x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f44468x0.getChildAt(i11);
                            this.f44468x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.E9;
                                if (childAt.getTop() > f14) {
                                    this.f44468x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!O9() && !this.P4 && this.f44325lb == 0 && this.V7 != null && this.f44468x0 != null && ((tkVar = this.f44192b2) == null || tkVar.getVisibility() != 0)) {
                        this.f44468x0.scrollBy(0, (int) (f10 - this.E9));
                    }
                }
                this.P9 = false;
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31880x;
                if (qcVar != null && (ubVar = qcVar.e) != null) {
                    ubVar.updatePosition();
                }
                u7();
            }
        }
    }

    @Override
    public final void x() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void x6(MessageObject messageObject, Integer num) {
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

    public final void x7() {
        if (this.f44292j1 == null) {
            return;
        }
        this.Pc = H6(false);
        this.Qc = H6(true);
        this.S.setInputBubbleHeight(this.Pc);
        Jc();
        tc();
        t7();
        q7();
        v7();
        u7();
    }

    public final org.telegram.ui.Cells.z x8(int i10, boolean z10) {
        MessageObject messageObject;
        oj ojVar = this.f44468x0;
        if (ojVar != null) {
            int childCount = ojVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f44468x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.E9 - this.G9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f44468x0.getMeasuredHeight() - this.Na) {
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

    public final void x9() {
        if (!this.P9) {
            this.P9 = true;
            mm mmVar = this.f44292j1;
            if (mmVar != null) {
                mmVar.invalidate();
            }
            oj ojVar = this.f44468x0;
            if (ojVar != null) {
                ojVar.invalidate();
            }
        }
        UndoView undoView = this.K3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(g9(org.telegram.ui.Components.a41.f26408c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(16.0f));
        }
        C7();
    }

    public final void xa(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.f44327m1.e(true, false);
            } else if (getMessagesController().isCommunity(j10)) {
                showDialog(new ii.j0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new un(bundle));
                }
            }
        } else if (j10 != getUserConfig().getClientUserId()) {
            if (j10 == a()) {
                this.f44327m1.e(true, false);
                return;
            }
            Bundle h = a1.g.h(j10, "user_id");
            if (this.h != null && j10 == this.f44242f.f22174id) {
                h.putLong("dialog_id", this.f44249f6);
            }
            ProfileActivity profileActivity = new ProfileActivity(h, null);
            TLRPC.User user = this.f44242f;
            if (user != null && user.f22174id == j10) {
                i10 = 1;
            }
            profileActivity.X4(i10);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j10);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void xb(int i10, int i11, String str) {
        this.X7 = i10;
        this.Z7 = true;
        this.f44184a8 = 0L;
        this.f44198b8 = str;
        this.f44238e8 = i11;
        this.Y7 = true;
    }

    public final void xc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.f44439ub == null) {
            this.f44439ub = new a0.h();
        }
        a0.h hVar2 = this.f44426tb;
        if (hVar2 == null) {
            this.f44426tb = new a0.h();
        } else {
            hVar2.b();
        }
        this.A0.P.clear();
        this.f44439ub.b();
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
                int i12 = f44170dd;
                f44170dd = i12 + 1;
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
                    groupedMessages2.reversed = this.f44215cb;
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
            this.f44439ub.k(messageObject2, messageObject2.getId());
            i10++;
        }
        if (hVar3 != null) {
            for (int i14 = 0; i14 < hVar3.m(); i14++) {
                MessageObject.GroupedMessages groupedMessages3 = (MessageObject.GroupedMessages) hVar3.n(i14);
                Collections.sort(groupedMessages3.messages, new org.telegram.ui.ActionBar.n4(7));
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
            if (!this.f44439ub.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.A0.P.add(messageObject4);
                this.f44439ub.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.A0.P.size()) {
            MessageObject messageObject5 = (MessageObject) this.A0.P.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.f44439ub.d(messageObject6.getId())) {
                        this.A0.P.add(i18, messageObject6);
                        this.f44439ub.k(messageObject6, messageObject6.getId());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.A0.P, new org.telegram.ui.ActionBar.n4(8));
        MessageObject messageObject7 = null;
        int i19 = 0;
        while (i19 < this.A0.P.size()) {
            MessageObject messageObject8 = (MessageObject) this.A0.P.get(i19);
            if (this.f44215cb && messageObject8 != null && i19 == 0) {
                Ma(messageObject8, i19);
                i19++;
            }
            if (!this.f44215cb && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ma(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.f44426tb.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.t.k(messageObject8.dateKeyInt, this.f44426tb);
            }
            arrayList4.add(messageObject8);
            if (this.f44215cb && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Ma(messageObject8, i19);
                i19++;
            }
            if (!this.f44215cb && i19 >= this.A0.P.size() - 1) {
                Ma(messageObject8, this.A0.P.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.A0.O = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.A0.T();
            this.A0.O(true);
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.S6 || !arrayList.isEmpty() || this.A0.f39416w >= 0) {
                z11 = false;
            }
            bc(z11);
            if (this.f44468x0 != null) {
                N7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.S6 || !arrayList.isEmpty() || this.A0.f39416w >= 0)) {
                    this.f44468x0.setEmptyView(this.f44205c1);
                    oj ojVar = this.f44468x0;
                    ojVar.K0(ojVar.z1());
                    return;
                }
                this.f44205c1.setVisibility(8);
                this.f44468x0.setEmptyView(null);
            }
        }
    }

    public final void y6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.y6():void");
    }

    public final void y7() {
        int i10;
        un unVar = this.f44376pa;
        if (unVar != null) {
            unVar.y7();
        }
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) f9(AndroidUtilities.dp(7.0f)));
        sk skVar = this.A1;
        if (skVar != null) {
            i10 = AndroidUtilities.dp(skVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(I8() * 43.0f) + dp + i10;
        int dp3 = AndroidUtilities.dp(60.0f) + ((int) this.v.d());
        bi.r1 r1Var = this.X3;
        if (r1Var != null) {
            r1Var.setPadding(0, dp2, 0, dp3);
        }
        org.telegram.ui.Components.o40 o40Var = this.F1;
        if (o40Var != null) {
            o40Var.e.setPadding(0, dp2, 0, dp3);
            o40Var.d.setTranslationY((dp2 - dp3) / 2.0f);
        }
        bh.r rVar = this.W3;
        if (rVar != null) {
            lh.f fVar = (lh.f) rVar.f4113b;
            fVar.setFadeZoneTop(dp2);
            fVar.setFadeZoneBottom(dp3);
        }
        org.telegram.ui.Components.c10 c10Var = this.f44355o2;
        if (c10Var != null) {
            c10Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.ey0 ey0Var = this.f44368p2;
        if (ey0Var != null) {
            ey0Var.f28012a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final org.telegram.ui.Cells.v0 y8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f44468x0 != null && this.A0 != null) {
            for (int i10 = 0; i10 < this.f44468x0.getChildCount(); i10++) {
                View childAt = this.f44468x0.getChildAt(i10);
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
                    this.f44468x0.C0();
                    this.f44493z0.h1(this.A0.J + i11, 0);
                    return null;
                } else {
                    i11++;
                }
            }
        }
        return null;
    }

    public final void y9() {
        boolean z10;
        Rect rect;
        if (this.f44292j1 != null) {
            if (this.pb <= 0 && this.f44386qb <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            jj jjVar = this.v;
            float c10 = jjVar.c();
            oe.m mVar = jjVar.f47617b;
            int max = (int) Math.max(0.0f, (c10 * mVar.f19351a) - AndroidUtilities.dp(29.0f));
            mm mmVar = this.f44292j1;
            bi.cc ccVar = mmVar.L;
            Rect rect2 = this.ad;
            if (ccVar != null) {
                rect2.set(0, 0, mmVar.getMeasuredWidth(), this.f44292j1.getMeasuredHeight() - max);
                this.f44292j1.L.setClipBounds(rect2);
            }
            if (this.f44468x0 != null) {
                rect2.set(0, 0, this.f44292j1.getMeasuredWidth(), this.f44292j1.getMeasuredHeight() - max);
                rect2.offset(0, -this.f44468x0.getTop());
                oj ojVar = this.f44468x0;
                if (ojVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                ojVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.f44292j1.getMeasuredWidth(), this.f44292j1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(jjVar.v, jjVar.c() * mVar.f19351a) - AndroidUtilities.dp(29.0f))));
                lh.f fVar = this.X;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void ya(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.u1().M2(null, this, this.f44385qa);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.u1().T1()) {
                PhotoViewer.u1().H0(false, false);
            }
            PhotoViewer.u1().i2(arrayList, 0, 0, false, new nl(this, createVideoThumbnail, arrayList), this);
            return;
        }
        s8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.f44249f6, this.f44498z5, this.f44295j4, null, this.f44473x5, null, 0, this.B5, true, 0, 0, false, false, null, L8(), 0L, 0L, X8(), this.f44407s5);
        D6();
    }

    public final void yb(long j10) {
        this.f44370p4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22048id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void yc() {
        int i10;
        wj wjVar = this.f44306k3;
        if (wjVar == null) {
            return;
        }
        wjVar.setTranslationX(b9() / 2.0f);
        this.f44306k3.setTranslationY((((this.f44468x0.getTranslationY() + this.E9) + this.L9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.L9, -this.f44306k3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f44306k3.setAlpha(this.f44431u3 * clamp);
        wj wjVar2 = this.f44306k3;
        if (this.f44431u3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        wjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.f44306k3.setScaleX(lerp);
        this.f44306k3.setScaleY(lerp);
    }

    @Override
    public final void z(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            sh.c cVar = this.Zc;
            if (cVar != null) {
                this.f44292j1.removeView(cVar);
                this.Zc = null;
            }
            hk hkVar = this.Y;
            if (hkVar != null) {
                hkVar.F0();
            }
        }
    }

    public final void z6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.h hVar = this.I6;
            ArrayList arrayList = (ArrayList) hVar.f(pollId);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.t.k(pollId, hVar);
            }
            arrayList.add(messageObject);
            if (messageObject2 != null) {
                arrayList.remove(messageObject2);
            }
        }
    }

    public final void z7() {
        int i10;
        float f7 = (1.0f - this.Vc.e) * (1.0f - this.Tc.e);
        this.f44442v1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f44442v1.setAlpha(f7);
        lh.h hVar = this.f44442v1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final void z8() {
        if (this.f44461w7) {
            return;
        }
        this.f44461w7 = true;
        getMessagesController().checkSensitive(this, this.f44249f6, new le(this, 25), new kf(this, 18));
    }

    public final void z9() {
        this.Da = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void za() {
        this.f44182a6 = true;
        this.fragmentBeginToShow = true;
        this.f44276ha = null;
        this.f44292j1.invalidate();
        this.f44292j1.setSkipBackgroundDrawing(false);
        this.f44240ea = false;
        this.fragmentView.setAlpha(1.0f);
        this.f44327m1.setTranslationY(0.0f);
        this.f44327m1.getAvatarImageView().setScaleX(1.0f);
        this.f44327m1.getAvatarImageView().setScaleY(1.0f);
        this.f44327m1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void zb(View view) {
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

    public final void zc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f44334m8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f44334m8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f44218d1 != null) {
            if (z10 && this.f44244f1 == null) {
                mi miVar = new mi(getParentActivity(), getResourceProvider(), this);
                this.f44244f1 = miVar;
                org.telegram.ui.Components.gb1.c(miVar, 0.02f, 1.2f);
                this.f44244f1.setOnClickListener(new xe(this, 12));
            }
            mi miVar2 = this.f44244f1;
            if (miVar2 != null) {
                if (!z10) {
                    miVar2.setVisibility(8);
                    return;
                }
                miVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f44334m8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f44334m8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f44242f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        v01 v01Var = new v01(formatString.substring(indexOf, indexOf2));
                        if (v01Var.f44561c != -1) {
                            v01Var.f44561c = -1;
                            v01Var.invalidateSelf();
                        }
                        v01Var.a(503316480);
                        v01Var.setBounds(0, 0, v01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(v01Var), indexOf, indexOf2, 33);
                    }
                }
                this.f44244f1.setCustomText(spannableStringBuilder);
                this.f44244f1.setOverrideTextMaxWidth(fi.v3.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f44244f1.getParent() != null && (!z10 || this.f44244f1.getParent() != this.f44218d1)) {
                    ((ViewGroup) this.f44244f1.getParent()).removeView(this.f44244f1);
                }
                if (z10) {
                    ViewParent parent = this.f44244f1.getParent();
                    LinearLayout linearLayout = this.f44218d1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f44244f1, org.telegram.ui.Components.gb1.x(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final void P() {
    }

    public void fa(boolean z10) {
    }
}
