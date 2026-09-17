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
public final class ti1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, rf.a {
    public static ti1 f37755n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.p2 F;
    public float F0;
    public si1 G;
    public boolean G0;
    public ImageView H;
    public boolean H0;
    public ImageView I;
    public boolean I0;
    public int J;
    public boolean J0;
    public hg.k K;
    public long K0;
    public int L;
    public tg.n1 M;
    public org.telegram.ui.Components.voip.h2 M0;
    public dc1 N;
    public org.telegram.ui.Components.voip.d3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.d3 O0;
    public org.telegram.ui.Components.voip.q0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.o1 Q;
    public ci.x5 R;
    public boolean R0;
    public TextView S;
    public tk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public pi1 X;
    public float X0;
    public org.telegram.ui.Components.voip.u1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.u1 Z;
    public float Z0;
    public final int f37756a;
    public boolean f37757a0;
    public boolean f37758a1;
    public Activity f37759b;
    public TextureViewRenderer f37760b0;
    public float f37761b1;
    public final TLRPC.User f37762c;
    public org.telegram.ui.Components.voip.s2 f37763c0;
    public float f37764c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.s2 f37765d0;
    public int f37766d1;
    public org.telegram.ui.Components.voip.k3 e;
    public org.telegram.ui.Components.voip.e f37767e0;
    public int f37768e1;
    public org.telegram.ui.Components.voip.k3 f37769f;
    public boolean f37770f0;
    public pf.e f37772g0;
    public boolean f37773g1;
    public org.telegram.ui.Components.voip.k3 h;
    public View f37774h0;
    public boolean f37775h1;
    public View f37776i0;
    public ValueAnimator f37777i1;
    public org.telegram.ui.Components.voip.r1 f37778j0;
    public boolean f37779j1;
    public org.telegram.ui.Components.voip.s2 f37781k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f37783m1;
    public qi1 f37784n;
    public boolean f37785n0;
    public mi1 f37786o0;
    public int f37787p0;
    public int f37788q0;
    public WindowInsets f37790r0;
    public oi1 f37791s;
    public boolean f37792s0;
    public float f37793t0;
    public li1 f37794u0;
    public org.telegram.ui.Components.voip.c3 v;
    public int f37795v0;
    public org.telegram.ui.Components.voip.z2 f37796w;
    public AccessibilityManager f37797w0;
    public org.telegram.ui.Components.voip.e3 f37798x;
    public org.telegram.ui.Components.voip.t0 f37800y;
    public boolean f37802z0;
    public final org.telegram.ui.Components.voip.q1 f37789r = new org.telegram.ui.Components.voip.q1();
    public final org.telegram.ui.Components.u9[] V = new org.telegram.ui.Components.u9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f37780k0 = new Paint();
    public final Paint f37782l0 = new Paint();
    public boolean f37799x0 = true;
    public float f37801y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final k21 Q0 = new k21(this, 19);
    public final di1 S0 = new di1(this, 12);
    public final di1 T0 = new di1(this, 13);
    public float f37771f1 = 1.0f;

    public ti1(int i10) {
        this.f37756a = i10;
        this.f37762c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f37788q0 = -1;
        this.f37787p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(ti1 ti1Var) {
        AndroidUtilities.cancelRunOnUIThread(ti1Var.S0);
        ti1Var.R0 = false;
        if (Build.VERSION.SDK_INT >= 23 && ti1Var.f37759b.checkSelfPermission("android.permission.CAMERA") != 0) {
            ti1Var.f37759b.requestPermissions(new String[]{"android.permission.CAMERA"}, 102);
        } else {
            ti1Var.C();
        }
    }

    public static void j(ti1 ti1Var) {
        ti1 ti1Var2;
        if (ti1Var.f37773g1) {
            ti1Var.f37773g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            ti1Var.f37777i1 = ofFloat;
            ti1Var2 = ti1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.x(ti1Var2, ti1Var.f37771f1, ti1Var.Y0, ti1Var.Z0, 1));
            ti1Var2.f37777i1.addListener(new hi1(ti1Var2, 0));
            ti1Var2.f37777i1.setDuration(350L);
            ti1Var2.f37777i1.setInterpolator(org.telegram.ui.Components.qr.f27380f);
            ti1Var2.f37777i1.start();
        } else {
            ti1Var2 = ti1Var;
        }
        ti1Var2.f37775h1 = false;
        ti1Var2.f37758a1 = false;
    }

    public static void q(int i10, int[] iArr) {
        ti1 ti1Var = f37755n1;
        if (ti1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    ti1Var.f37794u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ti1Var.r(new p91(2));
                } else if (!ti1Var.f37759b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.f2.h(ti1Var.f37759b, new di1(ti1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    ti1Var.f37794u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    ti1Var.C();
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
        ti1 ti1Var = f37755n1;
        if (ti1Var != null && ti1Var.f37794u0.getParent() == null) {
            ti1 ti1Var2 = f37755n1;
            if (ti1Var2 != null) {
                ti1Var2.f37763c0.d.release();
                f37755n1.f37765d0.d.release();
                f37755n1.f37760b0.release();
                li1 li1Var = f37755n1.f37794u0;
                if (li1Var != null) {
                    li1Var.d();
                }
                f37755n1.l();
            }
            f37755n1 = null;
        }
        if (f37755n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.m2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                ti1 ti1Var3 = new ti1(i10);
                ti1Var3.f37759b = activity;
                f37755n1 = ti1Var3;
                li1 li1Var2 = new li1(activity, !z10, ti1Var3);
                f37755n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f37755n1.getClass();
                li1Var2.setLockOnScreen(f37755n1.J0);
                ti1Var3.f37794u0 = li1Var2;
                bi1 bi1Var = new bi1(ti1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f41865a;
                r0.a0.j(li1Var2, bi1Var);
                ((WindowManager) activity.getSystemService("window")).addView(li1Var2, org.telegram.ui.Components.voip.w2.a());
                ti1Var3.f37793t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                ti1Var3.f37797w0 = (AccessibilityManager) f0.e.f(activity, AccessibilityManager.class);
                oi1 oi1Var = new oi1(ti1Var3, activity);
                oi1Var.setClipToPadding(false);
                oi1Var.setClipChildren(false);
                oi1Var.setBackgroundColor(-16777216);
                ti1Var3.G();
                ti1Var3.f37791s = oi1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.q1 q1Var = ti1Var3.f37789r;
                ti1Var3.v = new org.telegram.ui.Components.voip.c3(activity, z11, q1Var);
                org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(activity, false, true, false, false);
                ti1Var3.f37763c0 = s2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                s2Var.d.setScalingType(scalingType);
                ti1Var3.f37763c0.d.setEnableHardwareScaler(true);
                ti1Var3.f37763c0.d.setRotateTextureWithScreen(true);
                ti1Var3.f37763c0.f29181a0 = 1;
                oi1Var.addView(ti1Var3.v, w7.x5.c(-1.0f, -1));
                TLRPC.User user = ti1Var3.d;
                org.telegram.ui.Components.voip.z2 z2Var = new org.telegram.ui.Components.voip.z2(activity, user, q1Var);
                ti1Var3.f37796w = z2Var;
                oi1Var.addView(z2Var, w7.x5.c(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.j6.f18799a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f28918a = new org.telegram.ui.Components.bw0(0);
                    }
                }
                ti1Var3.f37798x = view;
                oi1Var.addView((View) view, w7.x5.c(220.0f, -1));
                oi1Var.addView(ti1Var3.f37763c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.t9(orientation, new int[]{-14994098, -14328963}).f(k2.c0.m(0.5f, 1), new fd1(ti1Var3, 1), 0L);
                org.telegram.ui.Components.voip.u1 u1Var = new org.telegram.ui.Components.voip.u1(activity);
                ti1Var3.Y = u1Var;
                u1Var.setDelegate(new bi1(ti1Var3, 3));
                ti1Var3.Y.d(1.0f, 1.0f);
                ti1Var3.f37757a0 = true;
                org.telegram.ui.Components.voip.s2 s2Var2 = new org.telegram.ui.Components.voip.s2(activity, true, false);
                ti1Var3.f37765d0 = s2Var2;
                s2Var2.d.setIsCamera(true);
                ti1Var3.f37765d0.d.setUseCameraRotation(true);
                ti1Var3.Y.setOnTapListener(new ei1(ti1Var3, 1));
                ti1Var3.f37765d0.d.setMirror(true);
                ti1Var3.Y.addView(ti1Var3.f37765d0);
                org.telegram.ui.Components.voip.u1 u1Var2 = new org.telegram.ui.Components.voip.u1(activity);
                ti1Var3.Z = u1Var2;
                u1Var2.S = true;
                u1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                ti1Var3.f37760b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                ti1Var3.f37760b0.setIsCamera(false);
                ti1Var3.f37760b0.setFpsReduction(30.0f);
                ti1Var3.f37760b0.setScalingType(scalingType);
                ti1Var3.Z.addView(ti1Var3.f37760b0, w7.x5.e(-1, -2, 17));
                ti1Var3.Z.setOnTapListener(new ei1(ti1Var3, 2));
                ti1Var3.Z.setVisibility(8);
                oi1Var.addView(ti1Var3.Y, w7.x5.c(-2.0f, -2));
                oi1Var.addView(ti1Var3.Z);
                View view2 = new View(activity);
                ti1Var3.f37774h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                oi1Var.addView(ti1Var3.f37774h0, w7.x5.e(-1, 160, 80));
                View view3 = new View(activity);
                ti1Var3.f37776i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                oi1Var.addView(ti1Var3.f37776i0, w7.x5.e(-1, 160, 48));
                dc1 dc1Var = new dc1(ti1Var3, activity, 16);
                ti1Var3.N = dc1Var;
                dc1Var.setOrientation(0);
                ti1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                ti1Var3.N.setClipToPadding(false);
                ti1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                ti1Var3.N.setOnClickListener(new ei1(ti1Var3, 3));
                ti1Var3.P = new org.telegram.ui.Components.voip.q0(activity, q1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                ti1Var3.O = frameLayout;
                frameLayout.addView(ti1Var3.P, w7.x5.d(-2, -2.0f, 3, 0.0f, 16.0f, 0.0f, 0.0f));
                ti1Var3.O.setVisibility(8);
                ti1Var3.O.setOnClickListener(new ei1(ti1Var3, 4));
                ci.x5 x5Var = new ci.x5(activity, q1Var);
                ti1Var3.R = x5Var;
                x5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                ti1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                ti1Var3.S.setTextSize(1, 15.0f);
                ti1Var3.S.setTypeface(AndroidUtilities.bold());
                ti1Var3.S.setTextColor(-1);
                ti1Var3.S.setGravity(17);
                tk tkVar = new tk(ti1Var3, activity, 5);
                ti1Var3.T = tkVar;
                tkVar.setTextSize(1, 15.0f);
                ti1Var3.T.setTextColor(-1);
                ti1Var3.T.setGravity(17);
                ti1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), ti1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                ti1Var3.R.setVisibility(8);
                ti1Var3.R.addView(ti1Var3.S);
                ti1Var3.R.addView(ti1Var3.T, w7.x5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                ti1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(activity);
                    org.telegram.ui.Components.u9[] u9VarArr = ti1Var3.V;
                    u9VarArr[i15] = u9Var;
                    u9VarArr[i15].getImageReceiver().setAspectFit(true);
                    dc1 dc1Var2 = ti1Var3.N;
                    org.telegram.ui.Components.u9 u9Var2 = u9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    dc1Var2.addView(u9Var2, w7.x5.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                pi1 pi1Var = new pi1(ti1Var3, activity);
                ti1Var3.X = pi1Var;
                pi1Var.setOrientation(1);
                ti1Var3.X.setFocusable(true);
                ti1Var3.X.setFocusableInTouchMode(true);
                ti1Var3.f37800y = new org.telegram.ui.Components.voip.t0(activity);
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.f6) null);
                f9Var.r(user);
                org.telegram.ui.Components.voip.t0 t0Var = ti1Var3.f37800y;
                int i16 = ti1Var3.f37756a;
                t0Var.f29207b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, f9Var, user);
                ti1Var3.f37800y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                ti1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                ti1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), ti1Var3.E.getPaint().getFontMetricsInt(), false));
                ti1Var3.E.setMaxLines(2);
                ti1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                ti1Var3.E.setTextColor(-1);
                ti1Var3.E.setGravity(1);
                ti1Var3.E.setImportantForAccessibility(2);
                ti1Var3.X.addView(ti1Var3.E, w7.x5.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f29138a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f29138a[i17] = new TextView(activity);
                    frameLayout2.f29138a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f29138a[i17].setTextColor(-1);
                    frameLayout2.f29138a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f29138a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f29140c = frameLayout3;
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
                frameLayout2.f29139b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.x5.d(-1, -2.0f, 0, 0.0f, 22.0f, 0.0f, 0.0f));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new hg.w1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity);
                frameLayout2.d = t2Var;
                frameLayout2.addView(t2Var, w7.x5.c(-2.0f, -1));
                ti1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f41865a;
                frameLayout2.setImportantForAccessibility(4);
                ti1Var3.X.addView(ti1Var3.F, w7.x5.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    si1 si1Var = new si1(activity);
                    ti1Var3.G = si1Var;
                    long j3 = sharedState.getUser().f18268id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        si1Var.setVisibility(8);
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
                        org.telegram.ui.Components.h9 h9Var = si1Var.f37505b;
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
                            si1Var.setVisibility(8);
                        } else {
                            si1Var.f37506c = new org.telegram.ui.Components.h01(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            si1Var.setVisibility(0);
                            si1Var.invalidate();
                        }
                    }
                    ti1Var3.X.addView(ti1Var3.G, w7.x5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                ti1Var3.X.setClipChildren(false);
                ti1Var3.X.setClipToPadding(false);
                ti1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                ti1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                ti1Var3.Q = new org.telegram.ui.Components.voip.o1(activity, q1Var);
                ti1Var3.U.setAlpha(0.0f);
                ti1Var3.Q.setVisibility(8);
                oi1Var.addView(ti1Var3.f37800y, w7.x5.d(204, 204.0f, 1, 0.0f, 93.0f, 0.0f, 0.0f));
                oi1Var.addView(ti1Var3.X, w7.x5.d(-1, -2.0f, 0, 0.0f, 135.0f, 0.0f, 0.0f));
                oi1Var.addView(ti1Var3.O, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                oi1Var.addView(ti1Var3.R, w7.x5.d(304, -2.0f, 49, 0.0f, 118.0f, 0.0f, 0.0f));
                oi1Var.addView(ti1Var3.N, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                oi1Var.addView(ti1Var3.U, w7.x5.d(-1, 52.0f, 5, 0.0f, 0.0f, 0.0f, 0.0f));
                oi1Var.addView(ti1Var3.Q, w7.x5.d(-1, -2.0f, 3, 0.0f, 380.0f, 0.0f, 0.0f));
                ti1Var3.f37778j0 = new org.telegram.ui.Components.voip.r1(activity);
                ti1Var3.e = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                ti1Var3.f37769f = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                ti1Var3.h = new org.telegram.ui.Components.voip.k3(activity, q1Var);
                ti1Var3.f37784n = new org.telegram.ui.Components.voip.v2(activity, 52.0f);
                ti1Var3.e.setTranslationY(AndroidUtilities.dp(100.0f));
                ti1Var3.e.setScaleX(0.0f);
                ti1Var3.e.setScaleY(0.0f);
                ti1Var3.e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ti1Var3.f37769f.setTranslationY(AndroidUtilities.dp(100.0f));
                ti1Var3.f37769f.setScaleX(0.0f);
                ti1Var3.f37769f.setScaleY(0.0f);
                ti1Var3.f37769f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ti1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                ti1Var3.h.setScaleX(0.0f);
                ti1Var3.h.setScaleY(0.0f);
                ti1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ti1Var3.f37784n.setTranslationY(AndroidUtilities.dp(100.0f));
                ti1Var3.f37784n.setScaleX(0.0f);
                ti1Var3.f37784n.setScaleY(0.0f);
                ti1Var3.f37784n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                ti1Var3.f37778j0.addView(ti1Var3.e);
                ti1Var3.f37778j0.addView(ti1Var3.f37769f);
                ti1Var3.f37778j0.addView(ti1Var3.h);
                ti1Var3.f37778j0.addView(ti1Var3.f37784n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                ti1Var3.f37767e0 = eVar;
                eVar.setListener(new ri1(ti1Var3));
                ti1Var3.f37767e0.setScaleX(1.15f);
                ti1Var3.f37767e0.setScaleY(1.15f);
                oi1Var.addView(ti1Var3.f37778j0, w7.x5.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                oi1Var.addView(ti1Var3.f37767e0, w7.x5.d(-1, 186.0f, 80, f10, 0.0f, f10, 0.0f));
                ImageView imageView = new ImageView(activity);
                ti1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                ti1Var3.I.setImageResource(R.drawable.msg_addcontact);
                ti1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                oi1Var.addView(ti1Var3.I, w7.x5.e(56, 56, 53));
                w7.z5.a(ti1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                ti1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                ti1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                ti1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                ti1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                oi1Var.addView(ti1Var3.H, w7.x5.e(56, 56, 51));
                w7.z5.a(ti1Var3.H);
                hg.k kVar = new hg.k(activity, 5);
                ti1Var3.K = kVar;
                kVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                ti1Var3.K.setBackground(org.telegram.ui.ActionBar.j6.f0(i0.a.k(-1, 76), 1, -1));
                ti1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                oi1Var.addView(ti1Var3.K, w7.x5.d(56, 56.0f, 53, 0.0f, 56.0f, 0.0f, 0.0f));
                ti1Var3.K.setAlpha(0.0f);
                ti1Var3.K.setOnClickListener(new ei1(ti1Var3, 5));
                ti1Var3.H.setOnClickListener(new ei1(ti1Var3, 6));
                ti1Var3.I.setOnClickListener(new xy0(10, ti1Var3, activity));
                if (ti1Var3.f37794u0.f29309b) {
                    ti1Var3.H.setVisibility(8);
                    ti1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f28957a = new HashMap();
                linearLayout.f28958b = new ArrayList();
                linearLayout.f28959c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f28962r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f28961n = q1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.o0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                ti1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                ti1Var3.M0.setOnViewsUpdated(new di1(ti1Var3, 5));
                oi1Var.addView(ti1Var3.M0, w7.x5.d(-1, 200.0f, 80, 16.0f, 0.0f, 16.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var = new org.telegram.ui.Components.voip.d3(activity, 3, q1Var, true);
                d3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                d3Var.K = alignment;
                d3Var.d = -1L;
                d3Var.f4638l0 = new di1(ti1Var3, 6);
                d3Var.T = true;
                d3Var.h = AndroidUtilities.dp(320.0f);
                d3Var.e = true;
                d3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var.q(8.0f);
                ti1Var3.N0 = d3Var;
                d3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                oi1Var.addView(ti1Var3.N0, w7.x5.d(-2, -2.0f, 80, 19.0f, 0.0f, 19.0f, 0.0f));
                org.telegram.ui.Components.voip.d3 d3Var2 = new org.telegram.ui.Components.voip.d3(activity, 1, q1Var, false);
                d3Var2.p(true);
                d3Var2.K = alignment;
                d3Var2.d = 4000L;
                d3Var2.T = true;
                d3Var2.h = AndroidUtilities.dp(320.0f);
                d3Var2.e = true;
                d3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                d3Var2.q(8.0f);
                ti1Var3.O0 = d3Var2;
                d3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                oi1Var.addView(ti1Var3.O0, w7.x5.d(-2, -2.0f, 1, 0.0f, 0.0f, 0.0f, 0.0f));
                ti1Var3.H();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!ti1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        ti1Var3.U0 = z12;
                    }
                    ti1Var3.o();
                }
                li1Var2.addView(oi1Var);
                if (z10) {
                    ti1Var3.F0 = 0.0f;
                    ti1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        ti1Var3.f37763c0.setStub(org.telegram.ui.Components.voip.m2.k().f29073r);
                        ti1Var3.f37765d0.setStub(org.telegram.ui.Components.voip.m2.k().f29072n);
                    }
                    ti1Var3.f37794u0.setAlpha(0.0f);
                    ti1Var3.H();
                    ti1Var3.E0 = true;
                    org.telegram.ui.Components.voip.m2.T = true;
                    if (org.telegram.ui.Components.voip.m2.V == null) {
                        ti1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new di1(ti1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.m2.U.getClass();
                        throw null;
                    }
                } else {
                    ti1Var3.F0 = 1.0f;
                    ti1Var3.G();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && sf.c.a(activity) == 1) {
                    ti1 ti1Var4 = f37755n1;
                    pf.d dVar = new pf.d(activity, ti1Var4);
                    dVar.f40807c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.s2 s2Var3 = ti1Var4.f37763c0;
                    dVar.f40811j = s2Var3.d;
                    dVar.f40812k = s2Var3.getPlaceholderView();
                    ti1Var4.f37772g0 = dVar.a();
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
        k21 k21Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f37799x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27380f;
            duration.setInterpolator(qrVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(qrVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(qrVar).start();
            this.f37778j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(qrVar).start();
            this.f37774h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
            this.f37776i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f37801y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(k21Var);
            this.P0.setDuration(150L).setInterpolator(qrVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f37778j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f37799x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.qr qrVar2 = org.telegram.ui.Components.qr.f27380f;
                translationY.setInterpolator(qrVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(qrVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.f37778j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.f37774h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar2).start();
                this.f37776i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(qrVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f37801y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(k21Var);
                this.P0.setDuration(150L).setInterpolator(qrVar2);
                this.P0.start();
                this.f37778j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f37799x0 = z10;
        li1 li1Var = this.f37794u0;
        if (!z10) {
            li1Var.setSystemUiVisibility(li1Var.getSystemUiVisibility() | 4);
        } else {
            li1Var.setSystemUiVisibility(li1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f37799x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.qr.f27380f).start();
    }

    public final void B() {
        if (VoIPService.getSharedInstance() != null) {
            di1 di1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(di1Var);
            this.R0 = false;
            if (this.f37802z0 && this.f37799x0) {
                AndroidUtilities.runOnUIThread(di1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void C() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f37797w0.isTouchExplorationEnabled()) {
                if (!this.f37785n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f37791s.announceForAccessibility(string);
            }
            if (!this.f37785n0) {
                if (this.f37786o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f37794u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f37769f.getLocationOnScreen(iArr);
                    mi1 mi1Var = new mi1(this, this.f37791s.getContext(), iArr[0], iArr[1]);
                    this.f37786o0 = mi1Var;
                    WindowInsets windowInsets = this.f37790r0;
                    if (windowInsets != null) {
                        mi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f37791s.addView(this.f37786o0);
                    return;
                }
                return;
            }
            this.f37765d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f37788q0 = this.f37787p0;
            H();
        }
    }

    public final void D(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.o0(4).setDuration(250L);
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27380f;
                transitionSet.addTransition(duration.setInterpolator(qrVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(qrVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.v2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.k3.class, true);
                TransitionManager.beginDelayedTransition(this.f37778j0, transitionSet);
            }
            int i10 = this.f37787p0;
            if (i10 == 11) {
                this.e.setVisibility(8);
                this.f37769f.setVisibility(8);
                this.h.setVisibility(8);
                this.f37784n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f37755n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f37785n0 || this.m0)) {
                    s(this.e, sharedInstance);
                    if (this.f37799x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    u(this.e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                v(this.f37769f, sharedInstance, false);
                t(this.h, sharedInstance, z10);
                this.f37784n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f37784n.setOnClickListener(new ei1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f37785n0 || this.m0)) {
                        s(this.e, sharedInstance);
                        if (this.f37799x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        u(this.e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    v(this.f37769f, sharedInstance, false);
                    t(this.h, sharedInstance, z10);
                } else {
                    this.e.setVisibility(8);
                    this.f37769f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f37784n.setVisibility(8);
            }
            if (this.e.getVisibility() == 0) {
                this.e.f29018f = 0;
                i11 = 16;
            }
            if (this.f37769f.getVisibility() == 0) {
                this.f37769f.f29018f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f29018f = i11;
                i11 += 16;
            }
            if (this.f37784n.getVisibility() == 0) {
                this.f37784n.F = i11;
            }
            F();
        }
    }

    public final void E(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ti1.E(boolean):void");
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
        this.f37780k0.setColor(i0.a.k(-16777216, (int) (this.f37801y0 * 102.0f * this.F0)));
        this.f37782l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        oi1 oi1Var = this.f37791s;
        if (oi1Var != null) {
            oi1Var.invalidate();
        }
    }

    public final void H() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.ti1.H():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.s2 s2Var = this.f37763c0;
        if (s2Var != null) {
            s2Var.d.clearFirstFrame();
        }
        this.f37783m1 = true;
        H();
        ((WindowManager) this.f37759b.getSystemService("window")).removeView(this.f37794u0);
        this.f37794u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        li1 li1Var = this.f37794u0;
        li1Var.getClass();
        ((WindowManager) this.f37759b.getSystemService("window")).addView(li1Var, org.telegram.ui.Components.voip.w2.a());
        this.f37783m1 = false;
        H();
        this.f37794u0.invalidate();
        org.telegram.ui.Components.voip.s2 s2Var = this.f37781k1;
        if (s2Var != null) {
            s2Var.d.release();
            this.f37781k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.s2 s2Var = this.f37781k1;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f37781k1.d.getBitmap();
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
            if (this.f37787p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f37765d0.d.release();
                this.f37763c0.d.release();
                this.f37760b0.release();
                o();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            E(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f37794u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f37800y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f37770f0 = booleanValue;
            if (booleanValue) {
                this.f37800y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.s2 s2Var = this.f37763c0;
        if (s2Var != null && s2Var.d.isAvailable()) {
            return this.f37763c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.s2 s2Var = new org.telegram.ui.Components.voip.s2(this.f37759b, false, true, false, false);
        this.f37781k1 = s2Var;
        s2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f37781k1.d.setEnableHardwareScaler(true);
        this.f37781k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.s2 s2Var2 = this.f37781k1;
        s2Var2.f29181a0 = 1;
        s2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ni1(this));
        View view = this.f37781k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f37781k1;
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
        float f17 = org.telegram.ui.Components.voip.m2.k().d.x + org.telegram.ui.Components.voip.m2.k().f29077y;
        float f18 = org.telegram.ui.Components.voip.m2.k().d.y + org.telegram.ui.Components.voip.m2.k().E;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.m2.U.getClass();
        final float measuredWidth = f17 - ((this.f37763c0.getMeasuredWidth() - (this.f37763c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f18 - ((this.f37763c0.getMeasuredHeight() - (this.f37763c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f19 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (this.f37785n0 && measuredWidth2 != 0) {
                f16 = (this.f37794u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f15 = (((org.telegram.ui.Components.voip.m2.k().f29071f * 0.25f) + (f17 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f16)) / 2.0f))) - ((org.telegram.ui.Components.voip.m2.k().f29071f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
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
            this.f37763c0.setScaleX(0.25f);
            this.f37763c0.setScaleY(0.25f);
            this.f37763c0.setTranslationX(measuredWidth);
            this.f37763c0.setTranslationY(measuredHeight2);
            this.f37763c0.setRoundCorners((AndroidUtilities.dp(6.0f) * 1.0f) / 0.25f);
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
                ti1 ti1Var = ti1.this;
                ti1Var.F0 = f23;
                ti1Var.G();
                if (z11) {
                    float f24 = (f10 * floatValue) + (scaleX * f23);
                    ti1Var.Y.setScaleX(f24);
                    ti1Var.Y.setScaleY(f24);
                    ti1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f23));
                    ti1Var.Y.setTranslationY((f21 * floatValue) + (y3 * f23));
                    ti1Var.Y.setCornerRadius((dp * floatValue) + (f22 * f23));
                    ti1Var.Y.setAlpha((f19 * floatValue) + (1.0f * f23));
                }
                float f25 = (r12 * floatValue) + (1.0f * f23);
                ti1Var.f37763c0.setScaleX(f25);
                ti1Var.f37763c0.setScaleY(f25);
                float f26 = 0.0f * f23;
                float f27 = (measuredWidth * floatValue) + f26;
                float f28 = (measuredHeight2 * floatValue) + f26;
                ti1Var.f37763c0.setTranslationX(f27);
                ti1Var.f37763c0.setTranslationY(f28);
                ti1Var.f37763c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f25);
                if (!ti1Var.Y.P) {
                    ti1Var.f37765d0.d(floatValue, false);
                }
                ti1Var.f37794u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void l() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f37756a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        pf.e eVar = this.f37772g0;
        if (eVar != null) {
            eVar.c();
            this.f37772g0 = null;
        }
        tg.n1 n1Var = this.M;
        if (n1Var != null) {
            n1Var.dismiss();
            this.M = null;
        }
    }

    public final void m(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f37799x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.z2 z2Var = this.f37796w;
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
                z2Var.f29359c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y2(z2Var, 1));
                z2Var.f29359c.setInterpolator(org.telegram.ui.Components.qr.f27380f);
                z2Var.f29359c.setDuration(200L);
                z2Var.f29359c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f37800y.getVisibility() == 0) {
                    this.f37800y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.qr.f27380f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.qr.f27381g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27380f;
                org.telegram.messenger.wl.q(translationY, qrVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new hi1(this, 3)).setInterpolator(qrVar).start();
            } else {
                if (this.f37800y.getVisibility() == 0) {
                    this.f37800y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.qr.f27380f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.qr qrVar2 = org.telegram.ui.Components.qr.f27380f;
                duration.setInterpolator(qrVar2).setListener(new org.telegram.ui.Components.aa(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(qrVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new hi1(this, 4)).setDuration(250L).setInterpolator(qrVar2).start();
            }
            this.f37788q0 = this.f37787p0;
            H();
        }
    }

    public final void n() {
        this.f37794u0.b();
    }

    public final void o() {
        this.f37765d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ii1(this));
        this.f37763c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ji1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f37760b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
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
        this.f37788q0 = this.f37787p0;
        H();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f37788q0 = this.f37787p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f37772g0 == null && sf.c.a(this.f37759b) == 1) {
                pf.d dVar = new pf.d(this.f37759b, f37755n1);
                dVar.f40807c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.s2 s2Var = this.f37763c0;
                dVar.f40811j = s2Var.d;
                dVar.f40812k = s2Var.getPlaceholderView();
                this.f37772g0 = dVar.a();
            }
        } else {
            pf.e eVar = this.f37772g0;
            if (eVar != null) {
                eVar.c();
                this.f37772g0 = null;
            }
        }
        H();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.c3 c3Var;
        if (i10 > 0) {
            this.f37779j1 = true;
        }
        if (this.F != null && (c3Var = this.v) != null) {
            int i11 = c3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f37779j1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.id(this, i10, 28), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f37787p0;
        if (i11 != i10) {
            this.f37788q0 = i11;
            this.f37787p0 = i10;
            if (this.f37794u0 != null) {
                H();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f37788q0 = this.f37787p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        H();
    }

    public final void p() {
        if (!this.G0 && !this.E0) {
            mi1 mi1Var = this.f37786o0;
            if (mi1Var != null) {
                mi1Var.a(false, false);
            } else if (this.m0 && this.f37785n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f37757a0 = false;
                this.f37788q0 = this.f37787p0;
                H();
            } else if (this.C0) {
                m(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (sf.c.a(this.f37759b) > 0) {
                        if (!this.G0 && f37755n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f37755n1.f37794u0.getMeasuredHeight();
                                ti1 ti1Var = f37755n1;
                                org.telegram.ui.Components.voip.m2.l(ti1Var.f37759b, ti1Var.f37756a, ti1Var.f37794u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f37755n1.f37790r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.m2.W = windowInsets.getSystemWindowInsetTop();
                                    f37755n1.f37790r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.m2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.qr qrVar = org.telegram.ui.Components.qr.f27380f;
                                duration.setInterpolator(qrVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(qrVar).start();
                                this.f37778j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.f37774h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.f37776i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(qrVar).start();
                                org.telegram.ui.Components.voip.m2.T = true;
                                this.E0 = true;
                                ValueAnimator k10 = k(false);
                                this.L0.lock();
                                k10.addListener(new hi1(this, 1));
                                k10.setDuration(350L);
                                k10.setInterpolator(qrVar);
                                k10.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.c5.B(this.f37759b, new bi1(this, 0), true).o();
                    return;
                }
                this.f37794u0.b();
            }
        }
    }

    public final void r(Runnable runnable) {
        if (this.f37769f.getVisibility() == 0) {
            this.f37767e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f37767e0;
            ValueAnimator valueAnimator = eVar.f28900b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f28900b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f37784n.animate().cancel();
        this.e.animate().cancel();
        this.h.animate().cancel();
        this.f37769f.animate().cancel();
        this.f37767e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f37767e0;
        ValueAnimator valueAnimator2 = eVar2.f28900b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f28900b0 = null;
            eVar2.U.stop();
        }
        this.f37784n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.e.d(5, false, false);
        this.h.d(1, false, false);
        this.f37769f.d(3, true, false);
        this.f37784n.setVisibility(0);
        this.e.setVisibility(0);
        this.h.setVisibility(0);
        this.f37769f.setVisibility(0);
        this.f37784n.setAlpha(0.0f);
        this.e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f37769f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f37767e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                ti1 ti1Var = ti1.this;
                ti1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                ti1Var.f37767e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                ti1Var.f37767e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f37767e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f37767e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f37767e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f37767e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.qk0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new di1(this, 7), 133L);
    }

    public final void s(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService) {
        if (!this.f37785n0) {
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
        k3Var.setOnBtnClickedListener(new c7(this, voIPService, k3Var, 23));
    }

    public final void t(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        k3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.u1 u1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = u1Var.f29264f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            u1Var.K = f7;
            u1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = u1Var.f29264f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = u1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            u1Var.f29264f0 = ofFloat;
            ofFloat.addUpdateListener(u1Var.f29265g0);
            u1Var.f29264f0.setDuration(150L);
            u1Var.f29264f0.start();
        }
        k3Var.setOnBtnClickedListener(new bi1(this, 5));
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
        k3Var.setOnBtnClickedListener(new fa(this, i10, k3Var, voIPService, 8));
    }

    public final void v(org.telegram.ui.Components.voip.k3 k3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f37785n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f37785n0) {
                if (voIPService.isScreencast()) {
                    k3Var.d(3, false, z10);
                } else {
                    k3Var.d(3, false, z10);
                }
            } else {
                k3Var.d(3, true, z10);
            }
            k3Var.setOnBtnClickedListener(new bi1(this, 6));
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
        if (!this.f37785n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f37800y.getTag() == null) {
                this.f37800y.animate().setListener(null).cancel();
                this.f37800y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f37800y.setAlpha(0.0f);
                        this.f37800y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.qr.f27380f).start();
                    } else {
                        this.f37800y.setAlpha(0.0f);
                        this.f37800y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f37800y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.qr.f27380f).start();
                    }
                } else if (z11) {
                    this.f37800y.setAlpha(0.0f);
                    this.f37800y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f37800y.setScaleX(0.1f);
                    this.f37800y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f37800y.getTag() != null) {
                this.f37800y.animate().setListener(null).cancel();
                this.f37800y.setTranslationY(0.0f);
                this.f37800y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.qr.f27380f).setListener(new hi1(this, 7)).start();
            }
        } else {
            this.f37800y.animate().setListener(null).cancel();
            this.f37800y.setTranslationY(0.0f);
            this.f37800y.setAlpha(1.0f);
            this.f37800y.setScaleX(1.0f);
            this.f37800y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.t0 t0Var = this.f37800y;
            if (!z12) {
                i10 = 8;
            }
            t0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.t0 t0Var2 = this.f37800y;
        if (z12) {
            num = 1;
        }
        t0Var2.setTag(num);
    }

    public final void y(CharSequence charSequence) {
        TextView textView;
        if (this.f37759b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(this.f37759b, 0, null);
        boolean[] zArr = new boolean[3];
        c2Var.R = LocaleController.getString(R.string.VoipFailed);
        c2Var.T = charSequence;
        c2Var.f18507l0 = LocaleController.getString(R.string.OK);
        c2Var.m0 = null;
        c2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) c2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(c2Var.e(org.telegram.ui.ActionBar.j6.f19100q7));
            }
        }
        c2Var.setCanceledOnTouchOutside(true);
        c2Var.setOnDismissListener(new r5(this, 19));
    }

    public final void z(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f37799x0);
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
                    animatorSet3.addListener(new hi1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.qr.f27380f);
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
                if (u1Var4.f29274y < 0.0f) {
                    u1Var4.d(1.0f, 1.0f);
                    this.f37757a0 = true;
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
            this.f37757a0 = z13;
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
