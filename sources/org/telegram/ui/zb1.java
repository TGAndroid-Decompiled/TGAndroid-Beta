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
public final class zb1 implements VoIPService.StateListener, org.telegram.messenger.cs, wf.a {
    public static zb1 f52603o1;
    public boolean A0;
    public AnimatorSet B0;
    public boolean C0;
    public boolean D0;
    public org.telegram.ui.Components.voip.c0 E;
    public boolean E0;
    public TextView F;
    public boolean F0;
    public org.telegram.ui.Components.voip.w1 G;
    public float G0;
    public yb1 H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public ImageView J;
    public boolean J0;
    public int K;
    public boolean K0;
    public lg.k L;
    public long L0;
    public int M;
    public xg.e1 N;
    public org.telegram.ui.Components.voip.p1 N0;
    public s51 O;
    public org.telegram.ui.Components.zo O0;
    public FrameLayout P;
    public org.telegram.ui.Components.zo P0;
    public fi.j Q;
    public ValueAnimator Q0;
    public ci.t4 R;
    public gi.y4 S;
    public boolean S0;
    public TextView T;
    public org.telegram.ui.ActionBar.k2 U;
    public org.telegram.ui.Components.voip.j V;
    public boolean V0;
    public float W0;
    public float X0;
    public vb1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.c1 Z;
    public float Z0;
    public final int f52604a;
    public org.telegram.ui.Components.voip.c1 f52605a0;
    public float f52606a1;
    public Activity f52607b;
    public boolean f52608b0;
    public boolean f52609b1;
    public final TLRPC.User f52610c;
    public TextureViewRenderer f52611c0;
    public float f52612c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.z1 f52613d0;
    public float f52614d1;
    public org.telegram.ui.Components.voip.q2 f52615e;
    public org.telegram.ui.Components.voip.z1 f52616e0;
    public int f52617e1;
    public org.telegram.ui.Components.voip.q2 f52618f;
    public org.telegram.ui.Components.voip.e f52619f0;
    public int f52620f1;
    public boolean f52621g0;
    public org.telegram.ui.Components.voip.q2 h;
    public uf.d f52623h0;
    public boolean f52624h1;
    public View f52625i0;
    public boolean f52626i1;
    public View f52627j0;
    public ValueAnimator f52628j1;
    public org.telegram.ui.Components.voip.y0 f52629k0;
    public boolean k1;
    public org.telegram.ui.Components.voip.z1 f52631l1;
    public b8.cg m1;
    public wb1 f52632n;
    public boolean f52633n0;
    public boolean f52634n1;
    public boolean f52635o0;
    public sb1 f52636p0;
    public int f52637q0;
    public int f52639r0;
    public ub1 f52640s;
    public WindowInsets f52641s0;
    public boolean f52642t0;
    public float f52643u0;
    public rb1 f52644v0;
    public org.telegram.ui.Components.voip.j2 f52645w;
    public int f52646w0;
    public org.telegram.ui.Components.voip.g2 f52647x;
    public AccessibilityManager f52648x0;
    public org.telegram.ui.Components.voip.k2 f52649y;
    public final org.telegram.ui.Components.voip.x0 f52638r = new org.telegram.ui.Components.voip.x0();
    public final org.telegram.ui.Components.k9[] W = new org.telegram.ui.Components.k9[4];
    public final Drawable[] X = new Drawable[4];
    public final Paint f52630l0 = new Paint();
    public final Paint m0 = new Paint();
    public boolean f52650y0 = true;
    public float f52651z0 = 1.0f;
    public final g2.g M0 = new g2.g((int[]) null);
    public final xy0 R0 = new xy0(this, 16);
    public final kb1 T0 = new kb1(this, 12);
    public final kb1 U0 = new kb1(this, 13);
    public float f52622g1 = 1.0f;

    public zb1(int i3) {
        this.f52604a = i3;
        this.f52610c = org.telegram.messenger.hp.s1(i3).a2(Long.valueOf(org.telegram.messenger.h10.i(i3).e()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f52639r0 = -1;
        this.f52637q0 = sharedState.getCallState();
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.O4);
        org.telegram.messenger.hs.f(i3).c(this, org.telegram.messenger.hs.M4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.E2);
        org.telegram.messenger.hs.e().c(this, org.telegram.messenger.hs.G5);
    }

    public static void a(zb1 zb1Var) {
        zb1 zb1Var2;
        if (zb1Var.f52624h1) {
            zb1Var.f52624h1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            zb1Var.f52628j1 = ofFloat;
            zb1Var2 = zb1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.u(zb1Var2, zb1Var.f52622g1, zb1Var.Z0, zb1Var.f52606a1, 1));
            zb1Var2.f52628j1.addListener(new ob1(zb1Var2, 0));
            zb1Var2.f52628j1.setDuration(350L);
            zb1Var2.f52628j1.setInterpolator(org.telegram.ui.Components.xq.f40452f);
            zb1Var2.f52628j1.start();
        } else {
            zb1Var2 = zb1Var;
        }
        zb1Var2.f52626i1 = false;
        zb1Var2.f52609b1 = false;
    }

    public static void k(int[] iArr, int i3) {
        zb1 zb1Var = f52603o1;
        if (zb1Var != null) {
            if (i3 == 101) {
                if (VoIPService.getSharedState() == null) {
                    zb1Var.f52644v0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    zb1Var.n(new hb1(0));
                } else if (!zb1Var.f52607b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.n1.h(zb1Var.f52607b, new kb1(zb1Var, 2), i3);
                    return;
                }
            }
            if (i3 == 102) {
                if (VoIPService.getSharedState() == null) {
                    zb1Var.f52644v0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    zb1Var.B();
                }
            }
        }
    }

    public static void v(Activity activity, int i3) {
        boolean z10;
        boolean z11;
        int i10;
        boolean z12;
        int size;
        int size2;
        float f10;
        zb1 zb1Var = f52603o1;
        if (zb1Var != null && zb1Var.f52644v0.getParent() == null) {
            zb1 zb1Var2 = f52603o1;
            if (zb1Var2 != null) {
                zb1Var2.f52613d0.d.release();
                f52603o1.f52616e0.d.release();
                f52603o1.f52611c0.release();
                rb1 rb1Var = f52603o1.f52644v0;
                if (rb1Var != null) {
                    rb1Var.d();
                }
                f52603o1.d();
            }
            f52603o1 = null;
        }
        if (f52603o1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.u1.d() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                zb1 zb1Var3 = new zb1(i3);
                zb1Var3.f52607b = activity;
                f52603o1 = zb1Var3;
                rb1 rb1Var2 = new rb1(activity, !z10, zb1Var3);
                f52603o1.K0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f52603o1.getClass();
                rb1Var2.setLockOnScreen(f52603o1.K0);
                zb1Var3.f52644v0 = rb1Var2;
                ib1 ib1Var = new ib1(zb1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f54015a;
                r0.a0.i(rb1Var2, ib1Var);
                ((WindowManager) activity.getSystemService("window")).addView(rb1Var2, org.telegram.ui.Components.voip.d2.a());
                zb1Var3.f52643u0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                zb1Var3.f52648x0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                ub1 ub1Var = new ub1(zb1Var3, activity);
                ub1Var.setClipToPadding(false);
                ub1Var.setClipChildren(false);
                ub1Var.setBackgroundColor(-16777216);
                zb1Var3.F();
                zb1Var3.f52640s = ub1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.x0 x0Var = zb1Var3.f52638r;
                zb1Var3.f52645w = new org.telegram.ui.Components.voip.j2(activity, z11, x0Var);
                org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(activity, false, true, false, false);
                zb1Var3.f52613d0 = z1Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                z1Var.d.setScalingType(scalingType);
                zb1Var3.f52613d0.d.setEnableHardwareScaler(true);
                zb1Var3.f52613d0.d.setRotateTextureWithScreen(true);
                zb1Var3.f52613d0.f39733b0 = 1;
                ub1Var.addView(zb1Var3.f52645w, b8.mf.c(-1.0f, -1));
                TLRPC.User user = zb1Var3.d;
                org.telegram.ui.Components.voip.g2 g2Var = new org.telegram.ui.Components.voip.g2(activity, user, x0Var);
                zb1Var3.f52647x = g2Var;
                ub1Var.addView(g2Var, b8.mf.c(-1.0f, -1));
                ?? view = new View(activity);
                if (org.telegram.messenger.lc.e(512)) {
                    int i11 = org.telegram.ui.ActionBar.k6.f27816a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i12 = calendar.get(2);
                    int i13 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i12 == 11 && i13 >= 24 && i13 <= 31) || (i12 == 0 && i13 == 1)) {
                        view.f39441a = new org.telegram.ui.Components.bu0(0);
                    }
                }
                zb1Var3.f52649y = view;
                ub1Var.addView((View) view, b8.mf.c(220.0f, -1));
                ub1Var.addView(zb1Var3.f52613d0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.j9(orientation, new int[]{-14994098, -14328963}).f(org.telegram.ui.Components.i9.w(0.5f, 1), new u61(zb1Var3, 1), 0L);
                org.telegram.ui.Components.voip.c1 c1Var = new org.telegram.ui.Components.voip.c1(activity);
                zb1Var3.Z = c1Var;
                c1Var.setDelegate(new ib1(zb1Var3, 3));
                zb1Var3.Z.d(1.0f, 1.0f);
                zb1Var3.f52608b0 = true;
                org.telegram.ui.Components.voip.z1 z1Var2 = new org.telegram.ui.Components.voip.z1(activity, true, false);
                zb1Var3.f52616e0 = z1Var2;
                z1Var2.d.setIsCamera(true);
                zb1Var3.f52616e0.d.setUseCameraRotation(true);
                zb1Var3.Z.setOnTapListener(new lb1(zb1Var3, 1));
                zb1Var3.f52616e0.d.setMirror(true);
                zb1Var3.Z.addView(zb1Var3.f52616e0);
                org.telegram.ui.Components.voip.c1 c1Var2 = new org.telegram.ui.Components.voip.c1(activity);
                zb1Var3.f52605a0 = c1Var2;
                c1Var2.T = true;
                c1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                zb1Var3.f52611c0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                zb1Var3.f52611c0.setIsCamera(false);
                zb1Var3.f52611c0.setFpsReduction(30.0f);
                zb1Var3.f52611c0.setScalingType(scalingType);
                zb1Var3.f52605a0.addView(zb1Var3.f52611c0, b8.mf.e(-1, -2, 17));
                zb1Var3.f52605a0.setOnTapListener(new lb1(zb1Var3, 2));
                zb1Var3.f52605a0.setVisibility(8);
                ub1Var.addView(zb1Var3.Z, b8.mf.c(-2.0f, -2));
                ub1Var.addView(zb1Var3.f52605a0);
                View view2 = new View(activity);
                zb1Var3.f52625i0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.o(-16777216, 127)}));
                ub1Var.addView(zb1Var3.f52625i0, b8.mf.e(-1, 160, 80));
                View view3 = new View(activity);
                zb1Var3.f52627j0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.o(-16777216, 102), 0}));
                ub1Var.addView(zb1Var3.f52627j0, b8.mf.e(-1, 160, 48));
                s51 s51Var = new s51(23, activity, zb1Var3);
                zb1Var3.O = s51Var;
                s51Var.setOrientation(0);
                zb1Var3.O.setPadding(0, 0, 0, org.telegram.messenger.g0.L(30.0f));
                zb1Var3.O.setClipToPadding(false);
                zb1Var3.O.setContentDescription(org.telegram.messenger.bd.M0(2131743312, null));
                zb1Var3.O.setOnClickListener(new lb1(zb1Var3, 3));
                zb1Var3.Q = new fi.j(activity, x0Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                zb1Var3.P = frameLayout;
                frameLayout.addView(zb1Var3.Q, b8.mf.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                zb1Var3.P.setVisibility(8);
                zb1Var3.P.setOnClickListener(new lb1(zb1Var3, 4));
                gi.y4 y4Var = new gi.y4(activity, x0Var);
                zb1Var3.S = y4Var;
                y4Var.setOrientation(1);
                TextView textView = new TextView(activity);
                zb1Var3.T = textView;
                textView.setText(org.telegram.messenger.bd.M0(2131743501, null));
                zb1Var3.T.setTextSize(1, 15.0f);
                zb1Var3.T.setTypeface(org.telegram.messenger.g0.o());
                zb1Var3.T.setTextColor(-1);
                zb1Var3.T.setGravity(17);
                org.telegram.ui.ActionBar.k2 k2Var = new org.telegram.ui.ActionBar.k2(8, activity, zb1Var3);
                zb1Var3.U = k2Var;
                k2Var.setTextSize(1, 15.0f);
                zb1Var3.U.setTextColor(-1);
                zb1Var3.U.setGravity(17);
                zb1Var3.U.setText(org.telegram.messenger.bd.a0("CallEmojiKeyTooltip", null, 2131752627, TextUtils.ellipsize(org.telegram.messenger.l10.j(user, true), zb1Var3.U.getPaint(), org.telegram.messenger.g0.L(300.0f), TextUtils.TruncateAt.END)));
                zb1Var3.S.setVisibility(8);
                zb1Var3.S.addView(zb1Var3.T);
                zb1Var3.S.addView(zb1Var3.U, b8.mf.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                zb1Var3.S.setPadding(org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(80.0f), org.telegram.messenger.g0.L(18.0f), org.telegram.messenger.g0.L(18.0f));
                for (int i14 = 0; i14 < 4; i14++) {
                    org.telegram.ui.Components.k9 k9Var = new org.telegram.ui.Components.k9(activity);
                    org.telegram.ui.Components.k9[] k9VarArr = zb1Var3.W;
                    k9VarArr[i14] = k9Var;
                    k9VarArr[i14].getImageReceiver().S0 = true;
                    s51 s51Var2 = zb1Var3.O;
                    org.telegram.ui.Components.k9 k9Var2 = k9VarArr[i14];
                    if (i14 == 0) {
                        f10 = 0.0f;
                    } else {
                        f10 = 6.0f;
                    }
                    s51Var2.addView(k9Var2, b8.mf.k(f10, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                vb1 vb1Var = new vb1(zb1Var3, activity);
                zb1Var3.Y = vb1Var;
                vb1Var.setOrientation(1);
                zb1Var3.Y.setFocusable(true);
                zb1Var3.Y.setFocusableInTouchMode(true);
                zb1Var3.E = new org.telegram.ui.Components.voip.c0(activity);
                org.telegram.ui.Components.u8 u8Var = new org.telegram.ui.Components.u8((org.telegram.ui.ActionBar.e6) null);
                u8Var.r(user);
                org.telegram.ui.Components.voip.c0 c0Var = zb1Var3.E;
                int i15 = zb1Var3.f52604a;
                c0Var.f39246b.j(org.telegram.messenger.ac.m(i15, 0, user), null, u8Var, user);
                zb1Var3.E.setRoundRadius(org.telegram.messenger.g0.L(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                zb1Var3.F = textView2;
                textView2.setTextSize(1, 28.0f);
                zb1Var3.F.setText(org.telegram.messenger.i6.m(org.telegram.messenger.g5.m(0, user.first_name, user.last_name), zb1Var3.F.getPaint().getFontMetricsInt(), false, null, 0));
                zb1Var3.F.setMaxLines(2);
                zb1Var3.F.setEllipsize(TextUtils.TruncateAt.END);
                zb1Var3.F.setTextColor(-1);
                zb1Var3.F.setGravity(1);
                zb1Var3.F.setImportantForAccessibility(2);
                zb1Var3.Y.addView(zb1Var3.F, b8.mf.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f39662a = new TextView[2];
                int i16 = 0;
                for (int i17 = 2; i16 < i17; i17 = 2) {
                    frameLayout2.f39662a[i16] = new TextView(activity);
                    frameLayout2.f39662a[i16].setTextSize(1, 15.0f);
                    frameLayout2.f39662a[i16].setTextColor(-1);
                    frameLayout2.f39662a[i16].setGravity(1);
                    frameLayout2.addView(frameLayout2.f39662a[i16]);
                    i16++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f39664c = frameLayout3;
                org.telegram.ui.Components.voip.j0 j0Var = new org.telegram.ui.Components.voip.j0(frameLayout2, activity, x0Var);
                j0Var.setTextSize(1, 15.0f);
                j0Var.setTextColor(-1);
                j0Var.setGravity(1);
                j0Var.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(2.0f));
                j0Var.setText(org.telegram.messenger.bd.M0(2131743227, null));
                frameLayout3.addView(j0Var, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, b8.mf.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f39663b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, b8.mf.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(org.telegram.messenger.bd.M0(2131743263, null));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new lg.p1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.a2 a2Var = new org.telegram.ui.Components.voip.a2(activity);
                frameLayout2.d = a2Var;
                frameLayout2.addView(a2Var, b8.mf.c(-2.0f, -1));
                zb1Var3.G = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f54015a;
                frameLayout2.setImportantForAccessibility(4);
                zb1Var3.Y.addView(zb1Var3.G, b8.mf.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    yb1 yb1Var = new yb1(activity);
                    zb1Var3.H = yb1Var;
                    long j10 = sharedState.getUser().f27150id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i18 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i18 <= 0) {
                        yb1Var.setVisibility(8);
                    } else {
                        if (groupParticipants == null) {
                            size = 0;
                        } else {
                            size = groupParticipants.size();
                        }
                        int max = Math.max(i18, size);
                        if (groupParticipants == null) {
                            size2 = 0;
                        } else {
                            size2 = groupParticipants.size();
                        }
                        int min = Math.min(3, size2);
                        org.telegram.ui.Components.w8 w8Var = yb1Var.f52254b;
                        w8Var.i(min);
                        int i19 = 0;
                        while (i19 < min) {
                            w8Var.j(i19, i15, org.telegram.messenger.hp.s1(i15).e2(org.telegram.messenger.m5.o(groupParticipants.get(i19).peer)));
                            i19++;
                            j10 = j10;
                        }
                        long j11 = j10;
                        w8Var.a(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && org.telegram.messenger.m5.o(groupParticipants.get(0).peer) == j11))) {
                            yb1Var.setVisibility(8);
                        } else {
                            yb1Var.f52255c = new org.telegram.ui.Components.ly0(org.telegram.messenger.bd.H(',', "Participants", max), 14.0f, org.telegram.messenger.g0.o());
                            yb1Var.setVisibility(0);
                            yb1Var.invalidate();
                        }
                    }
                    zb1Var3.Y.addView(zb1Var3.H, b8.mf.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                zb1Var3.Y.setClipChildren(false);
                zb1Var3.Y.setClipToPadding(false);
                zb1Var3.Y.setPadding(0, 0, 0, org.telegram.messenger.g0.L(15.0f));
                zb1Var3.V = new org.telegram.ui.Components.voip.j(activity);
                zb1Var3.R = new ci.t4(activity, x0Var);
                zb1Var3.V.setAlpha(0.0f);
                zb1Var3.R.setVisibility(8);
                ub1Var.addView(zb1Var3.E, b8.mf.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                ub1Var.addView(zb1Var3.Y, b8.mf.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                ub1Var.addView(zb1Var3.P, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ub1Var.addView(zb1Var3.S, b8.mf.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                ub1Var.addView(zb1Var3.O, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ub1Var.addView(zb1Var3.V, b8.mf.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                ub1Var.addView(zb1Var3.R, b8.mf.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                zb1Var3.f52629k0 = new org.telegram.ui.Components.voip.y0(activity);
                zb1Var3.f52615e = new org.telegram.ui.Components.voip.q2(activity, x0Var);
                zb1Var3.f52618f = new org.telegram.ui.Components.voip.q2(activity, x0Var);
                zb1Var3.h = new org.telegram.ui.Components.voip.q2(activity, x0Var);
                zb1Var3.f52632n = new org.telegram.ui.Components.voip.c2(activity, 52.0f);
                zb1Var3.f52615e.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                zb1Var3.f52615e.setScaleX(0.0f);
                zb1Var3.f52615e.setScaleY(0.0f);
                zb1Var3.f52615e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zb1Var3.f52618f.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                zb1Var3.f52618f.setScaleX(0.0f);
                zb1Var3.f52618f.setScaleY(0.0f);
                zb1Var3.f52618f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zb1Var3.h.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                zb1Var3.h.setScaleX(0.0f);
                zb1Var3.h.setScaleY(0.0f);
                zb1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zb1Var3.f52632n.setTranslationY(org.telegram.messenger.g0.L(100.0f));
                zb1Var3.f52632n.setScaleX(0.0f);
                zb1Var3.f52632n.setScaleY(0.0f);
                zb1Var3.f52632n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                zb1Var3.f52629k0.addView(zb1Var3.f52615e);
                zb1Var3.f52629k0.addView(zb1Var3.f52618f);
                zb1Var3.f52629k0.addView(zb1Var3.h);
                zb1Var3.f52629k0.addView(zb1Var3.f52632n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                zb1Var3.f52619f0 = eVar;
                eVar.setListener(new xb1(zb1Var3));
                zb1Var3.f52619f0.setScaleX(1.15f);
                zb1Var3.f52619f0.setScaleY(1.15f);
                ub1Var.addView(zb1Var3.f52629k0, b8.mf.e(-1, -2, 80));
                if (org.telegram.messenger.g0.Q1()) {
                    i10 = 100;
                } else {
                    i10 = 27;
                }
                float f11 = i10;
                ub1Var.addView(zb1Var3.f52619f0, b8.mf.d(-1, 186.0f, 80, f11, 0.0f, f11, 0.0f));
                ImageView imageView = new ImageView(activity);
                zb1Var3.J = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
                zb1Var3.J.setImageResource(2131232045);
                zb1Var3.J.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                ub1Var.addView(zb1Var3.J, b8.mf.e(56, 56, 53));
                b8.pf.a(zb1Var3.J);
                ImageView imageView2 = new ImageView(activity);
                zb1Var3.I = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
                zb1Var3.I.setImageResource(2131232080);
                zb1Var3.I.setPadding(org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f), org.telegram.messenger.g0.L(16.0f));
                zb1Var3.I.setContentDescription(org.telegram.messenger.bd.M0(2131753756, null));
                ub1Var.addView(zb1Var3.I, b8.mf.e(56, 56, 51));
                b8.pf.a(zb1Var3.I);
                lg.k kVar = new lg.k(activity, 6);
                zb1Var3.L = kVar;
                kVar.setContentDescription(org.telegram.messenger.bd.M0(2131743249, null));
                zb1Var3.L.setBackground(org.telegram.ui.ActionBar.k6.h0(i0.a.o(-1, 76), 1, -1));
                zb1Var3.L.setPadding(org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f), org.telegram.messenger.g0.L(12.0f));
                ub1Var.addView(zb1Var3.L, b8.mf.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                zb1Var3.L.setAlpha(0.0f);
                zb1Var3.L.setOnClickListener(new lb1(zb1Var3, 5));
                zb1Var3.I.setOnClickListener(new lb1(zb1Var3, 6));
                zb1Var3.J.setOnClickListener(new hb0(21, zb1Var3, activity));
                if (zb1Var3.f52644v0.f39289b) {
                    zb1Var3.I.setVisibility(8);
                    zb1Var3.J.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f39509a = new HashMap();
                linearLayout.f39510b = new ArrayList();
                linearLayout.f39511c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f39515r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f39514n = x0Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.h0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(org.telegram.messenger.g0.L(14.0f));
                zb1Var3.N0 = linearLayout;
                linearLayout.setGravity(80);
                zb1Var3.N0.setOnViewsUpdated(new kb1(zb1Var3, 5));
                ub1Var.addView(zb1Var3.N0, b8.mf.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.zo zoVar = new org.telegram.ui.Components.zo(activity, 3, x0Var, true);
                zoVar.r(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                zoVar.L = alignment;
                zoVar.d = -1L;
                zoVar.f13100r0 = new kb1(zb1Var3, 6);
                zoVar.U = true;
                zoVar.h = org.telegram.messenger.g0.L(320.0f);
                zoVar.f13084e = true;
                zoVar.n(10.0f, 6.0f, 10.0f, 6.0f);
                zoVar.s(8.0f);
                zb1Var3.O0 = zoVar;
                zoVar.u(org.telegram.messenger.bd.M0(2131744264, null));
                ub1Var.addView(zb1Var3.O0, b8.mf.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.zo zoVar2 = new org.telegram.ui.Components.zo(activity, 1, x0Var, false);
                zoVar2.r(true);
                zoVar2.L = alignment;
                zoVar2.d = 4000L;
                zoVar2.U = true;
                zoVar2.h = org.telegram.messenger.g0.L(320.0f);
                zoVar2.f13084e = true;
                zoVar2.n(10.0f, 6.0f, 10.0f, 6.0f);
                zoVar2.s(8.0f);
                zb1Var3.P0 = zoVar2;
                zoVar2.u(org.telegram.messenger.bd.M0(2131743312, null));
                ub1Var.addView(zb1Var3.P0, b8.mf.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                zb1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!zb1Var3.V0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zb1Var3.V0 = z12;
                    }
                    zb1Var3.h();
                }
                rb1Var2.addView(ub1Var);
                if (z10) {
                    zb1Var3.G0 = 0.0f;
                    zb1Var3.J0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        zb1Var3.f52613d0.setStub(org.telegram.ui.Components.voip.u1.d().f39628s);
                        zb1Var3.f52616e0.setStub(org.telegram.ui.Components.voip.u1.d().f39627r);
                    }
                    zb1Var3.f52644v0.setAlpha(0.0f);
                    zb1Var3.G();
                    zb1Var3.F0 = true;
                    org.telegram.ui.Components.voip.u1.V = true;
                    if (org.telegram.ui.Components.voip.u1.X == null) {
                        zb1Var3.M0.d();
                        org.telegram.messenger.g0.i3(new kb1(zb1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.u1.W.getClass();
                        throw null;
                    }
                } else {
                    zb1Var3.G0 = 1.0f;
                    zb1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && xf.b.a(activity) == 1) {
                    zb1 zb1Var4 = f52603o1;
                    uf.c cVar = new uf.c(activity, zb1Var4);
                    cVar.f55840c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.z1 z1Var3 = zb1Var4.f52613d0;
                    cVar.f55845j = z1Var3.d;
                    cVar.f55846k = z1Var3.getPlaceholderView();
                    zb1Var4.f52623h0 = cVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            kb1 kb1Var = this.T0;
            org.telegram.messenger.g0.r(kb1Var);
            this.S0 = false;
            if (this.A0 && this.f52650y0) {
                org.telegram.messenger.g0.i3(kb1Var, 3000L);
                this.S0 = true;
            }
        }
    }

    public final void B() {
        String M0;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f52648x0.isTouchExplorationEnabled()) {
                if (!this.f52635o0) {
                    M0 = org.telegram.messenger.bd.M0(2131754732, null);
                } else {
                    M0 = org.telegram.messenger.bd.M0(2131754733, null);
                }
                this.f52640s.announceForAccessibility(M0);
            }
            if (!this.f52635o0) {
                if (this.f52636p0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f52644v0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f52618f.getLocationOnScreen(iArr);
                    sb1 sb1Var = new sb1(this, this.f52640s.getContext(), iArr[0], iArr[1]);
                    this.f52636p0 = sb1Var;
                    WindowInsets windowInsets = this.f52641s0;
                    if (windowInsets != null) {
                        sb1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f52640s.addView(this.f52636p0);
                    return;
                }
                return;
            }
            this.f52616e0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f52639r0 = this.f52637q0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.h0(4).setDuration(250L);
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
                transitionSet.addTransition(duration.setInterpolator(xqVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(xqVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.c2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.q2.class, true);
                TransitionManager.beginDelayedTransition(this.f52629k0, transitionSet);
            }
            int i3 = this.f52637q0;
            if (i3 == 11) {
                this.f52615e.setVisibility(8);
                this.f52618f.setVisibility(8);
                this.h.setVisibility(8);
                this.f52632n.setVisibility(8);
                return;
            }
            int i10 = 0;
            if (i3 != 15 && i3 != 17) {
                if (f52603o1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f52635o0 || this.f52633n0)) {
                    p(this.f52615e, sharedInstance);
                    if (this.f52650y0) {
                        this.L.setTag(1);
                        this.L.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.f52615e, sharedInstance);
                    this.L.setTag(null);
                    this.L.animate().alpha(0.0f).start();
                }
                u(this.f52618f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f52632n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.bd.M0(2131743421, null), false, z10);
                this.f52632n.setOnClickListener(new lb1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i3 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f52635o0 || this.f52633n0)) {
                        p(this.f52615e, sharedInstance);
                        if (this.f52650y0) {
                            this.L.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.f52615e, sharedInstance);
                        this.L.animate().alpha(0.0f).start();
                    }
                    u(this.f52618f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.f52615e.setVisibility(8);
                    this.f52618f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f52632n.setVisibility(8);
            }
            if (this.f52615e.getVisibility() == 0) {
                this.f52615e.f39545f = 0;
                i10 = 16;
            }
            if (this.f52618f.getVisibility() == 0) {
                this.f52618f.f39545f = i10;
                i10 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f39545f = i10;
                i10 += 16;
            }
            if (this.f52632n.getVisibility() == 0) {
                this.f52632n.G = i10;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zb1.D(boolean):void");
    }

    public final void E() {
        int i3;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i3 = 2131230916;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i3 = 2131230924;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i3 = 2131230920;
        } else {
            i3 = 2131230921;
        }
        if (this.K != i3) {
            org.telegram.messenger.g0.R3(this.L, i3);
        } else {
            this.L.setImageResource(i3);
        }
        this.K = i3;
    }

    public final void F() {
        this.f52630l0.setColor(i0.a.o(-16777216, (int) (this.f52651z0 * 102.0f * this.G0)));
        this.m0.setColor(i0.a.o(-16777216, (int) (127.5f * this.G0)));
        ub1 ub1Var = this.f52640s;
        if (ub1Var != null) {
            ub1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.zb1.G():void");
    }

    public final ValueAnimator b(boolean z10) {
        char c2;
        float f10;
        float measuredWidth;
        final float measuredHeight;
        final float f11;
        final boolean z11;
        final float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        boolean z12;
        float f19;
        this.Z.animate().cancel();
        float f20 = org.telegram.ui.Components.voip.u1.d().d.x + org.telegram.ui.Components.voip.u1.d().F;
        float f21 = org.telegram.ui.Components.voip.u1.d().d.y + org.telegram.ui.Components.voip.u1.d().G;
        final float x10 = this.Z.getX();
        final float y9 = this.Z.getY();
        final float scaleX = this.Z.getScaleX();
        org.telegram.ui.Components.voip.u1.W.getClass();
        final float measuredWidth2 = f20 - ((this.f52613d0.getMeasuredWidth() - (this.f52613d0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f21 - ((this.f52613d0.getMeasuredHeight() - (this.f52613d0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f22 = 1.0f;
        if (this.f52633n0) {
            int measuredWidth3 = this.Z.getMeasuredWidth();
            if (this.f52635o0 && measuredWidth3 != 0) {
                f19 = (this.f52644v0.getMeasuredWidth() / measuredWidth3) * 0.25f * 0.4f;
                c2 = 0;
                f10 = 4.0f;
                measuredWidth = org.telegram.ui.Cells.f1.A(org.telegram.ui.Components.voip.u1.d().f39625f, 0.25f, 0.4f, (org.telegram.ui.Components.voip.u1.d().f39625f * 0.25f) + (f20 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                f18 = org.telegram.ui.Cells.f1.A(org.telegram.ui.Components.voip.u1.d().h, 0.25f, 0.4f, (org.telegram.ui.Components.voip.u1.d().h * 0.25f) + (f21 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * f19)) / 2.0f))) - org.telegram.messenger.g0.L(4.0f);
                z12 = true;
            } else {
                c2 = 0;
                f10 = 4.0f;
                measuredWidth = 1.0f;
                f18 = 1.0f;
                z12 = false;
                f19 = 0.0f;
            }
            measuredHeight = f18;
            z11 = z12;
            f11 = f19;
        } else {
            c2 = 0;
            f10 = 4.0f;
            measuredWidth = f20 - ((this.Z.getMeasuredWidth() - (this.Z.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f21 - ((this.Z.getMeasuredHeight() - (this.Z.getMeasuredHeight() * 0.25f)) / 2.0f);
            f11 = 0.25f;
            z11 = true;
        }
        final float f23 = measuredWidth;
        if (this.f52633n0) {
            f12 = org.telegram.messenger.g0.L(f10);
        } else {
            f12 = 0.0f;
        }
        final float L = (org.telegram.messenger.g0.L(f10) * 1.0f) / f11;
        if (this.f52633n0) {
            org.telegram.ui.Components.voip.u1.W.getClass();
            f13 = 1.0f;
            f22 = 0.0f;
        } else {
            f13 = 1.0f;
        }
        float f24 = f13;
        if (z10) {
            if (z11) {
                this.Z.setScaleX(f11);
                this.Z.setScaleY(f11);
                this.Z.setTranslationX(f23);
                this.Z.setTranslationY(measuredHeight);
                this.Z.setCornerRadius(L);
                this.Z.setAlpha(f22);
            }
            this.f52613d0.setScaleX(0.25f);
            this.f52613d0.setScaleY(0.25f);
            this.f52613d0.setTranslationX(measuredWidth2);
            this.f52613d0.setTranslationY(measuredHeight2);
            f14 = 0.25f;
            this.f52613d0.setRoundCorners((org.telegram.messenger.g0.L(6.0f) * f24) / 0.25f);
        } else {
            f14 = 0.25f;
        }
        if (z10) {
            f15 = f24;
        } else {
            f15 = 0.0f;
        }
        if (z10) {
            f16 = 0.0f;
        } else {
            f16 = f24;
        }
        float[] fArr = new float[2];
        fArr[c2] = f15;
        fArr[1] = f16;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f17 = 0.0f;
        } else {
            f17 = f24;
        }
        this.G0 = f17;
        F();
        final float f25 = f14;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f26 = 1.0f - floatValue;
                zb1 zb1Var = zb1.this;
                zb1Var.G0 = f26;
                zb1Var.F();
                if (z11) {
                    float f27 = (f11 * floatValue) + (scaleX * f26);
                    zb1Var.Z.setScaleX(f27);
                    zb1Var.Z.setScaleY(f27);
                    zb1Var.Z.setTranslationX((f23 * floatValue) + (x10 * f26));
                    zb1Var.Z.setTranslationY((measuredHeight * floatValue) + (y9 * f26));
                    zb1Var.Z.setCornerRadius((L * floatValue) + (f12 * f26));
                    zb1Var.Z.setAlpha((f22 * floatValue) + (1.0f * f26));
                }
                float f28 = (f25 * floatValue) + (1.0f * f26);
                zb1Var.f52613d0.setScaleX(f28);
                zb1Var.f52613d0.setScaleY(f28);
                float f29 = 0.0f * f26;
                float f30 = (measuredWidth2 * floatValue) + f29;
                float f31 = (measuredHeight2 * floatValue) + f29;
                zb1Var.f52613d0.setTranslationX(f30);
                zb1Var.f52613d0.setTranslationY(f31);
                zb1Var.f52613d0.setRoundCorners(((org.telegram.messenger.g0.L(4.0f) * floatValue) * 1.0f) / f28);
                if (!zb1Var.Z.Q) {
                    zb1Var.f52616e0.d(false, floatValue);
                }
                zb1Var.f52644v0.invalidate();
            }
        });
        return ofFloat;
    }

    @Override
    public final void c(b8.cg cgVar) {
        this.m1 = cgVar;
        org.telegram.ui.Components.voip.z1 z1Var = this.f52613d0;
        if (z1Var != null) {
            z1Var.d.clearFirstFrame();
        }
        this.f52634n1 = true;
        G();
        try {
            ((WindowManager) this.f52607b.getSystemService("window")).removeView(this.f52644v0);
        } catch (IllegalArgumentException e10) {
            org.telegram.messenger.a8.g(e10, true);
        }
        this.f52644v0.invalidate();
    }

    public final void d() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.O4);
        org.telegram.messenger.hs.f(this.f52604a).n(this, org.telegram.messenger.hs.M4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.f23246i4);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.E2);
        org.telegram.messenger.hs.e().n(this, org.telegram.messenger.hs.G5);
        uf.d dVar = this.f52623h0;
        if (dVar != null) {
            dVar.c();
            this.f52623h0 = null;
        }
        xg.e1 e1Var = this.N;
        if (e1Var != null) {
            e1Var.dismiss();
            this.N = null;
        }
    }

    @Override
    public final void didReceivedNotification(int i3, int i10, Object... objArr) {
        if (i3 == org.telegram.messenger.hs.M4) {
            if (this.f52637q0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f52616e0.d.release();
                this.f52613d0.d.release();
                this.f52611c0.release();
                h();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i3 == org.telegram.messenger.hs.f23246i4) {
            D(true);
        } else if (i3 == org.telegram.messenger.hs.E2) {
            this.f52644v0.b();
        } else if (i3 == org.telegram.messenger.hs.O4) {
            this.E.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i3 == org.telegram.messenger.hs.G5) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f52621g0 = booleanValue;
            if (booleanValue) {
                this.E.b(true, true);
            }
        }
    }

    public final void e(boolean z10) {
        ValueAnimator ofFloat;
        if (this.C0 && this.D0 != z10 && this.f52650y0) {
            this.D0 = z10;
            org.telegram.ui.Components.voip.g2 g2Var = this.f52647x;
            if (g2Var.L && z10 != g2Var.F) {
                g2Var.F = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                g2Var.f39370c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.f2(g2Var, 1));
                g2Var.f39370c.setInterpolator(org.telegram.ui.Components.xq.f40452f);
                g2Var.f39370c.setDuration(200L);
                g2Var.f39370c.start();
            }
            if (z10) {
                int i3 = org.telegram.messenger.az.f21628f1;
                if (i3 < 2) {
                    org.telegram.messenger.az.f21628f1 = i3 + 2;
                    SharedPreferences.Editor edit = org.telegram.messenger.hp.e1().edit();
                    edit.putInt("callEncryptionHintDisplayedCount", org.telegram.messenger.az.f21628f1);
                    edit.apply();
                }
                this.P0.f(true);
                org.telegram.messenger.g0.r(this.T0);
                this.S0 = false;
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(0L).translationY(org.telegram.messenger.g0.L(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
                }
                this.P.animate().setListener(null).cancel();
                this.P.setVisibility(0);
                this.P.setAlpha(0.0f);
                this.P.setScaleX(0.3f);
                this.P.setScaleY(0.3f);
                this.P.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.xq.f40453g).start();
                ViewPropertyAnimator translationY = this.O.animate().scaleX(1.72f).scaleY(1.72f).translationY(org.telegram.messenger.g0.L(140.0f));
                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
                org.telegram.messenger.camera.q.l(translationY, xqVar, 400L);
                this.S.animate().setListener(null).cancel();
                this.S.setVisibility(0);
                this.S.setTranslationY(-org.telegram.messenger.g0.L(120.0f));
                this.S.setScaleX(0.7f);
                this.S.setScaleY(0.7f);
                this.S.setAlpha(0.0f);
                this.S.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ob1(this, 3)).setInterpolator(xqVar).start();
            } else {
                if (this.E.getVisibility() == 0) {
                    this.E.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
                }
                this.P.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.P.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f40452f;
                duration.setInterpolator(xqVar2).setListener(new org.telegram.ui.Components.s9(this.P)).start();
                this.O.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(xqVar2).setDuration(280L).start();
                this.S.animate().setListener(null).cancel();
                this.S.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-org.telegram.messenger.g0.L(120.0f)).setListener(new ob1(this, 4)).setDuration(250L).setInterpolator(xqVar2).start();
            }
            this.f52639r0 = this.f52637q0;
            G();
        }
    }

    public final void f() {
        this.f52644v0.b();
    }

    @Override
    public final Bitmap g() {
        org.telegram.ui.Components.voip.z1 z1Var = this.f52631l1;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.f52631l1.d.getBitmap();
        }
        return null;
    }

    public final void h() {
        this.f52616e0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new pb1(this));
        this.f52613d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new qb1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f52611c0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override
    public final void i(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    public final void j() {
        if (!this.H0 && !this.F0) {
            sb1 sb1Var = this.f52636p0;
            if (sb1Var != null) {
                sb1Var.a(false, false);
            } else if (this.f52633n0 && this.f52635o0 && this.I0) {
                this.I0 = false;
                this.Z.setRelativePosition(this.f52605a0);
                this.f52608b0 = false;
                this.f52639r0 = this.f52637q0;
                G();
            } else if (this.D0) {
                e(false);
            } else if (this.S.getVisibility() == 8) {
                if (this.E0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (xf.b.a(this.f52607b) > 0) {
                        if (!this.H0 && f52603o1 != null) {
                            this.H0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f52603o1.f52644v0.getMeasuredHeight();
                                zb1 zb1Var = f52603o1;
                                org.telegram.ui.Components.voip.u1.e(zb1Var.f52607b, zb1Var.f52604a, zb1Var.f52644v0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f52603o1.f52641s0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.u1.Y = windowInsets.getSystemWindowInsetTop();
                                    f52603o1.f52641s0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.u1.d() != null) {
                                ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
                                duration.setInterpolator(xqVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                this.J.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                this.O.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                this.Y.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
                                this.f52629k0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                                this.f52625i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                                this.f52627j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                                this.f52605a0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                                this.N0.animate().alpha(0.0f).setDuration(350L).setInterpolator(xqVar).start();
                                org.telegram.ui.Components.voip.u1.V = true;
                                this.F0 = true;
                                ValueAnimator b10 = b(false);
                                this.M0.d();
                                b10.addListener(new ob1(this, 1));
                                b10.setDuration(350L);
                                b10.setInterpolator(xqVar);
                                b10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.t4.A(this.f52607b, new ib1(this, 0), true).p();
                    return;
                }
                this.f52644v0.b();
            }
        }
    }

    @Override
    public final Bitmap l() {
        org.telegram.ui.Components.voip.z1 z1Var = this.f52613d0;
        if (z1Var != null && z1Var.d.isAvailable()) {
            return this.f52613d0.d.getBitmap();
        }
        return null;
    }

    public final void n(Runnable runnable) {
        if (this.f52618f.getVisibility() == 0) {
            this.f52619f0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f52619f0;
            ValueAnimator valueAnimator = eVar.f39300c0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f39300c0 = null;
                eVar.V.stop();
            }
            runnable.run();
            return;
        }
        this.f52632n.animate().cancel();
        this.f52615e.animate().cancel();
        this.h.animate().cancel();
        this.f52618f.animate().cancel();
        this.f52619f0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f52619f0;
        ValueAnimator valueAnimator2 = eVar2.f39300c0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f39300c0 = null;
            eVar2.V.stop();
        }
        this.f52632n.c(2131230918, -1, -1041108, 1.0f, true, org.telegram.messenger.bd.M0(2131743421, null), false, false);
        this.f52615e.d(5, false, false);
        this.h.d(1, false, false);
        this.f52618f.d(3, true, false);
        this.f52632n.setVisibility(0);
        this.f52615e.setVisibility(0);
        this.h.setVisibility(0);
        this.f52618f.setVisibility(0);
        this.f52632n.setAlpha(0.0f);
        this.f52615e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f52618f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f52619f0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        org.telegram.messenger.g0.L(52.0f);
        final int L = org.telegram.messenger.g0.L(24.0f);
        final int L2 = org.telegram.messenger.g0.L(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                zb1 zb1Var = zb1.this;
                zb1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                zb1Var.f52619f0.setTranslationY(L2 * floatValue);
                int i3 = marginEnd;
                int i10 = (int) (i3 - ((i3 + L) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i10;
                marginLayoutParams2.rightMargin = i10;
                zb1Var.f52619f0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f52619f0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f52619f0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f52619f0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f52619f0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.ri0(16, this, runnable));
        animatorSet.start();
        org.telegram.messenger.g0.i3(new kb1(this, 7), 133L);
    }

    @Override
    public final boolean o() {
        return true;
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.s0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f52639r0 = this.f52637q0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i3, int i10) {
        this.f52639r0 = this.f52637q0;
        if (i10 == 2 && !this.V0) {
            this.V0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f52623h0 == null && xf.b.a(this.f52607b) == 1) {
                uf.c cVar = new uf.c(this.f52607b, f52603o1);
                cVar.f55840c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.z1 z1Var = this.f52613d0;
                cVar.f55845j = z1Var.d;
                cVar.f55846k = z1Var.getPlaceholderView();
                this.f52623h0 = cVar.a();
            }
        } else {
            uf.d dVar = this.f52623h0;
            if (dVar != null) {
                dVar.c();
                this.f52623h0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i3) {
        org.telegram.ui.Components.voip.j2 j2Var;
        if (i3 > 0) {
            this.k1 = true;
        }
        if (this.G != null && (j2Var = this.f52645w) != null) {
            int i10 = j2Var.W;
            if ((i10 == 2 || i10 == 3) && this.k1) {
                org.telegram.messenger.g0.i3(new org.telegram.ui.Components.o2(this, i3, 27), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i3) {
        int i10 = this.f52637q0;
        if (i10 != i3) {
            this.f52639r0 = i10;
            this.f52637q0 = i3;
            if (this.f52644v0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f52639r0 = this.f52637q0;
        if (z10 && !this.V0) {
            this.V0 = true;
        }
        G();
    }

    public final void p(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService) {
        if (!this.f52635o0) {
            q2Var.d(2, false, false);
            q2Var.setOnBtnClickedListener(null);
            q2Var.setEnabled(false);
            return;
        }
        q2Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            q2Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            q2Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        q2Var.setOnBtnClickedListener(new b7(this, voIPService, q2Var, 23));
    }

    @Override
    public final View q() {
        org.telegram.ui.Components.voip.z1 z1Var = new org.telegram.ui.Components.voip.z1(this.f52607b, false, true, false, false);
        this.f52631l1 = z1Var;
        z1Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f52631l1.d.setEnableHardwareScaler(true);
        this.f52631l1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.z1 z1Var2 = this.f52631l1;
        z1Var2.f39733b0 = 1;
        z1Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new tb1(this));
        View view = this.f52631l1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f52631l1;
    }

    @Override
    public final void r(b8.cg cgVar) {
        this.m1 = cgVar;
        rb1 rb1Var = this.f52644v0;
        rb1Var.getClass();
        ((WindowManager) this.f52607b.getSystemService("window")).addView(rb1Var, org.telegram.ui.Components.voip.d2.a());
        this.f52634n1 = false;
        G();
        this.f52644v0.invalidate();
        org.telegram.ui.Components.voip.z1 z1Var = this.f52631l1;
        if (z1Var != null) {
            z1Var.d.release();
            this.f52631l1 = null;
        }
    }

    public final void s(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService, boolean z10) {
        q2Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.c1 c1Var = this.Z;
        boolean isMicMute = voIPService.isMicMute();
        float f10 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = c1Var.f39261g0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f10 = 1.0f;
            }
            c1Var.L = f10;
            c1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = c1Var.f39261g0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f11 = c1Var.L;
            if (isMicMute) {
                f10 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f11, f10);
            c1Var.f39261g0 = ofFloat;
            ofFloat.addUpdateListener(c1Var.f39262h0);
            c1Var.f39261g0.setDuration(150L);
            c1Var.f39261g0.start();
        }
        q2Var.setOnBtnClickedListener(new ib1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService) {
        int i3;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i10 = 0;
        if (voIPService.isBluetoothOn()) {
            q2Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            q2Var.d(5, true, false);
        } else {
            q2Var.d(5, false, false);
            i3 = 1;
            q2Var.setEnabled(true);
            q2Var.setOnBtnClickedListener(new cg.e0(this, i3, q2Var, voIPService, 9));
        }
        i3 = i10;
        q2Var.setEnabled(true);
        q2Var.setOnBtnClickedListener(new cg.e0(this, i3, q2Var, voIPService, 9));
    }

    public final void u(org.telegram.ui.Components.voip.q2 q2Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f52635o0 && !this.f52633n0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f52635o0) {
                if (voIPService.isScreencast()) {
                    q2Var.d(3, false, z10);
                } else {
                    q2Var.d(3, false, z10);
                }
            } else {
                q2Var.d(3, true, z10);
            }
            q2Var.setOnBtnClickedListener(new ib1(this, 6));
            q2Var.setEnabled(true);
            return;
        }
        q2Var.d(3, true, false);
        q2Var.setOnClickListener(null);
        q2Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i3 = 0;
        if (!this.f52635o0 && !this.f52633n0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.E.getTag() == null) {
                this.E.animate().setListener(null).cancel();
                this.E.setVisibility(0);
                if (!this.D0) {
                    if (z11) {
                        this.E.setAlpha(0.0f);
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
                    } else {
                        this.E.setAlpha(0.0f);
                        this.E.setTranslationY(-org.telegram.messenger.g0.L(135.0f));
                        this.E.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
                    }
                } else if (z11) {
                    this.E.setAlpha(0.0f);
                    this.E.setTranslationY(org.telegram.messenger.g0.L(48.0f));
                    this.E.setScaleX(0.1f);
                    this.E.setScaleY(0.1f);
                }
            } else if (!z12 && this.E.getTag() != null) {
                this.E.animate().setListener(null).cancel();
                this.E.setTranslationY(0.0f);
                this.E.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.xq.f40452f).setListener(new ob1(this, 8)).start();
            }
        } else {
            this.E.animate().setListener(null).cancel();
            this.E.setTranslationY(0.0f);
            this.E.setAlpha(1.0f);
            this.E.setScaleX(1.0f);
            this.E.setScaleY(1.0f);
            org.telegram.ui.Components.voip.c0 c0Var = this.E;
            if (!z12) {
                i3 = 8;
            }
            c0Var.setVisibility(i3);
        }
        org.telegram.ui.Components.voip.c0 c0Var2 = this.E;
        if (z12) {
            num = 1;
        }
        c0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f52607b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(0, this.f52607b, null);
        boolean[] zArr = new boolean[3];
        s1Var.S = org.telegram.messenger.bd.M0(2131743418, null);
        s1Var.U = charSequence;
        s1Var.f28553o0 = org.telegram.messenger.bd.M0(2131747839, null);
        s1Var.f28554p0 = null;
        s1Var.show();
        for (int i3 = 0; i3 < 3; i3++) {
            if (zArr[i3] && (textView = (TextView) s1Var.d(-(i3 + 1))) != null) {
                org.telegram.ui.ActionBar.r6.V(textView, org.telegram.ui.ActionBar.k6.f28122q7, s1Var.f28550l1);
            }
        }
        s1Var.setCanceledOnTouchOutside(true);
        s1Var.setOnDismissListener(new s5(this, 18));
    }

    public final void y(int i3, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
            this.Z.setUiVisible(this.f52650y0);
        }
        if (!z10 && (animatorSet = this.B0) != null) {
            animatorSet.removeAllListeners();
            this.B0.cancel();
        }
        boolean z13 = true;
        if (i3 == 0) {
            if (z10) {
                if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                    AnimatorSet animatorSet2 = this.B0;
                    if (animatorSet2 != null) {
                        animatorSet2.removeAllListeners();
                        this.B0.cancel();
                    }
                    AnimatorSet animatorSet3 = new AnimatorSet();
                    org.telegram.ui.Components.voip.c1 c1Var = this.Z;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(c1Var, View.ALPHA, c1Var.getAlpha(), 0.0f));
                    if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.c1 c1Var2 = this.Z;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(c1Var2, View.SCALE_X, c1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.c1 c1Var3 = this.Z;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(c1Var3, View.SCALE_Y, c1Var3.getScaleX(), 0.7f));
                    }
                    this.B0 = animatorSet3;
                    animatorSet3.addListener(new ob1(this, 7));
                    this.B0.setDuration(250L).setInterpolator(org.telegram.ui.Components.xq.f40452f);
                    this.B0.setStartDelay(50L);
                    this.B0.start();
                }
            } else {
                this.Z.setVisibility(8);
            }
        } else {
            if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() != 0) {
                z11 = z10;
            } else {
                z11 = false;
            }
            if (z10) {
                if (this.Z.getTag() != null && ((Integer) this.Z.getTag()).intValue() == 0) {
                    if (this.Z.getVisibility() == 8) {
                        this.Z.setAlpha(0.0f);
                        this.Z.setScaleX(0.7f);
                        this.Z.setScaleY(0.7f);
                        this.Z.setVisibility(0);
                    }
                    AnimatorSet animatorSet4 = this.B0;
                    if (animatorSet4 != null) {
                        animatorSet4.removeAllListeners();
                        this.B0.cancel();
                    }
                    AnimatorSet animatorSet5 = new AnimatorSet();
                    animatorSet5.playTogether(ObjectAnimator.ofFloat(this.Z, View.ALPHA, 0.0f, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_X, 0.7f, 1.0f), ObjectAnimator.ofFloat(this.Z, View.SCALE_Y, 0.7f, 1.0f));
                    this.B0 = animatorSet5;
                    animatorSet5.setDuration(150L).start();
                }
            } else {
                this.Z.setVisibility(0);
            }
            if (this.Z.getTag() == null || ((Integer) this.Z.getTag()).intValue() != 2) {
                org.telegram.ui.Components.voip.c1 c1Var4 = this.Z;
                if (c1Var4.E < 0.0f) {
                    c1Var4.d(1.0f, 1.0f);
                    this.f52608b0 = true;
                }
            }
            org.telegram.ui.Components.voip.c1 c1Var5 = this.Z;
            if (i3 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            c1Var5.c(z12, z11);
            if (i3 == 2) {
                z13 = false;
            }
            this.f52608b0 = z13;
        }
        this.Z.setTag(Integer.valueOf(i3));
    }

    public final void z(boolean z10) {
        int i3;
        ValueAnimator valueAnimator = this.Q0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        xy0 xy0Var = this.R0;
        int i10 = 0;
        if (!z10 && this.f52650y0) {
            ViewPropertyAnimator duration = this.L.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L);
            org.telegram.ui.Components.xq xqVar = org.telegram.ui.Components.xq.f40452f;
            duration.setInterpolator(xqVar).start();
            this.I.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.J.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.O.animate().alpha(0.0f).translationY(-org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(xqVar).start();
            this.G.animate().alpha(0.0f).setDuration(150L).translationY(-org.telegram.messenger.g0.L(10.0f)).setInterpolator(xqVar).start();
            this.f52629k0.animate().alpha(0.0f).translationY(org.telegram.messenger.g0.L(10.0f)).setDuration(150L).setInterpolator(xqVar).start();
            this.f52625i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
            this.f52627j0.animate().alpha(0.0f).setDuration(150L).setInterpolator(xqVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f52651z0, 0.0f);
            this.Q0 = ofFloat;
            ofFloat.addUpdateListener(xy0Var);
            this.Q0.setDuration(150L).setInterpolator(xqVar);
            this.Q0.start();
            org.telegram.messenger.g0.r(this.T0);
            this.S0 = false;
            this.f52629k0.setEnabled(false);
            this.P0.f(true);
            i3 = 150;
        } else {
            if (z10 && !this.f52650y0) {
                this.O0.f(true);
                this.P0.f(true);
                ViewPropertyAnimator translationY = this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.xq xqVar2 = org.telegram.ui.Components.xq.f40452f;
                translationY.setInterpolator(xqVar2).start();
                this.G.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(xqVar2).start();
                this.L.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.J.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.O.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.f52629k0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.f52625i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar2).start();
                this.f52627j0.animate().alpha(1.0f).setDuration(150L).setInterpolator(xqVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f52651z0, 1.0f);
                this.Q0 = ofFloat2;
                ofFloat2.addUpdateListener(xy0Var);
                this.Q0.setDuration(150L).setInterpolator(xqVar2);
                this.Q0.start();
                this.f52629k0.setEnabled(true);
            }
            i3 = 0;
        }
        this.f52650y0 = z10;
        rb1 rb1Var = this.f52644v0;
        if (!z10) {
            rb1Var.setSystemUiVisibility(rb1Var.getSystemUiVisibility() | 4);
        } else {
            rb1Var.setSystemUiVisibility(rb1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.N0.animate();
        int i11 = -org.telegram.messenger.g0.L(16.0f);
        if (this.f52650y0) {
            i10 = org.telegram.messenger.g0.L(80.0f);
        }
        animate.translationY(i11 - i10).setDuration(150L).setStartDelay(i3).setInterpolator(org.telegram.ui.Components.xq.f40452f).start();
    }

    @Override
    public final void m(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}
