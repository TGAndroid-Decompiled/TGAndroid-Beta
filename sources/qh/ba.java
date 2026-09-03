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
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.im;
import org.telegram.ui.Components.j71;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.kj0;
import org.telegram.ui.Components.lc0;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.o51;
import org.telegram.ui.Components.og0;
import org.telegram.ui.Components.pf0;
import org.telegram.ui.Components.pq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pv;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.tp;
import org.telegram.ui.Components.wo;
import org.telegram.ui.Components.x61;
import org.telegram.ui.Components.xt;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.cr0;
import org.telegram.ui.ek;
import org.telegram.ui.nw0;
import org.telegram.ui.ry0;
import org.telegram.ui.sj0;
import org.telegram.ui.vd1;
public final class ba implements NotificationCenter.NotificationCenterDelegate {
    public static ba C2;
    public final a6 A0;
    public TextureView A1;
    public float A2;
    public ValueAnimator B;
    public final ma B0;
    public ef0 B1;
    public ValueAnimator B2;
    public w9 C;
    public final na C0;
    public gf0 C1;
    public float D;
    public final v D0;
    public File D1;
    public final RectF E;
    public final ma E0;
    public ArrayList E1;
    public float F;
    public final u F0;
    public ArrayList F1;
    public int G;
    public final qa G0;
    public ArrayList G1;
    public float H;
    public boolean H0;
    public r6 H1;
    public Float I;
    public boolean I0;
    public boolean I1;
    public boolean J;
    public b9 J0;
    public long J1;
    public long K;
    public o0 K0;
    public boolean K1;
    public boolean L;
    public final q5 L0;
    public int L1;
    public final AnimationNotificationsLocker M;
    public final d M0;
    public boolean M1;
    public Runnable N;
    public final u8 N0;
    public boolean N1;
    public Utilities.Callback4 O;
    public final a2 O0;
    public boolean O1;
    public int P;
    public final a2 P0;
    public boolean P1;
    public int Q;
    public final d3 Q0;
    public float Q1;
    public int R;
    public final d3 R0;
    public int R1;
    public boolean S;
    public final h91 S0;
    public boolean S1;
    public boolean T;
    public final e3 T0;
    public boolean T1;
    public boolean U;
    public final p9 U0;
    public boolean U1;
    public int V;
    public final FrameLayout V0;
    public String V1;
    public int W;
    public final la W0;
    public AnimatorSet W1;
    public int X;
    public final pa X0;
    public boolean X1;
    public int Y;
    public final d5 Y0;
    public boolean Y1;
    public final RectF Z;
    public final q9 Z0;
    public boolean Z1;
    public final oh.b f45040a;
    public final RectF f45041a0;
    public final t8 f45042a1;
    public boolean a2;
    public final Activity f45043b;
    public final Path f45044b0;
    public final n0 f45045b1;
    public Runnable f45046b2;
    public final int f45047c;
    public int f45048c0;
    public hj0 f45049c1;
    public AnimatorSet f45050c2;
    public boolean d;
    public int f45051d0;
    public final kj0 f45052d1;
    public k8 f45053d2;
    public boolean f45054e;
    public final m9 f45055e0;
    public hj0 f45056e1;
    public boolean f45057e2;
    public final WindowManager f45058f;
    public final FrameLayout f45059f0;
    public ImageView f45060f1;
    public AnimatorSet f45061f2;
    public final LinearLayout f45062g0;
    public final fg.i0 f45063g1;
    public ValueAnimator f45064g2;
    public final WindowManager.LayoutParams h;
    public final FrameLayout f45065h0;
    public final e3 f45066h1;
    public boolean f45067h2;
    public final n9 f45068i0;
    public final e3 f45069i1;
    public f2.i0 f45070i2;
    public final FrameLayout f45071j0;
    public final e3 f45072j1;
    public MediaController.AlbumEntry f45073j2;
    public final a2 f45074k0;
    public final e3 f45075k1;
    public ValueAnimator f45076k2;
    public final j6 f45077l0;
    public final e5 l1;
    public o1.j f45078l2;
    public final org.telegram.ui.ActionBar.l5 m0;
    public final oa f45079m1;
    public Boolean f45080m2;
    public final aa f45081n;
    public c8 f45082n0;
    public n f45083n1;
    public o8 f45084n2;
    public final org.telegram.ui.Components.ba f45085o0;
    public k9 f45086o1;
    public AnimatorSet f45087o2;
    public final h5 f45088p0;
    public l9 f45089p1;
    public boolean f45090p2;
    public final nw0 f45091q0;
    public final la f45092q1;
    public int f45093q2;
    public final s9 f45094r;
    public boolean f45095r0;
    public final d f45096r1;
    public ArrayList f45097r2;
    public final c2 f45098s;
    public long f45099s0;
    public e9 f45100s1;
    public FrameLayout f45101s2;
    public String f45102t0;
    public dg.o1 f45103t1;
    public boolean f45104t2;
    public TLRPC.InputPeer f45105u0;
    public View f45106u1;
    public f8 f45107u2;
    public boolean v;
    public a8 f45108v0;
    public View f45109v1;
    public im f45110v2;
    public long f45111w;
    public r f45112w0;
    public View f45113w1;
    public boolean f45114w2;
    public r9 f45115x;
    public final o9 f45116x0;
    public View f45117x1;
    public boolean f45118x2;
    public final lf.s0 f45119y;
    public f9 f45120y0;
    public pf0 f45121y1;
    public boolean f45122y2;
    public m5 f45123z0;
    public final nf0 f45124z1;
    public wo f45125z2;

    public ba(Activity activity, int i10) {
        lf.s0 s0Var;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        boolean z4;
        float f11;
        oh.b bVar = new oh.b();
        this.f45040a = bVar;
        this.f45111w = 0L;
        this.E = new RectF();
        this.J = true;
        this.M = new AnimationNotificationsLocker();
        this.Z = new RectF();
        this.f45041a0 = new RectF();
        this.f45044b0 = new Path();
        new Rect();
        this.f45048c0 = 0;
        this.f45051d0 = -1;
        this.f45108v0 = new a8();
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
        x8 x8Var = new x8(this);
        this.a2 = true;
        this.f45067h2 = true;
        this.f45093q2 = -1;
        this.f45043b = activity;
        this.f45047c = i10;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            s0Var = new lf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.f45119y = s0Var;
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
        this.f45058f = windowManager;
        aa aaVar = new aa(this, activity);
        this.f45081n = aaVar;
        n8 n8Var = new n8(this, 1);
        WeakHashMap weakHashMap = r0.j0.f46469a;
        r0.b0.j(aaVar, n8Var);
        this.f45081n.setFocusable(true);
        this.f45081n.setImportantForAccessibility(2);
        c2 c2Var = new c2(activity, windowManager, this.f45081n, layoutParams);
        this.f45098s = c2Var;
        c2Var.a(new i9(this));
        this.f45081n.addView(this.f45098s.f45148b, new ViewGroup.LayoutParams(-1, -1));
        aa aaVar2 = this.f45081n;
        s9 s9Var = new s9(this, activity);
        this.f45094r = s9Var;
        aaVar2.addView(s9Var);
        s9 s9Var2 = this.f45094r;
        m9 m9Var = new m9(this, activity);
        this.f45055e0 = m9Var;
        s9Var2.addView(m9Var);
        this.f45094r.addView(this.f45098s.f45149c, new ViewGroup.LayoutParams(-1, -1));
        this.f45085o0 = new org.telegram.ui.Components.ba(this.f45055e0);
        this.f45088p0 = new Object();
        s9 s9Var3 = this.f45094r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f45059f0 = frameLayout;
        s9Var3.addView(frameLayout);
        s9 s9Var4 = this.f45094r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f45065h0 = frameLayout2;
        s9Var4.addView(frameLayout2);
        s9 s9Var5 = this.f45094r;
        n9 n9Var = new n9(this, activity, 0);
        this.f45068i0 = n9Var;
        s9Var5.addView(n9Var);
        this.f45068i0.setVisibility(8);
        this.f45068i0.setAlpha(0.0f);
        s9 s9Var6 = this.f45094r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f45071j0 = frameLayout3;
        s9Var6.addView(frameLayout3);
        ic.a(this.f45081n, new hg.w(14));
        o9 o9Var = new o9(this, activity, this.f45085o0, this.f45094r, bVar);
        this.f45116x0 = o9Var;
        aa aaVar3 = this.f45081n;
        Objects.requireNonNull(aaVar3);
        o9Var.setCancelGestures(new org.telegram.ui.web.s0(aaVar3, 26));
        this.f45116x0.setResetState(new f8(this, 13));
        this.f45055e0.addView(this.f45116x0, k7.c6.e(-1, -1, 119));
        this.f45116x0.setOnClickListener(new h8(this, 12));
        m9 m9Var2 = this.f45055e0;
        int i15 = this.G;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        m9Var2.setBackgroundColor(i11);
        m9 m9Var3 = this.f45055e0;
        hg.j1 j1Var = lf.q0.f12504a;
        m9Var3.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(12.0f)));
        this.f45055e0.setClipToOutline(true);
        f8 f8Var = new f8(this, 14);
        ?? view = new View(activity);
        view.f29439a = new TextPaint(1);
        view.f29440b = new TextPaint(1);
        pr prVar = pr.h;
        view.f29446s = new org.telegram.ui.Components.z5((View) view, 0L, 350L, prVar);
        view.F = new ec0(view, 7);
        view.f29448x = f8Var;
        this.f45124z1 = view;
        p9 p9Var = new p9(this, activity, this.f45085o0, this.f45088p0);
        this.U0 = p9Var;
        p9Var.setCollageView(this.f45116x0);
        p9 p9Var2 = this.U0;
        p9Var2.v = new f8(this, 15);
        p9Var2.setOnTapListener(new f8(this, 16));
        this.U0.setVisibility(8);
        p9 p9Var3 = this.U0;
        p9Var3.K = new f8(this, 17);
        this.f45055e0.addView(p9Var3, k7.c6.e(-1, -1, 119));
        this.f45055e0.addView(this.f45124z1, k7.c6.e(-1, -1, 119));
        aa aaVar4 = this.f45081n;
        q9 q9Var = new q9(this, activity, aaVar4, aaVar4, this.f45094r, bVar, this.f45085o0);
        this.Z0 = q9Var;
        q9Var.setAccount(i10);
        this.Z0.setUiBlurBitmap(new n8(this, 6));
        ic.a(this.f45068i0, new lh.t0(this, 11));
        this.Z0.setOnHeightUpdate(new g8(this, 13));
        this.Z0.setOnPeriodUpdate(new g8(this, 4));
        long j10 = this.K;
        if (j10 != 0) {
            this.Z0.setDialogId(j10);
        }
        this.Z0.setOnPremiumHint(new g8(this, 5));
        this.Z0.setOnKeyboardOpen(new g8(this, 6));
        nw0 nw0Var = new nw0(this, activity, 6);
        this.f45091q0 = nw0Var;
        this.f45094r.addView(nw0Var);
        la laVar = new la(activity, this.f45094r, this.f45055e0, bVar, this.f45085o0);
        this.W0 = laVar;
        laVar.setOnTimelineClick(new f8(this, 10));
        this.W0.setOnHeightChange(new f8(this, 11));
        this.U0.setVideoTimelineView(this.W0);
        this.W0.setVisibility(8);
        this.W0.setAlpha(0.0f);
        this.W0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.V0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.W0, k7.c6.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        pa paVar = new pa(activity);
        this.X0 = paVar;
        paVar.setVisibility(8);
        this.X0.a(false);
        this.V0.addView(this.X0, k7.c6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f45068i0.addView(this.V0, k7.c6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f45068i0.addView(this.Z0, k7.c6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.f45116x0.setTimelineView(this.W0);
        this.f45116x0.setPreviewView(this.U0);
        la laVar2 = new la(activity, this.f45094r, this.f45055e0, bVar, this.f45085o0);
        this.f45092q1 = laVar2;
        laVar2.U0 = true;
        laVar2.setVisibility(8);
        this.f45092q1.setAlpha(0.0f);
        this.f45068i0.addView(this.f45092q1, k7.c6.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        t8 t8Var = new t8(this, activity, bVar, this.f45085o0);
        this.f45042a1 = t8Var;
        t8Var.setVisibility(8);
        this.f45068i0.addView(this.f45042a1, k7.c6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f45074k0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        a2 a2Var = this.f45074k0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        a2Var.setScaleType(scaleType);
        this.f45074k0.setImageResource(R.drawable.msg_photo_back);
        a2 a2Var2 = this.f45074k0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        a2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f45074k0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45074k0.setOnClickListener(new h8(this, 1));
        this.f45059f0.addView(this.f45074k0, k7.c6.e(56, 56, 51));
        this.f45098s.a(this.f45074k0);
        j6 j6Var = new j6(activity, i10);
        this.f45077l0 = j6Var;
        j6Var.a(false, false);
        this.f45077l0.setOnClickListener(new q8(0, this, activity));
        this.f45059f0.addView(this.f45077l0, k7.c6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
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
        this.f45059f0.addView(this.m0, k7.c6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f45062g0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f45062g0.setGravity(5);
        this.f45059f0.addView(this.f45062g0, k7.c6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        g8 g8Var = new g8(this, 7);
        aa aaVar5 = this.f45081n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f45790w = true;
        imageView2.f45791x = true;
        imageView2.h = g8Var;
        imageView2.f45782a = i10;
        imageView2.f45783b = aaVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new org.telegram.ui.Components.voip.o(imageView2, 8));
        imageView2.f45786f = new tp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f45045b1 = imageView2;
        e3 e3Var = new e3(activity, 1);
        e3Var.l(1.0f, -71.0f);
        e3Var.d = 2000L;
        e3Var.R = false;
        e3Var.E.o(true, false, false);
        this.f45066h1 = e3Var;
        e3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f45059f0.addView(this.f45066h1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f45052d1 = imageView3;
        imageView3.setScaleType(scaleType);
        kj0 kj0Var = this.f45052d1;
        r6 r6Var = this.H1;
        if (r6Var != null && r6Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        kj0Var.setImageResource(i12);
        this.f45052d1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f45052d1.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45052d1.setOnClickListener(new h8(this, 2));
        this.f45052d1.setVisibility(8);
        this.f45052d1.setAlpha(0.0f);
        fg.i0 i0Var = new fg.i0(activity);
        this.f45063g1 = i0Var;
        i0Var.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45063g1.setVisibility(8);
        this.f45063g1.setAlpha(0.0f);
        this.f45063g1.setOnClickListener(new h8(this, 3));
        this.f45062g0.addView(this.f45063g1, k7.c6.q(46, 56, 53));
        this.f45062g0.addView(this.f45052d1, k7.c6.q(46, 56, 53));
        this.f45062g0.addView(this.f45045b1, k7.c6.e(46, 56, 53));
        ma maVar = new ma(activity);
        this.B0 = maVar;
        maVar.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.B0.setOnClickListener(new h8(this, 4));
        this.B0.setOnLongClickListener(new eg.d0(this, 2));
        this.B0.setVisibility(8);
        this.B0.setAlpha(0.0f);
        this.f45098s.a(this.B0);
        this.f45059f0.addView(this.B0, k7.c6.e(56, 56, 53));
        na naVar = new na(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.C0 = naVar;
        naVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.C0.setOnClickListener(new h8(this, 5));
        boolean q10 = v0.q(activity);
        na naVar2 = this.C0;
        if (q10) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        naVar2.setVisibility(i13);
        na naVar3 = this.C0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        naVar3.setAlpha(f10);
        this.f45098s.a(this.C0);
        this.f45059f0.addView(this.C0, k7.c6.e(56, 56, 53));
        ?? maVar2 = new ma(activity);
        this.D0 = maVar2;
        maVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.D0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        if (this.f45112w0 == null) {
            i14 = 6;
            this.f45112w0 = (r) r.a().get(6);
        } else {
            i14 = 6;
        }
        this.D0.setOnClickListener(new h8(this, i14));
        this.D0.a(new lc0(this.f45112w0, false), false);
        this.D0.setSelected(false);
        this.D0.setVisibility(0);
        this.D0.setAlpha(1.0f);
        this.f45098s.a(this.D0);
        this.f45059f0.addView(this.D0, k7.c6.e(56, 56, 53));
        ma maVar3 = new ma(activity);
        this.E0 = maVar3;
        maVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.E0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.E0.a(new lc0(new r("../../.."), true), false);
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.E0.setOnClickListener(new h8(this, 7));
        this.f45098s.a(this.E0);
        this.f45059f0.addView(this.E0, k7.c6.e(56, 56, 53));
        u uVar = new u(activity, this.f45098s);
        this.F0 = uVar;
        uVar.f46149a.u0(6);
        this.F0.setSelected((r) null);
        this.F0.setOnLayoutClick(new g8(this, 8));
        this.f45059f0.addView(this.F0, k7.c6.e(-1, 56, 53));
        e3 e3Var2 = new e3(activity, 1);
        e3Var2.l(1.0f, -20.0f);
        e3Var2.d = 5000L;
        e3Var2.i();
        e3Var2.s(LocaleController.getString(R.string.StoryCameraDualHint));
        e3Var2.f45272i0 = new sj0(16);
        this.f45069i1 = e3Var2;
        e3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f45059f0.addView(this.f45069i1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        e3 e3Var3 = new e3(activity, 2);
        e3Var3.l(0.0f, 28.0f);
        e3Var3.d = 5000L;
        e3Var3.p(true);
        this.f45072j1 = e3Var3;
        this.f45059f0.addView(e3Var3, k7.c6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        e3 e3Var4 = new e3(activity, 1);
        e3Var4.l(1.0f, -20.0f);
        e3Var4.d = 5000L;
        e3Var4.s(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f45075k1 = e3Var4;
        e3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f45059f0.addView(this.f45075k1, k7.c6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f45966a = paint;
        Paint paint2 = new Paint(1);
        view2.f45967b = paint2;
        view2.f45969e = new org.telegram.ui.Components.z5((View) view2, 0L, 250L, prVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.j6 j6Var2 = new org.telegram.ui.Components.j6(false, true, true, false);
        view2.f45968c = j6Var2;
        j6Var2.k(0.3f, 250L, prVar);
        j6Var2.t(AndroidUtilities.dp(13.0f));
        j6Var2.r(-1);
        j6Var2.u(AndroidUtilities.bold());
        j6Var2.setCallback(view2);
        j6Var2.f27999b = 1;
        view2.a(0L, false);
        this.G0 = view2;
        i0(false, false);
        this.f45059f0.addView(this.G0, k7.c6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f45098s.a(this.G0);
        MediaController.loadGalleryPhotosAlbums(0);
        q5 q5Var = new q5(activity);
        this.L0 = q5Var;
        q5Var.setDelegate(x8Var);
        q5 q5Var2 = this.L0;
        if (this.L1 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        q5Var2.f45940k0 = -1.0f;
        q5Var2.f45941l0 = z4;
        q5Var2.invalidate();
        this.f45065h0.addView(this.L0, k7.c6.e(-1, 100, 87));
        this.f45098s.a(this.L0);
        q5 q5Var3 = this.L0;
        if (this.f45116x0.j()) {
            f11 = this.f45116x0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        q5Var3.e(f11, true);
        d dVar = new d(activity, bVar, true);
        this.M0 = dVar;
        dVar.setRoundRadius(24);
        this.M0.setColor(-2473124);
        this.M0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.M0.setAlpha(0.0f);
        this.M0.setScaleX(0.8f);
        this.M0.setScaleY(0.8f);
        this.M0.setVisibility(8);
        this.f45065h0.addView(this.M0, k7.c6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.M0.setOnClickListener(new h8(this, 8));
        e3 e3Var5 = new e3(activity, 3);
        e3Var5.p(true);
        e3Var5.s(LocaleController.getString(R.string.StoryCameraHint2));
        e3Var5.h = AndroidUtilities.dp(320.0f);
        e3Var5.d = 5000L;
        e3Var5.H = Layout.Alignment.ALIGN_CENTER;
        this.T0 = e3Var5;
        this.f45065h0.addView(e3Var5, k7.c6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        h91 h91Var = new h91(activity);
        this.S0 = h91Var;
        h91Var.J = false;
        h91Var.setAlpha(0.0f);
        this.f45065h0.addView(this.S0, k7.c6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.S0.setDelegate(new n8(this, 4));
        h91 h91Var2 = this.S0;
        this.Q1 = 0.0f;
        h91Var2.b(0.0f, false);
        a6 a6Var = new a6(activity, i10, new f8(this, 12));
        this.A0 = a6Var;
        a6Var.f44973c = new g8(this, 9);
        this.f45065h0.addView(a6Var, k7.c6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        u8 u8Var = new u8(this, activity);
        this.N0 = u8Var;
        u8Var.setOnSwitchModeListener(new g8(this, 10));
        this.N0.setOnSwitchingModeListener(new g8(this, 11));
        this.f45071j0.addView(this.N0, k7.c6.e(-1, 48, 55));
        this.f45098s.a(this.N0);
        ?? imageView4 = new ImageView(activity);
        this.O0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.O0.setImageResource(R.drawable.stream_flip);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45071j0.addView(this.O0, k7.c6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f45098s.a(this.O0);
        this.O0.setOnClickListener(new h8(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.P0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.P0.setImageResource(R.drawable.stream_settings);
        this.P0.setScaleType(scaleType);
        this.P0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P0.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
        this.f45071j0.addView(this.P0, k7.c6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f45098s.a(this.P0);
        this.P0.setOnClickListener(new h8(this, 10));
        d3 d3Var = new d3(activity);
        this.Q0 = d3Var;
        this.f45071j0.addView(d3Var, k7.c6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f45098s.a(this.Q0);
        d3 d3Var2 = new d3(activity);
        this.R0 = d3Var2;
        d3Var2.f45223a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        d3Var2.invalidate();
        this.R0.setAlpha(0.0f);
        this.f45071j0.addView(this.R0, k7.c6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f45098s.a(this.R0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f45096r1 = dVar2;
        dVar2.setVisibility(8);
        this.f45096r1.setAlpha(0.0f);
        this.f45096r1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f45096r1.setOnClickListener(new h8(this, 11));
        this.f45071j0.addView(this.f45096r1, k7.c6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f45227b = new ArrayList();
        frameLayout5.f45229e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f45226a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, k7.c6.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.f45229e = true;
        c5 c5Var = new c5(frameLayout5, activity, string, true);
        frameLayout5.f45228c = c5Var;
        c5Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f45228c, k7.c6.c(-2.0f, -2));
        frameLayout5.e();
        this.Y0 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.Y0.setOnClickListener(new g8(this, 12));
        this.f45071j0.addView(this.Y0, k7.c6.e(-1, 52, 23));
        oa oaVar = new oa(activity);
        this.f45079m1 = oaVar;
        oaVar.setAlpha(0.0f);
        this.f45079m1.setVisibility(8);
        this.f45055e0.addView(this.f45079m1, k7.c6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        e5 e5Var = new e5(activity, i10, bVar);
        this.l1 = e5Var;
        this.f45055e0.addView(e5Var, k7.c6.e(-1, -1, 119));
        m0(false);
    }

    public static ba E(Activity activity, int i10) {
        ba baVar = C2;
        if (baVar != null && (baVar.f45043b != activity || baVar.f45047c != i10)) {
            baVar.q(false);
            C2 = null;
        }
        if (C2 == null) {
            C2 = new ba(activity, i10);
        }
        return C2;
    }

    public static void a(ba baVar) {
        f9 f9Var = baVar.f45120y0;
        boolean z4 = false;
        if (f9Var != null && f9Var.getTextureView() != null) {
            Bitmap bitmap = baVar.f45120y0.getTextureView().getBitmap();
            if (bitmap == null) {
                baVar.Z1 = false;
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
            baVar.Z1 = z4;
            return;
        }
        baVar.Z1 = false;
    }

    public static void a0(boolean z4) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z4).apply();
    }

    public static boolean b(ba baVar) {
        Activity activity = baVar.f45043b;
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

    public static void c(ba baVar) {
        ValueAnimator valueAnimator = baVar.f45064g2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            baVar.f45064g2 = null;
        }
        baVar.f45067h2 = false;
        s9 s9Var = baVar.f45094r;
        float f10 = s9Var.f46106a;
        float f11 = s9Var.f46107b;
        s9Var.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        baVar.f45064g2 = ofFloat;
        ofFloat.addUpdateListener(new pv(baVar, f10, f11, 3));
        baVar.f45064g2.setDuration(340L);
        baVar.f45064g2.setInterpolator(pr.h);
        baVar.f45064g2.addListener(new a9(baVar, 0));
        baVar.f45064g2.start();
    }

    public static boolean d(ba baVar) {
        Activity activity = baVar.f45043b;
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
        spannableString.setSpan(new j9(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        ba baVar = C2;
        if (baVar != null) {
            baVar.q(false);
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
        return this.f45043b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.F1;
        if (arrayList != null) {
            return arrayList.size();
        }
        r6 r6Var = this.H1;
        if (r6Var != null) {
            return r6Var.r();
        }
        return 1;
    }

    public final String C() {
        f9 f9Var = this.f45120y0;
        if (f9Var != null && f9Var.getCameraSession() != null) {
            if (this.f45120y0.isFrontface() && !this.f45120y0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f45097r2.get(this.f45093q2);
            }
            return this.f45120y0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final o0 D() {
        if (this.K0 == null) {
            o0 o0Var = new o0(this.f45043b);
            this.K0 = o0Var;
            this.f45065h0.addView(o0Var, k7.c6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.K0;
    }

    public final String F() {
        int i10;
        f9 f9Var = this.f45120y0;
        if (f9Var != null && f9Var.getCameraSession() != null) {
            if (this.f45120y0.isFrontface() && !this.f45120y0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f45097r2;
                if (this.f45093q2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f45093q2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.f45120y0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f45060f1 == null) {
            hj0 hj0Var = new hj0(R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f45056e1 = hj0Var;
            hj0Var.h = true;
            r6 r6Var = this.H1;
            if (r6Var != null && r6Var.f46042y0) {
                hj0Var.K(35);
                this.f45056e1.N(36);
            } else {
                hj0Var.N(0);
                this.f45056e1.K(0);
            }
            this.f45056e1.X = true;
            int v02 = org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.J9, this.f45040a);
            this.f45056e1.O(v02, "Sunny");
            this.f45056e1.O(v02, "Path 6");
            this.f45056e1.O(v02, "Path");
            this.f45056e1.O(v02, "Path 5");
            this.f45056e1.m();
            ImageView imageView = new ImageView(this.f45043b);
            this.f45060f1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f45060f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f45060f1.setBackground(org.telegram.ui.ActionBar.k6.f0(553648127, 1, -1));
            this.f45060f1.setOnClickListener(new h8(this, 0));
            this.f45060f1.setVisibility(8);
            this.f45060f1.setImageDrawable(this.f45056e1);
            this.f45060f1.setAlpha(0.0f);
            this.f45062g0.addView(this.f45060f1, 0, k7.c6.q(46, 56, 53));
        }
        return this.f45060f1;
    }

    public final void H() {
        e9 e9Var = this.f45100s1;
        if (e9Var == null) {
            return;
        }
        this.f45101s2 = null;
        e9Var.getTopLayout().setAlpha(0.0f);
        this.f45100s1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f45100s1.getBottomLayout().setAlpha(0.0f);
        this.f45100s1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f45100s1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f45100s1.setVisibility(8);
    }

    public final boolean I() {
        float f10;
        if (this.f45116x0.j()) {
            f10 = this.f45116x0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.X1 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        b9 b9Var;
        if (!this.T && (b9Var = this.J0) != null) {
            if (b9Var.getTranslationY() < (this.f45081n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: qh.ba.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j10) {
        if (!this.P1 && this.H1 != null) {
            k8 k8Var = this.f45053d2;
            if (k8Var != null) {
                AndroidUtilities.cancelRunOnUIThread(k8Var);
            }
            this.f45057e2 = true;
            this.P1 = true;
            this.f45053d2 = new k8(this, runnable, 1);
            this.U0.setAlpha(0.0f);
            this.U0.setVisibility(0);
            this.U0.n(this.H1, this.f45053d2, j10);
            this.U0.q(this.H1, false);
            AndroidUtilities.runOnUIThread(this.f45053d2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: qh.ba.M():boolean");
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
            this.f45092q1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f45068i0.setVisibility(i17);
            this.Z0.setVisibility(8);
            this.f45096r1.setVisibility(8);
        }
        if (i10 == 1) {
            this.Y0.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f45068i0.setVisibility(i14);
            this.f45052d1.setVisibility(8);
            this.f45063g1.setVisibility(8);
            this.f45045b1.setVisibility(8);
            ImageView imageView = this.f45060f1;
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
            this.f45079m1.setAlpha(0.0f);
            this.f45079m1.setVisibility(8);
            this.X0.setVisibility(8);
            this.E1 = null;
            this.F1 = null;
            this.G1 = null;
        }
        if (i11 == 1) {
            r6 r6Var = this.H1;
            if (r6Var == null || !r6Var.f46020n) {
                u();
                H();
            }
            nf0 nf0Var = this.f45124z1;
            if (nf0Var != null) {
                nf0Var.setAllowTouch(false);
            }
            this.U0.x(2, false);
            this.U0.x(3, false);
            this.U0.x(4, false);
            this.U0.x(5, false);
            this.U0.x(7, false);
            r6 r6Var2 = this.H1;
            if (r6Var2 != null && r6Var2.f46010h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.X0.setVisibility(i13);
            this.f45068i0.setAlpha(1.0f);
            this.f45068i0.setTranslationY(0.0f);
            r6 r6Var3 = this.H1;
            this.Z0.setVisibility((r6Var3 == null || r6Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.S1) {
            D().setVisibility(0);
            o0 D = D();
            D.f45832r.d(0.0f, true);
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
        nf0 nf0Var2 = this.f45124z1;
        if (nf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f45051d0) == -1 || i12 == 1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            nf0Var2.setAllowTouch(z10);
        }
        q9 q9Var = this.Z0;
        if (q9Var != null) {
            if (i11 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            q9Var.f45568b0 = z4;
        }
        if (i11 == 1) {
            int i19 = this.f45047c;
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
        r6 r6Var;
        int i12;
        float f10;
        int i13;
        boolean z4;
        boolean z10;
        long j10;
        String str;
        SpannableStringBuilder append;
        boolean z11;
        r6 r6Var2;
        boolean z12;
        boolean z13;
        boolean z14;
        r6 r6Var3;
        long duration;
        boolean z15;
        boolean z16;
        int i14;
        f8 f8Var;
        int i15;
        int i16;
        boolean z17;
        boolean z18;
        boolean z19;
        r6 r6Var4;
        int i17;
        r6 r6Var5;
        r6 r6Var6;
        r6 r6Var7;
        x61 textureView;
        r6 r6Var8;
        boolean z20 = true;
        if (i11 == 0) {
            Z(false);
            this.L0.setVisibility(0);
            q5 q5Var = this.L0;
            if (q5Var != null) {
                q5Var.g(false);
            }
            this.N0.setVisibility(0);
            this.S0.setVisibility(0);
            this.S0.setAlpha(0.0f);
            this.G0.a(0L, true);
            r6 r6Var9 = this.H1;
            if (r6Var9 != null) {
                r6Var9.i(false);
                this.H1 = null;
            }
            o9 o9Var = this.f45116x0;
            if (o9Var != null) {
                o9Var.e();
                this.L0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new f8(this, 18));
            o0 o0Var = this.K0;
            if (o0Var != null) {
                o0Var.setVisibility(8);
            }
            this.T0.e(true);
            e3 e3Var = this.f45069i1;
            if (e3Var != null) {
                e3Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f45047c;
        if (i11 != 1 && i10 != 1) {
            j10 = 0;
        } else {
            if (i11 == 1) {
                r6Var = this.H1;
            } else {
                r6Var = null;
            }
            this.f45045b1.setEntry(r6Var);
            if (this.L1 == 1) {
                this.f45052d1.setVisibility(0);
                r6 r6Var10 = this.H1;
                if (r6Var10 != null && r6Var10.Y) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f0(z12, false);
                this.f45063g1.setVisibility(0);
                this.U0.x(-9982, false);
                ((og0) this.f45063g1.f6337c).a(this.U0.k(), false);
                this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                r6 r6Var11 = this.H1;
                if (r6Var11 != null && !TextUtils.isEmpty(r6Var11.f46041y)) {
                    this.f45052d1.setVisibility(8);
                    this.f45063g1.setVisibility(0);
                    ((og0) this.f45063g1.f6337c).a(true, false);
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f45045b1.setVisibility(0);
            r6 r6Var12 = this.H1;
            if (r6Var12 != null && r6Var12.f46034u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f45060f1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.Y0.setVisibility(0);
            this.U0.setVisibility(0);
            r6 r6Var13 = this.H1;
            if ((r6Var13 != null && r6Var13.J0 != 0) || this.f45099s0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.Z0.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V0.getLayoutParams();
            r6 r6Var14 = this.H1;
            if ((r6Var14 != null && r6Var14.J0 != 0) || this.f45099s0 != 0) {
                f10 = 12.0f;
            } else {
                f10 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f10);
            this.V0.setLayoutParams(layoutParams);
            this.f45068i0.setVisibility(0);
            this.f45068i0.clearFocus();
            r6 r6Var15 = this.H1;
            if (r6Var15 == null) {
                i13 = 86400;
            } else {
                i13 = r6Var15.I0;
            }
            this.Z0.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((r6Var2 = this.H1) == null || !r6Var2.f46008g)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Z0.setPeriodVisible(z4);
            r6 r6Var16 = this.H1;
            if (r6Var16 != null && r6Var16.f46023o0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Z0.setHasRoundVideo(z10);
            q9 q9Var = this.Z0;
            if (q9Var == null) {
                j10 = 0;
            } else {
                r6 r6Var17 = this.H1;
                if (r6Var17 == null || !r6Var17.f46020n) {
                    j10 = 0;
                    q9Var.v(null, null);
                } else {
                    TLRPC.Peer peer = r6Var17.f46026q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        r6 r6Var18 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        r6Var18.f46024p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        r6 r6Var19 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        r6Var19.f46024p = append;
                    }
                    String str3 = this.H1.f46030s;
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
            r6 r6Var20 = this.H1;
            if (r6Var20 != null && r6Var20.v() && this.H1.t()) {
                z11 = false;
            } else {
                z11 = true;
            }
            la laVar = this.W0;
            boolean z21 = laVar.f45678g0;
            laVar.f45678g0 = z11;
            laVar.f45676f0.f(z11, true);
            laVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.m0.setVisibility(0);
            this.f45092q1.setVisibility(0);
            r6 r6Var21 = this.H1;
            if (r6Var21 != null && r6Var21.f45996b0) {
                this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f45068i0.setVisibility(0);
            this.f45096r1.setVisibility(0);
        }
        if (i11 == 2) {
            this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.K1 = false;
            r6 r6Var22 = this.H1;
            if (r6Var22 != null && r6Var22.J0 != j10) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (r6Var22 != null && r6Var22.f46008g) {
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
            d5 d5Var = this.Y0;
            if (!TextUtils.equals(string, d5Var.d) || z22 != d5Var.f45229e) {
                d5Var.removeView(d5Var.f45228c);
                Context context = d5Var.getContext();
                d5Var.d = string;
                d5Var.f45229e = z22;
                c5 c5Var = new c5(d5Var, context, string, z22);
                d5Var.f45228c = c5Var;
                c5Var.setContentDescription(string);
                d5Var.addView(d5Var.f45228c, k7.c6.c(-2.0f, -2));
                d5Var.e();
            }
            this.f45092q1.setVisibility(8);
            this.f45096r1.setVisibility(8);
            if (!this.f45057e2) {
                r6 r6Var23 = this.H1;
                if (r6Var23 != null && r6Var23.f46034u) {
                    this.U0.l(r6Var23);
                } else {
                    this.U0.set(r6Var23);
                }
            }
            this.f45057e2 = false;
            xt editText = this.Z0.f45574f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                f8Var = null;
            } else {
                f8Var = new f8(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(f8Var);
            if (this.E1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f45042a1.setVisibility(i15);
            ArrayList arrayList = this.E1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.G1;
                ArrayList arrayList3 = this.F1;
                t8 t8Var = this.f45042a1;
                t8Var.c(false, false);
                t8Var.f45915c = arrayList;
                t8Var.d = arrayList2;
                t8Var.f45916e = arrayList3;
                t8Var.f45921w = new k01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                t8Var.H = new k01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                t8Var.f45914b.V2.N(false);
                this.f45042a1.setSelected(this.E1.indexOf(this.H1));
            }
            if (!z15 && !z16 && this.E1 == null && ((r6Var8 = this.H1) == null || (!r6Var8.v() && this.H1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.W0.setMaxCount(i16);
            if (i10 != 2) {
                r6 r6Var24 = this.H1;
                if (r6Var24 != null && (r6Var24.f45998c || r6Var24.f46008g || this.f45095r0)) {
                    if (r6Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    r6 r6Var25 = this.H1;
                    if (r6Var25.K && r6Var25.f45994a1 != null && (textureView = this.U0.getTextureView()) != null) {
                        textureView.setDelegate(new n8(this, 7));
                    }
                    this.Z0.setText(this.H1.C0);
                } else if (i10 != 2) {
                    q9 q9Var2 = this.Z0;
                    q9Var2.S = true;
                    q9Var2.f45574f.setText("");
                }
            }
            r6 r6Var26 = this.H1;
            if (r6Var26 != null && ((r6Var26.f46034u && !r6Var26.K) || r6Var26.v())) {
                z17 = false;
            } else {
                z17 = true;
            }
            this.Y0.d(4, z17);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (r6Var7 = this.H1) != null && !r6Var7.f46034u && !r6Var7.v()) {
                z18 = true;
            } else {
                z18 = false;
            }
            this.Y0.d(3, z18);
            if (!this.K1 && !this.Z0.o()) {
                oh.t6 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                oh.n6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.f17772a, B) || ((r6Var6 = this.H1) != null && (r6Var6.f46008g || r6Var6.J0 != j10))) {
                    z19 = true;
                    this.Y0.setShareEnabled(z19);
                    r6Var4 = this.H1;
                    if (r6Var4 == null && r6Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f45052d1.setImageResource(i17);
                    this.U0.setVisibility(0);
                    this.W0.setVisibility(0);
                    this.m0.setVisibility(0);
                    this.m0.setTranslationX(0.0f);
                    r6Var5 = this.H1;
                    if (r6Var5 == null && r6Var5.J0 != j10) {
                        this.m0.l("", false);
                    } else if (r6Var5 == null && r6Var5.f46008g) {
                        this.m0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (r6Var5 == null && r6Var5.f46034u) {
                        this.m0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (r6Var5 == null && r6Var5.f46020n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(this.m0, 32.0f, i18);
                        this.m0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(i5Var, 0, 1, 33);
                        if (this.H1.f46026q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.H1.f46026q.user_id));
                            i5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.H1.f46026q)));
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
            r6Var4 = this.H1;
            if (r6Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f45052d1.setImageResource(i17);
            this.U0.setVisibility(0);
            this.W0.setVisibility(0);
            this.m0.setVisibility(0);
            this.m0.setTranslationX(0.0f);
            r6Var5 = this.H1;
            if (r6Var5 == null) {
            }
            if (r6Var5 == null) {
            }
            if (r6Var5 == null) {
            }
            if (r6Var5 == null) {
            }
            this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z20 = true;
        }
        if (i10 == z20) {
            q9 q9Var3 = this.Z0;
            q70 q70Var = q9Var3.S0;
            if (q70Var != null) {
                q70Var.u();
                q9Var3.S0 = null;
            }
            this.f45066h1.e(z20);
            t8 t8Var2 = this.f45042a1;
            if (t8Var2.J) {
                t8Var2.c(false, z20);
            }
        }
        if (i11 == 2 && (r6Var3 = this.H1) != null) {
            if (r6Var3.f46004e0 < j10) {
                r6Var3.f46004e0 = j10;
            }
            this.J1 = r6Var3.f46004e0;
            if (this.U0.getDuration() < 100) {
                duration = this.H1.f46010h0;
            } else {
                duration = this.U0.getDuration();
            }
            r6 r6Var27 = this.H1;
            if (r6Var27.f46010h0 <= 0) {
                r6Var27.f46010h0 = duration;
            }
            File file = r6Var27.Z0;
            if (file == null) {
                file = r6Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            r6 r6Var28 = this.H1;
            this.f45092q1.o(false, absolutePath, r6Var28.f46010h0, r6Var28.P);
            r6 r6Var29 = this.H1;
            float f11 = (float) duration;
            long j11 = r6Var29.Z * f11;
            long j12 = r6Var29.f45993a0 * f11;
            la laVar2 = this.f45092q1;
            laVar2.W0 = j11;
            laVar2.X0 = j12;
            ga gaVar = laVar2.h;
            if (gaVar != null) {
                ga.a(gaVar, true);
            }
            c4 c4Var = new c4(this, 3);
            this.f45092q1.setDelegate(new c9(c4Var));
            float max = (((float) this.J1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f45092q1.setVideoLeft(max);
            this.f45092q1.setVideoRight(0.04f + max);
            c4Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        nf0 nf0Var = this.f45124z1;
        if (nf0Var != null) {
            nf0Var.setAllowTouch(false);
        }
        e3 e3Var2 = this.f45072j1;
        boolean z23 = true;
        if (e3Var2 != null) {
            e3Var2.e(true);
        }
        ic.e();
        q9 q9Var4 = this.Z0;
        if (q9Var4 != null) {
            f fVar = q9Var4.f45574f;
            fVar.d();
            fVar.k(true);
            this.Z0.f45568b0 = true;
        }
        p9 p9Var = this.U0;
        if (p9Var != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            p9Var.x(8, z14);
        }
        e9 e9Var = this.f45100s1;
        if (e9Var != null) {
            if (i11 != 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            e9Var.setCoverPreview(z13);
        }
        e3 e3Var3 = this.f45075k1;
        if (e3Var3 != null) {
            e3Var3.e(true);
        }
        o9 o9Var2 = this.f45116x0;
        o9Var2.setPreview((i11 == 1 && o9Var2.j()) ? false : false);
    }

    public final void P() {
        dg.m1 m1Var;
        int i10;
        if (this.f45048c0 == 0) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f45107u2 = new f8(this, 3);
            } else {
                Z(false);
            }
        }
        q9 q9Var = this.Z0;
        if (q9Var != null) {
            q9Var.f45574f.s();
        }
        q5 q5Var = this.L0;
        if (q5Var != null) {
            q5Var.h();
        }
        e5 e5Var = this.l1;
        if (e5Var != null) {
            oh.t6 storiesController = MessagesController.getInstance(e5Var.f45298a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f17778i.f(UserConfig.getInstance(storiesController.f17772a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            e5Var.f45299b = storiesController.f17773b.m() + i10 + 1;
            e5Var.f45300c.invalidate();
        }
        e9 e9Var = this.f45100s1;
        if (e9Var != null && (m1Var = e9Var.L0.d) != null) {
            m1Var.postRunnable(m1Var.f4613w);
        }
        p9 p9Var = this.U0;
        if (p9Var != null) {
            p9Var.x(0, false);
        }
        t0 t0Var = MessagesController.getInstance(this.f45047c).getStoriesController().f17791w;
        if (!t0Var.f46117c && !t0Var.d) {
            t0Var.d = true;
            q0 q0Var = new q0(t0Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(t0Var.f46115a);
            messagesStorage.getStorageQueue().postRunnable(new cr0((Object) messagesStorage, false, (Object) q0Var, 8));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z4;
        e9 e9Var;
        k9 k9Var;
        l9 l9Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        e9 e9Var2;
        if (i11 == 0) {
            this.f45074k0.setVisibility(8);
        }
        if (i10 == 0 && (e9Var2 = this.f45100s1) != null) {
            e9Var2.setVisibility(8);
        }
        if (i10 == -1) {
            this.Z0.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f45052d1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f45063g1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f45045b1.setVisibility(i14);
            ImageView imageView = this.f45060f1;
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
        if ((i11 == 0 || i10 == 0) && (e9Var = this.f45100s1) != null) {
            e9Var.f44922a1.setLayerType(0, null);
        }
        nf0 nf0Var = this.f45124z1;
        if (nf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            nf0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            k9 k9Var2 = this.f45086o1;
            if (k9Var2 != null) {
                k9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (k9Var = this.f45086o1) != null) {
            k9Var.setVisibility(8);
            this.f45086o1.setAppearProgress(0.0f);
            k9 k9Var3 = this.f45086o1;
            k9Var3.f45137x = null;
            a0 a0Var = k9Var3.f45132f;
            a0Var.I = null;
            a0Var.d = null;
            a0Var.G = false;
            k9Var3.d.setVisibility(8);
            k9Var3.f45128a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            l9 l9Var2 = this.f45089p1;
            if (l9Var2 != null) {
                l9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (l9Var = this.f45089p1) != null) {
            l9Var.setVisibility(8);
            this.f45089p1.setAppearProgress(0.0f);
            l9 l9Var3 = this.f45089p1;
            l9Var3.f45321b = null;
            a0 a0Var2 = l9Var3.h;
            a0Var2.I = null;
            a0Var2.d = null;
            a0Var2.G = false;
            l9Var3.f45323e.setVisibility(8);
            l9Var3.setVisibility(8);
        }
    }

    public final void R(v9 v9Var) {
        oh.n6 o10;
        aa aaVar;
        if (this.d) {
            return;
        }
        int i10 = this.f45047c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        int i11 = 0;
        this.f45095r0 = false;
        this.f45054e = false;
        this.f45122y2 = false;
        this.f45088p0.f45409g = false;
        WindowManager windowManager = this.f45058f;
        if (windowManager != null && (aaVar = this.f45081n) != null && aaVar.getParent() == null) {
            aa aaVar2 = this.f45081n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, aaVar2, layoutParams);
            windowManager.addView(this.f45081n, layoutParams);
            g0();
        }
        this.f45116x0.setCameraThumb(A());
        if (this.f45099s0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.E;
        if (v9Var != null) {
            this.C = v9Var;
            this.G = v9Var.f46276a;
            rectF.set(v9Var.f46278c);
            this.D = v9Var.f46277b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f45094r.c();
        int i12 = this.G;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f45055e0.setBackgroundColor(i11);
        this.f45094r.setTranslationX(0.0f);
        this.f45094r.setTranslationY(0.0f);
        this.f45094r.b(0.0f);
        this.f45094r.setScaleX(1.0f);
        this.f45094r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f45043b, 1);
        g(1.0f, true, new f8(this, 6));
        e();
        this.f45099s0 = 0L;
        this.f45102t0 = "";
    }

    public final void S(t9 t9Var, r6 r6Var, long j10) {
        int i10;
        aa aaVar;
        if (this.d) {
            return;
        }
        int i11 = this.f45047c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.c.b(i11);
            return;
        }
        this.f45095r0 = false;
        this.f45054e = false;
        this.f45122y2 = false;
        WindowManager windowManager = this.f45058f;
        if (windowManager != null && (aaVar = this.f45081n) != null && aaVar.getParent() == null) {
            aa aaVar2 = this.f45081n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, aaVar2, layoutParams);
            windowManager.addView(this.f45081n, layoutParams);
            g0();
        }
        this.H1 = r6Var;
        this.L1 = r6Var.K ? 1 : 0;
        this.f45088p0.f45409g = false;
        RectF rectF = this.E;
        if (t9Var != null) {
            this.C = t9Var;
            this.G = t9Var.f46276a;
            rectF.set(t9Var.f46278c);
            this.D = t9Var.f46277b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f45094r.c();
        int i12 = this.G;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f45055e0.setBackgroundColor(i10);
        this.f45094r.setTranslationX(0.0f);
        this.f45094r.setTranslationY(0.0f);
        this.f45094r.b(0.0f);
        this.f45094r.setScaleX(1.0f);
        this.f45094r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f45043b, 1);
        r6 r6Var2 = this.H1;
        if (r6Var2 != null) {
            this.Z0.setText(r6Var2.C0);
        }
        L(new s8(this, 0), j10);
        if (this.H1.f45996b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.Y0.b(false, false);
        e();
        this.f45099s0 = 0L;
        this.f45102t0 = "";
    }

    public final void T() {
        q70 q70Var;
        p9 p9Var = this.U0;
        if (p9Var != null) {
            p9Var.x(4, true);
        }
        q9 q9Var = this.Z0;
        if (q9Var != null && (q70Var = q9Var.S0) != null) {
            q70Var.u();
            q9Var.S0 = null;
        }
        fg.n1 n1Var = new fg.n1((org.telegram.ui.ActionBar.p2) new g9(this, 1), 14, false);
        n1Var.setOnDismissListener(new r8(this, 1));
        n1Var.show();
    }

    public final void U(t9 t9Var, r6 r6Var) {
        int i10;
        boolean z4;
        int i11;
        oh.n6 o10;
        aa aaVar;
        if (this.d) {
            return;
        }
        int i12 = this.f45047c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.c.b(i12);
            return;
        }
        this.f45095r0 = true;
        this.f45054e = false;
        this.f45122y2 = false;
        WindowManager windowManager = this.f45058f;
        if (windowManager != null && (aaVar = this.f45081n) != null && aaVar.getParent() == null) {
            aa aaVar2 = this.f45081n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, aaVar2, layoutParams);
            windowManager.addView(this.f45081n, layoutParams);
            g0();
        }
        this.H1 = r6Var;
        e8.a(i12, r6Var);
        r6 r6Var2 = this.H1;
        if (r6Var2 != null && r6Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.L1 = i10;
        if (r6Var2 != null && r6Var2.f46034u && i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f45088p0.f45409g = z4;
        if (this.f45099s0 == 0 && (o10 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o10.a(i12, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.E;
        if (t9Var != null) {
            this.C = t9Var;
            this.G = t9Var.f46276a;
            rectF.set(t9Var.f46278c);
            this.D = t9Var.f46277b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f45094r.c();
        int i13 = this.G;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f45055e0.setBackgroundColor(i11);
        this.f45094r.setTranslationX(0.0f);
        this.f45094r.setTranslationY(0.0f);
        this.f45094r.b(0.0f);
        this.f45094r.setScaleX(1.0f);
        this.f45094r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f45043b, 1);
        r6 r6Var3 = this.H1;
        if (r6Var3 != null) {
            this.Z0.setText(r6Var3.C0);
        }
        this.Y0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new f8(this, 6));
        e();
        this.f45099s0 = 0L;
        this.f45102t0 = "";
    }

    public final void V() {
        dg.o1 o1Var = this.f45103t1;
        if (o1Var != null) {
            o1Var.bringToFront();
        }
        View view = this.f45106u1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f45109v1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f45113w1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.f45117x1;
        if (view4 != null) {
            view4.bringToFront();
        }
        oa oaVar = this.f45079m1;
        if (oaVar != null) {
            oaVar.bringToFront();
        }
        nf0 nf0Var = this.f45124z1;
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
        e5 e5Var = this.l1;
        if (e5Var != null) {
            e5Var.bringToFront();
        }
        n nVar = this.f45083n1;
        if (nVar != null) {
            nVar.bringToFront();
        }
    }

    public final void W(r6 r6Var, boolean z4) {
        File file;
        View view;
        float f10;
        r6 r6Var2;
        boolean z10;
        int i10;
        if (r6Var != null && this.U0.getWidth() > 0 && this.U0.getHeight() > 0) {
            if (z4) {
                file = r6Var.O0;
            } else {
                file = r6Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.f45116x0.j()) {
                view = this.f45116x0;
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
            x61 textureView = this.U0.getTextureView();
            if (r6Var.K && !r6Var.f46034u && textureView != null) {
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
            File file2 = r6Var.Q0;
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
            File file3 = r6Var.P0;
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
            e9 e9Var = this.f45100s1;
            if (e9Var != null && e9Var.O0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                e9 e9Var2 = this.f45100s1;
                e9Var2.F0 = true;
                v4 v4Var = e9Var2.O0;
                v4Var.f5143a = true;
                v4Var.draw(canvas);
                e9 e9Var3 = this.f45100s1;
                e9Var3.O0.f5143a = false;
                e9Var3.F0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = r6.w(this.f45047c, "jpg");
            if (z4) {
                r6Var2 = r6Var;
                z10 = z4;
                Utilities.searchQueue.postRunnable(new hg.j(this, createBitmap, z10, w10, r6Var2, 21));
            } else {
                r6Var2 = r6Var;
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
                r6Var2.N0 = w10;
            }
            r6Var2.f45997b1 = createScaledBitmap;
        }
    }

    public final void X() {
        oh.n6 o10;
        int size;
        char c3;
        View[] viewPages;
        o51[] o51VarArr;
        c8 c8Var = this.f45082n0;
        BitmapDrawable bitmapDrawable = null;
        if (c8Var != null) {
            c8Var.dismiss();
            this.f45082n0 = null;
        }
        if (this.K1) {
            n0 n0Var = this.f45045b1;
            n0Var.getClass();
            n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            c5 c5Var = this.Y0.f45228c;
            int i10 = -this.R1;
            this.R1 = i10;
            AndroidUtilities.shakeViewSpring(c5Var, i10);
            return;
        }
        q9 q9Var = this.Z0;
        if (q9Var != null && q9Var.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.k6 k6Var = q9Var.v;
            int i11 = -this.R1;
            this.R1 = i11;
            AndroidUtilities.shakeViewSpring(k6Var, i11);
            q9Var.e();
            return;
        }
        r6 r6Var = this.H1;
        int i12 = this.f45047c;
        if ((r6Var == null || (!r6Var.f46008g && r6Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.H1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        oh.b bVar = this.f45040a;
        if (q9Var != null && !this.H1.D0) {
            CharSequence text = q9Var.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((t01[]) spannable.getSpans(0, text.length(), t01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new qc(this.f45081n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.k6.f21722gc, 0, new f8(this, 27), bVar)).k(true);
                    int i13 = -this.R1;
                    this.R1 = i13;
                    AndroidUtilities.shakeViewSpring(q9Var, i13);
                    return;
                }
            }
        }
        r6 r6Var2 = this.H1;
        if (!r6Var2.f46008g && r6Var2.J0 == 0) {
            if (this.K != 0) {
                r6Var2.f46036v0 = MessagesController.getInstance(i12).getInputPeer(this.K);
            }
            p9 p9Var = this.U0;
            p9Var.x(3, true);
            c8 c8Var2 = new c8(this.f45043b, this.H1.I0, bVar);
            c8Var2.q1(this.H1.E0);
            c8Var2.p1(this.H1.f46036v0);
            c8Var2.C = this.J;
            c8Var2.R = new g8(this, 14);
            c8Var2.e1(!this.f45116x0.j());
            ArrayList arrayList = this.F1;
            if (arrayList == null) {
                size = this.H1.r();
            } else {
                size = arrayList.size();
            }
            c8Var2.m1(size);
            c8Var2.k1(false);
            CharSequence text2 = q9Var.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (o51 o51Var : (o51[]) ((Spanned) text2).getSpans(0, text2.length(), o51.class)) {
                    if (o51Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(o51Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f20992id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
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
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f20992id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c3 = 1;
            }
            c8Var2.P = arrayList2;
            c8Var2.T = new g8(this, 15);
            c8Var2.U = new g8(this, 16);
            c8Var2.Q = new n8(this, 10);
            this.f45082n0 = c8Var2;
            r6 r6Var3 = this.H1;
            if (r6Var3.K) {
                if (p9Var != null && !r6Var3.f46007f0 && this.f45048c0 != 2) {
                    r6Var3.f46004e0 = p9Var.getCurrentPosition();
                    Utilities.Callback g8Var = new g8(this, 17);
                    View view = this.f45103t1;
                    View view2 = this.f45113w1;
                    View[] viewArr = new View[3];
                    viewArr[0] = p9Var;
                    viewArr[c3] = view;
                    viewArr[2] = view2;
                    p9Var.h(g8Var, viewArr);
                }
                c8 c8Var3 = this.f45082n0;
                Bitmap bitmap = this.H1.f46009g0;
                f8 f8Var = new f8(this, 20);
                if (bitmap != null) {
                    c8Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                c8Var3.Y = bitmapDrawable;
                c8Var3.Z = f8Var;
                ek ekVar = c8Var3.f45187b;
                if (ekVar != null) {
                    for (View view3 : ekVar.getViewPages()) {
                        if (view3 instanceof w7) {
                            w7 w7Var = (w7) view3;
                            w7Var.g(false);
                            w7Var.e(false);
                        }
                    }
                }
            }
            this.f45082n0.setOnDismissListener(new r8(this, 0));
            this.f45082n0.show();
            return;
        }
        r6Var2.f46017l = false;
        i(null);
        p0();
    }

    public final void Y(w9 w9Var) {
        int i10 = 0;
        RectF rectF = this.E;
        if (w9Var != null) {
            this.C = w9Var;
            this.G = w9Var.f46276a;
            rectF.set(w9Var.f46278c);
            this.D = w9Var.f46277b;
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
        this.f45055e0.setBackgroundColor(i10);
    }

    public final void Z(boolean z4) {
        Activity activity;
        boolean z10;
        if (!this.f45104t2 || z4) {
            this.f45090p2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f45043b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f45090p2 = z10;
                if (z10) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    pq pqVar = new pq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    pqVar.f30161e = dp;
                    pqVar.f30162f = dp2;
                    this.f45116x0.setCameraThumb(pqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f45040a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.k6.w0(null, org.telegram.ui.ActionBar.k6.L5, false), null);
                        alertDialog$Builder.f21168a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new n8(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f21168a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f45104t2 = true;
                }
            }
            if (!this.f45090p2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new f8(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        f9 f9Var = this.f45120y0;
        if (f9Var != null && f9Var.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new n71(this, this.f45120y0.getTextureView().getBitmap(), runnable, 20));
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
            animate.alpha(f10).setUpdateListener(new d9(this, 1)).setListener(new androidx.fragment.app.g(this, z4, view, 13)).setDuration(320L).setInterpolator(pr.h).start();
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
            this.f45058f.updateViewLayout(this.f45081n, layoutParams);
        } catch (Exception e6) {
            FileLog.e(e6);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        oh.n6 o10;
        r6 r6Var;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            q5 q5Var = this.L0;
            if (q5Var != null) {
                q5Var.h();
            }
            if (this.f45073j2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f45073j2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f45073j2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            q5 q5Var2 = this.L0;
            if (q5Var2 != null && !this.S1) {
                q5Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f45048c0;
            int i15 = this.f45047c;
            if (i14 == 1) {
                if (!this.K1 && !this.Z0.o()) {
                    oh.t6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    oh.n6 o11 = storiesController.o();
                    if (o11 == null || !o11.a(storiesController.f17772a, B) || ((r6Var = this.H1) != null && (r6Var.f46008g || r6Var.J0 != 0))) {
                        z4 = true;
                    }
                }
                this.Y0.setShareEnabled(z4);
            } else if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                r6 r6Var2 = this.H1;
                if (r6Var2 == null || r6Var2.J0 == 0) {
                    h0(o10, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f45047c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.B0.clearAnimation();
        f9 f9Var = this.f45120y0;
        if ((f9Var != null && f9Var.isDual()) || this.X1) {
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
        ma maVar = this.B0;
        if (maVar.f45780n != i10) {
            maVar.f45780n = i10;
            ValueAnimator valueAnimator = maVar.f45781r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                maVar.f45781r = null;
            }
            maVar.setDrawable(i10);
        }
        if (this.f45048c0 == 0 && !this.F0.f46152e && this.V1 != null && !I()) {
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
        Boolean bool = this.f45080m2;
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
                this.f45084n2 = new o8(this, z4, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f45076k2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f45076k2 = null;
            }
            o1.j jVar = this.f45078l2;
            if (jVar != null) {
                jVar.c();
                this.f45078l2 = null;
            }
            if (this.J0 == null) {
                if (z4) {
                    t(false);
                }
                if (this.J0 == null) {
                    return;
                }
            }
            b9 b9Var = this.J0;
            if (b9Var != null) {
                b9Var.H = false;
            }
            if (z4 && (o0Var = this.K0) != null) {
                o0Var.a(false);
            }
            int i11 = 4;
            s9 s9Var = this.f45094r;
            if (s9Var != null) {
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                s9Var.setImportantForAccessibility(i10);
            }
            b9 b9Var2 = this.J0;
            if (z4) {
                i11 = 0;
            }
            b9Var2.setImportantForAccessibility(i11);
            this.f45080m2 = Boolean.valueOf(z4);
            float translationY = this.J0.getTranslationY();
            aa aaVar = this.f45081n;
            if (z4) {
                height = 0.0f;
            } else {
                height = (aaVar.getHeight() - this.J0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, aaVar.getHeight());
            b9 b9Var3 = this.J0;
            b9Var3.H = !z4;
            if (this.f45064g2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f45067h2 = z10;
            if (z4) {
                o1.j jVar2 = new o1.j(b9Var3, o1.h.f16321n, height);
                this.f45078l2 = jVar2;
                jVar2.f16338u.a(0.75f);
                this.f45078l2.f16338u.b(350.0f);
                this.f45078l2.a(new kg0(this, height, 1));
                this.f45078l2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f45076k2 = ofFloat;
                ofFloat.addUpdateListener(new p8(this, 0));
                this.f45076k2.addListener(new a9(this, 1));
                this.f45076k2.setDuration(450L);
                this.f45076k2.setInterpolator(pr.h);
                this.f45076k2.start();
            }
            if (!z4 && !this.P1) {
                this.f45070i2 = null;
            }
            if (!z4 && this.f45048c0 == 0 && !this.f45090p2) {
                r();
            }
        }
    }

    public final void f0(boolean z4, boolean z10) {
        if (this.f45049c1 == null) {
            hj0 hj0Var = new hj0(R.raw.media_mute_unmute, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f45049c1 = hj0Var;
            hj0Var.C *= 1.5f;
        }
        this.f45052d1.setAnimation(this.f45049c1);
        int i10 = 20;
        if (!z10) {
            hj0 hj0Var2 = this.f45049c1;
            if (!z4) {
                i10 = 0;
            }
            hj0Var2.L(i10, false, false);
        } else if (z4) {
            hj0 hj0Var3 = this.f45049c1;
            if (hj0Var3.Y > 20) {
                hj0Var3.L(0, false, false);
            }
            this.f45049c1.N(20);
            this.f45049c1.start();
        } else {
            hj0 hj0Var4 = this.f45049c1;
            int i11 = hj0Var4.Y;
            if (i11 != 0 && i11 < 43) {
                hj0Var4.N(43);
                this.f45049c1.start();
            }
        }
    }

    public final void g(float f10, boolean z4, Runnable runnable) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        s9 s9Var = this.f45094r;
        if (z4) {
            this.M.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.I = Float.valueOf(this.H);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new p8(this, 5));
            this.B.addListener(new mh.k5(this, f10, runnable, 4));
            if (f10 < 1.0f && this.v) {
                this.B.setDuration(250L);
                this.B.setInterpolator(pr.h);
            } else if (f10 <= 0.0f && s9Var.f46106a >= AndroidUtilities.dp(20.0f)) {
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
        s9Var.invalidate();
        this.f45081n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f45081n.findOnBackInvokedDispatcher()) == null) {
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
            e3 e3Var = this.f45069i1;
            if (e3Var != null) {
                e3Var.e(true);
            }
            e3 e3Var2 = this.f45072j1;
            if (e3Var2 != null) {
                e3Var2.e(true);
            }
            e3 e3Var3 = this.f45066h1;
            if (e3Var3 != null) {
                e3Var3.e(true);
            }
            e3 e3Var4 = this.T0;
            if (e3Var4 != null) {
                e3Var4.e(true);
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
        if (z4 && (uVar = this.F0) != null && uVar.f46152e) {
            uVar.a(false, z10);
        }
        m0(z10);
        u8 u8Var = this.N0;
        d3 d3Var = this.R0;
        d3 d3Var2 = this.Q0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.W1 = animatorSet2;
            Property property = View.ALPHA;
            if (z4 && this.f45048c0 == 0 && !I()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(d3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z4 && this.f45048c0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(d3Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(d3Var, property, (!z4 && this.f45048c0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z4 && this.f45048c0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(d3Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(u8Var, property, (z4 || this.f45048c0 != 0 || I()) ? 0.0f : 0.0f);
            if (z4 || this.f45048c0 != 0 || I()) {
                f14 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(u8Var, property2, f14));
            this.W1.setDuration(260L);
            this.W1.setInterpolator(pr.h);
            this.W1.start();
            return;
        }
        if (z4 && this.f45048c0 == 0 && !I()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        d3Var2.setAlpha(f10);
        if (z4 && this.f45048c0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        d3Var2.setTranslationY(dp);
        d3Var.setAlpha((!z4 && this.f45048c0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z4 && this.f45048c0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        d3Var.setTranslationY(dp2);
        u8Var.setAlpha((z4 || this.f45048c0 != 0 || I()) ? 0.0f : 0.0f);
        if (z4 || this.f45048c0 != 0 || I()) {
            f14 = AndroidUtilities.dp(16.0f);
        }
        u8Var.setTranslationY(f14);
    }

    public final void h0(oh.n6 n6Var, boolean z4) {
        if (this.f45114w2) {
            return;
        }
        fg.v0 v0Var = new fg.v0(n6Var.b(), this.f45047c, this.f45043b, new g9(this, 0), null);
        v0Var.U = B();
        v0Var.setOnDismissListener(new f80(2, this, z4));
        this.U0.x(7, true);
        this.f45114w2 = true;
        v0Var.show();
    }

    public final void i(Runnable runnable) {
        r6 r6Var;
        Runnable runnable2;
        p9 p9Var;
        float f10;
        boolean z4;
        Bitmap.CompressFormat compressFormat;
        pf0 pf0Var = this.f45121y1;
        if (pf0Var != null && (r6Var = this.H1) != null) {
            r6Var.f46013j = pf0Var.d() | r6Var.f46013j;
            r6 r6Var2 = this.H1;
            pf0 pf0Var2 = this.f45121y1;
            File file = r6Var2.Z0;
            if (file != null) {
                file.delete();
                r6Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = pf0Var2.getSavedFilterState();
            r6Var2.f45994a1 = savedFilterState;
            if (!r6Var2.K) {
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
                        int i10 = r6Var2.R;
                        float f11 = 1.0f;
                        if (i10 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i10 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, r6Var2.f46016k0 / 2.0f, r6Var2.f46018l0 / 2.0f);
                        matrix.postRotate(-r6Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        r6Var2.f46021n0.preScale(r6Var2.f46016k0 / createBitmap.getWidth(), r6Var2.f46018l0 / createBitmap.getHeight());
                        r6Var2.f46016k0 = createBitmap.getWidth();
                        r6Var2.f46018l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = r6Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            r6Var2.Z0.delete();
                        }
                        String k10 = r6.k(r6Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        int i11 = r6Var2.f45992a;
                        if (!z4) {
                            str = "jpg";
                        }
                        r6Var2.Z0 = r6.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(r6Var2.Z0);
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
                            Utilities.themeQueue.postRunnable(new dg.t0(r6Var2, createBitmap, z4, runnable2, 26));
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
                r6 r6Var3 = this.H1;
                if (!r6Var3.K && (p9Var = this.U0) != null) {
                    p9Var.set(r6Var3);
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
                animate.alpha(f10).setDuration(350L).setInterpolator(pr.h).withEndAction(new o8(this, z4, 1)).start();
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
        if (this.H1 != null && this.A1 != null && this.f45055e0.getMeasuredWidth() > 0 && this.f45055e0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.H1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f45055e0.getMeasuredWidth() / 2.0f, this.f45055e0.getMeasuredHeight() / 2.0f);
                if ((this.H1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f45055e0.getMeasuredWidth() / this.f45055e0.getMeasuredHeight(), this.f45055e0.getMeasuredHeight() / this.f45055e0.getMeasuredWidth(), this.f45055e0.getMeasuredWidth() / 2.0f, this.f45055e0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f45055e0.getMeasuredWidth()) * this.H1.f46016k0, (1.0f / this.f45055e0.getMeasuredHeight()) * this.H1.f46018l0);
            matrix.postConcat(this.H1.f46021n0);
            matrix.postScale(this.f45055e0.getMeasuredWidth() / this.H1.f46012i0, this.f45055e0.getMeasuredHeight() / this.H1.f46014j0);
            this.A1.setTransform(matrix);
            this.A1.invalidate();
        }
    }

    public final void j0(boolean z4) {
        Integer num;
        float f10;
        h91 h91Var = this.S0;
        if ((h91Var.getTag() != null && z4) || (h91Var.getTag() == null && !z4)) {
            if (z4) {
                Runnable runnable = this.f45046b2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                f8 f8Var = new f8(this, 25);
                this.f45046b2 = f8Var;
                AndroidUtilities.runOnUIThread(f8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f45050c2;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z4) {
            num = 1;
        } else {
            num = null;
        }
        h91Var.setTag(num);
        AnimatorSet animatorSet2 = new AnimatorSet();
        this.f45050c2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z4) {
            h91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f45050c2;
        Property property = View.ALPHA;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(h91Var, property, f10));
        this.f45050c2.addListener(new vd1(13, this, z4));
        this.f45050c2.start();
        if (z4) {
            f8 f8Var2 = new f8(this, 26);
            this.f45046b2 = f8Var2;
            AndroidUtilities.runOnUIThread(f8Var2, 2000L);
        }
    }

    public final void k() {
        oh.j3 j3Var;
        if (this.G == 1) {
            RectF rectF = this.f45041a0;
            rectF.set(this.f45055e0.getLeft(), this.f45055e0.getTop(), this.f45055e0.getMeasuredWidth(), this.f45055e0.getMeasuredHeight());
            rectF.offset(this.f45094r.getX(), this.f45094r.getY());
            float f10 = this.F;
            RectF rectF2 = this.E;
            RectF rectF3 = this.Z;
            AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
            this.f45055e0.setAlpha(this.F);
            float f11 = rectF3.left;
            m9 m9Var = this.f45055e0;
            m9Var.setTranslationX((f11 - m9Var.getLeft()) - this.f45094r.getX());
            float f12 = rectF3.top;
            m9 m9Var2 = this.f45055e0;
            m9Var2.setTranslationY((f12 - m9Var2.getTop()) - this.f45094r.getY());
            w9 w9Var = this.C;
            if (w9Var != null && (j3Var = w9Var.f46280f) != null) {
                j3Var.setTranslationX((rectF.left - rectF2.left) * this.F);
                this.C.f46280f.setTranslationY((rectF.top - rectF2.top) * this.F);
            }
            this.f45055e0.setScaleX(rectF3.width() / this.f45055e0.getMeasuredWidth());
            this.f45055e0.setScaleY(rectF3.height() / this.f45055e0.getMeasuredHeight());
            this.f45059f0.setAlpha(this.F);
            this.f45065h0.setAlpha(this.F);
            this.f45068i0.setAlpha(this.F);
            if (this.f45048c0 == 2) {
                this.f45096r1.setAlpha(this.F);
            }
        }
    }

    public final void k0() {
        c8 c8Var = this.f45082n0;
        if (c8Var != null) {
            c8Var.dismiss();
            this.f45082n0 = null;
        }
        c8 c8Var2 = new c8(this.f45043b, 86400, this.f45040a);
        c8Var2.o1();
        c8Var2.q1(this.f45108v0);
        TLRPC.InputPeer inputPeer = this.f45105u0;
        if (inputPeer == null) {
            if (this.K != 0) {
                inputPeer = MessagesController.getInstance(this.f45047c).getInputPeer(this.K);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        c8Var2.p1(inputPeer);
        c8Var2.C = this.J;
        c8Var2.R = new g8(this, 18);
        c8Var2.e1(false);
        c8Var2.m1(1);
        c8Var2.k1(false);
        c8Var2.T = new g8(this, 19);
        c8Var2.Q = new n8(this, 12);
        this.f45082n0 = c8Var2;
        c8Var2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: qh.ba.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: qh.ba.l0(int, boolean, boolean):void");
    }

    public final void m() {
        r6 r6Var;
        boolean z4;
        if (this.f45100s1 != null && (r6Var = this.H1) != null && r6Var.f46034u) {
            File file = r6Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
                this.H1.W0 = null;
            }
            this.H1.W0 = r6.w(this.f45047c, "webp");
            e9 e9Var = this.f45100s1;
            r6 r6Var2 = this.H1;
            ArrayList arrayList = r6Var2.T0;
            if (this.L1 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            Bitmap t02 = e9Var.t0(arrayList, false, false, true, z4, r6Var2);
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
        f9 f9Var;
        boolean z16 = false;
        if (this.f45048c0 == 0 && this.L1 == 1 && !this.F0.f46152e && !I()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(z10, z4);
        this.D0.setSelected(this.f45116x0.j());
        u uVar = this.F0;
        if (uVar != null && uVar.f46152e) {
            z11 = false;
        } else {
            z11 = true;
        }
        c0(this.f45074k0, z11, z4);
        if (!this.X1 && this.L1 != -1 && this.f45048c0 == 0 && this.V1 != null && !this.F0.f46152e && !I()) {
            z12 = true;
        } else {
            z12 = false;
        }
        c0(this.B0, z12, z4);
        if (!this.X1 && this.L1 != -1 && this.f45048c0 == 0 && (f9Var = this.f45120y0) != null && f9Var.f46187a && !this.F0.f46152e && !this.f45116x0.j()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.C0, z13, z4);
        if (!this.X1 && this.L1 != -1 && this.f45048c0 == 0 && !this.F0.f46152e) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.D0, z14, z4);
        c0(this.E0, this.F0.f46152e, z4);
        if (this.f45116x0.j()) {
            f10 = this.f45116x0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.L0.e(f10, z4);
        boolean z17 = this.F0.f46152e;
        e3 e3Var = this.f45075k1;
        if (z17) {
            e3Var.u();
        } else {
            e3Var.e(true);
        }
        h(this.X1, z4);
        if (this.L1 == -1 && this.f45048c0 == 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        AndroidUtilities.updateViewShow(this.P0, z15);
        if (this.L1 == -1 && this.f45048c0 == 0) {
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
        this.f45074k0.setTranslationX(0.0f);
        float alpha5 = this.f45074k0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        org.telegram.ui.k3 k3Var = this.F0.f46149a;
        k3Var.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        k3Var.invalidate();
    }

    public final void o() {
        boolean z4;
        if (this.H == 0.0f && this.F >= 1.0f && !this.f45122y2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 == this.f45118x2) {
            return;
        }
        lf.s0 s0Var = this.f45119y;
        if (s0Var != null) {
            s0Var.a(!z4);
        }
        this.f45118x2 = z4;
    }

    public final void o0(boolean z4) {
        int i10;
        hj0 hj0Var = this.f45056e1;
        if (hj0Var != null) {
            int[] iArr = hj0Var.f27524e;
            int i11 = 0;
            if (z4) {
                r6 r6Var = this.H1;
                if (r6Var != null && r6Var.f46042y0) {
                    i11 = iArr[0];
                }
                hj0Var.N(i11);
                hj0 hj0Var2 = this.f45056e1;
                if (hj0Var2 != null) {
                    hj0Var2.start();
                    return;
                }
                return;
            }
            r6 r6Var2 = this.H1;
            if (r6Var2 != null && r6Var2.f46042y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            hj0Var.L(i10, false, true);
            this.f45056e1.N(i10);
            ImageView imageView = this.f45060f1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f45093q2 < 0) {
            this.f45093q2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f45097r2 = arrayList;
            arrayList.add("off");
            this.f45097r2.add("auto");
            this.f45097r2.add("on");
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            c2 c2Var = this.f45098s;
            c2Var.f45159o = f10;
            c2Var.f45158n = c2.f(f10);
            c2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            c2 c2Var2 = this.f45098s;
            c2Var2.f45160p = f11;
            c2Var2.i();
        }
    }

    public final void p0() {
        if (this.T1) {
            return;
        }
        this.T1 = true;
        f8 f8Var = new f8(this, 2);
        e9 e9Var = this.f45100s1;
        r6 r6Var = this.H1;
        if (e9Var != null && r6Var != null) {
            r6Var.f();
            boolean u02 = e9Var.u0();
            boolean z4 = e9Var.L0.getPainting().E;
            Utilities.searchQueue.postRunnable(new i8(this, e9Var, r6Var.f46012i0, r6Var.f46014j0, r6Var, z4, u02, f8Var, 1));
            return;
        }
        f8Var.run();
    }

    public final void q(boolean z4) {
        p9 p9Var;
        if (this.d) {
            c8 c8Var = this.f45082n0;
            if (c8Var != null) {
                c8Var.dismiss();
                this.f45082n0 = null;
            }
            r6 r6Var = this.H1;
            long j10 = 0;
            if (r6Var != null && !r6Var.h) {
                if ((this.v && r6Var.f46008g) || r6Var.f45995b != 0) {
                    r6Var.f46013j = false;
                }
                r6Var.i(false);
            }
            this.H1 = null;
            Utilities.Callback4 callback4 = this.O;
            if (callback4 != null && (p9Var = this.U0) != null) {
                if (this.f45054e) {
                    return;
                }
                this.f45054e = true;
                j71 j71Var = p9Var.f45465y;
                if (j71Var != null) {
                    j71Var.B();
                    p9Var.f45465y.H();
                    p9Var.f45465y = null;
                }
                j71 j71Var2 = p9Var.f45463x;
                if (j71Var2 != null) {
                    j10 = j71Var2.n();
                    p9Var.f45463x.B();
                    p9Var.f45463x.H();
                    p9Var.f45463x = null;
                }
                j71 j71Var3 = p9Var.f45439e;
                if (j71Var3 != null) {
                    j10 = j71Var3.n();
                    p9Var.f45439e.B();
                    p9Var.f45439e.H();
                    p9Var.f45439e = null;
                }
                callback4.run(Long.valueOf(j10), new o8(this, z4, 2), Boolean.valueOf(this.v), Long.valueOf(this.f45111w));
                return;
            }
            p9 p9Var2 = this.U0;
            if (p9Var2 != null && !z4) {
                p9Var2.set(null);
            }
            g(0.0f, z4, new f8(this, 23));
            int i10 = this.G;
            if (i10 == 1 || i10 == 0) {
                this.f45081n.setBackgroundColor(0);
                this.Y0.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f45047c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        f9 f9Var;
        if ((this.M1 || this.N1) && (f9Var = this.f45120y0) != null && f9Var.isFrontface()) {
            int i10 = this.f45093q2;
            if (i10 == 2 || (i10 == 1 && this.Z1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z4;
        Activity activity = this.f45043b;
        if (this.f45120y0 == null && activity != null) {
            this.f45120y0 = new f9(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            q5 q5Var = this.L0;
            float f10 = 0.0f;
            if (q5Var != null) {
                q5Var.f45931d0 = 0.0f;
                q5Var.f45933e0.d(0.0f, true);
            }
            this.f45120y0.recordHevc = !this.f45116x0.j();
            this.f45120y0.setThumbDrawable(A());
            this.f45120y0.initTexture();
            this.f45120y0.setDelegate(new n8(this, 0));
            na naVar = this.C0;
            if (this.f45120y0.f46187a && this.f45048c0 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c0(naVar, z4, true);
            v vVar = this.D0;
            if (!this.f45120y0.f46187a) {
                f10 = AndroidUtilities.dp(46.0f);
            }
            vVar.setTranslationX(f10);
            this.f45116x0.setCameraView(this.f45120y0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.T0.u();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!v0.q(this.f45120y0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", v0.p(ApplicationLoader.applicationContext, false))) && this.f45120y0.f46187a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.f45069i1.u();
            }
            if (this.f45123z0 == null) {
                this.f45123z0 = new m5(activity, new g8(this, 3));
            }
            this.f45123z0.a(this.f45120y0);
            a6 a6Var = this.A0;
            if (a6Var != null) {
                o9 o9Var = this.f45116x0;
                Object blurRenderNode = o9Var.getBlurRenderNode();
                a6Var.C = o9Var;
                a6Var.D = blurRenderNode;
                a6Var.invalidate();
            }
        }
    }

    public final void s() {
        r6 r6Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.f45121y1 == null && (r6Var = this.H1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!r6Var.K) {
                if (r6Var.Z0 == null) {
                    q10 = this.U0.getPhotoBitmap();
                } else {
                    n8 n8Var = new n8(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q10 = r6.q(n8Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.H1.K) {
                x61 textureView = this.U0.getTextureView();
                int orientation = this.U0.getOrientation();
                r6 r6Var2 = this.H1;
                if (r6Var2 != null) {
                    savedFilterState = r6Var2.f45994a1;
                }
                pf0 pf0Var = new pf0(this.f45043b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f45085o0, this.f45040a);
                this.f45121y1 = pf0Var;
                this.f45094r.addView(pf0Var);
                nf0 nf0Var = this.f45124z1;
                if (nf0Var != null) {
                    nf0Var.setFilterView(this.f45121y1);
                }
                TextureView myTextureView = this.f45121y1.getMyTextureView();
                this.A1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.U0.o(this.A1, this.f45121y1);
                TextureView textureView2 = this.A1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.A1.animate().alpha(1.0f).setDuration(220L).start();
                }
                j();
                ef0 blurControl = this.f45121y1.getBlurControl();
                this.B1 = blurControl;
                if (blurControl != null) {
                    this.f45055e0.addView(blurControl);
                }
                gf0 curveControl = this.f45121y1.getCurveControl();
                this.C1 = curveControl;
                if (curveControl != null) {
                    this.f45055e0.addView(curveControl);
                }
                V();
                this.f45121y1.getDoneTextView().setOnClickListener(new h8(this, 13));
                this.f45121y1.getCancelTextView().setOnClickListener(new h8(this, 14));
                this.f45121y1.getToolsView().setVisibility(8);
                this.f45121y1.getToolsView().setAlpha(0.0f);
                this.f45121y1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.f45121y1.f30057f0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z4) {
        boolean z10;
        boolean z11;
        if (this.J0 != null) {
            o9 o9Var = this.f45116x0;
            if (o9Var != null && o9Var.j()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == this.J0.M) {
                return;
            }
        }
        if (this.f45043b == null) {
            return;
        }
        if (this.J0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f45073j2;
        boolean z12 = !z4;
        o9 o9Var2 = this.f45116x0;
        if (o9Var2 != null && o9Var2.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        b9 b9Var = new b9(this, this.f45047c, this.f45043b, this.f45040a, albumEntry, z4, z12, z10);
        this.J0 = b9Var;
        b9Var.D.setVisibility(8);
        this.J0.setMultipleOnClick(this.f45116x0.j());
        this.J0.setMaxCount(Math.min(10, r.b() - this.f45116x0.getFilledCount()));
        this.J0.setOnBackClickListener(new s8(this, 1));
        this.J0.setOnSelectListener(new ry0(z4, this, 1));
        this.J0.setOnSelectMultipleListener(new mh.n1(this, 2));
        f2.i0 i0Var = this.f45070i2;
        if (i0Var != null) {
            l2 l2Var = this.J0.f46393e;
            l2Var.B = i0Var;
            l2Var.l0();
        }
        this.f45081n.addView(this.J0, k7.c6.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: qh.ba.u():void");
    }

    public final void v(boolean z4) {
        m5 m5Var = this.f45123z0;
        if (m5Var != null) {
            m5Var.f45749f = null;
            Utilities.globalQueue.cancelRunnable(m5Var.h);
            this.f45123z0 = null;
            o9 o9Var = this.f45116x0;
            if (o9Var != null) {
                o9Var.f46326c.a(null);
            }
        }
        a6 a6Var = this.A0;
        if (a6Var != null) {
            a6Var.C = null;
            a6Var.D = null;
            a6Var.invalidate();
        }
        if (this.f45120y0 != null) {
            if (z4) {
                b0(new f8(this, 8));
                return;
            }
            b0(new f8(this, 9));
            this.f45120y0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.f45120y0);
            o9 o9Var2 = this.f45116x0;
            if (o9Var2 != null) {
                o9Var2.setCameraView(null);
            }
            this.f45120y0 = null;
        }
    }

    public final void w() {
        b9 b9Var = this.J0;
        if (b9Var == null) {
            return;
        }
        this.f45081n.removeView(b9Var);
        this.J0 = null;
        ValueAnimator valueAnimator = this.f45076k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f45076k2 = null;
        }
        o1.j jVar = this.f45078l2;
        if (jVar != null) {
            jVar.c();
            this.f45078l2 = null;
        }
        this.f45080m2 = null;
    }

    public final void y() {
        pf0 pf0Var = this.f45121y1;
        if (pf0Var == null) {
            return;
        }
        pf0Var.e();
        this.f45124z1.setFilterView(null);
        this.f45094r.removeView(this.f45121y1);
        TextureView textureView = this.A1;
        if (textureView != null) {
            this.f45055e0.removeView(textureView);
            this.A1 = null;
        }
        this.U0.o(null, null);
        ef0 ef0Var = this.B1;
        if (ef0Var != null) {
            this.f45055e0.removeView(ef0Var);
            this.B1 = null;
        }
        gf0 gf0Var = this.C1;
        if (gf0Var != null) {
            this.f45055e0.removeView(gf0Var);
            this.C1 = null;
        }
        this.f45121y1 = null;
    }

    public final void z() {
        e9 e9Var = this.f45100s1;
        if (e9Var != null) {
            e9Var.O0.removeAllViews();
            e9 e9Var2 = this.f45100s1;
            e9Var2.L0.h();
            e9Var2.O0.setVisibility(8);
            e9Var2.N0.setVisibility(8);
            e9Var2.B0.postRunnable(new sj0(14));
            k4 k4Var = e9Var2.f44936h2;
            if (k4Var != null) {
                k4Var.dismiss();
            }
            dg.e0 e0Var = e9Var2.Q1;
            if (e0Var != null) {
                e0Var.dismiss();
            }
            this.f45094r.removeView(this.f45100s1);
            this.f45100s1 = null;
            dg.o1 o1Var = this.f45103t1;
            if (o1Var != null) {
                this.f45055e0.removeView(o1Var);
                this.f45103t1 = null;
            }
            View view = this.f45109v1;
            if (view != null) {
                this.f45055e0.removeView(view);
                this.f45109v1 = null;
            }
            View view2 = this.f45106u1;
            if (view2 != null) {
                this.f45055e0.removeView(view2);
                this.f45106u1 = null;
            }
            View view3 = this.f45113w1;
            if (view3 != null) {
                this.f45055e0.removeView(view3);
                this.f45113w1 = null;
            }
            View view4 = this.f45117x1;
            if (view4 != null) {
                this.f45055e0.removeView(view4);
                this.f45117x1 = null;
            }
        }
    }
}
