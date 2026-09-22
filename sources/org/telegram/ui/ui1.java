package org.telegram.ui;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.KeyguardManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.os.Build;
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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.AnimationNotificationsLocker;
import org.telegram.messenger.ContactsController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.ImageLocation;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
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
public final class ui1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, rf.a {
    public static ui1 f37981n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.p2 F;
    public float F0;
    public ti1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public hg.l K;
    public long K0;
    public int L;
    public tg.n1 M;
    public org.telegram.ui.Components.voip.h2 M0;
    public cc1 N;
    public org.telegram.ui.Components.voip.d3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.d3 O0;
    public org.telegram.ui.Components.voip.q0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.o1 Q;
    public ci.x5 R;
    public boolean R0;
    public TextView S;
    public sk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public qi1 X;
    public float X0;
    public org.telegram.ui.Components.voip.u1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.u1 Z;
    public float Z0;
    public final int f37982a;
    public boolean f37983a0;
    public boolean f37984a1;
    public Activity f37985b;
    public TextureViewRenderer f37986b0;
    public float f37987b1;
    public final TLRPC.User f37988c;
    public org.telegram.ui.Components.voip.s2 f37989c0;
    public float f37990c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.s2 f37991d0;
    public int f37992d1;
    public org.telegram.ui.Components.voip.k3 e;
    public org.telegram.ui.Components.voip.e f37993e0;
    public int f37994e1;
    public org.telegram.ui.Components.voip.k3 f37995f;
    public boolean f37996f0;
    public pf.e f37998g0;
    public boolean f37999g1;
    public org.telegram.ui.Components.voip.k3 h;
    public View f38000h0;
    public boolean f38001h1;
    public View f38002i0;
    public ValueAnimator f38003i1;
    public org.telegram.ui.Components.voip.r1 f38004j0;
    public boolean f38005j1;
    public org.telegram.ui.Components.voip.s2 f38007k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f38009m1;
    public ri1 f38010n;
    public boolean f38011n0;
    public ni1 f38012o0;
    public int f38013p0;
    public int f38014q0;
    public WindowInsets f38016r0;
    public pi1 f38017s;
    public boolean f38018s0;
    public float f38019t0;
    public mi1 f38020u0;
    public org.telegram.ui.Components.voip.c3 v;
    public int f38021v0;
    public org.telegram.ui.Components.voip.z2 f38022w;
    public AccessibilityManager f38023w0;
    public org.telegram.ui.Components.voip.e3 f38024x;
    public org.telegram.ui.Components.voip.t0 f38026y;
    public boolean f38028z0;
    public final org.telegram.ui.Components.voip.q1 f38015r = new org.telegram.ui.Components.voip.q1();
    public final org.telegram.ui.Components.u9[] V = new org.telegram.ui.Components.u9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f38006k0 = new Paint();
    public final Paint f38008l0 = new Paint();
    public boolean f38025x0 = true;
    public float f38027y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final a21 Q0 = new a21(this, 20);
    public final ei1 S0 = new ei1(this, 12);
    public final ei1 T0 = new ei1(this, 13);
    public float f37997f1 = 1.0f;

    public ui1(int i10) {
        this.f37982a = i10;
        this.f37988c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f38014q0 = -1;
        this.f38013p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(ui1 ui1Var) {
        AndroidUtilities.cancelRunOnUIThread(ui1Var.S0);
        ui1Var.R0 = false;
        if (Build.VERSION.SDK_INT >= 23 && ui1Var.f37985b.checkSelfPermission("android.permission.CAMERA") != 0) {
            ui1Var.f37985b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            ui1Var.C();
        }
    }

    public static void j(ui1 ui1Var) {
        ui1 ui1Var2;
        if (ui1Var.f37999g1) {
            ui1Var.f37999g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ui1Var.f38003i1 = ofFloat;
            ui1Var2 = ui1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x(ui1Var2, ui1Var.f37997f1, ui1Var.Y0, ui1Var.Z0, 1));
            ui1Var2.f38003i1.addListener(new ii1(ui1Var2, 0));
            ui1Var2.f38003i1.setDuration(350L);
            ui1Var2.f38003i1.setInterpolator(org.telegram.ui.Components.qr.f27420f);
            ui1Var2.f38003i1.start();
        } else {
            ui1Var2 = ui1Var;
        }
        ui1Var2.f38001h1 = false;
        ui1Var2.f37984a1 = false;
    }

    public static void q(int i10, int[] iArr) {
        ui1 ui1Var = f37981n1;
        if (ui1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ui1Var.f38020u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ui1Var.r(new o91(2));
                } else if (!ui1Var.f37985b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.f2.h(ui1Var.f37985b, new ei1(ui1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ui1Var.f38020u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ui1Var.C();
                }
            }
        }
    }

    public static void w(Activity activity, int i10) {
        boolean z10;
        boolean z11;
        int i11;
        boolean z12;
        int size;
        int size2;
        float f7;
        ui1 ui1Var = f37981n1;
        if (ui1Var != null && ui1Var.f38020u0.getParent() == null) {
            ui1 ui1Var2 = f37981n1;
            if (ui1Var2 != null) {
                ui1Var2.f37989c0.d.release();
                f37981n1.f37991d0.d.release();
                f37981n1.f37986b0.release();
                mi1 mi1Var = f37981n1.f38020u0;
                if (mi1Var != null) {
                    mi1Var.d();
                }
                f37981n1.l();
            }
            f37981n1 = null;
        }
        if (f37981n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ui1 ui1Var3 = new ui1(i10);
                ui1Var3.f37985b = activity;
                f37981n1 = ui1Var3;
                mi1 mi1Var2 = new mi1(activity, !z10, ui1Var3);
                f37981n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f37981n1.getClass();
                mi1Var2.setLockOnScreen(f37981n1.J0);
                ui1Var3.f38020u0 = mi1Var2;
                ci1 ci1Var = new ci1(ui1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f41839a;
                r0.a0.j(mi1Var2, ci1Var);
                ((WindowManager) activity.getSystemService("window")).addView(mi1Var2, org.telegram.ui.Components.voip.w2.a());
                ui1Var3.f38019t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ui1Var3.f38023w0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                pi1 pi1Var = new pi1(ui1Var3, activity);
                pi1Var.setClipToPadding(false);
                pi1Var.setClipChildren(false);
                pi1Var.setBackgroundColor(-16777216);
                ui1Var3.G();
                ui1Var3.f38017s = pi1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.q1 q1Var = ui1Var3.f38015r;
                ui1Var3.v = new org.telegram.ui.Components.voip.c3(activity, z11, q1Var);
                org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity, false, true, false, false);
                ui1Var3.f37989c0 = s2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                s2Var.d.setScalingType(scalingType);
                ui1Var3.f37989c0.d.setEnableHardwareScaler(true);
                ui1Var3.f37989c0.d.setRotateTextureWithScreen(true);
                ui1Var3.f37989c0.f29201a0 = 1;
                pi1Var.addView(ui1Var3.v, w7.x5.c(-1.0f, -1));
                TLRPC.User user = ui1Var3.d;
                org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity, user, q1Var);
                ui1Var3.f38022w = z2Var;
                pi1Var.addView(z2Var, w7.x5.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.i6.f18771a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f28938a = new org.telegram.ui.Components.aw0(0);
                    }
                }
                ui1Var3.f38024x = view;
                pi1Var.addView((View) view, w7.x5.c(220.0f, -1));
                pi1Var.addView(ui1Var3.f37989c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.t9(orientation, new int[]{-14994098, -14328963}).f(k2.c0.m(0.5f, 1), new ed1(ui1Var3, 1), 0L);
                org.telegram.ui.Components.voip.u1 u1Var = new org.telegram.ui.Components.voip.u1(activity);
                ui1Var3.Y = u1Var;
                u1Var.setDelegate(new ci1(ui1Var3, 3));
                ui1Var3.Y.d(1.0f, 1.0f);
                ui1Var3.f37983a0 = true;
                org.telegram.ui.Components.voip.s2 s2Var2 = new org.telegram.ui.Components.voip.s2(activity, true, false);
                ui1Var3.f37991d0 = s2Var2;
                s2Var2.d.setIsCamera(true);
                ui1Var3.f37991d0.d.setUseCameraRotation(true);
                ui1Var3.Y.setOnTapListener(new fi1(ui1Var3, 1));
                ui1Var3.f37991d0.d.setMirror(true);
                ui1Var3.Y.addView(ui1Var3.f37991d0);
                org.telegram.ui.Components.voip.u1 u1Var2 = new org.telegram.ui.Components.voip.u1(activity);
                ui1Var3.Z = u1Var2;
                u1Var2.S = true;
                u1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ui1Var3.f37986b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ui1Var3.f37986b0.setIsCamera(false);
                ui1Var3.f37986b0.setFpsReduction(30.0f);
                ui1Var3.f37986b0.setScalingType(scalingType);
                ui1Var3.Z.addView(ui1Var3.f37986b0, w7.x5.e(-1, -2, 17));
                ui1Var3.Z.setOnTapListener(new fi1(ui1Var3, 2));
                ui1Var3.Z.setVisibility(8);
                pi1Var.addView(ui1Var3.Y, w7.x5.c(-2.0f, -2));
                pi1Var.addView(ui1Var3.Z);
                View view2 = new View(activity);
                ui1Var3.f38000h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                pi1Var.addView(ui1Var3.f38000h0, w7.x5.e(-1, 160, 80));
                View view3 = new View(activity);
                ui1Var3.f38002i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                pi1Var.addView(ui1Var3.f38002i0, w7.x5.e(-1, 160, 48));
                cc1 cc1Var = new cc1(ui1Var3, activity, 16);
                ui1Var3.N = cc1Var;
                cc1Var.setOrientation(0);
                ui1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                ui1Var3.N.setClipToPadding(false);
                ui1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ui1Var3.N.setOnClickListener(new fi1(ui1Var3, 3));
                ui1Var3.P = new org.telegram.ui.Components.voip.q0(activity, q1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ui1Var3.O = frameLayout;
                frameLayout.addView(ui1Var3.P, w7.x5.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ui1Var3.O.setVisibility(8);
                ui1Var3.O.setOnClickListener(new fi1(ui1Var3, 4));
                ci.x5 x5Var = new ci.x5(activity, q1Var);
                ui1Var3.R = x5Var;
                x5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ui1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                ui1Var3.S.setTextSize(1, 15.0f);
                ui1Var3.S.setTypeface(AndroidUtilities.bold());
                ui1Var3.S.setTextColor(-1);
                ui1Var3.S.setGravity(17);
                sk skVar = new sk(ui1Var3, activity, 5);
                ui1Var3.T = skVar;
                skVar.setTextSize(1, 15.0f);
                ui1Var3.T.setTextColor(-1);
                ui1Var3.T.setGravity(17);
                ui1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ui1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                ui1Var3.R.setVisibility(8);
                ui1Var3.R.addView(ui1Var3.S);
                ui1Var3.R.addView(ui1Var3.T, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ui1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(activity);
                    org.telegram.ui.Components.u9[] u9VarArr = ui1Var3.V;
                    u9VarArr[i15] = u9Var;
                    u9VarArr[i15].getImageReceiver().setAspectFit(true);
                    cc1 cc1Var2 = ui1Var3.N;
                    org.telegram.ui.Components.u9 u9Var2 = u9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    cc1Var2.addView(u9Var2, w7.x5.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                qi1 qi1Var = new qi1(ui1Var3, activity);
                ui1Var3.X = qi1Var;
                qi1Var.setOrientation(1);
                ui1Var3.X.setFocusable(true);
                ui1Var3.X.setFocusableInTouchMode(true);
                ui1Var3.f38026y = new org.telegram.ui.Components.voip.t0(activity);
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.e6) null);
                f9Var.r(user);
                org.telegram.ui.Components.voip.t0 t0Var = ui1Var3.f38026y;
                int i16 = ui1Var3.f37982a;
                t0Var.f29227b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, f9Var, user);
                ui1Var3.f38026y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ui1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                ui1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ui1Var3.E.getPaint().getFontMetricsInt(), false));
                ui1Var3.E.setMaxLines(2);
                ui1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                ui1Var3.E.setTextColor(-1);
                ui1Var3.E.setGravity(1);
                ui1Var3.E.setImportantForAccessibility(2);
                ui1Var3.X.addView(ui1Var3.E, w7.x5.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f29158a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f29158a[i17] = new TextView(activity);
                    frameLayout2.f29158a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f29158a[i17].setTextColor(-1);
                    frameLayout2.f29158a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f29158a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f29160c = frameLayout3;
                org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(frameLayout2, activity, q1Var);
                n2Var.setTextSize(1, 15.0f);
                n2Var.setTextColor(-1);
                n2Var.setGravity(1);
                n2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                n2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(n2Var, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.x5.d(-1, -2.0f, 0, 0.0f, 44.0f, 0.0f, 0.0f));
                TextView textView3 = new TextView(activity);
                frameLayout2.f29159b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.x5.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new hg.x1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity);
                frameLayout2.d = t2Var;
                frameLayout2.addView(t2Var, w7.x5.c(-2.0f, -1));
                ui1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f41839a;
                frameLayout2.setImportantForAccessibility(4);
                ui1Var3.X.addView(ui1Var3.F, w7.x5.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    ti1 ti1Var = new ti1(activity);
                    ui1Var3.G = ti1Var;
                    long j3 = sharedState.getUser().f18256id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        ti1Var.setVisibility(8);
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
                        org.telegram.ui.Components.h9 h9Var = ti1Var.f37687b;
                        h9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            h9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j3 = j3;
                        }
                        long j10 = j3;
                        h9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j10))) {
                            ti1Var.setVisibility(8);
                        } else {
                            ti1Var.f37688c = new org.telegram.ui.Components.g01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            ti1Var.setVisibility(0);
                            ti1Var.invalidate();
                        }
                    }
                    ui1Var3.X.addView(ui1Var3.G, w7.x5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ui1Var3.X.setClipChildren(false);
                ui1Var3.X.setClipToPadding(false);
                ui1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                ui1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                ui1Var3.Q = new org.telegram.ui.Components.voip.o1(activity, q1Var);
                ui1Var3.U.setAlpha(0.0f);
                ui1Var3.Q.setVisibility(8);
                pi1Var.addView(ui1Var3.f38026y, w7.x5.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                pi1Var.addView(ui1Var3.X, w7.x5.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                pi1Var.addView(ui1Var3.O, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                pi1Var.addView(ui1Var3.R, w7.x5.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                pi1Var.addView(ui1Var3.N, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                pi1Var.addView(ui1Var3.U, w7.x5.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                pi1Var.addView(ui1Var3.Q, w7.x5.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ui1Var3.f38004j0 = new org.telegram.ui.Components.voip.r1(activity);
                ui1Var3.e = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                ui1Var3.f37995f = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                ui1Var3.h = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                ui1Var3.f38010n = new org.telegram.ui.Components.voip.v2(activity, 52.0f);
                ui1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                ui1Var3.e.setScaleX(0.0f);
                ui1Var3.e.setScaleY(0.0f);
                ui1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ui1Var3.f37995f.setTranslationY(AndroidUtilities.dp(100.0f));
                ui1Var3.f37995f.setScaleX(0.0f);
                ui1Var3.f37995f.setScaleY(0.0f);
                ui1Var3.f37995f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ui1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                ui1Var3.h.setScaleX(0.0f);
                ui1Var3.h.setScaleY(0.0f);
                ui1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ui1Var3.f38010n.setTranslationY(AndroidUtilities.dp(100.0f));
                ui1Var3.f38010n.setScaleX(0.0f);
                ui1Var3.f38010n.setScaleY(0.0f);
                ui1Var3.f38010n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ui1Var3.f38004j0.addView(ui1Var3.e);
                ui1Var3.f38004j0.addView(ui1Var3.f37995f);
                ui1Var3.f38004j0.addView(ui1Var3.h);
                ui1Var3.f38004j0.addView(ui1Var3.f38010n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ui1Var3.f37993e0 = eVar;
                eVar.setListener(new si1(ui1Var3));
                ui1Var3.f37993e0.setScaleX(1.15f);
                ui1Var3.f37993e0.setScaleY(1.15f);
                pi1Var.addView(ui1Var3.f38004j0, w7.x5.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                pi1Var.addView(ui1Var3.f37993e0, w7.x5.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                ui1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(-1, 76), 1, -1));
                ui1Var3.I.setImageResource(R.drawable.msg_addcontact);
                ui1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                pi1Var.addView(ui1Var3.I, w7.x5.e(56, 56, 53));
                w7.z5.a(ui1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                ui1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(-1, 76), 1, -1));
                ui1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                ui1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ui1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                pi1Var.addView(ui1Var3.H, w7.x5.e(56, 56, 51));
                w7.z5.a(ui1Var3.H);
                hg.l lVar = new hg.l(activity, 5);
                ui1Var3.K = lVar;
                lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                ui1Var3.K.setBackground(org.telegram.ui.ActionBar.i6.f0(i0.a.k(-1, 76), 1, -1));
                ui1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                pi1Var.addView(ui1Var3.K, w7.x5.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ui1Var3.K.setAlpha(0.0f);
                ui1Var3.K.setOnClickListener(new fi1(ui1Var3, 5));
                ui1Var3.H.setOnClickListener(new fi1(ui1Var3, 6));
                ui1Var3.I.setOnClickListener(new wy0(10, ui1Var3, activity));
                if (ui1Var3.f38020u0.f29329b) {
                    ui1Var3.H.setVisibility(8);
                    ui1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f28977a = new HashMap();
                linearLayout.f28978b = new ArrayList();
                linearLayout.f28979c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f28982r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f28981n = q1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.n0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                ui1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                ui1Var3.M0.setOnViewsUpdated(new ei1(ui1Var3, 5));
                pi1Var.addView(ui1Var3.M0, w7.x5.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity, 3, q1Var, true);
                d3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                d3Var.K = alignment;
                d3Var.d = -1L;
                d3Var.f4635l0 = new ei1(ui1Var3, 6);
                d3Var.T = true;
                d3Var.h = AndroidUtilities.dp(320.0f);
                d3Var.e = true;
                d3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var.q(8.0f);
                ui1Var3.N0 = d3Var;
                d3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                pi1Var.addView(ui1Var3.N0, w7.x5.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var2 = new org.telegram.ui.Components.voip.d3(activity, 1, q1Var, false);
                d3Var2.p(true);
                d3Var2.K = alignment;
                d3Var2.d = 4000L;
                d3Var2.T = true;
                d3Var2.h = AndroidUtilities.dp(320.0f);
                d3Var2.e = true;
                d3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var2.q(8.0f);
                ui1Var3.O0 = d3Var2;
                d3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                pi1Var.addView(ui1Var3.O0, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ui1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!ui1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ui1Var3.U0 = z12;
                    }
                    ui1Var3.o();
                }
                mi1Var2.addView(pi1Var);
                if (z10) {
                    ui1Var3.F0 = 0.0f;
                    ui1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        ui1Var3.f37989c0.setStub(org.telegram.ui.Components.voip.m2.k().f29093r);
                        ui1Var3.f37991d0.setStub(org.telegram.ui.Components.voip.m2.k().f29092n);
                    }
                    ui1Var3.f38020u0.setAlpha(0.0f);
                    ui1Var3.H();
                    ui1Var3.E0 = true;
                    org.telegram.ui.Components.voip.m2.T = true;
                    if (org.telegram.ui.Components.voip.m2.V == null) {
                        ui1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new ei1(ui1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.m2.U.getClass();
                        throw null;
                    }
                } else {
                    ui1Var3.F0 = 1.0f;
                    ui1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
                    ui1 ui1Var4 = f37981n1;
                    pf.d dVar = new pf.d(activity, ui1Var4);
                    dVar.f40781c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.s2 s2Var3 = ui1Var4.f37989c0;
                    dVar.f40785j = s2Var3.d;
                    dVar.f40786k = s2Var3.getPlaceholderView();
                    ui1Var4.f37998g0 = dVar.a();
                }
            }
        }
    }

    public final void A(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        a21 a21Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f38025x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27420f;
            duration.setInterpolator(qrVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(qrVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(qrVar).start();
            this.f38004j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.f38000h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
            this.f38002i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f38027y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(a21Var);
            this.P0.setDuration(150L).setInterpolator(qrVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f38004j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f38025x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.qr qrVar2 = org.telegram.ui.Components.qr.f27420f;
                translationY.setInterpolator(qrVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(qrVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.f38004j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.f38000h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.f38002i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f38027y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(a21Var);
                this.P0.setDuration(150L).setInterpolator(qrVar2);
                this.P0.start();
                this.f38004j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f38025x0 = z10;
        mi1 mi1Var = this.f38020u0;
        if (!z10) {
            mi1Var.setSystemUiVisibility(mi1Var.getSystemUiVisibility() | 4);
        } else {
            mi1Var.setSystemUiVisibility(mi1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f38025x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.qr.f27420f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            ei1 ei1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(ei1Var);
            this.R0 = false;
            if (this.f38028z0 && this.f38025x0) {
                AndroidUtilities.runOnUIThread(ei1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f38023w0.isTouchExplorationEnabled()) {
                if (!this.f38011n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f38017s.announceForAccessibility(string);
            }
            if (!this.f38011n0) {
                if (this.f38012o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f38020u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f37995f.getLocationOnScreen(iArr);
                    ni1 ni1Var = new ni1(this, this.f38017s.getContext(), iArr[0], iArr[1]);
                    this.f38012o0 = ni1Var;
                    WindowInsets windowInsets = this.f38016r0;
                    if (windowInsets != null) {
                        ni1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f38017s.addView(this.f38012o0);
                    return;
                }
                return;
            }
            this.f37991d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f38014q0 = this.f38013p0;
            H();
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.n0(4).setDuration(250L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27420f;
                transitionSet.addTransition(duration.setInterpolator(qrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(qrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.v2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.k3.class, true);
                TransitionManager.beginDelayedTransition(this.f38004j0, transitionSet);
            }
            int i10 = this.f38013p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f37995f.setVisibility(8);
                this.h.setVisibility(8);
                this.f38010n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f37981n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f38011n0 || this.m0)) {
                    s(this.e, sharedInstance);
                    if (this.f38025x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                v(this.f37995f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
                this.f38010n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f38010n.setOnClickListener(new fi1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f38011n0 || this.m0)) {
                        s(this.e, sharedInstance);
                        if (this.f38025x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    v(this.f37995f, sharedInstance, false);
                    t(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f37995f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f38010n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f29038f = 0;
                i11 = 16;
            }
            if (this.f37995f.getVisibility() == 0) {
                this.f37995f.f29038f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f29038f = i11;
                i11 += 16;
            }
            if (this.f38010n.getVisibility() == 0) {
                this.f38010n.F = i11;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ui1.E(boolean):void");
    }

    public final void F() {
        int i10;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null) {
            return;
        }
        if (sharedInstance.isBluetoothOn()) {
            i10 = R.drawable.calls_bluetooth;
        } else if (VoipAudioManager.get().isSpeakerphoneOn()) {
            i10 = R.drawable.calls_speaker;
        } else if (sharedInstance.isHeadsetPlugged()) {
            i10 = R.drawable.calls_menu_headset;
        } else {
            i10 = R.drawable.calls_menu_phone;
        }
        if (this.J != i10) {
            AndroidUtilities.updateImageViewImageAnimated(this.K, i10);
        } else {
            this.K.setImageResource(i10);
        }
        this.J = i10;
    }

    public final void G() {
        this.f38006k0.setColor(i0.a.k(-16777216, (int) (this.f38027y0 * 102.0f * this.F0)));
        this.f38008l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        pi1 pi1Var = this.f38017s;
        if (pi1Var != null) {
            pi1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ui1.H():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.s2 s2Var = this.f37989c0;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        this.f38009m1 = true;
        H();
        ((WindowManager) this.f37985b.getSystemService("window")).removeView(this.f38020u0);
        this.f38020u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        mi1 mi1Var = this.f38020u0;
        mi1Var.getClass();
        ((WindowManager) this.f37985b.getSystemService("window")).addView(mi1Var, org.telegram.ui.Components.voip.w2.a());
        this.f38009m1 = false;
        H();
        this.f38020u0.invalidate();
        org.telegram.ui.Components.voip.s2 s2Var = this.f38007k1;
        if (s2Var != null) {
            s2Var.d.release();
            this.f38007k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.s2 s2Var = this.f38007k1;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f38007k1.d.getBitmap();
        }
        return null;
    }

    @Override
    public final void d(Canvas canvas) {
        canvas.drawColor(-14999773);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.voipServiceCreated) {
            if (this.f38013p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f37991d0.d.release();
                this.f37989c0.d.release();
                this.f37986b0.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f38020u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f38026y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f37996f0 = booleanValue;
            if (booleanValue) {
                this.f38026y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.s2 s2Var = this.f37989c0;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f37989c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(this.f37985b, false, true, false, false);
        this.f38007k1 = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f38007k1.d.setEnableHardwareScaler(true);
        this.f38007k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.s2 s2Var2 = this.f38007k1;
        s2Var2.f29201a0 = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new oi1(this));
        View view = this.f38007k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f38007k1;
    }

    public final ValueAnimator k(boolean z10) {
        char c10;
        float measuredHeight;
        final float f7;
        final boolean z11;
        final float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        this.Y.animate().cancel();
        float f17 = org.telegram.ui.Components.voip.m2.k().d.x + org.telegram.ui.Components.voip.m2.k().f29097y;
        float f18 = org.telegram.ui.Components.voip.m2.k().d.y + org.telegram.ui.Components.voip.m2.k().E;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.m2.U.getClass();
        final float measuredWidth = f17 - ((this.f37989c0.getMeasuredWidth() - (this.f37989c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f18 - ((this.f37989c0.getMeasuredHeight() - (this.f37989c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f19 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (this.f38011n0 && measuredWidth2 != 0) {
                f16 = (this.f38020u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f15 = (((org.telegram.ui.Components.voip.m2.k().f29091f * 0.25f) + (f17 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().f29091f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.m2.k().h * 0.25f) + (f18 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            } else {
                c10 = 0;
                measuredHeight = 1.0f;
                z11 = false;
                f15 = 1.0f;
                f16 = 0.0f;
            }
            float f20 = f16;
            f7 = f15;
            f10 = f20;
        } else {
            c10 = 0;
            float measuredWidth3 = f17 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f18 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f7 = measuredWidth3;
            z11 = true;
            f10 = 0.25f;
        }
        final float f21 = measuredHeight;
        if (this.m0) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.m2.U.getClass();
            f19 = 0.0f;
        }
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f7);
                this.Y.setTranslationY(f21);
                this.Y.setCornerRadius(dp);
                this.Y.setAlpha(f19);
            }
            this.f37989c0.setScaleX(0.25f);
            this.f37989c0.setScaleY(0.25f);
            this.f37989c0.setTranslationX(measuredWidth);
            this.f37989c0.setTranslationY(measuredHeight2);
            this.f37989c0.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
        }
        if (z10) {
            f12 = 1.0f;
        } else {
            f12 = 0.0f;
        }
        if (z10) {
            f13 = 0.0f;
        } else {
            f13 = 1.0f;
        }
        float[] fArr = new float[2];
        fArr[c10] = f12;
        fArr[1] = f13;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f14 = 0.0f;
        } else {
            f14 = 1.0f;
        }
        this.F0 = f14;
        G();
        final float f22 = f11;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f23 = 1.0f - floatValue;
                ui1 ui1Var = ui1.this;
                ui1Var.F0 = f23;
                ui1Var.G();
                if (z11) {
                    float f24 = (f10 * floatValue) + (scaleX * f23);
                    ui1Var.Y.setScaleX(f24);
                    ui1Var.Y.setScaleY(f24);
                    ui1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f23));
                    ui1Var.Y.setTranslationY((f21 * floatValue) + (y3 * f23));
                    ui1Var.Y.setCornerRadius((dp * floatValue) + (f22 * f23));
                    ui1Var.Y.setAlpha((f19 * floatValue) + (1.0f * f23));
                }
                float f25 = (r12 * floatValue) + (1.0f * f23);
                ui1Var.f37989c0.setScaleX(f25);
                ui1Var.f37989c0.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                ui1Var.f37989c0.setTranslationX(f27);
                ui1Var.f37989c0.setTranslationY(f28);
                ui1Var.f37989c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!ui1Var.Y.P) {
                    ui1Var.f37991d0.d(floatValue, false);
                }
                ui1Var.f38020u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f37982a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        pf.e eVar = this.f37998g0;
        if (eVar != null) {
            eVar.c();
            this.f37998g0 = null;
        }
        tg.n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.dismiss();
            this.M = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f38025x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.z2 z2Var = this.f38022w;
            if (z2Var.K && z10 != z2Var.E) {
                z2Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                z2Var.f29379c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y2(z2Var, 1));
                z2Var.f29379c.setInterpolator(org.telegram.ui.Components.qr.f27420f);
                z2Var.f29379c.setDuration(200L);
                z2Var.f29379c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f38026y.getVisibility() == 0) {
                    this.f38026y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.qr.f27420f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.qr.f27421g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27420f;
                org.telegram.messenger.vl.r(translationY, qrVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ii1(this, 3)).setInterpolator(qrVar).start();
            } else {
                if (this.f38026y.getVisibility() == 0) {
                    this.f38026y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.qr.f27420f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.qr qrVar2 = org.telegram.ui.Components.qr.f27420f;
                duration.setInterpolator(qrVar2).setListener(new org.telegram.ui.Components.aa(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(qrVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ii1(this, 4)).setDuration(250L).setInterpolator(qrVar2).start();
            }
            this.f38014q0 = this.f38013p0;
            H();
        }
    }

    public final void n() {
        this.f38020u0.b();
    }

    public final void o() {
        this.f37991d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ji1(this));
        this.f37989c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ki1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f37986b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    @Override
    public final void onAudioSettingsChanged() {
        D(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.u0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f38014q0 = this.f38013p0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f38014q0 = this.f38013p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f37998g0 == null && sf.c.a(this.f37985b) == 1) {
                pf.d dVar = new pf.d(this.f37985b, f37981n1);
                dVar.f40781c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.s2 s2Var = this.f37989c0;
                dVar.f40785j = s2Var.d;
                dVar.f40786k = s2Var.getPlaceholderView();
                this.f37998g0 = dVar.a();
            }
        } else {
            pf.e eVar = this.f37998g0;
            if (eVar != null) {
                eVar.c();
                this.f37998g0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.c3 c3Var;
        if (i10 > 0) {
            this.f38005j1 = true;
        }
        if (this.F != null && (c3Var = this.v) != null) {
            int i11 = c3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f38005j1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.id(this, i10, 28), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f38013p0;
        if (i11 != i10) {
            this.f38014q0 = i11;
            this.f38013p0 = i10;
            if (this.f38020u0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f38014q0 = this.f38013p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.G0 && !this.E0) {
            ni1 ni1Var = this.f38012o0;
            if (ni1Var != null) {
                ni1Var.a(false, false);
            } else if (this.m0 && this.f38011n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f37983a0 = false;
                this.f38014q0 = this.f38013p0;
                H();
            } else if (this.C0) {
                m(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (sf.c.a(this.f37985b) > 0) {
                        if (!this.G0 && f37981n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f37981n1.f38020u0.getMeasuredHeight();
                                ui1 ui1Var = f37981n1;
                                org.telegram.ui.Components.voip.m2.l(ui1Var.f37985b, ui1Var.f37982a, ui1Var.f38020u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f37981n1.f38016r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.m2.W = windowInsets.getSystemWindowInsetTop();
                                    f37981n1.f38016r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.m2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27420f;
                                duration.setInterpolator(qrVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.f38004j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.f38000h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.f38002i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                org.telegram.ui.Components.voip.m2.T = true;
                                this.E0 = true;
                                ValueAnimator k10 = k(false);
                                this.L0.lock();
                                k10.addListener(new ii1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(qrVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.c5.B(this.f37985b, new ci1(this, 0), true).o();
                    return;
                }
                this.f38020u0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f37995f.getVisibility() == 0) {
            this.f37993e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f37993e0;
            ValueAnimator valueAnimator = eVar.f28920b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f28920b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f38010n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f37995f.animate().cancel();
        this.f37993e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f37993e0;
        ValueAnimator valueAnimator2 = eVar2.f28920b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f28920b0 = null;
            eVar2.U.stop();
        }
        this.f38010n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f37995f.d(3, true, false);
        this.f38010n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f37995f.setVisibility(0);
        this.f38010n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f37995f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37993e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ui1 ui1Var = ui1.this;
                ui1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ui1Var.f37993e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                ui1Var.f37993e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f37993e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f37993e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f37993e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f37993e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.pk0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new ei1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        if (!this.f38011n0) {
            k3Var.d(2, false, false);
            k3Var.setOnBtnClickedListener(null);
            k3Var.setEnabled(false);
            return;
        }
        k3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            k3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            k3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        k3Var.setOnBtnClickedListener(new b7(this, voIPService, k3Var, 23));
    }

    public final void t(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        k3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.u1 u1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = u1Var.f29284f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            u1Var.K = f7;
            u1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = u1Var.f29284f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = u1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            u1Var.f29284f0 = ofFloat;
            ofFloat.addUpdateListener(u1Var.f29285g0);
            u1Var.f29284f0.setDuration(150L);
            u1Var.f29284f0.start();
        }
        k3Var.setOnBtnClickedListener(new ci1(this, 5));
    }

    public final void u(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        if (voIPService.isBluetoothOn()) {
            k3Var.d(4, false, false);
            i10 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            k3Var.d(5, true, false);
            i10 = 0;
        } else {
            k3Var.d(5, false, false);
            i10 = 1;
        }
        k3Var.setEnabled(true);
        k3Var.setOnBtnClickedListener(new da(this, i10, k3Var, voIPService, 8));
    }

    public final void v(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f38011n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f38011n0) {
                if (voIPService.isScreencast()) {
                    k3Var.d(3, false, z10);
                } else {
                    k3Var.d(3, false, z10);
                }
            } else {
                k3Var.d(3, true, z10);
            }
            k3Var.setOnBtnClickedListener(new ci1(this, 6));
            k3Var.setEnabled(true);
            return;
        }
        k3Var.d(3, true, false);
        k3Var.setOnClickListener(null);
        k3Var.setEnabled(false);
    }

    public final void x(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f38011n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f38026y.getTag() == null) {
                this.f38026y.animate().setListener(null).cancel();
                this.f38026y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f38026y.setAlpha(0.0f);
                        this.f38026y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.qr.f27420f).start();
                    } else {
                        this.f38026y.setAlpha(0.0f);
                        this.f38026y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f38026y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.qr.f27420f).start();
                    }
                } else if (z11) {
                    this.f38026y.setAlpha(0.0f);
                    this.f38026y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f38026y.setScaleX(0.1f);
                    this.f38026y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f38026y.getTag() != null) {
                this.f38026y.animate().setListener(null).cancel();
                this.f38026y.setTranslationY(0.0f);
                this.f38026y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.qr.f27420f).setListener(new ii1(this, 7)).start();
            }
        } else {
            this.f38026y.animate().setListener(null).cancel();
            this.f38026y.setTranslationY(0.0f);
            this.f38026y.setAlpha(1.0f);
            this.f38026y.setScaleX(1.0f);
            this.f38026y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.t0 t0Var = this.f38026y;
            if (!z12) {
                i10 = 8;
            }
            t0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.t0 t0Var2 = this.f38026y;
        if (z12) {
            num = 1;
        }
        t0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f37985b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.f37985b, 0, null);
        boolean[] zArr = new boolean[3];
        b2Var.R = LocaleController.getString(R.string.VoipFailed);
        b2Var.T = charSequence;
        b2Var.f18476l0 = LocaleController.getString(R.string.OK);
        b2Var.m0 = null;
        b2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) b2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(b2Var.e(org.telegram.ui.ActionBar.i6.f19071q7));
            }
        }
        b2Var.setCanceledOnTouchOutside(true);
        b2Var.setOnDismissListener(new r5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f38025x0);
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
                    org.telegram.ui.Components.voip.u1 u1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(u1Var, View.ALPHA, u1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.u1 u1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(u1Var2, View.SCALE_X, u1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.u1 u1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(u1Var3, View.SCALE_Y, u1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new ii1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.qr.f27420f);
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
                org.telegram.ui.Components.voip.u1 u1Var4 = this.Y;
                if (u1Var4.f29294y < 0.0f) {
                    u1Var4.d(1.0f, 1.0f);
                    this.f37983a0 = true;
                }
            }
            org.telegram.ui.Components.voip.u1 u1Var5 = this.Y;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            u1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.f37983a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}
