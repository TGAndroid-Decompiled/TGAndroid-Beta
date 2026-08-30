package ph;

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
import org.telegram.ui.Components.cc0;
import org.telegram.ui.Components.cf0;
import org.telegram.ui.Components.d80;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.h91;
import org.telegram.ui.Components.hm;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.ig0;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.jj0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.lf0;
import org.telegram.ui.Components.m71;
import org.telegram.ui.Components.mg0;
import org.telegram.ui.Components.nf0;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.nv;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.p51;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rp;
import org.telegram.ui.Components.t01;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.w61;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c21;
import org.telegram.ui.ek;
import org.telegram.ui.gw0;
import org.telegram.ui.ky0;
import org.telegram.ui.l61;
import org.telegram.ui.vq0;
public final class da implements NotificationCenter.NotificationCenterDelegate {
    public static da C2;
    public final d6 A0;
    public TextureView A1;
    public float A2;
    public ValueAnimator B;
    public final pa B0;
    public cf0 B1;
    public ValueAnimator B2;
    public y9 C;
    public final qa C0;
    public ef0 C1;
    public float D;
    public final v D0;
    public File D1;
    public final RectF E;
    public final pa E0;
    public ArrayList E1;
    public float F;
    public final u F0;
    public ArrayList F1;
    public int G;
    public final ta G0;
    public ArrayList G1;
    public float H;
    public boolean H0;
    public u6 H1;
    public Float I;
    public boolean I0;
    public boolean I1;
    public boolean J;
    public e9 J0;
    public long J1;
    public long K;
    public o0 K0;
    public boolean K1;
    public boolean L;
    public final t5 L0;
    public int L1;
    public final AnimationNotificationsLocker M;
    public final d M0;
    public boolean M1;
    public Runnable N;
    public final x8 N0;
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
    public final h91 S0;
    public boolean S1;
    public boolean T;
    public final f3 T0;
    public boolean T1;
    public boolean U;
    public final s9 U0;
    public boolean U1;
    public int V;
    public final FrameLayout V0;
    public String V1;
    public int W;
    public final oa W0;
    public AnimatorSet W1;
    public int X;
    public final sa X0;
    public boolean X1;
    public int Y;
    public final f5 Y0;
    public boolean Y1;
    public final RectF Z;
    public final t9 Z0;
    public boolean Z1;
    public final nh.b f41472a;
    public final RectF f41473a0;
    public final w8 f41474a1;
    public boolean a2;
    public final Activity f41475b;
    public final Path f41476b0;
    public final n0 f41477b1;
    public Runnable f41478b2;
    public final int f41479c;
    public int f41480c0;
    public gj0 f41481c1;
    public AnimatorSet f41482c2;
    public boolean d;
    public int f41483d0;
    public final jj0 f41484d1;
    public n8 f41485d2;
    public boolean e;
    public final p9 f41486e0;
    public gj0 f41487e1;
    public boolean f41488e2;
    public final WindowManager f41489f;
    public final FrameLayout f41490f0;
    public ImageView f41491f1;
    public AnimatorSet f41492f2;
    public final LinearLayout f41493g0;
    public final eg.i0 f41494g1;
    public ValueAnimator f41495g2;
    public final WindowManager.LayoutParams h;
    public final FrameLayout f41496h0;
    public final f3 f41497h1;
    public boolean f41498h2;
    public final q9 f41499i0;
    public final f3 f41500i1;
    public f2.h0 f41501i2;
    public final FrameLayout f41502j0;
    public final f3 f41503j1;
    public MediaController.AlbumEntry f41504j2;
    public final b2 f41505k0;
    public final f3 f41506k1;
    public ValueAnimator f41507k2;
    public final n6 f41508l0;
    public final g5 l1;
    public o1.j f41509l2;
    public final org.telegram.ui.ActionBar.k5 m0;
    public final ra f41510m1;
    public Boolean f41511m2;
    public final ca f41512n;
    public f8 f41513n0;
    public n f41514n1;
    public r8 f41515n2;
    public final org.telegram.ui.Components.ba f41516o0;
    public n9 f41517o1;
    public AnimatorSet f41518o2;
    public final k5 f41519p0;
    public o9 f41520p1;
    public boolean f41521p2;
    public final gw0 f41522q0;
    public final oa f41523q1;
    public int f41524q2;
    public final v9 f41525r;
    public boolean f41526r0;
    public final d f41527r1;
    public ArrayList f41528r2;
    public final d2 f41529s;
    public long f41530s0;
    public h9 f41531s1;
    public FrameLayout f41532s2;
    public String f41533t0;
    public cg.p1 f41534t1;
    public boolean f41535t2;
    public TLRPC.InputPeer f41536u0;
    public View f41537u1;
    public h8 f41538u2;
    public boolean v;
    public d8 f41539v0;
    public View f41540v1;
    public hm f41541v2;
    public long f41542w;
    public r f41543w0;
    public View f41544w1;
    public boolean f41545w2;
    public u9 f41546x;
    public final r9 f41547x0;
    public View f41548x1;
    public boolean f41549x2;
    public final lf.s0 f41550y;
    public i9 f41551y0;
    public nf0 f41552y1;
    public boolean f41553y2;
    public p5 f41554z0;
    public final lf0 f41555z1;
    public uo f41556z2;

    public da(Activity activity, int i10) {
        lf.s0 s0Var;
        int i11;
        int i12;
        int i13;
        float f10;
        int i14;
        boolean z4;
        float f11;
        nh.b bVar = new nh.b();
        this.f41472a = bVar;
        this.f41542w = 0L;
        this.E = new RectF();
        this.J = true;
        this.M = new AnimationNotificationsLocker();
        this.Z = new RectF();
        this.f41473a0 = new RectF();
        this.f41476b0 = new Path();
        new Rect();
        this.f41480c0 = 0;
        this.f41483d0 = -1;
        this.f41539v0 = new d8();
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
        a9 a9Var = new a9(this);
        this.a2 = true;
        this.f41498h2 = true;
        this.f41524q2 = -1;
        this.f41475b = activity;
        this.f41479c = i10;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            s0Var = new lf.s0(launchActivity, true);
        } else {
            s0Var = null;
        }
        this.f41550y = s0Var;
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
        this.f41489f = windowManager;
        ca caVar = new ca(this, activity);
        this.f41512n = caVar;
        q8 q8Var = new q8(this, 1);
        WeakHashMap weakHashMap = r0.j0.f43118a;
        r0.b0.j(caVar, q8Var);
        this.f41512n.setFocusable(true);
        this.f41512n.setImportantForAccessibility(2);
        d2 d2Var = new d2(activity, windowManager, this.f41512n, layoutParams);
        this.f41529s = d2Var;
        d2Var.a(new l9(this));
        this.f41512n.addView(this.f41529s.f41422b, new ViewGroup.LayoutParams(-1, -1));
        ca caVar2 = this.f41512n;
        v9 v9Var = new v9(this, activity);
        this.f41525r = v9Var;
        caVar2.addView(v9Var);
        v9 v9Var2 = this.f41525r;
        p9 p9Var = new p9(this, activity);
        this.f41486e0 = p9Var;
        v9Var2.addView(p9Var);
        this.f41525r.addView(this.f41529s.f41423c, new ViewGroup.LayoutParams(-1, -1));
        this.f41516o0 = new org.telegram.ui.Components.ba(this.f41486e0);
        this.f41519p0 = new Object();
        v9 v9Var3 = this.f41525r;
        FrameLayout frameLayout = new FrameLayout(activity);
        this.f41490f0 = frameLayout;
        v9Var3.addView(frameLayout);
        v9 v9Var4 = this.f41525r;
        FrameLayout frameLayout2 = new FrameLayout(activity);
        this.f41496h0 = frameLayout2;
        v9Var4.addView(frameLayout2);
        v9 v9Var5 = this.f41525r;
        q9 q9Var = new q9(this, activity, 0);
        this.f41499i0 = q9Var;
        v9Var5.addView(q9Var);
        this.f41499i0.setVisibility(8);
        this.f41499i0.setAlpha(0.0f);
        v9 v9Var6 = this.f41525r;
        FrameLayout frameLayout3 = new FrameLayout(activity);
        this.f41502j0 = frameLayout3;
        v9Var6.addView(frameLayout3);
        ic.a(this.f41512n, new gg.w(14));
        r9 r9Var = new r9(this, activity, this.f41516o0, this.f41525r, bVar);
        this.f41547x0 = r9Var;
        ca caVar3 = this.f41512n;
        Objects.requireNonNull(caVar3);
        r9Var.setCancelGestures(new org.telegram.ui.web.o0(caVar3, 25));
        this.f41547x0.setResetState(new h8(this, 13));
        this.f41486e0.addView(this.f41547x0, k7.b6.e(-1, -1, 119));
        this.f41547x0.setOnClickListener(new k8(this, 12));
        p9 p9Var2 = this.f41486e0;
        int i15 = this.G;
        if (i15 != 1 && i15 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        p9Var2.setBackgroundColor(i11);
        p9 p9Var3 = this.f41486e0;
        gg.j1 j1Var = lf.q0.f12053a;
        p9Var3.setOutlineProvider(new lf.p0(0, AndroidUtilities.dp(12.0f)));
        this.f41486e0.setClipToOutline(true);
        h8 h8Var = new h8(this, 14);
        ?? view = new View(activity);
        view.f26628a = new TextPaint(1);
        view.f26629b = new TextPaint(1);
        nr nrVar = nr.h;
        view.f26634s = new org.telegram.ui.Components.z5((View) view, 0L, 350L, nrVar);
        view.F = new cc0(view, 7);
        view.f26636x = h8Var;
        this.f41555z1 = view;
        s9 s9Var = new s9(this, activity, this.f41516o0, this.f41519p0);
        this.U0 = s9Var;
        s9Var.setCollageView(this.f41547x0);
        s9 s9Var2 = this.U0;
        s9Var2.v = new h8(this, 15);
        s9Var2.setOnTapListener(new h8(this, 16));
        this.U0.setVisibility(8);
        s9 s9Var3 = this.U0;
        s9Var3.K = new h8(this, 17);
        this.f41486e0.addView(s9Var3, k7.b6.e(-1, -1, 119));
        this.f41486e0.addView(this.f41555z1, k7.b6.e(-1, -1, 119));
        ca caVar4 = this.f41512n;
        t9 t9Var = new t9(this, activity, caVar4, caVar4, this.f41525r, bVar, this.f41516o0);
        this.Z0 = t9Var;
        t9Var.setAccount(i10);
        this.Z0.setUiBlurBitmap(new q8(this, 6));
        ic.a(this.f41499i0, new kh.t0(this, 11));
        this.Z0.setOnHeightUpdate(new i8(this, 13));
        this.Z0.setOnPeriodUpdate(new i8(this, 4));
        long j10 = this.K;
        if (j10 != 0) {
            this.Z0.setDialogId(j10);
        }
        this.Z0.setOnPremiumHint(new i8(this, 5));
        this.Z0.setOnKeyboardOpen(new i8(this, 6));
        gw0 gw0Var = new gw0(this, activity, 6);
        this.f41522q0 = gw0Var;
        this.f41525r.addView(gw0Var);
        oa oaVar = new oa(activity, this.f41525r, this.f41486e0, bVar, this.f41516o0);
        this.W0 = oaVar;
        oaVar.setOnTimelineClick(new h8(this, 10));
        this.W0.setOnHeightChange(new h8(this, 11));
        this.U0.setVideoTimelineView(this.W0);
        this.W0.setVisibility(8);
        this.W0.setAlpha(0.0f);
        this.W0.setMaxCount(1);
        FrameLayout frameLayout4 = new FrameLayout(activity);
        this.V0 = frameLayout4;
        float f12 = 388;
        frameLayout4.addView(this.W0, k7.b6.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 0.0f));
        sa saVar = new sa(activity);
        this.X0 = saVar;
        saVar.setVisibility(8);
        this.X0.a(false);
        this.V0.addView(this.X0, k7.b6.d(-1, 25.0f, 55, 0.0f, 0.0f, 0.0f, 0.0f));
        this.f41499i0.addView(this.V0, k7.b6.d(-1, 413, 87, 0.0f, 0.0f, 0.0f, 68.0f));
        this.f41499i0.addView(this.Z0, k7.b6.d(-1, -1.0f, 87, 0.0f, 200.0f, 0.0f, 0.0f));
        this.f41547x0.setTimelineView(this.W0);
        this.f41547x0.setPreviewView(this.U0);
        oa oaVar2 = new oa(activity, this.f41525r, this.f41486e0, bVar, this.f41516o0);
        this.f41523q1 = oaVar2;
        oaVar2.U0 = true;
        oaVar2.setVisibility(8);
        this.f41523q1.setAlpha(0.0f);
        this.f41499i0.addView(this.f41523q1, k7.b6.d(-1, f12, 87, 0.0f, 0.0f, 0.0f, 6.0f));
        w8 w8Var = new w8(this, activity, bVar, this.f41516o0);
        this.f41474a1 = w8Var;
        w8Var.setVisibility(8);
        this.f41499i0.addView(this.f41474a1, k7.b6.e(-1, -2, 85));
        ?? imageView = new ImageView(activity);
        this.f41505k0 = imageView;
        imageView.setContentDescription(LocaleController.getString(R.string.AccDescrGoBack));
        b2 b2Var = this.f41505k0;
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER;
        b2Var.setScaleType(scaleType);
        this.f41505k0.setImageResource(R.drawable.msg_photo_back);
        b2 b2Var2 = this.f41505k0;
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        b2Var2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f41505k0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f41505k0.setOnClickListener(new k8(this, 1));
        this.f41490f0.addView(this.f41505k0, k7.b6.e(56, 56, 51));
        this.f41529s.a(this.f41505k0);
        n6 n6Var = new n6(activity, i10);
        this.f41508l0 = n6Var;
        n6Var.a(false, false);
        this.f41508l0.setOnClickListener(new t8(0, this, activity));
        this.f41490f0.addView(this.f41508l0, k7.b6.d(-1, 56.0f, 51, 50.0f, 0.0f, 50.0f, 0.0f));
        org.telegram.ui.ActionBar.k5 k5Var = new org.telegram.ui.ActionBar.k5(activity);
        this.m0 = k5Var;
        k5Var.setTextSize(20);
        this.m0.setGravity(19);
        this.m0.setTextColor(-1);
        this.m0.setTypeface(AndroidUtilities.bold());
        this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
        this.m0.getPaint().setShadowLayer(AndroidUtilities.dpf2(1.0f), 0.0f, 1.0f, 1073741824);
        this.m0.setAlpha(0.0f);
        this.m0.setVisibility(8);
        this.m0.setEllipsizeByGradient(true);
        this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
        this.f41490f0.addView(this.m0, k7.b6.d(-1, 56.0f, 55, 71.0f, 0.0f, 0.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(activity);
        this.f41493g0 = linearLayout;
        linearLayout.setOrientation(0);
        this.f41493g0.setGravity(5);
        this.f41490f0.addView(this.f41493g0, k7.b6.d(-1, 56.0f, 7, 0.0f, 0.0f, 8.0f, 0.0f));
        i8 i8Var = new i8(this, 7);
        ca caVar5 = this.f41512n;
        ?? imageView2 = new ImageView(activity);
        imageView2.f41994w = true;
        imageView2.f41995x = true;
        imageView2.h = i8Var;
        imageView2.f41987a = i10;
        imageView2.f41988b = caVar5;
        imageView2.setScaleType(scaleType);
        imageView2.setColorFilter(new PorterDuffColorFilter(-1, mode));
        imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        imageView2.setVisibility(8);
        imageView2.setAlpha(0.0f);
        imageView2.setOnClickListener(new oh.n(imageView2, 8));
        imageView2.f41990f = new rp(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(2.0f), -1);
        imageView2.d();
        this.f41477b1 = imageView2;
        f3 f3Var = new f3(activity, 1);
        f3Var.m(1.0f, -71.0f);
        f3Var.d = 2000L;
        f3Var.R = false;
        f3Var.E.o(true, false, false);
        this.f41497h1 = f3Var;
        f3Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f41490f0.addView(this.f41497h1, k7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? imageView3 = new ImageView(activity);
        this.f41484d1 = imageView3;
        imageView3.setScaleType(scaleType);
        jj0 jj0Var = this.f41484d1;
        u6 u6Var = this.H1;
        if (u6Var != null && u6Var.Y) {
            i12 = R.drawable.media_unmute;
        } else {
            i12 = R.drawable.media_mute;
        }
        jj0Var.setImageResource(i12);
        this.f41484d1.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.f41484d1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f41484d1.setOnClickListener(new k8(this, 2));
        this.f41484d1.setVisibility(8);
        this.f41484d1.setAlpha(0.0f);
        eg.i0 i0Var = new eg.i0(activity);
        this.f41494g1 = i0Var;
        i0Var.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f41494g1.setVisibility(8);
        this.f41494g1.setAlpha(0.0f);
        this.f41494g1.setOnClickListener(new k8(this, 3));
        this.f41493g0.addView(this.f41494g1, k7.b6.q(46, 56, 53));
        this.f41493g0.addView(this.f41484d1, k7.b6.q(46, 56, 53));
        this.f41493g0.addView(this.f41477b1, k7.b6.e(46, 56, 53));
        pa paVar = new pa(activity);
        this.B0 = paVar;
        paVar.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.B0.setOnClickListener(new k8(this, 4));
        this.B0.setOnLongClickListener(new dg.f0(this, 2));
        this.B0.setVisibility(8);
        this.B0.setAlpha(0.0f);
        this.f41529s.a(this.B0);
        this.f41490f0.addView(this.B0, k7.b6.e(56, 56, 53));
        qa qaVar = new qa(activity, R.drawable.media_dual_camera2_shadow, R.drawable.media_dual_camera2);
        this.C0 = qaVar;
        qaVar.setContentDescription(LocaleController.getString(R.string.AccDescrDualCameraOn));
        this.C0.setOnClickListener(new k8(this, 5));
        boolean q10 = v0.q(activity);
        qa qaVar2 = this.C0;
        if (q10) {
            i13 = 0;
        } else {
            i13 = 8;
        }
        qaVar2.setVisibility(i13);
        qa qaVar3 = this.C0;
        if (q10) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        qaVar3.setAlpha(f10);
        this.f41529s.a(this.C0);
        this.f41490f0.addView(this.C0, k7.b6.e(56, 56, 53));
        ?? paVar2 = new pa(activity);
        this.D0 = paVar2;
        paVar2.setContentDescription(LocaleController.getString(R.string.AccDescrCollage));
        this.D0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        if (this.f41543w0 == null) {
            i14 = 6;
            this.f41543w0 = (r) r.a().get(6);
        } else {
            i14 = 6;
        }
        this.D0.setOnClickListener(new k8(this, i14));
        this.D0.a(new jc0(this.f41543w0, false), false);
        this.D0.setSelected(false);
        this.D0.setVisibility(0);
        this.D0.setAlpha(1.0f);
        this.f41529s.a(this.D0);
        this.f41490f0.addView(this.D0, k7.b6.e(56, 56, 53));
        pa paVar3 = new pa(activity);
        this.E0 = paVar3;
        paVar3.setContentDescription(LocaleController.getString(R.string.AccDescrCollageClose));
        this.E0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.E0.a(new jc0(new r("../../.."), true), false);
        this.E0.setVisibility(8);
        this.E0.setAlpha(0.0f);
        this.E0.setOnClickListener(new k8(this, 7));
        this.f41529s.a(this.E0);
        this.f41490f0.addView(this.E0, k7.b6.e(56, 56, 53));
        u uVar = new u(activity, this.f41529s);
        this.F0 = uVar;
        uVar.f42375a.u0(6);
        this.F0.setSelected((r) null);
        this.F0.setOnLayoutClick(new i8(this, 8));
        this.f41490f0.addView(this.F0, k7.b6.e(-1, 56, 53));
        f3 f3Var2 = new f3(activity, 1);
        f3Var2.m(1.0f, -20.0f);
        f3Var2.d = 5000L;
        f3Var2.i();
        f3Var2.t(LocaleController.getString(R.string.StoryCameraDualHint));
        f3Var2.f41617i0 = new c21(14);
        this.f41500i1 = f3Var2;
        f3Var2.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f41490f0.addView(this.f41500i1, k7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        f3 f3Var3 = new f3(activity, 2);
        f3Var3.m(0.0f, 28.0f);
        f3Var3.d = 5000L;
        f3Var3.q(true);
        this.f41503j1 = f3Var3;
        this.f41490f0.addView(f3Var3, k7.b6.d(-1, -1.0f, 48, 0.0f, 0.0f, 52.0f, 0.0f));
        f3 f3Var4 = new f3(activity, 1);
        f3Var4.m(1.0f, -20.0f);
        f3Var4.d = 5000L;
        f3Var4.t(LocaleController.getString(R.string.StoryCollageRemoveGrid));
        this.f41506k1 = f3Var4;
        f3Var4.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        this.f41490f0.addView(this.f41506k1, k7.b6.d(-1, -1.0f, 48, 0.0f, 52.0f, 0.0f, 0.0f));
        ?? view2 = new View(activity);
        Paint paint = new Paint(1);
        view2.f42372a = paint;
        Paint paint2 = new Paint(1);
        view2.f42373b = paint2;
        view2.e = new org.telegram.ui.Components.z5((View) view2, 0L, 250L, nrVar);
        paint2.setColor(-907224);
        paint.setColor(1056964608);
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(false, true, true, false);
        view2.f42374c = j6Var;
        j6Var.k(0.3f, 250L, nrVar);
        j6Var.t(AndroidUtilities.dp(13.0f));
        j6Var.r(-1);
        j6Var.u(AndroidUtilities.bold());
        j6Var.setCallback(view2);
        j6Var.f25884b = 1;
        view2.a(0L, false);
        this.G0 = view2;
        i0(false, false);
        this.f41490f0.addView(this.G0, k7.b6.d(-1, 45.0f, 55, 56.0f, 0.0f, 56.0f, 0.0f));
        this.f41529s.a(this.G0);
        MediaController.loadGalleryPhotosAlbums(0);
        t5 t5Var = new t5(activity);
        this.L0 = t5Var;
        t5Var.setDelegate(a9Var);
        t5 t5Var2 = this.L0;
        if (this.L1 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        t5Var2.f42346k0 = -1.0f;
        t5Var2.f42347l0 = z4;
        t5Var2.invalidate();
        this.f41496h0.addView(this.L0, k7.b6.e(-1, 100, 87));
        this.f41529s.a(this.L0);
        t5 t5Var3 = this.L0;
        if (this.f41547x0.j()) {
            f11 = this.f41547x0.getFilledProgress();
        } else {
            f11 = 0.0f;
        }
        t5Var3.e(f11, true);
        d dVar = new d(activity, bVar, true);
        this.M0 = dVar;
        dVar.setRoundRadius(24);
        this.M0.setColor(-2473124);
        this.M0.g(LocaleController.getString(R.string.LiveStoryStart), false, true);
        this.M0.setAlpha(0.0f);
        this.M0.setScaleX(0.8f);
        this.M0.setScaleY(0.8f);
        this.M0.setVisibility(8);
        this.f41496h0.addView(this.M0, k7.b6.d(-1, 48.0f, 87, 20.0f, 20.0f, 20.0f, 20.0f));
        this.M0.setOnClickListener(new k8(this, 8));
        f3 f3Var5 = new f3(activity, 3);
        f3Var5.q(true);
        f3Var5.t(LocaleController.getString(R.string.StoryCameraHint2));
        f3Var5.h = AndroidUtilities.dp(320.0f);
        f3Var5.d = 5000L;
        f3Var5.H = Layout.Alignment.ALIGN_CENTER;
        this.T0 = f3Var5;
        this.f41496h0.addView(f3Var5, k7.b6.d(-1, -1.0f, 80, 0.0f, 0.0f, 0.0f, 100.0f));
        h91 h91Var = new h91(activity);
        this.S0 = h91Var;
        h91Var.J = false;
        h91Var.setAlpha(0.0f);
        this.f41496h0.addView(this.S0, k7.b6.d(-1, 50.0f, 81, 0.0f, 0.0f, 0.0f, 108.0f));
        this.S0.setDelegate(new q8(this, 4));
        h91 h91Var2 = this.S0;
        this.Q1 = 0.0f;
        h91Var2.b(0.0f, false);
        d6 d6Var = new d6(activity, i10, new h8(this, 12));
        this.A0 = d6Var;
        d6Var.f41446c = new i8(this, 9);
        this.f41496h0.addView(d6Var, k7.b6.d(-1, 80.0f, 87, 0.0f, 0.0f, 0.0f, 90.0f));
        x8 x8Var = new x8(this, activity);
        this.N0 = x8Var;
        x8Var.setOnSwitchModeListener(new i8(this, 10));
        this.N0.setOnSwitchingModeListener(new i8(this, 11));
        this.f41502j0.addView(this.N0, k7.b6.e(-1, 48, 55));
        this.f41529s.a(this.N0);
        ?? imageView4 = new ImageView(activity);
        this.O0 = imageView4;
        imageView4.setContentDescription(LocaleController.getString(R.string.AccDescrSwitchCamera));
        this.O0.setImageResource(R.drawable.stream_flip);
        this.O0.setScaleType(scaleType);
        this.O0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.O0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f41502j0.addView(this.O0, k7.b6.d(24, 24.0f, 19, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f41529s.a(this.O0);
        this.O0.setOnClickListener(new k8(this, 9));
        ?? imageView5 = new ImageView(activity);
        this.P0 = imageView5;
        imageView5.setContentDescription(LocaleController.getString(R.string.LiveStorySettings));
        this.P0.setImageResource(R.drawable.stream_settings);
        this.P0.setScaleType(scaleType);
        this.P0.setColorFilter(new PorterDuffColorFilter(-1, mode));
        this.P0.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
        this.f41502j0.addView(this.P0, k7.b6.d(24, 24.0f, 21, 20.0f, 0.0f, 20.0f, 4.0f));
        this.f41529s.a(this.P0);
        this.P0.setOnClickListener(new k8(this, 10));
        e3 e3Var = new e3(activity);
        this.Q0 = e3Var;
        this.f41502j0.addView(e3Var, k7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f41529s.a(this.Q0);
        e3 e3Var2 = new e3(activity);
        this.R0 = e3Var2;
        e3Var2.f41564a.q(LocaleController.getString(R.string.StoryCollageReorderHint), false, true);
        e3Var2.invalidate();
        this.R0.setAlpha(0.0f);
        this.f41502j0.addView(this.R0, k7.b6.d(-1, 32.0f, 17, 8.0f, 0.0f, 8.0f, 8.0f));
        this.f41529s.a(this.R0);
        d dVar2 = new d(activity, bVar, true);
        dVar2.setRoundRadius(24);
        this.f41527r1 = dVar2;
        dVar2.setVisibility(8);
        this.f41527r1.setAlpha(0.0f);
        this.f41527r1.g(LocaleController.getString(R.string.StoryCoverSave), false, true);
        this.f41527r1.setOnClickListener(new k8(this, 11));
        this.f41502j0.addView(this.f41527r1, k7.b6.d(-1, 48.0f, 119, 10.0f, 10.0f, 10.0f, 10.0f));
        ?? frameLayout5 = new FrameLayout(activity);
        frameLayout5.f41644b = new ArrayList();
        frameLayout5.e = true;
        frameLayout5.h = true;
        View view3 = new View(activity);
        frameLayout5.f41643a = view3;
        view3.setBackground(new GradientDrawable(GradientDrawable.Orientation.BOTTOM_TOP, new int[]{1711276032, 0}));
        frameLayout5.addView(view3, k7.b6.e(-1, -1, 119));
        frameLayout5.a(0, R.drawable.media_draw, LocaleController.getString(R.string.AccDescrPaint));
        frameLayout5.a(2, R.drawable.msg_photo_sticker, LocaleController.getString(R.string.AccDescrStickers));
        frameLayout5.a(1, R.drawable.msg_photo_text2, LocaleController.getString(R.string.AccDescrPlaceText));
        frameLayout5.a(3, R.drawable.media_crop, LocaleController.getString(R.string.Crop));
        frameLayout5.a(4, R.drawable.msg_photo_settings, LocaleController.getString(R.string.AccDescrPhotoAdjust));
        String string = LocaleController.getString(R.string.Send);
        frameLayout5.d = string;
        frameLayout5.e = true;
        e5 e5Var = new e5(frameLayout5, activity, string, true);
        frameLayout5.f41645c = e5Var;
        e5Var.setContentDescription(LocaleController.getString(R.string.Send));
        frameLayout5.addView(frameLayout5.f41645c, k7.b6.c(-2.0f, -2));
        frameLayout5.e();
        this.Y0 = frameLayout5;
        frameLayout5.setVisibility(8);
        this.Y0.setOnClickListener(new i8(this, 12));
        this.f41502j0.addView(this.Y0, k7.b6.e(-1, 52, 23));
        ra raVar = new ra(activity);
        this.f41510m1 = raVar;
        raVar.setAlpha(0.0f);
        this.f41510m1.setVisibility(8);
        this.f41486e0.addView(this.f41510m1, k7.b6.d(-1, 120.0f, 81, 0.0f, 0.0f, 0.0f, 16.0f));
        g5 g5Var = new g5(activity, i10, bVar);
        this.l1 = g5Var;
        this.f41486e0.addView(g5Var, k7.b6.e(-1, -1, 119));
        m0(false);
    }

    public static da E(Activity activity, int i10) {
        da daVar = C2;
        if (daVar != null && (daVar.f41475b != activity || daVar.f41479c != i10)) {
            daVar.q(false);
            C2 = null;
        }
        if (C2 == null) {
            C2 = new da(activity, i10);
        }
        return C2;
    }

    public static void a(da daVar) {
        i9 i9Var = daVar.f41551y0;
        boolean z4 = false;
        if (i9Var != null && i9Var.getTextureView() != null) {
            Bitmap bitmap = daVar.f41551y0.getTextureView().getBitmap();
            if (bitmap == null) {
                daVar.Z1 = false;
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
            daVar.Z1 = z4;
            return;
        }
        daVar.Z1 = false;
    }

    public static void a0(boolean z4) {
        MessagesController.getGlobalMainSettings().edit().putBoolean("stories_camera", z4).apply();
    }

    public static boolean b(da daVar) {
        Activity activity = daVar.f41475b;
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

    public static void c(da daVar) {
        ValueAnimator valueAnimator = daVar.f41495g2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            daVar.f41495g2 = null;
        }
        daVar.f41498h2 = false;
        v9 v9Var = daVar.f41525r;
        float f10 = v9Var.f42486a;
        float f11 = v9Var.f42487b;
        v9Var.getAlpha();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
        daVar.f41495g2 = ofFloat;
        ofFloat.addUpdateListener(new nv(daVar, f10, f11, 3));
        daVar.f41495g2.setDuration(340L);
        daVar.f41495g2.setInterpolator(nr.h);
        daVar.f41495g2.addListener(new d9(daVar, 0));
        daVar.f41495g2.start();
    }

    public static boolean d(da daVar) {
        Activity activity = daVar.f41475b;
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
        spannableString.setSpan(new m9(mutate, mutate), 0, 1, 33);
        return spannableString;
    }

    public static void x() {
        da daVar = C2;
        if (daVar != null) {
            daVar.q(false);
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
        return this.f41475b.getResources().getDrawable(R.drawable.icplaceholder);
    }

    public final int B() {
        ArrayList arrayList = this.F1;
        if (arrayList != null) {
            return arrayList.size();
        }
        u6 u6Var = this.H1;
        if (u6Var != null) {
            return u6Var.r();
        }
        return 1;
    }

    public final String C() {
        i9 i9Var = this.f41551y0;
        if (i9Var != null && i9Var.getCameraSession() != null) {
            if (this.f41551y0.isFrontface() && !this.f41551y0.getCameraSession().hasFlashModes()) {
                p();
                return (String) this.f41528r2.get(this.f41524q2);
            }
            return this.f41551y0.getCameraSession().getCurrentFlashMode();
        }
        return null;
    }

    public final o0 D() {
        if (this.K0 == null) {
            o0 o0Var = new o0(this.f41475b);
            this.K0 = o0Var;
            this.f41496h0.addView(o0Var, k7.b6.d(-1, -2.0f, 87, 0.0f, 0.0f, 0.0f, 78.0f));
        }
        return this.K0;
    }

    public final String F() {
        int i10;
        i9 i9Var = this.f41551y0;
        if (i9Var != null && i9Var.getCameraSession() != null) {
            if (this.f41551y0.isFrontface() && !this.f41551y0.getCameraSession().hasFlashModes()) {
                p();
                ArrayList arrayList = this.f41528r2;
                if (this.f41524q2 + 1 >= arrayList.size()) {
                    i10 = 0;
                } else {
                    i10 = this.f41524q2 + 1;
                }
                return (String) arrayList.get(i10);
            }
            return this.f41551y0.getCameraSession().getNextFlashMode();
        }
        return null;
    }

    public final ImageView G() {
        if (this.f41491f1 == null) {
            int i10 = R.raw.sun_outline;
            gj0 gj0Var = new gj0(i10, "" + R.raw.sun_outline, AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f41487e1 = gj0Var;
            gj0Var.h = true;
            u6 u6Var = this.H1;
            if (u6Var != null && u6Var.f42447y0) {
                gj0Var.K(35);
                this.f41487e1.N(36);
            } else {
                gj0Var.N(0);
                this.f41487e1.K(0);
            }
            this.f41487e1.X = true;
            int v02 = org.telegram.ui.ActionBar.j6.v0(org.telegram.ui.ActionBar.j6.J9, this.f41472a);
            this.f41487e1.O(v02, "Sunny");
            this.f41487e1.O(v02, "Path 6");
            this.f41487e1.O(v02, "Path");
            this.f41487e1.O(v02, "Path 5");
            this.f41487e1.m();
            ImageView imageView = new ImageView(this.f41475b);
            this.f41491f1 = imageView;
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            this.f41491f1.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.MULTIPLY));
            this.f41491f1.setBackground(org.telegram.ui.ActionBar.j6.f0(553648127, 1, -1));
            this.f41491f1.setOnClickListener(new k8(this, 0));
            this.f41491f1.setVisibility(8);
            this.f41491f1.setImageDrawable(this.f41487e1);
            this.f41491f1.setAlpha(0.0f);
            this.f41493g0.addView(this.f41491f1, 0, k7.b6.q(46, 56, 53));
        }
        return this.f41491f1;
    }

    public final void H() {
        h9 h9Var = this.f41531s1;
        if (h9Var == null) {
            return;
        }
        this.f41532s2 = null;
        h9Var.getTopLayout().setAlpha(0.0f);
        this.f41531s1.getTopLayout().setTranslationY(-AndroidUtilities.dp(16.0f));
        this.f41531s1.getBottomLayout().setAlpha(0.0f);
        this.f41531s1.getBottomLayout().setTranslationY(AndroidUtilities.dp(48.0f));
        this.f41531s1.getWeightChooserView().setTranslationX(-AndroidUtilities.dp(32.0f));
        this.f41531s1.setVisibility(8);
    }

    public final boolean I() {
        float f10;
        if (this.f41547x0.j()) {
            f10 = this.f41547x0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        if (!this.X1 && f10 >= 1.0f) {
            return true;
        }
        return false;
    }

    public final boolean J() {
        e9 e9Var;
        if (!this.T && (e9Var = this.J0) != null) {
            if (e9Var.getTranslationY() < (this.f41512n.getMeasuredHeight() - ((int) (AndroidUtilities.displaySize.y * 0.35f))) - (org.telegram.ui.ActionBar.k.getCurrentActionBarHeight() + AndroidUtilities.statusBarHeight)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void K(int r31, boolean r32) {
        throw new UnsupportedOperationException("Method not decompiled: ph.da.K(int, boolean):void");
    }

    public final void L(Runnable runnable, long j10) {
        if (!this.P1 && this.H1 != null) {
            n8 n8Var = this.f41485d2;
            if (n8Var != null) {
                AndroidUtilities.cancelRunOnUIThread(n8Var);
            }
            this.f41488e2 = true;
            this.P1 = true;
            this.f41485d2 = new n8(this, runnable, 1);
            this.U0.setAlpha(0.0f);
            this.U0.setVisibility(0);
            this.U0.n(this.H1, this.f41485d2, j10);
            this.U0.q(this.H1, false);
            AndroidUtilities.runOnUIThread(this.f41485d2, 800L);
        }
    }

    public final boolean M() {
        throw new UnsupportedOperationException("Method not decompiled: ph.da.M():boolean");
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
            this.f41523q1.setVisibility(8);
            if (i11 == 1) {
                i17 = 0;
            } else {
                i17 = 8;
            }
            this.f41499i0.setVisibility(i17);
            this.Z0.setVisibility(8);
            this.f41527r1.setVisibility(8);
        }
        if (i10 == 1) {
            this.Y0.setVisibility(8);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f41499i0.setVisibility(i14);
            this.f41484d1.setVisibility(8);
            this.f41494g1.setVisibility(8);
            this.f41477b1.setVisibility(8);
            ImageView imageView = this.f41491f1;
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
            this.f41510m1.setAlpha(0.0f);
            this.f41510m1.setVisibility(8);
            this.X0.setVisibility(8);
            this.E1 = null;
            this.F1 = null;
            this.G1 = null;
        }
        if (i11 == 1) {
            u6 u6Var = this.H1;
            if (u6Var == null || !u6Var.f42425n) {
                u();
                H();
            }
            lf0 lf0Var = this.f41555z1;
            if (lf0Var != null) {
                lf0Var.setAllowTouch(false);
            }
            this.U0.x(2, false);
            this.U0.x(3, false);
            this.U0.x(4, false);
            this.U0.x(5, false);
            this.U0.x(7, false);
            u6 u6Var2 = this.H1;
            if (u6Var2 != null && u6Var2.f42415h0 >= 30000) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.X0.setVisibility(i13);
            this.f41499i0.setAlpha(1.0f);
            this.f41499i0.setTranslationY(0.0f);
            u6 u6Var3 = this.H1;
            this.Z0.setVisibility((u6Var3 == null || u6Var3.J0 == 0) ? 0 : 0);
        }
        if (i11 == 0 && this.S1) {
            D().setVisibility(0);
            o0 D = D();
            D.f42037r.d(0.0f, true);
            D.a(true);
            org.telegram.ui.web.o0 o0Var = D.h;
            if (o0Var != null) {
                AndroidUtilities.cancelRunOnUIThread(o0Var);
            }
            org.telegram.ui.web.o0 o0Var2 = new org.telegram.ui.web.o0(D, 11);
            D.h = o0Var2;
            AndroidUtilities.runOnUIThread(o0Var2, 3500L);
            this.L0.h();
        }
        this.S1 = false;
        lf0 lf0Var2 = this.f41555z1;
        if (lf0Var2 != null) {
            if (i11 == 1 && ((i12 = this.f41483d0) == -1 || i12 == 1)) {
                z10 = true;
            } else {
                z10 = false;
            }
            lf0Var2.setAllowTouch(z10);
        }
        t9 t9Var = this.Z0;
        if (t9Var != null) {
            if (i11 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            t9Var.f41804b0 = z4;
        }
        if (i11 == 1) {
            int i19 = this.f41479c;
            MediaDataController.getInstance(i19).checkStickers(0);
            MediaDataController.getInstance(i19).loadRecents(0, false, true, false);
            MediaDataController.getInstance(i19).loadRecents(2, false, true, false);
            nh.t6 storiesController = MessagesController.getInstance(i19).getStoriesController();
            if (storiesController.Q == 0) {
                storiesController.P();
            }
            MessagesController.getInstance(i19).getStoriesController().R();
        }
    }

    public final void O(int i10, int i11) {
        u6 u6Var;
        int i12;
        float f10;
        int i13;
        boolean z4;
        boolean z10;
        long j10;
        String str;
        SpannableStringBuilder append;
        boolean z11;
        u6 u6Var2;
        boolean z12;
        boolean z13;
        boolean z14;
        u6 u6Var3;
        long duration;
        boolean z15;
        boolean z16;
        int i14;
        h8 h8Var;
        int i15;
        int i16;
        boolean z17;
        boolean z18;
        boolean z19;
        u6 u6Var4;
        int i17;
        u6 u6Var5;
        u6 u6Var6;
        u6 u6Var7;
        w61 textureView;
        u6 u6Var8;
        boolean z20 = true;
        if (i11 == 0) {
            Z(false);
            this.L0.setVisibility(0);
            t5 t5Var = this.L0;
            if (t5Var != null) {
                t5Var.g(false);
            }
            this.N0.setVisibility(0);
            this.S0.setVisibility(0);
            this.S0.setAlpha(0.0f);
            this.G0.a(0L, true);
            u6 u6Var9 = this.H1;
            if (u6Var9 != null) {
                u6Var9.i(false);
                this.H1 = null;
            }
            r9 r9Var = this.f41547x0;
            if (r9Var != null) {
                r9Var.e();
                this.L0.e(0.0f, false);
            }
        }
        if (i10 == 0) {
            e0(null);
            b0(new h8(this, 18));
            o0 o0Var = this.K0;
            if (o0Var != null) {
                o0Var.setVisibility(8);
            }
            this.T0.e(true);
            f3 f3Var = this.f41500i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
        }
        String str2 = "";
        int i18 = this.f41479c;
        if (i11 != 1 && i10 != 1) {
            j10 = 0;
        } else {
            if (i11 == 1) {
                u6Var = this.H1;
            } else {
                u6Var = null;
            }
            this.f41477b1.setEntry(u6Var);
            if (this.L1 == 1) {
                this.f41484d1.setVisibility(0);
                u6 u6Var10 = this.H1;
                if (u6Var10 != null && u6Var10.Y) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                f0(z12, false);
                this.f41494g1.setVisibility(0);
                this.U0.x(-9982, false);
                ((mg0) this.f41494g1.f5302c).a(this.U0.k(), false);
                this.m0.setRightPadding(AndroidUtilities.dp(144.0f));
            } else {
                u6 u6Var11 = this.H1;
                if (u6Var11 != null && !TextUtils.isEmpty(u6Var11.f42446y)) {
                    this.f41484d1.setVisibility(8);
                    this.f41494g1.setVisibility(0);
                    ((mg0) this.f41494g1.f5302c).a(true, false);
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                } else {
                    this.m0.setRightPadding(AndroidUtilities.dp(48.0f));
                }
            }
            this.f41477b1.setVisibility(0);
            u6 u6Var12 = this.H1;
            if (u6Var12 != null && u6Var12.f42439u) {
                G().setVisibility(0);
                o0(false);
            } else {
                ImageView imageView = this.f41491f1;
                if (imageView != null) {
                    imageView.setVisibility(8);
                }
            }
            this.Y0.setVisibility(0);
            this.U0.setVisibility(0);
            u6 u6Var13 = this.H1;
            if ((u6Var13 != null && u6Var13.J0 != 0) || this.f41530s0 != 0) {
                i12 = 8;
            } else {
                i12 = 0;
            }
            this.Z0.setVisibility(i12);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.V0.getLayoutParams();
            u6 u6Var14 = this.H1;
            if ((u6Var14 != null && u6Var14.J0 != 0) || this.f41530s0 != 0) {
                f10 = 12.0f;
            } else {
                f10 = 68.0f;
            }
            layoutParams.bottomMargin = AndroidUtilities.dp(f10);
            this.V0.setLayoutParams(layoutParams);
            this.f41499i0.setVisibility(0);
            this.f41499i0.clearFocus();
            u6 u6Var15 = this.H1;
            if (u6Var15 == null) {
                i13 = 86400;
            } else {
                i13 = u6Var15.I0;
            }
            this.Z0.A(i13, false);
            if (!MessagesController.getInstance(i18).premiumFeaturesBlocked() && ((u6Var2 = this.H1) == null || !u6Var2.f42413g)) {
                z4 = true;
            } else {
                z4 = false;
            }
            this.Z0.setPeriodVisible(z4);
            u6 u6Var16 = this.H1;
            if (u6Var16 != null && u6Var16.f42428o0 != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.Z0.setHasRoundVideo(z10);
            t9 t9Var = this.Z0;
            if (t9Var == null) {
                j10 = 0;
            } else {
                u6 u6Var17 = this.H1;
                if (u6Var17 == null || !u6Var17.f42425n) {
                    j10 = 0;
                    t9Var.v(null, null);
                } else {
                    TLRPC.Peer peer = u6Var17.f42431q;
                    if (peer instanceof TLRPC.TL_peerUser) {
                        j10 = 0;
                        String userName = UserObject.getUserName(MessagesController.getInstance(i18).getUser(Long.valueOf(peer.user_id)));
                        u6 u6Var18 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) userName);
                        u6Var18.f42429p = append;
                    } else {
                        j10 = 0;
                        TLRPC.Chat chat = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(peer)));
                        if (chat == null) {
                            str = "";
                        } else {
                            str = chat.title;
                        }
                        u6 u6Var19 = this.H1;
                        append = new SpannableStringBuilder(MessageObject.userSpan()).append((CharSequence) " ").append((CharSequence) str);
                        u6Var19.f42429p = append;
                    }
                    String str3 = this.H1.f42435s;
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
            u6 u6Var20 = this.H1;
            if (u6Var20 != null && u6Var20.v() && this.H1.t()) {
                z11 = false;
            } else {
                z11 = true;
            }
            oa oaVar = this.W0;
            boolean z21 = oaVar.f42087g0;
            oaVar.f42087g0 = z11;
            oaVar.f42085f0.f(z11, true);
            oaVar.invalidate();
        }
        if (i11 == 2 || i10 == 2) {
            this.m0.setVisibility(0);
            this.f41523q1.setVisibility(0);
            u6 u6Var21 = this.H1;
            if (u6Var21 != null && u6Var21.f42402b0) {
                this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
            }
            this.f41499i0.setVisibility(0);
            this.f41527r1.setVisibility(0);
        }
        if (i11 == 2) {
            this.m0.l(LocaleController.getString(R.string.RecorderEditCover), false);
        }
        if (i11 == 1) {
            this.K1 = false;
            u6 u6Var22 = this.H1;
            if (u6Var22 != null && u6Var22.J0 != j10) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (u6Var22 != null && u6Var22.f42413g) {
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
            f5 f5Var = this.Y0;
            if (!TextUtils.equals(string, f5Var.d) || z22 != f5Var.e) {
                f5Var.removeView(f5Var.f41645c);
                Context context = f5Var.getContext();
                f5Var.d = string;
                f5Var.e = z22;
                e5 e5Var = new e5(f5Var, context, string, z22);
                f5Var.f41645c = e5Var;
                e5Var.setContentDescription(string);
                f5Var.addView(f5Var.f41645c, k7.b6.c(-2.0f, -2));
                f5Var.e();
            }
            this.f41523q1.setVisibility(8);
            this.f41527r1.setVisibility(8);
            if (!this.f41488e2) {
                u6 u6Var23 = this.H1;
                if (u6Var23 != null && u6Var23.f42439u) {
                    this.U0.l(u6Var23);
                } else {
                    this.U0.set(u6Var23);
                }
            }
            this.f41488e2 = false;
            vt editText = this.Z0.f41809f.getEditText();
            if (MessagesController.getInstance(i18).storyEntitiesAllowed()) {
                h8Var = null;
            } else {
                h8Var = new h8(this, 19);
            }
            editText.setOnPremiumMenuLockClickListener(h8Var);
            if (this.E1 == null) {
                i15 = 8;
            } else {
                i15 = 0;
            }
            this.f41474a1.setVisibility(i15);
            ArrayList arrayList = this.E1;
            if (arrayList != null) {
                ArrayList arrayList2 = this.G1;
                ArrayList arrayList3 = this.F1;
                w8 w8Var = this.f41474a1;
                w8Var.c(false, false);
                w8Var.f42241c = arrayList;
                w8Var.d = arrayList2;
                w8Var.e = arrayList3;
                w8Var.f42246w = new k01(Integer.toString(arrayList.size()), 20.0f, AndroidUtilities.getTypeface("fonts/num.otf"));
                w8Var.H = new k01(LocaleController.formatPluralStringComma("HintViewStoriesMultiple", arrayList.size()), 14.0f, null);
                w8Var.f42240b.V2.N(false);
                this.f41474a1.setSelected(this.E1.indexOf(this.H1));
            }
            if (!z15 && !z16 && this.E1 == null && ((u6Var8 = this.H1) == null || (!u6Var8.v() && this.H1.K))) {
                i16 = 3;
            } else {
                i16 = 1;
            }
            this.W0.setMaxCount(i16);
            if (i10 != 2) {
                u6 u6Var24 = this.H1;
                if (u6Var24 != null && (u6Var24.f42404c || u6Var24.f42413g || this.f41526r0)) {
                    if (u6Var24.P0 != null) {
                        z();
                        u();
                        H();
                    }
                    u6 u6Var25 = this.H1;
                    if (u6Var25.K && u6Var25.f42400a1 != null && (textureView = this.U0.getTextureView()) != null) {
                        textureView.setDelegate(new q8(this, 7));
                    }
                    this.Z0.setText(this.H1.C0);
                } else if (i10 != 2) {
                    t9 t9Var2 = this.Z0;
                    t9Var2.S = true;
                    t9Var2.f41809f.setText("");
                }
            }
            u6 u6Var26 = this.H1;
            if (u6Var26 != null && ((u6Var26.f42439u && !u6Var26.K) || u6Var26.v())) {
                z17 = false;
            } else {
                z17 = true;
            }
            this.Y0.d(4, z17);
            if (BuildVars.DEBUG_PRIVATE_VERSION && (u6Var7 = this.H1) != null && !u6Var7.f42439u && !u6Var7.v()) {
                z18 = true;
            } else {
                z18 = false;
            }
            this.Y0.d(3, z18);
            if (!this.K1 && !this.Z0.o()) {
                nh.t6 storiesController = MessagesController.getInstance(i18).getStoriesController();
                int B = B();
                nh.n6 o10 = storiesController.o();
                if (o10 == null || !o10.a(storiesController.f15917a, B) || ((u6Var6 = this.H1) != null && (u6Var6.f42413g || u6Var6.J0 != j10))) {
                    z19 = true;
                    this.Y0.setShareEnabled(z19);
                    u6Var4 = this.H1;
                    if (u6Var4 == null && u6Var4.Y) {
                        i17 = R.drawable.media_unmute;
                    } else {
                        i17 = R.drawable.media_mute;
                    }
                    this.f41484d1.setImageResource(i17);
                    this.U0.setVisibility(0);
                    this.W0.setVisibility(0);
                    this.m0.setVisibility(0);
                    this.m0.setTranslationX(0.0f);
                    u6Var5 = this.H1;
                    if (u6Var5 == null && u6Var5.J0 != j10) {
                        this.m0.l("", false);
                    } else if (u6Var5 == null && u6Var5.f42413g) {
                        this.m0.l(LocaleController.getString(R.string.RecorderEditStory), false);
                    } else if (u6Var5 == null && u6Var5.f42439u) {
                        this.m0.l(LocaleController.getString(R.string.RecorderRepost), false);
                    } else if (u6Var5 == null && u6Var5.f42425n) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                        org.telegram.ui.i5 i5Var = new org.telegram.ui.i5(this.m0, 32.0f, i18);
                        this.m0.setTranslationX(-AndroidUtilities.dp(6.0f));
                        SpannableString spannableString2 = new SpannableString("a");
                        spannableString2.setSpan(i5Var, 0, 1, 33);
                        if (this.H1.f42431q instanceof TLRPC.TL_peerUser) {
                            TLRPC.User user = MessagesController.getInstance(i18).getUser(Long.valueOf(this.H1.f42431q.user_id));
                            i5Var.e(user);
                            spannableStringBuilder.append((CharSequence) spannableString2).append((CharSequence) "  ");
                            spannableStringBuilder.append((CharSequence) UserObject.getUserName(user));
                        } else {
                            TLRPC.Chat chat2 = MessagesController.getInstance(i18).getChat(Long.valueOf(-DialogObject.getPeerDialogId(this.H1.f42431q)));
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
            u6Var4 = this.H1;
            if (u6Var4 == null) {
            }
            i17 = R.drawable.media_mute;
            this.f41484d1.setImageResource(i17);
            this.U0.setVisibility(0);
            this.W0.setVisibility(0);
            this.m0.setVisibility(0);
            this.m0.setTranslationX(0.0f);
            u6Var5 = this.H1;
            if (u6Var5 == null) {
            }
            if (u6Var5 == null) {
            }
            if (u6Var5 == null) {
            }
            if (u6Var5 == null) {
            }
            this.m0.l(LocaleController.getString(R.string.RecorderNewStory), false);
            z20 = true;
        }
        if (i10 == z20) {
            t9 t9Var3 = this.Z0;
            o70 o70Var = t9Var3.S0;
            if (o70Var != null) {
                o70Var.u();
                t9Var3.S0 = null;
            }
            this.f41497h1.e(z20);
            w8 w8Var2 = this.f41474a1;
            if (w8Var2.J) {
                w8Var2.c(false, z20);
            }
        }
        if (i11 == 2 && (u6Var3 = this.H1) != null) {
            if (u6Var3.f42409e0 < j10) {
                u6Var3.f42409e0 = j10;
            }
            this.J1 = u6Var3.f42409e0;
            if (this.U0.getDuration() < 100) {
                duration = this.H1.f42415h0;
            } else {
                duration = this.U0.getDuration();
            }
            u6 u6Var27 = this.H1;
            if (u6Var27.f42415h0 <= 0) {
                u6Var27.f42415h0 = duration;
            }
            File file = u6Var27.Z0;
            if (file == null) {
                file = u6Var27.L;
            }
            String absolutePath = file.getAbsolutePath();
            u6 u6Var28 = this.H1;
            this.f41523q1.o(false, absolutePath, u6Var28.f42415h0, u6Var28.P);
            u6 u6Var29 = this.H1;
            float f11 = (float) duration;
            long j11 = u6Var29.Z * f11;
            long j12 = u6Var29.f42399a0 * f11;
            oa oaVar2 = this.f41523q1;
            oaVar2.W0 = j11;
            oaVar2.X0 = j12;
            ja jaVar = oaVar2.h;
            if (jaVar != null) {
                ja.a(jaVar, true);
            }
            d4 d4Var = new d4(this, 3);
            this.f41523q1.setDelegate(new f9(d4Var));
            float max = (((float) this.J1) / ((float) Math.max(1L, duration))) * 0.96f;
            this.f41523q1.setVideoLeft(max);
            this.f41523q1.setVideoRight(0.04f + max);
            d4Var.run(Boolean.TRUE, Float.valueOf(max));
        }
        lf0 lf0Var = this.f41555z1;
        if (lf0Var != null) {
            lf0Var.setAllowTouch(false);
        }
        f3 f3Var2 = this.f41503j1;
        boolean z23 = true;
        if (f3Var2 != null) {
            f3Var2.e(true);
        }
        ic.e();
        t9 t9Var4 = this.Z0;
        if (t9Var4 != null) {
            f fVar = t9Var4.f41809f;
            fVar.d();
            fVar.k(true);
            this.Z0.f41804b0 = true;
        }
        s9 s9Var = this.U0;
        if (s9Var != null) {
            if (i11 != 1) {
                z14 = true;
            } else {
                z14 = false;
            }
            s9Var.x(8, z14);
        }
        h9 h9Var = this.f41531s1;
        if (h9Var != null) {
            if (i11 != 1) {
                z13 = true;
            } else {
                z13 = false;
            }
            h9Var.setCoverPreview(z13);
        }
        f3 f3Var3 = this.f41506k1;
        if (f3Var3 != null) {
            f3Var3.e(true);
        }
        r9 r9Var2 = this.f41547x0;
        r9Var2.setPreview((i11 == 1 && r9Var2.j()) ? false : false);
    }

    public final void P() {
        cg.n1 n1Var;
        int i10;
        if (this.f41480c0 == 0) {
            ValueAnimator valueAnimator = this.B;
            if (valueAnimator != null && valueAnimator.isRunning()) {
                this.f41538u2 = new h8(this, 3);
            } else {
                Z(false);
            }
        }
        t9 t9Var = this.Z0;
        if (t9Var != null) {
            t9Var.f41809f.s();
        }
        t5 t5Var = this.L0;
        if (t5Var != null) {
            t5Var.h();
        }
        g5 g5Var = this.l1;
        if (g5Var != null) {
            nh.t6 storiesController = MessagesController.getInstance(g5Var.f41681a).getStoriesController();
            TL_stories.PeerStories peerStories = (TL_stories.PeerStories) storiesController.f15922i.f(UserConfig.getInstance(storiesController.f15917a).clientUserId);
            if (peerStories != null) {
                i10 = peerStories.stories.size();
            } else {
                i10 = 0;
            }
            g5Var.f41682b = storiesController.f15918b.m() + i10 + 1;
            g5Var.f41683c.invalidate();
        }
        h9 h9Var = this.f41531s1;
        if (h9Var != null && (n1Var = h9Var.L0.d) != null) {
            n1Var.postRunnable(n1Var.f2483w);
        }
        s9 s9Var = this.U0;
        if (s9Var != null) {
            s9Var.x(0, false);
        }
        t0 t0Var = MessagesController.getInstance(this.f41479c).getStoriesController().f15935w;
        if (!t0Var.f42320c && !t0Var.d) {
            t0Var.d = true;
            q0 q0Var = new q0(t0Var, 1);
            MessagesStorage messagesStorage = MessagesStorage.getInstance(t0Var.f42318a);
            messagesStorage.getStorageQueue().postRunnable(new vq0((Object) messagesStorage, false, (Object) q0Var, 8));
        }
    }

    public final void Q(int i10, int i11) {
        boolean z4;
        h9 h9Var;
        n9 n9Var;
        o9 o9Var;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        h9 h9Var2;
        if (i11 == 0) {
            this.f41505k0.setVisibility(8);
        }
        if (i10 == 0 && (h9Var2 = this.f41531s1) != null) {
            h9Var2.setVisibility(8);
        }
        if (i10 == -1) {
            this.Z0.setVisibility(8);
            if (i11 == 2) {
                i12 = 0;
            } else {
                i12 = 8;
            }
            this.f41484d1.setVisibility(i12);
            if (i11 == 2) {
                i13 = 0;
            } else {
                i13 = 8;
            }
            this.f41494g1.setVisibility(i13);
            if (i11 == 2) {
                i14 = 0;
            } else {
                i14 = 8;
            }
            this.f41477b1.setVisibility(i14);
            ImageView imageView = this.f41491f1;
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
        if ((i11 == 0 || i10 == 0) && (h9Var = this.f41531s1) != null) {
            h9Var.f41326a1.setLayerType(0, null);
        }
        lf0 lf0Var = this.f41555z1;
        if (lf0Var != null) {
            if (i11 != 1 && i11 != -1) {
                z10 = false;
            }
            lf0Var.setAllowTouch(z10);
        }
        if (i11 == 3) {
            n9 n9Var2 = this.f41517o1;
            if (n9Var2 != null) {
                n9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 3 && (n9Var = this.f41517o1) != null) {
            n9Var.setVisibility(8);
            this.f41517o1.setAppearProgress(0.0f);
            n9 n9Var3 = this.f41517o1;
            n9Var3.f41313x = null;
            a0 a0Var = n9Var3.f41308f;
            a0Var.I = null;
            a0Var.d = null;
            a0Var.G = false;
            n9Var3.d.setVisibility(8);
            n9Var3.f41305a.setCropEditorDrawing(null);
        }
        if (i11 == 4) {
            o9 o9Var2 = this.f41520p1;
            if (o9Var2 != null) {
                o9Var2.setAppearProgress(1.0f);
            }
        } else if (i10 == 4 && (o9Var = this.f41520p1) != null) {
            o9Var.setVisibility(8);
            this.f41520p1.setAppearProgress(0.0f);
            o9 o9Var3 = this.f41520p1;
            o9Var3.f41594b = null;
            a0 a0Var2 = o9Var3.h;
            a0Var2.I = null;
            a0Var2.d = null;
            a0Var2.G = false;
            o9Var3.e.setVisibility(8);
            o9Var3.setVisibility(8);
        }
    }

    public final void R(x9 x9Var) {
        nh.n6 o10;
        ca caVar;
        if (this.d) {
            return;
        }
        int i10 = this.f41479c;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        int i11 = 0;
        this.f41526r0 = false;
        this.e = false;
        this.f41553y2 = false;
        this.f41519p0.f41859g = false;
        WindowManager windowManager = this.f41489f;
        if (windowManager != null && (caVar = this.f41512n) != null && caVar.getParent() == null) {
            ca caVar2 = this.f41512n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, caVar2, layoutParams);
            windowManager.addView(this.f41512n, layoutParams);
            g0();
        }
        this.f41547x0.setCameraThumb(A());
        if (this.f41530s0 == 0 && (o10 = MessagesController.getInstance(i10).getStoriesController().o()) != null && o10.a(i10, 1)) {
            h0(o10, true);
        }
        K(0, false);
        l0(-1, false, false);
        RectF rectF = this.E;
        if (x9Var != null) {
            this.C = x9Var;
            this.G = x9Var.f42631a;
            rectF.set(x9Var.f42633c);
            this.D = x9Var.f42632b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f41525r.c();
        int i12 = this.G;
        if (i12 != 1 && i12 != 0) {
            i11 = -14737633;
        }
        this.f41486e0.setBackgroundColor(i11);
        this.f41525r.setTranslationX(0.0f);
        this.f41525r.setTranslationY(0.0f);
        this.f41525r.b(0.0f);
        this.f41525r.setScaleX(1.0f);
        this.f41525r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f41475b, 1);
        g(1.0f, true, new h8(this, 6));
        e();
        this.f41530s0 = 0L;
        this.f41533t0 = "";
    }

    public final void S(w9 w9Var, u6 u6Var, long j10) {
        int i10;
        ca caVar;
        if (this.d) {
            return;
        }
        int i11 = this.f41479c;
        if (MessagesController.getInstance(i11).isFrozen()) {
            org.telegram.ui.c.b(i11);
            return;
        }
        this.f41526r0 = false;
        this.e = false;
        this.f41553y2 = false;
        WindowManager windowManager = this.f41489f;
        if (windowManager != null && (caVar = this.f41512n) != null && caVar.getParent() == null) {
            ca caVar2 = this.f41512n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, caVar2, layoutParams);
            windowManager.addView(this.f41512n, layoutParams);
            g0();
        }
        this.H1 = u6Var;
        this.L1 = u6Var.K ? 1 : 0;
        this.f41519p0.f41859g = false;
        RectF rectF = this.E;
        if (w9Var != null) {
            this.C = w9Var;
            this.G = w9Var.f42631a;
            rectF.set(w9Var.f42633c);
            this.D = w9Var.f42632b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f41525r.c();
        int i12 = this.G;
        int i13 = 1;
        if (i12 != 1 && i12 != 0) {
            i10 = -14737633;
        } else {
            i10 = 0;
        }
        this.f41486e0.setBackgroundColor(i10);
        this.f41525r.setTranslationX(0.0f);
        this.f41525r.setTranslationY(0.0f);
        this.f41525r.b(0.0f);
        this.f41525r.setScaleX(1.0f);
        this.f41525r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f41475b, 1);
        u6 u6Var2 = this.H1;
        if (u6Var2 != null) {
            this.Z0.setText(u6Var2.C0);
        }
        L(new v8(this, 0), j10);
        if (this.H1.f42402b0) {
            i13 = 2;
        }
        K(i13, false);
        l0(-1, false, false);
        this.Y0.b(false, false);
        e();
        this.f41530s0 = 0L;
        this.f41533t0 = "";
    }

    public final void T() {
        o70 o70Var;
        s9 s9Var = this.U0;
        if (s9Var != null) {
            s9Var.x(4, true);
        }
        t9 t9Var = this.Z0;
        if (t9Var != null && (o70Var = t9Var.S0) != null) {
            o70Var.u();
            t9Var.S0 = null;
        }
        eg.o1 o1Var = new eg.o1((org.telegram.ui.ActionBar.p2) new j9(this, 1), 14, false);
        o1Var.setOnDismissListener(new u8(this, 1));
        o1Var.show();
    }

    public final void U(w9 w9Var, u6 u6Var) {
        int i10;
        boolean z4;
        int i11;
        nh.n6 o10;
        ca caVar;
        if (this.d) {
            return;
        }
        int i12 = this.f41479c;
        if (MessagesController.getInstance(i12).isFrozen()) {
            org.telegram.ui.c.b(i12);
            return;
        }
        this.f41526r0 = true;
        this.e = false;
        this.f41553y2 = false;
        WindowManager windowManager = this.f41489f;
        if (windowManager != null && (caVar = this.f41512n) != null && caVar.getParent() == null) {
            ca caVar2 = this.f41512n;
            WindowManager.LayoutParams layoutParams = this.h;
            AndroidUtilities.setPreferredMaxRefreshRate(windowManager, caVar2, layoutParams);
            windowManager.addView(this.f41512n, layoutParams);
            g0();
        }
        this.H1 = u6Var;
        g8.a(i12, u6Var);
        u6 u6Var2 = this.H1;
        if (u6Var2 != null && u6Var2.K) {
            i10 = 1;
        } else {
            i10 = 0;
        }
        this.L1 = i10;
        if (u6Var2 != null && u6Var2.f42439u && i10 == 1) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.f41519p0.f41859g = z4;
        if (this.f41530s0 == 0 && (o10 = MessagesController.getInstance(i12).getStoriesController().o()) != null && o10.a(i12, 1)) {
            h0(o10, true);
        }
        RectF rectF = this.E;
        if (w9Var != null) {
            this.C = w9Var;
            this.G = w9Var.f42631a;
            rectF.set(w9Var.f42633c);
            this.D = w9Var.f42632b;
            this.C.e();
        } else {
            this.G = 0;
            rectF.set(0.0f, AndroidUtilities.dp(100.0f), AndroidUtilities.displaySize.x, AndroidUtilities.dp(100.0f) + AndroidUtilities.displaySize.y);
            this.D = AndroidUtilities.dp(8.0f);
        }
        this.f41525r.c();
        int i13 = this.G;
        if (i13 != 1 && i13 != 0) {
            i11 = -14737633;
        } else {
            i11 = 0;
        }
        this.f41486e0.setBackgroundColor(i11);
        this.f41525r.setTranslationX(0.0f);
        this.f41525r.setTranslationY(0.0f);
        this.f41525r.b(0.0f);
        this.f41525r.setScaleX(1.0f);
        this.f41525r.setScaleY(1.0f);
        this.H = 0.0f;
        AndroidUtilities.lockOrientation(this.f41475b, 1);
        u6 u6Var3 = this.H1;
        if (u6Var3 != null) {
            this.Z0.setText(u6Var3.C0);
        }
        this.Y0.b(true, false);
        K(1, false);
        l0(-1, false, false);
        g(1.0f, true, new h8(this, 6));
        e();
        this.f41530s0 = 0L;
        this.f41533t0 = "";
    }

    public final void V() {
        cg.p1 p1Var = this.f41534t1;
        if (p1Var != null) {
            p1Var.bringToFront();
        }
        View view = this.f41537u1;
        if (view != null) {
            view.bringToFront();
        }
        View view2 = this.f41540v1;
        if (view2 != null) {
            view2.bringToFront();
        }
        View view3 = this.f41544w1;
        if (view3 != null) {
            view3.bringToFront();
        }
        View view4 = this.f41548x1;
        if (view4 != null) {
            view4.bringToFront();
        }
        ra raVar = this.f41510m1;
        if (raVar != null) {
            raVar.bringToFront();
        }
        lf0 lf0Var = this.f41555z1;
        if (lf0Var != null) {
            lf0Var.bringToFront();
        }
        cf0 cf0Var = this.B1;
        if (cf0Var != null) {
            cf0Var.bringToFront();
        }
        ef0 ef0Var = this.C1;
        if (ef0Var != null) {
            ef0Var.bringToFront();
        }
        g5 g5Var = this.l1;
        if (g5Var != null) {
            g5Var.bringToFront();
        }
        n nVar = this.f41514n1;
        if (nVar != null) {
            nVar.bringToFront();
        }
    }

    public final void W(u6 u6Var, boolean z4) {
        File file;
        View view;
        float f10;
        u6 u6Var2;
        boolean z10;
        int i10;
        if (u6Var != null && this.U0.getWidth() > 0 && this.U0.getHeight() > 0) {
            if (z4) {
                file = u6Var.O0;
            } else {
                file = u6Var.N0;
            }
            if (file != null) {
                file.delete();
            }
            if (this.f41547x0.j()) {
                view = this.f41547x0;
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
            w61 textureView = this.U0.getTextureView();
            if (u6Var.K && !u6Var.f42439u && textureView != null) {
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
            File file2 = u6Var.Q0;
            if (file2 != null) {
                try {
                    Bitmap decodeFile = BitmapFactory.decodeFile(file2.getPath());
                    canvas.save();
                    float width2 = width / decodeFile.getWidth();
                    canvas.scale(width2, width2);
                    canvas.drawBitmap(decodeFile, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile.recycle();
                } catch (Exception e) {
                    FileLog.e(e);
                }
            }
            File file3 = u6Var.P0;
            if (file3 != null) {
                try {
                    Bitmap decodeFile2 = BitmapFactory.decodeFile(file3.getPath());
                    canvas.save();
                    float width3 = width / decodeFile2.getWidth();
                    canvas.scale(width3, width3);
                    canvas.drawBitmap(decodeFile2, 0.0f, 0.0f, paint);
                    canvas.restore();
                    decodeFile2.recycle();
                } catch (Exception e6) {
                    FileLog.e(e6);
                }
            }
            h9 h9Var = this.f41531s1;
            if (h9Var != null && h9Var.O0 != null) {
                canvas.save();
                canvas.scale(f10, f10);
                h9 h9Var2 = this.f41531s1;
                h9Var2.F0 = true;
                w4 w4Var = h9Var2.O0;
                w4Var.f4439a = true;
                w4Var.draw(canvas);
                h9 h9Var3 = this.f41531s1;
                h9Var3.O0.f4439a = false;
                h9Var3.F0 = false;
                canvas.restore();
            }
            Bitmap createScaledBitmap = Bitmap.createScaledBitmap(createBitmap, 40, 22, true);
            File w10 = u6.w(this.f41479c, "jpg");
            if (z4) {
                u6Var2 = u6Var;
                z10 = z4;
                Utilities.searchQueue.postRunnable(new gg.j(this, createBitmap, z10, w10, u6Var2, 21));
            } else {
                u6Var2 = u6Var;
                z10 = z4;
                try {
                    Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.JPEG;
                    if (z10) {
                        i10 = 95;
                    } else {
                        i10 = 99;
                    }
                    createBitmap.compress(compressFormat, i10, new FileOutputStream(w10));
                } catch (Exception e10) {
                    FileLog.e(e10);
                }
            }
            if (!z10) {
                u6Var2.N0 = w10;
            }
            u6Var2.f42403b1 = createScaledBitmap;
        }
    }

    public final void X() {
        nh.n6 o10;
        int size;
        char c3;
        View[] viewPages;
        p51[] p51VarArr;
        f8 f8Var = this.f41513n0;
        BitmapDrawable bitmapDrawable = null;
        if (f8Var != null) {
            f8Var.dismiss();
            this.f41513n0 = null;
        }
        if (this.K1) {
            n0 n0Var = this.f41477b1;
            n0Var.getClass();
            n0Var.c(R.raw.error, LocaleController.getString("VideoConvertFail"));
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            e5 e5Var = this.Y0.f41645c;
            int i10 = -this.R1;
            this.R1 = i10;
            AndroidUtilities.shakeViewSpring(e5Var, i10);
            return;
        }
        t9 t9Var = this.Z0;
        if (t9Var != null && t9Var.o()) {
            BotWebViewVibrationEffect.APP_ERROR.vibrate();
            org.telegram.ui.Components.k6 k6Var = t9Var.v;
            int i11 = -this.R1;
            this.R1 = i11;
            AndroidUtilities.shakeViewSpring(k6Var, i11);
            t9Var.e();
            return;
        }
        u6 u6Var = this.H1;
        int i12 = this.f41479c;
        if ((u6Var == null || (!u6Var.f42413g && u6Var.J0 == 0)) && (o10 = MessagesController.getInstance(i12).storiesController.o()) != null && o10.a(i12, B())) {
            h0(o10, false);
            return;
        }
        this.H1.D0 = MessagesController.getInstance(i12).storyEntitiesAllowed();
        nh.b bVar = this.f41472a;
        if (t9Var != null && !this.H1.D0) {
            CharSequence text = t9Var.getText();
            if (text instanceof Spannable) {
                Spannable spannable = (Spannable) text;
                if (((t01[]) spannable.getSpans(0, text.length(), t01.class)).length > 0 || ((URLSpan[]) spannable.getSpans(0, text.length(), URLSpan.class)).length > 0) {
                    new qc(this.f41512n, bVar).Q(R.raw.voip_invite, 36, AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.StoryPremiumFormatting), org.telegram.ui.ActionBar.j6.f19966gc, 0, new h8(this, 27), bVar)).k(true);
                    int i13 = -this.R1;
                    this.R1 = i13;
                    AndroidUtilities.shakeViewSpring(t9Var, i13);
                    return;
                }
            }
        }
        u6 u6Var2 = this.H1;
        if (!u6Var2.f42413g && u6Var2.J0 == 0) {
            if (this.K != 0) {
                u6Var2.f42441v0 = MessagesController.getInstance(i12).getInputPeer(this.K);
            }
            s9 s9Var = this.U0;
            s9Var.x(3, true);
            f8 f8Var2 = new f8(this.f41475b, this.H1.I0, bVar);
            f8Var2.q1(this.H1.E0);
            f8Var2.p1(this.H1.f42441v0);
            f8Var2.C = this.J;
            f8Var2.R = new i8(this, 14);
            f8Var2.e1(!this.f41547x0.j());
            ArrayList arrayList = this.F1;
            if (arrayList == null) {
                size = this.H1.r();
            } else {
                size = arrayList.size();
            }
            f8Var2.m1(size);
            f8Var2.k1(false);
            CharSequence text2 = t9Var.getText();
            ArrayList arrayList2 = new ArrayList();
            if (text2 instanceof Spanned) {
                for (p51 p51Var : (p51[]) ((Spanned) text2).getSpans(0, text2.length(), p51.class)) {
                    if (p51Var != null) {
                        try {
                            TLRPC.User user = MessagesController.getInstance(i12).getUser(Long.valueOf(Long.parseLong(p51Var.getURL())));
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
                                if (!user2.bot && !UserObject.isUserSelf(user2) && user2.f19331id != 777000 && !UserObject.isReplyUser(user2) && !arrayList2.contains(charSequence)) {
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
                        if (!user3.bot && !UserObject.isUserSelf(user3) && user3.f19331id != 777000 && !UserObject.isReplyUser(user3) && !arrayList2.contains(charSequence2)) {
                            arrayList2.add(charSequence2);
                        }
                    }
                }
            } else {
                c3 = 1;
            }
            f8Var2.P = arrayList2;
            f8Var2.T = new i8(this, 15);
            f8Var2.U = new i8(this, 16);
            f8Var2.Q = new q8(this, 10);
            this.f41513n0 = f8Var2;
            u6 u6Var3 = this.H1;
            if (u6Var3.K) {
                if (s9Var != null && !u6Var3.f42412f0 && this.f41480c0 != 2) {
                    u6Var3.f42409e0 = s9Var.getCurrentPosition();
                    Utilities.Callback i8Var = new i8(this, 17);
                    View view = this.f41534t1;
                    View view2 = this.f41544w1;
                    View[] viewArr = new View[3];
                    viewArr[0] = s9Var;
                    viewArr[c3] = view;
                    viewArr[2] = view2;
                    s9Var.h(i8Var, viewArr);
                }
                f8 f8Var3 = this.f41513n0;
                Bitmap bitmap = this.H1.f42414g0;
                h8 h8Var = new h8(this, 20);
                if (bitmap != null) {
                    f8Var3.getClass();
                    bitmapDrawable = new BitmapDrawable(bitmap);
                }
                f8Var3.Y = bitmapDrawable;
                f8Var3.Z = h8Var;
                ek ekVar = f8Var3.f41657b;
                if (ekVar != null) {
                    for (View view3 : ekVar.getViewPages()) {
                        if (view3 instanceof z7) {
                            z7 z7Var = (z7) view3;
                            z7Var.g(false);
                            z7Var.e(false);
                        }
                    }
                }
            }
            this.f41513n0.setOnDismissListener(new u8(this, 0));
            this.f41513n0.show();
            return;
        }
        u6Var2.f42422l = false;
        i(null);
        p0();
    }

    public final void Y(y9 y9Var) {
        int i10 = 0;
        RectF rectF = this.E;
        if (y9Var != null) {
            this.C = y9Var;
            this.G = y9Var.f42631a;
            rectF.set(y9Var.f42633c);
            this.D = y9Var.f42632b;
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
        this.f41486e0.setBackgroundColor(i10);
    }

    public final void Z(boolean z4) {
        Activity activity;
        boolean z10;
        if (!this.f41535t2 || z4) {
            this.f41521p2 = false;
            if (Build.VERSION.SDK_INT >= 23 && (activity = this.f41475b) != null) {
                if (activity.checkSelfPermission("android.permission.CAMERA") != 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                this.f41521p2 = z10;
                if (z10) {
                    Drawable mutate = activity.getResources().getDrawable(R.drawable.story_camera).mutate();
                    mutate.setColorFilter(new PorterDuffColorFilter(1040187391, PorterDuff.Mode.MULTIPLY));
                    nq nqVar = new nq(new ColorDrawable(-14540254), mutate);
                    int dp = AndroidUtilities.dp(64.0f);
                    int dp2 = AndroidUtilities.dp(64.0f);
                    nqVar.e = dp;
                    nqVar.f27338f = dp2;
                    this.f41547x0.setCameraThumb(nqVar);
                    if (activity.shouldShowRequestPermissionRationale("android.permission.CAMERA")) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(activity, 0, this.f41472a);
                        alertDialog$Builder.m(R.raw.permission_request_camera, 72, org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.L5, false), null);
                        alertDialog$Builder.f19503a.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.PermissionNoCameraWithHint));
                        alertDialog$Builder.k(LocaleController.getString(R.string.PermissionOpenSettings), new q8(this, 13));
                        alertDialog$Builder.h(LocaleController.getString(R.string.ContactsPermissionAlertNotNow), null);
                        alertDialog$Builder.f19503a.show();
                        return;
                    }
                    activity.requestPermissions(new String[]{"android.permission.CAMERA"}, 111);
                    this.f41535t2 = true;
                }
            }
            if (!this.f41521p2) {
                if (CameraController.getInstance().isCameraInitied()) {
                    r();
                } else {
                    CameraController.getInstance().initCamera(new h8(this, 0));
                }
            }
        }
    }

    public final void b0(Runnable runnable) {
        i9 i9Var = this.f41551y0;
        if (i9Var != null && i9Var.getTextureView() != null) {
            try {
                Utilities.themeQueue.postRunnable(new m71(this, this.f41551y0.getTextureView().getBitmap(), runnable, 20));
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
            animate.alpha(f10).setUpdateListener(new g9(this, 1)).setListener(new androidx.fragment.app.g(this, z4, view, 13)).setDuration(320L).setInterpolator(nr.h).start();
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
            this.f41489f.updateViewLayout(this.f41512n, layoutParams);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        nh.n6 o10;
        u6 u6Var;
        boolean z4 = false;
        z4 = false;
        z4 = false;
        z4 = false;
        if (i10 == NotificationCenter.albumsDidLoad) {
            t5 t5Var = this.L0;
            if (t5Var != null) {
                t5Var.h();
            }
            if (this.f41504j2 != null && MediaController.allMediaAlbums != null) {
                for (int i12 = 0; i12 < MediaController.allMediaAlbums.size(); i12++) {
                    MediaController.AlbumEntry albumEntry = MediaController.allMediaAlbums.get(i12);
                    int i13 = albumEntry.bucketId;
                    MediaController.AlbumEntry albumEntry2 = this.f41504j2;
                    if (i13 == albumEntry2.bucketId && albumEntry.videoOnly == albumEntry2.videoOnly) {
                        this.f41504j2 = albumEntry;
                        return;
                    }
                }
            }
        } else if (i10 == NotificationCenter.storiesDraftsUpdated) {
            t5 t5Var2 = this.L0;
            if (t5Var2 != null && !this.S1) {
                t5Var2.h();
            }
        } else if (i10 == NotificationCenter.storiesLimitUpdate) {
            int i14 = this.f41480c0;
            int i15 = this.f41479c;
            if (i14 == 1) {
                if (!this.K1 && !this.Z0.o()) {
                    nh.t6 storiesController = MessagesController.getInstance(i15).getStoriesController();
                    int B = B();
                    nh.n6 o11 = storiesController.o();
                    if (o11 == null || !o11.a(storiesController.f15917a, B) || ((u6Var = this.H1) != null && (u6Var.f42413g || u6Var.J0 != 0))) {
                        z4 = true;
                    }
                }
                this.Y0.setShareEnabled(z4);
            } else if (i14 == 0 && (o10 = MessagesController.getInstance(i15).getStoriesController().o()) != null && o10.a(i15, 1)) {
                u6 u6Var2 = this.H1;
                if (u6Var2 == null || u6Var2.J0 == 0) {
                    h0(o10, true);
                }
            }
        }
    }

    public final void e() {
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.albumsDidLoad);
        int i10 = this.f41479c;
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesDraftsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.storiesLimitUpdate);
    }

    public final void e0(String str) {
        int i10;
        this.B0.clearAnimation();
        i9 i9Var = this.f41551y0;
        if ((i9Var != null && i9Var.isDual()) || this.X1) {
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
        pa paVar = this.B0;
        if (paVar.f42192n != i10) {
            paVar.f42192n = i10;
            ValueAnimator valueAnimator = paVar.f42193r;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                paVar.f42193r = null;
            }
            paVar.setDrawable(i10);
        }
        if (this.f41480c0 == 0 && !this.F0.e && this.V1 != null && !I()) {
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
        Boolean bool = this.f41511m2;
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
                this.f41515n2 = new r8(this, z4, 0);
                return;
            }
            ValueAnimator valueAnimator = this.f41507k2;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f41507k2 = null;
            }
            o1.j jVar = this.f41509l2;
            if (jVar != null) {
                jVar.c();
                this.f41509l2 = null;
            }
            if (this.J0 == null) {
                if (z4) {
                    t(false);
                }
                if (this.J0 == null) {
                    return;
                }
            }
            e9 e9Var = this.J0;
            if (e9Var != null) {
                e9Var.H = false;
            }
            if (z4 && (o0Var = this.K0) != null) {
                o0Var.a(false);
            }
            int i11 = 4;
            v9 v9Var = this.f41525r;
            if (v9Var != null) {
                if (z4) {
                    i10 = 4;
                } else {
                    i10 = 0;
                }
                v9Var.setImportantForAccessibility(i10);
            }
            e9 e9Var2 = this.J0;
            if (z4) {
                i11 = 0;
            }
            e9Var2.setImportantForAccessibility(i11);
            this.f41511m2 = Boolean.valueOf(z4);
            float translationY = this.J0.getTranslationY();
            ca caVar = this.f41512n;
            if (z4) {
                height = 0.0f;
            } else {
                height = (caVar.getHeight() - this.J0.g()) + (AndroidUtilities.navigationBarHeight * 2.5f);
            }
            Math.max(1, caVar.getHeight());
            e9 e9Var3 = this.J0;
            e9Var3.H = !z4;
            if (this.f41495g2 == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f41498h2 = z10;
            if (z4) {
                o1.j jVar2 = new o1.j(e9Var3, o1.h.f16182n, height);
                this.f41509l2 = jVar2;
                jVar2.f16198u.a(0.75f);
                this.f41509l2.f16198u.b(350.0f);
                this.f41509l2.a(new ig0(this, height, 1));
                this.f41509l2.f();
            } else {
                ValueAnimator ofFloat = ValueAnimator.ofFloat(translationY, height);
                this.f41507k2 = ofFloat;
                ofFloat.addUpdateListener(new s8(this, 0));
                this.f41507k2.addListener(new d9(this, 1));
                this.f41507k2.setDuration(450L);
                this.f41507k2.setInterpolator(nr.h);
                this.f41507k2.start();
            }
            if (!z4 && !this.P1) {
                this.f41501i2 = null;
            }
            if (!z4 && this.f41480c0 == 0 && !this.f41521p2) {
                r();
            }
        }
    }

    public final void f0(boolean z4, boolean z10) {
        if (this.f41481c1 == null) {
            gj0 gj0Var = new gj0(R.raw.media_mute_unmute, "media_mute_unmute", AndroidUtilities.dp(28.0f), AndroidUtilities.dp(28.0f), true, null);
            this.f41481c1 = gj0Var;
            gj0Var.C *= 1.5f;
        }
        this.f41484d1.setAnimation(this.f41481c1);
        int i10 = 20;
        if (!z10) {
            gj0 gj0Var2 = this.f41481c1;
            if (!z4) {
                i10 = 0;
            }
            gj0Var2.L(i10, false, false);
        } else if (z4) {
            gj0 gj0Var3 = this.f41481c1;
            if (gj0Var3.Y > 20) {
                gj0Var3.L(0, false, false);
            }
            this.f41481c1.N(20);
            this.f41481c1.start();
        } else {
            gj0 gj0Var4 = this.f41481c1;
            int i11 = gj0Var4.Y;
            if (i11 != 0 && i11 < 43) {
                gj0Var4.N(43);
                this.f41481c1.start();
            }
        }
    }

    public final void g(float f10, boolean z4, Runnable runnable) {
        ValueAnimator valueAnimator = this.B;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.B = null;
        }
        v9 v9Var = this.f41525r;
        if (z4) {
            this.M.lock();
            NotificationCenter.getGlobalInstance().lambda$postNotificationNameOnUIThread$1(NotificationCenter.stopAllHeavyOperations, 512);
            this.I = Float.valueOf(this.H);
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.F, f10);
            this.B = ofFloat;
            ofFloat.addUpdateListener(new s8(this, 5));
            this.B.addListener(new lh.k5(this, f10, runnable, 4));
            if (f10 < 1.0f && this.v) {
                this.B.setDuration(250L);
                this.B.setInterpolator(nr.h);
            } else if (f10 <= 0.0f && v9Var.f42486a >= AndroidUtilities.dp(20.0f)) {
                if (f10 < 0.0f && this.L) {
                    this.B.setDuration(200L);
                    this.B.setInterpolator(nr.h);
                    this.L = false;
                } else {
                    this.B.setDuration(400L);
                    this.B.setInterpolator(nr.h);
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
        v9Var.invalidate();
        this.f41512n.invalidate();
        runnable.run();
        o();
    }

    public final void g0() {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT < 33 || (findOnBackInvokedDispatcher = this.f41512n.findOnBackInvokedDispatcher()) == null) {
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
            f3 f3Var = this.f41500i1;
            if (f3Var != null) {
                f3Var.e(true);
            }
            f3 f3Var2 = this.f41503j1;
            if (f3Var2 != null) {
                f3Var2.e(true);
            }
            f3 f3Var3 = this.f41497h1;
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
        if (z4 && (uVar = this.F0) != null && uVar.e) {
            uVar.a(false, z10);
        }
        m0(z10);
        x8 x8Var = this.N0;
        e3 e3Var = this.R0;
        e3 e3Var2 = this.Q0;
        float f12 = 0.6f;
        float f13 = 1.0f;
        float f14 = 0.0f;
        if (z10) {
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.W1 = animatorSet2;
            Property property = View.ALPHA;
            if (z4 && this.f41480c0 == 0 && !I()) {
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(e3Var2, property, f11);
            Property property2 = View.TRANSLATION_Y;
            if (z4 && this.f41480c0 == 0 && !I()) {
                dp3 = 0.0f;
            } else {
                dp3 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(e3Var2, property2, dp3);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(e3Var, property, (!z4 && this.f41480c0 == 0 && I()) ? 0.0f : 0.0f);
            if (!z4 && this.f41480c0 == 0 && I()) {
                dp4 = 0.0f;
            } else {
                dp4 = AndroidUtilities.dp(16.0f);
            }
            ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(e3Var, property2, dp4);
            ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(x8Var, property, (z4 || this.f41480c0 != 0 || I()) ? 0.0f : 0.0f);
            if (z4 || this.f41480c0 != 0 || I()) {
                f14 = AndroidUtilities.dp(16.0f);
            }
            animatorSet2.playTogether(ofFloat, ofFloat2, ofFloat3, ofFloat4, ofFloat5, ObjectAnimator.ofFloat(x8Var, property2, f14));
            this.W1.setDuration(260L);
            this.W1.setInterpolator(nr.h);
            this.W1.start();
            return;
        }
        if (z4 && this.f41480c0 == 0 && !I()) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        e3Var2.setAlpha(f10);
        if (z4 && this.f41480c0 == 0 && !I()) {
            dp = 0.0f;
        } else {
            dp = AndroidUtilities.dp(16.0f);
        }
        e3Var2.setTranslationY(dp);
        e3Var.setAlpha((!z4 && this.f41480c0 == 0 && I()) ? 0.0f : 0.0f);
        if (!z4 && this.f41480c0 == 0 && I()) {
            dp2 = 0.0f;
        } else {
            dp2 = AndroidUtilities.dp(16.0f);
        }
        e3Var.setTranslationY(dp2);
        x8Var.setAlpha((z4 || this.f41480c0 != 0 || I()) ? 0.0f : 0.0f);
        if (z4 || this.f41480c0 != 0 || I()) {
            f14 = AndroidUtilities.dp(16.0f);
        }
        x8Var.setTranslationY(f14);
    }

    public final void h0(nh.n6 n6Var, boolean z4) {
        if (this.f41545w2) {
            return;
        }
        eg.v0 v0Var = new eg.v0(n6Var.b(), this.f41479c, this.f41475b, new j9(this, 0), null);
        v0Var.U = B();
        v0Var.setOnDismissListener(new d80(2, this, z4));
        this.U0.x(7, true);
        this.f41545w2 = true;
        v0Var.show();
    }

    public final void i(Runnable runnable) {
        u6 u6Var;
        Runnable runnable2;
        s9 s9Var;
        float f10;
        boolean z4;
        Bitmap.CompressFormat compressFormat;
        nf0 nf0Var = this.f41552y1;
        if (nf0Var != null && (u6Var = this.H1) != null) {
            u6Var.f42418j = nf0Var.d() | u6Var.f42418j;
            u6 u6Var2 = this.H1;
            nf0 nf0Var2 = this.f41552y1;
            File file = u6Var2.Z0;
            if (file != null) {
                file.delete();
                u6Var2.Z0 = null;
            }
            MediaController.SavedFilterState savedFilterState = nf0Var2.getSavedFilterState();
            u6Var2.f42400a1 = savedFilterState;
            if (!u6Var2.K) {
                if (savedFilterState.isEmpty()) {
                    if (runnable != null) {
                        runnable.run();
                    }
                } else {
                    Bitmap bitmap = nf0Var2.getBitmap();
                    if (bitmap == null) {
                        if (runnable != null) {
                            runnable.run();
                        }
                    } else {
                        Matrix matrix = new Matrix();
                        int i10 = u6Var2.R;
                        float f11 = 1.0f;
                        if (i10 == 1) {
                            f10 = -1.0f;
                        } else {
                            f10 = 1.0f;
                        }
                        if (i10 == 2) {
                            f11 = -1.0f;
                        }
                        matrix.postScale(f10, f11, u6Var2.f42421k0 / 2.0f, u6Var2.f42423l0 / 2.0f);
                        matrix.postRotate(-u6Var2.Q);
                        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, bitmap.getWidth(), bitmap.getHeight(), matrix, true);
                        u6Var2.f42426n0.preScale(u6Var2.f42421k0 / createBitmap.getWidth(), u6Var2.f42423l0 / createBitmap.getHeight());
                        u6Var2.f42421k0 = createBitmap.getWidth();
                        u6Var2.f42423l0 = createBitmap.getHeight();
                        bitmap.recycle();
                        File file2 = u6Var2.Z0;
                        if (file2 != null && file2.exists()) {
                            u6Var2.Z0.delete();
                        }
                        String k10 = u6.k(u6Var2.L);
                        String str = "webp";
                        if (!"png".equals(k10) && !"webp".equals(k10)) {
                            z4 = false;
                        } else {
                            z4 = true;
                        }
                        int i11 = u6Var2.f42398a;
                        if (!z4) {
                            str = "jpg";
                        }
                        u6Var2.Z0 = u6.w(i11, str);
                        if (runnable == null) {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(u6Var2.Z0);
                                if (z4) {
                                    compressFormat = Bitmap.CompressFormat.WEBP;
                                } else {
                                    compressFormat = Bitmap.CompressFormat.JPEG;
                                }
                                createBitmap.compress(compressFormat, 90, fileOutputStream);
                            } catch (Exception e) {
                                FileLog.e(e);
                            }
                            createBitmap.recycle();
                        } else {
                            runnable2 = runnable;
                            Utilities.themeQueue.postRunnable(new cg.u0(u6Var2, createBitmap, z4, runnable2, 26));
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
                u6 u6Var3 = this.H1;
                if (!u6Var3.K && (s9Var = this.U0) != null) {
                    s9Var.set(u6Var3);
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
                animate.alpha(f10).setDuration(350L).setInterpolator(nr.h).withEndAction(new r8(this, z4, 1)).start();
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
        if (this.H1 != null && this.A1 != null && this.f41486e0.getMeasuredWidth() > 0 && this.f41486e0.getMeasuredHeight() > 0) {
            Matrix matrix = new Matrix();
            matrix.reset();
            int i10 = this.H1.Q;
            if (i10 != 0) {
                matrix.postRotate(-i10, this.f41486e0.getMeasuredWidth() / 2.0f, this.f41486e0.getMeasuredHeight() / 2.0f);
                if ((this.H1.Q / 90) % 2 == 1) {
                    matrix.postScale(this.f41486e0.getMeasuredWidth() / this.f41486e0.getMeasuredHeight(), this.f41486e0.getMeasuredHeight() / this.f41486e0.getMeasuredWidth(), this.f41486e0.getMeasuredWidth() / 2.0f, this.f41486e0.getMeasuredHeight() / 2.0f);
                }
            }
            matrix.postScale((1.0f / this.f41486e0.getMeasuredWidth()) * this.H1.f42421k0, (1.0f / this.f41486e0.getMeasuredHeight()) * this.H1.f42423l0);
            matrix.postConcat(this.H1.f42426n0);
            matrix.postScale(this.f41486e0.getMeasuredWidth() / this.H1.f42417i0, this.f41486e0.getMeasuredHeight() / this.H1.f42419j0);
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
                Runnable runnable = this.f41478b2;
                if (runnable != null) {
                    AndroidUtilities.cancelRunOnUIThread(runnable);
                }
                h8 h8Var = new h8(this, 25);
                this.f41478b2 = h8Var;
                AndroidUtilities.runOnUIThread(h8Var, 2000L);
                return;
            }
            return;
        }
        AnimatorSet animatorSet = this.f41482c2;
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
        this.f41482c2 = animatorSet2;
        animatorSet2.setDuration(180L);
        if (z4) {
            h91Var.setVisibility(0);
        }
        AnimatorSet animatorSet3 = this.f41482c2;
        Property property = View.ALPHA;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = 0.0f;
        }
        animatorSet3.playTogether(ObjectAnimator.ofFloat(h91Var, property, f10));
        this.f41482c2.addListener(new l61(13, this, z4));
        this.f41482c2.start();
        if (z4) {
            h8 h8Var2 = new h8(this, 26);
            this.f41478b2 = h8Var2;
            AndroidUtilities.runOnUIThread(h8Var2, 2000L);
        }
    }

    public final void k() {
        nh.i3 i3Var;
        if (this.G == 1) {
            RectF rectF = this.f41473a0;
            rectF.set(this.f41486e0.getLeft(), this.f41486e0.getTop(), this.f41486e0.getMeasuredWidth(), this.f41486e0.getMeasuredHeight());
            rectF.offset(this.f41525r.getX(), this.f41525r.getY());
            float f10 = this.F;
            RectF rectF2 = this.E;
            RectF rectF3 = this.Z;
            AndroidUtilities.lerp(rectF2, rectF, f10, rectF3);
            this.f41486e0.setAlpha(this.F);
            float f11 = rectF3.left;
            p9 p9Var = this.f41486e0;
            p9Var.setTranslationX((f11 - p9Var.getLeft()) - this.f41525r.getX());
            float f12 = rectF3.top;
            p9 p9Var2 = this.f41486e0;
            p9Var2.setTranslationY((f12 - p9Var2.getTop()) - this.f41525r.getY());
            y9 y9Var = this.C;
            if (y9Var != null && (i3Var = y9Var.f42634f) != null) {
                i3Var.setTranslationX((rectF.left - rectF2.left) * this.F);
                this.C.f42634f.setTranslationY((rectF.top - rectF2.top) * this.F);
            }
            this.f41486e0.setScaleX(rectF3.width() / this.f41486e0.getMeasuredWidth());
            this.f41486e0.setScaleY(rectF3.height() / this.f41486e0.getMeasuredHeight());
            this.f41490f0.setAlpha(this.F);
            this.f41496h0.setAlpha(this.F);
            this.f41499i0.setAlpha(this.F);
            if (this.f41480c0 == 2) {
                this.f41527r1.setAlpha(this.F);
            }
        }
    }

    public final void k0() {
        f8 f8Var = this.f41513n0;
        if (f8Var != null) {
            f8Var.dismiss();
            this.f41513n0 = null;
        }
        f8 f8Var2 = new f8(this.f41475b, 86400, this.f41472a);
        f8Var2.o1();
        f8Var2.q1(this.f41539v0);
        TLRPC.InputPeer inputPeer = this.f41536u0;
        if (inputPeer == null) {
            if (this.K != 0) {
                inputPeer = MessagesController.getInstance(this.f41479c).getInputPeer(this.K);
            } else {
                inputPeer = new TLRPC.TL_inputPeerSelf();
            }
        }
        f8Var2.p1(inputPeer);
        f8Var2.C = this.J;
        f8Var2.R = new i8(this, 18);
        f8Var2.e1(false);
        f8Var2.m1(1);
        f8Var2.k1(false);
        f8Var2.T = new i8(this, 19);
        f8Var2.Q = new q8(this, 12);
        this.f41513n0 = f8Var2;
        f8Var2.show();
    }

    public final void l() {
        throw new UnsupportedOperationException("Method not decompiled: ph.da.l():void");
    }

    public final void l0(int r25, boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: ph.da.l0(int, boolean, boolean):void");
    }

    public final void m() {
        u6 u6Var;
        boolean z4;
        if (this.f41531s1 != null && (u6Var = this.H1) != null && u6Var.f42439u) {
            File file = u6Var.W0;
            if (file != null) {
                try {
                    file.delete();
                } catch (Exception e) {
                    FileLog.e(e);
                }
                this.H1.W0 = null;
            }
            this.H1.W0 = u6.w(this.f41479c, "webp");
            h9 h9Var = this.f41531s1;
            u6 u6Var2 = this.H1;
            ArrayList arrayList = u6Var2.T0;
            if (this.L1 != 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            Bitmap t02 = h9Var.t0(arrayList, false, false, true, z4, u6Var2);
            try {
                try {
                    t02.compress(Bitmap.CompressFormat.WEBP, 100, new FileOutputStream(this.H1.W0));
                    if (t02.isRecycled()) {
                        return;
                    }
                } catch (Exception e6) {
                    FileLog.e(e6);
                    try {
                        this.H1.W0.delete();
                    } catch (Exception e10) {
                        FileLog.e(e10);
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
        i9 i9Var;
        boolean z16 = false;
        if (this.f41480c0 == 0 && this.L1 == 1 && !this.F0.e && !I()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i0(z10, z4);
        this.D0.setSelected(this.f41547x0.j());
        u uVar = this.F0;
        if (uVar != null && uVar.e) {
            z11 = false;
        } else {
            z11 = true;
        }
        c0(this.f41505k0, z11, z4);
        if (!this.X1 && this.L1 != -1 && this.f41480c0 == 0 && this.V1 != null && !this.F0.e && !I()) {
            z12 = true;
        } else {
            z12 = false;
        }
        c0(this.B0, z12, z4);
        if (!this.X1 && this.L1 != -1 && this.f41480c0 == 0 && (i9Var = this.f41551y0) != null && i9Var.f42456a && !this.F0.e && !this.f41547x0.j()) {
            z13 = true;
        } else {
            z13 = false;
        }
        c0(this.C0, z13, z4);
        if (!this.X1 && this.L1 != -1 && this.f41480c0 == 0 && !this.F0.e) {
            z14 = true;
        } else {
            z14 = false;
        }
        c0(this.D0, z14, z4);
        c0(this.E0, this.F0.e, z4);
        if (this.f41547x0.j()) {
            f10 = this.f41547x0.getFilledProgress();
        } else {
            f10 = 0.0f;
        }
        this.L0.e(f10, z4);
        boolean z17 = this.F0.e;
        f3 f3Var = this.f41506k1;
        if (z17) {
            f3Var.v();
        } else {
            f3Var.e(true);
        }
        h(this.X1, z4);
        if (this.L1 == -1 && this.f41480c0 == 0) {
            z15 = true;
        } else {
            z15 = false;
        }
        AndroidUtilities.updateViewShow(this.P0, z15);
        if (this.L1 == -1 && this.f41480c0 == 0) {
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
        this.f41505k0.setTranslationX(0.0f);
        float alpha5 = this.f41505k0.getAlpha();
        float dp = (alpha4 * AndroidUtilities.dp(46.0f)) + alpha3 + AndroidUtilities.dp(8.0f);
        org.telegram.ui.k3 k3Var = this.F0.f42375a;
        k3Var.setPadding((int) ((alpha5 * AndroidUtilities.dp(46.0f)) + 0.0f + AndroidUtilities.dp(8.0f)), 0, (int) dp, 0);
        k3Var.invalidate();
    }

    public final void o() {
        boolean z4;
        if (this.H == 0.0f && this.F >= 1.0f && !this.f41553y2) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (z4 == this.f41549x2) {
            return;
        }
        lf.s0 s0Var = this.f41550y;
        if (s0Var != null) {
            s0Var.a(!z4);
        }
        this.f41549x2 = z4;
    }

    public final void o0(boolean z4) {
        int i10;
        gj0 gj0Var = this.f41487e1;
        if (gj0Var != null) {
            int[] iArr = gj0Var.e;
            int i11 = 0;
            if (z4) {
                u6 u6Var = this.H1;
                if (u6Var != null && u6Var.f42447y0) {
                    i11 = iArr[0];
                }
                gj0Var.N(i11);
                gj0 gj0Var2 = this.f41487e1;
                if (gj0Var2 != null) {
                    gj0Var2.start();
                    return;
                }
                return;
            }
            u6 u6Var2 = this.H1;
            if (u6Var2 != null && u6Var2.f42447y0) {
                i10 = iArr[0] - 1;
            } else {
                i10 = 0;
            }
            gj0Var.L(i10, false, true);
            this.f41487e1.N(i10);
            ImageView imageView = this.f41491f1;
            if (imageView != null) {
                imageView.invalidate();
            }
        }
    }

    public final void p() {
        if (this.f41524q2 < 0) {
            this.f41524q2 = MessagesController.getGlobalMainSettings().getInt("frontflash", 1);
            ArrayList arrayList = new ArrayList();
            this.f41528r2 = arrayList;
            arrayList.add("off");
            this.f41528r2.add("auto");
            this.f41528r2.add("on");
            float f10 = MessagesController.getGlobalMainSettings().getFloat("frontflash_warmth", 0.9f);
            d2 d2Var = this.f41529s;
            d2Var.f41432o = f10;
            d2Var.f41431n = d2.f(f10);
            d2Var.g();
            float f11 = MessagesController.getGlobalMainSettings().getFloat("frontflash_intensity", 1.0f);
            d2 d2Var2 = this.f41529s;
            d2Var2.f41433p = f11;
            d2Var2.i();
        }
    }

    public final void p0() {
        if (this.T1) {
            return;
        }
        this.T1 = true;
        h8 h8Var = new h8(this, 2);
        h9 h9Var = this.f41531s1;
        u6 u6Var = this.H1;
        if (h9Var != null && u6Var != null) {
            u6Var.f();
            boolean u02 = h9Var.u0();
            boolean z4 = h9Var.L0.getPainting().E;
            Utilities.searchQueue.postRunnable(new l8(this, h9Var, u6Var.f42417i0, u6Var.f42419j0, u6Var, z4, u02, h8Var, 1));
            return;
        }
        h8Var.run();
    }

    public final void q(boolean z4) {
        s9 s9Var;
        if (this.d) {
            f8 f8Var = this.f41513n0;
            if (f8Var != null) {
                f8Var.dismiss();
                this.f41513n0 = null;
            }
            u6 u6Var = this.H1;
            long j10 = 0;
            if (u6Var != null && !u6Var.h) {
                if ((this.v && u6Var.f42413g) || u6Var.f42401b != 0) {
                    u6Var.f42418j = false;
                }
                u6Var.i(false);
            }
            this.H1 = null;
            Utilities.Callback4 callback4 = this.O;
            if (callback4 != null && (s9Var = this.U0) != null) {
                if (this.e) {
                    return;
                }
                this.e = true;
                i71 i71Var = s9Var.f41910y;
                if (i71Var != null) {
                    i71Var.B();
                    s9Var.f41910y.H();
                    s9Var.f41910y = null;
                }
                i71 i71Var2 = s9Var.f41908x;
                if (i71Var2 != null) {
                    j10 = i71Var2.n();
                    s9Var.f41908x.B();
                    s9Var.f41908x.H();
                    s9Var.f41908x = null;
                }
                i71 i71Var3 = s9Var.e;
                if (i71Var3 != null) {
                    j10 = i71Var3.n();
                    s9Var.e.B();
                    s9Var.e.H();
                    s9Var.e = null;
                }
                callback4.run(Long.valueOf(j10), new r8(this, z4, 2), Boolean.valueOf(this.v), Long.valueOf(this.f41542w));
                return;
            }
            s9 s9Var2 = this.U0;
            if (s9Var2 != null && !z4) {
                s9Var2.set(null);
            }
            g(0.0f, z4, new h8(this, 23));
            int i10 = this.G;
            if (i10 == 1 || i10 == 0) {
                this.f41512n.setBackgroundColor(0);
                this.Y0.b(false, true);
            }
            NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.albumsDidLoad);
            int i11 = this.f41479c;
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesDraftsUpdated);
            NotificationCenter.getInstance(i11).removeObserver(this, NotificationCenter.storiesLimitUpdate);
        }
    }

    public final boolean q0() {
        i9 i9Var;
        if ((this.M1 || this.N1) && (i9Var = this.f41551y0) != null && i9Var.isFrontface()) {
            int i10 = this.f41524q2;
            if (i10 == 2 || (i10 == 1 && this.Z1)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void r() {
        boolean z4;
        Activity activity = this.f41475b;
        if (this.f41551y0 == null && activity != null) {
            this.f41551y0 = new i9(this, activity, MessagesController.getGlobalMainSettings().getBoolean("stories_camera", false));
            t5 t5Var = this.L0;
            float f10 = 0.0f;
            if (t5Var != null) {
                t5Var.f42338d0 = 0.0f;
                t5Var.f42339e0.d(0.0f, true);
            }
            this.f41551y0.recordHevc = !this.f41547x0.j();
            this.f41551y0.setThumbDrawable(A());
            this.f41551y0.initTexture();
            this.f41551y0.setDelegate(new q8(this, 0));
            qa qaVar = this.C0;
            if (this.f41551y0.f42456a && this.f41480c0 == 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            c0(qaVar, z4, true);
            v vVar = this.D0;
            if (!this.f41551y0.f42456a) {
                f10 = AndroidUtilities.dp(46.0f);
            }
            vVar.setTranslationX(f10);
            this.f41547x0.setCameraView(this.f41551y0);
            if (MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) < 1) {
                this.T0.v();
                MessagesController.getGlobalMainSettings().edit().putInt("storyhint2", MessagesController.getGlobalMainSettings().getInt("storyhint2", 0) + 1).apply();
            } else if ((!v0.q(this.f41551y0.getContext()) || !MessagesController.getGlobalMainSettings().getBoolean("dualcam", v0.p(ApplicationLoader.applicationContext, false))) && this.f41551y0.f42456a && MessagesController.getGlobalMainSettings().getInt("storydualhint", 0) < 2) {
                this.f41500i1.v();
            }
            if (this.f41554z0 == null) {
                this.f41554z0 = new p5(activity, new i8(this, 3));
            }
            this.f41554z0.a(this.f41551y0);
            d6 d6Var = this.A0;
            if (d6Var != null) {
                r9 r9Var = this.f41547x0;
                Object blurRenderNode = r9Var.getBlurRenderNode();
                d6Var.C = r9Var;
                d6Var.D = blurRenderNode;
                d6Var.invalidate();
            }
        }
    }

    public final void s() {
        u6 u6Var;
        Bitmap bitmap;
        Bitmap q10;
        if (this.f41552y1 == null && (u6Var = this.H1) != null) {
            MediaController.SavedFilterState savedFilterState = null;
            if (!u6Var.K) {
                if (u6Var.Z0 == null) {
                    q10 = this.U0.getPhotoBitmap();
                } else {
                    q8 q8Var = new q8(this, 11);
                    Point point = AndroidUtilities.displaySize;
                    q10 = u6.q(q8Var, point.x, point.y, 0, true);
                }
                bitmap = q10;
            } else {
                bitmap = null;
            }
            if (bitmap != null || this.H1.K) {
                w61 textureView = this.U0.getTextureView();
                int orientation = this.U0.getOrientation();
                u6 u6Var2 = this.H1;
                if (u6Var2 != null) {
                    savedFilterState = u6Var2.f42400a1;
                }
                nf0 nf0Var = new nf0(this.f41475b, textureView, bitmap, null, orientation, savedFilterState, null, 0, false, false, this.f41516o0, this.f41472a);
                this.f41552y1 = nf0Var;
                this.f41525r.addView(nf0Var);
                lf0 lf0Var = this.f41555z1;
                if (lf0Var != null) {
                    lf0Var.setFilterView(this.f41552y1);
                }
                TextureView myTextureView = this.f41552y1.getMyTextureView();
                this.A1 = myTextureView;
                if (myTextureView != null) {
                    myTextureView.setOpaque(false);
                }
                this.U0.o(this.A1, this.f41552y1);
                TextureView textureView2 = this.A1;
                if (textureView2 != null) {
                    textureView2.setAlpha(0.0f);
                    this.A1.animate().alpha(1.0f).setDuration(220L).start();
                }
                j();
                cf0 blurControl = this.f41552y1.getBlurControl();
                this.B1 = blurControl;
                if (blurControl != null) {
                    this.f41486e0.addView(blurControl);
                }
                ef0 curveControl = this.f41552y1.getCurveControl();
                this.C1 = curveControl;
                if (curveControl != null) {
                    this.f41486e0.addView(curveControl);
                }
                V();
                this.f41552y1.getDoneTextView().setOnClickListener(new k8(this, 13));
                this.f41552y1.getCancelTextView().setOnClickListener(new k8(this, 14));
                this.f41552y1.getToolsView().setVisibility(8);
                this.f41552y1.getToolsView().setAlpha(0.0f);
                this.f41552y1.getToolsView().setTranslationY(AndroidUtilities.dp(186.0f));
                this.f41552y1.f27245f0.setVisibility(0);
            }
        }
    }

    public final void t(boolean z4) {
        boolean z10;
        boolean z11;
        if (this.J0 != null) {
            r9 r9Var = this.f41547x0;
            if (r9Var != null && r9Var.j()) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 == this.J0.M) {
                return;
            }
        }
        if (this.f41475b == null) {
            return;
        }
        if (this.J0 != null) {
            w();
        }
        MediaController.AlbumEntry albumEntry = this.f41504j2;
        boolean z12 = !z4;
        r9 r9Var2 = this.f41547x0;
        if (r9Var2 != null && r9Var2.j()) {
            z10 = true;
        } else {
            z10 = false;
        }
        e9 e9Var = new e9(this, this.f41479c, this.f41475b, this.f41472a, albumEntry, z4, z12, z10);
        this.J0 = e9Var;
        e9Var.D.setVisibility(8);
        this.J0.setMultipleOnClick(this.f41547x0.j());
        this.J0.setMaxCount(Math.min(10, r.b() - this.f41547x0.getFilledCount()));
        this.J0.setOnBackClickListener(new v8(this, 1));
        this.J0.setOnSelectListener(new ky0(z4, this, 1));
        this.J0.setOnSelectMultipleListener(new lh.o1(this, 2));
        f2.h0 h0Var = this.f41501i2;
        if (h0Var != null) {
            m2 m2Var = this.J0.e;
            m2Var.B = h0Var;
            m2Var.l0();
        }
        this.f41512n.addView(this.J0, k7.b6.e(-1, -1, 119));
    }

    public final void u() {
        throw new UnsupportedOperationException("Method not decompiled: ph.da.u():void");
    }

    public final void v(boolean z4) {
        p5 p5Var = this.f41554z0;
        if (p5Var != null) {
            p5Var.f42164f = null;
            Utilities.globalQueue.cancelRunnable(p5Var.h);
            this.f41554z0 = null;
            r9 r9Var = this.f41547x0;
            if (r9Var != null) {
                r9Var.f42578c.a(null);
            }
        }
        d6 d6Var = this.A0;
        if (d6Var != null) {
            d6Var.C = null;
            d6Var.D = null;
            d6Var.invalidate();
        }
        if (this.f41551y0 != null) {
            if (z4) {
                b0(new h8(this, 8));
                return;
            }
            b0(new h8(this, 9));
            this.f41551y0.destroy(true, null);
            AndroidUtilities.removeFromParent(this.f41551y0);
            r9 r9Var2 = this.f41547x0;
            if (r9Var2 != null) {
                r9Var2.setCameraView(null);
            }
            this.f41551y0 = null;
        }
    }

    public final void w() {
        e9 e9Var = this.J0;
        if (e9Var == null) {
            return;
        }
        this.f41512n.removeView(e9Var);
        this.J0 = null;
        ValueAnimator valueAnimator = this.f41507k2;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.f41507k2 = null;
        }
        o1.j jVar = this.f41509l2;
        if (jVar != null) {
            jVar.c();
            this.f41509l2 = null;
        }
        this.f41511m2 = null;
    }

    public final void y() {
        nf0 nf0Var = this.f41552y1;
        if (nf0Var == null) {
            return;
        }
        nf0Var.e();
        this.f41555z1.setFilterView(null);
        this.f41525r.removeView(this.f41552y1);
        TextureView textureView = this.A1;
        if (textureView != null) {
            this.f41486e0.removeView(textureView);
            this.A1 = null;
        }
        this.U0.o(null, null);
        cf0 cf0Var = this.B1;
        if (cf0Var != null) {
            this.f41486e0.removeView(cf0Var);
            this.B1 = null;
        }
        ef0 ef0Var = this.C1;
        if (ef0Var != null) {
            this.f41486e0.removeView(ef0Var);
            this.C1 = null;
        }
        this.f41552y1 = null;
    }

    public final void z() {
        h9 h9Var = this.f41531s1;
        if (h9Var != null) {
            h9Var.O0.removeAllViews();
            h9 h9Var2 = this.f41531s1;
            h9Var2.L0.h();
            h9Var2.O0.setVisibility(8);
            h9Var2.N0.setVisibility(8);
            h9Var2.B0.postRunnable(new c21(12));
            l4 l4Var = h9Var2.f41340h2;
            if (l4Var != null) {
                l4Var.dismiss();
            }
            cg.e0 e0Var = h9Var2.Q1;
            if (e0Var != null) {
                e0Var.dismiss();
            }
            this.f41525r.removeView(this.f41531s1);
            this.f41531s1 = null;
            cg.p1 p1Var = this.f41534t1;
            if (p1Var != null) {
                this.f41486e0.removeView(p1Var);
                this.f41534t1 = null;
            }
            View view = this.f41540v1;
            if (view != null) {
                this.f41486e0.removeView(view);
                this.f41540v1 = null;
            }
            View view2 = this.f41537u1;
            if (view2 != null) {
                this.f41486e0.removeView(view2);
                this.f41537u1 = null;
            }
            View view3 = this.f41544w1;
            if (view3 != null) {
                this.f41486e0.removeView(view3);
                this.f41544w1 = null;
            }
            View view4 = this.f41548x1;
            if (view4 != null) {
                this.f41486e0.removeView(view4);
                this.f41548x1 = null;
            }
        }
    }
}
