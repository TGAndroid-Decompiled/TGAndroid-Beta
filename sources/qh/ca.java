package qh;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.text.style.URLSpan;
import android.util.Property;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.window.OnBackInvokedDispatcher;
import j$.util.Objects;
import java.io.File;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.WeakHashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BotWebViewVibrationEffect;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MediaController;
import org.telegram.messenger.MediaDataController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ec0;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.f80;
import org.telegram.ui.Components.gf0;
import org.telegram.ui.Components.i91;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ij0;
import org.telegram.ui.Components.jm;
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.q51;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.xt;
import org.telegram.ui.Components.y61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ek;
import org.telegram.ui.iw0;
import org.telegram.ui.my0;
import org.telegram.ui.qd1;
import org.telegram.ui.sj0;
import org.telegram.ui.xq0;
public final class ca implements NotificationCenter.NotificationCenterDelegate {
    public static ca C2;
    public final b6 A0;
    public TextureView A1;
    public float A2;
    public ValueAnimator B;
    public final na B0;
    public ef0 B1;
    public ValueAnimator B2;
    public x9 C;
    public final oa C0;
    public gf0 C1;
    public float D;
    public final v D0;
    public File D1;
    public final RectF E;
    public final na E0;
    public ArrayList E1;
    public float F;
    public final u F0;
    public ArrayList F1;
    public int G;
    public final ra G0;
    public ArrayList G1;
    public float H;
    public boolean H0;
    public s6 H1;
    public Float I;
    public boolean I0;
    public boolean I1;
    public boolean J;
    public c9 J0;
    public long J1;
    public long K;
    public o0 K0;
    public boolean K1;
    public boolean L;
    public final r5 L0;
    public int L1;
    public final AnimationNotificationsLocker M;
    public final d M0;
    public boolean M1;
    public Runnable N;
    public final v8 N0;
    public boolean N1;
    public Utilities.Callback4 O;
    public final b2 O0;
    public boolean O1;
    public int P;
    public final b2 P0;
    public boolean P1;
    public int Q;
    public final e3 Q0;
    public float Q1;
    public int R;
    public final e3 R0;
    public int R1;
    public boolean S;
    public final i91 S0;
    public boolean S1;
    public boolean T;
    public final f3 T0;
    public boolean T1;
    public boolean U;
    public final q9 U0;
    public boolean U1;
    public int V;
    public final FrameLayout V0;
    public String V1;
    public int W;
    public final ma W0;
    public AnimatorSet W1;
    public int X;
    public final qa X0;
    public boolean X1;
    public int Y;
    public final e5 Y0;
    public boolean Y1;
    public final RectF Z;
    public final r9 Z0;
    public boolean Z1;
    public final oh.b f45074a;
    public final RectF f45075a0;
    public final u8 f45076a1;
    public boolean a2;
    public final Activity f45077b;
    public final Path f45078b0;
    public final n0 f45079b1;
    public Runnable f45080b2;
    public final int f45081c;
    public int f45082c0;
    public ij0 f45083c1;
    public AnimatorSet f45084c2;
    public boolean d;
    public int f45085d0;
    public final lj0 f45086d1;
    public l8 f45087d2;
    public boolean f45088e;
    public final n9 f45089e0;
    public ij0 f45090e1;
    public boolean f45091e2;
    public final WindowManager f45092f;
    public final FrameLayout f45093f0;
    public ImageView f45094f1;
    public AnimatorSet f45095f2;
    public final LinearLayout f45096g0;
    public final fg.i0 f45097g1;
    public ValueAnimator f45098g2;
    public final WindowManager.LayoutParams h;
    public final FrameLayout f45099h0;
    public final f3 f45100h1;
    public boolean f45101h2;
    public final o9 f45102i0;
    public final f3 f45103i1;
    public f2.i0 f45104i2;
    public final FrameLayout f45105j0;
    public final f3 f45106j1;
    public MediaController.AlbumEntry f45107j2;
    public final b2 f45108k0;
    public final f3 f45109k1;
    public ValueAnimator f45110k2;
    public final l6 f45111l0;
    public final f5 l1;
    public o1.j f45112l2;
    public final org.telegram.ui.ActionBar.l5 m0;
    public final pa f45113m1;
    public Boolean f45114m2;
    public final ba f45115n;
    public d8 f45116n0;
    public n f45117n1;
    public p8 f45118n2;
    public final org.telegram.ui.Components.ba f45119o0;
    public l9 f45120o1;
    public AnimatorSet f45121o2;
    public final i5 f45122p0;
    public m9 f45123p1;
    public boolean f45124p2;
    public final iw0 f45125q0;
    public final ma f45126q1;
    public int f45127q2;
    public final t9 f45128r;
    public boolean f45129r0;
    public final d f45130r1;
    public ArrayList f45131r2;
    public final d2 f45132s;
    public long f45133s0;
    public f9 f45134s1;
    public FrameLayout f45135s2;
    public String f45136t0;
    public dg.o1 f45137t1;
    public boolean f45138t2;
    public TLRPC.InputPeer f45139u0;
    public View f45140u1;
    public g8 f45141u2;
    public boolean v;
    public b8 f45142v0;
    public View f45143v1;
    public jm f45144v2;
    public long f45145w;
    public r f45146w0;
    public View f45147w1;
    public boolean f45148w2;
    public s9 f45149x;
    public final p9 f45150x0;
    public View f45151x1;
    public boolean f45152x2;
    public final lf.s0 f45153y;
    public g9 f45154y0;
    public pf0 f45155y1;
    public boolean f45156y2;
    public n5 f45157z0;
    public final nf0 f45158z1;
    public wo f45159z2;

    public ca(Activity activity, int i10) {
        lf.s0 s0Var;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        boolean z4;
        float f11;
        oh.b bVar = new oh.b();
        this.f45074a = bVar;
        this.f45145w = 0L;
        this.E = new RectF();
        this.J = true;
        this.M = new AnimationNotificationsLocker();
        this.Z = new RectF();
        this.f45075a0 = new RectF();
        this.f45078b0 = new Path();
        new Rect();
        this.f45082c0 = 0;
        this.f45085d0 = -1;
        this.f45142v0 = new b8();
        this.E1 = null;
        this.F1 = null;
        this.G1 = null;
        this.L1 = 0;
        this.M1 = false;
        this.N1 = false;
        this.O1 = false;
        this.P1 = false;
        this.R1 = -3;
        this.T1 = false;
        y8 y8Var = new y8(this);
        this.a2 = true;
        this.f45101h2 = true;
        this.f45127q2 = -1;
        this.f45077b = activity;
        this.f45081c = i10;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            s0Var = new lf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.f45153y = s0Var;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        this.h = layoutParams;
        layoutParams.height = -1;
        layoutParams.width = -1;
        layoutParams.format = -3;
        layoutParams.gravity = 51;
        layoutParams.type = 99;
        AndroidUtilities.applyEdgeToEdgeLayoutParams(layoutParams);
        layoutParams.flags = -2013200128;
        layoutParams.softInputMode = 16;
        WindowManager windowManager = (WindowManager) activity.getSystemService("window");
        this.f45092f = windowManager;
        ba baVar = new ba(this, activity);
        this.f45115n = baVar;
        o8 o8Var = new o8(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46438a;
        r0.b0.j(baVar, o8Var);
        this.f45115n.setFocusable(true);
        this.f45115n.setImportantForAccessibility(2);
        d2 d2Var = new d2(activity, windowManager, this.f45115n, layoutParams);
        this.f45132s = d2Var;
        d2Var.a(new j9(this));
        this.f45115n.addView(this.f45132s.f45182b, new ViewGroup.LayoutParams(-1, -1));
        ba baVar2 = this.f45115n;
        t9 t9Var = new t9(this, activity);
        this.f45128r = t9Var;
        baVar2.addView(t9Var);
        t9 t9Var2 = this.f45128r;
        n9 n9Var = new n9(this, activity);
        this.f45089e0 = n9Var;
        t9Var2.addView(n9Var);
        this.f45128r.addView(this.f45132s.f45183c, new ViewGroup.LayoutParams(-1, -1));
        this.f45119o0 = new org.telegram.ui.Components.ba(this.f45089e0);
        this.f45122p0 = new Object();
        t9 t9Var3 = this.f45128r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f45093f0 = frameLayout;
        t9Var3.addView(frameLayout);
        t9 t9Var4 = this.f45128r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f45099h0 = frameLayout2;
        t9Var4.addView(frameLayout2);
        t9 t9Var5 = this.f45128r;
        o9 o9Var = new o9(this, activity, 0);
        this.f45102i0 = o9Var;
        t9Var5.addView(o9Var);
        this.f45102i0.setVisibility(8);
        this.f45102i0.setAlpha(0.0f);
        t9 t9Var6 = this.f45128r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f45105j0 = frameLayout3;
        t9Var6.addView(frameLayout3);
        ic.a(this.f45115n, new hg.w(14));
        p9 p9Var = new p9(this, activity, this.f45119o0, this.f45128r, bVar);
        this.f45150x0 = p9Var;
        ba baVar3 = this.f45115n;
        Objects.requireNonNull(baVar3);
        p9Var.setCancelGestures(new org.telegram.ui.web.s0(baVar3, 26));
        this.f45150x0.setResetState(new g8(this, 13));
        this.f45089e0.addView(this.f45150x0, k7.c6.e(-1, -1, 119));
        this.f45150x0.setOnClickListener(new i8(this, 12));
        n9 n9Var2 = this.f45089e0;
        int i15 = this.G;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        n9Var2.setBackgroundColor(i11);
        n9 n9Var3 = this.f45089e0;
        hg.j1 j1Var = lf.q0.f12504a;
        n9Var3.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(12.0f)));
        this.f45089e0.setClipToOutline(true);
        g8 g8Var = new g8(this, 14);
        ?? view = new View(activity);
        view.f29461a = new TextPaint(1);
        view.f29462b = new TextPaint(1);
        pr prVar = pr.h;
        view.f29468s = new org.telegram.ui.Components.z5((View) view, 0L, 350L, prVar);
        view.F = new ec0(view, 7);
        view.f29470x = g8Var;
        this.f45158z1 = view;
        q9 q9Var = new q9(this, activity, this.f45119o0, this.f45122p0);
        this.U0 = q9Var;
        q9Var.setCollageView(this.f45150x0);
        q9 q9Var2 = this.U0;
        q9Var2.v = new g8(this, 15);
        q9Var2.setOnTapListener(new g8(this, 16));
        this.U0.setVisibility(8);
        q9 q9Var3 = this.U0;
        q9Var3.K = new g8(this, 17);
        this.f45089e0.addView(q9Var3, k7.c6.e(-1, -1, 119));
        this.f45089e0.addView(this.f45158z1, k7.c6.e(-1, -1, 119));
        ba baVar4 = this.f45115n;
        r9 r9Var = new r9(this, activity, baVar4, baVar4, this.f45128r, bVar, this.f45119o0);
        this.Z0 = r9Var;
        r9Var.setAccount(i10);
        this.Z0.setUiBlurBitmap(new o8(this, 6));
        ic.a(this.f45102i0, new lh.t0(this, 11));
        this.Z0.setOnHeightUpdate(new h8(this, 13));
        this.Z0.setOnPeriodUpdate(new h8(this, 4));
        long j10 = this.K;
        if (j10 != 0) {
            this.Z0.setDialogId(j10);
        }
        this.Z0.setOnPremiumHint(new h8(this, 5));
        this.Z0.setOnKeyboardOpen(new h8(this, 6));
        iw0 iw0Var = new iw0(this, activity, 6);
        this.f45125q0 = iw0Var;
        this.f45128r.addView(iw0Var);
        ma maVar = new ma(activity, this.f45128r, this.f45089e0, bVar, this.f45119o0);
        this.W0 = maVar;
        maVar.setOnTimelineClick(new g8(this, 10));
        this.W0.setOnHeightChange(new g8(this, 11));
        this.U0.setVideoTimelineView(this.W0);
        this.W0.setVisibility(8);
        this.W0.setAlpha(0.0f);
        this.W0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.V0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.W0, k7.c6.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        qa qaVar = new qa(activity);
        this.X0 = qaVar;
        qaVar.setVisibility(8);
        this.X0.a(false);
        this.V0.addView(this.X0, k7.c6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f45102i0.addView(this.V0, k7.c6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f45102i0.addView(this.Z0, k7.c6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.f45150x0.setTimelineView(this.W0);
        this.f45150x0.setPreviewView(this.U0);
        ma maVar2 = new ma(activity, this.f45128r, this.f45089e0, bVar, this.f45119o0);
        this.f45126q1 = maVar2;
        maVar2.U0 = true;
        maVar2.setVisibility(8);
        this.f45126q1.setAlpha(0.0f);
        this.f45102i0.addView(this.f45126q1, k7.c6.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        u8 u8Var = new u8(this, activity, bVar, this.f45119o0);
        this.f45076a1 = u8Var;
        u8Var.setVisibility(8);
        this.f45102i0.addView(this.f45076a1, k7.c6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f45108k0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        b2 b2Var = this.f45108k0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        b2Var.setScaleType(scaleType);
        this.f45108k0.setImageResource(R.drawable.msg_photo_back);
        b2 b2Var2 = this.f45108k0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        b2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f45108k0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45108k0.setOnClickListener(new i8(this, 1));
        this.f45093f0.addView(this.f45108k0, k7.c6.e(56, 56, 51));
        this.f45132s.a(this.f45108k0);
        l6 l6Var = new l6(activity, i10);
        this.f45111l0 = l6Var;
        l6Var.a(false, false);
        this.f45111l0.setOnClickListener(new r8(0, this, activity));
        this.f45093f0.addView(this.f45111l0, k7.c6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.l5 l5Var = new org.telegram.ui.ActionBar.l5(activity);
        this.m0 = l5Var;
        l5Var.setTextSize(20);
        this.m0.setGravity(19);
        this.m0.setTextColor(-1);
        this.m0.setTypeface(AndroidUtilities.bold());
        this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.m0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.m0.setAlpha(0.0f);
        this.m0.setVisibility(8);
        this.m0.setEllipsizeByGradient(true);
        this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f45093f0.addView(this.m0, k7.c6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f45096g0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f45096g0.setGravity(5);
        this.f45093f0.addView(this.f45096g0, k7.c6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        h8 h8Var = new h8(this, 7);
        ba baVar5 = this.f45115n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f45753w = true;
        imageView2.f45754x = true;
        imageView2.h = h8Var;
        imageView2.f45745a = i10;
        imageView2.f45746b = baVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new org.telegram.ui.Components.voip.o(imageView2, 8));
        imageView2.f45749f = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f45079b1 = imageView2;
        f3 f3Var = new f3(activity, 1);
        f3Var.m(1.0f, -71.0f);
        f3Var.d = 2000L;
        f3Var.R = false;
        f3Var.E.o(true, false, false);
        this.f45100h1 = f3Var;
        f3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f45093f0.addView(this.f45100h1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f45086d1 = imageView3;
        imageView3.setScaleType(scaleType);
        lj0 lj0Var = this.f45086d1;
        s6 s6Var = this.H1;
        if (s6Var != null && s6Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        lj0Var.setImageResource(i12);
        this.f45086d1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f45086d1.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45086d1.setOnClickListener(new i8(this, 2));
        this.f45086d1.setVisibility(8);
        this.f45086d1.setAlpha(0.0f);
        fg.i0 i0Var = new fg.i0(activity);
        this.f45097g1 = i0Var;
        i0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45097g1.setVisibility(8);
        this.f45097g1.setAlpha(0.0f);
        this.f45097g1.setOnClickListener(new i8(this, 3));
        this.f45096g0.addView(this.f45097g1, k7.c6.q(46, 56, 53));
        this.f45096g0.addView(this.f45086d1, k7.c6.q(46, 56, 53));
        this.f45096g0.addView(this.f45079b1, k7.c6.e(46, 56, 53));
        na naVar = new na(activity);
        this.B0 = naVar;
        naVar.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.B0.setOnClickListener(new i8(this, 4));
        this.B0.setOnLongClickListener(new eg.d0(this, 2));
        this.B0.setVisibility(8);
        this.B0.setAlpha(0.0f);
        this.f45132s.a(this.B0);
        this.f45093f0.addView(this.B0, k7.c6.e(56, 56, 53));
        oa oaVar = new oa(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.C0 = oaVar;
        oaVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.C0.setOnClickListener(new i8(this, 5));
        boolean q10 = v0.q(activity);
        oa oaVar2 = this.C0;
        if (q10) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        oaVar2.setVisibility(i13);
        oa oaVar3 = this.C0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        oaVar3.setAlpha(f10);
        this.f45132s.a(this.C0);
        this.f45093f0.addView(this.C0, k7.c6.e(56, 56, 53));
        ?? naVar2 = new na(activity);
        this.D0 = naVar2;
        naVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.D0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        if (this.f45146w0 == null) {
            i14 = 6;
            this.f45146w0 = (r) r.a().get(6);
        } else {
            i14 = 6;
        }
        this.D0.setOnClickListener(new i8(this, i14));
        this.D0.a(new lc0(this.f45146w0, false), false);
        this.D0.setSelected(false);
        this.D0.setVisibility(0);
        this.D0.setAlpha(1.0f);
        this.f45132s.a(this.D0);
        this.f45093f0.addView(this.D0, k7.c6.e(56, 56, 53));
        na naVar3 = new na(activity);
        this.E0 = naVar3;
        naVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.E0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.E0.a(new lc0(new r("../../.."), true), false);
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.E0.setOnClickListener(new i8(this, 7));
        this.f45132s.a(this.E0);
        this.f45093f0.addView(this.E0, k7.c6.e(56, 56, 53));
        u uVar = new u(activity, this.f45132s);
        this.F0 = uVar;
        uVar.f46134a.u0(6);
        this.F0.setSelected((r) null);
        this.F0.setOnLayoutClick(new h8(this, 8));
        this.f45093f0.addView(this.F0, k7.c6.e(-1, 56, 53));
        f3 f3Var2 = new f3(activity, 1);
        f3Var2.m(1.0f, -20.0f);
        f3Var2.d = 5000L;
        f3Var2.i();
        f3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        f3Var2.f45298i0 = new sj0(16);
        this.f45103i1 = f3Var2;
        f3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f45093f0.addView(this.f45103i1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        f3 f3Var3 = new f3(activity, 2);
        f3Var3.m(0.0f, 28.0f);
        f3Var3.d = 5000L;
        f3Var3.q(true);
        this.f45106j1 = f3Var3;
        this.f45093f0.addView(f3Var3, k7.c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        f3 f3Var4 = new f3(activity, 1);
        f3Var4.m(1.0f, -20.0f);
        f3Var4.d = 5000L;
        f3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f45109k1 = f3Var4;
        f3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f45093f0.addView(this.f45109k1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f45987a = paint;
        Paint paint2 = new Paint(1);
        view2.f45988b = paint2;
        view2.f45990e = new org.telegram.ui.Components.z5((View) view2, 0L, 250L, prVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        view2.f45989c = j6Var;
        j6Var.k(0.3f, 250L, prVar);
        j6Var.t(AndroidUtilities.dp(13.0f));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.bold());
        j6Var.setCallback(view2);
        j6Var.f28029b = 1;
        view2.a(0L, false);
        this.G0 = view2;
        i0(false, false);
        this.f45093f0.addView(this.G0, k7.c6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f45132s.a(this.G0);
        MediaController.loadGalleryPhotosAlbums(0);
        r5 r5Var = new r5(activity);
        this.L0 = r5Var;
        r5Var.setDelegate(y8Var);
        r5 r5Var2 = this.L0;
        if (this.L1 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        r5Var2.f45961k0 = -1.0f;
        r5Var2.f45962l0 = z4;
        r5Var2.invalidate();
        this.f45099h0.addView(this.L0, k7.c6.e(-1, 100, 87));
        this.f45132s.a(this.L0);
        r5 r5Var3 = this.L0;
        if (this.f45150x0.j()) {
            f11 = this.f45150x0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        r5Var3.e(f11, true);
        d dVar = new d(activity, bVar, true);
        this.M0 = dVar;
        dVar.setRoundRadius(24);
        this.M0.setColor(-2473124);
        this.M0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.M0.setAlpha(0.0f);
        this.M0.setScaleX(0.8f);
        this.M0.setScaleY(0.8f);
        this.M0.setVisibility(8);
        this.f45099h0.addView(this.M0, k7.c6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.M0.setOnClickListener(new i8(this, 8));
        f3 f3Var5 = new f3(activity, 3);
        f3Var5.q(true);
        f3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        f3Var5.h = AndroidUtilities.dp(320.0f);
        f3Var5.d = 5000L;
        f3Var5.H = Layout.Alignment.ALIGN_CENTER;
        this.T0 = f3Var5;
        this.f45099h0.addView(f3Var5, k7.c6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        i91 i91Var = new i91(activity);
        this.S0 = i91Var;
        i91Var.J = false;
        i91Var.setAlpha(0.0f);
        this.f45099h0.addView(this.S0, k7.c6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.S0.setDelegate(new o8(this, 4));
        i91 i91Var2 = this.S0;
        this.Q1 = 0.0f;
        i91Var2.b(0.0f, false);
        b6 b6Var = new b6(activity, i10, new g8(this, 12));
        this.A0 = b6Var;
        b6Var.f44996c = new h8(this, 9);
        this.f45099h0.addView(b6Var, k7.c6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        v8 v8Var = new v8(this, activity);
        this.N0 = v8Var;
        v8Var.setOnSwitchModeListener(new h8(this, 10));
        this.N0.setOnSwitchingModeListener(new h8(this, 11));
        this.f45105j0.addView(this.N0, k7.c6.e(-1, 48, 55));
        this.f45132s.a(this.N0);
        ?? imageView4 = new ImageView(activity);
        this.O0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.O0.setImageResource(R.drawable.stream_flip);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45105j0.addView(this.O0, k7.c6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f45132s.a(this.O0);
        this.O0.setOnClickListener(new i8(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.P0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.P0.setImageResource(R.drawable.stream_settings);
        this.P0.setScaleType(scaleType);
        this.P0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45105j0.addView(this.P0, k7.c6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f45132s.a(this.P0);
        this.P0.setOnClickListener(new i8(this, 10));
        e3 e3Var = new e3(activity);
        this.Q0 = e3Var;
        this.f45105j0.addView(e3Var, k7.c6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f45132s.a(this.Q0);
        e3 e3Var2 = new e3(activity);
        this.R0 = e3Var2;
        e3Var2.f45242a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        e3Var2.invalidate();
        this.R0.setAlpha(0.0f);
        this.f45105j0.addView(this.R0, k7.c6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f45132s.a(this.R0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f45130r1 = dVar2;
        dVar2.setVisibility(8);
        this.f45130r1.setAlpha(0.0f);
        this.f45130r1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f45130r1.setOnClickListener(new i8(this, 11));
        this.f45105j0.addView(this.f45130r1, k7.c6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f45246b = new ArrayList();
        frameLayout5.f45248e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f45245a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, k7.c6.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.f45248e = true;
        d5 d5Var = new d5(frameLayout5, activity, string, true);
        frameLayout5.f45247c = d5Var;
        d5Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f45247c, k7.c6.c(-2.0f, -2));
        frameLayout5.e();
        this.Y0 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.Y0.setOnClickListener(new h8(this, 12));
        this.f45105j0.addView(this.Y0, k7.c6.e(-1, 52, 23));
        pa paVar = new pa(activity);
        this.f45113m1 = paVar;
        paVar.setAlpha(0.0f);
        this.f45113m1.setVisibility(8);
        this.f45089e0.addView(this.f45113m1, k7.c6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        f5 f5Var = new f5(activity, i10, bVar);
        this.l1 = f5Var;
        this.f45089e0.addView(f5Var, k7.c6.e(-1, -1, 119));
        m0(false);
    }

    public static ca E(Activity activity, int i10) {
        ca caVar = C2;
        if (caVar != null && (caVar.f45077b != activity || caVar.f45081c != i10)) {
            caVar.q(false);
            C2 = null;
        }
        if (C2 == null) {
            C2 = new ca(activity, i10);
        }
        return C2;
    }

    public static void a(ca caVar) {
        g9 g9Var = caVar.f45154y0;
        boolean z4 = false;
        if (g9Var != null && g9Var.getTextureView() != null) {
            Bitmap bitmap = caVar.f45154y0.getTextureView().getBitmap();
            if (bitmap == null) {
                caVar.Z1 = false;
                return;
            }
            int width = bitmap.getWidth() / 12;
            int height = bitmap.getHeight() / 12;
            float f10 = 0.0f;
            for (int i10 = 0; i10 < 10; i10++) {
                int i11 = 0;
                while (i11 < 10) {
                    i11++;
                    f10 += AndroidUtilities.computePerceivedBrightness(bitmap.getPixel((i10 + 1) * width, i11 * height));
                }
            }
            bitmap.recycle();
            if (f10 / 100.0f < 0.22f) {
                z4 = true;
            }
            caVar.Z1 = z4;
            return;
        }
        caVar.Z1 = false;
    }

    public static void a0(boolean z4) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z4).apply();
    }

    public static boolean b(ca caVar) {
        Activity activity = caVar.f45077b;
        if (activity == null) {
            return true;
        }
        int i10 = Build.VERSION.SDK_INT;
        boolean z4 = false;
        if (i10 >= 33) {
            z4 = (activity.checkSelfPermission("android.permission.READ_MEDIA_IMAGES") == 0 && activity.checkSelfPermission("android.permission.READ_MEDIA_VIDEO") == 0) ? true : true;
            if (z4) {
                activity.requestPermissions(new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"}, 114);
            }
        } else if (i10 >= 23) {
            if (activity.checkSelfPermission("android.permission.READ_EXTERNAL_STORAGE") != 0) {
                z4 = true;
            }
            if (z4) {
                activity.requestPermissions(new String[]{"android.permission.READ_EXTERNAL_STORAGE"}, 114);
            }
        }
        return !z4;
    }

    public static void c(ca caVar) {
        ValueAnimator valueAnimator = caVar.f45098g2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            caVar.f45098g2 = null;
        }
        caVar.f45101h2 = false;
        t9 t9Var = caVar.f45128r;
        float f10 = t9Var.f46126a;
        float f11 = t9Var.f46127b;
        t9Var.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        caVar.f45098g2 = ofFloat;
        ofFloat.addUpdateListener(new pv(caVar, f10, f11, 3));
        caVar.f45098g2.setDuration(340L);
        caVar.f45098g2.setInterpolator(pr.h);
        caVar.f45098g2.addListener(new b9(caVar, 0));
        caVar.f45098g2.start();
    }

    public static boolean d(ca caVar) {
        Activity activity = caVar.f45077b;
        if (Build.VERSION.SDK_INT >= 23 && activity != null && activity.checkSelfPermission("android.permission.RECORD_AUDIO") != 0) {
            activity.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 112);
            return false;
        }
        return true;
    }

    public static SpannableString n(Context context) {
        SpannableString spannableString = new SpannableString("c");
        Drawable mutate = context.getResources().getDrawable(R.drawable.story_camera).mutate();
        int dp = AndroidUtilities.dp(35.0f);
        int i10 = -dp;
        mutate.setBounds(i10 / 4, i10, (dp / 4) * 3, 0);
        spannableString.setSpan(new k9(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        ca caVar = C2;
        if (caVar != null) {
            caVar.q(false);
        }
        C2 = null;
    }

    public final Drawable A() {
        Bitmap bitmap;
        try {
            bitmap = BitmapFactory.decodeFile(new File(ApplicationLoader.getFilesDirFixed(), "cthumb.jpg").getAbsolutePath());
        } catch (Throwable unused) {
            bitmap = null;
        }
        if (bitmap != null) {
            return new BitmapDrawable(bitmap);
        }
        return this.f45077b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.F1;
        if (arrayList != null) {
            return arrayList.size();
        }
        s6 s6Var = this.H1;
        if (s6Var != null) {
            return s6Var.r();
        }
        return 1;
    }

    public final String C() {
        g9 g9Var = this.f45154y0;
        if (g9Var != null && g9Var.getCameraSession() != null) {
            if (this.f45154y0.isFrontface() && !this.f45154y0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f45131r2.get(this.f45127q2);
            }
            return this.f45154y0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final o0 D() {
        if (this.K0 == null) {
            o0 o0Var = new o0(this.f45077b);
            this.K0 = o0Var;
            this.f45099h0.addView(o0Var, k7.c6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.K0;
    }

    public final String F() {
        int i10;
        g9 g9Var = this.f45154y0;
        if (g9Var != null && g9Var.getCameraSession() != null) {
            if (this.f45154y0.isFrontface() && !this.f45154y0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f45131r2;
                if (this.f45127q2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f45127q2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.f45154y0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f45094f1 == null) {
            int i10 = R.raw.sun_outline;
            ij0 ij0Var = new ij0(i10, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f45090e1 = ij0Var;
            ij0Var.h = true;
            s6 s6Var = this.H1;
            if (s6Var != null && s6Var.f46091y0) {
                ij0Var.K(35);
                this.f45090e1.N(36);
            } else {
                ij0Var.N(0);
                this.f45090e1.K(0);
            }
            this.f45090e1.X = true;
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J9, this.f45074a);
            this.f45090e1.O(v02, "Sunny");
            this.f45090e1.O(v02, "Path 6");
            this.f45090e1.O(v02, "Path");
            this.f45090e1.O(v02, "Path 5");
            this.f45090e1.m();
            ImageView imageView = new ImageView(this.f45077b);
            this.f45094f1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f45094f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f45094f1.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
            this.f45094f1.setOnClickListener(new i8(this, 0));
            this.f45094f1.setVisibility(8);
            this.f45094f1.setImageDrawable(this.f45090e1);
            this.f45094f1.setAlpha(0.0f);
            this.f45096g0.addView(this.f45094f1, 0, k7.c6.q(46, 56, 53));
        }
        return this.f45094f1;
    }

    public final void H() {
        f9 f9Var = this.f45134s1;
        if (f9Var == null) {
            return;
        }
        this.f45135s2 = null;
        f9Var.getTopLayout().setAlpha(0.0f);
        this.f45134s1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f45134s1.getBottomLayout().setAlpha(0.0f);
        this.f45134s1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f45134s1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f45134s1.setVisibility(8);
    }

    public final boolean I() {
        float f10;
        if (this.f45150x0.j()) {
            f10 = this.f45150x0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.X1 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        c9 c9Var;
        if (!this.T && (c9Var = this.J0) != null) {
            if (c9Var.getTranslationY() < (this.f45115n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: qh.ca.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j10) {
        if (!this.P1 && this.H1 != null) {
            l8 l8Var = this.f45087d2;
            if (l8Var != null) {
                AndroidUtilities.cancelRunOnUIThread(l8Var);
            }
            this.f45091e2 = true;
            this.P1 = true;
            this.f45087d2 = new l8(this, runnable, 1);
            this.U0.setAlpha(0.0f);
            this.U0.setVisibility(0);
            this.U0.n(this.H1, this.f45087d2, j10);
            this.U0.q(this.H1, false);
            AndroidUtilities.runOnUIThread(this.f45087d2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: qh.ca.M():boolean");
    }

    public final void N(int i10, int i11) {
        boolean z4;
        boolean z10;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18 = 8;
        if (i10 == 0) {
            v(false);
            this.L0.setVisibility(8);
            this.S0.setVisibility(8);
            this.N0.setVisibility(8);
            h(false, false);
            d0(false);
        }
        if (i10 == 2) {
            this.f45126q1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f45102i0.setVisibility(i17);
            this.Z0.setVisibility(8);
            this.f45130r1.setVisibility(8);
        }
        if (i10 == 1) {
            this.Y0.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f45102i0.setVisibility(i14);
            this.f45086d1.setVisibility(8);
            this.f45097g1.setVisibility(8);
            this.f45079b1.setVisibility(8);
            ImageView imageView = this.f45094f1;
            if (imageView != null) {
                imageView.setVisibility(8);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.U0.setVisibility(i15);
            this.W0.setVisibility(8);
            if (i11 != 2) {
                z();
                y();
            }
            if (i11 == 2) {
                i16 = 0;
            } else {
                i16 = 8;
            }
            this.m0.setVisibility(i16);
            w();
            this.f45113m1.setAlpha(0.0f);
            this.f45113m1.setVisibility(8);
            this.X0.setVisibility(8);
            this.E1 = null;
            this.F1 = null;
            this.G1 = null;
        }
        if (i11 == 1) {
            s6 s6Var = this.H1;
            if (s6Var == null || !s6Var.f46069n) {
                u();
                H();
            }
            nf0 nf0Var = this.f45158z1;
            if (nf0Var != null) {
                nf0Var.setAllowTouch(false);
            }
            this.U0.x(2, false);
            this.U0.x(3, false);
            this.U0.x(4, false);
            this.U0.x(5, false);
            this.U0.x(7, false);
            s6 s6Var2 = this.H1;
            if (s6Var2 != null && s6Var2.f46059h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.X0.setVisibility(i13);
            this.f45102i0.setAlpha(1.0f);
            this.f45102i0.setTranslationY(0.0f);
            s6 s6Var3 = this.H1;
            this.Z0.setVisibility((s6Var3 == null || s6Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.S1) {
            D().setVisibility(0);
            o0 D = D();
            D.f45819r.d(0.0f, true);
            D.a(true);
            org.telegram.ui.web.s0 s0Var = D.h;
            if (s0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(s0Var);
            }
            org.telegram.ui.web.s0 s0Var2 = new org.telegram.ui.web.s0(D, 12);
            D.h = s0Var2;
            AndroidUtilities.runOnUIThread(s0Var2, 3500L);
            this.L0.h();
        }
        this.S1 = false;
        nf0 nf0Var2 = this.f45158z1;
        if (nf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f45085d0) == -1 || i12 == 1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            nf0Var2.setAllowTouch(z10);
        }
        r9 r9Var = this.Z0;
        if (r9Var != null) {
            if (i11 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            r9Var.f45511b0 = z4;
        }
        if (i11 == 1) {
            int i19 = this.f45081c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            oh.t6 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void O(int i10, int i11) {
        s6 s6Var;
        int i12;
        float f10;
        int i13;
        boolean z4;
        boolean z10;
        long j10;
        String str;
        SpannableStringBuilder append;
        boolean z11;
        s6 s6Var2;
        boolean z12;
        boolean z13;
        boolean z14;
        s6 s6Var3;
        long duration;
        boolean z15;
        boolean z16;
        int i14;
        g8 g8Var;
        int i15;
        int i16;
        boolean z17;
        boolean z18;
        boolean z19;
        s6 s6Var4;
        int i17;
        s6 s6Var5;
        s6 s6Var6;
        s6 s6Var7;
        y61 textureView;
        s6 s6Var8;
        boolean z20 = true;
        if (i11 == 0) {
            Z(false);
            this.L0.setVisibility(0);
            r5 r5Var = this.L0;
            if (r5Var != null) {
                r5Var.g(false);
            }
            this.N0.setVisibility(0);
            this.S0.setVisibility(0);
            this.S0.setAlpha(0.0f);
            this.G0.a(0L, true);
            s6 s6Var9 = this.H1;
            if (s6Var9 != null) {
                s6Var9.i(false);
                this.H1 = null;
            }
            p9 p9Var = this.f45150x0;
            if (p9Var != null) {
                p9Var.e();
                this.L0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new g8(this, 18));
            o0 o0Var = this.K0;
            if (o0Var != null) {
                o0Var.setVisibility(8);
            }
            this.T0.e(true);
            f3 f3Var = this.f45103i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f45081c;
        if (i11 != 1 && i10 != 1) {
            j10 = 0;
        } else {
            if (i11 == 1) {
                s6Var = this.H1;
            } else {
                s6Var = null;
            }
            this.f45079b1.setEntry(s6Var);
            if (this.L1 == 1) {
                this.f45086d1.setVisibility(0);
                s6 s6Var10 = this.H1;
                if (s6Var10 != null && s6Var10.Y) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f0(z12, false);
                this.f45097g1.setVisibility(0);
                this.U0.x(-9982, false);
                ((og0) this.f45097g1.f6337c).a(this.U0.k(), false);
                this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                s6 s6Var11 = this.H1;
                if (s6Var11 != null && !TextUtils.isEmpty(s6Var11.f46090y)) {
                    this.f45086d1.setVisibility(8);
                    this.f45097g1.setVisibility(0);
                    ((og0) this.f45097g1.f6337c).a(true, false);
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f45079b1.setVisibility(0);
            s6 s6Var12 = this.H1;
            if (s6Var12 != null && s6Var12.f46083u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f45094f1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.Y0.setVisibility(0);
            this.U0.setVisibility(0);
            s6 s6Var13 = this.H1;
            if ((s6Var13 != null && s6Var13.J0 != 0) || this.f45133s0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.Z0.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V0.getLayoutParams();
            s6 s6Var14 = this.H1;
            if ((s6Var14 != null && s6Var14.J0 != 0) || this.f45133s0 != 0) {
                f10 = 12.0f;
            } else {
                f10 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f10);
            this.V0.setLayoutParams(layoutParams);
            this.f45102i0.setVisibility(0);
            this.f45102i0.clearFocus();
            s6 s6Var15 = this.H1;
            if (s6Var15 == null) {
                i13 = 86400;
            } else {
                i13 = s6Var15.I0;
            }
            this.Z0.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((s6Var2 = this.H1) == null || !s6Var2.f46057g)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Z0.setPeriodVisible(z4);
            s6 s6Var16 = this.H1;
            if (s6Var16 != null && s6Var16.f46072o0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Z0.setHasRoundVideo(z10);
            r9 r9Var = this.Z0;
            if (r9Var == null) {
                j10 = 0;
            } else {
                s6 s6Var17 = this.H1;
                if (s6Var17 == null || !s6Var17.f46069n) {
                    j10 = 0;
                    r9Var.v(null, null);
                } else {
                    TLRPC.Peer peer = s6Var17.f46075q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        s6 s6Var18 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        s6Var18.f46073p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        s6 s6Var19 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        s6Var19.f46073p = append;
                    }
                    String str3 = this.H1.f46079s;
                    boolean isEmpty = TextUtils.isEmpty(str3);
                    String str4 = str3;
                    if (isEmpty) {
                        SpannableString spannableString = new SpannableString(LocaleController.getString(R.string.Story));
                        spannableString.setSpan(new CharacterStyle(), 0, spannableString.length(), 33);
                        str4 = spannableString;
                    }
                    this.Z0.v(str4, append);
                }
            }
            s6 s6Var20 = this.H1;
            if (s6Var20 != null && s6Var20.v() && this.H1.t()) {
                z11 = false;
            } else {
                z11 = true;
            }
            ma maVar = this.W0;
            boolean z21 = maVar.f45704g0;
            maVar.f45704g0 = z11;
            maVar.f45702f0.f(z11, true);
            maVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.m0.setVisibility(0);
            this.f45126q1.setVisibility(0);
            s6 s6Var21 = this.H1;
            if (s6Var21 != null && s6Var21.f46045b0) {
                this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f45102i0.setVisibility(0);
            this.f45130r1.setVisibility(0);
        }
        if (i11 == 2) {
            this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.K1 = false;
            s6 s6Var22 = this.H1;
            if (s6Var22 != null && s6Var22.J0 != j10) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (s6Var22 != null && s6Var22.f46057g) {
                z16 = true;
            } else {
                z16 = false;
            }
            if (z16) {
                i14 = R.string.Done;
            } else if (z15) {
                i14 = R.string.UploadBotPreview;
            } else {
                i14 = R.string.Next;
            }
            String string = LocaleController.getString(i14);
            boolean z22 = !z15;
            e5 e5Var = this.Y0;
            if (!TextUtils.equals(string, e5Var.d) || z22 != e5Var.f45248e) {
                e5Var.removeView(e5Var.f45247c);
                Context context = e5Var.getContext();
                e5Var.d = string;
                e5Var.f45248e = z22;
                d5 d5Var = new d5(e5Var, context, string, z22);
                e5Var.f45247c = d5Var;
                d5Var.setContentDescription(string);
                e5Var.addView(e5Var.f45247c, k7.c6.c(-2.0f, -2));
                e5Var.e();
            }
            this.f45126q1.setVisibility(8);
            this.f45130r1.setVisibility(8);
            if (!this.f45091e2) {
                s6 s6Var23 = this.H1;
                if (s6Var23 != null && s6Var23.f46083u) {
                    this.U0.l(s6Var23);
                } else {
                    this.U0.set(s6Var23);
                }
            }
            this.f45091e2 = false;
            xt editText = this.Z0.f45517f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                g8Var = null;
            } else {
                g8Var = new g8(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(g8Var);
            if (this.E1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f45076a1.setVisibility(i15);
            ArrayList arrayList = this.E1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.G1;
                ArrayList arrayList3 = this.F1;
                u8 u8Var = this.f45076a1;
                u8Var.c(false, false);
                u8Var.f45936c = arrayList;
                u8Var.d = arrayList2;
                u8Var.f45937e = arrayList3;
                u8Var.f45942w = new l01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                u8Var.H = new l01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                u8Var.f45935b.V2.N(false);
                this.f45076a1.setSelected(this.E1.indexOf(this.H1));
            }
            if (!z15 && !z16 && this.E1 == null && ((s6Var8 = this.H1) == null || (!s6Var8.v() && this.H1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.W0.setMaxCount(i16);
            if (i10 != 2) {
                s6 s6Var24 = this.H1;
                if (s6Var24 != null && (s6Var24.f46047c || s6Var24.f46057g || this.f45129r0)) {
                    if (s6Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    s6 s6Var25 = this.H1;
                    if (s6Var25.K && s6Var25.f46043a1 != null && (textureView = this.U0.getTextureView()) != null) {
                        textureView.setDelegate(new o8(this, 7));
                    }
                    this.Z0.setText(this.H1.C0);
                } else if (i10 != 2) {
                    r9 r9Var2 = this.Z0;
                    r9Var2.S = true;
                    r9Var2.f45517f.setText("");
                }
            }
            s6 s6Var26 = this.H1;
            if (s6Var26 != null && ((s6Var26.f46083u && !s6Var26.K) || s6Var26.v())) {
                z17 = false;
            } else {
                z17 = true;
            }
            this.Y0.d(4, z17);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (s6Var7 = this.H1) != null && !s6Var7.f46083u && !s6Var7.v()) {
                z18 = true;
            } else {
                z18 = false;
            }
            this.Y0.d(3, z18);
            if (!this.K1 && !this.Z0.o()) {
                oh.t6 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                oh.n6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.f17770a, B) || ((s6Var6 = this.H1) != null && (s6Var6.f46057g || s6Var6.J0 != j10))) {
                    z19 = true;
                    this.Y0.setShareEnabled(z19);
                    s6Var4 = this.H1;
                    if (s6Var4 == null && s6Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f45086d1.setImageResource(i17);
                    this.U0.setVisibility(0);
                    this.W0.setVisibility(0);
                    this.m0.setVisibility(0);
                    this.m0.setTranslationX(0.0f);
                    s6Var5 = this.H1;
                    if (s6Var5 == null && s6Var5.J0 != j10) {
                        this.m0.l("", false);
                    } else if (s6Var5 == null && s6Var5.f46057g) {
                        this.m0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (s6Var5 == null && s6Var5.f46083u) {
                        this.m0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (s6Var5 == null && s6Var5.f46069n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(this.m0, 32.0f, i18);
                        this.m0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(i5Var, 0, 1, 33);
                        if (this.H1.f46075q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.H1.f46075q.user_id));
                            i5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.H1.f46075q)));
                            i5Var.b(chat2);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            if (chat2 != null) {
                                str2 = chat2.title;
                            }
                            spannableStringBuilder.append((CharSequence) str2);
                        }
                        this.m0.l(spannableStringBuilder, false);
                    } else {
                        this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
                    }
                    z20 = true;
                }
            }
            z19 = false;
            this.Y0.setShareEnabled(z19);
            s6Var4 = this.H1;
            if (s6Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f45086d1.setImageResource(i17);
            this.U0.setVisibility(0);
            this.W0.setVisibility(0);
            this.m0.setVisibility(0);
            this.m0.setTranslationX(0.0f);
            s6Var5 = this.H1;
            if (s6Var5 == null) {
            }
            if (s6Var5 == null) {
            }
            if (s6Var5 == null) {
            }
            if (s6Var5 == null) {
            }
            this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z20 = true;
        }
        if (i10 == z20) {
            r9 r9Var3 = this.Z0;
            q70 q70Var = r9Var3.S0;
            if (q70Var != null) {
                q70Var.u();
                r9Var3.S0 = null;
            }
            this.f45100h1.e(z20);
            u8 u8Var2 = this.f45076a1;
            if (u8Var2.J) {
                u8Var2.c(false, z20);
            }
        }
        if (i11 == 2 && (s6Var3 = this.H1) != null) {
            if (s6Var3.f46053e0 < j10) {
                s6Var3.f46053e0 = j10;
            }
            this.J1 = s6Var3.f46053e0;
            if (this.U0.getDuration() < 100) {
                duration = this.H1.f46059h0;
            } else {
                duration = this.U0.getDuration();
            }
            s6 s6Var27 = this.H1;
            if (s6Var27.f46059h0 <= 0) {
                s6Var27.f46059h0 = duration;
            }
            File file = s6Var27.Z0;
            if (file == null) {
                file = s6Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            s6 s6Var28 = this.H1;
            this.f45126q1.o(false, absolutePath, s6Var28.f46059h0, s6Var28.P);
            s6 s6Var29 = this.H1;
            float f11 = (float) duration;
            long j11 = s6Var29.Z * f11;
            long j12 = s6Var29.f46042a0 * f11;
            ma maVar2 = this.f45126q1;
            maVar2.W0 = j11;
            maVar2.X0 = j12;
            ha haVar = maVar2.h;
            if (haVar != null) {
                ha.a(haVar, true);
            }
            d4 d4Var = new d4(this, 3);
            this.f45126q1.setDelegate(new d9(d4Var));
            float max = (((float) this.J1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f45126q1.setVideoLeft(max);
            this.f45126q1.setVideoRight(0.04f + max);
            d4Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        nf0 nf0Var = this.f45158z1;
        if (nf0Var != null) {
            nf0Var.setAllowTouch(false);
        }
        f3 f3Var2 = this.f45106j1;
        boolean z23 = true;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
        ic.e();
        r9 r9Var4 = this.Z0;
        if (r9Var4 != null) {
            f fVar = r9Var4.f45517f;
            fVar.d();
            fVar.k(true);
            this.Z0.f45511b0 = true;
        }
        q9 q9Var = this.U0;
        if (q9Var != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            q9Var.x(8, z14);
        }
        f9 f9Var = this.f45134s1;
        if (f9Var != null) {
            if (i11 != 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            f9Var.setCoverPreview(z13);
        }
        f3 f3Var3 = this.f45109k1;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        p9 p9Var2 = this.f45150x0;
        p9Var2.setPreview((i11 == 1 && p9Var2.j()) ? false : false);
    }

    public final void P() {
        dg.m1 m1Var;
        int i10;
        if (this.f45082c0 == 0) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f45141u2 = new g8(this, 3);
            } else {
                Z(false);
            }
        }
        r9 r9Var = this.Z0;
        if (r9Var != null) {
            r9Var.f45517f.s();
        }
        r5 r5Var = this.L0;
        if (r5Var != null) {
            r5Var.h();
        }
        f5 f5Var = this.l1;
        if (f5Var != null) {
            oh.t6 storiesController = MessagesController.getInstance(f5Var.f45324a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f17776i.f(UserConfig.getInstance(storiesController.f17770a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            f5Var.f45325b = storiesController.f17771b.m() + i10 + 1;
            f5Var.f45326c.invalidate();
        }
        f9 f9Var = this.f45134s1;
        if (f9Var != null && (m1Var = f9Var.L0.d) != null) {
            m1Var.postRunnable(m1Var.f4613w);
        }
        q9 q9Var = this.U0;
        if (q9Var != null) {
            q9Var.x(0, false);
        }
        t0 t0Var = MessagesController.getInstance(this.f45081c).getStoriesController().f17789w;
        if (!t0Var.f46104c && !t0Var.d) {
            t0Var.d = true;
            q0 q0Var = new q0(t0Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(t0Var.f46102a);
            messagesStorage.getStorageQueue().postRunnable(new xq0((Object) messagesStorage, false, (Object) q0Var, 8));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z4;
        f9 f9Var;
        l9 l9Var;
        m9 m9Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        f9 f9Var2;
        if (i11 == 0) {
            this.f45108k0.setVisibility(8);
        }
        if (i10 == 0 && (f9Var2 = this.f45134s1) != null) {
            f9Var2.setVisibility(8);
        }
        if (i10 == -1) {
            this.Z0.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f45086d1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f45097g1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f45079b1.setVisibility(i14);
            ImageView imageView = this.f45094f1;
            if (imageView != null) {
                if (i11 == 2) {
                    i16 = 0;
                } else {
                    i16 = 8;
                }
                imageView.setVisibility(i16);
            }
            if (i11 == 2) {
                i15 = 0;
            } else {
                i15 = 8;
            }
            this.W0.setVisibility(i15);
            this.m0.setVisibility(8);
        }
        boolean z10 = true;
        if (i11 == -1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.U0.setAllowCropping(z4);
        if ((i11 == 0 || i10 == 0) && (f9Var = this.f45134s1) != null) {
            f9Var.f44945a1.setLayerType(0, null);
        }
        nf0 nf0Var = this.f45158z1;
        if (nf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            nf0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            l9 l9Var2 = this.f45120o1;
            if (l9Var2 != null) {
                l9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (l9Var = this.f45120o1) != null) {
            l9Var.setVisibility(8);
            this.f45120o1.setAppearProgress(0.0f);
            l9 l9Var3 = this.f45120o1;
            l9Var3.f45042x = null;
            a0 a0Var = l9Var3.f45037f;
            a0Var.I = null;
            a0Var.d = null;
            a0Var.G = false;
            l9Var3.d.setVisibility(8);
            l9Var3.f45033a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            m9 m9Var2 = this.f45123p1;
            if (m9Var2 != null) {
                m9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (m9Var = this.f45123p1) != null) {
            m9Var.setVisibility(8);
            this.f45123p1.setAppearProgress(0.0f);
            m9 m9Var3 = this.f45123p1;
            m9Var3.f45273b = null;
            a0 a0Var2 = m9Var3.h;
            a0Var2.I = null;
            a0Var2.d = null;
            a0Var2.G = false;
            m9Var3.f45275e.setVisibility(8);
            m9Var3.setVisibility(8);
        }
    }

    public final void R(w9 w9Var) {
        oh.n6 o10;
        ba baVar;
        if (this.d) {
            return;
        }
        int i10 = this.f45081c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        int i11 = 0;
        this.f45129r0 = false;
        this.f45088e = false;
        this.f45156y2 = false;
        this.f45122p0.f45427g = false;
        WindowManager windowManager = this.f45092f;
        if (windowManager != null && (baVar = this.f45115n) != null && baVar.getParent() == null) {
            ba baVar2 = this.f45115n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, baVar2, layoutParams);
            windowManager.addView(this.f45115n, layoutParams);
            g0();
        }
        this.f45150x0.setCameraThumb(A());
        if (this.f45133s0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.E;
        if (w9Var != null) {
            this.C = w9Var;
            this.G = w9Var.f46303a;
            rectF.set(w9Var.f46305c);
            this.D = w9Var.f46304b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f45128r.c();
        int i12 = this.G;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f45089e0.setBackgroundColor(i11);
        this.f45128r.setTranslationX(0.0f);
        this.f45128r.setTranslationY(0.0f);
        this.f45128r.b(0.0f);
        this.f45128r.setScaleX(1.0f);
        this.f45128r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f45077b, 1);
        g(1.0f, true, new g8(this, 6));
        e();
        this.f45133s0 = 0L;
        this.f45136t0 = "";
    }

    public final void S(u9 u9Var, s6 s6Var, long j10) {
        int i10;
        ba baVar;
        if (this.d) {
            return;
        }
        int i11 = this.f45081c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.c.b(i11);
            return;
        }
        this.f45129r0 = false;
        this.f45088e = false;
        this.f45156y2 = false;
        WindowManager windowManager = this.f45092f;
        if (windowManager != null && (baVar = this.f45115n) != null && baVar.getParent() == null) {
            ba baVar2 = this.f45115n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, baVar2, layoutParams);
            windowManager.addView(this.f45115n, layoutParams);
            g0();
        }
        this.H1 = s6Var;
        this.L1 = s6Var.K ? 1 : 0;
        this.f45122p0.f45427g = false;
        RectF rectF = this.E;
        if (u9Var != null) {
            this.C = u9Var;
            this.G = u9Var.f46303a;
            rectF.set(u9Var.f46305c);
            this.D = u9Var.f46304b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f45128r.c();
        int i12 = this.G;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f45089e0.setBackgroundColor(i10);
        this.f45128r.setTranslationX(0.0f);
        this.f45128r.setTranslationY(0.0f);
        this.f45128r.b(0.0f);
        this.f45128r.setScaleX(1.0f);
        this.f45128r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f45077b, 1);
        s6 s6Var2 = this.H1;
        if (s6Var2 != null) {
            this.Z0.setText(s6Var2.C0);
        }
        L(new t8(this, 0), j10);
        if (this.H1.f46045b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.Y0.b(false, false);
        e();
        this.f45133s0 = 0L;
        this.f45136t0 = "";
    }

    public final void T() {
        q70 q70Var;
        q9 q9Var = this.U0;
        if (q9Var != null) {
            q9Var.x(4, true);
        }
        r9 r9Var = this.Z0;
        if (r9Var != null && (q70Var = r9Var.S0) != null) {
            q70Var.u();
            r9Var.S0 = null;
        }
        fg.n1 n1Var = new fg.n1((org.telegram.ui.ActionBar.p2) new h9(this, 1), 14, false);
        n1Var.setOnDismissListener(new s8(this, 1));
        n1Var.show();
    }

    public final void U(u9 u9Var, s6 s6Var) {
        int i10;
        boolean z4;
        int i11;
        oh.n6 o10;
        ba baVar;
        if (this.d) {
            return;
        }
        int i12 = this.f45081c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.c.b(i12);
            return;
        }
        this.f45129r0 = true;
        this.f45088e = false;
        this.f45156y2 = false;
        WindowManager windowManager = this.f45092f;
        if (windowManager != null && (baVar = this.f45115n) != null && baVar.getParent() == null) {
            ba baVar2 = this.f45115n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, baVar2, layoutParams);
            windowManager.addView(this.f45115n, layoutParams);
            g0();
        }
        this.H1 = s6Var;
        f8.a(i12, s6Var);
        s6 s6Var2 = this.H1;
        if (s6Var2 != null && s6Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.L1 = i10;
        if (s6Var2 != null && s6Var2.f46083u && i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f45122p0.f45427g = z4;
        if (this.f45133s0 == 0 && (o10 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o10.a(i12, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.E;
        if (u9Var != null) {
            this.C = u9Var;
            this.G = u9Var.f46303a;
            rectF.set(u9Var.f46305c);
            this.D = u9Var.f46304b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f45128r.c();
        int i13 = this.G;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f45089e0.setBackgroundColor(i11);
        this.f45128r.setTranslationX(0.0f);
        this.f45128r.setTranslationY(0.0f);
        this.f45128r.b(0.0f);
        this.f45128r.setScaleX(1.0f);
        this.f45128r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f45077b, 1);
        s6 s6Var3 = this.H1;
        if (s6Var3 != null) {
            this.Z0.setText(s6Var3.C0);
        }
        this.Y0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new g8(this, 6));
        e();
        this.f45133s0 = 0L;
        this.f45136t0 = "";
    }

    public final void V() {
        dg.o1 o1Var = this.f45137t1;
        if (o1Var != null) {
            o1Var.bringToFront();
        }
        View view = this.f45140u1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f45143v1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f45147w1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.f45151x1;
        if (view4 != null) {
            view4.bringToFront();
        }
        pa paVar = this.f45113m1;
        if (paVar != null) {
            paVar.bringToFront();
        }
        nf0 nf0Var = this.f45158z1;
        if (nf0Var != null) {
            nf0Var.bringToFront();
        }
        ef0 ef0Var = this.B1;
        if (ef0Var != null) {
            ef0Var.bringToFront();
        }
        gf0 gf0Var = this.C1;
        if (gf0Var != null) {
            gf0Var.bringToFront();
        }
        f5 f5Var = this.l1;
        if (f5Var != null) {
            f5Var.bringToFront();
        }
        n nVar = this.f45117n1;
        if (nVar != null) {
            nVar.bringToFront();
        }
    }

    public final void W(s6 s6Var, boolean z4) {
        File file;
        View view;
        float f10;
        s6 s6Var2;
        boolean z10;
        int i10;
        if (s6Var != null && this.U0.getWidth() > 0 && this.U0.getHeight() > 0) {
            if (z4) {
                file = s6Var.O0;
            } else {
                file = s6Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.f45150x0.j()) {
                view = this.f45150x0;
            } else {
                view = this.U0;
            }
            if (z4) {
                f10 = 0.33333334f;
            } else {
                f10 = 1.0f;
            }
            int width = (int) (view.getWidth() * f10);
            Bitmap createBitmap = Bitmap.createBitmap(width, (int) (view.getHeight() * f10), Bitmap.Config.RGB_565);
            Canvas canvas = new Canvas(createBitmap);
            canvas.save();
            canvas.scale(f10, f10);
            AndroidUtilities.makingGlobalBlurBitmap = true;
            view.draw(canvas);
            AndroidUtilities.makingGlobalBlurBitmap = false;
            canvas.restore();
            Paint paint = new Paint(2);
            y61 textureView = this.U0.getTextureView();
            if (s6Var.K && !s6Var.f46083u && textureView != null) {
                Bitmap bitmap = textureView.getBitmap();
                Matrix transform = textureView.getTransform(null);
                if (transform != null) {
                    Matrix matrix = new Matrix(transform);
                    matrix.postScale(f10, f10);
                    transform = matrix;
                }
                canvas.drawBitmap(bitmap, transform, paint);
                bitmap.recycle();
            }
            File file2 = s6Var.Q0;
            if (file2 != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                    canvas.save();
                    float width2 = width / decodeFile.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile.recycle();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            File file3 = s6Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            f9 f9Var = this.f45134s1;
            if (f9Var != null && f9Var.O0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                f9 f9Var2 = this.f45134s1;
                f9Var2.F0 = true;
                w4 w4Var = f9Var2.O0;
                w4Var.f5143a = true;
                w4Var.draw(canvas);
                f9 f9Var3 = this.f45134s1;
                f9Var3.O0.f5143a = false;
                f9Var3.F0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = s6.w(this.f45081c, "jpg");
            if (z4) {
                s6Var2 = s6Var;
                z10 = z4;
                Utilities.searchQueue.postRunnable(new hg.j(this, createBitmap, z10, w10, s6Var2, 21));
            } else {
                s6Var2 = s6Var;
                z10 = z4;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z10) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w10));
                } catch (Exception e11) {
                    FileLog.e(e11);
                }
            }
            if (!z10) {
                s6Var2.N0 = w10;
            }
            s6Var2.f46046b1 = createScaledBitmap;
        }
    }

    public final void X() {
        oh.n6 o10;
        int size;
        char c3;
        View[] viewPages;
        q51[] q51VarArr;
        d8 d8Var = this.f45116n0;
        BitmapDrawable bitmapDrawable = null;
        if (d8Var != null) {
            d8Var.dismiss();
            this.f45116n0 = null;
        }
        if (this.K1) {
            n0 n0Var = this.f45079b1;
            n0Var.getClass();
            n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            d5 d5Var = this.Y0.f45247c;
            int i10 = -this.R1;
            this.R1 = i10;
            AndroidUtilities.shakeViewSpring(d5Var, i10);
            return;
        }
        r9 r9Var = this.Z0;
        if (r9Var != null && r9Var.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.k6 k6Var = r9Var.v;
            int i11 = -this.R1;
            this.R1 = i11;
            AndroidUtilities.shakeViewSpring(k6Var, i11);
            r9Var.e();
            return;
        }
        s6 s6Var = this.H1;
        int i12 = this.f45081c;
        if ((s6Var == null || (!s6Var.f46057g && s6Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.H1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        oh.b bVar = this.f45074a;
        if (r9Var != null && !this.H1.D0) {
            CharSequence text = r9Var.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((u01[]) spannable.getSpans(0, text.length(), u01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new qc(this.f45115n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.k6.f21720gc, 0, new g8(this, 27), bVar)).k(true);
                    int i13 = -this.R1;
                    this.R1 = i13;
                    AndroidUtilities.shakeViewSpring(r9Var, i13);
                    return;
                }
            }
        }
        s6 s6Var2 = this.H1;
        if (!s6Var2.f46057g && s6Var2.J0 == 0) {
            if (this.K != 0) {
                s6Var2.f46085v0 = MessagesController.getInstance(i12).getInputPeer(this.K);
            }
            q9 q9Var = this.U0;
            q9Var.x(3, true);
            d8 d8Var2 = new d8(this.f45077b, this.H1.I0, bVar);
            d8Var2.q1(this.H1.E0);
            d8Var2.p1(this.H1.f46085v0);
            d8Var2.C = this.J;
            d8Var2.R = new h8(this, 14);
            d8Var2.e1(!this.f45150x0.j());
            ArrayList arrayList = this.F1;
            if (arrayList == null) {
                size = this.H1.r();
            } else {
                size = arrayList.size();
            }
            d8Var2.m1(size);
            d8Var2.k1(false);
            CharSequence text2 = r9Var.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (q51 q51Var : (q51[]) ((Spanned) text2).getSpans(0, text2.length(), q51.class)) {
                    if (q51Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(q51Var.getURL())));
                            if (user != null && !UserObject.isUserSelf(user) && UserObject.getPublicUsername(user) != null && !arrayList2.contains(user)) {
                                arrayList2.add(UserObject.getPublicUsername(user));
                            }
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            if (text2 != null) {
                int i14 = -1;
                for (int i15 = 0; i15 < text2.length(); i15++) {
                    char charAt = text2.charAt(i15);
                    if (charAt == '@') {
                        i14 = i15 + 1;
                    } else if (charAt == ' ') {
                        if (i14 != -1) {
                            String charSequence = text2.subSequence(i14, i15).toString();
                            TLObject userOrChat = MessagesController.getInstance(i12).getUserOrChat(charSequence);
                            if (userOrChat instanceof TLRPC.User) {
                                TLRPC.User user2 = (TLRPC.User) userOrChat;
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f20990id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
                                    arrayList2.add(charSequence);
                                }
                            }
                        }
                        i14 = -1;
                    }
                }
                c3 = 1;
                if (i14 != -1) {
                    String charSequence2 = text2.subSequence(i14, text2.length()).toString();
                    TLObject userOrChat2 = MessagesController.getInstance(i12).getUserOrChat(charSequence2);
                    if (userOrChat2 instanceof TLRPC.User) {
                        TLRPC.User user3 = (TLRPC.User) userOrChat2;
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f20990id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c3 = 1;
            }
            d8Var2.P = arrayList2;
            d8Var2.T = new h8(this, 15);
            d8Var2.U = new h8(this, 16);
            d8Var2.Q = new o8(this, 10);
            this.f45116n0 = d8Var2;
            s6 s6Var3 = this.H1;
            if (s6Var3.K) {
                if (q9Var != null && !s6Var3.f46056f0 && this.f45082c0 != 2) {
                    s6Var3.f46053e0 = q9Var.getCurrentPosition();
                    Utilities.Callback h8Var = new h8(this, 17);
                    View view = this.f45137t1;
                    View view2 = this.f45147w1;
                    View[] viewArr = new View[3];
                    viewArr[0] = q9Var;
                    viewArr[c3] = view;
                    viewArr[2] = view2;
                    q9Var.h(h8Var, viewArr);
                }
                d8 d8Var3 = this.f45116n0;
                Bitmap bitmap = this.H1.f46058g0;
                g8 g8Var = new g8(this, 20);
                if (bitmap != null) {
                    d8Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                d8Var3.Y = bitmapDrawable;
                d8Var3.Z = g8Var;
                ek ekVar = d8Var3.f45222b;
                if (ekVar != null) {
                    for (View view3 : ekVar.getViewPages()) {
                        if (view3 instanceof x7) {
                            x7 x7Var = (x7) view3;
                            x7Var.g(false);
                            x7Var.e(false);
                        }
                    }
                }
            }
            this.f45116n0.setOnDismissListener(new s8(this, 0));
            this.f45116n0.show();
            return;
        }
        s6Var2.f46066l = false;
        i(null);
        p0();
    }

    public final void Y(x9 x9Var) {
        int i10 = 0;
        RectF rectF = this.E;
        if (x9Var != null) {
            this.C = x9Var;
            this.G = x9Var.f46303a;
            rectF.set(x9Var.f46305c);
            this.D = x9Var.f46304b;
        } else {
            this.C = null;
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        int i11 = this.G;
        if (i11 != 1 && i11 != 0) {
            i10 = -14737633;
        }
        this.f45089e0.setBackgroundColor(i10);
    }

    public final void Z(boolean z4) {
        Activity activity;
        boolean z10;
        if (!this.f45138t2 || z4) {
            this.f45124p2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f45077b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f45124p2 = z10;
                if (z10) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    pq pqVar = new pq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    pqVar.f30168e = dp;
                    pqVar.f30169f = dp2;
                    this.f45150x0.setCameraThumb(pqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f45074a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
                        alertDialog$Builder.f21166a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new o8(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f21166a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f45138t2 = true;
                }
            }
            if (!this.f45124p2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new g8(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        g9 g9Var = this.f45154y0;
        if (g9Var != null && g9Var.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new o71(this, this.f45154y0.getTextureView().getBitmap(), runnable, 20));
            } catch (Throwable unused) {
            }
        }
    }

    public final void c0(View view, boolean z4, boolean z10) {
        if (view == null) {
            return;
        }
        float f10 = 0.0f;
        int i10 = 0;
        if (z10) {
            view.setVisibility(0);
            ViewPropertyAnimator animate = view.animate();
            if (z4) {
                f10 = 1.0f;
            }
            animate.alpha(f10).setUpdateListener(new e9(this, 1)).setListener(new androidx.fragment.app.g(this, z4, view, 13)).setDuration(320L).setInterpolator(pr.h).start();
            return;
        }
        view.animate().cancel();
        if (!z4) {
            i10 = 8;
        }
        view.setVisibility(i10);
        if (z4) {
            f10 = 1.0f;
        }
        view.setAlpha(f10);
        n0();
    }

    public final void d0(boolean z4) {
        WindowManager.LayoutParams layoutParams = this.h;
        if (z4) {
            layoutParams.flags |= 128;
        } else {
            layoutParams.flags &= -129;
        }
        try {
            this.f45092f.updateViewLayout(this.f45115n, layoutParams);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oh.n6 o10;
        s6 s6Var;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            r5 r5Var = this.L0;
            if (r5Var != null) {
                r5Var.h();
            }
            if (this.f45107j2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f45107j2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f45107j2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            r5 r5Var2 = this.L0;
            if (r5Var2 != null && !this.S1) {
                r5Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f45082c0;
            int i15 = this.f45081c;
            if (i14 == 1) {
                if (!this.K1 && !this.Z0.o()) {
                    oh.t6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    oh.n6 o11 = storiesController.o();
                    if (o11 == null || !o11.a(storiesController.f17770a, B) || ((s6Var = this.H1) != null && (s6Var.f46057g || s6Var.J0 != 0))) {
                        z4 = true;
                    }
                }
                this.Y0.setShareEnabled(z4);
            } else if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                s6 s6Var2 = this.H1;
                if (s6Var2 == null || s6Var2.J0 == 0) {
                    h0(o10, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f45081c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.B0.clearAnimation();
        g9 g9Var = this.f45154y0;
        if ((g9Var != null && g9Var.isDual()) || this.X1) {
            str = null;
        }
        this.V1 = str;
        boolean z4 = false;
        if (str == null) {
            c0(this.B0, false, true);
            return;
        }
        int hashCode = str.hashCode();
        if (hashCode != 3551) {
            if (hashCode != 109935) {
                if (hashCode == 3005871 && str.equals("auto")) {
                    i10 = R.drawable.media_photo_flash_auto2;
                    this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashAuto));
                }
            } else {
                str.equals("off");
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        } else {
            if (str.equals("on")) {
                i10 = R.drawable.media_photo_flash_on2;
                this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOn));
            }
            i10 = R.drawable.media_photo_flash_off2;
            this.B0.setContentDescription(LocaleController.getString(R.string.AccDescrCameraFlashOff));
        }
        na naVar = this.B0;
        if (naVar.f45803n != i10) {
            naVar.f45803n = i10;
            ValueAnimator valueAnimator = naVar.f45804r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                naVar.f45804r = null;
            }
            naVar.setDrawable(i10);
        }
        if (this.f45082c0 == 0 && !this.F0.f46137e && this.V1 != null && !I()) {
            z4 = true;
        }
        c0(this.B0, z4, true);
    }

    public final void f(boolean z4) {
        float height;
        boolean z10;
        int i10;
        o0 o0Var;
        this.H0 = z4;
        Boolean bool = this.f45114m2;
        if (bool == null || bool.booleanValue() != z4) {
            if (this.J0 == null) {
                if (z4) {
                    t(false);
                }
                if (this.J0 == null) {
                    return;
                }
            }
            if (this.J0.R) {
                this.f45118n2 = new p8(this, z4, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f45110k2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f45110k2 = null;
            }
            o1.j jVar = this.f45112l2;
            if (jVar != null) {
                jVar.c();
                this.f45112l2 = null;
            }
            if (this.J0 == null) {
                if (z4) {
                    t(false);
                }
                if (this.J0 == null) {
                    return;
                }
            }
            c9 c9Var = this.J0;
            if (c9Var != null) {
                c9Var.H = false;
            }
            if (z4 && (o0Var = this.K0) != null) {
                o0Var.a(false);
            }
            int i11 = 4;
            t9 t9Var = this.f45128r;
            if (t9Var != null) {
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                t9Var.setImportantForAccessibility(i10);
            }
            c9 c9Var2 = this.J0;
            if (z4) {
                i11 = 0;
            }
            c9Var2.setImportantForAccessibility(i11);
            this.f45114m2 = Boolean.valueOf(z4);
            float translationY = this.J0.getTranslationY();
            ba baVar = this.f45115n;
            if (z4) {
                height = 0.0f;
            } else {
                height = (baVar.getHeight() - this.J0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, baVar.getHeight());
            c9 c9Var3 = this.J0;
            c9Var3.H = !z4;
            if (this.f45098g2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f45101h2 = z10;
            if (z4) {
                o1.j jVar2 = new o1.j(c9Var3, o1.h.f16319n, height);
                this.f45112l2 = jVar2;
                jVar2.f16336u.a(0.75f);
                this.f45112l2.f16336u.b(350.0f);
                this.f45112l2.a(new kg0(this, height, 1));
                this.f45112l2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f45110k2 = ofFloat;
                ofFloat.addUpdateListener(new q8(this, 0));
                this.f45110k2.addListener(new b9(this, 1));
                this.f45110k2.setDuration(450L);
                this.f45110k2.setInterpolator(pr.h);
                this.f45110k2.start();
            }
            if (!z4 && !this.P1) {
                this.f45104i2 = null;
            }
            if (!z4 && this.f45082c0 == 0 && !this.f45124p2) {
                r();
            }
        }
    }

    public final void f0(boolean z4, boolean z10) {
        if (this.f45083c1 == null) {
            ij0 ij0Var = new ij0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f45083c1 = ij0Var;
            ij0Var.C *= 1.5f;
        }
        this.f45086d1.setAnimation(this.f45083c1);
        int i10 = 20;
        if (!z10) {
            ij0 ij0Var2 = this.f45083c1;
            if (!z4) {
                i10 = 0;
            }
            ij0Var2.L(i10, false, false);
        } else if (z4) {
            ij0 ij0Var3 = this.f45083c1;
            if (ij0Var3.Y > 20) {
                ij0Var3.L(0, false, false);
            }
            this.f45083c1.N(20);
            this.f45083c1.start();
        } else {
            ij0 ij0Var4 = this.f45083c1;
            int i11 = ij0Var4.Y;
            if (i11 != 0 && i11 < 43) {
                ij0Var4.N(43);
                this.f45083c1.start();
            }
        }
    }

    public final void g(float f10, boolean z4, Runnable runnable) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        t9 t9Var = this.f45128r;
        if (z4) {
            this.M.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.I = Float.valueOf(this.H);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new q8(this, 5));
            this.B.addListener(new mh.k5(this, f10, runnable, 4));
            if (f10 < 1.0f && this.v) {
                this.B.setDuration(250L);
                this.B.setInterpolator(pr.h);
            } else if (f10 <= 0.0f && t9Var.f46126a >= AndroidUtilities.dp(20.0f)) {
                if (f10 < 0.0f && this.L) {
                    this.B.setDuration(200L);
                    this.B.setInterpolator(pr.h);
                    this.L = false;
                } else {
                    this.B.setDuration(400L);
                    this.B.setInterpolator(pr.h);
                }
            } else {
                this.B.setDuration(300L);
                this.B.setInterpolator(new u1.a());
            }
            this.B.start();
            return;
        }
        this.I = null;
        this.F = f10;
        k();
        t9Var.invalidate();
        this.f45115n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f45115n.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(0, new androidx.activity.r(this, 4));
    }

    public final void h(boolean z4, boolean z10) {
        float f10;
        float dp;
        float dp2;
        float f11;
        float dp3;
        float dp4;
        u uVar;
        if (z4) {
            f3 f3Var = this.f45103i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            f3 f3Var2 = this.f45106j1;
            if (f3Var2 != null) {
                f3Var2.e(true);
            }
            f3 f3Var3 = this.f45100h1;
            if (f3Var3 != null) {
                f3Var3.e(true);
            }
            f3 f3Var4 = this.T0;
            if (f3Var4 != null) {
                f3Var4.e(true);
            }
        }
        if (this.X1 == z4 && this.Y1 == I()) {
            return;
        }
        AnimatorSet animatorSet = this.W1;
        if (animatorSet != null) {
            animatorSet.cancel();
            this.W1 = null;
        }
        this.X1 = z4;
        this.Y1 = I();
        if (z4 && (uVar = this.F0) != null && uVar.f46137e) {
            uVar.a(false, z10);
        }
        m0(z10);
        v8 v8Var = this.N0;
        e3 e3Var = this.R0;
        e3 e3Var2 = this.Q0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.W1 = animatorSet2;
            Property property = View.ALPHA;
            if (z4 && this.f45082c0 == 0 && !I()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z4 && this.f45082c0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e3Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(e3Var, property, (!z4 && this.f45082c0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z4 && this.f45082c0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(e3Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(v8Var, property, (z4 || this.f45082c0 != 0 || I()) ? 0.0f : 0.0f);
            if (z4 || this.f45082c0 != 0 || I()) {
                f14 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(v8Var, property2, f14));
            this.W1.setDuration(260L);
            this.W1.setInterpolator(pr.h);
            this.W1.start();
            return;
        }
        if (z4 && this.f45082c0 == 0 && !I()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e3Var2.setAlpha(f10);
        if (z4 && this.f45082c0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        e3Var2.setTranslationY(dp);
        e3Var.setAlpha((!z4 && this.f45082c0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z4 && this.f45082c0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        e3Var.setTranslationY(dp2);
        v8Var.setAlpha((z4 || this.f45082c0 != 0 || I()) ? 0.0f : 0.0f);
        if (z4 || this.f45082c0 != 0 || I()) {
            f14 = AndroidUtilities.dp(16.0f);
        }
        v8Var.setTranslationY(f14);
    }

    public final void h0(oh.n6 n6Var, boolean z4) {
        if (this.f45148w2) {
            return;
        }
        fg.v0 v0Var = new fg.v0(n6Var.b(), this.f45081c, this.f45077b, new h9(this, 0), null);
        v0Var.U = B();
        v0Var.setOnDismissListener(new f80(2, this, z4));
        this.U0.x(7, true);
        this.f45148w2 = true;
        v0Var.show();
    }

    public final void i(Runnable runnable) {
        s6 s6Var;
        Runnable runnable2;
        q9 q9Var;
        float f10;
        boolean z4;
        Bitmap.CompressFormat compressFormat;
        pf0 pf0Var = this.f45155y1;
        if (pf0Var != null && (s6Var = this.H1) != null) {
            s6Var.f46062j = pf0Var.d() | s6Var.f46062j;
            s6 s6Var2 = this.H1;
            pf0 pf0Var2 = this.f45155y1;
            File file = s6Var2.Z0;
            if (file != null) {
                file.delete();
                s6Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = pf0Var2.getSavedFilterState();
            s6Var2.f46043a1 = savedFilterState;
            if (!s6Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = pf0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = s6Var2.R;
                        float f11 = 1.0f;
                        if (i10 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i10 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, s6Var2.f46065k0 / 2.0f, s6Var2.f46067l0 / 2.0f);
                        matrix.postRotate(-s6Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        s6Var2.f46070n0.preScale(s6Var2.f46065k0 / createBitmap.getWidth(), s6Var2.f46067l0 / createBitmap.getHeight());
                        s6Var2.f46065k0 = createBitmap.getWidth();
                        s6Var2.f46067l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = s6Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            s6Var2.Z0.delete();
                        }
                        String k10 = s6.k(s6Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        int i11 = s6Var2.f46041a;
                        if (!z4) {
                            str = "jpg";
                        }
                        s6Var2.Z0 = s6.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(s6Var2.Z0);
                                if (z4) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e6) {
                                FileLog.e(e6);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.themeQueue.postRunnable(new dg.t0(s6Var2, createBitmap, z4, runnable2, 26));
                        }
                    }
                }
                runnable2 = runnable;
            } else {
                runnable2 = runnable;
                if (runnable2 != null) {
                    runnable2.run();
                }
            }
            if (runnable2 == null) {
                s6 s6Var3 = this.H1;
                if (!s6Var3.K && (q9Var = this.U0) != null) {
                    q9Var.set(s6Var3);
                }
            }
        } else if (runnable != null) {
            runnable.run();
        }
    }

    public final void i0(boolean z4, boolean z10) {
        if (this.a2 != z4) {
            this.a2 = z4;
            float f10 = 0.0f;
            if (z10) {
                ViewPropertyAnimator animate = this.G0.animate();
                if (z4) {
                    f10 = 1.0f;
                }
                animate.alpha(f10).setDuration(350L).setInterpolator(pr.h).withEndAction(new p8(this, z4, 1)).start();
                return;
            }
            this.G0.clearAnimation();
            if (z4) {
                f10 = 1.0f;
            }
            this.G0.setAlpha(f10);
            if (!z4) {
                this.G0.b(false, false);
            }
        }
    }

    public final void j() {
        if (this.H1 != null && this.A1 != null && this.f45089e0.getMeasuredWidth() > 0 && this.f45089e0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.H1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f45089e0.getMeasuredWidth() / 2.0f, this.f45089e0.getMeasuredHeight() / 2.0f);
                if ((this.H1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f45089e0.getMeasuredWidth() / this.f45089e0.getMeasuredHeight(), this.f45089e0.getMeasuredHeight() / this.f45089e0.getMeasuredWidth(), this.f45089e0.getMeasuredWidth() / 2.0f, this.f45089e0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f45089e0.getMeasuredWidth()) * this.H1.f46065k0, (1.0f / this.f45089e0.getMeasuredHeight()) * this.H1.f46067l0);
            matrix.postConcat(this.H1.f46070n0);
            matrix.postScale(this.f45089e0.getMeasuredWidth() / this.H1.f46061i0, this.f45089e0.getMeasuredHeight() / this.H1.f46063j0);
            this.A1.setTransform(matrix);
            this.A1.invalidate();
        }
    }

    public final void j0(boolean z4) {
        Integer num;
        float f10;
        i91 i91Var = this.S0;
        if ((i91Var.getTag() != null && z4) || (i91Var.getTag() == null && !z4)) {
            if (z4) {
                Runnable runnable = this.f45080b2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                g8 g8Var = new g8(this, 25);
                this.f45080b2 = g8Var;
                AndroidUtilities.runOnUIThread(g8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f45084c2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        i91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45084c2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z4) {
            i91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f45084c2;
        Property property = View.ALPHA;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(i91Var, property, f10));
        this.f45084c2.addListener(new qd1(13, this, z4));
        this.f45084c2.start();
        if (z4) {
            g8 g8Var2 = new g8(this, 26);
            this.f45080b2 = g8Var2;
            AndroidUtilities.runOnUIThread(g8Var2, 2000L);
        }
    }

    public final void k() {
        oh.j3 j3Var;
        if (this.G == 1) {
            RectF rectF = this.f45075a0;
            rectF.set(this.f45089e0.getLeft(), this.f45089e0.getTop(), this.f45089e0.getMeasuredWidth(), this.f45089e0.getMeasuredHeight());
            rectF.offset(this.f45128r.getX(), this.f45128r.getY());
            float f10 = this.F;
            RectF rectF2 = this.E;
            RectF rectF3 = this.Z;
            AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
            this.f45089e0.setAlpha(this.F);
            float f11 = rectF3.left;
            n9 n9Var = this.f45089e0;
            n9Var.setTranslationX((f11 - n9Var.getLeft()) - this.f45128r.getX());
            float f12 = rectF3.top;
            n9 n9Var2 = this.f45089e0;
            n9Var2.setTranslationY((f12 - n9Var2.getTop()) - this.f45128r.getY());
            x9 x9Var = this.C;
            if (x9Var != null && (j3Var = x9Var.f46307f) != null) {
                j3Var.setTranslationX((rectF.left - rectF2.left) * this.F);
                this.C.f46307f.setTranslationY((rectF.top - rectF2.top) * this.F);
            }
            this.f45089e0.setScaleX(rectF3.width() / this.f45089e0.getMeasuredWidth());
            this.f45089e0.setScaleY(rectF3.height() / this.f45089e0.getMeasuredHeight());
            this.f45093f0.setAlpha(this.F);
            this.f45099h0.setAlpha(this.F);
            this.f45102i0.setAlpha(this.F);
            if (this.f45082c0 == 2) {
                this.f45130r1.setAlpha(this.F);
            }
        }
    }

    public final void k0() {
        d8 d8Var = this.f45116n0;
        if (d8Var != null) {
            d8Var.dismiss();
            this.f45116n0 = null;
        }
        d8 d8Var2 = new d8(this.f45077b, 86400, this.f45074a);
        d8Var2.o1();
        d8Var2.q1(this.f45142v0);
        TLRPC.InputPeer inputPeer = this.f45139u0;
        if (inputPeer == null) {
            if (this.K != 0) {
                inputPeer = MessagesController.getInstance(this.f45081c).getInputPeer(this.K);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        d8Var2.p1(inputPeer);
        d8Var2.C = this.J;
        d8Var2.R = new h8(this, 18);
        d8Var2.e1(false);
        d8Var2.m1(1);
        d8Var2.k1(false);
        d8Var2.T = new h8(this, 19);
        d8Var2.Q = new o8(this, 12);
        this.f45116n0 = d8Var2;
        d8Var2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: qh.ca.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: qh.ca.l0(int, boolean, boolean):void");
    }

    public final void m() {
        s6 s6Var;
        boolean z4;
        if (this.f45134s1 != null && (s6Var = this.H1) != null && s6Var.f46083u) {
            File file = s6Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.H1.W0 = null;
            }
            this.H1.W0 = s6.w(this.f45081c, "webp");
            f9 f9Var = this.f45134s1;
            s6 s6Var2 = this.H1;
            ArrayList arrayList = s6Var2.T0;
            if (this.L1 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            Bitmap t02 = f9Var.t0(arrayList, false, false, true, z4, s6Var2);
            try {
                try {
                    t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.W0));
                    if (t02.isRecycled()) {
                        return;
                    }
                } catch (Exception e10) {
                    FileLog.e(e10);
                    try {
                        this.H1.W0.delete();
                    } catch (Exception e11) {
                        FileLog.e(e11);
                    }
                    this.H1.W0 = null;
                    if (t02 == null || t02.isRecycled()) {
                        return;
                    }
                }
                t02.recycle();
            } catch (Throwable th2) {
                if (t02 != null && !t02.isRecycled()) {
                    t02.recycle();
                }
                throw th2;
            }
        }
    }

    public final void m0(boolean z4) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        float f10;
        boolean z15;
        g9 g9Var;
        boolean z16 = false;
        if (this.f45082c0 == 0 && this.L1 == 1 && !this.F0.f46137e && !I()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(z10, z4);
        this.D0.setSelected(this.f45150x0.j());
        u uVar = this.F0;
        if (uVar != null && uVar.f46137e) {
            z11 = false;
        } else {
            z11 = true;
        }
        c0(this.f45108k0, z11, z4);
        if (!this.X1 && this.L1 != -1 && this.f45082c0 == 0 && this.V1 != null && !this.F0.f46137e && !I()) {
            z12 = true;
        } else {
            z12 = false;
        }
        c0(this.B0, z12, z4);
        if (!this.X1 && this.L1 != -1 && this.f45082c0 == 0 && (g9Var = this.f45154y0) != null && g9Var.f46169a && !this.F0.f46137e && !this.f45150x0.j()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.C0, z13, z4);
        if (!this.X1 && this.L1 != -1 && this.f45082c0 == 0 && !this.F0.f46137e) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.D0, z14, z4);
        c0(this.E0, this.F0.f46137e, z4);
        if (this.f45150x0.j()) {
            f10 = this.f45150x0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.L0.e(f10, z4);
        boolean z17 = this.F0.f46137e;
        f3 f3Var = this.f45109k1;
        if (z17) {
            f3Var.v();
        } else {
            f3Var.e(true);
        }
        h(this.X1, z4);
        if (this.L1 == -1 && this.f45082c0 == 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        AndroidUtilities.updateViewShow(this.P0, z15);
        if (this.L1 == -1 && this.f45082c0 == 0) {
            z16 = true;
        }
        AndroidUtilities.updateViewShow(this.O0, z16);
    }

    public final void n0() {
        this.E0.setTranslationX(-0.0f);
        float alpha = (this.E0.getAlpha() * AndroidUtilities.dp(46.0f)) + 0.0f;
        this.C0.setTranslationX(-alpha);
        float alpha2 = (this.C0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha;
        this.D0.setTranslationX(-alpha2);
        float alpha3 = (this.D0.getAlpha() * AndroidUtilities.dp(46.0f)) + alpha2;
        this.B0.setTranslationX(-alpha3);
        float alpha4 = this.B0.getAlpha();
        this.f45108k0.setTranslationX(0.0f);
        float alpha5 = this.f45108k0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        org.telegram.ui.k3 k3Var = this.F0.f46134a;
        k3Var.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        k3Var.invalidate();
    }

    public final void o() {
        boolean z4;
        if (this.H == 0.0f && this.F >= 1.0f && !this.f45156y2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 == this.f45152x2) {
            return;
        }
        lf.s0 s0Var = this.f45153y;
        if (s0Var != null) {
            s0Var.a(!z4);
        }
        this.f45152x2 = z4;
    }

    public final void o0(boolean z4) {
        int i10;
        ij0 ij0Var = this.f45090e1;
        if (ij0Var != null) {
            int[] iArr = ij0Var.f27817e;
            int i11 = 0;
            if (z4) {
                s6 s6Var = this.H1;
                if (s6Var != null && s6Var.f46091y0) {
                    i11 = iArr[0];
                }
                ij0Var.N(i11);
                ij0 ij0Var2 = this.f45090e1;
                if (ij0Var2 != null) {
                    ij0Var2.start();
                    return;
                }
                return;
            }
            s6 s6Var2 = this.H1;
            if (s6Var2 != null && s6Var2.f46091y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            ij0Var.L(i10, false, true);
            this.f45090e1.N(i10);
            ImageView imageView = this.f45094f1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f45127q2 < 0) {
            this.f45127q2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f45131r2 = arrayList;
            arrayList.add("off");
            this.f45131r2.add("auto");
            this.f45131r2.add("on");
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            d2 d2Var = this.f45132s;
            d2Var.f45193o = f10;
            d2Var.f45192n = d2.f(f10);
            d2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            d2 d2Var2 = this.f45132s;
            d2Var2.f45194p = f11;
            d2Var2.i();
        }
    }

    public final void p0() {
        if (this.T1) {
            return;
        }
        this.T1 = true;
        g8 g8Var = new g8(this, 2);
        f9 f9Var = this.f45134s1;
        s6 s6Var = this.H1;
        if (f9Var != null && s6Var != null) {
            s6Var.f();
            boolean u02 = f9Var.u0();
            boolean z4 = f9Var.L0.getPainting().E;
            Utilities.searchQueue.postRunnable(new j8(this, f9Var, s6Var.f46061i0, s6Var.f46063j0, s6Var, z4, u02, g8Var, 1));
            return;
        }
        g8Var.run();
    }

    public final void q(boolean z4) {
        q9 q9Var;
        if (this.d) {
            d8 d8Var = this.f45116n0;
            if (d8Var != null) {
                d8Var.dismiss();
                this.f45116n0 = null;
            }
            s6 s6Var = this.H1;
            long j10 = 0;
            if (s6Var != null && !s6Var.h) {
                if ((this.v && s6Var.f46057g) || s6Var.f46044b != 0) {
                    s6Var.f46062j = false;
                }
                s6Var.i(false);
            }
            this.H1 = null;
            Utilities.Callback4 callback4 = this.O;
            if (callback4 != null && (q9Var = this.U0) != null) {
                if (this.f45088e) {
                    return;
                }
                this.f45088e = true;
                k71 k71Var = q9Var.f45495y;
                if (k71Var != null) {
                    k71Var.B();
                    q9Var.f45495y.H();
                    q9Var.f45495y = null;
                }
                k71 k71Var2 = q9Var.f45493x;
                if (k71Var2 != null) {
                    j10 = k71Var2.n();
                    q9Var.f45493x.B();
                    q9Var.f45493x.H();
                    q9Var.f45493x = null;
                }
                k71 k71Var3 = q9Var.f45469e;
                if (k71Var3 != null) {
                    j10 = k71Var3.n();
                    q9Var.f45469e.B();
                    q9Var.f45469e.H();
                    q9Var.f45469e = null;
                }
                callback4.run(Long.valueOf(j10), new p8(this, z4, 2), Boolean.valueOf(this.v), Long.valueOf(this.f45145w));
                return;
            }
            q9 q9Var2 = this.U0;
            if (q9Var2 != null && !z4) {
                q9Var2.set(null);
            }
            g(0.0f, z4, new g8(this, 23));
            int i10 = this.G;
            if (i10 == 1 || i10 == 0) {
                this.f45115n.setBackgroundColor(0);
                this.Y0.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f45081c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        g9 g9Var;
        if ((this.M1 || this.N1) && (g9Var = this.f45154y0) != null && g9Var.isFrontface()) {
            int i10 = this.f45127q2;
            if (i10 == 2 || (i10 == 1 && this.Z1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z4;
        Activity activity = this.f45077b;
        if (this.f45154y0 == null && activity != null) {
            this.f45154y0 = new g9(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            r5 r5Var = this.L0;
            float f10 = 0.0f;
            if (r5Var != null) {
                r5Var.f45952d0 = 0.0f;
                r5Var.f45954e0.d(0.0f, true);
            }
            this.f45154y0.recordHevc = !this.f45150x0.j();
            this.f45154y0.setThumbDrawable(A());
            this.f45154y0.initTexture();
            this.f45154y0.setDelegate(new o8(this, 0));
            oa oaVar = this.C0;
            if (this.f45154y0.f46169a && this.f45082c0 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c0(oaVar, z4, true);
            v vVar = this.D0;
            if (!this.f45154y0.f46169a) {
                f10 = AndroidUtilities.dp(46.0f);
            }
            vVar.setTranslationX(f10);
            this.f45150x0.setCameraView(this.f45154y0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.T0.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!v0.q(this.f45154y0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", v0.p(ApplicationLoader.applicationContext, false))) && this.f45154y0.f46169a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.f45103i1.v();
            }
            if (this.f45157z0 == null) {
                this.f45157z0 = new n5(activity, new h8(this, 3));
            }
            this.f45157z0.a(this.f45154y0);
            b6 b6Var = this.A0;
            if (b6Var != null) {
                p9 p9Var = this.f45150x0;
                Object blurRenderNode = p9Var.getBlurRenderNode();
                b6Var.C = p9Var;
                b6Var.D = blurRenderNode;
                b6Var.invalidate();
            }
        }
    }

    public final void s() {
        s6 s6Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.f45155y1 == null && (s6Var = this.H1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!s6Var.K) {
                if (s6Var.Z0 == null) {
                    q10 = this.U0.getPhotoBitmap();
                } else {
                    o8 o8Var = new o8(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q10 = s6.q(o8Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.H1.K) {
                y61 textureView = this.U0.getTextureView();
                int orientation = this.U0.getOrientation();
                s6 s6Var2 = this.H1;
                if (s6Var2 != null) {
                    savedFilterState = s6Var2.f46043a1;
                }
                pf0 pf0Var = new pf0(this.f45077b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f45119o0, this.f45074a);
                this.f45155y1 = pf0Var;
                this.f45128r.addView(pf0Var);
                nf0 nf0Var = this.f45158z1;
                if (nf0Var != null) {
                    nf0Var.setFilterView(this.f45155y1);
                }
                TextureView myTextureView = this.f45155y1.getMyTextureView();
                this.A1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.U0.o(this.A1, this.f45155y1);
                TextureView textureView2 = this.A1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.A1.animate().alpha(1.0f).setDuration(220L).start();
                }
                j();
                ef0 blurControl = this.f45155y1.getBlurControl();
                this.B1 = blurControl;
                if (blurControl != null) {
                    this.f45089e0.addView(blurControl);
                }
                gf0 curveControl = this.f45155y1.getCurveControl();
                this.C1 = curveControl;
                if (curveControl != null) {
                    this.f45089e0.addView(curveControl);
                }
                V();
                this.f45155y1.getDoneTextView().setOnClickListener(new i8(this, 13));
                this.f45155y1.getCancelTextView().setOnClickListener(new i8(this, 14));
                this.f45155y1.getToolsView().setVisibility(8);
                this.f45155y1.getToolsView().setAlpha(0.0f);
                this.f45155y1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.f45155y1.f30044f0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z4) {
        boolean z10;
        boolean z11;
        if (this.J0 != null) {
            p9 p9Var = this.f45150x0;
            if (p9Var != null && p9Var.j()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == this.J0.M) {
                return;
            }
        }
        if (this.f45077b == null) {
            return;
        }
        if (this.J0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f45107j2;
        boolean z12 = !z4;
        p9 p9Var2 = this.f45150x0;
        if (p9Var2 != null && p9Var2.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        c9 c9Var = new c9(this, this.f45081c, this.f45077b, this.f45074a, albumEntry, z4, z12, z10);
        this.J0 = c9Var;
        c9Var.D.setVisibility(8);
        this.J0.setMultipleOnClick(this.f45150x0.j());
        this.J0.setMaxCount(Math.min(10, r.b() - this.f45150x0.getFilledCount()));
        this.J0.setOnBackClickListener(new t8(this, 1));
        this.J0.setOnSelectListener(new my0(z4, this, 1));
        this.J0.setOnSelectMultipleListener(new mh.n1(this, 2));
        f2.i0 i0Var = this.f45104i2;
        if (i0Var != null) {
            m2 m2Var = this.J0.f44898e;
            m2Var.B = i0Var;
            m2Var.l0();
        }
        this.f45115n.addView(this.J0, k7.c6.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: qh.ca.u():void");
    }

    public final void v(boolean z4) {
        n5 n5Var = this.f45157z0;
        if (n5Var != null) {
            n5Var.f45772f = null;
            Utilities.globalQueue.cancelRunnable(n5Var.h);
            this.f45157z0 = null;
            p9 p9Var = this.f45150x0;
            if (p9Var != null) {
                p9Var.f46316c.a(null);
            }
        }
        b6 b6Var = this.A0;
        if (b6Var != null) {
            b6Var.C = null;
            b6Var.D = null;
            b6Var.invalidate();
        }
        if (this.f45154y0 != null) {
            if (z4) {
                b0(new g8(this, 8));
                return;
            }
            b0(new g8(this, 9));
            this.f45154y0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.f45154y0);
            p9 p9Var2 = this.f45150x0;
            if (p9Var2 != null) {
                p9Var2.setCameraView(null);
            }
            this.f45154y0 = null;
        }
    }

    public final void w() {
        c9 c9Var = this.J0;
        if (c9Var == null) {
            return;
        }
        this.f45115n.removeView(c9Var);
        this.J0 = null;
        ValueAnimator valueAnimator = this.f45110k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45110k2 = null;
        }
        o1.j jVar = this.f45112l2;
        if (jVar != null) {
            jVar.c();
            this.f45112l2 = null;
        }
        this.f45114m2 = null;
    }

    public final void y() {
        pf0 pf0Var = this.f45155y1;
        if (pf0Var == null) {
            return;
        }
        pf0Var.e();
        this.f45158z1.setFilterView(null);
        this.f45128r.removeView(this.f45155y1);
        TextureView textureView = this.A1;
        if (textureView != null) {
            this.f45089e0.removeView(textureView);
            this.A1 = null;
        }
        this.U0.o(null, null);
        ef0 ef0Var = this.B1;
        if (ef0Var != null) {
            this.f45089e0.removeView(ef0Var);
            this.B1 = null;
        }
        gf0 gf0Var = this.C1;
        if (gf0Var != null) {
            this.f45089e0.removeView(gf0Var);
            this.C1 = null;
        }
        this.f45155y1 = null;
    }

    public final void z() {
        f9 f9Var = this.f45134s1;
        if (f9Var != null) {
            f9Var.O0.removeAllViews();
            f9 f9Var2 = this.f45134s1;
            f9Var2.L0.h();
            f9Var2.O0.setVisibility(8);
            f9Var2.N0.setVisibility(8);
            f9Var2.B0.postRunnable(new sj0(14));
            l4 l4Var = f9Var2.f44959h2;
            if (l4Var != null) {
                l4Var.dismiss();
            }
            dg.e0 e0Var = f9Var2.Q1;
            if (e0Var != null) {
                e0Var.dismiss();
            }
            this.f45128r.removeView(this.f45134s1);
            this.f45134s1 = null;
            dg.o1 o1Var = this.f45137t1;
            if (o1Var != null) {
                this.f45089e0.removeView(o1Var);
                this.f45137t1 = null;
            }
            View view = this.f45143v1;
            if (view != null) {
                this.f45089e0.removeView(view);
                this.f45143v1 = null;
            }
            View view2 = this.f45140u1;
            if (view2 != null) {
                this.f45089e0.removeView(view2);
                this.f45140u1 = null;
            }
            View view3 = this.f45147w1;
            if (view3 != null) {
                this.f45089e0.removeView(view3);
                this.f45147w1 = null;
            }
            View view4 = this.f45151x1;
            if (view4 != null) {
                this.f45089e0.removeView(view4);
                this.f45151x1 = null;
            }
        }
    }
}
