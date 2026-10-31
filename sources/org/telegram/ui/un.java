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
import android.os.Vibrator;
import android.text.Editable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.ImageSpan;
import android.text.style.URLSpan;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.Pair;
import android.util.Property;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.Menu;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.VelocityTracker;
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
import java.io.FileOutputStream;
import java.io.InputStream;
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
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.Utilities;
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
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ChatActivityEnterView;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ClippingImageView;
import org.telegram.ui.Components.FragmentContextView;
import org.telegram.ui.Components.NumberTextView;
import org.telegram.ui.Components.PipRoundVideoView;
import org.telegram.ui.Components.RadialProgressView;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.Wallet.WalletEngine2;
public class un extends org.telegram.ui.ActionBar.k2 implements org.telegram.messenger.us, ux, tb0, org.telegram.ui.Components.nj, org.telegram.ui.Components.gg, fg.b, org.telegram.ui.Components.s40, fe.e {
    public static int f42169ad = 22;
    public static float f42170bd = 1.4f;
    public static int f42171cd = 10;
    public static Pattern f42172dd;
    public static Pattern f42173ed;
    public static Pattern f42174fd;
    public static final int[] f42175gd = {org.telegram.messenger.zs.f19724y, org.telegram.messenger.zs.f19730z, org.telegram.messenger.zs.A, org.telegram.messenger.zs.B, org.telegram.messenger.zs.Z, org.telegram.messenger.zs.C0, org.telegram.messenger.zs.f19691t0, org.telegram.messenger.zs.W0, org.telegram.messenger.zs.f19603e1, org.telegram.messenger.zs.T1, org.telegram.messenger.zs.G, org.telegram.messenger.zs.f19690t, org.telegram.messenger.zs.U, org.telegram.messenger.zs.E0, org.telegram.messenger.zs.F0, org.telegram.messenger.zs.f19735z4, org.telegram.messenger.zs.f19617g3, org.telegram.messenger.zs.f19669p4, org.telegram.messenger.zs.L};
    public static boolean f42176hd = false;
    public static final Rect f42177id = new Rect();
    public xj A0;
    public int A1;
    public org.telegram.ui.Components.q30 A2;
    public boolean A3;
    public int A4;
    public org.telegram.messenger.jj A5;
    public int A6;
    public boolean A7;
    public String A8;
    public ql A9;
    public TLRPC.TL_channels_sendAsPeers Aa;
    public ArrayList Ab;
    public int Ac;
    public yj B0;
    public org.telegram.ui.Components.wb B1;
    public org.telegram.ui.Components.q30 B2;
    public boolean B3;
    public xh B4;
    public kn B5;
    public int B6;
    public boolean B7;
    public org.telegram.messenger.jj B8;
    public boolean B9;
    public TL_account.resolvedBusinessChatLinks Ba;
    public ValueAnimator Bb;
    public int Bc;
    public fm C0;
    public wk C1;
    public org.telegram.ui.Components.q30 C2;
    public TLRPC.User C3;
    public final SparseArray C4;
    public boolean C5;
    public boolean C6;
    public boolean C7;
    public org.telegram.messenger.jj C8;
    public float C9;
    public boolean Ca;
    public boolean Cb;
    public int Cc;
    public jj D;
    public rk D0;
    public kk D1;
    public org.telegram.ui.Cells.q1 D2;
    public TLRPC.Chat D3;
    public final ArrayList D4;
    public org.telegram.messenger.jj D5;
    public final ArrayList D6;
    public int D7;
    public int D8;
    public fk D9;
    public boolean Da;
    public Boolean Db;
    public int Dc;
    public final je.b E;
    public boolean E0;
    public hk E1;
    public int E2;
    public sg.o0 E3;
    public int E4;
    public int E5;
    public final SparseArray[] E6;
    public int E7;
    public boolean E8;
    public org.telegram.ui.Cells.q1 E9;
    public float Ea;
    public boolean Eb;
    public boolean Ec;
    public final je.b F;
    public org.telegram.ui.Components.p80 F0;
    public int F1;
    public int F2;
    public boolean F3;
    public boolean F4;
    public org.telegram.messenger.jj F5;
    public final SparseArray F6;
    public boolean F7;
    public boolean F8;
    public org.telegram.ui.Components.xz F9;
    public final kg Fa;
    public boolean Fb;
    public long Fc;
    public final tg.f G;
    public TextView G0;
    public boolean G1;
    public org.telegram.ui.Components.q30 G2;
    public boolean G3;
    public boolean G4;
    public boolean G5;
    public final SparseArray G6;
    public mf G7;
    public String G8;
    public boolean G9;
    public final zk Ga;
    public int Gb;
    public TLRPC.TL_messages_discussionMessage Gc;
    public final int H;
    public org.telegram.ui.ActionBar.q2 H0;
    public org.telegram.ui.Components.l30 H1;
    public org.telegram.ui.Components.q30 H2;
    public String H3;
    public int H4;
    public boolean H5;
    public final HashMap H6;
    public String H7;
    public pk H8;
    public boolean H9;
    public int Ha;
    public HashMap Hb;
    public TLRPC.messages_Messages Hc;
    public final hi.f I;
    public RadialProgressView I0;
    public org.telegram.ui.ActionBar.x1 I1;
    public org.telegram.ui.Components.q30 I2;
    public String I3;
    public final ArrayList I4;
    public boolean I5;
    public final SparseArray I6;
    public boolean I7;
    public org.telegram.ui.Cells.q1 I8;
    public ValueAnimator I9;
    public int Ia;
    public mf Ib;
    public boolean Ic;
    public final hi.f J;
    public final int J0;
    public vh.p2 J1;
    public org.telegram.ui.Components.hp J2;
    public int J3;
    public final HashMap J4;
    public boolean J5;
    public final a0.h J6;
    public boolean J7;
    public k4 J8;
    public ValueAnimator J9;
    public mf Ja;
    public int Jb;
    public mn Jc;
    public tg.b K;
    public int K0;
    public vh.p2 K1;
    public View K2;
    public int K3;
    public org.telegram.messenger.jj K4;
    public int K5;
    public final ArrayList K6;
    public int K7;
    public TextureView K8;
    public boolean K9;
    public boolean Ka;
    public org.telegram.ui.ActionBar.x1 Kb;
    public fn Kc;
    public tg.b L;
    public int L0;
    public vh.p2 L1;
    public jl L2;
    public int L3;
    public int L4;
    public int L5;
    public final SparseArray L6;
    public int L7;
    public boolean L8;
    public float L9;
    public boolean La;
    public int Lb;
    public rh.i4 Lc;
    public final hi.g M;
    public int M0;
    public vh.p2 M1;
    public kg.f0 M2;
    public UndoView M3;
    public int M4;
    public TLRPC.PhotoSize M5;
    public final a0.h M6;
    public int M7;
    public final mf M8;
    public float M9;
    public long Ma;
    public int Mb;
    public boolean Mc;
    public tg.b N;
    public int N0;
    public vh.p2 N1;
    public org.telegram.ui.Components.ye0 N2;
    public il N3;
    public final ArrayList N4;
    public TLRPC.PhotoSize N5;
    public final a0.h N6;
    public int N7;
    public final hi.b N8;
    public int N9;
    public int Na;
    public boolean Nb;
    public boolean Nc;
    public org.telegram.ui.ActionBar.x1 O;
    public Drawable O0;
    public vh.p2 O1;
    public boolean O2;
    public org.telegram.ui.Components.wb O3;
    public mf O4;
    public TLObject O5;
    public final int[] O6;
    public int O7;
    public tg.b O8;
    public int O9;
    public int Oa;
    public int Ob;
    public float Oc;
    public boolean P;
    public Drawable P0;
    public wl P1;
    public final org.telegram.ui.Components.g9[] P2;
    public boolean P3;
    public boolean P4;
    public int P5;
    public final int[] P6;
    public int P7;
    public Bitmap P8;
    public float P9;
    public uk Pa;
    public boolean Pb;
    public float Pc;
    public FrameLayout Q;
    public Drawable Q0;
    public float Q1;
    public final tn[] Q2;
    public int Q3;
    public boolean Q4;
    public int Q5;
    public final int[] Q6;
    public boolean Q7;
    public BitmapShader Q8;
    public float Q9;
    public vk Qa;
    public int Qb;
    public final fe.b Qc;
    public kg.f0 R;
    public boolean R0;
    public TL_stories.TL_premium_boostsStatus R1;
    public final org.telegram.ui.ActionBar.u5[] R2;
    public boolean R3;
    public boolean R4;
    public boolean R5;
    public final int[] R6;
    public int R7;
    public Paint R8;
    public float R9;
    public boolean Ra;
    public int Rb;
    public final fe.b Rc;
    public pk S;
    public int S0;
    public org.telegram.messenger.h3 S1;
    public final jn[] S2;
    public org.telegram.messenger.o6 S3;
    public int S4;
    public TLRPC.PhotoSize S5;
    public final boolean[] S6;
    public int S7;
    public Matrix S8;
    public float S9;
    public float Sa;
    public int Sb;
    public final fe.b Sc;
    public zg.e T;
    public final Set T0;
    public boolean T1;
    public NumberTextView T2;
    public boolean T3;
    public ArrayList T4;
    public TLRPC.PhotoSize T5;
    public final boolean[] T6;
    public int T7;
    public Paint T8;
    public float T9;
    public int Ta;
    public CharacterStyle Tb;
    public final fe.b Tc;
    public View U;
    public final Set U0;
    public mf U1;
    public int U2;
    public org.telegram.messenger.jj U3;
    public int U4;
    public TLObject U5;
    public final boolean[] U6;
    public boolean U7;
    public final Paint U8;
    public TLRPC.Document U9;
    public int Ua;
    public String Ub;
    public final fe.b Uc;
    public FrameLayout V;
    public AnimatorSet V0;
    public ImageView V1;
    public final AnimatorSet[] V2;
    public int V3;
    public HashMap V4;
    public int V5;
    public boolean V6;
    public boolean V7;
    public float V8;
    public boolean V9;
    public li.k Va;
    public gf.e Vb;
    public final fe.b Vc;
    public FrameLayout W;
    public boolean W0;
    public ek W1;
    public boolean W2;
    public org.telegram.messenger.jj W3;
    public final SparseArray W4;
    public TLRPC.WebPage W5;
    public boolean W6;
    public boolean W7;
    public boolean W8;
    public boolean W9;
    public ValueAnimator Wa;
    public boolean Wb;
    public final fe.b Wc;
    public final zg.i X;
    public vh.p2 X0;
    public ag.v X1;
    public ImageView X2;
    public org.telegram.messenger.jj X3;
    public int X4;
    public ArrayList X5;
    public boolean X6;
    public int X7;
    public View X8;
    public long X9;
    public float Xa;
    public me Xb;
    public final j6.m Xc;
    public bh.i Y;
    public vh.p2 Y0;
    public org.telegram.ui.ActionBar.m0 Y1;
    public RadialProgressView Y2;
    public org.telegram.ui.Components.voip.i0 Y3;
    public final int[] Y4;
    public String Y5;
    public boolean Y6;
    public boolean Y7;
    public float Y8;
    public int Y9;
    public hl Ya;
    public boolean Yb;
    public ih.d Yc;
    public mk Z;
    public vh.p2 Z0;
    public TextView Z1;
    public ImageView Z2;
    public ag.b1 Z3;
    public int Z4;
    public j9.u Z5;
    public int Z6;
    public org.telegram.messenger.jj Z7;
    public float Z8;
    public int Z9;
    public final rl Za;
    public boolean Zb;
    public final Rect Zc;
    public int f42178a;
    public nk f42179a0;
    public org.telegram.ui.Components.hg f42180a1;
    public boolean a2;
    public AnimatorSet f42181a3;
    public zf.b1 f42182a4;
    public boolean f42183a5;
    public TLRPC.ChatInvite f42184a6;
    public int f42185a7;
    public org.telegram.messenger.jj f42186a8;
    public Integer f42187a9;
    public int f42188aa;
    public final xl f42189ab;
    public final RectF f42190ac;
    public boolean f42191b;
    public jg.l0 f42192b0;
    public boolean f42193b1;
    public TextView f42194b2;
    public FrameLayout f42195b3;
    public zg.d f42196b4;
    public int f42197b5;
    public me f42198b6;
    public long f42199b7;
    public int f42200b8;
    public int f42201b9;
    public int f42202ba;
    public ArrayList f42203bb;
    public org.telegram.ui.ActionBar.x1 f42204bc;
    public boolean f42205c;
    public int f42206c0;
    public qk f42207c1;
    public TextView f42208c2;
    public ci f42209c3;
    public int f42210c4;
    public int f42211c5;
    public final LongSparseIntArray f42212c6;
    public boolean f42213c7;
    public boolean f42214c8;
    public boolean f42215c9;
    public boolean f42216ca;
    public final ii f42217cb;
    public long f42218cc;
    public boolean d;
    public org.telegram.ui.ActionBar.r0 f42219d0;
    public bh.e f42220d1;
    public xk f42221d2;
    public TextView f42222d3;
    public TL_account.TL_businessChatLink f42223d4;
    public boolean f42224d5;
    public boolean f42225d6;
    public long f42226d7;
    public boolean f42227d8;
    public AnimatorSet f42228d9;
    public boolean f42229da;
    public final pi f42230db;
    public final lg f42231dc;
    public TLRPC.Chat e;
    public cs f42232e0;
    public FrameLayout f42233e1;
    public TextView f42234e2;
    public TextView f42235e3;
    public String f42236e4;
    public boolean f42237e5;
    public boolean f42238e6;
    public final ArrayList e7;
    public long f42239e8;
    public org.telegram.ui.ActionBar.k1 f42240e9;
    public boolean f42241ea;
    public final fj eb;
    public int f42242ec;
    public TLRPC.User f42243f;
    public org.telegram.ui.ActionBar.x f42244f0;
    public LinearLayout f42245f1;
    public org.telegram.ui.Components.o21 f42246f2;
    public pk f42247f3;
    public int f42248f4;
    public AnimatorSet f42249f5;
    public long f42250f6;
    public final Paint f7;
    public String f42251f8;
    public boolean f42252f9;
    public ih.e f42253fa;
    public final gn f42254fb;
    public boolean f42255fc;
    public org.telegram.ui.ActionBar.r0 f42256g0;
    public org.telegram.ui.Components.xn f42257g1;
    public ag.j f42258g2;
    public ImageView f42259g3;
    public int f42260g4;
    public final SparseIntArray f42261g5;
    public boolean f42262g6;
    public final Paint f42263g7;
    public Integer f42264g8;
    public org.telegram.ui.ActionBar.b1[] f42265g9;
    public float f42266ga;
    public final lg gb;
    public Pattern gc;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.r0 f42267h0;
    public wi f42268h1;
    public org.telegram.ui.Components.p80 f42269h2;
    public ImageView f42270h3;
    public boolean f42271h4;
    public final SparseIntArray f42272h5;
    public boolean f42273h6;
    public final ColorMatrix f42274h7;
    public byte[] f42275h8;
    public org.telegram.ui.ActionBar.b1 f42276h9;
    public float ha;
    public final lg f42277hb;
    public org.telegram.messenger.jj f42278hc;
    public org.telegram.ui.ActionBar.t0 f42279i0;
    public ag.k3 f42280i1;
    public ImageView f42281i2;
    public org.telegram.ui.Components.f6 f42282i3;
    public String f42283i4;
    public boolean f42284i5;
    public boolean f42285i6;
    public final m.c3 f42286i7;
    public int f42287i8;
    public final jk f42288i9;
    public tp ia;
    public boolean f42289ib;
    public ff f42290ic;
    public org.telegram.ui.ActionBar.t0 f42291j0;
    public ag.u0 f42292j1;
    public xh.k f42293j2;
    public org.telegram.ui.Components.f6 f42294j3;
    public byte[] f42295j4;
    public boolean f42296j5;
    public long f42297j6;
    public final org.telegram.ui.ActionBar.c5 f42298j7;
    public int f42299j8;
    public gm f42300j9;
    public Animator f42301ja;
    public boolean f42302jb;
    public ArrayList f42303jc;
    public org.telegram.ui.ActionBar.t0 f42304k0;
    public zg.h f42305k1;
    public TextView f42306k2;
    public org.telegram.ui.Components.f6 f42307k3;
    public String f42308k4;
    public boolean f42309k5;
    public Long f42310k6;
    public long f42311k7;
    public me f42312k8;
    public sk f42313k9;
    public boolean f42314ka;
    public long f42315kb;
    public final m4.c f42316kc;
    public org.telegram.ui.ActionBar.t0 f42317l0;
    public km l1;
    public gk f42318l2;
    public dk f42319l3;
    public org.telegram.messenger.jj l4;
    public boolean f42320l5;
    public int f42321l6;
    public int f42322l7;
    public String f42323l8;
    public int f42324l9;
    public boolean f42325la;
    public xa.n f42326lb;
    public final zg.a f42327lc;
    public org.telegram.ui.Components.t11 m0;
    public org.telegram.ui.Components.tn f42328m1;
    public FrameLayout f42329m2;
    public ck f42330m3;
    public org.telegram.messenger.jj f42331m4;
    public boolean f42332m5;
    public final SparseArray[] f42333m6;
    public int f42334m7;
    public org.telegram.messenger.u3 f42335m8;
    public int f42336m9;
    public un f42337ma;
    public boolean f42338mb;
    public boolean f42339mc;
    public boolean f42340n;
    public org.telegram.ui.ActionBar.r0 f42341n0;
    public final ArrayList f42342n1;
    public gk f42343n2;
    public org.telegram.ui.Cells.s0 f42344n3;
    public boolean f42345n4;
    public boolean f42346n5;
    public final SparseArray[] f42347n6;
    public final Matrix f42348n7;
    public boolean f42349n8;
    public int f42350n9;
    public float f42351na;
    public int f42352nb;
    public boolean f42353nc;
    public org.telegram.ui.ActionBar.t0 f42354o0;
    public qj f42355o1;
    public FrameLayout f42356o2;
    public int f42357o3;
    public ArrayList f42358o4;
    public long f42359o5;
    public final SparseArray[] f42360o6;
    public LinearGradient f42361o7;
    public boolean f42362o8;
    public boolean f42363o9;
    public AnimatorSet f42364oa;
    public int f42365ob;
    public boolean f42366oc;
    public org.telegram.ui.ActionBar.x f42367p0;
    public org.telegram.ui.Components.f6 f42368p1;
    public TextView f42369p2;
    public org.telegram.ui.Components.j50 f42370p3;
    public org.telegram.messenger.jj f42371p4;
    public boolean p5;
    public boolean f42372p6;
    public int f42373p7;
    public TLRPC.ChatFull f42374p8;
    public boolean p9;
    public final ci f42375pa;
    public boolean f42376pb;
    public long f42377pc;
    public boolean f42378q0;
    public ih f42379q1;
    public org.telegram.ui.Components.zz f42380q2;
    public View f42381q3;
    public TLRPC.TL_forumTopic f42382q4;
    public boolean f42383q5;
    public int q6;
    public int f42384q7;
    public TLRPC.UserFull f42385q8;
    public lm f42386q9;
    public mh.l f42387qa;
    public boolean f42388qb;
    public boolean qc;
    public long f42389r;
    public RadialProgressView f42390r0;
    public org.telegram.ui.Components.sx0 f42391r1;
    public org.telegram.ui.Components.dw0 f42392r2;
    public boolean f42393r3;
    public long f42394r4;
    public boolean f42395r5;
    public int f42396r6;
    public final Paint f42397r7;
    public org.telegram.ui.Cells.i6 f42398r8;
    public View f42399r9;
    public sg.s f42400ra;
    public a0.h f42401rb;
    public boolean rc;
    public final HashMap f42402s;
    public org.telegram.ui.ActionBar.r0 f42403s0;
    public org.telegram.ui.ActionBar.r0 f42404s1;
    public org.telegram.ui.Components.q30 f42405s2;
    public boolean f42406s3;
    public int f42407s4;
    public org.telegram.messenger.jj f42408s5;
    public int f42409s6;
    public final Matrix f42410s7;
    public ly0 f42411s8;
    public boolean f42412s9;
    public i11 f42413sa;
    public a0.h f42414sb;
    public boolean f42415sc;
    public org.telegram.ui.ActionBar.r0 f42416t0;
    public org.telegram.ui.ActionBar.r0 f42417t1;
    public org.telegram.ui.Components.q30 f42418t2;
    public boolean f42419t3;
    public TLRPC.Chat f42420t4;
    public org.telegram.messenger.jj f42421t5;
    public int f42422t6;
    public LinearGradient f42423t7;
    public final a0.h f42424t8;
    public boolean f42425t9;
    public boolean f42426ta;
    public boolean f42427tb;
    public boolean f42428tc;
    public org.telegram.ui.ActionBar.r0 f42429u0;
    public org.telegram.ui.ActionBar.r0 f42430u1;
    public ij f42431u2;
    public AnimatorSet f42432u3;
    public boolean f42433u4;
    public org.telegram.messenger.ej f42434u5;
    public int f42435u6;
    public boolean f42436u7;
    public String f42437u8;
    public boolean f42438u9;
    public org.telegram.ui.Components.dp ua;
    public boolean f42439ub;
    public z8 f42440uc;
    public org.telegram.ui.ActionBar.r0 f42441v0;
    public org.telegram.ui.ActionBar.r0 f42442v1;
    public boolean f42443v2;
    public ValueAnimator f42444v3;
    public boolean f42445v4;
    public org.telegram.messenger.nj f42446v5;
    public int f42447v6;
    public boolean f42448v7;
    public long f42449v8;
    public float f42450v9;
    public sn f42451va;
    public long f42452vb;
    public int vc;
    public final pj f42453w;
    public ClippingImageView f42454w0;
    public org.telegram.ui.Components.go f42455w1;
    public org.telegram.ui.Components.q30 f42456w2;
    public float f42457w3;
    public boolean f42458w4;
    public org.telegram.messenger.oj f42459w5;
    public int f42460w6;
    public int f42461w7;
    public String f42462w8;
    public float w9;
    public un f42463wa;
    public dl f42464wb;
    public ValueAnimator f42465wc;
    public jj f42466x;
    public org.telegram.ui.Components.h01 f42467x0;
    public bh.k f42468x1;
    public boolean f42469x2;
    public boolean f42470x3;
    public boolean f42471x4;
    public org.telegram.messenger.jj f42472x5;
    public final ArrayList f42473x6;
    public boolean f42474x7;
    public boolean f42475x8;
    public VelocityTracker f42476x9;
    public sn f42477xa;
    public boolean xb;
    public yi f42478xc;
    public jj f42479y;
    public s4.f0 f42480y0;
    public boolean f42481y1;
    public org.telegram.ui.Components.q30 f42482y2;
    public boolean y3;
    public int f42483y4;
    public org.telegram.messenger.ej f42484y5;
    public boolean f42485y6;
    public boolean f42486y7;
    public boolean f42487y8;
    public boolean f42488y9;
    public oh.e f42489ya;
    public boolean f42490yb;
    public boolean f42491yc;
    public vj f42492z0;
    public int f42493z1;
    public org.telegram.ui.Components.q30 f42494z2;
    public boolean f42495z3;
    public int f42496z4;
    public org.telegram.messenger.ej f42497z5;
    public int f42498z6;
    public int f42499z7;
    public String f42500z8;
    public boolean f42501z9;
    public final org.telegram.messenger.l3 f42502za;
    public boolean zb;
    public int f42503zc;

    public un(Bundle bundle) {
        super(bundle);
        this.f42178a = 0;
        this.f42205c = false;
        this.d = false;
        this.f42402s = new HashMap();
        this.f42453w = new pj(this, new mf(this, 27));
        je.b bVar = new je.b();
        this.E = bVar;
        je.b bVar2 = new je.b();
        this.F = bVar2;
        this.X = new zg.i();
        this.J0 = org.telegram.ui.ActionBar.t6.Gi;
        this.S0 = -1;
        this.T0 = Collections.newSetFromMap(new WeakHashMap());
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.f42342n1 = new ArrayList();
        this.P2 = new org.telegram.ui.Components.g9[2];
        this.Q2 = new tn[2];
        this.R2 = new org.telegram.ui.ActionBar.u5[2];
        this.S2 = new jn[2];
        this.V2 = new AnimatorSet[2];
        this.W2 = false;
        this.f42357o3 = 500;
        this.f42223d4 = null;
        this.f42260g4 = -1;
        this.f42345n4 = true;
        this.C4 = new SparseArray();
        this.D4 = new ArrayList();
        this.I4 = new ArrayList();
        this.J4 = new HashMap();
        this.L4 = -1;
        this.M4 = 0;
        this.N4 = new ArrayList(10);
        this.T4 = new ArrayList();
        this.V4 = new HashMap();
        this.W4 = new SparseArray();
        this.Y4 = new int[1];
        this.f42261g5 = new SparseIntArray();
        this.f42272h5 = new SparseIntArray();
        this.p5 = true;
        this.f42395r5 = true;
        this.G5 = true;
        this.J5 = true;
        this.f42212c6 = new LongSparseIntArray();
        this.f42321l6 = 1;
        this.f42333m6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f42347n6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f42360o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f42473x6 = new ArrayList();
        this.f42485y6 = true;
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
        this.f42185a7 = 0;
        this.e7 = new ArrayList();
        this.f7 = new Paint(1);
        this.f42263g7 = new Paint(1);
        this.f42274h7 = new ColorMatrix();
        this.f42286i7 = new m.c3();
        this.f42298j7 = new org.telegram.ui.ActionBar.c5(0, false, false, new bk(this, 0));
        this.f42348n7 = new Matrix();
        Paint paint = new Paint(1);
        this.f42397r7 = paint;
        this.f42410s7 = new Matrix();
        this.D7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.i0.L(1.0f));
        this.N7 = Integer.MAX_VALUE;
        this.O7 = -1;
        this.W7 = true;
        this.f42200b8 = Integer.MAX_VALUE;
        this.f42287i8 = -1;
        this.f42299j8 = -10000;
        this.f42424t8 = new a0.h();
        this.M8 = new mf(this, 28);
        hi.b bVar3 = new hi.b();
        this.N8 = bVar3;
        this.O8 = new tg.b(bVar3);
        this.U8 = new Paint(1);
        this.V8 = 0.0f;
        this.Y8 = 1.0f;
        this.Z8 = 0.0f;
        this.f42252f9 = true;
        this.f42288i9 = new jk(this);
        this.G9 = true;
        this.f42375pa = new ci(this, 1);
        this.f42502za = new org.telegram.messenger.l3(this);
        this.Fa = new kg(this, 0);
        this.Ga = new zk(this);
        this.Ia = -1;
        this.Za = new rl(this);
        this.f42189ab = new xl(this);
        this.f42217cb = new ii(this);
        this.f42230db = new pi(this);
        this.eb = new fj(this);
        this.f42254fb = new gn(this);
        this.gb = new lg(this, 1);
        this.f42277hb = new lg(this, 5);
        this.f42190ac = new RectF();
        this.f42231dc = new lg(this, 8);
        this.f42316kc = new m4.c(9, (byte) 0);
        this.f42327lc = new Object();
        this.f42491yc = false;
        org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
        this.Qc = new fe.b(0, this, grVar, 320L, false);
        this.Rc = new fe.b(1, this, grVar, 520L, false);
        this.Sc = new fe.b(2, this, grVar, 520L, false);
        this.Tc = new fe.b(3, this, grVar, 320L, false);
        this.Uc = new fe.b(4, this, grVar, 320L, false);
        this.Vc = new fe.b(5, this, grVar, 320L, false);
        this.Wc = new fe.b(6, this, grVar, 320L, false);
        lg lgVar = new lg(this, 10);
        ?? obj = new Object();
        obj.f9699b = new float[32];
        obj.f9698a = 1;
        obj.d = new fe.m(obj, ee.a.f6489a, 240L);
        obj.f9700c = lgVar;
        this.Xc = obj;
        this.Zc = new Rect();
        ?? obj2 = new Object();
        this.M = obj2;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.tz.f()) {
            tg.f fVar = new tg.f(false);
            this.G = fVar;
            this.H = Math.max(0, org.telegram.messenger.i0.L(48.0f) - Math.min(org.telegram.messenger.i0.f16021n, org.telegram.messenger.i0.f16020m));
            hi.f fVar2 = new hi.f(obj2);
            this.J = fVar2;
            fVar2.d = fVar;
            fVar2.e = -3;
            fVar2.f7719f = obj2;
            tg.b bVar4 = new tg.b(fVar2);
            this.L = bVar4;
            bVar4.f48702i = true;
            if (org.telegram.messenger.sc.e(262144)) {
                hi.f fVar3 = new hi.f(obj2);
                this.I = fVar3;
                fVar3.d = fVar;
                fVar3.e = -2;
                fVar3.f7719f = obj2;
                tg.b bVar5 = new tg.b(fVar3);
                this.K = bVar5;
                bVar5.f48702i = true;
            } else {
                this.I = null;
                this.K = this.L;
            }
        } else {
            this.G = null;
            this.H = 0;
            this.I = null;
            this.J = null;
            this.K = new tg.b(obj2);
            this.L = new tg.b(obj2);
        }
        tg.b bVar6 = new tg.b(obj2);
        this.N = bVar6;
        bVar6.e = bVar;
        this.K.e = bVar;
        this.L.e = bVar;
        this.O8.e = new je.b();
        this.N.d = bVar2;
        this.K.d = bVar2;
        this.L.d = bVar2;
        this.O8.d = bVar2;
    }

    public static void A0(un unVar, org.telegram.messenger.jj jjVar, Long l4, Runnable runnable) {
        rh.e6.y(unVar.currentAccount, false).j0(jjVar, l4.longValue(), runnable, false);
    }

    public static void A1(un unVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.vp.r1(unVar.currentAccount).n1(user.f19942id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mh(unVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void B0(un unVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        un unVar2;
        int i10;
        int i11;
        TLRPC.TL_forumTopic f7;
        zg.a aVar = unVar.f42327lc;
        if (num.intValue() != unVar.b()) {
            unVar.Ic = false;
            ff ffVar = unVar.f42290ic;
            if (ffVar != null) {
                org.telegram.messenger.i0.r(ffVar);
                unVar.f42290ic.run();
                unVar.f42290ic = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.o21 o21Var = unVar.f42246f2;
            long intValue = num.intValue();
            ArrayList l4 = org.telegram.messenger.vp.r1(o21Var.f28957n).f18891r7.l(-o21Var.f28959r);
            if (l4 != null) {
                int size = l4.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = l4.get(i12);
                    i12++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.f19845id == intValue) {
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
            if (message == null && tL_forumTopic != null && (f7 = unVar.getMessagesController().f18891r7.f(-unVar.a(), tL_forumTopic.f19845id)) != null) {
                message = f7.topicStartMessage;
                tL_forumTopic2 = f7;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                unVar.f42452vb = SystemClock.uptimeMillis();
                unVar.F7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    unVar.hb(unVar.b());
                } else if (unVar.b() == 0) {
                    unVar.hb(num.intValue());
                } else {
                    unVar.D7 = -1;
                }
                unVar.getConnectionsManager().cancelRequestsForGuid(unVar.classGuid);
                unVar.getMessagesStorage().k(unVar.classGuid);
                unVar.classGuid = ConnectionsManager.generateClassGuid();
                unVar.eb();
                unVar.f42446v5 = null;
                unVar.K7 = 0;
                unVar.A7 = false;
                unVar.B7 = true;
                unVar.W7 = true;
                unVar.X7 = 0;
                unVar.Z7 = null;
                unVar.f42473x6.clear();
                unVar.f42205c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new org.telegram.messenger.jj(unVar.getCurrentAccount(), message, false, false));
                    unVar2 = unVar;
                    unVar2.Hb(arrayList, unVar.e, tL_forumTopic2.f19845id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    unVar2 = unVar;
                    unVar2.f42382q4 = null;
                    unVar2.f42358o4 = null;
                    unVar2.l4 = null;
                    unVar2.D5 = null;
                    unVar2.f42483y4 = 0;
                    unVar2.f42496z4 = 0;
                    unVar2.A4 = 0;
                    unVar2.f42394r4 = 0L;
                    unVar2.f42407s4 = 0;
                    unVar2.f42420t4 = null;
                    unVar2.f42445v4 = false;
                    unVar2.f42433u4 = false;
                }
                fm fmVar = unVar2.C0;
                if (fmVar != null) {
                    if (fmVar.I >= 0 && !fmVar.N()) {
                        fm fmVar2 = unVar2.C0;
                        fmVar2.s(fmVar2.I);
                    } else {
                        fm fmVar3 = unVar2.C0;
                        if (fmVar3.I < 0 && fmVar3.N()) {
                            unVar2.C0.i(0);
                        }
                    }
                    unVar2.C0.T();
                }
                unVar2.C8();
                unVar2.id(true);
                unVar2.f42355o1.n(true);
                if (tL_forumTopic2 != null) {
                    unVar2.od();
                } else {
                    unVar2.f42355o1.b();
                }
                unVar2.f42246f2.setCurrentTopic(unVar2.b());
                unVar2.ld(true);
                unVar2.Bc(true);
                unVar2.getMessagesController().G4(-unVar2.a(), unVar2.b());
                unVar2.Ta();
                unVar2.s9(true);
                unVar2.r9(true);
                unVar2.H6(true, true);
                if (unVar2.Z != null) {
                    if (!org.telegram.messenger.h20.u(unVar2.f42243f)) {
                        unVar2.Z.i0(false);
                    }
                    unVar2.Z.F1(true);
                }
                if (tL_forumTopic2 != null) {
                    unVar2.getMessagesController().f18891r7.k(unVar2.f42297j6, tL_forumTopic2.f19845id);
                }
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i10 = 0;
                }
                unVar2.f42493z1 = i10;
                if (tL_forumTopic2 != null) {
                    i11 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i11 = 0;
                }
                unVar2.A1 = i11;
                unVar2.Vc(false);
                unVar2.Uc(false);
                unVar2.md();
                mn mnVar = unVar2.Jc;
                if (mnVar != null && unVar2.actionBar.f20497n0) {
                    mnVar.k(null);
                }
                if (org.telegram.messenger.h20.u(unVar2.f42243f)) {
                    unVar2.getMediaDataController().I0(org.telegram.messenger.gs.a(unVar2.f42297j6, num.intValue()), true);
                }
            }
        }
    }

    public static void B1(un unVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        org.telegram.messenger.zs f7 = org.telegram.messenger.zs.f(unVar.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f19911id;
        long e = unVar.getUserConfig().e();
        long j11 = unVar.f42297j6;
        if (e == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        f7.k(org.telegram.messenger.zs.f19710w, arrayList, valueOf, bool, bool);
    }

    public static void C0(un unVar, Long l4, Boolean bool) {
        int i10;
        int i11;
        if (l4.longValue() != unVar.b()) {
            unVar.f42452vb = SystemClock.uptimeMillis();
            unVar.F7 = bool.booleanValue();
            if (l4.longValue() == 0) {
                unVar.hb(unVar.b());
            } else if (unVar.b() == 0) {
                unVar.hb(l4.longValue());
            } else {
                unVar.D7 = -1;
            }
            unVar.getConnectionsManager().cancelRequestsForGuid(unVar.classGuid);
            unVar.getMessagesStorage().k(unVar.classGuid);
            unVar.classGuid = ConnectionsManager.generateClassGuid();
            unVar.eb();
            unVar.f42446v5 = null;
            unVar.K7 = 0;
            unVar.A7 = false;
            unVar.B7 = true;
            unVar.W7 = true;
            unVar.X7 = 0;
            unVar.Z7 = null;
            unVar.f42473x6.clear();
            unVar.f42394r4 = l4.longValue();
            TLRPC.TL_forumTopic f7 = unVar.getMessagesController().f18891r7.f(-unVar.a(), l4.longValue());
            if (l4.longValue() != 0 && f7 != null) {
                int i12 = f7.read_inbox_max_id;
                unVar.f42483y4 = i12;
                unVar.f42496z4 = f7.read_outbox_max_id;
                unVar.A4 = Math.max(1, i12);
                unVar.getMessagesController().f18891r7.k(unVar.f42297j6, org.telegram.messenger.o5.o(f7.from_id));
            } else {
                unVar.f42382q4 = null;
                unVar.f42358o4 = null;
                unVar.l4 = null;
                unVar.D5 = null;
                unVar.f42483y4 = 0;
                unVar.f42496z4 = 0;
                unVar.A4 = 0;
                unVar.f42394r4 = 0L;
                unVar.f42407s4 = 0;
                unVar.f42420t4 = null;
                unVar.f42445v4 = false;
                unVar.f42433u4 = false;
            }
            unVar.C8();
            unVar.id(true);
            unVar.f42355o1.n(true);
            unVar.f42355o1.b();
            unVar.f42246f2.setCurrentTopic(l4.longValue());
            unVar.ld(true);
            unVar.Bc(true);
            unVar.getMessagesController().G4(-unVar.a(), unVar.b());
            unVar.t9(true);
            unVar.r9(true);
            mk mkVar = unVar.Z;
            if (mkVar != null) {
                mkVar.i0(false);
                unVar.Z.F1(true);
            }
            unVar.H6(true, true);
            if (f7 != null) {
                i10 = f7.unread_reactions_count;
            } else {
                i10 = 0;
            }
            unVar.f42493z1 = i10;
            if (f7 != null) {
                i11 = f7.unread_poll_votes_count;
            } else {
                i11 = 0;
            }
            unVar.A1 = i11;
            unVar.Vc(false);
            unVar.Uc(false);
            unVar.md();
            mn mnVar = unVar.Jc;
            if (mnVar != null && unVar.actionBar.f20497n0) {
                mnVar.k(null);
            }
        }
    }

    public static void C1(org.telegram.ui.un r8, java.lang.String r9, android.text.style.CharacterStyle r10, org.telegram.messenger.jj r11, org.telegram.ui.Cells.q1 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.C1(org.telegram.ui.un, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.jj, org.telegram.ui.Cells.q1, int, int):void");
    }

    public static void D0(un unVar) {
        int i10;
        String str;
        int i11;
        Activity parentActivity = unVar.getParentActivity();
        int i12 = unVar.currentAccount;
        long j10 = unVar.f42297j6;
        sn snVar = unVar.f42477xa;
        int i13 = org.telegram.ui.Components.xn.L;
        org.telegram.ui.ActionBar.z2 z2Var = new org.telegram.ui.ActionBar.z2(1, (Context) parentActivity, (org.telegram.ui.ActionBar.p6) snVar, false);
        z2Var.Q(org.telegram.ui.ActionBar.t6.f21001h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.i0.L(16.0f), 0, org.telegram.messenger.i0.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624076, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.i0.L(80.0f);
        int i14 = org.telegram.ui.ActionBar.t6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.t6.L(L, org.telegram.ui.ActionBar.t6.w0(i14, snVar));
        org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i14);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.a7.k(imageView, L2, N, null, snVar);
        linearLayout.addView((View) imageView, w7.b6.t(80, 80, 1, 0, 16, 0, 16));
        boolean A3 = org.telegram.messenger.vp.r1(i12).A3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.i0.o());
        textView.setGravity(17);
        int i15 = org.telegram.ui.ActionBar.t6.f21037j5;
        org.telegram.ui.ActionBar.a7.V(textView, i15, snVar);
        textView.setTextSize(1, 20.0f);
        if (A3) {
            i10 = 2131747051;
        } else {
            i10 = 2131747052;
        }
        textView.setText(org.telegram.messenger.cd.L0(i10, null));
        linearLayout.addView(textView, w7.b6.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.a7.V(textView2, i15, snVar);
        textView2.setTextSize(1, 14.0f);
        if (j10 > 0) {
            str = org.telegram.messenger.h20.j(org.telegram.messenger.vp.r1(i12).Z1(Long.valueOf(j10)), true);
        } else {
            str = "";
        }
        if (A3) {
            i11 = 2131747049;
        } else {
            i11 = 2131747050;
        }
        org.telegram.messenger.m5.q(null, null, i11, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, w7.b6.t(-1, -2, 1, 12, 9, 12, 19));
        if (!A3) {
            kg.x0 x0Var = new kg.x0(parentActivity, snVar, true);
            x0Var.setOnClickListener(new org.telegram.ui.Components.y2(z2Var, 1));
            x0Var.c(org.telegram.messenger.cd.L0(2131747053, null), false, false);
            linearLayout.addView(x0Var, w7.b6.t(-1, 48, 1, 0, 0, 0, 4));
        }
        z2Var.N = linearLayout;
        z2Var.show();
    }

    public static void D1(un unVar, View view, int i10) {
        org.telegram.ui.Components.o5 o5Var;
        TLRPC.User user;
        char c10;
        pk pkVar;
        pk pkVar2;
        if (i10 != 0) {
            zf.x0 adapter = unVar.W1.getAdapter();
            if (adapter.f55672w0 != null && !adapter.f55654h0) {
                return;
            }
            int i11 = i10 - 1;
            Object J = unVar.W1.getAdapter().J(i11);
            int i12 = unVar.W1.getAdapter().X;
            int i13 = unVar.W1.getAdapter().Y;
            if (unVar.W1.getAdapter().F != null && i11 == 1) {
                unVar.Z.M0(i12, i13, unVar.W1.getAdapter().F + "@" + org.telegram.messenger.w3.K(unVar.e, false) + " ", false);
            } else if (unVar.W1.getAdapter().F != null && i11 == 0) {
                unVar.Z.M0(i12, i13, a1.g.r(new StringBuilder(), unVar.W1.getAdapter().F, " "), false);
            } else if (J instanceof ag.h3) {
                if (!unVar.getUserConfig().q()) {
                    unVar.showDialog(new kg.i1(unVar, unVar.getParentActivity(), unVar.currentAccount, true, 31, false, null));
                    return;
                }
                ag.h3 h3Var = (ag.h3) J;
                org.telegram.ui.Components.s4.Z(unVar.currentAccount, Math.max(1, h3Var.a()), unVar.f42297j6, new ag.e0(16, unVar, h3Var));
            } else {
                org.telegram.messenger.fj fjVar = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (unVar.f42248f4 != 0 || !unVar.m7(view)) {
                        if (view instanceof org.telegram.ui.Cells.b8) {
                            fjVar = ((org.telegram.ui.Cells.b8) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.s4.Z(unVar.currentAccount, 1, unVar.a(), new pa(unVar, tL_document, org.telegram.messenger.jj.U(tL_document), unVar.W1.getAdapter().L(i11), fjVar, 2));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (unVar.B3 && (pkVar2 = unVar.f42247f3) != null && pkVar2.getVisibility() == 0) {
                        unVar.pb(chat, null);
                        return;
                    }
                    String K = org.telegram.messenger.w3.K(chat, false);
                    if (K != null) {
                        unVar.Z.M0(i12, i13, a1.g.n("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (unVar.B3 && (pkVar = unVar.f42247f3) != null && pkVar.getVisibility() == 0) {
                        unVar.pb(null, user2);
                    } else if (org.telegram.messenger.h20.n(user2) != null) {
                        unVar.Z.M0(i12, i13, "@" + org.telegram.messenger.h20.n(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(sc.e.A(org.telegram.messenger.h20.j(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.h51("" + user2.f19942id, 3, null), 0, spannableString.length(), 33);
                        unVar.Z.M0(i12, i13, spannableString, false);
                    }
                } else if (J instanceof zf.u0) {
                    if (unVar.W1.getAdapter().J != null && unVar.f42248f4 != 1) {
                        zf.u0 u0Var = (zf.u0) J;
                        org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(u0Var.f55631a, unVar.f42297j6, unVar.D5, unVar.l4, null, false, null, null, null, true, 0, 0, null, false);
                        b10.K = unVar.P8();
                        b10.X = u0Var.f55632b;
                        b10.R = unVar.a9();
                        b10.T = unVar.f42459w5;
                        unVar.getSendMessagesHelper().r0(b10);
                        unVar.Z.setFieldText("");
                        unVar.r9(false);
                    }
                } else if (J instanceof String) {
                    if (unVar.W1.getAdapter().J != null) {
                        if (unVar.f42248f4 == 1) {
                            org.telegram.ui.Components.s4.L(unVar.getParentActivity(), unVar.f42297j6, new ng.d(10, unVar, (String) J), unVar.f42477xa);
                            return;
                        } else if (!unVar.m7(view)) {
                            org.telegram.ui.Components.s4.Z(unVar.currentAccount, 1, unVar.f42297j6, new ag.e0(17, unVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    unVar.Z.M0(i12, i13, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (unVar.Z.getFieldText() != null) {
                        if (unVar.f42248f4 == 1 || !unVar.m7(view)) {
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
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42477xa);
                                    String L0 = org.telegram.messenger.cd.L0(2131745613, null);
                                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                                    x1Var.R = L0;
                                    if (c10 == 1) {
                                        x1Var.T = org.telegram.messenger.cd.L0(2131750484, null);
                                    } else {
                                        x1Var.T = org.telegram.messenger.cd.L0(2131749113, null);
                                    }
                                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747847, null), null);
                                    unVar.showDialog(x1Var);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(unVar.W1.getAdapter().R);
                                unVar.f42203bb = arrayList;
                                PhotoViewer.v1().N2(null, unVar, unVar.f42477xa);
                                PhotoViewer.v1().j2(arrayList, unVar.W1.getAdapter().M(i11), 3, false, unVar.f42217cb, unVar);
                                return;
                            }
                            org.telegram.ui.Components.s4.Z(unVar.currentAccount, 1, unVar.a(), new ag.e0(18, unVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    h0 h0Var = new h0(26, unVar, (TLRPC.TL_inlineBotWebView) J);
                    if (unVar.Eb) {
                        h0Var.run();
                    } else {
                        te1.a(unVar.getParentActivity(), new ag.e0(19, unVar, h0Var), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    ek ekVar = unVar.W1;
                    if (ekVar != null && (user = ekVar.getAdapter().f55672w0) != null) {
                        unVar.Z.setFieldText("");
                        long j10 = unVar.f42297j6;
                        if (j10 == user.f19942id) {
                            unVar.f42449v8 = j10;
                            unVar.getMessagesController().x4(tL_inlineBotSwitchPM.start_param, unVar.f42243f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f19942id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", unVar.f42297j6);
                        if (unVar.getMessagesController().E(bundle, unVar, null, null)) {
                            unVar.presentFragment(new un(bundle));
                        }
                    }
                } else if (J instanceof org.telegram.messenger.qi) {
                    String str = ((org.telegram.messenger.qi) J).f17590a;
                    mk mkVar = unVar.Z;
                    mkVar.Q();
                    mkVar.U0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            unVar.Z.M0(i12, i13, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = unVar.Z.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e) {
                                org.telegram.messenger.f8.g(e, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e7 = org.telegram.ui.Components.f5.e(unVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.jj.U(e7));
                            if (e7 != null) {
                                o5Var = new org.telegram.ui.Components.o5(e7, fontMetricsInt);
                            } else {
                                o5Var = new org.telegram.ui.Components.o5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(o5Var, 0, spannableString2.length(), 33);
                            unVar.Z.M0(i12, i13, spannableString2, false);
                            unVar.W1.o(false);
                        }
                    }
                    unVar.Z.M0(i12, i13, str, true);
                    unVar.W1.o(false);
                }
            }
        }
    }

    public static void E0(un unVar, long j10, long j11) {
        org.telegram.messenger.j2.b(unVar.currentAccount).h(j10, j11, false);
        unVar.f42290ic = null;
    }

    public static void E1(un unVar) {
        unVar.O7(false);
        if (!unVar.fragmentBeginToShow) {
            vj vjVar = unVar.f42492z0;
            vjVar.W1 = false;
            vjVar.X1 = 0;
            vjVar.setEmptyView(unVar.f42233e1);
            vj vjVar2 = unVar.f42492z0;
            vjVar2.W1 = true;
            vjVar2.X1 = 1;
            return;
        }
        unVar.f42492z0.setEmptyView(unVar.f42233e1);
    }

    public static void F0(un unVar, String str) {
        if (org.telegram.messenger.vp.r1(unVar.currentAccount).J2(true)) {
            gf.f.l(unVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.s4.n0(unVar.getParentActivity(), unVar.f42477xa, str, true, new jg(unVar, str, 1));
        }
    }

    public static void F1(un unVar, CharSequence charSequence, org.telegram.messenger.vp vpVar, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.g51[] g51VarArr;
        if (unVar.V5 != 0) {
            unVar.getConnectionsManager().cancelRequest(unVar.V5, true);
            unVar.V5 = 0;
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = org.telegram.messenger.i0.S.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (g51VarArr = (org.telegram.ui.Components.g51[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.g51.class)) != null && g51VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.g51 g51Var : g51VarArr) {
                    arrayList.add(g51Var.getURL());
                }
            }
            if (arrayList != null && unVar.X5 != null && arrayList.size() == unVar.X5.size()) {
                boolean z12 = true;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i10), (CharSequence) unVar.X5.get(i10))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            unVar.X5 = arrayList;
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                org.telegram.messenger.i0.g3(new lg(unVar, 7));
                return;
            }
        }
        if (arrayList == null) {
            org.telegram.messenger.i0.g3(new lg(unVar, 6));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (unVar.h != null && vpVar.G2 == 2) {
            org.telegram.messenger.i0.g3(new ve(unVar, vpVar, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = unVar.W5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i11 = unVar.Gb + 1;
            unVar.Gb = i11;
            ng ngVar = new ng(unVar, i11, getwebpagepreview, 0);
            if (unVar.Hb == null) {
                unVar.Hb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) unVar.Hb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                ngVar.a(Boolean.TRUE, webPage2);
                return;
            }
            n6 n6Var = new n6(unVar, getwebpagepreview, ngVar, 1);
            if (unVar.V5 != 0) {
                unVar.getConnectionsManager().cancelRequest(unVar.V5, true);
            }
            unVar.V5 = unVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new a3.b(1), new ih.s(4, unVar, n6Var));
            unVar.getConnectionsManager().bindRequestToGuid(unVar.V5, unVar.classGuid);
        }
    }

    public static boolean F9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static void G0(un unVar) {
        long j10;
        ArrayList arrayList = unVar.f42473x6;
        arrayList.add(Integer.valueOf(unVar.f42321l6));
        if (unVar.f42248f4 == 7) {
            org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(unVar.currentAccount);
            String str = unVar.I3;
            int i10 = unVar.classGuid;
            int i11 = unVar.f42210c4;
            int i12 = unVar.f42321l6;
            unVar.f42321l6 = i12 + 1;
            a2.e(i10, i11, str, i12);
        } else if (unVar.M7 != 0) {
            org.telegram.messenger.vp messagesController = unVar.getMessagesController();
            long j11 = unVar.f42297j6;
            long j12 = unVar.f42199b7;
            int i13 = unVar.M7;
            int i14 = unVar.classGuid;
            int i15 = unVar.f42248f4;
            long j13 = unVar.f42394r4;
            int i16 = unVar.A4;
            int i17 = unVar.f42321l6;
            unVar.f42321l6 = i17 + 1;
            messagesController.W2(j11, j12, false, 30, 0, i13, true, 0, i14, 4, i15, j13, i16, i17, unVar.f42445v4);
        } else if (unVar.K7 != 0 && (!unVar.T9() || unVar.K7 == unVar.f42200b8 || unVar.f42445v4)) {
            int i18 = unVar.f42499z7;
            if (i18 != 0) {
                unVar.f42199b7 = i18;
                org.telegram.messenger.vp messagesController2 = unVar.getMessagesController();
                long j14 = unVar.f42199b7;
                boolean z10 = unVar.f42474x7;
                int i19 = unVar.f42461w7;
                int i20 = unVar.K7;
                int i21 = unVar.classGuid;
                int i22 = unVar.f42248f4;
                long j15 = unVar.f42394r4;
                int i23 = unVar.A4;
                int i24 = unVar.f42321l6;
                unVar.f42321l6 = i24 + 1;
                messagesController2.W2(j14, 0L, z10, i19, i20, 0, true, 0, i21, 3, i22, j15, i23, i24, unVar.f42445v4);
            } else {
                org.telegram.messenger.vp messagesController3 = unVar.getMessagesController();
                long j16 = unVar.f42297j6;
                long j17 = unVar.f42199b7;
                boolean z11 = unVar.f42474x7;
                int i25 = unVar.f42461w7;
                int i26 = unVar.K7;
                int i27 = unVar.classGuid;
                int i28 = unVar.f42248f4;
                long j18 = unVar.f42394r4;
                int i29 = unVar.A4;
                int i30 = unVar.f42321l6;
                unVar.f42321l6 = i30 + 1;
                messagesController3.W2(j16, j17, z11, i25, i26, 0, true, 0, i27, 3, i28, j18, i29, i30, unVar.f42445v4);
            }
        } else if (unVar.f42486y7) {
            unVar.f42321l6++;
        } else {
            org.telegram.messenger.vp messagesController4 = unVar.getMessagesController();
            long j19 = unVar.f42297j6;
            long j20 = unVar.f42199b7;
            boolean z12 = unVar.f42474x7;
            int i31 = unVar.f42461w7;
            int i32 = unVar.K7;
            int i33 = unVar.classGuid;
            int i34 = unVar.f42248f4;
            long j21 = unVar.f42394r4;
            int i35 = unVar.A4;
            int i36 = unVar.f42321l6;
            unVar.f42321l6 = i36 + 1;
            messagesController4.W2(j19, j20, z12, i31, i32, 0, true, 0, i33, 2, i34, j21, i35, i36, unVar.f42445v4);
        }
        int i37 = unVar.f42248f4;
        if (i37 == 0 || (i37 == 3 && unVar.V8() == unVar.getUserConfig().e())) {
            if (unVar.T9() && !unVar.f42445v4) {
                return;
            }
            arrayList.add(Integer.valueOf(unVar.f42321l6));
            org.telegram.messenger.vp messagesController5 = unVar.getMessagesController();
            long j22 = unVar.f42297j6;
            long j23 = unVar.f42199b7;
            int i38 = unVar.classGuid;
            if (unVar.f42248f4 == 3) {
                j10 = 0;
            } else {
                j10 = unVar.f42394r4;
            }
            long j24 = j10;
            int i39 = unVar.A4;
            int i40 = unVar.f42321l6;
            unVar.f42321l6 = i40 + 1;
            messagesController5.W2(j22, j23, false, 1, 0, 0, true, 0, i38, 2, 1, j24, i39, i40, unVar.f42445v4);
        }
    }

    public static void G1(un unVar) {
        if (org.telegram.messenger.i0.g(unVar.f42278hc.U0)) {
            org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.resourceProvider));
        }
    }

    public static void H1(un unVar) {
        SparseArray[] sparseArrayArr = unVar.f42333m6;
        org.telegram.messenger.jj jjVar = null;
        for (int i10 = 1; i10 >= 0; i10--) {
            if (jjVar == null && sparseArrayArr[i10].size() != 0) {
                jjVar = (org.telegram.messenger.jj) unVar.E6[i10].get(sparseArrayArr[i10].keyAt(0));
            }
            sparseArrayArr[i10].clear();
            unVar.f42347n6[i10].clear();
            unVar.f42360o6[i10].clear();
        }
        if (unVar.getParentActivity() != null && jjVar != null && ((org.telegram.messenger.jj.R4(jjVar.f16337k) || jjVar.h4()) && jjVar.F0() != null)) {
            TLRPC.Document F0 = jjVar.F0();
            org.telegram.messenger.b8.G(unVar.currentAccount);
            File K = org.telegram.messenger.b8.K(F0, null, false, true);
            TLRPC.Message message = jjVar.f16337k;
            if (message != null && message.attachPath != null && (K == null || !K.exists())) {
                K = new File(jjVar.f16337k.attachPath);
            }
            if (K != null && K.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!org.telegram.messenger.jj.L4(jjVar.f16337k) && !jjVar.h4()) {
                    intent.setType(jjVar.u1());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity parentActivity = unVar.getParentActivity();
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.w0.d();
                        sb2.append("org.telegram.messenger.beta");
                        sb2.append(".provider");
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, sb2.toString(), K));
                        intent.setFlags(1);
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(K));
                }
                unVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.cd.L0(2131745477, null)), 500);
            }
        }
        unVar.p9();
        unVar.Sc(0, true);
        unVar.sd(false);
        unVar.fd();
    }

    public static void I0(un unVar, String str) {
        if (unVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.i5.r(unVar.currentAccount).s(1));
            unVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public static void J0(un unVar, TLRPC.TL_game tL_game, org.telegram.messenger.jj jjVar, String str, long j10) {
        unVar.fc(tL_game, jjVar, str, false, j10);
        SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void J2(long j10, un unVar) {
        int i10;
        boolean z10;
        org.telegram.messenger.fw fwVar;
        if (j10 != unVar.V8()) {
            unVar.getConnectionsManager().cancelRequestsForGuid(unVar.classGuid);
            unVar.getMessagesStorage().k(unVar.classGuid);
            unVar.classGuid = ConnectionsManager.generateClassGuid();
            unVar.eb();
            unVar.f42446v5 = null;
            unVar.K7 = 0;
            unVar.D7 = -1;
            unVar.A7 = false;
            unVar.B7 = true;
            unVar.f42473x6.clear();
            if (j10 != 0) {
                i10 = 3;
            } else {
                i10 = 0;
            }
            unVar.f42248f4 = i10;
            unVar.f42394r4 = j10;
            if (i10 == 3) {
                org.telegram.messenger.gw F1 = unVar.getMessagesController().F1();
                long b10 = unVar.b();
                ArrayList arrayList = F1.f15772j;
                int i11 = 0;
                while (true) {
                    if (i11 < arrayList.size()) {
                        fwVar = (org.telegram.messenger.fw) arrayList.get(i11);
                        if (fwVar.f15624a == b10) {
                            break;
                        }
                        i11++;
                    } else {
                        fwVar = null;
                        break;
                    }
                }
                if (fwVar != null && !fwVar.f15629i) {
                    F1.f(b10, null);
                }
            }
            unVar.C8();
            unVar.id(true);
            qj qjVar = unVar.f42355o1;
            if (qjVar != null) {
                qjVar.n(true);
                unVar.f42355o1.b();
            }
            org.telegram.ui.Components.t11 t11Var = unVar.m0;
            if (t11Var != null) {
                t11Var.setCurrentTopic(j10);
                org.telegram.ui.Components.t11 t11Var2 = unVar.m0;
                if (unVar.f42279i0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                t11Var2.setMenuAvailable(z10);
            }
            unVar.ld(true);
            unVar.Bc(true);
            unVar.s9(true);
            unVar.r9(true);
            mk mkVar = unVar.Z;
            if (mkVar != null) {
                mkVar.i0(false);
                unVar.Z.F1(true);
            }
            unVar.H6(true, true);
            mn mnVar = unVar.Jc;
            if (mnVar != null && unVar.actionBar.f20497n0) {
                mnVar.k(null);
            }
        }
    }

    public static void K0(un unVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i10) {
        org.telegram.messenger.qz.C(unVar.currentAccount).v0(tL_document, str, unVar.f42297j6, unVar.D5, unVar.l4, null, unVar.B5, null, z10, i10, 0, false, obj, unVar.P8(), 0L, unVar.a9(), unVar.f42459w5);
    }

    public static TLRPC.TL_message K7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19814id = message.f19814id;
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

    public static void L0(org.telegram.ui.un r19, final org.telegram.ui.g01[] r20, final org.telegram.ui.Components.z60 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.L0(org.telegram.ui.un, org.telegram.ui.g01[], org.telegram.ui.Components.z60):void");
    }

    public static void M0(un unVar, int i10, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, rf rfVar) {
        String str3;
        if (unVar.f42421t5 != null && i10 < arrayList.size() && unVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            org.telegram.messenger.jj jjVar = unVar.f42421t5;
            if (jjVar != null) {
                TLRPC.Message message = jjVar.f16337k;
            }
            org.telegram.ui.Components.m31.T0(unVar.getParentActivity(), unVar, inputPeer, iArr[0], unVar.f42421t5.K2, strArr[0], str3, charSequence, z10, rfVar, new mf(unVar, 29)).f21608o0 = false;
            unVar.I7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(unVar.currentAccount).e7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + unVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit();
                edit.putInt("dialog_show_translate_count" + unVar.a(), i11 - 1).apply();
                unVar.ld(true);
            }
        }
    }

    public static void M1(un unVar) {
        int i10;
        if (unVar.a() == unVar.getUserConfig().e() && unVar.getUserConfig().q() && unVar.f42464wb == null) {
            dl dlVar = new dl(unVar, unVar, unVar.getParentActivity(), unVar.currentAccount, unVar.f42477xa);
            unVar.f42464wb = dlVar;
            dlVar.setPadding(org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(24.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(0.0f));
            unVar.f42464wb.setDelegate(new el(unVar));
            unVar.f42464wb.setTop(true);
            int i11 = 0;
            unVar.f42464wb.setClipChildren(false);
            unVar.f42464wb.setClipToPadding(false);
            unVar.f42464wb.setVisibility(0);
            dl dlVar2 = unVar.f42464wb;
            if (dlVar2.getSelectedReactions().isEmpty()) {
                i10 = 2131745889;
            } else {
                i10 = 2131745888;
            }
            dlVar2.setHint(org.telegram.messenger.cd.L0(i10, null));
            unVar.l1.addView(unVar.f42464wb, w7.b6.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            unVar.f42464wb.p(null, null, true);
            unVar.f42464wb.setTranslationY(-org.telegram.messenger.i0.L(12.0f));
            unVar.f42464wb.setScaleY(0.4f);
            unVar.f42464wb.setScaleX(0.4f);
            unVar.f42464wb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.gr.h).start();
            unVar.fd();
            dl dlVar3 = unVar.f42464wb;
            float f7 = unVar.P9;
            wk wkVar = unVar.C1;
            if (wkVar != null) {
                i11 = wkVar.getCurrentHeight();
            }
            dlVar3.setTranslationY(f7 + i11);
        }
    }

    public static void N0(un unVar) {
        if (unVar.f42319l3.getAlpha() != 0.0f && !unVar.actionBar.u() && !unVar.M9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(unVar.f42319l3.getCustomDate() * 1000);
            int i10 = calendar.get(1);
            int i11 = calendar.get(2);
            int i12 = calendar.get(5);
            calendar.clear();
            calendar.set(i10, i11, i12);
            unVar.V9((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static org.telegram.ui.gs0 N1(org.telegram.ui.un r14, org.telegram.messenger.jj r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.N1(org.telegram.ui.un, org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.gs0");
    }

    public static void O0(un unVar) {
        org.telegram.messenger.vp messagesController = unVar.getMessagesController();
        long j10 = unVar.f42297j6;
        long j11 = unVar.f42199b7;
        int i10 = unVar.classGuid;
        int i11 = unVar.f42248f4;
        long j12 = unVar.f42394r4;
        int i12 = unVar.A4;
        int i13 = unVar.f42321l6;
        unVar.f42321l6 = i13 + 1;
        messagesController.W2(j10, j11, false, 30, 0, 0, true, 0, i10, 0, i11, j12, i12, i13, unVar.f42445v4);
    }

    public static CharSequence O8(org.telegram.messenger.jj jjVar, org.telegram.messenger.ej ejVar, int[] iArr) {
        if (jjVar == null) {
            return null;
        }
        String E1 = org.telegram.messenger.vp.r1(jjVar.I1).E1(jjVar.f16337k.restriction_reason);
        if (!TextUtils.isEmpty(E1)) {
            return E1;
        }
        if (jjVar.T4() && !org.telegram.ui.Components.u21.j(jjVar)) {
            return jjVar.j2();
        }
        CharSequence charSequence = jjVar.f16394z;
        if (charSequence != null) {
            return charSequence;
        }
        if (ejVar == null) {
            return null;
        }
        ArrayList arrayList = ejVar.d;
        int size = arrayList.size();
        CharSequence charSequence2 = null;
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i10);
            CharSequence charSequence3 = jjVar2.f16394z;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = jjVar2.f1();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void P0(un unVar) {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        org.telegram.messenger.lj ljVar;
        ArrayList arrayList;
        String a02;
        unVar.f42459w5 = null;
        int i10 = unVar.Jb;
        if (i10 == 2) {
            unVar.B5 = null;
            unVar.D5 = null;
            org.telegram.messenger.nj njVar = unVar.f42446v5;
            if (njVar != null) {
                njVar.f(null, null, unVar.f42297j6, null);
            }
            unVar.s8();
        } else if (i10 == 3) {
            org.telegram.messenger.nj njVar2 = unVar.f42446v5;
            if (njVar2 != null && !njVar2.c() && (ljVar = unVar.f42446v5.f17115b) != null && (arrayList = ljVar.e) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i11 = 0; i11 < size; i11++) {
                    org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) unVar.f42446v5.f17115b.e.get(i11);
                    if (j10 == 0) {
                        j11 = org.telegram.messenger.jj.B0(jjVar3.f16337k);
                        j10 = jjVar3.Z0();
                    } else if (j10 != jjVar3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42477xa);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.K0 = true;
                if (j11 > 0) {
                    TLRPC.User Z1 = unVar.getMessagesController().Z1(Long.valueOf(j11));
                    if (Z1 != null) {
                        a02 = org.telegram.messenger.cd.a0("CancelForwardPrivate", null, 2131752583, org.telegram.messenger.cd.G(unVar.f42446v5.f17115b.e.size(), "MessagesBold", new Object[0]), org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(-j11));
                    if (L0 != null) {
                        a02 = org.telegram.messenger.cd.a0("CancelForwardChat", null, 2131752584, org.telegram.messenger.cd.G(unVar.f42446v5.f17115b.e.size(), "MessagesBold", new Object[0]), L0.title);
                    } else {
                        return;
                    }
                }
                x1Var.T = org.telegram.messenger.i0.W2(a02);
                x1Var.R = org.telegram.messenger.cd.G(unVar.f42446v5.f17115b.e.size(), "messages", new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131752582, null), new re(unVar, 6));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131745361, null), new re(unVar, 7));
                unVar.showDialog(x1Var);
                TextView textView = (TextView) x1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, unVar.getResourceProvider());
                }
            }
        } else if (i10 == 4) {
            unVar.W5 = null;
            org.telegram.messenger.nj njVar3 = unVar.f42446v5;
            if (njVar3 != null) {
                int i12 = unVar.currentAccount;
                org.telegram.messenger.jj jjVar4 = unVar.D5;
                if (jjVar4 == unVar.l4) {
                    jjVar2 = null;
                } else {
                    jjVar2 = jjVar4;
                }
                njVar3.e(i12, null, null, jjVar2, unVar.B5, unVar.F5);
            }
            mk mkVar = unVar.Z;
            mkVar.X2 = null;
            mkVar.Y2 = false;
            unVar.q8();
            unVar.s8();
        } else {
            if (org.telegram.messenger.w3.c0(unVar.e) && !unVar.f42445v4 && (jjVar = unVar.D5) != null) {
                long c22 = org.telegram.messenger.jj.c2(unVar.currentAccount, jjVar.f16337k, true, false);
                if (c22 != 0) {
                    unVar.getMediaDataController().D(unVar.f42297j6, c22, false);
                }
            }
            unVar.Rb(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static ArrayList P7(ArrayList arrayList, boolean z10, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            org.telegram.messenger.pz pzVar = (org.telegram.messenger.pz) arrayList.get(i10);
            String str = pzVar.f17515c;
            if (str == null) {
                if (pzVar.f17513a != null) {
                    try {
                        File q02 = org.telegram.messenger.i0.q0("", z10);
                        InputStream openInputStream = org.telegram.messenger.w0.f19025b.getContentResolver().openInputStream(pzVar.f17513a);
                        FileOutputStream fileOutputStream = new FileOutputStream(q02);
                        byte[] bArr = new byte[8192];
                        while (true) {
                            int read = openInputStream.read(bArr);
                            if (read <= 0) {
                                break;
                            }
                            fileOutputStream.write(bArr, 0, read);
                            fileOutputStream.flush();
                        }
                        openInputStream.close();
                        fileOutputStream.close();
                        str = q02.getAbsolutePath();
                    } catch (Exception e) {
                        org.telegram.messenger.f8.g(e, true);
                    }
                } else {
                    str = null;
                }
            }
            String str2 = str;
            if (str2 != null) {
                Pair N0 = org.telegram.messenger.i0.N0(str2);
                org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str2, ((Integer) N0.first).intValue(), pzVar.f17524o, 0, 0);
                efVar.k(N0);
                if (i10 == arrayList.size() - 1 && charSequence != null) {
                    efVar.f19506a = charSequence;
                }
                arrayList2.add(efVar);
            }
        }
        return arrayList2;
    }

    public static void Q0(un unVar, int i10, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2;
        if (unVar.Gb != i10) {
            return;
        }
        if (bool.booleanValue()) {
            unVar.W5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                unVar.W5 = null;
                org.telegram.messenger.nj njVar = unVar.f42446v5;
                if (njVar != null) {
                    int i11 = unVar.currentAccount;
                    CharSequence fieldText = unVar.Z.getFieldText();
                    org.telegram.messenger.jj jjVar3 = unVar.D5;
                    if (jjVar3 == unVar.l4) {
                        jjVar2 = null;
                    } else {
                        jjVar2 = jjVar3;
                    }
                    njVar.e(i11, null, fieldText, jjVar2, unVar.B5, unVar.F5);
                }
                unVar.s8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                unVar.Y5 = str;
            }
            if (unVar.h != null && z10) {
                webPage.url = str;
            }
            org.telegram.messenger.nj njVar2 = unVar.f42446v5;
            if (njVar2 != null) {
                int i12 = unVar.currentAccount;
                CharSequence fieldText2 = unVar.Z.getFieldText();
                org.telegram.messenger.jj jjVar4 = unVar.D5;
                if (jjVar4 == unVar.l4) {
                    jjVar = null;
                } else {
                    jjVar = jjVar4;
                }
                njVar2.e(i12, null, fieldText2, jjVar, unVar.B5, unVar.F5);
            }
            unVar.Sb(true, unVar.W5, false, true);
            return;
        }
        unVar.W5 = null;
        unVar.s8();
    }

    public static SpannableStringBuilder Q8(long j10, org.telegram.messenger.jj jjVar, boolean z10) {
        TLRPC.Chat L0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long Z0 = jjVar.Z0();
            int i10 = jjVar.I1;
            if (j10 != Z0) {
                int i11 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i11 > 0) {
                    TLRPC.User Z1 = org.telegram.messenger.vp.r1(i10).Z1(Long.valueOf(Z0));
                    if (Z1 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i11 < 0 && (L0 = org.telegram.messenger.vp.r1(i10).L0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) L0.title).append((CharSequence) ":\n");
                }
            }
        }
        String E1 = org.telegram.messenger.vp.r1(jjVar.I1).E1(jjVar.f16337k.restriction_reason);
        if (!TextUtils.isEmpty(E1)) {
            spannableStringBuilder.append((CharSequence) E1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = jjVar.f16394z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(jjVar.v);
        return spannableStringBuilder;
    }

    public static void R0(un unVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit().putLong("dialog_join_requested_time_" + unVar.f42297j6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (org.telegram.messenger.w3.T(unVar.e) && !unVar.e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i10 = org.telegram.ui.Components.u70.f30855q1;
            org.telegram.ui.Components.u70.J0(context, unVar, org.telegram.ui.Components.cc.a0(unVar), z10);
        }
        unVar.Ob(false, true);
    }

    public static FrameLayout R7(int i10, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.p6 p6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(org.telegram.messenger.i0.L(48.0f));
        frameLayout.setPadding(org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(4.0f), org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(4.0f));
        ag.j3 j3Var = new ag.j3(context, 10);
        int i11 = 3;
        j3Var.setMaxLines(3);
        j3Var.setGravity(3);
        j3Var.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.a7.V(j3Var, org.telegram.ui.ActionBar.t6.E8, p6Var);
        j3Var.setTextSize(1, i10);
        j3Var.setMaxWidth(org.telegram.messenger.i0.L(170.0f));
        j3Var.setText(charSequence);
        if (org.telegram.messenger.cd.X) {
            i11 = 5;
        }
        frameLayout.addView(j3Var, w7.b6.e(-1, -2, i11 | 16));
        return frameLayout;
    }

    public static boolean S0(un unVar) {
        org.telegram.messenger.jj jjVar = unVar.f42278hc;
        if (jjVar == null) {
            return false;
        }
        if (org.telegram.messenger.i0.g(jjVar.R0)) {
            new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void T0(un unVar, long j10, long j11, Long l4) {
        int i10;
        String str;
        if (unVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = unVar.getParentActivity();
        String L0 = org.telegram.messenger.cd.L0(2131746306, null);
        if (org.telegram.messenger.w3.p0(unVar.e)) {
            i10 = 2131746310;
        } else {
            i10 = 2131746311;
        }
        SpannableStringBuilder W2 = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i10, org.telegram.messenger.o5.t(j10)));
        if (l4.longValue() > 0) {
            str = org.telegram.messenger.cd.H(',', "RemoveMessageFeeRefund", (int) l4.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.s4.h0(parentActivity, L0, W2, str, org.telegram.messenger.cd.L0(2131751817, null), new jh(unVar, j10, j11, l4, 0), unVar.resourceProvider, true);
    }

    public static void V0(un unVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, n6 n6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f19814id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new org.telegram.messenger.jj(unVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, org.telegram.messenger.o5.o(tL_webPageAttributeStory.peer));
            unVar.getMessagesController().O1().f48911k.d(hVar, new zg(5, hVar, n6Var), unVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static a3.i0 V4(un unVar, org.telegram.messenger.jj jjVar) {
        if (jjVar != null && !jjVar.N3() && jjVar.l4() && jjVar.f16337k.ttl == Integer.MAX_VALUE) {
            long V = unVar.getMessagesController().V(jjVar.f1(), unVar.f42297j6);
            jjVar.G0 = true;
            if (jjVar.P3() || (!jjVar.g4() && !jjVar.S4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(jjVar);
                unVar.Nc(arrayList, true);
            }
            return new a3.i0(unVar, V, jjVar, 7);
        }
        return null;
    }

    public static void W0(un unVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            org.telegram.messenger.vp.r1(unVar.currentAccount).V3(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (unVar.j() != null) {
                tLObject2 = unVar.j();
            } else {
                tLObject2 = unVar.e;
            }
            if (!org.telegram.messenger.ui.t(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = unVar.f42243f;
                if (user2 != null && user2.bot && user.f19942id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.m5.o(null, 2131753104, org.telegram.ui.Components.cc.a0(unVar), null);
                } else if (user2 != null && user2.bot && user.f19942id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.m5.o(null, 2131753107, org.telegram.ui.Components.cc.a0(unVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.m5.o(null, 2131753103, org.telegram.ui.Components.cc.a0(unVar), null);
                } else {
                    TLRPC.Chat chat = unVar.e;
                    if (chat != null && !org.telegram.messenger.w3.V(chat)) {
                        org.telegram.messenger.m5.o(null, 2131753105, org.telegram.ui.Components.cc.a0(unVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = unVar.e;
                    if (chat2 != null && org.telegram.messenger.w3.V(chat2)) {
                        org.telegram.messenger.m5.o(null, 2131753106, org.telegram.ui.Components.cc.a0(unVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                unVar.ma(user.f19942id, unVar.A8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.m6 m6Var = new org.telegram.ui.Components.m6(unVar.getParentActivity());
                m6Var.setColor(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.ia, false));
                org.telegram.ui.ActionBar.a7.i(org.telegram.ui.ActionBar.t6.L5, m6Var, null);
                m6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(unVar.getParentActivity());
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.V = m6Var;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("BotRequestAttachPermission", null, 2131752996, org.telegram.messenger.h20.p(user)));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131753153, null), new a1.d(unVar, user, atomicBoolean, tL_attachMenuBot, 4));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(5, unVar.getParentActivity(), unVar.getResourceProvider());
                    c2Var.setPadding(0, org.telegram.messenger.i0.L(8.0f), 0, org.telegram.messenger.i0.L(8.0f));
                    c2Var.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
                    c2Var.setMultiline(true);
                    c2Var.e(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131747796, org.telegram.messenger.h20.p(user))), "", true, false, false);
                    if (org.telegram.messenger.cd.X) {
                        L = org.telegram.messenger.i0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.i0.L(8.0f);
                    }
                    if (org.telegram.messenger.cd.X) {
                        L2 = org.telegram.messenger.i0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.i0.L(16.0f);
                    }
                    c2Var.setPadding(L, 0, L2, 0);
                    c2Var.setOnClickListener(new ud(4, c2Var, atomicBoolean));
                    x1Var.G = 6;
                    alertDialog$Builder.o(c2Var);
                }
                alertDialog$Builder.p();
            } else {
                te1.a(unVar.getParentActivity(), new w(unVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void X0(un unVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = org.telegram.messenger.vp.r1(unVar.currentAccount).n1(user.f19942id);
                    ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new ag.k0(16, unVar, user));
                }
            }
        }
    }

    public static void Y(un unVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = unVar.W1.getAdapter().f55672w0;
        int i10 = unVar.currentAccount;
        TLRPC.User user2 = unVar.f42243f;
        if (user2 != null) {
            j10 = user2.f19942id;
        } else {
            j10 = unVar.e.f19793id;
        }
        xh.s3 b10 = xh.s3.b(i10, j10, user.f19942id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, unVar.a9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.I1.O().m(b10) != null) {
            return;
        }
        String E1 = org.telegram.messenger.vp.r1(unVar.currentAccount).E1(user.restriction_reason);
        if (!TextUtils.isEmpty(E1)) {
            org.telegram.messenger.vp.r1(unVar.currentAccount);
            org.telegram.messenger.vp.O4(E1, unVar);
            return;
        }
        xh.m2 m2Var = new xh.m2(unVar.getParentActivity(), unVar.getResourceProvider());
        m2Var.B(false);
        m2Var.B0 = true;
        m2Var.f53889l0 = unVar.getParentActivity();
        m2Var.x(unVar, b10);
        m2Var.show();
    }

    public static void Y0(un unVar) {
        unVar.ua = null;
        unVar.f42492z0.setOnInterceptTouchListener(null);
        unVar.Bb(unVar.l1, true);
        org.telegram.messenger.g4.f(unVar.currentAccount).f15670a.clear();
    }

    public static org.telegram.messenger.jj Y1(un unVar) {
        View view = unVar.f42399r9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.s0) {
            return ((org.telegram.ui.Cells.s0) view).getMessageObject();
        }
        return null;
    }

    public static void Z(un unVar, sf.a aVar, Runnable runnable) {
        if (!unVar.isFinished) {
            if (sf.a.m(rh.e6.x(unVar.currentAccount, aVar.f48254a).p()).f48255b < aVar.f48255b) {
                sf.b bVar = aVar.f48254a;
                if (bVar == sf.b.f48256a) {
                    new rh.x7(unVar.getParentActivity(), unVar.getResourceProvider(), aVar.a(), 13, gg.e.h(unVar.currentAccount, unVar.a()), null, unVar.a()).show();
                    return;
                } else if (bVar == sf.b.f48257b) {
                    new wh.f(unVar.getParentActivity(), unVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void Z0(org.telegram.ui.un r12, org.telegram.ui.ok r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Z0(org.telegram.ui.un, org.telegram.ui.ok, boolean[]):void");
    }

    public static void a0(un unVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i10;
        org.telegram.ui.Components.z60 I = org.telegram.ui.Components.z60.I(unVar, q1Var);
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(unVar.getParentActivity(), unVar.f42477xa);
        I.f32936p = new se(nl0Var, 0);
        if (z10 && ((org.telegram.messenger.j0) unVar.getMessagesController().f18957y7.f17841j0.f11587b).f16204c) {
            I.c(2131231276, org.telegram.messenger.cd.L0(2131743043, null), new te(unVar, str, 11), false);
        }
        boolean z11 = true;
        I.c(2131232102, org.telegram.messenger.cd.L0(2131743178, null), new we(unVar, nl0Var, str, 1), false);
        if (z10) {
            I.c(2131232353, org.telegram.messenger.cd.L0(2131742989, null), new te(unVar, str, 12), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i11 = unVar.currentAccount;
                long j10 = user.f19942id;
                h0 h0Var = new h0(28, unVar, userArr);
                TLObject d22 = org.telegram.messenger.vp.r1(i11).d2(j10);
                boolean z12 = d22 instanceof TLRPC.User;
                if (!(d22 instanceof TLRPC.Chat) || !org.telegram.messenger.w3.V((TLRPC.Chat) d22)) {
                    z11 = false;
                }
                if (z12) {
                    i10 = 2131743572;
                } else if (z11) {
                    i10 = 2131743586;
                } else {
                    i10 = 2131743579;
                }
                I.n(d22, org.telegram.messenger.cd.L0(i10, null), h0Var);
            } else {
                I.p(13, -1, org.telegram.messenger.cd.L0(2131743224, null));
            }
        }
        nl0Var.e(I);
        nl0Var.f(q1Var, characterStyle, null, false);
        unVar.showDialog(nl0Var);
    }

    public static void a1(un unVar) {
        if (unVar.f42248f4 == 0 && unVar.getMessagesController().O6 > unVar.getConnectionsManager().getCurrentTime() && !b.a(unVar.currentAccount, unVar.f42243f)) {
            b.c(unVar.currentAccount, unVar.getParentActivity(), unVar.getResourceProvider());
        }
    }

    public static void a5(un unVar, org.telegram.ui.Cells.q1 q1Var) {
        kh.a aVar;
        int i10;
        int i11;
        fe.b bVar = unVar.Sc;
        if (unVar.Z != null && !bVar.f7021f && q1Var.getMessageObject() != null) {
            km kmVar = unVar.l1;
            RectF rectF = org.telegram.messenger.i0.P;
            zg.h.c(q1Var, kmVar, rectF);
            Rect rect = org.telegram.messenger.i0.Q;
            org.telegram.ui.Cells.w1 w1Var = q1Var.f22751v2;
            if (w1Var != null && (aVar = w1Var.f23360l) != null && w1Var.f23367s) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((unVar.l1.getMeasuredHeight() - unVar.f42492z0.getPaddingBottom()) + unVar.Oc) - org.telegram.messenger.i0.L(2.0f)));
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                if (unVar.Yc == null) {
                    unVar.Yc = new ih.d(unVar.getParentActivity(), unVar.resourceProvider, unVar);
                    int indexOfChild = unVar.l1.indexOfChild(unVar.f42492z0);
                    if (indexOfChild >= 0) {
                        unVar.l1.addView(unVar.Yc, indexOfChild + 1, w7.b6.g());
                    } else {
                        unVar.l1.addView(unVar.Yc, w7.b6.g());
                    }
                }
                if (messageObject.P3()) {
                    if (q1Var.v2()) {
                        i11 = org.telegram.ui.ActionBar.t6.f20897bc;
                    } else {
                        i11 = org.telegram.ui.ActionBar.t6.gc;
                    }
                    unVar.S0 = i11;
                } else {
                    if (q1Var.v2()) {
                        i10 = org.telegram.ui.ActionBar.t6.f20918ce;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.f20899be;
                    }
                    unVar.S0 = i10;
                }
                unVar.Yc.setColor(unVar.getThemedColor(unVar.S0));
                unVar.Yc.setCellToWatch(q1Var);
                ((fe.b) unVar.Yc.f8524b.f8521b).a(false, false);
                unVar.Yc.setAnimatedVisibility(bVar.e);
                unVar.Yc.f8524b.setOnClickListener(new ag.g(new lg(unVar, 0), 8));
                ih.d dVar = unVar.Yc;
                dVar.f8529s = new lg(unVar, 2);
                ih.b bVar2 = dVar.f8523a;
                bVar2.setOnKeyListener(new mg(unVar, 0));
                bVar2.setOnEditorActionListener(new ha(unVar, 1));
                unVar.Z.X4 = bVar2;
                org.telegram.messenger.i0.h3(new ag.o0(unVar, measuredHeight, bVar2, 19), 100L);
                bVar.a(true, true);
            }
        }
    }

    public static void b0(un unVar, org.telegram.ui.Components.z60 z60Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) z60Var.A;
        org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(unVar.getParentActivity(), unVar.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new m5.e(unVar, z60Var, false, 11), unVar.getResourceProvider());
        goVar.e(unVar.f42297j6, unVar.b(), null);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(goVar.f26476f);
        z60Var.f32933n0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b10);
    }

    public static void b1(un unVar, int i10) {
        tg.f fVar = unVar.G;
        if (Build.VERSION.SDK_INT >= 31 && fVar != null) {
            if (v7.u7.a(i10, 4)) {
                gi.a e = unVar.glassEngine.e();
                float L = org.telegram.messenger.i0.L(48.0f);
                float L2 = org.telegram.messenger.i0.L(48.0f);
                int i11 = 0;
                while (i11 < e.f7532b) {
                    RectF rectF = (RectF) e.f7531a.get(i11);
                    rectF.inset(-L, -L2);
                    if (rectF.isEmpty()) {
                        e.d(i11);
                    } else {
                        i11++;
                    }
                }
                e.b(unVar.f42492z0.getY(), unVar.f42492z0.getWidth(), unVar.f42492z0.getY() + unVar.f42492z0.getHeight());
                fVar.h(e);
            }
            km kmVar = unVar.l1;
            fVar.e(kmVar.f38895p0, kmVar.getWidth(), unVar.l1.getHeight());
        }
    }

    public static void c0(un unVar, org.telegram.ui.Components.z60 z60Var) {
        if (unVar.f42278hc == null) {
            return;
        }
        z60Var.u();
        unVar.Z9(unVar.f42278hc, false, true);
        gf.f.q(unVar.getParentActivity(), Uri.parse(unVar.f42278hc.R0), true, false, false, null, null, false, org.telegram.messenger.vp.r1(unVar.currentAccount).f18777e6, false);
    }

    public static void c1(un unVar) {
        org.telegram.ui.Components.r30.h.a();
        unVar.showDialog(new ph.l1(unVar.getParentActivity(), unVar.currentAccount, unVar.a(), null, null));
    }

    public static void c2(un unVar, float f7) {
        View view = unVar.f42399r9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).setSlidingOffset(f7);
        } else if (view instanceof org.telegram.ui.Cells.s0) {
            ((org.telegram.ui.Cells.s0) view).setWalletSlidingOffset(f7);
        }
    }

    public static void d0(un unVar, long j10, long j11, Long l4, Boolean bool) {
        boolean z10 = false;
        rh.e6 y3 = rh.e6.y(unVar.currentAccount, false);
        if (l4.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y3.g0(j10, j11, z10, true);
    }

    public static void d1(org.telegram.ui.un r7, java.lang.String r8, org.telegram.messenger.jj r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.d1(org.telegram.ui.un, java.lang.String, org.telegram.messenger.jj, boolean):void");
    }

    public static void d2(un unVar) {
        long j10;
        tp tpVar = unVar.ia;
        if (tpVar != null) {
            if (unVar.f42445v4) {
                if (tpVar.H != null) {
                    if (unVar.getParentLayout() != null) {
                        org.telegram.ui.Components.y8.a(unVar, unVar.getParentLayout().getFragmentStack().indexOf(unVar), unVar.e, unVar.f42243f, unVar.f42382q4, unVar.f42297j6, unVar.Oa, unVar.Na);
                    }
                    TLRPC.Chat chat = unVar.e;
                    TLRPC.TL_forumTopic tL_forumTopic = unVar.ia.H;
                    long j11 = unVar.f42297j6;
                    int i10 = unVar.Na;
                    int i11 = unVar.Oa;
                    if (unVar.getParentLayout() != null) {
                        org.telegram.ui.Components.y8.a(unVar, unVar.getParentLayout().getFragmentStack().indexOf(unVar), chat, null, tL_forumTopic, j11, i10, i11);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", unVar.ia.f41887a);
                    bundle.putInt("dialog_filter_id", unVar.ia.f41889b);
                    bundle.putBoolean("pulled", true);
                    un g10 = gg.e.g(unVar, -unVar.f42297j6, unVar.ia.H, 0, bundle);
                    g10.f42314ka = true;
                    f42176hd = true;
                    unVar.presentFragment(g10, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = tpVar.G;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f19793id;
            }
            if (j10 != 0) {
                unVar.C6();
                tp tpVar2 = unVar.ia;
                TLRPC.Chat chat3 = tpVar2.G;
                long j13 = tpVar2.Z;
                int i12 = tpVar2.f41887a;
                int i13 = tpVar2.f41889b;
                if (unVar.getParentLayout() != null) {
                    org.telegram.ui.Components.y8.a(unVar, unVar.getParentLayout().getFragmentStack().indexOf(unVar), chat3, null, null, j13, i12, i13);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = unVar.ia.G;
                if (chat4 != null) {
                    j12 = chat4.f19793id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", unVar.ia.f41887a);
                bundle2.putInt("dialog_filter_id", unVar.ia.f41889b);
                bundle2.putBoolean("pulled", true);
                org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit().remove("diditem" + unVar.ia.Z).apply();
                un unVar2 = new un(bundle2);
                ArrayList arrayList = unVar.Ab;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = unVar.Ab;
                    unVar2.Ab = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                unVar2.f42314ka = true;
                f42176hd = true;
                unVar.presentFragment(unVar2, true);
            }
        }
    }

    public static void e0(un unVar, int i10) {
        if (i10 != 0) {
            org.telegram.messenger.i0.g3(new df(unVar, i10, 7));
        } else {
            unVar.actionBar.setSubtitle(org.telegram.messenger.cd.L0(2131748209, null));
        }
    }

    public static void e1(un unVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.vp.r1(unVar.currentAccount).n1(user.f19942id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new mh(unVar, tL_attachMenuBot, user, 0), 66);
    }

    public static boolean f0(org.telegram.ui.un r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.f0(org.telegram.ui.un, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void f1(un unVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i10, org.telegram.messenger.jj jjVar, int i11, int i12, org.telegram.messenger.jj jjVar2) {
        boolean z10;
        int i13;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i14 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            unVar.Ec = true;
            unVar.f42492z0.g1();
            Bundle bundle = new Bundle();
            final long B0 = org.telegram.messenger.jj.B0(((org.telegram.messenger.jj) arrayList.get(0)).f16337k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("historyPreloaded", z10);
            un unVar2 = new un(bundle);
            unVar2.Hb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i10 != 0) {
                unVar2.f42200b8 = i10;
            }
            if (jjVar != null && (messageReplies = jjVar.f16337k.replies) != null && (messageReplies2 = unVar2.l4.f16337k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (jjVar != null && (tL_messageReactions = jjVar.f16337k.reactions) != null) {
                unVar2.l4.f16337k.reactions = tL_messageReactions;
            }
            ag.g3 g3Var = new ag.g3(unVar, new boolean[]{false}, i11, unVar2, 12);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i15 = message.f19814id;
                        i13 = i12;
                        if (i15 > i13 && !message.out) {
                            i14 = i15;
                            break;
                        }
                    }
                }
                i13 = i12;
                final int classGuid = unVar2.getClassGuid();
                org.telegram.messenger.zs.f(unVar.currentAccount).b(new zi(unVar, classGuid, g3Var, unVar2), org.telegram.messenger.zs.D);
                final int i16 = i13;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i17;
                        int i18;
                        un unVar3 = un.this;
                        org.telegram.messenger.vp messagesController = unVar3.getMessagesController();
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
                        messagesController.H3(messages_messages2, size2, B0, 0L, 30, i17, 0, false, classGuid, i14, 0, 0, 0, i20, true, 0, ((org.telegram.messenger.jj) i0.a.g(1, arrayList)).f1(), 1, false, 0, true, unVar3.f42445v4, null);
                    }
                });
                return;
            }
            g3Var.run();
            return;
        }
        unVar.Dc = 0;
        unVar.Ec = false;
        unVar.f42492z0.g1();
        if (jjVar2 != null) {
            unVar.wa(jjVar2);
        } else if (unVar.getParentActivity() != null) {
            org.telegram.ui.Components.cc.a0(unVar).t(org.telegram.messenger.cd.L0(2131752330, null), unVar.f42477xa).j();
        }
    }

    public static void g1(un unVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (unVar.getParentActivity() != null) {
            TLRPC.Chat chat = unVar.e;
            if (chat != null) {
                if (org.telegram.messenger.w3.j(chat) && !unVar.e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (unVar.h == null && (userFull = unVar.f42385q8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42477xa);
                String L0 = org.telegram.messenger.cd.L0(2131743867, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131743868, null);
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131743869, null), new re(unVar, 22));
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                unVar.showDialog(x1Var);
            } else if (!unVar.T4.isEmpty()) {
                org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit().putInt("pin_" + unVar.f42297j6, ((Integer) unVar.T4.get(0)).intValue()).commit();
                unVar.Sc(0, true);
            }
        }
    }

    public static un ga(int i10, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i10);
        return new un(bundle);
    }

    public static void h0(un unVar, long j10, long j11) {
        rh.e6.y(unVar.currentAccount, false).C(j10, j11, new dg(unVar, j10, j11, 0));
    }

    public static void h1(un unVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = unVar.getMessagesController().i1(unVar.f42297j6);
                tL_messages_getHistory.offset_date = unVar.M7 + 86400;
                tL_messages_getHistory.limit = 1;
                unVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new ag.k0(15, unVar, tLObject));
                return;
            }
            unVar.actionBar.setSubtitle(org.telegram.messenger.cd.L0(2131748209, null));
        }
    }

    public static un ha(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new un(bundle);
    }

    public static void i0(un unVar, int i10, org.telegram.messenger.jj jjVar) {
        if (i10 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f19834id = unVar.getMessagesController().p1(unVar.f42243f);
            unVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new pe(unVar, 4));
            return;
        }
        org.telegram.messenger.oz g10 = org.telegram.messenger.oz.g(unVar.getUserConfig().f(), unVar.f42297j6, jjVar, unVar.l4, null, null, true, 0, 0);
        g10.K = unVar.P8();
        org.telegram.messenger.qz.C(unVar.currentAccount).r0(g10);
        if (unVar.f42248f4 == 0) {
            unVar.ea(false);
        }
        unVar.r9(false);
    }

    public static void i1(un unVar) {
        if (!unVar.m7(unVar.Z.getSendButton())) {
            if (unVar.getMediaController().I(unVar.f42421t5)) {
                unVar.getMediaController().q(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = unVar.getMessagesController().i1(unVar.f42297j6);
            if (unVar.f42434u5 != null) {
                for (int i10 = 0; i10 < unVar.f42434u5.d.size(); i10++) {
                    tL_messages_sendScheduledMessages.f19911id.add(Integer.valueOf(((org.telegram.messenger.jj) unVar.f42434u5.d.get(i10)).f1()));
                }
            } else {
                tL_messages_sendScheduledMessages.f19911id.add(Integer.valueOf(unVar.f42421t5.f1()));
            }
            ConnectionsManager.getInstance(unVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new ag.k0(18, unVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void i2(un unVar, View view, boolean z10, float f7, float f10) {
        org.telegram.messenger.jj jjVar;
        int i10;
        int i11;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            jjVar = q1Var.getMessageObject();
            q1Var.f22565g1 = f7;
            q1Var.f22576h1 = f10;
            org.telegram.ui.Components.aa0 aa0Var = q1Var.Ra;
            float f11 = q1Var.f22576h1;
            aa0Var.h = q1Var.getTranslationX() + f7;
            aa0Var.f24347i = f11;
            aa0Var.f24350l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.s0) {
            jjVar = ((org.telegram.ui.Cells.s0) view).getMessageObject();
        } else {
            jjVar = null;
        }
        int R8 = unVar.R8(jjVar);
        if ((jjVar == null || ((i11 = jjVar.D) != 30 && i11 != 18 && i11 != 25)) && R8 >= 2 && R8 != 20 && R8 != 21) {
            if (jjVar == null || ((i10 = jjVar.D) != 27 && i10 != 30)) {
                if (jjVar == null || !jjVar.X4()) {
                    if (jjVar == null || (!jjVar.r4() && !org.telegram.messenger.jj.c3(jjVar.f16337k))) {
                        unVar.E6(jjVar, z10, true);
                        unVar.xc();
                        unVar.sd(false);
                    }
                }
            }
        }
    }

    public static void j0(un unVar, long j10, boolean z10, boolean z11) {
        if (!org.telegram.messenger.i0.E1(unVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.iz0.c(unVar.getParentActivity(), unVar.currentAccount, -j10, unVar.getUserConfig().f(), null, z10, z11, unVar.getResourceProvider());
    }

    public static void j1(long j10, un unVar) {
        if (rh.e6.y(unVar.currentAccount, false).p().amount < j10) {
            new rh.x7(unVar.getParentActivity(), unVar.getResourceProvider(), j10, 13, org.telegram.messenger.o5.t(unVar.a()), new mf(unVar, 21), unVar.a()).show();
        } else {
            new rh.y7(unVar.getParentActivity(), unVar.resourceProvider).show();
        }
    }

    public static void j2(un unVar, int i10) {
        int i11;
        boolean z10;
        ArrayList arrayList = unVar.K6;
        SparseArray[] sparseArrayArr = unVar.f42333m6;
        if (!unVar.f42289ib && (i11 = i10 - unVar.C0.J) >= 0 && i11 < arrayList.size()) {
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i11);
            if (sparseArrayArr[0].get(jjVar.f1(), null) == null && sparseArrayArr[1].get(jjVar.f1(), null) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i12 = 0; i12 < sparseArrayArr[0].size(); i12++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i12), (org.telegram.messenger.jj) sparseArrayArr[0].valueAt(i12));
            }
            for (int i13 = 0; i13 < sparseArrayArr[1].size(); i13++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i13), (org.telegram.messenger.jj) sparseArrayArr[1].valueAt(i13));
            }
            org.telegram.ui.Components.tk0 tk0Var = unVar.f42492z0;
            ?? obj = new Object();
            obj.d = unVar;
            obj.f12382b = z10;
            obj.f12383c = sparseArray;
            if (!tk0Var.f30602b2) {
                tk0Var.f30620k2 = new int[2];
                new HashSet();
                tk0Var.n1(tk0Var, true);
                tk0Var.f30610f2 = obj;
                tk0Var.f30602b2 = true;
                tk0Var.f30608e2 = i10;
                tk0Var.f30606d2 = i10;
            }
        }
    }

    public static void k0(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, rf rfVar) {
        String str4;
        if (unVar.f42421t5 != null && i10 < arrayList.size() && unVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            org.telegram.messenger.jj jjVar = unVar.f42421t5;
            if (jjVar != null) {
                TLRPC.Message message = jjVar.f16337k;
            }
            org.telegram.ui.Components.m31.T0(unVar.getParentActivity(), unVar, inputPeer, iArr[0], unVar.f42421t5.K2, str, str4, charSequence, z10, rfVar, new mf(unVar, 22)).f21608o0 = false;
            unVar.I7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(unVar.currentAccount).e7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + unVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit();
                edit.putInt("dialog_show_translate_count" + unVar.a(), i11 - 1).apply();
                unVar.ld(true);
            }
        }
    }

    public static void k1(un unVar, long j10, boolean z10) {
        if (!unVar.T4.isEmpty()) {
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit();
            edit.putInt("pin_" + unVar.f42297j6, ((Integer) unVar.T4.get(0)).intValue()).commit();
            unVar.T4.clear();
            unVar.V4.clear();
            unVar.X4 = 0;
            unVar.f42197b5 = 0;
            unVar.f42211c5 = 0;
            unVar.Sc(0, true);
        }
        if (org.telegram.messenger.w3.p0(unVar.e) && org.telegram.messenger.w3.A(unVar.currentAccount, unVar.e, 24)) {
            if (j10 != 0) {
                org.telegram.messenger.hs messagesStorage = unVar.getMessagesStorage();
                messagesStorage.f15938a.c(new org.telegram.messenger.aq(1, -unVar.e.f19793id, j10, messagesStorage));
                unVar.getMessagesController().i0(j10, 0, unVar.getMessagesController().i1(-unVar.e.f19793id));
                unVar.getMessagesController().f18891r7.s(unVar.e.f19793id, j10);
            }
        } else {
            unVar.getMessagesController().X(1, unVar.f42297j6, z10);
            org.telegram.messenger.hs messagesStorage2 = unVar.getMessagesStorage();
            long j11 = unVar.f42297j6;
            messagesStorage2.getClass();
            messagesStorage2.I(new org.telegram.messenger.cq(messagesStorage2, j11, 2));
            org.telegram.messenger.x00 x00Var = unVar.getMessagesController().f18891r7;
            x00Var.getClass();
            org.telegram.messenger.i0.g3(new org.telegram.messenger.kt((Object) x00Var, -unVar.f42297j6, true, 1));
        }
        unVar.f42212c6.put(j10, 0);
        org.telegram.ui.Components.o21 o21Var = unVar.f42246f2;
        if (o21Var != null) {
            o21Var.setAllTopicsHidden(false);
        }
        if (j10 == unVar.f42394r4) {
            unVar.G7(false, null);
            unVar.C0.O(false);
        }
    }

    public static boolean k2(un unVar, View view, RectF rectF) {
        RectF rectF2 = unVar.f42190ac;
        if (rectF != null && unVar.f42492z0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void k4(un unVar, org.telegram.ui.Cells.f0 f0Var) {
        String charSequence;
        if (org.telegram.messenger.vp.r1(unVar.currentAccount).f18910t7.s()) {
            CharSequence text = f0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            org.telegram.messenger.js.d(charSequence, new a7(unVar, f0Var, text, 3), new y0(f0Var, 16), false);
            return;
        }
        f0Var.setClickable(false);
    }

    public static void l0(un unVar, String str) {
        Uri parse = Uri.parse(str);
        d50.b(unVar.getParentActivity(), unVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void l1(un unVar, org.telegram.messenger.ej ejVar, org.telegram.messenger.jj jjVar, int i10, int i11) {
        if (ejVar != null) {
            ArrayList arrayList = ejVar.d;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.qz.C(unVar.currentAccount).u((org.telegram.messenger.jj) arrayList.get(0), unVar, i10, i11);
                return;
            }
        }
        org.telegram.messenger.qz.C(unVar.currentAccount).u(jjVar, unVar, i10, i11);
    }

    public static void l4(un unVar) {
        if (unVar.W3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i10 = unVar.f42248f4;
        if (i10 == 3) {
            tL_message.message = org.telegram.messenger.cd.L0(2131745911, null);
        } else if (i10 == 9) {
            tL_message.message = org.telegram.messenger.cd.L0(2131742919, null);
        } else {
            tL_message.message = org.telegram.messenger.cd.L0(2131752671, null);
        }
        tL_message.f19814id = 0;
        org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(unVar.currentAccount, tL_message, false, false);
        unVar.W3 = jjVar;
        jjVar.D = 10;
        jjVar.U = 1;
    }

    public static void m0(un unVar, boolean[] zArr, Context context) {
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.jj jjVar2 = unVar.D5;
        if (jjVar2 == null || !org.telegram.messenger.jj.c3(jjVar2.f16337k)) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i10 = unVar.Jb;
            if (i10 == 5) {
                int i11 = unVar.currentAccount;
                long j10 = unVar.f42297j6;
                org.telegram.messenger.oj ojVar = unVar.f42459w5;
                if (ojVar == null) {
                    ojVar = org.telegram.messenger.oj.a();
                }
                new rh.e0(context, i11, j10, ojVar, unVar, unVar.getResourceProvider(), 0, new ze(unVar, 1)).show();
            } else if (i10 == 1 && (jjVar = unVar.F5) != null) {
                if (jjVar.p5() && !z10) {
                    org.telegram.messenger.oj ojVar2 = unVar.f42459w5;
                    if (ojVar2 == null) {
                        ojVar2 = org.telegram.messenger.oj.a();
                    }
                    unVar.mc(ojVar2);
                } else if (unVar.F5.t() && unVar.E5 == 0) {
                    if (unVar.X1 == null) {
                        unVar.M7();
                    }
                    unVar.X1.v1(-1, unVar.F5);
                    unVar.na();
                } else {
                    unVar.k(unVar.F5.f1(), 0, true, 0, true, 0);
                }
            } else if (unVar.f42446v5 != null) {
                if (i10 == 2) {
                    if (!org.telegram.messenger.o5.C(unVar.f42297j6) && !unVar.f42446v5.f17131u && unVar.f42248f4 != 5) {
                        int i12 = org.telegram.messenger.tz.f18131a;
                        SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                        org.telegram.messenger.tz.Q = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        unVar.sa(0);
                        return;
                    }
                    org.telegram.messenger.jj jjVar3 = unVar.D5;
                    if (jjVar3 != null) {
                        unVar.k(jjVar3.f1(), 0, true, 0, true, 0);
                    }
                } else if (i10 == 3) {
                    int i13 = org.telegram.messenger.tz.f18131a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.vp.d1().edit();
                    org.telegram.messenger.tz.P = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    unVar.sa(1);
                } else if (i10 == 4) {
                    unVar.sa(2);
                }
            }
        }
    }

    public static void m1(un unVar, int i10) {
        org.telegram.ui.ActionBar.z4 z4Var = unVar.parentLayout;
        if (z4Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.k2 backgroundFragment = z4Var.getBackgroundFragment();
        if (backgroundFragment instanceof un) {
            un unVar2 = (un) backgroundFragment;
            if (unVar2.a() == unVar.f42297j6) {
                unVar.finishFragment();
                unVar2.k(i10, 0, true, 0, true, 0);
                return;
            }
        }
        unVar.presentFragment(ga(i10, unVar.f42297j6));
    }

    public static void m4(un unVar) {
        if (unVar.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.cd.L0(2131742920, null);
        tL_message.f19814id = 0;
        org.telegram.messenger.jj jjVar = new org.telegram.messenger.jj(unVar.currentAccount, tL_message, false, false);
        unVar.X3 = jjVar;
        jjVar.D = 10;
        jjVar.U = 1;
    }

    public static void n0(un unVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            rh.h8.l1(unVar.getParentActivity(), unVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, unVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            unVar.presentFragment(new sm0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void n1(un unVar) {
        if (unVar.f42332m5) {
            unVar.f42332m5 = false;
            MediaController B = MediaController.B();
            if (B.J() && !B.K() && B.f14452f1 == unVar.classGuid) {
                B.D0(false);
            }
        }
    }

    public static void o0(un unVar) {
        org.telegram.ui.Cells.q1 q1Var;
        wl wlVar;
        int i10;
        if (!unVar.f42339mc && unVar.T3 && unVar.f42492z0.G && unVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = unVar.f42492z0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = unVar.f42492z0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f16337k != null && q1Var.getMessageObject().f16337k.video_processing_pending) {
                            if (q1Var.getCurrentPosition() != null) {
                                if (q1Var.getMessageObject() != null && (q1Var.getCurrentPosition().f14783l & 8) != 0) {
                                    int i11 = q1Var.getCurrentPosition().f14783l;
                                    if (q1Var.getMessageObject().P3()) {
                                        i10 = 1;
                                    } else {
                                        i10 = 2;
                                    }
                                    if ((i11 & i10) == 0) {
                                        continue;
                                    }
                                }
                            }
                            q1Var.getLocationInWindow(iArr);
                            float timeY = q1Var.getTimeY() + iArr[1];
                            if (timeY >= org.telegram.messenger.i0.L(240.0f) && timeY <= (org.telegram.messenger.i0.f16026q.y - org.telegram.messenger.i0.L(25.0f)) - org.telegram.messenger.i0.f16021n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    q1Var = null;
                    break;
                }
            }
            if (q1Var != null) {
                unVar.f42339mc = true;
                wl wlVar2 = new wl(unVar, unVar.getParentActivity());
                wlVar2.p(true);
                wlVar2.K = Layout.Alignment.ALIGN_CENTER;
                wlVar2.d = 3500L;
                wlVar2.T = true;
                wlVar2.e = true;
                wlVar2.h = org.telegram.messenger.i0.L(150.0f);
                wlVar2.q(8.0f);
                unVar.P1 = wlVar2;
                wlVar2.s(org.telegram.messenger.cd.L0(2131743624, null));
                unVar.l1.addView(unVar.P1, w7.b6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                q1Var.getLocationInWindow(iArr);
                unVar.Q1 = q1Var.getTimeY() + iArr[1];
                unVar.P1.setTranslationY(((-wlVar.getTop()) - org.telegram.messenger.i0.L(120.0f)) + unVar.Q1);
                unVar.P1.m(0.0f, (q1Var.f22796y9 / 2.0f) + (-org.telegram.messenger.i0.L(16.0f)) + iArr[0] + q1Var.A9);
                unVar.P1.u();
                return;
            }
            org.telegram.messenger.i0.r(new me(unVar, 2));
            org.telegram.messenger.i0.h3(new me(unVar, 2), 2000L);
        }
    }

    public static void o1(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            org.telegram.messenger.ui.b0(unVar.currentAccount).E0(false, true, null);
            unVar.ma(user.f19942id, unVar.A8, false);
        }
    }

    public static void p0(un unVar) {
        if (unVar.a2) {
            unVar.getMessagesController().d(0, 0, unVar.f42297j6);
            unVar.Y7();
            unVar.M3.j(23, unVar.f42297j6, null);
            SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit();
            edit.putBoolean("dialog_bar_archived" + unVar.f42297j6, false);
            edit.putBoolean("dialog_bar_block" + unVar.f42297j6, false);
            edit.putBoolean("dialog_bar_report" + unVar.f42297j6, false);
            edit.commit();
            unVar.ld(false);
            org.telegram.messenger.ot notificationsController = unVar.getNotificationsController();
            long j10 = unVar.f42297j6;
            long b10 = unVar.b();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().c().edit();
            String v = org.telegram.messenger.ot.v(j10, b10, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + v);
            remove.remove("custom_" + v);
            notificationsController.getMessagesStorage().E1(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().Q.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j10, b10, true);
        } else if (unVar.Z1.getTag() != null && ((Integer) unVar.Z1.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = unVar.f42374p8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i10 = 0; i10 < unVar.f42374p8.participants.participants.size(); i10++) {
                    hVar.k(null, unVar.f42374p8.participants.participants.get(i10).user_id);
                }
                long j11 = unVar.f42374p8.f19794id;
                org.telegram.ui.Components.m60 m60Var = new org.telegram.ui.Components.m60(unVar.getParentActivity(), unVar.currentAccount, hVar, unVar.f42374p8.f19794id, unVar, unVar.f42477xa);
                m60Var.f28298c2 = new re(unVar, 24);
                m60Var.show();
            }
        } else if (unVar.Z1.getTag() != null) {
            unVar.Kb(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", unVar.f42243f.f19942id);
            bundle.putBoolean("addContact", true);
            ns nsVar = new ns(bundle);
            nsVar.O = new re(unVar, 25);
            unVar.presentFragment(nsVar);
        }
    }

    public static void p1(un unVar) {
        if (org.telegram.messenger.i0.g(unVar.f42278hc.V0)) {
            org.telegram.messenger.z20.r(null, 2131744219, new org.telegram.ui.Components.cc(org.telegram.ui.Components.ra.a(unVar.getParentActivity()), unVar.resourceProvider));
        }
    }

    public static void p2(un unVar) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.jj primaryMessageObject;
        TLRPC.Message message;
        if (unVar.N1 != null) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = null;
        for (int childCount = unVar.f42492z0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = unVar.f42492z0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (primaryMessageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.f16337k) != null && message.via_business_bot_id != 0) {
                q1Var2 = q1Var;
            }
        }
        unVar.Nb(q1Var2);
    }

    public static void q0(un unVar, TLRPC.Document document) {
        unVar.J4.put(document, 0);
        org.telegram.messenger.qz.C(unVar.currentAccount).v0(document, null, unVar.f42297j6, null, null, null, unVar.B5, null, true, 0, 0, false, null, unVar.P8(), 0L, unVar.a9(), unVar.f42459w5);
    }

    public static void q1(un unVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.hg hgVar;
        String str;
        SparseArray[] sparseArrayArr = unVar.f42333m6;
        if (unVar.getParentActivity() != null && unVar.f42266ga == 0.0f) {
            if (unVar.f42248f4 == 3) {
                Bundle bundle = new Bundle();
                long V8 = unVar.V8();
                if (V8 >= 0) {
                    bundle.putLong("user_id", V8);
                } else {
                    bundle.putLong("chat_id", -V8);
                }
                unVar.presentFragment(new un(bundle));
                return;
            }
            boolean z12 = false;
            if (unVar.M9()) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < sparseArrayArr[0].size(); i10++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i10)));
                }
                unVar.Ob(true, true);
                byte[] bArr = unVar.f42295j4;
                String str2 = unVar.f42308k4;
                ze zeVar = new ze(unVar, 2);
                int i11 = c01.f36350s1;
                int currentAccount = unVar.getCurrentAccount();
                Activity parentActivity = unVar.getParentActivity();
                long a2 = unVar.a();
                if (parentActivity != null) {
                    c01.J0(currentAccount, parentActivity, a2, false, false, arrayList, org.telegram.ui.Components.cc.a0(unVar), unVar.getResourceProvider(), bArr, str2, zeVar);
                }
            } else if (unVar.f42248f4 == 2) {
                unVar.finishFragment();
                gm gmVar = unVar.f42300j9;
                if (unVar.D0.getTag() == null) {
                    z12 = true;
                }
                gmVar.X(true, z12);
            } else {
                TLRPC.User user = unVar.f42243f;
                if (user != null && user.f19942id == 489000) {
                    unVar.uc(true);
                } else if (user != null && unVar.f42340n) {
                    if (user.bot) {
                        String str3 = unVar.f42437u8;
                        unVar.f42437u8 = null;
                        unVar.getMessagesController().c5(new te(unVar, str3, 3), unVar.f42243f.f19942id);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, unVar.getParentActivity(), unVar.f42477xa);
                    String L0 = org.telegram.messenger.cd.L0(2131754065, null);
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.T = L0;
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new re(unVar, 8));
                    x1Var.R = org.telegram.messenger.cd.L0(2131689472, null);
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
                    unVar.showDialog(x1Var);
                } else if (org.telegram.messenger.h20.z(user)) {
                    unVar.uc(true);
                } else {
                    TLRPC.User user2 = unVar.f42243f;
                    if (user2 != null && user2.bot && (str = unVar.f42437u8) != null) {
                        if (str.length() != 0) {
                            unVar.getMessagesController().x4(unVar.f42437u8, unVar.f42243f);
                        } else {
                            unVar.getSendMessagesHelper().r0(org.telegram.messenger.oz.b("/start", unVar.f42297j6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        unVar.f42437u8 = null;
                        unVar.Bc(false);
                        return;
                    }
                    if (org.telegram.messenger.w3.T(unVar.e)) {
                        TLRPC.Chat chat = unVar.e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (org.telegram.messenger.w3.r0(chat)) {
                                if (unVar.e.join_request) {
                                    unVar.Ob(true, true);
                                    org.telegram.messenger.vp.r1(unVar.currentAccount).m(unVar.e.f19793id, org.telegram.messenger.d20.i(unVar.currentAccount).f(), 0, null, null, true, new me(unVar, 20), new ng.d(9, unVar, context), null);
                                    return;
                                }
                                me meVar = unVar.f42198b6;
                                if (meVar != null) {
                                    org.telegram.messenger.i0.r(meVar);
                                    unVar.f42198b6 = null;
                                }
                                unVar.Ob(true, true);
                                unVar.getMessagesController().n(unVar.e.f19793id, unVar.getUserConfig().f(), null, unVar, null);
                                org.telegram.messenger.zs.e().k(org.telegram.messenger.zs.I4, new Object[0]);
                                org.telegram.ui.ActionBar.m0 m0Var = unVar.Y1;
                                if (m0Var != null && (hgVar = unVar.f42180a1) != null && hgVar.d(m0Var) && unVar.f42194b2.getVisibility() != 8 && unVar.f42194b2.getTag(2131296585) != null) {
                                    org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit().putInt("dialog_bar_vis3" + unVar.f42297j6, 3).commit();
                                    unVar.getNotificationCenter().k(org.telegram.messenger.zs.Q0, Long.valueOf(unVar.f42297j6));
                                    return;
                                }
                                return;
                            }
                            unVar.uc(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = unVar.f42374p8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = unVar.e;
                    TLRPC.User user3 = unVar.f42243f;
                    if (unVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.s4.r(unVar, false, chat2, user3, z11, true, false, z10, new re(unVar, 9));
                }
            }
        }
    }

    public static void r0(un unVar, TLRPC.ReactionCount reactionCount) {
        unVar.I7(true);
        org.telegram.ui.Components.rm0.c(unVar.getParentActivity(), unVar.currentAccount, reactionCount.reaction, unVar.f42477xa);
    }

    public static org.telegram.ui.Components.eo s0(un unVar, Context context) {
        org.telegram.ui.Components.go goVar = new org.telegram.ui.Components.go(context, unVar.currentAccount, unVar.f42279i0.getPopupLayout().getSwipeBack(), false, new sj(unVar), unVar.getResourceProvider());
        unVar.f42455w1 = goVar;
        goVar.e(unVar.f42297j6, unVar.b(), null);
        return unVar.f42455w1.f26476f;
    }

    public static void s1(un unVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            org.telegram.messenger.ui.b0(unVar.currentAccount).E0(false, true, null);
            unVar.ma(user.f19942id, unVar.A8, false);
        }
    }

    public static void t0(un unVar) {
        TLRPC.ChatFull chatFull = unVar.f42374p8;
        if (chatFull != null && !unVar.G5) {
            TLRPC.Chat chat = unVar.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && unVar.visibleDialog == null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(unVar.currentAccount).e7;
                int i10 = sharedPreferences.getInt("group_convert_time", 0);
                boolean z10 = org.telegram.messenger.v2.f18448a;
                int currentTime = unVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i10) >= 604800 && unVar.visibleDialog == null && unVar.getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = unVar.getParentActivity();
                    re reVar = new re(unVar, 15);
                    re reVar2 = new re(unVar, 16);
                    Pattern pattern = org.telegram.ui.Components.s4.f30123a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String y22 = org.telegram.messenger.i0.y2(null, 2131624036);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new bi.d2(8));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(org.telegram.messenger.d00.e(org.telegram.messenger.i0.L(320.0f), org.telegram.messenger.i0.L(127.17949f), y22)));
                    frameLayout.addView(view, w7.b6.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                    x1Var.V = frameLayout;
                    x1Var.Q0 = 0.3974359f;
                    x1Var.R = org.telegram.messenger.cd.L0(2131749573, null);
                    x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749574, null));
                    alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131749575, null), reVar);
                    alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), reVar2);
                    unVar.showDialog(x1Var);
                }
            }
        }
    }

    public static void t1(un unVar, int i10) {
        if (unVar.f42248f4 == 7) {
            Object E = unVar.f42182a4.E(i10);
            if (i10 == 0) {
                unVar.f42182a4.getClass();
            }
            if (E instanceof org.telegram.messenger.jj) {
                unVar.va((org.telegram.messenger.jj) E);
            }
        } else if (unVar.E3 != null) {
            if (i10 >= 0 && i10 < unVar.getMediaDataController().Y0.size()) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) unVar.getMediaDataController().Y0.get(i10);
                unVar.F3 = false;
                unVar.Db(false, true, false);
                org.telegram.messenger.ui mediaDataController = unVar.getMediaDataController();
                if (i10 >= 0) {
                    if (i10 < mediaDataController.Y0.size()) {
                        mediaDataController.f18316e1 = i10;
                    }
                } else {
                    mediaDataController.getClass();
                }
                unVar.Zc(unVar.getMediaDataController().c0(), unVar.getMediaDataController().f18316e1, unVar.getMediaDataController().j0());
                org.telegram.messenger.i0.g3(new ue(unVar, jjVar, 2));
            }
        } else {
            org.telegram.messenger.ui mediaDataController2 = unVar.getMediaDataController();
            int i11 = unVar.classGuid;
            ArrayList arrayList = mediaDataController2.Y0;
            if (i10 >= 0 && i10 < arrayList.size()) {
                mediaDataController2.f18316e1 = i10;
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(i10);
                mediaDataController2.getNotificationCenter().k(org.telegram.messenger.zs.H0, Integer.valueOf(i11), Integer.valueOf(jjVar2.f1()), Integer.valueOf(mediaDataController2.c0()), Long.valueOf(org.telegram.messenger.jj.B0(jjVar2.f16337k)), Integer.valueOf(mediaDataController2.f18316e1), Integer.valueOf(mediaDataController2.j0()), Boolean.TRUE);
            }
            unVar.ec(false);
        }
    }

    public static void t8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i10 = 6;
        if (z10) {
            menu.add(2131296496, 2131296502, 6, org.telegram.messenger.cd.L0(2131746455, null));
            i10 = 7;
        }
        if (z13) {
            menu.add(2131296496, 2131296508, i10, org.telegram.messenger.cd.L0(2131745280, null));
            i10++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131753671, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, i10, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131749097, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i11 = i10 + 2;
        menu.add(2131296496, 2131296497, i10 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131748365, null));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.x41(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296496, 2131296499, i11, spannableStringBuilder3);
            i11 = i10 + 3;
        }
        if (encryptedChat == null || org.telegram.messenger.i0.X0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131744463, null));
            ?? obj = new Object();
            obj.f32850a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.zz0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i12 = i11 + 1;
            menu.add(2131296496, 2131296509, i11, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.messenger.cd.L0(2131743914, null));
            ?? obj2 = new Object();
            obj2.f32850a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.zz0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i11 += 2;
            menu.add(2131296496, 2131296512, i12, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(2131296496, 2131296498, i11, org.telegram.messenger.cd.L0(2131751745, null));
            i11++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(2131296496, 2131296493, i11, org.telegram.messenger.cd.L0(2131750591, null));
            i11++;
        }
        menu.add(2131296496, 2131296503, i11, org.telegram.messenger.cd.L0(2131746352, null));
    }

    public static void u0(un unVar) {
        if (org.telegram.messenger.vp.r1(unVar.currentAccount).q2(unVar.f42297j6, unVar.b(), null)) {
            unVar.kd(true);
            org.telegram.messenger.i0.h3(new me(unVar, 9), 150L);
            unVar.f42279i0.U(null, null);
            if (unVar.getParentActivity() != null) {
                org.telegram.ui.Components.cc.z(unVar, 4, 0, unVar.f42477xa).j();
                return;
            }
            return;
        }
        View view = unVar.f42404s1.f20715j;
        if (view instanceof org.telegram.ui.ActionBar.b1) {
            ((org.telegram.ui.ActionBar.b1) view).b();
        }
    }

    public static void u1(un unVar) {
        if (unVar.f42278hc == null) {
            return;
        }
        g01[] g01VarArr = {g01.d1(unVar.getParentActivity(), unVar, true, unVar.resourceProvider, new ag.e0(20, unVar, g01VarArr))};
    }

    public static void v0(un unVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        kg.v1 v1Var = new kg.v1(unVar, unVar.currentAccount, user, null, null, unVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            v1Var.f11313v2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(unVar.getParentActivity());
        org.telegram.ui.Components.d5 d5Var = new org.telegram.ui.Components.d5(org.telegram.messenger.i0.L(160.0f), 4, g9Var, false);
        g9Var.setImageDrawable(d5Var);
        g9Var.addOnAttachStateChangeListener(new d5(d5Var, 1));
        d5Var.j(j10, false);
        v1Var.f11314w2 = true;
        v1Var.f11311t2 = g9Var;
        unVar.showDialog(v1Var);
    }

    public static void v1(long j10, un unVar) {
        unVar.getMediaDataController().G0(j10, j10, true, unVar.classGuid, null);
    }

    public static void w0(un unVar, ArrayList arrayList, long j10, org.telegram.ui.Components.nl0 nl0Var, boolean z10, int i10) {
        if (z10) {
            org.telegram.messenger.qz.C(unVar.currentAccount).q0(arrayList, j10, false, false, true, i10, 0, null, -1, 0L, 0L, null);
            org.telegram.messenger.i0.h3(new mg.t0(unVar, j10, 4), 400L);
            nl0Var.dismiss();
        }
    }

    public static void w1(long j10, un unVar) {
        if (rh.e6.y(unVar.currentAccount, false).p().amount < j10) {
            new rh.x7(unVar.getParentActivity(), unVar.getResourceProvider(), j10, 13, org.telegram.messenger.o5.t(unVar.a()), new mf(unVar, 21), unVar.a()).show();
        } else {
            new rh.y7(unVar.getParentActivity(), unVar.resourceProvider).show();
        }
    }

    public static void x0(un unVar, String str) {
        if (org.telegram.messenger.vp.r1(unVar.currentAccount).J2(false)) {
            unVar.getParentActivity();
            gf.f.m(str);
            return;
        }
        org.telegram.ui.Components.s4.n0(unVar.getParentActivity(), unVar.f42477xa, str, false, new jg(unVar, str, 0));
    }

    public static void x1(un unVar, TLRPC.Document document) {
        unVar.J4.put(document, 0);
        org.telegram.messenger.qz.C(unVar.currentAccount).v0(document, null, unVar.f42297j6, null, null, null, unVar.B5, null, true, 0, 0, false, null, unVar.P8(), 0L, unVar.a9(), unVar.f42459w5);
    }

    public static void y0(un unVar, Object[] objArr, org.telegram.ui.Components.cx0 cx0Var, boolean z10, TLRPC.StickerSet stickerSet) {
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
                org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(cx0Var.f21589c, unVar.resourceProvider);
                if (z10) {
                    i10 = 2131744862;
                } else {
                    i10 = 2131744863;
                }
                org.telegram.ui.Components.wb q6 = ccVar.q(document, org.telegram.messenger.cd.a0(null, null, i10, stickerSet.title));
                q6.f32135j = 2750;
                q6.k(true);
            }
        }
    }

    public static void y1(un unVar, int i10, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, rf rfVar) {
        String str4;
        org.telegram.ui.Components.e31 e31Var;
        if (unVar.f42421t5 != null && i10 < arrayList.size() && unVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = unVar.getParentActivity();
            int i11 = iArr[0];
            mf mfVar = new mf(unVar, 17);
            String[] strArr = org.telegram.ui.Components.m31.O1;
            if (parentActivity == null) {
                e31Var = null;
            } else {
                org.telegram.ui.Components.e31 e31Var2 = new org.telegram.ui.Components.e31(parentActivity, str, str4, inputPeer, i11, richMessage, mfVar);
                e31Var2.R0(z10);
                e31Var2.J1 = unVar;
                e31Var2.K1 = rfVar;
                if (unVar.getParentActivity() != null) {
                    unVar.showDialog(e31Var2);
                }
                e31Var = e31Var2;
            }
            e31Var.f21608o0 = false;
            unVar.I7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.vp.r1(unVar.currentAccount).e7;
            int i12 = sharedPreferences.getInt("dialog_show_translate_count" + unVar.a(), 5);
            if (i12 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.vp.r1(unVar.currentAccount).e7.edit();
                edit.putInt("dialog_show_translate_count" + unVar.a(), i12 - 1).apply();
                unVar.ld(true);
            }
        }
    }

    public static void z0(un unVar, int i10) {
        if (unVar.fragmentView != null) {
            org.telegram.ui.Cells.z A8 = unVar.A8(i10, false);
            if (A8 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) A8;
                sg.p0 p0Var = q1Var.N;
                TLRPC.MessagePeerReaction L1 = q1Var.getMessageObject().L1();
                if (L1 != null && (p0Var.H || L1.big)) {
                    sg.k0.d(unVar, null, A8, null, 0.0f, 0.0f, sg.o0.d(L1.reaction), unVar.currentAccount, !L1.big ? 1 : 0);
                    sg.k0.f();
                }
                p0Var.H = false;
                org.telegram.messenger.jj jjVar = q1Var.O5;
                if (jjVar != null) {
                    jjVar.h5();
                }
            } else if (A8 instanceof org.telegram.ui.Cells.s0) {
                org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) A8;
                sg.p0 p0Var2 = s0Var.E0;
                TLRPC.MessagePeerReaction L12 = s0Var.getMessageObject().L1();
                if (L12 != null && (p0Var2.H || L12.big)) {
                    sg.k0.d(unVar, null, A8, null, 0.0f, 0.0f, sg.o0.d(L12.reaction), unVar.currentAccount, !L12.big ? 1 : 0);
                    sg.k0.f();
                }
                p0Var2.H = false;
                org.telegram.messenger.jj jjVar2 = s0Var.P0;
                if (jjVar2 != null) {
                    jjVar2.h5();
                }
            }
        }
    }

    public static void z1(un unVar, int i10, int i11, int i12, int i13) {
        int[] iArr;
        int[] iArr2;
        char c10;
        long j10;
        int[] iArr3 = unVar.Q6;
        int[] iArr4 = unVar.P6;
        boolean[] zArr = unVar.U6;
        int[] iArr5 = unVar.O6;
        int[] iArr6 = unVar.R6;
        boolean[] zArr2 = unVar.T6;
        ArrayList arrayList = unVar.f42473x6;
        if ((i10 - i11) - i12 <= i13 && !unVar.W6) {
            boolean[] zArr3 = unVar.S6;
            if (!zArr3[0]) {
                unVar.W6 = true;
                arrayList.add(Integer.valueOf(unVar.f42321l6));
                if (unVar.H6.size() != 0) {
                    org.telegram.messenger.vp messagesController = unVar.getMessagesController();
                    j10 = 0;
                    long j11 = unVar.f42297j6;
                    c10 = 0;
                    long j12 = unVar.f42199b7;
                    int i14 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i15 = iArr6[0];
                    int i16 = unVar.classGuid;
                    int i17 = unVar.f42248f4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = unVar.f42394r4;
                    int i18 = unVar.A4;
                    int i19 = unVar.f42321l6;
                    unVar.f42321l6 = i19 + 1;
                    messagesController.W2(j11, j12, false, 50, i14, 0, z10, i15, i16, 0, i17, j13, i18, i19, unVar.f42445v4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c10 = 0;
                    j10 = 0;
                    org.telegram.messenger.vp messagesController2 = unVar.getMessagesController();
                    long j14 = unVar.f42297j6;
                    long j15 = unVar.f42199b7;
                    boolean z11 = !zArr2[0];
                    int i20 = iArr6[0];
                    int i21 = unVar.classGuid;
                    int i22 = unVar.f42248f4;
                    long j16 = unVar.f42394r4;
                    int i23 = unVar.A4;
                    int i24 = unVar.f42321l6;
                    unVar.f42321l6 = i24 + 1;
                    messagesController2.W2(j14, j15, false, 50, 0, 0, z11, i20, i21, 0, i22, j16, i23, i24, unVar.f42445v4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c10 = 0;
                j10 = 0;
                if (unVar.f42199b7 != 0 && !zArr3[1]) {
                    unVar.W6 = true;
                    arrayList.add(Integer.valueOf(unVar.f42321l6));
                    org.telegram.messenger.vp messagesController3 = unVar.getMessagesController();
                    long j17 = unVar.f42199b7;
                    int i25 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i26 = iArr6[1];
                    int i27 = unVar.classGuid;
                    int i28 = unVar.f42248f4;
                    long j18 = unVar.f42394r4;
                    int i29 = unVar.A4;
                    int i30 = unVar.f42321l6;
                    unVar.f42321l6 = i30 + 1;
                    messagesController3.W2(j17, 0L, false, 50, i25, 0, z12, i26, i27, 0, i28, j18, i29, i30, unVar.f42445v4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c10 = 0;
            j10 = 0;
        }
        if (i12 > 0 && !unVar.Y7 && i11 <= 10) {
            if (unVar.f42199b7 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(unVar.f42321l6));
                org.telegram.messenger.vp messagesController4 = unVar.getMessagesController();
                long j19 = unVar.f42199b7;
                int i31 = iArr2[1];
                int i32 = iArr[1];
                int i33 = unVar.classGuid;
                int i34 = unVar.f42248f4;
                long j20 = unVar.f42394r4;
                int i35 = unVar.A4;
                int i36 = unVar.f42321l6;
                unVar.f42321l6 = i36 + 1;
                messagesController4.W2(j19, 0L, false, 50, i31, 0, true, i32, i33, 1, i34, j20, i35, i36, unVar.f42445v4);
                unVar.Y7 = true;
            } else if (!zArr[c10]) {
                arrayList.add(Integer.valueOf(unVar.f42321l6));
                org.telegram.messenger.vp messagesController5 = unVar.getMessagesController();
                long j21 = unVar.f42297j6;
                long j22 = unVar.f42199b7;
                int i37 = iArr2[c10];
                int i38 = iArr[c10];
                int i39 = unVar.classGuid;
                int i40 = unVar.f42248f4;
                long j23 = unVar.f42394r4;
                int i41 = unVar.A4;
                int i42 = unVar.f42321l6;
                unVar.f42321l6 = i42 + 1;
                messagesController5.W2(j21, j22, false, 50, i37, 0, true, i38, i39, 1, i40, j23, i41, i42, unVar.f42445v4);
                unVar.Y7 = true;
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
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
    }

    public final void A6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.A6():void");
    }

    public final void A7() {
        int i10;
        float f7 = (1.0f - this.Uc.e) * (1.0f - this.Sc.e);
        this.f42468x1.setTranslationX((1.0f - f7) * org.telegram.messenger.i0.L(80.0f));
        this.f42468x1.setAlpha(f7);
        bh.k kVar = this.f42468x1;
        if (f7 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        kVar.setVisibility(i10);
    }

    public final org.telegram.ui.Cells.z A8(int i10, boolean z10) {
        org.telegram.messenger.jj messageObject;
        vj vjVar = this.f42492z0;
        if (vjVar != null) {
            int childCount = vjVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.f42492z0.getChildAt(i11);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    messageObject = ((org.telegram.ui.Cells.s0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.f1() == i10) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.L9 - this.N9) - org.telegram.messenger.i0.L(4.0f) || childAt.getY() > this.f42492z0.getMeasuredHeight() - this.Ua) {
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
        if (!this.W9) {
            this.W9 = true;
            km kmVar = this.l1;
            if (kmVar != null) {
                kmVar.invalidate();
            }
            vj vjVar = this.f42492z0;
            if (vjVar != null) {
                vjVar.invalidate();
            }
        }
        UndoView undoView = this.M3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(j9(org.telegram.ui.Components.k21.f27624c) + this.T.getInputBubbleHeight() + this.f42453w.d() + org.telegram.messenger.i0.L(16.0f));
        }
        D7();
    }

    public final void Aa(TLRPC.Chat chat) {
        boolean z10;
        vh.p2 p2Var = this.J1;
        if (p2Var != null && p2Var.V) {
            p2Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        vh.p2 p2Var2 = this.K1;
        if (p2Var2 != null && p2Var2.V) {
            p2Var2.e(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.i0.h3(new zg(2, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f20497n0) {
            this.Vc.a(true, true);
            org.telegram.ui.ActionBar.t0 t0Var = this.f42279i0;
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f42244f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cs csVar = this.f42232e0;
            if (csVar != null) {
                csVar.b(false);
            }
            org.telegram.ui.ActionBar.t0 t0Var2 = this.f42291j0;
            if (t0Var2 != null) {
                t0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = this.f42354o0;
            if (t0Var3 != null && this.f42229da) {
                t0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f42367p0;
            if (xVar2 != null && this.f42241ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = this.f42304k0;
            if (t0Var4 != null) {
                t0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var5 = this.f42317l0;
            if (t0Var5 != null) {
                t0Var5.setVisibility(8);
            }
            this.f42378q0 = true;
            Zc(0, 0, -1);
            Bc(false);
            ImageView imageView = this.f42259g3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f42270h3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var6 = this.f42291j0;
        if (t0Var6 != null) {
            this.f42491yc = true;
            this.f42284i5 = false;
            t0Var6.F(false);
            this.f42491yc = false;
        }
        pb(chat, null);
        Sc(0, true);
    }

    public final void Ab(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f42477xa != null && this.f42451va == null) {
            yf.b c10 = yf.b.c(chatTheme);
            org.telegram.messenger.g4 f7 = org.telegram.messenger.g4.f(this.currentAccount);
            f7.s(this.f42297j6, yf.b.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                f7.p(chatTheme);
                org.telegram.ui.ActionBar.y3 i10 = f7.i(c10);
                if (i10 == null) {
                    i10 = new org.telegram.ui.ActionBar.y3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    i10.k();
                    i10.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.y3 y3Var = i10;
                sn snVar = this.f42477xa;
                TLRPC.WallPaper wallPaper = snVar.f41591g;
                if (this.f42250f6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                snVar.r(y3Var, wallPaper, z11, null, false);
                return;
            }
            if (c10 != null && !c10.b()) {
                re reVar = new re(this, 14);
                String str = c10.f54429b;
                if (c10.b()) {
                    reVar.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.y3 y3Var2 = (org.telegram.ui.ActionBar.y3) f7.e.get(str);
                    if (y3Var2 != null) {
                        y3Var2.k();
                        reVar.onComplete(y3Var2);
                    } else {
                        reVar.onComplete(null);
                    }
                } else {
                    f7.q(new org.telegram.messenger.f4(c10, reVar), false);
                }
            }
            TLRPC.WallPaper d = f7.d(this.f42297j6);
            sn snVar2 = this.f42477xa;
            org.telegram.ui.ActionBar.y3 y3Var3 = snVar2.f41590f;
            if (this.f42250f6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            snVar2.r(y3Var3, d, z10, null, false);
        }
    }

    public final void Ac() {
        if (this.f42246f2 == null) {
            return;
        }
        this.f42246f2.setSideMenuBackgroundMarginBottom(((this.T.getInputBubbleHeight() + org.telegram.messenger.i0.L(9.0f)) - org.telegram.messenger.i0.L(5.0f)) + this.f42453w.d());
    }

    public final void B6(org.telegram.messenger.jj jjVar, org.telegram.messenger.jj jjVar2) {
        long E1 = jjVar.E1();
        if (E1 != 0) {
            a0.h hVar = this.M6;
            ArrayList arrayList = (ArrayList) hVar.f(E1);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.m5.i(hVar, E1);
            }
            arrayList.add(jjVar);
            if (jjVar2 != null) {
                arrayList.remove(jjVar2);
            }
        }
    }

    public final void B7() {
        un unVar = this.f42463wa;
        if (unVar != null) {
            unVar.B7();
        }
        float i92 = i9(org.telegram.messenger.i0.L(7.0f)) + this.actionBar.getMeasuredHeight() + org.telegram.messenger.i0.L(1.0f);
        if (this.f42246f2 != null) {
            i92 += j9(org.telegram.ui.Components.k21.f27622a);
        }
        if (this.C1 != null) {
            i92 += org.telegram.messenger.i0.L(35.0f) * this.C1.E;
        }
        this.Y.setFadeZoneTop((int) ((M8() * org.telegram.messenger.i0.L(43.0f)) + i92));
    }

    public final org.telegram.ui.Cells.s0 B8(TL_wallet.walletTransaction wallettransaction) {
        if (this.f42492z0 != null && this.C0 != null) {
            for (int i10 = 0; i10 < this.f42492z0.getChildCount(); i10++) {
                View childAt = this.f42492z0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.s0) {
                    org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                    if (org.telegram.ui.Wallet.k0.I(s0Var.getMessageObject(), wallettransaction)) {
                        return s0Var;
                    }
                }
            }
            int i11 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i11 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.k0.I((org.telegram.messenger.jj) arrayList.get(i11), wallettransaction)) {
                    this.f42492z0.C0();
                    this.B0.h1(this.C0.J + i11, 0);
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
        if (this.l1 != null) {
            if (this.f42352nb <= 0 && this.f42365ob <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            pj pjVar = this.f42453w;
            float c10 = pjVar.c();
            fe.n nVar = pjVar.f7696b;
            int max = (int) Math.max(0.0f, (c10 * nVar.f7048a) - org.telegram.messenger.i0.L(29.0f));
            km kmVar = this.l1;
            bi.t0 t0Var = kmVar.L;
            Rect rect2 = this.Zc;
            if (t0Var != null) {
                rect2.set(0, 0, kmVar.getMeasuredWidth(), this.l1.getMeasuredHeight() - max);
                this.l1.L.setClipBounds(rect2);
            }
            if (this.f42492z0 != null) {
                rect2.set(0, 0, this.l1.getMeasuredWidth(), this.l1.getMeasuredHeight() - max);
                rect2.offset(0, -this.f42492z0.getTop());
                vj vjVar = this.f42492z0;
                if (vjVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                vjVar.setClipBounds(rect);
            }
            if (this.Y != null) {
                rect2.set(0, 0, this.l1.getMeasuredWidth(), this.l1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(pjVar.f7702w, pjVar.c() * nVar.f7048a) - org.telegram.messenger.i0.L(29.0f))));
                bh.i iVar = this.Y;
                if (z10) {
                    rect2 = null;
                }
                iVar.setClipBounds(rect2);
            }
        }
    }

    public final void Ba(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i10;
        org.telegram.ui.ActionBar.t0 t0Var;
        int i11;
        vh.p2 p2Var = this.J1;
        if (p2Var != null && p2Var.V) {
            p2Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        vh.p2 p2Var2 = this.K1;
        if (p2Var2 != null && p2Var2.V) {
            p2Var2.e(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.i0.h3(new te(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f20497n0) {
            this.Vc.a(true, true);
            org.telegram.ui.ActionBar.t0 t0Var2 = this.f42279i0;
            if (t0Var2 != null) {
                t0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f42244f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cs csVar = this.f42232e0;
            if (csVar != null) {
                csVar.b(false);
            }
            if ((this.f42394r4 == 0 || (i11 = this.f42248f4) == 3 || i11 == 8) && (t0Var = this.f42291j0) != null) {
                t0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = this.f42354o0;
            if (t0Var3 != null && this.f42229da) {
                t0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f42367p0;
            if (xVar2 != null && this.f42241ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = this.f42304k0;
            if (t0Var4 != null) {
                t0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var5 = this.f42317l0;
            if (t0Var5 != null) {
                t0Var5.setVisibility(8);
            }
            this.f42378q0 = true;
            Zc(0, 0, -1);
            Bc(false);
        }
        if ((this.f42394r4 == 0 || this.f42445v4 || (i10 = this.f42248f4) == 3 || i10 == 8) && !org.telegram.messenger.h20.z(this.f42243f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f42284i5 = z11;
            org.telegram.ui.ActionBar.t0 t0Var6 = this.f42291j0;
            if (t0Var6 != null) {
                t0Var6.F(z11);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var7 = this.f42291j0;
        if (t0Var7 != null) {
            t0Var7.P(str, false);
        }
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.H3 = str2;
        mediaDataController.X1(str2, this.f42297j6, this.f42199b7, this.classGuid, 0, this.f42394r4, false, this.C3, this.D3, !TextUtils.isEmpty(str), this.E3);
        Sc(0, true);
    }

    public final void Bb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i10 = 0; i10 < viewGroup.getChildCount(); i10++) {
                Bb(viewGroup.getChildAt(i10), z10);
            }
        }
        if (view != this.f42492z0 && view != this.l1) {
            view.setEnabled(z10);
        }
    }

    public final void Bc(boolean r39) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Bc(boolean):void");
    }

    public final void C6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.y8.a(this, getParentLayout().getFragmentStack().indexOf(this), this.e, this.f42243f, null, this.f42297j6, this.Oa, this.Na);
    }

    public final void C7() {
        if (this.f42180a1 != null) {
            this.f42180a1.setPadding(org.telegram.messenger.i0.L(7.0f) + ((int) ((1.0f - M8()) * (1.0f - this.Uc.e) * e9())), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f), org.telegram.messenger.i0.L(7.0f));
        }
    }

    public final void C8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.C8():void");
    }

    public final void C9() {
        this.Ka = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Ca(TLRPC.User user) {
        boolean z10;
        vh.p2 p2Var = this.J1;
        if (p2Var != null && p2Var.V) {
            p2Var.e(true);
            z10 = true;
        } else {
            z10 = false;
        }
        vh.p2 p2Var2 = this.K1;
        if (p2Var2 != null && p2Var2.V) {
            p2Var2.e(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.i0.h3(new ig(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f20497n0) {
            this.Vc.a(true, true);
            org.telegram.ui.ActionBar.t0 t0Var = this.f42279i0;
            if (t0Var != null) {
                t0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar = this.f42244f0;
            if (xVar != null) {
                xVar.e(8);
            }
            cs csVar = this.f42232e0;
            if (csVar != null) {
                csVar.b(false);
            }
            org.telegram.ui.ActionBar.t0 t0Var2 = this.f42291j0;
            if (t0Var2 != null) {
                t0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = this.f42354o0;
            if (t0Var3 != null && this.f42229da) {
                t0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.x xVar2 = this.f42367p0;
            if (xVar2 != null && this.f42241ea) {
                xVar2.e(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var4 = this.f42304k0;
            if (t0Var4 != null) {
                t0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.t0 t0Var5 = this.f42317l0;
            if (t0Var5 != null) {
                t0Var5.setVisibility(8);
            }
            this.f42378q0 = true;
            Zc(0, 0, -1);
            Bc(false);
            ImageView imageView = this.f42259g3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.f42270h3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var6 = this.f42291j0;
        if (t0Var6 != null) {
            this.f42491yc = true;
            this.f42284i5 = false;
            t0Var6.F(false);
            this.f42491yc = false;
        }
        pb(null, user);
        Sc(0, true);
    }

    public final void Cb(boolean z10) {
        Db(z10, false, true);
    }

    public final void Cc() {
        Bc(false);
    }

    @Override
    public final org.telegram.ui.Components.uu0 D() {
        return this.l1;
    }

    public final void D6(org.telegram.messenger.jj jjVar, boolean z10) {
        E6(jjVar, z10, true);
    }

    public final void D7() {
        float f7 = this.P9;
        wk wkVar = this.C1;
        if (wkVar != null) {
            wkVar.setTranslationY(f7);
            f7 += org.telegram.messenger.i0.L(35.0f) * this.C1.E;
        }
        kk kkVar = this.D1;
        if (kkVar != null) {
            kkVar.setTranslationY(f7);
        }
        float M8 = (M8() * org.telegram.messenger.i0.L(43.0f)) + f7;
        org.telegram.ui.Components.o21 o21Var = this.f42246f2;
        org.telegram.ui.Components.k21 k21Var = org.telegram.ui.Components.k21.f27622a;
        if (o21Var != null) {
            o21Var.setSideMenuBackgroundMarginTop((M8() * i9(org.telegram.messenger.i0.L(7.0f))) + M8);
            float j92 = j9(k21Var);
            float a2 = w7.n7.a(this.Uc.e);
            float M82 = M8();
            M8 += w7.n7.a(Math.min(w7.u.a(w7.n7.a(a2), 0.0f, 1.0f), w7.u.a(w7.n7.a(M82), 0.0f, 1.0f))) * j92;
        }
        org.telegram.ui.Components.hg hgVar = this.f42180a1;
        if (hgVar != null) {
            hgVar.setTranslationY((M8 - org.telegram.messenger.i0.L(5.0f)) - (M8() * j9(k21Var)));
        }
    }

    public final boolean D8() {
        boolean z10;
        org.telegram.messenger.ej currentMessagesGroup;
        int childCount = this.f42492z0.getChildCount();
        HashMap hashMap = null;
        int i10 = 0;
        while (true) {
            z10 = true;
            if (i10 >= childCount) {
                break;
            }
            View childAt = this.f42492z0.getChildAt(i10);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = ((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.f15395b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.f15394a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.f15394a), currentMessagesGroup);
                    int indexOf = this.K6.indexOf((org.telegram.messenger.jj) i0.a.g(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        fm fmVar = this.C0;
                        fmVar.k(indexOf + fmVar.J, currentMessagesGroup.d.size());
                        this.f42492z0.setItemAnimator(null);
                    }
                }
            }
            i10++;
        }
        if (!org.telegram.messenger.i0.Q1()) {
            return true;
        }
        if (org.telegram.messenger.i0.P1() && org.telegram.messenger.w0.f19025b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(false));
            return false;
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && !z4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        lVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.c2(z10));
        return false;
    }

    public final void D9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().e() && !getUserConfig().q() && (user = this.f42243f) != null && user.contact_require_premium) {
            boolean isEmpty = this.K6.isEmpty();
            if (getMessagesController().H2(a()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEmpty != z10) {
                getMessagesController().m2(this.classGuid, a());
            }
        }
    }

    public final void Da(long j10) {
        int i10 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.f42355o1.e(true, false);
            } else if (getMessagesController().o2(j10)) {
                showDialog(new yh.a0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().E(bundle, this, null, null)) {
                    presentFragment(new un(bundle));
                }
            }
        } else if (j10 != getUserConfig().e()) {
            if (j10 == a()) {
                this.f42355o1.e(true, false);
                return;
            }
            Bundle k10 = org.telegram.ui.Cells.f1.k(j10, "user_id");
            if (this.h != null && j10 == this.f42243f.f19942id) {
                k10.putLong("dialog_id", this.f42297j6);
            }
            ProfileActivity profileActivity = new ProfileActivity(k10, null);
            TLRPC.User user = this.f42243f;
            if (user != null && user.f19942id == j10) {
                i10 = 1;
            }
            profileActivity.f5(i10);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j10);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void Db(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Db(boolean, boolean, boolean):void");
    }

    public final void Dc() {
        int i10;
        org.telegram.ui.Components.bb bbVar;
        xk xkVar;
        mk mkVar;
        if (this.W9 && this.f42492z0 != null) {
            float f7 = 0.0f;
            if (this.Ia <= 0 || this.Xa != 0.0f) {
                float i92 = i9(org.telegram.messenger.i0.L(7.0f));
                wk wkVar = this.C1;
                if (wkVar != null) {
                    i10 = org.telegram.messenger.i0.L(wkVar.E * 35.0f);
                } else {
                    i10 = 0;
                }
                float M8 = (M8() * org.telegram.messenger.i0.L(43.0f)) + i92 + i10;
                float f10 = this.L9;
                this.M9 = M8;
                this.L9 = j9(org.telegram.ui.Components.k21.f27622a) + org.telegram.messenger.i0.L(4.0f) + this.O9 + M8;
                if (this.actionBar.getVisibility() == 0 || this.f42463wa != null) {
                    this.L9 += this.actionBar.getMeasuredHeight();
                }
                this.N9 = 0;
                this.L9 = this.L9 + this.Ta + this.P9;
                if (this.Xa != 0.0f && (mkVar = this.Z) != null && mkVar.getVisibility() == 0) {
                    float f11 = this.L9;
                    float measuredHeight = this.Xa * (this.Z.getMeasuredHeight() - org.telegram.messenger.i0.L(44.0f));
                    this.L9 = f11 - measuredHeight;
                    f7 = measuredHeight;
                }
                org.telegram.ui.Cells.s0 s0Var = this.f42344n3;
                if (s0Var != null) {
                    s0Var.setTranslationY(((this.f42492z0.getTranslationY() + this.L9) + this.T9) - org.telegram.messenger.i0.L(30.0f));
                    float f12 = this.L9;
                    float f13 = this.T9;
                    this.L9 = f12 + f13;
                    this.N9 = (int) (this.N9 + f13);
                }
                dk dkVar = this.f42319l3;
                if (dkVar != null) {
                    dkVar.setTranslationY((((this.f42492z0.getTranslationY() - f7) + this.L9) + this.R9) - org.telegram.messenger.i0.L(4.0f));
                }
                Fc();
                vj vjVar = this.f42492z0;
                if (vjVar != null && this.B0 != null && this.C0 != null) {
                    int paddingTop = vjVar.getPaddingTop();
                    int paddingBottom = this.f42492z0.getPaddingBottom();
                    v7();
                    if (this.f42492z0.getPaddingTop() != paddingTop || this.f42492z0.getPaddingBottom() != paddingBottom) {
                        C9();
                    }
                    this.f42492z0.setTopGlowOffset((int) ((this.L9 - this.N9) - org.telegram.messenger.i0.L(4.0f)));
                    if (f10 != this.L9) {
                        int childCount = this.f42492z0.getChildCount();
                        int i11 = 0;
                        while (true) {
                            if (i11 >= childCount) {
                                break;
                            }
                            View childAt = this.f42492z0.getChildAt(i11);
                            this.f42492z0.getClass();
                            if (RecyclerView.R(childAt) == this.C0.b() - 1) {
                                float f14 = this.L9;
                                if (childAt.getTop() > f14) {
                                    this.f42492z0.scrollBy(0, (int) (childAt.getTop() - f14));
                                }
                            } else {
                                i11++;
                            }
                        }
                    }
                    if (!T9() && !this.P4 && this.Z7 != null && this.f42492z0 != null && ((xkVar = this.f42221d2) == null || xkVar.getVisibility() != 0)) {
                        this.f42492z0.scrollBy(0, (int) (f10 - this.L9));
                    }
                }
                this.W9 = false;
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
                if (wbVar != null && (bbVar = wbVar.e) != null) {
                    bbVar.updatePosition();
                }
                v7();
            }
        }
    }

    @Override
    public final void E(float f7, int i10) {
        if (i10 == 2 && f7 == 0.0f) {
            ih.d dVar = this.Yc;
            if (dVar != null) {
                this.l1.removeView(dVar);
                this.Yc = null;
            }
            mk mkVar = this.Z;
            if (mkVar != null) {
                mkVar.F0();
            }
        }
    }

    public final void E6(org.telegram.messenger.jj jjVar, boolean z10, boolean z11) {
        ?? r18;
        boolean z12;
        boolean z13;
        boolean z14;
        float f7;
        int i10;
        org.telegram.ui.ActionBar.t0 t0Var;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        TLRPC.Chat chat;
        boolean z15;
        char c10;
        ?? r10;
        int i23;
        char c11;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        String str;
        int i29;
        boolean z16;
        boolean z17;
        char c12;
        TLRPC.Message message;
        boolean z18;
        TLRPC.Message message2;
        boolean z19;
        boolean z20;
        boolean z21;
        int i30 = this.f42396r6;
        if (jjVar != null) {
            ArrayList arrayList = this.f42358o4;
            if (arrayList == null || !arrayList.contains(jjVar) || T9()) {
                if (org.telegram.messenger.jj.B0(jjVar.f16337k) == this.f42297j6) {
                    c12 = 0;
                } else {
                    c12 = 1;
                }
                if (z10 && jjVar.d1() != 0) {
                    org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.N6.f(jjVar.d1());
                    if (ejVar != null) {
                        boolean z22 = false;
                        int i31 = 0;
                        for (int i32 = 0; i32 < ejVar.d.size(); i32++) {
                            if (this.f42333m6[c12].indexOfKey(((org.telegram.messenger.jj) ejVar.d.get(i32)).f1()) < 0) {
                                i31 = i32;
                                z22 = true;
                            }
                        }
                        for (int i33 = 0; i33 < ejVar.d.size(); i33++) {
                            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) ejVar.d.get(i33);
                            if (z22) {
                                if (this.f42333m6[c12].indexOfKey(jjVar2.f1()) < 0) {
                                    if (i33 == i31) {
                                        z21 = true;
                                    } else {
                                        z21 = false;
                                    }
                                    E6(jjVar2, false, z21);
                                }
                            } else {
                                if (i33 == ejVar.d.size() - 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                E6(jjVar2, false, z20);
                            }
                            if (!TextUtils.isEmpty(jjVar2.f16394z)) {
                                nc(jjVar);
                            }
                        }
                        return;
                    }
                    return;
                } else if (this.f42333m6[c12].indexOfKey(jjVar.f1()) >= 0) {
                    this.f42333m6[c12].remove(jjVar.f1());
                    if (!M9()) {
                        if ((jjVar.D == 0 || jjVar.G2() || jjVar.f16394z != null) && ((message2 = jjVar.f16337k) == null || !message2.noforwards)) {
                            this.f42347n6[c12].remove(jjVar.f1());
                        }
                        if (!jjVar.G2() && ((jjVar.t4() || jjVar.J2()) && org.telegram.messenger.jj.v4(jjVar.F0()))) {
                            this.f42360o6[c12].remove(jjVar.f1());
                        }
                        if (jjVar.u(this.e)) {
                            this.f42422t6--;
                        }
                        if (this.f42248f4 == 1) {
                            z19 = true;
                        } else {
                            z19 = false;
                        }
                        if (!jjVar.s(this.e, z19)) {
                            this.q6--;
                        }
                        boolean K9 = K9();
                        if (this.f42248f4 == 1 || !jjVar.w() || K9) {
                            this.f42396r6--;
                        } else {
                            this.f42409s6--;
                        }
                        if (jjVar.I3() && K6(jjVar)) {
                            this.f42447v6--;
                        } else if (jjVar.U2() && K6(jjVar)) {
                            this.f42460w6--;
                        } else {
                            this.f42435u6--;
                        }
                    }
                } else if (this.f42333m6[1].size() + this.f42333m6[0].size() >= 100) {
                    org.telegram.messenger.i0.E3(this.f42368p1);
                    Vibrator vibrator = (Vibrator) org.telegram.messenger.w0.f19025b.getSystemService("vibrator");
                    if (vibrator != null) {
                        vibrator.vibrate(200L);
                        return;
                    }
                    return;
                } else {
                    this.f42333m6[c12].put(jjVar.f1(), jjVar);
                    if (!M9()) {
                        if ((jjVar.D == 0 || jjVar.G2() || jjVar.f16394z != null) && ((message = jjVar.f16337k) == null || !message.noforwards)) {
                            this.f42347n6[c12].put(jjVar.f1(), jjVar);
                        }
                        if (!jjVar.G2() && ((jjVar.t4() || jjVar.J2()) && org.telegram.messenger.jj.v4(jjVar.F0()))) {
                            this.f42360o6[c12].put(jjVar.f1(), jjVar);
                        }
                        if (jjVar.u(this.e)) {
                            this.f42422t6++;
                        }
                        if (this.f42248f4 == 1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (!jjVar.s(this.e, z18)) {
                            this.q6++;
                        }
                        boolean K92 = K9();
                        if (this.f42248f4 == 1 || !jjVar.w() || K92) {
                            this.f42396r6++;
                        } else {
                            this.f42409s6++;
                        }
                        if (jjVar.I3() && K6(jjVar)) {
                            this.f42447v6++;
                        } else if (jjVar.U2() && K6(jjVar)) {
                            this.f42460w6++;
                        } else {
                            this.f42435u6++;
                        }
                        if (z10) {
                            nc(jjVar);
                        }
                    }
                }
            } else {
                return;
            }
        }
        if (z11 && this.actionBar.u() && !M9()) {
            int size = this.f42333m6[1].size() + this.f42333m6[0].size();
            if (size == 0) {
                p9();
                Sc(0, true);
            } else {
                L7();
                org.telegram.ui.ActionBar.t0 j10 = this.actionBar.m(null).j(25);
                org.telegram.ui.ActionBar.t0 j11 = this.actionBar.m(null).j(10);
                org.telegram.ui.ActionBar.t0 j12 = this.actionBar.m(null).j(22);
                org.telegram.ui.ActionBar.t0 j13 = this.actionBar.m(null).j(23);
                org.telegram.ui.ActionBar.t0 j14 = this.actionBar.m(null).j(11);
                org.telegram.ui.ActionBar.t0 j15 = this.actionBar.m(null).j(12);
                org.telegram.ui.ActionBar.t0 j16 = this.actionBar.m(null).j(28);
                org.telegram.ui.ActionBar.t0 j17 = this.actionBar.m(null).j(69);
                if (!K9() && !n9()) {
                    z12 = false;
                    r18 = 0;
                } else {
                    r18 = 0;
                    z12 = true;
                }
                float f10 = 0.5f;
                if ((i30 == 0 && this.f42396r6 != 0) || (i30 != 0 && this.f42396r6 == 0)) {
                    this.f42249f5 = new AnimatorSet();
                    ArrayList arrayList2 = new ArrayList();
                    if (j14 != null) {
                        if (this.f42396r6 != 0 && !z12) {
                            z17 = r18;
                        } else {
                            z17 = true;
                        }
                        j14.setEnabled(z17);
                        Property property = View.ALPHA;
                        if (this.f42396r6 == 0) {
                            f10 = 1.0f;
                        }
                        float[] fArr = new float[1];
                        fArr[r18] = f10;
                        arrayList2.add(ObjectAnimator.ofFloat(j14, property, fArr));
                        if (z12 && j14.getBackground() != null) {
                            j14.setBackground(null);
                        } else if (j14.getBackground() == null) {
                            int i34 = org.telegram.ui.ActionBar.t6.f21332z8;
                            org.telegram.ui.Cells.y h02 = org.telegram.ui.ActionBar.t6.h0(getThemedColor(i34), 5, -1);
                            org.telegram.ui.ActionBar.w6 N = org.telegram.ui.ActionBar.a7.N(i34);
                            org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
                            j14.setBackground(h02);
                            org.telegram.ui.ActionBar.a7.k(j14, h02, null, N, resourceProvider);
                        }
                    }
                    bh.e eVar = this.f42220d1;
                    if (eVar != null) {
                        if (this.f42396r6 != 0 && !z12) {
                            z16 = r18;
                        } else {
                            z16 = true;
                        }
                        bh.d dVar = eVar.f2782c;
                        ((fe.b) dVar.d).a(z16, true);
                        ((ah.a) dVar.f2777a).setEnabled(z16);
                    }
                    this.f42249f5.playTogether(arrayList2);
                    this.f42249f5.setDuration(100L);
                    this.f42249f5.addListener(new bi(this, 10));
                    this.f42249f5.start();
                } else {
                    if (j14 != null) {
                        if (this.f42396r6 != 0 && !z12) {
                            z14 = r18;
                        } else {
                            z14 = true;
                        }
                        j14.setEnabled(z14);
                        if (this.f42396r6 == 0) {
                            f7 = 1.0f;
                        } else {
                            f7 = 0.5f;
                        }
                        j14.setAlpha(f7);
                        if (!z12 && j14.getBackground() == null) {
                            int i35 = org.telegram.ui.ActionBar.t6.f21332z8;
                            org.telegram.ui.Cells.y h03 = org.telegram.ui.ActionBar.t6.h0(getThemedColor(i35), 3, -1);
                            org.telegram.ui.ActionBar.w6 N2 = org.telegram.ui.ActionBar.a7.N(i35);
                            org.telegram.ui.ActionBar.p6 resourceProvider2 = getResourceProvider();
                            j14.setBackground(h03);
                            org.telegram.ui.ActionBar.a7.k(j14, h03, null, N2, resourceProvider2);
                        }
                    }
                    bh.e eVar2 = this.f42220d1;
                    if (eVar2 != null) {
                        if (this.f42396r6 != 0 && !z12) {
                            z13 = r18;
                        } else {
                            z13 = true;
                        }
                        bh.d dVar2 = eVar2.f2782c;
                        ((fe.b) dVar2.d).a(z13, r18);
                        ((ah.a) dVar2.f2777a).setEnabled(z13);
                    }
                }
                if (j10 != null) {
                    int i36 = this.f42447v6;
                    if (((i36 > 0 && this.f42460w6 == 0) || (i36 == 0 && this.f42460w6 > 0)) && this.f42435u6 == 0) {
                        i28 = 0;
                    } else {
                        i28 = 8;
                    }
                    j10.setVisibility(i28);
                    if (this.f42447v6 > 0) {
                        i29 = 2131745928;
                        str = null;
                    } else {
                        str = null;
                        i29 = 2131745948;
                    }
                    j10.setContentDescription(org.telegram.messenger.cd.L0(i29, str));
                }
                if (j11 != null) {
                    j11.getVisibility();
                    if (!z12) {
                        if (this.f42347n6[1].size() + this.f42347n6[0].size() != 0) {
                            i27 = 0;
                            j11.setVisibility(i27);
                            j11.getVisibility();
                        }
                    }
                    i27 = 8;
                    j11.setVisibility(i27);
                    j11.getVisibility();
                }
                if (j12 != null) {
                    j12.getVisibility();
                    if (getMediaDataController().s()) {
                        if (this.f42360o6[1].size() + this.f42360o6[0].size() == size) {
                            i26 = 0;
                            j12.setVisibility(i26);
                            j12.getVisibility();
                        }
                    }
                    i26 = 8;
                    j12.setVisibility(i26);
                    j12.getVisibility();
                }
                if (j15 != null) {
                    if (this.q6 == 0) {
                        i25 = 0;
                    } else {
                        i25 = 8;
                    }
                    j15.setVisibility(i25);
                }
                this.f42372p6 = false;
                for (int i37 = 0; i37 < 2; i37++) {
                    int i38 = 0;
                    while (true) {
                        if (i38 >= this.f42360o6[i37].size()) {
                            break;
                        }
                        org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) this.f42360o6[i37].valueAt(i38);
                        if (jjVar3 != null && !getMediaDataController().A0(jjVar3.F0())) {
                            this.f42372p6 = true;
                            break;
                        }
                        i38++;
                    }
                    if (this.f42372p6) {
                        break;
                    }
                }
                if (j12 != null) {
                    if (this.f42372p6) {
                        i24 = 2131232130;
                    } else {
                        i24 = 2131232409;
                    }
                    j12.setIcon(i24);
                }
                if (this.f42422t6 == 1 && size == 1) {
                    i10 = 0;
                } else {
                    i10 = 8;
                }
                if (this.f42220d1 != null) {
                    qk qkVar = this.f42207c1;
                    if ((qkVar != null && qkVar.getVisibility() == 0 && !this.W0) || ((chat = this.e) != null && ((org.telegram.messenger.w3.r0(chat) && !T9()) || ((org.telegram.messenger.w3.T(this.e) && !org.telegram.messenger.w3.w(5, this.e) && !this.e.megagroup) || !org.telegram.messenger.w3.n(this.e))))) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    if (this.f42248f4 == 1 || !z15 || (this.f42333m6[0].size() != 0 && this.f42333m6[1].size() != 0)) {
                        t0Var = j10;
                        c10 = '\b';
                    } else if (size == 1) {
                        char c13 = 0;
                        int size2 = this.f42333m6[0].size();
                        int i39 = 0;
                        while (true) {
                            if (i39 < size2) {
                                org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) this.f42333m6[c13].valueAt(i39);
                                if (org.telegram.messenger.w3.c0(this.e) && !N6(jjVar4)) {
                                    c11 = '\b';
                                    break;
                                } else {
                                    i39++;
                                    c13 = 0;
                                }
                            } else {
                                c11 = 0;
                                break;
                            }
                        }
                        t0Var = j10;
                        c10 = c11;
                    } else {
                        int i40 = 2;
                        long j18 = 0;
                        int i41 = 0;
                        c10 = 0;
                        while (i41 < i40) {
                            int size3 = this.f42333m6[i41].size();
                            int i42 = 0;
                            while (true) {
                                t0Var = j10;
                                if (i42 < size3) {
                                    org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) this.f42333m6[i41].valueAt(i42);
                                    long d12 = jjVar5.d1();
                                    if (d12 == 0 || (j18 != 0 && j18 != d12)) {
                                        break;
                                    }
                                    i23 = i41;
                                    if (org.telegram.messenger.w3.c0(this.e) && !N6(jjVar5)) {
                                        break;
                                    }
                                    i42++;
                                    j10 = t0Var;
                                    j18 = d12;
                                    i41 = i23;
                                } else {
                                    i23 = i41;
                                    break;
                                }
                            }
                            i23 = i41;
                            c10 = '\b';
                            if (c10 == '\b') {
                                break;
                            }
                            i41 = i23 + 1;
                            i40 = 2;
                            j10 = t0Var;
                        }
                        t0Var = j10;
                    }
                    if (this.f42358o4 != null && c10 == 0) {
                        i12 = 0;
                        int size4 = this.f42333m6[0].size();
                        for (int i43 = 0; i43 < size4; i43++) {
                            if (this.f42358o4.contains((org.telegram.messenger.jj) this.f42333m6[0].valueAt(i43))) {
                                c10 = '\b';
                            }
                        }
                    } else {
                        i12 = 0;
                    }
                    bh.e eVar3 = this.f42220d1;
                    if (c10 == 0) {
                        r10 = 1;
                    } else {
                        r10 = i12;
                    }
                    i11 = 1;
                    ((fe.b) eVar3.f2781b.f2779c).a(r10, true);
                } else {
                    t0Var = j10;
                    i11 = 1;
                    i12 = 0;
                }
                if (j13 != null) {
                    j13.setVisibility(i10);
                }
                if (j17 != null) {
                    if (size == i11 && !z12) {
                        i21 = i11;
                    } else {
                        i21 = i12;
                    }
                    if (i21 != 0) {
                        int i44 = i12;
                        for (int i45 = i44; i45 < 2; i45++) {
                            for (int i46 = i12; i46 < this.f42333m6[i45].size(); i46++) {
                                org.telegram.messenger.jj jjVar6 = (org.telegram.messenger.jj) this.f42333m6[i45].valueAt(i46);
                                if (jjVar6 != null && !jjVar6.S4() && !jjVar6.g4()) {
                                    TLRPC.Message message3 = jjVar6.f16337k;
                                    if (!message3.noforwards && (org.telegram.messenger.jj.R4(message3) || jjVar6.h4())) {
                                        i44 = i11;
                                    }
                                }
                            }
                        }
                        i21 = i44;
                    }
                    if (i21 != 0) {
                        i22 = i12;
                    } else {
                        i22 = 8;
                    }
                    j17.setVisibility(i22);
                }
                if (j16 != null) {
                    if (getUserConfig().q()) {
                        if (j13 != null && j13.getVisibility() == 0) {
                            i14 = i11;
                        } else {
                            i14 = i12;
                        }
                        if (j14 != null && j14.getVisibility() == 0) {
                            i15 = i11;
                        } else {
                            i15 = i12;
                        }
                        int i47 = i14 + i15;
                        if (t0Var != null && t0Var.getVisibility() == 0) {
                            i16 = i11;
                        } else {
                            i16 = i12;
                        }
                        int i48 = i47 + i16;
                        if (j11 != null && j11.getVisibility() == 0) {
                            i17 = i11;
                        } else {
                            i17 = i12;
                        }
                        int i49 = i48 + i17;
                        if (j15 != null && j15.getVisibility() == 0) {
                            i18 = i11;
                        } else {
                            i18 = i12;
                        }
                        int i50 = i49 + i18;
                        if (j12 != null && j12.getVisibility() == 0) {
                            i19 = i11;
                        } else {
                            i19 = i12;
                        }
                        int i51 = i50 + i19;
                        if (j17 != null && j17.getVisibility() == 0) {
                            i20 = i11;
                        } else {
                            i20 = i12;
                        }
                        if (i51 + i20 < 4) {
                            i13 = i12;
                            j16.setVisibility(i13);
                        }
                    }
                    i13 = 8;
                    j16.setVisibility(i13);
                }
            }
        }
        fd();
    }

    public final void E7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i10;
        org.telegram.messenger.jj jjVar;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.L6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i11 = 0;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i12 = 0;
            while (true) {
                arrayList = this.K6;
                if (i12 >= size) {
                    break;
                }
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) sparseArray.valueAt(i12);
                if (jjVar2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i12)));
                    if (!(jjVar2.f16337k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = jjVar2.C.f16337k.fwd_from) != null && org.telegram.messenger.jj.C1(messageFwdHeader.saved_from_peer) == this.f42297j6 && (i10 = jjVar2.C.f16337k.fwd_from.channel_post) != 0 && (jjVar = (org.telegram.messenger.jj) this.E6[i11].get(i10)) != null && (messageReplies = jjVar.f16337k.replies) != null) {
                        messageReplies.replies++;
                        jjVar.f16331i1 = true;
                        TLRPC.Message message = jjVar2.f16337k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i13 = i11;
                        while (true) {
                            if (i13 >= size2) {
                                break;
                            } else if (org.telegram.messenger.jj.C1(jjVar.f16337k.replies.recent_repliers.get(i13)) == org.telegram.messenger.jj.C1(peer)) {
                                jjVar.f16337k.replies.recent_repliers.remove(i13);
                                break;
                            } else {
                                i13++;
                            }
                        }
                        jjVar.f16337k.replies.recent_repliers.add(i11, peer);
                        if (!jjVar2.N3()) {
                            jjVar.f16337k.replies.max_id = jjVar2.f1();
                        }
                        org.telegram.messenger.hs messagesStorage = getMessagesStorage();
                        long j10 = this.e.f19793id;
                        int f12 = jjVar.f1();
                        TLRPC.MessageReplies messageReplies2 = jjVar.f16337k.replies;
                        messagesStorage.f15938a.c(new org.telegram.messenger.i8(messagesStorage, f12, j10, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (jjVar.z2()) {
                            org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.N6.f(jjVar.d1());
                            if (ejVar != null) {
                                ArrayList arrayList4 = ejVar.d;
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(ejVar, ejVar.f15394a);
                                int size3 = arrayList4.size();
                                for (int i14 = 0; i14 < size3; i14++) {
                                    ((org.telegram.messenger.jj) arrayList4.get(i14)).f16331i1 = true;
                                }
                            }
                        } else if (this.C0 != null && (indexOf = arrayList.indexOf(jjVar)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.C0.J));
                        }
                    }
                }
                i12++;
                i11 = 0;
            }
            if (arrayList2 != null) {
                int size4 = arrayList2.size();
                for (int i15 = 0; i15 < size4; i15++) {
                    sparseArray.remove(((Integer) arrayList2.get(i15)).intValue());
                }
            }
            if (this.C0 != null) {
                if (hVar != null) {
                    int m10 = hVar.m();
                    for (int i16 = 0; i16 < m10; i16++) {
                        org.telegram.messenger.ej ejVar2 = (org.telegram.messenger.ej) hVar.n(i16);
                        int indexOf2 = arrayList.indexOf((org.telegram.messenger.jj) i0.a.g(1, ejVar2.d));
                        if (indexOf2 >= 0) {
                            fm fmVar = this.C0;
                            if (!fmVar.N) {
                                fmVar.k(indexOf2 + fmVar.J, ejVar2.d.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.C0.N) {
                    int size5 = arrayList3.size();
                    for (int i17 = 0; i17 < size5; i17++) {
                        this.C0.g(((Integer) arrayList3.get(i17)).intValue());
                    }
                }
            }
        }
    }

    public final void E8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i10, long j10) {
        boolean z13;
        if (!arrayList.isEmpty() && n7()) {
            boolean z14 = false;
            if (i10 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f42248f4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.H9 = true;
                fm fmVar = this.C0;
                if (fmVar != null) {
                    fmVar.K(true);
                }
            }
            int q02 = getSendMessagesHelper().q0(arrayList, this.f42297j6, z10, z11, z12, i10, 0, this.l4, -1, j10, a9(), this.f42459w5);
            org.telegram.ui.Components.s4.s0(q02, this, this.f42477xa);
            if (q02 != 0) {
                org.telegram.messenger.i0.g3(new mf(this, 24));
            }
        }
    }

    public final boolean E9() {
        if (this.f42246f2 != null && this.f42394r4 == 0) {
            return true;
        }
        return false;
    }

    public final void Ea(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap r10 = org.telegram.messenger.qz.r(1, str);
            PhotoViewer.v1().N2(null, this, this.f42477xa);
            ArrayList arrayList = new ArrayList();
            org.telegram.messenger.ef efVar = new org.telegram.messenger.ef(0, str, 0, true, 0, 0);
            efVar.f19506a = charSequence;
            arrayList.add(efVar);
            if (PhotoViewer.v1().U1()) {
                PhotoViewer.v1().H0(false, false);
            }
            PhotoViewer.v1().j2(arrayList, 0, 0, false, new sl(this, r10, arrayList), this);
            return;
        }
        u8(charSequence, null);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j10 = this.f42297j6;
        org.telegram.messenger.jj jjVar = this.D5;
        org.telegram.messenger.jj jjVar2 = this.l4;
        kn knVar = this.B5;
        org.telegram.messenger.qz.b0(0, 0, 0, j10, 0L, 0L, a9(), null, str, null, null, accountInstance, jjVar, jjVar2, this.F5, this.f42459w5, P8(), null, null, null, knVar, true, false, false);
        F6();
    }

    public final void Eb(int i10, int i11, String str) {
        this.f42200b8 = i10;
        this.f42227d8 = true;
        this.f42239e8 = 0L;
        this.f42251f8 = str;
        this.f42287i8 = i11;
        this.f42214c8 = true;
    }

    public final void Ec(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        org.telegram.messenger.ej ejVar;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.messenger.jj jjVar;
        ArrayList arrayList2 = new ArrayList(org.telegram.messenger.ui.b0(this.currentAccount).Y0);
        if (this.f42414sb == null) {
            this.f42414sb = new a0.h();
        }
        a0.h hVar2 = this.f42401rb;
        if (hVar2 == null) {
            this.f42401rb = new a0.h();
        } else {
            hVar2.b();
        }
        this.C0.P.clear();
        this.f42414sb.b();
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
            org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList2.get(i10);
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    jjVar = (org.telegram.messenger.jj) arrayList.get(i11);
                    if (org.telegram.messenger.jj.B0(jjVar.f16337k) == org.telegram.messenger.jj.B0(jjVar2.f16337k) && jjVar.f1() == jjVar2.f1()) {
                        break;
                    }
                    i11++;
                } else {
                    jjVar = null;
                    break;
                }
            }
            if (jjVar2.f16339k1 == 0) {
                if (jjVar == null) {
                    jjVar2.K(true);
                } else {
                    jjVar2.f16387x0 = jjVar.f16387x0;
                    jjVar2.f16383w0 = jjVar.f16383w0;
                }
            }
            if (jjVar != null) {
                jjVar2.f16343l2 = jjVar.f16343l2;
                if (this.C0.N && jjVar2.f16339k1 != 0) {
                    jjVar.N(jjVar2);
                } else {
                    jjVar2.N(jjVar);
                }
            } else if (jjVar2.f16339k1 == 0) {
                int i12 = f42171cd;
                f42171cd = i12 + 1;
                jjVar2.f16339k1 = i12;
            }
            jjVar2.R2 = null;
            TLRPC.Message message2 = jjVar2.f16337k;
            if (message2 != null) {
                message2.out = true;
            }
            jjVar2.P3();
            if (jjVar2.z2()) {
                org.telegram.messenger.ej ejVar2 = (org.telegram.messenger.ej) hVar.f(jjVar2.e1());
                if (ejVar2 == null) {
                    ejVar2 = new org.telegram.messenger.ej();
                    ejVar2.f15404n = this.f42302jb;
                    long d12 = jjVar2.d1();
                    ejVar2.f15394a = d12;
                    hVar.k(ejVar2, d12);
                } else if (hVar3 == null || hVar3.h(jjVar2.d1()) < 0) {
                    if (hVar4 == null) {
                        hVar4 = new a0.h();
                    }
                    hVar4.k(ejVar2, jjVar2.d1());
                }
                ArrayList arrayList3 = ejVar2.d;
                if (hVar3 == null) {
                    hVar3 = new a0.h();
                }
                hVar3.k(ejVar2, ejVar2.f15394a);
                if (ejVar2.d(jjVar2) == null) {
                    int i13 = 0;
                    while (true) {
                        if (i13 < arrayList3.size()) {
                            if (((org.telegram.messenger.jj) arrayList3.get(i13)).f1() == jjVar2.f1()) {
                                break;
                            }
                            i13++;
                        } else {
                            arrayList3.add(jjVar2);
                            break;
                        }
                    }
                }
            } else if (jjVar2.e1() != 0) {
                jjVar2.f16337k.grouped_id = 0L;
                jjVar2.e = 0L;
            }
            this.C0.P.add(jjVar2);
            this.f42414sb.k(jjVar2, jjVar2.f1());
            i10++;
        }
        if (hVar3 != null) {
            for (int i14 = 0; i14 < hVar3.m(); i14++) {
                org.telegram.messenger.ej ejVar3 = (org.telegram.messenger.ej) hVar3.n(i14);
                Collections.sort(ejVar3.d, new f6(2));
                ejVar3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.E3 != null && TextUtils.isEmpty(this.H3)) {
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(i15);
                if (jjVar3 != null && (message = jjVar3.f16337k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i16 = 0;
                    while (true) {
                        if (i16 >= jjVar3.f16337k.reactions.results.size()) {
                            break;
                        } else if (this.E3.f(jjVar3.f16337k.reactions.results.get(i16).reaction)) {
                            arrayList4.add(jjVar3);
                            break;
                        } else {
                            i16++;
                        }
                    }
                }
            }
        }
        for (int i17 = 0; i17 < arrayList4.size(); i17++) {
            org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) arrayList4.get(i17);
            if (!this.f42414sb.d(jjVar4.f1())) {
                jjVar4.R2 = null;
                TLRPC.Message message3 = jjVar4.f16337k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.C0.P.add(jjVar4);
                this.f42414sb.k(jjVar4, jjVar4.f1());
            }
        }
        int i18 = 0;
        while (i18 < this.C0.P.size()) {
            org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) this.C0.P.get(i18);
            if (jjVar5.z2() && (ejVar = (org.telegram.messenger.ej) hVar.f(jjVar5.d1())) != null) {
                ArrayList arrayList5 = ejVar.d;
                for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                    org.telegram.messenger.jj jjVar6 = (org.telegram.messenger.jj) arrayList5.get(size2);
                    if (jjVar6 != jjVar5 && !this.f42414sb.d(jjVar6.f1())) {
                        this.C0.P.add(i18, jjVar6);
                        this.f42414sb.k(jjVar6, jjVar6.f1());
                        i18++;
                    }
                }
            }
            i18++;
        }
        Collections.sort(this.C0.P, new f6(3));
        org.telegram.messenger.jj jjVar7 = null;
        int i19 = 0;
        while (i19 < this.C0.P.size()) {
            org.telegram.messenger.jj jjVar8 = (org.telegram.messenger.jj) this.C0.P.get(i19);
            if (this.f42302jb && jjVar8 != null && i19 == 0) {
                Sa(i19, jjVar8);
                i19++;
            }
            if (!this.f42302jb && jjVar7 != null && jjVar8.X != jjVar7.X) {
                Sa(i19, jjVar7);
                i19++;
            }
            a0.h hVar5 = this.f42401rb;
            int i20 = jjVar8.X;
            ArrayList arrayList6 = (ArrayList) hVar5.f(i20);
            if (arrayList6 == null) {
                arrayList6 = org.telegram.messenger.m5.i(this.f42401rb, i20);
            }
            arrayList6.add(jjVar8);
            if (this.f42302jb && jjVar7 != null && i20 != jjVar7.X) {
                Sa(i19, jjVar8);
                i19++;
            }
            if (!this.f42302jb && i19 >= this.C0.P.size() - 1) {
                Sa(this.C0.P.size(), jjVar8);
                i19++;
            }
            i19++;
            jjVar7 = jjVar8;
        }
        this.C0.O = org.telegram.messenger.ui.b0(this.currentAccount).W1();
        if (z10) {
            this.C0.T();
            this.C0.O(true);
            if (this.C0.N ? getMediaDataController().L0 == 0 || !this.C0.P.isEmpty() : !this.W6 || !arrayList.isEmpty() || this.C0.f37298x >= 0) {
                z11 = false;
            }
            ic(z11);
            if (this.f42492z0 != null) {
                O7(false);
                if (this.C0.N ? !(getMediaDataController().L0 == 0 && this.C0.P.isEmpty()) : !(!this.W6 && arrayList.isEmpty() && this.C0.f37298x < 0)) {
                    this.f42233e1.setVisibility(8);
                    this.f42492z0.setEmptyView(null);
                    return;
                }
                this.f42492z0.setEmptyView(this.f42233e1);
                vj vjVar = this.f42492z0;
                vjVar.K0(vjVar.w1());
            }
        }
    }

    @Override
    public final List F() {
        String L0;
        ArrayList arrayList = new ArrayList();
        if (org.telegram.messenger.w3.T(this.e)) {
            arrayList.add(new fg.a(org.telegram.messenger.cd.L0(2131751613, null)));
            int i10 = this.f42178a;
            if (i10 != 1) {
                if (i10 != 2) {
                    L0 = org.telegram.messenger.cd.L0(2131751610, null);
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131751611, null);
                }
            } else {
                L0 = org.telegram.messenger.cd.L0(2131751612, null);
            }
            arrayList.add(new fg.a(org.telegram.messenger.cd.a0(null, null, 2131751609, L0), new lg(this, 18)));
            arrayList.add(new fg.a(org.telegram.messenger.cd.L0(2131751608, null), new lg(this, 19)));
        }
        if (this.f42243f == null) {
            arrayList.add(new fg.a(org.telegram.messenger.cd.L0(2131751618, null)));
            arrayList.add(new fg.a(org.telegram.messenger.cd.L0(2131751617, null), 0.0f, 255.0f, new s0("", 1)));
            arrayList.add(new fg.a(org.telegram.messenger.cd.L0(2131751616, null), 1.0f, 10.0f, new org.telegram.ui.Cells.f2(this)));
        }
        return arrayList;
    }

    public final void F6() {
        this.f42459w5 = null;
        if (this.f42394r4 == 0 || this.f42445v4) {
            if (this.f42445v4) {
                this.D5 = this.l4;
            } else {
                this.D5 = null;
            }
            this.B5 = null;
            mk mkVar = this.Z;
            if (mkVar != null) {
                mkVar.j1(null, null, null);
            }
        }
        r9(false);
        if (this.f42248f4 == 0) {
            getMediaDataController().D(this.f42297j6, this.f42394r4, true);
        }
    }

    public final void F7(boolean z10) {
        boolean z11;
        this.K6.clear();
        this.H6.clear();
        this.I6.clear();
        this.f42473x6.clear();
        this.N6.b();
        this.f42458w4 = false;
        fm fmVar = this.C0;
        if (fmVar != null) {
            if (fmVar.f37298x < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            ic(z11);
        }
        vj vjVar = this.f42492z0;
        if (vjVar != null) {
            vjVar.setEmptyView(null);
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
        this.f42296j5 = false;
        this.K7 = 0;
        this.J7 = false;
        this.f42185a7 = 0;
        this.Z7 = null;
        this.T7 = 0;
        this.U7 = false;
        this.Q7 = false;
        fm fmVar2 = this.C0;
        if (fmVar2 != null && !fmVar2.N) {
            fmVar2.O(false);
        }
    }

    public final int F8() {
        return this.f42248f4;
    }

    public final void Fa() {
        this.f42238e6 = true;
        this.fragmentBeginToShow = true;
        this.f42364oa = null;
        this.l1.invalidate();
        this.l1.setSkipBackgroundDrawing(false);
        this.f42325la = false;
        this.fragmentView.setAlpha(1.0f);
        this.f42355o1.setTranslationY(0.0f);
        this.f42355o1.getAvatarImageView().setScaleX(1.0f);
        this.f42355o1.getAvatarImageView().setScaleY(1.0f);
        this.f42355o1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Fb(long j10) {
        this.f42394r4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f19814id = (int) j10;
        new org.telegram.messenger.jj(this.currentAccount, tL_message, false, false);
    }

    public final void Fc() {
        int i10;
        ck ckVar = this.f42330m3;
        if (ckVar == null) {
            return;
        }
        ckVar.setTranslationX(e9() / 2.0f);
        this.f42330m3.setTranslationY((((this.f42492z0.getTranslationY() + this.L9) + this.S9) - org.telegram.messenger.i0.L(4.0f)) + org.telegram.messenger.i0.L(28.0f));
        float i11 = Utilities.i(org.telegram.messenger.i0.z1(this.S9, -this.f42330m3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f42330m3.setAlpha(this.f42457w3 * i11);
        ck ckVar2 = this.f42330m3;
        if (this.f42457w3 * i11 > 0.0f) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        ckVar2.setVisibility(i10);
        float T1 = org.telegram.messenger.i0.T1(0.5f, 1.0f, i11);
        this.f42330m3.setScaleX(T1);
        this.f42330m3.setScaleY(T1);
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G6(org.telegram.messenger.jj jjVar) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f42477xa);
        String L0 = org.telegram.messenger.cd.L0(2131689472, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
        if (jjVar.D == 3) {
            x1Var.T = org.telegram.messenger.cd.L0(2131748194, null);
        } else {
            x1Var.T = org.telegram.messenger.cd.a0("NoHandleAppInstalled", null, 2131748222, jjVar.F0().mime_type);
        }
        showDialog(x1Var);
    }

    public final void G7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.P6;
        if (z10) {
            if (org.telegram.messenger.v2.f18448a) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.X6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                i0.a.p(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i10 = dialog.top_message;
            int i11 = iArr[0];
            if (i10 > i11) {
                this.T7 = Math.max(i11 + 1, dialog.read_inbox_max_id);
            }
            this.U6[0] = false;
            this.V6 = false;
            fm fmVar = this.C0;
            if (fmVar != null && fmVar.F < 0) {
                fmVar.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i12 = dialog2.unread_count;
            this.f42498z6 = i12;
            this.B6 = dialog2.unread_mentions_count;
            if (this.A6 != i12) {
                bh.k kVar = this.f42468x1;
                if (kVar != null) {
                    kVar.c(1, i12, this.f42225d6);
                }
                this.A6 = this.f42498z6;
                Pc();
            }
            int i13 = this.B6;
            int i14 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i13 != i14) {
                this.B6 = i14;
                if (i14 <= 0) {
                    this.B6 = 0;
                    this.C6 = true;
                    dc(false);
                } else {
                    bh.k kVar2 = this.f42468x1;
                    if (kVar2 != null) {
                        kVar2.c(2, i14, true);
                    }
                    dc(true);
                }
            }
            i7(false);
            return;
        }
        this.K6.clear();
        this.f42473x6.clear();
        this.H6.clear();
        this.I6.clear();
        this.N6.b();
        this.f42458w4 = false;
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
            this.f42333m6[i15].clear();
            this.f42347n6[i15].clear();
            this.f42360o6[i15].clear();
        }
        p9();
        Sc(0, true);
        if (this.B8 != null) {
            this.B8 = null;
            mk mkVar = this.Z;
            if (mkVar != null) {
                mkVar.X0(null, true, false);
            }
        }
        if (this.Q != null) {
            ic(false);
            O7(false);
            this.f42492z0.setEmptyView(this.f42233e1);
        }
        fm fmVar2 = this.C0;
        if (fmVar2 != null) {
            fmVar2.O(false);
        }
        if (this.h == null && (user = this.f42243f) != null && user.bot && this.f42437u8 == null) {
            this.f42437u8 = "";
            Bc(false);
        }
    }

    public final r0.j1 G8(r0.j1 j1Var) {
        ag.v vVar;
        r0.z0 v0Var;
        if (j1Var != null && (vVar = this.X1) != null) {
            if ((vVar.isShowing() && !this.X1.I) || this.X1.f24705o2) {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 34) {
                    v0Var = new r0.y0(j1Var);
                } else if (i10 >= 30) {
                    v0Var = new r0.x0(j1Var);
                } else if (i10 >= 29) {
                    v0Var = new r0.w0(j1Var);
                } else {
                    v0Var = new r0.v0(j1Var);
                }
                v0Var.c(8, i0.c.e);
                v0Var.i(8, false);
                return v0Var.b();
            }
            return j1Var;
        }
        return j1Var;
    }

    public final boolean G9() {
        if (!org.telegram.messenger.tz.H0 && !this.f42427tb) {
            return false;
        }
        return true;
    }

    public final void Ga(long j10, boolean z10) {
        if (this.f42246f2 != null && org.telegram.messenger.h20.u(this.f42243f)) {
            this.f42246f2.setAllTopicsHidden(true);
        }
        this.f42212c6.put(j10, 1);
        Y7();
        UndoView undoView = this.M3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f42297j6, 0, new ah(this, j10, z10), new mg.t0(this, j10, 3));
        this.C0.O(false);
    }

    public final void Gb(View view) {
        View view2 = this.X8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.s0)) {
                ((org.telegram.ui.Cells.s0) view2).setInvalidateWithParent(null);
            }
            this.X8 = view;
            if (view instanceof org.telegram.ui.Cells.s0) {
                ((org.telegram.ui.Cells.s0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Gc() {
        boolean z10;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.f42385q8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().q()) && this.f42385q8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42245f1 != null) {
            if (z10 && this.f42268h1 == null) {
                wi wiVar = new wi(getParentActivity(), getResourceProvider(), this);
                this.f42268h1 = wiVar;
                w7.e6.b(wiVar, 0.02f, 1.2f);
                this.f42268h1.setOnClickListener(new xe(this, 12));
            }
            wi wiVar2 = this.f42268h1;
            if (wiVar2 != null) {
                if (!z10) {
                    wiVar2.setVisibility(8);
                    return;
                }
                wiVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f42385q8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f42385q8.business_intro.title)) {
                    i10 = 2131749510;
                } else {
                    i10 = 2131749511;
                }
                String a02 = org.telegram.messenger.cd.a0(null, null, i10, org.telegram.messenger.h20.j(this.f42243f, true));
                int indexOf = a02.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                if (indexOf > 0) {
                    a02 = a02.substring(0, indexOf) + a02.substring(indexOf + 2);
                    int indexOf2 = a02.indexOf("**");
                    if (indexOf2 > 0) {
                        a02 = a02.substring(0, indexOf2) + a02.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(a02);
                        iy0 iy0Var = new iy0(a02.substring(indexOf, indexOf2));
                        if (iy0Var.f38376c != -1) {
                            iy0Var.f38376c = -1;
                            iy0Var.invalidateSelf();
                        }
                        iy0Var.a(503316480);
                        iy0Var.setBounds(0, 0, iy0Var.getIntrinsicWidth(), org.telegram.messenger.i0.L(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(iy0Var), indexOf, indexOf2, 33);
                    }
                }
                this.f42268h1.setCustomText(spannableStringBuilder);
                this.f42268h1.setOverrideTextMaxWidth(vh.p2.a(a02, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f42268h1.getParent() != null && (!z10 || this.f42268h1.getParent() != this.f42245f1)) {
                    ((ViewGroup) this.f42268h1.getParent()).removeView(this.f42268h1);
                }
                if (z10) {
                    ViewParent parent = this.f42268h1.getParent();
                    LinearLayout linearLayout = this.f42245f1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f42268h1, w7.b6.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    public final void H6(boolean z10, boolean z11) {
        long j10;
        TLRPC.DraftMessage R;
        Long l4;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        kn knVar;
        org.telegram.messenger.jj jjVar;
        TLRPC.TL_forumTopic f7;
        TLRPC.Message message2;
        org.telegram.messenger.jj jjVar2;
        kn knVar2;
        String str;
        int Y;
        kn knVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        long j12;
        org.telegram.ui.Components.yz0 yz0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.o5 o5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        TLRPC.Message message3;
        Pair pair;
        Long l10;
        TLRPC.DraftMessage draftMessage;
        if (this.Z != null) {
            int i10 = this.f42248f4;
            char c10 = '\b';
            if (i10 == 0 || i10 == 8 || (i10 == 3 && getUserConfig().e() == V8())) {
                long j14 = 0;
                if (this.f42248f4 == 8) {
                    if (org.telegram.messenger.w3.p0(this.e)) {
                        if (this.f42394r4 == 0 && org.telegram.messenger.w3.A(this.currentAccount, this.e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.yz0 yz0Var2 = null;
                ?? r72 = 0;
                if (H9()) {
                    a0.h hVar = (a0.h) getMediaDataController().f18343r1.f(this.f42297j6);
                    if (hVar != null && hVar.m() > 0) {
                        pair = new Pair(Long.valueOf(hVar.j(0)), hVar.n(0));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        l10 = (Long) pair.first;
                        draftMessage = (TLRPC.DraftMessage) pair.second;
                    } else {
                        l10 = null;
                        draftMessage = null;
                    }
                    R = draftMessage;
                    l4 = l10;
                } else {
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    long j15 = this.f42297j6;
                    if (this.f42248f4 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.f42394r4;
                    }
                    R = mediaDataController.R(j15, j10);
                    l4 = null;
                }
                mk mkVar = this.Z;
                if (R != null) {
                    richMessage = R.rich_message;
                } else {
                    richMessage = null;
                }
                mkVar.setRichDraftPreview(richMessage);
                org.telegram.messenger.pi S = org.telegram.messenger.ui.b0(this.currentAccount).S(this.f42297j6, b());
                if (R != null && (inputReplyTo = R.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    org.telegram.messenger.ui mediaDataController2 = getMediaDataController();
                    long j16 = this.f42297j6;
                    if (l4 != null) {
                        j13 = l4.longValue();
                    } else {
                        j13 = this.f42394r4;
                    }
                    a0.h hVar2 = (a0.h) mediaDataController2.f18346s1.f(j16);
                    if (hVar2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) hVar2.f(j13);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z11 || R == null) && this.Z.getFieldText() != null && (this.f42248f4 != 0 || getUserConfig().e() != a() || R == null || this.vc >= R.date)) {
                    if (z10 && R == null) {
                        this.Z.setFieldText("");
                        this.Z.setEffectId(0L);
                        r9(true);
                    }
                } else if (S != null) {
                    this.Z.setVoiceDraft(S);
                } else if (R != null) {
                    this.vc = R.date;
                    mk mkVar2 = this.Z;
                    mkVar2.X2 = null;
                    mkVar2.Y2 = !R.no_webpage;
                    if (!R.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(R.message);
                        Collections.sort(R.entities, org.telegram.messenger.ui.f18302d2);
                        int i11 = 0;
                        while (i11 < R.entities.size()) {
                            TLRPC.MessageEntity messageEntity = R.entities.get(i11);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c11 = c10;
                            long j17 = j14;
                            if (!z12 && !(messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityCode) && !(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj = new Object();
                                        obj.f32850a |= 1;
                                        org.telegram.ui.Components.zz0 zz0Var = new org.telegram.ui.Components.zz0(obj, r72);
                                        int i12 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(zz0Var, i12, messageEntity.length + i12, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj2 = new Object();
                                        obj2.f32850a |= 2;
                                        org.telegram.ui.Components.zz0 zz0Var2 = new org.telegram.ui.Components.zz0(obj2, r72);
                                        int i13 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(zz0Var2, i13, messageEntity.length + i13, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj3 = new Object();
                                        obj3.f32850a |= 8;
                                        org.telegram.ui.Components.zz0 zz0Var3 = new org.telegram.ui.Components.zz0(obj3, r72);
                                        int i14 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(zz0Var3, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj4 = new Object();
                                        obj4.f32850a |= 16;
                                        org.telegram.ui.Components.zz0 zz0Var4 = new org.telegram.ui.Components.zz0(obj4, r72);
                                        int i15 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(zz0Var4, i15, messageEntity.length + i15, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.g51 g51Var = new org.telegram.ui.Components.g51(messageEntity.url, yz0Var2);
                                        int i16 = messageEntity.offset;
                                        valueOf.setSpan(g51Var, i16, messageEntity.length + i16, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj5 = new Object();
                                        obj5.f32850a |= 256;
                                        org.telegram.ui.Components.zz0 zz0Var5 = new org.telegram.ui.Components.zz0(obj5, r72);
                                        int i17 = messageEntity.offset;
                                        org.telegram.messenger.ui.f(zz0Var5, i17, messageEntity.length + i17, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i18 = messageEntity.offset;
                                        org.telegram.ui.Components.wh0.c(valueOf, i18, messageEntity.length + i18, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.Z.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e) {
                                            org.telegram.messenger.f8.g(e, r72);
                                            fontMetricsInt = yz0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            o5Var = new org.telegram.ui.Components.o5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                        } else {
                                            o5Var = new org.telegram.ui.Components.o5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i19 = messageEntity.offset;
                                        valueOf.setSpan(o5Var, i19, messageEntity.length + i19, 33);
                                    }
                                    yz0Var = yz0Var2;
                                } else {
                                    ?? obj6 = new Object();
                                    obj6.f32850a |= 4;
                                    org.telegram.ui.Components.zz0 zz0Var6 = new org.telegram.ui.Components.zz0(obj6, 0);
                                    int i20 = messageEntity.offset;
                                    org.telegram.messenger.ui.f(zz0Var6, i20, messageEntity.length + i20, valueOf, true);
                                }
                                yz0Var = null;
                            } else {
                                if (z12) {
                                    j12 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j12 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                yz0Var = null;
                                org.telegram.ui.Components.h51 h51Var = new org.telegram.ui.Components.h51(a1.g.l(j12, ""), 3, null);
                                int i21 = messageEntity.offset;
                                valueOf.setSpan(h51Var, i21, messageEntity.length + i21, 33);
                            }
                            i11++;
                            yz0Var2 = yz0Var;
                            c10 = c11;
                            j14 = j17;
                            r72 = 0;
                        }
                        j11 = j14;
                        knVar = yz0Var2;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        knVar = null;
                        str2 = R.message;
                    }
                    this.Z.d1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.Z.setSelection(R.message.indexOf(10) + 1);
                        org.telegram.messenger.i0.h3(new me(this, 5), 700L);
                    }
                    this.Z.setEffectId(R.effect);
                    if (R != null && (suggestedPost = R.suggested_post) != null) {
                        org.telegram.messenger.oj b10 = org.telegram.messenger.oj.b(suggestedPost);
                        this.f42459w5 = b10;
                        Wb(b10);
                    }
                    jjVar = this.D5;
                    if (jjVar != null || this.l4 == jjVar) {
                        if (message == null && ((jjVar2 = this.l4) == null || jjVar2.f1() != message.f19814id)) {
                            org.telegram.messenger.jj jjVar3 = new org.telegram.messenger.jj(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.D5 = jjVar3;
                            TLRPC.InputReplyTo inputReplyTo2 = R.reply_to;
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
                                            org.telegram.messenger.jj.B0(jjVar3.f16337k);
                                            ?? obj7 = new Object();
                                            obj7.f38905a = jjVar3;
                                            obj7.f38906b = -1;
                                            obj7.f38907c = -1;
                                            obj7.d = -1;
                                            obj7.f38914m = true;
                                            obj7.e(i24, arrayList);
                                            knVar3 = obj7;
                                        }
                                        this.B5 = knVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i22 & 16) != 0) {
                                            i23 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = jjVar3.f16337k;
                                        if (message4 == null || (str = message4.message) == null || str3 == null || (Y = org.telegram.messenger.jj.Y(i23, str, str3)) < 0) {
                                            knVar2 = knVar;
                                        } else {
                                            org.telegram.messenger.jj.B0(jjVar3.f16337k);
                                            knVar2 = new kn(Y, str3.length() + Y, jjVar3);
                                        }
                                        this.B5 = knVar2;
                                    }
                                }
                            }
                            d7(false);
                            kn knVar4 = this.B5;
                            if (knVar4 != null) {
                                Vb(this.D5, knVar4);
                            } else {
                                Ub(this.D5);
                            }
                            Bc(false);
                            return;
                        } else if (l4 == null && l4.longValue() != j11 && this.e != null && (f7 = getMessagesController().f18891r7.f(this.e.f19793id, l4.longValue())) != null && (message2 = f7.topicStartMessage) != null) {
                            org.telegram.messenger.jj jjVar4 = new org.telegram.messenger.jj(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.D5 = jjVar4;
                            jjVar4.f16327h1 = f7;
                            Ub(jjVar4);
                            Bc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j11 = 0;
                knVar = null;
                if (R != null) {
                    org.telegram.messenger.oj b102 = org.telegram.messenger.oj.b(suggestedPost);
                    this.f42459w5 = b102;
                    Wb(b102);
                }
                jjVar = this.D5;
                if (jjVar != null) {
                }
                if (message == null) {
                }
                if (l4 == null) {
                }
            }
        }
    }

    public final void H7(boolean z10) {
        for (int i10 = 1; i10 >= 0; i10--) {
            this.f42333m6[i10].clear();
            this.f42347n6[i10].clear();
            this.f42360o6[i10].clear();
        }
        p9();
        Sc(0, true);
        sd(z10);
        fd();
    }

    public final TLRPC.ChatFull H8() {
        return this.f42374p8;
    }

    public final boolean H9() {
        if (!org.telegram.messenger.w3.c0(this.e) || this.f42445v4) {
            if (org.telegram.messenger.w3.p0(this.e) && b() == 0 && !this.f42271h4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean Ha() {
        if (this.T4.size() != 1 || this.f42331m4 == null || ((Integer) this.T4.get(0)).intValue() != this.f42331m4.f1()) {
            return false;
        }
        return true;
    }

    public final void Hb(ArrayList arrayList, TLRPC.Chat chat, int i10, int i11, int i12, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f42382q4 = tL_forumTopic;
        this.f42358o4 = arrayList;
        org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
        this.l4 = jjVar;
        this.D5 = jjVar;
        this.f42483y4 = i11;
        this.f42496z4 = i12;
        this.A4 = Math.max(1, i11);
        this.f42394r4 = this.l4.f1();
        this.f42407s4 = i10;
        this.f42420t4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42445v4 = z10;
        org.telegram.messenger.jj jjVar2 = this.D5;
        TLRPC.MessageFwdHeader messageFwdHeader = jjVar2.f16337k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42433u4 = z11;
        if (z10) {
            jjVar2.f16355p = true;
        }
        Tc();
        ld(false);
        Bc(false);
    }

    public final void Hc() {
        final long j10;
        int i10;
        boolean z10;
        int i11;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String a02;
        if (this.f42257g1 == null) {
            return;
        }
        String str = null;
        if (org.telegram.messenger.w3.p0(this.e)) {
            if (this.e != null) {
                chat = getMessagesController().u1(this.e.f19793id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.e) != null && !org.telegram.messenger.w3.A(this.currentAccount, chat2, 24)) {
                final long j11 = this.e.send_paid_messages_stars;
                int i12 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i12 > 0) {
                    a02 = org.telegram.messenger.cd.a0(null, null, 2131744375, org.telegram.messenger.o5.t(-chat.f19793id), org.telegram.messenger.cd.E(j11, ','));
                } else {
                    a02 = org.telegram.messenger.cd.a0(null, null, 2131744358, org.telegram.messenger.o5.t(-chat.f19793id));
                }
                SpannableStringBuilder U2 = org.telegram.messenger.i0.U2(rh.h8.T0(a02, 1.0f, null));
                if (i12 > 0) {
                    str = org.telegram.messenger.cd.L0(2131748487, null);
                }
                this.f42257g1.c(true, true, U2, str, new View.OnClickListener(this) {
                    public final un f35645b;

                    {
                        this.f35645b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                un.j1(j11, this.f35645b);
                                return;
                            default:
                                un.w1(j11, this.f35645b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f42257g1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.f42385q8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.xn xnVar = this.f42257g1;
                boolean z11 = !getUserConfig().q();
                if (getMessagesController().A3()) {
                    i11 = 2131748596;
                } else {
                    i11 = 2131748597;
                }
                xnVar.c(z11, false, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, i11, org.telegram.messenger.o5.t(this.f42297j6))), org.telegram.messenger.cd.L0(2131748553, null), new bh.c(4));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.xn xnVar2 = this.f42257g1;
                if (i10 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                xnVar2.c(z10, false, org.telegram.messenger.i0.U2(rh.h8.T0(org.telegram.messenger.cd.a0(null, null, 2131748595, org.telegram.messenger.o5.t(this.f42297j6), org.telegram.messenger.cd.E(this.f42385q8.send_paid_messages_stars, ',')), 1.0f, null)), org.telegram.messenger.cd.L0(2131748487, null), new View.OnClickListener(this) {
                    public final un f35645b;

                    {
                        this.f35645b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                un.j1(j10, this.f35645b);
                                return;
                            default:
                                un.w1(j10, this.f35645b);
                                return;
                        }
                    }
                });
            } else {
                this.f42257g1.c(false, false, null, null, null);
            }
        } else {
            this.f42257g1.c(false, false, null, null, null);
        }
    }

    public final int I6(int i10) {
        org.telegram.messenger.jj messageObject;
        int additionalPaddingHeight;
        int height = this.f42492z0.getHeight();
        int i11 = 0;
        long j10 = 0;
        while (true) {
            View T0 = this.f42492z0.T0(i10);
            if (T0 == null) {
                break;
            }
            if (T0 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) T0;
                messageObject = q1Var.getMessageObject();
                additionalPaddingHeight = q1Var.getAdditionalPaddingHeight();
            } else if (T0 instanceof org.telegram.ui.Cells.s0) {
                messageObject = ((org.telegram.ui.Cells.s0) T0).getMessageObject();
                additionalPaddingHeight = 0;
            } else {
                continue;
            }
            if (messageObject != null) {
                long d12 = messageObject.d1();
                boolean N3 = messageObject.N3();
                if (j10 != 0 && j10 != d12) {
                    break;
                }
                height = Math.min(height, T0.getTop());
                i11 = Math.max(i11, T0.getBottom() - additionalPaddingHeight);
                if (N3) {
                    if (d12 == 0) {
                        break;
                    }
                    j10 = d12;
                }
                i10++;
            } else {
                continue;
            }
        }
        return Math.max(0, i11 - height);
    }

    public final void I7(boolean z10) {
        this.f42252f9 = z10;
        org.telegram.ui.ActionBar.k1 k1Var = this.f42240e9;
        if (k1Var != null) {
            k1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.f42465wc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.f42465wc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.f42465wc = ofFloat;
            ofFloat.addUpdateListener(new oe(this, 0));
            this.f42465wc.setDuration(150L);
            this.f42465wc.start();
        }
    }

    public final TLRPC.UserFull I8() {
        return this.f42385q8;
    }

    public final boolean I9() {
        return org.telegram.messenger.h20.u(this.f42243f);
    }

    public final void Ia() {
        org.telegram.ui.Cells.q1 q1Var;
        this.Sc.a(false, true);
        ih.d dVar = this.Yc;
        if (dVar != null && (q1Var = dVar.f8527n) != null && q1Var.getDelegate() != null) {
            dVar.f8527n.getDelegate().n1(dVar.f8527n, false);
        }
        mk mkVar = this.Z;
        if (mkVar != null) {
            mkVar.T0(true, true, false);
            this.Z.X4 = null;
        }
    }

    public final void Ib(km kmVar) {
        if (this.f42279i0 != null && !this.inPreviewMode && !this.f42289ib && this.f42463wa == null && (this.fragmentView instanceof FrameLayout)) {
            hi.f fVar = this.J;
            if (fVar != null) {
                hi.f fVar2 = this.I;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                hi.d dVar = new hi.d(fVar2, fVar);
                tg.b bVar = new tg.b(dVar);
                bVar.f48702i = true;
                bVar.h = K8();
                bVar.f48700f = this.f42305k1;
                bVar.f48701g = kmVar;
                bVar.e = this.E;
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                lVar.W0 = bVar;
                lVar.X0 = dVar;
            }
            this.f42279i0.setSubMenuOverlayProvider(new cf(0, this));
        }
    }

    public final void Ic(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Ic(boolean):void");
    }

    @Override
    public final boolean J() {
        return this.f42487y8;
    }

    public final float J6(boolean z10) {
        float f7;
        float f10;
        float f11;
        mk mkVar = this.Z;
        float f12 = 0.0f;
        if (mkVar != null) {
            if (z10) {
                f7 = mkVar.f23763o5;
            } else {
                f7 = mkVar.f23757n5;
            }
        } else {
            f7 = 0.0f;
        }
        float max = Math.max(f7, org.telegram.messenger.i0.L(44.0f));
        float L = org.telegram.messenger.i0.L(44.0f);
        fe.b bVar = this.Sc;
        j6.m mVar = this.Xc;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(mVar.f9698a) == 1) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(mVar.f9698a) == 0) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            if (bVar.f7021f) {
                f12 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) mVar.f9699b;
            float f13 = fArr[1];
            f10 = 1.0f - fArr[0];
            f12 = bVar.e;
            f11 = f13;
        }
        if (!this.f42289ib && !isInPreviewMode()) {
            return org.telegram.messenger.i0.T1(Math.max(org.telegram.messenger.i0.T1(L, max, f11) * f10, org.telegram.messenger.i0.L(44.0f)), -org.telegram.messenger.i0.L(7.0f), f12);
        }
        return org.telegram.messenger.i0.T1(L, max, f11) * f10;
    }

    public final long J7(org.telegram.messenger.jj jjVar) {
        if (this.f42248f4 == 3) {
            return 0L;
        }
        if (org.telegram.messenger.w3.c0(this.e) && !this.f42445v4 && jjVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = jjVar.f16327h1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f19845id;
            }
            return org.telegram.messenger.jj.c2(this.currentAccount, jjVar.f16337k, org.telegram.messenger.w3.c0(this.e), false);
        }
        return this.f42394r4;
    }

    public final ArrayList J8() {
        fm fmVar = this.C0;
        if (fmVar != null) {
            return fmVar.P;
        }
        return null;
    }

    public boolean J9() {
        if (this.l1.getKeyboardHeight() > org.telegram.messenger.i0.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ja(org.telegram.ui.Cells.q1 q1Var) {
        ih.d dVar;
        if (this.Sc.f7021f && (dVar = this.Yc) != null && dVar.f8527n == q1Var) {
            Editable text = dVar.f8523a.getText();
            int length = text.length();
            if (length != 0 && length <= ((org.telegram.messenger.l0) getMessagesController().f18957y7.I.f10700a).f16658c) {
                org.telegram.messenger.qz C = org.telegram.messenger.qz.C(this.currentAccount);
                org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                ih.f attachedMedia = this.Yc.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(messageObject);
                    if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = org.telegram.messenger.jj.B0(messageObject.f16337k);
                        messageObject.f1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) n12).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = C.getMediaDataController().W(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof jh.d) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((jh.d) attachedMedia).f10404c);
                            org.telegram.messenger.qz.X(C.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof jh.j) {
                            jh.j jVar = (jh.j) attachedMedia;
                            C.t(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) jVar.f10419b, null, null, null, false, false, jVar.f10420c);
                        } else if (attachedMedia instanceof jh.h) {
                            tL_inputPollAnswer.input_media = sf.d.h(((jh.h) attachedMedia).f10416b);
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof jh.e) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((jh.e) attachedMedia).f10405b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                Ia();
                return;
            }
            org.telegram.messenger.i0.E3(this.Yc.f8523a);
        }
    }

    public final void Jb() {
        org.telegram.messenger.i0.F3(5.0f, this.f42492z0, null);
        org.telegram.messenger.t2.APP_ERROR.a();
        mk mkVar = this.Z;
        for (int i10 = 0; i10 < mkVar.getChildCount(); i10++) {
            org.telegram.messenger.i0.F3(5.0f, mkVar.getChildAt(i10), null);
        }
        org.telegram.ui.ActionBar.l actionBar = getActionBar();
        for (int i11 = 0; i11 < actionBar.getChildCount(); i11++) {
            org.telegram.messenger.i0.F3(5.0f, actionBar.getChildAt(i11), null);
        }
    }

    public final void Jc() {
        org.telegram.messenger.jj jjVar;
        if (this.f42243f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                vj vjVar = this.f42492z0;
                if (vjVar != null) {
                    int childCount = vjVar.getChildCount();
                    for (int i10 = 0; i10 < childCount; i10++) {
                        View childAt = this.f42492z0.getChildAt(i10);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            jjVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        } else {
                            jjVar = null;
                        }
                        if (jjVar != null && jjVar.f1() < 0) {
                            long j10 = jjVar.f16337k.random_id;
                            if (j10 != 0) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                    }
                }
                MediaController.B();
                return;
            }
            org.telegram.messenger.jj jjVar2 = SecretMediaViewer.f().f33990f0;
            if (jjVar2 != null && !jjVar2.N3()) {
                MediaController.B();
                jjVar2.f1();
            }
        }
    }

    public final boolean K6(org.telegram.messenger.jj jjVar) {
        if (!K9()) {
            TLRPC.Message message = jjVar.f16337k;
            if ((message == null || !message.noforwards) && !jjVar.g4() && !jjVar.S4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ei.r K8() {
        un unVar = this.f42463wa;
        if (unVar != null) {
            return unVar.K8();
        }
        return this.glassEngine;
    }

    public final boolean K9() {
        if (this.e != null) {
            return getMessagesController().n2(this.e);
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f42385q8;
        messagesController.getClass();
        return org.telegram.messenger.vp.I2(userFull);
    }

    public final void Ka(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f7, float f10) {
        org.telegram.messenger.jj messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        sg.o0 d = sg.o0.d(reactionCount.reaction);
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.s0) {
            messageObject = ((org.telegram.ui.Cells.s0) zVar).getMessageObject();
        } else {
            return;
        }
        org.telegram.messenger.jj jjVar = messageObject;
        qb(zVar, jjVar, null, null, f7, f10, d, false, false, false, false);
        if (jjVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (jjVar.f16337k != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            boolean z12 = this.C0.N;
            if (z12) {
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.E6[0].get(jjVar.f1());
                if (jjVar2 != null && (message = jjVar2.f16337k) != null) {
                    message.reactions = jjVar.f16337k.reactions;
                }
            } else if (!z12 && this.E3 != null) {
                Ec(false);
            }
        }
        if (this.C0.N && !jjVar.v2(this.E3)) {
            org.telegram.messenger.ej k92 = k9(jjVar);
            if (k92 != null) {
                ArrayList arrayList = k92.d;
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    getMediaDataController().M1(((org.telegram.messenger.jj) arrayList.get(i10)).f1());
                }
            } else {
                getMediaDataController().M1(jjVar.f1());
            }
            zf.b1 b1Var = this.f42182a4;
            if (b1Var != null) {
                b1Var.f();
            }
            Ec(true);
        }
    }

    public final void Kb(int i10, org.telegram.messenger.jj jjVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f42477xa);
        String L0 = org.telegram.messenger.cd.L0(2131745438, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        TLRPC.User user = this.f42243f;
        if (user != null) {
            if (user.bot) {
                x1Var.T = org.telegram.messenger.cd.L0(2131754069, null);
            } else {
                String h = org.telegram.messenger.m5.h(new StringBuilder("+"), getUserConfig().f().phone, af.b.c());
                TLRPC.User user2 = this.f42243f;
                x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("AreYouSureShareMyContactInfoUser", null, 2131754067, h, org.telegram.messenger.i5.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            x1Var.T = org.telegram.messenger.cd.L0(2131754070, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131745479, null), new ag.b0(this, i10, jjVar, 6));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(x1Var);
    }

    public final void Kc(org.telegram.messenger.jj jjVar, boolean z10) {
        if (this.C0 == null) {
            return;
        }
        getNotificationCenter().d(new ag.j0(this, jjVar, z10, 11));
    }

    @Override
    public final long L() {
        return this.f42199b7;
    }

    public final boolean L6() {
        if (!L9() && !getMessagesController().x2(a())) {
            if ((!getMessagesController().s2(a()) || this.f42445v4) && getMessagesController().M1(a()) <= 0 && this.h == null) {
                qk qkVar = this.f42207c1;
                if (qkVar == null || qkVar.getVisibility() != 0) {
                    if (!T9() || this.f42445v4) {
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

    public final void L7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.L7():void");
    }

    public final org.telegram.messenger.ej L8(long j10) {
        return (org.telegram.messenger.ej) this.N6.f(j10);
    }

    public final boolean L9() {
        int i10 = this.f42248f4;
        if (i10 != 5 && i10 != 9) {
            return false;
        }
        return true;
    }

    public final void La(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.La(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final boolean Lb() {
        if (H9() && this.D5 == null && this.F5 == null) {
            if (this.f42248f4 != 8 && H9() && this.e != null) {
                TLRPC.TL_forumTopic f7 = getMessagesController().f18891r7.f(this.e.f19793id, 1L);
                if (this.f42248f4 != 8) {
                    if (f7 != null) {
                        if (f7.closed && !org.telegram.messenger.w3.i(this.currentAccount, this.e, f7)) {
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

    public final void Lc(org.telegram.messenger.jj jjVar, boolean z10) {
        org.telegram.messenger.jj jjVar2;
        if (this.C0 != null && this.fragmentView != null) {
            org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.N6.f(jjVar.d1());
            if (ejVar != null) {
                ArrayList arrayList = ejVar.d;
                xj xjVar = this.A0;
                if (xjVar != null) {
                    xjVar.V(ejVar);
                }
                for (int i10 = 0; i10 < arrayList.size(); i10++) {
                    ((org.telegram.messenger.jj) arrayList.get(i10)).K1 = true;
                    if (z10) {
                        ((org.telegram.messenger.jj) arrayList.get(i10)).H = true;
                    }
                }
                this.C0.O(true);
                return;
            }
            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) this.E6[0].get(jjVar.f1());
            if (z10) {
                jjVar.K1 = true;
                jjVar.H = true;
            }
            if (this.C0.N) {
                a0.h hVar = this.f42414sb;
                if (hVar != null) {
                    jjVar2 = (org.telegram.messenger.jj) hVar.f(jjVar.f1());
                } else {
                    jjVar2 = null;
                }
                int indexOf = this.C0.P.indexOf(jjVar2);
                if (jjVar2 != null && z10) {
                    jjVar2.K1 = true;
                    jjVar2.H = true;
                }
                if (indexOf >= 0) {
                    fm fmVar = this.C0;
                    fmVar.g(fmVar.J + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.K6.indexOf(jjVar3);
            if (indexOf2 >= 0) {
                fm fmVar2 = this.C0;
                fmVar2.g(fmVar2.J + indexOf2);
            }
        }
    }

    public final boolean M6() {
        if (this.h == null) {
            qk qkVar = this.f42207c1;
            if (qkVar == null || qkVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void M7() {
        if (getParentActivity() != null && getParentActivity() != null && this.X1 == null) {
            ag.v vVar = new ag.v(this, getParentActivity(), this, this.f42477xa, 1);
            this.X1 = vVar;
            vVar.Q1 = a();
            ag.v vVar2 = this.X1;
            vVar2.Z1 = true;
            vVar2.T3 = new pl(this);
        }
    }

    public final float M8() {
        un unVar = this.f42463wa;
        if (unVar == null) {
            unVar = this;
        }
        kk kkVar = unVar.D1;
        if (kkVar == null) {
            return 0.0f;
        }
        return kkVar.f28148b;
    }

    public final boolean M9() {
        return !TextUtils.isEmpty(this.f42283i4);
    }

    public final void Ma(int i10, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.yz0 yz0Var;
        String K0;
        boolean z12;
        boolean z13 = false;
        try {
            K0 = org.telegram.messenger.i0.K0(str, false);
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        if (this.h != null) {
            if (getMessagesController().G2 == 1) {
            }
            if (z10 && !org.telegram.messenger.i0.I3(str)) {
                if (i10 == 0) {
                    gf.f.p(getParentActivity(), Uri.parse(str), true, true, aa(q1Var, characterStyle));
                    return;
                } else if (i10 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f42449v8 == 0) {
                        z13 = true;
                    }
                    gf.f.p(parentActivity, parse, z13, true, aa(q1Var, characterStyle));
                    return;
                } else if (i10 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f42449v8 == 0) {
                        z13 = true;
                    }
                    gf.f.p(parentActivity2, parse2, z13, true, aa(q1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i10 == 0 && i10 != 2) {
                if (i10 == 1) {
                    org.telegram.ui.Components.s4.q0(this, str, true, true, false, false, aa(q1Var, characterStyle), null, this.f42477xa);
                    return;
                }
                return;
            } else {
                if (!(characterStyle instanceof org.telegram.ui.Components.g51) && (yz0Var = ((org.telegram.ui.Components.g51) characterStyle).f26260a) != null && (yz0Var.f32850a & 1024) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.s4.q0(this, str, true, true, true, z11, aa(q1Var, characterStyle), null, this.f42477xa);
            }
        }
        if (getMessagesController().f18792g4.contains(K0)) {
            org.telegram.messenger.qz sendMessagesHelper = getSendMessagesHelper();
            if (i10 != 0 && i10 != 2) {
                z12 = false;
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new org.telegram.messenger.t4(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z12), 2);
                return;
            }
            z12 = true;
            sendMessagesHelper.getClass();
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth2.url = str;
            tL_messages_requestUrlAuth2.flags |= 4;
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth2, new org.telegram.messenger.t4(sendMessagesHelper, tL_messages_requestUrlAuth2, this, str, z12), 2);
            return;
        }
        if (z10) {
        }
        if (i10 == 0) {
        }
        if (!(characterStyle instanceof org.telegram.ui.Components.g51)) {
        }
        z11 = false;
        org.telegram.ui.Components.s4.q0(this, str, true, true, true, z11, aa(q1Var, characterStyle), null, this.f42477xa);
    }

    public final void Mb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.cc.a0(this).t(org.telegram.messenger.cd.L0(2131743858, null), this.f42477xa).j();
    }

    public final void Mc() {
        org.telegram.ui.ActionBar.k1 k1Var;
        int i10;
        if (this.h != null) {
            return;
        }
        vj vjVar = this.f42492z0;
        ek ekVar = this.W1;
        if ((ekVar != null && ekVar.I) || ((k1Var = this.f42240e9) != null && k1Var.isShowing())) {
            i10 = 4;
        } else {
            i10 = 0;
        }
        vjVar.setImportantForAccessibility(i10);
    }

    @Override
    public final boolean N(ay ayVar) {
        return false;
    }

    public final boolean N6(org.telegram.messenger.jj jjVar) {
        if (this.f42248f4 != 8) {
            if (jjVar != null && org.telegram.messenger.w3.c0(this.e)) {
                TLRPC.TL_forumTopic f7 = getMessagesController().f18891r7.f(this.e.f19793id, org.telegram.messenger.jj.c2(this.currentAccount, jjVar.f16337k, true, false));
                if (this.f42248f4 == 8 || (f7 != null && (!f7.closed || org.telegram.messenger.w3.i(this.currentAccount, this.e, f7)))) {
                    return true;
                }
                return false;
            } else if (jjVar == null || !org.telegram.messenger.w3.p0(this.e) || !org.telegram.messenger.w3.A(this.currentAccount, this.e, 24) || org.telegram.messenger.jj.v1(jjVar.f16337k) == 0) {
                return false;
            }
        }
        return true;
    }

    public final void N7(org.telegram.messenger.jj jjVar, org.telegram.messenger.ej ejVar, boolean z10) {
        lg lgVar;
        if (jjVar == null) {
            SparseArray[] sparseArrayArr = this.f42333m6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f42243f;
        TLRPC.Chat chat = this.e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f42374p8;
        long j10 = this.f42199b7;
        int b10 = (int) b();
        int i10 = this.f42248f4;
        lg lgVar2 = new lg(this, 3);
        if (z10) {
            lgVar = new lg(this, 4);
        } else {
            lgVar = null;
        }
        lg lgVar3 = lgVar;
        org.telegram.ui.Components.s4.y(this, user, chat, encryptedChat, chatFull, j10, jjVar, this.f42333m6, ejVar, b10, i10, null, lgVar2, lgVar3, this.f42477xa);
    }

    public final int N8(org.telegram.messenger.jj jjVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.E9 == null) {
            this.E9 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount, true, this.Va, this.f42477xa);
        }
        org.telegram.ui.Cells.q1 q1Var = this.E9;
        if (this.e == null && !org.telegram.messenger.h20.B(this.f42243f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        q1Var.f22532d6 = z11;
        org.telegram.ui.Cells.q1 q1Var2 = this.E9;
        int i10 = this.f42248f4;
        if (i10 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var2.f22558f6 = z12;
        if (i10 == 3 && this.f42289ib) {
            z13 = true;
        } else {
            z13 = false;
        }
        q1Var2.f22570g6 = z13;
        TLRPC.User user = this.f42243f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        q1Var2.f22581h6 = z14;
        if (org.telegram.messenger.w3.T(this.e) && this.e.megagroup) {
            z15 = true;
        }
        q1Var2.f22593i6 = z15;
        this.E9.U6 = E9();
        this.E9.V6 = P9();
        this.E9.W6 = O9();
        return this.E9.p0(jjVar, (org.telegram.messenger.ej) this.N6.f(jjVar.d1()), z10);
    }

    public final boolean N9() {
        int i10 = this.f42248f4;
        if (((i10 == 0 && this.f42394r4 == 0) || i10 == 3) && this.f42297j6 == getUserConfig().e() && !M9()) {
            return true;
        }
        return false;
    }

    public final void Na(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.jj r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.jj r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Na(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.jj, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.jj):void");
    }

    public final void Nb(org.telegram.ui.Cells.q1 q1Var) {
        if (getParentActivity() != null && q1Var != null && q1Var.f22784x9 != null && q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().f16337k != null && q1Var.getPrimaryMessageObject().f16337k.via_business_bot_id != 0 && !getMessagesController().f7.getBoolean("bizbothint", false)) {
            getMessagesController().f7.edit().putBoolean("bizbothint", true).apply();
            if (!this.f42388qb) {
                this.f42388qb = true;
                if (this.N1 != null) {
                    return;
                }
                vh.p2 p2Var = new vh.p2(getParentActivity(), 3);
                p2Var.p(true);
                p2Var.K = Layout.Alignment.ALIGN_NORMAL;
                p2Var.d = -1L;
                p2Var.T = true;
                p2Var.e = true;
                p2Var.i(true);
                p2Var.q(8.0f);
                this.N1 = p2Var;
                p2Var.s(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131748613, null)));
                vh.p2 p2Var2 = this.N1;
                p2Var2.h = vh.p2.a(p2Var2.getText(), this.N1.getTextPaint());
                this.l1.addView(this.N1, w7.b6.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.l1.post(new h0(25, this, q1Var));
            }
        }
    }

    public final void Nc(ArrayList arrayList, boolean z10) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.C0.R((org.telegram.messenger.jj) arrayList.get(i10), false, z10);
        }
    }

    public final void O6(boolean z10) {
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
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.e != null && (this.f42248f4 != 0 || this.f42394r4 != 0 || (chatFull = this.f42374p8) == null || chatFull.ttl_period == 0)) || ((user = this.f42243f) != null && (org.telegram.messenger.h20.x(user) || (this.h == null && ((userFull = this.f42385q8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.r0 r0Var = this.f42219d0;
            if (r0Var != null) {
                r0Var.e(8);
            }
            qj qjVar = this.f42355o1;
            if (qjVar != null) {
                qjVar.f30266a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.r0 r0Var2 = this.f42219d0;
            if (r0Var2 != null) {
                r0Var2.e(0);
            }
            qj qjVar2 = this.f42355o1;
            if (qjVar2 != null) {
                qjVar2.f30266a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.r0 r0Var3 = this.f42429u0;
        if (r0Var3 != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && chat.forum) {
                i11 = 0;
            } else {
                i11 = 8;
            }
            r0Var3.e(i11);
        }
        qj qjVar3 = this.f42355o1;
        if (qjVar3 != null) {
            TLRPC.Chat chat2 = this.e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f42243f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            qjVar3.setCommunityItemVisible(z11);
            final qj qjVar4 = this.f42355o1;
            TLRPC.Chat chat3 = this.e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = qjVar4.E;
            ImageView imageView2 = qjVar4.D;
            if (imageView2 != null && imageView != null) {
                qjVar4.m0 = z12;
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
                                    sn snVar = qjVar4;
                                    if (!z14) {
                                        snVar.D.setVisibility(4);
                                        return;
                                    } else {
                                        snVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    sn snVar2 = qjVar4;
                                    if (!z15) {
                                        snVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        snVar2.getClass();
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
                                    sn snVar = qjVar4;
                                    if (!z14) {
                                        snVar.D.setVisibility(4);
                                        return;
                                    } else {
                                        snVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    sn snVar2 = qjVar4;
                                    if (!z15) {
                                        snVar2.E.setVisibility(4);
                                        return;
                                    } else {
                                        snVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f42355o1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f42385q8;
                if (userFull2 != null) {
                    this.f42355o1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f42374p8;
                    if (chatFull3 != null) {
                        this.f42355o1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f42416t0 != null && (chatFull2 = this.f42374p8) != null) {
            if (!chatFull2.can_delete_channel && org.telegram.messenger.w3.T(this.e)) {
                TLRPC.Chat chat4 = this.e;
                if (!chat4.megagroup || org.telegram.messenger.w3.t0(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.r0 r0Var4 = this.f42416t0;
            if (z13) {
                i12 = 0;
            }
            r0Var4.e(i12);
        }
        r();
    }

    public final void O7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        Paint paint;
        int i10;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f42233e1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f42233e1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f42233e1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.l1.addView(this.f42233e1, 3, w7.b6.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f42233e1.setTranslationX(e9() / 2.0f);
            int i11 = 1;
            String str = null;
            if (this.C0.N) {
                TextView textView = new TextView(getParentActivity());
                this.f42369p2 = textView;
                textView.setText(org.telegram.messenger.cd.L0(2131748227, null));
                this.f42369p2.setTextSize(1, 14.0f);
                this.f42369p2.setGravity(17);
                org.telegram.ui.ActionBar.a7.V(this.f42369p2, org.telegram.ui.ActionBar.t6.Wc, getResourceProvider());
                this.f42369p2.setBackground(new org.telegram.ui.ActionBar.g6(this.f42369p2, this.l1, org.telegram.messenger.i0.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f42369p2.setTypeface(org.telegram.messenger.i0.o());
                this.f42369p2.setPadding(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(3.0f));
                this.f42233e1.addView(this.f42369p2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (L9()) {
                ag.k3 k3Var = new ag.k3(getParentActivity(), this.f42248f4, this.f42394r4, this.f42236e4, getResourceProvider());
                this.f42280i1 = k3Var;
                int L = org.telegram.messenger.i0.L(24.0f);
                ag.k3 k3Var2 = this.f42280i1;
                km kmVar = this.l1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i12 = org.telegram.ui.ActionBar.t6.f20865a;
                k3Var.setBackground(new org.telegram.ui.ActionBar.g6(k3Var2, kmVar, L, themedPaint));
                this.f42233e1.addView(this.f42280i1, w7.b6.e(-2, -2, 17));
                this.f42305k1.d(this.f42280i1, this.l1, new org.telegram.ui.Cells.m5(5), false);
            } else if (this.f42248f4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f42223d4;
                org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i13 = org.telegram.ui.ActionBar.t6.Wc;
                org.telegram.ui.ActionBar.t6.w0(i13, resourceProvider);
                org.telegram.ui.ActionBar.t6.v0(i13);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231096);
                linearLayout.addView(imageView, w7.b6.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.a7.V(textView2, i13, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(org.telegram.messenger.i0.L(208.0f));
                textView2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131752702, null)));
                linearLayout.addView(textView2, w7.b6.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.a7.V(textView3, i13, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(org.telegram.messenger.i0.L(208.0f));
                String str2 = tL_businessChatLink.link;
                ag.s0[] s0VarArr = ag.s0.e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(org.telegram.ui.ActionBar.t6.b0(503316480, 503316480, 5, 5));
                textView3.setPadding(org.telegram.messenger.i0.L(7.0f), 0, org.telegram.messenger.i0.L(7.0f), 0);
                textView3.setOnClickListener(new ag.t0(0, tL_businessChatLink, this));
                linearLayout.addView(textView3, w7.b6.t(-2, -2, 49, 17, 0, 17, 17));
                this.f42292j1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.g6(this.f42292j1, this.l1, org.telegram.messenger.i0.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f42233e1.addView(this.f42292j1, w7.b6.e(-2, -2, 17));
            } else if ((this.U9 != null && this.f42243f != null && !this.f42340n) || (this.f42385q8 != null && a() != getUserConfig().e() && ((this.f42385q8.contact_require_premium && !getUserConfig().q()) || this.f42385q8.send_paid_messages_stars > rh.e6.y(this.currentAccount, false).p().amount))) {
                this.f42257g1 = new ui(this, getParentActivity(), this.currentAccount, this.U9, this.f42477xa);
                Hc();
                this.f42257g1.setListener(new re(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f42245f1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f42245f1.setGravity(17);
                this.f42245f1.addView(this.f42257g1, w7.b6.e(-2, -2, 17));
                this.f42233e1.addView(this.f42245f1, w7.b6.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f42385q8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f42257g1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f42257g1.setSticker(this.f42385q8.business_intro.sticker);
                }
                Gc();
            } else if (this.h == null) {
                if (this.f42445v4 && this.f42248f4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    km kmVar2 = this.l1;
                    sn snVar = this.f42477xa;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = org.telegram.messenger.i0.L(18.0f);
                    if (snVar != null) {
                        paint = snVar.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.t6.V0("paintChatActionBackground");
                    }
                    int i14 = org.telegram.ui.ActionBar.t6.f20865a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.g6(linearLayout3, kmVar2, L2, paint));
                    linearLayout3.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(parentActivity2);
                    if (org.telegram.ui.ActionBar.t6.i1(snVar)) {
                        i10 = org.telegram.ui.ActionBar.t6.Ja;
                    } else {
                        i10 = org.telegram.ui.ActionBar.t6.Wc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.z20.n(textView4, 1, 15.0f);
                    org.telegram.ui.ActionBar.a7.V(textView4, i10, snVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(org.telegram.messenger.i0.L(210.0f));
                    textView4.setText(org.telegram.messenger.cd.L0(2131754272, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.a7.V(textView5, i10, snVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(org.telegram.messenger.i0.L(160.0f));
                    textView5.setText(org.telegram.messenger.cd.L0(2131744044, null));
                    linearLayout3.addView(g9Var, w7.b6.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, w7.b6.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, w7.b6.r(-2, -2, 1));
                    TLRPC.Document T = org.telegram.messenger.ui.b0(org.telegram.messenger.d20.f15147s0).T("🥳");
                    if (T != null) {
                        org.telegram.messenger.c00 d = org.telegram.messenger.v5.d(T.thumbs, org.telegram.ui.ActionBar.t6.f20911c7, 0.2f, false);
                        if (d != null) {
                            d.e = 512;
                            d.f14875f = 512;
                        }
                        g9Var.k(org.telegram.messenger.ic.b(T), null, "tgs", d, null);
                    }
                    this.f42233e1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!T9() && this.f42248f4 == 0 && (((user2 = this.f42243f) != null && user2.self) || ((chat = this.e) != null && chat.creator && !org.telegram.messenger.w3.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    km kmVar3 = this.l1;
                    if (this.e == null) {
                        i11 = 2;
                    }
                    org.telegram.ui.Components.tn tnVar = new org.telegram.ui.Components.tn(parentActivity3, kmVar3, i11, this.f42477xa);
                    this.f42328m1 = tnVar;
                    this.f42233e1.addView(tnVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.e != null) {
                        this.f42328m1.setStatusText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.L0(2131749447, null)));
                    }
                } else {
                    if (T9() && this.f42248f4 == 0) {
                        str = this.f42433u4 ? org.telegram.messenger.cd.L0(2131748243, null) : org.telegram.messenger.cd.L0(2131748184, null);
                    } else if (this.f42248f4 == 1) {
                        str = org.telegram.messenger.cd.L0(2131748177, null);
                    } else {
                        TLRPC.User user3 = this.f42243f;
                        if (user3 != null) {
                            long j10 = user3.f19942id;
                            if (j10 != 777000 && j10 != 429000 && j10 != 4244000 && org.telegram.messenger.vp.E2(user3)) {
                                str = org.telegram.messenger.cd.L0(2131749541, null);
                            }
                        }
                        if (this.f42248f4 != 8 && ((user = this.f42243f) == null || user.self || user.deleted || this.f42340n)) {
                            str = org.telegram.messenger.cd.L0(2131748210, null);
                        }
                    }
                    if (str == null) {
                        this.f42257g1 = new vi(this, getParentActivity(), this.currentAccount, this.U9, this.f42477xa);
                        Hc();
                        this.f42257g1.setListener(new re(this, 5));
                        TLRPC.UserFull userFull2 = this.f42385q8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f42257g1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f42257g1.setSticker(this.f42385q8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f42245f1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f42245f1.setGravity(17);
                        this.f42245f1.addView(this.f42257g1, w7.b6.e(-2, -2, 17));
                        this.f42233e1.addView(this.f42245f1, w7.b6.e(-1, -2, 17));
                        Gc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f42369p2 = textView6;
                    textView6.setText(str);
                    this.f42369p2.setTextSize(1, 14.0f);
                    this.f42369p2.setGravity(17);
                    org.telegram.ui.ActionBar.a7.V(this.f42369p2, org.telegram.ui.ActionBar.t6.Wc, getResourceProvider());
                    this.f42369p2.setBackground(new org.telegram.ui.ActionBar.g6(this.f42369p2, this.l1, org.telegram.messenger.i0.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f42369p2.setTypeface(org.telegram.messenger.i0.o());
                    this.f42369p2.setPadding(org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(9.0f), org.telegram.messenger.i0.L(3.0f));
                    this.f42233e1.addView(this.f42369p2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.f42328m1 = new org.telegram.ui.Components.tn(getParentActivity(), this.l1, 0, this.f42477xa);
                if (this.h.admin_id == getUserConfig().e()) {
                    this.f42328m1.setStatusText(org.telegram.messenger.cd.a0(null, null, 2131751134, org.telegram.messenger.h20.j(this.f42243f, true)));
                } else {
                    this.f42328m1.setStatusText(org.telegram.messenger.cd.a0(null, null, 2131751135, org.telegram.messenger.h20.j(this.f42243f, true)));
                }
                this.f42233e1.addView(this.f42328m1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final boolean O9() {
        org.telegram.ui.Components.o21 o21Var = this.f42246f2;
        if (o21Var != null && o21Var.W && o21Var.f28941a.f7021f) {
            return true;
        }
        return false;
    }

    public final void Oa(java.util.ArrayList r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Oa(java.util.ArrayList, boolean):void");
    }

    public final void Ob(boolean z10, boolean z11) {
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
        if (!z10 || this.I0.getTag() == null) {
            if (!z10 && this.I0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.V0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.V0 = null;
            }
            RadialProgressView radialProgressView = this.I0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f16 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.V0 = animatorSet2;
                if (z10) {
                    this.I0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.V0;
                    rk rkVar = this.D0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rkVar, property, 0.1f);
                    rk rkVar2 = this.D0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rkVar2, property2, 0.1f);
                    rk rkVar3 = this.D0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(rkVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.I0, property, 1.0f), ObjectAnimator.ofFloat(this.I0, property2, 1.0f), ObjectAnimator.ofFloat(this.I0, property3, 1.0f));
                    this.V0.setStartDelay(200L);
                } else {
                    if (this.E0) {
                        obj = this.F0;
                    } else {
                        obj = this.D0;
                    }
                    RadialProgressView radialProgressView2 = this.I0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.I0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.I0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.V0.addListener(new eg.m(14, this, z10));
                this.V0.setDuration(150L);
                this.V0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.I0;
            if (z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            radialProgressView5.setVisibility(i10);
            RadialProgressView radialProgressView6 = this.I0;
            if (z10) {
                f7 = 1.0f;
            } else {
                f7 = 0.1f;
            }
            radialProgressView6.setScaleX(f7);
            RadialProgressView radialProgressView7 = this.I0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView7.setScaleY(f10);
            this.I0.setAlpha(1.0f);
            rk rkVar4 = this.D0;
            if (!z10 && !this.E0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            rkVar4.setVisibility(i11);
            org.telegram.ui.Components.p80 p80Var = this.F0;
            if (!z10 && this.E0) {
                i12 = 0;
            } else {
                i12 = 4;
            }
            p80Var.setVisibility(i12);
            rk rkVar5 = this.D0;
            if (!z10 && !this.E0) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            rkVar5.setScaleX(f11);
            org.telegram.ui.Components.p80 p80Var2 = this.F0;
            if (!z10 && this.E0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            p80Var2.setScaleX(f12);
            rk rkVar6 = this.D0;
            if (!z10 && !this.E0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            rkVar6.setScaleY(f13);
            org.telegram.ui.Components.p80 p80Var3 = this.F0;
            if (!z10 && this.E0) {
                f16 = 1.0f;
            }
            p80Var3.setScaleY(f16);
            rk rkVar7 = this.D0;
            if (!z10 && !this.E0) {
                f14 = 1.0f;
            } else {
                f14 = 0.0f;
            }
            rkVar7.setAlpha(f14);
            org.telegram.ui.Components.p80 p80Var4 = this.F0;
            if (!z10 && this.E0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            p80Var4.setAlpha(f15);
        }
    }

    public final void Oc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Oc():void");
    }

    public final void P6() {
        if (this.f42289ib) {
            return;
        }
        if (M9()) {
            org.telegram.messenger.i0.Y2(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
    }

    public final org.telegram.messenger.sw P8() {
        ?? obj = new Object();
        int i10 = this.f42248f4;
        if (i10 == 9) {
            obj.f2915b = this.Ma;
        }
        if (i10 == 5) {
            String str = this.f42236e4;
            int U8 = U8();
            obj.f2916c = str;
            obj.f2914a = U8;
        }
        return new org.telegram.messenger.sw(obj);
    }

    public final boolean P9() {
        org.telegram.ui.Components.o21 o21Var = this.f42246f2;
        if (o21Var != null) {
            return o21Var.f28945c;
        }
        if (org.telegram.messenger.w3.c0(this.e) && org.telegram.messenger.w3.a(this.e) && !org.telegram.messenger.w3.u0(this.e)) {
            return true;
        }
        return false;
    }

    public final void Pa(int i10) {
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
                File q02 = org.telegram.messenger.i0.q0(null, false);
                if (q02 != null) {
                    if (i12 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.w0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f42323l8 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e) {
                org.telegram.messenger.f8.g(e, true);
                return;
            }
        }
        try {
            if (i10 == 1) {
                Activity parentActivity2 = getParentActivity();
                if (Build.VERSION.SDK_INT >= 33) {
                    if (parentActivity2.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") != 0) {
                        getParentActivity().requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 4);
                        return;
                    }
                } else if (parentActivity2.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 4);
                    return;
                }
                if (org.telegram.messenger.w3.T(this.e) && (tL_chatBannedRights = this.e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                yn0 yn0Var = new yn0(0, z10, true, this);
                if (this.f42248f4 == 9) {
                    yn0Var.G = 1;
                    yn0Var.H = true;
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null && !org.telegram.messenger.w3.N(chat) && this.e.slowmode_enabled) {
                        yn0Var.G = 10;
                        yn0Var.H = true;
                    } else {
                        org.telegram.messenger.jj jjVar = this.F5;
                        if (jjVar != null) {
                            i11 = 1;
                        } else {
                            i11 = 0;
                        }
                        if (jjVar == null) {
                            z11 = true;
                        }
                        yn0Var.G = i11;
                        yn0Var.H = z11;
                    }
                }
                yn0Var.V = new rj(this);
                presentFragment(yn0Var);
            } else if (i10 == 2) {
                int i13 = Build.VERSION.SDK_INT;
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.i0.s0(false);
                    if (s02 != null) {
                        if (i13 >= 24) {
                            Activity parentActivity3 = getParentActivity();
                            org.telegram.messenger.w0.d();
                            intent2.putExtra("output", FileProvider.d(parentActivity3, "org.telegram.messenger.beta.provider", s02));
                            intent2.addFlags(2);
                            intent2.addFlags(1);
                        } else {
                            intent2.putExtra("output", Uri.fromFile(s02));
                        }
                        intent2.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                        this.f42323l8 = s02.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e7) {
                    org.telegram.messenger.f8.g(e7, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Pb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String L0 = org.telegram.messenger.cd.L0(2131752713, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752714, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751407, null), new jf(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(x1Var);
        TextView textView = (TextView) x1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21170q7, getResourceProvider());
        }
    }

    public final void Pc() {
        boolean z10;
        boolean z11;
        if (this.f42468x1 == null) {
            return;
        }
        if (this.f42501z9 && !o9() && !this.Z.t0() && !this.f42289ib && (!this.G3 || getMediaDataController().Y0.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f42250f6 != 0 && SystemClock.elapsedRealtime() >= this.f42250f6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f42481y1 = false;
        } else {
            this.R7 = 0;
            this.f42498z6 = 0;
            z11 = true;
        }
        this.f42468x1.e(1, z10, z11);
    }

    public final void Q6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Q6():void");
    }

    public final boolean Q7(android.view.View r96, boolean r97, boolean r98, float r99, float r100, boolean r101, boolean r102, boolean r103) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Q7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final boolean Q9() {
        if (this.f42317l0 != null && U9()) {
            return true;
        }
        return false;
    }

    public final void Qa(int r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Qa(int):void");
    }

    public final void Qb() {
        TLRPC.Chat chat = this.e;
        if (chat != null) {
            if (org.telegram.messenger.w3.n0(chat)) {
                if (org.telegram.messenger.w3.N(this.e)) {
                    i50 i50Var = new i50(a());
                    i50Var.f44101l0 = this;
                    presentFragment(i50Var);
                    return;
                }
                return;
            } else if (org.telegram.messenger.w3.w(1, this.e)) {
                zc zcVar = new zc(a());
                zcVar.f44101l0 = this;
                presentFragment(zcVar);
                return;
            } else {
                return;
            }
        }
        this.ua = new org.telegram.ui.Components.dp(this, this.f42477xa);
        this.f42492z0.setOnInterceptTouchListener(new org.telegram.ui.Cells.m5(6));
        Bb(this.l1, false);
        showDialog(this.ua, new qe(this, 1));
    }

    public final void Qc() {
        bh.k kVar = this.f42468x1;
        pj pjVar = this.f42453w;
        if (kVar != null) {
            this.f42468x1.setTranslationY((((-pjVar.d()) - this.T.getInputBubbleHeight()) - j9(org.telegram.ui.Components.k21.f27624c)) - org.telegram.messenger.i0.L(13.0f));
        }
        if (this.f42391r1 != null) {
            this.f42391r1.setTranslationY((-pjVar.d()) - org.telegram.messenger.i0.L(16.0f));
        }
    }

    public final void R6(int i10, View view, boolean z10) {
        int i11;
        if (view != null) {
            float f7 = (1.0f - this.Sc.e) * (1.0f - this.Qc.e) * ((float[]) this.Xc.f9699b)[i10];
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

    public final int R8(org.telegram.messenger.jj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.R8(org.telegram.messenger.jj):int");
    }

    public final boolean R9() {
        boolean z10;
        boolean z11;
        float f7;
        FrameLayout frameLayout;
        if (!this.f42205c && !this.d && this.f42243f == null && this.f42492z0 != null && org.telegram.messenger.tz.c()) {
            if (this.Db == null) {
                this.Db = Boolean.valueOf(org.telegram.messenger.sc.e(360928));
            }
            if (this.Db.booleanValue()) {
                int i10 = Integer.MAX_VALUE;
                int i11 = 0;
                for (int i12 = 0; i12 < this.f42492z0.getChildCount(); i12++) {
                    i11 += this.f42492z0.getChildAt(i12).getHeight();
                    int top = this.f42492z0.getChildAt(i12).getTop();
                    if (top < i10) {
                        i10 = top;
                    }
                }
                float f10 = i10;
                if (f10 <= this.L9) {
                    T6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.S6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.K6;
                if ((!z12 || ((this.f42199b7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.W6 && f10 > this.L9 && (!arrayList.isEmpty() ? i11 != 0 : this.Cb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f42233e1) == null || frameLayout.getVisibility() != 0 || this.f42233e1.getChildCount() <= 0) {
                    if (!z10 && this.f42226d7 == 0) {
                        T6(this.fragmentBeginToShow);
                    }
                    if (org.telegram.messenger.tz.o() != 0 && !this.f42314ka && this.fragmentBeginToShow) {
                        if (z10 && this.f42226d7 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable m10 = this.f42477xa.m();
                        km kmVar = this.l1;
                        if (kmVar != null) {
                            m10 = kmVar.getBackgroundImage();
                        }
                        if (m10 instanceof org.telegram.ui.Components.jb0) {
                            org.telegram.ui.Components.jb0 jb0Var = (org.telegram.ui.Components.jb0) m10;
                            if (jb0Var.N != z11) {
                                if (!z11) {
                                    jb0Var.c();
                                }
                                float f11 = 1.0f;
                                if (!z11 && jb0Var.N) {
                                    jb0Var.h = 1.0f - ((jb0Var.h - (((int) (f7 / 0.125f)) * 0.125f)) / 0.125f);
                                    jb0Var.d = true;
                                }
                                jb0Var.N = z11;
                                if (z11) {
                                    f11 = 1.5f;
                                }
                                jb0Var.M = f11;
                                jb0Var.y();
                            } else if (z11) {
                                jb0Var.y();
                            }
                        }
                    }
                    if (z10 || (this.f42226d7 != 0 && System.currentTimeMillis() - this.f42226d7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean Ra(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f42449v8 == 0 || tL_inlineButtonTypeSwitchInline.same_peer || this.parentLayout == null) {
            return false;
        }
        String str = "@" + this.f42243f.username + " " + tL_inlineButtonTypeSwitchInline.query;
        if (this.f42449v8 == this.f42297j6) {
            this.f42449v8 = 0L;
            this.Z.setFieldText(str);
            return true;
        }
        getMediaDataController().Q1(this.f42449v8, 0, str, null, null, null, null, 0L, false, false, null);
        if (this.parentLayout.getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if ((k2Var instanceof un) && ((un) k2Var).f42297j6 == this.f42449v8) {
                finishFragment();
                return true;
            }
            Bundle bundle = new Bundle();
            if (org.telegram.messenger.o5.C(this.f42449v8)) {
                bundle.putInt("enc_id", (int) (this.f42449v8 & 4294967295L));
            } else if (org.telegram.messenger.o5.E(this.f42449v8)) {
                bundle.putLong("user_id", this.f42449v8);
            } else {
                bundle.putLong("chat_id", -this.f42449v8);
            }
            C6();
            presentFragment(new un(bundle), true);
        }
        return true;
    }

    public final void Rb(boolean r32, org.telegram.messenger.jj r33, org.telegram.messenger.jj r34, java.util.ArrayList r35, org.telegram.tgnet.TLRPC.WebPage r36, boolean r37, int r38, org.telegram.ui.kn r39, boolean r40, long r41, org.telegram.messenger.oj r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Rb(boolean, org.telegram.messenger.jj, org.telegram.messenger.jj, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.kn, boolean, long, org.telegram.messenger.oj, boolean):void");
    }

    public final void Rc(boolean z10) {
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
        if ((!T9() || this.f42445v4) && this.Z2 != null) {
            if (!this.f42238e6) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.T4.size() > 1 && !this.W2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.Z2.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.Y2.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.X2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr == null && !this.Wb && !this.W2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.Wb && !this.W2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.Wb && !this.W2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (objArr2 == objArr && z12 == z16 && z13 == z14) {
                z17 = false;
            } else {
                AnimatorSet animatorSet = this.f42181a3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f42181a3 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.Z2.setVisibility(0);
                    } else if (z14) {
                        this.X2.setVisibility(0);
                    }
                    if (z16) {
                        this.Y2.setVisibility(0);
                        this.Y2.setAlpha(0.0f);
                        this.Y2.setScaleX(0.4f);
                        this.Y2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.f42181a3 = animatorSet2;
                    ImageView imageView = this.Z2;
                    Property property = View.ALPHA;
                    if (z15) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f18);
                    ImageView imageView2 = this.Z2;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f19);
                    ImageView imageView3 = this.Z2;
                    Property property3 = View.SCALE_Y;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    z17 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f20);
                    ImageView imageView4 = this.X2;
                    if (z14) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f21);
                    ImageView imageView5 = this.X2;
                    if (z14) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f22);
                    ImageView imageView6 = this.X2;
                    if (z14) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f23);
                    RadialProgressView radialProgressView = this.Y2;
                    if (!z16) {
                        f24 = 0.0f;
                    } else {
                        f24 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f24);
                    RadialProgressView radialProgressView2 = this.Y2;
                    if (!z16) {
                        f25 = 0.4f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f25);
                    RadialProgressView radialProgressView3 = this.Y2;
                    if (!z16) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f26));
                    this.f42181a3.setInterpolator(org.telegram.ui.Components.gr.h);
                    this.f42181a3.setDuration(360L);
                    this.f42181a3.addListener(new di(this, z14, z15, z16));
                    this.f42181a3.start();
                } else {
                    num = 1;
                    z17 = false;
                    ImageView imageView7 = this.X2;
                    if (z14) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    imageView7.setAlpha(f7);
                    ImageView imageView8 = this.X2;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.4f;
                    }
                    imageView8.setScaleX(f10);
                    ImageView imageView9 = this.X2;
                    if (z14) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView9.setScaleY(f11);
                    ImageView imageView10 = this.X2;
                    if (z14) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView10.setVisibility(i10);
                    ImageView imageView11 = this.Z2;
                    if (z15) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.0f;
                    }
                    imageView11.setAlpha(f12);
                    ImageView imageView12 = this.Z2;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.4f;
                    }
                    imageView12.setScaleX(f13);
                    ImageView imageView13 = this.Z2;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView13.setScaleY(f14);
                    ImageView imageView14 = this.Z2;
                    if (z15) {
                        i11 = 0;
                    } else {
                        i11 = 4;
                    }
                    imageView14.setVisibility(i11);
                    RadialProgressView radialProgressView4 = this.Y2;
                    if (z16) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f15);
                    RadialProgressView radialProgressView5 = this.Y2;
                    if (z16) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f16);
                    RadialProgressView radialProgressView6 = this.Y2;
                    if (z16) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f17);
                    RadialProgressView radialProgressView7 = this.Y2;
                    if (z16) {
                        i12 = 0;
                    } else {
                        i12 = 8;
                    }
                    radialProgressView7.setVisibility(i12);
                }
                ImageView imageView15 = this.X2;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.Z2;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.Y2;
                if (z16) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.N2 != null) {
                if (T9() && !this.f42445v4) {
                    boolean z18 = z17;
                    this.N2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.N2.c((this.T4.size() - 1) - Collections.binarySearch(this.T4, Integer.valueOf(this.X4), Comparator$CC.reverseOrder()), this.T4.size(), z11);
            }
        }
    }

    public final boolean S6() {
        boolean z10;
        TLRPC.ChatFull chatFull = this.f42374p8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.i0.v1(getParentActivity().getCurrentFocus());
            kg.q0.w1(this, this.R1, this.S1, this.f42297j6, false);
        }
        return z10;
    }

    public final void S7() {
        if (this.h == null && this.L2 == null && getParentActivity() != null) {
            jl jlVar = new jl(this, getParentActivity());
            this.L2 = jlVar;
            jlVar.setTag(1);
            this.f42180a1.addView(this.L2, w7.b6.o(-1, 48));
            this.f42180a1.h(1, this.L2);
            this.f42180a1.g(this.L2);
            this.L2.setOnClickListener(new xe(this, 17));
            this.L2.setEnabled(!isInPreviewMode());
            this.L2.setBackground(org.telegram.ui.ActionBar.t6.N0(false));
            org.telegram.ui.Components.ye0 ye0Var = new org.telegram.ui.Components.ye0(getParentActivity(), this.f42477xa);
            this.N2 = ye0Var;
            this.L2.addView(ye0Var, w7.b6.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.L2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.T2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.T2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.Te));
            this.T2.setTypeface(org.telegram.messenger.i0.o());
            this.L2.addView(this.T2, w7.b6.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i10 = 0; i10 < 2; i10++) {
                tn tnVar = new tn(this, getParentActivity());
                tn[] tnVarArr = this.Q2;
                tnVarArr[i10] = tnVar;
                tnVar.setTextSize(14);
                org.telegram.ui.ActionBar.a7.Y(tnVarArr[i10], org.telegram.ui.ActionBar.t6.Te, getResourceProvider());
                tnVarArr[i10].setTypeface(org.telegram.messenger.i0.o());
                this.L2.addView(tnVarArr[i10], w7.b6.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                kl klVar = new kl(this, getParentActivity(), 0);
                org.telegram.ui.ActionBar.u5[] u5VarArr = this.R2;
                u5VarArr[i10] = klVar;
                klVar.setTextSize(14);
                org.telegram.ui.ActionBar.a7.Y(u5VarArr[i10], org.telegram.ui.ActionBar.t6.Ue, getResourceProvider());
                this.L2.addView(u5VarArr[i10], w7.b6.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                jn jnVar = new jn(this, getParentActivity());
                jn[] jnVarArr = this.S2;
                jnVarArr[i10] = jnVar;
                this.L2.addView(jnVar, w7.b6.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                ll llVar = new ll(getParentActivity());
                llVar.I = new nh.i();
                llVar.H = new Path();
                llVar.J = new float[8];
                org.telegram.ui.Components.g9[] g9VarArr = this.P2;
                g9VarArr[i10] = llVar;
                llVar.setBlurAllowed(true);
                g9VarArr[i10].setRoundRadius(org.telegram.messenger.i0.L(2.0f));
                this.L2.addView(g9VarArr[i10], w7.b6.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i10 == 1) {
                    tnVarArr[i10].setVisibility(4);
                    jnVarArr[i10].setVisibility(4);
                    u5VarArr[i10].setVisibility(4);
                    g9VarArr[i10].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.Z2 = imageView;
            imageView.setImageResource(2131232296);
            ImageView imageView2 = this.Z2;
            int i11 = org.telegram.ui.ActionBar.t6.Re;
            org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.a7.t(imageView2, i11, resourceProvider, mode);
            ImageView imageView3 = this.Z2;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.Z2.setContentDescription(org.telegram.messenger.cd.L0(2131754723, null));
            this.Z2.setVisibility(4);
            this.Z2.setAlpha(0.0f);
            this.Z2.setScaleX(0.4f);
            this.Z2.setScaleY(0.4f);
            ImageView imageView4 = this.Z2;
            int i12 = org.telegram.ui.ActionBar.t6.f21296x7;
            org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.a7.h(i12, 25), getResourceProvider());
            this.L2.addView(this.Z2, w7.b6.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.Z2.setOnClickListener(new xe(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.X2 = imageView5;
            imageView5.setImageResource(2131231982);
            org.telegram.ui.ActionBar.a7.t(this.X2, i11, getResourceProvider(), mode);
            this.X2.setScaleType(scaleType);
            this.X2.setVisibility(8);
            this.X2.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f42477xa);
            this.Y2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Y2.setSize(org.telegram.messenger.i0.L(16.0f));
            this.Y2.setStrokeWidth(2.0f);
            this.Y2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.t6.Se));
            this.L2.addView(this.Y2, w7.b6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.a7.R(this.X2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i12) & 436207615, 1, org.telegram.messenger.i0.L(14.0f)), null, org.telegram.ui.ActionBar.a7.h(i12, 25), getResourceProvider());
            this.L2.addView(this.X2, w7.b6.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.X2.setOnClickListener(new xe(this, 19));
            Rc(false);
        }
    }

    public final int S8() {
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        int i10 = 0;
        if (z4Var == null || z4Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i10 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(i10);
                if (k2Var != this && (k2Var instanceof un) && ((un) k2Var).f42297j6 == this.f42297j6) {
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

    public final boolean S9() {
        if (getUserConfig().e() == a() && !getMessagesController().F1().f15767b && getUserConfig().q()) {
            return true;
        }
        return false;
    }

    public final void Sa(int i10, org.telegram.messenger.jj jjVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.cd.u(jjVar.f16337k.date, false);
        tL_message.f19814id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jjVar.f16337k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        org.telegram.messenger.jj jjVar2 = new org.telegram.messenger.jj(this.currentAccount, tL_message, false, false);
        jjVar2.D = 10;
        jjVar2.U = 1;
        jjVar2.f16334j0 = true;
        jjVar2.f16339k1 = g9(jjVar.X);
        this.C0.P.add(i10, jjVar2);
    }

    public final void Sb(boolean z10, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        Rb(z10, null, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void Sc(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Sc(int, boolean):void");
    }

    public final void T6(boolean z10) {
        if (this.f42226d7 == 0) {
            if (z10 && !this.e7.isEmpty()) {
                this.f42226d7 = System.currentTimeMillis();
            } else {
                this.f42226d7 = 1L;
            }
            R9();
            vj vjVar = this.f42492z0;
            if (vjVar != null) {
                vjVar.invalidate();
            }
        }
    }

    public final void T7() {
        int i10;
        int i11;
        if (this.f42247f3 == null && getParentActivity() != null) {
            pk pkVar = new pk(this, getParentActivity(), 1);
            this.f42247f3 = pkVar;
            pkVar.setClickable(false);
            this.f42247f3.setWillNotDraw(false);
            this.Xc.h(4, false, false);
            this.f42247f3.setClipToPadding(false);
            org.telegram.ui.Components.f6 f6Var = new org.telegram.ui.Components.f6(getParentActivity(), true, true, true);
            this.f42282i3 = f6Var;
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.h;
            f6Var.b(0.25f, 280L, grVar);
            this.f42282i3.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.f42282i3.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.Z(this.f42282i3, org.telegram.ui.ActionBar.t6.f21124nf, getResourceProvider());
            this.f42282i3.setGravity(3);
            this.f42247f3.addView(this.f42282i3, w7.b6.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.V.addView(this.f42247f3, w7.b6.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.f6 f6Var2 = new org.telegram.ui.Components.f6(getParentActivity(), true, false, true);
            this.f42294j3 = f6Var2;
            f6Var2.b(0.0f, 420L, grVar);
            this.f42294j3.setScaleProperty(0.7f);
            this.f42294j3.setTextSize(org.telegram.messenger.i0.L(15.0f));
            this.f42294j3.setGravity(5);
            this.f42294j3.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.Z(this.f42294j3, org.telegram.ui.ActionBar.t6.f21134o6, getResourceProvider());
            org.telegram.ui.Components.f6 f6Var3 = this.f42294j3;
            if (this.Uc.f7021f) {
                i10 = 2131745835;
            } else {
                i10 = 2131745834;
            }
            f6Var3.setText(org.telegram.messenger.cd.L0(i10, null));
            org.telegram.ui.Components.f6 f6Var4 = this.f42294j3;
            f6Var4.f25986n = false;
            f6Var4.setPadding(org.telegram.messenger.i0.L(15.33f), 0, org.telegram.messenger.i0.L(15.33f), 0);
            this.f42294j3.setOnClickListener(new xe(this, 2));
            this.f42294j3.setAlpha(0.5f);
            this.f42294j3.setClickable(false);
            this.f42247f3.addView(this.f42294j3, w7.b6.e(-2, -1, 117));
            org.telegram.ui.Components.f6 f6Var5 = new org.telegram.ui.Components.f6(getParentActivity(), true, true, true);
            this.f42307k3 = f6Var5;
            f6Var5.setGravity(17);
            this.f42307k3.setTypeface(org.telegram.messenger.i0.o());
            org.telegram.ui.ActionBar.a7.Z(this.f42307k3, org.telegram.ui.ActionBar.t6.f21160pf, getResourceProvider());
            this.f42307k3.setTextSize(org.telegram.messenger.i0.L(15.0f));
            org.telegram.ui.Components.f6 f6Var6 = this.f42307k3;
            int i12 = org.telegram.ui.ActionBar.t6.f20929d6;
            int themedColor = getThemedColor(i12);
            int themedColor2 = getThemedColor(i12);
            int i13 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.ActionBar.a7.R(f6Var6, org.telegram.ui.ActionBar.t6.i0(themedColor, org.telegram.ui.ActionBar.t6.w(themedColor2, getThemedColor(i13))), org.telegram.ui.ActionBar.a7.N(i12), org.telegram.ui.ActionBar.a7.q(i12, i13), getResourceProvider());
            org.telegram.ui.Components.f6 f6Var7 = this.f42307k3;
            if (this.C0.N) {
                i11 = 2131745900;
            } else {
                i11 = 2131745883;
            }
            f6Var7.setText(org.telegram.messenger.cd.L0(i11, null));
            this.f42307k3.setOnClickListener(new xe(this, 3));
            this.f42307k3.setVisibility(8);
            this.f42307k3.setAlpha(0.0f);
            this.f42247f3.addView(this.f42307k3, w7.b6.e(-1, -1, 119));
            TLRPC.Chat chat = this.e;
            if (chat != null && ((!org.telegram.messenger.w3.T(chat) || this.e.megagroup) && this.f42248f4 != 7 && !org.telegram.messenger.w3.p0(this.e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.f42270h3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.f42270h3.setImageResource(2131232416);
                org.telegram.ui.ActionBar.a7.t(this.f42270h3, org.telegram.ui.ActionBar.t6.f21104mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.f42270h3;
                int i14 = org.telegram.ui.ActionBar.t6.f21332z8;
                org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i14), getResourceProvider());
                this.f42247f3.addView(this.f42270h3, w7.b6.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.f42270h3.setOnClickListener(new xe(this, 4));
                this.f42270h3.setContentDescription(org.telegram.messenger.cd.L0(2131754780, null));
            }
            if (this.f42248f4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f42259g3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f42259g3.setImageResource(2131232075);
                org.telegram.ui.ActionBar.a7.t(this.f42259g3, org.telegram.ui.ActionBar.t6.f21104mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f42259g3;
                int i15 = org.telegram.ui.ActionBar.t6.f21332z8;
                org.telegram.ui.ActionBar.a7.R(imageView4, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i15), 1, -1), null, org.telegram.ui.ActionBar.a7.N(i15), getResourceProvider());
                this.f42247f3.addView(this.f42259g3, w7.b6.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f42259g3.setOnClickListener(new xe(this, 5));
                this.f42259g3.setContentDescription(org.telegram.messenger.cd.L0(2131749075, null));
            }
        }
    }

    public final int T8() {
        return Math.max(this.f42197b5, this.f42211c5);
    }

    public final boolean T9() {
        if (this.l4 != null) {
            return true;
        }
        return false;
    }

    public final void Ta() {
        int i10;
        this.T4.clear();
        this.V4.clear();
        this.X4 = 0;
        this.f42197b5 = 0;
        this.f42211c5 = 0;
        Sc(0, true);
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        long a2 = a();
        TLRPC.ChatFull chatFull = this.f42374p8;
        if (chatFull == null) {
            i10 = 0;
        } else {
            i10 = chatFull.pinned_msg_id;
        }
        mediaDataController.Q0(0, i10, a2);
        this.f42224d5 = true;
        Tc();
    }

    public final void Tb(ArrayList arrayList) {
        Rb(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void Tc() {
        org.telegram.messenger.jj jjVar;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f42445v4 && !this.V4.isEmpty() && this.T4.size() == 1 && ((Integer) this.T4.get(0)).intValue() == b() + 1) {
            jjVar = (org.telegram.messenger.jj) this.V4.get(this.T4.get(0));
        } else {
            jjVar = null;
        }
        this.f42331m4 = jjVar;
        if (this.f42445v4 && jjVar != null && (message = jjVar.f16337k) != null && (tL_forumTopic = this.f42382q4) != null && !org.telegram.messenger.jj.v5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.e;
            TLRPC.Peer peer = this.f42331m4.f16337k.from_id;
            if (chat != null || peer != null) {
                if (chat != null && peer != null) {
                    if (org.telegram.messenger.w3.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (chat.f19793id == peer.channel_id) {
                            return;
                        }
                    } else if (!org.telegram.messenger.w3.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f19793id == peer.chat_id) {
                        return;
                    }
                }
                this.f42331m4 = null;
            }
        }
    }

    public final void U6(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        org.telegram.messenger.jj jjVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.jj jjVar2 = this.F5;
        if (jjVar2 != null && (message = jjVar2.f16337k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f42446v5 != null && jjVar2 != null) {
            int i10 = jjVar2.D;
            if ((i10 == 0 || i10 == 19) && (webPage = this.W5) != null) {
                String str = webPage.url;
                if (str != null) {
                    try {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        try {
                            org.telegram.messenger.i0.c(valueOf, 1, false, true);
                        } catch (Exception e) {
                            org.telegram.messenger.f8.g(e, true);
                        }
                        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                            if (org.telegram.messenger.nj.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e7) {
                        org.telegram.messenger.f8.g(e7, true);
                    }
                }
                if (z10) {
                    this.W5 = null;
                    mk mkVar = this.Z;
                    if (mkVar != null) {
                        mkVar.X2 = null;
                        mkVar.Y2 = true;
                    }
                    org.telegram.messenger.nj njVar = this.f42446v5;
                    if (njVar != null) {
                        int i11 = this.currentAccount;
                        CharSequence fieldText = mkVar.getFieldText();
                        org.telegram.messenger.jj jjVar3 = this.D5;
                        if (jjVar3 == this.l4) {
                            jjVar = null;
                        } else {
                            jjVar = jjVar3;
                        }
                        njVar.e(i11, null, fieldText, jjVar, this.B5, this.F5);
                    }
                    q8();
                    s8();
                }
            }
        }
    }

    public final void U7() {
        if (this.f42392r2 == null && this.H1 == null) {
            org.telegram.ui.Components.zz zzVar = new org.telegram.ui.Components.zz(getParentActivity(), this.f42477xa);
            this.f42380q2 = zzVar;
            zzVar.setViewType(7);
            org.telegram.ui.Components.dw0 dw0Var = new org.telegram.ui.Components.dw0(getParentActivity(), this.f42380q2, 1, null);
            this.f42392r2 = dw0Var;
            dw0Var.setClickable(true);
            this.f42392r2.d.setText(org.telegram.messenger.cd.L0(2131748183, null));
            this.f42392r2.setVisibility(8);
            this.f42392r2.addView(this.f42380q2, 0);
            this.f42392r2.e(true, false);
            this.Y3.addView(this.f42392r2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.l30 l30Var = new org.telegram.ui.Components.l30(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.H1 = l30Var;
            l30Var.setOnHashtagClickListener(new ze(this, 3));
            this.H1.setOnScrollListener(new h3(this, 6));
            this.H1.setVisibility(8);
            this.Y3.addView(this.H1, -1, -1);
            z7();
            x7();
        }
    }

    public final int U8() {
        if (this.f42248f4 == 5) {
            return (int) this.f42394r4;
        }
        return 0;
    }

    public final boolean U9() {
        if (N9()) {
            return getMessagesController().F1().e();
        }
        org.telegram.ui.Components.o21 o21Var = this.f42246f2;
        if (o21Var == null || !o21Var.f28941a.f7021f) {
            return false;
        }
        if (o21Var.d) {
            return o21Var.e;
        }
        if (!org.telegram.messenger.w3.u0(this.e)) {
            TLRPC.User user = this.f42243f;
            if (!org.telegram.messenger.h20.u(user) || !user.bot_forum_sidebar) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final void Ua(org.telegram.messenger.jj jjVar) {
        if (jjVar == this.f42278hc) {
            this.f42278hc = null;
            ld(true);
            return;
        }
        org.telegram.messenger.rp N1 = getMessagesController().N1(this.f42297j6);
        if (N1 != null) {
            N1.f17761a.remove(jjVar);
        }
    }

    public final void Ub(org.telegram.messenger.jj jjVar) {
        Rb(true, jjVar, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void Uc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i10 = this.f42248f4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42468x1.e(4, z11, z10);
        this.f42468x1.c(4, this.A1, z10);
    }

    public final void V6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.V6():void");
    }

    public final TextureView V7(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        org.telegram.messenger.i0.r(this.M8);
        if (this.H8 == null) {
            pk pkVar = new pk(this, getParentActivity(), 2);
            this.H8 = pkVar;
            pkVar.setOutlineProvider(new ol(this, 0));
            this.H8.setClipToOutline(true);
            this.H8.setWillNotDraw(false);
            k4 k4Var = new k4(getParentActivity());
            this.J8 = k4Var;
            k4Var.setBackgroundColor(0);
            if (z10) {
                this.H8.addView(this.J8, w7.b6.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.K8 = textureView;
            textureView.setOpaque(false);
            this.J8.addView(this.K8, w7.b6.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.H8.getParent();
        if (viewGroup != null && viewGroup != this.l1) {
            viewGroup.removeView(this.H8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.l1.addView(this.H8, 1, new FrameLayout.LayoutParams(org.telegram.messenger.i0.f3(P9(), G9()), org.telegram.messenger.i0.f3(P9(), G9())));
        }
        this.H8.setTag(null);
        this.J8.setDrawingReady(false);
        return this.K8;
    }

    public final long V8() {
        if (this.f42248f4 == 3) {
            return this.f42394r4;
        }
        return 0L;
    }

    public final void V9(int i10) {
        int i11;
        TLRPC.Message message;
        int i12;
        ArrayList arrayList = this.K6;
        if (!arrayList.isEmpty()) {
            int i13 = 1;
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) i0.a.g(1, arrayList);
            if ((((org.telegram.messenger.jj) arrayList.get(0)).f16337k.date >= i10 && jjVar.f16337k.date <= i10) || (jjVar.f16337k.date >= i10 && this.S6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(size);
                    if (jjVar2.f16337k.date >= i10 && jjVar2.f1() != 0) {
                        int f12 = jjVar2.f1();
                        if (org.telegram.messenger.jj.B0(jjVar2.f16337k) != this.f42199b7) {
                            i13 = 0;
                        }
                        k(f12, 0, false, i13, true, 0);
                        return;
                    }
                }
            } else if (!org.telegram.messenger.o5.C(this.f42297j6)) {
                int N0 = this.B0.N0();
                int L0 = this.B0.L0();
                while (true) {
                    if (L0 <= N0) {
                        fm fmVar = this.C0;
                        int i14 = fmVar.J;
                        if (L0 >= i14 && L0 < fmVar.K && (message = ((org.telegram.messenger.jj) arrayList.get(L0 - i14)).f16337k) != null) {
                            if (message.date < i10) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            if (z()) {
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
                this.f42313k9.f(i11);
                org.telegram.ui.ActionBar.x1 x1Var = this.Kb;
                if (x1Var != null) {
                    x1Var.dismiss();
                }
                Rc(false);
                org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), this.f42477xa);
                this.Kb = x1Var2;
                x1Var2.setOnCancelListener(this.Fa);
                this.Kb.r(1000L);
                int i15 = this.f42321l6;
                this.f42336m9 = i15;
                this.f42363o9 = false;
                this.f42473x6.add(Integer.valueOf(i15));
                this.f42350n9 = 0;
                this.p9 = false;
                org.telegram.messenger.vp messagesController = getMessagesController();
                long j10 = this.f42297j6;
                long j11 = this.f42199b7;
                int i16 = this.classGuid;
                int i17 = this.f42248f4;
                long j12 = this.f42394r4;
                int i18 = this.A4;
                int i19 = this.f42321l6;
                this.f42321l6 = i19 + 1;
                messagesController.W2(j10, j11, false, 30, 0, i10, true, 0, i16, 4, i17, j12, i18, i19, this.f42445v4);
                this.f42319l3.setAlpha(0.0f);
                this.f42319l3.setTag(null);
                this.f42457w3 = 0.0f;
                Fc();
                this.f42330m3.setTag(null);
            }
        }
    }

    public final void Va(org.telegram.messenger.jj jjVar) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(jjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fm fmVar = this.C0;
            if (fmVar != null && !fmVar.N) {
                fmVar.s(fmVar.J + indexOf);
            }
        }
    }

    public final void Vb(org.telegram.messenger.jj jjVar, kn knVar) {
        Rb(true, jjVar, null, null, null, true, 0, knVar, false, 0L, null, true);
    }

    public final void Vc(boolean z10) {
        boolean z11;
        int i10;
        if (getParentActivity() == null) {
            return;
        }
        if (this.f42493z1 > 0 && ((i10 = this.f42248f4) == 0 || i10 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f42468x1.e(3, z11, z10);
        this.f42468x1.c(3, this.f42493z1, z10);
    }

    public final void W6(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        org.telegram.messenger.u3 u3Var = this.f42335m8;
        if (u3Var != null && (((str = this.f42462w8) != null || this.f42475x8) && this.f42225d6)) {
            org.telegram.ui.Components.voip.m1.l(this.e, str, this.f42362o8, Boolean.valueOf(!u3Var.f18228b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f42462w8 = null;
            this.f42475x8 = false;
            return;
        }
        if (this.f42462w8 != null && z10 && (chatFull = this.f42374p8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.m5.n(null, 2131748923, org.telegram.ui.Components.cc.a0(this), 2131624078, 36);
            this.f42462w8 = null;
        }
        this.f42349n8 = !this.f42225d6;
    }

    public final void W7() {
        if (this.l1 != null && this.Y1 == null && getParentActivity() != null) {
            this.Y1 = new org.telegram.ui.ActionBar.m0(this, getParentActivity(), 1);
            A9();
            this.Y1.setClickable(true);
            this.f42180a1.addView(this.Y1, w7.b6.o(-1, 44));
            this.f42180a1.h(2, this.Y1);
            this.f42180a1.g(this.Y1);
            TextView textView = new TextView(getParentActivity());
            this.f42194b2 = textView;
            int i10 = org.telegram.ui.ActionBar.t6.f21170q7;
            org.telegram.ui.ActionBar.a7.V(textView, i10, getResourceProvider());
            TextView textView2 = this.f42194b2;
            float L = org.telegram.messenger.i0.L(18.0f);
            int L2 = org.telegram.messenger.i0.L(4.0f);
            org.telegram.ui.ActionBar.a7.R(textView2, org.telegram.ui.ActionBar.t6.Y(L, getThemedColor(i10) & 436207615, L2, L2, L2, L2), null, org.telegram.ui.ActionBar.a7.h(i10, 25), getResourceProvider());
            this.f42194b2.setTag(Integer.valueOf(i10));
            this.f42194b2.setTextSize(1, 14.0f);
            this.f42194b2.setTypeface(org.telegram.messenger.i0.o());
            this.f42194b2.setSingleLine(true);
            this.f42194b2.setMaxLines(1);
            this.f42194b2.setGravity(17);
            this.Y1.addView(this.f42194b2, w7.b6.e(-1, -1, 51));
            this.f42194b2.setOnClickListener(new xe(this, 13));
            org.telegram.ui.Components.p80 p80Var = new org.telegram.ui.Components.p80(getParentActivity(), this.f42477xa);
            this.f42269h2 = p80Var;
            org.telegram.ui.ActionBar.a7.V(p80Var, org.telegram.ui.ActionBar.t6.Ue, getResourceProvider());
            this.f42269h2.setTextSize(1, 13.3f);
            this.f42269h2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.a7.H(this.f42269h2, org.telegram.ui.ActionBar.t6.Wl, getResourceProvider());
            this.f42269h2.setGravity(17);
            this.f42269h2.setPadding(0, org.telegram.messenger.i0.L(9.0f), 0, org.telegram.messenger.i0.L(9.0f));
            this.f42180a1.addView(this.f42269h2, w7.b6.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.f42180a1.h(8, this.f42269h2);
            this.f42180a1.g(this.f42269h2);
            TextView textView3 = new TextView(getParentActivity());
            this.Z1 = textView3;
            int i11 = org.telegram.ui.ActionBar.t6.Ve;
            org.telegram.ui.ActionBar.a7.V(textView3, i11, getResourceProvider());
            this.Z1.setVisibility(8);
            this.Z1.setTextSize(1, 14.0f);
            this.Z1.setTypeface(org.telegram.messenger.i0.o());
            this.Z1.setSingleLine(true);
            this.Z1.setMaxLines(1);
            this.Z1.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            this.Z1.setGravity(17);
            TextView textView4 = this.Z1;
            int themedColor = getThemedColor(i11) & 436207615;
            int L3 = org.telegram.messenger.i0.L(4.0f);
            org.telegram.ui.ActionBar.a7.R(textView4, org.telegram.ui.ActionBar.t6.Y(org.telegram.messenger.i0.L(18.0f), themedColor, L3, L3, L3, L3), null, org.telegram.ui.ActionBar.a7.h(i11, 25), getResourceProvider());
            this.Y1.addView(this.Z1, w7.b6.e(-1, -1, 51));
            this.Z1.setOnClickListener(new xe(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.f42208c2 = textView5;
            org.telegram.ui.ActionBar.a7.V(textView5, i11, getResourceProvider());
            this.f42208c2.setVisibility(8);
            this.f42208c2.setTextSize(1, 14.0f);
            this.f42208c2.setTypeface(org.telegram.messenger.i0.o());
            this.f42208c2.setSingleLine(true);
            this.f42208c2.setMaxLines(1);
            this.f42208c2.setPadding(org.telegram.messenger.i0.L(4.0f), 0, org.telegram.messenger.i0.L(4.0f), 0);
            this.f42208c2.setGravity(17);
            this.f42208c2.setText(org.telegram.messenger.cd.L0(2131746101, null));
            org.telegram.ui.ActionBar.a7.R(this.f42208c2, org.telegram.ui.ActionBar.t6.h0(getThemedColor(i11) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.a7.h(i11, 25), getResourceProvider());
            this.f42180a1.addView(this.f42208c2, w7.b6.o(-1, 48));
            this.f42180a1.h(4, this.f42208c2);
            this.f42180a1.g(this.f42208c2);
            this.f42208c2.setOnClickListener(new xe(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f42281i2 = imageView;
            imageView.setImageResource(2131231982);
            this.f42281i2.setContentDescription(org.telegram.messenger.cd.L0(2131752041, null));
            ImageView imageView2 = this.f42281i2;
            int i12 = org.telegram.ui.ActionBar.t6.f21020i6;
            org.telegram.ui.ActionBar.a7.R(imageView2, org.telegram.ui.ActionBar.t6.O(getThemedColor(i12), 0, 0), null, org.telegram.ui.ActionBar.a7.N(i12), getResourceProvider());
            org.telegram.ui.ActionBar.a7.t(this.f42281i2, org.telegram.ui.ActionBar.t6.Re, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f42281i2.setScaleType(ImageView.ScaleType.CENTER);
            this.Y1.addView(this.f42281i2, w7.b6.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f42281i2.setOnClickListener(new xe(this, 16));
        }
    }

    public final int W8(int i10) {
        return (int) Math.max(-org.telegram.messenger.i0.L(2.0f), (((((this.f42492z0.getMeasuredHeight() - this.Ua) - this.L9) - this.f42453w.e()) - org.telegram.messenger.i0.L(53.0f)) - i10) / 2.0f);
    }

    public final void W9(ArrayList arrayList) {
        org.telegram.ui.Components.o21 o21Var;
        if (arrayList != null && (o21Var = this.f42246f2) != null && o21Var.W) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
                if (jjVar != null && jjVar.D == 36) {
                    TLRPC.MessageMedia o12 = org.telegram.messenger.jj.o1(jjVar.f16337k);
                    ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f44430a;
                    if (o12 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!jjVar.P2) {
                            jjVar.P2 = true;
                            jjVar.n0(null);
                        }
                    }
                }
                if (jjVar != null && jjVar.P2() && !jjVar.P3() && jjVar.d1() != 0 && !jjVar.P2) {
                    jjVar.P2 = true;
                    jjVar.n0(null);
                }
            }
        }
    }

    public final void Wa(org.telegram.messenger.jj jjVar) {
        ArrayList arrayList = this.K6;
        int indexOf = arrayList.indexOf(jjVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fm fmVar = this.C0;
            if (fmVar != null && !fmVar.N) {
                fmVar.P(fmVar.J + indexOf, true);
            }
        }
    }

    public final void Wb(org.telegram.messenger.oj ojVar) {
        Rb(true, null, null, null, null, true, 0, null, false, 0L, ojVar, true);
    }

    public final void Wc(boolean z10) {
        String L0;
        if (this.f42248f4 != 3 && !org.telegram.messenger.h20.u(this.f42243f)) {
            qj qjVar = this.f42355o1;
            if (qjVar != null && this.f42394r4 != 0) {
                if (this.f42445v4) {
                    nd();
                } else if (this.f42433u4) {
                    org.telegram.messenger.jj jjVar = this.l4;
                    if (jjVar != null && jjVar.x2()) {
                        this.f42355o1.setTitle(org.telegram.messenger.cd.G(this.l4.N1(), "Comments", new Object[0]));
                    } else {
                        this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131751996, null));
                    }
                } else {
                    org.telegram.messenger.jj jjVar2 = this.l4;
                    if (jjVar2 != null) {
                        qjVar.setTitle(org.telegram.messenger.cd.G(jjVar2.N1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.f42371p4 != null) {
                if (this.l4.N1() == 0) {
                    if (this.f42433u4) {
                        L0 = org.telegram.messenger.cd.L0(2131748243, null);
                    } else {
                        L0 = org.telegram.messenger.cd.L0(2131748184, null);
                    }
                } else {
                    L0 = org.telegram.messenger.cd.L0(2131751376, null);
                }
                org.telegram.messenger.jj jjVar3 = this.f42371p4;
                jjVar3.f16337k.message = L0;
                jjVar3.v = L0;
                if (z10) {
                    this.C0.R(jjVar3, true, false);
                }
            }
        }
    }

    public final void X6() {
        TLRPC.ChatFull M0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        if (this.M1 == null && org.telegram.messenger.w3.n0(this.e) && (M0 = getMessagesController().M0(this.e.f19793id)) != null && this.Z != null && getParentActivity() != null && (stickerSet = M0.emojiset) != null) {
            qk qkVar = this.f42207c1;
            if (qkVar == null || qkVar.getVisibility() != 0) {
                org.telegram.ui.Components.r30 r30Var = org.telegram.ui.Components.r30.f29811n;
                if (r30Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (Y = getMediaDataController().Y(stickerSet)) != null && !Y.documents.isEmpty()) {
                        j10 = Y.documents.get(0).f19799id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        r30Var.b();
                        vh.p2 p2Var = new vh.p2(getParentActivity(), 3);
                        this.M1 = p2Var;
                        p2Var.i(true);
                        this.M1.p(true);
                        vh.p2 p2Var2 = this.M1;
                        p2Var2.K = Layout.Alignment.ALIGN_CENTER;
                        p2Var2.q(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o5(j10, this.M1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.M1.s(org.telegram.messenger.i0.J2(org.telegram.messenger.cd.L0(2131749451, null), spannableStringBuilder, "%s"));
                        vh.p2 p2Var3 = this.M1;
                        p2Var3.h = vh.p2.a(p2Var3.getText(), this.M1.getTextPaint());
                        vh.p2 p2Var4 = this.M1;
                        p2Var4.d = -1L;
                        p2Var4.setPadding(org.telegram.messenger.i0.L(6.0f), 0, org.telegram.messenger.i0.L(6.0f), 0);
                        org.telegram.messenger.i0.h3(new lg(this, 28), 300L);
                    }
                }
            }
        }
    }

    public final void X7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.X7():void");
    }

    public final int X8(org.telegram.messenger.jj jjVar) {
        return W8(N8(jjVar, !TextUtils.isEmpty(this.f42251f8))) - kb(jjVar);
    }

    public final void X9() {
        this.P4 = true;
        if (this.C6) {
            org.telegram.messenger.hs messagesStorage = getMessagesStorage();
            messagesStorage.f15938a.c(new org.telegram.messenger.y8(messagesStorage, b(), this.f42297j6, new sg(this, 1), 5));
            return;
        }
        org.telegram.messenger.hs messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().i1(this.f42297j6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f42445v4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f42394r4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.B6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new ag.k0(17, this, messagesStorage2));
    }

    public final void Xa() {
        if (this.f42251f8 == null && this.f42264g8 == null && this.f42275h8 == null) {
            me meVar = this.f42312k8;
            if (meVar != null) {
                org.telegram.messenger.i0.r(meVar);
                this.f42312k8 = null;
            }
            this.f42200b8 = Integer.MAX_VALUE;
            this.f42227d8 = false;
            this.f42239e8 = 0L;
            this.f42251f8 = null;
            this.f42264g8 = null;
            this.f42275h8 = null;
        }
    }

    public final void Xb(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        Sb(z10, webPage, z11, true);
    }

    public final void Xc(int i10, org.telegram.messenger.jj jjVar) {
        org.telegram.messenger.jj jjVar2;
        SparseArray sparseArray = this.G6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i10);
        if (arrayList == null) {
            return;
        }
        if (jjVar == null) {
            jjVar2 = new org.telegram.messenger.jj(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            jjVar2 = null;
        }
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) this.E6[0].get(((Integer) arrayList.get(i11)).intValue());
            if (jjVar3 != null) {
                if (jjVar == null) {
                    jjVar3.C = jjVar2;
                } else {
                    jjVar3.C = jjVar;
                }
                fm fmVar = this.C0;
                if (fmVar != null) {
                    fmVar.R(jjVar3, true, false);
                }
            }
        }
        if (jjVar == null) {
            sparseArray.remove(i10);
        }
    }

    public final void Y6() {
        ArrayList arrayList;
        int i10;
        if (this.f42302jb) {
            int i11 = -1;
            int i12 = 0;
            long j10 = 0;
            while (true) {
                arrayList = this.K6;
                if (i12 >= arrayList.size()) {
                    break;
                }
                long e12 = ((org.telegram.messenger.jj) arrayList.get(i12)).e1();
                if (j10 != e12) {
                    if (i11 >= 0 && j10 != 0 && (i10 = i12 - i11) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i13 = 0; i13 < i10; i13++) {
                            arrayList2.add((org.telegram.messenger.jj) arrayList.remove(i11));
                        }
                        Collections.sort(arrayList2, new f6(5));
                        arrayList.addAll(i11, arrayList2);
                    }
                    i11 = i12;
                    j10 = e12;
                }
                i12++;
            }
            if (i11 >= 0 && j10 != 0 && arrayList.size() - i11 > 1) {
                int size = arrayList.size() - i11;
                ArrayList arrayList3 = new ArrayList();
                for (int i14 = 0; i14 < size; i14++) {
                    arrayList3.add((org.telegram.messenger.jj) arrayList.remove(i11));
                }
                arrayList.addAll(i11, arrayList3);
            }
        }
    }

    public final void Y7() {
        if (this.M3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f42477xa);
            this.M3 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.i0.L(51.0f));
            this.l1.addView(this.M3, w7.b6.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int Y8(View view) {
        org.telegram.messenger.f8.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.f42492z0.getMeasuredHeight() - view.getBottom()) - this.f42492z0.getPaddingBottom()) + "} chatHeight=" + this.f42492z0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.f42492z0.getPaddingBottom());
        return (this.f42492z0.getMeasuredHeight() - view.getBottom()) - this.f42492z0.getPaddingBottom();
    }

    public final void Y9(boolean z10) {
        TLRPC.Chat chat;
        if (this.Aa == null && (chat = this.e) != null && org.telegram.messenger.w3.k(chat) && this.Z != null && !org.telegram.messenger.w3.p0(this.e)) {
            TLRPC.TL_channels_sendAsPeers L1 = getMessagesController().L1(this.f42297j6, false);
            this.Aa = L1;
            if (L1 != null) {
                this.Z.P1(false, z10);
            }
        }
    }

    public final void Ya(boolean z10) {
        org.telegram.messenger.jj jjVar = this.Z7;
        if (jjVar != null) {
            if (z10) {
                boolean[] zArr = this.U6;
                zArr[1] = true;
                zArr[0] = true;
                this.X7 = 0;
                this.f42185a7 = 0;
            }
            this.T7 = 0;
            this.U7 = false;
            Va(jjVar);
            this.Z7 = null;
        }
    }

    public final void Yb(boolean z10) {
        if (this.f42319l3 != null && !L9()) {
            if (this.f42319l3.getTag() == null) {
                AnimatorSet animatorSet = this.f42432u3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f42319l3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f42432u3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f42432u3.playTogether(ObjectAnimator.ofFloat(this.f42319l3, View.ALPHA, 1.0f));
                this.f42432u3.addListener(new bi(this, 6));
                this.f42432u3.start();
            }
            if (!z10) {
                C9();
                this.f42357o3 = 1000;
            }
        }
    }

    public final void Yc(boolean z10) {
        mk mkVar = this.Z;
        if (mkVar != null) {
            mkVar.N1(z10);
        }
    }

    public final void Z6(boolean z10) {
        zf.b1 b1Var;
        if (this.f42210c4 == 2 && (b1Var = this.f42182a4) != null) {
            String str = this.I3;
            xh.d0 d0Var = b1Var.E;
            if (!TextUtils.equals(b1Var.f55451y, str)) {
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
                org.telegram.messenger.i0.r(d0Var);
                th.r4 r4Var = b1Var.D;
                if (r4Var != null && r4Var.I != 0) {
                    ConnectionsManager.getInstance(r4Var.f49633c).cancelRequest(r4Var.I, true);
                    r4Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    b1Var.f55451y = str;
                    b1Var.D = new th.r4(b1Var.f55447r, str2, trim);
                    if (z10) {
                        d0Var.run();
                    } else {
                        org.telegram.messenger.i0.h3(d0Var, 1000L);
                    }
                }
                th.r4 r4Var2 = b1Var.D;
                if (r4Var2 != null && r4Var2.J > 0) {
                    b1Var.f();
                }
            }
        }
    }

    public final ArrayList Z7(org.telegram.messenger.jj jjVar, boolean z10) {
        ArrayList j10 = org.telegram.messenger.m5.j(jjVar);
        int f12 = jjVar.f1();
        jjVar.A0();
        if (f12 != 0) {
            ArrayList arrayList = this.K6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) arrayList.get(size);
                if ((org.telegram.messenger.jj.B0(jjVar2.f16337k) != this.f42199b7 || org.telegram.messenger.jj.B0(jjVar.f16337k) == this.f42199b7) && (((this.h == null && jjVar2.f1() > f12) || (this.h != null && jjVar2.f1() < f12)) && ((org.telegram.messenger.jj.R4(jjVar2.f16337k) || jjVar2.h4()) && !jjVar2.S4() && !jjVar2.g4() && (!z10 || (jjVar2.f16337k.media_unread && !jjVar2.N3()))))) {
                    j10.add(jjVar2);
                }
            }
        }
        return j10;
    }

    public final mn Z8() {
        if (this.Jc == null) {
            this.Jc = new mn(this);
        }
        return this.Jc;
    }

    public final void Z9(org.telegram.messenger.jj jjVar, boolean z10, boolean z11) {
        if (jjVar != null && jjVar.r4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = jjVar.P0;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void Za(int r25, java.util.ArrayList r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.Za(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void Zb(boolean z10) {
        if (this.f42330m3 != null && !L9()) {
            if (this.f42330m3.getTag() == null) {
                ValueAnimator valueAnimator = this.f42444v3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f42330m3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42457w3, 1.0f);
                this.f42444v3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f42444v3.addUpdateListener(new oe(this, 2));
                this.f42444v3.addListener(new bi(this, 8));
                this.f42444v3.start();
            }
            if (!z10) {
                C9();
                this.f42357o3 = 1000;
            }
        }
    }

    public final void Zc(int i10, int i11, int i12) {
        float f7;
        int i13;
        boolean z10;
        boolean z11;
        bh.k kVar = this.f42468x1;
        boolean z12 = false;
        if (kVar != null) {
            int i14 = 2;
            if (this.f42302jb) {
                i13 = 2;
            } else {
                i13 = 1;
            }
            if ((i13 & i10) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            kVar.b(6).f2223c = z10;
            android.support.v4.media.session.a0 a0Var = kVar.e[6];
            if (a0Var != null) {
                ((ah.b) a0Var.f875b).b(z10, true);
            }
            bh.k kVar2 = this.f42468x1;
            if (this.f42302jb) {
                i14 = 1;
            }
            if ((i10 & i14) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            kVar2.b(5).f2223c = z11;
            android.support.v4.media.session.a0 a0Var2 = kVar2.e[5];
            if (a0Var2 != null) {
                ((ah.b) a0Var2.f875b).b(z11, true);
            }
        }
        this.K3 = i12;
        this.L3 = i11;
        ad();
        org.telegram.ui.Components.f6 f6Var = this.f42294j3;
        if (f6Var != null) {
            if (i12 > 0) {
                z12 = true;
            }
            f6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f42294j3.animate();
            if (i12 > 0) {
                f7 = 1.0f;
            } else {
                f7 = 0.5f;
            }
            animate.alpha(f7).start();
        }
    }

    public long a() {
        return this.f42297j6;
    }

    public final void a7() {
        this.T.d();
        Qc();
        Ac();
        u7();
        r7();
        w7();
        v7();
        z7();
        B9();
        boolean z10 = true;
        if (this.f42453w.f7701s == 1) {
            z10 = false;
        }
        if (this.f42376pb != z10) {
            this.f42376pb = z10;
            checkSystemBarColors();
        }
    }

    public final void a8(final int i10, final int i11, final boolean z10) {
        this.C0.M.clear();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.K6;
            if (i12 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i12);
            int i13 = jjVar.f16337k.date;
            if (i13 <= i10 || i13 >= i11) {
                this.C0.M.add(jjVar);
            }
            i12++;
        }
        vj vjVar = this.f42492z0;
        if (vjVar != null) {
            vjVar.setEmptyView(null);
        }
        if (this.C0.M.isEmpty()) {
            ic(true);
        }
        fm fmVar = this.C0;
        fmVar.L = true;
        fmVar.O(true);
        Y7();
        UndoView undoView = this.M3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f42297j6, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                un unVar = un.this;
                org.telegram.messenger.vp messagesController = unVar.getMessagesController();
                long j11 = unVar.f42297j6;
                if (org.telegram.messenger.w3.T(unVar.e)) {
                    j10 = unVar.f42297j6;
                } else {
                    j10 = 0;
                }
                messagesController.d0(j11, j10, i10, i11, z10, new lg(unVar, 20));
            }
        }, new lg(this, 17));
    }

    public final long a9() {
        org.telegram.messenger.jj jjVar;
        TLRPC.Message message;
        org.telegram.messenger.jj jjVar2;
        TLRPC.Message message2;
        if (!org.telegram.messenger.w3.p0(this.e) || !org.telegram.messenger.w3.A(this.currentAccount, this.e, 24)) {
            return 0L;
        }
        long j10 = this.f42394r4;
        int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i10 == 0 && (jjVar2 = this.F5) != null && (message2 = jjVar2.f16337k) != null) {
            return org.telegram.messenger.o5.o(message2.saved_peer_id);
        }
        if (i10 == 0 && (jjVar = this.D5) != null && (message = jjVar.f16337k) != null) {
            return org.telegram.messenger.o5.o(message.saved_peer_id);
        }
        return j10;
    }

    public final aj aa(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle) {
        gf.e eVar = this.Vb;
        if (eVar != null) {
            eVar.a(true);
            this.Vb = null;
        }
        if (characterStyle != null && q1Var != null && q1Var.getMessageObject() != null) {
            aj ajVar = new aj(this, q1Var.getMessageObject().f1(), characterStyle, q1Var, 0);
            this.Vb = ajVar;
            return ajVar;
        }
        this.Vb = null;
        return null;
    }

    public final void ab() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.K7 = 0;
        this.A7 = false;
        this.B7 = true;
        this.f42473x6.clear();
    }

    public final boolean ac() {
        mk mkVar = this.Z;
        if (mkVar != null && mkVar.getVisibility() == 0) {
            SharedPreferences d12 = org.telegram.messenger.vp.d1();
            if (!d12.getBoolean("gifhint", false)) {
                d12.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f42405s2 == null) {
                    if (!this.f42395r5) {
                        mk mkVar2 = this.Z;
                        if (mkVar2 != null) {
                            mkVar2.Q();
                            org.telegram.messenger.ui.b0(mkVar2.Q).V0(0, true, true, false);
                            org.telegram.ui.Components.gf gfVar = mkVar2.U0;
                            gfVar.M(false, false);
                            gfVar.R(false, false);
                            gfVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        km kmVar = this.l1;
                        int indexOfChild = kmVar.indexOfChild(this.T);
                        if (indexOfChild != -1) {
                            mk mkVar3 = this.Z;
                            mkVar3.Q();
                            org.telegram.messenger.ui.b0(mkVar3.Q).V0(0, true, true, false);
                            org.telegram.ui.Components.gf gfVar2 = mkVar3.U0;
                            gfVar2.M(false, false);
                            gfVar2.R(false, false);
                            gfVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.K2 = view;
                            view.setBackgroundResource(2131232671);
                            int i10 = indexOfChild + 1;
                            kmVar.addView(this.K2, i10, w7.b6.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(9, getParentActivity(), this.f42477xa, false);
                            this.f42405s2 = q30Var;
                            q30Var.setText(org.telegram.messenger.cd.L0(2131744294, null));
                            kmVar.addView(this.f42405s2, i10, w7.b6.d(-2, -2.0f, 83, 5.0f, 0.0f, 5.0f, 3.0f));
                            AnimatorSet animatorSet = new AnimatorSet();
                            org.telegram.ui.Components.q30 q30Var2 = this.f42405s2;
                            Property property = View.ALPHA;
                            animatorSet.playTogether(ObjectAnimator.ofFloat(q30Var2, property, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.K2, property, 0.0f, 1.0f));
                            animatorSet.addListener(new bi(this, 5));
                            animatorSet.setDuration(300L);
                            animatorSet.start();
                            View emojiButton = this.Z.getEmojiButton();
                            if (emojiButton != null) {
                                this.f42405s2.f(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void ad() {
        org.telegram.ui.Components.f6 f6Var = this.f42282i3;
        if (f6Var != null) {
            boolean z10 = !org.telegram.messenger.cd.X;
            int i10 = this.K3;
            if (i10 < 0) {
                f6Var.c("", z10, true);
            } else if (i10 == 0) {
                f6Var.c(org.telegram.messenger.cd.L0(2131748183, null), z10, true);
            } else if (this.F3) {
                f6Var.c(org.telegram.messenger.cd.G(i10, "TaggedMessages", new Object[0]), z10, true);
            } else if (this.f42248f4 != 7 && !this.Uc.f7021f) {
                f6Var.c(org.telegram.messenger.cd.a0(null, null, 2131747845, Integer.valueOf(this.L3 + 1), Integer.valueOf(this.K3)), z10, true);
            } else {
                f6Var.c(org.telegram.messenger.cd.G(i10, "SearchMessagesResultCount", org.telegram.messenger.cd.E(i10, ' ')), z10, true);
            }
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21086lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21169q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21019i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21001h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20933da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21138oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21119na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21099ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21080la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21062ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21042ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20939dg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21330z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21267vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21194rf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21232tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21213sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21010hg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21067kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21224t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21278w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21285wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21262v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21245u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21172q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21137o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21061k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21098m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21023i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21041j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20874a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21083ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21318yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20989ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20969fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20951ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20955ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20992gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20974ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21045jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21026id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21336ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21319ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21335zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21302xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21317yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21284we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21300xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21266ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21282wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21249ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21231te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21247uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21212se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21229tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21193re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21210sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21176qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21159pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21142oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21157pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21123ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21140oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21103me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21121nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21046je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21084le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21066ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21027ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21044jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21025ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20991ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21007hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20973fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20877ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20954ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20937de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20897bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20935dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20916cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20879ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20918ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20899be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20971fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20952ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21065kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21301xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21283wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21265vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21248ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21230td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21173qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21187r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21281wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21211sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21192rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21175qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21158pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21141od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21122nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21102md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21008hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20990gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21316yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20878ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21156pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21139ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21190ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21136o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21117n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21097m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21078l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21060k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21040j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21022i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20936dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f20917cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21225t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21155pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21206s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.t6.f21261v8));
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
        if (!this.f42445v4 && (i10 = this.f42248f4) != 3 && i10 != 5 && i10 != 8) {
            return 0L;
        }
        return this.f42394r4;
    }

    public final void b7() {
        TLRPC.Chat L0;
        long j10 = getArguments().getInt("search_from_user_id", 0);
        if (j10 != 0) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
            if (Z1 != null) {
                Ba("");
                ImageView imageView = this.f42270h3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                pb(null, Z1);
                return;
            }
            return;
        }
        long j11 = getArguments().getInt("search_from_chat_id", 0);
        if (j11 != 0 && (L0 = getMessagesController().L0(Long.valueOf(j11))) != null) {
            Ba("");
            ImageView imageView2 = this.f42270h3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            pb(L0, null);
        }
    }

    public final void b8(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.q1 q1Var2;
        CharacterStyle characterStyle2;
        int i10;
        org.telegram.messenger.jj jjVar2;
        int i11;
        String str2;
        TLRPC.WebPage webPage;
        int i12;
        int i13;
        org.telegram.ui.Components.z60 I = org.telegram.ui.Components.z60.I(this, q1Var);
        org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(getParentActivity(), this.f42477xa);
        I.f32936p = new se(nl0Var, 0);
        if (!str.startsWith("video?") && !gf.f.e(Uri.parse(str), false, null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean L2 = getMessagesController().L2(str);
        if (L2 && z10) {
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
                i12 = 2131231924;
            } else {
                i12 = 2131232264;
            }
            if (z11 && !z12) {
                i13 = 2131747807;
            } else {
                i13 = 2131747833;
            }
            String L0 = org.telegram.messenger.cd.L0(i13, null);
            z15 = z10;
            i10 = 2131232264;
            oh.h hVar = new oh.h(this, str, characterStyle, jjVar, q1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            q1Var2 = q1Var;
            I.c(i12, L0, hVar, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            q1Var2 = q1Var;
            characterStyle2 = characterStyle;
            i10 = 2131232264;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(i10, org.telegram.messenger.cd.L0(2131747809, null), new te(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !L2) {
            I.c(2131231924, org.telegram.messenger.cd.L0(2131747807, null), new te(this, str, 1), false);
        }
        TLRPC.MessageMedia n12 = org.telegram.messenger.jj.n1(jjVar);
        if ((n12 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = n12.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            jjVar2 = jjVar;
            I.c(2131231833, org.telegram.messenger.cd.L0(2131747806, null), new ue(this, jjVar2, 0), false);
        } else {
            jjVar2 = jjVar;
        }
        if (z14) {
            i11 = 2131751763;
        } else if (startsWith) {
            i11 = 2131751761;
        } else {
            i11 = 2131751762;
        }
        I.c(2131232102, org.telegram.messenger.cd.L0(i11, null), new bi.n4(this, str, jjVar2, startsWith, 24), false);
        if (L2 && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(2131232503, org.telegram.messenger.cd.L0(2131742967, null), new te(this, str, 2), false);
        }
        nl0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            nl0Var.f(q1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.g51) {
            String url = ((org.telegram.ui.Components.g51) characterStyle2).getURL();
            try {
                try {
                    Uri parse = Uri.parse(url);
                    url = gf.f.u(parse, null, null, gf.f.a(parse.getHost()), null);
                } catch (Exception e) {
                    org.telegram.messenger.f8.g(e, false);
                }
                str2 = URLDecoder.decode(url.replaceAll("\\+", "%2b"), "UTF-8");
            } catch (Exception e7) {
                org.telegram.messenger.f8.g(e7, true);
                str2 = url;
            }
            if (str2.length() > 204) {
                str2 = str2.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(str2);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            nl0Var.f(q1Var2, characterStyle2, spannableString2, false);
        } else {
            nl0Var.f(q1Var2, characterStyle2, null, false);
        }
        showDialog(nl0Var);
    }

    public final int b9() {
        return this.l1.getBackgroundSizeY();
    }

    public final void ba(org.telegram.messenger.jj jjVar) {
        if (jjVar != null && jjVar.r4() && !jjVar.f16368s0) {
            jjVar.f16368s0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = jjVar.P0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void bb() {
        this.Tb = null;
        this.Rb = 0;
        this.Sb = -1;
        this.Ub = null;
        this.Vb = null;
        this.f42468x1.d(false);
    }

    public final void bc() {
        TLRPC.ChatFull chatFull = this.f42374p8;
        if (chatFull != null && !this.G5) {
            TLRPC.Chat chat = this.e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                org.telegram.messenger.i0.h3(new me(this, 17), 1000L);
            }
        }
    }

    public final void bd() {
        U7();
        String str = this.I3;
        if (str != null) {
            this.f42392r2.e.setText(org.telegram.messenger.cd.a0(null, null, 2131749363, str));
            this.Z3.setEmptyView(this.f42392r2);
            return;
        }
        this.Z3.setEmptyView(null);
        this.f42392r2.setVisibility(8);
    }

    @Override
    public final boolean c() {
        if (this.f42248f4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7() {
        org.telegram.messenger.jj jjVar;
        if (!this.P4 && (jjVar = this.Z7) != null) {
            if (this.K6.indexOf(jjVar) >= 0) {
                this.Q4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.O4 != null) {
        } else {
            mf mfVar = new mf(this, 23);
            this.O4 = mfVar;
            org.telegram.messenger.i0.g3(mfVar);
        }
    }

    public final void c8(CharacterStyle characterStyle, boolean z10, org.telegram.messenger.jj jjVar, org.telegram.ui.Cells.q1 q1Var) {
        Object[] objArr;
        int i10;
        TLRPC.WebPage webPage;
        boolean z11;
        int i11;
        org.telegram.messenger.jj jjVar2;
        org.telegram.messenger.jj jjVar3;
        org.telegram.messenger.jj jjVar4;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.jj jjVar5;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.jj messageObject;
        ArrayList arrayList;
        org.telegram.messenger.ej ejVar;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z12 = true;
            boolean z13 = true;
            char c10 = 1;
            char c11 = 1;
            if (!K9() && (jjVar == null || (message = jjVar.f16337k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            org.telegram.ui.Cells.q1 q1Var3 = null;
            if (characterStyle instanceof org.telegram.ui.Components.d51) {
                if (objArr == null || a() == 489000) {
                    org.telegram.ui.Components.d51 d51Var = (org.telegram.ui.Components.d51) characterStyle;
                    org.telegram.messenger.i0.g(d51Var.f25340a.subSequence(d51Var.f25341b, d51Var.f25342c).toString());
                    Y7();
                    UndoView undoView = this.M3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z10 && q1Var != null) {
                    q1Var.b3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.h51) {
                TLRPC.User Z1 = getMessagesController().Z1(Utilities.A(((org.telegram.ui.Components.h51) characterStyle).getURL()));
                if (Z1 != null) {
                    org.telegram.messenger.vp.r1(this.currentAccount).w3(Z1, null, this, 0);
                }
                if (z10 && q1Var != null) {
                    q1Var.b3(-1);
                }
                Z9(jjVar, false, false);
            } else if (characterStyle instanceof org.telegram.ui.Components.n00) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((org.telegram.ui.Components.n00) characterStyle).f28648b;
                if (tL_messageEntityFormattedDate == null || (messageObject = q1Var.getMessageObject()) == null) {
                    q1Var2 = q1Var;
                } else {
                    if (messageObject.d1() != 0 && (ejVar = (org.telegram.messenger.ej) this.N6.f(messageObject.d1())) != null) {
                        arrayList = ejVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.m5.j(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e = getUserConfig().e();
                    String A = org.telegram.messenger.cd.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    org.telegram.ui.Components.z60 I = org.telegram.ui.Components.z60.I(this, q1Var);
                    org.telegram.ui.Components.nl0 nl0Var = new org.telegram.ui.Components.nl0(getParentActivity(), this.f42477xa);
                    I.f32936p = new se(nl0Var, 0);
                    I.c(2131232102, org.telegram.messenger.cd.L0(2131746347, null), new we(this, nl0Var, A, 0), false);
                    q1Var2 = q1Var;
                    I.c(2131232076, org.telegram.messenger.cd.L0(2131746348, null), new mg.c0(this, I, messageObject, q1Var, A, tL_messageEntityFormattedDate, nl0Var, 2), false);
                    I.c(2131232261, org.telegram.messenger.cd.L0(2131746346, null), new org.telegram.messenger.q00(this, I, e, tL_messageEntityFormattedDate, arrayList2, nl0Var, 2), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    nl0Var.e(I);
                    nl0Var.f(q1Var2, characterStyle, spannableString, false);
                    showDialog(nl0Var);
                }
                if (q1Var2 != null) {
                    q1Var2.b3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.e51) {
                String url = ((org.telegram.ui.Components.e51) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    d8(q1Var, characterStyle, url.substring(4));
                    if (z10 && q1Var != null) {
                        q1Var.b3(-1);
                    }
                } else if (jjVar != null && url.startsWith("/")) {
                    if (org.telegram.ui.Components.b51.h) {
                        mk mkVar = this.Z;
                        TLRPC.Chat chat = this.e;
                        if (chat == null || !chat.megagroup) {
                            z13 = false;
                        }
                        mkVar.Y0(jjVar, url, z10, z13);
                        if (!z10 && this.Z.getFieldText() == null) {
                            r9(false);
                        }
                    }
                    if (z10 && q1Var != null) {
                        q1Var.b3(-1);
                    }
                } else {
                    SparseArray[] sparseArrayArr = this.E6;
                    if (jjVar != null && url.startsWith("video") && !z10) {
                        int intValue = Utilities.z(url).intValue();
                        if (jjVar.e5()) {
                            webPage2 = jjVar.f16337k.media.webpage;
                            jjVar4 = jjVar;
                        } else {
                            org.telegram.messenger.jj jjVar6 = jjVar.C;
                            if (jjVar6 != null && jjVar6.e5()) {
                                jjVar4 = jjVar.C;
                                webPage2 = jjVar4.f16337k.media.webpage;
                            } else {
                                jjVar4 = jjVar;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            org.telegram.ui.Components.hu.K0(this, jjVar4, this.Za, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, J9());
                            return;
                        }
                        if (!org.telegram.messenger.jj.L4(jjVar4.f16337k) && (jjVar5 = jjVar4.C) != null) {
                            if (org.telegram.messenger.jj.B0(jjVar5.f16337k) == this.f42297j6) {
                                c10 = 0;
                            }
                            org.telegram.messenger.jj jjVar7 = (org.telegram.messenger.jj) sparseArrayArr[c10].get(jjVar4.C.f1());
                            if (jjVar7 == null) {
                                jjVar4 = jjVar4.C;
                            } else {
                                jjVar4 = jjVar7;
                            }
                        } else {
                            q1Var3 = q1Var;
                        }
                        jjVar4.f16304c0 = intValue / ((float) jjVar4.L0());
                        xa(q1Var3, jjVar4);
                    } else if (jjVar != null && url.startsWith("audio")) {
                        int intValue2 = Utilities.z(url).intValue();
                        if (!jjVar.I3() && (jjVar3 = jjVar.C) != null) {
                            if (org.telegram.messenger.jj.B0(jjVar3.f16337k) == this.f42297j6) {
                                c11 = 0;
                            }
                            jjVar2 = (org.telegram.messenger.jj) sparseArrayArr[c11].get(jjVar.C.f1());
                        } else {
                            jjVar2 = jjVar;
                        }
                        if (jjVar2 != null) {
                            float f7 = intValue2;
                            float L0 = f7 / ((float) jjVar2.L0());
                            MediaController mediaController = getMediaController();
                            if (mediaController.I(jjVar2)) {
                                jjVar2.f16299b0 = L0;
                                mediaController.i0(jjVar2, L0);
                                if (mediaController.H()) {
                                    mediaController.S(jjVar2);
                                }
                            } else {
                                jjVar2.f16304c0 = f7 / ((float) jjVar2.L0());
                                mediaController.S(jjVar2);
                            }
                            if (z10 && q1Var != null) {
                                q1Var.b3(-1);
                            }
                            if (!org.telegram.messenger.jj.R4(jjVar2.f16337k)) {
                                showDialog(new org.telegram.ui.Components.w7(getParentActivity(), this.f42477xa));
                            }
                        }
                    } else if (url.startsWith("tonaddress:")) {
                        String substring = url.substring(11);
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(this.currentAccount);
                        boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                        TLRPC.User[] userArr = new TLRPC.User[1];
                        i2.h1 h1Var = new i2.h1(this, q1Var, isValidAddress, substring, userArr, characterStyle);
                        if (isValidAddress) {
                            aj aa2 = aa(q1Var, characterStyle);
                            boolean[] zArr = {false};
                            if (aa2 != null) {
                                aa2.f7485b = new rr0(zArr, 23);
                                aa2.d();
                            }
                            x10.Z(new af(this, zArr, aa2, userArr, h1Var, 0), substring);
                        } else {
                            h1Var.run();
                        }
                        if (q1Var != null) {
                            q1Var.b3(-1);
                        }
                    } else if (url.startsWith("card:")) {
                        String substring2 = url.substring(5);
                        aj aa3 = aa(q1Var, characterStyle);
                        TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                        tL_payments_getBankCardData.number = substring2;
                        aa3.f7485b = new df(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new mg.z(this, aa3, q1Var, substring2, characterStyle, 3), null, null, 0, getMessagesController().P3, 1, true), 2);
                        aa3.d();
                        q1Var.b3(-1);
                    } else {
                        pa(characterStyle, url, z10, q1Var, jjVar);
                    }
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    d8(q1Var, characterStyle, url2.substring(4));
                } else if (z10) {
                    b8(q1Var, jjVar, characterStyle, url2);
                    if (q1Var != null) {
                        q1Var.b3(-1);
                    }
                } else {
                    Z9(jjVar, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        gf.f.r(parentActivity, url2);
                        return;
                    }
                    boolean z14 = characterStyle instanceof org.telegram.ui.Components.g51;
                    if ((z14 && (url2 == null || !url2.startsWith("mailto:"))) || org.telegram.messenger.i0.I3(url2)) {
                        if (jjVar != null) {
                            i11 = jjVar.f1();
                        } else {
                            i11 = 0;
                        }
                        if (ua(url2, q1Var, characterStyle, i11, 1)) {
                            return;
                        }
                    } else {
                        if (jjVar != null) {
                            TLRPC.MessageMedia messageMedia = jjVar.f16337k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = jjVar.f16337k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || gf.f.g(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    LaunchActivity launchActivity = LaunchActivity.I1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.I1.O().k(jjVar) == null) {
                                        createArticleViewer(false).L(jjVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (jjVar != null) {
                            i10 = jjVar.f1();
                        } else {
                            i10 = 0;
                        }
                        if (!ua(url2, q1Var, characterStyle, i10, 1)) {
                            z12 = z14;
                        } else {
                            return;
                        }
                    }
                    if (gf.f.x(url2)) {
                        z11 = false;
                    } else {
                        z11 = z12;
                    }
                    Ma(2, url2, characterStyle, q1Var, z11);
                }
            }
        }
    }

    public final float c9(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.l1.getBackgroundTranslationY()) - ((1.0f - this.Q9) * this.L9);
    }

    public final boolean ca() {
        org.telegram.messenger.jj jjVar;
        org.telegram.ui.Components.s5 s5Var;
        org.telegram.messenger.jj jjVar2;
        ImageReceiver photoImage;
        org.telegram.ui.Components.s5 m10;
        boolean z10;
        org.telegram.ui.Cells.q1 messageCell;
        boolean z11;
        if (this.f42492z0 != null && ((jjVar = MediaController.B().f14482u0) == null || org.telegram.messenger.jj.L4(jjVar.f16337k))) {
            org.telegram.ui.Components.q30 q30Var = this.H2;
            ArrayList arrayList = null;
            if (q30Var != null && q30Var.getTag() != null && (messageCell = this.H2.getMessageCell()) != null) {
                ImageReceiver photoImage2 = messageCell.getPhotoImage();
                s5Var = photoImage2.m();
                if (s5Var != null) {
                    jjVar2 = messageCell.getMessageObject();
                    if (photoImage2.A() + messageCell.getTop() > this.f42492z0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.L8 = z11;
                } else {
                    jjVar2 = null;
                }
            } else {
                s5Var = null;
                jjVar2 = null;
            }
            if (jjVar2 == null) {
                int childCount = this.f42492z0.getChildCount();
                int i10 = 0;
                while (true) {
                    if (i10 >= childCount) {
                        break;
                    }
                    View childAt = this.f42492z0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.jj messageObject = q1Var.getMessageObject();
                        boolean h42 = messageObject.h4();
                        if (!messageObject.g4() && !messageObject.S4() && ((org.telegram.messenger.jj.L4(messageObject.f16337k) || h42) && messageObject.f16356p0 == null && (m10 = (photoImage = q1Var.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.L0;
                            float f7 = photoImage.N0 + top;
                            if (f7 >= 0.0f && top <= this.f42492z0.getMeasuredHeight()) {
                                if (jjVar2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f7 <= this.f42492z0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.L8 = z10;
                                if (top >= 0.0f && f7 <= this.f42492z0.getMeasuredHeight()) {
                                    jjVar2 = messageObject;
                                    s5Var = m10;
                                    break;
                                }
                                jjVar2 = messageObject;
                                s5Var = m10;
                            }
                        }
                    }
                    i10++;
                }
            }
            if (jjVar2 != null && !MediaController.B().I(jjVar2)) {
                u9(true);
                if (jjVar2.h4()) {
                    boolean S = MediaController.B().S(jjVar2);
                    MediaController B = MediaController.B();
                    if (S) {
                        arrayList = Z7(jjVar2, false);
                    }
                    B.r0(arrayList, false);
                    return S;
                }
                org.telegram.messenger.tz.D(true);
                jjVar2.f16299b0 = s5Var.n();
                jjVar2.f16308d0 = s5Var.o();
                s5Var.stop();
                if (PhotoViewer.O1(jjVar2)) {
                    PhotoViewer.f33431b9.Q0();
                }
                return MediaController.B().S(jjVar2);
            }
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.t11 t11Var;
        mh.l lVar;
        org.telegram.ui.Components.pd pdVar;
        if ((this.f42248f4 != 5 || (!this.K6.isEmpty() && this.f42394r4 != 0)) && (((t11Var = this.m0) == null || (t11Var.D <= 0.0f && !t11Var.L)) && !this.f42438u9 && !this.Uc.f7021f && this.G9)) {
            mk mkVar = this.Z;
            if (!mkVar.F2 && ((!mkVar.f23688c1 || (pdVar = mkVar.f23700e1) == null || pdVar.getVisibility() != 0) && ((!mkVar.f0() || !mkVar.f23742l0.f54091w) && !org.telegram.ui.ActionBar.k2.hasSheets(mkVar.P2) && this.f42266ga == 0.0f && ((lVar = this.f42387qa) == null || !lVar.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.cb(org.telegram.ui.Cells.q1):void");
    }

    public final void cc(org.telegram.messenger.jj jjVar, CharSequence charSequence, int i10) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.wb G = org.telegram.ui.Components.cc.a0(this).G(2131623981, 9999, charSequence);
        G.f32135j = max;
        G.v = new df(this, i10, 3);
        G.k(true);
        this.U3 = jjVar;
        this.V3 = i10;
    }

    public final void cd() {
        boolean z10;
        if (this.f42468x1 == null) {
            return;
        }
        if ((!getMediaDataController().Y0.isEmpty() && this.G3 && !this.F3) || (this.f42248f4 == 7 && this.f42210c4 == 2 && !this.K6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f42468x1.e(6, z10, true);
        this.f42468x1.e(5, z10, true);
        if (z10) {
            this.f42468x1.e(1, false, true);
        }
        if (!z10) {
            this.R7 = 0;
        }
        this.l1.invalidate();
    }

    @Override
    public final android.view.View createView(android.content.Context r46) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.createView(android.content.Context):android.view.View");
    }

    @Override
    public void d(TLRPC.MessageMedia messageMedia, int i10, boolean z10, int i11, long j10) {
        org.telegram.messenger.oz d = org.telegram.messenger.oz.d(messageMedia, this.f42297j6, this.D5, this.l4, null, null, z10, i11);
        d.K = P8();
        d.Q = j10;
        d.R = a9();
        d.T = this.f42459w5;
        getSendMessagesHelper().r0(d);
        if (this.f42248f4 == 0) {
            ea(false);
        }
        if (i10 == 0 || i10 == 1) {
            F6();
        }
        if (this.G5) {
            this.f42262g6 = true;
        }
    }

    public final void d7(boolean z10) {
        if (this.D5 != null) {
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.K6;
                if (i10 < arrayList.size()) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
                    if (jjVar != null && jjVar.f1() == this.D5.f1() && org.telegram.messenger.jj.B0(jjVar.f16337k) == org.telegram.messenger.jj.B0(this.D5.f16337k)) {
                        this.D5 = jjVar;
                        kn knVar = this.B5;
                        if (knVar != null) {
                            knVar.a(jjVar);
                        }
                        if (z10) {
                            org.telegram.messenger.nj njVar = this.f42446v5;
                            if (njVar != null) {
                                org.telegram.messenger.jj jjVar2 = this.D5;
                                org.telegram.messenger.ej ejVar = this.f42497z5;
                                if (ejVar == null) {
                                    ejVar = L8(jjVar2.d1());
                                }
                                njVar.f(jjVar2, ejVar, this.f42297j6, this.B5);
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

    public final void d8(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, String str) {
        aj aa2 = aa(q1Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().f16072k0.get(af.b.d(str, false));
        pa paVar = new pa(this, q1Var, str, tL_contact, characterStyle, 1);
        if (tL_contact != null) {
            TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(tL_contact.user_id));
            if (Z1 != null) {
                paVar.a(Z1);
                return;
            } else {
                getMessagesStorage().f15938a.c(new p1(this, tL_contact, paVar, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = af.b.d(str, false);
        aa2.f7485b = new df(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new aa(this, aa2, paVar, 3)), 0);
        aa2.d();
    }

    public final float d9() {
        org.telegram.ui.Components.o21 o21Var = this.f42246f2;
        if (o21Var != null) {
            return o21Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final void da(org.telegram.messenger.jj jjVar) {
        org.telegram.ui.ActionBar.k2 k2Var;
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var == null) {
            return;
        }
        long j10 = jjVar.f16337k.action.channel_id;
        if (z4Var.getFragmentStack().size() > 0) {
            k2Var = (org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            k2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.z4 z4Var2 = this.parentLayout;
        if (indexOf > 0 && !(k2Var instanceof un) && !(k2Var instanceof ProfileActivity) && this.e.creator) {
            int size = z4Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) z4Var2.getFragmentStack().get(indexOf);
                if (k2Var2 instanceof un) {
                    ((ActionBarLayout) z4Var2).c(indexOf, new un(org.telegram.ui.Cells.f1.k(j10, "chat_id")));
                    k2Var2.removeSelfFromStack();
                } else if (k2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) z4Var2).c(indexOf, new ProfileActivity(org.telegram.ui.Cells.f1.k(j10, "chat_id"), null));
                    k2Var2.removeSelfFromStack();
                } else if (k2Var2 instanceof oo) {
                    ((ActionBarLayout) z4Var2).c(indexOf, new oo(org.telegram.ui.Cells.f1.k(j10, "chat_id")));
                    k2Var2.removeSelfFromStack();
                } else if (k2Var2 instanceof pr) {
                    if (((pr) k2Var2).f40728d1 == 0) {
                        Bundle arguments = k2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) z4Var2).c(indexOf, new pr(arguments));
                    }
                    k2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            org.telegram.messenger.i0.g3(new ag.q0(this, k2Var, jjVar, z4Var2, 24));
        }
        org.telegram.messenger.i0.h3(new mg.t0(this, j10, 2), 1000L);
    }

    public final void db() {
        org.telegram.ui.Components.jb0 k10;
        sn snVar = this.f42477xa;
        if (snVar != null) {
            Drawable m10 = snVar.m();
            if (this.fragmentView != null) {
                m10 = this.l1.getBackgroundImage();
            }
            if (m10 instanceof xn) {
                m10 = ((xn) m10).c(true);
            }
            if (m10 instanceof org.telegram.ui.Components.jb0) {
                ((org.telegram.ui.Components.jb0) m10).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.c5) && (k10 = ((org.telegram.ui.ActionBar.c5) themedDrawable).k()) != null) {
                k10.w(false);
            }
        }
    }

    public final void dc(boolean z10) {
        boolean z11;
        bh.k kVar = this.f42468x1;
        if (kVar != null) {
            if (z10 && !org.telegram.messenger.w3.p0(this.e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            kVar.e(2, z11, true);
            if (!z10) {
                this.R7 = 0;
            }
        }
    }

    public final void dd(String str) {
        if (this.f42248f4 == 7 && !TextUtils.equals(this.I3, str)) {
            U7();
            ec(true);
            this.I3 = str;
            this.H3 = str;
            Z6(false);
            F7(true);
            this.f42226d7 = 0L;
            this.A7 = false;
            org.telegram.messenger.oa.a(this.currentAccount).b(this.f42210c4).a();
            this.f42182a4.f();
            this.Z3.requestLayout();
            if (this.Z3.getLayoutManager() != null) {
                this.Z3.getLayoutManager().n0(0);
            }
            bd();
            this.f42392r2.e(true, true);
            C8();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, final Object... objArr) {
        long j10;
        org.telegram.messenger.jj jjVar;
        TLRPC.MessageReplies messageReplies;
        org.telegram.messenger.jj jjVar2;
        org.telegram.ui.ActionBar.z4 z4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull a2;
        TLRPC.User Z1;
        boolean z10;
        qj qjVar;
        mk mkVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.mt editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.cx0 cx0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i12;
        mk mkVar2;
        un unVar = this;
        if (i10 == org.telegram.messenger.zs.D) {
            unVar.k8(objArr);
            return;
        }
        if (i10 == org.telegram.messenger.zs.f19636j4) {
            vj vjVar = unVar.f42492z0;
            if (vjVar != null) {
                vjVar.g1();
            }
            ih.e eVar = unVar.f42253fa;
            if (eVar != null) {
                eVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            int i13 = 0;
            if (i10 == org.telegram.messenger.zs.I) {
                if (((Integer) objArr[0]).intValue() == unVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        unVar.finishFragment();
                        b.b(unVar.currentAccount);
                    }
                }
            } else if (i10 == org.telegram.messenger.zs.f19687s3) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ag.v vVar = unVar.X1;
                if (vVar != null && vVar.isShowing()) {
                    unVar.X1.a(true);
                }
                if (z11 && (mkVar2 = unVar.Z) != null && mkVar2.q0()) {
                    unVar.Z.i0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f19813id = stickerSet2.f19820id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = unVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.cx0) && (tL_messages_stickerSet = (cx0Var = (org.telegram.ui.Components.cx0) dialog).J1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f19820id == stickerSet2.f19820id) {
                            cx0Var.J1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (cx0Var.f25208k1 != null) {
                                cx0Var.a1();
                                cx0Var.Z0();
                                cx0Var.f25208k1.f();
                            }
                            cx0Var.Y0();
                            org.telegram.messenger.ui.b0(cx0Var.f21583a).q1(cx0Var.J1);
                            cx0Var.J0();
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
                                    org.telegram.ui.Components.cc ccVar = new org.telegram.ui.Components.cc(cx0Var.f21589c, unVar.resourceProvider);
                                    if (z12) {
                                        i12 = 2131744862;
                                    } else {
                                        i12 = 2131744863;
                                    }
                                    org.telegram.ui.Components.wb q6 = ccVar.q(document, org.telegram.messenger.cd.a0(null, null, i12, stickerSet2.title));
                                    q6.f32135j = 2750;
                                    q6.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.cx0 cx0Var2 = new org.telegram.ui.Components.cx0(unVar.getParentActivity(), unVar, tL_inputStickerSetID, null, unVar.Z, unVar.f42477xa);
                            final boolean z15 = z12;
                            unVar = this;
                            cx0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    un.y0(un.this, objArr, cx0Var2, z15, stickerSet2);
                                }
                            });
                            unVar.showDialog(cx0Var2);
                        }
                    }
                }
            } else if (i10 == org.telegram.messenger.zs.f19630i4) {
                vj vjVar2 = unVar.f42492z0;
                if (vjVar2 != null) {
                    vjVar2.g1();
                }
                TextView textView = unVar.f42235e3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i14 = 0; i14 < 2; i14++) {
                    org.telegram.ui.ActionBar.u5 u5Var = unVar.R2[i14];
                    if (u5Var != null) {
                        u5Var.invalidate();
                    }
                }
                ek ekVar = unVar.W1;
                if (ekVar != null) {
                    ekVar.getListView().g1();
                }
                ag.b1 b1Var = unVar.Z3;
                if (b1Var != null) {
                    b1Var.g1();
                }
                UndoView undoView = unVar.M3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                mk mkVar3 = unVar.Z;
                if (mkVar3 != null && (editField = mkVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                jn[] jnVarArr = unVar.S2;
                jn jnVar = jnVarArr[0];
                if (jnVar != null) {
                    jnVar.invalidate();
                }
                jn jnVar2 = jnVarArr[1];
                if (jnVar2 != null) {
                    jnVar2.invalidate();
                }
            } else if (i10 == org.telegram.messenger.zs.T1) {
                ConnectionsManager.getInstance(i11).getConnectionState();
            } else if (i10 == org.telegram.messenger.zs.f19615g1) {
                Long l4 = (Long) objArr[0];
                if (unVar.f42374p8 != null && (chat = unVar.e) != null && chat.f19793id == l4.longValue()) {
                    unVar.f42374p8.online_count = ((Integer) objArr[1]).intValue();
                    qj qjVar2 = unVar.f42355o1;
                    if (qjVar2 != null) {
                        qjVar2.m();
                        unVar.f42355o1.n(false);
                    }
                }
            } else if (i10 == org.telegram.messenger.zs.G) {
                if (((Long) objArr[0]).longValue() == unVar.f42297j6 && (mkVar = unVar.Z) != null) {
                    mkVar.P1(false, true);
                }
            } else if (i10 == org.telegram.messenger.zs.f19629i3) {
                mk mkVar4 = unVar.Z;
                if (mkVar4 != null) {
                    mkVar4.Q1();
                }
            } else if (i10 == org.telegram.messenger.zs.f19676r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i15 = org.telegram.messenger.vp.D8;
                int i16 = intValue & 1;
                if (i16 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (unVar.e != null) {
                        TLRPC.Chat L0 = unVar.getMessagesController().L0(Long.valueOf(unVar.e.f19793id));
                        if (L0 != null) {
                            unVar.e = L0;
                        }
                    } else if (unVar.f42243f != null && (Z1 = unVar.getMessagesController().Z1(Long.valueOf(unVar.f42243f.f19942id))) != null) {
                        unVar.f42243f = Z1;
                    }
                    unVar.id(true);
                }
                if (!unVar.T9() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (unVar.e != null && (qjVar = unVar.f42355o1) != null) {
                        qjVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i16 != 0) {
                    unVar.r();
                    unVar.sd(false);
                }
                if ((intValue & 64) != 0) {
                    z10 = true;
                }
                if ((intValue & 8192) != 0 && unVar.e != null) {
                    unVar.K9();
                    TLRPC.Chat L02 = unVar.getMessagesController().L0(Long.valueOf(unVar.e.f19793id));
                    if (L02 != null) {
                        unVar.e = L02;
                        unVar.K9();
                        z10 = !unVar.T9();
                        unVar.Bc(false);
                        mk mkVar5 = unVar.Z;
                        if (mkVar5 != null) {
                            mkVar5.Z0(unVar.currentAccount, unVar.f42297j6);
                        }
                        org.telegram.messenger.o6 o6Var = unVar.S3;
                        if (o6Var != null) {
                            o6Var.g();
                        }
                    }
                }
                qj qjVar3 = unVar.f42355o1;
                if (qjVar3 != null && z10) {
                    qjVar3.n(true);
                }
                if ((intValue & 130) != 0) {
                    unVar.ld(true);
                }
                org.telegram.ui.ActionBar.t0 t0Var = unVar.f42279i0;
                if (t0Var != null) {
                    if (org.telegram.messenger.w3.T(unVar.e) && !org.telegram.messenger.w3.p0(unVar.e)) {
                        long j11 = unVar.e.linked_monoforum_id;
                        if (j11 != 0 && org.telegram.messenger.w3.z(unVar.currentAccount, 24, -j11)) {
                            z13 = true;
                        }
                    }
                    t0Var.Q(70, z13);
                }
            } else if (i10 == 1) {
                org.telegram.messenger.f8.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!unVar.f42289ib) {
                    if (longValue == unVar.f42297j6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i17 = unVar.f42248f4;
                        if (intValue2 != i17 && i17 != 3 && i17 != 8) {
                            if (i17 != 1 && intValue2 == 1 && !unVar.isPaused && LaunchActivity.T() == unVar && unVar.f42446v5 == null && !arrayList.isEmpty() && ((org.telegram.messenger.jj) arrayList.get(0)).f1() < 0) {
                                int f12 = ((org.telegram.messenger.jj) arrayList.get(0)).f1();
                                if (((org.telegram.messenger.jj) arrayList.get(0)).f16337k != null && ((org.telegram.messenger.jj) arrayList.get(0)).f16337k.video_processing_pending) {
                                    z14 = true;
                                }
                                unVar.za(f12, z14);
                            }
                            org.telegram.messenger.f8.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !unVar.Mc && unVar.f42243f != null && unVar.a() != unVar.getUserConfig().e() && (a2 = unVar.getMessagesController().a2(unVar.f42243f.f19942id)) != null && a2.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i13 >= size) {
                                        break;
                                    }
                                    org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) arrayList.get(i13);
                                    if (jjVar3.f1() > 0 && !jjVar3.N3() && !jjVar3.r4()) {
                                        unVar.Mc = true;
                                        unVar.getMessagesController().U2(unVar.f42243f, unVar.classGuid, true, null);
                                        break;
                                    }
                                    i13++;
                                }
                            }
                            unVar.Oa(arrayList, true);
                        }
                    } else if (org.telegram.messenger.w3.T(unVar.e) && !unVar.e.megagroup && (chatFull = unVar.f42374p8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i18 = 0; i18 < size2; i18++) {
                            org.telegram.messenger.jj jjVar4 = (org.telegram.messenger.jj) arrayList.get(i18);
                            if (jjVar4.e4()) {
                                unVar.L6.put(jjVar4.f1(), jjVar4);
                            }
                        }
                        unVar.E7();
                    }
                    org.telegram.messenger.f8.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i10 == org.telegram.messenger.zs.F) {
                unVar.Y9(true);
            } else if (i10 == org.telegram.messenger.zs.E) {
                unVar.A6();
            } else if (i10 == org.telegram.messenger.zs.f19690t) {
                if (objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == unVar.f42297j6) {
                        unVar.finishFragment();
                    }
                } else if (org.telegram.messenger.i0.Q1() && (z4Var = unVar.parentLayout) != null && z4Var.getFragmentStack().size() > 1) {
                    unVar.finishFragment();
                } else {
                    unVar.removeSelfFromStack(true);
                }
            } else if (i10 == org.telegram.messenger.zs.f19697u) {
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
                int i19 = org.telegram.messenger.zs.B;
                SparseArray[] sparseArrayArr = unVar.E6;
                if (i10 == i19) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = unVar.e;
                    if (chat2 != null && chat2.f19793id == longValue3 && (jjVar2 = (org.telegram.messenger.jj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && jjVar2.x2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (unVar.G5) {
                            xh xhVar = unVar.B4;
                            if (xhVar != null) {
                                org.telegram.messenger.i0.r(xhVar);
                                unVar.B4 = null;
                            }
                            jjVar2.f16337k.replies.read_max_id = intValue3;
                        } else {
                            xh xhVar2 = new xh(unVar, jjVar2, intValue3);
                            unVar.B4 = xhVar2;
                            org.telegram.messenger.i0.h3(xhVar2, 500L);
                        }
                    }
                } else if (i10 == org.telegram.messenger.zs.C) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = unVar.e;
                    if (chat3 != null && chat3.f19793id == longValue4 && (jjVar = (org.telegram.messenger.jj) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = jjVar.f16337k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer y12 = unVar.getMessagesController().y1(org.telegram.messenger.w3.M(unVar.e, unVar.getMessagesController().M0(unVar.e.f19793id), false));
                            int size3 = jjVar.f16337k.replies.recent_repliers.size();
                            int i20 = 0;
                            while (true) {
                                if (i20 >= size3) {
                                    break;
                                } else if (org.telegram.messenger.jj.C1(jjVar.f16337k.replies.recent_repliers.get(i20)) == org.telegram.messenger.jj.C1(y12)) {
                                    jjVar.f16337k.replies.recent_repliers.remove(i20);
                                    break;
                                } else {
                                    i20++;
                                }
                            }
                            jjVar.f16337k.replies.recent_repliers.add(0, y12);
                        }
                        TLRPC.MessageReplies messageReplies2 = jjVar.f16337k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i21 = org.telegram.messenger.zs.A;
                    int i22 = org.telegram.messenger.zs.f19730z;
                    if ((i10 == i22 || i10 == i21) && unVar.f42297j6 == ((Long) objArr[0]).longValue()) {
                        if (i10 == i22) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i10 == i21) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = unVar.f42394r4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i23 = unVar.f42483y4;
                            ArrayList arrayList2 = unVar.K6;
                            if (intValue4 > i23) {
                                unVar.f42483y4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i24 = 0; i24 < size4; i24++) {
                                    org.telegram.messenger.jj jjVar5 = (org.telegram.messenger.jj) arrayList2.get(i24);
                                    int f13 = jjVar5.f1();
                                    if (!jjVar5.N3() && f13 > 0 && f13 <= unVar.f42483y4) {
                                        if (!jjVar5.F4()) {
                                            break;
                                        }
                                        jjVar5.H5();
                                        fm fmVar = unVar.C0;
                                        if (fmVar != null) {
                                            fmVar.M(jjVar5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > unVar.f42496z4) {
                                unVar.f42496z4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i25 = 0; i25 < size5; i25++) {
                                    org.telegram.messenger.jj jjVar6 = (org.telegram.messenger.jj) arrayList2.get(i25);
                                    int f14 = jjVar6.f1();
                                    if (jjVar6.N3() && f14 > 0 && f14 <= unVar.f42496z4) {
                                        if (!jjVar6.F4()) {
                                            break;
                                        }
                                        jjVar6.H5();
                                        fm fmVar2 = unVar.C0;
                                        if (fmVar2 != null) {
                                            fmVar2.R(jjVar6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        unVar.f8(i10, objArr);
        unVar.g8(i10, objArr);
        unVar.h8(i10, objArr);
        unVar.i8(i10, objArr);
        unVar.j8(i10, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ag.v vVar = this.X1;
        if (vVar != null && this.visibleDialog == vVar) {
            vVar.a2.b0(false);
            this.X1.L();
            this.X1.a2.e0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.X1 && dialog != this.ua && !(dialog instanceof xh.m2) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7() {
        qk qkVar;
        pk pkVar;
        pk pkVar2;
        mk mkVar = this.Z;
        if (mkVar != null && mkVar.f23823z3) {
            MediaController.B().N = false;
            return;
        }
        TLRPC.Chat chat = this.e;
        if (chat != null && !org.telegram.messenger.w3.v(chat)) {
            MediaController.B().N = false;
        } else if (!org.telegram.messenger.w0.f19032x && (((qkVar = this.f42207c1) == null || qkVar.getVisibility() != 0) && (((pkVar = this.S) == null || pkVar.getVisibility() != 0) && ((pkVar2 = this.f42247f3) == null || pkVar2.getVisibility() != 0)))) {
            MediaController.B().N = true;
        } else {
            MediaController.B().N = false;
        }
    }

    public final void e8(org.telegram.ui.Cells.z r31, final org.telegram.tgnet.TLRPC.ReactionCount r32, boolean r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.e8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int e9() {
        return (int) (d9() * org.telegram.messenger.i0.L(71.0f));
    }

    public final void ea(boolean z10) {
        int i10;
        if (this.f42492z0 != null) {
            ArrayList arrayList = this.K6;
            if (!arrayList.isEmpty() && !this.Pa.f41053n) {
                if (z10) {
                    i10 = 0;
                    while (i10 < arrayList.size() && ((org.telegram.messenger.jj) arrayList.get(i10)).r4()) {
                        i10++;
                    }
                } else {
                    i10 = 0;
                }
                this.B0.h1(i10, 0);
                this.f42492z0.C0();
            }
        }
    }

    public final void eb() {
        boolean z10;
        org.telegram.messenger.jj jjVar;
        CharSequence charSequence;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        qk qkVar;
        mk mkVar = this.Z;
        if (mkVar != null && mkVar.D1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f42309k5 && mkVar != null && (qkVar = this.f42207c1) != null && qkVar.getVisibility() != 0) {
            jjVar = this.D5;
            charSequence = org.telegram.messenger.i0.n1(this.Z.getDraftMessage());
            z10 = this.Z.Y2;
        } else {
            z10 = true;
            jjVar = null;
            charSequence = null;
        }
        if (this.C5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && org.telegram.messenger.i0.X0(encryptedChat.layer) < 101) {
            z11 = false;
        } else {
            z11 = true;
        }
        ArrayList W = mediaDataController.W(charSequenceArr, z11, false);
        long J7 = J7(jjVar);
        TLRPC.DraftMessage R = getMediaDataController().R(this.f42297j6, J7);
        if (R != null) {
            richMessage = R.rich_message;
        } else {
            richMessage = null;
        }
        org.telegram.messenger.ui mediaDataController2 = getMediaDataController();
        long j11 = this.f42297j6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (jjVar != null && !jjVar.f16355p && jjVar.f16327h1 == null && !this.C5) {
            message = jjVar.f16337k;
        } else {
            message = null;
        }
        kn knVar = this.B5;
        org.telegram.messenger.oj ojVar = this.f42459w5;
        if (ojVar != null) {
            suggestedPost = ojVar.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        mk mkVar2 = this.Z;
        if (mkVar2 != null) {
            j10 = mkVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.Q1(j11, J7, charSequence2, W, message, knVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void ec(boolean z10) {
        int i10;
        if (this.Y3 != null) {
            fe.b bVar = this.Uc;
            if (bVar.f7021f != z10) {
                bVar.a(z10, true);
                if (!z10 && this.f42248f4 == 7) {
                    s4.a0 a0Var = (s4.a0) this.Z3.getLayoutManager();
                    Object E = this.f42182a4.E((a0Var.N0() + a0Var.L0()) / 2);
                    Object E2 = this.f42182a4.E(a0Var.L0());
                    Object E3 = this.f42182a4.E(a0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.C0.L();
                        int L0 = this.B0.L0();
                        int N0 = this.B0.N0();
                        int i11 = ((org.telegram.messenger.jj) E).f16337k.f19814id;
                        int i12 = ((org.telegram.messenger.jj) E2).f16337k.f19814id;
                        int i13 = ((org.telegram.messenger.jj) E3).f16337k.f19814id;
                        int i14 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i15 = 0; i15 < L.size(); i15++) {
                            if (((org.telegram.messenger.jj) L.get(i15)).f16337k.f19814id == i12) {
                                int i16 = this.C0.J + i15;
                                if (L0 <= i16 && N0 >= i16) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.jj) L.get(i15)).f16337k.f19814id == i13) {
                                int i17 = this.C0.J + i15;
                                if (L0 <= i17 && N0 >= i17) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.jj) L.get(i15)).f16337k.f19814id == i11) {
                                i14 = i15;
                            }
                        }
                        if (!z11 && !z12 && i14 != -1) {
                            this.B0.h1(this.C0.J + i14, (this.f42492z0.getHeight() - N8((org.telegram.messenger.jj) L.get(i14), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.f6 f6Var = this.f42294j3;
                if (f6Var != null) {
                    if (bVar.f7021f) {
                        i10 = 2131745835;
                    } else {
                        i10 = 2131745834;
                    }
                    f6Var.c(org.telegram.messenger.cd.L0(i10, null), !org.telegram.messenger.cd.X, true);
                }
                vh.p2 p2Var = this.L1;
                if (p2Var != null && p2Var.V) {
                    p2Var.e(true);
                }
                wl wlVar = this.P1;
                if (wlVar != null && wlVar.V) {
                    wlVar.e(true);
                }
                mk mkVar = this.Z;
                if (mkVar != null) {
                    mkVar.h0();
                }
                ad();
            }
        }
    }

    public final void ed() {
        mk mkVar;
        if (this.S != null) {
            this.G0.setBackground(null);
            this.G0.setOnClickListener(null);
            boolean z10 = true;
            if (this.f42248f4 == 3 && V8() == 2666000) {
                this.G0.setText(org.telegram.messenger.cd.L0(2131753882, null));
                this.S.setVisibility(0);
                this.W1.setVisibility(8);
                this.W1.setTag(null);
                Mc();
                org.telegram.ui.Components.sx0 sx0Var = this.f42391r1;
                if (sx0Var != null) {
                    sx0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null && !org.telegram.messenger.w3.n(chat)) {
                    TLRPC.Chat chat2 = this.e;
                    if (!org.telegram.messenger.w3.p(chat2) && !org.telegram.messenger.w3.u(chat2) && !org.telegram.messenger.w3.s(chat2) && !org.telegram.messenger.w3.v(chat2) && !org.telegram.messenger.w3.l(chat2) && !org.telegram.messenger.w3.o(chat2) && !org.telegram.messenger.w3.t(chat2)) {
                        TLRPC.Chat chat3 = this.e;
                        if (!chat3.gigagroup && (!org.telegram.messenger.w3.T(chat3) || this.e.megagroup)) {
                            TLRPC.Chat chat4 = this.e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (org.telegram.messenger.w3.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231127).mutate();
                                    int i10 = org.telegram.ui.ActionBar.t6.Ci;
                                    mutate.setTint(getThemedColor(i10));
                                    this.P0 = mutate;
                                    this.M0 = getThemedColor(i10);
                                    mutate.setBounds(0, 0, org.telegram.messenger.i0.L(14.0f), org.telegram.messenger.i0.L(14.0f));
                                    org.telegram.ui.Components.eq eqVar = new org.telegram.ui.Components.eq(null, mutate, org.telegram.messenger.i0.L(-6.0f), org.telegram.messenger.i0.L(-6.0f));
                                    int L = org.telegram.messenger.i0.L(14.0f);
                                    int L2 = org.telegram.messenger.i0.L(14.0f);
                                    eqVar.e = L;
                                    eqVar.f25842f = L2;
                                    int L3 = org.telegram.messenger.i0.L(14.0f);
                                    int L4 = org.telegram.messenger.i0.L(14.0f);
                                    eqVar.h = L3;
                                    eqVar.f25843n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a1.g.m(null, 2131753581, new StringBuilder("d ")));
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.l00(i10, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(eqVar, 1), 0, 1, 33);
                                    TextView textView = this.G0;
                                    int i11 = org.telegram.ui.ActionBar.t6.f21020i6;
                                    org.telegram.ui.ActionBar.a7.R(textView, org.telegram.ui.ActionBar.t6.i0(0, org.telegram.ui.ActionBar.t6.x0(null, i11, false)), null, org.telegram.ui.ActionBar.a7.N(i11), null);
                                    this.G0.setText(spannableStringBuilder);
                                    this.G0.setOnClickListener(new xe(this, 0));
                                } else {
                                    this.G0.setText(org.telegram.messenger.cd.L0(2131749543, null));
                                }
                            } else if (org.telegram.messenger.i0.D1(chat4.banned_rights)) {
                                this.G0.setText(org.telegram.messenger.cd.L0(2131745614, null));
                            } else {
                                this.G0.setText(org.telegram.messenger.cd.a0("SendMessageRestricted", null, 2131745615, org.telegram.messenger.cd.v(this.e.banned_rights.until_date)));
                            }
                            this.S.setVisibility(0);
                            this.W1.setVisibility(8);
                            this.W1.setTag(null);
                            Mc();
                            org.telegram.ui.Components.sx0 sx0Var2 = this.f42391r1;
                            if (sx0Var2 != null) {
                                sx0Var2.f();
                            }
                        }
                    }
                }
                O7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.f42328m1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.G0.setText(org.telegram.messenger.cd.L0(2131751130, null));
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        org.telegram.messenger.m5.q("AwaitingEncryption", null, 2131753757, new Object[]{a1.g.r(new StringBuilder("<b>"), this.f42243f.first_name, "</b>")}, this.G0);
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.G0.setText(org.telegram.messenger.cd.L0(2131751129, null));
                        this.S.setVisibility(0);
                        this.Z.setVisibility(4);
                        this.Z.setFieldText("");
                        getMediaDataController().D(this.f42297j6, this.f42394r4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.S.setVisibility(4);
                            if (!this.inPreviewMode && !this.f42289ib && this.f42248f4 != 3) {
                                this.Z.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    e7();
                    O6(false);
                } else {
                    this.S.setVisibility(4);
                    if (this.f42391r1 != null && (mkVar = this.Z) != null && mkVar.g0()) {
                        this.f42391r1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.S.setVisibility(4);
            }
            if (z10) {
                this.Z.i0(false);
                if (getParentActivity() != null) {
                    org.telegram.messenger.i0.v1(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.extendActionMode(android.view.Menu):boolean");
    }

    public final boolean f7(boolean z10, boolean z11) {
        mk mkVar = this.Z;
        if (mkVar == null || !mkVar.s0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f42477xa);
            boolean z12 = this.Z.f23688c1;
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            if (z12) {
                x1Var.R = org.telegram.messenger.cd.L0(2131751396, null);
                x1Var.T = org.telegram.messenger.cd.L0(2131751397, null);
            } else {
                x1Var.R = org.telegram.messenger.cd.L0(2131751393, null);
                x1Var.T = org.telegram.messenger.cd.L0(2131751394, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751395, null), new ag.w0(7, this, z11));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131751771, null), null);
            showDialog(x1Var);
            return true;
        }
        return true;
    }

    public final void f8(int r33, java.lang.Object... r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.f8(int, java.lang.Object[]):void");
    }

    public final int f9(int i10) {
        SparseIntArray sparseIntArray = this.f42272h5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = f42171cd;
            f42171cd = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final boolean fa() {
        mk mkVar = this.Z;
        boolean z10 = mkVar.f23822z2;
        if (z10) {
            mkVar.q1();
            this.R3 = true;
        }
        org.telegram.messenger.i0.k3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void fb() {
        org.telegram.ui.Cells.q1 q1Var = null;
        int i10 = 0;
        for (int i11 = 0; i11 < this.f42492z0.getChildCount(); i11++) {
            View childAt = this.f42492z0.getChildAt(i11);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int min = Math.min(q1Var2.getBottom(), this.f42492z0.getHeight()) - Math.max(0, q1Var2.getTop());
                if (min > i10) {
                    q1Var = q1Var2;
                    i10 = min;
                }
            }
        }
        if (q1Var != null) {
            yj yjVar = this.B0;
            this.f42492z0.getClass();
            yjVar.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) this.L9), false);
        }
    }

    public final void fc(TLRPC.TL_game tL_game, org.telegram.messenger.jj jjVar, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f42477xa);
            String L0 = org.telegram.messenger.cd.L0(2131689472, null);
            org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
            x1Var.R = L0;
            if (Z1 != null) {
                str3 = org.telegram.messenger.i5.m(0, Z1.first_name, Z1.last_name);
            }
            x1Var.T = org.telegram.messenger.cd.a0(null, null, 2131753015, str3);
            alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), new lh(this, tL_game, jjVar, str, j10));
            alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
            showDialog(x1Var);
            return;
        }
        String n10 = org.telegram.messenger.h20.n(Z1);
        if (!org.telegram.messenger.i0.Q1()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (Z1 == null || TextUtils.isEmpty(n10)) {
                        str2 = "";
                    } else {
                        str2 = n10;
                    }
                    presentFragment(new we1(str, str2, tL_game.title, tL_game.short_name, jjVar));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (Z1 != null && n10 != null) {
            str3 = n10;
        }
        we1.Z(str, jjVar, parentActivity, str6, str3);
    }

    public final void fd() {
        boolean z10;
        int i10;
        int i11;
        org.telegram.messenger.bj bjVar;
        int i12 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f42333m6;
        if (i12 == 0) {
            ArrayList<org.telegram.messenger.jj> arrayList = new ArrayList<>();
            for (int i13 = 0; i13 < sparseArrayArr.length; i13++) {
                for (int i14 = 0; i14 < sparseArrayArr[i13].size(); i14++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[i13].valueAt(i14);
                    if (jjVar.z2()) {
                        org.telegram.messenger.ej k92 = k9(jjVar);
                        if (k92 != null) {
                            bjVar = k92.d(jjVar);
                        } else {
                            bjVar = null;
                        }
                        if (bjVar != null) {
                            if (!bjVar.h) {
                            }
                        }
                    }
                    arrayList.add(jjVar);
                }
            }
            dl dlVar = this.f42464wb;
            if (dlVar != null) {
                dlVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f42464wb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                dl dlVar2 = this.f42464wb;
                if (isEmpty) {
                    i11 = 2131745889;
                } else {
                    i11 = 2131745888;
                }
                dlVar2.setHint(org.telegram.messenger.cd.L0(i11, null));
                org.telegram.messenger.i0.h3(new me(this, 14), 120L);
            } else {
                z10 = !org.telegram.ui.Components.mj0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.t0 j10 = this.actionBar.m(null).j(28);
            if (j10 != null) {
                if (z10) {
                    i10 = 2131231897;
                } else {
                    i10 = 2131231899;
                }
                org.telegram.ui.Components.ei0 ei0Var = j10.f20856y;
                if (ei0Var != null && j10.D != i10) {
                    j10.D = i10;
                    org.telegram.messenger.i0.Q3(ei0Var, i10);
                }
            }
        }
        if (this.f42400ra != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                arrayList2.add((org.telegram.messenger.jj) sparseArray.valueAt(i15));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i16 = 0; i16 < sparseArray2.size(); i16++) {
                arrayList2.add((org.telegram.messenger.jj) sparseArray2.valueAt(i16));
            }
            this.f42400ra.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.k1 k1Var = this.f42240e9;
        if (k1Var != null) {
            k1Var.e = false;
            I7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.e;
    }

    public final void g7() {
        if (!this.f42353nc) {
            this.f42353nc = true;
            if (!this.f42366oc && this.f42248f4 == 0 && !getMessagesController().F1().f15767b && getMessagesController().F1().c() > 2) {
                if (this.J1 != null && org.telegram.messenger.vp.d1().getInt("savedhint", 0) < 1) {
                    this.J1.u();
                    this.f42366oc = true;
                    org.telegram.messenger.vp.d1().edit().putInt("savedhint", org.telegram.messenger.vp.d1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", org.telegram.messenger.vp.d1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.K1 != null && org.telegram.messenger.vp.d1().getInt("savedsearchhint", 0) < 1) {
                    this.K1.u();
                    this.f42366oc = true;
                    org.telegram.messenger.vp.d1().edit().putInt("savedsearchhint", org.telegram.messenger.vp.d1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    h7();
                }
            }
        }
    }

    public final void g8(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.g8(int, java.lang.Object[]):void");
    }

    public final int g9(int i10) {
        SparseIntArray sparseIntArray = this.f42261g5;
        int i11 = sparseIntArray.get(i10, -1);
        if (i11 == -1) {
            int i12 = f42171cd;
            f42171cd = i12 + 1;
            sparseIntArray.put(i10, i12);
            return i12;
        }
        return i11;
    }

    public final void gb(org.telegram.messenger.jj r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.gb(org.telegram.messenger.jj):void");
    }

    public final void gc(boolean z10) {
        if (z10) {
            if (this.Xb == null) {
                me meVar = new me(this, 13);
                this.Xb = meVar;
                org.telegram.messenger.i0.h3(meVar, 100L);
                return;
            }
            return;
        }
        me meVar2 = this.Xb;
        if (meVar2 != null) {
            org.telegram.messenger.i0.r(meVar2);
        }
        this.Xb = null;
        this.Wb = false;
        Rc(true);
    }

    public final void gd() {
        bh.k kVar;
        org.telegram.ui.ActionBar.x xVar;
        mk mkVar = this.Z;
        if (mkVar != null) {
            if (this.f42248f4 != 1 && !this.f42433u4 && !Q9()) {
                kVar = null;
            } else {
                kVar = this.f42468x1;
            }
            mkVar.setSideButtonsForAttach(kVar);
            boolean Q9 = Q9();
            if (this.f42439ub != Q9) {
                this.f42439ub = Q9;
                org.telegram.ui.ActionBar.t0 t0Var = this.f42279i0;
                if ((t0Var != null && t0Var.getVisibility() == 0) || ((xVar = this.f42244f0) != null && xVar.f21463l == 0)) {
                    org.telegram.ui.ActionBar.l lVar = this.actionBar;
                    if (!lVar.f20497n0 && !lVar.u()) {
                        if (this.Z.g0() && TextUtils.isEmpty(this.Z.getSlowModeTimer()) && !Q9()) {
                            org.telegram.ui.ActionBar.x xVar2 = this.f42244f0;
                            if (xVar2 != null) {
                                xVar2.e(0);
                            }
                            org.telegram.ui.ActionBar.t0 t0Var2 = this.f42279i0;
                            if (t0Var2 != null) {
                                t0Var2.setVisibility(8);
                            }
                            cs csVar = this.f42232e0;
                            if (csVar != null) {
                                csVar.b(true);
                            }
                        } else {
                            org.telegram.ui.ActionBar.x xVar3 = this.f42244f0;
                            if (xVar3 != null) {
                                xVar3.e(8);
                            }
                            org.telegram.ui.ActionBar.t0 t0Var3 = this.f42279i0;
                            if (t0Var3 != null) {
                                t0Var3.setVisibility(0);
                            }
                            cs csVar2 = this.f42232e0;
                            if (csVar2 != null) {
                                csVar2.b(false);
                            }
                        }
                        qj qjVar = this.f42355o1;
                        if (qjVar != null) {
                            qjVar.f30280k0 = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.u4 getBackButtonState() {
        return org.telegram.ui.ActionBar.u4.f21348a;
    }

    @Override
    public final org.telegram.ui.ActionBar.t3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.t3.f20863c;
    }

    @Override
    public final org.telegram.messenger.u3 getGroupCall() {
        org.telegram.messenger.u3 u3Var;
        if (this.f42248f4 == 0 && (u3Var = this.f42335m8) != null && (u3Var.f18228b instanceof TLRPC.TL_groupCall)) {
            return u3Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f42248f4 == 2) {
            ArrayList arrayList = this.K6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.L(80.0f) + N8((org.telegram.messenger.jj) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.p6 getResourceProvider() {
        return this.f42477xa;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.u5 u5Var;
        org.telegram.ui.ActionBar.u5 u5Var2;
        View view;
        org.telegram.ui.Components.vy vyVar;
        org.telegram.ui.Components.vy vyVar2;
        org.telegram.ui.Components.vy vyVar3;
        org.telegram.ui.Components.vy vyVar4;
        org.telegram.ui.Components.vy vyVar5;
        org.telegram.ui.Components.vy vyVar6;
        org.telegram.ui.Components.vy vyVar7;
        org.telegram.ui.Components.vy vyVar8;
        org.telegram.ui.Components.vy vyVar9;
        org.telegram.ui.Components.vy vyVar10;
        org.telegram.ui.Components.vy vyVar11;
        View view2;
        org.telegram.ui.Components.vy vyVar12 = null;
        if (this.f42436u7) {
            return null;
        }
        int i10 = 0;
        if (this.f42426ta) {
            this.f42426ta = false;
            return null;
        }
        g6 g6Var = new g6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ce));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.De));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ee));
        M9();
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.F8));
        qj qjVar = this.f42355o1;
        if (qjVar != null) {
            u5Var = qjVar.getTitleTextView();
        } else {
            u5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(u5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A8));
        qj qjVar2 = this.f42355o1;
        if (qjVar2 != null) {
            u5Var2 = qjVar2.getTitleTextView();
        } else {
            u5Var2 = null;
        }
        int i11 = org.telegram.ui.ActionBar.t6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(u5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i11));
        qj qjVar3 = this.f42355o1;
        if (qjVar3 != null) {
            view = qjVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(i11, view));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.C8));
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        int i12 = org.telegram.ui.ActionBar.t6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(lVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i12));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21297x8));
        org.telegram.ui.ActionBar.c5 c5Var = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.c5 c5Var2 = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.c5 c5Var3 = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.c5 c5Var4 = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.c5 c5Var5 = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.c5 c5Var6 = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.c5 c5Var7 = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.c5 c5Var8 = (org.telegram.ui.ActionBar.c5) getThemedDrawable("drawableMsgOutMediaSelected");
        if (c5Var != null) {
            Drawable[] drawableArr = c5Var.A;
            int i13 = org.telegram.ui.ActionBar.t6.f21227ta;
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.b7) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, c5Var2.A, (org.telegram.ui.ActionBar.b7) null, i13));
            Drawable[] drawableArr2 = c5Var5.A;
            int i14 = org.telegram.ui.ActionBar.t6.f21174qb;
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.b7) null, i14));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, c5Var6.A, (org.telegram.ui.ActionBar.b7) null, i14));
        }
        if (!this.f42477xa.q(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{c5Var5, c5Var6}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21191rb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{c5Var5, c5Var6}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21209sb));
            arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{c5Var5, c5Var6}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21228tb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{c5Var7, c5Var8}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20953ed));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20972fd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Yb));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21064kc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21101mc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21082lc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20938df));
        this.f42477xa.getClass();
        pk pkVar = this.f42247f3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i15 = org.telegram.ui.ActionBar.t6.Ge;
        arrayList.add(new org.telegram.ui.ActionBar.c7(pkVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.S, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ll));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ne));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oe));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Yf));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20900bg));
        mk mkVar = this.Z;
        int i16 = org.telegram.ui.ActionBar.t6.f20881ag;
        arrayList.add(new org.telegram.ui.ActionBar.c7(mkVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i16));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20920cg));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rf));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.Z, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Uf));
        mk mkVar2 = this.Z;
        if (mkVar2 != null) {
            vyVar = mkVar2.getEmojiView();
        } else {
            vyVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21337zf));
        mk mkVar3 = this.Z;
        if (mkVar3 != null) {
            vyVar2 = mkVar3.getEmojiView();
        } else {
            vyVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar2, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Af));
        mk mkVar4 = this.Z;
        if (mkVar4 != null) {
            vyVar3 = mkVar4.getEmojiView();
        } else {
            vyVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar3, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Bf));
        mk mkVar5 = this.Z;
        if (mkVar5 != null) {
            vyVar4 = mkVar5.getEmojiView();
        } else {
            vyVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar4, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Df));
        mk mkVar6 = this.Z;
        if (mkVar6 != null) {
            vyVar5 = mkVar6.getEmojiView();
        } else {
            vyVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar5, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ef));
        mk mkVar7 = this.Z;
        if (mkVar7 != null) {
            vyVar6 = mkVar7.getEmojiView();
        } else {
            vyVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar6, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Gf));
        mk mkVar8 = this.Z;
        if (mkVar8 != null) {
            vyVar7 = mkVar8.getEmojiView();
        } else {
            vyVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar7, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Hf));
        mk mkVar9 = this.Z;
        if (mkVar9 != null) {
            vyVar8 = mkVar9.getEmojiView();
        } else {
            vyVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar8, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Lf));
        mk mkVar10 = this.Z;
        if (mkVar10 != null) {
            vyVar9 = mkVar10.getEmojiView();
        } else {
            vyVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar9, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Cf));
        mk mkVar11 = this.Z;
        if (mkVar11 != null) {
            vyVar10 = mkVar11.getEmojiView();
        } else {
            vyVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar10, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f21320yf));
        mk mkVar12 = this.Z;
        if (mkVar12 != null) {
            vyVar11 = mkVar12.getEmojiView();
        } else {
            vyVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar11, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Jf));
        mk mkVar13 = this.Z;
        if (mkVar13 != null) {
            vyVar12 = mkVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7(vyVar12, 0, new Class[]{org.telegram.ui.Components.vy.class}, (String[]) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.Ff));
        mk mkVar14 = this.Z;
        if (mkVar14 != null) {
            org.telegram.ui.Components.h41 trendingStickersAlert = mkVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.V());
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.Z.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kl));
        }
        for (int i17 = 0; i17 < 2; i17++) {
            if (i17 == 0) {
                view2 = this.M3;
            } else {
                view2 = this.N3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.c7(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.tj));
        }
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Of));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21260v7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21243u7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21312y7));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.N2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, g6Var, org.telegram.ui.ActionBar.t6.f20929d6));
        NumberTextView numberTextView = this.T2;
        int i18 = org.telegram.ui.ActionBar.t6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.c7(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i18));
        ImageView imageView = this.f42259g3;
        int i19 = org.telegram.ui.ActionBar.t6.f21332z8;
        arrayList.add(new org.telegram.ui.ActionBar.c7(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42270h3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42328m1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42492z0, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21250uf));
        kg.f0 f0Var = this.R;
        int i20 = org.telegram.ui.ActionBar.t6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.c7(f0Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42369p2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42328m1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i20));
        org.telegram.ui.Components.q30 q30Var = this.f42405s2;
        int i21 = org.telegram.ui.ActionBar.t6.f20956eg;
        arrayList.add(new org.telegram.ui.ActionBar.c7(q30Var, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.f42405s2, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20939dg));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.H2, 4, new Class[]{org.telegram.ui.Components.q30.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.c7(this.I2, 4, new Class[]{org.telegram.ui.Components.q30.class}, new String[]{"arrowImageView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i21));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21058k6));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21028ig));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f21048jg));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.f20872a7));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.qk));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.sk));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.rk));
        int i22 = org.telegram.ui.ActionBar.t6.tk;
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i22));
        arrayList.add(new org.telegram.ui.ActionBar.c7((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i22));
        oh.e eVar = this.f42489ya;
        if (eVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.c7(eVar.f14251g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, i18));
            arrayList.add(new org.telegram.ui.ActionBar.c7(eVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.b7) null, org.telegram.ui.ActionBar.t6.Re));
        }
        int size = arrayList.size();
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((org.telegram.ui.ActionBar.c7) obj).f20242n = this.f42477xa;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f42477xa.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.f42477xa.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.t6.V0(str);
    }

    public final void h7() {
        org.telegram.ui.Cells.q1 q1Var;
        vh.p2 p2Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        vh.p2 p2Var2 = this.L1;
        if (p2Var2 != null && !p2Var2.V && !this.qc && this.f42353nc && !this.Uc.f7021f && System.currentTimeMillis() - this.f42377pc > 1800 && org.telegram.messenger.vp.d1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.f42492z0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.f42492z0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        sg.p0 p0Var = q1Var.N;
                        org.telegram.messenger.jj primaryMessageObject = q1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.f16337k) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !p0Var.f48453s.isEmpty()) {
                            q1Var.getLocationInWindow(iArr);
                            float f7 = iArr[1] + p0Var.f48440c;
                            if (f7 >= org.telegram.messenger.i0.L(240.0f) && f7 <= (org.telegram.messenger.i0.f16026q.y - org.telegram.messenger.i0.L(25.0f)) - org.telegram.messenger.i0.f16021n) {
                                break;
                            }
                        }
                    }
                    childCount--;
                } else {
                    q1Var = null;
                    break;
                }
            }
            if (q1Var != null) {
                sg.p0 p0Var2 = q1Var.N;
                this.qc = true;
                q1Var.getLocationInWindow(iArr);
                this.L1.setTranslationY(((iArr[1] - p2Var.getTop()) - org.telegram.messenger.i0.L(120.0f)) + p0Var2.f48440c);
                this.L1.m(0.0f, (((sg.m0) p0Var2.f48453s.get(0)).f48418z / 2.0f) + (-org.telegram.messenger.i0.L(16.0f)) + iArr[0] + p0Var2.f48439b);
                this.L1.u();
                org.telegram.messenger.vp.d1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            org.telegram.messenger.i0.r(new me(this, 22));
            org.telegram.messenger.i0.h3(new me(this, 22), 2000L);
        }
    }

    public final void h8(int r34, final java.lang.Object... r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.h8(int, java.lang.Object[]):void");
    }

    public final long h9() {
        return this.f42394r4;
    }

    public final void hb(long j10) {
        yj yjVar;
        org.telegram.messenger.jj messageObject;
        int Y8;
        int abs;
        int i10 = -1;
        if (this.f42492z0 != null && (yjVar = this.B0) != null && yjVar.f47877y < 0) {
            int i11 = 0;
            if (this.U6[0] && yjVar.L0() == 0) {
                this.D7 = -1;
                return;
            }
            int i12 = Integer.MAX_VALUE;
            for (int childCount = this.f42492z0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f42492z0.getChildAt(childCount);
                this.f42492z0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.Z1() == j10 && (abs = Math.abs((Y8 = Y8(childAt)))) < i12) {
                    i10 = messageObject.f1();
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

    public final void hc(boolean z10) {
        float f7;
        int i10;
        int i11;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.vp.r1(this.currentAccount).F5 * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!org.telegram.messenger.d20.i(this.currentAccount).q() && !org.telegram.messenger.vp.r1(this.currentAccount).A3()) {
                if (z10) {
                    f7 = org.telegram.messenger.vp.r1(this.currentAccount).D5;
                } else {
                    f7 = org.telegram.messenger.vp.r1(this.currentAccount).E5;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f7 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.x41(org.telegram.messenger.i0.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(this);
                    if (z10) {
                        i10 = 2131743828;
                    } else {
                        i10 = 2131751349;
                    }
                    String L0 = org.telegram.messenger.cd.L0(i10, null);
                    if (z10) {
                        i11 = 2131743827;
                    } else {
                        i11 = 2131751348;
                    }
                    org.telegram.ui.Components.wb I = a02.I(2131624208, L0, org.telegram.messenger.i0.J2(org.telegram.messenger.i0.x2(org.telegram.messenger.cd.L0(i11, null), new hf(this, z10, 0)), spannableString, "%d"));
                    I.f32135j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void hd(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.messenger.jj jjVar;
        org.telegram.ui.Wallet.b4 b4Var;
        if (this.fragmentView != null && !this.G5) {
            int childCount = this.f42492z0.getChildCount();
            int i10 = 0;
            while (true) {
                if (i10 < childCount) {
                    View childAt = this.f42492z0.getChildAt(i10);
                    if (childAt instanceof org.telegram.ui.Cells.s0) {
                        org.telegram.ui.Cells.s0 s0Var = (org.telegram.ui.Cells.s0) childAt;
                        org.telegram.messenger.jj messageObject = s0Var.getMessageObject();
                        if (this.f42200b8 != Integer.MAX_VALUE && messageObject != null && messageObject.f1() == this.f42200b8 && s0Var.T()) {
                            org.telegram.ui.Wallet.d4 d4Var = s0Var.I0;
                            if (!d4Var.f34389h0 && (d4Var.f34384e0 == 0 || (b4Var = d4Var.f34383d0) == null || b4Var.c())) {
                                d4Var.e();
                                org.telegram.ui.Wallet.b4 b4Var2 = d4Var.f34383d0;
                                b4Var2.getClass();
                                b4Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.b4 b4Var3 = d4Var.f34383d0;
                                b4Var3.f30502b = -1L;
                                b4Var3.f30503c = -1L;
                                d4Var.f34384e0 = SystemClock.elapsedRealtime();
                                d4Var.f34386f0 = false;
                                d4Var.f34377a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
                        if (this.H8 != null && ((messageObject2.h4() || org.telegram.messenger.jj.L4(messageObject2.f16337k)) && !messageObject2.T4() && MediaController.B().I(messageObject2))) {
                            ImageReceiver photoImage = q1Var.getPhotoImage();
                            this.H8.setTranslationX(q1Var.getX() + photoImage.K0);
                            this.H8.setTranslationY((this.f42492z0.getY() + ((q1Var.getY() + q1Var.getPaddingTop()) + photoImage.L0)) - this.H8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.H8.getLayoutParams();
                            if (messageObject2.h4()) {
                                this.H8.setTag(2131296591, null);
                                if (layoutParams.width != org.telegram.messenger.i0.f3(P9(), G9()) || layoutParams.height != org.telegram.messenger.i0.f3(P9(), G9())) {
                                    int f32 = org.telegram.messenger.i0.f3(P9(), G9());
                                    layoutParams.height = f32;
                                    layoutParams.width = f32;
                                    this.J8.setResizeMode(0);
                                    this.H8.setLayoutParams(layoutParams);
                                }
                                float f33 = ((org.telegram.messenger.i0.f16032x * 2) + org.telegram.messenger.i0.f3(P9(), G9())) / org.telegram.messenger.i0.f3(P9(), G9());
                                float f34 = q1Var.getPhotoImage().M0 / org.telegram.messenger.i0.f3(P9(), G9());
                                if (this.H8.getScaleX() != f34) {
                                    this.H8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.H8.setPivotX(0.0f);
                                this.H8.setPivotY(0.0f);
                                this.H8.setScaleX(f34);
                                this.H8.setScaleY(f34);
                                this.K8.setScaleX(f33);
                                this.K8.setScaleY(f33);
                            } else {
                                this.H8.setTag(2131296591, photoImage);
                                if (layoutParams.width != photoImage.M0 || layoutParams.height != photoImage.N0) {
                                    this.J8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.M0;
                                    layoutParams.height = (int) photoImage.N0;
                                    this.H8.setLayoutParams(layoutParams);
                                }
                                this.K8.setScaleX(1.0f);
                                this.K8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.H8.invalidate();
                            z12 = true;
                        }
                    }
                    i10++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.H8 != null && (jjVar = MediaController.B().f14482u0) != null && jjVar.T == 0) {
                if (!z12) {
                    if (this.A3 && org.telegram.messenger.jj.L4(jjVar.f16337k)) {
                        MediaController.B().q(true, true, false, false);
                        return;
                    }
                    this.H8.setTranslationY((-org.telegram.messenger.i0.f3(P9(), G9())) - 100);
                    this.fragmentView.invalidate();
                    if (jjVar.h4() || org.telegram.messenger.jj.L4(jjVar.f16337k)) {
                        if (!this.A3 && PipRoundVideoView.F == null) {
                            if (z11) {
                                k(jjVar.f1(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.B().k0(false);
                        }
                    }
                } else {
                    MediaController.B().k0(true);
                    if (!jjVar.h4() && !this.L8) {
                        this.f42492z0.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        org.telegram.messenger.jj jjVar = this.l4;
        if (jjVar != null && jjVar.N1() == 0 && org.telegram.messenger.w3.n(this.e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i7(boolean z10) {
        int i10;
        if (this.B0 != null && !this.G5 && !this.C0.L && !this.f42448v7) {
            int i11 = 0;
            int i12 = -1;
            int i13 = -1;
            for (int i14 = 0; i14 < this.f42492z0.getChildCount(); i14++) {
                int R = RecyclerView.R(this.f42492z0.getChildAt(i14));
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
            fm fmVar = this.C0;
            if (fmVar.N) {
                int i15 = fmVar.E;
                if (i15 >= 0 && i13 >= 0 && i15 >= i13 && i15 <= i12) {
                    getMediaDataController().O0();
                    return;
                }
                return;
            }
            int b10 = fmVar.b();
            if (z10) {
                i10 = 25;
            } else {
                i10 = 5;
            }
            int i16 = i10;
            if (this.f42248f4 == 7) {
                if ((b10 - i13) - i11 <= i16 && !this.W6 && !this.S6[0]) {
                    this.W6 = true;
                    this.f42473x6.add(Integer.valueOf(this.f42321l6));
                    org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(this.currentAccount);
                    String str = this.I3;
                    int i17 = this.classGuid;
                    int i18 = this.f42210c4;
                    int i19 = this.f42321l6;
                    this.f42321l6 = i19 + 1;
                    a2.e(i17, i18, str, i19);
                    return;
                }
                return;
            }
            org.telegram.messenger.i0.g3(new org.telegram.messenger.qr(this, b10, i13, i11, i16, 1));
        }
    }

    public final void i8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.i8(int, java.lang.Object[]):void");
    }

    public final float i9(float f7) {
        un unVar = this.f42463wa;
        if (unVar == null) {
            unVar = this;
        }
        org.telegram.ui.Components.hg hgVar = unVar.f42180a1;
        if (hgVar == null) {
            return 0.0f;
        }
        return hgVar.c(f7);
    }

    public final void ia() {
        R6(5, this.f42220d1, true);
        R6(1, this.Z, false);
        R6(4, this.f42247f3, true);
        R6(3, this.f42207c1, false);
        R6(2, this.S, false);
        float f7 = this.Sc.e;
        j6.m mVar = this.Xc;
        float z10 = sc.e.z(1.0f, f7, 1.0f - ((float[]) mVar.f9699b)[5], 1.0f);
        bh.e eVar = this.f42220d1;
        if (eVar != null) {
            eVar.setTotalVisibilityFactor(z10);
        }
        mk mkVar = this.Z;
        if (mkVar != null) {
            mkVar.setTranslationY(org.telegram.messenger.i0.L(54.0f) * z10);
        }
        pk pkVar = this.f42247f3;
        if (pkVar != null) {
            pkVar.setTranslationY(org.telegram.messenger.i0.L(54.0f) * z10);
        }
        qk qkVar = this.f42207c1;
        if (qkVar != null) {
            qkVar.setTranslationY(org.telegram.messenger.i0.L(54.0f) * z10);
        }
        pk pkVar2 = this.S;
        if (pkVar2 != null) {
            pkVar2.setTranslationY(org.telegram.messenger.i0.L(54.0f) * z10);
        }
        zg.e eVar2 = this.T;
        if (eVar2 != null) {
            eVar2.setInputBubbleAlpha((int) ((1.0f - z10) * 255.0f));
            this.T.setInputBubbleTranslationY(org.telegram.messenger.i0.L(54.0f) * z10);
        }
        qk qkVar2 = this.f42207c1;
        fe.b bVar = this.Qc;
        if (qkVar2 != null) {
            qkVar2.setTotalVisibilityFactor((1.0f - bVar.e) * ((float[]) mVar.f9699b)[3]);
        }
        tp tpVar = this.ia;
        if (tpVar != null) {
            float f10 = bVar.e;
            if (tpVar.S != f10) {
                tpVar.S = f10;
                this.fragmentView.invalidate();
            }
        }
        y7();
    }

    public final void ib() {
        int i10;
        int i11;
        vj vjVar = this.f42492z0;
        if (vjVar != null && this.B0 != null) {
            for (int childCount = vjVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.f42492z0.getChildAt(childCount);
                this.f42492z0.getClass();
                i11 = RecyclerView.R(childAt);
                if (i11 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i10 = Y8(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                        i10 = Y8(childAt);
                        break;
                    }
                }
            }
        }
        i10 = 0;
        i11 = -1;
        if (i11 >= 0) {
            this.B0.h1(i11, i10);
        }
    }

    public final void ic(boolean z10) {
        if (this.Q != null) {
            if (!org.telegram.messenger.i0.Q1() && !this.f42433u4 && this.f42243f == null) {
                if (this.Db == null) {
                    this.Db = Boolean.valueOf(org.telegram.messenger.sc.e(360928));
                }
                if (this.Db.booleanValue()) {
                    this.Cb = z10;
                    return;
                }
            }
            int i10 = 0;
            if (this.f42238e6 && org.telegram.messenger.tz.c()) {
                if (z10 == this.Cb) {
                    return;
                }
                this.Cb = z10;
                if (z10) {
                    if (this.Q.getVisibility() != 0) {
                        this.Q.setVisibility(0);
                        this.Q.setAlpha(0.0f);
                        this.Q.setScaleX(0.3f);
                        this.Q.setScaleY(0.3f);
                    }
                    this.Q.animate().setListener(null).cancel();
                    this.Q.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.Q.animate().setListener(null).cancel();
                this.Q.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new bi(this, 4)).start();
                return;
            }
            this.Cb = z10;
            FrameLayout frameLayout = this.Q;
            if (!z10) {
                i10 = 4;
            }
            frameLayout.setVisibility(i10);
        }
    }

    public final void id(boolean z10) {
        TLRPC.Chat L0;
        TLRPC.User user;
        TLRPC.Chat chat;
        qj qjVar = this.f42355o1;
        if (qjVar == null) {
            return;
        }
        int i10 = this.f42248f4;
        if (i10 == 8 && (chat = this.e) != null) {
            if (this.f42271h4) {
                String i11 = gg.e.i(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.e;
                qjVar.h(i11, chat2.scam, chat2.fake, chat2.verified, false, null, z10);
            } else if (org.telegram.messenger.w3.p0(chat)) {
                int i12 = (this.f42394r4 > 0L ? 1 : (this.f42394r4 == 0L ? 0 : -1));
                if (i12 == 0) {
                    TLRPC.Chat chat3 = this.e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(this.e.linked_monoforum_id));
                        if (L02 == null) {
                            L02 = this.e;
                        }
                        this.f42355o1.h(org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(L02.title)), L02.scam, L02.fake, L02.verified, false, L02.emoji_status, z10);
                    } else {
                        qj qjVar2 = this.f42355o1;
                        String F2 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(chat3.title));
                        TLRPC.Chat chat4 = this.e;
                        qjVar2.h(F2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z10);
                    }
                } else if (i12 > 0) {
                    TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f42394r4));
                    this.f42355o1.h(org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(org.telegram.messenger.h20.p(Z1))), Z1.scam, Z1.fake, Z1.verified, Z1.premium, Z1.emoji_status, z10);
                } else {
                    TLRPC.Chat L03 = getMessagesController().L0(Long.valueOf(-this.f42394r4));
                    if (L03 == null) {
                        L03 = this.e;
                    }
                    this.f42355o1.h(org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(L03.title)), L03.scam, L03.fake, L03.verified, false, L03.emoji_status, z10);
                }
            } else {
                qj qjVar3 = this.f42355o1;
                String F22 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(this.e.title));
                TLRPC.Chat chat5 = this.e;
                qjVar3.h(F22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i10 == 9) {
                qjVar.setTitle(org.telegram.messenger.cd.L0(2131742924, null));
            } else if (i10 == 5) {
                if ("hello".equalsIgnoreCase(this.f42236e4)) {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131752775, null));
                } else if ("away".equalsIgnoreCase(this.f42236e4)) {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131752838, null));
                } else {
                    this.f42355o1.setTitle(this.f42236e4);
                }
            } else if (i10 == 6) {
                if (!TextUtils.isEmpty(this.f42223d4.title)) {
                    this.f42355o1.setTitle(this.f42223d4.title);
                } else {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131752716, null));
                }
            } else if (i10 == 3) {
                long j10 = this.f42394r4;
                if (j10 > 0) {
                    user = getMessagesController().Z1(Long.valueOf(j10));
                    L0 = null;
                } else {
                    L0 = getMessagesController().L0(Long.valueOf(-j10));
                    user = null;
                }
                if (org.telegram.messenger.h20.z(user)) {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131746281, null));
                } else if (org.telegram.messenger.h20.s(user)) {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131754252, null));
                } else if (org.telegram.messenger.h20.B(user)) {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131748318, null));
                } else if (user != null) {
                    this.f42355o1.setTitle(org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(org.telegram.messenger.h20.p(user))));
                } else if (L0 != null) {
                    this.f42355o1.setTitle(org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(L0.title)));
                } else {
                    this.f42355o1.setTitle("");
                }
            } else if (T9() && !org.telegram.messenger.h20.u(this.f42243f)) {
                if (this.f42445v4) {
                    nd();
                } else if (this.f42433u4) {
                    if (this.l4.x2()) {
                        this.f42355o1.setTitle(org.telegram.messenger.cd.G(this.l4.N1(), "Comments", new Object[0]));
                    } else {
                        this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131751996, null));
                    }
                } else {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.G(this.l4.N1(), "Replies", new Object[0]));
                }
            } else if (org.telegram.messenger.h20.z(this.f42243f)) {
                this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131746281, null));
            } else if (org.telegram.messenger.h20.s(this.f42243f)) {
                this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131754252, null));
            } else {
                int i13 = this.f42248f4;
                if (i13 == 1) {
                    if (org.telegram.messenger.h20.B(this.f42243f)) {
                        this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131746337, null));
                    } else {
                        this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131745865, null));
                    }
                } else if (i13 == 2) {
                    this.f42355o1.setTitle(org.telegram.messenger.cd.G(T8(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.e;
                    if (chat6 != null) {
                        qj qjVar4 = this.f42355o1;
                        String F23 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(chat6.title));
                        TLRPC.Chat chat7 = this.e;
                        qjVar4.h(F23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                    } else {
                        TLRPC.User user2 = this.f42243f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.f42355o1.setTitle(org.telegram.messenger.cd.L0(2131745918, null));
                            } else if (!org.telegram.messenger.vp.E2(user2) && getContactsController().f16067f0.get(Long.valueOf(this.f42243f.f19942id)) == null && (getContactsController().f16067f0.size() != 0 || !getContactsController().y())) {
                                if (!TextUtils.isEmpty(this.f42243f.phone)) {
                                    qj qjVar5 = this.f42355o1;
                                    String h = org.telegram.messenger.m5.h(new StringBuilder("+"), this.f42243f.phone, af.b.c());
                                    TLRPC.User user3 = this.f42243f;
                                    boolean z11 = user3.scam;
                                    boolean z12 = user3.fake;
                                    boolean z13 = user3.verified;
                                    org.telegram.messenger.vp messagesController = getMessagesController();
                                    TLRPC.User user4 = this.f42243f;
                                    messagesController.getClass();
                                    qjVar5.h(h, z11, z12, z13, org.telegram.messenger.vp.A2(user4), this.f42243f.emoji_status, z10);
                                } else {
                                    qj qjVar6 = this.f42355o1;
                                    String F24 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(org.telegram.messenger.h20.p(this.f42243f)));
                                    TLRPC.User user5 = this.f42243f;
                                    boolean z14 = user5.scam;
                                    boolean z15 = user5.fake;
                                    boolean z16 = user5.verified;
                                    org.telegram.messenger.vp messagesController2 = getMessagesController();
                                    TLRPC.User user6 = this.f42243f;
                                    messagesController2.getClass();
                                    qjVar6.h(F24, z14, z15, z16, org.telegram.messenger.vp.A2(user6), this.f42243f.emoji_status, z10);
                                }
                            } else {
                                qj qjVar7 = this.f42355o1;
                                String F25 = org.telegram.messenger.i0.F2(org.telegram.messenger.i0.D2(org.telegram.messenger.h20.p(this.f42243f)));
                                TLRPC.User user7 = this.f42243f;
                                boolean z17 = user7.scam;
                                boolean z18 = user7.fake;
                                boolean z19 = user7.verified;
                                org.telegram.messenger.vp messagesController3 = getMessagesController();
                                TLRPC.User user8 = this.f42243f;
                                messagesController3.getClass();
                                boolean A2 = org.telegram.messenger.vp.A2(user8);
                                if (!org.telegram.messenger.vp.E2(this.f42243f)) {
                                    emojiStatus = this.f42243f.emoji_status;
                                }
                                qjVar7.h(F25, z17, z18, z19, A2, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f42355o1.getTitleTextView().getText());
        kd(false);
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (M9()) {
            org.telegram.ui.ActionBar.p6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.f(org.telegram.ui.ActionBar.t6.f21279w8);
            } else {
                x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21279w8, true);
            }
            if (i0.b.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.t6.I.q();
        } else {
            z10 = this.Yb;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.t11 t11Var;
        hl hlVar;
        mh.l lVar;
        if ((this.f42248f4 == 5 && (this.K6.isEmpty() || this.f42394r4 == 0)) || (((t11Var = this.m0) != null && (t11Var.D > 0.0f || t11Var.L)) || this.f42438u9 || this.Uc.f7021f || !this.G9 || (((hlVar = this.Ya) != null && hlVar.f24358s) || ((lVar = this.f42387qa) != null && lVar.a())))) {
            return false;
        }
        return true;
    }

    public TLRPC.User j() {
        return this.f42243f;
    }

    public final void j7(org.telegram.messenger.jj jjVar) {
        if (jjVar.D == 4 && !this.F8) {
            int i10 = org.telegram.messenger.tz.f18131a;
            if (!org.telegram.messenger.vp.d1().contains("mapPreviewType")) {
                this.F8 = true;
                org.telegram.ui.Components.s4.r0(getParentActivity(), this.currentAccount, new me(this, 12), true, this.f42477xa);
            }
        }
    }

    public final void j8(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.j8(int, java.lang.Object[]):void");
    }

    public final float j9(org.telegram.ui.Components.k21 k21Var) {
        float f7;
        org.telegram.ui.Components.o21 o21Var = this.f42246f2;
        if (o21Var != null) {
            float L = org.telegram.messenger.i0.L(7.0f);
            float k10 = o21Var.k(k21Var);
            if (k21Var == org.telegram.ui.Components.k21.f27623b) {
                f7 = 64.0f;
            } else {
                f7 = 36.0f;
            }
            return (org.telegram.messenger.i0.L(f7) + L) * k10;
        }
        return 0.0f;
    }

    public final void ja(boolean z10, boolean z11) {
        if (this.R3) {
            org.telegram.messenger.i0.h3(new me(this, 23), 200L);
            if (z11) {
                this.R3 = false;
            }
        }
        if (z10 && !this.f42289ib) {
            org.telegram.messenger.i0.Z2(getParentActivity(), this.classGuid);
        }
    }

    public final boolean jb() {
        mk mkVar = this.Z;
        if (mkVar != null && mkVar.t0() && !this.Z.f23688c1 && !MediaController.B().K()) {
            this.f42332m5 = true;
            mk mkVar2 = this.Z;
            this.f42346n5 = mkVar2.O;
            this.f42359o5 = mkVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void jc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String L0 = org.telegram.messenger.cd.L0(2131752657, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.cd.L0(2131752658, null);
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131746336, null), new re(this, 10));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), null);
        showDialog(x1Var);
    }

    public final void jd() {
        kd(false);
    }

    @Override
    public final void k(int i10, int i11, boolean z10, int i12, boolean z11, int i13) {
        nb(i10, i11, z10, i12, z11, i13, null, null, null);
    }

    public final void k7(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.k7(boolean):void");
    }

    public final void k8(java.lang.Object... r82) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.k8(java.lang.Object[]):void");
    }

    public final org.telegram.messenger.ej k9(org.telegram.messenger.jj jjVar) {
        if (jjVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.ej ejVar = (org.telegram.messenger.ej) this.N6.f(jjVar.d1());
        if (ejVar != null && (ejVar.d.size() <= 1 || ejVar.d(jjVar) == null)) {
            return null;
        }
        return ejVar;
    }

    public final void ka() {
        this.P4 = true;
        lm lmVar = this.f42386q9;
        org.telegram.messenger.i0.r(lmVar.f23421f0);
        lmVar.f23447z = false;
        me meVar = new me(this, 10);
        int i10 = this.T7;
        if (i10 != 0) {
            nb(i10, 0, false, this.S7, true, 0, null, null, meVar);
            return;
        }
        int i11 = this.R7;
        if (i11 > 0) {
            nb(i11, 0, true, this.S7, true, 0, null, null, meVar);
            return;
        }
        mb(!this.xb, meVar);
        this.xb = false;
        if (!this.T4.isEmpty()) {
            this.f42183a5 = true;
            this.Z4 = ((Integer) this.T4.get(0)).intValue();
        }
    }

    public final int kb(org.telegram.messenger.jj r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.kb(org.telegram.messenger.jj):int");
    }

    public final void kc() {
        String str;
        if (this.f42204bc != null) {
            return;
        }
        if (this.D5 != null) {
            str = getMessagesController().b1(this.D5.S1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String L0 = org.telegram.messenger.cd.L0(2131743837, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131743838, str));
        alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131751336, null), new re(this, 18));
        alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131752589, null), new re(this, 19));
        x1Var.setOnDismissListener(new qe(this, 8));
        this.f42204bc = alertDialog$Builder.p();
    }

    public final void kd(boolean z10) {
        Drawable mutate;
        Drawable drawable;
        org.telegram.ui.ActionBar.r0 r0Var;
        if (this.f42355o1 != null) {
            int i10 = this.f42248f4;
            if (i10 == 0 || i10 == 8) {
                boolean q22 = getMessagesController().q2(this.f42297j6, b(), null);
                if (z10) {
                    q22 = !q22;
                }
                this.Q0 = null;
                if (!org.telegram.messenger.w3.e0(this.currentAccount, this.e) && !org.telegram.messenger.w3.f0(this.currentAccount, this.f42243f)) {
                    if (!org.telegram.messenger.h20.z(this.f42243f) && ((!T9() || this.f42445v4) && q22)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231941).mutate();
                    int i11 = org.telegram.ui.ActionBar.t6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i11), PorterDuff.Mode.SRC_IN));
                    this.Q0 = mutate;
                    this.N0 = getThemedColor(i11);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.e;
                    if (chat != null) {
                        drawable = this.f42355o1.c(org.telegram.messenger.o5.c(chat));
                    } else {
                        TLRPC.User user = this.f42243f;
                        if (user != null && !org.telegram.messenger.h20.B(user)) {
                            drawable = this.f42355o1.c(org.telegram.messenger.o5.c(this.f42243f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.f42355o1.j(drawable, mutate);
                if (!z10 && (r0Var = this.f42404s1) != null) {
                    if (q22) {
                        if (r0Var.f20718m != 8) {
                            r0Var.f20718m = 8;
                            View view = r0Var.f20715j;
                            if (view instanceof org.telegram.ui.ActionBar.b1) {
                                ((org.telegram.ui.ActionBar.b1) view).getRightIcon().setVisibility(r0Var.f20718m);
                            }
                        }
                        this.f42404s1.d(org.telegram.messenger.cd.L0(2131743874, null));
                        this.f42404s1.b(2131232255);
                    } else {
                        if (r0Var.f20718m != 0) {
                            r0Var.f20718m = 0;
                            View view2 = r0Var.f20715j;
                            if (view2 instanceof org.telegram.ui.ActionBar.b1) {
                                ((org.telegram.ui.ActionBar.b1) view2).getRightIcon().setVisibility(r0Var.f20718m);
                            }
                        }
                        if (getMessagesController().r2(this.f42297j6, b())) {
                            this.f42404s1.d(org.telegram.messenger.cd.L0(2131748329, null));
                            this.f42404s1.b(2131232411);
                        } else {
                            this.f42404s1.d(org.telegram.messenger.cd.L0(2131748329, null));
                            this.f42404s1.b(2131232365);
                        }
                    }
                }
                org.telegram.ui.Components.go goVar = this.f42455w1;
                if (goVar != null) {
                    goVar.e(this.f42297j6, b(), null);
                }
            }
        }
    }

    public final void l7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.l7():void");
    }

    public final void l8(int i10, ArrayList arrayList, boolean z10) {
        ArrayList arrayList2;
        un unVar;
        int i11;
        un unVar2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && unVar2.n7()) {
            boolean z11 = false;
            int i12 = 0;
            while (true) {
                if (i12 < arrayList3.size()) {
                    org.telegram.messenger.pz pzVar = (org.telegram.messenger.pz) arrayList3.get(i12);
                    if (pzVar.f17522m == null && pzVar.f17520k == null) {
                        break;
                    }
                    i12++;
                } else if (!TextUtils.isEmpty(((org.telegram.messenger.pz) arrayList3.get(0)).d)) {
                    org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(((org.telegram.messenger.pz) arrayList3.get(0)).d, unVar2.f42297j6, unVar2.D5, unVar2.l4, null, false, ((org.telegram.messenger.pz) arrayList3.get(0)).f17518i, null, null, z10, i10, 0, null, false);
                    b10.K = unVar2.P8();
                    org.telegram.messenger.qz.C(unVar2.currentAccount).r0(b10);
                }
            }
            int i13 = 0;
            while (i13 < arrayList3.size()) {
                org.telegram.messenger.pz pzVar2 = (org.telegram.messenger.pz) arrayList3.get(i13);
                if (pzVar2.f17522m != null && pzVar2.f17520k == null) {
                    org.telegram.messenger.c accountInstance = unVar2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = pzVar2.f17522m;
                    HashMap hashMap = pzVar2.f17523n;
                    int i14 = i13;
                    org.telegram.messenger.qz.S(i10, unVar2.f42297j6, 0L, unVar2.a9(), hashMap, accountInstance, unVar2.D5, unVar2.l4, unVar2.P8(), botInlineResult, null, unVar2, unVar2.B5, z10);
                    arrayList2 = arrayList;
                    unVar = unVar2;
                    arrayList2.remove(i14);
                    i11 = i14 - 1;
                } else {
                    arrayList2 = arrayList3;
                    unVar = unVar2;
                    i11 = i13;
                }
                i13 = i11 + 1;
                unVar2 = unVar;
                arrayList3 = arrayList2;
                z11 = false;
            }
            ArrayList arrayList4 = arrayList3;
            un unVar3 = unVar2;
            if (!arrayList4.isEmpty()) {
                unVar3.u8(((org.telegram.messenger.pz) arrayList4.get(0)).d, ((org.telegram.messenger.pz) arrayList4.get(0)).f17518i);
                org.telegram.messenger.qz.X(unVar3.getAccountInstance(), arrayList4, unVar3.f42297j6, unVar3.D5, unVar3.l4, null, unVar3.B5, false, true, unVar3.F5, null, z10, i10, 0, ((org.telegram.messenger.pz) arrayList4.get(0)).f17529t, null, unVar3.P8(), 0L, false, 0L, unVar3.a9(), unVar3.f42459w5, null, false);
                F6();
                if (i10 != 0) {
                    if (this.f42260g4 == -1) {
                        this.f42260g4 = 0;
                    }
                    this.f42260g4 = arrayList.size() + this.f42260g4;
                    Yc(true);
                }
            }
        }
    }

    public final void l9(boolean z10) {
        int i10;
        int i11;
        if (this.f42248f4 == 7) {
            org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(this.currentAccount);
            int i12 = this.classGuid;
            int i13 = this.J3;
            if (z10) {
                i11 = 1;
            } else {
                i11 = -1;
            }
            int i14 = i13 + i11;
            org.telegram.messenger.na b10 = a2.b(this.f42210c4);
            if (i14 >= 0 && i14 < b10.f17068a.size()) {
                b10.f17076l = i14;
                org.telegram.messenger.zs.f(a2.f17244a).k(org.telegram.messenger.zs.I0, Integer.valueOf(i12), Integer.valueOf(b10.f17077m), Boolean.valueOf(b10.f17078n), Integer.valueOf(b10.b()), Integer.valueOf(b10.f17076l), Integer.valueOf(((org.telegram.messenger.jj) b10.f17068a.get(i14)).f16337k.f19814id));
                return;
            }
            return;
        }
        org.telegram.messenger.ui mediaDataController = getMediaDataController();
        long j10 = this.f42297j6;
        long j11 = this.f42199b7;
        int i15 = this.classGuid;
        boolean z11 = this.f42302jb;
        if (!z10 ? !z11 : z11) {
            i10 = 2;
        } else {
            i10 = 1;
        }
        mediaDataController.X1(null, j10, j11, i15, i10, this.f42394r4, false, this.C3, this.D3, true, this.E3);
        ec(false);
    }

    public final void lb() {
        mb(false, null);
    }

    public final void lc(View view, CharSequence charSequence, boolean z10) {
        org.telegram.ui.Components.q30 q30Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((q30Var = this.A2) != null && q30Var.getVisibility() == 0)) {
                this.A2.setText(org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SlowModeHint", null, 2131745329, charSequence)));
                if (z10) {
                    this.A2.f(view, true);
                }
            }
        }
    }

    public final void ld(boolean r50) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.ld(boolean):void");
    }

    @Override
    public final void m(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i10, long j10, boolean z11, long j11) {
        boolean z12;
        String str2 = null;
        u8(str, null);
        if (n7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(str, this.f42297j6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b10.K = P8();
                z12 = z11;
                b10.L = z12;
                b10.Q = j11;
                b10.R = a9();
                b10.T = this.f42459w5;
                org.telegram.messenger.qz.C(this.currentAccount).r0(b10);
            } else {
                z12 = z11;
                str2 = str;
            }
            getSendMessagesHelper().q0(arrayList3, this.f42297j6, false, false, true, 0, 0, null, -1, j11, a9(), this.f42459w5);
            org.telegram.messenger.c accountInstance = getAccountInstance();
            long j12 = this.f42297j6;
            org.telegram.messenger.jj jjVar = this.D5;
            org.telegram.messenger.jj jjVar2 = this.l4;
            kn knVar = this.B5;
            String str3 = str2;
            org.telegram.messenger.qz.V(i10, j12, j10, j11, a9(), null, str3, null, arrayList, arrayList, null, arrayList2, null, null, null, accountInstance, jjVar, jjVar2, this.F5, this.f42459w5, P8(), null, knVar, z10, z12);
            F6();
        }
    }

    public final boolean m7(View view) {
        CharSequence slowModeTimer = this.Z.getSlowModeTimer();
        if (slowModeTimer != null) {
            lc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void m8(View view) {
        n8(view, false);
    }

    public final void m9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.m9():void");
    }

    public final void ma(long j10, String str, boolean z10) {
        na();
        ag.v vVar = this.X1;
        if (vVar != null) {
            vVar.B1(j10, str, z10, false);
        }
    }

    public final void mb(boolean z10, me meVar) {
        ArrayList arrayList;
        int i10;
        if (this.f42492z0.V1) {
            return;
        }
        this.Z4 = 0;
        this.Lb = 0;
        this.f42183a5 = false;
        this.f42313k9.f(0);
        if (this.U6[0] && this.X7 == 0 && this.K7 == 0) {
            this.f42468x1.d(false);
            if (this.B0.I0() == 0) {
                this.f42501z9 = false;
                Pc();
                Xa();
                sd(false);
                return;
            }
            this.C0.T();
            gn gnVar = this.f42254fb;
            gnVar.f37597a = null;
            int i11 = 0;
            while (true) {
                arrayList = this.K6;
                if (i11 >= arrayList.size() || !((org.telegram.messenger.jj) arrayList.get(i11)).r4()) {
                    break;
                }
                i11++;
                z10 = false;
            }
            if (z10 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i11) != null) {
                long d12 = ((org.telegram.messenger.jj) arrayList.get(i11)).d1();
                while (d12 != 0 && (i10 = i11 + 1) < arrayList.size() && d12 == ((org.telegram.messenger.jj) arrayList.get(i10)).d1()) {
                    i11 = i10;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i11 = Math.min(i11, arrayList.size() - 1);
            }
            sk skVar = this.f42313k9;
            gnVar.f37598b = i11;
            gnVar.d = 0;
            boolean z11 = !z10;
            gnVar.f37599c = z11;
            skVar.d(i11, 0, z11, true);
            this.f42501z9 = false;
            Pc();
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = this.Kb;
        if (x1Var != null) {
            x1Var.dismiss();
        }
        Rc(false);
        if (meVar != null) {
            meVar.run();
        } else {
            bb();
            org.telegram.ui.ActionBar.x1 x1Var2 = new org.telegram.ui.ActionBar.x1(3, getParentActivity(), this.f42477xa);
            this.Kb = x1Var2;
            x1Var2.setOnCancelListener(this.Fa);
            this.Kb.r(1000L);
        }
        this.f42336m9 = this.f42321l6;
        this.f42363o9 = false;
        this.f42350n9 = 0;
        this.p9 = false;
        ArrayList arrayList2 = this.f42473x6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f42321l6));
        org.telegram.messenger.i0.h3(new mf(this, 14), 0L);
    }

    public final void mc(org.telegram.messenger.oj ojVar) {
        if (this.F5 == null) {
            return;
        }
        new rh.e0(getParentActivity(), this.currentAccount, this.f42297j6, ojVar, this, getResourceProvider(), 0, new ze(this, 0)).show();
    }

    public final void md() {
        int i10;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.r0 r0Var = this.f42441v0;
        if (r0Var != null) {
            TLRPC.Chat chat = this.e;
            if (chat != null && org.telegram.messenger.w3.i(this.currentAccount, chat, this.f42382q4) && (tL_forumTopic = this.f42382q4) != null && !tL_forumTopic.closed) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            r0Var.e(i10);
        }
    }

    public final boolean n7() {
        CharSequence slowModeTimer = this.Z.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String L0 = org.telegram.messenger.cd.L0(2131745328, null);
        org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
        x1Var.R = L0;
        x1Var.T = org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0("SlowModeHint", null, 2131745329, slowModeTimer));
        i0.a.w(null, 2131747847, alertDialog$Builder, null);
        return false;
    }

    public final void n8(View view, boolean z10) {
        boolean z11;
        Gb(view);
        if (view != this.f42468x1) {
            z11 = true;
        } else {
            z11 = false;
        }
        o8(z10, z11, 0.2f);
    }

    public final boolean n9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f42333m6;
        for (int i10 = 0; i10 < sparseArrayArr.length; i10++) {
            try {
                for (int i11 = 0; i11 < sparseArrayArr[i10].size(); i11++) {
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[i10].valueAt(i11);
                    if (jjVar != null && (message = jjVar.f16337k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void na() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            mk mkVar = this.Z;
            if (mkVar == null || TextUtils.isEmpty(mkVar.getSlowModeTimer())) {
                mk mkVar2 = this.Z;
                if (mkVar2 != null && mkVar2.f23750m5.f7021f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                M7();
                ag.v vVar = this.X1;
                if (!z10 && this.f42248f4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                vVar.L3 = z11;
                vVar.a2.g0();
                TLRPC.Chat chat = this.e;
                if ((chat == null || this.f42459w5 == null) && !z10 && this.f42248f4 != 9) {
                    if (chat != null && !org.telegram.messenger.w3.N(chat) && this.e.slowmode_enabled) {
                        this.X1.x1(10, true);
                    } else {
                        this.X1.x1(-1, true);
                    }
                } else {
                    this.X1.x1(1, true);
                }
                ag.v vVar2 = this.X1;
                vVar2.M2 = true;
                vVar2.f24718r3.setVisibility(0);
                vVar2.K2 = 0;
                vVar2.f24736w1 = false;
                vVar2.f24740x1 = false;
                vVar2.Z1 = true;
                vVar2.A1 = null;
                org.telegram.ui.ActionBar.t0 t0Var = vVar2.f24671e3;
                if (t0Var != null) {
                    vVar2.f24668d3.setTranslationY(0.0f);
                    t0Var.setVisibility(8);
                }
                this.X1.d1();
                this.X1.Z0().setText(this.Z.getFieldText());
                ag.v vVar3 = this.X1;
                vVar3.f24708p1 = this.f42477xa;
                showDialog(vVar3);
            }
        }
    }

    public final void nb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.nb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void nc(org.telegram.messenger.jj jjVar) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().z2(org.telegram.messenger.jj.B0(jjVar.f16337k))) {
            TLRPC.Message message = jjVar.f16337k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = jjVar.f16397z2;
                boolean z10 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = jjVar.v;
                    if (jjVar.f16397z2.size() > 1) {
                        z10 = true;
                    }
                } else {
                    charSequence = jjVar.f16394z;
                }
                if (!z10 && charSequence != null) {
                    z10 = true;
                }
                if (z10 && org.telegram.messenger.tz.J <= 2 && !this.B9 && this.C9 <= this.Z.getTop() - org.telegram.messenger.i0.L(60.0f)) {
                    this.B9 = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.vp.d1().edit();
                    int i10 = org.telegram.messenger.tz.J + 1;
                    org.telegram.messenger.tz.J = i10;
                    edit.putInt("textSelectionHintShows", i10);
                    edit.apply();
                    if (this.A9 == null) {
                        ql qlVar = new ql(getParentActivity(), this.f42477xa, this);
                        this.A9 = qlVar;
                        this.l1.addView(qlVar, w7.b6.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.A9.c();
                }
            }
        }
    }

    public final void nd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        qj qjVar = this.f42355o1;
        if (qjVar != null && (tL_forumTopic = this.f42382q4) != null) {
            qjVar.setTitle(tL_forumTopic.title);
        }
        od();
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f42248f4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((k2Var instanceof un) && ((un) k2Var).J9()) {
                return false;
            }
        }
        return this.X6;
    }

    @Override
    public final void o(ArrayList arrayList, boolean z10, int i10, long j10) {
        u8(((org.telegram.messenger.pz) arrayList.get(0)).d, ((org.telegram.messenger.pz) arrayList.get(0)).f17518i);
        org.telegram.messenger.qz.X(getAccountInstance(), arrayList, this.f42297j6, this.D5, this.l4, null, this.B5, true, false, this.F5, null, z10, i10, 0, ((org.telegram.messenger.pz) arrayList.get(0)).f17529t, null, P8(), 0L, false, j10, a9(), this.f42459w5, null, false);
        F6();
        if (i10 != 0) {
            if (this.f42260g4 == -1) {
                this.f42260g4 = 0;
            }
            this.f42260g4 = arrayList.size() + this.f42260g4;
            Yc(true);
        }
    }

    public final void o7(Runnable runnable, sf.a aVar, boolean z10) {
        if (aVar != null && z10) {
            p1 p1Var = new p1(this, aVar, runnable, 20);
            rh.e6 x10 = rh.e6.x(this.currentAccount, aVar.f48254a);
            if (!x10.e) {
                x10.q(p1Var, true, true);
                return;
            } else {
                p1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void o8(boolean z10, boolean z11, float f7) {
        boolean z12;
        ValueAnimator ofFloat;
        bh.k kVar;
        org.telegram.ui.Cells.q1 q1Var;
        if (f7 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.X8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            q1Var2.setInvalidatesParent(z12);
            if (z12) {
                cb(q1Var2);
            }
        }
        this.l1.invalidate();
        this.f42492z0.invalidate();
        AnimatorSet animatorSet = this.f42228d9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f42228d9.cancel();
        }
        this.f42228d9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.V8, f7);
        float f10 = 1.0f;
        if (z12) {
            this.Y8 = 1.0f;
            this.Z8 = 0.0f;
            ValueAnimator valueAnimator = this.f42465wc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.W8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f7);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.nl0.d(new ye(this, 3));
            }
        } else {
            float f11 = this.V8;
            this.Z8 = f11 / max;
            this.W8 = false;
            ofFloat = ValueAnimator.ofFloat(f11, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new eg(this, max, 0));
        if ((!z12 || z11) && (kVar = this.f42468x1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f10 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(kVar, property, f10));
        }
        this.f42228d9.playTogether(arrayList);
        this.f42228d9.setInterpolator(org.telegram.ui.Components.gr.h);
        this.f42228d9.setDuration(320L);
        View view2 = this.X8;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view2;
        } else {
            q1Var = null;
        }
        this.f42228d9.addListener(new androidx.fragment.app.g(this, z12, q1Var, 3));
        if (this.X8 != null && this.Y8 <= 0.0f) {
            Gb(null);
        }
        this.f42228d9.start();
    }

    public final boolean o9() {
        lm lmVar = this.f42386q9;
        if (lmVar != null && lmVar.x()) {
            return true;
        }
        return false;
    }

    public final void oa() {
        lt.p().T = null;
        if (getParentActivity() == null) {
            return;
        }
        M7();
        this.X1.a2.g0();
        this.X1.x1(1, false);
        ag.v vVar = this.X1;
        vVar.O3 = true;
        vVar.V0(null);
        this.X1.d1();
        ag.v vVar2 = this.X1;
        vVar2.f24708p1 = this.f42477xa;
        if (this.visibleDialog != null) {
            vVar2.show();
        } else {
            showDialog(vVar2);
        }
    }

    public final void ob(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.ob(java.lang.CharSequence, boolean):void");
    }

    public final void oc(boolean z10, boolean z11) {
        mk mkVar;
        int i10;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.G2 != null) && this.f42248f4 == 0 && (mkVar = this.Z) != null && mkVar.getAudioVideoButtonContainer() != null && this.Z.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.G2 == null) {
                    km kmVar = this.l1;
                    int indexOfChild = kmVar.indexOfChild(this.T);
                    if (indexOfChild != -1) {
                        org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(9, getParentActivity(), this.f42477xa, false);
                        this.G2 = q30Var;
                        kmVar.addView(q30Var, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 10.0f, 0.0f, 10.0f, 0.0f));
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.G2.b(true);
                    return;
                }
                if (this.Z.f23701e2) {
                    org.telegram.ui.Components.q30 q30Var2 = this.G2;
                    if (z11) {
                        i10 = 2131749299;
                    } else {
                        i10 = 2131749301;
                    }
                    q30Var2.setText(org.telegram.messenger.cd.L0(i10, null));
                } else {
                    this.G2.setText(org.telegram.messenger.cd.L0(2131749300, null));
                }
                this.G2.f(this.Z.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void od() {
        qj qjVar;
        qj qjVar2;
        if (org.telegram.messenger.h20.u(this.f42243f) && (qjVar2 = this.f42355o1) != null) {
            qjVar2.getAvatarImageView().setVisibility(0);
            this.f42355o1.b();
        } else if (this.f42382q4 != null && (qjVar = this.f42355o1) != null) {
            qjVar.getAvatarImageView().setVisibility(0);
            gg.e.p(this.f42355o1.getAvatarImageView(), this.f42382q4, true, true, this.f42477xa);
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.j50 j50Var;
        org.telegram.ui.ActionBar.x1 x1Var;
        org.telegram.ui.Components.se seVar;
        org.telegram.ui.ActionBar.x1 x1Var2;
        org.telegram.ui.Components.qe qeVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        lm lmVar;
        sg.q qVar;
        org.telegram.ui.ActionBar.s5 s5Var;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null && lVar.getOpenMenuOverlay() != null) {
            if (z10 && (s5Var = this.actionBar.Y0) != null) {
                s5Var.a(true);
                return false;
            }
        } else {
            org.telegram.ui.Components.t11 t11Var = this.m0;
            if (t11Var != null && t11Var.D > 0.0f) {
                if (z10) {
                    t11Var.b();
                    return false;
                }
            } else {
                org.telegram.ui.Components.wb wbVar = org.telegram.ui.Components.wb.f32128w;
                if (wbVar != null) {
                    org.telegram.ui.Components.bb bbVar = wbVar.e;
                    if (bbVar instanceof org.telegram.ui.Components.hb) {
                        if (z10) {
                            ((org.telegram.ui.Components.hb) bbVar).f();
                            wbVar.b();
                            return false;
                        }
                    }
                }
                i11 i11Var = this.f42413sa;
                if (i11Var != null && !i11Var.f38085b0) {
                    if (z10) {
                        i11Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z10) {
                        closeSheet();
                        return false;
                    }
                } else {
                    sg.s sVar = this.f42400ra;
                    if (sVar != null && (qVar = sVar.f48466b) != null && qVar.getReactionsWindow() != null) {
                        if (z10) {
                            sVar.f48466b.e();
                            return false;
                        }
                    } else if (lt.p().E) {
                        if (z10) {
                            lt.p().n();
                            return false;
                        }
                    } else {
                        hl hlVar = this.Ya;
                        if (hlVar != null && hlVar.f24358s) {
                            if (z10) {
                                hlVar.a(true);
                                return false;
                            }
                        } else if (this.Uc.f7021f) {
                            if (z10) {
                                ec(false);
                                return false;
                            }
                        } else if (this.f42240e9 != null) {
                            if (z10) {
                                I7(true);
                                return false;
                            }
                        } else if (!f7(z10, false)) {
                            if (o9()) {
                                if (z10 && (lmVar = this.f42386q9) != null && lmVar.x()) {
                                    this.f42386q9.f(false);
                                    return false;
                                }
                            } else {
                                org.telegram.ui.ActionBar.l lVar2 = this.actionBar;
                                if (lVar2 != null && lVar2.u()) {
                                    if (z10) {
                                        H7(false);
                                        return false;
                                    }
                                } else {
                                    mk mkVar = this.Z;
                                    if (mkVar != null && mkVar.q0() && (mkVar.f23708f2 != 1 || (tL_replyKeyboardMarkup = mkVar.f23754n2) == null || !tL_replyKeyboardMarkup.is_persistent || mkVar.f23747m2 == null)) {
                                        if (z10) {
                                            this.Z.i0(true);
                                            return false;
                                        }
                                    } else {
                                        mk mkVar2 = this.Z;
                                        if (mkVar2 != null && mkVar2.r()) {
                                            if (z10) {
                                                mk mkVar3 = this.Z;
                                                xh.w wVar = mkVar3.f23742l0;
                                                if (wVar != null) {
                                                    wVar.setOpened(false);
                                                }
                                                if (!mkVar3.f0() && (qeVar = mkVar3.m0) != null) {
                                                    qeVar.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            mk mkVar4 = this.Z;
                                            if (mkVar4 != null && (seVar = mkVar4.E0) != null && (x1Var2 = seVar.V1) != null && x1Var2.isShowing()) {
                                                if (z10) {
                                                    seVar.V1.dismiss();
                                                    return false;
                                                }
                                            } else if (this.f42248f4 == 6 && (x1Var = ag.i0.e) != null && x1Var.isShowing()) {
                                                if (z10) {
                                                    ag.i0.e.dismiss();
                                                    return false;
                                                }
                                            } else if (org.telegram.messenger.w3.p0(this.e) && !this.f42271h4 && this.f42246f2 != null && b() != 0) {
                                                if (z10) {
                                                    this.f42246f2.n(0L, this.F7);
                                                    return false;
                                                }
                                            } else if (this.f42248f4 == 5 && !"hello".equalsIgnoreCase(this.f42236e4) && !"away".equalsIgnoreCase(this.f42236e4) && (this.K6.isEmpty() || this.f42394r4 == 0)) {
                                                if (z10) {
                                                    jc();
                                                    return false;
                                                }
                                            } else if (this.f42248f4 == 6 && this.Z.s()) {
                                                if (z10) {
                                                    Pb(new mf(this, 20));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.l lVar3 = this.actionBar;
                                                if (lVar3 != null && lVar3.f20497n0) {
                                                    if (z10) {
                                                        lVar3.k(true);
                                                        return false;
                                                    }
                                                } else if (this.Sc.f7021f) {
                                                    if (z10) {
                                                        Ia();
                                                    }
                                                } else {
                                                    if (z10 && (j50Var = this.f42370p3) != null) {
                                                        j50Var.a(false);
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
        }
        return false;
    }

    @Override
    public final void onBecomeFullyHidden() {
        ArrayList arrayList;
        x9();
        if (!getMessagesController().A3() && getMessagesController().f18907t4 <= 0 && getMessagesController().f18822j7 < 2 && !getUserConfig().q() && (arrayList = this.K6) != null) {
            for (int i10 = 0; i10 < arrayList.size(); i10++) {
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) arrayList.get(i10);
                if (jjVar != null && !jjVar.P3() && ((org.telegram.messenger.jj.R4(jjVar.f16337k) || jjVar.h4()) && !jjVar.F4() && (jjVar.f16337k.media_unread || org.telegram.messenger.w3.V(this.e)))) {
                    org.telegram.ui.Components.u21.r(jjVar, false);
                }
            }
        }
        this.T3 = false;
        y9();
        ArrayList arrayList2 = org.telegram.ui.Components.u21.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        gf.e eVar = this.Vb;
        if (eVar != null) {
            eVar.a(false);
            this.Vb = null;
        }
        this.S3.e();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.T3 = true;
        super.onBecomeFullyVisible();
        if (this.P) {
            showDialog(this.O);
        }
        if (this.zb) {
            mk mkVar = this.Z;
            if (mkVar != null) {
                mkVar.G0();
                mk mkVar2 = this.Z;
                mkVar2.T0 = false;
                org.telegram.ui.Components.gf gfVar = mkVar2.U0;
                if (gfVar != null) {
                    gfVar.u(false);
                }
            }
            this.zb = false;
        }
        if (this.J1 != null) {
            org.telegram.messenger.i0.h3(new me(this, 1), 600L);
        }
        if (this.F4 && !this.G4) {
            this.G4 = true;
            org.telegram.ui.Components.wb I = org.telegram.ui.Components.cc.a0(this).I(2131623992, org.telegram.messenger.cd.L0(2131743623, null), org.telegram.messenger.cd.L0(2131743625, null));
            I.f32135j = 5000;
            I.v = new me(this, 2);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        sg.s sVar = this.f42400ra;
        if (sVar != null && sVar.d()) {
            this.f42400ra.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.jj jjVar;
        long j10;
        long j11;
        qj qjVar = this.f42355o1;
        if (qjVar != null) {
            ViewTreeObserver viewTreeObserver = qjVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new gi(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        I7(true);
        if (!org.telegram.messenger.i0.Q1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.F1() || !PhotoViewer.v1().U1()) && (jjVar = MediaController.B().f14482u0) != null && org.telegram.messenger.jj.L4(jjVar.f16337k)) {
                    PhotoViewer.v1().N2(null, this, this.f42477xa);
                    getFileLoader().d0(jjVar.F0(), false);
                    MediaController.B().q(true, true, false, true);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i10 = jjVar.D;
                    long j12 = 0;
                    if (i10 != 0) {
                        j10 = this.f42297j6;
                    } else {
                        j10 = 0;
                    }
                    if (i10 != 0) {
                        j11 = this.f42199b7;
                    } else {
                        j11 = 0;
                    }
                    if (i10 != 0) {
                        j12 = b();
                    }
                    if (v12.h2(jjVar, null, null, null, null, null, null, 0, this.Za, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.v1().l4 = this;
                    }
                    u9(false);
                    MediaController.B().f14484v0 = null;
                }
            } else if (PhotoViewer.F1() && PhotoViewer.v1().f33533l2) {
                PhotoViewer v13 = PhotoViewer.v1();
                if (v13.F2.d0()) {
                    if (v13.Z2) {
                        v13.F2.s0(false);
                    }
                    MediaController B = MediaController.B();
                    org.telegram.ui.Components.u61 u61Var = v13.F2;
                    org.telegram.messenger.jj jjVar2 = v13.T4;
                    if (u61Var != null && jjVar2 != null) {
                        int i11 = jjVar2.I1;
                        org.telegram.messenger.b8.G(i11).d0(jjVar2.F0(), true);
                        B.F0 = false;
                        B.r();
                        B.E0 = u61Var;
                        B.f14482u0 = jjVar2;
                        int i12 = B.m0 + 1;
                        B.m0 = i12;
                        u61Var.J = new org.telegram.messenger.le(B, i12, jjVar2, 1);
                        B.P0 = false;
                        TextureView textureView = B.G0;
                        if (textureView != null) {
                            u61Var.A0(textureView);
                        }
                        B.j(jjVar2);
                        B.n0();
                        B.f14453g0 = false;
                        org.telegram.messenger.jj jjVar3 = B.f14482u0;
                        B.f14482u0 = jjVar2;
                        if (!org.telegram.messenger.tz.k(true)) {
                            B.w0(B.f14477s);
                        }
                        B.v0(B.f14482u0);
                        org.telegram.messenger.zs.f(i11).k(org.telegram.messenger.zs.f19622h2, jjVar2, jjVar3);
                    }
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
        ci ciVar = this.f42375pa;
        float f7 = 0.0f;
        if (z10 && this.f42314ka && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (k2Var instanceof un) {
                this.P4 = true;
                un unVar = (un) k2Var;
                unVar.f42337ma = this;
                this.fragmentView.setAlpha(0.0f);
                this.l1.setSkipBackgroundDrawing(true);
                this.f42355o1.setTranslationY(org.telegram.messenger.i0.L(8.0f));
                this.f42355o1.getAvatarImageView().setAlpha(0.0f);
                this.f42355o1.getAvatarImageView().setTranslationY(-org.telegram.messenger.i0.L(8.0f));
                this.f42325la = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                mk mkVar = this.Z;
                if (mkVar != null) {
                    mkVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.f16026q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                pk pkVar = this.S;
                if (pkVar != null) {
                    pkVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.i0.f16026q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                mk mkVar2 = this.Z;
                if (mkVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = mkVar2.getMeasuredHeight();
                }
                pk pkVar2 = this.S;
                if (pkVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = pkVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                mk mkVar3 = unVar.Z;
                if (mkVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = mkVar3.getMeasuredHeight();
                }
                pk pkVar3 = this.S;
                if (pkVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = pkVar3.getMeasuredHeight();
                }
                this.ha = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ag.p2(9, this, unVar));
                Dc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f42364oa = animatorSet;
                animatorSet.addListener(new ci.k(this, unVar, runnable));
                this.f42364oa.setDuration(300L);
                this.f42364oa.setInterpolator(org.telegram.ui.Components.gr.f26495f);
                this.f42364oa.playTogether(ofFloat2);
                org.telegram.messenger.i0.h3(ciVar, 200L);
                return this.f42364oa;
            }
        }
        if (this.Ca && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (k2Var2 instanceof pb1) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                k2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f7 = 1.0f;
                }
                this.Ea = f7;
                ofFloat.addUpdateListener(new cj(0, this));
                this.Da = true;
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.invalidate();
                }
                km kmVar = this.l1;
                if (kmVar != null) {
                    kmVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f42364oa = animatorSet2;
                animatorSet2.addListener(new dj(this, z10, runnable));
                this.f42364oa.setDuration(150L);
                this.f42364oa.playTogether(ofFloat);
                if (z10) {
                    org.telegram.messenger.i0.h3(ciVar, 200L);
                } else {
                    this.f42364oa.start();
                }
                return this.f42364oa;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.x1 x1Var = this.O;
        if (x1Var != null && dialog == x1Var) {
            getMessagesController().X(0, this.f42297j6, false);
            org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
            if (z4Var != null && !z4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.k2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
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
        org.telegram.ui.Components.rt0 rt0Var;
        super.onFragmentDestroy();
        zg.d dVar = this.f42196b4;
        if (dVar != null) {
            LongSparseArray longSparseArray = dVar.f55739x;
            int size = longSparseArray.size();
            for (int i10 = 0; i10 < size; i10++) {
                zg.c cVar = (zg.c) longSparseArray.valueAt(i10);
                if (cVar.f55726i) {
                    dVar.f55738w.add(cVar.a());
                }
            }
            if (org.telegram.messenger.v2.f18448a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            dVar.a();
        }
        mk mkVar = this.Z;
        if (mkVar != null) {
            mkVar.z0();
        }
        qj qjVar = this.f42355o1;
        if (qjVar != null && (rt0Var = qjVar.f30271c0) != null) {
            rt0Var.b(qjVar.G);
        }
        ek ekVar = this.W1;
        if (ekVar != null && ekVar.getAdapter() != null) {
            this.W1.getAdapter().P();
        }
        ag.v vVar = this.X1;
        if (vVar != null) {
            vVar.L();
        }
        lt p5 = lt.p();
        if (p5.f39396l == this.D9) {
            p5.W = null;
            p5.f39384a0 = null;
            p5.Y = null;
            p5.f39396l = null;
            p5.f39388c0 = null;
            p5.t();
        }
        getNotificationCenter().j(this.Y9);
        org.telegram.messenger.zs.e().j(this.Z9);
        getNotificationCenter().j(this.f42188aa);
        getNotificationCenter().j(this.f42202ba);
        y9();
        me meVar = this.f42198b6;
        if (meVar != null) {
            org.telegram.messenger.i0.r(meVar);
            this.f42198b6 = null;
        }
        org.telegram.messenger.zs notificationCenter = getNotificationCenter();
        zk zkVar = this.Ga;
        notificationCenter.getClass();
        boolean z11 = org.telegram.messenger.v2.f18448a;
        if (Thread.currentThread() == org.telegram.messenger.w0.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(zkVar)) {
                notificationCenter.o();
            }
            org.telegram.messenger.vp messagesController = getMessagesController();
            long j10 = this.f42297j6;
            if (this.f42248f4 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            messagesController.H4(j10, z10, false);
            xa.n nVar = this.f42326lb;
            if (nVar != null) {
                nVar.a();
                this.f42326lb = null;
            }
            getNotificationCenter().n(this, org.telegram.messenger.zs.f19690t);
            if (this.f42248f4 == 0 && org.telegram.messenger.i0.Q1()) {
                getNotificationCenter().k(org.telegram.messenger.zs.f19620h0, Long.valueOf(this.f42297j6), Long.valueOf(b()), Boolean.TRUE);
            }
            if (this.f42243f != null) {
                MediaController B = MediaController.B();
                if (B.R1 == null) {
                    B.R1 = new androidx.emoji2.text.j(B);
                }
                B.R1.f1386b = 0;
                org.telegram.messenger.w0.d.postDelayed(B.R1, 5000L);
            }
            org.telegram.messenger.o6 o6Var = this.S3;
            if (o6Var != null) {
                o6Var.e();
            }
            if (this.f42243f != null) {
                getMessagesController().f18876q1.remove(Long.valueOf(this.f42243f.f19942id));
            }
            org.telegram.messenger.i0.B2(getParentActivity(), this.classGuid);
            ag.v vVar2 = this.X1;
            if (vVar2 != null) {
                vVar2.i1();
                this.X1 = null;
            }
            org.telegram.messenger.i0.P3(getParentActivity());
            if (org.telegram.messenger.w3.T(this.e)) {
                getMessagesController().S4(this.e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.f42374p8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().S4(getMessagesController().L0(Long.valueOf(this.f42374p8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            lm lmVar = this.f42386q9;
            if (lmVar != null) {
                lmVar.f(false);
            }
            xj xjVar = this.A0;
            if (xjVar != null) {
                xjVar.N();
            }
            uk ukVar = this.Pa;
            if (ukVar != null) {
                ukVar.b();
            }
            this.ua = null;
            org.telegram.ui.ActionBar.z4 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f42176hd ? 1 : 0);
                org.telegram.ui.ActionBar.z4 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i11 = 0;
                    while (i11 < parentLayout2.getPulledDialogs().size()) {
                        if (((org.telegram.ui.Components.x8) parentLayout2.getPulledDialogs().get(i11)).f32424b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i11);
                            i11--;
                        }
                        i11++;
                    }
                }
            }
            f42176hd = false;
            gf.e eVar = this.Vb;
            if (eVar != null) {
                eVar.a(false);
                this.Vb = null;
            }
            org.telegram.messenger.l3 l3Var = this.f42502za;
            un unVar = l3Var.f16685a;
            ArrayList arrayList = l3Var.f16688f;
            ArrayList arrayList2 = l3Var.e;
            for (int i12 = 0; i12 < arrayList2.size(); i12++) {
                unVar.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i12)).intValue(), false);
            }
            arrayList2.clear();
            for (int i13 = 0; i13 < arrayList.size(); i13++) {
                unVar.getConnectionsManager().cancelRequest(((Integer) arrayList.get(i13)).intValue(), false);
            }
            arrayList.clear();
            ly0 ly0Var = this.f42411s8;
            if (ly0Var != null) {
                ly0Var.b(true);
                this.f42411s8 = null;
            }
            rh.i4 i4Var = this.Lc;
            if (i4Var != null) {
                i4Var.setMessageCell(null);
                org.telegram.messenger.i0.E2(this.Lc);
                this.Lc = null;
                return;
            }
            return;
        }
        throw new RuntimeException("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Fb = true;
        org.telegram.messenger.jj jjVar = MediaController.B().f14482u0;
        if (jjVar != null && org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            MediaController.B().q(true, true, false, false);
        } else {
            MediaController.B().p0(this.K8, null, null, false);
        }
        rh.i4 i4Var = this.Lc;
        if (i4Var != null) {
            i4Var.setMessageCell(null);
            org.telegram.messenger.i0.E2(this.Lc);
            this.Lc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i10, String[] strArr, int[] iArr) {
        ag.v vVar;
        ag.v vVar2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.bi biVar;
        mk mkVar = this.Z;
        boolean z12 = false;
        if (mkVar != null && i10 == 2 && mkVar.f23733j3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                org.telegram.messenger.qz.C(mkVar.Q).o0(mkVar.f23727i3, mkVar.f23733j3);
            }
            mkVar.f23733j3 = null;
            mkVar.f23727i3 = null;
        }
        ek ekVar = this.W1;
        if (ekVar != null && ekVar.getAdapter() != null) {
            zf.x0 adapter = this.W1.getAdapter();
            if (i10 == 2) {
                TLRPC.User user = adapter.f55672w0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.I0.B();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i10 == 4) {
            ag.v vVar3 = this.X1;
            if (vVar3 != null) {
                vVar3.a2.Z();
            }
            org.telegram.ui.Components.dp dpVar = this.ua;
            if (dpVar != null && (biVar = dpVar.O1) != null) {
                biVar.a2.Z();
            }
        } else if ((i10 == 5 || i10 == 30) && (vVar = this.X1) != null) {
            if (i10 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                vVar.p1();
            }
        } else if ((i10 == 17 || i10 == 18) && (vVar2 = this.X1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = vVar2.a2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.V(z12);
            this.X1.a2.Z();
        } else if (i10 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f42477xa);
                String L0 = org.telegram.messenger.cd.L0(2131689472, null);
                org.telegram.ui.ActionBar.x1 x1Var = alertDialog$Builder.f20134a;
                x1Var.R = L0;
                x1Var.T = org.telegram.messenger.cd.L0(2131747328, null);
                alertDialog$Builder.h(org.telegram.messenger.cd.L0(2131747316, null), new th(this));
                alertDialog$Builder.k(org.telegram.messenger.cd.L0(2131747847, null), null);
                alertDialog$Builder.p();
            }
        } else if (i10 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Pa(0);
        } else if (i10 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Pa(2);
        } else if (((i10 != 101 && i10 != 102) || this.f42243f == null) && (i10 != 103 || this.e == null)) {
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
                    org.telegram.ui.Components.voip.m1.l(this.e, null, this.f42362o8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f42243f;
                if (i10 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f42385q8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.m1.m(user2, z11, z12, getParentActivity(), getMessagesController().a2(this.f42243f.f19942id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.m1.h(getParentActivity(), null, i10);
        }
    }

    @Override
    public final void onResume() {
        boolean z10;
        TLRPC.Chat chat;
        mk mkVar;
        ArrayList<TLRPC.MessageEntity> arrayList;
        ArrayList<TLRPC.MessageEntity> arrayList2;
        org.telegram.messenger.jj jjVar;
        boolean z11;
        org.telegram.ui.Components.g9[] g9VarArr;
        jg.l0 l0Var;
        super.onResume();
        l7();
        this.X9 = System.currentTimeMillis();
        if (this.K9 && getSendMessagesHelper().B(this.f42297j6) != null) {
            org.telegram.ui.Components.d40 d40Var = new org.telegram.ui.Components.d40(getParentActivity(), null, this, this.f42477xa);
            d40Var.H0 = new qe(this, 0);
            showDialog(d40Var);
            this.K9 = false;
        }
        P6();
        MediaController.B().w0(this);
        e7();
        ag.v vVar = this.X1;
        if (vVar != null) {
            vVar.l1();
        }
        km kmVar = this.l1;
        boolean z12 = true;
        if (kmVar != null) {
            org.telegram.ui.Components.z71 z71Var = kmVar.f31060w;
            if (z71Var != null) {
                z71Var.c(true);
            }
            kmVar.F = false;
        }
        if (getMessagesController().U3.contains("NEWCOMER_TICKS")) {
            org.telegram.messenger.i0.h3(new me(this, 26), 1000L);
        }
        z8 z8Var = new z8(this, 2);
        this.f42440uc = z8Var;
        setBulletinDelegate(z8Var);
        O6(false);
        TLRPC.PhotoSize photoSize = this.M5;
        if (photoSize != null && (l0Var = this.f42192b0) != null) {
            ((org.telegram.ui.Components.io[]) l0Var.f10084b)[0].f27046f.g(this.L5, this.K5, this.D5, "50_50", "50_50_b", null, org.telegram.messenger.ic.f(photoSize, this.O5), org.telegram.messenger.ic.f(this.N5, this.O5));
        }
        if (this.S5 != null && (g9VarArr = this.P2) != null) {
            g9VarArr[0].g(this.Q5, this.P5, (org.telegram.messenger.jj) this.V4.get(Integer.valueOf(this.X4)), "50_50", "50_50_b", null, org.telegram.messenger.ic.f(this.S5, this.U5), org.telegram.messenger.ic.f(this.T5, this.U5));
            g9VarArr[0].setHasBlur(this.R5);
        }
        if (this.f42248f4 == 0) {
            org.telegram.messenger.ot notificationsController = getNotificationsController();
            long j10 = this.f42297j6;
            long b10 = b();
            notificationsController.getClass();
            org.telegram.messenger.ot.f17304k0.c(new org.telegram.messenger.bt(notificationsController, j10, b10, 0));
        }
        org.telegram.messenger.vp messagesController = getMessagesController();
        long j11 = this.f42297j6;
        if (this.f42248f4 == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        messagesController.I4(j11, z10, true);
        if (this.f42262g6) {
            if (this.f42285i6 && (jjVar = this.f42186a8) != null) {
                if (this.f42492z0 != null) {
                    int i10 = this.f42299j8;
                    if (i10 == -9000) {
                        i10 = X8(jjVar);
                    } else if (i10 == -10000) {
                        i10 = -org.telegram.messenger.i0.L(11.0f);
                    } else {
                        z11 = true;
                        this.B0.i1(this.K6.indexOf(this.f42186a8) + this.C0.J, i10, z11);
                    }
                    z11 = false;
                    this.B0.i1(this.K6.indexOf(this.f42186a8) + this.C0.J, i10, z11);
                }
            } else {
                ea(false);
            }
            this.f42285i6 = false;
            this.f42262g6 = false;
            this.f42186a8 = null;
        }
        this.G5 = false;
        this.H5 = false;
        i7(false);
        if (this.I5) {
            this.I5 = false;
            fm fmVar = this.C0;
            if (fmVar != null) {
                fmVar.O(false);
            }
        }
        qj qjVar = this.f42355o1;
        if (qjVar != null) {
            ViewTreeObserver viewTreeObserver = qjVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new gi(this, viewTreeObserver));
        }
        H6(false, false);
        if (this.Z != null && this.f42248f4 == 0 && this.Ba != null) {
            if (!org.telegram.messenger.d20.i(this.currentAccount).q() && org.telegram.messenger.d20.i(this.currentAccount).e() != this.f42297j6 && (arrayList2 = this.Ba.entities) != null) {
                arrayList = (ArrayList) Collection.EL.stream(arrayList2).filter(new g70(this, 3)).collect(Collectors.toCollection(new org.telegram.messenger.qk(1)));
            } else {
                arrayList = this.Ba.entities;
            }
            CharSequence n10 = ChatActivityEnterView.n(this.Z.getEditField().getPaint().getFontMetricsInt(), this.Ba.message, arrayList);
            if (n10 != null && n10.length() > 0 && n10.charAt(0) == '@') {
                n10 = TextUtils.concat(" ", n10);
            }
            this.Z.d1(n10, true);
            this.Ba = null;
        }
        qk qkVar = this.f42207c1;
        if (qkVar != null && qkVar.getVisibility() != 0 && !this.actionBar.f20497n0 && this.f42248f4 != 7 && !org.telegram.ui.ActionBar.k2.hasSheets(this)) {
            this.Z.setFieldFocused(true);
        }
        mk mkVar2 = this.Z;
        if (mkVar2 != null) {
            mkVar2.C0();
        }
        if (this.f42243f != null) {
            System.currentTimeMillis();
        }
        if (this.G8 != null) {
            org.telegram.messenger.i0.g3(new me(this, 4));
        }
        if (this.f42492z0 != null && ((mkVar = this.Z) == null || !mkVar.o0())) {
            this.f42492z0.setOnItemLongClickListener(this.f42230db);
            this.f42492z0.setOnItemClickListener(this.eb);
            this.f42492z0.setLongClickable(true);
        }
        org.telegram.ui.Components.b51.h = false;
        TLRPC.User user = this.f42243f;
        if (user != null && user.bot) {
            org.telegram.ui.Components.b51.h = !org.telegram.messenger.h20.z(user);
        } else {
            TLRPC.ChatFull chatFull = this.f42374p8;
            if (chatFull instanceof TLRPC.TL_chatFull) {
                int i11 = 0;
                while (true) {
                    if (i11 < this.f42374p8.participants.participants.size()) {
                        TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f42374p8.participants.participants.get(i11).user_id));
                        if (Z1 != null && Z1.bot) {
                            org.telegram.ui.Components.b51.h = true;
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
                org.telegram.ui.Components.b51.h = z12;
            }
        }
        id(false);
        bc();
        if (this.f42266ga != 0.0f) {
            this.f42266ga = 0.0f;
            this.f42492z0.invalidate();
        }
        this.S3.a();
        rh.i4 i4Var = this.Lc;
        if (i4Var != null) {
            i4Var.bringToFront();
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        int i10;
        int themedColor;
        int themedColor2;
        int themedColor3;
        int themedColor4;
        int i11;
        try {
            super.onThemeColorsChanged();
            hi.f fVar = this.I;
            if (fVar != null) {
                Iterator it = fVar.f7723w.iterator();
                while (it.hasNext()) {
                    vg.d dVar = ((vg.f) it.next()).f50842b0;
                    if (dVar != null) {
                        dVar.h = true;
                    }
                }
            }
            hi.f fVar2 = this.J;
            if (fVar2 != null) {
                Iterator it2 = fVar2.f7723w.iterator();
                while (it2.hasNext()) {
                    vg.d dVar2 = ((vg.f) it2.next()).f50842b0;
                    if (dVar2 != null) {
                        dVar2.h = true;
                    }
                }
            }
            Paint paint = this.U8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.t6.f21206s8));
            }
            RadialProgressView radialProgressView = this.f42390r0;
            if (radialProgressView != null) {
                if (G9()) {
                    i11 = org.telegram.ui.ActionBar.t6.Ka;
                } else {
                    i11 = org.telegram.ui.ActionBar.t6.Wc;
                }
                radialProgressView.setProgressColor(getThemedColor(i11));
            }
            qk qkVar = this.f42207c1;
            if (qkVar != null) {
                qkVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ci));
            }
            org.telegram.ui.ActionBar.q2 q2Var = this.H0;
            if (q2Var != null && q2Var.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.t6.Ci)) != this.K0 || this.f42490yb != org.telegram.ui.ActionBar.t6.I.q())) {
                this.K0 = themedColor4;
                this.f42490yb = org.telegram.ui.ActionBar.t6.I.q();
                Drawable background = this.H0.getBackground();
                org.telegram.ui.ActionBar.t6.H1(background, themedColor4, false);
                org.telegram.ui.ActionBar.t6.H1(background, org.telegram.ui.ActionBar.j6.b(themedColor4), true);
            }
            rb();
        } catch (Exception e) {
            org.telegram.messenger.f8.g(e, true);
        }
        Set<org.telegram.ui.ActionBar.r0> set = this.U0;
        Set<org.telegram.ui.ActionBar.r0> set2 = this.T0;
        try {
            RadialProgressView radialProgressView2 = this.I0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.J0));
            }
            NumberTextView numberTextView = this.T2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.t6.Te));
            }
            RadialProgressView radialProgressView3 = this.Y2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.t6.Se));
            }
            org.telegram.ui.Components.p80 p80Var = this.f42269h2;
            if (p80Var != null && this.R0) {
                p80Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.t6.Ue));
            }
            if (this.O0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.t6.f21311y6)) != this.L0) {
                this.L0 = themedColor3;
                this.O0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.P0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.t6.Ci)) != this.M0) {
                this.M0 = themedColor2;
                this.P0.setTint(themedColor2);
            }
            if (this.Q0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.H6)) != this.N0) {
                this.N0 = themedColor;
                this.Q0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            ih.d dVar3 = this.Yc;
            if (dVar3 != null && (i10 = this.S0) >= 0) {
                dVar3.setColor(getThemedColor(i10));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.t6.f21153p7);
                for (org.telegram.ui.ActionBar.r0 r0Var : set2) {
                    if (r0Var != null) {
                        r0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f21153p7, false);
                for (org.telegram.ui.ActionBar.r0 r0Var2 : set) {
                    if (r0Var2 != null) {
                        r0Var2.a(x02, x02);
                    }
                }
            }
        } catch (Exception e7) {
            org.telegram.messenger.f8.g(e7, true);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.tc tcVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        int i10 = org.telegram.messenger.zs.K2;
        int i11 = org.telegram.messenger.zs.G0;
        int i12 = org.telegram.messenger.zs.f19690t;
        int i13 = org.telegram.messenger.zs.f19683s;
        if (z10) {
            if (!this.f42238e6) {
                this.f42238e6 = true;
                Oc();
            }
            iArr = this.Y9 == 0 ? new int[]{i13, i12, i11, i10, org.telegram.messenger.zs.D} : new int[]{i13, i12, i11, i10};
            this.f42225d6 = false;
            if (!z11) {
                this.f42250f6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = org.telegram.messenger.h20.B(this.f42243f) ? new int[]{i13, i12, i11, i10, org.telegram.messenger.zs.V} : null;
            mk mkVar = this.Z;
            if (mkVar != null && (tcVar = mkVar.S1) != null) {
                org.telegram.messenger.i0.r(tcVar);
                mkVar.S1 = null;
            }
        }
        l7();
        this.Y9 = getNotificationCenter().q(iArr, this.Y9, true);
    }

    @Override
    public final boolean p() {
        return this.K9;
    }

    public final void p7() {
        if (this.N3 != null) {
            return;
        }
        il ilVar = new il(this, getParentActivity(), this, this.f42477xa);
        this.N3 = ilVar;
        this.l1.addView(ilVar, 17, w7.b6.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void p8(Runnable runnable) {
        org.telegram.messenger.zs.f(this.currentAccount).d(runnable);
    }

    public final void p9() {
        org.telegram.ui.Components.mt editField;
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            if (lVar.u()) {
                this.Xc.h(5, false, true);
                this.actionBar.t();
            } else {
                return;
            }
        }
        this.q6 = 0;
        this.f42422t6 = 0;
        this.f42396r6 = 0;
        this.f42447v6 = 0;
        this.f42460w6 = 0;
        this.f42435u6 = 0;
        mk mkVar = this.Z;
        if (mkVar != null && (editField = mkVar.getEditField()) != null) {
            if (this.Z.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        lm lmVar = this.f42386q9;
        if (lmVar != null) {
            lmVar.f(true);
            SparseArray sparseArray = this.f42386q9.f22259p0;
            for (int i10 = 0; i10 < sparseArray.size(); i10++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i10))).cancel();
            }
            sparseArray.clear();
        }
        ql qlVar = this.A9;
        if (qlVar != null) {
            org.telegram.messenger.i0.r(qlVar.H);
            qlVar.a();
        }
        mk mkVar2 = this.Z;
        if (mkVar2 != null) {
            mkVar2.f23674a0 = false;
        }
        this.B9 = false;
        if (this.f42464wb != null) {
            x9();
        }
    }

    public final void pa(final android.text.style.CharacterStyle r12, final java.lang.String r13, boolean r14, final org.telegram.ui.Cells.q1 r15, final org.telegram.messenger.jj r16) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.pa(android.text.style.CharacterStyle, java.lang.String, boolean, org.telegram.ui.Cells.q1, org.telegram.messenger.jj):void");
    }

    public final void pb(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.C3 = user;
        this.D3 = chat;
        if (this.f42291j0 != null && this.W1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.C3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.B3 = false;
                    String L0 = org.telegram.messenger.cd.L0(2131745783, null);
                    SpannableString spannableString = new SpannableString(a1.g.C(L0, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.l00(org.telegram.ui.ActionBar.t6.B8, getResourceProvider()), L0.length() + 1, spannableString.length(), 33);
                    this.f42291j0.setSearchFieldCaption(spannableString);
                    this.W1.getAdapter().U(null, 0, null, false, true);
                    this.f42291j0.setSearchFieldHint(null);
                    this.f42291j0.n();
                    org.telegram.messenger.ui mediaDataController = getMediaDataController();
                    this.H3 = "";
                    mediaDataController.X1("", this.f42297j6, this.f42199b7, this.classGuid, 0, this.f42394r4, false, this.C3, this.D3, true, this.E3);
                }
            }
        }
    }

    public final boolean pc(org.telegram.messenger.jj jjVar) {
        if (this.f42248f4 == 0 && jjVar != null && jjVar.b5()) {
            return true;
        }
        return false;
    }

    public final void pd() {
        boolean z10;
        int i10;
        float f7;
        org.telegram.ui.ActionBar.l lVar;
        if (this.f42317l0 == null) {
            return;
        }
        int i11 = 0;
        if (U9() && !this.f42378q0 && ((lVar = this.actionBar) == null || !lVar.u())) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.f42317l0;
        if (z10) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        t0Var.setVisibility(i10);
        org.telegram.ui.ActionBar.t0 t0Var2 = this.f42279i0;
        if (t0Var2 != null && (t0Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f42279i0.getLayoutParams();
            if (!z10) {
                i11 = org.telegram.messenger.i0.L(48.0f);
            }
            if (layoutParams.width != i11) {
                layoutParams.width = i11;
                this.f42279i0.setLayoutParams(layoutParams);
            }
            org.telegram.ui.ActionBar.t0 t0Var3 = this.f42279i0;
            if (z10) {
                f7 = 0.0f;
            } else {
                f7 = 1.0f;
            }
            t0Var3.setAlpha(f7);
            this.f42279i0.setClickable(!z10);
        }
        gd();
    }

    @Override
    public final org.telegram.ui.Components.sn q() {
        return this.f42355o1;
    }

    public final void q7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.f42218cc > 1000) {
            z10 = true;
        }
        lg lgVar = this.f42231dc;
        org.telegram.messenger.i0.r(lgVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        org.telegram.messenger.i0.h3(lgVar, j10);
    }

    public final void q8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        org.telegram.messenger.jj jjVar = this.F5;
        if (jjVar != null && (message = jjVar.f16337k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final void q9() {
        if (getUserConfig().q()) {
            org.telegram.ui.Components.cc.a0(this).c(org.telegram.messenger.cd.L0(2131754488, null)).j();
            getMessagesController().o0(true);
            Ua(this.f42421t5);
            Wa(this.f42421t5);
            return;
        }
        showDialog(new kg.i1((org.telegram.ui.ActionBar.k2) this, 3, true));
    }

    public final void qa(long j10, final org.telegram.messenger.jj jjVar, int i10, final long j11, final int i11, final int i12, final org.telegram.messenger.jj jjVar2) {
        int i13 = i10;
        final TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.vp.k1(L0);
        tL_messages_getDiscussionMessage.msg_id = i13;
        if (org.telegram.messenger.v2.f18448a) {
            org.telegram.messenger.f8.b("getDiscussionMessage chat = " + L0.f19793id + " msg_id = " + i13);
        }
        this.Dc = 0;
        this.Ec = false;
        this.Gc = null;
        this.Hc = null;
        vj vjVar = this.f42492z0;
        if (vjVar != null) {
            vjVar.g1();
        }
        if (this.Cc != -1) {
            getConnectionsManager().cancelRequest(this.Cc, false);
        }
        if (this.Bc != -1) {
            getConnectionsManager().cancelRequest(this.Bc, false);
        }
        if (jjVar2 != null) {
            i13 = jjVar2.f1();
        }
        this.Dc = i13;
        this.Ec = false;
        this.Fc = System.currentTimeMillis();
        vj vjVar2 = this.f42492z0;
        if (vjVar2 != null) {
            vjVar2.g1();
        }
        final int i14 = this.f42503zc + 1;
        this.f42503zc = i14;
        this.Bc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                un unVar = un.this;
                org.telegram.messenger.i0.g3(new zg(1, unVar, new Runnable(i14, i11, j11, tLObject, i12, jjVar2, tL_messages_getDiscussionMessage, L0, jjVar) {
                    public final int f37051b;
                    public final int f37052c;
                    public final TLObject d;
                    public final int e;
                    public final org.telegram.messenger.jj f37053f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f37054n;
                    public final org.telegram.messenger.jj f37055r;

                    {
                        this.d = tLObject;
                        this.e = r7;
                        this.f37053f = r8;
                        this.h = r9;
                        this.f37054n = r10;
                        this.f37055r = r11;
                    }

                    @Override
                    public final void run() {
                        int i15;
                        final un unVar2 = un.this;
                        if (this.f37051b != unVar2.f42503zc) {
                            return;
                        }
                        unVar2.Bc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            unVar2.Gc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            unVar2.getMessagesController().V3(unVar2.Gc.users, false);
                            unVar2.getMessagesController().P3(unVar2.Gc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = unVar2.Gc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i16 = 0; i16 < unVar2.Gc.messages.size(); i16++) {
                                TLRPC.Message message = unVar2.Gc.messages.get(i16);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i17 = this.f37052c;
                        final int i18 = this.e;
                        final org.telegram.messenger.jj jjVar3 = this.f37053f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = this.h;
                        final TLRPC.Chat chat = this.f37054n;
                        final org.telegram.messenger.jj jjVar4 = this.f37055r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = unVar2.getMessagesController().l1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f19814id;
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
                            final int i19 = unVar2.Ac + 1;
                            unVar2.Ac = i19;
                            unVar2.Cc = unVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    org.telegram.messenger.i0.g3(new oh(un.this, i19, tLObject3, tL_error2, i17, jjVar3, tL_messages_getDiscussionMessage2, chat, i18, jjVar4, 0));
                                }
                            });
                            return;
                        }
                        unVar2.Na(unVar2.Gc, unVar2.Hc, i17, jjVar3, tL_messages_getDiscussionMessage2, chat, i18, jjVar4);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Bc, this.classGuid);
    }

    public final void qb(View view, org.telegram.messenger.jj jjVar, org.telegram.ui.Components.mj0 mj0Var, View view2, float f7, float f10, sg.o0 o0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        sg.o0 o0Var2;
        String str;
        TLRPC.Document e;
        org.telegram.messenger.jj b10;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.z zVar;
        rh.i4 i4Var;
        int[] iArr;
        int[] iArr2;
        int i10;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z15;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && jjVar != null) {
            if (getMessagesController().u2()) {
                b.b(this.currentAccount);
                return;
            }
            int i11 = 2;
            if (o0Var != null && o0Var.f48431a) {
                I7(true);
                if (view == null) {
                    zVar = A8(jjVar.f1(), true);
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
                    TLRPC.Message message2 = jjVar.f16337k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j10 = -rh.x5.b(jjVar).f47691a;
                    TLRPC.ChatFull M0 = getMessagesController().M0(j10);
                    if (M0 != null && !M0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(j10));
                        org.telegram.ui.Components.cc a02 = org.telegram.ui.Components.cc.a0(this);
                        if (L0 != null) {
                            str2 = L0.title;
                        }
                        a02.Q(2131624224, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131745050, str2))).k(true);
                        return;
                    }
                    rh.c6 c6Var = rh.e6.y(this.currentAccount, false).B;
                    if (c6Var != null) {
                        c6Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i12 = this.currentAccount;
                    long j11 = this.f42297j6;
                    if (M0 != null && !M0.paid_reactions_available) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    rh.y8 y8Var = new rh.y8(parentActivity, i12, j11, this, jjVar, arrayList, z15, false, 0L, this.f42477xa);
                    jjVar.f1();
                    y8Var.M1 = this;
                    y8Var.N1 = zVar;
                    y8Var.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -rh.x5.b(jjVar).f47691a;
                TLRPC.ChatFull M02 = getMessagesController().M0(j12);
                if (M02 != null && !M02.paid_reactions_available) {
                    TLRPC.Chat L02 = getMessagesController().L0(Long.valueOf(j12));
                    org.telegram.ui.Components.cc a03 = org.telegram.ui.Components.cc.a0(this);
                    if (L02 != null) {
                        str2 = L02.title;
                    }
                    a03.Q(2131624224, 36, org.telegram.messenger.i0.W2(org.telegram.messenger.cd.a0(null, null, 2131745050, str2))).k(true);
                    return;
                }
                rh.c6 b02 = rh.e6.y(this.currentAccount, false).b0(jjVar, this, 1L, true, true, null);
                if (b02 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Lc == null) {
                        this.Lc = new rh.i4(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        i4Var = null;
                    } else {
                        if (this.Lc.getParent() != layoutContainer) {
                            org.telegram.messenger.i0.E2(this.Lc);
                            layoutContainer.addView(this.Lc, w7.b6.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Lc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Lc.bringToFront();
                        }
                        i4Var = this.Lc;
                    }
                    i4Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    b02.f46727o = i4Var;
                    i4Var.I = false;
                    i4Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    i4Var.getLocationInWindow(new int[2]);
                    float f11 = (iArr[0] - iArr2[0]) + f7;
                    float f12 = (iArr[1] - iArr2[1]) + f10;
                    if (zVar instanceof org.telegram.ui.Cells.q1) {
                        i10 = ((org.telegram.ui.Cells.q1) zVar).V;
                    } else {
                        i10 = 0;
                    }
                    i4Var.d(f11, f12 + i10, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().q() && (message = jjVar.f16337k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new kg.i1((org.telegram.ui.ActionBar.k2) this, 24, true).show();
            } else {
                if (jjVar.w2() && o0Var != null) {
                    for (int i13 = 0; i13 < jjVar.f16337k.reactions.results.size(); i13++) {
                        TLRPC.ReactionCount reactionCount = jjVar.f16337k.reactions.results.get(i13);
                        if (o0Var.f(reactionCount.reaction)) {
                            z14 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z14 = false;
                if (!z14 && (chat = this.e) != null && !org.telegram.messenger.w3.V(chat) && !org.telegram.messenger.w3.w(26, this.e)) {
                    org.telegram.messenger.m5.n(null, 2131745608, org.telegram.ui.Components.cc.a0(this), 2131624006, 36);
                    return;
                }
                sg.k0.b(false);
                int size = jjVar.y0().size();
                boolean G5 = jjVar.G5(o0Var, z11);
                int f13 = jjVar.f1();
                long d12 = jjVar.d1();
                a0.h hVar = this.N6;
                if (hVar.f(d12) != null && (b10 = ((org.telegram.messenger.ej) hVar.f(jjVar.d1())).b(9)) != null) {
                    f13 = b10.f1();
                }
                int i14 = f13;
                if (G5) {
                    org.telegram.ui.Cells.z A8 = A8(i14, true);
                    if (!org.telegram.messenger.tz.f18193w1 && A8 != null && o0Var != null && !getUserConfig().q() && size == 1) {
                        org.telegram.messenger.tz.C(true);
                        long j13 = o0Var.f48435g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.ui.b0(this.currentAccount).f18341r.get(o0Var.f48434f);
                            if (tL_availableReaction != null) {
                                e = tL_availableReaction.center_icon;
                            }
                        } else {
                            e = org.telegram.ui.Components.f5.e(this.currentAccount, j13);
                        }
                        if (e != null) {
                            org.telegram.ui.Components.wb q6 = org.telegram.ui.Components.cc.a0(this).q(e, org.telegram.messenger.cd.L0(2131752218, null));
                            q6.f32135j = 5000;
                            q6.j();
                        }
                    }
                    if (!z10) {
                        int i15 = this.currentAccount;
                        if (mj0Var != null) {
                            if (z11) {
                                i11 = 0;
                            }
                        } else {
                            i11 = 1;
                        }
                        sg.k0.d(this, mj0Var, A8, view2, f7, f10, o0Var, i15, i11);
                    }
                }
                if (G5 && o0Var != null && (str = o0Var.f48434f) != null) {
                    org.telegram.messenger.i0.i2(org.telegram.messenger.cd.a0(null, null, 2131754725, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(jjVar.y0());
                org.telegram.messenger.qz sendMessagesHelper = getSendMessagesHelper();
                if (G5) {
                    o0Var2 = o0Var;
                } else {
                    o0Var2 = null;
                }
                yi yiVar = new yi(this, z13, z10, i14, G5, mj0Var, f7, f10, o0Var, jjVar);
                this.f42478xc = yiVar;
                sendMessagesHelper.s0(jjVar, arrayList2, o0Var2, z11, z12, this, yiVar);
                if (z10 || z13) {
                    Kc(jjVar, true);
                    this.f42478xc.run();
                }
                if (!z13) {
                    org.telegram.messenger.i0.h3(this.f42478xc, 50L);
                }
            }
        }
    }

    public final void qc(org.telegram.messenger.jj jjVar, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (jjVar != null && getParentActivity() != null) {
            sg.s sVar = this.f42400ra;
            if (sVar != null && sVar.d()) {
                this.f42400ra.setHiddenByScroll(true);
            }
            if (this.f42291j0 != null) {
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar.f20497n0) {
                    lVar.k(true);
                    this.Z.c1();
                }
            }
            TLRPC.Message message = jjVar.f16337k;
            if (message != null && (richMessage = message.rich_message) != null) {
                bi.k2 k2Var = new bi.k2(richMessage);
                k2Var.J = this;
                k2Var.f3155r = jjVar;
                presentFragment(k2Var);
                return;
            }
            this.W1.getAdapter().f55652f0 = false;
            this.Z.setVisibility(0);
            Rb(true, null, jjVar, null, null, true, 0, null, false, 0L, null, true);
            Bc(false);
            if (!z10) {
                V6();
            }
            if (z10) {
                this.f42459w5 = org.telegram.messenger.oj.b(jjVar.f16337k.suggested_post);
            }
            this.Z.T0(false, false, true);
            Sc(0, true);
            sd(false);
            if (!z10 && !jjVar.f16357p1 && !org.telegram.messenger.jj.b4(jjVar.f16337k) && this.f42248f4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().i1(this.f42297j6);
                tL_messages_getMessageEditData.f19887id = jjVar.f1();
                this.E5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new pe(this, 3));
                return;
            }
            mk mkVar = this.Z;
            org.telegram.ui.Components.be beVar = mkVar.F1;
            if (beVar != null) {
                beVar.setEnabled(true);
                mkVar.F1.h(false);
            }
        }
    }

    public final void qd() {
        int i10;
        org.telegram.ui.ActionBar.r0 r0Var = this.f42341n0;
        if (r0Var == null) {
            return;
        }
        if (getMessagesController().f18910t7.z(a()) && getMessagesController().f18910t7.t(a())) {
            i10 = 0;
        } else {
            i10 = 8;
        }
        r0Var.e(i10);
    }

    @Override
    public final void r() {
        if (!this.f42445v4) {
            if (this.f42243f != null) {
                TLRPC.User Z1 = getMessagesController().Z1(Long.valueOf(this.f42243f.f19942id));
                if (Z1 != null) {
                    this.f42243f = Z1;
                } else {
                    return;
                }
            } else if (this.e != null) {
                TLRPC.Chat L0 = getMessagesController().L0(Long.valueOf(this.e.f19793id));
                if (L0 != null) {
                    this.e = L0;
                } else {
                    return;
                }
            }
            qj qjVar = this.f42355o1;
            if (qjVar != null) {
                qjVar.b();
            }
        }
    }

    public final void r7() {
        int j92 = (int) (j9(org.telegram.ui.Components.k21.f27624c) + this.T.getInputBubbleHeight() + this.f42453w.d() + org.telegram.messenger.i0.L(9.0f) + org.telegram.messenger.i0.L(7.0f));
        this.Y.setFadeZoneBottom(j92);
        int b10 = w7.u.b(org.telegram.messenger.i0.L(36.0f) + (this.l1.getMeasuredHeight() - j92), 0, this.l1.getMeasuredHeight());
        int measuredWidth = this.l1.getMeasuredWidth();
        Rect rect = f42177id;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Ta, this.f42492z0.getMeasuredWidth(), org.telegram.messenger.i0.L(36.0f) + ((this.f42492z0.getMeasuredHeight() - this.Ua) - j92));
    }

    public final org.telegram.ui.Components.t11 r8() {
        long b10;
        boolean z10;
        boolean z11 = false;
        if (this.m0 == null && getParentActivity() != null && this.l1 != null) {
            org.telegram.ui.Components.o21 o21Var = this.f42246f2;
            if (o21Var != null && o21Var.d) {
                z10 = true;
            } else {
                z10 = false;
            }
            org.telegram.ui.Components.t11 t11Var = new org.telegram.ui.Components.t11(getParentActivity(), this.currentAccount, a(), z10, this.f42477xa, new al(this));
            this.m0 = t11Var;
            this.l1.addView(t11Var, w7.b6.c(-1.0f, -1));
        }
        org.telegram.ui.Components.t11 t11Var2 = this.m0;
        if (t11Var2 != null) {
            if (N9()) {
                b10 = V8();
            } else {
                b10 = b();
            }
            t11Var2.setCurrentTopic(b10);
            org.telegram.ui.Components.t11 t11Var3 = this.m0;
            if (this.f42279i0 != null) {
                z11 = true;
            }
            t11Var3.setMenuAvailable(z11);
        }
        return this.m0;
    }

    public final void r9(boolean z10) {
        Sb(false, null, false, z10);
    }

    public final void ra(boolean z10) {
        String L0;
        if (!K9() && !n9()) {
            int i10 = 0;
            boolean z11 = false;
            for (int i11 = 0; i11 < 2; i11++) {
                int i12 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f42333m6;
                    if (i12 >= sparseArrayArr[i11].size()) {
                        break;
                    }
                    org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) sparseArrayArr[i11].valueAt(i12);
                    if (jjVar.D4()) {
                        i10 = 3;
                    } else if (jjVar.T3()) {
                        if (jjVar.Z3()) {
                            i10 = 2;
                        } else {
                            i10 = 1;
                        }
                        if (i10 == 2) {
                            break;
                        }
                    } else if (jjVar.z3()) {
                        z11 = true;
                    }
                    i12++;
                }
                if (i10 == 2) {
                    break;
                }
            }
            sg.s sVar = this.f42400ra;
            if (sVar != null && sVar.d()) {
                this.f42400ra.setHiddenByScroll(true);
            }
            Bundle j10 = org.telegram.ui.Cells.f1.j(3, "onlySelect", "dialogsType", true);
            j10.putInt("messagesCount", this.f42409s6);
            j10.putInt("hasPoll", i10);
            j10.putBoolean("hasInvoice", z11);
            j10.putBoolean("canSelectTopics", true);
            ay ayVar = new ay(j10);
            ayVar.C2 = this;
            presentFragment(ayVar);
            return;
        }
        if (K9()) {
            if (a() > 0) {
                L0 = org.telegram.messenger.cd.L0(2131750536, null);
            } else if (org.telegram.messenger.w3.T(this.e) && !this.e.megagroup) {
                L0 = org.telegram.messenger.cd.L0(2131750538, null);
            } else {
                L0 = org.telegram.messenger.cd.L0(2131750537, null);
            }
        } else {
            L0 = org.telegram.messenger.cd.L0(2131750539, null);
        }
        if (z10) {
            if (this.f42482y2 == null) {
                km kmVar = this.l1;
                int indexOfChild = kmVar.indexOfChild(this.T);
                if (indexOfChild != -1) {
                    org.telegram.ui.Components.q30 q30Var = new org.telegram.ui.Components.q30(7, getParentActivity(), null, true);
                    this.f42482y2 = q30Var;
                    kmVar.addView(q30Var, indexOfChild + 1, w7.b6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
                    this.f42482y2.setAlpha(0.0f);
                    this.f42482y2.setVisibility(4);
                } else {
                    return;
                }
            }
            this.f42482y2.setText(L0);
            this.f42482y2.f(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.f42494z2 == null) {
            km kmVar2 = this.l1;
            int indexOfChild2 = kmVar2.indexOfChild(this.T);
            if (indexOfChild2 == -1) {
                return;
            }
            org.telegram.ui.Components.q30 q30Var2 = new org.telegram.ui.Components.q30(getParentActivity(), 9);
            this.f42494z2 = q30Var2;
            kmVar2.addView(q30Var2, indexOfChild2 + 1, w7.b6.d(-2, -2.0f, 51, 12.0f, 0.0f, 12.0f, 0.0f));
            this.f42494z2.setAlpha(0.0f);
            this.f42494z2.setVisibility(4);
        }
        this.f42494z2.setText(L0);
        this.f42494z2.f(this.f42220d1.getForwardButton(), true);
    }

    public final void rb() {
        android.support.v4.media.session.a0[] a0VarArr;
        ah.b bVar;
        ah.a aVar;
        org.telegram.ui.Components.qc[] qcVarArr;
        sn snVar = this.f42477xa;
        if (snVar != null) {
            snVar.t();
        }
        jj jjVar = this.f42479y;
        if (jjVar != null) {
            jjVar.d();
        }
        jj jjVar2 = this.f42466x;
        if (jjVar2 != null) {
            jjVar2.d();
        }
        jj jjVar3 = this.D;
        if (jjVar3 != null) {
            jjVar3.d();
        }
        mk mkVar = this.Z;
        if (mkVar != null) {
            mkVar.updateColors();
        }
        ag.v vVar = this.X1;
        if (vVar != null) {
            vVar.P0();
        }
        vj vjVar = this.f42492z0;
        if (vjVar != null) {
            int childCount = vjVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f42492z0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) childAt).z0(0);
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    ((org.telegram.ui.Cells.s0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.k1 k1Var = this.f42240e9;
        if (k1Var != null && k1Var.getContentView() != null) {
            View contentView = this.f42240e9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.t6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.ye0 ye0Var = this.N2;
        if (ye0Var != null) {
            ye0Var.d();
        }
        nk nkVar = this.f42179a0;
        if (nkVar != null && nkVar.getEditView() != null) {
            for (org.telegram.ui.Components.qc qcVar : this.f42179a0.getEditView().f29339a) {
                if (qcVar != null) {
                    qcVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.t0 t0Var = this.f42279i0;
        if (t0Var != null) {
            t0Var.V();
        }
        gk gkVar = this.f42318l2;
        if (gkVar != null) {
            gkVar.updateColors();
        }
        qj qjVar = this.f42355o1;
        if (qjVar != null) {
            qjVar.updateColors();
        }
        km kmVar = this.l1;
        if (kmVar != null) {
            kmVar.M();
            bi.t0 t0Var2 = this.l1.L;
            if (t0Var2 != null) {
                t0Var2.invalidate();
            }
        }
        org.telegram.ui.Components.hg hgVar = this.f42180a1;
        if (hgVar != null) {
            vg.f fVar = hgVar.f26726s;
            if (fVar != null) {
                fVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.t6.x0(null, org.telegram.ui.ActionBar.t6.f20929d6, false));
            hgVar.invalidate();
        }
        org.telegram.ui.Components.sx0 sx0Var = this.f42391r1;
        if (sx0Var != null) {
            sx0Var.updateColors();
        }
        qj qjVar2 = this.f42355o1;
        if (qjVar2 != null && qjVar2.getTimeItem() != null) {
            this.f42355o1.getTimeItem().invalidate();
        }
        zg.e eVar = this.T;
        if (eVar != null) {
            eVar.updateColors();
        }
        bh.k kVar = this.f42468x1;
        if (kVar != null) {
            for (android.support.v4.media.session.a0 a0Var : kVar.e) {
                if (a0Var != null && (aVar = (bVar = (ah.b) a0Var.f875b).f830b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        qk qkVar = this.f42207c1;
        if (qkVar != null) {
            qkVar.updateColors();
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            ((vg.f) it.next()).updateColors();
        }
        this.l1.invalidate();
        Iterator it2 = this.E.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void rc() {
        org.telegram.ui.Components.xz xzVar = this.F9;
        if (xzVar != null && !xzVar.f32571c) {
            xzVar.c(false);
            try {
                this.F9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void rd(org.telegram.messenger.r20 r20Var) {
        int i10;
        int i11;
        vj vjVar = this.f42492z0;
        if (vjVar != null) {
            if (!this.P4 && this.Z7 != null) {
                int childCount = vjVar.getChildCount();
                int i12 = 0;
                while (true) {
                    if (i12 >= childCount) {
                        break;
                    }
                    View childAt = this.f42492z0.getChildAt(i12);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.jj messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.jj jjVar = this.Z7;
                        if (messageObject == jjVar) {
                            ArrayList arrayList = this.K6;
                            if (arrayList.indexOf(jjVar) >= 0) {
                                i10 = arrayList.indexOf(this.Z7) + this.C0.J;
                                i11 = Y8(childAt);
                            }
                        }
                    }
                    i12++;
                }
            }
            i10 = -1;
            i11 = 0;
            int childCount2 = this.f42492z0.getChildCount();
            mk mkVar = this.Z;
            if (mkVar != null) {
                mkVar.getEditingMessageObject();
            }
            for (int i13 = 0; i13 < childCount2; i13++) {
                View childAt2 = this.f42492z0.getChildAt(i13);
                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                    org.telegram.messenger.jj messageObject2 = q1Var.getMessageObject();
                    if (((Boolean) r20Var.a(messageObject2)).booleanValue()) {
                        messageObject2.K1 = true;
                        q1Var.s3(messageObject2, q1Var.getCurrentMessagesGroup(), q1Var.E2(), q1Var.F2(), q1Var.x2(), q1Var.A2());
                        fm fmVar = this.C0;
                        this.f42492z0.getClass();
                        fmVar.Q(RecyclerView.R(q1Var));
                    }
                }
            }
            if (i10 != -1) {
                this.B0.h1(i10, i11);
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f42323l8 = bundle.getString("path");
    }

    public final void s7() {
        int i10;
        if (this.f42355o1 != null) {
            float actionModeFactor = (1.0f - this.Vc.e) * (1.0f - this.actionBar.getActionModeFactor());
            float T1 = org.telegram.messenger.i0.T1(0.95f, 1.0f, actionModeFactor);
            this.f42355o1.setScaleX(T1);
            this.f42355o1.setScaleY(T1);
            this.f42355o1.setAlpha(actionModeFactor);
            qj qjVar = this.f42355o1;
            if (actionModeFactor > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            qjVar.setVisibility(i10);
        }
    }

    public final void s8() {
        org.telegram.messenger.lj ljVar;
        org.telegram.messenger.oj ojVar = this.f42459w5;
        if (ojVar != null) {
            Wb(ojVar);
            return;
        }
        TLRPC.WebPage webPage = this.W5;
        if (webPage != null) {
            Sb(true, webPage, false, true);
            return;
        }
        kn knVar = this.B5;
        if (knVar != null) {
            Vb(this.D5, knVar);
            return;
        }
        org.telegram.messenger.jj jjVar = this.D5;
        if (jjVar != null && jjVar != this.l4) {
            Ub(jjVar);
            return;
        }
        org.telegram.messenger.nj njVar = this.f42446v5;
        if (njVar != null && (ljVar = njVar.f17115b) != null) {
            Tb(ljVar.e);
            return;
        }
        org.telegram.messenger.jj jjVar2 = this.F5;
        if (jjVar2 != null) {
            Rb(true, null, jjVar2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            Sb(false, null, true, true);
        }
    }

    public final void s9(boolean z10) {
        if (this.f42319l3.getTag() != null && !this.f42393r3) {
            if (!this.f42470x3 || this.f42419t3) {
                this.f42319l3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f42432u3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f42432u3.playTogether(ObjectAnimator.ofFloat(this.f42319l3, View.ALPHA, 0.0f));
                    this.f42432u3.addListener(new bi(this, 7));
                    this.f42432u3.setStartDelay(this.f42357o3);
                    this.f42432u3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f42432u3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f42432u3 = null;
                    }
                    this.f42319l3.setAlpha(0.0f);
                }
                this.f42357o3 = 500;
            }
        }
    }

    public final void sa(int i10) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        org.telegram.messenger.jj jjVar;
        org.telegram.messenger.nj njVar = this.f42446v5;
        if (njVar != null && this.Ya == null) {
            TLRPC.Peer peer = null;
            if (njVar.f17116c != null) {
                int i11 = this.currentAccount;
                TLRPC.WebPage webPage = this.W5;
                CharSequence fieldText = this.Z.getFieldText();
                org.telegram.messenger.jj jjVar2 = this.D5;
                if (jjVar2 == this.l4) {
                    jjVar = null;
                } else {
                    jjVar = jjVar2;
                }
                njVar.e(i11, webPage, fieldText, jjVar, this.B5, this.F5);
            }
            if (!this.f42446v5.c()) {
                this.zb = this.Z.f23822z2;
                Context context = this.l1.getContext();
                tg.b bVar = this.O8;
                org.telegram.messenger.nj njVar2 = this.f42446v5;
                TLRPC.User user = this.f42243f;
                TLRPC.Chat chat = this.e;
                int i12 = this.currentAccount;
                sn snVar = this.f42477xa;
                kn knVar = this.B5;
                if (knVar != null && knVar.f38908f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hl hlVar = new hl(this, context, this, bVar, njVar2, user, chat, i12, snVar, i10, z10);
                this.Ya = hlVar;
                this.f42446v5.f17133x = hlVar;
                TLRPC.ChatFull chatFull = this.f42374p8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Aa) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Aa.peers.get(0).peer;
                }
                this.Ya.setSendAsPeer(peer);
                l7();
                this.l1.addView(this.Ya);
                if (this.zb) {
                    mk mkVar = this.Z;
                    mkVar.T0 = true;
                    org.telegram.ui.Components.gf gfVar = mkVar.U0;
                    if (gfVar != null) {
                        gfVar.u(true);
                    }
                    this.Z.q1();
                    this.R3 = true;
                }
                org.telegram.messenger.i0.k3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        mf mfVar = this.Ja;
        if (mfVar != null) {
            org.telegram.messenger.i0.r(mfVar);
        }
        mk mkVar = this.Z;
        if (mkVar != null && this.l1 != null && mkVar.getAdjustPanLayoutHelper() != null && !this.Z.getAdjustPanLayoutHelper().f20565f) {
            this.Ia = this.l1.getKeyboardHeight();
        } else {
            this.Ia = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f42323l8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb(TLRPC.Document document) {
        String V;
        if (document == null || (V = org.telegram.messenger.jj.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f19799id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(V, this.f42297j6, this.D5, this.l4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b10.K = P8();
        org.telegram.messenger.qz.C(this.currentAccount).r0(b10);
        F6();
    }

    public final void sc() {
        long j10;
        me meVar = this.f42312k8;
        if (meVar != null) {
            org.telegram.messenger.i0.r(meVar);
        }
        me meVar2 = new me(this, 18);
        this.f42312k8 = meVar2;
        if (this.f42251f8 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        org.telegram.messenger.i0.h3(meVar2, j10);
    }

    public final void sd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.sd(boolean):void");
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i10;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            org.telegram.ui.ActionBar.y p5 = lVar.p();
            if (this.inMenuMode) {
                i10 = 8;
            } else {
                i10 = 0;
            }
            p5.setVisibility(i10);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.messenger.jj jjVar;
        TLRPC.Message message;
        long j10;
        org.telegram.ui.ActionBar.c2 c2Var;
        float f7;
        float f10;
        mk mkVar;
        int i10;
        float f11;
        super.setInPreviewMode(z10);
        int i11 = 8;
        boolean z13 = true;
        if (this.f42243f != null && this.f42367p0 != null) {
            TLRPC.UserFull a2 = getMessagesController().a2(this.f42243f.f19942id);
            if (a2 != null && a2.phone_calls_available) {
                this.f42241ea = !this.inPreviewMode;
                this.f42367p0.e(0);
            } else {
                this.f42241ea = false;
                this.f42367p0.e(8);
            }
        }
        qj qjVar = this.f42355o1;
        float f12 = 0.0f;
        if (qjVar != null) {
            qjVar.setOccupyStatusBar(!z10);
            qj qjVar2 = this.f42355o1;
            if (!this.inPreviewMode) {
                f11 = 52.0f;
            } else {
                f11 = 0.0f;
            }
            qjVar2.setLayoutParams(w7.b6.d(-2, -1.0f, 51, f11, 0.0f, 52.0f, 0.0f));
        }
        mk mkVar2 = this.Z;
        if (mkVar2 != null) {
            if (!z10) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            mkVar2.setVisibility(i10);
        }
        org.telegram.ui.Components.sx0 sx0Var = this.f42391r1;
        if (sx0Var != null) {
            if (this.p5 && !z10 && ((mkVar = this.Z) == null || !mkVar.f23823z3)) {
                i11 = 0;
            }
            sx0Var.setVisibility(i11);
        }
        ek ekVar = this.W1;
        if (ekVar != null) {
            ViewPropertyAnimator animate = ekVar.animate();
            if (!this.Z.f23823z3 && !isInPreviewMode()) {
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            animate.alpha(f10).setInterpolator(org.telegram.ui.Components.gr.f26495f).start();
        }
        org.telegram.ui.ActionBar.l lVar = this.actionBar;
        if (lVar != null) {
            if (!z10) {
                c2Var = new org.telegram.ui.ActionBar.c2(false);
            } else {
                c2Var = null;
            }
            lVar.setBackButtonDrawable(c2Var);
            org.telegram.ui.ActionBar.t0 t0Var = this.f42279i0;
            if (t0Var != null) {
                if (!z10) {
                    f7 = 1.0f;
                } else {
                    f7 = 0.0f;
                }
                t0Var.setAlpha(f7);
            }
            org.telegram.ui.ActionBar.x xVar = this.f42244f0;
            if (xVar != null) {
                if (!z10) {
                    f12 = 1.0f;
                }
                xVar.f21460i = f12;
                org.telegram.ui.ActionBar.t0 t0Var2 = xVar.f21464m;
                if (t0Var2 != null) {
                    t0Var2.setAlpha(f12);
                }
            }
        }
        vj vjVar = this.f42492z0;
        if (vjVar != null) {
            int childCount = vjVar.getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = this.f42492z0.getChildAt(i12);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.q1;
                if (z14) {
                    jjVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.s0) {
                    jjVar = ((org.telegram.ui.Cells.s0) childAt).getMessageObject();
                } else {
                    jjVar = null;
                }
                if (jjVar != null && (message = jjVar.f16337k) != null && message.media_unread && message.mentioned) {
                    if (!org.telegram.messenger.jj.R4(message) && !jjVar.h4()) {
                        int i13 = this.B6 - 1;
                        this.B6 = i13;
                        if (i13 <= 0) {
                            this.B6 = 0;
                            this.C6 = true;
                            dc(false);
                        } else {
                            this.f42468x1.c(2, i13, true);
                        }
                        org.telegram.messenger.vp messagesController = getMessagesController();
                        int f13 = jjVar.f1();
                        if (org.telegram.messenger.w3.T(this.e)) {
                            j10 = this.e.f19793id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.k3(j10, f13, this.f42297j6);
                        jjVar.f16337k.media_unread = false;
                    }
                    if (z14) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        q1Var.setHighlighted(false);
                        q1Var.k3();
                    }
                }
            }
            this.f42492z0.setItemAnimator(null);
        }
        Bc(false);
        ed();
        gk gkVar = this.f42318l2;
        if (gkVar != null) {
            if (!z10 && !this.f42289ib) {
                z12 = true;
            } else {
                z12 = false;
            }
            gkVar.setEnabled(z12);
        }
        gk gkVar2 = this.f42343n2;
        if (gkVar2 != null) {
            if (!z10 && !this.f42289ib) {
                z11 = true;
            } else {
                z11 = false;
            }
            gkVar2.setEnabled(z11);
        }
        jl jlVar = this.L2;
        if (jlVar != null) {
            jlVar.setEnabled(!isInPreviewMode());
        }
        km kmVar = this.l1;
        if (kmVar != null) {
            kmVar.setOccupyStatusBar((this.inBubbleMode || this.f42289ib || this.inPreviewMode) ? false : false);
        }
    }

    @Override
    public final void t(final org.telegram.messenger.ef efVar, final org.telegram.messenger.x20 x20Var, final boolean z10, final int i10, final int i11, final boolean z11, long j10) {
        if (efVar == null) {
            return;
        }
        this.Rc.a(false, true);
        org.telegram.messenger.jj jjVar = this.F5;
        if (jjVar != null && jjVar.p5() && !org.telegram.messenger.w3.z(this.currentAccount, 24, org.telegram.messenger.jj.B0(this.F5.f16337k))) {
            org.telegram.messenger.oj ojVar = this.f42459w5;
            if (ojVar == null) {
                ojVar = org.telegram.messenger.oj.b(this.F5.f16337k.suggested_post);
            }
            if (!rh.e6.T(this.currentAccount, ojVar.f17275a)) {
                mc(ojVar);
                return;
            }
        }
        if (x20Var != null && x20Var.f19200s) {
            mf mfVar = new mf(this, 26);
            this.G7 = mfVar;
            org.telegram.messenger.i0.h3(mfVar, 3000L);
        }
        u8(efVar.f19506a, efVar.f19516n);
        org.telegram.ui.Components.s4.a0(this.currentAccount, a(), 1, new org.telegram.messenger.q20() {
            @Override
            public final void a(Object obj) {
                Long l4 = (Long) obj;
                un unVar = un.this;
                org.telegram.messenger.jj jjVar2 = unVar.F5;
                org.telegram.messenger.ef efVar2 = efVar;
                org.telegram.messenger.x20 x20Var2 = x20Var;
                boolean z12 = z10;
                int i12 = i10;
                int i13 = i11;
                boolean z13 = z11;
                if (jjVar2 != null && jjVar2.p5()) {
                    org.telegram.messenger.oj ojVar2 = unVar.f42459w5;
                    if (ojVar2 == null) {
                        ojVar2 = org.telegram.messenger.oj.b(unVar.F5.f16337k.suggested_post);
                    }
                    org.telegram.messenger.oj ojVar3 = ojVar2;
                    if (efVar2.f19507b) {
                        org.telegram.messenger.c accountInstance = unVar.getAccountInstance();
                        String str = efVar2.I;
                        String str2 = efVar2.f19510g;
                        TLRPC.Photo photo = efVar2.e;
                        long j11 = unVar.f42297j6;
                        org.telegram.messenger.jj jjVar3 = unVar.F5;
                        org.telegram.messenger.jj jjVar4 = unVar.l4;
                        kn knVar = unVar.B5;
                        ArrayList arrayList = efVar2.f19516n;
                        int i14 = efVar2.f19525x;
                        boolean z14 = efVar2.M;
                        org.telegram.messenger.qz.b0(i14, i12, i13, j11, efVar2.f19526y, l4.longValue(), unVar.a9(), efVar2.f19506a, str, str2, arrayList, accountInstance, jjVar3, jjVar4, null, ojVar3, unVar.P8(), x20Var2, photo, null, knVar, z12, z13, z14);
                    } else if (efVar2.h != null) {
                        org.telegram.messenger.qz.Z(unVar.getAccountInstance(), efVar2.h, efVar2.f19508c, null, unVar.f42297j6, unVar.F5, unVar.l4, unVar.B5, efVar2.f19516n, efVar2.f19520r, null, efVar2.f19525x, null, x20Var2, z12, i12, z13, efVar2.f19506a, unVar.P8(), efVar2.f19526y, l4.longValue(), unVar.a9(), ojVar3);
                    } else if (efVar2.I != null) {
                        org.telegram.messenger.qz.Z(unVar.getAccountInstance(), efVar2.I, efVar2.f19508c, null, unVar.f42297j6, unVar.F5, unVar.l4, unVar.B5, efVar2.f19516n, efVar2.f19520r, null, efVar2.f19525x, null, x20Var2, z12, i12, z13, efVar2.f19506a, unVar.P8(), efVar2.f19526y, l4.longValue(), unVar.a9(), ojVar3);
                    }
                } else if (efVar2.f19507b) {
                    org.telegram.messenger.c accountInstance2 = unVar.getAccountInstance();
                    String str3 = efVar2.I;
                    String str4 = efVar2.f19510g;
                    TLRPC.Photo photo2 = efVar2.e;
                    long j12 = unVar.f42297j6;
                    org.telegram.messenger.jj jjVar5 = unVar.D5;
                    org.telegram.messenger.jj jjVar6 = unVar.l4;
                    kn knVar2 = unVar.B5;
                    ArrayList arrayList2 = efVar2.f19516n;
                    int i15 = efVar2.f19525x;
                    org.telegram.messenger.jj jjVar7 = unVar.F5;
                    boolean z15 = efVar2.M;
                    org.telegram.messenger.qz.b0(i15, i12, i13, j12, efVar2.f19526y, l4.longValue(), unVar.a9(), efVar2.f19506a, str3, str4, arrayList2, accountInstance2, jjVar5, jjVar6, jjVar7, unVar.f42459w5, unVar.P8(), x20Var2, photo2, null, knVar2, z12, z13, z15);
                } else if (efVar2.h != null) {
                    org.telegram.messenger.qz.Z(unVar.getAccountInstance(), efVar2.h, efVar2.f19508c, null, unVar.f42297j6, unVar.D5, unVar.l4, unVar.B5, efVar2.f19516n, efVar2.f19520r, null, efVar2.f19525x, unVar.F5, x20Var2, z12, i12, z13, efVar2.f19506a, unVar.P8(), efVar2.f19526y, l4.longValue(), unVar.a9(), unVar.f42459w5);
                } else if (efVar2.I != null) {
                    org.telegram.messenger.qz.Z(unVar.getAccountInstance(), efVar2.I, efVar2.f19508c, null, unVar.f42297j6, unVar.D5, unVar.l4, unVar.B5, efVar2.f19516n, efVar2.f19520r, null, efVar2.f19525x, unVar.F5, x20Var2, z12, i12, z13, efVar2.f19506a, unVar.P8(), efVar2.f19526y, l4.longValue(), unVar.a9(), unVar.f42459w5);
                }
                unVar.F6();
            }
        }, j10);
    }

    public final void t7() {
        boolean z10;
        hk hkVar;
        if (this.f42463wa != null) {
            return;
        }
        int i10 = 0;
        if (this.Uc.e >= 1.0f && ((hkVar = this.E1) == null || hkVar.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        bi.t0 t0Var = this.l1.L;
        if (!z10) {
            i10 = 4;
        }
        t0Var.setVisibility(i10);
    }

    public final void t9(boolean z10) {
        if (this.f42330m3.getTag() != null && !this.f42406s3) {
            if (!this.y3 || this.f42419t3) {
                this.f42330m3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f42457w3, 0.0f);
                    this.f42444v3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f42444v3.addUpdateListener(new oe(this, 1));
                    this.f42444v3.addListener(new bi(this, 9));
                    this.f42444v3.setStartDelay(this.f42357o3);
                    this.f42444v3.start();
                } else {
                    ValueAnimator valueAnimator = this.f42444v3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f42444v3 = null;
                    }
                    this.f42457w3 = 0.0f;
                    Fc();
                }
                this.f42357o3 = 500;
            }
        }
    }

    public final void ta(String str, boolean z10) {
        boolean z11;
        kk kkVar;
        boolean z12;
        org.telegram.ui.ActionBar.t0 t0Var;
        int i10;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                U7();
                vh.p2 p2Var = this.J1;
                if (p2Var != null && p2Var.V) {
                    p2Var.e(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                vh.p2 p2Var2 = this.K1;
                if (p2Var2 != null && p2Var2.V) {
                    p2Var2.e(true);
                    z11 = true;
                }
                if (z11) {
                    org.telegram.messenger.i0.h3(new te(this, str, 5), 200L);
                    return;
                }
                this.I3 = str;
                this.H3 = str;
                boolean contains = str.contains("@");
                Z6(true);
                if (!this.actionBar.f20497n0) {
                    this.Vc.a(true, true);
                    org.telegram.ui.ActionBar.t0 t0Var2 = this.f42279i0;
                    if (t0Var2 != null) {
                        t0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar = this.f42244f0;
                    if (xVar != null) {
                        xVar.e(8);
                    }
                    cs csVar = this.f42232e0;
                    if (csVar != null) {
                        csVar.b(false);
                    }
                    if ((this.f42394r4 == 0 || (i10 = this.f42248f4) == 3 || i10 == 8) && (t0Var = this.f42291j0) != null) {
                        t0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var3 = this.f42354o0;
                    if (t0Var3 != null && this.f42229da) {
                        t0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.x xVar2 = this.f42367p0;
                    if (xVar2 != null && this.f42241ea) {
                        xVar2.e(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var4 = this.f42304k0;
                    if (t0Var4 != null) {
                        t0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.t0 t0Var5 = this.f42317l0;
                    if (t0Var5 != null) {
                        t0Var5.setVisibility(8);
                    }
                    this.f42378q0 = true;
                    Zc(0, 0, -1);
                    Bc(false);
                }
                wk wkVar = this.C1;
                if (wkVar != null) {
                    if (wkVar.E > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        wkVar.g(false);
                    }
                }
                ImageView imageView = this.f42270h3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!org.telegram.messenger.w3.V(this.e) || !org.telegram.messenger.w3.t0(this.e) || this.I3 == null)) {
                    this.F1 = 0;
                } else {
                    this.F1 = 2;
                }
                this.f42284i5 = false;
                if (this.f42210c4 == 3) {
                    org.telegram.messenger.oa.a(this.currentAccount).b(3).a();
                } else {
                    org.telegram.messenger.oa a2 = org.telegram.messenger.oa.a(this.currentAccount);
                    a2.f17245b.a();
                    a2.f17246c.a();
                }
                hk hkVar = this.E1;
                if (hkVar != null) {
                    hkVar.h.clear();
                }
                org.telegram.ui.ActionBar.t0 t0Var6 = this.f42291j0;
                if (t0Var6 != null) {
                    this.f42491yc = true;
                    t0Var6.F(false);
                    this.f42491yc = false;
                }
                org.telegram.ui.ActionBar.t0 t0Var7 = this.f42291j0;
                if (t0Var7 != null) {
                    t0Var7.setSearchFieldCaption(null);
                    this.f42291j0.P(str, false);
                    this.f42291j0.setSearchFieldHint(org.telegram.messenger.cd.L0(2131745780, null));
                }
                getMediaDataController().X1(this.H3, this.f42297j6, this.f42199b7, this.classGuid, 0, this.f42394r4, false, this.C3, this.D3, false, this.E3);
                Sc(0, true);
                this.f42392r2.e(true, true);
                ec(true);
                kk kkVar2 = this.D1;
                if (kkVar2 != null) {
                    kkVar2.b(!contains);
                    bd();
                }
                if ((contains || z10) && this.I3 != null && (kkVar = this.D1) != null) {
                    int currentPosition = kkVar.f28147a.getCurrentPosition();
                    int i11 = this.F1;
                    if (currentPosition != i11) {
                        this.D1.f28147a.d(i11, i11);
                    }
                }
                org.telegram.messenger.oa.a(this.currentAccount).c(this.I3);
                this.H1.f28004f.O(true);
                View currentView = this.E1.getCurrentView();
                if (currentView instanceof wn) {
                    ((wn) currentView).f43336a.dd(this.I3);
                }
            }
        }
    }

    public final void tb(TLRPC.BotInlineResult botInlineResult, boolean z10, int i10, long j10) {
        long j11;
        String str;
        ek ekVar = this.W1;
        if (ekVar == null) {
            return;
        }
        TLRPC.User user = ekVar.getAdapter().f55672w0;
        if (user != null) {
            j11 = user.f19942id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f19791id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.W1.getAdapter().f55672w0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j12 = this.f42297j6;
        org.telegram.messenger.jj jjVar = this.D5;
        org.telegram.messenger.jj jjVar2 = this.l4;
        kn knVar = this.B5;
        org.telegram.messenger.qz.S(i10, j12, j10, a9(), hashMap, accountInstance, jjVar, jjVar2, P8(), botInlineResult, null, this, knVar, z10);
        this.Z.setFieldText("");
        r9(false);
        getMediaDataController().v0(j11, false);
    }

    public final void tc() {
        org.telegram.messenger.i0.d0(this.f42492z0, new nc(1, this, E9()));
    }

    public final void u7() {
        float f7;
        org.telegram.ui.Components.qe qeVar;
        float inputBubbleHeight = this.T.getInputBubbleHeight() + org.telegram.messenger.i0.L(15.0f) + j9(org.telegram.ui.Components.k21.f27624c) + this.f42453w.d();
        mk mkVar = this.Z;
        if (mkVar != null && (qeVar = mkVar.m0) != null) {
            qeVar.setTranslationY(-inputBubbleHeight);
        }
        ek ekVar = this.W1;
        if (ekVar != null) {
            if (ekVar.g()) {
                f7 = org.telegram.messenger.i0.L(5.0f);
            } else {
                f7 = -inputBubbleHeight;
            }
            ekVar.setTranslationY(f7);
        }
    }

    public final void u8(CharSequence charSequence, ArrayList arrayList) {
        if (this.F5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                org.telegram.messenger.jj jjVar = this.F5;
                jjVar.f16384w1 = charSequence;
                jjVar.f16388x1 = arrayList;
            } else if (this.F5.F3()) {
                org.telegram.messenger.jj jjVar2 = this.F5;
                jjVar2.f16384w1 = "";
                jjVar2.f16388x1 = new ArrayList();
            } else {
                mk mkVar = this.Z;
                if (mkVar != null) {
                    this.F5.f16384w1 = mkVar.getFieldText();
                    org.telegram.messenger.jj jjVar3 = this.F5;
                    if (jjVar3.f16384w1 == null && !TextUtils.isEmpty(jjVar3.f16337k.message)) {
                        this.F5.f16384w1 = "";
                    }
                }
            }
        }
    }

    public final void u9(boolean z10) {
        if (!z10) {
            org.telegram.ui.Components.q30 q30Var = this.A2;
            if (q30Var != null) {
                q30Var.b(true);
            }
            ij ijVar = this.f42431u2;
            if (ijVar != null) {
                ijVar.b(true);
            }
            org.telegram.ui.Components.q30 q30Var2 = this.f42456w2;
            if (q30Var2 != null) {
                q30Var2.b(true);
            }
        }
        org.telegram.ui.Components.q30 q30Var3 = this.f42494z2;
        if (q30Var3 != null) {
            q30Var3.b(true);
        }
        org.telegram.ui.Components.q30 q30Var4 = this.f42482y2;
        if (q30Var4 != null) {
            q30Var4.b(true);
        }
        org.telegram.ui.Components.q30 q30Var5 = this.H2;
        if (q30Var5 != null) {
            q30Var5.b(true);
        }
        org.telegram.ui.Components.q30 q30Var6 = this.I2;
        if (q30Var6 != null) {
            q30Var6.b(true);
        }
        org.telegram.ui.Components.q30 q30Var7 = this.B2;
        if (q30Var7 != null) {
            q30Var7.b(true);
        }
        org.telegram.ui.Components.q30 q30Var8 = this.C2;
        if (q30Var8 != null) {
            q30Var8.b(true);
        }
        org.telegram.ui.Components.hp hpVar = this.J2;
        if (hpVar != null) {
            hpVar.a();
        }
        vh.p2 p2Var = this.X0;
        if (p2Var != null) {
            p2Var.e(true);
        }
        vh.p2 p2Var2 = this.Z0;
        if (p2Var2 != null) {
            p2Var2.e(true);
        }
        vh.p2 p2Var3 = this.Y0;
        if (p2Var3 != null) {
            p2Var3.e(true);
        }
    }

    public final boolean ua(String str, org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, int i10, int i11) {
        bi.u0 u0Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i12;
        Integer num2;
        TLRPC.TL_forumTopic f7;
        if (this.e == null || str == null || this.f42248f4 != 0) {
            return false;
        }
        if (q1Var != null && (characterStyle != null || i11 != 1)) {
            u0Var = new bi.u0(this, i10, i11, characterStyle, q1Var);
        } else {
            u0Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (org.telegram.messenger.w3.K(this.e, false) != null) {
                try {
                    if (f42172dd == null) {
                        f42172dd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f42173ed = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f42172dd.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (org.telegram.messenger.w3.O(matcher.group(2), this.e)) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.z(parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.z(parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.z(queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g10 = ih.g.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i12 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i12 = 0;
                                    }
                                    if (org.telegram.messenger.w3.c0(this.e) && i12 != b()) {
                                        return false;
                                    }
                                    this.J7 = true;
                                    if (this.f42248f4 == 2) {
                                        this.f42300j9.T0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int V = LaunchActivity.V(parse);
                                    this.O7 = V;
                                    if (V >= 0) {
                                        this.P7 = parseInt;
                                    }
                                    nb(parseInt, i10, true, 0, false, 0, num, g10, u0Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e) {
                            e = e;
                            org.telegram.messenger.f8.g(e, true);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = f42173ed.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (org.telegram.messenger.w3.O(matcher2.group(2), this.e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f42462w8 = queryParameter2;
                                        W6(true);
                                        return true;
                                    }
                                    return z10;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e7) {
                            org.telegram.messenger.f8.g(e7, true);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.z(parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.z(parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.z(parse2.getQueryParameter("comment")).intValue();
                    if (org.telegram.messenger.w3.O(lowerCase, this.e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f42248f4 == 2) {
                            this.f42300j9.T0(intValue3);
                            finishFragment();
                            return true;
                        }
                        nb(intValue3, i10, true, 0, false, 0, null, null, u0Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e10) {
                    e = e10;
                    z10 = false;
                }
            } else {
                try {
                    if (f42174fd == null) {
                        f42174fd = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f42174fd.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.e.f19793id || parseInt3 == 0) {
                        return false;
                    }
                    Uri parse3 = Uri.parse(str);
                    int intValue6 = Utilities.z(parse3.getQueryParameter("thread")).intValue();
                    int intValue7 = Utilities.z(parse3.getQueryParameter("topic")).intValue();
                    int intValue8 = Utilities.z(parse3.getQueryParameter("comment")).intValue();
                    String queryParameter3 = parse3.getQueryParameter("task");
                    if (queryParameter3 != null) {
                        num2 = Utilities.z(queryParameter3);
                    } else {
                        num2 = null;
                    }
                    byte[] g11 = ih.g.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (org.telegram.messenger.w3.c0(this.e) && (f7 = getMessagesController().f18891r7.f(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f42382q4;
                            if (tL_forumTopic == null || tL_forumTopic.f19845id != f7.f19845id) {
                                return false;
                            }
                            return true;
                        }
                        this.J7 = true;
                        if (this.f42248f4 == 2) {
                            this.f42300j9.T0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        nb(parseInt3, i10, true, 0, false, 0, num2, g11, u0Var);
                        return true;
                    }
                    return false;
                } catch (Exception e11) {
                    org.telegram.messenger.f8.g(e11, true);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.z(parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.A(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.z(parse4.getQueryParameter("thread")).intValue();
            long j10 = this.e.f19793id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                qa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.J7 = true;
            if (this.f42248f4 == 2) {
                this.f42300j9.T0(intValue9);
                finishFragment();
                return true;
            }
            nb(intValue9, i10, true, 0, false, 0, null, null, u0Var);
            return true;
        }
    }

    public final void ub(ClipData clipData, boolean z10, int i10) {
        int i11 = 0;
        if (this.F5 != null) {
            while (i11 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i11).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    yb(i10, arrayList, z10);
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
        yb(i10, arrayList2, z10);
    }

    public final void uc(boolean z10) {
        if (!getMessagesController().q2(this.f42297j6, b(), null)) {
            if (z10) {
                getNotificationsController().G(this.f42297j6, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.z2 E = org.telegram.ui.Components.s4.E(this.f42297j6, b(), this, this.f42477xa);
            boolean J9 = J9();
            E.f21601h0 = J9;
            E.f21606n = J9;
            showDialog(E);
            return;
        }
        getNotificationsController().G(this.f42297j6, b(), false);
        if (!z10) {
            org.telegram.ui.Components.cc.z(this, 4, 0, this.f42477xa).j();
        }
    }

    @Override
    public final void v(int i10, float f7, float f10, fe.f fVar) {
        boolean z10;
        int i11;
        int i12;
        if (i10 == 0) {
            ia();
            return;
        }
        boolean z11 = true;
        int i13 = 4;
        int i14 = 0;
        if (i10 == 1) {
            View view = this.U;
            if (view != null) {
                view.setAlpha(f7);
                View view2 = this.U;
                if (f7 > 0.0f) {
                    i13 = 0;
                }
                view2.setVisibility(i13);
            }
        } else if (i10 == 2) {
            ia();
            A7();
            ih.d dVar = this.Yc;
            if (dVar != null) {
                dVar.setAnimatedVisibility(this.Sc.e);
            }
        } else {
            int i15 = 8;
            if (i10 == 3) {
                fe.b bVar = this.Tc;
                float f11 = 1.0f - bVar.e;
                this.f42180a1.setAlpha(f11);
                org.telegram.ui.Components.hg hgVar = this.f42180a1;
                if (f11 > 0.0f) {
                    i12 = 0;
                } else {
                    i12 = 8;
                }
                hgVar.setVisibility(i12);
                float f12 = 1.0f - bVar.e;
                org.telegram.ui.Components.o21 o21Var = this.f42246f2;
                if (o21Var != null) {
                    o21Var.setAlpha(f12);
                    org.telegram.ui.Components.o21 o21Var2 = this.f42246f2;
                    if (f12 <= 0.0f) {
                        i14 = 8;
                    }
                    o21Var2.setVisibility(i14);
                }
            } else if (i10 == 4) {
                org.telegram.ui.Components.voip.i0 i0Var = this.Y3;
                fe.b bVar2 = this.Uc;
                if (i0Var != null) {
                    float f13 = bVar2.e;
                    i0Var.setAlpha(f13);
                    org.telegram.ui.Components.voip.i0 i0Var2 = this.Y3;
                    if (f13 > 0.0f) {
                        i15 = 0;
                    }
                    i0Var2.setVisibility(i15);
                }
                if (bVar2.e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                bh.i iVar = this.Y;
                if (z10) {
                    i11 = 0;
                } else {
                    i11 = 4;
                }
                iVar.setVisibility(i11);
                t7();
                if (bVar2.e >= 1.0f) {
                    z11 = false;
                }
                vj vjVar = this.f42492z0;
                if (z11) {
                    i13 = 0;
                }
                vjVar.setVisibility(i13);
                A7();
                D7();
                C7();
                this.glassEngine.g();
            } else if (i10 == 5) {
                s7();
                org.telegram.ui.ActionBar.l lVar = this.actionBar;
                if (lVar != null) {
                    lVar.setSearchFactor(f7);
                }
            } else if (i10 == 6) {
                x7();
            }
        }
    }

    public final void v7() {
        float d;
        if (this.f42492z0 != null) {
            if (this.f42289ib && this.f42463wa == null) {
                d = org.telegram.messenger.i0.f16021n;
            } else {
                d = this.f42453w.d() + j9(org.telegram.ui.Components.k21.f27624c) + org.telegram.messenger.i0.L(16.0f) + this.Ua + this.Oc;
            }
            int i10 = (int) this.L9;
            org.telegram.ui.Components.o21 o21Var = this.f42246f2;
            if (o21Var != null) {
                o21Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            s4.f0 f0Var = this.f42480y0;
            boolean z10 = this.f42492z0.V1;
            RecyclerView recyclerView = f0Var.f47926a;
            int i11 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i10 || paddingBottom != i11) {
                int i12 = paddingTop - i10;
                if (!z10 && i12 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i12 >= 0 || canScrollVertically) && (i12 <= 0 || canScrollVertically2)) {
                        org.telegram.messenger.i0.J(recyclerView, new org.telegram.utils.twidget.v(f0Var, i12, 11));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i10, recyclerView.getPaddingRight(), i11);
            }
            zg.d dVar = this.f42196b4;
            if (dVar != null) {
                RectF rectF = dVar.f55732b;
                rectF.set(j9(org.telegram.ui.Components.k21.f27623b), i10 - this.H, 0.0f, d - this.Ua);
                dVar.f55733c.set(rectF.left, rectF.top, dVar.getMeasuredWidth() - rectF.right, dVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void v8() {
        CharSequence charSequence;
        mk mkVar = this.Z;
        if (mkVar != null) {
            charSequence = mkVar.getFieldText();
        } else {
            charSequence = null;
        }
        u8(charSequence, null);
    }

    public final void v9() {
        ValueAnimator valueAnimator = this.Bb;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.s0 s0Var = this.f42344n3;
        if (s0Var != null && s0Var.getTag() != null) {
            this.f42344n3.setTag(null);
            org.telegram.ui.Cells.s0 s0Var2 = this.f42344n3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new gf(this, s0Var2, 1));
            ofFloat.addListener(new bg.f(11, this, s0Var2));
            ofFloat.setDuration(150L);
            this.Bb = ofFloat;
            ofFloat.start();
        }
    }

    public final void va(org.telegram.messenger.jj jjVar) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = jjVar.f16337k.peer_id;
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
        bundle.putInt("message_id", jjVar.M1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new un(bundle));
        }
    }

    public final void vb(ArrayList arrayList, String str, boolean z10, int i10, long j10, boolean z11) {
        long j11;
        if (n7()) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.messenger.oz b10 = org.telegram.messenger.oz.b(str, this.f42297j6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b10.K = P8();
                b10.O = j10;
                b10.L = z11;
                b10.Q = 0L;
                b10.R = a9();
                b10.T = this.f42459w5;
                org.telegram.messenger.qz.C(this.currentAccount).r0(b10);
                j11 = 0;
            } else {
                j11 = j10;
            }
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.messenger.oz g10 = org.telegram.messenger.oz.g((TLRPC.User) obj, this.f42297j6, null, null, null, null, z10, i10, 0);
                g10.K = P8();
                g10.O = j11;
                g10.L = z11;
                g10.Q = 0L;
                g10.R = a9();
                g10.T = this.f42459w5;
                getSendMessagesHelper().r0(g10);
                j11 = 0;
            }
            F6();
        }
    }

    public final void vc(org.telegram.ui.ActionBar.r0 r0Var, boolean z10) {
        Set set;
        if (r0Var != null) {
            if (z10) {
                set = this.U0;
            } else {
                set = this.T0;
            }
            set.add(r0Var);
        }
    }

    public final void w7() {
        FrameLayout frameLayout = this.f42233e1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.T.getInputBubbleHeight() + this.f42453w.c() + org.telegram.messenger.i0.L(9.0f)) * (-0.5f));
        }
    }

    public final void w8(boolean z10) {
        TLRPC.Chat chat = this.e;
        if (chat != null && this.f42374p8 != null && !org.telegram.messenger.w3.r0(chat) && !this.e.creator) {
            TLRPC.ChatFull chatFull = this.f42374p8;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f42389r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f42389r = chatParticipant.inviter_id;
                    return;
                }
                long e = getUserConfig().e();
                int size = this.f42374p8.participants.participants.size();
                for (int i10 = 0; i10 < size; i10++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f42374p8.participants.participants.get(i10);
                    if (chatParticipant2.user_id == e) {
                        this.f42389r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f42389r == 0) {
                getMessagesController().G(this.e.f19793id, false);
            }
        }
    }

    public final boolean w9(boolean z10) {
        jl jlVar;
        jl jlVar2 = this.L2;
        if (jlVar2 == null || jlVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.hg hgVar = this.f42180a1;
        if (hgVar != null && (jlVar = this.L2) != null) {
            hgVar.i(jlVar, false, z10);
        }
        int i10 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.V2;
            if (i10 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i10];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i10] = null;
                }
                i10++;
            } else {
                this.O2 = false;
                this.L2.setTag(1);
                return true;
            }
        }
    }

    public final void wa(org.telegram.messenger.jj jjVar) {
        if (org.telegram.messenger.h20.B(this.f42243f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = jjVar.f16337k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f42243f.f19942id) {
                k(messageFwdHeader.saved_from_msg_id, jjVar.f1(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = jjVar.f16337k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", jjVar.f16337k.fwd_from.saved_from_msg_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new un(bundle));
        }
    }

    public final void wb(int i10, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                org.telegram.messenger.ef efVar = (org.telegram.messenger.ef) obj;
                ?? obj2 = new Object();
                if (!efVar.f19507b && (str2 = efVar.h) != null) {
                    obj2.f17515c = str2;
                } else {
                    String str3 = efVar.I;
                    if (str3 != null) {
                        obj2.f17515c = str3;
                    }
                }
                obj2.e = efVar.f19508c;
                obj2.f17516f = efVar.f19510g;
                obj2.f17525p = efVar.d();
                obj2.f17524o = efVar.f19507b;
                obj2.f17526q = efVar.i();
                obj2.f17534z = efVar.f19515m;
                obj2.A = efVar.P;
                CharSequence charSequence = efVar.f19506a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.f17518i = efVar.f19516n;
                obj2.f17519j = efVar.f19520r;
                obj2.h = efVar.f19525x;
                obj2.f17520k = efVar.f19521s;
                obj2.f17527r = efVar.L;
                obj2.f17532x = efVar.c();
                arrayList2.add(obj2);
                efVar.e();
            }
            u8(((org.telegram.messenger.pz) arrayList2.get(0)).d, ((org.telegram.messenger.pz) arrayList2.get(0)).f17518i);
            org.telegram.messenger.qz.X(getAccountInstance(), arrayList2, this.f42297j6, this.D5, this.l4, null, this.B5, z11, true, null, null, z10, i10, 0, ((org.telegram.messenger.pz) arrayList2.get(0)).f17529t, null, P8(), 0L, false, 0L, a9(), this.f42459w5, null, false);
            F6();
            mk mkVar = this.Z;
            if (mkVar != null) {
                mkVar.setFieldText("");
            }
        }
        if (i10 != 0) {
            if (this.f42260g4 == -1) {
                this.f42260g4 = 0;
            }
            this.f42260g4 = arrayList.size() + this.f42260g4;
            Yc(true);
        }
    }

    public final void wc(org.telegram.messenger.jj jjVar) {
        if (jjVar == null) {
            return;
        }
        org.telegram.ui.Components.wb wbVar = this.O3;
        if (wbVar != null) {
            wbVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f42421t5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(jjVar.f1()));
        int i10 = this.f42211c5;
        getNotificationCenter().k(org.telegram.messenger.zs.f19691t0, Long.valueOf(this.f42297j6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f42211c5 - 1), Boolean.valueOf(this.f42237e5));
        this.O3 = org.telegram.ui.Components.cc.B(this, false, new ag.g3(this, arrayList2, arrayList, i10, 11), new ue(this, jjVar, 7), this.f42477xa).j();
    }

    public final void x7() {
        int i10;
        float f7 = this.Wc.e;
        org.telegram.ui.Components.l30 l30Var = this.H1;
        int i11 = 8;
        if (l30Var != null) {
            l30Var.setAlpha(f7);
            org.telegram.ui.Components.l30 l30Var2 = this.H1;
            if (f7 > 0.0f) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            l30Var2.setVisibility(i10);
        }
        ag.b1 b1Var = this.Z3;
        if (b1Var != null) {
            float f10 = 1.0f - f7;
            b1Var.setAlpha(f10);
            ag.b1 b1Var2 = this.Z3;
            if (f10 > 0.0f) {
                i11 = 0;
            }
            b1Var2.setVisibility(i11);
        }
    }

    public final void x8(org.telegram.messenger.jj r76, java.util.ArrayList r77, java.util.ArrayList r78, java.util.ArrayList r79) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.x8(org.telegram.messenger.jj, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void x9() {
        dl dlVar = this.f42464wb;
        if (dlVar == null) {
            return;
        }
        this.f42464wb = null;
        dlVar.e();
        if (dlVar.getReactionsWindow() != null && dlVar.getReactionsWindow().f48275a != null) {
            dlVar.getReactionsWindow().f48275a.animate().alpha(0.0f).setDuration(180L).start();
        }
        dlVar.animate().alpha(0.01f).translationY(-org.telegram.messenger.i0.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new zg(8, this, dlVar)).setDuration(180L).start();
    }

    public final void xa(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.jj jjVar) {
        org.telegram.ui.Cells.q1 q1Var2;
        boolean z10;
        long j10;
        long j11;
        org.telegram.ui.Components.s5 m10;
        Bitmap m11;
        if (q1Var == null) {
            int childCount = this.f42492z0.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.f42492z0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getMessageObject().T(jjVar)) {
                        break;
                    }
                }
            }
        }
        q1Var2 = q1Var;
        if (org.telegram.messenger.jj.L4(jjVar.f16337k)) {
            xb(jjVar, true);
        }
        if (org.telegram.messenger.jj.L4(jjVar.f16337k) && !jjVar.D2(true) && org.telegram.messenger.tz.B0 && jjVar.B() && !org.telegram.messenger.o5.C(org.telegram.messenger.jj.B0(jjVar.f16337k)) && !jjVar.f16387x0 && !jjVar.f16383w0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.b8 fileLoader = getFileLoader();
            TLRPC.Document F0 = jjVar.F0();
            fileLoader.getClass();
            org.telegram.messenger.b8.J.c(new org.telegram.messenger.mg(fileLoader, F0, jjVar, 22));
        }
        PhotoViewer.v1().N2(null, this, this.f42477xa);
        org.telegram.messenger.jj jjVar2 = MediaController.B().f14482u0;
        if (q1Var2 != null && jjVar2 != null && org.telegram.messenger.jj.L4(jjVar2.f16337k)) {
            getFileLoader().d0(jjVar2.F0(), false);
            if (jjVar2.T(jjVar) && (m10 = q1Var2.getPhotoImage().m()) != null && this.K8 != null && this.H8.getTag() != null && (m11 = m10.m()) != null) {
                try {
                    Bitmap bitmap = this.K8.getBitmap(m11.getWidth(), m11.getHeight());
                    new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    org.telegram.messenger.f8.g(th2, true);
                }
            }
            MediaController.B().q(true, true, false, jjVar2.T(jjVar));
        }
        if (this.f42248f4 == 1 && (org.telegram.messenger.jj.L4(jjVar.f16337k) || jjVar.D == 1)) {
            PhotoViewer.v1().l4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.K6.size();
            for (int i11 = 0; i11 < size; i11++) {
                org.telegram.messenger.jj jjVar3 = (org.telegram.messenger.jj) this.K6.get(i11);
                if (org.telegram.messenger.jj.L4(jjVar3.f16337k) || jjVar3.D == 1) {
                    arrayList.add(0, jjVar3);
                }
            }
            PhotoViewer.v1().e2(arrayList, arrayList.indexOf(jjVar), this.f42297j6, 0L, b(), this.Za);
        } else {
            PhotoViewer v12 = PhotoViewer.v1();
            int i12 = jjVar.D;
            long j12 = 0;
            if (i12 != 0) {
                j10 = this.f42297j6;
            } else {
                j10 = 0;
            }
            if (i12 != 0) {
                j11 = this.f42199b7;
            } else {
                j11 = 0;
            }
            if (i12 != 0) {
                j12 = b();
            }
            if (!v12.i2(jjVar, this, j10, j11, j12, this.Za) && z10) {
                getFileLoader().f(jjVar.F0());
            }
        }
        u9(false);
        MediaController.B().f14484v0 = null;
    }

    public final ue xb(org.telegram.messenger.jj jjVar, boolean z10) {
        int i10;
        boolean z11;
        int i11;
        if (jjVar == null || jjVar.N3() || !jjVar.l4()) {
            return null;
        }
        TLRPC.Message message = jjVar.f16337k;
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
                getMessagesController().m3(this.f42297j6, i11, jjVar.f16337k.random_id);
                return null;
            }
            getMessagesController().n3(this.f42297j6, jjVar.f1(), null, i11, 0L, z11);
            return null;
        }
        return new ue(this, jjVar, 1);
    }

    public final void xc() {
        boolean M9 = M9();
        SparseArray[] sparseArrayArr = this.f42333m6;
        if (!M9) {
            if (this.actionBar.u() && this.f42368p1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f42368p1.c(org.telegram.messenger.cd.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.D0.setText(org.telegram.messenger.cd.L0(2131746230, null));
            this.D0.setAlpha(0.5f);
            this.D0.setEnabled(false);
            return;
        }
        this.D0.setText(org.telegram.messenger.cd.a0(null, null, 2131746231, org.telegram.messenger.cd.G(size, "messages", new Object[0])));
        this.D0.setAlpha(1.0f);
        this.D0.setEnabled(true);
    }

    @Override
    public final boolean y(final org.telegram.ui.ay r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, org.telegram.ui.pb1 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.y(org.telegram.ui.ay, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.pb1):boolean");
    }

    public final void y7() {
        if (this.l1 == null) {
            return;
        }
        this.Oc = J6(false);
        this.Pc = J6(true);
        this.T.setInputBubbleHeight(this.Oc);
        Qc();
        Ac();
        u7();
        r7();
        w7();
        v7();
    }

    public final int y8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.un.y8():int");
    }

    public final void y9() {
        UndoView undoView = this.M3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.wb wbVar = this.O3;
        if (wbVar != null) {
            wbVar.c(0L, false);
        }
        il ilVar = this.N3;
        if (ilVar != null) {
            ilVar.d(0, true);
        }
    }

    public final void ya(boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var;
        int i10;
        if (getParentActivity() != null && (z4Var = this.parentLayout) != null && z4Var.getLastFragment() == this && !this.T4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f19793id);
            } else {
                bundle.putLong("user_id", this.f42243f.f19942id);
            }
            bundle.putInt("chatMode", 2);
            un unVar = new un(bundle);
            unVar.T4 = new ArrayList(this.T4);
            unVar.V4 = new HashMap(this.V4);
            int size = this.T4.size();
            for (int i11 = 0; i11 < size; i11++) {
                Integer num = (Integer) this.T4.get(i11);
                org.telegram.messenger.jj jjVar = (org.telegram.messenger.jj) this.V4.get(num);
                org.telegram.messenger.jj jjVar2 = (org.telegram.messenger.jj) this.E6[0].get(num.intValue());
                if (jjVar == null) {
                    jjVar = jjVar2;
                } else if (jjVar2 != null) {
                    jjVar.f16387x0 = jjVar2.f16387x0;
                    jjVar.f16383w0 = jjVar2.f16383w0;
                }
                if (jjVar != null) {
                    unVar.V4.put(num, jjVar);
                    unVar.Tc();
                }
            }
            unVar.f42197b5 = this.f42197b5;
            if (this.f42445v4) {
                i10 = this.T4.size();
            } else {
                i10 = this.f42211c5;
            }
            unVar.f42211c5 = i10;
            unVar.f42237e5 = this.f42237e5;
            unVar.f42385q8 = this.f42385q8;
            unVar.f42374p8 = this.f42374p8;
            unVar.f42300j9 = new nl(this, unVar);
            if (z10) {
                presentFragmentAsPreview(unVar);
                l7();
                return;
            }
            presentFragment(unVar, false);
        }
    }

    public final void yb(int i10, ArrayList arrayList, boolean z10) {
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
                    org.telegram.messenger.f8.g(e, true);
                }
            }
            if (!org.telegram.messenger.v2.f18449b) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(uri);
                arrayList4 = arrayList5;
            } else {
                String T0 = org.telegram.messenger.i0.T0(uri);
                if (T0 == null) {
                    String uri3 = uri.toString();
                    String t10 = MediaController.t(-1L, uri, "file");
                    if (t10 == null) {
                        Mb();
                    } else {
                        str = uri3;
                        T0 = t10;
                    }
                } else {
                    str = T0;
                }
                if (arrayList2 == null) {
                    arrayList2 = new ArrayList();
                    arrayList3 = new ArrayList();
                }
                ArrayList arrayList6 = arrayList3;
                arrayList2.add(T0);
                arrayList6.add(str);
                arrayList3 = arrayList6;
            }
        }
        if (arrayList2 == null && arrayList4 == null) {
            return;
        }
        v8();
        org.telegram.messenger.qz.V(i10, this.f42297j6, 0L, 0L, 0L, null, null, null, arrayList2, arrayList3, arrayList4, null, null, null, null, getAccountInstance(), this.D5, this.l4, this.F5, null, P8(), null, this.B5, z10, false);
        r9(false);
    }

    public final void yc() {
        Drawable s02;
        km kmVar = this.l1;
        if (kmVar != null && this.f42451va == null) {
            if (this.f42477xa.h == null || kmVar.getBackgroundImage() == null) {
                if (this.l1.getBackgroundImage() == null || org.telegram.messenger.i0.Q1()) {
                    if (G9()) {
                        s02 = this.l1.getCompactBackground();
                    } else {
                        s02 = org.telegram.ui.ActionBar.t6.s0();
                    }
                    km kmVar2 = this.l1;
                    if (!G9()) {
                        boolean z10 = org.telegram.ui.ActionBar.t6.f21014i0;
                    }
                    kmVar2.U(s02);
                }
            }
        }
    }

    @Override
    public final boolean z() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void z6(org.telegram.messenger.jj jjVar, Integer num) {
        org.telegram.messenger.jj jjVar2 = jjVar.C;
        if (jjVar2 != null) {
            int f12 = jjVar2.f1();
            SparseArray sparseArray = this.G6;
            ArrayList arrayList = (ArrayList) sparseArray.get(f12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(f12, arrayList);
            }
            int f13 = jjVar.f1();
            if (!arrayList.contains(Integer.valueOf(f13))) {
                arrayList.add(Integer.valueOf(f13));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void z7() {
        int i10;
        un unVar = this.f42463wa;
        if (unVar != null) {
            unVar.z7();
        }
        int L = org.telegram.messenger.i0.L(2.0f) + org.telegram.ui.ActionBar.l.getCurrentActionBarHeight() + org.telegram.messenger.i0.f16020m + ((int) i9(org.telegram.messenger.i0.L(7.0f)));
        wk wkVar = this.C1;
        if (wkVar != null) {
            i10 = org.telegram.messenger.i0.L(wkVar.E * 35.0f);
        } else {
            i10 = 0;
        }
        int L2 = org.telegram.messenger.i0.L(M8() * 43.0f) + L + i10;
        int L3 = org.telegram.messenger.i0.L(60.0f) + ((int) this.f42453w.d());
        ag.b1 b1Var = this.Z3;
        if (b1Var != null) {
            b1Var.setPadding(0, L2, 0, L3);
        }
        org.telegram.ui.Components.l30 l30Var = this.H1;
        if (l30Var != null) {
            l30Var.e.setPadding(0, L2, 0, L3);
            l30Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        org.telegram.ui.Components.voip.i0 i0Var = this.Y3;
        if (i0Var != null) {
            bh.i iVar = (bh.i) i0Var.f31475b;
            iVar.setFadeZoneTop(L2);
            iVar.setFadeZoneBottom(L3);
        }
        org.telegram.ui.Components.zz zzVar = this.f42380q2;
        if (zzVar != null) {
            zzVar.setTranslationY(L2);
        }
        org.telegram.ui.Components.dw0 dw0Var = this.f42392r2;
        if (dw0Var != null) {
            dw0Var.f25549a.setTranslationY(((L2 - L3) / 2.0f) + org.telegram.messenger.i0.L(32.0f));
        }
    }

    public final void z9() {
        boolean z10;
        Zc(0, 0, -1);
        getMediaDataController().X1(this.H3, this.f42297j6, this.f42199b7, this.classGuid, 0, this.f42394r4, false, this.C3, this.D3, true, this.E3);
        if (TextUtils.isEmpty(this.H3) && this.E3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.G3 = z10;
        this.f42378q0 = z10;
        Bc(false);
        cd();
    }

    public final void za(int i10, boolean z10) {
        org.telegram.ui.ActionBar.z4 z4Var = this.parentLayout;
        if (z4Var != null && z4Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f19801id);
            } else {
                TLRPC.Chat chat = this.e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f19793id);
                } else {
                    bundle.putLong("user_id", this.f42243f.f19942id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i10);
                bundle.putBoolean("converting_toast", true);
            }
            un unVar = new un(bundle);
            if (this.f42445v4) {
                gg.e.a(unVar, org.telegram.messenger.gs.a(a(), b()));
            }
            unVar.f42300j9 = new rj(this);
            presentFragment(unVar, false);
        }
    }

    public final void zb(org.telegram.messenger.jj jjVar, org.telegram.ui.Cells.q1 q1Var, int i10, boolean z10) {
        boolean z11;
        org.telegram.messenger.ej k92 = k9(jjVar);
        boolean z12 = false;
        if (k92 != null) {
            ArrayList arrayList = k92.d;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList.size()) {
                    if (this.f42333m6[i10].indexOfKey(((org.telegram.messenger.jj) arrayList.get(i11)).f1()) < 0) {
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
        q1Var.setDrawSelectionBackground(z11);
        if (k92 == null) {
            z12 = true;
        }
        q1Var.h3(true, z12, z10);
    }

    public final void zc() {
        TLRPC.User user;
        boolean z10;
        if (this.f42279i0 != null && (user = this.f42243f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f42424t8;
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
                this.f42279i0.S(30);
            } else {
                this.f42279i0.t(30);
            }
            if (z10) {
                this.f42279i0.S(31);
            } else {
                this.f42279i0.t(31);
            }
        }
    }

    public void la(boolean z10) {
    }

    @Override
    public final void S() {
    }
}
