package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.PowerManager;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.transition.ChangeBounds;
import android.transition.Fade;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.WindowInsets;
import android.view.WindowManager;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.WeakHashMap;
import org.telegram.messenger.voip.VideoCapturerDevice;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.voip.VoIPServiceState;
import org.telegram.messenger.voip.VoipAudioManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.webrtc.EglBase;
import org.webrtc.GlRectDrawer;
import org.webrtc.RendererCommon;
import org.webrtc.TextureViewRenderer;
public final class zd1 implements VoIPService.StateListener, org.telegram.messenger.vs, lf.a {
    public static zd1 f43934n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public org.telegram.ui.Components.voip.c0 D;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.w1 F;
    public float F0;
    public yd1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public ag.r K;
    public long K0;
    public int L;
    public mg.i2 M;
    public org.telegram.ui.Components.voip.p1 M0;
    public s71 N;
    public org.telegram.ui.Components.voip.l2 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.l2 O0;
    public bi.j6 P;
    public ValueAnimator P0;
    public jg.b1 Q;
    public jg.d0 R;
    public boolean R0;
    public TextView S;
    public org.telegram.ui.ActionBar.q2 T;
    public org.telegram.ui.Components.voip.j U;
    public boolean U0;
    public float V0;
    public float W0;
    public vd1 X;
    public float X0;
    public org.telegram.ui.Components.voip.c1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.c1 Z;
    public float Z0;
    public final int f43935a;
    public boolean f43936a0;
    public boolean f43937a1;
    public Activity f43938b;
    public TextureViewRenderer f43939b0;
    public float f43940b1;
    public final TLRPC.User f43941c;
    public org.telegram.ui.Components.voip.z1 f43942c0;
    public float f43943c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.z1 f43944d0;
    public int f43945d1;
    public org.telegram.ui.Components.voip.s2 e;
    public org.telegram.ui.Components.voip.e f43946e0;
    public int f43947e1;
    public org.telegram.ui.Components.voip.s2 f43948f;
    public boolean f43949f0;
    public jf.f f43951g0;
    public boolean f43952g1;
    public org.telegram.ui.Components.voip.s2 h;
    public View f43953h0;
    public boolean f43954h1;
    public View f43955i0;
    public ValueAnimator f43956i1;
    public org.telegram.ui.Components.voip.z0 f43957j0;
    public boolean f43958j1;
    public org.telegram.ui.Components.voip.z1 f43960k1;
    public com.google.android.gms.internal.cast.o l1;
    public boolean m0;
    public boolean f43962m1;
    public wd1 f43963n;
    public boolean f43964n0;
    public sd1 f43965o0;
    public int f43966p0;
    public int f43967q0;
    public WindowInsets f43969r0;
    public ud1 f43970s;
    public boolean f43971s0;
    public float f43972t0;
    public rd1 f43973u0;
    public int f43974v0;
    public org.telegram.ui.Components.voip.k2 f43975w;
    public AccessibilityManager f43976w0;
    public org.telegram.ui.Components.voip.g2 f43977x;
    public org.telegram.ui.Components.voip.m2 f43979y;
    public boolean f43981z0;
    public final org.telegram.ui.Components.voip.y0 f43968r = new org.telegram.ui.Components.voip.y0();
    public final org.telegram.ui.Components.g9[] V = new org.telegram.ui.Components.g9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f43959k0 = new Paint();
    public final Paint f43961l0 = new Paint();
    public boolean f43978x0 = true;
    public float f43980y0 = 1.0f;
    public final e2.f L0 = new e2.f((int[]) null);
    public final u01 Q0 = new u01(this, 16);
    public final kd1 S0 = new kd1(this, 12);
    public final kd1 T0 = new kd1(this, 13);
    public float f43950f1 = 1.0f;

    public zd1(int i10) {
        this.f43935a = i10;
        this.f43941c = org.telegram.messenger.wp.r1(i10).Z1(Long.valueOf(org.telegram.messenger.e20.i(i10).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f43967q0 = -1;
        this.f43966p0 = sharedState.getCallState();
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.O4);
        org.telegram.messenger.at.f(i10).c(this, org.telegram.messenger.at.M4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.E2);
        org.telegram.messenger.at.e().c(this, org.telegram.messenger.at.G5);
    }

    public static void a(zd1 zd1Var) {
        zd1 zd1Var2;
        if (zd1Var.f43952g1) {
            zd1Var.f43952g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            zd1Var.f43956i1 = ofFloat;
            zd1Var2 = zd1Var;
            ofFloat.addUpdateListener(new lg.j(zd1Var2, zd1Var.f43950f1, zd1Var.Y0, zd1Var.Z0, 2));
            zd1Var2.f43956i1.addListener(new od1(zd1Var2, 0));
            zd1Var2.f43956i1.setDuration(350L);
            zd1Var2.f43956i1.setInterpolator(org.telegram.ui.Components.gr.f26523f);
            zd1Var2.f43956i1.start();
        } else {
            zd1Var2 = zd1Var;
        }
        zd1Var2.f43954h1 = false;
        zd1Var2.f43937a1 = false;
    }

    public static void k(int[] iArr, int i10) {
        zd1 zd1Var = f43934n1;
        if (zd1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    zd1Var.f43973u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    zd1Var.n(new org.telegram.ui.Components.voip.n0(17));
                } else if (!zd1Var.f43938b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.n1.h(zd1Var.f43938b, new kd1(zd1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    zd1Var.f43973u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    zd1Var.B();
                }
            }
        }
    }

    public static void v(Activity activity, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        int size;
        int size2;
        float f7;
        zd1 zd1Var = f43934n1;
        if (zd1Var != null && zd1Var.f43973u0.getParent() == null) {
            zd1 zd1Var2 = f43934n1;
            if (zd1Var2 != null) {
                zd1Var2.f43942c0.d.release();
                f43934n1.f43944d0.d.release();
                f43934n1.f43939b0.release();
                rd1 rd1Var = f43934n1.f43973u0;
                if (rd1Var != null) {
                    rd1Var.d();
                }
                f43934n1.d();
            }
            f43934n1 = null;
        }
        if (f43934n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                zd1 zd1Var3 = new zd1(i10);
                zd1Var3.f43938b = activity;
                f43934n1 = zd1Var3;
                rd1 rd1Var2 = new rd1(activity, !z10, zd1Var3);
                f43934n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f43934n1.getClass();
                rd1Var2.setLockOnScreen(f43934n1.J0);
                zd1Var3.f43973u0 = rd1Var2;
                id1 id1Var = new id1(zd1Var3, 4);
                WeakHashMap weakHashMap = r0.h0.f46134a;
                r0.z.i(rd1Var2, id1Var);
                ((WindowManager) activity.getSystemService("window")).addView(rd1Var2, org.telegram.ui.Components.voip.d2.a());
                zd1Var3.f43972t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                zd1Var3.f43976w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                ud1 ud1Var = new ud1(zd1Var3, activity);
                ud1Var.setClipToPadding(false);
                ud1Var.setClipChildren(false);
                ud1Var.setBackgroundColor(-16777216);
                zd1Var3.F();
                zd1Var3.f43970s = ud1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.y0 y0Var = zd1Var3.f43968r;
                zd1Var3.f43975w = new org.telegram.ui.Components.voip.k2(activity, z11, y0Var);
                org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(activity, false, true, false, false);
                zd1Var3.f43942c0 = z1Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                z1Var.d.setScalingType(scalingType);
                zd1Var3.f43942c0.d.setEnableHardwareScaler(true);
                zd1Var3.f43942c0.d.setRotateTextureWithScreen(true);
                zd1Var3.f43942c0.f31848a0 = 1;
                ud1Var.addView(zd1Var3.f43975w, w7.b6.c(-1.0f, -1));
                TLRPC.User user = zd1Var3.d;
                org.telegram.ui.Components.voip.g2 g2Var = new org.telegram.ui.Components.voip.g2(activity, user, y0Var);
                zd1Var3.f43977x = g2Var;
                ud1Var.addView(g2Var, w7.b6.c(-1.0f, -1));
                ?? view = new View(activity);
                if (org.telegram.messenger.tc.e(512)) {
                    int i12 = org.telegram.ui.ActionBar.t6.f20866a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f31611a = new org.telegram.ui.Components.gv0(0);
                    }
                }
                zd1Var3.f43979y = view;
                ud1Var.addView((View) view, w7.b6.c(220.0f, -1));
                ud1Var.addView(zd1Var3.f43942c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.f9(orientation, new int[]{-14994098, -14328963}).f(k2.m0.j0(0.5f, 1), new t81(zd1Var3, 1), 0L);
                org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(activity);
                zd1Var3.Y = c1Var;
                c1Var.setDelegate(new id1(zd1Var3, 3));
                zd1Var3.Y.d(1.0f, 1.0f);
                zd1Var3.f43936a0 = true;
                org.telegram.ui.Components.voip.z1 z1Var2 = new org.telegram.ui.Components.voip.z1(activity, true, false);
                zd1Var3.f43944d0 = z1Var2;
                z1Var2.d.setIsCamera(true);
                zd1Var3.f43944d0.d.setUseCameraRotation(true);
                zd1Var3.Y.setOnTapListener(new ld1(zd1Var3, 1));
                zd1Var3.f43944d0.d.setMirror(true);
                zd1Var3.Y.addView(zd1Var3.f43944d0);
                org.telegram.ui.Components.voip.c1 c1Var2 = new org.telegram.ui.Components.voip.c1(activity);
                zd1Var3.Z = c1Var2;
                c1Var2.S = true;
                c1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                zd1Var3.f43939b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                zd1Var3.f43939b0.setIsCamera(false);
                zd1Var3.f43939b0.setFpsReduction(30.0f);
                zd1Var3.f43939b0.setScalingType(scalingType);
                zd1Var3.Z.addView(zd1Var3.f43939b0, w7.b6.e(-1, -2, 17));
                zd1Var3.Z.setOnTapListener(new ld1(zd1Var3, 2));
                zd1Var3.Z.setVisibility(8);
                ud1Var.addView(zd1Var3.Y, w7.b6.c(-2.0f, -2));
                ud1Var.addView(zd1Var3.Z);
                View view2 = new View(activity);
                zd1Var3.f43953h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.b.o(-16777216, 127)}));
                ud1Var.addView(zd1Var3.f43953h0, w7.b6.e(-1, 160, 80));
                View view3 = new View(activity);
                zd1Var3.f43955i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.b.o(-16777216, 102), 0}));
                ud1Var.addView(zd1Var3.f43955i0, w7.b6.e(-1, 160, 48));
                s71 s71Var = new s71(zd1Var3, activity, 18);
                zd1Var3.N = s71Var;
                s71Var.setOrientation(0);
                zd1Var3.N.setPadding(0, 0, 0, org.telegram.messenger.i0.L(30.0f));
                zd1Var3.N.setClipToPadding(false);
                zd1Var3.N.setContentDescription(org.telegram.messenger.dd.L0(2131743328, null));
                zd1Var3.N.setOnClickListener(new ld1(zd1Var3, 3));
                zd1Var3.P = new bi.j6(activity, y0Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                zd1Var3.O = frameLayout;
                frameLayout.addView(zd1Var3.P, w7.b6.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                zd1Var3.O.setVisibility(8);
                zd1Var3.O.setOnClickListener(new ld1(zd1Var3, 4));
                jg.d0 d0Var = new jg.d0(activity, y0Var);
                zd1Var3.R = d0Var;
                d0Var.setOrientation(1);
                TextView textView = new TextView(activity);
                zd1Var3.S = textView;
                textView.setText(org.telegram.messenger.dd.L0(2131743517, null));
                zd1Var3.S.setTextSize(1, 15.0f);
                zd1Var3.S.setTypeface(org.telegram.messenger.i0.o());
                zd1Var3.S.setTextColor(-1);
                zd1Var3.S.setGravity(17);
                org.telegram.ui.ActionBar.q2 q2Var = new org.telegram.ui.ActionBar.q2(zd1Var3, activity, 8);
                zd1Var3.T = q2Var;
                q2Var.setTextSize(1, 15.0f);
                zd1Var3.T.setTextColor(-1);
                zd1Var3.T.setGravity(17);
                zd1Var3.T.setText(org.telegram.messenger.dd.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.i20.j(user, true), zd1Var3.T.getPaint(), org.telegram.messenger.i0.L(300.0f), TextUtils.TruncateAt.END)));
                zd1Var3.R.setVisibility(8);
                zd1Var3.R.addView(zd1Var3.S);
                zd1Var3.R.addView(zd1Var3.T, w7.b6.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                zd1Var3.R.setPadding(org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(80.0f), org.telegram.messenger.i0.L(18.0f), org.telegram.messenger.i0.L(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.g9 g9Var = new org.telegram.ui.Components.g9(activity);
                    org.telegram.ui.Components.g9[] g9VarArr = zd1Var3.V;
                    g9VarArr[i15] = g9Var;
                    g9VarArr[i15].getImageReceiver().R0 = true;
                    s71 s71Var2 = zd1Var3.N;
                    org.telegram.ui.Components.g9 g9Var2 = g9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    s71Var2.addView(g9Var2, w7.b6.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                vd1 vd1Var = new vd1(zd1Var3, activity);
                zd1Var3.X = vd1Var;
                vd1Var.setOrientation(1);
                zd1Var3.X.setFocusable(true);
                zd1Var3.X.setFocusableInTouchMode(true);
                zd1Var3.D = new org.telegram.ui.Components.voip.c0(activity);
                org.telegram.ui.Components.r8 r8Var = new org.telegram.ui.Components.r8((org.telegram.ui.ActionBar.p6) null);
                r8Var.r(user);
                org.telegram.ui.Components.voip.c0 c0Var = zd1Var3.D;
                int i16 = zd1Var3.f43935a;
                c0Var.f31399b.j(org.telegram.messenger.jc.m(i16, 0, user), null, r8Var, user);
                zd1Var3.D.setRoundRadius(org.telegram.messenger.i0.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                zd1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                zd1Var3.E.setText(org.telegram.messenger.k6.m(org.telegram.messenger.i5.m(0, user.first_name, user.last_name), zd1Var3.E.getPaint().getFontMetricsInt(), false, null, 0));
                zd1Var3.E.setMaxLines(2);
                zd1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                zd1Var3.E.setTextColor(-1);
                zd1Var3.E.setGravity(1);
                zd1Var3.E.setImportantForAccessibility(2);
                zd1Var3.X.addView(zd1Var3.E, w7.b6.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f31770a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f31770a[i17] = new TextView(activity);
                    frameLayout2.f31770a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f31770a[i17].setTextColor(-1);
                    frameLayout2.f31770a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f31770a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f31772c = frameLayout3;
                org.telegram.ui.Components.voip.k0 k0Var = new org.telegram.ui.Components.voip.k0(frameLayout2, activity, y0Var);
                k0Var.setTextSize(1, 15.0f);
                k0Var.setTextColor(-1);
                k0Var.setGravity(1);
                k0Var.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(2.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(2.0f));
                k0Var.setText(org.telegram.messenger.dd.L0(2131743243, null));
                frameLayout3.addView(k0Var, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.b6.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f31771b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.b6.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.dd.L0(2131743279, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new ag.x2(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.a2 a2Var = new org.telegram.ui.Components.voip.a2(activity);
                frameLayout2.d = a2Var;
                frameLayout2.addView(a2Var, w7.b6.c(-2.0f, -1));
                zd1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.h0.f46134a;
                frameLayout2.setImportantForAccessibility(4);
                zd1Var3.X.addView(zd1Var3.F, w7.b6.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    yd1 yd1Var = new yd1(activity);
                    zd1Var3.G = yd1Var;
                    long j10 = sharedState.getUser().f19943id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        yd1Var.setVisibility(8);
                    } else {
                        if (groupParticipants == null) {
                            size = 0;
                        } else {
                            size = groupParticipants.size();
                        }
                        int max = Math.max(i19, size);
                        if (groupParticipants == null) {
                            size2 = 0;
                        } else {
                            size2 = groupParticipants.size();
                        }
                        int min = Math.min(3, size2);
                        org.telegram.ui.Components.t8 t8Var = yd1Var.f43651b;
                        t8Var.i(min);
                        int i20 = 0;
                        while (i20 < min) {
                            t8Var.j(i20, i16, org.telegram.messenger.wp.r1(i16).d2(org.telegram.messenger.o5.o(groupParticipants.get(i20).peer)));
                            i20++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        t8Var.a(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.o5.o(groupParticipants.get(0).peer) == j11))) {
                            yd1Var.setVisibility(8);
                        } else {
                            yd1Var.f43652c = new org.telegram.ui.Components.rz0(org.telegram.messenger.dd.H(',', "Participants", max), 14.0f, org.telegram.messenger.i0.o());
                            yd1Var.setVisibility(0);
                            yd1Var.invalidate();
                        }
                    }
                    zd1Var3.X.addView(zd1Var3.G, w7.b6.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                zd1Var3.X.setClipChildren(false);
                zd1Var3.X.setClipToPadding(false);
                zd1Var3.X.setPadding(0, 0, 0, org.telegram.messenger.i0.L(15.0f));
                zd1Var3.U = new org.telegram.ui.Components.voip.j(activity);
                zd1Var3.Q = new jg.b1(activity, y0Var);
                zd1Var3.U.setAlpha(0.0f);
                zd1Var3.Q.setVisibility(8);
                ud1Var.addView(zd1Var3.D, w7.b6.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                ud1Var.addView(zd1Var3.X, w7.b6.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                ud1Var.addView(zd1Var3.O, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ud1Var.addView(zd1Var3.R, w7.b6.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                ud1Var.addView(zd1Var3.N, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ud1Var.addView(zd1Var3.U, w7.b6.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                ud1Var.addView(zd1Var3.Q, w7.b6.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                zd1Var3.f43957j0 = new org.telegram.ui.Components.voip.z0(activity);
                zd1Var3.e = new org.telegram.ui.Components.voip.s2(activity, y0Var);
                zd1Var3.f43948f = new org.telegram.ui.Components.voip.s2(activity, y0Var);
                zd1Var3.h = new org.telegram.ui.Components.voip.s2(activity, y0Var);
                zd1Var3.f43963n = new org.telegram.ui.Components.voip.c2(activity, 52.0f);
                zd1Var3.e.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                zd1Var3.e.setScaleX(0.0f);
                zd1Var3.e.setScaleY(0.0f);
                zd1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zd1Var3.f43948f.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                zd1Var3.f43948f.setScaleX(0.0f);
                zd1Var3.f43948f.setScaleY(0.0f);
                zd1Var3.f43948f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zd1Var3.h.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                zd1Var3.h.setScaleX(0.0f);
                zd1Var3.h.setScaleY(0.0f);
                zd1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zd1Var3.f43963n.setTranslationY(org.telegram.messenger.i0.L(100.0f));
                zd1Var3.f43963n.setScaleX(0.0f);
                zd1Var3.f43963n.setScaleY(0.0f);
                zd1Var3.f43963n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zd1Var3.f43957j0.addView(zd1Var3.e);
                zd1Var3.f43957j0.addView(zd1Var3.f43948f);
                zd1Var3.f43957j0.addView(zd1Var3.h);
                zd1Var3.f43957j0.addView(zd1Var3.f43963n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                zd1Var3.f43946e0 = eVar;
                eVar.setListener(new xd1(zd1Var3));
                zd1Var3.f43946e0.setScaleX(1.15f);
                zd1Var3.f43946e0.setScaleY(1.15f);
                ud1Var.addView(zd1Var3.f43957j0, w7.b6.e(-1, -2, 80));
                if (org.telegram.messenger.i0.Q1()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                ud1Var.addView(zd1Var3.f43946e0, w7.b6.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                zd1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
                zd1Var3.I.setImageResource(2131232044);
                zd1Var3.I.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                ud1Var.addView(zd1Var3.I, w7.b6.e(56, 56, 53));
                w7.e6.a(zd1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                zd1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
                zd1Var3.H.setImageResource(2131232079);
                zd1Var3.H.setPadding(org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f), org.telegram.messenger.i0.L(16.0f));
                zd1Var3.H.setContentDescription(org.telegram.messenger.dd.L0(2131753756, null));
                ud1Var.addView(zd1Var3.H, w7.b6.e(56, 56, 51));
                w7.e6.a(zd1Var3.H);
                ag.r rVar = new ag.r(activity, 6);
                zd1Var3.K = rVar;
                rVar.setContentDescription(org.telegram.messenger.dd.L0(2131743265, null));
                zd1Var3.K.setBackground(org.telegram.ui.ActionBar.t6.h0(i0.b.o(-1, 76), 1, -1));
                zd1Var3.K.setPadding(org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f), org.telegram.messenger.i0.L(12.0f));
                ud1Var.addView(zd1Var3.K, w7.b6.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                zd1Var3.K.setAlpha(0.0f);
                zd1Var3.K.setOnClickListener(new ld1(zd1Var3, 5));
                zd1Var3.H.setOnClickListener(new ld1(zd1Var3, 6));
                zd1Var3.I.setOnClickListener(new qv0(9, zd1Var3, activity));
                if (zd1Var3.f43973u0.f31446b) {
                    zd1Var3.H.setVisibility(8);
                    zd1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f31642a = new HashMap();
                linearLayout.f31643b = new ArrayList();
                linearLayout.f31644c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f31647r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f31646n = y0Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new kg.g0(4).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(org.telegram.messenger.i0.L(14.0f));
                zd1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                zd1Var3.M0.setOnViewsUpdated(new kd1(zd1Var3, 5));
                ud1Var.addView(zd1Var3.M0, w7.b6.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.l2 l2Var = new org.telegram.ui.Components.voip.l2(activity, 3, y0Var, true);
                l2Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                l2Var.K = alignment;
                l2Var.d = -1L;
                l2Var.f51755l0 = new kd1(zd1Var3, 6);
                l2Var.T = true;
                l2Var.h = org.telegram.messenger.i0.L(320.0f);
                l2Var.e = true;
                l2Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                l2Var.q(8.0f);
                zd1Var3.N0 = l2Var;
                l2Var.s(org.telegram.messenger.dd.L0(2131744279, null));
                ud1Var.addView(zd1Var3.N0, w7.b6.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.l2 l2Var2 = new org.telegram.ui.Components.voip.l2(activity, 1, y0Var, false);
                l2Var2.p(true);
                l2Var2.K = alignment;
                l2Var2.d = 4000L;
                l2Var2.T = true;
                l2Var2.h = org.telegram.messenger.i0.L(320.0f);
                l2Var2.e = true;
                l2Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                l2Var2.q(8.0f);
                zd1Var3.O0 = l2Var2;
                l2Var2.s(org.telegram.messenger.dd.L0(2131743328, null));
                ud1Var.addView(zd1Var3.O0, w7.b6.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                zd1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!zd1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zd1Var3.U0 = z12;
                    }
                    zd1Var3.h();
                }
                rd1Var2.addView(ud1Var);
                if (z10) {
                    zd1Var3.F0 = 0.0f;
                    zd1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        zd1Var3.f43942c0.setStub(org.telegram.ui.Components.voip.u1.d().f31752s);
                        zd1Var3.f43944d0.setStub(org.telegram.ui.Components.voip.u1.d().f31751r);
                    }
                    zd1Var3.f43973u0.setAlpha(0.0f);
                    zd1Var3.G();
                    zd1Var3.E0 = true;
                    org.telegram.ui.Components.voip.u1.U = true;
                    if (org.telegram.ui.Components.voip.u1.W == null) {
                        zd1Var3.L0.d();
                        org.telegram.messenger.i0.h3(new kd1(zd1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.u1.V.getClass();
                        throw null;
                    }
                } else {
                    zd1Var3.F0 = 1.0f;
                    zd1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && mf.b.a(activity) == 1) {
                    zd1 zd1Var4 = f43934n1;
                    jf.e eVar2 = new jf.e(activity, zd1Var4);
                    eVar2.f9855c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.z1 z1Var3 = zd1Var4.f43942c0;
                    eVar2.f9859j = z1Var3.d;
                    eVar2.f9860k = z1Var3.getPlaceholderView();
                    zd1Var4.f43951g0 = eVar2.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            kd1 kd1Var = this.S0;
            org.telegram.messenger.i0.r(kd1Var);
            this.R0 = false;
            if (this.f43981z0 && this.f43978x0) {
                org.telegram.messenger.i0.h3(kd1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String L0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f43976w0.isTouchExplorationEnabled()) {
                if (!this.f43964n0) {
                    L0 = org.telegram.messenger.dd.L0(2131754732, null);
                } else {
                    L0 = org.telegram.messenger.dd.L0(2131754733, null);
                }
                this.f43970s.announceForAccessibility(L0);
            }
            if (!this.f43964n0) {
                if (this.f43965o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f43973u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f43948f.getLocationOnScreen(iArr);
                    sd1 sd1Var = new sd1(this, this.f43970s.getContext(), iArr[0], iArr[1]);
                    this.f43965o0 = sd1Var;
                    WindowInsets windowInsets = this.f43969r0;
                    if (windowInsets != null) {
                        sd1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f43970s.addView(this.f43965o0);
                    return;
                }
                return;
            }
            this.f43944d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f43967q0 = this.f43966p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new kg.g0(5).setDuration(250L);
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
                transitionSet.addTransition(duration.setInterpolator(grVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(grVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.c2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.s2.class, true);
                TransitionManager.beginDelayedTransition(this.f43957j0, transitionSet);
            }
            int i10 = this.f43966p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f43948f.setVisibility(8);
                this.h.setVisibility(8);
                this.f43963n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f43934n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f43964n0 || this.m0)) {
                    p(this.e, sharedInstance);
                    if (this.f43978x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f43948f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f43963n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.dd.L0(2131743437, null), false, z10);
                this.f43963n.setOnClickListener(new ld1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f43964n0 || this.m0)) {
                        p(this.e, sharedInstance);
                        if (this.f43978x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f43948f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f43948f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f43963n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f31719f = 0;
                i11 = 16;
            }
            if (this.f43948f.getVisibility() == 0) {
                this.f43948f.f31719f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f31719f = i11;
                i11 += 16;
            }
            if (this.f43963n.getVisibility() == 0) {
                this.f43963n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zd1.D(boolean):void");
    }

    public final void E() {
        int i10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i10 = 2131230916;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i10 = 2131230924;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i10 = 2131230920;
        } else {
            i10 = 2131230921;
        }
        if (this.J != i10) {
            org.telegram.messenger.i0.Q3(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void F() {
        this.f43959k0.setColor(i0.b.o(-16777216, (int) (this.f43980y0 * 102.0f * this.F0)));
        this.f43961l0.setColor(i0.b.o(-16777216, (int) (127.5f * this.F0)));
        ud1 ud1Var = this.f43970s;
        if (ud1Var != null) {
            ud1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zd1.G():void");
    }

    public final ValueAnimator b(boolean z10) {
        char c10;
        float f7;
        float measuredWidth;
        final float measuredHeight;
        final float f10;
        final boolean z11;
        final float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        boolean z12;
        float f18;
        this.Y.animate().cancel();
        float f19 = org.telegram.ui.Components.voip.u1.d().d.x + org.telegram.ui.Components.voip.u1.d().E;
        float f20 = org.telegram.ui.Components.voip.u1.d().d.y + org.telegram.ui.Components.voip.u1.d().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.u1.V.getClass();
        final float measuredWidth2 = f19 - ((this.f43942c0.getMeasuredWidth() - (this.f43942c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f43942c0.getMeasuredHeight() - (this.f43942c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth3 = this.Y.getMeasuredWidth();
            if (this.f43964n0 && measuredWidth3 != 0) {
                f18 = (this.f43973u0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.u1.d().f31749f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.u1.d().f31749f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - org.telegram.messenger.i0.L(4.0f);
                f17 = org.telegram.ui.Cells.f1.x(org.telegram.ui.Components.voip.u1.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.u1.d().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - org.telegram.messenger.i0.L(4.0f);
                z12 = true;
            } else {
                c10 = 0;
                f7 = 4.0f;
                measuredWidth = 1.0f;
                f17 = 1.0f;
                z12 = false;
                f18 = 0.0f;
            }
            measuredHeight = f17;
            z11 = z12;
            f10 = f18;
        } else {
            c10 = 0;
            f7 = 4.0f;
            measuredWidth = f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f10 = 0.25f;
            z11 = true;
        }
        final float f22 = measuredWidth;
        if (this.m0) {
            f11 = org.telegram.messenger.i0.L(f7);
        } else {
            f11 = 0.0f;
        }
        final float L = (org.telegram.messenger.i0.L(f7) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.u1.V.getClass();
            f12 = 1.0f;
            f21 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        float f23 = f12;
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f22);
                this.Y.setTranslationY(measuredHeight);
                this.Y.setCornerRadius(L);
                this.Y.setAlpha(f21);
            }
            this.f43942c0.setScaleX(0.25f);
            this.f43942c0.setScaleY(0.25f);
            this.f43942c0.setTranslationX(measuredWidth2);
            this.f43942c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f43942c0.setRoundCorners((org.telegram.messenger.i0.L(6.0f) * f23) / 0.25f);
        } else {
            f13 = 0.25f;
        }
        if (z10) {
            f14 = f23;
        } else {
            f14 = 0.0f;
        }
        if (z10) {
            f15 = 0.0f;
        } else {
            f15 = f23;
        }
        float[] fArr = new float[2];
        fArr[c10] = f14;
        fArr[1] = f15;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f16 = 0.0f;
        } else {
            f16 = f23;
        }
        this.F0 = f16;
        F();
        final float f24 = f13;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f25 = 1.0f - floatValue;
                zd1 zd1Var = zd1.this;
                zd1Var.F0 = f25;
                zd1Var.F();
                if (z11) {
                    float f26 = (f10 * floatValue) + (scaleX * f25);
                    zd1Var.Y.setScaleX(f26);
                    zd1Var.Y.setScaleY(f26);
                    zd1Var.Y.setTranslationX((f22 * floatValue) + (x10 * f25));
                    zd1Var.Y.setTranslationY((measuredHeight * floatValue) + (y3 * f25));
                    zd1Var.Y.setCornerRadius((L * floatValue) + (f11 * f25));
                    zd1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f25));
                }
                float f27 = (f24 * floatValue) + (1.0f * f25);
                zd1Var.f43942c0.setScaleX(f27);
                zd1Var.f43942c0.setScaleY(f27);
                float f28 = 0.0f * f25;
                float f29 = (measuredWidth2 * floatValue) + f28;
                float f30 = (measuredHeight2 * floatValue) + f28;
                zd1Var.f43942c0.setTranslationX(f29);
                zd1Var.f43942c0.setTranslationY(f30);
                zd1Var.f43942c0.setRoundCorners(((org.telegram.messenger.i0.L(4.0f) * floatValue) * 1.0f) / f27);
                if (!zd1Var.Y.P) {
                    zd1Var.f43944d0.d(false, floatValue);
                }
                zd1Var.f43973u0.invalidate();
            }
        });
        return ofFloat;
    }

    @Override
    public final void c(com.google.android.gms.internal.cast.o oVar) {
        this.l1 = oVar;
        org.telegram.ui.Components.voip.z1 z1Var = this.f43942c0;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        this.f43962m1 = true;
        G();
        try {
            ((WindowManager) this.f43938b.getSystemService("window")).removeView(this.f43973u0);
        } catch (IllegalArgumentException e) {
            org.telegram.messenger.f8.g(e, true);
        }
        this.f43973u0.invalidate();
    }

    public final void d() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.O4);
        org.telegram.messenger.at.f(this.f43935a).n(this, org.telegram.messenger.at.M4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.f14726i4);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.E2);
        org.telegram.messenger.at.e().n(this, org.telegram.messenger.at.G5);
        jf.f fVar = this.f43951g0;
        if (fVar != null) {
            fVar.c();
            this.f43951g0 = null;
        }
        mg.i2 i2Var = this.M;
        if (i2Var != null) {
            i2Var.dismiss();
            this.M = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == org.telegram.messenger.at.M4) {
            if (this.f43966p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f43944d0.d.release();
                this.f43942c0.d.release();
                this.f43939b0.release();
                h();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == org.telegram.messenger.at.f14726i4) {
            D(true);
        } else if (i10 == org.telegram.messenger.at.E2) {
            this.f43973u0.b();
        } else if (i10 == org.telegram.messenger.at.O4) {
            this.D.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == org.telegram.messenger.at.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f43949f0 = booleanValue;
            if (booleanValue) {
                this.D.b(true, true);
            }
        }
    }

    public final void e(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f43978x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.g2 g2Var = this.f43977x;
            if (g2Var.K && z10 != g2Var.E) {
                g2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                g2Var.f31515c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.f2(g2Var, 1));
                g2Var.f31515c.setInterpolator(org.telegram.ui.Components.gr.f26523f);
                g2Var.f31515c.setDuration(200L);
                g2Var.f31515c.start();
            }
            if (z10) {
                int i10 = org.telegram.messenger.uz.f18515f1;
                if (i10 < 2) {
                    org.telegram.messenger.uz.f18515f1 = i10 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.wp.d1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.uz.f18515f1);
                    edit.apply();
                }
                this.O0.e(true);
                org.telegram.messenger.i0.r(this.S0);
                this.R0 = false;
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(0L).translationY(org.telegram.messenger.i0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.gr.f26523f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.gr.f26524g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.i0.L(140.0f));
                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
                org.telegram.messenger.a30.m(translationY, grVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-org.telegram.messenger.i0.L(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new od1(this, 3)).setInterpolator(grVar).start();
            } else {
                if (this.D.getVisibility() == 0) {
                    this.D.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f26523f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f26523f;
                duration.setInterpolator(grVar2).setListener(new eg.m(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(grVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.i0.L(120.0f)).setListener(new od1(this, 4)).setDuration(250L).setInterpolator(grVar2).start();
            }
            this.f43967q0 = this.f43966p0;
            G();
        }
    }

    public final void f() {
        this.f43973u0.b();
    }

    @Override
    public final void g(com.google.android.gms.internal.cast.o oVar) {
        this.l1 = oVar;
        rd1 rd1Var = this.f43973u0;
        rd1Var.getClass();
        ((WindowManager) this.f43938b.getSystemService("window")).addView(rd1Var, org.telegram.ui.Components.voip.d2.a());
        this.f43962m1 = false;
        G();
        this.f43973u0.invalidate();
        org.telegram.ui.Components.voip.z1 z1Var = this.f43960k1;
        if (z1Var != null) {
            z1Var.d.release();
            this.f43960k1 = null;
        }
    }

    public final void h() {
        this.f43944d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new pd1(this));
        this.f43942c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new qd1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f43939b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override
    public final Bitmap i() {
        org.telegram.ui.Components.voip.z1 z1Var = this.f43960k1;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.f43960k1.d.getBitmap();
        }
        return null;
    }

    public final void j() {
        if (!this.G0 && !this.E0) {
            sd1 sd1Var = this.f43965o0;
            if (sd1Var != null) {
                sd1Var.a(false, false);
            } else if (this.m0 && this.f43964n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f43936a0 = false;
                this.f43967q0 = this.f43966p0;
                G();
            } else if (this.C0) {
                e(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (mf.b.a(this.f43938b) > 0) {
                        if (!this.G0 && f43934n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f43934n1.f43973u0.getMeasuredHeight();
                                zd1 zd1Var = f43934n1;
                                org.telegram.ui.Components.voip.u1.e(zd1Var.f43938b, zd1Var.f43935a, zd1Var.f43973u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f43934n1.f43969r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.u1.X = windowInsets.getSystemWindowInsetTop();
                                    f43934n1.f43969r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.u1.d() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
                                duration.setInterpolator(grVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
                                this.f43957j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.f43953h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.f43955i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(grVar).start();
                                org.telegram.ui.Components.voip.u1.U = true;
                                this.E0 = true;
                                ValueAnimator b10 = b(false);
                                this.L0.d();
                                b10.addListener(new od1(this, 1));
                                b10.setDuration(350L);
                                b10.setInterpolator(grVar);
                                b10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.s4.A(this.f43938b, new id1(this, 0), true).p();
                    return;
                }
                this.f43973u0.b();
            }
        }
    }

    @Override
    public final void l(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final Bitmap m() {
        org.telegram.ui.Components.voip.z1 z1Var = this.f43942c0;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.f43942c0.d.getBitmap();
        }
        return null;
    }

    public final void n(Runnable runnable) {
        if (this.f43948f.getVisibility() == 0) {
            this.f43946e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f43946e0;
            ValueAnimator valueAnimator = eVar.f31454b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f31454b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f43963n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f43948f.animate().cancel();
        this.f43946e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f43946e0;
        ValueAnimator valueAnimator2 = eVar2.f31454b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f31454b0 = null;
            eVar2.U.stop();
        }
        this.f43963n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.dd.L0(2131743437, null), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f43948f.d(3, true, false);
        this.f43963n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f43948f.setVisibility(0);
        this.f43963n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f43948f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43946e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.i0.L(52.0f);
        final int L = org.telegram.messenger.i0.L(24.0f);
        final int L2 = org.telegram.messenger.i0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                zd1 zd1Var = zd1.this;
                zd1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                zd1Var.f43946e0.setTranslationY(L2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                zd1Var.f43946e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f43946e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f43946e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f43946e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f43946e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.jw0(12, this, runnable));
        animatorSet.start();
        org.telegram.messenger.i0.h3(new kd1(this, 7), 133L);
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.y0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f43967q0 = this.f43966p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f43967q0 = this.f43966p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f43951g0 == null && mf.b.a(this.f43938b) == 1) {
                jf.e eVar = new jf.e(this.f43938b, f43934n1);
                eVar.f9855c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.z1 z1Var = this.f43942c0;
                eVar.f9859j = z1Var.d;
                eVar.f9860k = z1Var.getPlaceholderView();
                this.f43951g0 = eVar.a();
            }
        } else {
            jf.f fVar = this.f43951g0;
            if (fVar != null) {
                fVar.c();
                this.f43951g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.k2 k2Var;
        if (i10 > 0) {
            this.f43958j1 = true;
        }
        if (this.F != null && (k2Var = this.f43975w) != null) {
            int i11 = k2Var.V;
            if ((i11 == 2 || i11 == 3) && this.f43958j1) {
                org.telegram.messenger.i0.h3(new org.telegram.ui.Components.qq(this, i10, 22), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f43966p0;
        if (i11 != i10) {
            this.f43967q0 = i11;
            this.f43966p0 = i10;
            if (this.f43973u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f43967q0 = this.f43966p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void p(org.telegram.ui.Components.voip.s2 s2Var, VoIPService voIPService) {
        if (!this.f43964n0) {
            s2Var.d(2, false, false);
            s2Var.setOnBtnClickedListener(null);
            s2Var.setEnabled(false);
            return;
        }
        s2Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            s2Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            s2Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        s2Var.setOnBtnClickedListener(new a7(this, voIPService, s2Var, 23));
    }

    @Override
    public final boolean q() {
        return true;
    }

    @Override
    public final View r() {
        org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(this.f43938b, false, true, false, false);
        this.f43960k1 = z1Var;
        z1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f43960k1.d.setEnableHardwareScaler(true);
        this.f43960k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.z1 z1Var2 = this.f43960k1;
        z1Var2.f31848a0 = 1;
        z1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new td1(this));
        View view = this.f43960k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f43960k1;
    }

    public final void s(org.telegram.ui.Components.voip.s2 s2Var, VoIPService voIPService, boolean z10) {
        s2Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.c1 c1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = c1Var.f31411f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            c1Var.K = f7;
            c1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = c1Var.f31411f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = c1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            c1Var.f31411f0 = ofFloat;
            ofFloat.addUpdateListener(c1Var.f31412g0);
            c1Var.f31411f0.setDuration(150L);
            c1Var.f31411f0.start();
        }
        s2Var.setOnBtnClickedListener(new id1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.s2 s2Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            s2Var.d(4, false, false);
            i11 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            s2Var.d(5, true, false);
        } else {
            s2Var.d(5, false, false);
            i10 = 1;
            s2Var.setEnabled(true);
            s2Var.setOnBtnClickedListener(new mg.i0(this, i10, s2Var, voIPService, 9));
        }
        i10 = i11;
        s2Var.setEnabled(true);
        s2Var.setOnBtnClickedListener(new mg.i0(this, i10, s2Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.s2 s2Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f43964n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f43964n0) {
                if (voIPService.isScreencast()) {
                    s2Var.d(3, false, z10);
                } else {
                    s2Var.d(3, false, z10);
                }
            } else {
                s2Var.d(3, true, z10);
            }
            s2Var.setOnBtnClickedListener(new id1(this, 6));
            s2Var.setEnabled(true);
            return;
        }
        s2Var.d(3, true, false);
        s2Var.setOnClickListener(null);
        s2Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f43964n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.D.getTag() == null) {
                this.D.animate().setListener(null).cancel();
                this.D.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.D.setAlpha(0.0f);
                        this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f26523f).start();
                    } else {
                        this.D.setAlpha(0.0f);
                        this.D.setTranslationY(-org.telegram.messenger.i0.L(135.0f));
                        this.D.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.gr.f26523f).start();
                    }
                } else if (z11) {
                    this.D.setAlpha(0.0f);
                    this.D.setTranslationY(org.telegram.messenger.i0.L(48.0f));
                    this.D.setScaleX(0.1f);
                    this.D.setScaleY(0.1f);
                }
            } else if (!z12 && this.D.getTag() != null) {
                this.D.animate().setListener(null).cancel();
                this.D.setTranslationY(0.0f);
                this.D.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.gr.f26523f).setListener(new od1(this, 8)).start();
            }
        } else {
            this.D.animate().setListener(null).cancel();
            this.D.setTranslationY(0.0f);
            this.D.setAlpha(1.0f);
            this.D.setScaleX(1.0f);
            this.D.setScaleY(1.0f);
            org.telegram.ui.Components.voip.c0 c0Var = this.D;
            if (!z12) {
                i10 = 8;
            }
            c0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.c0 c0Var2 = this.D;
        if (z12) {
            num = 1;
        }
        c0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f43938b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(0, this.f43938b, null);
        boolean[] zArr = new boolean[3];
        x1Var.R = org.telegram.messenger.dd.L0(2131743434, null);
        x1Var.T = charSequence;
        x1Var.f21497n0 = org.telegram.messenger.dd.L0(2131747847, null);
        x1Var.f21498o0 = null;
        x1Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) x1Var.d(-(i10 + 1))) != null) {
                org.telegram.ui.ActionBar.a7.V(textView, org.telegram.ui.ActionBar.t6.f21171q7, x1Var.f21494k1);
            }
        }
        x1Var.setCanceledOnTouchOutside(true);
        x1Var.setOnDismissListener(new q5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f43978x0);
        }
        if (!z10 && (animatorSet = this.A0) != null) {
            animatorSet.removeAllListeners();
            this.A0.cancel();
        }
        boolean z13 = true;
        if (i10 == 0) {
            if (z10) {
                if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.A0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.c1 c1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(c1Var, View.ALPHA, c1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.c1 c1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var2, View.SCALE_X, c1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.c1 c1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(c1Var3, View.SCALE_Y, c1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new od1(this, 7));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.gr.f26523f);
                    this.A0.setStartDelay(50L);
                    this.A0.start();
                }
            } else {
                this.Y.setVisibility(8);
            }
        } else {
            if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() != 0) {
                z11 = z10;
            } else {
                z11 = false;
            }
            if (z10) {
                if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 0) {
                    if (this.Y.getVisibility() == 8) {
                        this.Y.setAlpha(0.0f);
                        this.Y.setScaleX(0.7f);
                        this.Y.setScaleY(0.7f);
                        this.Y.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.A0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.A0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.Y, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Y, View.SCALE_Y, 0.7f, 1.0f));
                    this.A0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.Y.setVisibility(0);
            }
            if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.c1 c1Var4 = this.Y;
                if (c1Var4.D < 0.0f) {
                    c1Var4.d(1.0f, 1.0f);
                    this.f43936a0 = true;
                }
            }
            org.telegram.ui.Components.voip.c1 c1Var5 = this.Y;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            c1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.f43936a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        u01 u01Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f43978x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.gr grVar = org.telegram.ui.Components.gr.f26523f;
            duration.setInterpolator(grVar).start();
            this.H.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.N.animate().alpha(0.0f).translationY(-org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.i0.L(10.0f)).setInterpolator(grVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.i0.L(10.0f)).setInterpolator(grVar).start();
            this.f43957j0.animate().alpha(0.0f).translationY(org.telegram.messenger.i0.L(10.0f)).setDuration(150L).setInterpolator(grVar).start();
            this.f43953h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            this.f43955i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(grVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43980y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(u01Var);
            this.P0.setDuration(150L).setInterpolator(grVar);
            this.P0.start();
            org.telegram.messenger.i0.r(this.S0);
            this.R0 = false;
            this.f43957j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f43978x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.gr grVar2 = org.telegram.ui.Components.gr.f26523f;
                translationY.setInterpolator(grVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(grVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f43957j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f43953h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar2).start();
                this.f43955i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(grVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f43980y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(u01Var);
                this.P0.setDuration(150L).setInterpolator(grVar2);
                this.P0.start();
                this.f43957j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f43978x0 = z10;
        rd1 rd1Var = this.f43973u0;
        if (!z10) {
            rd1Var.setSystemUiVisibility(rd1Var.getSystemUiVisibility() | 4);
        } else {
            rd1Var.setSystemUiVisibility(rd1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -org.telegram.messenger.i0.L(16.0f);
        if (this.f43978x0) {
            i11 = org.telegram.messenger.i0.L(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.gr.f26523f).start();
    }

    @Override
    public final void o(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}
