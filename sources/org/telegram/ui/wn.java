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
import android.view.ViewTreeObserver;
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
public class wn extends org.telegram.ui.ActionBar.r2 implements NotificationCenter.NotificationCenterDelegate, xx, mc0, org.telegram.ui.Components.ek, org.telegram.ui.Components.bh, og.b, org.telegram.ui.Components.a60, oe.d {
    public static int f45035fd = 22;
    public static float f45036gd = 1.4f;
    public static int f45037hd = 10;
    public static Pattern f45038id;
    public static Pattern f45039jd;
    public static Pattern f45040kd;
    public static final int[] f45041ld = {NotificationCenter.messagesRead, NotificationCenter.threadMessagesRead, NotificationCenter.monoForumMessagesRead, NotificationCenter.commentsRead, NotificationCenter.messagesReadEncrypted, NotificationCenter.messagesReadContent, NotificationCenter.didLoadPinnedMessages, NotificationCenter.newDraftReceived, NotificationCenter.updateMentionsCount, NotificationCenter.didUpdateConnectionState, NotificationCenter.updateDefaultSendAsPeer, NotificationCenter.closeChats, NotificationCenter.chatInfoCantLoad, NotificationCenter.userInfoDidLoad, NotificationCenter.pinnedInfoDidLoad, NotificationCenter.didSetNewWallpapper, NotificationCenter.savedMessagesDialogsUpdate, NotificationCenter.didApplyNewTheme, NotificationCenter.messageReceivedByServer2};
    public static boolean f45042md = false;
    public static final Rect f45043nd = new Rect();
    public hm A0;
    public uk A1;
    public org.telegram.ui.Components.t40 A2;
    public TLRPC.User A3;
    public final SparseArray A4;
    public MessageObject A5;
    public int A6;
    public boolean A7;
    public String A8;
    public ck A9;
    public boolean Aa;
    public zk Ab;
    public int Ac;
    public pk B0;
    public gk B1;
    public org.telegram.ui.Cells.s1 B2;
    public TLRPC.Chat B3;
    public final ArrayList B4;
    public mn B5;
    public int B6;
    public boolean B7;
    public MessageObject B8;
    public org.telegram.ui.Cells.s1 B9;
    public float Ba;
    public boolean Bb;
    public ValueAnimator Bc;
    public boolean C0;
    public fi.h1 C1;
    public int C2;
    public bh.x0 C3;
    public int C4;
    public boolean C5;
    public boolean C6;
    public boolean C7;
    public MessageObject C8;
    public org.telegram.ui.Components.z00 C9;
    public final kg Ca;
    public boolean Cb;
    public ri Cc;
    public org.telegram.ui.Components.aa0 D0;
    public int D1;
    public int D2;
    public boolean D3;
    public boolean D4;
    public MessageObject D5;
    public final ArrayList D6;
    public int D7;
    public int D8;
    public boolean D9;
    public final al Da;
    public boolean Db;
    public boolean Dc;
    public final se.b E;
    public TextView E0;
    public boolean E1;
    public org.telegram.ui.Components.t40 E2;
    public boolean E3;
    public boolean E4;
    public int E5;
    public final SparseArray[] E6;
    public int E7;
    public boolean E8;
    public boolean E9;
    public int Ea;
    public boolean Eb;
    public int Ec;
    public final ch.f F;
    public ok F0;
    public org.telegram.ui.Components.o40 F1;
    public org.telegram.ui.Components.t40 F2;
    public String F3;
    public int F4;
    public MessageObject F5;
    public final SparseArray F6;
    public boolean F7;
    public long F8;
    public ValueAnimator F9;
    public int Fa;
    public ArrayList Fb;
    public int Fc;
    public final int G;
    public RadialProgressView G0;
    public org.telegram.ui.ActionBar.e2 G1;
    public org.telegram.ui.Components.t40 G2;
    public String G3;
    public final ArrayList G4;
    public boolean G5;
    public final SparseArray G6;
    public ig G7;
    public long G8;
    public ValueAnimator G9;
    public jf Ga;
    public ValueAnimator Gb;
    public int Gc;
    public final hh.d H;
    public int H0;
    public fi.v3 H1;
    public org.telegram.ui.Components.dq H2;
    public int H3;
    public final HashMap H4;
    public boolean H5;
    public final HashMap H6;
    public String H7;
    public boolean H8;
    public boolean H9;
    public boolean Ha;
    public boolean Hb;
    public int Hc;
    public final hh.d I;
    public int I0;
    public fi.v3 I1;
    public View I2;
    public int I3;
    public MessageObject I4;
    public boolean I5;
    public final SparseArray I6;
    public boolean I7;
    public String I8;
    public float I9;
    public boolean Ia;
    public Boolean Ib;
    public int Ic;
    public ch.b J;
    public int J0;
    public fi.v3 J1;
    public gl J2;
    public int J3;
    public int J4;
    public boolean J5;
    public final a0.h J6;
    public boolean J7;
    public mk J8;
    public float J9;
    public long Ja;
    public boolean Jb;
    public boolean Jc;
    public ch.b K;
    public int K0;
    public fi.v3 K1;
    public fi.f6 K2;
    public UndoView K3;
    public int K4;
    public int K5;
    public final ArrayList K6;
    public int K7;
    public org.telegram.ui.Cells.s1 K8;
    public int K9;
    public int Ka;
    public boolean Kb;
    public long Kc;
    public final hh.e L;
    public int L0;
    public fi.v3 L1;
    public org.telegram.ui.Components.ug0 L2;
    public fl L3;
    public final ArrayList L4;
    public int L5;
    public final SparseArray L6;
    public int L7;
    public m4 L8;
    public int L9;
    public int La;
    public int Lb;
    public TLRPC.TL_messages_discussionMessage Lc;
    public ch.b M;
    public Drawable M0;
    public fi.v3 M1;
    public boolean M2;
    public org.telegram.ui.Components.qc M3;
    public int M4;
    public TLRPC.PhotoSize M5;
    public final a0.h M6;
    public int M7;
    public TextureView M8;
    public float M9;
    public sk Ma;
    public HashMap Mb;
    public TLRPC.messages_Messages Mc;
    public org.telegram.ui.ActionBar.e2 N;
    public Drawable N0;
    public tl N1;
    public final org.telegram.ui.Components.y9[] N2;
    public boolean N3;
    public int N4;
    public TLRPC.PhotoSize N5;
    public final a0.h N6;
    public int N7;
    public boolean N8;
    public float N9;
    public tk Na;
    public jf Nb;
    public boolean Nc;
    public boolean O;
    public Drawable O0;
    public float O1;
    public final vn[] O2;
    public int O3;
    public jf O4;
    public TLObject O5;
    public final int[] O6;
    public int O7;
    public final jf O8;
    public float O9;
    public boolean Oa;
    public int Ob;
    public on Oc;
    public FrameLayout P;
    public boolean P0;
    public TL_stories.TL_premium_boostsStatus P1;
    public final org.telegram.ui.ActionBar.b6[] P2;
    public boolean P3;
    public boolean P4;
    public int P5;
    public final int[] P6;
    public int P7;
    public final hh.b P8;
    public float P9;
    public float Pa;
    public org.telegram.ui.ActionBar.e2 Pb;
    public hn Pc;
    public fi.f6 Q;
    public int Q0;
    public ChannelBoostsController.CanApplyBoost Q1;
    public final ln[] Q2;
    public FlagSecureReason Q3;
    public boolean Q4;
    public int Q5;
    public final int[] Q6;
    public boolean Q7;
    public ch.b Q8;
    public float Q9;
    public int Qa;
    public int Qb;
    public bi.m7 Qc;
    public mk R;
    public final Set R0;
    public boolean R1;
    public NumberTextView R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public final int[] R6;
    public int R7;
    public Bitmap R8;
    public TLRPC.Document R9;
    public int Ra;
    public int Rb;
    public boolean Rc;
    public jh.f S;
    public final Set S0;
    public le S1;
    public int S2;
    public MessageObject S3;
    public int S4;
    public TLRPC.PhotoSize S5;
    public final boolean[] S6;
    public int S7;
    public BitmapShader S8;
    public boolean S9;
    public ChatMessageSharedResources Sa;
    public boolean Sb;
    public boolean Sc;
    public View T;
    public AnimatorSet T0;
    public ImageView T1;
    public final AnimatorSet[] T2;
    public int T3;
    public ArrayList T4;
    public TLRPC.PhotoSize T5;
    public final boolean[] T6;
    public int T7;
    public Paint T8;
    public boolean T9;
    public ValueAnimator Ta;
    public int Tb;
    public float Tc;
    public FrameLayout U;
    public boolean U0;
    public bk U1;
    public boolean U2;
    public MessageObject U3;
    public int U4;
    public TLObject U5;
    public final boolean[] U6;
    public boolean U7;
    public Matrix U8;
    public long U9;
    public float Ua;
    public boolean Ub;
    public float Uc;
    public FrameLayout V;
    public fi.v3 V0;
    public di.a3 V1;
    public ImageView V2;
    public MessageObject V3;
    public HashMap V4;
    public int V5;
    public boolean V6;
    public boolean V7;
    public Paint V8;
    public int V9;
    public el Va;
    public int Vb;
    public final oe.b Vc;
    public final jh.m W;
    public fi.v3 W0;
    public org.telegram.ui.ActionBar.q0 W1;
    public RadialProgressView W2;
    public bh.r W3;
    public final SparseArray W4;
    public TLRPC.WebPage W5;
    public boolean W6;
    public boolean W7;
    public final Paint W8;
    public int W9;
    public final ol Wa;
    public int Wb;
    public final oe.b Wc;
    public lh.f X;
    public fi.v3 X0;
    public TextView X1;
    public ImageView X2;
    public bi.r1 X3;
    public int X4;
    public ArrayList X5;
    public boolean X6;
    public int X7;
    public float X8;
    public int X9;
    public final vl Xa;
    public int Xb;
    public final oe.b Xc;
    public jk Y;
    public org.telegram.ui.Components.ch Y0;
    public boolean Y1;
    public AnimatorSet Y2;
    public ig.n1 Y3;
    public final int[] Y4;
    public String Y5;
    public boolean Y6;
    public boolean Y7;
    public boolean Y8;
    public int Y9;
    public ArrayList Ya;
    public CharacterStyle Yb;
    public final oe.b Yc;
    public kk Z;
    public boolean Z0;
    public TextView Z1;
    public FrameLayout Z2;
    public jh.e Z3;
    public int Z4;
    public k9.u Z5;
    public int Z6;
    public MessageObject Z7;
    public View Z8;
    public boolean Z9;
    public final fi Za;
    public String Zb;
    public final oe.b Zc;
    public int f45044a;
    public bh.r f45045a0;
    public nk f45046a1;
    public TextView a2;
    public rk f45047a3;
    public int f45048a4;
    public boolean f45049a5;
    public TLRPC.ChatInvite f45050a6;
    public int f45051a7;
    public MessageObject f45052a8;
    public float f45053a9;
    public boolean f45054aa;
    public final ki f45055ab;
    public qf.c f45056ac;
    public final oe.b ad;
    public boolean f45057b;
    public int f45058b0;
    public lh.c f45059b1;
    public vk f45060b2;
    public TextView f45061b3;
    public TL_account.TL_businessChatLink f45062b4;
    public int f45063b5;
    public le f45064b6;
    public long f45065b7;
    public int f45066b8;
    public float f45067b9;
    public boolean f45068ba;
    public final dj f45069bb;
    public boolean f45070bc;
    public final oe.b f45071bd;
    public boolean f45072c;
    public org.telegram.ui.ActionBar.u0 f45073c0;
    public FrameLayout f45074c1;
    public TextView f45075c2;
    public TextView f45076c3;
    public String f45077c4;
    public int f45078c5;
    public final LongSparseIntArray f45079c6;
    public boolean f45080c7;
    public boolean f45081c8;
    public Integer f45082c9;
    public org.telegram.ui.Components.si f45083ca;
    public final in f45084cb;
    public le f45085cc;
    public final k6.m f45086cd;
    public boolean d;
    public as f45087d0;
    public LinearLayout f45088d1;
    public org.telegram.ui.Components.f41 f45089d2;
    public mk f45090d3;
    public int f45091d4;
    public boolean f45092d5;
    public boolean f45093d6;
    public long f45094d7;
    public boolean f45095d8;
    public int f45096d9;
    public float f45097da;
    public final ig f45098db;
    public boolean f45099dc;
    public sh.c f45100dd;
    public TLRPC.Chat e;
    public org.telegram.ui.ActionBar.y f45101e0;
    public org.telegram.ui.Components.vo f45102e1;
    public jg.e f45103e2;
    public ImageView f45104e3;
    public int f45105e4;
    public boolean f45106e5;
    public boolean f45107e6;
    public final ArrayList f45108e7;
    public long f45109e8;
    public boolean f45110e9;
    public float f45111ea;
    public final ig eb;
    public boolean f45112ec;
    public final Rect ed;
    public TLRPC.User f45113f;
    public org.telegram.ui.ActionBar.u0 f45114f0;
    public pi f45115f1;
    public org.telegram.ui.Components.aa0 f45116f2;
    public ImageView f45117f3;
    public boolean f45118f4;
    public AnimatorSet f45119f5;
    public long f45120f6;
    public final Paint f7;
    public String f45121f8;
    public AnimatorSet f45122f9;
    public tp f45123fa;
    public boolean f45124fb;
    public final RectF f45125fc;
    public org.telegram.ui.ActionBar.u0 f45126g0;
    public jg.d2 f45127g1;
    public ImageView f45128g2;
    public org.telegram.ui.Components.s6 f45129g3;
    public String f45130g4;
    public final SparseIntArray f45131g5;
    public boolean f45132g6;
    public final Paint g7;
    public Integer f45133g8;
    public org.telegram.ui.ActionBar.o1 f45134g9;
    public Animator f45135ga;
    public boolean f45136gb;
    public org.telegram.ui.ActionBar.e2 gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.w0 f45137h0;
    public jg.a0 f45138h1;
    public hi.u f45139h2;
    public org.telegram.ui.Components.s6 f45140h3;
    public byte[] f45141h4;
    public final SparseIntArray f45142h5;
    public boolean f45143h6;
    public final ColorMatrix f45144h7;
    public byte[] f45145h8;
    public boolean f45146h9;
    public boolean f45147ha;
    public long f45148hb;
    public long f45149hc;
    public org.telegram.ui.ActionBar.y f45150i0;
    public jh.k f45151i1;
    public TextView f45152i2;
    public org.telegram.ui.Components.s6 f45153i3;
    public String f45154i4;
    public boolean f45155i5;
    public boolean f45156i6;
    public final m.d3 f45157i7;
    public int f45158i8;
    public org.telegram.ui.ActionBar.g1[] f45159i9;
    public boolean ia;
    public org.telegram.ui.Components.md f45160ib;
    public final ig f45161ic;
    public org.telegram.ui.ActionBar.w0 f45162j0;
    public om f45163j1;
    public dk f45164j2;
    public ak f45165j3;
    public MessageObject f45166j4;
    public boolean f45167j5;
    public long f45168j6;
    public final org.telegram.ui.ActionBar.l5 f45169j7;
    public int f45170j8;
    public org.telegram.ui.ActionBar.g1 f45171j9;
    public wn ja;
    public boolean f45172jb;
    public int f45173jc;
    public org.telegram.ui.ActionBar.w0 f45174k0;
    public org.telegram.ui.Components.qo f45175k1;
    public FrameLayout f45176k2;
    public yj f45177k3;
    public MessageObject f45178k4;
    public boolean f45179k5;
    public Long f45180k6;
    public long f45181k7;
    public le f45182k8;
    public final hk f45183k9;
    public float f45184ka;
    public boolean f45185kb;
    public boolean f45186kc;
    public org.telegram.ui.ActionBar.u0 f45187l0;
    public final ArrayList l1;
    public dk f45188l2;
    public org.telegram.ui.Cells.v0 f45189l3;
    public boolean l4;
    public boolean f45190l5;
    public int f45191l6;
    public int f45192l7;
    public String f45193l8;
    public im f45194l9;
    public AnimatorSet f45195la;
    public boolean f45196lb;
    public Pattern f45197lc;
    public org.telegram.ui.ActionBar.w0 m0;
    public lj f45198m1;
    public FrameLayout f45199m2;
    public int f45200m3;
    public ArrayList f45201m4;
    public boolean f45202m5;
    public final SparseArray[] f45203m6;
    public int f45204m7;
    public ChatObject.Call f45205m8;
    public qk f45206m9;
    public final rk f45207ma;
    public MessageObject f45208mb;
    public MessageObject f45209mc;
    public boolean f45210n;
    public org.telegram.ui.ActionBar.y f45211n0;
    public org.telegram.ui.Components.s6 f45212n1;
    public TextView f45213n2;
    public org.telegram.ui.Components.u60 f45214n3;
    public MessageObject f45215n4;
    public boolean f45216n5;
    public final SparseArray[] f45217n6;
    public final Matrix f45218n7;
    public boolean f45219n8;
    public int f45220n9;
    public wh.i f45221na;
    public boolean f45222nb;
    public cf f45223nc;
    public boolean f45224o0;
    public ih f45225o1;
    public org.telegram.ui.Components.c10 f45226o2;
    public View f45227o3;
    public TLRPC.TL_forumTopic f45228o4;
    public long f45229o5;
    public final SparseArray[] f45230o6;
    public LinearGradient f45231o7;
    public boolean f45232o8;
    public int f45233o9;
    public bh.x f45234oa;
    public boolean f45235ob;
    public ArrayList f45236oc;
    public RadialProgressView f45237p0;
    public org.telegram.ui.Components.uz0 f45238p1;
    public org.telegram.ui.Components.fy0 f45239p2;
    public boolean f45240p3;
    public long f45241p4;
    public boolean f45242p5;
    public boolean f45243p6;
    public int f45244p7;
    public TLRPC.ChatFull f45245p8;
    public int f45246p9;
    public f41 f45247pa;
    public int pb;
    public final BotForumHelper.BotDraftAnimationsPool pc;
    public org.telegram.ui.ActionBar.u0 f45248q0;
    public org.telegram.ui.ActionBar.u0 f45249q1;
    public org.telegram.ui.Components.t40 f45250q2;
    public boolean f45251q3;
    public int f45252q4;
    public boolean q5;
    public int f45253q6;
    public int f45254q7;
    public TLRPC.UserFull f45255q8;
    public boolean q9;
    public boolean f45256qa;
    public int f45257qb;
    public final jh.a f45258qc;
    public long f45259r;
    public org.telegram.ui.ActionBar.u0 f45260r0;
    public org.telegram.ui.ActionBar.u0 f45261r1;
    public org.telegram.ui.Components.t40 f45262r2;
    public boolean f45263r3;
    public TLRPC.Chat f45264r4;
    public boolean f45265r5;
    public int r6;
    public final Paint f45266r7;
    public org.telegram.ui.Cells.k6 f45267r8;
    public boolean f45268r9;
    public org.telegram.ui.Components.zp f45269ra;
    public NotificationCenter.ObserversGroup f45270rb;
    public boolean f45271rc;
    public final HashMap f45272s;
    public org.telegram.ui.ActionBar.u0 f45273s0;
    public org.telegram.ui.ActionBar.u0 f45274s1;
    public ej f45275s2;
    public AnimatorSet f45276s3;
    public boolean f45277s4;
    public MessageObject f45278s5;
    public int f45279s6;
    public final Matrix f45280s7;
    public a11 f45281s8;
    public pm f45282s9;
    public un f45283sa;
    public boolean f45284sb;
    public boolean f45285sc;
    public org.telegram.ui.ActionBar.u0 f45286t0;
    public org.telegram.ui.ActionBar.u0 f45287t1;
    public boolean f45288t2;
    public ValueAnimator f45289t3;
    public boolean f45290t4;
    public MessageObject f45291t5;
    public int f45292t6;
    public LinearGradient f45293t7;
    public final a0.h f45294t8;
    public View f45295t9;
    public wn f45296ta;
    public int f45297tb;
    public boolean f45298tc;
    public ClippingImageView f45299u0;
    public org.telegram.ui.Components.bp f45300u1;
    public org.telegram.ui.Components.t40 f45301u2;
    public float f45302u3;
    public boolean f45303u4;
    public MessageObject.GroupedMessages f45304u5;
    public int f45305u6;
    public boolean f45306u7;
    public String f45307u8;
    public boolean f45308u9;
    public un f45309ua;
    public int f45310ub;
    public long f45311uc;
    public final mj v;
    public org.telegram.ui.Components.h21 f45312v0;
    public lh.h f45313v1;
    public boolean f45314v2;
    public boolean f45315v3;
    public boolean f45316v4;
    public MessagePreviewParams f45317v5;
    public int f45318v6;
    public boolean f45319v7;
    public long f45320v8;
    public boolean f45321v9;
    public yh.d va;
    public boolean f45322vb;
    public boolean f45323vc;
    public fj f45324w;
    public jh.g f45325w0;
    public boolean f45326w1;
    public org.telegram.ui.Components.t40 f45327w2;
    public boolean f45328w3;
    public int f45329w4;
    public MessageSuggestionParams f45330w5;
    public int f45331w6;
    public int f45332w7;
    public String f45333w8;
    public boolean f45334w9;
    public final ChatMessagesMetadataController f45335wa;
    public boolean f45336wb;
    public boolean f45337wc;
    public fj f45338x;
    public rj f45339x0;
    public int f45340x1;
    public org.telegram.ui.Components.t40 f45341x2;
    public boolean f45342x3;
    public int f45343x4;
    public MessageObject f45344x5;
    public final ArrayList f45345x6;
    public boolean f45346x7;
    public boolean f45347x8;
    public ml x9;
    public TLRPC.TL_channels_sendAsPeers f45348xa;
    public a0.h f45349xb;
    public boolean f45350xc;
    public final se.b f45351y;
    public tj f45352y0;
    public int f45353y1;
    public org.telegram.ui.Components.t40 f45354y2;
    public boolean y3;
    public int f45355y4;
    public MessageObject.GroupedMessages f45356y5;
    public boolean f45357y6;
    public boolean f45358y7;
    public boolean f45359y8;
    public boolean f45360y9;
    public TL_account.resolvedBusinessChatLinks f45361ya;
    public a0.h f45362yb;
    public boolean f45363yc;
    public uj f45364z0;
    public org.telegram.ui.Components.qc f45365z1;
    public org.telegram.ui.Components.t40 f45366z2;
    public boolean f45367z3;
    public th f45368z4;
    public MessageObject.GroupedMessages f45369z5;
    public int f45370z6;
    public int f45371z7;
    public String f45372z8;
    public float f45373z9;
    public boolean f45374za;
    public long f45375zb;
    public d9 zc;

    public wn(Bundle bundle) {
        super(bundle);
        this.f45044a = 0;
        this.f45072c = false;
        this.d = false;
        this.f45272s = new HashMap();
        this.v = new mj(this, new jf(this, 25));
        se.b bVar = new se.b();
        this.f45351y = bVar;
        se.b bVar2 = new se.b();
        this.E = bVar2;
        this.W = new jh.m();
        this.H0 = org.telegram.ui.ActionBar.y6.Sh;
        this.Q0 = -1;
        this.R0 = Collections.newSetFromMap(new WeakHashMap());
        this.S0 = Collections.newSetFromMap(new WeakHashMap());
        this.l1 = new ArrayList();
        this.N2 = new org.telegram.ui.Components.y9[2];
        this.O2 = new vn[2];
        this.P2 = new org.telegram.ui.ActionBar.b6[2];
        this.Q2 = new ln[2];
        this.T2 = new AnimatorSet[2];
        this.U2 = false;
        this.f45200m3 = 500;
        this.f45062b4 = null;
        this.f45105e4 = -1;
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
        this.f45131g5 = new SparseIntArray();
        this.f45142h5 = new SparseIntArray();
        this.f45242p5 = true;
        this.f45265r5 = true;
        this.G5 = true;
        this.J5 = true;
        this.f45079c6 = new LongSparseIntArray();
        this.f45191l6 = 1;
        this.f45203m6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f45217n6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f45230o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f45345x6 = new ArrayList();
        this.f45357y6 = true;
        this.A6 = Integer.MIN_VALUE;
        this.D6 = new ArrayList();
        this.E6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.F6 = new SparseArray();
        this.G6 = new SparseArray();
        this.H6 = new HashMap();
        this.I6 = new SparseArray();
        this.J6 = new a0.h();
        this.K6 = new ArrayList();
        this.L6 = new SparseArray();
        this.M6 = new a0.h();
        this.N6 = new a0.h();
        this.O6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.P6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.Q6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.R6 = new int[2];
        this.S6 = new boolean[2];
        this.T6 = new boolean[2];
        this.U6 = new boolean[]{true, true};
        this.W6 = true;
        this.X6 = true;
        this.f45051a7 = 0;
        this.f45108e7 = new ArrayList();
        this.f7 = new Paint(1);
        this.g7 = new Paint(1);
        this.f45144h7 = new ColorMatrix();
        this.f45157i7 = new m.d3();
        this.f45169j7 = new org.telegram.ui.ActionBar.l5(0, false, false, new zj(this, 0));
        this.f45218n7 = new Matrix();
        Paint paint = new Paint(1);
        this.f45266r7 = paint;
        this.f45280s7 = new Matrix();
        this.D7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(AndroidUtilities.dp(1.0f));
        this.N7 = Integer.MAX_VALUE;
        this.O7 = -1;
        this.W7 = true;
        this.f45066b8 = Integer.MAX_VALUE;
        this.f45158i8 = -1;
        this.f45170j8 = -10000;
        this.f45294t8 = new a0.h();
        this.O8 = new jf(this, 28);
        hh.b bVar3 = new hh.b();
        this.P8 = bVar3;
        this.Q8 = new ch.b(bVar3);
        this.W8 = new Paint(1);
        this.X8 = 0.0f;
        this.f45053a9 = 1.0f;
        this.f45067b9 = 0.0f;
        this.f45146h9 = true;
        this.f45183k9 = new hk(this);
        this.D9 = true;
        this.f45207ma = new rk(this, 0);
        this.f45335wa = new ChatMessagesMetadataController(this);
        this.Ca = new kg(this, 0);
        this.Da = new al(this);
        this.Fa = -1;
        this.Wa = new ol(this);
        this.Xa = new vl(this);
        this.Za = new fi(this);
        this.f45055ab = new ki(this);
        this.f45069bb = new dj(this);
        this.f45084cb = new in(this);
        this.f45098db = new ig(this, 2);
        this.eb = new ig(this, 7);
        this.f45257qb = Integer.MIN_VALUE;
        this.Db = false;
        this.f45125fc = new RectF();
        this.f45161ic = new ig(this, 9);
        this.pc = new BotForumHelper.BotDraftAnimationsPool();
        this.f45258qc = new Object();
        this.Dc = false;
        org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
        this.Vc = new oe.b(0, this, dsVar, 320L, false);
        this.Wc = new oe.b(1, this, dsVar, 520L, false);
        this.Xc = new oe.b(2, this, dsVar, 520L, false);
        this.Yc = new oe.b(3, this, dsVar, 320L, false);
        this.Zc = new oe.b(4, this, dsVar, 320L, false);
        this.ad = new oe.b(5, this, dsVar, 320L, false);
        this.f45071bd = new oe.b(6, this, dsVar, 320L, false);
        ig igVar = new ig(this, 11);
        ?? obj = new Object();
        obj.f16423b = new float[32];
        obj.f16422a = 1;
        obj.d = new oe.l(obj, ne.a.f18778a, 240L);
        obj.f16424c = igVar;
        this.f45086cd = obj;
        this.ed = new Rect();
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
            dVar.f12840f = obj2;
            ch.b bVar4 = new ch.b(dVar);
            this.K = bVar4;
            bVar4.f6303i = LiteMode.isEnabled(262144);
            if (LiteMode.isEnabled(262144)) {
                hh.d dVar2 = new hh.d(obj2);
                this.H = dVar2;
                dVar2.d = fVar;
                dVar2.e = -2;
                dVar2.f12840f = obj2;
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
        this.Q8.e = new se.b();
        this.M.d = bVar2;
        this.J.d = bVar2;
        this.K.d = bVar2;
        this.Q8.d = bVar2;
    }

    public static void A0(wn wnVar) {
        long j10;
        ArrayList arrayList = wnVar.f45345x6;
        arrayList.add(Integer.valueOf(wnVar.f45191l6));
        if (wnVar.f45091d4 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(wnVar.currentAccount);
            String str = wnVar.G3;
            int i10 = wnVar.classGuid;
            int i11 = wnVar.f45048a4;
            int i12 = wnVar.f45191l6;
            wnVar.f45191l6 = i12 + 1;
            hashtagSearchController.searchHashtag(str, i10, i11, i12);
        } else if (wnVar.M7 != 0) {
            MessagesController messagesController = wnVar.getMessagesController();
            long j11 = wnVar.f45168j6;
            long j12 = wnVar.f45065b7;
            int i13 = wnVar.M7;
            int i14 = wnVar.classGuid;
            int i15 = wnVar.f45091d4;
            long j13 = wnVar.f45241p4;
            int i16 = wnVar.f45355y4;
            int i17 = wnVar.f45191l6;
            wnVar.f45191l6 = i17 + 1;
            messagesController.loadMessages(j11, j12, false, 30, 0, i13, true, 0, i14, 4, 0, i15, j13, i16, i17, wnVar.f45290t4);
        } else if (wnVar.K7 != 0 && (!wnVar.R9() || wnVar.K7 == wnVar.f45066b8 || wnVar.f45290t4)) {
            int i18 = wnVar.f45371z7;
            if (i18 != 0) {
                wnVar.f45065b7 = i18;
                MessagesController messagesController2 = wnVar.getMessagesController();
                long j14 = wnVar.f45065b7;
                boolean z10 = wnVar.f45346x7;
                int i19 = wnVar.f45332w7;
                int i20 = wnVar.K7;
                int i21 = wnVar.classGuid;
                int i22 = wnVar.f45091d4;
                long j15 = wnVar.f45241p4;
                int i23 = wnVar.f45355y4;
                int i24 = wnVar.f45191l6;
                wnVar.f45191l6 = i24 + 1;
                messagesController2.loadMessages(j14, 0L, z10, i19, i20, 0, true, 0, i21, 3, 0, i22, j15, i23, i24, wnVar.f45290t4);
            } else {
                MessagesController messagesController3 = wnVar.getMessagesController();
                long j16 = wnVar.f45168j6;
                long j17 = wnVar.f45065b7;
                boolean z11 = wnVar.f45346x7;
                int i25 = wnVar.f45332w7;
                int i26 = wnVar.K7;
                int i27 = wnVar.classGuid;
                int i28 = wnVar.f45091d4;
                long j18 = wnVar.f45241p4;
                int i29 = wnVar.f45355y4;
                int i30 = wnVar.f45191l6;
                wnVar.f45191l6 = i30 + 1;
                messagesController3.loadMessages(j16, j17, z11, i25, i26, 0, true, 0, i27, 3, 0, i28, j18, i29, i30, wnVar.f45290t4);
            }
        } else if (wnVar.f45358y7) {
            wnVar.f45191l6++;
        } else {
            MessagesController messagesController4 = wnVar.getMessagesController();
            long j19 = wnVar.f45168j6;
            long j20 = wnVar.f45065b7;
            boolean z12 = wnVar.f45346x7;
            int i31 = wnVar.f45332w7;
            int i32 = wnVar.K7;
            int i33 = wnVar.classGuid;
            int i34 = wnVar.f45091d4;
            long j21 = wnVar.f45241p4;
            int i35 = wnVar.f45355y4;
            int i36 = wnVar.f45191l6;
            wnVar.f45191l6 = i36 + 1;
            messagesController4.loadMessages(j19, j20, z12, i31, i32, 0, true, 0, i33, 2, 0, i34, j21, i35, i36, wnVar.f45290t4);
        }
        int i37 = wnVar.f45091d4;
        if (i37 == 0 || (i37 == 3 && wnVar.V8() == wnVar.getUserConfig().getClientUserId())) {
            if (wnVar.R9() && !wnVar.f45290t4) {
                return;
            }
            arrayList.add(Integer.valueOf(wnVar.f45191l6));
            MessagesController messagesController5 = wnVar.getMessagesController();
            long j22 = wnVar.f45168j6;
            long j23 = wnVar.f45065b7;
            int i38 = wnVar.classGuid;
            if (wnVar.f45091d4 == 3) {
                j10 = 0;
            } else {
                j10 = wnVar.f45241p4;
            }
            long j24 = j10;
            int i39 = wnVar.f45355y4;
            int i40 = wnVar.f45191l6;
            wnVar.f45191l6 = i40 + 1;
            messagesController5.loadMessages(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 0, 1, j24, i39, i40, wnVar.f45290t4);
        }
    }

    public static void A1(wn wnVar, TLRPC.Document document) {
        wnVar.H4.put(document, 0);
        SendMessagesHelper.getInstance(wnVar.currentAccount).sendSticker(document, null, wnVar.f45168j6, null, null, null, wnVar.B5, null, true, 0, 0, false, null, wnVar.O8(), 0L, wnVar.a9(), wnVar.f45330w5);
    }

    public static void B0(wn wnVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, q6 q6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f22049id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new MessageObject(wnVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, DialogObject.getPeerDialogId(tL_webPageAttributeStory.peer));
            wnVar.getMessagesController().getStoriesController().f8636k.d(hVar, new ed(14, hVar, q6Var), wnVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void B1(wn wnVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        wn wnVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic findTopic;
        jh.a aVar = wnVar.f45258qc;
        if (num.intValue() != wnVar.b()) {
            wnVar.Nc = false;
            cf cfVar = wnVar.f45223nc;
            if (cfVar != null) {
                AndroidUtilities.cancelRunOnUIThread(cfVar);
                wnVar.f45223nc.run();
                wnVar.f45223nc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.f41 f41Var = wnVar.f45089d2;
            long intValue = num.intValue();
            ArrayList<TLRPC.TL_forumTopic> topics = MessagesController.getInstance(f41Var.f28013b).getTopicsController().getTopics(-f41Var.f28015c);
            if (topics != null) {
                int size = topics.size();
                int i12 = 0;
                while (i12 < size) {
                    TLRPC.TL_forumTopic tL_forumTopic3 = topics.get(i12);
                    i12++;
                    tL_forumTopic = tL_forumTopic3;
                    if (tL_forumTopic.f22080id == intValue) {
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
            if (message == null && tL_forumTopic != null && (findTopic = wnVar.getMessagesController().getTopicsController().findTopic(-wnVar.a(), tL_forumTopic.f22080id)) != null) {
                message = findTopic.topicStartMessage;
                tL_forumTopic2 = findTopic;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                wnVar.f45375zb = SystemClock.uptimeMillis();
                wnVar.F7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    wnVar.eb(wnVar.b());
                } else if (wnVar.b() == 0) {
                    wnVar.eb(num.intValue());
                } else {
                    wnVar.D7 = -1;
                }
                wnVar.getConnectionsManager().cancelRequestsForGuid(wnVar.classGuid);
                wnVar.getMessagesStorage().cancelTasksForGuid(wnVar.classGuid);
                wnVar.classGuid = ConnectionsManager.generateClassGuid();
                wnVar.bb();
                wnVar.f45317v5 = null;
                wnVar.K7 = 0;
                wnVar.A7 = false;
                wnVar.B7 = true;
                wnVar.f45345x6.clear();
                wnVar.f45072c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new MessageObject(wnVar.getCurrentAccount(), message, false, false));
                    wnVar2 = wnVar;
                    wnVar2.Eb(arrayList, wnVar.e, tL_forumTopic2.f22080id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    wnVar2 = wnVar;
                    wnVar2.f45228o4 = null;
                    wnVar2.f45201m4 = null;
                    wnVar2.f45166j4 = null;
                    wnVar2.D5 = null;
                    wnVar2.f45329w4 = 0;
                    wnVar2.f45343x4 = 0;
                    wnVar2.f45355y4 = 0;
                    wnVar2.f45241p4 = 0L;
                    wnVar2.f45252q4 = 0;
                    wnVar2.f45264r4 = null;
                    wnVar2.f45290t4 = false;
                    wnVar2.f45277s4 = false;
                }
                hm hmVar = wnVar2.A0;
                if (hmVar != null) {
                    if (hmVar.I >= 0 && !hmVar.N()) {
                        hm hmVar2 = wnVar2.A0;
                        hmVar2.u(hmVar2.I);
                    } else {
                        hm hmVar3 = wnVar2.A0;
                        if (hmVar3.I < 0 && hmVar3.N()) {
                            wnVar2.A0.o(0);
                        }
                    }
                    wnVar2.A0.T();
                }
                wnVar2.C8();
                wnVar2.ed(true);
                wnVar2.f45198m1.n(true);
                if (tL_forumTopic2 != null) {
                    wnVar2.kd();
                } else {
                    wnVar2.f45198m1.b();
                }
                wnVar2.f45089d2.setCurrentTopic(wnVar2.b());
                wnVar2.hd(true);
                wnVar2.yc(true);
                wnVar2.getMessagesController().setForumLastTopicId(-wnVar2.a(), wnVar2.b());
                wnVar2.Qa();
                wnVar2.s9(true);
                wnVar2.r9(true);
                wnVar2.G6(true, true);
                if (wnVar2.Y != null) {
                    if (!UserObject.isBotForum(wnVar2.f45113f)) {
                        wnVar2.Y.i0(false);
                    }
                    wnVar2.Y.D1(true);
                }
                if (tL_forumTopic2 != null) {
                    wnVar2.getMessagesController().getTopicsController().getTopicRepliesCount(wnVar2.f45168j6, tL_forumTopic2.f22080id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                wnVar2.f45340x1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                wnVar2.f45353y1 = i11;
                wnVar2.Sc(false);
                wnVar2.Rc(false);
                wnVar2.id();
                on onVar = wnVar2.Oc;
                if (onVar != null && wnVar2.actionBar.f22775n0) {
                    onVar.k(null);
                }
                if (UserObject.isBotForum(wnVar2.f45113f)) {
                    wnVar2.getMediaDataController().loadBotKeyboard(MessagesStorage.TopicKey.of(wnVar2.f45168j6, num.intValue()), true);
                }
            }
        }
    }

    public static void C0(wn wnVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        SendMessagesHelper.getInstance(wnVar.currentAccount).sendSticker(tL_document, str, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, null, wnVar.B5, null, z10, i10, 0, false, obj, wnVar.O8(), 0L, wnVar.a9(), wnVar.f45330w5);
    }

    public static void C1(wn wnVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        tg.m1 m1Var = new tg.m1(wnVar, wnVar.currentAccount, user, null, null, wnVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            m1Var.D0 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(wnVar.getParentActivity());
        org.telegram.ui.Components.r5 r5Var = new org.telegram.ui.Components.r5(AndroidUtilities.dp(160.0f), 4, y9Var, false);
        y9Var.setImageDrawable(r5Var);
        y9Var.addOnAttachStateChangeListener(new i5(r5Var, 1));
        r5Var.j(j10, false);
        m1Var.E0 = true;
        m1Var.B0 = y9Var;
        wnVar.showDialog(m1Var);
    }

    public static void D0(wn wnVar) {
        wnVar.f45269ra = null;
        wnVar.f45339x0.setOnInterceptTouchListener(null);
        wnVar.yb(wnVar.f45163j1, true);
        ChatThemeController.getInstance(wnVar.currentAccount).clearWallpaperThumbImages();
    }

    public static void D1(wn wnVar, Context context) {
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
        SparseArray[] sparseArrayArr = wnVar.f45203m6;
        if (wnVar.getParentActivity() != null && wnVar.f45097da == 0.0f) {
            if (wnVar.f45091d4 == 3) {
                Bundle bundle = new Bundle();
                long V8 = wnVar.V8();
                if (V8 >= 0) {
                    bundle.putLong("user_id", V8);
                } else {
                    bundle.putLong("chat_id", -V8);
                }
                wnVar.presentFragment(new wn(bundle));
                return;
            }
            boolean z15 = false;
            if (wnVar.M9()) {
                ArrayList arrayList = new ArrayList();
                for (int i14 = 0; i14 < sparseArrayArr[0].size(); i14++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i14)));
                }
                wnVar.Kb(true, true);
                byte[] bArr = wnVar.f45141h4;
                String str2 = wnVar.f45154i4;
                ye yeVar = new ye(wnVar, 2);
                int i15 = x21.f45461w;
                int currentAccount = wnVar.getCurrentAccount();
                Activity parentActivity = wnVar.getParentActivity();
                long a2 = wnVar.a();
                if (parentActivity != null) {
                    x21.N(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.wc.b0(wnVar), wnVar.getResourceProvider(), bArr, str2, yeVar);
                }
            } else if (wnVar.f45091d4 == 2) {
                wnVar.finishFragment();
                im imVar = wnVar.f45194l9;
                if (wnVar.B0.getTag() == null) {
                    z15 = true;
                }
                imVar.T(true, z15);
            } else {
                TLRPC.User user = wnVar.f45113f;
                if (user != null && user.f22177id == 489000) {
                    wnVar.rc(true);
                } else if (user != null && wnVar.f45210n) {
                    if (user.bot) {
                        String str3 = wnVar.f45307u8;
                        wnVar.f45307u8 = null;
                        wnVar.getMessagesController().unblockPeer(wnVar.f45113f.f22177id, new se(wnVar, str3, 3));
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                    String string = LocaleController.getString(R.string.AreYouSureUnblockContact);
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.T = string;
                    alertDialog$Builder.k(LocaleController.getString(R.string.OK), new qe(wnVar, 8));
                    e2Var.R = LocaleController.getString(R.string.AppName);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    wnVar.showDialog(e2Var);
                } else if (UserObject.isReplyUser(user)) {
                    wnVar.rc(true);
                } else {
                    TLRPC.User user2 = wnVar.f45113f;
                    if (user2 != null && user2.bot && (str = wnVar.f45307u8) != null) {
                        if (str.length() != 0) {
                            wnVar.getMessagesController().sendBotStart(wnVar.f45113f, wnVar.f45307u8);
                        } else {
                            wnVar.getSendMessagesHelper().sendMessage(SendMessagesHelper.SendMessageParams.of("/start", wnVar.f45168j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        wnVar.f45307u8 = null;
                        wnVar.yc(false);
                        return;
                    }
                    if (ChatObject.isChannel(wnVar.e)) {
                        TLRPC.Chat chat = wnVar.e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (!wnVar.f45185kb) {
                                if (ChatObject.isNotInChat(chat) && (!wnVar.J9() || !wnVar.e.in_news)) {
                                    if (wnVar.e.join_request) {
                                        wnVar.Kb(true, true);
                                        MessagesController messagesController = MessagesController.getInstance(wnVar.currentAccount);
                                        long j10 = wnVar.e.f22028id;
                                        TLRPC.User currentUser = UserConfig.getInstance(wnVar.currentAccount).getCurrentUser();
                                        le leVar = new le(wnVar, 19);
                                        m4.s0 s0Var = new m4.s0(14, wnVar, context);
                                        if (wnVar.J9() && wnVar.f45172jb) {
                                            z14 = true;
                                        } else {
                                            z14 = false;
                                        }
                                        messagesController.addUserToChat(j10, currentUser, 0, null, null, true, leVar, s0Var, null, z14);
                                        return;
                                    }
                                    le leVar2 = wnVar.f45064b6;
                                    if (leVar2 != null) {
                                        AndroidUtilities.cancelRunOnUIThread(leVar2);
                                        wnVar.f45064b6 = null;
                                    }
                                    if (wnVar.J9() && wnVar.f45172jb) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    wnVar.Kb(true, true);
                                    wnVar.getMessagesController().addUserToChat(wnVar.e.f22028id, wnVar.getUserConfig().getCurrentUser(), 0, null, wnVar, false, new af(wnVar, z13, 0), null, null, z13);
                                    NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeSearchByActiveAction, new Object[0]);
                                    org.telegram.ui.ActionBar.q0 q0Var = wnVar.W1;
                                    if (q0Var != null && (chVar = wnVar.Y0) != null && chVar.d(q0Var) && wnVar.Z1.getVisibility() != 8 && wnVar.Z1.getTag(R.id.object_tag) != null) {
                                        MessagesController.getNotificationsSettings(wnVar.currentAccount).edit().putInt("dialog_bar_vis3" + wnVar.f45168j6, 3).commit();
                                        wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.peerSettingsDidLoad, Long.valueOf(wnVar.f45168j6));
                                        return;
                                    }
                                    return;
                                } else if (wnVar.J9()) {
                                    if (wnVar.J9() && !wnVar.f45185kb && wnVar.getParentActivity() != null) {
                                        boolean z16 = wnVar.e.in_news;
                                        boolean isDialogMuted = wnVar.getMessagesController().isDialogMuted(wnVar.f45168j6, 0L);
                                        TLRPC.Dialog dialog = (TLRPC.Dialog) wnVar.getMessagesController().dialogs_dict.f(wnVar.f45168j6);
                                        if (dialog != null && dialog.folder_id == 1) {
                                            z12 = true;
                                        } else {
                                            z12 = false;
                                        }
                                        org.telegram.ui.Components.md mdVar = wnVar.f45160ib;
                                        if (mdVar == null || !mdVar.isShowing()) {
                                            org.telegram.ui.Components.md mdVar2 = new org.telegram.ui.Components.md(wnVar.f45046a1, wnVar.f45309ua, wnVar.J);
                                            wnVar.f45160ib = mdVar2;
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
                                                mdVar2.b(i12, LocaleController.getString(i13), false, new af(wnVar, isDialogMuted, 2));
                                            }
                                            if (z16) {
                                                mdVar2.b(R.drawable.msg2_chats_add, LocaleController.getString(R.string.ChannelAddToChats), false, new jf(wnVar, 16));
                                                mdVar2.b(R.drawable.msg_leave, LocaleController.getString(R.string.ChannelRemoveFromNews), true, new jf(wnVar, 17));
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
                                                mdVar2.b(i10, LocaleController.getString(i11), false, new af(wnVar, z12, 3));
                                                mdVar2.b(R.drawable.msg_chats_remove, LocaleController.getString(R.string.ChannelRemoveFromChats), true, new jf(wnVar, 18));
                                            }
                                            if (!mdVar2.isShowing()) {
                                                FrameLayout frameLayout = mdVar2.f30503b;
                                                if (frameLayout.isAttachedToWindow() && frameLayout.getWidth() != 0) {
                                                    Rect rect = new Rect();
                                                    frameLayout.getWindowVisibleDisplayFrame(rect);
                                                    int[] iArr = new int[2];
                                                    frameLayout.getLocationOnScreen(iArr);
                                                    int g7 = d3.g(32.0f, rect.width(), AndroidUtilities.dp(232.0f));
                                                    int min = Math.min(AndroidUtilities.dp(16.0f) + Math.max(g7, frameLayout.getWidth()), rect.width());
                                                    org.telegram.ui.Components.ld ldVar = mdVar2.f30504c;
                                                    LinearLayout linearLayout = ldVar.f30230a;
                                                    int dp = AndroidUtilities.dp(16.0f) + (AndroidUtilities.dp(48.0f) * linearLayout.getChildCount());
                                                    mdVar2.setWidth(min);
                                                    mdVar2.setHeight(dp);
                                                    int max = Math.max(rect.left, Math.min(rect.right - min, ((frameLayout.getWidth() - min) / 2) + iArr[0]));
                                                    int dp2 = (AndroidUtilities.dp(8.0f) + (frameLayout.getHeight() + iArr[1])) - dp;
                                                    ldVar.f30231b.set(iArr[0] - max, (dp - AndroidUtilities.dp(8.0f)) - frameLayout.getHeight(), frameLayout.getWidth() + (iArr[0] - max), dp - AndroidUtilities.dp(8.0f));
                                                    int i16 = min - g7;
                                                    ldVar.f30232c.set(i16 / 2.0f, AndroidUtilities.dp(8.0f), (min + g7) / 2.0f, dp - AndroidUtilities.dp(8.0f));
                                                    FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) linearLayout.getLayoutParams();
                                                    layoutParams.width = g7;
                                                    layoutParams.height = dp - AndroidUtilities.dp(16.0f);
                                                    layoutParams.leftMargin = i16 / 2;
                                                    layoutParams.topMargin = AndroidUtilities.dp(8.0f);
                                                    linearLayout.setLayoutParams(layoutParams);
                                                    mdVar2.f30505f = Bitmap.createBitmap(frameLayout.getWidth(), frameLayout.getHeight(), Bitmap.Config.ARGB_8888);
                                                    frameLayout.draw(new Canvas(mdVar2.f30505f));
                                                    ldVar.f30234n = 0.0f;
                                                    mdVar2.f30506g = false;
                                                    mdVar2.showAtLocation(frameLayout, 51, max, dp2);
                                                    frameLayout.addOnAttachStateChangeListener(mdVar2.f30507i);
                                                    mdVar2.f30502a.setCenterMenuVisible(true);
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
                                    wnVar.rc(true);
                                    return;
                                }
                            }
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = wnVar.f45245p8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = wnVar.e;
                    TLRPC.User user3 = wnVar.f45113f;
                    if (wnVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.g5.r(wnVar, false, chat2, user3, z11, true, false, z10, new qe(wnVar, 9));
                }
            }
        }
    }

    public static void E0(wn wnVar, TLRPC.Document document) {
        wnVar.H4.put(document, 0);
        SendMessagesHelper.getInstance(wnVar.currentAccount).sendSticker(document, null, wnVar.f45168j6, null, null, null, wnVar.B5, null, true, 0, 0, false, null, wnVar.O8(), 0L, wnVar.a9(), wnVar.f45330w5);
    }

    public static void F0(wn wnVar, org.telegram.ui.Components.l80 l80Var) {
        if (wnVar.f45209mc == null) {
            return;
        }
        l80Var.u();
        wnVar.W9(wnVar.f45209mc, false, true);
        qf.d.q(wnVar.getParentActivity(), Uri.parse(wnVar.f45209mc.sponsoredUrl), true, false, false, null, null, false, MessagesController.getInstance(wnVar.currentAccount).sponsoredLinksInappAllow, false);
    }

    public static void F1(wn wnVar) {
        SparseArray[] sparseArrayArr = wnVar.f45203m6;
        MessageObject messageObject = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (messageObject == null && sparseArrayArr[i10].size() != 0) {
                messageObject = (MessageObject) wnVar.E6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            wnVar.f45217n6[i10].clear();
            wnVar.f45230o6[i10].clear();
        }
        if (wnVar.getParentActivity() != null && messageObject != null && ((messageObject.isVoice() || messageObject.isRoundVideo()) && messageObject.getDocument() != null)) {
            File pathToAttach = FileLoader.getInstance(wnVar.currentAccount).getPathToAttach(messageObject.getDocument(), null, false, true);
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
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(wnVar.getParentActivity(), ApplicationLoader.getApplicationId() + ".provider", pathToAttach));
                        intent.setFlags(1);
                    } catch (Exception e) {
                        FileLog.e(e);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(pathToAttach));
                }
                wnVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, LocaleController.getString(R.string.ShareFile)), 500);
            }
        }
        wnVar.p9();
        wnVar.Pc(0, true);
        wnVar.nd(false);
        wnVar.cd();
    }

    public static boolean F9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void G0(wn wnVar, long j10, long j11) {
        BotForumHelper.getInstance(wnVar.currentAccount).saveIsStreamingTopic(j10, j11, false);
        wnVar.f45223nc = null;
    }

    public static void H0(wn wnVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = wnVar.U1.getAdapter().f14136w0;
        int i10 = wnVar.currentAccount;
        TLRPC.User user2 = wnVar.f45113f;
        if (user2 != null) {
            j10 = user2.f22177id;
        } else {
            j10 = wnVar.e.f22028id;
        }
        hi.c5 b10 = hi.c5.b(i10, j10, user.f22177id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, wnVar.a9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && launchActivity.P() != null && LaunchActivity.I1.P().k(b10) != null) {
            return;
        }
        String restrictionReason = MessagesController.getInstance(wnVar.currentAccount).getRestrictionReason(user.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            MessagesController.getInstance(wnVar.currentAccount);
            MessagesController.showCantOpenAlert(wnVar, restrictionReason);
            return;
        }
        hi.m3 m3Var = new hi.m3(wnVar.getParentActivity(), wnVar.getResourceProvider());
        m3Var.x(false);
        m3Var.B0 = true;
        m3Var.f13115l0 = wnVar.getParentActivity();
        m3Var.t(wnVar, b10);
        m3Var.show();
    }

    public static org.telegram.ui.su0 H1(org.telegram.ui.wn r14, org.telegram.messenger.MessageObject r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.H1(org.telegram.ui.wn, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.su0");
    }

    public static void J0(wn wnVar) {
        if (wnVar.f45165j3.getAlpha() != 0.0f && !wnVar.actionBar.q() && !wnVar.M9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(wnVar.f45165j3.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            wnVar.S9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void K0(wn wnVar) {
        MessageObject messageObject;
        MessageObject messageObject2;
        MessagePreviewParams.Messages messages;
        ArrayList<MessageObject> arrayList;
        String formatString;
        wnVar.f45330w5 = null;
        int i10 = wnVar.Ob;
        if (i10 == 2) {
            wnVar.B5 = null;
            wnVar.D5 = null;
            MessagePreviewParams messagePreviewParams = wnVar.f45317v5;
            if (messagePreviewParams != null) {
                messagePreviewParams.updateReply(null, null, wnVar.f45168j6, null);
            }
            wnVar.s8();
        } else if (i10 == 3) {
            MessagePreviewParams messagePreviewParams2 = wnVar.f45317v5;
            if (messagePreviewParams2 != null && !messagePreviewParams2.isEmpty() && (messages = wnVar.f45317v5.forwardMessages) != null && (arrayList = messages.messages) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    MessageObject messageObject3 = wnVar.f45317v5.forwardMessages.messages.get(i11);
                    if (j10 == 0) {
                        j11 = messageObject3.getDialogId();
                        j10 = messageObject3.getFromChatId();
                    } else if (j10 != messageObject3.getFromChatId()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.K0 = true;
                if (j11 > 0) {
                    TLRPC.User user = wnVar.getMessagesController().getUser(Long.valueOf(j11));
                    if (user != null) {
                        formatString = LocaleController.formatString("CancelForwardPrivate", R.string.CancelForwardPrivate, LocaleController.formatPluralString("MessagesBold", wnVar.f45317v5.forwardMessages.messages.size(), new Object[0]), ContactsController.formatName(user.first_name, user.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat chat = wnVar.getMessagesController().getChat(Long.valueOf(-j11));
                    if (chat != null) {
                        formatString = LocaleController.formatString("CancelForwardChat", R.string.CancelForwardChat, LocaleController.formatPluralString("MessagesBold", wnVar.f45317v5.forwardMessages.messages.size(), new Object[0]), chat.title);
                    } else {
                        return;
                    }
                }
                e2Var.T = AndroidUtilities.replaceTags(formatString);
                e2Var.R = LocaleController.formatPluralString("messages", wnVar.f45317v5.forwardMessages.messages.size(), new Object[0]);
                alertDialog$Builder.k(LocaleController.getString(R.string.CancelForwarding), new qe(wnVar, 6));
                alertDialog$Builder.h(LocaleController.getString(R.string.ShowForwardingOptions), new qe(wnVar, 7));
                wnVar.showDialog(e2Var);
                TextView textView = (TextView) e2Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, wnVar.getResourceProvider());
                }
            }
        } else if (i10 == 4) {
            wnVar.W5 = null;
            MessagePreviewParams messagePreviewParams3 = wnVar.f45317v5;
            if (messagePreviewParams3 != null) {
                int i12 = wnVar.currentAccount;
                MessageObject messageObject4 = wnVar.D5;
                if (messageObject4 == wnVar.f45166j4) {
                    messageObject2 = null;
                } else {
                    messageObject2 = messageObject4;
                }
                messagePreviewParams3.updateLink(i12, null, null, messageObject2, wnVar.B5, wnVar.F5);
            }
            jk jkVar = wnVar.Y;
            jkVar.X2 = null;
            jkVar.Y2 = false;
            wnVar.r8();
            wnVar.s8();
        } else {
            if (ChatObject.isForum(wnVar.e) && !wnVar.f45290t4 && (messageObject = wnVar.D5) != null) {
                long topicId = MessageObject.getTopicId(wnVar.currentAccount, messageObject.messageOwner, true);
                if (topicId != 0) {
                    wnVar.getMediaDataController().cleanDraft(wnVar.f45168j6, topicId, false);
                }
            }
            wnVar.Pb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void L0(wn wnVar, int i10) {
        if (wnVar.fragmentView != null) {
            org.telegram.ui.Cells.z A8 = wnVar.A8(i10, false);
            if (A8 instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) A8;
                bh.y0 y0Var = s1Var.N;
                TLRPC.MessagePeerReaction randomUnreadReaction = s1Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction != null && (y0Var.K || randomUnreadReaction.big)) {
                    bh.s0.d(wnVar, null, A8, null, 0.0f, 0.0f, bh.x0.d(randomUnreadReaction.reaction), wnVar.currentAccount, !randomUnreadReaction.big ? 1 : 0);
                    bh.s0.f();
                }
                y0Var.K = false;
                MessageObject messageObject = s1Var.f25367y7;
                if (messageObject != null) {
                    messageObject.markReactionsAsRead();
                }
            } else if (A8 instanceof org.telegram.ui.Cells.v0) {
                org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) A8;
                bh.y0 y0Var2 = v0Var.E0;
                TLRPC.MessagePeerReaction randomUnreadReaction2 = v0Var.getMessageObject().getRandomUnreadReaction();
                if (randomUnreadReaction2 != null && (y0Var2.K || randomUnreadReaction2.big)) {
                    bh.s0.d(wnVar, null, A8, null, 0.0f, 0.0f, bh.x0.d(randomUnreadReaction2.reaction), wnVar.currentAccount, !randomUnreadReaction2.big ? 1 : 0);
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

    public static void L1(wn wnVar) {
        int i10;
        if (wnVar.a() == wnVar.getUserConfig().getClientUserId() && wnVar.getUserConfig().isPremium() && wnVar.Ab == null) {
            zk zkVar = new zk(wnVar, wnVar, wnVar.getParentActivity(), wnVar.currentAccount, wnVar.f45309ua);
            wnVar.Ab = zkVar;
            zkVar.setPadding(AndroidUtilities.dp(4.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f), AndroidUtilities.dp(0.0f));
            wnVar.Ab.setDelegate(new bl(wnVar));
            wnVar.Ab.setTop(true);
            int i11 = 0;
            wnVar.Ab.setClipChildren(false);
            wnVar.Ab.setClipToPadding(false);
            wnVar.Ab.setVisibility(0);
            zk zkVar2 = wnVar.Ab;
            if (zkVar2.getSelectedReactions().isEmpty()) {
                i10 = R.string.SavedTagReactionsSelectedAddHint;
            } else {
                i10 = R.string.SavedTagReactionsSelectedEditHint;
            }
            zkVar2.setHint(LocaleController.getString(i10));
            wnVar.f45163j1.addView(wnVar.Ab, org.telegram.ui.Components.kb1.h(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            wnVar.Ab.p(null, null, true);
            wnVar.Ab.setTranslationY(-AndroidUtilities.dp(12.0f));
            wnVar.Ab.setScaleY(0.4f);
            wnVar.Ab.setScaleX(0.4f);
            wnVar.Ab.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.ds.h).start();
            wnVar.cd();
            zk zkVar3 = wnVar.Ab;
            float f7 = wnVar.M9;
            uk ukVar = wnVar.A1;
            if (ukVar != null) {
                i11 = ukVar.getCurrentHeight();
            }
            zkVar3.setTranslationY(f7 + i11);
        }
    }

    public static TLRPC.TL_message L7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22049id = message.f22049id;
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

    public static void M0(wn wnVar) {
        wnVar.P7(false);
        if (!wnVar.fragmentBeginToShow) {
            rj rjVar = wnVar.f45339x0;
            rjVar.W1 = false;
            rjVar.X1 = 0;
            rjVar.setEmptyView(wnVar.f45074c1);
            rj rjVar2 = wnVar.f45339x0;
            rjVar2.W1 = true;
            rjVar2.X1 = 1;
            return;
        }
        wnVar.f45339x0.setEmptyView(wnVar.f45074c1);
    }

    public static void N0(wn wnVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        MessagesController.getNotificationsSettings(wnVar.currentAccount).edit().putLong("dialog_join_requested_time_" + wnVar.f45168j6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (ChatObject.isChannel(wnVar.e) && !wnVar.e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.d90.f27374s;
            org.telegram.ui.Components.d90.w(context, wnVar, org.telegram.ui.Components.wc.b0(wnVar), z10);
        }
        wnVar.Kb(false, true);
    }

    public static CharSequence N8(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, int[] iArr) {
        if (messageObject == null) {
            return null;
        }
        String restrictionReason = MessagesController.getInstance(messageObject.currentAccount).getRestrictionReason(messageObject.messageOwner.restriction_reason);
        if (!TextUtils.isEmpty(restrictionReason)) {
            return restrictionReason;
        }
        if (messageObject.isVoiceTranscriptionOpen() && !org.telegram.ui.Components.m41.k(messageObject)) {
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

    public static void O0(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            MediaDataController.getInstance(wnVar.currentAccount).loadAttachMenuBots(false, true);
            wnVar.ja(user.f22177id, wnVar.A8, false);
        }
    }

    public static SpannableStringBuilder P8(MessageObject messageObject, boolean z10, long j10) {
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

    public static void Q0(wn wnVar) {
        int i10;
        TLRPC.ChatFull chatFull = wnVar.f45245p8;
        if (chatFull != null && !wnVar.G5) {
            TLRPC.Chat chat = wnVar.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && wnVar.visibleDialog == null) {
                SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(wnVar.currentAccount);
                int i11 = notificationsSettings.getInt("group_convert_time", 0);
                if (BuildVars.DEBUG_PRIVATE_VERSION) {
                    i10 = 120;
                } else {
                    i10 = 604800;
                }
                int currentTime = wnVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i11) >= i10 && wnVar.visibleDialog == null && wnVar.getParentActivity() != null) {
                    notificationsSettings.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = wnVar.getParentActivity();
                    qe qeVar = new qe(wnVar, 14);
                    qe qeVar2 = new qe(wnVar, 15);
                    Pattern pattern = org.telegram.ui.Components.g5.f28387a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String readRes = AndroidUtilities.readRes(R.raw.gigagroup);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new ag.v0(11));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(SvgHelper.getBitmap(readRes, AndroidUtilities.dp(320.0f), AndroidUtilities.dp(127.17949f), false)));
                    frameLayout.addView(view, org.telegram.ui.Components.kb1.h(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                    e2Var.V = frameLayout;
                    e2Var.Q0 = 0.3974359f;
                    e2Var.R = LocaleController.getString(R.string.GigagroupAlertTitle);
                    e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GigagroupAlertText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.GigagroupAlertLearnMore), qeVar);
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), qeVar2);
                    wnVar.showDialog(e2Var);
                }
            }
        }
    }

    public static java.util.ArrayList Q7(java.util.ArrayList r20, boolean r21, java.lang.CharSequence r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Q7(java.util.ArrayList, boolean, java.lang.CharSequence):java.util.ArrayList");
    }

    public static void R0(wn wnVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            MediaDataController.getInstance(wnVar.currentAccount).loadAttachMenuBots(false, true);
            wnVar.ja(user.f22177id, wnVar.A8, false);
        }
    }

    public static int R8() {
        return AndroidUtilities.dp(102.0f);
    }

    public static a3.i0 S4(wn wnVar, MessageObject messageObject) {
        if (messageObject != null && !messageObject.isOut() && messageObject.isSecretMedia() && messageObject.messageOwner.ttl == Integer.MAX_VALUE) {
            long createDeleteShowOnceTask = wnVar.getMessagesController().createDeleteShowOnceTask(wnVar.f45168j6, messageObject.getId());
            messageObject.forceExpired = true;
            if (messageObject.isOutOwner() || (!messageObject.isRoundOnce() && !messageObject.isVoiceOnce())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(messageObject);
                wnVar.Kc(arrayList, true);
            }
            return new a3.i0(wnVar, createDeleteShowOnceTask, messageObject, 16);
        }
        return null;
    }

    public static FrameLayout S7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.u6 u6Var) {
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
        frameLayout.addView(mdVar, org.telegram.ui.Components.kb1.i(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static void T0(wn wnVar) {
        if (!wnVar.n7(wnVar.Y.getSendButton())) {
            if (wnVar.getMediaController().isPlayingMessage(wnVar.f45291t5)) {
                wnVar.getMediaController().cleanupPlayer(true, true);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = wnVar.getMessagesController().getInputPeer(wnVar.f45168j6);
            if (wnVar.f45304u5 != null) {
                for (int i10 = 0; i10 < wnVar.f45304u5.messages.size(); i10++) {
                    tL_messages_sendScheduledMessages.f22146id.add(Integer.valueOf(wnVar.f45304u5.messages.get(i10).getId()));
                }
            } else {
                tL_messages_sendScheduledMessages.f22146id.add(Integer.valueOf(wnVar.f45291t5.getId()));
            }
            ConnectionsManager.getInstance(wnVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new z7(5, wnVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void U0(wn wnVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(wnVar.currentAccount).getInputUser(user.f22177id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(wnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mh(wnVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void U3(wn wnVar) {
        org.telegram.ui.ActionBar.y yVar;
        if (!wnVar.Db && (yVar = wnVar.f45150i0) != null) {
            yVar.a();
            org.telegram.ui.ActionBar.w0 w0Var = yVar.f23281m;
            w0Var.g(57, LocaleController.getString(R.string.Spoiler));
            if (wnVar.f45091d4 == 0) {
                w0Var.g(58, LocaleController.getString(R.string.Quote));
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Bold));
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
            w0Var.g(50, spannableStringBuilder);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
            w0Var.g(51, spannableStringBuilder2);
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            w0Var.g(52, spannableStringBuilder3);
            TLRPC.EncryptedChat encryptedChat = wnVar.h;
            if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
                ?? obj = new Object();
                obj.f35208a |= 8;
                spannableStringBuilder4.setSpan(new org.telegram.ui.Components.a21(obj, 0), 0, spannableStringBuilder4.length(), 33);
                w0Var.g(55, spannableStringBuilder4);
                SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
                ?? obj2 = new Object();
                obj2.f35208a |= 16;
                spannableStringBuilder5.setSpan(new org.telegram.ui.Components.a21(obj2, 0), 0, spannableStringBuilder5.length(), 33);
                w0Var.g(56, spannableStringBuilder5);
            }
            w0Var.g(53, LocaleController.getString(R.string.CreateLink));
            if (wnVar.h == null) {
                w0Var.g(74, LocaleController.getString(R.string.FormattedDate));
            }
            w0Var.g(54, LocaleController.getString(R.string.Regular));
            wnVar.Db = true;
        }
    }

    public static void V(wn wnVar, TLRPC.ReactionCount reactionCount) {
        wnVar.J7(true);
        org.telegram.ui.Components.po0.c(wnVar.getParentActivity(), wnVar.currentAccount, reactionCount.reaction, wnVar.f45309ua);
    }

    public static void V0(wn wnVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = MessagesController.getInstance(wnVar.currentAccount).getInputUser(user.f22177id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(wnVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mh(wnVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void W(wn wnVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = wnVar.getParentActivity();
        int i12 = wnVar.currentAccount;
        long j10 = wnVar.f45168j6;
        un unVar = wnVar.f45309ua;
        int i13 = org.telegram.ui.Components.vo.L;
        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, (Context) parentActivity, (org.telegram.ui.ActionBar.u6) unVar, false);
        k3Var.fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23428h5);
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
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i14, unVar));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i14);
        imageView.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, unVar);
        linearLayout.addView((View) imageView, org.telegram.ui.Components.kb1.x(80, 80, 1, 0, 16, 0, 16));
        boolean premiumFeaturesBlocked = MessagesController.getInstance(i12).premiumFeaturesBlocked();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i15, unVar);
        textView.setTextSize(1, 20.0f);
        if (premiumFeaturesBlocked) {
            i10 = R.string.PremiumMessageHeaderLocked;
        } else {
            i10 = R.string.PremiumMessageHeader;
        }
        textView.setText(LocaleController.getString(i10));
        linearLayout.addView(textView, org.telegram.ui.Components.kb1.x(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.f7.V(textView2, i15, unVar);
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
        org.telegram.messenger.wh.o(i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, org.telegram.ui.Components.kb1.x(-1, -2, 1, 12, 9, 12, 19));
        if (!premiumFeaturesBlocked) {
            tg.p0 p0Var = new tg.p0(parentActivity, unVar, true);
            p0Var.setOnClickListener(new org.telegram.ui.Components.g3(k3Var, 1));
            p0Var.b(LocaleController.getString(R.string.PremiumMessageButton), false, false);
            linearLayout.addView(p0Var, org.telegram.ui.Components.kb1.x(-1, 48, 1, 0, 0, 0, 4));
        }
        k3Var.setCustomView(linearLayout);
        k3Var.show();
    }

    public static void W0(wn wnVar, MessageObject messageObject, Long l4, Runnable runnable) {
        bi.ca.y(wnVar.currentAccount, false).l0(messageObject, l4.longValue(), runnable, false);
    }

    public static void X(wn wnVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        MessageObject messageObject;
        MessageObject messageObject2;
        if (wnVar.Lb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            wnVar.W5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                wnVar.W5 = null;
                MessagePreviewParams messagePreviewParams = wnVar.f45317v5;
                if (messagePreviewParams != null) {
                    int i11 = wnVar.currentAccount;
                    CharSequence fieldText = wnVar.Y.getFieldText();
                    MessageObject messageObject3 = wnVar.D5;
                    if (messageObject3 == wnVar.f45166j4) {
                        messageObject2 = null;
                    } else {
                        messageObject2 = messageObject3;
                    }
                    messagePreviewParams.updateLink(i11, null, fieldText, messageObject2, wnVar.B5, wnVar.F5);
                }
                wnVar.s8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                wnVar.Y5 = str;
            }
            if (wnVar.h != null && z10) {
                webPage.url = str;
            }
            MessagePreviewParams messagePreviewParams2 = wnVar.f45317v5;
            if (messagePreviewParams2 != null) {
                int i12 = wnVar.currentAccount;
                CharSequence fieldText2 = wnVar.Y.getFieldText();
                MessageObject messageObject4 = wnVar.D5;
                if (messageObject4 == wnVar.f45166j4) {
                    messageObject = null;
                } else {
                    messageObject = messageObject4;
                }
                messagePreviewParams2.updateLink(i12, null, fieldText2, messageObject, wnVar.B5, wnVar.F5);
            }
            wnVar.Ub(true, wnVar.W5, false);
            return;
        }
        wnVar.W5 = null;
        wnVar.s8();
    }

    public static void X0(wn wnVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = MessagesController.getInstance(wnVar.currentAccount).getInputUser(user.f22177id);
                    ConnectionsManager.getInstance(wnVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new z7(4, wnVar, user));
                }
            }
        }
    }

    public static MessageObject X1(wn wnVar) {
        View view = wnVar.f45295t9;
        if (view instanceof org.telegram.ui.Cells.s1) {
            return ((org.telegram.ui.Cells.s1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.v0) {
            return ((org.telegram.ui.Cells.v0) view).getMessageObject();
        }
        return null;
    }

    public static void X4(wn wnVar, org.telegram.ui.Cells.s1 s1Var) {
        int i10;
        int i11;
        oe.b bVar = wnVar.Xc;
        if (wnVar.Y != null && !bVar.f19326f && s1Var.getMessageObject() != null) {
            om omVar = wnVar.f45163j1;
            RectF rectF = AndroidUtilities.rectTmp;
            jh.k.c(s1Var, omVar, rectF);
            Rect rect = AndroidUtilities.rectTmp2;
            uh.a aVar = s1Var.f25021a6;
            if (aVar != null && s1Var.f25206n6) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((wnVar.f45163j1.getMeasuredHeight() - wnVar.f45339x0.getPaddingBottom()) + wnVar.Tc) - AndroidUtilities.dp(2.0f)));
                MessageObject messageObject = s1Var.getMessageObject();
                if (wnVar.f45100dd == null) {
                    wnVar.f45100dd = new sh.c(wnVar.getParentActivity(), wnVar.resourceProvider, wnVar);
                    int indexOfChild = wnVar.f45163j1.indexOfChild(wnVar.f45339x0);
                    if (indexOfChild >= 0) {
                        wnVar.f45163j1.addView(wnVar.f45100dd, indexOfChild + 1, org.telegram.ui.Components.kb1.k());
                    } else {
                        wnVar.f45163j1.addView(wnVar.f45100dd, org.telegram.ui.Components.kb1.k());
                    }
                }
                if (messageObject.isOutOwner()) {
                    if (s1Var.f3()) {
                        i11 = org.telegram.ui.ActionBar.y6.f23546nb;
                    } else {
                        i11 = org.telegram.ui.ActionBar.y6.f23640sb;
                    }
                    wnVar.Q0 = i11;
                } else {
                    if (s1Var.f3()) {
                        i10 = org.telegram.ui.ActionBar.y6.f23568od;
                    } else {
                        i10 = org.telegram.ui.ActionBar.y6.f23548nd;
                    }
                    wnVar.Q0 = i10;
                }
                wnVar.f45100dd.setColor(wnVar.getThemedColor(wnVar.Q0));
                wnVar.f45100dd.setCellToWatch(s1Var);
                wnVar.f45100dd.f48654b.f48650a.a(false, false);
                wnVar.f45100dd.setAnimatedVisibility(bVar.e);
                wnVar.f45100dd.f48654b.setOnClickListener(new ig.d0(new ig(wnVar, 3), 20));
                sh.c cVar = wnVar.f45100dd;
                cVar.f48659s = new ig(wnVar, 4);
                org.telegram.ui.Cells.g6 g6Var = cVar.f48653a;
                g6Var.setOnKeyListener(new mg(wnVar, 0));
                g6Var.setOnEditorActionListener(new la(wnVar, 1));
                wnVar.Y.Y4 = g6Var;
                AndroidUtilities.runOnUIThread(new g4(wnVar, measuredHeight, g6Var, 3), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void Y(wn wnVar, TLRPC.TL_game tL_game, MessageObject messageObject, String str, long j10) {
        wnVar.cc(tL_game, messageObject, str, false, j10);
        SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wnVar.currentAccount).edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void Y0(wn wnVar, long j10, long j11) {
        bi.ca.y(wnVar.currentAccount, false).C(j10, j11, new bi.l5(wnVar, j10, j11, 1));
    }

    public static void Z(wn wnVar, int i10) {
        if (i10 != 0) {
            AndroidUtilities.runOnUIThread(new ze(wnVar, i10, 6));
        } else {
            wnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void Z0(wn wnVar) {
        if (AndroidUtilities.addToClipboard(wnVar.f45209mc.sponsoredInfo)) {
            org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.resourceProvider));
        }
    }

    public static void Z1(wn wnVar, float f7) {
        View view = wnVar.f45295t9;
        if (view instanceof org.telegram.ui.Cells.s1) {
            ((org.telegram.ui.Cells.s1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            ((org.telegram.ui.Cells.v0) view).setWalletSlidingOffset(f7);
        }
    }

    public static boolean a0(wn wnVar) {
        MessageObject messageObject = wnVar.f45209mc;
        if (messageObject == null) {
            return false;
        }
        if (AndroidUtilities.addToClipboard(messageObject.sponsoredUrl)) {
            new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void a1(wn wnVar, MessageObject.GroupedMessages groupedMessages, MessageObject messageObject, int i10, int i11) {
        if (groupedMessages != null && !groupedMessages.messages.isEmpty()) {
            SendMessagesHelper.getInstance(wnVar.currentAccount).editMessage(groupedMessages.messages.get(0), null, false, wnVar, null, i10, i11);
        } else {
            SendMessagesHelper.getInstance(wnVar.currentAccount).editMessage(messageObject, null, false, wnVar, null, i10, i11);
        }
    }

    public static void a2(wn wnVar) {
        long j10;
        tp tpVar = wnVar.f45123fa;
        if (tpVar != null) {
            if (wnVar.f45290t4) {
                if (tpVar.H != null) {
                    if (wnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(wnVar, wnVar.getParentLayout().getFragmentStack().indexOf(wnVar), wnVar.e, wnVar.f45113f, wnVar.f45228o4, wnVar.f45168j6, wnVar.La, wnVar.Ka);
                    }
                    TLRPC.Chat chat = wnVar.e;
                    TLRPC.TL_forumTopic tL_forumTopic = wnVar.f45123fa.H;
                    long j11 = wnVar.f45168j6;
                    int i10 = wnVar.Ka;
                    int i11 = wnVar.La;
                    if (wnVar.getParentLayout() != null) {
                        org.telegram.ui.Components.q9.a(wnVar, wnVar.getParentLayout().getFragmentStack().indexOf(wnVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", wnVar.f45123fa.f43688a);
                    bundle.putInt("dialog_filter_id", wnVar.f45123fa.f43690b);
                    bundle.putBoolean("pulled", true);
                    wn g7 = pg.d.g(wnVar, -wnVar.f45168j6, wnVar.f45123fa.H, 0, bundle);
                    g7.f45147ha = true;
                    f45042md = true;
                    wnVar.presentFragment(g7, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = tpVar.G;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f22028id;
            }
            if (j10 != 0) {
                wnVar.B6();
                tp tpVar2 = wnVar.f45123fa;
                TLRPC.Chat chat3 = tpVar2.G;
                long j13 = tpVar2.Z;
                int i12 = tpVar2.f43688a;
                int i13 = tpVar2.f43690b;
                if (wnVar.getParentLayout() != null) {
                    org.telegram.ui.Components.q9.a(wnVar, wnVar.getParentLayout().getFragmentStack().indexOf(wnVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = wnVar.f45123fa.G;
                if (chat4 != null) {
                    j12 = chat4.f22028id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", wnVar.f45123fa.f43688a);
                bundle2.putInt("dialog_filter_id", wnVar.f45123fa.f43690b);
                bundle2.putBoolean("pulled", true);
                MessagesController.getNotificationsSettings(wnVar.currentAccount).edit().remove("diditem" + wnVar.f45123fa.Z).apply();
                wn wnVar2 = new wn(bundle2);
                ArrayList arrayList = wnVar.Fb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = wnVar.Fb;
                    wnVar2.Fb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                wnVar2.f45147ha = true;
                f45042md = true;
                wnVar.presentFragment(wnVar2, true);
            }
        }
    }

    public static void b0(wn wnVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int dp;
        int dp2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            MessagesController.getInstance(wnVar.currentAccount).putUsers(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (wnVar.i() != null) {
                tLObject2 = wnVar.i();
            } else {
                tLObject2 = wnVar.e;
            }
            if (!MediaDataController.canShowAttachMenuBot(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = wnVar.f45113f;
                if (user2 != null && user2.bot && user.f22177id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.wh.n(R.string.BotCantOpenAttachMenuSameBot, org.telegram.ui.Components.wc.b0(wnVar), null);
                } else if (user2 != null && user2.bot && user.f22177id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.wh.n(R.string.BotCantOpenAttachMenuBot, org.telegram.ui.Components.wc.b0(wnVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.wh.n(R.string.BotCantOpenAttachMenuUser, org.telegram.ui.Components.wc.b0(wnVar), null);
                } else {
                    TLRPC.Chat chat = wnVar.e;
                    if (chat != null && !ChatObject.isChannelAndNotMegaGroup(chat)) {
                        org.telegram.messenger.wh.n(R.string.BotCantOpenAttachMenuGroup, org.telegram.ui.Components.wc.b0(wnVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = wnVar.e;
                    if (chat2 != null && ChatObject.isChannelAndNotMegaGroup(chat2)) {
                        org.telegram.messenger.wh.n(R.string.BotCantOpenAttachMenuChannel, org.telegram.ui.Components.wc.b0(wnVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                wnVar.ja(user.f22177id, wnVar.A8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.z6 z6Var = new org.telegram.ui.Components.z6(wnVar.getParentActivity());
                z6Var.setColor(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.ia, false));
                org.telegram.ui.ActionBar.f7.i(org.telegram.ui.ActionBar.y6.L5, z6Var, null);
                z6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity());
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.V = z6Var;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("BotRequestAttachPermission", R.string.BotRequestAttachPermission, UserObject.getUserName(user)));
                alertDialog$Builder.k(LocaleController.getString(R.string.BotAddToMenu), new a1.d(wnVar, user, atomicBoolean, tL_attachMenuBot, 7));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(wnVar.getParentActivity(), 5, wnVar.getResourceProvider());
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
                mi1.a(wnVar.getParentActivity(), new y(wnVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void b1(wn wnVar) {
        if (wnVar.f45202m5) {
            wnVar.f45202m5 = false;
            MediaController mediaController = MediaController.getInstance();
            if (mediaController.isRecordingAudio() && !mediaController.isRecordingPaused() && mediaController.getRecordingGuid() == wnVar.classGuid) {
                mediaController.toggleRecordingPause(false);
            }
        }
    }

    public static void c0(long j10, wn wnVar) {
        if (bi.ca.y(wnVar.currentAccount, false).p().amount < j10) {
            new bi.tc(wnVar.getParentActivity(), wnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(wnVar.a()), new jf(wnVar, 26), wnVar.a()).show();
        } else {
            new bi.uc(wnVar.getParentActivity(), wnVar.resourceProvider).show();
        }
    }

    public static void c1(org.telegram.ui.wn r19, org.telegram.ui.lk r20, boolean[] r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.c1(org.telegram.ui.wn, org.telegram.ui.lk, boolean[]):void");
    }

    public static void d0(wn wnVar) {
        MessagesController messagesController = wnVar.getMessagesController();
        long j10 = wnVar.f45168j6;
        long j11 = wnVar.f45065b7;
        int i10 = wnVar.classGuid;
        int i11 = wnVar.f45091d4;
        long j12 = wnVar.f45241p4;
        int i12 = wnVar.f45355y4;
        int i13 = wnVar.f45191l6;
        wnVar.f45191l6 = i13 + 1;
        messagesController.loadMessages(j10, j11, false, 30, 0, 0, true, 0, i10, 0, 0, i11, j12, i12, i13, wnVar.f45290t4);
    }

    public static void d1(wn wnVar) {
        if (wnVar.f45091d4 == 0 && wnVar.getMessagesController().freezeUntilDate > wnVar.getConnectionsManager().getCurrentTime() && !b.a(wnVar.currentAccount, wnVar.f45113f)) {
            b.c(wnVar.getParentActivity(), wnVar.currentAccount, wnVar.getResourceProvider());
        }
    }

    public static wn da(int i10, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i10);
        return new wn(bundle);
    }

    public static void e0(org.telegram.ui.wn r6, java.lang.String r7, android.text.style.CharacterStyle r8, org.telegram.messenger.MessageObject r9, org.telegram.ui.Cells.s1 r10, int r11, int r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.e0(org.telegram.ui.wn, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.s1, int, int):void");
    }

    public static void e1(wn wnVar, int i10) {
        ch.f fVar = wnVar.F;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (a8.pf.a(i10, 4)) {
                qi.a e = wnVar.glassEngine.e();
                float dp = AndroidUtilities.dp(48.0f);
                float dp2 = AndroidUtilities.dp(48.0f);
                int i11 = 0;
                while (i11 < e.f47103b) {
                    RectF rectF = (RectF) e.f47102a.get(i11);
                    rectF.inset(-dp, -dp2);
                    if (rectF.isEmpty()) {
                        e.d(i11);
                    } else {
                        i11++;
                    }
                }
                e.b(wnVar.f45339x0.getY(), wnVar.f45339x0.getWidth(), wnVar.f45339x0.getY() + wnVar.f45339x0.getHeight());
                fVar.h(e);
            }
            om omVar = wnVar.f45163j1;
            fVar.e(omVar.f42117v0, omVar.getWidth(), wnVar.f45163j1.getHeight());
        }
    }

    public static wn ea(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new wn(bundle);
    }

    public static void f0(wn wnVar, String str) {
        if (MessagesController.getInstance(wnVar.currentAccount).isWebBrowserExceptionsLimitReached(true)) {
            qf.d.l(wnVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.g5.n0(wnVar.getParentActivity(), wnVar.f45309ua, str, true, new ag(wnVar, str, 0));
        }
    }

    public static void f1(wn wnVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, MessageObject messageObject, int i11, int i12, MessageObject messageObject2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            wnVar.Jc = true;
            wnVar.f45339x0.g1();
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
            wn wnVar2 = new wn(bundle);
            wnVar2.Eb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                wnVar2.f45066b8 = i10;
            }
            if (messageObject != null && (messageReplies = messageObject.messageOwner.replies) != null && (messageReplies2 = wnVar2.f45166j4.messageOwner.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (messageObject != null && (tL_messageReactions = messageObject.messageOwner.reactions) != null) {
                wnVar2.f45166j4.messageOwner.reactions = tL_messageReactions;
            }
            ai.h1 h1Var = new ai.h1(wnVar, new boolean[]{false}, i11, wnVar2, 17);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f22049id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = wnVar2.getClassGuid();
                NotificationCenter.getInstance(wnVar.currentAccount).addObserver(new ti(wnVar, classGuid, h1Var, wnVar2), NotificationCenter.messagesDidLoad);
                final int i16 = i13;
                Utilities.stageQueue.postRunnable(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        wn wnVar3 = wn.this;
                        MessagesController messagesController = wnVar3.getMessagesController();
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
                        messagesController.processLoadedMessages(messages_messages2, size2, dialogId, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((MessageObject) ic.a.g(1, arrayList)).getId(), 1, false, 0, true, wnVar3.f45290t4, null);
                    }
                });
                return;
            }
            h1Var.run();
            return;
        }
        wnVar.Ic = 0;
        wnVar.Jc = false;
        wnVar.f45339x0.g1();
        if (messageObject2 != null) {
            wnVar.ta(messageObject2);
        } else if (wnVar.getParentActivity() != null) {
            org.telegram.ui.Components.wc.b0(wnVar).t(LocaleController.getString(R.string.ChannelPostDeleted), wnVar.f45309ua).j();
        }
    }

    public static void f2(wn wnVar, View view, boolean z10, float f7, float f10) {
        MessageObject messageObject;
        int i10;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) view;
            messageObject = s1Var.getMessageObject();
            s1Var.f25103g1 = f7;
            s1Var.f25116h1 = f10;
            org.telegram.ui.Components.jb0 jb0Var = s1Var.Kc;
            float f11 = s1Var.f25116h1;
            jb0Var.h = s1Var.getTranslationX() + f7;
            jb0Var.f29619i = f11;
            jb0Var.f29622l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.v0) {
            messageObject = ((org.telegram.ui.Cells.v0) view).getMessageObject();
        } else {
            messageObject = null;
        }
        int Q8 = wnVar.Q8(messageObject);
        if ((messageObject == null || !messageObject.isAnyGift()) && Q8 >= 2 && Q8 != 20 && Q8 != 21) {
            if (messageObject == null || ((i10 = messageObject.type) != 27 && i10 != 30)) {
                if (messageObject == null || !messageObject.isWallpaperAction()) {
                    if (messageObject == null || (!messageObject.isSponsored() && !messageObject.isEphemeral())) {
                        wnVar.D6(messageObject, z10, true);
                        wnVar.uc();
                        wnVar.nd(false);
                    }
                }
            }
        }
    }

    public static void g0(wn wnVar) {
        if (wnVar.Y1) {
            wnVar.getMessagesController().addDialogToFolder(wnVar.f45168j6, 0, 0, 0L);
            wnVar.Z7();
            wnVar.K3.j(23, wnVar.f45168j6, null);
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wnVar.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + wnVar.f45168j6, false);
            edit.putBoolean("dialog_bar_block" + wnVar.f45168j6, false);
            edit.putBoolean("dialog_bar_report" + wnVar.f45168j6, false);
            edit.commit();
            wnVar.hd(false);
            wnVar.getNotificationsController().clearDialogNotificationsSettings(wnVar.f45168j6, wnVar.b());
        } else if (wnVar.X1.getTag() != null && ((Integer) wnVar.X1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = wnVar.f45245p8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < wnVar.f45245p8.participants.participants.size(); i10++) {
                    hVar.k(null, wnVar.f45245p8.participants.participants.get(i10).user_id);
                }
                long j10 = wnVar.f45245p8.f22029id;
                org.telegram.ui.Components.z70 z70Var = new org.telegram.ui.Components.z70(wnVar.getParentActivity(), wnVar.currentAccount, hVar, wnVar.f45245p8.f22029id, wnVar, wnVar.f45309ua);
                z70Var.f35272l0 = new qe(wnVar, 24);
                z70Var.show();
            }
        } else if (wnVar.X1.getTag() != null) {
            wnVar.Gb(null, 1);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", wnVar.f45113f.f22177id);
            bundle.putBoolean("addContact", true);
            ls lsVar = new ls(bundle);
            lsVar.O = new qe(wnVar, 25);
            wnVar.presentFragment(lsVar);
        }
    }

    public static void g1(wn wnVar, String str) {
        if (MessagesController.getInstance(wnVar.currentAccount).isWebBrowserExceptionsLimitReached(false)) {
            wnVar.getParentActivity();
            qf.d.m(str);
            return;
        }
        org.telegram.ui.Components.g5.n0(wnVar.getParentActivity(), wnVar.f45309ua, str, false, new ag(wnVar, str, 1));
    }

    public static void g2(wn wnVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = wnVar.K6;
        SparseArray[] sparseArrayArr = wnVar.f45203m6;
        if (!wnVar.f45124fb && (i11 = i10 - wnVar.A0.J) >= 0 && i11 < arrayList.size()) {
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
            org.telegram.ui.Components.nm0 nm0Var = wnVar.f45339x0;
            wi wiVar = new wi(wnVar, z10, sparseArray);
            if (!nm0Var.f30965b2) {
                nm0Var.f30983k2 = new int[2];
                new HashSet();
                nm0Var.o1(nm0Var, true);
                nm0Var.f30973f2 = wiVar;
                nm0Var.f30965b2 = true;
                nm0Var.f30971e2 = i10;
                nm0Var.f30969d2 = i10;
            }
        }
    }

    public static void h0(wn wnVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        NotificationCenter notificationCenter = NotificationCenter.getInstance(wnVar.currentAccount);
        int i10 = NotificationCenter.messagesDeleted;
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f22146id;
        long clientUserId = wnVar.getUserConfig().getClientUserId();
        long j11 = wnVar.f45168j6;
        if (clientUserId == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, arrayList, valueOf, bool, bool);
    }

    public static void h1(wn wnVar) {
        org.telegram.ui.Components.u40.h.a();
        wnVar.showDialog(new zh.p1(wnVar.getParentActivity(), wnVar.currentAccount, wnVar.a(), null, null));
    }

    public static boolean h2(wn wnVar, View view, RectF rectF) {
        RectF rectF2 = wnVar.f45125fc;
        if (rectF != null && wnVar.f45339x0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void h4(wn wnVar, org.telegram.ui.Cells.g0 g0Var) {
        String charSequence;
        if (MessagesController.getInstance(wnVar.currentAccount).getTranslateController().isContextTranslateEnabled() && LanguageDetector.hasSupport()) {
            CharSequence text = g0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            LanguageDetector.detectLanguage(charSequence, new e7(wnVar, g0Var, text, 3), new y0(g0Var, 16));
            return;
        }
        g0Var.setClickable(false);
    }

    public static void i0(wn wnVar, boolean[] zArr, Context context) {
        MessageObject messageObject;
        MessageObject messageObject2 = wnVar.D5;
        if (messageObject2 == null || !messageObject2.isEphemeral()) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = wnVar.Ob;
            if (i10 == 5) {
                int i11 = wnVar.currentAccount;
                long j10 = wnVar.f45168j6;
                MessageSuggestionParams messageSuggestionParams = wnVar.f45330w5;
                if (messageSuggestionParams == null) {
                    messageSuggestionParams = MessageSuggestionParams.empty();
                }
                new bi.g1(context, i11, j10, messageSuggestionParams, wnVar, wnVar.getResourceProvider(), 0, new ye(wnVar, 1)).show();
            } else if (i10 == 1 && (messageObject = wnVar.F5) != null) {
                if (messageObject.needResendWhenEdit() && !z10) {
                    MessageSuggestionParams messageSuggestionParams2 = wnVar.f45330w5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.empty();
                    }
                    wnVar.jc(messageSuggestionParams2);
                } else if (wnVar.F5.canEditMedia() && wnVar.E5 == 0) {
                    if (wnVar.V1 == null) {
                        wnVar.N7();
                    }
                    wnVar.V1.P1(wnVar.F5, -1);
                    wnVar.ka();
                } else {
                    wnVar.j(wnVar.F5.getId(), 0, true, 0, true, 0);
                }
            } else if (wnVar.f45317v5 != null) {
                if (i10 == 2) {
                    if (!DialogObject.isEncryptedDialog(wnVar.f45168j6) && !wnVar.f45317v5.hasSecretMessages && wnVar.f45091d4 != 5) {
                        SharedConfig.replyingOptionsHintHintShowed();
                        wnVar.pa(0);
                        return;
                    }
                    MessageObject messageObject3 = wnVar.D5;
                    if (messageObject3 != null) {
                        wnVar.j(messageObject3.getId(), 0, true, 0, true, 0);
                    }
                } else if (i10 == 3) {
                    SharedConfig.forwardingOptionsHintHintShowed();
                    wnVar.pa(1);
                } else if (i10 == 4) {
                    wnVar.pa(2);
                }
            }
        }
    }

    public static void i1(wn wnVar, long j10, boolean z10, boolean z11) {
        if (!AndroidUtilities.isContextSafe(wnVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.j11.c(wnVar.getParentActivity(), wnVar.currentAccount, -j10, wnVar.getUserConfig().getCurrentUser(), null, z10, z11, wnVar.getResourceProvider());
    }

    public static void i4(wn wnVar) {
        if (wnVar.U3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = wnVar.f45091d4;
        if (i10 == 3) {
            tL_message.message = LocaleController.getString(R.string.SavedMessagesProfileHint);
        } else if (i10 == 9) {
            tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint2);
        } else {
            tL_message.message = LocaleController.getString(R.string.BusinessRepliesHint);
        }
        tL_message.f22049id = 0;
        MessageObject messageObject = new MessageObject(wnVar.currentAccount, tL_message, false, false);
        wnVar.U3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void j0(wn wnVar) {
        org.telegram.ui.Cells.s1 s1Var;
        tl tlVar;
        int i10;
        if (!wnVar.f45271rc && wnVar.R3 && wnVar.f45339x0.G && wnVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = wnVar.f45339x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = wnVar.f45339x0.getChildAt(childCount);
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
                wnVar.f45271rc = true;
                tl tlVar2 = new tl(wnVar, wnVar.getParentActivity());
                tlVar2.p(true);
                tlVar2.K = Layout.Alignment.ALIGN_CENTER;
                tlVar2.d = 3500L;
                tlVar2.T = true;
                tlVar2.e = true;
                tlVar2.h = AndroidUtilities.dp(150.0f);
                tlVar2.q(8.0f);
                wnVar.N1 = tlVar2;
                tlVar2.s(LocaleController.getString(R.string.VideoConversionTimeInfo));
                wnVar.f45163j1.addView(wnVar.N1, org.telegram.ui.Components.kb1.h(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                s1Var.getLocationInWindow(iArr);
                wnVar.O1 = s1Var.getTimeY() + iArr[1];
                wnVar.N1.setTranslationY(((-tlVar.getTop()) - AndroidUtilities.dp(120.0f)) + wnVar.O1);
                wnVar.N1.m(0.0f, (s1Var.pb / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + s1Var.f25266rb);
                wnVar.N1.u();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(wnVar, 2));
            AndroidUtilities.runOnUIThread(new le(wnVar, 2), 2000L);
        }
    }

    public static void j1(wn wnVar, String str) {
        if (wnVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", ContactsController.getInstance(wnVar.currentAccount).getInviteText(1));
            wnVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void j4(wn wnVar) {
        if (wnVar.V3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.getString(R.string.WelcomeMessageHint);
        tL_message.f22049id = 0;
        MessageObject messageObject = new MessageObject(wnVar.currentAccount, tL_message, false, false);
        wnVar.V3 = messageObject;
        messageObject.type = 10;
        messageObject.contentType = 1;
    }

    public static void k0(wn wnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            bi.dd.i1(wnVar.getParentActivity(), wnVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, wnVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            wnVar.presentFragment(new ro0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void k1(wn wnVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (wnVar.getParentActivity() != null) {
            TLRPC.Chat chat = wnVar.e;
            if (chat != null) {
                if (ChatObject.canPinMessages(chat) && !wnVar.e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (wnVar.h == null && (userFull = wnVar.f45255q8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.UnpinMessageAlertTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.UnpinMessageAlert);
                alertDialog$Builder.k(LocaleController.getString(R.string.UnpinMessage), new qe(wnVar, 23));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                wnVar.showDialog(alertDialog$Builder.f22369a);
            } else if (!wnVar.T4.isEmpty()) {
                MessagesController.getNotificationsSettings(wnVar.currentAccount).edit().putInt("pin_" + wnVar.f45168j6, ((Integer) wnVar.T4.get(0)).intValue()).commit();
                wnVar.Pc(0, true);
            }
        }
    }

    public static void l0(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, nf nfVar) {
        String str4;
        org.telegram.ui.Components.x41 x41Var;
        if (wnVar.f45291t5 != null && i10 < arrayList.size() && wnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = wnVar.getParentActivity();
            int i11 = iArr[0];
            ig igVar = new ig(wnVar, 16);
            String[] strArr = org.telegram.ui.Components.g51.X;
            if (parentActivity == null) {
                x41Var = null;
            } else {
                org.telegram.ui.Components.x41 x41Var2 = new org.telegram.ui.Components.x41(parentActivity, str, str4, inputPeer, i11, richMessage, igVar);
                x41Var2.Q(z10);
                x41Var2.S = wnVar;
                x41Var2.T = nfVar;
                if (wnVar.getParentActivity() != null) {
                    wnVar.showDialog(x41Var2);
                }
                x41Var = x41Var2;
            }
            x41Var.setDimBehind(false);
            wnVar.J7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(wnVar.currentAccount);
            int i12 = notificationsSettings.getInt("dialog_show_translate_count" + wnVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + wnVar.a(), i12 - 1).apply();
                wnVar.hd(true);
            }
        }
    }

    public static void l1(wn wnVar, String str) {
        Uri parse = Uri.parse(str);
        a60.b(wnVar.getParentActivity(), wnVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void m0(wn wnVar, CharSequence charSequence, MessagesController messagesController, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.a71[] a71VarArr;
        if (wnVar.V5 != 0) {
            wnVar.getConnectionsManager().cancelRequest(wnVar.V5, true);
            wnVar.V5 = 0;
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
            if ((charSequence instanceof Spannable) && (a71VarArr = (org.telegram.ui.Components.a71[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.a71.class)) != null && a71VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.a71 a71Var : a71VarArr) {
                    arrayList.add(a71Var.getURL());
                }
            }
            if (arrayList != null && wnVar.X5 != null && arrayList.size() == wnVar.X5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) wnVar.X5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            wnVar.X5 = arrayList;
        } catch (Exception e) {
            FileLog.e(e);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                AndroidUtilities.runOnUIThread(new jf(wnVar, 22));
                return;
            }
        }
        if (arrayList == null) {
            AndroidUtilities.runOnUIThread(new jf(wnVar, 21));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (wnVar.h != null && messagesController.secretWebpagePreview == 2) {
            AndroidUtilities.runOnUIThread(new ue(wnVar, messagesController, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = wnVar.W5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = wnVar.Lb + 1;
            wnVar.Lb = i11;
            dg dgVar = new dg(wnVar, i11, getwebpagepreview, 0);
            if (wnVar.Mb == null) {
                wnVar.Mb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) wnVar.Mb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                dgVar.run(Boolean.TRUE, webPage2);
                return;
            }
            q6 q6Var = new q6(wnVar, getwebpagepreview, dgVar, 1);
            if (wnVar.V5 != 0) {
                wnVar.getConnectionsManager().cancelRequest(wnVar.V5, true);
            }
            wnVar.V5 = wnVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new Object(), new bi.m5(10, wnVar, q6Var));
            wnVar.getConnectionsManager().bindRequestToGuid(wnVar.V5, wnVar.classGuid);
        }
    }

    public static void m1(wn wnVar, long j10, long j11, Long l4) {
        int i10;
        String str;
        if (wnVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = wnVar.getParentActivity();
        String string = LocaleController.getString(R.string.RemoveMessageFeeTitle);
        if (ChatObject.isMonoForum(wnVar.e)) {
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
        org.telegram.ui.Components.g5.h0(parentActivity, string, replaceTags, str, LocaleController.getString(R.string.Confirm), new ah(wnVar, j10, j11, l4, 0), wnVar.resourceProvider, true);
    }

    public static void m2(wn wnVar) {
        org.telegram.ui.Cells.s1 s1Var;
        MessageObject primaryMessageObject;
        TLRPC.Message message;
        if (wnVar.L1 != null) {
            return;
        }
        org.telegram.ui.Cells.s1 s1Var2 = null;
        for (int childCount = wnVar.f45339x0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = wnVar.f45339x0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.s1) && (primaryMessageObject = (s1Var = (org.telegram.ui.Cells.s1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.messageOwner) != null && message.via_business_bot_id != 0) {
                s1Var2 = s1Var;
            }
        }
        wnVar.Jb(s1Var2);
    }

    public static org.telegram.ui.Components.zo n0(wn wnVar, Context context) {
        org.telegram.ui.Components.bp bpVar = new org.telegram.ui.Components.bp(context, wnVar.currentAccount, wnVar.f45137h0.getPopupLayout().getSwipeBack(), false, new oj(wnVar), wnVar.getResourceProvider());
        wnVar.f45300u1 = bpVar;
        bpVar.e(wnVar.f45168j6, wnVar.b(), null);
        return wnVar.f45300u1.f26883f;
    }

    public static void n1(wn wnVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = wnVar.getMessagesController().getInputPeer(wnVar.f45168j6);
                tL_messages_getHistory.offset_date = wnVar.M7 + 86400;
                tL_messages_getHistory.limit = 1;
                wnVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new z7(3, wnVar, tLObject));
                return;
            }
            wnVar.actionBar.setSubtitle(LocaleController.getString(R.string.NoMessagesForThisDay));
        }
    }

    public static void o0(wn wnVar) {
        if (MessagesController.getInstance(wnVar.currentAccount).isDialogMuted(wnVar.f45168j6, wnVar.b())) {
            wnVar.gd(true);
            AndroidUtilities.runOnUIThread(new le(wnVar, 7), 150L);
            wnVar.f45137h0.U(null, null);
            if (wnVar.getParentActivity() != null) {
                org.telegram.ui.Components.wc.z(wnVar, 4, 0, wnVar.f45309ua).j();
                return;
            }
            return;
        }
        View view = wnVar.f45249q1.f23116j;
        if (view instanceof org.telegram.ui.ActionBar.g1) {
            ((org.telegram.ui.ActionBar.g1) view).b();
        }
    }

    public static void o1(wn wnVar, Object[] objArr, org.telegram.ui.Components.dz0 dz0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.wc wcVar = new org.telegram.ui.Components.wc(dz0Var.container, wnVar.resourceProvider);
                if (z10) {
                    i10 = R.string.StickersStickerEditedInSetToast;
                } else {
                    i10 = R.string.StickersStickerAddedToSetToast;
                }
                org.telegram.ui.Components.qc q5 = wcVar.q(document, LocaleController.formatString(i10, stickerSet.title));
                q5.f31861j = 2750;
                q5.k(true);
            }
        }
    }

    public static void p0(wn wnVar, int i10, MessageObject messageObject) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f22069id = wnVar.getMessagesController().getInputUser(wnVar.f45113f);
            wnVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new oe(wnVar, 4));
            return;
        }
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(wnVar.getUserConfig().getCurrentUser(), wnVar.f45168j6, messageObject, wnVar.f45166j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, true, 0, 0);
        of2.sendMessageChatArguments = wnVar.O8();
        SendMessagesHelper.getInstance(wnVar.currentAccount).sendMessage(of2);
        if (wnVar.f45091d4 == 0) {
            wnVar.ba(false);
        }
        wnVar.r9(false);
    }

    public static void p1(wn wnVar, int i10) {
        org.telegram.ui.ActionBar.j5 j5Var = wnVar.parentLayout;
        if (j5Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.r2 backgroundFragment = j5Var.getBackgroundFragment();
        if (backgroundFragment instanceof wn) {
            wn wnVar2 = (wn) backgroundFragment;
            if (wnVar2.a() == wnVar.f45168j6) {
                wnVar.finishFragment();
                wnVar2.j(i10, 0, true, 0, true, 0);
                return;
            }
        }
        wnVar.presentFragment(da(i10, wnVar.f45168j6));
    }

    public static void q0(wn wnVar) {
        if (AndroidUtilities.addToClipboard(wnVar.f45209mc.sponsoredAdditionalInfo)) {
            org.telegram.messenger.wh.m(R.string.TextCopied, new org.telegram.ui.Components.wc(org.telegram.ui.Components.lb.a(wnVar.getParentActivity()), wnVar.resourceProvider));
        }
    }

    public static void q1(wn wnVar, int i10) {
        if (wnVar.f45091d4 == 7) {
            Object E = wnVar.Y3.E(i10);
            if (i10 == 0) {
                wnVar.Y3.getClass();
            }
            if (E instanceof MessageObject) {
                wnVar.sa((MessageObject) E);
            }
        } else if (wnVar.C3 != null) {
            if (i10 >= 0 && i10 < wnVar.getMediaDataController().searchResultMessages.size()) {
                wnVar.D3 = false;
                wnVar.Ab(false, true, false);
                wnVar.getMediaDataController().setSearchedPosition(i10);
                wnVar.Wc(wnVar.getMediaDataController().getMask(), wnVar.getMediaDataController().getSearchPosition(), wnVar.getMediaDataController().getSearchCount());
                AndroidUtilities.runOnUIThread(new te(wnVar, wnVar.getMediaDataController().searchResultMessages.get(i10), 2));
            }
        } else {
            wnVar.getMediaDataController().jumpToSearchedMessage(wnVar.classGuid, i10);
            wnVar.bc(false);
        }
    }

    public static void r0(wn wnVar, bg.a aVar, Runnable runnable) {
        if (!wnVar.isFinished) {
            if (bg.a.m(bi.ca.x(wnVar.currentAccount, aVar.f3978a).p()).f3979b < aVar.f3979b) {
                bg.b bVar = aVar.f3978a;
                if (bVar == bg.b.f3980a) {
                    new bi.tc(wnVar.getParentActivity(), wnVar.getResourceProvider(), aVar.a(), 13, pg.d.h(wnVar.currentAccount, wnVar.a()), null, wnVar.a()).show();
                    return;
                } else if (bVar == bg.b.f3981b) {
                    new gi.g(wnVar.getParentActivity(), wnVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void r1(wn wnVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != wnVar.b()) {
            wnVar.f45375zb = SystemClock.uptimeMillis();
            wnVar.F7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                wnVar.eb(wnVar.b());
            } else if (wnVar.b() == 0) {
                wnVar.eb(l4.longValue());
            } else {
                wnVar.D7 = -1;
            }
            wnVar.getConnectionsManager().cancelRequestsForGuid(wnVar.classGuid);
            wnVar.getMessagesStorage().cancelTasksForGuid(wnVar.classGuid);
            wnVar.classGuid = ConnectionsManager.generateClassGuid();
            wnVar.bb();
            wnVar.f45317v5 = null;
            wnVar.K7 = 0;
            wnVar.A7 = false;
            wnVar.B7 = true;
            wnVar.f45345x6.clear();
            wnVar.f45241p4 = l4.longValue();
            TLRPC.TL_forumTopic findTopic = wnVar.getMessagesController().getTopicsController().findTopic(-wnVar.a(), l4.longValue());
            if (l4.longValue() != 0 && findTopic != null) {
                int i12 = findTopic.read_inbox_max_id;
                wnVar.f45329w4 = i12;
                wnVar.f45343x4 = findTopic.read_outbox_max_id;
                wnVar.f45355y4 = Math.max(1, i12);
                wnVar.getMessagesController().getTopicsController().getTopicRepliesCount(wnVar.f45168j6, DialogObject.getPeerDialogId(findTopic.from_id));
            } else {
                wnVar.f45228o4 = null;
                wnVar.f45201m4 = null;
                wnVar.f45166j4 = null;
                wnVar.D5 = null;
                wnVar.f45329w4 = 0;
                wnVar.f45343x4 = 0;
                wnVar.f45355y4 = 0;
                wnVar.f45241p4 = 0L;
                wnVar.f45252q4 = 0;
                wnVar.f45264r4 = null;
                wnVar.f45290t4 = false;
                wnVar.f45277s4 = false;
            }
            wnVar.C8();
            wnVar.ed(true);
            wnVar.f45198m1.n(true);
            wnVar.f45198m1.b();
            wnVar.f45089d2.setCurrentTopic(l4.longValue());
            wnVar.hd(true);
            wnVar.yc(true);
            wnVar.getMessagesController().setForumLastTopicId(-wnVar.a(), wnVar.b());
            wnVar.t9(true);
            wnVar.r9(true);
            jk jkVar = wnVar.Y;
            if (jkVar != null) {
                jkVar.i0(false);
                wnVar.Y.D1(true);
            }
            wnVar.G6(true, true);
            if (findTopic != null) {
                i10 = findTopic.unread_reactions_count;
            } else {
                i10 = 0;
            }
            wnVar.f45340x1 = i10;
            if (findTopic != null) {
                i11 = findTopic.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            wnVar.f45353y1 = i11;
            wnVar.Sc(false);
            wnVar.Rc(false);
            wnVar.id();
            on onVar = wnVar.Oc;
            if (onVar != null && wnVar.actionBar.f22775n0) {
                onVar.k(null);
            }
        }
    }

    public static void s0(long j10, wn wnVar) {
        if (bi.ca.y(wnVar.currentAccount, false).p().amount < j10) {
            new bi.tc(wnVar.getParentActivity(), wnVar.getResourceProvider(), j10, 13, DialogObject.getShortName(wnVar.a()), new jf(wnVar, 26), wnVar.a()).show();
        } else {
            new bi.uc(wnVar.getParentActivity(), wnVar.resourceProvider).show();
        }
    }

    public static void t0(wn wnVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, nf nfVar) {
        String str3;
        if (wnVar.f45291t5 != null && i10 < arrayList.size() && wnVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            MessageObject messageObject = wnVar.f45291t5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.g51.S(wnVar.getParentActivity(), wnVar, inputPeer, iArr[0], wnVar.f45291t5.summarized, strArr[0], str3, charSequence, z10, nfVar, new jf(wnVar, 15)).setDimBehind(false);
            wnVar.J7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(wnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + wnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + wnVar.a(), i11 - 1).apply();
                wnVar.hd(true);
            }
        }
    }

    public static boolean t1(org.telegram.ui.wn r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.t1(org.telegram.ui.wn, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void t8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
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
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        menu.add(R.id.menu_groupbolditalic, R.id.menu_bold, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(LocaleController.getString(R.string.Italic));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.getTypeface("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(R.id.menu_groupbolditalic, R.id.menu_italic, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(LocaleController.getString(R.string.Mono));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.r61(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(R.id.menu_groupbolditalic, R.id.menu_mono, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || AndroidUtilities.getPeerLayerVersion(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(LocaleController.getString(R.string.Strike));
            ?? obj = new Object();
            obj.f35208a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.a21(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(R.id.menu_groupbolditalic, R.id.menu_strike, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(LocaleController.getString(R.string.Underline));
            ?? obj2 = new Object();
            obj2.f35208a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.a21(obj2, 0), 0, spannableStringBuilder5.length(), 33);
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

    public static void u0(wn wnVar, long j10, boolean z10) {
        if (!wnVar.T4.isEmpty()) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wnVar.currentAccount).edit();
            edit.putInt("pin_" + wnVar.f45168j6, ((Integer) wnVar.T4.get(0)).intValue()).commit();
            wnVar.T4.clear();
            wnVar.V4.clear();
            wnVar.X4 = 0;
            wnVar.f45063b5 = 0;
            wnVar.f45078c5 = 0;
            wnVar.Pc(0, true);
        }
        if (ChatObject.isMonoForum(wnVar.e) && ChatObject.canManageMonoForum(wnVar.currentAccount, wnVar.e)) {
            if (j10 != 0) {
                wnVar.getMessagesStorage().removeTopic(-wnVar.e.f22028id, j10);
                wnVar.getMessagesController().deleteSavedDialog(j10, wnVar.getMessagesController().getInputPeer(-wnVar.e.f22028id));
                wnVar.getMessagesController().getTopicsController().onTopicsDeletedServerSide(wnVar.e.f22028id, j10);
            }
        } else {
            wnVar.getMessagesController().deleteDialog(wnVar.f45168j6, 1, z10);
            wnVar.getMessagesStorage().removeAllTopics(wnVar.f45168j6);
            wnVar.getMessagesController().getTopicsController().reloadTopics(-wnVar.f45168j6);
        }
        wnVar.f45079c6.put(j10, 0);
        org.telegram.ui.Components.f41 f41Var = wnVar.f45089d2;
        if (f41Var != null) {
            f41Var.setAllTopicsHidden(false);
        }
        if (j10 == wnVar.f45241p4) {
            wnVar.H7(false, null);
            wnVar.A0.O(false);
        }
    }

    public static void u1(wn wnVar, long j10, long j11, Long l4, Boolean bool) {
        boolean z10 = false;
        bi.ca y3 = bi.ca.y(wnVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.i0(j10, j11, z10, true);
    }

    public static void v0(wn wnVar, ArrayList arrayList, long j10, org.telegram.ui.Components.in0 in0Var, boolean z10, int i10) {
        if (z10) {
            SendMessagesHelper.getInstance(wnVar.currentAccount).sendMessage(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            AndroidUtilities.runOnUIThread(new ag.o0(wnVar, j10, 6), 400L);
            in0Var.dismiss();
        }
    }

    public static void v1(org.telegram.ui.wn r19, final org.telegram.ui.c31[] r20, final org.telegram.ui.Components.l80 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.v1(org.telegram.ui.wn, org.telegram.ui.c31[], org.telegram.ui.Components.l80):void");
    }

    public static void w0(wn wnVar, boolean z10, TLRPC.TL_error tL_error, TLObject tLObject, long j10, boolean z11, boolean z12, boolean z13, TLObject tLObject2) {
        int i10;
        boolean z14;
        wnVar.f45185kb = false;
        if (!z10 && (tL_error != null || !(tLObject instanceof TLRPC.Updates))) {
            if (z12) {
                wnVar.f45196lb = false;
            }
            if (tL_error != null) {
                org.telegram.ui.Components.g5.e0(wnVar.currentAccount, tL_error, wnVar, tLObject2, new Object[0]);
            }
        } else {
            if (tLObject instanceof TLRPC.Updates) {
                TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                wnVar.getMessagesController().putUsers(updates.users, false);
                wnVar.getMessagesController().putChats(updates.chats, false);
            }
            TLRPC.Chat chat = wnVar.getMessagesController().getChat(Long.valueOf(j10));
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
                wnVar.getMessagesStorage().putUsersAndChats(null, arrayList, true, true);
                wnVar.e = chat;
            }
            if (z12) {
                wnVar.getMessagesController().deleteDialog(-j10, 3);
            }
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.channelNewsUpdated, Long.valueOf(j10));
            wnVar.getMessagesController().sortDialogs(null);
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            wnVar.getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.updateInterfaces, Integer.valueOf(MessagesController.UPDATE_MASK_CHAT));
            if (!wnVar.isFinishing()) {
                if (z13) {
                    i10 = R.string.ChannelAddedToNewsBulletin;
                } else if (z12) {
                    i10 = R.string.ChannelRemovedFromNewsBulletin;
                } else if (z11) {
                    i10 = R.string.ChannelRemovedFromChatsBulletin;
                } else {
                    i10 = R.string.ChannelAddedToChatsBulletin;
                }
                wnVar.Mb(i10);
            }
        }
        if (wnVar.B0 != null) {
            wnVar.Kb(false, true);
            wnVar.yc(false);
        }
    }

    public static void w1(wn wnVar, int i10, ArrayList arrayList, TLRPC.InputPeer inputPeer, int[] iArr, String str, CharSequence charSequence, boolean z10, nf nfVar) {
        if (wnVar.f45291t5 != null && i10 < arrayList.size() && wnVar.getParentActivity() != null) {
            org.telegram.ui.Components.g51.S(wnVar.getParentActivity(), wnVar, inputPeer, iArr[0], wnVar.f45291t5.summarized, "und", str, charSequence, z10, nfVar, new jf(wnVar, 27)).setDimBehind(false);
            wnVar.J7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(wnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + wnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + wnVar.a(), i11 - 1).apply();
                wnVar.hd(true);
            }
        }
    }

    public static void x0(wn wnVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, nf nfVar) {
        String str4;
        if (wnVar.f45291t5 != null && i10 < arrayList.size() && wnVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            MessageObject messageObject = wnVar.f45291t5;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
            }
            org.telegram.ui.Components.g51.S(wnVar.getParentActivity(), wnVar, inputPeer, iArr[0], wnVar.f45291t5.summarized, str, str4, charSequence, z10, nfVar, new ig(wnVar, 14)).setDimBehind(false);
            wnVar.J7(false);
            SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(wnVar.currentAccount);
            int i11 = notificationsSettings.getInt("dialog_show_translate_count" + wnVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(wnVar.currentAccount).edit();
                edit.putInt("dialog_show_translate_count" + wnVar.a(), i11 - 1).apply();
                wnVar.hd(true);
            }
        }
    }

    public static void x1(wn wnVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j10;
        int[] iArr3 = wnVar.Q6;
        int[] iArr4 = wnVar.P6;
        boolean[] zArr = wnVar.U6;
        int[] iArr5 = wnVar.O6;
        int[] iArr6 = wnVar.R6;
        boolean[] zArr2 = wnVar.T6;
        ArrayList arrayList = wnVar.f45345x6;
        if ((i10 - i11) - i12 <= i13 && !wnVar.W6) {
            boolean[] zArr3 = wnVar.S6;
            if (!zArr3[0]) {
                wnVar.W6 = true;
                arrayList.add(Integer.valueOf(wnVar.f45191l6));
                if (wnVar.H6.size() != 0) {
                    MessagesController messagesController = wnVar.getMessagesController();
                    j10 = 0;
                    long j11 = wnVar.f45168j6;
                    c10 = 0;
                    long j12 = wnVar.f45065b7;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = wnVar.classGuid;
                    int i17 = wnVar.f45091d4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = wnVar.f45241p4;
                    int i18 = wnVar.f45355y4;
                    int i19 = wnVar.f45191l6;
                    wnVar.f45191l6 = i19 + 1;
                    messagesController.loadMessages(j11, j12, false, 50, i14, 0, z10, i15, i16, 0, 0, i17, j13, i18, i19, wnVar.f45290t4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j10 = 0;
                    MessagesController messagesController2 = wnVar.getMessagesController();
                    long j14 = wnVar.f45168j6;
                    long j15 = wnVar.f45065b7;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = wnVar.classGuid;
                    int i22 = wnVar.f45091d4;
                    long j16 = wnVar.f45241p4;
                    int i23 = wnVar.f45355y4;
                    int i24 = wnVar.f45191l6;
                    wnVar.f45191l6 = i24 + 1;
                    messagesController2.loadMessages(j14, j15, false, 50, 0, 0, z11, i20, i21, 0, 0, i22, j16, i23, i24, wnVar.f45290t4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j10 = 0;
                if (wnVar.f45065b7 != 0 && !zArr3[1]) {
                    wnVar.W6 = true;
                    arrayList.add(Integer.valueOf(wnVar.f45191l6));
                    MessagesController messagesController3 = wnVar.getMessagesController();
                    long j17 = wnVar.f45065b7;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = wnVar.classGuid;
                    int i28 = wnVar.f45091d4;
                    long j18 = wnVar.f45241p4;
                    int i29 = wnVar.f45355y4;
                    int i30 = wnVar.f45191l6;
                    wnVar.f45191l6 = i30 + 1;
                    messagesController3.loadMessages(j17, 0L, false, 50, i25, 0, z12, i26, i27, 0, 0, i28, j18, i29, i30, wnVar.f45290t4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !wnVar.Y7 && i11 <= 10) {
            if (wnVar.f45065b7 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(wnVar.f45191l6));
                MessagesController messagesController4 = wnVar.getMessagesController();
                long j19 = wnVar.f45065b7;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = wnVar.classGuid;
                int i34 = wnVar.f45091d4;
                long j20 = wnVar.f45241p4;
                int i35 = wnVar.f45355y4;
                int i36 = wnVar.f45191l6;
                wnVar.f45191l6 = i36 + 1;
                messagesController4.loadMessages(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, 0, i34, j20, i35, i36, wnVar.f45290t4);
                wnVar.Y7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(wnVar.f45191l6));
                MessagesController messagesController5 = wnVar.getMessagesController();
                long j21 = wnVar.f45168j6;
                long j22 = wnVar.f45065b7;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = wnVar.classGuid;
                int i40 = wnVar.f45091d4;
                long j23 = wnVar.f45241p4;
                int i41 = wnVar.f45355y4;
                int i42 = wnVar.f45191l6;
                wnVar.f45191l6 = i42 + 1;
                messagesController5.loadMessages(j21, j22, false, 50, i37, 0, true, i38, i39, 1, 0, i40, j23, i41, i42, wnVar.f45290t4);
                wnVar.Y7 = true;
            }
        }
    }

    public static void y0(org.telegram.ui.wn r7, java.lang.String r8, org.telegram.messenger.MessageObject r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.y0(org.telegram.ui.wn, java.lang.String, org.telegram.messenger.MessageObject, boolean):void");
    }

    public static void y1(wn wnVar) {
        if (wnVar.f45209mc == null) {
            return;
        }
        c31[] c31VarArr = {c31.T(wnVar.getParentActivity(), wnVar, true, wnVar.resourceProvider, new li.s2(13, wnVar, c31VarArr))};
    }

    public static void z0(wn wnVar, org.telegram.ui.Cells.s1 s1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        boolean z11;
        int i10;
        org.telegram.ui.Components.l80 I = org.telegram.ui.Components.l80.I(wnVar, s1Var);
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(wnVar.getParentActivity(), wnVar.f45309ua);
        I.f30163p = new re(in0Var, 0);
        if (z10 && wnVar.getMessagesController().config.walletAvailable.get()) {
            I.c(R.drawable.ic_gram, LocaleController.getString(R.string.WalletSendMoney), new se(wnVar, str, 5), false);
        }
        I.c(R.drawable.msg_copy, LocaleController.getString(R.string.WalletCopyAddress), new ve(wnVar, in0Var, str, 1), false);
        if (z10) {
            I.c(R.drawable.msg_search, LocaleController.getString(R.string.WalletViewInExplorer), new se(wnVar, str, 6), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = wnVar.currentAccount;
                long j10 = user.f22177id;
                ed edVar = new ed(4, wnVar, userArr);
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
        in0Var.e(I);
        in0Var.f(s1Var, characterStyle, null, false);
        wnVar.showDialog(in0Var);
    }

    public static void z1(wn wnVar, View view, int i10) {
        org.telegram.ui.Components.c6 c6Var;
        TLRPC.User user;
        char c10;
        mk mkVar;
        mk mkVar2;
        if (i10 != 0) {
            ig.j1 adapter = wnVar.U1.getAdapter();
            if (adapter.f14136w0 != null && !adapter.f14118h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = wnVar.U1.getAdapter().J(i11);
            int i12 = wnVar.U1.getAdapter().X;
            int i13 = wnVar.U1.getAdapter().Y;
            if (wnVar.U1.getAdapter().F != null && i11 == 1) {
                wnVar.Y.L0(i12, i13, wnVar.U1.getAdapter().F + "@" + ChatObject.getPublicUsername(wnVar.e) + " ", false);
            } else if (wnVar.U1.getAdapter().F != null && i11 == 0) {
                wnVar.Y.L0(i12, i13, a1.g.s(new StringBuilder(), wnVar.U1.getAdapter().F, " "), false);
            } else if (J instanceof jg.b2) {
                if (!wnVar.getUserConfig().isPremium()) {
                    wnVar.showDialog(new tg.y0(wnVar, wnVar.getParentActivity(), wnVar.currentAccount, true, 31, false, null));
                    return;
                }
                jg.b2 b2Var = (jg.b2) J;
                org.telegram.ui.Components.g5.Z(wnVar.currentAccount, Math.max(1, b2Var.a()), wnVar.f45168j6, new li.s2(10, wnVar, b2Var));
            } else {
                MessageObject.SendAnimationData sendAnimationData = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (wnVar.f45091d4 != 0 || !wnVar.n7(view)) {
                        if (view instanceof org.telegram.ui.Cells.g8) {
                            sendAnimationData = ((org.telegram.ui.Cells.g8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.g5.Z(wnVar.currentAccount, 1, wnVar.a(), new bi.b3(wnVar, tL_document, MessageObject.findAnimatedEmojiEmoticon(tL_document), wnVar.U1.getAdapter().L(i11), sendAnimationData, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (wnVar.f45367z3 && (mkVar2 = wnVar.f45090d3) != null && mkVar2.getVisibility() == 0) {
                        wnVar.mb(chat, null);
                        return;
                    }
                    String publicUsername = ChatObject.getPublicUsername(chat);
                    if (publicUsername != null) {
                        wnVar.Y.L0(i12, i13, a1.g.p("@", publicUsername, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (wnVar.f45367z3 && (mkVar = wnVar.f45090d3) != null && mkVar.getVisibility() == 0) {
                        wnVar.mb(null, user2);
                    } else if (UserObject.getPublicUsername(user2) != null) {
                        wnVar.Y.L0(i12, i13, "@" + UserObject.getPublicUsername(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(org.telegram.ui.Components.b10.u(UserObject.getFirstName(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.b71("" + user2.f22177id, 3, null), 0, spannableString.length(), 33);
                        wnVar.Y.L0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof ig.g1) {
                    if (wnVar.U1.getAdapter().J != null && wnVar.f45091d4 != 1) {
                        ig.g1 g1Var = (ig.g1) J;
                        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(g1Var.f14059a, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, null, false, null, null, null, true, 0, 0, null, false);
                        of2.sendMessageChatArguments = wnVar.O8();
                        of2.ephemeralReceiverBotId = g1Var.f14060b;
                        of2.monoForumPeer = wnVar.a9();
                        of2.suggestionParams = wnVar.f45330w5;
                        wnVar.getSendMessagesHelper().sendMessage(of2);
                        wnVar.Y.setFieldText("");
                        wnVar.r9(false);
                    }
                } else if (J instanceof String) {
                    if (wnVar.U1.getAdapter().J != null) {
                        if (wnVar.f45091d4 == 1) {
                            org.telegram.ui.Components.g5.L(wnVar.getParentActivity(), wnVar.f45168j6, new m4.s0(15, wnVar, (String) J), wnVar.f45309ua);
                            return;
                        } else if (!wnVar.n7(view)) {
                            org.telegram.ui.Components.g5.Z(wnVar.currentAccount, 1, wnVar.f45168j6, new li.s2(11, wnVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    wnVar.Y.L0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (wnVar.Y.getFieldText() != null) {
                        if (wnVar.f45091d4 == 1 || !wnVar.n7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (wnVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c10 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c10 = 2;
                                } else {
                                    c10 = 0;
                                }
                                if (c10 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wnVar.getParentActivity(), 0, wnVar.f45309ua);
                                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.SendMessageTitle);
                                    if (c10 == 1) {
                                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.GameCantSendSecretChat);
                                    } else {
                                        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.InvoiceCantSendSecretChat);
                                    }
                                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                                    wnVar.showDialog(alertDialog$Builder.f22369a);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(wnVar.U1.getAdapter().R);
                                wnVar.Ya = arrayList;
                                PhotoViewer.v1().N2(null, wnVar, wnVar.f45309ua);
                                PhotoViewer.v1().j2(arrayList, wnVar.U1.getAdapter().M(i11), 3, false, wnVar.Za, wnVar);
                                return;
                            }
                            org.telegram.ui.Components.g5.Z(wnVar.currentAccount, 1, wnVar.a(), new li.s2(12, wnVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    ed edVar = new ed(6, wnVar, (TLRPC.TL_inlineBotWebView) J);
                    if (wnVar.Jb) {
                        edVar.run();
                    } else {
                        mi1.a(wnVar.getParentActivity(), new li.s2(14, wnVar, edVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    bk bkVar = wnVar.U1;
                    if (bkVar != null && (user = bkVar.getAdapter().f14136w0) != null) {
                        wnVar.Y.setFieldText("");
                        long j10 = wnVar.f45168j6;
                        if (j10 == user.f22177id) {
                            wnVar.f45320v8 = j10;
                            wnVar.getMessagesController().sendBotStart(wnVar.f45113f, tL_inlineBotSwitchPM.start_param);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f22177id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", wnVar.f45168j6);
                        if (wnVar.getMessagesController().checkCanOpenChat(bundle, wnVar)) {
                            wnVar.presentFragment(new wn(bundle));
                        }
                    }
                } else if (J instanceof MediaDataController.KeywordResult) {
                    String str = ((MediaDataController.KeywordResult) J).emoji;
                    jk jkVar = wnVar.Y;
                    jkVar.Q();
                    jkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            wnVar.Y.L0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = wnVar.Y.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                FileLog.e((Throwable) e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document f7 = org.telegram.ui.Components.t5.f(wnVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(MessageObject.findAnimatedEmojiEmoticon(f7));
                            if (f7 != null) {
                                c6Var = new org.telegram.ui.Components.c6(f7, fontMetricsInt);
                            } else {
                                c6Var = new org.telegram.ui.Components.c6(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(c6Var, 0, spannableString2.length(), 33);
                            wnVar.Y.L0(i12, i13, spannableString2, false);
                            wnVar.U1.o(false);
                        }
                    }
                    wnVar.Y.L0(i12, i13, str, true);
                    wnVar.U1.o(false);
                }
            }
        }
    }

    public static Integer z8(ArrayList arrayList, int i10, int[] iArr) {
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

    @Override
    public final org.telegram.ui.Components.ww0 A() {
        return this.f45163j1;
    }

    public final void A6(MessageObject messageObject, MessageObject messageObject2) {
        long pollId = messageObject.getPollId();
        if (pollId != 0) {
            a0.h hVar = this.M6;
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

    public final void A7() {
        int i10;
        wn wnVar = this.f45296ta;
        if (wnVar != null) {
            wnVar.A7();
        }
        int dp = AndroidUtilities.dp(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight + ((int) i9(AndroidUtilities.dp(7.0f)));
        uk ukVar = this.A1;
        if (ukVar != null) {
            i10 = AndroidUtilities.dp(ukVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int dp2 = AndroidUtilities.dp(L8() * 43.0f) + dp + i10;
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
        org.telegram.ui.Components.c10 c10Var = this.f45226o2;
        if (c10Var != null) {
            c10Var.setTranslationY(dp2);
        }
        org.telegram.ui.Components.fy0 fy0Var = this.f45239p2;
        if (fy0Var != null) {
            fy0Var.f28312a.setTranslationY(((dp2 - dp3) / 2.0f) + AndroidUtilities.dp(32.0f));
        }
    }

    public final org.telegram.ui.Cells.z A8(int i10, boolean z10) {
        MessageObject messageObject;
        rj rjVar = this.f45339x0;
        if (rjVar != null) {
            int childCount = rjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f45339x0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    messageObject = ((org.telegram.ui.Cells.v0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.getId() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.I9 - this.K9) - AndroidUtilities.dp(4.0f) || childAt.getY() > this.f45339x0.getMeasuredHeight() - this.Ra) {
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

    public final void A9() {
        if (!this.T9) {
            this.T9 = true;
            om omVar = this.f45163j1;
            if (omVar != null) {
                omVar.invalidate();
            }
            rj rjVar = this.f45339x0;
            if (rjVar != null) {
                rjVar.invalidate();
            }
        }
        UndoView undoView = this.K3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(j9(org.telegram.ui.Components.b41.f26732c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(16.0f));
        }
        E7();
    }

    public final void Aa(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.f45198m1.e(true, false);
            } else if (getMessagesController().isCommunity(j10)) {
                showDialog(new ii.j0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().checkCanOpenChat(bundle, this)) {
                    presentFragment(new wn(bundle));
                }
            }
        } else if (j10 != getUserConfig().getClientUserId()) {
            if (j10 == a()) {
                this.f45198m1.e(true, false);
                return;
            }
            Bundle h = a1.g.h(j10, "user_id");
            if (this.h != null && j10 == this.f45113f.f22177id) {
                h.putLong("dialog_id", this.f45168j6);
            }
            ProfileActivity profileActivity = new ProfileActivity(h, null);
            TLRPC.User user = this.f45113f;
            if (user != null && user.f22177id == j10) {
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

    public final void Ab(boolean r27, boolean r28, boolean r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Ab(boolean, boolean, boolean):void");
    }

    public final void Ac() {
        int i10;
        org.telegram.ui.Components.ub ubVar;
        vk vkVar;
        jk jkVar;
        if (this.T9 && this.f45339x0 != null) {
            float f7 = 0.0f;
            if (this.Fa <= 0 || this.Ua != 0.0f) {
                float i92 = i9(AndroidUtilities.dp(7.0f));
                uk ukVar = this.A1;
                if (ukVar != null) {
                    i10 = AndroidUtilities.dp(ukVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float L8 = (L8() * AndroidUtilities.dp(43.0f)) + i92 + i10;
                float f10 = this.I9;
                this.J9 = L8;
                this.I9 = j9(org.telegram.ui.Components.b41.f26730a) + AndroidUtilities.dp(4.0f) + this.L9 + L8;
                if (this.actionBar.getVisibility() == 0 || this.f45296ta != null) {
                    this.I9 += this.actionBar.getMeasuredHeight();
                }
                this.K9 = 0;
                this.I9 = this.I9 + this.Qa + this.M9;
                if (this.Ua != 0.0f && (jkVar = this.Y) != null && jkVar.getVisibility() == 0) {
                    float f11 = this.I9;
                    float measuredHeight = this.Ua * (this.Y.getMeasuredHeight() - AndroidUtilities.dp(44.0f));
                    this.I9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.v0 v0Var = this.f45189l3;
                if (v0Var != null) {
                    v0Var.setTranslationY(((this.f45339x0.getTranslationY() + this.I9) + this.Q9) - AndroidUtilities.dp(30.0f));
                    float f12 = this.I9;
                    float f13 = this.Q9;
                    this.I9 = f12 + f13;
                    this.K9 = (int) (this.K9 + f13);
                }
                ak akVar = this.f45165j3;
                if (akVar != null) {
                    akVar.setTranslationY((((this.f45339x0.getTranslationY() - f7) + this.I9) + this.O9) - AndroidUtilities.dp(4.0f));
                }
                Cc();
                rj rjVar = this.f45339x0;
                if (rjVar != null && this.f45364z0 != null && this.A0 != null) {
                    int paddingTop = rjVar.getPaddingTop();
                    int paddingBottom = this.f45339x0.getPaddingBottom();
                    w7();
                    if (this.f45339x0.getPaddingTop() != paddingTop || this.f45339x0.getPaddingBottom() != paddingBottom) {
                        C9();
                    }
                    this.f45339x0.setTopGlowOffset((int) ((this.I9 - this.K9) - AndroidUtilities.dp(4.0f)));
                    if (f10 != this.I9 && this.pb == 0) {
                        int childCount = this.f45339x0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f45339x0.getChildAt(i11);
                            this.f45339x0.getClass();
                            if (RecyclerView.R(childAt) == this.A0.h() - 1) {
                                float f14 = this.I9;
                                if (childAt.getTop() > f14) {
                                    this.f45339x0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!R9() && !this.P4 && this.pb == 0 && this.Z7 != null && this.f45339x0 != null && ((vkVar = this.f45060b2) == null || vkVar.getVisibility() != 0)) {
                        this.f45339x0.scrollBy(0, (int) (f10 - this.I9));
                    }
                }
                this.T9 = false;
                org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
                if (qcVar != null && (ubVar = qcVar.e) != null) {
                    ubVar.updatePosition();
                }
                w7();
            }
        }
    }

    @Override
    public final List B() {
        String string;
        ArrayList arrayList = new ArrayList();
        if (ChatObject.isChannel(this.e)) {
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugShareAlert)));
            int i10 = this.f45044a;
            if (i10 != 1) {
                if (i10 != 2) {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeNormal);
                } else {
                    string = LocaleController.getString(R.string.DebugShareAlertDialogsModeMore);
                }
            } else {
                string = LocaleController.getString(R.string.DebugShareAlertDialogsModeLess);
            }
            arrayList.add(new og.a(LocaleController.formatString(R.string.DebugShareAlertSwitchDialogsMode, string), new ig(this, 21)));
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugShareAlertTopicsSlowMotion), new ig(this, 22)));
        }
        if (this.f45113f == null) {
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugMessageSkeletons)));
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugMessageSkeletonsLightOverlayAlpha), 0.0f, 255.0f, new s0("", 1)));
            arrayList.add(new og.a(LocaleController.getString(R.string.DebugMessageSkeletonsSaturation), 1.0f, 10.0f, new org.telegram.ui.Cells.b2(this)));
        }
        return arrayList;
    }

    public final void B6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.q9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f45113f, null, this.f45168j6, this.La, this.Ka);
    }

    public final void B7() {
        int i10;
        float f7 = (1.0f - this.Zc.e) * (1.0f - this.Xc.e);
        this.f45313v1.setTranslationX((1.0f - f7) * AndroidUtilities.dp(80.0f));
        this.f45313v1.setAlpha(f7);
        lh.h hVar = this.f45313v1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        hVar.setVisibility(i10);
    }

    public final org.telegram.ui.Cells.v0 B8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f45339x0 != null && this.A0 != null) {
            for (int i10 = 0; i10 < this.f45339x0.getChildCount(); i10++) {
                View childAt = this.f45339x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.v0) {
                    org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                    if (org.telegram.ui.Wallet.l0.I(v0Var.getMessageObject(), wallettransaction)) {
                        return v0Var;
                    }
                }
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i11 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.l0.I((MessageObject) arrayList.get(i11), wallettransaction)) {
                    this.f45339x0.C0();
                    this.f45364z0.h1(this.A0.J + i11, 0);
                    return null;
                } else {
                    i11++;
                }
            }
        }
        return null;
    }

    public final void B9() {
        boolean z10;
        Rect rect;
        if (this.f45163j1 != null) {
            if (this.f45297tb <= 0 && this.f45310ub <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            mj mjVar = this.v;
            float c10 = mjVar.c();
            oe.m mVar = mjVar.f47655b;
            int max = (int) Math.max(0.0f, (c10 * mVar.f19350a) - AndroidUtilities.dp(29.0f));
            om omVar = this.f45163j1;
            bi.cc ccVar = omVar.L;
            Rect rect2 = this.ed;
            if (ccVar != null) {
                rect2.set(0, 0, omVar.getMeasuredWidth(), this.f45163j1.getMeasuredHeight() - max);
                this.f45163j1.L.setClipBounds(rect2);
            }
            if (this.f45339x0 != null) {
                rect2.set(0, 0, this.f45163j1.getMeasuredWidth(), this.f45163j1.getMeasuredHeight() - max);
                rect2.offset(0, -this.f45339x0.getTop());
                rj rjVar = this.f45339x0;
                if (rjVar.Z0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                rjVar.setClipBounds(rect);
            }
            if (this.X != null) {
                rect2.set(0, 0, this.f45163j1.getMeasuredWidth(), this.f45163j1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(mjVar.v, mjVar.c() * mVar.f19350a) - AndroidUtilities.dp(29.0f))));
                lh.f fVar = this.X;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void Ba(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap createVideoThumbnail = SendMessagesHelper.createVideoThumbnail(str, 1);
            PhotoViewer.v1().N2(null, this, this.f45309ua);
            ArrayList arrayList = new ArrayList();
            MediaController.PhotoEntry photoEntry = new MediaController.PhotoEntry(0, 0, 0L, str, 0, true, 0, 0, 0L);
            photoEntry.caption = charSequence;
            arrayList.add(photoEntry);
            if (PhotoViewer.v1().U1()) {
                PhotoViewer.v1().H0(false, false);
            }
            PhotoViewer.v1().j2(arrayList, 0, 0, false, new pl(this, createVideoThumbnail, arrayList), this);
            return;
        }
        u8(charSequence, null);
        SendMessagesHelper.prepareSendingVideo(getAccountInstance(), str, null, null, null, this.f45168j6, this.D5, this.f45166j4, null, this.B5, null, 0, this.F5, true, 0, 0, false, false, null, O8(), 0L, 0L, a9(), this.f45330w5);
        E6();
    }

    public final void Bb(int i10, int i11, String str) {
        this.f45066b8 = i10;
        this.f45095d8 = true;
        this.f45109e8 = 0L;
        this.f45121f8 = str;
        this.f45158i8 = i11;
        this.f45081c8 = true;
    }

    public final void Bc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        MessageObject.GroupedMessages groupedMessages;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        MessageObject messageObject;
        ArrayList arrayList2 = new ArrayList(MediaDataController.getInstance(this.currentAccount).getFoundMessageObjects());
        if (this.f45362yb == null) {
            this.f45362yb = new a0.h();
        }
        a0.h hVar2 = this.f45349xb;
        if (hVar2 == null) {
            this.f45349xb = new a0.h();
        } else {
            hVar2.b();
        }
        this.A0.P.clear();
        this.f45362yb.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i10 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.N6;
            arrayList = this.K6;
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
                int i12 = f45037hd;
                f45037hd = i12 + 1;
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
                    groupedMessages2.reversed = this.f45136gb;
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
            this.f45362yb.k(messageObject2, messageObject2.getId());
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
            if (!this.f45362yb.d(messageObject4.getId())) {
                messageObject4.isOutOwnerCached = null;
                TLRPC.Message message3 = messageObject4.messageOwner;
                if (message3 != null) {
                    message3.out = true;
                }
                this.A0.P.add(messageObject4);
                this.f45362yb.k(messageObject4, messageObject4.getId());
            }
        }
        int i18 = 0;
        while (i18 < this.A0.P.size()) {
            MessageObject messageObject5 = (MessageObject) this.A0.P.get(i18);
            if (messageObject5.hasValidGroupId() && (groupedMessages = (MessageObject.GroupedMessages) hVar.f(messageObject5.getGroupId())) != null) {
                for (int size2 = groupedMessages.messages.size() - 1; size2 >= 0; size2--) {
                    MessageObject messageObject6 = groupedMessages.messages.get(size2);
                    if (messageObject6 != messageObject5 && !this.f45362yb.d(messageObject6.getId())) {
                        this.A0.P.add(i18, messageObject6);
                        this.f45362yb.k(messageObject6, messageObject6.getId());
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
            if (this.f45136gb && messageObject8 != null && i19 == 0) {
                Pa(messageObject8, i19);
                i19++;
            }
            if (!this.f45136gb && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Pa(messageObject7, i19);
                i19++;
            }
            ArrayList arrayList4 = (ArrayList) this.f45349xb.f(messageObject8.dateKeyInt);
            if (arrayList4 == null) {
                arrayList4 = org.telegram.messenger.t.k(messageObject8.dateKeyInt, this.f45349xb);
            }
            arrayList4.add(messageObject8);
            if (this.f45136gb && messageObject7 != null && messageObject8.dateKeyInt != messageObject7.dateKeyInt) {
                Pa(messageObject8, i19);
                i19++;
            }
            if (!this.f45136gb && i19 >= this.A0.P.size() - 1) {
                Pa(messageObject8, this.A0.P.size());
                i19++;
            }
            i19++;
            messageObject7 = messageObject8;
        }
        this.A0.O = MediaDataController.getInstance(this.currentAccount).searchEndReached();
        if (z10) {
            this.A0.T();
            this.A0.O(true);
            if (this.A0.N ? !getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty() : !this.W6 || !arrayList.isEmpty() || this.A0.f39934w >= 0) {
                z11 = false;
            }
            fc(z11);
            if (this.f45339x0 != null) {
                P7(false);
                if (this.A0.N ? !(getMediaDataController().isSearchLoading() || !this.A0.P.isEmpty()) : !(this.W6 || !arrayList.isEmpty() || this.A0.f39934w >= 0)) {
                    this.f45339x0.setEmptyView(this.f45074c1);
                    rj rjVar = this.f45339x0;
                    rjVar.K0(rjVar.z1());
                    return;
                }
                this.f45074c1.setVisibility(8);
                this.f45339x0.setEmptyView(null);
            }
        }
    }

    @Override
    public final boolean C() {
        return false;
    }

    public final void C6(MessageObject messageObject, boolean z10) {
        D6(messageObject, z10, true);
    }

    public final void C7() {
        wn wnVar = this.f45296ta;
        if (wnVar != null) {
            wnVar.C7();
        }
        float i92 = i9(AndroidUtilities.dp(7.0f)) + this.actionBar.getMeasuredHeight() + AndroidUtilities.dp(1.0f);
        if (this.f45089d2 != null) {
            i92 += j9(org.telegram.ui.Components.b41.f26730a);
        }
        if (this.A1 != null) {
            i92 += AndroidUtilities.dp(35.0f) * this.A1.E;
        }
        this.X.setFadeZoneTop((int) ((L8() * AndroidUtilities.dp(43.0f)) + i92));
    }

    public final void C8() {
        if (this.A7) {
            return;
        }
        this.A7 = true;
        getMessagesController().checkSensitive(this, this.f45168j6, new le(this, 25), new jf(this, 20));
    }

    public final void C9() {
        this.Ha = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Ca() {
        this.f45107e6 = true;
        this.fragmentBeginToShow = true;
        this.f45195la = null;
        this.f45163j1.invalidate();
        this.f45163j1.setSkipBackgroundDrawing(false);
        this.ia = false;
        this.fragmentView.setAlpha(1.0f);
        this.f45198m1.setTranslationY(0.0f);
        this.f45198m1.getAvatarImageView().setScaleX(1.0f);
        this.f45198m1.getAvatarImageView().setScaleY(1.0f);
        this.f45198m1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Cb(long j10) {
        this.f45241p4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f22049id = (int) j10;
        new MessageObject(this.currentAccount, tL_message, false, false);
    }

    public final void Cc() {
        int i10;
        yj yjVar = this.f45177k3;
        if (yjVar == null) {
            return;
        }
        yjVar.setTranslationX(e9() / 2.0f);
        this.f45177k3.setTranslationY((((this.f45339x0.getTranslationY() + this.I9) + this.P9) - AndroidUtilities.dp(4.0f)) + AndroidUtilities.dp(28.0f));
        float clamp = Utilities.clamp(AndroidUtilities.ilerp(this.P9, -this.f45177k3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f45177k3.setAlpha(this.f45302u3 * clamp);
        yj yjVar2 = this.f45177k3;
        if (this.f45302u3 * clamp > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        yjVar2.setVisibility(i10);
        float lerp = AndroidUtilities.lerp(0.5f, 1.0f, clamp);
        this.f45177k3.setScaleX(lerp);
        this.f45177k3.setScaleY(lerp);
    }

    public final void D6(org.telegram.messenger.MessageObject r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.D6(org.telegram.messenger.MessageObject, boolean, boolean):void");
    }

    public final void D7() {
        if (this.Y0 != null) {
            this.Y0.setPadding(AndroidUtilities.dp(7.0f) + ((int) ((1.0f - L8()) * (1.0f - this.Zc.e) * e9())), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f), AndroidUtilities.dp(7.0f));
        }
    }

    public final boolean D8() {
        boolean z10;
        MessageObject.GroupedMessages currentMessagesGroup;
        int childCount = this.f45339x0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f45339x0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.s1) && (currentMessagesGroup = ((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.hasSibling && !currentMessagesGroup.messages.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.groupId))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.groupId), currentMessagesGroup);
                    int indexOf = this.K6.indexOf((MessageObject) ic.a.g(1, currentMessagesGroup.messages));
                    if (indexOf >= 0) {
                        hm hmVar = this.A0;
                        hmVar.q(indexOf + hmVar.J, currentMessagesGroup.messages.size());
                        this.f45339x0.setItemAnimator(null);
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

    public final void D9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().getClientUserId() && !getUserConfig().isPremium() && (user = this.f45113f) != null && user.contact_require_premium) {
            boolean isEmpty = this.K6.isEmpty();
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

    public final void Da(long j10, boolean z10) {
        if (this.f45089d2 != null && UserObject.isBotForum(this.f45113f)) {
            this.f45089d2.setAllTopicsHidden(true);
        }
        this.f45079c6.put(j10, 1);
        Z7();
        UndoView undoView = this.K3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f45168j6, 0, new fg(this, j10, z10), new ag.o0(this, j10, 3));
        this.A0.O(false);
    }

    public final void Db(View view) {
        View view2 = this.Z8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.v0)) {
                ((org.telegram.ui.Cells.v0) view2).setInvalidateWithParent(null);
            }
            this.Z8 = view;
            if (view instanceof org.telegram.ui.Cells.v0) {
                ((org.telegram.ui.Cells.v0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Dc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().getClientUserId() && (userFull = this.f45255q8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().isPremium()) && this.f45255q8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f45088d1 != null) {
            if (z10 && this.f45115f1 == null) {
                pi piVar = new pi(getParentActivity(), getResourceProvider(), this);
                this.f45115f1 = piVar;
                org.telegram.ui.Components.kb1.c(piVar, 0.02f, 1.2f);
                this.f45115f1.setOnClickListener(new we(this, 12));
            }
            pi piVar2 = this.f45115f1;
            if (piVar2 != null) {
                if (!z10) {
                    piVar2.setVisibility(8);
                    return;
                }
                piVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f45255q8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f45255q8.business_intro.title)) {
                    i10 = R.string.GreetingHowSticker;
                } else {
                    i10 = R.string.GreetingHow;
                }
                String formatString = LocaleController.formatString(i10, UserObject.getFirstName(this.f45113f));
                int indexOf = formatString.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(formatString);
                if (indexOf > 0) {
                    formatString = formatString.substring(0, indexOf) + formatString.substring(indexOf + 2);
                    int indexOf2 = formatString.indexOf("**");
                    if (indexOf2 > 0) {
                        formatString = formatString.substring(0, indexOf2) + formatString.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(formatString);
                        x01 x01Var = new x01(formatString.substring(indexOf, indexOf2));
                        if (x01Var.f45441c != -1) {
                            x01Var.f45441c = -1;
                            x01Var.invalidateSelf();
                        }
                        x01Var.a(503316480);
                        x01Var.setBounds(0, 0, x01Var.getIntrinsicWidth(), AndroidUtilities.dp(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(x01Var), indexOf, indexOf2, 33);
                    }
                }
                this.f45115f1.setCustomText(spannableStringBuilder);
                this.f45115f1.setOverrideTextMaxWidth(fi.v3.a(formatString, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f45115f1.getParent() != null && (!z10 || this.f45115f1.getParent() != this.f45088d1)) {
                    ((ViewGroup) this.f45115f1.getParent()).removeView(this.f45115f1);
                }
                if (z10) {
                    ViewParent parent = this.f45115f1.getParent();
                    LinearLayout linearLayout = this.f45088d1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f45115f1, org.telegram.ui.Components.kb1.x(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    @Override
    public final void E(int i10, float f7, float f10, oe.e eVar) {
        boolean z10;
        int i11;
        int i12;
        if (i10 == 0) {
            fa();
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
            fa();
            B7();
            sh.c cVar = this.f45100dd;
            if (cVar != null) {
                cVar.setAnimatedVisibility(this.Xc.e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                oe.b bVar = this.Yc;
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
                org.telegram.ui.Components.f41 f41Var = this.f45089d2;
                if (f41Var != null) {
                    f41Var.setAlpha(f12);
                    org.telegram.ui.Components.f41 f41Var2 = this.f45089d2;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    f41Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                bh.r rVar = this.W3;
                oe.b bVar2 = this.Zc;
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
                u7();
                if (bVar2.e >= 1.0f) {
                    z11 = false;
                }
                rj rjVar = this.f45339x0;
                if (z11) {
                    i13 = 0;
                }
                rjVar.setVisibility(i13);
                B7();
                E7();
                D7();
                this.glassEngine.g();
            } else if (i10 == 5) {
                t7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f7);
                }
            } else if (i10 == 6) {
                y7();
            }
        }
    }

    public final void E6() {
        this.f45330w5 = null;
        if (this.f45241p4 == 0 || this.f45290t4) {
            if (this.f45290t4) {
                this.D5 = this.f45166j4;
            } else {
                this.D5 = null;
            }
            this.B5 = null;
            jk jkVar = this.Y;
            if (jkVar != null) {
                jkVar.h1(null, null, null);
            }
        }
        r9(false);
        if (this.f45091d4 == 0) {
            getMediaDataController().cleanDraft(this.f45168j6, this.f45241p4, true);
        }
    }

    public final void E7() {
        float f7 = this.M9;
        uk ukVar = this.A1;
        if (ukVar != null) {
            ukVar.setTranslationY(f7);
            f7 += AndroidUtilities.dp(35.0f) * this.A1.E;
        }
        gk gkVar = this.B1;
        if (gkVar != null) {
            gkVar.setTranslationY(f7);
        }
        float L8 = (L8() * AndroidUtilities.dp(43.0f)) + f7;
        org.telegram.ui.Components.f41 f41Var = this.f45089d2;
        org.telegram.ui.Components.b41 b41Var = org.telegram.ui.Components.b41.f26730a;
        if (f41Var != null) {
            f41Var.setSideMenuBackgroundMarginTop((L8() * i9(AndroidUtilities.dp(7.0f))) + L8);
            float j92 = j9(b41Var);
            float a2 = a8.v0.a(this.Zc.e);
            float L82 = L8();
            L8 += a8.v0.a(Math.min(a8.ee.a(a8.v0.a(a2), 0.0f, 1.0f), a8.ee.a(a8.v0.a(L82), 0.0f, 1.0f))) * j92;
        }
        org.telegram.ui.Components.ch chVar = this.Y0;
        if (chVar != null) {
            chVar.setTranslationY((L8 - AndroidUtilities.dp(5.0f)) - (L8() * j9(b41Var)));
        }
    }

    public final void E8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j10) {
        boolean z13;
        if (!arrayList.isEmpty() && o7()) {
            boolean z14 = false;
            if (i10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f45091d4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.E9 = true;
                hm hmVar = this.A0;
                if (hmVar != null) {
                    hmVar.K(true);
                }
            }
            int sendMessage = getSendMessagesHelper().sendMessage(arrayList, this.f45168j6, z10, z11, z12, i10, 0, this.f45166j4, -1, j10, a9(), this.f45330w5);
            org.telegram.ui.Components.g5.s0(sendMessage, this, this.f45309ua);
            if (sendMessage != 0) {
                AndroidUtilities.runOnUIThread(new jf(this, 29));
            }
        }
    }

    public final boolean E9() {
        if (this.f45089d2 != null && this.f45241p4 == 0) {
            return true;
        }
        return false;
    }

    public final boolean Ea() {
        if (this.T4.size() != 1 || this.f45178k4 == null || ((Integer) this.T4.get(0)).intValue() != this.f45178k4.getId()) {
            return false;
        }
        return true;
    }

    public final void Eb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f45228o4 = tL_forumTopic;
        this.f45201m4 = arrayList;
        MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
        this.f45166j4 = messageObject;
        this.D5 = messageObject;
        this.f45329w4 = i11;
        this.f45343x4 = i12;
        this.f45355y4 = Math.max(1, i11);
        this.f45241p4 = this.f45166j4.getId();
        this.f45252q4 = i10;
        this.f45264r4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45290t4 = z10;
        MessageObject messageObject2 = this.D5;
        TLRPC.MessageFwdHeader messageFwdHeader = messageObject2.messageOwner.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45277s4 = z11;
        if (z10) {
            messageObject2.isTopicMainMessage = true;
        }
        Qc();
        hd(false);
        yc(false);
    }

    public final void Ec() {
        final long j10;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String formatString;
        if (this.f45102e1 == null) {
            return;
        }
        String str = null;
        if (ChatObject.isMonoForum(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().getMonoForumLinkedChat(this.e.f22028id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !ChatObject.canManageMonoForum(this.currentAccount, chat2)) {
                final long j11 = this.e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    formatString = LocaleController.formatString(R.string.SuggestionLockedStars, DialogObject.getShortName(-chat.f22028id), LocaleController.formatNumber(j11, ','));
                } else {
                    formatString = LocaleController.formatString(R.string.SuggestionUnlockedStars, DialogObject.getShortName(-chat.f22028id));
                }
                SpannableStringBuilder replaceTags = AndroidUtilities.replaceTags(bi.dd.Q0(formatString, 1.0f, null));
                if (i12 > 0) {
                    str = LocaleController.getString(R.string.MessageStarsUnlock);
                }
                this.f45102e1.c(true, true, replaceTags, str, new View.OnClickListener(this) {
                    public final wn f46005b;

                    {
                        this.f46005b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                wn.c0(j11, this.f46005b);
                                return;
                            default:
                                wn.s0(j11, this.f46005b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f45102e1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().getClientUserId()) {
            TLRPC.UserFull userFull = this.f45255q8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.vo voVar = this.f45102e1;
                boolean z11 = !getUserConfig().isPremium();
                if (getMessagesController().premiumFeaturesBlocked()) {
                    i11 = R.string.MessageLockedPremiumLocked;
                } else {
                    i11 = R.string.MessageLockedPremium;
                }
                voVar.c(z11, false, AndroidUtilities.replaceTags(LocaleController.formatString(i11, DialogObject.getShortName(this.f45168j6))), LocaleController.getString(R.string.MessagePremiumUnlock), new bh.f(9));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.vo voVar2 = this.f45102e1;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                voVar2.c(z10, false, AndroidUtilities.replaceTags(bi.dd.Q0(LocaleController.formatString(R.string.MessageLockedStars, DialogObject.getShortName(this.f45168j6), LocaleController.formatNumber(this.f45255q8.send_paid_messages_stars, ',')), 1.0f, null)), LocaleController.getString(R.string.MessageStarsUnlock), new View.OnClickListener(this) {
                    public final wn f46005b;

                    {
                        this.f46005b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                wn.c0(j10, this.f46005b);
                                return;
                            default:
                                wn.s0(j10, this.f46005b);
                                return;
                        }
                    }
                });
            } else {
                this.f45102e1.c(false, false, null, null, null);
            }
        } else {
            this.f45102e1.c(false, false, null, null, null);
        }
    }

    public final void F6(MessageObject messageObject) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f45309ua);
        String string = LocaleController.getString(R.string.AppName);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        if (messageObject.type == 3) {
            e2Var.T = LocaleController.getString(R.string.NoPlayerInstalled);
        } else {
            e2Var.T = LocaleController.formatString("NoHandleAppInstalled", R.string.NoHandleAppInstalled, messageObject.getDocument().mime_type);
        }
        showDialog(e2Var);
    }

    public final void F7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        MessageObject messageObject;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.L6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.K6;
                if (i11 >= size) {
                    break;
                }
                MessageObject messageObject2 = (MessageObject) sparseArray.valueAt(i11);
                if (messageObject2.replyMessageObject != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(messageObject2.messageOwner.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = messageObject2.replyMessageObject.messageOwner.fwd_from) != null && MessageObject.getPeerId(messageFwdHeader.saved_from_peer) == this.f45168j6 && (i10 = messageObject2.replyMessageObject.messageOwner.fwd_from.channel_post) != 0 && (messageObject = (MessageObject) this.E6[0].get(i10)) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
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
                        long j10 = this.e.f22028id;
                        int id2 = messageObject.getId();
                        TLRPC.MessageReplies messageReplies2 = messageObject.messageOwner.replies;
                        messagesStorage.updateRepliesCount(j10, id2, messageReplies2.recent_repliers, messageReplies2.max_id, 1);
                        if (messageObject.hasValidGroupId()) {
                            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.N6.f(messageObject.getGroupId());
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
                            hm hmVar = this.A0;
                            if (!hmVar.N) {
                                hmVar.q(indexOf2 + hmVar.J, groupedMessages2.messages.size());
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

    public final r0.k1 F8(r0.k1 k1Var) {
        di.a3 a3Var;
        r0.a1 w0Var;
        if (k1Var != null && (a3Var = this.V1) != null) {
            if ((a3Var.isShowing() && !this.V1.isDismissed()) || this.V1.f33047x0) {
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

    public final void Fa() {
        org.telegram.ui.Cells.s1 s1Var;
        this.Xc.a(false, true);
        sh.c cVar = this.f45100dd;
        if (cVar != null && (s1Var = cVar.f48657n) != null && s1Var.getDelegate() != null) {
            cVar.f48657n.getDelegate().n1(cVar.f48657n, false);
        }
        jk jkVar = this.Y;
        if (jkVar != null) {
            jkVar.R0(true, true, false);
            this.Y.Y4 = null;
        }
    }

    public final void Fb() {
        AndroidUtilities.shakeViewSpring(this.f45339x0, 5.0f);
        BotWebViewVibrationEffect.APP_ERROR.vibrate();
        jk jkVar = this.Y;
        for (int i10 = 0; i10 < jkVar.getChildCount(); i10++) {
            AndroidUtilities.shakeViewSpring(jkVar.getChildAt(i10), 5.0f);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            AndroidUtilities.shakeViewSpring(actionBar.getChildAt(i11), 5.0f);
        }
    }

    public final void Fc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Fc(boolean):void");
    }

    public final void G6(boolean z10, boolean z11) {
        long j10;
        TLRPC.DraftMessage draft;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        mn mnVar;
        TLRPC.DraftMessage draftMessage;
        MessageObject messageObject;
        TLRPC.TL_forumTopic findTopic;
        TLRPC.Message message2;
        MessageObject messageObject2;
        mn mnVar2;
        String str;
        int findQuoteStart;
        mn mnVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        TLRPC.DraftMessage draftMessage2;
        long j12;
        org.telegram.ui.Components.z11 z11Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.c6 c6Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        Long l10;
        if (this.Y != null) {
            int i10 = this.f45091d4;
            char c10 = '\b';
            if (i10 == 0 || i10 == 8 || (i10 == 3 && getUserConfig().getClientUserId() == V8())) {
                long j14 = 0;
                if (this.f45091d4 == 8) {
                    if (ChatObject.isMonoForum(this.e)) {
                        if (this.f45241p4 == 0 && ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.z11 z11Var2 = null;
                if (G9()) {
                    Pair<Long, TLRPC.DraftMessage> oneThreadDraft = getMediaDataController().getOneThreadDraft(this.f45168j6);
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
                    long j15 = this.f45168j6;
                    if (this.f45091d4 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.f45241p4;
                    }
                    draft = mediaDataController.getDraft(j15, j10);
                    l4 = null;
                }
                TLRPC.DraftMessage draftMessage3 = draft;
                jk jkVar = this.Y;
                if (draftMessage3 != null) {
                    richMessage = draftMessage3.rich_message;
                } else {
                    richMessage = null;
                }
                jkVar.setRichDraftPreview(richMessage);
                MediaDataController.DraftVoice draftVoice = MediaDataController.getInstance(this.currentAccount).getDraftVoice(this.f45168j6, b());
                if (draftMessage3 != null && (inputReplyTo = draftMessage3.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    MediaDataController mediaDataController2 = getMediaDataController();
                    long j16 = this.f45168j6;
                    if (l4 != null) {
                        j13 = l4.longValue();
                    } else {
                        j13 = this.f45241p4;
                    }
                    message = mediaDataController2.getDraftMessage(j16, j13);
                } else {
                    message = null;
                }
                if ((!z11 || draftMessage3 == null) && this.Y.getFieldText() != null && (this.f45091d4 != 0 || getUserConfig().getClientUserId() != a() || draftMessage3 == null || this.Ac >= draftMessage3.date)) {
                    if (z10 && draftMessage3 == null) {
                        this.Y.setFieldText("");
                        this.Y.setEffectId(0L);
                        r9(true);
                    }
                } else if (draftVoice != null) {
                    this.Y.setVoiceDraft(draftVoice);
                } else if (draftMessage3 != null) {
                    this.Ac = draftMessage3.date;
                    jk jkVar2 = this.Y;
                    jkVar2.X2 = null;
                    jkVar2.Y2 = !draftMessage3.no_webpage;
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
                                z11Var = null;
                                org.telegram.ui.Components.b71 b71Var = new org.telegram.ui.Components.b71(a1.g.o(j12, ""), 3, null);
                                int i12 = messageEntity.offset;
                                valueOf.setSpan(b71Var, i12, messageEntity.length + i12, 33);
                            } else {
                                if ((messageEntity instanceof TLRPC.TL_messageEntityCode) || (messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    draftMessage2 = draftMessage3;
                                    ?? obj = new Object();
                                    obj.f35208a |= 4;
                                    org.telegram.ui.Components.a21 a21Var = new org.telegram.ui.Components.a21(obj, 0);
                                    int i13 = messageEntity.offset;
                                    MediaDataController.addStyleToText(a21Var, i13, messageEntity.length + i13, valueOf, true);
                                } else {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj2 = new Object();
                                        obj2.f35208a |= 1;
                                        org.telegram.ui.Components.a21 a21Var2 = new org.telegram.ui.Components.a21(obj2, 0);
                                        int i14 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var2, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj3 = new Object();
                                        obj3.f35208a |= 2;
                                        org.telegram.ui.Components.a21 a21Var3 = new org.telegram.ui.Components.a21(obj3, 0);
                                        int i15 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var3, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj4 = new Object();
                                        obj4.f35208a |= 8;
                                        org.telegram.ui.Components.a21 a21Var4 = new org.telegram.ui.Components.a21(obj4, 0);
                                        int i16 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var4, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj5 = new Object();
                                        obj5.f35208a |= 16;
                                        org.telegram.ui.Components.a21 a21Var5 = new org.telegram.ui.Components.a21(obj5, 0);
                                        int i17 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var5, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.a71 a71Var = new org.telegram.ui.Components.a71(messageEntity.url, z11Var2);
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(a71Var, i18, messageEntity.length + i18, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj6 = new Object();
                                        obj6.f35208a |= 256;
                                        org.telegram.ui.Components.a21 a21Var6 = new org.telegram.ui.Components.a21(obj6, 0);
                                        int i19 = messageEntity.offset;
                                        MediaDataController.addStyleToText(a21Var6, i19, messageEntity.length + i19, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i20 = messageEntity.offset;
                                        org.telegram.ui.Components.tj0.c(valueOf, i20, messageEntity.length + i20, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Y.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e) {
                                            FileLog.e((Throwable) e, false);
                                            fontMetricsInt = z11Var2;
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
                                        z11Var = z11Var2;
                                    }
                                    z11Var = z11Var2;
                                    draftMessage2 = draftMessage3;
                                }
                                z11Var = null;
                            }
                            i11++;
                            z11Var2 = z11Var;
                            c10 = c11;
                            j14 = j17;
                            draftMessage3 = draftMessage2;
                        }
                        j11 = j14;
                        mnVar = z11Var2;
                        draftMessage = draftMessage3;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        mnVar = null;
                        draftMessage = draftMessage3;
                        str2 = draftMessage.message;
                    }
                    this.Y.b1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Y.setSelection(draftMessage.message.indexOf(10) + 1);
                        AndroidUtilities.runOnUIThread(new le(this, 4), 700L);
                    }
                    this.Y.setEffectId(draftMessage.effect);
                    if (draftMessage != null && (suggestedPost = draftMessage.suggested_post) != null) {
                        MessageSuggestionParams of2 = MessageSuggestionParams.of(suggestedPost);
                        this.f45330w5 = of2;
                        Tb(of2);
                    }
                    messageObject = this.D5;
                    if (messageObject != null || this.f45166j4 == messageObject) {
                        if (message == null && ((messageObject2 = this.f45166j4) == null || messageObject2.getId() != message.f22049id)) {
                            MessageObject messageObject3 = new MessageObject(this.currentAccount, message, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.D5 = messageObject3;
                            TLRPC.InputReplyTo inputReplyTo2 = draftMessage.reply_to;
                            if (inputReplyTo2 != null) {
                                int i22 = inputReplyTo2.flags;
                                if ((i22 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i23 = -1;
                                    if (arrayList != null) {
                                        int i24 = inputReplyTo2.quote_offset;
                                        if (arrayList.isEmpty()) {
                                            mnVar3 = mnVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            ?? obj7 = new Object();
                                            obj7.f41477a = messageObject3;
                                            obj7.f41478b = -1;
                                            obj7.f41479c = -1;
                                            obj7.d = -1;
                                            obj7.f41486m = true;
                                            obj7.e(i24, arrayList);
                                            mnVar3 = obj7;
                                        }
                                        this.B5 = mnVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i22 & 16) != 0) {
                                            i23 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message3 = messageObject3.messageOwner;
                                        if (message3 == null || (str = message3.message) == null || str3 == null || (findQuoteStart = MessageObject.findQuoteStart(str, str3, i23)) < 0) {
                                            mnVar2 = mnVar;
                                        } else {
                                            messageObject3.getDialogId();
                                            mnVar2 = new mn(messageObject3, findQuoteStart, str3.length() + findQuoteStart);
                                        }
                                        this.B5 = mnVar2;
                                    }
                                }
                            }
                            e7(false);
                            mn mnVar4 = this.B5;
                            if (mnVar4 != null) {
                                Sb(this.D5, mnVar4);
                            } else {
                                Rb(this.D5);
                            }
                            yc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j11 && this.e != null && (findTopic = getMessagesController().getTopicsController().findTopic(this.e.f22028id, l4.longValue())) != null && (message2 = findTopic.topicStartMessage) != null) {
                            MessageObject messageObject4 = new MessageObject(this.currentAccount, message2, (AbstractMap<Long, TLRPC.User>) getMessagesController().getUsers(), false, false);
                            this.D5 = messageObject4;
                            messageObject4.replyToForumTopic = findTopic;
                            Rb(messageObject4);
                            yc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j11 = 0;
                mnVar = null;
                draftMessage = draftMessage3;
                if (draftMessage != null) {
                    MessageSuggestionParams of22 = MessageSuggestionParams.of(suggestedPost);
                    this.f45330w5 = of22;
                    Tb(of22);
                }
                messageObject = this.D5;
                if (messageObject != null) {
                }
                if (message == null) {
                }
                if (l4 == null) {
                }
            }
        }
    }

    public final void G7(boolean z10) {
        boolean z11;
        this.pb = 0;
        this.f45257qb = Integer.MIN_VALUE;
        if (this.f45222nb) {
            this.f45222nb = false;
            this.f45235ob = false;
            uj ujVar = this.f45364z0;
            if (ujVar != null) {
                ujVar.G = true;
            }
        }
        this.K6.clear();
        this.H6.clear();
        this.I6.clear();
        this.f45345x6.clear();
        this.N6.b();
        this.f45303u4 = false;
        hm hmVar = this.A0;
        if (hmVar != null) {
            if (hmVar.f39934w < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            fc(z11);
        }
        rj rjVar = this.f45339x0;
        if (rjVar != null) {
            rjVar.setEmptyView(null);
        }
        for (int i10 = 0; i10 < 2; i10++) {
            this.E6[i10].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.P6;
            int[] iArr2 = this.O6;
            if (encryptedChat == null) {
                iArr2[i10] = Integer.MAX_VALUE;
                iArr[i10] = Integer.MIN_VALUE;
            } else {
                iArr2[i10] = Integer.MIN_VALUE;
                iArr[i10] = Integer.MAX_VALUE;
            }
            this.Q6[i10] = Integer.MIN_VALUE;
            this.R6[i10] = 0;
            this.S6[i10] = false;
            this.T6[i10] = false;
            this.U6[i10] = true;
        }
        if (z10) {
            this.W7 = true;
            this.X6 = true;
            this.W6 = true;
            this.Y7 = false;
        }
        this.f45167j5 = false;
        this.K7 = 0;
        this.J7 = false;
        this.f45051a7 = 0;
        this.Z7 = null;
        this.T7 = 0;
        this.U7 = false;
        this.Q7 = false;
        hm hmVar2 = this.A0;
        if (hmVar2 != null && !hmVar2.N) {
            hmVar2.O(false);
        }
    }

    public final TLRPC.ChatFull G8() {
        return this.f45245p8;
    }

    public final boolean G9() {
        if (!ChatObject.isForum(this.e) || this.f45290t4) {
            if (ChatObject.isMonoForum(this.e) && b() == 0 && !this.f45118f4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final void Ga(org.telegram.ui.Cells.s1 s1Var) {
        sh.c cVar;
        if (this.Xc.f19326f && (cVar = this.f45100dd) != null && cVar.f48657n == s1Var) {
            Editable text = cVar.f48653a.getText();
            int length = text.length();
            if (length != 0 && length <= getMessagesController().config.pollAnswerLengthMax.get()) {
                SendMessagesHelper.getInstance(this.currentAccount).addPollOption(s1Var.getMessageObject(), text, this.f45100dd.getAttachedMedia());
                Fa();
                return;
            }
            AndroidUtilities.shakeView(this.f45100dd.f48653a);
        }
    }

    public final void Gb(MessageObject messageObject, int i10) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f45309ua);
        String string = LocaleController.getString(R.string.ShareYouPhoneNumberTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        TLRPC.User user = this.f45113f;
        if (user != null) {
            if (user.bot) {
                e2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfoBot);
            } else {
                int i11 = R.string.AreYouSureShareMyContactInfoUser;
                String g7 = org.telegram.messenger.wh.g(new StringBuilder("+"), getUserConfig().getCurrentUser().phone, kf.b.c());
                TLRPC.User user2 = this.f45113f;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("AreYouSureShareMyContactInfoUser", i11, g7, ContactsController.formatName(user2.first_name, user2.last_name)));
            }
        } else {
            e2Var.T = LocaleController.getString(R.string.AreYouSureShareMyContactInfo);
        }
        alertDialog$Builder.k(LocaleController.getString(R.string.ShareContact), new i2.z(this, i10, messageObject, 7));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(e2Var);
    }

    public final void Gc() {
        MessageObject messageObject;
        if (this.f45113f != null) {
            if (this.h != null) {
                ArrayList<Long> arrayList = new ArrayList<>();
                rj rjVar = this.f45339x0;
                if (rjVar != null) {
                    int childCount = rjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f45339x0.getChildAt(i10);
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
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, this.F8, this.G8, this.f45113f, this.h, arrayList, 0);
                return;
            }
            SecretMediaViewer f7 = SecretMediaViewer.f();
            MessageObject messageObject2 = f7.f36193h0;
            if (messageObject2 != null && !messageObject2.isOut()) {
                MediaController.getInstance().setLastVisibleMessageIds(this.currentAccount, f7.K, f7.L, this.f45113f, null, null, messageObject2.getId());
            }
        }
    }

    @Override
    public final boolean H() {
        return this.f45359y8;
    }

    public final int H6(int i10) {
        MessageObject messageObject;
        int additionalPaddingHeight;
        int height = this.f45339x0.getHeight();
        int i11 = 0;
        long j10 = 0;
        while (true) {
            View U0 = this.f45339x0.U0(i10);
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

    public final void H7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.P6;
        if (z10) {
            if (BuildVars.LOGS_ENABLED) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.X6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                org.telegram.messenger.t.o(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.T7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.U6[0] = false;
            this.V6 = false;
            hm hmVar = this.A0;
            if (hmVar != null && hmVar.F < 0) {
                hmVar.o(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f45370z6 = i12;
            this.B6 = dialog2.unread_mentions_count;
            if (this.A6 != i12) {
                lh.h hVar = this.f45313v1;
                if (hVar != null) {
                    hVar.c(1, i12, this.f45093d6);
                }
                this.A6 = this.f45370z6;
                Mc();
            }
            int i13 = this.B6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.B6 = i14;
                if (i14 <= 0) {
                    this.B6 = 0;
                    this.C6 = true;
                    ac(false);
                } else {
                    lh.h hVar2 = this.f45313v1;
                    if (hVar2 != null) {
                        hVar2.c(2, i14, true);
                    }
                    ac(true);
                }
            }
            j7(false);
            return;
        }
        this.K6.clear();
        this.f45345x6.clear();
        this.H6.clear();
        this.I6.clear();
        this.N6.b();
        this.f45303u4 = false;
        for (int i15 = 1; i15 >= 0; i15--) {
            this.E6[i15].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.O6;
            if (encryptedChat == null) {
                iArr2[i15] = Integer.MAX_VALUE;
                iArr[i15] = Integer.MIN_VALUE;
            } else {
                iArr2[i15] = Integer.MIN_VALUE;
                iArr[i15] = Integer.MAX_VALUE;
            }
            this.Q6[i15] = Integer.MIN_VALUE;
            this.R6[i15] = 0;
            this.f45203m6[i15].clear();
            this.f45217n6[i15].clear();
            this.f45230o6[i15].clear();
        }
        p9();
        Pc(0, true);
        if (this.B8 != null) {
            this.B8 = null;
            jk jkVar = this.Y;
            if (jkVar != null) {
                jkVar.V0(null, true, false);
            }
        }
        if (this.P != null) {
            fc(false);
            P7(false);
            this.f45339x0.setEmptyView(this.f45074c1);
        }
        hm hmVar2 = this.A0;
        if (hmVar2 != null) {
            hmVar2.O(false);
        }
        if (this.h == null && (user = this.f45113f) != null && user.bot && this.f45307u8 == null) {
            this.f45307u8 = "";
            yc(false);
        }
    }

    public final TLRPC.UserFull H8() {
        return this.f45255q8;
    }

    public final boolean H9() {
        return UserObject.isBotForum(this.f45113f);
    }

    public final void Ha(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f7, float f10) {
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
        nb(zVar, messageObject2, null, null, f7, f10, d, false, false, false, false);
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
                MessageObject messageObject3 = (MessageObject) this.E6[0].get(messageObject2.getId());
                if (messageObject3 != null && (message = messageObject3.messageOwner) != null) {
                    message.reactions = messageObject2.messageOwner.reactions;
                }
            } else if (!z12 && this.C3 != null) {
                Bc(false);
            }
        }
        if (this.A0.N && !messageObject2.hasReaction(this.C3)) {
            MessageObject.GroupedMessages k92 = k9(messageObject2);
            if (k92 != null) {
                for (int i10 = 0; i10 < k92.messages.size(); i10++) {
                    getMediaDataController().removeMessageFromResults(k92.messages.get(i10).getId());
                }
            } else {
                getMediaDataController().removeMessageFromResults(messageObject2.getId());
            }
            ig.n1 n1Var = this.Y3;
            if (n1Var != null) {
                n1Var.l();
            }
            Bc(true);
        }
    }

    public final boolean Hb() {
        if (G9() && this.D5 == null && this.F5 == null) {
            if (this.f45091d4 != 8 && G9() && this.e != null) {
                TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f22028id, 1L);
                if (this.f45091d4 != 8) {
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

    public final void Hc(MessageObject messageObject, boolean z10) {
        if (this.A0 == null) {
            return;
        }
        getNotificationCenter().doOnIdle(new bi.u7(this, messageObject, z10, 14));
    }

    public final float I6(boolean z10) {
        float f7;
        float f10;
        float f11;
        jk jkVar = this.Y;
        float f12 = 0.0f;
        if (jkVar != null) {
            if (z10) {
                f7 = jkVar.f25936o5;
            } else {
                f7 = jkVar.f25930n5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, AndroidUtilities.dp(44.0f));
        float dp = AndroidUtilities.dp(44.0f);
        oe.b bVar = this.Xc;
        k6.m mVar = this.f45086cd;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(mVar.f16422a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(mVar.f16422a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f19326f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) mVar.f16423b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.e;
            f11 = f13;
        }
        if (!this.f45124fb && !isInPreviewMode()) {
            return AndroidUtilities.lerp(Math.max(AndroidUtilities.lerp(dp, max, f11) * f10, AndroidUtilities.dp(44.0f)), -AndroidUtilities.dp(7.0f), f12);
        }
        return AndroidUtilities.lerp(dp, max, f11) * f10;
    }

    public final void I7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.f45203m6[i10].clear();
            this.f45217n6[i10].clear();
            this.f45230o6[i10].clear();
        }
        p9();
        Pc(0, true);
        nd(z10);
        cd();
    }

    public final ArrayList I8() {
        hm hmVar = this.A0;
        if (hmVar != null) {
            return hmVar.P;
        }
        return null;
    }

    public boolean I9() {
        if (this.f45163j1.getKeyboardHeight() > AndroidUtilities.dp(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ia(java.util.ArrayList r45, long r46, boolean r48, boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Ia(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final void Ib() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.wc.b0(this).t(LocaleController.getString(R.string.UnsupportedAttachment), this.f45309ua).j();
    }

    public final void Ic(MessageObject messageObject, boolean z10) {
        MessageObject messageObject2;
        if (this.A0 != null && this.fragmentView != null) {
            MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.N6.f(messageObject.getGroupId());
            if (groupedMessages != null) {
                tj tjVar = this.f45352y0;
                if (tjVar != null) {
                    tjVar.V(groupedMessages);
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
            MessageObject messageObject3 = (MessageObject) this.E6[0].get(messageObject.getId());
            if (z10) {
                messageObject.forceUpdate = true;
                messageObject.reactionsChanged = true;
            }
            if (this.A0.N) {
                a0.h hVar = this.f45362yb;
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
                    hm hmVar = this.A0;
                    hmVar.m(hmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.K6.indexOf(messageObject3);
            if (indexOf2 >= 0) {
                hm hmVar2 = this.A0;
                hmVar2.m(hmVar2.J + indexOf2);
            }
        }
    }

    @Override
    public final long J() {
        return this.f45065b7;
    }

    public final boolean J6(MessageObject messageObject) {
        if (!K9()) {
            TLRPC.Message message = messageObject.messageOwner;
            if ((message == null || !message.noforwards) && !messageObject.isRoundOnce() && !messageObject.isVoiceOnce()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void J7(boolean z10) {
        this.f45146h9 = z10;
        org.telegram.ui.ActionBar.o1 o1Var = this.f45134g9;
        if (o1Var != null) {
            o1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.Bc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Bc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Bc = ofFloat;
            ofFloat.addUpdateListener(new ne(this, 0));
            this.Bc.setDuration(150L);
            this.Bc.start();
        }
    }

    public final oi.q J8() {
        wn wnVar = this.f45296ta;
        if (wnVar != null) {
            return wnVar.J8();
        }
        return this.glassEngine;
    }

    public final boolean J9() {
        if (ChatObject.isChannelAndNotMegaGroup(this.e) && !R9() && this.f45091d4 == 0) {
            return true;
        }
        return false;
    }

    public final void Ja(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.s1 s1Var, boolean z10) {
        org.telegram.ui.Components.z11 z11Var;
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
                    qf.d.p(getParentActivity(), Uri.parse(str), true, true, X9(s1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f45320v8 == 0) {
                        z12 = true;
                    }
                    qf.d.p(parentActivity, parse, z12, true, X9(s1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f45320v8 == 0) {
                        z12 = true;
                    }
                    qf.d.p(parentActivity2, parse2, z12, true, X9(s1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.g5.q0(this, str, true, true, false, false, X9(s1Var, characterStyle), null, this.f45309ua);
                    return;
                }
                return;
            } else {
                if ((characterStyle instanceof org.telegram.ui.Components.a71) && (z11Var = ((org.telegram.ui.Components.a71) characterStyle).f26450a) != null && (z11Var.f35208a & 1024) != 0) {
                    z12 = true;
                }
                org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, X9(s1Var, characterStyle), null, this.f45309ua);
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
        if (characterStyle instanceof org.telegram.ui.Components.a71) {
            z12 = true;
        }
        org.telegram.ui.Components.g5.q0(this, str, true, true, true, z12, X9(s1Var, characterStyle), null, this.f45309ua);
    }

    public final void Jb(org.telegram.ui.Cells.s1 s1Var) {
        if (getParentActivity() != null && s1Var != null && s1Var.f25226ob != null && s1Var.getPrimaryMessageObject() != null && s1Var.getPrimaryMessageObject().messageOwner != null && s1Var.getPrimaryMessageObject().messageOwner.via_business_bot_id != 0 && !getMessagesController().getMainSettings().getBoolean("bizbothint", false)) {
            getMessagesController().getMainSettings().edit().putBoolean("bizbothint", true).apply();
            if (!this.f45336wb) {
                this.f45336wb = true;
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
                this.f45163j1.addView(this.L1, org.telegram.ui.Components.kb1.h(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.f45163j1.post(new ed(5, this, s1Var));
            }
        }
    }

    public final void Jc() {
        org.telegram.ui.ActionBar.o1 o1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        rj rjVar = this.f45339x0;
        bk bkVar = this.U1;
        if ((bkVar != null && bkVar.I) || ((o1Var = this.f45134g9) != null && o1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        rjVar.setImportantForAccessibility(i10);
    }

    @Override
    public final boolean K(ey eyVar) {
        return false;
    }

    public final boolean K6() {
        if (!L9() && !getMessagesController().isMonoForum(a())) {
            if ((!getMessagesController().isForum(a()) || this.f45290t4) && getMessagesController().getSendPaidMessagesStars(a()) <= 0 && this.h == null) {
                nk nkVar = this.f45046a1;
                if (nkVar == null || nkVar.getVisibility() != 0) {
                    if (!R9() || this.f45290t4) {
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

    public final long K7(MessageObject messageObject) {
        if (this.f45091d4 == 3) {
            return 0L;
        }
        if (ChatObject.isForum(this.e) && !this.f45290t4 && messageObject != null) {
            TLRPC.TL_forumTopic tL_forumTopic = messageObject.replyToForumTopic;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f22080id;
            }
            return MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, ChatObject.isForum(this.e));
        }
        return this.f45241p4;
    }

    public final MessageObject.GroupedMessages K8(long j10) {
        return (MessageObject.GroupedMessages) this.N6.f(j10);
    }

    public final boolean K9() {
        if (this.e != null) {
            return getMessagesController().isChatNoForwards(this.e);
        }
        return getMessagesController().isUserNoForwards(this.f45255q8);
    }

    public final void Ka(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.MessageObject r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.MessageObject r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Ka(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.MessageObject, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.MessageObject):void");
    }

    public final void Kb(boolean z10, boolean z11) {
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
        if (this.G0 != null && J9()) {
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
                    pk pkVar = this.B0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(pkVar, property, 0.1f);
                    pk pkVar2 = this.B0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(pkVar2, property2, 0.1f);
                    pk pkVar3 = this.B0;
                    Property property3 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(pkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.G0, property, 1.0f), ObjectAnimator.ofFloat(this.G0, property2, 1.0f), ObjectAnimator.ofFloat(this.G0, property3, 1.0f));
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
            pk pkVar4 = this.B0;
            if (!z10 && !this.C0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            pkVar4.setVisibility(i11);
            org.telegram.ui.Components.aa0 aa0Var = this.D0;
            if (z10 || !this.C0) {
                i13 = 4;
            }
            aa0Var.setVisibility(i13);
            pk pkVar5 = this.B0;
            if (!z10 && !this.C0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            pkVar5.setScaleX(f11);
            org.telegram.ui.Components.aa0 aa0Var2 = this.D0;
            if (!z10 && this.C0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            aa0Var2.setScaleX(f12);
            pk pkVar6 = this.B0;
            if (!z10 && !this.C0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            pkVar6.setScaleY(f13);
            org.telegram.ui.Components.aa0 aa0Var3 = this.D0;
            if (!z10 && this.C0) {
                f16 = 1.0f;
            }
            aa0Var3.setScaleY(f16);
            pk pkVar7 = this.B0;
            if (!z10 && !this.C0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            pkVar7.setAlpha(f14);
            org.telegram.ui.Components.aa0 aa0Var4 = this.D0;
            if (!z10 && this.C0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            aa0Var4.setAlpha(f15);
        }
    }

    public final void Kc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.A0.R((MessageObject) arrayList.get(i10), false, z10);
        }
    }

    public final boolean L6() {
        if (this.h == null) {
            nk nkVar = this.f45046a1;
            if (nkVar == null || nkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final float L8() {
        wn wnVar = this.f45296ta;
        if (wnVar == null) {
            wnVar = this;
        }
        gk gkVar = wnVar.B1;
        if (gkVar == null) {
            return 0.0f;
        }
        return gkVar.f28711b;
    }

    public final boolean L9() {
        int i10 = this.f45091d4;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void La(java.util.ArrayList r44, boolean r45) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.La(java.util.ArrayList, boolean):void");
    }

    public final void Lb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.BusinessLinkDiscardChangesTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessLinkDiscardChangesMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Discard), new ef(0, runnable));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        showDialog(e2Var);
        TextView textView = (TextView) e2Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23599q7, getResourceProvider());
        }
    }

    public final void Lc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Lc():void");
    }

    public final boolean M6(MessageObject messageObject) {
        if (this.f45091d4 == 8) {
            return true;
        }
        if (messageObject != null && ChatObject.isForum(this.e)) {
            TLRPC.TL_forumTopic findTopic = getMessagesController().getTopicsController().findTopic(this.e.f22028id, MessageObject.getTopicId(this.currentAccount, messageObject.messageOwner, true));
            if (this.f45091d4 == 8 || (findTopic != null && (!findTopic.closed || ChatObject.canManageTopic(this.currentAccount, this.e, findTopic)))) {
                return true;
            }
        }
        return false;
    }

    public final void M7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.M7():void");
    }

    public final int M8(MessageObject messageObject, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.B9 == null) {
            this.B9 = new org.telegram.ui.Cells.s1(getParentActivity(), this.currentAccount, true, this.Sa, this.f45309ua);
        }
        org.telegram.ui.Cells.s1 s1Var = this.B9;
        if (this.e == null && !UserObject.isUserSelf(this.f45113f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        s1Var.N7 = z11;
        org.telegram.ui.Cells.s1 s1Var2 = this.B9;
        int i10 = this.f45091d4;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        s1Var2.P7 = z12;
        if (i10 == 3 && this.f45124fb) {
            z13 = true;
        } else {
            z13 = false;
        }
        s1Var2.Q7 = z13;
        TLRPC.User user = this.f45113f;
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
        this.B9.E8 = E9();
        this.B9.F8 = O9();
        this.B9.G8 = N9();
        return this.B9.g1(messageObject, (MessageObject.GroupedMessages) this.N6.f(messageObject.getGroupId()), z10);
    }

    public final boolean M9() {
        return !TextUtils.isEmpty(this.f45130g4);
    }

    public final void Ma(int i10) {
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
                    this.f45193l8 = generatePicturePath.getAbsolutePath();
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
                cq0 cq0Var = new cq0(0, z10, true, this);
                if (this.f45091d4 == 9) {
                    cq0Var.G = 1;
                    cq0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        cq0Var.G = 10;
                        cq0Var.H = true;
                    } else {
                        MessageObject messageObject = this.F5;
                        if (messageObject != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (messageObject == null) {
                            z11 = true;
                        }
                        cq0Var.G = i11;
                        cq0Var.H = z11;
                    }
                }
                cq0Var.V = new nl(this);
                presentFragment(cq0Var);
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
                        this.f45193l8 = generateVideoPath.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Mb(int i10) {
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
            org.telegram.ui.Components.qc b10 = b02.b(new org.telegram.ui.Components.rg0(b02.X(), b02.f34498c, mutate, replaceTags), 1780);
            b10.f31863l = true;
            org.telegram.ui.Components.ub ubVar = b10.e;
            ubVar.pillStyle = true;
            ubVar.b();
            b10.f31855a = 1313167187;
            b10.j();
        }
    }

    public final void Mc() {
        boolean z10;
        boolean z11;
        if (this.f45313v1 == null) {
            return;
        }
        if (this.f45334w9 && !o9() && !this.Y.s0() && !this.f45124fb && (!this.E3 || getMediaDataController().searchResultMessages.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f45120f6 != 0 && SystemClock.elapsedRealtime() >= this.f45120f6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f45326w1 = false;
        } else {
            this.R7 = 0;
            this.f45370z6 = 0;
            z11 = true;
        }
        this.f45313v1.e(1, z10, z11);
    }

    public final void N6(final boolean z10, final boolean z11, final boolean z12) {
        TLRPC.TL_channels_editChannelNews tL_channels_editChannelNews;
        if (!this.f45185kb && J9()) {
            this.f45185kb = true;
            if (z11) {
                this.f45196lb = true;
            }
            this.B0.setEnabled(false);
            Kb(true, true);
            final long j10 = this.e.f22028id;
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
                    final wn wnVar = wn.this;
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
                            if (chat2.f22028id == j11) {
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
                        wnVar.getMessagesController().lambda$processUpdates$379(updates, false);
                    }
                    final boolean z18 = z12;
                    final TLObject tLObject2 = tL_channels_editChannelNews3;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            wn.w0(wn.this, z13, tL_error, tLObject, j11, z17, z15, z18, tLObject2);
                        }
                    });
                }
            });
        }
    }

    public final void N7() {
        if (getParentActivity() != null && getParentActivity() != null && this.V1 == null) {
            di.a3 a3Var = new di.a3(this, getParentActivity(), this, this.f45309ua, 2);
            this.V1 = a3Var;
            a3Var.Z = a();
            di.a3 a3Var2 = this.V1;
            a3Var2.f32999i0 = true;
            a3Var2.f32982c2 = new ll(this);
        }
    }

    public final boolean N9() {
        org.telegram.ui.Components.f41 f41Var = this.f45089d2;
        if (f41Var != null && f41Var.Q && f41Var.f28011a.f19326f) {
            return true;
        }
        return false;
    }

    public final void Na(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Na(int):void");
    }

    public final void Nb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            if (ChatObject.isMegagroup(chat)) {
                if (ChatObject.hasAdminRights(this.e)) {
                    g60 g60Var = new g60(a());
                    g60Var.f37992l0 = this;
                    presentFragment(g60Var);
                    return;
                }
                return;
            } else if (ChatObject.canChangeChatInfo(this.e)) {
                bd bdVar = new bd(a());
                bdVar.f37992l0 = this;
                presentFragment(bdVar);
                return;
            } else {
                return;
            }
        }
        this.f45269ra = new org.telegram.ui.Components.zp(this, this.f45309ua);
        this.f45339x0.setOnInterceptTouchListener(new cg(0));
        yb(this.f45163j1, false);
        showDialog(this.f45269ra, new pe(this, 1));
    }

    public final void Nc() {
        lh.h hVar = this.f45313v1;
        mj mjVar = this.v;
        if (hVar != null) {
            this.f45313v1.setTranslationY((((-mjVar.d()) - this.S.getInputBubbleHeight()) - j9(org.telegram.ui.Components.b41.f26732c)) - AndroidUtilities.dp(13.0f));
        }
        if (this.f45238p1 != null) {
            this.f45238p1.setTranslationY((-mjVar.d()) - AndroidUtilities.dp(16.0f));
        }
    }

    public final SpannableStringBuilder O6(boolean z10) {
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
        } else if (getMessagesController().isDialogMuted(this.f45168j6, 0L)) {
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

    public final void O7(MessageObject messageObject, MessageObject.GroupedMessages groupedMessages, boolean z10) {
        ig igVar;
        if (messageObject == null) {
            SparseArray[] sparseArrayArr = this.f45203m6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f45113f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f45245p8;
        long j10 = this.f45065b7;
        int b10 = (int) b();
        int i10 = this.f45091d4;
        ig igVar2 = new ig(this, 5);
        if (z10) {
            igVar = new ig(this, 6);
        } else {
            igVar = null;
        }
        ig igVar3 = igVar;
        org.telegram.ui.Components.g5.y(this, user, chat, encryptedChat, chatFull, j10, messageObject, this.f45203m6, groupedMessages, b10, i10, null, igVar2, igVar3, this.f45309ua);
    }

    public final SendMessageChatArguments O8() {
        SendMessageChatArguments.Builder builder = new SendMessageChatArguments.Builder();
        if (this.f45091d4 == 9) {
            builder.setWelcomeMessageChatId(this.Ja);
        }
        if (this.f45091d4 == 5) {
            builder.setQuickReplyShortcut(this.f45077c4, U8());
        }
        return builder.build();
    }

    public final boolean O9() {
        if (this.f45089d2 == null) {
            if (this.f45118f4 || !ChatObject.isMonoForum(this.e)) {
                if (!ChatObject.isForum(this.e) || !ChatObject.areTabsEnabled(this.e)) {
                    return false;
                }
                return true;
            }
            return true;
        }
        return true;
    }

    public final boolean Oa(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f45320v8 != 0 && !tL_inlineButtonTypeSwitchInline.same_peer && this.parentLayout != null) {
            String str = "@" + this.f45113f.username + " " + tL_inlineButtonTypeSwitchInline.query;
            if (this.f45320v8 == this.f45168j6) {
                this.f45320v8 = 0L;
                this.Y.setFieldText(str);
                return true;
            }
            getMediaDataController().saveDraft(this.f45320v8, 0, str, null, null, false, 0L);
            if (this.parentLayout.getFragmentStack().size() > 1) {
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
                if ((r2Var instanceof wn) && ((wn) r2Var).f45168j6 == this.f45320v8) {
                    finishFragment();
                    return true;
                }
                Bundle bundle = new Bundle();
                if (DialogObject.isEncryptedDialog(this.f45320v8)) {
                    bundle.putInt("enc_id", DialogObject.getEncryptedChatId(this.f45320v8));
                } else if (DialogObject.isUserDialog(this.f45320v8)) {
                    bundle.putLong("user_id", this.f45320v8);
                } else {
                    bundle.putLong("chat_id", -this.f45320v8);
                }
                B6();
                presentFragment(new wn(bundle), true);
            }
            return true;
        }
        return false;
    }

    public final void Ob(boolean z10, MessageObject messageObject, ArrayList arrayList, TLRPC.WebPage webPage, boolean z11, int i10, mn mnVar, boolean z12, long j10, boolean z13) {
        Pb(z10, messageObject, null, arrayList, webPage, z11, i10, mnVar, z12, j10, null, z13);
    }

    public final void Oc(boolean z10) {
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
        if ((!R9() || this.f45290t4) && this.X2 != null) {
            if (!this.f45107e6) {
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
            if (objArr == null && !this.f45070bc && !this.U2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.f45070bc && !this.U2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.f45070bc && !this.U2) {
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
                    this.Y2.addListener(new ul(this, z14, z15, z16));
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
                if (R9() && !this.f45290t4) {
                    boolean z18 = z17;
                    this.L2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.L2.c((this.T4.size() - 1) - Collections.binarySearch(this.T4, Integer.valueOf(this.X4), Comparator$CC.reverseOrder()), this.T4.size(), z11);
            }
        }
    }

    public final void P6(boolean z10) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.f45091d4 != 0 || this.f45241p4 != 0 || (chatFull = this.f45245p8) == null || chatFull.ttl_period == 0)) || ((user = this.f45113f) != null && (UserObject.isDeleted(user) || (this.h == null && ((userFull = this.f45255q8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.u0 u0Var = this.f45073c0;
            if (u0Var != null) {
                u0Var.e(8);
            }
            lj ljVar = this.f45198m1;
            if (ljVar != null) {
                ljVar.f31649a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.u0 u0Var2 = this.f45073c0;
            if (u0Var2 != null) {
                u0Var2.e(0);
            }
            lj ljVar2 = this.f45198m1;
            if (ljVar2 != null) {
                ljVar2.f31649a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.u0 u0Var3 = this.f45273s0;
        if (u0Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            u0Var3.e(i11);
        }
        lj ljVar3 = this.f45198m1;
        if (ljVar3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f45113f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            ljVar3.setCommunityItemVisible(z11);
            final lj ljVar4 = this.f45198m1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = ljVar4.E;
            ImageView imageView2 = ljVar4.f31681y;
            if (imageView2 != null && imageView != null) {
                ljVar4.f31664l0 = z12;
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
                                    po poVar = ljVar4;
                                    if (!z14) {
                                        poVar.f31681y.setVisibility(4);
                                        return;
                                    } else {
                                        poVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    po poVar2 = ljVar4;
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
                                    po poVar = ljVar4;
                                    if (!z14) {
                                        poVar.f31681y.setVisibility(4);
                                        return;
                                    } else {
                                        poVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    po poVar2 = ljVar4;
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
                this.f45198m1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f45255q8;
                if (userFull2 != null) {
                    this.f45198m1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f45245p8;
                    if (chatFull3 != null) {
                        this.f45198m1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f45260r0 != null && (chatFull2 = this.f45245p8) != null) {
            if (!chatFull2.can_delete_channel && ChatObject.isChannel(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || ChatObject.isPublic(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.u0 u0Var4 = this.f45260r0;
            if (z13) {
                i12 = 0;
            }
            u0Var4.e(i12);
        }
        p();
    }

    public final void P7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f45074c1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f45074c1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f45074c1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.f45163j1.addView(this.f45074c1, 3, org.telegram.ui.Components.kb1.i(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f45074c1.setTranslationX(e9() / 2.0f);
            int i10 = 1;
            if (this.A0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f45213n2 = textView;
                textView.setText(LocaleController.getString(R.string.NoFilteredMessages));
                this.f45213n2.setTextSize(1, 14.0f);
                this.f45213n2.setGravity(17);
                org.telegram.ui.ActionBar.f7.V(this.f45213n2, org.telegram.ui.ActionBar.y6.f23454ic, getResourceProvider());
                this.f45213n2.setBackground(new org.telegram.ui.ActionBar.l6(this.f45213n2, this.f45163j1, AndroidUtilities.dp(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f45213n2.setTypeface(AndroidUtilities.bold());
                this.f45213n2.setPadding(AndroidUtilities.dp(10.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(3.0f));
                this.f45074c1.addView(this.f45213n2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (L9()) {
                jg.d2 d2Var = new jg.d2(getParentActivity(), this.f45091d4, this.f45241p4, this.f45077c4, getResourceProvider());
                this.f45127g1 = d2Var;
                int dp = AndroidUtilities.dp(24.0f);
                jg.d2 d2Var2 = this.f45127g1;
                om omVar = this.f45163j1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.y6.f23293a;
                d2Var.setBackground(new org.telegram.ui.ActionBar.l6(d2Var2, omVar, dp, themedPaint));
                this.f45074c1.addView(this.f45127g1, org.telegram.ui.Components.kb1.i(-2, -2, 17));
                this.f45151i1.d(this.f45127g1, this.f45163j1, new m4.x0(29), false);
            } else if (this.f45091d4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f45062b4;
                org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.y6.f23454ic;
                org.telegram.ui.ActionBar.y6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.y6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(R.drawable.filled_chatlink_large);
                linearLayout.addView(imageView, org.telegram.ui.Components.kb1.x(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.f7.V(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(AndroidUtilities.dp(208.0f));
                org.telegram.messenger.t.n(R.string.BusinessLinksIntro, textView2);
                linearLayout.addView(textView2, org.telegram.ui.Components.kb1.x(-2, -2, 49, 17, 0, 17, 9));
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
                linearLayout.addView(textView3, org.telegram.ui.Components.kb1.x(-2, -2, 49, 17, 0, 17, 17));
                this.f45138h1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.l6(this.f45138h1, this.f45163j1, AndroidUtilities.dp(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f45074c1.addView(this.f45138h1, org.telegram.ui.Components.kb1.i(-2, -2, 17));
            } else if ((this.R9 != null && this.f45113f != null && !this.f45210n) || (this.f45255q8 != null && a() != getUserConfig().getClientUserId() && ((this.f45255q8.contact_require_premium && !getUserConfig().isPremium()) || this.f45255q8.send_paid_messages_stars > bi.ca.y(this.currentAccount, false).p().amount))) {
                this.f45102e1 = new ni(this, getParentActivity(), this.currentAccount, this.R9, this.f45309ua);
                Ec();
                this.f45102e1.setListener(new qe(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f45088d1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f45088d1.setGravity(17);
                this.f45088d1.addView(this.f45102e1, org.telegram.ui.Components.kb1.i(-2, -2, 17));
                this.f45074c1.addView(this.f45088d1, org.telegram.ui.Components.kb1.i(-1, -2, 17));
                TLRPC.UserFull userFull = this.f45255q8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f45102e1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f45102e1.setSticker(this.f45255q8.business_intro.sticker);
                }
                Dc();
            } else if (this.h == null) {
                String str2 = null;
                Paint paint = null;
                str2 = null;
                if (this.f45290t4 && this.f45091d4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    om omVar2 = this.f45163j1;
                    un unVar = this.f45309ua;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int dp2 = AndroidUtilities.dp(18.0f);
                    if (unVar != null) {
                        paint = unVar.d("paintChatActionBackground");
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.y6.U0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.y6.f23293a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.l6(linearLayout3, omVar2, dp2, paint));
                    linearLayout3.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(parentActivity2);
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.wh.j(15.0f, 1, textView4);
                    int i14 = org.telegram.ui.ActionBar.y6.f23454ic;
                    org.telegram.ui.ActionBar.f7.V(textView4, i14, unVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(AndroidUtilities.dp(210.0f));
                    textView4.setText(LocaleController.getString(R.string.AlmostDone));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.f7.V(textView5, i14, unVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(AndroidUtilities.dp(160.0f));
                    textView5.setText(LocaleController.getString(R.string.TopicEmptyViewDescription));
                    linearLayout3.addView(y9Var, org.telegram.ui.Components.kb1.x(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, org.telegram.ui.Components.kb1.x(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, org.telegram.ui.Components.kb1.u(-2, -2, 1));
                    TLRPC.Document emojiAnimatedSticker = MediaDataController.getInstance(UserConfig.selectedAccount).getEmojiAnimatedSticker("🥳");
                    if (emojiAnimatedSticker != null) {
                        SvgHelper.SvgDrawable svgThumb = DocumentObject.getSvgThumb(emojiAnimatedSticker.thumbs, org.telegram.ui.ActionBar.y6.f23339c7, 0.2f);
                        if (svgThumb != null) {
                            svgThumb.overrideWidthAndHeight(512, 512);
                        }
                        y9Var.i(ImageLocation.getForDocument(emojiAnimatedSticker), null, "tgs", svgThumb, null);
                    }
                    this.f45074c1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!R9() && this.f45091d4 == 0 && (((user2 = this.f45113f) != null && user2.self) || ((chat = this.e) != null && chat.creator && !ChatObject.isChannelAndNotMegaGroup(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    om omVar3 = this.f45163j1;
                    if (this.e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.qo qoVar = new org.telegram.ui.Components.qo(parentActivity3, omVar3, i10, this.f45309ua);
                    this.f45175k1 = qoVar;
                    this.f45074c1.addView(qoVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.e != null) {
                        this.f45175k1.setStatusText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.GroupEmptyTitle1)));
                    }
                } else {
                    if (R9() && this.f45091d4 == 0) {
                        str2 = this.f45277s4 ? LocaleController.getString(R.string.NoComments) : LocaleController.getString(R.string.NoReplies);
                    } else if (this.f45091d4 == 1) {
                        str2 = LocaleController.getString(R.string.NoScheduledMessages);
                    } else {
                        TLRPC.User user3 = this.f45113f;
                        if (user3 != null) {
                            long j10 = user3.f22177id;
                            if (j10 != 777000 && j10 != 429000 && j10 != 4244000 && MessagesController.isSupportUser(user3)) {
                                str2 = LocaleController.getString(R.string.GotAQuestion);
                            }
                        }
                        if (this.f45091d4 != 8 && ((user = this.f45113f) == null || user.self || user.deleted || this.f45210n)) {
                            str2 = LocaleController.getString(R.string.NoMessages);
                        }
                    }
                    if (str2 == null) {
                        this.f45102e1 = new oi(this, getParentActivity(), this.currentAccount, this.R9, this.f45309ua);
                        Ec();
                        this.f45102e1.setListener(new qe(this, 5));
                        TLRPC.UserFull userFull2 = this.f45255q8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f45102e1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f45102e1.setSticker(this.f45255q8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f45088d1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f45088d1.setGravity(17);
                        this.f45088d1.addView(this.f45102e1, org.telegram.ui.Components.kb1.i(-2, -2, 17));
                        this.f45074c1.addView(this.f45088d1, org.telegram.ui.Components.kb1.i(-1, -2, 17));
                        Dc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f45213n2 = textView6;
                    textView6.setText(str2);
                    this.f45213n2.setTextSize(1, 14.0f);
                    this.f45213n2.setGravity(17);
                    org.telegram.ui.ActionBar.f7.V(this.f45213n2, org.telegram.ui.ActionBar.y6.f23454ic, getResourceProvider());
                    this.f45213n2.setBackground(new org.telegram.ui.ActionBar.l6(this.f45213n2, this.f45163j1, AndroidUtilities.dp(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f45213n2.setTypeface(AndroidUtilities.bold());
                    this.f45213n2.setPadding(AndroidUtilities.dp(9.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(3.0f));
                    this.f45074c1.addView(this.f45213n2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.f45175k1 = new org.telegram.ui.Components.qo(getParentActivity(), this.f45163j1, 0, this.f45309ua);
                if (this.h.admin_id == getUserConfig().getClientUserId()) {
                    this.f45175k1.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleOutgoing, UserObject.getFirstName(this.f45113f)));
                } else {
                    this.f45175k1.setStatusText(LocaleController.formatString(R.string.EncryptedPlaceholderTitleIncoming, UserObject.getFirstName(this.f45113f)));
                }
                this.f45074c1.addView(this.f45175k1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final boolean P9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f45072c && !this.d && this.f45113f == null && this.f45339x0 != null && SharedConfig.animationsEnabled()) {
            if (this.Ib == null) {
                this.Ib = Boolean.valueOf(LiteMode.isEnabled(360928));
            }
            if (this.Ib.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f45339x0.getChildCount(); i12++) {
                    i11 += this.f45339x0.getChildAt(i12).getHeight();
                    int top = this.f45339x0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.I9) {
                    U6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.S6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.K6;
                if ((!z12 || ((this.f45065b7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.W6 && f10 > this.I9 && (!arrayList.isEmpty() ? i11 != 0 : this.Hb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f45074c1) == null || frameLayout.getVisibility() != 0 || this.f45074c1.getChildCount() <= 0) {
                    if (!z10 && this.f45094d7 == 0) {
                        U6(this.fragmentBeginToShow);
                    }
                    if (SharedConfig.getDevicePerformanceClass() != 0 && !this.f45147ha && this.fragmentBeginToShow) {
                        if (z10 && this.f45094d7 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable l4 = this.f45309ua.l();
                        om omVar = this.f45163j1;
                        if (omVar != null) {
                            l4 = omVar.getBackgroundImage();
                        }
                        if (l4 instanceof org.telegram.ui.Components.vc0) {
                            org.telegram.ui.Components.vc0 vc0Var = (org.telegram.ui.Components.vc0) l4;
                            if (vc0Var.N != z11) {
                                if (!z11) {
                                    vc0Var.c();
                                }
                                float f11 = 1.0f;
                                if (!z11 && vc0Var.N) {
                                    vc0Var.h = 1.0f - ((vc0Var.h - (((int) (f7 / 0.125f)) * 0.125f)) / 0.125f);
                                    vc0Var.d = true;
                                }
                                vc0Var.N = z11;
                                if (z11) {
                                    f11 = 1.5f;
                                }
                                vc0Var.M = f11;
                                vc0Var.y();
                            } else if (z11) {
                                vc0Var.y();
                            }
                        }
                    }
                    if (z10 || (this.f45094d7 != 0 && System.currentTimeMillis() - this.f45094d7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void Pa(MessageObject messageObject, int i10) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = LocaleController.formatDateChat(messageObject.messageOwner.date);
        tL_message.f22049id = 0;
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
        messageObject2.stableId = g9(messageObject.dateKeyInt);
        this.A0.P.add(i10, messageObject2);
    }

    public final void Pb(boolean r29, org.telegram.messenger.MessageObject r30, org.telegram.messenger.MessageObject r31, java.util.ArrayList r32, org.telegram.tgnet.TLRPC.WebPage r33, boolean r34, int r35, org.telegram.ui.mn r36, boolean r37, long r38, org.telegram.messenger.MessageSuggestionParams r40, boolean r41) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Pb(boolean, org.telegram.messenger.MessageObject, org.telegram.messenger.MessageObject, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.mn, boolean, long, org.telegram.messenger.MessageSuggestionParams, boolean):void");
    }

    public final void Pc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Pc(int, boolean):void");
    }

    public final void Q6() {
        if (this.f45124fb) {
            return;
        }
        if (M9()) {
            AndroidUtilities.requestAdjustNothing(getParentActivity(), this.classGuid);
        } else {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final int Q8(MessageObject messageObject) {
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
                        if (!getMediaDataController().isStickerPackInstalled(inputStickerSet.f22048id)) {
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

    public final boolean Q9() {
        if (getUserConfig().getClientUserId() == a() && !getMessagesController().getSavedMessagesController().unsupported && getUserConfig().isPremium()) {
            return true;
        }
        return false;
    }

    public final void Qa() {
        int i10;
        this.T4.clear();
        this.V4.clear();
        this.X4 = 0;
        this.f45063b5 = 0;
        this.f45078c5 = 0;
        Pc(0, true);
        MediaDataController mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.f45245p8;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.loadPinnedMessages(a2, 0, i10);
        this.f45092d5 = true;
        Qc();
    }

    public final void Qb(ArrayList arrayList) {
        Ob(true, null, arrayList, null, true, 0, null, false, 0L, true);
    }

    public final void Qc() {
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f45290t4 && !this.V4.isEmpty() && this.T4.size() == 1 && ((Integer) this.T4.get(0)).intValue() == b() + 1) {
            messageObject = (MessageObject) this.V4.get(this.T4.get(0));
        } else {
            messageObject = null;
        }
        this.f45178k4 = messageObject;
        if (this.f45290t4 && messageObject != null && (message = messageObject.messageOwner) != null && (tL_forumTopic = this.f45228o4) != null && !MessageObject.peersEqual(tL_forumTopic.from_id, message.from_id) && !MessageObject.peersEqual(this.e, this.f45178k4.messageOwner.from_id)) {
            this.f45178k4 = null;
        }
    }

    public final void R6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.R6():void");
    }

    public final boolean R7(android.view.View r96, boolean r97, boolean r98, float r99, float r100, boolean r101, boolean r102, boolean r103) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.R7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final boolean R9() {
        if (this.f45166j4 != null) {
            return true;
        }
        return false;
    }

    public final void Ra(MessageObject messageObject) {
        if (messageObject == this.f45209mc) {
            this.f45209mc = null;
            hd(true);
            return;
        }
        MessagesController.SponsoredMessagesInfo sponsoredMessages = getMessagesController().getSponsoredMessages(this.f45168j6);
        if (sponsoredMessages != null) {
            sponsoredMessages.messages.remove(messageObject);
        }
    }

    public final void Rb(MessageObject messageObject) {
        Ob(true, messageObject, null, null, true, 0, null, false, 0L, true);
    }

    public final void Rc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f45353y1 > 0 && ((i10 = this.f45091d4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45313v1.e(4, z11, z10);
        this.f45313v1.c(4, this.f45353y1, z10);
    }

    public final void S6(View view, int i10, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.Xc.e) * (1.0f - this.Vc.e) * ((float[]) this.f45086cd.f16423b)[i10];
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

    public final int S8() {
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
                if (r2Var != this && (r2Var instanceof wn) && ((wn) r2Var).f45168j6 == this.f45168j6) {
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

    public final void S9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.K6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            MessageObject messageObject = (MessageObject) ic.a.g(1, arrayList);
            if ((((MessageObject) arrayList.get(0)).messageOwner.date >= i10 && messageObject.messageOwner.date <= i10) || (messageObject.messageOwner.date >= i10 && this.S6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                    if (messageObject2.messageOwner.date >= i10 && messageObject2.getId() != 0) {
                        int id2 = messageObject2.getId();
                        if (messageObject2.getDialogId() != this.f45065b7) {
                            i13 = 0;
                        }
                        j(id2, 0, false, i13, true, 0);
                        return;
                    }
                }
            } else if (!DialogObject.isEncryptedDialog(this.f45168j6)) {
                int N0 = this.f45364z0.N0();
                int L0 = this.f45364z0.L0();
                while (true) {
                    if (L0 <= N0) {
                        hm hmVar = this.A0;
                        int i14 = hmVar.J;
                        if (L0 >= i14 && L0 < hmVar.K && (message = ((MessageObject) arrayList.get(L0 - i14)).messageOwner) != null) {
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
                this.f45206m9.e(i11);
                org.telegram.ui.ActionBar.e2 e2Var = this.Pb;
                if (e2Var != null) {
                    e2Var.dismiss();
                }
                Oc(false);
                org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, this.f45309ua);
                this.Pb = e2Var2;
                e2Var2.setOnCancelListener(this.Ca);
                this.Pb.r(1000L);
                int i15 = this.f45191l6;
                this.f45233o9 = i15;
                this.q9 = false;
                this.f45345x6.add(Integer.valueOf(i15));
                this.f45246p9 = 0;
                this.f45268r9 = false;
                MessagesController messagesController = getMessagesController();
                long j10 = this.f45168j6;
                long j11 = this.f45065b7;
                int i16 = this.classGuid;
                int i17 = this.f45091d4;
                long j12 = this.f45241p4;
                int i18 = this.f45355y4;
                int i19 = this.f45191l6;
                this.f45191l6 = i19 + 1;
                messagesController.loadMessages(j10, j11, false, 30, 0, i10, true, 0, i16, 4, 0, i17, j12, i18, i19, this.f45290t4);
                this.f45165j3.setAlpha(0.0f);
                this.f45165j3.setTag(null);
                this.f45302u3 = 0.0f;
                Cc();
                this.f45177k3.setTag(null);
            }
        }
    }

    public final void Sa(MessageObject messageObject) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            hm hmVar = this.A0;
            if (hmVar != null && !hmVar.N) {
                hmVar.u(hmVar.J + indexOf);
            }
        }
    }

    public final void Sb(MessageObject messageObject, mn mnVar) {
        Ob(true, messageObject, null, null, true, 0, mnVar, false, 0L, true);
    }

    public final void Sc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f45340x1 > 0 && ((i10 = this.f45091d4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f45313v1.e(3, z11, z10);
        this.f45313v1.c(3, this.f45340x1, z10);
    }

    public final boolean T6() {
        boolean isPossibleRemoveChatRestrictionsByBoosts = ChatObject.isPossibleRemoveChatRestrictionsByBoosts(this.f45245p8);
        if (isPossibleRemoveChatRestrictionsByBoosts) {
            AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
            tg.j0.G1(this, this.P1, this.Q1, this.f45168j6, false);
        }
        return isPossibleRemoveChatRestrictionsByBoosts;
    }

    public final void T7() {
        if (this.h == null && this.J2 == null && getParentActivity() != null) {
            gl glVar = new gl(this, getParentActivity());
            this.J2 = glVar;
            glVar.setTag(1);
            this.Y0.addView(this.J2, org.telegram.ui.Components.kb1.r(-1, 48));
            this.Y0.h(1, this.J2);
            this.Y0.g(this.J2);
            this.J2.setOnClickListener(new we(this, 17));
            this.J2.setEnabled(!isInPreviewMode());
            this.J2.setBackground(org.telegram.ui.ActionBar.y6.M0(false));
            org.telegram.ui.Components.ug0 ug0Var = new org.telegram.ui.Components.ug0(getParentActivity(), this.f45309ua);
            this.L2 = ug0Var;
            this.J2.addView(ug0Var, org.telegram.ui.Components.kb1.h(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.J2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.R2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.R2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23401fe));
            this.R2.setTypeface(AndroidUtilities.bold());
            this.J2.addView(this.R2, org.telegram.ui.Components.kb1.h(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i10 = 0; i10 < 2; i10++) {
                vn vnVar = new vn(this, getParentActivity());
                vn[] vnVarArr = this.O2;
                vnVarArr[i10] = vnVar;
                vnVar.setTextSize(14);
                org.telegram.ui.ActionBar.f7.Y(vnVarArr[i10], org.telegram.ui.ActionBar.y6.f23401fe, getResourceProvider());
                vnVarArr[i10].setTypeface(AndroidUtilities.bold());
                this.J2.addView(vnVarArr[i10], org.telegram.ui.Components.kb1.h(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                hl hlVar = new hl(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.b6[] b6VarArr = this.P2;
                b6VarArr[i10] = hlVar;
                hlVar.setTextSize(14);
                org.telegram.ui.ActionBar.f7.Y(b6VarArr[i10], org.telegram.ui.ActionBar.y6.f23419ge, getResourceProvider());
                this.J2.addView(b6VarArr[i10], org.telegram.ui.Components.kb1.h(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                ln lnVar = new ln(this, getParentActivity());
                ln[] lnVarArr = this.Q2;
                lnVarArr[i10] = lnVar;
                this.J2.addView(lnVar, org.telegram.ui.Components.kb1.h(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                il ilVar = new il(getParentActivity());
                ilVar.I = new xh.g();
                ilVar.H = new Path();
                ilVar.J = new float[8];
                org.telegram.ui.Components.y9[] y9VarArr = this.N2;
                y9VarArr[i10] = ilVar;
                ilVar.setBlurAllowed(true);
                y9VarArr[i10].setRoundRadius(AndroidUtilities.dp(2.0f));
                this.J2.addView(y9VarArr[i10], org.telegram.ui.Components.kb1.h(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i10 == 1) {
                    vnVarArr[i10].setVisibility(4);
                    lnVarArr[i10].setVisibility(4);
                    b6VarArr[i10].setVisibility(4);
                    y9VarArr[i10].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.X2 = imageView;
            imageView.setImageResource(R.drawable.msg_pinnedlist);
            ImageView imageView2 = this.X2;
            int i11 = org.telegram.ui.ActionBar.y6.f23365de;
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
            int i12 = org.telegram.ui.ActionBar.y6.f23733x7;
            org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.f7.h(i12, 25), getResourceProvider());
            this.J2.addView(this.X2, org.telegram.ui.Components.kb1.h(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.X2.setOnClickListener(new we(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.V2 = imageView5;
            imageView5.setImageResource(R.drawable.miniplayer_close);
            org.telegram.ui.ActionBar.f7.t(this.V2, i11, getResourceProvider(), mode);
            this.V2.setScaleType(scaleType);
            this.V2.setVisibility(8);
            this.V2.setContentDescription(LocaleController.getString(R.string.Close));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f45309ua);
            this.W2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.W2.setSize(AndroidUtilities.dp(16.0f));
            this.W2.setStrokeWidth(2.0f);
            this.W2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23382ee));
            this.J2.addView(this.W2, org.telegram.ui.Components.kb1.h(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.f7.R(this.V2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i12) & 436207615, 1, AndroidUtilities.dp(14.0f)), null, org.telegram.ui.ActionBar.f7.h(i12, 25), getResourceProvider());
            this.J2.addView(this.V2, org.telegram.ui.Components.kb1.h(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.V2.setOnClickListener(new we(this, 19));
            Oc(false);
        }
    }

    public final int T8() {
        return Math.max(this.f45063b5, this.f45078c5);
    }

    public final void T9(ArrayList arrayList) {
        org.telegram.ui.Components.f41 f41Var;
        if (arrayList != null && (f41Var = this.f45089d2) != null && f41Var.Q) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && messageObject.type == 36) {
                    TLRPC.MessageMedia media = MessageObject.getMedia(messageObject.messageOwner);
                    ConcurrentHashMap concurrentHashMap = org.telegram.ui.Components.jb1.f29624a;
                    if (media instanceof TLRPC.TL_messageMediaWidget) {
                        messageObject.updateSideMenuEnabled(true);
                    }
                }
            }
        }
    }

    public final void Ta(MessageObject messageObject) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(messageObject);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            hm hmVar = this.A0;
            if (hmVar != null && !hmVar.N) {
                hmVar.P(hmVar.J + indexOf, true);
            }
        }
    }

    public final void Tb(MessageSuggestionParams messageSuggestionParams) {
        Pb(true, null, null, null, null, true, 0, null, false, 0L, messageSuggestionParams, true);
    }

    public final void Tc(boolean z10) {
        String string;
        if (this.f45091d4 != 3 && !UserObject.isBotForum(this.f45113f)) {
            lj ljVar = this.f45198m1;
            if (ljVar != null && this.f45241p4 != 0) {
                if (this.f45290t4) {
                    jd();
                } else if (this.f45277s4) {
                    MessageObject messageObject = this.f45166j4;
                    if (messageObject != null && messageObject.hasReplies()) {
                        this.f45198m1.setTitle(LocaleController.formatPluralString("Comments", this.f45166j4.getRepliesCount(), new Object[0]));
                    } else {
                        this.f45198m1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    MessageObject messageObject2 = this.f45166j4;
                    if (messageObject2 != null) {
                        ljVar.setTitle(LocaleController.formatPluralString("Replies", messageObject2.getRepliesCount(), new Object[0]));
                    }
                }
            }
            if (this.f45215n4 != null) {
                if (this.f45166j4.getRepliesCount() == 0) {
                    if (this.f45277s4) {
                        string = LocaleController.getString(R.string.NoComments);
                    } else {
                        string = LocaleController.getString(R.string.NoReplies);
                    }
                } else {
                    string = LocaleController.getString(R.string.DiscussionStarted);
                }
                MessageObject messageObject3 = this.f45215n4;
                messageObject3.messageOwner.message = string;
                messageObject3.messageText = string;
                if (z10) {
                    this.A0.R(messageObject3, true, false);
                }
            }
        }
    }

    public final void U6(boolean z10) {
        if (this.f45094d7 == 0) {
            if (z10 && !this.f45108e7.isEmpty()) {
                this.f45094d7 = System.currentTimeMillis();
            } else {
                this.f45094d7 = 1L;
            }
            P9();
            rj rjVar = this.f45339x0;
            if (rjVar != null) {
                rjVar.invalidate();
            }
        }
    }

    public final void U7() {
        int i10;
        int i11;
        if (this.f45090d3 == null && getParentActivity() != null) {
            mk mkVar = new mk(this, getParentActivity(), 1);
            this.f45090d3 = mkVar;
            mkVar.setClickable(false);
            this.f45090d3.setWillNotDraw(false);
            this.f45086cd.h(4, false, false);
            this.f45090d3.setClipToPadding(false);
            org.telegram.ui.Components.s6 s6Var = new org.telegram.ui.Components.s6(getParentActivity(), true, true, true);
            this.f45129g3 = s6Var;
            org.telegram.ui.Components.ds dsVar = org.telegram.ui.Components.ds.h;
            s6Var.b(0.25f, 280L, dsVar);
            this.f45129g3.setTextSize(AndroidUtilities.dp(15.0f));
            this.f45129g3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(this.f45129g3, org.telegram.ui.ActionBar.y6.f23757ye, getResourceProvider());
            this.f45129g3.setGravity(3);
            this.f45090d3.addView(this.f45129g3, org.telegram.ui.Components.kb1.h(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.U.addView(this.f45090d3, org.telegram.ui.Components.kb1.h(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.s6 s6Var2 = new org.telegram.ui.Components.s6(getParentActivity(), true, false, true);
            this.f45140h3 = s6Var2;
            s6Var2.b(0.0f, 420L, dsVar);
            this.f45140h3.setScaleProperty(0.7f);
            this.f45140h3.setTextSize(AndroidUtilities.dp(15.0f));
            this.f45140h3.setGravity(5);
            this.f45140h3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(this.f45140h3, org.telegram.ui.ActionBar.y6.f23561o6, getResourceProvider());
            org.telegram.ui.Components.s6 s6Var3 = this.f45140h3;
            if (this.Zc.f19326f) {
                i10 = R.string.SearchAsChat;
            } else {
                i10 = R.string.SearchAsList;
            }
            s6Var3.setText(LocaleController.getString(i10));
            org.telegram.ui.Components.s6 s6Var4 = this.f45140h3;
            s6Var4.f32492n = false;
            s6Var4.setPadding(AndroidUtilities.dp(15.33f), 0, AndroidUtilities.dp(15.33f), 0);
            this.f45140h3.setOnClickListener(new we(this, 2));
            this.f45140h3.setAlpha(0.5f);
            this.f45140h3.setClickable(false);
            this.f45090d3.addView(this.f45140h3, org.telegram.ui.Components.kb1.i(-2, -1, 117));
            org.telegram.ui.Components.s6 s6Var5 = new org.telegram.ui.Components.s6(getParentActivity(), true, true, true);
            this.f45153i3 = s6Var5;
            s6Var5.setGravity(17);
            this.f45153i3.setTypeface(AndroidUtilities.bold());
            org.telegram.ui.ActionBar.f7.Z(this.f45153i3, org.telegram.ui.ActionBar.y6.Ae, getResourceProvider());
            this.f45153i3.setTextSize(AndroidUtilities.dp(15.0f));
            org.telegram.ui.Components.s6 s6Var6 = this.f45153i3;
            int i12 = org.telegram.ui.ActionBar.y6.f23357d6;
            int themedColor = getThemedColor(i12);
            int themedColor2 = getThemedColor(i12);
            int i13 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.ActionBar.f7.R(s6Var6, org.telegram.ui.ActionBar.y6.h0(themedColor, org.telegram.ui.ActionBar.y6.v(themedColor2, getThemedColor(i13))), org.telegram.ui.ActionBar.f7.N(i12), org.telegram.ui.ActionBar.f7.q(i12, i13), getResourceProvider());
            org.telegram.ui.Components.s6 s6Var7 = this.f45153i3;
            if (this.A0.N) {
                i11 = R.string.SavedTagHideOtherMessages;
            } else {
                i11 = R.string.SavedTagShowOtherMessages;
            }
            s6Var7.setText(LocaleController.getString(i11));
            this.f45153i3.setOnClickListener(new we(this, 3));
            this.f45153i3.setVisibility(8);
            this.f45153i3.setAlpha(0.0f);
            this.f45090d3.addView(this.f45153i3, org.telegram.ui.Components.kb1.i(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!ChatObject.isChannel(chat) || this.e.megagroup) && this.f45091d4 != 7 && !ChatObject.isMonoForum(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f45117f3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f45117f3.setImageResource(R.drawable.msg_usersearch);
                org.telegram.ui.ActionBar.f7.t(this.f45117f3, org.telegram.ui.ActionBar.y6.f23739xe, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f45117f3;
                int i14 = org.telegram.ui.ActionBar.y6.f23770z8;
                org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i14), getResourceProvider());
                this.f45090d3.addView(this.f45117f3, org.telegram.ui.Components.kb1.h(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f45117f3.setOnClickListener(new we(this, 4));
                this.f45117f3.setContentDescription(LocaleController.getString(R.string.AccDescrSearchByUser));
            }
            if (this.f45091d4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f45104e3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f45104e3.setImageResource(R.drawable.msg_calendar);
                org.telegram.ui.ActionBar.f7.t(this.f45104e3, org.telegram.ui.ActionBar.y6.f23739xe, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f45104e3;
                int i15 = org.telegram.ui.ActionBar.y6.f23770z8;
                org.telegram.ui.ActionBar.f7.R(imageView4, org.telegram.ui.ActionBar.y6.g0(getThemedColor(i15), 1, -1), null, org.telegram.ui.ActionBar.f7.N(i15), getResourceProvider());
                this.f45090d3.addView(this.f45104e3, org.telegram.ui.Components.kb1.h(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f45104e3.setOnClickListener(new we(this, 5));
                this.f45104e3.setContentDescription(LocaleController.getString(R.string.JumpToDate));
            }
        }
    }

    public final int U8() {
        if (this.f45091d4 == 5) {
            return (int) this.f45241p4;
        }
        return 0;
    }

    public final void U9() {
        this.P4 = true;
        if (this.C6) {
            getMessagesStorage().getUnreadMention(this.f45168j6, b(), new rg(this, 1));
            return;
        }
        MessagesStorage messagesStorage = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().getInputPeer(this.f45168j6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f45290t4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f45241p4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.B6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new z7(6, this, messagesStorage));
    }

    public final void Ua() {
        if (this.f45121f8 == null && this.f45133g8 == null && this.f45145h8 == null) {
            le leVar = this.f45182k8;
            if (leVar != null) {
                AndroidUtilities.cancelRunOnUIThread(leVar);
                this.f45182k8 = null;
            }
            this.f45066b8 = Integer.MAX_VALUE;
            this.f45095d8 = false;
            this.f45109e8 = 0L;
            this.f45121f8 = null;
            this.f45133g8 = null;
            this.f45145h8 = null;
        }
    }

    public final void Ub(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        Ob(z10, null, null, webPage, true, 0, null, z11, 0L, true);
    }

    public final void Uc(MessageObject messageObject, int i10) {
        MessageObject messageObject2;
        SparseArray sparseArray = this.G6;
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
            MessageObject messageObject3 = (MessageObject) this.E6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (messageObject3 != null) {
                if (messageObject == null) {
                    messageObject3.replyMessageObject = messageObject2;
                } else {
                    messageObject3.replyMessageObject = messageObject;
                }
                hm hmVar = this.A0;
                if (hmVar != null) {
                    hmVar.R(messageObject3, true, false);
                }
            }
        }
        if (messageObject == null) {
            sparseArray.remove(i10);
        }
    }

    public final void V6(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        MessageObject messageObject2 = this.F5;
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        MessagePreviewParams messagePreviewParams = this.f45317v5;
        if (messagePreviewParams != null && messageObject2 != null) {
            int i10 = messageObject2.type;
            if ((i10 == 0 || i10 == 19) && (webPage = this.W5) != null && !messagePreviewParams.hasLink(charSequence, webPage.url) && z10) {
                this.W5 = null;
                jk jkVar = this.Y;
                if (jkVar != null) {
                    jkVar.X2 = null;
                    jkVar.Y2 = true;
                }
                MessagePreviewParams messagePreviewParams2 = this.f45317v5;
                if (messagePreviewParams2 != null) {
                    int i11 = this.currentAccount;
                    CharSequence fieldText = jkVar.getFieldText();
                    MessageObject messageObject3 = this.D5;
                    if (messageObject3 == this.f45166j4) {
                        messageObject = null;
                    } else {
                        messageObject = messageObject3;
                    }
                    messagePreviewParams2.updateLink(i11, null, fieldText, messageObject, this.B5, this.F5);
                }
                r8();
                s8();
            }
        }
    }

    public final void V7() {
        if (this.f45239p2 == null && this.F1 == null) {
            org.telegram.ui.Components.c10 c10Var = new org.telegram.ui.Components.c10(getParentActivity(), this.f45309ua);
            this.f45226o2 = c10Var;
            c10Var.setViewType(7);
            org.telegram.ui.Components.fy0 fy0Var = new org.telegram.ui.Components.fy0(getParentActivity(), this.f45226o2, 1, null);
            this.f45239p2 = fy0Var;
            fy0Var.setClickable(true);
            this.f45239p2.d.setText(LocaleController.getString(R.string.NoResult));
            this.f45239p2.setVisibility(8);
            this.f45239p2.addView(this.f45226o2, 0);
            this.f45239p2.e(true, false);
            this.W3.addView(this.f45239p2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.o40 o40Var = new org.telegram.ui.Components.o40(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.F1 = o40Var;
            o40Var.setOnHashtagClickListener(new ye(this, 3));
            this.F1.setOnScrollListener(new i3(this, 6));
            this.F1.setVisibility(8);
            this.W3.addView(this.F1, -1, -1);
            A7();
            y7();
        }
    }

    public final long V8() {
        if (this.f45091d4 == 3) {
            return this.f45241p4;
        }
        return 0L;
    }

    public final void V9(boolean z10) {
        TLRPC.Chat chat;
        if (this.f45348xa == null && (chat = this.e) != null && ChatObject.canSendAsPeers(chat) && this.Y != null && !ChatObject.isMonoForum(this.e)) {
            TLRPC.TL_channels_sendAsPeers sendAsPeers = getMessagesController().getSendAsPeers(this.f45168j6);
            this.f45348xa = sendAsPeers;
            if (sendAsPeers != null) {
                this.Y.N1(false, z10);
            }
        }
    }

    public final void Va(boolean z10) {
        MessageObject messageObject = this.Z7;
        if (messageObject != null) {
            if (z10) {
                boolean[] zArr = this.U6;
                zArr[1] = true;
                zArr[0] = true;
                this.X7 = 0;
                this.f45051a7 = 0;
            }
            this.T7 = 0;
            this.U7 = false;
            Sa(messageObject);
            this.Z7 = null;
        }
    }

    public final void Vb(boolean z10) {
        if (this.f45165j3 != null && !L9()) {
            if (this.f45165j3.getTag() == null) {
                AnimatorSet animatorSet = this.f45276s3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f45165j3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f45276s3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f45276s3.playTogether(ObjectAnimator.ofFloat(this.f45165j3, View.ALPHA, 1.0f));
                this.f45276s3.addListener(new si(this, 5));
                this.f45276s3.start();
            }
            if (!z10) {
                C9();
                this.f45200m3 = 1000;
            }
        }
    }

    public final void Vc(boolean z10) {
        jk jkVar = this.Y;
        if (jkVar != null) {
            jkVar.L1(z10);
        }
    }

    public final void W6() {
        MessageObject editingMessageObject;
        int abs;
        jk jkVar = this.Y;
        if (jkVar != null && (editingMessageObject = jkVar.getEditingMessageObject()) != null && !editingMessageObject.scheduled) {
            TLRPC.User user = this.f45113f;
            if (user == null || !user.self) {
                org.telegram.ui.ActionBar.b6 b6Var = ((org.telegram.ui.Components.dp[]) this.f45045a0.f4113b)[0].d;
                if (editingMessageObject.canEditMessageAnytime(this.e)) {
                    abs = 360;
                } else {
                    abs = (getMessagesController().maxEditTime + 300) - Math.abs(getConnectionsManager().getCurrentTime() - editingMessageObject.messageOwner.date);
                }
                if (abs > 0) {
                    if (abs <= 300) {
                        b6Var.l(LocaleController.formatString("TimeToEdit", R.string.TimeToEdit, AndroidUtilities.formatShortDuration(abs)), false);
                    }
                    AndroidUtilities.runOnUIThread(new ig(this, 18), 1000L);
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

    public final TextureView W7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        AndroidUtilities.cancelRunOnUIThread(this.O8);
        if (this.J8 == null) {
            mk mkVar = new mk(this, getParentActivity(), 2);
            this.J8 = mkVar;
            mkVar.setOutlineProvider(new kl(this));
            this.J8.setClipToOutline(true);
            this.J8.setWillNotDraw(false);
            m4 m4Var = new m4(getParentActivity());
            this.L8 = m4Var;
            m4Var.setBackgroundColor(0);
            if (z10) {
                this.J8.addView(this.L8, org.telegram.ui.Components.kb1.i(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.M8 = textureView;
            textureView.setOpaque(false);
            this.L8.addView(this.M8, org.telegram.ui.Components.kb1.g(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.J8.getParent();
        if (viewGroup != null && viewGroup != this.f45163j1) {
            viewGroup.removeView(this.J8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.f45163j1.addView(this.J8, 1, new FrameLayout.LayoutParams(AndroidUtilities.roundPlayingMessageSize(O9()), AndroidUtilities.roundPlayingMessageSize(O9())));
        }
        this.J8.setTag(null);
        this.L8.setDrawingReady(false);
        return this.M8;
    }

    public final int W8(int i10) {
        return (int) Math.max(-AndroidUtilities.dp(2.0f), (((((this.f45339x0.getMeasuredHeight() - this.Ra) - this.I9) - this.v.e()) - AndroidUtilities.dp(53.0f)) - i10) / 2.0f);
    }

    public final void W9(MessageObject messageObject, boolean z10, boolean z11) {
        if (messageObject != null && messageObject.isSponsored()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = messageObject.sponsoredId;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Wa(ArrayList arrayList, int i10, boolean z10, boolean z11) {
        a0.h hVar;
        ArrayList arrayList2;
        hm hmVar;
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
            hVar = this.N6;
            arrayList2 = this.K6;
            if (i16 >= size) {
                break;
            }
            MessageObject messageObject = (MessageObject) arrayList5.get(i16);
            if (((MessageObject) this.V4.get(Integer.valueOf(messageObject.getId()))) != null) {
                this.V4.put(Integer.valueOf(messageObject.getId()), messageObject);
            }
            SparseArray[] sparseArrayArr = this.E6;
            MessageObject messageObject2 = (MessageObject) sparseArrayArr[i10].get(messageObject.getId());
            if (messageObject.getId() > 0 && messageObject2 == null && UserObject.isBot(this.f45113f) && (messageObject2 = BotForumHelper.getInstance(this.currentAccount).onBotForumDraftCheckNewMessages(this.f45113f.f22177id, (int) b(), messageObject.getId(), messageObject.messageText.toString())) != null) {
                fb();
                this.f45258qc.c(messageObject.getId(), messageObject.getGroupId());
                if (!arrayList2.contains(messageObject2)) {
                    messageObject2 = null;
                } else {
                    this.pc.bind(messageObject2.messageOwner.f22049id, messageObject.getId());
                    TLRPC.Message message2 = messageObject2.messageOwner;
                    int id2 = messageObject.getId();
                    message2.local_id = id2;
                    message2.f22049id = id2;
                    messageObject2.messageOwner.date = messageObject.messageOwner.date;
                }
            }
            if (this.V4.containsKey(Integer.valueOf(messageObject.getId()))) {
                this.V4.put(Integer.valueOf(messageObject.getId()), messageObject);
                if (messageObject.getId() == this.X4) {
                    Pc(0, true);
                }
            }
            if (i10 == 0) {
                int id3 = messageObject.getId();
                SparseArray sparseArray = this.F6;
                if (sparseArray.indexOfKey(id3) >= 0) {
                    sparseArray.put(messageObject.getId(), messageObject);
                }
            }
            if (messageObject2 != null && ((!z10 || z11 || messageObject2.messageOwner.date == messageObject.messageOwner.date) && (!messageObject.scheduled || this.f45091d4 == 1))) {
                if (z10) {
                    arrayList5.remove(i16);
                    i16--;
                }
                A6(messageObject, messageObject2);
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
                    HashMap hashMap2 = this.H6;
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
                                groupedMessages2.reversed = this.f45136gb;
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
                    if (this.f45091d4 == 3) {
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
                        hm hmVar2 = this.A0;
                        if (hmVar2 != null && !hmVar2.N) {
                            hmVar2.Q(hmVar2.J + indexOf2);
                        }
                        if (i13 >= 0) {
                            arrayList3.set(i13, messageObject);
                        }
                    } else {
                        ArrayList arrayList9 = arrayList3;
                        int i21 = i13;
                        arrayList2.remove(indexOf2);
                        hm hmVar3 = this.A0;
                        if (hmVar3 != null && !hmVar3.N) {
                            hmVar3.u(hmVar3.J + indexOf2);
                        }
                        long id4 = messageObject2.getId();
                        a0.h hVar3 = this.J6;
                        if (((MessageObject) hVar3.f(id4)) != null) {
                            hVar3.l(messageObject2.getId());
                            arrayList2.remove(indexOf2);
                            hm hmVar4 = this.A0;
                            int i22 = hmVar4.E;
                            int i23 = hmVar4.F;
                            int i24 = hmVar4.H;
                            int i25 = hmVar4.G;
                            if (!hmVar4.N) {
                                hmVar4.u(hmVar4.J + indexOf2);
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
                                this.I6.remove(messageObject2.dateKeyInt);
                                arrayList2.remove(indexOf2);
                                hm hmVar5 = this.A0;
                                int i26 = hmVar5.E;
                                int i27 = hmVar5.F;
                                int i28 = hmVar5.H;
                                int i29 = hmVar5.G;
                                if (!hmVar5.N) {
                                    hmVar5.u(hmVar5.J + indexOf2);
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
                                        Uc(messageObject, messageObject2.getId());
                                        i16 = i11;
                                    }
                                }
                            }
                        }
                    }
                } else {
                    i11 = i16;
                }
                Uc(messageObject, messageObject2.getId());
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
                    if (indexOf3 >= 0 && (hmVar = this.A0) != null) {
                        hmVar.q(indexOf3 + hmVar.J, groupedMessages3.messages.size());
                        tj tjVar = this.f45352y0;
                        if (tjVar != null) {
                            tjVar.V(groupedMessages3);
                        }
                    }
                }
            }
        }
        Qc();
    }

    public final void Wb(boolean z10) {
        if (this.f45177k3 != null && !L9()) {
            if (this.f45177k3.getTag() == null) {
                ValueAnimator valueAnimator = this.f45289t3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f45177k3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45302u3, 1.0f);
                this.f45289t3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f45289t3.addUpdateListener(new ne(this, 2));
                this.f45289t3.addListener(new si(this, 7));
                this.f45289t3.start();
            }
            if (!z10) {
                C9();
                this.f45200m3 = 1000;
            }
        }
    }

    public final void Wc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        lh.h hVar = this.f45313v1;
        boolean z12 = false;
        if (hVar != null) {
            int i14 = 2;
            if (this.f45136gb) {
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
                ((kh.b) cVar.f16405b).b(z10, true);
            }
            lh.h hVar2 = this.f45313v1;
            if (this.f45136gb) {
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
                ((kh.b) cVar2.f16405b).b(z11, true);
            }
        }
        this.I3 = i12;
        this.J3 = i11;
        Xc();
        org.telegram.ui.Components.s6 s6Var = this.f45140h3;
        if (s6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            s6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f45140h3.animate();
            if (i12 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
        }
    }

    public final void X6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        ChatObject.Call call = this.f45205m8;
        if (call != null && (((str = this.f45333w8) != null || this.f45347x8) && this.f45093d6)) {
            org.telegram.ui.Components.voip.g2.l(this.e, str, this.f45232o8, Boolean.valueOf(!call.call.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f45333w8 = null;
            this.f45347x8 = false;
            return;
        }
        if (this.f45333w8 != null && z10 && (chatFull = this.f45245p8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.t.q(R.string.LinkHashExpired, org.telegram.ui.Components.wc.b0(this), R.raw.linkbroken, 36);
            this.f45333w8 = null;
        }
        this.f45219n8 = !this.f45093d6;
    }

    public final void X7() {
        if (this.f45163j1 != null && this.W1 == null && getParentActivity() != null) {
            this.W1 = new org.telegram.ui.ActionBar.q0(this, getParentActivity(), 1);
            A9();
            this.W1.setClickable(true);
            this.Y0.addView(this.W1, org.telegram.ui.Components.kb1.r(-1, 44));
            this.Y0.h(2, this.W1);
            this.Y0.g(this.W1);
            TextView textView = new TextView(getParentActivity());
            this.Z1 = textView;
            int i10 = org.telegram.ui.ActionBar.y6.f23599q7;
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
            this.W1.addView(this.Z1, org.telegram.ui.Components.kb1.i(-1, -1, 51));
            this.Z1.setOnClickListener(new we(this, 13));
            org.telegram.ui.Components.aa0 aa0Var = new org.telegram.ui.Components.aa0(getParentActivity(), this.f45309ua);
            this.f45116f2 = aa0Var;
            org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.f23419ge, getResourceProvider());
            this.f45116f2.setTextSize(1, 13.3f);
            this.f45116f2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.f7.H(this.f45116f2, org.telegram.ui.ActionBar.y6.il, getResourceProvider());
            this.f45116f2.setGravity(17);
            this.f45116f2.setPadding(0, AndroidUtilities.dp(9.0f), 0, AndroidUtilities.dp(9.0f));
            this.Y0.addView(this.f45116f2, org.telegram.ui.Components.kb1.o(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.Y0.h(8, this.f45116f2);
            this.Y0.g(this.f45116f2);
            TextView textView3 = new TextView(getParentActivity());
            this.X1 = textView3;
            int i11 = org.telegram.ui.ActionBar.y6.f23437he;
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
            this.W1.addView(this.X1, org.telegram.ui.Components.kb1.i(-1, -1, 51));
            this.X1.setOnClickListener(new we(this, 14));
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
            this.Y0.addView(this.a2, org.telegram.ui.Components.kb1.r(-1, 48));
            this.Y0.h(4, this.a2);
            this.Y0.g(this.a2);
            this.a2.setOnClickListener(new we(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f45128g2 = imageView;
            imageView.setImageResource(R.drawable.miniplayer_close);
            this.f45128g2.setContentDescription(LocaleController.getString(R.string.Close));
            ImageView imageView2 = this.f45128g2;
            int i12 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.ActionBar.f7.R(imageView2, org.telegram.ui.ActionBar.y6.N(getThemedColor(i12), 0, 0), null, org.telegram.ui.ActionBar.f7.N(i12), getResourceProvider());
            org.telegram.ui.ActionBar.f7.t(this.f45128g2, org.telegram.ui.ActionBar.y6.f23365de, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f45128g2.setScaleType(ImageView.ScaleType.CENTER);
            this.W1.addView(this.f45128g2, org.telegram.ui.Components.kb1.h(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f45128g2.setOnClickListener(new we(this, 16));
        }
    }

    public final int X8(MessageObject messageObject) {
        return W8(M8(messageObject, !TextUtils.isEmpty(this.f45121f8))) - hb(messageObject);
    }

    public final ui X9(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle) {
        qf.c cVar = this.f45056ac;
        if (cVar != null) {
            cVar.a(true);
            this.f45056ac = null;
        }
        if (characterStyle != null && s1Var != null && s1Var.getMessageObject() != null) {
            ui uiVar = new ui(this, s1Var.getMessageObject().getId(), characterStyle, s1Var, 0);
            this.f45056ac = uiVar;
            return uiVar;
        }
        this.f45056ac = null;
        return null;
    }

    public final void Xa() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().cancelTasksForGuid(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.K7 = 0;
        this.A7 = false;
        this.B7 = true;
        this.f45345x6.clear();
    }

    public final boolean Xb() {
        jk jkVar = this.Y;
        if (jkVar != null && jkVar.getVisibility() == 0) {
            SharedPreferences globalMainSettings = MessagesController.getGlobalMainSettings();
            if (!globalMainSettings.getBoolean("gifhint", false)) {
                globalMainSettings.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f45250q2 == null) {
                    if (!this.f45265r5) {
                        jk jkVar2 = this.Y;
                        if (jkVar2 != null) {
                            jkVar2.Q();
                            MediaDataController.getInstance(jkVar2.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar = jkVar2.U0;
                            dgVar.M(false, false);
                            dgVar.R(false, false);
                            dgVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        om omVar = this.f45163j1;
                        int indexOfChild = omVar.indexOfChild(this.S);
                        if (indexOfChild != -1) {
                            jk jkVar3 = this.Y;
                            jkVar3.Q();
                            MediaDataController.getInstance(jkVar3.Q).loadRecents(0, true, true, false);
                            org.telegram.ui.Components.dg dgVar2 = jkVar3.U0;
                            dgVar2.M(false, false);
                            dgVar2.R(false, false);
                            dgVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.I2 = view;
                            view.setBackgroundResource(R.drawable.redcircle);
                            int i10 = indexOfChild + 1;
                            omVar.addView(this.I2, i10, org.telegram.ui.Components.kb1.h(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(9, getParentActivity(), this.f45309ua, false);
                            this.f45250q2 = t40Var;
                            t40Var.setText(LocaleController.getString(R.string.TapHereGifs));
                            omVar.addView(this.f45250q2, i10, org.telegram.ui.Components.kb1.h(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.t40 t40Var2 = this.f45250q2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(t40Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.I2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new si(this, 4));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Y.getEmojiButton();
                            if (emojiButton != null) {
                                this.f45250q2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void Xc() {
        org.telegram.ui.Components.s6 s6Var = this.f45129g3;
        if (s6Var != null) {
            boolean z10 = !LocaleController.isRTL;
            int i10 = this.I3;
            if (i10 < 0) {
                s6Var.c("", z10, true);
            } else if (i10 == 0) {
                s6Var.c(LocaleController.getString(R.string.NoResult), z10, true);
            } else if (this.D3) {
                s6Var.c(LocaleController.formatPluralString("TaggedMessages", i10, new Object[0]), z10, true);
            } else if (this.f45091d4 != 7 && !this.Zc.f19326f) {
                s6Var.c(LocaleController.formatString(R.string.Of, Integer.valueOf(this.J3 + 1), Integer.valueOf(this.I3)), z10, true);
            } else {
                s6Var.c(LocaleController.formatPluralString("SearchMessagesResultCount", i10, LocaleController.formatNumber(i10, ' ')), z10, true);
            }
        }
    }

    public final void Y6() {
        TLRPC.ChatFull chatFull;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet groupStickerSetById;
        if (this.K1 == null && ChatObject.isMegagroup(this.e) && (chatFull = getMessagesController().getChatFull(this.e.f22028id)) != null && this.Y != null && getParentActivity() != null && (stickerSet = chatFull.emojiset) != null) {
            nk nkVar = this.f45046a1;
            if (nkVar == null || nkVar.getVisibility() != 0) {
                org.telegram.ui.Components.u40 u40Var = org.telegram.ui.Components.u40.f33223n;
                if (u40Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (groupStickerSetById = getMediaDataController().getGroupStickerSetById(stickerSet)) != null && !groupStickerSetById.documents.isEmpty()) {
                        j10 = groupStickerSetById.documents.get(0).f22034id;
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
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.K1.s(AndroidUtilities.replaceCharSequence("%s", LocaleController.getString(R.string.GroupEmojiPackHint), spannableStringBuilder));
                        fi.v3 v3Var3 = this.K1;
                        v3Var3.h = fi.v3.a(v3Var3.getText(), this.K1.getTextPaint());
                        fi.v3 v3Var4 = this.K1;
                        v3Var4.d = -1L;
                        v3Var4.setPadding(AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f), 0);
                        AndroidUtilities.runOnUIThread(new wh(this, 0), 300L);
                    }
                }
            }
        }
    }

    public final void Y7() {
        int i10;
        if (this.f45089d2 == null && getParentActivity() != null) {
            if (this.J2 == null) {
                T7();
            }
            org.telegram.ui.Components.f41 f41Var = new org.telegram.ui.Components.f41(getParentActivity(), this, this.currentAccount, a(), getResourceProvider());
            this.f45089d2 = f41Var;
            f41Var.O = new le(this, 5);
            f41Var.setSideMenuBackgroundDrawable(this.J.c(f41Var, gh.c.p(this.f45309ua), false));
            org.telegram.ui.Components.f41 f41Var2 = this.f45089d2;
            f41Var2.setTopMenuBackgroundDrawable(this.J.c(f41Var2, gh.c.p(this.f45309ua), false));
            this.f45089d2.setCurrentTopic(b());
            this.f45089d2.setOnNewTopicSelected(new le(this, 6));
            this.f45089d2.setOnTopicSelected(new xe(this, 0));
            this.f45089d2.setOnDialogSelected(new xe(this, 1));
            int indexOfChild = this.f45163j1.indexOfChild(this.X);
            if (indexOfChild >= 0) {
                i10 = indexOfChild + 1;
            } else {
                i10 = 8;
            }
            this.f45163j1.addView(this.f45089d2, i10, org.telegram.ui.Components.kb1.j(-1.0f, 51, 0, -AndroidUtilities.dp(5.0f), 0, 0));
            this.f45089d2.o();
            bk bkVar = this.U1;
            if (bkVar != null) {
                bkVar.bringToFront();
            }
        }
    }

    public final int Y8(View view) {
        FileLog.d("getScrollingOffsetForView view=" + view + " results in {" + ((this.f45339x0.getMeasuredHeight() - view.getBottom()) - this.f45339x0.getPaddingBottom()) + "} chatHeight=" + this.f45339x0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f45339x0.getPaddingBottom());
        return (this.f45339x0.getMeasuredHeight() - view.getBottom()) - this.f45339x0.getPaddingBottom();
    }

    public final void Y9(MessageObject messageObject) {
        if (messageObject != null && messageObject.isSponsored() && !messageObject.viewsReloaded) {
            messageObject.viewsReloaded = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = messageObject.sponsoredId;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().markSponsoredAsRead(this.f45168j6, messageObject);
        }
    }

    public final void Ya() {
        this.Yb = null;
        this.Wb = 0;
        this.Xb = -1;
        this.Zb = null;
        this.f45056ac = null;
        this.f45313v1.d(false);
    }

    public final void Yb() {
        TLRPC.ChatFull chatFull = this.f45245p8;
        if (chatFull != null && !this.G5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                AndroidUtilities.runOnUIThread(new le(this, 16), 1000L);
            }
        }
    }

    public final void Yc() {
        V7();
        String str = this.G3;
        if (str != null) {
            this.f45239p2.e.setText(LocaleController.formatString(R.string.HashtagSearchEmptyViewFilteredSubtitle, str));
            this.X3.setEmptyView(this.f45239p2);
            return;
        }
        this.X3.setEmptyView(null);
        this.f45239p2.setVisibility(8);
    }

    public final void Z6() {
        ArrayList arrayList;
        int i10;
        if (this.f45136gb) {
            int i11 = -1;
            int i12 = 0;
            long j10 = 0;
            while (true) {
                arrayList = this.K6;
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

    public final void Z7() {
        if (this.K3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f45309ua);
            this.K3 = undoView;
            undoView.setAdditionalTranslationY(AndroidUtilities.dp(51.0f));
            this.f45163j1.addView(this.K3, org.telegram.ui.Components.kb1.h(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final on Z8() {
        if (this.Oc == null) {
            this.Oc = new on(this);
        }
        return this.Oc;
    }

    public final boolean Z9() {
        MessageObject playingMessageObject;
        org.telegram.ui.Components.g6 g6Var;
        MessageObject messageObject;
        ImageReceiver photoImage;
        org.telegram.ui.Components.g6 animation;
        boolean z10;
        org.telegram.ui.Cells.s1 messageCell;
        boolean z11;
        if (this.f45339x0 != null && ((playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) == null || playingMessageObject.isVideo())) {
            org.telegram.ui.Components.t40 t40Var = this.F2;
            ArrayList<MessageObject> arrayList = null;
            if (t40Var != null && t40Var.getTag() != null && (messageCell = this.F2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                g6Var = photoImage2.getAnimation();
                if (g6Var != null) {
                    messageObject = messageCell.getMessageObject();
                    if (photoImage2.getImageY2() + messageCell.getTop() > this.f45339x0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.N8 = z11;
                } else {
                    messageObject = null;
                }
            } else {
                g6Var = null;
                messageObject = null;
            }
            if (messageObject == null) {
                int childCount = this.f45339x0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f45339x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        MessageObject messageObject2 = s1Var.getMessageObject();
                        boolean isRoundVideo = messageObject2.isRoundVideo();
                        if (!messageObject2.isRoundOnce() && !messageObject2.isVoiceOnce() && ((messageObject2.isVideo() || isRoundVideo) && messageObject2.videoEditedInfo == null && (animation = (photoImage = s1Var.getPhotoImage()).getAnimation()) != null)) {
                            float imageY = photoImage.getImageY() + childAt.getTop();
                            float imageHeight = photoImage.getImageHeight() + imageY;
                            if (imageHeight >= 0.0f && imageY <= this.f45339x0.getMeasuredHeight()) {
                                if (messageObject != null && imageY < 0.0f) {
                                    break;
                                }
                                if (imageY >= 0.0f && imageHeight <= this.f45339x0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.N8 = z10;
                                if (imageY >= 0.0f && imageHeight <= this.f45339x0.getMeasuredHeight()) {
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
                u9(true);
                if (messageObject.isRoundVideo()) {
                    boolean playMessage = MediaController.getInstance().playMessage(messageObject);
                    MediaController mediaController = MediaController.getInstance();
                    if (playMessage) {
                        arrayList = a8(messageObject, false);
                    }
                    mediaController.setVoiceMessagesPlaylist(arrayList, false);
                    return playMessage;
                }
                SharedConfig.setNoSoundHintShowed(true);
                messageObject.audioProgress = g6Var.n();
                messageObject.audioProgressMs = g6Var.o();
                g6Var.stop();
                if (PhotoViewer.O1(messageObject)) {
                    PhotoViewer.f35631b9.Q0();
                }
                return MediaController.getInstance().playMessage(messageObject);
            }
        }
        return false;
    }

    public final void Za(org.telegram.ui.Cells.s1 r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.Za(org.telegram.ui.Cells.s1):void");
    }

    public final void Zb(MessageObject messageObject, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.qc G = org.telegram.ui.Components.wc.b0(this).G(R.raw.chats_infotip, 9999, charSequence);
        G.f31861j = max;
        G.f31873w = new ze(this, i10, 3);
        G.k(true);
        this.S3 = messageObject;
        this.T3 = i10;
    }

    public final void Zc() {
        boolean z10;
        if (this.f45313v1 == null) {
            return;
        }
        if ((!getMediaDataController().searchResultMessages.isEmpty() && this.E3 && !this.D3) || (this.f45091d4 == 7 && this.f45048a4 == 2 && !this.K6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f45313v1.e(6, z10, true);
        this.f45313v1.e(5, z10, true);
        if (z10) {
            this.f45313v1.e(1, false, true);
        }
        if (!z10) {
            this.R7 = 0;
        }
        this.f45163j1.invalidate();
    }

    public long a() {
        return this.f45168j6;
    }

    public final void a7(boolean z10) {
        ig.n1 n1Var;
        if (this.f45048a4 == 2 && (n1Var = this.Y3) != null) {
            String str = this.G3;
            fi.ua uaVar = n1Var.E;
            if (!TextUtils.equals(n1Var.f14186x, str)) {
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
                di.t6 t6Var = n1Var.f14187y;
                if (t6Var != null && t6Var.I != 0) {
                    ConnectionsManager.getInstance(t6Var.f9489c).cancelRequest(t6Var.I, true);
                    t6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    n1Var.f14186x = str;
                    n1Var.f14187y = new di.t6(n1Var.f14183r, str2, trim);
                    if (z10) {
                        uaVar.run();
                    } else {
                        AndroidUtilities.runOnUIThread(uaVar, 1000L);
                    }
                }
                di.t6 t6Var2 = n1Var.f14187y;
                if (t6Var2 != null && t6Var2.J > 0) {
                    n1Var.l();
                }
            }
        }
    }

    public final ArrayList a8(MessageObject messageObject, boolean z10) {
        ArrayList l4 = org.telegram.messenger.t.l(messageObject);
        int id2 = messageObject.getId();
        messageObject.getDialogId();
        if (id2 != 0) {
            ArrayList arrayList = this.K6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                MessageObject messageObject2 = (MessageObject) arrayList.get(size);
                if ((messageObject2.getDialogId() != this.f45065b7 || messageObject.getDialogId() == this.f45065b7) && (((this.h == null && messageObject2.getId() > id2) || (this.h != null && messageObject2.getId() < id2)) && ((messageObject2.isVoice() || messageObject2.isRoundVideo()) && !messageObject2.isVoiceOnce() && !messageObject2.isRoundOnce() && (!z10 || (messageObject2.isContentUnread() && !messageObject2.isOut()))))) {
                    l4.add(messageObject2);
                }
            }
        }
        return l4;
    }

    public final long a9() {
        MessageObject messageObject;
        TLRPC.Message message;
        MessageObject messageObject2;
        TLRPC.Message message2;
        if (!ChatObject.isMonoForum(this.e) || !ChatObject.canManageMonoForum(this.currentAccount, this.e)) {
            return 0L;
        }
        long j10 = this.f45241p4;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (messageObject2 = this.F5) != null && (message2 = messageObject2.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message2.saved_peer_id);
        }
        if (i10 == 0 && (messageObject = this.D5) != null && (message = messageObject.messageOwner) != null) {
            return DialogObject.getPeerDialogId(message.saved_peer_id);
        }
        return j10;
    }

    public final void aa(MessageObject messageObject) {
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
        if (indexOf > 0 && !(r2Var instanceof wn) && !(r2Var instanceof ProfileActivity) && this.e.creator) {
            int size = j5Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) j5Var2.getFragmentStack().get(indexOf);
                if (r2Var2 instanceof wn) {
                    ((ActionBarLayout) j5Var2).c(indexOf, new wn(a1.g.h(j10, "chat_id")));
                    r2Var2.removeSelfFromStack();
                } else if (r2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) j5Var2).c(indexOf, new ProfileActivity(a1.g.h(j10, "chat_id"), null));
                    r2Var2.removeSelfFromStack();
                } else if (r2Var2 instanceof oo) {
                    ((ActionBarLayout) j5Var2).c(indexOf, new oo(a1.g.h(j10, "chat_id")));
                    r2Var2.removeSelfFromStack();
                } else if (r2Var2 instanceof mr) {
                    if (((mr) r2Var2).f41512d1 == 0) {
                        Bundle arguments = r2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) j5Var2).c(indexOf, new mr(arguments));
                    }
                    r2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            AndroidUtilities.runOnUIThread(new m4.v0(this, r2Var, messageObject, j5Var2, 12));
        }
        AndroidUtilities.runOnUIThread(new ag.o0(this, j10, 2), 1000L);
    }

    public final void ab() {
        org.telegram.ui.Components.vc0 i10;
        un unVar = this.f45309ua;
        if (unVar != null) {
            Drawable l4 = unVar.l();
            if (this.fragmentView != null) {
                l4 = this.f45163j1.getBackgroundImage();
            }
            if (l4 instanceof zn) {
                l4 = ((zn) l4).c(true);
            }
            if (l4 instanceof org.telegram.ui.Components.vc0) {
                ((org.telegram.ui.Components.vc0) l4).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.l5) && (i10 = ((org.telegram.ui.ActionBar.l5) themedDrawable).i()) != null) {
                i10.w(false);
            }
        }
    }

    public final void ac(boolean z10) {
        boolean z11;
        lh.h hVar = this.f45313v1;
        if (hVar != null) {
            if (z10 && !ChatObject.isMonoForum(this.e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.R7 = 0;
            }
        }
    }

    public final void ad(String str) {
        if (this.f45091d4 == 7 && !TextUtils.equals(this.G3, str)) {
            V7();
            bc(true);
            this.G3 = str;
            this.F3 = str;
            a7(false);
            G7(true);
            this.f45094d7 = 0L;
            this.A7 = false;
            HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(this.f45048a4);
            this.Y3.l();
            this.X3.requestLayout();
            if (this.X3.getLayoutManager() != null) {
                this.X3.getLayoutManager().n0(0);
            }
            Yc();
            this.f45239p2.e(true, true);
            C8();
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23740xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23448i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23428h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23361da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23565oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23545na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23525ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23507la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23489ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23509lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23588pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23472jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23455id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23768z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.De));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23663tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xk));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23700ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23382ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23656t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23713w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gi));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23307af));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23474jf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23326be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23327bf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23696v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23677u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23584p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23564o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23488k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23524m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23452i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23469j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23302a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23737xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Xa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23433ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23416ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23397fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23380ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23643se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23623re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23698vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23473je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23680uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23304ab));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23774zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23756yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23773zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23699vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23738xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23719wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23681ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23697vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23679ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23642sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23660tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23622rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23526mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23508lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23604qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23586pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23546nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23566ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23528md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23510ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23568od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23640sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23548nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23492kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23620rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23602qb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23436hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23418gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23434hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23364dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23417gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23345cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23325bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23398fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23362db));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23718wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Lc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23601qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23616r7));
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
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23755yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Sa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23661tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23641sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.La));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23435hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23399fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23381ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23527mc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23491kc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23471jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Ba));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Aa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23363dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23619ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23563o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23543n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23523m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23505l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23487k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23468j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23451i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23567oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23657t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23585pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23637s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.y6.f23695v8));
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
        if (!this.f45290t4 && (i10 = this.f45091d4) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f45241p4;
    }

    public final void b7() {
        this.S.d();
        Nc();
        xc();
        v7();
        s7();
        x7();
        w7();
        A7();
        B9();
        boolean z10 = true;
        if (this.v.f47660s == 1) {
            z10 = false;
        }
        if (this.f45322vb != z10) {
            this.f45322vb = z10;
            checkSystemBarColors();
        }
    }

    public final void b8(final int i10, final int i11, final boolean z10) {
        this.A0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.K6;
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
        rj rjVar = this.f45339x0;
        if (rjVar != null) {
            rjVar.setEmptyView(null);
        }
        if (this.A0.M.isEmpty()) {
            fc(true);
        }
        hm hmVar = this.A0;
        hmVar.L = true;
        hmVar.O(true);
        Z7();
        UndoView undoView = this.K3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f45168j6, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                wn wnVar = wn.this;
                MessagesController messagesController = wnVar.getMessagesController();
                long j11 = wnVar.f45168j6;
                if (ChatObject.isChannel(wnVar.e)) {
                    j10 = wnVar.f45168j6;
                } else {
                    j10 = 0;
                }
                messagesController.deleteMessagesRange(j11, j10, i10, i11, z10, new ig(wnVar, 20));
            }
        }, new ig(this, 1));
    }

    public final int b9() {
        return this.f45163j1.getBackgroundSizeY();
    }

    public final void ba(boolean z10) {
        int i10;
        if (this.f45339x0 != null) {
            ArrayList arrayList = this.K6;
            if (!arrayList.isEmpty() && !this.Ma.f38956n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((MessageObject) arrayList.get(i10)).isSponsored()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.f45364z0.h1(i10, 0);
                this.f45339x0.C0();
            }
        }
    }

    public final void bb() {
        boolean z10;
        MessageObject messageObject;
        CharSequence charSequence;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        nk nkVar;
        jk jkVar = this.Y;
        if (jkVar != null && jkVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f45179k5 && jkVar != null && (nkVar = this.f45046a1) != null && nkVar.getVisibility() != 0) {
            messageObject = this.D5;
            charSequence = AndroidUtilities.getTrimmedString(this.Y.getDraftMessage());
            z10 = this.Y.Y2;
        } else {
            z10 = true;
            messageObject = null;
            charSequence = null;
        }
        if (this.C5) {
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
        long K7 = K7(messageObject);
        TLRPC.DraftMessage draft = getMediaDataController().getDraft(this.f45168j6, K7);
        if (draft != null) {
            richMessage = draft.rich_message;
        } else {
            richMessage = null;
        }
        MediaDataController mediaDataController2 = getMediaDataController();
        long j11 = this.f45168j6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (messageObject != null && !messageObject.isTopicMainMessage && messageObject.replyToForumTopic == null && !this.C5) {
            message = messageObject.messageOwner;
        } else {
            message = null;
        }
        mn mnVar = this.B5;
        MessageSuggestionParams messageSuggestionParams = this.f45330w5;
        if (messageSuggestionParams != null) {
            suggestedPost = messageSuggestionParams.toTl();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        jk jkVar2 = this.Y;
        if (jkVar2 != null) {
            j10 = jkVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.saveDraft(j11, K7, charSequence2, entities, message, mnVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void bc(boolean z10) {
        int i10;
        if (this.W3 != null) {
            oe.b bVar = this.Zc;
            if (bVar.f19326f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.f45091d4 == 7) {
                    s4.c0 c0Var = (s4.c0) this.X3.getLayoutManager();
                    Object E = this.Y3.E((c0Var.N0() + c0Var.L0()) / 2);
                    Object E2 = this.Y3.E(c0Var.L0());
                    Object E3 = this.Y3.E(c0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.A0.L();
                        int L0 = this.f45364z0.L0();
                        int N0 = this.f45364z0.N0();
                        int i11 = ((MessageObject) E).messageOwner.f22049id;
                        int i12 = ((MessageObject) E2).messageOwner.f22049id;
                        int i13 = ((MessageObject) E3).messageOwner.f22049id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((MessageObject) L.get(i15)).messageOwner.f22049id == i12) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f22049id == i13) {
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
                            if (((MessageObject) L.get(i15)).messageOwner.f22049id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.f45364z0.h1(this.A0.J + i14, (this.f45339x0.getHeight() - M8((MessageObject) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.s6 s6Var = this.f45140h3;
                if (s6Var != null) {
                    if (bVar.f19326f) {
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
                tl tlVar = this.N1;
                if (tlVar != null && tlVar.V) {
                    tlVar.e(true);
                }
                jk jkVar = this.Y;
                if (jkVar != null) {
                    jkVar.h0();
                }
                Xc();
            }
        }
    }

    public final void bd() {
        jk jkVar;
        if (this.R != null) {
            this.E0.setBackground(null);
            this.E0.setOnClickListener(null);
            boolean z10 = true;
            if (this.f45091d4 == 3 && V8() == 2666000) {
                this.E0.setText(LocaleController.getString(R.string.AuthorHiddenDescription));
                this.R.setVisibility(0);
                this.U1.setVisibility(8);
                this.U1.setTag(null);
                Jc();
                org.telegram.ui.Components.uz0 uz0Var = this.f45238p1;
                if (uz0Var != null) {
                    uz0Var.f();
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
                                arVar.f26642f = dp2;
                                int dp3 = AndroidUtilities.dp(14.0f);
                                int dp4 = AndroidUtilities.dp(14.0f);
                                arVar.h = dp3;
                                arVar.f26643n = dp4;
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.t.h(R.string.BoostingBoostToSendMessages, new StringBuilder("d ")));
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.p10(i10, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                                spannableStringBuilder.setSpan(new ImageSpan(arVar, 1), 0, 1, 33);
                                TextView textView = this.E0;
                                int i11 = org.telegram.ui.ActionBar.y6.f23449i6;
                                org.telegram.ui.ActionBar.f7.R(textView, org.telegram.ui.ActionBar.y6.h0(0, org.telegram.ui.ActionBar.y6.x0(null, i11, false)), null, org.telegram.ui.ActionBar.f7.N(i11), null);
                                this.E0.setText(spannableStringBuilder);
                                this.E0.setOnClickListener(new we(this, 0));
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
                        Jc();
                        org.telegram.ui.Components.uz0 uz0Var2 = this.f45238p1;
                        if (uz0Var2 != null) {
                            uz0Var2.f();
                        }
                    }
                }
                P7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.f45175k1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionProcessing));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        this.E0.setText(AndroidUtilities.replaceTags(LocaleController.formatString("AwaitingEncryption", R.string.AwaitingEncryption, a1.g.s(new StringBuilder("<b>"), this.f45113f.first_name, "</b>"))));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.E0.setText(LocaleController.getString(R.string.EncryptionRejected));
                        this.R.setVisibility(0);
                        this.Y.setVisibility(4);
                        this.Y.setFieldText("");
                        getMediaDataController().cleanDraft(this.f45168j6, this.f45241p4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.R.setVisibility(4);
                            if (!this.inPreviewMode && !this.f45124fb && this.f45091d4 != 3) {
                                this.Y.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    f7();
                    P6(false);
                } else {
                    this.R.setVisibility(4);
                    if (this.f45238p1 != null && (jkVar = this.Y) != null && jkVar.g0()) {
                        this.f45238p1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.R.setVisibility(4);
            }
            if (z10) {
                this.Y.i0(false);
                if (getParentActivity() != null) {
                    AndroidUtilities.hideKeyboard(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final boolean c() {
        if (this.f45091d4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        TLRPC.Chat chat;
        long j10 = getArguments().getInt("search_from_user_id", 0);
        if (j10 != 0) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user != null) {
                ya("");
                ImageView imageView = this.f45117f3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                mb(null, user);
                return;
            }
            return;
        }
        long j11 = getArguments().getInt("search_from_chat_id", 0);
        if (j11 != 0 && (chat = getMessagesController().getChat(Long.valueOf(j11))) != null) {
            ya("");
            ImageView imageView2 = this.f45117f3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            mb(chat, null);
        }
    }

    public final void c8(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject, CharacterStyle characterStyle, String str) {
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
        org.telegram.ui.Components.l80 I = org.telegram.ui.Components.l80.I(this, s1Var);
        org.telegram.ui.Components.in0 in0Var = new org.telegram.ui.Components.in0(getParentActivity(), this.f45309ua);
        I.f30163p = new re(in0Var, 0);
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
        in0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            in0Var.f(s1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.a71) {
            String url = ((org.telegram.ui.Components.a71) characterStyle2).getURL();
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
            in0Var.f(s1Var2, characterStyle2, spannableString2, false);
        } else {
            in0Var.f(s1Var2, characterStyle2, null, false);
        }
        showDialog(in0Var);
    }

    public final float c9(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.f45163j1.getBackgroundTranslationY()) - ((1.0f - this.N9) * this.I9);
    }

    public final boolean ca() {
        jk jkVar = this.Y;
        boolean z10 = jkVar.f25994z2;
        if (z10) {
            jkVar.o1();
            this.P3 = true;
        }
        AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.ke keVar;
        if ((this.f45091d4 != 5 || (!this.K6.isEmpty() && this.f45241p4 != 0)) && !this.Zc.f19326f && this.D9) {
            jk jkVar = this.Y;
            if (!jkVar.F2) {
                if (!jkVar.f25861c1 || (keVar = jkVar.f25873e1) == null || keVar.getVisibility() != 0) {
                    if ((!jkVar.f0() || !jkVar.f25915l0.v) && !org.telegram.ui.ActionBar.r2.hasSheets(jkVar.P2) && this.f45097da == 0.0f) {
                        wh.i iVar = this.f45221na;
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
        org.telegram.ui.Cells.s1 s1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f45339x0.getChildCount(); i11++) {
            View childAt = this.f45339x0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.s1) {
                org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) childAt;
                int min = Math.min(s1Var2.getBottom(), this.f45339x0.getHeight()) - Math.max(0, s1Var2.getTop());
                if (min > i10) {
                    s1Var = s1Var2;
                    i10 = min;
                }
            }
        }
        if (s1Var != null) {
            uj ujVar = this.f45364z0;
            this.f45339x0.getClass();
            ujVar.i1(RecyclerView.R(s1Var), s1Var.getTop() - ((int) this.I9), false);
        }
    }

    public final void cc(TLRPC.TL_game tL_game, MessageObject messageObject, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f45309ua);
            String string = LocaleController.getString(R.string.AppName);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
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
                    presentFragment(new pi1(str, str2, tL_game.title, tL_game.short_name, messageObject));
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
        pi1.W(str, messageObject, parentActivity, str6, str3);
    }

    public final void cd() {
        boolean z10;
        int i10;
        int i11;
        MessageObject.GroupedMessagePosition groupedMessagePosition;
        int i12 = (a() > getUserConfig().getClientUserId() ? 1 : (a() == getUserConfig().getClientUserId() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f45203m6;
        if (i12 == 0) {
            ArrayList<MessageObject> arrayList = new ArrayList<>();
            for (int i13 = 0; i13 < sparseArrayArr.length; i13++) {
                for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                    MessageObject messageObject = (MessageObject) sparseArrayArr[i13].valueAt(i14);
                    if (messageObject.hasValidGroupId()) {
                        MessageObject.GroupedMessages k92 = k9(messageObject);
                        if (k92 != null) {
                            groupedMessagePosition = k92.getPosition(messageObject);
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
            zk zkVar = this.Ab;
            if (zkVar != null) {
                zkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.Ab.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                zk zkVar2 = this.Ab;
                if (isEmpty) {
                    i11 = R.string.SavedTagReactionsSelectedAddHint;
                } else {
                    i11 = R.string.SavedTagReactionsSelectedEditHint;
                }
                zkVar2.setHint(LocaleController.getString(i11));
                AndroidUtilities.runOnUIThread(new le(this, 12), 120L);
            } else {
                z10 = !org.telegram.ui.Components.gl0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.w0 j10 = this.actionBar.i(null).j(28);
            if (j10 != null) {
                if (z10) {
                    i10 = R.drawable.menu_tag_edit;
                } else {
                    i10 = R.drawable.menu_tag_plus;
                }
                org.telegram.ui.Components.bk0 bk0Var = j10.f23205x;
                if (bk0Var != null && j10.f23206y != i10) {
                    j10.f23206y = i10;
                    AndroidUtilities.updateImageViewImageAnimated(bk0Var, i10);
                }
            }
        }
        if (this.f45234oa != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                arrayList2.add((MessageObject) sparseArray.valueAt(i15));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                arrayList2.add((MessageObject) sparseArray2.valueAt(i16));
            }
            this.f45234oa.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(messageMedia, this.f45168j6, this.D5, this.f45166j4, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i11, 0);
        of2.sendMessageChatArguments = O8();
        of2.payStars = j10;
        of2.monoForumPeer = a9();
        of2.suggestionParams = this.f45330w5;
        getSendMessagesHelper().sendMessage(of2);
        if (this.f45091d4 == 0) {
            ba(false);
        }
        if (i10 == 0 || i10 == 1) {
            E6();
        }
        if (this.G5) {
            this.f45132g6 = true;
        }
    }

    public final void d7() {
        MessageObject messageObject;
        if (!this.P4 && (messageObject = this.Z7) != null) {
            if (this.K6.indexOf(messageObject) >= 0) {
                this.Q4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.O4 != null) {
        } else {
            jf jfVar = new jf(this, 24);
            this.O4 = jfVar;
            AndroidUtilities.runOnUIThread(jfVar);
        }
    }

    public final void d8(android.text.style.CharacterStyle r18, boolean r19, org.telegram.messenger.MessageObject r20, org.telegram.ui.Cells.s1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.d8(android.text.style.CharacterStyle, boolean, org.telegram.messenger.MessageObject, org.telegram.ui.Cells.s1):void");
    }

    public final float d9() {
        org.telegram.ui.Components.f41 f41Var = this.f45089d2;
        if (f41Var != null) {
            return f41Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void db(org.telegram.messenger.MessageObject r7) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.db(org.telegram.messenger.MessageObject):void");
    }

    public final void dc(boolean z10) {
        if (z10) {
            if (this.f45085cc == null) {
                le leVar = new le(this, 11);
                this.f45085cc = leVar;
                AndroidUtilities.runOnUIThread(leVar, 100L);
                return;
            }
            return;
        }
        le leVar2 = this.f45085cc;
        if (leVar2 != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar2);
        }
        this.f45085cc = null;
        this.f45070bc = false;
        Oc(true);
    }

    public final void dd(boolean z10, boolean z11) {
        boolean z12;
        MessageObject playingMessageObject;
        org.telegram.ui.Wallet.k3 k3Var;
        if (this.fragmentView != null && !this.G5) {
            int childCount = this.f45339x0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f45339x0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.v0) {
                        org.telegram.ui.Cells.v0 v0Var = (org.telegram.ui.Cells.v0) childAt;
                        MessageObject messageObject = v0Var.getMessageObject();
                        if (this.f45066b8 != Integer.MAX_VALUE && messageObject != null && messageObject.getId() == this.f45066b8 && v0Var.L()) {
                            org.telegram.ui.Wallet.m3 m3Var = v0Var.I0;
                            if (!m3Var.f36904h0 && (m3Var.f36899e0 == 0 || (k3Var = m3Var.f36898d0) == null || k3Var.c())) {
                                m3Var.e();
                                org.telegram.ui.Wallet.k3 k3Var2 = m3Var.f36898d0;
                                k3Var2.getClass();
                                k3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.k3 k3Var3 = m3Var.f36898d0;
                                k3Var3.f27787b = -1L;
                                k3Var3.f27788c = -1L;
                                m3Var.f36899e0 = SystemClock.elapsedRealtime();
                                m3Var.f36901f0 = false;
                                m3Var.f36892a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        MessageObject messageObject2 = s1Var.getMessageObject();
                        if (this.J8 != null && ((messageObject2.isRoundVideo() || messageObject2.isVideo()) && !messageObject2.isVoiceTranscriptionOpen() && MediaController.getInstance().isPlayingMessage(messageObject2))) {
                            ImageReceiver photoImage = s1Var.getPhotoImage();
                            this.J8.setTranslationX(s1Var.getX() + photoImage.getImageX());
                            this.J8.setTranslationY((this.f45339x0.getY() + (photoImage.getImageY() + (s1Var.getY() + s1Var.getPaddingTop()))) - this.J8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.J8.getLayoutParams();
                            if (messageObject2.isRoundVideo()) {
                                this.J8.setTag(R.id.parent_tag, null);
                                if (layoutParams.width != AndroidUtilities.roundPlayingMessageSize(O9()) || layoutParams.height != AndroidUtilities.roundPlayingMessageSize(O9())) {
                                    int roundPlayingMessageSize = AndroidUtilities.roundPlayingMessageSize(O9());
                                    layoutParams.height = roundPlayingMessageSize;
                                    layoutParams.width = roundPlayingMessageSize;
                                    this.L8.setResizeMode(0);
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                float roundPlayingMessageSize2 = ((AndroidUtilities.roundMessageInset * 2) + AndroidUtilities.roundPlayingMessageSize(O9())) / AndroidUtilities.roundPlayingMessageSize(O9());
                                float imageWidth = s1Var.getPhotoImage().getImageWidth() / AndroidUtilities.roundPlayingMessageSize(O9());
                                if (this.J8.getScaleX() != imageWidth) {
                                    this.J8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.J8.setPivotX(0.0f);
                                this.J8.setPivotY(0.0f);
                                this.J8.setScaleX(imageWidth);
                                this.J8.setScaleY(imageWidth);
                                this.M8.setScaleX(roundPlayingMessageSize2);
                                this.M8.setScaleY(roundPlayingMessageSize2);
                            } else {
                                this.J8.setTag(R.id.parent_tag, photoImage);
                                if (layoutParams.width != photoImage.getImageWidth() || layoutParams.height != photoImage.getImageHeight()) {
                                    this.L8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.getImageWidth();
                                    layoutParams.height = (int) photoImage.getImageHeight();
                                    this.J8.setLayoutParams(layoutParams);
                                }
                                this.M8.setScaleX(1.0f);
                                this.M8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.J8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.J8 != null && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.eventId == 0) {
                if (!z12) {
                    if (this.y3 && playingMessageObject.isVideo()) {
                        MediaController.getInstance().cleanupPlayer(true, true);
                        return;
                    }
                    this.J8.setTranslationY((-AndroidUtilities.roundPlayingMessageSize(O9())) - 100);
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
                    if (!playingMessageObject.isRoundVideo() && !this.N8) {
                        this.f45339x0.invalidate();
                    }
                }
            }
        }
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
        lj ljVar;
        jk jkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.ju editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.dz0 dz0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        jk jkVar2;
        wn wnVar = this;
        if (i10 == NotificationCenter.messagesDidLoad) {
            wnVar.l8(objArr);
            return;
        }
        if (i10 == NotificationCenter.invalidateMotionBackground) {
            rj rjVar = wnVar.f45339x0;
            if (rjVar != null) {
                rjVar.g1();
            }
            org.telegram.ui.Components.si siVar = wnVar.f45083ca;
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
                if (((Integer) objArr[0]).intValue() == wnVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        wnVar.finishFragment();
                        b.b(wnVar.currentAccount);
                    }
                }
            } else if (i10 == NotificationCenter.customStickerCreated) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                di.a3 a3Var = wnVar.V1;
                if (a3Var != null && a3Var.isShowing()) {
                    wnVar.V1.dismiss(true);
                }
                if (z11 && (jkVar2 = wnVar.Y) != null && jkVar2.p0()) {
                    wnVar.Y.i0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f22048id = stickerSet2.f22055id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = wnVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.dz0) && (tL_messages_stickerSet = (dz0Var = (org.telegram.ui.Components.dz0) dialog).S) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f22055id == stickerSet2.f22055id) {
                            dz0Var.F0((TLRPC.TL_messages_stickerSet) objArr[1]);
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
                                    org.telegram.ui.Components.wc wcVar = new org.telegram.ui.Components.wc(dz0Var.container, wnVar.resourceProvider);
                                    if (z12) {
                                        i12 = R.string.StickersStickerEditedInSetToast;
                                    } else {
                                        i12 = R.string.StickersStickerAddedToSetToast;
                                    }
                                    org.telegram.ui.Components.qc q5 = wcVar.q(document, LocaleController.formatString(i12, stickerSet2.title));
                                    q5.f31861j = 2750;
                                    q5.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.dz0 dz0Var2 = new org.telegram.ui.Components.dz0(wnVar.getParentActivity(), wnVar, tL_inputStickerSetID, null, wnVar.Y, wnVar.f45309ua);
                            final boolean z15 = z12;
                            wnVar = this;
                            dz0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    wn.o1(wn.this, objArr, dz0Var2, z15, stickerSet2);
                                }
                            });
                            wnVar.showDialog(dz0Var2);
                        }
                    }
                }
            } else if (i10 == NotificationCenter.emojiLoaded) {
                rj rjVar2 = wnVar.f45339x0;
                if (rjVar2 != null) {
                    rjVar2.g1();
                }
                TextView textView = wnVar.f45076c3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i14 = 0; i14 < 2; i14++) {
                    org.telegram.ui.ActionBar.b6 b6Var = wnVar.P2[i14];
                    if (b6Var != null) {
                        b6Var.invalidate();
                    }
                }
                bk bkVar = wnVar.U1;
                if (bkVar != null) {
                    bkVar.getListView().g1();
                }
                bi.r1 r1Var = wnVar.X3;
                if (r1Var != null) {
                    r1Var.g1();
                }
                UndoView undoView = wnVar.K3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                jk jkVar3 = wnVar.Y;
                if (jkVar3 != null && (editField = jkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                ln[] lnVarArr = wnVar.Q2;
                ln lnVar = lnVarArr[0];
                if (lnVar != null) {
                    lnVar.invalidate();
                }
                ln lnVar2 = lnVarArr[1];
                if (lnVar2 != null) {
                    lnVar2.invalidate();
                }
            } else if (i10 == NotificationCenter.didUpdateConnectionState) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == NotificationCenter.chatOnlineCountDidLoad) {
                Long l4 = (Long) objArr[0];
                if (wnVar.f45245p8 != null && (chat = wnVar.e) != null && chat.f22028id == l4.longValue()) {
                    wnVar.f45245p8.online_count = ((Integer) objArr[1]).intValue();
                    lj ljVar2 = wnVar.f45198m1;
                    if (ljVar2 != null) {
                        ljVar2.m();
                        wnVar.f45198m1.n(false);
                    }
                }
            } else if (i10 == NotificationCenter.updateDefaultSendAsPeer) {
                if (((Long) objArr[0]).longValue() == wnVar.f45168j6 && (jkVar = wnVar.Y) != null) {
                    jkVar.N1(false, true);
                }
            } else if (i10 == NotificationCenter.userIsPremiumBlockedUpadted) {
                jk jkVar4 = wnVar.Y;
                if (jkVar4 != null) {
                    jkVar4.O1();
                }
            } else if (i10 == NotificationCenter.updateInterfaces) {
                int intValue = ((Integer) objArr[0]).intValue();
                if ((MessagesController.UPDATE_MASK_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_NAME & intValue) != 0 || (MessagesController.UPDATE_MASK_EMOJI_STATUS & intValue) != 0) {
                    if (wnVar.e != null) {
                        TLRPC.Chat chat2 = wnVar.getMessagesController().getChat(Long.valueOf(wnVar.e.f22028id));
                        if (chat2 != null) {
                            wnVar.e = chat2;
                        }
                    } else if (wnVar.f45113f != null && (user = wnVar.getMessagesController().getUser(Long.valueOf(wnVar.f45113f.f22177id))) != null) {
                        wnVar.f45113f = user;
                    }
                    wnVar.ed(true);
                }
                if (!wnVar.R9() && ((MessagesController.UPDATE_MASK_CHAT_MEMBERS & intValue) != 0 || (MessagesController.UPDATE_MASK_STATUS & intValue) != 0)) {
                    if (wnVar.e != null && (ljVar = wnVar.f45198m1) != null) {
                        ljVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((MessagesController.UPDATE_MASK_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_CHAT_AVATAR & intValue) != 0 || (MessagesController.UPDATE_MASK_NAME & intValue) != 0) {
                    wnVar.p();
                    wnVar.nd(false);
                }
                if ((MessagesController.UPDATE_MASK_USER_PRINT & intValue) != 0) {
                    z10 = true;
                }
                if ((MessagesController.UPDATE_MASK_CHAT & intValue) != 0 && wnVar.e != null) {
                    wnVar.K9();
                    TLRPC.Chat chat3 = wnVar.getMessagesController().getChat(Long.valueOf(wnVar.e.f22028id));
                    if (chat3 != null) {
                        wnVar.e = chat3;
                        wnVar.K9();
                        z10 = !wnVar.R9();
                        wnVar.yc(false);
                        jk jkVar5 = wnVar.Y;
                        if (jkVar5 != null) {
                            jkVar5.X0(wnVar.currentAccount, wnVar.f45168j6);
                        }
                        FlagSecureReason flagSecureReason = wnVar.Q3;
                        if (flagSecureReason != null) {
                            flagSecureReason.invalidate();
                        }
                    }
                }
                lj ljVar3 = wnVar.f45198m1;
                if (ljVar3 != null && z10) {
                    ljVar3.n(true);
                }
                if ((intValue & (MessagesController.UPDATE_MASK_USER_PHONE | MessagesController.UPDATE_MASK_AVATAR)) != 0) {
                    wnVar.hd(true);
                }
                org.telegram.ui.ActionBar.w0 w0Var = wnVar.f45137h0;
                if (w0Var != null) {
                    if (ChatObject.isChannel(wnVar.e) && !ChatObject.isMonoForum(wnVar.e)) {
                        long j11 = wnVar.e.linked_monoforum_id;
                        if (j11 != 0 && ChatObject.canManageMonoForum(wnVar.currentAccount, -j11)) {
                            z13 = true;
                        }
                    }
                    w0Var.Q(70, z13);
                }
            } else if (i10 == NotificationCenter.didReceiveNewMessages) {
                FileLog.d("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!wnVar.f45124fb) {
                    if (longValue == wnVar.f45168j6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i15 = wnVar.f45091d4;
                        if (intValue2 != i15 && i15 != 3 && i15 != 8) {
                            if (i15 != 1 && intValue2 == 1 && !wnVar.isPaused && LaunchActivity.U() == wnVar && wnVar.f45317v5 == null && !arrayList.isEmpty() && ((MessageObject) arrayList.get(0)).getId() < 0) {
                                int id2 = ((MessageObject) arrayList.get(0)).getId();
                                if (((MessageObject) arrayList.get(0)).messageOwner != null && ((MessageObject) arrayList.get(0)).messageOwner.video_processing_pending) {
                                    z14 = true;
                                }
                                wnVar.wa(id2, z14);
                            }
                            FileLog.d("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !wnVar.Rc && wnVar.f45113f != null && wnVar.a() != wnVar.getUserConfig().getClientUserId() && (userFull = wnVar.getMessagesController().getUserFull(wnVar.f45113f.f22177id)) != null && userFull.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i13 >= size) {
                                        break;
                                    }
                                    MessageObject messageObject3 = (MessageObject) arrayList.get(i13);
                                    if (messageObject3.getId() > 0 && !messageObject3.isOut() && !messageObject3.isSponsored()) {
                                        wnVar.Rc = true;
                                        wnVar.getMessagesController().loadFullUser(wnVar.f45113f, wnVar.classGuid, true);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            wnVar.La(arrayList, true);
                        }
                    } else if (ChatObject.isChannel(wnVar.e) && !wnVar.e.megagroup && (chatFull = wnVar.f45245p8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            MessageObject messageObject4 = (MessageObject) arrayList.get(i16);
                            if (messageObject4.isReply()) {
                                wnVar.L6.put(messageObject4.getId(), messageObject4);
                            }
                        }
                        wnVar.F7();
                    }
                    FileLog.d("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == NotificationCenter.didLoadSendAsPeers) {
                wnVar.V9(true);
            } else if (i10 == NotificationCenter.didLoadSponsoredMessages) {
                wnVar.z6();
            } else if (i10 == NotificationCenter.closeChats) {
                if (objArr != null && objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == wnVar.f45168j6) {
                        wnVar.finishFragment();
                    }
                } else if (AndroidUtilities.isTablet() && (j5Var = wnVar.parentLayout) != null && j5Var.getFragmentStack().size() > 1) {
                    wnVar.finishFragment();
                } else {
                    wnVar.removeSelfFromStack(true);
                }
            } else if (i10 == NotificationCenter.closeChatActivity) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == wnVar.a() && (booleanValue2 || wnVar.parentLayout.getLastFragment() != wnVar)) {
                    if (wnVar.parentLayout.getLastFragment() == wnVar) {
                        wnVar.finishFragment();
                    } else {
                        wnVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i17 = NotificationCenter.commentsRead;
                SparseArray[] sparseArrayArr = wnVar.E6;
                if (i10 == i17) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat4 = wnVar.e;
                    if (chat4 != null && chat4.f22028id == longValue3 && (messageObject2 = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && messageObject2.hasReplies()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (wnVar.G5) {
                            th thVar = wnVar.f45368z4;
                            if (thVar != null) {
                                AndroidUtilities.cancelRunOnUIThread(thVar);
                                wnVar.f45368z4 = null;
                            }
                            messageObject2.messageOwner.replies.read_max_id = intValue3;
                        } else {
                            th thVar2 = new th(wnVar, messageObject2, intValue3);
                            wnVar.f45368z4 = thVar2;
                            AndroidUtilities.runOnUIThread(thVar2, 500L);
                        }
                    }
                } else if (i10 == NotificationCenter.changeRepliesCounter) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat5 = wnVar.e;
                    if (chat5 != null && chat5.f22028id == longValue4 && (messageObject = (MessageObject) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = messageObject.messageOwner.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer peer = wnVar.getMessagesController().getPeer(ChatObject.getSendAsPeerId(wnVar.e, wnVar.getMessagesController().getChatFull(wnVar.e.f22028id)));
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
                    if ((i10 == i19 || i10 == NotificationCenter.monoForumMessagesRead) && wnVar.f45168j6 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i19) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == NotificationCenter.monoForumMessagesRead) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = wnVar.f45241p4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i20 = wnVar.f45329w4;
                            ArrayList arrayList2 = wnVar.K6;
                            if (intValue4 > i20) {
                                wnVar.f45329w4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i21 = 0; i21 < size4; i21++) {
                                    MessageObject messageObject5 = (MessageObject) arrayList2.get(i21);
                                    int id3 = messageObject5.getId();
                                    if (!messageObject5.isOut() && id3 > 0 && id3 <= wnVar.f45329w4) {
                                        if (!messageObject5.isUnread()) {
                                            break;
                                        }
                                        messageObject5.setIsRead();
                                        hm hmVar = wnVar.A0;
                                        if (hmVar != null) {
                                            hmVar.M(messageObject5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > wnVar.f45343x4) {
                                wnVar.f45343x4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i22 = 0; i22 < size5; i22++) {
                                    MessageObject messageObject6 = (MessageObject) arrayList2.get(i22);
                                    int id4 = messageObject6.getId();
                                    if (messageObject6.isOut() && id4 > 0 && id4 <= wnVar.f45343x4) {
                                        if (!messageObject6.isUnread()) {
                                            break;
                                        }
                                        messageObject6.setIsRead();
                                        hm hmVar2 = wnVar.A0;
                                        if (hmVar2 != null) {
                                            hmVar2.R(messageObject6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        wnVar.g8(i10, objArr);
        wnVar.h8(i10, objArr);
        wnVar.i8(i10, objArr);
        wnVar.j8(i10, objArr);
        wnVar.k8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        di.a3 a3Var = this.V1;
        if (a3Var != null && this.visibleDialog == a3Var) {
            a3Var.f33002j0.b0(false);
            this.V1.dismissInternal();
            this.V1.f33002j0.e0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.V1 && dialog != this.f45269ra && !(dialog instanceof hi.m3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7(boolean z10) {
        if (this.D5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i10 < arrayList.size()) {
                    MessageObject messageObject = (MessageObject) arrayList.get(i10);
                    if (messageObject != null && messageObject.getId() == this.D5.getId() && messageObject.getDialogId() == this.D5.getDialogId()) {
                        this.D5 = messageObject;
                        mn mnVar = this.B5;
                        if (mnVar != null) {
                            mnVar.a(messageObject);
                        }
                        if (z10) {
                            MessagePreviewParams messagePreviewParams = this.f45317v5;
                            if (messagePreviewParams != null) {
                                MessageObject messageObject2 = this.D5;
                                MessageObject.GroupedMessages groupedMessages = this.f45369z5;
                                if (groupedMessages == null) {
                                    groupedMessages = K8(messageObject2.getGroupId());
                                }
                                messagePreviewParams.updateReply(messageObject2, groupedMessages, this.f45168j6, this.B5);
                            }
                            s8();
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

    public final void e8(org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, String str) {
        ui X9 = X9(s1Var, characterStyle);
        TLRPC.TL_contact tL_contact = getContactsController().contactsByPhone.get(kf.b.d(str, false));
        bi.b3 b3Var = new bi.b3(this, s1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(tL_contact.user_id));
            if (user != null) {
                b3Var.run(user);
                return;
            } else {
                getMessagesStorage().getStorageQueue().postRunnable(new q1(this, tL_contact, b3Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = kf.b.d(str, false);
        X9.f47069b = new ze(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new ea(this, X9, b3Var, 3)), 0);
        X9.d();
    }

    public final int e9() {
        return (int) (d9() * AndroidUtilities.dp(71.0f));
    }

    public final void eb(long j10) {
        uj ujVar;
        MessageObject messageObject;
        int Y8;
        int abs;
        rj rjVar = this.f45339x0;
        int i10 = -1;
        if (rjVar != null && (ujVar = this.f45364z0) != null && ujVar.f47752y < 0) {
            int i11 = 0;
            int i12 = Integer.MAX_VALUE;
            for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f45339x0.getChildAt(childCount);
                this.f45339x0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.s1) && (messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject()) != null && messageObject.getTopicId() == j10 && (abs = Math.abs((Y8 = Y8(childAt)))) < i12) {
                    i10 = messageObject.getId();
                    i11 = Y8;
                    i12 = abs;
                }
            }
            this.D7 = i10;
            this.E7 = i11;
            return;
        }
        this.D7 = -1;
    }

    public final void ec(boolean z10) {
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
                spannableString.setSpan(new org.telegram.ui.Components.r61(AndroidUtilities.bold()), 0, spannableString.length(), 33);
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
                    M.f31861j = 8000;
                    M.k(true);
                }
            }
        }
    }

    public final void ed(boolean z10) {
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        lj ljVar = this.f45198m1;
        if (ljVar == null) {
            return;
        }
        int i10 = this.f45091d4;
        if (i10 == 8 && (chat2 = this.e) != null) {
            if (this.f45118f4) {
                String i11 = pg.d.i(chat2, this.currentAccount, false);
                TLRPC.Chat chat3 = this.e;
                ljVar.h(i11, chat3.scam, chat3.fake, chat3.verified, false, null, z10);
            } else if (ChatObject.isMonoForum(chat2)) {
                int i12 = (this.f45241p4 > 0L ? 1 : (this.f45241p4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat4 = this.e;
                    if (chat4.linked_monoforum_id != 0) {
                        TLRPC.Chat chat5 = getMessagesController().getChat(Long.valueOf(this.e.linked_monoforum_id));
                        if (chat5 == null) {
                            chat5 = this.e;
                        }
                        this.f45198m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat5.title)), chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
                    } else {
                        lj ljVar2 = this.f45198m1;
                        String removeRTL = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat4.title));
                        TLRPC.Chat chat6 = this.e;
                        ljVar2.h(removeRTL, chat6.scam, chat6.fake, chat6.verified, false, chat6.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f45241p4));
                    this.f45198m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user))), user.scam, user.fake, user.verified, user.premium, user.emoji_status, z10);
                } else {
                    TLRPC.Chat chat7 = getMessagesController().getChat(Long.valueOf(-this.f45241p4));
                    if (chat7 == null) {
                        chat7 = this.e;
                    }
                    this.f45198m1.h(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat7.title)), chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                }
            } else {
                lj ljVar3 = this.f45198m1;
                String removeRTL2 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(this.e.title));
                TLRPC.Chat chat8 = this.e;
                ljVar3.h(removeRTL2, chat8.scam, chat8.fake, chat8.verified, false, chat8.emoji_status, z10);
            }
        } else if (i10 == 9) {
            ljVar.setTitle(LocaleController.getString(R.string.WelcomeMessage));
        } else if (i10 == 5) {
            if ("hello".equalsIgnoreCase(this.f45077c4)) {
                this.f45198m1.setTitle(LocaleController.getString(R.string.BusinessGreet));
            } else if ("away".equalsIgnoreCase(this.f45077c4)) {
                this.f45198m1.setTitle(LocaleController.getString(R.string.BusinessAway));
            } else {
                this.f45198m1.setTitle(this.f45077c4);
            }
        } else if (i10 == 6) {
            if (!TextUtils.isEmpty(this.f45062b4.title)) {
                this.f45198m1.setTitle(this.f45062b4.title);
            } else {
                this.f45198m1.setTitle(LocaleController.getString(R.string.BusinessLink));
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            TLRPC.User user2 = null;
            if (i10 == 3) {
                long j10 = this.f45241p4;
                if (j10 > 0) {
                    user2 = getMessagesController().getUser(Long.valueOf(j10));
                    chat = null;
                } else {
                    chat = getMessagesController().getChat(Long.valueOf(-j10));
                }
                if (UserObject.isReplyUser(user2)) {
                    this.f45198m1.setTitle(LocaleController.getString(R.string.RepliesTitle));
                } else if (UserObject.isAnonymous(user2)) {
                    this.f45198m1.setTitle(LocaleController.getString(R.string.AnonymousForward));
                } else if (UserObject.isUserSelf(user2)) {
                    this.f45198m1.setTitle(LocaleController.getString(R.string.MyNotes));
                } else if (user2 != null) {
                    this.f45198m1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(user2))));
                } else if (chat != null) {
                    this.f45198m1.setTitle(AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat.title)));
                } else {
                    this.f45198m1.setTitle("");
                }
            } else if (R9() && !UserObject.isBotForum(this.f45113f)) {
                if (this.f45290t4) {
                    jd();
                } else if (this.f45277s4) {
                    if (this.f45166j4.hasReplies()) {
                        this.f45198m1.setTitle(LocaleController.formatPluralString("Comments", this.f45166j4.getRepliesCount(), new Object[0]));
                    } else {
                        this.f45198m1.setTitle(LocaleController.getString(R.string.CommentsTitle));
                    }
                } else {
                    this.f45198m1.setTitle(LocaleController.formatPluralString("Replies", this.f45166j4.getRepliesCount(), new Object[0]));
                }
            } else if (UserObject.isReplyUser(this.f45113f)) {
                this.f45198m1.setTitle(LocaleController.getString(R.string.RepliesTitle));
            } else if (UserObject.isAnonymous(this.f45113f)) {
                this.f45198m1.setTitle(LocaleController.getString(R.string.AnonymousForward));
            } else {
                int i13 = this.f45091d4;
                if (i13 == 1) {
                    if (UserObject.isUserSelf(this.f45113f)) {
                        this.f45198m1.setTitle(LocaleController.getString(R.string.Reminders));
                    } else {
                        this.f45198m1.setTitle(LocaleController.getString(R.string.ScheduledMessages));
                    }
                } else if (i13 == 2) {
                    this.f45198m1.setTitle(LocaleController.formatPluralString("PinnedMessagesCount", T8(), new Object[0]));
                } else {
                    TLRPC.Chat chat9 = this.e;
                    if (chat9 != null) {
                        lj ljVar4 = this.f45198m1;
                        String removeRTL3 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(chat9.title));
                        TLRPC.Chat chat10 = this.e;
                        ljVar4.h(removeRTL3, chat10.scam, chat10.fake, chat10.verified, false, chat10.emoji_status, z10);
                    } else {
                        TLRPC.User user3 = this.f45113f;
                        if (user3 != null) {
                            if (user3.self) {
                                this.f45198m1.setTitle(LocaleController.getString(R.string.SavedMessages));
                            } else if (!MessagesController.isSupportUser(user3) && getContactsController().contactsDict.get(Long.valueOf(this.f45113f.f22177id)) == null && (getContactsController().contactsDict.size() != 0 || !getContactsController().isLoadingContacts())) {
                                if (!TextUtils.isEmpty(this.f45113f.phone)) {
                                    lj ljVar5 = this.f45198m1;
                                    String g7 = org.telegram.messenger.wh.g(new StringBuilder("+"), this.f45113f.phone, kf.b.c());
                                    TLRPC.User user4 = this.f45113f;
                                    ljVar5.h(g7, user4.scam, user4.fake, user4.verified, getMessagesController().isPremiumUser(this.f45113f), this.f45113f.emoji_status, z10);
                                } else {
                                    lj ljVar6 = this.f45198m1;
                                    String removeRTL4 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f45113f)));
                                    TLRPC.User user5 = this.f45113f;
                                    ljVar6.h(removeRTL4, user5.scam, user5.fake, user5.verified, getMessagesController().isPremiumUser(this.f45113f), this.f45113f.emoji_status, z10);
                                }
                            } else {
                                lj ljVar7 = this.f45198m1;
                                String removeRTL5 = AndroidUtilities.removeRTL(AndroidUtilities.removeDiacritics(UserObject.getUserName(this.f45113f)));
                                TLRPC.User user6 = this.f45113f;
                                boolean z11 = user6.scam;
                                boolean z12 = user6.fake;
                                boolean z13 = user6.verified;
                                boolean isPremiumUser = getMessagesController().isPremiumUser(this.f45113f);
                                if (!MessagesController.isSupportUser(this.f45113f)) {
                                    emojiStatus = this.f45113f.emoji_status;
                                }
                                ljVar7.h(removeRTL5, z11, z12, z13, isPremiumUser, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f45198m1.getTitleTextView().getText());
        gd(false);
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7() {
        nk nkVar;
        mk mkVar;
        mk mkVar2;
        jk jkVar = this.Y;
        if (jkVar != null && jkVar.f25995z3) {
            MediaController.getInstance().setAllowStartRecord(false);
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !ChatObject.canSendVoice(chat)) {
            MediaController.getInstance().setAllowStartRecord(false);
        } else if (!ApplicationLoader.mainInterfacePaused && (((nkVar = this.f45046a1) == null || nkVar.getVisibility() != 0) && (((mkVar = this.R) == null || mkVar.getVisibility() != 0) && ((mkVar2 = this.f45090d3) == null || mkVar2.getVisibility() != 0)))) {
            MediaController.getInstance().setAllowStartRecord(true);
        } else {
            MediaController.getInstance().setAllowStartRecord(false);
        }
    }

    public final void f8(org.telegram.ui.Cells.z r29, final org.telegram.tgnet.TLRPC.ReactionCount r30, boolean r31, float r32, float r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.f8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int f9(int i10) {
        SparseIntArray sparseIntArray = this.f45142h5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = f45037hd;
            f45037hd = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void fa() {
        S6(this.f45059b1, 5, true);
        S6(this.Y, 1, false);
        S6(this.f45090d3, 4, true);
        S6(this.f45046a1, 3, false);
        S6(this.R, 2, false);
        float f7 = this.Xc.e;
        k6.m mVar = this.f45086cd;
        float d = ic.a.d(1.0f, f7, 1.0f - ((float[]) mVar.f16423b)[5], 1.0f);
        lh.c cVar = this.f45059b1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(d);
        }
        jk jkVar = this.Y;
        if (jkVar != null) {
            jkVar.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        mk mkVar = this.f45090d3;
        if (mkVar != null) {
            mkVar.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        nk nkVar = this.f45046a1;
        if (nkVar != null) {
            nkVar.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        mk mkVar2 = this.R;
        if (mkVar2 != null) {
            mkVar2.setTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        jh.f fVar = this.S;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - d) * 255.0f));
            this.S.setInputBubbleTranslationY(AndroidUtilities.dp(54.0f) * d);
        }
        nk nkVar2 = this.f45046a1;
        oe.b bVar = this.Vc;
        if (nkVar2 != null) {
            nkVar2.setTotalVisibilityFactor((1.0f - bVar.e) * ((float[]) mVar.f16423b)[3]);
        }
        tp tpVar = this.f45123fa;
        if (tpVar != null) {
            float f10 = bVar.e;
            if (tpVar.S != f10) {
                tpVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        z7();
    }

    public final void fb() {
        int i10;
        int i11;
        rj rjVar = this.f45339x0;
        if (rjVar != null && this.f45364z0 != null) {
            for (int childCount = rjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f45339x0.getChildAt(childCount);
                this.f45339x0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        if (((org.telegram.ui.Cells.s1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = Y8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                        i10 = Y8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.f45364z0.h1(i11, i10);
        }
    }

    public final void fc(boolean z10) {
        if (this.P != null) {
            if (!AndroidUtilities.isTablet() && !this.f45277s4 && this.f45113f == null) {
                if (this.Ib == null) {
                    this.Ib = Boolean.valueOf(LiteMode.isEnabled(360928));
                }
                if (this.Ib.booleanValue()) {
                    this.Hb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.f45107e6 && SharedConfig.animationsEnabled()) {
                if (z10 == this.Hb) {
                    return;
                }
                this.Hb = z10;
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
                this.P.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new si(this, 3)).start();
                return;
            }
            this.Hb = z10;
            FrameLayout frameLayout = this.P;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void fd() {
        gd(false);
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.o1 o1Var = this.f45134g9;
        if (o1Var != null) {
            o1Var.e = false;
            J7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.e;
    }

    public final boolean g7(boolean z10, boolean z11) {
        jk jkVar = this.Y;
        if (jkVar == null || !jkVar.r0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f45309ua);
            if (this.Y.f25861c1) {
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DiscardVideoMessageTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.DiscardVideoMessageDescription);
            } else {
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.DiscardVoiceMessageTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.DiscardVoiceMessageDescription);
            }
            alertDialog$Builder.k(LocaleController.getString(R.string.DiscardVoiceMessageAction), new di.f(7, this, z11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Continue), null);
            showDialog(alertDialog$Builder.f22369a);
            return true;
        }
        return true;
    }

    public final void g8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.g8(int, java.lang.Object[]):void");
    }

    public final int g9(int i10) {
        SparseIntArray sparseIntArray = this.f45131g5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = f45037hd;
            f45037hd = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void ga(boolean z10, boolean z11) {
        if (this.P3) {
            AndroidUtilities.runOnUIThread(new le(this, 22), 200L);
            if (z11) {
                this.P3 = false;
            }
        }
        if (z10 && !this.f45124fb) {
            AndroidUtilities.requestAdjustResize(getParentActivity(), this.classGuid);
        }
    }

    public final boolean gb() {
        jk jkVar = this.Y;
        if (jkVar != null && jkVar.s0() && !this.Y.f25861c1 && !MediaController.getInstance().isRecordingPaused()) {
            this.f45202m5 = true;
            jk jkVar2 = this.Y;
            this.f45216n5 = jkVar2.O;
            this.f45229o5 = jkVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void gc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.BusinessRepliesRemoveTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.BusinessRepliesRemoveMessage);
        alertDialog$Builder.k(LocaleController.getString(R.string.Remove), new qe(this, 10));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        showDialog(alertDialog$Builder.f22369a);
    }

    public final void gd(boolean z10) {
        Drawable mutate;
        org.telegram.ui.ActionBar.u0 u0Var;
        if (this.f45198m1 != null) {
            int i10 = this.f45091d4;
            if (i10 == 0 || i10 == 8) {
                boolean isDialogMuted = getMessagesController().isDialogMuted(this.f45168j6, b());
                if (z10) {
                    isDialogMuted = !isDialogMuted;
                }
                Drawable drawable = null;
                this.O0 = null;
                if (!ChatObject.isHiddenInCommunity(this.currentAccount, this.e) && !ChatObject.isHiddenInCommunity(this.currentAccount, this.f45113f)) {
                    if (!UserObject.isReplyUser(this.f45113f) && ((!R9() || this.f45290t4) && isDialogMuted)) {
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
                        drawable = this.f45198m1.c(DialogObject.getBotVerificationIcon(chat));
                    } else {
                        TLRPC.User user = this.f45113f;
                        if (user != null && !UserObject.isUserSelf(user)) {
                            drawable = this.f45198m1.c(DialogObject.getBotVerificationIcon(this.f45113f));
                        }
                    }
                }
                this.f45198m1.j(drawable, mutate);
                if (!z10 && (u0Var = this.f45249q1) != null) {
                    if (isDialogMuted) {
                        if (u0Var.f23119m != 8) {
                            u0Var.f23119m = 8;
                            View view = u0Var.f23116j;
                            if (view instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view).getRightIcon().setVisibility(u0Var.f23119m);
                            }
                        }
                        this.f45249q1.d(LocaleController.getString(R.string.Unmute));
                        this.f45249q1.b(R.drawable.msg_mute);
                    } else {
                        if (u0Var.f23119m != 0) {
                            u0Var.f23119m = 0;
                            View view2 = u0Var.f23116j;
                            if (view2 instanceof org.telegram.ui.ActionBar.g1) {
                                ((org.telegram.ui.ActionBar.g1) view2).getRightIcon().setVisibility(u0Var.f23119m);
                            }
                        }
                        if (getMessagesController().isDialogNotificationsSoundEnabled(this.f45168j6, b())) {
                            this.f45249q1.d(LocaleController.getString(R.string.Mute));
                            this.f45249q1.b(R.drawable.msg_unmute);
                        } else {
                            this.f45249q1.d(LocaleController.getString(R.string.Mute));
                            this.f45249q1.b(R.drawable.msg_silent);
                        }
                    }
                }
                org.telegram.ui.Components.bp bpVar = this.f45300u1;
                if (bpVar != null) {
                    bpVar.e(this.f45168j6, b(), null);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.e5 getBackButtonState() {
        return org.telegram.ui.ActionBar.e5.f22606a;
    }

    @Override
    public final org.telegram.ui.ActionBar.e4 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.e4.f22605c;
    }

    @Override
    public final ChatObject.Call getGroupCall() {
        ChatObject.Call call;
        if (this.f45091d4 == 0 && (call = this.f45205m8) != null && (call.call instanceof TLRPC.TL_groupCall)) {
            return call;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f45091d4 == 2) {
            ArrayList arrayList = this.K6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.dp(80.0f) + M8((MessageObject) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.u6 getResourceProvider() {
        return this.f45309ua;
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
        if (this.f45306u7) {
            return null;
        }
        int i10 = 0;
        if (this.f45256qa) {
            this.f45256qa = false;
            return null;
        }
        j6 j6Var = new j6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Nd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Od));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Pd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Qd));
        M9();
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.F8));
        lj ljVar = this.f45198m1;
        if (ljVar != null) {
            b6Var = ljVar.getTitleTextView();
        } else {
            b6Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(b6Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A8));
        lj ljVar2 = this.f45198m1;
        if (ljVar2 != null) {
            b6Var2 = ljVar2.getTitleTextView();
        } else {
            b6Var2 = null;
        }
        int i11 = org.telegram.ui.ActionBar.y6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(b6Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i11));
        lj ljVar3 = this.f45198m1;
        if (ljVar3 != null) {
            view = ljVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(i11, view));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.y6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23734x8));
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
            int i13 = org.telegram.ui.ActionBar.y6.f23659ta;
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.g7) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, l5Var2.A, (org.telegram.ui.ActionBar.g7) null, i13));
            Drawable[] drawableArr2 = l5Var5.A;
            int i14 = org.telegram.ui.ActionBar.y6.Ca;
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.g7) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, l5Var6.A, (org.telegram.ui.ActionBar.g7) null, i14));
        }
        if (!this.f45309ua.p(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var5, l5Var6}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Da));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var5, l5Var6}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ea));
            arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var5, l5Var6}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fa));
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, new Drawable[]{l5Var7, l5Var8}, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23324bc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23603qc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23621rc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23343cb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.ed));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23453ib));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23400fd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23470jb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23490kb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23717wb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23754yb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23736xb));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 0, new Class[]{org.telegram.ui.Cells.s1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23587pe));
        this.f45309ua.getClass();
        mk mkVar = this.f45090d3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i15 = org.telegram.ui.ActionBar.y6.Sd;
        arrayList.add(new org.telegram.ui.ActionBar.h7(mkVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.R, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xk));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Zd));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23306ae));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23494kf));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23550nf));
        jk jkVar = this.Y;
        int i16 = org.telegram.ui.ActionBar.y6.f23530mf;
        arrayList.add(new org.telegram.ui.ActionBar.h7(jkVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23570of));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23347cf));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.Y, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23402ff));
        jk jkVar2 = this.Y;
        if (jkVar2 != null) {
            szVar = jkVar2.getEmojiView();
        } else {
            szVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Ke));
        jk jkVar3 = this.Y;
        if (jkVar3 != null) {
            szVar2 = jkVar3.getEmojiView();
        } else {
            szVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar2, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Le));
        jk jkVar4 = this.Y;
        if (jkVar4 != null) {
            szVar3 = jkVar4.getEmojiView();
        } else {
            szVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar3, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Me));
        jk jkVar5 = this.Y;
        if (jkVar5 != null) {
            szVar4 = jkVar5.getEmojiView();
        } else {
            szVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar4, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Oe));
        jk jkVar6 = this.Y;
        if (jkVar6 != null) {
            szVar5 = jkVar6.getEmojiView();
        } else {
            szVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar5, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Pe));
        jk jkVar7 = this.Y;
        if (jkVar7 != null) {
            szVar6 = jkVar7.getEmojiView();
        } else {
            szVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar6, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Re));
        jk jkVar8 = this.Y;
        if (jkVar8 != null) {
            szVar7 = jkVar8.getEmojiView();
        } else {
            szVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar7, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Se));
        jk jkVar9 = this.Y;
        if (jkVar9 != null) {
            szVar8 = jkVar9.getEmojiView();
        } else {
            szVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar8, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.We));
        jk jkVar10 = this.Y;
        if (jkVar10 != null) {
            szVar9 = jkVar10.getEmojiView();
        } else {
            szVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar9, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Ne));
        jk jkVar11 = this.Y;
        if (jkVar11 != null) {
            szVar10 = jkVar11.getEmojiView();
        } else {
            szVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar10, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Je));
        jk jkVar12 = this.Y;
        if (jkVar12 != null) {
            szVar11 = jkVar12.getEmojiView();
        } else {
            szVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar11, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Ue));
        jk jkVar13 = this.Y;
        if (jkVar13 != null) {
            szVar12 = jkVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.h7(szVar12, 0, new Class[]{org.telegram.ui.Components.sz.class}, (String[]) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.Qe));
        jk jkVar14 = this.Y;
        if (jkVar14 != null) {
            org.telegram.ui.Components.c61 trendingStickersAlert = jkVar14.getTrendingStickersAlert();
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
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23694v7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23675u7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23750y7));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.L2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, j6Var, org.telegram.ui.ActionBar.y6.f23357d6));
        NumberTextView numberTextView = this.R2;
        int i18 = org.telegram.ui.ActionBar.y6.f23401fe;
        arrayList.add(new org.telegram.ui.ActionBar.h7(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i18));
        ImageView imageView = this.f45104e3;
        int i19 = org.telegram.ui.ActionBar.y6.f23770z8;
        arrayList.add(new org.telegram.ui.ActionBar.h7(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45117f3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45175k1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23454ic));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45339x0, 131072, new Class[]{org.telegram.ui.Cells.u1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Fe));
        fi.f6 f6Var = this.Q;
        int i20 = org.telegram.ui.ActionBar.y6.f23509lc;
        arrayList.add(new org.telegram.ui.ActionBar.h7(f6Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45213n2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45175k1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i20));
        org.telegram.ui.Components.t40 t40Var = this.f45250q2;
        int i21 = org.telegram.ui.ActionBar.y6.f23605qf;
        arrayList.add(new org.telegram.ui.ActionBar.h7(t40Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.f45250q2, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23588pf));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.F2, 4, new Class[]{org.telegram.ui.Components.t40.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h7(this.G2, 4, new Class[]{org.telegram.ui.Components.t40.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23485k6));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vb));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23683uf));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23701vf));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Tg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ug));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Vg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Wg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Xg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Yg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Zg));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23309ah));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23329bh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23349ch));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23368dh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23385eh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23404fh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23457ih));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23476jh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23496kh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23421gh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23440hh));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23300a7));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Sb));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Cj));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Ej));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.Dj));
        int i22 = org.telegram.ui.ActionBar.y6.Fj;
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.h7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i22));
        yh.d dVar = this.va;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.h7(dVar.f52644g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.h7(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.g7) null, org.telegram.ui.ActionBar.y6.f23365de));
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.h7) obj).f22701n = this.f45309ua;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f45309ua.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.f45309ua.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.y6.U0(str);
    }

    public final void h7() {
        if (!this.f45285sc) {
            this.f45285sc = true;
            if (!this.f45298tc && this.f45091d4 == 0 && !getMessagesController().getSavedMessagesController().unsupported && getMessagesController().getSavedMessagesController().getAllCount() > 2) {
                if (this.H1 != null && MessagesController.getGlobalMainSettings().getInt("savedhint", 0) < 1) {
                    this.H1.u();
                    this.f45298tc = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedhint", MessagesController.getGlobalMainSettings().getInt("savedhint", 0) + 1).putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.I1 != null && MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) < 1) {
                    this.I1.u();
                    this.f45298tc = true;
                    MessagesController.getGlobalMainSettings().edit().putInt("savedsearchhint", MessagesController.getGlobalMainSettings().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    i7();
                }
            }
        }
    }

    public final void h8(int r19, java.lang.Object... r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.h8(int, java.lang.Object[]):void");
    }

    public final long h9() {
        return this.f45241p4;
    }

    public final void ha() {
        this.P4 = true;
        pm pmVar = this.f45282s9;
        AndroidUtilities.cancelRunOnUIThread(pmVar.f24098f0);
        pmVar.f24124z = false;
        le leVar = new le(this, 8);
        int i10 = this.T7;
        if (i10 != 0) {
            kb(i10, 0, false, this.S7, true, 0, null, null, leVar);
            return;
        }
        int i11 = this.R7;
        if (i11 > 0) {
            kb(i11, 0, true, this.S7, true, 0, null, null, leVar);
            return;
        }
        jb(!this.Bb, leVar);
        this.Bb = false;
        if (!this.T4.isEmpty()) {
            this.f45049a5 = true;
            this.Z4 = ((Integer) this.T4.get(0)).intValue();
        }
    }

    public final int hb(org.telegram.messenger.MessageObject r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.hb(org.telegram.messenger.MessageObject):int");
    }

    public final void hc() {
        String str;
        if (this.gc != null) {
            return;
        }
        if (this.D5 != null) {
            str = getMessagesController().getFullName(this.D5.getSenderId());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, getResourceProvider());
        String string = LocaleController.getString(R.string.UpdatedQuoteTitle);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UpdatedQuoteMessage, str));
        alertDialog$Builder.k(LocaleController.getString(R.string.Edit), new qe(this, 18));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new qe(this, 19));
        e2Var.setOnDismissListener(new pe(this, 8));
        this.gc = alertDialog$Builder.p();
    }

    public final void hd(boolean r49) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.hd(boolean):void");
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        MessageObject messageObject = this.f45166j4;
        if (messageObject != null && messageObject.getRepliesCount() == 0 && ChatObject.canSendMessages(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public TLRPC.User i() {
        return this.f45113f;
    }

    public final void i7() {
        org.telegram.ui.Cells.s1 s1Var;
        fi.v3 v3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        fi.v3 v3Var2 = this.J1;
        if (v3Var2 != null && !v3Var2.V && !this.f45323vc && this.f45285sc && !this.Zc.f19326f && System.currentTimeMillis() - this.f45311uc > 1800 && MessagesController.getGlobalMainSettings().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f45339x0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f45339x0.getChildAt(childCount);
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
                this.f45323vc = true;
                s1Var.getLocationInWindow(iArr);
                this.J1.setTranslationY(((iArr[1] - v3Var.getTop()) - AndroidUtilities.dp(120.0f)) + y0Var2.d);
                this.J1.m(0.0f, (((bh.v0) y0Var2.v.get(0)).A / 2.0f) + (-AndroidUtilities.dp(16.0f)) + iArr[0] + y0Var2.f4217c);
                this.J1.u();
                MessagesController.getGlobalMainSettings().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(new le(this, 21));
            AndroidUtilities.runOnUIThread(new le(this, 21), 2000L);
        }
    }

    public final void i8(int r33, final java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.i8(int, java.lang.Object[]):void");
    }

    public final float i9(float f7) {
        wn wnVar = this.f45296ta;
        if (wnVar == null) {
            wnVar = this;
        }
        org.telegram.ui.Components.ch chVar = wnVar.Y0;
        if (chVar == null) {
            return 0.0f;
        }
        return chVar.c(f7);
    }

    public final void ib() {
        jb(false, null);
    }

    public final void ic(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.t40 t40Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((t40Var = this.f45354y2) != null && t40Var.getVisibility() == 0)) {
                this.f45354y2.setText(AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, charSequence)));
                if (z10) {
                    this.f45354y2.f(view, true);
                }
            }
        }
    }

    public final void id() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.u0 u0Var = this.f45286t0;
        if (u0Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && ChatObject.canManageTopic(this.currentAccount, chat, this.f45228o4) && (tL_forumTopic = this.f45228o4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            u0Var.e(i10);
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (M9()) {
            org.telegram.ui.ActionBar.u6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.e(org.telegram.ui.ActionBar.y6.f23714w8);
            } else {
                x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23714w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.y6.I.q();
        } else {
            z10 = this.f45099dc;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        if ((this.f45091d4 != 5 || (!this.K6.isEmpty() && this.f45241p4 != 0)) && !this.Zc.f19326f && this.D9) {
            el elVar = this.Va;
            if (elVar == null || !elVar.f31269s) {
                wh.i iVar = this.f45221na;
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
        kb(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final void j7(boolean z10) {
        int i10;
        if (this.f45364z0 != null && !this.G5 && !this.A0.L && !this.f45319v7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f45339x0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f45339x0.getChildAt(i14));
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
            hm hmVar = this.A0;
            if (hmVar.N) {
                int i15 = hmVar.E;
                if (i15 >= 0 && i13 >= 0 && i15 >= i13 && i15 <= i12) {
                    getMediaDataController().loadMoreSearchMessages(false);
                    return;
                }
                return;
            }
            int h = hmVar.h();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            int i16 = i10;
            if (this.f45091d4 == 7) {
                if ((h - i13) - i11 <= i16 && !this.W6 && !this.S6[0]) {
                    this.W6 = true;
                    this.f45345x6.add(Integer.valueOf(this.f45191l6));
                    HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
                    String str = this.G3;
                    int i17 = this.classGuid;
                    int i18 = this.f45048a4;
                    int i19 = this.f45191l6;
                    this.f45191l6 = i19 + 1;
                    hashtagSearchController.searchHashtag(str, i17, i18, i19);
                    return;
                }
                return;
            }
            AndroidUtilities.runOnUIThread(new org.telegram.messenger.gf(this, h, i13, i11, i16, 1));
        }
    }

    public final void j8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.j8(int, java.lang.Object[]):void");
    }

    public final float j9(org.telegram.ui.Components.b41 b41Var) {
        float f7;
        org.telegram.ui.Components.f41 f41Var = this.f45089d2;
        if (f41Var != null) {
            float dp = AndroidUtilities.dp(7.0f);
            float k10 = f41Var.k(b41Var);
            if (b41Var == org.telegram.ui.Components.b41.f26731b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (AndroidUtilities.dp(f7) + dp) * k10;
        }
        return 0.0f;
    }

    public final void ja(long j10, String str, boolean z10) {
        ka();
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.V1(j10, str, z10, false);
        }
    }

    public final void jb(boolean z10, le leVar) {
        ArrayList arrayList;
        int i10;
        if (this.f45339x0.V1) {
            return;
        }
        this.pb = 0;
        this.f45257qb = Integer.MIN_VALUE;
        this.Z4 = 0;
        this.Qb = 0;
        this.f45049a5 = false;
        this.f45206m9.e(0);
        if (this.U6[0] && this.X7 == 0 && this.K7 == 0) {
            this.f45313v1.d(false);
            if (this.f45364z0.I0() == 0) {
                this.f45334w9 = false;
                Mc();
                Ua();
                nd(false);
                return;
            }
            this.A0.T();
            in inVar = this.f45084cb;
            inVar.f40210c = null;
            int i11 = 0;
            while (true) {
                arrayList = this.K6;
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
            qk qkVar = this.f45206m9;
            inVar.d = i11;
            inVar.f40211f = 0;
            boolean z11 = !z10;
            inVar.e = z11;
            qkVar.c(i11, 0, z11, true);
            this.f45334w9 = false;
            Mc();
            return;
        }
        org.telegram.ui.ActionBar.e2 e2Var = this.Pb;
        if (e2Var != null) {
            e2Var.dismiss();
        }
        Oc(false);
        if (leVar != null) {
            leVar.run();
        } else {
            Ya();
            org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(getParentActivity(), 3, this.f45309ua);
            this.Pb = e2Var2;
            e2Var2.setOnCancelListener(this.Ca);
            this.Pb.r(1000L);
        }
        this.f45233o9 = this.f45191l6;
        this.q9 = false;
        this.f45246p9 = 0;
        this.f45268r9 = false;
        ArrayList arrayList2 = this.f45345x6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f45191l6));
        AndroidUtilities.runOnUIThread(new jf(this, 13), 0L);
    }

    public final void jc(MessageSuggestionParams messageSuggestionParams) {
        if (this.F5 == null) {
            return;
        }
        new bi.g1(getParentActivity(), this.currentAccount, this.f45168j6, messageSuggestionParams, this, getResourceProvider(), 0, new ye(this, 0)).show();
    }

    public final void jd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        lj ljVar = this.f45198m1;
        if (ljVar != null && (tL_forumTopic = this.f45228o4) != null) {
            ljVar.setTitle(tL_forumTopic.title);
        }
        kd();
    }

    public final void k7(MessageObject messageObject) {
        if (messageObject.type == 4 && !this.H8 && !SharedConfig.isSecretMapPreviewSet()) {
            this.H8 = true;
            org.telegram.ui.Components.g5.r0(getParentActivity(), this.currentAccount, new le(this, 10), true, this.f45309ua);
        }
    }

    public final void k8(int r29, java.lang.Object... r30) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.k8(int, java.lang.Object[]):void");
    }

    public final MessageObject.GroupedMessages k9(MessageObject messageObject) {
        if (messageObject.getGroupId() == 0) {
            return null;
        }
        MessageObject.GroupedMessages groupedMessages = (MessageObject.GroupedMessages) this.N6.f(messageObject.getGroupId());
        if (groupedMessages != null && (groupedMessages.messages.size() <= 1 || groupedMessages.getPosition(messageObject) == null)) {
            return null;
        }
        return groupedMessages;
    }

    public final void ka() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            jk jkVar = this.Y;
            if (jkVar == null || TextUtils.isEmpty(jkVar.getSlowModeTimer())) {
                jk jkVar2 = this.Y;
                if (jkVar2 != null && jkVar2.f25923m5.f19326f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                N7();
                di.a3 a3Var = this.V1;
                if (!z10 && this.f45091d4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                a3Var.U1 = z11;
                a3Var.f33002j0.g0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.f45330w5 == null) && !z10 && this.f45091d4 != 9) {
                    if (chat != null && !ChatObject.hasAdminRights(chat) && this.e.slowmode_enabled) {
                        this.V1.R1(10, true);
                    } else {
                        this.V1.R1(-1, true);
                    }
                } else {
                    this.V1.R1(1, true);
                }
                di.a3 a3Var2 = this.V1;
                a3Var2.V0 = true;
                a3Var2.A1.setVisibility(0);
                a3Var2.T0 = 0;
                a3Var2.F = false;
                a3Var2.G = false;
                a3Var2.f32999i0 = true;
                a3Var2.J = null;
                org.telegram.ui.ActionBar.w0 w0Var = a3Var2.f33014n1;
                if (w0Var != null) {
                    a3Var2.f33010m1.setTranslationY(0.0f);
                    w0Var.setVisibility(8);
                }
                this.V1.w1();
                this.V1.s1().setText(this.Y.getFieldText());
                di.a3 a3Var3 = this.V1;
                a3Var3.f33025r = this.f45309ua;
                showDialog(a3Var3);
            }
        }
    }

    public final void kb(int r27, int r28, boolean r29, int r30, boolean r31, int r32, java.lang.Integer r33, byte[] r34, java.lang.Runnable r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.kb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void kc(MessageObject messageObject) {
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
                if (z10 && SharedConfig.textSelectionHintShows <= 2 && !this.f45360y9 && this.f45373z9 <= this.Y.getTop() - AndroidUtilities.dp(60.0f)) {
                    this.f45360y9 = true;
                    SharedConfig.increaseTextSelectionHintShowed();
                    if (this.x9 == null) {
                        ml mlVar = new ml(getParentActivity(), this.f45309ua, this);
                        this.x9 = mlVar;
                        this.f45163j1.addView(mlVar, org.telegram.ui.Components.kb1.h(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.x9.c();
                }
            }
        }
    }

    public final void kd() {
        lj ljVar;
        lj ljVar2;
        if (UserObject.isBotForum(this.f45113f) && (ljVar2 = this.f45198m1) != null) {
            ljVar2.getAvatarImageView().setVisibility(0);
            this.f45198m1.b();
        } else if (this.f45228o4 != null && (ljVar = this.f45198m1) != null) {
            ljVar.getAvatarImageView().setVisibility(0);
            pg.d.p(this.f45198m1.getAvatarImageView(), this.f45228o4, true, true, this.f45309ua);
        }
    }

    @Override
    public final void l(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        String str2 = null;
        u8(str, null);
        if (o7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.f45168j6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = O8();
                of2.invert_media = z11;
                of2.payStars = j11;
                of2.monoForumPeer = a9();
                of2.suggestionParams = this.f45330w5;
                SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
            } else {
                str2 = str;
            }
            getSendMessagesHelper().sendMessage(arrayList3, this.f45168j6, false, false, true, 0, 0, null, -1, j11, a9(), this.f45330w5);
            SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), arrayList, arrayList, null, str2, arrayList2, null, this.f45168j6, this.D5, this.f45166j4, null, this.B5, this.F5, z10, i10, 0, null, O8(), j10, z11, j11, a9(), this.f45330w5);
            E6();
        }
    }

    public final void l7(boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        jk jkVar = this.Y;
        if (jkVar != null) {
            BotForumHelper.SteamingSendButtonState streamingSendButtonState = BotForumHelper.getInstance(this.currentAccount).getStreamingSendButtonState(this.f45168j6, (int) b());
            oe.b bVar = jkVar.f25918l5;
            jh.h hVar = jkVar.I0;
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
            ((oe.b) hVar.f15955c).a(z12, z13);
            hVar.setClickable(z12);
            hVar.setEnabled(z12);
            if (bVar.f19326f != z11) {
                z14 = true;
            }
            bVar.a(z11, z10);
            jkVar.T4 = streamingSendButtonState;
            if (z14) {
                jkVar.F(z10);
            }
        }
    }

    public final void l8(java.lang.Object... r81) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.l8(java.lang.Object[]):void");
    }

    public final void l9(boolean z10) {
        int i10;
        int i11 = 1;
        if (this.f45091d4 == 7) {
            HashtagSearchController hashtagSearchController = HashtagSearchController.getInstance(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.H3;
            if (!z10) {
                i11 = -1;
            }
            hashtagSearchController.jumpToMessage(i12, i13 + i11, this.f45048a4);
            return;
        }
        MediaDataController mediaDataController = getMediaDataController();
        long j10 = this.f45168j6;
        long j11 = this.f45065b7;
        int i14 = this.classGuid;
        boolean z11 = this.f45136gb;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.searchMessagesInChat(null, j10, j11, i14, i10, this.f45241p4, this.A3, this.B3, this.C3);
        bc(false);
    }

    public final void la() {
        ht.o().T = null;
        if (getParentActivity() == null) {
            return;
        }
        N7();
        this.V1.f33002j0.g0();
        this.V1.R1(1, false);
        di.a3 a3Var = this.V1;
        a3Var.X1 = true;
        a3Var.o1(null);
        this.V1.w1();
        di.a3 a3Var2 = this.V1;
        a3Var2.f33025r = this.f45309ua;
        if (this.visibleDialog != null) {
            a3Var2.show();
        } else {
            showDialog(a3Var2);
        }
    }

    public final void lb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.lb(java.lang.CharSequence, boolean):void");
    }

    public final void lc(boolean z10, boolean z11) {
        jk jkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.E2 != null) && this.f45091d4 == 0 && (jkVar = this.Y) != null && jkVar.getAudioVideoButtonContainer() != null && this.Y.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.E2 == null) {
                    om omVar = this.f45163j1;
                    int indexOfChild = omVar.indexOfChild(this.S);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(9, getParentActivity(), this.f45309ua, false);
                        this.E2 = t40Var;
                        omVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.E2.b(true);
                    return;
                }
                if (this.Y.f25874e2) {
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

    public final void ld() {
        int i10;
        org.telegram.ui.ActionBar.u0 u0Var = this.f45187l0;
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
    public final void m(long j10, ArrayList arrayList, boolean z10, int i10) {
        u8(((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).entities);
        SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList, this.f45168j6, this.D5, this.f45166j4, null, this.B5, true, false, this.F5, z10, i10, 0, this.f45091d4, ((SendMessagesHelper.SendingMediaInfo) arrayList.get(0)).updateStickersOrder, null, O8(), 0L, false, j10, a9(), this.f45330w5);
        E6();
        if (i10 != 0) {
            if (this.f45105e4 == -1) {
                this.f45105e4 = 0;
            }
            this.f45105e4 = arrayList.size() + this.f45105e4;
            Vc(true);
        }
    }

    public final void m7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.m7():void");
    }

    public final void m8(int i10, ArrayList arrayList, boolean z10) {
        int i11;
        ArrayList arrayList2 = arrayList;
        if (!arrayList2.isEmpty() && o7()) {
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
                    SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, this.f45168j6, this.D5, this.f45166j4, null, false, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities, null, null, z10, i10, 0, null, false);
                    of2.sendMessageChatArguments = O8();
                    SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
                }
            }
            int i13 = 0;
            while (i13 < arrayList2.size()) {
                SendMessagesHelper.SendingMediaInfo sendingMediaInfo2 = (SendMessagesHelper.SendingMediaInfo) arrayList2.get(i13);
                if (sendingMediaInfo2.inlineResult != null && sendingMediaInfo2.videoEditedInfo == null) {
                    int i14 = i13;
                    SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), sendingMediaInfo2.inlineResult, sendingMediaInfo2.params, this.f45168j6, this.D5, this.f45166j4, null, this.B5, z10, i10, 0, O8(), 0L, a9());
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
                u8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
                SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.f45168j6, this.D5, this.f45166j4, null, this.B5, false, true, this.F5, z10, i10, 0, this.f45091d4, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, O8(), 0L, false, 0L, a9(), this.f45330w5);
                E6();
                if (i10 != 0) {
                    if (this.f45105e4 == -1) {
                        this.f45105e4 = 0;
                    }
                    this.f45105e4 = arrayList.size() + this.f45105e4;
                    Vc(true);
                }
            }
        }
    }

    public final void m9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.m9():void");
    }

    public final void ma(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.s1 r15, final org.telegram.messenger.MessageObject r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.ma(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.s1, org.telegram.messenger.MessageObject):void");
    }

    public final void mb(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.A3 = user;
        this.B3 = chat;
        if (this.f45162j0 != null && this.U1 != null) {
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
                    this.f45367z3 = false;
                    String string = LocaleController.getString(R.string.SearchFrom);
                    SpannableString spannableString = new SpannableString(a1.g.D(string, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.p10(org.telegram.ui.ActionBar.y6.B8, getResourceProvider()), string.length() + 1, spannableString.length(), 33);
                    this.f45162j0.setSearchFieldCaption(spannableString);
                    this.U1.getAdapter().U(null, 0, null, false, true);
                    this.f45162j0.setSearchFieldHint(null);
                    this.f45162j0.n();
                    MediaDataController mediaDataController = getMediaDataController();
                    this.F3 = "";
                    mediaDataController.searchMessagesInChat("", this.f45168j6, this.f45065b7, this.classGuid, 0, this.f45241p4, this.A3, this.B3, this.C3);
                }
            }
        }
    }

    public final boolean mc(MessageObject messageObject) {
        if (this.f45091d4 == 0 && messageObject != null && messageObject.isWelcomeAnchored()) {
            return true;
        }
        return false;
    }

    public final void md(Utilities.CallbackReturn callbackReturn) {
        int i10;
        int i11;
        rj rjVar = this.f45339x0;
        if (rjVar != null) {
            if (!this.P4 && this.Z7 != null) {
                int childCount = rjVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f45339x0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.s1) {
                        MessageObject messageObject = ((org.telegram.ui.Cells.s1) childAt).getMessageObject();
                        MessageObject messageObject2 = this.Z7;
                        if (messageObject == messageObject2) {
                            ArrayList arrayList = this.K6;
                            if (arrayList.indexOf(messageObject2) >= 0) {
                                i10 = arrayList.indexOf(this.Z7) + this.A0.J;
                                i11 = Y8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f45339x0.getChildCount();
            jk jkVar = this.Y;
            if (jkVar != null) {
                jkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f45339x0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.s1) {
                    org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt2;
                    MessageObject messageObject3 = s1Var.getMessageObject();
                    if (((Boolean) callbackReturn.run(messageObject3)).booleanValue()) {
                        messageObject3.forceUpdate = true;
                        s1Var.Z3(messageObject3, s1Var.getCurrentMessagesGroup(), s1Var.m3(), s1Var.n3(), s1Var.h3(), s1Var.j3());
                        hm hmVar = this.A0;
                        this.f45339x0.getClass();
                        hmVar.Q(RecyclerView.R(s1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.f45364z0.h1(i10, i11);
            }
        }
    }

    @Override
    public final boolean n() {
        return this.H9;
    }

    public final boolean n7(View view) {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer != null) {
            ic(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void n8(View view) {
        o8(view, false);
    }

    public final boolean n9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f45203m6;
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

    public final void na(long j10, final MessageObject messageObject, int i10, final long j11, final int i11, final int i12, final MessageObject messageObject2) {
        int i13 = i10;
        final TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(j10));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = MessagesController.getInputPeer(chat);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (BuildVars.LOGS_ENABLED) {
            FileLog.d("getDiscussionMessage chat = " + chat.f22028id + " msg_id = " + i13);
        }
        this.Ic = 0;
        this.Jc = false;
        this.Lc = null;
        this.Mc = null;
        rj rjVar = this.f45339x0;
        if (rjVar != null) {
            rjVar.g1();
        }
        if (this.Hc != -1) {
            getConnectionsManager().cancelRequest(this.Hc, false);
        }
        if (this.Gc != -1) {
            getConnectionsManager().cancelRequest(this.Gc, false);
        }
        if (messageObject2 != null) {
            i13 = messageObject2.getId();
        }
        this.Ic = i13;
        this.Jc = false;
        this.Kc = System.currentTimeMillis();
        rj rjVar2 = this.f45339x0;
        if (rjVar2 != null) {
            rjVar2.g1();
        }
        final int i14 = this.Ec + 1;
        this.Ec = i14;
        this.Gc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final wn wnVar = wn.this;
                final int i15 = i14;
                final int i16 = i11;
                final long j12 = j11;
                final int i17 = i12;
                final MessageObject messageObject3 = messageObject2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat2 = chat;
                final MessageObject messageObject4 = messageObject;
                AndroidUtilities.runOnUIThread(new ed(10, wnVar, new Runnable(i15, i16, j12, tLObject, i17, messageObject3, tL_messages_getDiscussionMessage2, chat2, messageObject4) {
                    public final int f46264b;
                    public final int f46265c;
                    public final TLObject d;
                    public final int e;
                    public final MessageObject f46266f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f46267n;
                    public final MessageObject f46268r;

                    {
                        this.d = tLObject;
                        this.e = i17;
                        this.f46266f = messageObject3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f46267n = chat2;
                        this.f46268r = messageObject4;
                    }

                    @Override
                    public final void run() {
                        int i18;
                        final wn wnVar2 = wn.this;
                        if (this.f46264b != wnVar2.Ec) {
                            return;
                        }
                        wnVar2.Gc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            wnVar2.Lc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            wnVar2.getMessagesController().putUsers(wnVar2.Lc.users, false);
                            wnVar2.getMessagesController().putChats(wnVar2.Lc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = wnVar2.Lc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i19 = 0; i19 < wnVar2.Lc.messages.size(); i19++) {
                                TLRPC.Message message = wnVar2.Lc.messages.get(i19);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i20 = this.f46265c;
                        final int i21 = this.e;
                        final MessageObject messageObject5 = this.f46266f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat3 = this.f46267n;
                        final MessageObject messageObject6 = this.f46268r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = wnVar2.getMessagesController().getInputPeer(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f22049id;
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
                            final int i22 = wnVar2.Fc + 1;
                            wnVar2.Fc = i22;
                            wnVar2.Hc = wnVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    AndroidUtilities.runOnUIThread(new kh(wn.this, i22, tLObject3, tL_error2, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6, 0));
                                }
                            });
                            return;
                        }
                        wnVar2.Ka(wnVar2.Lc, wnVar2.Mc, i20, messageObject5, tL_messages_getDiscussionMessage3, chat3, i21, messageObject6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Gc, this.classGuid);
    }

    public final void nb(View view, MessageObject messageObject, org.telegram.ui.Components.gl0 gl0Var, View view2, float f7, float f10, bh.x0 x0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
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
                J7(true);
                if (view == null) {
                    zVar = A8(messageObject.getId(), true);
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
                    long j11 = this.f45168j6;
                    if (chatFull != null && !chatFull.paid_reactions_available) {
                        z14 = false;
                    } else {
                        z14 = true;
                    }
                    bi.be beVar = new bi.be(parentActivity, i15, j11, this, messageObject, arrayList2, z14, false, 0L, this.f45309ua);
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
                    if (this.Qc == null) {
                        this.Qc = new bi.m7(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        m7Var = null;
                    } else {
                        if (this.Qc.getParent() != layoutContainer) {
                            AndroidUtilities.removeFromParent(this.Qc);
                            layoutContainer.addView(this.Qc, org.telegram.ui.Components.kb1.g(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Qc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Qc.bringToFront();
                        }
                        m7Var = this.Qc;
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
                a0.h hVar = this.N6;
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
                    org.telegram.ui.Cells.z A8 = A8(i18, true);
                    if (!SharedConfig.multipleReactionsPromoShowed && A8 != null && x0Var != null && !getUserConfig().isPremium() && size == 1) {
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
                            q5.f31861j = 5000;
                            q5.j();
                        }
                    }
                    if (!z10) {
                        int i19 = this.currentAccount;
                        if (gl0Var != null) {
                            if (z11) {
                                i10 = 0;
                            } else {
                                i10 = 2;
                            }
                        } else {
                            i10 = 1;
                        }
                        bh.s0.d(this, gl0Var, A8, view2, f7, f10, x0Var, i19, i10);
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
                ri riVar = new ri(this, z13, z10, i18, selectReaction, gl0Var, f7, f10, x0Var, messageObject);
                this.Cc = riVar;
                sendMessagesHelper.sendReaction(messageObject, arrayList3, x0Var2, z11, z12, this, riVar);
                if (z10 || z13) {
                    Hc(messageObject, true);
                    this.Cc.run();
                }
                if (!z13) {
                    AndroidUtilities.runOnUIThread(this.Cc, 50L);
                }
            }
        }
    }

    public final void nc(MessageObject messageObject, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (messageObject != null && getParentActivity() != null) {
            bh.x xVar = this.f45234oa;
            if (xVar != null && xVar.d()) {
                this.f45234oa.setHiddenByScroll(true);
            }
            if (this.f45162j0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f22775n0) {
                    kVar.g(true);
                    this.Y.a1();
                }
            }
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null && (richMessage = message.rich_message) != null) {
                li.b2 b2Var = new li.b2(richMessage);
                b2Var.J = this;
                b2Var.f17139r = messageObject;
                presentFragment(b2Var);
                return;
            }
            this.U1.getAdapter().f14116f0 = false;
            this.Y.setVisibility(0);
            Pb(true, null, messageObject, null, null, true, 0, null, false, 0L, null, true);
            yc(false);
            if (!z10) {
                W6();
            }
            if (z10) {
                this.f45330w5 = MessageSuggestionParams.of(messageObject.messageOwner.suggested_post);
            }
            this.Y.R0(false, false, true);
            Pc(0, true);
            nd(false);
            if (!z10 && !messageObject.scheduled && !messageObject.isQuickReply() && this.f45091d4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().getInputPeer(this.f45168j6);
                tL_messages_getMessageEditData.f22122id = messageObject.getId();
                this.E5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new oe(this, 3));
                return;
            }
            jk jkVar = this.Y;
            org.telegram.ui.Components.xe xeVar = jkVar.F1;
            if (xeVar != null) {
                xeVar.setEnabled(true);
                jkVar.F1.h(false);
            }
        }
    }

    public final void nd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.nd(boolean):void");
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f45091d4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((r2Var instanceof wn) && ((wn) r2Var).I9()) {
                return false;
            }
        }
        if (this.X6 && !this.f45222nb) {
            return true;
        }
        return false;
    }

    @Override
    public final org.telegram.ui.Components.po o() {
        return this.f45198m1;
    }

    public final boolean o7() {
        CharSequence slowModeTimer = this.Y.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String string = LocaleController.getString(R.string.Slowmode);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.R = string;
        e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatString("SlowModeHint", R.string.SlowModeHint, slowModeTimer));
        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
        return false;
    }

    public final void o8(View view, boolean z10) {
        boolean z11;
        Db(view);
        if (view != this.f45313v1) {
            z11 = true;
        } else {
            z11 = false;
        }
        p8(z10, z11, 0.2f);
    }

    public final boolean o9() {
        pm pmVar = this.f45282s9;
        if (pmVar != null && pmVar.x()) {
            return true;
        }
        return false;
    }

    public final void oa(boolean z10) {
        String string;
        if (!K9() && !n9()) {
            int i10 = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f45203m6;
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
            bh.x xVar = this.f45234oa;
            if (xVar != null && xVar.d()) {
                this.f45234oa.setHiddenByScroll(true);
            }
            Bundle c10 = org.telegram.messenger.wh.c(3, "onlySelect", "dialogsType", true);
            c10.putInt("messagesCount", this.f45279s6);
            c10.putInt("hasPoll", i10);
            c10.putBoolean("hasInvoice", z11);
            c10.putBoolean("canSelectTopics", true);
            ey eyVar = new ey(c10);
            eyVar.C2 = this;
            presentFragment(eyVar);
            return;
        }
        if (K9()) {
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
            if (this.f45327w2 == null) {
                om omVar = this.f45163j1;
                int indexOfChild = omVar.indexOfChild(this.S);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.t40 t40Var = new org.telegram.ui.Components.t40(7, getParentActivity(), null, true);
                    this.f45327w2 = t40Var;
                    omVar.addView(t40Var, indexOfChild + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f45327w2.setAlpha(0.0f);
                    this.f45327w2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f45327w2.setText(string);
            this.f45327w2.f(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.f45341x2 == null) {
            om omVar2 = this.f45163j1;
            int indexOfChild2 = omVar2.indexOfChild(this.S);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.t40 t40Var2 = new org.telegram.ui.Components.t40(getParentActivity(), 9);
            this.f45341x2 = t40Var2;
            omVar2.addView(t40Var2, indexOfChild2 + 1, org.telegram.ui.Components.kb1.h(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f45341x2.setAlpha(0.0f);
            this.f45341x2.setVisibility(4);
        }
        this.f45341x2.setText(string);
        this.f45341x2.f(this.f45059b1.getForwardButton(), true);
    }

    public final void ob() {
        k6.c[] cVarArr;
        kh.b bVar;
        kh.a aVar;
        org.telegram.ui.Components.od[] odVarArr;
        fj fjVar = this.f45324w;
        if (fjVar != null) {
            fjVar.c();
        }
        fj fjVar2 = this.f45338x;
        if (fjVar2 != null) {
            fjVar2.c();
        }
        jk jkVar = this.Y;
        if (jkVar != null) {
            jkVar.updateColors();
        }
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.h1();
        }
        rj rjVar = this.f45339x0;
        if (rjVar != null) {
            int childCount = rjVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f45339x0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s1) {
                    ((org.telegram.ui.Cells.s1) childAt).s1(0);
                } else if (childAt instanceof org.telegram.ui.Cells.v0) {
                    ((org.telegram.ui.Cells.v0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.o1 o1Var = this.f45134g9;
        if (o1Var != null && o1Var.getContentView() != null) {
            View contentView = this.f45134g9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.y6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.ug0 ug0Var = this.L2;
        if (ug0Var != null) {
            ug0Var.d();
        }
        kk kkVar = this.Z;
        if (kkVar != null && kkVar.getEditView() != null) {
            for (org.telegram.ui.Components.od odVar : this.Z.getEditView().f30866a) {
                if (odVar != null) {
                    odVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var = this.f45137h0;
        if (w0Var != null) {
            w0Var.V();
        }
        dk dkVar = this.f45164j2;
        if (dkVar != null) {
            dkVar.updateColors();
        }
        lj ljVar = this.f45198m1;
        if (ljVar != null) {
            ljVar.updateColors();
        }
        om omVar = this.f45163j1;
        if (omVar != null) {
            omVar.M();
            bi.cc ccVar = this.f45163j1.L;
            if (ccVar != null) {
                ccVar.invalidate();
            }
        }
        org.telegram.ui.Components.ch chVar = this.Y0;
        if (chVar != null) {
            eh.d dVar = chVar.f27159s;
            if (dVar != null) {
                dVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23357d6, false));
            chVar.invalidate();
        }
        org.telegram.ui.Components.uz0 uz0Var = this.f45238p1;
        if (uz0Var != null) {
            uz0Var.updateColors();
        }
        lj ljVar2 = this.f45198m1;
        if (ljVar2 != null && ljVar2.getTimeItem() != null) {
            this.f45198m1.getTimeItem().invalidate();
        }
        jh.f fVar = this.S;
        if (fVar != null) {
            fVar.updateColors();
        }
        lh.h hVar = this.f45313v1;
        if (hVar != null) {
            for (k6.c cVar : hVar.e) {
                if (cVar != null && (aVar = (bVar = (kh.b) cVar.f16405b).f16653b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        nk nkVar = this.f45046a1;
        if (nkVar != null) {
            nkVar.updateColors();
        }
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((eh.d) it.next()).updateColors();
        }
        this.f45163j1.invalidate();
        Iterator it2 = this.f45351y.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void oc() {
        org.telegram.ui.Components.z00 z00Var = this.C9;
        if (z00Var != null && !z00Var.f35194c) {
            z00Var.c(false);
            try {
                this.C9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
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
                            li.v3 v3Var = qVar.f17417r;
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
                                    qVar2.f17417r.k2(intent.getData());
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
                                Ib();
                            }
                            if (this.G5) {
                                this.I8 = str;
                            } else {
                                Ba(null, str);
                            }
                        } else if (this.F5 == null && this.f45091d4 == 1) {
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.f45168j6, new m4.s0(13, this, data2), this.f45309ua);
                        } else {
                            v8();
                            SendMessagesHelper.prepareSendingPhoto(getAccountInstance(), null, data2, this.f45168j6, this.D5, this.f45166j4, this.B5, null, null, null, null, 0, this.F5, true, 0, this.f45091d4, O8());
                        }
                        E6();
                        return;
                    }
                    Ib();
                    return;
                } else if (i10 == 21) {
                    if (intent == null) {
                        Ib();
                        return;
                    }
                    if (this.F5 == null && this.f45091d4 == 1) {
                        if (intent.getData() != null) {
                            di.a3 a3Var4 = this.V1;
                            if (a3Var4 != null) {
                                a3Var4.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.f45168j6, new org.telegram.ui.Components.e5(this) {
                                public final wn f41422b;

                                {
                                    this.f41422b = this;
                                }

                                @Override
                                public final void G(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            wn wnVar = this.f41422b;
                                            wnVar.v8();
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                wnVar.vb(i12, arrayList, z10);
                                            }
                                            wnVar.E6();
                                            return;
                                        default:
                                            wn wnVar2 = this.f41422b;
                                            wnVar2.v8();
                                            wnVar2.rb(intent.getClipData(), z10, i12);
                                            wnVar2.E6();
                                            return;
                                    }
                                }
                            }, this.f45309ua);
                            return;
                        } else if (intent.getClipData() != null) {
                            di.a3 a3Var5 = this.V1;
                            if (a3Var5 != null) {
                                a3Var5.dismiss();
                            }
                            org.telegram.ui.Components.g5.L(getParentActivity(), this.f45168j6, new org.telegram.ui.Components.e5(this) {
                                public final wn f41422b;

                                {
                                    this.f41422b = this;
                                }

                                @Override
                                public final void G(int i12, int i13, boolean z10) {
                                    switch (r3) {
                                        case 0:
                                            wn wnVar = this.f41422b;
                                            wnVar.v8();
                                            Uri data3 = intent.getData();
                                            if (data3 != null) {
                                                ArrayList arrayList = new ArrayList();
                                                arrayList.add(data3);
                                                wnVar.vb(i12, arrayList, z10);
                                            }
                                            wnVar.E6();
                                            return;
                                        default:
                                            wn wnVar2 = this.f41422b;
                                            wnVar2.v8();
                                            wnVar2.rb(intent.getClipData(), z10, i12);
                                            wnVar2.E6();
                                            return;
                                    }
                                }
                            }, this.f45309ua);
                            return;
                        } else {
                            Ib();
                        }
                    } else {
                        v8();
                        if (intent.getData() != null) {
                            Uri data3 = intent.getData();
                            if (data3 != null) {
                                ArrayList arrayList = new ArrayList();
                                arrayList.add(data3);
                                vb(0, arrayList, true);
                            }
                        } else if (intent.getClipData() != null) {
                            rb(intent.getClipData(), true, 0);
                        } else {
                            Ib();
                        }
                    }
                    di.a3 a3Var6 = this.V1;
                    if (a3Var6 != null) {
                        a3Var6.dismiss();
                    }
                    E6();
                    return;
                } else if (i10 == 28 && (a3Var = this.V1) != null && (goVar = a3Var.m0) != null) {
                    org.telegram.ui.ActionBar.u6 u6Var = goVar.f30253a;
                    if (goVar.l1 != -1 && goVar.f28682k1 != null) {
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
                            org.telegram.messenger.wh.n(R.string.UnsupportedAttachment, new org.telegram.ui.Components.wc(goVar.f30254b.container, u6Var), u6Var);
                            return;
                        }
                        goVar.h0(goVar.l1, new th.c(uri));
                        org.telegram.ui.Components.nn nnVar = goVar.f28682k1;
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
            N7();
            di.a3 a3Var7 = this.V1;
            if (a3Var7 != null) {
                a3Var7.f33002j0.h0(i10, intent, this.f45193l8);
            }
            this.f45193l8 = null;
        }
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.u60 u60Var;
        org.telegram.ui.ActionBar.e2 e2Var;
        org.telegram.ui.Components.pf pfVar;
        org.telegram.ui.Components.nf nfVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        pm pmVar;
        bh.w wVar;
        org.telegram.ui.Components.qc qcVar = org.telegram.ui.Components.qc.f31854x;
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
        f41 f41Var = this.f45247pa;
        if (f41Var != null && !f41Var.f39154b0) {
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
            bh.x xVar = this.f45234oa;
            if (xVar != null && (wVar = xVar.f4196b) != null && wVar.getReactionsWindow() != null) {
                if (z10) {
                    xVar.f4196b.e();
                    return false;
                }
            } else if (ht.o().E) {
                if (z10) {
                    ht.o().m();
                    return false;
                }
            } else {
                el elVar = this.Va;
                if (elVar != null && elVar.f31269s) {
                    if (z10) {
                        elVar.a(true);
                        return false;
                    }
                } else if (this.Zc.f19326f) {
                    if (z10) {
                        bc(false);
                        return false;
                    }
                } else if (this.f45134g9 != null) {
                    if (z10) {
                        J7(true);
                        return false;
                    }
                } else if (!g7(z10, false)) {
                    if (o9()) {
                        if (z10 && (pmVar = this.f45282s9) != null && pmVar.x()) {
                            this.f45282s9.f(false);
                            return false;
                        }
                    } else {
                        org.telegram.ui.ActionBar.k kVar = this.actionBar;
                        if (kVar != null && kVar.q()) {
                            if (z10) {
                                I7(false);
                                return false;
                            }
                        } else {
                            jk jkVar = this.Y;
                            if (jkVar != null && jkVar.p0() && (jkVar.f25881f2 != 1 || (tL_replyKeyboardMarkup = jkVar.f25927n2) == null || !tL_replyKeyboardMarkup.is_persistent || jkVar.f25920m2 == null)) {
                                if (z10) {
                                    this.Y.i0(true);
                                    return false;
                                }
                            } else {
                                jk jkVar2 = this.Y;
                                if (jkVar2 != null && jkVar2.r()) {
                                    if (z10) {
                                        jk jkVar3 = this.Y;
                                        hi.i0 i0Var = jkVar3.f25915l0;
                                        if (i0Var != null) {
                                            i0Var.setOpened(false);
                                        }
                                        if (!jkVar3.f0() && (nfVar = jkVar3.m0) != null) {
                                            nfVar.c();
                                            return false;
                                        }
                                    }
                                } else {
                                    jk jkVar4 = this.Y;
                                    if (jkVar4 == null || (pfVar = jkVar4.E0) == null || !pfVar.closeCreationLinkDialog(z10)) {
                                        if (this.f45091d4 == 6 && (e2Var = jg.w.e) != null && e2Var.isShowing()) {
                                            if (z10) {
                                                jg.w.e.dismiss();
                                                return false;
                                            }
                                        } else if (ChatObject.isMonoForum(this.e) && !this.f45118f4 && this.f45089d2 != null && b() != 0) {
                                            if (z10) {
                                                this.f45089d2.n(0L, this.F7);
                                                return false;
                                            }
                                        } else if (this.f45091d4 == 5 && !"hello".equalsIgnoreCase(this.f45077c4) && !"away".equalsIgnoreCase(this.f45077c4) && (this.K6.isEmpty() || this.f45241p4 == 0)) {
                                            if (z10) {
                                                gc();
                                                return false;
                                            }
                                        } else if (this.f45091d4 == 6 && this.Y.s()) {
                                            if (z10) {
                                                Lb(new jf(this, 20));
                                                return false;
                                            }
                                        } else {
                                            org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                            if (kVar2 != null && kVar2.f22775n0) {
                                                if (z10) {
                                                    kVar2.g(true);
                                                    return false;
                                                }
                                            } else if (this.Xc.f19326f) {
                                                if (z10) {
                                                    Fa();
                                                }
                                            } else {
                                                if (z10 && (u60Var = this.f45214n3) != null) {
                                                    u60Var.a(false);
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
        x9();
        if (!getMessagesController().premiumFeaturesBlocked() && getMessagesController().transcribeAudioTrialWeeklyNumber <= 0 && !getMessagesController().didPressTranscribeButtonEnough() && !getUserConfig().isPremium() && (arrayList = this.K6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                MessageObject messageObject = (MessageObject) arrayList.get(i10);
                if (messageObject != null && !messageObject.isOutOwner() && ((messageObject.isVoice() || messageObject.isRoundVideo()) && !messageObject.isUnread() && (messageObject.isContentUnread() || ChatObject.isChannelAndNotMegaGroup(this.e)))) {
                    org.telegram.ui.Components.m41.u(messageObject, false);
                }
            }
        }
        this.R3 = false;
        y9();
        ArrayList arrayList2 = org.telegram.ui.Components.m41.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        qf.c cVar = this.f45056ac;
        if (cVar != null) {
            cVar.a(false);
            this.f45056ac = null;
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
        if (this.Eb) {
            jk jkVar = this.Y;
            if (jkVar != null) {
                jkVar.F0();
                jk jkVar2 = this.Y;
                jkVar2.T0 = false;
                org.telegram.ui.Components.dg dgVar = jkVar2.U0;
                if (dgVar != null) {
                    dgVar.u(false);
                }
            }
            this.Eb = false;
        }
        if (this.H1 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 1), 600L);
        }
        if (this.D4 && !this.E4) {
            this.E4 = true;
            org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(this).M(LocaleController.getString(R.string.VideoConversionTitle), LocaleController.getString(R.string.VideoConversionText), R.raw.convert_video);
            M.f31861j = 5000;
            M.f31873w = new le(this, 2);
            M.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        bh.x xVar = this.f45234oa;
        if (xVar != null && xVar.d()) {
            this.f45234oa.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        MessageObject playingMessageObject;
        long j10;
        long j11;
        lj ljVar = this.f45198m1;
        if (ljVar != null) {
            ViewTreeObserver viewTreeObserver = ljVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new zh(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        J7(true);
        if (!AndroidUtilities.isTablet()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.F1() || !PhotoViewer.v1().U1()) && (playingMessageObject = MediaController.getInstance().getPlayingMessageObject()) != null && playingMessageObject.isVideo()) {
                    PhotoViewer.v1().N2(null, this, this.f45309ua);
                    getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
                    MediaController.getInstance().cleanupPlayer(true, true, false, true);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i10 = playingMessageObject.type;
                    long j12 = 0;
                    if (i10 != 0) {
                        j10 = this.f45168j6;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = this.f45065b7;
                    } else {
                        j11 = 0;
                    }
                    if (i10 != 0) {
                        j12 = b();
                    }
                    if (v12.h2(playingMessageObject, null, null, null, null, null, null, 0, this.Wa, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.v1().l4 = this;
                    }
                    u9(false);
                    MediaController.getInstance().resetGoingToShowMessageObject();
                }
            } else if (PhotoViewer.F1() && PhotoViewer.v1().f35733l2) {
                PhotoViewer v13 = PhotoViewer.v1();
                if (v13.F2.y()) {
                    if (v13.Z2) {
                        v13.F2.N(false);
                    }
                    MediaController.getInstance().injectVideoPlayer(v13.F2, v13.T4);
                    v13.F2 = null;
                }
                PhotoViewer.v1().H0(false, true);
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
        rk rkVar = this.f45207ma;
        float f7 = 0.0f;
        if (z10 && this.f45147ha && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (r2Var instanceof wn) {
                this.P4 = true;
                wn wnVar = (wn) r2Var;
                wnVar.ja = this;
                this.fragmentView.setAlpha(0.0f);
                this.f45163j1.setSkipBackgroundDrawing(true);
                this.f45198m1.setTranslationY(AndroidUtilities.dp(8.0f));
                this.f45198m1.getAvatarImageView().setAlpha(0.0f);
                this.f45198m1.getAvatarImageView().setTranslationY(-AndroidUtilities.dp(8.0f));
                this.ia = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                jk jkVar = this.Y;
                if (jkVar != null) {
                    jkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                mk mkVar = this.R;
                if (mkVar != null) {
                    mkVar.measure(View.MeasureSpec.makeMeasureSpec(AndroidUtilities.displaySize.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                jk jkVar2 = this.Y;
                if (jkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = jkVar2.getMeasuredHeight();
                }
                mk mkVar2 = this.R;
                if (mkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = mkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                jk jkVar3 = wnVar.Y;
                if (jkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = jkVar3.getMeasuredHeight();
                }
                mk mkVar3 = this.R;
                if (mkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = mkVar3.getMeasuredHeight();
                }
                this.f45111ea = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new bh.b0(10, this, wnVar));
                Ac();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f45195la = animatorSet;
                animatorSet.addListener(new fi.m5(this, wnVar, runnable));
                this.f45195la.setDuration(300L);
                this.f45195la.setInterpolator(org.telegram.ui.Components.ds.f27530f);
                this.f45195la.playTogether(ofFloat2);
                AndroidUtilities.runOnUIThread(rkVar, 200L);
                return this.f45195la;
            }
        }
        if (this.f45374za && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (r2Var2 instanceof cf1) {
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
                this.Ba = f7;
                ofFloat.addUpdateListener(new yi(0, this));
                this.Aa = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                om omVar = this.f45163j1;
                if (omVar != null) {
                    omVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f45195la = animatorSet2;
                animatorSet2.addListener(new zi(this, z10, runnable));
                this.f45195la.setDuration(150L);
                this.f45195la.playTogether(ofFloat);
                if (z10) {
                    AndroidUtilities.runOnUIThread(rkVar, 200L);
                } else {
                    this.f45195la.start();
                }
                return this.f45195la;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.e2 e2Var = this.N;
        if (e2Var != null && dialog == e2Var) {
            getMessagesController().deleteDialog(this.f45168j6, 0);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.tv0 tv0Var;
        org.telegram.ui.Components.md mdVar = this.f45160ib;
        if (mdVar != null) {
            mdVar.d();
        }
        getMessagesController().setSkipPeerDialogOnLoad(this.classGuid, false);
        super.onFragmentDestroy();
        jh.e eVar = this.Z3;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f15939w;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                jh.d dVar = (jh.d) longSparseArray.valueAt(i10);
                if (dVar.f15927i) {
                    eVar.v.add(dVar.a());
                }
            }
            if (BuildVars.LOGS_ENABLED) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        jk jkVar = this.Y;
        if (jkVar != null) {
            jkVar.y0();
        }
        lj ljVar = this.f45198m1;
        if (ljVar != null && (tv0Var = ljVar.f31654c0) != null) {
            tv0Var.b(ljVar.G);
        }
        bk bkVar = this.U1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            this.U1.getAdapter().P();
        }
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.dismissInternal();
        }
        ht o10 = ht.o();
        if (o10.f39974l == this.A9) {
            o10.W = null;
            o10.f39962a0 = null;
            o10.Y = null;
            o10.f39974l = null;
            o10.f39966c0 = null;
            o10.s();
        }
        getNotificationCenter().onAnimationFinish(this.V9);
        NotificationCenter.getGlobalInstance().onAnimationFinish(this.W9);
        getNotificationCenter().onAnimationFinish(this.X9);
        getNotificationCenter().onAnimationFinish(this.Y9);
        y9();
        le leVar = this.f45064b6;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
            this.f45064b6 = null;
        }
        getNotificationCenter().removePostponeNotificationsCallback(this.Da);
        MessagesController messagesController = getMessagesController();
        long j10 = this.f45168j6;
        if (this.f45091d4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastCreatedDialogId(j10, z10, false);
        NotificationCenter.ObserversGroup observersGroup = this.f45270rb;
        if (observersGroup != null) {
            observersGroup.removeAllObservers();
            this.f45270rb = null;
        }
        getNotificationCenter().removeObserver(this, NotificationCenter.closeChats);
        if (this.f45091d4 == 0 && AndroidUtilities.isTablet()) {
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.openedChatChanged, Long.valueOf(this.f45168j6), Long.valueOf(b()), Boolean.TRUE);
        }
        if (this.f45113f != null) {
            MediaController.getInstance().stopMediaObserver();
        }
        FlagSecureReason flagSecureReason = this.Q3;
        if (flagSecureReason != null) {
            flagSecureReason.detach();
        }
        if (this.f45113f != null) {
            getMessagesController().cancelLoadFullUser(this.f45113f.f22177id);
        }
        AndroidUtilities.removeAdjustResize(getParentActivity(), this.classGuid);
        di.a3 a3Var2 = this.V1;
        if (a3Var2 != null) {
            a3Var2.B1();
            this.V1 = null;
        }
        AndroidUtilities.unlockOrientation(getParentActivity());
        if (ChatObject.isChannel(this.e)) {
            getMessagesController().startShortPoll(this.e, this.classGuid, true);
            TLRPC.ChatFull chatFull = this.f45245p8;
            if (chatFull != null && chatFull.linked_chat_id != 0) {
                getMessagesController().startShortPoll(getMessagesController().getChat(Long.valueOf(this.f45245p8.linked_chat_id)), this.classGuid, true);
            }
        }
        pm pmVar = this.f45282s9;
        if (pmVar != null) {
            pmVar.f(false);
        }
        tj tjVar = this.f45352y0;
        if (tjVar != null) {
            tjVar.N();
        }
        sk skVar = this.Ma;
        if (skVar != null) {
            skVar.b();
        }
        this.f45269ra = null;
        org.telegram.ui.ActionBar.j5 parentLayout = getParentLayout();
        if (parentLayout != null && parentLayout.getFragmentStack() != null) {
            int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f45042md ? 1 : 0);
            org.telegram.ui.ActionBar.j5 parentLayout2 = getParentLayout();
            if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                int i11 = 0;
                while (i11 < parentLayout2.getPulledDialogs().size()) {
                    if (((org.telegram.ui.Components.p9) parentLayout2.getPulledDialogs().get(i11)).f31528b > indexOf) {
                        parentLayout2.getPulledDialogs().remove(i11);
                        i11--;
                    }
                    i11++;
                }
            }
        }
        f45042md = false;
        qf.c cVar = this.f45056ac;
        if (cVar != null) {
            cVar.a(false);
            this.f45056ac = null;
        }
        this.f45335wa.onFragmentDestroy();
        a11 a11Var = this.f45281s8;
        if (a11Var != null) {
            a11Var.b(true);
            this.f45281s8 = null;
        }
        bi.m7 m7Var = this.Qc;
        if (m7Var != null) {
            m7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.Qc);
            this.Qc = null;
        }
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Kb = true;
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (playingMessageObject != null && playingMessageObject.isVideo()) {
            MediaController.getInstance().cleanupPlayer(true, true);
        } else {
            MediaController.getInstance().setTextureView(this.M8, null, null, false);
        }
        bi.m7 m7Var = this.Qc;
        if (m7Var != null) {
            m7Var.setMessageCell(null);
            AndroidUtilities.removeFromParent(this.Qc);
            this.Qc = null;
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
        jk jkVar = this.Y;
        boolean z12 = false;
        if (jkVar != null && i10 == 2 && jkVar.f25906j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                SendMessagesHelper.getInstance(jkVar.Q).sendCurrentLocation(jkVar.f25900i3, jkVar.f25906j3);
            }
            jkVar.f25906j3 = null;
            jkVar.f25900i3 = null;
        }
        bk bkVar = this.U1;
        if (bkVar != null && bkVar.getAdapter() != null) {
            ig.j1 adapter = this.U1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f14136w0;
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
                a3Var3.f33002j0.Z();
            }
            org.telegram.ui.Components.zp zpVar = this.f45269ra;
            if (zpVar != null && (tiVar = zpVar.X) != null) {
                tiVar.f33002j0.Z();
            }
        } else if ((i10 == 5 || i10 == 30) && (a3Var = this.V1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                a3Var.J1();
            }
        } else if ((i10 == 17 || i10 == 18) && (a3Var2 = this.V1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = a3Var2.f33002j0;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.V(z12);
            this.V1.f33002j0.Z();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity(), 0, this.f45309ua);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.AppName);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.PermissionNoAudioVideoWithHint);
                alertDialog$Builder.h(LocaleController.getString(R.string.PermissionOpenSettings), new qh(this));
                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ma(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Ma(2);
        } else if (((i10 != 101 && i10 != 102) || this.f45113f == null) && (i10 != 103 || this.e == null)) {
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
                    org.telegram.ui.Components.voip.g2.l(this.e, null, this.f45232o8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f45113f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f45255q8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.g2.m(user2, z11, z12, getParentActivity(), getMessagesController().getUserFull(this.f45113f.f22177id), getAccountInstance());
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
        org.telegram.ui.Components.y9[] y9VarArr;
        bh.r rVar;
        super.onResume();
        m7();
        this.U9 = System.currentTimeMillis();
        if (this.H9 && getSendMessagesHelper().getImportingHistory(this.f45168j6) != null) {
            org.telegram.ui.Components.i50 i50Var = new org.telegram.ui.Components.i50(getParentActivity(), null, this, this.f45309ua);
            i50Var.setOnHideListener(new pe(this, 0));
            showDialog(i50Var);
            this.H9 = false;
        }
        Q6();
        MediaController.getInstance().startRaiseToEarSensors(this);
        f7();
        di.a3 a3Var = this.V1;
        if (a3Var != null) {
            a3Var.E1();
        }
        om omVar = this.f45163j1;
        boolean z12 = true;
        if (omVar != null) {
            org.telegram.ui.Components.y91 y91Var = omVar.v;
            if (y91Var != null) {
                y91Var.c(true);
            }
            omVar.F = false;
        }
        if (getMessagesController().pendingSuggestions.contains("NEWCOMER_TICKS")) {
            AndroidUtilities.runOnUIThread(new le(this, 24), 1000L);
        }
        d9 d9Var = new d9(this, 2);
        this.zc = d9Var;
        setBulletinDelegate(d9Var);
        P6(false);
        TLRPC.PhotoSize photoSize = this.M5;
        if (photoSize != null && (rVar = this.f45045a0) != null) {
            ((org.telegram.ui.Components.dp[]) rVar.f4113b)[0].f27513f.k(ImageLocation.getForObject(photoSize, this.O5), "50_50", ImageLocation.getForObject(this.N5, this.O5), "50_50_b", this.K5, null, this.D5, this.L5);
        }
        if (this.S5 != null && (y9VarArr = this.N2) != null) {
            y9VarArr[0].k(ImageLocation.getForObject(this.S5, this.U5), "50_50", ImageLocation.getForObject(this.T5, this.U5), "50_50_b", this.P5, null, (MessageObject) this.V4.get(Integer.valueOf(this.X4)), this.Q5);
            y9VarArr[0].setHasBlur(this.R5);
        }
        if (this.f45091d4 == 0) {
            getNotificationsController().setOpenedDialogId(this.f45168j6, b());
        }
        MessagesController messagesController = getMessagesController();
        long j10 = this.f45168j6;
        if (this.f45091d4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.setLastVisibleDialogId(j10, z10, true);
        if (this.f45132g6) {
            if (this.f45156i6 && (messageObject = this.f45052a8) != null) {
                if (this.f45339x0 != null) {
                    int i10 = this.f45170j8;
                    if (i10 == -9000) {
                        i10 = X8(messageObject);
                    } else if (i10 == -10000) {
                        i10 = -AndroidUtilities.dp(11.0f);
                    } else {
                        z11 = true;
                        this.f45364z0.i1(this.K6.indexOf(this.f45052a8) + this.A0.J, i10, z11);
                    }
                    z11 = false;
                    this.f45364z0.i1(this.K6.indexOf(this.f45052a8) + this.A0.J, i10, z11);
                }
            } else {
                ba(false);
            }
            this.f45156i6 = false;
            this.f45132g6 = false;
            this.f45052a8 = null;
        }
        this.G5 = false;
        this.H5 = false;
        j7(false);
        if (this.I5) {
            this.I5 = false;
            hm hmVar = this.A0;
            if (hmVar != null) {
                hmVar.O(false);
            }
        }
        lj ljVar = this.f45198m1;
        if (ljVar != null) {
            ViewTreeObserver viewTreeObserver = ljVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new zh(this, viewTreeObserver));
        }
        G6(false, false);
        if (this.Y != null && this.f45091d4 == 0 && this.f45361ya != null) {
            if (!UserConfig.getInstance(this.currentAccount).isPremium() && UserConfig.getInstance(this.currentAccount).getClientUserId() != this.f45168j6 && (arrayList2 = this.f45361ya.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new g80(this, 3)).collect(Collectors.toCollection(new Object()));
            } else {
                arrayList = this.f45361ya.entities;
            }
            CharSequence n10 = ChatActivityEnterView.n(arrayList, this.f45361ya.message, this.Y.getEditField().getPaint().getFontMetricsInt());
            if (n10 != null && n10.length() > 0 && n10.charAt(0) == '@') {
                n10 = TextUtils.concat(" ", n10);
            }
            this.Y.b1(n10, true);
            this.f45361ya = null;
        }
        nk nkVar = this.f45046a1;
        if (nkVar != null && nkVar.getVisibility() != 0 && !this.actionBar.f22775n0 && this.f45091d4 != 7 && !org.telegram.ui.ActionBar.r2.hasSheets(this)) {
            this.Y.setFieldFocused(true);
        }
        jk jkVar2 = this.Y;
        if (jkVar2 != null) {
            jkVar2.B0();
        }
        if (this.f45113f != null) {
            this.F8 = System.currentTimeMillis();
            this.G8 = 0L;
        }
        if (this.I8 != null) {
            AndroidUtilities.runOnUIThread(new le(this, 3));
        }
        if (this.f45339x0 != null && ((jkVar = this.Y) == null || !jkVar.n0())) {
            this.f45339x0.setOnItemLongClickListener(this.f45055ab);
            this.f45339x0.setOnItemClickListener(this.f45069bb);
            this.f45339x0.setLongClickable(true);
        }
        org.telegram.ui.Components.v61.h = false;
        TLRPC.User user = this.f45113f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.v61.h = !UserObject.isReplyUser(user);
        } else {
            TLRPC.ChatFull chatFull = this.f45245p8;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.f45245p8.participants.participants.size()) {
                        TLRPC.User user2 = getMessagesController().getUser(Long.valueOf(this.f45245p8.participants.participants.get(i11).user_id));
                        if (user2 != null && user2.bot) {
                            org.telegram.ui.Components.v61.h = true;
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
                org.telegram.ui.Components.v61.h = z12;
            }
        }
        ed(false);
        Yb();
        if (this.f45097da != 0.0f) {
            this.f45097da = 0.0f;
            this.f45339x0.invalidate();
        }
        this.Q3.attach();
        bi.m7 m7Var = this.Qc;
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
                    ((eh.e) it.next()).f9973g0 = true;
                }
            }
            hh.d dVar2 = this.I;
            if (dVar2 != null) {
                Iterator it2 = dVar2.v.iterator();
                while (it2.hasNext()) {
                    ((eh.e) it2.next()).f9973g0 = true;
                }
            }
            Paint paint = this.W8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23637s8));
            }
            RadialProgressView radialProgressView = this.f45237p0;
            if (radialProgressView != null) {
                radialProgressView.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23454ic));
            }
            nk nkVar = this.f45046a1;
            if (nkVar != null) {
                nkVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.y6.Oh));
            }
            ok okVar = this.F0;
            if (okVar != null && okVar.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.y6.Oh)) != this.I0 || this.Cb != org.telegram.ui.ActionBar.y6.I.q())) {
                this.I0 = themedColor4;
                this.Cb = org.telegram.ui.ActionBar.y6.I.q();
                Drawable background = this.F0.getBackground();
                org.telegram.ui.ActionBar.y6.E1(background, themedColor4, false);
                org.telegram.ui.ActionBar.y6.E1(background, org.telegram.ui.ActionBar.o6.b(themedColor4), true);
            }
            ob();
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
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23401fe));
            }
            RadialProgressView radialProgressView3 = this.W2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23382ee));
            }
            org.telegram.ui.Components.aa0 aa0Var = this.f45116f2;
            if (aa0Var != null && this.P0) {
                aa0Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.y6.f23419ge));
            }
            if (this.M0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.y6.f23749y6)) != this.J0) {
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
            sh.c cVar = this.f45100dd;
            if (cVar != null && (i10 = this.Q0) >= 0) {
                cVar.setColor(getThemedColor(i10));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.y6.f23582p7);
                for (org.telegram.ui.ActionBar.u0 u0Var : set2) {
                    if (u0Var != null) {
                        u0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.y6.x0(null, org.telegram.ui.ActionBar.y6.f23582p7, false);
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
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.sd sdVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        if (z10) {
            if (!this.f45107e6) {
                this.f45107e6 = true;
                Lc();
            }
            iArr = this.V9 == 0 ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.messagesDidLoad} : new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog};
            this.f45093d6 = false;
            if (!z11) {
                this.f45120f6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = UserObject.isUserSelf(this.f45113f) ? new int[]{NotificationCenter.dialogsNeedReload, NotificationCenter.closeChats, NotificationCenter.botKeyboardDidLoad, NotificationCenter.needDeleteDialog, NotificationCenter.mediaDidLoad} : null;
            jk jkVar = this.Y;
            if (jkVar != null && (sdVar = jkVar.S1) != null) {
                AndroidUtilities.cancelRunOnUIThread(sdVar);
                jkVar.S1 = null;
            }
        }
        m7();
        this.V9 = getNotificationCenter().setAnimationInProgress(this.V9, iArr);
    }

    @Override
    public final void p() {
        if (!this.f45290t4) {
            if (this.f45113f != null) {
                TLRPC.User user = getMessagesController().getUser(Long.valueOf(this.f45113f.f22177id));
                if (user != null) {
                    this.f45113f = user;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat chat = getMessagesController().getChat(Long.valueOf(this.e.f22028id));
                if (chat != null) {
                    this.e = chat;
                } else {
                    return;
                }
            }
            lj ljVar = this.f45198m1;
            if (ljVar != null) {
                ljVar.b();
            }
        }
    }

    public final void p7(Runnable runnable, bg.a aVar, boolean z10) {
        if (aVar != null && z10) {
            q1 q1Var = new q1(this, aVar, runnable, 20);
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

    public final void p8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        lh.h hVar;
        org.telegram.ui.Cells.s1 s1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.Z8;
        if (view instanceof org.telegram.ui.Cells.s1) {
            org.telegram.ui.Cells.s1 s1Var2 = (org.telegram.ui.Cells.s1) view;
            s1Var2.setInvalidatesParent(z12);
            if (z12) {
                Za(s1Var2);
            }
        }
        this.f45163j1.invalidate();
        this.f45339x0.invalidate();
        AnimatorSet animatorSet = this.f45122f9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f45122f9.cancel();
        }
        this.f45122f9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.X8, f7);
        float f10 = 1.0f;
        if (z12) {
            this.f45053a9 = 1.0f;
            this.f45067b9 = 0.0f;
            ValueAnimator valueAnimator = this.Bc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.Y8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.in0.d(new xe(this, 3));
            }
        } else {
            float f11 = this.X8;
            this.f45067b9 = f11 / max;
            this.Y8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new eg(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f45313v1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f10));
        }
        this.f45122f9.playTogether(arrayList);
        this.f45122f9.setInterpolator(org.telegram.ui.Components.ds.h);
        this.f45122f9.setDuration(320L);
        View view2 = this.Z8;
        if (view2 instanceof org.telegram.ui.Cells.s1) {
            s1Var = (org.telegram.ui.Cells.s1) view2;
        } else {
            s1Var = null;
        }
        this.f45122f9.addListener(new ai.l0(this, z12, s1Var, 6));
        if (this.Z8 != null && this.f45053a9 <= 0.0f) {
            Db(null);
        }
        this.f45122f9.start();
    }

    public final void p9() {
        org.telegram.ui.Components.ju editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.q()) {
                this.f45086cd.h(5, false, true);
                this.actionBar.p();
            } else {
                return;
            }
        }
        this.f45253q6 = 0;
        this.f45292t6 = 0;
        this.r6 = 0;
        this.f45318v6 = 0;
        this.f45331w6 = 0;
        this.f45305u6 = 0;
        jk jkVar = this.Y;
        if (jkVar != null && (editField = jkVar.getEditField()) != null) {
            if (this.Y.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        pm pmVar = this.f45282s9;
        if (pmVar != null) {
            pmVar.f(true);
            SparseArray sparseArray = this.f45282s9.f25461p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        ml mlVar = this.x9;
        if (mlVar != null) {
            AndroidUtilities.cancelRunOnUIThread(mlVar.H);
            mlVar.a();
        }
        jk jkVar2 = this.Y;
        if (jkVar2 != null) {
            jkVar2.f25847a0 = false;
        }
        this.f45360y9 = false;
        if (this.Ab != null) {
            x9();
        }
    }

    public final void pa(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        MessageObject messageObject;
        MessagePreviewParams messagePreviewParams = this.f45317v5;
        if (messagePreviewParams != null && this.Va == null) {
            TLRPC.Peer peer = null;
            if (messagePreviewParams.linkMessage != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.W5;
                CharSequence fieldText = this.Y.getFieldText();
                MessageObject messageObject2 = this.D5;
                if (messageObject2 == this.f45166j4) {
                    messageObject = null;
                } else {
                    messageObject = messageObject2;
                }
                messagePreviewParams.updateLink(i11, webPage, fieldText, messageObject, this.B5, this.F5);
            }
            if (!this.f45317v5.isEmpty()) {
                this.Eb = this.Y.f25994z2;
                Context context = this.f45163j1.getContext();
                ch.b bVar = this.Q8;
                MessagePreviewParams messagePreviewParams2 = this.f45317v5;
                TLRPC.User user = this.f45113f;
                TLRPC.Chat chat = this.e;
                int i12 = this.currentAccount;
                un unVar = this.f45309ua;
                mn mnVar = this.B5;
                if (mnVar != null && mnVar.f41480f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                el elVar = new el(this, context, this, bVar, messagePreviewParams2, user, chat, i12, unVar, i10, z10);
                this.Va = elVar;
                this.f45317v5.attach(elVar);
                TLRPC.ChatFull chatFull = this.f45245p8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.f45348xa) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.f45348xa.peers.get(0).peer;
                }
                this.Va.setSendAsPeer(peer);
                m7();
                this.f45163j1.addView(this.Va);
                if (this.Eb) {
                    jk jkVar = this.Y;
                    jkVar.T0 = true;
                    org.telegram.ui.Components.dg dgVar = jkVar.U0;
                    if (dgVar != null) {
                        dgVar.u(true);
                    }
                    this.Y.o1();
                    this.P3 = true;
                }
                AndroidUtilities.setAdjustResizeToNothing(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void pb(TLRPC.Document document) {
        String findAnimatedEmojiEmoticon;
        if (document == null || (findAnimatedEmojiEmoticon = MessageObject.findAnimatedEmojiEmoticon(document, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f22034id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = findAnimatedEmojiEmoticon.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(findAnimatedEmojiEmoticon, this.f45168j6, this.D5, this.f45166j4, null, false, arrayList, null, null, true, 0, 0, null, false);
        of2.sendMessageChatArguments = O8();
        SendMessagesHelper.getInstance(this.currentAccount).sendMessage(of2);
        E6();
    }

    public final void pc() {
        long j10;
        le leVar = this.f45182k8;
        if (leVar != null) {
            AndroidUtilities.cancelRunOnUIThread(leVar);
        }
        le leVar2 = new le(this, 17);
        this.f45182k8 = leVar2;
        if (this.f45121f8 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        AndroidUtilities.runOnUIThread(leVar2, j10);
    }

    public final void q7() {
        if (this.L3 != null) {
            return;
        }
        fl flVar = new fl(this, getParentActivity(), this, this.f45309ua);
        this.L3 = flVar;
        this.f45163j1.addView(flVar, 17, org.telegram.ui.Components.kb1.h(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void q8(Runnable runnable) {
        NotificationCenter.getInstance(this.currentAccount).doOnIdle(runnable);
    }

    public final void q9() {
        if (getUserConfig().isPremium()) {
            org.telegram.ui.Components.wc.b0(this).c(LocaleController.getString(R.string.AdHidden)).j();
            getMessagesController().disableAds(true);
            Ra(this.f45291t5);
            Ta(this.f45291t5);
            return;
        }
        showDialog(new tg.y0((org.telegram.ui.ActionBar.r2) this, 3, true));
    }

    public final void qa(String str, boolean z10) {
        boolean z11;
        gk gkVar;
        boolean z12;
        org.telegram.ui.ActionBar.w0 w0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                V7();
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
                    AndroidUtilities.runOnUIThread(new se(this, str, 7), 200L);
                    return;
                }
                this.G3 = str;
                this.F3 = str;
                boolean contains = str.contains("@");
                a7(true);
                if (!this.actionBar.f22775n0) {
                    this.ad.a(true, true);
                    org.telegram.ui.ActionBar.w0 w0Var2 = this.f45137h0;
                    if (w0Var2 != null) {
                        w0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar = this.f45101e0;
                    if (yVar != null) {
                        yVar.f(8);
                    }
                    as asVar = this.f45087d0;
                    if (asVar != null) {
                        asVar.b(false);
                    }
                    org.telegram.ui.ActionBar.y yVar2 = this.f45150i0;
                    if (yVar2 != null) {
                        yVar2.f(8);
                    }
                    if ((this.f45241p4 == 0 || (i10 = this.f45091d4) == 3 || i10 == 8) && (w0Var = this.f45162j0) != null) {
                        w0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
                    if (w0Var3 != null && this.f45054aa) {
                        w0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.y yVar3 = this.f45211n0;
                    if (yVar3 != null && this.f45068ba) {
                        yVar3.f(8);
                    }
                    org.telegram.ui.ActionBar.w0 w0Var4 = this.f45174k0;
                    if (w0Var4 != null) {
                        w0Var4.setVisibility(8);
                    }
                    this.f45224o0 = true;
                    Wc(0, 0, -1);
                    yc(false);
                }
                uk ukVar = this.A1;
                if (ukVar != null) {
                    if (ukVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        ukVar.g(false);
                    }
                }
                ImageView imageView = this.f45117f3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!ChatObject.isChannelAndNotMegaGroup(this.e) || !ChatObject.isPublic(this.e) || this.G3 == null)) {
                    this.D1 = 0;
                } else {
                    this.D1 = 2;
                }
                this.f45155i5 = false;
                if (this.f45048a4 == 3) {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults(3);
                } else {
                    HashtagSearchController.getInstance(this.currentAccount).clearSearchResults();
                }
                fi.h1 h1Var = this.C1;
                if (h1Var != null) {
                    h1Var.h.clear();
                }
                org.telegram.ui.ActionBar.w0 w0Var5 = this.f45162j0;
                if (w0Var5 != null) {
                    this.Dc = true;
                    w0Var5.F(false);
                    this.Dc = false;
                }
                org.telegram.ui.ActionBar.w0 w0Var6 = this.f45162j0;
                if (w0Var6 != null) {
                    w0Var6.setSearchFieldCaption(null);
                    this.f45162j0.P(str, false);
                    this.f45162j0.setSearchFieldHint(LocaleController.getString(R.string.SearchHashtagsHint));
                }
                getMediaDataController().searchMessagesInChat(this.F3, this.f45168j6, this.f45065b7, this.classGuid, 0, this.f45241p4, false, this.A3, this.B3, false, this.C3);
                Pc(0, true);
                this.f45239p2.e(true, true);
                bc(true);
                gk gkVar2 = this.B1;
                if (gkVar2 != null) {
                    gkVar2.b(!contains);
                    Yc();
                }
                if ((contains || z10) && this.G3 != null && (gkVar = this.B1) != null) {
                    int currentPosition = gkVar.f28710a.getCurrentPosition();
                    int i11 = this.D1;
                    if (currentPosition != i11) {
                        this.B1.f28710a.d(i11, i11);
                    }
                }
                HashtagSearchController.getInstance(this.currentAccount).putToHistory(this.G3);
                this.F1.f31157f.O(true);
                View currentView = this.C1.getCurrentView();
                if (currentView instanceof yn) {
                    ((yn) currentView).f46049a.ad(this.G3);
                }
            }
        }
    }

    public final void qb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j10) {
        long j11;
        String str;
        bk bkVar = this.U1;
        if (bkVar == null) {
            return;
        }
        TLRPC.User user = bkVar.getAdapter().f14136w0;
        if (user != null) {
            j11 = user.f22177id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f22026id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.U1.getAdapter().f14136w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        SendMessagesHelper.prepareSendingBotContextResult(this, getAccountInstance(), botInlineResult, hashMap, this.f45168j6, this.D5, this.f45166j4, null, this.B5, z10, i10, 0, O8(), j10, a9());
        this.Y.setFieldText("");
        r9(false);
        getMediaDataController().increaseInlineRating(j11);
    }

    public final void qc() {
        AndroidUtilities.forEachViews((RecyclerView) this.f45339x0, (Utilities.Callback<View>) new bi.t8(5, this, E9()));
    }

    @Override
    public final void r(final MediaController.PhotoEntry photoEntry, final VideoEditedInfo videoEditedInfo, final boolean z10, final int i10, final int i11, final boolean z11, long j10) {
        if (photoEntry == null) {
            return;
        }
        this.Wc.a(false, true);
        MessageObject messageObject = this.F5;
        if (messageObject != null && messageObject.needResendWhenEdit() && !ChatObject.canManageMonoForum(this.currentAccount, this.F5.getDialogId())) {
            MessageSuggestionParams messageSuggestionParams = this.f45330w5;
            if (messageSuggestionParams == null) {
                messageSuggestionParams = MessageSuggestionParams.of(this.F5.messageOwner.suggested_post);
            }
            if (!bi.ca.U(this.currentAccount, messageSuggestionParams.amount)) {
                jc(messageSuggestionParams);
                return;
            }
        }
        if (videoEditedInfo != null && videoEditedInfo.roundVideo) {
            ig igVar = new ig(this, 0);
            this.G7 = igVar;
            AndroidUtilities.runOnUIThread(igVar, 3000L);
        }
        u8(photoEntry.caption, photoEntry.entities);
        org.telegram.ui.Components.g5.a0(this.currentAccount, a(), 1, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                Long l4 = (Long) obj;
                wn wnVar = wn.this;
                MessageObject messageObject2 = wnVar.F5;
                MediaController.PhotoEntry photoEntry2 = photoEntry;
                VideoEditedInfo videoEditedInfo2 = videoEditedInfo;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (messageObject2 != null && messageObject2.needResendWhenEdit()) {
                    MessageSuggestionParams messageSuggestionParams2 = wnVar.f45330w5;
                    if (messageSuggestionParams2 == null) {
                        messageSuggestionParams2 = MessageSuggestionParams.of(wnVar.F5.messageOwner.suggested_post);
                    }
                    MessageSuggestionParams messageSuggestionParams3 = messageSuggestionParams2;
                    if (photoEntry2.isVideo) {
                        SendMessagesHelper.prepareSendingVideo(wnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, wnVar.f45168j6, wnVar.F5, wnVar.f45166j4, null, wnVar.B5, photoEntry2.entities, photoEntry2.ttl, null, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, wnVar.O8(), photoEntry2.effectId, l4.longValue(), wnVar.a9(), messageSuggestionParams3);
                    } else if (photoEntry2.imagePath != null) {
                        SendMessagesHelper.prepareSendingPhoto(wnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, wnVar.f45168j6, wnVar.F5, wnVar.f45166j4, null, wnVar.B5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, wnVar.O8(), photoEntry2.effectId, l4.longValue(), wnVar.a9(), messageSuggestionParams3);
                    } else if (photoEntry2.path != null) {
                        SendMessagesHelper.prepareSendingPhoto(wnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, wnVar.f45168j6, wnVar.F5, wnVar.f45166j4, null, wnVar.B5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, null, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, wnVar.O8(), photoEntry2.effectId, l4.longValue(), wnVar.a9(), messageSuggestionParams3);
                    }
                } else if (photoEntry2.isVideo) {
                    SendMessagesHelper.prepareSendingVideo(wnVar.getAccountInstance(), photoEntry2.path, videoEditedInfo2, photoEntry2.coverPath, photoEntry2.coverPhoto, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, null, wnVar.B5, photoEntry2.entities, photoEntry2.ttl, wnVar.F5, z12, i12, i13, z13, photoEntry2.hasSpoiler, photoEntry2.caption, wnVar.O8(), photoEntry2.effectId, l4.longValue(), wnVar.a9(), wnVar.f45330w5);
                } else if (photoEntry2.imagePath != null) {
                    SendMessagesHelper.prepareSendingPhoto(wnVar.getAccountInstance(), photoEntry2.imagePath, photoEntry2.thumbPath, null, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, null, wnVar.B5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, wnVar.F5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, wnVar.O8(), photoEntry2.effectId, l4.longValue(), wnVar.a9(), wnVar.f45330w5);
                } else if (photoEntry2.path != null) {
                    SendMessagesHelper.prepareSendingPhoto(wnVar.getAccountInstance(), photoEntry2.path, photoEntry2.thumbPath, null, wnVar.f45168j6, wnVar.D5, wnVar.f45166j4, null, wnVar.B5, photoEntry2.entities, photoEntry2.stickers, null, photoEntry2.ttl, wnVar.F5, videoEditedInfo2, z12, i12, i13, 0, z13, photoEntry2.caption, wnVar.O8(), photoEntry2.effectId, l4.longValue(), wnVar.a9(), wnVar.f45330w5);
                }
                wnVar.E6();
            }
        }, j10);
    }

    public final void r7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.f45149hc > 1000) {
            z10 = true;
        }
        ig igVar = this.f45161ic;
        AndroidUtilities.cancelRunOnUIThread(igVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        AndroidUtilities.runOnUIThread(igVar, j10);
    }

    public final void r8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        MessageObject messageObject = this.F5;
        if (messageObject != null && (message = messageObject.messageOwner) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void r9(boolean z10) {
        Ob(false, null, null, null, true, 0, null, false, 0L, z10);
    }

    public final boolean ra(String str, org.telegram.ui.Cells.s1 s1Var, CharacterStyle characterStyle, int i10, int i11) {
        hi.v4 v4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic findTopic;
        if (this.e == null || str == null || this.f45091d4 != 0) {
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
                    if (f45038id == null) {
                        f45038id = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f45039jd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f45038id.matcher(str);
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
                                    this.J7 = true;
                                    if (this.f45091d4 == 2) {
                                        this.f45194l9.Q0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int W = LaunchActivity.W(parse);
                                    this.O7 = W;
                                    if (W >= 0) {
                                        this.P7 = parseInt;
                                    }
                                    kb(parseInt, i10, true, 0, false, 0, num, g7, v4Var);
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
                        Matcher matcher2 = f45039jd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3) && ChatObject.hasPublicLink(this.e, matcher2.group(2))) {
                                String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                if (!TextUtils.isEmpty(queryParameter2)) {
                                    this.f45333w8 = queryParameter2;
                                    X6(true);
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
                        if (this.f45091d4 == 2) {
                            this.f45194l9.Q0(intValue3);
                            finishFragment();
                            return true;
                        }
                        kb(intValue3, i10, true, 0, false, 0, null, null, v4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e11) {
                    e = e11;
                    z10 = false;
                }
            } else {
                try {
                    if (f45040kd == null) {
                        f45040kd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f45040kd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.e.f22028id || parseInt3 == 0) {
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
                            TLRPC.TL_forumTopic tL_forumTopic = this.f45228o4;
                            if (tL_forumTopic != null && tL_forumTopic.f22080id == findTopic.f22080id) {
                                return true;
                            }
                            return false;
                        }
                        this.J7 = true;
                        if (this.f45091d4 == 2) {
                            this.f45194l9.Q0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        kb(parseInt3, i10, true, 0, false, 0, num2, g10, v4Var);
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
            long j10 = this.e.f22028id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                na(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.J7 = true;
            if (this.f45091d4 == 2) {
                this.f45194l9.Q0(intValue9);
                finishFragment();
                return true;
            }
            kb(intValue9, i10, true, 0, false, 0, null, null, v4Var);
            return true;
        }
    }

    public final void rb(ClipData clipData, boolean z10, int i10) {
        int i11 = 0;
        if (this.F5 != null) {
            while (i11 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i11).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    vb(i10, arrayList, z10);
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
        vb(i10, arrayList2, z10);
    }

    public final void rc(boolean z10) {
        if (!getMessagesController().isDialogMuted(this.f45168j6, b())) {
            if (z10) {
                getNotificationsController().muteDialog(this.f45168j6, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.k3 E = org.telegram.ui.Components.g5.E(this.f45168j6, b(), this, this.f45309ua);
            E.setCalcMandatoryInsets(I9());
            showDialog(E);
            return;
        }
        getNotificationsController().muteDialog(this.f45168j6, b(), false);
        if (!z10) {
            org.telegram.ui.Components.wc.z(this, 4, 0, this.f45309ua).j();
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f45193l8 = bundle.getString("path");
    }

    public final void s7() {
        int j92 = (int) (j9(org.telegram.ui.Components.b41.f26732c) + this.S.getInputBubbleHeight() + this.v.d() + AndroidUtilities.dp(9.0f) + AndroidUtilities.dp(7.0f));
        this.X.setFadeZoneBottom(j92);
        int b10 = a8.ee.b(AndroidUtilities.dp(36.0f) + (this.f45163j1.getMeasuredHeight() - j92), 0, this.f45163j1.getMeasuredHeight());
        int measuredWidth = this.f45163j1.getMeasuredWidth();
        Rect rect = f45043nd;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Qa, this.f45339x0.getMeasuredWidth(), AndroidUtilities.dp(36.0f) + ((this.f45339x0.getMeasuredHeight() - this.Ra) - j92));
    }

    public final void s8() {
        MessagePreviewParams.Messages messages;
        MessageSuggestionParams messageSuggestionParams = this.f45330w5;
        if (messageSuggestionParams != null) {
            Tb(messageSuggestionParams);
            return;
        }
        TLRPC.WebPage webPage = this.W5;
        if (webPage != null) {
            Ub(true, webPage, false);
            return;
        }
        mn mnVar = this.B5;
        if (mnVar != null) {
            Sb(this.D5, mnVar);
            return;
        }
        MessageObject messageObject = this.D5;
        if (messageObject != null && messageObject != this.f45166j4) {
            Rb(messageObject);
            return;
        }
        MessagePreviewParams messagePreviewParams = this.f45317v5;
        if (messagePreviewParams != null && (messages = messagePreviewParams.forwardMessages) != null) {
            Qb(messages.messages);
            return;
        }
        MessageObject messageObject2 = this.F5;
        if (messageObject2 != null) {
            Pb(true, null, messageObject2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Ub(false, null, true);
        }
    }

    public final void s9(boolean z10) {
        if (this.f45165j3.getTag() != null && !this.f45240p3) {
            if (!this.f45315v3 || this.f45263r3) {
                this.f45165j3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f45276s3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f45276s3.playTogether(ObjectAnimator.ofFloat(this.f45165j3, View.ALPHA, 0.0f));
                    this.f45276s3.addListener(new si(this, 6));
                    this.f45276s3.setStartDelay(this.f45200m3);
                    this.f45276s3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f45276s3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f45276s3 = null;
                    }
                    this.f45165j3.setAlpha(0.0f);
                }
                this.f45200m3 = 500;
            }
        }
    }

    public final void sa(MessageObject messageObject) {
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
            presentFragment(new wn(bundle));
        }
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        jf jfVar = this.Ga;
        if (jfVar != null) {
            AndroidUtilities.cancelRunOnUIThread(jfVar);
        }
        jk jkVar = this.Y;
        if (jkVar != null && this.f45163j1 != null && jkVar.getAdjustPanLayoutHelper() != null && !this.Y.getAdjustPanLayoutHelper().f22968f) {
            this.Fa = this.f45163j1.getKeyboardHeight();
        } else {
            this.Fa = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f45193l8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        long j11;
        if (o7()) {
            if (!TextUtils.isEmpty(str)) {
                SendMessagesHelper.SendMessageParams of2 = SendMessagesHelper.SendMessageParams.of(str, this.f45168j6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                of2.sendMessageChatArguments = O8();
                of2.effect_id = j10;
                of2.invert_media = z11;
                of2.payStars = 0L;
                of2.monoForumPeer = a9();
                of2.suggestionParams = this.f45330w5;
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
                SendMessagesHelper.SendMessageParams of3 = SendMessagesHelper.SendMessageParams.of((TLRPC.User) obj, this.f45168j6, (MessageObject) null, (MessageObject) null, (TLRPC.ReplyMarkup) null, (HashMap<String, String>) null, z10, i10, 0);
                of3.sendMessageChatArguments = O8();
                of3.effect_id = j11;
                of3.invert_media = z11;
                of3.payStars = 0L;
                of3.monoForumPeer = a9();
                of3.suggestionParams = this.f45330w5;
                getSendMessagesHelper().sendMessage(of3);
                j11 = 0;
            }
            E6();
        }
    }

    public final void sc(org.telegram.ui.ActionBar.u0 u0Var, boolean z10) {
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
        jk jkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f45113f != null && this.f45211n0 != null) {
            TLRPC.UserFull userFull = getMessagesController().getUserFull(this.f45113f.f22177id);
            if (userFull != null && userFull.phone_calls_available) {
                this.f45068ba = !this.inPreviewMode;
                this.f45211n0.f(0);
            } else {
                this.f45068ba = false;
                this.f45211n0.f(8);
            }
        }
        lj ljVar = this.f45198m1;
        float f12 = 0.0f;
        if (ljVar != null) {
            ljVar.setOccupyStatusBar(!z10);
            lj ljVar2 = this.f45198m1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            ljVar2.setLayoutParams(org.telegram.ui.Components.kb1.h(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        jk jkVar2 = this.Y;
        if (jkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            jkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.uz0 uz0Var = this.f45238p1;
        if (uz0Var != null) {
            if (this.f45242p5 && !z10 && ((jkVar = this.Y) == null || !jkVar.f25995z3)) {
                i11 = 0;
            }
            uz0Var.setVisibility(i11);
        }
        bk bkVar = this.U1;
        if (bkVar != null) {
            ViewPropertyAnimator animate = bkVar.animate();
            if (!this.Y.f25995z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.ds.f27530f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                j2Var = new org.telegram.ui.ActionBar.j2(false);
            } else {
                j2Var = null;
            }
            kVar.setBackButtonDrawable(j2Var);
            org.telegram.ui.ActionBar.w0 w0Var = this.f45137h0;
            if (w0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                w0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.y yVar = this.f45101e0;
            if (yVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                yVar.f23277i = f12;
                org.telegram.ui.ActionBar.w0 w0Var2 = yVar.f23281m;
                if (w0Var2 != null) {
                    w0Var2.setAlpha(f12);
                }
            }
        }
        rj rjVar = this.f45339x0;
        if (rjVar != null) {
            int childCount = rjVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f45339x0.getChildAt(i12);
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
                        int i13 = this.B6 - 1;
                        this.B6 = i13;
                        if (i13 <= 0) {
                            this.B6 = 0;
                            this.C6 = true;
                            ac(false);
                        } else {
                            this.f45313v1.c(2, i13, true);
                        }
                        MessagesController messagesController = getMessagesController();
                        int id2 = messageObject.getId();
                        if (ChatObject.isChannel(this.e)) {
                            j10 = this.e.f22028id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.markMentionMessageAsRead(id2, j10, this.f45168j6);
                        messageObject.setContentIsRead();
                    }
                    if (z14) {
                        org.telegram.ui.Cells.s1 s1Var = (org.telegram.ui.Cells.s1) childAt;
                        s1Var.setHighlighted(false);
                        s1Var.Q3();
                    }
                }
            }
            this.f45339x0.setItemAnimator(null);
        }
        yc(false);
        bd();
        dk dkVar = this.f45164j2;
        if (dkVar != null) {
            if (!z10 && !this.f45124fb) {
                z12 = true;
            } else {
                z12 = false;
            }
            dkVar.setEnabled(z12);
        }
        dk dkVar2 = this.f45188l2;
        if (dkVar2 != null) {
            if (!z10 && !this.f45124fb) {
                z11 = true;
            } else {
                z11 = false;
            }
            dkVar2.setEnabled(z11);
        }
        gl glVar = this.J2;
        if (glVar != null) {
            glVar.setEnabled(!isInPreviewMode());
        }
        om omVar = this.f45163j1;
        if (omVar != null) {
            omVar.setOccupyStatusBar((this.inBubbleMode || this.f45124fb || this.inPreviewMode) ? false : false);
        }
    }

    public final void t7() {
        int i10;
        if (this.f45198m1 != null) {
            float actionModeFactor = (1.0f - this.ad.e) * (1.0f - this.actionBar.getActionModeFactor());
            float lerp = AndroidUtilities.lerp(0.95f, 1.0f, actionModeFactor);
            this.f45198m1.setScaleX(lerp);
            this.f45198m1.setScaleY(lerp);
            this.f45198m1.setAlpha(actionModeFactor);
            lj ljVar = this.f45198m1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            ljVar.setVisibility(i10);
        }
    }

    public final void t9(boolean z10) {
        if (this.f45177k3.getTag() != null && !this.f45251q3) {
            if (!this.f45328w3 || this.f45263r3) {
                this.f45177k3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f45302u3, 0.0f);
                    this.f45289t3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f45289t3.addUpdateListener(new ne(this, 1));
                    this.f45289t3.addListener(new si(this, 8));
                    this.f45289t3.setStartDelay(this.f45200m3);
                    this.f45289t3.start();
                } else {
                    ValueAnimator valueAnimator = this.f45289t3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f45289t3 = null;
                    }
                    this.f45302u3 = 0.0f;
                    Cc();
                }
                this.f45200m3 = 500;
            }
        }
    }

    public final void ta(MessageObject messageObject) {
        if (UserObject.isUserSelf(this.f45113f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = messageObject.messageOwner.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f45113f.f22177id) {
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
            presentFragment(new wn(bundle));
        }
    }

    public final void tb(ArrayList arrayList, int i10, boolean z10, boolean z11) {
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
            u8(((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).caption, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).entities);
            SendMessagesHelper.prepareSendingMedia(getAccountInstance(), arrayList2, this.f45168j6, this.D5, this.f45166j4, null, this.B5, z11, true, null, z10, i10, 0, this.f45091d4, ((SendMessagesHelper.SendingMediaInfo) arrayList2.get(0)).updateStickersOrder, null, O8(), 0L, false, 0L, a9(), this.f45330w5);
            E6();
            jk jkVar = this.Y;
            if (jkVar != null) {
                jkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.f45105e4 == -1) {
                this.f45105e4 = 0;
            }
            this.f45105e4 = arrayList.size() + this.f45105e4;
            Vc(true);
        }
    }

    public final void tc(MessageObject messageObject) {
        if (messageObject == null) {
            return;
        }
        org.telegram.ui.Components.qc qcVar = this.M3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f45291t5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(messageObject.getId()));
        int i10 = this.f45078c5;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.didLoadPinnedMessages, Long.valueOf(this.f45168j6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f45078c5 - 1), Boolean.valueOf(this.f45106e5));
        this.M3 = org.telegram.ui.Components.wc.B(this, false, new ai.h1(this, arrayList2, arrayList, i10, 16), new te(this, messageObject, 7), this.f45309ua).j();
    }

    public final void u7() {
        boolean z10;
        fi.h1 h1Var;
        if (this.f45296ta != null) {
            return;
        }
        int i10 = 0;
        if (this.Zc.e >= 1.0f && ((h1Var = this.C1) == null || h1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        bi.cc ccVar = this.f45163j1.L;
        if (!z10) {
            i10 = 4;
        }
        ccVar.setVisibility(i10);
    }

    public final void u8(CharSequence charSequence, ArrayList arrayList) {
        if (this.F5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                MessageObject messageObject = this.F5;
                messageObject.editingMessage = charSequence;
                messageObject.editingMessageEntities = arrayList;
            } else if (this.F5.isMediaEmpty()) {
                MessageObject messageObject2 = this.F5;
                messageObject2.editingMessage = "";
                messageObject2.editingMessageEntities = new ArrayList<>();
            } else {
                jk jkVar = this.Y;
                if (jkVar != null) {
                    this.F5.editingMessage = jkVar.getFieldText();
                    MessageObject messageObject3 = this.F5;
                    if (messageObject3.editingMessage == null && !TextUtils.isEmpty(messageObject3.messageOwner.message)) {
                        this.F5.editingMessage = "";
                    }
                }
            }
        }
    }

    public final void u9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.t40 t40Var = this.f45354y2;
            if (t40Var != null) {
                t40Var.b(true);
            }
            ej ejVar = this.f45275s2;
            if (ejVar != null) {
                ejVar.b(true);
            }
            org.telegram.ui.Components.t40 t40Var2 = this.f45301u2;
            if (t40Var2 != null) {
                t40Var2.b(true);
            }
        }
        org.telegram.ui.Components.t40 t40Var3 = this.f45341x2;
        if (t40Var3 != null) {
            t40Var3.b(true);
        }
        org.telegram.ui.Components.t40 t40Var4 = this.f45327w2;
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
        org.telegram.ui.Components.t40 t40Var7 = this.f45366z2;
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

    public final void ua(org.telegram.ui.Cells.s1 s1Var, MessageObject messageObject) {
        org.telegram.ui.Cells.s1 s1Var2;
        boolean z10;
        long j10;
        long j11;
        org.telegram.ui.Components.g6 animation;
        Bitmap m10;
        if (s1Var == null) {
            int childCount = this.f45339x0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f45339x0.getChildAt(i10);
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
            ub(messageObject, true);
        }
        if (messageObject.isVideo() && !messageObject.hasVideoQualities() && SharedConfig.streamMedia && messageObject.canStreamVideo() && !DialogObject.isEncryptedDialog(messageObject.getDialogId()) && !messageObject.mediaExists && !messageObject.attachPathExists) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            getFileLoader().startVideoStream(messageObject.getDocument(), messageObject);
        }
        PhotoViewer.v1().N2(null, this, this.f45309ua);
        MessageObject playingMessageObject = MediaController.getInstance().getPlayingMessageObject();
        if (s1Var2 != null && playingMessageObject != null && playingMessageObject.isVideo()) {
            getFileLoader().setLoadingVideoForPlayer(playingMessageObject.getDocument(), false);
            if (playingMessageObject.equals(messageObject) && (animation = s1Var2.getPhotoImage().getAnimation()) != null && this.M8 != null && this.J8.getTag() != null && (m10 = animation.m()) != null) {
                try {
                    Bitmap bitmap = this.M8.getBitmap(m10.getWidth(), m10.getHeight());
                    new Canvas(m10).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            MediaController.getInstance().cleanupPlayer(true, true, false, playingMessageObject.equals(messageObject));
        }
        int i11 = this.f45091d4;
        ol olVar = this.Wa;
        if (i11 == 1 && (messageObject.isVideo() || messageObject.type == 1)) {
            PhotoViewer.v1().l4 = this;
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = this.K6;
            int size = arrayList2.size();
            for (int i12 = 0; i12 < size; i12++) {
                MessageObject messageObject2 = (MessageObject) arrayList2.get(i12);
                if (messageObject2.isVideo() || messageObject2.type == 1) {
                    arrayList.add(0, messageObject2);
                }
            }
            PhotoViewer.v1().e2(arrayList, arrayList.indexOf(messageObject), this.f45168j6, 0L, b(), olVar);
        } else {
            PhotoViewer v12 = PhotoViewer.v1();
            int i13 = messageObject.type;
            long j12 = 0;
            if (i13 != 0) {
                j10 = this.f45168j6;
            } else {
                j10 = 0;
            }
            if (i13 != 0) {
                j11 = this.f45065b7;
            } else {
                j11 = 0;
            }
            if (i13 != 0) {
                j12 = b();
            }
            if (!v12.i2(messageObject, this, j10, j11, j12, olVar) && z10) {
                getFileLoader().cancelLoadFile(messageObject.getDocument());
            }
        }
        u9(false);
        MediaController.getInstance().resetGoingToShowMessageObject();
    }

    public final te ub(MessageObject messageObject, boolean z10) {
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
                getMessagesController().markMessageAsRead(this.f45168j6, messageObject.messageOwner.random_id, i11);
                return null;
            }
            getMessagesController().markMessageAsRead2(this.f45168j6, messageObject.getId(), null, i11, 0L, z11);
            return null;
        }
        return new te(this, messageObject, 1);
    }

    public final void uc() {
        boolean M9 = M9();
        SparseArray[] sparseArrayArr = this.f45203m6;
        if (!M9) {
            if (this.actionBar.q() && this.f45212n1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f45212n1.c(LocaleController.formatPluralString("MessagesSelected", sparseArrayArr[1].size() + sparseArrayArr[0].size(), new Object[0]), true, true);
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
    public final boolean v(final org.telegram.ui.ey r14, final java.util.ArrayList r15, final java.lang.CharSequence r16, boolean r17, final boolean r18, final int r19, final int r20, org.telegram.ui.cf1 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.v(org.telegram.ui.ey, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.cf1):boolean");
    }

    public final void v7() {
        float f7;
        org.telegram.ui.Components.nf nfVar;
        float inputBubbleHeight = this.S.getInputBubbleHeight() + AndroidUtilities.dp(15.0f) + j9(org.telegram.ui.Components.b41.f26732c) + this.v.d();
        jk jkVar = this.Y;
        if (jkVar != null && (nfVar = jkVar.m0) != null) {
            nfVar.setTranslationY(-inputBubbleHeight);
        }
        bk bkVar = this.U1;
        if (bkVar != null) {
            if (bkVar.g()) {
                f7 = AndroidUtilities.dp(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            bkVar.setTranslationY(f7);
        }
    }

    public final void v8() {
        CharSequence charSequence;
        jk jkVar = this.Y;
        if (jkVar != null) {
            charSequence = jkVar.getFieldText();
        } else {
            charSequence = null;
        }
        u8(charSequence, null);
    }

    public final void v9() {
        ValueAnimator valueAnimator = this.Gb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.v0 v0Var = this.f45189l3;
        if (v0Var != null && v0Var.getTag() != null) {
            this.f45189l3.setTag(null);
            org.telegram.ui.Cells.v0 v0Var2 = this.f45189l3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new df(this, v0Var2, 1));
            ofFloat.addListener(new bi.ce(14, this, v0Var2));
            ofFloat.setDuration(150L);
            this.Gb = ofFloat;
            ofFloat.start();
        }
    }

    public final void va(boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var;
        int i10;
        if (getParentActivity() != null && (j5Var = this.parentLayout) != null && j5Var.getLastFragment() == this && !this.T4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f22028id);
            } else {
                bundle.putLong("user_id", this.f45113f.f22177id);
            }
            bundle.putInt("chatMode", 2);
            wn wnVar = new wn(bundle);
            wnVar.T4 = new ArrayList(this.T4);
            wnVar.V4 = new HashMap(this.V4);
            int size = this.T4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.T4.get(i11);
                MessageObject messageObject = (MessageObject) this.V4.get(num);
                MessageObject messageObject2 = (MessageObject) this.E6[0].get(num.intValue());
                if (messageObject == null) {
                    messageObject = messageObject2;
                } else if (messageObject2 != null) {
                    messageObject.mediaExists = messageObject2.mediaExists;
                    messageObject.attachPathExists = messageObject2.attachPathExists;
                }
                if (messageObject != null) {
                    wnVar.V4.put(num, messageObject);
                    wnVar.Qc();
                }
            }
            wnVar.f45063b5 = this.f45063b5;
            if (this.f45290t4) {
                i10 = this.T4.size();
            } else {
                i10 = this.f45078c5;
            }
            wnVar.f45078c5 = i10;
            wnVar.f45106e5 = this.f45106e5;
            wnVar.f45255q8 = this.f45255q8;
            wnVar.f45245p8 = this.f45245p8;
            wnVar.f45194l9 = new jl(this, wnVar);
            if (z10) {
                presentFragmentAsPreview(wnVar);
                m7();
                return;
            }
            presentFragment(wnVar, false);
        }
    }

    public final void vb(int i10, ArrayList arrayList, boolean z10) {
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
                        Ib();
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
        v8();
        SendMessagesHelper.prepareSendingDocuments(getAccountInstance(), (ArrayList<String>) arrayList2, (ArrayList<String>) arrayList3, (ArrayList<Uri>) arrayList4, (String) null, (String) null, this.f45168j6, this.D5, this.f45166j4, (TL_stories.StoryItem) null, this.B5, this.F5, z10, i10, (t0.i) null, O8(), 0L, false, 0L);
        r9(false);
    }

    public final void vc() {
        om omVar = this.f45163j1;
        if (omVar != null && this.f45283sa == null) {
            if (this.f45309ua.h == null || omVar.getBackgroundImage() == null) {
                if (this.f45163j1.getBackgroundImage() == null || AndroidUtilities.isTablet()) {
                    this.f45163j1.U(org.telegram.ui.ActionBar.y6.s0());
                }
            }
        }
    }

    @Override
    public final boolean w() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void w7() {
        float d;
        boolean z10;
        if (this.f45339x0 != null) {
            if (this.f45124fb && this.f45296ta == null) {
                d = AndroidUtilities.navigationBarHeight;
            } else {
                d = this.v.d() + j9(org.telegram.ui.Components.b41.f26732c) + AndroidUtilities.dp(16.0f) + this.Ra + this.Tc;
            }
            int i10 = (int) this.I9;
            org.telegram.ui.Components.f41 f41Var = this.f45089d2;
            if (f41Var != null) {
                f41Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            jh.g gVar = this.f45325w0;
            if (!this.f45339x0.V1 && this.pb == 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            RecyclerView recyclerView = gVar.f15952a;
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
                RectF rectF = eVar.f15933b;
                rectF.set(j9(org.telegram.ui.Components.b41.f26731b), i10 - this.G, 0.0f, d - this.Ra);
                eVar.f15934c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void w8(boolean z10) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.f45245p8 != null && !ChatObject.isNotInChat(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.f45245p8;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f45259r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f45259r = chatParticipant.inviter_id;
                    return;
                }
                long clientUserId = getUserConfig().getClientUserId();
                int size = this.f45245p8.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f45245p8.participants.participants.get(i10);
                    if (chatParticipant2.user_id == clientUserId) {
                        this.f45259r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f45259r == 0) {
                getMessagesController().checkChatInviter(this.e.f22028id, false);
            }
        }
    }

    public final boolean w9(boolean z10) {
        gl glVar;
        gl glVar2 = this.J2;
        if (glVar2 == null || glVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.ch chVar = this.Y0;
        if (chVar != null && (glVar = this.J2) != null) {
            chVar.i(glVar, false, z10);
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

    public final void wa(int i10, boolean z10) {
        org.telegram.ui.ActionBar.j5 j5Var = this.parentLayout;
        if (j5Var != null && j5Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f22036id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f22028id);
                } else {
                    bundle.putLong("user_id", this.f45113f.f22177id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            wn wnVar = new wn(bundle);
            if (this.f45290t4) {
                pg.d.a(wnVar, MessagesStorage.TopicKey.of(a(), b()));
            }
            wnVar.f45194l9 = new nj(this);
            presentFragment(wnVar, false);
        }
    }

    public final void wb(MessageObject messageObject, org.telegram.ui.Cells.s1 s1Var, int i10, boolean z10) {
        boolean z11;
        MessageObject.GroupedMessages k92 = k9(messageObject);
        boolean z12 = false;
        if (k92 != null) {
            int i11 = 0;
            while (true) {
                if (i11 < k92.messages.size()) {
                    if (this.f45203m6[i10].indexOfKey(k92.messages.get(i11).getId()) < 0) {
                        break;
                    }
                    i11++;
                } else {
                    k92 = null;
                    break;
                }
            }
        }
        if (k92 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        s1Var.setDrawSelectionBackground(z11);
        if (k92 == null) {
            z12 = true;
        }
        s1Var.N3(true, z12, z10);
    }

    public final void wc() {
        TLRPC.User user;
        boolean z10;
        if (this.f45137h0 != null && (user = this.f45113f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f45294t8;
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
                this.f45137h0.S(30);
            } else {
                this.f45137h0.t(30);
            }
            if (z10) {
                this.f45137h0.S(31);
            } else {
                this.f45137h0.t(31);
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

    public final void x7() {
        FrameLayout frameLayout = this.f45074c1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.S.getInputBubbleHeight() + this.v.c() + AndroidUtilities.dp(9.0f)) * (-0.5f));
        }
    }

    public final void x8(org.telegram.messenger.MessageObject r60, java.util.ArrayList r61, java.util.ArrayList r62, java.util.ArrayList r63) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.x8(org.telegram.messenger.MessageObject, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void x9() {
        zk zkVar = this.Ab;
        if (zkVar == null) {
            return;
        }
        this.Ab = null;
        zkVar.e();
        if (zkVar.getReactionsWindow() != null && zkVar.getReactionsWindow().f4047a != null) {
            zkVar.getReactionsWindow().f4047a.animate().alpha(0.0f).setDuration(180L).start();
        }
        zkVar.animate().alpha(0.01f).translationY(-AndroidUtilities.dp(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new ed(17, this, zkVar)).setDuration(180L).start();
    }

    public final void xa(TLRPC.Chat chat) {
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
        if (!this.actionBar.f22775n0) {
            this.ad.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f45137h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f45101e0;
            if (yVar != null) {
                yVar.f(8);
            }
            as asVar = this.f45087d0;
            if (asVar != null) {
                asVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f45150i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f45162j0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.f45054aa) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f45211n0;
            if (yVar3 != null && this.f45068ba) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f45174k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f45224o0 = true;
            Wc(0, 0, -1);
            yc(false);
            ImageView imageView = this.f45104e3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f45117f3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f45162j0;
        if (w0Var5 != null) {
            this.Dc = true;
            this.f45155i5 = false;
            w0Var5.F(false);
            this.Dc = false;
        }
        mb(chat, null);
        Pc(0, true);
    }

    public final void xb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f45309ua != null && this.f45283sa == null) {
            hg.b c10 = hg.b.c(chatTheme);
            ChatThemeController chatThemeController = ChatThemeController.getInstance(this.currentAccount);
            chatThemeController.setDialogTheme(this.f45168j6, chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                chatThemeController.putThemeIfNeeded(chatTheme);
                org.telegram.ui.ActionBar.h4 theme = chatThemeController.getTheme(c10);
                if (theme == null) {
                    theme = new org.telegram.ui.ActionBar.h4(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    theme.k();
                    theme.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.h4 h4Var = theme;
                un unVar = this.f45309ua;
                TLRPC.WallPaper wallPaper = unVar.f44060g;
                if (this.f45120f6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                unVar.q(h4Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                chatThemeController.requestChatTheme(c10, new qe(this, 16));
            }
            TLRPC.WallPaper dialogWallpaper = chatThemeController.getDialogWallpaper(this.f45168j6);
            un unVar2 = this.f45309ua;
            org.telegram.ui.ActionBar.h4 h4Var2 = unVar2.f44059f;
            if (this.f45120f6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            unVar2.q(h4Var2, dialogWallpaper, z10, null, false);
        }
    }

    public final void xc() {
        if (this.f45089d2 == null) {
            return;
        }
        this.f45089d2.setSideMenuBackgroundMarginBottom(((this.S.getInputBubbleHeight() + AndroidUtilities.dp(9.0f)) - AndroidUtilities.dp(5.0f)) + this.v.d());
    }

    public final void y6(MessageObject messageObject, Integer num) {
        MessageObject messageObject2 = messageObject.replyMessageObject;
        if (messageObject2 != null) {
            int id2 = messageObject2.getId();
            SparseArray sparseArray = this.G6;
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

    public final void y7() {
        int i10;
        float f7 = this.f45071bd.e;
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

    public final int y8() {
        int i10;
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        int i11;
        ArrayList arrayList4 = this.K6;
        ArrayList arrayList5 = new ArrayList(arrayList4.size());
        int indexOf = arrayList4.indexOf(this.Z7);
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
                if (!messageObject2.isSponsored() || messageObject2.hasValidGroupIdFast() || messageObject2 == this.Z7) {
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
                        if (Math.abs(i19 - indexOf) > this.f45173jc + 1 && Math.abs(i20 - i11) > this.f45173jc + 1 && Math.abs(i21 - (intValue + i14)) > AndroidUtilities.displaySize.y) {
                            i25 = -1;
                        }
                    }
                    if (i18 == i25 || (Math.abs(i18 - indexOf) > this.f45173jc + 1 && Math.abs(i23 - i11) > this.f45173jc + 1 && Math.abs(i22 - i14) > AndroidUtilities.displaySize.y)) {
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
            if (messageObject3.isSponsored() || messageObject3.hasValidGroupIdFast() || messageObject3 == this.Z7) {
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
                    if (Math.abs(i33 - i26) >= this.f45173jc + 1 && Math.abs(i34 - i27) >= this.f45173jc + 1 && Math.abs(i35 - (intValue3 + i28)) > AndroidUtilities.displaySize.y) {
                        i36 = -1;
                    }
                }
                if (i30 == i36 || (Math.abs(i30 - i26) >= this.f45173jc + 1 && Math.abs(i32 - i27) >= this.f45173jc + 1 && Math.abs(i31 - i28) > AndroidUtilities.displaySize.y)) {
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

    public final void y9() {
        UndoView undoView = this.K3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.qc qcVar = this.M3;
        if (qcVar != null) {
            qcVar.c(0L, false);
        }
        fl flVar = this.L3;
        if (flVar != null) {
            flVar.d(0, true);
        }
    }

    public final void ya(String str) {
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
        if (!this.actionBar.f22775n0) {
            this.ad.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f45137h0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f45101e0;
            if (yVar != null) {
                yVar.f(8);
            }
            as asVar = this.f45087d0;
            if (asVar != null) {
                asVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f45150i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            if ((this.f45241p4 == 0 || (i11 = this.f45091d4) == 3 || i11 == 8) && (w0Var = this.f45162j0) != null) {
                w0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.f45054aa) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f45211n0;
            if (yVar3 != null && this.f45068ba) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f45174k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f45224o0 = true;
            Wc(0, 0, -1);
            yc(false);
        }
        if ((this.f45241p4 == 0 || this.f45290t4 || (i10 = this.f45091d4) == 3 || i10 == 8) && !UserObject.isReplyUser(this.f45113f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f45155i5 = z11;
            org.telegram.ui.ActionBar.w0 w0Var5 = this.f45162j0;
            if (w0Var5 != null) {
                w0Var5.F(z11);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var6 = this.f45162j0;
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
        mediaDataController.searchMessagesInChat(str2, this.f45168j6, this.f45065b7, this.classGuid, 0, this.f45241p4, false, this.A3, this.B3, !TextUtils.isEmpty(str), this.C3);
        Pc(0, true);
    }

    public final void yb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                yb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f45339x0 && view != this.f45163j1) {
            view.setEnabled(z10);
        }
    }

    public final void yc(boolean r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.yc(boolean):void");
    }

    @Override
    public final void z(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            sh.c cVar = this.f45100dd;
            if (cVar != null) {
                this.f45163j1.removeView(cVar);
                this.f45100dd = null;
            }
            jk jkVar = this.Y;
            if (jkVar != null) {
                jkVar.E0();
            }
        }
    }

    public final void z6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wn.z6():void");
    }

    public final void z7() {
        if (this.f45163j1 == null) {
            return;
        }
        this.Tc = I6(false);
        this.Uc = I6(true);
        this.S.setInputBubbleHeight(this.Tc);
        Nc();
        xc();
        v7();
        s7();
        x7();
        w7();
    }

    public final void z9() {
        boolean z10;
        Wc(0, 0, -1);
        getMediaDataController().searchMessagesInChat(this.F3, this.f45168j6, this.f45065b7, this.classGuid, 0, this.f45241p4, this.A3, this.B3, this.C3);
        if (TextUtils.isEmpty(this.F3) && this.C3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.E3 = z10;
        this.f45224o0 = z10;
        yc(false);
        Zc();
    }

    public final void za(TLRPC.User user) {
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
            AndroidUtilities.runOnUIThread(new wg(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f22775n0) {
            this.ad.a(true, true);
            org.telegram.ui.ActionBar.w0 w0Var = this.f45137h0;
            if (w0Var != null) {
                w0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar = this.f45101e0;
            if (yVar != null) {
                yVar.f(8);
            }
            as asVar = this.f45087d0;
            if (asVar != null) {
                asVar.b(false);
            }
            org.telegram.ui.ActionBar.y yVar2 = this.f45150i0;
            if (yVar2 != null) {
                yVar2.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var2 = this.f45162j0;
            if (w0Var2 != null) {
                w0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.w0 w0Var3 = this.m0;
            if (w0Var3 != null && this.f45054aa) {
                w0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.y yVar3 = this.f45211n0;
            if (yVar3 != null && this.f45068ba) {
                yVar3.f(8);
            }
            org.telegram.ui.ActionBar.w0 w0Var4 = this.f45174k0;
            if (w0Var4 != null) {
                w0Var4.setVisibility(8);
            }
            this.f45224o0 = true;
            Wc(0, 0, -1);
            yc(false);
            ImageView imageView = this.f45104e3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f45117f3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.w0 w0Var5 = this.f45162j0;
        if (w0Var5 != null) {
            this.Dc = true;
            this.f45155i5 = false;
            w0Var5.F(false);
            this.Dc = false;
        }
        mb(null, user);
        Pc(0, true);
    }

    public final void zb(boolean z10) {
        Ab(z10, false, true);
    }

    public final void zc() {
        yc(false);
    }

    @Override
    public final void P() {
    }

    public void ia(boolean z10) {
    }
}
