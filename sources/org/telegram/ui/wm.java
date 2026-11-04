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
import j$.util.Comparator$CC;
import j$.util.concurrent.ConcurrentHashMap;
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
public class wm extends org.telegram.ui.ActionBar.d2 implements org.telegram.messenger.cs, nw, ia0, org.telegram.ui.Components.lj, org.telegram.ui.Components.ig, qg.b, org.telegram.ui.Components.x30, qe.b {
    public static int f51227jd = 22;
    public static float f51228kd = 1.4f;
    public static int f51229ld = 10;
    public static Pattern f51230md;
    public static Pattern f51231nd;
    public static Pattern f51232od;
    public static final int[] f51233pd = {org.telegram.messenger.hs.f23339y, org.telegram.messenger.hs.f23346z, org.telegram.messenger.hs.A, org.telegram.messenger.hs.B, org.telegram.messenger.hs.Z, org.telegram.messenger.hs.C0, org.telegram.messenger.hs.f23306t0, org.telegram.messenger.hs.W0, org.telegram.messenger.hs.f23220e1, org.telegram.messenger.hs.T1, org.telegram.messenger.hs.G, org.telegram.messenger.hs.f23305t, org.telegram.messenger.hs.U, org.telegram.messenger.hs.E0, org.telegram.messenger.hs.F0, org.telegram.messenger.hs.f23351z4, org.telegram.messenger.hs.f23234g3, org.telegram.messenger.hs.f23284p4, org.telegram.messenger.hs.L};
    public static boolean f51234qd = false;
    public static final Rect f51235rd = new Rect();
    public wi A0;
    public int A1;
    public gi.l3 A2;
    public boolean A3;
    public int A4;
    public org.telegram.messenger.ui A5;
    public int A6;
    public int A7;
    public String A8;
    public boolean A9;
    public final org.telegram.messenger.i3 Aa;
    public boolean Ab;
    public boolean Ac;
    public yi B0;
    public int B1;
    public gi.l3 B2;
    public boolean B3;
    public int B4;
    public org.telegram.messenger.zi B5;
    public int B6;
    public boolean B7;
    public String B8;
    public pk B9;
    public TLRPC.TL_channels_sendAsPeers Ba;
    public boolean Bb;
    public x8 Bc;
    public zi C0;
    public org.telegram.ui.Components.ac C1;
    public gi.l3 C2;
    public boolean C3;
    public ch C4;
    public mm C5;
    public int C6;
    public boolean C7;
    public org.telegram.messenger.zi C8;
    public boolean C9;
    public TL_account.resolvedBusinessChatLinks Ca;
    public ArrayList Cb;
    public int Cc;
    public fl D0;
    public wj D1;
    public gi.l3 D2;
    public TLRPC.User D3;
    public final SparseArray D4;
    public boolean D5;
    public boolean D6;
    public boolean D7;
    public org.telegram.messenger.zi D8;
    public float D9;
    public boolean Da;
    public ValueAnimator Db;
    public TLRPC.DraftMessage Dc;
    public ki E;
    public rj E0;
    public jj E1;
    public org.telegram.ui.Cells.q1 E2;
    public TLRPC.Chat E3;
    public final ArrayList E4;
    public org.telegram.messenger.zi E5;
    public final ArrayList E6;
    public int E7;
    public int E8;
    public gj E9;
    public boolean Ea;
    public boolean Eb;
    public boolean Ec;
    public final ue.b F;
    public boolean F0;
    public gi.g1 F1;
    public int F2;
    public dh.n0 F3;
    public int F4;
    public int F5;
    public final SparseArray[] F6;
    public int F7;
    public boolean F8;
    public org.telegram.ui.Cells.q1 F9;
    public float Fa;
    public Boolean Fb;
    public ValueAnimator Fc;
    public final ue.b G;
    public org.telegram.ui.Components.s70 G0;
    public int G1;
    public int G2;
    public boolean G3;
    public boolean G4;
    public org.telegram.messenger.zi G5;
    public final SparseArray G6;
    public boolean G7;
    public boolean G8;
    public org.telegram.ui.Components.gz G9;
    public final rf Ga;
    public boolean Gb;
    public zh Gc;
    public final eh.g H;
    public TextView H0;
    public boolean H1;
    public gi.l3 H2;
    public boolean H3;
    public boolean H4;
    public boolean H5;
    public final SparseArray H6;
    public xe H7;
    public String H8;
    public boolean H9;
    public final ak Ha;
    public final int[] Hb;
    public boolean Hc;
    public final int I;
    public org.telegram.ui.ActionBar.k2 I0;
    public org.telegram.ui.Components.p20 I1;
    public gi.l3 I2;
    public String I3;
    public int I4;
    public boolean I5;
    public final HashMap I6;
    public String I7;
    public pj I8;
    public boolean I9;
    public int Ia;
    public org.telegram.ui.Cells.q1 Ib;
    public int Ic;
    public final si.f J;
    public RadialProgressView J0;
    public org.telegram.ui.ActionBar.s1 J1;
    public gi.l3 J2;
    public String J3;
    public final ArrayList J4;
    public boolean J5;
    public final SparseArray J6;
    public boolean J7;
    public org.telegram.ui.Cells.q1 J8;
    public ValueAnimator J9;
    public int Ja;
    public org.telegram.ui.Cells.q1 Jb;
    public int Jc;
    public final si.f K;
    public final int K0;
    public gi.l3 K1;
    public org.telegram.ui.Components.zo K2;
    public int K3;
    public final HashMap K4;
    public boolean K5;
    public final a0.h K6;
    public boolean K7;
    public l4 K8;
    public ValueAnimator K9;
    public xe Ka;
    public int Kb;
    public int Kc;
    public eh.c L;
    public int L0;
    public gi.l3 L1;
    public View L2;
    public int L3;
    public org.telegram.messenger.zi L4;
    public int L5;
    public final ArrayList L6;
    public int L7;
    public TextureView L8;
    public boolean L9;
    public boolean La;
    public boolean Lb;
    public int Lc;
    public eh.c M;
    public int M0;
    public gi.l3 M1;
    public jk M2;
    public int M3;
    public int M4;
    public int M5;
    public final SparseArray M6;
    public int M7;
    public boolean M8;
    public float M9;
    public boolean Ma;
    public int Mb;
    public int Mc;
    public final si.g N;
    public int N0;
    public gi.l3 N1;
    public gi.n5 N2;
    public UndoView N3;
    public int N4;
    public TLRPC.PhotoSize N5;
    public final a0.h N6;
    public int N7;
    public final xe N8;
    public float N9;
    public long Na;
    public HashMap Nb;
    public boolean Nc;
    public eh.c O;
    public int O0;
    public gi.l3 O1;
    public org.telegram.ui.Components.xd0 O2;
    public ik O3;
    public final ArrayList O4;
    public TLRPC.PhotoSize O5;
    public final a0.h O6;
    public int O7;
    public final si.b O8;
    public int O9;
    public int Oa;
    public xe Ob;
    public long Oc;
    public org.telegram.ui.ActionBar.s1 P;
    public Drawable P0;
    public gi.l3 P1;
    public boolean P2;
    public org.telegram.ui.Components.ac P3;
    public xe P4;
    public TLObject P5;
    public final int[] P6;
    public int P7;
    public eh.c P8;
    public int P9;
    public int Pa;
    public int Pb;
    public TLRPC.TL_messages_discussionMessage Pc;
    public boolean Q;
    public Drawable Q0;
    public vk Q1;
    public final org.telegram.ui.Components.k9[] Q2;
    public boolean Q3;
    public boolean Q4;
    public int Q5;
    public final int[] Q6;
    public int Q7;
    public Bitmap Q8;
    public float Q9;
    public uj Qa;
    public org.telegram.ui.ActionBar.s1 Qb;
    public TLRPC.messages_Messages Qc;
    public FrameLayout R;
    public Drawable R0;
    public float R1;
    public final vm[] R2;
    public int R3;
    public boolean R4;
    public int R5;
    public final int[] R6;
    public boolean R7;
    public BitmapShader R8;
    public float R9;
    public vj Ra;
    public int Rb;
    public boolean Rc;
    public gi.n5 S;
    public boolean S0;
    public TL_stories.TL_premium_boostsStatus S1;
    public final org.telegram.ui.ActionBar.k5[] S2;
    public boolean S3;
    public boolean S4;
    public boolean S5;
    public final int[] S6;
    public int S7;
    public Paint S8;
    public float S9;
    public boolean Sa;
    public int Sb;
    public om Sc;
    public pj T;
    public int T0;
    public org.telegram.messenger.e3 T1;
    public final lm[] T2;
    public org.telegram.messenger.n6 T3;
    public int T4;
    public TLRPC.PhotoSize T5;
    public final boolean[] T6;
    public int T7;
    public Matrix T8;
    public float T9;
    public float Ta;
    public boolean Tb;
    public hm Tc;
    public kh.f U;
    public final Set U0;
    public boolean U1;
    public NumberTextView U2;
    public boolean U3;
    public ArrayList U4;
    public TLRPC.PhotoSize U5;
    public final boolean[] U6;
    public int U7;
    public Paint U8;
    public float U9;
    public int Ua;
    public int Ub;
    public ci.q6 Uc;
    public View V;
    public final Set V0;
    public yd V1;
    public int V2;
    public org.telegram.messenger.zi V3;
    public int V4;
    public TLObject V5;
    public final boolean[] V6;
    public boolean V7;
    public final Paint V8;
    public TLRPC.Document V9;
    public int Va;
    public boolean Vb;
    public boolean Vc;
    public FrameLayout W;
    public AnimatorSet W0;
    public ImageView W1;
    public final AnimatorSet[] W2;
    public int W3;
    public HashMap W4;
    public int W5;
    public boolean W6;
    public boolean W7;
    public float W8;
    public boolean W9;
    public k4.j Wa;
    public int Wb;
    public boolean Wc;
    public FrameLayout X;
    public boolean X0;
    public fj X1;
    public boolean X2;
    public org.telegram.messenger.zi X3;
    public final SparseArray X4;
    public TLRPC.WebPage X5;
    public boolean X6;
    public boolean X7;
    public boolean X8;
    public boolean X9;
    public ValueAnimator Xa;
    public int Xb;
    public float Xc;
    public final kh.l Y;
    public gi.l3 Y0;
    public ei.x2 Y1;
    public ImageView Y2;
    public org.telegram.messenger.zi Y3;
    public int Y4;
    public ArrayList Y5;
    public boolean Y6;
    public int Y7;
    public View Y8;
    public long Y9;
    public float Ya;
    public int Yb;
    public float Yc;
    public mh.f Z;
    public gi.l3 Z0;
    public org.telegram.ui.ActionBar.k0 Z1;
    public RadialProgressView Z2;
    public ai.o2 Z3;
    public final int[] Z4;
    public String Z5;
    public boolean Z6;
    public boolean Z7;
    public float Z8;
    public int Z9;
    public hk Za;
    public CharacterStyle Zb;
    public final qe.a Zc;
    public int f51236a;
    public mj f51237a0;
    public gi.l3 f51238a1;
    public TextView f51239a2;
    public ImageView f51240a3;
    public ci.j1 f51241a4;
    public int f51242a5;
    public l9.u f51243a6;
    public int f51244a7;
    public org.telegram.messenger.zi f51245a8;
    public float f51246a9;
    public int f51247aa;
    public final qk f51248ab;
    public String ac;
    public final qe.a f51249ad;
    public boolean f51250b;
    public nj f51251b0;
    public org.telegram.ui.Components.jg f51252b1;
    public boolean f51253b2;
    public AnimatorSet f51254b3;
    public kg.i1 f51255b4;
    public boolean f51256b5;
    public TLRPC.ChatInvite f51257b6;
    public int f51258b7;
    public org.telegram.messenger.zi f51259b8;
    public Integer f51260b9;
    public int f51261ba;
    public final xk f51262bb;
    public sf.b f51263bc;
    public final qe.a f51264bd;
    public boolean f51265c;
    public ai.o2 f51266c0;
    public boolean f51267c1;
    public TextView c2;
    public FrameLayout f51268c3;
    public kh.e f51269c4;
    public int f51270c5;
    public yd f51271c6;
    public long f51272c7;
    public int f51273c8;
    public int f51274c9;
    public int f51275ca;
    public ArrayList f51276cb;
    public boolean cc;
    public final qe.a f51277cd;
    public boolean d;
    public int f51278d0;
    public qj f51279d1;
    public TextView f51280d2;
    public tj f51281d3;
    public int f51282d4;
    public int f51283d5;
    public final LongSparseIntArray f51284d6;
    public boolean f51285d7;
    public boolean f51286d8;
    public boolean f51287d9;
    public boolean f51288da;
    public final nh f51289db;
    public yd f51290dc;
    public final qe.a f51291dd;
    public TLRPC.Chat f51292e;
    public org.telegram.ui.ActionBar.o0 f51293e0;
    public mh.c f51294e1;
    public xj f51295e2;
    public TextView f51296e3;
    public TL_account.TL_businessChatLink f51297e4;
    public boolean f51298e5;
    public boolean f51299e6;
    public long f51300e7;
    public boolean f51301e8;
    public AnimatorSet f51302e9;
    public boolean ea;
    public final sh f51303eb;
    public boolean f51304ec;
    public final qe.a f51305ed;
    public TLRPC.User f51306f;
    public ar f51307f0;
    public FrameLayout f51308f1;
    public TextView f51309f2;
    public TextView f51310f3;
    public String f51311f4;
    public boolean f51312f5;
    public boolean f51313f6;
    public final ArrayList f51314f7;
    public long f51315f8;
    public org.telegram.ui.ActionBar.f1 f51316f9;
    public boolean f51317fa;
    public final ji f51318fb;
    public boolean f51319fc;
    public final qe.a f51320fd;
    public org.telegram.ui.ActionBar.w f51321g0;
    public LinearLayout f51322g1;
    public org.telegram.ui.Components.g11 f51323g2;
    public pj f51324g3;
    public int f51325g4;
    public AnimatorSet f51326g5;
    public long f51327g6;
    public final Paint g7;
    public String f51328g8;
    public boolean f51329g9;
    public org.telegram.ui.Components.ai f51330ga;
    public final im f51331gb;
    public final RectF f51332gc;
    public final l6.n f51333gd;
    public TLRPC.EncryptedChat h;
    public org.telegram.ui.ActionBar.o0 f51334h0;
    public org.telegram.ui.Components.on f51335h1;
    public lg.e f51336h2;
    public ImageView f51337h3;
    public int f51338h4;
    public final SparseIntArray f51339h5;
    public boolean f51340h6;
    public final Paint h7;
    public Integer f51341h8;
    public org.telegram.ui.ActionBar.y0[] f51342h9;
    public float f51343ha;
    public final tf hb;
    public org.telegram.ui.ActionBar.s1 f51344hc;
    public th.b f51345hd;
    public org.telegram.ui.ActionBar.o0 f51346i0;
    public xh f51347i1;
    public org.telegram.ui.Components.s70 f51348i2;
    public ImageView i3;
    public boolean f51349i4;
    public final SparseIntArray f51350i5;
    public boolean f51351i6;
    public final ColorMatrix f51352i7;
    public byte[] f51353i8;
    public org.telegram.ui.ActionBar.y0 f51354i9;
    public float f51355ia;
    public final tf f51356ib;
    public long f51357ic;
    public final Rect f51358id;
    public org.telegram.ui.ActionBar.q0 f51359j0;
    public lg.v1 f51360j1;
    public ImageView f51361j2;
    public org.telegram.ui.Components.h6 f51362j3;
    public String f51363j4;
    public boolean f51364j5;
    public boolean f51365j6;
    public final m.b3 f51366j7;
    public int f51367j8;
    public final kj f51368j9;
    public to f51369ja;
    public boolean jb;
    public final tf f51370jc;
    public org.telegram.ui.ActionBar.q0 f51371k0;
    public lg.a0 k1;
    public ii.n f51372k2;
    public org.telegram.ui.Components.h6 f51373k3;
    public byte[] f51374k4;
    public boolean f51375k5;
    public long f51376k6;
    public final org.telegram.ui.ActionBar.t4 f51377k7;
    public int f51378k8;
    public gl f51379k9;
    public Animator f51380ka;
    public boolean f51381kb;
    public int f51382kc;
    public org.telegram.ui.ActionBar.q0 f51383l0;
    public kh.k f51384l1;
    public TextView f51385l2;
    public org.telegram.ui.Components.h6 f51386l3;
    public String f51387l4;
    public boolean f51388l5;
    public Long f51389l6;
    public long f51390l7;
    public yd f51391l8;
    public sj f51392l9;
    public boolean la;
    public long f51393lb;
    public boolean f51394lc;
    public org.telegram.ui.ActionBar.q0 m0;
    public kl m1;
    public hj f51395m2;
    public ej f51396m3;
    public org.telegram.messenger.zi f51397m4;
    public boolean f51398m5;
    public int f51399m6;
    public int f51400m7;
    public String f51401m8;
    public int f51402m9;
    public boolean f51403ma;
    public za.p f51404mb;
    public Pattern f51405mc;
    public boolean f51406n;
    public org.telegram.ui.Components.n01 f51407n0;
    public org.telegram.ui.Components.kn f51408n1;
    public FrameLayout f51409n2;
    public cj f51410n3;
    public org.telegram.messenger.zi n4;
    public boolean f51411n5;
    public final SparseArray[] f51412n6;
    public int f51413n7;
    public org.telegram.messenger.r3 f51414n8;
    public int f51415n9;
    public wm f51416na;
    public boolean f51417nb;
    public org.telegram.messenger.zi f51418nc;
    public org.telegram.ui.ActionBar.o0 f51419o0;
    public final ArrayList f51420o1;
    public hj f51421o2;
    public org.telegram.ui.Cells.t0 f51422o3;
    public boolean f51423o4;
    public boolean f51424o5;
    public final SparseArray[] f51425o6;
    public final Matrix f51426o7;
    public boolean f51427o8;
    public int f51428o9;
    public float f51429oa;
    public int f51430ob;
    public pe f51431oc;
    public org.telegram.ui.ActionBar.q0 f51432p0;
    public qi f51433p1;
    public FrameLayout f51434p2;
    public int f51435p3;
    public ArrayList f51436p4;
    public long f51437p5;
    public final SparseArray[] f51438p6;
    public LinearGradient f51439p7;
    public boolean f51440p8;
    public boolean f51441p9;
    public AnimatorSet f51442pa;
    public int f51443pb;
    public ArrayList f51444pc;
    public org.telegram.ui.ActionBar.w f51445q0;
    public org.telegram.ui.Components.h6 f51446q1;
    public TextView f51447q2;
    public org.telegram.ui.Components.p40 f51448q3;
    public org.telegram.messenger.zi f51449q4;
    public boolean f51450q5;
    public boolean f51451q6;
    public int f51452q7;
    public TLRPC.ChatFull f51453q8;
    public boolean f51454q9;
    public final tj f51455qa;
    public boolean f51456qb;
    public final m2.t f51457qc;
    public long f51458r;
    public boolean f51459r0;
    public qg f51460r1;
    public org.telegram.ui.Components.iz f51461r2;
    public View f51462r3;
    public TLRPC.TL_forumTopic f51463r4;
    public boolean r5;
    public int f51464r6;
    public int f51465r7;
    public TLRPC.UserFull f51466r8;
    public ll r9;
    public xh.j f51467ra;
    public boolean f51468rb;
    public final kh.a f51469rc;
    public final HashMap f51470s;
    public RadialProgressView f51471s0;
    public org.telegram.ui.Components.ow0 f51472s1;
    public org.telegram.ui.Components.zu0 f51473s2;
    public boolean f51474s3;
    public long f51475s4;
    public boolean f51476s5;
    public int s6;
    public final Paint f51477s7;
    public org.telegram.ui.Cells.d6 f51478s8;
    public View f51479s9;
    public dh.r f51480sa;
    public a0.h f51481sb;
    public boolean f51482sc;
    public org.telegram.ui.ActionBar.o0 f51483t0;
    public org.telegram.ui.ActionBar.o0 f51484t1;
    public gi.l3 f51485t2;
    public boolean f51486t3;
    public int f51487t4;
    public org.telegram.messenger.zi f51488t5;
    public int f51489t6;
    public final Matrix f51490t7;
    public pw0 f51491t8;
    public boolean f51492t9;
    public iz0 f51493ta;
    public a0.h f51494tb;
    public boolean tc;
    public org.telegram.ui.ActionBar.o0 f51495u0;
    public org.telegram.ui.ActionBar.o0 f51496u1;
    public gi.l3 f51497u2;
    public boolean f51498u3;
    public TLRPC.Chat f51499u4;
    public org.telegram.messenger.zi f51500u5;
    public int f51501u6;
    public LinearGradient f51502u7;
    public final a0.h f51503u8;
    public boolean f51504u9;
    public boolean f51505ua;
    public boolean f51506ub;
    public boolean uc;
    public org.telegram.ui.ActionBar.o0 f51507v0;
    public org.telegram.ui.ActionBar.o0 f51508v1;
    public gi.l3 f51509v2;
    public AnimatorSet f51510v3;
    public boolean f51511v4;
    public org.telegram.messenger.ui f51512v5;
    public int f51513v6;
    public boolean f51514v7;
    public String f51515v8;
    public boolean f51516v9;
    public org.telegram.ui.Components.vo f51517va;
    public boolean f51518vb;
    public long f51519vc;
    public final ri f51520w;
    public org.telegram.ui.ActionBar.o0 f51521w0;
    public org.telegram.ui.ActionBar.o0 f51522w1;
    public boolean f51523w2;
    public ValueAnimator f51524w3;
    public boolean f51525w4;
    public org.telegram.messenger.dj f51526w5;
    public int f51527w6;
    public boolean f51528w7;
    public long f51529w8;
    public float f51530w9;
    public um f51531wa;
    public Paint f51532wb;
    public boolean f51533wc;
    public ki f51534x;
    public ClippingImageView f51535x0;
    public org.telegram.ui.Components.xn f51536x1;
    public gi.l3 f51537x2;
    public float f51538x3;
    public boolean f51539x4;
    public org.telegram.messenger.ej f51540x5;
    public int f51541x6;
    public int f51542x7;
    public String f51543x8;
    public float f51544x9;
    public wm xa;
    public long f51545xb;
    public boolean f51546xc;
    public ki f51547y;
    public org.telegram.ui.Components.cz0 f51548y0;
    public mh.h f51549y1;
    public boolean f51550y2;
    public boolean f51551y3;
    public boolean f51552y4;
    public org.telegram.messenger.zi f51553y5;
    public final ArrayList f51554y6;
    public boolean f51555y7;
    public boolean f51556y8;
    public VelocityTracker y9;
    public um f51557ya;
    public dk f51558yb;
    public boolean yc;
    public kh.g f51559z0;
    public boolean f51560z1;
    public gi.l3 f51561z2;
    public boolean f51562z3;
    public int f51563z4;
    public org.telegram.messenger.ui f51564z5;
    public boolean f51565z6;
    public boolean f51566z7;
    public boolean f51567z8;
    public boolean f51568z9;
    public zh.d f51569za;
    public boolean f51570zb;
    public boolean f51571zc;

    public wm(Bundle bundle) {
        super(bundle);
        this.f51236a = 0;
        this.f51265c = false;
        this.d = false;
        this.f51470s = new HashMap();
        this.f51520w = new ri(this, new xe(this, 24));
        ue.b bVar = new ue.b();
        this.F = bVar;
        ue.b bVar2 = new ue.b();
        this.G = bVar2;
        this.Y = new kh.l();
        this.K0 = org.telegram.ui.ActionBar.k6.Gi;
        this.T0 = -1;
        this.U0 = Collections.newSetFromMap(new WeakHashMap());
        this.V0 = Collections.newSetFromMap(new WeakHashMap());
        this.f51420o1 = new ArrayList();
        this.Q2 = new org.telegram.ui.Components.k9[2];
        this.R2 = new vm[2];
        this.S2 = new org.telegram.ui.ActionBar.k5[2];
        this.T2 = new lm[2];
        this.W2 = new AnimatorSet[2];
        this.X2 = false;
        this.f51435p3 = 500;
        this.f51297e4 = null;
        this.f51338h4 = -1;
        this.f51423o4 = true;
        this.D4 = new SparseArray();
        this.E4 = new ArrayList();
        this.J4 = new ArrayList();
        this.K4 = new HashMap();
        this.M4 = -1;
        this.N4 = 0;
        this.O4 = new ArrayList(10);
        this.U4 = new ArrayList();
        this.W4 = new HashMap();
        this.X4 = new SparseArray();
        this.Z4 = new int[1];
        this.f51339h5 = new SparseIntArray();
        this.f51350i5 = new SparseIntArray();
        this.f51450q5 = true;
        this.f51476s5 = true;
        this.H5 = true;
        this.K5 = true;
        this.f51284d6 = new LongSparseIntArray();
        this.f51399m6 = 1;
        this.f51412n6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f51425o6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f51438p6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.f51554y6 = new ArrayList();
        this.f51565z6 = true;
        this.B6 = Integer.MIN_VALUE;
        this.E6 = new ArrayList();
        this.F6 = new SparseArray[]{new SparseArray(), new SparseArray()};
        this.G6 = new SparseArray();
        this.H6 = new SparseArray();
        this.I6 = new HashMap();
        this.J6 = new SparseArray();
        this.K6 = new a0.h();
        this.L6 = new ArrayList();
        this.M6 = new SparseArray();
        this.N6 = new a0.h();
        this.O6 = new a0.h();
        this.P6 = new int[]{Integer.MAX_VALUE, Integer.MAX_VALUE};
        this.Q6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.R6 = new int[]{Integer.MIN_VALUE, Integer.MIN_VALUE};
        this.S6 = new int[2];
        this.T6 = new boolean[2];
        this.U6 = new boolean[2];
        this.V6 = new boolean[]{true, true};
        this.X6 = true;
        this.Y6 = true;
        this.f51258b7 = 0;
        this.f51314f7 = new ArrayList();
        this.g7 = new Paint(1);
        this.h7 = new Paint(1);
        this.f51352i7 = new ColorMatrix();
        this.f51366j7 = new m.b3();
        this.f51377k7 = new org.telegram.ui.ActionBar.t4(0, false, false, new dj(this, 0));
        this.f51426o7 = new Matrix();
        Paint paint = new Paint(1);
        this.f51477s7 = paint;
        this.f51490t7 = new Matrix();
        this.E7 = -1;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(org.telegram.messenger.g0.L(1.0f));
        this.O7 = Integer.MAX_VALUE;
        this.P7 = -1;
        this.X7 = true;
        this.f51273c8 = Integer.MAX_VALUE;
        this.f51367j8 = -1;
        this.f51378k8 = -10000;
        this.f51503u8 = new a0.h();
        this.N8 = new xe(this, 28);
        si.b bVar3 = new si.b();
        this.O8 = bVar3;
        this.P8 = new eh.c(bVar3, bVar3, bVar3);
        this.V8 = new Paint(1);
        this.W8 = 0.0f;
        this.Z8 = 1.0f;
        this.f51246a9 = 0.0f;
        this.f51329g9 = true;
        this.f51368j9 = new kj(this);
        this.H9 = true;
        this.f51455qa = new tj(this, 0);
        this.Aa = new org.telegram.messenger.i3(this);
        this.Ga = new rf(this, 0);
        this.Ha = new ak(this);
        this.Ja = -1;
        this.f51248ab = new qk(this);
        this.f51262bb = new xk(this);
        this.f51289db = new nh(this);
        this.f51303eb = new sh(this);
        this.f51318fb = new ji(this);
        this.f51331gb = new im(this);
        this.hb = new tf(this, 0);
        this.f51356ib = new tf(this, 3);
        this.Hb = new int[2];
        this.f51332gc = new RectF();
        this.f51370jc = new tf(this, 6);
        this.f51457qc = new m2.t(6);
        this.f51469rc = new Object();
        this.Hc = false;
        org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
        this.Zc = new qe.a(0, this, xqVar, 320L, false);
        this.f51249ad = new qe.a(1, this, xqVar, 520L, false);
        this.f51264bd = new qe.a(2, this, xqVar, 520L, false);
        this.f51277cd = new qe.a(3, this, xqVar, 320L, false);
        this.f51291dd = new qe.a(4, this, xqVar, 320L, false);
        this.f51305ed = new qe.a(5, this, xqVar, 320L, false);
        this.f51320fd = new qe.a(6, this, xqVar, 320L, false);
        tf tfVar = new tf(this, 9);
        ?? obj = new Object();
        obj.f18089b = new float[32];
        obj.f18088a = 1;
        obj.d = new qe.j(obj, pe.a.f53446a, 240L);
        obj.f18090c = tfVar;
        this.f51333gd = obj;
        this.f51358id = new Rect();
        ?? obj2 = new Object();
        this.N = obj2;
        if (Build.VERSION.SDK_INT >= 31 && org.telegram.messenger.az.f()) {
            eh.g gVar = new eh.g(false);
            this.H = gVar;
            this.I = Math.max(0, org.telegram.messenger.g0.L(48.0f) - Math.min(org.telegram.messenger.g0.f22603n, org.telegram.messenger.g0.f22602m));
            si.f fVar = new si.f(obj2);
            this.K = fVar;
            fVar.d = gVar;
            fVar.f54755e = -3;
            fVar.f54756f = obj2;
            eh.c cVar = new eh.c(fVar, fVar, fVar);
            this.M = cVar;
            cVar.f9988k = true;
            if (org.telegram.messenger.lc.e(262144)) {
                si.f fVar2 = new si.f(obj2);
                this.J = fVar2;
                fVar2.d = gVar;
                fVar2.f54755e = -2;
                fVar2.f54756f = obj2;
                eh.c cVar2 = new eh.c(fVar2, fVar2, fVar2);
                this.L = cVar2;
                cVar2.f9988k = true;
            } else {
                this.J = null;
                this.L = this.M;
            }
        } else {
            this.H = null;
            this.I = 0;
            this.J = null;
            this.K = null;
            this.L = new eh.c(obj2, obj2, obj2);
            this.M = new eh.c(obj2, obj2, obj2);
        }
        eh.c cVar3 = new eh.c(obj2, obj2, obj2);
        this.O = cVar3;
        cVar3.f9985g = bVar;
        this.L.f9985g = bVar;
        this.M.f9985g = bVar;
        this.P8.f9985g = new ue.b();
        this.O.f9984f = bVar2;
        this.L.f9984f = bVar2;
        this.M.f9984f = bVar2;
        this.P8.f9984f = bVar2;
    }

    public static void A0(wm wmVar, org.telegram.ui.Cells.q1 q1Var, boolean z10, String str, TLRPC.User[] userArr, CharacterStyle characterStyle) {
        int i3;
        org.telegram.ui.Components.f60 I = org.telegram.ui.Components.f60.I(wmVar, q1Var);
        org.telegram.ui.Components.nk0 nk0Var = new org.telegram.ui.Components.nk0(wmVar.getParentActivity(), wmVar.f51557ya);
        I.f33742p = new ee(nk0Var, 0);
        if (z10 && ((org.telegram.messenger.h0) wmVar.getMessagesController().f23167x7.f24662j0.f13688b).f22814c) {
            I.c(2131231275, org.telegram.messenger.bd.M0(2131743027, null), new fe(wmVar, str, 6), false);
        }
        boolean z11 = true;
        I.c(2131232103, org.telegram.messenger.bd.M0(2131743162, null), new ie(wmVar, nk0Var, str, 1), false);
        if (z10) {
            I.c(2131232354, org.telegram.messenger.bd.M0(2131742973, null), new fe(wmVar, str, 7), false);
            I.k();
            TLRPC.User user = userArr[0];
            if (user != null) {
                int i10 = wmVar.currentAccount;
                long j10 = user.f27150id;
                sc scVar = new sc(6, wmVar, userArr);
                TLObject e22 = org.telegram.messenger.hp.s1(i10).e2(j10);
                boolean z12 = e22 instanceof TLRPC.User;
                if (!(e22 instanceof TLRPC.Chat) || !org.telegram.messenger.t3.V((TLRPC.Chat) e22)) {
                    z11 = false;
                }
                if (z12) {
                    i3 = 2131743556;
                } else if (z11) {
                    i3 = 2131743570;
                } else {
                    i3 = 2131743563;
                }
                I.n(e22, org.telegram.messenger.bd.M0(i3, null), scVar);
            } else {
                I.p(13, -1, org.telegram.messenger.bd.M0(2131743208, null));
            }
        }
        nk0Var.e(I);
        nk0Var.f(q1Var, characterStyle, null, false);
        wmVar.showDialog(nk0Var);
    }

    public static boolean A1(org.telegram.ui.wm r14, org.telegram.tgnet.TLRPC.MessageEntity r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.A1(org.telegram.ui.wm, org.telegram.tgnet.TLRPC$MessageEntity):boolean");
    }

    public static void A8(Menu menu, TLRPC.EncryptedChat encryptedChat, boolean z10, boolean z11, boolean z12, boolean z13) {
        if (menu.findItem(2131296491) != null) {
            return;
        }
        menu.removeItem(16908341);
        int i3 = 6;
        if (z10) {
            menu.add(2131296496, 2131296502, 6, org.telegram.messenger.bd.M0(2131746448, null));
            i3 = 7;
        }
        if (z13) {
            menu.add(2131296496, 2131296508, i3, org.telegram.messenger.bd.M0(2131745272, null));
            i3++;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131753671, null));
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        menu.add(2131296496, 2131296491, i3, spannableStringBuilder);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131749095, null));
        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o1("fonts/ritalic.ttf")), 0, spannableStringBuilder2.length(), 33);
        int i10 = i3 + 2;
        menu.add(2131296496, 2131296497, i3 + 1, spannableStringBuilder2);
        if (z12) {
            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131748358, null));
            spannableStringBuilder3.setSpan(new org.telegram.ui.Components.o31(Typeface.MONOSPACE), 0, spannableStringBuilder3.length(), 33);
            menu.add(2131296496, 2131296499, i10, spannableStringBuilder3);
            i10 = i3 + 3;
        }
        if (encryptedChat == null || org.telegram.messenger.g0.X0(encryptedChat.layer) >= 101) {
            SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131744447, null));
            ?? obj = new Object();
            obj.f38578a |= 8;
            spannableStringBuilder4.setSpan(new org.telegram.ui.Components.uy0(obj, 0), 0, spannableStringBuilder4.length(), 33);
            int i11 = i10 + 1;
            menu.add(2131296496, 2131296509, i10, spannableStringBuilder4);
            SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131743899, null));
            ?? obj2 = new Object();
            obj2.f38578a |= 16;
            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.uy0(obj2, 0), 0, spannableStringBuilder5.length(), 33);
            i10 += 2;
            menu.add(2131296496, 2131296512, i11, spannableStringBuilder5);
        }
        if (z11) {
            menu.add(2131296496, 2131296498, i10, org.telegram.messenger.bd.M0(2131751745, null));
            i10++;
        }
        if (z10 && encryptedChat == null) {
            menu.add(2131296496, 2131296493, i10, org.telegram.messenger.bd.M0(2131750591, null));
            i10++;
        }
        menu.add(2131296496, 2131296503, i10, org.telegram.messenger.bd.M0(2131746345, null));
    }

    public static void B0(wm wmVar, int i3, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, bf bfVar) {
        String str4;
        if (wmVar.f51500u5 != null && i3 < arrayList.size() && wmVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            org.telegram.messenger.zi ziVar = wmVar.f51500u5;
            if (ziVar != null) {
                TLRPC.Message message = ziVar.f26868k;
            }
            org.telegram.ui.Components.f21.T0(wmVar.getParentActivity(), wmVar, inputPeer, iArr[0], wmVar.f51500u5.K2, str, str4, charSequence, z10, bfVar, new xe(wmVar, 22)).f28611p0 = false;
            wmVar.O7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + wmVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit();
                edit.putInt("dialog_show_translate_count" + wmVar.a(), i10 - 1).apply();
                wmVar.vd(true);
            }
        }
    }

    public static void B1(long j10, wm wmVar) {
        if (ci.e9.y(wmVar.currentAccount, false).p().amount < j10) {
            new ci.mb(wmVar.getParentActivity(), wmVar.getResourceProvider(), j10, 13, org.telegram.messenger.m5.t(wmVar.a()), new xe(wmVar, 10), wmVar.a()).show();
        } else {
            new ci.nb(wmVar.getParentActivity(), wmVar.resourceProvider).show();
        }
    }

    public static void C0(wm wmVar) {
        long j10;
        ArrayList arrayList = wmVar.f51554y6;
        arrayList.add(Integer.valueOf(wmVar.f51399m6));
        if (wmVar.f51325g4 == 7) {
            org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(wmVar.currentAccount);
            String str = wmVar.J3;
            int i3 = wmVar.classGuid;
            int i10 = wmVar.f51282d4;
            int i11 = wmVar.f51399m6;
            wmVar.f51399m6 = i11 + 1;
            a10.e(i3, i10, i11, str);
        } else if (wmVar.N7 != 0) {
            org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
            long j11 = wmVar.f51376k6;
            long j12 = wmVar.f51272c7;
            int i12 = wmVar.N7;
            int i13 = wmVar.classGuid;
            int i14 = wmVar.f51325g4;
            long j13 = wmVar.f51475s4;
            int i15 = wmVar.B4;
            int i16 = wmVar.f51399m6;
            wmVar.f51399m6 = i16 + 1;
            messagesController.Y2(j11, j12, false, 30, 0, i12, true, 0, i13, 4, i14, j13, i15, i16, wmVar.f51525w4);
        } else if (wmVar.L7 != 0 && (!wmVar.da() || wmVar.L7 == wmVar.f51273c8 || wmVar.f51525w4)) {
            int i17 = wmVar.A7;
            if (i17 != 0) {
                wmVar.f51272c7 = i17;
                org.telegram.messenger.hp messagesController2 = wmVar.getMessagesController();
                long j14 = wmVar.f51272c7;
                boolean z10 = wmVar.f51555y7;
                int i18 = wmVar.f51542x7;
                int i19 = wmVar.L7;
                int i20 = wmVar.classGuid;
                int i21 = wmVar.f51325g4;
                long j15 = wmVar.f51475s4;
                int i22 = wmVar.B4;
                int i23 = wmVar.f51399m6;
                wmVar.f51399m6 = i23 + 1;
                messagesController2.Y2(j14, 0L, z10, i18, i19, 0, true, 0, i20, 3, i21, j15, i22, i23, wmVar.f51525w4);
            } else {
                org.telegram.messenger.hp messagesController3 = wmVar.getMessagesController();
                long j16 = wmVar.f51376k6;
                long j17 = wmVar.f51272c7;
                boolean z11 = wmVar.f51555y7;
                int i24 = wmVar.f51542x7;
                int i25 = wmVar.L7;
                int i26 = wmVar.classGuid;
                int i27 = wmVar.f51325g4;
                long j18 = wmVar.f51475s4;
                int i28 = wmVar.B4;
                int i29 = wmVar.f51399m6;
                wmVar.f51399m6 = i29 + 1;
                messagesController3.Y2(j16, j17, z11, i24, i25, 0, true, 0, i26, 3, i27, j18, i28, i29, wmVar.f51525w4);
            }
        } else if (wmVar.f51566z7) {
            wmVar.f51399m6++;
        } else {
            org.telegram.messenger.hp messagesController4 = wmVar.getMessagesController();
            long j19 = wmVar.f51376k6;
            long j20 = wmVar.f51272c7;
            boolean z12 = wmVar.f51555y7;
            int i30 = wmVar.f51542x7;
            int i31 = wmVar.L7;
            int i32 = wmVar.classGuid;
            int i33 = wmVar.f51325g4;
            long j21 = wmVar.f51475s4;
            int i34 = wmVar.B4;
            int i35 = wmVar.f51399m6;
            wmVar.f51399m6 = i35 + 1;
            messagesController4.Y2(j19, j20, z12, i30, i31, 0, true, 0, i32, 2, i33, j21, i34, i35, wmVar.f51525w4);
        }
        int i36 = wmVar.f51325g4;
        if (i36 == 0 || (i36 == 3 && wmVar.c9() == wmVar.getUserConfig().e())) {
            if (wmVar.da() && !wmVar.f51525w4) {
                return;
            }
            arrayList.add(Integer.valueOf(wmVar.f51399m6));
            org.telegram.messenger.hp messagesController5 = wmVar.getMessagesController();
            long j22 = wmVar.f51376k6;
            long j23 = wmVar.f51272c7;
            int i37 = wmVar.classGuid;
            if (wmVar.f51325g4 == 3) {
                j10 = 0;
            } else {
                j10 = wmVar.f51475s4;
            }
            long j24 = j10;
            int i38 = wmVar.B4;
            int i39 = wmVar.f51399m6;
            wmVar.f51399m6 = i39 + 1;
            messagesController5.Y2(j22, j23, false, 1, 0, 0, true, 0, i37, 2, 1, j24, i38, i39, wmVar.f51525w4);
        }
    }

    public static void C1(org.telegram.ui.wm r7, java.lang.String r8, org.telegram.messenger.zi r9, boolean r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.C1(org.telegram.ui.wm, java.lang.String, org.telegram.messenger.zi, boolean):void");
    }

    public static boolean D0(wm wmVar) {
        org.telegram.messenger.zi ziVar = wmVar.f51418nc;
        if (ziVar == null) {
            return false;
        }
        if (org.telegram.messenger.g0.g(ziVar.R0)) {
            new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.resourceProvider).k(false).j();
            return true;
        }
        return true;
    }

    public static void D1(wm wmVar, View view, int i3) {
        org.telegram.ui.Components.p5 p5Var;
        TLRPC.User user;
        char c2;
        pj pjVar;
        pj pjVar2;
        if (i3 != 0) {
            kg.e1 adapter = wmVar.X1.getAdapter();
            if (adapter.f17020x0 != null && !adapter.f17001i0) {
                return;
            }
            int i10 = i3 - 1;
            Object J = wmVar.X1.getAdapter().J(i10);
            int i11 = wmVar.X1.getAdapter().Y;
            int i12 = wmVar.X1.getAdapter().Z;
            if (wmVar.X1.getAdapter().G != null && i10 == 1) {
                wmVar.f51237a0.N0(i11, i12, wmVar.X1.getAdapter().G + "@" + org.telegram.messenger.t3.K(wmVar.f51292e, false) + " ", false);
            } else if (wmVar.X1.getAdapter().G != null && i10 == 0) {
                wmVar.f51237a0.N0(i11, i12, a1.g.s(new StringBuilder(), wmVar.X1.getAdapter().G, " "), false);
            } else if (J instanceof lg.t1) {
                if (!wmVar.getUserConfig().q()) {
                    wmVar.showDialog(new vg.v0(wmVar, wmVar.getParentActivity(), wmVar.currentAccount, true, 31, false, null));
                    return;
                }
                lg.t1 t1Var = (lg.t1) J;
                org.telegram.ui.Components.t4.Z(wmVar.currentAccount, Math.max(1, t1Var.a()), wmVar.f51376k6, new mi.f(13, wmVar, t1Var));
            } else {
                org.telegram.messenger.vi viVar = null;
                Paint.FontMetricsInt fontMetricsInt = null;
                if (J instanceof TLRPC.TL_document) {
                    if (wmVar.f51325g4 != 0 || !wmVar.s7(view)) {
                        if (view instanceof org.telegram.ui.Cells.w7) {
                            viVar = ((org.telegram.ui.Cells.w7) view).getSendAnimationData();
                        }
                        TLRPC.TL_document tL_document = (TLRPC.TL_document) J;
                        org.telegram.ui.Components.t4.Z(wmVar.currentAccount, 1, wmVar.a(), new ci.o2(wmVar, tL_document, org.telegram.messenger.zi.U(tL_document), wmVar.X1.getAdapter().L(i10), viVar, 3));
                    }
                } else if (J instanceof TLRPC.Chat) {
                    TLRPC.Chat chat = (TLRPC.Chat) J;
                    if (wmVar.C3 && (pjVar2 = wmVar.f51324g3) != null && pjVar2.getVisibility() == 0) {
                        wmVar.zb(chat, null);
                        return;
                    }
                    String K = org.telegram.messenger.t3.K(chat, false);
                    if (K != null) {
                        wmVar.f51237a0.N0(i11, i12, a1.g.q("@", K, " "), false);
                    }
                } else if (J instanceof TLRPC.User) {
                    TLRPC.User user2 = (TLRPC.User) J;
                    if (wmVar.C3 && (pjVar = wmVar.f51324g3) != null && pjVar.getVisibility() == 0) {
                        wmVar.zb(null, user2);
                    } else if (org.telegram.messenger.l10.n(user2) != null) {
                        wmVar.f51237a0.N0(i11, i12, "@" + org.telegram.messenger.l10.n(user2) + " ", false);
                    } else {
                        SpannableString spannableString = new SpannableString(t4.c.q(org.telegram.messenger.l10.j(user2, false), " "));
                        spannableString.setSpan(new org.telegram.ui.Components.y31("" + user2.f27150id, 3, null), 0, spannableString.length(), 33);
                        wmVar.f51237a0.N0(i11, i12, spannableString, false);
                    }
                } else if (J instanceof kg.b1) {
                    if (wmVar.X1.getAdapter().K != null && wmVar.f51325g4 != 1) {
                        kg.b1 b1Var = (kg.b1) J;
                        org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(b1Var.f16930a, wmVar.f51376k6, wmVar.E5, wmVar.f51397m4, null, false, null, null, null, true, 0, 0, null, false);
                        b10.K = wmVar.W8();
                        b10.X = b1Var.f16931b;
                        b10.R = wmVar.h9();
                        b10.T = wmVar.f51540x5;
                        wmVar.getSendMessagesHelper().r0(b10);
                        wmVar.f51237a0.setFieldText("");
                        wmVar.B9(false);
                    }
                } else if (J instanceof String) {
                    if (wmVar.X1.getAdapter().K != null) {
                        if (wmVar.f51325g4 == 1) {
                            org.telegram.ui.Components.t4.L(wmVar.getParentActivity(), wmVar.f51376k6, new mi.d4(20, wmVar, (String) J), wmVar.f51557ya);
                            return;
                        } else if (!wmVar.s7(view)) {
                            org.telegram.ui.Components.t4.Z(wmVar.currentAccount, 1, wmVar.f51376k6, new mi.f(14, wmVar, (String) J));
                            return;
                        } else {
                            return;
                        }
                    }
                    wmVar.f51237a0.N0(i11, i12, J + " ", false);
                } else if (J instanceof TLRPC.BotInlineResult) {
                    if (wmVar.f51237a0.getFieldText() != null) {
                        if (wmVar.f51325g4 == 1 || !wmVar.s7(view)) {
                            TLRPC.BotInlineResult botInlineResult = (TLRPC.BotInlineResult) J;
                            if (wmVar.h != null) {
                                if ((botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaAuto) && "game".equals(botInlineResult.type)) {
                                    c2 = 1;
                                } else if (botInlineResult.send_message instanceof TLRPC.TL_botInlineMessageMediaInvoice) {
                                    c2 = 2;
                                } else {
                                    c2 = 0;
                                }
                                if (c2 != 0) {
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                                    String M0 = org.telegram.messenger.bd.M0(2131745606, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M0;
                                    if (c2 == 1) {
                                        s1Var.U = org.telegram.messenger.bd.M0(2131750483, null);
                                    } else {
                                        s1Var.U = org.telegram.messenger.bd.M0(2131749111, null);
                                    }
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747839, null), null);
                                    wmVar.showDialog(s1Var);
                                    return;
                                }
                            }
                            if ((botInlineResult.type.equals("photo") && (botInlineResult.photo != null || botInlineResult.content != null)) || ((botInlineResult.type.equals("gif") && (botInlineResult.document != null || botInlineResult.content != null)) || (botInlineResult.type.equals("video") && botInlineResult.document != null))) {
                                ArrayList arrayList = new ArrayList(wmVar.X1.getAdapter().S);
                                wmVar.f51276cb = arrayList;
                                PhotoViewer.v1().N2(null, wmVar, wmVar.f51557ya);
                                PhotoViewer.v1().j2(arrayList, wmVar.X1.getAdapter().M(i10), 3, false, wmVar.f51289db, wmVar);
                                return;
                            }
                            org.telegram.ui.Components.t4.Z(wmVar.currentAccount, 1, wmVar.a(), new mi.f(15, wmVar, botInlineResult));
                        }
                    }
                } else if (J instanceof TLRPC.TL_inlineBotWebView) {
                    sc scVar = new sc(9, wmVar, (TLRPC.TL_inlineBotWebView) J);
                    if (wmVar.Gb) {
                        scVar.run();
                    } else {
                        rc1.a(wmVar.getParentActivity(), new mi.f(16, wmVar, scVar), null);
                    }
                } else if (J instanceof TLRPC.TL_inlineBotSwitchPM) {
                    TLRPC.TL_inlineBotSwitchPM tL_inlineBotSwitchPM = (TLRPC.TL_inlineBotSwitchPM) J;
                    fj fjVar = wmVar.X1;
                    if (fjVar != null && (user = fjVar.getAdapter().f17020x0) != null) {
                        wmVar.f51237a0.setFieldText("");
                        long j10 = wmVar.f51376k6;
                        if (j10 == user.f27150id) {
                            wmVar.f51529w8 = j10;
                            wmVar.getMessagesController().A4(tL_inlineBotSwitchPM.start_param, wmVar.f51306f);
                            return;
                        }
                        Bundle bundle = new Bundle();
                        bundle.putLong("user_id", user.f27150id);
                        bundle.putString("inline_query", tL_inlineBotSwitchPM.start_param);
                        bundle.putLong("inline_return", wmVar.f51376k6);
                        if (wmVar.getMessagesController().E(bundle, wmVar, null, null)) {
                            wmVar.presentFragment(new wm(bundle));
                        }
                    }
                } else if (J instanceof org.telegram.messenger.hi) {
                    String str = ((org.telegram.messenger.hi) J).f22931a;
                    mj mjVar = wmVar.f51237a0;
                    mjVar.Q();
                    mjVar.V0.h(str);
                    if (str != null) {
                        try {
                        } catch (Exception unused) {
                            wmVar.f51237a0.N0(i11, i12, str, true);
                        }
                        if (str.startsWith("animated_")) {
                            try {
                                fontMetricsInt = wmVar.f51237a0.getEditField().getPaint().getFontMetricsInt();
                            } catch (Exception e10) {
                                org.telegram.messenger.a8.g(e10, false);
                            }
                            long parseLong = Long.parseLong(str.substring(9));
                            TLRPC.Document e11 = org.telegram.ui.Components.g5.e(wmVar.currentAccount, parseLong);
                            SpannableString spannableString2 = new SpannableString(org.telegram.messenger.zi.U(e11));
                            if (e11 != null) {
                                p5Var = new org.telegram.ui.Components.p5(e11, fontMetricsInt);
                            } else {
                                p5Var = new org.telegram.ui.Components.p5(parseLong, fontMetricsInt);
                            }
                            spannableString2.setSpan(p5Var, 0, spannableString2.length(), 33);
                            wmVar.f51237a0.N0(i11, i12, spannableString2, false);
                            wmVar.X1.o(false);
                        }
                    }
                    wmVar.f51237a0.N0(i11, i12, str, true);
                    wmVar.X1.o(false);
                }
            }
        }
    }

    public static void E0(long j10, wm wmVar) {
        if (ci.e9.y(wmVar.currentAccount, false).p().amount < j10) {
            new ci.mb(wmVar.getParentActivity(), wmVar.getResourceProvider(), j10, 13, org.telegram.messenger.m5.t(wmVar.a()), new xe(wmVar, 10), wmVar.a()).show();
        } else {
            new ci.nb(wmVar.getParentActivity(), wmVar.resourceProvider).show();
        }
    }

    public static void E1(wm wmVar, ArrayList arrayList, long j10, org.telegram.ui.Components.nk0 nk0Var, boolean z10, int i3) {
        if (z10) {
            org.telegram.messenger.yy.C(wmVar.currentAccount).q0(arrayList, j10, false, false, true, i3, 0, null, -1, 0L, 0L, null);
            org.telegram.messenger.g0.i3(new cg.i0(wmVar, j10, 4), 400L);
            nk0Var.dismiss();
        }
    }

    public static void F1(wm wmVar, long j10, long j11) {
        ci.e9.y(wmVar.currentAccount, false).C(j10, j11, new ci.v4(wmVar, j10, j11, 1));
    }

    public static void G0(wm wmVar, TLRPC.TL_document tL_document, String str, Object obj, boolean z10, int i3) {
        org.telegram.messenger.yy.C(wmVar.currentAccount).v0(tL_document, str, wmVar.f51376k6, wmVar.E5, wmVar.f51397m4, null, wmVar.C5, null, z10, i3, 0, false, obj, wmVar.W8(), 0L, wmVar.h9(), wmVar.f51540x5);
    }

    public static void G1(wm wmVar, int i3, ArrayList arrayList, String[] strArr, String str, String str2, TLRPC.InputPeer inputPeer, int[] iArr, CharSequence charSequence, boolean z10, bf bfVar) {
        String str3;
        if (wmVar.f51500u5 != null && i3 < arrayList.size() && wmVar.getParentActivity() != null) {
            String str4 = strArr[0];
            if (str4 != null && str4.equals(str)) {
                str3 = str2;
            } else {
                str3 = str;
            }
            org.telegram.messenger.zi ziVar = wmVar.f51500u5;
            if (ziVar != null) {
                TLRPC.Message message = ziVar.f26868k;
            }
            org.telegram.ui.Components.f21.T0(wmVar.getParentActivity(), wmVar, inputPeer, iArr[0], wmVar.f51500u5.K2, strArr[0], str3, charSequence, z10, bfVar, new xe(wmVar, 29)).f28611p0 = false;
            wmVar.O7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7;
            int i10 = sharedPreferences.getInt("dialog_show_translate_count" + wmVar.a(), 5);
            if (i10 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit();
                edit.putInt("dialog_show_translate_count" + wmVar.a(), i10 - 1).apply();
                wmVar.vd(true);
            }
        }
    }

    public static Integer G8(ArrayList arrayList, int i3, int[] iArr) {
        if (arrayList.isEmpty()) {
            return 0;
        }
        Integer num = (Integer) arrayList.get(0);
        if (i3 >= num.intValue()) {
            iArr[0] = 0;
            return num;
        }
        int size = arrayList.size();
        int i10 = size - 1;
        Integer num2 = (Integer) arrayList.get(i10);
        if (i3 <= num2.intValue()) {
            iArr[0] = i10;
            return num2;
        }
        int i11 = 0;
        int i12 = 0;
        while (i11 < size) {
            i12 = (i11 + size) / 2;
            Integer num3 = (Integer) arrayList.get(i12);
            if (num3.intValue() == i3) {
                iArr[0] = i12;
                return num3;
            } else if (i3 < num3.intValue()) {
                if (i12 > 0) {
                    int i13 = i12 - 1;
                    Integer num4 = (Integer) arrayList.get(i13);
                    if (i3 > num4.intValue()) {
                        iArr[0] = i13;
                        return num4;
                    }
                }
                i11 = i12 + 1;
            } else if (i12 > 0 && i3 < ((Integer) arrayList.get(i12 - 1)).intValue()) {
                iArr[0] = i12;
                return num3;
            } else {
                size = i12;
            }
        }
        iArr[0] = i12;
        return (Integer) arrayList.get(i12);
    }

    public static void H1(wm wmVar, TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages) {
        long j10;
        org.telegram.messenger.hs f10 = org.telegram.messenger.hs.f(wmVar.currentAccount);
        ArrayList<Integer> arrayList = tL_messages_sendScheduledMessages.f27119id;
        long e10 = wmVar.getUserConfig().e();
        long j11 = wmVar.f51376k6;
        if (e10 == j11) {
            j10 = 0;
        } else {
            j10 = -j11;
        }
        Long valueOf = Long.valueOf(j10);
        Boolean bool = Boolean.TRUE;
        f10.k(org.telegram.messenger.hs.f23325w, arrayList, valueOf, bool, bool);
    }

    public static void I0(wm wmVar) {
        if (wmVar.f51396m3.getAlpha() != 0.0f && !wmVar.actionBar.v() && !wmVar.W9()) {
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(wmVar.f51396m3.getCustomDate() * 1000);
            int i3 = calendar.get(1);
            int i10 = calendar.get(2);
            int i11 = calendar.get(5);
            calendar.clear();
            calendar.set(i3, i10, i11);
            wmVar.fa((int) (calendar.getTime().getTime() / 1000));
        }
    }

    public static void I1(wm wmVar) {
        SparseArray[] sparseArrayArr = wmVar.f51412n6;
        org.telegram.messenger.zi ziVar = null;
        for (int i3 = 1; i3 >= 0; i3--) {
            if (ziVar == null && sparseArrayArr[i3].size() != 0) {
                ziVar = (org.telegram.messenger.zi) wmVar.F6[i3].get(sparseArrayArr[i3].keyAt(0));
            }
            sparseArrayArr[i3].clear();
            wmVar.f51425o6[i3].clear();
            wmVar.f51438p6[i3].clear();
        }
        if (wmVar.getParentActivity() != null && ziVar != null && ((org.telegram.messenger.zi.S4(ziVar.f26868k) || ziVar.i4()) && ziVar.F0() != null)) {
            TLRPC.Document F0 = ziVar.F0();
            org.telegram.messenger.w7.G(wmVar.currentAccount);
            File K = org.telegram.messenger.w7.K(F0, null, false, true);
            TLRPC.Message message = ziVar.f26868k;
            if (message != null && message.attachPath != null && (K == null || !K.exists())) {
                K = new File(ziVar.f26868k.attachPath);
            }
            if (K != null && K.exists()) {
                Intent intent = new Intent("android.intent.action.SEND");
                if (!org.telegram.messenger.zi.M4(ziVar.f26868k) && !ziVar.i4()) {
                    intent.setType(ziVar.u1());
                } else {
                    intent.setType("video/mp4");
                }
                if (Build.VERSION.SDK_INT >= 24) {
                    try {
                        Activity parentActivity = wmVar.getParentActivity();
                        StringBuilder sb2 = new StringBuilder();
                        org.telegram.messenger.t0.d();
                        sb2.append("org.telegram.messenger.beta");
                        sb2.append(".provider");
                        intent.putExtra("android.intent.extra.STREAM", FileProvider.d(parentActivity, sb2.toString(), K));
                        intent.setFlags(1);
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else {
                    intent.putExtra("android.intent.extra.STREAM", Uri.fromFile(K));
                }
                wmVar.getParentActivity().startActivityForResult(Intent.createChooser(intent, org.telegram.messenger.bd.M0(2131745469, null)), 500);
            }
        }
        wmVar.z9();
        wmVar.cd(0, true);
        wmVar.Cd(false);
        wmVar.pd();
    }

    public static void J0(wm wmVar, int i3, org.telegram.messenger.zi ziVar) {
        if (i3 == 1) {
            TLRPC.TL_contacts_acceptContact tL_contacts_acceptContact = new TLRPC.TL_contacts_acceptContact();
            tL_contacts_acceptContact.f27042id = wmVar.getMessagesController().q1(wmVar.f51306f);
            wmVar.getConnectionsManager().sendRequest(tL_contacts_acceptContact, new be(wmVar, 4));
            return;
        }
        org.telegram.messenger.wy g7 = org.telegram.messenger.wy.g(wmVar.getUserConfig().f(), wmVar.f51376k6, ziVar, wmVar.f51397m4, null, null, true, 0, 0);
        g7.K = wmVar.W8();
        org.telegram.messenger.yy.C(wmVar.currentAccount).r0(g7);
        if (wmVar.f51325g4 == 0) {
            wmVar.oa(false);
        }
        wmVar.B9(false);
    }

    public static void K0(wm wmVar) {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        org.telegram.messenger.bj bjVar;
        ArrayList arrayList;
        String a02;
        wmVar.f51540x5 = null;
        int i3 = wmVar.Pb;
        if (i3 == 2) {
            wmVar.C5 = null;
            wmVar.E5 = null;
            org.telegram.messenger.dj djVar = wmVar.f51526w5;
            if (djVar != null) {
                djVar.f(null, null, wmVar.f51376k6, null);
            }
            wmVar.z8();
        } else if (i3 == 3) {
            org.telegram.messenger.dj djVar2 = wmVar.f51526w5;
            if (djVar2 != null && !djVar2.c() && (bjVar = wmVar.f51526w5.f22198b) != null && (arrayList = bjVar.f21841e) != null) {
                int size = arrayList.size();
                long j10 = 0;
                long j11 = 0;
                for (int i10 = 0; i10 < size; i10++) {
                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) wmVar.f51526w5.f22198b.f21841e.get(i10);
                    if (j10 == 0) {
                        j11 = org.telegram.messenger.zi.B0(ziVar3.f26868k);
                        j10 = ziVar3.Z0();
                    } else if (j10 != ziVar3.Z0()) {
                        break;
                    }
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.L0 = true;
                if (j11 > 0) {
                    TLRPC.User a22 = wmVar.getMessagesController().a2(Long.valueOf(j11));
                    if (a22 != null) {
                        a02 = org.telegram.messenger.bd.a0("CancelForwardPrivate", null, 2131752583, org.telegram.messenger.bd.G(wmVar.f51526w5.f22198b.f21841e.size(), "MessagesBold", new Object[0]), org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name));
                    } else {
                        return;
                    }
                } else {
                    TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(-j11));
                    if (M0 != null) {
                        a02 = org.telegram.messenger.bd.a0("CancelForwardChat", null, 2131752584, org.telegram.messenger.bd.G(wmVar.f51526w5.f22198b.f21841e.size(), "MessagesBold", new Object[0]), M0.title);
                    } else {
                        return;
                    }
                }
                s1Var.U = org.telegram.messenger.g0.X2(a02);
                s1Var.S = org.telegram.messenger.bd.G(wmVar.f51526w5.f22198b.f21841e.size(), "messages", new Object[0]);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131752582, null), new de(wmVar, 6));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131745353, null), new de(wmVar, 7));
                wmVar.showDialog(s1Var);
                TextView textView = (TextView) s1Var.d(-1);
                if (textView != null) {
                    org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, wmVar.getResourceProvider());
                }
            }
        } else if (i3 == 4) {
            wmVar.X5 = null;
            org.telegram.messenger.dj djVar3 = wmVar.f51526w5;
            if (djVar3 != null) {
                int i11 = wmVar.currentAccount;
                org.telegram.messenger.zi ziVar4 = wmVar.E5;
                if (ziVar4 == wmVar.f51397m4) {
                    ziVar2 = null;
                } else {
                    ziVar2 = ziVar4;
                }
                djVar3.e(i11, null, null, ziVar2, wmVar.C5, wmVar.G5);
            }
            mj mjVar = wmVar.f51237a0;
            mjVar.Y2 = null;
            mjVar.Z2 = false;
            wmVar.x8();
            wmVar.z8();
        } else {
            if (org.telegram.messenger.t3.c0(wmVar.f51292e) && !wmVar.f51525w4 && (ziVar = wmVar.E5) != null) {
                long c2 = org.telegram.messenger.zi.c2(wmVar.currentAccount, ziVar.f26868k, true, false);
                if (c2 != 0) {
                    wmVar.getMediaDataController().D(wmVar.f51376k6, c2, false);
                }
            }
            wmVar.bc(false, null, null, null, null, true, 0, null, true, 0L, null, true);
        }
    }

    public static void L0(wm wmVar, int i3) {
        org.telegram.ui.ActionBar.q4 q4Var = wmVar.parentLayout;
        if (q4Var == null) {
            return;
        }
        org.telegram.ui.ActionBar.d2 backgroundFragment = q4Var.getBackgroundFragment();
        if (backgroundFragment instanceof wm) {
            wm wmVar2 = (wm) backgroundFragment;
            if (wmVar2.a() == wmVar.f51376k6) {
                wmVar.finishFragment();
                wmVar2.l(i3, 0, true, 0, true, 0);
                return;
            }
        }
        wmVar.presentFragment(qa(i3, wmVar.f51376k6));
    }

    public static void L2(long j10, wm wmVar) {
        int i3;
        boolean z10;
        org.telegram.messenger.mv mvVar;
        if (j10 != wmVar.c9()) {
            wmVar.getConnectionsManager().cancelRequestsForGuid(wmVar.classGuid);
            wmVar.getMessagesStorage().k(wmVar.classGuid);
            wmVar.classGuid = ConnectionsManager.generateClassGuid();
            wmVar.ob();
            wmVar.f51526w5 = null;
            wmVar.L7 = 0;
            wmVar.E7 = -1;
            wmVar.B7 = false;
            wmVar.C7 = true;
            wmVar.f51554y6.clear();
            if (j10 != 0) {
                i3 = 3;
            } else {
                i3 = 0;
            }
            wmVar.f51325g4 = i3;
            wmVar.f51475s4 = j10;
            if (i3 == 3) {
                org.telegram.messenger.nv G1 = wmVar.getMessagesController().G1();
                long b10 = wmVar.b();
                ArrayList arrayList = G1.f24441j;
                int i10 = 0;
                while (true) {
                    if (i10 < arrayList.size()) {
                        mvVar = (org.telegram.messenger.mv) arrayList.get(i10);
                        if (mvVar.f24264a == b10) {
                            break;
                        }
                        i10++;
                    } else {
                        mvVar = null;
                        break;
                    }
                }
                if (mvVar != null && !mvVar.f24270i) {
                    G1.f(b10, null);
                }
            }
            wmVar.J8();
            wmVar.sd(true);
            qi qiVar = wmVar.f51433p1;
            if (qiVar != null) {
                qiVar.n(true);
                wmVar.f51433p1.b();
            }
            org.telegram.ui.Components.n01 n01Var = wmVar.f51407n0;
            if (n01Var != null) {
                n01Var.setCurrentTopic(j10);
                org.telegram.ui.Components.n01 n01Var2 = wmVar.f51407n0;
                if (wmVar.f51359j0 != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                n01Var2.setMenuAvailable(z10);
            }
            wmVar.vd(true);
            wmVar.Lc(true);
            wmVar.C9(true);
            wmVar.B9(true);
            mj mjVar = wmVar.f51237a0;
            if (mjVar != null) {
                mjVar.j0(false);
                wmVar.f51237a0.H1(true);
            }
            wmVar.M6(true, true);
            om omVar = wmVar.Sc;
            if (omVar != null && wmVar.actionBar.f27728o0) {
                omVar.k(null);
            }
        }
    }

    public static void M0(wm wmVar, TLRPC.ReactionCount reactionCount) {
        wmVar.O7(true);
        org.telegram.ui.Components.tl0.c(wmVar.getParentActivity(), wmVar.currentAccount, reactionCount.reaction, wmVar.f51557ya);
    }

    public static void M2(wm wmVar, Canvas canvas) {
        float f10;
        org.telegram.ui.ActionBar.q0 m92 = wmVar.m9();
        if (m92 == null) {
            return;
        }
        View view = (View) m92.getParent();
        float x10 = wmVar.actionBar.getX();
        org.telegram.ui.Components.n01 n01Var = wmVar.f51407n0;
        if (n01Var != null) {
            f10 = n01Var.getProgress() * wmVar.f51407n0.getContentWidth();
        } else {
            f10 = 0.0f;
        }
        float x11 = (m92.getX() + (view.getX() + (x10 - f10))) - wmVar.f51407n0.getX();
        float y9 = (m92.getY() + (view.getY() + wmVar.actionBar.getY())) - wmVar.f51407n0.getY();
        if (wmVar.f51532wb == null) {
            wmVar.f51532wb = new Paint(1);
        }
        wmVar.f51532wb.setColor(org.telegram.ui.ActionBar.k6.r1(wmVar.f51407n0.getProgress(), wmVar.getThemedColor(org.telegram.ui.ActionBar.k6.f27878d6)));
        canvas.drawCircle((m92.getWidth() / 2.0f) + x11, (m92.getHeight() / 2.0f) + y9, org.telegram.messenger.g0.L(23.0f), wmVar.f51532wb);
        canvas.save();
        canvas.translate(x11, y9);
        m92.draw(canvas);
        canvas.restore();
    }

    public static void N0(wm wmVar, CharSequence charSequence, org.telegram.messenger.hp hpVar, boolean z10) {
        boolean z11;
        CharSequence charSequence2;
        org.telegram.ui.Components.x31[] x31VarArr;
        if (wmVar.W5 != 0) {
            wmVar.getConnectionsManager().cancelRequest(wmVar.W5, true);
            wmVar.W5 = 0;
            z11 = true;
        } else {
            z11 = false;
        }
        ArrayList arrayList = null;
        try {
            Matcher matcher = org.telegram.messenger.g0.S.matcher(charSequence);
            while (matcher.find()) {
                if (matcher.start() <= 0 || charSequence.charAt(matcher.start() - 1) != '@') {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(charSequence.subSequence(matcher.start(), matcher.end()));
                }
            }
            if ((charSequence instanceof Spannable) && (x31VarArr = (org.telegram.ui.Components.x31[]) ((Spannable) charSequence).getSpans(0, charSequence.length(), org.telegram.ui.Components.x31.class)) != null && x31VarArr.length > 0) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                for (org.telegram.ui.Components.x31 x31Var : x31VarArr) {
                    arrayList.add(x31Var.getURL());
                }
            }
            if (arrayList != null && wmVar.Y5 != null && arrayList.size() == wmVar.Y5.size()) {
                boolean z12 = true;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    if (!TextUtils.equals((CharSequence) arrayList.get(i3), (CharSequence) wmVar.Y5.get(i3))) {
                        z12 = false;
                    }
                }
                if (z12 && !z11) {
                    return;
                }
            }
            wmVar.Y5 = arrayList;
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
            String lowerCase = charSequence.toString().toLowerCase();
            if (charSequence.length() >= 13 && (lowerCase.contains("http://") || lowerCase.contains("https://"))) {
                charSequence2 = charSequence;
            } else {
                org.telegram.messenger.g0.h3(new tf(wmVar, 8));
                return;
            }
        }
        if (arrayList == null) {
            org.telegram.messenger.g0.h3(new tf(wmVar, 7));
            return;
        }
        charSequence2 = TextUtils.join(" ", arrayList);
        if (arrayList != null && !arrayList.isEmpty()) {
            ((CharSequence) arrayList.get(0)).toString();
        }
        if (wmVar.h != null && hpVar.H2 == 2) {
            org.telegram.messenger.g0.h3(new he(wmVar, hpVar, charSequence, z10));
            return;
        }
        TL_account.getWebPagePreview getwebpagepreview = new TL_account.getWebPagePreview();
        if (charSequence2 instanceof String) {
            getwebpagepreview.message = (String) charSequence2;
        } else {
            getwebpagepreview.message = charSequence2.toString();
        }
        TLRPC.WebPage webPage = wmVar.X5;
        if (webPage == null || !getwebpagepreview.message.equals(webPage.displayedText)) {
            int i10 = wmVar.Mb + 1;
            wmVar.Mb = i10;
            wf wfVar = new wf(wmVar, i10, getwebpagepreview, 0);
            if (wmVar.Nb == null) {
                wmVar.Nb = new HashMap();
            }
            TLRPC.WebPage webPage2 = (TLRPC.WebPage) wmVar.Nb.get(getwebpagepreview.message);
            if (webPage2 != null) {
                wfVar.a(Boolean.TRUE, webPage2);
                return;
            }
            o6 o6Var = new o6(wmVar, getwebpagepreview, wfVar, 1);
            if (wmVar.W5 != 0) {
                wmVar.getConnectionsManager().cancelRequest(wmVar.W5, true);
            }
            wmVar.W5 = wmVar.getConnectionsManager().sendRequestTyped(getwebpagepreview, new c3.b(1), new ai.q4(11, wmVar, o6Var));
            wmVar.getConnectionsManager().bindRequestToGuid(wmVar.W5, wmVar.classGuid);
        }
    }

    public static void N1(wm wmVar) {
        int i3;
        if (wmVar.a() == wmVar.getUserConfig().e() && wmVar.getUserConfig().q() && wmVar.f51558yb == null) {
            dk dkVar = new dk(wmVar, wmVar, wmVar.getParentActivity(), wmVar.currentAccount, wmVar.f51557ya);
            wmVar.f51558yb = dkVar;
            dkVar.setPadding(org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(0.0f));
            wmVar.f51558yb.setDelegate(new ek(wmVar));
            wmVar.f51558yb.setTop(true);
            int i10 = 0;
            wmVar.f51558yb.setClipChildren(false);
            wmVar.f51558yb.setClipToPadding(false);
            wmVar.f51558yb.setVisibility(0);
            dk dkVar2 = wmVar.f51558yb;
            if (dkVar2.getSelectedReactions().isEmpty()) {
                i3 = 2131745882;
            } else {
                i3 = 2131745881;
            }
            dkVar2.setHint(org.telegram.messenger.bd.M0(i3, null));
            wmVar.m1.addView(wmVar.f51558yb, b8.mf.d(-2, 92.5f, 49, 0.0f, 0.0f, 0.0f, 0.0f));
            wmVar.f51558yb.p(null, null, true);
            wmVar.f51558yb.setTranslationY(-org.telegram.messenger.g0.L(12.0f));
            wmVar.f51558yb.setScaleY(0.4f);
            wmVar.f51558yb.setScaleX(0.4f);
            wmVar.f51558yb.animate().scaleY(1.0f).scaleX(1.0f).translationY(0.0f).setDuration(420L).setInterpolator(org.telegram.ui.Components.xq.h).start();
            wmVar.pd();
            dk dkVar3 = wmVar.f51558yb;
            float f10 = wmVar.Q9;
            wj wjVar = wmVar.D1;
            if (wjVar != null) {
                i10 = wjVar.getCurrentHeight();
            }
            dkVar3.setTranslationY(f10 + i10);
        }
    }

    public static void O0(wm wmVar, Context context, TLRPC.TL_error tL_error) {
        boolean z10;
        org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit().putLong("dialog_join_requested_time_" + wmVar.f51376k6, System.currentTimeMillis()).commit();
        if (tL_error != null && "INVITE_REQUEST_SENT".equals(tL_error.text)) {
            if (org.telegram.messenger.t3.T(wmVar.f51292e) && !wmVar.f51292e.megagroup) {
                z10 = true;
            } else {
                z10 = false;
            }
            int i3 = org.telegram.ui.Components.x60.f40246r1;
            org.telegram.ui.Components.x60.J0(context, wmVar, org.telegram.ui.Components.fc.a0(wmVar), z10);
        }
        wmVar.Yb(false, true);
    }

    public static org.telegram.ui.mq0 O1(org.telegram.ui.wm r14, org.telegram.messenger.zi r15, org.telegram.tgnet.TLRPC.FileLocation r16, int r17, boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.O1(org.telegram.ui.wm, org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$FileLocation, int, boolean, boolean):org.telegram.ui.mq0");
    }

    public static void P0(wm wmVar, int i3, ArrayList arrayList, String str, String str2, String str3, TLRPC.InputPeer inputPeer, int[] iArr, TL_iv.RichMessage richMessage, boolean z10, bf bfVar) {
        String str4;
        org.telegram.ui.Components.x11 x11Var;
        if (wmVar.f51500u5 != null && i3 < arrayList.size() && wmVar.getParentActivity() != null) {
            if (str != null && str.equals(str2)) {
                str4 = str3;
            } else {
                str4 = str2;
            }
            Activity parentActivity = wmVar.getParentActivity();
            int i10 = iArr[0];
            xe xeVar = new xe(wmVar, 19);
            String[] strArr = org.telegram.ui.Components.f21.P1;
            if (parentActivity == null) {
                x11Var = null;
            } else {
                org.telegram.ui.Components.x11 x11Var2 = new org.telegram.ui.Components.x11(parentActivity, str, str4, inputPeer, i10, richMessage, xeVar);
                x11Var2.R0(z10);
                x11Var2.K1 = wmVar;
                x11Var2.L1 = bfVar;
                if (wmVar.getParentActivity() != null) {
                    wmVar.showDialog(x11Var2);
                }
                x11Var = x11Var2;
            }
            x11Var.f28611p0 = false;
            wmVar.O7(false);
            SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7;
            int i11 = sharedPreferences.getInt("dialog_show_translate_count" + wmVar.a(), 5);
            if (i11 > 0) {
                SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit();
                edit.putInt("dialog_show_translate_count" + wmVar.a(), i11 - 1).apply();
                wmVar.vd(true);
            }
        }
    }

    public static boolean P9(String str) {
        if (!str.startsWith("https://") && !str.startsWith("@") && !str.startsWith("#") && !str.startsWith("$") && !str.startsWith("video?")) {
            return false;
        }
        return true;
    }

    public static TLRPC.TL_message Q7(TLRPC.Message message) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f27022id = message.f27022id;
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

    public static void R0(wm wmVar, TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage, TLRPC.TL_webPageAttributeStory tL_webPageAttributeStory, o6 o6Var) {
        try {
            a0.h hVar = new a0.h();
            TLRPC.TL_message tL_message = new TLRPC.TL_message();
            tL_message.message = "";
            tL_message.f27022id = 0;
            tL_message.media = tL_messageMediaWebPage;
            ArrayList arrayList = new ArrayList();
            arrayList.add(new org.telegram.messenger.zi(wmVar.currentAccount, tL_message, false, false));
            hVar.k(arrayList, org.telegram.messenger.m5.o(tL_webPageAttributeStory.peer));
            wmVar.getMessagesController().P1().f11282k.d(hVar, new sc(16, hVar, o6Var), wmVar.classGuid, false, null);
        } catch (Exception unused) {
        }
    }

    public static void S0(wm wmVar) {
        wmVar.V7(false);
        if (!wmVar.fragmentBeginToShow) {
            wi wiVar = wmVar.A0;
            wiVar.X1 = false;
            wiVar.Y1 = 0;
            wiVar.setEmptyView(wmVar.f51308f1);
            wi wiVar2 = wmVar.A0;
            wiVar2.X1 = true;
            wiVar2.Y1 = 1;
            return;
        }
        wmVar.A0.setEmptyView(wmVar.f51308f1);
    }

    public static void T0(wm wmVar, org.telegram.messenger.ui uiVar, org.telegram.messenger.zi ziVar, int i3, int i10) {
        if (uiVar != null) {
            ArrayList arrayList = uiVar.d;
            if (!arrayList.isEmpty()) {
                org.telegram.messenger.yy.C(wmVar.currentAccount).u((org.telegram.messenger.zi) arrayList.get(0), wmVar, i3, i10);
                return;
            }
        }
        org.telegram.messenger.yy.C(wmVar.currentAccount).u(ziVar, wmVar, i3, i10);
    }

    public static void U0(wm wmVar, Object[] objArr, org.telegram.ui.Components.xv0 xv0Var, boolean z10, TLRPC.StickerSet stickerSet) {
        int i3;
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
                org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(xv0Var.f28589c, wmVar.resourceProvider);
                if (z10) {
                    i3 = 2131744854;
                } else {
                    i3 = 2131744855;
                }
                org.telegram.ui.Components.ac q10 = fcVar.q(document, org.telegram.messenger.bd.a0(null, null, i3, stickerSet.title));
                q10.f31792j = 2750;
                q10.k(true);
            }
        }
    }

    public static void V0(wm wmVar) {
        if (org.telegram.messenger.g0.g(wmVar.f51418nc.V0)) {
            org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.resourceProvider));
        }
    }

    public static CharSequence V8(org.telegram.messenger.zi ziVar, org.telegram.messenger.ui uiVar, int[] iArr) {
        if (ziVar == null) {
            return null;
        }
        String F1 = org.telegram.messenger.hp.s1(ziVar.I1).F1(ziVar.f26868k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            return F1;
        }
        if (ziVar.U4() && !org.telegram.ui.Components.m11.j(ziVar)) {
            return ziVar.j2();
        }
        CharSequence charSequence = ziVar.f26924z;
        if (charSequence != null) {
            return charSequence;
        }
        if (uiVar == null) {
            return null;
        }
        ArrayList arrayList = uiVar.d;
        int size = arrayList.size();
        CharSequence charSequence2 = null;
        for (int i3 = 0; i3 < size; i3++) {
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i3);
            CharSequence charSequence3 = ziVar2.f26924z;
            if (charSequence3 != null) {
                if (charSequence2 != null) {
                    return null;
                }
                if (iArr != null) {
                    iArr[0] = ziVar2.f1();
                }
                charSequence2 = charSequence3;
            }
        }
        return charSequence2;
    }

    public static void W0(wm wmVar, String str) {
        if (org.telegram.messenger.hp.s1(wmVar.currentAccount).L2(false)) {
            wmVar.getParentActivity();
            sf.c.o(str);
            return;
        }
        org.telegram.ui.Components.t4.n0(wmVar.getParentActivity(), wmVar.f51557ya, str, false, new nf(wmVar, str, 0));
    }

    public static ArrayList W7(ArrayList arrayList, boolean z10, CharSequence charSequence) {
        ArrayList arrayList2 = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) arrayList.get(i3);
            String str = xyVar.f26477c;
            if (str == null) {
                if (xyVar.f26475a != null) {
                    try {
                        File q02 = org.telegram.messenger.g0.q0("", z10);
                        InputStream openInputStream = org.telegram.messenger.t0.f25457b.getContentResolver().openInputStream(xyVar.f26475a);
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
                    } catch (Exception e10) {
                        org.telegram.messenger.a8.g(e10, true);
                    }
                } else {
                    str = null;
                }
            }
            String str2 = str;
            if (str2 != null) {
                Pair N0 = org.telegram.messenger.g0.N0(str2);
                org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, str2, ((Integer) N0.first).intValue(), xyVar.f26487o, 0, 0);
                yeVar.n(N0);
                if (i3 == arrayList.size() - 1 && charSequence != null) {
                    yeVar.f25309a = charSequence;
                }
                arrayList2.add(yeVar);
            }
        }
        return arrayList2;
    }

    public static void X0(wm wmVar, long j10, boolean z10) {
        if (!wmVar.U4.isEmpty()) {
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit();
            edit.putInt("pin_" + wmVar.f51376k6, ((Integer) wmVar.U4.get(0)).intValue()).commit();
            wmVar.U4.clear();
            wmVar.W4.clear();
            wmVar.Y4 = 0;
            wmVar.f51270c5 = 0;
            wmVar.f51283d5 = 0;
            wmVar.cd(0, true);
        }
        if (org.telegram.messenger.t3.p0(wmVar.f51292e) && org.telegram.messenger.t3.A(wmVar.currentAccount, wmVar.f51292e, 24)) {
            if (j10 != 0) {
                org.telegram.messenger.qr messagesStorage = wmVar.getMessagesStorage();
                messagesStorage.f24934a.c(new org.telegram.messenger.mp(1, -wmVar.f51292e.f27001id, j10, messagesStorage));
                wmVar.getMessagesController().i0(j10, 0, wmVar.getMessagesController().j1(-wmVar.f51292e.f27001id));
                wmVar.getMessagesController().f23102q7.s(wmVar.f51292e.f27001id, j10);
            }
        } else {
            wmVar.getMessagesController().X(1, wmVar.f51376k6, z10);
            org.telegram.messenger.qr messagesStorage2 = wmVar.getMessagesStorage();
            long j11 = wmVar.f51376k6;
            messagesStorage2.getClass();
            messagesStorage2.I(new org.telegram.messenger.op(messagesStorage2, j11, 2));
            org.telegram.messenger.c00 c00Var = wmVar.getMessagesController().f23102q7;
            c00Var.getClass();
            org.telegram.messenger.g0.h3(new ci.cc((Object) c00Var, -wmVar.f51376k6, true, 4));
        }
        wmVar.f51284d6.put(j10, 0);
        org.telegram.ui.Components.g11 g11Var = wmVar.f51323g2;
        if (g11Var != null) {
            g11Var.setAllTopicsHidden(false);
        }
        if (j10 == wmVar.f51475s4) {
            wmVar.M7(false, null);
            wmVar.D0.O(false);
        }
    }

    public static SpannableStringBuilder X8(long j10, org.telegram.messenger.zi ziVar, boolean z10) {
        TLRPC.Chat M0;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (z10) {
            long Z0 = ziVar.Z0();
            int i3 = ziVar.I1;
            if (j10 != Z0) {
                int i10 = (Z0 > 0L ? 1 : (Z0 == 0L ? 0 : -1));
                if (i10 > 0) {
                    TLRPC.User a22 = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(Z0));
                    if (a22 != null) {
                        spannableStringBuilder.append((CharSequence) org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name)).append((CharSequence) ":\n");
                    }
                } else if (i10 < 0 && (M0 = org.telegram.messenger.hp.s1(i3).M0(Long.valueOf(-Z0))) != null) {
                    spannableStringBuilder.append((CharSequence) M0.title).append((CharSequence) ":\n");
                }
            }
        }
        String F1 = org.telegram.messenger.hp.s1(ziVar.I1).F1(ziVar.f26868k.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            spannableStringBuilder.append((CharSequence) F1);
            return spannableStringBuilder;
        }
        CharSequence charSequence = ziVar.f26924z;
        if (charSequence != null) {
            spannableStringBuilder.append(charSequence);
            return spannableStringBuilder;
        }
        spannableStringBuilder.append(ziVar.v);
        return spannableStringBuilder;
    }

    public static void Y0(wm wmVar, int i3) {
        if (wmVar.fragmentView != null) {
            org.telegram.ui.Cells.z H8 = wmVar.H8(i3, false);
            if (H8 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) H8;
                dh.o0 o0Var = q1Var.O;
                TLRPC.MessagePeerReaction L1 = q1Var.getMessageObject().L1();
                if (L1 != null && (o0Var.H || L1.big)) {
                    dh.j0.d(wmVar, null, H8, null, 0.0f, 0.0f, dh.n0.d(L1.reaction), wmVar.currentAccount, !L1.big ? 1 : 0);
                    dh.j0.f();
                }
                o0Var.H = false;
                org.telegram.messenger.zi ziVar = q1Var.P5;
                if (ziVar != null) {
                    ziVar.i5();
                }
            } else if (H8 instanceof org.telegram.ui.Cells.t0) {
                org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) H8;
                dh.o0 o0Var2 = t0Var.F0;
                TLRPC.MessagePeerReaction L12 = t0Var.getMessageObject().L1();
                if (L12 != null && (o0Var2.H || L12.big)) {
                    dh.j0.d(wmVar, null, H8, null, 0.0f, 0.0f, dh.n0.d(L12.reaction), wmVar.currentAccount, !L12.big ? 1 : 0);
                    dh.j0.f();
                }
                o0Var2.H = false;
                org.telegram.messenger.zi ziVar2 = t0Var.Q0;
                if (ziVar2 != null) {
                    ziVar2.i5();
                }
            }
        }
    }

    public static FrameLayout Y7(int i3, Context context, CharSequence charSequence, org.telegram.ui.ActionBar.e6 e6Var) {
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setMinimumHeight(org.telegram.messenger.g0.L(48.0f));
        frameLayout.setPadding(org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f), org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(4.0f));
        ci.ec ecVar = new ci.ec(context, 13);
        int i10 = 3;
        ecVar.setMaxLines(3);
        ecVar.setGravity(3);
        ecVar.setEllipsize(TextUtils.TruncateAt.END);
        org.telegram.ui.ActionBar.r6.V(ecVar, org.telegram.ui.ActionBar.k6.E8, e6Var);
        ecVar.setTextSize(1, i3);
        ecVar.setMaxWidth(org.telegram.messenger.g0.L(170.0f));
        ecVar.setText(charSequence);
        if (org.telegram.messenger.bd.f21784a0) {
            i10 = 5;
        }
        frameLayout.addView(ecVar, b8.mf.e(-1, -2, i10 | 16));
        return frameLayout;
    }

    public static void Z(wm wmVar) {
        int i3;
        String str;
        int i10;
        Activity parentActivity = wmVar.getParentActivity();
        int i11 = wmVar.currentAccount;
        long j10 = wmVar.f51376k6;
        um umVar = wmVar.f51557ya;
        int i12 = org.telegram.ui.Components.on.M;
        org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) parentActivity, (org.telegram.ui.ActionBar.e6) umVar, false);
        t2Var.P(org.telegram.ui.ActionBar.k6.f27954h5);
        LinearLayout linearLayout = new LinearLayout(parentActivity);
        linearLayout.setOrientation(1);
        linearLayout.setPadding(org.telegram.messenger.g0.L(16.0f), 0, org.telegram.messenger.g0.L(16.0f), 0);
        ?? imageView = new ImageView(parentActivity);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(2131624077, 80, 80, null);
        imageView.d();
        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
        int L = org.telegram.messenger.g0.L(80.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Ci;
        ShapeDrawable L2 = org.telegram.ui.ActionBar.k6.L(L, org.telegram.ui.ActionBar.k6.w0(i13, umVar));
        org.telegram.ui.ActionBar.n6 N = org.telegram.ui.ActionBar.r6.N(i13);
        imageView.setBackground(L2);
        org.telegram.ui.ActionBar.r6.k(imageView, L2, N, null, umVar);
        linearLayout.addView((View) imageView, b8.mf.t(80, 80, 1, 0, 16, 0, 16));
        boolean D3 = org.telegram.messenger.hp.s1(i11).D3();
        TextView textView = new TextView(parentActivity);
        textView.setTypeface(org.telegram.messenger.g0.o());
        textView.setGravity(17);
        int i14 = org.telegram.ui.ActionBar.k6.f27988j5;
        org.telegram.ui.ActionBar.r6.V(textView, i14, umVar);
        textView.setTextSize(1, 20.0f);
        if (D3) {
            i3 = 2131747044;
        } else {
            i3 = 2131747045;
        }
        textView.setText(org.telegram.messenger.bd.M0(i3, null));
        linearLayout.addView(textView, b8.mf.t(-1, -2, 1, 12, 0, 12, 0));
        TextView textView2 = new TextView(parentActivity);
        textView2.setGravity(17);
        org.telegram.ui.ActionBar.r6.V(textView2, i14, umVar);
        textView2.setTextSize(1, 14.0f);
        if (j10 > 0) {
            str = org.telegram.messenger.l10.j(org.telegram.messenger.hp.s1(i11).a2(Long.valueOf(j10)), true);
        } else {
            str = "";
        }
        if (D3) {
            i10 = 2131747042;
        } else {
            i10 = 2131747043;
        }
        org.telegram.messenger.k5.r(null, null, i10, new Object[]{str, str}, textView2);
        linearLayout.addView(textView2, b8.mf.t(-1, -2, 1, 12, 9, 12, 19));
        if (!D3) {
            vg.o0 o0Var = new vg.o0(parentActivity, umVar, true);
            o0Var.setOnClickListener(new org.telegram.ui.Components.w2(t2Var, 1));
            o0Var.c(org.telegram.messenger.bd.M0(2131747046, null), false, false);
            linearLayout.addView(o0Var, b8.mf.t(-1, 48, 1, 0, 0, 0, 4));
        }
        t2Var.O = linearLayout;
        t2Var.show();
    }

    public static void Z0(org.telegram.ui.wm r12, org.telegram.ui.oj r13, boolean[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Z0(org.telegram.ui.wm, org.telegram.ui.oj, boolean[]):void");
    }

    public static org.telegram.messenger.zi Z1(wm wmVar) {
        View view = wmVar.f51479s9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            return ((org.telegram.ui.Cells.q1) view).getMessageObject();
        }
        if (view instanceof org.telegram.ui.Cells.t0) {
            return ((org.telegram.ui.Cells.t0) view).getMessageObject();
        }
        return null;
    }

    public static ai.r1 Z4(wm wmVar, org.telegram.messenger.zi ziVar) {
        if (ziVar != null && !ziVar.O3() && ziVar.m4() && ziVar.f26868k.ttl == Integer.MAX_VALUE) {
            long V = wmVar.getMessagesController().V(ziVar.f1(), wmVar.f51376k6);
            ziVar.G0 = true;
            if (ziVar.Q3() || (!ziVar.h4() && !ziVar.T4())) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(ziVar);
                wmVar.Xc(arrayList, true);
            }
            return new ai.r1(wmVar, V, ziVar, 17);
        }
        return null;
    }

    public static void a0(wm wmVar, org.telegram.ui.Components.f60 f60Var) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) f60Var.A;
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(wmVar.getParentActivity(), wmVar.currentAccount, actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack(), false, new mi.h0(10, wmVar, f60Var), wmVar.getResourceProvider());
        xnVar.e(wmVar.f51376k6, wmVar.b(), null);
        int b10 = actionBarPopupWindow$ActionBarPopupWindowLayout.b(xnVar.f40423f);
        f60Var.f33739n0 = true;
        actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(b10);
    }

    public static void a1(wm wmVar) {
        if (wmVar.f51325g4 == 0 && wmVar.getMessagesController().N6 > wmVar.getConnectionsManager().getCurrentTime() && !b.a(wmVar.currentAccount, wmVar.f51306f)) {
            b.c(wmVar.currentAccount, wmVar.getParentActivity(), wmVar.getResourceProvider());
        }
    }

    public static void b0(wm wmVar, int i3) {
        if (i3 != 0) {
            org.telegram.messenger.g0.h3(new ne(wmVar, i3, 7));
        } else {
            wmVar.actionBar.setSubtitle(org.telegram.messenger.bd.M0(2131748200, null));
        }
    }

    public static void b1(wm wmVar, int i3) {
        eh.g gVar = wmVar.H;
        if (Build.VERSION.SDK_INT >= 31 && gVar != null) {
            if (x7.u.a(i3, 4)) {
                ri.a e10 = wmVar.glassEngine.e();
                float L = org.telegram.messenger.g0.L(48.0f);
                float L2 = org.telegram.messenger.g0.L(48.0f);
                int i10 = 0;
                while (i10 < e10.f54544b) {
                    RectF rectF = (RectF) e10.f54543a.get(i10);
                    rectF.inset(-L, -L2);
                    if (rectF.isEmpty()) {
                        e10.d(i10);
                    } else {
                        i10++;
                    }
                }
                e10.b(wmVar.A0.getY(), wmVar.A0.getWidth(), wmVar.A0.getY() + wmVar.A0.getHeight());
                gVar.h(e10);
            }
            kl klVar = wmVar.m1;
            gVar.e(klVar.f46972q0, klVar.getWidth(), wmVar.m1.getHeight());
        }
    }

    public static void c0(org.telegram.ui.wm r8, java.lang.String r9, android.text.style.CharacterStyle r10, org.telegram.messenger.zi r11, org.telegram.ui.Cells.q1 r12, int r13, int r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.c0(org.telegram.ui.wm, java.lang.String, android.text.style.CharacterStyle, org.telegram.messenger.zi, org.telegram.ui.Cells.q1, int, int):void");
    }

    public static void c1(wm wmVar) {
        wmVar.f51517va = null;
        wmVar.A0.setOnInterceptTouchListener(null);
        wmVar.Lb(wmVar.m1, true);
        org.telegram.messenger.d4.f(wmVar.currentAccount).f22140a.clear();
    }

    public static void d0(wm wmVar) {
        if (wmVar.f51411n5) {
            wmVar.f51411n5 = false;
            MediaController B = MediaController.B();
            if (B.J() && !B.K() && B.f21321h1 == wmVar.classGuid) {
                B.D0(false);
            }
        }
    }

    public static void d1(wm wmVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.TL_payments_paymentReceiptStars) {
            ci.wb.m1(wmVar.getParentActivity(), wmVar.currentAccount, (TLRPC.TL_payments_paymentReceiptStars) tLObject, wmVar.resourceProvider);
        } else if (tLObject instanceof TLRPC.PaymentReceipt) {
            wmVar.presentFragment(new dl0((TLRPC.PaymentReceipt) tLObject));
        }
    }

    public static void d2(wm wmVar, float f10) {
        View view = wmVar.f51479s9;
        if (view instanceof org.telegram.ui.Cells.q1) {
            ((org.telegram.ui.Cells.q1) view).setSlidingOffset(f10);
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ((org.telegram.ui.Cells.t0) view).setWalletSlidingOffset(f10);
        }
    }

    public static void e0(wm wmVar, TLObject tLObject, TLRPC.User user) {
        TLObject tLObject2;
        int L;
        int L2;
        if (tLObject instanceof TLRPC.TL_attachMenuBotsBot) {
            TLRPC.TL_attachMenuBotsBot tL_attachMenuBotsBot = (TLRPC.TL_attachMenuBotsBot) tLObject;
            org.telegram.messenger.hp.s1(wmVar.currentAccount).Y3(tL_attachMenuBotsBot.users, false);
            TLRPC.TL_attachMenuBot tL_attachMenuBot = tL_attachMenuBotsBot.bot;
            if (wmVar.j() != null) {
                tLObject2 = wmVar.j();
            } else {
                tLObject2 = wmVar.f51292e;
            }
            if (!org.telegram.messenger.li.t(tL_attachMenuBot, tLObject2)) {
                TLRPC.User user2 = wmVar.f51306f;
                if (user2 != null && user2.bot && user.f27150id == tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.p(null, 2131753104, org.telegram.ui.Components.fc.a0(wmVar), null);
                } else if (user2 != null && user2.bot && user.f27150id != tL_attachMenuBot.bot_id) {
                    org.telegram.messenger.k5.p(null, 2131753107, org.telegram.ui.Components.fc.a0(wmVar), null);
                } else if (user2 != null && !user2.bot) {
                    org.telegram.messenger.k5.p(null, 2131753103, org.telegram.ui.Components.fc.a0(wmVar), null);
                } else {
                    TLRPC.Chat chat = wmVar.f51292e;
                    if (chat != null && !org.telegram.messenger.t3.V(chat)) {
                        org.telegram.messenger.k5.p(null, 2131753105, org.telegram.ui.Components.fc.a0(wmVar), null);
                        return;
                    }
                    TLRPC.Chat chat2 = wmVar.f51292e;
                    if (chat2 != null && org.telegram.messenger.t3.V(chat2)) {
                        org.telegram.messenger.k5.p(null, 2131753106, org.telegram.ui.Components.fc.a0(wmVar), null);
                    }
                }
            } else if (!tL_attachMenuBot.inactive) {
                wmVar.wa(user.f27150id, wmVar.B8, false);
            } else if (!tL_attachMenuBot.show_in_attach_menu && !tL_attachMenuBot.show_in_side_menu) {
                org.telegram.ui.Components.o6 o6Var = new org.telegram.ui.Components.o6(wmVar.getParentActivity());
                o6Var.setColor(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27976ia, false));
                org.telegram.ui.ActionBar.r6.i(org.telegram.ui.ActionBar.k6.L5, o6Var, null);
                o6Var.setAttachBot(tL_attachMenuBot);
                AtomicBoolean atomicBoolean = new AtomicBoolean();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(wmVar.getParentActivity());
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.W = o6Var;
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("BotRequestAttachPermission", null, 2131752996, org.telegram.messenger.l10.p(user)));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131753153, null), new a1.d(wmVar, user, atomicBoolean, tL_attachMenuBot, 7));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                if (tL_attachMenuBot.request_write_access) {
                    atomicBoolean.set(true);
                    org.telegram.ui.Cells.c2 c2Var = new org.telegram.ui.Cells.c2(5, wmVar.getParentActivity(), wmVar.getResourceProvider());
                    c2Var.setPadding(0, org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f));
                    c2Var.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
                    c2Var.setMultiline(true);
                    c2Var.e(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131747788, org.telegram.messenger.l10.p(user))), "", true, false, false);
                    if (org.telegram.messenger.bd.f21784a0) {
                        L = org.telegram.messenger.g0.L(16.0f);
                    } else {
                        L = org.telegram.messenger.g0.L(8.0f);
                    }
                    if (org.telegram.messenger.bd.f21784a0) {
                        L2 = org.telegram.messenger.g0.L(8.0f);
                    } else {
                        L2 = org.telegram.messenger.g0.L(16.0f);
                    }
                    c2Var.setPadding(L, 0, L2, 0);
                    c2Var.setOnClickListener(new org.telegram.messenger.video.g(18, c2Var, atomicBoolean));
                    s1Var.H = 6;
                    alertDialog$Builder.o(c2Var);
                }
                alertDialog$Builder.p();
            } else {
                rc1.a(wmVar.getParentActivity(), new z(wmVar, user, tL_attachMenuBot, 4), null);
            }
        }
    }

    public static void e2(wm wmVar) {
        long j10;
        to toVar = wmVar.f51369ja;
        if (toVar != null) {
            if (wmVar.f51525w4) {
                if (toVar.I != null) {
                    if (wmVar.getParentLayout() != null) {
                        org.telegram.ui.Components.b9.a(wmVar, wmVar.getParentLayout().getFragmentStack().indexOf(wmVar), wmVar.f51292e, wmVar.f51306f, wmVar.f51463r4, wmVar.f51376k6, wmVar.Pa, wmVar.Oa);
                    }
                    TLRPC.Chat chat = wmVar.f51292e;
                    TLRPC.TL_forumTopic tL_forumTopic = wmVar.f51369ja.I;
                    long j11 = wmVar.f51376k6;
                    int i3 = wmVar.Oa;
                    int i10 = wmVar.Pa;
                    if (wmVar.getParentLayout() != null) {
                        org.telegram.ui.Components.b9.a(wmVar, wmVar.getParentLayout().getFragmentStack().indexOf(wmVar), chat, null, tL_forumTopic, j11, i3, i10);
                    }
                    Bundle bundle = new Bundle();
                    bundle.putInt("dialog_folder_id", wmVar.f51369ja.f49836a);
                    bundle.putInt("dialog_filter_id", wmVar.f51369ja.f49838b);
                    bundle.putBoolean("pulled", true);
                    wm g7 = rg.c.g(wmVar, -wmVar.f51376k6, wmVar.f51369ja.I, 0, bundle);
                    g7.la = true;
                    f51234qd = true;
                    wmVar.presentFragment(g7, true);
                    return;
                }
                return;
            }
            TLRPC.Chat chat2 = toVar.H;
            long j12 = 0;
            if (chat2 == null) {
                j10 = 0;
            } else {
                j10 = chat2.f27001id;
            }
            if (j10 != 0) {
                wmVar.H6();
                to toVar2 = wmVar.f51369ja;
                TLRPC.Chat chat3 = toVar2.H;
                long j13 = toVar2.f49837a0;
                int i11 = toVar2.f49836a;
                int i12 = toVar2.f49838b;
                if (wmVar.getParentLayout() != null) {
                    org.telegram.ui.Components.b9.a(wmVar, wmVar.getParentLayout().getFragmentStack().indexOf(wmVar), chat3, null, null, j13, i11, i12);
                }
                Bundle bundle2 = new Bundle();
                TLRPC.Chat chat4 = wmVar.f51369ja.H;
                if (chat4 != null) {
                    j12 = chat4.f27001id;
                }
                bundle2.putLong("chat_id", j12);
                bundle2.putInt("dialog_folder_id", wmVar.f51369ja.f49836a);
                bundle2.putInt("dialog_filter_id", wmVar.f51369ja.f49838b);
                bundle2.putBoolean("pulled", true);
                org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit().remove("diditem" + wmVar.f51369ja.f49837a0).apply();
                wm wmVar2 = new wm(bundle2);
                ArrayList arrayList = wmVar.Cb;
                if (arrayList != null && arrayList.size() > 1) {
                    ArrayList arrayList2 = wmVar.Cb;
                    wmVar2.Cb = new ArrayList(arrayList2.subList(1, arrayList2.size()));
                }
                wmVar2.la = true;
                f51234qd = true;
                wmVar.presentFragment(wmVar2, true);
            }
        }
    }

    public static void e5(wm wmVar, org.telegram.ui.Cells.q1 q1Var) {
        vh.a aVar;
        int i3;
        int i10;
        qe.a aVar2 = wmVar.f51264bd;
        if (wmVar.f51237a0 != null && !aVar2.f53841f && q1Var.getMessageObject() != null) {
            kl klVar = wmVar.m1;
            RectF rectF = org.telegram.messenger.g0.P;
            kh.k.c(q1Var, klVar, rectF);
            Rect rect = org.telegram.messenger.g0.Q;
            org.telegram.ui.Cells.w1 w1Var = q1Var.f30122w2;
            if (w1Var != null && (aVar = w1Var.f30784l) != null && w1Var.f30791s) {
                rect.set(aVar.getBounds());
                int measuredHeight = (int) (rectF.bottom - (((wmVar.m1.getMeasuredHeight() - wmVar.A0.getPaddingBottom()) + wmVar.Xc) - org.telegram.messenger.g0.L(2.0f)));
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                if (wmVar.f51345hd == null) {
                    wmVar.f51345hd = new th.b(wmVar.getParentActivity(), wmVar.resourceProvider, wmVar);
                    int indexOfChild = wmVar.m1.indexOfChild(wmVar.A0);
                    if (indexOfChild >= 0) {
                        wmVar.m1.addView(wmVar.f51345hd, indexOfChild + 1, b8.mf.g());
                    } else {
                        wmVar.m1.addView(wmVar.f51345hd, b8.mf.g());
                    }
                }
                if (messageObject.Q3()) {
                    if (q1Var.x2()) {
                        i10 = org.telegram.ui.ActionBar.k6.f27848bc;
                    } else {
                        i10 = org.telegram.ui.ActionBar.k6.f27942gc;
                    }
                    wmVar.T0 = i10;
                } else {
                    if (q1Var.x2()) {
                        i3 = org.telegram.ui.ActionBar.k6.ce;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.f27850be;
                    }
                    wmVar.T0 = i3;
                }
                wmVar.f51345hd.setColor(wmVar.getThemedColor(wmVar.T0));
                wmVar.f51345hd.setCellToWatch(q1Var);
                ((qe.a) wmVar.f51345hd.f55388b.f10221b).a(false, false);
                wmVar.f51345hd.setAnimatedVisibility(aVar2.f53840e);
                wmVar.f51345hd.f55388b.setOnClickListener(new ii.m(new tf(wmVar, 1), 26));
                th.b bVar = wmVar.f51345hd;
                bVar.f55394s = new tf(wmVar, 2);
                ai.z zVar = bVar.f55387a;
                zVar.setOnKeyListener(new vf(wmVar, 0));
                zVar.setOnEditorActionListener(new ea(wmVar, 1));
                wmVar.f51237a0.Y4 = zVar;
                org.telegram.messenger.g0.i3(new f4(wmVar, measuredHeight, zVar, 3), 100L);
                aVar2.a(true, true);
            }
        }
    }

    public static void f0(wm wmVar, int i3, int i10, int i11, int i12) {
        int[] iArr;
        int[] iArr2;
        char c2;
        long j10;
        int[] iArr3 = wmVar.R6;
        int[] iArr4 = wmVar.Q6;
        boolean[] zArr = wmVar.V6;
        int[] iArr5 = wmVar.P6;
        int[] iArr6 = wmVar.S6;
        boolean[] zArr2 = wmVar.U6;
        ArrayList arrayList = wmVar.f51554y6;
        if ((i3 - i10) - i11 <= i12 && !wmVar.X6) {
            boolean[] zArr3 = wmVar.T6;
            if (!zArr3[0]) {
                wmVar.X6 = true;
                arrayList.add(Integer.valueOf(wmVar.f51399m6));
                if (wmVar.I6.size() != 0) {
                    org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
                    j10 = 0;
                    long j11 = wmVar.f51376k6;
                    c2 = 0;
                    long j12 = wmVar.f51272c7;
                    int i13 = iArr5[0];
                    boolean z10 = !zArr2[0];
                    int i14 = iArr6[0];
                    int i15 = wmVar.classGuid;
                    int i16 = wmVar.f51325g4;
                    iArr = iArr3;
                    iArr2 = iArr4;
                    long j13 = wmVar.f51475s4;
                    int i17 = wmVar.B4;
                    int i18 = wmVar.f51399m6;
                    wmVar.f51399m6 = i18 + 1;
                    messagesController.Y2(j11, j12, false, 50, i13, 0, z10, i14, i15, 0, i16, j13, i17, i18, wmVar.f51525w4);
                } else {
                    iArr = iArr3;
                    iArr2 = iArr4;
                    c2 = 0;
                    j10 = 0;
                    org.telegram.messenger.hp messagesController2 = wmVar.getMessagesController();
                    long j14 = wmVar.f51376k6;
                    long j15 = wmVar.f51272c7;
                    boolean z11 = !zArr2[0];
                    int i19 = iArr6[0];
                    int i20 = wmVar.classGuid;
                    int i21 = wmVar.f51325g4;
                    long j16 = wmVar.f51475s4;
                    int i22 = wmVar.B4;
                    int i23 = wmVar.f51399m6;
                    wmVar.f51399m6 = i23 + 1;
                    messagesController2.Y2(j14, j15, false, 50, 0, 0, z11, i19, i20, 0, i21, j16, i22, i23, wmVar.f51525w4);
                }
            } else {
                iArr = iArr3;
                iArr2 = iArr4;
                c2 = 0;
                j10 = 0;
                if (wmVar.f51272c7 != 0 && !zArr3[1]) {
                    wmVar.X6 = true;
                    arrayList.add(Integer.valueOf(wmVar.f51399m6));
                    org.telegram.messenger.hp messagesController3 = wmVar.getMessagesController();
                    long j17 = wmVar.f51272c7;
                    int i24 = iArr5[1];
                    boolean z12 = !zArr2[1];
                    int i25 = iArr6[1];
                    int i26 = wmVar.classGuid;
                    int i27 = wmVar.f51325g4;
                    long j18 = wmVar.f51475s4;
                    int i28 = wmVar.B4;
                    int i29 = wmVar.f51399m6;
                    wmVar.f51399m6 = i29 + 1;
                    messagesController3.Y2(j17, 0L, false, 50, i24, 0, z12, i25, i26, 0, i27, j18, i28, i29, wmVar.f51525w4);
                }
            }
        } else {
            iArr = iArr3;
            iArr2 = iArr4;
            c2 = 0;
            j10 = 0;
        }
        if (i11 > 0 && !wmVar.Z7 && i10 <= 10) {
            if (wmVar.f51272c7 != j10 && !zArr[1]) {
                arrayList.add(Integer.valueOf(wmVar.f51399m6));
                org.telegram.messenger.hp messagesController4 = wmVar.getMessagesController();
                long j19 = wmVar.f51272c7;
                int i30 = iArr2[1];
                int i31 = iArr[1];
                int i32 = wmVar.classGuid;
                int i33 = wmVar.f51325g4;
                long j20 = wmVar.f51475s4;
                int i34 = wmVar.B4;
                int i35 = wmVar.f51399m6;
                wmVar.f51399m6 = i35 + 1;
                messagesController4.Y2(j19, 0L, false, 50, i30, 0, true, i31, i32, 1, i33, j20, i34, i35, wmVar.f51525w4);
                wmVar.Z7 = true;
            } else if (!zArr[c2]) {
                arrayList.add(Integer.valueOf(wmVar.f51399m6));
                org.telegram.messenger.hp messagesController5 = wmVar.getMessagesController();
                long j21 = wmVar.f51376k6;
                long j22 = wmVar.f51272c7;
                int i36 = iArr2[c2];
                int i37 = iArr[c2];
                int i38 = wmVar.classGuid;
                int i39 = wmVar.f51325g4;
                long j23 = wmVar.f51475s4;
                int i40 = wmVar.B4;
                int i41 = wmVar.f51399m6;
                wmVar.f51399m6 = i41 + 1;
                messagesController5.Y2(j21, j22, false, 50, i36, 0, true, i37, i38, 1, i39, j23, i40, i41, wmVar.f51525w4);
                wmVar.Z7 = true;
            }
        }
    }

    public static void f1(wm wmVar) {
        org.telegram.ui.Components.v20.h.a();
        wmVar.showDialog(new ai.b3(wmVar.getParentActivity(), wmVar.currentAccount, wmVar.a(), null, null));
    }

    public static void g0(org.telegram.ui.wm r19, final org.telegram.ui.iy0[] r20, final org.telegram.ui.Components.f60 r21) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.g0(org.telegram.ui.wm, org.telegram.ui.iy0[], org.telegram.ui.Components.f60):void");
    }

    public static void g1(wm wmVar, Integer num, Boolean bool) {
        TLRPC.TL_forumTopic tL_forumTopic;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic2;
        wm wmVar2;
        int i3;
        int i10;
        TLRPC.TL_forumTopic f10;
        kh.a aVar = wmVar.f51469rc;
        if (num.intValue() != wmVar.b()) {
            wmVar.Rc = false;
            pe peVar = wmVar.f51431oc;
            if (peVar != null) {
                org.telegram.messenger.g0.r(peVar);
                wmVar.f51431oc.run();
                wmVar.f51431oc = null;
            }
            if (aVar != null && num.intValue() == 0) {
                aVar.c(0, 0L);
            }
            org.telegram.ui.Components.g11 g11Var = wmVar.f51323g2;
            long intValue = num.intValue();
            ArrayList l10 = org.telegram.messenger.hp.s1(g11Var.f33925e).f23102q7.l(-g11Var.f33927f);
            if (l10 != null) {
                int size = l10.size();
                int i11 = 0;
                while (i11 < size) {
                    Object obj = l10.get(i11);
                    i11++;
                    tL_forumTopic = (TLRPC.TL_forumTopic) obj;
                    if (tL_forumTopic.f27053id == intValue) {
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
            if (message == null && tL_forumTopic != null && (f10 = wmVar.getMessagesController().f23102q7.f(-wmVar.a(), tL_forumTopic.f27053id)) != null) {
                message = f10.topicStartMessage;
                tL_forumTopic2 = f10;
            } else {
                tL_forumTopic2 = tL_forumTopic;
            }
            if (message != null || num.intValue() == 0) {
                wmVar.f51545xb = SystemClock.uptimeMillis();
                wmVar.G7 = bool.booleanValue();
                if (num.intValue() == 0) {
                    wmVar.rb(wmVar.b());
                } else if (wmVar.b() == 0) {
                    wmVar.rb(num.intValue());
                } else {
                    wmVar.E7 = -1;
                }
                wmVar.getConnectionsManager().cancelRequestsForGuid(wmVar.classGuid);
                wmVar.getMessagesStorage().k(wmVar.classGuid);
                wmVar.classGuid = ConnectionsManager.generateClassGuid();
                wmVar.ob();
                wmVar.f51526w5 = null;
                wmVar.L7 = 0;
                wmVar.B7 = false;
                wmVar.C7 = true;
                wmVar.X7 = true;
                wmVar.Y7 = 0;
                wmVar.f51245a8 = null;
                wmVar.f51554y6.clear();
                wmVar.f51265c = false;
                if (message != null && num.intValue() != 0) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(new org.telegram.messenger.zi(wmVar.getCurrentAccount(), message, false, false));
                    wmVar2 = wmVar;
                    wmVar2.Rb(arrayList, wmVar.f51292e, tL_forumTopic2.f27053id, tL_forumTopic2.read_inbox_max_id, tL_forumTopic2.read_outbox_max_id, tL_forumTopic2);
                } else {
                    wmVar2 = wmVar;
                    wmVar2.f51463r4 = null;
                    wmVar2.f51436p4 = null;
                    wmVar2.f51397m4 = null;
                    wmVar2.E5 = null;
                    wmVar2.f51563z4 = 0;
                    wmVar2.A4 = 0;
                    wmVar2.B4 = 0;
                    wmVar2.f51475s4 = 0L;
                    wmVar2.f51487t4 = 0;
                    wmVar2.f51499u4 = null;
                    wmVar2.f51525w4 = false;
                    wmVar2.f51511v4 = false;
                }
                fl flVar = wmVar2.D0;
                if (flVar != null) {
                    if (flVar.J >= 0 && !flVar.N()) {
                        fl flVar2 = wmVar2.D0;
                        flVar2.s(flVar2.J);
                    } else {
                        fl flVar3 = wmVar2.D0;
                        if (flVar3.J < 0 && flVar3.N()) {
                            wmVar2.D0.i(0);
                        }
                    }
                    wmVar2.D0.T();
                }
                wmVar2.J8();
                wmVar2.sd(true);
                wmVar2.f51433p1.n(true);
                if (tL_forumTopic2 != null) {
                    wmVar2.yd();
                } else {
                    wmVar2.f51433p1.b();
                }
                wmVar2.f51323g2.setCurrentTopic(wmVar2.b());
                wmVar2.vd(true);
                wmVar2.Lc(true);
                wmVar2.getMessagesController().J4(-wmVar2.a(), wmVar2.b());
                wmVar2.db();
                wmVar2.C9(true);
                wmVar2.B9(true);
                wmVar2.M6(true, true);
                if (wmVar2.f51237a0 != null) {
                    if (!org.telegram.messenger.l10.u(wmVar2.f51306f)) {
                        wmVar2.f51237a0.j0(false);
                    }
                    wmVar2.f51237a0.H1(true);
                }
                if (tL_forumTopic2 != null) {
                    wmVar2.getMessagesController().f23102q7.k(wmVar2.f51376k6, tL_forumTopic2.f27053id);
                }
                if (tL_forumTopic2 != null) {
                    i3 = tL_forumTopic2.unread_reactions_count;
                } else {
                    i3 = 0;
                }
                wmVar2.A1 = i3;
                if (tL_forumTopic2 != null) {
                    i10 = tL_forumTopic2.unread_poll_votes_count;
                } else {
                    i10 = 0;
                }
                wmVar2.B1 = i10;
                wmVar2.fd(false);
                wmVar2.ed(false);
                wmVar2.wd();
                om omVar = wmVar2.Sc;
                if (omVar != null && wmVar2.actionBar.f27728o0) {
                    omVar.k(null);
                }
                if (org.telegram.messenger.l10.u(wmVar2.f51306f)) {
                    wmVar2.getMediaDataController().I0(org.telegram.messenger.pr.a(wmVar2.f51376k6, num.intValue()), true);
                }
            }
        }
    }

    public static void h0(wm wmVar, int i3, Boolean bool, TLRPC.WebPage webPage, TL_account.getWebPagePreview getwebpagepreview) {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2;
        if (wmVar.Mb != i3) {
            return;
        }
        if (bool.booleanValue()) {
            wmVar.X5 = webPage;
            String str = getwebpagepreview.message;
            webPage.display_url = str;
            if (!(webPage instanceof TLRPC.TL_webPage) && !(webPage instanceof TLRPC.TL_webPagePending)) {
                wmVar.X5 = null;
                org.telegram.messenger.dj djVar = wmVar.f51526w5;
                if (djVar != null) {
                    int i10 = wmVar.currentAccount;
                    CharSequence fieldText = wmVar.f51237a0.getFieldText();
                    org.telegram.messenger.zi ziVar3 = wmVar.E5;
                    if (ziVar3 == wmVar.f51397m4) {
                        ziVar2 = null;
                    } else {
                        ziVar2 = ziVar3;
                    }
                    djVar.e(i10, null, fieldText, ziVar2, wmVar.C5, wmVar.G5);
                }
                wmVar.z8();
                return;
            }
            boolean z10 = webPage instanceof TLRPC.TL_webPagePending;
            if (z10) {
                wmVar.Z5 = str;
            }
            if (wmVar.h != null && z10) {
                webPage.url = str;
            }
            org.telegram.messenger.dj djVar2 = wmVar.f51526w5;
            if (djVar2 != null) {
                int i11 = wmVar.currentAccount;
                CharSequence fieldText2 = wmVar.f51237a0.getFieldText();
                org.telegram.messenger.zi ziVar4 = wmVar.E5;
                if (ziVar4 == wmVar.f51397m4) {
                    ziVar = null;
                } else {
                    ziVar = ziVar4;
                }
                djVar2.e(i11, null, fieldText2, ziVar, wmVar.C5, wmVar.G5);
            }
            wmVar.cc(true, wmVar.X5, false, true);
            return;
        }
        wmVar.X5 = null;
        wmVar.z8();
    }

    public static void h1(wm wmVar, long j10, long j11, Long l10) {
        int i3;
        String str;
        if (wmVar.getParentActivity() == null) {
            return;
        }
        Activity parentActivity = wmVar.getParentActivity();
        String M0 = org.telegram.messenger.bd.M0(2131746299, null);
        if (org.telegram.messenger.t3.p0(wmVar.f51292e)) {
            i3 = 2131746303;
        } else {
            i3 = 2131746304;
        }
        SpannableStringBuilder X2 = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i3, org.telegram.messenger.m5.t(j10)));
        if (l10.longValue() > 0) {
            str = org.telegram.messenger.bd.H(',', "RemoveMessageFeeRefund", (int) l10.longValue());
        } else {
            str = null;
        }
        org.telegram.ui.Components.t4.h0(parentActivity, M0, X2, str, org.telegram.messenger.bd.M0(2131751817, null), new ng(wmVar, j10, j11, l10, 0), wmVar.resourceProvider, true);
    }

    public static void i0(wm wmVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        if (tL_error == null) {
            tL_attachMenuBot.side_menu_disclaimer_needed = false;
            tL_attachMenuBot.inactive = false;
            org.telegram.messenger.li.b0(wmVar.currentAccount).E0(false, true, null);
            wmVar.wa(user.f27150id, wmVar.B8, false);
        }
    }

    public static void i1(wm wmVar, TLRPC.TL_game tL_game, org.telegram.messenger.zi ziVar, String str, long j10) {
        wmVar.pc(tL_game, ziVar, str, false, j10);
        SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit();
        edit.putBoolean("askgame_" + j10, false).commit();
    }

    public static void j0(wm wmVar, boolean[] zArr, Context context) {
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.zi ziVar2 = wmVar.E5;
        if (ziVar2 == null || !org.telegram.messenger.zi.d3(ziVar2.f26868k)) {
            boolean z10 = zArr[0];
            if (z10) {
                zArr[0] = false;
            }
            int i3 = wmVar.Pb;
            if (i3 == 5) {
                int i10 = wmVar.currentAccount;
                long j10 = wmVar.f51376k6;
                org.telegram.messenger.ej ejVar = wmVar.f51540x5;
                if (ejVar == null) {
                    ejVar = org.telegram.messenger.ej.a();
                }
                new ci.x0(context, i10, j10, ejVar, wmVar, wmVar.getResourceProvider(), 0, new le(wmVar, 1)).show();
            } else if (i3 == 1 && (ziVar = wmVar.G5) != null) {
                if (ziVar.q5() && !z10) {
                    org.telegram.messenger.ej ejVar2 = wmVar.f51540x5;
                    if (ejVar2 == null) {
                        ejVar2 = org.telegram.messenger.ej.a();
                    }
                    wmVar.wc(ejVar2);
                } else if (wmVar.G5.t() && wmVar.F5 == 0) {
                    if (wmVar.Y1 == null) {
                        wmVar.T7();
                    }
                    wmVar.Y1.w1(-1, wmVar.G5);
                    wmVar.xa();
                } else {
                    wmVar.l(wmVar.G5.f1(), 0, true, 0, true, 0);
                }
            } else if (wmVar.f51526w5 != null) {
                if (i3 == 2) {
                    if (!org.telegram.messenger.m5.C(wmVar.f51376k6) && !wmVar.f51526w5.f22215u && wmVar.f51325g4 != 5) {
                        int i11 = org.telegram.messenger.az.f21612a;
                        SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                        org.telegram.messenger.az.Q = true;
                        edit.putBoolean("replyingOptionsHintShown", true);
                        edit.apply();
                        wmVar.Ca(0);
                        return;
                    }
                    org.telegram.messenger.zi ziVar3 = wmVar.E5;
                    if (ziVar3 != null) {
                        wmVar.l(ziVar3.f1(), 0, true, 0, true, 0);
                    }
                } else if (i3 == 3) {
                    int i12 = org.telegram.messenger.az.f21612a;
                    SharedPreferences.Editor edit2 = org.telegram.messenger.hp.e1().edit();
                    org.telegram.messenger.az.P = true;
                    edit2.putBoolean("forwardingOptionsHintShown", true);
                    edit2.apply();
                    wmVar.Ca(1);
                } else if (i3 == 4) {
                    wmVar.Ca(2);
                }
            }
        }
    }

    public static void j1(wm wmVar, TLObject tLObject) {
        if (tLObject instanceof TLRPC.messages_Messages) {
            if (!((TLRPC.messages_Messages) tLObject).messages.isEmpty()) {
                TLRPC.TL_messages_getHistory tL_messages_getHistory = new TLRPC.TL_messages_getHistory();
                tL_messages_getHistory.peer = wmVar.getMessagesController().j1(wmVar.f51376k6);
                tL_messages_getHistory.offset_date = wmVar.N7 + 86400;
                tL_messages_getHistory.limit = 1;
                wmVar.getConnectionsManager().sendRequest(tL_messages_getHistory, new org.telegram.ui.ActionBar.h6(4, wmVar, tLObject));
                return;
            }
            wmVar.actionBar.setSubtitle(org.telegram.messenger.bd.M0(2131748200, null));
        }
    }

    public static void j2(wm wmVar, View view, boolean z10, float f10, float f11) {
        org.telegram.messenger.zi ziVar;
        int i3;
        int i10;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) view;
            ziVar = q1Var.getMessageObject();
            q1Var.f29936h1 = f10;
            q1Var.f29947i1 = f11;
            org.telegram.ui.Components.e90 e90Var = q1Var.Sa;
            float f12 = q1Var.f29947i1;
            e90Var.h = q1Var.getTranslationX() + f10;
            e90Var.f33323i = f12;
            e90Var.f33326l = SystemClock.elapsedRealtime();
        } else if (view instanceof org.telegram.ui.Cells.t0) {
            ziVar = ((org.telegram.ui.Cells.t0) view).getMessageObject();
        } else {
            ziVar = null;
        }
        int Y8 = wmVar.Y8(ziVar);
        if ((ziVar == null || ((i10 = ziVar.D) != 30 && i10 != 18 && i10 != 25)) && Y8 >= 2 && Y8 != 20 && Y8 != 21) {
            if (ziVar == null || ((i3 = ziVar.D) != 27 && i3 != 30)) {
                if (ziVar == null || !ziVar.Y4()) {
                    if (ziVar == null || (!ziVar.s4() && !org.telegram.messenger.zi.d3(ziVar.f26868k))) {
                        wmVar.J6(ziVar, z10, true);
                        wmVar.Hc();
                        wmVar.Cd(false);
                    }
                }
            }
        }
    }

    public static void k0(wm wmVar, TLRPC.User user, TLRPC.EmojiStatus emojiStatus) {
        long j10;
        vg.h1 h1Var = new vg.h1(wmVar, wmVar.currentAccount, user, null, null, wmVar.getResourceProvider());
        if (emojiStatus instanceof TLRPC.TL_emojiStatus) {
            j10 = ((TLRPC.TL_emojiStatus) emojiStatus).document_id;
        } else if (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) {
            TLRPC.TL_emojiStatusCollectible tL_emojiStatusCollectible = (TLRPC.TL_emojiStatusCollectible) emojiStatus;
            j10 = tL_emojiStatusCollectible.document_id;
            h1Var.f56645w2 = tL_emojiStatusCollectible;
        } else {
            return;
        }
        org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(wmVar.getParentActivity());
        org.telegram.ui.Components.e5 e5Var = new org.telegram.ui.Components.e5(org.telegram.messenger.g0.L(160.0f), 4, k9Var, false);
        k9Var.setImageDrawable(e5Var);
        k9Var.addOnAttachStateChangeListener(new g5(e5Var, 1));
        e5Var.j(j10, false);
        h1Var.f56646x2 = true;
        h1Var.f56643u2 = k9Var;
        wmVar.showDialog(h1Var);
    }

    public static void k1(wm wmVar, org.telegram.messenger.zi ziVar, Long l10, Runnable runnable) {
        ci.e9.y(wmVar.currentAccount, false).j0(ziVar, l10.longValue(), runnable, false);
    }

    public static void k2(wm wmVar, int i3) {
        int i10;
        boolean z10;
        ArrayList arrayList = wmVar.L6;
        SparseArray[] sparseArrayArr = wmVar.f51412n6;
        if (!wmVar.jb && (i10 = i3 - wmVar.D0.K) >= 0 && i10 < arrayList.size()) {
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i10);
            if (sparseArrayArr[0].get(ziVar.f1(), null) == null && sparseArrayArr[1].get(ziVar.f1(), null) == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            SparseArray sparseArray = new SparseArray();
            for (int i11 = 0; i11 < sparseArrayArr[0].size(); i11++) {
                sparseArray.put(sparseArrayArr[0].keyAt(i11), (org.telegram.messenger.zi) sparseArrayArr[0].valueAt(i11));
            }
            for (int i12 = 0; i12 < sparseArrayArr[1].size(); i12++) {
                sparseArray.put(sparseArrayArr[1].keyAt(i12), (org.telegram.messenger.zi) sparseArrayArr[1].valueAt(i12));
            }
            org.telegram.ui.Components.tj0 tj0Var = wmVar.A0;
            ?? obj = new Object();
            obj.d = wmVar;
            obj.f18546b = z10;
            obj.f18547c = sparseArray;
            if (!tj0Var.c2) {
                tj0Var.f38455l2 = new int[2];
                new HashSet();
                tj0Var.n1(tj0Var, true);
                tj0Var.f38446g2 = obj;
                tj0Var.c2 = true;
                tj0Var.f38444f2 = i3;
                tj0Var.f38442e2 = i3;
            }
        }
    }

    public static void l0(wm wmVar) {
        org.telegram.ui.Cells.q1 q1Var;
        vk vkVar;
        int i3;
        if (!wmVar.f51482sc && wmVar.U3 && wmVar.A0.H && wmVar.getParentActivity() != null) {
            int[] iArr = new int[2];
            int childCount = wmVar.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = wmVar.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        if (q1Var.getMessageObject() != null && q1Var.getMessageObject().f26868k != null && q1Var.getMessageObject().f26868k.video_processing_pending) {
                            if (q1Var.getCurrentPosition() != null) {
                                if (q1Var.getMessageObject() != null && (q1Var.getCurrentPosition().f25149l & 8) != 0) {
                                    int i10 = q1Var.getCurrentPosition().f25149l;
                                    if (q1Var.getMessageObject().Q3()) {
                                        i3 = 1;
                                    } else {
                                        i3 = 2;
                                    }
                                    if ((i10 & i3) == 0) {
                                        continue;
                                    }
                                }
                            }
                            q1Var.getLocationInWindow(iArr);
                            float timeY = q1Var.getTimeY() + iArr[1];
                            if (timeY >= org.telegram.messenger.g0.L(240.0f) && timeY <= (org.telegram.messenger.g0.f22608q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f22603n) {
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
                wmVar.f51482sc = true;
                vk vkVar2 = new vk(wmVar, wmVar.getParentActivity());
                vkVar2.r(true);
                vkVar2.L = Layout.Alignment.ALIGN_CENTER;
                vkVar2.d = 3500L;
                vkVar2.U = true;
                vkVar2.f13084e = true;
                vkVar2.h = org.telegram.messenger.g0.L(150.0f);
                vkVar2.s(8.0f);
                wmVar.Q1 = vkVar2;
                vkVar2.u(org.telegram.messenger.bd.M0(2131743608, null));
                wmVar.Q1.l(wmVar.L);
                wmVar.m1.addView(wmVar.Q1, b8.mf.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                q1Var.getLocationInWindow(iArr);
                wmVar.R1 = q1Var.getTimeY() + iArr[1];
                wmVar.Q1.setTranslationY(((-vkVar.getTop()) - org.telegram.messenger.g0.L(120.0f)) + wmVar.R1);
                wmVar.Q1.p(0.0f, (q1Var.f30167z9 / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + q1Var.B9);
                wmVar.Q1.w();
                return;
            }
            org.telegram.messenger.g0.r(new yd(wmVar, 2));
            org.telegram.messenger.g0.i3(new yd(wmVar, 2), 2000L);
        }
    }

    public static void l1(wm wmVar, String str) {
        if (wmVar.getParentActivity() == null) {
            return;
        }
        try {
            Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str, null));
            intent.putExtra("sms_body", org.telegram.messenger.g5.r(wmVar.currentAccount).s(1));
            wmVar.getParentActivity().startActivityForResult(intent, 500);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public static boolean l2(wm wmVar, View view, RectF rectF) {
        RectF rectF2 = wmVar.f51332gc;
        if (rectF != null && wmVar.A0 != null && view != null) {
            rectF2.set(view.getX(), view.getY(), view.getX() + view.getWidth(), view.getY() + view.getHeight());
            return !rectF2.intersect(rectF);
        }
        return false;
    }

    public static void m0(wm wmVar) {
        if (wmVar.f51253b2) {
            wmVar.getMessagesController().d(0, 0, wmVar.f51376k6);
            wmVar.f8();
            wmVar.N3.j(23, wmVar.f51376k6, null);
            SharedPreferences.Editor edit = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit();
            edit.putBoolean("dialog_bar_archived" + wmVar.f51376k6, false);
            edit.putBoolean("dialog_bar_block" + wmVar.f51376k6, false);
            edit.putBoolean("dialog_bar_report" + wmVar.f51376k6, false);
            edit.commit();
            wmVar.vd(false);
            org.telegram.messenger.us notificationsController = wmVar.getNotificationsController();
            long j10 = wmVar.f51376k6;
            long b10 = wmVar.b();
            SharedPreferences.Editor edit2 = notificationsController.getAccountInstance().c().edit();
            String v = org.telegram.messenger.us.v(j10, b10, false);
            SharedPreferences.Editor remove = edit2.remove("notify2_" + v);
            remove.remove("custom_" + v);
            notificationsController.getMessagesStorage().E1(j10, 0L);
            TLRPC.Dialog dialog = (TLRPC.Dialog) notificationsController.getMessagesController().R.f(j10);
            if (dialog != null) {
                dialog.notify_settings = new TLRPC.TL_peerNotifySettings();
            }
            edit2.commit();
            notificationsController.getNotificationsController().c0(j10, b10, true);
        } else if (wmVar.f51239a2.getTag() != null && ((Integer) wmVar.f51239a2.getTag()).intValue() == 4) {
            TLRPC.ChatFull chatFull = wmVar.f51453q8;
            if (chatFull != null && chatFull.participants != null) {
                a0.h hVar = new a0.h();
                for (int i3 = 0; i3 < wmVar.f51453q8.participants.participants.size(); i3++) {
                    hVar.k(null, wmVar.f51453q8.participants.participants.get(i3).user_id);
                }
                long j11 = wmVar.f51453q8.f27002id;
                org.telegram.ui.Components.t50 t50Var = new org.telegram.ui.Components.t50(wmVar.getParentActivity(), wmVar.currentAccount, hVar, wmVar.f51453q8.f27002id, wmVar, wmVar.f51557ya);
                t50Var.f38290d2 = new de(wmVar, 23);
                t50Var.show();
            }
        } else if (wmVar.f51239a2.getTag() != null) {
            wmVar.Ub(1, null);
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("user_id", wmVar.f51306f.f27150id);
            bundle.putBoolean("addContact", true);
            lr lrVar = new lr(bundle);
            lrVar.P = new de(wmVar, 24);
            wmVar.presentFragment(lrVar);
        }
    }

    public static void m1(wm wmVar, org.telegram.ui.Components.f60 f60Var) {
        if (wmVar.f51418nc == null) {
            return;
        }
        f60Var.u();
        wmVar.ja(wmVar.f51418nc, false, true);
        sf.c.s(wmVar.getParentActivity(), Uri.parse(wmVar.f51418nc.R0), true, false, false, null, null, false, org.telegram.messenger.hp.s1(wmVar.currentAccount).f22988d6, false, false);
    }

    public static void n0(wm wmVar, TLRPC.Document document) {
        wmVar.K4.put(document, 0);
        org.telegram.messenger.yy.C(wmVar.currentAccount).v0(document, null, wmVar.f51376k6, null, null, null, wmVar.C5, null, true, 0, 0, false, null, wmVar.W8(), 0L, wmVar.h9(), wmVar.f51540x5);
    }

    public static void n1(wm wmVar, TLRPC.User user, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.hp.s1(wmVar.currentAccount).o1(user.f27150id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = true;
        ConnectionsManager.getInstance(wmVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ug(wmVar, tL_attachMenuBot, user, 0), 66);
    }

    public static void o0(wm wmVar, long j10, long j11) {
        org.telegram.messenger.f2.b(wmVar.currentAccount).h(j10, j11, false);
        wmVar.f51431oc = null;
    }

    public static void o1(wm wmVar) {
        if (org.telegram.messenger.g0.g(wmVar.f51418nc.U0)) {
            org.telegram.messenger.camera.q.r(null, 2131744204, new org.telegram.ui.Components.fc(org.telegram.ui.Components.wa.a(wmVar.getParentActivity()), wmVar.resourceProvider));
        }
    }

    public static void o4(wm wmVar, org.telegram.ui.Cells.f0 f0Var) {
        String charSequence;
        if (org.telegram.messenger.hp.s1(wmVar.currentAccount).f23120s7.s()) {
            CharSequence text = f0Var.getText();
            if (text == null) {
                charSequence = "";
            } else {
                charSequence = text.toString();
            }
            org.telegram.messenger.b6.d(charSequence, new b7(wmVar, f0Var, text, 3), new x0(f0Var, 16), false);
            return;
        }
        f0Var.setClickable(false);
    }

    public static void p0(wm wmVar) {
        TLRPC.ChatFull chatFull = wmVar.f51453q8;
        if (chatFull != null && !wmVar.H5) {
            TLRPC.Chat chat = wmVar.f51292e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && wmVar.visibleDialog == null) {
                SharedPreferences sharedPreferences = org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7;
                int i3 = sharedPreferences.getInt("group_convert_time", 0);
                boolean z10 = org.telegram.messenger.r2.f25040a;
                int currentTime = wmVar.getConnectionsManager().getCurrentTime();
                if (Math.abs(currentTime - i3) >= 604800 && wmVar.visibleDialog == null && wmVar.getParentActivity() != null) {
                    sharedPreferences.edit().putInt("group_convert_time", currentTime).commit();
                    Activity parentActivity = wmVar.getParentActivity();
                    de deVar = new de(wmVar, 15);
                    de deVar2 = new de(wmVar, 16);
                    Pattern pattern = org.telegram.ui.Components.t4.f38241a;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(parentActivity);
                    String y22 = org.telegram.messenger.g0.y2(null, 2131624037);
                    FrameLayout frameLayout = new FrameLayout(parentActivity);
                    frameLayout.setClipToOutline(true);
                    frameLayout.setOutlineProvider(new cg.p0(11));
                    View view = new View(parentActivity);
                    view.setBackground(new BitmapDrawable(org.telegram.messenger.kz.e(org.telegram.messenger.g0.L(320.0f), org.telegram.messenger.g0.L(127.17949f), y22)));
                    frameLayout.addView(view, b8.mf.d(-1, -1.0f, 0, -1.0f, -1.0f, -1.0f, -1.0f));
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.W = frameLayout;
                    s1Var.R0 = 0.3974359f;
                    s1Var.S = org.telegram.messenger.bd.M0(2131749572, null);
                    s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749573, null));
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131749574, null), deVar);
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), deVar2);
                    wmVar.showDialog(s1Var);
                }
            }
        }
    }

    public static void p1(wm wmVar, Context context) {
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.jg jgVar;
        String str;
        SparseArray[] sparseArrayArr = wmVar.f51412n6;
        if (wmVar.getParentActivity() != null && wmVar.f51343ha == 0.0f) {
            if (wmVar.f51325g4 == 3) {
                Bundle bundle = new Bundle();
                long c92 = wmVar.c9();
                if (c92 >= 0) {
                    bundle.putLong("user_id", c92);
                } else {
                    bundle.putLong("chat_id", -c92);
                }
                wmVar.presentFragment(new wm(bundle));
                return;
            }
            boolean z12 = false;
            if (wmVar.W9()) {
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < sparseArrayArr[0].size(); i3++) {
                    arrayList.add(Integer.valueOf(sparseArrayArr[0].keyAt(i3)));
                }
                wmVar.Yb(true, true);
                byte[] bArr = wmVar.f51374k4;
                String str2 = wmVar.f51387l4;
                le leVar = new le(wmVar, 2);
                int i10 = ey0.f45092t1;
                int currentAccount = wmVar.getCurrentAccount();
                Activity parentActivity = wmVar.getParentActivity();
                long a10 = wmVar.a();
                if (parentActivity != null) {
                    ey0.J0(currentAccount, parentActivity, a10, false, false, arrayList, org.telegram.ui.Components.fc.a0(wmVar), wmVar.getResourceProvider(), bArr, str2, leVar);
                }
            } else if (wmVar.f51325g4 == 2) {
                wmVar.finishFragment();
                gl glVar = wmVar.f51379k9;
                if (wmVar.E0.getTag() == null) {
                    z12 = true;
                }
                glVar.Y(true, z12);
            } else {
                TLRPC.User user = wmVar.f51306f;
                if (user != null && user.f27150id == 489000) {
                    wmVar.Ec(true);
                } else if (user != null && wmVar.f51406n) {
                    if (user.bot) {
                        String str3 = wmVar.f51515v8;
                        wmVar.f51515v8 = null;
                        wmVar.getMessagesController().f5(new fe(wmVar, str3, 3), wmVar.f51306f.f27150id);
                        return;
                    }
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                    String M0 = org.telegram.messenger.bd.M0(2131754065, null);
                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                    s1Var.U = M0;
                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new de(wmVar, 8));
                    s1Var.S = org.telegram.messenger.bd.M0(2131689472, null);
                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                    wmVar.showDialog(s1Var);
                } else if (org.telegram.messenger.l10.z(user)) {
                    wmVar.Ec(true);
                } else {
                    TLRPC.User user2 = wmVar.f51306f;
                    if (user2 != null && user2.bot && (str = wmVar.f51515v8) != null) {
                        if (str.length() != 0) {
                            wmVar.getMessagesController().A4(wmVar.f51515v8, wmVar.f51306f);
                        } else {
                            wmVar.getSendMessagesHelper().r0(org.telegram.messenger.wy.b("/start", wmVar.f51376k6, null, null, null, false, null, null, null, true, 0, 0, null, false));
                        }
                        wmVar.f51515v8 = null;
                        wmVar.Lc(false);
                        return;
                    }
                    if (org.telegram.messenger.t3.T(wmVar.f51292e)) {
                        TLRPC.Chat chat = wmVar.f51292e;
                        if (!(chat instanceof TLRPC.TL_channelForbidden)) {
                            if (org.telegram.messenger.t3.r0(chat)) {
                                if (wmVar.f51292e.join_request) {
                                    wmVar.Yb(true, true);
                                    org.telegram.messenger.hp.s1(wmVar.currentAccount).m(wmVar.f51292e.f27001id, org.telegram.messenger.h10.i(wmVar.currentAccount).f(), 0, null, null, true, new yd(wmVar, 20), new mi.d4(19, wmVar, context), null);
                                    return;
                                }
                                yd ydVar = wmVar.f51271c6;
                                if (ydVar != null) {
                                    org.telegram.messenger.g0.r(ydVar);
                                    wmVar.f51271c6 = null;
                                }
                                wmVar.Yb(true, true);
                                wmVar.getMessagesController().n(wmVar.f51292e.f27001id, wmVar.getUserConfig().f(), null, wmVar, null);
                                org.telegram.messenger.hs.e().k(org.telegram.messenger.hs.I4, new Object[0]);
                                org.telegram.ui.ActionBar.k0 k0Var = wmVar.Z1;
                                if (k0Var != null && (jgVar = wmVar.f51252b1) != null && jgVar.d(k0Var) && wmVar.c2.getVisibility() != 8 && wmVar.c2.getTag(2131296585) != null) {
                                    org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit().putInt("dialog_bar_vis3" + wmVar.f51376k6, 3).commit();
                                    wmVar.getNotificationCenter().k(org.telegram.messenger.hs.Q0, Long.valueOf(wmVar.f51376k6));
                                    return;
                                }
                                return;
                            }
                            wmVar.Ec(true);
                            return;
                        }
                    }
                    TLRPC.ChatFull chatFull = wmVar.f51453q8;
                    if (chatFull != null && chatFull.can_delete_channel) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.Chat chat2 = wmVar.f51292e;
                    TLRPC.User user3 = wmVar.f51306f;
                    if (wmVar.h != null) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    org.telegram.ui.Components.t4.r(wmVar, false, chat2, user3, z11, true, false, z10, new de(wmVar, 9));
                }
            }
        }
    }

    public static void p2(wm wmVar, org.telegram.ui.Cells.q1 q1Var, int i3, int i10, int i11) {
        if (!wmVar.C2.W || wmVar.Jb != q1Var || wmVar.Kb != i11) {
            org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
            if (messageObject != null && (org.telegram.messenger.zi.n1(messageObject) instanceof TLRPC.TL_messageMediaPoll)) {
                TLRPC.TL_messageMediaPoll tL_messageMediaPoll = (TLRPC.TL_messageMediaPoll) org.telegram.messenger.zi.n1(messageObject);
                if (org.telegram.messenger.zi.X4(tL_messageMediaPoll) && !org.telegram.messenger.zi.V4(tL_messageMediaPoll)) {
                    TLRPC.Poll poll = tL_messageMediaPoll.poll;
                    if (!poll.closed && poll.hide_results_until_close) {
                        wmVar.C2.u(org.telegram.messenger.bd.M0(2131747167, null));
                        wmVar.Jb = q1Var;
                        wmVar.Kb = i11;
                        wmVar.C2.x(wmVar.t9(q1Var, i10), wmVar.u9(q1Var, i11), true);
                    }
                }
            }
            if (i3 == -1) {
                wmVar.C2.u(org.telegram.messenger.bd.M0(2131747166, null));
                wmVar.Jb = q1Var;
                wmVar.Kb = i11;
                wmVar.C2.x(wmVar.t9(q1Var, i10), wmVar.u9(q1Var, i11), true);
            }
        }
    }

    public static void p4(wm wmVar) {
        if (wmVar.X3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        int i3 = wmVar.f51325g4;
        if (i3 == 3) {
            tL_message.message = org.telegram.messenger.bd.M0(2131745904, null);
        } else if (i3 == 9) {
            tL_message.message = org.telegram.messenger.bd.M0(2131742903, null);
        } else {
            tL_message.message = org.telegram.messenger.bd.M0(2131752671, null);
        }
        tL_message.f27022id = 0;
        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(wmVar.currentAccount, tL_message, false, false);
        wmVar.X3 = ziVar;
        ziVar.D = 10;
        ziVar.U = 1;
    }

    public static void q0(wm wmVar) {
        TLRPC.UserFull userFull;
        boolean z10;
        if (wmVar.getParentActivity() != null) {
            TLRPC.Chat chat = wmVar.f51292e;
            if (chat != null) {
                if (org.telegram.messenger.t3.j(chat) && !wmVar.f51292e.monoforum) {
                    z10 = true;
                }
                z10 = false;
            } else {
                if (wmVar.h == null && (userFull = wmVar.f51466r8) != null) {
                    z10 = userFull.can_pin_message;
                }
                z10 = false;
            }
            if (z10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wmVar.getParentActivity(), wmVar.f51557ya);
                String M0 = org.telegram.messenger.bd.M0(2131743852, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131743853, null);
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131743854, null), new de(wmVar, 21));
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                wmVar.showDialog(s1Var);
            } else if (!wmVar.U4.isEmpty()) {
                org.telegram.messenger.hp.s1(wmVar.currentAccount).f22989d7.edit().putInt("pin_" + wmVar.f51376k6, ((Integer) wmVar.U4.get(0)).intValue()).commit();
                wmVar.cd(0, true);
            }
        }
    }

    public static void q1(wm wmVar, long j10, long j11, Long l10, Boolean bool) {
        boolean z10 = false;
        ci.e9 y9 = ci.e9.y(wmVar.currentAccount, false);
        if (l10.longValue() > 0 && bool.booleanValue()) {
            z10 = true;
        }
        y9.g0(j10, j11, z10, true);
    }

    public static void q4(wm wmVar) {
        if (wmVar.Y3 != null) {
            return;
        }
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.bd.M0(2131742904, null);
        tL_message.f27022id = 0;
        org.telegram.messenger.zi ziVar = new org.telegram.messenger.zi(wmVar.currentAccount, tL_message, false, false);
        wmVar.Y3 = ziVar;
        ziVar.D = 10;
        ziVar.U = 1;
    }

    public static wm qa(int i3, long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("message_id", i3);
        return new wm(bundle);
    }

    public static org.telegram.ui.Components.vn r0(wm wmVar, Context context) {
        org.telegram.ui.Components.xn xnVar = new org.telegram.ui.Components.xn(context, wmVar.currentAccount, wmVar.f51359j0.getPopupLayout().getSwipeBack(), false, new ti(wmVar), wmVar.getResourceProvider());
        wmVar.f51536x1 = xnVar;
        xnVar.e(wmVar.f51376k6, wmVar.b(), null);
        return wmVar.f51536x1.f40423f;
    }

    public static void r1(wm wmVar, TLRPC.TL_inlineBotWebView tL_inlineBotWebView) {
        long j10;
        TLRPC.User user = wmVar.X1.getAdapter().f17020x0;
        int i3 = wmVar.currentAccount;
        TLRPC.User user2 = wmVar.f51306f;
        if (user2 != null) {
            j10 = user2.f27150id;
        } else {
            j10 = wmVar.f51292e.f27001id;
        }
        ii.q4 b10 = ii.q4.b(i3, j10, user.f27150id, tL_inlineBotWebView.text, tL_inlineBotWebView.url, 1, 0, wmVar.h9(), null, false, null, null, 1, false, false);
        LaunchActivity launchActivity = LaunchActivity.K1;
        if (launchActivity != null && launchActivity.O() != null && LaunchActivity.K1.O().k(b10) != null) {
            return;
        }
        String F1 = org.telegram.messenger.hp.s1(wmVar.currentAccount).F1(user.restriction_reason);
        if (!TextUtils.isEmpty(F1)) {
            org.telegram.messenger.hp.s1(wmVar.currentAccount);
            org.telegram.messenger.hp.R4(F1, wmVar);
            return;
        }
        ii.a3 a3Var = new ii.a3(wmVar.getParentActivity(), wmVar.getResourceProvider());
        a3Var.B(false);
        a3Var.C0 = true;
        a3Var.m0 = wmVar.getParentActivity();
        a3Var.x(wmVar, b10);
        a3Var.show();
    }

    public static void r2(wm wmVar) {
        org.telegram.ui.Cells.q1 q1Var;
        org.telegram.messenger.zi primaryMessageObject;
        TLRPC.Message message;
        if (wmVar.O1 != null) {
            return;
        }
        org.telegram.ui.Cells.q1 q1Var2 = null;
        for (int childCount = wmVar.A0.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = wmVar.A0.getChildAt(childCount);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (primaryMessageObject = (q1Var = (org.telegram.ui.Cells.q1) childAt).getPrimaryMessageObject()) != null && (message = primaryMessageObject.f26868k) != null && message.via_business_bot_id != 0) {
                q1Var2 = q1Var;
            }
        }
        wmVar.Xb(q1Var2);
    }

    public static wm ra(long j10) {
        Bundle bundle = new Bundle();
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        return new wm(bundle);
    }

    public static void s0(wm wmVar) {
        if (org.telegram.messenger.hp.s1(wmVar.currentAccount).r2(wmVar.f51376k6, wmVar.b(), null)) {
            wmVar.ud(true);
            org.telegram.messenger.g0.i3(new yd(wmVar, 8), 150L);
            wmVar.f51359j0.U(null, null);
            if (wmVar.getParentActivity() != null) {
                org.telegram.ui.Components.fc.z(wmVar, 4, 0, wmVar.f51557ya).j();
                return;
            }
            return;
        }
        View view = wmVar.f51484t1.f28371j;
        if (view instanceof org.telegram.ui.ActionBar.y0) {
            ((org.telegram.ui.ActionBar.y0) view).b();
        }
    }

    public static void s1(wm wmVar, int i3) {
        if (wmVar.f51325g4 == 7) {
            Object E = wmVar.f51255b4.E(i3);
            if (i3 == 0) {
                wmVar.f51255b4.getClass();
            }
            if (E instanceof org.telegram.messenger.zi) {
                wmVar.Fa((org.telegram.messenger.zi) E);
            }
        } else if (wmVar.F3 != null) {
            if (i3 >= 0 && i3 < wmVar.getMediaDataController().Z0.size()) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) wmVar.getMediaDataController().Z0.get(i3);
                wmVar.G3 = false;
                wmVar.Nb(false, true, false);
                org.telegram.messenger.li mediaDataController = wmVar.getMediaDataController();
                if (i3 >= 0) {
                    if (i3 < mediaDataController.Z0.size()) {
                        mediaDataController.f24024f1 = i3;
                    }
                } else {
                    mediaDataController.getClass();
                }
                wmVar.jd(wmVar.getMediaDataController().c0(), wmVar.getMediaDataController().f24024f1, wmVar.getMediaDataController().j0());
                org.telegram.messenger.g0.h3(new ge(wmVar, ziVar, 2));
            }
        } else {
            org.telegram.messenger.li mediaDataController2 = wmVar.getMediaDataController();
            int i10 = wmVar.classGuid;
            ArrayList arrayList = mediaDataController2.Z0;
            if (i3 >= 0 && i3 < arrayList.size()) {
                mediaDataController2.f24024f1 = i3;
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(i3);
                mediaDataController2.getNotificationCenter().k(org.telegram.messenger.hs.H0, Integer.valueOf(i10), Integer.valueOf(ziVar2.f1()), Integer.valueOf(mediaDataController2.c0()), Long.valueOf(org.telegram.messenger.zi.B0(ziVar2.f26868k)), Integer.valueOf(mediaDataController2.f24024f1), Integer.valueOf(mediaDataController2.j0()), Boolean.TRUE);
            }
            wmVar.oc(false);
        }
    }

    public static void t0(wm wmVar, TLRPC.TL_attachMenuBot tL_attachMenuBot, TLRPC.TL_error tL_error, TLRPC.User user) {
        tL_attachMenuBot.side_menu_disclaimer_needed = false;
        tL_attachMenuBot.inactive = false;
        if (tL_error == null) {
            org.telegram.messenger.li.b0(wmVar.currentAccount).E0(false, true, null);
            wmVar.wa(user.f27150id, wmVar.B8, false);
        }
    }

    public static void t1(wm wmVar, Long l10, Boolean bool) {
        int i3;
        int i10;
        if (l10.longValue() != wmVar.b()) {
            wmVar.f51545xb = SystemClock.uptimeMillis();
            wmVar.G7 = bool.booleanValue();
            if (l10.longValue() == 0) {
                wmVar.rb(wmVar.b());
            } else if (wmVar.b() == 0) {
                wmVar.rb(l10.longValue());
            } else {
                wmVar.E7 = -1;
            }
            wmVar.getConnectionsManager().cancelRequestsForGuid(wmVar.classGuid);
            wmVar.getMessagesStorage().k(wmVar.classGuid);
            wmVar.classGuid = ConnectionsManager.generateClassGuid();
            wmVar.ob();
            wmVar.f51526w5 = null;
            wmVar.L7 = 0;
            wmVar.B7 = false;
            wmVar.C7 = true;
            wmVar.X7 = true;
            wmVar.Y7 = 0;
            wmVar.f51245a8 = null;
            wmVar.f51554y6.clear();
            wmVar.f51475s4 = l10.longValue();
            TLRPC.TL_forumTopic f10 = wmVar.getMessagesController().f23102q7.f(-wmVar.a(), l10.longValue());
            if (l10.longValue() != 0 && f10 != null) {
                int i11 = f10.read_inbox_max_id;
                wmVar.f51563z4 = i11;
                wmVar.A4 = f10.read_outbox_max_id;
                wmVar.B4 = Math.max(1, i11);
                wmVar.getMessagesController().f23102q7.k(wmVar.f51376k6, org.telegram.messenger.m5.o(f10.from_id));
            } else {
                wmVar.f51463r4 = null;
                wmVar.f51436p4 = null;
                wmVar.f51397m4 = null;
                wmVar.E5 = null;
                wmVar.f51563z4 = 0;
                wmVar.A4 = 0;
                wmVar.B4 = 0;
                wmVar.f51475s4 = 0L;
                wmVar.f51487t4 = 0;
                wmVar.f51499u4 = null;
                wmVar.f51525w4 = false;
                wmVar.f51511v4 = false;
            }
            wmVar.J8();
            wmVar.sd(true);
            wmVar.f51433p1.n(true);
            wmVar.f51433p1.b();
            wmVar.f51323g2.setCurrentTopic(l10.longValue());
            wmVar.vd(true);
            wmVar.Lc(true);
            wmVar.getMessagesController().J4(-wmVar.a(), wmVar.b());
            wmVar.D9(true);
            wmVar.B9(true);
            mj mjVar = wmVar.f51237a0;
            if (mjVar != null) {
                mjVar.j0(false);
                wmVar.f51237a0.H1(true);
            }
            wmVar.M6(true, true);
            if (f10 != null) {
                i3 = f10.unread_reactions_count;
            } else {
                i3 = 0;
            }
            wmVar.A1 = i3;
            if (f10 != null) {
                i10 = f10.unread_poll_votes_count;
            } else {
                i10 = 0;
            }
            wmVar.B1 = i10;
            wmVar.fd(false);
            wmVar.ed(false);
            wmVar.wd();
            om omVar = wmVar.Sc;
            if (omVar != null && wmVar.actionBar.f27728o0) {
                omVar.k(null);
            }
        }
    }

    public static void u0(wm wmVar) {
        if (!wmVar.s7(wmVar.f51237a0.getSendButton())) {
            if (wmVar.getMediaController().I(wmVar.f51500u5)) {
                wmVar.getMediaController().q(true, true, false, false);
            }
            TLRPC.TL_messages_sendScheduledMessages tL_messages_sendScheduledMessages = new TLRPC.TL_messages_sendScheduledMessages();
            tL_messages_sendScheduledMessages.peer = wmVar.getMessagesController().j1(wmVar.f51376k6);
            if (wmVar.f51512v5 != null) {
                for (int i3 = 0; i3 < wmVar.f51512v5.d.size(); i3++) {
                    tL_messages_sendScheduledMessages.f27119id.add(Integer.valueOf(((org.telegram.messenger.zi) wmVar.f51512v5.d.get(i3)).f1()));
                }
            } else {
                tL_messages_sendScheduledMessages.f27119id.add(Integer.valueOf(wmVar.f51500u5.f1()));
            }
            ConnectionsManager.getInstance(wmVar.currentAccount).sendRequest(tL_messages_sendScheduledMessages, new org.telegram.ui.ActionBar.h6(6, wmVar, tL_messages_sendScheduledMessages));
        }
    }

    public static void u1(wm wmVar, long j10, boolean z10, boolean z11) {
        if (!org.telegram.messenger.g0.E1(wmVar.getParentActivity())) {
            return;
        }
        org.telegram.ui.Components.dy0.c(wmVar.getParentActivity(), wmVar.currentAccount, -j10, wmVar.getUserConfig().f(), null, z10, z11, wmVar.getResourceProvider());
    }

    public static void v0(wm wmVar, TLRPC.Document document) {
        wmVar.K4.put(document, 0);
        org.telegram.messenger.yy.C(wmVar.currentAccount).v0(document, null, wmVar.f51376k6, null, null, null, wmVar.C5, null, true, 0, 0, false, null, wmVar.W8(), 0L, wmVar.h9(), wmVar.f51540x5);
    }

    public static void v1(long j10, wm wmVar) {
        wmVar.getMediaDataController().G0(j10, j10, true, wmVar.classGuid, null);
    }

    public static void w0(wm wmVar, dg.a aVar, Runnable runnable) {
        if (!wmVar.isFinished) {
            if (dg.a.m(ci.e9.x(wmVar.currentAccount, aVar.f8923a).p()).f8924b < aVar.f8924b) {
                dg.b bVar = aVar.f8923a;
                if (bVar == dg.b.f8925a) {
                    new ci.mb(wmVar.getParentActivity(), wmVar.getResourceProvider(), aVar.a(), 13, rg.c.h(wmVar.currentAccount, wmVar.a()), null, wmVar.a()).show();
                    return;
                } else if (bVar == dg.b.f8926b) {
                    new hi.f(wmVar.getParentActivity(), wmVar.getResourceProvider(), aVar, true, null).show();
                    return;
                } else {
                    return;
                }
            }
            runnable.run();
        }
    }

    public static void w1(wm wmVar, final ArrayList arrayList, TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage, final TLRPC.messages_Messages messages_messages, TLRPC.Chat chat, TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage, final int i3, org.telegram.messenger.zi ziVar, int i10, int i11, org.telegram.messenger.zi ziVar2) {
        boolean z10;
        int i12;
        TLRPC.TL_messageReactions tL_messageReactions;
        TLRPC.MessageReplies messageReplies;
        TLRPC.MessageReplies messageReplies2;
        final int i13 = 0;
        if (!arrayList.isEmpty() && tL_messages_discussionMessage != null) {
            wmVar.Nc = true;
            wmVar.A0.g1();
            Bundle bundle = new Bundle();
            final long B0 = org.telegram.messenger.zi.B0(((org.telegram.messenger.zi) arrayList.get(0)).f26868k);
            bundle.putLong("chat_id", -B0);
            bundle.putInt("message_id", Math.max(1, tL_messages_discussionMessage.read_inbox_max_id));
            bundle.putInt("unread_count", tL_messages_discussionMessage.unread_count);
            if (messages_messages != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            bundle.putBoolean("historyPreloaded", z10);
            wm wmVar2 = new wm(bundle);
            wmVar2.Rb(arrayList, chat, tL_messages_getDiscussionMessage.msg_id, tL_messages_discussionMessage.read_inbox_max_id, tL_messages_discussionMessage.read_outbox_max_id, null);
            if (i3 != 0) {
                wmVar2.f51273c8 = i3;
            }
            if (ziVar != null && (messageReplies = ziVar.f26868k.replies) != null && (messageReplies2 = wmVar2.f51397m4.f26868k.replies) != null) {
                messageReplies.replies = messageReplies2.replies;
            }
            if (ziVar != null && (tL_messageReactions = ziVar.f26868k.reactions) != null) {
                wmVar2.f51397m4.f26868k.reactions = tL_messageReactions;
            }
            bi.q0 q0Var = new bi.q0(wmVar, new boolean[]{false}, i10, wmVar2, 18);
            if (messages_messages != null) {
                if (!messages_messages.messages.isEmpty()) {
                    for (int size = messages_messages.messages.size() - 1; size >= 0; size--) {
                        TLRPC.Message message = messages_messages.messages.get(size);
                        int i14 = message.f27022id;
                        i12 = i11;
                        if (i14 > i12 && !message.out) {
                            i13 = i14;
                            break;
                        }
                    }
                }
                i12 = i11;
                final int classGuid = wmVar2.getClassGuid();
                org.telegram.messenger.hs.f(wmVar.currentAccount).b(new bi(wmVar, classGuid, q0Var, wmVar2), org.telegram.messenger.hs.D);
                final int i15 = i12;
                Utilities.d.c(new Runnable() {
                    @Override
                    public final void run() {
                        int i16;
                        int i17;
                        wm wmVar3 = wm.this;
                        org.telegram.messenger.hp messagesController = wmVar3.getMessagesController();
                        TLRPC.messages_Messages messages_messages2 = messages_messages;
                        int size2 = messages_messages2.messages.size();
                        int i18 = i3;
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
                        int i19 = i17;
                        messagesController.K3(messages_messages2, size2, B0, 0L, 30, i16, 0, false, classGuid, i13, 0, 0, 0, i19, true, 0, ((org.telegram.messenger.zi) k2.p1.h(1, arrayList)).f1(), 1, false, 0, true, wmVar3.f51525w4, null);
                    }
                });
                return;
            }
            q0Var.run();
            return;
        }
        wmVar.Mc = 0;
        wmVar.Nc = false;
        wmVar.A0.g1();
        if (ziVar2 != null) {
            wmVar.Ga(ziVar2);
        } else if (wmVar.getParentActivity() != null) {
            org.telegram.ui.Components.fc.a0(wmVar).t(org.telegram.messenger.bd.M0(2131752330, null), wmVar.f51557ya).j();
        }
    }

    public static void x0(wm wmVar) {
        if (wmVar.f51418nc == null) {
            return;
        }
        iy0[] iy0VarArr = {iy0.d1(wmVar.getParentActivity(), wmVar, true, wmVar.resourceProvider, new mi.f(17, wmVar, iy0VarArr))};
    }

    public static void x1(wm wmVar, String str) {
        if (org.telegram.messenger.hp.s1(wmVar.currentAccount).L2(true)) {
            sf.c.n(wmVar.getParentActivity(), str, false, null);
        } else {
            org.telegram.ui.Components.t4.n0(wmVar.getParentActivity(), wmVar.f51557ya, str, true, new nf(wmVar, str, 1));
        }
    }

    public static void y0(wm wmVar, TLObject tLObject) {
        if (tLObject != null) {
            TLRPC.TL_contacts_resolvedPeer tL_contacts_resolvedPeer = (TLRPC.TL_contacts_resolvedPeer) tLObject;
            if (!tL_contacts_resolvedPeer.users.isEmpty()) {
                TLRPC.User user = tL_contacts_resolvedPeer.users.get(0);
                if (user.bot && user.bot_attach_menu) {
                    TLRPC.TL_messages_getAttachMenuBot tL_messages_getAttachMenuBot = new TLRPC.TL_messages_getAttachMenuBot();
                    tL_messages_getAttachMenuBot.bot = org.telegram.messenger.hp.s1(wmVar.currentAccount).o1(user.f27150id);
                    ConnectionsManager.getInstance(wmVar.currentAccount).sendRequest(tL_messages_getAttachMenuBot, new org.telegram.ui.ActionBar.h6(5, wmVar, user));
                }
            }
        }
    }

    public static void y1(wm wmVar, String str) {
        Uri parse = Uri.parse(str);
        z30.b(wmVar.getParentActivity(), wmVar.currentAccount, parse.getPathSegments().get(parse.getPathSegments().size() - 1), null);
    }

    public static void z0(wm wmVar, TLRPC.User user, AtomicBoolean atomicBoolean, TLRPC.TL_attachMenuBot tL_attachMenuBot) {
        TLRPC.TL_messages_toggleBotInAttachMenu tL_messages_toggleBotInAttachMenu = new TLRPC.TL_messages_toggleBotInAttachMenu();
        tL_messages_toggleBotInAttachMenu.bot = org.telegram.messenger.hp.s1(wmVar.currentAccount).o1(user.f27150id);
        tL_messages_toggleBotInAttachMenu.enabled = true;
        tL_messages_toggleBotInAttachMenu.write_allowed = atomicBoolean.get();
        ConnectionsManager.getInstance(wmVar.currentAccount).sendRequest(tL_messages_toggleBotInAttachMenu, new ug(wmVar, tL_attachMenuBot, user, 1), 66);
    }

    public static void z1(wm wmVar) {
        org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
        long j10 = wmVar.f51376k6;
        long j11 = wmVar.f51272c7;
        int i3 = wmVar.classGuid;
        int i10 = wmVar.f51325g4;
        long j12 = wmVar.f51475s4;
        int i11 = wmVar.B4;
        int i12 = wmVar.f51399m6;
        wmVar.f51399m6 = i12 + 1;
        messagesController.Y2(j10, j11, false, 30, 0, 0, true, 0, i3, 0, i10, j12, i11, i12, wmVar.f51525w4);
    }

    @Override
    public final void A() {
        try {
            Intent intent = new Intent("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.ALLOW_MULTIPLE", true);
            intent.setType("*/*");
            startActivityForResult(intent, 21);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
    }

    public final void A7() {
        float f10;
        org.telegram.ui.Components.te teVar;
        float inputBubbleHeight = this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(15.0f) + r9(org.telegram.ui.Components.c11.f32503c) + this.f51520w.d();
        mj mjVar = this.f51237a0;
        if (mjVar != null && (teVar = mjVar.f31162n0) != null) {
            teVar.setTranslationY(-inputBubbleHeight);
        }
        fj fjVar = this.X1;
        if (fjVar != null) {
            if (fjVar.g()) {
                f10 = org.telegram.messenger.g0.L(5.0f);
            } else {
                f10 = -inputBubbleHeight;
            }
            fjVar.setTranslationY(f10);
        }
    }

    public final void A9() {
        if (getUserConfig().q()) {
            org.telegram.ui.Components.fc.a0(this).c(org.telegram.messenger.bd.M0(2131754488, null)).j();
            getMessagesController().o0(true);
            eb(this.f51500u5);
            gb(this.f51500u5);
            return;
        }
        showDialog(new vg.v0((org.telegram.ui.ActionBar.d2) this, 3, true));
    }

    public final void Aa(long j10, final org.telegram.messenger.zi ziVar, int i3, final long j11, final int i10, final int i11, final org.telegram.messenger.zi ziVar2) {
        int i12 = i3;
        final TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage = new TLRPC.TL_messages_getDiscussionMessage();
        tL_messages_getDiscussionMessage.peer = org.telegram.messenger.hp.l1(M0);
        tL_messages_getDiscussionMessage.msg_id = i12;
        if (org.telegram.messenger.r2.f25040a) {
            org.telegram.messenger.a8.b("getDiscussionMessage chat = " + M0.f27001id + " msg_id = " + i12);
        }
        this.Mc = 0;
        this.Nc = false;
        this.Pc = null;
        this.Qc = null;
        wi wiVar = this.A0;
        if (wiVar != null) {
            wiVar.g1();
        }
        if (this.Lc != -1) {
            getConnectionsManager().cancelRequest(this.Lc, false);
        }
        if (this.Kc != -1) {
            getConnectionsManager().cancelRequest(this.Kc, false);
        }
        if (ziVar2 != null) {
            i12 = ziVar2.f1();
        }
        this.Mc = i12;
        this.Nc = false;
        this.Oc = System.currentTimeMillis();
        wi wiVar2 = this.A0;
        if (wiVar2 != null) {
            wiVar2.g1();
        }
        final int i13 = this.Ic + 1;
        this.Ic = i13;
        this.Kc = getConnectionsManager().sendRequest(tL_messages_getDiscussionMessage, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, TLRPC.TL_error tL_error) {
                final wm wmVar = wm.this;
                final int i14 = i13;
                final int i15 = i10;
                final long j12 = j11;
                final int i16 = i11;
                final org.telegram.messenger.zi ziVar3 = ziVar2;
                final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage2 = tL_messages_getDiscussionMessage;
                final TLRPC.Chat chat = M0;
                final org.telegram.messenger.zi ziVar4 = ziVar;
                org.telegram.messenger.g0.h3(new sc(11, wmVar, new Runnable(i14, i15, j12, tLObject, i16, ziVar3, tL_messages_getDiscussionMessage2, chat, ziVar4) {
                    public final int f47325b;
                    public final int f47326c;
                    public final TLObject d;
                    public final int f47327e;
                    public final org.telegram.messenger.zi f47328f;
                    public final TLRPC.TL_messages_getDiscussionMessage h;
                    public final TLRPC.Chat f47329n;
                    public final org.telegram.messenger.zi f47330r;

                    {
                        this.d = tLObject;
                        this.f47327e = i16;
                        this.f47328f = ziVar3;
                        this.h = tL_messages_getDiscussionMessage2;
                        this.f47329n = chat;
                        this.f47330r = ziVar4;
                    }

                    @Override
                    public final void run() {
                        int i17;
                        final wm wmVar2 = wm.this;
                        if (this.f47325b != wmVar2.Ic) {
                            return;
                        }
                        wmVar2.Kc = -1;
                        TLObject tLObject2 = this.d;
                        if (tLObject2 instanceof TLRPC.TL_messages_discussionMessage) {
                            wmVar2.Pc = (TLRPC.TL_messages_discussionMessage) tLObject2;
                            wmVar2.getMessagesController().Y3(wmVar2.Pc.users, false);
                            wmVar2.getMessagesController().S3(wmVar2.Pc.chats, false);
                        }
                        ArrayList arrayList = new ArrayList();
                        TLRPC.TL_messages_discussionMessage tL_messages_discussionMessage = wmVar2.Pc;
                        if (tL_messages_discussionMessage != null && tL_messages_discussionMessage.messages != null) {
                            for (int i18 = 0; i18 < wmVar2.Pc.messages.size(); i18++) {
                                TLRPC.Message message = wmVar2.Pc.messages.get(i18);
                                if (!(message instanceof TLRPC.TL_messageEmpty)) {
                                    arrayList.add(message);
                                }
                            }
                        }
                        int size = arrayList.size();
                        final int i19 = this.f47326c;
                        final int i20 = this.f47327e;
                        final org.telegram.messenger.zi ziVar5 = this.f47328f;
                        final TLRPC.TL_messages_getDiscussionMessage tL_messages_getDiscussionMessage3 = this.h;
                        final TLRPC.Chat chat2 = this.f47329n;
                        final org.telegram.messenger.zi ziVar6 = this.f47330r;
                        if (size > 0) {
                            TLRPC.Message message2 = (TLRPC.Message) arrayList.get(0);
                            TLRPC.TL_messages_getReplies tL_messages_getReplies = new TLRPC.TL_messages_getReplies();
                            tL_messages_getReplies.peer = wmVar2.getMessagesController().m1(message2.peer_id);
                            tL_messages_getReplies.msg_id = message2.f27022id;
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
                            final int i21 = wmVar2.Jc + 1;
                            wmVar2.Jc = i21;
                            wmVar2.Lc = wmVar2.getConnectionsManager().sendRequest(tL_messages_getReplies, new RequestDelegate() {
                                @Override
                                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error2) {
                                    org.telegram.messenger.g0.h3(new tg(wm.this, i21, tLObject3, tL_error2, i19, ziVar5, tL_messages_getDiscussionMessage3, chat2, i20, ziVar6, 0));
                                }
                            });
                            return;
                        }
                        wmVar2.Xa(wmVar2.Pc, wmVar2.Qc, i19, ziVar5, tL_messages_getDiscussionMessage3, chat2, i20, ziVar6);
                    }
                }));
            }
        });
        getConnectionsManager().bindRequestToGuid(this.Kc, this.classGuid);
    }

    public final void Ab(View view, org.telegram.messenger.zi ziVar, org.telegram.ui.Components.li0 li0Var, View view2, float f10, float f11, dh.n0 n0Var, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        dh.n0 n0Var2;
        String str;
        TLRPC.Document e10;
        org.telegram.messenger.zi b10;
        TLRPC.Chat chat;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.ui.Cells.z zVar;
        ci.q6 q6Var;
        int[] iArr;
        int[] iArr2;
        int i3;
        ArrayList<TLRPC.MessageReactor> arrayList;
        boolean z15;
        TLRPC.TL_messageReactions tL_messageReactions2;
        if (!c() && ziVar != null) {
            if (getMessagesController().v2()) {
                b.b(this.currentAccount);
                return;
            }
            int i10 = 2;
            if (n0Var != null && n0Var.f9093a) {
                O7(true);
                if (view == null) {
                    zVar = H8(ziVar.f1(), true);
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
                    TLRPC.Message message2 = ziVar.f26868k;
                    if (message2 != null && (tL_messageReactions2 = message2.reactions) != null) {
                        arrayList = tL_messageReactions2.top_reactors;
                    } else {
                        arrayList = null;
                    }
                    long j10 = -ci.x8.b(ziVar).f6364a;
                    TLRPC.ChatFull N0 = getMessagesController().N0(j10);
                    if (N0 != null && !N0.paid_reactions_available && (arrayList == null || arrayList.isEmpty())) {
                        TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(j10));
                        org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(this);
                        if (M0 != null) {
                            str2 = M0.title;
                        }
                        a02.Q(2131624226, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131745042, str2))).k(true);
                        return;
                    }
                    ci.c9 c9Var = ci.e9.y(this.currentAccount, false).B;
                    if (c9Var != null) {
                        c9Var.b();
                    }
                    Activity parentActivity = getParentActivity();
                    int i11 = this.currentAccount;
                    long j11 = this.f51376k6;
                    if (N0 != null && !N0.paid_reactions_available) {
                        z15 = false;
                    } else {
                        z15 = true;
                    }
                    ci.tc tcVar = new ci.tc(parentActivity, i11, j11, this, ziVar, arrayList, z15, false, 0L, this.f51557ya);
                    ziVar.f1();
                    tcVar.N1 = this;
                    tcVar.O1 = zVar;
                    tcVar.show();
                    return;
                }
                View view3 = this.fragmentView;
                if (view3 != null) {
                    try {
                        view3.performHapticFeedback(3, 1);
                    } catch (Exception unused2) {
                    }
                }
                long j12 = -ci.x8.b(ziVar).f6364a;
                TLRPC.ChatFull N02 = getMessagesController().N0(j12);
                if (N02 != null && !N02.paid_reactions_available) {
                    TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(j12));
                    org.telegram.ui.Components.fc a03 = org.telegram.ui.Components.fc.a0(this);
                    if (M02 != null) {
                        str2 = M02.title;
                    }
                    a03.Q(2131624226, 36, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131745042, str2))).k(true);
                    return;
                }
                ci.c9 b02 = ci.e9.y(this.currentAccount, false).b0(ziVar, this, 1L, true, true, null);
                if (b02 != null && (zVar instanceof org.telegram.ui.Cells.z)) {
                    if (this.Uc == null) {
                        this.Uc = new ci.q6(this);
                    }
                    FrameLayout layoutContainer = getLayoutContainer();
                    if (layoutContainer == null) {
                        q6Var = null;
                    } else {
                        if (this.Uc.getParent() != layoutContainer) {
                            org.telegram.messenger.g0.E2(this.Uc);
                            layoutContainer.addView(this.Uc, b8.mf.c(-1.0f, -1));
                        } else if (layoutContainer.indexOfChild(this.Uc) < layoutContainer.indexOfChild(this.fragmentView)) {
                            this.Uc.bringToFront();
                        }
                        q6Var = this.Uc;
                    }
                    q6Var.setMessageCell((org.telegram.ui.Cells.z) zVar);
                    b02.f4934o = q6Var;
                    q6Var.J = false;
                    q6Var.b(1.0f, null);
                    zVar.getLocationInWindow(new int[2]);
                    q6Var.getLocationInWindow(new int[2]);
                    float f12 = (iArr[0] - iArr2[0]) + f10;
                    float f13 = (iArr[1] - iArr2[1]) + f11;
                    if (zVar instanceof org.telegram.ui.Cells.q1) {
                        i3 = ((org.telegram.ui.Cells.q1) zVar).W;
                    } else {
                        i3 = 0;
                    }
                    q6Var.d(f12, f13 + i3, false);
                }
            } else if (a() == getUserConfig().e() && !getUserConfig().q() && (message = ziVar.f26868k) != null && ((tL_messageReactions = message.reactions) == null || tL_messageReactions.reactions_as_tags || tL_messageReactions.results.isEmpty())) {
                new vg.v0((org.telegram.ui.ActionBar.d2) this, 24, true).show();
            } else {
                if (ziVar.x2() && n0Var != null) {
                    for (int i12 = 0; i12 < ziVar.f26868k.reactions.results.size(); i12++) {
                        TLRPC.ReactionCount reactionCount = ziVar.f26868k.reactions.results.get(i12);
                        if (n0Var.f(reactionCount.reaction)) {
                            z14 = reactionCount.chosen;
                            break;
                        }
                    }
                }
                z14 = false;
                if (!z14 && (chat = this.f51292e) != null && !org.telegram.messenger.t3.V(chat) && !org.telegram.messenger.t3.w(26, this.f51292e)) {
                    org.telegram.messenger.k5.o(null, 2131745601, org.telegram.ui.Components.fc.a0(this), 2131624006, 36);
                    return;
                }
                dh.j0.b(false);
                int size = ziVar.y0().size();
                boolean I5 = ziVar.I5(n0Var, z11);
                int f14 = ziVar.f1();
                long d12 = ziVar.d1();
                a0.h hVar = this.O6;
                if (hVar.f(d12) != null && (b10 = ((org.telegram.messenger.ui) hVar.f(ziVar.d1())).b(9)) != null) {
                    f14 = b10.f1();
                }
                int i13 = f14;
                if (I5) {
                    org.telegram.ui.Cells.z H8 = H8(i13, true);
                    if (!org.telegram.messenger.az.f21674w1 && H8 != null && n0Var != null && !getUserConfig().q() && size == 1) {
                        org.telegram.messenger.az.C(true);
                        long j13 = n0Var.f9098g;
                        if (j13 == 0) {
                            TLRPC.TL_availableReaction tL_availableReaction = (TLRPC.TL_availableReaction) org.telegram.messenger.li.b0(this.currentAccount).f24045r.get(n0Var.f9097f);
                            if (tL_availableReaction != null) {
                                e10 = tL_availableReaction.center_icon;
                            }
                        } else {
                            e10 = org.telegram.ui.Components.g5.e(this.currentAccount, j13);
                        }
                        if (e10 != null) {
                            org.telegram.ui.Components.ac q10 = org.telegram.ui.Components.fc.a0(this).q(e10, org.telegram.messenger.bd.M0(2131752218, null));
                            q10.f31792j = 5000;
                            q10.j();
                        }
                    }
                    if (!z10) {
                        int i14 = this.currentAccount;
                        if (li0Var != null) {
                            if (z11) {
                                i10 = 0;
                            }
                        } else {
                            i10 = 1;
                        }
                        dh.j0.d(this, li0Var, H8, view2, f10, f11, n0Var, i14, i10);
                    }
                }
                if (I5 && n0Var != null && (str = n0Var.f9097f) != null) {
                    org.telegram.messenger.g0.i2(org.telegram.messenger.bd.a0(null, null, 2131754725, str));
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(ziVar.y0());
                org.telegram.messenger.yy sendMessagesHelper = getSendMessagesHelper();
                if (I5) {
                    n0Var2 = n0Var;
                } else {
                    n0Var2 = null;
                }
                zh zhVar = new zh(this, z13, z10, i13, I5, li0Var, f10, f11, n0Var, ziVar);
                this.Gc = zhVar;
                sendMessagesHelper.s0(ziVar, arrayList2, n0Var2, z11, z12, this, zhVar);
                if (z10 || z13) {
                    Uc(ziVar, true);
                    this.Gc.run();
                }
                if (!z13) {
                    org.telegram.messenger.g0.i3(this.Gc, 50L);
                }
            }
        }
    }

    public final void Ac(org.telegram.messenger.zi ziVar, boolean z10) {
        TL_iv.RichMessage richMessage;
        if (ziVar != null && getParentActivity() != null) {
            dh.r rVar = this.f51480sa;
            if (rVar != null && rVar.d()) {
                this.f51480sa.setHiddenByScroll(true);
            }
            if (this.f51371k0 != null) {
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar.f27728o0) {
                    kVar.l(true);
                    this.f51237a0.d1();
                }
            }
            TLRPC.Message message = ziVar.f26868k;
            if (message != null && (richMessage = message.rich_message) != null) {
                mi.c2 c2Var = new mi.c2(richMessage);
                c2Var.K = this;
                c2Var.f19529r = ziVar;
                presentFragment(c2Var);
                return;
            }
            this.X1.getAdapter().f16999g0 = false;
            this.f51237a0.setVisibility(0);
            bc(true, null, ziVar, null, null, true, 0, null, false, 0L, null, true);
            Lc(false);
            if (!z10) {
                b7();
            }
            if (z10) {
                this.f51540x5 = org.telegram.messenger.ej.b(ziVar.f26868k.suggested_post);
            }
            this.f51237a0.U0(false, false, true);
            cd(0, true);
            Cd(false);
            if (!z10 && !ziVar.f26887p1 && !org.telegram.messenger.zi.c4(ziVar.f26868k) && this.f51325g4 != 9) {
                TLRPC.TL_messages_getMessageEditData tL_messages_getMessageEditData = new TLRPC.TL_messages_getMessageEditData();
                tL_messages_getMessageEditData.peer = getMessagesController().j1(this.f51376k6);
                tL_messages_getMessageEditData.f27095id = ziVar.f1();
                this.F5 = getConnectionsManager().sendRequest(tL_messages_getMessageEditData, new be(this, 3));
                return;
            }
            mj mjVar = this.f51237a0;
            org.telegram.ui.Components.ee eeVar = mjVar.G1;
            if (eeVar != null) {
                eeVar.setEnabled(true);
                mjVar.G1.f(false);
            }
        }
    }

    public final void Ad() {
        int i3;
        org.telegram.ui.ActionBar.o0 o0Var = this.f51419o0;
        if (o0Var == null) {
            return;
        }
        if (getMessagesController().f23120s7.z(a()) && getMessagesController().f23120s7.t(a())) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        o0Var.e(i3);
    }

    public final void B7() {
        float d;
        if (this.A0 != null) {
            if (this.jb && this.xa == null) {
                d = org.telegram.messenger.g0.f22603n;
            } else {
                d = this.f51520w.d() + r9(org.telegram.ui.Components.c11.f32503c) + org.telegram.messenger.g0.L(16.0f) + this.Va + this.Xc;
            }
            int i3 = (int) this.M9;
            org.telegram.ui.Components.g11 g11Var = this.f51323g2;
            if (g11Var != null) {
                g11Var.setSideMenuBackgroundMarginTop(0.0f);
            }
            kh.g gVar = this.f51559z0;
            boolean z10 = this.A0.W1;
            RecyclerView recyclerView = gVar.f17291a;
            int i10 = (int) d;
            int paddingTop = recyclerView.getPaddingTop();
            int paddingBottom = recyclerView.getPaddingBottom();
            if (paddingTop != i3 || paddingBottom != i10) {
                int i11 = paddingTop - i3;
                if (!z10 && i11 != 0) {
                    boolean canScrollVertically = recyclerView.canScrollVertically(1);
                    boolean canScrollVertically2 = recyclerView.canScrollVertically(-1);
                    if ((i11 >= 0 || canScrollVertically) && (i11 <= 0 || canScrollVertically2)) {
                        org.telegram.messenger.g0.J(recyclerView, new cg.l0(gVar, i11, 12));
                    }
                }
                recyclerView.setPadding(recyclerView.getPaddingLeft(), i3, recyclerView.getPaddingRight(), i10);
            }
            kh.e eVar = this.f51269c4;
            if (eVar != null) {
                RectF rectF = eVar.f17270b;
                rectF.set(r9(org.telegram.ui.Components.c11.f32502b), i3 - this.I, 0.0f, d - this.Va);
                eVar.f17271c.set(rectF.left, rectF.top, eVar.getMeasuredWidth() - rectF.right, eVar.getMeasuredHeight() - rectF.bottom);
            }
        }
    }

    public final void B8(CharSequence charSequence, ArrayList arrayList) {
        if (this.G5 != null) {
            if (!TextUtils.isEmpty(charSequence)) {
                org.telegram.messenger.zi ziVar = this.G5;
                ziVar.f26914w1 = charSequence;
                ziVar.f26918x1 = arrayList;
            } else if (this.G5.G3()) {
                org.telegram.messenger.zi ziVar2 = this.G5;
                ziVar2.f26914w1 = "";
                ziVar2.f26918x1 = new ArrayList();
            } else {
                mj mjVar = this.f51237a0;
                if (mjVar != null) {
                    this.G5.f26914w1 = mjVar.getFieldText();
                    org.telegram.messenger.zi ziVar3 = this.G5;
                    if (ziVar3.f26914w1 == null && !TextUtils.isEmpty(ziVar3.f26868k.message)) {
                        this.G5.f26914w1 = "";
                    }
                }
            }
        }
    }

    public final void B9(boolean z10) {
        cc(false, null, false, z10);
    }

    public final void Ba(boolean z10) {
        String M0;
        if (!U9() && !x9()) {
            int i3 = 0;
            boolean z11 = false;
            for (int i10 = 0; i10 < 2; i10++) {
                int i11 = 0;
                while (true) {
                    SparseArray[] sparseArrayArr = this.f51412n6;
                    if (i11 >= sparseArrayArr[i10].size()) {
                        break;
                    }
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[i10].valueAt(i11);
                    if (ziVar.E4()) {
                        i3 = 3;
                    } else if (ziVar.U3()) {
                        if (ziVar.a4()) {
                            i3 = 2;
                        } else {
                            i3 = 1;
                        }
                        if (i3 == 2) {
                            break;
                        }
                    } else if (ziVar.A3()) {
                        z11 = true;
                    }
                    i11++;
                }
                if (i3 == 2) {
                    break;
                }
            }
            dh.r rVar = this.f51480sa;
            if (rVar != null && rVar.d()) {
                this.f51480sa.setHiddenByScroll(true);
            }
            Bundle l10 = org.telegram.ui.Cells.f1.l(3, "onlySelect", "dialogsType", true);
            l10.putInt("messagesCount", this.f51489t6);
            l10.putInt("hasPoll", i3);
            l10.putBoolean("hasInvoice", z11);
            l10.putBoolean("canSelectTopics", true);
            uw uwVar = new uw(l10);
            uwVar.D2 = this;
            presentFragment(uwVar);
            return;
        }
        if (U9()) {
            if (a() > 0) {
                M0 = org.telegram.messenger.bd.M0(2131750535, null);
            } else if (org.telegram.messenger.t3.T(this.f51292e) && !this.f51292e.megagroup) {
                M0 = org.telegram.messenger.bd.M0(2131750537, null);
            } else {
                M0 = org.telegram.messenger.bd.M0(2131750536, null);
            }
        } else {
            M0 = org.telegram.messenger.bd.M0(2131750538, null);
        }
        if (z10) {
            if (this.f51561z2 == null) {
                int indexOfChild = this.m1.indexOfChild(this.U);
                if (indexOfChild != -1) {
                    this.f51561z2 = D6(310.0f, 1, indexOfChild + 1, false);
                } else {
                    return;
                }
            }
            this.f51561z2.u(M0);
            this.f51561z2.y(this.actionBar.getActionMode().j(11), true);
            return;
        }
        if (this.A2 == null) {
            int indexOfChild2 = this.m1.indexOfChild(this.U);
            if (indexOfChild2 == -1) {
                return;
            }
            this.A2 = D6(310.0f, 3, indexOfChild2 + 1, false);
        }
        this.A2.u(M0);
        this.A2.y(this.f51294e1.getForwardButton(), true);
    }

    public final void Bb() {
        k4.j[] jVarArr;
        lh.b bVar;
        lh.a aVar;
        org.telegram.ui.Components.vc[] vcVarArr;
        um umVar = this.f51557ya;
        if (umVar != null) {
            umVar.t();
        }
        ki kiVar = this.f51547y;
        if (kiVar != null) {
            kiVar.d();
        }
        ki kiVar2 = this.f51534x;
        if (kiVar2 != null) {
            kiVar2.d();
        }
        ki kiVar3 = this.E;
        if (kiVar3 != null) {
            kiVar3.d();
        }
        mj mjVar = this.f51237a0;
        if (mjVar != null) {
            mjVar.updateColors();
        }
        ei.x2 x2Var = this.Y1;
        if (x2Var != null) {
            x2Var.P0();
        }
        wi wiVar = this.A0;
        if (wiVar != null) {
            int childCount = wiVar.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.A0.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    ((org.telegram.ui.Cells.q1) childAt).A0(0);
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    ((org.telegram.ui.Cells.t0) childAt).setInvalidateColors(true);
                }
            }
        }
        org.telegram.ui.ActionBar.f1 f1Var = this.f51316f9;
        if (f1Var != null && f1Var.getContentView() != null) {
            View contentView = this.f51316f9.getContentView();
            int themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.G8);
            if (!(contentView.getBackground() instanceof ColorDrawable) || ((ColorDrawable) contentView.getBackground()).getColor() != themedColor) {
                contentView.setBackgroundColor(themedColor);
                contentView.invalidate();
            }
        }
        org.telegram.ui.Components.xd0 xd0Var = this.O2;
        if (xd0Var != null) {
            xd0Var.d();
        }
        nj njVar = this.f51251b0;
        if (njVar != null && njVar.getEditView() != null) {
            for (org.telegram.ui.Components.vc vcVar : this.f51251b0.getEditView().f38718a) {
                if (vcVar != null) {
                    vcVar.d();
                }
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.f51359j0;
        if (q0Var != null) {
            q0Var.V();
        }
        hj hjVar = this.f51395m2;
        if (hjVar != null) {
            hjVar.updateColors();
        }
        qi qiVar = this.f51433p1;
        if (qiVar != null) {
            qiVar.updateColors();
        }
        kl klVar = this.m1;
        if (klVar != null) {
            klVar.M();
            ai.x2 x2Var2 = this.m1.M;
            if (x2Var2 != null) {
                x2Var2.invalidate();
            }
        }
        org.telegram.ui.Components.jg jgVar = this.f51252b1;
        if (jgVar != null) {
            gh.g gVar = jgVar.f35065s;
            if (gVar != null) {
                gVar.updateColors();
            }
            Color.alpha(org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f27878d6, false));
            jgVar.invalidate();
        }
        org.telegram.ui.Components.ow0 ow0Var = this.f51472s1;
        if (ow0Var != null) {
            ow0Var.updateColors();
        }
        qi qiVar2 = this.f51433p1;
        if (qiVar2 != null && qiVar2.getTimeItem() != null) {
            this.f51433p1.getTimeItem().invalidate();
        }
        kh.f fVar = this.U;
        if (fVar != null) {
            fVar.updateColors();
        }
        mh.h hVar = this.f51549y1;
        if (hVar != null) {
            for (k4.j jVar : hVar.f19425e) {
                if (jVar != null && (aVar = (bVar = (lh.b) jVar.f16869a).f18536b) != null) {
                    aVar.updateColors();
                    bVar.invalidate();
                }
            }
        }
        qj qjVar = this.f51279d1;
        if (qjVar != null) {
            qjVar.updateColors();
        }
        Iterator it = this.G.iterator();
        while (it.hasNext()) {
            ((gh.g) it.next()).updateColors();
        }
        this.m1.invalidate();
        Iterator it2 = this.F.iterator();
        while (it2.hasNext()) {
            ((View) it2.next()).invalidate();
        }
    }

    public final void Bc() {
        org.telegram.ui.Components.gz gzVar = this.G9;
        if (gzVar != null && !gzVar.f34239c) {
            gzVar.c(false);
            try {
                this.G9.performHapticFeedback(3, 2);
            } catch (Exception unused) {
            }
        }
    }

    public final void Bd(org.telegram.messenger.v10 v10Var) {
        int i3;
        int i10;
        wi wiVar = this.A0;
        if (wiVar != null) {
            if (!this.Q4 && this.f51245a8 != null) {
                int childCount = wiVar.getChildCount();
                int i11 = 0;
                while (true) {
                    if (i11 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i11);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.messenger.zi messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        org.telegram.messenger.zi ziVar = this.f51245a8;
                        if (messageObject == ziVar) {
                            ArrayList arrayList = this.L6;
                            if (arrayList.indexOf(ziVar) >= 0) {
                                i3 = arrayList.indexOf(this.f51245a8) + this.D0.K;
                                i10 = f9(childAt);
                            }
                        }
                    }
                    i11++;
                }
            }
            i3 = -1;
            i10 = 0;
            int childCount2 = this.A0.getChildCount();
            mj mjVar = this.f51237a0;
            if (mjVar != null) {
                mjVar.getEditingMessageObject();
            }
            for (int i12 = 0; i12 < childCount2; i12++) {
                View childAt2 = this.A0.getChildAt(i12);
                if (childAt2 instanceof org.telegram.ui.Cells.q1) {
                    org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt2;
                    org.telegram.messenger.zi messageObject2 = q1Var.getMessageObject();
                    if (((Boolean) v10Var.a(messageObject2)).booleanValue()) {
                        messageObject2.K1 = true;
                        q1Var.u3(messageObject2, q1Var.getCurrentMessagesGroup(), q1Var.G2(), q1Var.H2(), q1Var.z2(), q1Var.C2());
                        fl flVar = this.D0;
                        this.A0.getClass();
                        flVar.Q(RecyclerView.R(q1Var));
                    }
                }
            }
            if (i3 != -1) {
                this.C0.h1(i3, i10);
            }
        }
    }

    public final void C7() {
        FrameLayout frameLayout = this.f51308f1;
        if (frameLayout != null) {
            frameLayout.setTranslationY((this.U.getInputBubbleHeight() + this.f51520w.c() + org.telegram.messenger.g0.L(9.0f)) * (-0.5f));
        }
    }

    public final void C8() {
        CharSequence charSequence;
        mj mjVar = this.f51237a0;
        if (mjVar != null) {
            charSequence = mjVar.getFieldText();
        } else {
            charSequence = null;
        }
        B8(charSequence, null);
    }

    public final void C9(boolean z10) {
        if (this.f51396m3.getTag() != null && !this.f51474s3) {
            if (!this.f51551y3 || this.f51498u3) {
                this.f51396m3.setTag(null);
                if (z10) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    this.f51510v3 = animatorSet;
                    animatorSet.setDuration(150L);
                    this.f51510v3.playTogether(ObjectAnimator.ofFloat(this.f51396m3, View.ALPHA, 0.0f));
                    this.f51510v3.addListener(new ai(this, 5));
                    this.f51510v3.setStartDelay(this.f51435p3);
                    this.f51510v3.start();
                } else {
                    AnimatorSet animatorSet2 = this.f51510v3;
                    if (animatorSet2 != null) {
                        animatorSet2.cancel();
                        this.f51510v3 = null;
                    }
                    this.f51396m3.setAlpha(0.0f);
                }
                this.f51435p3 = 500;
            }
        }
    }

    public final void Ca(int i3) {
        boolean z10;
        TLRPC.TL_channels_sendAsPeers tL_channels_sendAsPeers;
        org.telegram.messenger.zi ziVar;
        org.telegram.messenger.dj djVar = this.f51526w5;
        if (djVar != null && this.Za == null) {
            TLRPC.Peer peer = null;
            if (djVar.f22199c != null) {
                int i10 = this.currentAccount;
                TLRPC.WebPage webPage = this.X5;
                CharSequence fieldText = this.f51237a0.getFieldText();
                org.telegram.messenger.zi ziVar2 = this.E5;
                if (ziVar2 == this.f51397m4) {
                    ziVar = null;
                } else {
                    ziVar = ziVar2;
                }
                djVar.e(i10, webPage, fieldText, ziVar, this.C5, this.G5);
            }
            if (!this.f51526w5.c()) {
                this.Bb = this.f51237a0.A2;
                Context context = this.m1.getContext();
                eh.c cVar = this.P8;
                org.telegram.messenger.dj djVar2 = this.f51526w5;
                TLRPC.User user = this.f51306f;
                TLRPC.Chat chat = this.f51292e;
                int i11 = this.currentAccount;
                um umVar = this.f51557ya;
                mm mmVar = this.C5;
                if (mmVar != null && mmVar.f47704f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                hk hkVar = new hk(this, context, this, cVar, djVar2, user, chat, i11, umVar, i3, z10);
                this.Za = hkVar;
                this.f51526w5.f22217x = hkVar;
                TLRPC.ChatFull chatFull = this.f51453q8;
                if (chatFull != null) {
                    peer = chatFull.default_send_as;
                }
                if (peer == null && (tL_channels_sendAsPeers = this.Ba) != null && !tL_channels_sendAsPeers.peers.isEmpty()) {
                    peer = this.Ba.peers.get(0).peer;
                }
                this.Za.setSendAsPeer(peer);
                r7();
                this.m1.addView(this.Za);
                if (this.Bb) {
                    mj mjVar = this.f51237a0;
                    mjVar.U0 = true;
                    org.telegram.ui.Components.kf kfVar = mjVar.V0;
                    if (kfVar != null) {
                        kfVar.u(true);
                    }
                    this.f51237a0.r1();
                    this.S3 = true;
                }
                org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
                this.fragmentView.requestLayout();
            }
        }
    }

    public final void Cb(TLRPC.Document document) {
        String V;
        if (document == null || (V = org.telegram.messenger.zi.V(document, null, null)) == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = new TLRPC.TL_messageEntityCustomEmoji();
        tL_messageEntityCustomEmoji.document = document;
        tL_messageEntityCustomEmoji.document_id = document.f27007id;
        tL_messageEntityCustomEmoji.offset = 0;
        tL_messageEntityCustomEmoji.length = V.length();
        arrayList.add(tL_messageEntityCustomEmoji);
        org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(V, this.f51376k6, this.E5, this.f51397m4, null, false, arrayList, null, null, true, 0, 0, null, false);
        b10.K = W8();
        org.telegram.messenger.yy.C(this.currentAccount).r0(b10);
        K6();
    }

    public final void Cc() {
        long j10;
        yd ydVar = this.f51391l8;
        if (ydVar != null) {
            org.telegram.messenger.g0.r(ydVar);
        }
        yd ydVar2 = new yd(this, 18);
        this.f51391l8 = ydVar2;
        if (this.f51328g8 != null) {
            j10 = 2500;
        } else {
            j10 = 1000;
        }
        org.telegram.messenger.g0.i3(ydVar2, j10);
    }

    public final void Cd(boolean r22) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Cd(boolean):void");
    }

    @Override
    public final org.telegram.ui.Components.qt0 D() {
        return this.m1;
    }

    public final gi.l3 D6(float f10, int i3, int i10, boolean z10) {
        long j10;
        gi.l3 l3Var = new gi.l3(getParentActivity(), i3);
        l3Var.r(true);
        l3Var.h = org.telegram.messenger.g0.L(f10);
        if (z10) {
            j10 = -1;
        } else {
            j10 = 2300;
        }
        l3Var.d = j10;
        l3Var.U = true;
        l3Var.f13084e = true;
        l3Var.k(z10);
        l3Var.n(11.0f, 6.0f, 11.0f, 7.0f);
        l3Var.f13105v0 = org.telegram.messenger.g0.L(4.0f);
        l3Var.setPadding(org.telegram.messenger.g0.L(8.0f), 0, org.telegram.messenger.g0.L(8.0f), 0);
        l3Var.l(this.L);
        FrameLayout.LayoutParams e10 = b8.mf.e(-1, 150, 55);
        if (i10 >= 0) {
            this.m1.addView(l3Var, i10, e10);
            return l3Var;
        }
        this.m1.addView(l3Var, e10);
        return l3Var;
    }

    public final void D7() {
        int i3;
        float f10 = this.f51320fd.f53840e;
        org.telegram.ui.Components.p20 p20Var = this.I1;
        int i10 = 8;
        if (p20Var != null) {
            p20Var.setAlpha(f10);
            org.telegram.ui.Components.p20 p20Var2 = this.I1;
            if (f10 > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            p20Var2.setVisibility(i3);
        }
        ci.j1 j1Var = this.f51241a4;
        if (j1Var != null) {
            float f11 = 1.0f - f10;
            j1Var.setAlpha(f11);
            ci.j1 j1Var2 = this.f51241a4;
            if (f11 > 0.0f) {
                i10 = 0;
            }
            j1Var2.setVisibility(i10);
        }
    }

    public final void D8(boolean z10) {
        TLRPC.Chat chat = this.f51292e;
        if (chat != null && this.f51453q8 != null && !org.telegram.messenger.t3.r0(chat) && !this.f51292e.creator) {
            TLRPC.ChatFull chatFull = this.f51453q8;
            long j10 = chatFull.inviterId;
            if (j10 != 0) {
                this.f51458r = j10;
                return;
            }
            TLRPC.ChatParticipants chatParticipants = chatFull.participants;
            if (chatParticipants != null) {
                TLRPC.ChatParticipant chatParticipant = chatParticipants.self_participant;
                if (chatParticipant != null) {
                    this.f51458r = chatParticipant.inviter_id;
                    return;
                }
                long e10 = getUserConfig().e();
                int size = this.f51453q8.participants.participants.size();
                for (int i3 = 0; i3 < size; i3++) {
                    TLRPC.ChatParticipant chatParticipant2 = this.f51453q8.participants.participants.get(i3);
                    if (chatParticipant2.user_id == e10) {
                        this.f51458r = chatParticipant2.inviter_id;
                        return;
                    }
                }
            }
            if (z10 && this.f51458r == 0) {
                getMessagesController().G(this.f51292e.f27001id, false);
            }
        }
    }

    public final void D9(boolean z10) {
        if (this.f51410n3.getTag() != null && !this.f51486t3) {
            if (!this.f51562z3 || this.f51498u3) {
                this.f51410n3.setTag(null);
                if (z10) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51538x3, 0.0f);
                    this.f51524w3 = ofFloat;
                    ofFloat.setDuration(150L);
                    this.f51524w3.addUpdateListener(new ae(this, 1));
                    this.f51524w3.addListener(new ai(this, 7));
                    this.f51524w3.setStartDelay(this.f51435p3);
                    this.f51524w3.start();
                } else {
                    ValueAnimator valueAnimator = this.f51524w3;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        this.f51524w3 = null;
                    }
                    this.f51538x3 = 0.0f;
                    Pc();
                }
                this.f51435p3 = 500;
            }
        }
    }

    public final void Da(String str, boolean z10) {
        boolean z11;
        jj jjVar;
        boolean z12;
        org.telegram.ui.ActionBar.q0 q0Var;
        int i3;
        if (!str.isEmpty()) {
            if (str.startsWith("#") || str.startsWith("$")) {
                b8();
                gi.l3 l3Var = this.K1;
                if (l3Var != null && l3Var.W) {
                    l3Var.f(true);
                    z11 = true;
                } else {
                    z11 = false;
                }
                gi.l3 l3Var2 = this.L1;
                if (l3Var2 != null && l3Var2.W) {
                    l3Var2.f(true);
                    z11 = true;
                }
                if (z11) {
                    org.telegram.messenger.g0.i3(new fe(this, str, 5), 200L);
                    return;
                }
                this.J3 = str;
                this.I3 = str;
                boolean contains = str.contains("@");
                f7(true);
                if (!this.actionBar.f27728o0) {
                    this.f51305ed.a(true, true);
                    org.telegram.ui.ActionBar.q0 q0Var2 = this.f51359j0;
                    if (q0Var2 != null) {
                        q0Var2.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w wVar = this.f51321g0;
                    if (wVar != null) {
                        wVar.e(8);
                    }
                    ar arVar = this.f51307f0;
                    if (arVar != null) {
                        arVar.b(false);
                    }
                    if ((this.f51475s4 == 0 || (i3 = this.f51325g4) == 3 || i3 == 8) && (q0Var = this.f51371k0) != null) {
                        q0Var.setVisibility(0);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var3 = this.f51432p0;
                    if (q0Var3 != null && this.ea) {
                        q0Var3.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.w wVar2 = this.f51445q0;
                    if (wVar2 != null && this.f51317fa) {
                        wVar2.e(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var4 = this.f51383l0;
                    if (q0Var4 != null) {
                        q0Var4.setVisibility(8);
                    }
                    org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
                    if (q0Var5 != null) {
                        q0Var5.setVisibility(8);
                    }
                    this.f51459r0 = true;
                    jd(0, 0, -1);
                    Lc(false);
                }
                wj wjVar = this.D1;
                if (wjVar != null) {
                    if (wjVar.F > 0.5f) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (z12) {
                        wjVar.g(false);
                    }
                }
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
                if (!contains && !z10 && (!org.telegram.messenger.t3.V(this.f51292e) || !org.telegram.messenger.t3.t0(this.f51292e) || this.J3 == null)) {
                    this.G1 = 0;
                } else {
                    this.G1 = 2;
                }
                this.f51364j5 = false;
                if (this.f51282d4 == 3) {
                    org.telegram.messenger.ha.a(this.currentAccount).b(3).a();
                } else {
                    org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(this.currentAccount);
                    a10.f22907b.a();
                    a10.f22908c.a();
                }
                gi.g1 g1Var = this.F1;
                if (g1Var != null) {
                    g1Var.h.clear();
                }
                org.telegram.ui.ActionBar.q0 q0Var6 = this.f51371k0;
                if (q0Var6 != null) {
                    this.Hc = true;
                    q0Var6.F(false);
                    this.Hc = false;
                }
                org.telegram.ui.ActionBar.q0 q0Var7 = this.f51371k0;
                if (q0Var7 != null) {
                    q0Var7.setSearchFieldCaption(null);
                    this.f51371k0.P(str, false);
                    this.f51371k0.setSearchFieldHint(org.telegram.messenger.bd.M0(2131745773, null));
                }
                getMediaDataController().X1(this.I3, this.f51376k6, this.f51272c7, this.classGuid, 0, this.f51475s4, false, this.D3, this.E3, false, this.F3);
                cd(0, true);
                this.f51473s2.e(true, true);
                oc(true);
                jj jjVar2 = this.E1;
                if (jjVar2 != null) {
                    jjVar2.b(!contains);
                    ld();
                }
                if ((contains || z10) && this.J3 != null && (jjVar = this.E1) != null) {
                    int currentPosition = jjVar.f32330a.getCurrentPosition();
                    int i10 = this.G1;
                    if (currentPosition != i10) {
                        this.E1.f32330a.d(i10, i10);
                    }
                }
                org.telegram.messenger.ha.a(this.currentAccount).c(this.J3);
                this.I1.f37038f.O(true);
                View currentView = this.F1.getCurrentView();
                if (currentView instanceof ym) {
                    ((ym) currentView).f52363a.nd(this.J3);
                }
            }
        }
    }

    public final void Db(TLRPC.BotInlineResult botInlineResult, boolean z10, int i3, long j10) {
        long j11;
        String str;
        fj fjVar = this.X1;
        if (fjVar == null) {
            return;
        }
        TLRPC.User user = fjVar.getAdapter().f17020x0;
        if (user != null) {
            j11 = user.f27150id;
        } else {
            j11 = 0;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("id", botInlineResult.f26999id);
        hashMap.put("query_id", "" + botInlineResult.query_id);
        hashMap.put("bot", "" + j11);
        TLRPC.User user2 = this.X1.getAdapter().f17020x0;
        if (user2 == null) {
            str = "";
        } else {
            str = user2.username;
        }
        hashMap.put("bot_name", str);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j12 = this.f51376k6;
        org.telegram.messenger.zi ziVar = this.E5;
        org.telegram.messenger.zi ziVar2 = this.f51397m4;
        mm mmVar = this.C5;
        org.telegram.messenger.yy.S(i3, j12, j10, h9(), hashMap, accountInstance, ziVar, ziVar2, W8(), botInlineResult, null, this, mmVar, z10);
        this.f51237a0.setFieldText("");
        B9(false);
        getMediaDataController().v0(j11, false);
    }

    public final void Dc() {
        org.telegram.messenger.g0.d0(this.A0, new ci.b8(5, this, O9()));
    }

    @Override
    public final List E() {
        String M0;
        ArrayList arrayList = new ArrayList();
        if (org.telegram.messenger.t3.T(this.f51292e)) {
            arrayList.add(new qg.a(org.telegram.messenger.bd.M0(2131751613, null)));
            int i3 = this.f51236a;
            if (i3 != 1) {
                if (i3 != 2) {
                    M0 = org.telegram.messenger.bd.M0(2131751610, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131751611, null);
                }
            } else {
                M0 = org.telegram.messenger.bd.M0(2131751612, null);
            }
            arrayList.add(new qg.a(org.telegram.messenger.bd.a0(null, null, 2131751609, M0), new tf(this, 18)));
            arrayList.add(new qg.a(org.telegram.messenger.bd.M0(2131751608, null), new tf(this, 19)));
        }
        if (this.f51306f == null) {
            arrayList.add(new qg.a(org.telegram.messenger.bd.M0(2131751618, null)));
            arrayList.add(new qg.a(org.telegram.messenger.bd.M0(2131751617, null), 0.0f, 255.0f, new r0("", 1)));
            arrayList.add(new qg.a(org.telegram.messenger.bd.M0(2131751616, null), 1.0f, 10.0f, new org.telegram.ui.Cells.f2(this)));
        }
        return arrayList;
    }

    public final void E6(org.telegram.messenger.zi ziVar, Integer num) {
        org.telegram.messenger.zi ziVar2 = ziVar.C;
        if (ziVar2 != null) {
            int f12 = ziVar2.f1();
            SparseArray sparseArray = this.H6;
            ArrayList arrayList = (ArrayList) sparseArray.get(f12);
            if (arrayList == null) {
                arrayList = new ArrayList();
                sparseArray.put(f12, arrayList);
            }
            int f13 = ziVar.f1();
            if (!arrayList.contains(Integer.valueOf(f13))) {
                arrayList.add(Integer.valueOf(f13));
            }
            if (num.intValue() != 0) {
                arrayList.remove(num);
            }
        }
    }

    public final void E7() {
        if (this.m1 == null) {
            return;
        }
        this.Xc = P6(false);
        this.Yc = P6(true);
        this.U.setInputBubbleHeight(this.Xc);
        ad();
        Kc();
        A7();
        x7();
        C7();
        B7();
    }

    public final void E8(org.telegram.messenger.zi r76, java.util.ArrayList r77, java.util.ArrayList r78, java.util.ArrayList r79) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.E8(org.telegram.messenger.zi, java.util.ArrayList, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void E9(boolean z10) {
        if (!z10) {
            gi.l3 l3Var = this.B2;
            if (l3Var != null) {
                l3Var.f(true);
            }
            gi.l3 l3Var2 = this.f51509v2;
            if (l3Var2 != null) {
                l3Var2.f(true);
            }
            gi.l3 l3Var3 = this.f51537x2;
            if (l3Var3 != null) {
                l3Var3.f(true);
            }
        }
        gi.l3 l3Var4 = this.A2;
        if (l3Var4 != null) {
            l3Var4.f(true);
        }
        gi.l3 l3Var5 = this.f51561z2;
        if (l3Var5 != null) {
            l3Var5.f(true);
        }
        gi.l3 l3Var6 = this.I2;
        if (l3Var6 != null) {
            l3Var6.f(true);
        }
        gi.l3 l3Var7 = this.J2;
        if (l3Var7 != null) {
            l3Var7.f(true);
        }
        gi.l3 l3Var8 = this.C2;
        if (l3Var8 != null) {
            l3Var8.f(true);
        }
        gi.l3 l3Var9 = this.D2;
        if (l3Var9 != null) {
            l3Var9.f(true);
        }
        org.telegram.ui.Components.zo zoVar = this.K2;
        if (zoVar != null) {
            zoVar.f(true);
        }
        gi.l3 l3Var10 = this.Y0;
        if (l3Var10 != null) {
            l3Var10.f(true);
        }
        gi.l3 l3Var11 = this.f51238a1;
        if (l3Var11 != null) {
            l3Var11.f(true);
        }
        gi.l3 l3Var12 = this.Z0;
        if (l3Var12 != null) {
            l3Var12.f(true);
        }
    }

    public final boolean Ea(String str, org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, int i3, int i10) {
        ii.j4 j4Var;
        boolean z10;
        Integer num;
        int parseInt;
        int i11;
        Integer num2;
        TLRPC.TL_forumTopic f10;
        if (this.f51292e == null || str == null || this.f51325g4 != 0) {
            return false;
        }
        if (q1Var != null && (characterStyle != null || i10 != 1)) {
            j4Var = new ii.j4(this, i3, i10, characterStyle, q1Var);
        } else {
            j4Var = null;
        }
        if (!str.startsWith("tg:privatepost") && !str.startsWith("tg://privatepost")) {
            if (org.telegram.messenger.t3.K(this.f51292e, false) != null) {
                try {
                    if (f51230md == null) {
                        f51230md = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)/([0-9]+)/?([0-9]+)?");
                        f51231nd = Pattern.compile("(https://)?t.me/([0-9a-zA-Z_]+)\\?(voicechat+)");
                    }
                    Matcher matcher = f51230md.matcher(str);
                    if (matcher.find(2) && matcher.find(3)) {
                        z10 = false;
                        try {
                            if (org.telegram.messenger.t3.O(matcher.group(2), this.f51292e)) {
                                Uri parse = Uri.parse(str);
                                int intValue = Utilities.z(parse.getQueryParameter("thread")).intValue();
                                int intValue2 = Utilities.z(parse.getQueryParameter("comment")).intValue();
                                String queryParameter = parse.getQueryParameter("task");
                                if (queryParameter != null) {
                                    num = Utilities.z(queryParameter);
                                } else {
                                    num = null;
                                }
                                byte[] g7 = th.d.g(parse);
                                if (intValue == 0 && intValue2 == 0) {
                                    if (matcher.group(4) != null) {
                                        int parseInt2 = Integer.parseInt(matcher.group(3));
                                        parseInt = Integer.parseInt(matcher.group(4));
                                        i11 = parseInt2;
                                    } else {
                                        parseInt = Integer.parseInt(matcher.group(3));
                                        i11 = 0;
                                    }
                                    if (org.telegram.messenger.t3.c0(this.f51292e) && i11 != b()) {
                                        return false;
                                    }
                                    this.K7 = true;
                                    if (this.f51325g4 == 2) {
                                        this.f51379k9.T0(parseInt);
                                        finishFragment();
                                        return true;
                                    }
                                    int V = LaunchActivity.V(parse);
                                    this.P7 = V;
                                    if (V >= 0) {
                                        this.Q7 = parseInt;
                                    }
                                    xb(parseInt, i3, true, 0, false, 0, num, g7, j4Var);
                                    return true;
                                }
                                return false;
                            }
                        } catch (Exception e10) {
                            e = e10;
                            org.telegram.messenger.a8.g(e, true);
                            return z10;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!str.startsWith("tg:resolve") && !str.startsWith("tg://resolve")) {
                        Matcher matcher2 = f51231nd.matcher(str);
                        try {
                            if (matcher2.find(2) && matcher2.find(3)) {
                                if (org.telegram.messenger.t3.O(matcher2.group(2), this.f51292e)) {
                                    String queryParameter2 = Uri.parse(str).getQueryParameter("voicechat");
                                    if (!TextUtils.isEmpty(queryParameter2)) {
                                        this.f51543x8 = queryParameter2;
                                        c7(true);
                                        return true;
                                    }
                                    return z10;
                                }
                                return z10;
                            }
                            return z10;
                        } catch (Exception e11) {
                            org.telegram.messenger.a8.g(e11, true);
                            return z10;
                        }
                    }
                    Uri parse2 = Uri.parse(str.replace("tg:resolve", "tg://telegram.org").replace("tg://resolve", "tg://telegram.org"));
                    String lowerCase = parse2.getQueryParameter("domain").toLowerCase();
                    int intValue3 = Utilities.z(parse2.getQueryParameter("post")).intValue();
                    int intValue4 = Utilities.z(parse2.getQueryParameter("thread")).intValue();
                    int intValue5 = Utilities.z(parse2.getQueryParameter("comment")).intValue();
                    if (org.telegram.messenger.t3.O(lowerCase, this.f51292e) && intValue3 != 0 && intValue4 == 0 && intValue5 == 0) {
                        if (this.f51325g4 == 2) {
                            this.f51379k9.T0(intValue3);
                            finishFragment();
                            return true;
                        }
                        xb(intValue3, i3, true, 0, false, 0, null, null, j4Var);
                        return true;
                    }
                    return z10;
                } catch (Exception e12) {
                    e = e12;
                    z10 = false;
                }
            } else {
                try {
                    if (f51232od == null) {
                        f51232od = Pattern.compile("(https://)?t.me/c/([0-9]+)/([0-9]+)/?([0-9]+)?");
                    }
                    Matcher matcher3 = f51232od.matcher(str);
                    if (!matcher3.find(2) || !matcher3.find(3) || matcher3.group(4) != null) {
                        return false;
                    }
                    long parseLong = Long.parseLong(matcher3.group(2));
                    int parseInt3 = Integer.parseInt(matcher3.group(3));
                    if (parseLong != this.f51292e.f27001id || parseInt3 == 0) {
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
                    byte[] g10 = th.d.g(parse3);
                    if (intValue6 == 0 && intValue7 == 0 && intValue8 == 0) {
                        if (org.telegram.messenger.t3.c0(this.f51292e) && (f10 = getMessagesController().f23102q7.f(parseLong, parseInt3)) != null) {
                            TLRPC.TL_forumTopic tL_forumTopic = this.f51463r4;
                            if (tL_forumTopic == null || tL_forumTopic.f27053id != f10.f27053id) {
                                return false;
                            }
                            return true;
                        }
                        this.K7 = true;
                        if (this.f51325g4 == 2) {
                            this.f51379k9.T0(parseInt3);
                            finishFragment();
                            return true;
                        }
                        xb(parseInt3, i3, true, 0, false, 0, num2, g10, j4Var);
                        return true;
                    }
                    return false;
                } catch (Exception e13) {
                    org.telegram.messenger.a8.g(e13, true);
                    return false;
                }
            }
        } else {
            Uri parse4 = Uri.parse(str.replace("tg:privatepost", "tg://telegram.org").replace("tg://privatepost", "tg://telegram.org"));
            int intValue9 = Utilities.z(parse4.getQueryParameter("post")).intValue();
            long longValue = Utilities.A(parse4.getQueryParameter("channel")).longValue();
            int intValue10 = Utilities.z(parse4.getQueryParameter("thread")).intValue();
            long j10 = this.f51292e.f27001id;
            if (longValue != j10 || intValue9 == 0) {
                return false;
            }
            if (intValue10 != 0) {
                Aa(j10, null, intValue10, 0L, -1, 0, null);
                return true;
            }
            this.K7 = true;
            if (this.f51325g4 == 2) {
                this.f51379k9.T0(intValue9);
                finishFragment();
                return true;
            }
            xb(intValue9, i3, true, 0, false, 0, null, null, j4Var);
            return true;
        }
    }

    public final void Eb(ClipData clipData, boolean z10, int i3) {
        int i10 = 0;
        if (this.G5 != null) {
            while (i10 < clipData.getItemCount()) {
                Uri uri = clipData.getItemAt(i10).getUri();
                if (uri != null) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(uri);
                    Ib(i3, arrayList, z10);
                }
                i10++;
            }
            return;
        }
        ArrayList arrayList2 = new ArrayList();
        while (i10 < clipData.getItemCount()) {
            Uri uri2 = clipData.getItemAt(i10).getUri();
            if (uri2 != null) {
                arrayList2.add(uri2);
            }
            i10++;
        }
        Ib(i3, arrayList2, z10);
    }

    public final void Ec(boolean z10) {
        if (!getMessagesController().r2(this.f51376k6, b(), null)) {
            if (z10) {
                getNotificationsController().G(this.f51376k6, b(), true);
                return;
            }
            org.telegram.ui.ActionBar.t2 E = org.telegram.ui.Components.t4.E(this.f51376k6, b(), this, this.f51557ya);
            boolean T9 = T9();
            E.f28604i0 = T9;
            E.f28608n = T9;
            showDialog(E);
            return;
        }
        getNotificationsController().G(this.f51376k6, b(), false);
        if (!z10) {
            org.telegram.ui.Components.fc.z(this, 4, 0, this.f51557ya).j();
        }
    }

    @Override
    public final void F(float f10, int i3) {
        if (i3 == 2 && f10 == 0.0f) {
            th.b bVar = this.f51345hd;
            if (bVar != null) {
                this.m1.removeView(bVar);
                this.f51345hd = null;
            }
            mj mjVar = this.f51237a0;
            if (mjVar != null) {
                mjVar.G0();
            }
        }
    }

    public final void F6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.F6():void");
    }

    public final void F7() {
        int i3;
        wm wmVar = this.xa;
        if (wmVar != null) {
            wmVar.F7();
        }
        int L = org.telegram.messenger.g0.L(2.0f) + org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.f22602m + ((int) q9(org.telegram.messenger.g0.L(7.0f)));
        wj wjVar = this.D1;
        if (wjVar != null) {
            i3 = org.telegram.messenger.g0.L(wjVar.F * 35.0f);
        } else {
            i3 = 0;
        }
        int L2 = org.telegram.messenger.g0.L(T8() * 43.0f) + L + i3;
        int L3 = org.telegram.messenger.g0.L(60.0f) + ((int) this.f51520w.d());
        ci.j1 j1Var = this.f51241a4;
        if (j1Var != null) {
            j1Var.setPadding(0, L2, 0, L3);
        }
        org.telegram.ui.Components.p20 p20Var = this.I1;
        if (p20Var != null) {
            p20Var.f37037e.setPadding(0, L2, 0, L3);
            p20Var.d.setTranslationY((L2 - L3) / 2.0f);
        }
        ai.o2 o2Var = this.Z3;
        if (o2Var != null) {
            mh.f fVar = (mh.f) o2Var.f852b;
            fVar.setFadeZoneTop(L2);
            fVar.setFadeZoneBottom(L3);
        }
        org.telegram.ui.Components.iz izVar = this.f51461r2;
        if (izVar != null) {
            izVar.setTranslationY(L2);
        }
        org.telegram.ui.Components.zu0 zu0Var = this.f51473s2;
        if (zu0Var != null) {
            zu0Var.f41125a.setTranslationY(((L2 - L3) / 2.0f) + org.telegram.messenger.g0.L(32.0f));
        }
    }

    public final int F8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.F8():int");
    }

    public final void F9() {
        ValueAnimator valueAnimator = this.Db;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        org.telegram.ui.Cells.t0 t0Var = this.f51422o3;
        if (t0Var != null && t0Var.getTag() != null) {
            this.f51422o3.setTag(null);
            org.telegram.ui.Cells.t0 t0Var2 = this.f51422o3;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ofFloat.addUpdateListener(new qe(this, t0Var2, 1));
            ofFloat.addListener(new bh.j(15, this, t0Var2));
            ofFloat.setDuration(150L);
            this.Db = ofFloat;
            ofFloat.start();
        }
    }

    public final void Fa(org.telegram.messenger.zi ziVar) {
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = ziVar.f26868k.peer_id;
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
        bundle.putInt("message_id", ziVar.M1());
        bundle.putBoolean("need_remove_previous_same_chat_activity", false);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new wm(bundle));
        }
    }

    public final void Fb(ArrayList arrayList, String str, boolean z10, int i3, long j10, boolean z11) {
        long j11;
        if (t7()) {
            if (!TextUtils.isEmpty(str)) {
                org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(str, this.f51376k6, null, null, null, true, null, null, null, true, 0, 0, null, false);
                b10.K = W8();
                b10.O = j10;
                b10.L = z11;
                b10.Q = 0L;
                b10.R = h9();
                b10.T = this.f51540x5;
                org.telegram.messenger.yy.C(this.currentAccount).r0(b10);
                j11 = 0;
            } else {
                j11 = j10;
            }
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.wy g7 = org.telegram.messenger.wy.g((TLRPC.User) obj, this.f51376k6, null, null, null, null, z10, i3, 0);
                g7.K = W8();
                g7.O = j11;
                g7.L = z11;
                g7.Q = 0L;
                g7.R = h9();
                g7.T = this.f51540x5;
                getSendMessagesHelper().r0(g7);
                j11 = 0;
            }
            K6();
        }
    }

    public final void Fc(org.telegram.ui.ActionBar.o0 o0Var, boolean z10) {
        Set set;
        if (o0Var != null) {
            if (z10) {
                set = this.V0;
            } else {
                set = this.U0;
            }
            set.add(o0Var);
        }
    }

    @Override
    public final boolean G() {
        return false;
    }

    public final void G6(org.telegram.messenger.zi ziVar, org.telegram.messenger.zi ziVar2) {
        long E1 = ziVar.E1();
        if (E1 != 0) {
            a0.h hVar = this.N6;
            ArrayList arrayList = (ArrayList) hVar.f(E1);
            if (arrayList == null) {
                arrayList = org.telegram.messenger.k5.j(hVar, E1);
            }
            arrayList.add(ziVar);
            if (ziVar2 != null) {
                arrayList.remove(ziVar2);
            }
        }
    }

    public final void G7() {
        int i3;
        float f10 = (1.0f - this.f51291dd.f53840e) * (1.0f - this.f51264bd.f53840e);
        this.f51549y1.setTranslationX((1.0f - f10) * org.telegram.messenger.g0.L(80.0f));
        this.f51549y1.setAlpha(f10);
        mh.h hVar = this.f51549y1;
        if (f10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        hVar.setVisibility(i3);
    }

    public final boolean G9(boolean z10) {
        jk jkVar;
        jk jkVar2 = this.M2;
        if (jkVar2 == null || jkVar2.getTag() != null) {
            return false;
        }
        org.telegram.ui.Components.jg jgVar = this.f51252b1;
        if (jgVar != null && (jkVar = this.M2) != null) {
            jgVar.i(jkVar, false, z10);
        }
        int i3 = 0;
        while (true) {
            AnimatorSet[] animatorSetArr = this.W2;
            if (i3 < animatorSetArr.length) {
                AnimatorSet animatorSet = animatorSetArr[i3];
                if (animatorSet != null) {
                    animatorSet.cancel();
                    animatorSetArr[i3] = null;
                }
                i3++;
            } else {
                this.P2 = false;
                this.M2.setTag(1);
                return true;
            }
        }
    }

    public final void Ga(org.telegram.messenger.zi ziVar) {
        if (org.telegram.messenger.l10.B(this.f51306f)) {
            TLRPC.MessageFwdHeader messageFwdHeader = ziVar.f26868k.fwd_from;
            if (messageFwdHeader.saved_from_peer.user_id == this.f51306f.f27150id) {
                l(messageFwdHeader.saved_from_msg_id, ziVar.f1(), true, 0, true, 0);
                return;
            }
        }
        Bundle bundle = new Bundle();
        TLRPC.Peer peer = ziVar.f26868k.fwd_from.saved_from_peer;
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
        bundle.putInt("message_id", ziVar.f26868k.fwd_from.saved_from_msg_id);
        if (getMessagesController().E(bundle, this, null, null)) {
            presentFragment(new wm(bundle));
        }
    }

    public final void Gb(int i3, ArrayList arrayList, boolean z10, boolean z11) {
        String str;
        String str2;
        if (!arrayList.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                org.telegram.messenger.ye yeVar = (org.telegram.messenger.ye) obj;
                ?? obj2 = new Object();
                if (!yeVar.f25310b && (str2 = yeVar.h) != null) {
                    obj2.f26477c = str2;
                } else {
                    String str3 = yeVar.I;
                    if (str3 != null) {
                        obj2.f26477c = str3;
                    }
                }
                obj2.f26478e = yeVar.f25311c;
                obj2.f26479f = yeVar.f25314g;
                obj2.f26488p = yeVar.d();
                obj2.f26487o = yeVar.f25310b;
                obj2.f26489q = yeVar.j();
                obj2.f26497z = yeVar.f25319m;
                obj2.A = yeVar.P;
                CharSequence charSequence = yeVar.f25309a;
                if (charSequence != null) {
                    str = charSequence.toString();
                } else {
                    str = null;
                }
                obj2.d = str;
                obj2.f26481i = yeVar.f25320n;
                obj2.f26482j = yeVar.f25324r;
                obj2.h = yeVar.f25329x;
                obj2.f26483k = yeVar.f25325s;
                obj2.f26490r = yeVar.L;
                obj2.f26495x = yeVar.c();
                arrayList2.add(obj2);
                yeVar.e();
            }
            B8(((org.telegram.messenger.xy) arrayList2.get(0)).d, ((org.telegram.messenger.xy) arrayList2.get(0)).f26481i);
            org.telegram.messenger.yy.X(getAccountInstance(), arrayList2, this.f51376k6, this.E5, this.f51397m4, null, this.C5, z11, true, null, null, z10, i3, 0, ((org.telegram.messenger.xy) arrayList2.get(0)).f26492t, null, W8(), 0L, false, 0L, h9(), this.f51540x5, null, false);
            K6();
            mj mjVar = this.f51237a0;
            if (mjVar != null) {
                mjVar.setFieldText("");
            }
        }
        if (i3 != 0) {
            if (this.f51338h4 == -1) {
                this.f51338h4 = 0;
            }
            this.f51338h4 = arrayList.size() + this.f51338h4;
            id(true);
        }
    }

    public final void Gc(org.telegram.messenger.zi ziVar) {
        if (ziVar == null) {
            return;
        }
        org.telegram.ui.Components.ac acVar = this.P3;
        if (acVar != null) {
            acVar.c(0L, false);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.f51500u5);
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(Integer.valueOf(ziVar.f1()));
        int i3 = this.f51283d5;
        getNotificationCenter().k(org.telegram.messenger.hs.f23306t0, Long.valueOf(this.f51376k6), arrayList2, Boolean.FALSE, 0, 0, 0, Integer.valueOf(this.f51283d5 - 1), Boolean.valueOf(this.f51312f5));
        this.P3 = org.telegram.ui.Components.fc.B(this, false, new bi.q0(this, arrayList2, arrayList, i3, 17), new ge(this, ziVar, 7), this.f51557ya).j();
    }

    public final void H6() {
        if (getParentLayout() == null) {
            return;
        }
        org.telegram.ui.Components.b9.a(this, getParentLayout().getFragmentStack().indexOf(this), this.f51292e, this.f51306f, null, this.f51376k6, this.Pa, this.Oa);
    }

    public final void H7() {
        wm wmVar = this.xa;
        if (wmVar != null) {
            wmVar.H7();
        }
        float q92 = q9(org.telegram.messenger.g0.L(7.0f)) + this.actionBar.getMeasuredHeight() + org.telegram.messenger.g0.L(1.0f);
        if (this.f51323g2 != null) {
            q92 += r9(org.telegram.ui.Components.c11.f32501a);
        }
        if (this.D1 != null) {
            q92 += org.telegram.messenger.g0.L(35.0f) * this.D1.F;
        }
        this.Z.setFadeZoneTop((int) ((T8() * org.telegram.messenger.g0.L(43.0f)) + q92));
    }

    public final org.telegram.ui.Cells.z H8(int i3, boolean z10) {
        org.telegram.messenger.zi messageObject;
        wi wiVar = this.A0;
        if (wiVar != null) {
            int childCount = wiVar.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = this.A0.getChildAt(i10);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    messageObject = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    continue;
                }
                if (messageObject != null && messageObject.f1() == i3) {
                    if (z10) {
                        if (childAt.getY() + childAt.getMeasuredHeight() < (this.M9 - this.O9) - org.telegram.messenger.g0.L(4.0f) || childAt.getY() > this.A0.getMeasuredHeight() - this.Va) {
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

    public final void H9() {
        dk dkVar = this.f51558yb;
        if (dkVar == null) {
            return;
        }
        this.f51558yb = null;
        dkVar.e();
        if (dkVar.getReactionsWindow() != null && dkVar.getReactionsWindow().f8931a != null) {
            dkVar.getReactionsWindow().f8931a.animate().alpha(0.0f).setDuration(180L).start();
        }
        dkVar.animate().alpha(0.01f).translationY(-org.telegram.messenger.g0.L(12.0f)).scaleX(0.7f).scaleY(0.7f).withEndAction(new sc(19, this, dkVar)).setDuration(180L).start();
    }

    public final void Ha(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar) {
        org.telegram.ui.Cells.q1 q1Var2;
        boolean z10;
        long j10;
        long j11;
        org.telegram.ui.Components.t5 m10;
        Bitmap m11;
        if (q1Var == null) {
            int childCount = this.A0.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = this.A0.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.q1) {
                    q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                    if (q1Var2.getMessageObject().T(ziVar)) {
                        break;
                    }
                }
            }
        }
        q1Var2 = q1Var;
        if (org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            Hb(ziVar, true);
        }
        if (org.telegram.messenger.zi.M4(ziVar.f26868k) && !ziVar.E2(true) && org.telegram.messenger.az.B0 && ziVar.B() && !org.telegram.messenger.m5.C(org.telegram.messenger.zi.B0(ziVar.f26868k)) && !ziVar.f26917x0 && !ziVar.f26913w0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.w7 fileLoader = getFileLoader();
            TLRPC.Document F0 = ziVar.F0();
            fileLoader.getClass();
            org.telegram.messenger.w7.K.c(new org.telegram.messenger.fg(fileLoader, F0, ziVar, 22));
        }
        PhotoViewer.v1().N2(null, this, this.f51557ya);
        org.telegram.messenger.zi ziVar2 = MediaController.B().f21348v0;
        if (q1Var2 != null && ziVar2 != null && org.telegram.messenger.zi.M4(ziVar2.f26868k)) {
            getFileLoader().d0(ziVar2.F0(), false);
            if (ziVar2.T(ziVar) && (m10 = q1Var2.getPhotoImage().m()) != null && this.L8 != null && this.I8.getTag() != null && (m11 = m10.m()) != null) {
                try {
                    Bitmap bitmap = this.L8.getBitmap(m11.getWidth(), m11.getHeight());
                    new Canvas(m11).drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
                    bitmap.recycle();
                } catch (Throwable th2) {
                    org.telegram.messenger.a8.g(th2, true);
                }
            }
            MediaController.B().q(true, true, false, ziVar2.T(ziVar));
        }
        if (this.f51325g4 == 1 && (org.telegram.messenger.zi.M4(ziVar.f26868k) || ziVar.D == 1)) {
            PhotoViewer.v1().f41481m4 = this;
            ArrayList arrayList = new ArrayList();
            int size = this.L6.size();
            for (int i10 = 0; i10 < size; i10++) {
                org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) this.L6.get(i10);
                if (org.telegram.messenger.zi.M4(ziVar3.f26868k) || ziVar3.D == 1) {
                    arrayList.add(0, ziVar3);
                }
            }
            PhotoViewer.v1().e2(arrayList, arrayList.indexOf(ziVar), this.f51376k6, 0L, b(), this.f51248ab);
        } else {
            PhotoViewer v12 = PhotoViewer.v1();
            int i11 = ziVar.D;
            long j12 = 0;
            if (i11 != 0) {
                j10 = this.f51376k6;
            } else {
                j10 = 0;
            }
            if (i11 != 0) {
                j11 = this.f51272c7;
            } else {
                j11 = 0;
            }
            if (i11 != 0) {
                j12 = b();
            }
            if (!v12.i2(ziVar, this, j10, j11, j12, this.f51248ab) && z10) {
                getFileLoader().f(ziVar.F0());
            }
        }
        E9(false);
        MediaController.B().f21351w0 = null;
    }

    public final ge Hb(org.telegram.messenger.zi ziVar, boolean z10) {
        int i3;
        boolean z11;
        int i10;
        if (ziVar == null || ziVar.O3() || !ziVar.m4()) {
            return null;
        }
        TLRPC.Message message = ziVar.f26868k;
        if (message.destroyTime != 0 || (i3 = message.ttl) <= 0) {
            return null;
        }
        if (z10) {
            if (i3 != Integer.MAX_VALUE) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (i3 == Integer.MAX_VALUE) {
                i10 = 0;
            } else {
                i10 = i3;
            }
            message.destroyTime = getConnectionsManager().getCurrentTime() + i10;
            if (this.h != null) {
                getMessagesController().p3(this.f51376k6, i10, ziVar.f26868k.random_id);
                return null;
            }
            getMessagesController().q3(this.f51376k6, ziVar.f1(), null, i10, 0L, z11);
            return null;
        }
        return new ge(this, ziVar, 1);
    }

    public final void Hc() {
        boolean W9 = W9();
        SparseArray[] sparseArrayArr = this.f51412n6;
        if (!W9) {
            if (this.actionBar.v() && this.f51446q1 != null) {
                if (sparseArrayArr[0].size() != 0 || sparseArrayArr[1].size() != 0) {
                    this.f51446q1.c(org.telegram.messenger.bd.G(sparseArrayArr[1].size() + sparseArrayArr[0].size(), "MessagesSelected", new Object[0]), true, true);
                    return;
                }
                return;
            }
            return;
        }
        int size = sparseArrayArr[1].size() + sparseArrayArr[0].size();
        if (size == 0) {
            this.E0.setText(org.telegram.messenger.bd.M0(2131746223, null));
            this.E0.setAlpha(0.5f);
            this.E0.setEnabled(false);
            return;
        }
        this.E0.setText(org.telegram.messenger.bd.a0(null, null, 2131746224, org.telegram.messenger.bd.G(size, "messages", new Object[0])));
        this.E0.setAlpha(1.0f);
        this.E0.setEnabled(true);
    }

    public final void I6(org.telegram.messenger.zi ziVar, boolean z10) {
        J6(ziVar, z10, true);
    }

    public final void I7() {
        if (this.f51252b1 != null) {
            this.f51252b1.setPadding(org.telegram.messenger.g0.L(7.0f) + ((int) ((1.0f - T8()) * (1.0f - this.f51291dd.f53840e) * l9())), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f), org.telegram.messenger.g0.L(7.0f));
        }
    }

    public final org.telegram.ui.Cells.t0 I8(TL_wallet.walletTransaction wallettransaction) {
        if (this.A0 != null && this.D0 != null) {
            for (int i3 = 0; i3 < this.A0.getChildCount(); i3++) {
                View childAt = this.A0.getChildAt(i3);
                if (childAt instanceof org.telegram.ui.Cells.t0) {
                    org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                    if (org.telegram.ui.Wallet.k0.I(t0Var.getMessageObject(), wallettransaction)) {
                        return t0Var;
                    }
                }
            }
            int i10 = 0;
            while (true) {
                ArrayList arrayList = this.L6;
                if (i10 >= arrayList.size()) {
                    break;
                } else if (org.telegram.ui.Wallet.k0.I((org.telegram.messenger.zi) arrayList.get(i10), wallettransaction)) {
                    this.A0.C0();
                    this.C0.h1(this.D0.K + i10, 0);
                    return null;
                } else {
                    i10++;
                }
            }
        }
        return null;
    }

    public final void I9() {
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.d(0, true);
        }
        org.telegram.ui.Components.ac acVar = this.P3;
        if (acVar != null) {
            acVar.c(0L, false);
        }
        ik ikVar = this.O3;
        if (ikVar != null) {
            ikVar.d(0, true);
        }
    }

    public final void Ia(boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var;
        int i3;
        if (getParentActivity() != null && (q4Var = this.parentLayout) != null && q4Var.getLastFragment() == this && !this.U4.isEmpty()) {
            Bundle bundle = new Bundle();
            TLRPC.Chat chat = this.f51292e;
            if (chat != null) {
                bundle.putLong("chat_id", chat.f27001id);
            } else {
                bundle.putLong("user_id", this.f51306f.f27150id);
            }
            bundle.putInt("chatMode", 2);
            wm wmVar = new wm(bundle);
            wmVar.U4 = new ArrayList(this.U4);
            wmVar.W4 = new HashMap(this.W4);
            int size = this.U4.size();
            for (int i10 = 0; i10 < size; i10++) {
                Integer num = (Integer) this.U4.get(i10);
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) this.W4.get(num);
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) this.F6[0].get(num.intValue());
                if (ziVar == null) {
                    ziVar = ziVar2;
                } else if (ziVar2 != null) {
                    ziVar.f26917x0 = ziVar2.f26917x0;
                    ziVar.f26913w0 = ziVar2.f26913w0;
                }
                if (ziVar != null) {
                    wmVar.W4.put(num, ziVar);
                    wmVar.dd();
                }
            }
            wmVar.f51270c5 = this.f51270c5;
            if (this.f51525w4) {
                i3 = this.U4.size();
            } else {
                i3 = this.f51283d5;
            }
            wmVar.f51283d5 = i3;
            wmVar.f51312f5 = this.f51312f5;
            wmVar.f51466r8 = this.f51466r8;
            wmVar.f51453q8 = this.f51453q8;
            wmVar.f51379k9 = new nk(this, wmVar);
            if (z10) {
                presentFragmentAsPreview(wmVar);
                r7();
                return;
            }
            presentFragment(wmVar, false);
        }
    }

    public final void Ib(int i3, ArrayList arrayList, boolean z10) {
        String str;
        ArrayList arrayList2 = null;
        ArrayList arrayList3 = null;
        ArrayList arrayList4 = null;
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            Uri uri = (Uri) arrayList.get(i10);
            String uri2 = uri.toString();
            if (uri2.contains("com.google.android.apps.photos.contentprovider")) {
                try {
                    String str2 = uri2.split("/1/")[1];
                    int indexOf = str2.indexOf("/ACTUAL");
                    if (indexOf != -1) {
                        uri = Uri.parse(URLDecoder.decode(str2.substring(0, indexOf), "UTF-8"));
                    }
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
            }
            if (!org.telegram.messenger.r2.f25041b) {
                if (arrayList4 == null) {
                    arrayList4 = new ArrayList();
                }
                ArrayList arrayList5 = arrayList4;
                arrayList5.add(uri);
                arrayList4 = arrayList5;
            } else {
                String T0 = org.telegram.messenger.g0.T0(uri);
                if (T0 == null) {
                    String uri3 = uri.toString();
                    String t10 = MediaController.t(-1L, uri, "file");
                    if (t10 == null) {
                        Wb();
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
                arrayList2.add(T0);
                arrayList3.add(str);
            }
        }
        if (arrayList2 == null && arrayList4 == null) {
            return;
        }
        C8();
        org.telegram.messenger.yy.V(i3, this.f51376k6, 0L, 0L, 0L, null, null, arrayList2, arrayList3, arrayList4, null, null, null, getAccountInstance(), this.E5, this.f51397m4, this.G5, null, W8(), null, this.C5, null, null, z10, false);
        B9(false);
    }

    public final void Ic() {
        Drawable s02;
        kl klVar = this.m1;
        if (klVar != null && this.f51531wa == null) {
            if (this.f51557ya.h == null || klVar.getBackgroundImage() == null) {
                if (this.m1.getBackgroundImage() == null || org.telegram.messenger.g0.Q1()) {
                    if (Q9()) {
                        s02 = this.m1.getCompactBackground();
                    } else {
                        s02 = org.telegram.ui.ActionBar.k6.s0();
                    }
                    kl klVar2 = this.m1;
                    if (!Q9()) {
                        boolean z10 = org.telegram.ui.ActionBar.k6.f27967i0;
                    }
                    klVar2.U(s02);
                }
            }
        }
    }

    @Override
    public final boolean J() {
        return this.f51567z8;
    }

    public final void J6(org.telegram.messenger.zi r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.J6(org.telegram.messenger.zi, boolean, boolean):void");
    }

    public final void J7() {
        float f10 = this.Q9;
        wj wjVar = this.D1;
        if (wjVar != null) {
            wjVar.setTranslationY(f10);
            f10 += org.telegram.messenger.g0.L(35.0f) * this.D1.F;
        }
        jj jjVar = this.E1;
        if (jjVar != null) {
            jjVar.setTranslationY(f10);
        }
        float T8 = (T8() * org.telegram.messenger.g0.L(43.0f)) + f10;
        org.telegram.ui.Components.g11 g11Var = this.f51323g2;
        org.telegram.ui.Components.c11 c11Var = org.telegram.ui.Components.c11.f32501a;
        if (g11Var != null) {
            g11Var.setSideMenuBackgroundMarginTop((T8() * q9(org.telegram.messenger.g0.L(7.0f))) + T8);
            float r9 = r9(c11Var);
            float a10 = b8.v9.a(this.f51291dd.f53840e);
            float T82 = T8();
            T8 += b8.v9.a(Math.min(b8.be.a(b8.v9.a(a10), 0.0f, 1.0f), b8.be.a(b8.v9.a(T82), 0.0f, 1.0f))) * r9;
        }
        org.telegram.ui.Components.jg jgVar = this.f51252b1;
        if (jgVar != null) {
            jgVar.setTranslationY((T8 - org.telegram.messenger.g0.L(5.0f)) - (T8() * r9(c11Var)));
        }
    }

    public final void J8() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.J8():void");
    }

    public final void J9() {
        boolean z10;
        jd(0, 0, -1);
        getMediaDataController().X1(this.I3, this.f51376k6, this.f51272c7, this.classGuid, 0, this.f51475s4, false, this.D3, this.E3, true, this.F3);
        if (TextUtils.isEmpty(this.I3) && this.F3 == null) {
            z10 = false;
        } else {
            z10 = true;
        }
        this.H3 = z10;
        this.f51459r0 = z10;
        Lc(false);
        md();
    }

    public final void Ja(int i3, boolean z10) {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && q4Var.getLastFragment() == this) {
            Bundle bundle = new Bundle();
            TLRPC.EncryptedChat encryptedChat = this.h;
            if (encryptedChat != null) {
                bundle.putInt("enc_id", encryptedChat.f27009id);
            } else {
                TLRPC.Chat chat = this.f51292e;
                if (chat != null) {
                    bundle.putLong("chat_id", chat.f27001id);
                } else {
                    bundle.putLong("user_id", this.f51306f.f27150id);
                }
            }
            bundle.putInt("chatMode", 1);
            if (z10) {
                bundle.putInt("converting_toast_from", i3);
                bundle.putBoolean("converting_toast", true);
            }
            wm wmVar = new wm(bundle);
            if (this.f51525w4) {
                rg.c.a(wmVar, org.telegram.messenger.pr.a(a(), b()));
            }
            wmVar.f51379k9 = new si(this);
            presentFragment(wmVar, false);
        }
    }

    public final void Jb(org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.q1 q1Var, int i3, boolean z10) {
        boolean z11;
        org.telegram.messenger.ui s92 = s9(ziVar);
        boolean z12 = false;
        if (s92 != null) {
            ArrayList arrayList = s92.d;
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    if (this.f51412n6[i3].indexOfKey(((org.telegram.messenger.zi) arrayList.get(i10)).f1()) < 0) {
                        break;
                    }
                    i10++;
                } else {
                    s92 = null;
                    break;
                }
            }
        }
        if (s92 == null) {
            z11 = true;
        } else {
            z11 = false;
        }
        q1Var.setDrawSelectionBackground(z11);
        if (s92 == null) {
            z12 = true;
        }
        q1Var.j3(true, z12, z10);
    }

    public final void Jc() {
        TLRPC.User user;
        boolean z10;
        if (this.f51359j0 != null && (user = this.f51306f) != null && this.h == null && user.bot) {
            a0.h hVar = this.f51503u8;
            boolean z11 = false;
            if (hVar.m() != 0) {
                boolean z12 = false;
                z10 = false;
                for (int i3 = 0; i3 < hVar.m(); i3++) {
                    TL_bots.BotInfo botInfo = (TL_bots.BotInfo) hVar.n(i3);
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
                this.f51359j0.S(30);
            } else {
                this.f51359j0.t(30);
            }
            if (z10) {
                this.f51359j0.S(31);
            } else {
                this.f51359j0.t(31);
            }
        }
    }

    public final void K6() {
        this.f51540x5 = null;
        if (this.f51475s4 == 0 || this.f51525w4) {
            if (this.f51525w4) {
                this.E5 = this.f51397m4;
            } else {
                this.E5 = null;
            }
            this.C5 = null;
            mj mjVar = this.f51237a0;
            if (mjVar != null) {
                mjVar.k1(null, null, null);
            }
        }
        B9(false);
        if (this.f51325g4 == 0) {
            getMediaDataController().D(this.f51376k6, this.f51475s4, true);
        }
    }

    public final void K7() {
        ArrayList arrayList;
        TLRPC.MessageFwdHeader messageFwdHeader;
        int i3;
        org.telegram.messenger.zi ziVar;
        TLRPC.MessageReplies messageReplies;
        int indexOf;
        SparseArray sparseArray = this.M6;
        if (sparseArray.size() != 0) {
            int size = sparseArray.size();
            ArrayList arrayList2 = null;
            int i10 = 0;
            a0.h hVar = null;
            ArrayList arrayList3 = null;
            int i11 = 0;
            while (true) {
                arrayList = this.L6;
                if (i11 >= size) {
                    break;
                }
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) sparseArray.valueAt(i11);
                if (ziVar2.C != null) {
                    if (arrayList2 == null) {
                        arrayList2 = new ArrayList();
                    }
                    arrayList2.add(Integer.valueOf(sparseArray.keyAt(i11)));
                    if (!(ziVar2.f26868k.action instanceof TLRPC.TL_messageActionPinMessage) && (messageFwdHeader = ziVar2.C.f26868k.fwd_from) != null && org.telegram.messenger.zi.C1(messageFwdHeader.saved_from_peer) == this.f51376k6 && (i3 = ziVar2.C.f26868k.fwd_from.channel_post) != 0 && (ziVar = (org.telegram.messenger.zi) this.F6[i10].get(i3)) != null && (messageReplies = ziVar.f26868k.replies) != null) {
                        messageReplies.replies++;
                        ziVar.f26861i1 = true;
                        TLRPC.Message message = ziVar2.f26868k;
                        TLRPC.Peer peer = message.from_id;
                        if (peer == null) {
                            peer = message.peer_id;
                        }
                        int size2 = messageReplies.recent_repliers.size();
                        int i12 = i10;
                        while (true) {
                            if (i12 >= size2) {
                                break;
                            } else if (org.telegram.messenger.zi.C1(ziVar.f26868k.replies.recent_repliers.get(i12)) == org.telegram.messenger.zi.C1(peer)) {
                                ziVar.f26868k.replies.recent_repliers.remove(i12);
                                break;
                            } else {
                                i12++;
                            }
                        }
                        ziVar.f26868k.replies.recent_repliers.add(i10, peer);
                        if (!ziVar2.O3()) {
                            ziVar.f26868k.replies.max_id = ziVar2.f1();
                        }
                        org.telegram.messenger.qr messagesStorage = getMessagesStorage();
                        long j10 = this.f51292e.f27001id;
                        int f12 = ziVar.f1();
                        TLRPC.MessageReplies messageReplies2 = ziVar.f26868k.replies;
                        messagesStorage.f24934a.c(new org.telegram.messenger.d8(messagesStorage, f12, j10, 1, messageReplies2.recent_repliers, messageReplies2.max_id));
                        if (ziVar.A2()) {
                            org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) this.O6.f(ziVar.d1());
                            if (uiVar != null) {
                                ArrayList arrayList4 = uiVar.d;
                                if (hVar == null) {
                                    hVar = new a0.h();
                                }
                                hVar.k(uiVar, uiVar.f25699a);
                                int size3 = arrayList4.size();
                                for (int i13 = 0; i13 < size3; i13++) {
                                    ((org.telegram.messenger.zi) arrayList4.get(i13)).f26861i1 = true;
                                }
                            }
                        } else if (this.D0 != null && (indexOf = arrayList.indexOf(ziVar)) >= 0) {
                            if (arrayList3 == null) {
                                arrayList3 = new ArrayList();
                            }
                            arrayList3.add(Integer.valueOf(indexOf + this.D0.K));
                        }
                    }
                }
                i11++;
                i10 = 0;
            }
            if (arrayList2 != null) {
                int size4 = arrayList2.size();
                for (int i14 = 0; i14 < size4; i14++) {
                    sparseArray.remove(((Integer) arrayList2.get(i14)).intValue());
                }
            }
            if (this.D0 != null) {
                if (hVar != null) {
                    int m10 = hVar.m();
                    for (int i15 = 0; i15 < m10; i15++) {
                        org.telegram.messenger.ui uiVar2 = (org.telegram.messenger.ui) hVar.n(i15);
                        int indexOf2 = arrayList.indexOf((org.telegram.messenger.zi) k2.p1.h(1, uiVar2.d));
                        if (indexOf2 >= 0) {
                            fl flVar = this.D0;
                            if (!flVar.O) {
                                flVar.k(indexOf2 + flVar.K, uiVar2.d.size());
                            }
                        }
                    }
                }
                if (arrayList3 != null && !this.D0.O) {
                    int size5 = arrayList3.size();
                    for (int i16 = 0; i16 < size5; i16++) {
                        this.D0.g(((Integer) arrayList3.get(i16)).intValue());
                    }
                }
            }
        }
    }

    public final boolean K8() {
        boolean z10;
        org.telegram.messenger.ui currentMessagesGroup;
        int childCount = this.A0.getChildCount();
        HashMap hashMap = null;
        int i3 = 0;
        while (true) {
            z10 = true;
            if (i3 >= childCount) {
                break;
            }
            View childAt = this.A0.getChildAt(i3);
            if ((childAt instanceof org.telegram.ui.Cells.q1) && (currentMessagesGroup = ((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup()) != null && currentMessagesGroup.f25700b && !currentMessagesGroup.d.isEmpty()) {
                if (hashMap == null) {
                    hashMap = new HashMap();
                }
                if (!hashMap.containsKey(Long.valueOf(currentMessagesGroup.f25699a))) {
                    hashMap.put(Long.valueOf(currentMessagesGroup.f25699a), currentMessagesGroup);
                    int indexOf = this.L6.indexOf((org.telegram.messenger.zi) k2.p1.h(1, currentMessagesGroup.d));
                    if (indexOf >= 0) {
                        fl flVar = this.D0;
                        flVar.k(indexOf + flVar.K, currentMessagesGroup.d.size());
                        this.A0.setItemAnimator(null);
                    }
                }
            }
            i3++;
        }
        if (!org.telegram.messenger.g0.Q1()) {
            return true;
        }
        if (org.telegram.messenger.g0.P1() && org.telegram.messenger.t0.f25457b.getResources().getConfiguration().orientation == 1) {
            this.actionBar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(false));
            return false;
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var != null && !q4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(0) != this && this.parentLayout.getFragmentStack().size() != 1) {
            z10 = false;
        }
        kVar.setBackButtonDrawable(new org.telegram.ui.ActionBar.w1(z10));
        return false;
    }

    public final void K9() {
        if (!this.X9) {
            this.X9 = true;
            kl klVar = this.m1;
            if (klVar != null) {
                klVar.invalidate();
            }
            wi wiVar = this.A0;
            if (wiVar != null) {
                wiVar.invalidate();
            }
        }
        UndoView undoView = this.N3;
        if (undoView != null) {
            undoView.setAdditionalTranslationY(r9(org.telegram.ui.Components.c11.f32503c) + this.U.getInputBubbleHeight() + this.f51520w.d() + org.telegram.messenger.g0.L(16.0f));
        }
        J7();
    }

    public final void Ka(TLRPC.Chat chat) {
        boolean z10;
        gi.l3 l3Var = this.K1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        gi.l3 l3Var2 = this.L1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new sc(13, this, chat), 200L);
            return;
        }
        if (!this.actionBar.f27728o0) {
            this.f51305ed.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var = this.f51359j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar = this.f51321g0;
            if (wVar != null) {
                wVar.e(8);
            }
            ar arVar = this.f51307f0;
            if (arVar != null) {
                arVar.b(false);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f51371k0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f51432p0;
            if (q0Var3 != null && this.ea) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar2 = this.f51445q0;
            if (wVar2 != null && this.f51317fa) {
                wVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f51383l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f51459r0 = true;
            jd(0, 0, -1);
            Lc(false);
            ImageView imageView = this.f51337h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f51371k0;
        if (q0Var6 != null) {
            this.Hc = true;
            this.f51364j5 = false;
            q0Var6.F(false);
            this.Hc = false;
        }
        zb(chat, null);
        cd(0, true);
    }

    public final void Kb(TLRPC.ChatTheme chatTheme) {
        boolean z10;
        boolean z11;
        if (this.f51557ya != null && this.f51531wa == null) {
            jg.b c2 = jg.b.c(chatTheme);
            org.telegram.messenger.d4 f10 = org.telegram.messenger.d4.f(this.currentAccount);
            f10.s(this.f51376k6, jg.b.c(chatTheme), chatTheme, false);
            if (chatTheme instanceof TLRPC.TL_chatThemeUniqueGift) {
                f10.p(chatTheme);
                org.telegram.ui.ActionBar.p3 i3 = f10.i(c2);
                if (i3 == null) {
                    i3 = new org.telegram.ui.ActionBar.p3(this.currentAccount, (TLRPC.TL_chatThemeUniqueGift) chatTheme);
                    i3.k();
                    i3.m(this.currentAccount);
                }
                org.telegram.ui.ActionBar.p3 p3Var = i3;
                um umVar = this.f51557ya;
                TLRPC.WallPaper wallPaper = umVar.f50125g;
                if (this.f51327g6 != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                umVar.r(p3Var, wallPaper, z11, null, false);
                return;
            }
            if (c2 != null && !c2.b()) {
                de deVar = new de(this, 14);
                String str = c2.f16249b;
                if (c2.b()) {
                    deVar.onComplete(null);
                } else if (!TextUtils.isEmpty(str)) {
                    org.telegram.ui.ActionBar.p3 p3Var2 = (org.telegram.ui.ActionBar.p3) f10.f22143e.get(str);
                    if (p3Var2 != null) {
                        p3Var2.k();
                        deVar.onComplete(p3Var2);
                    } else {
                        deVar.onComplete(null);
                    }
                } else {
                    f10.q(new org.telegram.messenger.c4(c2, deVar), false);
                }
            }
            TLRPC.WallPaper d = f10.d(this.f51376k6);
            um umVar2 = this.f51557ya;
            org.telegram.ui.ActionBar.p3 p3Var3 = umVar2.f50124f;
            if (this.f51327g6 != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            umVar2.r(p3Var3, d, z10, null, false);
        }
    }

    public final void Kc() {
        if (this.f51323g2 == null) {
            return;
        }
        this.f51323g2.setSideMenuBackgroundMarginBottom(((this.U.getInputBubbleHeight() + org.telegram.messenger.g0.L(9.0f)) - org.telegram.messenger.g0.L(5.0f)) + this.f51520w.d());
    }

    @Override
    public final long L() {
        return this.f51272c7;
    }

    public final void L6(org.telegram.messenger.zi ziVar) {
        if (getParentActivity() == null) {
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f51557ya);
        String M0 = org.telegram.messenger.bd.M0(2131689472, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
        if (ziVar.D == 3) {
            s1Var.U = org.telegram.messenger.bd.M0(2131748186, null);
        } else {
            s1Var.U = org.telegram.messenger.bd.a0("NoHandleAppInstalled", null, 2131748213, ziVar.F0().mime_type);
        }
        showDialog(s1Var);
    }

    public final void L7(boolean z10) {
        boolean z11;
        this.L6.clear();
        this.I6.clear();
        this.J6.clear();
        this.f51554y6.clear();
        this.O6.b();
        this.f51539x4 = false;
        fl flVar = this.D0;
        if (flVar != null) {
            if (flVar.f45300x < 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            sc(z11);
        }
        wi wiVar = this.A0;
        if (wiVar != null) {
            wiVar.setEmptyView(null);
        }
        for (int i3 = 0; i3 < 2; i3++) {
            this.F6[i3].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr = this.Q6;
            int[] iArr2 = this.P6;
            if (encryptedChat == null) {
                iArr2[i3] = Integer.MAX_VALUE;
                iArr[i3] = Integer.MIN_VALUE;
            } else {
                iArr2[i3] = Integer.MIN_VALUE;
                iArr[i3] = Integer.MAX_VALUE;
            }
            this.R6[i3] = Integer.MIN_VALUE;
            this.S6[i3] = 0;
            this.T6[i3] = false;
            this.U6[i3] = false;
            this.V6[i3] = true;
        }
        if (z10) {
            this.X7 = true;
            this.Y6 = true;
            this.X6 = true;
            this.Z7 = false;
        }
        this.f51375k5 = false;
        this.L7 = 0;
        this.K7 = false;
        this.f51258b7 = 0;
        this.f51245a8 = null;
        this.U7 = 0;
        this.V7 = false;
        this.R7 = false;
        fl flVar2 = this.D0;
        if (flVar2 != null && !flVar2.O) {
            flVar2.O(false);
        }
    }

    public final void L8(ArrayList arrayList, boolean z10, boolean z11, boolean z12, int i3, long j10) {
        boolean z13;
        if (!arrayList.isEmpty() && t7()) {
            boolean z14 = false;
            if (i3 != 0) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (this.f51325g4 == 1) {
                z14 = true;
            }
            if (z13 == z14) {
                this.I9 = true;
                fl flVar = this.D0;
                if (flVar != null) {
                    flVar.K(true);
                }
            }
            int q02 = getSendMessagesHelper().q0(arrayList, this.f51376k6, z10, z11, z12, i3, 0, this.f51397m4, -1, j10, h9(), this.f51540x5);
            org.telegram.ui.Components.t4.s0(q02, this, this.f51557ya);
            if (q02 != 0) {
                org.telegram.messenger.g0.h3(new xe(this, 25));
            }
        }
    }

    public final void L9() {
        boolean z10;
        Rect rect;
        if (this.m1 != null) {
            if (this.f51430ob <= 0 && this.f51443pb <= 0) {
                z10 = false;
            } else {
                z10 = true;
            }
            ri riVar = this.f51520w;
            float c2 = riVar.c();
            qe.k kVar = riVar.f54730b;
            int max = (int) Math.max(0.0f, (c2 * kVar.f53866a) - org.telegram.messenger.g0.L(29.0f));
            kl klVar = this.m1;
            ai.x2 x2Var = klVar.M;
            Rect rect2 = this.f51358id;
            if (x2Var != null) {
                rect2.set(0, 0, klVar.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                this.m1.M.setClipBounds(rect2);
            }
            if (this.A0 != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - max);
                rect2.offset(0, -this.A0.getTop());
                wi wiVar = this.A0;
                if (wiVar.Y0()) {
                    rect = null;
                } else {
                    rect = rect2;
                }
                wiVar.setClipBounds(rect);
            }
            if (this.Z != null) {
                rect2.set(0, 0, this.m1.getMeasuredWidth(), this.m1.getMeasuredHeight() - ((int) Math.max(0.0f, Math.min(riVar.f54737w, riVar.c() * kVar.f53866a) - org.telegram.messenger.g0.L(29.0f))));
                mh.f fVar = this.Z;
                if (z10) {
                    rect2 = null;
                }
                fVar.setClipBounds(rect2);
            }
        }
    }

    public final void La(String str) {
        boolean z10;
        boolean z11;
        String str2;
        int i3;
        org.telegram.ui.ActionBar.q0 q0Var;
        int i10;
        gi.l3 l3Var = this.K1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        gi.l3 l3Var2 = this.L1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new fe(this, str, 4), 200L);
            return;
        }
        if (!this.actionBar.f27728o0) {
            this.f51305ed.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f51359j0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar = this.f51321g0;
            if (wVar != null) {
                wVar.e(8);
            }
            ar arVar = this.f51307f0;
            if (arVar != null) {
                arVar.b(false);
            }
            if ((this.f51475s4 == 0 || (i10 = this.f51325g4) == 3 || i10 == 8) && (q0Var = this.f51371k0) != null) {
                q0Var.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f51432p0;
            if (q0Var3 != null && this.ea) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar2 = this.f51445q0;
            if (wVar2 != null && this.f51317fa) {
                wVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f51383l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f51459r0 = true;
            jd(0, 0, -1);
            Lc(false);
        }
        if ((this.f51475s4 == 0 || this.f51525w4 || (i3 = this.f51325g4) == 3 || i3 == 8) && !org.telegram.messenger.l10.z(this.f51306f)) {
            if (str == null) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f51364j5 = z11;
            org.telegram.ui.ActionBar.q0 q0Var6 = this.f51371k0;
            if (q0Var6 != null) {
                q0Var6.F(z11);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var7 = this.f51371k0;
        if (q0Var7 != null) {
            q0Var7.P(str, false);
        }
        org.telegram.messenger.li mediaDataController = getMediaDataController();
        if (str == null) {
            str2 = "";
        } else {
            str2 = str;
        }
        this.I3 = str2;
        mediaDataController.X1(str2, this.f51376k6, this.f51272c7, this.classGuid, 0, this.f51475s4, false, this.D3, this.E3, !TextUtils.isEmpty(str), this.F3);
        cd(0, true);
    }

    public final void Lb(View view, boolean z10) {
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i3 = 0; i3 < viewGroup.getChildCount(); i3++) {
                Lb(viewGroup.getChildAt(i3), z10);
            }
        }
        if (view != this.A0 && view != this.m1) {
            view.setEnabled(z10);
        }
    }

    public final void Lc(boolean r36) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Lc(boolean):void");
    }

    public final void M6(boolean z10, boolean z11) {
        long j10;
        TLRPC.DraftMessage R;
        Long l10;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j11;
        mm mmVar;
        org.telegram.messenger.zi ziVar;
        TLRPC.TL_forumTopic f10;
        TLRPC.Message message2;
        org.telegram.messenger.zi ziVar2;
        mm mmVar2;
        String str;
        int Y;
        mm mmVar3;
        TLRPC.SuggestedPost suggestedPost;
        String str2;
        long j12;
        org.telegram.ui.Components.ty0 ty0Var;
        Paint.FontMetricsInt fontMetricsInt;
        org.telegram.ui.Components.p5 p5Var;
        TLRPC.InputReplyTo inputReplyTo;
        long j13;
        TLRPC.Message message3;
        Pair pair;
        Long l11;
        TLRPC.DraftMessage draftMessage;
        if (this.f51237a0 != null) {
            int i3 = this.f51325g4;
            char c2 = '\b';
            if (i3 == 0 || i3 == 8 || (i3 == 3 && getUserConfig().e() == c9())) {
                long j14 = 0;
                if (this.f51325g4 == 8) {
                    if (org.telegram.messenger.t3.p0(this.f51292e)) {
                        if (this.f51475s4 == 0 && org.telegram.messenger.t3.A(this.currentAccount, this.f51292e, 24)) {
                            return;
                        }
                    } else {
                        return;
                    }
                }
                org.telegram.ui.Components.ty0 ty0Var2 = null;
                ?? r72 = 0;
                if (R9()) {
                    a0.h hVar = (a0.h) getMediaDataController().f24050s1.f(this.f51376k6);
                    if (hVar != null && hVar.m() > 0) {
                        pair = new Pair(Long.valueOf(hVar.j(0)), hVar.n(0));
                    } else {
                        pair = null;
                    }
                    if (pair != null) {
                        l11 = (Long) pair.first;
                        draftMessage = (TLRPC.DraftMessage) pair.second;
                    } else {
                        l11 = null;
                        draftMessage = null;
                    }
                    R = draftMessage;
                    l10 = l11;
                } else {
                    org.telegram.messenger.li mediaDataController = getMediaDataController();
                    long j15 = this.f51376k6;
                    if (this.f51325g4 == 3) {
                        j10 = 0;
                    } else {
                        j10 = this.f51475s4;
                    }
                    R = mediaDataController.R(j15, j10);
                    l10 = null;
                }
                mj mjVar = this.f51237a0;
                if (R != null) {
                    richMessage = R.rich_message;
                } else {
                    richMessage = null;
                }
                mjVar.setRichDraftPreview(richMessage);
                org.telegram.messenger.gi S = org.telegram.messenger.li.b0(this.currentAccount).S(this.f51376k6, b());
                if (R != null && (inputReplyTo = R.reply_to) != null && inputReplyTo.reply_to_msg_id != 0) {
                    org.telegram.messenger.li mediaDataController2 = getMediaDataController();
                    long j16 = this.f51376k6;
                    if (l10 != null) {
                        j13 = l10.longValue();
                    } else {
                        j13 = this.f51475s4;
                    }
                    a0.h hVar2 = (a0.h) mediaDataController2.f24052t1.f(j16);
                    if (hVar2 == null) {
                        message3 = null;
                    } else {
                        message3 = (TLRPC.Message) hVar2.f(j13);
                    }
                    message = message3;
                } else {
                    message = null;
                }
                if ((!z11 || R == null) && this.f51237a0.getFieldText() != null && (this.f51325g4 != 0 || getUserConfig().e() != a() || R == null || this.Cc >= R.date)) {
                    if (z10 && R == null) {
                        this.f51237a0.setFieldText("");
                        this.f51237a0.setEffectId(0L);
                        B9(true);
                    }
                } else if (S != null) {
                    this.f51237a0.setVoiceDraft(S);
                } else if (R != null) {
                    this.Cc = R.date;
                    mj mjVar2 = this.f51237a0;
                    mjVar2.Y2 = null;
                    mjVar2.Z2 = !R.no_webpage;
                    if (!R.entities.isEmpty()) {
                        ?? valueOf = SpannableStringBuilder.valueOf(R.message);
                        Collections.sort(R.entities, org.telegram.messenger.li.f24006e2);
                        int i10 = 0;
                        while (i10 < R.entities.size()) {
                            TLRPC.MessageEntity messageEntity = R.entities.get(i10);
                            boolean z12 = messageEntity instanceof TLRPC.TL_inputMessageEntityMentionName;
                            char c10 = c2;
                            long j17 = j14;
                            if (!z12 && !(messageEntity instanceof TLRPC.TL_messageEntityMentionName)) {
                                if (!(messageEntity instanceof TLRPC.TL_messageEntityCode) && !(messageEntity instanceof TLRPC.TL_messageEntityPre)) {
                                    if (messageEntity instanceof TLRPC.TL_messageEntityBold) {
                                        ?? obj = new Object();
                                        obj.f38578a |= 1;
                                        org.telegram.ui.Components.uy0 uy0Var = new org.telegram.ui.Components.uy0(obj, r72);
                                        int i11 = messageEntity.offset;
                                        org.telegram.messenger.li.f(uy0Var, i11, messageEntity.length + i11, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityItalic) {
                                        ?? obj2 = new Object();
                                        obj2.f38578a |= 2;
                                        org.telegram.ui.Components.uy0 uy0Var2 = new org.telegram.ui.Components.uy0(obj2, r72);
                                        int i12 = messageEntity.offset;
                                        org.telegram.messenger.li.f(uy0Var2, i12, messageEntity.length + i12, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityStrike) {
                                        ?? obj3 = new Object();
                                        obj3.f38578a |= 8;
                                        org.telegram.ui.Components.uy0 uy0Var3 = new org.telegram.ui.Components.uy0(obj3, r72);
                                        int i13 = messageEntity.offset;
                                        org.telegram.messenger.li.f(uy0Var3, i13, messageEntity.length + i13, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityUnderline) {
                                        ?? obj4 = new Object();
                                        obj4.f38578a |= 16;
                                        org.telegram.ui.Components.uy0 uy0Var4 = new org.telegram.ui.Components.uy0(obj4, r72);
                                        int i14 = messageEntity.offset;
                                        org.telegram.messenger.li.f(uy0Var4, i14, messageEntity.length + i14, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityTextUrl) {
                                        org.telegram.ui.Components.x31 x31Var = new org.telegram.ui.Components.x31(messageEntity.url, ty0Var2);
                                        int i15 = messageEntity.offset;
                                        valueOf.setSpan(x31Var, i15, messageEntity.length + i15, 33);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntitySpoiler) {
                                        ?? obj5 = new Object();
                                        obj5.f38578a |= 256;
                                        org.telegram.ui.Components.uy0 uy0Var5 = new org.telegram.ui.Components.uy0(obj5, r72);
                                        int i16 = messageEntity.offset;
                                        org.telegram.messenger.li.f(uy0Var5, i16, messageEntity.length + i16, valueOf, true);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityBlockquote) {
                                        int i17 = messageEntity.offset;
                                        org.telegram.ui.Components.xg0.c(valueOf, i17, messageEntity.length + i17, messageEntity.collapsed);
                                    } else if (messageEntity instanceof TLRPC.TL_messageEntityCustomEmoji) {
                                        try {
                                            fontMetricsInt = this.f51237a0.getEditField().getPaint().getFontMetricsInt();
                                        } catch (Exception e10) {
                                            org.telegram.messenger.a8.g(e10, r72);
                                            fontMetricsInt = ty0Var2;
                                        }
                                        TLRPC.TL_messageEntityCustomEmoji tL_messageEntityCustomEmoji = (TLRPC.TL_messageEntityCustomEmoji) messageEntity;
                                        if (tL_messageEntityCustomEmoji.document != null) {
                                            p5Var = new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document, (Paint.FontMetricsInt) fontMetricsInt);
                                        } else {
                                            p5Var = new org.telegram.ui.Components.p5(tL_messageEntityCustomEmoji.document_id, (Paint.FontMetricsInt) fontMetricsInt);
                                        }
                                        int i18 = messageEntity.offset;
                                        valueOf.setSpan(p5Var, i18, messageEntity.length + i18, 33);
                                    }
                                    ty0Var = ty0Var2;
                                } else {
                                    ?? obj6 = new Object();
                                    obj6.f38578a |= 4;
                                    org.telegram.ui.Components.uy0 uy0Var6 = new org.telegram.ui.Components.uy0(obj6, 0);
                                    int i19 = messageEntity.offset;
                                    org.telegram.messenger.li.f(uy0Var6, i19, messageEntity.length + i19, valueOf, true);
                                }
                                ty0Var = null;
                            } else {
                                if (z12) {
                                    j12 = ((TLRPC.TL_inputMessageEntityMentionName) messageEntity).user_id.user_id;
                                } else {
                                    j12 = ((TLRPC.TL_messageEntityMentionName) messageEntity).user_id;
                                }
                                if (messageEntity.offset + messageEntity.length < valueOf.length() && valueOf.charAt(messageEntity.offset + messageEntity.length) == ' ') {
                                    messageEntity.length++;
                                }
                                ty0Var = null;
                                org.telegram.ui.Components.y31 y31Var = new org.telegram.ui.Components.y31(a1.g.p(j12, ""), 3, null);
                                int i20 = messageEntity.offset;
                                valueOf.setSpan(y31Var, i20, messageEntity.length + i20, 33);
                            }
                            i10++;
                            ty0Var2 = ty0Var;
                            c2 = c10;
                            j14 = j17;
                            r72 = 0;
                        }
                        j11 = j14;
                        mmVar = ty0Var2;
                        str2 = valueOf;
                    } else {
                        j11 = 0;
                        mmVar = null;
                        str2 = R.message;
                    }
                    this.f51237a0.e1(str2, true);
                    if (getArguments().getBoolean("hasUrl", false)) {
                        this.f51237a0.setSelection(R.message.indexOf(10) + 1);
                        org.telegram.messenger.g0.i3(new yd(this, 5), 700L);
                    }
                    this.f51237a0.setEffectId(R.effect);
                    if (R != null && (suggestedPost = R.suggested_post) != null) {
                        org.telegram.messenger.ej b10 = org.telegram.messenger.ej.b(suggestedPost);
                        this.f51540x5 = b10;
                        gc(b10);
                    }
                    ziVar = this.E5;
                    if (ziVar != null || this.f51397m4 == ziVar) {
                        if (message == null && ((ziVar2 = this.f51397m4) == null || ziVar2.f1() != message.f27022id)) {
                            org.telegram.messenger.zi ziVar3 = new org.telegram.messenger.zi(this.currentAccount, message, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.E5 = ziVar3;
                            TLRPC.InputReplyTo inputReplyTo2 = R.reply_to;
                            if (inputReplyTo2 != null) {
                                int i21 = inputReplyTo2.flags;
                                if ((i21 & 4) != 0 || inputReplyTo2.quote_rich != null) {
                                    ArrayList<TL_iv.RichText> arrayList = inputReplyTo2.quote_rich;
                                    int i22 = -1;
                                    if (arrayList != null) {
                                        int i23 = inputReplyTo2.quote_offset;
                                        if (arrayList.isEmpty()) {
                                            mmVar3 = mmVar;
                                        } else {
                                            org.telegram.messenger.zi.B0(ziVar3.f26868k);
                                            ?? obj7 = new Object();
                                            obj7.f47700a = ziVar3;
                                            obj7.f47701b = -1;
                                            obj7.f47702c = -1;
                                            obj7.d = -1;
                                            obj7.f47710m = true;
                                            obj7.e(i23, arrayList);
                                            mmVar3 = obj7;
                                        }
                                        this.C5 = mmVar3;
                                    } else {
                                        String str3 = inputReplyTo2.quote_text;
                                        if ((i21 & 16) != 0) {
                                            i22 = inputReplyTo2.quote_offset;
                                        }
                                        TLRPC.Message message4 = ziVar3.f26868k;
                                        if (message4 == null || (str = message4.message) == null || str3 == null || (Y = org.telegram.messenger.zi.Y(i22, str, str3)) < 0) {
                                            mmVar2 = mmVar;
                                        } else {
                                            org.telegram.messenger.zi.B0(ziVar3.f26868k);
                                            mmVar2 = new mm(Y, str3.length() + Y, ziVar3);
                                        }
                                        this.C5 = mmVar2;
                                    }
                                }
                            }
                            j7(false);
                            mm mmVar4 = this.C5;
                            if (mmVar4 != null) {
                                fc(this.E5, mmVar4);
                            } else {
                                ec(this.E5);
                            }
                            Lc(false);
                            return;
                        } else if (l10 == null && l10.longValue() != j11 && this.f51292e != null && (f10 = getMessagesController().f23102q7.f(this.f51292e.f27001id, l10.longValue())) != null && (message2 = f10.topicStartMessage) != null) {
                            org.telegram.messenger.zi ziVar4 = new org.telegram.messenger.zi(this.currentAccount, message2, (AbstractMap) getMessagesController().d, (AbstractMap) null, false, false);
                            this.E5 = ziVar4;
                            ziVar4.f26856h1 = f10;
                            ec(ziVar4);
                            Lc(false);
                            return;
                        } else {
                            return;
                        }
                    }
                    return;
                }
                j11 = 0;
                mmVar = null;
                if (R != null) {
                    org.telegram.messenger.ej b102 = org.telegram.messenger.ej.b(suggestedPost);
                    this.f51540x5 = b102;
                    gc(b102);
                }
                ziVar = this.E5;
                if (ziVar != null) {
                }
                if (message == null) {
                }
                if (l10 == null) {
                }
            }
        }
    }

    public final void M7(boolean z10, TLRPC.TL_updates_channelDifferenceTooLong tL_updates_channelDifferenceTooLong) {
        TLRPC.User user;
        int[] iArr = this.Q6;
        if (z10) {
            if (org.telegram.messenger.r2.f25040a) {
                StringBuilder sb2 = new StringBuilder("clear history by overwrite firstLoading=");
                sb2.append(this.Y6);
                sb2.append(" minMessage=");
                sb2.append(iArr[0]);
                sb2.append(" topMessage=");
                k2.p1.q(tL_updates_channelDifferenceTooLong.dialog.top_message, sb2);
            }
            TLRPC.Dialog dialog = tL_updates_channelDifferenceTooLong.dialog;
            int i3 = dialog.top_message;
            int i10 = iArr[0];
            if (i3 > i10) {
                this.U7 = Math.max(i10 + 1, dialog.read_inbox_max_id);
            }
            this.V6[0] = false;
            this.W6 = false;
            fl flVar = this.D0;
            if (flVar != null && flVar.G < 0) {
                flVar.i(0);
            }
            TLRPC.Dialog dialog2 = tL_updates_channelDifferenceTooLong.dialog;
            int i11 = dialog2.unread_count;
            this.A6 = i11;
            this.C6 = dialog2.unread_mentions_count;
            if (this.B6 != i11) {
                mh.h hVar = this.f51549y1;
                if (hVar != null) {
                    hVar.c(1, i11, this.f51299e6);
                }
                this.B6 = this.A6;
                Zc();
            }
            int i12 = this.C6;
            int i13 = tL_updates_channelDifferenceTooLong.dialog.unread_mentions_count;
            if (i12 != i13) {
                this.C6 = i13;
                if (i13 <= 0) {
                    this.C6 = 0;
                    this.D6 = true;
                    nc(false);
                } else {
                    mh.h hVar2 = this.f51549y1;
                    if (hVar2 != null) {
                        hVar2.c(2, i13, true);
                    }
                    nc(true);
                }
            }
            o7(false);
            return;
        }
        this.L6.clear();
        this.f51554y6.clear();
        this.I6.clear();
        this.J6.clear();
        this.O6.b();
        this.f51539x4 = false;
        for (int i14 = 1; i14 >= 0; i14--) {
            this.F6[i14].clear();
            TLRPC.EncryptedChat encryptedChat = this.h;
            int[] iArr2 = this.P6;
            if (encryptedChat == null) {
                iArr2[i14] = Integer.MAX_VALUE;
                iArr[i14] = Integer.MIN_VALUE;
            } else {
                iArr2[i14] = Integer.MIN_VALUE;
                iArr[i14] = Integer.MAX_VALUE;
            }
            this.R6[i14] = Integer.MIN_VALUE;
            this.S6[i14] = 0;
            this.f51412n6[i14].clear();
            this.f51425o6[i14].clear();
            this.f51438p6[i14].clear();
        }
        z9();
        cd(0, true);
        if (this.C8 != null) {
            this.C8 = null;
            mj mjVar = this.f51237a0;
            if (mjVar != null) {
                mjVar.Y0(null, true, false);
            }
        }
        if (this.R != null) {
            sc(false);
            V7(false);
            this.A0.setEmptyView(this.f51308f1);
        }
        fl flVar2 = this.D0;
        if (flVar2 != null) {
            flVar2.O(false);
        }
        if (this.h == null && (user = this.f51306f) != null && user.bot && this.f51515v8 == null) {
            this.f51515v8 = "";
            Lc(false);
        }
    }

    public final int M8() {
        return this.f51325g4;
    }

    public final void M9() {
        this.La = true;
        View view = this.fragmentView;
        if (view != null) {
            view.invalidate();
        }
    }

    public final void Ma(TLRPC.User user) {
        boolean z10;
        gi.l3 l3Var = this.K1;
        if (l3Var != null && l3Var.W) {
            l3Var.f(true);
            z10 = true;
        } else {
            z10 = false;
        }
        gi.l3 l3Var2 = this.L1;
        if (l3Var2 != null && l3Var2.W) {
            l3Var2.f(true);
            z10 = true;
        }
        if (z10) {
            org.telegram.messenger.g0.i3(new uf(this, user, 1), 200L);
            return;
        }
        if (!this.actionBar.f27728o0) {
            this.f51305ed.a(true, true);
            org.telegram.ui.ActionBar.q0 q0Var = this.f51359j0;
            if (q0Var != null) {
                q0Var.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar = this.f51321g0;
            if (wVar != null) {
                wVar.e(8);
            }
            ar arVar = this.f51307f0;
            if (arVar != null) {
                arVar.b(false);
            }
            org.telegram.ui.ActionBar.q0 q0Var2 = this.f51371k0;
            if (q0Var2 != null) {
                q0Var2.setVisibility(0);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f51432p0;
            if (q0Var3 != null && this.ea) {
                q0Var3.setVisibility(8);
            }
            org.telegram.ui.ActionBar.w wVar2 = this.f51445q0;
            if (wVar2 != null && this.f51317fa) {
                wVar2.e(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var4 = this.f51383l0;
            if (q0Var4 != null) {
                q0Var4.setVisibility(8);
            }
            org.telegram.ui.ActionBar.q0 q0Var5 = this.m0;
            if (q0Var5 != null) {
                q0Var5.setVisibility(8);
            }
            this.f51459r0 = true;
            jd(0, 0, -1);
            Lc(false);
            ImageView imageView = this.f51337h3;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.setVisibility(8);
            }
        }
        org.telegram.ui.ActionBar.q0 q0Var6 = this.f51371k0;
        if (q0Var6 != null) {
            this.Hc = true;
            this.f51364j5 = false;
            q0Var6.F(false);
            this.Hc = false;
        }
        zb(null, user);
        cd(0, true);
    }

    public final void Mb(boolean z10) {
        Nb(z10, false, true);
    }

    public final void Mc() {
        Lc(false);
    }

    @Override
    public final boolean N(uw uwVar) {
        return false;
    }

    public final boolean N6() {
        TLRPC.Chat chat = this.f51292e;
        if (chat == null || ((!chat.forum || !chat.forum_sidebar) && !chat.monoforum)) {
            TLRPC.User user = this.f51306f;
            if (!org.telegram.messenger.l10.u(user) || !user.bot_forum_sidebar) {
                if (!org.telegram.messenger.l10.u(this.f51306f) && !org.telegram.messenger.t3.a(this.f51292e)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final void N7(boolean z10) {
        for (int i3 = 1; i3 >= 0; i3--) {
            this.f51412n6[i3].clear();
            this.f51425o6[i3].clear();
            this.f51438p6[i3].clear();
        }
        z9();
        cd(0, true);
        Cd(z10);
        pd();
    }

    public final r0.k1 N8(r0.k1 k1Var) {
        ei.x2 x2Var;
        r0.a1 w0Var;
        if (k1Var != null && (x2Var = this.Y1) != null) {
            if ((x2Var.isShowing() && !this.Y1.J) || this.Y1.f32259p2) {
                int i3 = Build.VERSION.SDK_INT;
                if (i3 >= 34) {
                    w0Var = new r0.z0(k1Var);
                } else if (i3 >= 30) {
                    w0Var = new r0.y0(k1Var);
                } else if (i3 >= 29) {
                    w0Var = new r0.x0(k1Var);
                } else {
                    w0Var = new r0.w0(k1Var);
                }
                w0Var.c(8, i0.b.f14494e);
                w0Var.i(8, false);
                return w0Var.b();
            }
            return k1Var;
        }
        return k1Var;
    }

    public final void N9() {
        TLRPC.User user;
        boolean z10;
        if (a() != getUserConfig().e() && !getUserConfig().q() && (user = this.f51306f) != null && user.contact_require_premium) {
            boolean isEmpty = this.L6.isEmpty();
            if (getMessagesController().J2(a()) != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (isEmpty != z10) {
                getMessagesController().n2(this.classGuid, a());
            }
        }
    }

    public final void Na(long j10) {
        int i3 = 0;
        if (j10 < 0) {
            if (j10 == a()) {
                this.f51433p1.e(true, false);
            } else if (getMessagesController().p2(j10)) {
                showDialog(new ji.b0(this, -j10, null, null));
            } else {
                Bundle bundle = new Bundle();
                bundle.putLong("chat_id", -j10);
                if (getMessagesController().E(bundle, this, null, null)) {
                    presentFragment(new wm(bundle));
                }
            }
        } else if (j10 != getUserConfig().e()) {
            if (j10 == a()) {
                this.f51433p1.e(true, false);
                return;
            }
            Bundle j11 = a1.g.j(j10, "user_id");
            if (this.h != null && j10 == this.f51306f.f27150id) {
                j11.putLong("dialog_id", this.f51376k6);
            }
            ProfileActivity profileActivity = new ProfileActivity(j11, null);
            TLRPC.User user = this.f51306f;
            if (user != null && user.f27150id == j10) {
                i3 = 1;
            }
            profileActivity.g5(i3);
            presentFragment(profileActivity);
        } else {
            Bundle bundle2 = new Bundle();
            bundle2.putLong("user_id", j10);
            bundle2.putBoolean("my_profile", true);
            presentFragment(new ProfileActivity(bundle2, null));
        }
    }

    public final void Nb(boolean r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Nb(boolean, boolean, boolean):void");
    }

    public final void Nc() {
        int i3;
        org.telegram.ui.Components.fb fbVar;
        xj xjVar;
        mj mjVar;
        if (this.X9 && this.A0 != null) {
            float f10 = 0.0f;
            if (this.Ja <= 0 || this.Ya != 0.0f) {
                float q92 = q9(org.telegram.messenger.g0.L(7.0f));
                wj wjVar = this.D1;
                if (wjVar != null) {
                    i3 = org.telegram.messenger.g0.L(wjVar.F * 35.0f);
                } else {
                    i3 = 0;
                }
                float T8 = (T8() * org.telegram.messenger.g0.L(43.0f)) + q92 + i3;
                float f11 = this.M9;
                this.N9 = T8;
                this.M9 = r9(org.telegram.ui.Components.c11.f32501a) + org.telegram.messenger.g0.L(4.0f) + this.P9 + T8;
                if (this.actionBar.getVisibility() == 0 || this.xa != null) {
                    this.M9 += this.actionBar.getMeasuredHeight();
                }
                this.O9 = 0;
                this.M9 = this.M9 + this.Ua + this.Q9;
                if (this.Ya != 0.0f && (mjVar = this.f51237a0) != null && mjVar.getVisibility() == 0) {
                    float f12 = this.M9;
                    float measuredHeight = this.Ya * (this.f51237a0.getMeasuredHeight() - org.telegram.messenger.g0.L(44.0f));
                    this.M9 = f12 - measuredHeight;
                    f10 = measuredHeight;
                }
                org.telegram.ui.Cells.t0 t0Var = this.f51422o3;
                if (t0Var != null) {
                    t0Var.setTranslationY(((this.A0.getTranslationY() + this.M9) + this.U9) - org.telegram.messenger.g0.L(30.0f));
                    float f13 = this.M9;
                    float f14 = this.U9;
                    this.M9 = f13 + f14;
                    this.O9 = (int) (this.O9 + f14);
                }
                ej ejVar = this.f51396m3;
                if (ejVar != null) {
                    ejVar.setTranslationY((((this.A0.getTranslationY() - f10) + this.M9) + this.S9) - org.telegram.messenger.g0.L(4.0f));
                }
                Pc();
                wi wiVar = this.A0;
                if (wiVar != null && this.C0 != null && this.D0 != null) {
                    int paddingTop = wiVar.getPaddingTop();
                    int paddingBottom = this.A0.getPaddingBottom();
                    B7();
                    if (this.A0.getPaddingTop() != paddingTop || this.A0.getPaddingBottom() != paddingBottom) {
                        M9();
                    }
                    this.A0.setTopGlowOffset((int) ((this.M9 - this.O9) - org.telegram.messenger.g0.L(4.0f)));
                    if (f11 != this.M9) {
                        int childCount = this.A0.getChildCount();
                        int i10 = 0;
                        while (true) {
                            if (i10 >= childCount) {
                                break;
                            }
                            View childAt = this.A0.getChildAt(i10);
                            this.A0.getClass();
                            if (RecyclerView.R(childAt) == this.D0.b() - 1) {
                                float f15 = this.M9;
                                if (childAt.getTop() > f15) {
                                    this.A0.scrollBy(0, (int) (childAt.getTop() - f15));
                                }
                            } else {
                                i10++;
                            }
                        }
                    }
                    if (!da() && !this.Q4 && this.f51245a8 != null && this.A0 != null && ((xjVar = this.f51295e2) == null || xjVar.getVisibility() != 0)) {
                        this.A0.scrollBy(0, (int) (f11 - this.M9));
                    }
                }
                this.X9 = false;
                org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
                if (acVar != null && (fbVar = acVar.f31788e) != null) {
                    fbVar.updatePosition();
                }
                B7();
            }
        }
    }

    public final int O6(int i3) {
        org.telegram.messenger.zi messageObject;
        int i10;
        int height = this.A0.getHeight();
        int i11 = 0;
        long j10 = 0;
        while (true) {
            View T0 = this.A0.T0(i3);
            if (T0 == null) {
                break;
            }
            if (T0 instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) T0;
                messageObject = q1Var.getMessageObject();
                i10 = q1Var.getAdditionalPaddingHeight();
            } else if (T0 instanceof org.telegram.ui.Cells.t0) {
                messageObject = ((org.telegram.ui.Cells.t0) T0).getMessageObject();
                i10 = 0;
            } else {
                continue;
                i3++;
            }
            if (messageObject != null) {
                long d12 = messageObject.d1();
                boolean O3 = messageObject.O3();
                if (j10 != 0 && j10 != d12) {
                    break;
                }
                height = Math.min(height, T0.getTop());
                i11 = Math.max(i11, T0.getBottom() - i10);
                if (!O3) {
                    continue;
                } else if (d12 == 0) {
                    break;
                } else {
                    j10 = d12;
                }
            } else {
                continue;
            }
            i3++;
        }
        return Math.max(0, i11 - height);
    }

    public final void O7(boolean z10) {
        this.f51329g9 = z10;
        org.telegram.ui.ActionBar.f1 f1Var = this.f51316f9;
        if (f1Var != null) {
            f1Var.dismiss();
        }
        if (!z10) {
            ValueAnimator valueAnimator = this.Fc;
            if (valueAnimator != null) {
                valueAnimator.removeAllListeners();
                this.Fc.cancel();
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            this.Fc = ofFloat;
            ofFloat.addUpdateListener(new ae(this, 0));
            this.Fc.setDuration(150L);
            this.Fc.start();
        }
    }

    public final TLRPC.ChatFull O8() {
        return this.f51453q8;
    }

    public final boolean O9() {
        if (this.f51323g2 != null && this.f51475s4 == 0) {
            return true;
        }
        return false;
    }

    public final void Oa(CharSequence charSequence, String str) {
        if (getParentActivity() != null) {
            Bitmap r5 = org.telegram.messenger.yy.r(1, str);
            PhotoViewer.v1().N2(null, this, this.f51557ya);
            ArrayList arrayList = new ArrayList();
            org.telegram.messenger.ye yeVar = new org.telegram.messenger.ye(0, str, 0, true, 0, 0);
            yeVar.f25309a = charSequence;
            arrayList.add(yeVar);
            if (PhotoViewer.v1().U1()) {
                PhotoViewer.v1().H0(false, false);
            }
            PhotoViewer.v1().j2(arrayList, 0, 0, false, new rk(this, r5, arrayList), this);
            return;
        }
        B8(charSequence, null);
        org.telegram.messenger.c accountInstance = getAccountInstance();
        long j10 = this.f51376k6;
        org.telegram.messenger.zi ziVar = this.E5;
        org.telegram.messenger.zi ziVar2 = this.f51397m4;
        mm mmVar = this.C5;
        org.telegram.messenger.yy.b0(0, 0, 0, j10, 0L, 0L, h9(), null, str, null, null, accountInstance, ziVar, ziVar2, this.G5, this.f51540x5, W8(), null, null, null, mmVar, true, false, false);
        K6();
    }

    public final void Ob(int i3, int i10, String str) {
        this.f51273c8 = i3;
        this.f51301e8 = true;
        this.f51315f8 = 0L;
        this.f51328g8 = str;
        this.f51367j8 = i10;
        this.f51286d8 = true;
    }

    public final void Oc(boolean z10) {
        a0.h hVar;
        ArrayList arrayList;
        boolean z11;
        org.telegram.messenger.ui uiVar;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        org.telegram.messenger.zi ziVar;
        ArrayList arrayList2 = new ArrayList(org.telegram.messenger.li.b0(this.currentAccount).Z0);
        if (this.f51494tb == null) {
            this.f51494tb = new a0.h();
        }
        a0.h hVar2 = this.f51481sb;
        if (hVar2 == null) {
            this.f51481sb = new a0.h();
        } else {
            hVar2.b();
        }
        this.D0.Q.clear();
        this.f51494tb.b();
        a0.h hVar3 = null;
        a0.h hVar4 = null;
        int i3 = 0;
        while (true) {
            int size = arrayList2.size();
            hVar = this.O6;
            arrayList = this.L6;
            z11 = true;
            if (i3 >= size) {
                break;
            }
            org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList2.get(i3);
            int i10 = 0;
            while (true) {
                if (i10 < arrayList.size()) {
                    ziVar = (org.telegram.messenger.zi) arrayList.get(i10);
                    if (org.telegram.messenger.zi.B0(ziVar.f26868k) == org.telegram.messenger.zi.B0(ziVar2.f26868k) && ziVar.f1() == ziVar2.f1()) {
                        break;
                    }
                    i10++;
                } else {
                    ziVar = null;
                    break;
                }
            }
            if (ziVar2.k1 == 0) {
                if (ziVar == null) {
                    ziVar2.K(true);
                } else {
                    ziVar2.f26917x0 = ziVar.f26917x0;
                    ziVar2.f26913w0 = ziVar.f26913w0;
                }
            }
            if (ziVar != null) {
                ziVar2.f26874l2 = ziVar.f26874l2;
                if (this.D0.O && ziVar2.k1 != 0) {
                    ziVar.N(ziVar2);
                } else {
                    ziVar2.N(ziVar);
                }
            } else if (ziVar2.k1 == 0) {
                int i11 = f51229ld;
                f51229ld = i11 + 1;
                ziVar2.k1 = i11;
            }
            ziVar2.U2 = null;
            TLRPC.Message message2 = ziVar2.f26868k;
            if (message2 != null) {
                message2.out = true;
            }
            ziVar2.Q3();
            if (ziVar2.A2()) {
                org.telegram.messenger.ui uiVar2 = (org.telegram.messenger.ui) hVar.f(ziVar2.e1());
                if (uiVar2 == null) {
                    uiVar2 = new org.telegram.messenger.ui();
                    uiVar2.f25710n = this.f51381kb;
                    long d12 = ziVar2.d1();
                    uiVar2.f25699a = d12;
                    hVar.k(uiVar2, d12);
                } else if (hVar3 == null || hVar3.h(ziVar2.d1()) < 0) {
                    if (hVar4 == null) {
                        hVar4 = new a0.h();
                    }
                    hVar4.k(uiVar2, ziVar2.d1());
                }
                ArrayList arrayList3 = uiVar2.d;
                if (hVar3 == null) {
                    hVar3 = new a0.h();
                }
                hVar3.k(uiVar2, uiVar2.f25699a);
                if (uiVar2.d(ziVar2) == null) {
                    int i12 = 0;
                    while (true) {
                        if (i12 < arrayList3.size()) {
                            if (((org.telegram.messenger.zi) arrayList3.get(i12)).f1() == ziVar2.f1()) {
                                break;
                            }
                            i12++;
                        } else {
                            arrayList3.add(ziVar2);
                            break;
                        }
                    }
                }
            } else if (ziVar2.e1() != 0) {
                ziVar2.f26868k.grouped_id = 0L;
                ziVar2.f26840e = 0L;
            }
            this.D0.Q.add(ziVar2);
            this.f51494tb.k(ziVar2, ziVar2.f1());
            i3++;
        }
        if (hVar3 != null) {
            for (int i13 = 0; i13 < hVar3.m(); i13++) {
                org.telegram.messenger.ui uiVar3 = (org.telegram.messenger.ui) hVar3.n(i13);
                Collections.sort(uiVar3.d, new org.telegram.messenger.tq(20));
                uiVar3.a();
            }
        }
        ArrayList arrayList4 = new ArrayList();
        if (this.F3 != null && TextUtils.isEmpty(this.I3)) {
            for (int i14 = 0; i14 < arrayList.size(); i14++) {
                org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i14);
                if (ziVar3 != null && (message = ziVar3.f26868k) != null && (tL_messageReactions = message.reactions) != null && tL_messageReactions.reactions_as_tags) {
                    int i15 = 0;
                    while (true) {
                        if (i15 >= ziVar3.f26868k.reactions.results.size()) {
                            break;
                        } else if (this.F3.f(ziVar3.f26868k.reactions.results.get(i15).reaction)) {
                            arrayList4.add(ziVar3);
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        }
        for (int i16 = 0; i16 < arrayList4.size(); i16++) {
            org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) arrayList4.get(i16);
            if (!this.f51494tb.d(ziVar4.f1())) {
                ziVar4.U2 = null;
                TLRPC.Message message3 = ziVar4.f26868k;
                if (message3 != null) {
                    message3.out = true;
                }
                this.D0.Q.add(ziVar4);
                this.f51494tb.k(ziVar4, ziVar4.f1());
            }
        }
        int i17 = 0;
        while (i17 < this.D0.Q.size()) {
            org.telegram.messenger.zi ziVar5 = (org.telegram.messenger.zi) this.D0.Q.get(i17);
            if (ziVar5.A2() && (uiVar = (org.telegram.messenger.ui) hVar.f(ziVar5.d1())) != null) {
                ArrayList arrayList5 = uiVar.d;
                for (int size2 = arrayList5.size() - 1; size2 >= 0; size2--) {
                    org.telegram.messenger.zi ziVar6 = (org.telegram.messenger.zi) arrayList5.get(size2);
                    if (ziVar6 != ziVar5 && !this.f51494tb.d(ziVar6.f1())) {
                        this.D0.Q.add(i17, ziVar6);
                        this.f51494tb.k(ziVar6, ziVar6.f1());
                        i17++;
                    }
                }
            }
            i17++;
        }
        Collections.sort(this.D0.Q, new org.telegram.messenger.tq(21));
        org.telegram.messenger.zi ziVar7 = null;
        int i18 = 0;
        while (i18 < this.D0.Q.size()) {
            org.telegram.messenger.zi ziVar8 = (org.telegram.messenger.zi) this.D0.Q.get(i18);
            if (this.f51381kb && ziVar8 != null && i18 == 0) {
                cb(i18, ziVar8);
                i18++;
            }
            if (!this.f51381kb && ziVar7 != null && ziVar8.X != ziVar7.X) {
                cb(i18, ziVar7);
                i18++;
            }
            a0.h hVar5 = this.f51481sb;
            int i19 = ziVar8.X;
            ArrayList arrayList6 = (ArrayList) hVar5.f(i19);
            if (arrayList6 == null) {
                arrayList6 = org.telegram.messenger.k5.j(this.f51481sb, i19);
            }
            arrayList6.add(ziVar8);
            if (this.f51381kb && ziVar7 != null && i19 != ziVar7.X) {
                cb(i18, ziVar8);
                i18++;
            }
            if (!this.f51381kb && i18 >= this.D0.Q.size() - 1) {
                cb(this.D0.Q.size(), ziVar8);
                i18++;
            }
            i18++;
            ziVar7 = ziVar8;
        }
        this.D0.P = org.telegram.messenger.li.b0(this.currentAccount).W1();
        if (z10) {
            this.D0.T();
            this.D0.O(true);
            if (this.D0.O ? getMediaDataController().M0 == 0 || !this.D0.Q.isEmpty() : !this.X6 || !arrayList.isEmpty() || this.D0.f45300x >= 0) {
                z11 = false;
            }
            sc(z11);
            if (this.A0 != null) {
                V7(false);
                if (this.D0.O ? !(getMediaDataController().M0 == 0 && this.D0.Q.isEmpty()) : !(!this.X6 && arrayList.isEmpty() && this.D0.f45300x < 0)) {
                    this.f51308f1.setVisibility(8);
                    this.A0.setEmptyView(null);
                    return;
                }
                this.A0.setEmptyView(this.f51308f1);
                wi wiVar = this.A0;
                wiVar.K0(wiVar.w1());
            }
        }
    }

    public final float P6(boolean z10) {
        float f10;
        float f11;
        float f12;
        mj mjVar = this.f51237a0;
        float f13 = 0.0f;
        if (mjVar != null) {
            if (z10) {
                f10 = mjVar.f31178p5;
            } else {
                f10 = mjVar.f31172o5;
            }
        } else {
            f10 = 0.0f;
        }
        float max = Math.max(f10, org.telegram.messenger.g0.L(44.0f));
        float L = org.telegram.messenger.g0.L(44.0f);
        qe.a aVar = this.f51264bd;
        l6.n nVar = this.f51333gd;
        if (z10) {
            if (31 - Integer.numberOfLeadingZeros(nVar.f18088a) == 1) {
                f12 = 1.0f;
            } else {
                f12 = 0.0f;
            }
            if (31 - Integer.numberOfLeadingZeros(nVar.f18088a) == 0) {
                f11 = 0.0f;
            } else {
                f11 = 1.0f;
            }
            if (aVar.f53841f) {
                f13 = 1.0f;
            }
        } else {
            float[] fArr = (float[]) nVar.f18089b;
            float f14 = fArr[1];
            f11 = 1.0f - fArr[0];
            f13 = aVar.f53840e;
            f12 = f14;
        }
        if (!this.jb && !isInPreviewMode()) {
            return org.telegram.messenger.g0.T1(Math.max(org.telegram.messenger.g0.T1(L, max, f12) * f11, org.telegram.messenger.g0.L(44.0f)), -org.telegram.messenger.g0.L(7.0f), f13);
        }
        return org.telegram.messenger.g0.T1(L, max, f12) * f11;
    }

    public final long P7(org.telegram.messenger.zi ziVar) {
        if (this.f51325g4 == 3) {
            return 0L;
        }
        if (org.telegram.messenger.t3.c0(this.f51292e) && !this.f51525w4 && ziVar != null) {
            TLRPC.TL_forumTopic tL_forumTopic = ziVar.f26856h1;
            if (tL_forumTopic != null) {
                return tL_forumTopic.f27053id;
            }
            return org.telegram.messenger.zi.c2(this.currentAccount, ziVar.f26868k, org.telegram.messenger.t3.c0(this.f51292e), false);
        }
        return this.f51475s4;
    }

    public final TLRPC.UserFull P8() {
        return this.f51466r8;
    }

    public final void Pa() {
        this.f51313f6 = true;
        this.fragmentBeginToShow = true;
        this.f51442pa = null;
        this.m1.invalidate();
        this.m1.setSkipBackgroundDrawing(false);
        this.f51403ma = false;
        this.fragmentView.setAlpha(1.0f);
        this.f51433p1.setTranslationY(0.0f);
        this.f51433p1.getAvatarImageView().setScaleX(1.0f);
        this.f51433p1.getAvatarImageView().setScaleY(1.0f);
        this.f51433p1.getAvatarImageView().setAlpha(1.0f);
    }

    public final void Pb(long j10) {
        this.f51475s4 = j10;
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.f27022id = (int) j10;
        new org.telegram.messenger.zi(this.currentAccount, tL_message, false, false);
    }

    public final void Pc() {
        int i3;
        cj cjVar = this.f51410n3;
        if (cjVar == null) {
            return;
        }
        cjVar.setTranslationX(l9() / 2.0f);
        this.f51410n3.setTranslationY((((this.A0.getTranslationY() + this.M9) + this.T9) - org.telegram.messenger.g0.L(4.0f)) + org.telegram.messenger.g0.L(28.0f));
        float i10 = Utilities.i(org.telegram.messenger.g0.z1(this.T9, -this.f51410n3.getHeight(), 0.0f), 1.0f, 0.0f);
        this.f51410n3.setAlpha(this.f51538x3 * i10);
        cj cjVar2 = this.f51410n3;
        if (this.f51538x3 * i10 > 0.0f) {
            i3 = 0;
        } else {
            i3 = 4;
        }
        cjVar2.setVisibility(i3);
        float T1 = org.telegram.messenger.g0.T1(0.5f, 1.0f, i10);
        this.f51410n3.setScaleX(T1);
        this.f51410n3.setScaleY(T1);
    }

    public final boolean Q6(org.telegram.messenger.zi ziVar) {
        if (!U9()) {
            TLRPC.Message message = ziVar.f26868k;
            if ((message == null || !message.noforwards) && !ziVar.h4() && !ziVar.T4()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final ArrayList Q8() {
        fl flVar = this.D0;
        if (flVar != null) {
            return flVar.Q;
        }
        return null;
    }

    public final boolean Q9() {
        if (!org.telegram.messenger.az.H0 && !this.f51506ub) {
            return false;
        }
        return true;
    }

    public final void Qa(long j10, boolean z10) {
        if (this.f51323g2 != null && org.telegram.messenger.l10.u(this.f51306f)) {
            this.f51323g2.setAllTopicsHidden(true);
        }
        this.f51284d6.put(j10, 1);
        f8();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f51376k6, 0, new hg(this, j10, z10), new cg.i0(this, j10, 3));
        this.D0.O(false);
    }

    public final void Qb(View view) {
        View view2 = this.Y8;
        if (view2 != view) {
            if (view2 != null && (view2 instanceof org.telegram.ui.Cells.t0)) {
                ((org.telegram.ui.Cells.t0) view2).setInvalidateWithParent(null);
            }
            this.Y8 = view;
            if (view instanceof org.telegram.ui.Cells.t0) {
                ((org.telegram.ui.Cells.t0) view).setInvalidateWithParent(this.fragmentView);
            }
        }
    }

    public final void Qc() {
        boolean z10;
        int i3;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.UserFull userFull;
        if (a() != getUserConfig().e() && (userFull = this.f51466r8) != null && userFull.business_intro != null && ((!userFull.contact_require_premium || getUserConfig().q()) && this.f51466r8.send_paid_messages_stars <= 0)) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51322g1 != null) {
            if (z10 && this.f51347i1 == null) {
                xh xhVar = new xh(getParentActivity(), getResourceProvider(), this);
                this.f51347i1 = xhVar;
                b8.pf.b(xhVar, 0.02f, 1.2f);
                this.f51347i1.setOnClickListener(new je(this, 12));
            }
            xh xhVar2 = this.f51347i1;
            if (xhVar2 != null) {
                if (!z10) {
                    xhVar2.setVisibility(8);
                    return;
                }
                xhVar2.setVisibility(0);
                TLRPC.UserFull userFull2 = this.f51466r8;
                if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null && TextUtils.isEmpty(tL_businessIntro.title) && TextUtils.isEmpty(this.f51466r8.business_intro.title)) {
                    i3 = 2131749509;
                } else {
                    i3 = 2131749510;
                }
                String a02 = org.telegram.messenger.bd.a0(null, null, i3, org.telegram.messenger.l10.j(this.f51306f, true));
                int indexOf = a02.indexOf("**");
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(a02);
                if (indexOf > 0) {
                    a02 = a02.substring(0, indexOf) + a02.substring(indexOf + 2);
                    int indexOf2 = a02.indexOf("**");
                    if (indexOf2 > 0) {
                        a02 = a02.substring(0, indexOf2) + a02.substring(indexOf2 + 2);
                        spannableStringBuilder = new SpannableStringBuilder(a02);
                        mw0 mw0Var = new mw0(a02.substring(indexOf, indexOf2));
                        if (mw0Var.f47804c != -1) {
                            mw0Var.f47804c = -1;
                            mw0Var.invalidateSelf();
                        }
                        mw0Var.a(503316480);
                        mw0Var.setBounds(0, 0, mw0Var.getIntrinsicWidth(), org.telegram.messenger.g0.L(17.33f));
                        spannableStringBuilder.setSpan(new ImageSpan(mw0Var), indexOf, indexOf2, 33);
                    }
                }
                this.f51347i1.setCustomText(spannableStringBuilder);
                this.f51347i1.setOverrideTextMaxWidth(gi.l3.a(a02, (TextPaint) getThemedPaint("paintChatActionText")));
                if (this.f51347i1.getParent() != null && (!z10 || this.f51347i1.getParent() != this.f51322g1)) {
                    ((ViewGroup) this.f51347i1.getParent()).removeView(this.f51347i1);
                }
                if (z10) {
                    ViewParent parent = this.f51347i1.getParent();
                    LinearLayout linearLayout = this.f51322g1;
                    if (parent != linearLayout) {
                        linearLayout.addView(this.f51347i1, b8.mf.t(-1, -2, 80, 0, 10, 0, 0));
                    }
                }
            }
        }
    }

    public final boolean R6() {
        if (!V9() && !getMessagesController().y2(a())) {
            if ((!getMessagesController().t2(a()) || this.f51525w4) && getMessagesController().N1(a()) <= 0 && this.h == null) {
                qj qjVar = this.f51279d1;
                if (qjVar == null || qjVar.getVisibility() != 0) {
                    if (!da() || this.f51525w4) {
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

    public final void R7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.R7():void");
    }

    public final pi.q R8() {
        wm wmVar = this.xa;
        if (wmVar != null) {
            return wmVar.R8();
        }
        return this.glassEngine;
    }

    public final boolean R9() {
        if (!org.telegram.messenger.t3.c0(this.f51292e) || this.f51525w4) {
            if (org.telegram.messenger.t3.p0(this.f51292e) && b() == 0 && !this.f51349i4) {
                return true;
            }
            return false;
        }
        return true;
    }

    public final boolean Ra() {
        if (this.U4.size() != 1 || this.n4 == null || ((Integer) this.U4.get(0)).intValue() != this.n4.f1()) {
            return false;
        }
        return true;
    }

    public final void Rb(ArrayList arrayList, TLRPC.Chat chat, int i3, int i10, int i11, TLRPC.TL_forumTopic tL_forumTopic) {
        boolean z10;
        boolean z11;
        this.f51463r4 = tL_forumTopic;
        this.f51436p4 = arrayList;
        org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList);
        this.f51397m4 = ziVar;
        this.E5 = ziVar;
        this.f51563z4 = i10;
        this.A4 = i11;
        this.B4 = Math.max(1, i10);
        this.f51475s4 = this.f51397m4.f1();
        this.f51487t4 = i3;
        this.f51499u4 = chat;
        if (tL_forumTopic != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51525w4 = z10;
        org.telegram.messenger.zi ziVar2 = this.E5;
        TLRPC.MessageFwdHeader messageFwdHeader = ziVar2.f26868k.fwd_from;
        if (messageFwdHeader != null && messageFwdHeader.channel_post != 0 && !z10) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f51511v4 = z11;
        if (z10) {
            ziVar2.f26885p = true;
        }
        dd();
        vd(false);
        Lc(false);
    }

    public final void Rc() {
        final long j10;
        int i3;
        boolean z10;
        int i10;
        TLRPC.Chat chat;
        TLRPC.Chat chat2;
        String a02;
        if (this.f51335h1 == null) {
            return;
        }
        String str = null;
        if (org.telegram.messenger.t3.p0(this.f51292e)) {
            if (this.f51292e != null) {
                chat = getMessagesController().v1(this.f51292e.f27001id);
            } else {
                chat = null;
            }
            if (chat != null && (chat2 = this.f51292e) != null && !org.telegram.messenger.t3.A(this.currentAccount, chat2, 24)) {
                final long j11 = this.f51292e.send_paid_messages_stars;
                int i11 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
                if (i11 > 0) {
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131744359, org.telegram.messenger.m5.t(-chat.f27001id), org.telegram.messenger.bd.E(j11, ','));
                } else {
                    a02 = org.telegram.messenger.bd.a0(null, null, 2131744342, org.telegram.messenger.m5.t(-chat.f27001id));
                }
                SpannableStringBuilder V2 = org.telegram.messenger.g0.V2(ci.wb.U0(a02, 1.0f, null));
                if (i11 > 0) {
                    str = org.telegram.messenger.bd.M0(2131748480, null);
                }
                this.f51335h1.c(true, true, V2, str, new View.OnClickListener(this) {
                    public final wm f46918b;

                    {
                        this.f46918b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                wm.E0(j11, this.f46918b);
                                return;
                            default:
                                wm.B1(j11, this.f46918b);
                                return;
                        }
                    }
                });
                return;
            }
            this.f51335h1.c(false, false, null, null, null);
        } else if (a() != getUserConfig().e()) {
            TLRPC.UserFull userFull = this.f51466r8;
            if (userFull != null && userFull.contact_require_premium) {
                org.telegram.ui.Components.on onVar = this.f51335h1;
                boolean z11 = !getUserConfig().q();
                if (getMessagesController().D3()) {
                    i10 = 2131748589;
                } else {
                    i10 = 2131748590;
                }
                onVar.c(z11, false, org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, i10, org.telegram.messenger.m5.t(this.f51376k6))), org.telegram.messenger.bd.M0(2131748546, null), new ai.t(12));
            } else if (userFull != null && (userFull.send_paid_messages_stars) > 0) {
                org.telegram.ui.Components.on onVar2 = this.f51335h1;
                if (i3 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                onVar2.c(z10, false, org.telegram.messenger.g0.V2(ci.wb.U0(org.telegram.messenger.bd.a0(null, null, 2131748588, org.telegram.messenger.m5.t(this.f51376k6), org.telegram.messenger.bd.E(this.f51466r8.send_paid_messages_stars, ',')), 1.0f, null)), org.telegram.messenger.bd.M0(2131748480, null), new View.OnClickListener(this) {
                    public final wm f46918b;

                    {
                        this.f46918b = this;
                    }

                    @Override
                    public final void onClick(View view) {
                        switch (r4) {
                            case 0:
                                wm.E0(j10, this.f46918b);
                                return;
                            default:
                                wm.B1(j10, this.f46918b);
                                return;
                        }
                    }
                });
            } else {
                this.f51335h1.c(false, false, null, null, null);
            }
        } else {
            this.f51335h1.c(false, false, null, null, null);
        }
    }

    public final boolean S6() {
        if (this.h == null) {
            qj qjVar = this.f51279d1;
            if (qjVar == null || qjVar.getVisibility() != 0) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void S7() {
        if (this.f51309f2 == null && getParentActivity() != null) {
            d8();
            if (this.f51252b1 != null) {
                TextView textView = new TextView(getParentActivity());
                this.f51309f2 = textView;
                textView.setGravity(17);
                this.f51309f2.setTextSize(1, 14.0f);
                this.f51309f2.setTypeface(org.telegram.messenger.g0.o());
                TextView textView2 = this.f51309f2;
                int i3 = org.telegram.ui.ActionBar.k6.Ci;
                org.telegram.ui.ActionBar.r6.V(textView2, i3, getResourceProvider());
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) "icon");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.wp(2131232477, 0), 0, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) org.telegram.messenger.bd.M0(2131745526, null));
                this.f51309f2.setText(spannableStringBuilder);
                TextView textView3 = this.f51309f2;
                int r12 = org.telegram.ui.ActionBar.k6.r1(0.1f, getThemedColor(i3));
                int L = org.telegram.messenger.g0.L(3.0f);
                org.telegram.ui.ActionBar.r6.R(textView3, org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(15.0f), r12, L, L, L, L), null, org.telegram.ui.ActionBar.r6.L(0.1f, i3), getResourceProvider());
                this.f51309f2.setOnClickListener(new je(this, 20));
                b8.pf.b(this.f51309f2, 0.04f, 1.5f);
                this.f51252b1.addView(this.f51309f2, b8.mf.r(-1, 36, 83));
                this.f51252b1.h(12, this.f51309f2);
                this.f51252b1.g(this.f51309f2);
            }
        }
    }

    public final org.telegram.messenger.ui S8(long j10) {
        return (org.telegram.messenger.ui) this.O6.f(j10);
    }

    public final boolean S9() {
        return org.telegram.messenger.l10.u(this.f51306f);
    }

    public final void Sa() {
        org.telegram.ui.Cells.q1 q1Var;
        this.f51264bd.a(false, true);
        th.b bVar = this.f51345hd;
        if (bVar != null && (q1Var = bVar.f55392n) != null && q1Var.getDelegate() != null) {
            bVar.f55392n.getDelegate().u1(bVar.f55392n, false);
        }
        mj mjVar = this.f51237a0;
        if (mjVar != null) {
            mjVar.U0(true, true, false);
            this.f51237a0.Y4 = null;
        }
    }

    public final void Sb(kl klVar) {
        if (this.f51359j0 != null && !this.inPreviewMode && !this.jb && this.xa == null && (this.fragmentView instanceof FrameLayout)) {
            si.f fVar = this.K;
            if (fVar != null) {
                si.f fVar2 = this.J;
                if (fVar2 == null) {
                    fVar2 = fVar;
                }
                si.d dVar = new si.d(fVar2, fVar);
                eh.c cVar = new eh.c(dVar, dVar, dVar);
                cVar.f9988k = true;
                cVar.f9987j = R8();
                cVar.h = this.f51384l1;
                cVar.f9986i = klVar;
                cVar.f9985g = this.F;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                kVar.X0 = cVar;
                kVar.Y0 = dVar;
            }
            this.actionBar.setMenuRise(org.telegram.messenger.g0.L(8.0f));
            this.f51359j0.setSubMenuOverlayProvider(new me(0, this));
        }
    }

    public final void Sc(boolean r15) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Sc(boolean):void");
    }

    public final boolean T6(org.telegram.messenger.zi ziVar) {
        if (this.f51325g4 != 8) {
            if (ziVar != null && org.telegram.messenger.t3.c0(this.f51292e)) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f23102q7.f(this.f51292e.f27001id, org.telegram.messenger.zi.c2(this.currentAccount, ziVar.f26868k, true, false));
                if (this.f51325g4 == 8 || (f10 != null && (!f10.closed || org.telegram.messenger.t3.i(this.currentAccount, this.f51292e, f10)))) {
                    return true;
                }
                return false;
            } else if (ziVar == null || !org.telegram.messenger.t3.p0(this.f51292e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f51292e, 24) || org.telegram.messenger.zi.v1(ziVar.f26868k) == 0) {
                return false;
            }
        }
        return true;
    }

    public final void T7() {
        if (getParentActivity() != null && getParentActivity() != null && this.Y1 == null) {
            ei.x2 x2Var = new ei.x2(this, getParentActivity(), this, this.f51557ya, 2);
            this.Y1 = x2Var;
            x2Var.R1 = a();
            ei.x2 x2Var2 = this.Y1;
            x2Var2.f32212a2 = true;
            x2Var2.U3 = new ok(this);
        }
    }

    public final float T8() {
        wm wmVar = this.xa;
        if (wmVar == null) {
            wmVar = this;
        }
        jj jjVar = wmVar.E1;
        if (jjVar == null) {
            return 0.0f;
        }
        return jjVar.f32331b;
    }

    public boolean T9() {
        if (this.m1.getKeyboardHeight() > org.telegram.messenger.g0.L(20.0f)) {
            return true;
        }
        return false;
    }

    public final void Ta(org.telegram.ui.Cells.q1 q1Var) {
        th.b bVar;
        if (this.f51264bd.f53841f && (bVar = this.f51345hd) != null && bVar.f55392n == q1Var) {
            Editable text = bVar.f55387a.getText();
            int length = text.length();
            if (length != 0 && length <= ((org.telegram.messenger.j0) getMessagesController().f23167x7.I.f13798b).f23620c) {
                org.telegram.messenger.yy C = org.telegram.messenger.yy.C(this.currentAccount);
                org.telegram.messenger.zi messageObject = q1Var.getMessageObject();
                th.c attachedMedia = this.f51345hd.getAttachedMedia();
                if (messageObject != null) {
                    TLRPC.MessageMedia n12 = org.telegram.messenger.zi.n1(messageObject);
                    if (n12 instanceof TLRPC.TL_messageMediaPoll) {
                        long B0 = org.telegram.messenger.zi.B0(messageObject.f26868k);
                        messageObject.f1();
                        TLRPC.TL_inputPollAnswer tL_inputPollAnswer = new TLRPC.TL_inputPollAnswer();
                        tL_inputPollAnswer.text = new TLRPC.TL_textWithEntities();
                        tL_inputPollAnswer.option = r9;
                        byte[] bArr = {(byte) (((TLRPC.TL_messageMediaPoll) n12).poll.answers.size() + 48)};
                        CharSequence[] charSequenceArr = {text};
                        tL_inputPollAnswer.text.entities = C.getMediaDataController().W(charSequenceArr, true, true);
                        tL_inputPollAnswer.text.text = charSequenceArr[0].toString();
                        if (attachedMedia instanceof uh.d) {
                            ArrayList arrayList = new ArrayList(1);
                            arrayList.add(((uh.d) attachedMedia).f56356c);
                            org.telegram.messenger.yy.X(C.getAccountInstance(), arrayList, B0, null, null, null, null, false, false, messageObject, tL_inputPollAnswer, false, 0, 0, false, null, null, 0L, false, 0L, 0L, null, null, false);
                        } else if (attachedMedia instanceof uh.h) {
                            uh.h hVar = (uh.h) attachedMedia;
                            C.t(messageObject, tL_inputPollAnswer, null, null, (TLRPC.TL_document) hVar.f56367b, null, null, null, false, false, hVar.f56368c);
                        } else if (attachedMedia instanceof uh.f) {
                            tL_inputPollAnswer.input_media = dg.d.h(((uh.f) attachedMedia).f56364b);
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else if (attachedMedia instanceof uh.e) {
                            TLRPC.TL_inputMediaWebPage tL_inputMediaWebPage = new TLRPC.TL_inputMediaWebPage();
                            tL_inputMediaWebPage.url = ((uh.e) attachedMedia).f56357b;
                            tL_inputMediaWebPage.optional = true;
                            tL_inputPollAnswer.input_media = tL_inputMediaWebPage;
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        } else {
                            C.t(messageObject, tL_inputPollAnswer, null, null, null, null, null, null, false, false, null);
                        }
                    }
                }
                Sa();
                return;
            }
            org.telegram.messenger.g0.F3(this.f51345hd.f55387a);
        }
    }

    public final void Tb() {
        org.telegram.messenger.g0.G3(5.0f, this.A0, null);
        org.telegram.messenger.p2.APP_ERROR.a();
        mj mjVar = this.f51237a0;
        for (int i3 = 0; i3 < mjVar.getChildCount(); i3++) {
            org.telegram.messenger.g0.G3(5.0f, mjVar.getChildAt(i3), null);
        }
        org.telegram.ui.ActionBar.k actionBar = getActionBar();
        for (int i10 = 0; i10 < actionBar.getChildCount(); i10++) {
            org.telegram.messenger.g0.G3(5.0f, actionBar.getChildAt(i10), null);
        }
    }

    public final void Tc() {
        org.telegram.messenger.zi ziVar;
        if (this.f51306f != null) {
            if (this.h != null) {
                ArrayList arrayList = new ArrayList();
                wi wiVar = this.A0;
                if (wiVar != null) {
                    int childCount = wiVar.getChildCount();
                    for (int i3 = 0; i3 < childCount; i3++) {
                        View childAt = this.A0.getChildAt(i3);
                        if (childAt instanceof org.telegram.ui.Cells.q1) {
                            ziVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                        } else {
                            ziVar = null;
                        }
                        if (ziVar != null && ziVar.f1() < 0) {
                            long j10 = ziVar.f26868k.random_id;
                            if (j10 != 0) {
                                arrayList.add(Long.valueOf(j10));
                            }
                        }
                    }
                }
                MediaController.B();
                return;
            }
            org.telegram.messenger.zi ziVar2 = SecretMediaViewer.f().f41942g0;
            if (ziVar2 != null && !ziVar2.O3()) {
                MediaController.B();
                ziVar2.f1();
            }
        }
    }

    public final void U6(boolean z10) {
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
        int i3;
        float f14;
        float f15;
        float f16;
        float f17;
        int i10;
        TLRPC.EncryptedChat encryptedChat = this.h;
        boolean z13 = true;
        int i11 = 8;
        if ((encryptedChat != null && !(encryptedChat instanceof TLRPC.TL_encryptedChat)) || ((this.f51292e != null && (this.f51325g4 != 0 || this.f51475s4 != 0 || (chatFull = this.f51453q8) == null || chatFull.ttl_period == 0)) || ((user = this.f51306f) != null && (org.telegram.messenger.l10.x(user) || (this.h == null && ((userFull = this.f51466r8) == null || userFull.ttl_period == 0)))))) {
            org.telegram.ui.ActionBar.o0 o0Var = this.f51293e0;
            if (o0Var != null) {
                o0Var.e(8);
            }
            qi qiVar = this.f51433p1;
            if (qiVar != null) {
                qiVar.f35120a.a(false, z10);
            }
        } else {
            org.telegram.ui.ActionBar.o0 o0Var2 = this.f51293e0;
            if (o0Var2 != null) {
                o0Var2.e(0);
            }
            qi qiVar2 = this.f51433p1;
            if (qiVar2 != null) {
                qiVar2.f35120a.a(true, z10);
            }
        }
        org.telegram.ui.ActionBar.o0 o0Var3 = this.f51507v0;
        if (o0Var3 != null) {
            TLRPC.Chat chat = this.f51292e;
            if (chat != null && chat.forum) {
                i10 = 0;
            } else {
                i10 = 8;
            }
            o0Var3.e(i10);
        }
        qi qiVar3 = this.f51433p1;
        if (qiVar3 != null) {
            TLRPC.Chat chat2 = this.f51292e;
            if ((chat2 != null && chat2.linked_community_id != 0) || ((user2 = this.f51306f) != null && user2.linked_community_id != 0)) {
                z11 = true;
            } else {
                z11 = false;
            }
            qiVar3.setCommunityItemVisible(z11);
            final qi qiVar4 = this.f51433p1;
            TLRPC.Chat chat3 = this.f51292e;
            if (chat3 != null && (chat3.flags2 & 2048) != 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            ImageView imageView = qiVar4.F;
            ImageView imageView2 = qiVar4.E;
            if (imageView2 != null && imageView != null) {
                qiVar4.f35138n0 = z12;
                float f18 = 1.1f;
                float f19 = 1.0f;
                if (!z10) {
                    int i12 = 4;
                    if (z12) {
                        i3 = 0;
                    } else {
                        i3 = 4;
                    }
                    imageView2.setVisibility(i3);
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
                                    jn jnVar = qiVar4;
                                    if (!z14) {
                                        jnVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    jn jnVar2 = qiVar4;
                                    if (!z15) {
                                        jnVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar2.getClass();
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
                                    jn jnVar = qiVar4;
                                    if (!z14) {
                                        jnVar.E.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar.getClass();
                                        return;
                                    }
                                default:
                                    boolean z15 = z12;
                                    jn jnVar2 = qiVar4;
                                    if (!z15) {
                                        jnVar2.F.setVisibility(4);
                                        return;
                                    } else {
                                        jnVar2.getClass();
                                        return;
                                    }
                            }
                        }
                    }).start();
                }
            }
            TLRPC.EncryptedChat encryptedChat2 = this.h;
            if (encryptedChat2 != null) {
                this.f51433p1.g(encryptedChat2.ttl, z10);
            } else {
                TLRPC.UserFull userFull2 = this.f51466r8;
                if (userFull2 != null) {
                    this.f51433p1.g(userFull2.ttl_period, z10);
                } else {
                    TLRPC.ChatFull chatFull3 = this.f51453q8;
                    if (chatFull3 != null) {
                        this.f51433p1.g(chatFull3.ttl_period, z10);
                    }
                }
            }
        }
        if (this.f51495u0 != null && (chatFull2 = this.f51453q8) != null) {
            if (!chatFull2.can_delete_channel && org.telegram.messenger.t3.T(this.f51292e)) {
                TLRPC.Chat chat4 = this.f51292e;
                if (!chat4.megagroup || org.telegram.messenger.t3.t0(chat4)) {
                    z13 = false;
                }
            }
            org.telegram.ui.ActionBar.o0 o0Var4 = this.f51495u0;
            if (z13) {
                i11 = 0;
            }
            o0Var4.e(i11);
        }
        s();
    }

    public final void U7(org.telegram.messenger.zi ziVar, org.telegram.messenger.ui uiVar, boolean z10) {
        tf tfVar;
        if (ziVar == null) {
            SparseArray[] sparseArrayArr = this.f51412n6;
            if (sparseArrayArr[1].size() + sparseArrayArr[0].size() == 0) {
                return;
            }
        }
        TLRPC.User user = this.f51306f;
        TLRPC.Chat chat = this.f51292e;
        TLRPC.EncryptedChat encryptedChat = this.h;
        TLRPC.ChatFull chatFull = this.f51453q8;
        long j10 = this.f51272c7;
        int b10 = (int) b();
        int i3 = this.f51325g4;
        tf tfVar2 = new tf(this, 4);
        if (z10) {
            tfVar = new tf(this, 5);
        } else {
            tfVar = null;
        }
        tf tfVar3 = tfVar;
        org.telegram.ui.Components.t4.y(this, user, chat, encryptedChat, chatFull, j10, ziVar, this.f51412n6, uiVar, b10, i3, null, tfVar2, tfVar3, this.f51557ya);
    }

    public final int U8(org.telegram.messenger.zi ziVar, boolean z10) {
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15 = false;
        if (getParentActivity() == null) {
            return 0;
        }
        if (this.F9 == null) {
            this.F9 = new org.telegram.ui.Cells.q1(getParentActivity(), this.currentAccount, true, this.Wa, this.f51557ya);
        }
        org.telegram.ui.Cells.q1 q1Var = this.F9;
        if (this.f51292e == null && !org.telegram.messenger.l10.B(this.f51306f)) {
            z11 = false;
        } else {
            z11 = true;
        }
        q1Var.f29900e6 = z11;
        org.telegram.ui.Cells.q1 q1Var2 = this.F9;
        int i3 = this.f51325g4;
        if (i3 == 3) {
            z12 = true;
        } else {
            z12 = false;
        }
        q1Var2.f29928g6 = z12;
        if (i3 == 3 && this.jb) {
            z13 = true;
        } else {
            z13 = false;
        }
        q1Var2.f29941h6 = z13;
        TLRPC.User user = this.f51306f;
        if (user != null && user.bot) {
            z14 = true;
        } else {
            z14 = false;
        }
        q1Var2.f29951i6 = z14;
        if (org.telegram.messenger.t3.T(this.f51292e) && this.f51292e.megagroup) {
            z15 = true;
        }
        q1Var2.f29964j6 = z15;
        this.F9.V6 = O9();
        this.F9.W6 = Z9();
        this.F9.X6 = Y9();
        return this.F9.q0(ziVar, (org.telegram.messenger.ui) this.O6.f(ziVar.d1()), z10);
    }

    public final boolean U9() {
        if (this.f51292e != null) {
            return getMessagesController().o2(this.f51292e);
        }
        org.telegram.messenger.hp messagesController = getMessagesController();
        TLRPC.UserFull userFull = this.f51466r8;
        messagesController.getClass();
        return org.telegram.messenger.hp.K2(userFull);
    }

    public final void Ua(org.telegram.ui.Cells.z zVar, TLRPC.ReactionCount reactionCount, float f10, float f11) {
        org.telegram.messenger.zi messageObject;
        boolean z10;
        boolean z11;
        TLRPC.Message message;
        dh.n0 d = dh.n0.d(reactionCount.reaction);
        if (zVar instanceof org.telegram.ui.Cells.q1) {
            messageObject = ((org.telegram.ui.Cells.q1) zVar).getPrimaryMessageObject();
        } else if (zVar instanceof org.telegram.ui.Cells.t0) {
            messageObject = ((org.telegram.ui.Cells.t0) zVar).getMessageObject();
        } else {
            return;
        }
        org.telegram.messenger.zi ziVar = messageObject;
        Ab(zVar, ziVar, null, null, f10, f11, d, false, false, false, false);
        if (ziVar != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (ziVar.f26868k != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 & z11) {
            boolean z12 = this.D0.O;
            if (z12) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) this.F6[0].get(ziVar.f1());
                if (ziVar2 != null && (message = ziVar2.f26868k) != null) {
                    message.reactions = ziVar.f26868k.reactions;
                }
            } else if (!z12 && this.F3 != null) {
                Oc(false);
            }
        }
        if (this.D0.O && !ziVar.w2(this.F3)) {
            org.telegram.messenger.ui s92 = s9(ziVar);
            if (s92 != null) {
                ArrayList arrayList = s92.d;
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    getMediaDataController().M1(((org.telegram.messenger.zi) arrayList.get(i3)).f1());
                }
            } else {
                getMediaDataController().M1(ziVar.f1());
            }
            kg.i1 i1Var = this.f51255b4;
            if (i1Var != null) {
                i1Var.f();
            }
            Oc(true);
        }
    }

    public final void Ub(int i3, org.telegram.messenger.zi ziVar) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f51557ya);
        String M0 = org.telegram.messenger.bd.M0(2131745430, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        TLRPC.User user = this.f51306f;
        if (user != null) {
            if (user.bot) {
                s1Var.U = org.telegram.messenger.bd.M0(2131754069, null);
            } else {
                String i10 = org.telegram.messenger.k5.i(new StringBuilder("+"), getUserConfig().f().phone, mf.b.c());
                TLRPC.User user2 = this.f51306f;
                s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("AreYouSureShareMyContactInfoUser", null, 2131754067, i10, org.telegram.messenger.g5.m(0, user2.first_name, user2.last_name)));
            }
        } else {
            s1Var.U = org.telegram.messenger.bd.M0(2131754070, null);
        }
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131745471, null), new k2.y(this, i3, ziVar, 7));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(s1Var);
    }

    public final void Uc(org.telegram.messenger.zi ziVar, boolean z10) {
        if (this.D0 == null) {
            return;
        }
        getNotificationCenter().d(new ci.v6(this, ziVar, z10, 14));
    }

    public final void V6() {
        if (this.jb) {
            return;
        }
        if (W9()) {
            org.telegram.messenger.g0.Z2(getParentActivity(), this.classGuid);
        } else {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final void V7(boolean z10) {
        TLRPC.User user;
        TL_account.TL_businessIntro tL_businessIntro;
        TLRPC.User user2;
        TLRPC.Chat chat;
        Paint paint;
        int i3;
        TL_account.TL_businessIntro tL_businessIntro2;
        if ((this.f51308f1 == null || z10) && getParentActivity() != null) {
            FrameLayout frameLayout = this.f51308f1;
            if (frameLayout == null) {
                FrameLayout frameLayout2 = new FrameLayout(getParentActivity());
                this.f51308f1 = frameLayout2;
                frameLayout2.setVisibility(4);
                this.m1.addView(this.f51308f1, 3, b8.mf.e(-1, -2, 17));
            } else {
                frameLayout.removeAllViews();
            }
            this.f51308f1.setTranslationX(l9() / 2.0f);
            int i10 = 1;
            String str = null;
            if (this.D0.O) {
                TextView textView = new TextView(getParentActivity());
                this.f51447q2 = textView;
                textView.setText(org.telegram.messenger.bd.M0(2131748218, null));
                this.f51447q2.setTextSize(1, 14.0f);
                this.f51447q2.setGravity(17);
                org.telegram.ui.ActionBar.r6.V(this.f51447q2, org.telegram.ui.ActionBar.k6.Wc, getResourceProvider());
                this.f51447q2.setBackground(new org.telegram.ui.ActionBar.v5(this.f51447q2, this.m1, org.telegram.messenger.g0.L(6.0f), getThemedPaint("paintChatActionBackground")));
                this.f51447q2.setTypeface(org.telegram.messenger.g0.o());
                this.f51447q2.setPadding(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(3.0f));
                this.f51308f1.addView(this.f51447q2, new FrameLayout.LayoutParams(-2, -2, 17));
            } else if (V9()) {
                lg.v1 v1Var = new lg.v1(getParentActivity(), this.f51325g4, this.f51475s4, this.f51311f4, getResourceProvider());
                this.f51360j1 = v1Var;
                int L = org.telegram.messenger.g0.L(24.0f);
                lg.v1 v1Var2 = this.f51360j1;
                kl klVar = this.m1;
                Paint themedPaint = getThemedPaint("paintChatActionBackground");
                int i11 = org.telegram.ui.ActionBar.k6.f27816a;
                v1Var.setBackground(new org.telegram.ui.ActionBar.v5(v1Var2, klVar, L, themedPaint));
                this.f51308f1.addView(this.f51360j1, b8.mf.e(-2, -2, 17));
                this.f51384l1.d(this.f51360j1, this.m1, new org.telegram.messenger.go(18), false);
            } else if (this.f51325g4 == 6) {
                Activity parentActivity = getParentActivity();
                TL_account.TL_businessChatLink tL_businessChatLink = this.f51297e4;
                org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
                ?? linearLayout = new LinearLayout(parentActivity);
                linearLayout.setOrientation(1);
                int i12 = org.telegram.ui.ActionBar.k6.Wc;
                org.telegram.ui.ActionBar.k6.w0(i12, resourceProvider);
                org.telegram.ui.ActionBar.k6.v0(i12);
                ImageView imageView = new ImageView(parentActivity);
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                imageView.setImageResource(2131231096);
                linearLayout.addView(imageView, b8.mf.t(78, 78, 49, 17, 17, 17, 9));
                TextView textView2 = new TextView(parentActivity);
                textView2.setTextAlignment(4);
                textView2.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(textView2, i12, resourceProvider);
                textView2.setGravity(1);
                textView2.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                textView2.setText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131752702, null)));
                linearLayout.addView(textView2, b8.mf.t(-2, -2, 49, 17, 0, 17, 9));
                TextView textView3 = new TextView(parentActivity);
                textView3.setTextAlignment(4);
                textView3.setTextSize(1, 13.0f);
                org.telegram.ui.ActionBar.r6.V(textView3, i12, resourceProvider);
                textView3.setTypeface(textView3.getTypeface(), 1);
                textView3.setGravity(1);
                textView3.setMaxWidth(org.telegram.messenger.g0.L(208.0f));
                String str2 = tL_businessChatLink.link;
                lg.z[] zVarArr = lg.z.f18522e;
                if (str2.startsWith("https://")) {
                    str2 = str2.substring(8);
                }
                textView3.setText(str2);
                textView3.setBackground(org.telegram.ui.ActionBar.k6.b0(503316480, 503316480, 5, 5));
                textView3.setPadding(org.telegram.messenger.g0.L(7.0f), 0, org.telegram.messenger.g0.L(7.0f), 0);
                textView3.setOnClickListener(new ai.d(25, tL_businessChatLink, this));
                linearLayout.addView(textView3, b8.mf.t(-2, -2, 49, 17, 0, 17, 17));
                this.k1 = linearLayout;
                linearLayout.setBackground(new org.telegram.ui.ActionBar.v5(this.k1, this.m1, org.telegram.messenger.g0.L(24.0f), getThemedPaint("paintChatActionBackground")));
                this.f51308f1.addView(this.k1, b8.mf.e(-2, -2, 17));
            } else if ((this.V9 != null && this.f51306f != null && !this.f51406n) || (this.f51466r8 != null && a() != getUserConfig().e() && ((this.f51466r8.contact_require_premium && !getUserConfig().q()) || this.f51466r8.send_paid_messages_stars > ci.e9.y(this.currentAccount, false).p().amount))) {
                this.f51335h1 = new vh(this, getParentActivity(), this.currentAccount, this.V9, this.f51557ya);
                Rc();
                this.f51335h1.setListener(new de(this, 4));
                LinearLayout linearLayout2 = new LinearLayout(getParentActivity());
                this.f51322g1 = linearLayout2;
                linearLayout2.setOrientation(1);
                this.f51322g1.setGravity(17);
                this.f51322g1.addView(this.f51335h1, b8.mf.e(-2, -2, 17));
                this.f51308f1.addView(this.f51322g1, b8.mf.e(-1, -2, 17));
                TLRPC.UserFull userFull = this.f51466r8;
                if (userFull != null && (tL_businessIntro2 = userFull.business_intro) != null) {
                    this.f51335h1.d(tL_businessIntro2.title, tL_businessIntro2.description);
                    this.f51335h1.setSticker(this.f51466r8.business_intro.sticker);
                }
                Qc();
            } else if (this.h == null) {
                if (this.f51525w4 && this.f51325g4 == 0) {
                    Activity parentActivity2 = getParentActivity();
                    kl klVar2 = this.m1;
                    um umVar = this.f51557ya;
                    LinearLayout linearLayout3 = new LinearLayout(parentActivity2);
                    int L2 = org.telegram.messenger.g0.L(18.0f);
                    if (umVar != null) {
                        paint = umVar.d("paintChatActionBackground");
                    } else {
                        paint = null;
                    }
                    if (paint == null) {
                        paint = org.telegram.ui.ActionBar.k6.V0("paintChatActionBackground");
                    }
                    int i13 = org.telegram.ui.ActionBar.k6.f27816a;
                    linearLayout3.setBackground(new org.telegram.ui.ActionBar.v5(linearLayout3, klVar2, L2, paint));
                    linearLayout3.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(12.0f));
                    linearLayout3.setOrientation(1);
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(parentActivity2);
                    if (org.telegram.ui.ActionBar.k6.i1(umVar)) {
                        i3 = org.telegram.ui.ActionBar.k6.Ja;
                    } else {
                        i3 = org.telegram.ui.ActionBar.k6.Wc;
                    }
                    TextView textView4 = new TextView(parentActivity2);
                    org.telegram.messenger.camera.q.m(textView4, 1, 15.0f);
                    org.telegram.ui.ActionBar.r6.V(textView4, i3, umVar);
                    textView4.setGravity(1);
                    textView4.setMaxWidth(org.telegram.messenger.g0.L(210.0f));
                    textView4.setText(org.telegram.messenger.bd.M0(2131754272, null));
                    TextView textView5 = new TextView(parentActivity2);
                    textView5.setTextSize(1, 13.0f);
                    org.telegram.ui.ActionBar.r6.V(textView5, i3, umVar);
                    textView5.setGravity(1);
                    textView5.setMaxWidth(org.telegram.messenger.g0.L(160.0f));
                    textView5.setText(org.telegram.messenger.bd.M0(2131744029, null));
                    linearLayout3.addView(k9Var, b8.mf.t(58, 58, 1, 0, 8, 0, 8));
                    linearLayout3.addView(textView4, b8.mf.t(-2, -2, 1, 0, 0, 2, 0));
                    linearLayout3.addView(textView5, b8.mf.r(-2, -2, 1));
                    TLRPC.Document T = org.telegram.messenger.li.b0(org.telegram.messenger.h10.f22829t0).T("🥳");
                    if (T != null) {
                        org.telegram.messenger.jz d = org.telegram.messenger.t5.d(T.thumbs, org.telegram.ui.ActionBar.k6.f27862c7, 0.2f, false);
                        if (d != null) {
                            d.f23763e = 512;
                            d.f23764f = 512;
                        }
                        k9Var.k(org.telegram.messenger.ac.b(T), null, "tgs", d, null);
                    }
                    this.f51308f1.addView(linearLayout3, new FrameLayout.LayoutParams(-2, -2, 17));
                } else if (!da() && this.f51325g4 == 0 && (((user2 = this.f51306f) != null && user2.self) || ((chat = this.f51292e) != null && chat.creator && !org.telegram.messenger.t3.V(chat)))) {
                    Activity parentActivity3 = getParentActivity();
                    kl klVar3 = this.m1;
                    if (this.f51292e == null) {
                        i10 = 2;
                    }
                    org.telegram.ui.Components.kn knVar = new org.telegram.ui.Components.kn(parentActivity3, klVar3, i10, this.f51557ya);
                    this.f51408n1 = knVar;
                    this.f51308f1.addView(knVar, new FrameLayout.LayoutParams(-2, -2, 17));
                    if (this.f51292e != null) {
                        this.f51408n1.setStatusText(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131749446, null)));
                    }
                } else {
                    if (da() && this.f51325g4 == 0) {
                        str = this.f51511v4 ? org.telegram.messenger.bd.M0(2131748234, null) : org.telegram.messenger.bd.M0(2131748176, null);
                    } else if (this.f51325g4 == 1) {
                        str = org.telegram.messenger.bd.M0(2131748169, null);
                    } else {
                        TLRPC.User user3 = this.f51306f;
                        if (user3 != null) {
                            long j10 = user3.f27150id;
                            if (j10 != 777000 && j10 != 429000 && j10 != 4244000 && org.telegram.messenger.hp.F2(user3)) {
                                str = org.telegram.messenger.bd.M0(2131749540, null);
                            }
                        }
                        if (this.f51325g4 != 8 && ((user = this.f51306f) == null || user.self || user.deleted || this.f51406n)) {
                            str = org.telegram.messenger.bd.M0(2131748201, null);
                        }
                    }
                    if (str == null) {
                        this.f51335h1 = new wh(this, getParentActivity(), this.currentAccount, this.V9, this.f51557ya);
                        Rc();
                        this.f51335h1.setListener(new de(this, 5));
                        TLRPC.UserFull userFull2 = this.f51466r8;
                        if (userFull2 != null && (tL_businessIntro = userFull2.business_intro) != null) {
                            this.f51335h1.d(tL_businessIntro.title, tL_businessIntro.description);
                            this.f51335h1.setSticker(this.f51466r8.business_intro.sticker);
                        }
                        LinearLayout linearLayout4 = new LinearLayout(getParentActivity());
                        this.f51322g1 = linearLayout4;
                        linearLayout4.setOrientation(1);
                        this.f51322g1.setGravity(17);
                        this.f51322g1.addView(this.f51335h1, b8.mf.e(-2, -2, 17));
                        this.f51308f1.addView(this.f51322g1, b8.mf.e(-1, -2, 17));
                        Qc();
                        return;
                    }
                    TextView textView6 = new TextView(getParentActivity());
                    this.f51447q2 = textView6;
                    textView6.setText(str);
                    this.f51447q2.setTextSize(1, 14.0f);
                    this.f51447q2.setGravity(17);
                    org.telegram.ui.ActionBar.r6.V(this.f51447q2, org.telegram.ui.ActionBar.k6.Wc, getResourceProvider());
                    this.f51447q2.setBackground(new org.telegram.ui.ActionBar.v5(this.f51447q2, this.m1, org.telegram.messenger.g0.L(30.0f), getThemedPaint("paintChatActionBackground")));
                    this.f51447q2.setTypeface(org.telegram.messenger.g0.o());
                    this.f51447q2.setPadding(org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(9.0f), org.telegram.messenger.g0.L(3.0f));
                    this.f51308f1.addView(this.f51447q2, new FrameLayout.LayoutParams(-2, -2, 17));
                }
            } else {
                this.f51408n1 = new org.telegram.ui.Components.kn(getParentActivity(), this.m1, 0, this.f51557ya);
                if (this.h.admin_id == getUserConfig().e()) {
                    this.f51408n1.setStatusText(org.telegram.messenger.bd.a0(null, null, 2131751134, org.telegram.messenger.l10.j(this.f51306f, true)));
                } else {
                    this.f51408n1.setStatusText(org.telegram.messenger.bd.a0(null, null, 2131751135, org.telegram.messenger.l10.j(this.f51306f, true)));
                }
                this.f51308f1.addView(this.f51408n1, new FrameLayout.LayoutParams(-2, -2, 17));
            }
        }
    }

    public final boolean V9() {
        int i3 = this.f51325g4;
        if (i3 != 5 && i3 != 9) {
            return false;
        }
        return true;
    }

    public final void Va(java.util.ArrayList r44, long r45, boolean r47, boolean r48) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Va(java.util.ArrayList, long, boolean, boolean):void");
    }

    public final boolean Vb() {
        if (R9() && this.E5 == null && this.G5 == null) {
            if (this.f51325g4 != 8 && R9() && this.f51292e != null) {
                TLRPC.TL_forumTopic f10 = getMessagesController().f23102q7.f(this.f51292e.f27001id, 1L);
                if (this.f51325g4 != 8) {
                    if (f10 != null) {
                        if (f10.closed && !org.telegram.messenger.t3.i(this.currentAccount, this.f51292e, f10)) {
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

    public final void Vc(org.telegram.messenger.zi ziVar, boolean z10) {
        org.telegram.messenger.zi ziVar2;
        if (this.D0 != null && this.fragmentView != null) {
            org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) this.O6.f(ziVar.d1());
            if (uiVar != null) {
                ArrayList arrayList = uiVar.d;
                yi yiVar = this.B0;
                if (yiVar != null) {
                    yiVar.V(uiVar);
                }
                for (int i3 = 0; i3 < arrayList.size(); i3++) {
                    ((org.telegram.messenger.zi) arrayList.get(i3)).K1 = true;
                    if (z10) {
                        ((org.telegram.messenger.zi) arrayList.get(i3)).H = true;
                    }
                }
                this.D0.O(true);
                return;
            }
            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) this.F6[0].get(ziVar.f1());
            if (z10) {
                ziVar.K1 = true;
                ziVar.H = true;
            }
            if (this.D0.O) {
                a0.h hVar = this.f51494tb;
                if (hVar != null) {
                    ziVar2 = (org.telegram.messenger.zi) hVar.f(ziVar.f1());
                } else {
                    ziVar2 = null;
                }
                int indexOf = this.D0.Q.indexOf(ziVar2);
                if (ziVar2 != null && z10) {
                    ziVar2.K1 = true;
                    ziVar2.H = true;
                }
                if (indexOf >= 0) {
                    fl flVar = this.D0;
                    flVar.g(flVar.K + indexOf);
                    return;
                }
                return;
            }
            int indexOf2 = this.L6.indexOf(ziVar3);
            if (indexOf2 >= 0) {
                fl flVar2 = this.D0;
                flVar2.g(flVar2.K + indexOf2);
            }
        }
    }

    public final void W6() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.W6():void");
    }

    public final org.telegram.messenger.zv W8() {
        ?? obj = new Object();
        int i3 = this.f51325g4;
        if (i3 == 9) {
            obj.f18042a = this.Na;
        }
        if (i3 == 5) {
            String str = this.f51311f4;
            int b92 = b9();
            obj.f18044c = str;
            obj.f18043b = b92;
        }
        return new org.telegram.messenger.zv(obj);
    }

    public final boolean W9() {
        return !TextUtils.isEmpty(this.f51363j4);
    }

    public final void Wa(int i3, String str, CharacterStyle characterStyle, org.telegram.ui.Cells.q1 q1Var, boolean z10) {
        boolean z11;
        org.telegram.ui.Components.ty0 ty0Var;
        String K0;
        boolean z12;
        boolean z13 = false;
        try {
            K0 = org.telegram.messenger.g0.K0(str, false);
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        if (this.h != null) {
            if (getMessagesController().H2 == 1) {
            }
            if (z10 && !org.telegram.messenger.g0.J3(str)) {
                if (i3 == 0) {
                    sf.c.r(getParentActivity(), Uri.parse(str), true, true, ka(q1Var, characterStyle));
                    return;
                } else if (i3 == 1) {
                    Activity parentActivity = getParentActivity();
                    Uri parse = Uri.parse(str);
                    if (this.f51529w8 == 0) {
                        z13 = true;
                    }
                    sf.c.r(parentActivity, parse, z13, true, ka(q1Var, characterStyle));
                    return;
                } else if (i3 == 2) {
                    Activity parentActivity2 = getParentActivity();
                    Uri parse2 = Uri.parse(str);
                    if (this.f51529w8 == 0) {
                        z13 = true;
                    }
                    sf.c.r(parentActivity2, parse2, z13, true, ka(q1Var, characterStyle));
                    return;
                } else {
                    return;
                }
            } else if (i3 == 0 && i3 != 2) {
                if (i3 == 1) {
                    org.telegram.ui.Components.t4.q0(this, str, true, true, false, false, ka(q1Var, characterStyle), null, this.f51557ya);
                    return;
                }
                return;
            } else {
                if (!(characterStyle instanceof org.telegram.ui.Components.x31) && (ty0Var = ((org.telegram.ui.Components.x31) characterStyle).f40213a) != null && (ty0Var.f38578a & 1024) != 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.t4.q0(this, str, true, true, true, z11, ka(q1Var, characterStyle), null, this.f51557ya);
            }
        }
        if (getMessagesController().f23006f4.contains(K0)) {
            org.telegram.messenger.yy sendMessagesHelper = getSendMessagesHelper();
            if (i3 != 0 && i3 != 2) {
                z12 = false;
                sendMessagesHelper.getClass();
                TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth = new TLRPC.TL_messages_requestUrlAuth();
                tL_messages_requestUrlAuth.url = str;
                tL_messages_requestUrlAuth.flags |= 4;
                sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth, new org.telegram.messenger.q4(sendMessagesHelper, tL_messages_requestUrlAuth, this, str, z12), 2);
                return;
            }
            z12 = true;
            sendMessagesHelper.getClass();
            TLRPC.TL_messages_requestUrlAuth tL_messages_requestUrlAuth2 = new TLRPC.TL_messages_requestUrlAuth();
            tL_messages_requestUrlAuth2.url = str;
            tL_messages_requestUrlAuth2.flags |= 4;
            sendMessagesHelper.getConnectionsManager().sendRequest(tL_messages_requestUrlAuth2, new org.telegram.messenger.q4(sendMessagesHelper, tL_messages_requestUrlAuth2, this, str, z12), 2);
            return;
        }
        if (z10) {
        }
        if (i3 == 0) {
        }
        if (!(characterStyle instanceof org.telegram.ui.Components.x31)) {
        }
        z11 = false;
        org.telegram.ui.Components.t4.q0(this, str, true, true, true, z11, ka(q1Var, characterStyle), null, this.f51557ya);
    }

    public final void Wb() {
        if (getParentActivity() == null) {
            return;
        }
        org.telegram.ui.Components.fc.a0(this).t(org.telegram.messenger.bd.M0(2131743843, null), this.f51557ya).j();
    }

    public final void Wc() {
        org.telegram.ui.ActionBar.f1 f1Var;
        int i3;
        if (this.h != null) {
            return;
        }
        wi wiVar = this.A0;
        fj fjVar = this.X1;
        if ((fjVar != null && fjVar.J) || ((f1Var = this.f51316f9) != null && f1Var.isShowing())) {
            i3 = 4;
        } else {
            i3 = 0;
        }
        wiVar.setImportantForAccessibility(i3);
    }

    public final void X6(int i3, View view, boolean z10) {
        int i10;
        if (view != null) {
            float f10 = (1.0f - this.f51264bd.f53840e) * (1.0f - this.Zc.f53840e) * ((float[]) this.f51333gd.f18089b)[i3];
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

    public final boolean X7(android.view.View r95, boolean r96, boolean r97, float r98, float r99, boolean r100, boolean r101, boolean r102) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.X7(android.view.View, boolean, boolean, float, float, boolean, boolean, boolean):boolean");
    }

    public final boolean X9() {
        int i3 = this.f51325g4;
        if (((i3 == 0 && this.f51475s4 == 0) || i3 == 3) && this.f51376k6 == getUserConfig().e() && !W9()) {
            return true;
        }
        return false;
    }

    public final void Xa(final org.telegram.tgnet.TLRPC.TL_messages_discussionMessage r13, org.telegram.tgnet.TLRPC.messages_Messages r14, final int r15, final org.telegram.messenger.zi r16, final org.telegram.tgnet.TLRPC.TL_messages_getDiscussionMessage r17, final org.telegram.tgnet.TLRPC.Chat r18, final int r19, final org.telegram.messenger.zi r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Xa(org.telegram.tgnet.TLRPC$TL_messages_discussionMessage, org.telegram.tgnet.TLRPC$messages_Messages, int, org.telegram.messenger.zi, org.telegram.tgnet.TLRPC$TL_messages_getDiscussionMessage, org.telegram.tgnet.TLRPC$Chat, int, org.telegram.messenger.zi):void");
    }

    public final void Xb(org.telegram.ui.Cells.q1 q1Var) {
        if (getParentActivity() != null && q1Var != null && q1Var.y9 != null && q1Var.getPrimaryMessageObject() != null && q1Var.getPrimaryMessageObject().f26868k != null && q1Var.getPrimaryMessageObject().f26868k.via_business_bot_id != 0 && !getMessagesController().f22999e7.getBoolean("bizbothint", false)) {
            getMessagesController().f22999e7.edit().putBoolean("bizbothint", true).apply();
            if (!this.f51468rb) {
                this.f51468rb = true;
                if (this.O1 != null) {
                    return;
                }
                gi.l3 l3Var = new gi.l3(getParentActivity(), 3);
                l3Var.r(true);
                l3Var.L = Layout.Alignment.ALIGN_NORMAL;
                l3Var.d = -1L;
                l3Var.U = true;
                l3Var.f13084e = true;
                l3Var.k(true);
                l3Var.s(8.0f);
                this.O1 = l3Var;
                l3Var.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.M0(2131748606, null)));
                this.O1.l(this.L);
                gi.l3 l3Var2 = this.O1;
                l3Var2.h = gi.l3.a(l3Var2.getText(), this.O1.getTextPaint());
                this.m1.addView(this.O1, b8.mf.d(-1, 120.0f, 55, 16.0f, 0.0f, 16.0f, 0.0f));
                this.m1.post(new sc(7, this, q1Var));
            }
        }
    }

    public final void Xc(ArrayList arrayList, boolean z10) {
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            this.D0.R((org.telegram.messenger.zi) arrayList.get(i3), false, z10);
        }
    }

    @Override
    public final void Y(int i3, float f10, float f11, qe.c cVar) {
        boolean z10;
        int i10;
        int i11;
        if (i3 == 0) {
            sa();
            return;
        }
        boolean z11 = true;
        int i12 = 4;
        int i13 = 0;
        if (i3 == 1) {
            View view = this.V;
            if (view != null) {
                view.setAlpha(f10);
                View view2 = this.V;
                if (f10 > 0.0f) {
                    i12 = 0;
                }
                view2.setVisibility(i12);
            }
        } else if (i3 == 2) {
            sa();
            G7();
            th.b bVar = this.f51345hd;
            if (bVar != null) {
                bVar.setAnimatedVisibility(this.f51264bd.f53840e);
            }
        } else {
            int i14 = 8;
            if (i3 == 3) {
                qe.a aVar = this.f51277cd;
                float f12 = 1.0f - aVar.f53840e;
                this.f51252b1.setAlpha(f12);
                org.telegram.ui.Components.jg jgVar = this.f51252b1;
                if (f12 > 0.0f) {
                    i11 = 0;
                } else {
                    i11 = 8;
                }
                jgVar.setVisibility(i11);
                float f13 = 1.0f - aVar.f53840e;
                org.telegram.ui.Components.g11 g11Var = this.f51323g2;
                if (g11Var != null) {
                    g11Var.setAlpha(f13);
                    org.telegram.ui.Components.g11 g11Var2 = this.f51323g2;
                    if (f13 <= 0.0f) {
                        i13 = 8;
                    }
                    g11Var2.setVisibility(i13);
                }
            } else if (i3 == 4) {
                ai.o2 o2Var = this.Z3;
                qe.a aVar2 = this.f51291dd;
                if (o2Var != null) {
                    float f14 = aVar2.f53840e;
                    o2Var.setAlpha(f14);
                    ai.o2 o2Var2 = this.Z3;
                    if (f14 > 0.0f) {
                        i14 = 0;
                    }
                    o2Var2.setVisibility(i14);
                }
                if (aVar2.f53840e < 1.0f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                mh.f fVar = this.Z;
                if (z10) {
                    i10 = 0;
                } else {
                    i10 = 4;
                }
                fVar.setVisibility(i10);
                z7();
                if (aVar2.f53840e >= 1.0f) {
                    z11 = false;
                }
                wi wiVar = this.A0;
                if (z11) {
                    i12 = 0;
                }
                wiVar.setVisibility(i12);
                G7();
                J7();
                I7();
                this.glassEngine.g();
            } else if (i3 == 5) {
                y7();
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.setSearchFactor(f10);
                }
            } else if (i3 == 6) {
                D7();
            }
        }
    }

    public final boolean Y6() {
        boolean z10;
        TLRPC.ChatFull chatFull = this.f51453q8;
        if (chatFull != null && chatFull.boosts_unrestrict > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
            vg.i0.w1(this, this.S1, this.T1, this.f51376k6, false);
        }
        return z10;
    }

    public final int Y8(org.telegram.messenger.zi r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Y8(org.telegram.messenger.zi):int");
    }

    public final boolean Y9() {
        org.telegram.ui.Components.g11 g11Var = this.f51323g2;
        if (g11Var != null && g11Var.U && g11Var.f33918a.f53841f) {
            return true;
        }
        return false;
    }

    public final void Ya(java.util.ArrayList r46, boolean r47) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Ya(java.util.ArrayList, boolean):void");
    }

    public final void Yb(boolean z10, boolean z11) {
        int i3;
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
        if (!z10 || this.J0.getTag() == null) {
            if (!z10 && this.J0.getTag() == null) {
                return;
            }
            AnimatorSet animatorSet = this.W0;
            Integer num = null;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.W0 = null;
            }
            RadialProgressView radialProgressView = this.J0;
            if (z10) {
                num = 1;
            }
            radialProgressView.setTag(num);
            float f17 = 0.1f;
            if (z11) {
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.W0 = animatorSet2;
                if (z10) {
                    this.J0.setVisibility(0);
                    AnimatorSet animatorSet3 = this.W0;
                    rj rjVar = this.E0;
                    Property property = View.SCALE_X;
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(rjVar, property, 0.1f);
                    rj rjVar2 = this.E0;
                    Property property2 = View.SCALE_Y;
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(rjVar2, property2, 0.1f);
                    rj rjVar3 = this.E0;
                    Property property3 = View.ALPHA;
                    animatorSet3.playTogether(ofFloat, ofFloat2, ObjectAnimator.ofFloat(rjVar3, property3, 0.0f), ObjectAnimator.ofFloat(this.J0, property, 1.0f), ObjectAnimator.ofFloat(this.J0, property2, 1.0f), ObjectAnimator.ofFloat(this.J0, property3, 1.0f));
                    this.W0.setStartDelay(200L);
                } else {
                    if (this.F0) {
                        obj = this.G0;
                    } else {
                        obj = this.E0;
                    }
                    RadialProgressView radialProgressView2 = this.J0;
                    Property property4 = View.SCALE_X;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(radialProgressView2, property4, 0.1f);
                    RadialProgressView radialProgressView3 = this.J0;
                    Property property5 = View.SCALE_Y;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(radialProgressView3, property5, 0.1f);
                    RadialProgressView radialProgressView4 = this.J0;
                    Property property6 = View.ALPHA;
                    animatorSet2.playTogether(ofFloat3, ofFloat4, ObjectAnimator.ofFloat(radialProgressView4, property6, 0.0f), ObjectAnimator.ofFloat(obj, property4, 1.0f), ObjectAnimator.ofFloat(obj, property5, 1.0f), ObjectAnimator.ofFloat(obj, property6, 1.0f));
                }
                this.W0.addListener(new dh.x(28, this, z10));
                this.W0.setDuration(150L);
                this.W0.start();
                return;
            }
            RadialProgressView radialProgressView5 = this.J0;
            if (z10) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            radialProgressView5.setVisibility(i3);
            RadialProgressView radialProgressView6 = this.J0;
            if (z10) {
                f10 = 1.0f;
            } else {
                f10 = 0.1f;
            }
            radialProgressView6.setScaleX(f10);
            RadialProgressView radialProgressView7 = this.J0;
            if (z10) {
                f11 = 1.0f;
            } else {
                f11 = 0.1f;
            }
            radialProgressView7.setScaleY(f11);
            this.J0.setAlpha(1.0f);
            rj rjVar4 = this.E0;
            if (!z10 && !this.F0) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            rjVar4.setVisibility(i10);
            org.telegram.ui.Components.s70 s70Var = this.G0;
            if (!z10 && this.F0) {
                i11 = 0;
            } else {
                i11 = 4;
            }
            s70Var.setVisibility(i11);
            rj rjVar5 = this.E0;
            if (!z10 && !this.F0) {
                f12 = 1.0f;
            } else {
                f12 = 0.1f;
            }
            rjVar5.setScaleX(f12);
            org.telegram.ui.Components.s70 s70Var2 = this.G0;
            if (!z10 && this.F0) {
                f13 = 1.0f;
            } else {
                f13 = 0.1f;
            }
            s70Var2.setScaleX(f13);
            rj rjVar6 = this.E0;
            if (!z10 && !this.F0) {
                f14 = 1.0f;
            } else {
                f14 = 0.1f;
            }
            rjVar6.setScaleY(f14);
            org.telegram.ui.Components.s70 s70Var3 = this.G0;
            if (!z10 && this.F0) {
                f17 = 1.0f;
            }
            s70Var3.setScaleY(f17);
            rj rjVar7 = this.E0;
            if (!z10 && !this.F0) {
                f15 = 1.0f;
            } else {
                f15 = 0.0f;
            }
            rjVar7.setAlpha(f15);
            org.telegram.ui.Components.s70 s70Var4 = this.G0;
            if (!z10 && this.F0) {
                f16 = 1.0f;
            } else {
                f16 = 0.0f;
            }
            s70Var4.setAlpha(f16);
        }
    }

    public final void Yc() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.Yc():void");
    }

    public final void Z6(boolean z10) {
        if (this.f51300e7 == 0) {
            if (z10 && !this.f51314f7.isEmpty()) {
                this.f51300e7 = System.currentTimeMillis();
            } else {
                this.f51300e7 = 1L;
            }
            ba();
            wi wiVar = this.A0;
            if (wiVar != null) {
                wiVar.invalidate();
            }
        }
    }

    public final void Z7() {
        if (this.h == null && this.M2 == null && getParentActivity() != null) {
            jk jkVar = new jk(this, getParentActivity());
            this.M2 = jkVar;
            jkVar.setTag(1);
            this.f51252b1.addView(this.M2, b8.mf.o(-1, 48));
            this.f51252b1.h(1, this.M2);
            this.f51252b1.g(this.M2);
            this.M2.setOnClickListener(new je(this, 17));
            this.M2.setEnabled(!isInPreviewMode());
            this.M2.setBackground(org.telegram.ui.ActionBar.k6.N0(false));
            org.telegram.ui.Components.xd0 xd0Var = new org.telegram.ui.Components.xd0(getParentActivity(), this.f51557ya);
            this.O2 = xd0Var;
            this.M2.addView(xd0Var, b8.mf.d(3, 48.0f, 51, 13.0f, 0.0f, 0.0f, 0.0f));
            this.M2.setClipChildren(false);
            NumberTextView numberTextView = new NumberTextView(getParentActivity());
            this.U2 = numberTextView;
            numberTextView.h = true;
            numberTextView.setTextSize(14);
            this.U2.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Te));
            this.U2.setTypeface(org.telegram.messenger.g0.o());
            this.M2.addView(this.U2, b8.mf.d(-1, 18.0f, 51, 23.0f, 7.0f, 44.0f, 0.0f));
            for (int i3 = 0; i3 < 2; i3++) {
                vm vmVar = new vm(this, getParentActivity());
                vm[] vmVarArr = this.R2;
                vmVarArr[i3] = vmVar;
                vmVar.setTextSize(14);
                org.telegram.ui.ActionBar.r6.Y(vmVarArr[i3], org.telegram.ui.ActionBar.k6.Te, getResourceProvider());
                vmVarArr[i3].setTypeface(org.telegram.messenger.g0.o());
                this.M2.addView(vmVarArr[i3], b8.mf.d(-1, 18.0f, 51, 23.0f, 7.3f, 44.0f, 0.0f));
                kk kkVar = new kk(0, getParentActivity(), this);
                org.telegram.ui.ActionBar.k5[] k5VarArr = this.S2;
                k5VarArr[i3] = kkVar;
                kkVar.setTextSize(14);
                org.telegram.ui.ActionBar.r6.Y(k5VarArr[i3], org.telegram.ui.ActionBar.k6.Ue, getResourceProvider());
                this.M2.addView(k5VarArr[i3], b8.mf.d(-1, 18.0f, 51, 23.0f, 25.3f, 44.0f, 0.0f));
                lm lmVar = new lm(this, getParentActivity());
                lm[] lmVarArr = this.T2;
                lmVarArr[i3] = lmVar;
                this.M2.addView(lmVar, b8.mf.d(-2, 28.0f, 53, 0.0f, 10.0f, 14.0f, 0.0f));
                lk lkVar = new lk(getParentActivity());
                lkVar.J = new yh.f();
                lkVar.I = new Path();
                lkVar.K = new float[8];
                org.telegram.ui.Components.k9[] k9VarArr = this.Q2;
                k9VarArr[i3] = lkVar;
                lkVar.setBlurAllowed(true);
                k9VarArr[i3].setRoundRadius(org.telegram.messenger.g0.L(2.0f));
                this.M2.addView(k9VarArr[i3], b8.mf.d(32, 32.0f, 51, 22.0f, 8.0f, 0.0f, 0.0f));
                if (i3 == 1) {
                    vmVarArr[i3].setVisibility(4);
                    lmVarArr[i3].setVisibility(4);
                    k5VarArr[i3].setVisibility(4);
                    k9VarArr[i3].setVisibility(4);
                }
            }
            ImageView imageView = new ImageView(getParentActivity());
            this.f51240a3 = imageView;
            imageView.setImageResource(2131232297);
            ImageView imageView2 = this.f51240a3;
            int i10 = org.telegram.ui.ActionBar.k6.Re;
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView2, i10, resourceProvider, mode);
            ImageView imageView3 = this.f51240a3;
            ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
            imageView3.setScaleType(scaleType);
            this.f51240a3.setContentDescription(org.telegram.messenger.bd.M0(2131754723, null));
            this.f51240a3.setVisibility(4);
            this.f51240a3.setAlpha(0.0f);
            this.f51240a3.setScaleX(0.4f);
            this.f51240a3.setScaleY(0.4f);
            ImageView imageView4 = this.f51240a3;
            int i11 = org.telegram.ui.ActionBar.k6.f28255x7;
            org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11) & 436207615, 1, -1), null, org.telegram.ui.ActionBar.r6.h(i11, 25), getResourceProvider());
            this.M2.addView(this.f51240a3, b8.mf.d(36, 48.0f, 53, 0.0f, 0.0f, 7.0f, 0.0f));
            this.f51240a3.setOnClickListener(new je(this, 18));
            ImageView imageView5 = new ImageView(getParentActivity());
            this.Y2 = imageView5;
            imageView5.setImageResource(2131231983);
            org.telegram.ui.ActionBar.r6.t(this.Y2, i10, getResourceProvider(), mode);
            this.Y2.setScaleType(scaleType);
            this.Y2.setVisibility(8);
            this.Y2.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
            RadialProgressView radialProgressView = new RadialProgressView(getParentActivity(), this.f51557ya);
            this.Z2 = radialProgressView;
            radialProgressView.setVisibility(8);
            this.Z2.setSize(org.telegram.messenger.g0.L(16.0f));
            this.Z2.setStrokeWidth(2.0f);
            this.Z2.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Se));
            this.M2.addView(this.Z2, b8.mf.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            org.telegram.ui.ActionBar.r6.R(this.Y2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i11) & 436207615, 1, org.telegram.messenger.g0.L(14.0f)), null, org.telegram.ui.ActionBar.r6.h(i11, 25), getResourceProvider());
            this.M2.addView(this.Y2, b8.mf.d(36, 48.0f, 53, 0.0f, 0.0f, 2.0f, 0.0f));
            this.Y2.setOnClickListener(new je(this, 19));
            bd(false);
        }
    }

    public final int Z8() {
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        int i3 = 0;
        if (q4Var == null || q4Var.getFragmentStack() == null) {
            return 0;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        if (indexOf == -1) {
            indexOf = this.parentLayout.getFragmentStack().size();
        }
        while (true) {
            if (i3 < this.parentLayout.getFragmentStack().size()) {
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(i3);
                if (d2Var != this && (d2Var instanceof wm) && ((wm) d2Var).f51376k6 == this.f51376k6) {
                    break;
                }
                i3++;
            } else {
                i3 = indexOf;
                break;
            }
        }
        return i3 - indexOf;
    }

    public final boolean Z9() {
        org.telegram.ui.Components.g11 g11Var = this.f51323g2;
        if (g11Var != null) {
            return g11Var.f33922c;
        }
        if (org.telegram.messenger.t3.c0(this.f51292e) && N6()) {
            return true;
        }
        return false;
    }

    public final void Za(int i3) {
        boolean z10;
        int i10;
        TLRPC.TL_chatBannedRights tL_chatBannedRights;
        boolean z11 = false;
        if (i3 == 0) {
            int i11 = Build.VERSION.SDK_INT;
            if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 19);
                return;
            }
            try {
                Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
                File q02 = org.telegram.messenger.g0.q0(null, false);
                if (q02 != null) {
                    if (i11 >= 24) {
                        Activity parentActivity = getParentActivity();
                        org.telegram.messenger.t0.d();
                        intent.putExtra("output", FileProvider.d(parentActivity, "org.telegram.messenger.beta.provider", q02));
                        intent.addFlags(2);
                        intent.addFlags(1);
                    } else {
                        intent.putExtra("output", Uri.fromFile(q02));
                    }
                    this.f51401m8 = q02.getAbsolutePath();
                }
                startActivityForResult(intent, 0);
                return;
            } catch (Exception e10) {
                org.telegram.messenger.a8.g(e10, true);
                return;
            }
        }
        try {
            if (i3 == 1) {
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
                if (org.telegram.messenger.t3.T(this.f51292e) && (tL_chatBannedRights = this.f51292e.banned_rights) != null && tL_chatBannedRights.send_gifs) {
                    z10 = false;
                } else {
                    z10 = true;
                }
                hm0 hm0Var = new hm0(0, z10, true, this);
                if (this.f51325g4 == 9) {
                    hm0Var.H = 1;
                    hm0Var.I = true;
                } else {
                    TLRPC.Chat chat = this.f51292e;
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f51292e.slowmode_enabled) {
                        hm0Var.H = 10;
                        hm0Var.I = true;
                    } else {
                        org.telegram.messenger.zi ziVar = this.G5;
                        if (ziVar != null) {
                            i10 = 1;
                        } else {
                            i10 = 0;
                        }
                        if (ziVar == null) {
                            z11 = true;
                        }
                        hm0Var.H = i10;
                        hm0Var.I = z11;
                    }
                }
                hm0Var.W = new si(this);
                presentFragment(hm0Var);
            } else if (i3 == 2) {
                int i12 = Build.VERSION.SDK_INT;
                if (getParentActivity().checkSelfPermission("android.permission.CAMERA") != 0) {
                    getParentActivity().requestPermissions(new String[]{"android.permission.CAMERA"}, 20);
                    return;
                }
                try {
                    Intent intent2 = new Intent("android.media.action.VIDEO_CAPTURE");
                    File s02 = org.telegram.messenger.g0.s0(false);
                    if (s02 != null) {
                        if (i12 >= 24) {
                            Activity parentActivity3 = getParentActivity();
                            org.telegram.messenger.t0.d();
                            intent2.putExtra("output", FileProvider.d(parentActivity3, "org.telegram.messenger.beta.provider", s02));
                            intent2.addFlags(2);
                            intent2.addFlags(1);
                        } else {
                            intent2.putExtra("output", Uri.fromFile(s02));
                        }
                        intent2.putExtra("android.intent.extra.sizeLimit", 2097152000L);
                        this.f51401m8 = s02.getAbsolutePath();
                    }
                    startActivityForResult(intent2, 2);
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public final void Zb(Runnable runnable) {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.bd.M0(2131752713, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752714, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751407, null), new se(0, runnable));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(s1Var);
        TextView textView = (TextView) s1Var.d(-1);
        if (textView != null) {
            org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, getResourceProvider());
        }
    }

    public final void Zc() {
        boolean z10;
        boolean z11;
        if (this.f51549y1 == null) {
            return;
        }
        if (this.A9 && !y9() && !this.f51237a0.u0() && !this.jb && (!this.H3 || getMediaDataController().Z0.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            if (this.f51327g6 != 0 && SystemClock.elapsedRealtime() >= this.f51327g6 + 150) {
                z11 = true;
            } else {
                z11 = false;
            }
            this.f51560z1 = false;
        } else {
            this.S7 = 0;
            this.A6 = 0;
            z11 = true;
        }
        this.f51549y1.e(1, z10, z11);
    }

    public long a() {
        return this.f51376k6;
    }

    public final void a7(CharSequence charSequence) {
        boolean z10;
        TLRPC.WebPage webPage;
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.zi ziVar2 = this.G5;
        if (ziVar2 != null && (message = ziVar2.f26868k) != null && (messageMedia = message.media) != null && (webPage2 = messageMedia.webpage) != null && !(webPage2 instanceof TLRPC.TL_webPageEmpty) && messageMedia.manual) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f51526w5 != null && ziVar2 != null) {
            int i3 = ziVar2.D;
            if ((i3 == 0 || i3 == 19) && (webPage = this.X5) != null) {
                String str = webPage.url;
                if (str != null) {
                    try {
                        SpannableString valueOf = SpannableString.valueOf(charSequence);
                        try {
                            org.telegram.messenger.g0.c(valueOf, 1, false, true);
                        } catch (Exception e10) {
                            org.telegram.messenger.a8.g(e10, true);
                        }
                        for (URLSpan uRLSpan : (URLSpan[]) valueOf.getSpans(0, valueOf.length(), URLSpan.class)) {
                            if (org.telegram.messenger.dj.a(uRLSpan.getURL(), str)) {
                                return;
                            }
                        }
                    } catch (Exception e11) {
                        org.telegram.messenger.a8.g(e11, true);
                    }
                }
                if (z10) {
                    this.X5 = null;
                    mj mjVar = this.f51237a0;
                    if (mjVar != null) {
                        mjVar.Y2 = null;
                        mjVar.Z2 = true;
                    }
                    org.telegram.messenger.dj djVar = this.f51526w5;
                    if (djVar != null) {
                        int i10 = this.currentAccount;
                        CharSequence fieldText = mjVar.getFieldText();
                        org.telegram.messenger.zi ziVar3 = this.E5;
                        if (ziVar3 == this.f51397m4) {
                            ziVar = null;
                        } else {
                            ziVar = ziVar3;
                        }
                        djVar.e(i10, null, fieldText, ziVar, this.C5, this.G5);
                    }
                    x8();
                    z8();
                }
            }
        }
    }

    public final void a8() {
        int i3;
        int i10;
        if (this.f51324g3 == null && getParentActivity() != null) {
            pj pjVar = new pj(this, getParentActivity(), 1);
            this.f51324g3 = pjVar;
            pjVar.setClickable(false);
            this.f51324g3.setWillNotDraw(false);
            this.f51333gd.h(4, false, false);
            this.f51324g3.setClipToPadding(false);
            org.telegram.ui.Components.h6 h6Var = new org.telegram.ui.Components.h6(getParentActivity(), true, true, true);
            this.f51362j3 = h6Var;
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.h;
            h6Var.b(0.25f, 280L, xqVar);
            this.f51362j3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f51362j3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.Z(this.f51362j3, org.telegram.ui.ActionBar.k6.nf, getResourceProvider());
            this.f51362j3.setGravity(3);
            this.f51324g3.addView(this.f51362j3, b8.mf.d(-2, 30.0f, 16, 0.0f, -1.0f, 97.33f, 0.0f));
            this.W.addView(this.f51324g3, b8.mf.d(-1, 44.0f, 80, 7.0f, 0.0f, 7.0f, 0.0f));
            org.telegram.ui.Components.h6 h6Var2 = new org.telegram.ui.Components.h6(getParentActivity(), true, false, true);
            this.f51373k3 = h6Var2;
            h6Var2.b(0.0f, 420L, xqVar);
            this.f51373k3.setScaleProperty(0.7f);
            this.f51373k3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            this.f51373k3.setGravity(5);
            this.f51373k3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.Z(this.f51373k3, org.telegram.ui.ActionBar.k6.f28081o6, getResourceProvider());
            org.telegram.ui.Components.h6 h6Var3 = this.f51373k3;
            if (this.f51291dd.f53841f) {
                i3 = 2131745828;
            } else {
                i3 = 2131745827;
            }
            h6Var3.setText(org.telegram.messenger.bd.M0(i3, null));
            org.telegram.ui.Components.h6 h6Var4 = this.f51373k3;
            h6Var4.f34310n = false;
            h6Var4.setPadding(org.telegram.messenger.g0.L(15.33f), 0, org.telegram.messenger.g0.L(15.33f), 0);
            this.f51373k3.setOnClickListener(new je(this, 2));
            this.f51373k3.setAlpha(0.5f);
            this.f51373k3.setClickable(false);
            this.f51324g3.addView(this.f51373k3, b8.mf.e(-2, -1, 117));
            org.telegram.ui.Components.h6 h6Var5 = new org.telegram.ui.Components.h6(getParentActivity(), true, true, true);
            this.f51386l3 = h6Var5;
            h6Var5.setGravity(17);
            this.f51386l3.setTypeface(org.telegram.messenger.g0.o());
            org.telegram.ui.ActionBar.r6.Z(this.f51386l3, org.telegram.ui.ActionBar.k6.f28110pf, getResourceProvider());
            this.f51386l3.setTextSize(org.telegram.messenger.g0.L(15.0f));
            org.telegram.ui.Components.h6 h6Var6 = this.f51386l3;
            int i11 = org.telegram.ui.ActionBar.k6.f27878d6;
            int themedColor = getThemedColor(i11);
            int themedColor2 = getThemedColor(i11);
            int i12 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.r6.R(h6Var6, org.telegram.ui.ActionBar.k6.i0(themedColor, org.telegram.ui.ActionBar.k6.w(themedColor2, getThemedColor(i12))), org.telegram.ui.ActionBar.r6.N(i11), org.telegram.ui.ActionBar.r6.q(i11, i12), getResourceProvider());
            org.telegram.ui.Components.h6 h6Var7 = this.f51386l3;
            if (this.D0.O) {
                i10 = 2131745893;
            } else {
                i10 = 2131745876;
            }
            h6Var7.setText(org.telegram.messenger.bd.M0(i10, null));
            this.f51386l3.setOnClickListener(new je(this, 3));
            this.f51386l3.setVisibility(8);
            this.f51386l3.setAlpha(0.0f);
            this.f51324g3.addView(this.f51386l3, b8.mf.e(-1, -1, 119));
            TLRPC.Chat chat = this.f51292e;
            if (chat != null && ((!org.telegram.messenger.t3.T(chat) || this.f51292e.megagroup) && this.f51325g4 != 7 && !org.telegram.messenger.t3.p0(this.f51292e))) {
                ImageView imageView = new ImageView(getParentActivity());
                this.i3 = imageView;
                imageView.setScaleType(ImageView.ScaleType.CENTER);
                this.i3.setImageResource(2131232417);
                org.telegram.ui.ActionBar.r6.t(this.i3, org.telegram.ui.ActionBar.k6.f28052mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView2 = this.i3;
                int i13 = org.telegram.ui.ActionBar.k6.f28292z8;
                org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i13), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i13), getResourceProvider());
                this.f51324g3.addView(this.i3, b8.mf.d(44, 44.0f, 51, 48.0f, 0.0f, 0.0f, 0.0f));
                this.i3.setOnClickListener(new je(this, 4));
                this.i3.setContentDescription(org.telegram.messenger.bd.M0(2131754780, null));
            }
            if (this.f51325g4 != 7) {
                ImageView imageView3 = new ImageView(getParentActivity());
                this.f51337h3 = imageView3;
                imageView3.setScaleType(ImageView.ScaleType.CENTER);
                this.f51337h3.setImageResource(2131232076);
                org.telegram.ui.ActionBar.r6.t(this.f51337h3, org.telegram.ui.ActionBar.k6.f28052mf, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                ImageView imageView4 = this.f51337h3;
                int i14 = org.telegram.ui.ActionBar.k6.f28292z8;
                org.telegram.ui.ActionBar.r6.R(imageView4, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i14), 1, -1), null, org.telegram.ui.ActionBar.r6.N(i14), getResourceProvider());
                this.f51324g3.addView(this.f51337h3, b8.mf.d(44, 44.0f, 51, 2.66f, 0.0f, 0.0f, 0.0f));
                this.f51337h3.setOnClickListener(new je(this, 5));
                this.f51337h3.setContentDescription(org.telegram.messenger.bd.M0(2131749073, null));
            }
        }
    }

    public final int a9() {
        return Math.max(this.f51270c5, this.f51283d5);
    }

    public final boolean aa() {
        if (this.m0 != null && ea()) {
            return true;
        }
        return false;
    }

    public final void ab(int r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.ab(int):void");
    }

    public final void ac() {
        TLRPC.Chat chat = this.f51292e;
        if (chat != null) {
            if (org.telegram.messenger.t3.n0(chat)) {
                if (org.telegram.messenger.t3.N(this.f51292e)) {
                    e40 e40Var = new e40(a());
                    e40Var.m0 = this;
                    presentFragment(e40Var);
                    return;
                }
                return;
            } else if (org.telegram.messenger.t3.w(1, this.f51292e)) {
                pc pcVar = new pc(a());
                pcVar.m0 = this;
                presentFragment(pcVar);
                return;
            } else {
                return;
            }
        }
        this.f51517va = new org.telegram.ui.Components.vo(this, this.f51557ya);
        this.A0.setOnInterceptTouchListener(new org.telegram.messenger.go(19));
        Lb(this.m1, false);
        showDialog(this.f51517va, new ce(this, 1));
    }

    public final void ad() {
        mh.h hVar = this.f51549y1;
        ri riVar = this.f51520w;
        if (hVar != null) {
            this.f51549y1.setTranslationY((((-riVar.d()) - this.U.getInputBubbleHeight()) - r9(org.telegram.ui.Components.c11.f32503c)) - org.telegram.messenger.g0.L(13.0f));
        }
        if (this.f51472s1 != null) {
            this.f51472s1.setTranslationY((-riVar.d()) - org.telegram.messenger.g0.L(16.0f));
        }
    }

    @Override
    public final void addThemeColorKeys(HashSet hashSet) {
        super.addThemeColorKeys(hashSet);
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28035lg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.K5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28120q5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27971i5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27954h5));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27882da));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28085oa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27976ia));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28066na));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28047ma));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.la));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28011ka));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27993ja));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27888dg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28290z6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28223vf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A6));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28148rf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28185tf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28166sf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27963hg));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ll));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28015kf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28178t7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28235w7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.vj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uj));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28243wf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.He));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28217v9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28199u9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28124q9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28104p9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28084o9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28010k9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28046m9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27975i9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27992j9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27826a9));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Z8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.X8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.J7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28032ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Lb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28278yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27958ha));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27940ga));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27921fa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ea));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27906ef));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27945gf));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27926ff));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27995jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27979id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.We));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Eb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Db));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Id));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28298ze));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28279ye));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28296zc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28261xe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28242we));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28259xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28222ve));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28240wc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28203ue));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28220vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28184te));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.uc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.se));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28147re));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28164sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28129qe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28145rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28109pe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28127qc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28089oe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28107pc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28070ne));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28087oc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28051me));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28068nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27996je));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28033le));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ke));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ie));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27994jc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27961he));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27978ic));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27944ge));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27959hc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27925fe));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ac));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27905ee));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27886de));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27848bc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27884dc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.cc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27830ae));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.ce));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27942gc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27850be));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27923fc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27903ec));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ub));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ld));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Fd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ed));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Nc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Mb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28014kd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28297zd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28260xd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28241wd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28221vd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28202ud));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28183td));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28125qa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28141r7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28239wb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28165sd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28146rd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Jb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28128qd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28108pd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28088od));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ib));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Hb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28069nd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28050md));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Gb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27960hd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27943gd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Cb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Bb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Ab));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28295zb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28277yb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28258xb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Vc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Tc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Sc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27829ad));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Yc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Xc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28106pb));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28086ob));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Rc));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28143ra));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28083o8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28064n8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28045m8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28028l8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28009k8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27991j8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27974i8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.U7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.T7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.S7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.R7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.Q7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.P7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.O7));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27885dd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f27867cd));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28179t8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28105pa));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28160s8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.B8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.A8));
        hashSet.add(Integer.valueOf(org.telegram.ui.ActionBar.k6.f28216v8));
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
        int i3;
        if (!this.f51525w4 && (i3 = this.f51325g4) != 3 && i3 != 5 && i3 != 8) {
            return 0L;
        }
        return this.f51475s4;
    }

    public final void b7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.b7():void");
    }

    public final void b8() {
        if (this.f51473s2 == null && this.I1 == null) {
            org.telegram.ui.Components.iz izVar = new org.telegram.ui.Components.iz(getParentActivity(), this.f51557ya);
            this.f51461r2 = izVar;
            izVar.setViewType(7);
            org.telegram.ui.Components.zu0 zu0Var = new org.telegram.ui.Components.zu0(getParentActivity(), this.f51461r2, 1, null);
            this.f51473s2 = zu0Var;
            zu0Var.setClickable(true);
            this.f51473s2.d.setText(org.telegram.messenger.bd.M0(2131748175, null));
            this.f51473s2.setVisibility(8);
            this.f51473s2.addView(this.f51461r2, 0);
            this.f51473s2.e(true, false);
            this.Z3.addView(this.f51473s2, new FrameLayout.LayoutParams(-1, -1, 17));
            org.telegram.ui.Components.p20 p20Var = new org.telegram.ui.Components.p20(this.currentAccount, getParentActivity(), this.resourceProvider);
            this.I1 = p20Var;
            p20Var.setOnHashtagClickListener(new le(this, 3));
            this.I1.setOnScrollListener(new h3(this, 6));
            this.I1.setVisibility(8);
            this.Z3.addView(this.I1, -1, -1);
            F7();
            D7();
        }
    }

    public final int b9() {
        if (this.f51325g4 == 5) {
            return (int) this.f51475s4;
        }
        return 0;
    }

    public final boolean ba() {
        boolean z10;
        boolean z11;
        float f10;
        FrameLayout frameLayout;
        if (!this.f51265c && !this.d && this.f51306f == null && this.A0 != null && org.telegram.messenger.az.c()) {
            if (this.Fb == null) {
                this.Fb = Boolean.valueOf(org.telegram.messenger.lc.e(360928));
            }
            if (this.Fb.booleanValue()) {
                int i3 = Integer.MAX_VALUE;
                int i10 = 0;
                for (int i11 = 0; i11 < this.A0.getChildCount(); i11++) {
                    i10 += this.A0.getChildAt(i11).getHeight();
                    int top = this.A0.getChildAt(i11).getTop();
                    if (top < i3) {
                        i3 = top;
                    }
                }
                float f11 = i3;
                if (f11 <= this.M9) {
                    Z6(this.fragmentBeginToShow);
                }
                boolean[] zArr = this.T6;
                boolean z12 = zArr[0];
                ArrayList arrayList = this.L6;
                if ((!z12 || ((this.f51272c7 != 0 && !zArr[1]) || arrayList.isEmpty())) && this.X6 && f11 > this.M9 && (!arrayList.isEmpty() ? i10 != 0 : this.Eb)) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (!z10 || !this.inTransitionAnimation || (frameLayout = this.f51308f1) == null || frameLayout.getVisibility() != 0 || this.f51308f1.getChildCount() <= 0) {
                    if (!z10 && this.f51300e7 == 0) {
                        Z6(this.fragmentBeginToShow);
                    }
                    if (org.telegram.messenger.az.o() != 0 && !this.la && this.fragmentBeginToShow) {
                        if (z10 && this.f51300e7 == 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        Drawable m10 = this.f51557ya.m();
                        kl klVar = this.m1;
                        if (klVar != null) {
                            m10 = klVar.getBackgroundImage();
                        }
                        if (m10 instanceof org.telegram.ui.Components.la0) {
                            org.telegram.ui.Components.la0 la0Var = (org.telegram.ui.Components.la0) m10;
                            if (la0Var.N != z11) {
                                if (!z11) {
                                    la0Var.c();
                                }
                                float f12 = 1.0f;
                                if (!z11 && la0Var.N) {
                                    la0Var.h = 1.0f - ((la0Var.h - (((int) (f10 / 0.125f)) * 0.125f)) / 0.125f);
                                    la0Var.d = true;
                                }
                                la0Var.N = z11;
                                if (z11) {
                                    f12 = 1.5f;
                                }
                                la0Var.M = f12;
                                la0Var.y();
                            } else if (z11) {
                                la0Var.y();
                            }
                        }
                    }
                    if (z10 || (this.f51300e7 != 0 && System.currentTimeMillis() - this.f51300e7 <= 200)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final boolean bb(TL_keyboard.TL_inlineButtonTypeSwitchInline tL_inlineButtonTypeSwitchInline) {
        if (this.f51529w8 == 0 || tL_inlineButtonTypeSwitchInline.same_peer || this.parentLayout == null) {
            return false;
        }
        String str = "@" + this.f51306f.username + " " + tL_inlineButtonTypeSwitchInline.query;
        if (this.f51529w8 == this.f51376k6) {
            this.f51529w8 = 0L;
            this.f51237a0.setFieldText(str);
            return true;
        }
        getMediaDataController().Q1(this.f51529w8, 0, str, null, null, null, null, 0L, false, false, null);
        if (this.parentLayout.getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 2);
            if ((d2Var instanceof wm) && ((wm) d2Var).f51376k6 == this.f51529w8) {
                finishFragment();
                return true;
            }
            Bundle bundle = new Bundle();
            if (org.telegram.messenger.m5.C(this.f51529w8)) {
                bundle.putInt("enc_id", (int) (this.f51529w8 & 4294967295L));
            } else if (org.telegram.messenger.m5.E(this.f51529w8)) {
                bundle.putLong("user_id", this.f51529w8);
            } else {
                bundle.putLong("chat_id", -this.f51529w8);
            }
            H6();
            presentFragment(new wm(bundle), true);
        }
        return true;
    }

    public final void bc(boolean r32, org.telegram.messenger.zi r33, org.telegram.messenger.zi r34, java.util.ArrayList r35, org.telegram.tgnet.TLRPC.WebPage r36, boolean r37, int r38, org.telegram.ui.mm r39, boolean r40, long r41, org.telegram.messenger.ej r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.bc(boolean, org.telegram.messenger.zi, org.telegram.messenger.zi, java.util.ArrayList, org.telegram.tgnet.TLRPC$WebPage, boolean, int, org.telegram.ui.mm, boolean, long, org.telegram.messenger.ej, boolean):void");
    }

    public final void bd(boolean z10) {
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
        float f10;
        float f11;
        float f12;
        int i3;
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
        if ((!da() || this.f51525w4) && this.f51240a3 != null) {
            if (!this.f51313f6) {
                z11 = false;
            } else {
                z11 = z10;
            }
            if (this.U4.size() > 1 && !this.X2) {
                objArr = 1;
            } else {
                objArr = null;
            }
            if (this.f51240a3.getTag() != null) {
                objArr2 = 1;
            } else {
                objArr2 = null;
            }
            if (this.Z2.getTag() != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (this.Y2.getTag() != null) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (objArr == null && !this.cc && !this.X2) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (objArr != null && !this.cc && !this.X2) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (this.cc && !this.X2) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (objArr2 == objArr && z12 == z16 && z13 == z14) {
                z17 = false;
            } else {
                AnimatorSet animatorSet = this.f51254b3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                    this.f51254b3 = null;
                }
                if (z11) {
                    if (objArr != null) {
                        this.f51240a3.setVisibility(0);
                    } else if (z14) {
                        this.Y2.setVisibility(0);
                    }
                    if (z16) {
                        this.Z2.setVisibility(0);
                        this.Z2.setAlpha(0.0f);
                        this.Z2.setScaleX(0.4f);
                        this.Z2.setScaleY(0.4f);
                    }
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    this.f51254b3 = animatorSet2;
                    ImageView imageView = this.f51240a3;
                    Property property = View.ALPHA;
                    if (z15) {
                        f19 = 1.0f;
                    } else {
                        f19 = 0.0f;
                    }
                    ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView, property, f19);
                    ImageView imageView2 = this.f51240a3;
                    Property property2 = View.SCALE_X;
                    if (z15) {
                        f20 = 1.0f;
                    } else {
                        f20 = 0.4f;
                    }
                    ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(imageView2, property2, f20);
                    ImageView imageView3 = this.f51240a3;
                    Property property3 = View.SCALE_Y;
                    if (z15) {
                        f21 = 1.0f;
                    } else {
                        f21 = 0.4f;
                    }
                    z17 = false;
                    ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(imageView3, property3, f21);
                    ImageView imageView4 = this.Y2;
                    if (z14) {
                        f22 = 1.0f;
                    } else {
                        f22 = 0.0f;
                    }
                    num = 1;
                    ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(imageView4, property, f22);
                    ImageView imageView5 = this.Y2;
                    if (z14) {
                        f23 = 1.0f;
                    } else {
                        f23 = 0.4f;
                    }
                    ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(imageView5, property2, f23);
                    ImageView imageView6 = this.Y2;
                    if (z14) {
                        f24 = 1.0f;
                    } else {
                        f24 = 0.4f;
                    }
                    ObjectAnimator ofFloat6 = ObjectAnimator.ofFloat(imageView6, property3, f24);
                    RadialProgressView radialProgressView = this.Z2;
                    if (!z16) {
                        f25 = 0.0f;
                    } else {
                        f25 = 1.0f;
                    }
                    ObjectAnimator ofFloat7 = ObjectAnimator.ofFloat(radialProgressView, property, f25);
                    RadialProgressView radialProgressView2 = this.Z2;
                    if (!z16) {
                        f26 = 0.4f;
                    } else {
                        f26 = 1.0f;
                    }
                    ObjectAnimator ofFloat8 = ObjectAnimator.ofFloat(radialProgressView2, property2, f26);
                    RadialProgressView radialProgressView3 = this.Z2;
                    if (!z16) {
                        f27 = 0.4f;
                    } else {
                        f27 = 1.0f;
                    }
                    animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat6, ofFloat7, ofFloat8, ObjectAnimator.ofFloat(radialProgressView3, property3, f27));
                    this.f51254b3.setInterpolator(org.telegram.ui.Components.xq.h);
                    this.f51254b3.setDuration(360L);
                    this.f51254b3.addListener(new wk(this, z14, z15, z16));
                    this.f51254b3.start();
                } else {
                    num = 1;
                    z17 = false;
                    ImageView imageView7 = this.Y2;
                    if (z14) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    imageView7.setAlpha(f10);
                    ImageView imageView8 = this.Y2;
                    if (z14) {
                        f11 = 1.0f;
                    } else {
                        f11 = 0.4f;
                    }
                    imageView8.setScaleX(f11);
                    ImageView imageView9 = this.Y2;
                    if (z14) {
                        f12 = 1.0f;
                    } else {
                        f12 = 0.4f;
                    }
                    imageView9.setScaleY(f12);
                    ImageView imageView10 = this.Y2;
                    if (z14) {
                        i3 = 0;
                    } else {
                        i3 = 4;
                    }
                    imageView10.setVisibility(i3);
                    ImageView imageView11 = this.f51240a3;
                    if (z15) {
                        f13 = 1.0f;
                    } else {
                        f13 = 0.0f;
                    }
                    imageView11.setAlpha(f13);
                    ImageView imageView12 = this.f51240a3;
                    if (z15) {
                        f14 = 1.0f;
                    } else {
                        f14 = 0.4f;
                    }
                    imageView12.setScaleX(f14);
                    ImageView imageView13 = this.f51240a3;
                    if (z15) {
                        f15 = 1.0f;
                    } else {
                        f15 = 0.4f;
                    }
                    imageView13.setScaleY(f15);
                    ImageView imageView14 = this.f51240a3;
                    if (z15) {
                        i10 = 0;
                    } else {
                        i10 = 4;
                    }
                    imageView14.setVisibility(i10);
                    RadialProgressView radialProgressView4 = this.Z2;
                    if (z16) {
                        f16 = 1.0f;
                    } else {
                        f16 = 0.0f;
                    }
                    radialProgressView4.setAlpha(f16);
                    RadialProgressView radialProgressView5 = this.Z2;
                    if (z16) {
                        f17 = 1.0f;
                    } else {
                        f17 = 0.4f;
                    }
                    radialProgressView5.setScaleX(f17);
                    RadialProgressView radialProgressView6 = this.Z2;
                    if (z16) {
                        f18 = 1.0f;
                    } else {
                        f18 = 0.4f;
                    }
                    radialProgressView6.setScaleY(f18);
                    RadialProgressView radialProgressView7 = this.Z2;
                    if (z16) {
                        i11 = 0;
                    } else {
                        i11 = 8;
                    }
                    radialProgressView7.setVisibility(i11);
                }
                ImageView imageView15 = this.Y2;
                if (z14) {
                    num2 = num;
                } else {
                    num2 = null;
                }
                imageView15.setTag(num2);
                ImageView imageView16 = this.f51240a3;
                if (objArr != null) {
                    num3 = num;
                } else {
                    num3 = null;
                }
                imageView16.setTag(num3);
                RadialProgressView radialProgressView8 = this.Z2;
                if (z16) {
                    num4 = num;
                } else {
                    num4 = null;
                }
                radialProgressView8.setTag(num4);
            }
            if (this.O2 != null) {
                if (da() && !this.f51525w4) {
                    boolean z18 = z17;
                    this.O2.c(z18 ? 1 : 0, 1, z18);
                    return;
                }
                this.O2.c((this.U4.size() - 1) - Collections.binarySearch(this.U4, Integer.valueOf(this.Y4), Comparator$CC.reverseOrder()), this.U4.size(), z11);
            }
        }
    }

    @Override
    public final boolean c() {
        if (this.f51325g4 == 1) {
            return true;
        }
        return false;
    }

    public final void c7(boolean z10) {
        TLRPC.ChatFull chatFull;
        String str;
        org.telegram.messenger.r3 r3Var = this.f51414n8;
        if (r3Var != null && (((str = this.f51543x8) != null || this.f51556y8) && this.f51299e6)) {
            org.telegram.ui.Components.voip.n1.l(this.f51292e, str, this.f51440p8, Boolean.valueOf(!r3Var.f25049b.rtmp_stream), getParentActivity(), this, getAccountInstance());
            this.f51543x8 = null;
            this.f51556y8 = false;
            return;
        }
        if (this.f51543x8 != null && z10 && (chatFull = this.f51453q8) != null && chatFull.call == null && this.fragmentView != null && getParentActivity() != null) {
            org.telegram.messenger.k5.o(null, 2131748921, org.telegram.ui.Components.fc.a0(this), 2131624079, 36);
            this.f51543x8 = null;
        }
        this.f51427o8 = !this.f51299e6;
    }

    public final TextureView c8(boolean z10) {
        if (this.parentLayout == null) {
            return null;
        }
        org.telegram.messenger.g0.r(this.N8);
        if (this.I8 == null) {
            pj pjVar = new pj(this, getParentActivity(), 2);
            this.I8 = pjVar;
            pjVar.setOutlineProvider(new gh.a(this, 1));
            this.I8.setClipToOutline(true);
            this.I8.setWillNotDraw(false);
            l4 l4Var = new l4(getParentActivity());
            this.K8 = l4Var;
            l4Var.setBackgroundColor(0);
            if (z10) {
                this.I8.addView(this.K8, b8.mf.e(-1, -1, 17));
            }
            TextureView textureView = new TextureView(getParentActivity());
            this.L8 = textureView;
            textureView.setOpaque(false);
            this.K8.addView(this.L8, b8.mf.c(-1.0f, -1));
        }
        ViewGroup viewGroup = (ViewGroup) this.I8.getParent();
        if (viewGroup != null && viewGroup != this.m1) {
            viewGroup.removeView(this.I8);
            viewGroup = null;
        }
        if (viewGroup == null) {
            this.m1.addView(this.I8, 1, new FrameLayout.LayoutParams(org.telegram.messenger.g0.g3(Z9(), Q9()), org.telegram.messenger.g0.g3(Z9(), Q9())));
        }
        this.I8.setTag(null);
        this.K8.setDrawingReady(false);
        return this.L8;
    }

    public final long c9() {
        if (this.f51325g4 == 3) {
            return this.f51475s4;
        }
        return 0L;
    }

    public final boolean ca() {
        if (getUserConfig().e() == a() && !getMessagesController().G1().f24435b && getUserConfig().q()) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean canBeginSlide() {
        org.telegram.ui.Components.n01 n01Var;
        xh.j jVar;
        org.telegram.ui.Components.sd sdVar;
        if ((this.f51325g4 != 5 || (!this.L6.isEmpty() && this.f51475s4 != 0)) && (((n01Var = this.f51407n0) == null || (n01Var.f36323y <= 0.0f && !n01Var.Q)) && !this.f51516v9 && !this.f51291dd.f53841f && this.H9)) {
            mj mjVar = this.f51237a0;
            if (!mjVar.G2 && ((!mjVar.f31104d1 || (sdVar = mjVar.f31118f1) == null || sdVar.getVisibility() != 0) && ((!mjVar.g0() || !mjVar.m0.f14778w) && !org.telegram.ui.ActionBar.d2.hasSheets(mjVar.Q2) && this.f51343ha == 0.0f && ((jVar = this.f51467ra) == null || !jVar.a())))) {
                return true;
            }
        }
        return false;
    }

    public final void cb(int i3, org.telegram.messenger.zi ziVar) {
        TLRPC.TL_message tL_message = new TLRPC.TL_message();
        tL_message.message = org.telegram.messenger.bd.u(ziVar.f26868k.date, false);
        tL_message.f27022id = 0;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(ziVar.f26868k.date * 1000);
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        tL_message.date = (int) (calendar.getTimeInMillis() / 1000);
        org.telegram.messenger.zi ziVar2 = new org.telegram.messenger.zi(this.currentAccount, tL_message, false, false);
        ziVar2.D = 10;
        ziVar2.U = 1;
        ziVar2.f26864j0 = true;
        ziVar2.k1 = o9(ziVar.X);
        this.D0.Q.add(i3, ziVar2);
    }

    public final void cc(boolean z10, TLRPC.WebPage webPage, boolean z11, boolean z12) {
        bc(z10, null, null, null, webPage, true, 0, null, z11, 0L, null, z12);
    }

    public final void cd(int r43, boolean r44) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.cd(int, boolean):void");
    }

    @Override
    public final android.view.View createView(android.content.Context r52) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.createView(android.content.Context):android.view.View");
    }

    public void d(TLRPC.MessageMedia messageMedia, int i3, boolean z10, int i10, long j10) {
        org.telegram.messenger.wy d = org.telegram.messenger.wy.d(messageMedia, this.f51376k6, this.E5, this.f51397m4, null, null, z10, i10);
        d.K = W8();
        d.Q = j10;
        d.R = h9();
        d.T = this.f51540x5;
        getSendMessagesHelper().r0(d);
        if (this.f51325g4 == 0) {
            oa(false);
        }
        if (i3 == 0 || i3 == 1) {
            K6();
        }
        if (this.H5) {
            this.f51340h6 = true;
        }
    }

    public final void d7() {
        TLRPC.ChatFull N0;
        TLRPC.StickerSet stickerSet;
        TLRPC.TL_messages_stickerSet Y;
        if (this.N1 == null && org.telegram.messenger.t3.n0(this.f51292e) && (N0 = getMessagesController().N0(this.f51292e.f27001id)) != null && this.f51237a0 != null && getParentActivity() != null && (stickerSet = N0.emojiset) != null) {
            qj qjVar = this.f51279d1;
            if (qjVar == null || qjVar.getVisibility() != 0) {
                org.telegram.ui.Components.v20 v20Var = org.telegram.ui.Components.v20.f38963n;
                if (v20Var.c()) {
                    long j10 = stickerSet.thumb_document_id;
                    if (j10 == 0 && (Y = getMediaDataController().Y(stickerSet)) != null && !Y.documents.isEmpty()) {
                        j10 = Y.documents.get(0).f27007id;
                    }
                    if (j10 != 0 && getParentActivity() != null) {
                        v20Var.b();
                        gi.l3 l3Var = new gi.l3(getParentActivity(), 3);
                        this.N1 = l3Var;
                        l3Var.k(true);
                        this.N1.r(true);
                        gi.l3 l3Var2 = this.N1;
                        l3Var2.L = Layout.Alignment.ALIGN_CENTER;
                        l3Var2.s(12.0f);
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("d");
                        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(j10, this.N1.getTextPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(stickerSet.title);
                        spannableStringBuilder2.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder2.length(), 34);
                        spannableStringBuilder.append((CharSequence) " ");
                        spannableStringBuilder.append((CharSequence) spannableStringBuilder2);
                        this.N1.u(org.telegram.messenger.g0.K2(org.telegram.messenger.bd.M0(2131749450, null), spannableStringBuilder, "%s"));
                        gi.l3 l3Var3 = this.N1;
                        l3Var3.h = gi.l3.a(l3Var3.getText(), this.N1.getTextPaint());
                        gi.l3 l3Var4 = this.N1;
                        l3Var4.d = -1L;
                        l3Var4.setPadding(org.telegram.messenger.g0.L(6.0f), 0, org.telegram.messenger.g0.L(6.0f), 0);
                        this.N1.l(this.L);
                        org.telegram.messenger.g0.i3(new tf(this, 28), 300L);
                    }
                }
            }
        }
    }

    public final void d8() {
        if (this.m1 != null && this.Z1 == null && getParentActivity() != null) {
            this.Z1 = new org.telegram.ui.ActionBar.k0(1, getParentActivity(), this);
            K9();
            this.Z1.setClickable(true);
            this.f51252b1.addView(this.Z1, b8.mf.o(-1, 44));
            this.f51252b1.h(2, this.Z1);
            this.f51252b1.g(this.Z1);
            TextView textView = new TextView(getParentActivity());
            this.c2 = textView;
            int i3 = org.telegram.ui.ActionBar.k6.f28122q7;
            org.telegram.ui.ActionBar.r6.V(textView, i3, getResourceProvider());
            TextView textView2 = this.c2;
            float L = org.telegram.messenger.g0.L(18.0f);
            int L2 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.r6.R(textView2, org.telegram.ui.ActionBar.k6.Y(L, getThemedColor(i3) & 436207615, L2, L2, L2, L2), null, org.telegram.ui.ActionBar.r6.h(i3, 25), getResourceProvider());
            this.c2.setTag(Integer.valueOf(i3));
            this.c2.setTextSize(1, 14.0f);
            this.c2.setTypeface(org.telegram.messenger.g0.o());
            this.c2.setSingleLine(true);
            this.c2.setMaxLines(1);
            this.c2.setGravity(17);
            this.Z1.addView(this.c2, b8.mf.e(-1, -1, 51));
            this.c2.setOnClickListener(new je(this, 13));
            org.telegram.ui.Components.s70 s70Var = new org.telegram.ui.Components.s70(getParentActivity(), this.f51557ya);
            this.f51348i2 = s70Var;
            org.telegram.ui.ActionBar.r6.V(s70Var, org.telegram.ui.ActionBar.k6.Ue, getResourceProvider());
            this.f51348i2.setTextSize(1, 13.3f);
            this.f51348i2.setDisablePaddingsOffset(true);
            org.telegram.ui.ActionBar.r6.H(this.f51348i2, org.telegram.ui.ActionBar.k6.Wl, getResourceProvider());
            this.f51348i2.setGravity(17);
            this.f51348i2.setPadding(0, org.telegram.messenger.g0.L(9.0f), 0, org.telegram.messenger.g0.L(9.0f));
            this.f51252b1.addView(this.f51348i2, b8.mf.k(25.0f, 0.0f, 25.0f, 0.0f, -1, -2));
            this.f51252b1.h(8, this.f51348i2);
            this.f51252b1.g(this.f51348i2);
            TextView textView3 = new TextView(getParentActivity());
            this.f51239a2 = textView3;
            int i10 = org.telegram.ui.ActionBar.k6.Ve;
            org.telegram.ui.ActionBar.r6.V(textView3, i10, getResourceProvider());
            this.f51239a2.setVisibility(8);
            this.f51239a2.setTextSize(1, 14.0f);
            this.f51239a2.setTypeface(org.telegram.messenger.g0.o());
            this.f51239a2.setSingleLine(true);
            this.f51239a2.setMaxLines(1);
            this.f51239a2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.f51239a2.setGravity(17);
            TextView textView4 = this.f51239a2;
            int themedColor = getThemedColor(i10) & 436207615;
            int L3 = org.telegram.messenger.g0.L(4.0f);
            org.telegram.ui.ActionBar.r6.R(textView4, org.telegram.ui.ActionBar.k6.Y(org.telegram.messenger.g0.L(18.0f), themedColor, L3, L3, L3, L3), null, org.telegram.ui.ActionBar.r6.h(i10, 25), getResourceProvider());
            this.Z1.addView(this.f51239a2, b8.mf.e(-1, -1, 51));
            this.f51239a2.setOnClickListener(new je(this, 14));
            TextView textView5 = new TextView(getParentActivity());
            this.f51280d2 = textView5;
            org.telegram.ui.ActionBar.r6.V(textView5, i10, getResourceProvider());
            this.f51280d2.setVisibility(8);
            this.f51280d2.setTextSize(1, 14.0f);
            this.f51280d2.setTypeface(org.telegram.messenger.g0.o());
            this.f51280d2.setSingleLine(true);
            this.f51280d2.setMaxLines(1);
            this.f51280d2.setPadding(org.telegram.messenger.g0.L(4.0f), 0, org.telegram.messenger.g0.L(4.0f), 0);
            this.f51280d2.setGravity(17);
            this.f51280d2.setText(org.telegram.messenger.bd.M0(2131746094, null));
            org.telegram.ui.ActionBar.r6.R(this.f51280d2, org.telegram.ui.ActionBar.k6.h0(getThemedColor(i10) & 436207615, 3, -1), null, org.telegram.ui.ActionBar.r6.h(i10, 25), getResourceProvider());
            this.f51252b1.addView(this.f51280d2, b8.mf.o(-1, 48));
            this.f51252b1.h(4, this.f51280d2);
            this.f51252b1.g(this.f51280d2);
            this.f51280d2.setOnClickListener(new je(this, 15));
            ImageView imageView = new ImageView(getParentActivity());
            this.f51361j2 = imageView;
            imageView.setImageResource(2131231983);
            this.f51361j2.setContentDescription(org.telegram.messenger.bd.M0(2131752041, null));
            ImageView imageView2 = this.f51361j2;
            int i11 = org.telegram.ui.ActionBar.k6.f27972i6;
            org.telegram.ui.ActionBar.r6.R(imageView2, org.telegram.ui.ActionBar.k6.O(getThemedColor(i11), 0, 0), null, org.telegram.ui.ActionBar.r6.N(i11), getResourceProvider());
            org.telegram.ui.ActionBar.r6.t(this.f51361j2, org.telegram.ui.ActionBar.k6.Re, getResourceProvider(), PorterDuff.Mode.MULTIPLY);
            this.f51361j2.setScaleType(ImageView.ScaleType.CENTER);
            this.Z1.addView(this.f51361j2, b8.mf.d(34, 34.0f, 53, 0.0f, 5.0f, 5.0f, 0.0f));
            this.f51361j2.setOnClickListener(new je(this, 16));
        }
    }

    public final int d9(int i3) {
        return (int) Math.max(-org.telegram.messenger.g0.L(2.0f), (((((this.A0.getMeasuredHeight() - this.Va) - this.M9) - this.f51520w.e()) - org.telegram.messenger.g0.L(53.0f)) - i3) / 2.0f);
    }

    public final boolean da() {
        if (this.f51397m4 != null) {
            return true;
        }
        return false;
    }

    public final void db() {
        int i3;
        this.U4.clear();
        this.W4.clear();
        this.Y4 = 0;
        this.f51270c5 = 0;
        this.f51283d5 = 0;
        cd(0, true);
        org.telegram.messenger.li mediaDataController = getMediaDataController();
        long a10 = a();
        TLRPC.ChatFull chatFull = this.f51453q8;
        if (chatFull == null) {
            i3 = 0;
        } else {
            i3 = chatFull.pinned_msg_id;
        }
        mediaDataController.Q0(0, i3, a10);
        this.f51298e5 = true;
        dd();
    }

    public final void dc(ArrayList arrayList) {
        bc(true, null, null, arrayList, null, true, 0, null, false, 0L, null, true);
    }

    public final void dd() {
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        TLRPC.TL_forumTopic tL_forumTopic;
        if (this.f51525w4 && !this.W4.isEmpty() && this.U4.size() == 1 && ((Integer) this.U4.get(0)).intValue() == b() + 1) {
            ziVar = (org.telegram.messenger.zi) this.W4.get(this.U4.get(0));
        } else {
            ziVar = null;
        }
        this.n4 = ziVar;
        if (this.f51525w4 && ziVar != null && (message = ziVar.f26868k) != null && (tL_forumTopic = this.f51463r4) != null && !org.telegram.messenger.zi.w5(tL_forumTopic.from_id, message.from_id)) {
            TLRPC.Chat chat = this.f51292e;
            TLRPC.Peer peer = this.n4.f26868k.from_id;
            if (chat != null || peer != null) {
                if (chat != null && peer != null) {
                    if (org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChannel)) {
                        if (chat.f27001id == peer.channel_id) {
                            return;
                        }
                    } else if (!org.telegram.messenger.t3.T(chat) && (peer instanceof TLRPC.TL_peerChat) && chat.f27001id == peer.chat_id) {
                        return;
                    }
                }
                this.n4 = null;
            }
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, final Object... objArr) {
        long j10;
        org.telegram.messenger.zi ziVar;
        TLRPC.MessageReplies messageReplies;
        org.telegram.messenger.zi ziVar2;
        org.telegram.ui.ActionBar.q4 q4Var;
        TLRPC.ChatFull chatFull;
        TLRPC.UserFull b22;
        TLRPC.User a22;
        boolean z10;
        TLRPC.User a23;
        qi qiVar;
        mj mjVar;
        TLRPC.Chat chat;
        org.telegram.ui.Components.xs editField;
        boolean z11;
        boolean z12;
        org.telegram.ui.Components.xv0 xv0Var;
        TLRPC.TL_messages_stickerSet tL_messages_stickerSet;
        TLRPC.StickerSet stickerSet;
        int i11;
        mj mjVar2;
        wm wmVar = this;
        if (i3 == org.telegram.messenger.hs.D) {
            wmVar.r8(objArr);
            return;
        }
        if (i3 == org.telegram.messenger.hs.f23252j4) {
            wi wiVar = wmVar.A0;
            if (wiVar != null) {
                wiVar.g1();
            }
            org.telegram.ui.Components.ai aiVar = wmVar.f51330ga;
            if (aiVar != null) {
                aiVar.invalidate();
            }
        } else {
            r2 = false;
            r2 = false;
            r2 = false;
            boolean z13 = false;
            r2 = false;
            boolean z14 = false;
            int i12 = 0;
            if (i3 == org.telegram.messenger.hs.I) {
                if (((Integer) objArr[0]).intValue() == wmVar.classGuid) {
                    Object obj = objArr[2];
                    if ((obj instanceof TLRPC.TL_error) && "FROZEN_METHOD_INVALID".equals(((TLRPC.TL_error) obj).text)) {
                        wmVar.finishFragment();
                        b.b(wmVar.currentAccount);
                    }
                }
            } else if (i3 == org.telegram.messenger.hs.f23302s3) {
                if (objArr.length > 0) {
                    z11 = ((Boolean) objArr[0]).booleanValue();
                } else {
                    z11 = false;
                }
                ei.x2 x2Var = wmVar.Y1;
                if (x2Var != null && x2Var.isShowing()) {
                    wmVar.Y1.a(true);
                }
                if (z11 && (mjVar2 = wmVar.f51237a0) != null && mjVar2.r0()) {
                    wmVar.f51237a0.j0(true);
                }
                if (objArr.length > 1) {
                    Object obj2 = objArr[1];
                    if (obj2 instanceof TLRPC.TL_messages_stickerSet) {
                        final TLRPC.StickerSet stickerSet2 = ((TLRPC.TL_messages_stickerSet) obj2).set;
                        TLRPC.TL_inputStickerSetID tL_inputStickerSetID = new TLRPC.TL_inputStickerSetID();
                        tL_inputStickerSetID.access_hash = stickerSet2.access_hash;
                        tL_inputStickerSetID.f27021id = stickerSet2.f27028id;
                        if (objArr.length > 4) {
                            z12 = ((Boolean) objArr[4]).booleanValue();
                        } else {
                            z12 = false;
                        }
                        Dialog dialog = wmVar.visibleDialog;
                        if ((dialog instanceof org.telegram.ui.Components.xv0) && (tL_messages_stickerSet = (xv0Var = (org.telegram.ui.Components.xv0) dialog).K1) != null && (stickerSet = tL_messages_stickerSet.set) != null && stickerSet.f27028id == stickerSet2.f27028id) {
                            xv0Var.K1 = (TLRPC.TL_messages_stickerSet) objArr[1];
                            if (xv0Var.f40517l1 != null) {
                                xv0Var.a1();
                                xv0Var.Z0();
                                xv0Var.f40517l1.f();
                            }
                            xv0Var.Y0();
                            org.telegram.messenger.li.b0(xv0Var.f28583a).q1(xv0Var.K1);
                            xv0Var.J0();
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
                                    org.telegram.ui.Components.fc fcVar = new org.telegram.ui.Components.fc(xv0Var.f28589c, wmVar.resourceProvider);
                                    if (z12) {
                                        i11 = 2131744854;
                                    } else {
                                        i11 = 2131744855;
                                    }
                                    org.telegram.ui.Components.ac q10 = fcVar.q(document, org.telegram.messenger.bd.a0(null, null, i11, stickerSet2.title));
                                    q10.f31792j = 2750;
                                    q10.k(true);
                                }
                            }
                        } else {
                            final org.telegram.ui.Components.xv0 xv0Var2 = new org.telegram.ui.Components.xv0(wmVar.getParentActivity(), wmVar, tL_inputStickerSetID, null, wmVar.f51237a0, wmVar.f51557ya);
                            final boolean z15 = z12;
                            wmVar = this;
                            xv0Var2.setOnShowListener(new DialogInterface.OnShowListener() {
                                @Override
                                public final void onShow(DialogInterface dialogInterface) {
                                    wm.U0(wm.this, objArr, xv0Var2, z15, stickerSet2);
                                }
                            });
                            wmVar.showDialog(xv0Var2);
                        }
                    }
                }
            } else if (i3 == org.telegram.messenger.hs.f23246i4) {
                wi wiVar2 = wmVar.A0;
                if (wiVar2 != null) {
                    wiVar2.g1();
                }
                TextView textView = wmVar.f51310f3;
                if (textView != null) {
                    textView.invalidate();
                }
                for (int i13 = 0; i13 < 2; i13++) {
                    org.telegram.ui.ActionBar.k5 k5Var = wmVar.S2[i13];
                    if (k5Var != null) {
                        k5Var.invalidate();
                    }
                }
                fj fjVar = wmVar.X1;
                if (fjVar != null) {
                    fjVar.getListView().g1();
                }
                ci.j1 j1Var = wmVar.f51241a4;
                if (j1Var != null) {
                    j1Var.g1();
                }
                UndoView undoView = wmVar.N3;
                if (undoView != null) {
                    undoView.invalidate();
                }
                mj mjVar3 = wmVar.f51237a0;
                if (mjVar3 != null && (editField = mjVar3.getEditField()) != null) {
                    int currentTextColor = editField.getCurrentTextColor();
                    editField.setTextColor(-1);
                    editField.setTextColor(currentTextColor);
                }
                lm[] lmVarArr = wmVar.T2;
                lm lmVar = lmVarArr[0];
                if (lmVar != null) {
                    lmVar.invalidate();
                }
                lm lmVar2 = lmVarArr[1];
                if (lmVar2 != null) {
                    lmVar2.invalidate();
                }
            } else if (i3 == org.telegram.messenger.hs.T1) {
                ConnectionsManager.getInstance(i10).getConnectionState();
            } else if (i3 == org.telegram.messenger.hs.f23232g1) {
                Long l10 = (Long) objArr[0];
                if (wmVar.f51453q8 != null && (chat = wmVar.f51292e) != null && chat.f27001id == l10.longValue()) {
                    wmVar.f51453q8.online_count = ((Integer) objArr[1]).intValue();
                    qi qiVar2 = wmVar.f51433p1;
                    if (qiVar2 != null) {
                        qiVar2.m();
                        wmVar.f51433p1.n(false);
                    }
                }
            } else if (i3 == org.telegram.messenger.hs.G) {
                if (((Long) objArr[0]).longValue() == wmVar.f51376k6 && (mjVar = wmVar.f51237a0) != null) {
                    mjVar.R1(false, true);
                }
            } else if (i3 == org.telegram.messenger.hs.i3) {
                mj mjVar4 = wmVar.f51237a0;
                if (mjVar4 != null) {
                    mjVar4.S1();
                }
            } else if (i3 == org.telegram.messenger.hs.f23292r) {
                int intValue = ((Integer) objArr[0]).intValue();
                int i14 = org.telegram.messenger.hp.C8;
                int i15 = intValue & 1;
                if (i15 != 0 || (intValue & 16) != 0 || (524288 & intValue) != 0) {
                    if (wmVar.f51292e != null) {
                        TLRPC.Chat M0 = wmVar.getMessagesController().M0(Long.valueOf(wmVar.f51292e.f27001id));
                        if (M0 != null) {
                            wmVar.f51292e = M0;
                        }
                    } else if (wmVar.f51306f != null && (a22 = wmVar.getMessagesController().a2(Long.valueOf(wmVar.f51306f.f27150id))) != null) {
                        wmVar.f51306f = a22;
                    }
                    wmVar.sd(true);
                }
                if (!wmVar.da() && ((intValue & 32) != 0 || (intValue & 4) != 0)) {
                    if (wmVar.f51292e != null && (qiVar = wmVar.f51433p1) != null) {
                        qiVar.m();
                    }
                    z10 = true;
                } else {
                    z10 = false;
                }
                if ((intValue & 2) != 0 || (intValue & 8) != 0 || i15 != 0) {
                    wmVar.s();
                    wmVar.Cd(false);
                }
                if ((intValue & 64) != 0) {
                    z10 = true;
                }
                if ((intValue & 8192) != 0 && wmVar.f51292e != null) {
                    wmVar.U9();
                    TLRPC.Chat M02 = wmVar.getMessagesController().M0(Long.valueOf(wmVar.f51292e.f27001id));
                    if (M02 != null) {
                        wmVar.f51292e = M02;
                        wmVar.U9();
                        z10 = !wmVar.da();
                        wmVar.Lc(false);
                        mj mjVar5 = wmVar.f51237a0;
                        if (mjVar5 != null) {
                            mjVar5.a1(wmVar.currentAccount, wmVar.f51376k6);
                        }
                        org.telegram.messenger.n6 n6Var = wmVar.T3;
                        if (n6Var != null) {
                            n6Var.g();
                        }
                    }
                }
                TLRPC.User user = wmVar.f51306f;
                if (user != null && org.telegram.messenger.l10.u(user) && (a23 = wmVar.getMessagesController().a2(Long.valueOf(wmVar.f51306f.f27150id))) != null) {
                    wmVar.f51306f = a23;
                }
                if (wmVar.f51323g2 != null) {
                    boolean N6 = wmVar.N6();
                    org.telegram.ui.Components.g11 g11Var = wmVar.f51323g2;
                    if (g11Var.f33922c != N6) {
                        g11Var.setTabsEnabled(N6);
                        if (wmVar.f51407n0 != null && !wmVar.ea()) {
                            wmVar.f51407n0.c();
                        }
                        wmVar.zd();
                    }
                }
                qi qiVar3 = wmVar.f51433p1;
                if (qiVar3 != null && z10) {
                    qiVar3.n(true);
                }
                if ((intValue & 130) != 0) {
                    wmVar.vd(true);
                }
                org.telegram.ui.ActionBar.q0 q0Var = wmVar.f51359j0;
                if (q0Var != null) {
                    if (org.telegram.messenger.t3.T(wmVar.f51292e) && !org.telegram.messenger.t3.p0(wmVar.f51292e)) {
                        long j11 = wmVar.f51292e.linked_monoforum_id;
                        if (j11 != 0 && org.telegram.messenger.t3.z(wmVar.currentAccount, 24, -j11)) {
                            z13 = true;
                        }
                    }
                    q0Var.Q(70, z13);
                }
            } else if (i3 == 1) {
                org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages start");
                long longValue = ((Long) objArr[0]).longValue();
                ArrayList arrayList = (ArrayList) objArr[1];
                if (!wmVar.jb) {
                    if (longValue == wmVar.f51376k6) {
                        boolean booleanValue = ((Boolean) objArr[2]).booleanValue();
                        int intValue2 = ((Integer) objArr[3]).intValue();
                        int i16 = wmVar.f51325g4;
                        if (intValue2 != i16 && i16 != 3 && i16 != 8) {
                            if (i16 != 1 && intValue2 == 1 && !wmVar.isPaused && LaunchActivity.T() == wmVar && wmVar.f51526w5 == null && !arrayList.isEmpty() && ((org.telegram.messenger.zi) arrayList.get(0)).f1() < 0) {
                                int f12 = ((org.telegram.messenger.zi) arrayList.get(0)).f1();
                                if (((org.telegram.messenger.zi) arrayList.get(0)).f26868k != null && ((org.telegram.messenger.zi) arrayList.get(0)).f26868k.video_processing_pending) {
                                    z14 = true;
                                }
                                wmVar.Ja(f12, z14);
                            }
                            org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: opened scheduled messages");
                        } else {
                            if (!booleanValue && !wmVar.Vc && wmVar.f51306f != null && wmVar.a() != wmVar.getUserConfig().e() && (b22 = wmVar.getMessagesController().b2(wmVar.f51306f.f27150id)) != null && b22.send_paid_messages_stars > 0) {
                                int size = arrayList.size();
                                while (true) {
                                    if (i12 >= size) {
                                        break;
                                    }
                                    org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) arrayList.get(i12);
                                    if (ziVar3.f1() > 0 && !ziVar3.O3() && !ziVar3.s4()) {
                                        wmVar.Vc = true;
                                        wmVar.getMessagesController().W2(wmVar.f51306f, wmVar.classGuid, true, null);
                                        break;
                                    }
                                    i12++;
                                }
                            }
                            wmVar.Ya(arrayList, true);
                        }
                    } else if (org.telegram.messenger.t3.T(wmVar.f51292e) && !wmVar.f51292e.megagroup && (chatFull = wmVar.f51453q8) != null && longValue == (-chatFull.linked_chat_id)) {
                        int size2 = arrayList.size();
                        for (int i17 = 0; i17 < size2; i17++) {
                            org.telegram.messenger.zi ziVar4 = (org.telegram.messenger.zi) arrayList.get(i17);
                            if (ziVar4.f4()) {
                                wmVar.M6.put(ziVar4.f1(), ziVar4);
                            }
                        }
                        wmVar.K7();
                    }
                    org.telegram.messenger.a8.b("ChatActivity didReceiveNewMessages return: done");
                }
            } else if (i3 == org.telegram.messenger.hs.F) {
                wmVar.ia(true);
            } else if (i3 == org.telegram.messenger.hs.E) {
                wmVar.F6();
            } else if (i3 == org.telegram.messenger.hs.f23305t) {
                if (objArr.length > 0) {
                    if (((Long) objArr[0]).longValue() == wmVar.f51376k6) {
                        wmVar.finishFragment();
                    }
                } else if (org.telegram.messenger.g0.Q1() && (q4Var = wmVar.parentLayout) != null && q4Var.getFragmentStack().size() > 1) {
                    wmVar.finishFragment();
                } else {
                    wmVar.removeSelfFromStack(true);
                }
            } else if (i3 == org.telegram.messenger.hs.f23312u) {
                long longValue2 = ((Long) objArr[0]).longValue();
                boolean booleanValue2 = ((Boolean) objArr[1]).booleanValue();
                if (longValue2 == wmVar.a() && (booleanValue2 || wmVar.parentLayout.getLastFragment() != wmVar)) {
                    if (wmVar.parentLayout.getLastFragment() == wmVar) {
                        wmVar.finishFragment();
                    } else {
                        wmVar.removeSelfFromStack(true);
                    }
                }
            } else {
                int i18 = org.telegram.messenger.hs.B;
                SparseArray[] sparseArrayArr = wmVar.F6;
                if (i3 == i18) {
                    long longValue3 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat2 = wmVar.f51292e;
                    if (chat2 != null && chat2.f27001id == longValue3 && (ziVar2 = (org.telegram.messenger.zi) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && ziVar2.y2()) {
                        int intValue3 = ((Integer) objArr[2]).intValue();
                        if (wmVar.H5) {
                            ch chVar = wmVar.C4;
                            if (chVar != null) {
                                org.telegram.messenger.g0.r(chVar);
                                wmVar.C4 = null;
                            }
                            ziVar2.f26868k.replies.read_max_id = intValue3;
                        } else {
                            ch chVar2 = new ch(wmVar, ziVar2, intValue3);
                            wmVar.C4 = chVar2;
                            org.telegram.messenger.g0.i3(chVar2, 500L);
                        }
                    }
                } else if (i3 == org.telegram.messenger.hs.C) {
                    long longValue4 = ((Long) objArr[0]).longValue();
                    TLRPC.Chat chat3 = wmVar.f51292e;
                    if (chat3 != null && chat3.f27001id == longValue4 && (ziVar = (org.telegram.messenger.zi) sparseArrayArr[0].get(((Integer) objArr[1]).intValue())) != null && (messageReplies = ziVar.f26868k.replies) != null) {
                        Integer num = (Integer) objArr[2];
                        messageReplies.replies = num.intValue() + messageReplies.replies;
                        if (num.intValue() > 0) {
                            TLRPC.Peer z16 = wmVar.getMessagesController().z1(org.telegram.messenger.t3.M(wmVar.f51292e, wmVar.getMessagesController().N0(wmVar.f51292e.f27001id), false));
                            int size3 = ziVar.f26868k.replies.recent_repliers.size();
                            int i19 = 0;
                            while (true) {
                                if (i19 >= size3) {
                                    break;
                                } else if (org.telegram.messenger.zi.C1(ziVar.f26868k.replies.recent_repliers.get(i19)) == org.telegram.messenger.zi.C1(z16)) {
                                    ziVar.f26868k.replies.recent_repliers.remove(i19);
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                            ziVar.f26868k.replies.recent_repliers.add(0, z16);
                        }
                        TLRPC.MessageReplies messageReplies2 = ziVar.f26868k.replies;
                        if (messageReplies2.replies < 0) {
                            messageReplies2.replies = 0;
                        }
                    }
                } else {
                    int i20 = org.telegram.messenger.hs.A;
                    int i21 = org.telegram.messenger.hs.f23346z;
                    if ((i3 == i21 || i3 == i20) && wmVar.f51376k6 == ((Long) objArr[0]).longValue()) {
                        if (i3 == i21) {
                            j10 = ((Integer) objArr[1]).intValue();
                        } else if (i3 == i20) {
                            j10 = ((Long) objArr[1]).longValue();
                        } else {
                            j10 = 0;
                        }
                        long j12 = wmVar.f51475s4;
                        if (j10 == j12 || j12 == 0) {
                            int intValue4 = ((Integer) objArr[2]).intValue();
                            int intValue5 = ((Integer) objArr[3]).intValue();
                            int i22 = wmVar.f51563z4;
                            ArrayList arrayList2 = wmVar.L6;
                            if (intValue4 > i22) {
                                wmVar.f51563z4 = intValue4;
                                int size4 = arrayList2.size();
                                for (int i23 = 0; i23 < size4; i23++) {
                                    org.telegram.messenger.zi ziVar5 = (org.telegram.messenger.zi) arrayList2.get(i23);
                                    int f13 = ziVar5.f1();
                                    if (!ziVar5.O3() && f13 > 0 && f13 <= wmVar.f51563z4) {
                                        if (!ziVar5.G4()) {
                                            break;
                                        }
                                        ziVar5.J5();
                                        fl flVar = wmVar.D0;
                                        if (flVar != null) {
                                            flVar.M(ziVar5);
                                        }
                                    }
                                }
                            }
                            if (intValue5 > wmVar.A4) {
                                wmVar.A4 = intValue5;
                                int size5 = arrayList2.size();
                                for (int i24 = 0; i24 < size5; i24++) {
                                    org.telegram.messenger.zi ziVar6 = (org.telegram.messenger.zi) arrayList2.get(i24);
                                    int f14 = ziVar6.f1();
                                    if (ziVar6.O3() && f14 > 0 && f14 <= wmVar.A4) {
                                        if (!ziVar6.G4()) {
                                            break;
                                        }
                                        ziVar6.J5();
                                        fl flVar2 = wmVar.D0;
                                        if (flVar2 != null) {
                                            flVar2.R(ziVar6, false, false);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        wmVar.m8(i3, objArr);
        wmVar.n8(i3, objArr);
        wmVar.o8(i3, objArr);
        wmVar.p8(i3, objArr);
        wmVar.q8(i3, objArr);
    }

    @Override
    public final void dismissCurrentDialog() {
        ei.x2 x2Var = this.Y1;
        if (x2Var != null && this.visibleDialog == x2Var) {
            x2Var.f32215b2.d0(false);
            this.Y1.K();
            this.Y1.f32215b2.g0(true);
            return;
        }
        super.dismissCurrentDialog();
    }

    @Override
    public final boolean dismissDialogOnPause(Dialog dialog) {
        if (dialog != this.Y1 && dialog != this.f51517va && !(dialog instanceof ii.a3) && super.dismissDialogOnPause(dialog)) {
            return true;
        }
        return false;
    }

    @Override
    public final boolean drawEdgeNavigationBar() {
        return false;
    }

    public final void e7() {
        ArrayList arrayList;
        int i3;
        if (this.f51381kb) {
            int i10 = -1;
            int i11 = 0;
            long j10 = 0;
            while (true) {
                arrayList = this.L6;
                if (i11 >= arrayList.size()) {
                    break;
                }
                long e12 = ((org.telegram.messenger.zi) arrayList.get(i11)).e1();
                if (j10 != e12) {
                    if (i10 >= 0 && j10 != 0 && (i3 = i11 - i10) > 1) {
                        ArrayList arrayList2 = new ArrayList();
                        for (int i12 = 0; i12 < i3; i12++) {
                            arrayList2.add((org.telegram.messenger.zi) arrayList.remove(i10));
                        }
                        Collections.sort(arrayList2, new org.telegram.messenger.tq(23));
                        arrayList.addAll(i10, arrayList2);
                    }
                    i10 = i11;
                    j10 = e12;
                }
                i11++;
            }
            if (i10 >= 0 && j10 != 0 && arrayList.size() - i10 > 1) {
                int size = arrayList.size() - i10;
                ArrayList arrayList3 = new ArrayList();
                for (int i13 = 0; i13 < size; i13++) {
                    arrayList3.add((org.telegram.messenger.zi) arrayList.remove(i10));
                }
                arrayList.addAll(i10, arrayList3);
            }
        }
    }

    public final void e8() {
        int i3;
        if (this.f51323g2 == null && getParentActivity() != null) {
            if (this.M2 == null) {
                Z7();
            }
            org.telegram.ui.Components.g11 g11Var = new org.telegram.ui.Components.g11(getParentActivity(), this, this.currentAccount, a(), N6(), getResourceProvider());
            this.f51323g2 = g11Var;
            g11Var.S = new yd(this, 6);
            g11Var.setSideMenuBackgroundDrawable(this.L.c(g11Var, b8.cd.p(this.f51557ya), false));
            org.telegram.ui.Components.g11 g11Var2 = this.f51323g2;
            g11Var2.setTopMenuBackgroundDrawable(this.L.c(g11Var2, b8.cd.p(this.f51557ya), false));
            this.f51323g2.setCurrentTopic(b());
            this.f51323g2.setOnNewTopicSelected(new yd(this, 7));
            this.f51323g2.setOnTopicSelected(new ke(this, 0));
            this.f51323g2.setOnDialogSelected(new ke(this, 1));
            int indexOfChild = this.m1.indexOfChild(this.Z);
            if (indexOfChild >= 0) {
                i3 = indexOfChild + 1;
            } else {
                i3 = 8;
            }
            this.m1.addView(this.f51323g2, i3, b8.mf.f(-1.0f, -1, 51, 0, -org.telegram.messenger.g0.L(5.0f), 0, 0));
            this.f51323g2.p();
            zd();
            fj fjVar = this.X1;
            if (fjVar != null) {
                fjVar.bringToFront();
            }
        }
    }

    public final int e9(org.telegram.messenger.zi ziVar) {
        return d9(U8(ziVar, !TextUtils.isEmpty(this.f51328g8))) - ub(ziVar);
    }

    public final boolean ea() {
        if (X9()) {
            return getMessagesController().G1().e();
        }
        org.telegram.ui.Components.g11 g11Var = this.f51323g2;
        if (g11Var != null && g11Var.f33918a.f53841f) {
            TLRPC.Chat chat = this.f51292e;
            if (chat == null || ((!chat.forum || !chat.forum_sidebar) && !chat.monoforum)) {
                TLRPC.User user = this.f51306f;
                if (org.telegram.messenger.l10.u(user) && user.bot_forum_sidebar) {
                    return true;
                }
            } else {
                return true;
            }
        }
        return false;
    }

    public final void eb(org.telegram.messenger.zi ziVar) {
        if (ziVar == this.f51418nc) {
            this.f51418nc = null;
            vd(true);
            return;
        }
        org.telegram.messenger.dp O1 = getMessagesController().O1(this.f51376k6);
        if (O1 != null) {
            O1.f22229a.remove(ziVar);
        }
    }

    public final void ec(org.telegram.messenger.zi ziVar) {
        bc(true, ziVar, null, null, null, true, 0, null, false, 0L, null, true);
    }

    public final void ed(boolean z10) {
        boolean z11;
        int i3;
        if (getParentActivity() == null) {
            return;
        }
        if (this.B1 > 0 && ((i3 = this.f51325g4) == 0 || i3 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f51549y1.e(4, z11, z10);
        this.f51549y1.c(4, this.B1, z10);
    }

    @Override
    public final boolean extendActionMode(android.view.Menu r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.extendActionMode(android.view.Menu):boolean");
    }

    public final void f7(boolean z10) {
        kg.i1 i1Var;
        if (this.f51282d4 == 2 && (i1Var = this.f51255b4) != null) {
            String str = this.J3;
            gi.f6 f6Var = i1Var.F;
            if (!TextUtils.equals(i1Var.f17051y, str)) {
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
                org.telegram.messenger.g0.r(f6Var);
                ei.l6 l6Var = i1Var.E;
                if (l6Var != null && l6Var.I != 0) {
                    ConnectionsManager.getInstance(l6Var.f10872c).cancelRequest(l6Var.I, true);
                    l6Var.I = 0;
                }
                if (!TextUtils.isEmpty(trim)) {
                    i1Var.f17051y = str;
                    i1Var.E = new ei.l6(i1Var.f17047r, str2, trim);
                    if (z10) {
                        f6Var.run();
                    } else {
                        org.telegram.messenger.g0.i3(f6Var, 1000L);
                    }
                }
                ei.l6 l6Var2 = i1Var.E;
                if (l6Var2 != null && l6Var2.J > 0) {
                    i1Var.f();
                }
            }
        }
    }

    public final void f8() {
        if (this.N3 == null && getParentActivity() != null) {
            UndoView undoView = new UndoView(getParentActivity(), this, false, this.f51557ya);
            this.N3 = undoView;
            undoView.setAdditionalTranslationY(org.telegram.messenger.g0.L(51.0f));
            this.m1.addView(this.N3, b8.mf.d(-1, -2.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
        }
    }

    public final int f9(View view) {
        org.telegram.messenger.a8.b("getScrollingOffsetForView view=" + view + " results in {" + ((this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom()) + "} chatHeight=" + this.A0.getMeasuredHeight() + " bottom=" + view.getBottom() + " paddingBottom=" + this.A0.getPaddingBottom());
        return (this.A0.getMeasuredHeight() - view.getBottom()) - this.A0.getPaddingBottom();
    }

    public final void fa(int i3) {
        int i10;
        TLRPC.Message message;
        int i11;
        ArrayList arrayList = this.L6;
        if (!arrayList.isEmpty()) {
            int i12 = 1;
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) k2.p1.h(1, arrayList);
            if ((((org.telegram.messenger.zi) arrayList.get(0)).f26868k.date >= i3 && ziVar.f26868k.date <= i3) || (ziVar.f26868k.date >= i3 && this.T6[0])) {
                for (int size = arrayList.size() - 1; size >= 0; size--) {
                    org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(size);
                    if (ziVar2.f26868k.date >= i3 && ziVar2.f1() != 0) {
                        int f12 = ziVar2.f1();
                        if (org.telegram.messenger.zi.B0(ziVar2.f26868k) != this.f51272c7) {
                            i12 = 0;
                        }
                        l(f12, 0, false, i12, true, 0);
                        return;
                    }
                }
            } else if (!org.telegram.messenger.m5.C(this.f51376k6)) {
                int N0 = this.C0.N0();
                int L0 = this.C0.L0();
                while (true) {
                    if (L0 <= N0) {
                        fl flVar = this.D0;
                        int i13 = flVar.K;
                        if (L0 >= i13 && L0 < flVar.L && (message = ((org.telegram.messenger.zi) arrayList.get(L0 - i13)).f26868k) != null) {
                            if (message.date < i3) {
                                i11 = 1;
                            } else {
                                i11 = 0;
                            }
                            if (z()) {
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
                this.f51392l9.f(i10);
                org.telegram.ui.ActionBar.s1 s1Var = this.Qb;
                if (s1Var != null) {
                    s1Var.dismiss();
                }
                bd(false);
                org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), this.f51557ya);
                this.Qb = s1Var2;
                s1Var2.setOnCancelListener(this.Ga);
                this.Qb.r(1000L);
                int i14 = this.f51399m6;
                this.f51415n9 = i14;
                this.f51441p9 = false;
                this.f51554y6.add(Integer.valueOf(i14));
                this.f51428o9 = 0;
                this.f51454q9 = false;
                org.telegram.messenger.hp messagesController = getMessagesController();
                long j10 = this.f51376k6;
                long j11 = this.f51272c7;
                int i15 = this.classGuid;
                int i16 = this.f51325g4;
                long j12 = this.f51475s4;
                int i17 = this.B4;
                int i18 = this.f51399m6;
                this.f51399m6 = i18 + 1;
                messagesController.Y2(j10, j11, false, 30, 0, i3, true, 0, i15, 4, i16, j12, i17, i18, this.f51525w4);
                this.f51396m3.setAlpha(0.0f);
                this.f51396m3.setTag(null);
                this.f51538x3 = 0.0f;
                Pc();
                this.f51410n3.setTag(null);
            }
        }
    }

    public final void fb(org.telegram.messenger.zi ziVar) {
        ArrayList arrayList = this.L6;
        int indexOf = arrayList.indexOf(ziVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fl flVar = this.D0;
            if (flVar != null && !flVar.O) {
                flVar.s(flVar.K + indexOf);
            }
        }
    }

    public final void fc(org.telegram.messenger.zi ziVar, mm mmVar) {
        bc(true, ziVar, null, null, null, true, 0, mmVar, false, 0L, null, true);
    }

    public final void fd(boolean z10) {
        boolean z11;
        int i3;
        if (getParentActivity() == null) {
            return;
        }
        if (this.A1 > 0 && ((i3 = this.f51325g4) == 0 || i3 == 8)) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f51549y1.e(3, z11, z10);
        this.f51549y1.c(3, this.A1, z10);
    }

    @Override
    public final void finishFragment() {
        super.finishFragment();
        org.telegram.ui.ActionBar.f1 f1Var = this.f51316f9;
        if (f1Var != null) {
            f1Var.f27495e = false;
            O7(true);
        }
    }

    @Override
    public final TLRPC.Chat g() {
        return this.f51292e;
    }

    public final void g7() {
        this.U.d();
        ad();
        Kc();
        A7();
        x7();
        C7();
        B7();
        F7();
        L9();
        boolean z10 = true;
        if (this.f51520w.f54736s == 1) {
            z10 = false;
        }
        if (this.f51456qb != z10) {
            this.f51456qb = z10;
            checkSystemBarColors();
        }
    }

    public final ArrayList g8(org.telegram.messenger.zi ziVar, boolean z10) {
        ArrayList k10 = org.telegram.messenger.k5.k(ziVar);
        int f12 = ziVar.f1();
        ziVar.A0();
        if (f12 != 0) {
            ArrayList arrayList = this.L6;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                org.telegram.messenger.zi ziVar2 = (org.telegram.messenger.zi) arrayList.get(size);
                if ((org.telegram.messenger.zi.B0(ziVar2.f26868k) != this.f51272c7 || org.telegram.messenger.zi.B0(ziVar.f26868k) == this.f51272c7) && (((this.h == null && ziVar2.f1() > f12) || (this.h != null && ziVar2.f1() < f12)) && ((org.telegram.messenger.zi.S4(ziVar2.f26868k) || ziVar2.i4()) && !ziVar2.T4() && !ziVar2.h4() && (!z10 || (ziVar2.f26868k.media_unread && !ziVar2.O3()))))) {
                    k10.add(ziVar2);
                }
            }
        }
        return k10;
    }

    public final om g9() {
        if (this.Sc == null) {
            this.Sc = new om(this);
        }
        return this.Sc;
    }

    public final void ga(ArrayList arrayList) {
        org.telegram.ui.Components.g11 g11Var;
        if (arrayList != null && (g11Var = this.f51323g2) != null && g11Var.U) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
                if (ziVar != null && ziVar.D == 36) {
                    TLRPC.MessageMedia o12 = org.telegram.messenger.zi.o1(ziVar.f26868k);
                    ConcurrentHashMap concurrentHashMap = org.telegram.utils.twidget.p.f52941a;
                    if (o12 instanceof TLRPC.TL_messageMediaWidget) {
                        if (!ziVar.S2) {
                            ziVar.S2 = true;
                            ziVar.n0(null);
                        }
                    }
                }
                if (ziVar != null && ziVar.Q2() && !ziVar.Q3() && ziVar.d1() != 0 && !ziVar.S2) {
                    ziVar.S2 = true;
                    ziVar.n0(null);
                }
            }
        }
    }

    public final void gb(org.telegram.messenger.zi ziVar) {
        ArrayList arrayList = this.L6;
        int indexOf = arrayList.indexOf(ziVar);
        if (indexOf != -1) {
            arrayList.remove(indexOf);
            fl flVar = this.D0;
            if (flVar != null && !flVar.O) {
                flVar.P(flVar.K + indexOf, true);
            }
        }
    }

    public final void gc(org.telegram.messenger.ej ejVar) {
        bc(true, null, null, null, null, true, 0, null, false, 0L, ejVar, true);
    }

    public final void gd(boolean z10) {
        String M0;
        if (this.f51325g4 != 3 && !org.telegram.messenger.l10.u(this.f51306f)) {
            qi qiVar = this.f51433p1;
            if (qiVar != null && this.f51475s4 != 0) {
                if (this.f51525w4) {
                    xd();
                } else if (this.f51511v4) {
                    org.telegram.messenger.zi ziVar = this.f51397m4;
                    if (ziVar != null && ziVar.y2()) {
                        this.f51433p1.setTitle(org.telegram.messenger.bd.G(this.f51397m4.N1(), "Comments", new Object[0]));
                    } else {
                        this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131751996, null));
                    }
                } else {
                    org.telegram.messenger.zi ziVar2 = this.f51397m4;
                    if (ziVar2 != null) {
                        qiVar.setTitle(org.telegram.messenger.bd.G(ziVar2.N1(), "Replies", new Object[0]));
                    }
                }
            }
            if (this.f51449q4 != null) {
                if (this.f51397m4.N1() == 0) {
                    if (this.f51511v4) {
                        M0 = org.telegram.messenger.bd.M0(2131748234, null);
                    } else {
                        M0 = org.telegram.messenger.bd.M0(2131748176, null);
                    }
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131751376, null);
                }
                org.telegram.messenger.zi ziVar3 = this.f51449q4;
                ziVar3.f26868k.message = M0;
                ziVar3.v = M0;
                if (z10) {
                    this.D0.R(ziVar3, true, false);
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.ActionBar.m4 getBackButtonState() {
        return org.telegram.ui.ActionBar.m4.f28340a;
    }

    @Override
    public final org.telegram.ui.ActionBar.m3 getEdgeToEdgeSupportMode() {
        return org.telegram.ui.ActionBar.m3.f28339c;
    }

    @Override
    public final org.telegram.messenger.r3 getGroupCall() {
        org.telegram.messenger.r3 r3Var;
        if (this.f51325g4 == 0 && (r3Var = this.f51414n8) != null && (r3Var.f25049b instanceof TLRPC.TL_groupCall)) {
            return r3Var;
        }
        return null;
    }

    @Override
    public final int getPreviewHeight() {
        if (this.f51325g4 == 2) {
            ArrayList arrayList = this.L6;
            if (arrayList.size() == 2) {
                return org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + org.telegram.messenger.g0.L(80.0f) + U8((org.telegram.messenger.zi) arrayList.get(0), false);
            }
        }
        return super.getPreviewHeight();
    }

    @Override
    public org.telegram.ui.ActionBar.e6 getResourceProvider() {
        return this.f51557ya;
    }

    @Override
    public final ArrayList getThemeDescriptions() {
        org.telegram.ui.ActionBar.k5 k5Var;
        org.telegram.ui.ActionBar.k5 k5Var2;
        View view;
        org.telegram.ui.Components.ey eyVar;
        org.telegram.ui.Components.ey eyVar2;
        org.telegram.ui.Components.ey eyVar3;
        org.telegram.ui.Components.ey eyVar4;
        org.telegram.ui.Components.ey eyVar5;
        org.telegram.ui.Components.ey eyVar6;
        org.telegram.ui.Components.ey eyVar7;
        org.telegram.ui.Components.ey eyVar8;
        org.telegram.ui.Components.ey eyVar9;
        org.telegram.ui.Components.ey eyVar10;
        org.telegram.ui.Components.ey eyVar11;
        View view2;
        org.telegram.ui.Components.ey eyVar12 = null;
        if (this.f51514v7) {
            return null;
        }
        int i3 = 0;
        if (this.f51505ua) {
            this.f51505ua = false;
            return null;
        }
        h6 h6Var = new h6(1, this);
        ArrayList arrayList = new ArrayList();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Be));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ce));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.De));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ee));
        W9();
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, Integer.MIN_VALUE, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.G8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741824, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.E8));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 1073741832, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.F8));
        qi qiVar = this.f51433p1;
        if (qiVar != null) {
            k5Var = qiVar.getTitleTextView();
        } else {
            k5Var = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(k5Var, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A8));
        qi qiVar2 = this.f51433p1;
        if (qiVar2 != null) {
            k5Var2 = qiVar2.getTitleTextView();
        } else {
            k5Var2 = null;
        }
        int i10 = org.telegram.ui.ActionBar.k6.B8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(k5Var2, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i10));
        qi qiVar3 = this.f51433p1;
        if (qiVar3 != null) {
            view = qiVar3.getSubtitleTextView();
        } else {
            view = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(i10, view));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 134217728, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.C8));
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        int i11 = org.telegram.ui.ActionBar.k6.D8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(kVar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 67108864, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i11));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.actionBar, 2097152, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28256x8));
        org.telegram.ui.ActionBar.t4 t4Var = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgIn");
        org.telegram.ui.ActionBar.t4 t4Var2 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgInMedia");
        org.telegram.ui.ActionBar.t4 t4Var3 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgInSelected");
        org.telegram.ui.ActionBar.t4 t4Var4 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgInMediaSelected");
        org.telegram.ui.ActionBar.t4 t4Var5 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOut");
        org.telegram.ui.ActionBar.t4 t4Var6 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOutMedia");
        org.telegram.ui.ActionBar.t4 t4Var7 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOutSelected");
        org.telegram.ui.ActionBar.t4 t4Var8 = (org.telegram.ui.ActionBar.t4) getThemedDrawable("drawableMsgOutMediaSelected");
        if (t4Var != null) {
            Drawable[] drawableArr = t4Var.A;
            int i12 = org.telegram.ui.ActionBar.k6.f28181ta;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr, (org.telegram.ui.ActionBar.s6) null, i12));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, t4Var2.A, (org.telegram.ui.ActionBar.s6) null, i12));
            Drawable[] drawableArr2 = t4Var5.A;
            int i13 = org.telegram.ui.ActionBar.k6.f28126qb;
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, drawableArr2, (org.telegram.ui.ActionBar.s6) null, i13));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, t4Var6.A, (org.telegram.ui.ActionBar.s6) null, i13));
        }
        if (!this.f51557ya.q(false)) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var5, t4Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28144rb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var5, t4Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28163sb));
            arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var5, t4Var6}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28182tb));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, new Drawable[]{t4Var7, t4Var8}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Pc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27904ed));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27924fd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sd));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Td));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yb));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28013kc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28049mc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28031lc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 0, new Class[]{org.telegram.ui.Cells.q1.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27887df));
        this.f51557ya.getClass();
        pj pjVar = this.f51324g3;
        Paint themedPaint = getThemedPaint("paintChatComposeBackground");
        int i14 = org.telegram.ui.ActionBar.k6.Ge;
        arrayList.add(new org.telegram.ui.ActionBar.t6(pjVar, 0, (Class[]) null, themedPaint, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.T, 0, (Class[]) null, getThemedPaint("paintChatComposeBackground"), (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i14));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 8388608, new Class[]{ChatActivityEnterView.class}, new String[]{"messageEditText"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ll));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ne));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 0, new Class[]{ChatActivityEnterView.class}, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oe));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 32, new Class[]{ChatActivityEnterView.class}, new String[]{"recordedAudioBackground"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yf));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27852bg));
        mj mjVar = this.f51237a0;
        int i15 = org.telegram.ui.ActionBar.k6.f27832ag;
        arrayList.add(new org.telegram.ui.ActionBar.t6(mjVar, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i15));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 8, new Class[]{ChatActivityEnterView.class}, new String[]{"cancelBotButton"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27869cg));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 0, new Class[]{ChatActivityEnterView.class}, new String[]{"paint"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rf));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51237a0, 0, new Class[]{ChatActivityEnterView.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Uf));
        mj mjVar2 = this.f51237a0;
        if (mjVar2 != null) {
            eyVar = mjVar2.getEmojiView();
        } else {
            eyVar = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28299zf));
        mj mjVar3 = this.f51237a0;
        if (mjVar3 != null) {
            eyVar2 = mjVar3.getEmojiView();
        } else {
            eyVar2 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar2, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Af));
        mj mjVar4 = this.f51237a0;
        if (mjVar4 != null) {
            eyVar3 = mjVar4.getEmojiView();
        } else {
            eyVar3 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar3, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Bf));
        mj mjVar5 = this.f51237a0;
        if (mjVar5 != null) {
            eyVar4 = mjVar5.getEmojiView();
        } else {
            eyVar4 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar4, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Df));
        mj mjVar6 = this.f51237a0;
        if (mjVar6 != null) {
            eyVar5 = mjVar6.getEmojiView();
        } else {
            eyVar5 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar5, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Ef));
        mj mjVar7 = this.f51237a0;
        if (mjVar7 != null) {
            eyVar6 = mjVar7.getEmojiView();
        } else {
            eyVar6 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar6, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Gf));
        mj mjVar8 = this.f51237a0;
        if (mjVar8 != null) {
            eyVar7 = mjVar8.getEmojiView();
        } else {
            eyVar7 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar7, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Hf));
        mj mjVar9 = this.f51237a0;
        if (mjVar9 != null) {
            eyVar8 = mjVar9.getEmojiView();
        } else {
            eyVar8 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar8, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Lf));
        mj mjVar10 = this.f51237a0;
        if (mjVar10 != null) {
            eyVar9 = mjVar10.getEmojiView();
        } else {
            eyVar9 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar9, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Cf));
        mj mjVar11 = this.f51237a0;
        if (mjVar11 != null) {
            eyVar10 = mjVar11.getEmojiView();
        } else {
            eyVar10 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar10, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f28280yf));
        mj mjVar12 = this.f51237a0;
        if (mjVar12 != null) {
            eyVar11 = mjVar12.getEmojiView();
        } else {
            eyVar11 = null;
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar11, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Jf));
        mj mjVar13 = this.f51237a0;
        if (mjVar13 != null) {
            eyVar12 = mjVar13.getEmojiView();
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6(eyVar12, 0, new Class[]{org.telegram.ui.Components.ey.class}, (String[]) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.Ff));
        mj mjVar14 = this.f51237a0;
        if (mjVar14 != null) {
            org.telegram.ui.Components.z21 trendingStickersAlert = mjVar14.getTrendingStickersAlert();
            if (trendingStickersAlert != null) {
                arrayList.addAll(trendingStickersAlert.U());
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (String[]) null, new Drawable[]{this.f51237a0.getStickersArrowDrawable()}, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kl));
        }
        for (int i16 = 0; i16 < 2; i16++) {
            if (i16 == 0) {
                view2 = this.N3;
            } else {
                view2 = this.O3;
            }
            arrayList.add(new org.telegram.ui.ActionBar.t6(view2, 32, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.tj));
        }
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Nf));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Of));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28215v7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28197u7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262148, new Class[]{FragmentContextView.class}, new String[]{"titleTextView"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.A7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.fragmentView, 262145, new Class[]{FragmentContextView.class}, new String[]{"frameLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28274y7));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.O2, 0, (Class[]) null, (Paint) null, (Drawable[]) null, h6Var, org.telegram.ui.ActionBar.k6.f27878d6));
        NumberTextView numberTextView = this.U2;
        int i17 = org.telegram.ui.ActionBar.k6.Te;
        arrayList.add(new org.telegram.ui.ActionBar.t6(numberTextView, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
        ImageView imageView = this.f51337h3;
        int i18 = org.telegram.ui.ActionBar.k6.f28292z8;
        arrayList.add(new org.telegram.ui.ActionBar.t6(imageView, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.i3, 65568, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i18));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51408n1, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wc));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.A0, 131072, new Class[]{org.telegram.ui.Cells.z1.class}, new String[]{"backgroundLayout"}, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28204uf));
        gi.n5 n5Var = this.S;
        int i19 = org.telegram.ui.ActionBar.k6.Zc;
        arrayList.add(new org.telegram.ui.ActionBar.t6(n5Var, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51447q2, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6(this.f51408n1, 536870912, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i19));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.K6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f28007k6));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jc));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.ig));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27998jg));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Hh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ih));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Jh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Kh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Lh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Mh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Nh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Oh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Ph));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Qh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Rh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Sh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Th));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Wh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Xh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Yh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Uh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Vh));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.f27824a7));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Gc));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.qk));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.sk));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.rk));
        int i20 = org.telegram.ui.ActionBar.k6.tk;
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i20));
        arrayList.add(new org.telegram.ui.ActionBar.t6((View) null, 0, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i20));
        zh.d dVar = this.f51569za;
        if (dVar != null) {
            arrayList.add(new org.telegram.ui.ActionBar.t6(dVar.f60554g, 4, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, i17));
            arrayList.add(new org.telegram.ui.ActionBar.t6(dVar.h, 8, (Class[]) null, (Paint) null, (Drawable[]) null, (org.telegram.ui.ActionBar.s6) null, org.telegram.ui.ActionBar.k6.Re));
        }
        int size = arrayList.size();
        while (i3 < size) {
            Object obj = arrayList.get(i3);
            i3++;
            ((org.telegram.ui.ActionBar.t6) obj).f28667n = this.f51557ya;
        }
        return arrayList;
    }

    @Override
    public final Drawable getThemedDrawable(String str) {
        Drawable drawable = this.f51557ya.getDrawable(str);
        if (drawable != null) {
            return drawable;
        }
        return super.getThemedDrawable(str);
    }

    @Override
    public final Paint getThemedPaint(String str) {
        Paint d = this.f51557ya.d(str);
        if (d != null) {
            return d;
        }
        return org.telegram.ui.ActionBar.k6.V0(str);
    }

    public final void h7() {
        TLRPC.Chat M0;
        long j10 = getArguments().getInt("search_from_user_id", 0);
        if (j10 != 0) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
            if (a22 != null) {
                La("");
                ImageView imageView = this.i3;
                if (imageView != null) {
                    imageView.callOnClick();
                }
                zb(null, a22);
                return;
            }
            return;
        }
        long j11 = getArguments().getInt("search_from_chat_id", 0);
        if (j11 != 0 && (M0 = getMessagesController().M0(Long.valueOf(j11))) != null) {
            La("");
            ImageView imageView2 = this.i3;
            if (imageView2 != null) {
                imageView2.callOnClick();
            }
            zb(M0, null);
        }
    }

    public final void h8(final int i3, final int i10, final boolean z10) {
        this.D0.N.clear();
        int i11 = 0;
        while (true) {
            ArrayList arrayList = this.L6;
            if (i11 >= arrayList.size()) {
                break;
            }
            org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i11);
            int i12 = ziVar.f26868k.date;
            if (i12 <= i3 || i12 >= i10) {
                this.D0.N.add(ziVar);
            }
            i11++;
        }
        wi wiVar = this.A0;
        if (wiVar != null) {
            wiVar.setEmptyView(null);
        }
        if (this.D0.N.isEmpty()) {
            sc(true);
        }
        fl flVar = this.D0;
        flVar.M = true;
        flVar.O(true);
        f8();
        UndoView undoView = this.N3;
        if (undoView == null) {
            return;
        }
        undoView.l(this.f51376k6, 81, new Runnable() {
            @Override
            public final void run() {
                long j10;
                wm wmVar = wm.this;
                org.telegram.messenger.hp messagesController = wmVar.getMessagesController();
                long j11 = wmVar.f51376k6;
                if (org.telegram.messenger.t3.T(wmVar.f51292e)) {
                    j10 = wmVar.f51376k6;
                } else {
                    j10 = 0;
                }
                messagesController.d0(j11, j10, i3, i10, z10, new tf(wmVar, 20));
            }
        }, new tf(this, 17));
    }

    public final long h9() {
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        org.telegram.messenger.zi ziVar2;
        TLRPC.Message message2;
        if (!org.telegram.messenger.t3.p0(this.f51292e) || !org.telegram.messenger.t3.A(this.currentAccount, this.f51292e, 24)) {
            return 0L;
        }
        long j10 = this.f51475s4;
        int i3 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i3 == 0 && (ziVar2 = this.G5) != null && (message2 = ziVar2.f26868k) != null) {
            return org.telegram.messenger.m5.o(message2.saved_peer_id);
        }
        if (i3 == 0 && (ziVar = this.E5) != null && (message = ziVar.f26868k) != null) {
            return org.telegram.messenger.m5.o(message.saved_peer_id);
        }
        return j10;
    }

    public final void ha() {
        this.Q4 = true;
        if (this.D6) {
            org.telegram.messenger.qr messagesStorage = getMessagesStorage();
            messagesStorage.f24934a.c(new org.telegram.messenger.t8(messagesStorage, b(), this.f51376k6, new bg(this, 1), 5));
            return;
        }
        org.telegram.messenger.qr messagesStorage2 = getMessagesStorage();
        TLRPC.TL_messages_getUnreadMentions tL_messages_getUnreadMentions = new TLRPC.TL_messages_getUnreadMentions();
        tL_messages_getUnreadMentions.peer = getMessagesController().j1(this.f51376k6);
        tL_messages_getUnreadMentions.limit = 1;
        if (this.f51525w4) {
            tL_messages_getUnreadMentions.top_msg_id = (int) this.f51475s4;
            tL_messages_getUnreadMentions.flags |= 1;
        }
        tL_messages_getUnreadMentions.add_offset = this.C6 - 1;
        getConnectionsManager().sendRequest(tL_messages_getUnreadMentions, new org.telegram.ui.ActionBar.h6(7, this, messagesStorage2));
    }

    public final void hb() {
        if (this.f51328g8 == null && this.f51341h8 == null && this.f51353i8 == null) {
            yd ydVar = this.f51391l8;
            if (ydVar != null) {
                org.telegram.messenger.g0.r(ydVar);
                this.f51391l8 = null;
            }
            this.f51273c8 = Integer.MAX_VALUE;
            this.f51301e8 = false;
            this.f51315f8 = 0L;
            this.f51328g8 = null;
            this.f51341h8 = null;
            this.f51353i8 = null;
        }
    }

    public final void hc(boolean z10, TLRPC.WebPage webPage, boolean z11) {
        cc(z10, webPage, z11, true);
    }

    public final void hd(int i3, org.telegram.messenger.zi ziVar) {
        org.telegram.messenger.zi ziVar2;
        SparseArray sparseArray = this.H6;
        ArrayList arrayList = (ArrayList) sparseArray.get(i3);
        if (arrayList == null) {
            return;
        }
        if (ziVar == null) {
            ziVar2 = new org.telegram.messenger.zi(this.currentAccount, new TLRPC.TL_messageEmpty(), false, false);
        } else {
            ziVar2 = null;
        }
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            org.telegram.messenger.zi ziVar3 = (org.telegram.messenger.zi) this.F6[0].get(((Integer) arrayList.get(i10)).intValue());
            if (ziVar3 != null) {
                if (ziVar == null) {
                    ziVar3.C = ziVar2;
                } else {
                    ziVar3.C = ziVar;
                }
                fl flVar = this.D0;
                if (flVar != null) {
                    flVar.R(ziVar3, true, false);
                }
            }
        }
        if (ziVar == null) {
            sparseArray.remove(i3);
        }
    }

    @Override
    public final boolean hideKeyboardOnShow() {
        org.telegram.messenger.zi ziVar = this.f51397m4;
        if (ziVar != null && ziVar.N1() == 0 && org.telegram.messenger.t3.n(this.f51292e)) {
            return false;
        }
        return super.hideKeyboardOnShow();
    }

    public final void i7() {
        org.telegram.messenger.zi ziVar;
        if (!this.Q4 && (ziVar = this.f51245a8) != null) {
            if (this.L6.indexOf(ziVar) >= 0) {
                this.R4 = true;
                View view = this.fragmentView;
                if (view != null) {
                    view.requestLayout();
                }
            }
        } else if (this.P4 != null) {
        } else {
            xe xeVar = new xe(this, 21);
            this.P4 = xeVar;
            org.telegram.messenger.g0.h3(xeVar);
        }
    }

    public final void i8(org.telegram.ui.Cells.q1 q1Var, org.telegram.messenger.zi ziVar, CharacterStyle characterStyle, String str) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        org.telegram.ui.Cells.q1 q1Var2;
        CharacterStyle characterStyle2;
        int i3;
        org.telegram.messenger.zi ziVar2;
        int i10;
        TLRPC.WebPage webPage;
        int i11;
        int i12;
        org.telegram.ui.Components.f60 I = org.telegram.ui.Components.f60.I(this, q1Var);
        org.telegram.ui.Components.nk0 nk0Var = new org.telegram.ui.Components.nk0(getParentActivity(), this.f51557ya);
        I.f33742p = new ee(nk0Var, 0);
        if (!str.startsWith("video?") && !sf.c.g(Uri.parse(str), false, null)) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean N2 = getMessagesController().N2(str);
        if (N2 && z10) {
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
                i11 = 2131231925;
            } else {
                i11 = 2131232265;
            }
            if (z11 && !z12) {
                i12 = 2131747799;
            } else {
                i12 = 2131747825;
            }
            String M0 = org.telegram.messenger.bd.M0(i12, null);
            z15 = z10;
            i3 = 2131232265;
            ci.d2 d2Var = new ci.d2(this, str, characterStyle, ziVar, q1Var, z11, z12);
            z14 = z12;
            characterStyle2 = characterStyle;
            z13 = z11;
            q1Var2 = q1Var;
            I.c(i11, M0, d2Var, false);
        } else {
            z13 = z11;
            z14 = z12;
            z15 = z10;
            q1Var2 = q1Var;
            characterStyle2 = characterStyle;
            i3 = 2131232265;
        }
        if ((z13 && !z14) || startsWith) {
            I.c(i3, org.telegram.messenger.bd.M0(2131747801, null), new fe(this, str, 0), false);
        } else if (!startsWith && !z14 && !z13 && z15 && !N2) {
            I.c(2131231925, org.telegram.messenger.bd.M0(2131747799, null), new fe(this, str, 1), false);
        }
        TLRPC.MessageMedia n12 = org.telegram.messenger.zi.n1(ziVar);
        if ((n12 instanceof TLRPC.TL_messageMediaWebPage) && (webPage = n12.webpage) != null && webPage.cached_page != null && TextUtils.equals(webPage.url, str)) {
            ziVar2 = ziVar;
            I.c(2131231834, org.telegram.messenger.bd.M0(2131747798, null), new ge(this, ziVar2, 0), false);
        } else {
            ziVar2 = ziVar;
        }
        if (z14) {
            i10 = 2131751763;
        } else if (startsWith) {
            i10 = 2131751761;
        } else {
            i10 = 2131751762;
        }
        I.c(2131232103, org.telegram.messenger.bd.M0(i10, null), new ci.u8(this, str, ziVar2, startsWith, 26), false);
        if (N2 && !z14 && !startsWith && !str.startsWith("tg:")) {
            I.c(2131232504, org.telegram.messenger.bd.M0(2131742951, null), new fe(this, str, 2), false);
        }
        nk0Var.e(I);
        if (str.startsWith("mailto:")) {
            SpannableString spannableString = new SpannableString(str.substring(7));
            spannableString.setSpan(characterStyle2, 0, spannableString.length(), 33);
            nk0Var.f(q1Var2, characterStyle2, spannableString, false);
        } else if (characterStyle2 instanceof org.telegram.ui.Components.x31) {
            String d = sf.c.d(((org.telegram.ui.Components.x31) characterStyle2).getURL(), true);
            if (d.length() > 204) {
                d = d.substring(0, 204) + "…";
            }
            SpannableString spannableString2 = new SpannableString(d);
            spannableString2.setSpan(characterStyle2, 0, spannableString2.length(), 33);
            nk0Var.f(q1Var2, characterStyle2, spannableString2, false);
        } else {
            nk0Var.f(q1Var2, characterStyle2, null, false);
        }
        showDialog(nk0Var);
    }

    public final int i9() {
        return this.m1.getBackgroundSizeY();
    }

    public final void ia(boolean z10) {
        TLRPC.Chat chat;
        if (this.Ba == null && (chat = this.f51292e) != null && org.telegram.messenger.t3.k(chat) && this.f51237a0 != null && !org.telegram.messenger.t3.p0(this.f51292e)) {
            TLRPC.TL_channels_sendAsPeers M1 = getMessagesController().M1(this.f51376k6, false);
            this.Ba = M1;
            if (M1 != null) {
                this.f51237a0.R1(false, z10);
            }
        }
    }

    public final void ib(boolean z10) {
        org.telegram.messenger.zi ziVar = this.f51245a8;
        if (ziVar != null) {
            if (z10) {
                boolean[] zArr = this.V6;
                zArr[1] = true;
                zArr[0] = true;
                this.Y7 = 0;
                this.f51258b7 = 0;
            }
            this.U7 = 0;
            this.V7 = false;
            fb(ziVar);
            this.f51245a8 = null;
        }
    }

    public final void ic(boolean z10) {
        if (this.f51396m3 != null && !V9()) {
            if (this.f51396m3.getTag() == null) {
                AnimatorSet animatorSet = this.f51510v3;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                this.f51396m3.setTag(1);
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f51510v3 = animatorSet2;
                animatorSet2.setDuration(150L);
                this.f51510v3.playTogether(ObjectAnimator.ofFloat(this.f51396m3, View.ALPHA, 1.0f));
                this.f51510v3.addListener(new ai(this, 4));
                this.f51510v3.start();
            }
            if (!z10) {
                M9();
                this.f51435p3 = 1000;
            }
        }
    }

    public final void id(boolean z10) {
        mj mjVar = this.f51237a0;
        if (mjVar != null) {
            mjVar.P1(z10);
        }
    }

    @Override
    public boolean isLightStatusBar() {
        boolean z10;
        int x02;
        if (W9()) {
            org.telegram.ui.ActionBar.e6 resourceProvider = getResourceProvider();
            if (resourceProvider != null) {
                x02 = resourceProvider.f(org.telegram.ui.ActionBar.k6.f28236w8);
            } else {
                x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28236w8, true);
            }
            if (i0.a.h(x02) > 0.699999988079071d) {
                return true;
            }
            return false;
        }
        if (this.actionBar == null) {
            z10 = org.telegram.ui.ActionBar.k6.I.q();
        } else {
            z10 = this.f51304ec;
        }
        return !z10;
    }

    @Override
    public final boolean isSupportEdgeToEdge() {
        return true;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        org.telegram.ui.Components.n01 n01Var;
        hk hkVar;
        xh.j jVar;
        if ((this.f51325g4 == 5 && (this.L6.isEmpty() || this.f51475s4 == 0)) || (((n01Var = this.f51407n0) != null && (n01Var.f36323y > 0.0f || n01Var.Q)) || this.f51516v9 || this.f51291dd.f53841f || !this.H9 || (((hkVar = this.Za) != null && hkVar.f33040s) || ((jVar = this.f51467ra) != null && jVar.a())))) {
            return false;
        }
        return true;
    }

    public TLRPC.User j() {
        return this.f51306f;
    }

    public final void j7(boolean z10) {
        if (this.E5 != null) {
            int i3 = 0;
            while (true) {
                ArrayList arrayList = this.L6;
                if (i3 < arrayList.size()) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
                    if (ziVar != null && ziVar.f1() == this.E5.f1() && org.telegram.messenger.zi.B0(ziVar.f26868k) == org.telegram.messenger.zi.B0(this.E5.f26868k)) {
                        this.E5 = ziVar;
                        mm mmVar = this.C5;
                        if (mmVar != null) {
                            mmVar.a(ziVar);
                        }
                        if (z10) {
                            org.telegram.messenger.dj djVar = this.f51526w5;
                            if (djVar != null) {
                                org.telegram.messenger.zi ziVar2 = this.E5;
                                org.telegram.messenger.ui uiVar = this.A5;
                                if (uiVar == null) {
                                    uiVar = S8(ziVar2.d1());
                                }
                                djVar.f(ziVar2, uiVar, this.f51376k6, this.C5);
                            }
                            z8();
                            return;
                        }
                        return;
                    }
                    i3++;
                } else {
                    return;
                }
            }
        }
    }

    public final void j8(CharacterStyle characterStyle, boolean z10, org.telegram.messenger.zi ziVar, org.telegram.ui.Cells.q1 q1Var) {
        Object[] objArr;
        int i3;
        TLRPC.WebPage webPage;
        boolean z11;
        int i10;
        org.telegram.messenger.zi ziVar2;
        org.telegram.messenger.zi ziVar3;
        org.telegram.messenger.zi ziVar4;
        TLRPC.WebPage webPage2;
        org.telegram.messenger.zi ziVar5;
        org.telegram.ui.Cells.q1 q1Var2;
        org.telegram.messenger.zi messageObject;
        ArrayList arrayList;
        org.telegram.messenger.ui uiVar;
        TLRPC.Message message;
        if (characterStyle != null && getParentActivity() != null) {
            boolean z12 = true;
            boolean z13 = true;
            char c2 = 1;
            char c10 = 1;
            if (!U9() && (ziVar == null || (message = ziVar.f26868k) == null || !message.noforwards)) {
                objArr = null;
            } else {
                objArr = 1;
            }
            org.telegram.ui.Cells.q1 q1Var3 = null;
            if (characterStyle instanceof org.telegram.ui.Components.u31) {
                if (objArr == null || a() == 489000) {
                    org.telegram.ui.Components.u31 u31Var = (org.telegram.ui.Components.u31) characterStyle;
                    org.telegram.messenger.g0.g(u31Var.f38635a.subSequence(u31Var.f38636b, u31Var.f38637c).toString());
                    f8();
                    UndoView undoView = this.N3;
                    if (undoView != null) {
                        undoView.j(58, 0L, null);
                    }
                }
                if (z10 && q1Var != null) {
                    q1Var.d3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.y31) {
                TLRPC.User a22 = getMessagesController().a2(Utilities.A(((org.telegram.ui.Components.y31) characterStyle).getURL()));
                if (a22 != null) {
                    org.telegram.messenger.hp.s1(this.currentAccount).z3(a22, null, this, 0);
                }
                if (z10 && q1Var != null) {
                    q1Var.d3(-1);
                }
                ja(ziVar, false, false);
            } else if (characterStyle instanceof org.telegram.ui.Components.vz) {
                TLRPC.TL_messageEntityFormattedDate tL_messageEntityFormattedDate = ((org.telegram.ui.Components.vz) characterStyle).f39828b;
                if (tL_messageEntityFormattedDate == null || (messageObject = q1Var.getMessageObject()) == null) {
                    q1Var2 = q1Var;
                } else {
                    if (messageObject.d1() != 0 && (uiVar = (org.telegram.messenger.ui) this.O6.f(messageObject.d1())) != null) {
                        arrayList = uiVar.d;
                    } else {
                        arrayList = null;
                    }
                    if (arrayList == null) {
                        arrayList = org.telegram.messenger.k5.k(messageObject);
                    }
                    ArrayList arrayList2 = arrayList;
                    long e10 = getUserConfig().e();
                    String A = org.telegram.messenger.bd.A(tL_messageEntityFormattedDate, System.currentTimeMillis(), Locale.getDefault(), true);
                    org.telegram.ui.Components.f60 I = org.telegram.ui.Components.f60.I(this, q1Var);
                    org.telegram.ui.Components.nk0 nk0Var = new org.telegram.ui.Components.nk0(getParentActivity(), this.f51557ya);
                    I.f33742p = new ee(nk0Var, 0);
                    I.c(2131232103, org.telegram.messenger.bd.M0(2131746340, null), new ie(this, nk0Var, A, 0), false);
                    q1Var2 = q1Var;
                    I.c(2131232077, org.telegram.messenger.bd.M0(2131746341, null), new ci.s6((org.telegram.messenger.cs) this, (Object) I, (Object) messageObject, (Object) q1Var, A, (Object) tL_messageEntityFormattedDate, (Object) nk0Var, 4), false);
                    I.c(2131232262, org.telegram.messenger.bd.M0(2131746339, null), new ci.z2(this, I, e10, tL_messageEntityFormattedDate, arrayList2, nk0Var, 6), false);
                    SpannableString spannableString = new SpannableString(A);
                    spannableString.setSpan(characterStyle, 0, spannableString.length(), 33);
                    nk0Var.e(I);
                    nk0Var.f(q1Var2, characterStyle, spannableString, false);
                    showDialog(nk0Var);
                }
                if (q1Var2 != null) {
                    q1Var2.d3(-1);
                }
            } else if (characterStyle instanceof org.telegram.ui.Components.v31) {
                String url = ((org.telegram.ui.Components.v31) characterStyle).getURL();
                if (url != null && url.startsWith("tel:")) {
                    k8(q1Var, characterStyle, url.substring(4));
                    if (z10 && q1Var != null) {
                        q1Var.d3(-1);
                    }
                } else if (ziVar != null && url.startsWith("/")) {
                    if (org.telegram.ui.Components.s31.h) {
                        mj mjVar = this.f51237a0;
                        TLRPC.Chat chat = this.f51292e;
                        if (chat == null || !chat.megagroup) {
                            z13 = false;
                        }
                        mjVar.Z0(ziVar, url, z10, z13);
                        if (!z10 && this.f51237a0.getFieldText() == null) {
                            B9(false);
                        }
                    }
                    if (z10 && q1Var != null) {
                        q1Var.d3(-1);
                    }
                } else {
                    SparseArray[] sparseArrayArr = this.F6;
                    if (ziVar != null && url.startsWith("video") && !z10) {
                        int intValue = Utilities.z(url).intValue();
                        if (ziVar.f5()) {
                            webPage2 = ziVar.f26868k.media.webpage;
                            ziVar4 = ziVar;
                        } else {
                            org.telegram.messenger.zi ziVar6 = ziVar.C;
                            if (ziVar6 != null && ziVar6.f5()) {
                                ziVar4 = ziVar.C;
                                webPage2 = ziVar4.f26868k.media.webpage;
                            } else {
                                ziVar4 = ziVar;
                                webPage2 = null;
                            }
                        }
                        if (webPage2 != null) {
                            org.telegram.ui.Components.ut.K0(this, ziVar4, this.f51248ab, webPage2.site_name, webPage2.title, webPage2.url, webPage2.embed_url, webPage2.embed_width, webPage2.embed_height, intValue, T9());
                            return;
                        }
                        if (!org.telegram.messenger.zi.M4(ziVar4.f26868k) && (ziVar5 = ziVar4.C) != null) {
                            if (org.telegram.messenger.zi.B0(ziVar5.f26868k) == this.f51376k6) {
                                c2 = 0;
                            }
                            org.telegram.messenger.zi ziVar7 = (org.telegram.messenger.zi) sparseArrayArr[c2].get(ziVar4.C.f1());
                            if (ziVar7 == null) {
                                ziVar4 = ziVar4.C;
                            } else {
                                ziVar4 = ziVar7;
                            }
                        } else {
                            q1Var3 = q1Var;
                        }
                        ziVar4.f26833c0 = intValue / ((float) ziVar4.L0());
                        Ha(q1Var3, ziVar4);
                    } else if (ziVar != null && url.startsWith("audio")) {
                        int intValue2 = Utilities.z(url).intValue();
                        if (!ziVar.J3() && (ziVar3 = ziVar.C) != null) {
                            if (org.telegram.messenger.zi.B0(ziVar3.f26868k) == this.f51376k6) {
                                c10 = 0;
                            }
                            ziVar2 = (org.telegram.messenger.zi) sparseArrayArr[c10].get(ziVar.C.f1());
                        } else {
                            ziVar2 = ziVar;
                        }
                        if (ziVar2 != null) {
                            float f10 = intValue2;
                            float L0 = f10 / ((float) ziVar2.L0());
                            MediaController mediaController = getMediaController();
                            if (mediaController.I(ziVar2)) {
                                ziVar2.f26828b0 = L0;
                                mediaController.i0(ziVar2, L0);
                                if (mediaController.H()) {
                                    mediaController.S(ziVar2);
                                }
                            } else {
                                ziVar2.f26833c0 = f10 / ((float) ziVar2.L0());
                                mediaController.S(ziVar2);
                            }
                            if (z10 && q1Var != null) {
                                q1Var.d3(-1);
                            }
                            if (!org.telegram.messenger.zi.S4(ziVar2.f26868k)) {
                                showDialog(new org.telegram.ui.Components.z7(getParentActivity(), this.f51557ya));
                            }
                        }
                    } else if (url.startsWith("tonaddress:")) {
                        String substring = url.substring(11);
                        org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(this.currentAccount);
                        boolean isValidAddress = WalletEngine2.isValidAddress(substring);
                        TLRPC.User[] userArr = new TLRPC.User[1];
                        ci.v3 v3Var = new ci.v3(this, q1Var, isValidAddress, substring, userArr, characterStyle);
                        if (isValidAddress) {
                            ci ka2 = ka(q1Var, characterStyle);
                            boolean[] zArr = {false};
                            if (ka2 != null) {
                                ka2.f54708b = new xp0(zArr, 23);
                                ka2.d();
                            }
                            x10.Z(new ci.g3(this, zArr, ka2, userArr, v3Var, 1), substring);
                        } else {
                            v3Var.run();
                        }
                        if (q1Var != null) {
                            q1Var.d3(-1);
                        }
                    } else if (url.startsWith("card:")) {
                        String substring2 = url.substring(5);
                        ci ka3 = ka(q1Var, characterStyle);
                        TLRPC.TL_payments_getBankCardData tL_payments_getBankCardData = new TLRPC.TL_payments_getBankCardData();
                        tL_payments_getBankCardData.number = substring2;
                        ka3.f54708b = new ne(this, getConnectionsManager().sendRequest(tL_payments_getBankCardData, new ci.s7(this, ka3, q1Var, substring2, characterStyle, 3), null, null, 0, getMessagesController().O3, 1, true), 2);
                        ka3.d();
                        q1Var.d3(-1);
                    } else {
                        za(characterStyle, url, z10, q1Var, ziVar);
                    }
                }
            } else {
                String url2 = ((URLSpan) characterStyle).getURL();
                if (url2 != null && url2.startsWith("tel:")) {
                    k8(q1Var, characterStyle, url2.substring(4));
                } else if (z10) {
                    i8(q1Var, ziVar, characterStyle, url2);
                    if (q1Var != null) {
                        q1Var.d3(-1);
                    }
                } else {
                    ja(ziVar, false, false);
                    if (url2 != null && url2.matches("(?i)^(https?://)?(t\\.me|telegram\\.me|telegram\\.dog)/getpremium([/?#].*)?$")) {
                        Activity parentActivity = getParentActivity();
                        if (!url2.contains("://")) {
                            url2 = "https://".concat(url2);
                        }
                        sf.c.t(parentActivity, url2);
                        return;
                    }
                    boolean z14 = characterStyle instanceof org.telegram.ui.Components.x31;
                    if ((z14 && (url2 == null || !url2.startsWith("mailto:"))) || org.telegram.messenger.g0.J3(url2)) {
                        if (ziVar != null) {
                            i10 = ziVar.f1();
                        } else {
                            i10 = 0;
                        }
                        if (Ea(url2, q1Var, characterStyle, i10, 1)) {
                            return;
                        }
                    } else {
                        if (ziVar != null) {
                            TLRPC.MessageMedia messageMedia = ziVar.f26868k.media;
                            if ((messageMedia instanceof TLRPC.TL_messageMediaWebPage) && (webPage = messageMedia.webpage) != null && webPage.cached_page != null) {
                                String lowerCase = url2.toLowerCase();
                                String lowerCase2 = ziVar.f26868k.media.webpage.url.toLowerCase();
                                if ((lowerCase.contains("telegram.org/blog") || sf.c.i(lowerCase, false, false) || lowerCase.contains("t.me/iv")) && (lowerCase.contains(lowerCase2) || lowerCase2.contains(lowerCase))) {
                                    LaunchActivity launchActivity = LaunchActivity.K1;
                                    if (launchActivity == null || launchActivity.O() == null || LaunchActivity.K1.O().l(ziVar) == null) {
                                        createArticleViewer(false).L(ziVar, null, null, null);
                                        return;
                                    }
                                    return;
                                }
                            }
                        }
                        if (ziVar != null) {
                            i3 = ziVar.f1();
                        } else {
                            i3 = 0;
                        }
                        if (!Ea(url2, q1Var, characterStyle, i3, 1)) {
                            z12 = z14;
                        } else {
                            return;
                        }
                    }
                    if (sf.c.z(url2)) {
                        z11 = false;
                    } else {
                        z11 = z12;
                    }
                    Wa(2, url2, characterStyle, q1Var, z11);
                }
            }
        }
    }

    public final float j9(View view) {
        return ((view.getY() + this.actionBar.getMeasuredHeight()) - this.m1.getBackgroundTranslationY()) - ((1.0f - this.R9) * this.M9);
    }

    public final void ja(org.telegram.messenger.zi ziVar, boolean z10, boolean z11) {
        if (ziVar != null && ziVar.s4()) {
            TLRPC.TL_messages_clickSponsoredMessage tL_messages_clickSponsoredMessage = new TLRPC.TL_messages_clickSponsoredMessage();
            tL_messages_clickSponsoredMessage.random_id = ziVar.P0;
            tL_messages_clickSponsoredMessage.media = z10;
            tL_messages_clickSponsoredMessage.fullscreen = z11;
            getConnectionsManager().sendRequest(tL_messages_clickSponsoredMessage, null);
        }
    }

    public final void jb(int r25, java.util.ArrayList r26, boolean r27, boolean r28) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.jb(int, java.util.ArrayList, boolean, boolean):void");
    }

    public final void jc(boolean z10) {
        if (this.f51410n3 != null && !V9()) {
            if (this.f51410n3.getTag() == null) {
                ValueAnimator valueAnimator = this.f51524w3;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                this.f51410n3.setTag(1);
                ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f51538x3, 1.0f);
                this.f51524w3 = ofFloat;
                ofFloat.setDuration(150L);
                this.f51524w3.addUpdateListener(new ae(this, 2));
                this.f51524w3.addListener(new ai(this, 6));
                this.f51524w3.start();
            }
            if (!z10) {
                M9();
                this.f51435p3 = 1000;
            }
        }
    }

    public final void jd(int i3, int i10, int i11) {
        float f10;
        int i12;
        boolean z10;
        boolean z11;
        mh.h hVar = this.f51549y1;
        boolean z12 = false;
        if (hVar != null) {
            int i13 = 2;
            if (this.f51381kb) {
                i12 = 2;
            } else {
                i12 = 1;
            }
            if ((i12 & i3) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            hVar.b(6).f3234c = z10;
            k4.j jVar = hVar.f19425e[6];
            if (jVar != null) {
                ((lh.b) jVar.f16869a).b(z10, true);
            }
            mh.h hVar2 = this.f51549y1;
            if (this.f51381kb) {
                i13 = 1;
            }
            if ((i3 & i13) != 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar2.b(5).f3234c = z11;
            k4.j jVar2 = hVar2.f19425e[5];
            if (jVar2 != null) {
                ((lh.b) jVar2.f16869a).b(z11, true);
            }
        }
        this.L3 = i11;
        this.M3 = i10;
        kd();
        org.telegram.ui.Components.h6 h6Var = this.f51373k3;
        if (h6Var != null) {
            if (i11 > 0) {
                z12 = true;
            }
            h6Var.setClickable(z12);
            ViewPropertyAnimator animate = this.f51373k3.animate();
            if (i11 > 0) {
                f10 = 1.0f;
            } else {
                f10 = 0.5f;
            }
            animate.alpha(f10).start();
        }
    }

    public final void k7() {
        qj qjVar;
        pj pjVar;
        pj pjVar2;
        mj mjVar = this.f51237a0;
        if (mjVar != null && mjVar.A3) {
            MediaController.B().O = false;
            return;
        }
        TLRPC.Chat chat = this.f51292e;
        if (chat != null && !org.telegram.messenger.t3.v(chat)) {
            MediaController.B().O = false;
        } else if (!org.telegram.messenger.t0.f25465x && (((qjVar = this.f51279d1) == null || qjVar.getVisibility() != 0) && (((pjVar = this.T) == null || pjVar.getVisibility() != 0) && ((pjVar2 = this.f51324g3) == null || pjVar2.getVisibility() != 0)))) {
            MediaController.B().O = true;
        } else {
            MediaController.B().O = false;
        }
    }

    public final void k8(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle, String str) {
        ci ka2 = ka(q1Var, characterStyle);
        TLRPC.TL_contact tL_contact = (TLRPC.TL_contact) getContactsController().f22659l0.get(mf.b.d(str, false));
        ci.o2 o2Var = new ci.o2(this, q1Var, str, tL_contact, characterStyle, 2);
        if (tL_contact != null) {
            TLRPC.User a22 = getMessagesController().a2(Long.valueOf(tL_contact.user_id));
            if (a22 != null) {
                o2Var.a(a22);
                return;
            } else {
                getMessagesStorage().f24934a.c(new p1(this, tL_contact, o2Var, 15));
                return;
            }
        }
        TLRPC.TL_contacts_resolvePhone tL_contacts_resolvePhone = new TLRPC.TL_contacts_resolvePhone();
        tL_contacts_resolvePhone.phone = mf.b.d(str, false);
        ka2.f54708b = new ne(this, getConnectionsManager().sendRequest(tL_contacts_resolvePhone, new y9(this, ka2, o2Var, 3)), 0);
        ka2.d();
    }

    public final float k9() {
        org.telegram.ui.Components.g11 g11Var = this.f51323g2;
        if (g11Var != null) {
            return g11Var.getSideMenuT();
        }
        return 0.0f;
    }

    public final ci ka(org.telegram.ui.Cells.q1 q1Var, CharacterStyle characterStyle) {
        sf.b bVar = this.f51263bc;
        if (bVar != null) {
            bVar.a(true);
            this.f51263bc = null;
        }
        if (characterStyle != null && q1Var != null && q1Var.getMessageObject() != null) {
            ci ciVar = new ci(this, q1Var.getMessageObject().f1(), characterStyle, q1Var, 0);
            this.f51263bc = ciVar;
            return ciVar;
        }
        this.f51263bc = null;
        return null;
    }

    public final void kb() {
        getConnectionsManager().cancelRequestsForGuid(this.classGuid);
        getMessagesStorage().k(this.classGuid);
        this.classGuid = ConnectionsManager.generateClassGuid();
        this.L7 = 0;
        this.B7 = false;
        this.C7 = true;
        this.f51554y6.clear();
    }

    public final boolean kc() {
        mj mjVar = this.f51237a0;
        if (mjVar != null && mjVar.getVisibility() == 0) {
            SharedPreferences e12 = org.telegram.messenger.hp.e1();
            if (!e12.getBoolean("gifhint", false)) {
                e12.edit().putBoolean("gifhint", true).commit();
                if (getParentActivity() != null && this.fragmentView != null && this.f51485t2 == null) {
                    if (!this.f51476s5) {
                        mj mjVar2 = this.f51237a0;
                        if (mjVar2 != null) {
                            mjVar2.Q();
                            org.telegram.messenger.li.b0(mjVar2.R).V0(0, true, true, false);
                            org.telegram.ui.Components.kf kfVar = mjVar2.V0;
                            kfVar.L(false, false);
                            kfVar.Q(false, false);
                            kfVar.h.x(1, false);
                            return false;
                        }
                    } else {
                        kl klVar = this.m1;
                        int indexOfChild = klVar.indexOfChild(this.U);
                        if (indexOfChild != -1) {
                            mj mjVar3 = this.f51237a0;
                            mjVar3.Q();
                            org.telegram.messenger.li.b0(mjVar3.R).V0(0, true, true, false);
                            org.telegram.ui.Components.kf kfVar2 = mjVar3.V0;
                            kfVar2.L(false, false);
                            kfVar2.Q(false, false);
                            kfVar2.h.x(1, false);
                            View view = new View(getParentActivity());
                            this.L2 = view;
                            view.setBackgroundResource(2131232672);
                            int i3 = indexOfChild + 1;
                            klVar.addView(this.L2, i3, b8.mf.d(10, 10.0f, 83, 37.0f, 0.0f, 0.0f, 27.0f));
                            gi.l3 D6 = D6(310.0f, 3, i3, false);
                            this.f51485t2 = D6;
                            D6.d = 2300L;
                            D6.u(org.telegram.messenger.bd.M0(2131744278, null));
                            this.L2.setAlpha(0.0f);
                            this.L2.animate().alpha(1.0f).setDuration(300L).start();
                            View emojiButton = this.f51237a0.getEmojiButton();
                            if (emojiButton != null) {
                                this.f51485t2.y(emojiButton, true);
                            }
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void kd() {
        org.telegram.ui.Components.h6 h6Var = this.f51362j3;
        if (h6Var != null) {
            boolean z10 = !org.telegram.messenger.bd.f21784a0;
            int i3 = this.L3;
            if (i3 < 0) {
                h6Var.c("", z10, true);
            } else if (i3 == 0) {
                h6Var.c(org.telegram.messenger.bd.M0(2131748175, null), z10, true);
            } else if (this.G3) {
                h6Var.c(org.telegram.messenger.bd.G(i3, "TaggedMessages", new Object[0]), z10, true);
            } else if (this.f51325g4 != 7 && !this.f51291dd.f53841f) {
                h6Var.c(org.telegram.messenger.bd.a0(null, null, 2131747837, Integer.valueOf(this.M3 + 1), Integer.valueOf(this.L3)), z10, true);
            } else {
                h6Var.c(org.telegram.messenger.bd.G(i3, "SearchMessagesResultCount", org.telegram.messenger.bd.E(i3, ' ')), z10, true);
            }
        }
    }

    @Override
    public final void l(int i3, int i10, boolean z10, int i11, boolean z11, int i12) {
        xb(i3, i10, z10, i11, z11, i12, null, null, null);
    }

    public final boolean l7(boolean z10, boolean z11) {
        mj mjVar = this.f51237a0;
        if (mjVar == null || !mjVar.t0()) {
            return false;
        }
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f51557ya);
            boolean z12 = this.f51237a0.f31104d1;
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            if (z12) {
                s1Var.S = org.telegram.messenger.bd.M0(2131751396, null);
                s1Var.U = org.telegram.messenger.bd.M0(2131751397, null);
            } else {
                s1Var.S = org.telegram.messenger.bd.M0(2131751393, null);
                s1Var.U = org.telegram.messenger.bd.M0(2131751394, null);
            }
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751395, null), new ei.f(7, this, z11));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131751771, null), null);
            showDialog(s1Var);
            return true;
        }
        return true;
    }

    public final void l8(org.telegram.ui.Cells.z r31, final org.telegram.tgnet.TLRPC.ReactionCount r32, boolean r33, float r34, float r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.l8(org.telegram.ui.Cells.z, org.telegram.tgnet.TLRPC$ReactionCount, boolean, float, float):void");
    }

    public final int l9() {
        return (int) (k9() * org.telegram.messenger.g0.L(71.0f));
    }

    public final void la(org.telegram.messenger.zi ziVar) {
        if (ziVar != null && ziVar.s4() && !ziVar.f26898s0) {
            ziVar.f26898s0 = true;
            TLRPC.TL_messages_viewSponsoredMessage tL_messages_viewSponsoredMessage = new TLRPC.TL_messages_viewSponsoredMessage();
            tL_messages_viewSponsoredMessage.random_id = ziVar.P0;
            getConnectionsManager().sendRequest(tL_messages_viewSponsoredMessage, null);
            getMessagesController().getClass();
        }
    }

    public final void lb() {
        this.Zb = null;
        this.Xb = 0;
        this.Yb = -1;
        this.ac = null;
        this.f51263bc = null;
        this.f51549y1.d(false);
    }

    public final void lc() {
        TLRPC.ChatFull chatFull = this.f51453q8;
        if (chatFull != null && !this.H5) {
            TLRPC.Chat chat = this.f51292e;
            if (chat.creator && chat.megagroup && !chat.gigagroup && chatFull.pending_suggestions.contains("CONVERT_GIGAGROUP") && this.visibleDialog == null) {
                org.telegram.messenger.g0.i3(new yd(this, 17), 1000L);
            }
        }
    }

    public final void ld() {
        b8();
        String str = this.J3;
        if (str != null) {
            this.f51473s2.f41128e.setText(org.telegram.messenger.bd.a0(null, null, 2131749362, str));
            this.f51241a4.setEmptyView(this.f51473s2);
            return;
        }
        this.f51241a4.setEmptyView(null);
        this.f51473s2.setVisibility(8);
    }

    public final void m7() {
        if (!this.tc) {
            this.tc = true;
            if (!this.uc && this.f51325g4 == 0 && !getMessagesController().G1().f24435b && getMessagesController().G1().c() > 2) {
                if (this.K1 != null && org.telegram.messenger.hp.e1().getInt("savedhint", 0) < 1) {
                    this.K1.w();
                    this.uc = true;
                    org.telegram.messenger.hp.e1().edit().putInt("savedhint", org.telegram.messenger.hp.e1().getInt("savedhint", 0) + 1).putInt("savedsearchhint", org.telegram.messenger.hp.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else if (this.L1 != null && org.telegram.messenger.hp.e1().getInt("savedsearchhint", 0) < 1) {
                    this.L1.w();
                    this.uc = true;
                    org.telegram.messenger.hp.e1().edit().putInt("savedsearchhint", org.telegram.messenger.hp.e1().getInt("savedsearchhint", 0) + 1).apply();
                } else {
                    n7();
                }
            }
        }
    }

    public final void m8(int r32, java.lang.Object... r33) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.m8(int, java.lang.Object[]):void");
    }

    public final org.telegram.ui.ActionBar.q0 m9() {
        org.telegram.ui.ActionBar.q0 q0Var = this.m0;
        if (q0Var != null && q0Var.getVisibility() == 0 && this.m0.getWidth() != 0 && this.actionBar != null && (this.m0.getParent() instanceof View)) {
            return this.m0;
        }
        return null;
    }

    public final boolean ma() {
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.Components.t5 t5Var;
        org.telegram.messenger.zi ziVar2;
        ImageReceiver photoImage;
        org.telegram.ui.Components.t5 m10;
        boolean z10;
        org.telegram.ui.Cells.q1 q1Var;
        boolean z11;
        if (this.A0 != null && ((ziVar = MediaController.B().f21348v0) == null || org.telegram.messenger.zi.M4(ziVar.f26868k))) {
            gi.l3 l3Var = this.I2;
            ArrayList arrayList = null;
            if (l3Var != null && l3Var.W && (q1Var = this.Ib) != null) {
                ImageReceiver photoImage2 = q1Var.getPhotoImage();
                t5Var = photoImage2.m();
                if (t5Var != null) {
                    ziVar2 = q1Var.getMessageObject();
                    if (photoImage2.A() + q1Var.getTop() > this.A0.getMeasuredHeight()) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    this.M8 = z11;
                } else {
                    ziVar2 = null;
                }
            } else {
                t5Var = null;
                ziVar2 = null;
            }
            if (ziVar2 == null) {
                int childCount = this.A0.getChildCount();
                int i3 = 0;
                while (true) {
                    if (i3 >= childCount) {
                        break;
                    }
                    View childAt = this.A0.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.zi messageObject = q1Var2.getMessageObject();
                        boolean i42 = messageObject.i4();
                        if (!messageObject.h4() && !messageObject.T4() && ((org.telegram.messenger.zi.M4(messageObject.f26868k) || i42) && messageObject.f26886p0 == null && (m10 = (photoImage = q1Var2.getPhotoImage()).m()) != null)) {
                            float top = childAt.getTop() + photoImage.M0;
                            float f10 = photoImage.O0 + top;
                            if (f10 >= 0.0f && top <= this.A0.getMeasuredHeight()) {
                                if (ziVar2 != null && top < 0.0f) {
                                    break;
                                }
                                if (top >= 0.0f && f10 <= this.A0.getMeasuredHeight()) {
                                    z10 = false;
                                } else {
                                    z10 = true;
                                }
                                this.M8 = z10;
                                if (top >= 0.0f && f10 <= this.A0.getMeasuredHeight()) {
                                    ziVar2 = messageObject;
                                    t5Var = m10;
                                    break;
                                }
                                ziVar2 = messageObject;
                                t5Var = m10;
                            }
                        }
                    }
                    i3++;
                }
            }
            if (ziVar2 != null && !MediaController.B().I(ziVar2)) {
                E9(true);
                if (ziVar2.i4()) {
                    boolean S = MediaController.B().S(ziVar2);
                    MediaController B = MediaController.B();
                    if (S) {
                        arrayList = g8(ziVar2, false);
                    }
                    B.r0(arrayList, false);
                    return S;
                }
                org.telegram.messenger.az.D(true);
                ziVar2.f26828b0 = t5Var.n();
                ziVar2.f26836d0 = t5Var.o();
                t5Var.stop();
                if (PhotoViewer.O1(ziVar2)) {
                    PhotoViewer.f41370c9.Q0();
                }
                return MediaController.B().S(ziVar2);
            }
        }
        return false;
    }

    public final void mb(org.telegram.ui.Cells.q1 r13) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.mb(org.telegram.ui.Cells.q1):void");
    }

    public final void mc(org.telegram.messenger.zi ziVar, CharSequence charSequence, int i3) {
        int length;
        if (charSequence == null) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        int max = Math.max(4000, Math.min((length / 50) * 1600, 10000));
        org.telegram.ui.Components.ac G = org.telegram.ui.Components.fc.a0(this).G(2131623981, 9999, charSequence);
        G.f31792j = max;
        G.v = new ne(this, i3, 3);
        G.k(true);
        this.V3 = ziVar;
        this.W3 = i3;
    }

    public final void md() {
        boolean z10;
        if (this.f51549y1 == null) {
            return;
        }
        if ((!getMediaDataController().Z0.isEmpty() && this.H3 && !this.G3) || (this.f51325g4 == 7 && this.f51282d4 == 2 && !this.L6.isEmpty())) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f51549y1.e(6, z10, true);
        this.f51549y1.e(5, z10, true);
        if (z10) {
            this.f51549y1.e(1, false, true);
        }
        if (!z10) {
            this.S7 = 0;
        }
        this.m1.invalidate();
    }

    @Override
    public final void n(ArrayList arrayList, String str, ArrayList arrayList2, ArrayList arrayList3, boolean z10, int i3, long j10, boolean z11, long j11) {
        boolean z12;
        String str2 = null;
        B8(str, null);
        if (t7()) {
            if (!arrayList3.isEmpty() && !TextUtils.isEmpty(str)) {
                org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(str, this.f51376k6, null, null, null, true, arrayList2, null, null, true, 0, 0, null, false);
                b10.K = W8();
                z12 = z11;
                b10.L = z12;
                b10.Q = j11;
                b10.R = h9();
                b10.T = this.f51540x5;
                org.telegram.messenger.yy.C(this.currentAccount).r0(b10);
            } else {
                z12 = z11;
                str2 = str;
            }
            getSendMessagesHelper().q0(arrayList3, this.f51376k6, false, false, true, 0, 0, null, -1, j11, h9(), this.f51540x5);
            org.telegram.messenger.c accountInstance = getAccountInstance();
            long j12 = this.f51376k6;
            org.telegram.messenger.zi ziVar = this.E5;
            org.telegram.messenger.zi ziVar2 = this.f51397m4;
            mm mmVar = this.C5;
            String str3 = str2;
            org.telegram.messenger.yy.V(i3, j12, j10, j11, h9(), str3, null, arrayList, arrayList, null, arrayList2, null, null, accountInstance, ziVar, ziVar2, this.G5, this.f51540x5, W8(), null, mmVar, null, null, z10, z12);
            K6();
        }
    }

    public final void n7() {
        org.telegram.ui.Cells.q1 q1Var;
        gi.l3 l3Var;
        TLRPC.Message message;
        TLRPC.TL_messageReactions tL_messageReactions;
        boolean z10;
        gi.l3 l3Var2 = this.M1;
        if (l3Var2 != null && !l3Var2.W && !this.f51533wc && this.tc && !this.f51291dd.f53841f && System.currentTimeMillis() - this.f51519vc > 1800 && org.telegram.messenger.hp.e1().getInt("savedsearchtaghint", 0) < 1) {
            int[] iArr = new int[2];
            int childCount = this.A0.getChildCount() - 1;
            while (true) {
                if (childCount >= 0) {
                    View childAt = this.A0.getChildAt(childCount);
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        q1Var = (org.telegram.ui.Cells.q1) childAt;
                        dh.o0 o0Var = q1Var.O;
                        org.telegram.messenger.zi primaryMessageObject = q1Var.getPrimaryMessageObject();
                        if (primaryMessageObject == null || (message = primaryMessageObject.f26868k) == null || (tL_messageReactions = message.reactions) == null) {
                            z10 = false;
                        } else {
                            z10 = tL_messageReactions.reactions_as_tags;
                        }
                        if (z10 && !o0Var.f9128s.isEmpty()) {
                            q1Var.getLocationInWindow(iArr);
                            float f10 = iArr[1] + o0Var.f9114c;
                            if (f10 >= org.telegram.messenger.g0.L(240.0f) && f10 <= (org.telegram.messenger.g0.f22608q.y - org.telegram.messenger.g0.L(25.0f)) - org.telegram.messenger.g0.f22603n) {
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
                dh.o0 o0Var2 = q1Var.O;
                this.f51533wc = true;
                q1Var.getLocationInWindow(iArr);
                this.M1.setTranslationY(((iArr[1] - l3Var.getTop()) - org.telegram.messenger.g0.L(120.0f)) + o0Var2.f9114c);
                this.M1.p(0.0f, (((dh.l0) o0Var2.f9128s.get(0)).f9088z / 2.0f) + (-org.telegram.messenger.g0.L(16.0f)) + iArr[0] + o0Var2.f9113b);
                this.M1.w();
                org.telegram.messenger.hp.e1().edit().putInt("savedsearchtaghint", 1).apply();
                return;
            }
            org.telegram.messenger.g0.r(new yd(this, 22));
            org.telegram.messenger.g0.i3(new yd(this, 22), 2000L);
        }
    }

    public final void n8(int r28, java.lang.Object... r29) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.n8(int, java.lang.Object[]):void");
    }

    public final int n9(int i3) {
        SparseIntArray sparseIntArray = this.f51350i5;
        int i10 = sparseIntArray.get(i3, -1);
        if (i10 == -1) {
            int i11 = f51229ld;
            f51229ld = i11 + 1;
            sparseIntArray.put(i3, i11);
            return i11;
        }
        return i10;
    }

    public final void na(org.telegram.messenger.zi ziVar) {
        org.telegram.ui.ActionBar.d2 d2Var;
        org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
        if (q4Var == null) {
            return;
        }
        long j10 = ziVar.f26868k.action.channel_id;
        if (q4Var.getFragmentStack().size() > 0) {
            d2Var = (org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1);
        } else {
            d2Var = null;
        }
        int indexOf = this.parentLayout.getFragmentStack().indexOf(this);
        org.telegram.ui.ActionBar.q4 q4Var2 = this.parentLayout;
        if (indexOf > 0 && !(d2Var instanceof wm) && !(d2Var instanceof ProfileActivity) && this.f51292e.creator) {
            int size = q4Var2.getFragmentStack().size() - 1;
            while (indexOf < size) {
                org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) q4Var2.getFragmentStack().get(indexOf);
                if (d2Var2 instanceof wm) {
                    ((ActionBarLayout) q4Var2).c(indexOf, new wm(a1.g.j(j10, "chat_id")));
                    d2Var2.removeSelfFromStack();
                } else if (d2Var2 instanceof ProfileActivity) {
                    ((ActionBarLayout) q4Var2).c(indexOf, new ProfileActivity(a1.g.j(j10, "chat_id"), null));
                    d2Var2.removeSelfFromStack();
                } else if (d2Var2 instanceof ln) {
                    ((ActionBarLayout) q4Var2).c(indexOf, new ln(a1.g.j(j10, "chat_id")));
                    d2Var2.removeSelfFromStack();
                } else if (d2Var2 instanceof nq) {
                    if (((nq) d2Var2).f48059e1 == 0) {
                        Bundle arguments = d2Var2.getArguments();
                        arguments.putLong("chat_id", j10);
                        ((ActionBarLayout) q4Var2).c(indexOf, new nq(arguments));
                    }
                    d2Var2.removeSelfFromStack();
                }
                indexOf++;
            }
        } else {
            org.telegram.messenger.g0.h3(new o4.b1(this, d2Var, ziVar, q4Var2, 10));
        }
        org.telegram.messenger.g0.i3(new cg.i0(this, j10, 2), 1000L);
    }

    public final void nb() {
        org.telegram.ui.Components.la0 k10;
        um umVar = this.f51557ya;
        if (umVar != null) {
            Drawable m10 = umVar.m();
            if (this.fragmentView != null) {
                m10 = this.m1.getBackgroundImage();
            }
            if (m10 instanceof zm) {
                m10 = ((zm) m10).c(true);
            }
            if (m10 instanceof org.telegram.ui.Components.la0) {
                ((org.telegram.ui.Components.la0) m10).w(false);
            }
            Drawable themedDrawable = getThemedDrawable("drawableMsgOut");
            if ((themedDrawable instanceof org.telegram.ui.ActionBar.t4) && (k10 = ((org.telegram.ui.ActionBar.t4) themedDrawable).k()) != null) {
                k10.w(false);
            }
        }
    }

    public final void nc(boolean z10) {
        boolean z11;
        mh.h hVar = this.f51549y1;
        if (hVar != null) {
            if (z10 && !org.telegram.messenger.t3.p0(this.f51292e)) {
                z11 = true;
            } else {
                z11 = false;
            }
            hVar.e(2, z11, true);
            if (!z10) {
                this.S7 = 0;
            }
        }
    }

    public final void nd(String str) {
        if (this.f51325g4 == 7 && !TextUtils.equals(this.J3, str)) {
            b8();
            oc(true);
            this.J3 = str;
            this.I3 = str;
            f7(false);
            L7(true);
            this.f51300e7 = 0L;
            this.B7 = false;
            org.telegram.messenger.ha.a(this.currentAccount).b(this.f51282d4).a();
            this.f51255b4.f();
            this.f51241a4.requestLayout();
            if (this.f51241a4.getLayoutManager() != null) {
                this.f51241a4.getLayoutManager().n0(0);
            }
            ld();
            this.f51473s2.e(true, true);
            J8();
        }
    }

    @Override
    public final boolean needDelayOpenAnimation() {
        if (this.f51325g4 != 1 && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if ((d2Var instanceof wm) && ((wm) d2Var).T9()) {
                return false;
            }
        }
        return this.Y6;
    }

    public final void o7(boolean z10) {
        int i3;
        if (this.C0 != null && !this.H5 && !this.D0.M && !this.f51528w7) {
            int i10 = 0;
            int i11 = -1;
            int i12 = -1;
            for (int i13 = 0; i13 < this.A0.getChildCount(); i13++) {
                int R = RecyclerView.R(this.A0.getChildAt(i13));
                if (R != -1) {
                    if (i12 == -1 || R < i12) {
                        i12 = R;
                    }
                    if (i11 == -1 || R > i11) {
                        i11 = R;
                    }
                    i10++;
                }
            }
            fl flVar = this.D0;
            if (flVar.O) {
                int i14 = flVar.F;
                if (i14 >= 0 && i12 >= 0 && i14 >= i12 && i14 <= i11) {
                    getMediaDataController().O0();
                    return;
                }
                return;
            }
            int b10 = flVar.b();
            if (z10) {
                i3 = 25;
            } else {
                i3 = 5;
            }
            int i15 = i3;
            if (this.f51325g4 == 7) {
                if ((b10 - i12) - i10 <= i15 && !this.X6 && !this.T6[0]) {
                    this.X6 = true;
                    this.f51554y6.add(Integer.valueOf(this.f51399m6));
                    org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(this.currentAccount);
                    String str = this.J3;
                    int i16 = this.classGuid;
                    int i17 = this.f51282d4;
                    int i18 = this.f51399m6;
                    this.f51399m6 = i18 + 1;
                    a10.e(i16, i17, i18, str);
                    return;
                }
                return;
            }
            org.telegram.messenger.g0.h3(new org.telegram.messenger.br(this, b10, i12, i10, i15, 1));
        }
    }

    public final void o8(int r34, final java.lang.Object... r35) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.o8(int, java.lang.Object[]):void");
    }

    public final int o9(int i3) {
        SparseIntArray sparseIntArray = this.f51339h5;
        int i10 = sparseIntArray.get(i3, -1);
        if (i10 == -1) {
            int i11 = f51229ld;
            f51229ld = i11 + 1;
            sparseIntArray.put(i3, i11);
            return i11;
        }
        return i10;
    }

    public final void oa(boolean z10) {
        int i3;
        if (this.A0 != null) {
            ArrayList arrayList = this.L6;
            if (!arrayList.isEmpty() && !this.Qa.f50591n) {
                if (z10) {
                    i3 = 0;
                    while (i3 < arrayList.size() && ((org.telegram.messenger.zi) arrayList.get(i3)).s4()) {
                        i3++;
                    }
                } else {
                    i3 = 0;
                }
                this.C0.h1(i3, 0);
                this.A0.C0();
            }
        }
    }

    public final void ob() {
        boolean z10;
        org.telegram.messenger.zi ziVar;
        CharSequence charSequence;
        boolean z11;
        TL_iv.RichMessage richMessage;
        TLRPC.Message message;
        long j10;
        qj qjVar;
        mj mjVar = this.f51237a0;
        if (mjVar != null && mjVar.E1) {
            return;
        }
        TLRPC.SuggestedPost suggestedPost = null;
        if (!this.f51388l5 && mjVar != null && (qjVar = this.f51279d1) != null && qjVar.getVisibility() != 0) {
            ziVar = this.E5;
            charSequence = org.telegram.messenger.g0.n1(this.f51237a0.getDraftMessage());
            z10 = this.f51237a0.Z2;
        } else {
            z10 = true;
            ziVar = null;
            charSequence = null;
        }
        if (this.D5) {
            charSequence = null;
        }
        CharSequence[] charSequenceArr = {charSequence};
        org.telegram.messenger.li mediaDataController = getMediaDataController();
        TLRPC.EncryptedChat encryptedChat = this.h;
        if (encryptedChat != null && org.telegram.messenger.g0.X0(encryptedChat.layer) < 101) {
            z11 = false;
        } else {
            z11 = true;
        }
        ArrayList W = mediaDataController.W(charSequenceArr, z11, false);
        long P7 = P7(ziVar);
        TLRPC.DraftMessage R = getMediaDataController().R(this.f51376k6, P7);
        if (R != null) {
            richMessage = R.rich_message;
        } else {
            richMessage = null;
        }
        org.telegram.messenger.li mediaDataController2 = getMediaDataController();
        long j11 = this.f51376k6;
        CharSequence charSequence2 = charSequenceArr[0];
        if (ziVar != null && !ziVar.f26885p && ziVar.f26856h1 == null && !this.D5) {
            message = ziVar.f26868k;
        } else {
            message = null;
        }
        mm mmVar = this.C5;
        org.telegram.messenger.ej ejVar = this.f51540x5;
        if (ejVar != null) {
            suggestedPost = ejVar.c();
        }
        TLRPC.SuggestedPost suggestedPost2 = suggestedPost;
        mj mjVar2 = this.f51237a0;
        if (mjVar2 != null) {
            j10 = mjVar2.getEffectId();
        } else {
            j10 = 0;
        }
        mediaDataController2.Q1(j11, P7, charSequence2, W, message, mmVar, suggestedPost2, j10, !z10, false, richMessage);
    }

    public final void oc(boolean z10) {
        int i3;
        if (this.Z3 != null) {
            qe.a aVar = this.f51291dd;
            if (aVar.f53841f != z10) {
                aVar.a(z10, true);
                if (!z10 && this.f51325g4 == 7) {
                    u4.b0 b0Var = (u4.b0) this.f51241a4.getLayoutManager();
                    Object E = this.f51255b4.E((b0Var.N0() + b0Var.L0()) / 2);
                    Object E2 = this.f51255b4.E(b0Var.L0());
                    Object E3 = this.f51255b4.E(b0Var.N0());
                    if (E != null && E2 != null && E3 != null) {
                        ArrayList L = this.D0.L();
                        int L0 = this.C0.L0();
                        int N0 = this.C0.N0();
                        int i10 = ((org.telegram.messenger.zi) E).f26868k.f27022id;
                        int i11 = ((org.telegram.messenger.zi) E2).f26868k.f27022id;
                        int i12 = ((org.telegram.messenger.zi) E3).f26868k.f27022id;
                        int i13 = -1;
                        boolean z11 = false;
                        boolean z12 = false;
                        for (int i14 = 0; i14 < L.size(); i14++) {
                            if (((org.telegram.messenger.zi) L.get(i14)).f26868k.f27022id == i11) {
                                int i15 = this.D0.K + i14;
                                if (L0 <= i15 && N0 >= i15) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                if (z11) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.zi) L.get(i14)).f26868k.f27022id == i12) {
                                int i16 = this.D0.K + i14;
                                if (L0 <= i16 && N0 >= i16) {
                                    z12 = true;
                                } else {
                                    z12 = false;
                                }
                                if (z12) {
                                    break;
                                }
                            }
                            if (((org.telegram.messenger.zi) L.get(i14)).f26868k.f27022id == i10) {
                                i13 = i14;
                            }
                        }
                        if (!z11 && !z12 && i13 != -1) {
                            this.C0.h1(this.D0.K + i13, (this.A0.getHeight() - U8((org.telegram.messenger.zi) L.get(i13), true)) / 2);
                        }
                    }
                }
                org.telegram.ui.Components.h6 h6Var = this.f51373k3;
                if (h6Var != null) {
                    if (aVar.f53841f) {
                        i3 = 2131745828;
                    } else {
                        i3 = 2131745827;
                    }
                    h6Var.c(org.telegram.messenger.bd.M0(i3, null), !org.telegram.messenger.bd.f21784a0, true);
                }
                gi.l3 l3Var = this.M1;
                if (l3Var != null && l3Var.W) {
                    l3Var.f(true);
                }
                vk vkVar = this.Q1;
                if (vkVar != null && vkVar.W) {
                    vkVar.f(true);
                }
                mj mjVar = this.f51237a0;
                if (mjVar != null) {
                    mjVar.i0();
                }
                kd();
            }
        }
    }

    public final void od() {
        mj mjVar;
        if (this.T != null) {
            this.H0.setBackground(null);
            this.H0.setOnClickListener(null);
            boolean z10 = true;
            if (this.f51325g4 == 3 && c9() == 2666000) {
                this.H0.setText(org.telegram.messenger.bd.M0(2131753882, null));
                this.T.setVisibility(0);
                this.X1.setVisibility(8);
                this.X1.setTag(null);
                Wc();
                org.telegram.ui.Components.ow0 ow0Var = this.f51472s1;
                if (ow0Var != null) {
                    ow0Var.f();
                }
            } else {
                TLRPC.Chat chat = this.f51292e;
                if (chat != null && !org.telegram.messenger.t3.n(chat)) {
                    TLRPC.Chat chat2 = this.f51292e;
                    if (!org.telegram.messenger.t3.p(chat2) && !org.telegram.messenger.t3.u(chat2) && !org.telegram.messenger.t3.s(chat2) && !org.telegram.messenger.t3.v(chat2) && !org.telegram.messenger.t3.l(chat2) && !org.telegram.messenger.t3.o(chat2) && !org.telegram.messenger.t3.t(chat2)) {
                        TLRPC.Chat chat3 = this.f51292e;
                        if (!chat3.gigagroup && (!org.telegram.messenger.t3.T(chat3) || this.f51292e.megagroup)) {
                            TLRPC.Chat chat4 = this.f51292e;
                            TLRPC.TL_chatBannedRights tL_chatBannedRights = chat4.default_banned_rights;
                            if (tL_chatBannedRights != null && tL_chatBannedRights.send_messages) {
                                if (org.telegram.messenger.t3.s0(chat4)) {
                                    Drawable mutate = getParentActivity().getDrawable(2131231127).mutate();
                                    int i3 = org.telegram.ui.ActionBar.k6.Ci;
                                    mutate.setTint(getThemedColor(i3));
                                    this.Q0 = mutate;
                                    this.N0 = getThemedColor(i3);
                                    mutate.setBounds(0, 0, org.telegram.messenger.g0.L(14.0f), org.telegram.messenger.g0.L(14.0f));
                                    org.telegram.ui.Components.xp xpVar = new org.telegram.ui.Components.xp(null, mutate, org.telegram.messenger.g0.L(-6.0f), org.telegram.messenger.g0.L(-6.0f));
                                    int L = org.telegram.messenger.g0.L(14.0f);
                                    int L2 = org.telegram.messenger.g0.L(14.0f);
                                    xpVar.f40441e = L;
                                    xpVar.f40442f = L2;
                                    int L3 = org.telegram.messenger.g0.L(14.0f);
                                    int L4 = org.telegram.messenger.g0.L(14.0f);
                                    xpVar.h = L3;
                                    xpVar.f40443n = L4;
                                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(k2.p1.k(2131753581, null, new StringBuilder("d ")));
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.tz(i3, getResourceProvider()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                                    spannableStringBuilder.setSpan(new ImageSpan(xpVar, 1), 0, 1, 33);
                                    TextView textView = this.H0;
                                    int i10 = org.telegram.ui.ActionBar.k6.f27972i6;
                                    org.telegram.ui.ActionBar.r6.R(textView, org.telegram.ui.ActionBar.k6.i0(0, org.telegram.ui.ActionBar.k6.x0(null, i10, false)), null, org.telegram.ui.ActionBar.r6.N(i10), null);
                                    this.H0.setText(spannableStringBuilder);
                                    this.H0.setOnClickListener(new je(this, 0));
                                } else {
                                    this.H0.setText(org.telegram.messenger.bd.M0(2131749542, null));
                                }
                            } else if (org.telegram.messenger.g0.D1(chat4.banned_rights)) {
                                this.H0.setText(org.telegram.messenger.bd.M0(2131745607, null));
                            } else {
                                this.H0.setText(org.telegram.messenger.bd.a0("SendMessageRestricted", null, 2131745608, org.telegram.messenger.bd.v(this.f51292e.banned_rights.until_date)));
                            }
                            this.T.setVisibility(0);
                            this.X1.setVisibility(8);
                            this.X1.setTag(null);
                            Wc();
                            org.telegram.ui.Components.ow0 ow0Var2 = this.f51472s1;
                            if (ow0Var2 != null) {
                                ow0Var2.f();
                            }
                        }
                    }
                }
                V7(false);
                TLRPC.EncryptedChat encryptedChat = this.h;
                if (encryptedChat != null && this.f51408n1 != null) {
                    if (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) {
                        this.H0.setText(org.telegram.messenger.bd.M0(2131751130, null));
                        this.T.setVisibility(0);
                        this.f51237a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting) {
                        org.telegram.messenger.k5.r("AwaitingEncryption", null, 2131753757, new Object[]{a1.g.s(new StringBuilder("<b>"), this.f51306f.first_name, "</b>")}, this.H0);
                        this.T.setVisibility(0);
                        this.f51237a0.setVisibility(4);
                    } else if (encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) {
                        this.H0.setText(org.telegram.messenger.bd.M0(2131751129, null));
                        this.T.setVisibility(0);
                        this.f51237a0.setVisibility(4);
                        this.f51237a0.setFieldText("");
                        getMediaDataController().D(this.f51376k6, this.f51475s4, false);
                    } else {
                        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
                            this.T.setVisibility(4);
                            if (!this.inPreviewMode && !this.jb && this.f51325g4 != 3) {
                                this.f51237a0.setVisibility(0);
                            }
                        }
                        z10 = false;
                    }
                    k7();
                    U6(false);
                } else {
                    this.T.setVisibility(4);
                    if (this.f51472s1 != null && (mjVar = this.f51237a0) != null && mjVar.h0()) {
                        this.f51472s1.e();
                        return;
                    }
                    return;
                }
            }
            if (this.inPreviewMode) {
                this.T.setVisibility(4);
            }
            if (z10) {
                this.f51237a0.j0(false);
                if (getParentActivity() != null) {
                    org.telegram.messenger.g0.v1(getParentActivity().getCurrentFocus());
                }
            }
        }
    }

    @Override
    public final void onActivityResultFragment(int r12, int r13, final android.content.Intent r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.onActivityResultFragment(int, int, android.content.Intent):void");
    }

    @Override
    public final boolean onBackPressed(boolean z10) {
        org.telegram.ui.Components.p40 p40Var;
        org.telegram.ui.ActionBar.s1 s1Var;
        org.telegram.ui.Components.ve veVar;
        org.telegram.ui.ActionBar.s1 s1Var2;
        org.telegram.ui.Components.te teVar;
        TLRPC.TL_replyKeyboardMarkup tL_replyKeyboardMarkup;
        ll llVar;
        dh.q qVar;
        org.telegram.ui.ActionBar.i5 i5Var;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null && kVar.getOpenMenuOverlay() != null) {
            if (z10 && (i5Var = this.actionBar.f27699a1) != null) {
                i5Var.a(true);
                return false;
            }
        } else {
            org.telegram.ui.Components.n01 n01Var = this.f51407n0;
            if (n01Var != null && n01Var.f36323y > 0.0f) {
                if (z10) {
                    n01Var.c();
                    return false;
                }
            } else {
                org.telegram.ui.Components.ac acVar = org.telegram.ui.Components.ac.f31784w;
                if (acVar != null) {
                    org.telegram.ui.Components.fb fbVar = acVar.f31788e;
                    if (fbVar instanceof org.telegram.ui.Components.lb) {
                        if (z10) {
                            ((org.telegram.ui.Components.lb) fbVar).f();
                            acVar.b();
                            return false;
                        }
                    }
                }
                iz0 iz0Var = this.f51493ta;
                if (iz0Var != null && !iz0Var.f46461c0) {
                    if (z10) {
                        iz0Var.dismiss();
                        return false;
                    }
                } else if (hasShownSheet()) {
                    if (z10) {
                        closeSheet();
                        return false;
                    }
                } else {
                    dh.r rVar = this.f51480sa;
                    if (rVar != null && (qVar = rVar.f9141b) != null && qVar.getReactionsWindow() != null) {
                        if (z10) {
                            rVar.f9141b.e();
                            return false;
                        }
                    } else if (is.p().E) {
                        if (z10) {
                            is.p().n();
                            return false;
                        }
                    } else {
                        hk hkVar = this.Za;
                        if (hkVar != null && hkVar.f33040s) {
                            if (z10) {
                                hkVar.a(true);
                                return false;
                            }
                        } else if (this.f51291dd.f53841f) {
                            if (z10) {
                                oc(false);
                                return false;
                            }
                        } else if (this.f51316f9 != null) {
                            if (z10) {
                                O7(true);
                                return false;
                            }
                        } else if (!l7(z10, false)) {
                            if (y9()) {
                                if (z10 && (llVar = this.r9) != null && llVar.x()) {
                                    this.r9.f(false);
                                    return false;
                                }
                            } else {
                                org.telegram.ui.ActionBar.k kVar2 = this.actionBar;
                                if (kVar2 != null && kVar2.v()) {
                                    if (z10) {
                                        N7(false);
                                        return false;
                                    }
                                } else {
                                    mj mjVar = this.f51237a0;
                                    if (mjVar != null && mjVar.r0() && (mjVar.f31125g2 != 1 || (tL_replyKeyboardMarkup = mjVar.f31169o2) == null || !tL_replyKeyboardMarkup.is_persistent || mjVar.f31164n2 == null)) {
                                        if (z10) {
                                            this.f51237a0.j0(true);
                                            return false;
                                        }
                                    } else {
                                        mj mjVar2 = this.f51237a0;
                                        if (mjVar2 != null && mjVar2.s()) {
                                            if (z10) {
                                                mj mjVar3 = this.f51237a0;
                                                ii.a0 a0Var = mjVar3.m0;
                                                if (a0Var != null) {
                                                    a0Var.setOpened(false);
                                                }
                                                if (!mjVar3.g0() && (teVar = mjVar3.f31162n0) != null) {
                                                    teVar.c();
                                                    return false;
                                                }
                                            }
                                        } else {
                                            mj mjVar4 = this.f51237a0;
                                            if (mjVar4 != null && (veVar = mjVar4.F0) != null && (s1Var2 = veVar.W1) != null && s1Var2.isShowing()) {
                                                if (z10) {
                                                    veVar.W1.dismiss();
                                                    return false;
                                                }
                                            } else if (this.f51325g4 == 6 && (s1Var = lg.v.f18489e) != null && s1Var.isShowing()) {
                                                if (z10) {
                                                    lg.v.f18489e.dismiss();
                                                    return false;
                                                }
                                            } else if (org.telegram.messenger.t3.p0(this.f51292e) && !this.f51349i4 && this.f51323g2 != null && b() != 0) {
                                                if (z10) {
                                                    this.f51323g2.n(0L, this.G7);
                                                    return false;
                                                }
                                            } else if (this.f51325g4 == 5 && !"hello".equalsIgnoreCase(this.f51311f4) && !"away".equalsIgnoreCase(this.f51311f4) && (this.L6.isEmpty() || this.f51475s4 == 0)) {
                                                if (z10) {
                                                    tc();
                                                    return false;
                                                }
                                            } else if (this.f51325g4 == 6 && this.f51237a0.t()) {
                                                if (z10) {
                                                    Zb(new xe(this, 18));
                                                    return false;
                                                }
                                            } else {
                                                org.telegram.ui.ActionBar.k kVar3 = this.actionBar;
                                                if (kVar3 != null && kVar3.f27728o0) {
                                                    if (z10) {
                                                        kVar3.l(true);
                                                        return false;
                                                    }
                                                } else if (this.f51264bd.f53841f) {
                                                    if (z10) {
                                                        Sa();
                                                    }
                                                } else {
                                                    if (z10 && (p40Var = this.f51448q3) != null) {
                                                        p40Var.a(false);
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
        H9();
        if (!getMessagesController().D3() && getMessagesController().f23118s4 <= 0 && getMessagesController().f23033i7 < 2 && !getUserConfig().q() && (arrayList = this.L6) != null) {
            for (int i3 = 0; i3 < arrayList.size(); i3++) {
                org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) arrayList.get(i3);
                if (ziVar != null && !ziVar.Q3() && ((org.telegram.messenger.zi.S4(ziVar.f26868k) || ziVar.i4()) && !ziVar.G4() && (ziVar.f26868k.media_unread || org.telegram.messenger.t3.V(this.f51292e)))) {
                    org.telegram.ui.Components.m11.r(ziVar, false);
                }
            }
        }
        this.U3 = false;
        I9();
        ArrayList arrayList2 = org.telegram.ui.Components.m11.Q;
        if (arrayList2 != null) {
            arrayList2.clear();
        }
        sf.b bVar = this.f51263bc;
        if (bVar != null) {
            bVar.a(false);
            this.f51263bc = null;
        }
        this.T3.e();
        super.onBecomeFullyHidden();
    }

    @Override
    public void onBecomeFullyVisible() {
        this.U3 = true;
        super.onBecomeFullyVisible();
        if (this.Q) {
            showDialog(this.P);
        }
        if (this.Bb) {
            mj mjVar = this.f51237a0;
            if (mjVar != null) {
                mjVar.H0();
                mj mjVar2 = this.f51237a0;
                mjVar2.U0 = false;
                org.telegram.ui.Components.kf kfVar = mjVar2.V0;
                if (kfVar != null) {
                    kfVar.u(false);
                }
            }
            this.Bb = false;
        }
        if (this.K1 != null) {
            org.telegram.messenger.g0.i3(new yd(this, 1), 600L);
        }
        if (this.G4 && !this.H4) {
            this.H4 = true;
            org.telegram.ui.Components.ac I = org.telegram.ui.Components.fc.a0(this).I(2131623992, org.telegram.messenger.bd.M0(2131743607, null), org.telegram.messenger.bd.M0(2131743609, null));
            I.f31792j = 5000;
            I.v = new yd(this, 2);
            I.k(true);
        }
    }

    @Override
    public final void onBeginSlide() {
        super.onBeginSlide();
        dh.r rVar = this.f51480sa;
        if (rVar != null && rVar.d()) {
            this.f51480sa.setHiddenByScroll(true);
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        org.telegram.messenger.zi ziVar;
        long j10;
        long j11;
        qi qiVar = this.f51433p1;
        if (qiVar != null) {
            ViewTreeObserver viewTreeObserver = qiVar.getViewTreeObserver();
            viewTreeObserver.addOnPreDrawListener(new hh(this, viewTreeObserver));
        }
        Dialog dialog = this.visibleDialog;
        if (dialog instanceof DatePickerDialog) {
            dialog.dismiss();
        }
        O7(true);
        if (!org.telegram.messenger.g0.Q1()) {
            if (configuration.orientation == 2) {
                if ((!PhotoViewer.F1() || !PhotoViewer.v1().U1()) && (ziVar = MediaController.B().f21348v0) != null && org.telegram.messenger.zi.M4(ziVar.f26868k)) {
                    PhotoViewer.v1().N2(null, this, this.f51557ya);
                    getFileLoader().d0(ziVar.F0(), false);
                    MediaController.B().q(true, true, false, true);
                    PhotoViewer v12 = PhotoViewer.v1();
                    int i3 = ziVar.D;
                    long j12 = 0;
                    if (i3 != 0) {
                        j10 = this.f51376k6;
                    } else {
                        j10 = 0;
                    }
                    if (i3 != 0) {
                        j11 = this.f51272c7;
                    } else {
                        j11 = 0;
                    }
                    if (i3 != 0) {
                        j12 = b();
                    }
                    if (v12.h2(ziVar, null, null, null, null, null, null, 0, this.f51248ab, null, j10, j11, j12, false, null, null)) {
                        PhotoViewer.v1().f41481m4 = this;
                    }
                    E9(false);
                    MediaController.B().f21351w0 = null;
                }
            } else if (PhotoViewer.F1() && PhotoViewer.v1().f41479m2) {
                PhotoViewer v13 = PhotoViewer.v1();
                if (v13.G2.d0()) {
                    if (v13.f41375a3) {
                        v13.G2.s0(false);
                    }
                    MediaController B = MediaController.B();
                    org.telegram.ui.Components.m51 m51Var = v13.G2;
                    org.telegram.messenger.zi ziVar2 = v13.U4;
                    if (m51Var != null && ziVar2 != null) {
                        int i10 = ziVar2.I1;
                        org.telegram.messenger.w7.G(i10).d0(ziVar2.F0(), true);
                        B.G0 = false;
                        B.r();
                        B.F0 = m51Var;
                        B.f21348v0 = ziVar2;
                        int i11 = B.f21330n0 + 1;
                        B.f21330n0 = i11;
                        m51Var.K = new org.telegram.messenger.fe(B, i11, ziVar2, 1);
                        B.Q0 = false;
                        TextureView textureView = B.H0;
                        if (textureView != null) {
                            m51Var.A0(textureView);
                        }
                        B.j(ziVar2);
                        B.n0();
                        B.f21320h0 = false;
                        org.telegram.messenger.zi ziVar3 = B.f21348v0;
                        B.f21348v0 = ziVar2;
                        if (!org.telegram.messenger.az.k(true)) {
                            B.w0(B.f21341s);
                        }
                        B.v0(B.f21348v0);
                        org.telegram.messenger.hs.f(i10).k(org.telegram.messenger.hs.f23239h2, ziVar2, ziVar3);
                    }
                    v13.G2 = null;
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
        tj tjVar = this.f51455qa;
        float f10 = 0.0f;
        if (z10 && this.la && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (d2Var instanceof wm) {
                this.Q4 = true;
                wm wmVar = (wm) d2Var;
                wmVar.f51416na = this;
                this.fragmentView.setAlpha(0.0f);
                this.m1.setSkipBackgroundDrawing(true);
                this.f51433p1.setTranslationY(org.telegram.messenger.g0.L(8.0f));
                this.f51433p1.getAvatarImageView().setAlpha(0.0f);
                this.f51433p1.getAvatarImageView().setTranslationY(-org.telegram.messenger.g0.L(8.0f));
                this.f51403ma = true;
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(0.0f, 1.0f);
                mj mjVar = this.f51237a0;
                if (mjVar != null) {
                    mjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22608q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                pj pjVar = this.T;
                if (pjVar != null) {
                    pjVar.measure(View.MeasureSpec.makeMeasureSpec(org.telegram.messenger.g0.f22608q.x, 1073741824), View.MeasureSpec.makeMeasureSpec(999999, Integer.MIN_VALUE));
                }
                mj mjVar2 = this.f51237a0;
                if (mjVar2 == null) {
                    measuredHeight = 0;
                } else {
                    measuredHeight = mjVar2.getMeasuredHeight();
                }
                pj pjVar2 = this.T;
                if (pjVar2 == null) {
                    measuredHeight2 = 0;
                } else {
                    measuredHeight2 = pjVar2.getMeasuredHeight();
                }
                int max = Math.max(measuredHeight, measuredHeight2);
                mj mjVar3 = wmVar.f51237a0;
                if (mjVar3 == null) {
                    measuredHeight3 = 0;
                } else {
                    measuredHeight3 = mjVar3.getMeasuredHeight();
                }
                pj pjVar3 = this.T;
                if (pjVar3 == null) {
                    measuredHeight4 = 0;
                } else {
                    measuredHeight4 = pjVar3.getMeasuredHeight();
                }
                this.f51355ia = -(Math.max(measuredHeight3, measuredHeight4) - max);
                ofFloat2.addUpdateListener(new ci.uc(10, this, wmVar));
                Nc();
                AnimatorSet animatorSet = new AnimatorSet();
                this.f51442pa = animatorSet;
                animatorSet.addListener(new gi.z4(this, wmVar, runnable));
                this.f51442pa.setDuration(300L);
                this.f51442pa.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                this.f51442pa.playTogether(ofFloat2);
                org.telegram.messenger.g0.i3(tjVar, 200L);
                return this.f51442pa;
            }
        }
        if (this.Da && getParentLayout() != null && getParentLayout().getFragmentStack().size() > 1) {
            org.telegram.ui.ActionBar.d2 d2Var2 = (org.telegram.ui.ActionBar.d2) getParentLayout().getFragmentStack().get(getParentLayout().getFragmentStack().size() - 2);
            if (d2Var2 instanceof m91) {
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                d2Var2.getFragmentView().getWidth();
                if (!z10) {
                    f10 = 1.0f;
                }
                this.Fa = f10;
                ofFloat.addUpdateListener(new ei(0, this));
                this.Ea = true;
                org.telegram.ui.ActionBar.k kVar = this.actionBar;
                if (kVar != null) {
                    kVar.invalidate();
                }
                kl klVar = this.m1;
                if (klVar != null) {
                    klVar.invalidate();
                }
                AnimatorSet animatorSet2 = new AnimatorSet();
                this.f51442pa = animatorSet2;
                animatorSet2.addListener(new fi(this, z10, runnable));
                this.f51442pa.setDuration(150L);
                this.f51442pa.playTogether(ofFloat);
                if (z10) {
                    org.telegram.messenger.g0.i3(tjVar, 200L);
                } else {
                    this.f51442pa.start();
                }
                return this.f51442pa;
            }
            return null;
        }
        return null;
    }

    @Override
    public final void onDialogDismiss(Dialog dialog) {
        org.telegram.ui.ActionBar.s1 s1Var = this.P;
        if (s1Var != null && dialog == s1Var) {
            getMessagesController().X(0, this.f51376k6, false);
            org.telegram.ui.ActionBar.q4 q4Var = this.parentLayout;
            if (q4Var != null && !q4Var.getFragmentStack().isEmpty() && this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) != this) {
                removeSelfFromStack();
                ((org.telegram.ui.ActionBar.d2) this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1)).finishFragment();
                return;
            }
            finishFragment();
        }
    }

    @Override
    public final boolean onFragmentCreate() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.onFragmentCreate():boolean");
    }

    @Override
    public void onFragmentDestroy() {
        boolean z10;
        org.telegram.ui.Components.os0 os0Var;
        super.onFragmentDestroy();
        kh.e eVar = this.f51269c4;
        if (eVar != null) {
            LongSparseArray longSparseArray = eVar.f17278x;
            int size = longSparseArray.size();
            for (int i3 = 0; i3 < size; i3++) {
                kh.d dVar = (kh.d) longSparseArray.valueAt(i3);
                if (dVar.f17264i) {
                    eVar.f17277w.add(dVar.a());
                }
            }
            if (org.telegram.messenger.r2.f25040a) {
                Log.d("ViewMetrics", "finish");
            }
            longSparseArray.clear();
            eVar.a();
        }
        mj mjVar = this.f51237a0;
        if (mjVar != null) {
            mjVar.A0();
        }
        qi qiVar = this.f51433p1;
        if (qiVar != null && (os0Var = qiVar.f35126d0) != null) {
            os0Var.b(qiVar.H);
        }
        fj fjVar = this.X1;
        if (fjVar != null && fjVar.getAdapter() != null) {
            this.X1.getAdapter().P();
        }
        ei.x2 x2Var = this.Y1;
        if (x2Var != null) {
            x2Var.K();
        }
        is p10 = is.p();
        if (p10.f46396l == this.E9) {
            p10.W = null;
            p10.f46383a0 = null;
            p10.Y = null;
            p10.f46396l = null;
            p10.f46387c0 = null;
            p10.t();
        }
        getNotificationCenter().j(this.Z9);
        org.telegram.messenger.hs.e().j(this.f51247aa);
        getNotificationCenter().j(this.f51261ba);
        getNotificationCenter().j(this.f51275ca);
        I9();
        yd ydVar = this.f51271c6;
        if (ydVar != null) {
            org.telegram.messenger.g0.r(ydVar);
            this.f51271c6 = null;
        }
        org.telegram.messenger.hs notificationCenter = getNotificationCenter();
        ak akVar = this.Ha;
        notificationCenter.getClass();
        boolean z11 = org.telegram.messenger.r2.f25040a;
        if (Thread.currentThread() == org.telegram.messenger.t0.d.getLooper().getThread()) {
            if (notificationCenter.h.remove(akVar)) {
                notificationCenter.o();
            }
            org.telegram.messenger.hp messagesController = getMessagesController();
            long j10 = this.f51376k6;
            if (this.f51325g4 == 1) {
                z10 = true;
            } else {
                z10 = false;
            }
            messagesController.K4(j10, z10, false);
            za.p pVar = this.f51404mb;
            if (pVar != null) {
                pVar.a();
                this.f51404mb = null;
            }
            getNotificationCenter().n(this, org.telegram.messenger.hs.f23305t);
            if (this.f51325g4 == 0 && org.telegram.messenger.g0.Q1()) {
                getNotificationCenter().k(org.telegram.messenger.hs.f23237h0, Long.valueOf(this.f51376k6), Long.valueOf(b()), Boolean.TRUE);
            }
            if (this.f51306f != null) {
                MediaController B = MediaController.B();
                if (B.T1 == null) {
                    B.T1 = new androidx.emoji2.text.j(B);
                }
                B.T1.f1729b = 0;
                org.telegram.messenger.t0.d.postDelayed(B.T1, 5000L);
            }
            org.telegram.messenger.n6 n6Var = this.T3;
            if (n6Var != null) {
                n6Var.e();
            }
            if (this.f51306f != null) {
                getMessagesController().f23106r1.remove(Long.valueOf(this.f51306f.f27150id));
            }
            org.telegram.messenger.g0.B2(getParentActivity(), this.classGuid);
            ei.x2 x2Var2 = this.Y1;
            if (x2Var2 != null) {
                x2Var2.j1();
                this.Y1 = null;
            }
            org.telegram.messenger.g0.Q3(getParentActivity());
            if (org.telegram.messenger.t3.T(this.f51292e)) {
                getMessagesController().V4(this.f51292e, this.classGuid, true, null);
                TLRPC.ChatFull chatFull = this.f51453q8;
                if (chatFull != null && chatFull.linked_chat_id != 0) {
                    getMessagesController().V4(getMessagesController().M0(Long.valueOf(this.f51453q8.linked_chat_id)), this.classGuid, true, null);
                }
            }
            ll llVar = this.r9;
            if (llVar != null) {
                llVar.f(false);
            }
            yi yiVar = this.B0;
            if (yiVar != null) {
                yiVar.N();
            }
            uj ujVar = this.Qa;
            if (ujVar != null) {
                ujVar.b();
            }
            this.f51517va = null;
            org.telegram.ui.ActionBar.q4 parentLayout = getParentLayout();
            if (parentLayout != null && parentLayout.getFragmentStack() != null) {
                int indexOf = parentLayout.getFragmentStack().indexOf(this) - (!f51234qd ? 1 : 0);
                org.telegram.ui.ActionBar.q4 parentLayout2 = getParentLayout();
                if (parentLayout2 != null && parentLayout2.getPulledDialogs() != null) {
                    int i10 = 0;
                    while (i10 < parentLayout2.getPulledDialogs().size()) {
                        if (((org.telegram.ui.Components.a9) parentLayout2.getPulledDialogs().get(i10)).f31768b > indexOf) {
                            parentLayout2.getPulledDialogs().remove(i10);
                            i10--;
                        }
                        i10++;
                    }
                }
            }
            f51234qd = false;
            sf.b bVar = this.f51263bc;
            if (bVar != null) {
                bVar.a(false);
                this.f51263bc = null;
            }
            org.telegram.messenger.i3 i3Var = this.Aa;
            wm wmVar = i3Var.f23429a;
            ArrayList arrayList = i3Var.f23433f;
            ArrayList arrayList2 = i3Var.f23432e;
            for (int i11 = 0; i11 < arrayList2.size(); i11++) {
                wmVar.getConnectionsManager().cancelRequest(((Integer) arrayList2.get(i11)).intValue(), false);
            }
            arrayList2.clear();
            for (int i12 = 0; i12 < arrayList.size(); i12++) {
                wmVar.getConnectionsManager().cancelRequest(((Integer) arrayList.get(i12)).intValue(), false);
            }
            arrayList.clear();
            pw0 pw0Var = this.f51491t8;
            if (pw0Var != null) {
                pw0Var.b(true);
                this.f51491t8 = null;
            }
            ci.q6 q6Var = this.Uc;
            if (q6Var != null) {
                q6Var.setMessageCell(null);
                org.telegram.messenger.g0.E2(this.Uc);
                this.Uc = null;
                return;
            }
            return;
        }
        throw new RuntimeException("removePostponeNotificationsCallback allowed only from MAIN thread");
    }

    @Override
    public final void onPause() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.onPause():void");
    }

    @Override
    public final void onRemoveFromParent() {
        this.Lb = true;
        org.telegram.messenger.zi ziVar = MediaController.B().f21348v0;
        if (ziVar != null && org.telegram.messenger.zi.M4(ziVar.f26868k)) {
            MediaController.B().q(true, true, false, false);
        } else {
            MediaController.B().p0(this.L8, null, null, false);
        }
        ci.q6 q6Var = this.Uc;
        if (q6Var != null) {
            q6Var.setMessageCell(null);
            org.telegram.messenger.g0.E2(this.Uc);
            this.Uc = null;
        }
        super.onRemoveFromParent();
    }

    @Override
    public final void onRequestPermissionsResultFragment(int i3, String[] strArr, int[] iArr) {
        ei.x2 x2Var;
        ei.x2 x2Var2;
        boolean z10;
        boolean z11;
        org.telegram.ui.Components.bi biVar;
        mj mjVar = this.f51237a0;
        boolean z12 = false;
        if (mjVar != null && i3 == 2 && mjVar.f31148k3 != null) {
            if (iArr.length > 0 && iArr[0] == 0) {
                org.telegram.messenger.yy.C(mjVar.R).o0(mjVar.f31143j3, mjVar.f31148k3);
            }
            mjVar.f31148k3 = null;
            mjVar.f31143j3 = null;
        }
        fj fjVar = this.X1;
        if (fjVar != null && fjVar.getAdapter() != null) {
            kg.e1 adapter = this.X1.getAdapter();
            if (i3 == 2) {
                TLRPC.User user = adapter.f17020x0;
                if (user != null && user.bot_inline_geo) {
                    if (iArr.length > 0 && iArr[0] == 0) {
                        adapter.J0.q();
                    } else {
                        adapter.Q();
                    }
                }
            } else {
                adapter.getClass();
            }
        }
        if (i3 == 4) {
            ei.x2 x2Var3 = this.Y1;
            if (x2Var3 != null) {
                x2Var3.f32215b2.b0();
            }
            org.telegram.ui.Components.vo voVar = this.f51517va;
            if (voVar != null && (biVar = voVar.P1) != null) {
                biVar.f32215b2.b0();
            }
        } else if ((i3 == 5 || i3 == 30) && (x2Var = this.Y1) != null) {
            if (i3 == 5 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
                x2Var.q1();
            }
        } else if ((i3 == 17 || i3 == 18) && (x2Var2 = this.Y1) != null) {
            ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = x2Var2.f32215b2;
            if (iArr.length > 0 && iArr[0] == 0) {
                z12 = true;
            }
            chatAttachAlertPhotoLayout.W(z12);
            this.Y1.f32215b2.b0();
        } else if (i3 == 21) {
            if (getParentActivity() != null && iArr != null && iArr.length != 0 && iArr[0] != 0) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f51557ya);
                String M0 = org.telegram.messenger.bd.M0(2131689472, null);
                org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                s1Var.S = M0;
                s1Var.U = org.telegram.messenger.bd.M0(2131747320, null);
                alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131747308, null), new zg(this));
                alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), null);
                alertDialog$Builder.p();
            }
        } else if (i3 == 19 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Za(0);
        } else if (i3 == 20 && iArr != null && iArr.length > 0 && iArr[0] == 0) {
            Za(2);
        } else if (((i3 != 101 && i3 != 102) || this.f51306f == null) && (i3 != 103 || this.f51292e == null)) {
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
                if (i3 == 103) {
                    org.telegram.ui.Components.voip.n1.l(this.f51292e, null, this.f51440p8, null, getParentActivity(), this, getAccountInstance());
                    return;
                }
                TLRPC.User user2 = this.f51306f;
                if (i3 == 102) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                TLRPC.UserFull userFull = this.f51466r8;
                if (userFull != null && userFull.video_calls_available) {
                    z12 = true;
                }
                org.telegram.ui.Components.voip.n1.m(user2, z11, z12, getParentActivity(), getMessagesController().b2(this.f51306f.f27150id), getAccountInstance());
                return;
            }
            org.telegram.ui.Components.voip.n1.h(getParentActivity(), null, i3);
        }
    }

    @Override
    public final void onResume() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.onResume():void");
    }

    @Override
    public final void onThemeColorsChanged() {
        int i3;
        int themedColor;
        int themedColor2;
        int themedColor3;
        int themedColor4;
        int i10;
        try {
            super.onThemeColorsChanged();
            si.f fVar = this.J;
            if (fVar != null) {
                Iterator it = fVar.f54760w.iterator();
                while (it.hasNext()) {
                    gh.e eVar = ((gh.g) it.next()).f12330g0;
                    if (eVar != null) {
                        eVar.h = true;
                    }
                }
            }
            si.f fVar2 = this.K;
            if (fVar2 != null) {
                Iterator it2 = fVar2.f54760w.iterator();
                while (it2.hasNext()) {
                    gh.e eVar2 = ((gh.g) it2.next()).f12330g0;
                    if (eVar2 != null) {
                        eVar2.h = true;
                    }
                }
            }
            Paint paint = this.V8;
            if (paint != null) {
                paint.setColor(getThemedColor(org.telegram.ui.ActionBar.k6.f28160s8));
            }
            RadialProgressView radialProgressView = this.f51471s0;
            if (radialProgressView != null) {
                if (Q9()) {
                    i10 = org.telegram.ui.ActionBar.k6.Ka;
                } else {
                    i10 = org.telegram.ui.ActionBar.k6.Wc;
                }
                radialProgressView.setProgressColor(getThemedColor(i10));
            }
            qj qjVar = this.f51279d1;
            if (qjVar != null) {
                qjVar.setAccentColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ci));
            }
            org.telegram.ui.ActionBar.k2 k2Var = this.I0;
            if (k2Var != null && k2Var.getBackground() != null && ((themedColor4 = getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.L0 || this.Ab != org.telegram.ui.ActionBar.k6.I.q())) {
                this.L0 = themedColor4;
                this.Ab = org.telegram.ui.ActionBar.k6.I.q();
                Drawable background = this.I0.getBackground();
                org.telegram.ui.ActionBar.k6.H1(background, themedColor4, false);
                org.telegram.ui.ActionBar.k6.H1(background, org.telegram.ui.ActionBar.y5.b(themedColor4), true);
            }
            Bb();
        } catch (Exception e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        Set<org.telegram.ui.ActionBar.o0> set = this.V0;
        Set<org.telegram.ui.ActionBar.o0> set2 = this.U0;
        try {
            RadialProgressView radialProgressView2 = this.J0;
            if (radialProgressView2 != null) {
                radialProgressView2.setProgressColor(getThemedColor(this.K0));
            }
            NumberTextView numberTextView = this.U2;
            if (numberTextView != null) {
                numberTextView.setTextColor(getThemedColor(org.telegram.ui.ActionBar.k6.Te));
            }
            RadialProgressView radialProgressView3 = this.Z2;
            if (radialProgressView3 != null) {
                radialProgressView3.setProgressColor(getThemedColor(org.telegram.ui.ActionBar.k6.Se));
            }
            org.telegram.ui.Components.s70 s70Var = this.f51348i2;
            if (s70Var != null && this.S0) {
                s70Var.setEmojiColor(getThemedColor(org.telegram.ui.ActionBar.k6.Ue));
            }
            if (this.P0 != null && (themedColor3 = getThemedColor(org.telegram.ui.ActionBar.k6.f28273y6)) != this.M0) {
                this.M0 = themedColor3;
                this.P0.setColorFilter(new PorterDuffColorFilter(themedColor3, PorterDuff.Mode.MULTIPLY));
            }
            if (this.Q0 != null && (themedColor2 = getThemedColor(org.telegram.ui.ActionBar.k6.Ci)) != this.N0) {
                this.N0 = themedColor2;
                this.Q0.setTint(themedColor2);
            }
            if (this.R0 != null && (themedColor = getThemedColor(org.telegram.ui.ActionBar.k6.H6)) != this.O0) {
                this.O0 = themedColor;
                this.R0.setColorFilter(new PorterDuffColorFilter(themedColor, PorterDuff.Mode.SRC_IN));
            }
            th.b bVar = this.f51345hd;
            if (bVar != null && (i3 = this.T0) >= 0) {
                bVar.setColor(getThemedColor(i3));
            }
            if (!set2.isEmpty()) {
                int themedColor5 = getThemedColor(org.telegram.ui.ActionBar.k6.f28102p7);
                for (org.telegram.ui.ActionBar.o0 o0Var : set2) {
                    if (o0Var != null) {
                        o0Var.a(themedColor5, themedColor5);
                    }
                }
            }
            if (!set.isEmpty()) {
                int x02 = org.telegram.ui.ActionBar.k6.x0(null, org.telegram.ui.ActionBar.k6.f28102p7, false);
                for (org.telegram.ui.ActionBar.o0 o0Var2 : set) {
                    if (o0Var2 != null) {
                        o0Var2.a(x02, x02);
                    }
                }
            }
        } catch (Exception e11) {
            org.telegram.messenger.a8.g(e11, true);
        }
    }

    @Override
    public void onTransitionAnimationEnd(boolean r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.onTransitionAnimationEnd(boolean, boolean):void");
    }

    @Override
    public void onTransitionAnimationStart(boolean z10, boolean z11) {
        int[] iArr;
        org.telegram.ui.Components.yc ycVar;
        super.onTransitionAnimationStart(z10, z11);
        System.currentTimeMillis();
        int i3 = org.telegram.messenger.hs.K2;
        int i10 = org.telegram.messenger.hs.G0;
        int i11 = org.telegram.messenger.hs.f23305t;
        int i12 = org.telegram.messenger.hs.f23298s;
        if (z10) {
            if (!this.f51313f6) {
                this.f51313f6 = true;
                Yc();
            }
            iArr = this.Z9 == 0 ? new int[]{i12, i11, i10, i3, org.telegram.messenger.hs.D} : new int[]{i12, i11, i10, i3};
            this.f51299e6 = false;
            if (!z11) {
                this.f51327g6 = SystemClock.elapsedRealtime();
            }
        } else {
            iArr = org.telegram.messenger.l10.B(this.f51306f) ? new int[]{i12, i11, i10, i3, org.telegram.messenger.hs.V} : null;
            mj mjVar = this.f51237a0;
            if (mjVar != null && (ycVar = mjVar.T1) != null) {
                org.telegram.messenger.g0.r(ycVar);
                mjVar.T1 = null;
            }
        }
        r7();
        this.Z9 = getNotificationCenter().q(iArr, this.Z9, true);
    }

    @Override
    public final void p(ArrayList arrayList, boolean z10, int i3, long j10) {
        B8(((org.telegram.messenger.xy) arrayList.get(0)).d, ((org.telegram.messenger.xy) arrayList.get(0)).f26481i);
        org.telegram.messenger.yy.X(getAccountInstance(), arrayList, this.f51376k6, this.E5, this.f51397m4, null, this.C5, true, false, this.G5, null, z10, i3, 0, ((org.telegram.messenger.xy) arrayList.get(0)).f26492t, null, W8(), 0L, false, j10, h9(), this.f51540x5, null, false);
        K6();
        if (i3 != 0) {
            if (this.f51338h4 == -1) {
                this.f51338h4 = 0;
            }
            this.f51338h4 = arrayList.size() + this.f51338h4;
            id(true);
        }
    }

    public final void p7(org.telegram.messenger.zi ziVar) {
        if (ziVar.D == 4 && !this.G8) {
            int i3 = org.telegram.messenger.az.f21612a;
            if (!org.telegram.messenger.hp.e1().contains("mapPreviewType")) {
                this.G8 = true;
                org.telegram.ui.Components.t4.r0(getParentActivity(), this.currentAccount, new yd(this, 12), true, this.f51557ya);
            }
        }
    }

    public final void p8(int r22, java.lang.Object... r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.p8(int, java.lang.Object[]):void");
    }

    public final long p9() {
        return this.f51475s4;
    }

    public final boolean pa() {
        mj mjVar = this.f51237a0;
        boolean z10 = mjVar.A2;
        if (z10) {
            mjVar.r1();
            this.S3 = true;
        }
        org.telegram.messenger.g0.l3(getParentActivity(), this.classGuid);
        this.fragmentView.requestLayout();
        return z10;
    }

    public final void pb() {
        org.telegram.ui.Cells.q1 q1Var = null;
        int i3 = 0;
        for (int i10 = 0; i10 < this.A0.getChildCount(); i10++) {
            View childAt = this.A0.getChildAt(i10);
            if (childAt instanceof org.telegram.ui.Cells.q1) {
                org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) childAt;
                int min = Math.min(q1Var2.getBottom(), this.A0.getHeight()) - Math.max(0, q1Var2.getTop());
                if (min > i3) {
                    q1Var = q1Var2;
                    i3 = min;
                }
            }
        }
        if (q1Var != null) {
            zi ziVar = this.C0;
            this.A0.getClass();
            ziVar.i1(RecyclerView.R(q1Var), q1Var.getTop() - ((int) this.M9), false);
        }
    }

    public final void pc(TLRPC.TL_game tL_game, org.telegram.messenger.zi ziVar, String str, boolean z10, long j10) {
        String str2;
        TLRPC.User a22 = getMessagesController().a2(Long.valueOf(j10));
        String str3 = "";
        if (z10) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), this.f51557ya);
            String M0 = org.telegram.messenger.bd.M0(2131689472, null);
            org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
            s1Var.S = M0;
            if (a22 != null) {
                str3 = org.telegram.messenger.g5.m(0, a22.first_name, a22.last_name);
            }
            s1Var.U = org.telegram.messenger.bd.a0(null, null, 2131753015, str3);
            alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131747839, null), new ci.x3(this, tL_game, ziVar, str, j10));
            alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
            showDialog(s1Var);
            return;
        }
        String n4 = org.telegram.messenger.l10.n(a22);
        if (!org.telegram.messenger.g0.Q1()) {
            String str4 = Build.MANUFACTURER;
            String str5 = Build.MODEL;
            if (!"samsung".equals(str4) || !"GT-I9500".equals(str5)) {
                if (this.parentLayout.getFragmentStack().get(this.parentLayout.getFragmentStack().size() - 1) == this) {
                    if (a22 == null || TextUtils.isEmpty(n4)) {
                        str2 = "";
                    } else {
                        str2 = n4;
                    }
                    presentFragment(new uc1(str, str2, tL_game.title, tL_game.short_name, ziVar));
                    return;
                }
                return;
            }
        }
        Activity parentActivity = getParentActivity();
        String str6 = tL_game.short_name;
        if (a22 != null && n4 != null) {
            str3 = n4;
        }
        uc1.a0(str, ziVar, parentActivity, str6, str3);
    }

    public final void pd() {
        boolean z10;
        int i3;
        int i10;
        org.telegram.messenger.ri riVar;
        int i11 = (a() > getUserConfig().e() ? 1 : (a() == getUserConfig().e() ? 0 : -1));
        SparseArray[] sparseArrayArr = this.f51412n6;
        if (i11 == 0) {
            ArrayList<org.telegram.messenger.zi> arrayList = new ArrayList<>();
            for (int i12 = 0; i12 < sparseArrayArr.length; i12++) {
                for (int i13 = 0; i13 < sparseArrayArr[i12].size(); i13++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[i12].valueAt(i13);
                    if (ziVar.A2()) {
                        org.telegram.messenger.ui s92 = s9(ziVar);
                        if (s92 != null) {
                            riVar = s92.d(ziVar);
                        } else {
                            riVar = null;
                        }
                        if (riVar != null) {
                            if (!riVar.h) {
                            }
                        }
                    }
                    arrayList.add(ziVar);
                }
            }
            dk dkVar = this.f51558yb;
            if (dkVar != null) {
                dkVar.setSelectedReactionsInclusive(arrayList);
                boolean isEmpty = this.f51558yb.getSelectedReactions().isEmpty();
                z10 = !isEmpty;
                dk dkVar2 = this.f51558yb;
                if (isEmpty) {
                    i10 = 2131745882;
                } else {
                    i10 = 2131745881;
                }
                dkVar2.setHint(org.telegram.messenger.bd.M0(i10, null));
                org.telegram.messenger.g0.i3(new yd(this, 14), 120L);
            } else {
                z10 = !org.telegram.ui.Components.li0.i(arrayList).isEmpty();
            }
            org.telegram.ui.ActionBar.q0 j10 = this.actionBar.n(null).j(28);
            if (j10 != null) {
                if (z10) {
                    i3 = 2131231898;
                } else {
                    i3 = 2131231900;
                }
                org.telegram.ui.Components.fh0 fh0Var = j10.f28471y;
                if (fh0Var != null && j10.E != i3) {
                    j10.E = i3;
                    org.telegram.messenger.g0.R3(fh0Var, i3);
                }
            }
        }
        if (this.f51480sa != null) {
            ArrayList arrayList2 = new ArrayList();
            SparseArray sparseArray = sparseArrayArr[0];
            for (int i14 = 0; i14 < sparseArray.size(); i14++) {
                arrayList2.add((org.telegram.messenger.zi) sparseArray.valueAt(i14));
            }
            SparseArray sparseArray2 = sparseArrayArr[1];
            for (int i15 = 0; i15 < sparseArray2.size(); i15++) {
                arrayList2.add((org.telegram.messenger.zi) sparseArray2.valueAt(i15));
            }
            this.f51480sa.setSelectedMessages(arrayList2);
        }
    }

    @Override
    public final boolean q() {
        return this.L9;
    }

    public final void q7(boolean r11) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.q7(boolean):void");
    }

    public final void q8(int r31, java.lang.Object... r32) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.q8(int, java.lang.Object[]):void");
    }

    public final float q9(float f10) {
        wm wmVar = this.xa;
        if (wmVar == null) {
            wmVar = this;
        }
        org.telegram.ui.Components.jg jgVar = wmVar.f51252b1;
        if (jgVar == null) {
            return 0.0f;
        }
        return jgVar.c(f10);
    }

    public final void qb(org.telegram.messenger.zi r9) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.qb(org.telegram.messenger.zi):void");
    }

    public final void qc(boolean z10) {
        if (z10) {
            if (this.f51290dc == null) {
                yd ydVar = new yd(this, 13);
                this.f51290dc = ydVar;
                org.telegram.messenger.g0.i3(ydVar, 100L);
                return;
            }
            return;
        }
        yd ydVar2 = this.f51290dc;
        if (ydVar2 != null) {
            org.telegram.messenger.g0.r(ydVar2);
        }
        this.f51290dc = null;
        this.cc = false;
        bd(true);
    }

    public final void qd() {
        mh.h hVar;
        org.telegram.ui.ActionBar.w wVar;
        mj mjVar = this.f51237a0;
        if (mjVar != null) {
            if (this.f51325g4 != 1 && !this.f51511v4 && !aa()) {
                hVar = null;
            } else {
                hVar = this.f51549y1;
            }
            mjVar.setSideButtonsForAttach(hVar);
            boolean aa2 = aa();
            if (this.f51518vb != aa2) {
                this.f51518vb = aa2;
                org.telegram.ui.ActionBar.q0 q0Var = this.f51359j0;
                if ((q0Var != null && q0Var.getVisibility() == 0) || ((wVar = this.f51321g0) != null && wVar.f28758l == 0)) {
                    org.telegram.ui.ActionBar.k kVar = this.actionBar;
                    if (!kVar.f27728o0 && !kVar.v()) {
                        if (this.f51237a0.h0() && TextUtils.isEmpty(this.f51237a0.getSlowModeTimer()) && !aa()) {
                            org.telegram.ui.ActionBar.w wVar2 = this.f51321g0;
                            if (wVar2 != null) {
                                wVar2.e(0);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var2 = this.f51359j0;
                            if (q0Var2 != null) {
                                q0Var2.setVisibility(8);
                            }
                            ar arVar = this.f51307f0;
                            if (arVar != null) {
                                arVar.b(true);
                            }
                        } else {
                            org.telegram.ui.ActionBar.w wVar3 = this.f51321g0;
                            if (wVar3 != null) {
                                wVar3.e(8);
                            }
                            org.telegram.ui.ActionBar.q0 q0Var3 = this.f51359j0;
                            if (q0Var3 != null) {
                                q0Var3.setVisibility(0);
                            }
                            ar arVar2 = this.f51307f0;
                            if (arVar2 != null) {
                                arVar2.b(false);
                            }
                        }
                        qi qiVar = this.f51433p1;
                        if (qiVar != null) {
                            qiVar.f35136l0 = false;
                        }
                    }
                }
            }
        }
    }

    @Override
    public final org.telegram.ui.Components.jn r() {
        return this.f51433p1;
    }

    public final void r7() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.r7():void");
    }

    public final void r8(java.lang.Object... r82) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.r8(java.lang.Object[]):void");
    }

    public final float r9(org.telegram.ui.Components.c11 c11Var) {
        float f10;
        org.telegram.ui.Components.g11 g11Var = this.f51323g2;
        if (g11Var != null) {
            float L = org.telegram.messenger.g0.L(7.0f);
            float k10 = g11Var.k(c11Var);
            if (c11Var == org.telegram.ui.Components.c11.f32502b) {
                f10 = 64.0f;
            } else {
                f10 = 36.0f;
            }
            return (org.telegram.messenger.g0.L(f10) + L) * k10;
        }
        return 0.0f;
    }

    public final void rb(long j10) {
        zi ziVar;
        org.telegram.messenger.zi messageObject;
        int f92;
        int abs;
        int i3 = -1;
        if (this.A0 != null && (ziVar = this.C0) != null && ziVar.f55518y < 0) {
            int i10 = 0;
            if (this.V6[0] && ziVar.L0() == 0) {
                this.E7 = -1;
                return;
            }
            int i11 = Integer.MAX_VALUE;
            for (int childCount = this.A0.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                if (RecyclerView.R(childAt) >= 0 && (childAt instanceof org.telegram.ui.Cells.q1) && (messageObject = ((org.telegram.ui.Cells.q1) childAt).getMessageObject()) != null && messageObject.Z1() == j10 && (abs = Math.abs((f92 = f9(childAt)))) < i11) {
                    i3 = messageObject.f1();
                    i10 = f92;
                    i11 = abs;
                }
            }
            this.E7 = i3;
            this.F7 = i10;
            return;
        }
        this.E7 = -1;
    }

    public final void rc(boolean z10) {
        float f10;
        int i3;
        int i10;
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - ConnectionsManager.lastPremiumFloodWaitShown >= org.telegram.messenger.hp.s1(this.currentAccount).E5 * 1000) {
            ConnectionsManager.lastPremiumFloodWaitShown = currentTimeMillis;
            if (!org.telegram.messenger.h10.i(this.currentAccount).q() && !org.telegram.messenger.hp.s1(this.currentAccount).D3()) {
                if (z10) {
                    f10 = org.telegram.messenger.hp.s1(this.currentAccount).C5;
                } else {
                    f10 = org.telegram.messenger.hp.s1(this.currentAccount).D5;
                }
                SpannableString spannableString = new SpannableString(Double.toString(Math.round(f10 * 10.0f) / 10.0d).replaceAll("\\.0$", ""));
                spannableString.setSpan(new org.telegram.ui.Components.o31(org.telegram.messenger.g0.o()), 0, spannableString.length(), 33);
                if (!hasStoryViewer()) {
                    org.telegram.ui.Components.fc a02 = org.telegram.ui.Components.fc.a0(this);
                    if (z10) {
                        i3 = 2131743812;
                    } else {
                        i3 = 2131751349;
                    }
                    String M0 = org.telegram.messenger.bd.M0(i3, null);
                    if (z10) {
                        i10 = 2131743811;
                    } else {
                        i10 = 2131751348;
                    }
                    org.telegram.ui.Components.ac I = a02.I(2131624210, M0, org.telegram.messenger.g0.K2(org.telegram.messenger.g0.x2(org.telegram.messenger.bd.M0(i10, null), new re(this, z10, 0)), spannableString, "%d"));
                    I.f31792j = 8000;
                    I.k(true);
                }
            }
        }
    }

    public final void rd(boolean z10, boolean z11) {
        boolean z12;
        org.telegram.messenger.zi ziVar;
        org.telegram.ui.Wallet.z3 z3Var;
        if (this.fragmentView != null && !this.H5) {
            int childCount = this.A0.getChildCount();
            int i3 = 0;
            while (true) {
                if (i3 < childCount) {
                    View childAt = this.A0.getChildAt(i3);
                    if (childAt instanceof org.telegram.ui.Cells.t0) {
                        org.telegram.ui.Cells.t0 t0Var = (org.telegram.ui.Cells.t0) childAt;
                        org.telegram.messenger.zi messageObject = t0Var.getMessageObject();
                        if (this.f51273c8 != Integer.MAX_VALUE && messageObject != null && messageObject.f1() == this.f51273c8 && t0Var.S()) {
                            org.telegram.ui.Wallet.b4 b4Var = t0Var.J0;
                            if (!b4Var.f42245h0 && (b4Var.f42240e0 == 0 || (z3Var = b4Var.f42238d0) == null || z3Var.c())) {
                                b4Var.e();
                                org.telegram.ui.Wallet.z3 z3Var2 = b4Var.f42238d0;
                                z3Var2.getClass();
                                z3Var2.v = Math.max(0L, 600L);
                                org.telegram.ui.Wallet.z3 z3Var3 = b4Var.f42238d0;
                                z3Var3.f39925b = -1L;
                                z3Var3.f39926c = -1L;
                                b4Var.f42240e0 = SystemClock.elapsedRealtime();
                                b4Var.f42242f0 = false;
                                b4Var.f42232a.invalidate();
                            }
                        }
                    }
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        org.telegram.messenger.zi messageObject2 = q1Var.getMessageObject();
                        if (this.I8 != null && ((messageObject2.i4() || org.telegram.messenger.zi.M4(messageObject2.f26868k)) && !messageObject2.U4() && MediaController.B().I(messageObject2))) {
                            ImageReceiver photoImage = q1Var.getPhotoImage();
                            this.I8.setTranslationX(q1Var.getX() + photoImage.L0);
                            this.I8.setTranslationY((this.A0.getY() + ((q1Var.getY() + q1Var.getPaddingTop()) + photoImage.M0)) - this.I8.getTop());
                            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.I8.getLayoutParams();
                            if (messageObject2.i4()) {
                                this.I8.setTag(2131296591, null);
                                if (layoutParams.width != org.telegram.messenger.g0.g3(Z9(), Q9()) || layoutParams.height != org.telegram.messenger.g0.g3(Z9(), Q9())) {
                                    int g32 = org.telegram.messenger.g0.g3(Z9(), Q9());
                                    layoutParams.height = g32;
                                    layoutParams.width = g32;
                                    this.K8.setResizeMode(0);
                                    this.I8.setLayoutParams(layoutParams);
                                }
                                float g33 = ((org.telegram.messenger.g0.f22614x * 2) + org.telegram.messenger.g0.g3(Z9(), Q9())) / org.telegram.messenger.g0.g3(Z9(), Q9());
                                float g34 = q1Var.getPhotoImage().N0 / org.telegram.messenger.g0.g3(Z9(), Q9());
                                if (this.I8.getScaleX() != g34) {
                                    this.I8.invalidate();
                                    this.fragmentView.invalidate();
                                }
                                this.I8.setPivotX(0.0f);
                                this.I8.setPivotY(0.0f);
                                this.I8.setScaleX(g34);
                                this.I8.setScaleY(g34);
                                this.L8.setScaleX(g33);
                                this.L8.setScaleY(g33);
                            } else {
                                this.I8.setTag(2131296591, photoImage);
                                if (layoutParams.width != photoImage.N0 || layoutParams.height != photoImage.O0) {
                                    this.K8.setResizeMode(3);
                                    layoutParams.width = (int) photoImage.N0;
                                    layoutParams.height = (int) photoImage.O0;
                                    this.I8.setLayoutParams(layoutParams);
                                }
                                this.L8.setScaleX(1.0f);
                                this.L8.setScaleY(1.0f);
                            }
                            this.fragmentView.invalidate();
                            this.I8.invalidate();
                            z12 = true;
                        }
                    }
                    i3++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (z10 && this.I8 != null && (ziVar = MediaController.B().f21348v0) != null && ziVar.T == 0) {
                if (!z12) {
                    if (this.B3 && org.telegram.messenger.zi.M4(ziVar.f26868k)) {
                        MediaController.B().q(true, true, false, false);
                        return;
                    }
                    this.I8.setTranslationY((-org.telegram.messenger.g0.g3(Z9(), Q9())) - 100);
                    this.fragmentView.invalidate();
                    if (ziVar.i4() || org.telegram.messenger.zi.M4(ziVar.f26868k)) {
                        if (!this.B3 && PipRoundVideoView.G == null) {
                            if (z11) {
                                l(ziVar.f1(), 0, false, 0, true, 0);
                            }
                        } else {
                            MediaController.B().k0(false);
                        }
                    }
                } else {
                    MediaController.B().k0(true);
                    if (!ziVar.i4() && !this.M8) {
                        this.A0.invalidate();
                    }
                }
            }
        }
    }

    @Override
    public final void restoreSelfArgs(Bundle bundle) {
        this.f51401m8 = bundle.getString("path");
    }

    @Override
    public final void s() {
        if (!this.f51525w4) {
            if (this.f51306f != null) {
                TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f51306f.f27150id));
                if (a22 != null) {
                    this.f51306f = a22;
                } else {
                    return;
                }
            } else if (this.f51292e != null) {
                TLRPC.Chat M0 = getMessagesController().M0(Long.valueOf(this.f51292e.f27001id));
                if (M0 != null) {
                    this.f51292e = M0;
                } else {
                    return;
                }
            }
            qi qiVar = this.f51433p1;
            if (qiVar != null) {
                qiVar.b();
            }
        }
    }

    public final boolean s7(View view) {
        CharSequence slowModeTimer = this.f51237a0.getSlowModeTimer();
        if (slowModeTimer != null) {
            vc(view, slowModeTimer, true);
            return true;
        }
        return false;
    }

    public final void s8(int i3, ArrayList arrayList, boolean z10) {
        ArrayList arrayList2;
        wm wmVar;
        int i10;
        wm wmVar2 = this;
        ArrayList arrayList3 = arrayList;
        if (!arrayList3.isEmpty() && wmVar2.t7()) {
            boolean z11 = false;
            int i11 = 0;
            while (true) {
                if (i11 < arrayList3.size()) {
                    org.telegram.messenger.xy xyVar = (org.telegram.messenger.xy) arrayList3.get(i11);
                    if (xyVar.f26485m == null && xyVar.f26483k == null) {
                        break;
                    }
                    i11++;
                } else if (!TextUtils.isEmpty(((org.telegram.messenger.xy) arrayList3.get(0)).d)) {
                    org.telegram.messenger.wy b10 = org.telegram.messenger.wy.b(((org.telegram.messenger.xy) arrayList3.get(0)).d, wmVar2.f51376k6, wmVar2.E5, wmVar2.f51397m4, null, false, ((org.telegram.messenger.xy) arrayList3.get(0)).f26481i, null, null, z10, i3, 0, null, false);
                    b10.K = wmVar2.W8();
                    org.telegram.messenger.yy.C(wmVar2.currentAccount).r0(b10);
                }
            }
            int i12 = 0;
            while (i12 < arrayList3.size()) {
                org.telegram.messenger.xy xyVar2 = (org.telegram.messenger.xy) arrayList3.get(i12);
                if (xyVar2.f26485m != null && xyVar2.f26483k == null) {
                    org.telegram.messenger.c accountInstance = wmVar2.getAccountInstance();
                    TLRPC.BotInlineResult botInlineResult = xyVar2.f26485m;
                    HashMap hashMap = xyVar2.f26486n;
                    int i13 = i12;
                    org.telegram.messenger.yy.S(i3, wmVar2.f51376k6, 0L, wmVar2.h9(), hashMap, accountInstance, wmVar2.E5, wmVar2.f51397m4, wmVar2.W8(), botInlineResult, null, wmVar2, wmVar2.C5, z10);
                    arrayList2 = arrayList;
                    wmVar = wmVar2;
                    arrayList2.remove(i13);
                    i10 = i13 - 1;
                } else {
                    arrayList2 = arrayList3;
                    wmVar = wmVar2;
                    i10 = i12;
                }
                i12 = i10 + 1;
                wmVar2 = wmVar;
                arrayList3 = arrayList2;
                z11 = false;
            }
            ArrayList arrayList4 = arrayList3;
            wm wmVar3 = wmVar2;
            if (!arrayList4.isEmpty()) {
                wmVar3.B8(((org.telegram.messenger.xy) arrayList4.get(0)).d, ((org.telegram.messenger.xy) arrayList4.get(0)).f26481i);
                org.telegram.messenger.yy.X(wmVar3.getAccountInstance(), arrayList4, wmVar3.f51376k6, wmVar3.E5, wmVar3.f51397m4, null, wmVar3.C5, false, true, wmVar3.G5, null, z10, i3, 0, ((org.telegram.messenger.xy) arrayList4.get(0)).f26492t, null, wmVar3.W8(), 0L, false, 0L, wmVar3.h9(), wmVar3.f51540x5, null, false);
                K6();
                if (i3 != 0) {
                    if (this.f51338h4 == -1) {
                        this.f51338h4 = 0;
                    }
                    this.f51338h4 = arrayList.size() + this.f51338h4;
                    id(true);
                }
            }
        }
    }

    public final org.telegram.messenger.ui s9(org.telegram.messenger.zi ziVar) {
        if (ziVar.d1() == 0) {
            return null;
        }
        org.telegram.messenger.ui uiVar = (org.telegram.messenger.ui) this.O6.f(ziVar.d1());
        if (uiVar != null && (uiVar.d.size() <= 1 || uiVar.d(ziVar) == null)) {
            return null;
        }
        return uiVar;
    }

    public final void sa() {
        X6(5, this.f51294e1, true);
        X6(1, this.f51237a0, false);
        X6(4, this.f51324g3, true);
        X6(3, this.f51279d1, false);
        X6(2, this.T, false);
        float f10 = this.f51264bd.f53840e;
        l6.n nVar = this.f51333gd;
        float D = a1.g.D(1.0f, f10, 1.0f - ((float[]) nVar.f18089b)[5], 1.0f);
        mh.c cVar = this.f51294e1;
        if (cVar != null) {
            cVar.setTotalVisibilityFactor(D);
        }
        mj mjVar = this.f51237a0;
        if (mjVar != null) {
            mjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * D);
        }
        pj pjVar = this.f51324g3;
        if (pjVar != null) {
            pjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * D);
        }
        qj qjVar = this.f51279d1;
        if (qjVar != null) {
            qjVar.setTranslationY(org.telegram.messenger.g0.L(54.0f) * D);
        }
        pj pjVar2 = this.T;
        if (pjVar2 != null) {
            pjVar2.setTranslationY(org.telegram.messenger.g0.L(54.0f) * D);
        }
        kh.f fVar = this.U;
        if (fVar != null) {
            fVar.setInputBubbleAlpha((int) ((1.0f - D) * 255.0f));
            this.U.setInputBubbleTranslationY(org.telegram.messenger.g0.L(54.0f) * D);
        }
        qj qjVar2 = this.f51279d1;
        qe.a aVar = this.Zc;
        if (qjVar2 != null) {
            qjVar2.setTotalVisibilityFactor((1.0f - aVar.f53840e) * ((float[]) nVar.f18089b)[3]);
        }
        to toVar = this.f51369ja;
        if (toVar != null) {
            float f11 = aVar.f53840e;
            if (toVar.T != f11) {
                toVar.T = f11;
                this.fragmentView.invalidate();
            }
        }
        E7();
    }

    @Override
    public final void saveKeyboardPositionBeforeTransition() {
        xe xeVar = this.Ka;
        if (xeVar != null) {
            org.telegram.messenger.g0.r(xeVar);
        }
        mj mjVar = this.f51237a0;
        if (mjVar != null && this.m1 != null && mjVar.getAdjustPanLayoutHelper() != null && !this.f51237a0.getAdjustPanLayoutHelper().f27556f) {
            this.Ja = this.m1.getKeyboardHeight();
        } else {
            this.Ja = -1;
        }
    }

    @Override
    public final void saveSelfArgs(Bundle bundle) {
        String str = this.f51401m8;
        if (str != null) {
            bundle.putString("path", str);
        }
    }

    public final void sb() {
        int i3;
        int i10;
        wi wiVar = this.A0;
        if (wiVar != null && this.C0 != null) {
            for (int childCount = wiVar.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = this.A0.getChildAt(childCount);
                this.A0.getClass();
                i10 = RecyclerView.R(childAt);
                if (i10 >= 0) {
                    if (childAt instanceof org.telegram.ui.Cells.q1) {
                        if (((org.telegram.ui.Cells.q1) childAt).getCurrentMessagesGroup() == null) {
                            i3 = f9(childAt);
                            break;
                        }
                    } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                        i3 = f9(childAt);
                        break;
                    }
                }
            }
        }
        i3 = 0;
        i10 = -1;
        if (i10 >= 0) {
            this.C0.h1(i10, i3);
        }
    }

    public final void sc(boolean z10) {
        if (this.R != null) {
            if (!org.telegram.messenger.g0.Q1() && !this.f51511v4 && this.f51306f == null) {
                if (this.Fb == null) {
                    this.Fb = Boolean.valueOf(org.telegram.messenger.lc.e(360928));
                }
                if (this.Fb.booleanValue()) {
                    this.Eb = z10;
                    return;
                }
            }
            int i3 = 0;
            if (this.f51313f6 && org.telegram.messenger.az.c()) {
                if (z10 == this.Eb) {
                    return;
                }
                this.Eb = z10;
                if (z10) {
                    if (this.R.getVisibility() != 0) {
                        this.R.setVisibility(0);
                        this.R.setAlpha(0.0f);
                        this.R.setScaleX(0.3f);
                        this.R.setScaleY(0.3f);
                    }
                    this.R.animate().setListener(null).cancel();
                    this.R.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(150L).start();
                    return;
                }
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleX(0.3f).scaleY(0.3f).setDuration(150L).setListener(new ai(this, 3)).start();
                return;
            }
            this.Eb = z10;
            FrameLayout frameLayout = this.R;
            if (!z10) {
                i3 = 4;
            }
            frameLayout.setVisibility(i3);
        }
    }

    public final void sd(boolean z10) {
        TLRPC.Chat M0;
        TLRPC.User user;
        TLRPC.Chat chat;
        qi qiVar = this.f51433p1;
        if (qiVar == null) {
            return;
        }
        int i3 = this.f51325g4;
        if (i3 == 8 && (chat = this.f51292e) != null) {
            if (this.f51349i4) {
                String i10 = rg.c.i(this.currentAccount, chat, false);
                TLRPC.Chat chat2 = this.f51292e;
                qiVar.h(i10, chat2.scam, chat2.fake, chat2.verified, false, null, z10);
            } else if (org.telegram.messenger.t3.p0(chat)) {
                int i11 = (this.f51475s4 > 0L ? 1 : (this.f51475s4 == 0L ? 0 : -1));
                if (i11 == 0) {
                    TLRPC.Chat chat3 = this.f51292e;
                    if (chat3.linked_monoforum_id != 0) {
                        TLRPC.Chat M02 = getMessagesController().M0(Long.valueOf(this.f51292e.linked_monoforum_id));
                        if (M02 == null) {
                            M02 = this.f51292e;
                        }
                        this.f51433p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M02.title)), M02.scam, M02.fake, M02.verified, false, M02.emoji_status, z10);
                    } else {
                        qi qiVar2 = this.f51433p1;
                        String F2 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat3.title));
                        TLRPC.Chat chat4 = this.f51292e;
                        qiVar2.h(F2, chat4.scam, chat4.fake, chat4.verified, false, chat4.emoji_status, z10);
                    }
                } else if (i11 > 0) {
                    TLRPC.User a22 = getMessagesController().a2(Long.valueOf(this.f51475s4));
                    this.f51433p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.l10.p(a22))), a22.scam, a22.fake, a22.verified, a22.premium, a22.emoji_status, z10);
                } else {
                    TLRPC.Chat M03 = getMessagesController().M0(Long.valueOf(-this.f51475s4));
                    if (M03 == null) {
                        M03 = this.f51292e;
                    }
                    this.f51433p1.h(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M03.title)), M03.scam, M03.fake, M03.verified, false, M03.emoji_status, z10);
                }
            } else {
                qi qiVar3 = this.f51433p1;
                String F22 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(this.f51292e.title));
                TLRPC.Chat chat5 = this.f51292e;
                qiVar3.h(F22, chat5.scam, chat5.fake, chat5.verified, false, chat5.emoji_status, z10);
            }
        } else {
            TLRPC.EmojiStatus emojiStatus = null;
            if (i3 == 9) {
                qiVar.setTitle(org.telegram.messenger.bd.M0(2131742908, null));
            } else if (i3 == 5) {
                if ("hello".equalsIgnoreCase(this.f51311f4)) {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131752775, null));
                } else if ("away".equalsIgnoreCase(this.f51311f4)) {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131752838, null));
                } else {
                    this.f51433p1.setTitle(this.f51311f4);
                }
            } else if (i3 == 6) {
                if (!TextUtils.isEmpty(this.f51297e4.title)) {
                    this.f51433p1.setTitle(this.f51297e4.title);
                } else {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131752716, null));
                }
            } else if (i3 == 3) {
                long j10 = this.f51475s4;
                if (j10 > 0) {
                    user = getMessagesController().a2(Long.valueOf(j10));
                    M0 = null;
                } else {
                    M0 = getMessagesController().M0(Long.valueOf(-j10));
                    user = null;
                }
                if (org.telegram.messenger.l10.z(user)) {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131746274, null));
                } else if (org.telegram.messenger.l10.s(user)) {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131754252, null));
                } else if (org.telegram.messenger.l10.B(user)) {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131748311, null));
                } else if (user != null) {
                    this.f51433p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.l10.p(user))));
                } else if (M0 != null) {
                    this.f51433p1.setTitle(org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(M0.title)));
                } else {
                    this.f51433p1.setTitle("");
                }
            } else if (da() && !org.telegram.messenger.l10.u(this.f51306f)) {
                if (this.f51525w4) {
                    xd();
                } else if (this.f51511v4) {
                    if (this.f51397m4.y2()) {
                        this.f51433p1.setTitle(org.telegram.messenger.bd.G(this.f51397m4.N1(), "Comments", new Object[0]));
                    } else {
                        this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131751996, null));
                    }
                } else {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.G(this.f51397m4.N1(), "Replies", new Object[0]));
                }
            } else if (org.telegram.messenger.l10.z(this.f51306f)) {
                this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131746274, null));
            } else if (org.telegram.messenger.l10.s(this.f51306f)) {
                this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131754252, null));
            } else {
                int i12 = this.f51325g4;
                if (i12 == 1) {
                    if (org.telegram.messenger.l10.B(this.f51306f)) {
                        this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131746330, null));
                    } else {
                        this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131745858, null));
                    }
                } else if (i12 == 2) {
                    this.f51433p1.setTitle(org.telegram.messenger.bd.G(a9(), "PinnedMessagesCount", new Object[0]));
                } else {
                    TLRPC.Chat chat6 = this.f51292e;
                    if (chat6 != null) {
                        qi qiVar4 = this.f51433p1;
                        String F23 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(chat6.title));
                        TLRPC.Chat chat7 = this.f51292e;
                        qiVar4.h(F23, chat7.scam, chat7.fake, chat7.verified, false, chat7.emoji_status, z10);
                    } else {
                        TLRPC.User user2 = this.f51306f;
                        if (user2 != null) {
                            if (user2.self) {
                                this.f51433p1.setTitle(org.telegram.messenger.bd.M0(2131745911, null));
                            } else if (!org.telegram.messenger.hp.F2(user2) && getContactsController().f22654g0.get(Long.valueOf(this.f51306f.f27150id)) == null && (getContactsController().f22654g0.size() != 0 || !getContactsController().y())) {
                                if (!TextUtils.isEmpty(this.f51306f.phone)) {
                                    qi qiVar5 = this.f51433p1;
                                    String i13 = org.telegram.messenger.k5.i(new StringBuilder("+"), this.f51306f.phone, mf.b.c());
                                    TLRPC.User user3 = this.f51306f;
                                    boolean z11 = user3.scam;
                                    boolean z12 = user3.fake;
                                    boolean z13 = user3.verified;
                                    org.telegram.messenger.hp messagesController = getMessagesController();
                                    TLRPC.User user4 = this.f51306f;
                                    messagesController.getClass();
                                    qiVar5.h(i13, z11, z12, z13, org.telegram.messenger.hp.B2(user4), this.f51306f.emoji_status, z10);
                                } else {
                                    qi qiVar6 = this.f51433p1;
                                    String F24 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.l10.p(this.f51306f)));
                                    TLRPC.User user5 = this.f51306f;
                                    boolean z14 = user5.scam;
                                    boolean z15 = user5.fake;
                                    boolean z16 = user5.verified;
                                    org.telegram.messenger.hp messagesController2 = getMessagesController();
                                    TLRPC.User user6 = this.f51306f;
                                    messagesController2.getClass();
                                    qiVar6.h(F24, z14, z15, z16, org.telegram.messenger.hp.B2(user6), this.f51306f.emoji_status, z10);
                                }
                            } else {
                                qi qiVar7 = this.f51433p1;
                                String F25 = org.telegram.messenger.g0.F2(org.telegram.messenger.g0.D2(org.telegram.messenger.l10.p(this.f51306f)));
                                TLRPC.User user7 = this.f51306f;
                                boolean z17 = user7.scam;
                                boolean z18 = user7.fake;
                                boolean z19 = user7.verified;
                                org.telegram.messenger.hp messagesController3 = getMessagesController();
                                TLRPC.User user8 = this.f51306f;
                                messagesController3.getClass();
                                boolean B2 = org.telegram.messenger.hp.B2(user8);
                                if (!org.telegram.messenger.hp.F2(this.f51306f)) {
                                    emojiStatus = this.f51306f.emoji_status;
                                }
                                qiVar7.h(F25, z17, z18, z19, B2, emojiStatus, z10);
                            }
                        }
                    }
                }
            }
        }
        setParentActivityTitle(this.f51433p1.getTitleTextView().getText());
        ud(false);
    }

    @Override
    public final void setInMenuMode(boolean z10) {
        int i3;
        super.setInMenuMode(z10);
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            org.telegram.ui.ActionBar.x q10 = kVar.q();
            if (this.inMenuMode) {
                i3 = 8;
            } else {
                i3 = 0;
            }
            q10.setVisibility(i3);
        }
    }

    @Override
    public final void setInPreviewMode(boolean z10) {
        boolean z11;
        boolean z12;
        org.telegram.messenger.zi ziVar;
        TLRPC.Message message;
        long j10;
        org.telegram.ui.ActionBar.w1 w1Var;
        float f10;
        float f11;
        mj mjVar;
        int i3;
        float f12;
        super.setInPreviewMode(z10);
        int i10 = 8;
        boolean z13 = true;
        if (this.f51306f != null && this.f51445q0 != null) {
            TLRPC.UserFull b22 = getMessagesController().b2(this.f51306f.f27150id);
            if (b22 != null && b22.phone_calls_available) {
                this.f51317fa = !this.inPreviewMode;
                this.f51445q0.e(0);
            } else {
                this.f51317fa = false;
                this.f51445q0.e(8);
            }
        }
        qi qiVar = this.f51433p1;
        float f13 = 0.0f;
        if (qiVar != null) {
            qiVar.setOccupyStatusBar(!z10);
            qi qiVar2 = this.f51433p1;
            if (!this.inPreviewMode) {
                f12 = 52.0f;
            } else {
                f12 = 0.0f;
            }
            qiVar2.setLayoutParams(b8.mf.d(-2, -1.0f, 51, f12, 0.0f, 52.0f, 0.0f));
        }
        mj mjVar2 = this.f51237a0;
        if (mjVar2 != null) {
            if (!z10) {
                i3 = 0;
            } else {
                i3 = 4;
            }
            mjVar2.setVisibility(i3);
        }
        org.telegram.ui.Components.ow0 ow0Var = this.f51472s1;
        if (ow0Var != null) {
            if (this.f51450q5 && !z10 && ((mjVar = this.f51237a0) == null || !mjVar.A3)) {
                i10 = 0;
            }
            ow0Var.setVisibility(i10);
        }
        fj fjVar = this.X1;
        if (fjVar != null) {
            ViewPropertyAnimator animate = fjVar.animate();
            if (!this.f51237a0.A3 && !isInPreviewMode()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            animate.alpha(f11).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
        }
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (!z10) {
                w1Var = new org.telegram.ui.ActionBar.w1(false);
            } else {
                w1Var = null;
            }
            kVar.setBackButtonDrawable(w1Var);
            org.telegram.ui.ActionBar.q0 q0Var = this.f51359j0;
            if (q0Var != null) {
                if (!z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                q0Var.setAlpha(f10);
            }
            org.telegram.ui.ActionBar.w wVar = this.f51321g0;
            if (wVar != null) {
                if (!z10) {
                    f13 = 1.0f;
                }
                wVar.f28755i = f13;
                org.telegram.ui.ActionBar.q0 q0Var2 = wVar.f28759m;
                if (q0Var2 != null) {
                    q0Var2.setAlpha(f13);
                }
            }
        }
        wi wiVar = this.A0;
        if (wiVar != null) {
            int childCount = wiVar.getChildCount();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = this.A0.getChildAt(i11);
                boolean z14 = childAt instanceof org.telegram.ui.Cells.q1;
                if (z14) {
                    ziVar = ((org.telegram.ui.Cells.q1) childAt).getMessageObject();
                } else if (childAt instanceof org.telegram.ui.Cells.t0) {
                    ziVar = ((org.telegram.ui.Cells.t0) childAt).getMessageObject();
                } else {
                    ziVar = null;
                }
                if (ziVar != null && (message = ziVar.f26868k) != null && message.media_unread && message.mentioned) {
                    if (!org.telegram.messenger.zi.S4(message) && !ziVar.i4()) {
                        int i12 = this.C6 - 1;
                        this.C6 = i12;
                        if (i12 <= 0) {
                            this.C6 = 0;
                            this.D6 = true;
                            nc(false);
                        } else {
                            this.f51549y1.c(2, i12, true);
                        }
                        org.telegram.messenger.hp messagesController = getMessagesController();
                        int f14 = ziVar.f1();
                        if (org.telegram.messenger.t3.T(this.f51292e)) {
                            j10 = this.f51292e.f27001id;
                        } else {
                            j10 = 0;
                        }
                        messagesController.n3(j10, f14, this.f51376k6);
                        ziVar.f26868k.media_unread = false;
                    }
                    if (z14) {
                        org.telegram.ui.Cells.q1 q1Var = (org.telegram.ui.Cells.q1) childAt;
                        q1Var.setHighlighted(false);
                        q1Var.m3();
                    }
                }
            }
            this.A0.setItemAnimator(null);
        }
        Lc(false);
        od();
        hj hjVar = this.f51395m2;
        if (hjVar != null) {
            if (!z10 && !this.jb) {
                z12 = true;
            } else {
                z12 = false;
            }
            hjVar.setEnabled(z12);
        }
        hj hjVar2 = this.f51421o2;
        if (hjVar2 != null) {
            if (!z10 && !this.jb) {
                z11 = true;
            } else {
                z11 = false;
            }
            hjVar2.setEnabled(z11);
        }
        jk jkVar = this.M2;
        if (jkVar != null) {
            jkVar.setEnabled(!isInPreviewMode());
        }
        kl klVar = this.m1;
        if (klVar != null) {
            klVar.setOccupyStatusBar((this.inBubbleMode || this.jb || this.inPreviewMode) ? false : false);
        }
    }

    public final boolean t7() {
        CharSequence slowModeTimer = this.f51237a0.getSlowModeTimer();
        if (slowModeTimer == null) {
            return true;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getParentActivity());
        String M0 = org.telegram.messenger.bd.M0(2131745320, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SlowModeHint", null, 2131745321, slowModeTimer));
        k2.p1.B(null, 2131747839, alertDialog$Builder, null);
        return false;
    }

    public final void t8(View view) {
        u8(view, false);
    }

    public final float t9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Hb;
        q1Var.getLocationInWindow(iArr);
        int i3 = iArr[0];
        this.m1.getLocationInWindow(iArr);
        return (i3 - iArr[0]) + f10;
    }

    public final void ta(boolean z10, boolean z11) {
        if (this.S3) {
            org.telegram.messenger.g0.i3(new yd(this, 23), 200L);
            if (z11) {
                this.S3 = false;
            }
        }
        if (z10 && !this.jb) {
            org.telegram.messenger.g0.a3(getParentActivity(), this.classGuid);
        }
    }

    public final boolean tb() {
        mj mjVar = this.f51237a0;
        if (mjVar != null && mjVar.u0() && !this.f51237a0.f31104d1 && !MediaController.B().K()) {
            this.f51411n5 = true;
            mj mjVar2 = this.f51237a0;
            this.f51424o5 = mjVar2.P;
            this.f51437p5 = mjVar2.getRecordTimerStartTime();
            return true;
        }
        return false;
    }

    public final void tc() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.bd.M0(2131752657, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.bd.M0(2131752658, null);
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131746329, null), new de(this, 10));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
        showDialog(s1Var);
    }

    public final void td() {
        ud(false);
    }

    @Override
    public final void u(final org.telegram.messenger.ye yeVar, final org.telegram.messenger.b20 b20Var, final boolean z10, final int i3, final int i10, final boolean z11, long j10) {
        if (yeVar == null) {
            return;
        }
        this.f51249ad.a(false, true);
        org.telegram.messenger.zi ziVar = this.G5;
        if (ziVar != null && ziVar.q5() && !org.telegram.messenger.t3.z(this.currentAccount, 24, org.telegram.messenger.zi.B0(this.G5.f26868k))) {
            org.telegram.messenger.ej ejVar = this.f51540x5;
            if (ejVar == null) {
                ejVar = org.telegram.messenger.ej.b(this.G5.f26868k.suggested_post);
            }
            if (!ci.e9.T(this.currentAccount, ejVar.f22361a)) {
                wc(ejVar);
                return;
            }
        }
        if (b20Var != null && b20Var.f21726s) {
            xe xeVar = new xe(this, 26);
            this.H7 = xeVar;
            org.telegram.messenger.g0.i3(xeVar, 3000L);
        }
        B8(yeVar.f25309a, yeVar.f25320n);
        org.telegram.ui.Components.t4.a0(this.currentAccount, a(), 1, new org.telegram.messenger.u10() {
            @Override
            public final void a(Object obj) {
                Long l10 = (Long) obj;
                wm wmVar = wm.this;
                org.telegram.messenger.zi ziVar2 = wmVar.G5;
                org.telegram.messenger.ye yeVar2 = yeVar;
                org.telegram.messenger.b20 b20Var2 = b20Var;
                boolean z12 = z10;
                int i11 = i3;
                int i12 = i10;
                boolean z13 = z11;
                if (ziVar2 != null && ziVar2.q5()) {
                    org.telegram.messenger.ej ejVar2 = wmVar.f51540x5;
                    if (ejVar2 == null) {
                        ejVar2 = org.telegram.messenger.ej.b(wmVar.G5.f26868k.suggested_post);
                    }
                    org.telegram.messenger.ej ejVar3 = ejVar2;
                    if (yeVar2.f25310b) {
                        org.telegram.messenger.c accountInstance = wmVar.getAccountInstance();
                        String str = yeVar2.I;
                        String str2 = yeVar2.f25314g;
                        TLRPC.Photo photo = yeVar2.f25312e;
                        long j11 = wmVar.f51376k6;
                        org.telegram.messenger.zi ziVar3 = wmVar.G5;
                        org.telegram.messenger.zi ziVar4 = wmVar.f51397m4;
                        mm mmVar = wmVar.C5;
                        ArrayList arrayList = yeVar2.f25320n;
                        int i13 = yeVar2.f25329x;
                        boolean z14 = yeVar2.M;
                        org.telegram.messenger.yy.b0(i13, i11, i12, j11, yeVar2.f25330y, l10.longValue(), wmVar.h9(), yeVar2.f25309a, str, str2, arrayList, accountInstance, ziVar3, ziVar4, null, ejVar3, wmVar.W8(), b20Var2, photo, null, mmVar, z12, z13, z14);
                    } else if (yeVar2.h != null) {
                        org.telegram.messenger.yy.Z(wmVar.getAccountInstance(), yeVar2.h, yeVar2.f25311c, null, wmVar.f51376k6, wmVar.G5, wmVar.f51397m4, wmVar.C5, yeVar2.f25320n, yeVar2.f25324r, null, yeVar2.f25329x, null, b20Var2, z12, i11, z13, yeVar2.f25309a, wmVar.W8(), yeVar2.f25330y, l10.longValue(), wmVar.h9(), ejVar3);
                    } else if (yeVar2.I != null) {
                        org.telegram.messenger.yy.Z(wmVar.getAccountInstance(), yeVar2.I, yeVar2.f25311c, null, wmVar.f51376k6, wmVar.G5, wmVar.f51397m4, wmVar.C5, yeVar2.f25320n, yeVar2.f25324r, null, yeVar2.f25329x, null, b20Var2, z12, i11, z13, yeVar2.f25309a, wmVar.W8(), yeVar2.f25330y, l10.longValue(), wmVar.h9(), ejVar3);
                    }
                } else if (yeVar2.f25310b) {
                    org.telegram.messenger.c accountInstance2 = wmVar.getAccountInstance();
                    String str3 = yeVar2.I;
                    String str4 = yeVar2.f25314g;
                    TLRPC.Photo photo2 = yeVar2.f25312e;
                    long j12 = wmVar.f51376k6;
                    org.telegram.messenger.zi ziVar5 = wmVar.E5;
                    org.telegram.messenger.zi ziVar6 = wmVar.f51397m4;
                    mm mmVar2 = wmVar.C5;
                    ArrayList arrayList2 = yeVar2.f25320n;
                    int i14 = yeVar2.f25329x;
                    org.telegram.messenger.zi ziVar7 = wmVar.G5;
                    boolean z15 = yeVar2.M;
                    org.telegram.messenger.yy.b0(i14, i11, i12, j12, yeVar2.f25330y, l10.longValue(), wmVar.h9(), yeVar2.f25309a, str3, str4, arrayList2, accountInstance2, ziVar5, ziVar6, ziVar7, wmVar.f51540x5, wmVar.W8(), b20Var2, photo2, null, mmVar2, z12, z13, z15);
                } else if (yeVar2.h != null) {
                    org.telegram.messenger.yy.Z(wmVar.getAccountInstance(), yeVar2.h, yeVar2.f25311c, null, wmVar.f51376k6, wmVar.E5, wmVar.f51397m4, wmVar.C5, yeVar2.f25320n, yeVar2.f25324r, null, yeVar2.f25329x, wmVar.G5, b20Var2, z12, i11, z13, yeVar2.f25309a, wmVar.W8(), yeVar2.f25330y, l10.longValue(), wmVar.h9(), wmVar.f51540x5);
                } else if (yeVar2.I != null) {
                    org.telegram.messenger.yy.Z(wmVar.getAccountInstance(), yeVar2.I, yeVar2.f25311c, null, wmVar.f51376k6, wmVar.E5, wmVar.f51397m4, wmVar.C5, yeVar2.f25320n, yeVar2.f25324r, null, yeVar2.f25329x, wmVar.G5, b20Var2, z12, i11, z13, yeVar2.f25309a, wmVar.W8(), yeVar2.f25330y, l10.longValue(), wmVar.h9(), wmVar.f51540x5);
                }
                wmVar.K6();
            }
        }, j10);
    }

    public final void u7(Runnable runnable, dg.a aVar, boolean z10) {
        if (aVar != null && z10) {
            p1 p1Var = new p1(this, aVar, runnable, 20);
            ci.e9 x10 = ci.e9.x(this.currentAccount, aVar.f8923a);
            if (!x10.f5032e) {
                x10.q(p1Var, true, true);
                return;
            } else {
                p1Var.run();
                return;
            }
        }
        runnable.run();
    }

    public final void u8(View view, boolean z10) {
        boolean z11;
        Qb(view);
        if (view != this.f51549y1) {
            z11 = true;
        } else {
            z11 = false;
        }
        v8(z10, z11, 0.2f);
    }

    public final float u9(org.telegram.ui.Cells.q1 q1Var, float f10) {
        int[] iArr = this.Hb;
        q1Var.getLocationInWindow(iArr);
        int i3 = iArr[1];
        this.m1.getLocationInWindow(iArr);
        return (i3 - iArr[1]) + f10;
    }

    public final void ua() {
        this.Q4 = true;
        ll llVar = this.r9;
        org.telegram.messenger.g0.r(llVar.f30669f0);
        llVar.f30695z = false;
        yd ydVar = new yd(this, 9);
        int i3 = this.U7;
        if (i3 != 0) {
            xb(i3, 0, false, this.T7, true, 0, null, null, ydVar);
            return;
        }
        int i10 = this.S7;
        if (i10 > 0) {
            xb(i10, 0, true, this.T7, true, 0, null, null, ydVar);
            return;
        }
        wb(!this.f51570zb, ydVar);
        this.f51570zb = false;
        if (!this.U4.isEmpty()) {
            this.f51256b5 = true;
            this.f51242a5 = ((Integer) this.U4.get(0)).intValue();
        }
    }

    public final int ub(org.telegram.messenger.zi r12) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.ub(org.telegram.messenger.zi):int");
    }

    public final void uc() {
        String str;
        if (this.f51344hc != null) {
            return;
        }
        if (this.E5 != null) {
            str = getMessagesController().c1(this.E5.S1());
        } else {
            str = "";
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, getParentActivity(), getResourceProvider());
        String M0 = org.telegram.messenger.bd.M0(2131743821, null);
        org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
        s1Var.S = M0;
        s1Var.U = org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0(null, null, 2131743822, str));
        alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751336, null), new de(this, 18));
        alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), new de(this, 19));
        s1Var.setOnDismissListener(new ce(this, 8));
        this.f51344hc = alertDialog$Builder.p();
    }

    public final void ud(boolean z10) {
        Drawable mutate;
        Drawable drawable;
        org.telegram.ui.ActionBar.o0 o0Var;
        if (this.f51433p1 != null) {
            int i3 = this.f51325g4;
            if (i3 == 0 || i3 == 8) {
                boolean r22 = getMessagesController().r2(this.f51376k6, b(), null);
                if (z10) {
                    r22 = !r22;
                }
                this.R0 = null;
                if (!org.telegram.messenger.t3.e0(this.currentAccount, this.f51292e) && !org.telegram.messenger.t3.f0(this.currentAccount, this.f51306f)) {
                    if (!org.telegram.messenger.l10.z(this.f51306f) && ((!da() || this.f51525w4) && r22)) {
                        mutate = getThemedDrawable("drawableMuteIcon");
                    } else {
                        mutate = null;
                    }
                } else {
                    mutate = getParentActivity().getResources().getDrawable(2131231942).mutate();
                    int i10 = org.telegram.ui.ActionBar.k6.H6;
                    mutate.setColorFilter(new PorterDuffColorFilter(getThemedColor(i10), PorterDuff.Mode.SRC_IN));
                    this.R0 = mutate;
                    this.O0 = getThemedColor(i10);
                }
                if (this.h != null) {
                    drawable = getThemedDrawable("drawableLockIcon");
                } else {
                    TLRPC.Chat chat = this.f51292e;
                    if (chat != null) {
                        drawable = this.f51433p1.c(org.telegram.messenger.m5.c(chat));
                    } else {
                        TLRPC.User user = this.f51306f;
                        if (user != null && !org.telegram.messenger.l10.B(user)) {
                            drawable = this.f51433p1.c(org.telegram.messenger.m5.c(this.f51306f));
                        } else {
                            drawable = null;
                        }
                    }
                }
                this.f51433p1.j(drawable, mutate);
                if (!z10 && (o0Var = this.f51484t1) != null) {
                    if (r22) {
                        if (o0Var.f28374m != 8) {
                            o0Var.f28374m = 8;
                            View view = o0Var.f28371j;
                            if (view instanceof org.telegram.ui.ActionBar.y0) {
                                ((org.telegram.ui.ActionBar.y0) view).getRightIcon().setVisibility(o0Var.f28374m);
                            }
                        }
                        this.f51484t1.d(org.telegram.messenger.bd.M0(2131743859, null));
                        this.f51484t1.b(2131232256);
                    } else {
                        if (o0Var.f28374m != 0) {
                            o0Var.f28374m = 0;
                            View view2 = o0Var.f28371j;
                            if (view2 instanceof org.telegram.ui.ActionBar.y0) {
                                ((org.telegram.ui.ActionBar.y0) view2).getRightIcon().setVisibility(o0Var.f28374m);
                            }
                        }
                        if (getMessagesController().s2(this.f51376k6, b())) {
                            this.f51484t1.d(org.telegram.messenger.bd.M0(2131748322, null));
                            this.f51484t1.b(2131232412);
                        } else {
                            this.f51484t1.d(org.telegram.messenger.bd.M0(2131748322, null));
                            this.f51484t1.b(2131232366);
                        }
                    }
                }
                org.telegram.ui.Components.xn xnVar = this.f51536x1;
                if (xnVar != null) {
                    xnVar.e(this.f51376k6, b(), null);
                }
            }
        }
    }

    public final void v7() {
        if (this.O3 != null) {
            return;
        }
        ik ikVar = new ik(this, getParentActivity(), this, this.f51557ya);
        this.O3 = ikVar;
        this.m1.addView(ikVar, 17, b8.mf.d(-1, -2.0f, 51, 8.0f, 8.0f, 8.0f, 0.0f));
    }

    public final void v8(boolean z10, boolean z11, float f10) {
        boolean z12;
        ValueAnimator ofFloat;
        mh.h hVar;
        org.telegram.ui.Cells.q1 q1Var;
        if (f10 > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        View view = this.Y8;
        if (view instanceof org.telegram.ui.Cells.q1) {
            org.telegram.ui.Cells.q1 q1Var2 = (org.telegram.ui.Cells.q1) view;
            q1Var2.setInvalidatesParent(z12);
            if (z12) {
                mb(q1Var2);
            }
        }
        this.m1.invalidate();
        this.A0.invalidate();
        AnimatorSet animatorSet = this.f51302e9;
        if (animatorSet != null) {
            animatorSet.removeAllListeners();
            this.f51302e9.cancel();
        }
        this.f51302e9 = new AnimatorSet();
        ArrayList arrayList = new ArrayList();
        float max = Math.max(this.W8, f10);
        float f11 = 1.0f;
        if (z12) {
            this.Z8 = 1.0f;
            this.f51246a9 = 0.0f;
            ValueAnimator valueAnimator = this.Fc;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.X8 = true;
            ofFloat = ValueAnimator.ofFloat(0.0f, f10);
            arrayList.add(ofFloat);
            if (z10) {
                org.telegram.ui.Components.nk0.d(new ke(this, 3));
            }
        } else {
            float f12 = this.W8;
            this.f51246a9 = f12 / max;
            this.X8 = false;
            ofFloat = ValueAnimator.ofFloat(f12, 0.0f);
            arrayList.add(ofFloat);
        }
        ofFloat.addUpdateListener(new of(this, max, 0));
        if ((!z12 || z11) && (hVar = this.f51549y1) != null) {
            Property property = View.ALPHA;
            if (z12) {
                f11 = 0.0f;
            }
            arrayList.add(ObjectAnimator.ofFloat(hVar, property, f11));
        }
        this.f51302e9.playTogether(arrayList);
        this.f51302e9.setInterpolator(org.telegram.ui.Components.xq.h);
        this.f51302e9.setDuration(320L);
        View view2 = this.Y8;
        if (view2 instanceof org.telegram.ui.Cells.q1) {
            q1Var = (org.telegram.ui.Cells.q1) view2;
        } else {
            q1Var = null;
        }
        this.f51302e9.addListener(new androidx.fragment.app.g(this, z12, q1Var, 6));
        if (this.Y8 != null && this.Z8 <= 0.0f) {
            Qb(null);
        }
        this.f51302e9.start();
    }

    public final void v9(boolean z10) {
        int i3;
        int i10;
        if (this.f51325g4 == 7) {
            org.telegram.messenger.ha a10 = org.telegram.messenger.ha.a(this.currentAccount);
            int i11 = this.classGuid;
            int i12 = this.K3;
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i13 = i12 + i10;
            org.telegram.messenger.ga b10 = a10.b(this.f51282d4);
            if (i13 >= 0 && i13 < b10.f22679a.size()) {
                b10.f22688l = i13;
                org.telegram.messenger.hs.f(a10.f22906a).k(org.telegram.messenger.hs.I0, Integer.valueOf(i11), Integer.valueOf(b10.f22689m), Boolean.valueOf(b10.f22690n), Integer.valueOf(b10.b()), Integer.valueOf(b10.f22688l), Integer.valueOf(((org.telegram.messenger.zi) b10.f22679a.get(i13)).f26868k.f27022id));
                return;
            }
            return;
        }
        org.telegram.messenger.li mediaDataController = getMediaDataController();
        long j10 = this.f51376k6;
        long j11 = this.f51272c7;
        int i14 = this.classGuid;
        boolean z11 = this.f51381kb;
        if (!z10 ? !z11 : z11) {
            i3 = 2;
        } else {
            i3 = 1;
        }
        mediaDataController.X1(null, j10, j11, i14, i3, this.f51475s4, false, this.D3, this.E3, true, this.F3);
        oc(false);
    }

    public final void vb() {
        wb(false, null);
    }

    public final void vc(View view, CharSequence charSequence, boolean z10) {
        gi.l3 l3Var;
        if (getParentActivity() != null && this.fragmentView != null) {
            if (z10 || ((l3Var = this.B2) != null && l3Var.W)) {
                this.B2.u(org.telegram.messenger.g0.X2(org.telegram.messenger.bd.a0("SlowModeHint", null, 2131745321, charSequence)));
                if (z10) {
                    this.B2.y(view, true);
                }
            }
        }
    }

    public final void vd(boolean r43) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.vd(boolean):void");
    }

    public final void w7(boolean z10) {
        long j10;
        if (System.currentTimeMillis() - this.f51357ic > 1000) {
            z10 = true;
        }
        tf tfVar = this.f51370jc;
        org.telegram.messenger.g0.r(tfVar);
        if (z10) {
            j10 = 0;
        } else {
            j10 = 150;
        }
        org.telegram.messenger.g0.i3(tfVar, j10);
    }

    public final void w8(Runnable runnable) {
        org.telegram.messenger.hs.f(this.currentAccount).d(runnable);
    }

    public final void w9() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.w9():void");
    }

    public final void wa(long j10, String str, boolean z10) {
        xa();
        ei.x2 x2Var = this.Y1;
        if (x2Var != null) {
            x2Var.C1(j10, str, z10, false);
        }
    }

    public final void wb(boolean z10, yd ydVar) {
        ArrayList arrayList;
        int i3;
        if (this.A0.W1) {
            return;
        }
        this.f51242a5 = 0;
        this.Rb = 0;
        this.f51256b5 = false;
        this.f51392l9.f(0);
        if (this.V6[0] && this.Y7 == 0 && this.L7 == 0) {
            this.f51549y1.d(false);
            if (this.C0.I0() == 0) {
                this.A9 = false;
                Zc();
                hb();
                Cd(false);
                return;
            }
            this.D0.T();
            im imVar = this.f51331gb;
            imVar.f46297a = null;
            int i10 = 0;
            while (true) {
                arrayList = this.L6;
                if (i10 >= arrayList.size() || !((org.telegram.messenger.zi) arrayList.get(i10)).s4()) {
                    break;
                }
                i10++;
                z10 = false;
            }
            if (z10 && arrayList != null && !arrayList.isEmpty() && arrayList.get(i10) != null) {
                long d12 = ((org.telegram.messenger.zi) arrayList.get(i10)).d1();
                while (d12 != 0 && (i3 = i10 + 1) < arrayList.size() && d12 == ((org.telegram.messenger.zi) arrayList.get(i3)).d1()) {
                    i10 = i3;
                }
            }
            if (arrayList != null && !arrayList.isEmpty()) {
                i10 = Math.min(i10, arrayList.size() - 1);
            }
            sj sjVar = this.f51392l9;
            imVar.f46298b = i10;
            imVar.d = 0;
            boolean z11 = !z10;
            imVar.f46299c = z11;
            sjVar.d(i10, 0, z11, true);
            this.A9 = false;
            Zc();
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = this.Qb;
        if (s1Var != null) {
            s1Var.dismiss();
        }
        bd(false);
        if (ydVar != null) {
            ydVar.run();
        } else {
            lb();
            org.telegram.ui.ActionBar.s1 s1Var2 = new org.telegram.ui.ActionBar.s1(3, getParentActivity(), this.f51557ya);
            this.Qb = s1Var2;
            s1Var2.setOnCancelListener(this.Ga);
            this.Qb.r(1000L);
        }
        this.f51415n9 = this.f51399m6;
        this.f51441p9 = false;
        this.f51428o9 = 0;
        this.f51454q9 = false;
        ArrayList arrayList2 = this.f51554y6;
        arrayList2.clear();
        arrayList2.add(Integer.valueOf(this.f51399m6));
        org.telegram.messenger.g0.i3(new xe(this, 14), 0L);
    }

    public final void wc(org.telegram.messenger.ej ejVar) {
        if (this.G5 == null) {
            return;
        }
        new ci.x0(getParentActivity(), this.currentAccount, this.f51376k6, ejVar, this, getResourceProvider(), 0, new le(this, 0)).show();
    }

    public final void wd() {
        int i3;
        TLRPC.TL_forumTopic tL_forumTopic;
        org.telegram.ui.ActionBar.o0 o0Var = this.f51521w0;
        if (o0Var != null) {
            TLRPC.Chat chat = this.f51292e;
            if (chat != null && org.telegram.messenger.t3.i(this.currentAccount, chat, this.f51463r4) && (tL_forumTopic = this.f51463r4) != null && !tL_forumTopic.closed) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            o0Var.e(i3);
        }
    }

    public final void x7() {
        int r9 = (int) (r9(org.telegram.ui.Components.c11.f32503c) + this.U.getInputBubbleHeight() + this.f51520w.d() + org.telegram.messenger.g0.L(9.0f) + org.telegram.messenger.g0.L(7.0f));
        this.Z.setFadeZoneBottom(r9);
        int b10 = b8.be.b(org.telegram.messenger.g0.L(36.0f) + (this.m1.getMeasuredHeight() - r9), 0, this.m1.getMeasuredHeight());
        int measuredWidth = this.m1.getMeasuredWidth();
        Rect rect = f51235rd;
        rect.set(0, 0, measuredWidth, b10);
        rect.set(0, this.Ua, this.A0.getMeasuredWidth(), org.telegram.messenger.g0.L(36.0f) + ((this.A0.getMeasuredHeight() - this.Va) - r9));
    }

    public final void x8() {
        TLRPC.Message message;
        TLRPC.MessageMedia messageMedia;
        org.telegram.messenger.zi ziVar = this.G5;
        if (ziVar != null && (message = ziVar.f26868k) != null && (messageMedia = message.media) != null) {
            messageMedia.manual = false;
        }
    }

    public final boolean x9() {
        TLRPC.Message message;
        SparseArray[] sparseArrayArr = this.f51412n6;
        for (int i3 = 0; i3 < sparseArrayArr.length; i3++) {
            try {
                for (int i10 = 0; i10 < sparseArrayArr[i3].size(); i10++) {
                    org.telegram.messenger.zi ziVar = (org.telegram.messenger.zi) sparseArrayArr[i3].valueAt(i10);
                    if (ziVar != null && (message = ziVar.f26868k) != null && message.noforwards) {
                        return true;
                    }
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public final void xa() {
        boolean z10;
        boolean z11;
        if (getParentActivity() != null) {
            mj mjVar = this.f51237a0;
            if (mjVar == null || TextUtils.isEmpty(mjVar.getSlowModeTimer())) {
                mj mjVar2 = this.f51237a0;
                if (mjVar2 != null && mjVar2.f31166n5.f53841f) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                T7();
                ei.x2 x2Var = this.Y1;
                if (!z10 && this.f51325g4 != 9) {
                    z11 = false;
                } else {
                    z11 = true;
                }
                x2Var.M3 = z11;
                x2Var.f32215b2.i0();
                TLRPC.Chat chat = this.f51292e;
                if ((chat == null || this.f51540x5 == null) && !z10 && this.f51325g4 != 9) {
                    if (chat != null && !org.telegram.messenger.t3.N(chat) && this.f51292e.slowmode_enabled) {
                        this.Y1.y1(10, true);
                    } else {
                        this.Y1.y1(-1, true);
                    }
                } else {
                    this.Y1.y1(1, true);
                }
                ei.x2 x2Var2 = this.Y1;
                x2Var2.N2 = true;
                x2Var2.f32272s3.setVisibility(0);
                x2Var2.L2 = 0;
                x2Var2.f32290x1 = false;
                x2Var2.f32294y1 = false;
                x2Var2.f32212a2 = true;
                x2Var2.B1 = null;
                org.telegram.ui.ActionBar.q0 q0Var = x2Var2.f32227f3;
                if (q0Var != null) {
                    x2Var2.f32224e3.setTranslationY(0.0f);
                    q0Var.setVisibility(8);
                }
                this.Y1.e1();
                this.Y1.a1().setText(this.f51237a0.getFieldText());
                ei.x2 x2Var3 = this.Y1;
                x2Var3.f32262q1 = this.f51557ya;
                showDialog(x2Var3);
            }
        }
    }

    public final void xb(int r26, int r27, boolean r28, int r29, boolean r30, int r31, java.lang.Integer r32, byte[] r33, java.lang.Runnable r34) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.xb(int, int, boolean, int, boolean, int, java.lang.Integer, byte[], java.lang.Runnable):void");
    }

    public final void xc(org.telegram.messenger.zi ziVar) {
        CharSequence charSequence;
        if (getParentActivity() != null && !getMessagesController().A2(org.telegram.messenger.zi.B0(ziVar.f26868k))) {
            TLRPC.Message message = ziVar.f26868k;
            if (message == null || !message.noforwards) {
                ArrayList arrayList = ziVar.f26927z2;
                boolean z10 = false;
                if (arrayList != null && !arrayList.isEmpty()) {
                    charSequence = ziVar.v;
                    if (ziVar.f26927z2.size() > 1) {
                        z10 = true;
                    }
                } else {
                    charSequence = ziVar.f26924z;
                }
                if (!z10 && charSequence != null) {
                    z10 = true;
                }
                if (z10 && org.telegram.messenger.az.J <= 2 && !this.C9 && this.D9 <= this.f51237a0.getTop() - org.telegram.messenger.g0.L(60.0f)) {
                    this.C9 = true;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    int i3 = org.telegram.messenger.az.J + 1;
                    org.telegram.messenger.az.J = i3;
                    edit.putInt("textSelectionHintShows", i3);
                    edit.apply();
                    if (this.B9 == null) {
                        pk pkVar = new pk(getParentActivity(), this.f51557ya, this);
                        this.B9 = pkVar;
                        this.m1.addView(pkVar, b8.mf.d(-2, 56.0f, 83, 8.0f, 0.0f, 8.0f, 8.0f));
                    }
                    this.B9.c();
                }
            }
        }
    }

    public final void xd() {
        TLRPC.TL_forumTopic tL_forumTopic;
        qi qiVar = this.f51433p1;
        if (qiVar != null && (tL_forumTopic = this.f51463r4) != null) {
            qiVar.setTitle(tL_forumTopic.title);
        }
        yd();
    }

    @Override
    public final boolean y(final org.telegram.ui.uw r24, final java.util.ArrayList r25, final java.lang.CharSequence r26, boolean r27, final boolean r28, final int r29, final int r30, org.telegram.ui.m91 r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.y(org.telegram.ui.uw, java.util.ArrayList, java.lang.CharSequence, boolean, boolean, int, int, org.telegram.ui.m91):boolean");
    }

    public final void y7() {
        int i3;
        if (this.f51433p1 != null) {
            float actionModeFactor = (1.0f - this.f51305ed.f53840e) * (1.0f - this.actionBar.getActionModeFactor());
            float T1 = org.telegram.messenger.g0.T1(0.95f, 1.0f, actionModeFactor);
            this.f51433p1.setScaleX(T1);
            this.f51433p1.setScaleY(T1);
            this.f51433p1.setAlpha(actionModeFactor);
            qi qiVar = this.f51433p1;
            if (actionModeFactor > 0.0f) {
                i3 = 0;
            } else {
                i3 = 8;
            }
            qiVar.setVisibility(i3);
        }
    }

    public final org.telegram.ui.Components.n01 y8() {
        long b10;
        boolean z10;
        if (this.f51407n0 == null && getParentActivity() != null && this.m1 != null) {
            org.telegram.ui.Components.n01 n01Var = new org.telegram.ui.Components.n01(getParentActivity(), this.currentAccount, a(), this.f51557ya, new zj(this));
            this.f51407n0 = n01Var;
            this.m1.addView(n01Var, b8.mf.c(-1.0f, -1));
        }
        org.telegram.ui.Components.n01 n01Var2 = this.f51407n0;
        if (n01Var2 != null) {
            if (X9()) {
                b10 = c9();
            } else {
                b10 = b();
            }
            n01Var2.setCurrentTopic(b10);
            org.telegram.ui.Components.n01 n01Var3 = this.f51407n0;
            if (this.f51359j0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            n01Var3.setMenuAvailable(z10);
        }
        return this.f51407n0;
    }

    public final boolean y9() {
        ll llVar = this.r9;
        if (llVar != null && llVar.x()) {
            return true;
        }
        return false;
    }

    public final void ya() {
        is.p().T = null;
        if (getParentActivity() == null) {
            return;
        }
        T7();
        this.Y1.f32215b2.i0();
        this.Y1.y1(1, false);
        ei.x2 x2Var = this.Y1;
        x2Var.P3 = true;
        x2Var.W0(null);
        this.Y1.e1();
        ei.x2 x2Var2 = this.Y1;
        x2Var2.f32262q1 = this.f51557ya;
        if (this.visibleDialog != null) {
            x2Var2.show();
        } else {
            showDialog(x2Var2);
        }
    }

    public final void yb(java.lang.CharSequence r18, boolean r19) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wm.yb(java.lang.CharSequence, boolean):void");
    }

    public final void yc(boolean z10, boolean z11) {
        mj mjVar;
        int i3;
        if (getParentActivity() != null && this.fragmentView != null) {
            if ((!z10 || this.H2 != null) && this.f51325g4 == 0 && (mjVar = this.f51237a0) != null && mjVar.getAudioVideoButtonContainer() != null && this.f51237a0.getAudioVideoButtonContainer().getVisibility() == 0 && !isInPreviewMode()) {
                if (this.H2 == null) {
                    int indexOfChild = this.m1.indexOfChild(this.U);
                    if (indexOfChild != -1) {
                        this.H2 = D6(310.0f, 3, indexOfChild + 1, false);
                    } else {
                        return;
                    }
                }
                if (z10) {
                    this.H2.f(true);
                    return;
                }
                if (this.f51237a0.f31119f2) {
                    gi.l3 l3Var = this.H2;
                    if (z11) {
                        i3 = 2131749298;
                    } else {
                        i3 = 2131749300;
                    }
                    l3Var.u(org.telegram.messenger.bd.M0(i3, null));
                } else {
                    this.H2.u(org.telegram.messenger.bd.M0(2131749299, null));
                }
                this.H2.y(this.f51237a0.getAudioVideoButtonContainer(), true);
            }
        }
    }

    public final void yd() {
        qi qiVar;
        qi qiVar2;
        if (org.telegram.messenger.l10.u(this.f51306f) && (qiVar2 = this.f51433p1) != null) {
            qiVar2.getAvatarImageView().setVisibility(0);
            this.f51433p1.b();
        } else if (this.f51463r4 != null && (qiVar = this.f51433p1) != null) {
            qiVar.getAvatarImageView().setVisibility(0);
            rg.c.p(this.f51433p1.getAvatarImageView(), this.f51463r4, true, true, this.f51557ya);
        }
    }

    @Override
    public final boolean z() {
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void z7() {
        boolean z10;
        gi.g1 g1Var;
        if (this.xa != null) {
            return;
        }
        int i3 = 0;
        if (this.f51291dd.f53840e >= 1.0f && ((g1Var = this.F1) == null || g1Var.getPositionAnimated() <= 0.0f)) {
            z10 = false;
        } else {
            z10 = true;
        }
        ai.x2 x2Var = this.m1.M;
        if (!z10) {
            i3 = 4;
        }
        x2Var.setVisibility(i3);
    }

    public final void z8() {
        org.telegram.messenger.bj bjVar;
        org.telegram.messenger.ej ejVar = this.f51540x5;
        if (ejVar != null) {
            gc(ejVar);
            return;
        }
        TLRPC.WebPage webPage = this.X5;
        if (webPage != null) {
            cc(true, webPage, false, true);
            return;
        }
        mm mmVar = this.C5;
        if (mmVar != null) {
            fc(this.E5, mmVar);
            return;
        }
        org.telegram.messenger.zi ziVar = this.E5;
        if (ziVar != null && ziVar != this.f51397m4) {
            ec(ziVar);
            return;
        }
        org.telegram.messenger.dj djVar = this.f51526w5;
        if (djVar != null && (bjVar = djVar.f22198b) != null) {
            dc(bjVar.f21841e);
            return;
        }
        org.telegram.messenger.zi ziVar2 = this.G5;
        if (ziVar2 != null) {
            bc(true, null, ziVar2, null, null, true, 0, null, false, 0L, null, true);
        } else {
            cc(false, null, true, true);
        }
    }

    public final void z9() {
        org.telegram.ui.Components.xs editField;
        org.telegram.ui.ActionBar.k kVar = this.actionBar;
        if (kVar != null) {
            if (kVar.v()) {
                this.f51333gd.h(5, false, true);
                this.actionBar.u();
            } else {
                return;
            }
        }
        this.f51464r6 = 0;
        this.f51501u6 = 0;
        this.s6 = 0;
        this.f51527w6 = 0;
        this.f51541x6 = 0;
        this.f51513v6 = 0;
        mj mjVar = this.f51237a0;
        if (mjVar != null && (editField = mjVar.getEditField()) != null) {
            if (this.f51237a0.getVisibility() == 0) {
                editField.requestFocus();
            }
            editField.setAllowDrawCursor(true);
        }
        ll llVar = this.r9;
        if (llVar != null) {
            llVar.f(true);
            SparseArray sparseArray = this.r9.f29388p0;
            for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                ((Animator) sparseArray.get(sparseArray.keyAt(i3))).cancel();
            }
            sparseArray.clear();
        }
        pk pkVar = this.B9;
        if (pkVar != null) {
            org.telegram.messenger.g0.r(pkVar.I);
            pkVar.a();
        }
        mj mjVar2 = this.f51237a0;
        if (mjVar2 != null) {
            mjVar2.f31091b0 = false;
        }
        this.C9 = false;
        if (this.f51558yb != null) {
            H9();
        }
    }

    public final void za(final CharacterStyle characterStyle, final String str, boolean z10, final org.telegram.ui.Cells.q1 q1Var, final org.telegram.messenger.zi ziVar) {
        TLRPC.Message message;
        if (z10) {
            int i3 = -1;
            if (str.startsWith("@")) {
                if (q1Var != null) {
                    q1Var.d3(-1);
                }
                String substring = str.substring(1);
                ci ka2 = ka(q1Var, characterStyle);
                TLObject f22 = getMessagesController().f2(substring);
                ci.g3 g3Var = new ci.g3(this, ka2, q1Var, substring, characterStyle, 2);
                TL_account.checkUsername checkusername = new TL_account.checkUsername();
                checkusername.username = substring;
                ka2.f54708b = new ne(this, getConnectionsManager().sendRequest(checkusername, new ci.s7(this, f22, g3Var, substring, ka2, 4)), 5);
                ka2.d();
                return;
            } else if (characterStyle == null) {
                org.telegram.ui.ActionBar.t2 t2Var = new org.telegram.ui.ActionBar.t2(1, (Context) getParentActivity(), (org.telegram.ui.ActionBar.e6) this.f51557ya, false);
                t2Var.N();
                if (str.startsWith("video?")) {
                    i3 = Utilities.z(str).intValue();
                }
                final int i10 = i3;
                if (i10 >= 0) {
                    t2Var.P = org.telegram.messenger.g0.g0(i10, false, false);
                    t2Var.Q = false;
                } else {
                    t2Var.P = sf.c.d(str, true);
                    t2Var.Q = false;
                    t2Var.R = true;
                }
                CharSequence[] charSequenceArr = (U9() || !(ziVar == null || (message = ziVar.f26868k) == null || !message.noforwards)) ? new CharSequence[]{org.telegram.messenger.bd.M0(2131747825, null)} : new CharSequence[]{org.telegram.messenger.bd.M0(2131747825, null), org.telegram.messenger.bd.M0(2131751767, null)};
                DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() {
                    @Override
                    public final void onClick(DialogInterface dialogInterface, int i11) {
                        wm.c0(wm.this, str, characterStyle, ziVar, q1Var, i10, i11);
                    }
                };
                t2Var.M = charSequenceArr;
                t2Var.L = onClickListener;
                t2Var.I0 = new s5(q1Var, 3);
                showDialog(t2Var);
                return;
            } else {
                if (q1Var != null) {
                    q1Var.d3(-1);
                }
                i8(q1Var, ziVar, characterStyle, str);
                return;
            }
        }
        ja(ziVar, false, false);
        String c2 = sf.c.c(str);
        if (c2 != null) {
            String lowerCase = c2.toLowerCase();
            if (!org.telegram.messenger.t3.O(lowerCase, this.f51292e) && !org.telegram.messenger.l10.r(lowerCase, this.f51306f)) {
                if (str.startsWith("@")) {
                    getMessagesController().y3(lowerCase, this, 0, ka(q1Var, characterStyle));
                    return;
                } else {
                    Wa(0, str, characterStyle, q1Var, false);
                    return;
                }
            }
            qi qiVar = this.f51433p1;
            if (qiVar != null) {
                qiVar.e(false, false);
            } else {
                Tb();
            }
        } else if (!str.startsWith("#") && !str.startsWith("$")) {
            Wa(0, str, characterStyle, q1Var, false);
        } else {
            int i11 = this.f51325g4;
            if (i11 != 1 && i11 != 2 && i11 != 7) {
                if (str.contains("@")) {
                    presentFragment(new org.telegram.ui.Components.n20(str, this.resourceProvider));
                    return;
                } else {
                    Da(str, false);
                    return;
                }
            }
            this.f51379k9.w0(str);
            if (this.f51325g4 != 7) {
                finishFragment();
            }
        }
    }

    public final void zb(TLRPC.Chat chat, TLRPC.User user) {
        String str;
        this.D3 = user;
        this.E3 = chat;
        if (this.f51371k0 != null && this.X1 != null) {
            if (user != null || chat != null) {
                if (user != null) {
                    str = user.first_name;
                    if (TextUtils.isEmpty(str)) {
                        str = this.D3.last_name;
                    }
                } else {
                    str = chat.title;
                }
                if (str != null) {
                    if (str.length() > 10) {
                        str = str.substring(0, 10);
                    }
                    this.C3 = false;
                    String M0 = org.telegram.messenger.bd.M0(2131745776, null);
                    SpannableString spannableString = new SpannableString(a1.g.C(M0, " ", str));
                    spannableString.setSpan(new org.telegram.ui.Components.tz(org.telegram.ui.ActionBar.k6.B8, getResourceProvider()), M0.length() + 1, spannableString.length(), 33);
                    this.f51371k0.setSearchFieldCaption(spannableString);
                    this.X1.getAdapter().U(null, 0, null, false, true);
                    this.f51371k0.setSearchFieldHint(null);
                    this.f51371k0.n();
                    org.telegram.messenger.li mediaDataController = getMediaDataController();
                    this.I3 = "";
                    mediaDataController.X1("", this.f51376k6, this.f51272c7, this.classGuid, 0, this.f51475s4, false, this.D3, this.E3, true, this.F3);
                }
            }
        }
    }

    public final boolean zc(org.telegram.messenger.zi ziVar) {
        if (this.f51325g4 == 0 && ziVar != null && ziVar.c5()) {
            return true;
        }
        return false;
    }

    public final void zd() {
        boolean z10;
        int i3;
        float f10;
        org.telegram.ui.ActionBar.k kVar;
        if (this.m0 == null) {
            return;
        }
        int i10 = 0;
        if (ea() && !this.f51459r0 && ((kVar = this.actionBar) == null || !kVar.v())) {
            z10 = true;
        } else {
            z10 = false;
        }
        org.telegram.ui.ActionBar.q0 q0Var = this.m0;
        if (z10) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        q0Var.setVisibility(i3);
        org.telegram.ui.ActionBar.q0 q0Var2 = this.f51359j0;
        if (q0Var2 != null && (q0Var2.getLayoutParams() instanceof LinearLayout.LayoutParams)) {
            ViewGroup.LayoutParams layoutParams = this.f51359j0.getLayoutParams();
            if (!z10) {
                i10 = org.telegram.messenger.g0.L(48.0f);
            }
            if (layoutParams.width != i10) {
                layoutParams.width = i10;
                this.f51359j0.setLayoutParams(layoutParams);
            }
            org.telegram.ui.ActionBar.q0 q0Var3 = this.f51359j0;
            if (z10) {
                f10 = 0.0f;
            } else {
                f10 = 1.0f;
            }
            q0Var3.setAlpha(f10);
            this.f51359j0.setClickable(!z10);
        }
        qd();
    }

    public void va(boolean z10) {
    }

    @Override
    public final void S() {
    }
}
