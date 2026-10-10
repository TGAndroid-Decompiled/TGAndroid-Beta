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
public final class wi1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, sf.a {
    public static wi1 f43669n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.p2 F;
    public float F0;
    public vi1 G;
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
    public tg.m1 M;
    public org.telegram.ui.Components.voip.h2 M0;
    public dc1 N;
    public org.telegram.ui.Components.voip.d3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.d3 O0;
    public org.telegram.ui.Components.voip.q0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.o1 Q;
    public ci.w5 R;
    public boolean R0;
    public TextView S;
    public tk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public si1 X;
    public float X0;
    public org.telegram.ui.Components.voip.u1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.u1 Z;
    public float Z0;
    public final int f43670a;
    public boolean f43671a0;
    public boolean f43672a1;
    public Activity f43673b;
    public TextureViewRenderer f43674b0;
    public float f43675b1;
    public final TLRPC.User f43676c;
    public org.telegram.ui.Components.voip.s2 f43677c0;
    public float f43678c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.s2 f43679d0;
    public int f43680d1;
    public org.telegram.ui.Components.voip.k3 f43681e;
    public org.telegram.ui.Components.voip.e f43682e0;
    public int f43683e1;
    public org.telegram.ui.Components.voip.k3 f43684f;
    public boolean f43685f0;
    public qf.e f43687g0;
    public boolean f43688g1;
    public org.telegram.ui.Components.voip.k3 h;
    public View f43689h0;
    public boolean f43690h1;
    public View f43691i0;
    public ValueAnimator f43692i1;
    public org.telegram.ui.Components.voip.r1 f43693j0;
    public boolean f43694j1;
    public org.telegram.ui.Components.voip.s2 f43696k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f43698m1;
    public ti1 f43699n;
    public boolean f43700n0;
    public pi1 f43701o0;
    public int f43702p0;
    public int f43703q0;
    public WindowInsets f43705r0;
    public ri1 f43706s;
    public boolean f43707s0;
    public float f43708t0;
    public oi1 f43709u0;
    public org.telegram.ui.Components.voip.c3 v;
    public int f43710v0;
    public org.telegram.ui.Components.voip.z2 f43711w;
    public AccessibilityManager f43712w0;
    public org.telegram.ui.Components.voip.e3 f43713x;
    public org.telegram.ui.Components.voip.t0 f43715y;
    public boolean f43717z0;
    public final org.telegram.ui.Components.voip.q1 f43704r = new org.telegram.ui.Components.voip.q1();
    public final org.telegram.ui.Components.y9[] V = new org.telegram.ui.Components.y9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f43695k0 = new Paint();
    public final Paint f43697l0 = new Paint();
    public boolean f43714x0 = true;
    public float f43716y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final y11 Q0 = new y11(this, 20);
    public final fi1 S0 = new fi1(this, 12);
    public final fi1 T0 = new fi1(this, 13);
    public float f43686f1 = 1.0f;

    public wi1(int i10) {
        this.f43670a = i10;
        this.f43676c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f43703q0 = -1;
        this.f43702p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(wi1 wi1Var) {
        wi1 wi1Var2;
        if (wi1Var.f43688g1) {
            wi1Var.f43688g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            wi1Var.f43692i1 = ofFloat;
            wi1Var2 = wi1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x(wi1Var2, wi1Var.f43686f1, wi1Var.Y0, wi1Var.Z0, 1));
            wi1Var2.f43692i1.addListener(new ki1(wi1Var2, 0));
            wi1Var2.f43692i1.setDuration(350L);
            wi1Var2.f43692i1.setInterpolator(org.telegram.ui.Components.is.f27443f);
            wi1Var2.f43692i1.start();
        } else {
            wi1Var2 = wi1Var;
        }
        wi1Var2.f43690h1 = false;
        wi1Var2.f43672a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        wi1 wi1Var = f43669n1;
        if (wi1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    wi1Var.f43709u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    wi1Var.q(new t21(4));
                } else if (!wi1Var.f43673b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.f2.h(wi1Var.f43673b, new fi1(wi1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    wi1Var.f43709u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    wi1Var.B();
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
        wi1 wi1Var = f43669n1;
        if (wi1Var != null && wi1Var.f43709u0.getParent() == null) {
            wi1 wi1Var2 = f43669n1;
            if (wi1Var2 != null) {
                wi1Var2.f43677c0.d.release();
                f43669n1.f43679d0.d.release();
                f43669n1.f43674b0.release();
                oi1 oi1Var = f43669n1.f43709u0;
                if (oi1Var != null) {
                    oi1Var.d();
                }
                f43669n1.k();
            }
            f43669n1 = null;
        }
        if (f43669n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                wi1 wi1Var3 = new wi1(i10);
                wi1Var3.f43673b = activity;
                f43669n1 = wi1Var3;
                oi1 oi1Var2 = new oi1(activity, !z10, wi1Var3);
                f43669n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f43669n1.getClass();
                oi1Var2.setLockOnScreen(f43669n1.J0);
                wi1Var3.f43709u0 = oi1Var2;
                di1 di1Var = new di1(wi1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f46810a;
                r0.a0.i(oi1Var2, di1Var);
                ((WindowManager) activity.getSystemService("window")).addView(oi1Var2, org.telegram.ui.Components.voip.w2.a());
                wi1Var3.f43708t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                wi1Var3.f43712w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                ri1 ri1Var = new ri1(wi1Var3, activity);
                ri1Var.setClipToPadding(false);
                ri1Var.setClipChildren(false);
                ri1Var.setBackgroundColor(-16777216);
                wi1Var3.F();
                wi1Var3.f43706s = ri1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.q1 q1Var = wi1Var3.f43704r;
                wi1Var3.v = new org.telegram.ui.Components.voip.c3(activity, z11, q1Var);
                org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity, false, true, false, false);
                wi1Var3.f43677c0 = s2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                s2Var.d.setScalingType(scalingType);
                wi1Var3.f43677c0.d.setEnableHardwareScaler(true);
                wi1Var3.f43677c0.d.setRotateTextureWithScreen(true);
                wi1Var3.f43677c0.f32276a0 = 1;
                ri1Var.addView(wi1Var3.v, w7.x5.d(-1.0f, -1));
                TLRPC.User user = wi1Var3.d;
                org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity, user, q1Var);
                wi1Var3.f43711w = z2Var;
                ri1Var.addView(z2Var, w7.x5.d(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.i6.f20738a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f31994a = new org.telegram.ui.Components.ex0(0);
                    }
                }
                wi1Var3.f43713x = view;
                ri1Var.addView((View) view, w7.x5.d(220.0f, -1));
                ri1Var.addView(wi1Var3.f43677c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.x9(orientation, new int[]{-14994098, -14328963}).f(l2.f.s(0.5f, 1), new fd1(wi1Var3, 1), 0L);
                org.telegram.ui.Components.voip.u1 u1Var = new org.telegram.ui.Components.voip.u1(activity);
                wi1Var3.Y = u1Var;
                u1Var.setDelegate(new di1(wi1Var3, 3));
                wi1Var3.Y.d(1.0f, 1.0f);
                wi1Var3.f43671a0 = true;
                org.telegram.ui.Components.voip.s2 s2Var2 = new org.telegram.ui.Components.voip.s2(activity, true, false);
                wi1Var3.f43679d0 = s2Var2;
                s2Var2.d.setIsCamera(true);
                wi1Var3.f43679d0.d.setUseCameraRotation(true);
                wi1Var3.Y.setOnTapListener(new gi1(wi1Var3, 1));
                wi1Var3.f43679d0.d.setMirror(true);
                wi1Var3.Y.addView(wi1Var3.f43679d0);
                org.telegram.ui.Components.voip.u1 u1Var2 = new org.telegram.ui.Components.voip.u1(activity);
                wi1Var3.Z = u1Var2;
                u1Var2.S = true;
                u1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                wi1Var3.f43674b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                wi1Var3.f43674b0.setIsCamera(false);
                wi1Var3.f43674b0.setFpsReduction(30.0f);
                wi1Var3.f43674b0.setScalingType(scalingType);
                wi1Var3.Z.addView(wi1Var3.f43674b0, w7.x5.e(-1, -2, 17));
                wi1Var3.Z.setOnTapListener(new gi1(wi1Var3, 2));
                wi1Var3.Z.setVisibility(8);
                ri1Var.addView(wi1Var3.Y, w7.x5.d(-2.0f, -2));
                ri1Var.addView(wi1Var3.Z);
                View view2 = new View(activity);
                wi1Var3.f43689h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                ri1Var.addView(wi1Var3.f43689h0, w7.x5.e(-1, 160, 80));
                View view3 = new View(activity);
                wi1Var3.f43691i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                ri1Var.addView(wi1Var3.f43691i0, w7.x5.e(-1, 160, 48));
                dc1 dc1Var = new dc1(wi1Var3, activity, 16);
                wi1Var3.N = dc1Var;
                dc1Var.setOrientation(0);
                wi1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                wi1Var3.N.setClipToPadding(false);
                wi1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                wi1Var3.N.setOnClickListener(new gi1(wi1Var3, 3));
                wi1Var3.P = new org.telegram.ui.Components.voip.q0(activity, q1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                wi1Var3.O = frameLayout;
                frameLayout.addView(wi1Var3.P, w7.x5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -2, 3));
                wi1Var3.O.setVisibility(8);
                wi1Var3.O.setOnClickListener(new gi1(wi1Var3, 4));
                ci.w5 w5Var = new ci.w5(activity, q1Var);
                wi1Var3.R = w5Var;
                w5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                wi1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                wi1Var3.S.setTextSize(1, 15.0f);
                wi1Var3.S.setTypeface(AndroidUtilities.bold());
                wi1Var3.S.setTextColor(-1);
                wi1Var3.S.setGravity(17);
                tk tkVar = new tk(wi1Var3, activity, 5);
                wi1Var3.T = tkVar;
                tkVar.setTextSize(1, 15.0f);
                wi1Var3.T.setTextColor(-1);
                wi1Var3.T.setGravity(17);
                wi1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), wi1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                wi1Var3.R.setVisibility(8);
                wi1Var3.R.addView(wi1Var3.S);
                wi1Var3.R.addView(wi1Var3.T, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                wi1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
                    org.telegram.ui.Components.y9[] y9VarArr = wi1Var3.V;
                    y9VarArr[i15] = y9Var;
                    y9VarArr[i15].getImageReceiver().setAspectFit(true);
                    dc1 dc1Var2 = wi1Var3.N;
                    org.telegram.ui.Components.y9 y9Var2 = y9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    dc1Var2.addView(y9Var2, w7.x5.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                si1 si1Var = new si1(wi1Var3, activity);
                wi1Var3.X = si1Var;
                si1Var.setOrientation(1);
                wi1Var3.X.setFocusable(true);
                wi1Var3.X.setFocusableInTouchMode(true);
                wi1Var3.f43715y = new org.telegram.ui.Components.voip.t0(activity);
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.e6) null);
                j9Var.r(user);
                org.telegram.ui.Components.voip.t0 t0Var = wi1Var3.f43715y;
                int i16 = wi1Var3.f43670a;
                t0Var.f32304b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, j9Var, user);
                wi1Var3.f43715y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                wi1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                wi1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), wi1Var3.E.getPaint().getFontMetricsInt(), false));
                wi1Var3.E.setMaxLines(2);
                wi1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                wi1Var3.E.setTextColor(-1);
                wi1Var3.E.setGravity(1);
                wi1Var3.E.setImportantForAccessibility(2);
                wi1Var3.X.addView(wi1Var3.E, w7.x5.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f32228a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f32228a[i17] = new TextView(activity);
                    frameLayout2.f32228a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f32228a[i17].setTextColor(-1);
                    frameLayout2.f32228a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f32228a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f32230c = frameLayout3;
                org.telegram.ui.Components.voip.n2 n2Var = new org.telegram.ui.Components.voip.n2(frameLayout2, activity, q1Var);
                n2Var.setTextSize(1, 15.0f);
                n2Var.setTextColor(-1);
                n2Var.setGravity(1);
                n2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                n2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(n2Var, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.x5.a(-2.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(activity);
                frameLayout2.f32229b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.x5.a(-2.0f, 0.0f, 22.0f, 0.0f, 0.0f, -1, 0));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new hg.x1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity);
                frameLayout2.d = t2Var;
                frameLayout2.addView(t2Var, w7.x5.d(-2.0f, -1));
                wi1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f46810a;
                frameLayout2.setImportantForAccessibility(4);
                wi1Var3.X.addView(wi1Var3.F, w7.x5.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    vi1 vi1Var = new vi1(activity);
                    wi1Var3.G = vi1Var;
                    long j3 = sharedState.getUser().f20189id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        vi1Var.setVisibility(8);
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
                        org.telegram.ui.Components.l9 l9Var = vi1Var.f42921b;
                        l9Var.k(min);
                        int i20 = 0;
                        while (i20 < min) {
                            l9Var.l(i20, MessagesController.getInstance(i16).getUserOrChat(DialogObject.getPeerDialogId(groupParticipants.get(i20).peer)), i16);
                            i20++;
                            j3 = j3;
                        }
                        long j10 = j3;
                        l9Var.b(false, true);
                        if (max == 1 && (groupParticipants == null || groupParticipants.size() == 0 || (groupParticipants.size() == 1 && DialogObject.getPeerDialogId(groupParticipants.get(0).peer) == j10))) {
                            vi1Var.setVisibility(8);
                        } else {
                            vi1Var.f42922c = new org.telegram.ui.Components.m11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            vi1Var.setVisibility(0);
                            vi1Var.invalidate();
                        }
                    }
                    wi1Var3.X.addView(wi1Var3.G, w7.x5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                wi1Var3.X.setClipChildren(false);
                wi1Var3.X.setClipToPadding(false);
                wi1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                wi1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                wi1Var3.Q = new org.telegram.ui.Components.voip.o1(activity, q1Var);
                wi1Var3.U.setAlpha(0.0f);
                wi1Var3.Q.setVisibility(8);
                ri1Var.addView(wi1Var3.f43715y, w7.x5.a(204.0f, 0.0f, 93.0f, 0.0f, 0.0f, 204, 1));
                ri1Var.addView(wi1Var3.X, w7.x5.a(-2.0f, 0.0f, 135.0f, 0.0f, 0.0f, -1, 0));
                ri1Var.addView(wi1Var3.O, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                ri1Var.addView(wi1Var3.R, w7.x5.a(-2.0f, 0.0f, 118.0f, 0.0f, 0.0f, 304, 49));
                ri1Var.addView(wi1Var3.N, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                ri1Var.addView(wi1Var3.U, w7.x5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 5));
                ri1Var.addView(wi1Var3.Q, w7.x5.a(-2.0f, 0.0f, 380.0f, 0.0f, 0.0f, -1, 3));
                wi1Var3.f43693j0 = new org.telegram.ui.Components.voip.r1(activity);
                wi1Var3.f43681e = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                wi1Var3.f43684f = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                wi1Var3.h = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                wi1Var3.f43699n = new org.telegram.ui.Components.voip.v2(activity, 52.0f);
                wi1Var3.f43681e.setTranslationY(AndroidUtilities.dp(100.0f));
                wi1Var3.f43681e.setScaleX(0.0f);
                wi1Var3.f43681e.setScaleY(0.0f);
                wi1Var3.f43681e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                wi1Var3.f43684f.setTranslationY(AndroidUtilities.dp(100.0f));
                wi1Var3.f43684f.setScaleX(0.0f);
                wi1Var3.f43684f.setScaleY(0.0f);
                wi1Var3.f43684f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                wi1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                wi1Var3.h.setScaleX(0.0f);
                wi1Var3.h.setScaleY(0.0f);
                wi1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                wi1Var3.f43699n.setTranslationY(AndroidUtilities.dp(100.0f));
                wi1Var3.f43699n.setScaleX(0.0f);
                wi1Var3.f43699n.setScaleY(0.0f);
                wi1Var3.f43699n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                wi1Var3.f43693j0.addView(wi1Var3.f43681e);
                wi1Var3.f43693j0.addView(wi1Var3.f43684f);
                wi1Var3.f43693j0.addView(wi1Var3.h);
                wi1Var3.f43693j0.addView(wi1Var3.f43699n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                wi1Var3.f43682e0 = eVar;
                eVar.setListener(new ui1(wi1Var3));
                wi1Var3.f43682e0.setScaleX(1.15f);
                wi1Var3.f43682e0.setScaleY(1.15f);
                ri1Var.addView(wi1Var3.f43693j0, w7.x5.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                ri1Var.addView(wi1Var3.f43682e0, w7.x5.a(186.0f, f10, 0.0f, f10, 0.0f, -1, 80));
                ImageView imageView = new ImageView(activity);
                wi1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(-1, 76), 1, -1));
                wi1Var3.I.setImageResource(R.drawable.msg_addcontact);
                wi1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ri1Var.addView(wi1Var3.I, w7.x5.e(56, 56, 53));
                w7.z5.a(wi1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                wi1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(-1, 76), 1, -1));
                wi1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                wi1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                wi1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                ri1Var.addView(wi1Var3.H, w7.x5.e(56, 56, 51));
                w7.z5.a(wi1Var3.H);
                hg.l lVar = new hg.l(activity, 5);
                wi1Var3.K = lVar;
                lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                wi1Var3.K.setBackground(org.telegram.ui.ActionBar.i6.g0(i0.a.k(-1, 76), 1, -1));
                wi1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                ri1Var.addView(wi1Var3.K, w7.x5.a(56.0f, 0.0f, 56.0f, 0.0f, 0.0f, 56, 53));
                wi1Var3.K.setAlpha(0.0f);
                wi1Var3.K.setOnClickListener(new gi1(wi1Var3, 5));
                wi1Var3.H.setOnClickListener(new gi1(wi1Var3, 6));
                wi1Var3.I.setOnClickListener(new vy0(10, wi1Var3, activity));
                if (wi1Var3.f43709u0.f32413b) {
                    wi1Var3.H.setVisibility(8);
                    wi1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f32035a = new HashMap();
                linearLayout.f32036b = new ArrayList();
                linearLayout.f32037c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f32041r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f32040n = q1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.n0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                wi1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                wi1Var3.M0.setOnViewsUpdated(new fi1(wi1Var3, 5));
                ri1Var.addView(wi1Var3.M0, w7.x5.a(200.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 80));
                org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity, 3, q1Var, true);
                d3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                d3Var.K = alignment;
                d3Var.d = -1L;
                d3Var.f4918l0 = new fi1(wi1Var3, 6);
                d3Var.T = true;
                d3Var.h = AndroidUtilities.dp(320.0f);
                d3Var.f4909e = true;
                d3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var.q(8.0f);
                wi1Var3.N0 = d3Var;
                d3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                ri1Var.addView(wi1Var3.N0, w7.x5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 80));
                org.telegram.ui.Components.voip.d3 d3Var2 = new org.telegram.ui.Components.voip.d3(activity, 1, q1Var, false);
                d3Var2.p(true);
                d3Var2.K = alignment;
                d3Var2.d = 4000L;
                d3Var2.T = true;
                d3Var2.h = AndroidUtilities.dp(320.0f);
                d3Var2.f4909e = true;
                d3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var2.q(8.0f);
                wi1Var3.O0 = d3Var2;
                d3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ri1Var.addView(wi1Var3.O0, w7.x5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                wi1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!wi1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        wi1Var3.U0 = z12;
                    }
                    wi1Var3.n();
                }
                oi1Var2.addView(ri1Var);
                if (z10) {
                    wi1Var3.F0 = 0.0f;
                    wi1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        wi1Var3.f43677c0.setStub(org.telegram.ui.Components.voip.m2.k().f32161s);
                        wi1Var3.f43679d0.setStub(org.telegram.ui.Components.voip.m2.k().f32160r);
                    }
                    wi1Var3.f43709u0.setAlpha(0.0f);
                    wi1Var3.G();
                    wi1Var3.E0 = true;
                    org.telegram.ui.Components.voip.m2.U = true;
                    if (org.telegram.ui.Components.voip.m2.W == null) {
                        wi1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new fi1(wi1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.m2.V.getClass();
                        throw null;
                    }
                } else {
                    wi1Var3.F0 = 1.0f;
                    wi1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && tf.c.a(activity) == 1) {
                    wi1 wi1Var4 = f43669n1;
                    qf.d dVar = new qf.d(activity, wi1Var4);
                    dVar.f46197c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.s2 s2Var3 = wi1Var4.f43677c0;
                    dVar.f46202j = s2Var3.d;
                    dVar.f46203k = s2Var3.getPlaceholderView();
                    wi1Var4.f43687g0 = dVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            fi1 fi1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(fi1Var);
            this.R0 = false;
            if (this.f43717z0 && this.f43714x0) {
                AndroidUtilities.runOnUIThread(fi1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f43712w0.isTouchExplorationEnabled()) {
                if (!this.f43700n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f43706s.announceForAccessibility(string);
            }
            if (!this.f43700n0) {
                if (this.f43701o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f43709u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f43684f.getLocationOnScreen(iArr);
                    pi1 pi1Var = new pi1(this, this.f43706s.getContext(), iArr[0], iArr[1]);
                    this.f43701o0 = pi1Var;
                    WindowInsets windowInsets = this.f43705r0;
                    if (windowInsets != null) {
                        pi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f43706s.addView(this.f43701o0);
                    return;
                }
                return;
            }
            this.f43679d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f43703q0 = this.f43702p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.n0(4).setDuration(250L);
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27443f;
                transitionSet.addTransition(duration.setInterpolator(isVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(isVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.v2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.k3.class, true);
                TransitionManager.beginDelayedTransition(this.f43693j0, transitionSet);
            }
            int i10 = this.f43702p0;
            if (i10 == 11) {
                this.f43681e.setVisibility(8);
                this.f43684f.setVisibility(8);
                this.h.setVisibility(8);
                this.f43699n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f43669n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f43700n0 || this.m0)) {
                    r(this.f43681e, sharedInstance);
                    if (this.f43714x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.f43681e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f43684f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f43699n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f43699n.setOnClickListener(new gi1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f43700n0 || this.m0)) {
                        r(this.f43681e, sharedInstance);
                        if (this.f43714x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.f43681e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f43684f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.f43681e.setVisibility(8);
                    this.f43684f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f43699n.setVisibility(8);
            }
            if (this.f43681e.getVisibility() == 0) {
                this.f43681e.f32101f = 0;
                i11 = 16;
            }
            if (this.f43684f.getVisibility() == 0) {
                this.f43684f.f32101f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f32101f = i11;
                i11 += 16;
            }
            if (this.f43699n.getVisibility() == 0) {
                this.f43699n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi1.D(boolean):void");
    }

    public final void E() {
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

    public final void F() {
        this.f43695k0.setColor(i0.a.k(-16777216, (int) (this.f43716y0 * 102.0f * this.F0)));
        this.f43697l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        ri1 ri1Var = this.f43706s;
        if (ri1Var != null) {
            ri1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.wi1.G():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.s2 s2Var = this.f43677c0;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        this.f43698m1 = true;
        G();
        ((WindowManager) this.f43673b.getSystemService("window")).removeView(this.f43709u0);
        this.f43709u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        oi1 oi1Var = this.f43709u0;
        oi1Var.getClass();
        ((WindowManager) this.f43673b.getSystemService("window")).addView(oi1Var, org.telegram.ui.Components.voip.w2.a());
        this.f43698m1 = false;
        G();
        this.f43709u0.invalidate();
        org.telegram.ui.Components.voip.s2 s2Var = this.f43696k1;
        if (s2Var != null) {
            s2Var.d.release();
            this.f43696k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.s2 s2Var = this.f43696k1;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f43696k1.d.getBitmap();
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
            if (this.f43702p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f43679d0.d.release();
                this.f43677c0.d.release();
                this.f43674b0.release();
                n();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f43709u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f43715y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f43685f0 = booleanValue;
            if (booleanValue) {
                this.f43715y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.s2 s2Var = this.f43677c0;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f43677c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(this.f43673b, false, true, false, false);
        this.f43696k1 = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f43696k1.d.setEnableHardwareScaler(true);
        this.f43696k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.s2 s2Var2 = this.f43696k1;
        s2Var2.f32276a0 = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new qi1(this));
        View view = this.f43696k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f43696k1;
    }

    public final ValueAnimator j(boolean z10) {
        char c10;
        float measuredHeight;
        final float f7;
        final float f10;
        final boolean z11;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        this.Y.animate().cancel();
        float f19 = org.telegram.ui.Components.voip.m2.k().d.x + org.telegram.ui.Components.voip.m2.k().E;
        float f20 = org.telegram.ui.Components.voip.m2.k().d.y + org.telegram.ui.Components.voip.m2.k().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.m2.V.getClass();
        final float measuredWidth = f19 - ((this.f43677c0.getMeasuredWidth() - (this.f43677c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f43677c0.getMeasuredHeight() - (this.f43677c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (this.f43700n0 && measuredWidth2 != 0) {
                f18 = (this.f43709u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f17 = (((org.telegram.ui.Components.voip.m2.k().f32158f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().f32158f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.m2.k().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                z11 = true;
            } else {
                c10 = 0;
                measuredHeight = 1.0f;
                f17 = 1.0f;
                z11 = false;
                f18 = 0.0f;
            }
            float f22 = f18;
            f7 = f17;
            f10 = f22;
        } else {
            c10 = 0;
            float measuredWidth3 = f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * 0.25f)) / 2.0f);
            measuredHeight = f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * 0.25f)) / 2.0f);
            f7 = measuredWidth3;
            f10 = 0.25f;
            z11 = true;
        }
        final float f23 = measuredHeight;
        if (this.m0) {
            f11 = AndroidUtilities.dp(4.0f);
        } else {
            f11 = 0.0f;
        }
        final float dp = (AndroidUtilities.dp(4.0f) * 1.0f) / f10;
        if (this.m0) {
            org.telegram.ui.Components.voip.m2.V.getClass();
            f12 = 1.0f;
            f21 = 0.0f;
        } else {
            f12 = 1.0f;
        }
        float f24 = f12;
        if (z10) {
            if (z11) {
                this.Y.setScaleX(f10);
                this.Y.setScaleY(f10);
                this.Y.setTranslationX(f7);
                this.Y.setTranslationY(f23);
                this.Y.setCornerRadius(dp);
                this.Y.setAlpha(f21);
            }
            this.f43677c0.setScaleX(0.25f);
            this.f43677c0.setScaleY(0.25f);
            this.f43677c0.setTranslationX(measuredWidth);
            this.f43677c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f43677c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f24) / 0.25f);
        } else {
            f13 = 0.25f;
        }
        if (z10) {
            f14 = f24;
        } else {
            f14 = 0.0f;
        }
        if (z10) {
            f15 = 0.0f;
        } else {
            f15 = f24;
        }
        float[] fArr = new float[2];
        fArr[c10] = f14;
        fArr[1] = f15;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(fArr);
        if (z10) {
            f16 = 0.0f;
        } else {
            f16 = f24;
        }
        this.F0 = f16;
        F();
        final float f25 = f11;
        final float f26 = f13;
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f27 = 1.0f - floatValue;
                wi1 wi1Var = wi1.this;
                wi1Var.F0 = f27;
                wi1Var.F();
                if (z11) {
                    float f28 = (f10 * floatValue) + (scaleX * f27);
                    wi1Var.Y.setScaleX(f28);
                    wi1Var.Y.setScaleY(f28);
                    wi1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f27));
                    wi1Var.Y.setTranslationY((f23 * floatValue) + (y3 * f27));
                    wi1Var.Y.setCornerRadius((dp * floatValue) + (f25 * f27));
                    wi1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f27));
                }
                float f29 = (f26 * floatValue) + (1.0f * f27);
                wi1Var.f43677c0.setScaleX(f29);
                wi1Var.f43677c0.setScaleY(f29);
                float f30 = 0.0f * f27;
                float f31 = (measuredWidth * floatValue) + f30;
                float f32 = (measuredHeight2 * floatValue) + f30;
                wi1Var.f43677c0.setTranslationX(f31);
                wi1Var.f43677c0.setTranslationY(f32);
                wi1Var.f43677c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f29);
                if (!wi1Var.Y.P) {
                    wi1Var.f43679d0.d(floatValue, false);
                }
                wi1Var.f43709u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f43670a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        qf.e eVar = this.f43687g0;
        if (eVar != null) {
            eVar.c();
            this.f43687g0 = null;
        }
        tg.m1 m1Var = this.M;
        if (m1Var != null) {
            m1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f43714x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.z2 z2Var = this.f43711w;
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
                z2Var.f32470c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y2(z2Var, 1));
                z2Var.f32470c.setInterpolator(org.telegram.ui.Components.is.f27443f);
                z2Var.f32470c.setDuration(200L);
                z2Var.f32470c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f43715y.getVisibility() == 0) {
                    this.f43715y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.is.f27443f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.is.f27444g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27443f;
                org.telegram.messenger.bi.t(translationY, isVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new ki1(this, 3)).setInterpolator(isVar).start();
            } else {
                if (this.f43715y.getVisibility() == 0) {
                    this.f43715y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.is.f27443f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.is isVar2 = org.telegram.ui.Components.is.f27443f;
                duration.setInterpolator(isVar2).setListener(new org.telegram.ui.Components.fa(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(isVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new ki1(this, 4)).setDuration(250L).setInterpolator(isVar2).start();
            }
            this.f43703q0 = this.f43702p0;
            G();
        }
    }

    public final void m() {
        this.f43709u0.b();
    }

    public final void n() {
        this.f43679d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new li1(this));
        this.f43677c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new mi1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f43674b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (!this.G0 && !this.E0) {
            pi1 pi1Var = this.f43701o0;
            if (pi1Var != null) {
                pi1Var.a(false, false);
            } else if (this.m0 && this.f43700n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f43671a0 = false;
                this.f43703q0 = this.f43702p0;
                G();
            } else if (this.C0) {
                l(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (tf.c.a(this.f43673b) > 0) {
                        if (!this.G0 && f43669n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f43669n1.f43709u0.getMeasuredHeight();
                                wi1 wi1Var = f43669n1;
                                org.telegram.ui.Components.voip.m2.l(wi1Var.f43673b, wi1Var.f43670a, wi1Var.f43709u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f43669n1.f43705r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.m2.X = windowInsets.getSystemWindowInsetTop();
                                    f43669n1.f43705r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.m2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27443f;
                                duration.setInterpolator(isVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
                                this.f43693j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(isVar).start();
                                this.f43689h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(isVar).start();
                                this.f43691i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(isVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(isVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(isVar).start();
                                org.telegram.ui.Components.voip.m2.U = true;
                                this.E0 = true;
                                ValueAnimator j3 = j(false);
                                this.L0.lock();
                                j3.addListener(new ki1(this, 1));
                                j3.setDuration(350L);
                                j3.setInterpolator(isVar);
                                j3.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.g5.A(this.f43673b, new di1(this, 0), true).o();
                    return;
                }
                this.f43709u0.b();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.w0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f43703q0 = this.f43702p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f43703q0 = this.f43702p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f43687g0 == null && tf.c.a(this.f43673b) == 1) {
                qf.d dVar = new qf.d(this.f43673b, f43669n1);
                dVar.f46197c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.s2 s2Var = this.f43677c0;
                dVar.f46202j = s2Var.d;
                dVar.f46203k = s2Var.getPlaceholderView();
                this.f43687g0 = dVar.a();
            }
        } else {
            qf.e eVar = this.f43687g0;
            if (eVar != null) {
                eVar.c();
                this.f43687g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.c3 c3Var;
        if (i10 > 0) {
            this.f43694j1 = true;
        }
        if (this.F != null && (c3Var = this.v) != null) {
            int i11 = c3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f43694j1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.nd(this, i10, 29), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f43702p0;
        if (i11 != i10) {
            this.f43703q0 = i11;
            this.f43702p0 = i10;
            if (this.f43709u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f43703q0 = this.f43702p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f43684f.getVisibility() == 0) {
            this.f43682e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f43682e0;
            ValueAnimator valueAnimator = eVar.f31974b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f31974b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f43699n.animate().cancel();
        this.f43681e.animate().cancel();
        this.h.animate().cancel();
        this.f43684f.animate().cancel();
        this.f43682e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f43682e0;
        ValueAnimator valueAnimator2 = eVar2.f31974b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f31974b0 = null;
            eVar2.U.stop();
        }
        this.f43699n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.f43681e.d(5, false, false);
        this.h.d(1, false, false);
        this.f43684f.d(3, true, false);
        this.f43699n.setVisibility(0);
        this.f43681e.setVisibility(0);
        this.h.setVisibility(0);
        this.f43684f.setVisibility(0);
        this.f43699n.setAlpha(0.0f);
        this.f43681e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f43684f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43682e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                wi1 wi1Var = wi1.this;
                wi1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                wi1Var.f43682e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                wi1Var.f43682e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f43682e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f43682e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f43682e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f43682e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.vl0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new fi1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        if (!this.f43700n0) {
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
        k3Var.setOnBtnClickedListener(new a7(this, voIPService, k3Var, 23));
    }

    public final void s(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        k3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.u1 u1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = u1Var.f32365f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            u1Var.K = f7;
            u1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = u1Var.f32365f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = u1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            u1Var.f32365f0 = ofFloat;
            ofFloat.addUpdateListener(u1Var.f32366g0);
            u1Var.f32365f0.setDuration(150L);
            u1Var.f32365f0.start();
        }
        k3Var.setOnBtnClickedListener(new di1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            k3Var.d(4, false, false);
            i11 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            k3Var.d(5, true, false);
        } else {
            k3Var.d(5, false, false);
            i10 = 1;
            k3Var.setEnabled(true);
            k3Var.setOnBtnClickedListener(new ea(this, i10, k3Var, voIPService, 8));
        }
        i10 = i11;
        k3Var.setEnabled(true);
        k3Var.setOnBtnClickedListener(new ea(this, i10, k3Var, voIPService, 8));
    }

    public final void u(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f43700n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f43700n0) {
                if (voIPService.isScreencast()) {
                    k3Var.d(3, false, z10);
                } else {
                    k3Var.d(3, false, z10);
                }
            } else {
                k3Var.d(3, true, z10);
            }
            k3Var.setOnBtnClickedListener(new di1(this, 6));
            k3Var.setEnabled(true);
            return;
        }
        k3Var.d(3, true, false);
        k3Var.setOnClickListener(null);
        k3Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f43700n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f43715y.getTag() == null) {
                this.f43715y.animate().setListener(null).cancel();
                this.f43715y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f43715y.setAlpha(0.0f);
                        this.f43715y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.is.f27443f).start();
                    } else {
                        this.f43715y.setAlpha(0.0f);
                        this.f43715y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f43715y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.is.f27443f).start();
                    }
                } else if (z11) {
                    this.f43715y.setAlpha(0.0f);
                    this.f43715y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f43715y.setScaleX(0.1f);
                    this.f43715y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f43715y.getTag() != null) {
                this.f43715y.animate().setListener(null).cancel();
                this.f43715y.setTranslationY(0.0f);
                this.f43715y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.is.f27443f).setListener(new ki1(this, 7)).start();
            }
        } else {
            this.f43715y.animate().setListener(null).cancel();
            this.f43715y.setTranslationY(0.0f);
            this.f43715y.setAlpha(1.0f);
            this.f43715y.setScaleX(1.0f);
            this.f43715y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.t0 t0Var = this.f43715y;
            if (!z12) {
                i10 = 8;
            }
            t0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.t0 t0Var2 = this.f43715y;
        if (z12) {
            num = 1;
        }
        t0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f43673b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(this.f43673b, 0, null);
        boolean[] zArr = new boolean[3];
        b2Var.R = LocaleController.getString(R.string.VoipFailed);
        b2Var.T = charSequence;
        b2Var.f20429l0 = LocaleController.getString(R.string.OK);
        b2Var.m0 = null;
        b2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) b2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(b2Var.e(org.telegram.ui.ActionBar.i6.f21041q7));
            }
        }
        b2Var.setCanceledOnTouchOutside(true);
        b2Var.setOnDismissListener(new r5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f43714x0);
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
                    animatorSet3.addListener(new ki1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.is.f27443f);
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
                if (u1Var4.f32375y < 0.0f) {
                    u1Var4.d(1.0f, 1.0f);
                    this.f43671a0 = true;
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
            this.f43671a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        y11 y11Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f43714x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.is isVar = org.telegram.ui.Components.is.f27443f;
            duration.setInterpolator(isVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(isVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(isVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(isVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(isVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(isVar).start();
            this.f43693j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(isVar).start();
            this.f43689h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
            this.f43691i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(isVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f43716y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(y11Var);
            this.P0.setDuration(150L).setInterpolator(isVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f43693j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f43714x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.is isVar2 = org.telegram.ui.Components.is.f27443f;
                translationY.setInterpolator(isVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(isVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar2).start();
                this.f43693j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(isVar2).start();
                this.f43689h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar2).start();
                this.f43691i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(isVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f43716y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(y11Var);
                this.P0.setDuration(150L).setInterpolator(isVar2);
                this.P0.start();
                this.f43693j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f43714x0 = z10;
        oi1 oi1Var = this.f43709u0;
        if (!z10) {
            oi1Var.setSystemUiVisibility(oi1Var.getSystemUiVisibility() | 4);
        } else {
            oi1Var.setSystemUiVisibility(oi1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f43714x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.is.f27443f).start();
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}
