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
public final class xi1 implements VoIPService.StateListener, NotificationCenter.NotificationCenterDelegate, sf.a {
    public static xi1 f43982n1;
    public AnimatorSet A0;
    public boolean B0;
    public boolean C0;
    public boolean D0;
    public TextView E;
    public boolean E0;
    public org.telegram.ui.Components.voip.q2 F;
    public float F0;
    public wi1 G;
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
    public org.telegram.ui.Components.voip.i2 M0;
    public fc1 N;
    public org.telegram.ui.Components.voip.e3 N0;
    public FrameLayout O;
    public org.telegram.ui.Components.voip.e3 O0;
    public org.telegram.ui.Components.voip.r0 P;
    public ValueAnimator P0;
    public org.telegram.ui.Components.voip.p1 Q;
    public ci.w5 R;
    public boolean R0;
    public TextView S;
    public xk T;
    public org.telegram.ui.Components.voip.k U;
    public boolean U0;
    public float V0;
    public float W0;
    public ti1 X;
    public float X0;
    public org.telegram.ui.Components.voip.v1 Y;
    public float Y0;
    public org.telegram.ui.Components.voip.v1 Z;
    public float Z0;
    public final int f43983a;
    public boolean f43984a0;
    public boolean f43985a1;
    public Activity f43986b;
    public TextureViewRenderer f43987b0;
    public float f43988b1;
    public final TLRPC.User f43989c;
    public org.telegram.ui.Components.voip.t2 f43990c0;
    public float f43991c1;
    public final TLRPC.User d;
    public org.telegram.ui.Components.voip.t2 f43992d0;
    public int f43993d1;
    public org.telegram.ui.Components.voip.l3 f43994e;
    public org.telegram.ui.Components.voip.e f43995e0;
    public int f43996e1;
    public org.telegram.ui.Components.voip.l3 f43997f;
    public boolean f43998f0;
    public qf.e f44000g0;
    public boolean f44001g1;
    public org.telegram.ui.Components.voip.l3 h;
    public View f44002h0;
    public boolean f44003h1;
    public View f44004i0;
    public ValueAnimator f44005i1;
    public org.telegram.ui.Components.voip.s1 f44006j0;
    public boolean f44007j1;
    public org.telegram.ui.Components.voip.t2 f44009k1;
    public com.google.android.gms.internal.cast.p l1;
    public boolean m0;
    public boolean f44011m1;
    public ui1 f44012n;
    public boolean f44013n0;
    public qi1 f44014o0;
    public int f44015p0;
    public int f44016q0;
    public WindowInsets f44018r0;
    public si1 f44019s;
    public boolean f44020s0;
    public float f44021t0;
    public pi1 f44022u0;
    public org.telegram.ui.Components.voip.d3 v;
    public int f44023v0;
    public org.telegram.ui.Components.voip.a3 f44024w;
    public AccessibilityManager f44025w0;
    public org.telegram.ui.Components.voip.f3 f44026x;
    public org.telegram.ui.Components.voip.u0 f44028y;
    public boolean f44030z0;
    public final org.telegram.ui.Components.voip.r1 f44017r = new org.telegram.ui.Components.voip.r1();
    public final org.telegram.ui.Components.y9[] V = new org.telegram.ui.Components.y9[4];
    public final Drawable[] W = new Drawable[4];
    public final Paint f44008k0 = new Paint();
    public final Paint f44010l0 = new Paint();
    public boolean f44027x0 = true;
    public float f44029y0 = 1.0f;
    public final AnimationNotificationsLocker L0 = new AnimationNotificationsLocker();
    public final a21 Q0 = new a21(this, 20);
    public final hi1 S0 = new hi1(this, 12);
    public final hi1 T0 = new hi1(this, 13);
    public float f43999f1 = 1.0f;

    public xi1(int i10) {
        this.f43983a = i10;
        this.f43989c = MessagesController.getInstance(i10).getUser(Long.valueOf(UserConfig.getInstance(i10).getClientUserId()));
        VoIPServiceState sharedState = VoIPService.getSharedState();
        if (sharedState == null) {
            return;
        }
        this.d = sharedState.getUser();
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().registerStateListener(this);
        }
        sharedState.isOutgoing();
        this.f44016q0 = -1;
        this.f44015p0 = sharedState.getCallState();
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().addObserver(this, NotificationCenter.nearEarEvent);
    }

    public static void i(xi1 xi1Var) {
        xi1 xi1Var2;
        if (xi1Var.f44001g1) {
            xi1Var.f44001g1 = false;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, 0.0f);
            xi1Var.f44005i1 = ofFloat;
            xi1Var2 = xi1Var;
            ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.y(xi1Var2, xi1Var.f43999f1, xi1Var.Y0, xi1Var.Z0, 1));
            xi1Var2.f44005i1.addListener(new li1(xi1Var2, 0));
            xi1Var2.f44005i1.setDuration(350L);
            xi1Var2.f44005i1.setInterpolator(org.telegram.ui.Components.js.f27634f);
            xi1Var2.f44005i1.start();
        } else {
            xi1Var2 = xi1Var;
        }
        xi1Var2.f44003h1 = false;
        xi1Var2.f43985a1 = false;
    }

    public static void p(int i10, int[] iArr) {
        xi1 xi1Var = f43982n1;
        if (xi1Var != null) {
            if (i10 == 101) {
                if (VoIPService.getSharedState() == null) {
                    xi1Var.f44022u0.b();
                    return;
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    xi1Var.q(new w21(4));
                } else if (!xi1Var.f43986b.shouldShowRequestPermissionRationale("android.permission.RECORD_AUDIO")) {
                    if (VoIPService.getSharedState() != null) {
                        VoIPService.getSharedState().declineIncomingCall();
                    }
                    org.telegram.ui.Components.voip.g2.h(xi1Var.f43986b, new hi1(xi1Var, 2), i10);
                    return;
                }
            }
            if (i10 == 102) {
                if (VoIPService.getSharedState() == null) {
                    xi1Var.f44022u0.b();
                } else if (iArr.length > 0 && iArr[0] == 0) {
                    xi1Var.B();
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
        xi1 xi1Var = f43982n1;
        if (xi1Var != null && xi1Var.f44022u0.getParent() == null) {
            xi1 xi1Var2 = f43982n1;
            if (xi1Var2 != null) {
                xi1Var2.f43990c0.d.release();
                f43982n1.f43992d0.d.release();
                f43982n1.f43987b0.release();
                pi1 pi1Var = f43982n1.f44022u0;
                if (pi1Var != null) {
                    pi1Var.d();
                }
                f43982n1.k();
            }
            f43982n1 = null;
        }
        if (f43982n1 == null && !activity.isFinishing()) {
            if (org.telegram.ui.Components.voip.n2.k() != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (VoIPService.getSharedState() != null && VoIPService.getSharedState().getUser() != null) {
                xi1 xi1Var3 = new xi1(i10);
                xi1Var3.f43986b = activity;
                f43982n1 = xi1Var3;
                pi1 pi1Var2 = new pi1(activity, !z10, xi1Var3);
                f43982n1.J0 = ((KeyguardManager) activity.getSystemService("keyguard")).inKeyguardRestrictedInputMode();
                ((PowerManager) activity.getSystemService("power")).isInteractive();
                f43982n1.getClass();
                pi1Var2.setLockOnScreen(f43982n1.J0);
                xi1Var3.f44022u0 = pi1Var2;
                fi1 fi1Var = new fi1(xi1Var3, 4);
                WeakHashMap weakHashMap = r0.i0.f46989a;
                r0.a0.i(pi1Var2, fi1Var);
                ((WindowManager) activity.getSystemService("window")).addView(pi1Var2, org.telegram.ui.Components.voip.x2.a());
                xi1Var3.f44021t0 = ViewConfiguration.get(activity).getScaledTouchSlop();
                xi1Var3.f44025w0 = (AccessibilityManager) activity.getSystemService(AccessibilityManager.class);
                si1 si1Var = new si1(xi1Var3, activity);
                si1Var.setClipToPadding(false);
                si1Var.setClipChildren(false);
                si1Var.setBackgroundColor(-16777216);
                xi1Var3.F();
                xi1Var3.f44019s = si1Var;
                VoIPServiceState sharedState = VoIPService.getSharedState();
                if (sharedState != null && sharedState.isConference()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                org.telegram.ui.Components.voip.r1 r1Var = xi1Var3.f44017r;
                xi1Var3.v = new org.telegram.ui.Components.voip.d3(activity, z11, r1Var);
                org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(activity, false, true, false, false);
                xi1Var3.f43990c0 = t2Var;
                RendererCommon.ScalingType scalingType = RendererCommon.ScalingType.SCALE_ASPECT_FIT;
                t2Var.d.setScalingType(scalingType);
                xi1Var3.f43990c0.d.setEnableHardwareScaler(true);
                xi1Var3.f43990c0.d.setRotateTextureWithScreen(true);
                xi1Var3.f43990c0.f31956a0 = 1;
                si1Var.addView(xi1Var3.v, w7.w5.d(-1.0f, -1));
                TLRPC.User user = xi1Var3.d;
                org.telegram.ui.Components.voip.a3 a3Var = new org.telegram.ui.Components.voip.a3(activity, user, r1Var);
                xi1Var3.f44024w = a3Var;
                si1Var.addView(a3Var, w7.w5.d(-1.0f, -1));
                ?? view = new View(activity);
                if (LiteMode.isEnabled(512)) {
                    int i12 = org.telegram.ui.ActionBar.h6.f20497a;
                    Calendar calendar = Calendar.getInstance();
                    calendar.setTimeInMillis(System.currentTimeMillis());
                    int i13 = calendar.get(2);
                    int i14 = calendar.get(5);
                    calendar.get(12);
                    calendar.get(11);
                    if ((i13 == 11 && i14 >= 24 && i14 <= 31) || (i13 == 0 && i14 == 1)) {
                        view.f31672a = new org.telegram.ui.Components.jx0(0);
                    }
                }
                xi1Var3.f44026x = view;
                si1Var.addView((View) view, w7.w5.d(220.0f, -1));
                si1Var.addView(xi1Var3.f43990c0);
                GradientDrawable.Orientation orientation = GradientDrawable.Orientation.TOP_BOTTOM;
                new org.telegram.ui.Components.x9(orientation, new int[]{-14994098, -14328963}).f(m.y0.n(0.5f, 1), new hd1(xi1Var3, 1), 0L);
                org.telegram.ui.Components.voip.v1 v1Var = new org.telegram.ui.Components.voip.v1(activity);
                xi1Var3.Y = v1Var;
                v1Var.setDelegate(new fi1(xi1Var3, 3));
                xi1Var3.Y.d(1.0f, 1.0f);
                xi1Var3.f43984a0 = true;
                org.telegram.ui.Components.voip.t2 t2Var2 = new org.telegram.ui.Components.voip.t2(activity, true, false);
                xi1Var3.f43992d0 = t2Var2;
                t2Var2.d.setIsCamera(true);
                xi1Var3.f43992d0.d.setUseCameraRotation(true);
                xi1Var3.Y.setOnTapListener(new ii1(xi1Var3, 1));
                xi1Var3.f43992d0.d.setMirror(true);
                xi1Var3.Y.addView(xi1Var3.f43992d0);
                org.telegram.ui.Components.voip.v1 v1Var2 = new org.telegram.ui.Components.voip.v1(activity);
                xi1Var3.Z = v1Var2;
                v1Var2.S = true;
                v1Var2.c(true, false);
                TextureViewRenderer textureViewRenderer = new TextureViewRenderer(activity);
                xi1Var3.f43987b0 = textureViewRenderer;
                textureViewRenderer.setEnableHardwareScaler(true);
                xi1Var3.f43987b0.setIsCamera(false);
                xi1Var3.f43987b0.setFpsReduction(30.0f);
                xi1Var3.f43987b0.setScalingType(scalingType);
                xi1Var3.Z.addView(xi1Var3.f43987b0, w7.w5.e(-1, -2, 17));
                xi1Var3.Z.setOnTapListener(new ii1(xi1Var3, 2));
                xi1Var3.Z.setVisibility(8);
                si1Var.addView(xi1Var3.Y, w7.w5.d(-2.0f, -2));
                si1Var.addView(xi1Var3.Z);
                View view2 = new View(activity);
                xi1Var3.f44002h0 = view2;
                view2.setBackground(new GradientDrawable(orientation, new int[]{0, i0.a.k(-16777216, 127)}));
                si1Var.addView(xi1Var3.f44002h0, w7.w5.e(-1, 160, 80));
                View view3 = new View(activity);
                xi1Var3.f44004i0 = view3;
                view3.setBackground(new GradientDrawable(orientation, new int[]{i0.a.k(-16777216, 102), 0}));
                si1Var.addView(xi1Var3.f44004i0, w7.w5.e(-1, 160, 48));
                fc1 fc1Var = new fc1(xi1Var3, activity, 16);
                xi1Var3.N = fc1Var;
                fc1Var.setOrientation(0);
                xi1Var3.N.setPadding(0, 0, 0, AndroidUtilities.dp(30.0f));
                xi1Var3.N.setClipToPadding(false);
                xi1Var3.N.setContentDescription(LocaleController.getString(R.string.VoipHintEncryptionKey));
                xi1Var3.N.setOnClickListener(new ii1(xi1Var3, 3));
                xi1Var3.P = new org.telegram.ui.Components.voip.r0(activity, r1Var);
                FrameLayout frameLayout = new FrameLayout(activity);
                xi1Var3.O = frameLayout;
                frameLayout.addView(xi1Var3.P, w7.w5.a(-2.0f, 0.0f, 16.0f, 0.0f, 0.0f, -2, 3));
                xi1Var3.O.setVisibility(8);
                xi1Var3.O.setOnClickListener(new ii1(xi1Var3, 4));
                ci.w5 w5Var = new ci.w5(activity, r1Var);
                xi1Var3.R = w5Var;
                w5Var.setOrientation(1);
                TextView textView = new TextView(activity);
                xi1Var3.S = textView;
                textView.setText(LocaleController.getString(R.string.VoipCallEncryptionEndToEnd));
                xi1Var3.S.setTextSize(1, 15.0f);
                xi1Var3.S.setTypeface(AndroidUtilities.bold());
                xi1Var3.S.setTextColor(-1);
                xi1Var3.S.setGravity(17);
                xk xkVar = new xk(xi1Var3, activity, 5);
                xi1Var3.T = xkVar;
                xkVar.setTextSize(1, 15.0f);
                xi1Var3.T.setTextColor(-1);
                xi1Var3.T.setGravity(17);
                xi1Var3.T.setText(LocaleController.formatString("CallEmojiKeyTooltip", R.string.CallEmojiKeyTooltip, TextUtils.ellipsize(UserObject.getFirstName(user), xi1Var3.T.getPaint(), AndroidUtilities.dp(300.0f), TextUtils.TruncateAt.END)));
                xi1Var3.R.setVisibility(8);
                xi1Var3.R.addView(xi1Var3.S);
                xi1Var3.R.addView(xi1Var3.T, w7.w5.k(0.0f, 8.0f, 0.0f, 0.0f, -2, -2));
                xi1Var3.R.setPadding(AndroidUtilities.dp(18.0f), AndroidUtilities.dp(80.0f), AndroidUtilities.dp(18.0f), AndroidUtilities.dp(18.0f));
                for (int i15 = 0; i15 < 4; i15++) {
                    org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(activity);
                    org.telegram.ui.Components.y9[] y9VarArr = xi1Var3.V;
                    y9VarArr[i15] = y9Var;
                    y9VarArr[i15].getImageReceiver().setAspectFit(true);
                    fc1 fc1Var2 = xi1Var3.N;
                    org.telegram.ui.Components.y9 y9Var2 = y9VarArr[i15];
                    if (i15 == 0) {
                        f7 = 0.0f;
                    } else {
                        f7 = 6.0f;
                    }
                    fc1Var2.addView(y9Var2, w7.w5.k(f7, 0.0f, 0.0f, 0.0f, 25, 25));
                }
                ti1 ti1Var = new ti1(xi1Var3, activity);
                xi1Var3.X = ti1Var;
                ti1Var.setOrientation(1);
                xi1Var3.X.setFocusable(true);
                xi1Var3.X.setFocusableInTouchMode(true);
                xi1Var3.f44028y = new org.telegram.ui.Components.voip.u0(activity);
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.c6) null);
                j9Var.r(user);
                org.telegram.ui.Components.voip.u0 u0Var = xi1Var3.f44028y;
                int i16 = xi1Var3.f43983a;
                u0Var.f31984b.h(ImageLocation.getForUserOrChat(i16, user, 0), null, j9Var, user);
                xi1Var3.f44028y.setRoundRadius(AndroidUtilities.dp(135.0f) / 2);
                TextView textView2 = new TextView(activity);
                xi1Var3.E = textView2;
                textView2.setTextSize(1, 28.0f);
                xi1Var3.E.setText(Emoji.replaceEmoji(ContactsController.formatName(user.first_name, user.last_name), xi1Var3.E.getPaint().getFontMetricsInt(), false));
                xi1Var3.E.setMaxLines(2);
                xi1Var3.E.setEllipsize(TextUtils.TruncateAt.END);
                xi1Var3.E.setTextColor(-1);
                xi1Var3.E.setGravity(1);
                xi1Var3.E.setImportantForAccessibility(2);
                xi1Var3.X.addView(xi1Var3.E, w7.w5.t(-2, -2, 1, 8, 0, 8, 6));
                ?? frameLayout2 = new FrameLayout(activity);
                frameLayout2.f31908a = new TextView[2];
                int i17 = 0;
                for (int i18 = 2; i17 < i18; i18 = 2) {
                    frameLayout2.f31908a[i17] = new TextView(activity);
                    frameLayout2.f31908a[i17].setTextSize(1, 15.0f);
                    frameLayout2.f31908a[i17].setTextColor(-1);
                    frameLayout2.f31908a[i17].setGravity(1);
                    frameLayout2.addView(frameLayout2.f31908a[i17]);
                    i17++;
                }
                FrameLayout frameLayout3 = new FrameLayout(activity);
                frameLayout2.f31910c = frameLayout3;
                org.telegram.ui.Components.voip.o2 o2Var = new org.telegram.ui.Components.voip.o2(frameLayout2, activity, r1Var);
                o2Var.setTextSize(1, 15.0f);
                o2Var.setTextColor(-1);
                o2Var.setGravity(1);
                o2Var.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(2.0f));
                o2Var.setText(LocaleController.getString(R.string.VoipWeakNetwork));
                frameLayout3.addView(o2Var, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                frameLayout3.setVisibility(8);
                frameLayout2.addView(frameLayout3, w7.w5.a(-2.0f, 0.0f, 44.0f, 0.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(activity);
                frameLayout2.f31909b = textView3;
                textView3.setTextSize(1, 15.0f);
                textView3.setTextColor(-1);
                textView3.setGravity(1);
                frameLayout2.addView(textView3, w7.w5.a(-2.0f, 0.0f, 22.0f, 0.0f, 0.0f, -1, 0));
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.VoipReconnecting));
                SpannableString spannableString = new SpannableString(".");
                spannableString.setSpan(new hg.x1(new View[]{textView3}), 0, 1, 33);
                spannableStringBuilder.append((CharSequence) spannableString);
                textView3.setText(spannableStringBuilder);
                textView3.setVisibility(8);
                org.telegram.ui.Components.voip.u2 u2Var = new org.telegram.ui.Components.voip.u2(activity);
                frameLayout2.d = u2Var;
                frameLayout2.addView(u2Var, w7.w5.d(-2.0f, -1));
                xi1Var3.F = frameLayout2;
                WeakHashMap weakHashMap2 = r0.i0.f46989a;
                frameLayout2.setImportantForAccessibility(4);
                xi1Var3.X.addView(xi1Var3.F, w7.w5.t(-2, -2, 1, 0, 0, 0, 6));
                if (sharedState != null && sharedState.getUser() != null && sharedState.isConference() && sharedState.getGroupCall() != null) {
                    wi1 wi1Var = new wi1(activity);
                    xi1Var3.G = wi1Var;
                    long j3 = sharedState.getUser().f19950id;
                    ArrayList<TLRPC.GroupCallParticipant> groupParticipants = sharedState.getGroupParticipants();
                    int i19 = sharedState.getGroupCall().participants_count;
                    if (groupParticipants == null && i19 <= 0) {
                        wi1Var.setVisibility(8);
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
                        org.telegram.ui.Components.l9 l9Var = wi1Var.f43545b;
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
                            wi1Var.setVisibility(8);
                        } else {
                            wi1Var.f43546c = new org.telegram.ui.Components.r11(LocaleController.formatPluralStringComma("Participants", max), 14.0f, AndroidUtilities.bold());
                            wi1Var.setVisibility(0);
                            wi1Var.invalidate();
                        }
                    }
                    xi1Var3.X.addView(xi1Var3.G, w7.w5.k(0.0f, 22.0f, 0.0f, 0.0f, -1, 30));
                }
                xi1Var3.X.setClipChildren(false);
                xi1Var3.X.setClipToPadding(false);
                xi1Var3.X.setPadding(0, 0, 0, AndroidUtilities.dp(15.0f));
                xi1Var3.U = new org.telegram.ui.Components.voip.k(activity);
                xi1Var3.Q = new org.telegram.ui.Components.voip.p1(activity, r1Var);
                xi1Var3.U.setAlpha(0.0f);
                xi1Var3.Q.setVisibility(8);
                si1Var.addView(xi1Var3.f44028y, w7.w5.a(204.0f, 0.0f, 93.0f, 0.0f, 0.0f, 204, 1));
                si1Var.addView(xi1Var3.X, w7.w5.a(-2.0f, 0.0f, 135.0f, 0.0f, 0.0f, -1, 0));
                si1Var.addView(xi1Var3.O, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                si1Var.addView(xi1Var3.R, w7.w5.a(-2.0f, 0.0f, 118.0f, 0.0f, 0.0f, 304, 49));
                si1Var.addView(xi1Var3.N, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                si1Var.addView(xi1Var3.U, w7.w5.a(52.0f, 0.0f, 0.0f, 0.0f, 0.0f, -1, 5));
                si1Var.addView(xi1Var3.Q, w7.w5.a(-2.0f, 0.0f, 380.0f, 0.0f, 0.0f, -1, 3));
                xi1Var3.f44006j0 = new org.telegram.ui.Components.voip.s1(activity);
                xi1Var3.f43994e = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                xi1Var3.f43997f = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                xi1Var3.h = new org.telegram.ui.Components.voip.l3(activity, r1Var);
                xi1Var3.f44012n = new org.telegram.ui.Components.voip.w2(activity, 52.0f);
                xi1Var3.f43994e.setTranslationY(AndroidUtilities.dp(100.0f));
                xi1Var3.f43994e.setScaleX(0.0f);
                xi1Var3.f43994e.setScaleY(0.0f);
                xi1Var3.f43994e.animate().setStartDelay(150).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                xi1Var3.f43997f.setTranslationY(AndroidUtilities.dp(100.0f));
                xi1Var3.f43997f.setScaleX(0.0f);
                xi1Var3.f43997f.setScaleY(0.0f);
                xi1Var3.f43997f.animate().setStartDelay(166).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                xi1Var3.h.setTranslationY(AndroidUtilities.dp(100.0f));
                xi1Var3.h.setScaleX(0.0f);
                xi1Var3.h.setScaleY(0.0f);
                xi1Var3.h.animate().setStartDelay(182).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                xi1Var3.f44012n.setTranslationY(AndroidUtilities.dp(100.0f));
                xi1Var3.f44012n.setScaleX(0.0f);
                xi1Var3.f44012n.setScaleY(0.0f);
                xi1Var3.f44012n.animate().setStartDelay(198).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(250L).start();
                xi1Var3.f44006j0.addView(xi1Var3.f43994e);
                xi1Var3.f44006j0.addView(xi1Var3.f43997f);
                xi1Var3.f44006j0.addView(xi1Var3.h);
                xi1Var3.f44006j0.addView(xi1Var3.f44012n);
                org.telegram.ui.Components.voip.e eVar = new org.telegram.ui.Components.voip.e(activity);
                xi1Var3.f43995e0 = eVar;
                eVar.setListener(new vi1(xi1Var3));
                xi1Var3.f43995e0.setScaleX(1.15f);
                xi1Var3.f43995e0.setScaleY(1.15f);
                si1Var.addView(xi1Var3.f44006j0, w7.w5.e(-1, -2, 80));
                if (AndroidUtilities.isTablet()) {
                    i11 = 100;
                } else {
                    i11 = 27;
                }
                float f10 = i11;
                si1Var.addView(xi1Var3.f43995e0, w7.w5.a(186.0f, f10, 0.0f, f10, 0.0f, -1, 80));
                ImageView imageView = new ImageView(activity);
                xi1Var3.I = imageView;
                imageView.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(-1, 76), 1, -1));
                xi1Var3.I.setImageResource(R.drawable.msg_addcontact);
                xi1Var3.I.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                si1Var.addView(xi1Var3.I, w7.w5.e(56, 56, 53));
                w7.y5.a(xi1Var3.I);
                ImageView imageView2 = new ImageView(activity);
                xi1Var3.H = imageView2;
                imageView2.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(-1, 76), 1, -1));
                xi1Var3.H.setImageResource(R.drawable.msg_call_minimize_shadow);
                xi1Var3.H.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(16.0f));
                xi1Var3.H.setContentDescription(LocaleController.getString(R.string.Back));
                si1Var.addView(xi1Var3.H, w7.w5.e(56, 56, 51));
                w7.y5.a(xi1Var3.H);
                hg.l lVar = new hg.l(activity, 5);
                xi1Var3.K = lVar;
                lVar.setContentDescription(LocaleController.getString(R.string.VoipSpeaker));
                xi1Var3.K.setBackground(org.telegram.ui.ActionBar.h6.g0(i0.a.k(-1, 76), 1, -1));
                xi1Var3.K.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(12.0f));
                si1Var.addView(xi1Var3.K, w7.w5.a(56.0f, 0.0f, 56.0f, 0.0f, 0.0f, 56, 53));
                xi1Var3.K.setAlpha(0.0f);
                xi1Var3.K.setOnClickListener(new ii1(xi1Var3, 5));
                xi1Var3.H.setOnClickListener(new ii1(xi1Var3, 6));
                xi1Var3.I.setOnClickListener(new xy0(10, xi1Var3, activity));
                if (xi1Var3.f44022u0.f32093b) {
                    xi1Var3.H.setVisibility(8);
                    xi1Var3.I.setVisibility(8);
                }
                ?? linearLayout = new LinearLayout(activity);
                linearLayout.f31714a = new HashMap();
                linearLayout.f31715b = new ArrayList();
                linearLayout.f31716c = new ArrayList();
                TextPaint textPaint = new TextPaint();
                linearLayout.f31720r = textPaint;
                linearLayout.setOrientation(1);
                linearLayout.f31719n = r1Var;
                TransitionSet transitionSet = new TransitionSet();
                linearLayout.d = transitionSet;
                transitionSet.addTransition(new Fade(2).setDuration(150L)).addTransition(new ChangeBounds().setDuration(200L)).addTransition(new org.telegram.ui.ActionBar.m0(3).setDuration(200L));
                transitionSet.setOrdering(0);
                textPaint.setTextSize(AndroidUtilities.dp(14.0f));
                xi1Var3.M0 = linearLayout;
                linearLayout.setGravity(80);
                xi1Var3.M0.setOnViewsUpdated(new hi1(xi1Var3, 5));
                si1Var.addView(xi1Var3.M0, w7.w5.a(200.0f, 16.0f, 0.0f, 16.0f, 0.0f, -1, 80));
                org.telegram.ui.Components.voip.e3 e3Var = new org.telegram.ui.Components.voip.e3(activity, 3, r1Var, true);
                e3Var.p(true);
                Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
                e3Var.K = alignment;
                e3Var.d = -1L;
                e3Var.f4916l0 = new hi1(xi1Var3, 6);
                e3Var.T = true;
                e3Var.h = AndroidUtilities.dp(320.0f);
                e3Var.f4907e = true;
                e3Var.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var.q(8.0f);
                xi1Var3.N0 = e3Var;
                e3Var.s(LocaleController.getString(R.string.TapToTurnCamera));
                si1Var.addView(xi1Var3.N0, w7.w5.a(-2.0f, 19.0f, 0.0f, 19.0f, 0.0f, -2, 80));
                org.telegram.ui.Components.voip.e3 e3Var2 = new org.telegram.ui.Components.voip.e3(activity, 1, r1Var, false);
                e3Var2.p(true);
                e3Var2.K = alignment;
                e3Var2.d = 4000L;
                e3Var2.T = true;
                e3Var2.h = AndroidUtilities.dp(320.0f);
                e3Var2.f4907e = true;
                e3Var2.k(10.0f, 6.0f, 10.0f, 6.0f);
                e3Var2.q(8.0f);
                xi1Var3.O0 = e3Var2;
                e3Var2.s(LocaleController.getString(R.string.VoipHintEncryptionKey));
                si1Var.addView(xi1Var3.O0, w7.w5.a(-2.0f, 0.0f, 0.0f, 0.0f, 0.0f, -2, 1));
                xi1Var3.G();
                VoIPService sharedInstance = VoIPService.getSharedInstance();
                if (sharedInstance != null) {
                    if (!xi1Var3.U0) {
                        TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                        if (phoneCall != null && phoneCall.video) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        xi1Var3.U0 = z12;
                    }
                    xi1Var3.n();
                }
                pi1Var2.addView(si1Var);
                if (z10) {
                    xi1Var3.F0 = 0.0f;
                    xi1Var3.I0 = true;
                    VoIPService sharedInstance2 = VoIPService.getSharedInstance();
                    if (sharedInstance2 != null && sharedInstance2.getVideoState(false) == 2) {
                        xi1Var3.f43990c0.setStub(org.telegram.ui.Components.voip.n2.k().f31840s);
                        xi1Var3.f43992d0.setStub(org.telegram.ui.Components.voip.n2.k().f31839r);
                    }
                    xi1Var3.f44022u0.setAlpha(0.0f);
                    xi1Var3.G();
                    xi1Var3.E0 = true;
                    org.telegram.ui.Components.voip.n2.U = true;
                    if (org.telegram.ui.Components.voip.n2.W == null) {
                        xi1Var3.L0.lock();
                        AndroidUtilities.runOnUIThread(new hi1(xi1Var3, 11), 32L);
                    } else {
                        org.telegram.ui.Components.voip.n2.V.getClass();
                        throw null;
                    }
                } else {
                    xi1Var3.F0 = 1.0f;
                    xi1Var3.F();
                }
                VoIPService sharedInstance3 = VoIPService.getSharedInstance();
                if (sharedInstance3 != null && sharedInstance3.getRemoteVideoState() == 2 && tf.c.a(activity) == 1) {
                    xi1 xi1Var4 = f43982n1;
                    qf.d dVar = new qf.d(activity, xi1Var4);
                    dVar.f46098c = "voip-fragment-pip";
                    org.telegram.ui.Components.voip.t2 t2Var3 = xi1Var4.f43990c0;
                    dVar.f46103j = t2Var3.d;
                    dVar.f46104k = t2Var3.getPlaceholderView();
                    xi1Var4.f44000g0 = dVar.a();
                }
            }
        }
    }

    public final void A() {
        if (VoIPService.getSharedInstance() != null) {
            hi1 hi1Var = this.S0;
            AndroidUtilities.cancelRunOnUIThread(hi1Var);
            this.R0 = false;
            if (this.f44030z0 && this.f44027x0) {
                AndroidUtilities.runOnUIThread(hi1Var, 3000L);
                this.R0 = true;
            }
        }
    }

    public final void B() {
        String string;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (this.f44025w0.isTouchExplorationEnabled()) {
                if (!this.f44013n0) {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOn);
                } else {
                    string = LocaleController.getString(R.string.AccDescrVoipCamOff);
                }
                this.f44019s.announceForAccessibility(string);
            }
            if (!this.f44013n0) {
                if (this.f44014o0 == null) {
                    sharedInstance.createCaptureDevice(false);
                    if (!sharedInstance.isFrontFaceCamera()) {
                        sharedInstance.switchCamera();
                    }
                    this.f44022u0.setLockOnScreen(true);
                    int[] iArr = new int[2];
                    this.f43997f.getLocationOnScreen(iArr);
                    qi1 qi1Var = new qi1(this, this.f44019s.getContext(), iArr[0], iArr[1]);
                    this.f44014o0 = qi1Var;
                    WindowInsets windowInsets = this.f44018r0;
                    if (windowInsets != null) {
                        qi1Var.setBottomPadding(windowInsets.getSystemWindowInsetBottom());
                    }
                    this.f44019s.addView(this.f44014o0);
                    return;
                }
                return;
            }
            this.f43992d0.c();
            sharedInstance.setVideoState(false, 0);
            sharedInstance.clearCamera();
            this.f44016q0 = this.f44015p0;
            G();
        }
    }

    public final void C(boolean z10) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null) {
            if (z10) {
                TransitionSet transitionSet = new TransitionSet();
                Transition duration = new org.telegram.ui.ActionBar.m0(4).setDuration(250L);
                org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27634f;
                transitionSet.addTransition(duration.setInterpolator(jsVar)).addTransition(new ChangeBounds().setDuration(250L).setInterpolator(jsVar));
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.w2.class, true);
                transitionSet.excludeChildren(org.telegram.ui.Components.voip.l3.class, true);
                TransitionManager.beginDelayedTransition(this.f44006j0, transitionSet);
            }
            int i10 = this.f44015p0;
            if (i10 == 11) {
                this.f43994e.setVisibility(8);
                this.f43997f.setVisibility(8);
                this.h.setVisibility(8);
                this.f44012n.setVisibility(8);
                return;
            }
            int i11 = 0;
            if (i10 != 15 && i10 != 17) {
                if (f43982n1 == null) {
                    return;
                }
                if (!sharedInstance.isScreencast() && (this.f44013n0 || this.m0)) {
                    r(this.f43994e, sharedInstance);
                    if (this.f44027x0) {
                        this.K.setTag(1);
                        this.K.animate().alpha(1.0f).start();
                    }
                } else {
                    t(this.f43994e, sharedInstance);
                    this.K.setTag(null);
                    this.K.animate().alpha(0.0f).start();
                }
                u(this.f43997f, sharedInstance, false);
                s(this.h, sharedInstance, z10);
                this.f44012n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, z10);
                this.f44012n.setOnClickListener(new ii1(this, 0));
            } else {
                TL_phone.PhoneCall phoneCall = sharedInstance.privateCall;
                if (phoneCall != null && phoneCall.video && i10 == 15) {
                    if (!sharedInstance.isScreencast() && (this.f44013n0 || this.m0)) {
                        r(this.f43994e, sharedInstance);
                        if (this.f44027x0) {
                            this.K.animate().alpha(1.0f).start();
                        }
                    } else {
                        t(this.f43994e, sharedInstance);
                        this.K.animate().alpha(0.0f).start();
                    }
                    u(this.f43997f, sharedInstance, false);
                    s(this.h, sharedInstance, z10);
                } else {
                    this.f43994e.setVisibility(8);
                    this.f43997f.setVisibility(8);
                    this.h.setVisibility(8);
                }
                this.f44012n.setVisibility(8);
            }
            if (this.f43994e.getVisibility() == 0) {
                this.f43994e.f31783f = 0;
                i11 = 16;
            }
            if (this.f43997f.getVisibility() == 0) {
                this.f43997f.f31783f = i11;
                i11 += 16;
            }
            if (this.h.getVisibility() == 0) {
                this.h.f31783f = i11;
                i11 += 16;
            }
            if (this.f44012n.getVisibility() == 0) {
                this.f44012n.F = i11;
            }
            E();
        }
    }

    public final void D(boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xi1.D(boolean):void");
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
        this.f44008k0.setColor(i0.a.k(-16777216, (int) (this.f44029y0 * 102.0f * this.F0)));
        this.f44010l0.setColor(i0.a.k(-16777216, (int) (127.5f * this.F0)));
        si1 si1Var = this.f44019s;
        if (si1Var != null) {
            si1Var.invalidate();
        }
    }

    public final void G() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.ui.xi1.G():void");
    }

    @Override
    public final void a(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        org.telegram.ui.Components.voip.t2 t2Var = this.f43990c0;
        if (t2Var != null) {
            t2Var.d.clearFirstFrame();
        }
        this.f44011m1 = true;
        G();
        ((WindowManager) this.f43986b.getSystemService("window")).removeView(this.f44022u0);
        this.f44022u0.invalidate();
    }

    @Override
    public final void b(com.google.android.gms.internal.cast.p pVar) {
        this.l1 = pVar;
        pi1 pi1Var = this.f44022u0;
        pi1Var.getClass();
        ((WindowManager) this.f43986b.getSystemService("window")).addView(pi1Var, org.telegram.ui.Components.voip.x2.a());
        this.f44011m1 = false;
        G();
        this.f44022u0.invalidate();
        org.telegram.ui.Components.voip.t2 t2Var = this.f44009k1;
        if (t2Var != null) {
            t2Var.d.release();
            this.f44009k1 = null;
        }
    }

    @Override
    public final Bitmap c() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f44009k1;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f44009k1.d.getBitmap();
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
            if (this.f44015p0 == 17 && VoIPService.getSharedInstance() != null) {
                this.f43992d0.d.release();
                this.f43990c0.d.release();
                this.f43987b0.release();
                n();
                VoIPService.getSharedInstance().registerStateListener(this);
            }
        } else if (i10 == NotificationCenter.emojiLoaded) {
            D(true);
        } else if (i10 == NotificationCenter.closeInCallActivity) {
            this.f44022u0.b();
        } else if (i10 == NotificationCenter.webRtcSpeakerAmplitudeEvent) {
            this.f44028y.setAmplitude(((Float) objArr[0]).floatValue() * 15.0f);
        } else if (i10 == NotificationCenter.nearEarEvent) {
            boolean booleanValue = ((Boolean) objArr[0]).booleanValue();
            this.f43998f0 = booleanValue;
            if (booleanValue) {
                this.f44028y.b(true, true);
            }
        }
    }

    @Override
    public final Bitmap e() {
        org.telegram.ui.Components.voip.t2 t2Var = this.f43990c0;
        if (t2Var != null && t2Var.d.isAvailable()) {
            return this.f43990c0.d.getBitmap();
        }
        return null;
    }

    @Override
    public final boolean g() {
        return true;
    }

    @Override
    public final View h() {
        org.telegram.ui.Components.voip.t2 t2Var = new org.telegram.ui.Components.voip.t2(this.f43986b, false, true, false, false);
        this.f44009k1 = t2Var;
        t2Var.d.setScalingType(RendererCommon.ScalingType.SCALE_ASPECT_FIT);
        this.f44009k1.d.setEnableHardwareScaler(true);
        this.f44009k1.d.setRotateTextureWithScreen(true);
        org.telegram.ui.Components.voip.t2 t2Var2 = this.f44009k1;
        t2Var2.f31956a0 = 1;
        t2Var2.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ri1(this));
        View view = this.f44009k1.h;
        if (view != null) {
            view.setVisibility(8);
        }
        return this.f44009k1;
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
        float f19 = org.telegram.ui.Components.voip.n2.k().d.x + org.telegram.ui.Components.voip.n2.k().E;
        float f20 = org.telegram.ui.Components.voip.n2.k().d.y + org.telegram.ui.Components.voip.n2.k().F;
        final float x10 = this.Y.getX();
        final float y3 = this.Y.getY();
        final float scaleX = this.Y.getScaleX();
        org.telegram.ui.Components.voip.n2.V.getClass();
        final float measuredWidth = f19 - ((this.f43990c0.getMeasuredWidth() - (this.f43990c0.getMeasuredWidth() * 0.25f)) / 2.0f);
        final float measuredHeight2 = f20 - ((this.f43990c0.getMeasuredHeight() - (this.f43990c0.getMeasuredHeight() * 0.25f)) / 2.0f);
        final float f21 = 1.0f;
        if (this.m0) {
            int measuredWidth2 = this.Y.getMeasuredWidth();
            if (this.f44013n0 && measuredWidth2 != 0) {
                f18 = (this.f44022u0.getMeasuredWidth() / measuredWidth2) * 0.25f * 0.4f;
                c10 = 0;
                f17 = (((org.telegram.ui.Components.voip.n2.k().f31837f * 0.25f) + (f19 - ((this.Y.getMeasuredWidth() - (this.Y.getMeasuredWidth() * f18)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().f31837f * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
                measuredHeight = (((org.telegram.ui.Components.voip.n2.k().h * 0.25f) + (f20 - ((this.Y.getMeasuredHeight() - (this.Y.getMeasuredHeight() * f18)) / 2.0f))) - ((org.telegram.ui.Components.voip.n2.k().h * 0.25f) * 0.4f)) - AndroidUtilities.dp(4.0f);
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
            org.telegram.ui.Components.voip.n2.V.getClass();
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
            this.f43990c0.setScaleX(0.25f);
            this.f43990c0.setScaleY(0.25f);
            this.f43990c0.setTranslationX(measuredWidth);
            this.f43990c0.setTranslationY(measuredHeight2);
            f13 = 0.25f;
            this.f43990c0.setRoundCorners((AndroidUtilities.dp(6.0f) * f24) / 0.25f);
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
                xi1 xi1Var = xi1.this;
                xi1Var.F0 = f27;
                xi1Var.F();
                if (z11) {
                    float f28 = (f10 * floatValue) + (scaleX * f27);
                    xi1Var.Y.setScaleX(f28);
                    xi1Var.Y.setScaleY(f28);
                    xi1Var.Y.setTranslationX((f7 * floatValue) + (x10 * f27));
                    xi1Var.Y.setTranslationY((f23 * floatValue) + (y3 * f27));
                    xi1Var.Y.setCornerRadius((dp * floatValue) + (f25 * f27));
                    xi1Var.Y.setAlpha((f21 * floatValue) + (1.0f * f27));
                }
                float f29 = (f26 * floatValue) + (1.0f * f27);
                xi1Var.f43990c0.setScaleX(f29);
                xi1Var.f43990c0.setScaleY(f29);
                float f30 = 0.0f * f27;
                float f31 = (measuredWidth * floatValue) + f30;
                float f32 = (measuredHeight2 * floatValue) + f30;
                xi1Var.f43990c0.setTranslationX(f31);
                xi1Var.f43990c0.setTranslationY(f32);
                xi1Var.f43990c0.setRoundCorners(((AndroidUtilities.dp(4.0f) * floatValue) * 1.0f) / f29);
                if (!xi1Var.Y.P) {
                    xi1Var.f43992d0.d(floatValue, false);
                }
                xi1Var.f44022u0.invalidate();
            }
        });
        return ofFloat;
    }

    public final void k() {
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().unregisterStateListener(this);
        }
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.webRtcSpeakerAmplitudeEvent);
        NotificationCenter.getInstance(this.f43983a).removeObserver(this, NotificationCenter.voipServiceCreated);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.emojiLoaded);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.closeInCallActivity);
        NotificationCenter.getGlobalInstance().removeObserver(this, NotificationCenter.nearEarEvent);
        qf.e eVar = this.f44000g0;
        if (eVar != null) {
            eVar.c();
            this.f44000g0 = null;
        }
        tg.m1 m1Var = this.M;
        if (m1Var != null) {
            m1Var.dismiss();
            this.M = null;
        }
    }

    public final void l(boolean z10) {
        ValueAnimator ofFloat;
        if (this.B0 && this.C0 != z10 && this.f44027x0) {
            this.C0 = z10;
            org.telegram.ui.Components.voip.a3 a3Var = this.f44024w;
            if (a3Var.K && z10 != a3Var.E) {
                a3Var.E = z10;
                float[] fArr = {1.0f, 0.0f};
                if (z10) {
                    
                    fArr[0] = 0.0f;
                    fArr[1] = 1.0f;
                    ofFloat = ValueAnimator.ofFloat(fArr);
                } else {
                    ofFloat = ValueAnimator.ofFloat(fArr);
                }
                a3Var.f31581c = ofFloat;
                ofFloat.addUpdateListener(new org.telegram.ui.Components.voip.z2(a3Var, 1));
                a3Var.f31581c.setInterpolator(org.telegram.ui.Components.js.f27634f);
                a3Var.f31581c.setDuration(200L);
                a3Var.f31581c.start();
            }
            if (z10) {
                if (SharedConfig.callEncryptionHintDisplayedCount < 2) {
                    SharedConfig.incrementCallEncryptionHintDisplayed(2);
                }
                this.O0.e(true);
                AndroidUtilities.cancelRunOnUIThread(this.S0);
                this.R0 = false;
                if (this.f44028y.getVisibility() == 0) {
                    this.f44028y.animate().setStartDelay(0L).translationY(AndroidUtilities.dp(48.0f)).scaleY(0.1f).scaleX(0.1f).alpha(0.0f).setDuration(200L).setInterpolator(org.telegram.ui.Components.js.f27634f).start();
                }
                this.O.animate().setListener(null).cancel();
                this.O.setVisibility(0);
                this.O.setAlpha(0.0f);
                this.O.setScaleX(0.3f);
                this.O.setScaleY(0.3f);
                this.O.animate().alpha(1.0f).scaleY(1.0f).scaleX(1.0f).setDuration(340L).setInterpolator(org.telegram.ui.Components.js.f27635g).start();
                ViewPropertyAnimator translationY = this.N.animate().scaleX(1.72f).scaleY(1.72f).translationY(AndroidUtilities.dp(140.0f));
                org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27634f;
                org.telegram.messenger.am.t(translationY, jsVar, 400L);
                this.R.animate().setListener(null).cancel();
                this.R.setVisibility(0);
                this.R.setTranslationY(-AndroidUtilities.dp(120.0f));
                this.R.setScaleX(0.7f);
                this.R.setScaleY(0.7f);
                this.R.setAlpha(0.0f);
                this.R.animate().alpha(1.0f).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).setDuration(400L).setListener(new li1(this, 3)).setInterpolator(jsVar).start();
            } else {
                if (this.f44028y.getVisibility() == 0) {
                    this.f44028y.animate().setStartDelay(50L).translationY(0.0f).scaleX(1.0f).scaleY(1.0f).alpha(1.0f).setDuration(250L).setInterpolator(org.telegram.ui.Components.js.f27634f).start();
                }
                this.O.animate().setListener(null).cancel();
                ViewPropertyAnimator duration = this.O.animate().alpha(0.0f).scaleY(0.3f).scaleX(0.3f).setDuration(230L);
                org.telegram.ui.Components.js jsVar2 = org.telegram.ui.Components.js.f27634f;
                duration.setInterpolator(jsVar2).setListener(new org.telegram.ui.Components.ea(this.O)).start();
                this.N.animate().scaleX(1.0f).scaleY(1.0f).translationY(0.0f).setInterpolator(jsVar2).setDuration(280L).start();
                this.R.animate().setListener(null).cancel();
                this.R.animate().alpha(0.0f).scaleY(0.7f).scaleX(0.7f).translationY(-AndroidUtilities.dp(120.0f)).setListener(new li1(this, 4)).setDuration(250L).setInterpolator(jsVar2).start();
            }
            this.f44016q0 = this.f44015p0;
            G();
        }
    }

    public final void m() {
        this.f44022u0.b();
    }

    public final void n() {
        this.f43992d0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new mi1(this));
        this.f43990c0.d.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), new ni1(this), EglBase.CONFIG_PLAIN, new GlRectDrawer());
        this.f43987b0.init(VideoCapturerDevice.getEglBase().getEglBaseContext(), null);
    }

    public final void o() {
        if (!this.G0 && !this.E0) {
            qi1 qi1Var = this.f44014o0;
            if (qi1Var != null) {
                qi1Var.a(false, false);
            } else if (this.m0 && this.f44013n0 && this.H0) {
                this.H0 = false;
                this.Y.setRelativePosition(this.Z);
                this.f43984a0 = false;
                this.f44016q0 = this.f44015p0;
                G();
            } else if (this.C0) {
                l(false);
            } else if (this.R.getVisibility() == 8) {
                if (this.D0 && VoIPService.getSharedInstance() != null && !VoIPService.getSharedInstance().isConverting()) {
                    if (tf.c.a(this.f43986b) > 0) {
                        if (!this.G0 && f43982n1 != null) {
                            this.G0 = true;
                            if (VoIPService.getSharedInstance() != null) {
                                int measuredHeight = f43982n1.f44022u0.getMeasuredHeight();
                                xi1 xi1Var = f43982n1;
                                org.telegram.ui.Components.voip.n2.l(xi1Var.f43986b, xi1Var.f43983a, xi1Var.f44022u0.getMeasuredWidth(), measuredHeight, 1);
                                WindowInsets windowInsets = f43982n1.f44018r0;
                                if (windowInsets != null) {
                                    org.telegram.ui.Components.voip.n2.X = windowInsets.getSystemWindowInsetTop();
                                    f43982n1.f44018r0.getSystemWindowInsetBottom();
                                }
                            }
                            if (org.telegram.ui.Components.voip.n2.k() != null) {
                                ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).setDuration(150L);
                                org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27634f;
                                duration.setInterpolator(jsVar).start();
                                this.H.animate().alpha(0.0f).setDuration(150L).setInterpolator(jsVar).start();
                                this.I.animate().alpha(0.0f).setDuration(150L).setInterpolator(jsVar).start();
                                this.N.animate().alpha(0.0f).setDuration(150L).setInterpolator(jsVar).start();
                                this.X.animate().alpha(0.0f).setDuration(150L).setInterpolator(jsVar).start();
                                this.f44006j0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jsVar).start();
                                this.f44002h0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jsVar).start();
                                this.f44004i0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jsVar).start();
                                this.Z.animate().alpha(0.0f).setDuration(350L).setInterpolator(jsVar).start();
                                this.M0.animate().alpha(0.0f).setDuration(350L).setInterpolator(jsVar).start();
                                org.telegram.ui.Components.voip.n2.U = true;
                                this.E0 = true;
                                ValueAnimator j3 = j(false);
                                this.L0.lock();
                                j3.addListener(new li1(this, 1));
                                j3.setDuration(350L);
                                j3.setInterpolator(jsVar);
                                j3.start();
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    org.telegram.ui.Components.g5.A(this.f43986b, new fi1(this, 0), true).o();
                    return;
                }
                this.f44022u0.b();
            }
        }
    }

    @Override
    public final void onAudioSettingsChanged() {
        C(true);
    }

    @Override
    public final void onCameraFirstFrameAvailable() {
        org.telegram.messenger.voip.v0.b(this);
    }

    @Override
    public final void onCameraSwitch(boolean z10) {
        this.f44016q0 = this.f44015p0;
        G();
    }

    @Override
    public final void onMediaStateUpdated(int i10, int i11) {
        this.f44016q0 = this.f44015p0;
        if (i11 == 2 && !this.U0) {
            this.U0 = true;
        }
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getRemoteVideoState() == 2) {
            if (this.f44000g0 == null && tf.c.a(this.f43986b) == 1) {
                qf.d dVar = new qf.d(this.f43986b, f43982n1);
                dVar.f46098c = "voip-fragment-pip";
                org.telegram.ui.Components.voip.t2 t2Var = this.f43990c0;
                dVar.f46103j = t2Var.d;
                dVar.f46104k = t2Var.getPlaceholderView();
                this.f44000g0 = dVar.a();
            }
        } else {
            qf.e eVar = this.f44000g0;
            if (eVar != null) {
                eVar.c();
                this.f44000g0 = null;
            }
        }
        G();
    }

    @Override
    public final void onSignalBarsCountChanged(int i10) {
        org.telegram.ui.Components.voip.d3 d3Var;
        if (i10 > 0) {
            this.f44007j1 = true;
        }
        if (this.F != null && (d3Var = this.v) != null) {
            int i11 = d3Var.V;
            if ((i11 == 2 || i11 == 3) && this.f44007j1) {
                AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.nd(this, i10, 29), 400L);
            }
        }
    }

    @Override
    public final void onStateChanged(int i10) {
        int i11 = this.f44015p0;
        if (i11 != i10) {
            this.f44016q0 = i11;
            this.f44015p0 = i10;
            if (this.f44022u0 != null) {
                G();
            }
        }
    }

    @Override
    public final void onVideoAvailableChange(boolean z10) {
        this.f44016q0 = this.f44015p0;
        if (z10 && !this.U0) {
            this.U0 = true;
        }
        G();
    }

    public final void q(Runnable runnable) {
        if (this.f43997f.getVisibility() == 0) {
            this.f43995e0.getLocationOnScreen(new int[2]);
            org.telegram.ui.Components.voip.e eVar = this.f43995e0;
            ValueAnimator valueAnimator = eVar.f31632b0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                eVar.f31632b0 = null;
                eVar.U.stop();
            }
            runnable.run();
            return;
        }
        this.f44012n.animate().cancel();
        this.f43994e.animate().cancel();
        this.h.animate().cancel();
        this.f43997f.animate().cancel();
        this.f43995e0.getLocationOnScreen(new int[2]);
        org.telegram.ui.Components.voip.e eVar2 = this.f43995e0;
        ValueAnimator valueAnimator2 = eVar2.f31632b0;
        if (valueAnimator2 != null) {
            valueAnimator2.cancel();
            eVar2.f31632b0 = null;
            eVar2.U.stop();
        }
        this.f44012n.c(R.drawable.calls_decline, -1, -1041108, 1.0f, true, LocaleController.getString(R.string.VoipEndCall2), false, false);
        this.f43994e.d(5, false, false);
        this.h.d(1, false, false);
        this.f43997f.d(3, true, false);
        this.f44012n.setVisibility(0);
        this.f43994e.setVisibility(0);
        this.h.setVisibility(0);
        this.f43997f.setVisibility(0);
        this.f44012n.setAlpha(0.0f);
        this.f43994e.setAlpha(0.0f);
        this.h.setAlpha(0.0f);
        this.f43997f.setAlpha(0.0f);
        final ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f43995e0.getLayoutParams();
        final int marginEnd = marginLayoutParams.getMarginEnd();
        AndroidUtilities.dp(52.0f);
        final int dp = AndroidUtilities.dp(24.0f);
        final int dp2 = AndroidUtilities.dp(62.0f);
        AnimatorSet animatorSet = new AnimatorSet();
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
            @Override
            public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                xi1 xi1Var = xi1.this;
                xi1Var.getClass();
                float floatValue = ((Float) valueAnimator3.getAnimatedValue()).floatValue();
                xi1Var.f43995e0.setTranslationY(dp2 * floatValue);
                int i10 = marginEnd;
                int i11 = (int) (i10 - ((i10 + dp) * floatValue));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = marginLayoutParams;
                marginLayoutParams2.leftMargin = i11;
                marginLayoutParams2.rightMargin = i11;
                xi1Var.f43995e0.requestLayout();
            }
        });
        org.telegram.ui.Components.voip.e eVar3 = this.f43995e0;
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(eVar3, View.SCALE_X, eVar3.getScaleX(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar4 = this.f43995e0;
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(eVar4, View.SCALE_Y, eVar4.getScaleY(), 1.0f, 1.0f, 1.0f);
        org.telegram.ui.Components.voip.e eVar5 = this.f43995e0;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofFloat(eVar5, View.ALPHA, eVar5.getAlpha(), this.f43995e0.getAlpha(), 0.0f, 0.0f));
        animatorSet.setDuration(400L);
        animatorSet.setInterpolator(new LinearInterpolator());
        animatorSet.addListener(new org.telegram.ui.Components.am0(17, this, runnable));
        animatorSet.start();
        AndroidUtilities.runOnUIThread(new hi1(this, 7), 133L);
    }

    public final void r(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        if (!this.f44013n0) {
            l3Var.d(2, false, false);
            l3Var.setOnBtnClickedListener(null);
            l3Var.setEnabled(false);
            return;
        }
        l3Var.setEnabled(true);
        if (voIPService.isFrontFaceCamera()) {
            l3Var.d(2, true ^ voIPService.isSwitchingCamera(), false);
        } else {
            l3Var.d(2, voIPService.isSwitchingCamera(), false);
        }
        l3Var.setOnBtnClickedListener(new d7(this, voIPService, l3Var, 23));
    }

    public final void s(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        l3Var.d(1, voIPService.isMicMute(), false);
        org.telegram.ui.Components.voip.v1 v1Var = this.Y;
        boolean isMicMute = voIPService.isMicMute();
        float f7 = 0.0f;
        if (!z10) {
            ValueAnimator valueAnimator = v1Var.f32045f0;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            if (isMicMute) {
                f7 = 1.0f;
            }
            v1Var.K = f7;
            v1Var.invalidate();
        } else {
            ValueAnimator valueAnimator2 = v1Var.f32045f0;
            if (valueAnimator2 != null) {
                valueAnimator2.cancel();
            }
            float f10 = v1Var.K;
            if (isMicMute) {
                f7 = 1.0f;
            }
            ValueAnimator ofFloat = ValueAnimator.ofFloat(f10, f7);
            v1Var.f32045f0 = ofFloat;
            ofFloat.addUpdateListener(v1Var.f32046g0);
            v1Var.f32045f0.setDuration(150L);
            v1Var.f32045f0.start();
        }
        l3Var.setOnBtnClickedListener(new fi1(this, 5));
    }

    public final void t(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService) {
        int i10;
        VoipAudioManager voipAudioManager = VoipAudioManager.get();
        int i11 = 0;
        if (voIPService.isBluetoothOn()) {
            l3Var.d(4, false, false);
            i11 = 2;
        } else if (voipAudioManager.isSpeakerphoneOn()) {
            l3Var.d(5, true, false);
        } else {
            l3Var.d(5, false, false);
            i10 = 1;
            l3Var.setEnabled(true);
            l3Var.setOnBtnClickedListener(new ha(this, i10, l3Var, voIPService, 8));
        }
        i10 = i11;
        l3Var.setEnabled(true);
        l3Var.setOnBtnClickedListener(new ha(this, i10, l3Var, voIPService, 8));
    }

    public final void u(org.telegram.ui.Components.voip.l3 l3Var, VoIPService voIPService, boolean z10) {
        boolean z11;
        if (!this.f44013n0 && !this.m0) {
            z11 = voIPService.isVideoAvailable();
        } else {
            z11 = true;
        }
        if (z11) {
            if (this.f44013n0) {
                if (voIPService.isScreencast()) {
                    l3Var.d(3, false, z10);
                } else {
                    l3Var.d(3, false, z10);
                }
            } else {
                l3Var.d(3, true, z10);
            }
            l3Var.setOnBtnClickedListener(new fi1(this, 6));
            l3Var.setEnabled(true);
            return;
        }
        l3Var.d(3, true, false);
        l3Var.setOnClickListener(null);
        l3Var.setEnabled(false);
    }

    public final void w(boolean z10, boolean z11) {
        boolean z12;
        int i10 = 0;
        if (!this.f44013n0 && !this.m0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Integer num = null;
        if (z10) {
            if (z12 && this.f44028y.getTag() == null) {
                this.f44028y.animate().setListener(null).cancel();
                this.f44028y.setVisibility(0);
                if (!this.C0) {
                    if (z11) {
                        this.f44028y.setAlpha(0.0f);
                        this.f44028y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.js.f27634f).start();
                    } else {
                        this.f44028y.setAlpha(0.0f);
                        this.f44028y.setTranslationY(-AndroidUtilities.dp(135.0f));
                        this.f44028y.animate().alpha(1.0f).translationY(0.0f).scaleY(1.0f).scaleX(1.0f).setDuration(150L).setInterpolator(org.telegram.ui.Components.js.f27634f).start();
                    }
                } else if (z11) {
                    this.f44028y.setAlpha(0.0f);
                    this.f44028y.setTranslationY(AndroidUtilities.dp(48.0f));
                    this.f44028y.setScaleX(0.1f);
                    this.f44028y.setScaleY(0.1f);
                }
            } else if (!z12 && this.f44028y.getTag() != null) {
                this.f44028y.animate().setListener(null).cancel();
                this.f44028y.setTranslationY(0.0f);
                this.f44028y.animate().alpha(0.0f).setDuration(150L).scaleX(0.1f).scaleY(0.1f).setInterpolator(org.telegram.ui.Components.js.f27634f).setListener(new li1(this, 7)).start();
            }
        } else {
            this.f44028y.animate().setListener(null).cancel();
            this.f44028y.setTranslationY(0.0f);
            this.f44028y.setAlpha(1.0f);
            this.f44028y.setScaleX(1.0f);
            this.f44028y.setScaleY(1.0f);
            org.telegram.ui.Components.voip.u0 u0Var = this.f44028y;
            if (!z12) {
                i10 = 8;
            }
            u0Var.setVisibility(i10);
        }
        org.telegram.ui.Components.voip.u0 u0Var2 = this.f44028y;
        if (z12) {
            num = 1;
        }
        u0Var2.setTag(num);
    }

    public final void x(CharSequence charSequence) {
        TextView textView;
        if (this.f43986b.isFinishing()) {
            return;
        }
        org.telegram.ui.ActionBar.a2 a2Var = new org.telegram.ui.ActionBar.a2(this.f43986b, 0, null);
        boolean[] zArr = new boolean[3];
        a2Var.R = LocaleController.getString(R.string.VoipFailed);
        a2Var.T = charSequence;
        a2Var.f20169l0 = LocaleController.getString(R.string.OK);
        a2Var.m0 = null;
        a2Var.show();
        for (int i10 = 0; i10 < 3; i10++) {
            if (zArr[i10] && (textView = (TextView) a2Var.d(-(i10 + 1))) != null) {
                textView.setTextColor(a2Var.e(org.telegram.ui.ActionBar.h6.f20800q7));
            }
        }
        a2Var.setCanceledOnTouchOutside(true);
        a2Var.setOnDismissListener(new u5(this, 18));
    }

    public final void y(int i10, boolean z10) {
        boolean z11;
        boolean z12;
        AnimatorSet animatorSet;
        if (this.Y.getTag() == null || ((Integer) this.Y.getTag()).intValue() != 2) {
            this.Y.setUiVisible(this.f44027x0);
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
                    org.telegram.ui.Components.voip.v1 v1Var = this.Y;
                    animatorSet3.playTogether(ObjectAnimator.ofFloat(v1Var, View.ALPHA, v1Var.getAlpha(), 0.0f));
                    if (this.Y.getTag() != null && ((Integer) this.Y.getTag()).intValue() == 2) {
                        org.telegram.ui.Components.voip.v1 v1Var2 = this.Y;
                        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(v1Var2, View.SCALE_X, v1Var2.getScaleX(), 0.7f);
                        org.telegram.ui.Components.voip.v1 v1Var3 = this.Y;
                        animatorSet3.playTogether(ofFloat, ObjectAnimator.ofFloat(v1Var3, View.SCALE_Y, v1Var3.getScaleX(), 0.7f));
                    }
                    this.A0 = animatorSet3;
                    animatorSet3.addListener(new li1(this, 6));
                    this.A0.setDuration(250L).setInterpolator(org.telegram.ui.Components.js.f27634f);
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
                org.telegram.ui.Components.voip.v1 v1Var4 = this.Y;
                if (v1Var4.f32055y < 0.0f) {
                    v1Var4.d(1.0f, 1.0f);
                    this.f43984a0 = true;
                }
            }
            org.telegram.ui.Components.voip.v1 v1Var5 = this.Y;
            if (i10 == 2) {
                z12 = true;
            } else {
                z12 = false;
            }
            v1Var5.c(z12, z11);
            if (i10 == 2) {
                z13 = false;
            }
            this.f43984a0 = z13;
        }
        this.Y.setTag(Integer.valueOf(i10));
    }

    public final void z(boolean z10) {
        int i10;
        ValueAnimator valueAnimator = this.P0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        a21 a21Var = this.Q0;
        int i11 = 0;
        if (!z10 && this.f44027x0) {
            ViewPropertyAnimator duration = this.K.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L);
            org.telegram.ui.Components.js jsVar = org.telegram.ui.Components.js.f27634f;
            duration.setInterpolator(jsVar).start();
            this.H.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jsVar).start();
            this.I.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jsVar).start();
            this.N.animate().alpha(0.0f).translationY(-AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jsVar).start();
            this.E.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(jsVar).start();
            this.F.animate().alpha(0.0f).setDuration(150L).translationY(-AndroidUtilities.dp(10.0f)).setInterpolator(jsVar).start();
            this.f44006j0.animate().alpha(0.0f).translationY(AndroidUtilities.dp(10.0f)).setDuration(150L).setInterpolator(jsVar).start();
            this.f44002h0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jsVar).start();
            this.f44004i0.animate().alpha(0.0f).setDuration(150L).setInterpolator(jsVar).start();
            ValueAnimator ofFloat = ValueAnimator.ofFloat(this.f44029y0, 0.0f);
            this.P0 = ofFloat;
            ofFloat.addUpdateListener(a21Var);
            this.P0.setDuration(150L).setInterpolator(jsVar);
            this.P0.start();
            AndroidUtilities.cancelRunOnUIThread(this.S0);
            this.R0 = false;
            this.f44006j0.setEnabled(false);
            this.O0.e(true);
            i10 = 150;
        } else {
            if (z10 && !this.f44027x0) {
                this.N0.e(true);
                this.O0.e(true);
                ViewPropertyAnimator translationY = this.E.animate().alpha(1.0f).setDuration(150L).translationY(0.0f);
                org.telegram.ui.Components.js jsVar2 = org.telegram.ui.Components.js.f27634f;
                translationY.setInterpolator(jsVar2).start();
                this.F.animate().alpha(1.0f).setDuration(150L).translationY(0.0f).setInterpolator(jsVar2).start();
                this.K.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar2).start();
                this.H.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar2).start();
                this.I.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar2).start();
                this.N.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar2).start();
                this.f44006j0.animate().alpha(1.0f).translationY(0.0f).setDuration(150L).setInterpolator(jsVar2).start();
                this.f44002h0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar2).start();
                this.f44004i0.animate().alpha(1.0f).setDuration(150L).setInterpolator(jsVar2).start();
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(this.f44029y0, 1.0f);
                this.P0 = ofFloat2;
                ofFloat2.addUpdateListener(a21Var);
                this.P0.setDuration(150L).setInterpolator(jsVar2);
                this.P0.start();
                this.f44006j0.setEnabled(true);
            }
            i10 = 0;
        }
        this.f44027x0 = z10;
        pi1 pi1Var = this.f44022u0;
        if (!z10) {
            pi1Var.setSystemUiVisibility(pi1Var.getSystemUiVisibility() | 4);
        } else {
            pi1Var.setSystemUiVisibility(pi1Var.getSystemUiVisibility() & (-5));
        }
        ViewPropertyAnimator animate = this.M0.animate();
        int i12 = -AndroidUtilities.dp(16.0f);
        if (this.f44027x0) {
            i11 = AndroidUtilities.dp(80.0f);
        }
        animate.translationY(i12 - i11).setDuration(150L).setStartDelay(i10).setInterpolator(org.telegram.ui.Components.js.f27634f).start();
    }

    @Override
    public final void f(Canvas canvas) {
    }

    @Override
    public final void onScreenOnChange(boolean z10) {
    }
}
